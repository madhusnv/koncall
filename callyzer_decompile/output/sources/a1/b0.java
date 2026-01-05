package a1;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import c0.x1;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import l0.C4310j;
import og.u1;
import r5.AbstractC6468c;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC0019r {

    /* renamed from: e */
    public SurfaceView f16e;

    /* renamed from: f */
    public final a0 f17f;

    public b0(FrameLayout frameLayout, C0009h c0009h) {
        super(frameLayout, c0009h);
        this.f17f = new a0(this);
    }

    @Override // a1.AbstractC0019r
    /* renamed from: c */
    public final View mo8c() {
        return this.f16e;
    }

    @Override // a1.AbstractC0019r
    /* renamed from: d */
    public final Bitmap mo9d() {
        SurfaceView surfaceView = this.f16e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f16e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f16e.getWidth(), this.f16e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.f16e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: a1.y
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                if (i10 == 0) {
                    u1.m10942a("SurfaceViewImpl");
                } else {
                    u1.m10943b("SurfaceViewImpl");
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                u1.m10943b("SurfaceViewImpl");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException unused) {
            u1.m10944c("SurfaceViewImpl");
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // a1.AbstractC0019r
    /* renamed from: g */
    public final void mo12g(x1 x1Var, C0013l c0013l) {
        SurfaceView surfaceView = this.f16e;
        boolean zEquals = Objects.equals((Size) this.f84b, x1Var.f5259b);
        if (surfaceView == null || !zEquals) {
            Size size = x1Var.f5259b;
            this.f84b = size;
            FrameLayout frameLayout = (FrameLayout) this.f85c;
            size.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f16e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.f84b).getWidth(), ((Size) this.f84b).getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f16e);
            this.f16e.getHolder().addCallback(this.f17f);
        }
        Executor executorM12452c = AbstractC6468c.m12452c(this.f16e.getContext());
        x1Var.f5267j.m15506a(new RunnableC0024w(0, c0013l), executorM12452c);
        this.f16e.post(new RunnableC0025x(0, this, x1Var, c0013l));
    }

    @Override // a1.AbstractC0019r
    /* renamed from: i */
    public final InterfaceFutureC8957d mo13i() {
        return C4310j.f21736c;
    }

    @Override // a1.AbstractC0019r
    /* renamed from: e */
    public final void mo10e() {
    }

    @Override // a1.AbstractC0019r
    /* renamed from: f */
    public final void mo11f() {
    }
}
