package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import p001o.fve;
import p001o.gve;
import p001o.ule;
import p001o.zqe;

/* loaded from: classes6.dex */
public final class ede implements fve {

    /* renamed from: a */
    public final uog f21444a;

    /* renamed from: b */
    public final ade f21445b;

    /* renamed from: c */
    public final int f21446c;

    /* renamed from: d */
    public final int f21447d;

    /* renamed from: e */
    public final int f21448e;

    /* renamed from: f */
    public final int f21449f;

    /* renamed from: g */
    public final int f21450g;

    /* renamed from: h */
    public final boolean f21451h;

    /* renamed from: i */
    public final boolean f21452i;

    /* renamed from: j */
    public final d60 f21453j;

    /* renamed from: k */
    public final dve f21454k;

    /* renamed from: l */
    public final gt3 f21455l;

    /* renamed from: m */
    public gve.C13825b f21456m;

    /* renamed from: n */
    public gve f21457n;

    /* renamed from: o */
    public bve f21458o;

    /* renamed from: p */
    public final oo0 f21459p;

    public ede(uog uogVar, ade adeVar, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, d60 d60Var, dve dveVar, gt3 gt3Var) {
        sq8.m48649h(uogVar, "taskRunner");
        sq8.m48649h(adeVar, "connectionPool");
        sq8.m48649h(d60Var, "address");
        sq8.m48649h(dveVar, "routeDatabase");
        sq8.m48649h(gt3Var, "connectionUser");
        this.f21444a = uogVar;
        this.f21445b = adeVar;
        this.f21446c = i;
        this.f21447d = i2;
        this.f21448e = i3;
        this.f21449f = i4;
        this.f21450g = i5;
        this.f21451h = z;
        this.f21452i = z2;
        this.f21453j = d60Var;
        this.f21454k = dveVar;
        this.f21455l = gt3Var;
        this.f21459p = new oo0();
    }

    /* renamed from: i */
    public static /* synthetic */ wr3 m24814i(ede edeVar, bve bveVar, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return edeVar.m24822h(bveVar, list);
    }

    /* renamed from: l */
    public static /* synthetic */ ete m24815l(ede edeVar, wr3 wr3Var, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            wr3Var = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return edeVar.m24824k(wr3Var, list);
    }

    @Override // p001o.fve
    /* renamed from: a */
    public boolean mo24816a(w48 w48Var) {
        sq8.m48649h(w48Var, ImagesContract.URL);
        w48 w48VarM22357l = getAddress().m22357l();
        return w48Var.m53882n() == w48VarM22357l.m53882n() && sq8.m48644c(w48Var.m53877h(), w48VarM22357l.m53877h());
    }

    @Override // p001o.fve
    /* renamed from: b */
    public oo0 mo24817b() {
        return this.f21459p;
    }

    @Override // p001o.fve
    /* renamed from: c */
    public boolean mo24818c(zce zceVar) {
        gve gveVar;
        bve bveVarM24825m;
        if ((!mo24817b().isEmpty()) || this.f21458o != null) {
            return true;
        }
        if (zceVar != null && (bveVarM24825m = m24825m(zceVar)) != null) {
            this.f21458o = bveVarM24825m;
            return true;
        }
        gve.C13825b c13825b = this.f21456m;
        boolean z = false;
        if (c13825b != null && c13825b.m29537b()) {
            z = true;
        }
        if (z || (gveVar = this.f21457n) == null) {
            return true;
        }
        return gveVar.m29529a();
    }

    @Override // p001o.fve
    /* renamed from: d */
    public fve.InterfaceC13582b mo24819d() throws IOException {
        ete eteVarM24823j = m24823j();
        if (eteVarM24823j != null) {
            return eteVarM24823j;
        }
        ete eteVarM24815l = m24815l(this, null, null, 3, null);
        if (eteVarM24815l != null) {
            return eteVarM24815l;
        }
        if (!mo24817b().isEmpty()) {
            return (fve.InterfaceC13582b) mo24817b().m42474N();
        }
        wr3 wr3VarM24821g = m24821g();
        ete eteVarM24824k = m24824k(wr3VarM24821g, wr3VarM24821g.m54924n());
        return eteVarM24824k != null ? eteVarM24824k : wr3VarM24821g;
    }

    /* renamed from: f */
    public final ule m24820f(bve bveVar) {
        ule uleVarM51746b = new ule.C17397a().m51744B(bveVar.m19864a().m22357l()).m51759p("CONNECT", null).m51757n("Host", jgj.m33827u(bveVar.m19864a().m22357l(), true)).m51757n("Proxy-Connection", HTTP.CONN_KEEP_ALIVE).m51757n("User-Agent", "okhttp/5.0.0-alpha.14").m51746b();
        ule uleVarMo31614a = bveVar.m19864a().m22353h().mo31614a(bveVar, new zqe.C18696a().m59764q(uleVarM51746b).m59762o(a2e.HTTP_1_1).m59752e(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED).m59759l("Preemptive Authenticate").m59765r(-1L).m59763p(-1L).m59756i("Proxy-Authenticate", "OkHttp-Preemptive").m59750c());
        return uleVarMo31614a == null ? uleVarM51746b : uleVarMo31614a;
    }

