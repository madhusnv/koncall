package iz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import og.pe;
import tw.C7240a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.l */
/* loaded from: classes3.dex */
public final class C3379l {

    /* renamed from: e */
    public static final C3379l f17933e;

    /* renamed from: f */
    public static final C3379l f17934f;

    /* renamed from: a */
    public final boolean f17935a;

    /* renamed from: b */
    public final boolean f17936b;

    /* renamed from: c */
    public final String[] f17937c;

    /* renamed from: d */
    public final String[] f17938d;

    static {
        C3376i c3376i = C3376i.f17885r;
        C3376i c3376i2 = C3376i.f17886s;
        C3376i c3376i3 = C3376i.f17887t;
        C3376i c3376i4 = C3376i.f17879l;
        C3376i c3376i5 = C3376i.f17881n;
        C3376i c3376i6 = C3376i.f17880m;
        C3376i c3376i7 = C3376i.f17882o;
        C3376i c3376i8 = C3376i.f17884q;
        C3376i c3376i9 = C3376i.f17883p;
        List listM10834i = pe.m10834i(c3376i, c3376i2, c3376i3, c3376i4, c3376i5, c3376i6, c3376i7, c3376i8, c3376i9);
        List listM10834i2 = pe.m10834i(c3376i, c3376i2, c3376i3, c3376i4, c3376i5, c3376i6, c3376i7, c3376i8, c3376i9, C3376i.f17877j, C3376i.f17878k, C3376i.f17875h, C3376i.f17876i, C3376i.f17873f, C3376i.f17874g, C3376i.f17872e);
        C3378k c3378k = new C3378k();
        C3376i[] c3376iArr = (C3376i[]) listM10834i.toArray(new C3376i[0]);
        c3378k.m7735c((C3376i[]) Arrays.copyOf(c3376iArr, c3376iArr.length));
        q0 q0Var = q0.TLS_1_3;
        q0 q0Var2 = q0.TLS_1_2;
        c3378k.m7737e(q0Var, q0Var2);
        c3378k.f17914b = true;
        c3378k.m7733a();
        C3378k c3378k2 = new C3378k();
        C3376i[] c3376iArr2 = (C3376i[]) listM10834i2.toArray(new C3376i[0]);
        c3378k2.m7735c((C3376i[]) Arrays.copyOf(c3376iArr2, c3376iArr2.length));
        c3378k2.m7737e(q0Var, q0Var2);
        c3378k2.f17914b = true;
        f17933e = c3378k2.m7733a();
        C3378k c3378k3 = new C3378k();
        C3376i[] c3376iArr3 = (C3376i[]) listM10834i2.toArray(new C3376i[0]);
        c3378k3.m7735c((C3376i[]) Arrays.copyOf(c3376iArr3, c3376iArr3.length));
        c3378k3.m7737e(q0Var, q0Var2, q0.TLS_1_1, q0.TLS_1_0);
        c3378k3.f17914b = true;
        c3378k3.m7733a();
        f17934f = new C3379l(false, false, null, null);
    }

    public C3379l(boolean z6, boolean z10, String[] strArr, String[] strArr2) {
        this.f17935a = z6;
        this.f17936b = z10;
        this.f17937c = strArr;
        this.f17938d = strArr2;
    }

    /* renamed from: a */
    public final void m7740a(SSLSocket sSLSocket, boolean z6) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        AbstractC4154l.m8920c(enabledCipherSuites);
        String[] strArr = this.f17937c;
        if (strArr != null) {
            enabledCipherSuites = AbstractC4297c.m9005i(strArr, enabledCipherSuites, C3376i.f17870c);
        }
        String[] strArr2 = this.f17938d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC4154l.m8922e(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = AbstractC4297c.m9005i(enabledProtocols2, strArr2, C7240a.f34590b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC4154l.m8920c(supportedCipherSuites);
        C3375h c3375h = C3376i.f17870c;
        byte[] bArr = AbstractC4297c.f21703a;
        int length = supportedCipherSuites.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (c3375h.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (z6 && i10 != -1) {
            String str = supportedCipherSuites[i10];
            AbstractC4154l.m8922e(str, "get(...)");
            AbstractC4154l.m8923f(enabledCipherSuites, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C3378k c3378k = new C3378k(this);
        c3378k.m7736d((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        c3378k.m7738f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C3379l c3379lM7733a = c3378k.m7733a();
        if (c3379lM7733a.m7742c() != null) {
            sSLSocket.setEnabledProtocols(c3379lM7733a.f17938d);
        }
        if (c3379lM7733a.m7741b() != null) {
            sSLSocket.setEnabledCipherSuites(c3379lM7733a.f17937c);
        }
    }

    /* renamed from: b */
    public final ArrayList m7741b() {
        String[] strArr = this.f17937c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C3376i.f17869b.m7746e(str));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final ArrayList m7742c() {
        String[] strArr = this.f17938d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            q0.Companion.getClass();
            arrayList.add(p0.m7756a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3379l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C3379l c3379l = (C3379l) obj;
        boolean z6 = c3379l.f17935a;
        boolean z10 = this.f17935a;
        if (z10 != z6) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f17937c, c3379l.f17937c) && Arrays.equals(this.f17938d, c3379l.f17938d) && this.f17936b == c3379l.f17936b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f17935a) {
            return 17;
        }
        String[] strArr = this.f17937c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f17938d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f17936b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f17935a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(m7741b(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(m7742c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return i0.m0.m7382o(sb2, this.f17936b, ')');
    }
}
