package s2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s2.j */
/* loaded from: classes.dex */
public final class C6741j {

    /* renamed from: a */
    public final int f32191a;

    /* renamed from: b */
    public final long[] f32192b;

    /* renamed from: c */
    public final Object[] f32193c;

    public C6741j(int i10, long[] jArr, Object[] objArr) {
        this.f32191a = i10;
        this.f32192b = jArr;
        this.f32193c = objArr;
    }

    /* renamed from: a */
    public final int m12904a(long j6) {
        int i10 = this.f32191a - 1;
        if (i10 != -1) {
            long[] jArr = this.f32192b;
            int i11 = 0;
            if (i10 != 0) {
                while (i11 <= i10) {
                    int i12 = (i11 + i10) >>> 1;
                    long j10 = jArr[i12] - j6;
                    if (j10 < 0) {
                        i11 = i12 + 1;
                    } else {
                        if (j10 <= 0) {
                            return i12;
                        }
                        i10 = i12 - 1;
                    }
                }
                return -(i11 + 1);
            }
            long j11 = jArr[0];
            if (j11 == j6) {
                return 0;
            }
            if (j11 > j6) {
                return -2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C6741j m12905b(long j6, Object obj) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f32193c;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f32192b;
                i10 = this.f32191a;
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j10 = jArr[i14];
                Object obj3 = objArr[i14];
                if (j10 > j6) {
                    jArr2[i11] = j6;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i11] = j10;
                    objArr2[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr2[i12] = j6;
                objArr2[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j11 = jArr[i14];
                    Object obj4 = objArr[i14];
                    if (obj4 != null) {
                        jArr2[i11] = j11;
                        objArr2[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = j6;
            objArr2[0] = obj;
        }
        return new C6741j(i13, jArr2, objArr2);
    }
}
