package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class aih {
    /* renamed from: a */
    public static final List m17191a(String str) {
        List listD0 = f9g.D0(str, new String[]{"::"}, false, 0, 6, null);
        if (listD0.size() > 2) {
            return null;
        }
        if (listD0.size() == 1) {
            return f9g.D0((CharSequence) listD0.get(0), new String[]{":"}, false, 0, 6, null);
        }
        List listM21246k = sq8.m48644c(listD0.get(0), "") ? ch3.m21246k() : f9g.C0((CharSequence) listD0.get(0), new char[]{':'}, false, 0, 6, null);
        List listM21246k2 = sq8.m48644c(listD0.get(1), "") ? ch3.m21246k() : f9g.C0((CharSequence) listD0.get(1), new char[]{':'}, false, 0, 6, null);
        if (listM21246k.size() + listM21246k2.size() == 8) {
            return null;
        }
        String str2 = (String) kh3.s0(listM21246k2);
        int size = ((str2 != null && f9g.m26305O(str2, '.', false, 2, null) ? 7 : 8) - listM21246k.size()) - listM21246k2.size();
        List listM18961c = bh3.m18961c();
        listM18961c.addAll(listM21246k);
        for (int i = 0; i < size; i++) {
            listM18961c.add("0");
        }
        listM18961c.addAll(listM21246k2);
        return bh3.m18959a(listM18961c);
    }

    /* renamed from: b */
    public static final boolean m17192b(char c) {
        if ('0' <= c && c < ':') {
            return true;
        }
        if ('a' <= c && c < 'g') {
            return true;
        }
        return 'A' <= c && c < 'G';
    }

    /* renamed from: c */
    public static final boolean m17193c(String str) {
        sq8.m48649h(str, "<this>");
        return m17198h(str) != null;
    }

    /* renamed from: d */
    public static final boolean m17194d(String str) {
        sq8.m48649h(str, "<this>");
        return m17199i(str) != null;
    }

    /* renamed from: e */
    public static final boolean m17195e(String str) {
        boolean z;
        int length = str.length();
        if (!(1 <= length && length < 5)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            }
            if (!m17192b(str.charAt(i))) {
                z = false;
                break;
            }
            i++;
        }
        return z;
    }

    /* renamed from: f */
    public static final boolean m17196f(String str) {
        sq8.m48649h(str, "<this>");
        return (str.length() > 0) && !f9g.m26305O(str, '%', false, 2, null);
    }

    /* renamed from: g */
    public static final boolean m17197g(String str) {
        boolean z;
        sq8.m48649h(str, "<this>");
        int length = str.length();
        if (!(1 <= length && length < 64) || !Character.isLetterOrDigit(str.charAt(0))) {
            return false;
        }
        String strE1 = h9g.e1(str, 1);
        int i = 0;
        while (true) {
            if (i >= strE1.length()) {
                z = true;
                break;
            }
            char cCharAt = strE1.charAt(i);
            if (!(Character.isLetterOrDigit(cCharAt) || cCharAt == '-')) {
                z = false;
                break;
            }
            i++;
        }
        return z;
    }

    /* renamed from: h */
    public static final xv8 m17198h(String str) {
        sq8.m48649h(str, "<this>");
        boolean z = true;
        List listC0 = f9g.C0(str, new char[]{'.'}, false, 0, 6, null);
        if (listC0.size() != 4) {
            return null;
        }
        if (listC0.isEmpty()) {
            z = false;
        } else {
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                Integer numM22638l = d9g.m22638l((String) it.next());
                int iIntValue = numM22638l != null ? numM22638l.intValue() : -1;
                if (!(iIntValue >= 0 && iIntValue < 256)) {
                    break;
                }
            }
            z = false;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList(dh3.m23088v(listC0, 10));
        Iterator it2 = listC0.iterator();
        while (it2.hasNext()) {
            arrayList.add(Byte.valueOf(m1i.m38186b((String) it2.next())));
        }
        return new xv8(kh3.L0(arrayList));
    }

    /* renamed from: i */
    public static final aw8 m17199i(String str) {
        xv8 xv8VarM17198h;
        sq8.m48649h(str, "<this>");
        List listC0 = f9g.C0(str, new char[]{'%'}, false, 0, 6, null);
        if (listC0.size() > 2) {
            return null;
        }
        if (listC0.size() == 2 && !m17196f((String) listC0.get(1))) {
            return null;
        }
        String str2 = listC0.size() == 2 ? (String) listC0.get(1) : null;
        List listM17191a = m17191a((String) listC0.get(0));
        if (listM17191a == null || listM17191a.size() < 7) {
            return null;
        }
        for (int i = 0; i < 6; i++) {
            if (!m17195e((String) listM17191a.get(i))) {
                return null;
            }
        }
        if (listM17191a.size() == 7) {
            List listSubList = listM17191a.subList(0, 6);
            ArrayList arrayList = new ArrayList(dh3.m23088v(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(d1i.m22245a(m1i.m38196l((String) it.next(), 16)));
            }
            if (sq8.m48644c(arrayList, ch3.m21249n(d1i.m22245a((short) 0), d1i.m22245a((short) 0), d1i.m22245a((short) 0), d1i.m22245a((short) 0), d1i.m22245a((short) 0), d1i.m22245a((short) -1))) && (xv8VarM17198h = m17198h((String) listM17191a.get(6))) != null) {
                return xv8VarM17198h.m56862g();
            }
            return null;
        }
        if (listM17191a.size() != 8 || !m17195e((String) listM17191a.get(6)) || !m17195e((String) listM17191a.get(7))) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(listM17191a, 10));
        Iterator it2 = listM17191a.iterator();
        while (it2.hasNext()) {
            arrayList2.add(d1i.m22245a(m1i.m38196l((String) it2.next(), 16)));
        }
        return new aw8(((d1i) arrayList2.get(0)).m22250h(), ((d1i) arrayList2.get(1)).m22250h(), ((d1i) arrayList2.get(2)).m22250h(), ((d1i) arrayList2.get(3)).m22250h(), ((d1i) arrayList2.get(4)).m22250h(), ((d1i) arrayList2.get(5)).m22250h(), ((d1i) arrayList2.get(6)).m22250h(), ((d1i) arrayList2.get(7)).m22250h(), str2, null);
    }
}
