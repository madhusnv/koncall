package p3;

import i1.C3140s;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4168z;
import o1.k0;
import s4.InterfaceC6747c;
import v3.AbstractC7634f;
import v3.C7632d;
import v3.C7643o;
import v3.InterfaceC7640l;
import v3.a2;
import v3.u1;
import v3.y1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.d */
/* loaded from: classes.dex */
public abstract class AbstractC5806d extends AbstractC7878q implements a2, u1, InterfaceC7640l {

    /* renamed from: q */
    public C7643o f28423q;

    /* renamed from: r */
    public C5803a f28424r;

    /* renamed from: s */
    public boolean f28425s;

    public AbstractC5806d(C5803a c5803a, C7643o c7643o) {
        this.f28423q = c7643o;
        this.f28424r = c5803a;
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        P0();
    }

    public final void L0() {
        C5803a c5803a;
        C4168z c4168z = new C4168z();
        AbstractC7634f.m14538A(this, new k4.c0(1, c4168z));
        AbstractC5806d abstractC5806d = (AbstractC5806d) c4168z.f21164a;
        if (abstractC5806d == null || (c5803a = abstractC5806d.f28424r) == null) {
            c5803a = this.f28424r;
        }
        M0(c5803a);
    }

    public abstract void M0(InterfaceC5816n interfaceC5816n);

    public final void N0() {
        C4164v c4164v = new C4164v();
        c4164v.f21160a = true;
        AbstractC7634f.m14539B(this, new C3140s(c4164v, 1));
        if (c4164v.f21160a) {
            L0();
        }
    }

    public abstract boolean O0(int i10);

    public final void P0() {
        qw.a0 a0Var;
        if (this.f28425s) {
            this.f28425s = false;
            if (this.f37683p) {
                C4168z c4168z = new C4168z();
                AbstractC7634f.m14538A(this, new k0(c4168z, 3));
                AbstractC5806d abstractC5806d = (AbstractC5806d) c4168z.f21164a;
                if (abstractC5806d != null) {
                    abstractC5806d.L0();
                    a0Var = qw.a0.f30746a;
                } else {
                    a0Var = null;
                }
                if (a0Var == null) {
                    M0(null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // v3.u1
    /* renamed from: S */
    public final void mo6316S(C5812j c5812j, EnumC5813k enumC5813k, long j6) {
        if (enumC5813k == EnumC5813k.Main) {
            ?? r32 = c5812j.f28467a;
            int size = r32.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (O0(((C5819q) r32.get(i10)).f28484i)) {
                    int i11 = c5812j.f28470d;
                    if (i11 == 4) {
                        this.f28425s = true;
                        N0();
                        return;
                    } else {
                        if (i11 == 5) {
                            P0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // v3.u1
    /* renamed from: j */
    public final long mo11382j() {
        C7643o c7643o = this.f28423q;
        if (c7643o == null) {
            return y1.f37075a;
        }
        InterfaceC6747c interfaceC6747c = AbstractC7634f.m14563x(this).f36825C;
        int i10 = y1.f37076b;
        return C7632d.m14536c(interfaceC6747c.e0(c7643o.f36962a), interfaceC6747c.e0(c7643o.f36963b), interfaceC6747c.e0(c7643o.f36964c), interfaceC6747c.e0(c7643o.f36965d));
    }

    @Override // v3.u1
    /* renamed from: x */
    public final void mo6317x() {
        P0();
    }
}
