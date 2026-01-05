package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;
import p001o.m76;

/* loaded from: classes3.dex */
public final class e3d implements m76 {

    /* renamed from: h */
    public static final C13097a f20909h = new C13097a(null);

    /* renamed from: i */
    public static final Set f20910i;

    /* renamed from: j */
    public static final Set f20911j;

    /* renamed from: k */
    public static final Set f20912k;

    /* renamed from: l */
    public static final Set f20913l;

    /* renamed from: m */
    public static final Set f20914m;

    /* renamed from: n */
    public static final Set f20915n;

    /* renamed from: o */
    public static final Set f20916o;

    /* renamed from: p */
    public static final Set f20917p;

    /* renamed from: q */
    public static final Set f20918q;

    /* renamed from: r */
    public static final Set f20919r;

    /* renamed from: s */
    public static final m76 f20920s;

    /* renamed from: t */
    public static final m76 f20921t;

    /* renamed from: u */
    public static final m76 f20922u;

    /* renamed from: v */
    public static final m76 f20923v;

    /* renamed from: w */
    public static final m76 f20924w;

    /* renamed from: x */
    public static final m76 f20925x;

    /* renamed from: y */
    public static final m76 f20926y;

    /* renamed from: z */
    public static final m76 f20927z;

    /* renamed from: b */
    public final String f20928b;

    /* renamed from: c */
    public final Set f20929c;

    /* renamed from: d */
    public final Map f20930d;

    /* renamed from: e */
    public final Map f20931e;

    /* renamed from: f */
    public final Map f20932f;

    /* renamed from: g */
    public final Map f20933g;

    /* renamed from: o.e3d$a */
    public static final class C13097a {
        public C13097a() {
        }

        public /* synthetic */ C13097a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public final m76 m24246c() {
            return e3d.f20925x;
        }

        /* renamed from: d */
        public final m76 m24247d() {
            return e3d.f20924w;
        }

        /* renamed from: e */
        public final m76 m24248e() {
            return e3d.f20920s;
        }

        /* renamed from: f */
        public final m76 m24249f() {
            return e3d.f20922u;
        }

        /* renamed from: g */
        public final m76 m24250g() {
            return e3d.f20923v;
        }

        /* renamed from: h */
        public final m76 m24251h() {
            return e3d.f20927z;
        }

        /* renamed from: i */
        public final m76 m24252i() {
            return e3d.f20926y;
        }

        /* renamed from: j */
        public final m76 m24253j() {
            return e3d.f20921t;
        }

        /* renamed from: k */
        public final String m24254k(char c) {
            StringBuilder sb = new StringBuilder();
            int i = c & 255;
            sb.append('%');
            sb.append("0123456789ABCDEF".charAt(i >> 4));
            sb.append("0123456789ABCDEF".charAt(i & 15));
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            return string;
        }

        /* renamed from: l */
        public final void m24255l(StringBuilder sb, byte b) {
            int i = b & 255;
            sb.append('%');
            sb.append("0123456789ABCDEF".charAt(i >> 4));
            sb.append("0123456789ABCDEF".charAt(i & 15));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Set setV0 = kh3.V0(kh3.w0(new kh2('A', 'Z'), new kh2('a', 'z')));
        f20910i = setV0;
        Set setV02 = kh3.V0(new kh2('0', '9'));
        f20911j = setV02;
        Set setM42272l = oif.m42272l(oif.m42272l(setV0, setV02), nif.m40668i('-', '.', '_', '~'));
        f20912k = setM42272l;
        Set setM40668i = nif.m40668i('!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=');
        f20913l = setM40668i;
        Set setM42272l2 = oif.m42272l(setM42272l, setM40668i);
        f20914m = setM42272l2;
        Set setM42272l3 = oif.m42272l(setM42272l2, nif.m40668i(':', '@'));
        f20915n = setM42272l3;
        Set setM42272l4 = oif.m42272l(setM42272l3, nif.m40668i('/', '?'));
        f20916o = setM42272l4;
        Set setM42270j = oif.m42270j(setM42272l4, nif.m40668i('&', '='));
        f20917p = setM42270j;
        f20918q = setM42272l;
        f20919r = setM42272l;
        f20920s = new e3d("host", oif.m42273m(setM42272l, ':'), null, 4, null);
        f20921t = new e3d("user info", setM42272l2, null, 4, null);
        int i = 4;
        f20922u = new e3d(ClientCookie.PATH_ATTR, setM42272l3, null, i, null);
        f20923v = new e3d("query string", setM42270j, null, 4, null);
        f20924w = new e3d("fragment", setM42272l4, null == true ? 1 : 0, i, null);
        Map map = null;
        int i2 = 4;
        f20925x = new e3d("form URL", setM42272l, map, i2, null == true ? 1 : 0);
        f20926y = new e3d("Smithy label", setM42272l, map, i2, null == true ? 1 : 0);
        f20927z = new e3d("SigV4", setM42272l, map, i2, null == true ? 1 : 0);
    }

