package c0;

import a1.RunnableC0012k;
import a1.RunnableC0024w;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import be.C0655j;
import i0.C3076g;
import i0.C3082m;
import i0.v2;
import i0.w2;
import i0.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import k0.ScheduledExecutorServiceC3894d;
import p013o.i2;
import pg.o7;
import pg.t8;
import q0.C6069j;
import q0.RunnableC6067h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 extends b2 {

    /* renamed from: w */
    public static final i1 f5133w = new i1();

    /* renamed from: x */
    public static final ScheduledExecutorServiceC3894d f5134x = t8.m11875d();

    /* renamed from: p */
    public j1 f5135p;

    /* renamed from: q */
    public Executor f5136q;

    /* renamed from: r */
    public i0.b2 f5137r;

    /* renamed from: s */
    public u1 f5138s;

    /* renamed from: t */
    public C6069j f5139t;

    /* renamed from: u */
    public x1 f5140u;

    /* renamed from: v */
    public i0.c2 f5141v;

    @Override // c0.b2
    /* renamed from: A */
    public final void mo2147A(Rect rect) {
        this.f5055j = rect;
        i0.g0 g0VarM2152c = m2152c();
        C6069j c6069j = this.f5139t;
        if (g0VarM2152c == null || c6069j == null) {
            return;
        }
        o7.m11809d(new RunnableC6067h(c6069j, m2157h(g0VarM2152c, m2162m(g0VarM2152c)), ((Integer) ((i0.b1) this.f5052g).mo7401e(i0.b1.f44334j0, -1)).intValue()));
    }

    /* renamed from: D */
    public final void m2208D() {
        i0.c2 c2Var = this.f5141v;
        if (c2Var != null) {
            c2Var.m7307b();
            this.f5141v = null;
        }
        u1 u1Var = this.f5138s;
        if (u1Var != null) {
            u1Var.mo7416a();
            this.f5138s = null;
        }
        C6069j c6069j = this.f5139t;
        if (c6069j != null) {
            c6069j.m12075b();
            this.f5139t = null;
        }
        x1 x1Var = this.f5140u;
        if (x1Var != null) {
            synchronized (x1Var.f5258a) {
                x1Var.f5270m = null;
                x1Var.f5271n = null;
            }
        }
        this.f5140u = null;
    }

    /* renamed from: E */
    public final void m2209E(j1 j1Var) {
        o7.m11806a();
        if (j1Var == null) {
            this.f5135p = null;
            this.f5048c = z1.INACTIVE;
            m2166q();
            return;
        }
        this.f5135p = j1Var;
        this.f5136q = f5134x;
        C3082m c3082m = this.f5053h;
        if ((c3082m != null ? c3082m.f16522a : null) != null) {
            m2210F((i0.r1) this.f5052g, c3082m);
            m2165p();
        }
        m2164o();
    }

    /* renamed from: F */
    public final void m2210F(i0.r1 r1Var, C3082m c3082m) {
        o7.m11806a();
        i0.g0 g0VarM2152c = m2152c();
        Objects.requireNonNull(g0VarM2152c);
        m2208D();
        og.y0.m11056f(null, this.f5139t == null);
        Matrix matrix = this.f5056k;
        boolean zMo7317o = g0VarM2152c.mo7317o();
        Size size = c3082m.f16522a;
        Rect rect = this.f5055j;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        int iM2157h = m2157h(g0VarM2152c, m2162m(g0VarM2152c));
        i0.b1 b1Var = (i0.b1) this.f5052g;
        C3076g c3076g = i0.b1.f44334j0;
        C6069j c6069j = new C6069j(1, 34, c3082m, matrix, zMo7317o, rect, iM2157h, ((Integer) b1Var.mo7401e(c3076g, -1)).intValue(), g0VarM2152c.mo7317o() && m2162m(g0VarM2152c));
        this.f5139t = c6069j;
        RunnableC0024w runnableC0024w = new RunnableC0024w(4, this);
        o7.m11806a();
        c6069j.m12074a();
        c6069j.f29605m.add(runnableC0024w);
        x1 x1VarM12076c = this.f5139t.m12076c(g0VarM2152c, true);
        this.f5140u = x1VarM12076c;
        this.f5138s = x1VarM12076c.f5268k;
        if (this.f5135p != null) {
            i0.g0 g0VarM2152c2 = m2152c();
            C6069j c6069j2 = this.f5139t;
            if (g0VarM2152c2 != null && c6069j2 != null) {
                o7.m11809d(new RunnableC6067h(c6069j2, m2157h(g0VarM2152c2, m2162m(g0VarM2152c2)), ((Integer) ((i0.b1) this.f5052g).mo7401e(c3076g, -1)).intValue()));
            }
            j1 j1Var = this.f5135p;
            j1Var.getClass();
            x1 x1Var = this.f5140u;
            x1Var.getClass();
            this.f5136q.execute(new RunnableC0012k(7, j1Var, x1Var));
        }
        i0.b2 b2VarM7301e = i0.b2.m7301e(r1Var, c3082m.f16522a);
        C0655j c0655j = b2VarM7301e.f16425b;
        b2VarM7301e.f16431h = c3082m.f16525d;
        m2150a(b2VarM7301e, c3082m);
        int iM7422P = r1Var.m7422P();
        if (iM7422P != 0) {
            c0655j.getClass();
            if (iM7422P != 0) {
                ((i0.j1) c0655j.f4194d).m7352n(w2.D0, Integer.valueOf(iM7422P));
            }
        }
        i0.s0 s0Var = c3082m.f16527f;
        if (s0Var != null) {
            c0655j.m1875e(s0Var);
        }
        if (this.f5135p != null) {
            b2VarM7301e.m7304c(this.f5138s, c3082m.f16524c, ((Integer) ((i0.b1) this.f5052g).mo7401e(i0.b1.f44335k0, -1)).intValue());
        }
        i0.c2 c2Var = this.f5141v;
        if (c2Var != null) {
            c2Var.m7307b();
        }
        i0.c2 c2Var2 = new i0.c2(new r0(1, this));
        this.f5141v = c2Var2;
        b2VarM7301e.f16429f = c2Var2;
        this.f5137r = b2VarM7301e;
        Object[] objArr = {b2VarM7301e.m7305d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2149C(Collections.unmodifiableList(arrayList));
    }

    @Override // c0.b2
    /* renamed from: f */
    public final w2 mo2155f(boolean z6, z2 z2Var) {
        f5133w.getClass();
        i0.r1 r1Var = i1.f5109a;
        i0.s0 s0VarMo7431a = z2Var.mo7431a(r1Var.mo7421E(), 1);
        if (z6) {
            s0VarMo7431a = i0.s0.m7414Q(s0VarMo7431a, r1Var);
        }
        if (s0VarMo7431a == null) {
            return null;
        }
        return new i0.r1(i0.o1.m7399a(((h1) mo2161l(s0VarMo7431a)).f5106b));
    }

    @Override // c0.b2
    /* renamed from: k */
    public final Set mo2160k() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // c0.b2
    /* renamed from: l */
    public final v2 mo2161l(i0.s0 s0Var) {
        return new h1(i0.j1.m7350g(s0Var));
    }

    @Override // c0.b2
    /* renamed from: t */
    public final w2 mo2169t(i0.e0 e0Var, v2 v2Var) {
        ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44329d0, 34);
        return v2Var.mo1514b();
    }

    public final String toString() {
        return "Preview:".concat(m2156g());
    }

    @Override // c0.b2
    /* renamed from: w */
    public final C3082m mo2172w(i0.s0 s0Var) {
        this.f5137r.m7303b(s0Var);
        Object[] objArr = {this.f5137r.m7305d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2149C(Collections.unmodifiableList(arrayList));
        i2 i2VarM7363b = this.f5053h.m7363b();
        i2VarM7363b.f25543f = s0Var;
        return i2VarM7363b.m10246c();
    }

    @Override // c0.b2
    /* renamed from: x */
    public final C3082m mo2173x(C3082m c3082m, C3082m c3082m2) {
        c3082m.toString();
        Objects.toString(c3082m2);
        og.u1.m10942a("Preview");
        m2210F((i0.r1) this.f5052g, c3082m);
        return c3082m;
    }

    @Override // c0.b2
    /* renamed from: y */
    public final void mo2174y() {
        m2208D();
    }
}
