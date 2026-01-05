package a1;

import al.C0174b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import c0.c2;
import c0.g1;
import c0.j1;
import c0.t0;
import c0.x1;
import c1.AbstractC0845a;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import d1.C1546a;
import d7.g0;
import j0.AbstractC3506f;
import java.util.concurrent.atomic.AtomicReference;
import nf.C5047i;
import og.u1;
import pg.o7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.q */
/* loaded from: classes.dex */
public final class C0018q extends FrameLayout {

    /* renamed from: n */
    public static final EnumC0015n f70n = EnumC0015n.PERFORMANCE;

    /* renamed from: a */
    public EnumC0015n f71a;

    /* renamed from: b */
    public AbstractC0019r f72b;

    /* renamed from: c */
    public final C0023v f73c;

    /* renamed from: d */
    public final C0009h f74d;

    /* renamed from: e */
    public boolean f75e;

    /* renamed from: f */
    public final g0 f76f;

    /* renamed from: g */
    public final AtomicReference f77g;

    /* renamed from: h */
    public final C0020s f78h;

    /* renamed from: j */
    public i0.e0 f79j;

    /* renamed from: k */
    public final C0014m f80k;

    /* renamed from: l */
    public final ViewOnLayoutChangeListenerC0010i f81l;

    /* renamed from: m */
    public final C5047i f82m;

