package p001o;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;

/* loaded from: classes3.dex */
public abstract class d36 {
    /* renamed from: a */
    public static void m22295a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int iM29503b = gua.m29503b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(iM29503b);
            }
            if (z3) {
                num2 = Integer.valueOf(iM29503b);
            }
        }
        w8j.m54106b(window, !z);
        int iM22297c = m22297c(window.getContext(), z);
        int iM22296b = m22296b(window.getContext(), z);
        window.setStatusBarColor(iM22297c);
        window.setNavigationBarColor(iM22296b);
        m22300f(window, m22298d(iM22297c, gua.m29509h(num.intValue())));
        m22299e(window, m22298d(iM22296b, gua.m29509h(num2.intValue())));
    }

    /* renamed from: b */
    public static int m22296b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return ni3.m40624p(gua.m29503b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return gua.m29503b(context, R.attr.navigationBarColor, -16777216);
    }

    /* renamed from: c */
    public static int m22297c(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return gua.m29503b(context, R.attr.statusBarColor, -16777216);
    }

    /* renamed from: d */
    public static boolean m22298d(int i, boolean z) {
        return gua.m29509h(i) || (i == 0 && z);
    }

    /* renamed from: e */
    public static void m22299e(Window window, boolean z) {
        w8j.m54105a(window, window.getDecorView()).m41888c(z);
    }

    /* renamed from: f */
    public static void m22300f(Window window, boolean z) {
        w8j.m54105a(window, window.getDecorView()).m41889d(z);
    }
}
