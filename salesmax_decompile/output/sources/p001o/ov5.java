package p001o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes6.dex */
public interface ov5 {

    /* renamed from: a */
    public static final C15899a f38962a = C15899a.f38964a;

    /* renamed from: b */
    public static final ov5 f38963b = new C15899a.a();

    /* renamed from: o.ov5$a */
    public static final class C15899a {

        /* renamed from: a */
        public static final /* synthetic */ C15899a f38964a = new C15899a();

        /* renamed from: o.ov5$a$a */
        public static final class a implements ov5 {
            @Override // p001o.ov5
            public List lookup(String str) throws UnknownHostException {
                sq8.m48649h(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    sq8.m48648g(allByName, "getAllByName(...)");
                    return gp0.D0(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }
    }

    List lookup(String str);
}
