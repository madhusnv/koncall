package p001o;

import org.apache.http.message.TokenParser;
import p001o.ysb;

/* loaded from: classes3.dex */
public abstract class ayc {

    /* renamed from: o.ayc$a */
    public /* synthetic */ class C12268a extends dm7 implements xk7 {

        /* renamed from: a */
        public static final C12268a f15371a = new C12268a();

        public C12268a() {
            super(1, ayc.class, "isDigit", "isDigit(C)Z", 1);
        }

        /* renamed from: b */
        public final Boolean m18021b(char c) {
            return Boolean.valueOf(ayc.m18017w(c));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m18021b(((Character) obj).charValue());
        }
    }

    /* renamed from: o.ayc$b */
    public /* synthetic */ class C12269b extends dm7 implements xk7 {

        /* renamed from: a */
        public static final C12269b f15372a = new C12269b();

        public C12269b() {
            super(1, ayc.class, "isDigit", "isDigit(C)Z", 1);
        }

        /* renamed from: b */
        public final Boolean m18022b(char c) {
            return Boolean.valueOf(ayc.m18017w(c));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m18022b(((Character) obj).charValue());
        }
    }

    /* renamed from: A */
    public static final dxc m17970A(int i, int i2, kl8 kl8Var, String str, int i3) {
        sq8.m48649h(str, "str");
        m17981L(str, i3, 0, 4, null);
        dxc dxcVar = (dxc) m17984O(i, i2).invoke(str, Integer.valueOf(i3));
        int iM23922a = dxcVar.m23922a();
        int iIntValue = ((Number) dxcVar.m23923b()).intValue();
        if (kl8Var.m35829r(iIntValue)) {
            return new dxc(iM23922a, Integer.valueOf(iIntValue));
        }
        throw new bxc(str, iIntValue + " not in range " + kl8Var, i3);
    }

    /* renamed from: B */
    public static final nl7 m17971B(int i, kl8 kl8Var) {
        sq8.m48649h(kl8Var, "range");
        return m18020z(i, i, kl8Var);
    }

