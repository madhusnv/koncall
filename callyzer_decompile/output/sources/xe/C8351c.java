package xe;

import af.C0137d;
import ee.C2039g;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;
import mj.InterfaceC4757e;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.c */
/* loaded from: classes.dex */
public final class C8351c implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8351c f39975a = new C8351c();

    /* renamed from: b */
    public static final C3777b f39976b;

    /* renamed from: c */
    public static final C3777b f39977c;

    static {
        C2039g c2039gM5753g = C2039g.m5753g();
        c2039gM5753g.f9605b = 1;
        f39976b = new C3777b("eventsDroppedCount", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g.m5758f())));
        C2039g c2039gM5753g2 = C2039g.m5753g();
        c2039gM5753g2.f9605b = 3;
        f39977c = new C3777b("reason", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g2.m5758f())));
    }

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        C0137d c0137d = (C0137d) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8305d(f39976b, c0137d.f439a);
        interfaceC3779d.mo8302a(f39977c, c0137d.f440b);
    }
}
