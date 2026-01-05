package j3;

import a1.C0005d;
import a2.C0036i;
import c3.C0850e;
import d3.C1559m;
import f3.C2196b;
import i0.m0;
import i3.AbstractC3166c;
import k2.C3953b;
import k2.b1;
import k2.e1;
import nf.C5047i;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends AbstractC3166c {

    /* renamed from: f */
    public final e1 f19052f = C3953b.m8517t(new C0850e(0));

    /* renamed from: g */
    public final e1 f19053g = C3953b.m8517t(Boolean.FALSE);

    /* renamed from: h */
    public final f0 f19054h;

    /* renamed from: j */
    public final b1 f19055j;

    /* renamed from: k */
    public float f19056k;

    /* renamed from: l */
    public C1559m f19057l;

    /* renamed from: m */
    public int f19058m;

    public j0(C3549c c3549c) {
        f0 f0Var = new f0(c3549c);
        f0Var.f19003f = new C0036i(20, this);
        this.f19054h = f0Var;
        this.f19055j = new b1(0);
        this.f19056k = 1.0f;
        this.f19058m = -1;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: a */
    public final boolean mo7531a(float f6) {
        this.f19056k = f6;
        return true;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: d */
    public final boolean mo7532d(C1559m c1559m) {
        this.f19057l = c1559m;
        return true;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: h */
    public final long mo7533h() {
        return ((C0850e) this.f19052f.getValue()).f5366a;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: i */
    public final void mo7534i(v3.i0 i0Var) {
        C2196b c2196b = i0Var.f36917a;
        C1559m c1559m = this.f19057l;
        f0 f0Var = this.f19054h;
        if (c1559m == null) {
            c1559m = (C1559m) f0Var.f19004g.getValue();
        }
        if (((Boolean) this.f19053g.getValue()).booleanValue() && i0Var.getLayoutDirection() == EnumC6757m.Rtl) {
            long jI0 = c2196b.i0();
            C0005d c0005d = c2196b.f10124b;
            long jM81z = c0005d.m81z();
            c0005d.m75t().mo5107i();
            try {
                ((C5047i) c0005d.f24b).m9984V(-1.0f, 1.0f, jI0);
                f0Var.m8092e(i0Var, this.f19056k, c1559m);
            } finally {
                m0.m7392y(c0005d, jM81z);
            }
        } else {
            f0Var.m8092e(i0Var, this.f19056k, c1559m);
        }
        this.f19058m = this.f19055j.m8526f();
    }
}
