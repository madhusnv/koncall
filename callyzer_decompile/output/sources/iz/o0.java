package iz;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4296b;
import nx.AbstractC5178p;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a */
    public final C3368a f17969a;

    /* renamed from: b */
    public final Proxy f17970b;

    /* renamed from: c */
    public final InetSocketAddress f17971c;

    public o0(C3368a address, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC4154l.m8923f(address, "address");
        AbstractC4154l.m8923f(socketAddress, "socketAddress");
        this.f17969a = address;
        this.f17970b = proxy;
        this.f17971c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return AbstractC4154l.m8918a(o0Var.f17969a, this.f17969a) && AbstractC4154l.m8918a(o0Var.f17970b, this.f17970b) && AbstractC4154l.m8918a(o0Var.f17971c, this.f17971c);
    }

    public final int hashCode() {
        return this.f17971c.hashCode() + ((this.f17970b.hashCode() + ((this.f17969a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        C3368a c3368a = this.f17969a;
        C3391x c3391x = c3368a.f17780h;
        C3391x c3391x2 = c3368a.f17780h;
        String str = c3391x.f17994d;
        InetSocketAddress inetSocketAddress = this.f17971c;
        InetAddress address = inetSocketAddress.getAddress();
        String strM8996b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC4296b.m8996b(hostAddress);
        if (AbstractC5178p.m10117y(str, ':')) {
            a1.m14318A(sb2, "[", str, "]");
        } else {
            sb2.append(str);
        }
        if (c3391x2.f17995e != inetSocketAddress.getPort() || str.equals(strM8996b)) {
            sb2.append(":");
            sb2.append(c3391x2.f17995e);
        }
        if (!str.equals(strM8996b)) {
            if (this.f17970b.equals(Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strM8996b == null) {
                sb2.append("<unresolved>");
            } else if (AbstractC5178p.m10117y(strM8996b, ':')) {
                a1.m14318A(sb2, "[", strM8996b, "]");
            } else {
                sb2.append(strM8996b);
            }
            sb2.append(":");
            sb2.append(inetSocketAddress.getPort());
        }
        return sb2.toString();
    }
}
