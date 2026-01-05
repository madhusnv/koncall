package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f2310a;

    /* renamed from: b */
    public Object f2311b;

    /* renamed from: c */
    public final /* synthetic */ c1 f2312c;

    public d1(c1 c1Var, Comparable comparable, Object obj) {
        this.f2312c = c1Var;
        this.f2310a = comparable;
        this.f2311b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2310a.compareTo(((d1) obj).f2310a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f2310a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f2311b;
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
    public final Object getKey() {
        return this.f2310a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2311b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2310a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2311b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2312c.m855d();
        Object obj2 = this.f2311b;
        this.f2311b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2310a + "=" + this.f2311b;
    }
}
