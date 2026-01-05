package w3;

import android.content.res.Resources;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import d4.AbstractC1592t;
import d4.C1579g;
import d4.C1580h;
import d4.C1583k;
import d4.C1589q;
import d4.C1595w;
import e1.AbstractC1910l;
import e1.C1922x;
import f4.EnumC2203a;
import g4.C2492h;
import gh.C2615d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kx.C4262d;
import og.mc;
import pg.w9;
import rw.AbstractC6663m;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a */
    public static final Comparator[] f37774a;

    /* renamed from: b */
    public static final c0 f37775b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new C2615d(5, new C2615d(i10 == 0 ? x1.f38050c : x1.f38049b));
            i10++;
        }
        f37774a = comparatorArr;
        f37775b = c0.f37752b;
    }

    /* renamed from: a */
    public static final boolean m14905a(C1589q c1589q) {
        C1583k c1583kM5214i = c1589q.m5214i();
        return !c1583kM5214i.f7868a.m5570c(AbstractC1592t.f7925i);
    }

    /* renamed from: b */
    public static final void m14906b(C1589q c1589q, ArrayList arrayList, C1922x c1922x, AbstractC1910l abstractC1910l, Resources resources) {
        boolean zM14910f = m14910f(c1589q);
        int i10 = c1589q.f7882g;
        C1583k c1583k = c1589q.f7879d;
        Object objM5574g = c1583k.f7868a.m5574g(AbstractC1592t.f7929m);
        if (objM5574g == null) {
            objM5574g = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM5574g).booleanValue();
        if ((zBooleanValue || m14911g(c1589q, resources)) && abstractC1910l.m5594a(i10)) {
            arrayList.add(c1589q);
        }
        if (zBooleanValue) {
            c1922x.m5663h(i10, m14912h(zM14910f, C1589q.m5206h(7, c1589q), abstractC1910l, resources));
            return;
        }
        List listM5206h = C1589q.m5206h(7, c1589q);
        int size = listM5206h.size();
        for (int i11 = 0; i11 < size; i11++) {
            m14906b((C1589q) listM5206h.get(i11), arrayList, c1922x, abstractC1910l, resources);
        }
    }

    /* renamed from: c */
    public static final boolean m14907c(C1589q c1589q) {
        Object objM5574g = c1589q.f7879d.f7868a.m5574g(AbstractC1592t.f7911H);
        if (objM5574g == null) {
            objM5574g = null;
        }
        EnumC2203a enumC2203a = (EnumC2203a) objM5574g;
        e1.j0 j0Var = c1589q.f7879d.f7868a;
        Object objM5574g2 = j0Var.m5574g(AbstractC1592t.f7939w);
        if (objM5574g2 == null) {
            objM5574g2 = null;
        }
        C1580h c1580h = (C1580h) objM5574g2;
        boolean z6 = enumC2203a != null;
        Object objM5574g3 = j0Var.m5574g(AbstractC1592t.f7910G);
        if (((Boolean) (objM5574g3 != null ? objM5574g3 : null)) == null || (c1580h != null && c1580h.f7837a == 4)) {
            return z6;
        }
        return true;
    }

    /* renamed from: d */
    public static final String m14908d(C1589q c1589q, Resources resources) {
        C1583k c1583k = c1589q.f7879d;
        C1583k c1583k2 = c1589q.f7879d;
        Object objM5574g = c1583k.f7868a.m5574g(AbstractC1592t.f7918b);
        String string = null;
        if (objM5574g == null) {
            objM5574g = null;
        }
        e1.j0 j0Var = c1583k2.f7868a;
        Object objM5574g2 = j0Var.m5574g(AbstractC1592t.f7911H);
        if (objM5574g2 == null) {
            objM5574g2 = null;
        }
        EnumC2203a enumC2203a = (EnumC2203a) objM5574g2;
        Object objM5574g3 = j0Var.m5574g(AbstractC1592t.f7939w);
        if (objM5574g3 == null) {
            objM5574g3 = null;
        }
        C1580h c1580h = (C1580h) objM5574g3;
        if (enumC2203a != null) {
            int i10 = d0.f37769a[enumC2203a.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && objM5574g == null) {
                        objM5574g = resources.getString(R.string.indeterminate);
                    }
                } else if (c1580h != null && c1580h.f7837a == 2 && objM5574g == null) {
                    objM5574g = resources.getString(R.string.state_off);
                }
            } else if (c1580h != null && c1580h.f7837a == 2 && objM5574g == null) {
                objM5574g = resources.getString(R.string.state_on);
            }
        }
        Object objM5574g4 = j0Var.m5574g(AbstractC1592t.f7910G);
        if (objM5574g4 == null) {
            objM5574g4 = null;
        }
        Boolean bool = (Boolean) objM5574g4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((c1580h == null || c1580h.f7837a != 4) && objM5574g == null) {
                objM5574g = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objM5574g5 = j0Var.m5574g(AbstractC1592t.f7919c);
        if (objM5574g5 == null) {
            objM5574g5 = null;
        }
        C1579g c1579g = (C1579g) objM5574g5;
        if (c1579g != null) {
            if (c1579g != C1579g.f7834c) {
                if (objM5574g == null) {
                    C4262d c4262d = c1579g.f7836b;
                    float f6 = c4262d.f21645b;
                    float f10 = c4262d.f21644a;
                    float f11 = f6 - f10 == DefinitionKt.NO_Float_VALUE ? 0.0f : (c1579g.f7835a - f10) / (c4262d.f21645b - f10);
                    if (f11 < DefinitionKt.NO_Float_VALUE) {
                        f11 = 0.0f;
                    }
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    }
                    objM5574g = resources.getString(R.string.template_percent, Integer.valueOf(f11 == DefinitionKt.NO_Float_VALUE ? 0 : f11 == 1.0f ? 100 : w9.m11912c(Math.round(f11 * 100), 1, 99)));
                }
            } else if (objM5574g == null) {
                objM5574g = resources.getString(R.string.in_progress);
            }
        }
        C1595w c1595w = AbstractC1592t.f7907D;
        if (j0Var.m5570c(c1595w)) {
            e1.j0 j0Var2 = new C1589q(c1589q.f7876a, true, c1589q.f7878c, c1583k2).m5214i().f7868a;
            Object objM5574g6 = j0Var2.m5574g(AbstractC1592t.f7917a);
            if (objM5574g6 == null) {
                objM5574g6 = null;
            }
            Collection collection = (Collection) objM5574g6;
            if (collection == null || collection.isEmpty()) {
                Object objM5574g7 = j0Var2.m5574g(AbstractC1592t.f7942z);
                if (objM5574g7 == null) {
                    objM5574g7 = null;
                }
                Collection collection2 = (Collection) objM5574g7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objM5574g8 = j0Var2.m5574g(c1595w);
                    if (objM5574g8 == null) {
                        objM5574g8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objM5574g8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objM5574g = string;
        }
        return (String) objM5574g;
    }

    /* renamed from: e */
    public static final C2492h m14909e(C1589q c1589q) {
        C1583k c1583k = c1589q.f7879d;
        C1595w c1595w = AbstractC1592t.f7917a;
        C2492h c2492h = (C2492h) mc.m10763b(c1583k, AbstractC1592t.f7907D);
        List list = (List) mc.m10763b(c1589q.f7879d, AbstractC1592t.f7942z);
        return c2492h == null ? list != null ? (C2492h) AbstractC6663m.m12743G(list) : null : c2492h;
    }

    /* renamed from: f */
    public static final boolean m14910f(C1589q c1589q) {
        return c1589q.f7878c.f36826D == EnumC6757m.Rtl;
    }

    /* renamed from: g */
    public static final boolean m14911g(C1589q c1589q, Resources resources) {
        Object objM5574g = c1589q.f7879d.f7868a.m5574g(AbstractC1592t.f7917a);
        if (objM5574g == null) {
            objM5574g = null;
        }
        List list = (List) objM5574g;
        return !m0.m14988o(c1589q) && (c1589q.f7879d.f7870c || (c1589q.m5218m() && ((list != null ? (String) AbstractC6663m.m12743G(list) : null) != null || m14909e(c1589q) != null || m14908d(c1589q, resources) != null || m14907c(c1589q))));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList m14912h(boolean r17, java.util.List r18, e1.AbstractC1910l r19, android.content.res.Resources r20) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e0.m14912h(boolean, java.util.List, e1.l, android.content.res.Resources):java.util.ArrayList");
    }
}
