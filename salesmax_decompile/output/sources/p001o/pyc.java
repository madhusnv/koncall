package p001o;

import org.apache.http.message.TokenParser;
import p001o.jta;

/* loaded from: classes3.dex */
public abstract class pyc {

    /* renamed from: a */
    public static final mge f40728a = new mge("(-)?(\\d+(.(\\d+))?)E(-?\\d+)", sge.IGNORE_CASE);

    /* renamed from: o.pyc$a */
    public /* synthetic */ class C16210a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C16210a f40729a = new C16210a();

        public C16210a() {
            super(2, pyc.class, "sp", "sp(Ljava/lang/String;I)Laws/smithy/kotlin/runtime/time/ParseResult;", 1);
        }

        /* renamed from: b */
        public final dxc m44350b(String str, int i) {
            sq8.m48649h(str, "p0");
            return pyc.m44308I(str, i);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m44350b((String) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: o.pyc$b */
    public static final class C16211b implements xk7 {

        /* renamed from: a */
        public static final C16211b f40730a = new C16211b();

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(hwc hwcVar) {
            sq8.m48649h(hwcVar, "it");
            return null;
        }
    }

    /* renamed from: o.pyc$c */
    public /* synthetic */ class C16212c extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C16212c f40731a = new C16212c();

        public C16212c() {
            super(2, pyc.class, "sp", "sp(Ljava/lang/String;I)Laws/smithy/kotlin/runtime/time/ParseResult;", 1);
        }

        /* renamed from: b */
        public final dxc m44352b(String str, int i) {
            sq8.m48649h(str, "p0");
            return pyc.m44308I(str, i);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m44352b((String) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: o.pyc$d */
    public /* synthetic */ class C16213d extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C16213d f40732a = new C16213d();

        public C16213d() {
            super(2, pyc.class, "sp", "sp(Ljava/lang/String;I)Laws/smithy/kotlin/runtime/time/ParseResult;", 1);
        }

        /* renamed from: b */
        public final dxc m44353b(String str, int i) {
            sq8.m48649h(str, "p0");
            return pyc.m44308I(str, i);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m44353b((String) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: o.pyc$e */
    public /* synthetic */ class C16214e extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C16214e f40733a = new C16214e();

        public C16214e() {
            super(2, pyc.class, "sp", "sp(Ljava/lang/String;I)Laws/smithy/kotlin/runtime/time/ParseResult;", 1);
        }

        /* renamed from: b */
        public final dxc m44354b(String str, int i) {
            sq8.m48649h(str, "p0");
            return pyc.m44308I(str, i);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m44354b((String) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: o.pyc$f */
    public /* synthetic */ class C16215f extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C16215f f40734a = new C16215f();

        public C16215f() {
            super(2, pyc.class, "sp", "sp(Ljava/lang/String;I)Laws/smithy/kotlin/runtime/time/ParseResult;", 1);
        }

        /* renamed from: b */
        public final dxc m44355b(String str, int i) {
            sq8.m48649h(str, "p0");
            return pyc.m44308I(str, i);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m44355b((String) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: A */
    public static final fxc m44300A(String str) {
        sq8.m48649h(str, "input");
        dxc dxcVar = (dxc) m44336m().invoke(str, 0);
        int iM23922a = dxcVar.m23922a();
        exc excVar = (exc) dxcVar.m23923b();
        gxc gxcVar = iM23922a == str.length() ? new gxc(0, 0, 0, 0, 0) : (gxc) ((dxc) ayc.m17978I(ayc.m17972C("Tt"), m44347x()).invoke(str, Integer.valueOf(iM23922a))).m23923b();
        return new fxc(excVar.m25721c(), excVar.m25720b(), excVar.m25719a(), gxcVar.m29624a(), gxcVar.m29625b(), gxcVar.m29628e(), gxcVar.m29626c(), gxcVar.m29627d());
    }

    /* renamed from: B */
    public static final fxc m44301B(String str) {
        sq8.m48649h(str, "input");
        dxc dxcVar = (dxc) m44337n(1).invoke(str, Integer.valueOf(((!(f9g.d0(str) ^ true) || ayc.m18017w(str.charAt(0))) ? new dxc(0, null) : (dxc) ayc.m18018x(ayc.m17993X(ayc.m17993X(m44345v(), ayc.m18012r(',')), C16210a.f40729a), C16211b.f40730a).invoke(str, 0)).m23922a()));
        int iM23922a = dxcVar.m23922a();
        int iIntValue = ((Number) dxcVar.m23923b()).intValue();
        dxc dxcVar2 = (dxc) ayc.m17978I(C16212c.f40731a, m44340q()).invoke(str, Integer.valueOf(iM23922a));
        int iM23922a2 = dxcVar2.m23922a();
        int iIntValue2 = ((Number) dxcVar2.m23923b()).intValue();
        dxc dxcVar3 = (dxc) ayc.m17978I(C16213d.f40732a, m44342s()).invoke(str, Integer.valueOf(iM23922a2));
        int iM23922a3 = dxcVar3.m23922a();
        int iIntValue3 = ((Number) dxcVar3.m23923b()).intValue();
        gxc gxcVar = (gxc) ((dxc) ayc.m17978I(C16214e.f40733a, m44303D()).invoke(str, Integer.valueOf(iM23922a3))).m23923b();
        return new fxc(iIntValue3, iIntValue2, iIntValue, gxcVar.m29624a(), gxcVar.m29625b(), gxcVar.m29628e(), gxcVar.m29626c(), gxcVar.m29627d());
    }

    /* renamed from: C */
    public static final hwc m44302C(String str, char c) {
        if (!f9g.m26305O(str, c, false, 2, null)) {
            return vyh.m53620a(str, Integer.valueOf(str.length()));
        }
        int iA0 = f9g.a0(str, c, 0, false, 6, null);
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, iA0);
        sq8.m48648g(strSubstring, "substring(...)");
        sb.append(strSubstring);
        String strSubstring2 = str.substring(iA0 + 1);
        sq8.m48648g(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return vyh.m53620a(sb.toString(), Integer.valueOf(iA0));
    }

    /* renamed from: D */
    public static final nl7 m44303D() {
        return new nl7() { // from class: o.hyc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return pyc.m44304E((String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: E */
    public static final dxc m44304E(String str, int i) {
        sq8.m48649h(str, "str");
        dxc dxcVar = (dxc) m44311L().invoke(str, Integer.valueOf(i));
        int iM23922a = dxcVar.m23922a();
        int iIntValue = ((Number) dxcVar.m23923b()).intValue();
        dxc dxcVar2 = (dxc) ayc.m17978I(ayc.m18012r(':'), m44312M()).invoke(str, Integer.valueOf(iM23922a));
        int iM23922a2 = dxcVar2.m23922a();
        int iIntValue2 = ((Number) dxcVar2.m23923b()).intValue();
        dxc dxcVar3 = (iM23922a2 >= str.length() || str.charAt(iM23922a2) != ':') ? new dxc(iM23922a2, 0) : (dxc) ayc.m17978I(ayc.m18012r(':'), m44314O()).invoke(str, Integer.valueOf(iM23922a2));
        int iM23922a3 = dxcVar3.m23922a();
        int iIntValue3 = ((Number) dxcVar3.m23923b()).intValue();
        dxc dxcVar4 = (dxc) ayc.m17976G(ayc.m17978I(ayc.m17972C("."), m44313N()), 0).invoke(str, Integer.valueOf(iM23922a3));
        int iM23922a4 = dxcVar4.m23922a();
        int iIntValue4 = ((Number) dxcVar4.m23923b()).intValue();
        dxc dxcVar5 = (dxc) ayc.m17978I(C16215f.f40734a, m44319T()).invoke(str, Integer.valueOf(iM23922a4));
        return new dxc(dxcVar5.m23922a(), new gxc(iIntValue, iIntValue2, iIntValue3, iIntValue4, ((Number) dxcVar5.m23923b()).intValue()));
    }

    /* renamed from: F */
    public static final nl7 m44305F() {
        return new nl7() { // from class: o.nyc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return pyc.m44306G((String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: G */
    public static final dxc m44306G(String str, int i) {
        sq8.m48649h(str, "str");
        dxc dxcVar = (dxc) ayc.m18018x(ayc.m18010p(ayc.m18012r('+'), ayc.m18012r('-')), new xk7() { // from class: o.eyc
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return Integer.valueOf(pyc.m44307H(((Character) obj).charValue()));
            }
        }).invoke(str, Integer.valueOf(i));
        return new dxc(dxcVar.m23922a(), Integer.valueOf(((Number) dxcVar.m23923b()).intValue()));
    }

    /* renamed from: H */
    public static final int m44307H(char c) {
        return c == '-' ? -1 : 1;
    }

    /* renamed from: I */
    public static final dxc m44308I(String str, int i) {
        return (dxc) ayc.m18012r(TokenParser.SP).invoke(str, Integer.valueOf(i));
    }

    /* renamed from: J */
    public static final hwc m44309J(String str, int i, char c) {
        if (i <= 0) {
            return vyh.m53620a(String.valueOf(c), f9g.o0(str, str.length() - i, c));
        }
        if (i >= str.length()) {
            return vyh.m53620a(f9g.m0(str, i, c), String.valueOf(c));
        }
        String strSubstring = str.substring(0, i);
        sq8.m48648g(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(i);
        sq8.m48648g(strSubstring2, "substring(...)");
        return vyh.m53620a(strSubstring, strSubstring2);
    }

    /* renamed from: K */
    public static /* synthetic */ hwc m44310K(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = '0';
        }
        return m44309J(str, i, c);
    }

    /* renamed from: L */
    public static final nl7 m44311L() {
        return ayc.m17971B(2, new kl8(0, 24));
    }

    /* renamed from: M */
    public static final nl7 m44312M() {
        return ayc.m17971B(2, new kl8(0, 59));
    }

    /* renamed from: N */
    public static final nl7 m44313N() {
        return ayc.m18015u(1, 9, 9);
    }

    /* renamed from: O */
    public static final nl7 m44314O() {
        return ayc.m17971B(2, new kl8(0, 60));
    }

    /* renamed from: P */
    public static final nl7 m44315P() {
        return new nl7() { // from class: o.myc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return pyc.m44316Q((String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: Q */
    public static final dxc m44316Q(String str, int i) {
        sq8.m48649h(str, "str");
        dxc dxcVar = (dxc) m44305F().invoke(str, Integer.valueOf(i));
        int iM23922a = dxcVar.m23922a();
        int iIntValue = ((Number) dxcVar.m23923b()).intValue();
        dxc dxcVar2 = (dxc) m44311L().invoke(str, Integer.valueOf(iM23922a));
        int iM23922a2 = dxcVar2.m23922a();
        int iIntValue2 = ((Number) dxcVar2.m23923b()).intValue();
        int iM23922a3 = ((dxc) ayc.m17974E(ayc.m18012r(':')).invoke(str, Integer.valueOf(iM23922a2))).m23922a();
        dxc dxcVar3 = iM23922a3 < str.length() ? (dxc) m44312M().invoke(str, Integer.valueOf(iM23922a3)) : new dxc(iM23922a3, 0);
        return new dxc(dxcVar3.m23922a(), Integer.valueOf(iIntValue * ((iIntValue2 * 3600) + (((Number) dxcVar3.m23923b()).intValue() * 60))));
    }

    /* renamed from: R */
    public static final nl7 m44317R() {
        return new nl7() { // from class: o.jyc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return pyc.m44318S((String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: S */
    public static final dxc m44318S(String str, int i) {
        sq8.m48649h(str, "str");
        try {
            return (dxc) ayc.m18010p(m44322W(), m44315P()).invoke(str, Integer.valueOf(i));
        } catch (bxc unused) {
            throw new bxc(str, "invalid timezone offset; expected `Z|z` or `(+-)HH:MM`", i);
        }
    }

    /* renamed from: T */
    public static final nl7 m44319T() {
        return new nl7() { // from class: o.iyc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return pyc.m44320U((String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: U */
    public static final dxc m44320U(String str, int i) {
        sq8.m48649h(str, "str");
        try {
            return (dxc) ayc.m18010p(ayc.m18018x(ayc.m18010p(ayc.m17982M("GMT"), ayc.m17982M("UTC"), ayc.m17982M("UT"), ayc.m17982M("Z")), new xk7() { // from class: o.lyc
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return Integer.valueOf(pyc.m44321V((String) obj));
                }
            }), m44315P()).invoke(str, Integer.valueOf(i));
        } catch (bxc unused) {
            throw new bxc(str, "invalid timezone offset; expected `GMT` or `(+-)HHMM`", i);
        }
    }

    /* renamed from: V */
    public static final int m44321V(String str) {
        sq8.m48649h(str, "it");
        return 0;
    }

    /* renamed from: W */
    public static final nl7 m44322W() {
        return ayc.m18018x(ayc.m17972C("Zz"), new xk7() { // from class: o.kyc
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return Integer.valueOf(pyc.m44323X(((Character) obj).charValue()));
            }
        });
    }

    /* renamed from: X */
    public static final int m44323X(char c) {
        return 0;
    }

    /* renamed from: m */
    public static final nl7 m44336m() {
        return m44343t();
    }

    /* renamed from: n */
    public static final nl7 m44337n(int i) {
        return ayc.m18020z(i, 2, new kl8(1, 31));
    }

    /* renamed from: o */
    public static /* synthetic */ nl7 m44338o(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return m44337n(i);
    }

    /* renamed from: p */
    public static final nl7 m44339p() {
        return ayc.m17971B(2, new kl8(1, 12));
    }

    /* renamed from: q */
    public static final nl7 m44340q() {
        return new nl7() { // from class: o.fyc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return pyc.m44341r((String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r2.equals("Mar") != false) goto L41;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dxc m44341r(String str, int i) {
        sq8.m48649h(str, "str");
        int i2 = 3;
        ayc.m17980K(str, i, 3);
        int i3 = i + 3;
        String strSubstring = str.substring(i, i3);
        sq8.m48648g(strSubstring, "substring(...)");
        switch (strSubstring.hashCode()) {
            case 66051:
                if (strSubstring.equals("Apr")) {
                    i2 = 4;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 66195:
                if (strSubstring.equals("Aug")) {
                    i2 = 8;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 68578:
                if (strSubstring.equals("Dec")) {
                    i2 = 12;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 70499:
                if (strSubstring.equals("Feb")) {
                    i2 = 2;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 74231:
                if (strSubstring.equals("Jan")) {
                    i2 = 1;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 74849:
                if (strSubstring.equals("Jul")) {
                    i2 = 7;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 74851:
                if (strSubstring.equals("Jun")) {
                    i2 = 6;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 77118:
                break;
            case 77125:
                if (strSubstring.equals("May")) {
                    i2 = 5;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 78517:
                if (strSubstring.equals("Nov")) {
                    i2 = 11;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 79104:
                if (strSubstring.equals("Oct")) {
                    i2 = 10;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
            case 83006:
                if (strSubstring.equals("Sep")) {
                    i2 = 9;
                    return new dxc(i3, Integer.valueOf(i2));
                }
                break;
        }
        throw new bxc(str, "invalid month `" + strSubstring + '`', i);
    }

    /* renamed from: s */
    public static final nl7 m44342s() {
        return ayc.m17990U(4);
    }

    /* renamed from: t */
    public static final nl7 m44343t() {
        return new nl7() { // from class: o.gyc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return pyc.m44344u((String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: u */
    public static final dxc m44344u(String str, int i) {
        sq8.m48649h(str, "str");
        dxc dxcVar = (dxc) m44342s().invoke(str, Integer.valueOf(i));
        int iM23922a = dxcVar.m23922a();
        int iIntValue = ((Number) dxcVar.m23923b()).intValue();
        dxc dxcVar2 = (dxc) m44339p().invoke(str, Integer.valueOf(((dxc) ayc.m17974E(ayc.m18012r('-')).invoke(str, Integer.valueOf(iM23922a))).m23922a()));
        int iM23922a2 = dxcVar2.m23922a();
        int iIntValue2 = ((Number) dxcVar2.m23923b()).intValue();
        dxc dxcVar3 = (dxc) m44338o(0, 1, null).invoke(str, Integer.valueOf(((dxc) ayc.m17974E(ayc.m18012r('-')).invoke(str, Integer.valueOf(iM23922a2))).m23922a()));
        return new dxc(dxcVar3.m23922a(), new exc(iIntValue, iIntValue2, ((Number) dxcVar3.m23923b()).intValue()));
    }

    /* renamed from: v */
    public static final nl7 m44345v() {
        return ayc.m18010p(ayc.m17982M("Mon"), ayc.m17982M("Tue"), ayc.m17982M("Wed"), ayc.m17982M("Thu"), ayc.m17982M("Fri"), ayc.m17982M("Sat"), ayc.m17982M("Sun"));
    }

    /* renamed from: w */
    public static final String m44346w(String str) {
        jta jtaVarM38994f = f40728a.m38994f(str);
        if (jtaVarM38994f == null) {
            return str;
        }
        jta.C14655b c14655bMo34492a = jtaVarM38994f.mo34492a();
        String str2 = (String) c14655bMo34492a.m34496a().mo34493b().get(1);
        String str3 = (String) c14655bMo34492a.m34496a().mo34493b().get(2);
        String str4 = (String) c14655bMo34492a.m34496a().mo34493b().get(5);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        hwc hwcVarM44302C = m44302C(str3, '.');
        String str5 = (String) hwcVarM44302C.m31227a();
        int iIntValue = ((Number) hwcVarM44302C.m31228b()).intValue();
        Integer numM22638l = d9g.m22638l(str4);
        if (numM22638l == null) {
            throw new bxc(str, "Failed to read exponent", 0);
        }
        hwc hwcVarM44310K = m44310K(str5, iIntValue + numM22638l.intValue(), (char) 0, 2, null);
        String str6 = (String) hwcVarM44310K.m31227a();
        String str7 = (String) hwcVarM44310K.m31228b();
        sb.append(str6);
        sb.append('.');
        sb.append(str7);
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string == null ? str : string;
    }

    /* renamed from: x */
    public static final nl7 m44347x() {
        return new nl7() { // from class: o.dyc
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return pyc.m44348y((String) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* renamed from: y */
    public static final dxc m44348y(String str, int i) {
        sq8.m48649h(str, "str");
        dxc dxcVar = (dxc) m44311L().invoke(str, Integer.valueOf(i));
        int iM23922a = dxcVar.m23922a();
        int iIntValue = ((Number) dxcVar.m23923b()).intValue();
        dxc dxcVar2 = (dxc) m44312M().invoke(str, Integer.valueOf(((dxc) ayc.m17974E(ayc.m18012r(':')).invoke(str, Integer.valueOf(iM23922a))).m23922a()));
        int iM23922a2 = dxcVar2.m23922a();
        int iIntValue2 = ((Number) dxcVar2.m23923b()).intValue();
        dxc dxcVar3 = (dxc) m44314O().invoke(str, Integer.valueOf(((dxc) ayc.m17974E(ayc.m18012r(':')).invoke(str, Integer.valueOf(iM23922a2))).m23922a()));
        int iM23922a3 = dxcVar3.m23922a();
        int iIntValue3 = ((Number) dxcVar3.m23923b()).intValue();
        dxc dxcVar4 = (dxc) ayc.m17976G(ayc.m17978I(ayc.m17972C(".,"), m44313N()), 0).invoke(str, Integer.valueOf(iM23922a3));
        int iM23922a4 = dxcVar4.m23922a();
        int iIntValue4 = ((Number) dxcVar4.m23923b()).intValue();
        dxc dxcVar5 = (dxc) m44317R().invoke(str, Integer.valueOf(iM23922a4));
        return new dxc(dxcVar5.m23922a(), new gxc(iIntValue, iIntValue2, iIntValue3, iIntValue4, ((Number) dxcVar5.m23923b()).intValue()));
    }

    /* renamed from: z */
    public static final gk8 m44349z(String str) {
        sq8.m48649h(str, "input");
        String strM44346w = m44346w(str);
        dxc dxcVar = (dxc) ayc.m17986Q(1, 19).invoke(strM44346w, 0);
        int iM23922a = dxcVar.m23922a();
        long jLongValue = ((Number) dxcVar.m23923b()).longValue();
        if (iM23922a == strM44346w.length()) {
            return gk8.f25374b.m28958a(jLongValue, 0);
        }
        return gk8.f25374b.m28958a(jLongValue, ((Number) ((dxc) ayc.m17978I(ayc.m18012r('.'), ayc.m18015u(1, 9, 9)).invoke(strM44346w, Integer.valueOf(iM23922a))).m23923b()).intValue());
    }
}
