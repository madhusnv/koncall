package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.List;
import org.apache.http.message.TokenParser;
import p001o.xa9;

/* loaded from: classes3.dex */
public final class o99 implements qa9 {

    /* renamed from: a */
    public final byte[] f37968a;

    /* renamed from: b */
    public xa9 f37969b;

    /* renamed from: c */
    public final y4g f37970c;

    /* renamed from: d */
    public int f37971d;

    /* renamed from: o.o99$a */
    public /* synthetic */ class C15737a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37972a;

        static {
            int[] iArr = new int[yba.values().length];
            try {
                iArr[yba.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yba.ArrayFirstValueOrEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yba.ArrayNextValueOrEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yba.ObjectFirstKeyOrEnd.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[yba.ObjectNextKeyOrEnd.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[yba.ObjectFieldValue.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f37972a = iArr;
        }
    }

    public o99(byte[] bArr) {
        sq8.m48649h(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f37968a = bArr;
        this.f37970c = new y4g(null, null, 3, null);
    }

    /* renamed from: D */
    public static final y3i m41808D(List list) {
        sq8.m48649h(list, "it");
        t2g.m49208d(list, yba.ObjectFieldValue);
        return y3i.f54824a;
    }

    /* renamed from: I */
    public static final y3i m41809I(List list) {
        sq8.m48649h(list, "it");
        t2g.m49207c(list, yba.ArrayFirstValueOrEnd);
        return y3i.f54824a;
    }

    /* renamed from: K */
    public static final y3i m41810K(List list) {
        sq8.m48649h(list, "it");
        t2g.m49207c(list, yba.ObjectFirstKeyOrEnd);
        return y3i.f54824a;
    }

    /* renamed from: M */
    public static final y3i m41811M(List list) {
        sq8.m48649h(list, "it");
        t2g.m49208d(list, yba.ArrayNextValueOrEnd);
        return y3i.f54824a;
    }

    /* renamed from: P */
    public static final y3i m41812P(List list) {
        sq8.m48649h(list, "it");
        t2g.m49208d(list, yba.ObjectNextKeyOrEnd);
        return y3i.f54824a;
    }

    /* renamed from: T */
    public static final CharSequence m41813T(String str) {
        sq8.m48649h(str, "it");
        return '`' + str + '`';
    }

    /* renamed from: p */
    public static final y3i m41824p(List list) {
        sq8.m48649h(list, "it");
        t2g.m49205a(list);
        return y3i.f54824a;
    }

    /* renamed from: r */
    public static final y3i m41825r(List list) {
        sq8.m48649h(list, "it");
        t2g.m49205a(list);
        return y3i.f54824a;
    }

    /* renamed from: t */
    public static /* synthetic */ Void m41826t(o99 o99Var, String str, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = o99Var.f37971d;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return o99Var.m41847s(str, i, th);
    }

    /* renamed from: A */
    public final xa9 m41827A() {
        char cM41852y = m41852y();
        if (cM41852y == 'f') {
            return m41828B("false", new xa9.C18087c(false));
        }
        if (cM41852y == 'n') {
            return m41828B("null", xa9.C18092h.f53430a);
        }
        if (cM41852y == 't') {
            return m41828B("true", new xa9.C18087c(true));
        }
        m41826t(this, "Unable to handle keyword starting with '" + cM41852y + '\'', 0, null, 6, null);
        throw new qe9();
    }

    /* renamed from: B */
    public final xa9 m41828B(String str, xa9 xa9Var) {
        m41843m(str);
        return xa9Var;
    }

    /* renamed from: C */
    public final xa9 m41829C() {
        char cM41852y = m41852y();
        if (cM41852y != '\"') {
            m41840S(Character.valueOf(cM41852y), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            throw new qe9();
        }
        String strM41831F = m41831F();
        this.f37970c.m57209c(new xk7() { // from class: o.m99
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return o99.m41808D((List) obj);
            }
        });
        return new xa9.C18091g(strM41831F);
    }

    /* renamed from: E */
    public final xa9 m41830E() throws IOException {
        StringBuilder sb = new StringBuilder();
        Character chM41851x = m41851x();
        if (chM41851x != null && chM41851x.charValue() == '-') {
            sb.append(m41849v());
        }
        m41853z(sb);
        Character chM41851x2 = m41851x();
        if (chM41851x2 != null && chM41851x2.charValue() == '.') {
            sb.append(m41849v());
            m41853z(sb);
        }
        if (kh3.m35708X(p99.f39673b, m41851x())) {
            sb.append(m41849v());
            if (kh3.m35708X(p99.f39674c, m41851x())) {
                sb.append(m41849v());
            }
            m41853z(sb);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        boolean z = string.length() > 0;
        int i = this.f37971d;
        if (z) {
            return new xa9.C18093i(string);
        }
        m41826t(this, ("Invalid number, expected `-` || 0..9, found `" + m41851x() + '`').toString(), i, null, 4, null);
        throw new qe9();
    }

    /* renamed from: F */
    public final String m41831F() {
        m41842l(TokenParser.DQUOTE);
        int i = this.f37971d;
        char cM41852y = m41852y();
        boolean z = false;
        while (cM41852y != '\"') {
            if (cM41852y == '\\') {
                m41849v();
                char cM41849v = m41849v();
                if (cM41849v != '\"' && cM41849v != '/' && cM41849v != '\\' && cM41849v != 'b' && cM41849v != 'f' && cM41849v != 'n' && cM41849v != 'r' && cM41849v != 't') {
                    if (cM41849v != 'u') {
                        m41826t(this, "Invalid escape character: `" + cM41849v + '`', this.f37971d - 1, null, 4, null);
                        throw new qe9();
                    }
                    int i2 = this.f37971d;
                    if (i2 + 4 >= this.f37968a.length) {
                        m41826t(this, "Unexpected EOF reading escaped unicode string", i2, null, 4, null);
                        throw new qe9();
                    }
                    this.f37971d = i2 + 4;
                }
                z = true;
            } else {
                if (p99.m43249g(cM41852y)) {
                    m41826t(this, "Unexpected control character: `" + cM41852y + '`', 0, null, 6, null);
                    throw new qe9();
                }
                this.f37971d++;
            }
            cM41852y = m41852y();
        }
        String strM24602t = e9g.m24602t(this.f37968a, i, this.f37971d, false, 4, null);
        m41842l(TokenParser.DQUOTE);
        if (!z) {
            return strM24602t;
        }
        try {
            return p99.m43251i(strM24602t);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Invalid escaped string";
            }
            m41826t(this, message, i - 1, null, 4, null);
            throw new qe9();
        }
    }

    /* renamed from: G */
    public final xa9 m41832G() {
        Character chM41848u = m41848u(true);
        if (chM41848u != null && chM41848u.charValue() == '{') {
            return m41834J();
        }
        if (chM41848u != null && chM41848u.charValue() == '[') {
            return m41833H();
        }
        if (chM41848u != null && chM41848u.charValue() == '\"') {
            return new xa9.C18094j(m41831F());
        }
        if ((chM41848u != null && chM41848u.charValue() == 't') || ((chM41848u != null && chM41848u.charValue() == 'f') || (chM41848u != null && chM41848u.charValue() == 'n'))) {
            return m41827A();
        }
        if (chM41848u == null || chM41848u.charValue() != '-') {
            if (!(chM41848u != null && new kh2('0', '9').m35702o(chM41848u.charValue()))) {
                if (chM41848u == null) {
                    return xa9.C18089e.f53427a;
                }
                m41840S(chM41848u, "{", "[", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "null", "true", "false", "<number>");
                throw new qe9();
            }
        }
        return m41830E();
    }

    /* renamed from: H */
    public final xa9 m41833H() {
        m41842l('[');
        this.f37970c.m57209c(new xk7() { // from class: o.h99
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return o99.m41809I((List) obj);
            }
        });
        return xa9.C18085a.f53423a;
    }

    /* renamed from: J */
    public final xa9 m41834J() {
        m41842l('{');
        this.f37970c.m57209c(new xk7() { // from class: o.k99
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return o99.m41810K((List) obj);
            }
        });
        return xa9.C18086b.f53424a;
    }

    /* renamed from: L */
    public final xa9 m41835L() {
        Character chM41848u = m41848u(true);
        if (chM41848u != null && chM41848u.charValue() == ']') {
            return m41845o();
        }
        this.f37970c.m57209c(new xk7() { // from class: o.l99
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return o99.m41811M((List) obj);
            }
        });
        return m41832G();
    }

    /* renamed from: N */
    public final xa9 m41836N() {
        Character chM41848u = m41848u(true);
        if (chM41848u != null && chM41848u.charValue() == ']') {
            return m41845o();
        }
        if (chM41848u == null || chM41848u.charValue() != ',') {
            m41840S(chM41848u, ",", "]");
            throw new qe9();
        }
        m41842l(',');
        return m41832G();
    }

    /* renamed from: O */
    public final xa9 m41837O() {
        Character chM41848u = m41848u(true);
        if (chM41848u == null || chM41848u.charValue() != ':') {
            m41840S(chM41848u, ":");
            throw new qe9();
        }
        m41842l(':');
        this.f37970c.m57209c(new xk7() { // from class: o.j99
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return o99.m41812P((List) obj);
            }
        });
        return m41832G();
    }

