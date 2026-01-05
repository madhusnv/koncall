package w3;

import al.C0174b;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import c3.C0846a;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1549c;
import d3.C1564r;
import d3.InterfaceC1563q;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import g2.l7;
import g3.C2474b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p3.C5805c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u2 extends View implements v3.o1 {

    /* renamed from: r */
    public static final l7 f37983r = new l7(2);

    /* renamed from: s */
    public static Method f37984s;

    /* renamed from: t */
    public static Field f37985t;

    /* renamed from: v */
    public static boolean f37986v;

    /* renamed from: w */
    public static boolean f37987w;

    /* renamed from: a */
    public final C7904v f37988a;

    /* renamed from: b */
    public final o1 f37989b;

    /* renamed from: c */
    public InterfaceC2141e f37990c;

    /* renamed from: d */
    public InterfaceC2137a f37991d;

    /* renamed from: e */
    public final b2 f37992e;

    /* renamed from: f */
    public boolean f37993f;

    /* renamed from: g */
    public Rect f37994g;

    /* renamed from: h */
    public boolean f37995h;

    /* renamed from: j */
    public boolean f37996j;

    /* renamed from: k */
    public final C1564r f37997k;

    /* renamed from: l */
    public final C5805c f37998l;

    /* renamed from: m */
    public long f37999m;

    /* renamed from: n */
    public boolean f38000n;

    /* renamed from: p */
    public final long f38001p;

    /* renamed from: q */
    public int f38002q;

    public u2(C7904v c7904v, o1 o1Var, InterfaceC2141e interfaceC2141e, InterfaceC2137a interfaceC2137a) {
        super(c7904v.getContext());
        this.f37988a = c7904v;
        this.f37989b = o1Var;
        this.f37990c = interfaceC2141e;
        this.f37991d = interfaceC2137a;
        this.f37992e = new b2();
        this.f37997k = new C1564r();
        this.f37998l = new C5805c(c0.f37755e);
        this.f37999m = d3.p0.f7805b;
        this.f38000n = true;
        setWillNotDraw(false);
        o1Var.addView(this);
        this.f38001p = View.generateViewId();
    }

    private final d3.g0 getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        b2 b2Var = this.f37992e;
        if (!b2Var.f37740g) {
            return null;
        }
        b2Var.m14897e();
        return b2Var.f37738e;
    }

    private final void setInvalidated(boolean z6) {
        if (z6 != this.f37995h) {
            this.f37995h = z6;
            this.f37988a.m15040w(this, z6);
        }
    }

    @Override // v3.o1
    /* renamed from: a */
    public final void mo14645a(float[] fArr) {
        d3.b0.m5098e(fArr, this.f37998l.m11377c(this));
    }

    @Override // v3.o1
    /* renamed from: b */
    public final boolean mo14646b(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j6));
        if (this.f37993f) {
            return DefinitionKt.NO_Float_VALUE <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && DefinitionKt.NO_Float_VALUE <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f37992e.m14895c(j6);
        }
        return true;
    }

    @Override // v3.o1
    /* renamed from: c */
    public final void mo14647c(InterfaceC2141e interfaceC2141e, InterfaceC2137a interfaceC2137a) {
        this.f37989b.addView(this);
        C5805c c5805c = this.f37998l;
        c5805c.f28414a = false;
        c5805c.f28415b = false;
        c5805c.f28417d = true;
        c5805c.f28416c = true;
        d3.b0.m5097d((float[]) c5805c.f28420g);
        d3.b0.m5097d((float[]) c5805c.f28421h);
        this.f37993f = false;
        this.f37996j = false;
        this.f37999m = d3.p0.f7805b;
        this.f37990c = interfaceC2141e;
        this.f37991d = interfaceC2137a;
        setInvalidated(false);
    }

    @Override // v3.o1
    /* renamed from: d */
    public final void mo14648d(long j6) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(d3.p0.m5181b(this.f37999m) * i10);
        setPivotY(d3.p0.m5182c(this.f37999m) * i11);
        setOutlineProvider(this.f37992e.m14894b() != null ? f37983r : null);
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        m15007l();
        this.f37998l.m11379e();
    }

    @Override // v3.o1
    public final void destroy() {
        setInvalidated(false);
        C7904v c7904v = this.f37988a;
        c7904v.f38009H = true;
        this.f37990c = null;
        this.f37991d = null;
        c7904v.m15024F(this);
        this.f37989b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z6;
        C1564r c1564r = this.f37997k;
        C1549c c1549c = c1564r.f7808a;
        Canvas canvas2 = c1549c.f7733a;
        c1549c.f7733a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z6 = false;
        } else {
            c1549c.mo5107i();
            this.f37992e.m14893a(c1549c);
            z6 = true;
        }
        InterfaceC2141e interfaceC2141e = this.f37990c;
        if (interfaceC2141e != null) {
            interfaceC2141e.invoke(c1549c, null);
        }
        if (z6) {
            c1549c.mo5113o();
        }
        c1564r.f7808a.f7733a = canvas2;
        setInvalidated(false);
    }

    @Override // v3.o1
    /* renamed from: e */
    public final void mo14649e(float[] fArr) {
        float[] fArrM11376b = this.f37998l.m11376b(this);
        if (fArrM11376b != null) {
            d3.b0.m5098e(fArr, fArrM11376b);
        }
    }

    @Override // v3.o1
    /* renamed from: f */
    public final void mo14650f(C0846a c0846a, boolean z6) {
        C5805c c5805c = this.f37998l;
        if (!z6) {
            float[] fArrM11377c = c5805c.m11377c(this);
            if (c5805c.f28417d) {
                return;
            }
            d3.b0.m5096c(fArrM11377c, c0846a);
            return;
        }
        float[] fArrM11376b = c5805c.m11376b(this);
        if (fArrM11376b != null) {
            if (c5805c.f28417d) {
                return;
            }
            d3.b0.m5096c(fArrM11376b, c0846a);
        } else {
            c0846a.f5348b = DefinitionKt.NO_Float_VALUE;
            c0846a.f5349c = DefinitionKt.NO_Float_VALUE;
            c0846a.f5350d = DefinitionKt.NO_Float_VALUE;
            c0846a.f5351e = DefinitionKt.NO_Float_VALUE;
        }
    }

    @Override // v3.o1
    /* renamed from: g */
    public final void mo14651g(long j6) {
        int i10 = (int) (j6 >> 32);
        int left = getLeft();
        C5805c c5805c = this.f37998l;
        if (i10 != left) {
            offsetLeftAndRight(i10 - getLeft());
            c5805c.m11379e();
        }
        int i11 = (int) (j6 & 4294967295L);
        if (i11 != getTop()) {
            offsetTopAndBottom(i11 - getTop());
            c5805c.m11379e();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final o1 getContainer() {
        return this.f37989b;
    }

    public long getLayerId() {
        return this.f38001p;
    }

    public final C7904v getOwnerView() {
        return this.f37988a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b1.m14892b(this.f37988a);
        }
        return -1L;
    }

    @Override // v3.o1
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo16698getUnderlyingMatrixsQKQjiQ() {
        return this.f37998l.m11377c(this);
    }

    @Override // v3.o1
    /* renamed from: h */
    public final void mo14652h() {
        if (!this.f37995h || f37987w) {
            return;
        }
        m0.m14997x(this);
        setInvalidated(false);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f38000n;
    }

    @Override // v3.o1
    /* renamed from: i */
    public final void mo14653i(d3.i0 i0Var) {
        InterfaceC2137a interfaceC2137a;
        int i10 = i0Var.f7756a | this.f38002q;
        if ((i10 & 4096) != 0) {
            long j6 = i0Var.f7769p;
            this.f37999m = j6;
            setPivotX(d3.p0.m5181b(j6) * getWidth());
            setPivotY(d3.p0.m5182c(this.f37999m) * getHeight());
        }
        if ((i10 & 1) != 0) {
            setScaleX(i0Var.f7757b);
        }
        if ((i10 & 2) != 0) {
            setScaleY(i0Var.f7758c);
        }
        if ((i10 & 4) != 0) {
            setAlpha(i0Var.f7759d);
        }
        if ((i10 & 8) != 0) {
            setTranslationX(i0Var.f7760e);
        }
        if ((i10 & 16) != 0) {
            setTranslationY(i0Var.f7761f);
        }
        if ((i10 & 32) != 0) {
            setElevation(i0Var.f7762g);
        }
        if ((i10 & 1024) != 0) {
            setRotation(i0Var.f7767m);
        }
        if ((i10 & 256) != 0) {
            setRotationX(i0Var.f7765k);
        }
        if ((i10 & 512) != 0) {
            setRotationY(i0Var.f7766l);
        }
        if ((i10 & NewHope.SENDB_BYTES) != 0) {
            setCameraDistancePx(i0Var.f7768n);
        }
        boolean z6 = false;
        boolean z10 = getManualClipPath() != null;
        boolean z11 = i0Var.f7771r;
        C0174b c0174b = d3.h0.f7748a;
        boolean z12 = z11 && i0Var.f7770q != c0174b;
        if ((i10 & 24576) != 0) {
            this.f37993f = z11 && i0Var.f7770q == c0174b;
            m15007l();
            setClipToOutline(z12);
        }
        boolean zM14896d = this.f37992e.m14896d(i0Var.f7776x, i0Var.f7759d, z12, i0Var.f7762g, i0Var.f7773t);
        b2 b2Var = this.f37992e;
        if (b2Var.f37739f) {
            setOutlineProvider(b2Var.m14894b() != null ? f37983r : null);
        }
        boolean z13 = getManualClipPath() != null;
        if (z10 != z13 || (z13 && zM14896d)) {
            invalidate();
        }
        if (!this.f37996j && getElevation() > DefinitionKt.NO_Float_VALUE && (interfaceC2137a = this.f37991d) != null) {
            interfaceC2137a.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f37998l.m11379e();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if ((i10 & 64) != 0) {
                a1.m14857b(this, d3.h0.m5149u(i0Var.f7763h));
            }
            if ((i10 & 128) != 0) {
                a1.m14858c(this, d3.h0.m5149u(i0Var.f7764j));
            }
        }
        if (i11 >= 31 && (131072 & i10) != 0) {
            i2.m14959b(this);
        }
        if ((i10 & 32768) != 0) {
            int i12 = i0Var.f7772s;
            if (i12 == 1) {
                setLayerType(2, null);
            } else if (i12 == 2) {
                setLayerType(0, null);
                this.f38000n = z6;
            } else {
                setLayerType(0, null);
            }
            z6 = true;
            this.f38000n = z6;
        }
        this.f38002q = i0Var.f7756a;
    }

    @Override // android.view.View, v3.o1
    public final void invalidate() {
        if (this.f37995h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f37988a.invalidate();
    }

    @Override // v3.o1
    /* renamed from: j */
    public final long mo14654j(boolean z6, long j6) {
        C5805c c5805c = this.f37998l;
        if (z6) {
            float[] fArrM11376b = c5805c.m11376b(this);
            if (fArrM11376b == null) {
                return 9187343241974906880L;
            }
            if (!c5805c.f28417d) {
                return d3.b0.m5095b(j6, fArrM11376b);
            }
        } else {
            float[] fArrM11377c = c5805c.m11377c(this);
            if (!c5805c.f28417d) {
                return d3.b0.m5095b(j6, fArrM11377c);
            }
        }
        return j6;
    }

    @Override // v3.o1
    /* renamed from: k */
    public final void mo14655k(InterfaceC1563q interfaceC1563q, C2474b c2474b) {
        boolean z6 = getElevation() > DefinitionKt.NO_Float_VALUE;
        this.f37996j = z6;
        if (z6) {
            interfaceC1563q.mo5118t();
        }
        this.f37989b.m14998a(interfaceC1563q, this, getDrawingTime());
        if (this.f37996j) {
            interfaceC1563q.mo5108j();
        }
    }

    /* renamed from: l */
    public final void m15007l() {
        Rect rect;
        if (this.f37993f) {
            Rect rect2 = this.f37994g;
            if (rect2 == null) {
                this.f37994g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                AbstractC4154l.m8920c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f37994g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f6) {
        setCameraDistance(f6 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
