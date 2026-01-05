package p001o;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;
import p001o.w48;

/* loaded from: classes6.dex */
public final class d60 {

    /* renamed from: a */
    public final ov5 f19125a;

    /* renamed from: b */
    public final SocketFactory f19126b;

    /* renamed from: c */
    public final SSLSocketFactory f19127c;

    /* renamed from: d */
    public final HostnameVerifier f19128d;

    /* renamed from: e */
    public final pf2 f19129e;

    /* renamed from: f */
    public final t01 f19130f;

    /* renamed from: g */
    public final Proxy f19131g;

    /* renamed from: h */
    public final ProxySelector f19132h;

    /* renamed from: i */
    public final w48 f19133i;

    /* renamed from: j */
    public final List f19134j;

    /* renamed from: k */
    public final List f19135k;

    public d60(String str, int i, ov5 ov5Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, pf2 pf2Var, t01 t01Var, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        sq8.m48649h(str, "uriHost");
        sq8.m48649h(ov5Var, "dns");
        sq8.m48649h(socketFactory, "socketFactory");
        sq8.m48649h(t01Var, "proxyAuthenticator");
        sq8.m48649h(list, "protocols");
        sq8.m48649h(list2, "connectionSpecs");
        sq8.m48649h(proxySelector, "proxySelector");
        this.f19125a = ov5Var;
        this.f19126b = socketFactory;
        this.f19127c = sSLSocketFactory;
        this.f19128d = hostnameVerifier;
        this.f19129e = pf2Var;
        this.f19130f = t01Var;
        this.f19131g = proxy;
        this.f19132h = proxySelector;
        this.f19133i = new w48.C17774a().m53921x(sSLSocketFactory != null ? "https" : HttpHost.DEFAULT_SCHEME_NAME).m53908k(str).m53915r(i).m53903f();
        this.f19134j = jgj.m33829w(list);
        this.f19135k = jgj.m33829w(list2);
    }

    /* renamed from: a */
    public final pf2 m22346a() {
        return this.f19129e;
    }

    /* renamed from: b */
    public final List m22347b() {
        return this.f19135k;
    }

    /* renamed from: c */
    public final ov5 m22348c() {
        return this.f19125a;
    }

    /* renamed from: d */
    public final boolean m22349d(d60 d60Var) {
        sq8.m48649h(d60Var, "that");
        return sq8.m48644c(this.f19125a, d60Var.f19125a) && sq8.m48644c(this.f19130f, d60Var.f19130f) && sq8.m48644c(this.f19134j, d60Var.f19134j) && sq8.m48644c(this.f19135k, d60Var.f19135k) && sq8.m48644c(this.f19132h, d60Var.f19132h) && sq8.m48644c(this.f19131g, d60Var.f19131g) && sq8.m48644c(this.f19127c, d60Var.f19127c) && sq8.m48644c(this.f19128d, d60Var.f19128d) && sq8.m48644c(this.f19129e, d60Var.f19129e) && this.f19133i.m53882n() == d60Var.f19133i.m53882n();
    }

    /* renamed from: e */
    public final HostnameVerifier m22350e() {
        return this.f19128d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d60) {
            d60 d60Var = (d60) obj;
            if (sq8.m48644c(this.f19133i, d60Var.f19133i) && m22349d(d60Var)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final List m22351f() {
        return this.f19134j;
    }

    /* renamed from: g */
    public final Proxy m22352g() {
        return this.f19131g;
    }

    /* renamed from: h */
    public final t01 m22353h() {
        return this.f19130f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f19133i.hashCode()) * 31) + this.f19125a.hashCode()) * 31) + this.f19130f.hashCode()) * 31) + this.f19134j.hashCode()) * 31) + this.f19135k.hashCode()) * 31) + this.f19132h.hashCode()) * 31) + Objects.hashCode(this.f19131g)) * 31) + Objects.hashCode(this.f19127c)) * 31) + Objects.hashCode(this.f19128d)) * 31) + Objects.hashCode(this.f19129e);
    }

    /* renamed from: i */
    public final ProxySelector m22354i() {
        return this.f19132h;
    }

    /* renamed from: j */
    public final SocketFactory m22355j() {
        return this.f19126b;
    }

    /* renamed from: k */
    public final SSLSocketFactory m22356k() {
        return this.f19127c;
    }

    /* renamed from: l */
    public final w48 m22357l() {
        return this.f19133i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f19133i.m53877h());
        sb2.append(':');
        sb2.append(this.f19133i.m53882n());
        sb2.append(", ");
        if (this.f19131g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f19131g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f19132h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
