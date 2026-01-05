package g2;

import og.ze;
import p3.C5812j;
import p3.EnumC5813k;
import uw.InterfaceC7559c;
import v3.AbstractC7642n;
import v3.InterfaceC7640l;
import v3.InterfaceC7651w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u1 extends AbstractC7642n implements v3.u1, InterfaceC7640l, InterfaceC7651w {

    /* renamed from: B */
    public final p3.h0 f12822B;

    /* renamed from: s */
    public C2460n f12823s;

    /* renamed from: t */
    public boolean f12824t;

    /* renamed from: v */
    public int f12825v;

    /* renamed from: w */
    public float f12826w;

    /* renamed from: x */
    public float f12827x;

    /* renamed from: y */
    public long f12828y = 0;

    /* renamed from: z */
    public final p3.h0 f12829z;

    public u1(C2460n c2460n, boolean z6, int i10) {
        this.f12823s = c2460n;
        this.f12824t = z6;
        this.f12825v = i10;
        InterfaceC7559c interfaceC7559c = null;
        s1 s1Var = new s1(this, interfaceC7559c, 1);
        C5812j c5812j = p3.b0.f28413a;
        p3.c0 c0Var = p3.c0.f28422a;
        p3.h0 h0Var = new p3.h0(null, null, c0Var);
        h0Var.f28458s = s1Var;
        L0(h0Var);
        this.f12829z = h0Var;
        s1 s1Var2 = new s1(this, interfaceC7559c, 0);
        p3.h0 h0Var2 = new p3.h0(null, null, c0Var);
        h0Var2.f28458s = s1Var2;
        L0(h0Var2);
        this.f12822B = h0Var2;
    }

    @Override // v3.u1
    /* renamed from: S */
    public final void mo6316S(C5812j c5812j, EnumC5813k enumC5813k, long j6) {
        this.f12829z.mo6316S(c5812j, enumC5813k, j6);
        this.f12822B.mo6316S(c5812j, enumC5813k, j6);
    }

    @Override // v3.InterfaceC7651w
    /* renamed from: k */
    public final void mo5878k(long j6) {
        this.f12828y = ze.m11096b(j6);
    }

    @Override // v3.u1
    /* renamed from: x */
    public final void mo6317x() {
        this.f12829z.mo6317x();
        this.f12822B.mo6317x();
    }
}
