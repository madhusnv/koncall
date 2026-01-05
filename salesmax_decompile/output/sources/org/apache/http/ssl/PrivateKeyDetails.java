package org.apache.http.ssl;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public final class PrivateKeyDetails {
    private final X509Certificate[] certChain;

    /* renamed from: type, reason: collision with root package name */
    private final String f58182type;

    public PrivateKeyDetails(String str, X509Certificate[] x509CertificateArr) {
        this.f58182type = (String) Args.notNull(str, "Private key type");
        this.certChain = x509CertificateArr;
    }

    public X509Certificate[] getCertChain() {
        return this.certChain;
    }

    public String getType() {
        return this.f58182type;
    }

    public String toString() {
        return this.f58182type + ':' + Arrays.toString(this.certChain);
    }
}
