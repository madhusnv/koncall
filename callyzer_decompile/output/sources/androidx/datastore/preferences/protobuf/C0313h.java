package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.h */
/* loaded from: classes.dex */
public final class C0313h extends AbstractC0315j {

    /* renamed from: c */
    public final byte[] f2330c;

    /* renamed from: d */
    public int f2331d;

    /* renamed from: e */
    public int f2332e;

    /* renamed from: f */
    public int f2333f;

    /* renamed from: g */
    public final int f2334g;

    /* renamed from: h */
    public int f2335h;

    /* renamed from: j */
    public int f2336j = Integer.MAX_VALUE;

    public C0313h(byte[] bArr, int i10, int i11, boolean z6) {
        this.f2330c = bArr;
        this.f2331d = i11 + i10;
        this.f2333f = i10;
        this.f2334g = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: A */
    public final int mo873A() {
        return m878G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: B */
    public final long mo874B() {
        return m879H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: C */
    public final boolean mo875C(int i10) throws InvalidProtocolBufferException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                m882K(8);
                return true;
            }
            if (i11 == 2) {
                m882K(m878G());
                return true;
            }
            if (i11 == 3) {
                m924D();
                mo883a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.m804b();
            }
            m882K(4);
            return true;
        }
        int i13 = this.f2331d - this.f2333f;
        byte[] bArr = this.f2330c;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f2333f;
                this.f2333f = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw InvalidProtocolBufferException.m805c();
        }
        while (i12 < 10) {
            int i15 = this.f2333f;
            if (i15 == this.f2331d) {
                throw InvalidProtocolBufferException.m807e();
            }
            this.f2333f = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw InvalidProtocolBufferException.m805c();
        return true;
    }

    /* renamed from: E */
    public final int m876E() throws InvalidProtocolBufferException {
        int i10 = this.f2333f;
        if (this.f2331d - i10 < 4) {
            throw InvalidProtocolBufferException.m807e();
        }
        this.f2333f = i10 + 4;
        byte[] bArr = this.f2330c;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* renamed from: F */
    public final long m877F() throws InvalidProtocolBufferException {
        int i10 = this.f2333f;
        if (this.f2331d - i10 < 8) {
            throw InvalidProtocolBufferException.m807e();
        }
        this.f2333f = i10 + 8;
        byte[] bArr = this.f2330c;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* renamed from: G */
    public final int m878G() {
        int i10;
        int i11 = this.f2333f;
        int i12 = this.f2331d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f2330c;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f2333f = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f2333f = i14;
                return i10;
            }
        }
        return (int) m880I();
    }

    /* renamed from: H */
    public final long m879H() {
        long j6;
        long j10;
        long j11;
        long j12;
        int i10 = this.f2333f;
        int i11 = this.f2331d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f2330c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f2333f = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j6 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j6 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j12 = (-2080896) ^ i18;
                        } else {
                            long j13 = i18;
                            i13 = i10 + 5;
                            long j14 = j13 ^ (bArr[i17] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j15 = j14 ^ (bArr[i13] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j14 = j15 ^ (bArr[i17] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j15 = j14 ^ (bArr[i13] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j16 = (j15 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j6 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j6 = j11 ^ j14;
                        }
                        i13 = i17;
                        j6 = j12;
                    }
                }
                this.f2333f = i13;
                return j6;
            }
        }
        return m880I();
    }

