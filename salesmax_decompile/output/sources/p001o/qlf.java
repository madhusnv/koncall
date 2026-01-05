package p001o;

import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import p001o.ka9;
import p001o.plf;

/* loaded from: classes3.dex */
public abstract class qlf {

    /* renamed from: a */
    public static final ka9.C14756a f42123a = ka9.C14756a.m35230a("s", "e", NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST, "nm", "m", "hd");

    /* renamed from: a */
    public static plf m45635a(ka9 ka9Var, ama amaVar) {
        String strMo22740t = null;
        plf.EnumC16137a enumC16137aForId = null;
        fg0 fg0VarM51555f = null;
        fg0 fg0VarM51555f2 = null;
        fg0 fg0VarM51555f3 = null;
        boolean zMo22736k = false;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f42123a);
            if (iMo22724H == 0) {
                fg0VarM51555f = ug0.m51555f(ka9Var, amaVar, false);
            } else if (iMo22724H == 1) {
                fg0VarM51555f2 = ug0.m51555f(ka9Var, amaVar, false);
            } else if (iMo22724H == 2) {
                fg0VarM51555f3 = ug0.m51555f(ka9Var, amaVar, false);
            } else if (iMo22724H == 3) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 4) {
                enumC16137aForId = plf.EnumC16137a.forId(ka9Var.mo22738r());
            } else if (iMo22724H != 5) {
                ka9Var.mo22726K();
            } else {
                zMo22736k = ka9Var.mo22736k();
            }
        }
        return new plf(strMo22740t, enumC16137aForId, fg0VarM51555f, fg0VarM51555f2, fg0VarM51555f3, zMo22736k);
    }
}
