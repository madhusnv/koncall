package y1;

import androidx.compose.foundation.text.handwriting.AbstractC0254a;
import b2.a1;
import b3.InterfaceC0573e;
import b3.InterfaceC0593y;
import b3.a0;
import ex.InterfaceC2137a;
import p3.C5812j;
import p3.EnumC5813k;
import p3.b0;
import p3.h0;
import s4.InterfaceC6747c;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.C7632d;
import v3.C7643o;
import v3.u1;
import v3.y1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y1.a */
/* loaded from: classes.dex */
public final class C8529a extends AbstractC7642n implements u1, InterfaceC0573e, InterfaceC0593y {

    /* renamed from: s */
    public InterfaceC2137a f41452s;

    /* renamed from: t */
    public boolean f41453t;

    /* renamed from: v */
    public final h0 f41454v;

    public C8529a(InterfaceC2137a interfaceC2137a) {
        this.f41452s = interfaceC2137a;
        a1 a1Var = new a1(5, this);
        C5812j c5812j = b0.f28413a;
        h0 h0Var = new h0(null, null, a1Var);
        L0(h0Var);
        this.f41454v = h0Var;
    }

    @Override // v3.u1
    /* renamed from: S */
    public final void mo6316S(C5812j c5812j, EnumC5813k enumC5813k, long j6) {
        this.f41454v.mo6316S(c5812j, enumC5813k, j6);
    }

    @Override // v3.u1
    /* renamed from: j */
    public final long mo11382j() {
        C7643o c7643o = AbstractC0254a.f2030a;
        InterfaceC6747c interfaceC6747c = AbstractC7634f.m14563x(this).f36825C;
        c7643o.getClass();
        int i10 = y1.f37076b;
        return C7632d.m14536c(interfaceC6747c.e0(c7643o.f36962a), interfaceC6747c.e0(c7643o.f36963b), interfaceC6747c.e0(c7643o.f36964c), interfaceC6747c.e0(c7643o.f36965d));
    }

    @Override // b3.InterfaceC0573e
    /* renamed from: r */
    public final void mo1708r(a0 a0Var) {
        this.f41453t = a0Var.isFocused();
    }

    @Override // v3.u1
    /* renamed from: x */
    public final void mo6317x() {
        this.f41454v.mo6317x();
    }
}
