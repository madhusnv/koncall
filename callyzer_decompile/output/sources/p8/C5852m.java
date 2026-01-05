package p8;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.m */
/* loaded from: classes.dex */
public final class C5852m extends AbstractC5858s {

    /* renamed from: a */
    public final /* synthetic */ Object f28593a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f28594b;

    /* renamed from: c */
    public final /* synthetic */ Object f28595c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f28596d;

    /* renamed from: e */
    public final /* synthetic */ C5854o f28597e;

    public C5852m(C5854o c5854o, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f28597e = c5854o;
        this.f28593a = obj;
        this.f28594b = arrayList;
        this.f28595c = obj2;
        this.f28596d = arrayList2;
    }

    @Override // p8.AbstractC5858s, p8.InterfaceC5856q
    /* renamed from: c */
    public final void mo11424c(AbstractC5857r abstractC5857r) {
        C5854o c5854o = this.f28597e;
        Object obj = this.f28593a;
        if (obj != null) {
            c5854o.m11435t(obj, this.f28594b, null);
        }
        Object obj2 = this.f28595c;
        if (obj2 != null) {
            c5854o.m11435t(obj2, this.f28596d, null);
        }
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: e */
    public final void mo11422e(AbstractC5857r abstractC5857r) {
        abstractC5857r.m11461y(this);
    }
}
