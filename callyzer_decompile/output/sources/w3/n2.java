package w3;

import d4.C1583k;
import d4.C1589q;
import e1.AbstractC1910l;
import e1.C1923y;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a */
    public final C1583k f37899a;

    /* renamed from: b */
    public final C1923y f37900b;

    public n2(C1589q c1589q, AbstractC1910l abstractC1910l) {
        this.f37899a = c1589q.f7879d;
        this.f37900b = new C1923y(C1589q.m5206h(4, c1589q).size());
        List listM5206h = C1589q.m5206h(4, c1589q);
        int size = listM5206h.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1589q c1589q2 = (C1589q) listM5206h.get(i10);
            if (abstractC1910l.m5594a(c1589q2.f7882g)) {
                this.f37900b.m5664a(c1589q2.f7882g);
            }
        }
    }
}
