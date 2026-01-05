package e1;

import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.v */
/* loaded from: classes.dex */
public final class C1920v {

    /* renamed from: a */
    public long[] f9066a = r0.f9045a;

    /* renamed from: b */
    public int[] f9067b;

    /* renamed from: c */
    public int[] f9068c;

    /* renamed from: d */
    public int f9069d;

    /* renamed from: e */
    public int f9070e;

    /* renamed from: f */
    public int f9071f;

    public C1920v() {
        int[] iArr = AbstractC1912n.f9030a;
        this.f9067b = iArr;
        this.f9068c = iArr;
        m5642e(r0.m5612e(6));
    }

    /* renamed from: a */
    public final void m5638a() {
        this.f9070e = 0;
        long[] jArr = this.f9066a;
        if (jArr != r0.f9045a) {
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9066a;
            int i10 = this.f9069d;
            int i11 = i10 >> 3;
            long j6 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j6)) | j6;
        }
        this.f9071f = r0.m5608a(this.f9069d) - this.f9070e;
    }

    /* renamed from: b */
    public final int m5639b(int i10) {
        int i11 = this.f9069d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9066a;
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
    public final int m5640c(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f9069d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f9066a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j6 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (i12 * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f9067b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    /* renamed from: d */
    public final int m5641d(int i10) {
        int iM5640c = m5640c(i10);
        if (iM5640c >= 0) {
            return this.f9068c[iM5640c];
        }
        return -1;
    }

    /* renamed from: e */
    public final void m5642e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, r0.m5611d(i10)) : 0;
        this.f9069d = iMax;
        if (iMax == 0) {
            jArr = r0.f9045a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
        }
        this.f9066a = jArr;
        int i11 = iMax >> 3;
        long j6 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j6)) | j6;
        this.f9071f = r0.m5608a(this.f9069d) - this.f9070e;
        this.f9067b = new int[iMax];
        this.f9068c = new int[iMax];
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
            boolean r3 = r1 instanceof e1.C1920v
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            e1.v r1 = (e1.C1920v) r1
            int r3 = r1.f9070e
            int r5 = r0.f9070e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f9067b
            int[] r5 = r0.f9068c
            long[] r6 = r0.f9066a
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
            int r15 = r1.m5640c(r15)
            if (r15 < 0) goto L5d
            r16 = r2
            int[] r2 = r1.f9068c
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
        throw new UnsupportedOperationException("Method not decompiled: e1.C1920v.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        r2 = m5639b(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (r37.f9071f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (((r37.f9066a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        r2 = r37.f9069d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r2 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        if (java.lang.Long.compare((r37.f9070e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
    
        r2 = r37.f9066a;
        r3 = r37.f9069d;
        r5 = r37.f9067b;
        r6 = r37.f9068c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        if (r7 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        r29 = r9;
        r27 = r11;
        r12 = 7;
        r7 = rw.AbstractC6662l.m12734x(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0112, code lost:
    
        if (r7 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0114, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0123, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = m5639b(r10);
        r10 = r10 & r3;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
    
        r32 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r27 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0171, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0183, code lost:
    
        if (((r14 >> r12) & r27) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0185, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r27 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(r27 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01af, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((r9 & 127) << r12) | ((~(r27 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d0, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r31;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e9, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f9071f = e1.r0.m5608a(r37.f9069d) - r37.f9070e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01fc, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0207, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020a, code lost:
    
        r2 = e1.r0.m5610c(r37.f9069d);
        r3 = r37.f9066a;
        r5 = r37.f9067b;
        r6 = r37.f9068c;
        r7 = r37.f9069d;
        m5642e(r2);
        r2 = r37.f9066a;
        r8 = r37.f9067b;
        r9 = r37.f9068c;
        r10 = r37.f9069d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0225, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0234, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0236, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = m5639b(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0272, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0273, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0279, code lost:
    
        r2 = m5639b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x027d, code lost:
    
        r37.f9070e++;
        r1 = r37.f9071f;
        r3 = r37.f9066a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0295, code lost:
    
        if (((r5 >> r7) & r27) != r19) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0297, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0299, code lost:
    
        r37.f9071f = r1 - r32;
        r1 = r37.f9069d;
        r5 = (r5 & (~(r27 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5643f(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C1920v.m5643f(int, int):void");
    }

    public final int hashCode() {
        int[] iArr = this.f9067b;
        int[] iArr2 = this.f9068c;
        long[] jArr = this.f9066a;
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
                        int i14 = iArr[i13];
                        iHashCode += Integer.hashCode(iArr2[i13]) ^ Integer.hashCode(i14);
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f9070e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f9067b
            int[] r3 = r0.f9068c
            long[] r4 = r0.f9066a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
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
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f9070e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C1920v.toString():java.lang.String");
    }
}
