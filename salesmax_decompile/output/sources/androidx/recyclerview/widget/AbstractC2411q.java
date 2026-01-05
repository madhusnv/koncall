package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes2.dex */
public abstract class AbstractC2411q {
    /* renamed from: a */
    public static int m9662a(RecyclerView.C2389z c2389z, AbstractC2408n abstractC2408n, View view, View view2, RecyclerView.AbstractC2379p abstractC2379p, boolean z) {
        if (abstractC2379p.m9241Z() == 0 || c2389z.m9344b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC2379p.s0(view) - abstractC2379p.s0(view2)) + 1;
        }
        return Math.min(abstractC2408n.mo9638o(), abstractC2408n.mo9627d(view2) - abstractC2408n.mo9630g(view));
    }

    /* renamed from: b */
    public static int m9663b(RecyclerView.C2389z c2389z, AbstractC2408n abstractC2408n, View view, View view2, RecyclerView.AbstractC2379p abstractC2379p, boolean z, boolean z2) {
        if (abstractC2379p.m9241Z() == 0 || c2389z.m9344b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c2389z.m9344b() - Math.max(abstractC2379p.s0(view), abstractC2379p.s0(view2))) - 1) : Math.max(0, Math.min(abstractC2379p.s0(view), abstractC2379p.s0(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC2408n.mo9627d(view2) - abstractC2408n.mo9630g(view)) / (Math.abs(abstractC2379p.s0(view) - abstractC2379p.s0(view2)) + 1))) + (abstractC2408n.mo9637n() - abstractC2408n.mo9630g(view)));
        }
        return iMax;
    }

    /* renamed from: c */
    public static int m9664c(RecyclerView.C2389z c2389z, AbstractC2408n abstractC2408n, View view, View view2, RecyclerView.AbstractC2379p abstractC2379p, boolean z) {
        if (abstractC2379p.m9241Z() == 0 || c2389z.m9344b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c2389z.m9344b();
        }
        return (int) (((abstractC2408n.mo9627d(view2) - abstractC2408n.mo9630g(view)) / (Math.abs(abstractC2379p.s0(view) - abstractC2379p.s0(view2)) + 1)) * c2389z.m9344b());
    }
}
