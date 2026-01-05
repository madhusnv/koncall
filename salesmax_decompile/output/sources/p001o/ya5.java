package p001o;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.C2181a;
import androidx.media3.common.C2182b;
import androidx.media3.common.Metadata;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.List;
import p001o.dga;
import p001o.gc0;
import p001o.kz0;
import p001o.lmh;
import p001o.mad;
import p001o.of8;
import p001o.x8b;

/* loaded from: classes2.dex */
public class ya5 implements ac0 {

    /* renamed from: a */
    public final jb3 f55137a;

    /* renamed from: b */
    public final lmh.C15105b f55138b;

    /* renamed from: c */
    public final lmh.C15106c f55139c;

    /* renamed from: d */
    public final C18363a f55140d;

    /* renamed from: e */
    public final SparseArray f55141e;

    /* renamed from: f */
    public dga f55142f;

    /* renamed from: g */
    public mad f55143g;

    /* renamed from: h */
    public uw7 f55144h;

    /* renamed from: q */
    public boolean f55145q;

    /* renamed from: o.ya5$a */
    public static final class C18363a {

        /* renamed from: a */
        public final lmh.C15105b f55146a;

        /* renamed from: b */
        public nf8 f55147b = nf8.m40499E();

        /* renamed from: c */
        public of8 f55148c = of8.m42180r();

        /* renamed from: d */
        public x8b.C18076b f55149d;

        /* renamed from: e */
        public x8b.C18076b f55150e;

        /* renamed from: f */
        public x8b.C18076b f55151f;

        public C18363a(lmh.C15105b c15105b) {
            this.f55146a = c15105b;
        }

        /* renamed from: c */
        public static x8b.C18076b m57414c(mad madVar, nf8 nf8Var, x8b.C18076b c18076b, lmh.C15105b c15105b) {
            lmh lmhVarMo7112A = madVar.mo7112A();
            int iMo7122N = madVar.mo7122N();
            Object objMo6952m = lmhVarMo7112A.m37477q() ? null : lmhVarMo7112A.mo6952m(iMo7122N);
            int iM37482d = (madVar.mo7133b() || lmhVarMo7112A.m37477q()) ? -1 : lmhVarMo7112A.m37473f(iMo7122N, c15105b).m37482d(sqi.O0(madVar.e0()) - c15105b.m37492n());
            for (int i = 0; i < nf8Var.size(); i++) {
                x8b.C18076b c18076b2 = (x8b.C18076b) nf8Var.get(i);
                if (m57415i(c18076b2, objMo6952m, madVar.mo7133b(), madVar.mo7147w(), madVar.mo7125R(), iM37482d)) {
                    return c18076b2;
                }
            }
            if (nf8Var.isEmpty() && c18076b != null) {
                if (m57415i(c18076b, objMo6952m, madVar.mo7133b(), madVar.mo7147w(), madVar.mo7125R(), iM37482d)) {
                    return c18076b;
                }
            }
            return null;
        }

        /* renamed from: i */
        public static boolean m57415i(x8b.C18076b c18076b, Object obj, boolean z, int i, int i2, int i3) {
            if (c18076b.f53356a.equals(obj)) {
                return (z && c18076b.f53357b == i && c18076b.f53358c == i2) || (!z && c18076b.f53357b == -1 && c18076b.f53360e == i3);
            }
            return false;
        }

        /* renamed from: b */
        public final void m57416b(of8.C15793a c15793a, x8b.C18076b c18076b, lmh lmhVar) {
            if (c18076b == null) {
                return;
            }
            if (lmhVar.mo6949b(c18076b.f53356a) != -1) {
                c15793a.m42190f(c18076b, lmhVar);
                return;
            }
            lmh lmhVar2 = (lmh) this.f55148c.get(c18076b);
            if (lmhVar2 != null) {
                c15793a.m42190f(c18076b, lmhVar2);
            }
        }

        /* renamed from: d */
        public x8b.C18076b m57417d() {
            return this.f55149d;
        }

