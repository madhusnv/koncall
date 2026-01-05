package i1;

import a3.C0045d;
import c9.C0917l;
import ex.InterfaceC2141e;
import k1.C3938m;
import k2.C3953b;
import m1.C4631m;
import t2.AbstractC7013l;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 implements k1.q1 {

    /* renamed from: i */
    public static final C0917l f16952i;

    /* renamed from: a */
    public final k2.b1 f16953a;

    /* renamed from: e */
    public float f16957e;

    /* renamed from: b */
    public final k2.b1 f16954b = new k2.b1(0);

    /* renamed from: c */
    public final C4631m f16955c = new C4631m();

    /* renamed from: d */
    public final k2.b1 f16956d = new k2.b1(Integer.MAX_VALUE);

    /* renamed from: f */
    public final C3938m f16958f = new C3938m(new C0045d(16, this));

    /* renamed from: g */
    public final k2.c0 f16959g = C3953b.m8512o(new o1(this, 1));

    /* renamed from: h */
    public final k2.c0 f16960h = C3953b.m8512o(new o1(this, 0));

    static {
        C3134m c3134m = C3134m.f16923g;
        C0917l c0917l = AbstractC7013l.f33949a;
        f16952i = new C0917l(16, n1.f16935a, c3134m);
    }

    public p1(int i10) {
        this.f16953a = new k2.b1(i10);
    }

    @Override // k1.q1
    /* renamed from: a */
    public final boolean mo7520a() {
        return this.f16958f.mo7520a();
    }

    @Override // k1.q1
    /* renamed from: b */
    public final Object mo7521b(y0 y0Var, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        Object objMo7521b = this.f16958f.mo7521b(y0Var, interfaceC2141e, interfaceC7559c);
        return objMo7521b == EnumC7794a.COROUTINE_SUSPENDED ? objMo7521b : qw.a0.f30746a;
    }

    @Override // k1.q1
    /* renamed from: c */
    public final boolean mo7522c() {
        return ((Boolean) this.f16960h.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: d */
    public final boolean mo7523d() {
        return ((Boolean) this.f16959g.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: e */
    public final float mo7524e(float f6) {
        return this.f16958f.mo7524e(f6);
    }
}
