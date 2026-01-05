package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.AbstractC1908c;
import androidx.camera.view.PreviewView;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001o.bgg;
import p001o.bn7;
import p001o.c64;
import p001o.fgd;
import p001o.g32;
import p001o.gb2;
import p001o.hu3;
import p001o.qm7;
import p001o.wja;
import p001o.zfa;

/* renamed from: androidx.camera.view.e */
/* loaded from: classes2.dex */
public final class C1910e extends AbstractC1908c {

    /* renamed from: e */
    public TextureView f6194e;

    /* renamed from: f */
    public SurfaceTexture f6195f;

    /* renamed from: g */
    public zfa f6196g;

    /* renamed from: h */
    public bgg f6197h;

    /* renamed from: i */
    public boolean f6198i;

    /* renamed from: j */
    public SurfaceTexture f6199j;

    /* renamed from: k */
    public AtomicReference f6200k;

    /* renamed from: l */
    public AbstractC1908c.a f6201l;

    /* renamed from: m */
    public Executor f6202m;

    /* renamed from: androidx.camera.view.e$a */
    public class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.e$a$a, reason: collision with other inner class name */
        public class C19553a implements qm7 {

            /* renamed from: a */
            public final /* synthetic */ SurfaceTexture f6204a;

            public C19553a(SurfaceTexture surfaceTexture) {
                this.f6204a = surfaceTexture;
            }

            @Override // p001o.qm7
            /* renamed from: a */
            public void mo4761a(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }

            @Override // p001o.qm7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(bgg.AbstractC12389g abstractC12389g) {
                fgd.m26666j(abstractC12389g.mo18940a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                wja.m54627a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f6204a.release();
                C1910e c1910e = C1910e.this;
                if (c1910e.f6199j != null) {
                    c1910e.f6199j = null;
                }
            }
        }

        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            wja.m54627a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
            C1910e c1910e = C1910e.this;
            c1910e.f6195f = surfaceTexture;
            if (c1910e.f6196g == null) {
                c1910e.m4818v();
                return;
            }
            fgd.m26663g(c1910e.f6197h);
            wja.m54627a("TextureViewImpl", "Surface invalidated " + C1910e.this.f6197h);
            C1910e.this.f6197h.m18928m().mo30396d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C1910e c1910e = C1910e.this;
            c1910e.f6195f = null;
            zfa zfaVar = c1910e.f6196g;
            if (zfaVar == null) {
                wja.m54627a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            bn7.m19424j(zfaVar, new C19553a(surfaceTexture), c64.getMainExecutor(C1910e.this.f6194e.getContext()));
            C1910e.this.f6199j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            wja.m54627a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            g32.C13614a c13614a = (g32.C13614a) C1910e.this.f6200k.getAndSet(null);
            if (c13614a != null) {
                c13614a.m28005c(null);
            }
            C1910e.this.getClass();
            Executor executor = C1910e.this.f6202m;
        }
    }

    public C1910e(FrameLayout frameLayout, C1907b c1907b) {
        super(frameLayout, c1907b);
        this.f6198i = false;
        this.f6200k = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m4811p(bgg bggVar) {
        bgg bggVar2 = this.f6197h;
        if (bggVar2 != null && bggVar2 == bggVar) {
            this.f6197h = null;
            this.f6196g = null;
        }
        m4816t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m4812q(Surface surface, final g32.C13614a c13614a) throws ExecutionException, InterruptedException {
        wja.m54627a("TextureViewImpl", "Surface set on Preview.");
        bgg bggVar = this.f6197h;
        Executor executorM28293a = gb2.m28293a();
        Objects.requireNonNull(c13614a);
        bggVar.m18921B(surface, executorM28293a, new hu3() { // from class: o.akh
            @Override // p001o.hu3
            public final void accept(Object obj) {
                c13614a.m28005c((bgg.AbstractC12389g) obj);
            }
        });
        return "provideSurface[request=" + this.f6197h + " surface=" + surface + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m4813r(Surface surface, zfa zfaVar, bgg bggVar) {
        wja.m54627a("TextureViewImpl", "Safe to release surface.");
        m4816t();
        surface.release();
        if (this.f6196g == zfaVar) {
            this.f6196g = null;
        }
        if (this.f6197h == bggVar) {
            this.f6197h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m4814s(g32.C13614a c13614a) {
        this.f6200k.set(c13614a);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: b */
    public View mo4783b() {
        return this.f6194e;
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: c */
    public Bitmap mo4784c() {
        TextureView textureView = this.f6194e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f6194e.getBitmap();
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: d */
    public void mo4785d() {
        m4817u();
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: e */
    public void mo4786e() {
        this.f6198i = true;
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: g */
    public void mo4788g(final bgg bggVar, AbstractC1908c.a aVar) {
        this.f6180a = bggVar.m18930o();
        this.f6201l = aVar;
        m4815o();
        bgg bggVar2 = this.f6197h;
        if (bggVar2 != null) {
            bggVar2.m18924E();
        }
        this.f6197h = bggVar;
        bggVar.m18925j(c64.getMainExecutor(this.f6194e.getContext()), new Runnable() { // from class: o.wjh
            @Override // java.lang.Runnable
            public final void run() {
                this.f52242a.m4811p(bggVar);
            }
        });
        m4818v();
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: i */
    public void mo4790i(Executor executor, PreviewView.InterfaceC1901d interfaceC1901d) {
        this.f6202m = executor;
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: j */
    public zfa mo4791j() {
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.zjh
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f57302a.m4814s(c13614a);
            }
        });
    }

    /* renamed from: o */
    public void m4815o() {
        fgd.m26663g(this.f6181b);
        fgd.m26663g(this.f6180a);
        TextureView textureView = new TextureView(this.f6181b.getContext());
        this.f6194e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f6180a.getWidth(), this.f6180a.getHeight()));
        this.f6194e.setSurfaceTextureListener(new a());
        this.f6181b.removeAllViews();
        this.f6181b.addView(this.f6194e);
    }

    /* renamed from: t */
    public final void m4816t() {
        AbstractC1908c.a aVar = this.f6201l;
        if (aVar != null) {
            aVar.mo4792a();
            this.f6201l = null;
        }
    }

    /* renamed from: u */
    public final void m4817u() {
        if (!this.f6198i || this.f6199j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f6194e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f6199j;
        if (surfaceTexture != surfaceTexture2) {
            this.f6194e.setSurfaceTexture(surfaceTexture2);
            this.f6199j = null;
            this.f6198i = false;
        }
    }

    /* renamed from: v */
    public void m4818v() {
        SurfaceTexture surfaceTexture;
        Size size = this.f6180a;
        if (size == null || (surfaceTexture = this.f6195f) == null || this.f6197h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f6180a.getHeight());
        final Surface surface = new Surface(this.f6195f);
        final bgg bggVar = this.f6197h;
        final zfa zfaVarM28002a = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.xjh
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f53855a.m4812q(surface, c13614a);
            }
        });
        this.f6196g = zfaVarM28002a;
        zfaVarM28002a.addListener(new Runnable() { // from class: o.yjh
            @Override // java.lang.Runnable
            public final void run() {
                this.f55615a.m4813r(surface, zfaVarM28002a, bggVar);
            }
        }, c64.getMainExecutor(this.f6194e.getContext()));
        m4787f();
    }
}
