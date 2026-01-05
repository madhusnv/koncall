package q0;

import a1.C0004c;
import a1.RunnableC0012k;
import a1.RunnableC0024w;
import a1.RunnableC0025x;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import c0.a0;
import c0.s1;
import c0.x1;
import df.RunnableC1702a;
import h1.g2;
import j0.AbstractC3506f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.ScheduledExecutorServiceC3894d;
import og.u1;
import og.y0;
import pg.i7;
import pg.n7;
import qw.C6367q;
import s0.AbstractC6703g;
import s0.AbstractC6705i;
import s0.C6704h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q0.c */
/* loaded from: classes.dex */
public final class C6062c implements InterfaceC6071l, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final g2 f29564a;

    /* renamed from: b */
    public final HandlerThread f29565b;

    /* renamed from: c */
    public final ScheduledExecutorServiceC3894d f29566c;

    /* renamed from: d */
    public final Handler f29567d;

    /* renamed from: e */
    public final AtomicBoolean f29568e;

    /* renamed from: f */
    public final float[] f29569f;

    /* renamed from: g */
    public final float[] f29570g;

    /* renamed from: h */
    public final LinkedHashMap f29571h;

    /* renamed from: i */
    public int f29572i;

    /* renamed from: j */
    public boolean f29573j;

    /* renamed from: k */
    public final ArrayList f29574k;

    public C6062c(a0 a0Var) {
        Map map = Collections.EMPTY_MAP;
        this.f29568e = new AtomicBoolean(false);
        this.f29569f = new float[16];
        this.f29570g = new float[16];
        this.f29571h = new LinkedHashMap();
        this.f29572i = 0;
        this.f29573j = false;
        this.f29574k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f29565b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f29567d = handler;
        this.f29566c = new ScheduledExecutorServiceC3894d(handler);
        this.f29564a = new g2();
        try {
            try {
                i7.m11697b(new C0004c(this, a0Var)).get();
            } catch (InterruptedException | ExecutionException e2) {
                e = e2;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e10) {
            mo12065a();
            throw e10;
        }
    }

    @Override // q0.InterfaceC6071l
    /* renamed from: a */
    public final void mo12065a() {
        if (this.f29568e.getAndSet(true)) {
            return;
        }
        m12069e(new RunnableC0024w(25, this), new RunnableC1702a(1));
    }

    @Override // q0.InterfaceC6071l
    /* renamed from: b */
    public final void mo12066b(x1 x1Var) {
        if (this.f29568e.get()) {
            x1Var.m2238c();
        } else {
            m12069e(new RunnableC0012k(27, this, x1Var), new s1(x1Var, 1));
        }
    }

    @Override // q0.InterfaceC6071l
    /* renamed from: c */
    public final void mo12067c(C6070k c6070k) {
        if (this.f29568e.get()) {
            c6070k.close();
            return;
        }
        RunnableC0012k runnableC0012k = new RunnableC0012k(26, this, c6070k);
        Objects.requireNonNull(c6070k);
        m12069e(runnableC0012k, new RunnableC0024w(24, c6070k));
    }

    /* renamed from: d */
    public final void m12068d() {
        if (this.f29573j && this.f29572i == 0) {
            LinkedHashMap linkedHashMap = this.f29571h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((C6070k) it.next()).close();
            }
            ArrayList arrayList = this.f29574k;
            if (arrayList.size() > 0) {
                ((AbstractC6060a) arrayList.get(0)).getClass();
                new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
                throw null;
            }
            linkedHashMap.clear();
            g2 g2Var = this.f29564a;
            if (((AtomicBoolean) g2Var.f15432c).getAndSet(false)) {
                AbstractC6705i.m12834c((Thread) g2Var.f15434e);
                g2Var.m6822l();
            }
            this.f29565b.quit();
        }
    }

    /* renamed from: e */
    public final void m12069e(Runnable runnable, Runnable runnable2) {
        try {
            this.f29566c.execute(new RunnableC0025x(14, this, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            u1.m10952k("DefaultSurfaceProcessor");
            runnable2.run();
        }
    }

    /* renamed from: f */
    public final void m12070f(Exception exc) {
        ArrayList arrayList = this.f29574k;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            ((AbstractC6060a) arrayList.get(0)).getClass();
            throw null;
        }
    }

    /* renamed from: g */
    public final Bitmap m12071g(Size size, float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        n7.m11800b(fArr2, i10);
        n7.m11801c(fArr2);
        Size sizeM8071f = AbstractC3506f.m8071f(size, i10);
        g2 g2Var = this.f29564a;
        g2Var.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeM8071f.getHeight() * sizeM8071f.getWidth() * 4);
        y0.m11051a("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeM8071f.getHeight() * sizeM8071f.getWidth()) * 4);
        y0.m11051a("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = AbstractC6705i.f32027a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        AbstractC6705i.m12833b("glGenTextures");
        int i11 = iArr2[0];
        GLES20.glActiveTexture(33985);
        AbstractC6705i.m12833b("glActiveTexture");
        GLES20.glBindTexture(3553, i11);
        AbstractC6705i.m12833b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeM8071f.getWidth(), sizeM8071f.getHeight(), 0, 6407, 5121, null);
        AbstractC6705i.m12833b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        AbstractC6705i.m12833b("glGenFramebuffers");
        int i12 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i12);
        AbstractC6705i.m12833b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i11, 0);
        AbstractC6705i.m12833b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        AbstractC6705i.m12833b("glActiveTexture");
        GLES20.glBindTexture(36197, g2Var.f15431b);
        AbstractC6705i.m12833b("glBindTexture");
        g2Var.f15439k = null;
        GLES20.glViewport(0, 0, sizeM8071f.getWidth(), sizeM8071f.getHeight());
        GLES20.glScissor(0, 0, sizeM8071f.getWidth(), sizeM8071f.getHeight());
        AbstractC6703g abstractC6703g = (AbstractC6703g) g2Var.f15441m;
        abstractC6703g.getClass();
        if (abstractC6703g instanceof C6704h) {
            GLES20.glUniformMatrix4fv(((C6704h) abstractC6703g).f32025f, 1, false, fArr2, 0);
            AbstractC6705i.m12833b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC6705i.m12833b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeM8071f.getWidth(), sizeM8071f.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        AbstractC6705i.m12833b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i11}, 0);
        AbstractC6705i.m12833b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i12}, 0);
        AbstractC6705i.m12833b("glDeleteFramebuffers");
        int i13 = g2Var.f15431b;
        GLES20.glActiveTexture(33984);
        AbstractC6705i.m12833b("glActiveTexture");
        GLES20.glBindTexture(36197, i13);
        AbstractC6705i.m12833b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeM8071f.getWidth(), sizeM8071f.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.m606c(bitmapCreateBitmap, byteBufferAllocateDirect, sizeM8071f.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    /* renamed from: h */
    public final void m12072h(C6367q c6367q) throws IOException {
        ArrayList arrayList = this.f29574k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (c6367q == null) {
            m12070f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    byteArrayOutputStream.close();
                    return;
                }
                ((AbstractC6060a) it.next()).getClass();
                Bitmap bitmapM12071g = m12071g((Size) c6367q.f30766b, (float[]) c6367q.f30767c, 0);
                byteArrayOutputStream.reset();
                bitmapM12071g.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Surface surface = (Surface) c6367q.f30765a;
                Objects.requireNonNull(byteArray);
                ImageProcessingUtil.m611h(byteArray, surface);
                throw null;
            } finally {
            }
        } catch (IOException e2) {
            m12070f(e2);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.f29568e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f29569f;
        surfaceTexture.getTransformMatrix(fArr);
        C6367q c6367q = null;
        for (Map.Entry entry : this.f29571h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            C6070k c6070k = (C6070k) entry.getKey();
            float[] fArr2 = c6070k.f29612e;
            float[] fArr3 = this.f29570g;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i10 = c6070k.f29610c;
            if (i10 == 34) {
                try {
                    this.f29564a.m6824p(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException unused) {
                    u1.m10944c("DefaultSurfaceProcessor");
                }
            } else {
                y0.m11056f("Unsupported format: " + i10, i10 == 256);
                y0.m11056f("Only one JPEG output is supported.", c6367q == null);
                c6367q = new C6367q(surface, c6070k.f29611d, (float[]) fArr3.clone());
            }
        }
        try {
            m12072h(c6367q);
        } catch (RuntimeException e2) {
            m12070f(e2);
        }
    }
}
