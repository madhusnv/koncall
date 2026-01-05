package com.amplifyframework.geo.models;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class Coordinates implements Geometry {
    private double latitude;
    private double longitude;

    public Coordinates() {
        this(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public double centralAngle(Coordinates coordinates) {
        double radians = Math.toRadians(this.latitude - coordinates.latitude);
        double d = radians / 2.0d;
        double radians2 = Math.toRadians(this.longitude - coordinates.longitude) / 2.0d;
        double dSin = (Math.sin(d) * Math.sin(d)) + (Math.sin(radians2) * Math.sin(radians2) * Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(coordinates.latitude)));
        return Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Coordinates.class != obj.getClass()) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj;
        return s6c.m47909a(Double.valueOf(this.latitude), Double.valueOf(coordinates.latitude)) && s6c.m47909a(Double.valueOf(this.longitude), Double.valueOf(coordinates.longitude));
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return s6c.m47910b(Double.valueOf(this.latitude), Double.valueOf(this.longitude));
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public String toString() {
        return "Coordinates{latitude=" + this.latitude + ", longitude=" + this.longitude + '}';
    }

    public Coordinates(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }
}
