package p001o;

import com.google.android.gms.common.api.Api;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.HttpHeaders;
import p001o.tn8;
import p001o.ule;

/* loaded from: classes6.dex */
public final class cse implements tn8 {

    /* renamed from: b */
    public static final C12739a f18583b = new C12739a(null);

    /* renamed from: a */
    public final hac f18584a;

    /* renamed from: o.cse$a */
    public static final class C12739a {
        public C12739a() {
        }

        public /* synthetic */ C12739a(id5 id5Var) {
            this();
        }
    }

    public cse(hac hacVar) {
        sq8.m48649h(hacVar, "client");
        this.f18584a = hacVar;
    }

    /* renamed from: a */
    public final ule m21708a(zqe zqeVar, String str) {
        String strM59725t;
        w48 w48VarM53885q;
        if (!this.f18584a.m30080s() || (strM59725t = zqe.m59725t(zqeVar, "Location", null, 2, null)) == null || (w48VarM53885q = zqeVar.m59732Q().m51741l().m53885q(strM59725t)) == null) {
            return null;
        }
        if (!sq8.m48644c(w48VarM53885q.m53886r(), zqeVar.m59732Q().m51741l().m53886r()) && !this.f18584a.m30081t()) {
            return null;
        }
        ule.C17397a c17397aM51738i = zqeVar.m59732Q().m51738i();
        if (q38.m44762a(str)) {
            int iM59739h = zqeVar.m59739h();
            q38 q38Var = q38.f41219a;
            boolean z = q38Var.m44765c(str) || iM59739h == 308 || iM59739h == 307;
            if (!q38Var.m44764b(str) || iM59739h == 308 || iM59739h == 307) {
                c17397aM51738i.m51759p(str, z ? zqeVar.m59732Q().m51730a() : null);
            } else {
                c17397aM51738i.m51759p("GET", null);
            }
            if (!z) {
                c17397aM51738i.m51763t("Transfer-Encoding");
                c17397aM51738i.m51763t("Content-Length");
                c17397aM51738i.m51763t("Content-Type");
            }
        }
        if (!jgj.m33811e(zqeVar.m59732Q().m51741l(), w48VarM53885q)) {
            c17397aM51738i.m51763t("Authorization");
        }
        return c17397aM51738i.m51744B(w48VarM53885q).m51746b();
    }

    /* renamed from: b */
    public final ule m21709b(zqe zqeVar, dl6 dl6Var) throws ProtocolException {
        zce zceVarM23393h;
        bve bveVarM59208v = (dl6Var == null || (zceVarM23393h = dl6Var.m23393h()) == null) ? null : zceVarM23393h.m59208v();
        int iM59739h = zqeVar.m59739h();
        String strM51737h = zqeVar.m59732Q().m51737h();
        if (iM59739h != 307 && iM59739h != 308) {
            if (iM59739h == 401) {
                return this.f18584a.m30067f().mo31614a(bveVarM59208v, zqeVar);
            }
            if (iM59739h == 421) {
                xle xleVarM51730a = zqeVar.m59732Q().m51730a();
                if ((xleVarM51730a != null && xleVarM51730a.mo42498h()) || dl6Var == null || !dl6Var.m23397l()) {
                    return null;
                }
                dl6Var.m23393h().m59207u();
                return zqeVar.m59732Q();
            }
            if (iM59739h == 503) {
                zqe zqeVarM59729J = zqeVar.m59729J();
                if ((zqeVarM59729J == null || zqeVarM59729J.m59739h() != 503) && m21713f(zqeVar, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                    return zqeVar.m59732Q();
                }
                return null;
            }
            if (iM59739h == 407) {
                sq8.m48646e(bveVarM59208v);
                if (bveVarM59208v.m19865b().type() == Proxy.Type.HTTP) {
                    return this.f18584a.m30056F().mo31614a(bveVarM59208v, zqeVar);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM59739h == 408) {
                if (!this.f18584a.m30059I()) {
                    return null;
                }
                xle xleVarM51730a2 = zqeVar.m59732Q().m51730a();
                if (xleVarM51730a2 != null && xleVarM51730a2.mo42498h()) {
                    return null;
                }
                zqe zqeVarM59729J2 = zqeVar.m59729J();
                if ((zqeVarM59729J2 == null || zqeVarM59729J2.m59739h() != 408) && m21713f(zqeVar, 0) <= 0) {
                    return zqeVar.m59732Q();
                }
                return null;
            }
            switch (iM59739h) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m21708a(zqeVar, strM51737h);
    }

    /* renamed from: c */
    public final boolean m21710c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: d */
    public final boolean m21711d(IOException iOException, yce yceVar, ule uleVar, boolean z) {
        if (this.f18584a.m30059I()) {
            return !(z && m21712e(iOException, uleVar)) && m21710c(iOException, z) && yceVar.m57598z();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m21712e(IOException iOException, ule uleVar) {
        xle xleVarM51730a = uleVar.m51730a();
        return (xleVarM51730a != null && xleVarM51730a.mo42498h()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int m21713f(zqe zqeVar, int i) throws NumberFormatException {
        String strM59725t = zqe.m59725t(zqeVar, HttpHeaders.RETRY_AFTER, null, 2, null);
        if (strM59725t == null) {
            return i;
        }
        if (!new mge("\\d+").m38995g(strM59725t)) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Integer numValueOf = Integer.valueOf(strM59725t);
        sq8.m48648g(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r6 = p001o.egj.m25002u(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r7 = r0.m59761n(r6).m59750c();
        r0 = r1.m57589p();
        r6 = m21709b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r6 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r0.m23398m() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r1.m57576A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r1.m57584j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r0 = r6.m51730a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r0.mo42498h() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r1.m57584j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        p001o.ggj.m28626f(r7.m59735c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r8 > 20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r0 = r11.mo20972a(r0).m59728H().m59764q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r7 == null) goto L11;
     */
    @Override // p001o.tn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zqe intercept(tn8.InterfaceC17165a interfaceC17165a) {
        ule uleVarM21709b;
        sq8.m48649h(interfaceC17165a, "chain");
        cde cdeVar = (cde) interfaceC17165a;
        ule uleVarM20979i = cdeVar.m20979i();
        yce yceVarM20975e = cdeVar.m20975e();
        List listM21246k = ch3.m21246k();
        int i = 0;
        zqe zqeVarM59750c = null;
        while (true) {
            boolean z = true;
            while (true) {
                yceVarM20975e.m57583i(uleVarM20979i, z, cdeVar);
                try {
                    if (yceVarM20975e.isCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        break;
                    } catch (IOException e) {
                        if (!m21711d(e, yceVarM20975e, uleVarM20979i, !(e instanceof dt3))) {
                            throw ggj.m28619H(e, listM21246k);
                        }
                        listM21246k = kh3.y0(listM21246k, e);
                        yceVarM20975e.m57584j(true);
                        z = false;
                    }
                } catch (Throwable th) {
                    yceVarM20975e.m57584j(true);
                    throw th;
                }
            }
            yceVarM20975e.m57584j(true);
            uleVarM20979i = uleVarM21709b;
        }
    }
}
