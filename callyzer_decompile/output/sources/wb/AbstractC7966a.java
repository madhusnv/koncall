package wb;

import com.amplifyframework.core.model.ModelIdentifier;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2264b;
import fd.InterfaceC2265c;
import hd.C2891c;
import hd.C2896h;
import jc.InterfaceC3738n;
import nx.AbstractC5178p;
import rw.AbstractC6662l;
import vb.C7697d;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wb.a */
/* loaded from: classes.dex */
public abstract class AbstractC7966a {

    /* renamed from: a */
    public static final C2271i f38328a;

    /* renamed from: b */
    public static final C2271i f38329b;

    /* renamed from: c */
    public static final C2271i f38330c;

    /* renamed from: d */
    public static final C2271i f38331d;

    /* renamed from: e */
    public static final C2271i f38332e;

    /* renamed from: f */
    public static final C2272j f38333f;

    static {
        C2274l c2274l = C2274l.f10287e;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("code")}), 0);
        f38328a = c2271i;
        C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("__type")}), 0);
        f38329b = c2271i2;
        C2274l c2274l2 = C2274l.f10291i;
        C2271i c2271i3 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("message")}), 0);
        f38330c = c2271i3;
        C2271i c2271i4 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Message")}), 0);
        f38331d = c2271i4;
        C2271i c2271i5 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("errorMessage")}), 0);
        f38332e = c2271i5;
        C8849i c8849i = new C8849i(4);
        c8849i.m16319q(c2271i);
        c8849i.m16319q(c2271i2);
        c8849i.m16319q(c2271i3);
        c8849i.m16319q(c2271i4);
        c8849i.m16319q(c2271i5);
        f38333f = new C2272j(c8849i);
    }

    /* renamed from: a */
    public static C7697d m15142a(InterfaceC3738n interfaceC3738n, byte[] bArr) {
        String strMo62d;
        String strMo62d2;
        String strC0;
        String strMo62d3 = (String) interfaceC3738n.get("x-amzn-error-message");
        if (strMo62d3 == null) {
            strMo62d3 = (String) interfaceC3738n.get(":error-message");
        }
        String str = (String) interfaceC3738n.get("X-Amzn-Errortype");
        if (bArr != null) {
            InterfaceC2264b interfaceC2264bM7001h = new C2891c(bArr).m7001h(f38333f);
            strMo62d = null;
            strMo62d2 = null;
            while (true) {
                Integer numMo71n = interfaceC2264bM7001h.mo71n();
                int i10 = f38328a.f10279b;
                if (numMo71n != null && numMo71n.intValue() == i10) {
                    strMo62d = interfaceC2264bM7001h.mo62d();
                } else {
                    int i11 = f38329b.f10279b;
                    if (numMo71n != null && numMo71n.intValue() == i11) {
                        strMo62d2 = interfaceC2264bM7001h.mo62d();
                    } else {
                        int i12 = f38330c.f10279b;
                        if (numMo71n == null || numMo71n.intValue() != i12) {
                            int i13 = f38331d.f10279b;
                            if (numMo71n == null || numMo71n.intValue() != i13) {
                                int i14 = f38332e.f10279b;
                                if (numMo71n == null || numMo71n.intValue() != i14) {
                                    if (numMo71n == null) {
                                        break;
                                    }
                                    interfaceC2264bM7001h.mo63e();
                                }
                            }
                        }
                        strMo62d3 = interfaceC2264bM7001h.mo62d();
                    }
                }
            }
        } else {
            strMo62d = null;
            strMo62d2 = null;
        }
        if (str == null) {
            str = strMo62d == null ? strMo62d2 : strMo62d;
        }
        if (str != null) {
            String strA0 = AbstractC5178p.a0(str, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
            strC0 = AbstractC5178p.c0(strA0, ":", strA0);
        } else {
            strC0 = null;
        }
        return new C7697d(strC0, strMo62d3, null);
    }
}
