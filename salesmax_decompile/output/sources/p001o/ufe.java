package p001o;

import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class ufe {

    /* renamed from: a */
    public static final ka9.C14756a f48889a = ka9.C14756a.m35230a("nm", NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON, "s", "r", "hd");

    /* renamed from: a */
    public static sfe m51544a(ka9 ka9Var, ama amaVar) {
        String strMo22740t = null;
        tg0 tg0VarM33784b = null;
        kg0 kg0VarM51558i = null;
        fg0 fg0VarM51554e = null;
        boolean zMo22736k = false;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f48889a);
            if (iMo22724H == 0) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 1) {
                tg0VarM33784b = jg0.m33784b(ka9Var, amaVar);
            } else if (iMo22724H == 2) {
                kg0VarM51558i = ug0.m51558i(ka9Var, amaVar);
            } else if (iMo22724H == 3) {
                fg0VarM51554e = ug0.m51554e(ka9Var, amaVar);
            } else if (iMo22724H != 4) {
                ka9Var.mo22726K();
            } else {
                zMo22736k = ka9Var.mo22736k();
            }
        }
        return new sfe(strMo22740t, tg0VarM33784b, kg0VarM51558i, fg0VarM51554e, zMo22736k);
    }
}
