package p001o;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class b4e {
    /* renamed from: a */
    public static Map m18147a(int[] iArr, int i) {
        Set setKeySet = new f4e().m26066i(iArr, i).f19090a.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator it = setKeySet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr2[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        return e4e.m24298a(iArr, iArr2, i);
    }
}
