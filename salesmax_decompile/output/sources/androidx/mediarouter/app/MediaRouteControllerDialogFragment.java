package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.mediarouter.media.C2318f;

/* loaded from: classes2.dex */
public class MediaRouteControllerDialogFragment extends DialogFragment {

    /* renamed from: a */
    public boolean f8928a = false;

    /* renamed from: b */
    public Dialog f8929b;

    /* renamed from: c */
    public C2318f f8930c;

    public MediaRouteControllerDialogFragment() {
        setCancelable(true);
    }

    public final void H0() {
        if (this.f8930c == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f8930c = C2318f.m8219d(arguments.getBundle("selector"));
            }
            if (this.f8930c == null) {
                this.f8930c = C2318f.f9224c;
            }
        }
    }

    public DialogC2305a I0(Context context, Bundle bundle) {
        return new DialogC2305a(context);
    }

    public DialogC2306b J0(Context context) {
        return new DialogC2306b(context);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f8929b;
        if (dialog != null) {
            if (this.f8928a) {
                ((DialogC2306b) dialog).updateLayout();
            } else {
                ((DialogC2305a) dialog).updateLayout();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f8928a) {
            DialogC2306b dialogC2306bJ0 = J0(getContext());
            this.f8929b = dialogC2306bJ0;
            dialogC2306bJ0.setRouteSelector(this.f8930c);
        } else {
            this.f8929b = I0(getContext(), bundle);
        }
        return this.f8929b;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f8929b;
        if (dialog == null || this.f8928a) {
            return;
        }
        ((DialogC2305a) dialog).m7939n(false);
    }

    public void setRouteSelector(C2318f c2318f) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        H0();
        if (this.f8930c.equals(c2318f)) {
            return;
        }
        this.f8930c = c2318f;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", c2318f.m8220a());
        setArguments(arguments);
        Dialog dialog = this.f8929b;
        if (dialog == null || !this.f8928a) {
            return;
        }
        ((DialogC2306b) dialog).setRouteSelector(c2318f);
    }

    public void setUseDynamicGroup(boolean z) {
        if (this.f8929b != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.f8928a = z;
    }
}
