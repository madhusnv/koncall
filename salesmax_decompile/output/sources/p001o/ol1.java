package p001o;

import java.util.List;
import org.apache.http.HttpHeaders;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import p001o.tn8;
import p001o.ule;
import p001o.zqe;

/* loaded from: classes6.dex */
public final class ol1 implements tn8 {

    /* renamed from: a */
    public final f74 f38522a;

    public ol1(f74 f74Var) {
        sq8.m48649h(f74Var, "cookieJar");
        this.f38522a = f74Var;
    }

    /* renamed from: a */
    public final String m42370a(List list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            e74 e74Var = (e74) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(e74Var.m24453e());
            sb.append('=');
            sb.append(e74Var.m24455g());
            i = i2;
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    @Override // p001o.tn8
    public zqe intercept(tn8.InterfaceC17165a interfaceC17165a) {
        cre creVarM59735c;
        sq8.m48649h(interfaceC17165a, "chain");
        ule uleVarRequest = interfaceC17165a.request();
        ule.C17397a c17397aM51738i = uleVarRequest.m51738i();
        xle xleVarM51730a = uleVarRequest.m51730a();
        if (xleVarM51730a != null) {
            y9b y9bVarMo18954b = xleVarM51730a.mo18954b();
            if (y9bVarMo18954b != null) {
                c17397aM51738i.m51757n("Content-Type", y9bVarMo18954b.toString());
            }
            long jMo18953a = xleVarM51730a.mo18953a();
            if (jMo18953a != -1) {
                c17397aM51738i.m51757n("Content-Length", String.valueOf(jMo18953a));
                c17397aM51738i.m51763t("Transfer-Encoding");
            } else {
                c17397aM51738i.m51757n("Transfer-Encoding", HTTP.CHUNK_CODING);
                c17397aM51738i.m51763t("Content-Length");
            }
        }
        boolean z = false;
        if (uleVarRequest.m51734e("Host") == null) {
            c17397aM51738i.m51757n("Host", jgj.m33828v(uleVarRequest.m51741l(), false, 1, null));
        }
        if (uleVarRequest.m51734e("Connection") == null) {
            c17397aM51738i.m51757n("Connection", HTTP.CONN_KEEP_ALIVE);
        }
        if (uleVarRequest.m51734e(HttpHeaders.ACCEPT_ENCODING) == null && uleVarRequest.m51734e(HttpHeaders.RANGE) == null) {
            c17397aM51738i.m51757n(HttpHeaders.ACCEPT_ENCODING, "gzip");
            z = true;
        }
        List listMo26225b = this.f38522a.mo26225b(uleVarRequest.m51741l());
        if (!listMo26225b.isEmpty()) {
            c17397aM51738i.m51757n(SM.COOKIE, m42370a(listMo26225b));
        }
        if (uleVarRequest.m51734e("User-Agent") == null) {
            c17397aM51738i.m51757n("User-Agent", "okhttp/5.0.0-alpha.14");
        }
        ule uleVarM51746b = c17397aM51738i.m51746b();
        zqe zqeVarMo20972a = interfaceC17165a.mo20972a(uleVarM51746b);
        k38.m34943f(this.f38522a, uleVarM51746b.m51741l(), zqeVarMo20972a.m59744u());
        zqe.C18696a c18696aM59764q = zqeVarMo20972a.m59728H().m59764q(uleVarM51746b);
        if (z && e9g.m24606x("gzip", zqe.m59725t(zqeVarMo20972a, "Content-Encoding", null, 2, null), true) && k38.m34939b(zqeVarMo20972a) && (creVarM59735c = zqeVarMo20972a.m59735c()) != null) {
            vv7 vv7Var = new vv7(creVarM59735c.mo21619o());
            c18696aM59764q.m59757j(zqeVarMo20972a.m59744u().m55331o().m55342h("Content-Encoding").m55342h("Content-Length").m55340f());
            c18696aM59764q.m59749b(new dde(zqe.m59725t(zqeVarMo20972a, "Content-Type", null, 2, null), -1L, uac.m51310c(vv7Var)));
        }
        return c18696aM59764q.m59750c();
    }
}
