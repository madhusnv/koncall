package iz;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4264f;
import nx.AbstractC5185w;
import p020v.x0;
import pg.w9;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.n */
/* loaded from: classes3.dex */
public final class C3381n implements InterfaceC3369b, InterfaceC3383p, r0 {

    /* renamed from: a */
    public static final C3381n f17960a = new C3381n();

    /* renamed from: a */
    public static final C3376i m7743a(C3381n c3381n, String str) {
        C3376i c3376i = new C3376i(str);
        C3376i.f17871d.put(str, c3376i);
        return c3376i;
    }

    /* renamed from: b */
    public static final void m7744b(StringBuilder sb2, List list) {
        C4264f c4264fM11917h = w9.m11917h(2, w9.m11919j(0, list.size()));
        int i10 = c4264fM11917h.f21646a;
        int i11 = c4264fM11917h.f21647b;
        int i12 = c4264fM11917h.f21648c;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i10);
            String str2 = (String) list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
            if (i10 == i11) {
                return;
            } else {
                i10 += i12;
            }
        }
    }

    @Override // iz.InterfaceC3383p
    /* renamed from: c */
    public List mo7745c(String hostname) throws UnknownHostException {
        AbstractC4154l.m8923f(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            AbstractC4154l.m8922e(allByName, "getAllByName(...)");
            return AbstractC6662l.m12708K(allByName);
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }

    @Override // iz.InterfaceC3369b
    /* renamed from: d */
    public x0 mo7726d(o0 o0Var, k0 k0Var) {
        return null;
    }

    /* renamed from: e */
    public synchronized C3376i m7746e(String javaName) {
        C3376i c3376i;
        String strConcat;
        try {
            AbstractC4154l.m8923f(javaName, "javaName");
            LinkedHashMap linkedHashMap = C3376i.f17871d;
            c3376i = (C3376i) linkedHashMap.get(javaName);
            if (c3376i == null) {
                if (AbstractC5185w.m10138t(javaName, "TLS_", false)) {
                    String strSubstring = javaName.substring(4);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (AbstractC5185w.m10138t(javaName, "SSL_", false)) {
                    String strSubstring2 = javaName.substring(4);
                    AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = javaName;
                }
                c3376i = (C3376i) linkedHashMap.get(strConcat);
                if (c3376i == null) {
                    c3376i = new C3376i(javaName);
                }
                linkedHashMap.put(javaName, c3376i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c3376i;
    }
}
