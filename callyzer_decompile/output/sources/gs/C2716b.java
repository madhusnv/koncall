package gs;

import d7.w0;
import d7.y0;
import fo.C2348l;
import gm.C2639h;
import gm.C2640i;
import gm.C2644m;
import gm.C2645n;
import gm.C2651t;
import jn.AbstractC3802a;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.b */
/* loaded from: classes3.dex */
public final class C2716b implements y0 {

    /* renamed from: a */
    public final /* synthetic */ int f15150a;

    /* renamed from: b */
    public final /* synthetic */ String f15151b;

    /* renamed from: c */
    public final /* synthetic */ String f15152c;

    /* renamed from: d */
    public final /* synthetic */ Object f15153d;

    public /* synthetic */ C2716b(int i10, Object obj, String str, String str2) {
        this.f15150a = i10;
        this.f15153d = obj;
        this.f15151b = str;
        this.f15152c = str2;
    }

    @Override // d7.y0
    /* renamed from: b */
    public final w0 mo1207b(Class cls) {
        switch (this.f15150a) {
            case 0:
                C2644m c2644m = ((C2639h) this.f15153d).f14249a;
                C2645n c2645n = (C2645n) c2644m.f14257d;
                C8090p c8090pM6609e = c2645n.m6609e();
                C2651t c2651t = c2644m.f14255b;
                return new C2721g(c8090pM6609e, c2651t.m6630t(), c2651t.m6613c(), c2651t.m6633w(), c2645n.m6608d(), this.f15151b, this.f15152c, AbstractC3802a.m8397a(c2651t.f14307e), c2651t.f14305c.f15864a);
            default:
                C2644m c2644m2 = ((C2640i) this.f15153d).f14250a;
                C2348l c2348lM6608d = ((C2645n) c2644m2.f14257d).m6608d();
                C2651t c2651t2 = c2644m2.f14255b;
                return new C2724j(c2348lM6608d, c2651t2.m6630t(), c2651t2.m6613c(), AbstractC3802a.m8397a(c2651t2.f14307e), c2651t2.f14305c.f15864a, this.f15151b, this.f15152c);
        }
    }
}
