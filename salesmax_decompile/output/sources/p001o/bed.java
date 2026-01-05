package p001o;

import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import p001o.aed;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class bed {

    /* renamed from: a */
    public static final ka9.C14756a f16062a = ka9.C14756a.m35230a("nm", "sy", "pt", NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON, "r", "or", "os", "ir", "is", "hd");

    /* renamed from: a */
    public static aed m18803a(ka9 ka9Var, ama amaVar) {
        String strMo22740t = null;
        aed.EnumC12150a enumC12150aForValue = null;
        fg0 fg0VarM51555f = null;
        tg0 tg0VarM33784b = null;
        fg0 fg0VarM51555f2 = null;
        fg0 fg0VarM51554e = null;
        fg0 fg0VarM51554e2 = null;
        fg0 fg0VarM51555f3 = null;
        fg0 fg0VarM51555f4 = null;
        boolean zMo22736k = false;
        while (ka9Var.mo22735h()) {
            switch (ka9Var.mo22724H(f16062a)) {
                case 0:
                    strMo22740t = ka9Var.mo22740t();
                    break;
                case 1:
                    enumC12150aForValue = aed.EnumC12150a.forValue(ka9Var.mo22738r());
                    break;
                case 2:
                    fg0VarM51555f = ug0.m51555f(ka9Var, amaVar, false);
                    break;
                case 3:
                    tg0VarM33784b = jg0.m33784b(ka9Var, amaVar);
                    break;
                case 4:
                    fg0VarM51555f2 = ug0.m51555f(ka9Var, amaVar, false);
                    break;
                case 5:
                    fg0VarM51554e2 = ug0.m51554e(ka9Var, amaVar);
                    break;
                case 6:
                    fg0VarM51555f4 = ug0.m51555f(ka9Var, amaVar, false);
                    break;
                case 7:
                    fg0VarM51554e = ug0.m51554e(ka9Var, amaVar);
                    break;
                case 8:
                    fg0VarM51555f3 = ug0.m51555f(ka9Var, amaVar, false);
                    break;
                case 9:
                    zMo22736k = ka9Var.mo22736k();
                    break;
                default:
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                    break;
            }
        }
        return new aed(strMo22740t, enumC12150aForValue, fg0VarM51555f, tg0VarM33784b, fg0VarM51555f2, fg0VarM51554e, fg0VarM51554e2, fg0VarM51555f3, fg0VarM51555f4, zMo22736k);
    }
}
