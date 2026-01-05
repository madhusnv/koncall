package g1;

import com.sun.mail.imap.IMAPStore;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 implements h1.a0 {

    /* renamed from: a */
    public float f11118a;

    /* renamed from: b */
    public float f11119b;

    @Override // h1.a0
    /* renamed from: O */
    public long mo6103O(float f6) {
        return ((long) ((((float) Math.log(this.f11118a / Math.abs(f6))) * 1000.0f) / this.f11119b)) * 1000000;
    }

    @Override // h1.a0
    /* renamed from: U */
    public float mo6104U(float f6, float f10) {
        if (Math.abs(f10) <= this.f11118a) {
            return f6;
        }
        double dLog = Math.log(Math.abs(r1 / f10));
        float f11 = this.f11119b;
        return ((f10 / f11) * ((float) Math.exp((f11 * ((dLog / f11) * IMAPStore.RESPONSE)) / 1000.0f))) + (f6 - (f10 / f11));
    }

    /* renamed from: a */
    public x0 m6105a(float f6) {
        double dM6106b = m6106b(f6);
        double d2 = z0.f11123a;
        double d10 = d2 - 1.0d;
        return new x0(f6, (float) (Math.exp((d2 / d10) * dM6106b) * this.f11118a * this.f11119b), (long) (Math.exp(dM6106b / d10) * 1000.0d));
    }

    /* renamed from: b */
    public double m6106b(float f6) {
        float[] fArr = AbstractC2422b.f10921a;
        return Math.log((Math.abs(f6) * 0.35f) / (this.f11118a * this.f11119b));
    }

    @Override // h1.a0
    /* renamed from: s */
    public float mo6107s() {
        return this.f11118a;
    }

    @Override // h1.a0
    /* renamed from: x */
    public float mo6108x(float f6, long j6) {
        return f6 * ((float) Math.exp(((j6 / 1000000) / 1000.0f) * this.f11119b));
    }

    @Override // h1.a0
    /* renamed from: y */
    public float mo6109y(float f6, float f10, long j6) {
        float f11 = this.f11119b;
        return ((f10 / f11) * ((float) Math.exp((f11 * (j6 / 1000000)) / 1000.0f))) + (f6 - (f10 / f11));
    }
}
