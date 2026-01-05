package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.j */
/* loaded from: classes.dex */
public final class C1383j extends AbstractC1384k {

    /* renamed from: d */
    public final byte[] f7054d;

    /* renamed from: e */
    public int f7055e;

    /* renamed from: f */
    public int f7056f;

    /* renamed from: g */
    public int f7057g;

    /* renamed from: h */
    public final int f7058h;

    /* renamed from: i */
    public int f7059i;

    /* renamed from: j */
    public int f7060j;

    public C1383j(byte[] bArr, int i10, int i11, boolean z6) {
        this.f7062b = 100;
        this.f7060j = Integer.MAX_VALUE;
        this.f7054d = bArr;
        this.f7055e = i11 + i10;
        this.f7057g = i10;
        this.f7058h = i10;
    }

    /* renamed from: c */
    public final int m4287c() {
        return this.f7057g - this.f7058h;
    }

    /* renamed from: d */
    public final boolean m4288d() {
        return this.f7057g == this.f7055e;
    }

    /* renamed from: e */
    public final int m4289e(int i10) {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.m4152d();
        }
        int iM4287c = m4287c() + i10;
        int i11 = this.f7060j;
        if (iM4287c > i11) {
            throw InvalidProtocolBufferException.m4154f();
        }
        this.f7060j = iM4287c;
        m4297m();
        return i11;
    }

    /* renamed from: f */
    public final boolean m4290f() {
        return m4294j() != 0;
    }

    /* renamed from: g */
    public final int m4291g() throws InvalidProtocolBufferException {
        int i10 = this.f7057g;
        if (this.f7055e - i10 < 4) {
            throw InvalidProtocolBufferException.m4154f();
        }
        this.f7057g = i10 + 4;
        byte[] bArr = this.f7054d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* renamed from: h */
    public final long m4292h() throws InvalidProtocolBufferException {
        int i10 = this.f7057g;
        if (this.f7055e - i10 < 8) {
            throw InvalidProtocolBufferException.m4154f();
        }
        this.f7057g = i10 + 8;
        byte[] bArr = this.f7054d;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* renamed from: i */
    public final int m4293i() {
        int i10;
        int i11 = this.f7057g;
        int i12 = this.f7055e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f7054d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f7057g = i13;
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
                this.f7057g = i14;
                return i10;
            }
        }
        return (int) m4295k();
    }

    /* renamed from: j */
    public final long m4294j() {
        long j6;
        long j10;
        long j11;
        long j12;
        int i10 = this.f7057g;
        int i11 = this.f7055e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f7054d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f7057g = i12;
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
                this.f7057g = i13;
                return j6;
            }
        }
        return m4295k();
    }

    /* renamed from: k */
    public final long m4295k() throws InvalidProtocolBufferException {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f7057g;
            if (i11 == this.f7055e) {
                throw InvalidProtocolBufferException.m4154f();
            }
            this.f7057g = i11 + 1;
            j6 |= (r3 & 127) << i10;
            if ((this.f7054d[i11] & 128) == 0) {
                return j6;
            }
        }
        throw InvalidProtocolBufferException.m4151c();
    }

    /* renamed from: l */
    public final int m4296l() {
        if (m4288d()) {
            this.f7059i = 0;
            return 0;
        }
        int iM4293i = m4293i();
        this.f7059i = iM4293i;
        if ((iM4293i >>> 3) != 0) {
            return iM4293i;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: m */
    public final void m4297m() {
        int i10 = this.f7055e + this.f7056f;
        this.f7055e = i10;
        int i11 = i10 - this.f7058h;
        int i12 = this.f7060j;
        if (i11 <= i12) {
            this.f7056f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f7056f = i13;
        this.f7055e = i10 - i13;
    }
}
