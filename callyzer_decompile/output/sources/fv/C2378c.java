package fv;

import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import d7.w0;
import d7.y0;
import gm.C2641j;
import gm.C2644m;
import gm.C2645n;
import gm.C2651t;
import jn.AbstractC3802a;
import no.C5122i;
import yk.C8687a;
import yv.C8803r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fv.c */
/* loaded from: classes3.dex */
public final class C2378c implements y0 {

    /* renamed from: a */
    public final /* synthetic */ C2641j f10818a;

    /* renamed from: b */
    public final /* synthetic */ Integer f10819b;

    /* renamed from: c */
    public final /* synthetic */ String f10820c;

    /* renamed from: d */
    public final /* synthetic */ LastCallDetails f10821d;

    /* renamed from: e */
    public final /* synthetic */ boolean f10822e;

    public C2378c(C2641j c2641j, Integer num, String str, LastCallDetails lastCallDetails, boolean z6) {
        this.f10818a = c2641j;
        this.f10819b = num;
        this.f10820c = str;
        this.f10821d = lastCallDetails;
        this.f10822e = z6;
    }

    @Override // d7.y0
    /* renamed from: b */
    public final w0 mo1207b(Class cls) {
        C2644m c2644m = this.f10818a.f14251a;
        C2651t c2651t = c2644m.f14255b;
        return new C2386k(c2651t.f14305c.f15864a, (C5122i) c2651t.f14301Y.get(), ((C2645n) c2644m.f14257d).m6609e(), c2651t.m6616f(), new C8687a(25), c2651t.f14305c.f15864a, c2651t.m6633w(), (C8803r) c2651t.f14293Q.get(), this.f10819b, AbstractC3802a.m8397a(c2651t.f14307e), this.f10820c, this.f10821d, this.f10822e, c2651t.m6631u());
    }
}
