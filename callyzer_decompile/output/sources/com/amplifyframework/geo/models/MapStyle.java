package com.amplifyframework.geo.models;

import com.sun.mail.util.AbstractC1452a;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MapStyle {
    private final String mapName;
    private final String style;

    public MapStyle(String str, String str2) {
        Objects.requireNonNull(str);
        this.mapName = str;
        Objects.requireNonNull(str2);
        this.style = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MapStyle.class == obj.getClass()) {
            MapStyle mapStyle = (MapStyle) obj;
            if (Objects.equals(this.mapName, mapStyle.mapName) && Objects.equals(this.style, mapStyle.style)) {
                return true;
            }
        }
        return false;
    }

    public String getMapName() {
        return this.mapName;
    }

    public String getStyle() {
        return this.style;
    }

    public int hashCode() {
        return Objects.hash(this.mapName, this.style);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MapStyle{mapName='");
        sb2.append(this.mapName);
        sb2.append("', style='");
        return AbstractC1452a.m4564k(sb2, this.style, "'}");
    }
}
