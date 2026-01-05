package p001o;

/* loaded from: classes2.dex */
public abstract class z17 {

    /* renamed from: o.z17$b */
    public static final class C18542b {

        /* renamed from: a */
        public final long[] f56395a;

        /* renamed from: b */
        public final int[] f56396b;

        /* renamed from: c */
        public final int f56397c;

        /* renamed from: d */
        public final long[] f56398d;

        /* renamed from: e */
        public final int[] f56399e;

        /* renamed from: f */
        public final long f56400f;

        public C18542b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f56395a = jArr;
            this.f56396b = iArr;
            this.f56397c = i;
            this.f56398d = jArr2;
            this.f56399e = iArr2;
            this.f56400f = j;
        }
    }

    /* renamed from: a */
    public static C18542b m58638a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iM48731j = 0;
        for (int i3 : iArr) {
            iM48731j += sqi.m48731j(i3, i2);
        }
        long[] jArr2 = new long[iM48731j];
        int[] iArr2 = new int[iM48731j];
        long[] jArr3 = new long[iM48731j];
        int[] iArr3 = new int[iM48731j];
        int i4 = 0;
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            long j2 = jArr[i6];
            while (i7 > 0) {
                int iMin = Math.min(i2, i7);
                jArr2[i5] = j2;
                int i8 = i * iMin;
                iArr2[i5] = i8;
                iMax = Math.max(iMax, i8);
                jArr3[i5] = i4 * j;
                iArr3[i5] = 1;
                j2 += iArr2[i5];
                i4 += iMin;
                i7 -= iMin;
                i5++;
            }
        }
        return new C18542b(jArr2, iArr2, iMax, jArr3, iArr3, j * i4);
    }
}
