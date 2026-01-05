package c6;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.RenderNode;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k1 {
    /* renamed from: a */
    public static /* synthetic */ BlendModeColorFilter m2436a(int i10, BlendMode blendMode) {
        return new BlendModeColorFilter(i10, blendMode);
    }

    /* renamed from: b */
    public static /* synthetic */ RenderNode m2437b() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    /* renamed from: c */
    public static /* synthetic */ WindowInsets.Builder m2438c() {
        return new WindowInsets.Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ WindowInsets.Builder m2439d(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* renamed from: e */
    public static /* synthetic */ void m2440e() {
    }

    /* renamed from: f */
    public static /* synthetic */ RenderNode m2441f() {
        return new RenderNode("Compose");
    }
}
