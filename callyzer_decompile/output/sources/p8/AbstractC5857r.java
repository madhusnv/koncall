package p8;

import a2.AbstractC0030c;
import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import c6.a1;
import c6.n0;
import c6.v0;
import c9.C0919n;
import com.sun.mail.util.AbstractC1452a;
import dh.C1723a;
import e1.C1903e;
import e1.C1915q;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import ng.C5070u;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.r */
/* loaded from: classes.dex */
public abstract class AbstractC5857r implements Cloneable {

    /* renamed from: v */
    public static final int[] f28604v = {2, 1, 3, 4};

    /* renamed from: w */
    public static final C5070u f28605w = new C5070u(23);

    /* renamed from: x */
    public static final ThreadLocal f28606x = new ThreadLocal();

    /* renamed from: j */
    public ArrayList f28615j;

    /* renamed from: k */
    public ArrayList f28616k;

    /* renamed from: s */
    public C5850k f28623s;

    /* renamed from: a */
    public final String f28607a = getClass().getName();

    /* renamed from: b */
    public long f28608b = -1;

    /* renamed from: c */
    public final ArrayList f28609c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f28610d = new ArrayList();

    /* renamed from: e */
    public C0919n f28611e = new C0919n(8);

    /* renamed from: f */
    public C0919n f28612f = new C0919n(8);

    /* renamed from: g */
    public C5862w f28613g = null;

    /* renamed from: h */
    public final int[] f28614h = f28604v;

    /* renamed from: l */
    public final ArrayList f28617l = new ArrayList();

    /* renamed from: m */
    public int f28618m = 0;

    /* renamed from: n */
    public boolean f28619n = false;

    /* renamed from: p */
    public boolean f28620p = false;

    /* renamed from: q */
    public ArrayList f28621q = null;

    /* renamed from: r */
    public ArrayList f28622r = new ArrayList();

    /* renamed from: t */
    public C5070u f28624t = f28605w;

