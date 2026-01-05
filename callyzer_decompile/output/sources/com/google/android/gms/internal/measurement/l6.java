package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l6 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f6284a;

    /* renamed from: b */
    public Object f6285b;

    /* renamed from: c */
    public final /* synthetic */ k6 f6286c;

    public l6(k6 k6Var, Comparable comparable, Object obj) {
        this.f6286c = k6Var;
        this.f6284a = comparable;
        this.f6285b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f6284a.compareTo(((l6) obj).f6284a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f6284a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f6285b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f6284a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6285b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6284a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f6285b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6286c.m3477j();
        Object obj2 = this.f6285b;
        this.f6285b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6284a);
        String strValueOf2 = String.valueOf(this.f6285b);
        return p020v.a1.m14335o(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
