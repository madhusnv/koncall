package com.amplifyframework.geo.models;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class Place {
    private final Geometry geometry;

    public Place(Geometry geometry) {
        this.geometry = geometry;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.geometry, ((Place) obj).geometry);
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public int hashCode() {
        return Objects.hash(this.geometry);
    }

    public String toString() {
        return "Place{geometry=" + this.geometry + '}';
    }
}
