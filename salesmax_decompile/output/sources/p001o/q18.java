package p001o;

import p001o.q74;
import p001o.qja;

/* loaded from: classes3.dex */
public abstract class q18 {
    /* renamed from: b */
    public static final Object m44672b(o18 o18Var, n64 n64Var) {
        q74.InterfaceC16311b interfaceC16311b = o18Var.mo6529D().get(p69.f39399t);
        kl3 kl3Var = interfaceC16311b instanceof kl3 ? (kl3) interfaceC16311b : null;
        if (kl3Var == null) {
            return y3i.f54824a;
        }
        kl3Var.mo35824c();
        if (!kl3Var.mo22414J()) {
            q74 q74VarMo6529D = o18Var.mo6529D();
            String strMo26336c = kge.m35689b(o18.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            qja.C16414b.m45550c(v74.m52400e(q74VarMo6529D, strMo26336c), null, new uk7() { // from class: o.p18
                @Override // p001o.uk7
                public final Object invoke() {
                    return q18.m44673c();
                }
            }, 1, null);
            o18Var.mo28289a();
        }
        Object objD0 = kl3Var.d0(n64Var);
        return objD0 == uq8.m51918f() ? objD0 : y3i.f54824a;
    }

    /* renamed from: c */
    public static final String m44673c() {
        return "cancelling in-flight call";
    }
}
