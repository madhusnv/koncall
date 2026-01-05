package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class mm7 {
    /* renamed from: a */
    public static final boolean m39354a(String str, boolean z) {
        if (str == null || !lm7.m37466a(str, z)) {
            return false;
        }
        if (!z) {
            return m39355b(str);
        }
        List listC0 = f9g.C0(str, new char[]{'.'}, false, 0, 6, null);
        if (!(listC0 instanceof Collection) || !listC0.isEmpty()) {
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                if (!m39355b((String) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m39355b(String str) {
        boolean z;
        int length = str.length();
        if (3 <= length && length < 64) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    z = true;
                    break;
                }
                char cCharAt = str.charAt(i);
                if ('A' <= cCharAt && cCharAt < '[') {
                    z = false;
                    break;
                }
                i++;
            }
            if (z && !aih.m17193c(str) && !aih.m17194d(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final io0 m39356c(String str) {
        if (str == null) {
            return null;
        }
        List listC0 = f9g.C0(str, new char[]{':'}, false, 6, 2, null);
        if (!sq8.m48644c(listC0.get(0), "arn") || listC0.size() != 6) {
            return null;
        }
        if (((CharSequence) listC0.get(1)).length() == 0) {
            return null;
        }
        if (((CharSequence) listC0.get(2)).length() == 0) {
            return null;
        }
        if (((CharSequence) listC0.get(5)).length() == 0) {
            return null;
        }
        return new io0((String) listC0.get(1), (String) listC0.get(2), (String) listC0.get(3), (String) listC0.get(4), f9g.C0((CharSequence) listC0.get(5), new char[]{':', '/'}, false, 0, 6, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* renamed from: d */
    public static final wyc m39357d(List list, String str) {
        Object next;
        Object next2;
        vyc next3;
        sq8.m48649h(list, "partitions");
        if (str == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((vyc) next).m53618d().containsKey(str)) {
                break;
            }
        }
        vyc vycVar = (vyc) next;
        if (vycVar != null) {
            wyc wycVarM53615a = vycVar.m53615a();
            Object obj = vycVar.m53618d().get(str);
            sq8.m48646e(obj);
            return wycVarM53615a.m55426f((wyc) obj);
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((vyc) next2).m53617c().m38995g(str)) {
                break;
            }
        }
        vyc vycVar2 = (vyc) next2;
        if (vycVar2 == null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = 0;
                    break;
                }
                next3 = it3.next();
                if (sq8.m48644c(((vyc) next3).m53616b(), "aws")) {
                    break;
                }
            }
            vycVar2 = next3;
        }
        if (vycVar2 != null) {
            return vycVar2.m53615a();
        }
        return null;
    }
}
