package pg;

import a2.AbstractC0030c;
import iz.C3393z;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.C5171i;
import nx.C5172j;
import nx.C5173k;
import nx.C5174l;
import x4.AbstractC8298h;
import x4.C8294d;
import x4.C8297g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h7 {
    /* renamed from: d */
    public static C3393z m11676d(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        C5174l c5174lM10085a = C3393z.f18000e.m10085a(0, str);
        if (c5174lM10085a == null) {
            throw new IllegalArgumentException(p020v.a1.m14328h('\"', "No subtype found for: \"", str));
        }
        String str2 = (String) ((C5172j) c5174lM10085a.m10082a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) ((C5172j) c5174lM10085a.m10082a()).get(2)).toLowerCase(locale);
        AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int i10 = c5174lM10085a.m10083b().f21647b;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= str.length()) {
                return new C3393z(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            C5174l c5174lM10085a2 = C3393z.f18001f.m10085a(i11, str);
            if (c5174lM10085a2 == null) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i11);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                throw new IllegalArgumentException(AbstractC0030c.m123n(sb2, str, '\"').toString());
            }
            C5173k c5173k = c5174lM10085a2.f25282c;
            C5171i c5171iM10081h = c5173k.m10081h(1);
            String str3 = c5171iM10081h != null ? c5171iM10081h.f25274a : null;
            if (str3 == null) {
                i10 = c5174lM10085a2.m10083b().f21647b;
            } else {
                C5171i c5171iM10081h2 = c5173k.m10081h(2);
                String strSubstring2 = c5171iM10081h2 != null ? c5171iM10081h2.f25274a : null;
                if (strSubstring2 == null) {
                    C5171i c5171iM10081h3 = c5173k.m10081h(3);
                    AbstractC4154l.m8920c(c5171iM10081h3);
                    strSubstring2 = c5171iM10081h3.f25274a;
                } else if (AbstractC5178p.m10113X(strSubstring2, '\'') && AbstractC5178p.m10093D(strSubstring2, '\'') && strSubstring2.length() > 2) {
                    strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(strSubstring2);
                i10 = c5174lM10085a2.m10083b().f21647b;
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo11677a(AbstractC8298h abstractC8298h, C8294d c8294d, C8294d c8294d2);

    /* renamed from: b */
    public abstract boolean mo11678b(AbstractC8298h abstractC8298h, Object obj, Object obj2);

    /* renamed from: c */
    public abstract boolean mo11679c(AbstractC8298h abstractC8298h, C8297g c8297g, C8297g c8297g2);

    /* renamed from: e */
    public abstract void mo11680e(C8297g c8297g, C8297g c8297g2);

    /* renamed from: f */
    public abstract void mo11681f(C8297g c8297g, Thread thread);
}
