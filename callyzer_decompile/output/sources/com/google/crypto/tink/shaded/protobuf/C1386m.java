package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.m */
/* loaded from: classes.dex */
public final class C1386m extends t0 {

    /* renamed from: e */
    public static final Logger f7071e = Logger.getLogger(C1386m.class.getName());

    /* renamed from: f */
    public static final boolean f7072f = r1.f7097f;

    /* renamed from: a */
    public C1387n f7073a;

    /* renamed from: b */
    public final byte[] f7074b;

    /* renamed from: c */
    public final int f7075c;

    /* renamed from: d */
    public int f7076d;

    public C1386m(byte[] bArr, int i10) {
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.f7074b = bArr;
        this.f7076d = 0;
        this.f7075c = i10;
    }

    /* renamed from: A */
    public static int m4311A(AbstractC1382i abstractC1382i) {
        int size = abstractC1382i.size();
        return m4318H(size) + size;
    }

    /* renamed from: B */
    public static int m4312B(int i10) {
        return m4317G(i10) + 4;
    }

    /* renamed from: C */
    public static int m4313C(int i10) {
        return m4317G(i10) + 8;
    }

    /* renamed from: D */
    public static int m4314D(int i10, AbstractC1374a abstractC1374a, f1 f1Var) {
        int iM4317G = m4317G(i10) * 2;
        abstractC1374a.getClass();
        a0 a0Var = (a0) abstractC1374a;
        int iMo4222i = a0Var.memoizedSerializedSize;
        if (iMo4222i == -1) {
            iMo4222i = f1Var.mo4222i(abstractC1374a);
            a0Var.memoizedSerializedSize = iMo4222i;
        }
        return iMo4222i + iM4317G;
    }

    /* renamed from: E */
    public static int m4315E(int i10) {
        if (i10 >= 0) {
            return m4318H(i10);
        }
        return 10;
    }

    /* renamed from: F */
    public static int m4316F(String str) {
        int length;
        try {
            length = u1.m4453b(str);
        } catch (t1 unused) {
            length = str.getBytes(g0.f7037a).length;
        }
        return m4318H(length) + length;
    }

    /* renamed from: G */
    public static int m4317G(int i10) {
        return m4318H(i10 << 3);
    }

