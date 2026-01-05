package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import a2.AbstractC0030c;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: f */
    public static final i2 f6561f = new i2(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f6562a;

    /* renamed from: b */
    public int[] f6563b;

    /* renamed from: c */
    public Object[] f6564c;

    /* renamed from: d */
    public int f6565d = -1;

    /* renamed from: e */
    public boolean f6566e;

    public i2(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.f6562a = i10;
        this.f6563b = iArr;
        this.f6564c = objArr;
        this.f6566e = z6;
    }

    /* renamed from: b */
    public static i2 m3902b() {
        return new i2(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m3903a() {
        int iM3951a;
        int iM3952b;
        int iM3951a2;
        int i10 = this.f6565d;
        if (i10 != -1) {
            return i10;
        }
        int iM108C = 0;
        for (int i11 = 0; i11 < this.f6562a; i11++) {
            int i12 = this.f6563b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f6564c[i11]).getClass();
                    iM3951a2 = s0.m3951a(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    r0 r0Var = (r0) this.f6564c[i11];
                    int iM3951a3 = s0.m3951a(i15);
                    int iMo3818e = r0Var.mo3818e();
                    iM108C = AbstractC0030c.m108C(iMo3818e, iMo3818e, iM3951a3, iM108C);
                } else if (i14 == 3) {
                    int iM3951a4 = s0.m3951a(i13 << 3);
                    iM3951a = iM3951a4 + iM3951a4;
                    iM3952b = ((i2) this.f6564c[i11]).m3903a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzeq());
                    }
                    ((Integer) this.f6564c[i11]).getClass();
                    iM3951a2 = s0.m3951a(i13 << 3) + 4;
                }
                iM108C = iM3951a2 + iM108C;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f6564c[i11]).longValue();
                iM3951a = s0.m3951a(i16);
                iM3952b = s0.m3952b(jLongValue);
            }
            iM108C = iM3952b + iM3951a + iM108C;
        }
        this.f6565d = iM108C;
        return iM108C;
    }

    /* renamed from: c */
    public final void m3904c(int i10, Object obj) {
        if (!this.f6566e) {
            throw new UnsupportedOperationException();
        }
        m3906e(this.f6562a + 1);
        int[] iArr = this.f6563b;
        int i11 = this.f6562a;
        iArr[i11] = i10;
        this.f6564c[i11] = obj;
        this.f6562a = i11 + 1;
    }

    /* renamed from: d */
    public final void m3905d(p1 p1Var) {
        if (this.f6562a != 0) {
            for (int i10 = 0; i10 < this.f6562a; i10++) {
                int i11 = this.f6563b[i10];
                Object obj = this.f6564c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ((s0) p1Var.f6630a).m3967p(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ((s0) p1Var.f6630a).m3959h(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    ((s0) p1Var.f6630a).m3956e(i13, (r0) obj);
                } else if (i12 == 3) {
                    ((s0) p1Var.f6630a).m3964m(i13, 3);
                    ((i2) obj).m3905d(p1Var);
                    ((s0) p1Var.f6630a).m3964m(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzeq());
                    }
                    ((s0) p1Var.f6630a).m3957f(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* renamed from: e */
    public final void m3906e(int i10) {
        int[] iArr = this.f6563b;
        if (i10 > iArr.length) {
            int i11 = this.f6562a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f6563b = Arrays.copyOf(iArr, i10);
            this.f6564c = Arrays.copyOf(this.f6564c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        int i10 = this.f6562a;
        if (i10 == i2Var.f6562a) {
            int[] iArr = this.f6563b;
            int[] iArr2 = i2Var.f6563b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f6564c;
                    Object[] objArr2 = i2Var.f6564c;
                    int i12 = this.f6562a;
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
        int i10 = this.f6562a;
        int i11 = i10 + 527;
        int[] iArr = this.f6563b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f6564c;
        int i15 = this.f6562a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
