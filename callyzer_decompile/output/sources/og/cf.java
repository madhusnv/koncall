package og;

import a1.C0005d;
import fd.C2271i;
import fd.C2274l;
import fd.InterfaceC2264b;
import fd.InterfaceC2265c;
import hd.C2891c;
import hd.C2896h;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6662l;
import s6.C6765d;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class cf {
    /* renamed from: a */
    public static final C6765d m10580a(String name) {
        AbstractC4154l.m8923f(name, "name");
        return new C6765d(name);
    }

    /* renamed from: b */
    public static final eb.l0 m10581b(C2891c c2891c) {
        C0005d c0005d = new C0005d(10, false);
        C2274l c2274l = C2274l.f10291i;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AttributeName")}), 0);
        C2271i c2271i2 = new C2271i(C2274l.f10286d, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("DeliveryMedium")}), 0);
        C2271i c2271i3 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Destination")}), 0);
        C8849i c8849i = new C8849i(4);
        c8849i.m16319q(c2271i);
        c8849i.m16319q(c2271i2);
        c8849i.m16319q(c2271i3);
        InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(c8849i, c2891c);
        while (true) {
            Integer numMo71n = interfaceC2264bM11231b.mo71n();
            int i10 = c2271i.f10279b;
            if (numMo71n != null && numMo71n.intValue() == i10) {
                c0005d.f24b = interfaceC2264bM11231b.mo62d();
            } else {
                int i11 = c2271i2.f10279b;
                if (numMo71n != null && numMo71n.intValue() == i11) {
                    String strMo62d = interfaceC2264bM11231b.mo62d();
                    int i12 = eb.g1.f9319a;
                    c0005d.f25c = td.m10933a(strMo62d);
                } else {
                    int i13 = c2271i3.f10279b;
                    if (numMo71n != null && numMo71n.intValue() == i13) {
                        c0005d.f26d = interfaceC2264bM11231b.mo62d();
                    } else {
                        if (numMo71n == null) {
                            return new eb.l0(c0005d);
                        }
                        interfaceC2264bM11231b.mo63e();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static final C6765d m10582c(String name) {
        AbstractC4154l.m8923f(name, "name");
        return new C6765d(name);
    }

    /* renamed from: d */
    public static final C6765d m10583d(String name) {
        AbstractC4154l.m8923f(name, "name");
        return new C6765d(name);
    }

    /* renamed from: e */
    public static final C6765d m10584e(String name) {
        AbstractC4154l.m8923f(name, "name");
        return new C6765d(name);
    }

    /* renamed from: f */
    public static final C6765d m10585f(String name) {
        AbstractC4154l.m8923f(name, "name");
        return new C6765d(name);
    }
}
