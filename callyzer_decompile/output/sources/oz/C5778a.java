package oz;

import iz.C3381n;
import iz.InterfaceC3392y;
import iz.d0;
import iz.i0;
import iz.k0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC4154l;
import nz.C5197h;
import nz.C5205p;
import nz.InterfaceC5198i;
import nz.InterfaceC5212w;
import okhttp3.internal.http2.ConnectionShutdownException;
import p020v.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oz.a */
/* loaded from: classes3.dex */
public final class C5778a implements InterfaceC3392y {

    /* renamed from: a */
    public final /* synthetic */ int f28343a;

    /* renamed from: b */
    public final Object f28344b;

    public /* synthetic */ C5778a(int i10, Object obj) {
        this.f28343a = i10;
        this.f28344b = obj;
    }

    /* renamed from: d */
    public static int m11310d(k0 k0Var, int i10) throws NumberFormatException {
        String strM7787b = k0Var.f17922f.m7787b("Retry-After");
        if (strM7787b == null) {
            strM7787b = null;
        }
        if (strM7787b == null) {
            return i10;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strM7787b).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM7787b);
        AbstractC4154l.m8922e(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0152, code lost:
    
        r6.m10192c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016d, code lost:
    
        return r9;
     */
    @Override // iz.InterfaceC3392y
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final iz.k0 mo7804a(oz.C5783f r37) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.C5778a.mo7804a(oz.f):iz.k0");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p020v.x0 m11311b(iz.k0 r12, nz.C5197h r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.C5778a.m11311b(iz.k0, nz.h):v.x0");
    }

    /* renamed from: c */
    public boolean m11312c(IOException iOException, C5205p c5205p, x0 x0Var) {
        i0 i0Var;
        boolean z6 = iOException instanceof ConnectionShutdownException;
        if (!((d0) this.f28344b).f17838e) {
            return false;
        }
        if ((!z6 && (((i0Var = (i0) x0Var.f36757e) != null && i0Var.mo7727d()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z6) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C5197h c5197h = c5205p.f25374r;
        if (c5197h == null || !c5197h.f25343f) {
            return false;
        }
        InterfaceC5198i interfaceC5198i = c5205p.f25366h;
        AbstractC4154l.m8920c(interfaceC5198i);
        InterfaceC5212w interfaceC5212wMo9080b = interfaceC5198i.mo9080b();
        C5197h c5197h2 = c5205p.f25374r;
        return interfaceC5212wMo9080b.mo8775p(c5197h2 != null ? c5197h2.m10183c() : null);
    }

    public C5778a(C3381n cookieJar) {
        this.f28343a = 0;
        AbstractC4154l.m8923f(cookieJar, "cookieJar");
        this.f28344b = cookieJar;
    }
}