    /* renamed from: Q */
    public final xa9 m41838Q() {
        Character chM41848u = m41848u(true);
        if (chM41848u != null && chM41848u.charValue() == '}') {
            return m41846q();
        }
        if (chM41848u != null && chM41848u.charValue() == '\"') {
            return m41829C();
        }
        m41840S(chM41848u, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "}");
        throw new qe9();
    }

    /* renamed from: R */
    public final xa9 m41839R() {
        Character chM41848u = m41848u(true);
        if (chM41848u != null && chM41848u.charValue() == '}') {
            return m41846q();
        }
        if (chM41848u == null || chM41848u.charValue() != ',') {
            m41840S(chM41848u, ",", "}");
            throw new qe9();
        }
        m41842l(',');
        m41848u(true);
        return m41829C();
    }

    /* renamed from: S */
    public final Void m41840S(Character ch, String... strArr) {
        String str = strArr.length > 1 ? " one of" : "";
        m41826t(this, "found `" + ch + "`, expected" + str + TokenParser.SP + gp0.r0(strArr, ", ", null, null, 0, null, new xk7() { // from class: o.n99
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return o99.m41813T((String) obj);
            }
        }, 30, null), 0, null, 6, null);
        throw new qe9();
    }

    @Override // p001o.qa9
    /* renamed from: a */
    public void mo41841a() {
        int iM57208b = this.f37970c.m57208b();
        nextToken();
        while (this.f37970c.m57208b() > iM57208b) {
            nextToken();
        }
    }

    /* renamed from: l */
    public final void m41842l(char c) {
        char c2 = (char) this.f37968a[this.f37971d];
        boolean z = c2 == c;
        int i = this.f37971d;
        if (z) {
            this.f37971d++;
            return;
        }
        m41826t(this, ("Unexpected char `" + c2 + "` expected `" + c + '`').toString(), i, null, 4, null);
        throw new qe9();
    }

    /* renamed from: m */
    public final void m41843m(String str) {
        for (int i = 0; i < str.length(); i++) {
            m41842l(str.charAt(i));
        }
    }

    /* renamed from: n */
    public final xa9 m41844n() {
        try {
            switch (C15737a.f37972a[this.f37970c.m57207a().ordinal()]) {
                case 1:
                    return m41832G();
                case 2:
                    return m41835L();
                case 3:
                    return m41836N();
                case 4:
                    return m41838Q();
                case 5:
                    return m41839R();
                case 6:
                    return m41837O();
                default:
                    throw new szb();
            }
        } catch (an5 e) {
            throw e;
        } catch (Exception e2) {
            throw new an5(e2);
        }
    }

    @Override // p001o.qa9
    public xa9 nextToken() {
        xa9 xa9VarPeek = peek();
        this.f37969b = null;
        this.f37970c.m57210d();
        return xa9VarPeek;
    }

    /* renamed from: o */
    public final xa9 m41845o() {
        m41842l(']');
        yba ybaVarM57207a = this.f37970c.m57207a();
        boolean z = ybaVarM57207a == yba.ArrayFirstValueOrEnd || ybaVarM57207a == yba.ArrayNextValueOrEnd;
        int i = this.f37971d - 1;
        if (z) {
            this.f37970c.m57209c(new xk7() { // from class: o.g99
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return o99.m41824p((List) obj);
                }
            });
            return xa9.C18088d.f53426a;
        }
        m41826t(this, "Unexpected close `]` encountered".toString(), i, null, 4, null);
        throw new qe9();
    }

    @Override // p001o.qa9
    public xa9 peek() {
        xa9 xa9Var = this.f37969b;
        if (xa9Var != null) {
            return xa9Var;
        }
        xa9 xa9VarM41844n = m41844n();
        this.f37969b = xa9VarM41844n;
        return xa9VarM41844n;
    }

    /* renamed from: q */
    public final xa9 m41846q() {
        m41842l('}');
        yba ybaVarM57207a = this.f37970c.m57207a();
        boolean z = ybaVarM57207a == yba.ObjectFirstKeyOrEnd || ybaVarM57207a == yba.ObjectNextKeyOrEnd;
        int i = this.f37971d - 1;
        if (z) {
            this.f37970c.m57209c(new xk7() { // from class: o.i99
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return o99.m41825r((List) obj);
                }
            });
            return xa9.C18090f.f53428a;
        }
        m41826t(this, "Unexpected close `}` encountered".toString(), i, null, 4, null);
        throw new qe9();
    }

    /* renamed from: s */
    public final Void m41847s(String str, int i, Throwable th) {
        throw new an5("Unexpected JSON token at offset " + i + "; " + str, th);
    }

    /* renamed from: u */
    public final Character m41848u(boolean z) {
        while (true) {
            Character chM41851x = m41851x();
            boolean z2 = false;
            if (chM41851x != null && ph2.m43653c(chM41851x.charValue())) {
                z2 = true;
            }
            if (!z2) {
                break;
            }
            this.f37971d++;
        }
        return z ? m41851x() : Character.valueOf(m41849v());
    }

    /* renamed from: v */
    public final char m41849v() {
        char cM41852y = m41852y();
        this.f37971d++;
        return cM41852y;
    }

    /* renamed from: w */
    public final Byte m41850w() {
        return gp0.e0(this.f37968a, this.f37971d);
    }

    /* renamed from: x */
    public final Character m41851x() {
        Byte bM41850w = m41850w();
        if (bM41850w != null) {
            return Character.valueOf((char) bM41850w.byteValue());
        }
        return null;
    }

    /* renamed from: y */
    public final char m41852y() {
        Character chM41851x = m41851x();
        if (chM41851x != null) {
            return chM41851x.charValue();
        }
        throw new IllegalStateException("Unexpected EOF");
    }

    /* renamed from: z */
    public final void m41853z(Appendable appendable) throws IOException {
        while (kh3.m35708X(p99.f39672a, m41851x())) {
            appendable.append(m41849v());
        }
    }
}
