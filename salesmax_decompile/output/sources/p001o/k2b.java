package p001o;

import android.view.Surface;

/* loaded from: classes2.dex */
public class k2b extends p1b {

    /* renamed from: d */
    public final int f31396d;

    /* renamed from: e */
    public final boolean f31397e;

    public k2b(Throwable th, q1b q1bVar, Surface surface) {
        super(th, q1bVar);
        this.f31396d = System.identityHashCode(surface);
        this.f31397e = surface == null || surface.isValid();
    }
}
