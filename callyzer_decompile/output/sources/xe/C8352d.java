package xe;

import af.C0138e;
import ee.C2039g;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;
import mj.InterfaceC4757e;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.d */
/* loaded from: classes.dex */
public final class C8352d implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8352d f39978a = new C8352d();

    /* renamed from: b */
    public static final C3777b f39979b;

    /* renamed from: c */
    public static final C3777b f39980c;

    static {
        C2039g c2039gM5753g = C2039g.m5753g();
        c2039gM5753g.f9605b = 1;
        f39979b = new C3777b("logSource", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g.m5758f())));
        C2039g c2039gM5753g2 = C2039g.m5753g();
        c2039gM5753g2.f9605b = 2;
        f39980c = new C3777b("logEventDropped", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g2.m5758f())));
    }

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        C0138e c0138e = (C0138e) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8302a(f39979b, c0138e.f442a);
        interfaceC3779d.mo8302a(f39980c, c0138e.f443b);
    }
}
