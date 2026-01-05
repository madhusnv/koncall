package p001o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes6.dex */
public final class b05 {

    /* renamed from: a */
    public final a05 f15420a;

    /* renamed from: b */
    public View f15421b;

    /* renamed from: c */
    public dwi f15422c;

    /* renamed from: d */
    public Object f15423d;

    /* renamed from: o.b05$a */
    public /* synthetic */ class C12276a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15424a;

        static {
            int[] iArr = new int[e05.values().length];
            try {
                iArr[e05.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e05.Rectangle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e05.SeventhWidth.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e05.FreeForm.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15424a = iArr;
        }
    }

    public b05(a05 a05Var) {
        sq8.m48649h(a05Var, "config");
        this.f15420a = a05Var;
    }

    /* renamed from: a */
    public final void m18073a(Object obj) {
        this.f15423d = obj;
        dwi dwiVar = null;
        if (this.f15422c == null) {
            uh1 uh1VarM16286a = this.f15420a.m16286a();
            View view = this.f15421b;
            if (view == null) {
                sq8.m48667z("dayView");
                view = null;
            }
            this.f15422c = uh1VarM16286a.mo3086a(view);
        }
        int iM41012a = nri.m41012a(c05.m19998c(obj));
        View view2 = this.f15421b;
        if (view2 == null) {
            sq8.m48667z("dayView");
            view2 = null;
        }
        if (!sq8.m48644c(view2.getTag(), Integer.valueOf(iM41012a))) {
            View view3 = this.f15421b;
            if (view3 == null) {
                sq8.m48667z("dayView");
                view3 = null;
            }
            view3.setTag(Integer.valueOf(iM41012a));
        }
        uh1 uh1VarM16286a2 = this.f15420a.m16286a();
        dwi dwiVar2 = this.f15422c;
        if (dwiVar2 == null) {
            sq8.m48667z("viewContainer");
        } else {
            dwiVar = dwiVar2;
        }
        uh1VarM16286a2.mo3087b(dwiVar, obj);
    }

    /* renamed from: b */
    public final View m18074b(LinearLayout linearLayout) {
        sq8.m48649h(linearLayout, "parent");
        View viewM17653b = aq6.m17653b(linearLayout, this.f15420a.m16288c(), false, 2, null);
        this.f15421b = viewM17653b;
        ViewGroup.LayoutParams layoutParams = viewM17653b.getLayoutParams();
        sq8.m48648g(layoutParams, "layoutParams");
        LinearLayout.LayoutParams layoutParamsM19996a = c05.m19996a(layoutParams);
        layoutParamsM19996a.weight = 1.0f;
        int i = C12276a.f15424a[this.f15420a.m16287b().ordinal()];
        if (i == 1 || i == 2) {
            layoutParamsM19996a.width = -1;
            layoutParamsM19996a.height = -1;
        } else if (i == 3) {
            layoutParamsM19996a.width = -1;
        }
        viewM17653b.setLayoutParams(layoutParamsM19996a);
        return viewM17653b;
    }

    /* renamed from: c */
    public final boolean m18075c(Object obj) {
        if (!sq8.m48644c(obj, this.f15423d)) {
            return false;
        }
        m18073a(obj);
        return true;
    }
}
