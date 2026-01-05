package w3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import d3.C1549c;
import d3.C1564r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h2 implements m1 {

    /* renamed from: a */
    public final RenderNode f37805a = c6.k1.m2441f();

    @Override // w3.m1
    /* renamed from: A */
    public final boolean mo14917A() {
        return this.f37805a.setHasOverlappingRendering(true);
    }

    @Override // w3.m1
    /* renamed from: B */
    public final void mo14918B(C1564r c1564r, d3.g0 g0Var, h1.d1 d1Var) {
        RecordingCanvas recordingCanvasBeginRecording = this.f37805a.beginRecording();
        C1549c c1549c = c1564r.f7808a;
        Canvas canvas = c1549c.f7733a;
        c1549c.f7733a = recordingCanvasBeginRecording;
        if (g0Var != null) {
            c1549c.mo5107i();
            c1549c.mo5110l(g0Var);
        }
        d1Var.invoke(c1549c);
        if (g0Var != null) {
            c1549c.mo5113o();
        }
        c1564r.f7808a.f7733a = canvas;
        this.f37805a.endRecording();
    }

    @Override // w3.m1
    /* renamed from: C */
    public final boolean mo14919C() {
        return this.f37805a.getClipToBounds();
    }

    @Override // w3.m1
    /* renamed from: D */
    public final int mo14920D() {
        return this.f37805a.getTop();
    }

    @Override // w3.m1
    /* renamed from: E */
    public final void mo14921E(int i10) {
        this.f37805a.setAmbientShadowColor(i10);
    }

    @Override // w3.m1
    /* renamed from: F */
    public final int mo14922F() {
        return this.f37805a.getRight();
    }

    @Override // w3.m1
    /* renamed from: G */
    public final boolean mo14923G() {
        return this.f37805a.getClipToOutline();
    }

    @Override // w3.m1
    /* renamed from: H */
    public final void mo14924H(boolean z6) {
        this.f37805a.setClipToOutline(z6);
    }

    @Override // w3.m1
    /* renamed from: I */
    public final void mo14925I(int i10) {
        this.f37805a.setSpotShadowColor(i10);
    }

    @Override // w3.m1
    /* renamed from: J */
    public final void mo14926J(Matrix matrix) {
        this.f37805a.getMatrix(matrix);
    }

    @Override // w3.m1
    /* renamed from: K */
    public final float mo14927K() {
        return this.f37805a.getElevation();
    }

    @Override // w3.m1
    /* renamed from: a */
    public final float mo14928a() {
        return this.f37805a.getAlpha();
    }

    @Override // w3.m1
    /* renamed from: b */
    public final int mo14929b() {
        return this.f37805a.getWidth();
    }

    @Override // w3.m1
    /* renamed from: c */
    public final void mo14930c(float f6) {
        this.f37805a.setRotationY(f6);
    }

    @Override // w3.m1
    /* renamed from: d */
    public final void mo14931d(float f6) {
        this.f37805a.setRotationZ(f6);
    }

    @Override // w3.m1
    /* renamed from: e */
    public final void mo14932e(float f6) {
        this.f37805a.setTranslationY(f6);
    }

    @Override // w3.m1
    /* renamed from: f */
    public final void mo14933f() {
        this.f37805a.discardDisplayList();
    }

    @Override // w3.m1
    /* renamed from: g */
    public final void mo14934g(float f6) {
        this.f37805a.setScaleY(f6);
    }

    @Override // w3.m1
    public final int getHeight() {
        return this.f37805a.getHeight();
    }

    @Override // w3.m1
    /* renamed from: h */
    public final boolean mo14935h() {
        return this.f37805a.hasDisplayList();
    }

    @Override // w3.m1
    /* renamed from: i */
    public final void mo14936i(float f6) {
        this.f37805a.setAlpha(f6);
    }

    @Override // w3.m1
    /* renamed from: j */
    public final void mo14937j(float f6) {
        this.f37805a.setScaleX(f6);
    }

    @Override // w3.m1
    /* renamed from: k */
    public final void mo14938k(float f6) {
        this.f37805a.setTranslationX(f6);
    }

    @Override // w3.m1
    /* renamed from: l */
    public final void mo14939l(float f6) {
        this.f37805a.setCameraDistance(f6);
    }

    @Override // w3.m1
    /* renamed from: m */
    public final void mo14940m(float f6) {
        this.f37805a.setRotationX(f6);
    }

    @Override // w3.m1
    /* renamed from: n */
    public final void mo14941n(int i10) {
        this.f37805a.offsetLeftAndRight(i10);
    }

    @Override // w3.m1
    /* renamed from: o */
    public final int mo14942o() {
        return this.f37805a.getBottom();
    }

    @Override // w3.m1
    /* renamed from: p */
    public final void mo14943p() {
        if (Build.VERSION.SDK_INT >= 31) {
            i2.m14958a(this.f37805a);
        }
    }

    @Override // w3.m1
    /* renamed from: q */
    public final void mo14944q(Canvas canvas) {
        canvas.drawRenderNode(this.f37805a);
    }

    @Override // w3.m1
    /* renamed from: r */
    public final int mo14945r() {
        return this.f37805a.getLeft();
    }

    @Override // w3.m1
    /* renamed from: s */
    public final void mo14946s(float f6) {
        this.f37805a.setPivotX(f6);
    }

    @Override // w3.m1
    /* renamed from: t */
    public final void mo14947t(boolean z6) {
        this.f37805a.setClipToBounds(z6);
    }

    @Override // w3.m1
    /* renamed from: u */
    public final boolean mo14948u(int i10, int i11, int i12, int i13) {
        return this.f37805a.setPosition(i10, i11, i12, i13);
    }

    @Override // w3.m1
    /* renamed from: v */
    public final void mo14949v(float f6) {
        this.f37805a.setPivotY(f6);
    }

    @Override // w3.m1
    /* renamed from: w */
    public final void mo14950w(float f6) {
        this.f37805a.setElevation(f6);
    }

    @Override // w3.m1
    /* renamed from: x */
    public final void mo14951x(int i10) {
        this.f37805a.offsetTopAndBottom(i10);
    }

    @Override // w3.m1
    /* renamed from: y */
    public final void mo14952y(int i10) {
        RenderNode renderNode = this.f37805a;
        if (i10 == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // w3.m1
    /* renamed from: z */
    public final void mo14953z(Outline outline) {
        this.f37805a.setOutline(outline);
    }
}
