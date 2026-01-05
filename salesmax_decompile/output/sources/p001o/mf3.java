package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.objectweb.asm.Opcodes;
import p001o.iqi;

/* loaded from: classes4.dex */
public abstract class mf3 extends kq1 {

    /* renamed from: c */
    public static final Logger f35330c = Logger.getLogger(mf3.class.getName());

    /* renamed from: d */
    public static final boolean f35331d = a5i.m16448C();

    /* renamed from: a */
    public of3 f35332a;

    /* renamed from: b */
    public boolean f35333b;

    /* renamed from: o.mf3$b */
    public static class C15305b extends mf3 {

        /* renamed from: e */
        public final byte[] f35334e;

        /* renamed from: f */
        public final int f35335f;

        /* renamed from: g */
        public final int f35336g;

        /* renamed from: h */
        public int f35337h;

        public C15305b(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f35334e = bArr;
            this.f35335f = i;
            this.f35337h = i;
            this.f35336g = i3;
        }

        @Override // p001o.mf3
        public final void C0(int i, String str) throws C15306c {
            D0(i, 2);
            M0(str);
        }

        @Override // p001o.mf3
        public final void D0(int i, int i2) throws C15306c {
            F0(ebj.m24743c(i, i2));
        }

        @Override // p001o.mf3
        public final void E0(int i, int i2) throws C15306c {
            D0(i, 0);
            F0(i2);
        }

