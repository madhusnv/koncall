package com.amplifyframework.geo.models;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BoundingBox {
    private final double latitudeNE;
    private final double latitudeSW;
    private final double longitudeNE;
    private final double longitudeSW;

    public BoundingBox(Coordinates coordinates, Coordinates coordinates2) {
        this(coordinates.getLatitude(), coordinates.getLongitude(), coordinates2.getLatitude(), coordinates2.getLongitude());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BoundingBox.class == obj.getClass()) {
            BoundingBox boundingBox = (BoundingBox) obj;
            if (Double.valueOf(this.latitudeSW).equals(Double.valueOf(boundingBox.latitudeSW)) && Double.valueOf(this.longitudeSW).equals(Double.valueOf(boundingBox.longitudeSW)) && Double.valueOf(this.latitudeNE).equals(Double.valueOf(boundingBox.latitudeNE)) && Double.valueOf(this.longitudeNE).equals(Double.valueOf(boundingBox.longitudeNE))) {
                return true;
            }
        }
        return false;
    }

    public double getLatitudeNE() {
        return this.latitudeNE;
    }

    public double getLatitudeSW() {
        return this.latitudeSW;
    }

    public double getLongitudeNE() {
        return this.longitudeNE;
    }

    public double getLongitudeSW() {
        return this.longitudeSW;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.latitudeSW), Double.valueOf(this.longitudeSW), Double.valueOf(this.latitudeNE), Double.valueOf(this.longitudeNE));
    }

    public String toString() {
        return "BoundingBox{latitudeSW=" + this.latitudeSW + ", longitudeSW=" + this.longitudeSW + ", latitudeNE=" + this.latitudeNE + ", longitudeNE=" + this.longitudeNE + '}';
    }

    public BoundingBox(double d2, double d10, double d11, double d12) {
        this.latitudeSW = d2;
        this.longitudeSW = d10;
        this.latitudeNE = d11;
        this.longitudeNE = d12;
    }
}
