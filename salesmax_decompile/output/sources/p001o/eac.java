package p001o;

import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes6.dex */
public final class eac implements HostnameVerifier {

    /* renamed from: a */
    public static final eac f21258a = new eac();

    /* renamed from: a */
    public final List m24657a(X509Certificate x509Certificate) {
        sq8.m48649h(x509Certificate, "certificate");
        return kh3.x0(m24659c(x509Certificate, 7), m24659c(x509Certificate, 2));
    }

    /* renamed from: b */
    public final String m24658b(String str) {
        if (!m24660d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        sq8.m48648g(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: c */
    public final List m24659c(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && sq8.m48644c(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return ch3.m21246k();
        }
    }

    /* renamed from: d */
    public final boolean m24660d(String str) {
        return str.length() == ((int) kqi.m36055b(str, 0, 0, 3, null));
    }

    /* renamed from: e */
    public final boolean m24661e(String str, X509Certificate x509Certificate) {
        sq8.m48649h(str, "host");
        sq8.m48649h(x509Certificate, "certificate");
        return wfj.m54337a(str) ? m24664h(str, x509Certificate) : m24663g(str, x509Certificate);
    }

    /* renamed from: f */
    public final boolean m24662f(String str, String str2) {
        String str3;
        String str4 = str;
        if ((str4 == null || str.length() == 0) || e9g.m24597K(str4, ".", false, 2, null) || e9g.m24605w(str4, "..", false, 2, null)) {
            return false;
        }
        if ((str2 == null || str2.length() == 0) || e9g.m24597K(str2, ".", false, 2, null) || e9g.m24605w(str2, "..", false, 2, null)) {
            return false;
        }
        if (!e9g.m24605w(str4, ".", false, 2, null)) {
            str4 = str4 + '.';
        }
        String str5 = str4;
        if (e9g.m24605w(str2, ".", false, 2, null)) {
            str3 = str2;
        } else {
            str3 = str2 + '.';
        }
        String strM24658b = m24658b(str3);
        if (!f9g.m26306P(strM24658b, "*", false, 2, null)) {
            return sq8.m48644c(str5, strM24658b);
        }
        if (!e9g.m24597K(strM24658b, "*.", false, 2, null) || f9g.a0(strM24658b, '*', 1, false, 4, null) != -1 || str5.length() < strM24658b.length() || sq8.m48644c("*.", strM24658b)) {
            return false;
        }
        String strSubstring = strM24658b.substring(1);
        sq8.m48648g(strSubstring, "substring(...)");
        if (!e9g.m24605w(str5, strSubstring, false, 2, null)) {
            return false;
        }
        int length = str5.length() - strSubstring.length();
        return length <= 0 || f9g.g0(str5, '.', length + (-1), false, 4, null) == -1;
    }

    /* renamed from: g */
    public final boolean m24663g(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM24658b = m24658b(str);
        List listM24659c = m24659c(x509Certificate, 2);
        if ((listM24659c instanceof Collection) && listM24659c.isEmpty()) {
            return false;
        }
        Iterator it = listM24659c.iterator();
        while (it.hasNext()) {
            if (f21258a.m24662f(strM24658b, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m24664h(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM54347k = wfj.m54347k(str);
        List listM24659c = m24659c(x509Certificate, 7);
        if ((listM24659c instanceof Collection) && listM24659c.isEmpty()) {
            return false;
        }
        Iterator it = listM24659c.iterator();
        while (it.hasNext()) {
            if (sq8.m48644c(strM54347k, wfj.m54347k((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        sq8.m48649h(str, "host");
        sq8.m48649h(sSLSession, OutcomeEventsTable.COLUMN_NAME_SESSION);
        if (!m24660d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            sq8.m48647f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m24661e(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
