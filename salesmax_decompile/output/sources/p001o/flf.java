package p001o;

import android.graphics.Path;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.Collections;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class flf {

    /* renamed from: a */
    public static final ka9.C14756a f23619a = ka9.C14756a.m35230a("nm", "c", NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST, "fillEnabled", "r", "hd");

    /* renamed from: a */
    public static elf m27029a(ka9 ka9Var, ama amaVar) {
        hg0 hg0Var = null;
        String strMo22740t = null;
        eg0 eg0VarM51552c = null;
        boolean zMo22736k = false;
        boolean zMo22736k2 = false;
        int iMo22738r = 1;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f23619a);
            if (iMo22724H == 0) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 1) {
                eg0VarM51552c = ug0.m51552c(ka9Var, amaVar);
            } else if (iMo22724H == 2) {
                hg0Var = ug0.m51557h(ka9Var, amaVar);
            } else if (iMo22724H == 3) {
                zMo22736k = ka9Var.mo22736k();
            } else if (iMo22724H == 4) {
                iMo22738r = ka9Var.mo22738r();
            } else if (iMo22724H != 5) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                zMo22736k2 = ka9Var.mo22736k();
            }
        }
        if (hg0Var == null) {
            hg0Var = new hg0(Collections.singletonList(new sd9(100)));
        }
        return new elf(strMo22740t, zMo22736k, iMo22738r == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, eg0VarM51552c, hg0Var, zMo22736k2);
    }
}
