package og;

import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e5 implements InterfaceC3778c {

    /* renamed from: a */
    public static final e5 f26391a = new e5();

    /* renamed from: b */
    public static final C3777b f26392b = new C3777b("maxMs", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(1, m0.DEFAULT))));

    /* renamed from: c */
    public static final C3777b f26393c = new C3777b("minMs", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(2, m0.DEFAULT))));

    /* renamed from: d */
    public static final C3777b f26394d = new C3777b("avgMs", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(3, m0.DEFAULT))));

    /* renamed from: e */
    public static final C3777b f26395e = new C3777b("firstQuartileMs", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(4, m0.DEFAULT))));

    /* renamed from: f */
    public static final C3777b f26396f = new C3777b("medianMs", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(5, m0.DEFAULT))));

    /* renamed from: g */
    public static final C3777b f26397g = new C3777b("thirdQuartileMs", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(6, m0.DEFAULT))));

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        kb kbVar = (kb) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8302a(f26392b, kbVar.f26590a);
        interfaceC3779d.mo8302a(f26393c, kbVar.f26591b);
        interfaceC3779d.mo8302a(f26394d, kbVar.f26592c);
        interfaceC3779d.mo8302a(f26395e, kbVar.f26593d);
        interfaceC3779d.mo8302a(f26396f, kbVar.f26594e);
        interfaceC3779d.mo8302a(f26397g, kbVar.f26595f);
    }
}
