package pg;

import aw.C0465e;
import iz.C3376i;
import iz.C3388u;
import java.io.IOException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kz.AbstractC4299e;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d7 {
    /* renamed from: a */
    public static C3388u m11581a(SSLSession sSLSession) throws IOException {
        Object objM9022k;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C3376i c3376iM7746e = C3376i.f17869b.m7746e(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        iz.q0.Companion.getClass();
        iz.q0 q0VarM7756a = iz.p0.m7756a(protocol);
        try {
            objM9022k = AbstractC4299e.m9022k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objM9022k = C6668r.f31943a;
        }
        return new C3388u(q0VarM7756a, c3376iM7746e, AbstractC4299e.m9022k(sSLSession.getLocalCertificates()), new C0465e(15, objM9022k));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d A[PHI: r20 r21 r22 r23 r24 r25 r26 r27 r28
      0x016d: PHI (r20v6 x2.d) = (r20v5 x2.d), (r20v7 x2.d) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r21v6 boolean) = (r21v5 boolean), (r21v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r22v13 f4.a) = (r22v12 f4.a), (r22v14 f4.a) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r23v6 x2.n) = (r23v5 x2.n), (r23v7 x2.n) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r24v6 java.lang.Boolean) = (r24v5 java.lang.Boolean), (r24v7 java.lang.Boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r25v11 d4.h) = (r25v10 d4.h), (r25v12 d4.h) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r27v6 java.lang.Integer) = (r27v5 java.lang.Integer), (r27v7 java.lang.Integer) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r28v12 g4.h) = (r28v11 g4.h), (r28v13 g4.h) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11582b(android.view.ViewStructure r38, v3.g0 r39, android.view.autofill.AutofillId r40, java.lang.String r41, e4.C1944a r42) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.d7.m11582b(android.view.ViewStructure, v3.g0, android.view.autofill.AutofillId, java.lang.String, e4.a):void");
    }
}
