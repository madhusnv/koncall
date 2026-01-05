package x1;

import ex.InterfaceC2141e;
import k2.C3953b;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 implements k1.q1 {

    /* renamed from: a */
    public final /* synthetic */ k1.q1 f39614a;

    /* renamed from: b */
    public final k2.c0 f39615b;

    /* renamed from: c */
    public final k2.c0 f39616c;

    public n1(k1.q1 q1Var, p1 p1Var) {
        this.f39614a = q1Var;
        this.f39615b = C3953b.m8512o(new m1(p1Var, 1));
        this.f39616c = C3953b.m8512o(new m1(p1Var, 0));
    }

    @Override // k1.q1
    /* renamed from: a */
    public final boolean mo7520a() {
        return this.f39614a.mo7520a();
    }

    @Override // k1.q1
    /* renamed from: b */
    public final Object mo7521b(i1.y0 y0Var, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        return this.f39614a.mo7521b(y0Var, interfaceC2141e, interfaceC7559c);
    }

    @Override // k1.q1
    /* renamed from: c */
    public final boolean mo7522c() {
        return ((Boolean) this.f39616c.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: d */
    public final boolean mo7523d() {
        return ((Boolean) this.f39615b.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: e */
    public final float mo7524e(float f6) {
        return this.f39614a.mo7524e(f6);
    }
}
