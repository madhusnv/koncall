package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import x5.C8305a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c2 {
    /* renamed from: d */
    public static void m1122d(View view, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10) == view) {
                return;
            }
        }
        Field field = c6.v0.f5527a;
        if (c6.n0.m2454f(view) != null) {
            list.add(view);
        }
        for (int i11 = size; i11 < list.size(); i11++) {
            View view2 = (View) list.get(i11);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (list.get(i13) == childAt) {
                                break;
                            } else {
                                i13++;
                            }
                        } else if (c6.n0.m2454f(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static void m1123g(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, view.getWidth(), view.getHeight());
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

    /* renamed from: h */
    public static boolean m1124h(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo1097a(View view, Object obj);

    /* renamed from: b */
    public abstract void mo1098b(Object obj, ArrayList arrayList);

    /* renamed from: c */
    public abstract void mo1099c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo1100e(Object obj);

    /* renamed from: f */
    public abstract Object mo1101f(Object obj);

    /* renamed from: i */
    public void mo1102i() {
        j1.m1152K(4);
    }

    /* renamed from: j */
    public abstract Object mo1103j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo1104k(Object obj, Object obj2);

    /* renamed from: l */
    public abstract void mo1105l(Object obj, View view, ArrayList arrayList);

    /* renamed from: m */
    public abstract void mo1106m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* renamed from: n */
    public abstract void mo1107n(View view, Object obj);

    /* renamed from: o */
    public abstract void mo1108o(Object obj, Rect rect);

    /* renamed from: p */
    public abstract void mo1109p(Object obj, C8305a c8305a, Runnable runnable);

    /* renamed from: q */
    public abstract void mo1110q(Object obj, View view, ArrayList arrayList);

    /* renamed from: r */
    public abstract void mo1111r(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: s */
    public abstract Object mo1112s(Object obj);
}
