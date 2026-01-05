package c6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.websoptimization.callyzerbiz.R;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n0 {
    /* renamed from: a */
    public static void m2449a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: b */
    public static y1 m2450b(View view, y1 y1Var, Rect rect) {
        WindowInsets windowInsetsM2539c = y1Var.m2539c();
        if (windowInsetsM2539c != null) {
            return y1.m2537d(view, view.computeSystemWindowInsets(windowInsetsM2539c, rect));
        }
        rect.setEmpty();
        return y1Var;
    }

    /* renamed from: c */
    public static ColorStateList m2451c(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: d */
    public static PorterDuff.Mode m2452d(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: e */
    public static float m2453e(View view) {
        return view.getElevation();
    }

    /* renamed from: f */
    public static String m2454f(View view) {
        return view.getTransitionName();
    }

    /* renamed from: g */
    public static float m2455g(View view) {
        return view.getZ();
    }

    /* renamed from: h */
    public static boolean m2456h(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: i */
    public static void m2457i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: j */
    public static void m2458j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: k */
    public static void m2459k(View view, float f6) {
        view.setElevation(f6);
    }

    /* renamed from: l */
    public static void m2460l(View view, InterfaceC0893w interfaceC0893w) {
        m0 m0Var = interfaceC0893w != null ? new m0(view, interfaceC0893w) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, m0Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (m0Var != null) {
            view.setOnApplyWindowInsetsListener(m0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    /* renamed from: m */
    public static void m2461m(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: n */
    public static void m2462n(View view) {
        view.stopNestedScroll();
    }
}
