package p001o;

/* loaded from: classes6.dex */
public abstract class j4i {
    /* renamed from: a */
    public abstract void mo33242a(Object obj, int i, int i2);

    /* renamed from: b */
    public abstract void mo33243b(Object obj, int i, long j);

    /* renamed from: c */
    public abstract void mo33244c(Object obj, int i, Object obj2);

    /* renamed from: d */
    public abstract void mo33245d(Object obj, int i, xq1 xq1Var);

    /* renamed from: e */
    public abstract void mo33246e(Object obj, int i, long j);

    /* renamed from: f */
    public abstract Object mo33247f(Object obj);

    /* renamed from: g */
    public abstract Object mo33248g(Object obj);

    /* renamed from: h */
    public abstract int mo33249h(Object obj);

    /* renamed from: i */
    public abstract int mo33250i(Object obj);

    /* renamed from: j */
    public abstract void mo33251j(Object obj);

    /* renamed from: k */
    public abstract Object mo33252k(Object obj, Object obj2);

    /* renamed from: l */
    public final void m33253l(Object obj, mce mceVar) {
        while (mceVar.mo35618z() != Integer.MAX_VALUE && m33254m(obj, mceVar)) {
        }
    }

    /* renamed from: m */
    public final boolean m33254m(Object obj, mce mceVar) throws ct8 {
        int iMo35594b = mceVar.mo35594b();
        int iM26425a = fbj.m26425a(iMo35594b);
        int iM26426b = fbj.m26426b(iMo35594b);
        if (iM26426b == 0) {
            mo33246e(obj, iM26425a, mceVar.mo35576G());
            return true;
        }
        if (iM26426b == 1) {
            mo33243b(obj, iM26425a, mceVar.mo35593a());
            return true;
        }
        if (iM26426b == 2) {
            mo33245d(obj, iM26425a, mceVar.mo35607o());
            return true;
        }
        if (iM26426b != 3) {
            if (iM26426b == 4) {
                return false;
            }
            if (iM26426b != 5) {
                throw ct8.m21767e();
            }
            mo33242a(obj, iM26425a, mceVar.mo35613u());
            return true;
        }
        Object objMo33255n = mo33255n();
        int iM26427c = fbj.m26427c(iM26425a, 4);
        m33253l(objMo33255n, mceVar);
        if (iM26427c != mceVar.mo35594b()) {
            throw ct8.m21764b();
        }
        mo33244c(obj, iM26425a, mo33259r(objMo33255n));
        return true;
    }

    /* renamed from: n */
    public abstract Object mo33255n();

    /* renamed from: o */
    public abstract void mo33256o(Object obj, Object obj2);

    /* renamed from: p */
    public abstract void mo33257p(Object obj, Object obj2);

    /* renamed from: q */
    public abstract boolean mo33258q(mce mceVar);

    /* renamed from: r */
    public abstract Object mo33259r(Object obj);

    /* renamed from: s */
    public abstract void mo33260s(Object obj, cdj cdjVar);

    /* renamed from: t */
    public abstract void mo33261t(Object obj, cdj cdjVar);
}
