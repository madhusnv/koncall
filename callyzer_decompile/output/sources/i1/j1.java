package i1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends h1 {
    @Override // i1.h1, i1.f1
    /* renamed from: a */
    public final void mo7496a(long j6, long j10) {
        if (!Float.isNaN(Float.NaN)) {
            this.f16880a.setZoom(Float.NaN);
        }
        if ((9223372034707292159L & j10) != 9205357640488583168L) {
            this.f16880a.show(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        } else {
            this.f16880a.show(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)));
        }
    }
}
