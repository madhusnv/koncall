package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001o.bh3;
import p001o.ch3;
import p001o.cj9;
import p001o.dh3;
import p001o.e9g;
import p001o.f9g;
import p001o.gi9;
import p001o.hh3;
import p001o.hwc;
import p001o.id5;
import p001o.in1;
import p001o.kf9;
import p001o.kh3;
import p001o.mge;
import p001o.si9;
import p001o.sq8;
import p001o.uk7;
import p001o.vg3;
import p001o.vyh;
import p001o.wrb;
import p001o.xk7;
import p001o.y3i;
import p001o.yrb;

/* renamed from: androidx.navigation.f */
/* loaded from: classes2.dex */
public final class C2335f {

    /* renamed from: q */
    public static final b f9522q = new b(null);

    /* renamed from: r */
    public static final Pattern f9523r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s */
    public static final Pattern f9524s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: t */
    public static final String f9525t = "http[s]?://";

    /* renamed from: u */
    public static final String f9526u = ".*";

    /* renamed from: v */
    public static final String f9527v = "\\E.*\\Q";

    /* renamed from: w */
    public static final String f9528w = "([^/]*?|)";

    /* renamed from: a */
    public final String f9529a;

    /* renamed from: b */
    public final String f9530b;

    /* renamed from: c */
    public final String f9531c;

    /* renamed from: e */
    public String f9533e;

    /* renamed from: h */
    public final gi9 f9536h;

    /* renamed from: i */
    public boolean f9537i;

    /* renamed from: j */
    public final gi9 f9538j;

    /* renamed from: k */
    public final gi9 f9539k;

    /* renamed from: l */
    public final gi9 f9540l;

    /* renamed from: m */
    public final gi9 f9541m;

    /* renamed from: n */
    public String f9542n;

    /* renamed from: o */
    public final gi9 f9543o;

    /* renamed from: p */
    public boolean f9544p;

    /* renamed from: d */
    public final List f9532d = new ArrayList();

    /* renamed from: f */
    public final gi9 f9534f = si9.m48360a(new l());

    /* renamed from: g */
    public final gi9 f9535g = si9.m48360a(new j());

    /* renamed from: androidx.navigation.f$a */
    public static final class a {

        /* renamed from: d */
        public static final C19573a f9545d = new C19573a(null);

        /* renamed from: a */
        public String f9546a;

        /* renamed from: b */
        public String f9547b;

        /* renamed from: c */
        public String f9548c;

        /* renamed from: androidx.navigation.f$a$a, reason: collision with other inner class name */
        public static final class C19573a {
            public C19573a() {
            }

            public /* synthetic */ C19573a(id5 id5Var) {
                this();
            }
        }

        /* renamed from: a */
        public final C2335f m8683a() {
            return new C2335f(this.f9546a, this.f9547b, this.f9548c);
        }

        /* renamed from: b */
        public final a m8684b(String str) {
            sq8.m48649h(str, "action");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }
            this.f9547b = str;
            return this;
        }

        /* renamed from: c */
        public final a m8685c(String str) {
            sq8.m48649h(str, "mimeType");
            this.f9548c = str;
            return this;
        }

