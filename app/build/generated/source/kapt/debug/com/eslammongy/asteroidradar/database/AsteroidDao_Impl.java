package com.eslammongy.asteroidradar.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AsteroidDao_Impl implements AsteroidDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DatabaseAsteroid> __insertionAdapterOfDatabaseAsteroid;

  private final SharedSQLiteStatement __preparedStmtOfDeletePreviousDayAsteroids;

  public AsteroidDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDatabaseAsteroid = new EntityInsertionAdapter<DatabaseAsteroid>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `asteroids_table` (`id`,`codename`,`closeApproachDate`,`absoluteMagnitude`,`estimatedDiameter`,`relativeVelocity`,`distanceFromEarth`,`isPotentiallyHazardous`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseAsteroid value) {
        stmt.bindLong(1, value.getId());
        if (value.getCodename() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCodename());
        }
        if (value.getCloseApproachDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCloseApproachDate());
        }
        stmt.bindDouble(4, value.getAbsoluteMagnitude());
        stmt.bindDouble(5, value.getEstimatedDiameter());
        stmt.bindDouble(6, value.getRelativeVelocity());
        stmt.bindDouble(7, value.getDistanceFromEarth());
        final int _tmp = value.isPotentiallyHazardous() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__preparedStmtOfDeletePreviousDayAsteroids = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM asteroids_table WHERE closeApproachDate == ?";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final DatabaseAsteroid... asteroid) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDatabaseAsteroid.insert(asteroid);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletePreviousDayAsteroids(final String date) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePreviousDayAsteroids.acquire();
    int _argIndex = 1;
    if (date == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, date);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeletePreviousDayAsteroids.release(_stmt);
    }
  }

  @Override
  public LiveData<List<DatabaseAsteroid>> getAsteroid() {
    final String _sql = "SELECT * FROM asteroids_table ORDER BY closeApproachDate ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"asteroids_table"}, false, new Callable<List<DatabaseAsteroid>>() {
      @Override
      public List<DatabaseAsteroid> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "closeApproachDate");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absoluteMagnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimatedDiameter");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relativeVelocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceFromEarth");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "isPotentiallyHazardous");
          final List<DatabaseAsteroid> _result = new ArrayList<DatabaseAsteroid>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseAsteroid _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCodename;
            if (_cursor.isNull(_cursorIndexOfCodename)) {
              _tmpCodename = null;
            } else {
              _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            }
            final String _tmpCloseApproachDate;
            if (_cursor.isNull(_cursorIndexOfCloseApproachDate)) {
              _tmpCloseApproachDate = null;
            } else {
              _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            }
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            _item = new DatabaseAsteroid(_tmpId,_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpIsPotentiallyHazardous);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<DatabaseAsteroid>> getWeekAsteroids(final String startDate,
      final String endDate) {
    final String _sql = "SELECT * FROM asteroids_table WHERE closeApproachDate  BETWEEN ? AND ? ORDER BY closeApproachDate ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (startDate == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, startDate);
    }
    _argIndex = 2;
    if (endDate == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, endDate);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"asteroids_table"}, false, new Callable<List<DatabaseAsteroid>>() {
      @Override
      public List<DatabaseAsteroid> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "closeApproachDate");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absoluteMagnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimatedDiameter");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relativeVelocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceFromEarth");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "isPotentiallyHazardous");
          final List<DatabaseAsteroid> _result = new ArrayList<DatabaseAsteroid>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseAsteroid _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCodename;
            if (_cursor.isNull(_cursorIndexOfCodename)) {
              _tmpCodename = null;
            } else {
              _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            }
            final String _tmpCloseApproachDate;
            if (_cursor.isNull(_cursorIndexOfCloseApproachDate)) {
              _tmpCloseApproachDate = null;
            } else {
              _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            }
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            _item = new DatabaseAsteroid(_tmpId,_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpIsPotentiallyHazardous);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<DatabaseAsteroid>> getTodayAsteroids(final String todayDate) {
    final String _sql = "SELECT * FROM asteroids_table WHERE closeApproachDate == ? ORDER BY closeApproachDate ASC ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (todayDate == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, todayDate);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"asteroids_table"}, false, new Callable<List<DatabaseAsteroid>>() {
      @Override
      public List<DatabaseAsteroid> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "closeApproachDate");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absoluteMagnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimatedDiameter");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relativeVelocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceFromEarth");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "isPotentiallyHazardous");
          final List<DatabaseAsteroid> _result = new ArrayList<DatabaseAsteroid>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseAsteroid _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCodename;
            if (_cursor.isNull(_cursorIndexOfCodename)) {
              _tmpCodename = null;
            } else {
              _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            }
            final String _tmpCloseApproachDate;
            if (_cursor.isNull(_cursorIndexOfCloseApproachDate)) {
              _tmpCloseApproachDate = null;
            } else {
              _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            }
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            _item = new DatabaseAsteroid(_tmpId,_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpIsPotentiallyHazardous);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
