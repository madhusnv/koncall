package p015q;

import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q.c */
/* loaded from: classes.dex */
public final class C6056c implements Map.Entry {

    /* renamed from: a */
    public final Object f29549a;

    /* renamed from: b */
    public final Object f29550b;

    /* renamed from: c */
    public C6056c f29551c;

    /* renamed from: d */
    public C6056c f29552d;

    public C6056c(Object obj, Object obj2) {
        this.f29549a = obj;
        this.f29550b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6056c)) {
            return false;
        }
        C6056c c6056c = (C6056c) obj;
        return this.f29549a.equals(c6056c.f29549a) && this.f29550b.equals(c6056c.f29550b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f29549a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29550b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f29549a.hashCode() ^ this.f29550b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f29549a + "=" + this.f29550b;
    }
}
