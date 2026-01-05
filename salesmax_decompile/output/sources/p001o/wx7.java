package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public final class wx7 implements Iterable, sb9 {

    /* renamed from: b */
    public static final C17998b f52834b = new C17998b(null);

    /* renamed from: a */
    public final String[] f52835a;

    /* renamed from: o.wx7$a */
    public static final class C17997a {

        /* renamed from: a */
        public final List f52836a = new ArrayList(20);

        /* renamed from: a */
        public final C17997a m55335a(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            return vfj.m52709b(this, str, str2);
        }

        /* renamed from: b */
        public final C17997a m55336b(wx7 wx7Var) {
            sq8.m48649h(wx7Var, "headers");
            return vfj.m52710c(this, wx7Var);
        }

        /* renamed from: c */
        public final C17997a m55337c(String str) {
            sq8.m48649h(str, "line");
            int iA0 = f9g.a0(str, ':', 1, false, 4, null);
            if (iA0 != -1) {
                String strSubstring = str.substring(0, iA0);
                sq8.m48648g(strSubstring, "substring(...)");
                String strSubstring2 = str.substring(iA0 + 1);
                sq8.m48648g(strSubstring2, "substring(...)");
                m55338d(strSubstring, strSubstring2);
            } else if (str.charAt(0) == ':') {
                String strSubstring3 = str.substring(1);
                sq8.m48648g(strSubstring3, "substring(...)");
                m55338d("", strSubstring3);
            } else {
                m55338d("", str);
            }
            return this;
        }

        /* renamed from: d */
        public final C17997a m55338d(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            return vfj.m52711d(this, str, str2);
        }

        /* renamed from: e */
        public final C17997a m55339e(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            vfj.m52726s(str);
            m55338d(str, str2);
            return this;
        }

        /* renamed from: f */
        public final wx7 m55340f() {
            return vfj.m52712e(this);
        }

        /* renamed from: g */
        public final List m55341g() {
            return this.f52836a;
        }

        /* renamed from: h */
        public final C17997a m55342h(String str) {
            sq8.m48649h(str, "name");
            return vfj.m52720m(this, str);
        }

        /* renamed from: i */
        public final C17997a m55343i(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            return vfj.m52721n(this, str, str2);
        }
    }

    /* renamed from: o.wx7$b */
    public static final class C17998b {
        public C17998b() {
        }

        public /* synthetic */ C17998b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final wx7 m55344a(Map map) {
            sq8.m48649h(map, "<this>");
            return vfj.m52722o(map);
        }

        /* renamed from: b */
        public final wx7 m55345b(String... strArr) {
            sq8.m48649h(strArr, "namesAndValues");
            return vfj.m52716i((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public wx7(String[] strArr) {
        sq8.m48649h(strArr, "namesAndValues");
        this.f52835a = strArr;
    }

    /* renamed from: p */
    public static final wx7 m55325p(Map map) {
        return f52834b.m55344a(map);
    }

    /* renamed from: r */
    public static final wx7 m55326r(String... strArr) {
        return f52834b.m55345b(strArr);
    }

    /* renamed from: d */
    public final String m55327d(String str) {
        sq8.m48649h(str, "name");
        return vfj.m52715h(this.f52835a, str);
    }

    /* renamed from: e */
    public final String[] m55328e() {
        return this.f52835a;
    }

    public boolean equals(Object obj) {
        return vfj.m52713f(this, obj);
    }

    public int hashCode() {
        return vfj.m52714g(this);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return vfj.m52717j(this);
    }

    /* renamed from: j */
    public final String m55329j(int i) {
        return vfj.m52718k(this, i);
    }

    /* renamed from: n */
    public final Set m55330n() {
        TreeSet treeSet = new TreeSet(e9g.m24608z(h8g.f26398a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(m55329j(i));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        sq8.m48648g(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    /* renamed from: o */
    public final C17997a m55331o() {
        return vfj.m52719l(this);
    }

    public final int size() {
        return this.f52835a.length / 2;
    }

    public String toString() {
        return vfj.m52723p(this);
    }

    /* renamed from: v */
    public final Map m55332v() {
        TreeMap treeMap = new TreeMap(e9g.m24608z(h8g.f26398a));
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM55329j = m55329j(i);
            Locale locale = Locale.US;
            sq8.m48648g(locale, "US");
            String lowerCase = strM55329j.toLowerCase(locale);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m55333w(i));
        }
        return treeMap;
    }

    /* renamed from: w */
    public final String m55333w(int i) {
        return vfj.m52724q(this, i);
    }

    /* renamed from: y */
    public final List m55334y(String str) {
        sq8.m48649h(str, "name");
        return vfj.m52725r(this, str);
    }
}
