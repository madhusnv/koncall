package r0;

import a1.C0004c;
import a1.RunnableC0024w;
import a1.RunnableC0025x;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c0.C0833z;
import c0.a0;
import c0.s1;
import c0.x1;
import df.RunnableC1702a;
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
import pg.i7;
import q0.C6070k;
import q0.InterfaceC6071l;
import qi.RunnableC6224g;
import s0.AbstractC6705i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r0.e */
/* loaded from: classes.dex */
public final class C6414e implements InterfaceC6071l, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final C6412c f30931a;

    /* renamed from: b */
    public final HandlerThread f30932b;

    /* renamed from: c */
    public final ScheduledExecutorServiceC3894d f30933c;

    /* renamed from: d */
    public final Handler f30934d;

    /* renamed from: e */
    public int f30935e;

    /* renamed from: f */
    public boolean f30936f;

    /* renamed from: g */
    public final AtomicBoolean f30937g;

    /* renamed from: h */
    public final LinkedHashMap f30938h;

    /* renamed from: i */
    public SurfaceTexture f30939i;

    /* renamed from: j */
    public SurfaceTexture f30940j;

    public C6414e(a0 a0Var, C0833z c0833z, C0833z c0833z2) {
        Map map = Collections.EMPTY_MAP;
        this.f30935e = 0;
        this.f30936f = false;
        this.f30937g = new AtomicBoolean(false);
        this.f30938h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f30932b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f30934d = handler;
        this.f30933c = new ScheduledExecutorServiceC3894d(handler);
        this.f30931a = new C6412c(c0833z, c0833z2);
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
        if (this.f30937g.getAndSet(true)) {
            return;
        }
        m12422e(new RunnableC0024w(27, this), new RunnableC1702a(1));
    }

    @Override // q0.InterfaceC6071l
    /* renamed from: b */
    public final void mo12066b(x1 x1Var) {
        if (this.f30937g.get()) {
            x1Var.m2238c();
        } else {
            m12422e(new RunnableC6224g(1, this, x1Var), new s1(x1Var, 1));
        }
    }

    @Override // q0.InterfaceC6071l
    /* renamed from: c */
    public final void mo12067c(C6070k c6070k) {
        if (this.f30937g.get()) {
            c6070k.close();
            return;
        }
        RunnableC6224g runnableC6224g = new RunnableC6224g(2, this, c6070k);
        Objects.requireNonNull(c6070k);
        m12422e(runnableC6224g, new RunnableC0024w(24, c6070k));
    }

    /* renamed from: d */
    public final void m12421d() {
        if (this.f30936f && this.f30935e == 0) {
            LinkedHashMap linkedHashMap = this.f30938h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((C6070k) it.next()).close();
            }
            linkedHashMap.clear();
            C6412c c6412c = this.f30931a;
            if (((AtomicBoolean) c6412c.f15432c).getAndSet(false)) {
                AbstractC6705i.m12834c((Thread) c6412c.f15434e);
                c6412c.m6822l();
            }
            c6412c.f30924p = -1;
            c6412c.f30925q = -1;
            this.f30932b.quit();
        }
    }

    /* renamed from: e */
    public final void m12422e(Runnable runnable, Runnable runnable2) {
        try {
            this.f30933c.execute(new RunnableC0025x(18, this, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            u1.m10952k("DualSurfaceProcessor");
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f30937g.get() || (surfaceTexture2 = this.f30939i) == null || this.f30940j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f30940j.updateTexImage();
        for (Map.Entry entry : this.f30938h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            C6070k c6070k = (C6070k) entry.getKey();
            if (c6070k.f29610c == 34) {
                try {
                    this.f30931a.m12419r(surfaceTexture.getTimestamp(), surface, c6070k, this.f30939i, this.f30940j);
                } catch (RuntimeException unused) {
                    u1.m10944c("DualSurfaceProcessor");
                }
            }
        }
    }
}
