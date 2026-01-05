package c6;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import og.ga;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class b2 extends ga {

    /* renamed from: a */
    public final WindowInsetsController f5430a;

    /* renamed from: b */
    public final Window f5431b;

    public b2(Window window) {
        this.f5430a = window.getInsetsController();
        this.f5431b = window;
    }

    @Override // og.ga
    /* renamed from: b */
    public final void mo2334b(boolean z6) {
        Window window = this.f5431b;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f5430a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f5430a.setSystemBarsAppearance(0, 16);
    }

    @Override // og.ga
    /* renamed from: c */
    public final void mo2344c(boolean z6) {
        Window window = this.f5431b;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f5430a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f5430a.setSystemBarsAppearance(0, 8);
    }
}
