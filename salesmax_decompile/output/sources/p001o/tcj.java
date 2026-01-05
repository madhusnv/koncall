package p001o;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes2.dex */
public final class tcj {

    /* renamed from: a */
    public static final tcj f46877a = new tcj();

    /* renamed from: a */
    public final void m49750a(AndroidComposeView androidComposeView) {
        sq8.m48649h(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
