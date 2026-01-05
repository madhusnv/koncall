package p001o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.transition.C2522a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class vi7 {

    /* renamed from: a */
    public static final vi7 f50410a;

    /* renamed from: b */
    public static final xi7 f50411b;

    /* renamed from: c */
    public static final xi7 f50412c;

    static {
        vi7 vi7Var = new vi7();
        f50410a = vi7Var;
        f50411b = new wi7();
        f50412c = vi7Var.m52852b();
    }

    /* renamed from: a */
    public static final void m52849a(Fragment fragment, Fragment fragment2, boolean z, vo0 vo0Var, boolean z2) {
        sq8.m48649h(fragment, "inFragment");
        sq8.m48649h(fragment2, "outFragment");
        sq8.m48649h(vo0Var, "sharedElements");
        if (z) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    /* renamed from: c */
    public static final void m52850c(vo0 vo0Var, vo0 vo0Var2) {
        sq8.m48649h(vo0Var, "<this>");
        sq8.m48649h(vo0Var2, "namedViews");
        int size = vo0Var.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!vo0Var2.containsKey((String) vo0Var.m36228o(size))) {
                vo0Var.mo32670k(size);
            }
        }
    }

    /* renamed from: d */
    public static final void m52851d(List list, int i) {
        sq8.m48649h(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    /* renamed from: b */
    public final xi7 m52852b() {
        try {
            sq8.m48647f(C2522a.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (xi7) C2522a.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
