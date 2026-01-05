package i3;

import d3.C1559m;
import d3.C1565s;
import f3.InterfaceC2198d;
import v3.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i3.b */
/* loaded from: classes.dex */
public final class C3165b extends AbstractC3166c {

    /* renamed from: f */
    public final long f17085f;

    /* renamed from: h */
    public C1559m f17087h;

    /* renamed from: g */
    public float f17086g = 1.0f;

    /* renamed from: j */
    public final long f17088j = 9205357640488583168L;

    public C3165b(long j6) {
        this.f17085f = j6;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: a */
    public final boolean mo7531a(float f6) {
        this.f17086g = f6;
        return true;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: d */
    public final boolean mo7532d(C1559m c1559m) {
        this.f17087h = c1559m;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3165b) {
            return C1565s.m5187c(this.f17085f, ((C3165b) obj).f17085f);
        }
        return false;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: h */
    public final long mo7533h() {
        return this.f17088j;
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f17085f);
    }

    @Override // i3.AbstractC3166c
    /* renamed from: i */
    public final void mo7534i(i0 i0Var) {
        InterfaceC2198d.o0(i0Var, this.f17085f, 0L, 0L, this.f17086g, this.f17087h, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) C1565s.m5193i(this.f17085f)) + ')';
    }
}
