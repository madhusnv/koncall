package c6;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import d3.C1555i;
import kotlin.NoWhenBranchMatchedException;
import p008i.C3067d;
import p008i.C3068e;
import p008i.InterfaceC3069f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.j */
/* loaded from: classes.dex */
public abstract class AbstractC0880j {
    /* renamed from: a */
    public static Context m2417a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    /* renamed from: b */
    public static Icon m2418b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    /* renamed from: c */
    public static String m2419c(Context context) {
        return context.getAttributionTag();
    }

    /* renamed from: d */
    public static CharSequence m2420d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: e */
    public static String m2421e(InterfaceC3069f interfaceC3069f) {
        if (interfaceC3069f instanceof C3068e) {
            return "image/*";
        }
        if (interfaceC3069f instanceof C3067d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: f */
    public static Insets m2422f(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    /* renamed from: g */
    public static boolean m2423g() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    /* renamed from: h */
    public static void m2424h(Window window, boolean z6) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z6);
    }

    /* renamed from: i */
    public static void m2425i(Window window, boolean z6) {
        window.setDecorFitsSystemWindows(z6);
    }

    /* renamed from: j */
    public static void m2426j(View view) {
        view.setImportantForContentCapture(1);
    }

    /* renamed from: k */
    public static void m2427k(Outline outline, d3.g0 g0Var) {
        if (!(g0Var instanceof C1555i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C1555i) g0Var).f7752a);
    }

    /* renamed from: l */
    public static void m2428l(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
