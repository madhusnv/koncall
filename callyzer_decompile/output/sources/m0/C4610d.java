package m0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import b6.InterfaceC0600a;
import h1.g2;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.C6062c;
import q0.C6070k;
import r0.C6412c;
import r0.C6414e;
import s0.AbstractC6705i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m0.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C4610d implements InterfaceC0600a {

    /* renamed from: a */
    public final /* synthetic */ int f22829a;

    /* renamed from: b */
    public final /* synthetic */ Object f22830b;

    /* renamed from: c */
    public final /* synthetic */ Object f22831c;

    public /* synthetic */ C4610d(int i10, Object obj, Object obj2) {
        this.f22829a = i10;
        this.f22830b = obj;
        this.f22831c = obj2;
    }

    @Override // b6.InterfaceC0600a
    public final void accept(Object obj) {
        switch (this.f22829a) {
            case 0:
                Surface surface = (Surface) this.f22830b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f22831c;
                surface.release();
                surfaceTexture.release();
                break;
            case 1:
                C6062c c6062c = (C6062c) this.f22830b;
                C6070k c6070k = (C6070k) this.f22831c;
                c6070k.close();
                Surface surface2 = (Surface) c6062c.f29571h.remove(c6070k);
                if (surface2 != null) {
                    g2 g2Var = c6062c.f29564a;
                    AbstractC6705i.m12835d((AtomicBoolean) g2Var.f15432c, true);
                    AbstractC6705i.m12834c((Thread) g2Var.f15434e);
                    g2Var.m6823o(surface2, true);
                    break;
                }
                break;
            default:
                C6414e c6414e = (C6414e) this.f22830b;
                C6070k c6070k2 = (C6070k) this.f22831c;
                c6070k2.close();
                Surface surface3 = (Surface) c6414e.f30938h.remove(c6070k2);
                if (surface3 != null) {
                    C6412c c6412c = c6414e.f30931a;
                    AbstractC6705i.m12835d((AtomicBoolean) c6412c.f15432c, true);
                    AbstractC6705i.m12834c((Thread) c6412c.f15434e);
                    c6412c.m6823o(surface3, true);
                    break;
                }
                break;
        }
    }
}
