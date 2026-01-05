package p001o;

import android.view.RenderNode;

/* loaded from: classes2.dex */
public final class mke {

    /* renamed from: a */
    public static final mke f35628a = new mke();

    /* renamed from: a */
    public final int m39294a(RenderNode renderNode) {
        sq8.m48649h(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    /* renamed from: b */
    public final int m39295b(RenderNode renderNode) {
        sq8.m48649h(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    /* renamed from: c */
    public final void m39296c(RenderNode renderNode, int i) {
        sq8.m48649h(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    /* renamed from: d */
    public final void m39297d(RenderNode renderNode, int i) {
        sq8.m48649h(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
