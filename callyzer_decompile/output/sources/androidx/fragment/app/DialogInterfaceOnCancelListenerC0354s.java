package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0354s implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0358w f2689a;

    public DialogInterfaceOnCancelListenerC0354s(DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w) {
        this.f2689a = dialogInterfaceOnCancelListenerC0358w;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w = this.f2689a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0358w.f2737m;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0358w.onCancel(dialog);
        }
    }
}
