package og;

import q1.C6090r;
import q1.C6091s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class tc {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* renamed from: a */
    public static final int m10932a(C6090r c6090r) {
        ?? r02 = c6090r.f29726k;
        int size = r02.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((C6091s) r02.get(i11)).f29745m;
        }
        return (i10 / r02.size()) + c6090r.f29732q;
    }
}
