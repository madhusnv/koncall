package c6;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Network;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.widget.TextView;
import c0.RunnableC0827t;
import com.amplifyframework.devmenu.DeveloperMenuActivity;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.i */
/* loaded from: classes.dex */
public abstract class AbstractC0879i {
    /* renamed from: a */
    public static Typeface m2389a(Typeface typeface, int i10, boolean z6) {
        return Typeface.create(typeface, i10, z6);
    }

    /* renamed from: b */
    public static Handler m2390b(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* renamed from: c */
    public static Handler m2391c(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* renamed from: d */
    public static String[] m2392d(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: e */
    public static long m2393e(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* renamed from: f */
    public static Network m2394f(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    /* renamed from: g */
    public static int m2395g(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* renamed from: h */
    public static String m2396h(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* renamed from: i */
    public static int m2397i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: j */
    public static int m2398j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: k */
    public static int m2399k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: l */
    public static int m2400l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: m */
    public static int m2401m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    /* renamed from: n */
    public static PrecomputedText.Params m2402n(p013o.j0 j0Var) {
        return j0Var.getTextMetricsParams();
    }

    /* renamed from: o */
    public static int m2403o(Object obj) {
        return ((Icon) obj).getType();
    }

    /* renamed from: p */
    public static Uri m2404p(Object obj) {
        return ((Icon) obj).getUri();
    }

    /* renamed from: q */
    public static boolean m2405q(Handler handler, RunnableC0827t runnableC0827t, long j6) {
        return handler.postDelayed(runnableC0827t, "retry_token", j6);
    }

    /* renamed from: r */
    public static View m2406r(DeveloperMenuActivity developerMenuActivity, int i10) {
        return developerMenuActivity.requireViewById(i10);
    }

    /* renamed from: s */
    public static void m2407s(View view) {
        view.resetPivot();
    }

    /* renamed from: t */
    public static void m2408t(TextView textView, int i10) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    /* renamed from: u */
    public static void m2409u(ViewStructure viewStructure, int i10) {
        viewStructure.setMaxTextLength(i10);
    }

    /* renamed from: v */
    public static void m2410v(int i10, View view) {
        view.setOutlineAmbientShadowColor(i10);
    }

    /* renamed from: w */
    public static void m2411w(int i10, View view) {
        view.setOutlineSpotShadowColor(i10);
    }

    /* renamed from: x */
    public static void m2412x(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    /* renamed from: y */
    public static boolean m2413y(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
