package com.eslammongy.asteroidradar.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AsteroidsDatabase_Impl extends AsteroidsDatabase {
  private volatile AsteroidDao _asteroidDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `asteroids_table` (`id` INTEGER NOT NULL, `codename` TEXT NOT NULL, `closeApproachDate` TEXT NOT NULL, `absoluteMagnitude` REAL NOT NULL, `estimatedDiameter` REAL NOT NULL, `relativeVelocity` REAL NOT NULL, `distanceFromEarth` REAL NOT NULL, `isPotentiallyHazardous` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9000a4a579cee0d8d1bca51c197b6838')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `asteroids_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAsteroidsTable = new HashMap<String, TableInfo.Column>(8);
        _columnsAsteroidsTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroidsTable.put("codename", new TableInfo.Column("codename", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroidsTable.put("closeApproachDate", new TableInfo.Column("closeApproachDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroidsTable.put("absoluteMagnitude", new TableInfo.Column("absoluteMagnitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroidsTable.put("estimatedDiameter", new TableInfo.Column("estimatedDiameter", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroidsTable.put("relativeVelocity", new TableInfo.Column("relativeVelocity", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroidsTable.put("distanceFromEarth", new TableInfo.Column("distanceFromEarth", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroidsTable.put("isPotentiallyHazardous", new TableInfo.Column("isPotentiallyHazardous", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAsteroidsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAsteroidsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAsteroidsTable = new TableInfo("asteroids_table", _columnsAsteroidsTable, _foreignKeysAsteroidsTable, _indicesAsteroidsTable);
        final TableInfo _existingAsteroidsTable = TableInfo.read(_db, "asteroids_table");
        if (! _infoAsteroidsTable.equals(_existingAsteroidsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "asteroids_table(com.eslammongy.asteroidradar.database.DatabaseAsteroid).\n"
                  + " Expected:\n" + _infoAsteroidsTable + "\n"
                  + " Found:\n" + _existingAsteroidsTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "9000a4a579cee0d8d1bca51c197b6838", "8d141a0a045f1020f1bd0c332913e038");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "asteroids_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `asteroids_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AsteroidDao.class, AsteroidDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public AsteroidDao getAsteroidDao() {
    if (_asteroidDao != null) {
      return _asteroidDao;
    } else {
      synchronized(this) {
        if(_asteroidDao == null) {
          _asteroidDao = new AsteroidDao_Impl(this);
        }
        return _asteroidDao;
      }
    }
  }
}
