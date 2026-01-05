package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.AbstractC1908c;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.AbstractC2145n;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001o.a92;
import p001o.ahd;
import p001o.bgg;
import p001o.c64;
import p001o.ec3;
import p001o.elh;
import p001o.eyi;
import p001o.feb;
import p001o.hfj;
import p001o.hpb;
import p001o.kbe;
import p001o.lhd;
import p001o.ogc;
import p001o.sc8;
import p001o.u92;
import p001o.v92;
import p001o.wja;
import p001o.wuh;
import p001o.wvi;
import p001o.yq5;

/* loaded from: classes2.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: Q */
    public static final EnumC1900c f6133Q = EnumC1900c.PERFORMANCE;

    /* renamed from: H */
    public final C1899b f6134H;

    /* renamed from: L */
    public final View.OnLayoutChangeListener f6135L;

    /* renamed from: M */
    public final ahd.InterfaceC12175c f6136M;

    /* renamed from: a */
    public EnumC1900c f6137a;

    /* renamed from: b */
    public AbstractC1908c f6138b;

    /* renamed from: c */
    public final ScreenFlashView f6139c;

    /* renamed from: d */
    public final C1907b f6140d;

    /* renamed from: e */
    public boolean f6141e;

    /* renamed from: f */
    public final hpb f6142f;

    /* renamed from: g */
    public final AtomicReference f6143g;

    /* renamed from: h */
    public Executor f6144h;

    /* renamed from: q */
    public lhd f6145q;

    /* renamed from: s */
    public final hfj f6146s;

    /* renamed from: x */
    public u92 f6147x;

    /* renamed from: y */
    public MotionEvent f6148y;

    /* renamed from: androidx.camera.view.PreviewView$a */
    public class C1898a implements ahd.InterfaceC12175c {
        public C1898a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m4736e(bgg bggVar) {
            PreviewView.this.f6136M.mo4739a(bggVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void m4737f(v92 v92Var, bgg bggVar, bgg.AbstractC12390h abstractC12390h) {
            boolean z;
            PreviewView previewView;
            AbstractC1908c abstractC1908c;
            wja.m54627a("PreviewView", "Preview transformation info updated. " + abstractC12390h);
            Integer numValueOf = Integer.valueOf(v92Var.mo26122j().mo38382d());
            if (numValueOf != null) {
                if (numValueOf.intValue() != 0) {
                    z = false;
                }
                PreviewView.this.f6140d.m4780r(abstractC12390h, bggVar.m18930o(), z);
                if (abstractC12390h.mo18946d() != -1 || ((abstractC1908c = (previewView = PreviewView.this).f6138b) != null && (abstractC1908c instanceof C1909d))) {
                    PreviewView.this.f6141e = true;
                } else {
                    previewView.f6141e = false;
                }
                PreviewView.this.m4729e();
            }
            wja.m54638l("PreviewView", "The lens facing is null, probably an external.");
            z = true;
            PreviewView.this.f6140d.m4780r(abstractC12390h, bggVar.m18930o(), z);
            if (abstractC12390h.mo18946d() != -1) {
                PreviewView.this.f6141e = true;
            }
            PreviewView.this.m4729e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m4738g(C1906a c1906a, v92 v92Var) {
            if (ec3.m24748a(PreviewView.this.f6143g, c1906a, null)) {
                c1906a.m4759l(EnumC1903f.IDLE);
            }
            c1906a.m4756f();
            v92Var.mo26125n().mo24339b(c1906a);
        }

        @Override // p001o.ahd.InterfaceC12175c
        /* renamed from: a */
        public void mo4739a(final bgg bggVar) {
            AbstractC1908c c1909d;
            if (!elh.m25222c()) {
                c64.getMainExecutor(PreviewView.this.getContext()).execute(new Runnable() { // from class: o.ihd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28682a.m4736e(bggVar);
                    }
                });
                return;
            }
            wja.m54627a("PreviewView", "Surface requested by Preview.");
            final v92 v92VarM18927l = bggVar.m18927l();
            PreviewView.this.f6147x = v92VarM18927l.mo26122j();
            PreviewView.this.f6145q.m37223c(v92VarM18927l.mo26115c().mo37112d());
            bggVar.m18922C(c64.getMainExecutor(PreviewView.this.getContext()), new bgg.InterfaceC12391i() { // from class: o.jhd
                @Override // p001o.bgg.InterfaceC12391i
                /* renamed from: a */
                public final void mo18949a(bgg.AbstractC12390h abstractC12390h) {
                    this.f30453a.m4737f(v92VarM18927l, bggVar, abstractC12390h);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.m4725f(previewView.f6138b, bggVar, previewView.f6137a)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.m4726g(bggVar, previewView2.f6137a)) {
                    PreviewView previewView3 = PreviewView.this;
                    c1909d = new C1910e(previewView3, previewView3.f6140d);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    c1909d = new C1909d(previewView4, previewView4.f6140d);
                }
                previewView2.f6138b = c1909d;
            }
            u92 u92VarMo26122j = v92VarM18927l.mo26122j();
            PreviewView previewView5 = PreviewView.this;
            final C1906a c1906a = new C1906a(u92VarMo26122j, previewView5.f6142f, previewView5.f6138b);
            PreviewView.this.f6143g.set(c1906a);
            v92VarM18927l.mo26125n().mo24338a(c64.getMainExecutor(PreviewView.this.getContext()), c1906a);
            PreviewView.this.f6138b.mo4788g(bggVar, new AbstractC1908c.a() { // from class: o.khd
                @Override // androidx.camera.view.AbstractC1908c.a
                /* renamed from: a */
                public final void mo4792a() {
                    this.f32253a.m4738g(c1906a, v92VarM18927l);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f6139c) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f6139c);
            }
            PreviewView.this.getClass();
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$b */
    public class C1899b implements DisplayManager.DisplayListener {
        public C1899b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i) {
                return;
            }
            PreviewView.this.m4729e();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$c */
    public enum EnumC1900c {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        EnumC1900c(int i) {
            this.mId = i;
        }

        public static EnumC1900c fromId(int i) {
            for (EnumC1900c enumC1900c : values()) {
                if (enumC1900c.mId == i) {
                    return enumC1900c;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i);
        }

        public int getId() {
            return this.mId;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$d */
    public interface InterfaceC1901d {
    }

    /* renamed from: androidx.camera.view.PreviewView$e */
    public enum EnumC1902e {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        EnumC1902e(int i) {
            this.mId = i;
        }

        public static EnumC1902e fromId(int i) {
            for (EnumC1902e enumC1902e : values()) {
                if (enumC1902e.mId == i) {
                    return enumC1902e;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i);
        }

        public int getId() {
            return this.mId;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$f */
    public enum EnumC1903f {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m4724d(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if ((i3 - i == i7 - i5 && i4 - i2 == i8 - i6) ? false : true) {
            m4729e();
            m4727b(true);
        }
    }

    /* renamed from: f */
    public static boolean m4725f(AbstractC1908c abstractC1908c, bgg bggVar, EnumC1900c enumC1900c) {
        return (abstractC1908c instanceof C1909d) && !m4726g(bggVar, enumC1900c);
    }

    /* renamed from: g */
    public static boolean m4726g(bgg bggVar, EnumC1900c enumC1900c) {
        boolean zEquals = bggVar.m18927l().mo26122j().mo38386i().equals("androidx.camera.camera2.legacy");
        boolean z = (yq5.m58112b(SurfaceViewStretchedQuirk.class) == null && yq5.m58112b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z) {
            return true;
        }
        int iOrdinal = enumC1900c.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + enumC1900c);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    private sc8.InterfaceC16805i getScreenFlashInternal() {
        return this.f6139c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(sc8.InterfaceC16805i interfaceC16805i) {
        wja.m54627a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    /* renamed from: b */
    public final void m4727b(boolean z) {
        elh.m25220a();
        getViewPort();
    }

    /* renamed from: c */
    public eyi m4728c(int i) {
        elh.m25220a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new eyi.C13288a(new Rational(getWidth(), getHeight()), i).m25861c(getViewPortScaleType()).m25860b(getLayoutDirection()).m25859a();
    }

    /* renamed from: e */
    public void m4729e() {
        elh.m25220a();
        if (this.f6138b != null) {
            m4732j();
            this.f6138b.m4789h();
        }
        this.f6145q.m37222b(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        elh.m25220a();
        AbstractC1908c abstractC1908c = this.f6138b;
        if (abstractC1908c == null) {
            return null;
        }
        return abstractC1908c.m4782a();
    }

    public a92 getController() {
        elh.m25220a();
        return null;
    }

    public EnumC1900c getImplementationMode() {
        elh.m25220a();
        return this.f6137a;
    }

    public feb getMeteringPointFactory() {
        elh.m25220a();
        return this.f6145q;
    }

    public ogc getOutputTransform() {
        Matrix matrixM4773j;
        elh.m25220a();
        try {
            matrixM4773j = this.f6140d.m4773j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixM4773j = null;
        }
        Rect rectM4772i = this.f6140d.m4772i();
        if (matrixM4773j == null || rectM4772i == null) {
            wja.m54627a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixM4773j.preConcat(wuh.m55033b(rectM4772i));
        if (this.f6138b instanceof C1910e) {
            matrixM4773j.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            wja.m54638l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new ogc(matrixM4773j, new Size(rectM4772i.width(), rectM4772i.height()));
    }

    public AbstractC2145n getPreviewStreamState() {
        return this.f6142f;
    }

    public EnumC1902e getScaleType() {
        elh.m25220a();
        return this.f6140d.m4770g();
    }

    public sc8.InterfaceC16805i getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        elh.m25220a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f6140d.m4771h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public ahd.InterfaceC12175c getSurfaceProvider() {
        elh.m25220a();
        return this.f6136M;
    }

    public eyi getViewPort() {
        elh.m25220a();
        if (getDisplay() == null) {
            return null;
        }
        return m4728c(getDisplay().getRotation());
    }

    /* renamed from: h */
    public final void m4730h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f6134H, new Handler(Looper.getMainLooper()));
    }

    /* renamed from: i */
    public final void m4731i() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f6134H);
    }

    /* renamed from: j */
    public void m4732j() {
        Display display;
        u92 u92Var;
        if (!this.f6141e || (display = getDisplay()) == null || (u92Var = this.f6147x) == null) {
            return;
        }
        this.f6140d.m4778o(u92Var.mo38387j(display.getRotation()), display.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4730h();
        addOnLayoutChangeListener(this.f6135L);
        AbstractC1908c abstractC1908c = this.f6138b;
        if (abstractC1908c != null) {
            abstractC1908c.mo4785d();
        }
        m4727b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f6135L);
        AbstractC1908c abstractC1908c = this.f6138b;
        if (abstractC1908c != null) {
            abstractC1908c.mo4786e();
        }
        m4731i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f6148y = null;
        return super.performClick();
    }

    public void setController(a92 a92Var) {
        elh.m25220a();
        m4727b(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setFrameUpdateListener(Executor executor, InterfaceC1901d interfaceC1901d) {
        if (this.f6137a == EnumC1900c.PERFORMANCE) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
        this.f6144h = executor;
        AbstractC1908c abstractC1908c = this.f6138b;
        if (abstractC1908c != null) {
            abstractC1908c.mo4790i(executor, interfaceC1901d);
        }
    }

    public void setImplementationMode(EnumC1900c enumC1900c) {
        elh.m25220a();
        this.f6137a = enumC1900c;
        EnumC1900c enumC1900c2 = EnumC1900c.PERFORMANCE;
    }

    public void setScaleType(EnumC1902e enumC1902e) {
        elh.m25220a();
        this.f6140d.m4779q(enumC1902e);
        m4729e();
        m4727b(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.f6139c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        elh.m25220a();
        this.f6139c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        EnumC1900c enumC1900c = f6133Q;
        this.f6137a = enumC1900c;
        C1907b c1907b = new C1907b();
        this.f6140d = c1907b;
        this.f6141e = true;
        this.f6142f = new hpb(EnumC1903f.IDLE);
        this.f6143g = new AtomicReference();
        this.f6145q = new lhd(c1907b);
        this.f6134H = new C1899b();
        this.f6135L = new View.OnLayoutChangeListener() { // from class: o.ghd
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                this.f25204a.m4724d(view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        };
        this.f6136M = new C1898a();
        elh.m25220a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, kbe.PreviewView, i, i2);
        wvi.k0(this, context, kbe.PreviewView, attributeSet, typedArrayObtainStyledAttributes, i, i2);
        try {
            setScaleType(EnumC1902e.fromId(typedArrayObtainStyledAttributes.getInteger(kbe.PreviewView_scaleType, c1907b.m4770g().getId())));
            setImplementationMode(EnumC1900c.fromId(typedArrayObtainStyledAttributes.getInteger(kbe.PreviewView_implementationMode, enumC1900c.getId())));
            typedArrayObtainStyledAttributes.recycle();
            this.f6146s = new hfj(context, new hfj.InterfaceC13932b() { // from class: o.hhd
            });
            if (getBackground() == null) {
                setBackgroundColor(c64.getColor(getContext(), R.color.black));
            }
            ScreenFlashView screenFlashView = new ScreenFlashView(context);
            this.f6139c = screenFlashView;
            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
