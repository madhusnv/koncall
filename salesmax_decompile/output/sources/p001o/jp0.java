package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class jp0 {

    /* renamed from: w */
    public static final h7d f30863w = new h7d().m29908J("NA");

    /* renamed from: x */
    public static final Pattern f30864x = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)+");

    /* renamed from: y */
    public static final Pattern f30865y = Pattern.compile("[- ]");

    /* renamed from: z */
    public static final Pattern f30866z = Pattern.compile("\u2008");

    /* renamed from: j */
    public final u6d f30876j;

    /* renamed from: k */
    public String f30877k;

    /* renamed from: l */
    public h7d f30878l;

    /* renamed from: m */
    public h7d f30879m;

    /* renamed from: a */
    public String f30867a = "";

    /* renamed from: b */
    public StringBuilder f30868b = new StringBuilder();

    /* renamed from: c */
    public String f30869c = "";

    /* renamed from: d */
    public StringBuilder f30870d = new StringBuilder();

    /* renamed from: e */
    public StringBuilder f30871e = new StringBuilder();

    /* renamed from: f */
    public boolean f30872f = true;

    /* renamed from: g */
    public boolean f30873g = false;

    /* renamed from: h */
    public boolean f30874h = false;

    /* renamed from: i */
    public boolean f30875i = false;

    /* renamed from: n */
    public int f30880n = 0;

    /* renamed from: o */
    public int f30881o = 0;

    /* renamed from: p */
    public int f30882p = 0;

    /* renamed from: q */
    public StringBuilder f30883q = new StringBuilder();

    /* renamed from: r */
    public boolean f30884r = false;

    /* renamed from: s */
    public String f30885s = "";

    /* renamed from: t */
    public StringBuilder f30886t = new StringBuilder();

    /* renamed from: u */
    public List f30887u = new ArrayList();

    /* renamed from: v */
    public pge f30888v = new pge(64);

    public jp0(u6d u6dVar, String str) {
        this.f30876j = u6dVar;
        this.f30877k = str;
        h7d h7dVarM34181l = m34181l(str);
        this.f30879m = h7dVarM34181l;
        this.f30878l = h7dVarM34181l;
    }

    /* renamed from: a */
    public final boolean m34170a() {
        if (this.f30885s.length() > 0) {
            this.f30886t.insert(0, this.f30885s);
            this.f30883q.setLength(this.f30883q.lastIndexOf(this.f30885s));
        }
        return !this.f30885s.equals(m34191v());
    }

    /* renamed from: b */
    public final String m34171b(String str) {
        int length = this.f30883q.length();
        if (!this.f30884r || length <= 0 || this.f30883q.charAt(length - 1) == ' ') {
            return ((Object) this.f30883q) + str;
        }
        return new String(this.f30883q) + TokenParser.SP + str;
    }

    /* renamed from: c */
    public final String m34172c() {
        if (this.f30886t.length() < 3) {
            return m34171b(this.f30886t.toString());
        }
        m34179j(this.f30886t.toString());
        String strM34176g = m34176g();
        return strM34176g.length() > 0 ? strM34176g : m34188s() ? m34182m() : this.f30870d.toString();
    }

    /* renamed from: d */
    public final String m34173d() {
        this.f30872f = true;
        this.f30875i = false;
        this.f30887u.clear();
        this.f30880n = 0;
        this.f30868b.setLength(0);
        this.f30869c = "";
        return m34172c();
    }

    /* renamed from: e */
    public final boolean m34174e() {
        StringBuilder sb;
        int iM51028i;
        if (this.f30886t.length() == 0 || (iM51028i = this.f30876j.m51028i(this.f30886t, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        this.f30886t.setLength(0);
        this.f30886t.append((CharSequence) sb);
        String strM51006A = this.f30876j.m51006A(iM51028i);
        if ("001".equals(strM51006A)) {
            this.f30879m = this.f30876j.m51038u(iM51028i);
        } else if (!strM51006A.equals(this.f30877k)) {
            this.f30879m = m34181l(strM51006A);
        }
        String string = Integer.toString(iM51028i);
        StringBuilder sb2 = this.f30883q;
        sb2.append(string);
        sb2.append(TokenParser.SP);
        this.f30885s = "";
        return true;
    }

    /* renamed from: f */
    public final boolean m34175f() {
        Matcher matcher = this.f30888v.m43607a("\\+|" + this.f30879m.m29926d()).matcher(this.f30871e);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f30874h = true;
        int iEnd = matcher.end();
        this.f30886t.setLength(0);
        this.f30886t.append(this.f30871e.substring(iEnd));
        this.f30883q.setLength(0);
        this.f30883q.append(this.f30871e.substring(0, iEnd));
        if (this.f30871e.charAt(0) != '+') {
            this.f30883q.append(TokenParser.SP);
        }
        return true;
    }

    /* renamed from: g */
    public String m34176g() {
        for (f7d f7dVar : this.f30887u) {
            Matcher matcher = this.f30888v.m43607a(f7dVar.m26249f()).matcher(this.f30886t);
            if (matcher.matches()) {
                this.f30884r = f30865y.matcher(f7dVar.m26247d()).find();
                String strM34171b = m34171b(matcher.replaceAll(f7dVar.m26245b()));
                if (u6d.m50994P(strM34171b).contentEquals(this.f30871e)) {
                    return strM34171b;
                }
            }
        }
        return "";
    }

    /* renamed from: h */
    public void m34177h() {
        this.f30867a = "";
        this.f30870d.setLength(0);
        this.f30871e.setLength(0);
        this.f30868b.setLength(0);
        this.f30880n = 0;
        this.f30869c = "";
        this.f30883q.setLength(0);
        this.f30885s = "";
        this.f30886t.setLength(0);
        this.f30872f = true;
        this.f30873g = false;
        this.f30882p = 0;
        this.f30881o = 0;
        this.f30874h = false;
        this.f30875i = false;
        this.f30887u.clear();
        this.f30884r = false;
        if (this.f30879m.equals(this.f30878l)) {
            return;
        }
        this.f30879m = m34181l(this.f30877k);
    }

    /* renamed from: i */
    public final boolean m34178i(f7d f7dVar) {
        String strM26249f = f7dVar.m26249f();
        this.f30868b.setLength(0);
        String strM34180k = m34180k(strM26249f, f7dVar.m26245b());
        if (strM34180k.length() <= 0) {
            return false;
        }
        this.f30868b.append(strM34180k);
        return true;
    }

    /* renamed from: j */
    public final void m34179j(String str) {
        for (f7d f7dVar : (!(this.f30874h && this.f30885s.length() == 0) || this.f30879m.m29944y() <= 0) ? this.f30879m.m29901B() : this.f30879m.m29945z()) {
            if (this.f30885s.length() <= 0 || !u6d.m51005p(f7dVar.m26247d()) || f7dVar.m26248e() || f7dVar.m26250g()) {
                if (this.f30885s.length() != 0 || this.f30874h || u6d.m51005p(f7dVar.m26247d()) || f7dVar.m26248e()) {
                    if (f30864x.matcher(f7dVar.m26245b()).matches()) {
                        this.f30887u.add(f7dVar);
                    }
                }
            }
        }
        m34189t(str);
    }

    /* renamed from: k */
    public final String m34180k(String str, String str2) {
        Matcher matcher = this.f30888v.m43607a(str).matcher("999999999999999");
        matcher.find();
        String strGroup = matcher.group();
        return strGroup.length() < this.f30886t.length() ? "" : strGroup.replaceAll(str, str2).replaceAll("9", "\u2008");
    }

    /* renamed from: l */
    public final h7d m34181l(String str) {
        h7d h7dVarM51039v = this.f30876j.m51039v(this.f30876j.m51006A(this.f30876j.m51035r(str)));
        return h7dVarM51039v != null ? h7dVarM51039v : f30863w;
    }

    /* renamed from: m */
    public final String m34182m() {
        int length = this.f30886t.length();
        if (length <= 0) {
            return this.f30883q.toString();
        }
        String strM34184o = "";
        for (int i = 0; i < length; i++) {
            strM34184o = m34184o(this.f30886t.charAt(i));
        }
        return this.f30872f ? m34171b(strM34184o) : this.f30870d.toString();
    }

    /* renamed from: n */
    public String m34183n(char c) {
        String strM34185p = m34185p(c, false);
        this.f30867a = strM34185p;
        return strM34185p;
    }

    /* renamed from: o */
    public final String m34184o(char c) {
        Matcher matcher = f30866z.matcher(this.f30868b);
        if (!matcher.find(this.f30880n)) {
            if (this.f30887u.size() == 1) {
                this.f30872f = false;
            }
            this.f30869c = "";
            return this.f30870d.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c));
        this.f30868b.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.f30880n = iStart;
        return this.f30868b.substring(0, iStart + 1);
    }

    /* renamed from: p */
    public final String m34185p(char c, boolean z) {
        this.f30870d.append(c);
        if (z) {
            this.f30881o = this.f30870d.length();
        }
        if (m34186q(c)) {
            c = m34190u(c, z);
        } else {
            this.f30872f = false;
            this.f30873g = true;
        }
        if (!this.f30872f) {
            if (this.f30873g) {
                return this.f30870d.toString();
            }
            if (m34175f()) {
                if (m34174e()) {
                    return m34173d();
                }
            } else if (m34170a()) {
                this.f30883q.append(TokenParser.SP);
                return m34173d();
            }
            return this.f30870d.toString();
        }
        int length = this.f30871e.length();
        if (length == 0 || length == 1 || length == 2) {
            return this.f30870d.toString();
        }
        if (length == 3) {
            if (!m34175f()) {
                this.f30885s = m34191v();
                return m34172c();
            }
            this.f30875i = true;
        }
        if (this.f30875i) {
            if (m34174e()) {
                this.f30875i = false;
            }
            return ((Object) this.f30883q) + this.f30886t.toString();
        }
        if (this.f30887u.size() <= 0) {
            return m34172c();
        }
        String strM34184o = m34184o(c);
        String strM34176g = m34176g();
        if (strM34176g.length() > 0) {
            return strM34176g;
        }
        m34189t(this.f30886t.toString());
        return m34188s() ? m34182m() : this.f30872f ? m34171b(strM34184o) : this.f30870d.toString();
    }

    /* renamed from: q */
    public final boolean m34186q(char c) {
        if (Character.isDigit(c)) {
            return true;
        }
        return this.f30870d.length() == 1 && u6d.f48411r.matcher(Character.toString(c)).matches();
    }

    /* renamed from: r */
    public final boolean m34187r() {
        return this.f30879m.m29923a() == 1 && this.f30886t.charAt(0) == '1' && this.f30886t.charAt(1) != '0' && this.f30886t.charAt(1) != '1';
    }

    /* renamed from: s */
    public final boolean m34188s() {
        Iterator it = this.f30887u.iterator();
        while (it.hasNext()) {
            f7d f7dVar = (f7d) it.next();
            String strM26249f = f7dVar.m26249f();
            if (this.f30869c.equals(strM26249f)) {
                return false;
            }
            if (m34178i(f7dVar)) {
                this.f30869c = strM26249f;
                this.f30884r = f30865y.matcher(f7dVar.m26247d()).find();
                this.f30880n = 0;
                return true;
            }
            it.remove();
        }
        this.f30872f = false;
        return false;
    }

    /* renamed from: t */
    public final void m34189t(String str) {
        int length = str.length() - 3;
        Iterator it = this.f30887u.iterator();
        while (it.hasNext()) {
            f7d f7dVar = (f7d) it.next();
            if (f7dVar.m26251h() != 0) {
                if (!this.f30888v.m43607a(f7dVar.m26246c(Math.min(length, f7dVar.m26251h() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: u */
    public final char m34190u(char c, boolean z) {
        if (c == '+') {
            this.f30871e.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            this.f30871e.append(c);
            this.f30886t.append(c);
        }
        if (z) {
            this.f30882p = this.f30871e.length();
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m34191v() {
        int iEnd = 1;
        if (m34187r()) {
            StringBuilder sb = this.f30883q;
            sb.append('1');
            sb.append(TokenParser.SP);
            this.f30874h = true;
        } else if (this.f30879m.m29942u()) {
            Matcher matcher = this.f30888v.m43607a(this.f30879m.m29929g()).matcher(this.f30886t);
            if (!matcher.lookingAt() || matcher.end() <= 0) {
                iEnd = 0;
            } else {
                this.f30874h = true;
                iEnd = matcher.end();
                this.f30883q.append(this.f30886t.substring(0, iEnd));
            }
        }
        String strSubstring = this.f30886t.substring(0, iEnd);
        this.f30886t.delete(0, iEnd);
        return strSubstring;
    }
}
