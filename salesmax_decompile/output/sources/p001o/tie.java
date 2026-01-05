package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import p001o.ro3;

/* loaded from: classes2.dex */
public final class tie implements hr5 {

    /* renamed from: j */
    public static boolean f47208j;

    /* renamed from: a */
    public final AndroidComposeView f47210a;

    /* renamed from: b */
    public final RenderNode f47211b;

    /* renamed from: c */
    public int f47212c;

    /* renamed from: d */
    public int f47213d;

    /* renamed from: e */
    public int f47214e;

    /* renamed from: f */
    public int f47215f;

    /* renamed from: g */
    public int f47216g;

    /* renamed from: h */
    public boolean f47217h;

    /* renamed from: i */
    public static final C17127a f47207i = new C17127a(null);

    /* renamed from: k */
    public static boolean f47209k = true;

    /* renamed from: o.tie$a */
    public static final class C17127a {
        public C17127a() {
        }

        public /* synthetic */ C17127a(id5 id5Var) {
            this();
        }
    }

    public tie(AndroidComposeView androidComposeView) {
        sq8.m48649h(androidComposeView, "ownerView");
        this.f47210a = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        sq8.m48648g(renderNodeCreate, "create(\"Compose\", ownerView)");
        this.f47211b = renderNodeCreate;
        this.f47212c = ro3.f43882a.m47011a();
        if (f47209k) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            m49938P(renderNodeCreate);
            m49933K();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f47209k = false;
        }
        if (f47208j) {
            throw new NoClassDefFoundError();
        }
    }

    @Override // p001o.hr5
    /* renamed from: A */
    public void mo30706A(float f) {
        this.f47211b.setPivotX(f);
    }

    @Override // p001o.hr5
    /* renamed from: B */
    public void mo30707B(float f) {
        this.f47211b.setPivotY(f);
    }

    @Override // p001o.hr5
    /* renamed from: C */
    public void mo30708C(float f) {
        this.f47211b.setScaleY(f);
    }

    @Override // p001o.hr5
    /* renamed from: D */
    public void mo30709D(Outline outline) {
        this.f47211b.setOutline(outline);
    }

    @Override // p001o.hr5
    /* renamed from: E */
    public void mo30710E(qc2 qc2Var, xzc xzcVar, xk7 xk7Var) {
        sq8.m48649h(qc2Var, "canvasHolder");
        sq8.m48649h(xk7Var, "drawBlock");
        DisplayListCanvas displayListCanvasStart = this.f47211b.start(getWidth(), getHeight());
        sq8.m48648g(displayListCanvasStart, "renderNode.start(width, height)");
        Canvas canvasM36964m = qc2Var.m45083a().m36964m();
        qc2Var.m45083a().m36965n((Canvas) displayListCanvasStart);
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
        this.f47211b.end(displayListCanvasStart);
    }

    @Override // p001o.hr5
    /* renamed from: F */
    public void mo30711F(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            mke.f35628a.m39296c(this.f47211b, i);
        }
    }

    @Override // p001o.hr5
    /* renamed from: G */
    public void mo30712G(float f) {
        this.f47211b.setTranslationX(f);
    }

    @Override // p001o.hr5
    /* renamed from: H */
    public void mo30713H(boolean z) {
        this.f47211b.setClipToOutline(z);
    }

    @Override // p001o.hr5
    /* renamed from: I */
    public void mo30714I(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            mke.f35628a.m39297d(this.f47211b, i);
        }
    }

    @Override // p001o.hr5
    /* renamed from: J */
    public float mo30715J() {
        return this.f47211b.getElevation();
    }

    /* renamed from: K */
    public final void m49933K() {
        lke.f33964a.m37390a(this.f47211b);
    }

    /* renamed from: L */
    public void m49934L(int i) {
        this.f47216g = i;
    }

    /* renamed from: M */
    public void m49935M(int i) {
        this.f47213d = i;
    }

    /* renamed from: N */
    public void m49936N(int i) {
        this.f47215f = i;
    }

    /* renamed from: O */
    public void m49937O(int i) {
        this.f47214e = i;
    }

    /* renamed from: P */
    public final void m49938P(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            mke mkeVar = mke.f35628a;
            mkeVar.m39296c(renderNode, mkeVar.m39294a(renderNode));
            mkeVar.m39297d(renderNode, mkeVar.m39295b(renderNode));
        }
    }

    @Override // p001o.hr5
    /* renamed from: a */
    public int mo30716a() {
        return this.f47213d;
    }

    @Override // p001o.hr5
    /* renamed from: b */
    public float mo30717b() {
        return this.f47211b.getAlpha();
    }

    @Override // p001o.hr5
    /* renamed from: c */
    public void mo30718c(float f) {
        this.f47211b.setAlpha(f);
    }

    @Override // p001o.hr5
    /* renamed from: d */
    public int mo30719d() {
        return this.f47215f;
    }

    @Override // p001o.hr5
    /* renamed from: e */
    public void mo30720e(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f47211b);
    }

    @Override // p001o.hr5
    /* renamed from: f */
    public void mo30721f(float f) {
        this.f47211b.setTranslationY(f);
    }

    @Override // p001o.hr5
    /* renamed from: g */
    public void mo30722g(boolean z) {
        this.f47217h = z;
        this.f47211b.setClipToBounds(z);
    }

    @Override // p001o.hr5
    public int getHeight() {
        return mo30739x() - mo30730o();
    }

    @Override // p001o.hr5
    public int getWidth() {
        return mo30719d() - mo30716a();
    }

    @Override // p001o.hr5
    /* renamed from: h */
    public boolean mo30723h(int i, int i2, int i3, int i4) {
        m49935M(i);
        m49937O(i2);
        m49936N(i3);
        m49934L(i4);
        return this.f47211b.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p001o.hr5
    /* renamed from: i */
    public void mo30724i() {
        m49933K();
    }

    @Override // p001o.hr5
    /* renamed from: j */
    public void mo30725j(float f) {
        this.f47211b.setElevation(f);
    }

    @Override // p001o.hr5
    /* renamed from: k */
    public void mo30726k(int i) {
        m49937O(mo30730o() + i);
        m49934L(mo30739x() + i);
        this.f47211b.offsetTopAndBottom(i);
    }

    @Override // p001o.hr5
    /* renamed from: l */
    public void mo30727l(int i) {
        ro3.C16636a c16636a = ro3.f43882a;
        if (ro3.m47010e(i, c16636a.m47013c())) {
            this.f47211b.setLayerType(2);
            this.f47211b.setHasOverlappingRendering(true);
        } else if (ro3.m47010e(i, c16636a.m47012b())) {
            this.f47211b.setLayerType(0);
            this.f47211b.setHasOverlappingRendering(false);
        } else {
            this.f47211b.setLayerType(0);
            this.f47211b.setHasOverlappingRendering(true);
        }
        this.f47212c = i;
    }

    @Override // p001o.hr5
    /* renamed from: m */
    public boolean mo30728m() {
        return this.f47211b.isValid();
    }

    @Override // p001o.hr5
    /* renamed from: n */
    public boolean mo30729n() {
        return this.f47217h;
    }

    @Override // p001o.hr5
    /* renamed from: o */
    public int mo30730o() {
        return this.f47214e;
    }

    @Override // p001o.hr5
    /* renamed from: p */
    public void mo30731p(float f) {
        this.f47211b.setScaleX(f);
    }

    @Override // p001o.hr5
    /* renamed from: q */
    public boolean mo30732q() {
        return this.f47211b.getClipToOutline();
    }

    @Override // p001o.hr5
    /* renamed from: r */
    public void mo30733r(float f) {
        this.f47211b.setCameraDistance(-f);
    }

    @Override // p001o.hr5
    /* renamed from: s */
    public boolean mo30734s(boolean z) {
        return this.f47211b.setHasOverlappingRendering(z);
    }

    @Override // p001o.hr5
    /* renamed from: t */
    public void mo30735t(float f) {
        this.f47211b.setRotationX(f);
    }

    @Override // p001o.hr5
    /* renamed from: u */
    public void mo30736u(Matrix matrix) {
        sq8.m48649h(matrix, "matrix");
        this.f47211b.getMatrix(matrix);
    }

    @Override // p001o.hr5
    /* renamed from: v */
    public void mo30737v(float f) {
        this.f47211b.setRotationY(f);
    }

    @Override // p001o.hr5
    /* renamed from: w */
    public void mo30738w(int i) {
        m49935M(mo30716a() + i);
        m49936N(mo30719d() + i);
        this.f47211b.offsetLeftAndRight(i);
    }

    @Override // p001o.hr5
    /* renamed from: x */
    public int mo30739x() {
        return this.f47216g;
    }

    @Override // p001o.hr5
    /* renamed from: y */
    public void mo30740y(qie qieVar) {
    }

    @Override // p001o.hr5
    /* renamed from: z */
    public void mo30741z(float f) {
        this.f47211b.setRotation(f);
    }
}
