package p8;

import android.view.View;
import android.view.ViewGroup;
import com.websoptimization.callyzerbiz.R;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 extends AbstractC5858s {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f28551a;

    /* renamed from: b */
    public final /* synthetic */ View f28552b;

    /* renamed from: c */
    public final /* synthetic */ View f28553c;

    /* renamed from: d */
    public final /* synthetic */ C5849j f28554d;

    public d0(C5849j c5849j, ViewGroup viewGroup, View view, View view2) {
        this.f28554d = c5849j;
        this.f28551a = viewGroup;
        this.f28552b = view;
        this.f28553c = view2;
    }

    @Override // p8.AbstractC5858s, p8.InterfaceC5856q
    /* renamed from: a */
    public final void mo11420a() {
        this.f28551a.getOverlay().remove(this.f28552b);
    }

    @Override // p8.AbstractC5858s, p8.InterfaceC5856q
    /* renamed from: d */
    public final void mo11421d() {
        View view = this.f28552b;
        if (view.getParent() == null) {
            this.f28551a.getOverlay().add(view);
        } else {
            this.f28554d.cancel();
        }
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: e */
    public final void mo11422e(AbstractC5857r abstractC5857r) {
        this.f28553c.setTag(R.id.save_overlay_view, null);
        this.f28551a.getOverlay().remove(this.f28552b);
        abstractC5857r.m11461y(this);
    }
}
