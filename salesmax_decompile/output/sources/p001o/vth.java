package p001o;

/* loaded from: classes2.dex */
public final class vth {

    /* renamed from: a */
    public final mth f50880a;

    /* renamed from: b */
    public final int f50881b;

    /* renamed from: c */
    public final long[] f50882c;

    /* renamed from: d */
    public final int[] f50883d;

    /* renamed from: e */
    public final int f50884e;

    /* renamed from: f */
    public final long[] f50885f;

    /* renamed from: g */
    public final int[] f50886g;

    /* renamed from: h */
    public final long f50887h;

    public vth(mth mthVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        op0.m42511a(iArr.length == jArr2.length);
        op0.m42511a(jArr.length == jArr2.length);
        op0.m42511a(iArr2.length == jArr2.length);
        this.f50880a = mthVar;
        this.f50882c = jArr;
        this.f50883d = iArr;
        this.f50884e = i;
        this.f50885f = jArr2;
        this.f50886g = iArr2;
        this.f50887h = j;
        this.f50881b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int m53410a(long j) {
        for (int iM48728g = sqi.m48728g(this.f50885f, j, true, false); iM48728g >= 0; iM48728g--) {
            if ((this.f50886g[iM48728g] & 1) != 0) {
                return iM48728g;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m53411b(long j) {
        for (int iM48725d = sqi.m48725d(this.f50885f, j, true, false); iM48725d < this.f50885f.length; iM48725d++) {
            if ((this.f50886g[iM48725d] & 1) != 0) {
                return iM48725d;
            }
        }
        return -1;
    }
}
