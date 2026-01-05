package iz;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4296b;
import kz.AbstractC4299e;
import mm.AbstractC4801l;
import xz.C8521c;
import yz.AbstractC8831a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.a */
/* loaded from: classes3.dex */
public final class C3368a {

    /* renamed from: a */
    public final InterfaceC3383p f17773a;

    /* renamed from: b */
    public final SocketFactory f17774b;

    /* renamed from: c */
    public final SSLSocketFactory f17775c;

    /* renamed from: d */
    public final HostnameVerifier f17776d;

    /* renamed from: e */
    public final C3373f f17777e;

    /* renamed from: f */
    public final InterfaceC3369b f17778f;

    /* renamed from: g */
    public final ProxySelector f17779g;

    /* renamed from: h */
    public final C3391x f17780h;

    /* renamed from: i */
    public final List f17781i;

    /* renamed from: j */
    public final List f17782j;

    public C3368a(String uriHost, int i10, InterfaceC3383p dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, C8521c c8521c, C3373f c3373f, InterfaceC3369b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC4154l.m8923f(uriHost, "uriHost");
        AbstractC4154l.m8923f(dns, "dns");
        AbstractC4154l.m8923f(socketFactory, "socketFactory");
        AbstractC4154l.m8923f(proxyAuthenticator, "proxyAuthenticator");
        AbstractC4154l.m8923f(protocols, "protocols");
        AbstractC4154l.m8923f(connectionSpecs, "connectionSpecs");
        AbstractC4154l.m8923f(proxySelector, "proxySelector");
        this.f17773a = dns;
        this.f17774b = socketFactory;
        this.f17775c = sSLSocketFactory;
        this.f17776d = c8521c;
        this.f17777e = c3373f;
        this.f17778f = proxyAuthenticator;
        this.f17779g = proxySelector;
        C3390w c3390w = new C3390w();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            c3390w.f17983b = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            c3390w.f17983b = "https";
        }
        String strM8996b = AbstractC4296b.m8996b(AbstractC8831a.m16287d(0, 0, 7, uriHost));
        if (strM8996b == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        c3390w.f17987f = strM8996b;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "unexpected port: ").toString());
        }
        c3390w.f17984c = i10;
        this.f17780h = c3390w.m7793a();
        this.f17781i = AbstractC4299e.m9021j(protocols);
        this.f17782j = AbstractC4299e.m9021j(connectionSpecs);
    }

    /* renamed from: a */
    public final boolean m7725a(C3368a that) {
        AbstractC4154l.m8923f(that, "that");
        return AbstractC4154l.m8918a(this.f17773a, that.f17773a) && AbstractC4154l.m8918a(this.f17778f, that.f17778f) && AbstractC4154l.m8918a(this.f17781i, that.f17781i) && AbstractC4154l.m8918a(this.f17782j, that.f17782j) && AbstractC4154l.m8918a(this.f17779g, that.f17779g) && AbstractC4154l.m8918a(this.f17775c, that.f17775c) && AbstractC4154l.m8918a(this.f17776d, that.f17776d) && AbstractC4154l.m8918a(this.f17777e, that.f17777e) && this.f17780h.f17995e == that.f17780h.f17995e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3368a)) {
            return false;
        }
        C3368a c3368a = (C3368a) obj;
        return AbstractC4154l.m8918a(this.f17780h, c3368a.f17780h) && m7725a(c3368a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17777e) + ((Objects.hashCode(this.f17776d) + ((Objects.hashCode(this.f17775c) + ((this.f17779g.hashCode() + AbstractC1452a.m4559f(this.f17782j, AbstractC1452a.m4559f(this.f17781i, (this.f17778f.hashCode() + ((this.f17773a.hashCode() + AbstractC0030c.m113d(527, 31, this.f17780h.f17999i)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        C3391x c3391x = this.f17780h;
        sb2.append(c3391x.f17994d);
        sb2.append(':');
        sb2.append(c3391x.f17995e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.f17779g);
        sb2.append('}');
        return sb2.toString();
    }
}
