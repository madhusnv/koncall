package com.amplifyframework.geo.models;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Coordinates implements Geometry {
    private double latitude;
    private double longitude;

    public Coordinates() {
        this(0.0d, 0.0d);
    }

    public double centralAngle(Coordinates coordinates) {
        double radians = Math.toRadians(this.latitude - coordinates.latitude);
        double radians2 = Math.toRadians(this.longitude - coordinates.longitude);
        double d2 = radians / 2.0d;
        double d10 = radians2 / 2.0d;
        double dCos = (Math.cos(Math.toRadians(coordinates.latitude)) * Math.cos(Math.toRadians(this.latitude)) * Math.sin(d10) * Math.sin(d10)) + (Math.sin(d2) * Math.sin(d2));
        return Math.atan2(Math.sqrt(dCos), Math.sqrt(1.0d - dCos)) * 2.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Coordinates.class == obj.getClass()) {
            Coordinates coordinates = (Coordinates) obj;
            if (Double.valueOf(this.latitude).equals(Double.valueOf(coordinates.latitude)) && Double.valueOf(this.longitude).equals(Double.valueOf(coordinates.longitude))) {
                return true;
            }
        }
        return false;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.latitude), Double.valueOf(this.longitude));
    }

    public void setLatitude(double d2) {
        this.latitude = d2;
    }

    public void setLongitude(double d2) {
        this.longitude = d2;
    }

    public String toString() {
        return "Coordinates{latitude=" + this.latitude + ", longitude=" + this.longitude + '}';
    }

    public Coordinates(double d2, double d10) {
        this.latitude = d2;
        this.longitude = d10;
    }
}
