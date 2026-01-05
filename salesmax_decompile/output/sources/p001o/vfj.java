package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.wx7;

/* loaded from: classes6.dex */
public abstract class vfj {
    /* renamed from: a */
    public static final String m52708a(char c) {
        String string = Integer.toString(c, ph2.m43651a(16));
        sq8.m48648g(string, "toString(...)");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    /* renamed from: b */
    public static final wx7.C17997a m52709b(wx7.C17997a c17997a, String str, String str2) {
        sq8.m48649h(c17997a, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        m52726s(str);
        m52727t(str2, str);
        m52711d(c17997a, str, str2);
        return c17997a;
    }

    /* renamed from: c */
    public static final wx7.C17997a m52710c(wx7.C17997a c17997a, wx7 wx7Var) {
        sq8.m48649h(c17997a, "<this>");
        sq8.m48649h(wx7Var, "headers");
        int size = wx7Var.size();
        for (int i = 0; i < size; i++) {
            m52711d(c17997a, wx7Var.m55329j(i), wx7Var.m55333w(i));
        }
        return c17997a;
    }

    /* renamed from: d */
    public static final wx7.C17997a m52711d(wx7.C17997a c17997a, String str, String str2) {
        sq8.m48649h(c17997a, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        c17997a.m55341g().add(str);
        c17997a.m55341g().add(f9g.Z0(str2).toString());
        return c17997a;
    }

    /* renamed from: e */
    public static final wx7 m52712e(wx7.C17997a c17997a) {
        sq8.m48649h(c17997a, "<this>");
        return new wx7((String[]) c17997a.m55341g().toArray(new String[0]));
    }

    /* renamed from: f */
    public static final boolean m52713f(wx7 wx7Var, Object obj) {
        sq8.m48649h(wx7Var, "<this>");
        return (obj instanceof wx7) && Arrays.equals(wx7Var.m55328e(), ((wx7) obj).m55328e());
    }

    /* renamed from: g */
    public static final int m52714g(wx7 wx7Var) {
        sq8.m48649h(wx7Var, "<this>");
        return Arrays.hashCode(wx7Var.m55328e());
    }

    /* renamed from: h */
    public static final String m52715h(String[] strArr, String str) {
        sq8.m48649h(strArr, "namesAndValues");
        sq8.m48649h(str, "name");
        int length = strArr.length - 2;
        int iM21478c = cnd.m21478c(length, 0, -2);
        if (iM21478c > length) {
            return null;
        }
        while (!e9g.m24606x(str, strArr[length], true)) {
            if (length == iM21478c) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* renamed from: i */
    public static final wx7 m52716i(String... strArr) {
        sq8.m48649h(strArr, "inputNamesAndValues");
        int i = 0;
        if (!(strArr.length % 2 == 0)) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!(strArr2[i2] != null)) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            strArr2[i2] = f9g.Z0(strArr[i2]).toString();
        }
        int iM21478c = cnd.m21478c(0, strArr2.length - 1, 2);
        if (iM21478c >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                m52726s(str);
                m52727t(str2, str);
                if (i == iM21478c) {
                    break;
                }
                i += 2;
            }
        }
        return new wx7(strArr2);
    }

    /* renamed from: j */
    public static final Iterator m52717j(wx7 wx7Var) {
        sq8.m48649h(wx7Var, "<this>");
        int size = wx7Var.size();
        hwc[] hwcVarArr = new hwc[size];
        for (int i = 0; i < size; i++) {
            hwcVarArr[i] = vyh.m53620a(wx7Var.m55329j(i), wx7Var.m55333w(i));
        }
        return qo0.m45707a(hwcVarArr);
    }

    /* renamed from: k */
    public static final String m52718k(wx7 wx7Var, int i) {
        sq8.m48649h(wx7Var, "<this>");
        String str = (String) gp0.f0(wx7Var.m55328e(), i * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    /* renamed from: l */
    public static final wx7.C17997a m52719l(wx7 wx7Var) {
        sq8.m48649h(wx7Var, "<this>");
        wx7.C17997a c17997a = new wx7.C17997a();
        hh3.m30442B(c17997a.m55341g(), wx7Var.m55328e());
        return c17997a;
    }

    /* renamed from: m */
    public static final wx7.C17997a m52720m(wx7.C17997a c17997a, String str) {
        sq8.m48649h(c17997a, "<this>");
        sq8.m48649h(str, "name");
        int i = 0;
        while (i < c17997a.m55341g().size()) {
            if (e9g.m24606x(str, (String) c17997a.m55341g().get(i), true)) {
                c17997a.m55341g().remove(i);
                c17997a.m55341g().remove(i);
                i -= 2;
            }
            i += 2;
        }
        return c17997a;
    }

    /* renamed from: n */
    public static final wx7.C17997a m52721n(wx7.C17997a c17997a, String str, String str2) {
        sq8.m48649h(c17997a, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        m52726s(str);
        m52727t(str2, str);
        c17997a.m55342h(str);
        m52711d(c17997a, str, str2);
        return c17997a;
    }

    /* renamed from: o */
    public static final wx7 m52722o(Map map) {
        sq8.m48649h(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = f9g.Z0(str).toString();
            String string2 = f9g.Z0(str2).toString();
            m52726s(string);
            m52727t(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        return new wx7(strArr);
    }

    /* renamed from: p */
    public static final String m52723p(wx7 wx7Var) {
        sq8.m48649h(wx7Var, "<this>");
        StringBuilder sb = new StringBuilder();
        int size = wx7Var.size();
        for (int i = 0; i < size; i++) {
            String strM55329j = wx7Var.m55329j(i);
            String strM55333w = wx7Var.m55333w(i);
            sb.append(strM55329j);
            sb.append(": ");
            if (ggj.m28645y(strM55329j)) {
                strM55333w = "██";
            }
            sb.append(strM55333w);
            sb.append("\n");
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: q */
    public static final String m52724q(wx7 wx7Var, int i) {
        sq8.m48649h(wx7Var, "<this>");
        String str = (String) gp0.f0(wx7Var.m55328e(), (i * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    /* renamed from: r */
    public static final List m52725r(wx7 wx7Var, String str) {
        sq8.m48649h(wx7Var, "<this>");
        sq8.m48649h(str, "name");
        int size = wx7Var.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (e9g.m24606x(str, wx7Var.m55329j(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(wx7Var.m55333w(i));
            }
        }
        List listQ0 = arrayList != null ? kh3.Q0(arrayList) : null;
        return listQ0 == null ? ch3.m21246k() : listQ0;
    }

    /* renamed from: s */
    public static final void m52726s(String str) {
        sq8.m48649h(str, "name");
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (!('!' <= cCharAt && cCharAt < 127)) {
                throw new IllegalArgumentException(("Unexpected char 0x" + m52708a(cCharAt) + " at " + i + " in header name: " + str).toString());
            }
        }
    }

    /* renamed from: t */
    public static final void m52727t(String str, String str2) {
        sq8.m48649h(str, "value");
        sq8.m48649h(str2, "name");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            boolean z = true;
            if (cCharAt != '\t') {
                if (!(' ' <= cCharAt && cCharAt < 127)) {
                    z = false;
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected char 0x");
                sb.append(m52708a(cCharAt));
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(ggj.m28645y(str2) ? "" : ": " + str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
