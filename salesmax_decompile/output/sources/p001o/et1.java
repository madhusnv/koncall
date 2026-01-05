package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* loaded from: classes6.dex */
public final class et1 implements gt3 {

    /* renamed from: a */
    public final yce f22128a;

    /* renamed from: b */
    public final bt3 f22129b;

    /* renamed from: c */
    public final cde f22130c;

    public et1(yce yceVar, bt3 bt3Var, cde cdeVar) {
        sq8.m48649h(yceVar, "call");
        sq8.m48649h(bt3Var, "poolConnectionListener");
        sq8.m48649h(cdeVar, "chain");
        this.f22128a = yceVar;
        this.f22129b = bt3Var;
        this.f22130c = cdeVar;
    }

    @Override // p001o.gt3
    /* renamed from: a */
    public void mo25532a(zce zceVar) {
        sq8.m48649h(zceVar, "connection");
        this.f22128a.m57579c(zceVar);
    }

    @Override // p001o.gt3
    /* renamed from: b */
    public void mo25533b(zce zceVar) {
        sq8.m48649h(zceVar, "connection");
        zceVar.m59196j().mo17806g(zceVar, this.f22128a);
    }

    @Override // p001o.gt3
    /* renamed from: c */
    public void mo25534c(wr3 wr3Var) {
        sq8.m48649h(wr3Var, "connectPlan");
        this.f22128a.m57591s().remove(wr3Var);
    }

    @Override // p001o.gt3
    /* renamed from: d */
    public void mo25535d(xr3 xr3Var) {
        sq8.m48649h(xr3Var, "connection");
        m25555x().connectionReleased(this.f22128a, xr3Var);
    }

    @Override // p001o.gt3
    /* renamed from: e */
    public void mo25536e(zce zceVar) {
        sq8.m48649h(zceVar, "connection");
        zceVar.m59196j().m19707f(zceVar);
    }

    @Override // p001o.gt3
    /* renamed from: f */
    public void mo25537f(xr3 xr3Var, bve bveVar) {
        sq8.m48649h(xr3Var, "connection");
        sq8.m48649h(bveVar, "route");
        this.f22129b.m19704b(xr3Var, bveVar, this.f22128a);
    }

    @Override // p001o.gt3
    /* renamed from: g */
    public void mo25538g(String str, List list) {
        sq8.m48649h(str, "socketHost");
        sq8.m48649h(list, "result");
        m25555x().dnsEnd(this.f22128a, str, list);
    }

    @Override // p001o.gt3
    /* renamed from: h */
    public void mo25539h(w48 w48Var, List list) {
        sq8.m48649h(w48Var, ImagesContract.URL);
        sq8.m48649h(list, "proxies");
        m25555x().proxySelectEnd(this.f22128a, w48Var, list);
    }

    @Override // p001o.gt3
    /* renamed from: i */
    public void mo25540i(bve bveVar, a2e a2eVar) {
        sq8.m48649h(bveVar, "route");
        m25555x().connectEnd(this.f22128a, bveVar.m19867d(), bveVar.m19865b(), a2eVar);
    }

    @Override // p001o.gt3
    public boolean isCanceled() {
        return this.f22128a.isCanceled();
    }

    @Override // p001o.gt3
    /* renamed from: j */
    public void mo25541j(zce zceVar) {
        sq8.m48649h(zceVar, "connection");
        zceVar.m59196j().m19708h(zceVar);
    }

    @Override // p001o.gt3
    /* renamed from: k */
    public void mo25542k(bve bveVar) {
        sq8.m48649h(bveVar, "route");
        m25555x().connectStart(this.f22128a, bveVar.m19867d(), bveVar.m19865b());
        this.f22129b.m19706d(bveVar, this.f22128a);
    }

    @Override // p001o.gt3
    /* renamed from: l */
    public void mo25543l(bve bveVar) {
        sq8.m48649h(bveVar, "route");
        this.f22128a.m57585k().m30082u().m23891a(bveVar);
    }

    @Override // p001o.gt3
    /* renamed from: m */
    public void mo25544m(zce zceVar) {
        sq8.m48649h(zceVar, "connection");
        zceVar.m59196j().mo17805e(zceVar, this.f22128a);
    }

    @Override // p001o.gt3
    /* renamed from: n */
    public void mo25545n(wr3 wr3Var) {
        sq8.m48649h(wr3Var, "connectPlan");
        this.f22128a.m57591s().add(wr3Var);
    }

    @Override // p001o.gt3
    /* renamed from: o */
    public boolean mo25546o() {
        return !sq8.m48644c(this.f22130c.m20979i().m51737h(), "GET");
    }

    @Override // p001o.gt3
    /* renamed from: p */
    public void mo25547p(xr3 xr3Var) {
        sq8.m48649h(xr3Var, "connection");
        m25555x().connectionAcquired(this.f22128a, xr3Var);
    }

    @Override // p001o.gt3
    /* renamed from: q */
    public void mo25548q(ww7 ww7Var) {
        m25555x().secureConnectEnd(this.f22128a, ww7Var);
    }

    @Override // p001o.gt3
    /* renamed from: r */
    public void mo25549r(String str) {
        sq8.m48649h(str, "socketHost");
        m25555x().dnsStart(this.f22128a, str);
    }

    @Override // p001o.gt3
    /* renamed from: s */
    public void mo25550s() {
        m25555x().secureConnectStart(this.f22128a);
    }

    @Override // p001o.gt3
    /* renamed from: t */
    public Socket mo25551t() {
        return this.f22128a.m57597y();
    }

    @Override // p001o.gt3
    /* renamed from: u */
    public zce mo25552u() {
        return this.f22128a.m57586l();
    }

    @Override // p001o.gt3
    /* renamed from: v */
    public void mo25553v(w48 w48Var) {
        sq8.m48649h(w48Var, ImagesContract.URL);
        m25555x().proxySelectStart(this.f22128a, w48Var);
    }

    @Override // p001o.gt3
    /* renamed from: w */
    public void mo25554w(bve bveVar, a2e a2eVar, IOException iOException) {
        sq8.m48649h(bveVar, "route");
        sq8.m48649h(iOException, "e");
        m25555x().connectFailed(this.f22128a, bveVar.m19867d(), bveVar.m19865b(), null, iOException);
        this.f22129b.m19705c(bveVar, this.f22128a, iOException);
    }

    /* renamed from: x */
    public final dk6 m25555x() {
        return this.f22128a.m57587m();
    }
}
