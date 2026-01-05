package p001o;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes2.dex */
public final class tkh {

    /* renamed from: a */
    public final int f47356a;

    /* renamed from: b */
    public final long[] f47357b;

    /* renamed from: c */
    public final Object[] f47358c;

    public tkh(int i, long[] jArr, Object[] objArr) {
        sq8.m48649h(jArr, UserMetadata.KEYDATA_FILENAME);
        sq8.m48649h(objArr, "values");
        this.f47356a = i;
        this.f47357b = jArr;
        this.f47358c = objArr;
    }

    /* renamed from: a */
    public final int m50143a(long j) {
        int i = this.f47356a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = this.f47357b[0];
            if (j2 == j) {
                return 0;
            }
            return j2 > j ? -2 : -1;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = this.f47357b[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: b */
    public final Object m50144b(long j) {
        int iM50143a = m50143a(j);
        if (iM50143a >= 0) {
            return this.f47358c[iM50143a];
        }
        return null;
    }

    /* renamed from: c */
    public final tkh m50145c(long j, Object obj) {
        int i = this.f47356a;
        Object[] objArr = this.f47358c;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] != null) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = this.f47357b[i6];
                Object obj2 = this.f47358c[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = this.f47357b[i6];
                    Object obj3 = this.f47358c[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new tkh(i5, jArr, objArr2);
    }

    /* renamed from: d */
    public final boolean m50146d(long j, Object obj) {
        int iM50143a = m50143a(j);
        if (iM50143a < 0) {
            return false;
        }
        this.f47358c[iM50143a] = obj;
        return true;
    }
}
