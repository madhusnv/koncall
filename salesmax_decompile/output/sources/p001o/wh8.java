package p001o;

import p001o.zaf;

/* loaded from: classes2.dex */
public final class wh8 implements zaf {

    /* renamed from: a */
    public final long[] f51997a;

    /* renamed from: b */
    public final long[] f51998b;

    /* renamed from: c */
    public final long f51999c;

    /* renamed from: d */
    public final boolean f52000d;

    public wh8(long[] jArr, long[] jArr2, long j) {
        op0.m42511a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f52000d = z;
        if (!z || jArr2[0] <= 0) {
            this.f51997a = jArr;
            this.f51998b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f51997a = jArr3;
            long[] jArr4 = new long[i];
            this.f51998b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f51999c = j;
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        if (!this.f52000d) {
            return new zaf.C18603a(bbf.f15876c);
        }
        int iM48728g = sqi.m48728g(this.f51998b, j, true, true);
        bbf bbfVar = new bbf(this.f51998b[iM48728g], this.f51997a[iM48728g]);
        if (bbfVar.f15877a == j || iM48728g == this.f51998b.length - 1) {
            return new zaf.C18603a(bbfVar);
        }
        int i = iM48728g + 1;
        return new zaf.C18603a(bbfVar, new bbf(this.f51998b[i], this.f51997a[i]));
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f51999c;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return this.f52000d;
    }
}
