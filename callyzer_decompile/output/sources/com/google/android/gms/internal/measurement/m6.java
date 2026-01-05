package com.google.android.gms.internal.measurement;

import a2.AbstractC0030c;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m6 {

    /* renamed from: f */
    public static final m6 f6295f = new m6(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f6296a;

    /* renamed from: b */
    public int[] f6297b;

    /* renamed from: c */
    public Object[] f6298c;

    /* renamed from: d */
    public int f6299d = -1;

    /* renamed from: e */
    public boolean f6300e;

    public m6(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.f6296a = i10;
        this.f6297b = iArr;
        this.f6298c = objArr;
        this.f6300e = z6;
    }

    /* renamed from: a */
    public static m6 m3494a() {
        return new m6(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public final void m3495b(v5 v5Var) {
        if (this.f6296a != 0) {
            for (int i10 = 0; i10 < this.f6296a; i10++) {
                int i11 = this.f6297b[i10];
                Object obj = this.f6298c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ((a5) v5Var.f6423a).m3118g(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ((a5) v5Var.f6423a).m3119h(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    a5 a5Var = (a5) v5Var.f6423a;
                    a5Var.m3123l((i13 << 3) | 2);
                    a5Var.m3120i((z4) obj);
                } else if (i12 == 3) {
                    ((a5) v5Var.f6423a).m3114c(i13, 3);
                    ((m6) obj).m3495b(v5Var);
                    ((a5) v5Var.f6423a).m3114c(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzmq());
                    }
                    ((a5) v5Var.f6423a).m3117f(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* renamed from: c */
    public final int m3496c() {
        int iM3113r;
        int iM3111a;
        int iM3113r2;
        int i10 = this.f6299d;
        if (i10 != -1) {
            return i10;
        }
        int iM106A = 0;
        for (int i11 = 0; i11 < this.f6296a; i11++) {
            int i12 = this.f6297b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f6298c[i11]).getClass();
                    iM3113r2 = a5.m3113r(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    z4 z4Var = (z4) this.f6298c[i11];
                    int iM3113r3 = a5.m3113r(i15);
                    int iMo3794c = z4Var.mo3794c();
                    iM106A = AbstractC0030c.m106A(iMo3794c, iMo3794c, iM3113r3, iM106A);
                } else if (i14 == 3) {
                    int iM3113r4 = a5.m3113r(i13 << 3);
                    iM3113r = iM3113r4 + iM3113r4;
                    iM3111a = ((m6) this.f6298c[i11]).m3496c();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzmq());
                    }
                    ((Integer) this.f6298c[i11]).getClass();
                    iM3113r2 = a5.m3113r(i13 << 3) + 4;
                }
                iM106A = iM3113r2 + iM106A;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f6298c[i11]).longValue();
                iM3113r = a5.m3113r(i16);
                iM3111a = a5.m3111a(jLongValue);
            }
            iM106A = iM3111a + iM3113r + iM106A;
        }
        this.f6299d = iM106A;
        return iM106A;
    }

    /* renamed from: d */
    public final void m3497d(int i10, Object obj) {
        if (!this.f6300e) {
            throw new UnsupportedOperationException();
        }
        m3498e(this.f6296a + 1);
        int[] iArr = this.f6297b;
        int i11 = this.f6296a;
        iArr[i11] = i10;
        this.f6298c[i11] = obj;
        this.f6296a = i11 + 1;
    }

    /* renamed from: e */
    public final void m3498e(int i10) {
        int[] iArr = this.f6297b;
        if (i10 > iArr.length) {
            int i11 = this.f6296a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f6297b = Arrays.copyOf(iArr, i10);
            this.f6298c = Arrays.copyOf(this.f6298c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        int i10 = this.f6296a;
        if (i10 == m6Var.f6296a) {
            int[] iArr = this.f6297b;
            int[] iArr2 = m6Var.f6297b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f6298c;
                    Object[] objArr2 = m6Var.f6298c;
                    int i12 = this.f6296a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f6296a;
        int i11 = i10 + 527;
        int[] iArr = this.f6297b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f6298c;
        int i15 = this.f6296a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
