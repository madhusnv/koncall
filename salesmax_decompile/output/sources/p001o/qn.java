package p001o;

import android.app.Activity;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class qn {

    /* renamed from: a */
    public static final qn f42182a = new qn();

    /* renamed from: a */
    public final Rect m45676a(Activity activity) {
        sq8.m48649h(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        sq8.m48648g(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
