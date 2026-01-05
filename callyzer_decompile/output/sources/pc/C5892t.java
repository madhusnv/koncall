package pc;

import ad.C0100g;
import ad.C0109p;
import ad.C0119z;
import com.google.android.gms.internal.measurement.j4;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nc.AbstractC5005p;
import nc.C5004o;
import nc.InterfaceC5007r;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.pe;
import pg.aa;
import pg.w9;
import pg.x9;
import rw.C6668r;
import sd.C6808b;
import sd.C6813g;
import tb.C7105p;
import zc.AbstractC8927d;
import zc.C8935l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.t */
/* loaded from: classes.dex */
public final class C5892t extends ProxySelector {

    /* renamed from: a */
    public final InterfaceC5007r f28720a;

    public C5892t(InterfaceC5007r sdkSelector) {
        AbstractC4154l.m8923f(sdkSelector, "sdkSelector");
        this.f28720a = sdkSelector;
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        String host;
        C6808b c6808b;
        if (uri != null) {
            C8935l c8935l = C8935l.f42908c;
            j4 j4Var = new j4(0);
            C0100g c0100g = new C0100g();
            C6808b c6808b2 = C6808b.f32347f;
            String scheme = uri.getScheme();
            AbstractC4154l.m8922e(scheme, "getScheme(...)");
            C8935l c8935lM11541a = aa.m11541a(scheme);
            String host2 = uri.getHost();
            AbstractC4154l.m8922e(host2, "getHost(...)");
            if (AbstractC5185w.m10138t(host2, "[", false)) {
                String host3 = uri.getHost();
                AbstractC4154l.m8922e(host3, "getHost(...)");
                host = AbstractC5178p.m10114Y(host3, w9.m11919j(1, uri.getHost().length() - 1));
            } else {
                host = uri.getHost();
            }
            AbstractC4154l.m8920c(host);
            AbstractC8927d abstractC8927dM11935c = x9.m11935c(host);
            int port = uri.getPort();
            Integer numValueOf = Integer.valueOf(port);
            if (port <= 0) {
                numValueOf = null;
            }
            String rawPath = uri.getRawPath();
            AbstractC4154l.m8922e(rawPath, "getRawPath(...)");
            j4Var.m3398p(rawPath);
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null && !AbstractC5178p.m10101L(rawQuery)) {
                String rawQuery2 = uri.getRawQuery();
                AbstractC4154l.m8922e(rawQuery2, "getRawQuery(...)");
                c0100g.m268i(c0100g.f352d, rawQuery2);
            }
            String rawUserInfo = uri.getRawUserInfo();
            if (rawUserInfo == null || AbstractC5178p.m10101L(rawUserInfo)) {
                c6808b = c6808b2;
            } else {
                int i10 = C0119z.f395c;
                String rawUserInfo2 = uri.getRawUserInfo();
                AbstractC4154l.m8922e(rawUserInfo2, "getRawUserInfo(...)");
                C7105p c7105p = new C7105p(0);
                c7105p.m13389n(rawUserInfo2);
                c6808b2 = (C6808b) c7105p.f34290b;
                c6808b = (C6808b) c7105p.f34291c;
                new C0119z(c6808b2, c6808b);
            }
            String rawFragment = uri.getRawFragment();
            AbstractC5005p abstractC5005pMo9129a = this.f28720a.mo9129a(new C0109p(c8935lM11541a, abstractC8927dM11935c, numValueOf != null ? numValueOf.intValue() : c8935lM11541a.f42912b, j4Var.m3393d(), c0100g.m263d(), new C0119z(c6808b2, c6808b), rawFragment != null ? C6813g.f32361k.mo12985b(rawFragment) : null));
            if (abstractC5005pMo9129a instanceof C5004o) {
                Proxy.Type type = Proxy.Type.HTTP;
                C0109p c0109p = ((C5004o) abstractC5005pMo9129a).f24758a;
                return pe.m10833h(new Proxy(type, new InetSocketAddress(c0109p.f376b.toString(), c0109p.f377c)));
            }
        }
        return C6668r.f31943a;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
