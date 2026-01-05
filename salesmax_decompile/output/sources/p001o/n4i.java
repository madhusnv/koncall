package p001o;

/* loaded from: classes6.dex */
public class n4i extends j4i {
    @Override // p001o.j4i
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public l4i mo33248g(Object obj) {
        return ((wn7) obj).unknownFields;
    }

    @Override // p001o.j4i
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo33249h(l4i l4iVar) {
        return l4iVar.m36572d();
    }

    @Override // p001o.j4i
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo33250i(l4i l4iVar) {
        return l4iVar.m36573e();
    }

    @Override // p001o.j4i
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public l4i mo33252k(l4i l4iVar, l4i l4iVar2) {
        return l4iVar2.equals(l4i.m36562c()) ? l4iVar : l4i.m36565m(l4iVar, l4iVar2);
    }

    @Override // p001o.j4i
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public l4i mo33255n() {
        return l4i.m36566n();
    }

    @Override // p001o.j4i
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo33256o(Object obj, l4i l4iVar) {
        mo33257p(obj, l4iVar);
    }

    @Override // p001o.j4i
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo33257p(Object obj, l4i l4iVar) {
        ((wn7) obj).unknownFields = l4iVar;
    }

    @Override // p001o.j4i
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public l4i mo33259r(l4i l4iVar) {
        l4iVar.m36574h();
        return l4iVar;
    }

    @Override // p001o.j4i
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo33260s(l4i l4iVar, cdj cdjVar) {
        l4iVar.m36581s(cdjVar);
    }

    @Override // p001o.j4i
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo33261t(l4i l4iVar, cdj cdjVar) {
        l4iVar.m36582u(cdjVar);
    }

    @Override // p001o.j4i
    /* renamed from: j */
    public void mo33251j(Object obj) {
        mo33248g(obj).m36574h();
    }

    @Override // p001o.j4i
    /* renamed from: q */
    public boolean mo33258q(mce mceVar) {
        return false;
    }

    @Override // p001o.j4i
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo33242a(l4i l4iVar, int i, int i2) {
        l4iVar.m36580q(fbj.m26427c(i, 5), Integer.valueOf(i2));
    }

    @Override // p001o.j4i
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo33243b(l4i l4iVar, int i, long j) {
        l4iVar.m36580q(fbj.m26427c(i, 1), Long.valueOf(j));
    }

    @Override // p001o.j4i
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo33244c(l4i l4iVar, int i, l4i l4iVar2) {
        l4iVar.m36580q(fbj.m26427c(i, 3), l4iVar2);
    }

    @Override // p001o.j4i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo33245d(l4i l4iVar, int i, xq1 xq1Var) {
        l4iVar.m36580q(fbj.m26427c(i, 2), xq1Var);
    }

    @Override // p001o.j4i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo33246e(l4i l4iVar, int i, long j) {
        l4iVar.m36580q(fbj.m26427c(i, 0), Long.valueOf(j));
    }

    @Override // p001o.j4i
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public l4i mo33247f(Object obj) {
        l4i l4iVarMo33248g = mo33248g(obj);
        if (l4iVarMo33248g != l4i.m36562c()) {
            return l4iVarMo33248g;
        }
        l4i l4iVarM36566n = l4i.m36566n();
        mo33257p(obj, l4iVarM36566n);
        return l4iVarM36566n;
    }
}
