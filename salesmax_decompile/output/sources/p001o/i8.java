package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public abstract class i8 implements qja {
    @Override // p001o.qja
    /* renamed from: a */
    public hja mo18184a(fja fjaVar) {
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        return hja.f27055a.m30669a();
    }

    @Override // p001o.qja
    /* renamed from: b */
    public void mo18185b(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        fja fjaVar = fja.Info;
        if (mo18188e(fjaVar)) {
            m31703g(fjaVar, th, uk7Var);
        }
    }

    @Override // p001o.qja
    /* renamed from: c */
    public void mo18186c(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        fja fjaVar = fja.Warning;
        if (mo18188e(fjaVar)) {
            m31703g(fjaVar, th, uk7Var);
        }
    }

    @Override // p001o.qja
    /* renamed from: d */
    public void mo18187d(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        fja fjaVar = fja.Debug;
        if (mo18188e(fjaVar)) {
            m31703g(fjaVar, th, uk7Var);
        }
    }

    @Override // p001o.qja
    /* renamed from: e */
    public boolean mo18188e(fja fjaVar) {
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        return false;
    }

    @Override // p001o.qja
    /* renamed from: f */
    public void mo18189f(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        fja fjaVar = fja.Trace;
        if (mo18188e(fjaVar)) {
            m31703g(fjaVar, th, uk7Var);
        }
    }

    /* renamed from: g */
    public void m31703g(fja fjaVar, Throwable th, uk7 uk7Var) {
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        sq8.m48649h(uk7Var, "msg");
    }
}
