package p001o;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;

/* loaded from: classes2.dex */
public interface czi {
    default AbstractComposeView getSubCompositionView() {
        return null;
    }

    default View getViewRoot() {
        return null;
    }
}
