package p001o;

import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import androidx.mediarouter.app.MediaRouteControllerDialogFragment;

/* loaded from: classes2.dex */
public class c7b {
    private static final c7b sDefault = new c7b();

    public static c7b getDefault() {
        return sDefault;
    }

    public MediaRouteChooserDialogFragment onCreateChooserDialogFragment() {
        return new MediaRouteChooserDialogFragment();
    }

    public MediaRouteControllerDialogFragment onCreateControllerDialogFragment() {
        return new MediaRouteControllerDialogFragment();
    }
}
