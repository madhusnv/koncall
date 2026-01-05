package c6;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a */
    public float f5465a;

    /* renamed from: b */
    public final Interpolator f5466b;

    /* renamed from: c */
    public final long f5467c;

    public h1(Interpolator interpolator, long j6) {
        this.f5466b = interpolator;
        this.f5467c = j6;
    }

    /* renamed from: a */
    public long mo2385a() {
        return this.f5467c;
    }

    /* renamed from: b */
    public float mo2386b() {
        Interpolator interpolator = this.f5466b;
        return interpolator != null ? interpolator.getInterpolation(this.f5465a) : this.f5465a;
    }

    /* renamed from: c */
    public void mo2387c(float f6) {
        this.f5465a = f6;
    }
}
