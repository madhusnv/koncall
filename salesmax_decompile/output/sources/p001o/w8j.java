package p001o;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes2.dex */
public abstract class w8j {

    /* renamed from: o.w8j$a */
    public static class C17800a {
        /* renamed from: a */
        public static void m54107a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: o.w8j$b */
    public static class C17801b {
        /* renamed from: a */
        public static void m54108a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    /* renamed from: a */
    public static oaj m54105a(Window window, View view) {
        return new oaj(window, view);
    }

    /* renamed from: b */
    public static void m54106b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C17801b.m54108a(window, z);
        } else {
            C17800a.m54107a(window, z);
        }
    }
}
