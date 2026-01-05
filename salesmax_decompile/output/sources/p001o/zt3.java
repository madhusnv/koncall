package p001o;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p001o.tt3;

/* loaded from: classes2.dex */
public class zt3 {
    public static float U0 = 0.5f;
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;

    /* renamed from: F */
    public boolean f57620F;
    public boolean F0;

    /* renamed from: G */
    public boolean f57621G;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public int J0;
    public int K0;
    public boolean L0;

    /* renamed from: M */
    public boolean f57627M;
    public boolean M0;
    public float[] N0;
    public zt3[] O0;
    public zt3[] P0;
    public zt3 Q0;
    public zt3 R0;
    public int S0;
    public int T0;

    /* renamed from: X */
    public tt3 f57638X;

    /* renamed from: Y */
    public tt3[] f57639Y;

    /* renamed from: Z */
    public ArrayList f57640Z;
    public boolean[] a0;
    public EnumC18702b[] b0;

    /* renamed from: c */
    public zf2 f57643c;
    public zt3 c0;

    /* renamed from: d */
    public zf2 f57644d;
    public int d0;
    public int e0;
    public float f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;

    /* renamed from: o */
    public String f57655o;
    public int o0;
    public int p0;
    public float q0;
    public float r0;
    public Object s0;
    public int t0;
    public int u0;
    public boolean v0;
    public String w0;
    public String x0;
    public int y0;
    public int z0;

    /* renamed from: a */
    public boolean f57641a = false;

    /* renamed from: b */
    public r8j[] f57642b = new r8j[2];

    /* renamed from: e */
    public x08 f57645e = null;

    /* renamed from: f */
    public bui f57646f = null;

    /* renamed from: g */
    public boolean[] f57647g = {true, true};

    /* renamed from: h */
    public boolean f57648h = false;

    /* renamed from: i */
    public boolean f57649i = true;

    /* renamed from: j */
    public boolean f57650j = false;

    /* renamed from: k */
    public boolean f57651k = true;

    /* renamed from: l */
    public int f57652l = -1;

    /* renamed from: m */
    public int f57653m = -1;

    /* renamed from: n */
    public p8j f57654n = new p8j(this);

    /* renamed from: p */
    public boolean f57656p = false;

    /* renamed from: q */
    public boolean f57657q = false;

    /* renamed from: r */
    public boolean f57658r = false;

    /* renamed from: s */
    public boolean f57659s = false;

    /* renamed from: t */
    public int f57660t = -1;

    /* renamed from: u */
    public int f57661u = -1;

    /* renamed from: v */
    public int f57662v = 0;

    /* renamed from: w */
    public int f57663w = 0;

    /* renamed from: x */
    public int f57664x = 0;

    /* renamed from: y */
    public int[] f57665y = new int[2];

    /* renamed from: z */
    public int f57666z = 0;

    /* renamed from: A */
    public int f57615A = 0;

    /* renamed from: B */
    public float f57616B = 1.0f;

    /* renamed from: C */
    public int f57617C = 0;

    /* renamed from: D */
    public int f57618D = 0;

    /* renamed from: E */
    public float f57619E = 1.0f;

    /* renamed from: H */
    public int f57622H = -1;

    /* renamed from: I */
    public float f57623I = 1.0f;

    /* renamed from: J */
    public int[] f57624J = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* renamed from: K */
    public float f57625K = Float.NaN;

    /* renamed from: L */
    public boolean f57626L = false;

    /* renamed from: N */
    public boolean f57628N = false;

    /* renamed from: O */
    public int f57629O = 0;

    /* renamed from: P */
    public int f57630P = 0;

    /* renamed from: Q */
    public tt3 f57631Q = new tt3(this, tt3.EnumC17197a.LEFT);

    /* renamed from: R */
    public tt3 f57632R = new tt3(this, tt3.EnumC17197a.TOP);

    /* renamed from: S */
    public tt3 f57633S = new tt3(this, tt3.EnumC17197a.RIGHT);

    /* renamed from: T */
    public tt3 f57634T = new tt3(this, tt3.EnumC17197a.BOTTOM);

    /* renamed from: U */
    public tt3 f57635U = new tt3(this, tt3.EnumC17197a.BASELINE);

    /* renamed from: V */
    public tt3 f57636V = new tt3(this, tt3.EnumC17197a.CENTER_X);

    /* renamed from: W */
    public tt3 f57637W = new tt3(this, tt3.EnumC17197a.CENTER_Y);

    /* renamed from: o.zt3$a */
    public static /* synthetic */ class C18701a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57667a;

