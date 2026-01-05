package androidx.datastore.preferences.protobuf;

import b00.C0525j;
import dx.AbstractC1851a;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.m */
/* loaded from: classes.dex */
public final class C0318m extends AbstractC1851a {

    /* renamed from: f */
    public static final Logger f2368f = Logger.getLogger(C0318m.class.getName());

    /* renamed from: g */
    public static final boolean f2369g = n1.f2383e;

    /* renamed from: a */
    public i0 f2370a;

    /* renamed from: b */
    public final byte[] f2371b;

    /* renamed from: c */
    public final int f2372c;

    /* renamed from: d */
    public int f2373d;

    /* renamed from: e */
    public final C0525j f2374e;

    public C0318m(C0525j c0525j, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f2371b = new byte[iMax];
        this.f2372c = iMax;
        this.f2374e = c0525j;
    }

    /* renamed from: j */
    public static int m965j(int i10, C0312g c0312g) {
        int iM967l = m967l(i10);
        int size = c0312g.size();
        return m968m(size) + size + iM967l;
    }

    /* renamed from: k */
    public static int m966k(String str) {
        int length;
        try {
            length = q1.m1067a(str);
        } catch (p1 unused) {
            length = str.getBytes(b0.f2293a).length;
        }
        return m968m(length) + length;
    }

    /* renamed from: l */
    public static int m967l(int i10) {
        return m968m(i10 << 3);
    }

    /* renamed from: m */
    public static int m968m(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* renamed from: n */
    public static int m969n(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    /* renamed from: A */
    public final void m970A(int i10) throws IOException {
        if (i10 >= 0) {
            m976G(i10);
        } else {
            m978I(i10);
        }
    }

    /* renamed from: B */
    public final void m971B(int i10, AbstractC0306a abstractC0306a, a1 a1Var) throws IOException {
        m974E(i10, 2);
        m976G(abstractC0306a.mo808a(a1Var));
        a1Var.mo814e(abstractC0306a, this.f2370a);
    }

    /* renamed from: C */
    public final void m972C(int i10, String str) throws IOException {
        m974E(i10, 2);
        m973D(str);
    }

    /* renamed from: D */
    public final void m973D(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM968m = m968m(length);
            int i10 = iM968m + length;
            int i11 = this.f2372c;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iM1031h = q1.f2407a.m1031h(str, bArr, 0, length);
                m976G(iM1031h);
                m988r(bArr, 0, iM1031h);
                return;
            }
            if (i10 > i11 - this.f2373d) {
                m985o();
            }
            int iM968m2 = m968m(str.length());
            int i12 = this.f2373d;
            byte[] bArr2 = this.f2371b;
            try {
                if (iM968m2 == iM968m) {
                    int i13 = i12 + iM968m2;
                    this.f2373d = i13;
                    int iM1031h2 = q1.f2407a.m1031h(str, bArr2, i13, i11 - i13);
                    this.f2373d = i12;
                    m983h((iM1031h2 - i12) - iM968m2);
                    this.f2373d = iM1031h2;
                } else {
                    int iM1067a = q1.m1067a(str);
                    m983h(iM1067a);
                    this.f2373d = q1.f2407a.m1031h(str, bArr2, this.f2373d, iM1067a);
                }
            } catch (p1 e2) {
                this.f2373d = i12;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(e10);
            }
        } catch (p1 e11) {
            f2368f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(b0.f2293a);
            try {
                m976G(bytes.length);
                mo979d(0, bytes.length, bytes);
            } catch (IndexOutOfBoundsException e12) {
                throw new CodedOutputStream$OutOfSpaceException(e12);
            }
        }
    }

    /* renamed from: E */
    public final void m974E(int i10, int i11) {
        m976G((i10 << 3) | i11);
    }

    /* renamed from: F */
    public final void m975F(int i10, int i11) throws IOException {
        m986p(20);
        m982g(i10, 0);
        m983h(i11);
    }

    /* renamed from: G */
    public final void m976G(int i10) throws IOException {
        m986p(5);
        m983h(i10);
    }

    /* renamed from: H */
    public final void m977H(int i10, long j6) throws IOException {
        m986p(20);
        m982g(i10, 0);
        m984i(j6);
    }

    /* renamed from: I */
    public final void m978I(long j6) throws IOException {
        m986p(10);
        m984i(j6);
    }

    @Override // dx.AbstractC1851a
    /* renamed from: d */
    public final void mo979d(int i10, int i11, byte[] bArr) throws IOException {
        m988r(bArr, i10, i11);
    }