    /* renamed from: C */
    public static final nl7 m17972C(final String str) {
        sq8.m48649h(str, "chars");
        return new nl7() { // from class: o.wxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m17973D(str, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: D */
    public static final dxc m17973D(String str, String str2, int i) {
        dxc dxcVar;
        sq8.m48649h(str2, "str");
        m17980K(str2, i, 1);
        char cCharAt = str2.charAt(i);
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                dxcVar = null;
                break;
            }
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 == cCharAt) {
                dxcVar = new dxc(i + 1, Character.valueOf(cCharAt2));
                break;
            }
            i2++;
        }
        if (dxcVar != null) {
            return dxcVar;
        }
        throw new bxc(str2, "expected one of `" + str + "` found " + cCharAt, i);
    }

    /* renamed from: E */
    public static final nl7 m17974E(final nl7 nl7Var) {
        sq8.m48649h(nl7Var, "parser");
        return new nl7() { // from class: o.oxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m17975F(nl7Var, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: F */
    public static final dxc m17975F(nl7 nl7Var, String str, int i) {
        sq8.m48649h(str, "str");
        try {
            return (dxc) nl7Var.invoke(str, Integer.valueOf(i));
        } catch (bxc unused) {
            return new dxc(i, null);
        }
    }

    /* renamed from: G */
    public static final nl7 m17976G(nl7 nl7Var, final Object obj) {
        sq8.m48649h(nl7Var, "parser");
        return m18018x(m17974E(nl7Var), new xk7() { // from class: o.qxc
            @Override // p001o.xk7
            public final Object invoke(Object obj2) {
                return ayc.m17977H(obj, obj2);
            }
        });
    }

    /* renamed from: H */
    public static final Object m17977H(Object obj, Object obj2) {
        return obj2 == null ? obj : obj2;
    }

    /* renamed from: I */
    public static final nl7 m17978I(final nl7 nl7Var, final nl7 nl7Var2) {
        sq8.m48649h(nl7Var, "pre");
        sq8.m48649h(nl7Var2, "post");
        return new nl7() { // from class: o.vxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m17979J(nl7Var, nl7Var2, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: J */
    public static final dxc m17979J(nl7 nl7Var, nl7 nl7Var2, String str, int i) {
        sq8.m48649h(str, "str");
        return (dxc) nl7Var2.invoke(str, Integer.valueOf(((dxc) nl7Var.invoke(str, Integer.valueOf(i))).m23924c()));
    }

    /* renamed from: K */
    public static final void m17980K(String str, int i, int i2) {
        sq8.m48649h(str, "input");
        boolean z = true;
        if (i2 != 0 ? i + i2 <= str.length() : i < str.length()) {
            z = false;
        }
        if (z) {
            throw new ph8(str, i2 == 0 ? ysb.C18483b.f55900a : new ysb.C18482a(i2));
        }
    }

    /* renamed from: L */
    public static /* synthetic */ void m17981L(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        m17980K(str, i, i2);
    }

    /* renamed from: M */
    public static final nl7 m17982M(final String str) {
        sq8.m48649h(str, "match");
        return new nl7() { // from class: o.rxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m17983N(str, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: N */
    public static final dxc m17983N(String str, String str2, int i) {
        sq8.m48649h(str2, "str");
        m17980K(str2, i, str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str2.charAt(i + i2) != str.charAt(i2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("expected `");
                sb.append(str);
                sb.append("` found `");
                String strSubstring = str2.substring(i, str.length() + i);
                sq8.m48648g(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append('`');
                throw new bxc(str2, sb.toString(), i);
            }
        }
        return new dxc(i + str.length(), str);
    }

    /* renamed from: O */
    public static final nl7 m17984O(int i, int i2) {
        return m17988S(i, i2, new nl7() { // from class: o.txc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(ayc.m17985P((String) obj, (kl8) obj2));
            }
        });
    }

    /* renamed from: P */
    public static final int m17985P(String str, kl8 kl8Var) {
        sq8.m48649h(str, "str");
        sq8.m48649h(kl8Var, "range");
        return Integer.parseInt(f9g.L0(str, kl8Var));
    }

    /* renamed from: Q */
    public static final nl7 m17986Q(int i, int i2) {
        return m17988S(i, i2, new nl7() { // from class: o.mxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(ayc.m17987R((String) obj, (kl8) obj2));
            }
        });
    }

    /* renamed from: R */
    public static final long m17987R(String str, kl8 kl8Var) {
        sq8.m48649h(str, "str");
        sq8.m48649h(kl8Var, "range");
        return Long.parseLong(f9g.L0(str, kl8Var));
    }

    /* renamed from: S */
    public static final nl7 m17988S(final int i, final int i2, final nl7 nl7Var) {
        sq8.m48649h(nl7Var, "transform");
        return new nl7() { // from class: o.pxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m17989T(i, i2, nl7Var, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: T */
    public static final dxc m17989T(int i, int i2, nl7 nl7Var, String str, int i3) {
        sq8.m48649h(str, "str");
        m17981L(str, i3, 0, 4, null);
        try {
            dxc dxcVar = (dxc) m17991V(i, i2, C12269b.f15372a).invoke(str, Integer.valueOf(i3));
            int iM23922a = dxcVar.m23922a();
            kl8 kl8Var = (kl8) dxcVar.m23923b();
            if (kl8Var.isEmpty()) {
                throw new bxc(str, "expected integer", i3);
            }
            return new dxc(iM23922a, (Number) nl7Var.invoke(str, kl8Var));
        } catch (njg e) {
            throw new bxc(str, m18014t(i, i2, e.m40679b(), "found " + e.m40680c()), i3);
        } catch (ph8 e2) {
            throw new bxc(str, m18014t(i, i2, i, String.valueOf(e2.m43678b())), i3);
        }
    }

    /* renamed from: U */
    public static final nl7 m17990U(int i) {
        return m17984O(i, i);
    }

    /* renamed from: V */
    public static final nl7 m17991V(final int i, final int i2, final xk7 xk7Var) {
        sq8.m48649h(xk7Var, "predicate");
        return new nl7() { // from class: o.nxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m17992W(i2, i, xk7Var, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: W */
    public static final dxc m17992W(int i, int i2, xk7 xk7Var, String str, int i3) {
        sq8.m48649h(str, "str");
        if (!(i >= i2)) {
            throw new IllegalArgumentException(("min m=" + i2 + " cannot be greater than max=" + i).toString());
        }
        m17981L(str, i3, 0, 4, null);
        int i4 = i3;
        while (i4 < str.length() && i4 - i3 < i && ((Boolean) xk7Var.invoke(Character.valueOf(str.charAt(i4)))).booleanValue()) {
            i4++;
        }
        int i5 = i4 - i3;
        if (i5 >= i2) {
            return new dxc(i4, new kl8(i3, i4 - 1));
        }
        if (i4 >= str.length()) {
            throw new ph8(str, new ysb.C18482a(i2 - i5));
        }
        throw new njg(str, i4, i2, i5);
    }

    /* renamed from: X */
    public static final nl7 m17993X(final nl7 nl7Var, final nl7 nl7Var2) {
        sq8.m48649h(nl7Var, "<this>");
        sq8.m48649h(nl7Var2, "next");
        return new nl7() { // from class: o.sxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m17994Y(nl7Var, nl7Var2, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: Y */
    public static final dxc m17994Y(nl7 nl7Var, nl7 nl7Var2, String str, int i) {
        sq8.m48649h(str, "str");
        dxc dxcVar = (dxc) nl7Var.invoke(str, Integer.valueOf(i));
        int iM23922a = dxcVar.m23922a();
        Object objM23923b = dxcVar.m23923b();
        dxc dxcVar2 = (dxc) nl7Var2.invoke(str, Integer.valueOf(iM23922a));
        return new dxc(dxcVar2.m23922a(), new hwc(objM23923b, dxcVar2.m23923b()));
    }

    /* renamed from: p */
    public static final nl7 m18010p(final nl7... nl7VarArr) {
        sq8.m48649h(nl7VarArr, "parsers");
        return new nl7() { // from class: o.zxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m18011q(nl7VarArr, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: q */
    public static final dxc m18011q(nl7[] nl7VarArr, String str, int i) {
        dxc dxcVar;
        sq8.m48649h(str, "str");
        int length = nl7VarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                dxcVar = null;
                break;
            }
            try {
                dxcVar = (dxc) nl7VarArr[i2].invoke(str, Integer.valueOf(i));
                break;
            } catch (bxc unused) {
                i2++;
            }
        }
        if (dxcVar != null) {
            return dxcVar;
        }
        throw new bxc(str, "no alternatives matched", i);
    }

    /* renamed from: r */
    public static final nl7 m18012r(final char c) {
        return new nl7() { // from class: o.yxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m18013s(c, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: s */
    public static final dxc m18013s(char c, String str, int i) {
        sq8.m48649h(str, "str");
        m17980K(str, i, 1);
        char cCharAt = str.charAt(i);
        if (cCharAt == c) {
            return new dxc(i + 1, Character.valueOf(cCharAt));
        }
        throw new bxc(str, "expected `" + c + "` found `" + cCharAt + '`', i);
    }

    /* renamed from: t */
    public static final String m18014t(int i, int i2, int i3, String str) {
        return "expected " + (i == i2 ? "exactly" : "at least") + TokenParser.SP + i3 + " digits; " + str;
    }

    /* renamed from: u */
    public static final nl7 m18015u(final int i, final int i2, final int i3) {
        return new nl7() { // from class: o.lxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m18016v(i3, i2, i, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: v */
    public static final dxc m18016v(int i, int i2, int i3, String str, int i4) throws NumberFormatException {
        sq8.m48649h(str, "str");
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("denomDigits (" + i + ") must be less than max=" + i2 + " digits to parse").toString());
        }
        m17981L(str, i4, 0, 4, null);
        dxc dxcVar = (dxc) m17991V(i3, i2, C12268a.f15371a).invoke(str, Integer.valueOf(i4));
        int iM23922a = dxcVar.m23922a();
        kl8 kl8Var = (kl8) dxcVar.m23923b();
        if (kl8Var.isEmpty()) {
            throw new bxc(str, "expected integer", i4);
        }
        int i5 = Integer.parseInt(f9g.L0(str, kl8Var));
        for (int iM32261j = kl8Var.m32261j() - kl8Var.m32260e(); iM32261j < i - 1; iM32261j++) {
            i5 *= 10;
        }
        return new dxc(iM23922a, Integer.valueOf(i5));
    }

    /* renamed from: w */
    public static final boolean m18017w(char c) {
        return '0' <= c && c < ':';
    }

    /* renamed from: x */
    public static final nl7 m18018x(final nl7 nl7Var, final xk7 xk7Var) {
        sq8.m48649h(nl7Var, "parser");
        sq8.m48649h(xk7Var, "block");
        return new nl7() { // from class: o.xxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m18019y(nl7Var, xk7Var, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: y */
    public static final dxc m18019y(nl7 nl7Var, xk7 xk7Var, String str, int i) {
        sq8.m48649h(str, "str");
        dxc dxcVar = (dxc) nl7Var.invoke(str, Integer.valueOf(i));
        return new dxc(dxcVar.m23922a(), xk7Var.invoke(dxcVar.m23923b()));
    }

    /* renamed from: z */
    public static final nl7 m18020z(final int i, final int i2, final kl8 kl8Var) {
        sq8.m48649h(kl8Var, "range");
        return new nl7() { // from class: o.uxc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return ayc.m17970A(i, i2, kl8Var, (String) obj, ((Integer) obj2).intValue());
            }
        };
    }
}