        static {
            int[] iArr = new int[tt3.EnumC17197a.values().length];
            f57667a = iArr;
            try {
                iArr[tt3.EnumC17197a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57667a[tt3.EnumC17197a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57667a[tt3.EnumC17197a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57667a[tt3.EnumC17197a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57667a[tt3.EnumC17197a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57667a[tt3.EnumC17197a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57667a[tt3.EnumC17197a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57667a[tt3.EnumC17197a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57667a[tt3.EnumC17197a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: o.zt3$b */
    public enum EnumC18702b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public zt3() {
        tt3 tt3Var = new tt3(this, tt3.EnumC17197a.CENTER);
        this.f57638X = tt3Var;
        this.f57639Y = new tt3[]{this.f57631Q, this.f57633S, this.f57632R, this.f57634T, this.f57635U, tt3Var};
        this.f57640Z = new ArrayList();
        this.a0 = new boolean[2];
        EnumC18702b enumC18702b = EnumC18702b.FIXED;
        this.b0 = new EnumC18702b[]{enumC18702b, enumC18702b};
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float f = U0;
        this.q0 = f;
        this.r0 = f;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new zt3[]{null, null};
        this.P0 = new zt3[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        m59848d();
    }

    /* renamed from: A */
    public float m59823A() {
        return this.q0;
    }

    public final void A0(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    /* renamed from: B */
    public int m59824B() {
        return this.J0;
    }

    public final void B0(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    /* renamed from: C */
    public EnumC18702b m59825C() {
        return this.b0[0];
    }

    public final void C0(StringBuilder sb, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(str2);
        sb.append(",\n");
    }

    /* renamed from: D */
    public int m59826D() {
        tt3 tt3Var = this.f57631Q;
        int i = tt3Var != null ? 0 + tt3Var.f47688g : 0;
        tt3 tt3Var2 = this.f57633S;
        return tt3Var2 != null ? i + tt3Var2.f47688g : i;
    }

    public final void D0(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    /* renamed from: E */
    public int m59827E() {
        return this.f57629O;
    }

    public void E0(boolean z) {
        this.v0 = z;
    }

    /* renamed from: F */
    public int m59828F() {
        return this.f57630P;
    }

    public void F0(int i) {
        this.n0 = i;
        this.f57626L = i > 0;
    }

    /* renamed from: G */
    public int m59829G(int i) {
        if (i == 0) {
            return m59846Y();
        }
        if (i == 1) {
            return m59866z();
        }
        return 0;
    }

    public void G0(Object obj) {
        this.s0 = obj;
    }

    /* renamed from: H */
    public int m59830H() {
        return this.f57624J[1];
    }

    public void H0(String str) {
        this.w0 = str;
    }

    /* renamed from: I */
    public int m59831I() {
        return this.f57624J[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I0(String str) throws NumberFormatException {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f0 = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            i2 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            i = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
            String strSubstring2 = str.substring(i);
            fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : i;
        } else {
            String strSubstring3 = str.substring(i, iIndexOf2);
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                float f = Float.parseFloat(strSubstring3);
                float f2 = Float.parseFloat(strSubstring4);
                if (f > 0.0f && f2 > 0.0f) {
                    fAbs = i2 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                }
            }
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.f0 = fAbs;
            this.g0 = i2;
        }
    }

    /* renamed from: J */
    public int m59832J() {
        return this.p0;
    }

    public void J0(int i) {
        if (this.f57626L) {
            int i2 = i - this.n0;
            int i3 = this.e0 + i2;
            this.i0 = i2;
            this.f57632R.m50487t(i2);
            this.f57634T.m50487t(i3);
            this.f57635U.m50487t(i);
            this.f57657q = true;
        }
    }

    /* renamed from: K */
    public int m59833K() {
        return this.o0;
    }

    public void K0(int i, int i2) {
        if (this.f57656p) {
            return;
        }
        this.f57631Q.m50487t(i);
        this.f57633S.m50487t(i2);
        this.h0 = i;
        this.d0 = i2 - i;
        this.f57656p = true;
    }

    /* renamed from: L */
    public zt3 m59834L(int i) {
        tt3 tt3Var;
        tt3 tt3Var2;
        if (i != 0) {
            if (i == 1 && (tt3Var2 = (tt3Var = this.f57634T).f47687f) != null && tt3Var2.f47687f == tt3Var) {
                return tt3Var2.f47685d;
            }
            return null;
        }
        tt3 tt3Var3 = this.f57633S;
        tt3 tt3Var4 = tt3Var3.f47687f;
        if (tt3Var4 == null || tt3Var4.f47687f != tt3Var3) {
            return null;
        }
        return tt3Var4.f47685d;
    }

    public void L0(int i) {
        this.f57631Q.m50487t(i);
        this.h0 = i;
    }

    /* renamed from: M */
    public zt3 m59835M() {
        return this.c0;
    }

    public void M0(int i) {
        this.f57632R.m50487t(i);
        this.i0 = i;
    }

    /* renamed from: N */
    public zt3 m59836N(int i) {
        tt3 tt3Var;
        tt3 tt3Var2;
        if (i != 0) {
            if (i == 1 && (tt3Var2 = (tt3Var = this.f57632R).f47687f) != null && tt3Var2.f47687f == tt3Var) {
                return tt3Var2.f47685d;
            }
            return null;
        }
        tt3 tt3Var3 = this.f57631Q;
        tt3 tt3Var4 = tt3Var3.f47687f;
        if (tt3Var4 == null || tt3Var4.f47687f != tt3Var3) {
            return null;
        }
        return tt3Var4.f47685d;
    }

    public void N0(int i, int i2) {
        if (this.f57657q) {
            return;
        }
        this.f57632R.m50487t(i);
        this.f57634T.m50487t(i2);
        this.i0 = i;
        this.e0 = i2 - i;
        if (this.f57626L) {
            this.f57635U.m50487t(i + this.n0);
        }
        this.f57657q = true;
    }

    /* renamed from: O */
    public int m59837O() {
        return m59847Z() + this.d0;
    }

    public void O0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.h0 = i;
        this.i0 = i2;
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        EnumC18702b[] enumC18702bArr = this.b0;
        EnumC18702b enumC18702b = enumC18702bArr[0];
        EnumC18702b enumC18702b2 = EnumC18702b.FIXED;
        if (enumC18702b == enumC18702b2 && i7 < (i6 = this.d0)) {
            i7 = i6;
        }
        if (enumC18702bArr[1] == enumC18702b2 && i8 < (i5 = this.e0)) {
            i8 = i5;
        }
        this.d0 = i7;
        this.e0 = i8;
        int i9 = this.p0;
        if (i8 < i9) {
            this.e0 = i9;
        }
        int i10 = this.o0;
        if (i7 < i10) {
            this.d0 = i10;
        }
        int i11 = this.f57615A;
        if (i11 > 0 && enumC18702b == EnumC18702b.MATCH_CONSTRAINT) {
            this.d0 = Math.min(this.d0, i11);
        }
        int i12 = this.f57618D;
        if (i12 > 0 && this.b0[1] == EnumC18702b.MATCH_CONSTRAINT) {
            this.e0 = Math.min(this.e0, i12);
        }
        int i13 = this.d0;
        if (i7 != i13) {
            this.f57652l = i13;
        }
        int i14 = this.e0;
        if (i8 != i14) {
            this.f57653m = i14;
        }
    }

    /* renamed from: P */
    public r8j m59838P(int i) {
        if (i == 0) {
            return this.f57645e;
        }
        if (i == 1) {
            return this.f57646f;
        }
        return null;
    }

    public void P0(boolean z) {
        this.f57626L = z;
    }

    /* renamed from: Q */
    public void mo17832Q(StringBuilder sb) {
        sb.append("  " + this.f57655o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.d0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.e0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.h0);
        sb.append("\n");
        sb.append("    actualTop:" + this.i0);
        sb.append("\n");
        m59840S(sb, "left", this.f57631Q);
        m59840S(sb, "top", this.f57632R);
        m59840S(sb, "right", this.f57633S);
        m59840S(sb, "bottom", this.f57634T);
        m59840S(sb, "baseline", this.f57635U);
        m59840S(sb, "centerX", this.f57636V);
        m59840S(sb, "centerY", this.f57637W);
        m59839R(sb, "    width", this.d0, this.o0, this.f57624J[0], this.f57652l, this.f57666z, this.f57663w, this.f57616B, this.b0[0], this.N0[0]);
        m59839R(sb, "    height", this.e0, this.p0, this.f57624J[1], this.f57653m, this.f57617C, this.f57664x, this.f57619E, this.b0[1], this.N0[1]);
        D0(sb, "    dimensionRatio", this.f0, this.g0);
        A0(sb, "    horizontalBias", this.q0, U0);
        A0(sb, "    verticalBias", this.r0, U0);
        B0(sb, "    horizontalChainStyle", this.J0, 0);
        B0(sb, "    verticalChainStyle", this.K0, 0);
        sb.append("  }");
    }

    public void Q0(int i) {
        this.e0 = i;
        int i2 = this.p0;
        if (i < i2) {
            this.e0 = i2;
        }
    }

    /* renamed from: R */
    public final void m59839R(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, EnumC18702b enumC18702b, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        C0(sb, "      behavior", enumC18702b.toString(), EnumC18702b.FIXED.toString());
        B0(sb, "      size", i, 0);
        B0(sb, "      min", i2, 0);
        B0(sb, "      max", i3, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        B0(sb, "      matchMin", i5, 0);
        B0(sb, "      matchDef", i6, 0);
        A0(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public void R0(float f) {
        this.q0 = f;
    }

    /* renamed from: S */
    public final void m59840S(StringBuilder sb, String str, tt3 tt3Var) {
        if (tt3Var.f47687f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(tt3Var.f47687f);
        sb.append("'");
        if (tt3Var.f47689h != Integer.MIN_VALUE || tt3Var.f47688g != 0) {
            sb.append(",");
            sb.append(tt3Var.f47688g);
            if (tt3Var.f47689h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(tt3Var.f47689h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public void S0(int i) {
        this.J0 = i;
    }

    /* renamed from: T */
    public float m59841T() {
        return this.r0;
    }

    public void T0(int i, int i2) {
        this.h0 = i;
        int i3 = i2 - i;
        this.d0 = i3;
        int i4 = this.o0;
        if (i3 < i4) {
            this.d0 = i4;
        }
    }

    /* renamed from: U */
    public int m59842U() {
        return this.K0;
    }

    public void U0(EnumC18702b enumC18702b) {
        this.b0[0] = enumC18702b;
    }

    /* renamed from: V */
    public EnumC18702b m59843V() {
        return this.b0[1];
    }

    public void V0(int i, int i2, int i3, float f) {
        this.f57663w = i;
        this.f57666z = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f57615A = i3;
        this.f57616B = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f57663w = 2;
    }

    /* renamed from: W */
    public int m59844W() {
        int i = this.f57631Q != null ? 0 + this.f57632R.f47688g : 0;
        return this.f57633S != null ? i + this.f57634T.f47688g : i;
    }

    public void W0(float f) {
        this.N0[0] = f;
    }

    /* renamed from: X */
    public int m59845X() {
        return this.u0;
    }

    public void X0(int i, boolean z) {
        this.a0[i] = z;
    }

    /* renamed from: Y */
    public int m59846Y() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.d0;
    }

    public void Y0(boolean z) {
        this.f57627M = z;
    }

    /* renamed from: Z */
    public int m59847Z() {
        zt3 zt3Var = this.c0;
        return (zt3Var == null || !(zt3Var instanceof au3)) ? this.h0 : ((au3) zt3Var).c1 + this.h0;
    }

    public void Z0(boolean z) {
        this.f57628N = z;
    }

    public int a0() {
        zt3 zt3Var = this.c0;
        return (zt3Var == null || !(zt3Var instanceof au3)) ? this.i0 : ((au3) zt3Var).d1 + this.i0;
    }

    public void a1(int i, int i2) {
        this.f57629O = i;
        this.f57630P = i2;
        d1(false);
    }

    public boolean b0() {
        return this.f57626L;
    }

    public void b1(int i) {
        this.f57624J[1] = i;
    }

    public boolean c0(int i) {
        if (i == 0) {
            return (this.f57631Q.f47687f != null ? 1 : 0) + (this.f57633S.f47687f != null ? 1 : 0) < 2;
        }
        return ((this.f57632R.f47687f != null ? 1 : 0) + (this.f57634T.f47687f != null ? 1 : 0)) + (this.f57635U.f47687f != null ? 1 : 0) < 2;
    }

    public void c1(int i) {
        this.f57624J[0] = i;
    }

    /* renamed from: d */
    public final void m59848d() {
        this.f57640Z.add(this.f57631Q);
        this.f57640Z.add(this.f57632R);
        this.f57640Z.add(this.f57633S);
        this.f57640Z.add(this.f57634T);
        this.f57640Z.add(this.f57636V);
        this.f57640Z.add(this.f57637W);
        this.f57640Z.add(this.f57638X);
        this.f57640Z.add(this.f57635U);
    }

    public boolean d0() {
        int size = this.f57640Z.size();
        for (int i = 0; i < size; i++) {
            if (((tt3) this.f57640Z.get(i)).m50480m()) {
                return true;
            }
        }
        return false;
    }

    public void d1(boolean z) {
        this.f57649i = z;
    }

    /* renamed from: e */
    public void m59849e(au3 au3Var, sda sdaVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            lec.m37038a(au3Var, sdaVar, this);
            hashSet.remove(this);
            mo47183g(sdaVar, au3Var.Z1(64));
        }
        if (i == 0) {
            HashSet hashSetM50471d = this.f57631Q.m50471d();
            if (hashSetM50471d != null) {
                Iterator it = hashSetM50471d.iterator();
                while (it.hasNext()) {
                    ((tt3) it.next()).f47685d.m59849e(au3Var, sdaVar, hashSet, i, true);
                }
            }
            HashSet hashSetM50471d2 = this.f57633S.m50471d();
            if (hashSetM50471d2 != null) {
                Iterator it2 = hashSetM50471d2.iterator();
                while (it2.hasNext()) {
                    ((tt3) it2.next()).f47685d.m59849e(au3Var, sdaVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSetM50471d3 = this.f57632R.m50471d();
        if (hashSetM50471d3 != null) {
            Iterator it3 = hashSetM50471d3.iterator();
            while (it3.hasNext()) {
                ((tt3) it3.next()).f47685d.m59849e(au3Var, sdaVar, hashSet, i, true);
            }
        }
        HashSet hashSetM50471d4 = this.f57634T.m50471d();
        if (hashSetM50471d4 != null) {
            Iterator it4 = hashSetM50471d4.iterator();
            while (it4.hasNext()) {
                ((tt3) it4.next()).f47685d.m59849e(au3Var, sdaVar, hashSet, i, true);
            }
        }
        HashSet hashSetM50471d5 = this.f57635U.m50471d();
        if (hashSetM50471d5 != null) {
            Iterator it5 = hashSetM50471d5.iterator();
            while (it5.hasNext()) {
                ((tt3) it5.next()).f47685d.m59849e(au3Var, sdaVar, hashSet, i, true);
            }
        }
    }

    public boolean e0() {
        return (this.f57652l == -1 && this.f57653m == -1) ? false : true;
    }

    public void e1(int i) {
        if (i < 0) {
            this.p0 = 0;
        } else {
            this.p0 = i;
        }
    }

    /* renamed from: f */
    public boolean m59850f() {
        return (this instanceof x0j) || (this instanceof rv7);
    }

    public boolean f0(int i, int i2) {
        tt3 tt3Var;
        tt3 tt3Var2;
        if (i == 0) {
            tt3 tt3Var3 = this.f57631Q.f47687f;
            return tt3Var3 != null && tt3Var3.m50481n() && (tt3Var2 = this.f57633S.f47687f) != null && tt3Var2.m50481n() && (this.f57633S.f47687f.m50472e() - this.f57633S.m50473f()) - (this.f57631Q.f47687f.m50472e() + this.f57631Q.m50473f()) >= i2;
        }
        tt3 tt3Var4 = this.f57632R.f47687f;
        return tt3Var4 != null && tt3Var4.m50481n() && (tt3Var = this.f57634T.f47687f) != null && tt3Var.m50481n() && (this.f57634T.f47687f.m50472e() - this.f57634T.m50473f()) - (this.f57632R.f47687f.m50472e() + this.f57632R.m50473f()) >= i2;
        return false;
    }

    public void f1(int i) {
        if (i < 0) {
            this.o0 = 0;
        } else {
            this.o0 = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05bf  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo47183g(sda sdaVar, boolean z) {
        boolean z2;
        boolean z3;
        zt3 zt3Var;
        zt3 zt3Var2;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z6;
        int i5;
        EnumC18702b enumC18702b;
        boolean z7;
        boolean z8;
        EnumC18702b enumC18702b2;
        EnumC18702b enumC18702b3;
        fzf fzfVar;
        fzf fzfVar2;
        fzf fzfVar3;
        fzf fzfVar4;
        fzf fzfVar5;
        boolean z9;
        int i6;
        int i7;
        int i8;
        zt3 zt3Var3;
        sda sdaVar2;
        fzf fzfVar6;
        fzf fzfVar7;
        fzf fzfVar8;
        int i9;
        fzf fzfVar9;
        fzf fzfVar10;
        zt3 zt3Var4;
        boolean z10;
        x08 x08Var;
        int i10;
        int i11;
        boolean zK0;
        boolean zM0;
        x08 x08Var2;
        bui buiVar;
        fzf fzfVarM48251q = sdaVar.m48251q(this.f57631Q);
        fzf fzfVarM48251q2 = sdaVar.m48251q(this.f57633S);
        fzf fzfVarM48251q3 = sdaVar.m48251q(this.f57632R);
        fzf fzfVarM48251q4 = sdaVar.m48251q(this.f57634T);
        fzf fzfVarM48251q5 = sdaVar.m48251q(this.f57635U);
        zt3 zt3Var5 = this.c0;
        if (zt3Var5 == null) {
            z2 = false;
            z3 = false;
        } else {
            boolean z11 = zt3Var5 != null && zt3Var5.b0[0] == EnumC18702b.WRAP_CONTENT;
            boolean z12 = zt3Var5 != null && zt3Var5.b0[1] == EnumC18702b.WRAP_CONTENT;
            int i12 = this.f57662v;
            if (i12 == 1) {
                z2 = z11;
                z3 = false;
            } else if (i12 == 2) {
                z3 = z12;
                z2 = false;
            } else if (i12 != 3) {
                z3 = z12;
                z2 = z11;
            }
        }
        if (this.u0 == 8 && !this.v0 && !d0()) {
            boolean[] zArr = this.a0;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z13 = this.f57656p;
        if (z13 || this.f57657q) {
            if (z13) {
                sdaVar.m48240f(fzfVarM48251q, this.h0);
                sdaVar.m48240f(fzfVarM48251q2, this.h0 + this.d0);
                if (z2 && (zt3Var2 = this.c0) != null) {
                    if (this.f57651k) {
                        au3 au3Var = (au3) zt3Var2;
                        au3Var.E1(this.f57631Q);
                        au3Var.D1(this.f57633S);
                    } else {
                        sdaVar.m48242h(sdaVar.m48251q(zt3Var2.f57633S), fzfVarM48251q2, 0, 5);
                    }
                }
            }
            if (this.f57657q) {
                sdaVar.m48240f(fzfVarM48251q3, this.i0);
                sdaVar.m48240f(fzfVarM48251q4, this.i0 + this.e0);
                if (this.f57635U.m50480m()) {
                    sdaVar.m48240f(fzfVarM48251q5, this.i0 + this.n0);
                }
                if (z3 && (zt3Var = this.c0) != null) {
                    if (this.f57651k) {
                        au3 au3Var2 = (au3) zt3Var;
                        au3Var2.J1(this.f57632R);
                        au3Var2.I1(this.f57634T);
                    } else {
                        sdaVar.m48242h(sdaVar.m48251q(zt3Var.f57634T), fzfVarM48251q4, 0, 5);
                    }
                }
            }
            if (this.f57656p && this.f57657q) {
                this.f57656p = false;
                this.f57657q = false;
                return;
            }
        }
        boolean z14 = sda.f45258s;
        if (z && (x08Var2 = this.f57645e) != null && (buiVar = this.f57646f) != null) {
            em5 em5Var = x08Var2.f43168h;
            if (em5Var.f21869j && x08Var2.f43169i.f21869j && buiVar.f43168h.f21869j && buiVar.f43169i.f21869j) {
                sdaVar.m48240f(fzfVarM48251q, em5Var.f21866g);
                sdaVar.m48240f(fzfVarM48251q2, this.f57645e.f43169i.f21866g);
                sdaVar.m48240f(fzfVarM48251q3, this.f57646f.f43168h.f21866g);
                sdaVar.m48240f(fzfVarM48251q4, this.f57646f.f43169i.f21866g);
                sdaVar.m48240f(fzfVarM48251q5, this.f57646f.f16845k.f21866g);
                if (this.c0 != null) {
                    if (z2 && this.f57647g[0] && !k0()) {
                        sdaVar.m48242h(sdaVar.m48251q(this.c0.f57633S), fzfVarM48251q2, 0, 8);
                    }
                    if (z3 && this.f57647g[1] && !m0()) {
                        sdaVar.m48242h(sdaVar.m48251q(this.c0.f57634T), fzfVarM48251q4, 0, 8);
                    }
                }
                this.f57656p = false;
                this.f57657q = false;
                return;
            }
        }
        if (this.c0 != null) {
            if (h0(0)) {
                ((au3) this.c0).A1(this, 0);
                zK0 = true;
            } else {
                zK0 = k0();
            }
            if (h0(1)) {
                ((au3) this.c0).A1(this, 1);
                zM0 = true;
            } else {
                zM0 = m0();
            }
            if (!zK0 && z2 && this.u0 != 8 && this.f57631Q.f47687f == null && this.f57633S.f47687f == null) {
                sdaVar.m48242h(sdaVar.m48251q(this.c0.f57633S), fzfVarM48251q2, 0, 1);
            }
            if (!zM0 && z3 && this.u0 != 8 && this.f57632R.f47687f == null && this.f57634T.f47687f == null && this.f57635U == null) {
                sdaVar.m48242h(sdaVar.m48251q(this.c0.f57634T), fzfVarM48251q4, 0, 1);
            }
            z5 = zK0;
            z4 = zM0;
        } else {
            z4 = false;
            z5 = false;
        }
        int i13 = this.d0;
        int i14 = this.o0;
        if (i13 >= i14) {
            i14 = i13;
        }
        int i15 = this.e0;
        int i16 = this.p0;
        if (i15 >= i16) {
            i16 = i15;
        }
        EnumC18702b[] enumC18702bArr = this.b0;
        EnumC18702b enumC18702b4 = enumC18702bArr[0];
        EnumC18702b enumC18702b5 = EnumC18702b.MATCH_CONSTRAINT;
        int i17 = i14;
        boolean z15 = enumC18702b4 != enumC18702b5;
        EnumC18702b enumC18702b6 = enumC18702bArr[1];
        int i18 = i16;
        boolean z16 = enumC18702b6 != enumC18702b5;
        int i19 = this.g0;
        this.f57622H = i19;
        float f = this.f0;
        this.f57623I = f;
        int i20 = this.f57663w;
        int i21 = this.f57664x;
        if (f > 0.0f && this.u0 != 8) {
            if (enumC18702b4 == enumC18702b5 && i20 == 0) {
                i20 = 3;
            }
            if (enumC18702b6 == enumC18702b5 && i21 == 0) {
                i21 = 3;
            }
            if (enumC18702b4 == enumC18702b5 && enumC18702b6 == enumC18702b5) {
                i11 = 3;
                if (i20 == 3 && i21 == 3) {
                    t1(z2, z3, z15, z16);
                }
                i = i20;
                i2 = i21;
                i3 = i17;
                i4 = i18;
                z6 = true;
                int[] iArr = this.f57665y;
                iArr[0] = i;
                iArr[1] = i2;
                this.f57648h = z6;
                if (!z6) {
                    int i22 = this.f57622H;
                    i5 = -1;
                    boolean z17 = i22 == 0 || i22 == -1;
                    boolean z18 = z6 && ((i10 = this.f57622H) == 1 || i10 == i5);
                    EnumC18702b enumC18702b7 = this.b0[0];
                    enumC18702b = EnumC18702b.WRAP_CONTENT;
                    boolean z19 = enumC18702b7 == enumC18702b && (this instanceof au3);
                    int i23 = z19 ? 0 : i3;
                    boolean z20 = !this.f57638X.m50482o();
                    boolean[] zArr2 = this.a0;
                    boolean z21 = zArr2[0];
                    boolean z22 = zArr2[1];
                    if (this.f57660t == 2 || this.f57656p) {
                        z7 = z2;
                        z8 = z3;
                        enumC18702b2 = enumC18702b5;
                        enumC18702b3 = enumC18702b;
                        fzfVar = fzfVarM48251q5;
                        fzfVar2 = fzfVarM48251q4;
                        fzfVar3 = fzfVarM48251q3;
                        fzfVar4 = fzfVarM48251q2;
                        fzfVar5 = fzfVarM48251q;
                        z9 = z6;
                    } else if (!z || (x08Var = this.f57645e) == null) {
                        zt3 zt3Var6 = this.c0;
                        fzf fzfVarM48251q6 = zt3Var6 != null ? sdaVar.m48251q(zt3Var6.f57633S) : null;
                        zt3 zt3Var7 = this.c0;
                        fzf fzfVarM48251q7 = zt3Var7 != null ? sdaVar.m48251q(zt3Var7.f57631Q) : null;
                        boolean z23 = this.f57647g[0];
                        EnumC18702b[] enumC18702bArr2 = this.b0;
                        z7 = z2;
                        z8 = z3;
                        enumC18702b2 = enumC18702b5;
                        fzfVar = fzfVarM48251q5;
                        fzfVar2 = fzfVarM48251q4;
                        fzfVar3 = fzfVarM48251q3;
                        fzfVar4 = fzfVarM48251q2;
                        enumC18702b3 = enumC18702b;
                        fzfVar5 = fzfVarM48251q;
                        z9 = z6;
                        m59851i(sdaVar, true, z2, z3, z23, fzfVarM48251q7, fzfVarM48251q6, enumC18702bArr2[0], z19, this.f57631Q, this.f57633S, this.h0, i23, this.o0, this.f57624J[0], this.q0, z17, enumC18702bArr2[1] == enumC18702b5, z5, z4, z21, i, i2, this.f57666z, this.f57615A, this.f57616B, z20);
                    } else {
                        em5 em5Var2 = x08Var.f43168h;
                        if (em5Var2.f21869j && x08Var.f43169i.f21869j) {
                            if (z) {
                                sdaVar.m48240f(fzfVarM48251q, em5Var2.f21866g);
                                sdaVar.m48240f(fzfVarM48251q2, this.f57645e.f43169i.f21866g);
                                if (this.c0 != null && z2 && this.f57647g[0] && !k0()) {
                                    sdaVar.m48242h(sdaVar.m48251q(this.c0.f57633S), fzfVarM48251q2, 0, 8);
                                }
                                z7 = z2;
                                z8 = z3;
                                enumC18702b2 = enumC18702b5;
                                enumC18702b3 = enumC18702b;
                                z9 = z6;
                                fzfVar = fzfVarM48251q5;
                                fzfVar2 = fzfVarM48251q4;
                                fzfVar3 = fzfVarM48251q3;
                                fzfVar4 = fzfVarM48251q2;
                                fzfVar5 = fzfVarM48251q;
                            } else {
                                z7 = z2;
                                z8 = z3;
                                enumC18702b2 = enumC18702b5;
                                enumC18702b3 = enumC18702b;
                                fzfVar = fzfVarM48251q5;
                                fzfVar2 = fzfVarM48251q4;
                                fzfVar3 = fzfVarM48251q3;
                                fzfVar4 = fzfVarM48251q2;
                                fzfVar5 = fzfVarM48251q;
                                z9 = z6;
                            }
                        }
                    }
                    if (z) {
                        zt3Var3 = this;
                        bui buiVar2 = zt3Var3.f57646f;
                        if (buiVar2 != null) {
                            em5 em5Var3 = buiVar2.f43168h;
                            if (em5Var3.f21869j && buiVar2.f43169i.f21869j) {
                                sdaVar2 = sdaVar;
                                fzfVar8 = fzfVar3;
                                sdaVar2.m48240f(fzfVar8, em5Var3.f21866g);
                                fzfVar7 = fzfVar2;
                                sdaVar2.m48240f(fzfVar7, zt3Var3.f57646f.f43169i.f21866g);
                                fzfVar6 = fzfVar;
                                sdaVar2.m48240f(fzfVar6, zt3Var3.f57646f.f16845k.f21866g);
                                zt3 zt3Var8 = zt3Var3.c0;
                                if (zt3Var8 == null || z4 || !z8) {
                                    i6 = 8;
                                    i7 = 0;
                                    i8 = 1;
                                } else {
                                    i8 = 1;
                                    if (zt3Var3.f57647g[1]) {
                                        i6 = 8;
                                        i7 = 0;
                                        sdaVar2.m48242h(sdaVar2.m48251q(zt3Var8.f57634T), fzfVar7, 0, 8);
                                    } else {
                                        i6 = 8;
                                        i7 = 0;
                                    }
                                }
                                i9 = i7;
                                if ((zt3Var3.f57661u != 2 ? i7 : i9) != 0 || zt3Var3.f57657q) {
                                    fzfVar9 = fzfVar7;
                                    fzfVar10 = fzfVar8;
                                } else {
                                    boolean z24 = (zt3Var3.b0[i8] == enumC18702b3 && (zt3Var3 instanceof au3)) ? i8 : i7;
                                    if (z24) {
                                        i4 = i7;
                                    }
                                    zt3 zt3Var9 = zt3Var3.c0;
                                    fzf fzfVarM48251q8 = zt3Var9 != null ? sdaVar2.m48251q(zt3Var9.f57634T) : null;
                                    zt3 zt3Var10 = zt3Var3.c0;
                                    fzf fzfVarM48251q9 = zt3Var10 != null ? sdaVar2.m48251q(zt3Var10.f57632R) : null;
                                    if (zt3Var3.n0 > 0 || zt3Var3.u0 == i6) {
                                        tt3 tt3Var = zt3Var3.f57635U;
                                        if (tt3Var.f47687f != null) {
                                            sdaVar2.m48239e(fzfVar6, fzfVar8, m59858r(), i6);
                                            sdaVar2.m48239e(fzfVar6, sdaVar2.m48251q(zt3Var3.f57635U.f47687f), zt3Var3.f57635U.m50473f(), i6);
                                            if (z8) {
                                                sdaVar2.m48242h(fzfVarM48251q8, sdaVar2.m48251q(zt3Var3.f57634T), i7, 5);
                                            }
                                            z10 = i7;
                                            boolean z25 = zt3Var3.f57647g[i8];
                                            EnumC18702b[] enumC18702bArr3 = zt3Var3.b0;
                                            fzfVar9 = fzfVar7;
                                            fzfVar10 = fzfVar8;
                                            m59851i(sdaVar, false, z8, z7, z25, fzfVarM48251q9, fzfVarM48251q8, enumC18702bArr3[i8], z24, zt3Var3.f57632R, zt3Var3.f57634T, zt3Var3.i0, i4, zt3Var3.p0, zt3Var3.f57624J[i8], zt3Var3.r0, z18, enumC18702bArr3[0] == enumC18702b2, z4, z5, z22, i2, i, zt3Var3.f57617C, zt3Var3.f57618D, zt3Var3.f57619E, z10);
                                        } else {
                                            if (zt3Var3.u0 == i6) {
                                                sdaVar2.m48239e(fzfVar6, fzfVar8, tt3Var.m50473f(), i6);
                                            } else {
                                                sdaVar2.m48239e(fzfVar6, fzfVar8, m59858r(), i6);
                                            }
                                            z10 = z20;
                                            boolean z252 = zt3Var3.f57647g[i8];
                                            EnumC18702b[] enumC18702bArr32 = zt3Var3.b0;
                                            fzfVar9 = fzfVar7;
                                            fzfVar10 = fzfVar8;
                                            m59851i(sdaVar, false, z8, z7, z252, fzfVarM48251q9, fzfVarM48251q8, enumC18702bArr32[i8], z24, zt3Var3.f57632R, zt3Var3.f57634T, zt3Var3.i0, i4, zt3Var3.p0, zt3Var3.f57624J[i8], zt3Var3.r0, z18, enumC18702bArr32[0] == enumC18702b2, z4, z5, z22, i2, i, zt3Var3.f57617C, zt3Var3.f57618D, zt3Var3.f57619E, z10);
                                        }
                                    } else {
                                        z10 = z20;
                                        boolean z2522 = zt3Var3.f57647g[i8];
                                        EnumC18702b[] enumC18702bArr322 = zt3Var3.b0;
                                        fzfVar9 = fzfVar7;
                                        fzfVar10 = fzfVar8;
                                        m59851i(sdaVar, false, z8, z7, z2522, fzfVarM48251q9, fzfVarM48251q8, enumC18702bArr322[i8], z24, zt3Var3.f57632R, zt3Var3.f57634T, zt3Var3.i0, i4, zt3Var3.p0, zt3Var3.f57624J[i8], zt3Var3.r0, z18, enumC18702bArr322[0] == enumC18702b2, z4, z5, z22, i2, i, zt3Var3.f57617C, zt3Var3.f57618D, zt3Var3.f57619E, z10);
                                    }
                                }
                                if (z9) {
                                    zt3Var4 = this;
                                } else {
                                    zt3Var4 = this;
                                    if (zt3Var4.f57622H == 1) {
                                        sdaVar.m48245k(fzfVar9, fzfVar10, fzfVar4, fzfVar5, zt3Var4.f57623I, 8);
                                    } else {
                                        sdaVar.m48245k(fzfVar4, fzfVar5, fzfVar9, fzfVar10, zt3Var4.f57623I, 8);
                                    }
                                }
                                if (zt3Var4.f57638X.m50482o()) {
                                    sdaVar.m48236b(zt3Var4, zt3Var4.f57638X.m50477j().m50475h(), (float) Math.toRadians(zt3Var4.f57625K + 90.0f), zt3Var4.f57638X.m50473f());
                                }
                                zt3Var4.f57656p = false;
                                zt3Var4.f57657q = false;
                            }
                        }
                        sdaVar2 = sdaVar;
                        fzfVar6 = fzfVar;
                        fzfVar7 = fzfVar2;
                        fzfVar8 = fzfVar3;
                        i6 = 8;
                        i7 = 0;
                        i8 = 1;
                    } else {
                        i6 = 8;
                        i7 = 0;
                        i8 = 1;
                        zt3Var3 = this;
                        sdaVar2 = sdaVar;
                        fzfVar6 = fzfVar;
                        fzfVar7 = fzfVar2;
                        fzfVar8 = fzfVar3;
                    }
                    i9 = i8;
                    if ((zt3Var3.f57661u != 2 ? i7 : i9) != 0) {
                        fzfVar9 = fzfVar7;
                        fzfVar10 = fzfVar8;
                    }
                    if (z9) {
                    }
                    if (zt3Var4.f57638X.m50482o()) {
                    }
                    zt3Var4.f57656p = false;
                    zt3Var4.f57657q = false;
                }
                i5 = -1;
                if (z6) {
                }
                EnumC18702b enumC18702b72 = this.b0[0];
                enumC18702b = EnumC18702b.WRAP_CONTENT;
                if (enumC18702b72 == enumC18702b) {
                }
                if (z19) {
                }
                boolean z202 = !this.f57638X.m50482o();
                boolean[] zArr22 = this.a0;
                boolean z212 = zArr22[0];
                boolean z222 = zArr22[1];
                if (this.f57660t == 2) {
                    z7 = z2;
                    z8 = z3;
                    enumC18702b2 = enumC18702b5;
                    enumC18702b3 = enumC18702b;
                    fzfVar = fzfVarM48251q5;
                    fzfVar2 = fzfVarM48251q4;
                    fzfVar3 = fzfVarM48251q3;
                    fzfVar4 = fzfVarM48251q2;
                    fzfVar5 = fzfVarM48251q;
                    z9 = z6;
                }
                if (z) {
                }
                i9 = i8;
                if ((zt3Var3.f57661u != 2 ? i7 : i9) != 0) {
                }
                if (z9) {
                }
                if (zt3Var4.f57638X.m50482o()) {
                }
                zt3Var4.f57656p = false;
                zt3Var4.f57657q = false;
            }
            i11 = 3;
            if (enumC18702b4 == enumC18702b5 && i20 == i11) {
                this.f57622H = 0;
                int i24 = (int) (f * i15);
                if (enumC18702b6 != enumC18702b5) {
                    i = 4;
                    i2 = i21;
                    i4 = i18;
                    z6 = false;
                    i3 = i24;
                    int[] iArr2 = this.f57665y;
                    iArr2[0] = i;
                    iArr2[1] = i2;
                    this.f57648h = z6;
                    if (!z6) {
                    }
                    if (z6) {
                    }
                    EnumC18702b enumC18702b722 = this.b0[0];
                    enumC18702b = EnumC18702b.WRAP_CONTENT;
                    if (enumC18702b722 == enumC18702b) {
                    }
                    if (z19) {
                    }
                    boolean z2022 = !this.f57638X.m50482o();
                    boolean[] zArr222 = this.a0;
                    boolean z2122 = zArr222[0];
                    boolean z2222 = zArr222[1];
                    if (this.f57660t == 2) {
                    }
                    if (z) {
                    }
                    i9 = i8;
                    if ((zt3Var3.f57661u != 2 ? i7 : i9) != 0) {
                    }
                    if (z9) {
                    }
                    if (zt3Var4.f57638X.m50482o()) {
                    }
                    zt3Var4.f57656p = false;
                    zt3Var4.f57657q = false;
                }
                i3 = i24;
                i = i20;
                i2 = i21;
                i4 = i18;
                z6 = true;
                int[] iArr22 = this.f57665y;
                iArr22[0] = i;
                iArr22[1] = i2;
                this.f57648h = z6;
                if (!z6) {
                }
                if (z6) {
                }
                EnumC18702b enumC18702b7222 = this.b0[0];
                enumC18702b = EnumC18702b.WRAP_CONTENT;
                if (enumC18702b7222 == enumC18702b) {
                }
                if (z19) {
                }
                boolean z20222 = !this.f57638X.m50482o();
                boolean[] zArr2222 = this.a0;
                boolean z21222 = zArr2222[0];
                boolean z22222 = zArr2222[1];
                if (this.f57660t == 2) {
                }
                if (z) {
                }
                i9 = i8;
                if ((zt3Var3.f57661u != 2 ? i7 : i9) != 0) {
                }
                if (z9) {
                }
                if (zt3Var4.f57638X.m50482o()) {
                }
                zt3Var4.f57656p = false;
                zt3Var4.f57657q = false;
            }
            if (enumC18702b6 == enumC18702b5 && i21 == i11) {
                this.f57622H = 1;
                if (i19 == -1) {
                    this.f57623I = 1.0f / f;
                }
                int i25 = (int) (this.f57623I * i13);
                if (enumC18702b4 == enumC18702b5) {
                    i4 = i25;
                    i = i20;
                    i2 = i21;
                    i3 = i17;
                    z6 = true;
                    int[] iArr222 = this.f57665y;
                    iArr222[0] = i;
                    iArr222[1] = i2;
                    this.f57648h = z6;
                    if (!z6) {
                    }
                    if (z6) {
                    }
                    EnumC18702b enumC18702b72222 = this.b0[0];
                    enumC18702b = EnumC18702b.WRAP_CONTENT;
                    if (enumC18702b72222 == enumC18702b) {
                    }
                    if (z19) {
                    }
                    boolean z202222 = !this.f57638X.m50482o();
                    boolean[] zArr22222 = this.a0;
                    boolean z212222 = zArr22222[0];
                    boolean z222222 = zArr22222[1];
                    if (this.f57660t == 2) {
                    }
                    if (z) {
                    }
                    i9 = i8;
                    if ((zt3Var3.f57661u != 2 ? i7 : i9) != 0) {
                    }
                    if (z9) {
                    }
                    if (zt3Var4.f57638X.m50482o()) {
                    }
                    zt3Var4.f57656p = false;
                    zt3Var4.f57657q = false;
                }
                i2 = 4;
                i4 = i25;
                i = i20;
                i3 = i17;
            }
            i = i20;
            i2 = i21;
            i3 = i17;
            i4 = i18;
            z6 = true;
            int[] iArr2222 = this.f57665y;
            iArr2222[0] = i;
            iArr2222[1] = i2;
            this.f57648h = z6;
            if (!z6) {
            }
            if (z6) {
            }
            EnumC18702b enumC18702b722222 = this.b0[0];
            enumC18702b = EnumC18702b.WRAP_CONTENT;
            if (enumC18702b722222 == enumC18702b) {
            }
            if (z19) {
            }
            boolean z2022222 = !this.f57638X.m50482o();
            boolean[] zArr222222 = this.a0;
            boolean z2122222 = zArr222222[0];
            boolean z2222222 = zArr222222[1];
            if (this.f57660t == 2) {
            }
            if (z) {
            }
            i9 = i8;
            if ((zt3Var3.f57661u != 2 ? i7 : i9) != 0) {
            }
            if (z9) {
            }
            if (zt3Var4.f57638X.m50482o()) {
            }
            zt3Var4.f57656p = false;
            zt3Var4.f57657q = false;
        }
        i = i20;
        i2 = i21;
        i3 = i17;
        i4 = i18;
        z6 = false;
        int[] iArr22222 = this.f57665y;
        iArr22222[0] = i;
        iArr22222[1] = i2;
        this.f57648h = z6;
        if (!z6) {
        }
        if (z6) {
        }
        EnumC18702b enumC18702b7222222 = this.b0[0];
        enumC18702b = EnumC18702b.WRAP_CONTENT;
        if (enumC18702b7222222 == enumC18702b) {
        }
        if (z19) {
        }
        boolean z20222222 = !this.f57638X.m50482o();
        boolean[] zArr2222222 = this.a0;
        boolean z21222222 = zArr2222222[0];
        boolean z22222222 = zArr2222222[1];
        if (this.f57660t == 2) {
        }
        if (z) {
        }
        i9 = i8;
        if ((zt3Var3.f57661u != 2 ? i7 : i9) != 0) {
        }
        if (z9) {
        }
        if (zt3Var4.f57638X.m50482o()) {
        }
        zt3Var4.f57656p = false;
        zt3Var4.f57657q = false;
    }

    public void g0(tt3.EnumC17197a enumC17197a, zt3 zt3Var, tt3.EnumC17197a enumC17197a2, int i, int i2) {
        mo47185q(enumC17197a).m50469b(zt3Var.mo47185q(enumC17197a2), i, i2, true);
    }

    public void g1(int i, int i2) {
        this.h0 = i;
        this.i0 = i2;
    }

    /* renamed from: h */
    public boolean mo47184h() {
        return this.u0 != 8;
    }

    public final boolean h0(int i) {
        tt3 tt3Var;
        tt3 tt3Var2;
        int i2 = i * 2;
        tt3[] tt3VarArr = this.f57639Y;
        tt3 tt3Var3 = tt3VarArr[i2];
        tt3 tt3Var4 = tt3Var3.f47687f;
        return (tt3Var4 == null || tt3Var4.f47687f == tt3Var3 || (tt3Var2 = (tt3Var = tt3VarArr[i2 + 1]).f47687f) == null || tt3Var2.f47687f != tt3Var) ? false : true;
    }

    public void h1(zt3 zt3Var) {
        this.c0 = zt3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x057b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:384:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m59851i(sda sdaVar, boolean z, boolean z2, boolean z3, boolean z4, fzf fzfVar, fzf fzfVar2, EnumC18702b enumC18702b, boolean z5, tt3 tt3Var, tt3 tt3Var2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        fzf fzfVar3;
        boolean z12;
        int iMin;
        int i10;
        int i11;
        int i12;
        fzf fzfVar4;
        fzf fzfVar5;
        fzf fzfVar6;
        boolean z13;
        boolean z14;
        int i13;
        fzf fzfVarM48251q;
        fzf fzfVarM48251q2;
        tt3 tt3Var3;
        int iM50473f;
        int i14;
        boolean z15;
        int i15;
        fzf fzfVar7;
        char c;
        char c2;
        boolean z16;
        boolean z17;
        int i16;
        int i17;
        int i18;
        fzf fzfVar8;
        int iM50473f2;
        boolean z18;
        boolean z19;
        zt3 zt3Var;
        zt3 zt3Var2;
        boolean z20;
        zt3 zt3Var3;
        fzf fzfVar9;
        int i19;
        int i20;
        int i21;
        boolean z21;
        boolean z22;
        zt3 zt3Var4;
        zt3 zt3Var5;
        fzf fzfVar10;
        int i22;
        int i23;
        int iMin2;
        int i24;
        int i25;
        int i26;
        boolean z23;
        int i27;
        int i28;
        boolean z24;
        int i29;
        int i30;
        boolean z25;
        boolean z26;
        zt3 zt3Var6;
        int i31;
        zt3 zt3Var7;
        int i32 = i8;
        fzf fzfVarM48251q3 = sdaVar.m48251q(tt3Var);
        fzf fzfVarM48251q4 = sdaVar.m48251q(tt3Var2);
        fzf fzfVarM48251q5 = sdaVar.m48251q(tt3Var.m50477j());
        fzf fzfVarM48251q6 = sdaVar.m48251q(tt3Var2.m50477j());
        sda.m48229x();
        boolean zM50482o = tt3Var.m50482o();
        boolean zM50482o2 = tt3Var2.m50482o();
        boolean zM50482o3 = this.f57638X.m50482o();
        int i33 = zM50482o2 ? (zM50482o ? 1 : 0) + 1 : zM50482o ? 1 : 0;
        if (zM50482o3) {
            i33++;
        }
        if (z6) {
            fzfVar3 = fzfVarM48251q6;
            i9 = 3;
        } else {
            i9 = i5;
            fzfVar3 = fzfVarM48251q6;
        }
        int iOrdinal = enumC18702b.ordinal();
        boolean z27 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i9 == 4) ? false : true;
        int i34 = this.f57652l;
        if (i34 != -1 && z) {
            this.f57652l = -1;
            i2 = i34;
            z27 = false;
        }
        int i35 = this.f57653m;
        if (i35 == -1 || z) {
            i35 = i2;
        } else {
            this.f57653m = -1;
            z27 = false;
        }
        int i36 = i35;
        if (this.u0 == 8) {
            iMin = 0;
            z12 = false;
        } else {
            z12 = z27;
            iMin = i36;
        }
        if (z11) {
            if (!zM50482o && !zM50482o2 && !zM50482o3) {
                sdaVar.m48240f(fzfVarM48251q3, i);
            } else if (zM50482o && !zM50482o2) {
                i10 = 8;
                sdaVar.m48239e(fzfVarM48251q3, fzfVarM48251q5, tt3Var.m50473f(), 8);
            }
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (!z12) {
            if (z5) {
                sdaVar.m48239e(fzfVarM48251q4, fzfVarM48251q3, 0, 3);
                if (i3 > 0) {
                    sdaVar.m48242h(fzfVarM48251q4, fzfVarM48251q3, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    sdaVar.m48244j(fzfVarM48251q4, fzfVarM48251q3, i4, 8);
                }
            } else {
                sdaVar.m48239e(fzfVarM48251q4, fzfVarM48251q3, iMin, i10);
            }
            i13 = i7;
        } else {
            if (i33 != 2 && !z6 && (i9 == 1 || i9 == 0)) {
                int iMax = Math.max(i7, iMin);
                if (i32 > 0) {
                    iMax = Math.min(i32, iMax);
                }
                sdaVar.m48239e(fzfVarM48251q4, fzfVarM48251q3, iMax, 8);
                i13 = i7;
                i12 = i33;
                fzfVar4 = fzfVarM48251q5;
                fzfVar5 = fzfVarM48251q4;
                fzfVar6 = fzfVar3;
                z13 = false;
                z14 = z4;
                if (z11) {
                }
                if (i12 < 2) {
                    return;
                } else {
                    return;
                }
            }
            int i37 = i7 == -2 ? iMin : i7;
            int i38 = i32 == -2 ? iMin : i32;
            if (iMin > 0 && i9 != 1) {
                iMin = 0;
            }
            if (i37 > 0) {
                sdaVar.m48242h(fzfVarM48251q4, fzfVarM48251q3, i37, 8);
                iMin = Math.max(iMin, i37);
            }
            if (i38 > 0) {
                if ((z2 && i9 == 1) ? false : true) {
                    i11 = 8;
                    sdaVar.m48244j(fzfVarM48251q4, fzfVarM48251q3, i38, 8);
                } else {
                    i11 = 8;
                }
                iMin = Math.min(iMin, i38);
            } else {
                i11 = 8;
            }
            if (i9 != 1) {
                if (i9 == 2) {
                    tt3.EnumC17197a enumC17197aM50478k = tt3Var.m50478k();
                    tt3.EnumC17197a enumC17197a = tt3.EnumC17197a.TOP;
                    if (enumC17197aM50478k == enumC17197a || tt3Var.m50478k() == tt3.EnumC17197a.BOTTOM) {
                        fzfVarM48251q = sdaVar.m48251q(this.c0.mo47185q(enumC17197a));
                        fzfVarM48251q2 = sdaVar.m48251q(this.c0.mo47185q(tt3.EnumC17197a.BOTTOM));
                    } else {
                        fzfVarM48251q = sdaVar.m48251q(this.c0.mo47185q(tt3.EnumC17197a.LEFT));
                        fzfVarM48251q2 = sdaVar.m48251q(this.c0.mo47185q(tt3.EnumC17197a.RIGHT));
                    }
                    int i39 = i38;
                    i12 = i33;
                    boolean z28 = z12;
                    fzfVar6 = fzfVar3;
                    fzfVar4 = fzfVarM48251q5;
                    fzfVar5 = fzfVarM48251q4;
                    sdaVar.m48238d(sdaVar.m48252r().m59647k(fzfVarM48251q4, fzfVarM48251q3, fzfVarM48251q2, fzfVarM48251q, f2));
                    if (z2) {
                        z28 = false;
                    }
                    z14 = z4;
                    i32 = i39;
                    z13 = z28;
                } else {
                    int i40 = i38;
                    i12 = i33;
                    fzfVar4 = fzfVarM48251q5;
                    fzfVar5 = fzfVarM48251q4;
                    boolean z29 = z12;
                    fzfVar6 = fzfVar3;
                    i32 = i40;
                    z13 = z29;
                    z14 = true;
                }
                i13 = i37;
                if (z11 || z8) {
                    if (i12 < 2 && z2 && z14) {
                        sdaVar.m48242h(fzfVarM48251q3, fzfVar, 0, 8);
                        Object[] objArr = z || this.f57635U.f47687f == null;
                        if (!z && (tt3Var3 = this.f57635U.f47687f) != null) {
                            zt3 zt3Var8 = tt3Var3.f47685d;
                            if (zt3Var8.f0 != 0.0f) {
                                EnumC18702b[] enumC18702bArr = zt3Var8.b0;
                                EnumC18702b enumC18702b2 = enumC18702bArr[0];
                                EnumC18702b enumC18702b3 = EnumC18702b.MATCH_CONSTRAINT;
                                objArr = enumC18702b2 == enumC18702b3 && enumC18702bArr[1] == enumC18702b3;
                            }
                        }
                        if (objArr == true) {
                            sdaVar.m48242h(fzfVar2, fzfVar5, 0, 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (zM50482o || zM50482o2 || zM50482o3) {
                    if (!zM50482o || zM50482o2) {
                        if (!zM50482o && zM50482o2) {
                            sdaVar.m48239e(fzfVar5, fzfVar6, -tt3Var2.m50473f(), 8);
                            if (!z2) {
                                i14 = 5;
                                iM50473f = 0;
                            } else if (this.f57650j && fzfVarM48251q3.f24299g && (zt3Var6 = this.c0) != null) {
                                au3 au3Var = (au3) zt3Var6;
                                if (z) {
                                    au3Var.E1(tt3Var);
                                } else {
                                    au3Var.J1(tt3Var);
                                }
                                i14 = 5;
                                iM50473f = 0;
                            } else {
                                sdaVar.m48242h(fzfVarM48251q3, fzfVar, 0, 5);
                                i14 = 5;
                                iM50473f = 0;
                            }
                        } else if (zM50482o && zM50482o2) {
                            zt3 zt3Var9 = tt3Var.f47687f.f47685d;
                            zt3 zt3Var10 = tt3Var2.f47687f.f47685d;
                            zt3 zt3VarM59835M = m59835M();
                            if (z13) {
                                if (i9 == 0) {
                                    if (i32 != 0 || i13 != 0) {
                                        z24 = false;
                                        i29 = 5;
                                        i30 = 5;
                                        z25 = true;
                                        z26 = true;
                                    } else if (fzfVar4.f24299g && fzfVar6.f24299g) {
                                        sdaVar.m48239e(fzfVarM48251q3, fzfVar4, tt3Var.m50473f(), 8);
                                        sdaVar.m48239e(fzfVar5, fzfVar6, -tt3Var2.m50473f(), 8);
                                        return;
                                    } else {
                                        i29 = 8;
                                        i30 = 8;
                                        z25 = false;
                                        z26 = false;
                                        z24 = true;
                                    }
                                    if ((zt3Var9 instanceof ya1) || (zt3Var10 instanceof ya1)) {
                                        fzfVar7 = fzfVar2;
                                        i16 = 6;
                                        z17 = z25;
                                        z18 = z24;
                                        z16 = z26;
                                        z15 = true;
                                        i15 = 8;
                                        c2 = 5;
                                        i18 = 4;
                                    } else {
                                        fzfVar7 = fzfVar2;
                                        i16 = 6;
                                        i18 = i30;
                                        z17 = z25;
                                        z18 = z24;
                                        z16 = z26;
                                        z15 = true;
                                        i15 = 8;
                                        c2 = 5;
                                    }
                                    i17 = i29;
                                    c = 3;
                                } else {
                                    i15 = 8;
                                    if (i9 == 2) {
                                        if ((zt3Var9 instanceof ya1) || (zt3Var10 instanceof ya1)) {
                                            fzfVar7 = fzfVar2;
                                            z18 = false;
                                            i16 = 6;
                                            c = 3;
                                            z15 = true;
                                            c2 = 5;
                                            i18 = 4;
                                        } else {
                                            fzfVar7 = fzfVar2;
                                            z18 = false;
                                            i16 = 6;
                                            c = 3;
                                            z15 = true;
                                            c2 = 5;
                                            i18 = 5;
                                        }
                                        i17 = 5;
                                    } else if (i9 == 1) {
                                        fzfVar7 = fzfVar2;
                                        z18 = false;
                                        i16 = 6;
                                        i17 = 8;
                                        c = 3;
                                        z15 = true;
                                        c2 = 5;
                                        i18 = 4;
                                    } else {
                                        c = 3;
                                        if (i9 != 3) {
                                            z15 = true;
                                            fzfVar7 = fzfVar2;
                                            i16 = 6;
                                            c2 = 5;
                                            i18 = 4;
                                            i17 = 5;
                                            z16 = false;
                                            z17 = false;
                                        } else if (this.f57622H == -1) {
                                            if (z9) {
                                                fzfVar7 = fzfVar2;
                                                i17 = 8;
                                                c = 3;
                                                z15 = true;
                                                c2 = 5;
                                                i16 = z2 ? 5 : 4;
                                            } else {
                                                fzfVar7 = fzfVar2;
                                                i16 = 8;
                                                i17 = 8;
                                                c = 3;
                                                z15 = true;
                                                c2 = 5;
                                            }
                                            i18 = 5;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        } else if (z6) {
                                            if (i6 != 2) {
                                                z15 = true;
                                                if (i6 != 1) {
                                                    z23 = false;
                                                }
                                                if (z23) {
                                                    i27 = 8;
                                                    i28 = 5;
                                                } else {
                                                    i27 = 5;
                                                    i28 = 4;
                                                }
                                                i17 = i27;
                                                i18 = i28;
                                                z16 = z15;
                                                z17 = z16;
                                                z18 = z17;
                                                i16 = 6;
                                                c = 3;
                                                c2 = 5;
                                                fzfVar7 = fzfVar2;
                                            } else {
                                                z15 = true;
                                            }
                                            z23 = z15;
                                            if (z23) {
                                            }
                                            i17 = i27;
                                            i18 = i28;
                                            z16 = z15;
                                            z17 = z16;
                                            z18 = z17;
                                            i16 = 6;
                                            c = 3;
                                            c2 = 5;
                                            fzfVar7 = fzfVar2;
                                        } else {
                                            z15 = true;
                                            if (i32 > 0) {
                                                fzfVar7 = fzfVar2;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                                i16 = 6;
                                                c = 3;
                                                c2 = 5;
                                                i18 = 5;
                                            } else if (i32 != 0 || i13 != 0) {
                                                fzfVar7 = fzfVar2;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                                i16 = 6;
                                                c = 3;
                                                c2 = 5;
                                                i18 = 4;
                                            } else if (z9) {
                                                fzfVar7 = fzfVar2;
                                                i17 = (zt3Var9 == zt3VarM59835M || zt3Var10 == zt3VarM59835M) ? 5 : 4;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                                i16 = 6;
                                                c = 3;
                                                c2 = 5;
                                                i18 = 4;
                                            } else {
                                                fzfVar7 = fzfVar2;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                                i16 = 6;
                                                i18 = 8;
                                                c = 3;
                                                c2 = 5;
                                            }
                                            i17 = 5;
                                        }
                                    }
                                    z16 = true;
                                    z17 = true;
                                }
                                if (z16 || fzfVar4 != fzfVar6 || zt3Var9 == zt3VarM59835M) {
                                    z19 = z15;
                                } else {
                                    z16 = false;
                                    z19 = false;
                                }
                                if (z17) {
                                    zt3Var = zt3VarM59835M;
                                    zt3Var2 = zt3Var10;
                                    z20 = z15;
                                    zt3Var3 = zt3Var9;
                                    fzfVar9 = fzfVarM48251q3;
                                    i19 = i9;
                                    i20 = i15;
                                    i21 = 4;
                                    z21 = z2;
                                } else {
                                    if (z13 || z7 || z9 || fzfVar4 != fzfVar || fzfVar6 != fzfVar7) {
                                        i25 = i17;
                                        i26 = i16;
                                        z21 = z2;
                                    } else {
                                        i26 = i15;
                                        i25 = i26;
                                        z21 = false;
                                        z19 = false;
                                    }
                                    zt3Var = zt3VarM59835M;
                                    i19 = i9;
                                    i20 = i15;
                                    i21 = 4;
                                    z20 = z15;
                                    zt3Var2 = zt3Var10;
                                    zt3Var3 = zt3Var9;
                                    fzfVar9 = fzfVarM48251q3;
                                    sdaVar.m48237c(fzfVarM48251q3, fzfVar4, tt3Var.m50473f(), f, fzfVar6, fzfVar5, tt3Var2.m50473f(), i26);
                                    i17 = i25;
                                }
                                z22 = z19;
                                if (this.u0 != i20 && !tt3Var2.m50480m()) {
                                    return;
                                }
                                if (z16) {
                                    zt3Var4 = zt3Var2;
                                    zt3Var5 = zt3Var3;
                                    fzfVar10 = fzfVar9;
                                } else {
                                    if (!z21 || fzfVar4 == fzfVar6 || z13) {
                                        zt3Var4 = zt3Var2;
                                        zt3Var5 = zt3Var3;
                                    } else {
                                        zt3Var5 = zt3Var3;
                                        if (zt3Var5 instanceof ya1) {
                                            zt3Var4 = zt3Var2;
                                        } else {
                                            zt3Var4 = zt3Var2;
                                            if (zt3Var4 instanceof ya1) {
                                            }
                                            fzfVar10 = fzfVar9;
                                            sdaVar.m48242h(fzfVar10, fzfVar4, tt3Var.m50473f(), i24);
                                            sdaVar.m48244j(fzfVar5, fzfVar6, -tt3Var2.m50473f(), i24);
                                            i17 = i24;
                                        }
                                        i24 = 6;
                                        fzfVar10 = fzfVar9;
                                        sdaVar.m48242h(fzfVar10, fzfVar4, tt3Var.m50473f(), i24);
                                        sdaVar.m48244j(fzfVar5, fzfVar6, -tt3Var2.m50473f(), i24);
                                        i17 = i24;
                                    }
                                    i24 = i17;
                                    fzfVar10 = fzfVar9;
                                    sdaVar.m48242h(fzfVar10, fzfVar4, tt3Var.m50473f(), i24);
                                    sdaVar.m48244j(fzfVar5, fzfVar6, -tt3Var2.m50473f(), i24);
                                    i17 = i24;
                                }
                                if (z21 || !z10 || (zt3Var5 instanceof ya1) || (zt3Var4 instanceof ya1) || zt3Var4 == zt3Var) {
                                    i22 = i18;
                                    i23 = i17;
                                } else {
                                    i22 = 6;
                                    i23 = 6;
                                    z22 = z20;
                                }
                                if (z22) {
                                    if (!z18 || (z9 && !z3)) {
                                        iMin2 = i22;
                                    } else {
                                        int i41 = (zt3Var5 == zt3Var || zt3Var4 == zt3Var) ? 6 : i22;
                                        if ((zt3Var5 instanceof rv7) || (zt3Var4 instanceof rv7)) {
                                            i41 = 5;
                                        }
                                        if ((zt3Var5 instanceof ya1) || (zt3Var4 instanceof ya1)) {
                                            i41 = 5;
                                        }
                                        if (z9) {
                                            i41 = 5;
                                        }
                                        iMin2 = Math.max(i41, i22);
                                    }
                                    if (z21) {
                                        iMin2 = Math.min(i23, iMin2);
                                        if (z6 && !z9 && (zt3Var5 == zt3Var || zt3Var4 == zt3Var)) {
                                            iMin2 = i21;
                                        }
                                    }
                                    sdaVar.m48239e(fzfVar10, fzfVar4, tt3Var.m50473f(), iMin2);
                                    sdaVar.m48239e(fzfVar5, fzfVar6, -tt3Var2.m50473f(), iMin2);
                                }
                                if (z21) {
                                    int iM50473f3 = fzfVar == fzfVar4 ? tt3Var.m50473f() : 0;
                                    if (fzfVar4 != fzfVar) {
                                        i14 = 5;
                                        sdaVar.m48242h(fzfVar10, fzfVar, iM50473f3, 5);
                                    }
                                    if (z21) {
                                        iM50473f = 0;
                                        i31 = i14;
                                    }
                                } else {
                                    i14 = 5;
                                    if (z21 || !z13 || i3 != 0 || i13 != 0) {
                                        iM50473f = 0;
                                    } else if (z13 && i19 == 3) {
                                        iM50473f = 0;
                                        sdaVar.m48242h(fzfVar5, fzfVar10, 0, i20);
                                    } else {
                                        iM50473f = 0;
                                        sdaVar.m48242h(fzfVar5, fzfVar10, 0, i14);
                                    }
                                    i31 = i14;
                                }
                            } else {
                                z15 = true;
                                i15 = 8;
                                if (fzfVar4.f24299g && fzfVar6.f24299g) {
                                    sdaVar.m48237c(fzfVarM48251q3, fzfVar4, tt3Var.m50473f(), f, fzfVar6, fzfVar5, tt3Var2.m50473f(), 8);
                                    if (z2 && z14) {
                                        if (tt3Var2.f47687f != null) {
                                            iM50473f2 = tt3Var2.m50473f();
                                            fzfVar8 = fzfVar2;
                                        } else {
                                            fzfVar8 = fzfVar2;
                                            iM50473f2 = 0;
                                        }
                                        if (fzfVar6 != fzfVar8) {
                                            sdaVar.m48242h(fzfVar8, fzfVar5, iM50473f2, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                fzfVar7 = fzfVar2;
                                c = 3;
                                c2 = 5;
                                z16 = true;
                                z17 = true;
                                i16 = 6;
                                i17 = 5;
                                i18 = 4;
                            }
                            z18 = false;
                            if (z16) {
                                z19 = z15;
                                if (z17) {
                                }
                                z22 = z19;
                                if (this.u0 != i20) {
                                }
                                if (z16) {
                                }
                                if (z21) {
                                    i22 = i18;
                                    i23 = i17;
                                    if (z22) {
                                    }
                                    if (z21) {
                                    }
                                }
                            }
                        } else {
                            iM50473f = 0;
                            i14 = 5;
                        }
                        z21 = z2;
                        i31 = i14;
                    } else {
                        i31 = (z2 && (tt3Var.f47687f.f47685d instanceof ya1)) ? 8 : 5;
                        z21 = z2;
                        iM50473f = 0;
                    }
                }
                if (z21 && z14) {
                    if (tt3Var2.f47687f != null) {
                        iM50473f = tt3Var2.m50473f();
                    }
                    if (fzfVar6 != fzfVar2) {
                        if (!this.f57650j || !fzfVar5.f24299g || (zt3Var7 = this.c0) == null) {
                            sdaVar.m48242h(fzfVar2, fzfVar5, iM50473f, i31);
                            return;
                        }
                        au3 au3Var2 = (au3) zt3Var7;
                        if (z) {
                            au3Var2.D1(tt3Var2);
                            return;
                        } else {
                            au3Var2.I1(tt3Var2);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (z2) {
                sdaVar.m48239e(fzfVarM48251q4, fzfVarM48251q3, iMin, i11);
            } else if (z8) {
                sdaVar.m48239e(fzfVarM48251q4, fzfVarM48251q3, iMin, 5);
                sdaVar.m48244j(fzfVarM48251q4, fzfVarM48251q3, iMin, i11);
            } else {
                sdaVar.m48239e(fzfVarM48251q4, fzfVarM48251q3, iMin, 5);
                sdaVar.m48244j(fzfVarM48251q4, fzfVarM48251q3, iMin, i11);
            }
            i32 = i38;
            i13 = i37;
        }
        i12 = i33;
        fzfVar4 = fzfVarM48251q5;
        fzfVar5 = fzfVarM48251q4;
        z13 = z12;
        fzfVar6 = fzfVar3;
        z14 = z4;
        if (z11) {
        }
        if (i12 < 2) {
        }
    }

    public boolean i0() {
        return this.f57658r;
    }

    public void i1(float f) {
        this.r0 = f;
    }

    /* renamed from: j */
    public void m59852j(tt3.EnumC17197a enumC17197a, zt3 zt3Var, tt3.EnumC17197a enumC17197a2) {
        m59853k(enumC17197a, zt3Var, enumC17197a2, 0);
    }

    public boolean j0(int i) {
        return this.a0[i];
    }

    public void j1(int i) {
        this.K0 = i;
    }

    /* renamed from: k */
    public void m59853k(tt3.EnumC17197a enumC17197a, zt3 zt3Var, tt3.EnumC17197a enumC17197a2, int i) {
        tt3.EnumC17197a enumC17197a3;
        tt3.EnumC17197a enumC17197a4;
        boolean z;
        tt3.EnumC17197a enumC17197a5 = tt3.EnumC17197a.CENTER;
        if (enumC17197a == enumC17197a5) {
            if (enumC17197a2 != enumC17197a5) {
                tt3.EnumC17197a enumC17197a6 = tt3.EnumC17197a.LEFT;
                if (enumC17197a2 == enumC17197a6 || enumC17197a2 == tt3.EnumC17197a.RIGHT) {
                    m59853k(enumC17197a6, zt3Var, enumC17197a2, 0);
                    m59853k(tt3.EnumC17197a.RIGHT, zt3Var, enumC17197a2, 0);
                    mo47185q(enumC17197a5).m50468a(zt3Var.mo47185q(enumC17197a2), 0);
                    return;
                }
                tt3.EnumC17197a enumC17197a7 = tt3.EnumC17197a.TOP;
                if (enumC17197a2 == enumC17197a7 || enumC17197a2 == tt3.EnumC17197a.BOTTOM) {
                    m59853k(enumC17197a7, zt3Var, enumC17197a2, 0);
                    m59853k(tt3.EnumC17197a.BOTTOM, zt3Var, enumC17197a2, 0);
                    mo47185q(enumC17197a5).m50468a(zt3Var.mo47185q(enumC17197a2), 0);
                    return;
                }
                return;
            }
            tt3.EnumC17197a enumC17197a8 = tt3.EnumC17197a.LEFT;
            tt3 tt3VarMo47185q = mo47185q(enumC17197a8);
            tt3.EnumC17197a enumC17197a9 = tt3.EnumC17197a.RIGHT;
            tt3 tt3VarMo47185q2 = mo47185q(enumC17197a9);
            tt3.EnumC17197a enumC17197a10 = tt3.EnumC17197a.TOP;
            tt3 tt3VarMo47185q3 = mo47185q(enumC17197a10);
            tt3.EnumC17197a enumC17197a11 = tt3.EnumC17197a.BOTTOM;
            tt3 tt3VarMo47185q4 = mo47185q(enumC17197a11);
            boolean z2 = true;
            if ((tt3VarMo47185q == null || !tt3VarMo47185q.m50482o()) && (tt3VarMo47185q2 == null || !tt3VarMo47185q2.m50482o())) {
                m59853k(enumC17197a8, zt3Var, enumC17197a8, 0);
                m59853k(enumC17197a9, zt3Var, enumC17197a9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((tt3VarMo47185q3 == null || !tt3VarMo47185q3.m50482o()) && (tt3VarMo47185q4 == null || !tt3VarMo47185q4.m50482o())) {
                m59853k(enumC17197a10, zt3Var, enumC17197a10, 0);
                m59853k(enumC17197a11, zt3Var, enumC17197a11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo47185q(enumC17197a5).m50468a(zt3Var.mo47185q(enumC17197a5), 0);
                return;
            }
            if (z) {
                tt3.EnumC17197a enumC17197a12 = tt3.EnumC17197a.CENTER_X;
                mo47185q(enumC17197a12).m50468a(zt3Var.mo47185q(enumC17197a12), 0);
                return;
            } else {
                if (z2) {
                    tt3.EnumC17197a enumC17197a13 = tt3.EnumC17197a.CENTER_Y;
                    mo47185q(enumC17197a13).m50468a(zt3Var.mo47185q(enumC17197a13), 0);
                    return;
                }
                return;
            }
        }
        tt3.EnumC17197a enumC17197a14 = tt3.EnumC17197a.CENTER_X;
        if (enumC17197a == enumC17197a14 && (enumC17197a2 == (enumC17197a4 = tt3.EnumC17197a.LEFT) || enumC17197a2 == tt3.EnumC17197a.RIGHT)) {
            tt3 tt3VarMo47185q5 = mo47185q(enumC17197a4);
            tt3 tt3VarMo47185q6 = zt3Var.mo47185q(enumC17197a2);
            tt3 tt3VarMo47185q7 = mo47185q(tt3.EnumC17197a.RIGHT);
            tt3VarMo47185q5.m50468a(tt3VarMo47185q6, 0);
            tt3VarMo47185q7.m50468a(tt3VarMo47185q6, 0);
            mo47185q(enumC17197a14).m50468a(tt3VarMo47185q6, 0);
            return;
        }
        tt3.EnumC17197a enumC17197a15 = tt3.EnumC17197a.CENTER_Y;
        if (enumC17197a == enumC17197a15 && (enumC17197a2 == (enumC17197a3 = tt3.EnumC17197a.TOP) || enumC17197a2 == tt3.EnumC17197a.BOTTOM)) {
            tt3 tt3VarMo47185q8 = zt3Var.mo47185q(enumC17197a2);
            mo47185q(enumC17197a3).m50468a(tt3VarMo47185q8, 0);
            mo47185q(tt3.EnumC17197a.BOTTOM).m50468a(tt3VarMo47185q8, 0);
            mo47185q(enumC17197a15).m50468a(tt3VarMo47185q8, 0);
            return;
        }
        if (enumC17197a == enumC17197a14 && enumC17197a2 == enumC17197a14) {
            tt3.EnumC17197a enumC17197a16 = tt3.EnumC17197a.LEFT;
            mo47185q(enumC17197a16).m50468a(zt3Var.mo47185q(enumC17197a16), 0);
            tt3.EnumC17197a enumC17197a17 = tt3.EnumC17197a.RIGHT;
            mo47185q(enumC17197a17).m50468a(zt3Var.mo47185q(enumC17197a17), 0);
            mo47185q(enumC17197a14).m50468a(zt3Var.mo47185q(enumC17197a2), 0);
            return;
        }
        if (enumC17197a == enumC17197a15 && enumC17197a2 == enumC17197a15) {
            tt3.EnumC17197a enumC17197a18 = tt3.EnumC17197a.TOP;
            mo47185q(enumC17197a18).m50468a(zt3Var.mo47185q(enumC17197a18), 0);
            tt3.EnumC17197a enumC17197a19 = tt3.EnumC17197a.BOTTOM;
            mo47185q(enumC17197a19).m50468a(zt3Var.mo47185q(enumC17197a19), 0);
            mo47185q(enumC17197a15).m50468a(zt3Var.mo47185q(enumC17197a2), 0);
            return;
        }
        tt3 tt3VarMo47185q9 = mo47185q(enumC17197a);
        tt3 tt3VarMo47185q10 = zt3Var.mo47185q(enumC17197a2);
        if (tt3VarMo47185q9.m50483p(tt3VarMo47185q10)) {
            tt3.EnumC17197a enumC17197a20 = tt3.EnumC17197a.BASELINE;
            if (enumC17197a == enumC17197a20) {
                tt3 tt3VarMo47185q11 = mo47185q(tt3.EnumC17197a.TOP);
                tt3 tt3VarMo47185q12 = mo47185q(tt3.EnumC17197a.BOTTOM);
                if (tt3VarMo47185q11 != null) {
                    tt3VarMo47185q11.m50484q();
                }
                if (tt3VarMo47185q12 != null) {
                    tt3VarMo47185q12.m50484q();
                }
            } else if (enumC17197a == tt3.EnumC17197a.TOP || enumC17197a == tt3.EnumC17197a.BOTTOM) {
                tt3 tt3VarMo47185q13 = mo47185q(enumC17197a20);
                if (tt3VarMo47185q13 != null) {
                    tt3VarMo47185q13.m50484q();
                }
                tt3 tt3VarMo47185q14 = mo47185q(enumC17197a5);
                if (tt3VarMo47185q14.m50477j() != tt3VarMo47185q10) {
                    tt3VarMo47185q14.m50484q();
                }
                tt3 tt3VarM50474g = mo47185q(enumC17197a).m50474g();
                tt3 tt3VarMo47185q15 = mo47185q(enumC17197a15);
                if (tt3VarMo47185q15.m50482o()) {
                    tt3VarM50474g.m50484q();
                    tt3VarMo47185q15.m50484q();
                }
            } else if (enumC17197a == tt3.EnumC17197a.LEFT || enumC17197a == tt3.EnumC17197a.RIGHT) {
                tt3 tt3VarMo47185q16 = mo47185q(enumC17197a5);
                if (tt3VarMo47185q16.m50477j() != tt3VarMo47185q10) {
                    tt3VarMo47185q16.m50484q();
                }
                tt3 tt3VarM50474g2 = mo47185q(enumC17197a).m50474g();
                tt3 tt3VarMo47185q17 = mo47185q(enumC17197a14);
                if (tt3VarMo47185q17.m50482o()) {
                    tt3VarM50474g2.m50484q();
                    tt3VarMo47185q17.m50484q();
                }
            }
            tt3VarMo47185q9.m50468a(tt3VarMo47185q10, i);
        }
    }

    public boolean k0() {
        tt3 tt3Var = this.f57631Q;
        tt3 tt3Var2 = tt3Var.f47687f;
        if (tt3Var2 != null && tt3Var2.f47687f == tt3Var) {
            return true;
        }
        tt3 tt3Var3 = this.f57633S;
        tt3 tt3Var4 = tt3Var3.f47687f;
        return tt3Var4 != null && tt3Var4.f47687f == tt3Var3;
    }

    public void k1(int i, int i2) {
        this.i0 = i;
        int i3 = i2 - i;
        this.e0 = i3;
        int i4 = this.p0;
        if (i3 < i4) {
            this.e0 = i4;
        }
    }

    /* renamed from: l */
    public void m59854l(tt3 tt3Var, tt3 tt3Var2, int i) {
        if (tt3Var.m50475h() == this) {
            m59853k(tt3Var.m50478k(), tt3Var2.m50475h(), tt3Var2.m50478k(), i);
        }
    }

    public boolean l0() {
        return this.f57627M;
    }

    public void l1(EnumC18702b enumC18702b) {
        this.b0[1] = enumC18702b;
    }

    /* renamed from: m */
    public void m59855m(zt3 zt3Var, float f, int i) {
        tt3.EnumC17197a enumC17197a = tt3.EnumC17197a.CENTER;
        g0(enumC17197a, zt3Var, enumC17197a, i, 0);
        this.f57625K = f;
    }

    public boolean m0() {
        tt3 tt3Var = this.f57632R;
        tt3 tt3Var2 = tt3Var.f47687f;
        if (tt3Var2 != null && tt3Var2.f47687f == tt3Var) {
            return true;
        }
        tt3 tt3Var3 = this.f57634T;
        tt3 tt3Var4 = tt3Var3.f47687f;
        return tt3Var4 != null && tt3Var4.f47687f == tt3Var3;
    }

    public void m1(int i, int i2, int i3, float f) {
        this.f57664x = i;
        this.f57617C = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f57618D = i3;
        this.f57619E = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f57664x = 2;
    }

    /* renamed from: n */
    public void mo23956n(zt3 zt3Var, HashMap map) {
        this.f57660t = zt3Var.f57660t;
        this.f57661u = zt3Var.f57661u;
        this.f57663w = zt3Var.f57663w;
        this.f57664x = zt3Var.f57664x;
        int[] iArr = this.f57665y;
        int[] iArr2 = zt3Var.f57665y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f57666z = zt3Var.f57666z;
        this.f57615A = zt3Var.f57615A;
        this.f57617C = zt3Var.f57617C;
        this.f57618D = zt3Var.f57618D;
        this.f57619E = zt3Var.f57619E;
        this.f57620F = zt3Var.f57620F;
        this.f57621G = zt3Var.f57621G;
        this.f57622H = zt3Var.f57622H;
        this.f57623I = zt3Var.f57623I;
        int[] iArr3 = zt3Var.f57624J;
        this.f57624J = Arrays.copyOf(iArr3, iArr3.length);
        this.f57625K = zt3Var.f57625K;
        this.f57626L = zt3Var.f57626L;
        this.f57627M = zt3Var.f57627M;
        this.f57631Q.m50484q();
        this.f57632R.m50484q();
        this.f57633S.m50484q();
        this.f57634T.m50484q();
        this.f57635U.m50484q();
        this.f57636V.m50484q();
        this.f57637W.m50484q();
        this.f57638X.m50484q();
        this.b0 = (EnumC18702b[]) Arrays.copyOf(this.b0, 2);
        this.c0 = this.c0 == null ? null : (zt3) map.get(zt3Var.c0);
        this.d0 = zt3Var.d0;
        this.e0 = zt3Var.e0;
        this.f0 = zt3Var.f0;
        this.g0 = zt3Var.g0;
        this.h0 = zt3Var.h0;
        this.i0 = zt3Var.i0;
        this.j0 = zt3Var.j0;
        this.k0 = zt3Var.k0;
        this.l0 = zt3Var.l0;
        this.m0 = zt3Var.m0;
        this.n0 = zt3Var.n0;
        this.o0 = zt3Var.o0;
        this.p0 = zt3Var.p0;
        this.q0 = zt3Var.q0;
        this.r0 = zt3Var.r0;
        this.s0 = zt3Var.s0;
        this.t0 = zt3Var.t0;
        this.u0 = zt3Var.u0;
        this.v0 = zt3Var.v0;
        this.w0 = zt3Var.w0;
        this.x0 = zt3Var.x0;
        this.y0 = zt3Var.y0;
        this.z0 = zt3Var.z0;
        this.A0 = zt3Var.A0;
        this.B0 = zt3Var.B0;
        this.C0 = zt3Var.C0;
        this.D0 = zt3Var.D0;
        this.E0 = zt3Var.E0;
        this.F0 = zt3Var.F0;
        this.G0 = zt3Var.G0;
        this.H0 = zt3Var.H0;
        this.J0 = zt3Var.J0;
        this.K0 = zt3Var.K0;
        this.L0 = zt3Var.L0;
        this.M0 = zt3Var.M0;
        float[] fArr = this.N0;
        float[] fArr2 = zt3Var.N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        zt3[] zt3VarArr = this.O0;
        zt3[] zt3VarArr2 = zt3Var.O0;
        zt3VarArr[0] = zt3VarArr2[0];
        zt3VarArr[1] = zt3VarArr2[1];
        zt3[] zt3VarArr3 = this.P0;
        zt3[] zt3VarArr4 = zt3Var.P0;
        zt3VarArr3[0] = zt3VarArr4[0];
        zt3VarArr3[1] = zt3VarArr4[1];
        zt3 zt3Var2 = zt3Var.Q0;
        this.Q0 = zt3Var2 == null ? null : (zt3) map.get(zt3Var2);
        zt3 zt3Var3 = zt3Var.R0;
        this.R0 = zt3Var3 != null ? (zt3) map.get(zt3Var3) : null;
    }

    public boolean n0() {
        return this.f57628N;
    }

    public void n1(float f) {
        this.N0[1] = f;
    }

    /* renamed from: o */
    public void m59856o(sda sdaVar) {
        sdaVar.m48251q(this.f57631Q);
        sdaVar.m48251q(this.f57632R);
        sdaVar.m48251q(this.f57633S);
        sdaVar.m48251q(this.f57634T);
        if (this.n0 > 0) {
            sdaVar.m48251q(this.f57635U);
        }
    }

    public boolean o0() {
        return this.f57649i && this.u0 != 8;
    }

    public void o1(int i) {
        this.u0 = i;
    }

    /* renamed from: p */
    public void m59857p() {
        if (this.f57645e == null) {
            this.f57645e = new x08(this);
        }
        if (this.f57646f == null) {
            this.f57646f = new bui(this);
        }
    }

    public boolean p0() {
        return this.f57656p || (this.f57631Q.m50481n() && this.f57633S.m50481n());
    }

    public void p1(int i) {
        this.d0 = i;
        int i2 = this.o0;
        if (i < i2) {
            this.d0 = i2;
        }
    }

    /* renamed from: q */
    public tt3 mo47185q(tt3.EnumC17197a enumC17197a) {
        switch (C18701a.f57667a[enumC17197a.ordinal()]) {
            case 1:
                return this.f57631Q;
            case 2:
                return this.f57632R;
            case 3:
                return this.f57633S;
            case 4:
                return this.f57634T;
            case 5:
                return this.f57635U;
            case 6:
                return this.f57638X;
            case 7:
                return this.f57636V;
            case 8:
                return this.f57637W;
            case 9:
                return null;
            default:
                throw new AssertionError(enumC17197a.name());
        }
    }

    public boolean q0() {
        return this.f57657q || (this.f57632R.m50481n() && this.f57634T.m50481n());
    }

    public void q1(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.f57662v = i;
    }

    /* renamed from: r */
    public int m59858r() {
        return this.n0;
    }

    public boolean r0() {
        return this.f57659s;
    }

    public void r1(int i) {
        this.h0 = i;
    }

    /* renamed from: s */
    public float m59859s(int i) {
        if (i == 0) {
            return this.q0;
        }
        if (i == 1) {
            return this.r0;
        }
        return -1.0f;
    }

    public void s0() {
        this.f57658r = true;
    }

    public void s1(int i) {
        this.i0 = i;
    }

    /* renamed from: t */
    public int m59860t() {
        return a0() + this.e0;
    }

    public void t0() {
        this.f57659s = true;
    }

    public void t1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f57622H == -1) {
            if (z3 && !z4) {
                this.f57622H = 0;
            } else if (!z3 && z4) {
                this.f57622H = 1;
                if (this.g0 == -1) {
                    this.f57623I = 1.0f / this.f57623I;
                }
            }
        }
        if (this.f57622H == 0 && (!this.f57632R.m50482o() || !this.f57634T.m50482o())) {
            this.f57622H = 1;
        } else if (this.f57622H == 1 && (!this.f57631Q.m50482o() || !this.f57633S.m50482o())) {
            this.f57622H = 0;
        }
        if (this.f57622H == -1 && (!this.f57632R.m50482o() || !this.f57634T.m50482o() || !this.f57631Q.m50482o() || !this.f57633S.m50482o())) {
            if (this.f57632R.m50482o() && this.f57634T.m50482o()) {
                this.f57622H = 0;
            } else if (this.f57631Q.m50482o() && this.f57633S.m50482o()) {
                this.f57623I = 1.0f / this.f57623I;
                this.f57622H = 1;
            }
        }
        if (this.f57622H == -1) {
            int i = this.f57666z;
            if (i > 0 && this.f57617C == 0) {
                this.f57622H = 0;
            } else {
                if (i != 0 || this.f57617C <= 0) {
                    return;
                }
                this.f57623I = 1.0f / this.f57623I;
                this.f57622H = 1;
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.x0 != null) {
            str = "type: " + this.x0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.w0 != null) {
            str2 = "id: " + this.w0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.h0);
        sb.append(", ");
        sb.append(this.i0);
        sb.append(") - (");
        sb.append(this.d0);
        sb.append(" x ");
        sb.append(this.e0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public Object m59861u() {
        return this.s0;
    }

    public boolean u0() {
        EnumC18702b[] enumC18702bArr = this.b0;
        EnumC18702b enumC18702b = enumC18702bArr[0];
        EnumC18702b enumC18702b2 = EnumC18702b.MATCH_CONSTRAINT;
        return enumC18702b == enumC18702b2 && enumC18702bArr[1] == enumC18702b2;
    }

    public void u1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zM46359k = z & this.f57645e.m46359k();
        boolean zM46359k2 = z2 & this.f57646f.m46359k();
        x08 x08Var = this.f57645e;
        int i3 = x08Var.f43168h.f21866g;
        bui buiVar = this.f57646f;
        int i4 = buiVar.f43168h.f21866g;
        int i5 = x08Var.f43169i.f21866g;
        int i6 = buiVar.f43169i.f21866g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (zM46359k) {
            this.h0 = i3;
        }
        if (zM46359k2) {
            this.i0 = i4;
        }
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        if (zM46359k) {
            if (this.b0[0] == EnumC18702b.FIXED && i8 < (i2 = this.d0)) {
                i8 = i2;
            }
            this.d0 = i8;
            int i10 = this.o0;
            if (i8 < i10) {
                this.d0 = i10;
            }
        }
        if (zM46359k2) {
            if (this.b0[1] == EnumC18702b.FIXED && i9 < (i = this.e0)) {
                i9 = i;
            }
            this.e0 = i9;
            int i11 = this.p0;
            if (i9 < i11) {
                this.e0 = i11;
            }
        }
    }

    /* renamed from: v */
    public String m59862v() {
        return this.w0;
    }

    public void v0() {
        this.f57631Q.m50484q();
        this.f57632R.m50484q();
        this.f57633S.m50484q();
        this.f57634T.m50484q();
        this.f57635U.m50484q();
        this.f57636V.m50484q();
        this.f57637W.m50484q();
        this.f57638X.m50484q();
        this.c0 = null;
        this.f57625K = Float.NaN;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = 0;
        float f = U0;
        this.q0 = f;
        this.r0 = f;
        EnumC18702b[] enumC18702bArr = this.b0;
        EnumC18702b enumC18702b = EnumC18702b.FIXED;
        enumC18702bArr[0] = enumC18702b;
        enumC18702bArr[1] = enumC18702b;
        this.s0 = null;
        this.t0 = 0;
        this.u0 = 0;
        this.x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] fArr = this.N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f57660t = -1;
        this.f57661u = -1;
        int[] iArr = this.f57624J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f57663w = 0;
        this.f57664x = 0;
        this.f57616B = 1.0f;
        this.f57619E = 1.0f;
        this.f57615A = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f57618D = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f57666z = 0;
        this.f57617C = 0;
        this.f57648h = false;
        this.f57622H = -1;
        this.f57623I = 1.0f;
        this.I0 = false;
        boolean[] zArr = this.f57647g;
        zArr[0] = true;
        zArr[1] = true;
        this.f57628N = false;
        boolean[] zArr2 = this.a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f57649i = true;
        int[] iArr2 = this.f57665y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f57652l = -1;
        this.f57653m = -1;
    }

    public void v1(sda sdaVar, boolean z) {
        bui buiVar;
        x08 x08Var;
        int iM48257y = sdaVar.m48257y(this.f57631Q);
        int iM48257y2 = sdaVar.m48257y(this.f57632R);
        int iM48257y3 = sdaVar.m48257y(this.f57633S);
        int iM48257y4 = sdaVar.m48257y(this.f57634T);
        if (z && (x08Var = this.f57645e) != null) {
            em5 em5Var = x08Var.f43168h;
            if (em5Var.f21869j) {
                em5 em5Var2 = x08Var.f43169i;
                if (em5Var2.f21869j) {
                    iM48257y = em5Var.f21866g;
                    iM48257y3 = em5Var2.f21866g;
                }
            }
        }
        if (z && (buiVar = this.f57646f) != null) {
            em5 em5Var3 = buiVar.f43168h;
            if (em5Var3.f21869j) {
                em5 em5Var4 = buiVar.f43169i;
                if (em5Var4.f21869j) {
                    iM48257y2 = em5Var3.f21866g;
                    iM48257y4 = em5Var4.f21866g;
                }
            }
        }
        int i = iM48257y4 - iM48257y2;
        if (iM48257y3 - iM48257y < 0 || i < 0 || iM48257y == Integer.MIN_VALUE || iM48257y == Integer.MAX_VALUE || iM48257y2 == Integer.MIN_VALUE || iM48257y2 == Integer.MAX_VALUE || iM48257y3 == Integer.MIN_VALUE || iM48257y3 == Integer.MAX_VALUE || iM48257y4 == Integer.MIN_VALUE || iM48257y4 == Integer.MAX_VALUE) {
            iM48257y = 0;
            iM48257y4 = 0;
            iM48257y2 = 0;
            iM48257y3 = 0;
        }
        O0(iM48257y, iM48257y2, iM48257y3, iM48257y4);
    }

    /* renamed from: w */
    public EnumC18702b m59863w(int i) {
        if (i == 0) {
            return m59825C();
        }
        if (i == 1) {
            return m59843V();
        }
        return null;
    }

    public void w0() {
        x0();
        i1(U0);
        R0(U0);
    }

    /* renamed from: x */
    public float m59864x() {
        return this.f0;
    }

    public void x0() {
        zt3 zt3VarM59835M = m59835M();
        if (zt3VarM59835M != null && (zt3VarM59835M instanceof au3) && ((au3) m59835M()).R1()) {
            return;
        }
        int size = this.f57640Z.size();
        for (int i = 0; i < size; i++) {
            ((tt3) this.f57640Z.get(i)).m50484q();
        }
    }

    /* renamed from: y */
    public int m59865y() {
        return this.g0;
    }

    public void y0() {
        this.f57656p = false;
        this.f57657q = false;
        this.f57658r = false;
        this.f57659s = false;
        int size = this.f57640Z.size();
        for (int i = 0; i < size; i++) {
            ((tt3) this.f57640Z.get(i)).m50485r();
        }
    }

    /* renamed from: z */
    public int m59866z() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.e0;
    }

    public void z0(tr1 tr1Var) {
        this.f57631Q.m50486s(tr1Var);
        this.f57632R.m50486s(tr1Var);
        this.f57633S.m50486s(tr1Var);
        this.f57634T.m50486s(tr1Var);
        this.f57635U.m50486s(tr1Var);
        this.f57638X.m50486s(tr1Var);
        this.f57636V.m50486s(tr1Var);
        this.f57637W.m50486s(tr1Var);
    }
}
