package p001o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;

/* loaded from: classes3.dex */
public abstract class ckh {
    /* renamed from: a */
    public static void m21348a(Context context, int i) {
        Resources.Theme themeM21349b;
        context.getTheme().applyStyle(i, true);
        if (!(context instanceof Activity) || (themeM21349b = m21349b((Activity) context)) == null) {
            return;
        }
        themeM21349b.applyStyle(i, true);
    }

    /* renamed from: b */
    public static Resources.Theme m21349b(Activity activity) {
        View viewPeekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
