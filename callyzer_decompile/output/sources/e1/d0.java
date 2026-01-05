package e1;

import f1.AbstractC2176a;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public long[] f8947a;

    /* renamed from: b */
    public Object[] f8948b;

    /* renamed from: c */
    public int[] f8949c;

    /* renamed from: d */
    public int f8950d;

    /* renamed from: e */
    public int f8951e;

    /* renamed from: f */
    public int f8952f;

    public d0(int i10) {
        this.f8947a = r0.f9045a;
        this.f8948b = AbstractC2176a.f10050c;
        this.f8949c = AbstractC1912n.f9030a;
        if (i10 >= 0) {
            m5537f(r0.m5612e(i10));
        } else {
            AbstractC2176a.m5862c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* renamed from: a */
    public final void m5532a() {
        this.f8951e = 0;
        long[] jArr = this.f8947a;
        if (jArr != r0.f9045a) {
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
            long[] jArr2 = this.f8947a;
            int i10 = this.f8950d;
            int i11 = i10 >> 3;
            long j6 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j6)) | j6;
        }
        AbstractC6662l.m12726p(this.f8948b, 0, this.f8950d, null);
        this.f8952f = r0.m5608a(this.f8950d) - this.f8951e;
    }

    /* renamed from: b */
    public final int m5533b(int i10) {
        int i11 = this.f8950d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8947a;
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

    /* renamed from: c */
    public final int m5534c(Object obj) {
        long j6;
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object[] objArr;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f8950d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f8947a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j12 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j13 = i14;
            int i20 = i14;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j15) >> 3)) & i15;
                int i21 = i11;
                if (AbstractC4154l.m8918a(this.f8948b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iM5533b = m5533b(i13);
                long j16 = 255;
                if (this.f8952f != 0 || ((this.f8947a[iM5533b >> 3] >> ((iM5533b & 7) << 3)) & 255) == 254) {
                    j6 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i23 = this.f8950d;
                    if (i23 > 8) {
                        int i24 = 8;
                        if (Long.compare((this.f8951e * 32) ^ Long.MIN_VALUE, (i23 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f8947a;
                            int i25 = this.f8950d;
                            Object[] objArr2 = this.f8948b;
                            int[] iArr = this.f8949c;
                            j11 = 128;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            while (i27 < i26) {
                                long j17 = j16;
                                long j18 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i27++;
                                i24 = i24;
                                j13 = j13;
                                j16 = j17;
                            }
                            j6 = j16;
                            j10 = j13;
                            int i28 = i24;
                            int iM12734x = AbstractC6662l.m12734x(jArr4);
                            int i29 = iM12734x - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM12734x] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j20 = (jArr4[i31] >> i32) & j6;
                                if (j20 != 128 && j20 == 254) {
                                    Object obj2 = objArr2[i30];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i22;
                                    int i33 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iM5533b2 = m5533b(i33);
                                    int i34 = i33 & i25;
                                    long j21 = j19;
                                    if (((iM5533b2 - i34) & i25) / 8 == ((i30 - i34) & i25) / i28) {
                                        jArr4[i31] = ((r8 & 127) << i32) | (jArr4[i31] & (~(j6 << i32)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i30++;
                                        j19 = j21;
                                        i28 = i28;
                                    } else {
                                        int i35 = i28;
                                        int i36 = iM5533b2 >> 3;
                                        long j22 = jArr4[i36];
                                        int i37 = (iM5533b2 & 7) << 3;
                                        if (((j22 >> i37) & j6) == 128) {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j6 << i37)) & j22) | ((r8 & 127) << i37);
                                            jArr4[i31] = (jArr4[i31] & (~(j6 << i32))) | (128 << i32);
                                            objArr[iM5533b2] = objArr[i30];
                                            objArr[i30] = null;
                                            iArr[iM5533b2] = iArr[i30];
                                            iArr[i30] = 0;
                                        } else {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((r8 & 127) << i37) | ((~(j6 << i37)) & j22);
                                            Object obj3 = objArr[iM5533b2];
                                            objArr[iM5533b2] = objArr[i30];
                                            objArr[i30] = obj3;
                                            int i38 = iArr[iM5533b2];
                                            iArr[iM5533b2] = iArr[i30];
                                            iArr[i30] = i38;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i30++;
                                        i25 = i10;
                                        j19 = j21;
                                        i28 = i35;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f8952f = r0.m5608a(this.f8950d) - this.f8951e;
                        }
                        iM5533b = m5533b(i13);
                    }
                    j6 = 255;
                    j10 = j13;
                    j11 = 128;
                    int iM5610c = r0.m5610c(this.f8950d);
                    long[] jArr5 = this.f8947a;
                    Object[] objArr3 = this.f8948b;
                    int[] iArr2 = this.f8949c;
                    int i39 = this.f8950d;
                    m5537f(iM5610c);
                    long[] jArr6 = this.f8947a;
                    Object[] objArr4 = this.f8948b;
                    int[] iArr3 = this.f8949c;
                    int i40 = this.f8950d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr5[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i41];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i22;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM5533b3 = m5533b(i42 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = i42 & 127;
                            int i43 = iM5533b3 >> 3;
                            int i44 = (iM5533b3 & 7) << 3;
                            long j24 = (jArr[i43] & (~(255 << i44))) | (j23 << i44);
                            jArr[i43] = j24;
                            jArr[(((iM5533b3 - 7) & i40) + (i40 & 7)) >> 3] = j24;
                            objArr4[iM5533b3] = obj4;
                            iArr3[iM5533b3] = iArr2[i41];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i41++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM5533b = m5533b(i13);
                }
                this.f8951e++;
                int i45 = this.f8952f;
                long[] jArr7 = this.f8947a;
                int i46 = iM5533b >> 3;
                long j25 = jArr7[i46];
                int i47 = (iM5533b & 7) << 3;
                this.f8952f = i45 - (((j25 >> i47) & j6) == j11 ? 1 : 0);
                int i48 = this.f8950d;
                long j26 = (j25 & (~(j6 << i47))) | (j10 << i47);
                jArr7[i46] = j26;
                jArr7[(((iM5533b - 7) & i48) + (i48 & 7)) >> 3] = j26;
                return ~iM5533b;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
    }

    /* renamed from: d */
    public final int m5535d(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f8950d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f8947a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j6 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (i12 * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (AbstractC4154l.m8918a(this.f8948b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    /* renamed from: e */
    public final int m5536e(Object obj) {
        int iM5535d = m5535d(obj);
        if (iM5535d >= 0) {
            return this.f8949c[iM5535d];
        }
        AbstractC2176a.m5864e("There is no key " + obj + " in the map");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof e1.d0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            e1.d0 r1 = (e1.d0) r1
            int r3 = r1.f8951e
            int r5 = r0.f8951e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f8948b
            int[] r5 = r0.f8949c
            long[] r6 = r0.f8947a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L74
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6b
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.m5535d(r15)
            if (r15 < 0) goto L5d
            r16 = r2
            int[] r2 = r1.f8949c
            r2 = r2[r15]
            if (r14 == r2) goto L60
        L5d:
            return r4
        L5e:
            r16 = r2
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r16
            goto L3d
        L66:
            r16 = r2
            if (r11 != r12) goto L76
            goto L6d
        L6b:
            r16 = r2
        L6d:
            if (r8 == r7) goto L76
            int r8 = r8 + 1
            r2 = r16
            goto L23
        L74:
            r16 = r2
        L76:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d0.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void m5537f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, r0.m5611d(i10)) : 0;
        this.f8950d = iMax;
        if (iMax == 0) {
            jArr = r0.f9045a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
        }
        this.f8947a = jArr;
        int i11 = iMax >> 3;
        long j6 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j6)) | j6;
        this.f8952f = r0.m5608a(this.f8950d) - this.f8951e;
        this.f8948b = new Object[iMax];
        this.f8949c = new int[iMax];
    }

    /* renamed from: g */
    public final void m5538g(int i10) {
        this.f8951e--;
        long[] jArr = this.f8947a;
        int i11 = this.f8950d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j6 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j6;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j6;
        this.f8948b[i10] = null;
    }

    /* renamed from: h */
    public final void m5539h(int i10, Object obj) {
        int iM5534c = m5534c(obj);
        if (iM5534c < 0) {
            iM5534c = ~iM5534c;
        }
        this.f8948b[iM5534c] = obj;
        this.f8949c[iM5534c] = i10;
    }

    public final int hashCode() {
        Object[] objArr = this.f8948b;
        int[] iArr = this.f8949c;
        long[] jArr = this.f8947a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j6) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iHashCode += Integer.hashCode(iArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j6 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f8951e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f8948b
            int[] r3 = r0.f8949c
            long[] r4 = r0.f8947a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f8951e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d0.toString():java.lang.String");
    }

    public /* synthetic */ d0() {
        this(6);
    }
}
