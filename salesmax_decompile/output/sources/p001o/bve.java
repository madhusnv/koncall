package p001o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes6.dex */
public final class bve {

    /* renamed from: a */
    public final d60 f16860a;

    /* renamed from: b */
    public final Proxy f16861b;

    /* renamed from: c */
    public final InetSocketAddress f16862c;

    public bve(d60 d60Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        sq8.m48649h(d60Var, "address");
        sq8.m48649h(proxy, "proxy");
        sq8.m48649h(inetSocketAddress, "socketAddress");
        this.f16860a = d60Var;
        this.f16861b = proxy;
        this.f16862c = inetSocketAddress;
    }

    /* renamed from: a */
    public final d60 m19864a() {
        return this.f16860a;
    }

    /* renamed from: b */
    public final Proxy m19865b() {
        return this.f16861b;
    }

    /* renamed from: c */
    public final boolean m19866c() {
        if (this.f16861b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.f16860a.m22356k() != null || this.f16860a.m22351f().contains(a2e.H2_PRIOR_KNOWLEDGE);
    }

    /* renamed from: d */
    public final InetSocketAddress m19867d() {
        return this.f16862c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bve) {
            bve bveVar = (bve) obj;
            if (sq8.m48644c(bveVar.f16860a, this.f16860a) && sq8.m48644c(bveVar.f16861b, this.f16861b) && sq8.m48644c(bveVar.f16862c, this.f16862c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f16860a.hashCode()) * 31) + this.f16861b.hashCode()) * 31) + this.f16862c.hashCode();
    }

    public String toString() {
        String strM54347k;
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        String strM53877h = this.f16860a.m22357l().m53877h();
        InetAddress address = this.f16862c.getAddress();
        if (address == null || (hostAddress = address.getHostAddress()) == null) {
            strM54347k = null;
        } else {
            sq8.m48646e(hostAddress);
            strM54347k = wfj.m54347k(hostAddress);
        }
        if (f9g.m26305O(strM53877h, ':', false, 2, null)) {
            sb.append("[");
            sb.append(strM53877h);
            sb.append("]");
        } else {
            sb.append(strM53877h);
        }
        if (this.f16860a.m22357l().m53882n() != this.f16862c.getPort() || sq8.m48644c(strM53877h, strM54347k)) {
            sb.append(":");
            sb.append(this.f16860a.m22357l().m53882n());
        }
        if (!sq8.m48644c(strM53877h, strM54347k)) {
            if (sq8.m48644c(this.f16861b, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM54347k == null) {
                sb.append("<unresolved>");
            } else if (f9g.m26305O(strM54347k, ':', false, 2, null)) {
                sb.append("[");
                sb.append(strM54347k);
                sb.append("]");
            } else {
                sb.append(strM54347k);
            }
            sb.append(":");
            sb.append(this.f16862c.getPort());
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }
}
