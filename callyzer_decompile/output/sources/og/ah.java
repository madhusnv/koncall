package og;

import android.content.Context;
import b2.C0554l;
import qi.C6230m;
import ue.C7419a;
import ue.C7421c;
import ue.EnumC7422d;
import ve.C7707a;
import w3.C7892j;
import xe.C8363o;
import xe.C8364p;
import xe.C8365q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ah implements tg {

    /* renamed from: a */
    public final C6230m f26323a;

    /* renamed from: b */
    public final C6230m f26324b;

    /* renamed from: c */
    public final sg f26325c;

    public ah(Context context, sg sgVar) {
        this.f26325c = sgVar;
        C7707a c7707a = C7707a.f37227e;
        C8365q.m15537b(context);
        C8363o c8363oM15538c = C8365q.m15536a().m15538c(c7707a);
        if (C7707a.f37226d.contains(new C7421c("json"))) {
            this.f26323a = new C6230m(new zg(c8363oM15538c, 0));
        }
        this.f26324b = new C6230m(new zg(c8363oM15538c, 1));
    }

    @Override // og.tg
    /* renamed from: a */
    public final void mo10541a(C0554l c0554l) {
        int i10 = this.f26325c.f26804b;
        if (i10 != 0) {
            ((C8364p) this.f26324b.get()).m15535a(c0554l.f3778b != 0 ? new C7419a(c0554l.m1647q(i10), EnumC7422d.DEFAULT, null) : new C7419a(c0554l.m1647q(i10), EnumC7422d.VERY_LOW, null), new C7892j(12));
            return;
        }
        C6230m c6230m = this.f26323a;
        if (c6230m != null) {
            ((C8364p) c6230m.get()).m15535a(c0554l.f3778b != 0 ? new C7419a(c0554l.m1647q(i10), EnumC7422d.DEFAULT, null) : new C7419a(c0554l.m1647q(i10), EnumC7422d.VERY_LOW, null), new C7892j(12));
        }
    }
}
