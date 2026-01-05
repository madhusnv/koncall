package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.mediarouter.media.C2318f;
import p001o.b7b;
import p001o.f7b;

/* loaded from: classes2.dex */
public class MediaRouteChooserDialogFragment extends DialogFragment {
    private static final String ARGUMENT_SELECTOR = "selector";
    private Dialog mDialog;
    private C2318f mSelector;
    private boolean mUseDynamicGroup = false;

    public MediaRouteChooserDialogFragment() {
        setCancelable(true);
    }

    public final void H0() {
        if (this.mSelector == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mSelector = C2318f.m8219d(arguments.getBundle(ARGUMENT_SELECTOR));
            }
            if (this.mSelector == null) {
                this.mSelector = C2318f.f9224c;
            }
        }
    }

    public C2318f getRouteSelector() {
        H0();
        return this.mSelector;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.mDialog;
        if (dialog == null) {
            return;
        }
        if (this.mUseDynamicGroup) {
            ((f7b) dialog).updateLayout();
        } else {
            ((b7b) dialog).updateLayout();
        }
    }

    public b7b onCreateChooserDialog(Context context, Bundle bundle) {
        return new b7b(context);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.mUseDynamicGroup) {
            f7b f7bVarOnCreateDynamicChooserDialog = onCreateDynamicChooserDialog(getContext());
            this.mDialog = f7bVarOnCreateDynamicChooserDialog;
            f7bVarOnCreateDynamicChooserDialog.setRouteSelector(getRouteSelector());
        } else {
            b7b b7bVarOnCreateChooserDialog = onCreateChooserDialog(getContext(), bundle);
            this.mDialog = b7bVarOnCreateChooserDialog;
            b7bVarOnCreateChooserDialog.setRouteSelector(getRouteSelector());
        }
        return this.mDialog;
    }

    public f7b onCreateDynamicChooserDialog(Context context) {
        return new f7b(context);
    }

    public void setRouteSelector(C2318f c2318f) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        H0();
        if (this.mSelector.equals(c2318f)) {
            return;
        }
        this.mSelector = c2318f;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle(ARGUMENT_SELECTOR, c2318f.m8220a());
        setArguments(arguments);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            if (this.mUseDynamicGroup) {
                ((f7b) dialog).setRouteSelector(c2318f);
            } else {
                ((b7b) dialog).setRouteSelector(c2318f);
            }
        }
    }

    public void setUseDynamicGroup(boolean z) {
        if (this.mDialog != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.mUseDynamicGroup = z;
    }
}
