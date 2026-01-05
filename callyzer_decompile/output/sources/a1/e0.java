package a1;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import c9.C0908c;
import java.util.Objects;
import l0.RunnableC4307g;
import og.u1;
import r5.AbstractC6468c;
import x4.C8299i;
import x4.C8302l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ f0 f35a;

    public e0(f0 f0Var) {
        this.f35a = f0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        u1.m10942a("TextureViewImpl");
        f0 f0Var = this.f35a;
        f0Var.f43f = surfaceTexture;
        if (f0Var.f44g == null) {
            f0Var.m89j();
            return;
        }
        f0Var.f45h.getClass();
        Objects.toString(f0Var.f45h);
        u1.m10942a("TextureViewImpl");
        f0Var.f45h.f5268k.mo7416a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f35a;
        f0Var.f43f = null;
        C8302l c8302l = f0Var.f44g;
        if (c8302l == null) {
            u1.m10942a("TextureViewImpl");
            return true;
        }
        C0908c c0908c = new C0908c(1, this, surfaceTexture);
        c8302l.mo9026a(new RunnableC4307g(0, c8302l, c0908c), AbstractC6468c.m12452c(f0Var.f42e.getContext()));
        f0Var.f47j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        u1.m10942a("TextureViewImpl");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C8299i c8299i = (C8299i) this.f35a.f48k.getAndSet(null);
        if (c8299i != null) {
            c8299i.m15507b(null);
        }
    }
}
