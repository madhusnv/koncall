package d6;

import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c0.a0;
import c3.C0848c;
import d3.h0;
import g2.e7;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import p007h.C2749a;
import p021w.C7843i;
import p022x.AbstractC8231a;
import w4.C7927s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d6.d */
/* loaded from: classes.dex */
public abstract class AbstractC1614d {
    /* renamed from: a */
    public static int m5265a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && (i10 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    /* renamed from: b */
    public static OnBackInvokedDispatcher m5266b(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        AbstractC4154l.m8922e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    /* renamed from: c */
    public static Object m5267c(String str, Bundle bundle) {
        return bundle.getParcelable(str, C2749a.class);
    }

    /* renamed from: d */
    public static ArrayList m5268d(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    /* renamed from: e */
    public static a0 m5269e(C7843i c7843i) {
        Long l9 = (Long) c7843i.m14823a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l9 != null) {
            return (a0) AbstractC8231a.f39370a.get(l9);
        }
        return null;
    }

    /* renamed from: f */
    public static String m5270f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* renamed from: g */
    public static boolean m5271g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* renamed from: h */
    public static final void m5272h(C7927s c7927s, e7 e7Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (e7Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = c7927s.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, e7Var);
    }

    /* renamed from: i */
    public static final void m5273i(C7927s c7927s, e7 e7Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (e7Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = c7927s.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(e7Var);
    }

    /* renamed from: j */
    public static void m5274j(Object dispatcher, Object callback) {
        AbstractC4154l.m8923f(dispatcher, "dispatcher");
        AbstractC4154l.m8923f(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
    }

    /* renamed from: k */
    public static final void m5275k(CursorAnchorInfo.Builder builder, C0848c c0848c) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(h0.m5148t(c0848c)).setHandwritingBounds(h0.m5148t(c0848c)).build());
    }

    /* renamed from: l */
    public static final void m5276l(CursorAnchorInfo.Builder builder, C0848c c0848c) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(h0.m5148t(c0848c)).setHandwritingBounds(h0.m5148t(c0848c)).build());
    }

    /* renamed from: m */
    public static void m5277m(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    /* renamed from: n */
    public static void m5278n(Object dispatcher, Object callback) {
        AbstractC4154l.m8923f(dispatcher, "dispatcher");
        AbstractC4154l.m8923f(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
