package pg;

import b00.AbstractC0517b;
import b00.C0529n;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b7 {

    /* renamed from: a */
    public static final /* synthetic */ int f28807a = 0;

    /* renamed from: a */
    public static String m11546a(X509Certificate x509Certificate) {
        StringBuilder sb2 = new StringBuilder("sha256/");
        C0529n c0529n = C0529n.f3647d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        AbstractC4154l.m8922e(encoded, "getEncoded(...)");
        int length = encoded.length;
        AbstractC0517b.m1526e(encoded.length, 0, length);
        sb2.append(new C0529n(AbstractC6662l.m12723m(encoded, 0, length)).mo1562c("SHA-256").mo1561a());
        return sb2.toString();
    }
}
