package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p001o.c9i;
import p001o.mq3;

/* loaded from: classes2.dex */
public abstract class w8i {

    /* renamed from: d */
    public c9i f51622d;

    /* renamed from: e */
    public c9i f51623e;

    /* renamed from: f */
    public c9i f51624f;

    /* renamed from: g */
    public k7g f51625g;

    /* renamed from: h */
    public c9i f51626h;

    /* renamed from: i */
    public Rect f51627i;

    /* renamed from: k */
    public v92 f51629k;

    /* renamed from: l */
    public v92 f51630l;

    /* renamed from: m */
    public String f51631m;

    /* renamed from: a */
    public final Set f51619a = new HashSet();

    /* renamed from: b */
    public final Object f51620b = new Object();

    /* renamed from: c */
    public EnumC17798a f51621c = EnumC17798a.INACTIVE;

    /* renamed from: j */
    public Matrix f51628j = new Matrix();

    /* renamed from: n */
    public bhf f51632n = bhf.m19023b();

    /* renamed from: o */
    public bhf f51633o = bhf.m19023b();

    /* renamed from: o.w8i$a */
    public enum EnumC17798a {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: o.w8i$b */
    public interface InterfaceC17799b {
        /* renamed from: b */
        void mo26114b(w8i w8iVar);

        /* renamed from: e */
        void mo26117e(w8i w8iVar);

        /* renamed from: g */
        void mo26119g(w8i w8iVar);

        /* renamed from: m */
        void mo26124m(w8i w8iVar);
    }

    public w8i(c9i c9iVar) {
        this.f51623e = c9iVar;
        this.f51624f = c9iVar;
    }

