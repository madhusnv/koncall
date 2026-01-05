package p001o;

import java.util.Arrays;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class n93 implements zaf {

    /* renamed from: a */
    public final int f36578a;

    /* renamed from: b */
    public final int[] f36579b;

    /* renamed from: c */
    public final long[] f36580c;

    /* renamed from: d */
    public final long[] f36581d;

    /* renamed from: e */
    public final long[] f36582e;

    /* renamed from: f */
    public final long f36583f;

    public n93(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f36579b = iArr;
        this.f36580c = jArr;
        this.f36581d = jArr2;
        this.f36582e = jArr3;
        int length = iArr.length;
        this.f36578a = length;
        if (length > 0) {
            this.f36583f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f36583f = 0L;
        }
    }

    /* renamed from: a */
    public int m40253a(long j) {
        return sqi.m48728g(this.f36582e, j, true, true);
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        int iM40253a = m40253a(j);
        bbf bbfVar = new bbf(this.f36582e[iM40253a], this.f36580c[iM40253a]);
        if (bbfVar.f15877a >= j || iM40253a == this.f36578a - 1) {
            return new zaf.C18603a(bbfVar);
        }
        int i = iM40253a + 1;
        return new zaf.C18603a(bbfVar, new bbf(this.f36582e[i], this.f36580c[i]));
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f36583f;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f36578a + ", sizes=" + Arrays.toString(this.f36579b) + ", offsets=" + Arrays.toString(this.f36580c) + ", timeUs=" + Arrays.toString(this.f36582e) + ", durationsUs=" + Arrays.toString(this.f36581d) + ")";
    }
}
