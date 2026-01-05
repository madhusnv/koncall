package p001o;

import java.io.IOException;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import p001o.fs1;
import p001o.tn8;
import p001o.wx7;
import p001o.zqe;

/* loaded from: classes6.dex */
public final class as1 implements tn8 {

    /* renamed from: a */
    public static final C12242a f15193a = new C12242a(null);

    /* renamed from: o.as1$a */
    public static final class C12242a {
        public C12242a() {
        }

        public /* synthetic */ C12242a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final wx7 m17757b(wx7 wx7Var, wx7 wx7Var2) {
            wx7.C17997a c17997a = new wx7.C17997a();
            int size = wx7Var.size();
            for (int i = 0; i < size; i++) {
                String strM55329j = wx7Var.m55329j(i);
                String strM55333w = wx7Var.m55333w(i);
                if ((!e9g.m24606x(HttpHeaders.WARNING, strM55329j, true) || !e9g.m24597K(strM55333w, "1", false, 2, null)) && (m17758c(strM55329j) || !m17759d(strM55329j) || wx7Var2.m55327d(strM55329j) == null)) {
                    c17997a.m55338d(strM55329j, strM55333w);
                }
            }
            int size2 = wx7Var2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strM55329j2 = wx7Var2.m55329j(i2);
                if (!m17758c(strM55329j2) && m17759d(strM55329j2)) {
                    c17997a.m55338d(strM55329j2, wx7Var2.m55333w(i2));
                }
            }
            return c17997a.m55340f();
        }

        /* renamed from: c */
        public final boolean m17758c(String str) {
            return e9g.m24606x("Content-Length", str, true) || e9g.m24606x("Content-Encoding", str, true) || e9g.m24606x("Content-Type", str, true);
        }

        /* renamed from: d */
        public final boolean m17759d(String str) {
            return (e9g.m24606x("Connection", str, true) || e9g.m24606x(HTTP.CONN_KEEP_ALIVE, str, true) || e9g.m24606x("Proxy-Authenticate", str, true) || e9g.m24606x("Proxy-Authorization", str, true) || e9g.m24606x(HttpHeaders.TE, str, true) || e9g.m24606x("Trailers", str, true) || e9g.m24606x("Transfer-Encoding", str, true) || e9g.m24606x(HttpHeaders.UPGRADE, str, true)) ? false : true;
        }
    }

    public as1(sr1 sr1Var) {
    }

    @Override // p001o.tn8
    public zqe intercept(tn8.InterfaceC17165a interfaceC17165a) throws IOException {
        dk6 dk6VarM57587m;
        sq8.m48649h(interfaceC17165a, "chain");
        bt1 bt1VarCall = interfaceC17165a.call();
        fs1 fs1VarM27412b = new fs1.C13540b(System.currentTimeMillis(), interfaceC17165a.request(), null).m27412b();
        ule uleVarM27409b = fs1VarM27412b.m27409b();
        zqe zqeVarM27408a = fs1VarM27412b.m27408a();
        yce yceVar = bt1VarCall instanceof yce ? (yce) bt1VarCall : null;
        if (yceVar == null || (dk6VarM57587m = yceVar.m57587m()) == null) {
            dk6VarM57587m = dk6.NONE;
        }
        if (uleVarM27409b == null && zqeVarM27408a == null) {
            zqe zqeVarM59750c = new zqe.C18696a().m59764q(interfaceC17165a.request()).m59762o(a2e.HTTP_1_1).m59752e(HttpStatus.SC_GATEWAY_TIMEOUT).m59759l("Unsatisfiable Request (only-if-cached)").m59765r(-1L).m59763p(System.currentTimeMillis()).m59750c();
            dk6VarM57587m.satisfactionFailure(bt1VarCall, zqeVarM59750c);
            return zqeVarM59750c;
        }
        if (uleVarM27409b == null) {
            sq8.m48646e(zqeVarM27408a);
            zqe zqeVarM59750c2 = zqeVarM27408a.m59728H().m59751d(egj.m25002u(zqeVarM27408a)).m59750c();
            dk6VarM57587m.cacheHit(bt1VarCall, zqeVarM59750c2);
            return zqeVarM59750c2;
        }
        if (zqeVarM27408a != null) {
            dk6VarM57587m.cacheConditionalHit(bt1VarCall, zqeVarM27408a);
        }
        zqe zqeVarMo20972a = interfaceC17165a.mo20972a(uleVarM27409b);
        if (zqeVarM27408a != null) {
            boolean z = false;
            if (zqeVarMo20972a != null && zqeVarMo20972a.m59739h() == 304) {
                z = true;
            }
            if (z) {
                zqeVarM27408a.m59728H().m59757j(f15193a.m17757b(zqeVarM27408a.m59744u(), zqeVarMo20972a.m59744u())).m59765r(zqeVarMo20972a.m59733S()).m59763p(zqeVarMo20972a.m59731O()).m59751d(egj.m25002u(zqeVarM27408a)).m59760m(egj.m25002u(zqeVarMo20972a)).m59750c();
                zqeVarMo20972a.m59735c().close();
                sq8.m48646e(null);
                throw null;
            }
            ggj.m28626f(zqeVarM27408a.m59735c());
        }
        sq8.m48646e(zqeVarMo20972a);
        return zqeVarMo20972a.m59728H().m59751d(zqeVarM27408a != null ? egj.m25002u(zqeVarM27408a) : null).m59760m(egj.m25002u(zqeVarMo20972a)).m59750c();
    }
}
