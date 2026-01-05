package p001o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import p001o.ca9;

/* loaded from: classes5.dex */
public abstract class kxc extends cyc {

    /* renamed from: H */
    public final q68 f32788H;

    /* renamed from: L */
    public boolean f32789L;

    /* renamed from: M */
    public int f32790M;

    /* renamed from: Q */
    public int f32791Q;

    /* renamed from: X */
    public long f32792X;

    /* renamed from: Y */
    public int f32793Y;

    /* renamed from: Z */
    public int f32794Z;
    public long h0;
    public int i0;
    public int j0;
    public ia9 k0;
    public ya9 l0;
    public final pgh m0;
    public char[] n0;
    public boolean o0;
    public byte[] p0;
    public int q0;
    public int r0;
    public long s0;
    public double t0;
    public BigInteger u0;
    public BigDecimal v0;
    public boolean w0;
    public int x0;
    public int y0;
    public int z0;

    public kxc(q68 q68Var, int i) {
        super(i);
        this.f32793Y = 1;
        this.i0 = 1;
        this.q0 = 0;
        this.f32788H = q68Var;
        this.m0 = q68Var.m44853i();
        this.k0 = ia9.m31788l(ca9.EnumC12600a.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? i16.m31357f(this) : null);
    }

    public static int[] H1(int[] iArr, int i) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    public void B1() {
        int i = this.q0;
        if ((i & 16) != 0) {
            this.t0 = this.v0.doubleValue();
        } else if ((i & 4) != 0) {
            this.t0 = this.u0.doubleValue();
        } else if ((i & 2) != 0) {
            this.t0 = this.s0;
        } else if ((i & 1) != 0) {
            this.t0 = this.r0;
        } else {
            u0();
        }
        this.q0 |= 8;
    }

