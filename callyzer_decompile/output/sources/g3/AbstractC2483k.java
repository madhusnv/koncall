package g3;

import android.view.RenderNode;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g3.k */
/* loaded from: classes.dex */
public abstract class AbstractC2483k {
    /* renamed from: a */
    public static int m6409a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* renamed from: b */
    public static int m6410b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* renamed from: c */
    public static void m6411c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    /* renamed from: d */
    public static void m6412d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
