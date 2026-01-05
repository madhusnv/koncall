package a1;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import c0.x1;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import pg.i7;
import r5.AbstractC6468c;
import x4.C8302l;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends AbstractC0019r {

    /* renamed from: e */
    public TextureView f42e;

    /* renamed from: f */
    public SurfaceTexture f43f;

    /* renamed from: g */
    public C8302l f44g;

    /* renamed from: h */
    public x1 f45h;

    /* renamed from: i */
    public boolean f46i;

    /* renamed from: j */
    public SurfaceTexture f47j;

    /* renamed from: k */
    public AtomicReference f48k;

    /* renamed from: l */
    public C0013l f49l;

    @Override // a1.AbstractC0019r
    /* renamed from: c */
    public final View mo8c() {
        return this.f42e;
    }

    @Override // a1.AbstractC0019r
    /* renamed from: d */
    public final Bitmap mo9d() {
        TextureView textureView = this.f42e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f42e.getBitmap();
    }

    @Override // a1.AbstractC0019r
    /* renamed from: e */
    public final void mo10e() {
        if (!this.f46i || this.f47j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f42e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f47j;
        if (surfaceTexture != surfaceTexture2) {
            this.f42e.setSurfaceTexture(surfaceTexture2);
            this.f47j = null;
            this.f46i = false;
        }
    }

    @Override // a1.AbstractC0019r
    /* renamed from: f */
    public final void mo11f() {
        this.f46i = true;
    }

    @Override // a1.AbstractC0019r
    /* renamed from: g */
    public final void mo12g(x1 x1Var, C0013l c0013l) {
        Size size = x1Var.f5259b;
        this.f84b = size;
        this.f49l = c0013l;
        FrameLayout frameLayout = (FrameLayout) this.f85c;
        size.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f42e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.f84b).getWidth(), ((Size) this.f84b).getHeight()));
        this.f42e.setSurfaceTextureListener(new e0(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f42e);
        x1 x1Var2 = this.f45h;
        if (x1Var2 != null) {
            x1Var2.m2238c();
        }
        this.f45h = x1Var;
        Executor executorM12452c = AbstractC6468c.m12452c(this.f42e.getContext());
        x1Var.f5267j.m15506a(new RunnableC0012k(1, this, x1Var), executorM12452c);
        m89j();
    }

    @Override // a1.AbstractC0019r
    /* renamed from: i */
    public final InterfaceFutureC8957d mo13i() {
        return i7.m11697b(new c0(0, this));
    }

    /* renamed from: j */
    public final void m89j() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) this.f84b;
        if (size == null || (surfaceTexture = this.f43f) == null || this.f45h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) this.f84b).getHeight());
        Surface surface = new Surface(this.f43f);
        x1 x1Var = this.f45h;
        C8302l c8302lM11697b = i7.m11697b(new C0004c(1, this, surface));
        this.f44g = c8302lM11697b;
        c8302lM11697b.f39850b.mo9026a(new d0(this, surface, c8302lM11697b, x1Var, 0), AbstractC6468c.m12452c(this.f42e.getContext()));
        this.f83a = true;
        m102h();
    }
}
