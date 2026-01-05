package p001o;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import p001o.g32;
import p001o.ifg;

/* loaded from: classes2.dex */
public final class lfg implements ifg {

    /* renamed from: H */
    public Executor f33720H;

    /* renamed from: Q */
    public final zfa f33723Q;

    /* renamed from: X */
    public g32.C13614a f33724X;

    /* renamed from: Y */
    public Matrix f33725Y;

    /* renamed from: b */
    public final Surface f33727b;

    /* renamed from: c */
    public final int f33728c;

    /* renamed from: d */
    public final int f33729d;

    /* renamed from: e */
    public final Size f33730e;

    /* renamed from: f */
    public final ifg.AbstractC14281a f33731f;

    /* renamed from: g */
    public final ifg.AbstractC14281a f33732g;

    /* renamed from: h */
    public final float[] f33733h;

    /* renamed from: q */
    public final float[] f33734q;

    /* renamed from: s */
    public final float[] f33735s;

    /* renamed from: x */
    public final float[] f33736x;

    /* renamed from: y */
    public hu3 f33737y;

    /* renamed from: a */
    public final Object f33726a = new Object();

    /* renamed from: L */
    public boolean f33721L = false;

    /* renamed from: M */
    public boolean f33722M = false;

    public lfg(Surface surface, int i, int i2, Size size, ifg.AbstractC14281a abstractC14281a, ifg.AbstractC14281a abstractC14281a2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f33733h = fArr;
        float[] fArr2 = new float[16];
        this.f33734q = fArr2;
        float[] fArr3 = new float[16];
        this.f33735s = fArr3;
        float[] fArr4 = new float[16];
        this.f33736x = fArr4;
        this.f33727b = surface;
        this.f33728c = i;
        this.f33729d = i2;
        this.f33730e = size;
        this.f33731f = abstractC14281a;
        this.f33732g = abstractC14281a2;
        this.f33725Y = matrix;
        m37125d(fArr, fArr3, abstractC14281a);
        m37125d(fArr2, fArr4, abstractC14281a2);
        this.f33723Q = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.jfg
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f30365a.m37127h(c13614a);
            }
        });
    }

    /* renamed from: d */
    public static void m37125d(float[] fArr, float[] fArr2, ifg.AbstractC14281a abstractC14281a) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (abstractC14281a == null) {
            return;
        }
        sza.m49104d(fArr, 0.5f);
        sza.m49103c(fArr, abstractC14281a.mo32084e(), 0.5f, 0.5f);
        if (abstractC14281a.mo32083d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix matrixM55036e = wuh.m55036e(wuh.m55049r(abstractC14281a.mo32082c()), wuh.m55049r(wuh.m55046o(abstractC14281a.mo32082c(), abstractC14281a.mo32084e())), abstractC14281a.mo32084e(), abstractC14281a.mo32083d());
        RectF rectF = new RectF(abstractC14281a.mo32081b());
        matrixM55036e.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float fWidth = rectF.width() / r1.getWidth();
        float fHeight = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        m37126f(fArr2, abstractC14281a.mo32080a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    /* renamed from: f */
    public static void m37126f(float[] fArr, v92 v92Var) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        sza.m49104d(fArr, 0.5f);
        if (v92Var != null) {
            fgd.m26666j(v92Var.mo42848p(), "Camera has no transform.");
            sza.m49103c(fArr, v92Var.mo28113a().mo38379a(), 0.5f, 0.5f);
            if (v92Var.m52466l()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m37127h(g32.C13614a c13614a) {
        this.f33724X = c13614a;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m37128k(AtomicReference atomicReference) {
        ((hu3) atomicReference.get()).accept(ifg.AbstractC14282b.m32085c(0, this));
    }

    @Override // p001o.ifg
    public void C1(float[] fArr, float[] fArr2) {
        mo32076F(fArr, fArr2, true);
    }

    @Override // p001o.ifg
    /* renamed from: F */
    public void mo32076F(float[] fArr, float[] fArr2, boolean z) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z ? this.f33733h : this.f33734q, 0);
    }

    @Override // p001o.ifg
    public Surface X1(Executor executor, hu3 hu3Var) {
        boolean z;
        synchronized (this.f33726a) {
            this.f33720H = executor;
            this.f33737y = hu3Var;
            z = this.f33721L;
        }
        if (z) {
            m37130o();
        }
        return this.f33727b;
    }

    @Override // p001o.ifg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f33726a) {
            if (!this.f33722M) {
                this.f33722M = true;
            }
        }
        this.f33724X.m28005c(null);
    }

    /* renamed from: g */
    public zfa m37129g() {
        return this.f33723Q;
    }

    @Override // p001o.ifg
    /* renamed from: j */
    public Size mo32077j() {
        return this.f33730e;
    }

    @Override // p001o.ifg
    /* renamed from: l */
    public int mo32078l() {
        return this.f33729d;
    }

    /* renamed from: o */
    public void m37130o() {
        Executor executor;
        hu3 hu3Var;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f33726a) {
            if (this.f33720H == null || (hu3Var = this.f33737y) == null) {
                this.f33721L = true;
            } else if (!this.f33722M) {
                atomicReference.set(hu3Var);
                executor = this.f33720H;
                this.f33721L = false;
            }
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: o.kfg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32151a.m37128k(atomicReference);
                    }
                });
            } catch (RejectedExecutionException e) {
                wja.m54628b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }
}
