package p001o;

/* loaded from: classes4.dex */
public abstract class k4i {
    /* renamed from: a */
    public abstract void mo34971a(Object obj, int i, int i2);

    /* renamed from: b */
    public abstract void mo34972b(Object obj, int i, long j);

    /* renamed from: c */
    public abstract void mo34973c(Object obj, int i, Object obj2);

    /* renamed from: d */
    public abstract void mo34974d(Object obj, int i, yq1 yq1Var);

    /* renamed from: e */
    public abstract void mo34975e(Object obj, int i, long j);

    /* renamed from: f */
    public abstract Object mo34976f(Object obj);

    /* renamed from: g */
    public abstract Object mo34977g(Object obj);

    /* renamed from: h */
    public abstract int mo34978h(Object obj);

    /* renamed from: i */
    public abstract int mo34979i(Object obj);

    /* renamed from: j */
    public abstract void mo34980j(Object obj);

    /* renamed from: k */
    public abstract Object mo34981k(Object obj, Object obj2);

    /* renamed from: l */
    public final void m34982l(Object obj, nce nceVar) {
        while (nceVar.mo37107z() != Integer.MAX_VALUE && m34983m(obj, nceVar)) {
        }
    }

    /* renamed from: m */
    public final boolean m34983m(Object obj, nce nceVar) throws bt8 {
        int iMo37083b = nceVar.mo37083b();
        int iM24741a = ebj.m24741a(iMo37083b);
        int iM24742b = ebj.m24742b(iMo37083b);
        if (iM24742b == 0) {
            mo34975e(obj, iM24741a, nceVar.mo37068G());
            return true;
        }
        if (iM24742b == 1) {
            mo34972b(obj, iM24741a, nceVar.mo37082a());
            return true;
        }
        if (iM24742b == 2) {
            mo34974d(obj, iM24741a, nceVar.mo37096o());
            return true;
        }
        if (iM24742b != 3) {
            if (iM24742b == 4) {
                return false;
            }
            if (iM24742b != 5) {
                throw bt8.m19719d();
            }
            mo34971a(obj, iM24741a, nceVar.mo37102u());
            return true;
        }
        Object objMo34984n = mo34984n();
        int iM24743c = ebj.m24743c(iM24741a, 4);
        m34982l(objMo34984n, nceVar);
        if (iM24743c != nceVar.mo37083b()) {
            throw bt8.m19716a();
        }
        mo34973c(obj, iM24741a, mo34988r(objMo34984n));
        return true;
    }

    /* renamed from: n */
    public abstract Object mo34984n();

    /* renamed from: o */
    public abstract void mo34985o(Object obj, Object obj2);

    /* renamed from: p */
    public abstract void mo34986p(Object obj, Object obj2);

    /* renamed from: q */
    public abstract boolean mo34987q(nce nceVar);

    /* renamed from: r */
    public abstract Object mo34988r(Object obj);

    /* renamed from: s */
    public abstract void mo34989s(Object obj, bdj bdjVar);

    /* renamed from: t */
    public abstract void mo34990t(Object obj, bdj bdjVar);
}
