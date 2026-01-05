package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import og.va;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a5 extends va {

    /* renamed from: e */
    public static final Logger f6057e = Logger.getLogger(a5.class.getName());

    /* renamed from: f */
    public static final boolean f6058f = r6.f6357e;

    /* renamed from: a */
    public v5 f6059a;

    /* renamed from: b */
    public final byte[] f6060b;

    /* renamed from: c */
    public final int f6061c;

    /* renamed from: d */
    public int f6062d;

    public a5(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC5601a.m11235f("Array range is invalid. Buffer.length=", length, i10, ", offset=0, length="));
        }
        this.f6060b = bArr;
        this.f6062d = 0;
        this.f6061c = i10;
    }

    /* renamed from: a */
    public static int m3111a(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    /* renamed from: b */
    public static int m3112b(String str) {
        int length;
        try {
            length = t6.m3671b(str);
        } catch (s6 unused) {
            length = str.getBytes(p5.f6342a).length;
        }
        return m3113r(length) + length;
    }

    /* renamed from: r */
    public static int m3113r(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* renamed from: c */
    public final void m3114c(int i10, int i11) throws zzll {
        m3123l((i10 << 3) | i11);
    }

    /* renamed from: d */
    public final void m3115d(int i10, int i11) throws zzll {
        m3123l(i10 << 3);
        m3122k(i11);
    }

    /* renamed from: e */
    public final void m3116e(int i10, int i11) throws zzll {
        m3123l(i10 << 3);
        m3123l(i11);
    }

    /* renamed from: f */
    public final void m3117f(int i10, int i11) throws zzll {
        m3123l((i10 << 3) | 5);
        m3124m(i11);
    }

    /* renamed from: g */
    public final void m3118g(int i10, long j6) throws zzll {
        m3123l(i10 << 3);
        m3125n(j6);
    }

    /* renamed from: h */
    public final void m3119h(int i10, long j6) throws zzll {
        m3123l((i10 << 3) | 1);
        m3126o(j6);
    }

    /* renamed from: i */
    public final void m3120i(z4 z4Var) throws zzll {
        m3123l(z4Var.mo3794c());
        m3127p(z4Var.mo3794c(), z4Var.f6470b);
    }

    /* renamed from: j */
    public final void m3121j(byte b10) throws zzll {
        int i10 = this.f6062d;
        try {
            int i11 = i10 + 1;
            try {
                this.f6060b[i10] = b10;
                this.f6062d = i11;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i10 = i11;
                throw new zzll(i10, this.f6061c, 1, e);
            }
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
    }

    /* renamed from: k */
    public final void m3122k(int i10) throws zzll {
        if (i10 >= 0) {
            m3123l(i10);
        } else {
            m3125n(i10);
        }
    }

    /* renamed from: l */
    public final void m3123l(int i10) throws zzll {
        int i11;
        int i12 = this.f6062d;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.f6060b;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f6062d = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzll(i11, this.f6061c, 1, e2);
                }
            }
            throw new zzll(i11, this.f6061c, 1, e2);
        }
    }

    /* renamed from: m */
    public final void m3124m(int i10) throws zzll {
        int i11 = this.f6062d;
        try {
            byte[] bArr = this.f6060b;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f6062d = i11 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(i11, this.f6061c, 4, e2);
        }
    }

    /* renamed from: n */
    public final void m3125n(long j6) throws zzll {
        int i10;
        int i11 = this.f6062d;
        int i12 = this.f6061c;
        byte[] bArr = this.f6060b;
        if (!f6058f || i12 - i11 < 10) {
            long j10 = j6;
            while ((j10 & (-128)) != 0) {
                int i13 = i11 + 1;
                try {
                    bArr[i11] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i11 = i13;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i10 = i13;
                    throw new zzll(i10, i12, 1, e);
                }
            }
            i10 = i11 + 1;
            try {
                bArr[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                throw new zzll(i10, i12, 1, e);
            }
        } else {
            long j11 = j6;
            while ((j11 & (-128)) != 0) {
                r6.f6355c.mo3531a(bArr, r6.f6358f + i11, (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            r6.f6355c.mo3531a(bArr, r6.f6358f + i11, (byte) j11);
        }
        this.f6062d = i10;
    }

    /* renamed from: o */
    public final void m3126o(long j6) throws zzll {
        int i10 = this.f6062d;
        try {
            byte[] bArr = this.f6060b;
            bArr[i10] = (byte) j6;
            bArr[i10 + 1] = (byte) (j6 >> 8);
            bArr[i10 + 2] = (byte) (j6 >> 16);
            bArr[i10 + 3] = (byte) (j6 >> 24);
            bArr[i10 + 4] = (byte) (j6 >> 32);
            bArr[i10 + 5] = (byte) (j6 >> 40);
            bArr[i10 + 6] = (byte) (j6 >> 48);
            bArr[i10 + 7] = (byte) (j6 >> 56);
            this.f6062d = i10 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(i10, this.f6061c, 8, e2);
        }
    }

    /* renamed from: p */
    public final void m3127p(int i10, byte[] bArr) throws zzll {
        try {
            System.arraycopy(bArr, 0, this.f6060b, this.f6062d, i10);
            this.f6062d += i10;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(this.f6062d, this.f6061c, i10, e2);
        }
    }

    /* renamed from: q */
    public final void m3128q(String str) throws zzll {
        int i10 = this.f6062d;
        try {
            int iM3113r = m3113r(str.length() * 3);
            int iM3113r2 = m3113r(str.length());
            int i11 = this.f6061c;
            byte[] bArr = this.f6060b;
            if (iM3113r2 != iM3113r) {
                m3123l(t6.m3671b(str));
                int i12 = this.f6062d;
                this.f6062d = t6.m3672c(str, bArr, i12, i11 - i12);
            } else {
                int i13 = i10 + iM3113r2;
                this.f6062d = i13;
                int iM3672c = t6.m3672c(str, bArr, i13, i11 - i13);
                this.f6062d = i10;
                m3123l((iM3672c - i10) - iM3113r2);
                this.f6062d = iM3672c;
            }
        } catch (s6 e2) {
            this.f6062d = i10;
            f6057e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(p5.f6342a);
            try {
                int length = bytes.length;
                m3123l(length);
                m3127p(length, bytes);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzll(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new zzll(e11);
        }
    }
}
