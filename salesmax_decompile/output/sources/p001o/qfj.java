package p001o;

import androidx.camera.core.InterfaceC1893c;

/* loaded from: classes2.dex */
public final class qfj extends yo0 {
    public qfj(int i, cue cueVar) {
        super(i, cueVar);
    }

    /* renamed from: d */
    public void m45368d(InterfaceC1893c interfaceC1893c) {
        if (m45369e(interfaceC1893c.y2())) {
            super.m58032b(interfaceC1893c);
        } else {
            this.f55750d.mo21835a(interfaceC1893c);
        }
    }

    /* renamed from: e */
    public final boolean m45369e(jd8 jd8Var) {
        u72 u72VarM54032a = w72.m54032a(jd8Var);
        return (u72VarM54032a.mo46022g() == p72.LOCKED_FOCUSED || u72VarM54032a.mo46022g() == p72.PASSIVE_FOCUSED) && u72VarM54032a.mo46025j() == n72.CONVERGED && u72VarM54032a.mo46023h() == r72.CONVERGED;
    }
}
