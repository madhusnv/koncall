package com.amplifyframework.geo.models;

import p001o.s6c;

/* loaded from: classes5.dex */
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
        return s6c.m47909a(this.geometry, ((Place) obj).geometry);
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public int hashCode() {
        return s6c.m47910b(this.geometry);
    }

    public String toString() {
        return "Place{geometry=" + this.geometry + '}';
    }
}
