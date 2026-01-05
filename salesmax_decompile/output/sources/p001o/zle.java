package p001o;

import java.util.regex.Pattern;
import p001o.gd7;
import p001o.oob;
import p001o.ule;
import p001o.w48;
import p001o.wx7;

/* loaded from: classes6.dex */
public final class zle {

    /* renamed from: l */
    public static final char[] f57368l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f57369m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f57370a;

    /* renamed from: b */
    public final w48 f57371b;

    /* renamed from: c */
    public String f57372c;

    /* renamed from: d */
    public w48.C17774a f57373d;

    /* renamed from: e */
    public final ule.C17397a f57374e = new ule.C17397a();

    /* renamed from: f */
    public final wx7.C17997a f57375f;

    /* renamed from: g */
    public y9b f57376g;

    /* renamed from: h */
    public final boolean f57377h;

    /* renamed from: i */
    public oob.C15854a f57378i;

    /* renamed from: j */
    public gd7.C13682a f57379j;

    /* renamed from: k */
    public xle f57380k;

    /* renamed from: o.zle$a */
    public static class C18679a extends xle {

        /* renamed from: b */
        public final xle f57381b;

        /* renamed from: c */
        public final y9b f57382c;

        public C18679a(xle xleVar, y9b y9bVar) {
            this.f57381b = xleVar;
            this.f57382c = y9bVar;
        }

        @Override // p001o.xle
        /* renamed from: a */
        public long mo18953a() {
            return this.f57381b.mo18953a();
        }

        @Override // p001o.xle
        /* renamed from: b */
        public y9b mo18954b() {
            return this.f57382c;
        }

        @Override // p001o.xle
        /* renamed from: i */
        public void mo18955i(gm1 gm1Var) {
            this.f57381b.mo18955i(gm1Var);
        }
    }

    public zle(String str, w48 w48Var, String str2, wx7 wx7Var, y9b y9bVar, boolean z, boolean z2, boolean z3) {
        this.f57370a = str;
        this.f57371b = w48Var;
        this.f57372c = str2;
        this.f57376g = y9bVar;
        this.f57377h = z;
        if (wx7Var != null) {
            this.f57375f = wx7Var.m55331o();
        } else {
            this.f57375f = new wx7.C17997a();
        }
        if (z2) {
            this.f57379j = new gd7.C13682a();
        } else if (z3) {
            oob.C15854a c15854a = new oob.C15854a();
            this.f57378i = c15854a;
            c15854a.m42504d(oob.f38670l);
        }
    }

    /* renamed from: i */
    public static String m59585i(String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                rl1 rl1Var = new rl1();
                rl1Var.mo29025i(str, 0, iCharCount);
                m59586j(rl1Var, str, iCharCount, length, z);
                return rl1Var.m46909T();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m59586j(rl1 rl1Var, String str, int i, int i2, boolean z) {
        rl1 rl1Var2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (rl1Var2 == null) {
                        rl1Var2 = new rl1();
                    }
                    rl1Var2.mo29022G(iCodePointAt);
                    while (!rl1Var2.mo32311n()) {
                        int i3 = rl1Var2.readByte() & 255;
                        rl1Var.T1(37);
                        char[] cArr = f57368l;
                        rl1Var.T1(cArr[(i3 >> 4) & 15]);
                        rl1Var.T1(cArr[i3 & 15]);
                    }
                } else {
                    rl1Var.mo29022G(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* renamed from: a */
    public void m59587a(String str, String str2, boolean z) {
        if (z) {
            this.f57379j.m28476b(str, str2);
        } else {
            this.f57379j.m28475a(str, str2);
        }
    }

    /* renamed from: b */
    public void m59588b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f57375f.m55335a(str, str2);
            return;
        }
        try {
            this.f57376g = y9b.m57396c(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e);
        }
    }

    /* renamed from: c */
    public void m59589c(wx7 wx7Var) {
        this.f57375f.m55336b(wx7Var);
    }

    /* renamed from: d */
    public void m59590d(wx7 wx7Var, xle xleVar) {
        this.f57378i.m42501a(wx7Var, xleVar);
    }

    /* renamed from: e */
    public void m59591e(oob.C15856c c15856c) {
        this.f57378i.m42502b(c15856c);
    }

    /* renamed from: f */
    public void m59592f(String str, String str2, boolean z) {
        if (this.f57372c == null) {
            throw new AssertionError();
        }
        String strM59585i = m59585i(str2, z);
        String strReplace = this.f57372c.replace("{" + str + "}", strM59585i);
        if (!f57369m.matcher(strReplace).matches()) {
            this.f57372c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* renamed from: g */
    public void m59593g(String str, String str2, boolean z) {
        String str3 = this.f57372c;
        if (str3 != null) {
            w48.C17774a c17774aM53880k = this.f57371b.m53880k(str3);
            this.f57373d = c17774aM53880k;
            if (c17774aM53880k == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f57371b + ", Relative: " + this.f57372c);
            }
            this.f57372c = null;
        }
        if (z) {
            this.f57373d.m53898a(str, str2);
        } else {
            this.f57373d.m53902e(str, str2);
        }
    }

    /* renamed from: h */
    public void m59594h(Class cls, Object obj) {
        this.f57374e.m51768y(cls, obj);
    }

    /* renamed from: k */
    public ule.C17397a m59595k() {
        w48 w48VarM53885q;
        w48.C17774a c17774a = this.f57373d;
        if (c17774a != null) {
            w48VarM53885q = c17774a.m53903f();
        } else {
            w48VarM53885q = this.f57371b.m53885q(this.f57372c);
            if (w48VarM53885q == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f57371b + ", Relative: " + this.f57372c);
            }
        }
        xle c18679a = this.f57380k;
        if (c18679a == null) {
            gd7.C13682a c13682a = this.f57379j;
            if (c13682a != null) {
                c18679a = c13682a.m28477c();
            } else {
                oob.C15854a c15854a = this.f57378i;
                if (c15854a != null) {
                    c18679a = c15854a.m42503c();
                } else if (this.f57377h) {
                    c18679a = xle.m56454d(null, new byte[0]);
                }
            }
        }
        y9b y9bVar = this.f57376g;
        if (y9bVar != null) {
            if (c18679a != null) {
                c18679a = new C18679a(c18679a, y9bVar);
            } else {
                this.f57375f.m55335a("Content-Type", y9bVar.toString());
            }
        }
        return this.f57374e.m51744B(w48VarM53885q).m51758o(this.f57375f.m55340f()).m51759p(this.f57370a, c18679a);
    }

    /* renamed from: l */
    public void m59596l(xle xleVar) {
        this.f57380k = xleVar;
    }

    /* renamed from: m */
    public void m59597m(Object obj) {
        this.f57372c = obj.toString();
    }
}
