package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.EOFException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;
import p001o.a6f;
import p001o.kei;
import p001o.l8i;
import p001o.m18;
import p001o.ule;
import p001o.wx7;
import p001o.y08;

/* loaded from: classes3.dex */
public abstract class tac {

    /* renamed from: o.tac$a */
    public static final class C17043a extends m18.AbstractC15197e {

        /* renamed from: a */
        public final boolean f46740a = true;

        /* renamed from: b */
        public final Long f46741b;

        /* renamed from: c */
        public final /* synthetic */ zqe f46742c;

        public C17043a(zqe zqeVar) {
            Long lValueOf;
            this.f46742c = zqeVar;
            cre creVarM59735c = zqeVar.m59735c();
            sq8.m48646e(creVarM59735c);
            if (creVarM59735c.mo21617g() >= 0) {
                cre creVarM59735c2 = zqeVar.m59735c();
                sq8.m48646e(creVarM59735c2);
                lValueOf = Long.valueOf(creVarM59735c2.mo21617g());
            } else {
                lValueOf = null;
            }
            this.f46741b = lValueOf;
        }

        @Override // p001o.m18
        public Long getContentLength() {
            return this.f46741b;
        }

        @Override // p001o.m18
        public boolean isOneShot() {
            return this.f46740a;
        }

