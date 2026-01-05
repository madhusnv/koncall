package v3;

import d3.C1565s;
import d3.InterfaceC1563q;
import ex.InterfaceC2139c;
import g3.C2474b;
import kotlin.jvm.internal.AbstractC4154l;
import of.C5359n;
import t3.C7027n;
import w2.AbstractC7878q;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.z */
/* loaded from: classes.dex */
public final class C7654z extends h1 {

    /* renamed from: Y */
    public static final C5359n f37077Y;

    /* renamed from: V */
    public InterfaceC7652x f37078V;

    /* renamed from: X */
    public C7653y f37079X;

    static {
        C5359n c5359nM5135g = d3.h0.m5135g();
        int i10 = C1565s.f7818k;
        c5359nM5135g.m10514u(C1565s.f7815h);
        c5359nM5135g.m10486A(1.0f);
        c5359nM5135g.m10487B(1);
        f37077Y = c5359nM5135g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7654z(g0 g0Var, InterfaceC7652x interfaceC7652x) {
        super(g0Var);
        this.f37078V = interfaceC7652x;
        this.f37079X = g0Var.f36849h != null ? new C7653y(this) : null;
        if ((((AbstractC7878q) interfaceC7652x).f37670a.f37672c & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // v3.h1
    public final void N0() {
        if (this.f37079X == null) {
            this.f37079X = new C7653y(this);
        }
    }

    @Override // v3.h1
    public final o0 R0() {
        return this.f37079X;
    }

    @Override // v3.h1
    public final AbstractC7878q T0() {
        return ((AbstractC7878q) this.f37078V).f37670a;
    }

    @Override // t3.i0
    public final int a0(int i10) {
        InterfaceC7652x interfaceC7652x = this.f37078V;
        h1 h1Var = this.f36903n;
        AbstractC4154l.m8920c(h1Var);
        return interfaceC7652x.mo146H(this, h1Var, i10);
    }

    @Override // t3.i0
    /* renamed from: b */
    public final int mo13311b(int i10) {
        InterfaceC7652x interfaceC7652x = this.f37078V;
        h1 h1Var = this.f36903n;
        AbstractC4154l.m8920c(h1Var);
        return interfaceC7652x.mo147V(this, h1Var, i10);
    }

    @Override // v3.h1
    public final void i1(InterfaceC1563q interfaceC1563q, C2474b c2474b) {
        h1 h1Var = this.f36903n;
        AbstractC4154l.m8920c(h1Var);
        h1Var.L0(interfaceC1563q, c2474b);
        if (((C7904v) j0.m14636a(this.f36902m)).getShowLayoutBounds()) {
            long j6 = this.f34032c;
            interfaceC1563q.mo5100a(0.5f, 0.5f, ((int) (j6 >> 32)) - 0.5f, ((int) (j6 & 4294967295L)) - 0.5f, f37077Y);
        }
    }

    @Override // t3.w0
    public final void k0(long j6, float f6, InterfaceC2139c interfaceC2139c) {
        j1(j6, f6, interfaceC2139c);
        if (this.f36955g) {
            return;
        }
        g1();
        C0().mo12110d();
        AbstractC4154l.m8920c(this.f36903n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s1(InterfaceC7652x interfaceC7652x) {
        if (!interfaceC7652x.equals(this.f37078V) && (((AbstractC7878q) interfaceC7652x).f37670a.f37672c & 512) != 0) {
            throw new ClassCastException();
        }
        this.f37078V = interfaceC7652x;
    }

    @Override // v3.n0
    public final int t0(C7027n c7027n) {
        C7653y c7653y = this.f37079X;
        if (c7653y == null) {
            return AbstractC7634f.m14542c(this, c7027n);
        }
        e1.d0 d0Var = c7653y.f36971s;
        int iM5535d = d0Var.m5535d(c7027n);
        if (iM5535d >= 0) {
            return d0Var.f8949c[iM5535d];
        }
        return Integer.MIN_VALUE;
    }

    @Override // t3.i0
    /* renamed from: x */
    public final int mo13312x(int i10) {
        InterfaceC7652x interfaceC7652x = this.f37078V;
        h1 h1Var = this.f36903n;
        AbstractC4154l.m8920c(h1Var);
        return interfaceC7652x.x0(this, h1Var, i10);
    }

    @Override // t3.i0
    /* renamed from: y */
    public final int mo13313y(int i10) {
        InterfaceC7652x interfaceC7652x = this.f37078V;
        h1 h1Var = this.f36903n;
        AbstractC4154l.m8920c(h1Var);
        return interfaceC7652x.k0(this, h1Var, i10);
    }

    @Override // t3.i0
    /* renamed from: z */
    public final t3.w0 mo13314z(long j6) {
        q0(j6);
        InterfaceC7652x interfaceC7652x = this.f37078V;
        h1 h1Var = this.f36903n;
        AbstractC4154l.m8920c(h1Var);
        l1(interfaceC7652x.mo148b(this, h1Var, j6));
        f1();
        return this;
    }
}
