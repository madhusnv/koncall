package iz;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import nx.AbstractC5178p;
import yz.AbstractC8831a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.x */
/* loaded from: classes3.dex */
public final class C3391x {

    /* renamed from: a */
    public final String f17991a;

    /* renamed from: b */
    public final String f17992b;

    /* renamed from: c */
    public final String f17993c;

    /* renamed from: d */
    public final String f17994d;

    /* renamed from: e */
    public final int f17995e;

    /* renamed from: f */
    public final ArrayList f17996f;

    /* renamed from: g */
    public final List f17997g;

    /* renamed from: h */
    public final String f17998h;

    /* renamed from: i */
    public final String f17999i;

    public C3391x(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f17991a = str;
        this.f17992b = str2;
        this.f17993c = str3;
        this.f17994d = str4;
        this.f17995e = i10;
        this.f17996f = arrayList;
        this.f17997g = arrayList2;
        this.f17998h = str5;
        this.f17999i = str6;
    }

    /* renamed from: a */
    public final String m7796a() {
        if (this.f17993c.length() == 0) {
            return "";
        }
        int length = this.f17991a.length() + 3;
        String str = this.f17999i;
        String strSubstring = str.substring(AbstractC5178p.m10098I(str, ':', length, 4) + 1, AbstractC5178p.m10098I(str, '@', 0, 6));
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: b */
    public final String m7797b() {
        int length = this.f17991a.length() + 3;
        String str = this.f17999i;
        int iM10098I = AbstractC5178p.m10098I(str, '/', length, 4);
        String strSubstring = str.substring(iM10098I, AbstractC4297c.m9000d(str, iM10098I, str.length(), "?#"));
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: c */
    public final ArrayList m7798c() {
        int length = this.f17991a.length() + 3;
        String str = this.f17999i;
        int iM10098I = AbstractC5178p.m10098I(str, '/', length, 4);
        int iM9000d = AbstractC4297c.m9000d(str, iM10098I, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iM10098I < iM9000d) {
            int i10 = iM10098I + 1;
            int iM8999c = AbstractC4297c.m8999c(str, '/', i10, iM9000d);
            String strSubstring = str.substring(i10, iM8999c);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iM10098I = iM8999c;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String m7799d() {
        if (this.f17997g == null) {
            return null;
        }
        String str = this.f17999i;
        int iM10098I = AbstractC5178p.m10098I(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iM10098I, AbstractC4297c.m8999c(str, '#', iM10098I, str.length()));
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: e */
    public final String m7800e() {
        if (this.f17992b.length() == 0) {
            return "";
        }
        int length = this.f17991a.length() + 3;
        String str = this.f17999i;
        String strSubstring = str.substring(length, AbstractC4297c.m9000d(str, length, str.length(), ":@"));
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3391x) && AbstractC4154l.m8918a(((C3391x) obj).f17999i, this.f17999i);
    }

    /* renamed from: f */
    public final C3390w m7801f(String link) {
        AbstractC4154l.m8923f(link, "link");
        try {
            C3390w c3390w = new C3390w();
            c3390w.m7795c(this, link);
            return c3390w;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final String m7802g() {
        C3390w c3390wM7801f = m7801f("/...");
        AbstractC4154l.m8920c(c3390wM7801f);
        c3390wM7801f.f17985d = AbstractC8831a.m16284a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        c3390wM7801f.f17986e = AbstractC8831a.m16284a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return c3390wM7801f.m7793a().f17999i;
    }

    /* renamed from: h */
    public final URI m7803h() {
        String strSubstring;
        String strReplaceAll;
        C3390w c3390w = new C3390w();
        ArrayList arrayList = (ArrayList) c3390w.f17989h;
        String scheme = this.f17991a;
        c3390w.f17983b = scheme;
        c3390w.f17985d = m7800e();
        c3390w.f17986e = m7796a();
        c3390w.f17987f = this.f17994d;
        AbstractC4154l.m8923f(scheme, "scheme");
        int i10 = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i11 = this.f17995e;
        c3390w.f17984c = i11 != i10 ? i11 : -1;
        arrayList.clear();
        arrayList.addAll(m7798c());
        String strM7799d = m7799d();
        c3390w.f17990i = strM7799d != null ? C3390w.m7792d(AbstractC8831a.m16284a(0, 0, 83, strM7799d, " \"'<>#")) : null;
        if (this.f17998h == null) {
            strSubstring = null;
        } else {
            String str = this.f17999i;
            strSubstring = str.substring(AbstractC5178p.m10098I(str, '#', 0, 6) + 1);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
        }
        c3390w.f17988g = strSubstring;
        String str2 = (String) c3390w.f17987f;
        if (str2 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC4154l.m8922e(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str2).replaceAll("");
            AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        c3390w.f17987f = strReplaceAll;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.set(i12, AbstractC8831a.m16284a(0, 0, 99, (String) arrayList.get(i12), "[]"));
        }
        ArrayList arrayList2 = (ArrayList) c3390w.f17990i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                String str3 = (String) arrayList2.get(i13);
                arrayList2.set(i13, str3 != null ? AbstractC8831a.m16284a(0, 0, 67, str3, "\\^`{|}") : null);
            }
        }
        String str4 = (String) c3390w.f17988g;
        c3390w.f17988g = str4 != null ? AbstractC8831a.m16284a(0, 0, 35, str4, " \"#<>\\^`{|}") : null;
        String input = c3390w.toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e2) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC4154l.m8922e(patternCompile2, "compile(...)");
                AbstractC4154l.m8923f(input, "input");
                String strReplaceAll2 = patternCompile2.matcher(input).replaceAll("");
                AbstractC4154l.m8922e(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC4154l.m8920c(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.f17999i.hashCode();
    }

    public final String toString() {
        return this.f17999i;
    }
}
