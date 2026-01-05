package xz;

import com.sun.mail.util.AbstractC1452a;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xz.c */
/* loaded from: classes3.dex */
public final class C8521c implements HostnameVerifier {

    /* renamed from: a */
    public static final C8521c f41446a = new C8521c();

    /* renamed from: a */
    public static List m15794a(X509Certificate x509Certificate, int i10) throws CertificateParsingException {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return C6668r.f31943a;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && AbstractC4154l.m8918a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m15795b(String str) {
        int i10;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(length2, "endIndex > string.length: ", " > ");
            sbM4567n.append(str.length());
            throw new IllegalArgumentException(sbM4567n.toString().toString());
        }
        long j6 = 0;
        int i11 = 0;
        while (i11 < length2) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j6++;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                } else {
                    int i12 = i11 + 1;
                    char cCharAt2 = i12 < length2 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j6++;
                        i11 = i12;
                    } else {
                        j6 += 4;
                        i11 += 2;
                    }
                }
                j6 += i10;
            }
            i11++;
        }
        return length == ((int) j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m15796c(java.lang.String r11, java.security.cert.X509Certificate r12) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xz.C8521c.m15796c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        AbstractC4154l.m8923f(host, "host");
        AbstractC4154l.m8923f(session, "session");
        if (m15795b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                AbstractC4154l.m8921d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return m15796c(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
