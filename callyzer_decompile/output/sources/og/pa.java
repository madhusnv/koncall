package og;

import ad.C0108o;
import ad.C0109p;
import cc.C0945a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import sd.C6813g;
import zc.AbstractC8927d;
import zc.C8926c;
import zc.C8935l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class pa {
    /* renamed from: a */
    public static final boolean m10814a(String str, boolean z6) {
        if (str != null) {
            if (!z6) {
                return pg.ba.m11557e(str);
            }
            List listM10111V = AbstractC5178p.m10111V(str, new char[]{'.'}, 0, 6);
            if (!listM10111V.isEmpty()) {
                Iterator it = listM10111V.iterator();
                while (it.hasNext()) {
                    if (!pg.ba.m11557e((String) it.next())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final C0945a m10815b(String str) {
        if (str == null) {
            return null;
        }
        try {
            C0109p c0109pM297a = C0108o.m297a(C0109p.f374i, str);
            C8935l c8935l = c0109pM297a.f375a;
            int i10 = c0109pM297a.f377c;
            AbstractC8927d abstractC8927d = c0109pM297a.f376b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pg.y9.m11955b(abstractC8927d));
            if (i10 != c8935l.f42912b) {
                sb2.append(":" + i10);
            }
            String string = sb2.toString();
            String string2 = c0109pM297a.f378d.toString();
            String str2 = c8935l.f42911a;
            AbstractC4154l.m8923f(string2, "<this>");
            return new C0945a(str2, string, string2, AbstractC5185w.m10129k(string2, "/", false) ? string2 : string2.concat("/"), abstractC8927d instanceof C8926c);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static final String m10816c(String str, int i10, int i11, boolean z6) {
        if (str == null || i10 >= i11 || i11 > str.length()) {
            return null;
        }
        return z6 ? AbstractC5178p.m10114Y(str, pg.w9.m11919j(str.length() - i11, str.length() - i10)) : AbstractC5178p.m10114Y(str, pg.w9.m11919j(i10, i11));
    }

    /* renamed from: d */
    public static final String m10817d(String value) {
        AbstractC4154l.m8923f(value, "value");
        return C6813g.f32363m.m12988d(value);
    }

    /* renamed from: e */
    public static boolean m10818e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
