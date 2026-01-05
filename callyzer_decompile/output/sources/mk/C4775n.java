package mk;

import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.n */
/* loaded from: classes.dex */
public final class C4775n implements Map.Entry {

    /* renamed from: a */
    public C4775n f23797a;

    /* renamed from: b */
    public C4775n f23798b;

    /* renamed from: c */
    public C4775n f23799c;

    /* renamed from: d */
    public C4775n f23800d;

    /* renamed from: e */
    public C4775n f23801e;

    /* renamed from: f */
    public final Object f23802f;

    /* renamed from: g */
    public final boolean f23803g;

    /* renamed from: h */
    public Object f23804h;

    /* renamed from: j */
    public int f23805j;

    public C4775n(boolean z6) {
        this.f23802f = null;
        this.f23803g = z6;
        this.f23801e = this;
        this.f23800d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f23802f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f23804h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f23802f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f23804h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f23802f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f23804h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f23803g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f23804h;
        this.f23804h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f23802f + "=" + this.f23804h;
    }

    public C4775n(boolean z6, C4775n c4775n, Object obj, C4775n c4775n2, C4775n c4775n3) {
        this.f23797a = c4775n;
        this.f23802f = obj;
        this.f23803g = z6;
        this.f23805j = 1;
        this.f23800d = c4775n2;
        this.f23801e = c4775n3;
        c4775n3.f23800d = this;
        c4775n2.f23801e = this;
    }
}