    /* renamed from: I */
    public final long m880I() throws InvalidProtocolBufferException {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f2333f;
            if (i11 == this.f2331d) {
                throw InvalidProtocolBufferException.m807e();
            }
            this.f2333f = i11 + 1;
            j6 |= (r3 & 127) << i10;
            if ((this.f2330c[i11] & 128) == 0) {
                return j6;
            }
        }
        throw InvalidProtocolBufferException.m805c();
    }

    /* renamed from: J */
    public final void m881J() {
        int i10 = this.f2331d + this.f2332e;
        this.f2331d = i10;
        int i11 = i10 - this.f2334g;
        int i12 = this.f2336j;
        if (i11 <= i12) {
            this.f2332e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f2332e = i13;
        this.f2331d = i10 - i13;
    }

    /* renamed from: K */
    public final void m882K(int i10) throws InvalidProtocolBufferException {
        if (i10 >= 0) {
            int i11 = this.f2331d;
            int i12 = this.f2333f;
            if (i10 <= i11 - i12) {
                this.f2333f = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw InvalidProtocolBufferException.m807e();
        }
        throw InvalidProtocolBufferException.m806d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: a */
    public final void mo883a(int i10) throws InvalidProtocolBufferException {
        if (this.f2335h != i10) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: b */
    public final int mo884b() {
        return this.f2333f - this.f2334g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: c */
    public final boolean mo885c() {
        return this.f2333f == this.f2331d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: i */
    public final void mo886i(int i10) {
        this.f2336j = i10;
        m881J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: j */
    public final int mo887j(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.m806d();
        }
        int iMo884b = mo884b() + i10;
        if (iMo884b < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i11 = this.f2336j;
        if (iMo884b > i11) {
            throw InvalidProtocolBufferException.m807e();
        }
        this.f2336j = iMo884b;
        m881J();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: k */
    public final boolean mo888k() {
        return m879H() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.datastore.preferences.protobuf.C0312g mo889l() throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        /*
            r4 = this;
            int r0 = r4.m878G()
            byte[] r1 = r4.f2330c
            if (r0 <= 0) goto L19
            int r2 = r4.f2331d
            int r3 = r4.f2333f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.C0312g.m870c(r3, r0, r1)
            int r2 = r4.f2333f
            int r2 = r2 + r0
            r4.f2333f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.g r0 = androidx.datastore.preferences.protobuf.C0312g.f2325c
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f2331d
            int r3 = r4.f2333f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f2333f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.datastore.preferences.protobuf.b0.f2294b
        L35:
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.C0312g.f2325c
            androidx.datastore.preferences.protobuf.g r1 = new androidx.datastore.preferences.protobuf.g
            r1.<init>(r0)
            return r1
        L3d:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m806d()
            throw r0
        L42:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m807e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0313h.mo889l():androidx.datastore.preferences.protobuf.g");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: m */
    public final double mo890m() {
        return Double.longBitsToDouble(m877F());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: n */
    public final int mo891n() {
        return m878G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: o */
    public final int mo892o() {
        return m876E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: p */
    public final long mo893p() {
        return m877F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: q */
    public final float mo894q() {
        return Float.intBitsToFloat(m876E());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: r */
    public final int mo895r() {
        return m878G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: s */
    public final long mo896s() {
        return m879H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: t */
    public final int mo897t() {
        return m876E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: u */
    public final long mo898u() {
        return m877F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: v */
    public final int mo899v() {
        int iM878G = m878G();
        return (-(iM878G & 1)) ^ (iM878G >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: w */
    public final long mo900w() {
        long jM879H = m879H();
        return (-(jM879H & 1)) ^ (jM879H >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: x */
    public final String mo901x() throws InvalidProtocolBufferException {
        int iM878G = m878G();
        if (iM878G > 0) {
            int i10 = this.f2331d;
            int i11 = this.f2333f;
            if (iM878G <= i10 - i11) {
                String str = new String(this.f2330c, i11, iM878G, b0.f2293a);
                this.f2333f += iM878G;
                return str;
            }
        }
        if (iM878G == 0) {
            return "";
        }
        if (iM878G < 0) {
            throw InvalidProtocolBufferException.m806d();
        }
        throw InvalidProtocolBufferException.m807e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: y */
    public final String mo902y() throws InvalidProtocolBufferException {
        int iM878G = m878G();
        if (iM878G > 0) {
            int i10 = this.f2331d;
            int i11 = this.f2333f;
            if (iM878G <= i10 - i11) {
                String strM1030g = q1.f2407a.m1030g(i11, iM878G, this.f2330c);
                this.f2333f += iM878G;
                return strM1030g;
            }
        }
        if (iM878G == 0) {
            return "";
        }
        if (iM878G <= 0) {
            throw InvalidProtocolBufferException.m806d();
        }
        throw InvalidProtocolBufferException.m807e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: z */
    public final int mo903z() throws InvalidProtocolBufferException {
        if (mo885c()) {
            this.f2335h = 0;
            return 0;
        }
        int iM878G = m878G();
        this.f2335h = iM878G;
        if ((iM878G >>> 3) != 0) {
            return iM878G;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }
}
