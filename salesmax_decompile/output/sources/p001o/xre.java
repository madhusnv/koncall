package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public final class xre extends b79 {

    /* renamed from: e */
    public final zb2 f54174e;

    public xre(zb2 zb2Var) {
        this.f54174e = zb2Var;
    }

    @Override // p001o.b79
    /* renamed from: v */
    public boolean mo18250v() {
        return false;
    }

    @Override // p001o.b79
    /* renamed from: w */
    public void mo18251w(Throwable th) {
        Object objI0 = m18249u().i0();
        if (objI0 instanceof lm3) {
            zb2 zb2Var = this.f54174e;
            vre.C17665a c17665a = vre.f50797b;
            zb2Var.resumeWith(vre.m53351b(wre.m54933a(((lm3) objI0).f34036a)));
        } else {
            zb2 zb2Var2 = this.f54174e;
            vre.C17665a c17665a2 = vre.f50797b;
            zb2Var2.resumeWith(vre.m53351b(e79.m24481h(objI0)));
        }
    }
}
