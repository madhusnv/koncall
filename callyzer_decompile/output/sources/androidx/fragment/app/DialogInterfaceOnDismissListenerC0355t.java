package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0355t implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0358w f2700a;

    public DialogInterfaceOnDismissListenerC0355t(DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w) {
        this.f2700a = dialogInterfaceOnCancelListenerC0358w;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w = this.f2700a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0358w.f2737m;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0358w.onDismiss(dialog);
        }
    }
}
