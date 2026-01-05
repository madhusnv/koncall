package p8;

import android.view.ViewGroup;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import e1.C1903e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.v */
/* loaded from: classes.dex */
public abstract class AbstractC5861v {

    /* renamed from: a */
    public static final C5840a f28629a;

    /* renamed from: b */
    public static final ThreadLocal f28630b;

    /* renamed from: c */
    public static final ArrayList f28631c;

    static {
        C5840a c5840a = new C5840a();
        c5840a.f28636z = false;
        c5840a.m11465J(new C5849j(2));
        c5840a.m11465J(new C5846g());
        c5840a.m11465J(new C5849j(1));
        f28629a = c5840a;
        f28630b = new ThreadLocal();
        f28631c = new ArrayList();
    }

    /* renamed from: a */
    public static void m11463a(ViewGroup viewGroup, AbstractC5857r abstractC5857r) {
        ArrayList arrayList = f28631c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        Field field = v0.f5527a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (abstractC5857r == null) {
                abstractC5857r = f28629a;
            }
            AbstractC5857r abstractC5857rClone = abstractC5857r.clone();
            ArrayList arrayList2 = (ArrayList) m11464b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((AbstractC5857r) obj).mo11460x(viewGroup);
                }
            }
            if (abstractC5857rClone != null) {
                abstractC5857rClone.m11452i(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (abstractC5857rClone != null) {
                ViewTreeObserverOnPreDrawListenerC5860u viewTreeObserverOnPreDrawListenerC5860u = new ViewTreeObserverOnPreDrawListenerC5860u();
                viewTreeObserverOnPreDrawListenerC5860u.f28627a = abstractC5857rClone;
                viewTreeObserverOnPreDrawListenerC5860u.f28628b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC5860u);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC5860u);
            }
        }
    }

    /* renamed from: b */
    public static C1903e m11464b() {
        C1903e c1903e;
        ThreadLocal threadLocal = f28630b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1903e = (C1903e) weakReference.get()) != null) {
            return c1903e;
        }
        C1903e c1903e2 = new C1903e(0);
        threadLocal.set(new WeakReference(c1903e2));
        return c1903e2;
    }
}
