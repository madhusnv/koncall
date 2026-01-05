package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class c26 {
    /* renamed from: a */
    public static y16 m20090a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        y16 y16Var = (y16) list.get(0);
        Integer numValueOf = Integer.valueOf(y16Var.m57103b());
        Integer numValueOf2 = Integer.valueOf(y16Var.m57102a());
        for (int i = 1; i < list.size(); i++) {
            y16 y16Var2 = (y16) list.get(i);
            numValueOf = m20092c(numValueOf, Integer.valueOf(y16Var2.m57103b()));
            numValueOf2 = m20091b(numValueOf2, Integer.valueOf(y16Var2.m57102a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new y16(numValueOf.intValue(), numValueOf2.intValue());
    }

    /* renamed from: b */
    public static Integer m20091b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    /* renamed from: c */
    public static Integer m20092c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0)) {
            return num;
        }
        if (num.equals(2) && !num2.equals(1)) {
            return num2;
        }
        if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
            return null;
        }
        return num;
    }

    /* renamed from: d */
    public static y16 m20093d(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((c9i) it.next()).m35425E());
        }
        return m20090a(arrayList);
    }
}
