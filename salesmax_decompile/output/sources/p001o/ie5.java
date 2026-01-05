package p001o;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public abstract class ie5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final z08 m31991a(InetAddress inetAddress) {
        vv8 aw8Var;
        sq8.m48649h(inetAddress, "<this>");
        if (inetAddress instanceof Inet4Address) {
            byte[] address = ((Inet4Address) inetAddress).getAddress();
            sq8.m48648g(address, "getAddress(...)");
            aw8Var = new xv8(address);
        } else {
            if (!(inetAddress instanceof Inet6Address)) {
                throw new IllegalStateException(("unrecognized InetAddress " + inetAddress).toString());
            }
            byte[] address2 = ((Inet6Address) inetAddress).getAddress();
            sq8.m48648g(address2, "getAddress(...)");
            aw8Var = new aw8(address2, null, 2, 0 == true ? 1 : 0);
        }
        String hostName = inetAddress.getHostName();
        sq8.m48648g(hostName, "getHostName(...)");
        return new z08(hostName, aw8Var);
    }

    /* renamed from: b */
    public static final InetAddress m31992b(z08 z08Var) throws UnknownHostException {
        sq8.m48649h(z08Var, "<this>");
        InetAddress byAddress = InetAddress.getByAddress(z08Var.m58589b(), z08Var.m58588a().mo17900a());
        sq8.m48648g(byAddress, "getByAddress(...)");
        return byAddress;
    }
}
