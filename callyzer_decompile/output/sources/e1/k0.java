package e1;

import f1.AbstractC2176a;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    public long[] f9005a;

    /* renamed from: b */
    public Object[] f9006b;

    /* renamed from: c */
    public int f9007c;

    /* renamed from: d */
    public int f9008d;

    /* renamed from: e */
    public int f9009e;

    public k0(int i10) {
        this.f9005a = r0.f9045a;
        this.f9006b = AbstractC2176a.f10050c;
        if (i10 >= 0) {
            m5586f(r0.m5612e(i10));
        } else {
            AbstractC2176a.m5862c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean m5581a(Object obj) {
        int i10 = this.f9008d;
        this.f9006b[m5584d(obj)] = obj;
        return this.f9008d != i10;
    }

    /* renamed from: b */
    public final void m5582b() {
        this.f9008d = 0;
        long[] jArr = this.f9005a;
        if (jArr != r0.f9045a) {
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9005a;
            int i10 = this.f9007c;
            int i11 = i10 >> 3;
            long j6 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j6)) | j6;
        }
        AbstractC6662l.m12726p(this.f9006b, 0, this.f9007c, null);
        this.f9009e = r0.m5608a(this.f9007c) - this.f9008d;
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
    public final boolean m5583c(java.lang.Object r18) {
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
            int r5 = r0.f9007c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f9005a
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
            java.lang.Object[] r15 = r0.f9006b
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
        throw new UnsupportedOperationException("Method not decompiled: e1.k0.m5583c(java.lang.Object):boolean");
    }

    /* renamed from: d */
    public final int m5584d(Object obj) {
        long j6;
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object[] objArr;
        int i11;
        int i12 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f9007c;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f9005a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j12 = ((jArr3[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr3[i19] >>> i20);
            long j13 = i15;
            int i21 = i15;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j15) >> 3)) & i16;
                int i22 = i12;
                if (AbstractC4154l.m8918a(this.f9006b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i12 = i22;
            }
            int i23 = i12;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iM5585e = m5585e(i14);
                long j16 = 255;
                if (this.f9009e != 0 || ((this.f9005a[iM5585e >> 3] >> ((iM5585e & 7) << 3)) & 255) == 254) {
                    j6 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i24 = this.f9007c;
                    if (i24 > 8) {
                        int i25 = 8;
                        if (Long.compare((this.f9008d * 32) ^ Long.MIN_VALUE, (i24 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f9005a;
                            int i26 = this.f9007c;
                            Object[] objArr2 = this.f9006b;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            j11 = 128;
                            while (i28 < i27) {
                                long j17 = j16;
                                long j18 = jArr4[i28] & (-9187201950435737472L);
                                jArr4[i28] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i28++;
                                i25 = i25;
                                j13 = j13;
                                j16 = j17;
                            }
                            j6 = j16;
                            j10 = j13;
                            int i29 = i25;
                            int iM12734x = AbstractC6662l.m12734x(jArr4);
                            int i30 = iM12734x - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i30] = (jArr4[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM12734x] = jArr4[0];
                            int i31 = 0;
                            while (i31 != i26) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j20 = (jArr4[i32] >> i33) & j6;
                                if (j20 != 128 && j20 == 254) {
                                    Object obj2 = objArr2[i31];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i23;
                                    int i34 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iM5585e2 = m5585e(i34);
                                    int i35 = i34 & i26;
                                    if (((iM5585e2 - i35) & i26) / i29 == ((i31 - i35) & i26) / i29) {
                                        long j21 = j19;
                                        jArr4[i32] = ((r7 & 127) << i33) | ((~(j6 << i33)) & jArr4[i32]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i31++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i36 = iM5585e2 >> 3;
                                        long j23 = jArr4[i36];
                                        int i37 = (iM5585e2 & 7) << 3;
                                        if (((j23 >> i37) & j6) == 128) {
                                            i11 = i29;
                                            i10 = i26;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j6 << i37)) & j23) | ((r7 & 127) << i37);
                                            jArr4[i32] = (jArr4[i32] & (~(j6 << i33))) | (128 << i33);
                                            objArr[iM5585e2] = objArr[i31];
                                            objArr[i31] = null;
                                        } else {
                                            i10 = i26;
                                            objArr = objArr2;
                                            i11 = i29;
                                            jArr4[i36] = ((r7 & 127) << i37) | ((~(j6 << i37)) & j23);
                                            Object obj3 = objArr[iM5585e2];
                                            objArr[iM5585e2] = objArr[i31];
                                            objArr[i31] = obj3;
                                            i31--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i31++;
                                        j19 = j22;
                                        i29 = i11;
                                        i26 = i10;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i31++;
                                }
                            }
                            this.f9009e = r0.m5608a(this.f9007c) - this.f9008d;
                        }
                        iM5585e = m5585e(i14);
                    }
                    j6 = 255;
                    j10 = j13;
                    j11 = 128;
                    int iM5610c = r0.m5610c(this.f9007c);
                    long[] jArr5 = this.f9005a;
                    Object[] objArr3 = this.f9006b;
                    int i38 = this.f9007c;
                    m5586f(iM5610c);
                    long[] jArr6 = this.f9005a;
                    Object[] objArr4 = this.f9006b;
                    int i39 = this.f9007c;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i40];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i23;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM5585e3 = m5585e(i41 >>> 7);
                            long j24 = i41 & 127;
                            int i42 = iM5585e3 >> 3;
                            int i43 = (iM5585e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j25 = (jArr6[i42] & (~(255 << i43))) | (j24 << i43);
                            jArr[i42] = j25;
                            jArr[(((iM5585e3 - 7) & i39) + (i39 & 7)) >> 3] = j25;
                            objArr4[iM5585e3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM5585e = m5585e(i14);
                }
                this.f9008d++;
                int i44 = this.f9009e;
                long[] jArr7 = this.f9005a;
                int i45 = iM5585e >> 3;
                long j26 = jArr7[i45];
                int i46 = (iM5585e & 7) << 3;
                this.f9009e = i44 - (((j26 >> i46) & j6) == j11 ? 1 : 0);
                int i47 = this.f9007c;
                long j27 = (j26 & (~(j6 << i46))) | (j10 << i46);
                jArr7[i45] = j27;
                jArr7[(((iM5585e - 7) & i47) + (i47 & 7)) >> 3] = j27;
                return iM5585e;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
            i12 = i23;
        }
    }

    /* renamed from: e */
    public final int m5585e(int i10) {
        int i11 = this.f9007c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9005a;
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
            boolean r3 = r1 instanceof e1.k0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            e1.k0 r1 = (e1.k0) r1
            int r3 = r1.f9008d
            int r5 = r0.f9008d
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f9006b
            long[] r5 = r0.f9005a
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
            boolean r13 = r1.m5583c(r13)
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
        throw new UnsupportedOperationException("Method not decompiled: e1.k0.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void m5586f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, r0.m5611d(i10)) : 0;
        this.f9007c = iMax;
        if (iMax == 0) {
            jArr = r0.f9045a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
        }
        this.f9005a = jArr;
        int i11 = iMax >> 3;
        long j6 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j6)) | j6;
        this.f9009e = r0.m5608a(this.f9007c) - this.f9008d;
        this.f9006b = iMax == 0 ? AbstractC2176a.f10050c : new Object[iMax];
    }

    /* renamed from: g */
    public final boolean m5587g() {
        return this.f9008d == 0;
    }

    /* renamed from: h */
    public final boolean m5588h() {
        return this.f9008d != 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f9007c * 31) + this.f9008d;
        Object[] objArr = this.f9006b;
        long[] jArr = this.f9005a;
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5589i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f9007c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f9005a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f9006b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.AbstractC4154l.m8918a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m5593m(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.k0.m5589i(java.lang.Object):void");
    }

    /* renamed from: j */
    public final void m5590j(k0 elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Object[] objArr = elements.f9006b;
        long[] jArr = elements.f9005a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j6) < 128) {
                        m5591k(objArr[(i10 << 3) + i12]);
                    }
                    j6 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: k */
    public final void m5591k(Object obj) {
        this.f9006b[m5584d(obj)] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5592l(java.lang.Object r18) {
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
            int r5 = r0.f9007c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f9005a
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
            java.lang.Object[] r15 = r0.f9006b
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
            r0.m5593m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.k0.m5592l(java.lang.Object):boolean");
    }

    /* renamed from: m */
    public final void m5593m(int i10) {
        this.f9008d--;
        long[] jArr = this.f9005a;
        int i11 = this.f9007c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j6 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j6;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j6;
        this.f9006b[i10] = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            e1.s0 r1 = new e1.s0
            r2 = 0
            r1.<init>(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            java.lang.Object[] r3 = r0.f9006b
            long[] r4 = r0.f9005a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
            r6 = 0
            r7 = r6
            r8 = r7
        L1b:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L35:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r14 = r3[r14]
            r15 = -1
            if (r8 != r15) goto L4e
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L70
        L4e:
            if (r8 == 0) goto L55
            java.lang.String r15 = ", "
            r2.append(r15)
        L55:
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r2.append(r14)
            int r8 = r8 + 1
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L35
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1b
        L6b:
            java.lang.String r1 = "]"
            r2.append(r1)
        L70:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.k0.toString():java.lang.String");
    }

    public /* synthetic */ k0() {
        this(6);
    }
}
