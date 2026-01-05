package com.onesignal.common;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import p001o.lza;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class ViewUtils {
    public static final ViewUtils INSTANCE = new ViewUtils();

    private ViewUtils() {
    }

    private final int getDisplaySizeY(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    @TargetApi(23)
    private final int getWindowHeightAPI23Plus(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        sq8.m48648g(decorView, "activity.window.decorView");
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        return rootWindowInsets == null ? decorView.getHeight() : (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    private final int getWindowHeightLollipop(Activity activity) {
        return activity.getResources().getConfiguration().orientation == 2 ? getWindowVisibleDisplayFrame(activity).height() : getDisplaySizeY(activity);
    }

    private final Rect getWindowVisibleDisplayFrame(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public final int dpToPx(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public final int[] getCutoutAndStatusBarInsets(Activity activity) {
        float safeInsetRight;
        float safeInsetLeft;
        DisplayCutout cutout;
        sq8.m48649h(activity, "activity");
        Rect windowVisibleDisplayFrame = getWindowVisibleDisplayFrame(activity);
        View viewFindViewById = activity.getWindow().findViewById(R.id.content);
        float top = (windowVisibleDisplayFrame.top - viewFindViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (viewFindViewById.getBottom() - windowVisibleDisplayFrame.bottom) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            safeInsetRight = 0.0f;
            safeInsetLeft = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight() / Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft() / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{lza.m38121d(top), lza.m38121d(bottom), lza.m38121d(safeInsetRight), lza.m38121d(safeInsetLeft)};
    }

    public final int getFullbleedWindowWidth(Activity activity) {
        sq8.m48649h(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        sq8.m48648g(decorView, "activity.window.decorView");
        return decorView.getWidth();
    }

    public final int getWindowHeight(Activity activity) {
        sq8.m48649h(activity, "activity");
        return getWindowHeightAPI23Plus(activity);
    }

    public final int getWindowWidth(Activity activity) {
        sq8.m48649h(activity, "activity");
        return getWindowVisibleDisplayFrame(activity).width();
    }
}
