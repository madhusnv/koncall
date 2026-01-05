package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import e1.C1903e;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public final class C0352q {

    /* renamed from: a */
    public final ViewGroup f2674a;

    /* renamed from: b */
    public final ArrayList f2675b;

    /* renamed from: c */
    public final ArrayList f2676c;

    /* renamed from: d */
    public boolean f2677d;

    /* renamed from: e */
    public boolean f2678e;

    /* renamed from: f */
    public boolean f2679f;

    public C0352q(ViewGroup container) {
        AbstractC4154l.m8923f(container, "container");
        this.f2674a = container;
        this.f2675b = new ArrayList();
        this.f2676c = new ArrayList();
    }

    /* renamed from: f */
    public static void m1231f(C1903e c1903e, View view) {
        Field field = c6.v0.f5527a;
        String strM2454f = c6.n0.m2454f(view);
        if (strM2454f != null) {
            c1903e.put(strM2454f, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    m1231f(c1903e, childAt);
                }
            }
        }
    }

    /* renamed from: j */
    public static final C0352q m1232j(ViewGroup container, j1 fragmentManager) {
        AbstractC4154l.m8923f(container, "container");
        AbstractC4154l.m8923f(fragmentManager, "fragmentManager");
        AbstractC4154l.m8922e(fragmentManager.m1162J(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0352q) {
            return (C0352q) tag;
        }
        C0352q c0352q = new C0352q(container);
        container.setTag(R.id.special_effects_controller_view_tag, c0352q);
        return c0352q;
    }

    /* renamed from: k */
    public static boolean m1233k(ArrayList arrayList) {
        boolean z6;
        int size = arrayList.size();
        int i10 = 0;
        loop0: while (true) {
            z6 = true;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                h2 h2Var = (h2) obj;
                if (!h2Var.f2555k.isEmpty()) {
                    ArrayList arrayList2 = h2Var.f2555k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (!((g2) obj2).mo1134a()) {
                                break;
                            }
                        }
                    }
                }
                z6 = false;
            }
            break loop0;
        }
        if (z6) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList.get(i12);
                i12++;
                AbstractC6663m.m12765x(arrayList3, ((h2) obj3).f2555k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m1234a(h2 operation) {
        AbstractC4154l.m8923f(operation, "operation");
        if (operation.f2553i) {
            l2 l2Var = operation.f2545a;
            View viewRequireView = operation.f2547c.requireView();
            AbstractC4154l.m8922e(viewRequireView, "operation.fragment.requireView()");
            l2Var.applyState(viewRequireView, this.f2674a);
            operation.f2553i = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037e A[LOOP:18: B:120:0x037c->B:121:0x037e, LOOP_END] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1235b(java.util.ArrayList r27, boolean r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0352q.m1235b(java.util.ArrayList, boolean):void");
    }

    /* renamed from: c */
    public final void m1236c(List operations) {
        AbstractC4154l.m8923f(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            AbstractC6663m.m12765x(arrayList, ((h2) it.next()).f2555k);
        }
        List listC0 = AbstractC6663m.c0(AbstractC6663m.g0(arrayList));
        int size = listC0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g2) listC0.get(i10)).mo1131c(this.f2674a);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            m1234a((h2) operations.get(i11));
        }
        List listC02 = AbstractC6663m.c0(operations);
        int size3 = listC02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            h2 h2Var = (h2) listC02.get(i12);
            if (h2Var.f2555k.isEmpty()) {
                h2Var.m1138b();
            }
        }
    }

    /* renamed from: d */
    public final void m1237d(l2 l2Var, i2 i2Var, s1 s1Var) {
        synchronized (this.f2675b) {
            try {
                j0 j0Var = s1Var.f2696c;
                AbstractC4154l.m8922e(j0Var, "fragmentStateManager.fragment");
                h2 h2VarM1239g = m1239g(j0Var);
                if (h2VarM1239g == null) {
                    j0 j0Var2 = s1Var.f2696c;
                    h2VarM1239g = j0Var2.mTransitioning ? m1240h(j0Var2) : null;
                }
                if (h2VarM1239g != null) {
                    h2VarM1239g.m1140d(l2Var, i2Var);
                    return;
                }
                h2 h2Var = new h2(l2Var, i2Var, s1Var);
                this.f2675b.add(h2Var);
                h2Var.f2548d.add(new f2(this, h2Var, 0));
                h2Var.f2548d.add(new f2(this, h2Var, 2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m1238e() {
        boolean z6;
        if (this.f2679f) {
            return;
        }
        if (!this.f2674a.isAttachedToWindow()) {
            m1241i();
            this.f2678e = false;
            return;
        }
        synchronized (this.f2675b) {
            try {
                ArrayList arrayListD0 = AbstractC6663m.d0(this.f2676c);
                this.f2676c.clear();
                int size = arrayListD0.size();
                int i10 = 0;
                while (true) {
                    z6 = true;
                    if (i10 >= size) {
                        break;
                    }
                    Object obj = arrayListD0.get(i10);
                    i10++;
                    h2 h2Var = (h2) obj;
                    if (this.f2675b.isEmpty() || !h2Var.f2547c.mTransitioning) {
                        z6 = false;
                    }
                    h2Var.f2551g = z6;
                }
                int size2 = arrayListD0.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayListD0.get(i11);
                    i11++;
                    h2 h2Var2 = (h2) obj2;
                    if (this.f2677d) {
                        if (j1.m1152K(2)) {
                            Objects.toString(h2Var2);
                        }
                        h2Var2.m1138b();
                    } else {
                        if (j1.m1152K(2)) {
                            Objects.toString(h2Var2);
                        }
                        h2Var2.m1137a(this.f2674a);
                    }
                    this.f2677d = false;
                    if (!h2Var2.f2550f) {
                        this.f2676c.add(h2Var2);
                    }
                }
                if (!this.f2675b.isEmpty()) {
                    m1244n();
                    ArrayList arrayListD02 = AbstractC6663m.d0(this.f2675b);
                    if (arrayListD02.isEmpty()) {
                        return;
                    }
                    this.f2675b.clear();
                    this.f2676c.addAll(arrayListD02);
                    j1.m1152K(2);
                    m1235b(arrayListD02, this.f2678e);
                    boolean zM1233k = m1233k(arrayListD02);
                    int size3 = arrayListD02.size();
                    int i12 = 0;
                    boolean z10 = true;
                    while (i12 < size3) {
                        Object obj3 = arrayListD02.get(i12);
                        i12++;
                        if (!((h2) obj3).f2547c.mTransitioning) {
                            z10 = false;
                        }
                    }
                    if (!z10 || zM1233k) {
                        z6 = false;
                    }
                    this.f2677d = z6;
                    j1.m1152K(2);
                    if (!z10) {
                        m1243m(arrayListD02);
                        m1236c(arrayListD02);
                    } else if (zM1233k) {
                        m1243m(arrayListD02);
                        int size4 = arrayListD02.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            m1234a((h2) arrayListD02.get(i13));
                        }
                    }
                    this.f2678e = false;
                    j1.m1152K(2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final h2 m1239g(j0 j0Var) {
        Object obj;
        ArrayList arrayList = this.f2675b;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            h2 h2Var = (h2) obj;
            if (AbstractC4154l.m8918a(h2Var.f2547c, j0Var) && !h2Var.f2549e) {
                break;
            }
        }
        return (h2) obj;
    }

    /* renamed from: h */
    public final h2 m1240h(j0 j0Var) {
        Object obj;
        ArrayList arrayList = this.f2676c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            h2 h2Var = (h2) obj;
            if (AbstractC4154l.m8918a(h2Var.f2547c, j0Var) && !h2Var.f2549e) {
                break;
            }
        }
        return (h2) obj;
    }

    /* renamed from: i */
    public final void m1241i() {
        j1.m1152K(2);
        boolean zIsAttachedToWindow = this.f2674a.isAttachedToWindow();
        synchronized (this.f2675b) {
            try {
                m1244n();
                m1243m(this.f2675b);
                ArrayList arrayListD0 = AbstractC6663m.d0(this.f2676c);
                int size = arrayListD0.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayListD0.get(i11);
                    i11++;
                    ((h2) obj).f2551g = false;
                }
                int size2 = arrayListD0.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayListD0.get(i12);
                    i12++;
                    h2 h2Var = (h2) obj2;
                    if (j1.m1152K(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f2674a);
                        }
                        Objects.toString(h2Var);
                    }
                    h2Var.m1137a(this.f2674a);
                }
                ArrayList arrayListD02 = AbstractC6663m.d0(this.f2675b);
                int size3 = arrayListD02.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayListD02.get(i13);
                    i13++;
                    ((h2) obj3).f2551g = false;
                }
                int size4 = arrayListD02.size();
                while (i10 < size4) {
                    Object obj4 = arrayListD02.get(i10);
                    i10++;
                    h2 h2Var2 = (h2) obj4;
                    if (j1.m1152K(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f2674a);
                        }
                        Objects.toString(h2Var2);
                    }
                    h2Var2.m1137a(this.f2674a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public final void m1242l() {
        Object objPrevious;
        synchronized (this.f2675b) {
            try {
                m1244n();
                ArrayList arrayList = this.f2675b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    h2 h2Var = (h2) objPrevious;
                    j2 j2Var = l2.Companion;
                    View view = h2Var.f2547c.mView;
                    AbstractC4154l.m8922e(view, "operation.fragment.mView");
                    j2Var.getClass();
                    l2 l2VarM1202a = j2.m1202a(view);
                    l2 l2Var = h2Var.f2545a;
                    l2 l2Var2 = l2.VISIBLE;
                    if (l2Var == l2Var2 && l2VarM1202a != l2Var2) {
                        break;
                    }
                }
                h2 h2Var2 = (h2) objPrevious;
                j0 j0Var = h2Var2 != null ? h2Var2.f2547c : null;
                this.f2679f = j0Var != null ? j0Var.isPostponed() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public final void m1243m(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            h2 h2Var = (h2) list.get(i10);
            s1 s1Var = h2Var.f2556l;
            if (!h2Var.f2552h) {
                h2Var.f2552h = true;
                i2 i2Var = h2Var.f2546b;
                if (i2Var == i2.ADDING) {
                    j0 j0Var = s1Var.f2696c;
                    AbstractC4154l.m8922e(j0Var, "fragmentStateManager.fragment");
                    View viewFindFocus = j0Var.mView.findFocus();
                    if (viewFindFocus != null) {
                        j0Var.setFocusedView(viewFindFocus);
                        if (j1.m1152K(2)) {
                            viewFindFocus.toString();
                            j0Var.toString();
                        }
                    }
                    View viewRequireView = h2Var.f2547c.requireView();
                    AbstractC4154l.m8922e(viewRequireView, "this.fragment.requireView()");
                    if (viewRequireView.getParent() == null) {
                        s1Var.m1246a();
                        viewRequireView.setAlpha(DefinitionKt.NO_Float_VALUE);
                    }
                    if (viewRequireView.getAlpha() == DefinitionKt.NO_Float_VALUE && viewRequireView.getVisibility() == 0) {
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(j0Var.getPostOnViewCreatedAlpha());
                } else if (i2Var == i2.REMOVING) {
                    j0 j0Var2 = s1Var.f2696c;
                    AbstractC4154l.m8922e(j0Var2, "fragmentStateManager.fragment");
                    View viewRequireView2 = j0Var2.requireView();
                    AbstractC4154l.m8922e(viewRequireView2, "fragment.requireView()");
                    if (j1.m1152K(2)) {
                        Objects.toString(viewRequireView2.findFocus());
                        viewRequireView2.toString();
                        j0Var2.toString();
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6663m.m12765x(arrayList, ((h2) it.next()).f2555k);
        }
        List listC0 = AbstractC6663m.c0(AbstractC6663m.g0(arrayList));
        int size2 = listC0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            g2 g2Var = (g2) listC0.get(i11);
            g2Var.getClass();
            ViewGroup container = this.f2674a;
            AbstractC4154l.m8923f(container, "container");
            if (!g2Var.f2539a) {
                g2Var.mo1136e(container);
            }
            g2Var.f2539a = true;
        }
    }

    /* renamed from: n */
    public final void m1244n() {
        ArrayList arrayList = this.f2675b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h2 h2Var = (h2) obj;
            if (h2Var.f2546b == i2.ADDING) {
                View viewRequireView = h2Var.f2547c.requireView();
                AbstractC4154l.m8922e(viewRequireView, "fragment.requireView()");
                j2 j2Var = l2.Companion;
                int visibility = viewRequireView.getVisibility();
                j2Var.getClass();
                h2Var.m1140d(j2.m1203b(visibility), i2.NONE);
            }
        }
    }
}
