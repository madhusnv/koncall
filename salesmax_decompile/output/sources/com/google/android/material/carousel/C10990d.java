package com.google.android.material.carousel;

import com.google.android.material.carousel.AbstractC10987a;
import com.google.android.material.carousel.C10989c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001o.gh0;
import p001o.ke2;
import p001o.pza;

/* renamed from: com.google.android.material.carousel.d */
/* loaded from: classes3.dex */
public class C10990d {

    /* renamed from: a */
    public final C10989c f12309a;

    /* renamed from: b */
    public final List f12310b;

    /* renamed from: c */
    public final List f12311c;

    /* renamed from: d */
    public final float[] f12312d;

    /* renamed from: e */
    public final float[] f12313e;

    /* renamed from: f */
    public final float f12314f;

    /* renamed from: g */
    public final float f12315g;

    /* renamed from: com.google.android.material.carousel.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12316a;

        static {
            int[] iArr = new int[AbstractC10987a.a.values().length];
            f12316a = iArr;
            try {
                iArr[AbstractC10987a.a.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public C10990d(C10989c c10989c, List list, List list2) {
        this.f12309a = c10989c;
        this.f12310b = Collections.unmodifiableList(list);
        this.f12311c = Collections.unmodifiableList(list2);
        float f = ((C10989c) list.get(list.size() - 1)).m14308d().f12301a - c10989c.m14308d().f12301a;
        this.f12314f = f;
        float f2 = c10989c.m14315k().f12301a - ((C10989c) list2.get(list2.size() - 1)).m14315k().f12301a;
        this.f12315g = f2;
        this.f12312d = m14335m(f, list, true);
        this.f12313e = m14335m(f2, list2, false);
    }

    /* renamed from: b */
    public static int m14330b(C10989c c10989c, float f) {
        for (int iM14314j = c10989c.m14314j(); iM14314j < c10989c.m14312h().size(); iM14314j++) {
            if (f == ((C10989c.c) c10989c.m14312h().get(iM14314j)).f12303c) {
                return iM14314j;
            }
        }
        return c10989c.m14312h().size() - 1;
    }

