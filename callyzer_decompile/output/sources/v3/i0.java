package v3;

import a1.C0005d;
import d3.AbstractC1561o;
import d3.C1552f;
import d3.C1559m;
import d3.InterfaceC1563q;
import f3.AbstractC2199e;
import f3.C2195a;
import f3.C2196b;
import f3.InterfaceC2198d;
import g3.C2474b;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import og.ze;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import w2.AbstractC7878q;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements InterfaceC2198d {

    /* renamed from: a */
    public final C2196b f36917a = new C2196b();

    /* renamed from: b */
    public InterfaceC7644p f36918b;

    @Override // s4.InterfaceC6747c
    /* renamed from: A */
    public final long mo8432A(float f6) {
        return this.f36917a.mo8432A(f6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: F */
    public final float mo8433F(int i10) {
        return this.f36917a.mo8433F(i10);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: J */
    public final float mo8434J(float f6) {
        return f6 / this.f36917a.mo155a();
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: L */
    public final void mo5896L(d3.g0 g0Var, AbstractC1561o abstractC1561o, float f6, AbstractC2199e abstractC2199e, int i10) {
        this.f36917a.mo5896L(g0Var, abstractC1561o, f6, abstractC2199e, i10);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f36917a.mo154O();
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: Q */
    public final void mo5897Q(d3.o0 o0Var, long j6, long j10, AbstractC2199e abstractC2199e) {
        this.f36917a.mo5897Q(o0Var, j6, j10, abstractC2199e);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: T */
    public final float mo8435T(float f6) {
        return this.f36917a.mo155a() * f6;
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: U */
    public final void mo5898U(long j6, float f6, long j10, AbstractC2199e abstractC2199e, int i10) {
        this.f36917a.mo5898U(j6, f6, j10, abstractC2199e, i10);
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: X */
    public final C0005d mo5899X() {
        return this.f36917a.f10124b;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: Z */
    public final int mo8436Z(long j6) {
        return this.f36917a.mo8436Z(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f36917a.mo155a();
    }

    /* renamed from: b */
    public final void m14622b() {
        C2196b c2196b = this.f36917a;
        InterfaceC1563q interfaceC1563qM75t = c2196b.f10124b.m75t();
        InterfaceC7641m interfaceC7641m = this.f36918b;
        if (interfaceC7641m == null) {
            throw p020v.a1.m14342v("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC7878q abstractC7878q = (AbstractC7878q) interfaceC7641m;
        AbstractC7878q abstractC7878qM14545f = abstractC7878q.f37670a.f37675f;
        if (abstractC7878qM14545f == null || (abstractC7878qM14545f.f37673d & 4) == 0) {
            abstractC7878qM14545f = null;
        } else {
            while (abstractC7878qM14545f != null) {
                int i10 = abstractC7878qM14545f.f37672c;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    break;
                } else {
                    abstractC7878qM14545f = abstractC7878qM14545f.f37675f;
                }
            }
            abstractC7878qM14545f = null;
        }
        if (abstractC7878qM14545f == null) {
            h1 h1VarM14561v = AbstractC7634f.m14561v(interfaceC7641m, 4);
            if (h1VarM14561v.T0() == abstractC7878q.f37670a) {
                h1VarM14561v = h1VarM14561v.f36903n;
                AbstractC4154l.m8920c(h1VarM14561v);
            }
            h1VarM14561v.i1(interfaceC1563qM75t, (C2474b) c2196b.f10124b.f25c);
            return;
        }
        C4640e c4640e = null;
        while (abstractC7878qM14545f != null) {
            if (abstractC7878qM14545f instanceof InterfaceC7644p) {
                InterfaceC7644p interfaceC7644p = (InterfaceC7644p) abstractC7878qM14545f;
                C2474b c2474b = (C2474b) c2196b.f10124b.f25c;
                h1 h1VarM14561v2 = AbstractC7634f.m14561v(interfaceC7644p, 4);
                long jM11098d = ze.m11098d(h1VarM14561v2.f34032c);
                g0 g0Var = h1VarM14561v2.f36902m;
                g0Var.getClass();
                ((C7904v) j0.m14636a(g0Var)).getSharedDrawScope().m14623c(interfaceC1563qM75t, jM11098d, h1VarM14561v2, interfaceC7644p, c2474b);
            } else if ((abstractC7878qM14545f.f37672c & 4) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                int i11 = 0;
                for (AbstractC7878q abstractC7878q2 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
                    if ((abstractC7878q2.f37672c & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            abstractC7878qM14545f = abstractC7878q2;
                        } else {
                            if (c4640e == null) {
                                c4640e = new C4640e(new AbstractC7878q[16]);
                            }
                            if (abstractC7878qM14545f != null) {
                                c4640e.m9506b(abstractC7878qM14545f);
                                abstractC7878qM14545f = null;
                            }
                            c4640e.m9506b(abstractC7878q2);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e);
        }
    }

    /* renamed from: c */
    public final void m14623c(InterfaceC1563q interfaceC1563q, long j6, h1 h1Var, InterfaceC7644p interfaceC7644p, C2474b c2474b) {
        InterfaceC7644p interfaceC7644p2 = this.f36918b;
        this.f36918b = interfaceC7644p;
        EnumC6757m enumC6757m = h1Var.f36902m.f36826D;
        C2196b c2196b = this.f36917a;
        C0005d c0005d = c2196b.f10124b;
        C2195a c2195a = ((C2196b) c0005d.f26d).f10123a;
        InterfaceC6747c interfaceC6747c = c2195a.f10119a;
        EnumC6757m enumC6757m2 = c2195a.f10120b;
        InterfaceC1563q interfaceC1563qM75t = c0005d.m75t();
        C0005d c0005d2 = c2196b.f10124b;
        long jM81z = c0005d2.m81z();
        C2474b c2474b2 = (C2474b) c0005d2.f25c;
        c0005d2.c0(h1Var);
        c0005d2.d0(enumC6757m);
        c0005d2.b0(interfaceC1563q);
        c0005d2.e0(j6);
        c0005d2.f25c = c2474b;
        interfaceC1563q.mo5107i();
        try {
            interfaceC7644p.h0(this);
            interfaceC1563q.mo5113o();
            c0005d2.c0(interfaceC6747c);
            c0005d2.d0(enumC6757m2);
            c0005d2.b0(interfaceC1563qM75t);
            c0005d2.e0(jM81z);
            c0005d2.f25c = c2474b2;
            this.f36918b = interfaceC7644p2;
        } catch (Throwable th2) {
            interfaceC1563q.mo5113o();
            c0005d2.c0(interfaceC6747c);
            c0005d2.d0(enumC6757m2);
            c0005d2.b0(interfaceC1563qM75t);
            c0005d2.e0(jM81z);
            c0005d2.f25c = c2474b2;
            throw th2;
        }
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: e */
    public final long mo5913e() {
        return this.f36917a.mo5913e();
    }

    @Override // s4.InterfaceC6747c
    public final int e0(float f6) {
        return this.f36917a.e0(f6);
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: g */
    public final void mo5903g(d3.g0 g0Var, long j6, float f6, AbstractC2199e abstractC2199e) {
        this.f36917a.mo5903g(g0Var, j6, f6, abstractC2199e);
    }

    @Override // f3.InterfaceC2198d
    public final EnumC6757m getLayoutDirection() {
        return this.f36917a.f10123a.f10120b;
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: i */
    public final void mo5904i(long j6, float f6, float f10, long j10, long j11, float f11, AbstractC2199e abstractC2199e) {
        this.f36917a.mo5904i(j6, f6, f10, j10, j11, f11, abstractC2199e);
    }

    @Override // f3.InterfaceC2198d
    public final long i0() {
        return this.f36917a.i0();
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: l */
    public final long mo8441l(float f6) {
        return this.f36917a.mo8441l(f6);
    }

    @Override // s4.InterfaceC6747c
    public final long l0(long j6) {
        return this.f36917a.l0(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: m */
    public final long mo8442m(long j6) {
        return this.f36917a.mo8442m(j6);
    }

    @Override // s4.InterfaceC6747c
    public final float n0(long j6) {
        return this.f36917a.n0(j6);
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: o */
    public final void mo5905o(long j6, long j10, long j11, float f6, C1559m c1559m, int i10) {
        this.f36917a.mo5905o(j6, j10, j11, f6, c1559m, i10);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: p */
    public final float mo8443p(long j6) {
        return this.f36917a.mo8443p(j6);
    }

    @Override // f3.InterfaceC2198d
    public final void p0(long j6, long j10, long j11, long j12, AbstractC2199e abstractC2199e, int i10) {
        this.f36917a.p0(j6, j10, j11, j12, abstractC2199e, i10);
    }

    @Override // f3.InterfaceC2198d
    public final void r0(long j6, long j10, long j11, float f6, int i10, int i11) {
        this.f36917a.r0(j6, j10, j11, f6, i10, i11);
    }

    @Override // f3.InterfaceC2198d
    public final void v0(C1552f c1552f, long j6, long j10, long j11, float f6, C1559m c1559m, int i10) {
        this.f36917a.v0(c1552f, j6, j10, j11, f6, c1559m, i10);
    }
}
