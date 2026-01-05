package p001o;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import org.apache.http.HttpHeaders;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;
import p001o.ul1;

/* loaded from: classes6.dex */
public class are implements p48 {

    /* renamed from: l */
    public static PrintWriter f15161l;

    /* renamed from: m */
    public static ygf f15162m;

    /* renamed from: a */
    public f28 f15163a;

    /* renamed from: b */
    public int f15164b = 200;

    /* renamed from: c */
    public String f15165c;

    /* renamed from: d */
    public Locale f15166d;

    /* renamed from: e */
    public String f15167e;

    /* renamed from: f */
    public ul1.C17390a f15168f;

    /* renamed from: g */
    public String f15169g;

    /* renamed from: h */
    public boolean f15170h;

    /* renamed from: i */
    public String f15171i;

    /* renamed from: j */
    public int f15172j;

    /* renamed from: k */
    public PrintWriter f15173k;

    /* renamed from: o.are$a */
    public static class C12237a extends ygf {
        public C12237a() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }
    }

    static {
        try {
            f15161l = new PrintWriter(p68.m42998A());
            f15162m = new C12237a();
        } catch (Exception e) {
            tia.m49931m(e);
        }
    }

    public are(f28 f28Var) {
        this.f15163a = f28Var;
    }

    @Override // p001o.ahf
    /* renamed from: a */
    public void mo17096a(String str) {
        if (m17711j() || this.f15163a.m25988G()) {
            return;
        }
        if (str == null) {
            if (this.f15166d == null) {
                this.f15169g = null;
            }
            this.f15167e = null;
            this.f15168f = null;
            this.f15171i = null;
            this.f15163a.m25983B().m24190s(j38.f29721z);
            return;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf <= 0) {
            this.f15167e = str;
            ul1.C17390a c17390aM51691c = yeb.f55360b.m51691c(str);
            this.f15168f = c17390aM51691c;
            String str2 = this.f15169g;
            if (str2 == null) {
                if (c17390aM51691c != null) {
                    this.f15171i = c17390aM51691c.toString();
                    this.f15163a.m25983B().m24187p(j38.f29721z, this.f15168f);
                    return;
                } else {
                    this.f15171i = str;
                    this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
                    return;
                }
            }
            if (c17390aM51691c == null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(HTTP.CHARSET_PARAM);
                stringBuffer.append(n5e.m40119a(this.f15169g, ";= "));
                this.f15171i = stringBuffer.toString();
                this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
                return;
            }
            ul1.C17390a c17390aM51697i = c17390aM51691c.m51697i(str2);
            if (c17390aM51697i != null) {
                this.f15171i = c17390aM51697i.toString();
                this.f15163a.m25983B().m24187p(j38.f29721z, c17390aM51697i);
                return;
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.f15167e);
            stringBuffer2.append(HTTP.CHARSET_PARAM);
            stringBuffer2.append(n5e.m40119a(this.f15169g, ";= "));
            this.f15171i = stringBuffer2.toString();
            this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
            return;
        }
        String strTrim = str.substring(0, iIndexOf).trim();
        this.f15167e = strTrim;
        ul1 ul1Var = yeb.f55360b;
        this.f15168f = ul1Var.m51691c(strTrim);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf("charset=", i);
        if (iIndexOf2 < 0) {
            this.f15168f = null;
            if (this.f15169g != null) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(str);
                stringBuffer3.append(HTTP.CHARSET_PARAM);
                stringBuffer3.append(n5e.m40119a(this.f15169g, ";= "));
                str = stringBuffer3.toString();
            }
            this.f15171i = str;
            this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
            return;
        }
        this.f15170h = true;
        int i2 = iIndexOf2 + 8;
        int iIndexOf3 = str.indexOf(32, i2);
        if (this.f15172j != 2) {
            if ((iIndexOf2 != i || iIndexOf3 >= 0) && !(iIndexOf2 == iIndexOf + 2 && iIndexOf3 < 0 && str.charAt(i) == ' ')) {
                if (iIndexOf3 > 0) {
                    this.f15169g = n5e.m40121c(str.substring(i2, iIndexOf3));
                    this.f15171i = str;
                    this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
                    return;
                } else {
                    this.f15169g = n5e.m40121c(str.substring(i2));
                    this.f15171i = str;
                    this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
                    return;
                }
            }
            this.f15168f = ul1Var.m51691c(this.f15167e);
            String strM40121c = n5e.m40121c(str.substring(i2));
            this.f15169g = strM40121c;
            ul1.C17390a c17390a = this.f15168f;
            if (c17390a == null) {
                this.f15171i = str;
                this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
                return;
            }
            ul1.C17390a c17390aM51697i2 = c17390a.m51697i(strM40121c);
            if (c17390aM51697i2 != null) {
                this.f15171i = c17390aM51697i2.toString();
                this.f15163a.m25983B().m24187p(j38.f29721z, c17390aM51697i2);
                return;
            } else {
                this.f15171i = str;
                this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
                return;
            }
        }
        if ((iIndexOf2 != i || iIndexOf3 >= 0) && !(iIndexOf2 == iIndexOf + 2 && iIndexOf3 < 0 && str.charAt(i) == ' ')) {
            if (iIndexOf3 < 0) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str.substring(0, iIndexOf2));
                stringBuffer4.append(" charset=");
                stringBuffer4.append(n5e.m40119a(this.f15169g, ";= "));
                this.f15171i = stringBuffer4.toString();
                this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
                return;
            }
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(str.substring(0, iIndexOf2));
            stringBuffer5.append(str.substring(iIndexOf3));
            stringBuffer5.append(" charset=");
            stringBuffer5.append(n5e.m40119a(this.f15169g, ";= "));
            this.f15171i = stringBuffer5.toString();
            this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
            return;
        }
        ul1.C17390a c17390a2 = this.f15168f;
        if (c17390a2 == null) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(this.f15167e);
            stringBuffer6.append(HTTP.CHARSET_PARAM);
            stringBuffer6.append(this.f15169g);
            this.f15171i = stringBuffer6.toString();
            this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
            return;
        }
        ul1.C17390a c17390aM51697i3 = c17390a2.m51697i(this.f15169g);
        if (c17390aM51697i3 != null) {
            this.f15171i = c17390aM51697i3.toString();
            this.f15163a.m25983B().m24187p(j38.f29721z, c17390aM51697i3);
            return;
        }
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append(this.f15167e);
        stringBuffer7.append(HTTP.CHARSET_PARAM);
        stringBuffer7.append(this.f15169g);
        this.f15171i = stringBuffer7.toString();
        this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
    }

    @Override // p001o.p48
    /* renamed from: b */
    public void mo17705b(String str) {
        if (this.f15163a.m25988G()) {
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (!b1i.m18101f(str)) {
            StringBuffer stringBufferM52938p = this.f15163a.m26001w().m52938p();
            if (str.startsWith("/")) {
                stringBufferM52938p.append(str);
            } else {
                String strM52937o = this.f15163a.m26001w().m52937o();
                if (!strM52937o.endsWith("/")) {
                    strM52937o = b1i.m18102g(strM52937o);
                }
                String strM18098a = b1i.m18098a(strM52937o, str);
                if (strM18098a == null) {
                    throw new IllegalStateException("path cannot be above root");
                }
                if (!strM18098a.startsWith("/")) {
                    stringBufferM52938p.append('/');
                }
                stringBufferM52938p.append(strM18098a);
            }
            str = stringBufferM52938p.toString();
            v48 v48Var = new v48(str);
            String strMo20366d = v48Var.mo20366d();
            String strM18099b = b1i.m18099b(strMo20366d);
            if (strM18099b == null) {
                throw new IllegalArgumentException();
            }
            if (!strM18099b.equals(strMo20366d)) {
                StringBuffer stringBufferM52938p2 = this.f15163a.m26001w().m52938p();
                stringBufferM52938p2.append(strM18099b);
                if (v48Var.mo20371i() != null) {
                    stringBufferM52938p2.append('?');
                    stringBufferM52938p2.append(v48Var.mo20371i());
                }
                if (v48Var.mo20367e() != null) {
                    stringBufferM52938p2.append('#');
                    stringBufferM52938p2.append(v48Var.mo20367e());
                }
                str = stringBufferM52938p2.toString();
            }
        }
        m17714m();
        m17720s("Location", str);
        mo17706e(302);
        m17707f();
    }

    @Override // p001o.ahf
    /* renamed from: c */
    public void mo17097c() {
        this.f15163a.m25994p();
    }

    @Override // p001o.ahf
    /* renamed from: d */
    public PrintWriter mo17098d() {
        int i = this.f15172j;
        if (i == -1) {
            return f15161l;
        }
        if (i != 0 && i != 2) {
            throw new IllegalStateException("STREAM");
        }
        if (this.f15173k == null) {
            String str = this.f15169g;
            if (str == null) {
                if (this.f15167e != null) {
                    str = null;
                }
                if (str == null) {
                    str = s8g.f44982b;
                }
                m17718q(str);
            }
            this.f15173k = this.f15163a.m26000v(str);
        }
        this.f15172j = 2;
        return this.f15173k;
    }

    @Override // p001o.p48
    /* renamed from: e */
    public void mo17706e(int i) {
        m17721t(i, null);
    }

    /* renamed from: f */
    public void m17707f() {
        this.f15163a.m25992n();
    }

    /* renamed from: g */
    public ygf m17708g() {
        int i = this.f15172j;
        if (i == -1) {
            return f15162m;
        }
        if (i != 0 && i != 1) {
            throw new IllegalStateException("WRITER");
        }
        this.f15172j = 1;
        return this.f15163a.m25999u();
    }

    /* renamed from: h */
    public String m17709h() {
        return this.f15165c;
    }

    /* renamed from: i */
    public int m17710i() {
        return this.f15164b;
    }

    /* renamed from: j */
    public boolean m17711j() {
        return this.f15163a.m25989H();
    }

    /* renamed from: k */
    public void m17712k() {
        this.f15164b = 200;
        this.f15165c = null;
        this.f15166d = null;
        this.f15167e = null;
        this.f15168f = null;
        this.f15169g = null;
        this.f15170h = false;
        this.f15171i = null;
        this.f15172j = 0;
        this.f15173k = null;
    }

    /* renamed from: l */
    public void m17713l() {
        m17714m();
        e38 e38VarM25983B = this.f15163a.m25983B();
        e38VarM25983B.m24176c();
        String strM24184m = this.f15163a.m26002x().m24184m(j38.f29706k);
        if (strM24184m != null) {
            n5e n5eVar = new n5e(strM24184m, ",");
            while (n5eVar.hasMoreTokens()) {
                ul1.C17390a c17390aM51691c = i38.f27983d.m51691c(n5eVar.nextToken().trim());
                if (c17390aM51691c != null) {
                    int iM51698j = c17390aM51691c.m51698j();
                    if (iM51698j == 1) {
                        e38VarM25983B.m24187p(j38.f29706k, i38.f27984e);
                    } else if (iM51698j != 5) {
                        if (iM51698j == 8) {
                            e38VarM25983B.m24186o(j38.f29706k, HttpHeaders.TE);
                        }
                    } else if ("HTTP/1.0".equalsIgnoreCase(this.f15163a.m26001w().m52936n())) {
                        e38VarM25983B.m24186o(j38.f29706k, "keep-alive");
                    }
                }
            }
        }
        if (this.f15163a.m25995q().getServer().m18896J()) {
            vle vleVarM26001w = this.f15163a.m26001w();
            e38VarM25983B.m24188q(j38.f29708m, vleVarM26001w.m52943u(), vleVarM26001w.m52942t());
        }
        this.f15164b = 200;
        this.f15165c = null;
        this.f15167e = null;
        this.f15168f = null;
        this.f15171i = null;
        this.f15169g = null;
        this.f15170h = false;
        this.f15166d = null;
        this.f15172j = 0;
        this.f15173k = null;
    }

    /* renamed from: m */
    public void m17714m() {
        if (m17711j()) {
            throw new IllegalStateException("Committed");
        }
        this.f15163a.m25997s().mo46286g();
    }

    /* renamed from: n */
    public void m17715n(int i) throws IOException {
        if (i == 102) {
            m17717p();
        } else {
            m17716o(i, null);
        }
    }

    /* renamed from: o */
    public void m17716o(int i, String str) throws IOException {
        if (this.f15163a.m25988G()) {
            return;
        }
        if (m17711j()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Committed before ");
            stringBuffer.append(i);
            stringBuffer.append(" ");
            stringBuffer.append(str);
            tia.m49928j(stringBuffer.toString());
        }
        m17714m();
        this.f15169g = null;
        m17720s(HttpHeaders.EXPIRES, null);
        m17720s(HttpHeaders.LAST_MODIFIED, null);
        m17720s("Cache-Control", null);
        m17720s("Content-Type", null);
        m17720s("Content-Length", null);
        this.f15172j = 0;
        m17721t(i, str);
        if (str == null) {
            str = r7.m46281s(i);
        }
        if (i != 204 && i != 304 && i != 206 && i >= 200) {
            vle vleVarM26001w = this.f15163a.m26001w();
            vleVarM26001w.m52928f();
            m17720s("Cache-Control", "must-revalidate,no-cache,no-store");
            mo17096a("text/html; charset=iso-8859-1");
            tp1 tp1Var = new tp1(2048);
            if (str != null) {
                str = s8g.m47997d(s8g.m47997d(s8g.m47997d(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
            }
            String strM52937o = vleVarM26001w.m52937o();
            if (strM52937o != null) {
                strM52937o = s8g.m47997d(s8g.m47997d(s8g.m47997d(strM52937o, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
            }
            tp1Var.write("<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"/>\n");
            tp1Var.write("<title>Error ");
            tp1Var.write(Integer.toString(i));
            tp1Var.m50281f(TokenParser.SP);
            if (str == null) {
                str = r7.m46281s(i);
            }
            tp1Var.write(str);
            tp1Var.write("</title>\n</head>\n<body>\n<h2>HTTP ERROR: ");
            tp1Var.write(Integer.toString(i));
            tp1Var.write("</h2>\n<p>Problem accessing ");
            tp1Var.write(strM52937o);
            tp1Var.write(". Reason:\n<pre>    ");
            tp1Var.write(str);
            tp1Var.write("</pre>");
            tp1Var.write("</p>\n<hr /><i><small>Powered by Jetty://</small></i>");
            for (int i2 = 0; i2 < 20; i2++) {
                tp1Var.write("\n                                                ");
            }
            tp1Var.write("\n</body>\n</html>\n");
            tp1Var.flush();
            m17719r(tp1Var.m50280d());
            tp1Var.m50283h(m17708g());
            tp1Var.m50278a();
        } else if (i != 206) {
            this.f15163a.m26002x().m24190s(j38.f29721z);
            this.f15163a.m26002x().m24190s(j38.f29705j);
            this.f15169g = null;
            this.f15167e = null;
            this.f15168f = null;
        }
        m17707f();
    }

    /* renamed from: p */
    public void m17717p() {
        zn7 zn7VarM25997s = this.f15163a.m25997s();
        if (zn7VarM25997s instanceof g38) {
            g38 g38Var = (g38) zn7VarM25997s;
            String strM52930h = this.f15163a.m26001w().m52930h("Expect");
            if (strM52930h == null || !strM52930h.startsWith("102") || g38Var.m46294v() < 11) {
                return;
            }
            boolean zIsPersistent = g38Var.isPersistent();
            g38Var.mo46284e(102, null);
            g38Var.mo28019h(null, true);
            g38Var.mo46288j(true);
            g38Var.mo28017c();
            g38Var.flush();
            g38Var.mo28016a(false);
            g38Var.mo46288j(zIsPersistent);
        }
    }

    /* renamed from: q */
    public void m17718q(String str) {
        ul1.C17390a c17390aM51697i;
        if (this.f15163a.m25988G() || this.f15172j != 0 || m17711j()) {
            return;
        }
        this.f15170h = true;
        if (str == null) {
            if (this.f15169g != null) {
                this.f15169g = null;
                if (this.f15168f != null) {
                    this.f15163a.m25983B().m24187p(j38.f29721z, this.f15168f);
                    return;
                } else {
                    this.f15163a.m25983B().m24186o(j38.f29721z, this.f15167e);
                    return;
                }
            }
            return;
        }
        this.f15169g = str;
        String str2 = this.f15171i;
        if (str2 != null) {
            int iIndexOf = str2.indexOf(59);
            if (iIndexOf < 0) {
                this.f15171i = null;
                ul1.C17390a c17390a = this.f15168f;
                if (c17390a != null && (c17390aM51697i = c17390a.m51697i(this.f15169g)) != null) {
                    this.f15171i = c17390aM51697i.toString();
                    this.f15163a.m25983B().m24187p(j38.f29721z, c17390aM51697i);
                }
                if (this.f15171i == null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(this.f15167e);
                    stringBuffer.append(HTTP.CHARSET_PARAM);
                    stringBuffer.append(n5e.m40119a(this.f15169g, ";= "));
                    this.f15171i = stringBuffer.toString();
                    this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
                    return;
                }
                return;
            }
            int iIndexOf2 = this.f15171i.indexOf("charset=", iIndexOf);
            if (iIndexOf2 < 0) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(this.f15171i);
                stringBuffer2.append(HTTP.CHARSET_PARAM);
                stringBuffer2.append(n5e.m40119a(this.f15169g, ";= "));
                this.f15171i = stringBuffer2.toString();
            } else {
                int i = iIndexOf2 + 8;
                int iIndexOf3 = this.f15171i.indexOf(" ", i);
                if (iIndexOf3 < 0) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(this.f15171i.substring(0, i));
                    stringBuffer3.append(n5e.m40119a(this.f15169g, ";= "));
                    this.f15171i = stringBuffer3.toString();
                } else {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append(this.f15171i.substring(0, i));
                    stringBuffer4.append(n5e.m40119a(this.f15169g, ";= "));
                    stringBuffer4.append(this.f15171i.substring(iIndexOf3));
                    this.f15171i = stringBuffer4.toString();
                }
            }
            this.f15163a.m25983B().m24186o(j38.f29721z, this.f15171i);
        }
    }

    /* renamed from: r */
    public void m17719r(int i) throws IOException {
        if (m17711j() || this.f15163a.m25988G()) {
            return;
        }
        long j = i;
        this.f15163a.f22577m.mo46292o(j);
        if (i >= 0) {
            this.f15163a.m25983B().m24189r("Content-Length", j);
            if (this.f15163a.f22577m.mo46287i()) {
                int i2 = this.f15172j;
                if (i2 == 2) {
                    this.f15173k.close();
                } else if (i2 == 1) {
                    try {
                        m17708g().close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public void m17720s(String str, String str2) {
        if (this.f15163a.m25988G()) {
            return;
        }
        this.f15163a.m25983B().m24185n(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            if (str2 == null) {
                this.f15163a.f22577m.mo46292o(-1L);
            } else {
                this.f15163a.f22577m.mo46292o(Long.parseLong(str2));
            }
        }
    }

    /* renamed from: t */
    public void m17721t(int i, String str) {
        if (this.f15163a.m25988G()) {
            return;
        }
        this.f15164b = i;
        this.f15165c = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HTTP/1.1 ");
        stringBuffer.append(this.f15164b);
        stringBuffer.append(" ");
        String str = this.f15165c;
        if (str == null) {
            str = "";
        }
        stringBuffer.append(str);
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append(this.f15163a.m25983B().toString());
        return stringBuffer.toString();
    }
}
