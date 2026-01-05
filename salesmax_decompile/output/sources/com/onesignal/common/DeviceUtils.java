package com.onesignal.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import p001o.r9j;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class DeviceUtils {
    public static final DeviceUtils INSTANCE = new DeviceUtils();
    private static final int MARGIN_ERROR_PX_SIZE = ViewUtils.INSTANCE.dpToPx(24);

    private DeviceUtils() {
    }

    public final String getCarrierName(Context context) {
        sq8.m48649h(context, "appContext");
        try {
            Object systemService = context.getSystemService("phone");
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (sq8.m48644c("", networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final Integer getNetType(Context context) {
        sq8.m48649h(context, "appContext");
        Object systemService = context.getSystemService("connectivity");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type2 = activeNetworkInfo.getType();
        return (type2 == 1 || type2 == 9) ? 0 : 1;
    }

    public final boolean isKeyboardUp(WeakReference<Activity> weakReference) {
        View decorView;
        sq8.m48649h(weakReference, "activityWeakReference");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Activity activity = weakReference.get();
            sq8.m48646e(activity);
            Window window = activity.getWindow();
            decorView = window.getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            decorView = null;
        }
        if (decorView == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return displayMetrics.heightPixels - rect.bottom > MARGIN_ERROR_PX_SIZE;
        }
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        if (rootWindowInsets != null) {
            return rootWindowInsets.isVisible(r9j.C16576m.m46446b());
        }
        return false;
    }
}
