package q1;

import a3.C0045d;
import androidx.compose.foundation.lazy.layout.C0248b;
import b3.C0584p;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import dr.C1768r;
import ex.InterfaceC2139c;
import g2.d3;
import i1.y0;
import k1.C3938m;
import k1.q1;
import k2.C3953b;
import k2.e1;
import k2.s0;
import k2.w0;
import k4.C4001v;
import l1.C4327p;
import l4.d0;
import m1.C4631m;
import mg.j0;
import n1.AbstractC4941a;
import og.gg;
import rw.AbstractC6663m;
import s1.AbstractC6731z;
import s1.C6709d;
import s1.e0;
import s1.h0;
import u2.AbstractC7311h;
import u2.AbstractC7321r;
import uw.InterfaceC7559c;
import v3.g0;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.y */
/* loaded from: classes.dex */
public final class C6097y implements q1 {

    /* renamed from: w */
    public static final C0917l f29769w = gg.m10675b(C6094v.f29760a, C6087o.f29706d);

    /* renamed from: a */
    public final j0 f29770a;

    /* renamed from: b */
    public boolean f29771b;

    /* renamed from: c */
    public C6090r f29772c;

    /* renamed from: d */
    public final C6092t f29773d;

    /* renamed from: e */
    public final e1 f29774e;

    /* renamed from: f */
    public final C4631m f29775f;

    /* renamed from: g */
    public float f29776g;

    /* renamed from: h */
    public final C3938m f29777h;

    /* renamed from: i */
    public final boolean f29778i;

    /* renamed from: j */
    public g0 f29779j;

    /* renamed from: k */
    public final C6095w f29780k;

    /* renamed from: l */
    public final C6709d f29781l;

    /* renamed from: m */
    public final C0248b f29782m;

    /* renamed from: n */
    public final d0 f29783n;

    /* renamed from: o */
    public final h0 f29784o;

    /* renamed from: p */
    public final C4327p f29785p;

    /* renamed from: q */
    public final e0 f29786q;

    /* renamed from: r */
    public final w0 f29787r;

    /* renamed from: s */
    public final e1 f29788s;

    /* renamed from: t */
    public final e1 f29789t;

    /* renamed from: u */
    public final w0 f29790u;

    /* renamed from: v */
    public final C4001v f29791v;

    public C6097y(int i10, int i11) {
        j0 j0Var = new j0();
        j0Var.f23654a = -1;
        this.f29770a = j0Var;
        this.f29773d = new C6092t(i10, i11, 0);
        this.f29774e = new e1(b0.f29638a, s0.f20544c);
        this.f29775f = new C4631m();
        this.f29777h = new C3938m(new C0045d(28, this));
        this.f29778i = true;
        this.f29780k = new C6095w(this, 0);
        this.f29781l = new C6709d();
        this.f29782m = new C0248b();
        this.f29783n = new d0(15);
        this.f29784o = new h0(new C0584p(this, i10));
        this.f29785p = new C4327p(16, this);
        this.f29786q = new e0();
        this.f29787r = AbstractC6731z.m12883h();
        Boolean bool = Boolean.FALSE;
        this.f29788s = C3953b.m8517t(bool);
        this.f29789t = C3953b.m8517t(bool);
        this.f29790u = AbstractC6731z.m12883h();
        this.f29791v = new C4001v((byte) 0, 24);
    }

    /* renamed from: f */
    public static Object m12131f(C6097y c6097y, int i10, AbstractC8199i abstractC8199i) {
        Object objMo7521b = c6097y.mo7521b(y0.Default, new C1768r(c6097y, i10, (InterfaceC7559c) null), abstractC8199i);
        return objMo7521b == EnumC7794a.COROUTINE_SUSPENDED ? objMo7521b : qw.a0.f30746a;
    }

    /* renamed from: j */
    public static Object m12132j(C6097y c6097y, int i10, InterfaceC7559c interfaceC7559c) {
        c6097y.getClass();
        Object objMo7521b = c6097y.mo7521b(y0.Default, new d3(c6097y, i10, (InterfaceC7559c) null), interfaceC7559c);
        return objMo7521b == EnumC7794a.COROUTINE_SUSPENDED ? objMo7521b : qw.a0.f30746a;
    }

