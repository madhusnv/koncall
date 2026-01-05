package g4;

import java.util.ArrayList;
import java.util.List;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.j */
/* loaded from: classes.dex */
public abstract class AbstractC2494j {

    /* renamed from: a */
    public static final C2492h f13657a = new C2492h("");

    /* renamed from: a */
    public static final List m6441a(C2492h c2492h, int i10, int i11, C2493i c2493i) {
        List list;
        if (i10 == i11 || (list = c2492h.f13619a) == null) {
            return null;
        }
        if (i10 != 0 || i11 < c2492h.f13620b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C2490f c2490f = (C2490f) list.get(i12);
                if ((c2493i != null ? ((Boolean) c2493i.invoke(c2490f.f13595a)).booleanValue() : true) && m6442b(i10, i11, c2490f.f13596b, c2490f.f13597c)) {
                    arrayList.add(new C2490f((InterfaceC2487c) c2490f.f13595a, w9.m11912c(c2490f.f13596b, i10, i11) - i10, w9.m11912c(c2490f.f13597c, i10, i11) - i10, c2490f.f13598d));
                }
            }
            return arrayList;
        }
        if (c2493i == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = list.get(i13);
            if (((Boolean) c2493i.invoke(((C2490f) obj).f13595a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static final boolean m6442b(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }
}
