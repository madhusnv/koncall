package p8;

import android.view.ViewGroup;
import b9.AbstractC0630b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.e */
/* loaded from: classes.dex */
public final class C5844e extends AbstractC5858s {

    /* renamed from: a */
    public boolean f28555a = false;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f28556b;

    public C5844e(ViewGroup viewGroup) {
        this.f28556b = viewGroup;
    }

    @Override // p8.AbstractC5858s, p8.InterfaceC5856q
    /* renamed from: a */
    public final void mo11420a() {
        AbstractC0630b.m1806o(this.f28556b, false);
    }

    @Override // p8.AbstractC5858s, p8.InterfaceC5856q
    /* renamed from: b */
    public final void mo11423b() {
        AbstractC0630b.m1806o(this.f28556b, false);
        this.f28555a = true;
    }

    @Override // p8.AbstractC5858s, p8.InterfaceC5856q
    /* renamed from: d */
    public final void mo11421d() {
        AbstractC0630b.m1806o(this.f28556b, true);
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: e */
    public final void mo11422e(AbstractC5857r abstractC5857r) {
        if (!this.f28555a) {
            AbstractC0630b.m1806o(this.f28556b, false);
        }
        abstractC5857r.m11461y(this);
    }
}
