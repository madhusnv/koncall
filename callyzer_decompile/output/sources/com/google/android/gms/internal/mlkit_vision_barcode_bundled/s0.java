package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;
import og.ab;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends ab {

    /* renamed from: f */
    public static final Logger f6659f = Logger.getLogger(s0.class.getName());

    /* renamed from: g */
    public static final boolean f6660g = n2.f6618e;

    /* renamed from: b */
    public p1 f6661b;

    /* renamed from: c */
    public final byte[] f6662c;

    /* renamed from: d */
    public final int f6663d;

    /* renamed from: e */
    public int f6664e;

    public s0(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.f6662c = bArr;
        this.f6664e = 0;
        this.f6663d = i10;
    }

    /* renamed from: a */
    public static int m3951a(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* renamed from: b */
    public static int m3952b(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    /* renamed from: r */
    public static int m3953r(String str) {
        int length;
        try {
            length = p2.m3939c(str);
        } catch (o2 unused) {
            length = str.getBytes(l1.f6594a).length;
        }
        return m3951a(length) + length;
    }

    /* renamed from: c */
    public final void m3954c(byte b10) {
        try {
            byte[] bArr = this.f6662c;
            int i10 = this.f6664e;
            this.f6664e = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6664e), Integer.valueOf(this.f6663d), 1), e2);
        }
    }

    /* renamed from: d */
    public final void m3955d(int i10, int i11, byte[] bArr) {
        try {
            System.arraycopy(bArr, i10, this.f6662c, this.f6664e, i11);
            this.f6664e += i11;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6664e), Integer.valueOf(this.f6663d), Integer.valueOf(i11)), e2);
        }
    }

    /* renamed from: e */
    public final void m3956e(int i10, r0 r0Var) {
        m3966o((i10 << 3) | 2);
        m3966o(r0Var.mo3818e());
        r0Var.mo3826s(this);
    }

    /* renamed from: f */
    public final void m3957f(int i10, int i11) {
        m3966o((i10 << 3) | 5);
        m3958g(i11);
    }

    /* renamed from: g */
    public final void m3958g(int i10) {
        try {
            byte[] bArr = this.f6662c;
            int i11 = this.f6664e;
            int i12 = i11 + 1;
            this.f6664e = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f6664e = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f6664e = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f6664e = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6664e), Integer.valueOf(this.f6663d), 1), e2);
        }
    }

    /* renamed from: h */
    public final void m3959h(int i10, long j6) {
        m3966o((i10 << 3) | 1);
        m3960i(j6);
    }

    /* renamed from: i */
    public final void m3960i(long j6) {
        try {
            byte[] bArr = this.f6662c;
            int i10 = this.f6664e;
            int i11 = i10 + 1;
            this.f6664e = i11;
            bArr[i10] = (byte) (((int) j6) & 255);
            int i12 = i10 + 2;
            this.f6664e = i12;
            bArr[i11] = (byte) (((int) (j6 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f6664e = i13;
            bArr[i12] = (byte) (((int) (j6 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f6664e = i14;
            bArr[i13] = (byte) (((int) (j6 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f6664e = i15;
            bArr[i14] = (byte) (((int) (j6 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f6664e = i16;
            bArr[i15] = (byte) (((int) (j6 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f6664e = i17;
            bArr[i16] = (byte) (((int) (j6 >> 48)) & 255);
            this.f6664e = i10 + 8;
            bArr[i17] = (byte) (((int) (j6 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6664e), Integer.valueOf(this.f6663d), 1), e2);
        }
    }

    /* renamed from: j */
    public final void m3961j(int i10, int i11) {
        m3966o(i10 << 3);
        m3962k(i11);
    }

    /* renamed from: k */
    public final void m3962k(int i10) {
        if (i10 >= 0) {
            m3966o(i10);
        } else {
            m3968q(i10);
        }
    }

    /* renamed from: l */
    public final void m3963l(int i10, String str) throws zzdl {
        m3966o((i10 << 3) | 2);
        int i11 = this.f6664e;
        try {
            int iM3951a = m3951a(str.length() * 3);
            int iM3951a2 = m3951a(str.length());
            int i12 = this.f6663d;
            byte[] bArr = this.f6662c;
            if (iM3951a2 != iM3951a) {
                m3966o(p2.m3939c(str));
                int i13 = this.f6664e;
                this.f6664e = p2.m3938b(str, bArr, i13, i12 - i13);
            } else {
                int i14 = i11 + iM3951a2;
                this.f6664e = i14;
                int iM3938b = p2.m3938b(str, bArr, i14, i12 - i14);
                this.f6664e = i11;
                m3966o((iM3938b - i11) - iM3951a2);
                this.f6664e = iM3938b;
            }
        } catch (o2 e2) {
            this.f6664e = i11;
            f6659f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(l1.f6594a);
            try {
                int length = bytes.length;
                m3966o(length);
                m3955d(0, length, bytes);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzdl(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new zzdl(e11);
        }
    }

    /* renamed from: m */
    public final void m3964m(int i10, int i11) {
        m3966o((i10 << 3) | i11);
    }

    /* renamed from: n */
    public final void m3965n(int i10, int i11) {
        m3966o(i10 << 3);
        m3966o(i11);
    }

    /* renamed from: o */
    public final void m3966o(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f6662c;
            if (i11 == 0) {
                int i12 = this.f6664e;
                this.f6664e = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f6664e;
                    this.f6664e = i13 + 1;
                    bArr[i13] = (byte) ((i10 | 128) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6664e), Integer.valueOf(this.f6663d), 1), e2);
                }
            }
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6664e), Integer.valueOf(this.f6663d), 1), e2);
        }
    }

    /* renamed from: p */
    public final void m3967p(int i10, long j6) {
        m3966o(i10 << 3);
        m3968q(j6);
    }

    /* renamed from: q */
    public final void m3968q(long j6) {
        boolean z6 = f6660g;
        int i10 = this.f6663d;
        byte[] bArr = this.f6662c;
        if (!z6 || i10 - this.f6664e < 10) {
            while ((j6 & (-128)) != 0) {
                try {
                    int i11 = this.f6664e;
                    this.f6664e = i11 + 1;
                    bArr[i11] = (byte) ((((int) j6) | 128) & 255);
                    j6 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6664e), Integer.valueOf(i10), 1), e2);
                }
            }
            int i12 = this.f6664e;
            this.f6664e = i12 + 1;
            bArr[i12] = (byte) j6;
            return;
        }
        while (true) {
            int i13 = (int) j6;
            if ((j6 & (-128)) == 0) {
                int i14 = this.f6664e;
                this.f6664e = i14 + 1;
                n2.f6616c.mo3911d(bArr, n2.f6619f + i14, (byte) i13);
                return;
            }
            int i15 = this.f6664e;
            this.f6664e = i15 + 1;
            n2.f6616c.mo3911d(bArr, n2.f6619f + i15, (byte) ((i13 | 128) & 255));
            j6 >>>= 7;
        }
    }
}
