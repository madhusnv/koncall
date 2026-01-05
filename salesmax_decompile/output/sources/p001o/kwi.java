package p001o;

import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class kwi {

    /* renamed from: o.kwi$a */
    public static class C14930a {
        /* renamed from: a */
        public static int m36271a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        public static boolean m36272b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        public static void m36273c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m36270a(ViewGroup viewGroup) {
        return C14930a.m36272b(viewGroup);
    }
}
