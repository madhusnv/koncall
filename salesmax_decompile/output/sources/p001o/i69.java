package p001o;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;

/* loaded from: classes6.dex */
public final class i69 implements t01 {

    /* renamed from: d */
    public final ov5 f28158d;

    /* renamed from: o.i69$a */
    public /* synthetic */ class C14200a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28159a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f28159a = iArr;
        }
    }

    public i69(ov5 ov5Var) {
        sq8.m48649h(ov5Var, "defaultDns");
        this.f28158d = ov5Var;
    }

    @Override // p001o.t01
    /* renamed from: a */
    public ule mo31614a(bve bveVar, zqe zqeVar) {
        Proxy proxyM19865b;
        ov5 ov5VarM22348c;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        d60 d60VarM19864a;
        sq8.m48649h(zqeVar, "response");
        List<bg2> listM59738g = zqeVar.m59738g();
        ule uleVarM59732Q = zqeVar.m59732Q();
        w48 w48VarM51741l = uleVarM59732Q.m51741l();
        boolean z = zqeVar.m59739h() == 407;
        if (bveVar == null || (proxyM19865b = bveVar.m19865b()) == null) {
            proxyM19865b = Proxy.NO_PROXY;
        }
        for (bg2 bg2Var : listM59738g) {
            if (e9g.m24606x("Basic", bg2Var.m18845d(), true)) {
                if (bveVar == null || (d60VarM19864a = bveVar.m19864a()) == null || (ov5VarM22348c = d60VarM19864a.m22348c()) == null) {
                    ov5VarM22348c = this.f28158d;
                }
                if (z) {
                    SocketAddress socketAddressAddress = proxyM19865b.address();
                    sq8.m48647f(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    sq8.m48646e(proxyM19865b);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m31615b(proxyM19865b, w48VarM51741l, ov5VarM22348c), inetSocketAddress.getPort(), w48VarM51741l.m53886r(), bg2Var.m18844c(), bg2Var.m18845d(), w48VarM51741l.m53888t(), Authenticator.RequestorType.PROXY);
                } else {
                    String strM53877h = w48VarM51741l.m53877h();
                    sq8.m48646e(proxyM19865b);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM53877h, m31615b(proxyM19865b, w48VarM51741l, ov5VarM22348c), w48VarM51741l.m53882n(), w48VarM51741l.m53886r(), bg2Var.m18844c(), bg2Var.m18845d(), w48VarM51741l.m53888t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    sq8.m48648g(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    sq8.m48648g(password, "getPassword(...)");
                    return uleVarM59732Q.m51738i().m51757n(str, jc4.m33496a(userName, new String(password), bg2Var.m18843b())).m51746b();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final InetAddress m31615b(Proxy proxy, w48 w48Var, ov5 ov5Var) {
        Proxy.Type type2 = proxy.type();
        if ((type2 == null ? -1 : C14200a.f28159a[type2.ordinal()]) == 1) {
            return (InetAddress) kh3.f0(ov5Var.lookup(w48Var.m53877h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        sq8.m48647f(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        sq8.m48648g(address, "getAddress(...)");
        return address;
    }

    public /* synthetic */ i69(ov5 ov5Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? ov5.f38963b : ov5Var);
    }
}