        /* renamed from: e */
        public x8b.C18076b m57418e() {
            if (this.f55147b.isEmpty()) {
                return null;
            }
            return (x8b.C18076b) z59.m58773d(this.f55147b);
        }

        /* renamed from: f */
        public lmh m57419f(x8b.C18076b c18076b) {
            return (lmh) this.f55148c.get(c18076b);
        }

        /* renamed from: g */
        public x8b.C18076b m57420g() {
            return this.f55150e;
        }

        /* renamed from: h */
        public x8b.C18076b m57421h() {
            return this.f55151f;
        }

        /* renamed from: j */
        public void m57422j(mad madVar) {
            this.f55149d = m57414c(madVar, this.f55147b, this.f55150e, this.f55146a);
        }

        /* renamed from: k */
        public void m57423k(List list, x8b.C18076b c18076b, mad madVar) {
            this.f55147b = nf8.m40511y(list);
            if (!list.isEmpty()) {
                this.f55150e = (x8b.C18076b) list.get(0);
                this.f55151f = (x8b.C18076b) op0.m42515e(c18076b);
            }
            if (this.f55149d == null) {
                this.f55149d = m57414c(madVar, this.f55147b, this.f55150e, this.f55146a);
            }
            m57425m(madVar.mo7112A());
        }

        /* renamed from: l */
        public void m57424l(mad madVar) {
            this.f55149d = m57414c(madVar, this.f55147b, this.f55150e, this.f55146a);
            m57425m(madVar.mo7112A());
        }

        /* renamed from: m */
        public final void m57425m(lmh lmhVar) {
            of8.C15793a c15793aM42177a = of8.m42177a();
            if (this.f55147b.isEmpty()) {
                m57416b(c15793aM42177a, this.f55150e, lmhVar);
                if (!r6c.m46255a(this.f55151f, this.f55150e)) {
                    m57416b(c15793aM42177a, this.f55151f, lmhVar);
                }
                if (!r6c.m46255a(this.f55149d, this.f55150e) && !r6c.m46255a(this.f55149d, this.f55151f)) {
                    m57416b(c15793aM42177a, this.f55149d, lmhVar);
                }
            } else {
                for (int i = 0; i < this.f55147b.size(); i++) {
                    m57416b(c15793aM42177a, (x8b.C18076b) this.f55147b.get(i), lmhVar);
                }
                if (!this.f55147b.contains(this.f55149d)) {
                    m57416b(c15793aM42177a, this.f55149d, lmhVar);
                }
            }
            this.f55148c = c15793aM42177a.m42187c();
        }
    }

    public ya5(jb3 jb3Var) {
        this.f55137a = (jb3) op0.m42515e(jb3Var);
        this.f55142f = new dga(sqi.m48716U(), jb3Var, new dga.InterfaceC12902b() { // from class: o.xa5
            @Override // p001o.dga.InterfaceC12902b
            /* renamed from: a */
            public final void mo23025a(Object obj, k27 k27Var) {
                ya5.M1((gc0) obj, k27Var);
            }
        });
        lmh.C15105b c15105b = new lmh.C15105b();
        this.f55138b = c15105b;
        this.f55139c = new lmh.C15106c();
        this.f55140d = new C18363a(c15105b);
        this.f55141e = new SparseArray();
    }

    public static /* synthetic */ void E2(gc0.C13667a c13667a, int i, mad.C15267e c15267e, mad.C15267e c15267e2, gc0 gc0Var) {
        gc0Var.m28333T(c13667a, i);
        gc0Var.mo28324J(c13667a, c15267e, c15267e2, i);
    }

    public static /* synthetic */ void M1(gc0 gc0Var, k27 k27Var) {
    }

    public static /* synthetic */ void P2(gc0.C13667a c13667a, String str, long j, long j2, gc0 gc0Var) {
        gc0Var.m28334U(c13667a, str, j);
        gc0Var.m28335V(c13667a, str, j2, j);
    }

    public static /* synthetic */ void Q1(gc0.C13667a c13667a, String str, long j, long j2, gc0 gc0Var) {
        gc0Var.m28316B(c13667a, str, j);
        gc0Var.m28319E(c13667a, str, j2, j);
    }

