package a1;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import c0.x1;
import java.util.Objects;
import og.u1;
import r5.AbstractC6468c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements SurfaceHolder.Callback {

    /* renamed from: a */
    public Size f7a;

    /* renamed from: b */
    public x1 f8b;

    /* renamed from: c */
    public x1 f9c;

    /* renamed from: d */
    public C0013l f10d;

    /* renamed from: e */
    public Size f11e;

    /* renamed from: f */
    public boolean f12f = false;

    /* renamed from: g */
    public boolean f13g = false;

    /* renamed from: h */
    public final /* synthetic */ b0 f14h;

    public a0(b0 b0Var) {
        this.f14h = b0Var;
    }

    /* renamed from: a */
    public final void m6a() {
        x1 x1Var = this.f8b;
        if (x1Var != null) {
            Objects.toString(x1Var);
            u1.m10942a("SurfaceViewImpl");
            this.f8b.m2238c();
        }
    }

    /* renamed from: b */
    public final boolean m7b() {
        b0 b0Var = this.f14h;
        Surface surface = b0Var.f16e.getHolder().getSurface();
        if (this.f12f || this.f8b == null || !Objects.equals(this.f7a, this.f11e)) {
            return false;
        }
        u1.m10942a("SurfaceViewImpl");
        C0013l c0013l = this.f10d;
        x1 x1Var = this.f8b;
        Objects.requireNonNull(x1Var);
        x1Var.m2236a(surface, AbstractC6468c.m12452c(b0Var.f16e.getContext()), new C0027z(0, c0013l));
        this.f12f = true;
        b0Var.f83a = true;
        b0Var.m102h();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        u1.m10942a("SurfaceViewImpl");
        this.f11e = new Size(i11, i12);
        m7b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        x1 x1Var;
        u1.m10942a("SurfaceViewImpl");
        if (!this.f13g || (x1Var = this.f9c) == null) {
            return;
        }
        x1Var.m2238c();
        x1Var.f5266i.m15507b(null);
        this.f9c = null;
        this.f13g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        u1.m10942a("SurfaceViewImpl");
        if (this.f12f) {
            x1 x1Var = this.f8b;
            if (x1Var != null) {
                Objects.toString(x1Var);
                u1.m10942a("SurfaceViewImpl");
                this.f8b.f5268k.mo7416a();
            }
        } else {
            m6a();
        }
        this.f13g = true;
        x1 x1Var2 = this.f8b;
        if (x1Var2 != null) {
            this.f9c = x1Var2;
        }
        this.f12f = false;
        this.f8b = null;
        this.f10d = null;
        this.f11e = null;
        this.f7a = null;
    }
}
