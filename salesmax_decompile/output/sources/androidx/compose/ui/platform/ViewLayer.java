package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p001o.axi;
import p001o.cgc;
import p001o.cxi;
import p001o.gl8;
import p001o.hh9;
import p001o.id5;
import p001o.jvf;
import p001o.kf9;
import p001o.ld0;
import p001o.mc2;
import p001o.ml8;
import p001o.nl7;
import p001o.qc2;
import p001o.qh9;
import p001o.qie;
import p001o.qza;
import p001o.rgc;
import p001o.rh3;
import p001o.ro3;
import p001o.s9c;
import p001o.sq8;
import p001o.tfe;
import p001o.uk7;
import p001o.uuh;
import p001o.vpb;
import p001o.xk7;
import p001o.xkf;
import p001o.xzc;
import p001o.y3i;
import p001o.zl5;

/* loaded from: classes2.dex */
public final class ViewLayer extends View implements rgc {

    /* renamed from: M */
    public static final C1958c f6365M = new C1958c(null);

    /* renamed from: Q */
    public static final nl7 f6366Q = C1957b.f6381a;
    public static final ViewOutlineProvider h0 = new C1956a();
    public static Method i0;
    public static Field j0;
    public static boolean k0;
    public static boolean l0;

    /* renamed from: H */
    public boolean f6367H;

    /* renamed from: L */
    public final long f6368L;

    /* renamed from: a */
    public final AndroidComposeView f6369a;

    /* renamed from: b */
    public final DrawChildContainer f6370b;

    /* renamed from: c */
    public xk7 f6371c;

    /* renamed from: d */
    public uk7 f6372d;

    /* renamed from: e */
    public final cgc f6373e;

    /* renamed from: f */
    public boolean f6374f;

    /* renamed from: g */
    public Rect f6375g;

    /* renamed from: h */
    public boolean f6376h;

    /* renamed from: q */
    public boolean f6377q;

    /* renamed from: s */
    public final qc2 f6378s;

    /* renamed from: x */
    public final hh9 f6379x;

    /* renamed from: y */
    public long f6380y;

