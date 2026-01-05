package q0;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import c0.C0814g;
import l0.AbstractC4308h;
import l0.C4310j;
import l0.InterfaceC4301a;
import og.y0;
import pg.t8;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q0.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C6066g implements InterfaceC4301a {

    /* renamed from: a */
    public final /* synthetic */ C6069j f29581a;

    /* renamed from: b */
    public final /* synthetic */ C6068i f29582b;

    /* renamed from: c */
    public final /* synthetic */ int f29583c;

    /* renamed from: d */
    public final /* synthetic */ C0814g f29584d;

    /* renamed from: e */
    public final /* synthetic */ C0814g f29585e;

    public /* synthetic */ C6066g(C6069j c6069j, C6068i c6068i, int i10, C0814g c0814g, C0814g c0814g2) {
        this.f29581a = c6069j;
        this.f29582b = c6068i;
        this.f29583c = i10;
        this.f29584d = c0814g;
        this.f29585e = c0814g2;
    }

    @Override // l0.InterfaceC4301a, p016r.InterfaceC6409a
    public final InterfaceFutureC8957d apply(Object obj) {
        C6068i c6068i = this.f29582b;
        Surface surface = (Surface) obj;
        C6069j c6069j = this.f29581a;
        c6069j.getClass();
        surface.getClass();
        try {
            c6068i.m7419d();
            C6070k c6070k = new C6070k(surface, this.f29583c, c6069j.f29599g.f16522a, this.f29584d, this.f29585e);
            c6070k.f29617k.f39850b.mo9026a(new RunnableC6065f(c6068i, 1), t8.m11872a());
            y0.m11056f("Consumer can only be linked once.", c6068i.f29592r == null);
            c6068i.f29592r = c6070k;
            return AbstractC4308h.m9033c(c6070k);
        } catch (DeferrableSurface$SurfaceClosedException e2) {
            return new C4310j(1, e2);
        }
    }
}
