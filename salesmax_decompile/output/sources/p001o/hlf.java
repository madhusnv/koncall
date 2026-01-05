package p001o;

import java.util.ArrayList;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class hlf {

    /* renamed from: a */
    public static final ka9.C14756a f27113a = ka9.C14756a.m35230a("nm", "hd", "it");

    /* renamed from: a */
    public static glf m30760a(ka9 ka9Var, ama amaVar) {
        ArrayList arrayList = new ArrayList();
        String strMo22740t = null;
        boolean zMo22736k = false;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f27113a);
            if (iMo22724H == 0) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 1) {
                zMo22736k = ka9Var.mo22736k();
            } else if (iMo22724H != 2) {
                ka9Var.mo22726K();
            } else {
                ka9Var.mo22731c();
                while (ka9Var.mo22735h()) {
                    z24 z24VarM16370a = a34.m16370a(ka9Var, amaVar);
                    if (z24VarM16370a != null) {
                        arrayList.add(z24VarM16370a);
                    }
                }
                ka9Var.mo22733f();
            }
        }
        return new glf(strMo22740t, arrayList, zMo22736k);
    }
}
