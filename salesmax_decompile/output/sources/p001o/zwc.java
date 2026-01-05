package p001o;

import java.nio.charset.Charset;
import java.util.Arrays;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public final class zwc {

    /* renamed from: d */
    public static final char[] f57819d = {TokenParser.CR, '\n'};

    /* renamed from: e */
    public static final char[] f57820e = {'\n'};

    /* renamed from: f */
    public static final pf8 f57821f = pf8.m43575I(uh2.f48929a, uh2.f48931c, uh2.f48934f, uh2.f48932d, uh2.f48933e);

    /* renamed from: a */
    public byte[] f57822a;

    /* renamed from: b */
    public int f57823b;

    /* renamed from: c */
    public int f57824c;

    public zwc() {
        this.f57822a = sqi.f45795f;
    }

    /* renamed from: A */
    public long m59997A() {
        byte[] bArr = this.f57822a;
        long j = (bArr[r1] & 255) << 56;
        int i = this.f57823b + 1 + 1 + 1;
        long j2 = j | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j3 = j2 | ((bArr[i] & 255) << 32);
        long j4 = j3 | ((bArr[r3] & 255) << 24);
        long j5 = j4 | ((bArr[r4] & 255) << 16);
        long j6 = j5 | ((bArr[r3] & 255) << 8);
        this.f57823b = i + 1 + 1 + 1 + 1 + 1;
        return j6 | (bArr[r4] & 255);
    }

    /* renamed from: B */
    public String m59998B() {
        return m60033n((char) 0);
    }

    /* renamed from: C */
    public String m59999C(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f57823b;
        int i3 = (i2 + i) - 1;
        String strM48704I = sqi.m48704I(this.f57822a, i2, (i3 >= this.f57824c || this.f57822a[i3] != 0) ? i : i - 1);
        this.f57823b += i;
        return strM48704I;
    }

    /* renamed from: D */
    public short m60000D() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.f57823b = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* renamed from: E */
    public String m60001E(int i) {
        return m60002F(i, uh2.f48931c);
    }

    /* renamed from: F */
    public String m60002F(int i, Charset charset) {
        String str = new String(this.f57822a, this.f57823b, i, charset);
        this.f57823b += i;
        return str;
    }

    /* renamed from: G */
    public int m60003G() {
        return (m60004H() << 21) | (m60004H() << 14) | (m60004H() << 7) | m60004H();
    }

    /* renamed from: H */
    public int m60004H() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        this.f57823b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: I */
    public int m60005I() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        int i2 = i + 1;
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f57823b = i2 + 1 + 2;
        return i3;
    }

    /* renamed from: J */
    public long m60006J() {
        byte[] bArr = this.f57822a;
        long j = (bArr[r1] & 255) << 24;
        int i = this.f57823b + 1 + 1 + 1;
        long j2 = j | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f57823b = i + 1;
        return j2 | (bArr[i] & 255);
    }

    /* renamed from: K */
    public int m60007K() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f57823b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: L */
    public int m60008L() {
        int iM60036q = m60036q();
        if (iM60036q >= 0) {
            return iM60036q;
        }
        throw new IllegalStateException("Top bit not zero: " + iM60036q);
    }

    /* renamed from: M */
    public long m60009M() {
        long jM59997A = m59997A();
        if (jM59997A >= 0) {
            return jM59997A;
        }
        throw new IllegalStateException("Top bit not zero: " + jM59997A);
    }

    /* renamed from: N */
    public int m60010N() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.f57823b = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    /* renamed from: O */
    public long m60011O() {
        int i;
        int i2;
        long j = this.f57822a[this.f57823b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.f57822a[this.f57823b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f57823b += i2;
        return j;
    }

    /* renamed from: P */
    public Charset m60012P() {
        if (m60020a() >= 3) {
            byte[] bArr = this.f57822a;
            int i = this.f57823b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f57823b = i + 3;
                return uh2.f48931c;
            }
        }
        if (m60020a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f57822a;
        int i2 = this.f57823b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f57823b = i2 + 2;
            return uh2.f48932d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f57823b = i2 + 2;
        return uh2.f48933e;
    }

    /* renamed from: Q */
    public void m60013Q(int i) {
        m60015S(m60021b() < i ? new byte[i] : this.f57822a, i);
    }

    /* renamed from: R */
    public void m60014R(byte[] bArr) {
        m60015S(bArr, bArr.length);
    }

    /* renamed from: S */
    public void m60015S(byte[] bArr, int i) {
        this.f57822a = bArr;
        this.f57824c = i;
        this.f57823b = 0;
    }

    /* renamed from: T */
    public void m60016T(int i) {
        op0.m42511a(i >= 0 && i <= this.f57822a.length);
        this.f57824c = i;
    }

    /* renamed from: U */
    public void m60017U(int i) {
        op0.m42511a(i >= 0 && i <= this.f57824c);
        this.f57823b = i;
    }

    /* renamed from: V */
    public void m60018V(int i) {
        m60017U(this.f57823b + i);
    }

    /* renamed from: W */
    public final void m60019W(Charset charset) {
        if (m60032m(charset, f57819d) == '\r') {
            m60032m(charset, f57820e);
        }
    }

    /* renamed from: a */
    public int m60020a() {
        return this.f57824c - this.f57823b;
    }

    /* renamed from: b */
    public int m60021b() {
        return this.f57822a.length;
    }

    /* renamed from: c */
    public void m60022c(int i) {
        if (i > m60021b()) {
            this.f57822a = Arrays.copyOf(this.f57822a, i);
        }
    }

    /* renamed from: d */
    public final int m60023d(Charset charset) {
        int i;
        if (charset.equals(uh2.f48931c) || charset.equals(uh2.f48929a)) {
            i = 1;
        } else {
            if (!charset.equals(uh2.f48934f) && !charset.equals(uh2.f48933e) && !charset.equals(uh2.f48932d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f57823b;
        while (true) {
            int i3 = this.f57824c;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((charset.equals(uh2.f48931c) || charset.equals(uh2.f48929a)) && sqi.H0(this.f57822a[i2])) {
                return i2;
            }
            if (charset.equals(uh2.f48934f) || charset.equals(uh2.f48932d)) {
                byte[] bArr = this.f57822a;
                if (bArr[i2] == 0 && sqi.H0(bArr[i2 + 1])) {
                    return i2;
                }
            }
            if (charset.equals(uh2.f48933e)) {
                byte[] bArr2 = this.f57822a;
                if (bArr2[i2 + 1] == 0 && sqi.H0(bArr2[i2])) {
                    return i2;
                }
            }
            i2 += i;
        }
    }

    /* renamed from: e */
    public byte[] m60024e() {
        return this.f57822a;
    }

    /* renamed from: f */
    public int m60025f() {
        return this.f57823b;
    }

    /* renamed from: g */
    public int m60026g() {
        return this.f57824c;
    }

    /* renamed from: h */
    public char m60027h(Charset charset) {
        op0.m42512b(f57821f.contains(charset), "Unsupported charset: " + charset);
        return (char) (m60028i(charset) >> 16);
    }

    /* renamed from: i */
    public final int m60028i(Charset charset) {
        byte bM42235a;
        char cM42237c;
        int i = 1;
        if ((charset.equals(uh2.f48931c) || charset.equals(uh2.f48929a)) && m60020a() >= 1) {
            bM42235a = (byte) oh2.m42235a(b5i.m18175b(this.f57822a[this.f57823b]));
        } else {
            if ((charset.equals(uh2.f48934f) || charset.equals(uh2.f48932d)) && m60020a() >= 2) {
                byte[] bArr = this.f57822a;
                int i2 = this.f57823b;
                cM42237c = oh2.m42237c(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(uh2.f48933e) || m60020a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f57822a;
                int i3 = this.f57823b;
                cM42237c = oh2.m42237c(bArr2[i3 + 1], bArr2[i3]);
            }
            bM42235a = (byte) cM42237c;
            i = 2;
        }
        return (oh2.m42235a(bM42235a) << 16) + i;
    }

    /* renamed from: j */
    public int m60029j() {
        return this.f57822a[this.f57823b] & 255;
    }

    /* renamed from: k */
    public void m60030k(ywc ywcVar, int i) {
        m60031l(ywcVar.f56210a, 0, i);
        ywcVar.m58452p(0);
    }

    /* renamed from: l */
    public void m60031l(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f57822a, this.f57823b, bArr, i, i2);
        this.f57823b += i2;
    }

    /* renamed from: m */
    public final char m60032m(Charset charset, char[] cArr) {
        int iM60028i = m60028i(charset);
        if (iM60028i == 0) {
            return (char) 0;
        }
        char c = (char) (iM60028i >> 16);
        if (!oh2.m42236b(cArr, c)) {
            return (char) 0;
        }
        this.f57823b += iM60028i & 65535;
        return c;
    }

    /* renamed from: n */
    public String m60033n(char c) {
        if (m60020a() == 0) {
            return null;
        }
        int i = this.f57823b;
        while (i < this.f57824c && this.f57822a[i] != c) {
            i++;
        }
        byte[] bArr = this.f57822a;
        int i2 = this.f57823b;
        String strM48704I = sqi.m48704I(bArr, i2, i - i2);
        this.f57823b = i;
        if (i < this.f57824c) {
            this.f57823b = i + 1;
        }
        return strM48704I;
    }

    /* renamed from: o */
    public double m60034o() {
        return Double.longBitsToDouble(m59997A());
    }

    /* renamed from: p */
    public float m60035p() {
        return Float.intBitsToFloat(m60036q());
    }

    /* renamed from: q */
    public int m60036q() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f57823b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    /* renamed from: r */
    public int m60037r() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f57823b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: s */
    public String m60038s() {
        return m60039t(uh2.f48931c);
    }

    /* renamed from: t */
    public String m60039t(Charset charset) {
        op0.m42512b(f57821f.contains(charset), "Unsupported charset: " + charset);
        if (m60020a() == 0) {
            return null;
        }
        if (!charset.equals(uh2.f48929a)) {
            m60012P();
        }
        String strM60002F = m60002F(m60023d(charset) - this.f57823b, charset);
        if (this.f57823b == this.f57824c) {
            return strM60002F;
        }
        m60019W(charset);
        return strM60002F;
    }

    /* renamed from: u */
    public int m60040u() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.f57823b = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    /* renamed from: v */
    public long m60041v() {
        byte[] bArr = this.f57822a;
        long j = bArr[r1] & 255;
        int i = this.f57823b + 1 + 1 + 1;
        long j2 = j | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j3 = j2 | ((bArr[i] & 255) << 24);
        long j4 = j3 | ((bArr[r3] & 255) << 32);
        long j5 = j4 | ((bArr[r4] & 255) << 40);
        long j6 = j5 | ((bArr[r3] & 255) << 48);
        this.f57823b = i + 1 + 1 + 1 + 1 + 1;
        return j6 | ((bArr[r4] & 255) << 56);
    }

    /* renamed from: w */
    public short m60042w() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.f57823b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* renamed from: x */
    public long m60043x() {
        byte[] bArr = this.f57822a;
        long j = bArr[r1] & 255;
        int i = this.f57823b + 1 + 1 + 1;
        long j2 = j | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f57823b = i + 1;
        return j2 | ((bArr[i] & 255) << 24);
    }

    /* renamed from: y */
    public int m60044y() {
        int iM60040u = m60040u();
        if (iM60040u >= 0) {
            return iM60040u;
        }
        throw new IllegalStateException("Top bit not zero: " + iM60040u);
    }

    /* renamed from: z */
    public int m60045z() {
        byte[] bArr = this.f57822a;
        int i = this.f57823b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.f57823b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public zwc(int i) {
        this.f57822a = new byte[i];
        this.f57824c = i;
    }

    public zwc(byte[] bArr) {
        this.f57822a = bArr;
        this.f57824c = bArr.length;
    }

    public zwc(byte[] bArr, int i) {
        this.f57822a = bArr;
        this.f57824c = i;
    }
}