        @Override // p001o.mf3
        public final void F0(int i) throws C15306c {
            if (!mf3.f35331d || cd0.m20878c() || mo38915W() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f35334e;
                        int i2 = this.f35337h;
                        this.f35337h = i2 + 1;
                        bArr[i2] = (byte) ((i & Opcodes.LAND) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new C15306c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35337h), Integer.valueOf(this.f35336g), 1), e);
                    }
                }
                byte[] bArr2 = this.f35334e;
                int i3 = this.f35337h;
                this.f35337h = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.f35334e;
                int i4 = this.f35337h;
                this.f35337h = i4 + 1;
                a5i.m16453H(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.f35334e;
            int i5 = this.f35337h;
            this.f35337h = i5 + 1;
            a5i.m16453H(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.f35334e;
                int i7 = this.f35337h;
                this.f35337h = i7 + 1;
                a5i.m16453H(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.f35334e;
            int i8 = this.f35337h;
            this.f35337h = i8 + 1;
            a5i.m16453H(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.f35334e;
                int i10 = this.f35337h;
                this.f35337h = i10 + 1;
                a5i.m16453H(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.f35334e;
            int i11 = this.f35337h;
            this.f35337h = i11 + 1;
            a5i.m16453H(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.f35334e;
                int i13 = this.f35337h;
                this.f35337h = i13 + 1;
                a5i.m16453H(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.f35334e;
            int i14 = this.f35337h;
            this.f35337h = i14 + 1;
            a5i.m16453H(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.f35334e;
            int i15 = this.f35337h;
            this.f35337h = i15 + 1;
            a5i.m16453H(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // p001o.mf3
        public final void G0(int i, long j) throws C15306c {
            D0(i, 0);
            H0(j);
        }

        @Override // p001o.mf3
        public final void H0(long j) throws C15306c {
            if (mf3.f35331d && mo38915W() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f35334e;
                    int i = this.f35337h;
                    this.f35337h = i + 1;
                    a5i.m16453H(bArr, i, (byte) ((((int) j) & Opcodes.LAND) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f35334e;
                int i2 = this.f35337h;
                this.f35337h = i2 + 1;
                a5i.m16453H(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f35334e;
                    int i3 = this.f35337h;
                    this.f35337h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & Opcodes.LAND) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C15306c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35337h), Integer.valueOf(this.f35336g), 1), e);
                }
            }
            byte[] bArr4 = this.f35334e;
            int i4 = this.f35337h;
            this.f35337h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void I0(byte[] bArr, int i, int i2) throws C15306c {
            try {
                System.arraycopy(bArr, i, this.f35334e, this.f35337h, i2);
                this.f35337h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C15306c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35337h), Integer.valueOf(this.f35336g), Integer.valueOf(i2)), e);
            }
        }

        public final void J0(yq1 yq1Var) throws C15306c {
            F0(yq1Var.size());
            yq1Var.mo58091O(this);
        }

        public final void K0(int i, rcb rcbVar) throws C15306c {
            D0(i, 2);
            L0(rcbVar);
        }

        public final void L0(rcb rcbVar) throws C15306c {
            F0(rcbVar.getSerializedSize());
            rcbVar.mo46523c(this);
        }

        public final void M0(String str) throws C15306c {
            int i = this.f35337h;
            try {
                int iM38882N = mf3.m38882N(str.length() * 3);
                int iM38882N2 = mf3.m38882N(str.length());
                if (iM38882N2 == iM38882N) {
                    int i2 = i + iM38882N2;
                    this.f35337h = i2;
                    int iM32564f = iqi.m32564f(str, this.f35334e, i2, mo38915W());
                    this.f35337h = i;
                    F0((iM32564f - i) - iM38882N2);
                    this.f35337h = iM32564f;
                } else {
                    F0(iqi.m32565g(str));
                    this.f35337h = iqi.m32564f(str, this.f35334e, this.f35337h, mo38915W());
                }
            } catch (IndexOutOfBoundsException e) {
                throw new C15306c(e);
            } catch (iqi.C14351d e2) {
                this.f35337h = i;
                m38913S(str, e2);
            }
        }

        @Override // p001o.mf3
        /* renamed from: W */
        public final int mo38915W() {
            return this.f35336g - this.f35337h;
        }

        @Override // p001o.mf3
        /* renamed from: X */
        public final void mo38916X(byte b) throws C15306c {
            try {
                byte[] bArr = this.f35334e;
                int i = this.f35337h;
                this.f35337h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C15306c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35337h), Integer.valueOf(this.f35336g), 1), e);
            }
        }

        @Override // p001o.mf3
        /* renamed from: Y */
        public final void mo38917Y(int i, boolean z) throws C15306c {
            D0(i, 0);
            mo38916X(z ? (byte) 1 : (byte) 0);
        }

        @Override // p001o.mf3, p001o.kq1
        /* renamed from: a */
        public final void mo36045a(byte[] bArr, int i, int i2) throws C15306c {
            I0(bArr, i, i2);
        }

        @Override // p001o.mf3
        public final void a0(int i, yq1 yq1Var) throws C15306c {
            D0(i, 2);
            J0(yq1Var);
        }

        @Override // p001o.mf3
        public final void f0(int i, int i2) throws C15306c {
            D0(i, 5);
            g0(i2);
        }

        @Override // p001o.mf3
        public final void g0(int i) throws C15306c {
            try {
                byte[] bArr = this.f35334e;
                int i2 = this.f35337h;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & Constants.MAX_HOST_LENGTH);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & Constants.MAX_HOST_LENGTH);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & Constants.MAX_HOST_LENGTH);
                this.f35337h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & Constants.MAX_HOST_LENGTH);
            } catch (IndexOutOfBoundsException e) {
                throw new C15306c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35337h), Integer.valueOf(this.f35336g), 1), e);
            }
        }

        @Override // p001o.mf3
        public final void h0(int i, long j) throws C15306c {
            D0(i, 1);
            i0(j);
        }

        @Override // p001o.mf3
        public final void i0(long j) throws C15306c {
            try {
                byte[] bArr = this.f35334e;
                int i = this.f35337h;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & Constants.MAX_HOST_LENGTH);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & Constants.MAX_HOST_LENGTH);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & Constants.MAX_HOST_LENGTH);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & Constants.MAX_HOST_LENGTH);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & Constants.MAX_HOST_LENGTH);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & Constants.MAX_HOST_LENGTH);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & Constants.MAX_HOST_LENGTH);
                this.f35337h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & Constants.MAX_HOST_LENGTH);
            } catch (IndexOutOfBoundsException e) {
                throw new C15306c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35337h), Integer.valueOf(this.f35336g), 1), e);
            }
        }

        @Override // p001o.mf3
        public final void n0(int i, int i2) throws C15306c {
            D0(i, 0);
            o0(i2);
        }

        @Override // p001o.mf3
        public final void o0(int i) throws C15306c {
            if (i >= 0) {
                F0(i);
            } else {
                H0(i);
            }
        }

        @Override // p001o.mf3
        public final void r0(int i, rcb rcbVar, o5f o5fVar) throws C15306c {
            D0(i, 2);
            F0(((q8) rcbVar).m44943e(o5fVar));
            o5fVar.mo16912i(rcbVar, this.f35332a);
        }

        @Override // p001o.mf3
        public final void s0(int i, rcb rcbVar) throws C15306c {
            D0(1, 3);
            E0(2, i);
            K0(3, rcbVar);
            D0(1, 4);
        }

        @Override // p001o.mf3
        public final void t0(int i, yq1 yq1Var) throws C15306c {
            D0(1, 3);
            E0(2, i);
            a0(3, yq1Var);
            D0(1, 4);
        }
    }

    /* renamed from: o.mf3$c */
    public static class C15306c extends IOException {
        public C15306c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public C15306c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: A */
    public static int m38869A(int i, yq1 yq1Var) {
        return (m38880L(1) * 2) + m38881M(2, i) + m38892f(3, yq1Var);
    }

    /* renamed from: B */
    public static int m38870B(int i, int i2) {
        return m38880L(i) + m38871C(i2);
    }

    /* renamed from: C */
    public static int m38871C(int i) {
        return 4;
    }

    /* renamed from: D */
    public static int m38872D(int i, long j) {
        return m38880L(i) + m38873E(j);
    }

    /* renamed from: E */
    public static int m38873E(long j) {
        return 8;
    }

    /* renamed from: F */
    public static int m38874F(int i, int i2) {
        return m38880L(i) + m38875G(i2);
    }

    /* renamed from: G */
    public static int m38875G(int i) {
        return m38882N(m38885Q(i));
    }

    /* renamed from: H */
    public static int m38876H(int i, long j) {
        return m38880L(i) + m38877I(j);
    }

    /* renamed from: I */
    public static int m38877I(long j) {
        return m38884P(m38886R(j));
    }

    /* renamed from: J */
    public static int m38878J(int i, String str) {
        return m38880L(i) + m38879K(str);
    }

    /* renamed from: K */
    public static int m38879K(String str) {
        int length;
        try {
            length = iqi.m32565g(str);
        } catch (iqi.C14351d unused) {
            length = str.getBytes(xn8.f53956a).length;
        }
        return m38910x(length);
    }

    /* renamed from: L */
    public static int m38880L(int i) {
        return m38882N(ebj.m24743c(i, 0));
    }

    /* renamed from: M */
    public static int m38881M(int i, int i2) {
        return m38880L(i) + m38882N(i2);
    }

    /* renamed from: N */
    public static int m38882N(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: O */
    public static int m38883O(int i, long j) {
        return m38880L(i) + m38884P(j);
    }

    /* renamed from: P */
    public static int m38884P(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: Q */
    public static int m38885Q(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: R */
    public static long m38886R(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: U */
    public static mf3 m38887U(byte[] bArr) {
        return m38888V(bArr, 0, bArr.length);
    }

    /* renamed from: V */
    public static mf3 m38888V(byte[] bArr, int i, int i2) {
        return new C15305b(bArr, i, i2);
    }

    /* renamed from: d */
    public static int m38890d(int i, boolean z) {
        return m38880L(i) + m38891e(z);
    }

    /* renamed from: e */
    public static int m38891e(boolean z) {
        return 1;
    }

    /* renamed from: f */
    public static int m38892f(int i, yq1 yq1Var) {
        return m38880L(i) + m38893g(yq1Var);
    }

    /* renamed from: g */
    public static int m38893g(yq1 yq1Var) {
        return m38910x(yq1Var.size());
    }

    /* renamed from: h */
    public static int m38894h(int i, double d) {
        return m38880L(i) + m38895i(d);
    }

    /* renamed from: i */
    public static int m38895i(double d) {
        return 8;
    }

    /* renamed from: j */
    public static int m38896j(int i, int i2) {
        return m38880L(i) + m38897k(i2);
    }

    /* renamed from: k */
    public static int m38897k(int i) {
        return m38907u(i);
    }

    /* renamed from: l */
    public static int m38898l(int i, int i2) {
        return m38880L(i) + m38899m(i2);
    }

    /* renamed from: m */
    public static int m38899m(int i) {
        return 4;
    }

    /* renamed from: n */
    public static int m38900n(int i, long j) {
        return m38880L(i) + m38901o(j);
    }

    /* renamed from: o */
    public static int m38901o(long j) {
        return 8;
    }

    /* renamed from: p */
    public static int m38902p(int i, float f) {
        return m38880L(i) + m38903q(f);
    }

    /* renamed from: q */
    public static int m38903q(float f) {
        return 4;
    }

    /* renamed from: r */
    public static int m38904r(int i, rcb rcbVar, o5f o5fVar) {
        return (m38880L(i) * 2) + m38905s(rcbVar, o5fVar);
    }

    /* renamed from: s */
    public static int m38905s(rcb rcbVar, o5f o5fVar) {
        return ((q8) rcbVar).m44943e(o5fVar);
    }

    /* renamed from: t */
    public static int m38906t(int i, int i2) {
        return m38880L(i) + m38907u(i2);
    }

    /* renamed from: u */
    public static int m38907u(int i) {
        if (i >= 0) {
            return m38882N(i);
        }
        return 10;
    }

    /* renamed from: v */
    public static int m38908v(int i, long j) {
        return m38880L(i) + m38909w(j);
    }

    /* renamed from: w */
    public static int m38909w(long j) {
        return m38884P(j);
    }

    /* renamed from: x */
    public static int m38910x(int i) {
        return m38882N(i) + i;
    }

    /* renamed from: y */
    public static int m38911y(int i, rcb rcbVar, o5f o5fVar) {
        return m38880L(i) + m38912z(rcbVar, o5fVar);
    }

    /* renamed from: z */
    public static int m38912z(rcb rcbVar, o5f o5fVar) {
        return m38910x(((q8) rcbVar).m44943e(o5fVar));
    }

    public final void A0(int i, long j) {
        G0(i, m38886R(j));
    }

    public final void B0(long j) {
        H0(m38886R(j));
    }

    public abstract void C0(int i, String str);

    public abstract void D0(int i, int i2);

    public abstract void E0(int i, int i2);

    public abstract void F0(int i);

    public abstract void G0(int i, long j);

    public abstract void H0(long j);

    /* renamed from: S */
    public final void m38913S(String str, iqi.C14351d c14351d) throws C15306c {
        f35330c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c14351d);
        byte[] bytes = str.getBytes(xn8.f53956a);
        try {
            F0(bytes.length);
            mo36045a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C15306c(e);
        } catch (C15306c e2) {
            throw e2;
        }
    }

    /* renamed from: T */
    public boolean m38914T() {
        return this.f35333b;
    }

    /* renamed from: W */
    public abstract int mo38915W();

    /* renamed from: X */
    public abstract void mo38916X(byte b);

    /* renamed from: Y */
    public abstract void mo38917Y(int i, boolean z);

    /* renamed from: Z */
    public final void m38918Z(boolean z) {
        mo38916X(z ? (byte) 1 : (byte) 0);
    }

    @Override // p001o.kq1
    /* renamed from: a */
    public abstract void mo36045a(byte[] bArr, int i, int i2);

    public abstract void a0(int i, yq1 yq1Var);

    public final void b0(int i, double d) {
        h0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void m38919c() {
        if (mo38915W() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(double d) {
        i0(Double.doubleToRawLongBits(d));
    }

    public final void d0(int i, int i2) {
        n0(i, i2);
    }

    public final void e0(int i) {
        o0(i);
    }

    public abstract void f0(int i, int i2);

    public abstract void g0(int i);

    public abstract void h0(int i, long j);

    public abstract void i0(long j);

    public final void j0(int i, float f) {
        f0(i, Float.floatToRawIntBits(f));
    }

    public final void k0(float f) {
        g0(Float.floatToRawIntBits(f));
    }

    public final void l0(int i, rcb rcbVar, o5f o5fVar) {
        D0(i, 3);
        m0(rcbVar, o5fVar);
        D0(i, 4);
    }

    public final void m0(rcb rcbVar, o5f o5fVar) {
        o5fVar.mo16912i(rcbVar, this.f35332a);
    }

    public abstract void n0(int i, int i2);

    public abstract void o0(int i);

    public final void p0(int i, long j) {
        G0(i, j);
    }

    public final void q0(long j) {
        H0(j);
    }

    public abstract void r0(int i, rcb rcbVar, o5f o5fVar);

    public abstract void s0(int i, rcb rcbVar);

    public abstract void t0(int i, yq1 yq1Var);

    public final void u0(int i, int i2) {
        f0(i, i2);
    }

    public final void v0(int i) {
        g0(i);
    }

    public final void w0(int i, long j) {
        h0(i, j);
    }

    public final void x0(long j) {
        i0(j);
    }

    public final void y0(int i, int i2) {
        E0(i, m38885Q(i2));
    }

    public final void z0(int i) {
        F0(m38885Q(i));
    }

    public mf3() {
    }
}