    /* renamed from: e */
    public final void m980e(int i10) {
        int i11 = this.f2373d;
        int i12 = i11 + 1;
        this.f2373d = i12;
        byte[] bArr = this.f2371b;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f2373d = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f2373d = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f2373d = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    /* renamed from: f */
    public final void m981f(long j6) {
        int i10 = this.f2373d;
        int i11 = i10 + 1;
        this.f2373d = i11;
        byte[] bArr = this.f2371b;
        bArr[i10] = (byte) (j6 & 255);
        int i12 = i10 + 2;
        this.f2373d = i12;
        bArr[i11] = (byte) ((j6 >> 8) & 255);
        int i13 = i10 + 3;
        this.f2373d = i13;
        bArr[i12] = (byte) ((j6 >> 16) & 255);
        int i14 = i10 + 4;
        this.f2373d = i14;
        bArr[i13] = (byte) (255 & (j6 >> 24));
        int i15 = i10 + 5;
        this.f2373d = i15;
        bArr[i14] = (byte) (((int) (j6 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f2373d = i16;
        bArr[i15] = (byte) (((int) (j6 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f2373d = i17;
        bArr[i16] = (byte) (((int) (j6 >> 48)) & 255);
        this.f2373d = i10 + 8;
        bArr[i17] = (byte) (((int) (j6 >> 56)) & 255);
    }

    /* renamed from: g */
    public final void m982g(int i10, int i11) {
        m983h((i10 << 3) | i11);
    }

    /* renamed from: h */
    public final void m983h(int i10) {
        boolean z6 = f2369g;
        byte[] bArr = this.f2371b;
        if (z6) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f2373d;
                this.f2373d = i11 + 1;
                n1.m1016j(bArr, i11, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            int i12 = this.f2373d;
            this.f2373d = i12 + 1;
            n1.m1016j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f2373d;
            this.f2373d = i13 + 1;
            bArr[i13] = (byte) ((i10 | 128) & 255);
            i10 >>>= 7;
        }
        int i14 = this.f2373d;
        this.f2373d = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    /* renamed from: i */
    public final void m984i(long j6) {
        boolean z6 = f2369g;
        byte[] bArr = this.f2371b;
        if (z6) {
            while ((j6 & (-128)) != 0) {
                int i10 = this.f2373d;
                this.f2373d = i10 + 1;
                n1.m1016j(bArr, i10, (byte) ((((int) j6) | 128) & 255));
                j6 >>>= 7;
            }
            int i11 = this.f2373d;
            this.f2373d = i11 + 1;
            n1.m1016j(bArr, i11, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            int i12 = this.f2373d;
            this.f2373d = i12 + 1;
            bArr[i12] = (byte) ((((int) j6) | 128) & 255);
            j6 >>>= 7;
        }
        int i13 = this.f2373d;
        this.f2373d = i13 + 1;
        bArr[i13] = (byte) j6;
    }

    /* renamed from: o */
    public final void m985o() throws IOException {
        this.f2374e.write(this.f2371b, 0, this.f2373d);
        this.f2373d = 0;
    }

    /* renamed from: p */
    public final void m986p(int i10) throws IOException {
        if (this.f2372c - this.f2373d < i10) {
            m985o();
        }
    }

    /* renamed from: q */
    public final void m987q(byte b10) throws IOException {
        if (this.f2373d == this.f2372c) {
            m985o();
        }
        int i10 = this.f2373d;
        this.f2373d = i10 + 1;
        this.f2371b[i10] = b10;
    }

    /* renamed from: r */
    public final void m988r(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f2373d;
        int i13 = this.f2372c;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f2371b;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f2373d += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f2373d = i13;
        m985o();
        if (i16 > i13) {
            this.f2374e.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f2373d = i16;
        }
    }

    /* renamed from: s */
    public final void m989s(int i10, boolean z6) throws IOException {
        m986p(11);
        m982g(i10, 0);
        byte b10 = z6 ? (byte) 1 : (byte) 0;
        int i11 = this.f2373d;
        this.f2373d = i11 + 1;
        this.f2371b[i11] = b10;
    }

    /* renamed from: t */
    public final void m990t(int i10, C0312g c0312g) {
        m974E(i10, 2);
        m991u(c0312g);
    }

    /* renamed from: u */
    public final void m991u(C0312g c0312g) throws IOException {
        m976G(c0312g.size());
        mo979d(c0312g.mo867g(), c0312g.size(), c0312g.f2328b);
    }

    /* renamed from: v */
    public final void m992v(int i10, int i11) throws IOException {
        m986p(14);
        m982g(i10, 5);
        m980e(i11);
    }

    /* renamed from: w */
    public final void m993w(int i10) throws IOException {
        m986p(4);
        m980e(i10);
    }

    /* renamed from: x */
    public final void m994x(int i10, long j6) throws IOException {
        m986p(18);
        m982g(i10, 1);
        m981f(j6);
    }

    /* renamed from: y */
    public final void m995y(long j6) throws IOException {
        m986p(8);
        m981f(j6);
    }

    /* renamed from: z */
    public final void m996z(int i10, int i11) throws IOException {
        m986p(20);
        m982g(i10, 0);
        if (i11 >= 0) {
            m983h(i11);
        } else {
            m984i(i11);
        }
    }
}
