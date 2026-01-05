package pub.devrel.easypermissions;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;
import p001o.ece;
import pub.devrel.easypermissions.AbstractC18784a;

/* loaded from: classes6.dex */
public class RationaleDialogFragmentCompat extends AppCompatDialogFragment {

    /* renamed from: a */
    public AbstractC18784a.a f57976a;

    /* renamed from: b */
    public AbstractC18784a.b f57977b;

    public static RationaleDialogFragmentCompat H0(String str, String str2, String str3, int i, int i2, String[] strArr) {
        RationaleDialogFragmentCompat rationaleDialogFragmentCompat = new RationaleDialogFragmentCompat();
        rationaleDialogFragmentCompat.setArguments(new ece(str2, str3, str, i, i2, strArr).m24779c());
        return rationaleDialogFragmentCompat;
    }

    public void I0(FragmentManager fragmentManager, String str) {
        if (fragmentManager.W0()) {
            return;
        }
        show(fragmentManager, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof AbstractC18784a.a) {
                this.f57976a = (AbstractC18784a.a) getParentFragment();
            }
            if (getParentFragment() instanceof AbstractC18784a.b) {
                this.f57977b = (AbstractC18784a.b) getParentFragment();
            }
        }
        if (context instanceof AbstractC18784a.a) {
            this.f57976a = (AbstractC18784a.a) context;
        }
        if (context instanceof AbstractC18784a.b) {
            this.f57977b = (AbstractC18784a.b) context;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        ece eceVar = new ece(getArguments());
        return eceVar.m24778b(getContext(), new DialogInterfaceOnClickListenerC18786c(this, eceVar, this.f57976a, this.f57977b));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f57976a = null;
        this.f57977b = null;
    }
}
