package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import p001o.ca9;

/* loaded from: classes5.dex */
public class p1i extends kxc {
    public static final int K0 = ca9.EnumC12600a.ALLOW_TRAILING_COMMA.getMask();
    public static final int L0 = ca9.EnumC12600a.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int M0 = ca9.EnumC12600a.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    public static final int N0 = ca9.EnumC12600a.ALLOW_MISSING_VALUES.getMask();
    public static final int O0 = ca9.EnumC12600a.ALLOW_SINGLE_QUOTES.getMask();
    public static final int P0 = ca9.EnumC12600a.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int Q0 = ca9.EnumC12600a.ALLOW_COMMENTS.getMask();
    public static final int R0 = ca9.EnumC12600a.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] S0 = mh2.m39054k();
    public static final int[] T0 = mh2.m39052i();
    public final lq1 A0;
    public int[] B0;
    public boolean C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public InputStream H0;
    public byte[] I0;
    public boolean J0;

    public p1i(q68 q68Var, int i, InputStream inputStream, i6c i6cVar, lq1 lq1Var, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(q68Var, i);
        this.B0 = new int[16];
        this.H0 = inputStream;
        this.A0 = lq1Var;
        this.I0 = bArr;
        this.f32790M = i2;
        this.f32791Q = i3;
        this.f32794Z = i2 - i4;
        this.f32792X = (-i2) + i4;
        this.J0 = z;
    }

    public static final int R2(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    public final void A3() throws ba9 {
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr = this.I0;
        int i = this.f32790M;
        int i2 = i + 1;
        this.f32790M = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            p3(b & 255, i2);
        }
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr2 = this.I0;
        int i3 = this.f32790M;
        int i4 = i3 + 1;
        this.f32790M = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            p3(b2 & 255, i4);
        }
    }

    public final boolean B2() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.H0;
        if (inputStream == null || (length = (bArr = this.I0).length) == 0) {
            return false;
        }
        int i = inputStream.read(bArr, 0, length);
        if (i > 0) {
            int i2 = this.f32791Q;
            this.f32792X += i2;
            this.f32794Z -= i2;
            this.E0 -= i2;
            this.f32790M = 0;
            this.f32791Q = i;
            return true;
        }
        O0();
        if (i == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.I0.length + " bytes");
        }
        return false;
    }

    public final void B3(int i) throws ba9 {
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr = this.I0;
        int i2 = this.f32790M;
        int i3 = i2 + 1;
        this.f32790M = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            p3(b & 255, i3);
        }
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr2 = this.I0;
        int i4 = this.f32790M;
        int i5 = i4 + 1;
        this.f32790M = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            p3(b2 & 255, i5);
        }
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr3 = this.I0;
        int i6 = this.f32790M;
        int i7 = i6 + 1;
        this.f32790M = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            p3(b3 & 255, i7);
        }
    }

    @Override // p001o.cyc, p001o.ca9
    /* renamed from: C */
    public String mo20614C() {
        ya9 ya9Var = this.f18843b;
        if (ya9Var != ya9.VALUE_STRING) {
            return s2(ya9Var);
        }
        if (!this.C0) {
            return this.m0.m43622j();
        }
        this.C0 = false;
        return m2();
    }

    public final int C3() throws ba9 {
        while (true) {
            int i = this.f32790M;
            if (i >= this.f32791Q) {
                return D3();
            }
            byte[] bArr = this.I0;
            int i2 = i + 1;
            this.f32790M = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 != 47 && i3 != 35) {
                    return i3;
                }
                this.f32790M = i2 - 1;
                return D3();
            }
            if (i3 != 32) {
                if (i3 == 10) {
                    this.f32793Y++;
                    this.f32794Z = i2;
                } else if (i3 == 13) {
                    t3();
                } else if (i3 != 9) {
                    v0(i3);
                }
            }
        }
    }

    public void D2() throws j89 {
        if (B2()) {
            return;
        }
        j0();
    }

    public final int D3() throws ba9 {
        int i;
        while (true) {
            if (this.f32790M >= this.f32791Q && !B2()) {
                throw m20618a("Unexpected end-of-input within/between " + this.k0.m43274g() + " entries");
            }
            byte[] bArr = this.I0;
            int i2 = this.f32790M;
            int i3 = i2 + 1;
            this.f32790M = i3;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    w3();
                } else if (i != 35 || !G3()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this.f32793Y++;
                    this.f32794Z = i3;
                } else if (i == 13) {
                    t3();
                } else if (i != 9) {
                    v0(i);
                }
            }
        }
        return i;
    }

    public final int E3() throws ba9 {
        if (this.f32790M >= this.f32791Q && !B2()) {
            return P0();
        }
        byte[] bArr = this.I0;
        int i = this.f32790M;
        int i2 = i + 1;
        this.f32790M = i2;
        int i3 = bArr[i] & 255;
        if (i3 > 32) {
            if (i3 != 47 && i3 != 35) {
                return i3;
            }
            this.f32790M = i2 - 1;
            return F3();
        }
        if (i3 != 32) {
            if (i3 == 10) {
                this.f32793Y++;
                this.f32794Z = i2;
            } else if (i3 == 13) {
                t3();
            } else if (i3 != 9) {
                v0(i3);
            }
        }
        while (true) {
            int i4 = this.f32790M;
            if (i4 >= this.f32791Q) {
                return F3();
            }
            byte[] bArr2 = this.I0;
            int i5 = i4 + 1;
            this.f32790M = i5;
            int i6 = bArr2[i4] & 255;
            if (i6 > 32) {
                if (i6 != 47 && i6 != 35) {
                    return i6;
                }
                this.f32790M = i5 - 1;
                return F3();
            }
            if (i6 != 32) {
                if (i6 == 10) {
                    this.f32793Y++;
                    this.f32794Z = i5;
                } else if (i6 == 13) {
                    t3();
                } else if (i6 != 9) {
                    v0(i6);
                }
            }
        }
    }

    public final int F3() throws ba9 {
        int i;
        while (true) {
            if (this.f32790M >= this.f32791Q && !B2()) {
                return P0();
            }
            byte[] bArr = this.I0;
            int i2 = this.f32790M;
            int i3 = i2 + 1;
            this.f32790M = i3;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    w3();
                } else if (i != 35 || !G3()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this.f32793Y++;
                    this.f32794Z = i3;
                } else if (i == 13) {
                    t3();
                } else if (i != 9) {
                    v0(i);
                }
            }
        }
        return i;
    }

    public final void G2() throws ba9 {
        int i;
        int i2 = this.f32790M;
        if (i2 + 4 < this.f32791Q) {
            byte[] bArr = this.I0;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 115) {
                        int i6 = i5 + 1;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this.f32790M = i6;
                            return;
                        }
                    }
                }
            }
        }
        K2("false", 1);
    }

    public final boolean G3() throws ba9 {
        if ((this.f17652a & R0) == 0) {
            return false;
        }
        x3();
        return true;
    }

    @Override // p001o.cyc, p001o.ca9
    /* renamed from: H */
    public ya9 mo20616H() throws ba9 {
        ya9 ya9VarC3;
        ya9 ya9Var = this.f18843b;
        ya9 ya9Var2 = ya9.FIELD_NAME;
        if (ya9Var == ya9Var2) {
            return P2();
        }
        this.q0 = 0;
        if (this.C0) {
            y3();
        }
        int iE3 = E3();
        if (iE3 < 0) {
            close();
            this.f18843b = null;
            return null;
        }
        this.p0 = null;
        if (iE3 == 93) {
            R1();
            ya9 ya9Var3 = ya9.END_ARRAY;
            this.f18843b = ya9Var3;
            return ya9Var3;
        }
        if (iE3 == 125) {
            S1();
            ya9 ya9Var4 = ya9.END_OBJECT;
            this.f18843b = ya9Var4;
            return ya9Var4;
        }
        if (this.k0.m31793m()) {
            if (iE3 != 44) {
                r0(iE3, "was expecting comma to separate " + this.k0.m43274g() + " entries");
            }
            iE3 = C3();
            if ((this.f17652a & K0) != 0 && (iE3 == 93 || iE3 == 125)) {
                return Y1(iE3);
            }
        }
        if (!this.k0.m43272e()) {
            H3();
            return Q2(iE3);
        }
        I3();
        this.k0.m31797q(Z2(iE3));
        this.f18843b = ya9Var2;
        int iU3 = u3();
        H3();
        if (iU3 == 34) {
            this.C0 = true;
            this.l0 = ya9.VALUE_STRING;
            return this.f18843b;
        }
        if (iU3 == 45) {
            ya9VarC3 = c3();
        } else if (iU3 == 46) {
            ya9VarC3 = Y2();
        } else if (iU3 == 91) {
            ya9VarC3 = ya9.START_ARRAY;
        } else if (iU3 == 102) {
            G2();
            ya9VarC3 = ya9.VALUE_FALSE;
        } else if (iU3 == 110) {
            H2();
            ya9VarC3 = ya9.VALUE_NULL;
        } else if (iU3 == 116) {
            O2();
            ya9VarC3 = ya9.VALUE_TRUE;
        } else if (iU3 != 123) {
            switch (iU3) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    ya9VarC3 = g3(iU3);
                    break;
                default:
                    ya9VarC3 = z2(iU3);
                    break;
            }
        } else {
            ya9VarC3 = ya9.START_OBJECT;
        }
        this.l0 = ya9VarC3;
        return this.f18843b;
    }

    public final void H2() throws ba9 {
        int i;
        int i2 = this.f32790M;
        if (i2 + 3 < this.f32791Q) {
            byte[] bArr = this.I0;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.f32790M = i5;
                        return;
                    }
                }
            }
        }
        K2("null", 1);
    }

    public final void H3() {
        this.i0 = this.f32793Y;
        int i = this.f32790M;
        this.h0 = this.f32792X + i;
        this.j0 = i - this.f32794Z;
    }

    public final void I2(String str, int i) throws ba9 {
        int i2;
        int length = str.length();
        if (this.f32790M + length >= this.f32791Q) {
            K2(str, i);
            return;
        }
        do {
            if (this.I0[this.f32790M] != str.charAt(i)) {
                q3(str.substring(0, i));
            }
            i2 = this.f32790M + 1;
            this.f32790M = i2;
            i++;
        } while (i < length);
        int i3 = this.I0[i2] & 255;
        if (i3 < 48 || i3 == 93 || i3 == 125) {
            return;
        }
        P1(str, i, i3);
    }

    public final void I3() {
        this.F0 = this.f32793Y;
        int i = this.f32790M;
        this.E0 = i;
        this.G0 = i - this.f32794Z;
    }

    public final int J3() throws ba9 {
        int i;
        if ((this.f32790M >= this.f32791Q && !B2()) || (i = this.I0[this.f32790M] & 255) < 48 || i > 57) {
            return 48;
        }
        if ((this.f17652a & L0) == 0) {
            A0("Leading zeroes not allowed");
        }
        this.f32790M++;
        if (i == 48) {
            do {
                if (this.f32790M >= this.f32791Q && !B2()) {
                    break;
                }
                byte[] bArr = this.I0;
                int i2 = this.f32790M;
                i = bArr[i2] & 255;
                if (i < 48 || i > 57) {
                    return 48;
                }
                this.f32790M = i2 + 1;
            } while (i == 48);
        }
        return i;
    }

    public final void K2(String str, int i) throws ba9 {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.f32790M >= this.f32791Q && !B2()) || this.I0[this.f32790M] != str.charAt(i)) {
                q3(str.substring(0, i));
            }
            i2 = this.f32790M + 1;
            this.f32790M = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f32791Q || B2()) && (i3 = this.I0[this.f32790M] & 255) >= 48 && i3 != 93 && i3 != 125) {
            P1(str, i, i3);
        }
    }

    public final void K3(int i) throws ba9 {
        int i2 = this.f32790M + 1;
        this.f32790M = i2;
        if (i != 9) {
            if (i == 10) {
                this.f32793Y++;
                this.f32794Z = i2;
            } else if (i == 13) {
                t3();
            } else if (i != 32) {
                o0(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String L3(int[] iArr, int i, int i2) throws ba9 {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            int i8 = i - 1;
            i3 = iArr[i8];
            iArr[i8] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] cArrM43623k = this.m0.m43623k();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int i11 = (iArr[i9 >> 2] >> ((3 - (i9 & 3)) << 3)) & Constants.MAX_HOST_LENGTH;
            i9++;
            if (i11 > 127) {
                if ((i11 & 224) == 192) {
                    i4 = i11 & 31;
                    i5 = 1;
                } else if ((i11 & 240) == 224) {
                    i4 = i11 & 15;
                    i5 = 2;
                } else if ((i11 & 248) == 240) {
                    i4 = i11 & 7;
                    i5 = 3;
                } else {
                    i3(i11);
                    i4 = 1;
                    i5 = 1;
                }
                if (i9 + i5 > i7) {
                    k0(" in field name", ya9.FIELD_NAME);
                }
                int i12 = iArr[i9 >> 2] >> ((3 - (i9 & 3)) << 3);
                i9++;
                if ((i12 & Opcodes.CHECKCAST) != 128) {
                    k3(i12);
                }
                int i13 = (i12 & 63) | (i4 << 6);
                if (i5 > 1) {
                    int i14 = iArr[i9 >> 2] >> ((3 - (i9 & 3)) << 3);
                    i9++;
                    if ((i14 & Opcodes.CHECKCAST) != 128) {
                        k3(i14);
                    }
                    int i15 = (i13 << 6) | (i14 & 63);
                    if (i5 > 2) {
                        int i16 = iArr[i9 >> 2] >> ((3 - (i9 & 3)) << 3);
                        i9++;
                        if ((i16 & Opcodes.CHECKCAST) != 128) {
                            k3(i16 & Constants.MAX_HOST_LENGTH);
                        }
                        i11 = (i15 << 6) | (i16 & 63);
                    } else {
                        i6 = 2;
                        i11 = i15;
                        if (i5 > i6) {
                            int i17 = i11 - 65536;
                            if (i10 >= cArrM43623k.length) {
                                cArrM43623k = this.m0.m43625m();
                            }
                            cArrM43623k[i10] = (char) ((i17 >> 10) + 55296);
                            i11 = (i17 & 1023) | 56320;
                            i10++;
                        }
                    }
                } else {
                    i11 = i13;
                }
                i6 = 2;
                if (i5 > i6) {
                }
            }
            if (i10 >= cArrM43623k.length) {
                cArrM43623k = this.m0.m43625m();
            }
            cArrM43623k[i10] = (char) i11;
            i10++;
        }
        String str = new String(cArrM43623k, 0, i10);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this.A0.m37734w(str, iArr, i);
    }

    public final String M3(int i, int i2) {
        int iR2 = R2(i, i2);
        String strM37705D = this.A0.m37705D(iR2);
        if (strM37705D != null) {
            return strM37705D;
        }
        int[] iArr = this.B0;
        iArr[0] = iR2;
        return L3(iArr, 1, i2);
    }

    public final String N3(int i, int i2, int i3) {
        int iR2 = R2(i2, i3);
        String strM37706E = this.A0.m37706E(i, iR2);
        if (strM37706E != null) {
            return strM37706E;
        }
        int[] iArr = this.B0;
        iArr[0] = i;
        iArr[1] = iR2;
        return L3(iArr, 2, i3);
    }

    @Override // p001o.kxc
    public void O0() throws IOException {
        if (this.H0 != null) {
            if (this.f32788H.m44856l() || m20615D(ca9.EnumC12600a.AUTO_CLOSE_SOURCE)) {
                this.H0.close();
            }
            this.H0 = null;
        }
    }

    public final void O2() throws ba9 {
        int i;
        int i2 = this.f32790M;
        if (i2 + 3 < this.f32791Q) {
            byte[] bArr = this.I0;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i3 + 1;
                if (bArr[i3] == 117) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.f32790M = i5;
                        return;
                    }
                }
            }
        }
        K2("true", 1);
    }

    public final String O3(int i, int i2, int i3, int i4) {
        int iR2 = R2(i3, i4);
        String strM37707F = this.A0.m37707F(i, i2, iR2);
        if (strM37707F != null) {
            return strM37707F;
        }
        int[] iArr = this.B0;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = R2(iR2, i4);
        return L3(iArr, 3, i4);
    }

    public final void P1(String str, int i, int i2) throws ba9 {
        if (Character.isJavaIdentifierPart((char) Z1(i2))) {
            q3(str.substring(0, i));
        }
    }

    public final ya9 P2() {
        this.o0 = false;
        ya9 ya9Var = this.l0;
        this.l0 = null;
        if (ya9Var == ya9.START_ARRAY) {
            this.k0 = this.k0.m31791j(this.i0, this.j0);
        } else if (ya9Var == ya9.START_OBJECT) {
            this.k0 = this.k0.m31792k(this.i0, this.j0);
        }
        this.f18843b = ya9Var;
        return ya9Var;
    }

    public final String P3(int[] iArr, int i, int i2, int i3) {
        if (i >= iArr.length) {
            iArr = kxc.H1(iArr, iArr.length);
            this.B0 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = R2(i2, i3);
        String strM37708G = this.A0.m37708G(iArr, i4);
        return strM37708G == null ? L3(iArr, i4, i3) : strM37708G;
    }

    public final ya9 Q2(int i) throws ba9 {
        if (i == 34) {
            this.C0 = true;
            ya9 ya9Var = ya9.VALUE_STRING;
            this.f18843b = ya9Var;
            return ya9Var;
        }
        if (i == 45) {
            ya9 ya9VarC3 = c3();
            this.f18843b = ya9VarC3;
            return ya9VarC3;
        }
        if (i == 46) {
            ya9 ya9VarY2 = Y2();
            this.f18843b = ya9VarY2;
            return ya9VarY2;
        }
        if (i == 91) {
            this.k0 = this.k0.m31791j(this.i0, this.j0);
            ya9 ya9Var2 = ya9.START_ARRAY;
            this.f18843b = ya9Var2;
            return ya9Var2;
        }
        if (i == 102) {
            G2();
            ya9 ya9Var3 = ya9.VALUE_FALSE;
            this.f18843b = ya9Var3;
            return ya9Var3;
        }
        if (i == 110) {
            H2();
            ya9 ya9Var4 = ya9.VALUE_NULL;
            this.f18843b = ya9Var4;
            return ya9Var4;
        }
        if (i == 116) {
            O2();
            ya9 ya9Var5 = ya9.VALUE_TRUE;
            this.f18843b = ya9Var5;
            return ya9Var5;
        }
        if (i == 123) {
            this.k0 = this.k0.m31792k(this.i0, this.j0);
            ya9 ya9Var6 = ya9.START_OBJECT;
            this.f18843b = ya9Var6;
            return ya9Var6;
        }
        switch (i) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                ya9 ya9VarG3 = g3(i);
                this.f18843b = ya9VarG3;
                return ya9VarG3;
            default:
                ya9 ya9VarZ2 = z2(i);
                this.f18843b = ya9VarZ2;
                return ya9VarZ2;
        }
    }

    public final int Q3() throws j89 {
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr = this.I0;
        int i = this.f32790M;
        this.f32790M = i + 1;
        return bArr[i] & 255;
    }

    public final void R1() {
        H3();
        if (!this.k0.m43271d()) {
            n1(93, '}');
        }
        this.k0 = this.k0.m31790i();
    }

    public final String R3(int[] iArr, int i, int i2, int i3, int i4) throws ba9 {
        int[] iArr2 = T0;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    q1(i3, "name");
                } else {
                    i3 = b2();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = kxc.H1(iArr, iArr.length);
                            this.B0 = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | Opcodes.CHECKCAST;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = kxc.H1(iArr, iArr.length);
                                this.B0 = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = kxc.H1(iArr, iArr.length);
                    this.B0 = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.f32790M >= this.f32791Q && !B2()) {
                k0(" in field name", ya9.FIELD_NAME);
            }
            byte[] bArr = this.I0;
            int i8 = this.f32790M;
            this.f32790M = i8 + 1;
            i3 = bArr[i8] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = kxc.H1(iArr, iArr.length);
                this.B0 = iArr;
            }
            iArr[i] = R2(i2, i4);
            i++;
        }
        String strM37708G = this.A0.m37708G(iArr, i);
        return strM37708G == null ? L3(iArr, i, i4) : strM37708G;
    }

    public final void S1() {
        H3();
        if (!this.k0.m43272e()) {
            n1(Opcodes.LUSHR, ']');
        }
        this.k0 = this.k0.m31790i();
    }

    public String S2() throws ba9 {
        if (this.f32790M >= this.f32791Q && !B2()) {
            k0(": was expecting closing ''' for field name", ya9.FIELD_NAME);
        }
        byte[] bArr = this.I0;
        int i = this.f32790M;
        this.f32790M = i + 1;
        int iB2 = bArr[i] & 255;
        if (iB2 == 39) {
            return "";
        }
        int[] iArrH1 = this.B0;
        int[] iArr = T0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (iB2 != 39) {
            if (iArr[iB2] != 0 && iB2 != 34) {
                if (iB2 != 92) {
                    q1(iB2, "name");
                } else {
                    iB2 = b2();
                }
                if (iB2 > 127) {
                    if (i2 >= 4) {
                        if (i3 >= iArrH1.length) {
                            iArrH1 = kxc.H1(iArrH1, iArrH1.length);
                            this.B0 = iArrH1;
                        }
                        iArrH1[i3] = i4;
                        i4 = 0;
                        i3++;
                        i2 = 0;
                    }
                    if (iB2 < 2048) {
                        i4 = (i4 << 8) | (iB2 >> 6) | Opcodes.CHECKCAST;
                        i2++;
                    } else {
                        int i5 = (i4 << 8) | (iB2 >> 12) | 224;
                        int i6 = i2 + 1;
                        if (i6 >= 4) {
                            if (i3 >= iArrH1.length) {
                                iArrH1 = kxc.H1(iArrH1, iArrH1.length);
                                this.B0 = iArrH1;
                            }
                            iArrH1[i3] = i5;
                            i5 = 0;
                            i3++;
                            i6 = 0;
                        }
                        i4 = (i5 << 8) | ((iB2 >> 6) & 63) | 128;
                        i2 = i6 + 1;
                    }
                    iB2 = (iB2 & 63) | 128;
                }
            }
            if (i2 < 4) {
                i2++;
                i4 = iB2 | (i4 << 8);
            } else {
                if (i3 >= iArrH1.length) {
                    iArrH1 = kxc.H1(iArrH1, iArrH1.length);
                    this.B0 = iArrH1;
                }
                iArrH1[i3] = i4;
                i4 = iB2;
                i3++;
                i2 = 1;
            }
            if (this.f32790M >= this.f32791Q && !B2()) {
                k0(" in field name", ya9.FIELD_NAME);
            }
            byte[] bArr2 = this.I0;
            int i7 = this.f32790M;
            this.f32790M = i7 + 1;
            iB2 = bArr2[i7] & 255;
        }
        if (i2 > 0) {
            if (i3 >= iArrH1.length) {
                int[] iArrH12 = kxc.H1(iArrH1, iArrH1.length);
                this.B0 = iArrH12;
                iArrH1 = iArrH12;
            }
            iArrH1[i3] = R2(i4, i2);
            i3++;
        }
        String strM37708G = this.A0.m37708G(iArrH1, i3);
        return strM37708G == null ? L3(iArrH1, i3, i2) : strM37708G;
    }

    public final String S3(int i, int i2, int i3) {
        int[] iArr = this.B0;
        iArr[0] = this.D0;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this.I0;
        int[] iArr2 = T0;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int i6 = this.f32790M;
            if (i6 + 4 > this.f32791Q) {
                return R3(this.B0, i5, 0, i4, 0);
            }
            int i7 = i6 + 1;
            this.f32790M = i7;
            int i8 = bArr[i6] & 255;
            if (iArr2[i8] != 0) {
                return i8 == 34 ? P3(this.B0, i5, i4, 1) : R3(this.B0, i5, i4, i8, 1);
            }
            int i9 = (i4 << 8) | i8;
            int i10 = i7 + 1;
            this.f32790M = i10;
            int i11 = bArr[i7] & 255;
            if (iArr2[i11] != 0) {
                return i11 == 34 ? P3(this.B0, i5, i9, 2) : R3(this.B0, i5, i9, i11, 2);
            }
            int i12 = (i9 << 8) | i11;
            int i13 = i10 + 1;
            this.f32790M = i13;
            int i14 = bArr[i10] & 255;
            if (iArr2[i14] != 0) {
                return i14 == 34 ? P3(this.B0, i5, i12, 3) : R3(this.B0, i5, i12, i14, 3);
            }
            int i15 = (i12 << 8) | i14;
            this.f32790M = i13 + 1;
            int i16 = bArr[i13] & 255;
            if (iArr2[i16] != 0) {
                return i16 == 34 ? P3(this.B0, i5, i15, 4) : R3(this.B0, i5, i15, i16, 4);
            }
            int[] iArr3 = this.B0;
            if (i5 >= iArr3.length) {
                this.B0 = kxc.H1(iArr3, i5);
            }
            this.B0[i5] = i15;
            i4 = i16;
            i5++;
        }
    }

    public final String T3(int i) {
        byte[] bArr = this.I0;
        int[] iArr = T0;
        int i2 = this.f32790M;
        int i3 = i2 + 1;
        this.f32790M = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            return i4 == 34 ? N3(this.D0, i, 1) : W3(this.D0, i, i4, 1);
        }
        int i5 = (i << 8) | i4;
        int i6 = i3 + 1;
        this.f32790M = i6;
        int i7 = bArr[i3] & 255;
        if (iArr[i7] != 0) {
            return i7 == 34 ? N3(this.D0, i5, 2) : W3(this.D0, i5, i7, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i6 + 1;
        this.f32790M = i9;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            return i10 == 34 ? N3(this.D0, i8, 3) : W3(this.D0, i8, i10, 3);
        }
        int i11 = (i8 << 8) | i10;
        this.f32790M = i9 + 1;
        int i12 = bArr[i9] & 255;
        return iArr[i12] != 0 ? i12 == 34 ? N3(this.D0, i11, 4) : W3(this.D0, i11, i12, 4) : U3(i12, i11);
    }

    public final ya9 U2(char[] cArr, int i, int i2, boolean z, int i3) throws ba9 {
        int i4;
        boolean z2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.m0.m43626n();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this.f32790M >= this.f32791Q && !B2()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.I0;
                int i6 = this.f32790M;
                this.f32790M = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this.m0.m43626n();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0) {
                L0(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.m0.m43626n();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this.f32790M >= this.f32791Q) {
                D2();
            }
            byte[] bArr2 = this.I0;
            int i8 = this.f32790M;
            this.f32790M = i8 + 1;
            int i9 = bArr2[i8] & 255;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.m0.m43626n();
                    i7 = 0;
                }
                int i10 = i7 + 1;
                cArr[i7] = (char) i9;
                if (this.f32790M >= this.f32791Q) {
                    D2();
                }
                byte[] bArr3 = this.I0;
                int i11 = this.f32790M;
                this.f32790M = i11 + 1;
                i9 = bArr3[i11] & 255;
                i7 = i10;
            }
            i2 = i9;
            int i12 = 0;
            while (i2 >= 48 && i2 <= 57) {
                i12++;
                if (i7 >= cArr.length) {
                    cArr = this.m0.m43626n();
                    i7 = 0;
                }
                int i13 = i7 + 1;
                cArr[i7] = (char) i2;
                if (this.f32790M >= this.f32791Q && !B2()) {
                    i5 = i12;
                    z2 = true;
                    i = i13;
                    break;
                }
                byte[] bArr4 = this.I0;
                int i14 = this.f32790M;
                this.f32790M = i14 + 1;
                i2 = bArr4[i14] & 255;
                i7 = i13;
            }
            i5 = i12;
            i = i7;
            if (i5 == 0) {
                L0(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.f32790M--;
            if (this.k0.m43273f()) {
                K3(i2);
            }
        }
        this.m0.m43637y(i);
        return M1(z, i3, i4, i5);
    }

    public final String U3(int i, int i2) {
        byte[] bArr = this.I0;
        int[] iArr = T0;
        int i3 = this.f32790M;
        int i4 = i3 + 1;
        this.f32790M = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            return i5 == 34 ? O3(this.D0, i2, i, 1) : X3(this.D0, i2, i, i5, 1);
        }
        int i6 = (i << 8) | i5;
        int i7 = i4 + 1;
        this.f32790M = i7;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            return i8 == 34 ? O3(this.D0, i2, i6, 2) : X3(this.D0, i2, i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i7 + 1;
        this.f32790M = i10;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            return i11 == 34 ? O3(this.D0, i2, i9, 3) : X3(this.D0, i2, i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        this.f32790M = i10 + 1;
        int i13 = bArr[i10] & 255;
        return iArr[i13] != 0 ? i13 == 34 ? O3(this.D0, i2, i12, 4) : X3(this.D0, i2, i12, i13, 4) : S3(i13, i2, i12);
    }

    public final String V3(int i, int i2, int i3) {
        return R3(this.B0, 0, i, i2, i3);
    }

    public final String W3(int i, int i2, int i3, int i4) {
        int[] iArr = this.B0;
        iArr[0] = i;
        return R3(iArr, 1, i2, i3, i4);
    }

    public final String X3(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.B0;
        iArr[0] = i;
        iArr[1] = i2;
        return R3(iArr, 2, i3, i4, i5);
    }

    public final ya9 Y1(int i) {
        if (i == 125) {
            S1();
            ya9 ya9Var = ya9.END_OBJECT;
            this.f18843b = ya9Var;
            return ya9Var;
        }
        R1();
        ya9 ya9Var2 = ya9.END_ARRAY;
        this.f18843b = ya9Var2;
        return ya9Var2;
    }

    public final ya9 Y2() {
        return !m20615D(ja9.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature()) ? z2(46) : U2(this.m0.m43623k(), 0, 46, false, 0);
    }

    public String Y3() throws j89 {
        if (this.f32790M >= this.f32791Q && !B2()) {
            k0(": was expecting closing '\"' for name", ya9.FIELD_NAME);
        }
        byte[] bArr = this.I0;
        int i = this.f32790M;
        this.f32790M = i + 1;
        int i2 = bArr[i] & 255;
        return i2 == 34 ? "" : R3(this.B0, 0, 0, i2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int Z1(int i) throws ba9 {
        char c;
        int iQ3;
        int i2 = i & Constants.MAX_HOST_LENGTH;
        if (i2 <= 127) {
            return i2;
        }
        if ((i2 & 224) != 192) {
            if ((i2 & 240) == 224) {
                i2 &= 15;
                c = 2;
            } else if ((i2 & 248) == 240) {
                i2 &= 7;
                c = 3;
            } else {
                i3(i2 & Constants.MAX_HOST_LENGTH);
            }
            iQ3 = Q3();
            if ((iQ3 & Opcodes.CHECKCAST) != 128) {
                k3(iQ3 & Constants.MAX_HOST_LENGTH);
            }
            int i3 = (i2 << 6) | (iQ3 & 63);
            if (c > 1) {
                return i3;
            }
            int iQ32 = Q3();
            if ((iQ32 & Opcodes.CHECKCAST) != 128) {
                k3(iQ32 & Constants.MAX_HOST_LENGTH);
            }
            int i4 = (i3 << 6) | (iQ32 & 63);
            if (c <= 2) {
                return i4;
            }
            int iQ33 = Q3();
            if ((iQ33 & Opcodes.CHECKCAST) != 128) {
                k3(iQ33 & Constants.MAX_HOST_LENGTH);
            }
            return (i4 << 6) | (iQ33 & 63);
        }
        i2 &= 31;
        c = 1;
        iQ3 = Q3();
        if ((iQ3 & Opcodes.CHECKCAST) != 128) {
        }
        int i32 = (i2 << 6) | (iQ3 & 63);
        if (c > 1) {
        }
    }

    public final String Z2(int i) {
        if (i != 34) {
            return x2(i);
        }
        int i2 = this.f32790M;
        if (i2 + 13 > this.f32791Q) {
            return Y3();
        }
        byte[] bArr = this.I0;
        int[] iArr = T0;
        int i3 = i2 + 1;
        this.f32790M = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            return i4 == 34 ? "" : V3(0, i4, 0);
        }
        int i5 = i3 + 1;
        this.f32790M = i5;
        int i6 = bArr[i3] & 255;
        if (iArr[i6] != 0) {
            return i6 == 34 ? M3(i4, 1) : V3(i4, i6, 1);
        }
        int i7 = (i4 << 8) | i6;
        int i8 = i5 + 1;
        this.f32790M = i8;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            return i9 == 34 ? M3(i7, 2) : V3(i7, i9, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i8 + 1;
        this.f32790M = i11;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            return i12 == 34 ? M3(i10, 3) : V3(i10, i12, 3);
        }
        int i13 = (i10 << 8) | i12;
        this.f32790M = i11 + 1;
        int i14 = bArr[i11] & 255;
        if (iArr[i14] != 0) {
            return i14 == 34 ? M3(i13, 4) : V3(i13, i14, 4);
        }
        this.D0 = i13;
        return T3(i14);
    }

    public char b2() throws ba9 {
        if (this.f32790M >= this.f32791Q && !B2()) {
            k0(" in character escape sequence", ya9.VALUE_STRING);
        }
        byte[] bArr = this.I0;
        int i = this.f32790M;
        this.f32790M = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return TokenParser.CR;
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            return S0((char) Z1(b));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.f32790M >= this.f32791Q && !B2()) {
                k0(" in character escape sequence", ya9.VALUE_STRING);
            }
            byte[] bArr2 = this.I0;
            int i4 = this.f32790M;
            this.f32790M = i4 + 1;
            byte b2 = bArr2[i4];
            int iM39046c = mh2.m39046c(b2);
            if (iM39046c < 0) {
                r0(b2 & 255, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iM39046c;
        }
        return (char) i2;
    }

    public final int c2(int i) throws ba9 {
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr = this.I0;
        int i2 = this.f32790M;
        int i3 = i2 + 1;
        this.f32790M = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            p3(b & 255, i3);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    public ya9 c3() throws ba9 {
        int i;
        int i2;
        char[] cArrM43623k = this.m0.m43623k();
        cArrM43623k[0] = '-';
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr = this.I0;
        int i3 = this.f32790M;
        this.f32790M = i3 + 1;
        int iJ3 = bArr[i3] & 255;
        if (iJ3 <= 48) {
            if (iJ3 != 48) {
                return w2(iJ3, true);
            }
            iJ3 = J3();
        } else if (iJ3 > 57) {
            return w2(iJ3, true);
        }
        cArrM43623k[1] = (char) iJ3;
        int i4 = 2;
        int iMin = Math.min(this.f32791Q, (this.f32790M + cArrM43623k.length) - 2);
        int i5 = 1;
        while (true) {
            int i6 = this.f32790M;
            if (i6 >= iMin) {
                return d3(cArrM43623k, i4, true, i5);
            }
            byte[] bArr2 = this.I0;
            i = i6 + 1;
            this.f32790M = i;
            i2 = bArr2[i6] & 255;
            if (i2 < 48 || i2 > 57) {
                break;
            }
            i5++;
            cArrM43623k[i4] = (char) i2;
            i4++;
        }
        if (i2 == 46 || i2 == 101 || i2 == 69) {
            return U2(cArrM43623k, i4, i2, true, i5);
        }
        this.f32790M = i - 1;
        this.m0.m43637y(i4);
        if (this.k0.m43273f()) {
            K3(i2);
        }
        return O1(true, i5);
    }

    public final int d2(int i) throws ba9 {
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        int i2 = i & 15;
        byte[] bArr = this.I0;
        int i3 = this.f32790M;
        int i4 = i3 + 1;
        this.f32790M = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            p3(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr2 = this.I0;
        int i6 = this.f32790M;
        int i7 = i6 + 1;
        this.f32790M = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            p3(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    public final ya9 d3(char[] cArr, int i, boolean z, int i2) throws ba9 {
        int i3;
        int i4;
        char[] cArrM43626n = cArr;
        int i5 = i;
        int i6 = i2;
        while (true) {
            if (this.f32790M >= this.f32791Q && !B2()) {
                this.m0.m43637y(i5);
                return O1(z, i6);
            }
            byte[] bArr = this.I0;
            int i7 = this.f32790M;
            i3 = i7 + 1;
            this.f32790M = i3;
            i4 = bArr[i7] & 255;
            if (i4 > 57 || i4 < 48) {
                break;
            }
            if (i5 >= cArrM43626n.length) {
                i5 = 0;
                cArrM43626n = this.m0.m43626n();
            }
            cArrM43626n[i5] = (char) i4;
            i6++;
            i5++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return U2(cArrM43626n, i5, i4, z, i6);
        }
        this.f32790M = i3 - 1;
        this.m0.m43637y(i5);
        if (this.k0.m43273f()) {
            K3(this.I0[this.f32790M] & 255);
        }
        return O1(z, i6);
    }

    public final int e2(int i) throws ba9 {
        int i2 = i & 15;
        byte[] bArr = this.I0;
        int i3 = this.f32790M;
        int i4 = i3 + 1;
        this.f32790M = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            p3(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this.I0;
        int i6 = this.f32790M;
        int i7 = i6 + 1;
        this.f32790M = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            p3(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    @Override // p001o.ca9
    /* renamed from: f */
    public s99 mo20621f() {
        return new s99(R0(), this.f32792X + this.f32790M, -1L, this.f32793Y, (this.f32790M - this.f32794Z) + 1);
    }

    public ya9 g3(int i) throws ba9 {
        int i2;
        int i3;
        char[] cArrM43623k = this.m0.m43623k();
        if (i == 48) {
            i = J3();
        }
        cArrM43623k[0] = (char) i;
        int iMin = Math.min(this.f32791Q, (this.f32790M + cArrM43623k.length) - 1);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            int i6 = this.f32790M;
            if (i6 >= iMin) {
                return d3(cArrM43623k, i4, false, i5);
            }
            byte[] bArr = this.I0;
            i2 = i6 + 1;
            this.f32790M = i2;
            i3 = bArr[i6] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            cArrM43623k[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return U2(cArrM43623k, i4, i3, false, i5);
        }
        this.f32790M = i2 - 1;
        this.m0.m43637y(i4);
        if (this.k0.m43273f()) {
            K3(i3);
        }
        return O1(false, i5);
    }

    public void h3(int i) throws ba9 {
        if (i < 32) {
            v0(i);
        }
        i3(i);
    }

    public void i3(int i) throws ba9 {
        m22056X("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    @Override // p001o.kxc
    public void j1() {
        byte[] bArr;
        byte[] bArr2;
        super.j1();
        this.A0.m37715N();
        if (!this.J0 || (bArr = this.I0) == null || bArr == (bArr2 = cyc.f18833c)) {
            return;
        }
        this.I0 = bArr2;
        this.f32788H.m44859o(bArr);
    }

    public final int k2(int i) throws ba9 {
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr = this.I0;
        int i2 = this.f32790M;
        int i3 = i2 + 1;
        this.f32790M = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            p3(b & 255, i3);
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr2 = this.I0;
        int i5 = this.f32790M;
        int i6 = i5 + 1;
        this.f32790M = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            p3(b2 & 255, i6);
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr3 = this.I0;
        int i8 = this.f32790M;
        int i9 = i8 + 1;
        this.f32790M = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) != 128) {
            p3(b3 & 255, i9);
        }
        return ((i7 << 6) | (b3 & 63)) - 65536;
    }

    public void k3(int i) throws ba9 {
        m22056X("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    public String m2() throws ba9 {
        int i = this.f32790M;
        if (i >= this.f32791Q) {
            D2();
            i = this.f32790M;
        }
        char[] cArrM43623k = this.m0.m43623k();
        int[] iArr = S0;
        int iMin = Math.min(this.f32791Q, cArrM43623k.length + i);
        byte[] bArr = this.I0;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                cArrM43623k[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.f32790M = i + 1;
                return this.m0.m43636x(i2);
            }
        }
        this.f32790M = i;
        o2(cArrM43623k, i2);
        return this.m0.m43622j();
    }

    public final void o2(char[] cArr, int i) throws ba9 {
        int[] iArr = S0;
        byte[] bArr = this.I0;
        while (true) {
            int i2 = this.f32790M;
            if (i2 >= this.f32791Q) {
                D2();
                i2 = this.f32790M;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this.m0.m43626n();
                i = 0;
            }
            int iMin = Math.min(this.f32791Q, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= iMin) {
                    this.f32790M = i2;
                    break;
                }
                int i4 = i2 + 1;
                int iB2 = bArr[i2] & 255;
                int i5 = iArr[iB2];
                if (i5 != 0) {
                    this.f32790M = i4;
                    if (iB2 == 34) {
                        this.m0.m43637y(i);
                        return;
                    }
                    if (i5 == 1) {
                        iB2 = b2();
                    } else if (i5 == 2) {
                        iB2 = c2(iB2);
                    } else if (i5 == 3) {
                        iB2 = this.f32791Q - i4 >= 2 ? e2(iB2) : d2(iB2);
                    } else if (i5 == 4) {
                        int iK2 = k2(iB2);
                        int i6 = i + 1;
                        cArr[i] = (char) ((iK2 >> 10) | 55296);
                        if (i6 >= cArr.length) {
                            cArr = this.m0.m43626n();
                            i = 0;
                        } else {
                            i = i6;
                        }
                        iB2 = (iK2 & 1023) | 56320;
                    } else if (iB2 < 32) {
                        q1(iB2, "string value");
                    } else {
                        h3(iB2);
                    }
                    if (i >= cArr.length) {
                        cArr = this.m0.m43626n();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) iB2;
                } else {
                    cArr[i] = (char) iB2;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    public void p3(int i, int i2) throws ba9 {
        this.f32790M = i2;
        k3(i);
    }

    public void q3(String str) throws ba9 {
        r3(str, v1());
    }

    public void r3(String str, String str2) throws ba9 {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f32790M >= this.f32791Q && !B2()) {
                break;
            }
            byte[] bArr = this.I0;
            int i = this.f32790M;
            this.f32790M = i + 1;
            char cZ1 = (char) Z1(bArr[i]);
            if (!Character.isJavaIdentifierPart(cZ1)) {
                break;
            }
            sb.append(cZ1);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        d0("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    public final String s2(ya9 ya9Var) {
        if (ya9Var == null) {
            return null;
        }
        int iId = ya9Var.id();
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this.m0.m43622j() : ya9Var.asString() : this.k0.mo26380b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        k0(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s3() throws ba9 {
        int[] iArrM39051h = mh2.m39051h();
        while (true) {
            if (this.f32790M >= this.f32791Q && !B2()) {
                break;
            }
            byte[] bArr = this.I0;
            int i = this.f32790M;
            int i2 = i + 1;
            this.f32790M = i2;
            int i3 = bArr[i] & 255;
            int i4 = iArrM39051h[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    z3();
                } else if (i4 == 3) {
                    A3();
                } else if (i4 == 4) {
                    B3(i3);
                } else if (i4 == 10) {
                    this.f32793Y++;
                    this.f32794Z = i2;
                } else if (i4 == 13) {
                    t3();
                } else if (i4 == 42) {
                    if (i2 >= this.f32791Q && !B2()) {
                        break;
                    }
                    byte[] bArr2 = this.I0;
                    int i5 = this.f32790M;
                    if (bArr2[i5] == 47) {
                        this.f32790M = i5 + 1;
                        return;
                    }
                } else {
                    h3(i3);
                }
            }
        }
    }

    public final void t3() {
        if (this.f32790M < this.f32791Q || B2()) {
            byte[] bArr = this.I0;
            int i = this.f32790M;
            if (bArr[i] == 10) {
                this.f32790M = i + 1;
            }
        }
        this.f32793Y++;
        this.f32794Z = this.f32790M;
    }

    public final int u3() {
        int i = this.f32790M;
        if (i + 4 >= this.f32791Q) {
            return v3(false);
        }
        byte[] bArr = this.I0;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this.f32790M = i2;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 == 47 || b2 == 35) {
                    return v3(true);
                }
                this.f32790M = i2 + 1;
                return b2;
            }
            if (b2 == 32 || b2 == 9) {
                int i3 = i2 + 1;
                this.f32790M = i3;
                byte b3 = bArr[i3];
                if (b3 > 32) {
                    if (b3 == 47 || b3 == 35) {
                        return v3(true);
                    }
                    this.f32790M = i3 + 1;
                    return b3;
                }
            }
            return v3(true);
        }
        if (b == 32 || b == 9) {
            int i4 = i + 1;
            this.f32790M = i4;
            b = bArr[i4];
        }
        if (b != 58) {
            return v3(false);
        }
        int i5 = this.f32790M + 1;
        this.f32790M = i5;
        byte b4 = bArr[i5];
        if (b4 > 32) {
            if (b4 == 47 || b4 == 35) {
                return v3(true);
            }
            this.f32790M = i5 + 1;
            return b4;
        }
        if (b4 == 32 || b4 == 9) {
            int i6 = i5 + 1;
            this.f32790M = i6;
            byte b5 = bArr[i6];
            if (b5 > 32) {
                if (b5 == 47 || b5 == 35) {
                    return v3(true);
                }
                this.f32790M = i6 + 1;
                return b5;
            }
        }
        return v3(true);
    }

    public ya9 v2() throws ba9 {
        int i;
        int iB2;
        char[] cArrM43623k = this.m0.m43623k();
        int[] iArr = S0;
        byte[] bArr = this.I0;
        int i2 = 0;
        while (true) {
            if (this.f32790M >= this.f32791Q) {
                D2();
            }
            if (i2 >= cArrM43623k.length) {
                cArrM43623k = this.m0.m43626n();
                i2 = 0;
            }
            int i3 = this.f32791Q;
            int length = this.f32790M + (cArrM43623k.length - i2);
            if (length < i3) {
                i3 = length;
            }
            while (true) {
                int i4 = this.f32790M;
                if (i4 < i3) {
                    i = i4 + 1;
                    this.f32790M = i;
                    iB2 = bArr[i4] & 255;
                    if (iB2 == 39 || iArr[iB2] != 0) {
                        break;
                    }
                    cArrM43623k[i2] = (char) iB2;
                    i2++;
                }
            }
            if (iB2 == 39) {
                this.m0.m43637y(i2);
                return ya9.VALUE_STRING;
            }
            int i5 = iArr[iB2];
            if (i5 == 1) {
                iB2 = b2();
            } else if (i5 == 2) {
                iB2 = c2(iB2);
            } else if (i5 == 3) {
                iB2 = this.f32791Q - i >= 2 ? e2(iB2) : d2(iB2);
            } else if (i5 != 4) {
                if (iB2 < 32) {
                    q1(iB2, "string value");
                }
                h3(iB2);
            } else {
                int iK2 = k2(iB2);
                int i6 = i2 + 1;
                cArrM43623k[i2] = (char) ((iK2 >> 10) | 55296);
                if (i6 >= cArrM43623k.length) {
                    cArrM43623k = this.m0.m43626n();
                    i2 = 0;
                } else {
                    i2 = i6;
                }
                iB2 = 56320 | (iK2 & 1023);
            }
            if (i2 >= cArrM43623k.length) {
                cArrM43623k = this.m0.m43626n();
                i2 = 0;
            }
            cArrM43623k[i2] = (char) iB2;
            i2++;
        }
    }

    public final int v3(boolean z) throws ba9 {
        while (true) {
            if (this.f32790M >= this.f32791Q && !B2()) {
                k0(" within/between " + this.k0.m43274g() + " entries", null);
                return -1;
            }
            byte[] bArr = this.I0;
            int i = this.f32790M;
            int i2 = i + 1;
            this.f32790M = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    w3();
                } else if (i3 != 35 || !G3()) {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        r0(i3, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this.f32793Y++;
                    this.f32794Z = i2;
                } else if (i3 == 13) {
                    t3();
                } else if (i3 != 9) {
                    v0(i3);
                }
            }
        }
    }

    public ya9 w2(int i, boolean z) throws ba9 {
        String str;
        while (i == 73) {
            if (this.f32790M >= this.f32791Q && !B2()) {
                l0(ya9.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this.I0;
            int i2 = this.f32790M;
            this.f32790M = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            I2(str, 3);
            if ((this.f17652a & M0) != 0) {
                return J1(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            m22057Y("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        L0(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    public final void w3() throws ba9 {
        if ((this.f17652a & Q0) == 0) {
            r0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f32790M >= this.f32791Q && !B2()) {
            k0(" in a comment", null);
        }
        byte[] bArr = this.I0;
        int i = this.f32790M;
        this.f32790M = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            x3();
        } else if (i2 == 42) {
            s3();
        } else {
            r0(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    public String x2(int i) throws ba9 {
        if (i == 39 && (this.f17652a & O0) != 0) {
            return S2();
        }
        if ((this.f17652a & P0) == 0) {
            r0((char) Z1(i), "was expecting double-quote to start field name");
        }
        int[] iArrM39055l = mh2.m39055l();
        if (iArrM39055l[i] != 0) {
            r0(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrH1 = this.B0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArrH1.length) {
                    iArrH1 = kxc.H1(iArrH1, iArrH1.length);
                    this.B0 = iArrH1;
                }
                iArrH1[i3] = i4;
                i4 = i;
                i3++;
                i2 = 1;
            }
            if (this.f32790M >= this.f32791Q && !B2()) {
                k0(" in field name", ya9.FIELD_NAME);
            }
            byte[] bArr = this.I0;
            int i5 = this.f32790M;
            i = bArr[i5] & 255;
            if (iArrM39055l[i] != 0) {
                break;
            }
            this.f32790M = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArrH1.length) {
                int[] iArrH12 = kxc.H1(iArrH1, iArrH1.length);
                this.B0 = iArrH12;
                iArrH1 = iArrH12;
            }
            iArrH1[i3] = i4;
            i3++;
        }
        String strM37708G = this.A0.m37708G(iArrH1, i3);
        return strM37708G == null ? L3(iArrH1, i3, i2) : strM37708G;
    }

    public final void x3() throws ba9 {
        int[] iArrM39051h = mh2.m39051h();
        while (true) {
            if (this.f32790M >= this.f32791Q && !B2()) {
                return;
            }
            byte[] bArr = this.I0;
            int i = this.f32790M;
            int i2 = i + 1;
            this.f32790M = i2;
            int i3 = bArr[i] & 255;
            int i4 = iArrM39051h[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    z3();
                } else if (i4 == 3) {
                    A3();
                } else if (i4 == 4) {
                    B3(i3);
                } else if (i4 == 10) {
                    this.f32793Y++;
                    this.f32794Z = i2;
                    return;
                } else if (i4 == 13) {
                    t3();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    h3(i3);
                }
            }
        }
    }

    public void y3() throws ba9 {
        this.C0 = false;
        int[] iArr = S0;
        byte[] bArr = this.I0;
        while (true) {
            int i = this.f32790M;
            int i2 = this.f32791Q;
            if (i >= i2) {
                D2();
                i = this.f32790M;
                i2 = this.f32791Q;
            }
            while (true) {
                if (i >= i2) {
                    this.f32790M = i;
                    break;
                }
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                int i5 = iArr[i4];
                if (i5 != 0) {
                    this.f32790M = i3;
                    if (i4 == 34) {
                        return;
                    }
                    if (i5 == 1) {
                        b2();
                    } else if (i5 == 2) {
                        z3();
                    } else if (i5 == 3) {
                        A3();
                    } else if (i5 == 4) {
                        B3(i4);
                    } else if (i4 < 32) {
                        q1(i4, "string value");
                    } else {
                        h3(i4);
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3.k0.m43271d() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r3.k0.m43273f() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if ((r3.f17652a & p001o.p1i.N0) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r3.f32790M--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        return p001o.ya9.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ya9 z2(int i) throws ba9 {
        if (i == 39) {
            if ((this.f17652a & O0) != 0) {
                return v2();
            }
        } else if (i == 73) {
            I2("Infinity", 1);
            if ((this.f17652a & M0) != 0) {
                return J1("Infinity", Double.POSITIVE_INFINITY);
            }
            m22056X("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        } else if (i != 78) {
            if (i != 93) {
                if (i != 125) {
                    if (i == 43) {
                        if (this.f32790M >= this.f32791Q && !B2()) {
                            l0(ya9.VALUE_NUMBER_INT);
                        }
                        byte[] bArr = this.I0;
                        int i2 = this.f32790M;
                        this.f32790M = i2 + 1;
                        return w2(bArr[i2] & 255, false);
                    }
                }
            }
            r0(i, "expected a value");
            if ((this.f17652a & O0) != 0) {
            }
        } else {
            I2("NaN", 1);
            if ((this.f17652a & M0) != 0) {
                return J1("NaN", Double.NaN);
            }
            m22056X("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        if (Character.isJavaIdentifierStart(i)) {
            r3("" + ((char) i), v1());
        }
        r0(i, "expected a valid value " + w1());
        return null;
    }

    public final void z3() throws ba9 {
        if (this.f32790M >= this.f32791Q) {
            D2();
        }
        byte[] bArr = this.I0;
        int i = this.f32790M;
        int i2 = i + 1;
        this.f32790M = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            p3(b & 255, i2);
        }
    }
}
