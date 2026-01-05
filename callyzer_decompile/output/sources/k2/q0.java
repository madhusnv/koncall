package k2;

import ex.InterfaceC2141e;
import uw.InterfaceC7564h;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 implements r1 {

    /* renamed from: a */
    public final InterfaceC2141e f20513a;

    /* renamed from: b */
    public final C8810d f20514b;

    /* renamed from: c */
    public tx.s1 f20515c;

    public q0(InterfaceC7564h interfaceC7564h, InterfaceC2141e interfaceC2141e) {
        this.f20513a = interfaceC2141e;
        this.f20514b = tx.c0.m13479b(interfaceC7564h);
    }

    @Override // k2.r1
    /* renamed from: b */
    public final void mo5874b() {
        tx.s1 s1Var = this.f20515c;
        if (s1Var != null) {
            s1Var.mo13566p(new h0(1));
        }
        this.f20515c = null;
    }

    @Override // k2.r1
    /* renamed from: c */
    public final void mo5875c() {
        tx.s1 s1Var = this.f20515c;
        if (s1Var != null) {
            s1Var.mo13566p(new h0(1));
        }
        this.f20515c = null;
    }

    @Override // k2.r1
    /* renamed from: e */
    public final void mo5876e() {
        tx.s1 s1Var = this.f20515c;
        if (s1Var != null) {
            s1Var.mo13510j(tx.c0.m13478a("Old job was still running!", null));
        }
        this.f20515c = tx.c0.m13502y(this.f20514b, null, null, this.f20513a, 3);
    }
}
