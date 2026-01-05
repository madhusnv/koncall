package ba;

import g4.AbstractC2494j;
import g4.AbstractC2499o;
import g4.C2490f;
import g4.C2492h;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ba.i */
/* loaded from: classes.dex */
public abstract class AbstractC0639i {
    /* renamed from: a */
    public static final boolean m1856a(C2492h c2492h) {
        int length = c2492h.f13620b.length();
        List list = c2492h.f13619a;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2490f c2490f = (C2490f) list.get(i10);
                if ((c2490f.f13595a instanceof AbstractC2499o) && AbstractC2494j.m6442b(0, length, c2490f.f13596b, c2490f.f13597c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
