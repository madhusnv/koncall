package p001o;

import android.util.Pair;
import p001o.lmh;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class cta extends xcj {

    /* renamed from: H */
    public final boolean f18616H;

    /* renamed from: L */
    public final lmh.C15106c f18617L;

    /* renamed from: M */
    public final lmh.C15105b f18618M;

    /* renamed from: Q */
    public C12742a f18619Q;

    /* renamed from: X */
    public bta f18620X;

    /* renamed from: Y */
    public boolean f18621Y;

    /* renamed from: Z */
    public boolean f18622Z;
    public boolean h0;

    /* renamed from: o.cta$a */
    public static final class C12742a extends uf7 {

        /* renamed from: h */
        public static final Object f18623h = new Object();

        /* renamed from: f */
        public final Object f18624f;

        /* renamed from: g */
        public final Object f18625g;

        public C12742a(lmh lmhVar, Object obj, Object obj2) {
            super(lmhVar);
            this.f18624f = obj;
            this.f18625g = obj2;
        }

        /* renamed from: u */
        public static C12742a m21786u(s2b s2bVar) {
            return new C12742a(new C12743b(s2bVar), lmh.C15106c.f34070q, f18623h);
        }

        /* renamed from: v */
        public static C12742a m21787v(lmh lmhVar, Object obj, Object obj2) {
            return new C12742a(lmhVar, obj, obj2);
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: b */
        public int mo6949b(Object obj) {
            Object obj2;
            lmh lmhVar = this.f48879e;
            if (f18623h.equals(obj) && (obj2 = this.f18625g) != null) {
                obj = obj2;
            }
            return lmhVar.mo6949b(obj);
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: g */
        public lmh.C15105b mo6950g(int i, lmh.C15105b c15105b, boolean z) {
            this.f48879e.mo6950g(i, c15105b, z);
            if (sqi.m48724c(c15105b.f34058b, this.f18625g) && z) {
                c15105b.f34058b = f18623h;
            }
            return c15105b;
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: m */
        public Object mo6952m(int i) {
            Object objMo6952m = this.f48879e.mo6952m(i);
            return sqi.m48724c(objMo6952m, this.f18625g) ? f18623h : objMo6952m;
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: o */
        public lmh.C15106c mo6953o(int i, lmh.C15106c c15106c, long j) {
            this.f48879e.mo6953o(i, c15106c, j);
            if (sqi.m48724c(c15106c.f34080a, this.f18624f)) {
                c15106c.f34080a = lmh.C15106c.f34070q;
            }
            return c15106c;
        }

        /* renamed from: t */
        public C12742a m21788t(lmh lmhVar) {
            return new C12742a(lmhVar, this.f18624f, this.f18625g);
        }
    }

    /* renamed from: o.cta$b */
    public static final class C12743b extends lmh {

        /* renamed from: e */
        public final s2b f18626e;

        public C12743b(s2b s2bVar) {
            this.f18626e = s2bVar;
        }

        @Override // p001o.lmh
        /* renamed from: b */
        public int mo6949b(Object obj) {
            return obj == C12742a.f18623h ? 0 : -1;
        }

        @Override // p001o.lmh
        /* renamed from: g */
        public lmh.C15105b mo6950g(int i, lmh.C15105b c15105b, boolean z) {
            c15105b.m37498t(z ? 0 : null, z ? C12742a.f18623h : null, 0, -9223372036854775807L, 0L, rv.f44094g, true);
            return c15105b;
        }

        @Override // p001o.lmh
        /* renamed from: i */
        public int mo6951i() {
            return 1;
        }

        @Override // p001o.lmh
        /* renamed from: m */
        public Object mo6952m(int i) {
            return C12742a.f18623h;
        }

        @Override // p001o.lmh
        /* renamed from: o */
        public lmh.C15106c mo6953o(int i, lmh.C15106c c15106c, long j) {
            c15106c.m37505g(lmh.C15106c.f34070q, this.f18626e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            c15106c.f34090k = true;
            return c15106c;
        }

        @Override // p001o.lmh
        /* renamed from: p */
        public int mo6954p() {
            return 1;
        }
    }

    public cta(x8b x8bVar, boolean z) {
        super(x8bVar);
        this.f18616H = z && x8bVar.mo55839l();
        this.f18617L = new lmh.C15106c();
        this.f18618M = new lmh.C15105b();
        lmh lmhVarMo55840p = x8bVar.mo55840p();
        if (lmhVarMo55840p == null) {
            this.f18619Q = C12742a.m21786u(x8bVar.mo6932b());
        } else {
            this.f18619Q = C12742a.m21787v(lmhVarMo55840p, null, null);
            this.h0 = true;
        }
    }

    @Override // p001o.oo3, p001o.be1
    /* renamed from: D */
    public void mo6920D() {
        this.f18622Z = false;
        this.f18621Y = false;
        super.mo6920D();
    }

    @Override // p001o.xcj
    /* renamed from: M */
    public x8b.C18076b mo21777M(x8b.C18076b c18076b) {
        return c18076b.m55841a(m21781W(c18076b.f53356a));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // p001o.xcj
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo21778S(lmh lmhVar) {
        x8b.C18076b c18076bM55841a;
        if (this.f18622Z) {
            this.f18619Q = this.f18619Q.m21788t(lmhVar);
            bta btaVar = this.f18620X;
            if (btaVar != null) {
                m21784Z(btaVar.m19773l());
            }
        } else {
            if (!lmhVar.m37477q()) {
                lmhVar.m37476n(0, this.f18617L);
                long jM37501c = this.f18617L.m37501c();
                Object obj = this.f18617L.f34080a;
                bta btaVar2 = this.f18620X;
                if (btaVar2 != null) {
                    long jM19774m = btaVar2.m19774m();
                    this.f18619Q.mo22380h(this.f18620X.f16804a.f53356a, this.f18618M);
                    long jM37492n = this.f18618M.m37492n() + jM19774m;
                    long j = jM37492n != this.f18619Q.m37476n(0, this.f18617L).m37501c() ? jM37492n : jM37501c;
                    Pair pairM37474j = lmhVar.m37474j(this.f18617L, this.f18618M, 0, j);
                    Object obj2 = pairM37474j.first;
                    long jLongValue = ((Long) pairM37474j.second).longValue();
                    this.f18619Q = this.h0 ? this.f18619Q.m21788t(lmhVar) : C12742a.m21787v(lmhVar, obj, obj2);
                    bta btaVar3 = this.f18620X;
                    if (btaVar3 != null && m21784Z(jLongValue)) {
                        x8b.C18076b c18076b = btaVar3.f16804a;
                        c18076bM55841a = c18076b.m55841a(m21782X(c18076b.f53356a));
                    }
                }
                this.h0 = true;
                this.f18622Z = true;
                m18729C(this.f18619Q);
                if (c18076bM55841a == null) {
                    ((bta) op0.m42515e(this.f18620X)).m19772a(c18076bM55841a);
                    return;
                }
                return;
            }
            this.f18619Q = this.h0 ? this.f18619Q.m21788t(lmhVar) : C12742a.m21787v(lmhVar, lmh.C15106c.f34070q, C12742a.f18623h);
        }
        c18076bM55841a = null;
        this.h0 = true;
        this.f18622Z = true;
        m18729C(this.f18619Q);
        if (c18076bM55841a == null) {
        }
    }

    @Override // p001o.xcj
    /* renamed from: U */
    public void mo21779U() {
        if (this.f18616H) {
            return;
        }
        this.f18621Y = true;
        m56036T();
    }

    @Override // p001o.x8b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public bta mo6931a(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        bta btaVar = new bta(c18076b, ob0Var, j);
        btaVar.m19779w(this.f53537x);
        if (this.f18622Z) {
            btaVar.m19772a(c18076b.m55841a(m21782X(c18076b.f53356a)));
        } else {
            this.f18620X = btaVar;
            if (!this.f18621Y) {
                this.f18621Y = true;
                m56036T();
            }
        }
        return btaVar;
    }

    /* renamed from: W */
    public final Object m21781W(Object obj) {
        return (this.f18619Q.f18625g == null || !this.f18619Q.f18625g.equals(obj)) ? obj : C12742a.f18623h;
    }

    /* renamed from: X */
    public final Object m21782X(Object obj) {
        return (this.f18619Q.f18625g == null || !obj.equals(C12742a.f18623h)) ? obj : this.f18619Q.f18625g;
    }

    /* renamed from: Y */
    public lmh m21783Y() {
        return this.f18619Q;
    }

    /* renamed from: Z */
    public final boolean m21784Z(long j) {
        bta btaVar = this.f18620X;
        int iMo6949b = this.f18619Q.mo6949b(btaVar.f16804a.f53356a);
        if (iMo6949b == -1) {
            return false;
        }
        long j2 = this.f18619Q.m37473f(iMo6949b, this.f18618M).f34060d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        btaVar.m19777r(j);
        return true;
    }

    @Override // p001o.x8b
    /* renamed from: e */
    public void mo6933e(x4b x4bVar) {
        ((bta) x4bVar).m19778v();
        if (x4bVar == this.f18620X) {
            this.f18620X = null;
        }
    }

    @Override // p001o.oo3, p001o.x8b
    /* renamed from: j */
    public void mo6934j() {
    }

    @Override // p001o.xcj, p001o.x8b
    /* renamed from: n */
    public void mo6935n(s2b s2bVar) {
        if (this.h0) {
            this.f18619Q = this.f18619Q.m21788t(new mmh(this.f18619Q.f48879e, s2bVar));
        } else {
            this.f18619Q = C12742a.m21786u(s2bVar);
        }
        this.f53537x.mo6935n(s2bVar);
    }
}
