package p8;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c2;
import java.util.ArrayList;
import x5.C8305a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.o */
/* loaded from: classes.dex */
public class C5854o extends c2 {
    @Override // androidx.fragment.app.c2
    /* renamed from: a */
    public final void mo1097a(View view, Object obj) {
        ((AbstractC5857r) obj).mo11449b(view);
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: b */
    public final void mo1098b(Object obj, ArrayList arrayList) {
        AbstractC5857r abstractC5857r = (AbstractC5857r) obj;
        if (abstractC5857r == null) {
            return;
        }
        int i10 = 0;
        if (abstractC5857r instanceof C5862w) {
            C5862w c5862w = (C5862w) abstractC5857r;
            int size = c5862w.f28635y.size();
            while (i10 < size) {
                mo1098b((i10 < 0 || i10 >= c5862w.f28635y.size()) ? null : (AbstractC5857r) c5862w.f28635y.get(i10), arrayList);
                i10++;
            }
            return;
        }
        if (c2.m1124h(abstractC5857r.f28609c) && c2.m1124h(abstractC5857r.f28610d)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                abstractC5857r.mo11449b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: c */
    public final void mo1099c(ViewGroup viewGroup, Object obj) {
        AbstractC5861v.m11463a(viewGroup, (AbstractC5857r) obj);
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: e */
    public final boolean mo1100e(Object obj) {
        return obj instanceof AbstractC5857r;
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: f */
    public final Object mo1101f(Object obj) {
        if (obj != null) {
            return ((AbstractC5857r) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: j */
    public final Object mo1103j(Object obj, Object obj2, Object obj3) {
        AbstractC5857r abstractC5857r = (AbstractC5857r) obj;
        AbstractC5857r abstractC5857r2 = (AbstractC5857r) obj2;
        AbstractC5857r abstractC5857r3 = (AbstractC5857r) obj3;
        if (abstractC5857r != null && abstractC5857r2 != null) {
            C5862w c5862w = new C5862w();
            c5862w.m11465J(abstractC5857r);
            c5862w.m11465J(abstractC5857r2);
            c5862w.f28636z = false;
            abstractC5857r = c5862w;
        } else if (abstractC5857r == null) {
            abstractC5857r = abstractC5857r2 != null ? abstractC5857r2 : null;
        }
        if (abstractC5857r3 == null) {
            return abstractC5857r;
        }
        C5862w c5862w2 = new C5862w();
        if (abstractC5857r != null) {
            c5862w2.m11465J(abstractC5857r);
        }
        c5862w2.m11465J(abstractC5857r3);
        return c5862w2;
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: k */
    public final Object mo1104k(Object obj, Object obj2) {
        C5862w c5862w = new C5862w();
        if (obj != null) {
            c5862w.m11465J((AbstractC5857r) obj);
        }
        c5862w.m11465J((AbstractC5857r) obj2);
        return c5862w;
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: l */
    public final void mo1105l(Object obj, View view, ArrayList arrayList) {
        ((AbstractC5857r) obj).m11448a(new C5851l(view, arrayList));
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: m */
    public final void mo1106m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC5857r) obj).m11448a(new C5852m(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: n */
    public final void mo1107n(View view, Object obj) {
        if (view != null) {
            c2.m1123g(view, new Rect());
            ((AbstractC5857r) obj).mo11441C(new C5850k());
        }
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: o */
    public final void mo1108o(Object obj, Rect rect) {
        ((AbstractC5857r) obj).mo11441C(new C5850k());
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: p */
    public final void mo1109p(Object obj, C8305a c8305a, Runnable runnable) {
        AbstractC5857r abstractC5857r = (AbstractC5857r) obj;
        l4.d0 d0Var = new l4.d0(11, abstractC5857r);
        synchronized (c8305a) {
            while (c8305a.f39853c) {
                try {
                    try {
                        c8305a.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (c8305a.f39852b != d0Var) {
                c8305a.f39852b = d0Var;
                if (c8305a.f39851a) {
                    ((AbstractC5857r) d0Var.f21881b).cancel();
                }
            }
        }
        abstractC5857r.m11448a(new C5853n(runnable));
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: q */
    public final void mo1110q(Object obj, View view, ArrayList arrayList) {
        C5862w c5862w = (C5862w) obj;
        ArrayList arrayList2 = c5862w.f28610d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c2.m1122d((View) arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo1098b(c5862w, arrayList);
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: r */
    public final void mo1111r(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C5862w c5862w = (C5862w) obj;
        if (c5862w != null) {
            ArrayList arrayList3 = c5862w.f28610d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m11435t(c5862w, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: s */
    public final Object mo1112s(Object obj) {
        if (obj == null) {
            return null;
        }
        C5862w c5862w = new C5862w();
        c5862w.m11465J((AbstractC5857r) obj);
        return c5862w;
    }

    /* renamed from: t */
    public final void m11435t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC5857r abstractC5857r = (AbstractC5857r) obj;
        int i10 = 0;
        if (abstractC5857r instanceof C5862w) {
            C5862w c5862w = (C5862w) abstractC5857r;
            int size = c5862w.f28635y.size();
            while (i10 < size) {
                m11435t((i10 < 0 || i10 >= c5862w.f28635y.size()) ? null : (AbstractC5857r) c5862w.f28635y.get(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (c2.m1124h(abstractC5857r.f28609c)) {
            ArrayList arrayList3 = abstractC5857r.f28610d;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size2) {
                    abstractC5857r.mo11449b((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    abstractC5857r.mo11462z((View) arrayList.get(size3));
                }
            }
        }
    }
}
