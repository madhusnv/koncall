package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.http.message.TokenParser;
import p001o.b99;

/* loaded from: classes5.dex */
public class edj extends c99 {
    public static final char[] j0 = mh2.m39048e();

    /* renamed from: H */
    public final Writer f21462H;

    /* renamed from: L */
    public char f21463L;

    /* renamed from: M */
    public char[] f21464M;

    /* renamed from: Q */
    public int f21465Q;

    /* renamed from: X */
    public int f21466X;

    /* renamed from: Y */
    public int f21467Y;

    /* renamed from: Z */
    public char[] f21468Z;
    public eff h0;
    public char[] i0;

    public edj(q68 q68Var, int i, i6c i6cVar, Writer writer, char c) {
        super(q68Var, i, i6cVar);
        this.f21462H = writer;
        char[] cArrM44848d = q68Var.m44848d();
        this.f21464M = cArrM44848d;
        this.f21467Y = cArrM44848d.length;
        this.f21463L = c;
        if (c != '\"') {
            this.f17532h = mh2.m39050g(c);
        }
    }

    public void A0() throws IOException {
        int i = this.f21466X;
        int i2 = this.f21465Q;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f21465Q = 0;
            this.f21466X = 0;
            this.f21462H.write(this.f21464M, i2, i3);
        }
    }

    @Override // p001o.b99
    /* renamed from: C */
    public void mo18437C(int i) throws IOException {
        H0("write a number");
        if (this.f15067c) {
            P0(i);
            return;
        }
        if (this.f21466X + 11 >= this.f21467Y) {
            A0();
        }
        this.f21466X = g5c.m28066r(i, this.f21464M, this.f21466X);
    }

    @Override // p001o.b99
    /* renamed from: D */
    public void mo18438D(long j) throws IOException {
        H0("write a number");
        if (this.f15067c) {
            R0(j);
            return;
        }
        if (this.f21466X + 21 >= this.f21467Y) {
            A0();
        }
        this.f21466X = g5c.m28068t(j, this.f21464M, this.f21466X);
    }

    public final int E0(char[] cArr, int i, int i2, char c, int i3) throws IOException {
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = TokenParser.ESCAPE;
                cArr[i5 + 1] = (char) i3;
                return i5;
            }
            char[] cArrZ0 = this.f21468Z;
            if (cArrZ0 == null) {
                cArrZ0 = z0();
            }
            cArrZ0[1] = (char) i3;
            this.f21462H.write(cArrZ0, 0, 2);
            return i;
        }
        if (i3 == -2) {
            eff effVar = this.h0;
            effVar.getClass();
            String value = effVar.getValue();
            this.h0 = null;
            int length = value.length();
            if (i < length || i >= i2) {
                this.f21462H.write(value);
                return i;
            }
            int i6 = i - length;
            value.getChars(0, length, cArr, i6);
            return i6;
        }
        if (i <= 5 || i >= i2) {
            char[] cArrZ02 = this.f21468Z;
            if (cArrZ02 == null) {
                cArrZ02 = z0();
            }
            this.f21465Q = this.f21466X;
            if (c <= 255) {
                char[] cArr2 = j0;
                cArrZ02[6] = cArr2[c >> 4];
                cArrZ02[7] = cArr2[c & 15];
                this.f21462H.write(cArrZ02, 2, 6);
                return i;
            }
            int i7 = (c >> '\b') & Constants.MAX_HOST_LENGTH;
            int i8 = c & 255;
            char[] cArr3 = j0;
            cArrZ02[10] = cArr3[i7 >> 4];
            cArrZ02[11] = cArr3[i7 & 15];
            cArrZ02[12] = cArr3[i8 >> 4];
            cArrZ02[13] = cArr3[i8 & 15];
            this.f21462H.write(cArrZ02, 8, 6);
            return i;
        }
        int i9 = i - 6;
        int i10 = i9 + 1;
        cArr[i9] = TokenParser.ESCAPE;
        int i11 = i10 + 1;
        cArr[i10] = 'u';
        if (c > 255) {
            int i12 = (c >> '\b') & Constants.MAX_HOST_LENGTH;
            int i13 = i11 + 1;
            char[] cArr4 = j0;
            cArr[i11] = cArr4[i12 >> 4];
            i4 = i13 + 1;
            cArr[i13] = cArr4[i12 & 15];
            c = (char) (c & 255);
        } else {
            int i14 = i11 + 1;
            cArr[i11] = '0';
            i4 = i14 + 1;
            cArr[i14] = '0';
        }
        int i15 = i4 + 1;
        char[] cArr5 = j0;
        cArr[i4] = cArr5[c >> 4];
        cArr[i15] = cArr5[c & 15];
        return i15 - 5;
    }

    public final void F0(char c, int i) throws IOException {
        int i2;
        if (i >= 0) {
            int i3 = this.f21466X;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.f21465Q = i4;
                char[] cArr = this.f21464M;
                cArr[i4] = TokenParser.ESCAPE;
                cArr[i4 + 1] = (char) i;
                return;
            }
            char[] cArrZ0 = this.f21468Z;
            if (cArrZ0 == null) {
                cArrZ0 = z0();
            }
            this.f21465Q = this.f21466X;
            cArrZ0[1] = (char) i;
            this.f21462H.write(cArrZ0, 0, 2);
            return;
        }
        if (i == -2) {
            eff effVar = this.h0;
            effVar.getClass();
            String value = effVar.getValue();
            this.h0 = null;
            int length = value.length();
            int i5 = this.f21466X;
            if (i5 < length) {
                this.f21465Q = i5;
                this.f21462H.write(value);
                return;
            } else {
                int i6 = i5 - length;
                this.f21465Q = i6;
                value.getChars(0, length, this.f21464M, i6);
                return;
            }
        }
        int i7 = this.f21466X;
        if (i7 < 6) {
            char[] cArrZ02 = this.f21468Z;
            if (cArrZ02 == null) {
                cArrZ02 = z0();
            }
            this.f21465Q = this.f21466X;
            if (c <= 255) {
                char[] cArr2 = j0;
                cArrZ02[6] = cArr2[c >> 4];
                cArrZ02[7] = cArr2[c & 15];
                this.f21462H.write(cArrZ02, 2, 6);
                return;
            }
            int i8 = (c >> '\b') & Constants.MAX_HOST_LENGTH;
            int i9 = c & 255;
            char[] cArr3 = j0;
            cArrZ02[10] = cArr3[i8 >> 4];
            cArrZ02[11] = cArr3[i8 & 15];
            cArrZ02[12] = cArr3[i9 >> 4];
            cArrZ02[13] = cArr3[i9 & 15];
            this.f21462H.write(cArrZ02, 8, 6);
            return;
        }
        char[] cArr4 = this.f21464M;
        int i10 = i7 - 6;
        this.f21465Q = i10;
        cArr4[i10] = TokenParser.ESCAPE;
        int i11 = i10 + 1;
        cArr4[i11] = 'u';
        if (c > 255) {
            int i12 = (c >> '\b') & Constants.MAX_HOST_LENGTH;
            int i13 = i11 + 1;
            char[] cArr5 = j0;
            cArr4[i13] = cArr5[i12 >> 4];
            i2 = i13 + 1;
            cArr4[i2] = cArr5[i12 & 15];
            c = (char) (c & 255);
        } else {
            int i14 = i11 + 1;
            cArr4[i14] = '0';
            i2 = i14 + 1;
            cArr4[i2] = '0';
        }
        int i15 = i2 + 1;
        char[] cArr6 = j0;
        cArr4[i15] = cArr6[c >> 4];
        cArr4[i15 + 1] = cArr6[c & 15];
    }

    public void G0() {
        char[] cArr = this.f21464M;
        if (cArr != null) {
            this.f21464M = null;
            this.f17531g.m44857m(cArr);
        }
        char[] cArr2 = this.i0;
        if (cArr2 != null) {
            this.i0 = null;
            this.f17531g.m44858n(cArr2);
        }
    }

    @Override // p001o.b99
    /* renamed from: H */
    public void mo18439H(String str) throws IOException {
        H0("write a number");
        if (this.f15067c) {
            S0(str);
        } else {
            mo18443Q(str);
        }
    }

    public final void H0(String str) throws IOException {
        char c;
        int iM26387o = this.f15068d.m26387o();
        if (this.f15796a != null) {
            u0(str, iM26387o);
            return;
        }
        if (iM26387o == 1) {
            c = ',';
        } else {
            if (iM26387o != 2) {
                if (iM26387o != 3) {
                    if (iM26387o != 5) {
                        return;
                    }
                    r0(str);
                    return;
                } else {
                    eff effVar = this.f17534s;
                    if (effVar != null) {
                        mo18443Q(effVar.getValue());
                        return;
                    }
                    return;
                }
            }
            c = ':';
        }
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr = this.f21464M;
        int i = this.f21466X;
        this.f21466X = i + 1;
        cArr[i] = c;
    }

    public final void I0(String str, boolean z) throws IOException {
        if (this.f15796a != null) {
            O0(str, z);
            return;
        }
        if (this.f21466X + 1 >= this.f21467Y) {
            A0();
        }
        if (z) {
            char[] cArr = this.f21464M;
            int i = this.f21466X;
            this.f21466X = i + 1;
            cArr[i] = ',';
        }
        if (this.f17535x) {
            b1(str);
            return;
        }
        char[] cArr2 = this.f21464M;
        int i2 = this.f21466X;
        this.f21466X = i2 + 1;
        cArr2[i2] = this.f21463L;
        b1(str);
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr3 = this.f21464M;
        int i3 = this.f21466X;
        this.f21466X = i3 + 1;
        cArr3[i3] = this.f21463L;
    }

    @Override // p001o.b99
    /* renamed from: J */
    public void mo18440J(BigDecimal bigDecimal) throws IOException {
        H0("write a number");
        if (bigDecimal == null) {
            L0();
        } else if (this.f15067c) {
            S0(f0(bigDecimal));
        } else {
            mo18443Q(f0(bigDecimal));
        }
    }

    @Override // p001o.b99
    /* renamed from: K */
    public void mo18441K(BigInteger bigInteger) throws IOException {
        H0("write a number");
        if (bigInteger == null) {
            L0();
        } else if (this.f15067c) {
            S0(bigInteger.toString());
        } else {
            mo18443Q(bigInteger.toString());
        }
    }

    public final void K0(String str) throws IOException {
        A0();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.f21467Y;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.f21464M, 0);
            int i4 = this.f17533q;
            if (i4 != 0) {
                W0(i2, i4);
            } else {
                V0(i2);
            }
            if (i3 >= length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    public final void L0() throws IOException {
        if (this.f21466X + 4 >= this.f21467Y) {
            A0();
        }
        int i = this.f21466X;
        char[] cArr = this.f21464M;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this.f21466X = i4 + 1;
    }

    @Override // p001o.b99
    /* renamed from: O */
    public void mo18442O(char c) throws IOException {
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr = this.f21464M;
        int i = this.f21466X;
        this.f21466X = i + 1;
        cArr[i] = c;
    }

    public final void O0(String str, boolean z) throws IOException {
        if (z) {
            this.f15796a.mo21179i(this);
        } else {
            this.f15796a.mo21173c(this);
        }
        if (this.f17535x) {
            b1(str);
            return;
        }
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr = this.f21464M;
        int i = this.f21466X;
        this.f21466X = i + 1;
        cArr[i] = this.f21463L;
        b1(str);
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr2 = this.f21464M;
        int i2 = this.f21466X;
        this.f21466X = i2 + 1;
        cArr2[i2] = this.f21463L;
    }

    public final void P0(int i) throws IOException {
        if (this.f21466X + 13 >= this.f21467Y) {
            A0();
        }
        char[] cArr = this.f21464M;
        int i2 = this.f21466X;
        int i3 = i2 + 1;
        this.f21466X = i3;
        cArr[i2] = this.f21463L;
        int iM28066r = g5c.m28066r(i, cArr, i3);
        char[] cArr2 = this.f21464M;
        this.f21466X = iM28066r + 1;
        cArr2[iM28066r] = this.f21463L;
    }

    @Override // p001o.b99
    /* renamed from: Q */
    public void mo18443Q(String str) throws IOException {
        int length = str.length();
        int i = this.f21467Y - this.f21466X;
        if (i == 0) {
            A0();
            i = this.f21467Y - this.f21466X;
        }
        if (i < length) {
            n1(str);
        } else {
            str.getChars(0, length, this.f21464M, this.f21466X);
            this.f21466X += length;
        }
    }

    public final void R0(long j) throws IOException {
        if (this.f21466X + 23 >= this.f21467Y) {
            A0();
        }
        char[] cArr = this.f21464M;
        int i = this.f21466X;
        int i2 = i + 1;
        this.f21466X = i2;
        cArr[i] = this.f21463L;
        int iM28068t = g5c.m28068t(j, cArr, i2);
        char[] cArr2 = this.f21464M;
        this.f21466X = iM28068t + 1;
        cArr2[iM28068t] = this.f21463L;
    }

    @Override // p001o.b99
    /* renamed from: S */
    public void mo18444S(eff effVar) throws IOException {
        int iMo24954a = effVar.mo24954a(this.f21464M, this.f21466X);
        if (iMo24954a < 0) {
            mo18443Q(effVar.getValue());
        } else {
            this.f21466X += iMo24954a;
        }
    }

    public final void S0(String str) throws IOException {
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr = this.f21464M;
        int i = this.f21466X;
        this.f21466X = i + 1;
        cArr[i] = this.f21463L;
        mo18443Q(str);
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr2 = this.f21464M;
        int i2 = this.f21466X;
        this.f21466X = i2 + 1;
        cArr2[i2] = this.f21463L;
    }

    @Override // p001o.b99
    /* renamed from: T */
    public void mo18445T(char[] cArr, int i, int i2) throws IOException {
        if (i2 >= 32) {
            A0();
            this.f21462H.write(cArr, i, i2);
        } else {
            if (i2 > this.f21467Y - this.f21466X) {
                A0();
            }
            System.arraycopy(cArr, i, this.f21464M, this.f21466X, i2);
            this.f21466X += i2;
        }
    }

    public final void V0(int i) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this.f17532h;
        int length = iArr.length;
        int i2 = 0;
        int iE0 = 0;
        while (i2 < i) {
            do {
                cArr = this.f21464M;
                c = cArr[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i2++;
                }
            } while (i2 < i);
            int i3 = i2 - iE0;
            if (i3 > 0) {
                this.f21462H.write(cArr, iE0, i3);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            iE0 = E0(this.f21464M, i2, i, c, iArr[c]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r4
      0x001d: PHI (r4v5 int) = (r4v2 int), (r4v6 int) binds: [B:9:0x0019, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(int i, int i2) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this.f17532h;
        int iMin = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int iE0 = 0;
        int i4 = 0;
        while (i3 < i) {
            while (true) {
                cArr = this.f21464M;
                c = cArr[i3];
                if (c < iMin) {
                    i4 = iArr[c];
                    if (i4 != 0) {
                        break;
                    }
                    i3++;
                    if (i3 >= i) {
                        break;
                    }
                } else if (c > i2) {
                    i4 = -1;
                    break;
                }
            }
            int i5 = i3 - iE0;
            if (i5 > 0) {
                this.f21462H.write(cArr, iE0, i5);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            iE0 = E0(this.f21464M, i3, i, c, i4);
        }
    }

    @Override // p001o.b99
    /* renamed from: X */
    public void mo18446X() throws IOException {
        H0("start an array");
        this.f15068d = this.f15068d.m26383j();
        ugd ugdVar = this.f15796a;
        if (ugdVar != null) {
            ugdVar.mo21178h(this);
            return;
        }
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr = this.f21464M;
        int i = this.f21466X;
        this.f21466X = i + 1;
        cArr[i] = '[';
    }

    @Override // p001o.b99
    /* renamed from: Y */
    public void mo18447Y() throws IOException {
        H0("start an object");
        this.f15068d = this.f15068d.m26384k();
        ugd ugdVar = this.f15796a;
        if (ugdVar != null) {
            ugdVar.mo21175e(this);
            return;
        }
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr = this.f21464M;
        int i = this.f21466X;
        this.f21466X = i + 1;
        cArr[i] = '{';
    }

    public final void b1(String str) throws IOException {
        int length = str.length();
        int i = this.f21467Y;
        if (length > i) {
            K0(str);
            return;
        }
        if (this.f21466X + length > i) {
            A0();
        }
        str.getChars(0, length, this.f21464M, this.f21466X);
        int i2 = this.f17533q;
        if (i2 != 0) {
            j1(length, i2);
        } else {
            d1(length);
        }
    }

    @Override // p001o.ao7, p001o.b99, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f21464M != null && o0(b99.EnumC12329a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                pa9 pa9VarL0 = l0();
                if (!pa9VarL0.m43271d()) {
                    if (!pa9VarL0.m43272e()) {
                        break;
                    } else {
                        mo18454o();
                    }
                } else {
                    mo18453k();
                }
            }
        }
        A0();
        this.f21465Q = 0;
        this.f21466X = 0;
        if (this.f21462H != null) {
            if (this.f17531g.m44856l() || o0(b99.EnumC12329a.AUTO_CLOSE_TARGET)) {
                this.f21462H.close();
            } else if (o0(b99.EnumC12329a.FLUSH_PASSED_TO_STREAM)) {
                this.f21462H.flush();
            }
        }
        G0();
    }

    @Override // p001o.b99
    public void d0(String str) throws IOException {
        H0("write a string");
        if (str == null) {
            L0();
            return;
        }
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr = this.f21464M;
        int i = this.f21466X;
        this.f21466X = i + 1;
        cArr[i] = this.f21463L;
        b1(str);
        if (this.f21466X >= this.f21467Y) {
            A0();
        }
        char[] cArr2 = this.f21464M;
        int i2 = this.f21466X;
        this.f21466X = i2 + 1;
        cArr2[i2] = this.f21463L;
    }

    public final void d1(int i) throws IOException {
        int i2;
        int i3 = this.f21466X + i;
        int[] iArr = this.f17532h;
        int length = iArr.length;
        while (this.f21466X < i3) {
            do {
                char[] cArr = this.f21464M;
                int i4 = this.f21466X;
                char c = cArr[i4];
                if (c >= length || iArr[c] == 0) {
                    i2 = i4 + 1;
                    this.f21466X = i2;
                } else {
                    int i5 = this.f21465Q;
                    int i6 = i4 - i5;
                    if (i6 > 0) {
                        this.f21462H.write(cArr, i5, i6);
                    }
                    char[] cArr2 = this.f21464M;
                    int i7 = this.f21466X;
                    this.f21466X = i7 + 1;
                    char c2 = cArr2[i7];
                    F0(c2, iArr[c2]);
                }
            } while (i2 < i3);
            return;
        }
    }

    @Override // p001o.b99, java.io.Flushable
    public void flush() throws IOException {
        A0();
        if (this.f21462H == null || !o0(b99.EnumC12329a.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.f21462H.flush();
    }

    @Override // p001o.b99
    /* renamed from: h */
    public void mo18452h(boolean z) throws IOException {
        int i;
        H0("write a boolean value");
        if (this.f21466X + 5 >= this.f21467Y) {
            A0();
        }
        int i2 = this.f21466X;
        char[] cArr = this.f21464M;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            int i4 = i3 + 1;
            cArr[i4] = 'u';
            i = i4 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            int i5 = i2 + 1;
            cArr[i5] = 'a';
            int i6 = i5 + 1;
            cArr[i6] = 'l';
            int i7 = i6 + 1;
            cArr[i7] = 's';
            i = i7 + 1;
            cArr[i] = 'e';
        }
        this.f21466X = i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6 = this.f21466X + i;
        int[] iArr = this.f17532h;
        int iMin = Math.min(iArr.length, i2 + 1);
        while (this.f21466X < i6) {
            do {
                char[] cArr = this.f21464M;
                int i7 = this.f21466X;
                char c = cArr[i7];
                if (c < iMin) {
                    i3 = iArr[c];
                    if (i3 != 0) {
                        int i8 = this.f21465Q;
                        i4 = i7 - i8;
                        if (i4 <= 0) {
                            this.f21462H.write(cArr, i8, i4);
                        }
                        this.f21466X++;
                        F0(c, i3);
                    }
                    i5 = i7 + 1;
                    this.f21466X = i5;
                } else {
                    if (c > i2) {
                        i3 = -1;
                        int i82 = this.f21465Q;
                        i4 = i7 - i82;
                        if (i4 <= 0) {
                        }
                        this.f21466X++;
                        F0(c, i3);
                    }
                    i5 = i7 + 1;
                    this.f21466X = i5;
                }
            } while (i5 < i6);
            return;
        }
    }

    @Override // p001o.b99
    /* renamed from: k */
    public void mo18453k() throws IOException {
        if (!this.f15068d.m43271d()) {
            m18448a("Current context not Array but " + this.f15068d.m43274g());
        }
        ugd ugdVar = this.f15796a;
        if (ugdVar != null) {
            ugdVar.mo21176f(this, this.f15068d.m43270c());
        } else {
            if (this.f21466X >= this.f21467Y) {
                A0();
            }
            char[] cArr = this.f21464M;
            int i = this.f21466X;
            this.f21466X = i + 1;
            cArr[i] = ']';
        }
        this.f15068d = this.f15068d.m26382i();
    }

    public final void n1(String str) throws IOException {
        int i = this.f21467Y;
        int i2 = this.f21466X;
        int i3 = i - i2;
        str.getChars(0, i3, this.f21464M, i2);
        this.f21466X += i3;
        A0();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.f21467Y;
            if (length <= i4) {
                str.getChars(i3, i3 + length, this.f21464M, 0);
                this.f21465Q = 0;
                this.f21466X = length;
                return;
            } else {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.f21464M, 0);
                this.f21465Q = 0;
                this.f21466X = i4;
                A0();
                length -= i4;
                i3 = i5;
            }
        }
    }

    @Override // p001o.b99
    /* renamed from: o */
    public void mo18454o() throws IOException {
        if (!this.f15068d.m43272e()) {
            m18448a("Current context not Object but " + this.f15068d.m43274g());
        }
        ugd ugdVar = this.f15796a;
        if (ugdVar != null) {
            ugdVar.mo21172b(this, this.f15068d.m43270c());
        } else {
            if (this.f21466X >= this.f21467Y) {
                A0();
            }
            char[] cArr = this.f21464M;
            int i = this.f21466X;
            this.f21466X = i + 1;
            cArr[i] = '}';
        }
        this.f15068d = this.f15068d.m26382i();
    }

    @Override // p001o.b99
    /* renamed from: r */
    public void mo18455r(String str) throws IOException {
        int iM26386n = this.f15068d.m26386n(str);
        if (iM26386n == 4) {
            m18448a("Can not write a field name, expecting a value");
        }
        I0(str, iM26386n == 1);
    }

    @Override // p001o.b99
    /* renamed from: s */
    public void mo18456s() throws IOException {
        H0("write a null");
        L0();
    }

    @Override // p001o.b99
    /* renamed from: t */
    public void mo18457t(double d) throws IOException {
        if (this.f15067c || (g5c.m28063o(d) && o0(b99.EnumC12329a.QUOTE_NON_NUMERIC_NUMBERS))) {
            d0(String.valueOf(d));
        } else {
            H0("write a number");
            mo18443Q(String.valueOf(d));
        }
    }

    @Override // p001o.b99
    /* renamed from: u */
    public void mo18458u(float f) throws IOException {
        if (this.f15067c || (g5c.m28064p(f) && o0(b99.EnumC12329a.QUOTE_NON_NUMERIC_NUMBERS))) {
            d0(String.valueOf(f));
        } else {
            H0("write a number");
            mo18443Q(String.valueOf(f));
        }
    }

    public final char[] z0() {
        char[] cArr = {TokenParser.ESCAPE, 0, TokenParser.ESCAPE, 'u', '0', '0', 0, 0, TokenParser.ESCAPE, 'u', 0, 0, 0, 0};
        this.f21468Z = cArr;
        return cArr;
    }
}
