package com.eslammongy.asteroidradar.database;

import java.lang.System;

@androidx.room.Entity(tableName = "asteroids_table")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\rH\u00c6\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010\u00a8\u0006("}, d2 = {"Lcom/eslammongy/asteroidradar/database/DatabaseAsteroid;", "", "id", "", "codename", "", "closeApproachDate", "absoluteMagnitude", "", "estimatedDiameter", "relativeVelocity", "distanceFromEarth", "isPotentiallyHazardous", "", "(JLjava/lang/String;Ljava/lang/String;DDDDZ)V", "getAbsoluteMagnitude", "()D", "getCloseApproachDate", "()Ljava/lang/String;", "getCodename", "getDistanceFromEarth", "getEstimatedDiameter", "getId", "()J", "()Z", "getRelativeVelocity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class DatabaseAsteroid {
    @androidx.room.PrimaryKey()
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String codename = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String closeApproachDate = null;
    private final double absoluteMagnitude = 0.0;
    private final double estimatedDiameter = 0.0;
    private final double relativeVelocity = 0.0;
    private final double distanceFromEarth = 0.0;
    private final boolean isPotentiallyHazardous = false;
    
    @org.jetbrains.annotations.NotNull()
    public final com.eslammongy.asteroidradar.database.DatabaseAsteroid copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String codename, @org.jetbrains.annotations.NotNull()
    java.lang.String closeApproachDate, double absoluteMagnitude, double estimatedDiameter, double relativeVelocity, double distanceFromEarth, boolean isPotentiallyHazardous) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public DatabaseAsteroid(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String codename, @org.jetbrains.annotations.NotNull()
    java.lang.String closeApproachDate, double absoluteMagnitude, double estimatedDiameter, double relativeVelocity, double distanceFromEarth, boolean isPotentiallyHazardous) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCodename() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCloseApproachDate() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getAbsoluteMagnitude() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getEstimatedDiameter() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getRelativeVelocity() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getDistanceFromEarth() {
        return 0.0;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean isPotentiallyHazardous() {
        return false;
    }
}