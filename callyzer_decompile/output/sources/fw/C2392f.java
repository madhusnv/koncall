package fw;

import c9.C0927v;
import d7.w0;
import d7.y0;
import g7.C2539d;
import gm.C2645n;
import jw.C3860c;
import ng.C5070u;
import og.o1;
import p004e.AbstractActivityC1878m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fw.f */
/* loaded from: classes3.dex */
public final class C2392f implements y0 {

    /* renamed from: d */
    public static final C5070u f10875d = new C5070u(14);

    /* renamed from: a */
    public final C3860c f10876a;

    /* renamed from: b */
    public final y0 f10877b;

    /* renamed from: c */
    public final C2389c f10878c;

    public C2392f(C3860c c3860c, y0 y0Var, C0927v c0927v) {
        this.f10876a = c3860c;
        this.f10877b = y0Var;
        this.f10878c = new C2389c(0, c0927v);
    }

    /* renamed from: d */
    public static C2392f m6075d(AbstractActivityC1878m abstractActivityC1878m, y0 y0Var) {
        C2645n c2645n = (C2645n) ((InterfaceC2390d) o1.m10790b(InterfaceC2390d.class, abstractActivityC1878m));
        return new C2392f(c2645n.m6607c(), y0Var, new C0927v(3, c2645n.f14258a, c2645n.f14259b, false));
    }

    @Override // d7.y0
    /* renamed from: a */
    public final w0 mo5348a(Class cls, C2539d c2539d) {
        return this.f10876a.containsKey(cls) ? this.f10878c.mo5348a(cls, c2539d) : this.f10877b.mo5348a(cls, c2539d);
    }

    @Override // d7.y0
    /* renamed from: b */
    public final w0 mo1207b(Class cls) {
        if (this.f10876a.containsKey(cls)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return this.f10877b.mo1207b(cls);
    }
}
