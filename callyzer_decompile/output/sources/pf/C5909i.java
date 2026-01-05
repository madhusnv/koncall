package pf;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.i */
/* loaded from: classes.dex */
public class C5909i extends DialogInterfaceOnCancelListenerC0358w {

    /* renamed from: s */
    public Dialog f28757s;

    /* renamed from: t */
    public DialogInterface.OnCancelListener f28758t;

    /* renamed from: v */
    public AlertDialog f28759v;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w
    /* renamed from: j */
    public final Dialog mo1271j() {
        Dialog dialog = this.f28757s;
        if (dialog != null) {
            return dialog;
        }
        this.f2733h = false;
        if (this.f28759v == null) {
            Context context = getContext();
            AbstractC6840z.m13036g(context);
            this.f28759v = new AlertDialog.Builder(context).create();
        }
        return this.f28759v;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f28758t;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
