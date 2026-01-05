package ng;

import ai.AbstractC0151h;
import al.C0178f;
import al.C0181i;
import android.content.Context;
import bl.C0689a;
import java.util.ArrayList;
import og.sg;
import og.ug;
import og.yg;
import pg.ha;
import pg.ja;
import pg.ka;
import ue.C7421c;
import ve.C7707a;
import xe.C8365q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.r */
/* loaded from: classes.dex */
public final class C5067r extends AbstractC0151h {

    /* renamed from: b */
    public final /* synthetic */ int f24860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5067r(int i10) {
        super(1);
        this.f24860b = i10;
    }

    @Override // ai.AbstractC0151h
    /* renamed from: t */
    public final Object mo340t(Object obj) {
        switch (this.f24860b) {
            case 0:
                C0178f c0178fM403c = C0178f.m403c();
                Context contextM406b = C0178f.m403c().m406b();
                ArrayList arrayList = new ArrayList();
                C0689a c0689a = new C0689a(21);
                C7707a c7707a = C7707a.f37227e;
                C8365q.m15537b(contextM406b);
                C8365q.m15536a().m15538c(c7707a);
                C7707a.f37226d.contains(new C7421c("json"));
                arrayList.add(c0689a);
                return new C5066q(c0178fM403c.m406b(), (C0181i) c0178fM403c.m405a(C0181i.class));
            case 1:
                sg sgVar = (sg) obj;
                C0178f c0178fM403c2 = C0178f.m403c();
                return new yg(c0178fM403c2.m406b(), (C0181i) c0178fM403c2.m405a(C0181i.class), new ug(C0178f.m403c().m406b(), sgVar), sgVar.f26803a);
            default:
                C0178f c0178fM403c3 = C0178f.m403c();
                return new ka(c0178fM403c3.m406b(), (C0181i) c0178fM403c3.m405a(C0181i.class), new ja(C0178f.m403c().m406b(), (ha) obj));
        }
    }
}
