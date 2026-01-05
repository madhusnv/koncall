package p001o;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes2.dex */
public abstract class zxi {

    /* renamed from: o.zxi$a */
    public static class C18726a {
        /* renamed from: a */
        public static boolean m60074a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        /* renamed from: b */
        public static boolean m60075b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        /* renamed from: c */
        public static void m60076c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        /* renamed from: d */
        public static void m60077d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        /* renamed from: e */
        public static void m60078e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        /* renamed from: f */
        public static boolean m60079f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        /* renamed from: g */
        public static void m60080g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static boolean m60067a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return C18726a.m60074a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedFling");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m60068b(ViewParent viewParent, View view, float f, float f2) {
        try {
            return C18726a.m60075b(viewParent, view, f, f2);
        } catch (AbstractMethodError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedPreFling");
            return false;
        }
    }

    /* renamed from: c */
    public static void m60069c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof ftb) {
            ((ftb) viewParent).mo4129i(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                C18726a.m60076c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreScroll");
            }
        }
    }

    /* renamed from: d */
    public static void m60070d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof gtb) {
            ((gtb) viewParent).mo4131k(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof ftb) {
            ((ftb) viewParent).mo4132l(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                C18726a.m60077d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScroll");
            }
        }
    }

    /* renamed from: e */
    public static void m60071e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ftb) {
            ((ftb) viewParent).mo4127g(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                C18726a.m60078e(viewParent, view, view2, i);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScrollAccepted");
            }
        }
    }

    /* renamed from: f */
    public static boolean m60072f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ftb) {
            return ((ftb) viewParent).mo4133m(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C18726a.m60079f(viewParent, view, view2, i);
        } catch (AbstractMethodError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onStartNestedScroll");
            return false;
        }
    }

    /* renamed from: g */
    public static void m60073g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof ftb) {
            ((ftb) viewParent).mo4128h(view, i);
            return;
        }
        if (i == 0) {
            try {
                C18726a.m60080g(viewParent, view);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStopNestedScroll");
            }
        }
    }
}
