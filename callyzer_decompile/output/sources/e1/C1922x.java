package e1;

import f1.AbstractC2176a;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.x */
/* loaded from: classes.dex */
public final class C1922x extends AbstractC1910l {

    /* renamed from: f */
    public int f9080f;

    public C1922x(int i10) {
        this.f9010a = r0.f9045a;
        this.f9011b = AbstractC1912n.f9030a;
        this.f9012c = AbstractC2176a.f10050c;
        if (i10 >= 0) {
            m5661f(r0.m5612e(i10));
        } else {
            AbstractC2176a.m5862c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* renamed from: c */
    public final void m5658c() {
        this.f9014e = 0;
        long[] jArr = this.f9010a;
        if (jArr != r0.f9045a) {
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9010a;
            int i10 = this.f9013d;
            int i11 = i10 >> 3;
            long j6 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j6)) | j6;
        }
        AbstractC6662l.m12726p(this.f9012c, 0, this.f9013d, null);
        this.f9080f = r0.m5608a(this.f9013d) - this.f9014e;
    }

    /* renamed from: d */
    public final int m5659d(int i10) {
        long j6;
        long j10;
        int i11;
        long j11;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i12;
        int i13 = -862048943;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f9013d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f9010a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j12 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j13 = i16;
            int i23 = i19;
            int i24 = 0;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j15) >> 3)) & i17;
                int i25 = i13;
                int i26 = i24;
                if (this.f9011b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i13 = i25;
                i24 = i26;
            }
            int i27 = i13;
            int i28 = i24;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iM5660e = m5660e(i15);
                long j16 = 255;
                if (this.f9080f != 0 || ((this.f9010a[iM5660e >> 3] >> ((iM5660e & 7) << 3)) & 255) == 254) {
                    j6 = 255;
                    j10 = j13;
                    i11 = 1;
                    j11 = 128;
                } else {
                    int i29 = this.f9013d;
                    if (i29 > 8) {
                        j11 = 128;
                        if (Long.compare((this.f9014e * 32) ^ Long.MIN_VALUE, (i29 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f9010a;
                            int i30 = this.f9013d;
                            int[] iArr2 = this.f9011b;
                            Object[] objArr2 = this.f9012c;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = i28;
                            while (i32 < i31) {
                                long j17 = j16;
                                long j18 = jArr4[i32] & (-9187201950435737472L);
                                jArr4[i32] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i32++;
                                j13 = j13;
                                j16 = j17;
                            }
                            j6 = j16;
                            j10 = j13;
                            int iM12734x = AbstractC6662l.m12734x(jArr4);
                            int i33 = iM12734x - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM12734x] = jArr4[i28];
                            int i34 = i28;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j20 = (jArr4[i35] >> i36) & j6;
                                if (j20 != 128 && j20 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i34]) * i27;
                                    int i37 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iM5660e2 = m5660e(i37);
                                    int i38 = i37 & i30;
                                    if (((iM5660e2 - i38) & i30) / 8 == ((i34 - i38) & i30) / 8) {
                                        long j21 = j19;
                                        jArr4[i35] = ((r8 & 127) << i36) | ((~(j6 << i36)) & jArr4[i35]);
                                        jArr4[jArr4.length - i22] = (jArr4[i28] & j21) | Long.MIN_VALUE;
                                        i34++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i39 = iM5660e2 >> 3;
                                        long j23 = jArr4[i39];
                                        int i40 = (iM5660e2 & 7) << 3;
                                        if (((j23 >> i40) & j6) == 128) {
                                            i12 = i22;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i39] = ((~(j6 << i40)) & j23) | ((r8 & 127) << i40);
                                            jArr4[i35] = (jArr4[i35] & (~(j6 << i36))) | (128 << i36);
                                            iArr[iM5660e2] = iArr[i34];
                                            iArr[i34] = i28;
                                            objArr[iM5660e2] = objArr[i34];
                                            objArr[i34] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i12 = i22;
                                            jArr4[i39] = ((r8 & 127) << i40) | ((~(j6 << i40)) & j23);
                                            int i41 = iArr[iM5660e2];
                                            iArr[iM5660e2] = iArr[i34];
                                            iArr[i34] = i41;
                                            Object obj = objArr[iM5660e2];
                                            objArr[iM5660e2] = objArr[i34];
                                            objArr[i34] = obj;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i28] & j22) | Long.MIN_VALUE;
                                        i34++;
                                        j19 = j22;
                                        i22 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i11 = i22;
                            this.f9080f = r0.m5608a(this.f9013d) - this.f9014e;
                        }
                        iM5660e = m5660e(i15);
                    } else {
                        j11 = 128;
                    }
                    j6 = 255;
                    j10 = j13;
                    i11 = 1;
                    int iM5610c = r0.m5610c(this.f9013d);
                    long[] jArr5 = this.f9010a;
                    int[] iArr3 = this.f9011b;
                    Object[] objArr3 = this.f9012c;
                    int i42 = this.f9013d;
                    m5661f(iM5610c);
                    long[] jArr6 = this.f9010a;
                    int[] iArr4 = this.f9011b;
                    Object[] objArr4 = this.f9012c;
                    int i43 = this.f9013d;
                    int i44 = i28;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j11) {
                            int i45 = iArr3[i44];
                            int iHashCode3 = Integer.hashCode(i45) * i27;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM5660e3 = m5660e(i46 >>> 7);
                            long j24 = i46 & 127;
                            int i47 = iM5660e3 >> 3;
                            int i48 = (iM5660e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j25 = (jArr6[i47] & (~(255 << i48))) | (j24 << i48);
                            jArr[i47] = j25;
                            jArr[(((iM5660e3 - 7) & i43) + (i43 & 7)) >> 3] = j25;
                            iArr4[iM5660e3] = i45;
                            objArr4[iM5660e3] = objArr3[i44];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i44++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM5660e = m5660e(i15);
                }
                this.f9014e++;
                int i49 = this.f9080f;
                long[] jArr7 = this.f9010a;
                int i50 = iM5660e >> 3;
                long j26 = jArr7[i50];
                int i51 = (iM5660e & 7) << 3;
                if (((j26 >> i51) & j6) != j11) {
                    i11 = i28;
                }
                this.f9080f = i49 - i11;
                int i52 = this.f9013d;
                long j27 = (j26 & (~(j6 << i51))) | (j10 << i51);
                jArr7[i50] = j27;
                jArr7[(((iM5660e - 7) & i52) + (i52 & 7)) >> 3] = j27;
                return iM5660e;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i27;
        }
    }

    /* renamed from: e */
    public final int m5660e(int i10) {
        int i11 = this.f9013d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9010a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = j6 & ((~j6) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    /* renamed from: f */
    public final void m5661f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, r0.m5611d(i10)) : 0;
        this.f9013d = iMax;
        if (iMax == 0) {
            jArr = r0.f9045a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
        }
        this.f9010a = jArr;
        int i11 = iMax >> 3;
        long j6 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j6)) | j6;
        this.f9080f = r0.m5608a(this.f9013d) - this.f9014e;
        this.f9011b = new int[iMax];
        this.f9012c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5662g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f9013d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f9010a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f9011b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L97
            r10 = -1
        L64:
            r14 = 0
            if (r10 < 0) goto L96
            int r0 = r13.f9014e
            int r0 = r0 + (-1)
            r13.f9014e = r0
            long[] r0 = r13.f9010a
            int r1 = r13.f9013d
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r13.f9012c
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L96:
            return r14
        L97:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C1922x.m5662g(int):java.lang.Object");
    }

    /* renamed from: h */
    public final void m5663h(int i10, Object obj) {
        int iM5659d = m5659d(i10);
        this.f9011b[iM5659d] = i10;
        this.f9012c[iM5659d] = obj;
    }

    public /* synthetic */ C1922x() {
        this(6);
    }
}
