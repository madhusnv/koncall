package androidx.fragment.app;

import android.view.View;
import d7.InterfaceC1649u;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public final class C0356u implements d7.h0 {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0358w f2706a;

    public C0356u(DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w) {
        this.f2706a = dialogInterfaceOnCancelListenerC0358w;
    }

    @Override // d7.h0
    public final void onChanged(Object obj) {
        if (((InterfaceC1649u) obj) != null) {
            DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w = this.f2706a;
            if (dialogInterfaceOnCancelListenerC0358w.f2733h) {
                View viewRequireView = dialogInterfaceOnCancelListenerC0358w.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0358w.f2737m != null) {
                    if (j1.m1152K(3)) {
                        Objects.toString(dialogInterfaceOnCancelListenerC0358w.f2737m);
                    }
                    dialogInterfaceOnCancelListenerC0358w.f2737m.setContentView(viewRequireView);
                }
            }
        }
    }
}
