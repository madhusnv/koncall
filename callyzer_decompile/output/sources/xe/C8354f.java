package xe;

import af.C0139f;
import ee.C2039g;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;
import mj.InterfaceC4757e;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.f */
/* loaded from: classes.dex */
public final class C8354f implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8354f f39982a = new C8354f();

    /* renamed from: b */
    public static final C3777b f39983b;

    /* renamed from: c */
    public static final C3777b f39984c;

    static {
        C2039g c2039gM5753g = C2039g.m5753g();
        c2039gM5753g.f9605b = 1;
        f39983b = new C3777b("currentCacheSizeBytes", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g.m5758f())));
        C2039g c2039gM5753g2 = C2039g.m5753g();
        c2039gM5753g2.f9605b = 2;
        f39984c = new C3777b("maxCacheSizeBytes", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g2.m5758f())));
    }

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        C0139f c0139f = (C0139f) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8305d(f39983b, c0139f.f444a);
        interfaceC3779d.mo8305d(f39984c, c0139f.f445b);
    }
}
