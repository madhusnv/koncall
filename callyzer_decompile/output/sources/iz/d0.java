package iz;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import l1.C4327p;
import mz.C4920d;
import nf.C5047i;
import pg.c8;
import tz.AbstractC7285d;
import vz.C7834a;
import xz.C8521c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 implements InterfaceC3371d {

    /* renamed from: B */
    public static final List f17831B = AbstractC4299e.m9022k(new f0[]{f0.HTTP_2, f0.HTTP_1_1});

    /* renamed from: C */
    public static final List f17832C = AbstractC4299e.m9022k(new C3379l[]{C3379l.f17933e, C3379l.f17934f});

    /* renamed from: A */
    public final C5047i f17833A;

    /* renamed from: a */
    public final C3382o f17834a;

    /* renamed from: b */
    public final List f17835b;

    /* renamed from: c */
    public final List f17836c;

    /* renamed from: d */
    public final InterfaceC3385r f17837d;

    /* renamed from: e */
    public final boolean f17838e;

    /* renamed from: f */
    public final boolean f17839f;

    /* renamed from: g */
    public final C3381n f17840g;

    /* renamed from: h */
    public final boolean f17841h;

    /* renamed from: i */
    public final boolean f17842i;

    /* renamed from: j */
    public final C3381n f17843j;

    /* renamed from: k */
    public final InterfaceC3383p f17844k;

    /* renamed from: l */
    public final ProxySelector f17845l;

    /* renamed from: m */
    public final InterfaceC3369b f17846m;

    /* renamed from: n */
    public final SocketFactory f17847n;

    /* renamed from: o */
    public final SSLSocketFactory f17848o;

    /* renamed from: p */
    public final X509TrustManager f17849p;

    /* renamed from: q */
    public final List f17850q;

    /* renamed from: r */
    public final List f17851r;

    /* renamed from: s */
    public final C8521c f17852s;

    /* renamed from: t */
    public final C3373f f17853t;

    /* renamed from: u */
    public final c8 f17854u;

    /* renamed from: v */
    public final int f17855v;

    /* renamed from: w */
    public final int f17856w;

    /* renamed from: x */
    public final int f17857x;

    /* renamed from: y */
    public final C4327p f17858y;

    /* renamed from: z */
    public final C4920d f17859z;

    public d0(c0 c0Var) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        this.f17834a = c0Var.f17809a;
        this.f17835b = AbstractC4299e.m9021j(c0Var.f17811c);
        this.f17836c = AbstractC4299e.m9021j(c0Var.f17812d);
        this.f17837d = c0Var.f17813e;
        boolean z6 = c0Var.f17814f;
        this.f17838e = z6;
        boolean z10 = c0Var.f17815g;
        this.f17839f = z10;
        this.f17840g = c0Var.f17816h;
        this.f17841h = c0Var.f17817i;
        this.f17842i = c0Var.f17818j;
        this.f17843j = c0Var.f17819k;
        this.f17844k = c0Var.f17820l;
        ProxySelector proxySelector = c0Var.f17821m;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = C7834a.f37586a;
        }
        this.f17845l = proxySelector;
        this.f17846m = c0Var.f17822n;
        this.f17847n = c0Var.f17823o;
        List list = c0Var.f17824p;
        this.f17850q = list;
        this.f17851r = c0Var.f17825q;
        this.f17852s = c0Var.f17826r;
        int i10 = c0Var.f17828t;
        this.f17855v = i10;
        int i11 = c0Var.f17829u;
        this.f17856w = i11;
        int i12 = c0Var.f17830v;
        this.f17857x = i12;
        C4327p c4327p = new C4327p(8);
        this.f17858y = c4327p;
        this.f17859z = C4920d.f24472l;
        C5047i c5047i = c0Var.f17810b;
        if (c5047i == null) {
            c5047i = new C5047i(0L, null, i11, i12, i10, i11, z6, z10, c4327p, 31);
            c0Var.f17810b = c5047i;
        }
        this.f17833A = c5047i;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C3379l) it.next()).f17935a) {
                    AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
                    AbstractC7285d.f34750a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    AbstractC4154l.m8920c(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.f17849p = x509TrustManager;
                            AbstractC7285d abstractC7285d2 = AbstractC7285d.f34750a;
                            abstractC7285d2.getClass();
                            try {
                                SSLContext sSLContextMo13613j = abstractC7285d2.mo13613j();
                                sSLContextMo13613j.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = sSLContextMo13613j.getSocketFactory();
                                AbstractC4154l.m8922e(socketFactory, "getSocketFactory(...)");
                                this.f17848o = socketFactory;
                                c8 c8VarMo13606a = AbstractC7285d.f34750a.mo13606a(x509TrustManager);
                                this.f17854u = c8VarMo13606a;
                                C3373f c3373f = c0Var.f17827s;
                                this.f17853t = AbstractC4154l.m8918a(c3373f.f17862b, c8VarMo13606a) ? c3373f : new C3373f(c3373f.f17861a, c8VarMo13606a);
                            } catch (GeneralSecurityException e2) {
                                throw new AssertionError("No System TLS: " + e2, e2);
                            }
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    AbstractC4154l.m8922e(string, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
                }
            }
            this.f17848o = null;
            this.f17854u = null;
            this.f17849p = null;
            this.f17853t = C3373f.f17860c;
        } else {
            this.f17848o = null;
            this.f17854u = null;
            this.f17849p = null;
            this.f17853t = C3373f.f17860c;
        }
        X509TrustManager x509TrustManager2 = this.f17849p;
        c8 c8Var = this.f17854u;
        SSLSocketFactory sSLSocketFactory = this.f17848o;
        List list2 = this.f17836c;
        List list3 = this.f17835b;
        AbstractC4154l.m8921d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        AbstractC4154l.m8921d(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.f17850q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C3379l) it2.next()).f17935a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (c8Var == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (c8Var != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC4154l.m8918a(this.f17853t, C3373f.f17860c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public d0() {
        this(new c0());
    }
}