    @Override // k1.q1
    /* renamed from: a */
    public final boolean mo7520a() {
        return this.f29777h.mo7520a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8.mo7521b(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k1.q1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo7521b(i1.y0 r6, ex.InterfaceC2141e r7, uw.InterfaceC7559c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof q1.C6096x
            if (r0 == 0) goto L13
            r0 = r8
            q1.x r0 = (q1.C6096x) r0
            int r1 = r0.f29768f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29768f = r1
            goto L18
        L13:
            q1.x r0 = new q1.x
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f29766d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f29768f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ww.i r6 = r0.f29765c
            r7 = r6
            ex.e r7 = (ex.InterfaceC2141e) r7
            i1.y0 r6 = r0.f29764b
            q1.y r2 = r0.f29763a
            og.od.m10798c(r8)
            goto L57
        L3f:
            og.od.m10798c(r8)
            r0.f29763a = r5
            r0.f29764b = r6
            r8 = r7
            ww.i r8 = (ww.AbstractC8199i) r8
            r0.f29765c = r8
            r0.f29768f = r4
            s1.d r8 = r5.f29781l
            java.lang.Object r8 = r8.m12844h(r0)
            if (r8 != r1) goto L56
            goto L68
        L56:
            r2 = r5
        L57:
            k1.m r8 = r2.f29777h
            r2 = 0
            r0.f29763a = r2
            r0.f29764b = r2
            r0.f29765c = r2
            r0.f29768f = r3
            java.lang.Object r6 = r8.mo7521b(r6, r7, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C6097y.mo7521b(i1.y0, ex.e, uw.c):java.lang.Object");
    }

    @Override // k1.q1
    /* renamed from: c */
    public final boolean mo7522c() {
        return ((Boolean) this.f29789t.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: d */
    public final boolean mo7523d() {
        return ((Boolean) this.f29788s.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: e */
    public final float mo7524e(float f6) {
        return this.f29777h.mo7524e(f6);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* renamed from: g */
    public final void m12133g(C6090r c6090r, boolean z6, boolean z10) {
        if (!z6 && this.f29771b) {
            this.f29772c = c6090r;
            return;
        }
        if (z6) {
            this.f29771b = true;
        }
        C6091s c6091s = c6090r.f29716a;
        ?? r22 = c6090r.f29726k;
        int i10 = c6090r.f29717b;
        this.f29789t.setValue(Boolean.valueOf(((c6091s != null ? c6091s.f29733a : 0) == 0 && i10 == 0) ? false : true));
        this.f29788s.setValue(Boolean.valueOf(c6090r.f29718c));
        this.f29776g -= c6090r.f29719d;
        this.f29774e.setValue(c6090r);
        C6092t c6092t = this.f29773d;
        if (z10) {
            c6092t.getClass();
            if (!(((float) i10) >= DefinitionKt.NO_Float_VALUE)) {
                AbstractC4941a.m9886c("scrollOffset should be non-negative");
            }
            c6092t.f29753c.m8527g(i10);
        } else {
            c6092t.getClass();
            c6092t.f29755e = c6091s != null ? c6091s.f29741i : null;
            if (c6092t.f29754d || c6090r.f29729n > 0) {
                c6092t.f29754d = true;
                if (!(((float) i10) >= DefinitionKt.NO_Float_VALUE)) {
                    AbstractC4941a.m9886c("scrollOffset should be non-negative");
                }
                c6092t.m12125a(c6091s != null ? c6091s.f29733a : 0, i10);
            }
            if (this.f29778i) {
                j0 j0Var = this.f29770a;
                if (j0Var.f23654a != -1 && !r22.isEmpty()) {
                    if (j0Var.f23654a != (j0Var.f23655b ? ((C6091s) AbstractC6663m.m12750N(r22)).f29733a + 1 : ((C6091s) AbstractC6663m.m12742F(r22)).f29733a - 1)) {
                        j0Var.f23654a = -1;
                        s1.g0 g0Var = (s1.g0) j0Var.f23656c;
                        if (g0Var != null) {
                            g0Var.cancel();
                        }
                        j0Var.f23656c = null;
                    }
                }
            }
        }
        if (z6) {
            this.f29791v.m8780u(c6090r.f29721f, c6090r.f29724i, c6090r.f29723h);
        }
    }

    /* renamed from: h */
    public final C6090r m12134h() {
        return (C6090r) this.f29774e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* renamed from: i */
    public final void m12135i(float f6, C6090r c6090r) {
        s1.g0 g0Var;
        s1.g0 g0Var2;
        s1.g0 g0Var3;
        if (this.f29778i) {
            ?? r02 = c6090r.f29726k;
            ?? r12 = c6090r.f29726k;
            if (r02.isEmpty()) {
                return;
            }
            boolean z6 = f6 < DefinitionKt.NO_Float_VALUE;
            int i10 = z6 ? ((C6091s) AbstractC6663m.m12750N(r12)).f29733a + 1 : ((C6091s) AbstractC6663m.m12742F(r12)).f29733a - 1;
            if (i10 < 0 || i10 >= c6090r.f29729n) {
                return;
            }
            j0 j0Var = this.f29770a;
            if (i10 != j0Var.f23654a) {
                if (j0Var.f23655b != z6 && (g0Var3 = (s1.g0) j0Var.f23656c) != null) {
                    g0Var3.cancel();
                }
                j0Var.f23655b = z6;
                j0Var.f23654a = i10;
                C6097y c6097y = (C6097y) this.f29785p.f21788b;
                AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
                InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
                AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
                try {
                    long j6 = ((C6090r) c6097y.f29774e.getValue()).f29725j;
                    AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                    j0Var.f23656c = c6097y.f29784o.m12849a(i10, j6);
                } catch (Throwable th2) {
                    AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                    throw th2;
                }
            }
            if (!z6) {
                if (c6090r.f29727l - ((C6091s) AbstractC6663m.m12742F(r12)).f29744l >= f6 || (g0Var = (s1.g0) j0Var.f23656c) == null) {
                    return;
                }
                g0Var.mo12848a();
                return;
            }
            C6091s c6091s = (C6091s) AbstractC6663m.m12750N(r12);
            if (((c6091s.f29744l + c6091s.f29745m) + c6090r.f29732q) - c6090r.f29728m >= (-f6) || (g0Var2 = (s1.g0) j0Var.f23656c) == null) {
                return;
            }
            g0Var2.mo12848a();
        }
    }

    /* renamed from: k */
    public final void m12136k(int i10) {
        C6092t c6092t = this.f29773d;
        if (c6092t.f29752b.m8526f() != i10 || c6092t.f29753c.m8526f() != 0) {
            C0248b c0248b = this.f29782m;
            c0248b.m695d();
            c0248b.f1989b = null;
        }
        c6092t.m12125a(i10, 0);
        c6092t.f29755e = null;
        g0 g0Var = this.f29779j;
        if (g0Var != null) {
            g0Var.m14600l();
        }
    }
}