    public void D1() throws dj8 {
        int i = this.q0;
        if ((i & 2) != 0) {
            long j = this.s0;
            int i2 = (int) j;
            if (i2 != j) {
                G0(mo20614C(), z0());
            }
            this.r0 = i2;
        } else if ((i & 4) != 0) {
            if (cyc.f18835e.compareTo(this.u0) > 0 || cyc.f18836f.compareTo(this.u0) < 0) {
                E0();
            }
            this.r0 = this.u0.intValue();
        } else if ((i & 8) != 0) {
            double d = this.t0;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                E0();
            }
            this.r0 = (int) this.t0;
        } else if ((i & 16) != 0) {
            if (cyc.f18841x.compareTo(this.v0) > 0 || cyc.f18842y.compareTo(this.v0) < 0) {
                E0();
            }
            this.r0 = this.v0.intValue();
        } else {
            u0();
        }
        this.q0 |= 1;
    }

    public void F1() throws dj8 {
        int i = this.q0;
        if ((i & 1) != 0) {
            this.s0 = this.r0;
        } else if ((i & 4) != 0) {
            if (cyc.f18837g.compareTo(this.u0) > 0 || cyc.f18838h.compareTo(this.u0) < 0) {
                H0();
            }
            this.s0 = this.u0.longValue();
        } else if ((i & 8) != 0) {
            double d = this.t0;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                H0();
            }
            this.s0 = (long) this.t0;
        } else if ((i & 16) != 0) {
            if (cyc.f18839q.compareTo(this.v0) > 0 || cyc.f18840s.compareTo(this.v0) < 0) {
                H0();
            }
            this.s0 = this.v0.longValue();
        } else {
            u0();
        }
        this.q0 |= 2;
    }

    public ia9 G1() {
        return this.k0;
    }

    public final ya9 I1(boolean z, int i, int i2, int i3) {
        return (i2 >= 1 || i3 >= 1) ? M1(z, i, i2, i3) : O1(z, i);
    }

    public final ya9 J1(String str, double d) {
        this.m0.m43634v(str);
        this.t0 = d;
        this.q0 = 8;
        return ya9.VALUE_NUMBER_FLOAT;
    }

    public final ya9 M1(boolean z, int i, int i2, int i3) {
        this.w0 = z;
        this.x0 = i;
        this.y0 = i2;
        this.z0 = i3;
        this.q0 = 0;
        return ya9.VALUE_NUMBER_FLOAT;
    }

    public abstract void O0();

    public final ya9 O1(boolean z, int i) {
        this.w0 = z;
        this.x0 = i;
        this.y0 = 0;
        this.z0 = 0;
        this.q0 = 0;
        return ya9.VALUE_NUMBER_INT;
    }

    public final int P0() throws j89 {
        mo22053Q();
        return -1;
    }

    @Override // p001o.cyc
    /* renamed from: Q */
    public void mo22053Q() throws j89 {
        if (this.k0.m43273f()) {
            return;
        }
        k0(String.format(": expected close marker for %s (start marker at %s)", this.k0.m43271d() ? "Array" : "Object", this.k0.m31795o(R0())), null);
    }

    public Object R0() {
        if (ca9.EnumC12600a.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this.f17652a)) {
            return this.f32788H.m44855k();
        }
        return null;
    }

    public char S0(char c) throws ba9 {
        if (m20615D(ca9.EnumC12600a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && m20615D(ca9.EnumC12600a.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        m22056X("Unrecognized character escape " + cyc.m22051O(c));
        return c;
    }

    public int V0() throws dj8, ba9 {
        if (this.f18843b != ya9.VALUE_NUMBER_INT || this.x0 > 9) {
            W0(1);
            if ((this.q0 & 1) == 0) {
                D1();
            }
            return this.r0;
        }
        int iM43620h = this.m0.m43620h(this.w0);
        this.r0 = iM43620h;
        this.q0 = 1;
        return iM43620h;
    }

    public void W0(int i) throws dj8, ba9 {
        ya9 ya9Var = this.f18843b;
        if (ya9Var != ya9.VALUE_NUMBER_INT) {
            if (ya9Var == ya9.VALUE_NUMBER_FLOAT) {
                b1(i);
                return;
            } else {
                m22057Y("Current token (%s) not numeric, can not use numeric value accessors", ya9Var);
                return;
            }
        }
        int i2 = this.x0;
        if (i2 <= 9) {
            this.r0 = this.m0.m43620h(this.w0);
            this.q0 = 1;
            return;
        }
        if (i2 > 18) {
            d1(i);
            return;
        }
        long jM43621i = this.m0.m43621i(this.w0);
        if (i2 == 10) {
            if (this.w0) {
                if (jM43621i >= -2147483648L) {
                    this.r0 = (int) jM43621i;
                    this.q0 = 1;
                    return;
                }
            } else if (jM43621i <= 2147483647L) {
                this.r0 = (int) jM43621i;
                this.q0 = 1;
                return;
            }
        }
        this.s0 = jM43621i;
        this.q0 = 2;
    }

    public final void b1(int i) throws ba9 {
        try {
            if (i == 16) {
                this.v0 = this.m0.m43618f();
                this.q0 = 16;
            } else {
                this.t0 = this.m0.m43619g();
                this.q0 = 8;
            }
        } catch (NumberFormatException e) {
            y0("Malformed numeric value (" + m22055T(this.m0.m43622j()) + ")", e);
        }
    }

    @Override // p001o.ca9
    /* renamed from: c */
    public BigInteger mo20619c() throws dj8, ba9 {
        int i = this.q0;
        if ((i & 4) == 0) {
            if (i == 0) {
                W0(4);
            }
            if ((this.q0 & 4) == 0) {
                z1();
            }
        }
        return this.u0;
    }

    @Override // p001o.ca9, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32789L) {
            return;
        }
        this.f32790M = Math.max(this.f32790M, this.f32791Q);
        this.f32789L = true;
        try {
            O0();
        } finally {
            j1();
        }
    }

    public final void d1(int i) throws dj8, ba9 {
        String strM43622j = this.m0.m43622j();
        try {
            int i2 = this.x0;
            char[] cArrM43629q = this.m0.m43629q();
            int iM43630r = this.m0.m43630r();
            boolean z = this.w0;
            if (z) {
                iM43630r++;
            }
            if (f5c.m26173b(cArrM43629q, iM43630r, i2, z)) {
                this.s0 = Long.parseLong(strM43622j);
                this.q0 = 2;
                return;
            }
            if (i == 1 || i == 2) {
                p1(i, strM43622j);
            }
            if (i != 8 && i != 32) {
                this.u0 = new BigInteger(strM43622j);
                this.q0 = 4;
                return;
            }
            this.t0 = f5c.m26177f(strM43622j);
            this.q0 = 8;
        } catch (NumberFormatException e) {
            y0("Malformed numeric value (" + m22055T(strM43622j) + ")", e);
        }
    }

    @Override // p001o.ca9
    /* renamed from: g */
    public String mo20622g() {
        ia9 ia9VarM31794n;
        ya9 ya9Var = this.f18843b;
        return ((ya9Var == ya9.START_OBJECT || ya9Var == ya9.START_ARRAY) && (ia9VarM31794n = this.k0.m31794n()) != null) ? ia9VarM31794n.mo26380b() : this.k0.mo26380b();
    }

    public void j1() {
        this.m0.m43631s();
        char[] cArr = this.n0;
        if (cArr != null) {
            this.n0 = null;
            this.f32788H.m44858n(cArr);
        }
    }

    @Override // p001o.ca9
    /* renamed from: k */
    public BigDecimal mo20624k() throws dj8, ba9 {
        int i = this.q0;
        if ((i & 16) == 0) {
            if (i == 0) {
                W0(16);
            }
            if ((this.q0 & 16) == 0) {
                x1();
            }
        }
        return this.v0;
    }

    public void n1(int i, char c) {
        ia9 ia9VarG1 = G1();
        m22056X(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), ia9VarG1.m43274g(), ia9VarG1.m31795o(R0())));
    }

    @Override // p001o.ca9
    /* renamed from: o */
    public double mo20625o() throws dj8, ba9 {
        int i = this.q0;
        if ((i & 8) == 0) {
            if (i == 0) {
                W0(8);
            }
            if ((this.q0 & 8) == 0) {
                B1();
            }
        }
        return this.t0;
    }

    public void p1(int i, String str) throws dj8 {
        if (i == 1) {
            F0(str);
        } else {
            I0(str);
        }
    }

    public void q1(int i, String str) {
        if (!m20615D(ca9.EnumC12600a.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            m22056X("Illegal unquoted character (" + cyc.m22051O((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    @Override // p001o.ca9
    /* renamed from: r */
    public float mo20626r() {
        return (float) mo20625o();
    }

    @Override // p001o.ca9
    /* renamed from: s */
    public int mo20627s() throws dj8 {
        int i = this.q0;
        if ((i & 1) == 0) {
            if (i == 0) {
                return V0();
            }
            if ((i & 1) == 0) {
                D1();
            }
        }
        return this.r0;
    }

    @Override // p001o.ca9
    /* renamed from: t */
    public long mo20628t() throws dj8, ba9 {
        int i = this.q0;
        if ((i & 2) == 0) {
            if (i == 0) {
                W0(2);
            }
            if ((this.q0 & 2) == 0) {
                F1();
            }
        }
        return this.s0;
    }

    public String v1() {
        return w1();
    }

    public String w1() {
        return m20615D(ca9.EnumC12600a.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public void x1() {
        int i = this.q0;
        if ((i & 8) != 0) {
            this.v0 = f5c.m26174c(mo20614C());
        } else if ((i & 4) != 0) {
            this.v0 = new BigDecimal(this.u0);
        } else if ((i & 2) != 0) {
            this.v0 = BigDecimal.valueOf(this.s0);
        } else if ((i & 1) != 0) {
            this.v0 = BigDecimal.valueOf(this.r0);
        } else {
            u0();
        }
        this.q0 |= 16;
    }

    public void z1() {
        int i = this.q0;
        if ((i & 16) != 0) {
            this.u0 = this.v0.toBigInteger();
        } else if ((i & 2) != 0) {
            this.u0 = BigInteger.valueOf(this.s0);
        } else if ((i & 1) != 0) {
            this.u0 = BigInteger.valueOf(this.r0);
        } else if ((i & 8) != 0) {
            this.u0 = BigDecimal.valueOf(this.t0).toBigInteger();
        } else {
            u0();
        }
        this.q0 |= 4;
    }
}
