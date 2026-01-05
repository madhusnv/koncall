package p001o;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class na2 {
    /* renamed from: a */
    public static String m40263a(z92 z92Var, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) z92Var.m58952c("0").m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) z92Var.m58952c("1").m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    /* renamed from: b */
    public static List m40264b(p42 p42Var, oa2 oa2Var) throws li8 {
        String strM40263a;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(p42Var.mo42954c().m58953d());
            if (oa2Var == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return arrayList;
            }
            try {
                strM40263a = m40263a(p42Var.mo42954c(), oa2Var.m41865d(), listAsList);
            } catch (IllegalStateException unused) {
                strM40263a = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : listAsList) {
                if (!str.equals(strM40263a)) {
                    arrayList2.add(p42Var.m42957f(str));
                }
            }
            Iterator it2 = oa2Var.m41863b(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((u92) ((t92) it2.next())).mo38380b());
            }
            return arrayList;
        } catch (h72 e) {
            throw new li8(wa2.m54130a(e));
        } catch (va2 e2) {
            throw new li8(e2);
        }
    }
}
