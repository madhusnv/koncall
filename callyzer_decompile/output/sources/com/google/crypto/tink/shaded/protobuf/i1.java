package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: f */
    public static final i1 f7048f = new i1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f7049a;

    /* renamed from: b */
    public int[] f7050b;

    /* renamed from: c */
    public Object[] f7051c;

    /* renamed from: d */
    public int f7052d = -1;

    /* renamed from: e */
    public boolean f7053e;

    public i1(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.f7049a = i10;
        this.f7050b = iArr;
        this.f7051c = objArr;
        this.f7053e = z6;
    }

    /* renamed from: b */
    public static i1 m4283b() {
        return new i1(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m4284a() {
        int iM4317G;
        int iM4319I;
        int iM4313C;
        int i10 = this.f7052d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7049a; i12++) {
            int i13 = this.f7050b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f7051c[i12]).getClass();
                    iM4313C = C1386m.m4313C(i14);
                } else if (i15 == 2) {
                    iM4313C = C1386m.m4320z(i14, (AbstractC1382i) this.f7051c[i12]);
                } else if (i15 == 3) {
                    iM4317G = C1386m.m4317G(i14) * 2;
                    iM4319I = ((i1) this.f7051c[i12]).m4284a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.m4150b());
                    }
                    ((Integer) this.f7051c[i12]).getClass();
                    iM4313C = C1386m.m4312B(i14);
                }
                i11 = iM4313C + i11;
            } else {
                long jLongValue = ((Long) this.f7051c[i12]).longValue();
                iM4317G = C1386m.m4317G(i14);
                iM4319I = C1386m.m4319I(jLongValue);
            }
            i11 = iM4319I + iM4317G + i11;
        }
        this.f7052d = i11;
        return i11;
    }

    /* renamed from: c */
    public final void m4285c(int i10, Object obj) {
        if (!this.f7053e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f7049a;
        int[] iArr = this.f7050b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f7050b = Arrays.copyOf(iArr, i12);
            this.f7051c = Arrays.copyOf(this.f7051c, i12);
        }
        int[] iArr2 = this.f7050b;
        int i13 = this.f7049a;
        iArr2[i13] = i10;
        this.f7051c[i13] = obj;
        this.f7049a = i13 + 1;
    }

    /* renamed from: d */
    public final void m4286d(C1387n c1387n) throws CodedOutputStream$OutOfSpaceException {
        if (this.f7049a == 0) {
            return;
        }
        c1387n.getClass();
        v1 v1Var = v1.ASCENDING;
        for (int i10 = 0; i10 < this.f7049a; i10++) {
            int i11 = this.f7050b[i10];
            Object obj = this.f7051c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                c1387n.m4341j(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c1387n.m4337f(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                c1387n.m4333b(i12, (AbstractC1382i) obj);
            } else if (i13 == 3) {
                C1386m c1386m = (C1386m) c1387n.f7081a;
                v1 v1Var2 = v1.ASCENDING;
                c1386m.m4328Q(i12, 3);
                ((i1) obj).m4286d(c1387n);
                c1386m.m4328Q(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.m4150b());
                }
                c1387n.m4336e(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        int i10 = this.f7049a;
        if (i10 == i1Var.f7049a) {
            int[] iArr = this.f7050b;
            int[] iArr2 = i1Var.f7050b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f7051c;
                    Object[] objArr2 = i1Var.f7051c;
                    int i12 = this.f7049a;
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
        int i10 = this.f7049a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f7050b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f7051c;
        int i15 = this.f7049a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
