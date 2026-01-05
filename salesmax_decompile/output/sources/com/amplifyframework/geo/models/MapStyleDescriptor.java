package com.amplifyframework.geo.models;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class MapStyleDescriptor {
    private final String json;

    public MapStyleDescriptor(String str) {
        Objects.requireNonNull(str);
        this.json = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapStyleDescriptor.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(this.json, ((MapStyleDescriptor) obj).json);
    }

    public String getJson() {
        return this.json;
    }

    public int hashCode() {
        return s6c.m47910b(this.json);
    }

    public String toString() {
        return "MapStyleDescriptor{json='" + this.json + "'}";
    }
}
