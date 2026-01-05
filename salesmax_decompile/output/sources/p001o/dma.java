package p001o;

import android.graphics.Rect;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001o.gh9;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class dma {

    /* renamed from: a */
    public static final ka9.C14756a f20237a = ka9.C14756a.m35230a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    public static ka9.C14756a f20238b = ka9.C14756a.m35230a(OutcomeConstants.OUTCOME_ID, "layers", "w", "h", NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON, "u");

    /* renamed from: c */
    public static final ka9.C14756a f20239c = ka9.C14756a.m35230a("list");

    /* renamed from: d */
    public static final ka9.C14756a f20240d = ka9.C14756a.m35230a("cm", "tm", "dr");

    /* renamed from: a */
    public static ama m23549a(ka9 ka9Var) {
        HashMap map;
        ArrayList arrayList;
        ka9 ka9Var2 = ka9Var;
        float fM31025e = hri.m31025e();
        rla rlaVar = new rla();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        d0g d0gVar = new d0g();
        ama amaVar = new ama();
        ka9Var.mo22732d();
        float fMo22737o = 0.0f;
        float fMo22737o2 = 0.0f;
        float fMo22737o3 = 0.0f;
        int iMo22738r = 0;
        int iMo22738r2 = 0;
        while (ka9Var.mo22735h()) {
            switch (ka9Var2.mo22724H(f20237a)) {
                case 0:
                    iMo22738r = ka9Var.mo22738r();
                    break;
                case 1:
                    iMo22738r2 = ka9Var.mo22738r();
                    break;
                case 2:
                    fMo22737o = (float) ka9Var.mo22737o();
                    break;
                case 3:
                    map = map4;
                    arrayList = arrayList3;
                    fMo22737o2 = ((float) ka9Var.mo22737o()) - 0.01f;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    map = map4;
                    arrayList = arrayList3;
                    fMo22737o3 = (float) ka9Var.mo22737o();
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 5:
                    String[] strArrSplit = ka9Var.mo22740t().split("\\.");
                    if (!hri.m31030j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        amaVar.m17437a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    m23553e(ka9Var2, amaVar, arrayList2, rlaVar);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    m23550b(ka9Var2, amaVar, map2, map3);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    m23552d(ka9Var2, map4);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    m23551c(ka9Var2, amaVar, d0gVar);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    m23554f(ka9Var2, amaVar, arrayList3);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                default:
                    map = map4;
                    arrayList = arrayList3;
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
            }
            ka9Var2 = ka9Var;
        }
        amaVar.m17455s(new Rect(0, 0, (int) (iMo22738r * fM31025e), (int) (iMo22738r2 * fM31025e)), fMo22737o, fMo22737o2, fMo22737o3, arrayList2, rlaVar, map2, map3, d0gVar, map4, arrayList3);
        return amaVar;
    }

    /* renamed from: b */
    public static void m23550b(ka9 ka9Var, ama amaVar, Map map, Map map2) {
        ka9Var.mo22731c();
        while (ka9Var.mo22735h()) {
            ArrayList arrayList = new ArrayList();
            rla rlaVar = new rla();
            ka9Var.mo22732d();
            int iMo22738r = 0;
            int iMo22738r2 = 0;
            String strMo22740t = null;
            String strMo22740t2 = null;
            String strMo22740t3 = null;
            while (ka9Var.mo22735h()) {
                int iMo22724H = ka9Var.mo22724H(f20238b);
                if (iMo22724H == 0) {
                    strMo22740t = ka9Var.mo22740t();
                } else if (iMo22724H == 1) {
                    ka9Var.mo22731c();
                    while (ka9Var.mo22735h()) {
                        gh9 gh9VarM32140a = ih9.m32140a(ka9Var, amaVar);
                        rlaVar.m46936i(gh9VarM32140a.m28678d(), gh9VarM32140a);
                        arrayList.add(gh9VarM32140a);
                    }
                    ka9Var.mo22733f();
                } else if (iMo22724H == 2) {
                    iMo22738r = ka9Var.mo22738r();
                } else if (iMo22724H == 3) {
                    iMo22738r2 = ka9Var.mo22738r();
                } else if (iMo22724H == 4) {
                    strMo22740t2 = ka9Var.mo22740t();
                } else if (iMo22724H != 5) {
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                } else {
                    strMo22740t3 = ka9Var.mo22740t();
                }
            }
            ka9Var.mo22734g();
            if (strMo22740t2 != null) {
                hma hmaVar = new hma(iMo22738r, iMo22738r2, strMo22740t, strMo22740t2, strMo22740t3);
                map2.put(hmaVar.m30811d(), hmaVar);
            } else {
                map.put(strMo22740t, arrayList);
            }
        }
        ka9Var.mo22733f();
    }

    /* renamed from: c */
    public static void m23551c(ka9 ka9Var, ama amaVar, d0g d0gVar) {
        ka9Var.mo22731c();
        while (ka9Var.mo22735h()) {
            jb7 jb7VarM35347a = kb7.m35347a(ka9Var, amaVar);
            d0gVar.m22190l(jb7VarM35347a.hashCode(), jb7VarM35347a);
        }
        ka9Var.mo22733f();
    }

    /* renamed from: d */
    public static void m23552d(ka9 ka9Var, Map map) {
        ka9Var.mo22732d();
        while (ka9Var.mo22735h()) {
            if (ka9Var.mo22724H(f20239c) != 0) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                ka9Var.mo22731c();
                while (ka9Var.mo22735h()) {
                    gb7 gb7VarM46483a = rb7.m46483a(ka9Var);
                    map.put(gb7VarM46483a.m28307b(), gb7VarM46483a);
                }
                ka9Var.mo22733f();
            }
        }
        ka9Var.mo22734g();
    }

    /* renamed from: e */
    public static void m23553e(ka9 ka9Var, ama amaVar, List list, rla rlaVar) {
        ka9Var.mo22731c();
        int i = 0;
        while (ka9Var.mo22735h()) {
            gh9 gh9VarM32140a = ih9.m32140a(ka9Var, amaVar);
            if (gh9VarM32140a.m28680f() == gh9.EnumC13715a.IMAGE) {
                i++;
            }
            list.add(gh9VarM32140a);
            rlaVar.m46936i(gh9VarM32140a.m28678d(), gh9VarM32140a);
            if (i > 4) {
                rja.m46866c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        ka9Var.mo22733f();
    }

    /* renamed from: f */
    public static void m23554f(ka9 ka9Var, ama amaVar, List list) {
        ka9Var.mo22731c();
        while (ka9Var.mo22735h()) {
            ka9Var.mo22732d();
            float fMo22737o = 0.0f;
            String strMo22740t = null;
            float fMo22737o2 = 0.0f;
            while (ka9Var.mo22735h()) {
                int iMo22724H = ka9Var.mo22724H(f20240d);
                if (iMo22724H == 0) {
                    strMo22740t = ka9Var.mo22740t();
                } else if (iMo22724H == 1) {
                    fMo22737o = (float) ka9Var.mo22737o();
                } else if (iMo22724H != 2) {
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                } else {
                    fMo22737o2 = (float) ka9Var.mo22737o();
                }
            }
            ka9Var.mo22734g();
            list.add(new psa(strMo22740t, fMo22737o, fMo22737o2));
        }
        ka9Var.mo22733f();
    }
}
