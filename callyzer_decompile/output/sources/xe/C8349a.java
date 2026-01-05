package xe;

import af.C0134a;
import ee.C2039g;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;
import mj.InterfaceC4757e;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.a */
/* loaded from: classes.dex */
public final class C8349a implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8349a f39968a = new C8349a();

    /* renamed from: b */
    public static final C3777b f39969b;

    /* renamed from: c */
    public static final C3777b f39970c;

    /* renamed from: d */
    public static final C3777b f39971d;

    /* renamed from: e */
    public static final C3777b f39972e;

    static {
        C2039g c2039gM5753g = C2039g.m5753g();
        c2039gM5753g.f9605b = 1;
        f39969b = new C3777b("window", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g.m5758f())));
        C2039g c2039gM5753g2 = C2039g.m5753g();
        c2039gM5753g2.f9605b = 2;
        f39970c = new C3777b("logSourceMetrics", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g2.m5758f())));
        C2039g c2039gM5753g3 = C2039g.m5753g();
        c2039gM5753g3.f9605b = 3;
        f39971d = new C3777b("globalMetrics", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g3.m5758f())));
        C2039g c2039gM5753g4 = C2039g.m5753g();
        c2039gM5753g4.f9605b = 4;
        f39972e = new C3777b("appNamespace", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g4.m5758f())));
    }

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        C0134a c0134a = (C0134a) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8302a(f39969b, c0134a.f434a);
        interfaceC3779d.mo8302a(f39970c, c0134a.f435b);
        interfaceC3779d.mo8302a(f39971d, c0134a.f436c);
        interfaceC3779d.mo8302a(f39972e, c0134a.f437d);
    }
}