    public e3d(String str, Set set, Map map) {
        sq8.m48649h(str, "name");
        sq8.m48649h(set, "validChars");
        sq8.m48649h(map, "specialMapping");
        this.f20928b = str;
        this.f20929c = set;
        this.f20930d = map;
        kl8 kl8VarM18616s = bce.m18616s(0, 128);
        ArrayList arrayList = new ArrayList(dh3.m23088v(kl8VarM18616s, 10));
        Iterator it = kl8VarM18616s.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf((char) ((dl8) it).mo23412a()));
        }
        Set set2 = this.f20929c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!set2.contains(Character.valueOf(((Character) obj).charValue()))) {
                arrayList2.add(obj);
            }
        }
        C13097a c13097a = f20909h;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(arrayList2, 10)), 16));
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(obj2, c13097a.m24254k(((Character) obj2).charValue()));
        }
        this.f20931e = linkedHashMap;
        Map map2 = this.f20930d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(hsa.m31055e(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap2.put(entry.getKey(), String.valueOf(((Character) entry.getValue()).charValue()));
        }
        this.f20932f = isa.m32687n(linkedHashMap, linkedHashMap2);
        Set set3 = this.f20929c;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(set3, 10)), 16));
        for (Object obj3 : set3) {
            linkedHashMap3.put(obj3, Character.valueOf(((Character) obj3).charValue()));
        }
        Set<Map.Entry> setEntrySet = isa.m32687n(linkedHashMap3, this.f20930d).entrySet();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(setEntrySet, 10)), 16));
        for (Map.Entry entry2 : setEntrySet) {
            hwc hwcVarM53620a = vyh.m53620a(Character.valueOf(((Character) entry2.getValue()).charValue()), Character.valueOf(((Character) entry2.getKey()).charValue()));
            linkedHashMap4.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
        }
        this.f20933g = linkedHashMap4;
    }

    @Override // p001o.m76
    /* renamed from: a */
    public String mo24241a(String str) {
        sq8.m48649h(str, "decoded");
        StringBuilder sb = new StringBuilder(str.length());
        for (byte b : e9g.m24603u(str)) {
            char c = (char) b;
            if (this.f20929c.contains(Character.valueOf(c))) {
                sb.append(c);
            } else {
                String str2 = (String) this.f20932f.get(Character.valueOf(c));
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    f20909h.m24255l(sb, b);
                    y3i y3iVar = y3i.f54824a;
                }
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    @Override // p001o.m76
    /* renamed from: b */
    public y66 mo24242b(String str) {
        return m76.C15243b.m38480a(this, str);
    }

    @Override // p001o.m76
    /* renamed from: c */
    public y66 mo24243c(String str) {
        return m76.C15243b.m38481b(this, str);
    }

    @Override // p001o.m76
    public String decode(String str) {
        sq8.m48649h(str, "encoded");
        StringBuilder sb = new StringBuilder(str.length());
        byte[] bArr = null;
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(str.length() - i) / 3];
                }
                int i2 = 0;
                while (i + 2 < str.length() && cCharAt == '%') {
                    int i3 = i + 3;
                    String strSubstring = str.substring(i + 1, i3);
                    sq8.m48648g(strSubstring, "substring(...)");
                    Integer numM22639m = d9g.m22639m(strSubstring, 16);
                    if (numM22639m == null) {
                        break;
                    }
                    byte bIntValue = (byte) numM22639m.intValue();
                    int i4 = i2 + 1;
                    bArr[i2] = bIntValue;
                    if (i3 < str.length()) {
                        cCharAt = str.charAt(i3);
                    }
                    i2 = i4;
                    i = i3;
                }
                sb.append(e9g.m24602t(bArr, 0, i2, false, 5, null));
                if (i != str.length() && cCharAt == '%') {
                    sb.append(cCharAt);
                }
            } else {
                Character ch = (Character) this.f20933g.get(Character.valueOf(cCharAt));
                if (ch != null) {
                    cCharAt = ch.charValue();
                }
                sb.append(cCharAt);
            }
            i++;
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    @Override // p001o.m76
    public String getName() {
        return this.f20928b;
    }

    public /* synthetic */ e3d(String str, Set set, Map map, int i, id5 id5Var) {
        this(str, set, (i & 4) != 0 ? isa.m32681h() : map);
    }
}
