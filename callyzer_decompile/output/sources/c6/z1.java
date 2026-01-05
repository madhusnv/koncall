package c6;

import android.view.View;
import android.view.Window;
import og.ga;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class z1 extends ga {

    /* renamed from: a */
    public final Window f5548a;

    public z1(Window window) {
        this.f5548a = window;
    }

    @Override // og.ga
    /* renamed from: c */
    public final void mo2344c(boolean z6) {
        Window window = this.f5548a;
        if (!z6) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
