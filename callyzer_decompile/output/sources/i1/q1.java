package i1;

import a2.C0036i;
import k1.InterfaceC3928c;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import s4.EnumC6757m;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.InterfaceC7640l;
import v3.InterfaceC7641m;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 extends AbstractC7642n implements InterfaceC7640l, v3.l1 {

    /* renamed from: B */
    public C3128g f16963B;

    /* renamed from: C */
    public k1.p1 f16964C;

    /* renamed from: D */
    public InterfaceC7641m f16965D;

    /* renamed from: E */
    public C3129h f16966E;

    /* renamed from: F */
    public C3128g f16967F;

    /* renamed from: G */
    public boolean f16968G;

    /* renamed from: s */
    public k1.q1 f16969s;

    /* renamed from: t */
    public k1.x0 f16970t;

    /* renamed from: v */
    public boolean f16971v;

    /* renamed from: w */
    public k1.k0 f16972w;

    /* renamed from: x */
    public InterfaceC4630l f16973x;

    /* renamed from: y */
    public InterfaceC3928c f16974y;

    /* renamed from: z */
    public boolean f16975z;

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        this.f16968G = P0();
        O0();
        if (this.f16964C == null) {
            k1.q1 q1Var = this.f16969s;
            C3128g c3128g = this.f16975z ? this.f16967F : this.f16963B;
            k1.p1 p1Var = new k1.p1(c3128g, this.f16974y, this.f16972w, this.f16970t, q1Var, this.f16973x, this.f16971v, this.f16968G);
            L0(p1Var);
            this.f16964C = p1Var;
        }
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        InterfaceC7641m interfaceC7641m = this.f16965D;
        if (interfaceC7641m != null) {
            M0(interfaceC7641m);
        }
    }

    @Override // v3.InterfaceC7641m
    /* renamed from: I */
    public final void mo152I() {
        boolean zP0 = P0();
        if (this.f16968G != zP0) {
            this.f16968G = zP0;
            k1.q1 q1Var = this.f16969s;
            k1.x0 x0Var = this.f16970t;
            boolean z6 = this.f16975z;
            C3128g c3128g = z6 ? this.f16967F : this.f16963B;
            Q0(c3128g, this.f16974y, this.f16972w, x0Var, q1Var, this.f16973x, z6, this.f16971v);
        }
    }

    public final void O0() {
        InterfaceC7641m interfaceC7641m = this.f16965D;
        if (interfaceC7641m != null) {
            if (((AbstractC7878q) interfaceC7641m).f37670a.f37683p) {
                return;
            }
            L0(interfaceC7641m);
            return;
        }
        if (this.f16975z) {
            AbstractC7634f.m14559t(this, new C0036i(18, this));
        }
        C3128g c3128g = this.f16975z ? this.f16967F : this.f16963B;
        if (c3128g != null) {
            AbstractC7642n abstractC7642n = c3128g.f16871i;
            if (abstractC7642n.f37670a.f37683p) {
                return;
            }
            L0(abstractC7642n);
            this.f16965D = abstractC7642n;
        }
    }

    public final boolean P0() {
        EnumC6757m enumC6757m = EnumC6757m.Ltr;
        if (this.f37683p) {
            enumC6757m = AbstractC7634f.m14563x(this).f36826D;
        }
        return enumC6757m != EnumC6757m.Rtl || this.f16970t == k1.x0.Vertical;
    }

    public final void Q0(C3128g c3128g, InterfaceC3928c interfaceC3928c, k1.k0 k0Var, k1.x0 x0Var, k1.q1 q1Var, InterfaceC4630l interfaceC4630l, boolean z6, boolean z10) {
        boolean z11;
        this.f16969s = q1Var;
        this.f16970t = x0Var;
        boolean z12 = true;
        if (this.f16975z != z6) {
            this.f16975z = z6;
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC4154l.m8918a(this.f16963B, c3128g)) {
            z12 = false;
        } else {
            this.f16963B = c3128g;
        }
        if (z11 || (z12 && !z6)) {
            InterfaceC7641m interfaceC7641m = this.f16965D;
            if (interfaceC7641m != null) {
                M0(interfaceC7641m);
            }
            this.f16965D = null;
            O0();
        }
        this.f16971v = z10;
        this.f16972w = k0Var;
        this.f16973x = interfaceC4630l;
        this.f16974y = interfaceC3928c;
        boolean zP0 = P0();
        this.f16968G = zP0;
        k1.p1 p1Var = this.f16964C;
        if (p1Var != null) {
            p1Var.X0(this.f16975z ? this.f16967F : this.f16963B, interfaceC3928c, k0Var, x0Var, q1Var, interfaceC4630l, z10, zP0);
        }
    }

    @Override // v3.l1
    public final void c0() {
        C3129h c3129h = (C3129h) AbstractC7634f.m14548i(this, e1.f16849a);
        if (AbstractC4154l.m8918a(c3129h, this.f16966E)) {
            return;
        }
        this.f16966E = c3129h;
        this.f16967F = null;
        InterfaceC7641m interfaceC7641m = this.f16965D;
        if (interfaceC7641m != null) {
            M0(interfaceC7641m);
        }
        this.f16965D = null;
        O0();
        k1.p1 p1Var = this.f16964C;
        if (p1Var != null) {
            k1.q1 q1Var = this.f16969s;
            k1.x0 x0Var = this.f16970t;
            C3128g c3128g = this.f16975z ? this.f16967F : this.f16963B;
            p1Var.X0(c3128g, this.f16974y, this.f16972w, x0Var, q1Var, this.f16973x, this.f16971v, this.f16968G);
        }
    }
}
