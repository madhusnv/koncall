package tz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4154l;
import xz.InterfaceC8522d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tz.b */
/* loaded from: classes3.dex */
public final class C7283b implements InterfaceC8522d {

    /* renamed from: a */
    public final X509TrustManager f34746a;

    /* renamed from: b */
    public final Method f34747b;

    public C7283b(X509TrustManager x509TrustManager, Method method) {
        this.f34746a = x509TrustManager;
        this.f34747b = method;
    }

    @Override // xz.InterfaceC8522d
    /* renamed from: a */
    public final X509Certificate mo13614a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.f34747b.invoke(this.f34746a, x509Certificate);
            AbstractC4154l.m8921d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7283b)) {
            return false;
        }
        C7283b c7283b = (C7283b) obj;
        return AbstractC4154l.m8918a(this.f34746a, c7283b.f34746a) && AbstractC4154l.m8918a(this.f34747b, c7283b.f34747b);
    }

    public final int hashCode() {
        return this.f34747b.hashCode() + (this.f34746a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f34746a + ", findByIssuerAndSignatureMethod=" + this.f34747b + ')';
    }
}
