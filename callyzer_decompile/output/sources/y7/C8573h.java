package y7;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import c6.C0892v;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.h */
/* loaded from: classes.dex */
public final class C8573h extends c0 {

    /* renamed from: s */
    public static TimeInterpolator f41643s;

    /* renamed from: g */
    public boolean f41644g;

    /* renamed from: h */
    public ArrayList f41645h;

    /* renamed from: i */
    public ArrayList f41646i;

    /* renamed from: j */
    public ArrayList f41647j;

    /* renamed from: k */
    public ArrayList f41648k;

    /* renamed from: l */
    public ArrayList f41649l;

    /* renamed from: m */
    public ArrayList f41650m;

    /* renamed from: n */
    public ArrayList f41651n;

    /* renamed from: o */
    public ArrayList f41652o;

    /* renamed from: p */
    public ArrayList f41653p;

    /* renamed from: q */
    public ArrayList f41654q;

    /* renamed from: r */
    public ArrayList f41655r;

    /* renamed from: h */
    public static void m15860h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((t0) arrayList.get(size)).f41792a.animate().cancel();
        }
    }

    @Override // y7.c0
    /* renamed from: a */
    public final boolean mo15836a(t0 t0Var, t0 t0Var2, C0892v c0892v, C0892v c0892v2) {
        int i10;
        int i11;
        int i12 = c0892v.f5525a;
        int i13 = c0892v.f5526b;
        if (t0Var2.m15930o()) {
            int i14 = c0892v.f5525a;
            i11 = c0892v.f5526b;
            i10 = i14;
        } else {
            i10 = c0892v2.f5525a;
            i11 = c0892v2.f5526b;
        }
        if (t0Var == t0Var2) {
            return m15861g(t0Var, i12, i13, i10, i11);
        }
        View view = t0Var.f41792a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m15865l(t0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = t0Var2.f41792a;
        m15865l(t0Var2);
        view2.setTranslationX(-((int) ((i10 - i12) - translationX)));
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(DefinitionKt.NO_Float_VALUE);
        ArrayList arrayList = this.f41648k;
        C8571f c8571f = new C8571f();
        c8571f.f41613a = t0Var;
        c8571f.f41614b = t0Var2;
        c8571f.f41615c = i12;
        c8571f.f41616d = i13;
        c8571f.f41617e = i10;
        c8571f.f41618f = i11;
        arrayList.add(c8571f);
        return true;
    }

    @Override // y7.c0
    /* renamed from: d */
    public final void mo15838d(t0 t0Var) {
        ArrayList arrayList = this.f41649l;
        ArrayList arrayList2 = this.f41650m;
        ArrayList arrayList3 = this.f41651n;
        View view = t0Var.f41792a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f41647j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C8572g) arrayList4.get(size)).f41634a == t0Var) {
                view.setTranslationY(DefinitionKt.NO_Float_VALUE);
                view.setTranslationX(DefinitionKt.NO_Float_VALUE);
                m15837c(t0Var);
                arrayList4.remove(size);
            }
        }
        m15863j(this.f41648k, t0Var);
        if (this.f41645h.remove(t0Var)) {
            view.setAlpha(1.0f);
            m15837c(t0Var);
        }
        if (this.f41646i.remove(t0Var)) {
            view.setAlpha(1.0f);
            m15837c(t0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m15863j(arrayList5, t0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C8572g) arrayList6.get(size4)).f41634a == t0Var) {
                    view.setTranslationY(DefinitionKt.NO_Float_VALUE);
                    view.setTranslationX(DefinitionKt.NO_Float_VALUE);
                    m15837c(t0Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(t0Var)) {
                view.setAlpha(1.0f);
                m15837c(t0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f41654q.remove(t0Var);
        this.f41652o.remove(t0Var);
        this.f41655r.remove(t0Var);
        this.f41653p.remove(t0Var);
        m15862i();
    }

    @Override // y7.c0
    /* renamed from: e */
    public final void mo15839e() {
        ArrayList arrayList = this.f41651n;
        ArrayList arrayList2 = this.f41649l;
        ArrayList arrayList3 = this.f41650m;
        ArrayList arrayList4 = this.f41648k;
        ArrayList arrayList5 = this.f41646i;
        ArrayList arrayList6 = this.f41645h;
        ArrayList arrayList7 = this.f41647j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C8572g c8572g = (C8572g) arrayList7.get(size);
            View view = c8572g.f41634a.f41792a;
            view.setTranslationY(DefinitionKt.NO_Float_VALUE);
            view.setTranslationX(DefinitionKt.NO_Float_VALUE);
            m15837c(c8572g.f41634a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m15837c((t0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            t0 t0Var = (t0) arrayList5.get(size3);
            t0Var.f41792a.setAlpha(1.0f);
            m15837c(t0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C8571f c8571f = (C8571f) arrayList4.get(size4);
            t0 t0Var2 = c8571f.f41613a;
            if (t0Var2 != null) {
                m15864k(c8571f, t0Var2);
            }
            t0 t0Var3 = c8571f.f41614b;
            if (t0Var3 != null) {
                m15864k(c8571f, t0Var3);
            }
        }
        arrayList4.clear();
        if (mo15840f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C8572g c8572g2 = (C8572g) arrayList8.get(size6);
                    View view2 = c8572g2.f41634a.f41792a;
                    view2.setTranslationY(DefinitionKt.NO_Float_VALUE);
                    view2.setTranslationX(DefinitionKt.NO_Float_VALUE);
                    m15837c(c8572g2.f41634a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    t0 t0Var4 = (t0) arrayList9.get(size8);
                    t0Var4.f41792a.setAlpha(1.0f);
                    m15837c(t0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C8571f c8571f2 = (C8571f) arrayList10.get(size10);
                    t0 t0Var5 = c8571f2.f41613a;
                    if (t0Var5 != null) {
                        m15864k(c8571f2, t0Var5);
                    }
                    t0 t0Var6 = c8571f2.f41614b;
                    if (t0Var6 != null) {
                        m15864k(c8571f2, t0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            m15860h(this.f41654q);
            m15860h(this.f41653p);
            m15860h(this.f41652o);
            m15860h(this.f41655r);
            ArrayList arrayList11 = this.f41589b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // y7.c0
    /* renamed from: f */
    public final boolean mo15840f() {
        return (this.f41646i.isEmpty() && this.f41648k.isEmpty() && this.f41647j.isEmpty() && this.f41645h.isEmpty() && this.f41653p.isEmpty() && this.f41654q.isEmpty() && this.f41652o.isEmpty() && this.f41655r.isEmpty() && this.f41650m.isEmpty() && this.f41649l.isEmpty() && this.f41651n.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    public final boolean m15861g(t0 t0Var, int i10, int i11, int i12, int i13) {
        View view = t0Var.f41792a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) t0Var.f41792a.getTranslationY());
        m15865l(t0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            m15837c(t0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.f41647j;
        C8572g c8572g = new C8572g();
        c8572g.f41634a = t0Var;
        c8572g.f41635b = translationX;
        c8572g.f41636c = translationY;
        c8572g.f41637d = i12;
        c8572g.f41638e = i13;
        arrayList.add(c8572g);
        return true;
    }

    /* renamed from: i */
    public final void m15862i() {
        if (mo15840f()) {
            return;
        }
        ArrayList arrayList = this.f41589b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: j */
    public final void m15863j(ArrayList arrayList, t0 t0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C8571f c8571f = (C8571f) arrayList.get(size);
            if (m15864k(c8571f, t0Var) && c8571f.f41613a == null && c8571f.f41614b == null) {
                arrayList.remove(c8571f);
            }
        }
    }

    /* renamed from: k */
    public final boolean m15864k(C8571f c8571f, t0 t0Var) {
        if (c8571f.f41614b == t0Var) {
            c8571f.f41614b = null;
        } else {
            if (c8571f.f41613a != t0Var) {
                return false;
            }
            c8571f.f41613a = null;
        }
        View view = t0Var.f41792a;
        View view2 = t0Var.f41792a;
        view.setAlpha(1.0f);
        view2.setTranslationX(DefinitionKt.NO_Float_VALUE);
        view2.setTranslationY(DefinitionKt.NO_Float_VALUE);
        m15837c(t0Var);
        return true;
    }

    /* renamed from: l */
    public final void m15865l(t0 t0Var) {
        if (f41643s == null) {
            f41643s = new ValueAnimator().getInterpolator();
        }
        t0Var.f41792a.animate().setInterpolator(f41643s);
        mo15838d(t0Var);
    }
}
