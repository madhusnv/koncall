package p001o;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.bgg;
import p001o.dn7;
import p001o.g32;
import p001o.ifg;

/* loaded from: classes2.dex */
public class li5 implements nfg, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final kdc f33878a;

    /* renamed from: b */
    public final HandlerThread f33879b;

    /* renamed from: c */
    public final Executor f33880c;

    /* renamed from: d */
    public final Handler f33881d;

    /* renamed from: e */
    public final AtomicBoolean f33882e;

    /* renamed from: f */
    public final float[] f33883f;

    /* renamed from: g */
    public final float[] f33884g;

    /* renamed from: h */
    public final Map f33885h;

    /* renamed from: q */
    public int f33886q;

    /* renamed from: s */
    public boolean f33887s;

    /* renamed from: x */
    public final List f33888x;

    /* renamed from: o.li5$a */
    public static class C15079a {

        /* renamed from: a */
        public static zl7 f33889a = new zl7() { // from class: o.ki5
            @Override // p001o.zl7
            public final Object apply(Object obj) {
                return new li5((y16) obj);
            }
        };

        /* renamed from: a */
        public static nfg m37301a(y16 y16Var) {
            return (nfg) f33889a.apply(y16Var);
        }
    }

    /* renamed from: o.li5$b */
    public static abstract class AbstractC15080b {
        /* renamed from: d */
        public static i41 m37302d(int i, int i2, g32.C13614a c13614a) {
            return new i41(i, i2, c13614a);
        }

        /* renamed from: a */
        public abstract g32.C13614a mo31481a();

        /* renamed from: b */
        public abstract int mo31482b();

        /* renamed from: c */
        public abstract int mo31483c();
    }

    public li5(y16 y16Var) {
        this(y16Var, Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m37267A(bgg bggVar, bgg.AbstractC12390h abstractC12390h) {
        dn7.EnumC13002e enumC13002e = dn7.EnumC13002e.DEFAULT;
        if (bggVar.m18929n().m57104d() && abstractC12390h.mo18947e()) {
            enumC13002e = dn7.EnumC13002e.YUV;
        }
        this.f33878a.m35480o(enumC13002e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m37268B(bgg bggVar, SurfaceTexture surfaceTexture, Surface surface, bgg.AbstractC12389g abstractC12389g) {
        bggVar.m18926k();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f33886q--;
        m37295q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m37269C(final bgg bggVar) throws ExecutionException, InterruptedException {
        this.f33886q++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f33878a.m35472g());
        surfaceTexture.setDefaultBufferSize(bggVar.m18930o().getWidth(), bggVar.m18930o().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        bggVar.m18922C(this.f33880c, new bgg.InterfaceC12391i() { // from class: o.ji5
            @Override // p001o.bgg.InterfaceC12391i
            /* renamed from: a */
            public final void mo18949a(bgg.AbstractC12390h abstractC12390h) {
                this.f30479a.m37267A(bggVar, abstractC12390h);
            }
        });
        bggVar.m18921B(surface, this.f33880c, new hu3() { // from class: o.wh5
            @Override // p001o.hu3
            public final void accept(Object obj) {
                this.f51993a.m37268B(bggVar, surfaceTexture, surface, (bgg.AbstractC12389g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f33881d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m37270D(ifg ifgVar, ifg.AbstractC14282b abstractC14282b) {
        ifgVar.close();
        Surface surface = (Surface) this.f33885h.remove(ifgVar);
        if (surface != null) {
            this.f33878a.m35483r(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m37271E(final ifg ifgVar) {
        Surface surfaceX1 = ifgVar.X1(this.f33880c, new hu3() { // from class: o.xh5
            @Override // p001o.hu3
            public final void accept(Object obj) {
                this.f53786a.m37270D(ifgVar, (ifg.AbstractC14282b) obj);
            }
        });
        this.f33878a.m35475j(surfaceX1);
        this.f33885h.put(ifgVar, surfaceX1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m37272F() {
        this.f33887s = true;
        m37295q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m37273G(AbstractC15080b abstractC15080b) {
        this.f33888x.add(abstractC15080b);
    }

    /* renamed from: H */
    public static /* synthetic */ void m37274H(g32.C13614a c13614a) {
        c13614a.m28008f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ Object m37275I(int i, int i2, final g32.C13614a c13614a) {
        final i41 i41VarM37302d = AbstractC15080b.m37302d(i, i2, c13614a);
        m37297s(new Runnable() { // from class: o.zh5
            @Override // java.lang.Runnable
            public final void run() {
                this.f57190a.m37273G(i41VarM37302d);
            }
        }, new Runnable() { // from class: o.ai5
            @Override // java.lang.Runnable
            public final void run() {
                li5.m37274H(c13614a);
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    /* renamed from: w */
    public static /* synthetic */ void m37289w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m37290x(Runnable runnable, Runnable runnable2) {
        if (this.f33887s) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ Object m37291y(final y16 y16Var, final Map map, final g32.C13614a c13614a) {
        m37296r(new Runnable() { // from class: o.hi5
            @Override // java.lang.Runnable
            public final void run() {
                this.f27008a.m37292z(y16Var, map, c13614a);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m37292z(y16 y16Var, Map map, g32.C13614a c13614a) {
        try {
            this.f33878a.mo35473h(y16Var, map);
            c13614a.m28005c(null);
        } catch (RuntimeException e) {
            c13614a.m28008f(e);
        }
    }

    /* renamed from: J */
    public final void m37293J(vxh vxhVar) throws IOException {
        if (this.f33888x.isEmpty()) {
            return;
        }
        if (vxhVar == null) {
            m37298t(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = this.f33888x.iterator();
                int iMo31483c = -1;
                int iMo31482b = -1;
                Bitmap bitmapM37299u = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    AbstractC15080b abstractC15080b = (AbstractC15080b) it.next();
                    if (iMo31483c != abstractC15080b.mo31483c() || bitmapM37299u == null) {
                        iMo31483c = abstractC15080b.mo31483c();
                        if (bitmapM37299u != null) {
                            bitmapM37299u.recycle();
                        }
                        bitmapM37299u = m37299u((Size) vxhVar.m53591b(), (float[]) vxhVar.m53592c(), iMo31483c);
                        iMo31482b = -1;
                    }
                    if (iMo31482b != abstractC15080b.mo31482b()) {
                        byteArrayOutputStream.reset();
                        iMo31482b = abstractC15080b.mo31482b();
                        bitmapM37299u.compress(Bitmap.CompressFormat.JPEG, iMo31482b, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) vxhVar.m53590a();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.m4656k(surface, byteArray);
                    abstractC15080b.mo31481a().m28005c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            m37298t(e);
        }
    }

    @Override // p001o.mfg
    /* renamed from: a */
    public void mo22214a(final bgg bggVar) {
        if (this.f33882e.get()) {
            bggVar.m18924E();
            return;
        }
        Runnable runnable = new Runnable() { // from class: o.di5
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                this.f19928a.m37269C(bggVar);
            }
        };
        Objects.requireNonNull(bggVar);
        m37297s(runnable, new ei5(bggVar));
    }

    @Override // p001o.mfg
    /* renamed from: b */
    public void mo22215b(final ifg ifgVar) {
        if (this.f33882e.get()) {
            ifgVar.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: o.bi5
            @Override // java.lang.Runnable
            public final void run() {
                this.f16323a.m37271E(ifgVar);
            }
        };
        Objects.requireNonNull(ifgVar);
        m37297s(runnable, new ci5(ifgVar));
    }

    @Override // p001o.nfg
    /* renamed from: c */
    public zfa mo37294c(final int i, final int i2) {
        return bn7.m19407B(g32.m28002a(new g32.InterfaceC13616c() { // from class: o.yh5
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f55515a.m37275I(i, i2, c13614a);
            }
        }));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.f33882e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f33883f);
        vxh vxhVar = null;
        for (Map.Entry entry : this.f33885h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            ifg ifgVar = (ifg) entry.getKey();
            ifgVar.C1(this.f33884g, this.f33883f);
            if (ifgVar.mo32078l() == 34) {
                try {
                    this.f33878a.m35479n(surfaceTexture.getTimestamp(), this.f33884g, surface);
                } catch (RuntimeException e) {
                    wja.m54630d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                fgd.m26666j(ifgVar.mo32078l() == 256, "Unsupported format: " + ifgVar.mo32078l());
                fgd.m26666j(vxhVar == null, "Only one JPEG output is supported.");
                vxhVar = new vxh(surface, ifgVar.mo32077j(), (float[]) this.f33884g.clone());
            }
        }
        try {
            m37293J(vxhVar);
        } catch (RuntimeException e2) {
            m37298t(e2);
        }
    }

    /* renamed from: q */
    public final void m37295q() {
        if (this.f33887s && this.f33886q == 0) {
            Iterator it = this.f33885h.keySet().iterator();
            while (it.hasNext()) {
                ((ifg) it.next()).close();
            }
            Iterator it2 = this.f33888x.iterator();
            while (it2.hasNext()) {
                ((AbstractC15080b) it2.next()).mo31481a().m28008f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f33885h.clear();
            this.f33878a.mo35476k();
            this.f33879b.quit();
        }
    }

    /* renamed from: r */
    public final void m37296r(Runnable runnable) {
        m37297s(runnable, new Runnable() { // from class: o.ii5
            @Override // java.lang.Runnable
            public final void run() {
                li5.m37289w();
            }
        });
    }

    @Override // p001o.nfg
    public void release() {
        if (this.f33882e.getAndSet(true)) {
            return;
        }
        m37296r(new Runnable() { // from class: o.fi5
            @Override // java.lang.Runnable
            public final void run() {
                this.f23389a.m37272F();
            }
        });
    }

    /* renamed from: s */
    public final void m37297s(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f33880c.execute(new Runnable() { // from class: o.gi5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25278a.m37290x(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e) {
            wja.m54639m("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    /* renamed from: t */
    public final void m37298t(Throwable th) {
        Iterator it = this.f33888x.iterator();
        while (it.hasNext()) {
            ((AbstractC15080b) it.next()).mo31481a().m28008f(th);
        }
        this.f33888x.clear();
    }

    /* renamed from: u */
    public final Bitmap m37299u(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        sza.m49103c(fArr2, i, 0.5f, 0.5f);
        sza.m49104d(fArr2, 0.5f);
        return this.f33878a.m35481p(wuh.m55046o(size, i), fArr2);
    }

    /* renamed from: v */
    public final void m37300v(final y16 y16Var, final Map map) throws ExecutionException, InterruptedException {
        try {
            g32.m28002a(new g32.InterfaceC13616c() { // from class: o.vh5
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f50328a.m37291y(y16Var, map, c13614a);
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

    public li5(y16 y16Var, Map map) throws ExecutionException, InterruptedException {
        this.f33882e = new AtomicBoolean(false);
        this.f33883f = new float[16];
        this.f33884g = new float[16];
        this.f33885h = new LinkedHashMap();
        this.f33886q = 0;
        this.f33887s = false;
        this.f33888x = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f33879b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f33881d = handler;
        this.f33880c = gb2.m28296d(handler);
        this.f33878a = new kdc();
        try {
            m37300v(y16Var, map);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }
}
