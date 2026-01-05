package rh;

import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.m */
/* loaded from: classes.dex */
public final class C6534m implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C6535n f31322a;

    public C6534m(C6535n c6535n) {
        this.f31322a = c6535n;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        C6535n c6535n = this.f31322a;
        c6535n.f31328i = true;
        c6535n.f31330k = System.currentTimeMillis();
        c6535n.m12559g(false);
    }
}
