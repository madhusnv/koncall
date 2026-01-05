package p001o;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.np0;

/* loaded from: classes2.dex */
public class qeg {

    /* renamed from: a */
    public final u92 f41805a;

    /* renamed from: b */
    public final int f41806b;

    /* renamed from: c */
    public final int f41807c;

    /* renamed from: d */
    public final Rational f41808d;

    /* renamed from: e */
    public final reg f41809e;

    public qeg(u92 u92Var, Size size) {
        this.f41805a = u92Var;
        this.f41806b = u92Var.mo38379a();
        this.f41807c = u92Var.mo38382d();
        Rational rationalM45339h = size != null ? m45339h(size) : m45340i(u92Var);
        this.f41808d = rationalM45339h;
        this.f41809e = new reg(u92Var, rationalM45339h);
    }

    /* renamed from: a */
    public static LinkedHashMap m45325a(List list, mp0 mp0Var, Rational rational) {
        return m45326b(m45333o(list), mp0Var, rational);
    }

    /* renamed from: b */
    public static LinkedHashMap m45326b(Map map, mp0 mp0Var, Rational rational) {
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        Rational rationalM45332n = m45332n(mp0Var.m39469b(), z);
        if (mp0Var.m39468a() == 0) {
            Rational rationalM45332n2 = m45332n(mp0Var.m39469b(), z);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational2 = (Rational) it.next();
                if (!rational2.equals(rationalM45332n2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new np0.C15625a(rationalM45332n, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, (List) map.get(rational3));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public static void m45327d(LinkedHashMap linkedHashMap, Size size) {
        int iM39726b = mvf.m39726b(size);
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = (List) linkedHashMap.get((Rational) it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (mvf.m39726b(size2) <= iM39726b) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    /* renamed from: e */
    public static List m45328e(List list, lne lneVar, int i, int i2, int i3) {
        if (lneVar == null) {
            return list;
        }
        List listM37533a = lneVar.m37533a(new ArrayList(list), ha2.m30028a(ha2.m30029b(i), i2, i3 == 1));
        if (list.containsAll(listM37533a)) {
            return listM37533a;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    /* renamed from: f */
    public static void m45329f(LinkedHashMap linkedHashMap, one oneVar) {
        if (oneVar == null) {
            return;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            m45330g((List) linkedHashMap.get((Rational) it.next()), oneVar);
        }
    }

    /* renamed from: g */
    public static void m45330g(List list, one oneVar) {
        if (list.isEmpty()) {
            return;
        }
        Integer numValueOf = Integer.valueOf(oneVar.m42465b());
        if (oneVar.equals(one.f38634c)) {
            return;
        }
        Size sizeM42464a = oneVar.m42464a();
        int iIntValue = numValueOf.intValue();
        if (iIntValue == 0) {
            m45337s(list, sizeM42464a);
            return;
        }
        if (iIntValue == 1) {
            m45335q(list, sizeM42464a, true);
            return;
        }
        if (iIntValue == 2) {
            m45335q(list, sizeM42464a, false);
        } else if (iIntValue == 3) {
            m45336r(list, sizeM42464a, true);
        } else {
            if (iIntValue != 4) {
                return;
            }
            m45336r(list, sizeM42464a, false);
        }
    }

    /* renamed from: k */
    public static List m45331k(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(np0.f37119a);
        arrayList.add(np0.f37121c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    if (np0.m40886a(size, (Rational) it2.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    arrayList.add(rational);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static Rational m45332n(int i, boolean z) {
        if (i != -1) {
            if (i == 0) {
                return z ? np0.f37119a : np0.f37120b;
            }
            if (i == 1) {
                return z ? np0.f37121c : np0.f37122d;
            }
            wja.m54629c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        }
        return null;
    }

    /* renamed from: o */
    public static Map m45333o(List list) {
        HashMap map = new HashMap();
        Iterator it = m45331k(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (np0.m40886a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    /* renamed from: p */
    public static List m45334p(mne mneVar, List list, Size size, int i, Rational rational, int i2, int i3) {
        LinkedHashMap linkedHashMapM45325a = m45325a(list, mneVar.m39397b(), rational);
        if (size != null) {
            m45327d(linkedHashMapM45325a, size);
        }
        m45329f(linkedHashMapM45325a, mneVar.m39399d());
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMapM45325a.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : (List) it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        mneVar.m39398c();
        return m45328e(arrayList, null, i, i2, i3);
    }

    /* renamed from: q */
    public static void m45335q(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* renamed from: r */
    public static void m45336r(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* renamed from: s */
    public static void m45337s(List list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    /* renamed from: c */
    public final List m45338c(List list, mne mneVar, int i) {
        if (mneVar.m39396a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f41805a.mo38383e(i));
        Collections.sort(arrayList, new nk3(true));
        return arrayList;
    }

    /* renamed from: h */
    public final Rational m45339h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: i */
    public final Rational m45340i(u92 u92Var) {
        List listMo38385g = u92Var.mo38385g(256);
        if (listMo38385g.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listMo38385g, new nk3());
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: j */
    public final List m45341j(List list, int i) {
        List listM45342l = m45342l(list, i);
        if (listM45342l == null) {
            listM45342l = this.f41805a.mo38385g(i);
        }
        ArrayList arrayList = new ArrayList(listM45342l);
        Collections.sort(arrayList, new nk3(true));
        if (arrayList.isEmpty()) {
            wja.m54638l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i + ".");
        }
        return arrayList;
    }

    /* renamed from: l */
    public final List m45342l(List list, int i) {
        Size[] sizeArr;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).intValue() == i) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    /* renamed from: m */
    public List m45343m(c9i c9iVar) {
        qd8 qd8Var = (qd8) c9iVar;
        List listM45155F = qd8Var.m45155F(null);
        if (listM45155F != null) {
            return listM45155F;
        }
        mne mneVarM45156G = qd8Var.m45156G(null);
        List listM45341j = m45341j(qd8Var.m45161k(null), c9iVar.mo19021n());
        if (mneVarM45156G == null) {
            return this.f41809e.m46628f(listM45341j, c9iVar);
        }
        Size sizeM45160i = ((qd8) c9iVar).m45160i(null);
        int iM45154D = qd8Var.m45154D(0);
        if (!c9iVar.m20534T(false)) {
            listM45341j = m45338c(listM45341j, mneVarM45156G, c9iVar.mo19021n());
        }
        return m45334p(qd8Var.m45162m(), listM45341j, sizeM45160i, iM45154D, this.f41808d, this.f41806b, this.f41807c);
    }
}
