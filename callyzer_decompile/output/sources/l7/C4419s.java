package l7;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import nx.C5171i;
import nx.C5174l;
import nx.C5176n;
import og.f2;
import og.fg;
import og.pe;
import pg.n7;
import qw.C6361k;
import qw.C6366p;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import uz.AbstractC7582g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.s */
/* loaded from: classes.dex */
public final class C4419s {

    /* renamed from: q */
    public static final C5176n f22103q = new C5176n("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r */
    public static final C5176n f22104r = new C5176n("\\{(.+?)\\}");

    /* renamed from: s */
    public static final C5176n f22105s = new C5176n("http[s]?://");

    /* renamed from: t */
    public static final C5176n f22106t = new C5176n(".*");

    /* renamed from: u */
    public static final C5176n f22107u = new C5176n("([^/]*?|)");

    /* renamed from: v */
    public static final C5176n f22108v = new C5176n("^[^?#]+\\?([^#]*).*");

    /* renamed from: a */
    public final String f22109a;

    /* renamed from: b */
    public final String f22110b;

    /* renamed from: c */
    public final String f22111c;

    /* renamed from: d */
    public final ArrayList f22112d;

    /* renamed from: e */
    public final String f22113e;

    /* renamed from: f */
    public final C6366p f22114f;

    /* renamed from: g */
    public final C6366p f22115g;

    /* renamed from: h */
    public final Object f22116h;

    /* renamed from: i */
    public boolean f22117i;

    /* renamed from: j */
    public final Object f22118j;

    /* renamed from: k */
    public final Object f22119k;

    /* renamed from: l */
    public final Object f22120l;

    /* renamed from: m */
    public final C6366p f22121m;

    /* renamed from: n */
    public final String f22122n;

    /* renamed from: o */
    public final C6366p f22123o;

    /* renamed from: p */
    public final boolean f22124p;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4419s(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.C4419s.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m9236a(String str, ArrayList arrayList, StringBuilder sb2) {
        C5176n c5176n = f22104r;
        c5176n.getClass();
        Matcher matcher = c5176n.f25285a.matcher(str);
        AbstractC4154l.m8922e(matcher, "matcher(...)");
        int i10 = 0;
        for (C5174l c5174lM10640a = f2.m10640a(matcher, 0, str); c5174lM10640a != null; c5174lM10640a = c5174lM10640a.m10084c()) {
            C5171i c5171iM10081h = c5174lM10640a.f25282c.m10081h(1);
            AbstractC4154l.m8920c(c5171iM10081h);
            arrayList.add(c5171iM10081h.f25274a);
            if (c5174lM10640a.m10083b().f21646a > i10) {
                String strSubstring = str.substring(i10, c5174lM10640a.m10083b().f21646a);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
                String strQuote = Pattern.quote(strSubstring);
                AbstractC4154l.m8922e(strQuote, "quote(...)");
                sb2.append(strQuote);
            }
            String strPattern = f22107u.f25285a.pattern();
            AbstractC4154l.m8922e(strPattern, "pattern(...)");
            sb2.append(strPattern);
            i10 = c5174lM10640a.m10083b().f21647b + 1;
        }
        if (i10 < str.length()) {
            String strSubstring2 = str.substring(i10);
            AbstractC4154l.m8922e(strSubstring2, "substring(...)");
            String strQuote2 = Pattern.quote(strSubstring2);
            AbstractC4154l.m8922e(strQuote2, "quote(...)");
            sb2.append(strQuote2);
        }
    }

    /* renamed from: g */
    public static void m9237g(Bundle bundle, String key, String str, C4408h c4408h) {
        if (c4408h == null) {
            fg.m10659e(key, str, bundle);
            return;
        }
        k0 k0Var = c4408h.f22040a;
        AbstractC4154l.m8923f(key, "key");
        k0Var.mo9207e(bundle, key, k0Var.mo9206d(str));
    }

    /* renamed from: h */
    public static String m9238h(String str) {
        return (AbstractC5178p.m10116x(str, "\\Q", false) && AbstractC5178p.m10116x(str, "\\E", false)) ? AbstractC5185w.m10136r(str, ".*", "\\E.*\\Q") : AbstractC5178p.m10116x(str, "\\.\\*", false) ? AbstractC5185w.m10136r(str, "\\.\\*", ".*") : str;
    }

    /* renamed from: b */
    public final int m9239b(Uri uri) {
        String str;
        if (uri == null || (str = this.f22109a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(str);
        AbstractC4154l.m8922e(uri2, "parse(...)");
        List<String> other = uri2.getPathSegments();
        AbstractC4154l.m8923f(pathSegments, "<this>");
        AbstractC4154l.m8923f(other, "other");
        Set setF0 = AbstractC6663m.f0(pathSegments);
        setF0.retainAll(other);
        return setF0.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qw.g] */
    /* renamed from: c */
    public final ArrayList m9240c() {
        Collection collectionValues = ((Map) this.f22116h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC6663m.m12765x(arrayList, ((C4418r) it.next()).f22102b);
        }
        return AbstractC6663m.m12754R(AbstractC6663m.m12754R(this.f22112d, arrayList), (List) this.f22119k.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, qw.g] */
    /* renamed from: d */
    public final Bundle m9241d(Uri deepLink, LinkedHashMap arguments) {
        C5174l c5174lM10086b;
        C5174l c5174lM10086b2;
        String strDecode;
        AbstractC4154l.m8923f(deepLink, "deepLink");
        AbstractC4154l.m8923f(arguments, "arguments");
        C5176n c5176n = (C5176n) this.f22114f.getValue();
        if (c5176n != null && (c5174lM10086b = c5176n.m10086b(deepLink.toString())) != null) {
            int i10 = 0;
            Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
            if (m9242e(c5174lM10086b, bundleM11799a, arguments) && (!((Boolean) this.f22115g.getValue()).booleanValue() || m9243f(deepLink, bundleM11799a, arguments))) {
                String fragment = deepLink.getFragment();
                C5176n c5176n2 = (C5176n) this.f22121m.getValue();
                if (c5176n2 != null && (c5174lM10086b2 = c5176n2.m10086b(String.valueOf(fragment))) != null) {
                    List list = (List) this.f22119k.getValue();
                    ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            pe.m10842q();
                            throw null;
                        }
                        String str = (String) obj;
                        C5171i c5171iM10081h = c5174lM10086b2.f25282c.m10081h(i11);
                        if (c5171iM10081h != null) {
                            strDecode = Uri.decode(c5171iM10081h.f25274a);
                            AbstractC4154l.m8922e(strDecode, "decode(...)");
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            m9237g(bundleM11799a, str, strDecode, (C4408h) arguments.get(str));
                            arrayList.add(qw.a0.f30746a);
                            i10 = i11;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (AbstractC7582g.m14314a(arguments, new C4416p(0, bundleM11799a)).isEmpty()) {
                    return bundleM11799a;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m9242e(C5174l c5174l, Bundle bundle, Map map) {
        ArrayList arrayList = this.f22112d;
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i12 = i10 + 1;
            String strDecode = null;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            String str = (String) obj;
            C5171i c5171iM10081h = c5174l.f25282c.m10081h(i12);
            if (c5171iM10081h != null) {
                strDecode = Uri.decode(c5171iM10081h.f25274a);
                AbstractC4154l.m8922e(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                m9237g(bundle, str, strDecode, (C4408h) map.get(str));
                arrayList2.add(qw.a0.f30746a);
                i10 = i12;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4419s)) {
            C4419s c4419s = (C4419s) obj;
            if (AbstractC4154l.m8918a(this.f22109a, c4419s.f22109a) && AbstractC4154l.m8918a(this.f22110b, c4419s.f22110b) && AbstractC4154l.m8918a(this.f22111c, c4419s.f22111c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qw.g] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9243f(android.net.Uri r20, android.os.Bundle r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.C4419s.m9243f(android.net.Uri, android.os.Bundle, java.util.Map):boolean");
    }

    public final int hashCode() {
        String str = this.f22109a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22110b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22111c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
