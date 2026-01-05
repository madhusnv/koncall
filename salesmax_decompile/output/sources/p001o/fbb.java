package p001o;

import p001o.dbb;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class fbb {

    /* renamed from: a */
    public static final ka9.C14756a f23096a = ka9.C14756a.m35230a("nm", "mm", "hd");

    /* renamed from: a */
    public static dbb m26388a(ka9 ka9Var) {
        String strMo22740t = null;
        boolean zMo22736k = false;
        dbb.EnumC12858a enumC12858aForId = null;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f23096a);
            if (iMo22724H == 0) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 1) {
                enumC12858aForId = dbb.EnumC12858a.forId(ka9Var.mo22738r());
            } else if (iMo22724H != 2) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                zMo22736k = ka9Var.mo22736k();
            }
        }
        return new dbb(strMo22740t, enumC12858aForId, zMo22736k);
    }
}