    /* renamed from: androidx.compose.ui.platform.ViewLayer$a */
    public static final class C1956a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            sq8.m48649h(view, "view");
            sq8.m48649h(outline, "outline");
            Outline outlineM21187c = ((ViewLayer) view).f6373e.m21187c();
            sq8.m48646e(outlineM21187c);
            outline.set(outlineM21187c);
        }
    }

    /* renamed from: androidx.compose.ui.platform.ViewLayer$b */
    public static final class C1957b extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C1957b f6381a = new C1957b();

        public C1957b() {
            super(2);
        }

        /* renamed from: a */
        public final void m5115a(View view, Matrix matrix) {
            sq8.m48649h(view, "view");
            sq8.m48649h(matrix, "matrix");
            matrix.set(view.getMatrix());
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m5115a((View) obj, (Matrix) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.ViewLayer$c */
    public static final class C1958c {
        public C1958c() {
        }

        public /* synthetic */ C1958c(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final boolean m5116a() {
            return ViewLayer.k0;
        }

        /* renamed from: b */
        public final boolean m5117b() {
            return ViewLayer.l0;
        }

        /* renamed from: c */
        public final void m5118c(boolean z) {
            ViewLayer.l0 = z;
        }

        /* renamed from: d */
        public final void m5119d(View view) {
            sq8.m48649h(view, "view");
            try {
                if (!m5116a()) {
                    ViewLayer.k0 = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.i0 = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.j0 = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.i0 = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.j0 = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.i0;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.j0;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.j0;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.i0;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                m5118c(true);
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.ViewLayer$d */
    public static final class C1959d {

        /* renamed from: a */
        public static final C1959d f6382a = new C1959d();

        /* renamed from: a */
        public static final long m5120a(View view) {
            sq8.m48649h(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, xk7 xk7Var, uk7 uk7Var) {
        super(androidComposeView.getContext());
        sq8.m48649h(androidComposeView, "ownerView");
        sq8.m48649h(drawChildContainer, "container");
        sq8.m48649h(xk7Var, "drawBlock");
        sq8.m48649h(uk7Var, "invalidateParentLayer");
        this.f6369a = androidComposeView;
        this.f6370b = drawChildContainer;
        this.f6371c = xk7Var;
        this.f6372d = uk7Var;
        this.f6373e = new cgc(androidComposeView.getDensity());
        this.f6378s = new qc2();
        this.f6379x = new hh9(f6366Q);
        this.f6380y = uuh.f49519a.m52046a();
        this.f6367H = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.f6368L = View.generateViewId();
    }

    private final xzc getManualClipPath() {
        if (!getClipToOutline() || this.f6373e.m21188d()) {
            return null;
        }
        return this.f6373e.m21186b();
    }

    private final void setInvalidated(boolean z) {
        if (z != this.f6376h) {
            this.f6376h = z;
            this.f6369a.b0(this, z);
        }
    }

    @Override // p001o.rgc
    /* renamed from: a */
    public void mo5102a(xk7 xk7Var, uk7 uk7Var) {
        sq8.m48649h(xk7Var, "drawBlock");
        sq8.m48649h(uk7Var, "invalidateParentLayer");
        this.f6370b.addView(this);
        this.f6374f = false;
        this.f6377q = false;
        this.f6380y = uuh.f49519a.m52046a();
        this.f6371c = xk7Var;
        this.f6372d = uk7Var;
    }

    @Override // p001o.rgc
    /* renamed from: b */
    public void mo5103b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, xkf xkfVar, boolean z, qie qieVar, long j2, long j3, int i, qh9 qh9Var, zl5 zl5Var) {
        uk7 uk7Var;
        sq8.m48649h(xkfVar, "shape");
        sq8.m48649h(qh9Var, "layoutDirection");
        sq8.m48649h(zl5Var, "density");
        this.f6380y = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(uuh.m52044d(this.f6380y) * getWidth());
        setPivotY(uuh.m52045e(this.f6380y) * getHeight());
        setCameraDistancePx(f10);
        boolean z2 = true;
        this.f6374f = z && xkfVar == tfe.m49810a();
        m5113u();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && xkfVar != tfe.m49810a());
        boolean zM21191g = this.f6373e.m21191g(xkfVar, getAlpha(), getClipToOutline(), getElevation(), qh9Var, zl5Var);
        m5114v();
        boolean z4 = getManualClipPath() != null;
        if (z3 != z4 || (z4 && zM21191g)) {
            invalidate();
        }
        if (!this.f6377q && getElevation() > 0.0f && (uk7Var = this.f6372d) != null) {
            uk7Var.invoke();
        }
        this.f6379x.m30464c();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            axi axiVar = axi.f15359a;
            axiVar.m17961a(this, rh3.m46769d(j2));
            axiVar.m17962b(this, rh3.m46769d(j3));
        }
        if (i2 >= 31) {
            cxi.f18824a.m22048a(this, qieVar);
        }
        ro3.C16636a c16636a = ro3.f43882a;
        if (ro3.m47010e(i, c16636a.m47013c())) {
            setLayerType(2, null);
        } else if (ro3.m47010e(i, c16636a.m47012b())) {
            setLayerType(0, null);
            z2 = false;
        } else {
            setLayerType(0, null);
        }
        this.f6367H = z2;
    }

    @Override // p001o.rgc
    /* renamed from: c */
    public long mo5104c(long j, boolean z) {
        if (!z) {
            return qza.m45994c(this.f6379x.m30463b(this), j);
        }
        float[] fArrM30462a = this.f6379x.m30462a(this);
        return fArrM30462a != null ? qza.m45994c(fArrM30462a, j) : s9c.f45035b.m48061a();
    }

    @Override // p001o.rgc
    /* renamed from: d */
    public void mo5105d(long j) {
        int iM39312e = ml8.m39312e(j);
        int iM39311d = ml8.m39311d(j);
        if (iM39312e == getWidth() && iM39311d == getHeight()) {
            return;
        }
        float f = iM39312e;
        setPivotX(uuh.m52044d(this.f6380y) * f);
        float f2 = iM39311d;
        setPivotY(uuh.m52045e(this.f6380y) * f2);
        this.f6373e.m21192h(jvf.m34585a(f, f2));
        m5114v();
        layout(getLeft(), getTop(), getLeft() + iM39312e, getTop() + iM39311d);
        m5113u();
        this.f6379x.m30464c();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        qc2 qc2Var = this.f6378s;
        Canvas canvasM36964m = qc2Var.m45083a().m36964m();
        qc2Var.m45083a().m36965n(canvas);
        ld0 ld0VarM45083a = qc2Var.m45083a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            ld0VarM45083a.mo20336g();
            this.f6373e.m21185a(ld0VarM45083a);
            z = true;
        }
        xk7 xk7Var = this.f6371c;
        if (xk7Var != null) {
            xk7Var.invoke(ld0VarM45083a);
        }
        if (z) {
            ld0VarM45083a.mo20334d();
        }
        qc2Var.m45083a().m36965n(canvasM36964m);
    }

    @Override // p001o.rgc
    /* renamed from: e */
    public void mo5106e(mc2 mc2Var) {
        sq8.m48649h(mc2Var, "canvas");
        boolean z = getElevation() > 0.0f;
        this.f6377q = z;
        if (z) {
            mc2Var.mo20335e();
        }
        this.f6370b.m5092a(mc2Var, this, getDrawingTime());
        if (this.f6377q) {
            mc2Var.mo20337h();
        }
    }

    @Override // p001o.rgc
    /* renamed from: f */
    public void mo5107f() {
        setInvalidated(false);
        this.f6369a.i0();
        this.f6371c = null;
        this.f6372d = null;
        this.f6369a.g0(this);
        this.f6370b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // p001o.rgc
    /* renamed from: g */
    public boolean mo5108g(long j) {
        float fM48052k = s9c.m48052k(j);
        float fM48053l = s9c.m48053l(j);
        if (this.f6374f) {
            return 0.0f <= fM48052k && fM48052k < ((float) getWidth()) && 0.0f <= fM48053l && fM48053l < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f6373e.m21189e(j);
        }
        return true;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.f6370b;
    }

    public long getLayerId() {
        return this.f6368L;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f6369a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1959d.m5120a(this.f6369a);
        }
        return -1L;
    }

    @Override // p001o.rgc
    /* renamed from: h */
    public void mo5109h(vpb vpbVar, boolean z) {
        sq8.m48649h(vpbVar, "rect");
        if (!z) {
            qza.m45995d(this.f6379x.m30463b(this), vpbVar);
            return;
        }
        float[] fArrM30462a = this.f6379x.m30462a(this);
        if (fArrM30462a != null) {
            qza.m45995d(fArrM30462a, vpbVar);
        } else {
            vpbVar.m53186g(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f6367H;
    }

    @Override // p001o.rgc
    /* renamed from: i */
    public void mo5110i(long j) {
        int iM29001f = gl8.m29001f(j);
        if (iM29001f != getLeft()) {
            offsetLeftAndRight(iM29001f - getLeft());
            this.f6379x.m30464c();
        }
        int iM29002g = gl8.m29002g(j);
        if (iM29002g != getTop()) {
            offsetTopAndBottom(iM29002g - getTop());
            this.f6379x.m30464c();
        }
    }

    @Override // android.view.View, p001o.rgc
    public void invalidate() {
        if (this.f6376h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f6369a.invalidate();
    }

    @Override // p001o.rgc
    /* renamed from: j */
    public void mo5111j() {
        if (!this.f6376h || l0) {
            return;
        }
        setInvalidated(false);
        f6365M.m5119d(this);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    /* renamed from: t */
    public final boolean m5112t() {
        return this.f6376h;
    }

    /* renamed from: u */
    public final void m5113u() {
        Rect rect;
        if (this.f6374f) {
            Rect rect2 = this.f6375g;
            if (rect2 == null) {
                this.f6375g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                sq8.m48646e(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f6375g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    /* renamed from: v */
    public final void m5114v() {
        setOutlineProvider(this.f6373e.m21187c() != null ? h0 : null);
    }
}
