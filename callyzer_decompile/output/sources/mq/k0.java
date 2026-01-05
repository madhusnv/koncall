package mq;

import c9.C0910e;
import c9.C0927v;
import gm.C2636e;
import gm.C2644m;
import gm.C2645n;
import gm.C2651t;
import jn.AbstractC3802a;
import xm.C8418z;
import xm.q4;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 implements d7.y0 {

    /* renamed from: a */
    public final /* synthetic */ C2636e f24298a;

    /* renamed from: b */
    public final /* synthetic */ boolean f24299b;

    public k0(C2636e c2636e, boolean z6) {
        this.f24298a = c2636e;
        this.f24299b = z6;
    }

    @Override // d7.y0
    /* renamed from: b */
    public final d7.w0 mo1207b(Class cls) {
        C2644m c2644m = this.f24298a.f14239a;
        C2645n c2645n = (C2645n) c2644m.f14257d;
        C2651t c2651t = c2645n.f14258a;
        C0927v c0927v = new C0927v((C8418z) c2651t.f14296T.get(), (q4) c2651t.f14295S.get());
        C0910e c0910eM6610f = c2645n.m6610f();
        C2651t c2651t2 = c2645n.f14258a;
        mn.g0 g0Var = new mn.g0(c2651t2.f14305c.f15864a, c2645n.m6606b(), (y5) c2651t2.f14281E.get(), AbstractC3802a.m8397a(c2651t2.f14307e), c2651t2.m6614d(), (C8418z) c2651t2.f14296T.get(), c2651t2.m6633w());
        C2651t c2651t3 = c2644m.f14255b;
        return new a1(c0927v, c0910eM6610f, g0Var, c2651t3.m6611a(), c2651t3.m6613c(), AbstractC3802a.m8397a(c2651t3.f14307e), c2651t3.m6630t(), c2651t3.m6628r(), (y5) c2651t3.f14281E.get(), this.f24299b, c2651t3.m6633w());
    }
}
