package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.AbstractC1908c;
import androidx.camera.view.C1909d;
import androidx.camera.view.PreviewView;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p001o.bgg;
import p001o.bn7;
import p001o.c64;
import p001o.fgd;
import p001o.hu3;
import p001o.wja;
import p001o.zfa;

/* renamed from: androidx.camera.view.d */
/* loaded from: classes2.dex */
public final class C1909d extends AbstractC1908c {

    /* renamed from: e */
    public SurfaceView f6184e;

    /* renamed from: f */
    public final b f6185f;

    /* renamed from: androidx.camera.view.d$a */
    public static class a {
        /* renamed from: a */
        public static void m4799a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* renamed from: androidx.camera.view.d$b */
    public class b implements SurfaceHolder.Callback {

        /* renamed from: a */
        public Size f6186a;

        /* renamed from: b */
        public bgg f6187b;

        /* renamed from: c */
        public bgg f6188c;

        /* renamed from: d */
        public AbstractC1908c.a f6189d;

        /* renamed from: e */
        public Size f6190e;

        /* renamed from: f */
        public boolean f6191f = false;

        /* renamed from: g */
        public boolean f6192g = false;

        public b() {
        }

        /* renamed from: e */
        public static /* synthetic */ void m4801e(AbstractC1908c.a aVar, bgg.AbstractC12389g abstractC12389g) {
            wja.m54627a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.mo4792a();
            }
        }

        /* renamed from: b */
        public final boolean m4802b() {
            return (this.f6191f || this.f6187b == null || !Objects.equals(this.f6186a, this.f6190e)) ? false : true;
        }

        /* renamed from: c */
        public final void m4803c() {
            if (this.f6187b != null) {
                wja.m54627a("SurfaceViewImpl", "Request canceled: " + this.f6187b);
                this.f6187b.m18924E();
            }
        }

        /* renamed from: d */
        public final void m4804d() {
            if (this.f6187b != null) {
                wja.m54627a("SurfaceViewImpl", "Surface closed " + this.f6187b);
                this.f6187b.m18928m().mo30396d();
            }
        }

        /* renamed from: f */
        public void m4805f(bgg bggVar, AbstractC1908c.a aVar) {
            m4803c();
            if (this.f6192g) {
                this.f6192g = false;
                bggVar.m18932q();
                return;
            }
            this.f6187b = bggVar;
            this.f6189d = aVar;
            Size sizeM18930o = bggVar.m18930o();
            this.f6186a = sizeM18930o;
            this.f6191f = false;
            if (m4806g()) {
                return;
            }
            wja.m54627a("SurfaceViewImpl", "Wait for new Surface creation.");
            C1909d.this.f6184e.getHolder().setFixedSize(sizeM18930o.getWidth(), sizeM18930o.getHeight());
        }

        /* renamed from: g */
        public final boolean m4806g() throws ExecutionException, InterruptedException {
            Surface surface = C1909d.this.f6184e.getHolder().getSurface();
            if (!m4802b()) {
                return false;
            }
            wja.m54627a("SurfaceViewImpl", "Surface set on Preview.");
            final AbstractC1908c.a aVar = this.f6189d;
            bgg bggVar = this.f6187b;
            Objects.requireNonNull(bggVar);
            bggVar.m18921B(surface, c64.getMainExecutor(C1909d.this.f6184e.getContext()), new hu3() { // from class: o.igg
                @Override // p001o.hu3
                public final void accept(Object obj) {
                    C1909d.b.m4801e(aVar, (bgg.AbstractC12389g) obj);
                }
            });
            this.f6191f = true;
            C1909d.this.m4787f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) throws ExecutionException, InterruptedException {
            wja.m54627a("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.f6190e = new Size(i2, i3);
            m4806g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            bgg bggVar;
            wja.m54627a("SurfaceViewImpl", "Surface created.");
            if (!this.f6192g || (bggVar = this.f6188c) == null) {
                return;
            }
            bggVar.m18932q();
            this.f6188c = null;
            this.f6192g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            wja.m54627a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f6191f) {
                m4804d();
            } else {
                m4803c();
            }
            this.f6192g = true;
            bgg bggVar = this.f6187b;
            if (bggVar != null) {
                this.f6188c = bggVar;
            }
            this.f6191f = false;
            this.f6187b = null;
            this.f6189d = null;
            this.f6190e = null;
            this.f6186a = null;
        }
    }

    public C1909d(FrameLayout frameLayout, C1907b c1907b) {
        super(frameLayout, c1907b);
        this.f6185f = new b();
    }

    /* renamed from: n */
    public static /* synthetic */ void m4795n(Semaphore semaphore, int i) {
        if (i == 0) {
            wja.m54627a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            wja.m54629c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
        }
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m4796o(bgg bggVar, AbstractC1908c.a aVar) {
        this.f6185f.m4805f(bggVar, aVar);
    }

    /* renamed from: p */
    public static boolean m4797p(SurfaceView surfaceView, Size size, bgg bggVar) {
        return surfaceView != null && Objects.equals(size, bggVar.m18930o());
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: b */
    public View mo4783b() {
        return this.f6184e;
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: c */
    public Bitmap mo4784c() {
        SurfaceView surfaceView = this.f6184e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f6184e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f6184e.getWidth(), this.f6184e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.m4799a(this.f6184e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: o.hgg
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                C1909d.m4795n(semaphore, i);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    wja.m54629c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                }
            } catch (InterruptedException e) {
                wja.m54630d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            }
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: d */
    public void mo4785d() {
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: e */
    public void mo4786e() {
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: g */
    public void mo4788g(final bgg bggVar, final AbstractC1908c.a aVar) {
        if (!m4797p(this.f6184e, this.f6180a, bggVar)) {
            this.f6180a = bggVar.m18930o();
            m4798m();
        }
        if (aVar != null) {
            bggVar.m18925j(c64.getMainExecutor(this.f6184e.getContext()), new Runnable() { // from class: o.fgg
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.mo4792a();
                }
            });
        }
        this.f6184e.post(new Runnable() { // from class: o.ggg
            @Override // java.lang.Runnable
            public final void run() {
                this.f25113a.m4796o(bggVar, aVar);
            }
        });
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: i */
    public void mo4790i(Executor executor, PreviewView.InterfaceC1901d interfaceC1901d) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    @Override // androidx.camera.view.AbstractC1908c
    /* renamed from: j */
    public zfa mo4791j() {
        return bn7.m19430p(null);
    }

    /* renamed from: m */
    public void m4798m() {
        fgd.m26663g(this.f6181b);
        fgd.m26663g(this.f6180a);
        SurfaceView surfaceView = new SurfaceView(this.f6181b.getContext());
        this.f6184e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f6180a.getWidth(), this.f6180a.getHeight()));
        this.f6181b.removeAllViews();
        this.f6181b.addView(this.f6184e);
        this.f6184e.getHolder().addCallback(this.f6185f);
    }
}
