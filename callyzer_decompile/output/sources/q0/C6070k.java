package q0;

import a1.RunnableC0012k;
import a1.c0;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import b6.InterfaceC0600a;
import c0.C0814g;
import com.skydoves.balloon.internals.DefinitionKt;
import i0.g0;
import j0.AbstractC3506f;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import k0.ScheduledExecutorServiceC3894d;
import og.u1;
import og.y0;
import pg.i7;
import pg.n7;
import x4.C8299i;
import x4.C8302l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q0.k */
/* loaded from: classes.dex */
public final class C6070k implements Closeable {

    /* renamed from: b */
    public final Surface f29609b;

    /* renamed from: c */
    public final int f29610c;

    /* renamed from: d */
    public final Size f29611d;

    /* renamed from: e */
    public final float[] f29612e;

    /* renamed from: f */
    public InterfaceC0600a f29613f;

    /* renamed from: g */
    public Executor f29614g;

    /* renamed from: k */
    public final C8302l f29617k;

    /* renamed from: l */
    public C8299i f29618l;

    /* renamed from: a */
    public final Object f29608a = new Object();

    /* renamed from: h */
    public boolean f29615h = false;

    /* renamed from: j */
    public boolean f29616j = false;

    public C6070k(Surface surface, int i10, Size size, C0814g c0814g, C0814g c0814g2) {
        float[] fArr = new float[16];
        this.f29612e = fArr;
        this.f29609b = surface;
        this.f29610c = i10;
        this.f29611d = size;
        m12079h(fArr, new float[16], c0814g);
        m12079h(new float[16], new float[16], c0814g2);
        this.f29617k = i7.m11697b(new c0(18, this));
    }

    /* renamed from: h */
    public static void m12079h(float[] fArr, float[] fArr2, C0814g c0814g) {
        Matrix.setIdentityM(fArr, 0);
        if (c0814g == null) {
            return;
        }
        Size size = c0814g.f5098a;
        boolean z6 = c0814g.f5102e;
        int i10 = c0814g.f5101d;
        n7.m11801c(fArr);
        n7.m11800b(fArr, i10);
        if (z6) {
            Matrix.translateM(fArr, 0, 1.0f, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeM8071f = AbstractC3506f.m8071f(size, i10);
        float f6 = 0;
        android.graphics.Matrix matrixM8066a = AbstractC3506f.m8066a(new RectF(f6, f6, size.getWidth(), size.getHeight()), new RectF(f6, f6, sizeM8071f.getWidth(), sizeM8071f.getHeight()), i10, z6);
        RectF rectF = new RectF(c0814g.f5099b);
        matrixM8066a.mapRect(rectF);
        float width = rectF.left / sizeM8071f.getWidth();
        float height = ((sizeM8071f.getHeight() - rectF.height()) - rectF.top) / sizeM8071f.getHeight();
        float fWidth = rectF.width() / sizeM8071f.getWidth();
        float fHeight = rectF.height() / sizeM8071f.getHeight();
        Matrix.translateM(fArr, 0, width, height, DefinitionKt.NO_Float_VALUE);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        g0 g0Var = c0814g.f5100c;
        Matrix.setIdentityM(fArr2, 0);
        n7.m11801c(fArr2);
        if (g0Var != null) {
            y0.m11056f("Camera has no transform.", g0Var.mo7317o());
            n7.m11800b(fArr2, g0Var.mo2207c().mo7322d());
            if (g0Var.mo7310f()) {
                Matrix.translateM(fArr2, 0, 1.0f, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f29608a) {
            try {
                if (!this.f29616j) {
                    this.f29616j = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f29618l.m15507b(null);
    }

    /* renamed from: j */
    public final Surface m12080j(ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894d, InterfaceC0600a interfaceC0600a) {
        boolean z6;
        synchronized (this.f29608a) {
            this.f29614g = scheduledExecutorServiceC3894d;
            this.f29613f = interfaceC0600a;
            z6 = this.f29615h;
        }
        if (z6) {
            m12081n();
        }
        return this.f29609b;
    }

    /* renamed from: n */
    public final void m12081n() {
        Executor executor;
        InterfaceC0600a interfaceC0600a;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f29608a) {
            try {
                if (this.f29614g == null || (interfaceC0600a = this.f29613f) == null) {
                    this.f29615h = true;
                } else if (!this.f29616j) {
                    atomicReference.set(interfaceC0600a);
                    executor = this.f29614g;
                    this.f29615h = false;
                }
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new RunnableC0012k(28, this, atomicReference));
            } catch (RejectedExecutionException unused) {
                u1.m10947f(3, u1.m10950i("SurfaceOutputImpl"));
            }
        }
    }
}
