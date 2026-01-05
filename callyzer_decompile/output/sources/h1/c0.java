package h1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 implements InterfaceC2795z {

    /* renamed from: a */
    public final int f15369a;

    /* renamed from: b */
    public final InterfaceC2792w f15370b;

    /* renamed from: c */
    public final long f15371c;

    /* renamed from: d */
    public final long f15372d;

    public c0(int i10, int i11, InterfaceC2792w interfaceC2792w) {
        this.f15369a = i10;
        this.f15370b = interfaceC2792w;
        this.f15371c = i10 * 1000000;
        this.f15372d = i11 * 1000000;
    }

    @Override // h1.InterfaceC2795z
    /* renamed from: b */
    public final long mo6767b(float f6, float f10, float f11) {
        return this.f15372d + this.f15371c;
    }

    @Override // h1.InterfaceC2795z
    /* renamed from: c */
    public final float mo6768c(float f6, float f10, float f11, long j6) {
        long j10 = j6 - this.f15372d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f15371c;
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 == 0) {
            return f11;
        }
        return (mo6770e(f6, f10, f11, j12) - mo6770e(f6, f10, f11, j12 - 1000000)) * 1000.0f;
    }

    @Override // h1.InterfaceC2795z
    /* renamed from: e */
    public final float mo6770e(float f6, float f10, float f11, long j6) {
        long j10 = j6 - this.f15372d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f15371c;
        if (j10 > j11) {
            j10 = j11;
        }
        float fMo6654c = this.f15370b.mo6654c(this.f15369a == 0 ? 1.0f : j10 / j11);
        return (f10 * fMo6654c) + ((1 - fMo6654c) * f6);
    }
}