    /* renamed from: H */
    public static int m4318H(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: I */
    public static int m4319I(long j6) {
        int i10;
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (j6 < 0) {
            return 10;
        }
        if (((-34359738368L) & j6) != 0) {
            j6 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j6) != 0) {
            i10 += 2;
            j6 >>>= 14;
        }
        return (j6 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    /* renamed from: z */
    public static int m4320z(int i10, AbstractC1382i abstractC1382i) {
        return m4311A(abstractC1382i) + m4317G(i10);
    }

    /* renamed from: J */
    public final void m4321J(byte b10) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f7074b;
            int i10 = this.f7076d;
            this.f7076d = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7076d), Integer.valueOf(this.f7075c), 1), e2);
        }
    }

    /* renamed from: K */
    public final void m4322K(byte[] bArr, int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i10, this.f7074b, this.f7076d, i11);
            this.f7076d += i11;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7076d), Integer.valueOf(this.f7075c), Integer.valueOf(i11)), e2);
        }
    }

    /* renamed from: L */
    public final void m4323L(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        m4328Q(i10, 5);
        m4324M(i11);
    }

    /* renamed from: M */
    public final void m4324M(int i10) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f7074b;
            int i11 = this.f7076d;
            int i12 = i11 + 1;
            this.f7076d = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f7076d = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f7076d = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f7076d = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7076d), Integer.valueOf(this.f7075c), 1), e2);
        }
    }

    /* renamed from: N */
    public final void m4325N(int i10, long j6) throws CodedOutputStream$OutOfSpaceException {
        m4328Q(i10, 1);
        m4326O(j6);
    }

    /* renamed from: O */
    public final void m4326O(long j6) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f7074b;
            int i10 = this.f7076d;
            int i11 = i10 + 1;
            this.f7076d = i11;
            bArr[i10] = (byte) (((int) j6) & 255);
            int i12 = i10 + 2;
            this.f7076d = i12;
            bArr[i11] = (byte) (((int) (j6 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f7076d = i13;
            bArr[i12] = (byte) (((int) (j6 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f7076d = i14;
            bArr[i13] = (byte) (((int) (j6 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f7076d = i15;
            bArr[i14] = (byte) (((int) (j6 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f7076d = i16;
            bArr[i15] = (byte) (((int) (j6 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f7076d = i17;
            bArr[i16] = (byte) (((int) (j6 >> 48)) & 255);
            this.f7076d = i10 + 8;
            bArr[i17] = (byte) (((int) (j6 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7076d), Integer.valueOf(this.f7075c), 1), e2);
        }
    }

    /* renamed from: P */
    public final void m4327P(int i10) throws CodedOutputStream$OutOfSpaceException {
        if (i10 >= 0) {
            m4329R(i10);
        } else {
            m4331T(i10);
        }
    }

    /* renamed from: Q */
    public final void m4328Q(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        m4329R((i10 << 3) | i11);
    }

    /* renamed from: R */
    public final void m4329R(int i10) throws CodedOutputStream$OutOfSpaceException {
        boolean z6 = f7072f;
        int i11 = this.f7075c;
        byte[] bArr = this.f7074b;
        if (z6 && !AbstractC1376c.m4171a()) {
            int i12 = this.f7076d;
            if (i11 - i12 >= 5) {
                if ((i10 & (-128)) == 0) {
                    this.f7076d = i12 + 1;
                    r1.m4387j(bArr, i12, (byte) i10);
                    return;
                }
                this.f7076d = i12 + 1;
                r1.m4387j(bArr, i12, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & (-128)) == 0) {
                    int i14 = this.f7076d;
                    this.f7076d = i14 + 1;
                    r1.m4387j(bArr, i14, (byte) i13);
                    return;
                }
                int i15 = this.f7076d;
                this.f7076d = i15 + 1;
                r1.m4387j(bArr, i15, (byte) (i13 | 128));
                int i16 = i10 >>> 14;
                if ((i16 & (-128)) == 0) {
                    int i17 = this.f7076d;
                    this.f7076d = i17 + 1;
                    r1.m4387j(bArr, i17, (byte) i16);
                    return;
                }
                int i18 = this.f7076d;
                this.f7076d = i18 + 1;
                r1.m4387j(bArr, i18, (byte) (i16 | 128));
                int i19 = i10 >>> 21;
                if ((i19 & (-128)) == 0) {
                    int i20 = this.f7076d;
                    this.f7076d = i20 + 1;
                    r1.m4387j(bArr, i20, (byte) i19);
                    return;
                } else {
                    int i21 = this.f7076d;
                    this.f7076d = i21 + 1;
                    r1.m4387j(bArr, i21, (byte) (i19 | 128));
                    int i22 = this.f7076d;
                    this.f7076d = i22 + 1;
                    r1.m4387j(bArr, i22, (byte) (i10 >>> 28));
                    return;
                }
            }
        }
        while ((i10 & (-128)) != 0) {
            try {
                int i23 = this.f7076d;
                this.f7076d = i23 + 1;
                bArr[i23] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7076d), Integer.valueOf(i11), 1), e2);
            }
        }
        int i24 = this.f7076d;
        this.f7076d = i24 + 1;
        bArr[i24] = (byte) i10;
    }

    /* renamed from: S */
    public final void m4330S(int i10, long j6) throws CodedOutputStream$OutOfSpaceException {
        m4328Q(i10, 0);
        m4331T(j6);
    }

    /* renamed from: T */
    public final void m4331T(long j6) throws CodedOutputStream$OutOfSpaceException {
        boolean z6 = f7072f;
        int i10 = this.f7075c;
        byte[] bArr = this.f7074b;
        if (z6 && i10 - this.f7076d >= 10) {
            while ((j6 & (-128)) != 0) {
                int i11 = this.f7076d;
                this.f7076d = i11 + 1;
                r1.m4387j(bArr, i11, (byte) ((((int) j6) & 127) | 128));
                j6 >>>= 7;
            }
            int i12 = this.f7076d;
            this.f7076d = i12 + 1;
            r1.m4387j(bArr, i12, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            try {
                int i13 = this.f7076d;
                this.f7076d = i13 + 1;
                bArr[i13] = (byte) ((((int) j6) & 127) | 128);
                j6 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7076d), Integer.valueOf(i10), 1), e2);
            }
        }
        int i14 = this.f7076d;
        this.f7076d = i14 + 1;
        bArr[i14] = (byte) j6;
    }
}
