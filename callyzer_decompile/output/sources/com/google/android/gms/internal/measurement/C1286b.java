package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import yh.AbstractC8662f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.b */
/* loaded from: classes.dex */
public final class C1286b {

    /* renamed from: d */
    public static final AbstractC8662f f6067d = AbstractC8662f.m16004k(3, "_syn", "_err", "_el");

    /* renamed from: a */
    public String f6068a;

    /* renamed from: b */
    public final long f6069b;

    /* renamed from: c */
    public final HashMap f6070c;

    public C1286b(String str, long j6, HashMap map) {
        this.f6068a = str;
        this.f6069b = j6;
        HashMap map2 = new HashMap();
        this.f6070c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* renamed from: b */
    public static Object m3132b(String str, Object obj, Object obj2) {
        if (f6067d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1286b clone() {
        return new C1286b(this.f6068a, this.f6069b, new HashMap(this.f6070c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1286b)) {
            return false;
        }
        C1286b c1286b = (C1286b) obj;
        if (this.f6069b == c1286b.f6069b && this.f6068a.equals(c1286b.f6068a)) {
            return this.f6070c.equals(c1286b.f6070c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6068a.hashCode() * 31;
        long j6 = this.f6069b;
        return this.f6070c.hashCode() + ((iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f6068a;
        String string = this.f6070c.toString();
        int length = String.valueOf(str).length();
        long j6 = this.f6069b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j6).length() + 9 + string.length() + 1);
        p020v.a1.m14318A(sb2, "Event{name='", str, "', timestamp=");
        sb2.append(j6);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
