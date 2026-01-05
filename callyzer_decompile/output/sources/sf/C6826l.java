package sf;

import pf.C5902b;
import qf.InterfaceC6207f;
import qf.InterfaceC6208g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.l */
/* loaded from: classes.dex */
public final class C6826l implements InterfaceC6818d, InterfaceC6816b, InterfaceC6817c {

    /* renamed from: b */
    public static C6826l f32465b;

    /* renamed from: c */
    public static final C6827m f32466c = new C6827m(0, false, false, 0, 0);

    /* renamed from: a */
    public Object f32467a;

    /* renamed from: b */
    public static synchronized C6826l m13020b() {
        try {
            if (f32465b == null) {
                f32465b = new C6826l();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f32465b;
    }

    @Override // sf.InterfaceC6818d
    /* renamed from: a */
    public void mo85a(C5902b c5902b) {
        AbstractC6819e abstractC6819e = (AbstractC6819e) this.f32467a;
        if (c5902b.f28736b == 0) {
            abstractC6819e.m13002h(null, abstractC6819e.mo13008s());
            return;
        }
        InterfaceC6817c interfaceC6817c = abstractC6819e.f32395r;
        if (interfaceC6817c != null) {
            interfaceC6817c.mo12992d(c5902b);
        }
    }

    @Override // sf.InterfaceC6817c
    /* renamed from: d */
    public void mo12992d(C5902b c5902b) {
        ((InterfaceC6208g) this.f32467a).mo12226d(c5902b);
    }

    @Override // sf.InterfaceC6816b
    /* renamed from: f */
    public void mo12990f(int i10) {
        ((InterfaceC6207f) this.f32467a).mo12224f(i10);
    }

    @Override // sf.InterfaceC6816b
    /* renamed from: g */
    public void mo12991g() {
        ((InterfaceC6207f) this.f32467a).mo12225g();
    }
}
