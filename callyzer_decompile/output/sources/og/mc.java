package og;

import d4.C1583k;
import d4.C1595w;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class mc {
    /* renamed from: a */
    public static String m10762a(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "|");
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static final Object m10763b(C1583k c1583k, C1595w c1595w) {
        Object objM5574g = c1583k.f7868a.m5574g(c1595w);
        if (objM5574g == null) {
            return null;
        }
        return objM5574g;
    }
}
