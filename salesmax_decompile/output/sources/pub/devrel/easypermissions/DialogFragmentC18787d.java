package pub.devrel.easypermissions;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import p001o.ece;
import pub.devrel.easypermissions.AbstractC18784a;

/* renamed from: pub.devrel.easypermissions.d */
/* loaded from: classes6.dex */
public class DialogFragmentC18787d extends DialogFragment {

    /* renamed from: a */
    public AbstractC18784a.a f57996a;

    /* renamed from: b */
    public AbstractC18784a.b f57997b;

    /* renamed from: c */
    public boolean f57998c = false;

    /* renamed from: a */
    public static DialogFragmentC18787d m60225a(String str, String str2, String str3, int i, int i2, String[] strArr) {
        DialogFragmentC18787d dialogFragmentC18787d = new DialogFragmentC18787d();
        dialogFragmentC18787d.setArguments(new ece(str, str2, str3, i, i2, strArr).m24779c());
        return dialogFragmentC18787d;
    }

    /* renamed from: b */
    public void m60226b(FragmentManager fragmentManager, String str) {
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !this.f57998c) {
            show(fragmentManager, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof AbstractC18784a.a) {
                this.f57996a = (AbstractC18784a.a) getParentFragment();
            }
            if (getParentFragment() instanceof AbstractC18784a.b) {
                this.f57997b = (AbstractC18784a.b) getParentFragment();
            }
        }
        if (context instanceof AbstractC18784a.a) {
            this.f57996a = (AbstractC18784a.a) context;
        }
        if (context instanceof AbstractC18784a.b) {
            this.f57997b = (AbstractC18784a.b) context;
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        ece eceVar = new ece(getArguments());
        return eceVar.m24777a(getActivity(), new DialogInterfaceOnClickListenerC18786c(this, eceVar, this.f57996a, this.f57997b));
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f57996a = null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f57998c = true;
        super.onSaveInstanceState(bundle);
    }
}