    public static /* synthetic */ void V2(gc0.C13667a c13667a, bvi bviVar, gc0 gc0Var) {
        gc0Var.r0(c13667a, bviVar);
        gc0Var.g0(c13667a, bviVar.f16883a, bviVar.f16884b, bviVar.f16885c, bviVar.f16886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X2(mad madVar, gc0 gc0Var, k27 k27Var) {
        gc0Var.c0(madVar, new gc0.C13668b(k27Var, this.f55141e));
    }

    public static /* synthetic */ void k2(gc0.C13667a c13667a, int i, gc0 gc0Var) {
        gc0Var.m28329O(c13667a);
        gc0Var.m28352n(c13667a, i);
    }

    public static /* synthetic */ void o2(gc0.C13667a c13667a, boolean z, gc0 gc0Var) {
        gc0Var.m28348i(c13667a, z);
        gc0Var.m28331Q(c13667a, z);
    }

    @Override // p001o.ac0
    /* renamed from: A */
    public final void mo16826A(final long j, final int i) {
        final gc0.C13667a c13667aJ1 = J1();
        Z2(c13667aJ1, 1021, new dga.InterfaceC12901a() { // from class: o.l85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28326L(c13667aJ1, j, i);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: B */
    public final void mo38652B(final int i) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 6, new dga.InterfaceC12901a() { // from class: o.h95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28347h(c13667aE1, i);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: C */
    public void mo38653C(boolean z) {
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: D */
    public void mo7823D(final euh euhVar) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 2, new dga.InterfaceC12901a() { // from class: o.t85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).p0(c13667aE1, euhVar);
            }
        });
    }

    @Override // p001o.mz5
    /* renamed from: E */
    public final void mo7404E(int i, x8b.C18076b c18076b) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1026, new dga.InterfaceC12901a() { // from class: o.ta5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).d0(c13667aI1);
            }
        });
    }

    public final gc0.C13667a E1() {
        return F1(this.f55140d.m57417d());
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: F */
    public final void mo734F(final int i) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 4, new dga.InterfaceC12901a() { // from class: o.m95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28356s(c13667aE1, i);
            }
        });
    }

    public final gc0.C13667a F1(x8b.C18076b c18076b) {
        op0.m42515e(this.f55143g);
        lmh lmhVarM57419f = c18076b == null ? null : this.f55140d.m57419f(c18076b);
        if (c18076b != null && lmhVarM57419f != null) {
            return G1(lmhVarM57419f, lmhVarM57419f.mo22380h(c18076b.f53356a, this.f55138b).f34059c, c18076b);
        }
        int iMo7128W = this.f55143g.mo7128W();
        lmh lmhVarMo7112A = this.f55143g.mo7112A();
        if (!(iMo7128W < lmhVarMo7112A.mo6954p())) {
            lmhVarMo7112A = lmh.f34048a;
        }
        return G1(lmhVarMo7112A, iMo7128W, null);
    }

    @Override // p001o.ta1.InterfaceC17036a
    /* renamed from: G */
    public final void mo49586G(final int i, final long j, final long j2) {
        final gc0.C13667a c13667aH1 = H1();
        Z2(c13667aH1, 1006, new dga.InterfaceC12901a() { // from class: o.qa5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).u0(c13667aH1, i, j, j2);
            }
        });
    }

    public final gc0.C13667a G1(lmh lmhVar, int i, x8b.C18076b c18076b) {
        long jMo7127T;
        x8b.C18076b c18076b2 = lmhVar.m37477q() ? null : c18076b;
        long jElapsedRealtime = this.f55137a.elapsedRealtime();
        boolean z = lmhVar.equals(this.f55143g.mo7112A()) && i == this.f55143g.mo7128W();
        long jM37500b = 0;
        if (c18076b2 != null && c18076b2.m55842b()) {
            if (z && this.f55143g.mo7147w() == c18076b2.f53357b && this.f55143g.mo7125R() == c18076b2.f53358c) {
                jM37500b = this.f55143g.e0();
            }
        } else {
            if (z) {
                jMo7127T = this.f55143g.mo7127T();
                return new gc0.C13667a(jElapsedRealtime, lmhVar, i, c18076b2, jMo7127T, this.f55143g.mo7112A(), this.f55143g.mo7128W(), this.f55140d.m57417d(), this.f55143g.e0(), this.f55143g.mo7138i());
            }
            if (!lmhVar.m37477q()) {
                jM37500b = lmhVar.m37476n(i, this.f55139c).m37500b();
            }
        }
        jMo7127T = jM37500b;
        return new gc0.C13667a(jElapsedRealtime, lmhVar, i, c18076b2, jMo7127T, this.f55143g.mo7112A(), this.f55143g.mo7128W(), this.f55140d.m57417d(), this.f55143g.e0(), this.f55143g.mo7138i());
    }

    @Override // p001o.ac0
    /* renamed from: H */
    public final void mo16827H() {
        if (this.f55145q) {
            return;
        }
        final gc0.C13667a c13667aE1 = E1();
        this.f55145q = true;
        Z2(c13667aE1, -1, new dga.InterfaceC12901a() { // from class: o.w95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28338Y(c13667aE1);
            }
        });
    }

    public final gc0.C13667a H1() {
        return F1(this.f55140d.m57418e());
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: I */
    public final void mo38654I(final boolean z) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 9, new dga.InterfaceC12901a() { // from class: o.l95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28355r(c13667aE1, z);
            }
        });
    }

    public final gc0.C13667a I1(int i, x8b.C18076b c18076b) {
        op0.m42515e(this.f55143g);
        if (c18076b != null) {
            return this.f55140d.m57419f(c18076b) != null ? F1(c18076b) : G1(lmh.f34048a, i, c18076b);
        }
        lmh lmhVarMo7112A = this.f55143g.mo7112A();
        if (!(i < lmhVarMo7112A.mo6954p())) {
            lmhVarMo7112A = lmh.f34048a;
        }
        return G1(lmhVarMo7112A, i, null);
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: J */
    public final void mo7824J(final mad.C15267e c15267e, final mad.C15267e c15267e2, final int i) {
        if (i == 1) {
            this.f55145q = false;
        }
        this.f55140d.m57422j((mad) op0.m42515e(this.f55143g));
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 11, new dga.InterfaceC12901a() { // from class: o.q85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ya5.E2(c13667aE1, i, c15267e, c15267e2, (gc0) obj);
            }
        });
    }

    public final gc0.C13667a J1() {
        return F1(this.f55140d.m57420g());
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: K */
    public final void mo735K(final iad iadVar) {
        final gc0.C13667a c13667aL1 = L1(iadVar);
        Z2(c13667aL1, 10, new dga.InterfaceC12901a() { // from class: o.d95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).mo28345f(c13667aL1, iadVar);
            }
        });
    }

    public final gc0.C13667a K1() {
        return F1(this.f55140d.m57421h());
    }

    @Override // p001o.e9b
    /* renamed from: L */
    public final void mo7406L(int i, x8b.C18076b c18076b, final u2b u2bVar) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, new dga.InterfaceC12901a() { // from class: o.na5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28359v(c13667aI1, u2bVar);
            }
        });
    }

    public final gc0.C13667a L1(iad iadVar) {
        x8b.C18076b c18076b;
        return (!(iadVar instanceof qm6) || (c18076b = ((qm6) iadVar).f42144M) == null) ? E1() : F1(c18076b);
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: M */
    public final void mo736M(lmh lmhVar, final int i) {
        this.f55140d.m57424l((mad) op0.m42515e(this.f55143g));
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 0, new dga.InterfaceC12901a() { // from class: o.a95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).o0(c13667aE1, i);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: O */
    public void mo38655O(final int i, final boolean z) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 30, new dga.InterfaceC12901a() { // from class: o.v85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).i0(c13667aE1, i, z);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: P */
    public void mo38656P(final C2182b c2182b) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 14, new dga.InterfaceC12901a() { // from class: o.p95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m0(c13667aE1, c2182b);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: Q */
    public final void mo38657Q(final wx0 wx0Var) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 20, new dga.InterfaceC12901a() { // from class: o.t95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28351l(c13667aK1, wx0Var);
            }
        });
    }

    @Override // p001o.mz5
    /* renamed from: R */
    public final void mo7407R(int i, x8b.C18076b c18076b, final int i2) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1022, new dga.InterfaceC12901a() { // from class: o.ea5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ya5.k2(c13667aI1, i2, (gc0) obj);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: S */
    public void mo7825S() {
    }

    @Override // p001o.mz5
    /* renamed from: T */
    public final void mo7408T(int i, x8b.C18076b c18076b, final Exception exc) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1024, new dga.InterfaceC12901a() { // from class: o.aa5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28357t(c13667aI1, exc);
            }
        });
    }

    @Override // p001o.e9b
    /* renamed from: U */
    public final void mo7409U(int i, x8b.C18076b c18076b, final u2b u2bVar) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new dga.InterfaceC12901a() { // from class: o.fa5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).mo28360w(c13667aI1, u2bVar);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: V */
    public final void mo7826V(final int i, final int i2) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 24, new dga.InterfaceC12901a() { // from class: o.y95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28344e(c13667aK1, i, i2);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: W */
    public void mo38658W(final mad.C15264b c15264b) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 13, new dga.InterfaceC12901a() { // from class: o.r85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28328N(c13667aE1, c15264b);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: X */
    public void mo7684X(mad madVar, mad.C15265c c15265c) {
    }

    @Override // p001o.e9b
    /* renamed from: Y */
    public final void mo7410Y(int i, x8b.C18076b c18076b, final tga tgaVar, final u2b u2bVar) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1001, new dga.InterfaceC12901a() { // from class: o.ia5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28317C(c13667aI1, tgaVar, u2bVar);
            }
        });
    }

    public final void Y2() {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 1028, new dga.InterfaceC12901a() { // from class: o.ga5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28346g(c13667aE1);
            }
        });
        this.f55142f.m23021j();
    }

    @Override // p001o.mz5
    /* renamed from: Z */
    public final void mo7411Z(int i, x8b.C18076b c18076b) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1023, new dga.InterfaceC12901a() { // from class: o.pa5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28322H(c13667aI1);
            }
        });
    }

    public final void Z2(gc0.C13667a c13667a, int i, dga.InterfaceC12901a interfaceC12901a) {
        this.f55141e.put(i, c13667a);
        this.f55142f.m23023l(i, interfaceC12901a);
    }

    @Override // p001o.ac0
    /* renamed from: a */
    public void mo16828a(final kz0.C14937a c14937a) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1032, new dga.InterfaceC12901a() { // from class: o.ra5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28342c(c13667aK1, c14937a);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    public void a0(int i) {
    }

    @Override // p001o.ac0
    /* renamed from: b */
    public void mo16829b(final kz0.C14937a c14937a) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1031, new dga.InterfaceC12901a() { // from class: o.ma5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28350k(c13667aK1, c14937a);
            }
        });
    }

    @Override // p001o.e9b
    public final void b0(int i, x8b.C18076b c18076b, final tga tgaVar, final u2b u2bVar) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1000, new dga.InterfaceC12901a() { // from class: o.w85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28339Z(c13667aI1, tgaVar, u2bVar);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: c */
    public final void mo7827c(final bvi bviVar) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 25, new dga.InterfaceC12901a() { // from class: o.ja5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ya5.V2(c13667aK1, bviVar, (gc0) obj);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    public void c0(final iad iadVar) {
        final gc0.C13667a c13667aL1 = L1(iadVar);
        Z2(c13667aL1, 10, new dga.InterfaceC12901a() { // from class: o.o95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).a0(c13667aL1, iadVar);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: d */
    public final void mo38659d(final boolean z) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 23, new dga.InterfaceC12901a() { // from class: o.sa5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).s0(c13667aK1, z);
            }
        });
    }

    @Override // p001o.e9b
    public final void d0(int i, x8b.C18076b c18076b, final tga tgaVar, final u2b u2bVar, final IOException iOException, final boolean z) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1003, new dga.InterfaceC12901a() { // from class: o.z95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).l0(c13667aI1, tgaVar, u2bVar, iOException, z);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: e */
    public final void mo16830e(final Exception exc) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1014, new dga.InterfaceC12901a() { // from class: o.p85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).b0(c13667aK1, exc);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    public final void e0(final boolean z) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 3, new dga.InterfaceC12901a() { // from class: o.s95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ya5.o2(c13667aE1, z, (gc0) obj);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: f */
    public final void mo16831f(final String str) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1019, new dga.InterfaceC12901a() { // from class: o.va5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28349j(c13667aK1, str);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    public void f0(final yth ythVar) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 19, new dga.InterfaceC12901a() { // from class: o.m85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28318D(c13667aE1, ythVar);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: g */
    public final void mo16832g(final String str, final long j, final long j2) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1016, new dga.InterfaceC12901a() { // from class: o.z85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ya5.P2(c13667aK1, str, j2, j, (gc0) obj);
            }
        });
    }

    @Override // p001o.ac0
    public void g0(final mad madVar, Looper looper) {
        op0.m42517g(this.f55143g == null || this.f55140d.f55147b.isEmpty());
        this.f55143g = (mad) op0.m42515e(madVar);
        this.f55144h = this.f55137a.mo21305b(looper, null);
        this.f55142f = this.f55142f.m23017e(looper, new dga.InterfaceC12902b() { // from class: o.x85
            @Override // p001o.dga.InterfaceC12902b
            /* renamed from: a */
            public final void mo23025a(Object obj, k27 k27Var) {
                this.f53338a.X2(madVar, (gc0) obj, k27Var);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: h */
    public final void mo16833h(final C2181a c2181a, final c85 c85Var) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1017, new dga.InterfaceC12901a() { // from class: o.ua5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28327M(c13667aK1, c2181a, c85Var);
            }
        });
    }

    @Override // p001o.e9b
    public final void h0(int i, x8b.C18076b c18076b, final tga tgaVar, final u2b u2bVar) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1002, new dga.InterfaceC12901a() { // from class: o.ha5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).q0(c13667aI1, tgaVar, u2bVar);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: i */
    public final void mo16834i(final y75 y75Var) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1007, new dga.InterfaceC12901a() { // from class: o.g95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28354q(c13667aK1, y75Var);
            }
        });
    }

    @Override // p001o.mz5
    public final void i0(int i, x8b.C18076b c18076b) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1027, new dga.InterfaceC12901a() { // from class: o.ca5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28340a(c13667aI1);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: j */
    public final void mo16835j(final String str) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1012, new dga.InterfaceC12901a() { // from class: o.da5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28353o(c13667aK1, str);
            }
        });
    }

    @Override // p001o.ac0
    public void j0(gc0 gc0Var) {
        op0.m42515e(gc0Var);
        this.f55142f.m23015c(gc0Var);
    }

    @Override // p001o.ac0
    /* renamed from: k */
    public final void mo16836k(final String str, final long j, final long j2) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1008, new dga.InterfaceC12901a() { // from class: o.f95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ya5.Q1(c13667aK1, str, j2, j, (gc0) obj);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    public final void k0(final boolean z, final int i) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, -1, new dga.InterfaceC12901a() { // from class: o.oa5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28320F(c13667aE1, z, i);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: l */
    public void mo38660l(final List list) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 27, new dga.InterfaceC12901a() { // from class: o.y85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).t0(c13667aE1, list);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    public void l0(final sq5 sq5Var) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 29, new dga.InterfaceC12901a() { // from class: o.s85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28362y(c13667aE1, sq5Var);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: m */
    public final void mo16837m(final long j) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1010, new dga.InterfaceC12901a() { // from class: o.v95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).f0(c13667aK1, j);
            }
        });
    }

    @Override // p001o.ac0
    public final void m0(List list, x8b.C18076b c18076b) {
        this.f55140d.m57423k(list, c18076b, (mad) op0.m42515e(this.f55143g));
    }

    @Override // p001o.ac0
    /* renamed from: n */
    public final void mo16838n(final Exception exc) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1030, new dga.InterfaceC12901a() { // from class: o.o85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28343d(c13667aK1, exc);
            }
        });
    }

    @Override // p001o.mz5
    public final void n0(int i, x8b.C18076b c18076b) {
        final gc0.C13667a c13667aI1 = I1(i, c18076b);
        Z2(c13667aI1, 1025, new dga.InterfaceC12901a() { // from class: o.la5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28332S(c13667aI1);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: o */
    public final void mo16839o(final y75 y75Var) {
        final gc0.C13667a c13667aJ1 = J1();
        Z2(c13667aJ1, 1013, new dga.InterfaceC12901a() { // from class: o.r95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).k0(c13667aJ1, y75Var);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    public final void o0(final boolean z, final int i) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 5, new dga.InterfaceC12901a() { // from class: o.j95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28341b(c13667aE1, z, i);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: p */
    public final void mo16840p(final y75 y75Var) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1015, new dga.InterfaceC12901a() { // from class: o.c95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).n0(c13667aK1, y75Var);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    public final void p0(final s2b s2bVar, final int i) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 1, new dga.InterfaceC12901a() { // from class: o.n95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28323I(c13667aE1, s2bVar, i);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: q */
    public final void mo38661q(final kad kadVar) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 12, new dga.InterfaceC12901a() { // from class: o.wa5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).h0(c13667aE1, kadVar);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    public void q0(final boolean z) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 7, new dga.InterfaceC12901a() { // from class: o.k95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28336W(c13667aE1, z);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: r */
    public final void mo16841r(final int i, final long j) {
        final gc0.C13667a c13667aJ1 = J1();
        Z2(c13667aJ1, 1018, new dga.InterfaceC12901a() { // from class: o.b95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28330P(c13667aJ1, i, j);
            }
        });
    }

    @Override // p001o.ac0
    public void release() {
        ((uw7) op0.m42519i(this.f55144h)).mo28839h(new Runnable() { // from class: o.u95
            @Override // java.lang.Runnable
            public final void run() {
                this.f48591a.Y2();
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: s */
    public final void mo16842s(final y75 y75Var) {
        final gc0.C13667a c13667aJ1 = J1();
        Z2(c13667aJ1, 1020, new dga.InterfaceC12901a() { // from class: o.x95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).mo28363z(c13667aJ1, y75Var);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: t */
    public final void mo16843t(final Object obj, final long j) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 26, new dga.InterfaceC12901a() { // from class: o.ka5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj2) {
                ((gc0) obj2).m28315A(c13667aK1, obj, j);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: u */
    public void mo7828u(final hd4 hd4Var) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 27, new dga.InterfaceC12901a() { // from class: o.i95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28361x(c13667aE1, hd4Var);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: v */
    public final void mo38662v(final int i) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 8, new dga.InterfaceC12901a() { // from class: o.n85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28358u(c13667aE1, i);
            }
        });
    }

    @Override // p001o.mad.InterfaceC15266d
    /* renamed from: w */
    public final void mo38663w(final Metadata metadata) {
        final gc0.C13667a c13667aE1 = E1();
        Z2(c13667aE1, 28, new dga.InterfaceC12901a() { // from class: o.e95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28325K(c13667aE1, metadata);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: x */
    public final void mo16844x(final C2181a c2181a, final c85 c85Var) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1009, new dga.InterfaceC12901a() { // from class: o.q95
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28337X(c13667aK1, c2181a, c85Var);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: y */
    public final void mo16845y(final Exception exc) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1029, new dga.InterfaceC12901a() { // from class: o.u85
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).m28321G(c13667aK1, exc);
            }
        });
    }

    @Override // p001o.ac0
    /* renamed from: z */
    public final void mo16846z(final int i, final long j, final long j2) {
        final gc0.C13667a c13667aK1 = K1();
        Z2(c13667aK1, 1011, new dga.InterfaceC12901a() { // from class: o.ba5
            @Override // p001o.dga.InterfaceC12901a
            public final void invoke(Object obj) {
                ((gc0) obj).j0(c13667aK1, i, j, j2);
            }
        });
    }
}
