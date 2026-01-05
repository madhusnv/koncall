package kx;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kx.d */
/* loaded from: classes3.dex */
public final class C4262d implements InterfaceC4263e {

    /* renamed from: a */
    public final float f21644a;

    /* renamed from: b */
    public final float f21645b;

    public C4262d(float f6, float f10) {
        this.f21644a = f6;
        this.f21645b = f10;
    }

    /* renamed from: a */
    public final boolean m8983a() {
        return this.f21644a > this.f21645b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final boolean m8984b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4262d)) {
            return false;
        }
        if (m8983a() && ((C4262d) obj).m8983a()) {
            return true;
        }
        C4262d c4262d = (C4262d) obj;
        return this.f21644a == c4262d.f21644a && this.f21645b == c4262d.f21645b;
    }

    public final int hashCode() {
        if (m8983a()) {
            return -1;
        }
        return Float.hashCode(this.f21645b) + (Float.hashCode(this.f21644a) * 31);
    }

    public final String toString() {
        return this.f21644a + ".." + this.f21645b;
    }
}
