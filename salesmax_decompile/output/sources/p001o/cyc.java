package p001o;

import com.google.android.gms.common.api.Api;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class cyc extends ca9 {

    /* renamed from: c */
    public static final byte[] f18833c = new byte[0];

    /* renamed from: d */
    public static final int[] f18834d = new int[0];

    /* renamed from: e */
    public static final BigInteger f18835e;

    /* renamed from: f */
    public static final BigInteger f18836f;

    /* renamed from: g */
    public static final BigInteger f18837g;

    /* renamed from: h */
    public static final BigInteger f18838h;

    /* renamed from: q */
    public static final BigDecimal f18839q;

    /* renamed from: s */
    public static final BigDecimal f18840s;

    /* renamed from: x */
    public static final BigDecimal f18841x;

    /* renamed from: y */
    public static final BigDecimal f18842y;

    /* renamed from: b */
    public ya9 f18843b;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        f18835e = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        f18836f = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f18837g = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f18838h = bigIntegerValueOf4;
        f18839q = new BigDecimal(bigIntegerValueOf3);
        f18840s = new BigDecimal(bigIntegerValueOf4);
        f18841x = new BigDecimal(bigIntegerValueOf);
        f18842y = new BigDecimal(bigIntegerValueOf2);
    }

    public cyc(int i) {
        super(i);
    }

    /* renamed from: O */
    public static final String m22051O(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i + ")";
        }
        if (i <= 255) {
            return "'" + c + "' (code " + i + ")";
        }
        return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
    }

    public void A0(String str) throws ba9 {
        m22056X("Invalid numeric value: " + str);
    }

    @Override // p001o.ca9
    /* renamed from: C */
    public abstract String mo20614C();

    public void E0() throws dj8 {
        F0(mo20614C());
    }

    public void F0(String str) throws dj8 {
        G0(str, z0());
    }

    public void G0(String str, ya9 ya9Var) throws dj8 {
        f0(String.format("Numeric value (%s) out of range of int (%d - %s)", m22054S(str), Integer.MIN_VALUE, Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER)), ya9Var, Integer.TYPE);
    }

    @Override // p001o.ca9
    /* renamed from: H */
    public abstract ya9 mo20616H();

    public void H0() throws dj8 {
        I0(mo20614C());
    }

    public void I0(String str) throws dj8 {
        K0(str, z0());
    }

    @Override // p001o.ca9
    /* renamed from: J */
    public ca9 mo20617J() throws ba9 {
        ya9 ya9Var = this.f18843b;
        if (ya9Var != ya9.START_OBJECT && ya9Var != ya9.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            ya9 ya9VarMo20616H = mo20616H();
            if (ya9VarMo20616H == null) {
                mo22053Q();
                return this;
            }
            if (ya9VarMo20616H.isStructStart()) {
                i++;
            } else if (ya9VarMo20616H.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (ya9VarMo20616H == ya9.NOT_AVAILABLE) {
                m22057Y("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    /* renamed from: K */
    public final ba9 m22052K(String str, Throwable th) {
        return new ba9(this, str, th);
    }

    public void K0(String str, ya9 ya9Var) throws dj8 {
        f0(String.format("Numeric value (%s) out of range of long (%d - %s)", m22054S(str), Long.MIN_VALUE, Long.MAX_VALUE), ya9Var, Long.TYPE);
    }

    public void L0(int i, String str) throws ba9 {
        String str2 = String.format("Unexpected character (%s) in numeric value", m22051O(i));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        m22056X(str2);
    }

    /* renamed from: Q */
    public abstract void mo22053Q();

    /* renamed from: S */
    public String m22054S(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    /* renamed from: T */
    public String m22055T(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    /* renamed from: X */
    public final void m22056X(String str) throws ba9 {
        throw m20618a(str);
    }

    /* renamed from: Y */
    public final void m22057Y(String str, Object obj) throws ba9 {
        throw m20618a(String.format(str, obj));
    }

    public final void d0(String str, Object obj, Object obj2) throws ba9 {
        throw m20618a(String.format(str, obj, obj2));
    }

    public void f0(String str, ya9 ya9Var, Class cls) throws dj8 {
        throw new dj8(this, str, ya9Var, cls);
    }

    @Override // p001o.ca9
    /* renamed from: h */
    public ya9 mo20623h() {
        return this.f18843b;
    }

    public void j0() throws j89 {
        k0(" in " + this.f18843b, this.f18843b);
    }

    public void k0(String str, ya9 ya9Var) throws j89 {
        throw new j89(this, ya9Var, "Unexpected end-of-input" + str);
    }

    public void l0(ya9 ya9Var) throws j89 {
        k0(ya9Var == ya9.VALUE_STRING ? " in a String value" : (ya9Var == ya9.VALUE_NUMBER_INT || ya9Var == ya9.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value", ya9Var);
    }

    public void o0(int i) throws ba9 {
        r0(i, "Expected space separating root-level values");
    }

    public void r0(int i, String str) throws ba9 {
        if (i < 0) {
            j0();
        }
        String str2 = String.format("Unexpected character (%s)", m22051O(i));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        m22056X(str2);
    }

    public final void u0() {
        uti.m52028a();
    }

    public void v0(int i) throws ba9 {
        m22056X("Illegal character (" + m22051O((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public final void y0(String str, Throwable th) throws ba9 {
        throw m22052K(str, th);
    }

    public ya9 z0() {
        return this.f18843b;
    }
}
