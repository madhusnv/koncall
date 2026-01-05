package p001o;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class pne {

    /* renamed from: h */
    public static final double f40302h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a */
    public final Size f40303a;

    /* renamed from: b */
    public final Rational f40304b;

    /* renamed from: c */
    public final Rational f40305c;

    /* renamed from: d */
    public final Set f40306d;

    /* renamed from: e */
    public final qeg f40307e;

    /* renamed from: f */
    public final u92 f40308f;

    /* renamed from: g */
    public final Map f40309g;

    /* renamed from: o.pne$a */
    public static class C16144a implements Comparator {

        /* renamed from: a */
        public final Rational f40310a;

        /* renamed from: b */
        public final boolean f40311b;

        public C16144a(Rational rational, boolean z) {
            this.f40310a = rational;
            this.f40311b = z;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float fM43918c = pne.m43918c(rational, this.f40310a);
            float fM43918c2 = pne.m43918c(rational2, this.f40310a);
            return this.f40311b ? Float.compare(fM43918c2, fM43918c) : Float.compare(fM43918c, fM43918c2);
        }
    }

    public pne(v92 v92Var, Set set) {
        this(wuh.m55044m(v92Var.mo26115c().mo37112d()), v92Var.mo26122j(), set);
    }

    /* renamed from: A */
    public static boolean m43911A(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m43929y((Size) it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public static List m43912E(List list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    /* renamed from: F */
    public static Rect m43913F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    /* renamed from: L */
    public static void m43914L(List list) {
        Collections.sort(list, new nk3(true));
    }

    /* renamed from: M */
    public static Rational m43915M(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: N */
    public static Rational m43916N(Size size) {
        Rational rational = np0.f37119a;
        if (np0.m40886a(size, rational)) {
            return rational;
        }
        Rational rational2 = np0.f37121c;
        return np0.m40886a(size, rational2) ? rational2 : m43915M(size);
    }

    /* renamed from: c */
    public static float m43918c(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    /* renamed from: e */
    public static List m43919e(List list) {
        Rational rationalM43915M;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = map.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rationalM43915M = null;
                    break;
                }
                rationalM43915M = (Rational) it2.next();
                if (np0.m40886a(size, rationalM43915M)) {
                    break;
                }
            }
            if (rationalM43915M != null) {
                Size size2 = (Size) map.get(rationalM43915M);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalM43915M = m43915M(size);
            }
            arrayList.add(size);
            map.put(rationalM43915M, size);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static List m43920f(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (m43911A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List m43921g(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (np0.m40886a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static Rational m43922h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f40302h ? np0.f37121c : np0.f37119a;
    }

    /* renamed from: k */
    public static Rect m43923k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalM43915M = m43915M(size);
        if (rational.floatValue() == rationalM43915M.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalM43915M.floatValue()) {
                float f = width;
                float fFloatValue = f / rational.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rational.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    /* renamed from: m */
    public static Rect m43924m(Size size, Size size2) {
        return m43923k(m43915M(size2), size);
    }

    /* renamed from: n */
    public static Rational m43925n(Rational rational) {
        Rational rational2 = np0.f37119a;
        if (rational.equals(rational2)) {
            return np0.f37121c;
        }
        if (rational.equals(np0.f37121c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    /* renamed from: p */
    public static List m43926p(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listM43912E = m43912E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listM43912E) {
            if (m43930z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    /* renamed from: u */
    public static Rational m43927u(Size size) {
        Rational rationalM43922h = m43922h(size);
        wja.m54627a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalM43922h + ".");
        return rationalM43922h;
    }

    /* renamed from: w */
    public static List m43928w(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    /* renamed from: y */
    public static boolean m43929y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    /* renamed from: z */
    public static boolean m43930z(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m43929y((Size) it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public final boolean m43931B(Rational rational, Size size) {
        if (this.f40304b.equals(rational) || np0.m40886a(size, rational)) {
            return false;
        }
        return m43939b(this.f40304b.floatValue(), rational.floatValue(), m43916N(size).floatValue());
    }

    /* renamed from: C */
    public final boolean m43932C(Size size, Size size2) {
        return m43931B(m43916N(size), size2);
    }

    /* renamed from: D */
    public final boolean m43933D() {
        Iterator it = m43943l().iterator();
        while (it.hasNext()) {
            if (!np0.m40886a((Size) it.next(), this.f40305c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public final List m43934G(List list, boolean z) {
        Map mapM43950x = m43950x(list);
        ArrayList<Rational> arrayList = new ArrayList(mapM43950x.keySet());
        m43938K(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(np0.f37121c) && !rational.equals(np0.f37119a)) {
                List list2 = (List) mapM43950x.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(m43936I(rational, list2, z));
            }
        }
        return arrayList2;
    }

    /* renamed from: H */
    public final List m43935H(List list) {
        ArrayList arrayList = new ArrayList();
        if (m43933D()) {
            arrayList.addAll(m43936I(this.f40304b, list, false));
        }
        arrayList.addAll(m43936I(this.f40305c, list, false));
        arrayList.addAll(m43934G(list, false));
        if (arrayList.isEmpty()) {
            wja.m54638l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(m43934G(list, true));
        }
        wja.m54627a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    /* renamed from: I */
    public final List m43936I(Rational rational, List list, boolean z) {
        List<Size> listM43921g = m43921g(rational, list);
        m43914L(listM43921g);
        HashSet hashSet = new HashSet(listM43921g);
        Iterator it = this.f40306d.iterator();
        while (it.hasNext()) {
            List listM43949v = m43949v((c9i) it.next());
            if (!z) {
                listM43949v = m43940d(rational, listM43949v);
            }
            if (listM43949v.isEmpty()) {
                return new ArrayList();
            }
            listM43921g = m43920f(listM43949v, listM43921g);
            hashSet.retainAll(m43926p(listM43949v, listM43921g));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listM43921g) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    public final boolean m43937J() {
        boolean z;
        mne mneVarM45156G;
        Iterator it = this.f40306d.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            c9i c9iVar = (c9i) it.next();
            if (!c9iVar.m20534T(false) && (c9iVar instanceof qd8) && (mneVarM45156G = ((qd8) c9iVar).m45156G(null)) != null) {
                z = true;
                if (mneVarM45156G.m39396a() == 1) {
                    break;
                }
            }
        }
        return z;
    }

    /* renamed from: K */
    public final void m43938K(List list) {
        Collections.sort(list, new C16144a(m43915M(this.f40303a), true));
    }

    /* renamed from: b */
    public final boolean m43939b(float f, float f2, float f3) {
        if (f == f2 || f2 == f3) {
            return false;
        }
        return f > f2 ? f2 < f3 : f2 > f3;
    }

    /* renamed from: d */
    public final List m43940d(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!m43931B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final List m43941i() {
        return this.f40308f.mo38383e(34);
    }

    /* renamed from: j */
    public final List m43942j() {
        return this.f40308f.mo38385g(34);
    }

    /* renamed from: l */
    public final Set m43943l() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f40306d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(m43949v((c9i) it.next()));
        }
        return hashSet;
    }

    /* renamed from: o */
    public List m43944o(vob vobVar) {
        List listM43942j = m43942j();
        if (m43937J()) {
            ArrayList arrayList = new ArrayList(listM43942j);
            arrayList.addAll(m43941i());
            listM43942j = arrayList;
        }
        List list = (List) vobVar.mo36958d(qd8.f41691q, null);
        if (list != null) {
            listM43942j = m43928w(list);
        }
        return m43935H(listM43942j);
    }

    /* renamed from: q */
    public Size m43945q(Size size, c9i c9iVar) {
        List<Size> listM43949v = m43949v(c9iVar);
        for (Size size2 : listM43949v) {
            if (!m43932C(size, size2) && !m43929y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listM43949v) {
            if (!m43929y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    /* renamed from: r */
    public Size m43946r(Size size, c9i c9iVar) {
        Iterator it = m43949v(c9iVar).iterator();
        while (it.hasNext()) {
            Size sizeM55044m = wuh.m55044m(m43924m((Size) it.next(), size));
            if (!m43929y(sizeM55044m, size)) {
                return sizeM55044m;
            }
        }
        return size;
    }

    /* renamed from: s */
    public Pair m43947s(c9i c9iVar, Rect rect, int i, boolean z) {
        boolean z2;
        if (wuh.m55040i(i)) {
            rect = m43913F(rect);
            z2 = true;
        } else {
            z2 = false;
        }
        Pair pairM43948t = m43948t(rect, c9iVar, z);
        Rect rectM43913F = (Rect) pairM43948t.first;
        Size sizeM55045n = (Size) pairM43948t.second;
        if (z2) {
            sizeM55045n = wuh.m55045n(sizeM55045n);
            rectM43913F = m43913F(rectM43913F);
        }
        return new Pair(rectM43913F, sizeM55045n);
    }

    /* renamed from: t */
    public final Pair m43948t(Rect rect, c9i c9iVar, boolean z) {
        Size sizeM43945q;
        if (z) {
            sizeM43945q = m43946r(wuh.m55044m(rect), c9iVar);
        } else {
            Size sizeM55044m = wuh.m55044m(rect);
            sizeM43945q = m43945q(sizeM55044m, c9iVar);
            rect = m43924m(sizeM55044m, sizeM43945q);
        }
        return new Pair(rect, sizeM43945q);
    }

    /* renamed from: v */
    public final List m43949v(c9i c9iVar) {
        if (!this.f40306d.contains(c9iVar)) {
            throw new IllegalArgumentException("Invalid child config: " + c9iVar);
        }
        if (this.f40309g.containsKey(c9iVar)) {
            List list = (List) this.f40309g.get(c9iVar);
            Objects.requireNonNull(list);
            return list;
        }
        List listM43919e = m43919e(this.f40307e.m45343m(c9iVar));
        this.f40309g.put(c9iVar, listM43919e);
        return listM43919e;
    }

    /* renamed from: x */
    public final Map m43950x(List list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = np0.f37119a;
        map.put(rational, new ArrayList());
        Rational rational2 = np0.f37121c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (np0.m40886a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalM43915M = m43915M(size);
                    arrayList2.add(rationalM43915M);
                    map.put(rationalM43915M, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    public pne(Size size, u92 u92Var, Set set) {
        this(size, u92Var, set, new qeg(u92Var, size));
    }

    public pne(Size size, u92 u92Var, Set set, qeg qegVar) {
        this.f40309g = new HashMap();
        this.f40303a = size;
        Rational rationalM43927u = m43927u(size);
        this.f40304b = rationalM43927u;
        this.f40305c = m43925n(rationalM43927u);
        this.f40308f = u92Var;
        this.f40306d = set;
        this.f40307e = qegVar;
    }
}
