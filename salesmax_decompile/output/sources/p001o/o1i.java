package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.objectweb.asm.Opcodes;
import p001o.b99;

/* loaded from: classes5.dex */
public class o1i extends c99 {
    public static final byte[] j0 = mh2.m39047d();
    public static final byte[] k0 = {110, 117, 108, 108};
    public static final byte[] l0 = {116, 114, 117, 101};
    public static final byte[] m0 = {102, 97, 108, 115, 101};

    /* renamed from: H */
    public final OutputStream f37535H;

    /* renamed from: L */
    public byte f37536L;

    /* renamed from: M */
    public byte[] f37537M;

    /* renamed from: Q */
    public int f37538Q;

    /* renamed from: X */
    public final int f37539X;

    /* renamed from: Y */
    public final int f37540Y;

    /* renamed from: Z */
    public char[] f37541Z;
    public final int h0;
    public boolean i0;

    public o1i(q68 q68Var, int i, i6c i6cVar, OutputStream outputStream, char c) {
        super(q68Var, i, i6cVar);
        this.f37535H = outputStream;
        this.f37536L = (byte) c;
        if (c != '\"') {
            this.f17532h = mh2.m39050g(c);
        }
        this.i0 = true;
        byte[] bArrM44852h = q68Var.m44852h();
        this.f37537M = bArrM44852h;
        int length = bArrM44852h.length;
        this.f37539X = length;
        this.f37540Y = length >> 3;
        char[] cArrM44848d = q68Var.m44848d();
        this.f37541Z = cArrM44848d;
        this.h0 = cArrM44848d.length;
        if (o0(b99.EnumC12329a.ESCAPE_NON_ASCII)) {
            v0(Opcodes.LAND);
        }
    }

    public final int A0(int i, int i2) {
        byte[] bArr = this.f37537M;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i5;
        }
        int i6 = i2 + 1;
        bArr[i2] = 92;
        int i7 = i6 + 1;
        bArr[i6] = 117;
        int i8 = i7 + 1;
        byte[] bArr2 = j0;
        bArr[i7] = bArr2[(i >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i & 15];
        return i11;
    }

    @Override // p001o.b99
    /* renamed from: C */
    public void mo18437C(int i) throws IOException {
        H0("write a number");
        if (this.f37538Q + 11 >= this.f37539X) {
            z0();
        }
        if (this.f15067c) {
            P0(i);
        } else {
            this.f37538Q = g5c.m28065q(i, this.f37537M, this.f37538Q);
        }
    }

    @Override // p001o.b99
    /* renamed from: D */
    public void mo18438D(long j) throws IOException {
        H0("write a number");
        if (this.f15067c) {
            R0(j);
            return;
        }
        if (this.f37538Q + 21 >= this.f37539X) {
            z0();
        }
        this.f37538Q = g5c.m28067s(j, this.f37537M, this.f37538Q);
    }

