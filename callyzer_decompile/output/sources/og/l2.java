package og;

import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l2 implements InterfaceC3778c {

    /* renamed from: a */
    public static final l2 f26607a = new l2();

    /* renamed from: b */
    public static final C3777b f26608b = new C3777b("logEventKey", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(1, m0.DEFAULT))));

    /* renamed from: c */
    public static final C3777b f26609c = new C3777b("eventCount", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(2, m0.DEFAULT))));

    /* renamed from: d */
    public static final C3777b f26610d = new C3777b("inferenceDurationStats", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(3, m0.DEFAULT))));

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8302a(f26608b, x0Var.f26933a);
        interfaceC3779d.mo8302a(f26609c, x0Var.f26934b);
        interfaceC3779d.mo8302a(f26610d, x0Var.f26935c);
    }
}
