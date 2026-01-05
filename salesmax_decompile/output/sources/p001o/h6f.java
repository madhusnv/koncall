package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class h6f {

    /* renamed from: o.h6f$a */
    public static class C13865a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C13866b c13866b, C13866b c13866b2) {
            return Double.compare(c13866b2.f26257b, c13866b.f26257b);
        }
    }

    /* renamed from: o.h6f$b */
    public static class C13866b {

        /* renamed from: a */
        public final jx7 f26256a;

        /* renamed from: b */
        public final double f26257b;

        public C13866b(jx7 jx7Var, double d) {
            this.f26256a = jx7Var;
            this.f26257b = d;
        }
    }

    /* renamed from: a */
    public static List m29841a(Map map) {
        return m29842b(map, 4, -12417548, true);
    }

    /* renamed from: b */
    public static List m29842b(Map map, int i, int i2, boolean z) {
        boolean z2;
        ArrayList<jx7> arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (Map.Entry entry : map.entrySet()) {
            jx7 jx7VarM34652b = jx7.m34652b(((Integer) entry.getKey()).intValue());
            arrayList.add(jx7VarM34652b);
            int iFloor = (int) Math.floor(jx7VarM34652b.m34654d());
            int iIntValue = ((Integer) entry.getValue()).intValue();
            iArr[iFloor] = iArr[iFloor] + iIntValue;
            d += iIntValue;
        }
        double[] dArr = new double[360];
        for (int i3 = 0; i3 < 360; i3++) {
            double d2 = iArr[i3] / d;
            for (int i4 = i3 - 14; i4 < i3 + 16; i4++) {
                int iM41319g = nza.m41319g(i4);
                dArr[iM41319g] = dArr[iM41319g] + d2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (jx7 jx7Var : arrayList) {
            double d3 = dArr[nza.m41319g((int) Math.round(jx7Var.m34654d()))];
            if (!z || (jx7Var.m34653c() >= 5.0d && d3 > 0.01d)) {
                arrayList2.add(new C13866b(jx7Var, (d3 * 100.0d * 0.7d) + ((jx7Var.m34653c() - 48.0d) * (jx7Var.m34653c() < 48.0d ? 0.1d : 0.3d))));
            }
        }
        Collections.sort(arrayList2, new C13865a());
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 90; i5 >= 15; i5--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                jx7 jx7Var2 = ((C13866b) it.next()).f26256a;
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (nza.m41315c(jx7Var2.m34654d(), ((jx7) it2.next()).m34654d()) < i5) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    arrayList3.add(jx7Var2);
                }
                if (arrayList3.size() >= i) {
                    break;
                }
            }
            if (arrayList3.size() >= i) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i2));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((jx7) it3.next()).m34657g()));
        }
        return arrayList4;
    }
}
