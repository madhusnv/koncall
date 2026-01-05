package i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i0.h */
/* loaded from: classes.dex */
public final class C3077h {

    /* renamed from: a */
    public final Object f16476a;

    public C3077h(Object obj) {
        this.f16476a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3077h) {
            return this.f16476a.equals(((C3077h) obj).f16476a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16476a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f16476a + "}";
    }
}
