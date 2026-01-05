package p001o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class mge implements Serializable {

    /* renamed from: b */
    public static final C15315a f35402b = new C15315a(null);

    /* renamed from: a */
    public final Pattern f35403a;

    /* renamed from: o.mge$a */
    public static final class C15315a {
        public C15315a() {
        }

        public /* synthetic */ C15315a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final int m39000b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }
    }

    /* renamed from: o.mge$b */
    public static final class C15316b implements Serializable {

        /* renamed from: c */
        public static final a f35404c = new a(null);

        /* renamed from: a */
        public final String f35405a;

        /* renamed from: b */
        public final int f35406b;

        /* renamed from: o.mge$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C15316b(String str, int i) {
            sq8.m48649h(str, "pattern");
            this.f35405a = str;
            this.f35406b = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f35405a, this.f35406b);
            sq8.m48648g(patternCompile, "compile(...)");
            return new mge(patternCompile);
        }
    }

    /* renamed from: o.mge$c */
    public static final class C15317c extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ CharSequence f35408b;

        /* renamed from: c */
        public final /* synthetic */ int f35409c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15317c(CharSequence charSequence, int i) {
            super(0);
            this.f35408b = charSequence;
            this.f35409c = i;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jta invoke() {
            return mge.this.m38992b(this.f35408b, this.f35409c);
        }
    }

    /* renamed from: o.mge$d */
    public /* synthetic */ class C15318d extends dm7 implements xk7 {

        /* renamed from: a */
        public static final C15318d f35410a = new C15318d();

        public C15318d() {
            super(1, jta.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final jta invoke(jta jtaVar) {
            sq8.m48649h(jtaVar, "p0");
            return jtaVar.next();
        }
    }

    public mge(Pattern pattern) {
        sq8.m48649h(pattern, "nativePattern");
        this.f35403a = pattern;
    }

    /* renamed from: c */
    public static /* synthetic */ jta m38989c(mge mgeVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return mgeVar.m38992b(charSequence, i);
    }

    /* renamed from: e */
    public static /* synthetic */ ief m38990e(mge mgeVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return mgeVar.m38993d(charSequence, i);
    }

    private final Object writeReplace() {
        String strPattern = this.f35403a.pattern();
        sq8.m48648g(strPattern, "pattern(...)");
        return new C15316b(strPattern, this.f35403a.flags());
    }

    /* renamed from: a */
    public final boolean m38991a(CharSequence charSequence) {
        sq8.m48649h(charSequence, "input");
        return this.f35403a.matcher(charSequence).find();
    }

    /* renamed from: b */
    public final jta m38992b(CharSequence charSequence, int i) {
        sq8.m48649h(charSequence, "input");
        Matcher matcher = this.f35403a.matcher(charSequence);
        sq8.m48648g(matcher, "matcher(...)");
        return rge.m46737e(matcher, i, charSequence);
    }

    /* renamed from: d */
    public final ief m38993d(CharSequence charSequence, int i) {
        sq8.m48649h(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return oef.m42148g(new C15317c(charSequence, i), C15318d.f35410a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    /* renamed from: f */
    public final jta m38994f(CharSequence charSequence) {
        sq8.m48649h(charSequence, "input");
        Matcher matcher = this.f35403a.matcher(charSequence);
        sq8.m48648g(matcher, "matcher(...)");
        return rge.m46738f(matcher, charSequence);
    }

    /* renamed from: g */
    public final boolean m38995g(CharSequence charSequence) {
        sq8.m48649h(charSequence, "input");
        return this.f35403a.matcher(charSequence).matches();
    }

    /* renamed from: h */
    public final String m38996h(CharSequence charSequence, String str) {
        sq8.m48649h(charSequence, "input");
        sq8.m48649h(str, "replacement");
        String strReplaceAll = this.f35403a.matcher(charSequence).replaceAll(str);
        sq8.m48648g(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* renamed from: i */
    public final String m38997i(CharSequence charSequence, xk7 xk7Var) {
        sq8.m48649h(charSequence, "input");
        sq8.m48649h(xk7Var, "transform");
        int iIntValue = 0;
        jta jtaVarM38989c = m38989c(this, charSequence, 0, 2, null);
        if (jtaVarM38989c == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, iIntValue, jtaVarM38989c.getRange().getStart().intValue());
            sb.append((CharSequence) xk7Var.invoke(jtaVarM38989c));
            iIntValue = jtaVarM38989c.getRange().getEndInclusive().intValue() + 1;
            jtaVarM38989c = jtaVarM38989c.next();
            if (iIntValue >= length) {
                break;
            }
        } while (jtaVarM38989c != null);
        if (iIntValue < length) {
            sb.append(charSequence, iIntValue, length);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: j */
    public final List m38998j(CharSequence charSequence, int i) {
        sq8.m48649h(charSequence, "input");
        f9g.y0(i);
        Matcher matcher = this.f35403a.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return bh3.m18963e(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i > 0 ? bce.m18604g(i, 10) : 10);
        int i2 = i - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i2 >= 0 && arrayList.size() == i2) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f35403a.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mge(String str) {
        sq8.m48649h(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        sq8.m48648g(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mge(String str, sge sgeVar) {
        sq8.m48649h(str, "pattern");
        sq8.m48649h(sgeVar, "option");
        Pattern patternCompile = Pattern.compile(str, f35402b.m39000b(sgeVar.getValue()));
        sq8.m48648g(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