    /* renamed from: c */
    public static int m14331c(C10989c c10989c) {
        for (int i = 0; i < c10989c.m14312h().size(); i++) {
            if (!((C10989c.c) c10989c.m14312h().get(i)).f12305e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m14332d(C10989c c10989c, float f) {
        for (int iM14307c = c10989c.m14307c() - 1; iM14307c >= 0; iM14307c--) {
            if (f == ((C10989c.c) c10989c.m14312h().get(iM14307c)).f12303c) {
                return iM14307c;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static int m14333e(C10989c c10989c) {
        for (int size = c10989c.m14312h().size() - 1; size >= 0; size--) {
            if (!((C10989c.c) c10989c.m14312h().get(size)).f12305e) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static C10990d m14334f(ke2 ke2Var, C10989c c10989c, float f, float f2, float f3, AbstractC10987a.a aVar) {
        return new C10990d(c10989c, m14338p(ke2Var, c10989c, f, f2, aVar), m14336n(ke2Var, c10989c, f, f3, aVar));
    }

    /* renamed from: m */
    public static float[] m14335m(float f, List list, boolean z) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            C10989c c10989c = (C10989c) list.get(i2);
            C10989c c10989c2 = (C10989c) list.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? c10989c2.m14308d().f12301a - c10989c.m14308d().f12301a : c10989c.m14315k().f12301a - c10989c2.m14315k().f12301a) / f);
            i++;
        }
        return fArr;
    }

    /* renamed from: n */
    public static List m14336n(ke2 ke2Var, C10989c c10989c, float f, float f2, AbstractC10987a.a aVar) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c10989c);
        int iM14333e = m14333e(c10989c);
        int iMo14274a = ke2Var.mo14277k() ? ke2Var.mo14274a() : ke2Var.mo14275b();
        if (m14340r(ke2Var, c10989c) || iM14333e == -1) {
            if (f2 > 0.0f) {
                arrayList.add(m14343u(c10989c, f2, iMo14274a, false, f, aVar));
            }
            return arrayList;
        }
        int iM14314j = iM14333e - c10989c.m14314j();
        float f3 = c10989c.m14308d().f12302b - (c10989c.m14308d().f12304d / 2.0f);
        if (iM14314j <= 0 && c10989c.m14313i().f12306f > 0.0f) {
            arrayList.add(m14346x(c10989c, (f3 - c10989c.m14313i().f12306f) - f2, iMo14274a));
            return arrayList;
        }
        float f4 = 0.0f;
        int i4 = 0;
        while (i4 < iM14314j) {
            C10989c c10989c2 = (C10989c) arrayList.get(arrayList.size() - 1);
            int i5 = iM14333e - i4;
            float f5 = f4 + ((C10989c.c) c10989c.m14312h().get(i5)).f12306f;
            int i6 = i5 + 1;
            C10989c c10989cM14342t = m14342t(c10989c2, iM14333e, i6 < c10989c.m14312h().size() ? m14332d(c10989c2, ((C10989c.c) c10989c.m14312h().get(i6)).f12303c) + 1 : 0, f3 - f5, c10989c.m14307c() + i4 + 1, c10989c.m14314j() + i4 + 1, iMo14274a);
            if (i4 != iM14314j - 1 || f2 <= 0.0f) {
                i = i4;
                i2 = iM14314j;
                i3 = iMo14274a;
            } else {
                i = i4;
                i2 = iM14314j;
                i3 = iMo14274a;
                c10989cM14342t = m14343u(c10989cM14342t, f2, iMo14274a, false, f, aVar);
            }
            arrayList.add(c10989cM14342t);
            i4 = i + 1;
            iM14314j = i2;
            iMo14274a = i3;
            f4 = f5;
        }
        return arrayList;
    }

    /* renamed from: o */
    public static float[] m14337o(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{gh0.m28648b(0.0f, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    /* renamed from: p */
    public static List m14338p(ke2 ke2Var, C10989c c10989c, float f, float f2, AbstractC10987a.a aVar) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c10989c);
        int iM14331c = m14331c(c10989c);
        int iMo14274a = ke2Var.mo14277k() ? ke2Var.mo14274a() : ke2Var.mo14275b();
        if (m14339q(c10989c) || iM14331c == -1) {
            if (f2 > 0.0f) {
                arrayList.add(m14343u(c10989c, f2, iMo14274a, true, f, aVar));
            }
            return arrayList;
        }
        int iM14307c = c10989c.m14307c() - iM14331c;
        float f3 = c10989c.m14308d().f12302b - (c10989c.m14308d().f12304d / 2.0f);
        if (iM14307c <= 0 && c10989c.m14306b().f12306f > 0.0f) {
            arrayList.add(m14346x(c10989c, f3 + c10989c.m14306b().f12306f + f2, iMo14274a));
            return arrayList;
        }
        int i4 = 0;
        float f4 = 0.0f;
        while (i4 < iM14307c) {
            C10989c c10989c2 = (C10989c) arrayList.get(arrayList.size() - 1);
            int i5 = iM14331c + i4;
            int size = c10989c.m14312h().size() - 1;
            float f5 = f4 + ((C10989c.c) c10989c.m14312h().get(i5)).f12306f;
            C10989c c10989cM14342t = m14342t(c10989c2, iM14331c, i5 - 1 >= 0 ? m14330b(c10989c2, ((C10989c.c) c10989c.m14312h().get(r2)).f12303c) - 1 : size, f3 + f5, (c10989c.m14307c() - i4) - 1, (c10989c.m14314j() - i4) - 1, iMo14274a);
            if (i4 != iM14307c - 1 || f2 <= 0.0f) {
                i = i4;
                i2 = iM14307c;
                i3 = iMo14274a;
            } else {
                i = i4;
                i2 = iM14307c;
                i3 = iMo14274a;
                c10989cM14342t = m14343u(c10989cM14342t, f2, iMo14274a, true, f, aVar);
            }
            arrayList.add(c10989cM14342t);
            i4 = i + 1;
            iM14307c = i2;
            iMo14274a = i3;
            f4 = f5;
        }
        return arrayList;
    }

    /* renamed from: q */
    public static boolean m14339q(C10989c c10989c) {
        return c10989c.m14306b().f12302b - (c10989c.m14306b().f12304d / 2.0f) >= 0.0f && c10989c.m14306b() == c10989c.m14309e();
    }

    /* renamed from: r */
    public static boolean m14340r(ke2 ke2Var, C10989c c10989c) {
        int iMo14275b = ke2Var.mo14275b();
        if (ke2Var.mo14277k()) {
            iMo14275b = ke2Var.mo14274a();
        }
        return c10989c.m14313i().f12302b + (c10989c.m14313i().f12304d / 2.0f) <= ((float) iMo14275b) && c10989c.m14313i() == c10989c.m14316l();
    }

    /* renamed from: s */
    public static C10989c m14341s(List list, float f, float[] fArr) {
        float[] fArrM14337o = m14337o(list, f, fArr);
        return C10989c.m14303o((C10989c) list.get((int) fArrM14337o[1]), (C10989c) list.get((int) fArrM14337o[2]), fArrM14337o[0]);
    }

    /* renamed from: t */
    public static C10989c m14342t(C10989c c10989c, int i, int i2, float f, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(c10989c.m14312h());
        arrayList.add(i2, (C10989c.c) arrayList.remove(i));
        C10989c.b bVar = new C10989c.b(c10989c.m14311g(), i5);
        int i6 = 0;
        while (i6 < arrayList.size()) {
            C10989c.c cVar = (C10989c.c) arrayList.get(i6);
            float f2 = cVar.f12304d;
            bVar.m14324e(f + (f2 / 2.0f), cVar.f12303c, f2, i6 >= i3 && i6 <= i4, cVar.f12305e, cVar.f12306f);
            f += cVar.f12304d;
            i6++;
        }
        return bVar.m14328i();
    }

    /* renamed from: u */
    public static C10989c m14343u(C10989c c10989c, float f, int i, boolean z, float f2, AbstractC10987a.a aVar) {
        return a.f12316a[aVar.ordinal()] != 1 ? m14345w(c10989c, f, i, z) : m14344v(c10989c, f, i, z, f2);
    }

    /* renamed from: v */
    public static C10989c m14344v(C10989c c10989c, float f, int i, boolean z, float f2) {
        ArrayList arrayList = new ArrayList(c10989c.m14312h());
        C10989c.b bVar = new C10989c.b(c10989c.m14311g(), i);
        float fM14317m = f / c10989c.m14317m();
        float f3 = z ? f : 0.0f;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C10989c.c cVar = (C10989c.c) arrayList.get(i2);
            if (cVar.f12305e) {
                bVar.m14324e(cVar.f12302b, cVar.f12303c, cVar.f12304d, false, true, cVar.f12306f);
            } else {
                boolean z2 = i2 >= c10989c.m14307c() && i2 <= c10989c.m14314j();
                float f4 = cVar.f12304d - fM14317m;
                float fM14286b = AbstractC10987a.m14286b(f4, c10989c.m14311g(), f2);
                float f5 = (f4 / 2.0f) + f3;
                float fAbs = Math.abs(f5 - cVar.f12302b);
                bVar.m14325f(f5, fM14286b, f4, z2, false, cVar.f12306f, z ? fAbs : 0.0f, z ? 0.0f : fAbs);
                f3 += f4;
            }
            i2++;
        }
        return bVar.m14328i();
    }

    /* renamed from: w */
    public static C10989c m14345w(C10989c c10989c, float f, int i, boolean z) {
        ArrayList arrayList = new ArrayList(c10989c.m14312h());
        C10989c.b bVar = new C10989c.b(c10989c.m14311g(), i);
        int size = z ? 0 : arrayList.size() - 1;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C10989c.c cVar = (C10989c.c) arrayList.get(i2);
            if (cVar.f12305e && i2 == size) {
                bVar.m14324e(cVar.f12302b, cVar.f12303c, cVar.f12304d, false, true, cVar.f12306f);
            } else {
                float f2 = cVar.f12302b;
                float f3 = z ? f2 + f : f2 - f;
                float f4 = z ? f : 0.0f;
                float f5 = z ? 0.0f : f;
                boolean z2 = i2 >= c10989c.m14307c() && i2 <= c10989c.m14314j();
                float f6 = cVar.f12303c;
                float f7 = cVar.f12304d;
                bVar.m14325f(f3, f6, f7, z2, cVar.f12305e, Math.abs(z ? Math.max(0.0f, ((f7 / 2.0f) + f3) - i) : Math.min(0.0f, f3 - (f7 / 2.0f))), f4, f5);
            }
            i2++;
        }
        return bVar.m14328i();
    }

    /* renamed from: x */
    public static C10989c m14346x(C10989c c10989c, float f, int i) {
        return m14342t(c10989c, 0, 0, f, c10989c.m14307c(), c10989c.m14314j(), i);
    }

    /* renamed from: a */
    public final C10989c m14347a(List list, float f, float[] fArr) {
        float[] fArrM14337o = m14337o(list, f, fArr);
        return fArrM14337o[0] >= 0.5f ? (C10989c) list.get((int) fArrM14337o[2]) : (C10989c) list.get((int) fArrM14337o[1]);
    }

    /* renamed from: g */
    public C10989c m14348g() {
        return this.f12309a;
    }

    /* renamed from: h */
    public C10989c m14349h() {
        return (C10989c) this.f12311c.get(r0.size() - 1);
    }

    /* renamed from: i */
    public Map m14350i(int i, int i2, int i3, boolean z) {
        float fM14311g = this.f12309a.m14311g();
        HashMap map = new HashMap();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            int i6 = z ? (i - i4) - 1 : i4;
            if (i6 * fM14311g * (z ? -1 : 1) > i3 - this.f12315g || i4 >= i - this.f12311c.size()) {
                Integer numValueOf = Integer.valueOf(i6);
                List list = this.f12311c;
                map.put(numValueOf, (C10989c) list.get(pza.m44556b(i5, 0, list.size() - 1)));
                i5++;
            }
            i4++;
        }
        int i7 = 0;
        for (int i8 = i - 1; i8 >= 0; i8--) {
            int i9 = z ? (i - i8) - 1 : i8;
            if (i9 * fM14311g * (z ? -1 : 1) < i2 + this.f12314f || i8 < this.f12310b.size()) {
                Integer numValueOf2 = Integer.valueOf(i9);
                List list2 = this.f12310b;
                map.put(numValueOf2, (C10989c) list2.get(pza.m44556b(i7, 0, list2.size() - 1)));
                i7++;
            }
        }
        return map;
    }

