package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import androidx.core.os.OperationCanceledException;
import be.C0655j;
import com.skydoves.balloon.internals.DefinitionKt;
import j0.AbstractC3506f;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import l0.C4310j;
import pg.i7;
import x4.C8299i;
import x4.InterfaceC8300j;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class m0 implements i0.c1 {

    /* renamed from: a */
    public f0 f5157a;

    /* renamed from: b */
    public volatile int f5158b;

    /* renamed from: c */
    public volatile int f5159c;

    /* renamed from: e */
    public volatile boolean f5161e;

    /* renamed from: f */
    public volatile boolean f5162f;

    /* renamed from: g */
    public Executor f5163g;

    /* renamed from: h */
    public C0655j f5164h;

    /* renamed from: j */
    public ImageWriter f5165j;

    /* renamed from: p */
    public ByteBuffer f5170p;

    /* renamed from: q */
    public ByteBuffer f5171q;

    /* renamed from: r */
    public ByteBuffer f5172r;

    /* renamed from: s */
    public ByteBuffer f5173s;

    /* renamed from: t */
    public ByteBuffer f5174t;

    /* renamed from: v */
    public ByteBuffer f5175v;

    /* renamed from: d */
    public volatile int f5160d = 1;

    /* renamed from: k */
    public Rect f5166k = new Rect();

    /* renamed from: l */
    public Rect f5167l = new Rect();

    /* renamed from: m */
    public Matrix f5168m = new Matrix();

    /* renamed from: n */
    public Matrix f5169n = new Matrix();

    /* renamed from: w */
    public final Object f5176w = new Object();

    /* renamed from: x */
    public boolean f5177x = true;

    /* renamed from: a */
    public abstract b1 mo2211a(i0.d1 d1Var);

    /* renamed from: b */
    public final InterfaceFutureC8957d m2212b(final b1 b1Var) throws Throwable {
        Object obj;
        final Executor executor;
        final f0 f0Var;
        boolean z6;
        C0655j c0655j;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        p0 p0VarM610g;
        p0 p0Var;
        int i10 = this.f5161e ? this.f5158b : 0;
        Object obj2 = this.f5176w;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f5163g;
                    f0Var = this.f5157a;
                    z6 = this.f5161e && i10 != this.f5159c;
                    if (z6) {
                        m2217h(b1Var, i10);
                    }
                    if (this.f5161e || this.f5160d == 3) {
                        m2214e(b1Var);
                    }
                    try {
                        c0655j = this.f5164h;
                        try {
                            imageWriter = this.f5165j;
                            byteBuffer = this.f5170p;
                            byteBuffer2 = this.f5171q;
                            byteBuffer3 = this.f5172r;
                            byteBuffer4 = this.f5173s;
                            byteBuffer5 = this.f5174t;
                            byteBuffer6 = this.f5175v;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
        if (f0Var == null || executor == null || !this.f5177x) {
            return new C4310j(1, new OperationCanceledException("No analyzer or executor currently set."));
        }
        if (c0655j != null) {
            if (this.f5160d == 2) {
                p0VarM610g = ImageProcessingUtil.m605b(b1Var, c0655j, byteBuffer, i10, this.f5162f);
            } else {
                if (this.f5160d == 1) {
                    if (this.f5162f) {
                        ImageProcessingUtil.m604a(b1Var);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        p0VarM610g = ImageProcessingUtil.m609f(b1Var, c0655j, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
                    }
                }
                p0Var = null;
            }
            p0Var = p0VarM610g;
        } else {
            if (this.f5160d == 3) {
                if (this.f5162f) {
                    ImageProcessingUtil.m604a(b1Var);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    p0VarM610g = ImageProcessingUtil.m610g(b1Var, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i10);
                    p0Var = p0VarM610g;
                }
            }
            p0Var = null;
        }
        boolean z10 = p0Var == null;
        final b1 b1Var2 = z10 ? b1Var : p0Var;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f5176w) {
            if (z6 && !z10) {
                try {
                    m2216g(b1Var.mo2136b(), b1Var.getHeight(), b1Var2.mo2136b(), b1Var2.getHeight());
                } finally {
                }
            }
            this.f5159c = i10;
            rect.set(this.f5167l);
            matrix.set(this.f5169n);
        }
        return i7.m11697b(new InterfaceC8300j() { // from class: c0.k0
            @Override // x4.InterfaceC8300j
            /* renamed from: I */
            public final Object mo15I(final C8299i c8299i) {
                final m0 m0Var = this.f5126a;
                final b1 b1Var3 = b1Var;
                final Matrix matrix2 = matrix;
                final b1 b1Var4 = b1Var2;
                final Rect rect2 = rect;
                final f0 f0Var2 = f0Var;
                executor.execute(new Runnable() { // from class: c0.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m0 m0Var2 = m0Var;
                        b1 b1Var5 = b1Var3;
                        Matrix matrix3 = matrix2;
                        b1 b1Var6 = b1Var4;
                        Rect rect3 = rect2;
                        f0 f0Var3 = f0Var2;
                        C8299i c8299i2 = c8299i;
                        if (!m0Var2.f5177x) {
                            c8299i2.m15509d(new OperationCanceledException("ImageAnalysis is detached"));
                            return;
                        }
                        p1 p1Var = new p1(b1Var6, null, new C0813f(b1Var5.mo2135X().mo2193a(), b1Var5.mo2135X().mo2195c(), m0Var2.f5161e ? 0 : m0Var2.f5158b, matrix3, b1Var5.mo2135X().mo2194b()));
                        if (!rect3.isEmpty()) {
                            Rect rect4 = new Rect(rect3);
                            if (!rect4.intersect(0, 0, p1Var.f5193f, p1Var.f5194g)) {
                                rect4.setEmpty();
                            }
                            synchronized (p1Var.f5191d) {
                            }
                        }
                        f0Var3.mo26f(p1Var);
                        c8299i2.m15507b(null);
                    }
                });
                return "analyzeImage";
            }
        });
    }

    /* renamed from: c */
    public abstract void mo2213c();

    @Override // i0.c1
    /* renamed from: d */
    public final void mo18d(i0.d1 d1Var) {
        try {
            b1 b1VarMo2211a = mo2211a(d1Var);
            if (b1VarMo2211a != null) {
                mo2215f(b1VarMo2211a);
            }
        } catch (IllegalStateException unused) {
            og.u1.m10944c("ImageAnalysisAnalyzer");
        }
    }

    /* renamed from: e */
    public final void m2214e(b1 b1Var) {
        if (this.f5160d != 1 && this.f5160d != 3) {
            if (this.f5160d == 2 && this.f5170p == null) {
                this.f5170p = ByteBuffer.allocateDirect(b1Var.getHeight() * b1Var.mo2136b() * 4);
                return;
            }
            return;
        }
        if (this.f5171q == null) {
            this.f5171q = ByteBuffer.allocateDirect(b1Var.getHeight() * b1Var.mo2136b());
        }
        this.f5171q.position(0);
        if (this.f5172r == null) {
            this.f5172r = ByteBuffer.allocateDirect((b1Var.getHeight() * b1Var.mo2136b()) / 4);
        }
        this.f5172r.position(0);
        if (this.f5173s == null) {
            this.f5173s = ByteBuffer.allocateDirect((b1Var.getHeight() * b1Var.mo2136b()) / 4);
        }
        this.f5173s.position(0);
        if (this.f5160d == 3) {
            if (this.f5174t == null) {
                this.f5174t = ByteBuffer.allocateDirect(b1Var.getHeight() * b1Var.mo2136b());
            }
            this.f5174t.position(0);
            if (this.f5175v == null) {
                this.f5175v = ByteBuffer.allocateDirect((b1Var.getHeight() * b1Var.mo2136b()) / 2);
            }
            this.f5175v.position(0);
        }
    }

    /* renamed from: f */
    public abstract void mo2215f(b1 b1Var);

    /* renamed from: g */
    public final void m2216g(int i10, int i11, int i12, int i13) {
        int i14 = this.f5158b;
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            RectF rectF = new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, i10, i11);
            RectF rectF2 = AbstractC3506f.f18377a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i14);
            RectF rectF3 = new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, i12, i13);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f5166k);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f5167l = rect;
        this.f5169n.setConcat(this.f5168m, matrix);
    }

    /* renamed from: h */
    public final void m2217h(b1 b1Var, int i10) {
        C0655j c0655j = this.f5164h;
        if (c0655j == null) {
            return;
        }
        c0655j.m1883m();
        int iMo2136b = b1Var.mo2136b();
        int height = b1Var.getHeight();
        int iMo1880j = this.f5164h.mo1880j();
        int iMo1884z = this.f5164h.mo1884z();
        boolean z6 = i10 == 90 || i10 == 270;
        int i11 = z6 ? height : iMo2136b;
        if (!z6) {
            iMo2136b = height;
        }
        this.f5164h = new C0655j(og.t1.m10923c(i11, iMo2136b, iMo1880j, iMo1884z));
        if (this.f5160d == 1) {
            ImageWriter imageWriter = this.f5165j;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f5165j = ImageWriter.newInstance(this.f5164h.getSurface(), this.f5164h.mo1884z());
        }
    }

    /* renamed from: i */
    public final void m2218i(Matrix matrix) {
        synchronized (this.f5176w) {
            this.f5168m = matrix;
            this.f5169n = new Matrix(this.f5168m);
        }
    }

    /* renamed from: j */
    public final void m2219j(Rect rect) {
        synchronized (this.f5176w) {
            this.f5166k = rect;
            this.f5167l = new Rect(this.f5166k);
        }
    }
}
