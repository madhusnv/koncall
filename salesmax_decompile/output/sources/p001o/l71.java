package p001o;

import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import p001o.dx7;
import p001o.m18;
import p001o.u6f;

/* loaded from: classes3.dex */
public abstract class l71 {

    /* renamed from: o.l71$a */
    public static final class C15007a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str = (String) ((Map.Entry) obj).getKey();
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) ((Map.Entry) obj2).getKey()).toLowerCase(locale);
            sq8.m48648g(lowerCase2, "toLowerCase(...)");
            return uk3.m51674d(lowerCase, lowerCase2);
        }
    }

    /* renamed from: b */
    public static final boolean m36637b(z81 z81Var) {
        sq8.m48649h(z81Var, "<this>");
        dx7 dx7VarM58883d = z81Var.m58883d();
        return (dx7VarM58883d instanceof dx7.C13053d) || (dx7VarM58883d instanceof dx7.C13054e) || (dx7VarM58883d instanceof dx7.C13055f);
    }

    /* renamed from: c */
    public static final boolean m36638c(m18 m18Var) {
        sq8.m48649h(m18Var, "<this>");
        if (((m18Var instanceof m18.AbstractC15197e) || (m18Var instanceof m18.AbstractC15194b)) && m18Var.getContentLength() != null) {
            if (!m18Var.isOneShot()) {
                Long contentLength = m18Var.getContentLength();
                sq8.m48646e(contentLength);
                if (contentLength.longValue() > 1048576) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final void m36639d(z38 z38Var, v81 v81Var, z81 z81Var, byte[] bArr, ek5 ek5Var) {
        m18 m18VarM39985f;
        sq8.m48649h(z38Var, "<this>");
        sq8.m48649h(v81Var, "signer");
        sq8.m48649h(z81Var, "signingConfig");
        sq8.m48649h(bArr, "signature");
        sq8.m48649h(ek5Var, "trailingHeaders");
        m18 m18VarM58667d = z38Var.m58667d();
        if (m18VarM58667d instanceof m18.AbstractC15194b) {
            y6f y6fVarM39988i = n18.m39988i(z38Var.m58667d(), null, 1, null);
            if (y6fVarM39988i == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            m18VarM39985f = n18.m39984e(new f71(y6fVarM39988i, v81Var, z81Var, bArr, ek5Var), -1L);
        } else {
            if (!(m18VarM58667d instanceof m18.AbstractC15197e)) {
                throw new xa3("HttpBody type is not supported");
            }
            m18 m18VarM58667d2 = z38Var.m58667d();
            sq8.m48647f(m18VarM58667d2, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.http.HttpBody.SourceContent");
            m18VarM39985f = n18.m39985f(new i71(((m18.AbstractC15197e) m18VarM58667d2).readFrom(), v81Var, z81Var, bArr, ek5Var), -1L);
        }
        z38Var.m58672i(m18VarM39985f);
    }

    /* renamed from: e */
    public static final void m36640e(z38 z38Var) {
        sq8.m48649h(z38Var, "<this>");
        z38Var.m58668e().m59796c("Content-Encoding", "aws-chunked");
        z38Var.m58668e().m59810r("Transfer-Encoding", HTTP.CHUNK_CODING);
        xx7 xx7VarM58668e = z38Var.m58668e();
        String string = (String) z38Var.m58668e().m59804l("Content-Length");
        if (string == null) {
            Long contentLength = z38Var.m58667d().getContentLength();
            string = contentLength != null ? contentLength.toString() : null;
            if (string == null) {
                throw new xa3("Expected \"Content-Length\" header or `body.contentLength` to be set for aws-chunked");
            }
        }
        xx7VarM58668e.m59810r("X-Amz-Decoded-Content-Length", string);
        z38Var.m58668e().m59809q("Content-Length");
    }

    /* renamed from: f */
    public static final void m36641f(t6f t6fVar, String str) {
        sq8.m48649h(t6fVar, "<this>");
        sq8.m48649h(str, "signature");
        u6f.C17307a.m51045b(t6fVar, "x-amz-trailer-signature:" + str + "\r\n", 0, 0, 6, null);
    }

    /* renamed from: g */
    public static final void m36642g(t6f t6fVar, ux7 ux7Var) {
        sq8.m48649h(t6fVar, "<this>");
        sq8.m48649h(ux7Var, "trailers");
        for (Map.Entry entry : kh3.I0(ux7Var.mo17772b(), new C15007a())) {
            u6f.C17307a.m51045b(t6fVar, (String) entry.getKey(), 0, 0, 6, null);
            u6f.C17307a.m51045b(t6fVar, ":", 0, 0, 6, null);
            u6f.C17307a.m51045b(t6fVar, kh3.p0((Iterable) entry.getValue(), ",", null, null, 0, null, new xk7() { // from class: o.k71
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return l71.m36643h((String) obj);
                }
            }, 30, null), 0, 0, 6, null);
            u6f.C17307a.m51045b(t6fVar, "\r\n", 0, 0, 6, null);
        }
    }

    /* renamed from: h */
    public static final CharSequence m36643h(String str) {
        sq8.m48649h(str, "v");
        return f9g.Z0(str).toString();
    }
}
