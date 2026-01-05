package p001o;

import android.graphics.PointF;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class sg0 {

    /* renamed from: a */
    public static final ka9.C14756a f45358a = ka9.C14756a.m35230a("a", NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON, "s", "rz", "r", NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST, "so", "eo", "sk", "sa");

    /* renamed from: b */
    public static final ka9.C14756a f45359b = ka9.C14756a.m35230a("k");

    /* renamed from: a */
    public static boolean m48297a(ig0 ig0Var) {
        return ig0Var == null || (ig0Var.mo24962c() && ((PointF) ((sd9) ig0Var.mo24961b().get(0)).f45243b).equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    public static boolean m48298b(tg0 tg0Var) {
        return tg0Var == null || (!(tg0Var instanceof ng0) && tg0Var.mo24962c() && ((PointF) ((sd9) tg0Var.mo24961b().get(0)).f45243b).equals(0.0f, 0.0f));
    }

    /* renamed from: c */
    public static boolean m48299c(fg0 fg0Var) {
        return fg0Var == null || (fg0Var.mo24962c() && ((Float) ((sd9) fg0Var.mo24961b().get(0)).f45243b).floatValue() == 0.0f);
    }

    /* renamed from: d */
    public static boolean m48300d(lg0 lg0Var) {
        return lg0Var == null || (lg0Var.mo24962c() && ((n4f) ((sd9) lg0Var.mo24961b().get(0)).f45243b).m40074a(1.0f, 1.0f));
    }

    /* renamed from: e */
    public static boolean m48301e(fg0 fg0Var) {
        return fg0Var == null || (fg0Var.mo24962c() && ((Float) ((sd9) fg0Var.mo24961b().get(0)).f45243b).floatValue() == 0.0f);
    }

    /* renamed from: f */
    public static boolean m48302f(fg0 fg0Var) {
        return fg0Var == null || (fg0Var.mo24962c() && ((Float) ((sd9) fg0Var.mo24961b().get(0)).f45243b).floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static rg0 m48303g(ka9 ka9Var, ama amaVar) {
        boolean z;
        boolean z2 = false;
        boolean z3 = ka9Var.mo22723C() == ka9.EnumC14757b.BEGIN_OBJECT;
        if (z3) {
            ka9Var.mo22732d();
        }
        fg0 fg0Var = null;
        ig0 ig0VarM33783a = null;
        tg0 tg0VarM33784b = null;
        lg0 lg0VarM51559j = null;
        fg0 fg0VarM51555f = null;
        fg0 fg0VarM51555f2 = null;
        hg0 hg0VarM51557h = null;
        fg0 fg0VarM51555f3 = null;
        fg0 fg0VarM51555f4 = null;
        while (ka9Var.mo22735h()) {
            switch (ka9Var.mo22724H(f45358a)) {
                case 0:
                    boolean z4 = z2;
                    ka9Var.mo22732d();
                    while (ka9Var.mo22735h()) {
                        if (ka9Var.mo22724H(f45359b) != 0) {
                            ka9Var.mo22725J();
                            ka9Var.mo22726K();
                        } else {
                            ig0VarM33783a = jg0.m33783a(ka9Var, amaVar);
                        }
                    }
                    ka9Var.mo22734g();
                    z2 = z4;
                    continue;
                case 1:
                    tg0VarM33784b = jg0.m33784b(ka9Var, amaVar);
                    continue;
                case 2:
                    lg0VarM51559j = ug0.m51559j(ka9Var, amaVar);
                    continue;
                case 3:
                    amaVar.m17437a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    hg0VarM51557h = ug0.m51557h(ka9Var, amaVar);
                    continue;
                case 6:
                    fg0VarM51555f3 = ug0.m51555f(ka9Var, amaVar, z2);
                    continue;
                case 7:
                    fg0VarM51555f4 = ug0.m51555f(ka9Var, amaVar, z2);
                    continue;
                case 8:
                    fg0VarM51555f = ug0.m51555f(ka9Var, amaVar, z2);
                    continue;
                case 9:
                    fg0VarM51555f2 = ug0.m51555f(ka9Var, amaVar, z2);
                    continue;
                default:
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                    continue;
            }
            fg0 fg0VarM51555f5 = ug0.m51555f(ka9Var, amaVar, z2);
            if (fg0VarM51555f5.mo24961b().isEmpty()) {
                fg0VarM51555f5.mo24961b().add(new sd9(amaVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(amaVar.m17442f())));
            } else {
                if (((sd9) fg0VarM51555f5.mo24961b().get(0)).f45243b == null) {
                    z = false;
                    fg0VarM51555f5.mo24961b().set(0, new sd9(amaVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(amaVar.m17442f())));
                }
                z2 = z;
                fg0Var = fg0VarM51555f5;
            }
            z = false;
            z2 = z;
            fg0Var = fg0VarM51555f5;
        }
        if (z3) {
            ka9Var.mo22734g();
        }
        ig0 ig0Var = m48297a(ig0VarM33783a) ? null : ig0VarM33783a;
        tg0 tg0Var = m48298b(tg0VarM33784b) ? null : tg0VarM33784b;
        fg0 fg0Var2 = m48299c(fg0Var) ? null : fg0Var;
        if (m48300d(lg0VarM51559j)) {
            lg0VarM51559j = null;
        }
        return new rg0(ig0Var, tg0Var, lg0VarM51559j, fg0Var2, hg0VarM51557h, fg0VarM51555f3, fg0VarM51555f4, m48302f(fg0VarM51555f) ? null : fg0VarM51555f, m48301e(fg0VarM51555f2) ? null : fg0VarM51555f2);
    }
}
