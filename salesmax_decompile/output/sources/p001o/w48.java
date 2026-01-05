package p001o;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class w48 {

    /* renamed from: j */
    public static final C17775b f51415j = new C17775b(null);

    /* renamed from: a */
    public final String f51416a;

    /* renamed from: b */
    public final String f51417b;

    /* renamed from: c */
    public final String f51418c;

    /* renamed from: d */
    public final String f51419d;

    /* renamed from: e */
    public final int f51420e;

    /* renamed from: f */
    public final List f51421f;

    /* renamed from: g */
    public final List f51422g;

    /* renamed from: h */
    public final String f51423h;

    /* renamed from: i */
    public final String f51424i;

    /* renamed from: o.w48$a */
    public static final class C17774a {

        /* renamed from: a */
        public String f51425a;

        /* renamed from: d */
        public String f51428d;

        /* renamed from: g */
        public List f51431g;

        /* renamed from: h */
        public String f51432h;

        /* renamed from: b */
        public String f51426b = "";

        /* renamed from: c */
        public String f51427c = "";

        /* renamed from: e */
        public int f51429e = -1;

        /* renamed from: f */
        public final List f51430f = ch3.m21252q("");

        /* renamed from: A */
        public final void m53889A(String str) {
            sq8.m48649h(str, "<set-?>");
            this.f51427c = str;
        }

        /* renamed from: B */
        public final void m53890B(String str) {
            sq8.m48649h(str, "<set-?>");
            this.f51426b = str;
        }

        /* renamed from: C */
        public final void m53891C(String str) {
            this.f51428d = str;
        }

        /* renamed from: D */
        public final void m53892D(int i) {
            this.f51429e = i;
        }

        /* renamed from: E */
        public final void m53893E(String str) {
            this.f51425a = str;
        }

        /* renamed from: F */
        public final int m53894F(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: G */
        public final void m53895G(List list, StringBuilder sb) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) list.get(i));
            }
        }

        /* renamed from: H */
        public final List m53896H(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iA0 = f9g.a0(str, '&', i, false, 4, null);
                if (iA0 == -1) {
                    iA0 = str.length();
                }
                int i2 = iA0;
                int iA02 = f9g.a0(str, '=', i, false, 4, null);
                if (iA02 == -1 || iA02 > i2) {
                    String strSubstring = str.substring(i, i2);
                    sq8.m48648g(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iA02);
                    sq8.m48648g(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iA02 + 1, i2);
                    sq8.m48648g(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        /* renamed from: I */
        public final C17774a m53897I(String str) {
            sq8.m48649h(str, "username");
            this.f51426b = fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (Opcodes.LSHR & 8) != 0 ? false : false, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : false);
            return this;
        }

        /* renamed from: a */
        public final C17774a m53898a(String str, String str2) {
            sq8.m48649h(str, "encodedName");
            if (this.f51431g == null) {
                this.f51431g = new ArrayList();
            }
            List list = this.f51431g;
            sq8.m48646e(list);
            list.add(fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str.length() : 0, " \"'<>#&=", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : true, (Opcodes.LSHR & 64) != 0 ? false : false));
            List list2 = this.f51431g;
            sq8.m48646e(list2);
            list2.add(str2 != null ? fgj.m26667a(str2, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str2.length() : 0, " \"'<>#&=", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : true, (Opcodes.LSHR & 64) != 0 ? false : false) : null);
            return this;
        }

        /* renamed from: b */
        public final C17774a m53899b(String str) {
            sq8.m48649h(str, "pathSegment");
            m53917t(str, 0, str.length(), false, false);
            return this;
        }

        /* renamed from: c */
        public final C17774a m53900c(String str) {
            sq8.m48649h(str, "pathSegments");
            return m53901d(str, false);
        }

        /* renamed from: d */
        public final C17774a m53901d(String str, boolean z) {
            int i = 0;
            do {
                int iM28629i = ggj.m28629i(str, "/\\", i, str.length());
                m53917t(str, i, iM28629i, iM28629i < str.length(), z);
                i = iM28629i + 1;
            } while (i <= str.length());
            return this;
        }

        /* renamed from: e */
        public final C17774a m53902e(String str, String str2) {
            sq8.m48649h(str, "name");
            if (this.f51431g == null) {
                this.f51431g = new ArrayList();
            }
            List list = this.f51431g;
            sq8.m48646e(list);
            list.add(fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str.length() : 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", (Opcodes.LSHR & 8) != 0 ? false : false, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : true, (Opcodes.LSHR & 64) != 0 ? false : false));
            List list2 = this.f51431g;
            sq8.m48646e(list2);
            list2.add(str2 != null ? fgj.m26667a(str2, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str2.length() : 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", (Opcodes.LSHR & 8) != 0 ? false : false, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : true, (Opcodes.LSHR & 64) != 0 ? false : false) : null);
            return this;
        }

        /* renamed from: f */
        public final w48 m53903f() {
            ArrayList arrayList;
            String str = this.f51425a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strM26673g = fgj.m26673g(this.f51426b, 0, 0, false, 7, null);
            String strM26673g2 = fgj.m26673g(this.f51427c, 0, 0, false, 7, null);
            String str2 = this.f51428d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM53904g = m53904g();
            List list = this.f51430f;
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(fgj.m26673g((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f51431g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(dh3.m23088v(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? fgj.m26673g(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f51432h;
            return new w48(str, strM26673g, strM26673g2, str2, iM53904g, arrayList2, arrayList, str4 != null ? fgj.m26673g(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        /* renamed from: g */
        public final int m53904g() {
            int i = this.f51429e;
            if (i != -1) {
                return i;
            }
            C17775b c17775b = w48.f51415j;
            String str = this.f51425a;
            sq8.m48646e(str);
            return c17775b.m53925b(str);
        }

        /* renamed from: h */
        public final C17774a m53905h(String str) {
            String strM26667a;
            this.f51431g = (str == null || (strM26667a = fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str.length() : 0, " \"'<>#", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : true, (Opcodes.LSHR & 64) != 0 ? false : false)) == null) ? null : m53896H(strM26667a);
            return this;
        }

        /* renamed from: i */
        public final C17774a m53906i(String str) {
            this.f51432h = str != null ? fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str.length() : 0, "", (Opcodes.LSHR & 8) != 0 ? false : false, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : true) : null;
            return this;
        }

        /* renamed from: j */
        public final List m53907j() {
            return this.f51430f;
        }

        /* renamed from: k */
        public final C17774a m53908k(String str) {
            sq8.m48649h(str, "host");
            String strM54347k = wfj.m54347k(fgj.m26673g(str, 0, 0, false, 7, null));
            if (strM54347k != null) {
                this.f51428d = strM54347k;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* renamed from: l */
        public final boolean m53909l(String str) {
            return sq8.m48644c(str, ".") || e9g.m24606x(str, "%2e", true);
        }

        /* renamed from: m */
        public final boolean m53910m(String str) {
            return sq8.m48644c(str, "..") || e9g.m24606x(str, "%2e.", true) || e9g.m24606x(str, ".%2e", true) || e9g.m24606x(str, "%2e%2e", true);
        }

        /* renamed from: n */
        public final C17774a m53911n(w48 w48Var, String str) throws NumberFormatException {
            String str2;
            int iM28629i;
            int i;
            int i2;
            int i3;
            char c;
            char c2;
            sq8.m48649h(str, "input");
            int iM28639s = ggj.m28639s(str, 0, 0, 3, null);
            int iM28641u = ggj.m28641u(str, iM28639s, 0, 2, null);
            int iM53922y = m53922y(str, iM28639s, iM28641u);
            char c3 = 65535;
            if (iM53922y != -1) {
                if (e9g.m24594H(str, "https:", iM28639s, true)) {
                    this.f51425a = "https";
                    iM28639s += 6;
                } else {
                    if (!e9g.m24594H(str, "http:", iM28639s, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str.substring(0, iM53922y);
                        sq8.m48648g(strSubstring, "substring(...)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f51425a = HttpHost.DEFAULT_SCHEME_NAME;
                    iM28639s += 5;
                }
            } else {
                if (w48Var == null) {
                    if (str.length() > 6) {
                        str2 = h9g.l1(str, 6) + "...";
                    } else {
                        str2 = str;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f51425a = w48Var.m53886r();
            }
            int iM53894F = m53894F(str, iM28639s, iM28641u);
            char c4 = '?';
            char c5 = '#';
            if (iM53894F >= 2 || w48Var == null || !sq8.m48644c(w48Var.m53886r(), this.f51425a)) {
                int i4 = iM28639s + iM53894F;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iM28629i = ggj.m28629i(str, "@/\\?#", i4, iM28641u);
                    char cCharAt = iM28629i != iM28641u ? str.charAt(iM28629i) : c3;
                    if (cCharAt == c3 || cCharAt == c5 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c4) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z) {
                            i2 = iM28629i;
                            i3 = iM28641u;
                            c = c3;
                            this.f51427c += "%40" + fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : i4, (Opcodes.LSHR & 2) != 0 ? str.length() : i2, " \"':;<=>@[]^`{}|/\\?#", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : false);
                        } else {
                            int iM28628h = ggj.m28628h(str, ':', i4, iM28629i);
                            i2 = iM28629i;
                            i3 = iM28641u;
                            c = c3;
                            String strM26667a = fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : i4, (Opcodes.LSHR & 2) != 0 ? str.length() : iM28628h, " \"':;<=>@[]^`{}|/\\?#", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : false);
                            if (z2) {
                                strM26667a = this.f51426b + "%40" + strM26667a;
                            }
                            this.f51426b = strM26667a;
                            if (iM28628h != i2) {
                                this.f51427c = fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : iM28628h + 1, (Opcodes.LSHR & 2) != 0 ? str.length() : i2, " \"':;<=>@[]^`{}|/\\?#", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : false);
                                z = true;
                            }
                            z2 = true;
                        }
                        i4 = i2 + 1;
                        c3 = c;
                        iM28641u = i3;
                        c5 = '#';
                        c4 = '?';
                    }
                }
                i = iM28641u;
                char c6 = c3;
                int iM53916s = m53916s(str, i4, iM28629i);
                int i5 = iM53916s + 1;
                if (i5 < iM28629i) {
                    this.f51428d = wfj.m54347k(fgj.m26673g(str, i4, iM53916s, false, 4, null));
                    int iM53912o = m53912o(str, i5, iM28629i);
                    this.f51429e = iM53912o;
                    if (!(iM53912o != c6)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid URL port: \"");
                        String strSubstring2 = str.substring(i5, iM28629i);
                        sq8.m48648g(strSubstring2, "substring(...)");
                        sb2.append(strSubstring2);
                        sb2.append(TokenParser.DQUOTE);
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                } else {
                    this.f51428d = wfj.m54347k(fgj.m26673g(str, i4, iM53916s, false, 4, null));
                    C17775b c17775b = w48.f51415j;
                    String str3 = this.f51425a;
                    sq8.m48646e(str3);
                    this.f51429e = c17775b.m53925b(str3);
                }
                if (!(this.f51428d != null)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid URL host: \"");
                    String strSubstring3 = str.substring(i4, iM53916s);
                    sq8.m48648g(strSubstring3, "substring(...)");
                    sb3.append(strSubstring3);
                    sb3.append(TokenParser.DQUOTE);
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                iM28639s = iM28629i;
            } else {
                this.f51426b = w48Var.m53876f();
                this.f51427c = w48Var.m53872b();
                this.f51428d = w48Var.m53877h();
                this.f51429e = w48Var.m53882n();
                this.f51430f.clear();
                this.f51430f.addAll(w48Var.m53874d());
                if (iM28639s == iM28641u || str.charAt(iM28639s) == '#') {
                    m53905h(w48Var.m53875e());
                }
                i = iM28641u;
            }
            int i6 = i;
            int iM28629i2 = ggj.m28629i(str, "?#", iM28639s, i6);
            m53920w(str, iM28639s, iM28629i2);
            if (iM28629i2 >= i6 || str.charAt(iM28629i2) != '?') {
                c2 = '#';
            } else {
                c2 = '#';
                int iM28628h2 = ggj.m28628h(str, '#', iM28629i2, i6);
                this.f51431g = m53896H(fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : iM28629i2 + 1, (Opcodes.LSHR & 2) != 0 ? str.length() : iM28628h2, " \"'<>#", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : true, (Opcodes.LSHR & 64) != 0 ? false : false));
                iM28629i2 = iM28628h2;
            }
            if (iM28629i2 < i6 && str.charAt(iM28629i2) == c2) {
                this.f51432h = fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : iM28629i2 + 1, (Opcodes.LSHR & 2) != 0 ? str.length() : i6, "", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : true);
            }
            return this;
        }

        /* renamed from: o */
        public final int m53912o(String str, int i, int i2) throws NumberFormatException {
            try {
                int i3 = Integer.parseInt(fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : i, (Opcodes.LSHR & 2) != 0 ? str.length() : i2, "", (Opcodes.LSHR & 8) != 0 ? false : false, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : false));
                boolean z = false;
                if (1 <= i3 && i3 < 65536) {
                    z = true;
                }
                if (z) {
                    return i3;
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: p */
        public final C17774a m53913p(String str) {
            sq8.m48649h(str, "password");
            this.f51427c = fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (Opcodes.LSHR & 8) != 0 ? false : false, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : false);
            return this;
        }

        /* renamed from: q */
        public final void m53914q() {
            List list = this.f51430f;
            if (!(((String) list.remove(list.size() - 1)).length() == 0) || !(!this.f51430f.isEmpty())) {
                this.f51430f.add("");
            } else {
                List list2 = this.f51430f;
                list2.set(list2.size() - 1, "");
            }
        }

        /* renamed from: r */
        public final C17774a m53915r(int i) {
            boolean z = false;
            if (1 <= i && i < 65536) {
                z = true;
            }
            if (z) {
                this.f51429e = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        /* renamed from: s */
        public final int m53916s(String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                } else if (cCharAt == ':') {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* renamed from: t */
        public final void m53917t(String str, int i, int i2, boolean z, boolean z2) {
            String strM26667a = fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : i, (Opcodes.LSHR & 2) != 0 ? str.length() : i2, " \"<>^`{}|/\\?#", (Opcodes.LSHR & 8) != 0 ? false : z2, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : false);
            if (m53909l(strM26667a)) {
                return;
            }
            if (m53910m(strM26667a)) {
                m53914q();
                return;
            }
            List list = this.f51430f;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f51430f;
                list2.set(list2.size() - 1, strM26667a);
            } else {
                this.f51430f.add(strM26667a);
            }
            if (z) {
                this.f51430f.add("");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f51425a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f51426b.length() > 0) {
                sb.append(this.f51426b);
                if (this.f51427c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f51427c);
                }
                sb.append('@');
            } else {
                if (this.f51427c.length() > 0) {
                }
            }
            String str2 = this.f51428d;
            if (str2 != null) {
                sq8.m48646e(str2);
                if (f9g.m26305O(str2, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.f51428d);
                    sb.append(']');
                } else {
                    sb.append(this.f51428d);
                }
            }
            if (this.f51429e != -1 || this.f51425a != null) {
                int iM53904g = m53904g();
                String str3 = this.f51425a;
                if (str3 != null) {
                    C17775b c17775b = w48.f51415j;
                    sq8.m48646e(str3);
                    if (iM53904g != c17775b.m53925b(str3)) {
                        sb.append(':');
                        sb.append(iM53904g);
                    }
                }
            }
            m53895G(this.f51430f, sb);
            if (this.f51431g != null) {
                sb.append('?');
                C17775b c17775b2 = w48.f51415j;
                List list = this.f51431g;
                sq8.m48646e(list);
                c17775b2.m53928e(list, sb);
            }
            if (this.f51432h != null) {
                sb.append('#');
                sb.append(this.f51432h);
            }
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            return string;
        }

        /* renamed from: u */
        public final C17774a m53918u(String str) {
            String strM26667a;
            this.f51431g = (str == null || (strM26667a = fgj.m26667a(str, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str.length() : 0, " \"'<>#", (Opcodes.LSHR & 8) != 0 ? false : false, (Opcodes.LSHR & 16) != 0 ? false : false, (Opcodes.LSHR & 32) != 0 ? false : true, (Opcodes.LSHR & 64) != 0 ? false : false)) == null) ? null : m53896H(strM26667a);
            return this;
        }

        /* renamed from: v */
        public final C17774a m53919v() {
            String str = this.f51428d;
            this.f51428d = str != null ? new mge("[\"<>^`{|}]").m38996h(str, "") : null;
            int size = this.f51430f.size();
            for (int i = 0; i < size; i++) {
                List list = this.f51430f;
                String str2 = (String) list.get(i);
                list.set(i, fgj.m26667a(str2, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str2.length() : 0, "[]", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : true, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : false));
            }
            List list2 = this.f51431g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = (String) list2.get(i2);
                    list2.set(i2, str3 != null ? fgj.m26667a(str3, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str3.length() : 0, "\\^`{|}", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : true, (Opcodes.LSHR & 32) != 0 ? false : true, (Opcodes.LSHR & 64) != 0 ? false : false) : null);
                }
            }
            String str4 = this.f51432h;
            this.f51432h = str4 != null ? fgj.m26667a(str4, (Opcodes.LSHR & 1) != 0 ? 0 : 0, (Opcodes.LSHR & 2) != 0 ? str4.length() : 0, " \"#<>\\^`{|}", (Opcodes.LSHR & 8) != 0 ? false : true, (Opcodes.LSHR & 16) != 0 ? false : true, (Opcodes.LSHR & 32) != 0 ? false : false, (Opcodes.LSHR & 64) != 0 ? false : true) : null;
            return this;
        }

        /* renamed from: w */
        public final void m53920w(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f51430f.clear();
                this.f51430f.add("");
                i++;
            } else {
                List list = this.f51430f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                while (i3 < i2) {
                    i = ggj.m28629i(str, "/\\", i3, i2);
                    boolean z = i < i2;
                    m53917t(str, i3, i, z, true);
                    if (z) {
                        i3 = i + 1;
                    }
                }
                return;
            }
        }

        /* renamed from: x */
        public final C17774a m53921x(String str) {
            sq8.m48649h(str, "scheme");
            if (e9g.m24606x(str, HttpHost.DEFAULT_SCHEME_NAME, true)) {
                this.f51425a = HttpHost.DEFAULT_SCHEME_NAME;
            } else {
                if (!e9g.m24606x(str, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.f51425a = "https";
            }
            return this;
        }

        /* renamed from: y */
        public final int m53922y(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((sq8.m48651j(cCharAt, 97) >= 0 && sq8.m48651j(cCharAt, 122) <= 0) || (sq8.m48651j(cCharAt, 65) >= 0 && sq8.m48651j(cCharAt, 90) <= 0)) {
                for (int i3 = i + 1; i3 < i2; i3++) {
                    char cCharAt2 = str.charAt(i3);
                    if (!(((((('a' <= cCharAt2 && cCharAt2 < '{') || ('A' <= cCharAt2 && cCharAt2 < '[')) || ('0' <= cCharAt2 && cCharAt2 < ':')) || cCharAt2 == '+') || cCharAt2 == '-') || cCharAt2 == '.')) {
                        if (cCharAt2 == ':') {
                            return i3;
                        }
                        return -1;
                    }
                }
            }
            return -1;
        }

        /* renamed from: z */
        public final void m53923z(String str) {
            this.f51432h = str;
        }
    }

    /* renamed from: o.w48$b */
    public static final class C17775b {
        public C17775b() {
        }

        public /* synthetic */ C17775b(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final int m53925b(String str) {
            sq8.m48649h(str, "scheme");
            if (sq8.m48644c(str, HttpHost.DEFAULT_SCHEME_NAME)) {
                return 80;
            }
            return sq8.m48644c(str, "https") ? 443 : -1;
        }

        /* renamed from: c */
        public final w48 m53926c(String str) {
            sq8.m48649h(str, "<this>");
            return new C17774a().m53911n(null, str).m53903f();
        }

        /* renamed from: d */
        public final w48 m53927d(String str) {
            sq8.m48649h(str, "<this>");
            try {
                return m53926c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: e */
        public final void m53928e(List list, StringBuilder sb) {
            il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, list.size()), 2);
            int iM32260e = il8VarM18615r.m32260e();
            int iM32261j = il8VarM18615r.m32261j();
            int iM32262n = il8VarM18615r.m32262n();
            if ((iM32262n <= 0 || iM32260e > iM32261j) && (iM32262n >= 0 || iM32261j > iM32260e)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iM32260e);
                String str2 = (String) list.get(iM32260e + 1);
                if (iM32260e > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (iM32260e == iM32261j) {
                    return;
                } else {
                    iM32260e += iM32262n;
                }
            }
        }
    }

    public /* synthetic */ w48(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6, id5 id5Var) {
        this(str, str2, str3, str4, i, list, list2, str5, str6);
    }

    /* renamed from: g */
    public static final w48 m53869g(String str) {
        return f51415j.m53926c(str);
    }

    /* renamed from: l */
    public static final w48 m53870l(String str) {
        return f51415j.m53927d(str);
    }

    /* renamed from: a */
    public final String m53871a() {
        if (this.f51423h == null) {
            return null;
        }
        String strSubstring = this.f51424i.substring(f9g.a0(this.f51424i, '#', 0, false, 6, null) + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: b */
    public final String m53872b() {
        if (this.f51418c.length() == 0) {
            return "";
        }
        String strSubstring = this.f51424i.substring(f9g.a0(this.f51424i, ':', this.f51416a.length() + 3, false, 4, null) + 1, f9g.a0(this.f51424i, '@', 0, false, 6, null));
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: c */
    public final String m53873c() {
        int iA0 = f9g.a0(this.f51424i, '/', this.f51416a.length() + 3, false, 4, null);
        String str = this.f51424i;
        String strSubstring = this.f51424i.substring(iA0, ggj.m28629i(str, "?#", iA0, str.length()));
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: d */
    public final List m53874d() {
        int iA0 = f9g.a0(this.f51424i, '/', this.f51416a.length() + 3, false, 4, null);
        String str = this.f51424i;
        int iM28629i = ggj.m28629i(str, "?#", iA0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iA0 < iM28629i) {
            int i = iA0 + 1;
            int iM28628h = ggj.m28628h(this.f51424i, '/', i, iM28629i);
            String strSubstring = this.f51424i.substring(i, iM28628h);
            sq8.m48648g(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iA0 = iM28628h;
        }
        return arrayList;
    }

    /* renamed from: e */
    public final String m53875e() {
        if (this.f51422g == null) {
            return null;
        }
        int iA0 = f9g.a0(this.f51424i, '?', 0, false, 6, null) + 1;
        String str = this.f51424i;
        String strSubstring = this.f51424i.substring(iA0, ggj.m28628h(str, '#', iA0, str.length()));
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w48) && sq8.m48644c(((w48) obj).f51424i, this.f51424i);
    }

    /* renamed from: f */
    public final String m53876f() {
        if (this.f51417b.length() == 0) {
            return "";
        }
        int length = this.f51416a.length() + 3;
        String str = this.f51424i;
        String strSubstring = this.f51424i.substring(length, ggj.m28629i(str, ":@", length, str.length()));
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: h */
    public final String m53877h() {
        return this.f51419d;
    }

    public int hashCode() {
        return this.f51424i.hashCode();
    }

    /* renamed from: i */
    public final boolean m53878i() {
        return sq8.m48644c(this.f51416a, "https");
    }

    /* renamed from: j */
    public final C17774a m53879j() {
        C17774a c17774a = new C17774a();
        c17774a.m53893E(this.f51416a);
        c17774a.m53890B(m53876f());
        c17774a.m53889A(m53872b());
        c17774a.m53891C(this.f51419d);
        c17774a.m53892D(this.f51420e != f51415j.m53925b(this.f51416a) ? this.f51420e : -1);
        c17774a.m53907j().clear();
        c17774a.m53907j().addAll(m53874d());
        c17774a.m53905h(m53875e());
        c17774a.m53923z(m53871a());
        return c17774a;
    }

    /* renamed from: k */
    public final C17774a m53880k(String str) {
        sq8.m48649h(str, "link");
        try {
            return new C17774a().m53911n(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final List m53881m() {
        return this.f51421f;
    }

    /* renamed from: n */
    public final int m53882n() {
        return this.f51420e;
    }

    /* renamed from: o */
    public final String m53883o() {
        if (this.f51422g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f51415j.m53928e(this.f51422g, sb);
        return sb.toString();
    }

    /* renamed from: p */
    public final String m53884p() {
        C17774a c17774aM53880k = m53880k("/...");
        sq8.m48646e(c17774aM53880k);
        return c17774aM53880k.m53897I("").m53913p("").m53903f().toString();
    }

    /* renamed from: q */
    public final w48 m53885q(String str) {
        sq8.m48649h(str, "link");
        C17774a c17774aM53880k = m53880k(str);
        if (c17774aM53880k != null) {
            return c17774aM53880k.m53903f();
        }
        return null;
    }

    /* renamed from: r */
    public final String m53886r() {
        return this.f51416a;
    }

    /* renamed from: s */
    public final URI m53887s() {
        String string = m53879j().m53919v().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new mge("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m38996h(string, ""));
                sq8.m48646e(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: t */
    public final URL m53888t() {
        try {
            return new URL(this.f51424i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f51424i;
    }

    public w48(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6) {
        this.f51416a = str;
        this.f51417b = str2;
        this.f51418c = str3;
        this.f51419d = str4;
        this.f51420e = i;
        this.f51421f = list;
        this.f51422g = list2;
        this.f51423h = str5;
        this.f51424i = str6;
    }
}