        /* renamed from: d */
        public final a m8686d(String str) {
            sq8.m48649h(str, "uriPattern");
            this.f9546a = str;
            return this;
        }
    }

    /* renamed from: androidx.navigation.f$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: androidx.navigation.f$c */
    public static final class c implements Comparable {

        /* renamed from: a */
        public String f9549a;

        /* renamed from: b */
        public String f9550b;

        public c(String str) {
            List listM21246k;
            sq8.m48649h(str, "mimeType");
            List listM38998j = new mge("/").m38998j(str, 0);
            if (listM38998j.isEmpty()) {
                listM21246k = ch3.m21246k();
            } else {
                ListIterator listIterator = listM38998j.listIterator(listM38998j.size());
                while (listIterator.hasPrevious()) {
                    if (!(((String) listIterator.previous()).length() == 0)) {
                        listM21246k = kh3.J0(listM38998j, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listM21246k = ch3.m21246k();
            }
            this.f9549a = (String) listM21246k.get(0);
            this.f9550b = (String) listM21246k.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            sq8.m48649h(cVar, "other");
            int i = sq8.m48644c(this.f9549a, cVar.f9549a) ? 2 : 0;
            return sq8.m48644c(this.f9550b, cVar.f9550b) ? i + 1 : i;
        }

        /* renamed from: c */
        public final String m8688c() {
            return this.f9550b;
        }

        /* renamed from: d */
        public final String m8689d() {
            return this.f9549a;
        }
    }

    /* renamed from: androidx.navigation.f$d */
    public static final class d {

        /* renamed from: a */
        public String f9551a;

        /* renamed from: b */
        public final List f9552b = new ArrayList();

        /* renamed from: a */
        public final void m8690a(String str) {
            sq8.m48649h(str, "name");
            this.f9552b.add(str);
        }

        /* renamed from: b */
        public final List m8691b() {
            return this.f9552b;
        }

        /* renamed from: c */
        public final String m8692c() {
            return this.f9551a;
        }

        /* renamed from: d */
        public final void m8693d(String str) {
            this.f9551a = str;
        }
    }

    /* renamed from: androidx.navigation.f$e */
    public static final class e extends kf9 implements uk7 {
        public e() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List list;
            hwc hwcVarM8668l = C2335f.this.m8668l();
            return (hwcVarM8668l == null || (list = (List) hwcVarM8668l.m31229c()) == null) ? new ArrayList() : list;
        }
    }

    /* renamed from: androidx.navigation.f$f */
    public static final class f extends kf9 implements uk7 {
        public f() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hwc invoke() {
            return C2335f.this.m8658H();
        }
    }

    /* renamed from: androidx.navigation.f$g */
    public static final class g extends kf9 implements uk7 {
        public g() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String strM8670n = C2335f.this.m8670n();
            if (strM8670n != null) {
                return Pattern.compile(strM8670n, 2);
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.f$h */
    public static final class h extends kf9 implements uk7 {
        public h() {
            super(0);
        }

        @Override // p001o.uk7
        public final String invoke() {
            hwc hwcVarM8668l = C2335f.this.m8668l();
            if (hwcVarM8668l != null) {
                return (String) hwcVarM8668l.m31230d();
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.f$i */
    public static final class i extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Bundle f9557a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Bundle bundle) {
            super(1);
            this.f9557a = bundle;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            sq8.m48649h(str, "argName");
            return Boolean.valueOf(!this.f9557a.containsKey(str));
        }
    }

    /* renamed from: androidx.navigation.f$j */
    public static final class j extends kf9 implements uk7 {
        public j() {
            super(0);
        }

        @Override // p001o.uk7
        public final Boolean invoke() {
            return Boolean.valueOf((C2335f.this.m8681y() == null || Uri.parse(C2335f.this.m8681y()).getQuery() == null) ? false : true);
        }
    }

    /* renamed from: androidx.navigation.f$k */
    public static final class k extends kf9 implements uk7 {
        public k() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = C2335f.this.f9542n;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.f$l */
    public static final class l extends kf9 implements uk7 {
        public l() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = C2335f.this.f9533e;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.f$m */
    public static final class m extends kf9 implements uk7 {
        public m() {
            super(0);
        }

        @Override // p001o.uk7
        public final Map invoke() {
            return C2335f.this.m8662L();
        }
    }

    public C2335f(String str, String str2, String str3) {
        this.f9529a = str;
        this.f9530b = str2;
        this.f9531c = str3;
        cj9 cj9Var = cj9.NONE;
        this.f9536h = si9.m48361b(cj9Var, new m());
        this.f9538j = si9.m48361b(cj9Var, new f());
        this.f9539k = si9.m48361b(cj9Var, new e());
        this.f9540l = si9.m48361b(cj9Var, new h());
        this.f9541m = si9.m48360a(new g());
        this.f9543o = si9.m48360a(new k());
        m8661K();
        m8660J();
    }

    /* renamed from: A */
    public final boolean m8651A() {
        return ((Boolean) this.f9535g.getValue()).booleanValue();
    }

    /* renamed from: B */
    public final boolean m8652B(String str) {
        String str2 = this.f9530b;
        if (str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return sq8.m48644c(str2, str);
    }

    /* renamed from: C */
    public final boolean m8653C(String str) {
        if (this.f9531c == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        Pattern patternM8678v = m8678v();
        sq8.m48646e(patternM8678v);
        return patternM8678v.matcher(str).matches();
    }

    /* renamed from: D */
    public final boolean m8654D(Uri uri) {
        if (m8679w() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        Pattern patternM8679w = m8679w();
        sq8.m48646e(patternM8679w);
        return patternM8679w.matcher(uri.toString()).matches();
    }

    /* renamed from: E */
    public final boolean m8655E(yrb yrbVar) {
        sq8.m48649h(yrbVar, "deepLinkRequest");
        return m8654D(yrbVar.m58140c()) && m8652B(yrbVar.m58138a()) && m8653C(yrbVar.m58139b());
    }

    /* renamed from: F */
    public final void m8656F(Bundle bundle, String str, String str2, C2331b c2331b) {
        if (c2331b != null) {
            c2331b.m8539a().m8835d(bundle, str, str2);
        } else {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: G */
    public final boolean m8657G(Bundle bundle, String str, String str2, C2331b c2331b) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (c2331b == null) {
            return false;
        }
        AbstractC2347n abstractC2347nM8539a = c2331b.m8539a();
        abstractC2347nM8539a.m8836e(bundle, str, str2, abstractC2347nM8539a.mo8832a(bundle, str));
        return false;
    }

    /* renamed from: H */
    public final hwc m8658H() {
        String str = this.f9529a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f9529a).getFragment();
        StringBuilder sb = new StringBuilder();
        sq8.m48646e(fragment);
        m8663g(fragment, arrayList, sb);
        String string = sb.toString();
        sq8.m48648g(string, "fragRegex.toString()");
        return vyh.m53620a(arrayList, string);
    }

    /* renamed from: I */
    public final boolean m8659I(List list, d dVar, Bundle bundle, Map map) {
        Object objValueOf;
        Bundle bundleM32435b = in1.m32435b(new hwc[0]);
        Iterator it = dVar.m8691b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            C2331b c2331b = (C2331b) map.get(str);
            AbstractC2347n abstractC2347nM8539a = c2331b != null ? c2331b.m8539a() : null;
            if ((abstractC2347nM8539a instanceof vg3) && !c2331b.m8540b()) {
                abstractC2347nM8539a.mo8839h(bundleM32435b, str, ((vg3) abstractC2347nM8539a).mo8842k());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            String strM8692c = dVar.m8692c();
            Matcher matcher = strM8692c != null ? Pattern.compile(strM8692c, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            List listM8691b = dVar.m8691b();
            ArrayList arrayList = new ArrayList(dh3.m23088v(listM8691b, 10));
            int i2 = 0;
            for (Object obj : listM8691b) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ch3.m21256u();
                }
                String str3 = (String) obj;
                String strGroup = matcher.group(i3);
                if (strGroup == null) {
                    strGroup = "";
                } else {
                    sq8.m48648g(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                }
                C2331b c2331b2 = (C2331b) map.get(str3);
                try {
                    if (bundleM32435b.containsKey(str3)) {
                        objValueOf = Boolean.valueOf(m8657G(bundleM32435b, str3, strGroup, c2331b2));
                    } else {
                        m8656F(bundleM32435b, str3, strGroup, c2331b2);
                        objValueOf = y3i.f54824a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = y3i.f54824a;
                }
                arrayList.add(objValueOf);
                i2 = i3;
            }
        }
        bundle.putAll(bundleM32435b);
        return true;
    }

    /* renamed from: J */
    public final void m8660J() {
        if (this.f9531c == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f9531c).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.f9531c + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.f9531c);
        this.f9542n = e9g.m24593G("^(" + cVar.m8689d() + "|[*]+)/(" + cVar.m8688c() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    /* renamed from: K */
    public final void m8661K() {
        if (this.f9529a == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!f9523r.matcher(this.f9529a).find()) {
            sb.append(f9525t);
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f9529a);
        matcher.find();
        boolean z = false;
        String strSubstring = this.f9529a.substring(0, matcher.start());
        sq8.m48648g(strSubstring, "substring(...)");
        m8663g(strSubstring, this.f9532d, sb);
        String str = f9526u;
        if (!f9g.m26306P(sb, str, false, 2, null) && !f9g.m26306P(sb, f9528w, false, 2, null)) {
            z = true;
        }
        this.f9544p = z;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb.toString();
        sq8.m48648g(string, "uriRegex.toString()");
        this.f9533e = e9g.m24593G(string, str, f9527v, false, 4, null);
    }

    /* renamed from: L */
    public final Map m8662L() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!m8651A()) {
            return linkedHashMap;
        }
        Uri uri = Uri.parse(this.f9529a);
        for (String str : uri.getQueryParameterNames()) {
            StringBuilder sb = new StringBuilder();
            List<String> queryParameters = uri.getQueryParameters(str);
            int iEnd = 0;
            if (!(queryParameters.size() <= 1)) {
                throw new IllegalArgumentException(("Query parameter " + str + " must only be present once in " + this.f9529a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
            sq8.m48648g(queryParameters, "queryParams");
            String str2 = (String) kh3.h0(queryParameters);
            if (str2 == null) {
                this.f9537i = true;
                str2 = str;
            }
            Matcher matcher = f9524s.matcher(str2);
            d dVar = new d();
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                sq8.m48647f(strGroup, "null cannot be cast to non-null type kotlin.String");
                dVar.m8690a(strGroup);
                sq8.m48648g(str2, "queryParam");
                String strSubstring = str2.substring(iEnd, matcher.start());
                sq8.m48648g(strSubstring, "substring(...)");
                sb.append(Pattern.quote(strSubstring));
                sb.append("(.+?)?");
                iEnd = matcher.end();
            }
            if (iEnd < str2.length()) {
                sq8.m48648g(str2, "queryParam");
                String strSubstring2 = str2.substring(iEnd);
                sq8.m48648g(strSubstring2, "substring(...)");
                sb.append(Pattern.quote(strSubstring2));
            }
            String string = sb.toString();
            sq8.m48648g(string, "argRegex.toString()");
            dVar.m8693d(e9g.m24593G(string, f9526u, f9527v, false, 4, null));
            sq8.m48648g(str, "paramName");
            linkedHashMap.put(str, dVar);
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2335f)) {
            return false;
        }
        C2335f c2335f = (C2335f) obj;
        return sq8.m48644c(this.f9529a, c2335f.f9529a) && sq8.m48644c(this.f9530b, c2335f.f9530b) && sq8.m48644c(this.f9531c, c2335f.f9531c);
    }

    /* renamed from: g */
    public final void m8663g(String str, List list, StringBuilder sb) {
        Matcher matcher = f9524s.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            sq8.m48647f(strGroup, "null cannot be cast to non-null type kotlin.String");
            list.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                sq8.m48648g(strSubstring, "substring(...)");
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append(f9528w);
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            sq8.m48648g(strSubstring2, "substring(...)");
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    /* renamed from: h */
    public final int m8664h(Uri uri) {
        if (uri == null || this.f9529a == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.f9529a).getPathSegments();
        sq8.m48648g(pathSegments, "requestedPathSegments");
        sq8.m48648g(pathSegments2, "uriPathSegments");
        return kh3.l0(pathSegments, pathSegments2).size();
    }

    public int hashCode() {
        String str = this.f9529a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f9530b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9531c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m8665i() {
        return this.f9530b;
    }

    /* renamed from: j */
    public final List m8666j() {
        List list = this.f9532d;
        Collection collectionValues = m8680x().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            hh3.m30441A(arrayList, ((d) it.next()).m8691b());
        }
        return kh3.x0(kh3.x0(list, arrayList), m8667k());
    }

    /* renamed from: k */
    public final List m8667k() {
        return (List) this.f9539k.getValue();
    }

    /* renamed from: l */
    public final hwc m8668l() {
        return (hwc) this.f9538j.getValue();
    }

    /* renamed from: m */
    public final Pattern m8669m() {
        return (Pattern) this.f9541m.getValue();
    }

    /* renamed from: n */
    public final String m8670n() {
        return (String) this.f9540l.getValue();
    }

    /* renamed from: o */
    public final Bundle m8671o(Uri uri, Map map) {
        sq8.m48649h(uri, "deepLink");
        sq8.m48649h(map, "arguments");
        Pattern patternM8679w = m8679w();
        Matcher matcher = patternM8679w != null ? patternM8679w.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!m8673q(matcher, bundle, map)) {
            return null;
        }
        if (m8651A() && !m8674r(uri, bundle, map)) {
            return null;
        }
        m8675s(uri.getFragment(), bundle, map);
        if (!wrb.m54932a(map, new i(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* renamed from: p */
    public final Bundle m8672p(Uri uri, Map map) {
        sq8.m48649h(map, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern patternM8679w = m8679w();
        Matcher matcher = patternM8679w != null ? patternM8679w.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        m8673q(matcher, bundle, map);
        if (m8651A()) {
            m8674r(uri, bundle, map);
        }
        return bundle;
    }

    /* renamed from: q */
    public final boolean m8673q(Matcher matcher, Bundle bundle, Map map) {
        List list = this.f9532d;
        ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ch3.m21256u();
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i3));
            C2331b c2331b = (C2331b) map.get(str);
            try {
                sq8.m48648g(strDecode, "value");
                m8656F(bundle, str, strDecode, c2331b);
                arrayList.add(y3i.f54824a);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m8674r(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : m8680x().entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f9537i && (query = uri.getQuery()) != null && !sq8.m48644c(query, uri.toString())) {
                queryParameters = bh3.m18963e(query);
            }
            sq8.m48648g(queryParameters, "inputParams");
            if (!m8659I(queryParameters, dVar, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final void m8675s(String str, Bundle bundle, Map map) {
        Pattern patternM8669m = m8669m();
        Matcher matcher = patternM8669m != null ? patternM8669m.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List listM8667k = m8667k();
            ArrayList arrayList = new ArrayList(dh3.m23088v(listM8667k, 10));
            int i2 = 0;
            for (Object obj : listM8667k) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ch3.m21256u();
                }
                String str2 = (String) obj;
                String strDecode = Uri.decode(matcher.group(i3));
                C2331b c2331b = (C2331b) map.get(str2);
                try {
                    sq8.m48648g(strDecode, "value");
                    m8656F(bundle, str2, strDecode, c2331b);
                    arrayList.add(y3i.f54824a);
                    i2 = i3;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    public final String m8676t() {
        return this.f9531c;
    }

    /* renamed from: u */
    public final int m8677u(String str) {
        sq8.m48649h(str, "mimeType");
        if (this.f9531c != null) {
            Pattern patternM8678v = m8678v();
            sq8.m48646e(patternM8678v);
            if (patternM8678v.matcher(str).matches()) {
                return new c(this.f9531c).compareTo(new c(str));
            }
        }
        return -1;
    }

    /* renamed from: v */
    public final Pattern m8678v() {
        return (Pattern) this.f9543o.getValue();
    }

    /* renamed from: w */
    public final Pattern m8679w() {
        return (Pattern) this.f9534f.getValue();
    }

    /* renamed from: x */
    public final Map m8680x() {
        return (Map) this.f9536h.getValue();
    }

    /* renamed from: y */
    public final String m8681y() {
        return this.f9529a;
    }

    /* renamed from: z */
    public final boolean m8682z() {
        return this.f9544p;
    }
}
