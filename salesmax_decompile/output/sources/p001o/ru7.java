package p001o;

import android.graphics.Path;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.Collections;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class ru7 {

    /* renamed from: a */
    public static final ka9.C14756a f44077a = ka9.C14756a.m35230a("nm", "g", NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST, "t", "s", "e", "r", "hd");

    /* renamed from: b */
    public static final ka9.C14756a f44078b = ka9.C14756a.m35230a(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON, "k");

    /* renamed from: a */
    public static pu7 m47166a(ka9 ka9Var, ama amaVar) {
        hg0 hg0VarM51557h = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strMo22740t = null;
        vu7 vu7Var = null;
        gg0 gg0VarM51556g = null;
        kg0 kg0VarM51558i = null;
        kg0 kg0VarM51558i2 = null;
        boolean zMo22736k = false;
        while (ka9Var.mo22735h()) {
            switch (ka9Var.mo22724H(f44077a)) {
                case 0:
                    strMo22740t = ka9Var.mo22740t();
                    break;
                case 1:
                    ka9Var.mo22732d();
                    int iMo22738r = -1;
                    while (ka9Var.mo22735h()) {
                        int iMo22724H = ka9Var.mo22724H(f44078b);
                        if (iMo22724H == 0) {
                            iMo22738r = ka9Var.mo22738r();
                        } else if (iMo22724H != 1) {
                            ka9Var.mo22725J();
                            ka9Var.mo22726K();
                        } else {
                            gg0VarM51556g = ug0.m51556g(ka9Var, amaVar, iMo22738r);
                        }
                    }
                    ka9Var.mo22734g();
                    break;
                case 2:
                    hg0VarM51557h = ug0.m51557h(ka9Var, amaVar);
                    break;
                case 3:
                    vu7Var = ka9Var.mo22738r() == 1 ? vu7.LINEAR : vu7.RADIAL;
                    break;
                case 4:
                    kg0VarM51558i = ug0.m51558i(ka9Var, amaVar);
                    break;
                case 5:
                    kg0VarM51558i2 = ug0.m51558i(ka9Var, amaVar);
                    break;
                case 6:
                    fillType = ka9Var.mo22738r() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zMo22736k = ka9Var.mo22736k();
                    break;
                default:
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                    break;
            }
        }
        return new pu7(strMo22740t, vu7Var, fillType, gg0VarM51556g, hg0VarM51557h == null ? new hg0(Collections.singletonList(new sd9(100))) : hg0VarM51557h, kg0VarM51558i, kg0VarM51558i2, null, null, zMo22736k);
    }
}
