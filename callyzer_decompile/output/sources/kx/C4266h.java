package kx;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kx.h */
/* loaded from: classes3.dex */
public final class C4266h extends C4264f {

    /* renamed from: d */
    public static final C4266h f21653d = new C4266h(1, 0, 1);

    @Override // kx.C4264f
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4266h)) {
            return false;
        }
        if (isEmpty() && ((C4266h) obj).isEmpty()) {
            return true;
        }
        C4266h c4266h = (C4266h) obj;
        return this.f21646a == c4266h.f21646a && this.f21647b == c4266h.f21647b;
    }

    /* renamed from: h */
    public final boolean m8986h(int i10) {
        return this.f21646a <= i10 && i10 <= this.f21647b;
    }

    @Override // kx.C4264f
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f21646a * 31) + this.f21647b;
    }

    @Override // kx.C4264f
    public final boolean isEmpty() {
        return this.f21646a > this.f21647b;
    }

    @Override // kx.C4264f
    public final String toString() {
        return this.f21646a + ".." + this.f21647b;
    }
}
