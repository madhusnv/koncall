package p001o;

import java.io.IOException;
import java.io.Reader;
import org.apache.http.message.TokenParser;
import p001o.ca9;

/* loaded from: classes5.dex */
public class oce extends kxc {
    public static final int J0 = ca9.EnumC12600a.ALLOW_TRAILING_COMMA.getMask();
    public static final int K0 = ca9.EnumC12600a.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int L0 = ca9.EnumC12600a.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    public static final int M0 = ca9.EnumC12600a.ALLOW_MISSING_VALUES.getMask();
    public static final int N0 = ca9.EnumC12600a.ALLOW_SINGLE_QUOTES.getMask();
    public static final int O0 = ca9.EnumC12600a.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int P0 = ca9.EnumC12600a.ALLOW_COMMENTS.getMask();
    public static final int Q0 = ca9.EnumC12600a.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] R0 = mh2.m39052i();
    public Reader A0;
    public char[] B0;
    public boolean C0;
    public final rh2 D0;
    public final int E0;
    public boolean F0;
    public long G0;
    public int H0;
    public int I0;

    public oce(q68 q68Var, int i, Reader reader, i6c i6cVar, rh2 rh2Var, char[] cArr, int i2, int i3, boolean z) {
        super(q68Var, i);
        this.A0 = reader;
        this.B0 = cArr;
        this.f32790M = i2;
        this.f32791Q = i3;
        this.D0 = rh2Var;
        this.E0 = rh2Var.m46757p();
        this.C0 = z;
    }

    public final ya9 B2() {
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

    @Override // p001o.cyc, p001o.ca9
    /* renamed from: C */
    public final String mo20614C() throws ba9 {
        ya9 ya9Var = this.f18843b;
        if (ya9Var != ya9.VALUE_STRING) {
            return b2(ya9Var);
        }
        if (this.F0) {
            this.F0 = false;
            Y1();
        }
        return this.m0.m43622j();
    }

    public String D2() {
        int i = this.f32790M;
        int i2 = this.E0;
        int i3 = this.f32791Q;
        if (i < i3) {
            int[] iArr = R0;
            int length = iArr.length;
            do {
                char[] cArr = this.B0;
                char c = cArr[i];
                if (c != '\'') {
                    if (c < length && iArr[c] != 0) {
                        break;
                    }
                    i2 = (i2 * 33) + c;
                    i++;
                } else {
                    int i4 = this.f32790M;
                    this.f32790M = i + 1;
                    return this.D0.m46756o(cArr, i4, i - i4, i2);
                }
            } while (i < i3);
        }
        int i5 = this.f32790M;
        this.f32790M = i;
        return K2(i5, i2, 39);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v12 ??, r9v5 ??, r9v3 ??, r9v9 ??, r9v7 ??, r9v10 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x006e -> B:30:0x0050). Please report as a decompilation issue!!! */
    public final p001o.ya9 G2(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v12 ??, r9v5 ??, r9v3 ??, r9v9 ??, r9v7 ??, r9v10 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Override // p001o.cyc, p001o.ca9
    /* renamed from: H */
    public final ya9 mo20616H() throws ba9 {
        ya9 ya9VarO2;
        ya9 ya9Var = this.f18843b;
        ya9 ya9Var2 = ya9.FIELD_NAME;
        if (ya9Var == ya9Var2) {
            return B2();
        }
        this.q0 = 0;
        if (this.F0) {
            k3();
        }
        int iP3 = p3();
        if (iP3 < 0) {
            close();
            this.f18843b = null;
            return null;
        }
        this.p0 = null;
        if (iP3 == 93 || iP3 == 125) {
            R1(iP3);
            return this.f18843b;
        }
        if (this.k0.m31793m()) {
            iP3 = g3(iP3);
            if ((this.f17652a & J0) != 0 && (iP3 == 93 || iP3 == 125)) {
                R1(iP3);
                return this.f18843b;
            }
        }
        boolean zM43272e = this.k0.m43272e();
        if (zM43272e) {
            t3();
            this.k0.m31797q(iP3 == 34 ? I2() : e2(iP3));
            this.f18843b = ya9Var2;
            iP3 = c3();
        }
        s3();
        if (iP3 == 34) {
            this.F0 = true;
            ya9VarO2 = ya9.VALUE_STRING;
        } else if (iP3 == 91) {
            if (!zM43272e) {
                this.k0 = this.k0.m31791j(this.i0, this.j0);
            }
            ya9VarO2 = ya9.START_ARRAY;
        } else if (iP3 == 102) {
            s2();
            ya9VarO2 = ya9.VALUE_FALSE;
        } else if (iP3 == 110) {
            v2();
            ya9VarO2 = ya9.VALUE_NULL;
        } else if (iP3 == 116) {
            z2();
            ya9VarO2 = ya9.VALUE_TRUE;
        } else if (iP3 == 123) {
            if (!zM43272e) {
                this.k0 = this.k0.m31792k(this.i0, this.j0);
            }
            ya9VarO2 = ya9.START_OBJECT;
        } else if (iP3 == 125) {
            r0(iP3, "expected a value");
            z2();
            ya9VarO2 = ya9.VALUE_TRUE;
        } else if (iP3 == 45) {
            ya9VarO2 = O2();
        } else if (iP3 != 46) {
            switch (iP3) {
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
                    ya9VarO2 = Q2(iP3);
                    break;
                default:
                    ya9VarO2 = m2(iP3);
                    break;
            }
        } else {
            ya9VarO2 = H2();
        }
        if (zM43272e) {
            this.l0 = ya9VarO2;
            return this.f18843b;
        }
        this.f18843b = ya9VarO2;
        return ya9VarO2;
    }

    public final ya9 H2() {
        if (!m20615D(ja9.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return m2(46);
        }
        int i = this.f32790M;
        return G2(46, i - 1, i, false, 0);
    }

    public final String I2() {
        int i = this.f32790M;
        int i2 = this.E0;
        int[] iArr = R0;
        while (true) {
            if (i >= this.f32791Q) {
                break;
            }
            char[] cArr = this.B0;
            char c = cArr[i];
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this.f32790M;
                this.f32790M = i + 1;
                return this.D0.m46756o(cArr, i3, i - i3, i2);
            }
        }
        int i4 = this.f32790M;
        this.f32790M = i;
        return K2(i4, i2, 34);
    }

    public final String K2(int i, int i2, int i3) throws ba9 {
        this.m0.m43633u(this.B0, i, this.f32790M - i);
        char[] cArrM43627o = this.m0.m43627o();
        int iM43628p = this.m0.m43628p();
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                k0(" in field name", ya9.FIELD_NAME);
            }
            char[] cArr = this.B0;
            int i4 = this.f32790M;
            this.f32790M = i4 + 1;
            char cS1 = cArr[i4];
            if (cS1 <= '\\') {
                if (cS1 == '\\') {
                    cS1 = S1();
                } else if (cS1 <= i3) {
                    if (cS1 == i3) {
                        this.m0.m43637y(iM43628p);
                        pgh pghVar = this.m0;
                        return this.D0.m46756o(pghVar.m43629q(), pghVar.m43630r(), pghVar.m43638z(), i2);
                    }
                    if (cS1 < ' ') {
                        q1(cS1, "name");
                    }
                }
            }
            i2 = (i2 * 33) + cS1;
            int i5 = iM43628p + 1;
            cArrM43627o[iM43628p] = cS1;
            if (i5 >= cArrM43627o.length) {
                cArrM43627o = this.m0.m43626n();
                iM43628p = 0;
            } else {
                iM43628p = i5;
            }
        }
    }

    @Override // p001o.kxc
    public void O0() throws IOException {
        if (this.A0 != null) {
            if (this.f32788H.m44856l() || m20615D(ca9.EnumC12600a.AUTO_CLOSE_SOURCE)) {
                this.A0.close();
            }
            this.A0 = null;
        }
    }

    public final ya9 O2() throws ba9 {
        int i = this.f32790M;
        int i2 = i - 1;
        int i3 = this.f32791Q;
        if (i >= i3) {
            return P2(true, i2);
        }
        int i4 = i + 1;
        char c = this.B0[i];
        if (c > '9' || c < '0') {
            this.f32790M = i4;
            return d2(c, true);
        }
        if (c == '0') {
            return P2(true, i2);
        }
        int i5 = 1;
        while (i4 < i3) {
            int i6 = i4 + 1;
            char c2 = this.B0[i4];
            if (c2 < '0' || c2 > '9') {
                if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this.f32790M = i6;
                    return G2(c2, i2, i6, true, i5);
                }
                int i7 = i6 - 1;
                this.f32790M = i7;
                if (this.k0.m43273f()) {
                    w3(c2);
                }
                this.m0.m43633u(this.B0, i2, i7 - i2);
                return O1(true, i5);
            }
            i5++;
            i4 = i6;
        }
        return P2(true, i2);
    }

    public final void P1(String str, int i, int i2) throws ba9 {
        if (Character.isJavaIdentifierPart((char) i2)) {
            R2(str.substring(0, i));
        }
    }

    public final ya9 P2(boolean z, int i) throws ba9 {
        int i2;
        char cY3;
        boolean z2;
        int i3;
        char cX3;
        if (z) {
            i++;
        }
        this.f32790M = i;
        char[] cArrM43623k = this.m0.m43623k();
        int i4 = 0;
        if (z) {
            cArrM43623k[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = this.f32790M;
        if (i5 < this.f32791Q) {
            char[] cArr = this.B0;
            this.f32790M = i5 + 1;
            cY3 = cArr[i5];
        } else {
            cY3 = y3("No digit following minus sign", ya9.VALUE_NUMBER_INT);
        }
        if (cY3 == '0') {
            cY3 = v3();
        }
        int i6 = 0;
        while (cY3 >= '0' && cY3 <= '9') {
            i6++;
            if (i2 >= cArrM43623k.length) {
                cArrM43623k = this.m0.m43626n();
                i2 = 0;
            }
            int i7 = i2 + 1;
            cArrM43623k[i2] = cY3;
            if (this.f32790M >= this.f32791Q && !o2()) {
                cY3 = 0;
                i2 = i7;
                z2 = true;
                break;
            }
            char[] cArr2 = this.B0;
            int i8 = this.f32790M;
            this.f32790M = i8 + 1;
            cY3 = cArr2[i8];
            i2 = i7;
        }
        z2 = false;
        if (i6 == 0) {
            return d2(cY3, z);
        }
        if (cY3 == '.') {
            if (i2 >= cArrM43623k.length) {
                cArrM43623k = this.m0.m43626n();
                i2 = 0;
            }
            cArrM43623k[i2] = cY3;
            i2++;
            i3 = 0;
            while (true) {
                if (this.f32790M >= this.f32791Q && !o2()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.B0;
                int i9 = this.f32790M;
                this.f32790M = i9 + 1;
                cY3 = cArr3[i9];
                if (cY3 < '0' || cY3 > '9') {
                    break;
                }
                i3++;
                if (i2 >= cArrM43623k.length) {
                    cArrM43623k = this.m0.m43626n();
                    i2 = 0;
                }
                cArrM43623k[i2] = cY3;
                i2++;
            }
            if (i3 == 0) {
                L0(cY3, "Decimal point not followed by a digit");
            }
        } else {
            i3 = 0;
        }
        if (cY3 == 'e' || cY3 == 'E') {
            if (i2 >= cArrM43623k.length) {
                cArrM43623k = this.m0.m43626n();
                i2 = 0;
            }
            int i10 = i2 + 1;
            cArrM43623k[i2] = cY3;
            int i11 = this.f32790M;
            if (i11 < this.f32791Q) {
                char[] cArr4 = this.B0;
                this.f32790M = i11 + 1;
                cX3 = cArr4[i11];
            } else {
                cX3 = x3("expected a digit for number exponent");
            }
            if (cX3 == '-' || cX3 == '+') {
                if (i10 >= cArrM43623k.length) {
                    cArrM43623k = this.m0.m43626n();
                    i10 = 0;
                }
                int i12 = i10 + 1;
                cArrM43623k[i10] = cX3;
                int i13 = this.f32790M;
                if (i13 < this.f32791Q) {
                    char[] cArr5 = this.B0;
                    this.f32790M = i13 + 1;
                    cX3 = cArr5[i13];
                } else {
                    cX3 = x3("expected a digit for number exponent");
                }
                i10 = i12;
            }
            int i14 = 0;
            cY3 = cX3;
            while (cY3 <= '9' && cY3 >= '0') {
                i14++;
                if (i10 >= cArrM43623k.length) {
                    cArrM43623k = this.m0.m43626n();
                    i10 = 0;
                }
                i2 = i10 + 1;
                cArrM43623k[i10] = cY3;
                if (this.f32790M >= this.f32791Q && !o2()) {
                    i4 = i14;
                    z2 = true;
                    break;
                }
                char[] cArr6 = this.B0;
                int i15 = this.f32790M;
                this.f32790M = i15 + 1;
                cY3 = cArr6[i15];
                i10 = i2;
            }
            i4 = i14;
            i2 = i10;
            if (i4 == 0) {
                L0(cY3, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.f32790M--;
            if (this.k0.m43273f()) {
                w3(cY3);
            }
        }
        this.m0.m43637y(i2);
        return I1(z, i6, i3, i4);
    }

    public final ya9 Q2(int i) throws ba9 {
        int i2 = this.f32790M;
        int i3 = i2 - 1;
        int i4 = this.f32791Q;
        if (i == 48) {
            return P2(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this.B0[i2];
            if (c < '0' || c > '9') {
                if (c == '.' || c == 'e' || c == 'E') {
                    this.f32790M = i6;
                    return G2(c, i3, i6, false, i5);
                }
                int i7 = i6 - 1;
                this.f32790M = i7;
                if (this.k0.m43273f()) {
                    w3(c);
                }
                this.m0.m43633u(this.B0, i3, i7 - i3);
                return O1(false, i5);
            }
            i5++;
            i2 = i6;
        }
        this.f32790M = i3;
        return P2(false, i3);
    }

    public final void R1(int i) {
        if (i == 93) {
            s3();
            if (!this.k0.m43271d()) {
                n1(i, '}');
            }
            this.k0 = this.k0.m31790i();
            this.f18843b = ya9.END_ARRAY;
        }
        if (i == 125) {
            s3();
            if (!this.k0.m43272e()) {
                n1(i, ']');
            }
            this.k0 = this.k0.m31790i();
            this.f18843b = ya9.END_OBJECT;
        }
    }

    public void R2(String str) throws ba9 {
        S2(str, v1());
    }

    public char S1() throws ba9 {
        if (this.f32790M >= this.f32791Q && !o2()) {
            k0(" in character escape sequence", ya9.VALUE_STRING);
        }
        char[] cArr = this.B0;
        int i = this.f32790M;
        this.f32790M = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return TokenParser.CR;
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            return S0(c);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                k0(" in character escape sequence", ya9.VALUE_STRING);
            }
            char[] cArr2 = this.B0;
            int i4 = this.f32790M;
            this.f32790M = i4 + 1;
            char c2 = cArr2[i4];
            int iM39046c = mh2.m39046c(c2);
            if (iM39046c < 0) {
                r0(c2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iM39046c;
        }
        return (char) i2;
    }

    public void S2(String str, String str2) throws ba9 {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                break;
            }
            char c = this.B0[this.f32790M];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.f32790M++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        d0("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    public final int U2() throws ba9 {
        char c;
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                throw m20618a("Unexpected end-of-input within/between " + this.k0.m43274g() + " entries");
            }
            char[] cArr = this.B0;
            int i = this.f32790M;
            int i2 = i + 1;
            this.f32790M = i2;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    h3();
                } else if (c != '#' || !r3()) {
                    break;
                }
            } else if (c < ' ') {
                if (c == '\n') {
                    this.f32793Y++;
                    this.f32794Z = i2;
                } else if (c == '\r') {
                    Z2();
                } else if (c != '\t') {
                    v0(c);
                }
            }
        }
        return c;
    }

    public final void Y1() throws ba9 {
        int i = this.f32790M;
        int i2 = this.f32791Q;
        if (i < i2) {
            int[] iArr = R0;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.B0;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    pgh pghVar = this.m0;
                    int i3 = this.f32790M;
                    pghVar.m43633u(cArr, i3, i - i3);
                    this.f32790M = i + 1;
                    return;
                }
            }
        }
        pgh pghVar2 = this.m0;
        char[] cArr2 = this.B0;
        int i4 = this.f32790M;
        pghVar2.m43632t(cArr2, i4, i - i4);
        this.f32790M = i;
        Z1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        k0(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y2() throws ba9 {
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                break;
            }
            char[] cArr = this.B0;
            int i = this.f32790M;
            int i2 = i + 1;
            this.f32790M = i2;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (i2 >= this.f32791Q && !o2()) {
                        break;
                    }
                    char[] cArr2 = this.B0;
                    int i3 = this.f32790M;
                    if (cArr2[i3] == '/') {
                        this.f32790M = i3 + 1;
                        return;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this.f32793Y++;
                        this.f32794Z = i2;
                    } else if (c == '\r') {
                        Z2();
                    } else if (c != '\t') {
                        v0(c);
                    }
                }
            }
        }
    }

    public void Z1() throws ba9 {
        char[] cArrM43627o = this.m0.m43627o();
        int iM43628p = this.m0.m43628p();
        int[] iArr = R0;
        int length = iArr.length;
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                k0(": was expecting closing quote for a string value", ya9.VALUE_STRING);
            }
            char[] cArr = this.B0;
            int i = this.f32790M;
            this.f32790M = i + 1;
            char cS1 = cArr[i];
            if (cS1 < length && iArr[cS1] != 0) {
                if (cS1 == '\"') {
                    this.m0.m43637y(iM43628p);
                    return;
                } else if (cS1 == '\\') {
                    cS1 = S1();
                } else if (cS1 < ' ') {
                    q1(cS1, "string value");
                }
            }
            if (iM43628p >= cArrM43627o.length) {
                cArrM43627o = this.m0.m43626n();
                iM43628p = 0;
            }
            cArrM43627o[iM43628p] = cS1;
            iM43628p++;
        }
    }

    public final void Z2() {
        if (this.f32790M < this.f32791Q || o2()) {
            char[] cArr = this.B0;
            int i = this.f32790M;
            if (cArr[i] == '\n') {
                this.f32790M = i + 1;
            }
        }
        this.f32793Y++;
        this.f32794Z = this.f32790M;
    }

    public final String b2(ya9 ya9Var) {
        if (ya9Var == null) {
            return null;
        }
        int iId = ya9Var.id();
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this.m0.m43622j() : ya9Var.asString() : this.k0.mo26380b();
    }

    public ya9 c2() throws ba9 {
        char[] cArrM43623k = this.m0.m43623k();
        int iM43628p = this.m0.m43628p();
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                k0(": was expecting closing quote for a string value", ya9.VALUE_STRING);
            }
            char[] cArr = this.B0;
            int i = this.f32790M;
            this.f32790M = i + 1;
            char cS1 = cArr[i];
            if (cS1 <= '\\') {
                if (cS1 == '\\') {
                    cS1 = S1();
                } else if (cS1 <= '\'') {
                    if (cS1 == '\'') {
                        this.m0.m43637y(iM43628p);
                        return ya9.VALUE_STRING;
                    }
                    if (cS1 < ' ') {
                        q1(cS1, "string value");
                    }
                }
            }
            if (iM43628p >= cArrM43623k.length) {
                cArrM43623k = this.m0.m43626n();
                iM43628p = 0;
            }
            cArrM43623k[iM43628p] = cS1;
            iM43628p++;
        }
    }

    public final int c3() {
        int i = this.f32790M;
        if (i + 4 >= this.f32791Q) {
            return d3(false);
        }
        char[] cArr = this.B0;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this.f32790M = i2;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/' || c2 == '#') {
                    return d3(true);
                }
                this.f32790M = i2 + 1;
                return c2;
            }
            if (c2 == ' ' || c2 == '\t') {
                int i3 = i2 + 1;
                this.f32790M = i3;
                char c3 = cArr[i3];
                if (c3 > ' ') {
                    if (c3 == '/' || c3 == '#') {
                        return d3(true);
                    }
                    this.f32790M = i3 + 1;
                    return c3;
                }
            }
            return d3(true);
        }
        if (c == ' ' || c == '\t') {
            int i4 = i + 1;
            this.f32790M = i4;
            c = cArr[i4];
        }
        if (c != ':') {
            return d3(false);
        }
        int i5 = this.f32790M + 1;
        this.f32790M = i5;
        char c4 = cArr[i5];
        if (c4 > ' ') {
            if (c4 == '/' || c4 == '#') {
                return d3(true);
            }
            this.f32790M = i5 + 1;
            return c4;
        }
        if (c4 == ' ' || c4 == '\t') {
            int i6 = i5 + 1;
            this.f32790M = i6;
            char c5 = cArr[i6];
            if (c5 > ' ') {
                if (c5 == '/' || c5 == '#') {
                    return d3(true);
                }
                this.f32790M = i6 + 1;
                return c5;
            }
        }
        return d3(true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public p001o.ya9 d2(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final int d3(boolean z) throws ba9 {
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                k0(" within/between " + this.k0.m43274g() + " entries", null);
                return -1;
            }
            char[] cArr = this.B0;
            int i = this.f32790M;
            int i2 = i + 1;
            this.f32790M = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    h3();
                } else if (c != '#' || !r3()) {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        r0(c, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (c < ' ') {
                if (c == '\n') {
                    this.f32793Y++;
                    this.f32794Z = i2;
                } else if (c == '\r') {
                    Z2();
                } else if (c != '\t') {
                    v0(c);
                }
            }
        }
    }

    public String e2(int i) throws ba9 {
        if (i == 39 && (this.f17652a & N0) != 0) {
            return D2();
        }
        if ((this.f17652a & O0) == 0) {
            r0(i, "was expecting double-quote to start field name");
        }
        int[] iArrM39053j = mh2.m39053j();
        int length = iArrM39053j.length;
        if (!(i < length ? iArrM39053j[i] == 0 : Character.isJavaIdentifierPart((char) i))) {
            r0(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this.f32790M;
        int i3 = this.E0;
        int i4 = this.f32791Q;
        if (i2 < i4) {
            do {
                char[] cArr = this.B0;
                char c = cArr[i2];
                if (c < length) {
                    if (iArrM39053j[c] != 0) {
                        int i5 = this.f32790M - 1;
                        this.f32790M = i2;
                        return this.D0.m46756o(cArr, i5, i2 - i5, i3);
                    }
                } else if (!Character.isJavaIdentifierPart(c)) {
                    int i6 = this.f32790M - 1;
                    this.f32790M = i2;
                    return this.D0.m46756o(this.B0, i6, i2 - i6, i3);
                }
                i3 = (i3 * 33) + c;
                i2++;
            } while (i2 < i4);
        }
        int i7 = this.f32790M - 1;
        this.f32790M = i2;
        return k2(i7, i3, iArrM39053j);
    }

    @Override // p001o.ca9
    /* renamed from: f */
    public s99 mo20621f() {
        return new s99(R0(), -1L, this.f32792X + this.f32790M, this.f32793Y, (this.f32790M - this.f32794Z) + 1);
    }

    public final int g3(int i) throws ba9 {
        if (i != 44) {
            r0(i, "was expecting comma to separate " + this.k0.m43274g() + " entries");
        }
        while (true) {
            int i2 = this.f32790M;
            if (i2 >= this.f32791Q) {
                return U2();
            }
            char[] cArr = this.B0;
            int i3 = i2 + 1;
            this.f32790M = i3;
            char c = cArr[i2];
            if (c > ' ') {
                if (c != '/' && c != '#') {
                    return c;
                }
                this.f32790M = i3 - 1;
                return U2();
            }
            if (c < ' ') {
                if (c == '\n') {
                    this.f32793Y++;
                    this.f32794Z = i3;
                } else if (c == '\r') {
                    Z2();
                } else if (c != '\t') {
                    v0(c);
                }
            }
        }
    }

    public final void h3() throws ba9 {
        if ((this.f17652a & P0) == 0) {
            r0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f32790M >= this.f32791Q && !o2()) {
            k0(" in a comment", null);
        }
        char[] cArr = this.B0;
        int i = this.f32790M;
        this.f32790M = i + 1;
        char c = cArr[i];
        if (c == '/') {
            i3();
        } else if (c == '*') {
            Y2();
        } else {
            r0(c, "was expecting either '*' or '/' for a comment");
        }
    }

    public final void i3() throws ba9 {
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                return;
            }
            char[] cArr = this.B0;
            int i = this.f32790M;
            int i2 = i + 1;
            this.f32790M = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.f32793Y++;
                    this.f32794Z = i2;
                    return;
                } else if (c == '\r') {
                    Z2();
                    return;
                } else if (c != '\t') {
                    v0(c);
                }
            }
        }
    }

    @Override // p001o.kxc
    public void j1() {
        char[] cArr;
        super.j1();
        this.D0.m46762u();
        if (!this.C0 || (cArr = this.B0) == null) {
            return;
        }
        this.B0 = null;
        this.f32788H.m44860p(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String k2(int i, int i2, int[] iArr) {
        int i3;
        this.m0.m43633u(this.B0, i, this.f32790M - i);
        char[] cArrM43627o = this.m0.m43627o();
        int iM43628p = this.m0.m43628p();
        int length = iArr.length;
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                break;
            }
            char c = this.B0[this.f32790M];
            if (c < length) {
                if (iArr[c] != 0) {
                    break;
                }
                this.f32790M++;
                i2 = (i2 * 33) + c;
                i3 = iM43628p + 1;
                cArrM43627o[iM43628p] = c;
                if (i3 < cArrM43627o.length) {
                    cArrM43627o = this.m0.m43626n();
                    iM43628p = 0;
                } else {
                    iM43628p = i3;
                }
            } else {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
                this.f32790M++;
                i2 = (i2 * 33) + c;
                i3 = iM43628p + 1;
                cArrM43627o[iM43628p] = c;
                if (i3 < cArrM43627o.length) {
                }
            }
        }
        this.m0.m43637y(iM43628p);
        pgh pghVar = this.m0;
        return this.D0.m46756o(pghVar.m43629q(), pghVar.m43630r(), pghVar.m43638z(), i2);
    }

    public final void k3() throws ba9 {
        this.F0 = false;
        int i = this.f32790M;
        int i2 = this.f32791Q;
        char[] cArr = this.B0;
        while (true) {
            if (i >= i2) {
                this.f32790M = i;
                if (!o2()) {
                    k0(": was expecting closing quote for a string value", ya9.VALUE_STRING);
                }
                i = this.f32790M;
                i2 = this.f32791Q;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.f32790M = i3;
                    S1();
                    i = this.f32790M;
                    i2 = this.f32791Q;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.f32790M = i3;
                        return;
                    } else if (c < ' ') {
                        this.f32790M = i3;
                        q1(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ya9 m2(int i) throws ba9 {
        if (i != 39) {
            if (i == 73) {
                w2("Infinity", 1);
                if ((this.f17652a & L0) != 0) {
                    return J1("Infinity", Double.POSITIVE_INFINITY);
                }
                m22056X("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i == 78) {
                w2("NaN", 1);
                if ((this.f17652a & L0) != 0) {
                    return J1("NaN", Double.NaN);
                }
                m22056X("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i != 93) {
                if (i == 43) {
                    if (this.f32790M >= this.f32791Q && !o2()) {
                        l0(ya9.VALUE_NUMBER_INT);
                    }
                    char[] cArr = this.B0;
                    int i2 = this.f32790M;
                    this.f32790M = i2 + 1;
                    return d2(cArr[i2], false);
                }
                if (i == 44) {
                    if (!this.k0.m43273f() && (this.f17652a & M0) != 0) {
                        this.f32790M--;
                        return ya9.VALUE_NULL;
                    }
                }
            } else if (this.k0.m43271d()) {
            }
        } else if ((this.f17652a & N0) != 0) {
            return c2();
        }
        if (Character.isJavaIdentifierStart(i)) {
            S2("" + ((char) i), v1());
        }
        r0(i, "expected a valid value " + w1());
        return null;
    }

    public boolean o2() throws IOException {
        Reader reader = this.A0;
        if (reader != null) {
            char[] cArr = this.B0;
            int i = reader.read(cArr, 0, cArr.length);
            if (i > 0) {
                int i2 = this.f32791Q;
                long j = i2;
                this.f32792X += j;
                this.f32794Z -= i2;
                this.G0 -= j;
                this.f32790M = 0;
                this.f32791Q = i;
                return true;
            }
            O0();
            if (i == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f32791Q);
            }
        }
        return false;
    }

    public final int p3() throws ba9 {
        if (this.f32790M >= this.f32791Q && !o2()) {
            return P0();
        }
        char[] cArr = this.B0;
        int i = this.f32790M;
        int i2 = i + 1;
        this.f32790M = i2;
        char c = cArr[i];
        if (c > ' ') {
            if (c != '/' && c != '#') {
                return c;
            }
            this.f32790M = i2 - 1;
            return q3();
        }
        if (c != ' ') {
            if (c == '\n') {
                this.f32793Y++;
                this.f32794Z = i2;
            } else if (c == '\r') {
                Z2();
            } else if (c != '\t') {
                v0(c);
            }
        }
        while (true) {
            int i3 = this.f32790M;
            if (i3 >= this.f32791Q) {
                return q3();
            }
            char[] cArr2 = this.B0;
            int i4 = i3 + 1;
            this.f32790M = i4;
            char c2 = cArr2[i3];
            if (c2 > ' ') {
                if (c2 != '/' && c2 != '#') {
                    return c2;
                }
                this.f32790M = i4 - 1;
                return q3();
            }
            if (c2 != ' ') {
                if (c2 == '\n') {
                    this.f32793Y++;
                    this.f32794Z = i4;
                } else if (c2 == '\r') {
                    Z2();
                } else if (c2 != '\t') {
                    v0(c2);
                }
            }
        }
    }

    public final int q3() throws ba9 {
        char c;
        while (true) {
            if (this.f32790M >= this.f32791Q && !o2()) {
                return P0();
            }
            char[] cArr = this.B0;
            int i = this.f32790M;
            int i2 = i + 1;
            this.f32790M = i2;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    h3();
                } else if (c != '#' || !r3()) {
                    break;
                }
            } else if (c != ' ') {
                if (c == '\n') {
                    this.f32793Y++;
                    this.f32794Z = i2;
                } else if (c == '\r') {
                    Z2();
                } else if (c != '\t') {
                    v0(c);
                }
            }
        }
        return c;
    }

    public final boolean r3() throws ba9 {
        if ((this.f17652a & Q0) == 0) {
            return false;
        }
        i3();
        return true;
    }

    public final void s2() throws ba9 {
        int i;
        char c;
        int i2 = this.f32790M;
        if (i2 + 4 < this.f32791Q) {
            char[] cArr = this.B0;
            if (cArr[i2] == 'a') {
                int i3 = i2 + 1;
                if (cArr[i3] == 'l') {
                    int i4 = i3 + 1;
                    if (cArr[i4] == 's') {
                        int i5 = i4 + 1;
                        if (cArr[i5] == 'e' && ((c = cArr[(i = i5 + 1)]) < '0' || c == ']' || c == '}')) {
                            this.f32790M = i;
                            return;
                        }
                    }
                }
            }
        }
        w2("false", 1);
    }

    public final void s3() {
        int i = this.f32790M;
        this.h0 = this.f32792X + i;
        this.i0 = this.f32793Y;
        this.j0 = i - this.f32794Z;
    }

    public final void t3() {
        int i = this.f32790M;
        this.G0 = i;
        this.H0 = this.f32793Y;
        this.I0 = i - this.f32794Z;
    }

    public final char u3() throws ba9 {
        char c;
        if ((this.f32790M >= this.f32791Q && !o2()) || (c = this.B0[this.f32790M]) < '0' || c > '9') {
            return '0';
        }
        if ((this.f17652a & K0) == 0) {
            A0("Leading zeroes not allowed");
        }
        this.f32790M++;
        if (c == '0') {
            do {
                if (this.f32790M >= this.f32791Q && !o2()) {
                    break;
                }
                char[] cArr = this.B0;
                int i = this.f32790M;
                c = cArr[i];
                if (c < '0' || c > '9') {
                    return '0';
                }
                this.f32790M = i + 1;
            } while (c == '0');
        }
        return c;
    }

    public final void v2() throws ba9 {
        int i;
        char c;
        int i2 = this.f32790M;
        if (i2 + 3 < this.f32791Q) {
            char[] cArr = this.B0;
            if (cArr[i2] == 'u') {
                int i3 = i2 + 1;
                if (cArr[i3] == 'l') {
                    int i4 = i3 + 1;
                    if (cArr[i4] == 'l' && ((c = cArr[(i = i4 + 1)]) < '0' || c == ']' || c == '}')) {
                        this.f32790M = i;
                        return;
                    }
                }
            }
        }
        w2("null", 1);
    }

    public final char v3() {
        char c;
        int i = this.f32790M;
        if (i >= this.f32791Q || ((c = this.B0[i]) >= '0' && c <= '9')) {
            return u3();
        }
        return '0';
    }

    public final void w2(String str, int i) throws ba9 {
        int i2;
        int length = str.length();
        if (this.f32790M + length >= this.f32791Q) {
            x2(str, i);
            return;
        }
        do {
            if (this.B0[this.f32790M] != str.charAt(i)) {
                R2(str.substring(0, i));
            }
            i2 = this.f32790M + 1;
            this.f32790M = i2;
            i++;
        } while (i < length);
        char c = this.B0[i2];
        if (c < '0' || c == ']' || c == '}') {
            return;
        }
        P1(str, i, c);
    }

    public final void w3(int i) throws ba9 {
        int i2 = this.f32790M + 1;
        this.f32790M = i2;
        if (i != 9) {
            if (i == 10) {
                this.f32793Y++;
                this.f32794Z = i2;
            } else if (i == 13) {
                Z2();
            } else if (i != 32) {
                o0(i);
            }
        }
    }

    public final void x2(String str, int i) throws ba9 {
        int i2;
        char c;
        int length = str.length();
        do {
            if ((this.f32790M >= this.f32791Q && !o2()) || this.B0[this.f32790M] != str.charAt(i)) {
                R2(str.substring(0, i));
            }
            i2 = this.f32790M + 1;
            this.f32790M = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f32791Q || o2()) && (c = this.B0[this.f32790M]) >= '0' && c != ']' && c != '}') {
            P1(str, i, c);
        }
    }

    public char x3(String str) {
        return y3(str, null);
    }

    public char y3(String str, ya9 ya9Var) throws j89 {
        if (this.f32790M >= this.f32791Q && !o2()) {
            k0(str, ya9Var);
        }
        char[] cArr = this.B0;
        int i = this.f32790M;
        this.f32790M = i + 1;
        return cArr[i];
    }

    public final void z2() throws ba9 {
        int i;
        char c;
        int i2 = this.f32790M;
        if (i2 + 3 < this.f32791Q) {
            char[] cArr = this.B0;
            if (cArr[i2] == 'r') {
                int i3 = i2 + 1;
                if (cArr[i3] == 'u') {
                    int i4 = i3 + 1;
                    if (cArr[i4] == 'e' && ((c = cArr[(i = i4 + 1)]) < '0' || c == ']' || c == '}')) {
                        this.f32790M = i;
                        return;
                    }
                }
            }
        }
        w2("true", 1);
    }

    public oce(q68 q68Var, int i, Reader reader, i6c i6cVar, rh2 rh2Var) {
        super(q68Var, i);
        this.A0 = reader;
        this.B0 = q68Var.m44850f();
        this.f32790M = 0;
        this.f32791Q = 0;
        this.D0 = rh2Var;
        this.E0 = rh2Var.m46757p();
        this.C0 = true;
    }
}
