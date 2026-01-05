package p8;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.l */
/* loaded from: classes.dex */
public final class C5851l implements InterfaceC5856q {

    /* renamed from: a */
    public final /* synthetic */ View f28591a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f28592b;

    public C5851l(View view, ArrayList arrayList) {
        this.f28591a = view;
        this.f28592b = arrayList;
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: c */
    public final void mo11424c(AbstractC5857r abstractC5857r) {
        abstractC5857r.m11461y(this);
        abstractC5857r.m11448a(this);
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: e */
    public final void mo11422e(AbstractC5857r abstractC5857r) {
        abstractC5857r.m11461y(this);
        this.f28591a.setVisibility(8);
        ArrayList arrayList = this.f28592b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: a */
    public final void mo11420a() {
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: b */
    public final void mo11423b() {
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: d */
    public final void mo11421d() {
    }
}
