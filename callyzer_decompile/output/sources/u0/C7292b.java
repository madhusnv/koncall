package u0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import com.skydoves.balloon.internals.DefinitionKt;
import gh.C2615d;
import i0.e0;
import i0.g0;
import i0.w2;
import j0.AbstractC3502b;
import j0.AbstractC3506f;
import j0.C3503c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import l4.C4367l;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u0.b */
/* loaded from: classes.dex */
public final class C7292b {

    /* renamed from: h */
    public static final double f34774h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a */
    public final Size f34775a;

    /* renamed from: b */
    public final Rational f34776b;

    /* renamed from: c */
    public final Rational f34777c;

    /* renamed from: d */
    public final HashSet f34778d;

    /* renamed from: e */
    public final C4367l f34779e;

    /* renamed from: f */
    public final e0 f34780f;

    /* renamed from: g */
    public final HashMap f34781g;

    public C7292b(g0 g0Var, HashSet hashSet) {
        Size sizeM8070e = AbstractC3506f.m8070e(g0Var.mo7319q().mo7324g());
        e0 e0VarMo7319q = g0Var.mo7319q();
        C4367l c4367l = new C4367l(e0VarMo7319q, sizeM8070e);
        this.f34781g = new HashMap();
        this.f34775a = sizeM8070e;
        Rational rational = ((double) sizeM8070e.getWidth()) / ((double) sizeM8070e.getHeight()) > f34774h ? AbstractC3502b.f18370c : AbstractC3502b.f18368a;
        sizeM8070e.toString();
        Objects.toString(rational);
        u1.m10942a("ResolutionsMerger");
        this.f34776b = rational;
        Rational rational2 = AbstractC3502b.f18368a;
        if (rational.equals(rational2)) {
            rational2 = AbstractC3502b.f18370c;
        } else if (!rational.equals(AbstractC3502b.f18370c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f34777c = rational2;
        this.f34780f = e0VarMo7319q;
        this.f34778d = hashSet;
        this.f34779e = c4367l;
    }

    /* renamed from: a */
    public static Rect m13618a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalM13620h = m13620h(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalM13620h2 = m13620h(size);
        if (rationalM13620h.floatValue() == rationalM13620h2.floatValue()) {
            rectF2 = new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, width, height);
        } else {
            if (rationalM13620h.floatValue() > rationalM13620h2.floatValue()) {
                float f6 = width;
                float fFloatValue = f6 / rationalM13620h.floatValue();
                float f10 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(DefinitionKt.NO_Float_VALUE, f10, f6, fFloatValue + f10);
            } else {
                float f11 = height;
                float fFloatValue2 = rationalM13620h.floatValue() * f11;
                float f12 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f12, DefinitionKt.NO_Float_VALUE, fFloatValue2 + f12, f11);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    /* renamed from: d */
    public static boolean m13619d(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    /* renamed from: h */
    public static Rational m13620h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: b */
    public final C7291a m13621b(w2 w2Var, Rect rect, int i10, boolean z6) {
        boolean z10;
        Size size;
        Size size2;
        Pair pairCreate;
        if (AbstractC3506f.m8068c(i10)) {
            z10 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z10 = false;
        }
        if (z6) {
            Size sizeM8070e = AbstractC3506f.m8070e(rect);
            Iterator it = m13622c(w2Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeM8070e, sizeM8070e);
                    break;
                }
                Size size3 = (Size) it.next();
                Size sizeM8070e2 = AbstractC3506f.m8070e(m13618a(size3, sizeM8070e));
                if (!m13619d(sizeM8070e2, sizeM8070e)) {
                    pairCreate = Pair.create(size3, sizeM8070e2);
                    break;
                }
            }
            size = (Size) pairCreate.first;
            size2 = (Size) pairCreate.second;
        } else {
            Size sizeM8070e3 = AbstractC3506f.m8070e(rect);
            List listM13622c = m13622c(w2Var);
            Iterator it2 = listM13622c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listM13622c.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = sizeM8070e3;
                            break;
                        }
                        size = (Size) it3.next();
                        if (!m13619d(size, sizeM8070e3)) {
                            break;
                        }
                    }
                } else {
                    Size size4 = (Size) it2.next();
                    Rational rationalM13620h = AbstractC3502b.f18368a;
                    if (!AbstractC3502b.m8054a(rationalM13620h, sizeM8070e3)) {
                        rationalM13620h = AbstractC3502b.f18370c;
                        if (!AbstractC3502b.m8054a(rationalM13620h, sizeM8070e3)) {
                            rationalM13620h = m13620h(sizeM8070e3);
                        }
                    }
                    if (!m13623e(rationalM13620h, size4) && !m13619d(size4, sizeM8070e3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = m13618a(sizeM8070e3, size);
            size2 = size;
        }
        return z10 ? new C7291a(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new C7291a(rect, size2, size);
    }

    /* renamed from: c */
    public final List m13622c(w2 w2Var) {
        Rational rationalM13620h;
        if (!this.f34778d.contains(w2Var)) {
            throw new IllegalArgumentException("Invalid child config: " + w2Var);
        }
        HashMap map = this.f34781g;
        if (map.containsKey(w2Var)) {
            List list = (List) map.get(w2Var);
            Objects.requireNonNull(list);
            return list;
        }
        ArrayList arrayListM9120B = this.f34779e.m9120B(w2Var);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int size = arrayListM9120B.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM9120B.get(i10);
            i10++;
            Size size2 = (Size) obj;
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalM13620h = null;
                    break;
                }
                rationalM13620h = (Rational) it.next();
                if (AbstractC3502b.m8054a(rationalM13620h, size2)) {
                    break;
                }
            }
            if (rationalM13620h != null) {
                Size size3 = (Size) map2.get(rationalM13620h);
                Objects.requireNonNull(size3);
                if (size2.getHeight() > size3.getHeight() || size2.getWidth() > size3.getWidth() || (size2.getWidth() == size3.getWidth() && size2.getHeight() == size3.getHeight())) {
                }
            } else {
                rationalM13620h = m13620h(size2);
            }
            arrayList.add(size2);
            map2.put(rationalM13620h, size2);
        }
        map.put(w2Var, arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public final boolean m13623e(Rational rational, Size size) {
        Rational rational2 = this.f34776b;
        if (rational2.equals(rational) || AbstractC3502b.m8054a(rational, size)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalM13620h = AbstractC3502b.f18368a;
        if (!AbstractC3502b.m8054a(rationalM13620h, size)) {
            rationalM13620h = AbstractC3502b.f18370c;
            if (!AbstractC3502b.m8054a(rationalM13620h, size)) {
                rationalM13620h = m13620h(size);
            }
        }
        float fFloatValue3 = rationalM13620h.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        return fFloatValue > fFloatValue2 ? fFloatValue2 < fFloatValue3 : fFloatValue2 > fFloatValue3;
    }

    /* renamed from: f */
    public final ArrayList m13624f(List list, boolean z6) {
        int i10;
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = AbstractC3502b.f18368a;
        map.put(rational, new ArrayList());
        Rational rational2 = AbstractC3502b.f18370c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                int size2 = arrayList2.size();
                while (true) {
                    if (i10 >= size2) {
                        arrayList = null;
                        break;
                    }
                    Object obj = arrayList2.get(i10);
                    i10++;
                    Rational rational3 = (Rational) obj;
                    if (AbstractC3502b.m8054a(rational3, size)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalM13620h = m13620h(size);
                    arrayList2.add(rationalM13620h);
                    map.put(rationalM13620h, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new C2615d(3, m13620h(this.f34775a)));
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        while (i10 < size3) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            Rational rational4 = (Rational) obj2;
            if (!rational4.equals(AbstractC3502b.f18370c) && !rational4.equals(AbstractC3502b.f18368a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(m13625g(rational4, list2, z6));
            }
        }
        return arrayList4;
    }

    /* renamed from: g */
    public final ArrayList m13625g(Rational rational, List list, boolean z6) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (AbstractC3502b.m8054a(rational, size)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new C3503c(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.f34778d.iterator();
        while (true) {
            int i10 = 0;
            if (!it2.hasNext()) {
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    Size size3 = (Size) obj;
                    if (!hashSet.contains(size3)) {
                        arrayList3.add(size3);
                    }
                }
                return arrayList3;
            }
            List<Size> listM13622c = m13622c((w2) it2.next());
            if (!z6) {
                ArrayList arrayList4 = new ArrayList();
                for (Size size4 : listM13622c) {
                    if (!m13623e(rational, size4)) {
                        arrayList4.add(size4);
                    }
                }
                listM13622c = arrayList4;
            }
            if (listM13622c.isEmpty()) {
                return new ArrayList();
            }
            if (listM13622c.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList5 = new ArrayList();
                int size5 = arrayList2.size();
                int i11 = 0;
                while (i11 < size5) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    Size size6 = (Size) obj2;
                    Iterator it3 = listM13622c.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!m13619d((Size) it3.next(), size6)) {
                            arrayList5.add(size6);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList5;
            }
            if (listM13622c.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList6 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                int size7 = arrayList6.size();
                while (i10 < size7) {
                    Object obj3 = arrayList6.get(i10);
                    i10++;
                    Size size8 = (Size) obj3;
                    Iterator it4 = listM13622c.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size8);
                            break;
                        }
                        if (m13619d((Size) it4.next(), size8)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
    }
}
