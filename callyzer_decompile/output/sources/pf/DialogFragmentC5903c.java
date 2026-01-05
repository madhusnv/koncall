package pf;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.c */
/* loaded from: classes.dex */
public class DialogFragmentC5903c extends DialogFragment {

    /* renamed from: a */
    public Dialog f28739a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f28740b;

    /* renamed from: c */
    public AlertDialog f28741c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f28740b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f28739a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f28741c == null) {
            Activity activity = getActivity();
            AbstractC6840z.m13036g(activity);
            this.f28741c = new AlertDialog.Builder(activity).create();
        }
        return this.f28741c;
    }
}
