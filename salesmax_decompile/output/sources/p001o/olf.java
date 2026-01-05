package p001o;

import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.ArrayList;
import java.util.Collections;
import p001o.ka9;
import p001o.nlf;

/* loaded from: classes3.dex */
public abstract class olf {

    /* renamed from: a */
    public static final ka9.C14756a f38552a = ka9.C14756a.m35230a("nm", "c", "w", NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST, "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    public static final ka9.C14756a f38553b = ka9.C14756a.m35230a(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, "v");

    /* renamed from: a */
    public static nlf m42395a(ka9 ka9Var, ama amaVar) {
        fg0 fg0VarM51554e;
        ArrayList arrayList = new ArrayList();
        float fMo22737o = 0.0f;
        boolean zMo22736k = false;
        String strMo22740t = null;
        fg0 fg0Var = null;
        eg0 eg0VarM51552c = null;
        fg0 fg0VarM51554e2 = null;
        nlf.EnumC15608b enumC15608b = null;
        nlf.EnumC15609c enumC15609c = null;
        hg0 hg0Var = null;
        while (ka9Var.mo22735h()) {
            switch (ka9Var.mo22724H(f38552a)) {
                case 0:
                    strMo22740t = ka9Var.mo22740t();
                    break;
                case 1:
                    eg0VarM51552c = ug0.m51552c(ka9Var, amaVar);
                    break;
                case 2:
                    fg0VarM51554e2 = ug0.m51554e(ka9Var, amaVar);
                    break;
                case 3:
                    hg0Var = ug0.m51557h(ka9Var, amaVar);
                    break;
                case 4:
                    enumC15608b = nlf.EnumC15608b.values()[ka9Var.mo22738r() - 1];
                    break;
                case 5:
                    enumC15609c = nlf.EnumC15609c.values()[ka9Var.mo22738r() - 1];
                    break;
                case 6:
                    fMo22737o = (float) ka9Var.mo22737o();
                    break;
                case 7:
                    zMo22736k = ka9Var.mo22736k();
                    break;
                case 8:
                    ka9Var.mo22731c();
                    while (ka9Var.mo22735h()) {
                        ka9Var.mo22732d();
                        String strMo22740t2 = null;
                        fg0VarM51554e = null;
                        while (ka9Var.mo22735h()) {
                            int iMo22724H = ka9Var.mo22724H(f38553b);
                            if (iMo22724H == 0) {
                                strMo22740t2 = ka9Var.mo22740t();
                            } else if (iMo22724H != 1) {
                                ka9Var.mo22725J();
                                ka9Var.mo22726K();
                            } else {
                                fg0VarM51554e = ug0.m51554e(ka9Var, amaVar);
                            }
                        }
                        ka9Var.mo22734g();
                        strMo22740t2.hashCode();
                        switch (strMo22740t2) {
                            case "d":
                            case "g":
                                amaVar.m17457u(true);
                                arrayList.add(fg0VarM51554e);
                                break;
                            case "o":
                                fg0Var = fg0VarM51554e;
                                break;
                        }
                    }
                    ka9Var.mo22733f();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((fg0) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    ka9Var.mo22726K();
                    break;
            }
        }
        if (hg0Var == null) {
            hg0Var = new hg0(Collections.singletonList(new sd9(100)));
        }
        return new nlf(strMo22740t, fg0Var, arrayList, eg0VarM51552c, hg0Var, fg0VarM51554e2, enumC15608b, enumC15609c, fMo22737o, zMo22736k);
    }
}
