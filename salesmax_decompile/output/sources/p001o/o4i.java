package p001o;

/* loaded from: classes4.dex */
public class o4i extends k4i {
    @Override // p001o.k4i
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public m4i mo34977g(Object obj) {
        return ((vn7) obj).unknownFields;
    }

    @Override // p001o.k4i
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo34978h(m4i m4iVar) {
        return m4iVar.m38370f();
    }

    @Override // p001o.k4i
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo34979i(m4i m4iVar) {
        return m4iVar.m38371g();
    }

    @Override // p001o.k4i
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public m4i mo34981k(m4i m4iVar, m4i m4iVar2) {
        return m4iVar2.equals(m4i.m38362e()) ? m4iVar : m4i.m38365k(m4iVar, m4iVar2);
    }

    @Override // p001o.k4i
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public m4i mo34984n() {
        return m4i.m38366l();
    }

    @Override // p001o.k4i
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo34985o(Object obj, m4i m4iVar) {
        mo34986p(obj, m4iVar);
    }

    @Override // p001o.k4i
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo34986p(Object obj, m4i m4iVar) {
        ((vn7) obj).unknownFields = m4iVar;
    }

    @Override // p001o.k4i
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public m4i mo34988r(m4i m4iVar) {
        m4iVar.m38372j();
        return m4iVar;
    }

    @Override // p001o.k4i
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo34989s(m4i m4iVar, bdj bdjVar) {
        m4iVar.m38375o(bdjVar);
    }

    @Override // p001o.k4i
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo34990t(m4i m4iVar, bdj bdjVar) {
        m4iVar.m38376q(bdjVar);
    }

    @Override // p001o.k4i
    /* renamed from: j */
    public void mo34980j(Object obj) {
        mo34977g(obj).m38372j();
    }

    @Override // p001o.k4i
    /* renamed from: q */
    public boolean mo34987q(nce nceVar) {
        return false;
    }

    @Override // p001o.k4i
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo34971a(m4i m4iVar, int i, int i2) {
        m4iVar.m38374n(ebj.m24743c(i, 5), Integer.valueOf(i2));
    }

    @Override // p001o.k4i
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo34972b(m4i m4iVar, int i, long j) {
        m4iVar.m38374n(ebj.m24743c(i, 1), Long.valueOf(j));
    }

    @Override // p001o.k4i
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo34973c(m4i m4iVar, int i, m4i m4iVar2) {
        m4iVar.m38374n(ebj.m24743c(i, 3), m4iVar2);
    }

    @Override // p001o.k4i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo34974d(m4i m4iVar, int i, yq1 yq1Var) {
        m4iVar.m38374n(ebj.m24743c(i, 2), yq1Var);
    }

    @Override // p001o.k4i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo34975e(m4i m4iVar, int i, long j) {
        m4iVar.m38374n(ebj.m24743c(i, 0), Long.valueOf(j));
    }

    @Override // p001o.k4i
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public m4i mo34976f(Object obj) {
        m4i m4iVarMo34977g = mo34977g(obj);
        if (m4iVarMo34977g != m4i.m38362e()) {
            return m4iVarMo34977g;
        }
        m4i m4iVarM38366l = m4i.m38366l();
        mo34986p(obj, m4iVarM38366l);
        return m4iVarM38366l;
    }
}
