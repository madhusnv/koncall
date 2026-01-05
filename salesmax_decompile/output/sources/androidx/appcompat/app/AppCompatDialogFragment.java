package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import p001o.dk0;

/* loaded from: classes2.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new dk0(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof dk0)) {
            super.setupDialog(dialog, i);
            return;
        }
        dk0 dk0Var = (dk0) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dk0Var.supportRequestWindowFeature(1);
    }
}
