package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.nh0;

/* loaded from: classes2.dex */
public abstract class oh0 {

    /* renamed from: a */
    public static final nh0 f38346a = new nh0("", null, null, 6, null);

    /* renamed from: b */
    public static final boolean m42232b(int i, int i2, int i3, int i4) {
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if ((i3 == i4) != (i == i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final List m42233c(List list, int i, int i2) {
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            nh0.C15582a c15582a = (nh0.C15582a) obj;
            if (m42234d(i, i2, c15582a.m40566f(), c15582a.m40564d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            nh0.C15582a c15582a2 = (nh0.C15582a) arrayList.get(i4);
            arrayList2.add(new nh0.C15582a(c15582a2.m40565e(), Math.max(i, c15582a2.m40566f()) - i, Math.min(i2, c15582a2.m40564d()) - i, c15582a2.m40567g()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* renamed from: d */
    public static final boolean m42234d(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || m42232b(i, i2, i3, i4) || m42232b(i3, i4, i, i2);
    }
}
