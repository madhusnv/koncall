package p001o;

import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.ArrayList;
import java.util.Collections;
import p001o.ka9;
import p001o.nlf;

/* loaded from: classes3.dex */
public abstract class uu7 {

    /* renamed from: a */
    public static final ka9.C14756a f49499a = ka9.C14756a.m35230a("nm", "g", NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST, "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    public static final ka9.C14756a f49500b = ka9.C14756a.m35230a(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON, "k");

    /* renamed from: c */
    public static final ka9.C14756a f49501c = ka9.C14756a.m35230a(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, "v");

    /* renamed from: a */
    public static su7 m52030a(ka9 ka9Var, ama amaVar) {
        String str;
        gg0 gg0Var;
        ArrayList arrayList = new ArrayList();
        float fMo22737o = 0.0f;
        String strMo22740t = null;
        vu7 vu7Var = null;
        gg0 gg0VarM51556g = null;
        kg0 kg0VarM51558i = null;
        kg0 kg0VarM51558i2 = null;
        fg0 fg0VarM51554e = null;
        nlf.EnumC15608b enumC15608b = null;
        nlf.EnumC15609c enumC15609c = null;
        fg0 fg0Var = null;
        boolean zMo22736k = false;
        hg0 hg0Var = null;
        while (ka9Var.mo22735h()) {
            switch (ka9Var.mo22724H(f49499a)) {
                case 0:
                    strMo22740t = ka9Var.mo22740t();
                    continue;
                case 1:
                    str = strMo22740t;
                    ka9Var.mo22732d();
                    int iMo22738r = -1;
                    while (ka9Var.mo22735h()) {
                        int iMo22724H = ka9Var.mo22724H(f49500b);
                        if (iMo22724H != 0) {
                            gg0Var = gg0VarM51556g;
                            if (iMo22724H != 1) {
                                ka9Var.mo22725J();
                                ka9Var.mo22726K();
                            } else {
                                gg0VarM51556g = ug0.m51556g(ka9Var, amaVar, iMo22738r);
                            }
                        } else {
                            gg0Var = gg0VarM51556g;
                            iMo22738r = ka9Var.mo22738r();
                        }
                        gg0VarM51556g = gg0Var;
                    }
                    ka9Var.mo22734g();
                    break;
                case 2:
                    hg0Var = ug0.m51557h(ka9Var, amaVar);
                    continue;
                case 3:
                    str = strMo22740t;
                    vu7Var = ka9Var.mo22738r() == 1 ? vu7.LINEAR : vu7.RADIAL;
                    break;
                case 4:
                    kg0VarM51558i = ug0.m51558i(ka9Var, amaVar);
                    continue;
                case 5:
                    kg0VarM51558i2 = ug0.m51558i(ka9Var, amaVar);
                    continue;
                case 6:
                    fg0VarM51554e = ug0.m51554e(ka9Var, amaVar);
                    continue;
                case 7:
                    str = strMo22740t;
                    enumC15608b = nlf.EnumC15608b.values()[ka9Var.mo22738r() - 1];
                    break;
                case 8:
                    str = strMo22740t;
                    enumC15609c = nlf.EnumC15609c.values()[ka9Var.mo22738r() - 1];
                    break;
                case 9:
                    str = strMo22740t;
                    fMo22737o = (float) ka9Var.mo22737o();
                    break;
                case 10:
                    zMo22736k = ka9Var.mo22736k();
                    continue;
                case 11:
                    ka9Var.mo22731c();
                    while (ka9Var.mo22735h()) {
                        ka9Var.mo22732d();
                        String strMo22740t2 = null;
                        fg0 fg0VarM51554e2 = null;
                        while (ka9Var.mo22735h()) {
                            int iMo22724H2 = ka9Var.mo22724H(f49501c);
                            if (iMo22724H2 != 0) {
                                fg0 fg0Var2 = fg0Var;
                                if (iMo22724H2 != 1) {
                                    ka9Var.mo22725J();
                                    ka9Var.mo22726K();
                                } else {
                                    fg0VarM51554e2 = ug0.m51554e(ka9Var, amaVar);
                                }
                                fg0Var = fg0Var2;
                            } else {
                                strMo22740t2 = ka9Var.mo22740t();
                            }
                        }
                        fg0 fg0Var3 = fg0Var;
                        ka9Var.mo22734g();
                        if (strMo22740t2.equals(NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST)) {
                            fg0Var = fg0VarM51554e2;
                        } else {
                            if (strMo22740t2.equals("d") || strMo22740t2.equals("g")) {
                                amaVar.m17457u(true);
                                arrayList.add(fg0VarM51554e2);
                            }
                            fg0Var = fg0Var3;
                        }
                    }
                    fg0 fg0Var4 = fg0Var;
                    ka9Var.mo22733f();
                    if (arrayList.size() == 1) {
                        arrayList.add((fg0) arrayList.get(0));
                    }
                    fg0Var = fg0Var4;
                    continue;
                    break;
                default:
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                    continue;
            }
            strMo22740t = str;
        }
        String str2 = strMo22740t;
        if (hg0Var == null) {
            hg0Var = new hg0(Collections.singletonList(new sd9(100)));
        }
        return new su7(str2, vu7Var, gg0VarM51556g, hg0Var, kg0VarM51558i, kg0VarM51558i2, fg0VarM51554e, enumC15608b, enumC15609c, fMo22737o, arrayList, fg0Var, zMo22736k);
    }
}
