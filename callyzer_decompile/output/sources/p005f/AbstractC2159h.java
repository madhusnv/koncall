package p005f;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import d7.q0;
import og.gg;
import p004e.AbstractActivityC1878m;
import s2.C6734c;
import w3.j1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.h */
/* loaded from: classes.dex */
public abstract class AbstractC2159h {

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f10016a = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: a */
    public static void m5821a(AbstractActivityC1878m abstractActivityC1878m, C6734c c6734c) {
        View childAt = ((ViewGroup) abstractActivityC1878m.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        j1 j1Var = childAt instanceof j1 ? (j1) childAt : null;
        if (j1Var != null) {
            j1Var.setParentCompositionContext(null);
            j1Var.setContent(c6734c);
            return;
        }
        j1 j1Var2 = new j1(abstractActivityC1878m);
        j1Var2.setParentCompositionContext(null);
        j1Var2.setContent(c6734c);
        View decorView = abstractActivityC1878m.getWindow().getDecorView();
        if (q0.m5337d(decorView) == null) {
            q0.m5341h(decorView, abstractActivityC1878m);
        }
        if (q0.m5338e(decorView) == null) {
            q0.m5342i(decorView, abstractActivityC1878m);
        }
        if (gg.m10674a(decorView) == null) {
            gg.m10676c(decorView, abstractActivityC1878m);
        }
        abstractActivityC1878m.setContentView(j1Var2, f10016a);
    }
}
