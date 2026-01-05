package p001o;

import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class ske {

    /* renamed from: a */
    public static final ka9.C14756a f45525a = ka9.C14756a.m35230a("nm", "c", NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST, "tr", "hd");

    /* renamed from: a */
    public static qke m48446a(ka9 ka9Var, ama amaVar) {
        String strMo22740t = null;
        fg0 fg0VarM51555f = null;
        fg0 fg0VarM51555f2 = null;
        rg0 rg0VarM48303g = null;
        boolean zMo22736k = false;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f45525a);
            if (iMo22724H == 0) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 1) {
                fg0VarM51555f = ug0.m51555f(ka9Var, amaVar, false);
            } else if (iMo22724H == 2) {
                fg0VarM51555f2 = ug0.m51555f(ka9Var, amaVar, false);
            } else if (iMo22724H == 3) {
                rg0VarM48303g = sg0.m48303g(ka9Var, amaVar);
            } else if (iMo22724H != 4) {
                ka9Var.mo22726K();
            } else {
                zMo22736k = ka9Var.mo22736k();
            }
        }
        return new qke(strMo22740t, fg0VarM51555f, fg0VarM51555f2, rg0VarM48303g, zMo22736k);
    }
}