    /* renamed from: A */
    public boolean m54068A(int i) {
        Iterator it = mo17070w().iterator();
        while (it.hasNext()) {
            if (vjg.m52894b(i, ((Integer) it.next()).intValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public boolean m54069B(v92 v92Var) {
        int iM54093m = m54093m();
        if (iM54093m == -1 || iM54093m == 0) {
            return false;
        }
        if (iM54093m == 1) {
            return true;
        }
        if (iM54093m == 2) {
            return v92Var.m52466l();
        }
        throw new AssertionError("Unknown mirrorMode: " + iM54093m);
    }

    /* renamed from: C */
    public c9i m54070C(u92 u92Var, c9i c9iVar, c9i c9iVar2) {
        qpb qpbVarA0;
        if (c9iVar2 != null) {
            qpbVarA0 = qpb.b0(c9iVar2);
            qpbVarA0.c0(sjg.f45489u);
        } else {
            qpbVarA0 = qpb.a0();
        }
        if (this.f51623e.mo36957c(qd8.f41684j) || this.f51623e.mo36957c(qd8.f41688n)) {
            mq3.AbstractC15402a abstractC15402a = qd8.f41692r;
            if (qpbVarA0.mo36957c(abstractC15402a)) {
                qpbVarA0.c0(abstractC15402a);
            }
        }
        c9i c9iVar3 = this.f51623e;
        mq3.AbstractC15402a abstractC15402a2 = qd8.f41692r;
        if (c9iVar3.mo36957c(abstractC15402a2)) {
            mq3.AbstractC15402a abstractC15402a3 = qd8.f41690p;
            if (qpbVarA0.mo36957c(abstractC15402a3) && ((mne) this.f51623e.mo36960f(abstractC15402a2)).m39399d() != null) {
                qpbVarA0.c0(abstractC15402a3);
            }
        }
        Iterator it = this.f51623e.mo36956b().iterator();
        while (it.hasNext()) {
            mq3.m39504P(qpbVarA0, qpbVarA0, this.f51623e, (mq3.AbstractC15402a) it.next());
        }
        if (c9iVar != null) {
            for (mq3.AbstractC15402a abstractC15402a4 : c9iVar.mo36956b()) {
                if (!abstractC15402a4.mo28031c().equals(sjg.f45489u.mo28031c())) {
                    mq3.m39504P(qpbVarA0, qpbVarA0, c9iVar, abstractC15402a4);
                }
            }
        }
        if (qpbVarA0.mo36957c(qd8.f41688n)) {
            mq3.AbstractC15402a abstractC15402a5 = qd8.f41684j;
            if (qpbVarA0.mo36957c(abstractC15402a5)) {
                qpbVarA0.c0(abstractC15402a5);
            }
        }
        mq3.AbstractC15402a abstractC15402a6 = qd8.f41692r;
        if (qpbVarA0.mo36957c(abstractC15402a6) && ((mne) qpbVarA0.mo36960f(abstractC15402a6)).m39396a() != 0) {
            qpbVarA0.mo45760N(c9i.f17559C, Boolean.TRUE);
        }
        return mo17063J(u92Var, mo17071y(qpbVarA0));
    }

    /* renamed from: D */
    public final void m54071D() {
        this.f51621c = EnumC17798a.ACTIVE;
        m54074G();
    }

    /* renamed from: E */
    public final void m54072E() {
        this.f51621c = EnumC17798a.INACTIVE;
        m54074G();
    }

    /* renamed from: F */
    public final void m54073F() {
        Iterator it = this.f51619a.iterator();
        while (it.hasNext()) {
            ((InterfaceC17799b) it.next()).mo26124m(this);
        }
    }

    /* renamed from: G */
    public final void m54074G() {
        int iOrdinal = this.f51621c.ordinal();
        if (iOrdinal == 0) {
            Iterator it = this.f51619a.iterator();
            while (it.hasNext()) {
                ((InterfaceC17799b) it.next()).mo26114b(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = this.f51619a.iterator();
            while (it2.hasNext()) {
                ((InterfaceC17799b) it2.next()).mo26119g(this);
            }
        }
    }

    /* renamed from: H */
    public void mo29952H() {
    }

    /* renamed from: I */
    public void mo48155I() {
    }

    /* renamed from: J */
    public abstract c9i mo17063J(u92 u92Var, c9i.InterfaceC12595a interfaceC12595a);

    /* renamed from: K */
    public void mo29953K() {
    }

    /* renamed from: L */
    public void mo29954L() {
    }

    /* renamed from: M */
    public abstract k7g mo17064M(mq3 mq3Var);

    /* renamed from: N */
    public abstract k7g mo17065N(k7g k7gVar, k7g k7gVar2);

    /* renamed from: O */
    public void mo17066O() {
    }

    /* renamed from: P */
    public final void m54075P(InterfaceC17799b interfaceC17799b) {
        this.f51619a.remove(interfaceC17799b);
    }

    /* renamed from: Q */
    public void m54076Q(n92 n92Var) {
        fgd.m26657a(true);
    }

    /* renamed from: R */
    public void m54077R(Matrix matrix) {
        this.f51628j = new Matrix(matrix);
    }

    /* renamed from: S */
    public void mo17067S(Rect rect) {
        this.f51627i = rect;
    }

    /* renamed from: T */
    public final void m54078T(v92 v92Var) {
        mo17066O();
        synchronized (this.f51620b) {
            v92 v92Var2 = this.f51629k;
            if (v92Var == v92Var2) {
                m54075P(v92Var2);
                this.f51629k = null;
            }
            v92 v92Var3 = this.f51630l;
            if (v92Var == v92Var3) {
                m54075P(v92Var3);
                this.f51630l = null;
            }
        }
        this.f51625g = null;
        this.f51627i = null;
        this.f51624f = this.f51623e;
        this.f51622d = null;
        this.f51626h = null;
    }

    /* renamed from: U */
    public void m54079U(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f51632n = (bhf) list.get(0);
        if (list.size() > 1) {
            this.f51633o = (bhf) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (yj5 yj5Var : ((bhf) it.next()).m19035n()) {
                if (yj5Var.m57869g() == null) {
                    yj5Var.m57877s(getClass());
                }
            }
        }
    }

    /* renamed from: V */
    public void m54080V(k7g k7gVar, k7g k7gVar2) {
        this.f51625g = mo17065N(k7gVar, k7gVar2);
    }

    /* renamed from: W */
    public void m54081W(mq3 mq3Var) {
        this.f51625g = mo17064M(mq3Var);
    }

    /* renamed from: a */
    public final void m54082a(InterfaceC17799b interfaceC17799b) {
        this.f51619a.add(interfaceC17799b);
    }

    /* renamed from: b */
    public final void m54083b(v92 v92Var, v92 v92Var2, c9i c9iVar, c9i c9iVar2) {
        synchronized (this.f51620b) {
            this.f51629k = v92Var;
            this.f51630l = v92Var2;
            m54082a(v92Var);
            if (v92Var2 != null) {
                m54082a(v92Var2);
            }
        }
        this.f51622d = c9iVar;
        this.f51626h = c9iVar2;
        this.f51624f = m54070C(v92Var.mo26122j(), this.f51622d, this.f51626h);
        mo29952H();
    }

    /* renamed from: c */
    public int m54084c() {
        return ((qd8) this.f51624f).m45163o(-1);
    }

    /* renamed from: d */
    public k7g m54085d() {
        return this.f51625g;
    }

    /* renamed from: e */
    public Size m54086e() {
        k7g k7gVar = this.f51625g;
        if (k7gVar != null) {
            return k7gVar.mo35129e();
        }
        return null;
    }

    /* renamed from: f */
    public v92 m54087f() {
        v92 v92Var;
        synchronized (this.f51620b) {
            v92Var = this.f51629k;
        }
        return v92Var;
    }

    /* renamed from: g */
    public z82 m54088g() {
        synchronized (this.f51620b) {
            v92 v92Var = this.f51629k;
            if (v92Var == null) {
                return z82.f56683a;
            }
            return v92Var.mo26115c();
        }
    }

    /* renamed from: h */
    public String m54089h() {
        return ((v92) fgd.m26664h(m54087f(), "No camera attached to use case: " + this)).mo26122j().mo38380b();
    }

    /* renamed from: i */
    public c9i m54090i() {
        return this.f51624f;
    }

    /* renamed from: j */
    public abstract c9i mo17069j(boolean z, d9i d9iVar);

    /* renamed from: k */
    public n92 m54091k() {
        return null;
    }

    /* renamed from: l */
    public int m54092l() {
        return this.f51624f.mo19021n();
    }

    /* renamed from: m */
    public int m54093m() {
        return ((qd8) this.f51624f).m45159V(-1);
    }

    /* renamed from: n */
    public String m54094n() {
        String strM48394p = this.f51624f.m48394p("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strM48394p);
        return strM48394p;
    }

    /* renamed from: o */
    public String m54095o() {
        return this.f51631m;
    }

    /* renamed from: p */
    public int m54096p(v92 v92Var) {
        return m54097q(v92Var, false);
    }

    /* renamed from: q */
    public int m54097q(v92 v92Var, boolean z) {
        int iMo38387j = v92Var.mo26122j().mo38387j(m54103x());
        return !v92Var.mo42848p() && z ? wuh.m55052u(-iMo38387j) : iMo38387j;
    }

    /* renamed from: r */
    public v92 m54098r() {
        v92 v92Var;
        synchronized (this.f51620b) {
            v92Var = this.f51630l;
        }
        return v92Var;
    }

    /* renamed from: s */
    public String m54099s() {
        if (m54098r() == null) {
            return null;
        }
        return m54098r().mo26122j().mo38380b();
    }

    /* renamed from: t */
    public bhf m54100t() {
        return this.f51633o;
    }

    /* renamed from: u */
    public Matrix m54101u() {
        return this.f51628j;
    }

    /* renamed from: v */
    public bhf m54102v() {
        return this.f51632n;
    }

    /* renamed from: w */
    public abstract Set mo17070w();

    /* renamed from: x */
    public int m54103x() {
        return ((qd8) this.f51624f).m45154D(0);
    }

    /* renamed from: y */
    public abstract c9i.InterfaceC12595a mo17071y(mq3 mq3Var);

    /* renamed from: z */
    public Rect m54104z() {
        return this.f51627i;
    }
}