    /* renamed from: g */
    public final wr3 m24821g() throws IOException {
        bve bveVar = this.f21458o;
        if (bveVar != null) {
            this.f21458o = null;
            return m24814i(this, bveVar, null, 2, null);
        }
        gve.C13825b c13825b = this.f21456m;
        if (c13825b != null && c13825b.m29537b()) {
            return m24814i(this, c13825b.m29538c(), null, 2, null);
        }
        gve gveVar = this.f21457n;
        if (gveVar == null) {
            gveVar = new gve(getAddress(), this.f21454k, this.f21455l, this.f21452i);
            this.f21457n = gveVar;
        }
        if (!gveVar.m29529a()) {
            throw new IOException("exhausted all routes");
        }
        gve.C13825b c13825bM29531c = gveVar.m29531c();
        this.f21456m = c13825bM29531c;
        if (isCanceled()) {
            throw new IOException("Canceled");
        }
        return m24822h(c13825bM29531c.m29538c(), c13825bM29531c.m29536a());
    }

    @Override // p001o.fve
    public d60 getAddress() {
        return this.f21453j;
    }

    /* renamed from: h */
    public final wr3 m24822h(bve bveVar, List list) throws UnknownServiceException {
        sq8.m48649h(bveVar, "route");
        if (bveVar.m19864a().m22356k() == null) {
            if (!bveVar.m19864a().m22347b().contains(et3.f22137k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strM53877h = bveVar.m19864a().m22357l().m53877h();
            if (!e9d.f21191a.m24582g().mo24572i(strM53877h)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + strM53877h + " not permitted by network security policy");
            }
        } else if (bveVar.m19864a().m22351f().contains(a2e.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new wr3(this.f21444a, this.f21445b, this.f21446c, this.f21447d, this.f21448e, this.f21449f, this.f21450g, this.f21451h, this.f21455l, this, bveVar, list, 0, bveVar.m19866c() ? m24820f(bveVar) : null, -1, false);
    }

    @Override // p001o.fve
    public boolean isCanceled() {
        return this.f21455l.isCanceled();
    }

    /* renamed from: j */
    public final ete m24823j() throws IOException {
        Socket socketMo25551t;
        boolean z;
        zce zceVarMo25552u = this.f21455l.mo25552u();
        if (zceVarMo25552u == null) {
            return null;
        }
        boolean zM59203q = zceVarMo25552u.m59203q(this.f21455l.mo25546o());
        synchronized (zceVarMo25552u) {
            if (zM59203q) {
                socketMo25551t = (zceVarMo25552u.m59198l() || !mo24816a(zceVarMo25552u.m59208v().m19864a().m22357l())) ? this.f21455l.mo25551t() : null;
                z = false;
            } else {
                z = !zceVarMo25552u.m59198l();
                zceVarMo25552u.m59211y(true);
                socketMo25551t = this.f21455l.mo25551t();
            }
        }
        if (this.f21455l.mo25552u() != null) {
            if (socketMo25551t == null) {
                return new ete(zceVarMo25552u);
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        if (socketMo25551t != null) {
            jgj.m33813g(socketMo25551t);
        }
        this.f21455l.mo25535d(zceVarMo25552u);
        this.f21455l.mo25533b(zceVarMo25552u);
        if (socketMo25551t != null) {
            this.f21455l.mo25536e(zceVarMo25552u);
        } else if (z) {
            this.f21455l.mo25541j(zceVarMo25552u);
        }
        return null;
    }

    /* renamed from: k */
    public final ete m24824k(wr3 wr3Var, List list) throws IOException {
        zce zceVarM16919a = this.f21445b.m16919a(this.f21455l.mo25546o(), getAddress(), this.f21455l, list, wr3Var != null && wr3Var.isReady());
        if (zceVarM16919a == null) {
            return null;
        }
        if (wr3Var != null) {
            this.f21458o = wr3Var.getRoute();
            wr3Var.m54918g();
        }
        this.f21455l.mo25547p(zceVarM16919a);
        this.f21455l.mo25544m(zceVarM16919a);
        return new ete(zceVarM16919a);
    }

    /* renamed from: m */
    public final bve m24825m(zce zceVar) {
        bve bveVarM59208v;
        synchronized (zceVar) {
            bveVarM59208v = null;
            if (zceVar.m59199m() == 0 && zceVar.m59198l() && jgj.m33811e(zceVar.m59208v().m19864a().m22357l(), getAddress().m22357l())) {
                bveVarM59208v = zceVar.m59208v();
            }
        }
        return bveVarM59208v;
    }
}
