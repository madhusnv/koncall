package p001o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import p001o.r9j;

/* loaded from: classes3.dex */
public abstract class xzi {

    /* renamed from: o.xzi$a */
    public class C18284a implements InterfaceC18287d {

        /* renamed from: a */
        public final /* synthetic */ boolean f54652a;

        /* renamed from: b */
        public final /* synthetic */ boolean f54653b;

        /* renamed from: c */
        public final /* synthetic */ boolean f54654c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC18287d f54655d;

        public C18284a(boolean z, boolean z2, boolean z3, InterfaceC18287d interfaceC18287d) {
            this.f54652a = z;
            this.f54653b = z2;
            this.f54654c = z3;
            this.f54655d = interfaceC18287d;
        }

        @Override // p001o.xzi.InterfaceC18287d
        /* renamed from: a */
        public r9j mo14146a(View view, r9j r9jVar, C18288e c18288e) {
            if (this.f54652a) {
                c18288e.f54661d += r9jVar.m46394i();
            }
            boolean zM57079o = xzi.m57079o(view);
            if (this.f54653b) {
                if (zM57079o) {
                    c18288e.f54660c += r9jVar.m46395j();
                } else {
                    c18288e.f54658a += r9jVar.m46395j();
                }
            }
            if (this.f54654c) {
                if (zM57079o) {
                    c18288e.f54658a += r9jVar.m46396k();
                } else {
                    c18288e.f54660c += r9jVar.m46396k();
                }
            }
            c18288e.m57085a(view);
            InterfaceC18287d interfaceC18287d = this.f54655d;
            return interfaceC18287d != null ? interfaceC18287d.mo14146a(view, r9jVar, c18288e) : r9jVar;
        }
    }

    /* renamed from: o.xzi$b */
    public class C18285b implements cbc {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC18287d f54656a;

        /* renamed from: b */
        public final /* synthetic */ C18288e f54657b;

        public C18285b(InterfaceC18287d interfaceC18287d, C18288e c18288e) {
            this.f54656a = interfaceC18287d;
            this.f54657b = c18288e;
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            return this.f54656a.mo14146a(view, r9jVar, new C18288e(this.f54657b));
        }
    }

    /* renamed from: o.xzi$c */
    public class ViewOnAttachStateChangeListenerC18286c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: o.xzi$d */
    public interface InterfaceC18287d {
        /* renamed from: a */
        r9j mo14146a(View view, r9j r9jVar, C18288e c18288e);
    }

    /* renamed from: b */
    public static Rect m57066b(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    /* renamed from: c */
    public static Rect m57067c(View view) {
        return m57068d(view, 0);
    }

    /* renamed from: d */
    public static Rect m57068d(View view, int i) {
        return new Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    /* renamed from: e */
    public static void m57069e(View view, AttributeSet attributeSet, int i, int i2, InterfaceC18287d interfaceC18287d) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, ebe.Insets, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(ebe.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(ebe.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(ebe.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        m57070f(view, new C18284a(z, z2, z3, interfaceC18287d));
    }

    /* renamed from: f */
    public static void m57070f(View view, InterfaceC18287d interfaceC18287d) {
        wvi.x0(view, new C18285b(interfaceC18287d, new C18288e(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        m57082r(view);
    }

    /* renamed from: g */
    public static float m57071g(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: h */
    public static Integer m57072h(View view) {
        ColorStateList colorStateListM56948g = xy5.m56948g(view.getBackground());
        if (colorStateListM56948g != null) {
            return Integer.valueOf(colorStateListM56948g.getDefaultColor());
        }
        return null;
    }

    /* renamed from: i */
    public static ViewGroup m57073i(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: j */
    public static wxi m57074j(View view) {
        return m57076l(m57073i(view));
    }

    /* renamed from: k */
    public static InputMethodManager m57075k(View view) {
        return (InputMethodManager) c64.getSystemService(view.getContext(), InputMethodManager.class);
    }

    /* renamed from: l */
    public static wxi m57076l(View view) {
        if (view == null) {
            return null;
        }
        return new vxi(view);
    }

    /* renamed from: m */
    public static float m57077m(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    /* renamed from: n */
    public static void m57078n(View view, boolean z) {
        oaj oajVarM55098K;
        if (z && (oajVarM55098K = wvi.m55098K(view)) != null) {
            oajVarM55098K.m41886a(r9j.C16576m.m46446b());
            return;
        }
        InputMethodManager inputMethodManagerM57075k = m57075k(view);
        if (inputMethodManagerM57075k != null) {
            inputMethodManagerM57075k.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: o */
    public static boolean m57079o(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: q */
    public static PorterDuff.Mode m57081q(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: r */
    public static void m57082r(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC18286c());
        }
    }

    /* renamed from: s */
    public static void m57083s(final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: o.wzi
            @Override // java.lang.Runnable
            public final void run() {
                xzi.m57084t(view, z);
            }
        });
    }

    /* renamed from: t */
    public static void m57084t(View view, boolean z) {
        oaj oajVarM55098K;
        if (!z || (oajVarM55098K = wvi.m55098K(view)) == null) {
            m57075k(view).showSoftInput(view, 1);
        } else {
            oajVarM55098K.m41891f(r9j.C16576m.m46446b());
        }
    }

    /* renamed from: o.xzi$e */
    public static class C18288e {

        /* renamed from: a */
        public int f54658a;

        /* renamed from: b */
        public int f54659b;

        /* renamed from: c */
        public int f54660c;

        /* renamed from: d */
        public int f54661d;

        public C18288e(int i, int i2, int i3, int i4) {
            this.f54658a = i;
            this.f54659b = i2;
            this.f54660c = i3;
            this.f54661d = i4;
        }

        /* renamed from: a */
        public void m57085a(View view) {
            view.setPaddingRelative(this.f54658a, this.f54659b, this.f54660c, this.f54661d);
        }

        public C18288e(C18288e c18288e) {
            this.f54658a = c18288e.f54658a;
            this.f54659b = c18288e.f54659b;
            this.f54660c = c18288e.f54660c;
            this.f54661d = c18288e.f54661d;
        }
    }
}
