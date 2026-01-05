package nx;

import an.v1;
import android.os.Build;
import android.view.View;
import android.view.Window;
import c6.AbstractC0880j;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mx.AbstractC4913i;
import mx.C4914j;
import og.d2;
import og.pe;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.q */
/* loaded from: classes3.dex */
public abstract class AbstractC5179q {
    /* renamed from: a */
    public static void m10119a(StringBuilder sb2, Object obj, InterfaceC2139c interfaceC2139c) {
        if (interfaceC2139c != null) {
            sb2.append((CharSequence) interfaceC2139c.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    /* renamed from: b */
    public static String m10120b(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        return AbstractC4913i.m9810f(AbstractC4913i.m9811g(new C4914j(2, str), new v1("    ", 20)), "\n", null, null, 62);
    }

    /* renamed from: c */
    public static void m10121c(Window window, boolean z6) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            AbstractC0880j.m2425i(window, z6);
        } else {
            if (i10 >= 30) {
                AbstractC0880j.m2424h(window, z6);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: d */
    public static String m10122d(String str) {
        List listM10833h;
        Comparable comparable;
        AbstractC4154l.m8923f(str, "<this>");
        C5170h c5170h = new C5170h(str);
        if (c5170h.hasNext()) {
            Object next = c5170h.next();
            if (c5170h.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c5170h.hasNext()) {
                    arrayList.add(c5170h.next());
                }
                listM10833h = arrayList;
            } else {
                listM10833h = pe.m10833h(next);
            }
        } else {
            listM10833h = C6668r.f31943a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM10833h) {
            if (!AbstractC5178p.m10101L((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(arrayList2, 10));
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!d2.m10603f(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM10833h.size();
        int iM10832g = pe.m10832g(listM10833h);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listM10833h) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            String str3 = (String) obj3;
            String strM10090A = ((i10 == 0 || i10 == iM10832g) && AbstractC5178p.m10101L(str3)) ? null : AbstractC5178p.m10090A(iIntValue, str3);
            if (strM10090A != null) {
                arrayList4.add(strM10090A);
            }
            i10 = i12;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        AbstractC6663m.m12747K(arrayList4, sb2, "\n", null, 124);
        return sb2.toString();
    }

    /* renamed from: e */
    public static String m10123e(String str) {
        List listM10833h;
        AbstractC4154l.m8923f(str, "<this>");
        if (AbstractC5178p.m10101L("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        C5170h c5170h = new C5170h(str);
        if (c5170h.hasNext()) {
            Object next = c5170h.next();
            if (c5170h.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c5170h.hasNext()) {
                    arrayList.add(c5170h.next());
                }
                listM10833h = arrayList;
            } else {
                listM10833h = pe.m10833h(next);
            }
        } else {
            listM10833h = C6668r.f31943a;
        }
        int length = str.length();
        listM10833h.size();
        int iM10832g = pe.m10832g(listM10833h);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listM10833h.iterator();
        int i10 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                AbstractC6663m.m12747K(arrayList2, sb2, "\n", null, 124);
                return sb2.toString();
            }
            Object next2 = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            String str2 = (String) next2;
            if ((i10 != 0 && i10 != iM10832g) || !AbstractC5178p.m10101L(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!d2.m10603f(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && AbstractC5185w.m10137s(i12, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i10 = i11;
        }
    }
}