    /* JADX WARN: Type inference failed for: r1v5, types: [a1.i] */
    public C0018q(Context context) {
        super(context, null, 0, 0);
        EnumC0015n enumC0015n = f70n;
        this.f71a = enumC0015n;
        C0009h c0009h = new C0009h();
        c0009h.f59h = C0009h.f51i;
        this.f74d = c0009h;
        this.f75e = true;
        this.f76f = new g0(EnumC0017p.IDLE);
        this.f77g = new AtomicReference();
        this.f78h = new C0020s(c0009h);
        this.f80k = new C0014m(this);
        this.f81l = new View.OnLayoutChangeListener() { // from class: a1.i
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
                    return;
                }
                C0018q c0018q = this.f60a;
                c0018q.m99a();
                o7.m11806a();
                c0018q.getViewPort();
            }
        };
        this.f82m = new C5047i(1, this);
        o7.m11806a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = AbstractC0021t.f89a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        v0.m2527i(this, context, iArr, null, typedArrayObtainStyledAttributes, 0);
        try {
            setScaleType(EnumC0016o.fromId(typedArrayObtainStyledAttributes.getInteger(1, c0009h.f59h.getId())));
            setImplementationMode(EnumC0015n.fromId(typedArrayObtainStyledAttributes.getInteger(0, enumC0015n.getId())));
            typedArrayObtainStyledAttributes.recycle();
            new C0174b(context, new C0011j(0));
            if (getBackground() == null) {
                setBackgroundColor(getContext().getColor(R.color.black));
            }
            C0023v c0023v = new C0023v(context, null, 0, 0);
            c0023v.setBackgroundColor(-1);
            c0023v.setAlpha(DefinitionKt.NO_Float_VALUE);
            c0023v.setElevation(Float.MAX_VALUE);
            this.f73c = c0023v;
            c0023v.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* renamed from: b */
    public static boolean m98b(x1 x1Var, EnumC0015n enumC0015n) {
        boolean zEquals = x1Var.f5261d.mo7319q().mo7328k().equals("androidx.camera.camera2.legacy");
        boolean z6 = (AbstractC0845a.f5346a.m5729g(SurfaceViewStretchedQuirk.class) == null && AbstractC0845a.f5346a.m5729g(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !zEquals && !z6) {
            int iOrdinal = enumC0015n.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Invalid implementation mode: " + enumC0015n);
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private t0 getScreenFlashInternal() {
        return this.f73c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i10;
    }

    private void setScreenFlashUiInfo(t0 t0Var) {
        u1.m10942a("PreviewView");
    }

    /* renamed from: a */
    public final void m99a() {
        Rect rect;
        Display defaultDisplay;
        i0.e0 e0Var;
        o7.m11806a();
        if (this.f72b != null) {
            if (this.f75e && (defaultDisplay = getDefaultDisplay()) != null && (e0Var = this.f79j) != null) {
                C0009h c0009h = this.f74d;
                int iMo7329l = e0Var.mo7329l(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (c0009h.f58g) {
                    c0009h.f54c = iMo7329l;
                    c0009h.f56e = rotation;
                }
            }
            this.f72b.m102h();
        }
        C0020s c0020s = this.f78h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        c0020s.getClass();
        o7.m11806a();
        synchronized (c0020s) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = c0020s.f88b) != null) {
                    c0020s.f87a.m90a(size, layoutDirection, rect);
                }
            } finally {
            }
        }
    }

    public Bitmap getBitmap() {
        o7.m11806a();
        AbstractC0019r abstractC0019r = this.f72b;
        if (abstractC0019r == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) abstractC0019r.f85c;
        Bitmap bitmapMo9d = abstractC0019r.mo9d();
        if (bitmapMo9d == null) {
            return null;
        }
        C0009h c0009h = (C0009h) abstractC0019r.f86d;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!c0009h.m95f()) {
            return bitmapMo9d;
        }
        Matrix matrixM93d = c0009h.m93d();
        RectF rectFM94e = c0009h.m94e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapMo9d.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixM93d);
        matrix.postScale(rectFM94e.width() / c0009h.f52a.getWidth(), rectFM94e.height() / c0009h.f52a.getHeight());
        matrix.postTranslate(rectFM94e.left, rectFM94e.top);
        canvas.drawBitmap(bitmapMo9d, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public AbstractC0002a getController() {
        o7.m11806a();
        return null;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public EnumC0015n getImplementationMode() {
        o7.m11806a();
        return this.f71a;
    }

    public g1 getMeteringPointFactory() {
        o7.m11806a();
        return this.f78h;
    }

    public C1546a getOutputTransform() {
        Matrix matrixM92c;
        C0009h c0009h = this.f74d;
        o7.m11806a();
        try {
            matrixM92c = c0009h.m92c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixM92c = null;
        }
        Rect rect = c0009h.f53b;
        if (matrixM92c == null || rect == null) {
            u1.m10942a("PreviewView");
            return null;
        }
        RectF rectF = AbstractC3506f.f18377a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(AbstractC3506f.f18377a, rectF2, Matrix.ScaleToFit.FILL);
        matrixM92c.preConcat(matrix);
        if (this.f72b instanceof f0) {
            matrixM92c.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            u1.m10951j("PreviewView");
        }
        new Size(rect.width(), rect.height());
        return new C1546a();
    }

    public d7.d0 getPreviewStreamState() {
        return this.f76f;
    }

    public EnumC0016o getScaleType() {
        o7.m11806a();
        return this.f74d.f59h;
    }

    public t0 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        o7.m11806a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        C0009h c0009h = this.f74d;
        if (!c0009h.m95f()) {
            return null;
        }
        Matrix matrix = new Matrix(c0009h.f55d);
        matrix.postConcat(c0009h.m92c(size, layoutDirection));
        return matrix;
    }

    public j1 getSurfaceProvider() {
        o7.m11806a();
        return this.f82m;
    }

    public c2 getViewPort() {
        o7.m11806a();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        defaultDisplay.getRotation();
        o7.m11806a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new c2();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.f80k, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f81l);
        AbstractC0019r abstractC0019r = this.f72b;
        if (abstractC0019r != null) {
            abstractC0019r.mo10e();
        }
        o7.m11806a();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f81l);
        AbstractC0019r abstractC0019r = this.f72b;
        if (abstractC0019r != null) {
            abstractC0019r.mo11f();
        }
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f80k);
    }

    public void setController(AbstractC0002a abstractC0002a) {
        o7.m11806a();
        o7.m11806a();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(EnumC0015n enumC0015n) {
        o7.m11806a();
        this.f71a = enumC0015n;
        EnumC0015n enumC0015n2 = EnumC0015n.PERFORMANCE;
    }

    public void setScaleType(EnumC0016o enumC0016o) {
        o7.m11806a();
        this.f74d.f59h = enumC0016o;
        m99a();
        o7.m11806a();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i10) {
        this.f73c.setBackgroundColor(i10);
    }

    public void setScreenFlashWindow(Window window) {
        o7.m11806a();
        this.f73c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
