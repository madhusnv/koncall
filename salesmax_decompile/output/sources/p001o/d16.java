package p001o;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.bgg;
import p001o.g32;
import p001o.ifg;

/* loaded from: classes2.dex */
public class d16 implements nfg, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final r06 f18950a;

    /* renamed from: b */
    public final HandlerThread f18951b;

    /* renamed from: c */
    public final Executor f18952c;

    /* renamed from: d */
    public final Handler f18953d;

    /* renamed from: e */
    public int f18954e;

    /* renamed from: f */
    public boolean f18955f;

    /* renamed from: g */
    public final AtomicBoolean f18956g;

    /* renamed from: h */
    public final Map f18957h;

    /* renamed from: q */
    public SurfaceTexture f18958q;

    /* renamed from: s */
    public SurfaceTexture f18959s;

    /* renamed from: o.d16$a */
    public static class C12779a {

        /* renamed from: a */
        public static ql7 f18960a = new ql7() { // from class: o.c16
            @Override // p001o.ql7
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new d16((y16) obj, (ei9) obj2, (ei9) obj3);
            }
        };

        /* renamed from: a */
        public static nfg m22220a(y16 y16Var, ei9 ei9Var, ei9 ei9Var2) {
            return (nfg) f18960a.invoke(y16Var, ei9Var, ei9Var2);
        }
    }

    public d16(y16 y16Var, ei9 ei9Var, ei9 ei9Var2) {
        this(y16Var, Collections.emptyMap(), ei9Var, ei9Var2);
    }

    /* renamed from: q */
    public static /* synthetic */ void m22205q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m22206r(Runnable runnable, Runnable runnable2) {
        if (this.f18955f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m22207s(y16 y16Var, Map map, g32.C13614a c13614a) {
        try {
            this.f18950a.mo35473h(y16Var, map);
            c13614a.m28005c(null);
        } catch (RuntimeException e) {
            c13614a.m28008f(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ Object m22208t(final y16 y16Var, final Map map, final g32.C13614a c13614a) {
        m22217n(new Runnable() { // from class: o.x06
            @Override // java.lang.Runnable
            public final void run() {
                this.f53006a.m22207s(y16Var, map, c13614a);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m22209u(SurfaceTexture surfaceTexture, Surface surface, bgg.AbstractC12389g abstractC12389g) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f18954e--;
        m22216m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m22210v(bgg bggVar) throws ExecutionException, InterruptedException {
        this.f18954e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f18950a.m46012t(bggVar.m18933r()));
        surfaceTexture.setDefaultBufferSize(bggVar.m18930o().getWidth(), bggVar.m18930o().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        bggVar.m18921B(surface, this.f18952c, new hu3() { // from class: o.z06
            @Override // p001o.hu3
            public final void accept(Object obj) {
                this.f56352a.m22209u(surfaceTexture, surface, (bgg.AbstractC12389g) obj);
            }
        });
        if (bggVar.m18933r()) {
            this.f18958q = surfaceTexture;
        } else {
            this.f18959s = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.f18953d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m22211w(ifg ifgVar, ifg.AbstractC14282b abstractC14282b) {
        ifgVar.close();
        Surface surface = (Surface) this.f18957h.remove(ifgVar);
        if (surface != null) {
            this.f18950a.m35483r(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m22212x(final ifg ifgVar) {
        Surface surfaceX1 = ifgVar.X1(this.f18952c, new hu3() { // from class: o.y06
            @Override // p001o.hu3
            public final void accept(Object obj) {
                this.f54671a.m22211w(ifgVar, (ifg.AbstractC14282b) obj);
            }
        });
        this.f18950a.m35475j(surfaceX1);
        this.f18957h.put(ifgVar, surfaceX1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m22213y() {
        this.f18955f = true;
        m22216m();
    }

    @Override // p001o.mfg
    /* renamed from: a */
    public void mo22214a(final bgg bggVar) {
        if (this.f18956g.get()) {
            bggVar.m18924E();
            return;
        }
        Runnable runnable = new Runnable() { // from class: o.v06
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                this.f49719a.m22210v(bggVar);
            }
        };
        Objects.requireNonNull(bggVar);
        m22218o(runnable, new ei5(bggVar));
    }

    @Override // p001o.mfg
    /* renamed from: b */
    public void mo22215b(final ifg ifgVar) {
        if (this.f18956g.get()) {
            ifgVar.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: o.u06
            @Override // java.lang.Runnable
            public final void run() {
                this.f48137a.m22212x(ifgVar);
            }
        };
        Objects.requireNonNull(ifgVar);
        m22218o(runnable, new ci5(ifgVar));
    }

    /* renamed from: m */
    public final void m22216m() {
        if (this.f18955f && this.f18954e == 0) {
            Iterator it = this.f18957h.keySet().iterator();
            while (it.hasNext()) {
                ((ifg) it.next()).close();
            }
            this.f18957h.clear();
            this.f18950a.mo35476k();
            this.f18951b.quit();
        }
    }

    /* renamed from: n */
    public final void m22217n(Runnable runnable) {
        m22218o(runnable, new Runnable() { // from class: o.a16
            @Override // java.lang.Runnable
            public final void run() {
                d16.m22205q();
            }
        });
    }

    /* renamed from: o */
    public final void m22218o(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f18952c.execute(new Runnable() { // from class: o.b16
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15440a.m22206r(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e) {
            wja.m54639m("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f18956g.get() || (surfaceTexture2 = this.f18958q) == null || this.f18959s == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f18959s.updateTexImage();
        for (Map.Entry entry : this.f18957h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            ifg ifgVar = (ifg) entry.getKey();
            if (ifgVar.mo32078l() == 34) {
                try {
                    this.f18950a.m46013v(surfaceTexture.getTimestamp(), surface, ifgVar, this.f18958q, this.f18959s);
                } catch (RuntimeException e) {
                    wja.m54630d("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    /* renamed from: p */
    public final void m22219p(final y16 y16Var, final Map map) throws ExecutionException, InterruptedException {
        try {
            g32.m28002a(new g32.InterfaceC13616c() { // from class: o.w06
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f51231a.m22208t(y16Var, map, c13614a);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // p001o.nfg
    public void release() {
        if (this.f18956g.getAndSet(true)) {
            return;
        }
        m22217n(new Runnable() { // from class: o.t06
            @Override // java.lang.Runnable
            public final void run() {
                this.f46182a.m22213y();
            }
        });
    }

    public d16(y16 y16Var, Map map, ei9 ei9Var, ei9 ei9Var2) throws ExecutionException, InterruptedException {
        this.f18954e = 0;
        this.f18955f = false;
        this.f18956g = new AtomicBoolean(false);
        this.f18957h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f18951b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f18953d = handler;
        this.f18952c = gb2.m28296d(handler);
        this.f18950a = new r06(ei9Var, ei9Var2);
        try {
            m22219p(y16Var, map);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }
}
