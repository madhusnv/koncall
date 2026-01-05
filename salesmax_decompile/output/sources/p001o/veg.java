package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class veg {

    /* renamed from: a */
    public final List f50248a = new ArrayList();

    /* renamed from: b */
    public static void m52677b(List list, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else {
                    if (i3 == iArr[i4]) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                m52677b(list, i, iArr, i2 + 1);
            }
        }
    }

    /* renamed from: a */
    public boolean m52678a(weg wegVar) {
        return this.f50248a.add(wegVar);
    }

    /* renamed from: c */
    public final List m52679c(int i) {
        ArrayList arrayList = new ArrayList();
        m52677b(arrayList, i, new int[i], 0);
        return arrayList;
    }

    /* renamed from: d */
    public List m52680d(List list) {
        int i;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f50248a.size()) {
            return null;
        }
        List listM52679c = m52679c(this.f50248a.size());
        weg[] wegVarArr = new weg[list.size()];
        Iterator it = listM52679c.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean zM54278g = true;
            while (i < this.f50248a.size()) {
                if (iArr[i] < list.size()) {
                    zM54278g &= ((weg) this.f50248a.get(i)).m54278g((weg) list.get(iArr[i]));
                    if (!zM54278g) {
                        break;
                    }
                    wegVarArr[iArr[i]] = (weg) this.f50248a.get(i);
                }
                i++;
            }
            if (zM54278g) {
                i = 1;
                break;
            }
        }
        if (i != 0) {
            return Arrays.asList(wegVarArr);
        }
        return null;
    }
}
