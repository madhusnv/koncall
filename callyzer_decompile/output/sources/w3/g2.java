package w3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import d3.C1549c;
import d3.C1564r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g2 implements m1 {

    /* renamed from: g */
    public static boolean f37791g = true;

    /* renamed from: a */
    public final RenderNode f37792a;

    /* renamed from: b */
    public int f37793b;

    /* renamed from: c */
    public int f37794c;

    /* renamed from: d */
    public int f37795d;

    /* renamed from: e */
    public int f37796e;

    /* renamed from: f */
    public boolean f37797f;

    public g2(C7904v c7904v) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", c7904v);
        this.f37792a = renderNodeCreate;
        if (f37791g) {
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
            if (Build.VERSION.SDK_INT >= 28) {
                l2.m14979c(renderNodeCreate, l2.m14977a(renderNodeCreate));
                l2.m14980d(renderNodeCreate, l2.m14978b(renderNodeCreate));
            }
            k2.m14973a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f37791g = false;
        }
    }

    @Override // w3.m1
    /* renamed from: A */
    public final boolean mo14917A() {
        return this.f37792a.setHasOverlappingRendering(true);
    }

    @Override // w3.m1
    /* renamed from: B */
    public final void mo14918B(C1564r c1564r, d3.g0 g0Var, h1.d1 d1Var) {
        Canvas canvasStart = this.f37792a.start(mo14929b(), getHeight());
        C1549c c1549c = c1564r.f7808a;
        Canvas canvas = c1549c.f7733a;
        c1549c.f7733a = canvasStart;
        if (g0Var != null) {
            c1549c.mo5107i();
            c1549c.mo5110l(g0Var);
        }
        d1Var.invoke(c1549c);
        if (g0Var != null) {
            c1549c.mo5113o();
        }
        c1564r.f7808a.f7733a = canvas;
        this.f37792a.end(canvasStart);
    }

    @Override // w3.m1
    /* renamed from: C */
    public final boolean mo14919C() {
        return this.f37797f;
    }

    @Override // w3.m1
    /* renamed from: D */
    public final int mo14920D() {
        return this.f37794c;
    }

    @Override // w3.m1
    /* renamed from: E */
    public final void mo14921E(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            l2.m14979c(this.f37792a, i10);
        }
    }

    @Override // w3.m1
    /* renamed from: F */
    public final int mo14922F() {
        return this.f37795d;
    }

    @Override // w3.m1
    /* renamed from: G */
    public final boolean mo14923G() {
        return this.f37792a.getClipToOutline();
    }

    @Override // w3.m1
    /* renamed from: H */
    public final void mo14924H(boolean z6) {
        this.f37792a.setClipToOutline(z6);
    }

    @Override // w3.m1
    /* renamed from: I */
    public final void mo14925I(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            l2.m14980d(this.f37792a, i10);
        }
    }

    @Override // w3.m1
    /* renamed from: J */
    public final void mo14926J(Matrix matrix) {
        this.f37792a.getMatrix(matrix);
    }

    @Override // w3.m1
    /* renamed from: K */
    public final float mo14927K() {
        return this.f37792a.getElevation();
    }

    @Override // w3.m1
    /* renamed from: a */
    public final float mo14928a() {
        return this.f37792a.getAlpha();
    }

    @Override // w3.m1
    /* renamed from: b */
    public final int mo14929b() {
        return this.f37795d - this.f37793b;
    }

    @Override // w3.m1
    /* renamed from: c */
    public final void mo14930c(float f6) {
        this.f37792a.setRotationY(f6);
    }

    @Override // w3.m1
    /* renamed from: d */
    public final void mo14931d(float f6) {
        this.f37792a.setRotation(f6);
    }

    @Override // w3.m1
    /* renamed from: e */
    public final void mo14932e(float f6) {
        this.f37792a.setTranslationY(f6);
    }

    @Override // w3.m1
    /* renamed from: f */
    public final void mo14933f() {
        k2.m14973a(this.f37792a);
    }

    @Override // w3.m1
    /* renamed from: g */
    public final void mo14934g(float f6) {
        this.f37792a.setScaleY(f6);
    }

    @Override // w3.m1
    public final int getHeight() {
        return this.f37796e - this.f37794c;
    }

    @Override // w3.m1
    /* renamed from: h */
    public final boolean mo14935h() {
        return this.f37792a.isValid();
    }

    @Override // w3.m1
    /* renamed from: i */
    public final void mo14936i(float f6) {
        this.f37792a.setAlpha(f6);
    }

    @Override // w3.m1
    /* renamed from: j */
    public final void mo14937j(float f6) {
        this.f37792a.setScaleX(f6);
    }

    @Override // w3.m1
    /* renamed from: k */
    public final void mo14938k(float f6) {
        this.f37792a.setTranslationX(f6);
    }

    @Override // w3.m1
    /* renamed from: l */
    public final void mo14939l(float f6) {
        this.f37792a.setCameraDistance(-f6);
    }

    @Override // w3.m1
    /* renamed from: m */
    public final void mo14940m(float f6) {
        this.f37792a.setRotationX(f6);
    }

    @Override // w3.m1
    /* renamed from: n */
    public final void mo14941n(int i10) {
        this.f37793b += i10;
        this.f37795d += i10;
        this.f37792a.offsetLeftAndRight(i10);
    }

    @Override // w3.m1
    /* renamed from: o */
    public final int mo14942o() {
        return this.f37796e;
    }

    @Override // w3.m1
    /* renamed from: q */
    public final void mo14944q(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f37792a);
    }

    @Override // w3.m1
    /* renamed from: r */
    public final int mo14945r() {
        return this.f37793b;
    }

    @Override // w3.m1
    /* renamed from: s */
    public final void mo14946s(float f6) {
        this.f37792a.setPivotX(f6);
    }

    @Override // w3.m1
    /* renamed from: t */
    public final void mo14947t(boolean z6) {
        this.f37797f = z6;
        this.f37792a.setClipToBounds(z6);
    }

    @Override // w3.m1
    /* renamed from: u */
    public final boolean mo14948u(int i10, int i11, int i12, int i13) {
        this.f37793b = i10;
        this.f37794c = i11;
        this.f37795d = i12;
        this.f37796e = i13;
        return this.f37792a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // w3.m1
    /* renamed from: v */
    public final void mo14949v(float f6) {
        this.f37792a.setPivotY(f6);
    }

    @Override // w3.m1
    /* renamed from: w */
    public final void mo14950w(float f6) {
        this.f37792a.setElevation(f6);
    }

    @Override // w3.m1
    /* renamed from: x */
    public final void mo14951x(int i10) {
        this.f37794c += i10;
        this.f37796e += i10;
        this.f37792a.offsetTopAndBottom(i10);
    }

    @Override // w3.m1
    /* renamed from: y */
    public final void mo14952y(int i10) {
        if (i10 == 1) {
            this.f37792a.setLayerType(2);
            this.f37792a.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            this.f37792a.setLayerType(0);
            this.f37792a.setHasOverlappingRendering(false);
        } else {
            this.f37792a.setLayerType(0);
            this.f37792a.setHasOverlappingRendering(true);
        }
    }

    @Override // w3.m1
    /* renamed from: z */
    public final void mo14953z(Outline outline) {
        this.f37792a.setOutline(outline);
    }

    @Override // w3.m1
    /* renamed from: p */
    public final void mo14943p() {
    }
}