        @Override // p001o.m18.AbstractC15197e
        public h8f readFrom() {
            cre creVarM59735c = this.f46742c.m59735c();
            sq8.m48646e(creVarM59735c);
            return a74.m16541f(creVarM59735c.mo21619o());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* renamed from: b */
    public static final x28 m49652b(Exception exc) {
        ?? next;
        Exception exc2;
        ?? next2;
        sq8.m48649h(exc, "<this>");
        if (m49653c(exc)) {
            return x28.CONNECT_TIMEOUT;
        }
        if (m49654d(exc)) {
            return x28.CONNECTION_CLOSED;
        }
        if (exc instanceof SocketTimeoutException) {
            exc2 = exc;
        } else if (exc.getCause() instanceof SocketTimeoutException) {
            Throwable cause = exc.getCause();
            if (cause == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.SocketTimeoutException");
            }
            exc2 = (SocketTimeoutException) cause;
        } else {
            Iterator it = cl6.m21377b(exc).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                }
                next = it.next();
                if (((Throwable) next) instanceof SocketTimeoutException) {
                    break;
                }
            }
            boolean z = next instanceof SocketTimeoutException;
            Exception exc3 = next;
            if (!z) {
                exc3 = null;
            }
            exc2 = (SocketTimeoutException) exc3;
        }
        if (exc2 != null) {
            return x28.SOCKET_TIMEOUT;
        }
        if (!(exc instanceof SSLHandshakeException)) {
            if (exc.getCause() instanceof SSLHandshakeException) {
                Throwable cause2 = exc.getCause();
                if (cause2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLHandshakeException");
                }
                exc = (SSLHandshakeException) cause2;
            } else {
                Iterator it2 = cl6.m21377b(exc).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = 0;
                        break;
                    }
                    next2 = it2.next();
                    if (((Throwable) next2) instanceof SSLHandshakeException) {
                        break;
                    }
                }
                exc = (SSLHandshakeException) (next2 instanceof SSLHandshakeException ? next2 : null);
            }
        }
        return exc != null ? x28.TLS_NEGOTIATION_ERROR : x28.SDK_UNKNOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* renamed from: c */
    public static final boolean m49653c(Exception exc) {
        String message;
        ?? next;
        if (!(exc instanceof SocketTimeoutException)) {
            if (exc.getCause() instanceof SocketTimeoutException) {
                Throwable cause = exc.getCause();
                if (cause == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.SocketTimeoutException");
                }
                exc = (SocketTimeoutException) cause;
            } else {
                Iterator it = cl6.m21377b(exc).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it.next();
                    if (((Throwable) next) instanceof SocketTimeoutException) {
                        break;
                    }
                }
                exc = (SocketTimeoutException) (next instanceof SocketTimeoutException ? next : null);
            }
        }
        SocketTimeoutException socketTimeoutException = (SocketTimeoutException) exc;
        return (socketTimeoutException == null || (message = socketTimeoutException.getMessage()) == null || !f9g.m26304N(message, "connect", true)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m49654d(Exception exc) {
        boolean z;
        String message;
        ?? next;
        String message2 = exc.getMessage();
        if (message2 != null && f9g.m26306P(message2, "unexpected end of stream", false, 2, null)) {
            Throwable cause = exc.getCause();
            Exception exc2 = cause instanceof Exception ? (Exception) cause : null;
            if (exc2 == null) {
                z = false;
                if (z) {
                    return true;
                }
            } else {
                if (!(exc2 instanceof EOFException)) {
                    if (exc2.getCause() instanceof EOFException) {
                        Throwable cause2 = exc2.getCause();
                        if (cause2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.io.EOFException");
                        }
                        exc2 = (EOFException) cause2;
                    } else {
                        Iterator it = cl6.m21377b(exc2).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = 0;
                                break;
                            }
                            next = it.next();
                            if (((Throwable) next) instanceof EOFException) {
                                break;
                            }
                        }
                        boolean z2 = next instanceof EOFException;
                        Exception exc3 = next;
                        if (!z2) {
                            exc3 = null;
                        }
                        exc2 = (EOFException) exc3;
                    }
                }
                EOFException eOFException = (EOFException) exc2;
                if (eOFException != null && (message = eOFException.getMessage()) != null && f9g.m26306P(message, "\\n not found: limit=0", false, 2, null)) {
                    z = true;
                }
                if (z) {
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final wx7 m49655e(ux7 ux7Var) {
        sq8.m48649h(ux7Var, "<this>");
        final wx7.C17997a c17997a = new wx7.C17997a();
        ux7Var.mo17774d(new nl7() { // from class: o.sac
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return tac.m49656f(c17997a, (String) obj, (List) obj2);
            }
        });
        if (!ux7Var.contains(HttpHeaders.ACCEPT_ENCODING)) {
            c17997a.m55339e(HttpHeaders.ACCEPT_ENCODING, HTTP.IDENTITY_CODING);
        }
        return c17997a.m55340f();
    }

    /* renamed from: f */
    public static final y3i m49656f(wx7.C17997a c17997a, String str, List list) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(list, "values");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c17997a.m55339e(str, (String) it.next());
        }
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static final ule m49657g(y38 y38Var, jl6 jl6Var, q74 q74Var, d28 d28Var) {
        Long contentLength;
        sq8.m48649h(y38Var, "<this>");
        sq8.m48649h(jl6Var, "execContext");
        sq8.m48649h(q74Var, "callContext");
        sq8.m48649h(d28Var, "metrics");
        ule.C17397a c17397a = new ule.C17397a();
        c17397a.m51768y(b8f.class, new b8f(jl6Var, q74Var, d28Var));
        c17397a.m51769z(y38Var.getUrl().toString());
        c17397a.m51758o(m49655e(y38Var.getHeaders()));
        xle t7gVar = null;
        m18VarM39984e = null;
        m18VarM39984e = null;
        m18 m18VarM39984e = null;
        if (q38.m44762a(y38Var.getMethod().name())) {
            m18 body = y38Var.getBody();
            if (body instanceof m18.C15196d) {
                t7gVar = xle.f53902a.m56464f(new byte[0], null, 0, 0);
            } else if (body instanceof m18.AbstractC15193a) {
                byte[] bArrMo38177a = ((m18.AbstractC15193a) body).mo38177a();
                t7gVar = xle.f53902a.m56464f(bArrMo38177a, null, 0, bArrMo38177a.length);
            } else {
                if (!(body instanceof m18.AbstractC15197e) && !(body instanceof m18.AbstractC15194b)) {
                    throw new szb();
                }
                String str = (String) y38Var.getHeaders().get("Content-Length");
                if (str != null) {
                    if (body.getContentLength() == null || ((contentLength = body.getContentLength()) != null && contentLength.longValue() == -1)) {
                        if (body instanceof m18.AbstractC15197e) {
                            m18VarM39984e = n18.m39985f(((m18.AbstractC15197e) body).readFrom(), Long.valueOf(Long.parseLong(str)));
                        } else if (body instanceof m18.AbstractC15194b) {
                            m18VarM39984e = n18.m39984e(((m18.AbstractC15194b) body).readFrom(), Long.valueOf(Long.parseLong(str)));
                        }
                    }
                    if (m18VarM39984e != null) {
                        body = m18VarM39984e;
                    }
                }
                t7gVar = new t7g(body, q74Var);
            }
        } else if (!(y38Var.getBody() instanceof m18.C15196d)) {
            throw new IllegalStateException(("unexpected HTTP body for method " + y38Var.getMethod()).toString());
        }
        c17397a.m51759p(y38Var.getMethod().name(), t7gVar);
        return c17397a.m51746b();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g48 m49658h(zqe zqeVar) {
        m18 c17043a;
        sq8.m48649h(zqeVar, "<this>");
        pac pacVar = new pac(zqeVar.m59744u());
        if (zqeVar.m59735c() != null) {
            cre creVarM59735c = zqeVar.m59735c();
            sq8.m48646e(creVarM59735c);
            c17043a = creVarM59735c.mo21617g() == 0 ? m18.C15196d.f34631a : new C17043a(zqeVar);
        }
        return j48.m33187b(s48.f44774c.m47795a(zqeVar.m59739h()), pacVar, c17043a);
    }

    /* renamed from: i */
    public static final l8i m49659i(URI uri) {
        String host;
        sq8.m48649h(uri, "<this>");
        l8i.C15037b c15037b = l8i.f33466k;
        l8i.C15036a c15036a = new l8i.C15036a();
        a6f.C12101a c12101a = a6f.f14208c;
        String scheme = uri.getScheme();
        sq8.m48648g(scheme, "getScheme(...)");
        c15036a.m36775p(c12101a.m16526d(scheme));
        y08.C18290a c18290a = y08.f54673a;
        String host2 = uri.getHost();
        sq8.m48648g(host2, "getHost(...)");
        if (e9g.m24597K(host2, "[", false, 2, null)) {
            String host3 = uri.getHost();
            sq8.m48648g(host3, "getHost(...)");
            host = f9g.L0(host3, bce.m18616s(1, uri.getHost().length() - 1));
        } else {
            host = uri.getHost();
        }
        sq8.m48646e(host);
        c15036a.m36773n(c18290a.m57086a(host));
        Integer numValueOf = Integer.valueOf(uri.getPort());
        c15036a.m36774o(Boolean.valueOf(numValueOf.intValue() > 0).booleanValue() ? numValueOf : null);
        c15036a.m36767h().m48016m(uri.getRawPath());
        String rawQuery = uri.getRawQuery();
        if (!(rawQuery == null || f9g.d0(rawQuery))) {
            c15036a.m36766g().m20267G(uri.getRawQuery());
        }
        String rawUserInfo = uri.getRawUserInfo();
        if (!(rawUserInfo == null || f9g.d0(rawUserInfo))) {
            kei.C14821a c14821aM36769j = c15036a.m36769j();
            kei.C14822b c14822b = kei.f32115e;
            String rawUserInfo2 = uri.getRawUserInfo();
            sq8.m48648g(rawUserInfo2, "getRawUserInfo(...)");
            c14821aM36769j.m35557c(c14822b.m35564c(rawUserInfo2));
        }
        c15036a.m36772m(uri.getRawFragment());
        return c15036a.m36761b();
    }
}
