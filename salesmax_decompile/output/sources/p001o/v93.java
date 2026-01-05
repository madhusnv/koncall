package p001o;

import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class v93 {

    /* renamed from: a */
    public static final ka9.C14756a f50028a = ka9.C14756a.m35230a("nm", NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON, "s", "hd", "d");

    /* renamed from: a */
    public static u93 m52467a(ka9 ka9Var, ama amaVar, int i) {
        boolean z = i == 3;
        boolean zMo22736k = false;
        String strMo22740t = null;
        tg0 tg0VarM33784b = null;
        kg0 kg0VarM51558i = null;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f50028a);
            if (iMo22724H == 0) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 1) {
                tg0VarM33784b = jg0.m33784b(ka9Var, amaVar);
            } else if (iMo22724H == 2) {
                kg0VarM51558i = ug0.m51558i(ka9Var, amaVar);
            } else if (iMo22724H == 3) {
                zMo22736k = ka9Var.mo22736k();
            } else if (iMo22724H != 4) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                z = ka9Var.mo22738r() == 3;
            }
        }
        return new u93(strMo22740t, tg0VarM33784b, kg0VarM51558i, z, zMo22736k);
    }
}
