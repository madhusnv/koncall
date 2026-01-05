package e1;

import a3.C0045d;
import f1.AbstractC2176a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public long[] f8961a = r0.f9045a;

    /* renamed from: b */
    public Object[] f8962b = AbstractC2176a.f10050c;

    /* renamed from: c */
    public long[] f8963c = AbstractC1916r.f9043b;

    /* renamed from: d */
    public int f8964d = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f8965e = Integer.MAX_VALUE;

    /* renamed from: f */
    public int f8966f;

    /* renamed from: g */
    public int f8967g;

    /* renamed from: h */
    public int f8968h;

    public f0(int i10) {
        if (i10 >= 0) {
            m5562f(r0.m5612e(i10));
        } else {
            AbstractC2176a.m5862c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean m5557a(Object obj) {
        int i10 = this.f8967g;
        int iM5560d = m5560d(obj);
        this.f8962b[iM5560d] = obj;
        long[] jArr = this.f8963c;
        int i11 = this.f8964d;
        jArr[iM5560d] = (i11 & 2147483647L) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((iM5560d & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
        }
        this.f8964d = iM5560d;
        if (this.f8965e == Integer.MAX_VALUE) {
            this.f8965e = iM5560d;
        }
        return this.f8967g != i10;
    }

    /* renamed from: b */
    public final void m5558b() {
        this.f8967g = 0;
        long[] jArr = this.f8961a;
        if (jArr != r0.f9045a) {
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
            long[] jArr2 = this.f8961a;
            int i10 = this.f8966f;
            int i11 = i10 >> 3;
            long j6 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j6)) | j6;
        }
        AbstractC6662l.m12726p(this.f8962b, 0, this.f8966f, null);
        AbstractC6662l.m12727q(this.f8963c, 4611686018427387903L);
        this.f8964d = Integer.MAX_VALUE;
        this.f8965e = Integer.MAX_VALUE;
        this.f8968h = r0.m5608a(this.f8966f) - this.f8967g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5559c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f8966f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f8961a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f8962b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC4154l.m8918a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.f0.m5559c(java.lang.Object):boolean");
    }

    /* renamed from: d */
    public final int m5560d(Object obj) {
        int i10;
        long j6;
        long j10;
        long j11;
        char c2;
        long[] jArr;
        long[] jArr2;
        long j12;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f8966f;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f8961a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j14 = i14;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i16) & i15;
                int i20 = i11;
                if (AbstractC4154l.m8918a(this.f8962b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i11 = i20;
            }
            int i21 = i11;
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int iM5561e = m5561e(i13);
                long j17 = 255;
                if (this.f8968h != 0 || ((this.f8961a[iM5561e >> 3] >> ((iM5561e & 7) << 3)) & 255) == 254) {
                    i10 = 0;
                    j6 = j14;
                    j10 = 255;
                    j11 = 128;
                } else {
                    int i22 = this.f8966f;
                    if (i22 > 8) {
                        c2 = 31;
                        j11 = 128;
                        if (Long.compare((this.f8967g * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f8961a;
                            if (jArr4 == null) {
                                i10 = 0;
                                j6 = j14;
                                j10 = 255;
                            } else {
                                int i23 = this.f8966f;
                                Object[] objArr = this.f8962b;
                                long[] jArr5 = this.f8963c;
                                long[] jArr6 = new long[i23];
                                Arrays.fill(jArr6, 0, i23, 9223372034707292159L);
                                i10 = 0;
                                int i24 = (i23 + 7) >> 3;
                                int i25 = 0;
                                while (i25 < i24) {
                                    long j18 = j17;
                                    long j19 = jArr4[i25] & (-9187201950435737472L);
                                    int i26 = i25;
                                    jArr4[i26] = ((~j19) + (j19 >>> 7)) & (-72340172838076674L);
                                    i25 = i26 + 1;
                                    j17 = j18;
                                }
                                j10 = j17;
                                int length = jArr4.length;
                                int i27 = length - 1;
                                int i28 = length - 2;
                                jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i27] = jArr4[0];
                                int i29 = 0;
                                while (i29 != i23) {
                                    int i30 = i29 >> 3;
                                    int i31 = (i29 & 7) << 3;
                                    long j20 = (jArr4[i30] >> i31) & j10;
                                    if (j20 != 128 && j20 == 254) {
                                        Object obj2 = objArr[i29];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                        int i32 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                        int iM5561e2 = m5561e(i32);
                                        int i33 = i32 & i23;
                                        if (((iM5561e2 - i33) & i23) / 8 == ((i29 - i33) & i23) / 8) {
                                            int i34 = i23;
                                            Object[] objArr2 = objArr;
                                            jArr4[i30] = (jArr4[i30] & (~(j10 << i31))) | ((r17 & 127) << i31);
                                            if (jArr6[i29] == 9223372034707292159L) {
                                                long j21 = i29;
                                                jArr6[i29] = j21 | (j21 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i34;
                                            objArr = objArr2;
                                        } else {
                                            int i35 = i23;
                                            Object[] objArr3 = objArr;
                                            int i36 = iM5561e2 >> 3;
                                            long j22 = jArr4[i36];
                                            int i37 = (iM5561e2 & 7) << 3;
                                            if (((j22 >> i37) & j10) == 128) {
                                                jArr4[i36] = (j22 & (~(j10 << i37))) | ((r17 & 127) << i37);
                                                jArr4[i30] = (jArr4[i30] & (~(j10 << i31))) | (128 << i31);
                                                objArr3[iM5561e2] = objArr3[i29];
                                                objArr3[i29] = null;
                                                jArr5[iM5561e2] = jArr5[i29];
                                                jArr5[i29] = 4611686018427387903L;
                                                int i38 = (int) ((jArr6[i29] >> 32) & 4294967295L);
                                                int i39 = Integer.MAX_VALUE;
                                                if (i38 != Integer.MAX_VALUE) {
                                                    j12 = j14;
                                                    jArr6[i38] = iM5561e2 | (jArr6[i38] & (-4294967296L));
                                                    jArr6[i29] = (jArr6[i29] & 4294967295L) | (-4294967296L);
                                                    i39 = Integer.MAX_VALUE;
                                                } else {
                                                    j12 = j14;
                                                    jArr6[i29] = (Integer.MAX_VALUE << 32) | iM5561e2;
                                                }
                                                jArr6[iM5561e2] = (i29 << 32) | i39;
                                            } else {
                                                j12 = j14;
                                                jArr4[i36] = ((r17 & 127) << i37) | (j22 & (~(j10 << i37)));
                                                Object obj3 = objArr3[iM5561e2];
                                                objArr3[iM5561e2] = objArr3[i29];
                                                objArr3[i29] = obj3;
                                                long j23 = jArr5[iM5561e2];
                                                jArr5[iM5561e2] = jArr5[i29];
                                                jArr5[i29] = j23;
                                                int i40 = (int) ((jArr6[i29] >> 32) & 4294967295L);
                                                if (i40 != Integer.MAX_VALUE) {
                                                    long j24 = iM5561e2;
                                                    jArr6[i40] = (jArr6[i40] & (-4294967296L)) | j24;
                                                    jArr6[i29] = (jArr6[i29] & 4294967295L) | (j24 << 32);
                                                } else {
                                                    long j25 = iM5561e2;
                                                    jArr6[i29] = j25 | (j25 << 32);
                                                    i40 = i29;
                                                }
                                                jArr6[iM5561e2] = (i40 << 32) | i29;
                                                i29--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i35;
                                            objArr = objArr3;
                                            j14 = j12;
                                        }
                                    } else {
                                        i29++;
                                    }
                                }
                                j6 = j14;
                                this.f8968h = r0.m5608a(this.f8966f) - this.f8967g;
                                long[] jArr7 = this.f8963c;
                                int length2 = jArr7.length;
                                for (int i41 = 0; i41 < length2; i41++) {
                                    long j26 = jArr7[i41];
                                    jArr7[i41] = (((j26 & (-4611686018427387904L)) | (((int) ((j26 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j26 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i42 = this.f8964d;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.f8964d = (int) (jArr6[i42] & 4294967295L);
                                }
                                int i43 = this.f8965e;
                                if (i43 != Integer.MAX_VALUE) {
                                    this.f8965e = (int) (jArr6[i43] & 4294967295L);
                                }
                            }
                        }
                        iM5561e = m5561e(i13);
                    } else {
                        c2 = 31;
                        j11 = 128;
                    }
                    i10 = 0;
                    j6 = j14;
                    j10 = 255;
                    int iM5610c = r0.m5610c(this.f8966f);
                    long[] jArr8 = this.f8961a;
                    Object[] objArr4 = this.f8962b;
                    long[] jArr9 = this.f8963c;
                    int i44 = this.f8966f;
                    int[] iArr = new int[i44];
                    m5562f(iM5610c);
                    long[] jArr10 = this.f8961a;
                    Object[] objArr5 = this.f8962b;
                    long[] jArr11 = this.f8963c;
                    int i45 = this.f8966f;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr8[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j11) {
                            Object obj4 = objArr4[i46];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i47 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM5561e3 = m5561e(i47 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j27 = i47 & 127;
                            int i48 = iM5561e3 >> 3;
                            int i49 = (iM5561e3 & 7) << 3;
                            long j28 = (jArr[i48] & (~(255 << i49))) | (j27 << i49);
                            jArr[i48] = j28;
                            jArr[(((iM5561e3 - 7) & i45) + (i45 & 7)) >> 3] = j28;
                            objArr5[iM5561e3] = obj4;
                            jArr11[iM5561e3] = jArr9[i46];
                            iArr[i46] = iM5561e3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i46++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f8963c;
                    int length3 = jArr12.length;
                    for (int i50 = 0; i50 < length3; i50++) {
                        long j29 = jArr12[i50];
                        jArr12[i50] = (((j29 & (-4611686018427387904L)) | (((int) ((j29 >> c2) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c2) | (((int) (j29 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i51 = this.f8964d;
                    if (i51 != Integer.MAX_VALUE) {
                        this.f8964d = iArr[i51];
                    }
                    int i52 = this.f8965e;
                    if (i52 != Integer.MAX_VALUE) {
                        this.f8965e = iArr[i52];
                    }
                    iM5561e = m5561e(i13);
                }
                this.f8967g++;
                int i53 = this.f8968h;
                long[] jArr13 = this.f8961a;
                int i54 = iM5561e >> 3;
                long j30 = jArr13[i54];
                int i55 = (iM5561e & 7) << 3;
                if (((j30 >> i55) & j10) == j11) {
                    i10 = 1;
                }
                this.f8968h = i53 - i10;
                int i56 = this.f8966f;
                long j31 = (j30 & (~(j10 << i55))) | (j6 << i55);
                jArr13[i54] = j31;
                jArr13[(((iM5561e - 7) & i56) + (i56 & 7)) >> 3] = j31;
                return iM5561e;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i11 = i21;
        }
    }

    /* renamed from: e */
    public final int m5561e(int i10) {
        int i11 = this.f8966f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8961a;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof e1.f0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            e1.f0 r1 = (e1.f0) r1
            int r3 = r1.f8967g
            int r5 = r0.f8967g
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f8962b
            long[] r5 = r0.f8961a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.m5559c(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.f0.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void m5562f(int i10) {
        long[] jArr;
        long[] jArr2;
        int iMax = i10 > 0 ? Math.max(7, r0.m5611d(i10)) : 0;
        this.f8966f = iMax;
        if (iMax == 0) {
            jArr = r0.f9045a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
        }
        this.f8961a = jArr;
        int i11 = iMax >> 3;
        long j6 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j6)) | j6;
        this.f8968h = r0.m5608a(this.f8966f) - this.f8967g;
        this.f8962b = iMax == 0 ? AbstractC2176a.f10050c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC1916r.f9043b;
        } else {
            jArr2 = new long[iMax];
            AbstractC6662l.m12727q(jArr2, 4611686018427387903L);
        }
        this.f8963c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5563g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f8966f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f8961a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f8962b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC4154l.m8918a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.m5564h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.f0.m5563g(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public final void m5564h(int i10) {
        this.f8967g--;
        long[] jArr = this.f8961a;
        int i11 = this.f8966f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j6 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j6;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j6;
        this.f8962b[i10] = null;
        long[] jArr2 = this.f8963c;
        long j10 = jArr2[i10];
        int i14 = (int) ((j10 >> 31) & 2147483647L);
        int i15 = (int) (j10 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (i15 & 2147483647L);
        } else {
            this.f8964d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((i14 & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f8965e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f8966f * 31) + this.f8967g;
        Object[] objArr = this.f8962b;
        long[] jArr = this.f8961a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!AbstractC4154l.m8918a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5565i(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r1, r2)
            java.lang.Object[] r2 = r0.f8962b
            int r3 = r0.f8967g
            long[] r4 = r0.f8961a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = rw.AbstractC6663m.m12767z(r14, r15)
            if (r14 != 0) goto L4c
            r0.m5564h(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.f8967g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.f0.m5565i(java.util.Collection):boolean");
    }

    public final String toString() {
        C0045d c0045d = new C0045d(6, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f8962b;
        long[] jArr = this.f8963c;
        int i10 = this.f8965e;
        int i11 = 0;
        while (true) {
            if (i10 == Integer.MAX_VALUE) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) c0045d.invoke(obj));
            i11++;
            i10 = i12;
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