    /* renamed from: c */
    public static void m11436c(C0919n c0919n, View view, C5864y c5864y) {
        C1903e c1903e = (C1903e) c0919n.f5598a;
        C1903e c1903e2 = (C1903e) c0919n.f5601d;
        SparseArray sparseArray = (SparseArray) c0919n.f5599b;
        C1915q c1915q = (C1915q) c0919n.f5600c;
        c1903e.put(view, c5864y);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        Field field = v0.f5527a;
        String strM2454f = n0.m2454f(view);
        if (strM2454f != null) {
            if (c1903e2.containsKey(strM2454f)) {
                c1903e2.put(strM2454f, null);
            } else {
                c1903e2.put(strM2454f, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1915q.m5599c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1915q.m5601e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1915q.m5598b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1915q.m5601e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: q */
    public static C1903e m11437q() {
        ThreadLocal threadLocal = f28606x;
        C1903e c1903e = (C1903e) threadLocal.get();
        if (c1903e != null) {
            return c1903e;
        }
        C1903e c1903e2 = new C1903e(0);
        threadLocal.set(c1903e2);
        return c1903e2;
    }

    /* renamed from: w */
    public static boolean m11438w(C5864y c5864y, C5864y c5864y2, String str) {
        Object obj = c5864y.f28640a.get(str);
        Object obj2 = c5864y2.f28640a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo11439A(View view) {
        if (this.f28619n) {
            if (!this.f28620p) {
                ArrayList arrayList = this.f28617l;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f28621q;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f28621q.clone();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((InterfaceC5856q) arrayList3.get(i10)).mo11421d();
                    }
                }
            }
            this.f28619n = false;
        }
    }

    /* renamed from: B */
    public void mo11440B() {
        m11446H();
        C1903e c1903eM11437q = m11437q();
        ArrayList arrayList = this.f28622r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (c1903eM11437q.containsKey(animator)) {
                m11446H();
                if (animator != null) {
                    animator.addListener(new a1(this, c1903eM11437q));
                    long j6 = this.f28608b;
                    if (j6 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j6);
                    }
                    animator.addListener(new C1723a(2, this));
                    animator.start();
                }
            }
        }
        this.f28622r.clear();
        m11456o();
    }

    /* renamed from: C */
    public void mo11441C(C5850k c5850k) {
        this.f28623s = c5850k;
    }

    /* renamed from: E */
    public void mo11443E(C5070u c5070u) {
        if (c5070u == null) {
            this.f28624t = f28605w;
        } else {
            this.f28624t = c5070u;
        }
    }

    /* renamed from: G */
    public void mo11445G(long j6) {
        this.f28608b = j6;
    }

    /* renamed from: H */
    public final void m11446H() {
        if (this.f28618m == 0) {
            ArrayList arrayList = this.f28621q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f28621q.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC5856q) arrayList2.get(i10)).mo11424c(this);
                }
            }
            this.f28620p = false;
        }
        this.f28618m++;
    }

    /* renamed from: I */
    public String mo11447I(String str) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o(str);
        sbM4568o.append(getClass().getSimpleName());
        sbM4568o.append("@");
        sbM4568o.append(Integer.toHexString(hashCode()));
        sbM4568o.append(": ");
        String string = sbM4568o.toString();
        if (this.f28608b != -1) {
            string = AbstractC0030c.m116g(this.f28608b, ") ", AbstractC5601a.m11245p(string, "dly("));
        }
        ArrayList arrayList = this.f28609c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f28610d;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strM4561h = AbstractC1452a.m4561h(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    strM4561h = AbstractC1452a.m4561h(strM4561h, ", ");
                }
                StringBuilder sbM4568o2 = AbstractC1452a.m4568o(strM4561h);
                sbM4568o2.append(arrayList.get(i10));
                strM4561h = sbM4568o2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 > 0) {
                    strM4561h = AbstractC1452a.m4561h(strM4561h, ", ");
                }
                StringBuilder sbM4568o3 = AbstractC1452a.m4568o(strM4561h);
                sbM4568o3.append(arrayList2.get(i11));
                strM4561h = sbM4568o3.toString();
            }
        }
        return AbstractC1452a.m4561h(strM4561h, ")");
    }

    /* renamed from: a */
    public void m11448a(InterfaceC5856q interfaceC5856q) {
        if (this.f28621q == null) {
            this.f28621q = new ArrayList();
        }
        this.f28621q.add(interfaceC5856q);
    }

    /* renamed from: b */
    public void mo11449b(View view) {
        this.f28610d.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f28617l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f28621q;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f28621q.clone();
        int size2 = arrayList3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((InterfaceC5856q) arrayList3.get(i10)).mo11423b();
        }
    }

    /* renamed from: d */
    public abstract void mo11427d(C5864y c5864y);

    /* renamed from: e */
    public final void m11450e(View view, boolean z6) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C5864y c5864y = new C5864y(view);
            if (z6) {
                mo11428g(c5864y);
            } else {
                mo11427d(c5864y);
            }
            c5864y.f28642c.add(this);
            mo11451f(c5864y);
            if (z6) {
                m11436c(this.f28611e, view, c5864y);
            } else {
                m11436c(this.f28612f, view, c5864y);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m11450e(viewGroup.getChildAt(i10), z6);
            }
        }
    }

    /* renamed from: g */
    public abstract void mo11428g(C5864y c5864y);

    /* renamed from: i */
    public final void m11452i(ViewGroup viewGroup, boolean z6) {
        m11453k(z6);
        ArrayList arrayList = this.f28609c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f28610d;
        if (size <= 0 && arrayList2.size() <= 0) {
            m11450e(viewGroup, z6);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                C5864y c5864y = new C5864y(viewFindViewById);
                if (z6) {
                    mo11428g(c5864y);
                } else {
                    mo11427d(c5864y);
                }
                c5864y.f28642c.add(this);
                mo11451f(c5864y);
                if (z6) {
                    m11436c(this.f28611e, viewFindViewById, c5864y);
                } else {
                    m11436c(this.f28612f, viewFindViewById, c5864y);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            C5864y c5864y2 = new C5864y(view);
            if (z6) {
                mo11428g(c5864y2);
            } else {
                mo11427d(c5864y2);
            }
            c5864y2.f28642c.add(this);
            mo11451f(c5864y2);
            if (z6) {
                m11436c(this.f28611e, view, c5864y2);
            } else {
                m11436c(this.f28612f, view, c5864y2);
            }
        }
    }

    /* renamed from: k */
    public final void m11453k(boolean z6) {
        if (z6) {
            ((C1903e) this.f28611e.f5598a).clear();
            ((SparseArray) this.f28611e.f5599b).clear();
            ((C1915q) this.f28611e.f5600c).m5597a();
        } else {
            ((C1903e) this.f28612f.f5598a).clear();
            ((SparseArray) this.f28612f.f5599b).clear();
            ((C1915q) this.f28612f.f5600c).m5597a();
        }
    }

    @Override // 
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC5857r clone() {
        try {
            AbstractC5857r abstractC5857r = (AbstractC5857r) super.clone();
            abstractC5857r.f28622r = new ArrayList();
            abstractC5857r.f28611e = new C0919n(8);
            abstractC5857r.f28612f = new C0919n(8);
            abstractC5857r.f28615j = null;
            abstractC5857r.f28616k = null;
            return abstractC5857r;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public Animator mo11429m(ViewGroup viewGroup, C5864y c5864y, C5864y c5864y2) {
        return null;
    }

    /* renamed from: n */
    public void mo11455n(ViewGroup viewGroup, C0919n c0919n, C0919n c0919n2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorMo11429m;
        int i10;
        int i11;
        View view;
        C5864y c5864y;
        Animator animator;
        C5864y c5864y2;
        C1903e c1903eM11437q = m11437q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            C5864y c5864y3 = (C5864y) arrayList.get(i12);
            C5864y c5864y4 = (C5864y) arrayList2.get(i12);
            if (c5864y3 != null && !c5864y3.f28642c.contains(this)) {
                c5864y3 = null;
            }
            if (c5864y4 != null && !c5864y4.f28642c.contains(this)) {
                c5864y4 = null;
            }
            if (!(c5864y3 == null && c5864y4 == null) && ((c5864y3 == null || c5864y4 == null || mo11434t(c5864y3, c5864y4)) && (animatorMo11429m = mo11429m(viewGroup, c5864y3, c5864y4)) != null)) {
                String str = this.f28607a;
                if (c5864y4 != null) {
                    view = c5864y4.f28641b;
                    String[] strArrMo11430r = mo11430r();
                    if (strArrMo11430r != null && strArrMo11430r.length > 0) {
                        c5864y2 = new C5864y(view);
                        C5864y c5864y5 = (C5864y) ((C1903e) c0919n2.f5598a).get(view);
                        i10 = size;
                        if (c5864y5 != null) {
                            int i13 = 0;
                            while (i13 < strArrMo11430r.length) {
                                String str2 = strArrMo11430r[i13];
                                c5864y2.f28640a.put(str2, c5864y5.f28640a.get(str2));
                                i13++;
                                i12 = i12;
                                c5864y5 = c5864y5;
                            }
                        }
                        i11 = i12;
                        int i14 = c1903eM11437q.f9065c;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= i14) {
                                animator = animatorMo11429m;
                                break;
                            }
                            C5855p c5855p = (C5855p) c1903eM11437q.get((Animator) c1903eM11437q.m5634j(i15));
                            if (c5855p.f28601c != null && c5855p.f28599a == view && c5855p.f28600b.equals(str) && c5855p.f28601c.equals(c5864y2)) {
                                animator = null;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        i10 = size;
                        i11 = i12;
                        animator = animatorMo11429m;
                        c5864y2 = null;
                    }
                    animatorMo11429m = animator;
                    c5864y = c5864y2;
                } else {
                    i10 = size;
                    i11 = i12;
                    view = c5864y3.f28641b;
                    c5864y = null;
                }
                if (animatorMo11429m != null) {
                    b0 b0Var = AbstractC5865z.f28643a;
                    g0 g0Var = new g0(viewGroup);
                    C5855p c5855p2 = new C5855p();
                    c5855p2.f28599a = view;
                    c5855p2.f28600b = str;
                    c5855p2.f28601c = c5864y;
                    c5855p2.f28602d = g0Var;
                    c5855p2.f28603e = this;
                    c1903eM11437q.put(animatorMo11429m, c5855p2);
                    this.f28622r.add(animatorMo11429m);
                }
            } else {
                i10 = size;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator2 = (Animator) this.f28622r.get(sparseIntArray.keyAt(i16));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i16) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: o */
    public final void m11456o() {
        int i10 = this.f28618m - 1;
        this.f28618m = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f28621q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f28621q.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((InterfaceC5856q) arrayList2.get(i11)).mo11422e(this);
                }
            }
            for (int i12 = 0; i12 < ((C1915q) this.f28611e.f5600c).m5603g(); i12++) {
                View view = (View) ((C1915q) this.f28611e.f5600c).m5604i(i12);
                if (view != null) {
                    Field field = v0.f5527a;
                    view.setHasTransientState(false);
                }
            }
            for (int i13 = 0; i13 < ((C1915q) this.f28612f.f5600c).m5603g(); i13++) {
                View view2 = (View) ((C1915q) this.f28612f.f5600c).m5604i(i13);
                if (view2 != null) {
                    Field field2 = v0.f5527a;
                    view2.setHasTransientState(false);
                }
            }
            this.f28620p = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f28616k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f28615j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p8.C5864y) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p8.C5864y m11457p(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            p8.w r0 = r4.f28613g
            if (r0 == 0) goto L9
            p8.y r5 = r0.m11457p(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f28615j
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f28616k
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            p8.y r3 = (p8.C5864y) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f28641b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.f28616k
            goto L35
        L33:
            java.util.ArrayList r5 = r4.f28615j
        L35:
            java.lang.Object r5 = r5.get(r2)
            p8.y r5 = (p8.C5864y) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.AbstractC5857r.m11457p(android.view.View, boolean):p8.y");
    }

    /* renamed from: r */
    public String[] mo11430r() {
        return null;
    }

    /* renamed from: s */
    public final C5864y m11458s(View view, boolean z6) {
        C5862w c5862w = this.f28613g;
        if (c5862w != null) {
            return c5862w.m11458s(view, z6);
        }
        return (C5864y) ((C1903e) (z6 ? this.f28611e : this.f28612f).f5598a).get(view);
    }

    /* renamed from: t */
    public boolean mo11434t(C5864y c5864y, C5864y c5864y2) {
        if (c5864y != null && c5864y2 != null) {
            String[] strArrMo11430r = mo11430r();
            if (strArrMo11430r != null) {
                for (String str : strArrMo11430r) {
                    if (m11438w(c5864y, c5864y2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c5864y.f28640a.keySet().iterator();
                while (it.hasNext()) {
                    if (m11438w(c5864y, c5864y2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return mo11447I("");
    }

    /* renamed from: v */
    public final boolean m11459v(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f28609c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f28610d;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }

    /* renamed from: x */
    public void mo11460x(View view) {
        if (this.f28620p) {
            return;
        }
        ArrayList arrayList = this.f28617l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f28621q;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f28621q.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((InterfaceC5856q) arrayList3.get(i10)).mo11420a();
            }
        }
        this.f28619n = true;
    }

    /* renamed from: y */
    public void m11461y(InterfaceC5856q interfaceC5856q) {
        ArrayList arrayList = this.f28621q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC5856q);
        if (this.f28621q.size() == 0) {
            this.f28621q = null;
        }
    }

    /* renamed from: z */
    public void mo11462z(View view) {
        this.f28610d.remove(view);
    }

    /* renamed from: D */
    public void mo11442D() {
    }

    /* renamed from: F */
    public void mo11444F() {
    }

    /* renamed from: f */
    public void mo11451f(C5864y c5864y) {
    }
}
