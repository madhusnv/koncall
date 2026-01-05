package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes3.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* renamed from: a */
    public boolean f12192a;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialogFragment$b */
    public class C10970b extends BottomSheetBehavior.AbstractC10967g {
        public C10970b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC10967g
        /* renamed from: b */
        public void mo14181b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC10967g
        /* renamed from: c */
        public void mo14182c(View view, int i) {
            if (i == 5) {
                BottomSheetDialogFragment.this.I0();
            }
        }
    }

    public final void I0() {
        if (this.f12192a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    public final void J0(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f12192a = z;
        if (bottomSheetBehavior.u0() == 5) {
            I0();
            return;
        }
        if (getDialog() instanceof DialogC10973a) {
            ((DialogC10973a) getDialog()).m14204n();
        }
        bottomSheetBehavior.c0(new C10970b());
        bottomSheetBehavior.Z0(5);
    }

    public final boolean K0(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof DialogC10973a)) {
            return false;
        }
        DialogC10973a dialogC10973a = (DialogC10973a) dialog;
        BottomSheetBehavior bottomSheetBehaviorM14201k = dialogC10973a.m14201k();
        if (!bottomSheetBehaviorM14201k.B0() || !dialogC10973a.m14202l()) {
            return false;
        }
        J0(bottomSheetBehaviorM14201k, z);
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (K0(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (K0(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC10973a(getContext(), getTheme());
    }
}
