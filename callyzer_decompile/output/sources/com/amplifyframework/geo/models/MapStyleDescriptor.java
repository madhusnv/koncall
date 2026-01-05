package com.amplifyframework.geo.models;

import com.sun.mail.util.AbstractC1452a;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        return Objects.equals(this.json, ((MapStyleDescriptor) obj).json);
    }

    public String getJson() {
        return this.json;
    }

    public int hashCode() {
        return Objects.hash(this.json);
    }

    public String toString() {
        return AbstractC1452a.m4564k(new StringBuilder("MapStyleDescriptor{json='"), this.json, "'}");
    }
}
