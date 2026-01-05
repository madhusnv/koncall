package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public final class b64 implements qja {

    /* renamed from: b */
    public final q74 f15578b;

    /* renamed from: c */
    public final qja f15579c;

    /* renamed from: d */
    public final String f15580d;

    public b64(q74 q74Var, qja qjaVar, String str) {
        sq8.m48649h(q74Var, "context");
        sq8.m48649h(qjaVar, "delegate");
        sq8.m48649h(str, "sourceComponent");
        this.f15578b = q74Var;
        this.f15579c = qjaVar;
        this.f15580d = str;
    }

    @Override // p001o.qja
    /* renamed from: a */
    public hja mo18184a(fja fjaVar) {
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        return this.f15579c.mo18184a(fjaVar);
    }

    @Override // p001o.qja
    /* renamed from: b */
    public void mo18185b(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        v74.m52398c(this.f15578b, this.f15580d, th, uk7Var);
    }

    @Override // p001o.qja
    /* renamed from: c */
    public void mo18186c(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        v74.m52402g(this.f15578b, this.f15580d, th, uk7Var);
    }

    @Override // p001o.qja
    /* renamed from: d */
    public void mo18187d(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        v74.m52396a(this.f15578b, this.f15580d, th, uk7Var);
    }

    @Override // p001o.qja
    /* renamed from: e */
    public boolean mo18188e(fja fjaVar) {
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        return this.f15579c.mo18188e(fjaVar);
    }

    @Override // p001o.qja
    /* renamed from: f */
    public void mo18189f(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        v74.m52401f(this.f15578b, this.f15580d, th, uk7Var);
    }
}
