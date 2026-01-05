package pg;

import i0.AbstractC3084o;
import i0.C3085p;
import java.util.ArrayList;
import p020v.C7614x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d6 {
    /* renamed from: a */
    public static void m11580a(AbstractC3084o abstractC3084o, ArrayList arrayList) {
        if (!(abstractC3084o instanceof C3085p)) {
            if (abstractC3084o instanceof p020v.k0) {
                arrayList.add(((p020v.k0) abstractC3084o).f36618a);
                return;
            } else {
                arrayList.add(new C7614x(abstractC3084o));
                return;
            }
        }
        ArrayList arrayList2 = ((C3085p) abstractC3084o).f16552a;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            m11580a((AbstractC3084o) obj, arrayList);
        }
    }
}
