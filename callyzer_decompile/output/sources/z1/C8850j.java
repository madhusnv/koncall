package z1;

import b2.y0;
import k2.C3953b;
import k2.e1;
import n1.AbstractC4941a;
import v3.InterfaceC7640l;
import v3.InterfaceC7641m;
import v3.InterfaceC7645q;
import v3.h1;
import w2.AbstractC7878q;
import x1.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.j */
/* loaded from: classes.dex */
public final class C8850j extends AbstractC7878q implements InterfaceC7640l, InterfaceC7645q, InterfaceC7641m {

    /* renamed from: q */
    public C8843c f42585q;

    /* renamed from: r */
    public v0 f42586r;

    /* renamed from: s */
    public y0 f42587s;

    /* renamed from: t */
    public final e1 f42588t = C3953b.m8517t(null);

    public C8850j(C8843c c8843c, v0 v0Var, y0 y0Var) {
        this.f42585q = c8843c;
        this.f42586r = v0Var;
        this.f42587s = y0Var;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        C8843c c8843c = this.f42585q;
        if (c8843c.f42561a != null) {
            AbstractC4941a.m9886c("Expected textInputModifierNode to be null");
        }
        c8843c.f42561a = this;
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        this.f42585q.m16309k(this);
    }

    @Override // v3.InterfaceC7645q
    /* renamed from: W */
    public final void mo7495W(h1 h1Var) {
        this.f42588t.setValue(h1Var);
    }
}