    public final int E0(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i >= 55296 && i <= 57343) {
            if (i2 >= i3 || cArr == null) {
                m18448a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i)));
            }
            F0(i, cArr[i2]);
            return i2 + 1;
        }
        byte[] bArr = this.f37537M;
        int i4 = this.f37538Q;
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >> 12) | 224);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((i >> 6) & 63) | 128);
        this.f37538Q = i6 + 1;
        bArr[i6] = (byte) ((i & 63) | 128);
        return i2;
    }

    public final void F0(int i, int i2) throws IOException {
        int iK0 = k0(i, i2);
        if (this.f37538Q + 4 > this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        int i3 = this.f37538Q;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((iK0 >> 18) | 240);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (((iK0 >> 12) & 63) | 128);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((iK0 >> 6) & 63) | 128);
        this.f37538Q = i6 + 1;
        bArr[i6] = (byte) ((iK0 & 63) | 128);
    }

    public void G0() {
        byte[] bArr = this.f37537M;
        if (bArr != null && this.i0) {
            this.f37537M = null;
            this.f17531g.m44861q(bArr);
        }
        char[] cArr = this.f37541Z;
        if (cArr != null) {
            this.f37541Z = null;
            this.f17531g.m44857m(cArr);
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
        byte b;
        int iM26387o = this.f15068d.m26387o();
        if (this.f15796a != null) {
            u0(str, iM26387o);
            return;
        }
        if (iM26387o == 1) {
            b = 44;
        } else {
            if (iM26387o != 2) {
                if (iM26387o != 3) {
                    if (iM26387o != 5) {
                        return;
                    }
                    r0(str);
                    return;
                }
                eff effVar = this.f17534s;
                if (effVar != null) {
                    byte[] bArrMo24956c = effVar.mo24956c();
                    if (bArrMo24956c.length > 0) {
                        I0(bArrMo24956c);
                        return;
                    }
                    return;
                }
                return;
            }
            b = 58;
        }
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        int i = this.f37538Q;
        this.f37538Q = i + 1;
        bArr[i] = b;
    }

    public final void I0(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f37538Q + length > this.f37539X) {
            z0();
            if (length > 512) {
                this.f37535H.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f37537M, this.f37538Q, length);
        this.f37538Q += length;
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

    public final int K0(int i, int i2) {
        int i3;
        byte[] bArr = this.f37537M;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = j0;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= Constants.MAX_HOST_LENGTH;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = j0;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    public final void L0() throws IOException {
        if (this.f37538Q + 4 >= this.f37539X) {
            z0();
        }
        System.arraycopy(k0, 0, this.f37537M, this.f37538Q, 4);
        this.f37538Q += 4;
    }

    @Override // p001o.b99
    /* renamed from: O */
    public void mo18442O(char c) throws IOException {
        if (this.f37538Q + 3 >= this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        if (c <= 127) {
            int i = this.f37538Q;
            this.f37538Q = i + 1;
            bArr[i] = (byte) c;
        } else {
            if (c >= 2048) {
                E0(c, null, 0, 0);
                return;
            }
            int i2 = this.f37538Q;
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((c >> 6) | Opcodes.CHECKCAST);
            this.f37538Q = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        }
    }

    public final void O0(String str) throws IOException {
        int iM26386n = this.f15068d.m26386n(str);
        if (iM26386n == 4) {
            m18448a("Can not write a field name, expecting a value");
        }
        if (iM26386n == 1) {
            this.f15796a.mo21179i(this);
        } else {
            this.f15796a.mo21173c(this);
        }
        if (this.f17535x) {
            w1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.h0) {
            w1(str, true);
            return;
        }
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        int i = this.f37538Q;
        this.f37538Q = i + 1;
        bArr[i] = this.f37536L;
        str.getChars(0, length, this.f37541Z, 0);
        if (length <= this.f37540Y) {
            if (this.f37538Q + length > this.f37539X) {
                z0();
            }
            d1(this.f37541Z, 0, length);
        } else {
            x1(this.f37541Z, 0, length);
        }
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr2 = this.f37537M;
        int i2 = this.f37538Q;
        this.f37538Q = i2 + 1;
        bArr2[i2] = this.f37536L;
    }

    public final void P0(int i) throws IOException {
        if (this.f37538Q + 13 >= this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        int i2 = this.f37538Q;
        int i3 = i2 + 1;
        this.f37538Q = i3;
        bArr[i2] = this.f37536L;
        int iM28065q = g5c.m28065q(i, bArr, i3);
        byte[] bArr2 = this.f37537M;
        this.f37538Q = iM28065q + 1;
        bArr2[iM28065q] = this.f37536L;
    }

    @Override // p001o.b99
    /* renamed from: Q */
    public void mo18443Q(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.f37541Z;
        if (length > cArr.length) {
            z1(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            mo18445T(cArr, 0, length);
        }
    }

    public final void R0(long j) throws IOException {
        if (this.f37538Q + 23 >= this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        int i = this.f37538Q;
        int i2 = i + 1;
        this.f37538Q = i2;
        bArr[i] = this.f37536L;
        int iM28067s = g5c.m28067s(j, bArr, i2);
        byte[] bArr2 = this.f37537M;
        this.f37538Q = iM28067s + 1;
        bArr2[iM28067s] = this.f37536L;
    }

    @Override // p001o.b99
    /* renamed from: S */
    public void mo18444S(eff effVar) throws IOException {
        int iMo24955b = effVar.mo24955b(this.f37537M, this.f37538Q);
        if (iMo24955b < 0) {
            I0(effVar.mo24956c());
        } else {
            this.f37538Q += iMo24955b;
        }
    }

    public final void S0(String str) throws IOException {
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        int i = this.f37538Q;
        this.f37538Q = i + 1;
        bArr[i] = this.f37536L;
        mo18443Q(str);
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr2 = this.f37537M;
        int i2 = this.f37538Q;
        this.f37538Q = i2 + 1;
        bArr2[i2] = this.f37536L;
    }

    @Override // p001o.b99
    /* renamed from: T */
    public final void mo18445T(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i2 + i2;
        int i4 = this.f37538Q + i3;
        int i5 = this.f37539X;
        if (i4 > i5) {
            if (i5 < i3) {
                W0(cArr, i, i2);
                return;
            }
            z0();
        }
        int i6 = i2 + i;
        while (i < i6) {
            do {
                char c = cArr[i];
                if (c > 127) {
                    i++;
                    if (c < 2048) {
                        byte[] bArr = this.f37537M;
                        int i7 = this.f37538Q;
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) ((c >> 6) | Opcodes.CHECKCAST);
                        this.f37538Q = i8 + 1;
                        bArr[i8] = (byte) ((c & '?') | 128);
                    } else {
                        i = E0(c, cArr, i, i6);
                    }
                } else {
                    byte[] bArr2 = this.f37537M;
                    int i9 = this.f37538Q;
                    this.f37538Q = i9 + 1;
                    bArr2[i9] = (byte) c;
                    i++;
                }
            } while (i < i6);
            return;
        }
    }

    public final void V0(char[] cArr, int i, int i2) throws IOException {
        while (i < i2) {
            do {
                char c = cArr[i];
                if (c > 127) {
                    i++;
                    if (c < 2048) {
                        byte[] bArr = this.f37537M;
                        int i3 = this.f37538Q;
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) ((c >> 6) | Opcodes.CHECKCAST);
                        this.f37538Q = i4 + 1;
                        bArr[i4] = (byte) ((c & '?') | 128);
                    } else {
                        i = E0(c, cArr, i, i2);
                    }
                } else {
                    byte[] bArr2 = this.f37537M;
                    int i5 = this.f37538Q;
                    this.f37538Q = i5 + 1;
                    bArr2[i5] = (byte) c;
                    i++;
                }
            } while (i < i2);
            return;
        }
    }

    public final void W0(char[] cArr, int i, int i2) throws IOException {
        int i3 = this.f37539X;
        byte[] bArr = this.f37537M;
        int i4 = i2 + i;
        while (i < i4) {
            do {
                char c = cArr[i];
                if (c >= 128) {
                    if (this.f37538Q + 3 >= this.f37539X) {
                        z0();
                    }
                    int i5 = i + 1;
                    char c2 = cArr[i];
                    if (c2 < 2048) {
                        int i6 = this.f37538Q;
                        int i7 = i6 + 1;
                        bArr[i6] = (byte) ((c2 >> 6) | Opcodes.CHECKCAST);
                        this.f37538Q = i7 + 1;
                        bArr[i7] = (byte) ((c2 & '?') | 128);
                        i = i5;
                    } else {
                        i = E0(c2, cArr, i5, i4);
                    }
                } else {
                    if (this.f37538Q >= i3) {
                        z0();
                    }
                    int i8 = this.f37538Q;
                    this.f37538Q = i8 + 1;
                    bArr[i8] = (byte) c;
                    i++;
                }
            } while (i < i4);
            return;
        }
    }

    @Override // p001o.b99
    /* renamed from: X */
    public final void mo18446X() throws IOException {
        H0("start an array");
        this.f15068d = this.f15068d.m26383j();
        ugd ugdVar = this.f15796a;
        if (ugdVar != null) {
            ugdVar.mo21178h(this);
            return;
        }
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        int i = this.f37538Q;
        this.f37538Q = i + 1;
        bArr[i] = 91;
    }

    @Override // p001o.b99
    /* renamed from: Y */
    public final void mo18447Y() throws IOException {
        H0("start an object");
        this.f15068d = this.f15068d.m26384k();
        ugd ugdVar = this.f15796a;
        if (ugdVar != null) {
            ugdVar.mo21175e(this);
            return;
        }
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        int i = this.f37538Q;
        this.f37538Q = i + 1;
        bArr[i] = 123;
    }

    public final void b1(String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.f37538Q;
        byte[] bArr = this.f37537M;
        int[] iArr = this.f17532h;
        while (i < i3) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i4] = (byte) cCharAt;
            i++;
            i4++;
        }
        this.f37538Q = i4;
        if (i < i3) {
            if (this.f17533q == 0) {
                j1(str, i, i3);
            } else {
                p1(str, i, i3);
            }
        }
    }

    @Override // p001o.ao7, p001o.b99, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f37537M != null && o0(b99.EnumC12329a.AUTO_CLOSE_JSON_CONTENT)) {
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
        z0();
        this.f37538Q = 0;
        if (this.f37535H != null) {
            if (this.f17531g.m44856l() || o0(b99.EnumC12329a.AUTO_CLOSE_TARGET)) {
                this.f37535H.close();
            } else if (o0(b99.EnumC12329a.FLUSH_PASSED_TO_STREAM)) {
                this.f37535H.flush();
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
        int length = str.length();
        if (length > this.f37540Y) {
            w1(str, true);
            return;
        }
        if (this.f37538Q + length >= this.f37539X) {
            z0();
        }
        byte[] bArr = this.f37537M;
        int i = this.f37538Q;
        this.f37538Q = i + 1;
        bArr[i] = this.f37536L;
        b1(str, 0, length);
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr2 = this.f37537M;
        int i2 = this.f37538Q;
        this.f37538Q = i2 + 1;
        bArr2[i2] = this.f37536L;
    }

    public final void d1(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.f37538Q;
        byte[] bArr = this.f37537M;
        int[] iArr = this.f17532h;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.f37538Q = i4;
        if (i < i3) {
            if (this.f17533q == 0) {
                n1(cArr, i, i3);
            } else {
                q1(cArr, i, i3);
            }
        }
    }

    @Override // p001o.b99, java.io.Flushable
    public void flush() throws IOException {
        z0();
        if (this.f37535H == null || !o0(b99.EnumC12329a.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.f37535H.flush();
    }

    @Override // p001o.b99
    /* renamed from: h */
    public void mo18452h(boolean z) throws IOException {
        H0("write a boolean value");
        if (this.f37538Q + 5 >= this.f37539X) {
            z0();
        }
        byte[] bArr = z ? l0 : m0;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f37537M, this.f37538Q, length);
        this.f37538Q += length;
    }

    public final void j1(String str, int i, int i2) throws IOException {
        if (this.f37538Q + ((i2 - i) * 6) > this.f37539X) {
            z0();
        }
        int iA0 = this.f37538Q;
        byte[] bArr = this.f37537M;
        int[] iArr = this.f17532h;
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i4 = iArr[cCharAt];
                if (i4 == 0) {
                    bArr[iA0] = (byte) cCharAt;
                    i = i3;
                    iA0++;
                } else if (i4 > 0) {
                    int i5 = iA0 + 1;
                    bArr[iA0] = 92;
                    iA0 = i5 + 1;
                    bArr[i5] = (byte) i4;
                } else {
                    iA0 = K0(cCharAt, iA0);
                }
            } else if (cCharAt <= 2047) {
                int i6 = iA0 + 1;
                bArr[iA0] = (byte) ((cCharAt >> 6) | Opcodes.CHECKCAST);
                iA0 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt & '?') | 128);
            } else {
                iA0 = A0(cCharAt, iA0);
            }
            i = i3;
        }
        this.f37538Q = iA0;
    }

    @Override // p001o.b99
    /* renamed from: k */
    public final void mo18453k() throws IOException {
        if (!this.f15068d.m43271d()) {
            m18448a("Current context not Array but " + this.f15068d.m43274g());
        }
        ugd ugdVar = this.f15796a;
        if (ugdVar != null) {
            ugdVar.mo21176f(this, this.f15068d.m43270c());
        } else {
            if (this.f37538Q >= this.f37539X) {
                z0();
            }
            byte[] bArr = this.f37537M;
            int i = this.f37538Q;
            this.f37538Q = i + 1;
            bArr[i] = 93;
        }
        this.f15068d = this.f15068d.m26382i();
    }

    public final void n1(char[] cArr, int i, int i2) throws IOException {
        if (this.f37538Q + ((i2 - i) * 6) > this.f37539X) {
            z0();
        }
        int iA0 = this.f37538Q;
        byte[] bArr = this.f37537M;
        int[] iArr = this.f17532h;
        while (i < i2) {
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i4 = iArr[c];
                if (i4 == 0) {
                    bArr[iA0] = (byte) c;
                    i = i3;
                    iA0++;
                } else if (i4 > 0) {
                    int i5 = iA0 + 1;
                    bArr[iA0] = 92;
                    iA0 = i5 + 1;
                    bArr[i5] = (byte) i4;
                } else {
                    iA0 = K0(c, iA0);
                }
            } else if (c <= 2047) {
                int i6 = iA0 + 1;
                bArr[iA0] = (byte) ((c >> 6) | Opcodes.CHECKCAST);
                iA0 = i6 + 1;
                bArr[i6] = (byte) ((c & '?') | 128);
            } else {
                iA0 = A0(c, iA0);
            }
            i = i3;
        }
        this.f37538Q = iA0;
    }

    @Override // p001o.b99
    /* renamed from: o */
    public final void mo18454o() throws IOException {
        if (!this.f15068d.m43272e()) {
            m18448a("Current context not Object but " + this.f15068d.m43274g());
        }
        ugd ugdVar = this.f15796a;
        if (ugdVar != null) {
            ugdVar.mo21172b(this, this.f15068d.m43270c());
        } else {
            if (this.f37538Q >= this.f37539X) {
                z0();
            }
            byte[] bArr = this.f37537M;
            int i = this.f37538Q;
            this.f37538Q = i + 1;
            bArr[i] = 125;
        }
        this.f15068d = this.f15068d.m26382i();
    }

    public final void p1(String str, int i, int i2) throws IOException {
        if (this.f37538Q + ((i2 - i) * 6) > this.f37539X) {
            z0();
        }
        int iA0 = this.f37538Q;
        byte[] bArr = this.f37537M;
        int[] iArr = this.f17532h;
        int i3 = this.f17533q;
        while (i < i2) {
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i5 = iArr[cCharAt];
                if (i5 == 0) {
                    bArr[iA0] = (byte) cCharAt;
                    i = i4;
                    iA0++;
                } else if (i5 > 0) {
                    int i6 = iA0 + 1;
                    bArr[iA0] = 92;
                    iA0 = i6 + 1;
                    bArr[i6] = (byte) i5;
                } else {
                    iA0 = K0(cCharAt, iA0);
                }
            } else if (cCharAt > i3) {
                iA0 = K0(cCharAt, iA0);
            } else if (cCharAt <= 2047) {
                int i7 = iA0 + 1;
                bArr[iA0] = (byte) ((cCharAt >> 6) | Opcodes.CHECKCAST);
                iA0 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt & '?') | 128);
            } else {
                iA0 = A0(cCharAt, iA0);
            }
            i = i4;
        }
        this.f37538Q = iA0;
    }

    public final void q1(char[] cArr, int i, int i2) throws IOException {
        if (this.f37538Q + ((i2 - i) * 6) > this.f37539X) {
            z0();
        }
        int iA0 = this.f37538Q;
        byte[] bArr = this.f37537M;
        int[] iArr = this.f17532h;
        int i3 = this.f17533q;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i5 = iArr[c];
                if (i5 == 0) {
                    bArr[iA0] = (byte) c;
                    i = i4;
                    iA0++;
                } else if (i5 > 0) {
                    int i6 = iA0 + 1;
                    bArr[iA0] = 92;
                    iA0 = i6 + 1;
                    bArr[i6] = (byte) i5;
                } else {
                    iA0 = K0(c, iA0);
                }
            } else if (c > i3) {
                iA0 = K0(c, iA0);
            } else if (c <= 2047) {
                int i7 = iA0 + 1;
                bArr[iA0] = (byte) ((c >> 6) | Opcodes.CHECKCAST);
                iA0 = i7 + 1;
                bArr[i7] = (byte) ((c & '?') | 128);
            } else {
                iA0 = A0(c, iA0);
            }
            i = i4;
        }
        this.f37538Q = iA0;
    }

    @Override // p001o.b99
    /* renamed from: r */
    public void mo18455r(String str) throws IOException {
        if (this.f15796a != null) {
            O0(str);
            return;
        }
        int iM26386n = this.f15068d.m26386n(str);
        if (iM26386n == 4) {
            m18448a("Can not write a field name, expecting a value");
        }
        if (iM26386n == 1) {
            if (this.f37538Q >= this.f37539X) {
                z0();
            }
            byte[] bArr = this.f37537M;
            int i = this.f37538Q;
            this.f37538Q = i + 1;
            bArr[i] = 44;
        }
        if (this.f17535x) {
            w1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.h0) {
            w1(str, true);
            return;
        }
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr2 = this.f37537M;
        int i2 = this.f37538Q;
        int i3 = i2 + 1;
        this.f37538Q = i3;
        bArr2[i2] = this.f37536L;
        if (length <= this.f37540Y) {
            if (i3 + length > this.f37539X) {
                z0();
            }
            b1(str, 0, length);
        } else {
            v1(str, 0, length);
        }
        if (this.f37538Q >= this.f37539X) {
            z0();
        }
        byte[] bArr3 = this.f37537M;
        int i4 = this.f37538Q;
        this.f37538Q = i4 + 1;
        bArr3[i4] = this.f37536L;
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
        if (this.f15067c || (g5c.m28063o(d) && b99.EnumC12329a.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f15066b))) {
            d0(String.valueOf(d));
        } else {
            H0("write a number");
            mo18443Q(String.valueOf(d));
        }
    }

    @Override // p001o.b99
    /* renamed from: u */
    public void mo18458u(float f) throws IOException {
        if (this.f15067c || (g5c.m28064p(f) && b99.EnumC12329a.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f15066b))) {
            d0(String.valueOf(f));
        } else {
            H0("write a number");
            mo18443Q(String.valueOf(f));
        }
    }

    public final void v1(String str, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.f37540Y, i2);
            if (this.f37538Q + iMin > this.f37539X) {
                z0();
            }
            b1(str, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final void w1(String str, boolean z) throws IOException {
        if (z) {
            if (this.f37538Q >= this.f37539X) {
                z0();
            }
            byte[] bArr = this.f37537M;
            int i = this.f37538Q;
            this.f37538Q = i + 1;
            bArr[i] = this.f37536L;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int iMin = Math.min(this.f37540Y, length);
            if (this.f37538Q + iMin > this.f37539X) {
                z0();
            }
            b1(str, i2, iMin);
            i2 += iMin;
            length -= iMin;
        }
        if (z) {
            if (this.f37538Q >= this.f37539X) {
                z0();
            }
            byte[] bArr2 = this.f37537M;
            int i3 = this.f37538Q;
            this.f37538Q = i3 + 1;
            bArr2[i3] = this.f37536L;
        }
    }

    public final void x1(char[] cArr, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.f37540Y, i2);
            if (this.f37538Q + iMin > this.f37539X) {
                z0();
            }
            d1(cArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final void z0() throws IOException {
        int i = this.f37538Q;
        if (i > 0) {
            this.f37538Q = 0;
            this.f37535H.write(this.f37537M, 0, i);
        }
    }

    public void z1(String str, int i, int i2) throws IOException {
        char c;
        char[] cArr = this.f37541Z;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            mo18445T(cArr, 0, i2);
            return;
        }
        int i3 = this.f37539X;
        int iMin = Math.min(length, (i3 >> 2) + (i3 >> 4));
        int i4 = iMin * 3;
        while (i2 > 0) {
            int iMin2 = Math.min(iMin, i2);
            str.getChars(i, i + iMin2, cArr, 0);
            if (this.f37538Q + i4 > this.f37539X) {
                z0();
            }
            if (iMin2 > 1 && (c = cArr[iMin2 - 1]) >= 55296 && c <= 56319) {
                iMin2--;
            }
            V0(cArr, 0, iMin2);
            i += iMin2;
            i2 -= iMin2;
        }
    }
}
