package mm;

import androidx.compose.foundation.layout.LayoutWeightElement;
import c9.C0908c;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jj.C3777b;
import og.k0;
import og.k1;
import og.m0;
import og.n0;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.util.Arrays;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.l */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4801l {
    /* renamed from: A */
    public static void m9723A(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str3, aSN1ObjectIdentifier, str + str2);
    }

    /* renamed from: B */
    public static byte[] m9724B(ASN1Sequence aSN1Sequence, int i10) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10)).getOctets());
    }

    /* renamed from: C */
    public static int m9725C(int i10, int i11, int i12, int i13) {
        return i10 + i11 + i12 + i13;
    }

    /* renamed from: D */
    public static StringBuilder m9726D(String str, String str2, StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        return sb3;
    }

    /* renamed from: a */
    public static int m9727a(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) / i12) + i13;
    }

    /* renamed from: b */
    public static int m9728b(ASN1Sequence aSN1Sequence, int i10) {
        return ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10)).intValueExact();
    }

    /* renamed from: c */
    public static long m9729c(long j6, long j10, long j11, long j12) {
        return (j6 * j10) + j11 + j12;
    }

    /* renamed from: d */
    public static String m9730d(int i10, String str) {
        return str + i10;
    }

    /* renamed from: e */
    public static String m9731e(IOException iOException, StringBuilder sb2) {
        sb2.append(iOException.getMessage());
        return sb2.toString();
    }

    /* renamed from: f */
    public static String m9732f(Exception exc, StringBuilder sb2) {
        sb2.append(exc.toString());
        return sb2.toString();
    }

    /* renamed from: g */
    public static String m9733g(String str, IOException iOException) {
        return str + iOException;
    }

    /* renamed from: h */
    public static String m9734h(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    /* renamed from: i */
    public static String m9735i(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    /* renamed from: j */
    public static String m9736j(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    /* renamed from: k */
    public static String m9737k(StringBuilder sb2, String str, StringBuilder sb3, String str2) {
        sb2.append(str);
        sb3.append(sb2.toString());
        sb3.append(str2);
        return sb3.toString();
    }

    /* renamed from: l */
    public static String m9738l(ASN1Sequence aSN1Sequence, StringBuilder sb2) {
        sb2.append(aSN1Sequence.size());
        return sb2.toString();
    }

    /* renamed from: m */
    public static StringBuilder m9739m(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    /* renamed from: n */
    public static StringBuilder m9740n(String str, String str2, String str3, StringBuilder sb2, ConfigurableProvider configurableProvider) {
        sb2.append(str);
        sb2.append(str2);
        configurableProvider.addAlgorithm(str3, sb2.toString());
        return new StringBuilder();
    }

    /* renamed from: o */
    public static StringBuilder m9741o(String str, String str2, StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
        return new StringBuilder(str2);
    }

    /* renamed from: p */
    public static StringBuilder m9742p(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    /* renamed from: q */
    public static HashMap m9743q(Class cls, k0 k0Var) {
        HashMap map = new HashMap();
        map.put(cls, k0Var);
        return map;
    }

    /* renamed from: r */
    public static Map m9744r(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2, EC.generalEcAttributes);
        configurableProvider.addAlgorithm(str3, str4, EC.generalEcAttributes);
        return EC.generalEcAttributes;
    }

    /* renamed from: s */
    public static C3777b m9745s(int i10, m0 m0Var, C0908c c0908c) {
        k0 k0Var = new k0(i10, m0Var);
        if (((HashMap) c0908c.f5575c) == null) {
            c0908c.f5575c = new HashMap();
        }
        ((HashMap) c0908c.f5575c).put(n0.class, k0Var);
        return new C3777b((String) c0908c.f5574b, ((HashMap) c0908c.f5575c) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) c0908c.f5575c)));
    }

    /* renamed from: t */
    public static ASN1ObjectIdentifier m9746t(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    /* renamed from: u */
    public static InterfaceC7879r m9747u(float f6, InterfaceC7879r interfaceC7879r, boolean z6) {
        return interfaceC7879r.mo14852e(new LayoutWeightElement(f6, z6));
    }

    /* renamed from: v */
    public static void m9748v(int i10, int i11, int i12, int i13, int i14) {
        k1.m10726a(i10);
        k1.m10726a(i11);
        k1.m10726a(i12);
        k1.m10726a(i13);
        k1.m10726a(i14);
    }

    /* renamed from: w */
    public static void m9749w(StringBuilder sb2, String str, String str2, boolean z6, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(z6);
        sb2.append(str3);
    }

    /* renamed from: x */
    public static void m9750x(StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
    }

    /* renamed from: y */
    public static void m9751y(StringBuilder sb2, boolean z6, String str, String str2, String str3) {
        sb2.append(z6);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    /* renamed from: z */
    public static void m9752z(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }
}
