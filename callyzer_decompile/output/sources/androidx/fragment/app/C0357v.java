package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public final class C0357v extends r0 {

    /* renamed from: a */
    public final /* synthetic */ r0 f2720a;

    /* renamed from: b */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0358w f2721b;

    public C0357v(DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w, r0 r0Var) {
        this.f2721b = dialogInterfaceOnCancelListenerC0358w;
        this.f2720a = r0Var;
    }

    @Override // androidx.fragment.app.r0
    /* renamed from: b */
    public final View mo1115b(int i10) {
        r0 r0Var = this.f2720a;
        if (r0Var.mo1116c()) {
            return r0Var.mo1115b(i10);
        }
        Dialog dialog = this.f2721b.f2737m;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.r0
    /* renamed from: c */
    public final boolean mo1116c() {
        return this.f2720a.mo1116c() || this.f2721b.f2741r;
    }
}