    /* renamed from: j */
    public C10989c m14351j(float f, float f2, float f3) {
        return m14352k(f, f2, f3, false);
    }

    /* renamed from: k */
    public C10989c m14352k(float f, float f2, float f3, boolean z) {
        float fM28648b;
        List list;
        float[] fArr;
        float f4 = this.f12314f + f2;
        float f5 = f3 - this.f12315g;
        float f6 = m14353l().m14306b().f12307g;
        float f7 = m14349h().m14306b().f12308h;
        if (this.f12314f == f6) {
            f4 += f6;
        }
        if (this.f12315g == f7) {
            f5 -= f7;
        }
        if (f < f4) {
            fM28648b = gh0.m28648b(1.0f, 0.0f, f2, f4, f);
            list = this.f12310b;
            fArr = this.f12312d;
        } else {
            if (f <= f5) {
                return this.f12309a;
            }
            fM28648b = gh0.m28648b(0.0f, 1.0f, f5, f3, f);
            list = this.f12311c;
            fArr = this.f12313e;
        }
        return z ? m14347a(list, fM28648b, fArr) : m14341s(list, fM28648b, fArr);
    }

    /* renamed from: l */
    public C10989c m14353l() {
        return (C10989c) this.f12310b.get(r0.size() - 1);
    }
}
