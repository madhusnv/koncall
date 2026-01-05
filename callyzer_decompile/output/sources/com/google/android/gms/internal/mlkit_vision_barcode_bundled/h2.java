package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h2 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f6551a;

    /* renamed from: b */
    public Object f6552b;

    /* renamed from: c */
    public final /* synthetic */ g2 f6553c;

    public h2(g2 g2Var, Comparable comparable, Object obj) {
        this.f6553c = g2Var;
        this.f6551a = comparable;
        this.f6552b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f6551a.compareTo(((h2) obj).f6551a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f6551a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f6552b;
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
        return this.f6551a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6552b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6551a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f6552b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6553c.m3890l();
        Object obj2 = this.f6552b;
        this.f6552b = obj;
        return obj2;
    }

    public final String toString() {
        return i0.m0.m7379l(String.valueOf(this.f6551a), "=", String.valueOf(this.f6552b));
    }
}
