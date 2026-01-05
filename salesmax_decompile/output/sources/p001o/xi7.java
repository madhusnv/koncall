package p001o;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class xi7 {

    /* renamed from: o.xi7$a */
    public class RunnableC18163a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f53803a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f53804b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f53805c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f53806d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f53807e;

        public RunnableC18163a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f53803a = i;
            this.f53804b = arrayList;
            this.f53805c = arrayList2;
            this.f53806d = arrayList3;
            this.f53807e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f53803a; i++) {
                wvi.C0((View) this.f53804b.get(i), (String) this.f53805c.get(i));
                wvi.C0((View) this.f53806d.get(i), (String) this.f53807e.get(i));
            }
        }
    }

    /* renamed from: f */
    public static void m56328f(List list, View view) {
        int size = list.size();
        if (m56329i(list, view, size)) {
            return;
        }
        if (wvi.m55096I(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m56329i(list, childAt, size) && wvi.m55096I(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public static boolean m56329i(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m56330l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo9921A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: B */
    public abstract Object mo9922B(Object obj);

    /* renamed from: a */
    public abstract void mo9924a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo9925b(Object obj, ArrayList arrayList);

    /* renamed from: c */
    public void mo9926c(Object obj) {
    }

    /* renamed from: d */
    public void mo9927d(Object obj, Runnable runnable) {
    }

    /* renamed from: e */
    public abstract void mo9928e(ViewGroup viewGroup, Object obj);

    /* renamed from: g */
    public abstract boolean mo9929g(Object obj);

    /* renamed from: h */
    public abstract Object mo9930h(Object obj);

    /* renamed from: j */
    public Object mo9931j(ViewGroup viewGroup, Object obj) {
        return null;
    }

    /* renamed from: k */
    public void m56331k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract boolean mo9932m();

    /* renamed from: n */
    public abstract boolean mo9933n(Object obj);

    /* renamed from: o */
    public abstract Object mo9934o(Object obj, Object obj2, Object obj3);

    /* renamed from: p */
    public abstract Object mo9935p(Object obj, Object obj2, Object obj3);

    /* renamed from: q */
    public ArrayList m56332q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(wvi.m55096I(view));
            wvi.C0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: r */
    public abstract void mo9936r(Object obj, View view, ArrayList arrayList);

    /* renamed from: s */
    public abstract void mo9937s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    /* renamed from: t */
    public void mo9938t(Object obj, float f) {
    }

    /* renamed from: u */
    public abstract void mo9939u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo9940v(Object obj, View view);

    /* renamed from: w */
    public abstract void mo9941w(Fragment fragment, Object obj, ec2 ec2Var, Runnable runnable);

    /* renamed from: x */
    public void mo9942x(Fragment fragment, Object obj, ec2 ec2Var, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    /* renamed from: y */
    public void m56333y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String strM55096I = wvi.m55096I(view2);
            arrayList4.add(strM55096I);
            if (strM55096I != null) {
                wvi.C0(view2, null);
                String str = (String) map.get(strM55096I);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        wvi.C0((View) arrayList2.get(i2), strM55096I);
                        break;
                    }
                    i2++;
                }
            }
        }
        pcc.m43344a(view, new RunnableC18163a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo9943z(Object obj, View view, ArrayList arrayList);
}
