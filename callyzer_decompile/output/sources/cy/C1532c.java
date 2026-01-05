package cy;

import ex.InterfaceC2142f;
import l7.C4417q;
import tx.o0;
import ww.AbstractC8199i;
import yx.AbstractC8823q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cy.c */
/* loaded from: classes3.dex */
public final class C1532c {

    /* renamed from: a */
    public final Object f7701a;

    /* renamed from: b */
    public final InterfaceC2142f f7702b;

    /* renamed from: c */
    public final InterfaceC2142f f7703c;

    /* renamed from: d */
    public final Object f7704d;

    /* renamed from: e */
    public final AbstractC8199i f7705e;

    /* renamed from: f */
    public final InterfaceC2142f f7706f;

    /* renamed from: g */
    public Object f7707g;

    /* renamed from: h */
    public int f7708h = -1;

    /* renamed from: i */
    public final /* synthetic */ C1534e f7709i;

    public C1532c(C1534e c1534e, Object obj, InterfaceC2142f interfaceC2142f, InterfaceC2142f interfaceC2142f2, C4417q c4417q, AbstractC8199i abstractC8199i, InterfaceC2142f interfaceC2142f3) {
        this.f7709i = c1534e;
        this.f7701a = obj;
        this.f7702b = interfaceC2142f;
        this.f7703c = interfaceC2142f2;
        this.f7704d = c4417q;
        this.f7705e = abstractC8199i;
        this.f7706f = interfaceC2142f3;
    }

    /* renamed from: a */
    public final void m5075a() {
        Object obj = this.f7707g;
        if (obj instanceof AbstractC8823q) {
            ((AbstractC8823q) obj).mo5496h(this.f7708h, this.f7709i.f7715a);
            return;
        }
        o0 o0Var = obj instanceof o0 ? (o0) obj : null;
        if (o0Var != null) {
            o0Var.dispose();
        }
    }
}
