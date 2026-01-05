package p001o;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.np0;

/* loaded from: classes2.dex */
public class reg {

    /* renamed from: a */
    public final int f43457a;

    /* renamed from: b */
    public final int f43458b;

    /* renamed from: c */
    public final Rational f43459c;

    /* renamed from: d */
    public final boolean f43460d;

    public reg(u92 u92Var, Rational rational) {
        this.f43457a = u92Var.mo38379a();
        this.f43458b = u92Var.mo38382d();
        this.f43459c = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.f43460d = z;
    }

    /* renamed from: a */
    public static Size m46623a(Size size, int i, int i2, int i3) {
        return (size == null || !m46625e(i, i2, i3)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: b */
    public static Rational m46624b(Size size, List list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : qeg.m45331k(list)) {
            if (np0.m40886a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: e */
    public static boolean m46625e(int i, int i2, int i3) {
        int iM30028a = ha2.m30028a(ha2.m30029b(i), i3, 1 == i2);
        return iM30028a == 90 || iM30028a == 270;
    }

    /* renamed from: c */
    public final Rational m46626c(qd8 qd8Var, List list) {
        if (qd8Var.m45164w()) {
            return qeg.m45332n(qd8Var.m45165y(), this.f43460d);
        }
        Size sizeM46627d = m46627d(qd8Var);
        if (sizeM46627d != null) {
            return m46624b(sizeM46627d, list);
        }
        return null;
    }

    /* renamed from: d */
    public final Size m46627d(qd8 qd8Var) {
        return m46623a(qd8Var.m45158L(null), qd8Var.m45154D(0), this.f43458b, this.f43457a);
    }

    /* renamed from: f */
    public List m46628f(List list, c9i c9iVar) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new nk3(true));
        ArrayList arrayList2 = new ArrayList();
        qd8 qd8Var = (qd8) c9iVar;
        Size sizeM45160i = qd8Var.m45160i(null);
        Size size = (Size) arrayList.get(0);
        if (sizeM45160i == null || mvf.m39726b(size) < mvf.m39726b(sizeM45160i)) {
            sizeM45160i = size;
        }
        Size sizeM46627d = m46627d(qd8Var);
        Size size2 = mvf.f36040c;
        int iM39726b = mvf.m39726b(size2);
        if (mvf.m39726b(sizeM45160i) < iM39726b) {
            size2 = mvf.f36038a;
        } else if (sizeM46627d != null && mvf.m39726b(sizeM46627d) < iM39726b) {
            size2 = sizeM46627d;
        }
        for (Size size3 : arrayList) {
            if (mvf.m39726b(size3) <= mvf.m39726b(sizeM45160i) && mvf.m39726b(size3) >= mvf.m39726b(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeM45160i + "\ninitial size list: " + arrayList);
        }
        Rational rationalM46626c = m46626c(qd8Var, arrayList2);
        if (sizeM46627d == null) {
            sizeM46627d = qd8Var.m45157H(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalM46626c == null) {
            arrayList3.addAll(arrayList2);
            if (sizeM46627d != null) {
                qeg.m45335q(arrayList3, sizeM46627d, true);
            }
        } else {
            Map mapM45333o = qeg.m45333o(arrayList2);
            if (sizeM46627d != null) {
                Iterator it = mapM45333o.keySet().iterator();
                while (it.hasNext()) {
                    qeg.m45335q((List) mapM45333o.get((Rational) it.next()), sizeM46627d, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapM45333o.keySet());
            Collections.sort(arrayList4, new np0.C15625a(rationalM46626c, this.f43459c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : (List) mapM45333o.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
