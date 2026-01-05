package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import p001o.ro3;

/* loaded from: classes2.dex */
public final class hke implements hr5 {

    /* renamed from: a */
    public final AndroidComposeView f27086a;

    /* renamed from: b */
    public final RenderNode f27087b;

    /* renamed from: c */
    public int f27088c;

    public hke(AndroidComposeView androidComposeView) {
        sq8.m48649h(androidComposeView, "ownerView");
        this.f27086a = androidComposeView;
        this.f27087b = uie.m51635a("Compose");
        this.f27088c = ro3.f43882a.m47011a();
    }

    @Override // p001o.hr5
    /* renamed from: A */
    public void mo30706A(float f) {
        this.f27087b.setPivotX(f);
    }

    @Override // p001o.hr5
    /* renamed from: B */
    public void mo30707B(float f) {
        this.f27087b.setPivotY(f);
    }

    @Override // p001o.hr5
    /* renamed from: C */
    public void mo30708C(float f) {
        this.f27087b.setScaleY(f);
    }

    @Override // p001o.hr5
    /* renamed from: D */
    public void mo30709D(Outline outline) {
        this.f27087b.setOutline(outline);
    }

    @Override // p001o.hr5
    /* renamed from: E */
    public void mo30710E(qc2 qc2Var, xzc xzcVar, xk7 xk7Var) {
        sq8.m48649h(qc2Var, "canvasHolder");
        sq8.m48649h(xk7Var, "drawBlock");
        RecordingCanvas recordingCanvasBeginRecording = this.f27087b.beginRecording();
        sq8.m48648g(recordingCanvasBeginRecording, "renderNode.beginRecording()");
        Canvas canvasM36964m = qc2Var.m45083a().m36964m();
        qc2Var.m45083a().m36965n(recordingCanvasBeginRecording);
        ld0 ld0VarM45083a = qc2Var.m45083a();
        if (xzcVar != null) {
            ld0VarM45083a.mo20336g();
            mc2.m38702a(ld0VarM45083a, xzcVar, 0, 2, null);
        }
        xk7Var.invoke(ld0VarM45083a);
        if (xzcVar != null) {
            ld0VarM45083a.mo20334d();
        }
        qc2Var.m45083a().m36965n(canvasM36964m);
        this.f27087b.endRecording();
    }

    @Override // p001o.hr5
    /* renamed from: F */
    public void mo30711F(int i) {
        this.f27087b.setAmbientShadowColor(i);
    }

    @Override // p001o.hr5
    /* renamed from: G */
    public void mo30712G(float f) {
        this.f27087b.setTranslationX(f);
    }

    @Override // p001o.hr5
    /* renamed from: H */
    public void mo30713H(boolean z) {
        this.f27087b.setClipToOutline(z);
    }

    @Override // p001o.hr5
    /* renamed from: I */
    public void mo30714I(int i) {
        this.f27087b.setSpotShadowColor(i);
    }

    @Override // p001o.hr5
    /* renamed from: J */
    public float mo30715J() {
        return this.f27087b.getElevation();
    }

    @Override // p001o.hr5
    /* renamed from: a */
    public int mo30716a() {
        return this.f27087b.getLeft();
    }

    @Override // p001o.hr5
    /* renamed from: b */
    public float mo30717b() {
        return this.f27087b.getAlpha();
    }

    @Override // p001o.hr5
    /* renamed from: c */
    public void mo30718c(float f) {
        this.f27087b.setAlpha(f);
    }

    @Override // p001o.hr5
    /* renamed from: d */
    public int mo30719d() {
        return this.f27087b.getRight();
    }

    @Override // p001o.hr5
    /* renamed from: e */
    public void mo30720e(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
        canvas.drawRenderNode(this.f27087b);
    }

    @Override // p001o.hr5
    /* renamed from: f */
    public void mo30721f(float f) {
        this.f27087b.setTranslationY(f);
    }

    @Override // p001o.hr5
    /* renamed from: g */
    public void mo30722g(boolean z) {
        this.f27087b.setClipToBounds(z);
    }

    @Override // p001o.hr5
    public int getHeight() {
        return this.f27087b.getHeight();
    }

    @Override // p001o.hr5
    public int getWidth() {
        return this.f27087b.getWidth();
    }

    @Override // p001o.hr5
    /* renamed from: h */
    public boolean mo30723h(int i, int i2, int i3, int i4) {
        return this.f27087b.setPosition(i, i2, i3, i4);
    }

    @Override // p001o.hr5
    /* renamed from: i */
    public void mo30724i() {
        this.f27087b.discardDisplayList();
    }

    @Override // p001o.hr5
    /* renamed from: j */
    public void mo30725j(float f) {
        this.f27087b.setElevation(f);
    }

    @Override // p001o.hr5
    /* renamed from: k */
    public void mo30726k(int i) {
        this.f27087b.offsetTopAndBottom(i);
    }

    @Override // p001o.hr5
    /* renamed from: l */
    public void mo30727l(int i) {
        RenderNode renderNode = this.f27087b;
        ro3.C16636a c16636a = ro3.f43882a;
        if (ro3.m47010e(i, c16636a.m47013c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (ro3.m47010e(i, c16636a.m47012b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f27088c = i;
    }

    @Override // p001o.hr5
    /* renamed from: m */
    public boolean mo30728m() {
        return this.f27087b.hasDisplayList();
    }

    @Override // p001o.hr5
    /* renamed from: n */
    public boolean mo30729n() {
        return this.f27087b.getClipToBounds();
    }

    @Override // p001o.hr5
    /* renamed from: o */
    public int mo30730o() {
        return this.f27087b.getTop();
    }

    @Override // p001o.hr5
    /* renamed from: p */
    public void mo30731p(float f) {
        this.f27087b.setScaleX(f);
    }

    @Override // p001o.hr5
    /* renamed from: q */
    public boolean mo30732q() {
        return this.f27087b.getClipToOutline();
    }

    @Override // p001o.hr5
    /* renamed from: r */
    public void mo30733r(float f) {
        this.f27087b.setCameraDistance(f);
    }

    @Override // p001o.hr5
    /* renamed from: s */
    public boolean mo30734s(boolean z) {
        return this.f27087b.setHasOverlappingRendering(z);
    }

    @Override // p001o.hr5
    /* renamed from: t */
    public void mo30735t(float f) {
        this.f27087b.setRotationX(f);
    }

    @Override // p001o.hr5
    /* renamed from: u */
    public void mo30736u(Matrix matrix) {
        sq8.m48649h(matrix, "matrix");
        this.f27087b.getMatrix(matrix);
    }

    @Override // p001o.hr5
    /* renamed from: v */
    public void mo30737v(float f) {
        this.f27087b.setRotationY(f);
    }

    @Override // p001o.hr5
    /* renamed from: w */
    public void mo30738w(int i) {
        this.f27087b.offsetLeftAndRight(i);
    }

    @Override // p001o.hr5
    /* renamed from: x */
    public int mo30739x() {
        return this.f27087b.getBottom();
    }

    @Override // p001o.hr5
    /* renamed from: y */
    public void mo30740y(qie qieVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            jke.f30549a.m33906a(this.f27087b, qieVar);
        }
    }

    @Override // p001o.hr5
    /* renamed from: z */
    public void mo30741z(float f) {
        this.f27087b.setRotationZ(f);
    }
}
