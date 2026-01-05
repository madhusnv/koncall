package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class x8g extends w8g {

    /* renamed from: o.x8g$a */
    public static final class C18078a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18078a f53368a = new C18078a();

        public C18078a() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(String str) {
            sq8.m48649h(str, "line");
            return str;
        }
    }

    /* renamed from: o.x8g$b */
    public static final class C18079b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ String f53369a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18079b(String str) {
            super(1);
            this.f53369a = str;
        }

        @Override // p001o.xk7
        public final String invoke(String str) {
            sq8.m48649h(str, "line");
            return this.f53369a + str;
        }
    }

    /* renamed from: b */
    public static final xk7 m55846b(String str) {
        return str.length() == 0 ? C18078a.f53368a : new C18079b(str);
    }

    /* renamed from: c */
    public static final int m55847c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!ph2.m43653c(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: d */
    public static final String m55848d(String str, String str2) {
        String str3;
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "newIndent");
        List listK0 = f9g.k0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            if (!f9g.d0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m55847c((String) it.next())));
        }
        Integer num = (Integer) kh3.u0(arrayList2);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listK0.size());
        xk7 xk7VarM55846b = m55846b(str2);
        int iM21248m = ch3.m21248m(listK0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listK0) {
            int i2 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            String str4 = (String) obj2;
            if ((i == 0 || i == iM21248m) && f9g.d0(str4)) {
                str4 = null;
            } else {
                String strE1 = h9g.e1(str4, iIntValue);
                if (strE1 != null && (str3 = (String) xk7VarM55846b.invoke(strE1)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i = i2;
        }
        String string = ((StringBuilder) kh3.m0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: e */
    public static final String m55849e(String str, String str2, String str3) {
        int i;
        String str4;
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "newIndent");
        sq8.m48649h(str3, "marginPrefix");
        if (!(!f9g.d0(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listK0 = f9g.k0(str);
        int length = str.length() + (str2.length() * listK0.size());
        xk7 xk7VarM55846b = m55846b(str2);
        int iM21248m = ch3.m21248m(listK0);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : listK0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ch3.m21256u();
            }
            String str5 = (String) obj;
            String strSubstring = null;
            if ((i2 == 0 || i2 == iM21248m) && f9g.d0(str5)) {
                str5 = null;
            } else {
                int length2 = str5.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = -1;
                        break;
                    }
                    if (!ph2.m43653c(str5.charAt(i4))) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                if (i != -1) {
                    int i5 = i;
                    if (e9g.m24596J(str5, str3, i, false, 4, null)) {
                        int length3 = i5 + str3.length();
                        sq8.m48647f(str5, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str5.substring(length3);
                        sq8.m48648g(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str4 = (String) xk7VarM55846b.invoke(strSubstring)) != null) {
                    str5 = str4;
                }
            }
            if (str5 != null) {
                arrayList.add(str5);
            }
            i2 = i3;
        }
        String string = ((StringBuilder) kh3.m0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: f */
    public static final String m55850f(String str) {
        sq8.m48649h(str, "<this>");
        return m55848d(str, "");
    }

    /* renamed from: g */
    public static final String m55851g(String str, String str2) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "marginPrefix");
        return m55849e(str, "", str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m55852h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m55851g(str, str2);
    }
}
