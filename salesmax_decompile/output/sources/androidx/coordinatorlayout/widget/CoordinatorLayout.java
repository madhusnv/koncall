package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.perf.util.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001o.b6e;
import p001o.c64;
import p001o.cbc;
import p001o.dv7;
import p001o.ftb;
import p001o.fy5;
import p001o.ged;
import p001o.gtb;
import p001o.htb;
import p001o.kae;
import p001o.ked;
import p001o.mt5;
import p001o.nbe;
import p001o.nwi;
import p001o.r9j;
import p001o.s6c;
import p001o.wvi;

/* loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements ftb, gtb {
    public static final String l0;
    public static final Class[] m0;
    public static final ThreadLocal n0;
    public static final Comparator o0;
    public static final ged p0;

    /* renamed from: H */
    public ViewTreeObserverOnPreDrawListenerC2013f f7076H;

    /* renamed from: L */
    public boolean f7077L;

    /* renamed from: M */
    public r9j f7078M;

    /* renamed from: Q */
    public boolean f7079Q;

    /* renamed from: a */
    public final List f7080a;

    /* renamed from: b */
    public final mt5 f7081b;

    /* renamed from: c */
    public final List f7082c;

    /* renamed from: d */
    public final List f7083d;

    /* renamed from: e */
    public Paint f7084e;

    /* renamed from: f */
    public final int[] f7085f;

    /* renamed from: g */
    public final int[] f7086g;

    /* renamed from: h */
    public boolean f7087h;
    public Drawable h0;
    public ViewGroup.OnHierarchyChangeListener i0;
    public cbc j0;
    public final htb k0;

    /* renamed from: q */
    public boolean f7088q;

    /* renamed from: s */
    public int[] f7089s;

    /* renamed from: x */
    public View f7090x;

    /* renamed from: y */
    public View f7091y;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        /* renamed from: A */
        public boolean mo5760A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: B */
        public void mo5761B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        /* renamed from: C */
        public Parcelable mo5762C(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: D */
        public boolean m5763D(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            return false;
        }

        /* renamed from: E */
        public boolean mo5764E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                return m5763D(coordinatorLayout, view, view2, view3, i);
            }
            return false;
        }

        /* renamed from: F */
        public void m5765F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* renamed from: G */
        public void mo5766G(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            if (i == 0) {
                m5765F(coordinatorLayout, view, view2);
            }
        }

        /* renamed from: H */
        public boolean mo5767H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public boolean m5768e(CoordinatorLayout coordinatorLayout, View view) {
            return m5771h(coordinatorLayout, view) > 0.0f;
        }

        /* renamed from: f */
        public boolean mo5769f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        /* renamed from: g */
        public int m5770g(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        /* renamed from: h */
        public float m5771h(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        /* renamed from: i */
        public boolean mo5772i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* renamed from: j */
        public r9j m5773j(CoordinatorLayout coordinatorLayout, View view, r9j r9jVar) {
            return r9jVar;
        }

        /* renamed from: k */
        public void mo5774k(C2012e c2012e) {
        }

        /* renamed from: l */
        public boolean mo5775l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* renamed from: m */
        public void mo5776m(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* renamed from: n */
        public void mo5777n() {
        }

        /* renamed from: o */
        public boolean mo5778o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: p */
        public boolean mo5779p(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        /* renamed from: q */
        public boolean mo5780q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: r */
        public boolean m5781r(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: s */
        public boolean mo5782s(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return false;
        }

        /* renamed from: t */
        public void m5783t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        }

        /* renamed from: u */
        public void mo5784u(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m5783t(coordinatorLayout, view, view2, i, i2, iArr);
            }
        }

        /* renamed from: v */
        public void m5785v(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        }

        /* renamed from: w */
        public void m5786w(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                m5785v(coordinatorLayout, view, view2, i, i2, i3, i4);
            }
        }

        /* renamed from: x */
        public void mo5787x(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            m5786w(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
        }

        /* renamed from: y */
        public void m5788y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        }

        /* renamed from: z */
        public void m5789z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                m5788y(coordinatorLayout, view, view2, view3, i);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C2008a implements cbc {
        public C2008a() {
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            return CoordinatorLayout.this.a0(r9jVar);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC2009b {
        Behavior getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public @interface InterfaceC2010c {
        Class value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public class ViewGroupOnHierarchyChangeListenerC2011d implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC2011d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.i0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m5736L(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.i0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public class ViewTreeObserverOnPreDrawListenerC2013f implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC2013f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m5736L(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public static class C2014g implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM55100M = wvi.m55100M(view);
            float fM55100M2 = wvi.m55100M(view2);
            if (fM55100M > fM55100M2) {
                return -1;
            }
            return fM55100M < fM55100M2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        l0 = r0 != null ? r0.getName() : null;
        o0 = new C2014g();
        m0 = new Class[]{Context.class, AttributeSet.class};
        n0 = new ThreadLocal();
        p0 = new ked(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* renamed from: O */
    public static Behavior m5718O(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = l0;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = n0;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(m0);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: S */
    public static void m5719S(Rect rect) {
        rect.setEmpty();
        p0.mo28525a(rect);
    }

    /* renamed from: V */
    public static int m5720V(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: W */
    public static int m5721W(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: X */
    public static int m5722X(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    public static Rect m5723e() {
        Rect rect = (Rect) p0.mo28526b();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: j */
    public static int m5724j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: A */
    public final int m5725A(int i) {
        int[] iArr = this.f7089s;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Keyline index ");
        sb2.append(i);
        sb2.append(" out of range for ");
        sb2.append(this);
        return 0;
    }

    /* renamed from: B */
    public void m5726B(View view, Rect rect) {
        rect.set(((C2012e) view.getLayoutParams()).m5800h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public C2012e m5727C(View view) {
        C2012e c2012e = (C2012e) view.getLayoutParams();
        if (!c2012e.f7096b) {
            if (view instanceof InterfaceC2009b) {
                c2012e.m5807o(((InterfaceC2009b) view).getBehavior());
                c2012e.f7096b = true;
            } else {
                InterfaceC2010c interfaceC2010c = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC2010c = (InterfaceC2010c) superclass.getAnnotation(InterfaceC2010c.class);
                    if (interfaceC2010c != null) {
                        break;
                    }
                }
                if (interfaceC2010c != null) {
                    try {
                        c2012e.m5807o((Behavior) interfaceC2010c.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(interfaceC2010c.value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                    }
                }
                c2012e.f7096b = true;
            }
        }
        return c2012e;
    }

    /* renamed from: D */
    public final void m5728D(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator comparator = o0;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: E */
    public final boolean m5729E(View view) {
        return this.f7081b.m39643j(view);
    }

    /* renamed from: F */
    public boolean m5730F(View view, int i, int i2) {
        Rect rectM5723e = m5723e();
        m5757x(view, rectM5723e);
        try {
            return rectM5723e.contains(i, i2);
        } finally {
            m5719S(rectM5723e);
        }
    }

    /* renamed from: G */
    public final void m5731G(View view, int i) {
        C2012e c2012e = (C2012e) view.getLayoutParams();
        Rect rectM5723e = m5723e();
        rectM5723e.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2012e).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2012e).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c2012e).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c2012e).bottomMargin);
        if (this.f7078M != null && wvi.m55136w(this) && !wvi.m55136w(view)) {
            rectM5723e.left += this.f7078M.m46395j();
            rectM5723e.top += this.f7078M.m46397l();
            rectM5723e.right -= this.f7078M.m46396k();
            rectM5723e.bottom -= this.f7078M.m46394i();
        }
        Rect rectM5723e2 = m5723e();
        dv7.m23888a(m5721W(c2012e.f7097c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM5723e, rectM5723e2, i);
        view.layout(rectM5723e2.left, rectM5723e2.top, rectM5723e2.right, rectM5723e2.bottom);
        m5719S(rectM5723e);
        m5719S(rectM5723e2);
    }

    /* renamed from: H */
    public final void m5732H(View view, View view2, int i) {
        Rect rectM5723e = m5723e();
        Rect rectM5723e2 = m5723e();
        try {
            m5757x(view2, rectM5723e);
            m5758y(view, i, rectM5723e, rectM5723e2);
            view.layout(rectM5723e2.left, rectM5723e2.top, rectM5723e2.right, rectM5723e2.bottom);
        } finally {
            m5719S(rectM5723e);
            m5719S(rectM5723e2);
        }
    }

    /* renamed from: I */
    public final void m5733I(View view, int i, int i2) {
        C2012e c2012e = (C2012e) view.getLayoutParams();
        int iM23889b = dv7.m23889b(m5722X(c2012e.f7097c), i2);
        int i3 = iM23889b & 7;
        int i4 = iM23889b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iM5725A = m5725A(i) - measuredWidth;
        if (i3 == 1) {
            iM5725A += measuredWidth / 2;
        } else if (i3 == 5) {
            iM5725A += measuredWidth;
        }
        int i5 = 0;
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2012e).leftMargin, Math.min(iM5725A, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c2012e).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2012e).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c2012e).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* renamed from: J */
    public final void m5734J(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (wvi.m55105R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C2012e c2012e = (C2012e) view.getLayoutParams();
            Behavior behaviorM5798f = c2012e.m5798f();
            Rect rectM5723e = m5723e();
            Rect rectM5723e2 = m5723e();
            rectM5723e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behaviorM5798f == null || !behaviorM5798f.mo5769f(this, view, rectM5723e)) {
                rectM5723e.set(rectM5723e2);
            } else if (!rectM5723e2.contains(rectM5723e)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM5723e.toShortString() + " | Bounds:" + rectM5723e2.toShortString());
            }
            m5719S(rectM5723e2);
            if (rectM5723e.isEmpty()) {
                m5719S(rectM5723e);
                return;
            }
            int iM23889b = dv7.m23889b(c2012e.f7102h, i);
            boolean z3 = true;
            if ((iM23889b & 48) != 48 || (i6 = (rectM5723e.top - ((ViewGroup.MarginLayoutParams) c2012e).topMargin) - c2012e.f7104j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m5745Z(view, i7 - i6);
                z = true;
            }
            if ((iM23889b & 80) == 80 && (height = ((getHeight() - rectM5723e.bottom) - ((ViewGroup.MarginLayoutParams) c2012e).bottomMargin) + c2012e.f7104j) < (i5 = rect.bottom)) {
                m5745Z(view, height - i5);
                z = true;
            }
            if (!z) {
                m5745Z(view, 0);
            }
            if ((iM23889b & 3) != 3 || (i3 = (rectM5723e.left - ((ViewGroup.MarginLayoutParams) c2012e).leftMargin) - c2012e.f7103i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m5744Y(view, i4 - i3);
                z2 = true;
            }
            if ((iM23889b & 5) != 5 || (width = ((getWidth() - rectM5723e.right) - ((ViewGroup.MarginLayoutParams) c2012e).rightMargin) + c2012e.f7103i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m5744Y(view, width - i2);
            }
            if (!z3) {
                m5744Y(view, 0);
            }
            m5719S(rectM5723e);
        }
    }

    /* renamed from: K */
    public void m5735K(View view, int i) {
        Behavior behaviorM5798f;
        C2012e c2012e = (C2012e) view.getLayoutParams();
        if (c2012e.f7105k != null) {
            Rect rectM5723e = m5723e();
            Rect rectM5723e2 = m5723e();
            Rect rectM5723e3 = m5723e();
            m5757x(c2012e.f7105k, rectM5723e);
            m5754u(view, false, rectM5723e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m5759z(view, i, rectM5723e, rectM5723e3, c2012e, measuredWidth, measuredHeight);
            boolean z = (rectM5723e3.left == rectM5723e2.left && rectM5723e3.top == rectM5723e2.top) ? false : true;
            m5747n(c2012e, rectM5723e3, measuredWidth, measuredHeight);
            int i2 = rectM5723e3.left - rectM5723e2.left;
            int i3 = rectM5723e3.top - rectM5723e2.top;
            if (i2 != 0) {
                wvi.m55110W(view, i2);
            }
            if (i3 != 0) {
                wvi.m55111X(view, i3);
            }
            if (z && (behaviorM5798f = c2012e.m5798f()) != null) {
                behaviorM5798f.mo5775l(this, view, c2012e.f7105k);
            }
            m5719S(rectM5723e);
            m5719S(rectM5723e2);
            m5719S(rectM5723e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5736L(int i) {
        int i2;
        boolean zMo5775l;
        int iM55139z = wvi.m55139z(this);
        int size = this.f7080a.size();
        Rect rectM5723e = m5723e();
        Rect rectM5723e2 = m5723e();
        Rect rectM5723e3 = m5723e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f7080a.get(i3);
            C2012e c2012e = (C2012e) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (c2012e.f7106l == ((View) this.f7080a.get(i4))) {
                        m5735K(view, iM55139z);
                    }
                }
                m5754u(view, true, rectM5723e2);
                if (c2012e.f7101g != 0 && !rectM5723e2.isEmpty()) {
                    int iM23889b = dv7.m23889b(c2012e.f7101g, iM55139z);
                    int i5 = iM23889b & 112;
                    if (i5 == 48) {
                        rectM5723e.top = Math.max(rectM5723e.top, rectM5723e2.bottom);
                    } else if (i5 == 80) {
                        rectM5723e.bottom = Math.max(rectM5723e.bottom, getHeight() - rectM5723e2.top);
                    }
                    int i6 = iM23889b & 7;
                    if (i6 == 3) {
                        rectM5723e.left = Math.max(rectM5723e.left, rectM5723e2.right);
                    } else if (i6 == 5) {
                        rectM5723e.right = Math.max(rectM5723e.right, getWidth() - rectM5723e2.left);
                    }
                }
                if (c2012e.f7102h != 0 && view.getVisibility() == 0) {
                    m5734J(view, rectM5723e, iM55139z);
                }
                if (i != 2) {
                    m5726B(view, rectM5723e3);
                    if (!rectM5723e3.equals(rectM5723e2)) {
                        m5741R(view, rectM5723e2);
                        for (i2 = i3 + 1; i2 < size; i2++) {
                            View view2 = (View) this.f7080a.get(i2);
                            C2012e c2012e2 = (C2012e) view2.getLayoutParams();
                            Behavior behaviorM5798f = c2012e2.m5798f();
                            if (behaviorM5798f != null && behaviorM5798f.mo5772i(this, view2, view)) {
                                if (i == 0 && c2012e2.m5799g()) {
                                    c2012e2.m5803k();
                                } else {
                                    if (i != 2) {
                                        zMo5775l = behaviorM5798f.mo5775l(this, view2, view);
                                    } else {
                                        behaviorM5798f.mo5776m(this, view2, view);
                                        zMo5775l = true;
                                    }
                                    if (i == 1) {
                                        c2012e2.m5808p(zMo5775l);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                    }
                }
            }
        }
        m5719S(rectM5723e);
        m5719S(rectM5723e2);
        m5719S(rectM5723e3);
    }

    /* renamed from: M */
    public void m5737M(View view, int i) {
        C2012e c2012e = (C2012e) view.getLayoutParams();
        if (c2012e.m5793a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c2012e.f7105k;
        if (view2 != null) {
            m5732H(view, view2, i);
            return;
        }
        int i2 = c2012e.f7099e;
        if (i2 >= 0) {
            m5733I(view, i2, i);
        } else {
            m5731G(view, i);
        }
    }

    /* renamed from: N */
    public void m5738N(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: P */
    public final boolean m5739P(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f7082c;
        m5728D(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zMo5778o = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C2012e c2012e = (C2012e) view.getLayoutParams();
            Behavior behaviorM5798f = c2012e.m5798f();
            if (!(zMo5778o || z) || actionMasked == 0) {
                if (!zMo5778o && behaviorM5798f != null) {
                    if (i == 0) {
                        zMo5778o = behaviorM5798f.mo5778o(this, view, motionEvent);
                    } else if (i == 1) {
                        zMo5778o = behaviorM5798f.mo5767H(this, view, motionEvent);
                    }
                    if (zMo5778o) {
                        this.f7090x = view;
                    }
                }
                boolean zM5795c = c2012e.m5795c();
                boolean zM5801i = c2012e.m5801i(this, view);
                z = zM5801i && !zM5795c;
                if (zM5801i && !z) {
                    break;
                }
            } else if (behaviorM5798f != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    behaviorM5798f.mo5778o(this, view, motionEventObtain);
                } else if (i == 1) {
                    behaviorM5798f.mo5767H(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zMo5778o;
    }

    /* renamed from: Q */
    public final void m5740Q() {
        this.f7080a.clear();
        this.f7081b.m39636c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C2012e c2012eM5727C = m5727C(childAt);
            c2012eM5727C.m5796d(this, childAt);
            this.f7081b.m39635b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (c2012eM5727C.m5794b(this, childAt, childAt2)) {
                        if (!this.f7081b.m39637d(childAt2)) {
                            this.f7081b.m39635b(childAt2);
                        }
                        this.f7081b.m39634a(childAt2, childAt);
                    }
                }
            }
        }
        this.f7080a.addAll(this.f7081b.m39642i());
        Collections.reverse(this.f7080a);
    }

    /* renamed from: R */
    public void m5741R(View view, Rect rect) {
        ((C2012e) view.getLayoutParams()).m5809q(rect);
    }

    /* renamed from: T */
    public void m5742T() {
        if (this.f7088q && this.f7076H != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f7076H);
        }
        this.f7077L = false;
    }

    /* renamed from: U */
    public final void m5743U(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behaviorM5798f = ((C2012e) childAt.getLayoutParams()).m5798f();
            if (behaviorM5798f != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behaviorM5798f.mo5778o(this, childAt, motionEventObtain);
                } else {
                    behaviorM5798f.mo5767H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C2012e) getChildAt(i2).getLayoutParams()).m5805m();
        }
        this.f7090x = null;
        this.f7087h = false;
    }

    /* renamed from: Y */
    public final void m5744Y(View view, int i) {
        C2012e c2012e = (C2012e) view.getLayoutParams();
        int i2 = c2012e.f7103i;
        if (i2 != i) {
            wvi.m55110W(view, i - i2);
            c2012e.f7103i = i;
        }
    }

    /* renamed from: Z */
    public final void m5745Z(View view, int i) {
        C2012e c2012e = (C2012e) view.getLayoutParams();
        int i2 = c2012e.f7104j;
        if (i2 != i) {
            wvi.m55111X(view, i - i2);
            c2012e.f7104j = i;
        }
    }

    public final r9j a0(r9j r9jVar) {
        if (s6c.m47909a(this.f7078M, r9jVar)) {
            return r9jVar;
        }
        this.f7078M = r9jVar;
        boolean z = r9jVar != null && r9jVar.m46397l() > 0;
        this.f7079Q = z;
        setWillNotDraw(!z && getBackground() == null);
        r9j r9jVarM5748o = m5748o(r9jVar);
        requestLayout();
        return r9jVarM5748o;
    }

    public final void b0() {
        if (!wvi.m55136w(this)) {
            wvi.x0(this, null);
            return;
        }
        if (this.j0 == null) {
            this.j0 = new C2008a();
        }
        wvi.x0(this, this.j0);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2012e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C2012e c2012e = (C2012e) view.getLayoutParams();
        Behavior behavior = c2012e.f7095a;
        if (behavior != null) {
            float fM5771h = behavior.m5771h(this, view);
            if (fM5771h > 0.0f) {
                if (this.f7084e == null) {
                    this.f7084e = new Paint();
                }
                this.f7084e.setColor(c2012e.f7095a.m5770g(this, view));
                this.f7084e.setAlpha(m5724j(Math.round(fM5771h * 255.0f), 0, Constants.MAX_HOST_LENGTH));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f7084e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.h0;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void m5746f() {
        if (this.f7088q) {
            if (this.f7076H == null) {
                this.f7076H = new ViewTreeObserverOnPreDrawListenerC2013f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f7076H);
        }
        this.f7077L = true;
    }

    @Override // p001o.ftb
    /* renamed from: g */
    public void mo4127g(View view, View view2, int i, int i2) {
        Behavior behaviorM5798f;
        this.k0.m31122c(view, view2, i, i2);
        this.f7091y = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C2012e c2012e = (C2012e) childAt.getLayoutParams();
            if (c2012e.m5802j(i2) && (behaviorM5798f = c2012e.m5798f()) != null) {
                behaviorM5798f.m5789z(this, childAt, view, view2, i, i2);
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        m5740Q();
        return Collections.unmodifiableList(this.f7080a);
    }

    public final r9j getLastWindowInsets() {
        return this.f7078M;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.k0.m31120a();
    }

    public Drawable getStatusBarBackground() {
        return this.h0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // p001o.ftb
    /* renamed from: h */
    public void mo4128h(View view, int i) {
        this.k0.m31124e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C2012e c2012e = (C2012e) childAt.getLayoutParams();
            if (c2012e.m5802j(i)) {
                Behavior behaviorM5798f = c2012e.m5798f();
                if (behaviorM5798f != null) {
                    behaviorM5798f.mo5766G(this, childAt, view, i);
                }
                c2012e.m5804l(i);
                c2012e.m5803k();
            }
        }
        this.f7091y = null;
    }

    @Override // p001o.ftb
    /* renamed from: i */
    public void mo4129i(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behaviorM5798f;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C2012e c2012e = (C2012e) childAt.getLayoutParams();
                if (c2012e.m5802j(i3) && (behaviorM5798f = c2012e.m5798f()) != null) {
                    int[] iArr2 = this.f7085f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorM5798f.mo5784u(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f7085f;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f7085f;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m5736L(1);
        }
    }

    @Override // p001o.gtb
    /* renamed from: k */
    public void mo4131k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behaviorM5798f;
        boolean z;
        int iMin;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C2012e c2012e = (C2012e) childAt.getLayoutParams();
                if (c2012e.m5802j(i5) && (behaviorM5798f = c2012e.m5798f()) != null) {
                    int[] iArr2 = this.f7085f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorM5798f.mo5787x(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f7085f;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        iMin = Math.max(i6, this.f7085f[1]);
                    } else {
                        z = true;
                        iMin = Math.min(i6, this.f7085f[1]);
                    }
                    i6 = iMin;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            m5736L(1);
        }
    }

    @Override // p001o.ftb
    /* renamed from: l */
    public void mo4132l(View view, int i, int i2, int i3, int i4, int i5) {
        mo4131k(view, i, i2, i3, i4, 0, this.f7086g);
    }

    @Override // p001o.ftb
    /* renamed from: m */
    public boolean mo4133m(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C2012e c2012e = (C2012e) childAt.getLayoutParams();
                Behavior behaviorM5798f = c2012e.m5798f();
                if (behaviorM5798f != null) {
                    boolean zMo5764E = behaviorM5798f.mo5764E(this, childAt, view, view2, i, i2);
                    z |= zMo5764E;
                    c2012e.m5810r(i2, zMo5764E);
                } else {
                    c2012e.m5810r(i2, false);
                }
            }
        }
        return z;
    }

    /* renamed from: n */
    public final void m5747n(C2012e c2012e, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2012e).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c2012e).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2012e).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c2012e).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* renamed from: o */
    public final r9j m5748o(r9j r9jVar) {
        Behavior behaviorM5798f;
        if (r9jVar.m46400p()) {
            return r9jVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (wvi.m55136w(childAt) && (behaviorM5798f = ((C2012e) childAt.getLayoutParams()).m5798f()) != null) {
                r9jVar = behaviorM5798f.m5773j(this, childAt, r9jVar);
                if (r9jVar.m46400p()) {
                    break;
                }
            }
        }
        return r9jVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m5743U(false);
        if (this.f7077L) {
            if (this.f7076H == null) {
                this.f7076H = new ViewTreeObserverOnPreDrawListenerC2013f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f7076H);
        }
        if (this.f7078M == null && wvi.m55136w(this)) {
            wvi.j0(this);
        }
        this.f7088q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5743U(false);
        if (this.f7077L && this.f7076H != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f7076H);
        }
        View view = this.f7091y;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f7088q = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f7079Q || this.h0 == null) {
            return;
        }
        r9j r9jVar = this.f7078M;
        int iM46397l = r9jVar != null ? r9jVar.m46397l() : 0;
        if (iM46397l > 0) {
            this.h0.setBounds(0, 0, getWidth(), iM46397l);
            this.h0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m5743U(true);
        }
        boolean zM5739P = m5739P(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m5743U(true);
        }
        return zM5739P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behaviorM5798f;
        int iM55139z = wvi.m55139z(this);
        int size = this.f7080a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f7080a.get(i5);
            if (view.getVisibility() != 8 && ((behaviorM5798f = ((C2012e) view.getLayoutParams()).m5798f()) == null || !behaviorM5798f.mo5779p(this, view, iM55139z))) {
                m5737M(view, iM55139z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behaviorM5798f;
        C2012e c2012e;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        m5740Q();
        m5750q();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int iM55139z = wvi.m55139z(this);
        boolean z = iM55139z == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i10 = paddingLeft + paddingRight;
        int i11 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.f7078M != null && wvi.m55136w(this);
        int size3 = this.f7080a.size();
        int i12 = suggestedMinimumWidth;
        int i13 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i14 = 0;
        while (i14 < size3) {
            View view = (View) this.f7080a.get(i14);
            if (view.getVisibility() == 8) {
                i8 = i14;
                i5 = size3;
                i6 = paddingLeft;
            } else {
                C2012e c2012e2 = (C2012e) view.getLayoutParams();
                int i15 = c2012e2.f7099e;
                if (i15 < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                } else {
                    int iM5725A = m5725A(i15);
                    int iM23889b = dv7.m23889b(m5722X(c2012e2.f7097c), iM55139z) & 7;
                    i3 = iCombineMeasuredStates;
                    if ((iM23889b == 3 && !z) || (iM23889b == 5 && z)) {
                        iMax = Math.max(0, (size - paddingRight) - iM5725A);
                    } else if ((iM23889b == 5 && !z) || (iM23889b == 3 && z)) {
                        iMax = Math.max(0, iM5725A - paddingLeft);
                    }
                    if (z2 || wvi.m55136w(view)) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int iM46395j = this.f7078M.m46395j() + this.f7078M.m46396k();
                        int iM46397l = this.f7078M.m46397l() + this.f7078M.m46394i();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM46395j, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM46397l, mode2);
                    }
                    behaviorM5798f = c2012e2.m5798f();
                    if (behaviorM5798f == null) {
                        c2012e = c2012e2;
                        i7 = i3;
                        i8 = i14;
                        i4 = i13;
                        i6 = paddingLeft;
                        i9 = i12;
                        i5 = size3;
                        if (!behaviorM5798f.mo5780q(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        C2012e c2012e3 = c2012e;
                        int iMax2 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2012e3).leftMargin + ((ViewGroup.MarginLayoutParams) c2012e3).rightMargin);
                        int iMax3 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2012e3).topMargin + ((ViewGroup.MarginLayoutParams) c2012e3).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                        i12 = iMax2;
                        i13 = iMax3;
                    } else {
                        c2012e = c2012e2;
                        i4 = i13;
                        i5 = size3;
                        i6 = paddingLeft;
                        i7 = i3;
                        i8 = i14;
                        i9 = i12;
                    }
                    m5738N(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    C2012e c2012e32 = c2012e;
                    int iMax22 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2012e32).leftMargin + ((ViewGroup.MarginLayoutParams) c2012e32).rightMargin);
                    int iMax32 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2012e32).topMargin + ((ViewGroup.MarginLayoutParams) c2012e32).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                    i12 = iMax22;
                    i13 = iMax32;
                }
                iMax = 0;
                if (z2) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                    behaviorM5798f = c2012e2.m5798f();
                    if (behaviorM5798f == null) {
                    }
                    m5738N(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    C2012e c2012e322 = c2012e;
                    int iMax222 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2012e322).leftMargin + ((ViewGroup.MarginLayoutParams) c2012e322).rightMargin);
                    int iMax322 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2012e322).topMargin + ((ViewGroup.MarginLayoutParams) c2012e322).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                    i12 = iMax222;
                    i13 = iMax322;
                }
            }
            i14 = i8 + 1;
            paddingLeft = i6;
            size3 = i5;
        }
        int i16 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i12, i, (-16777216) & i16), View.resolveSizeAndState(i13, i2, i16 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior behaviorM5798f;
        int childCount = getChildCount();
        boolean zM5781r = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C2012e c2012e = (C2012e) childAt.getLayoutParams();
                if (c2012e.m5802j(0) && (behaviorM5798f = c2012e.m5798f()) != null) {
                    zM5781r |= behaviorM5798f.m5781r(this, childAt, view, f, f2, z);
                }
            }
        }
        if (zM5781r) {
            m5736L(1);
        }
        return zM5781r;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behaviorM5798f;
        int childCount = getChildCount();
        boolean zMo5782s = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C2012e c2012e = (C2012e) childAt.getLayoutParams();
                if (c2012e.m5802j(0) && (behaviorM5798f = c2012e.m5798f()) != null) {
                    zMo5782s |= behaviorM5798f.mo5782s(this, childAt, view, f, f2);
                }
            }
        }
        return zMo5782s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo4129i(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo4132l(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo4127g(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        SparseArray sparseArray = savedState.f7092c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behaviorM5798f = m5727C(childAt).m5798f();
            if (id != -1 && behaviorM5798f != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behaviorM5798f.mo5761B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableMo5762C;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behaviorM5798f = ((C2012e) childAt.getLayoutParams()).m5798f();
            if (id != -1 && behaviorM5798f != null && (parcelableMo5762C = behaviorM5798f.mo5762C(this, childAt)) != null) {
                sparseArray.append(id, parcelableMo5762C);
            }
        }
        savedState.f7092c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo4133m(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo4128h(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r3
      0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM5739P;
        boolean zMo5767H;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7090x == null) {
            zM5739P = m5739P(motionEvent, 1);
            if (!zM5739P) {
                zMo5767H = false;
            }
            motionEventObtain = null;
            if (this.f7090x != null) {
                zMo5767H |= super.onTouchEvent(motionEvent);
            } else if (zM5739P) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m5743U(false);
            }
            return zMo5767H;
        }
        zM5739P = false;
        Behavior behaviorM5798f = ((C2012e) this.f7090x.getLayoutParams()).m5798f();
        if (behaviorM5798f != null) {
            zMo5767H = behaviorM5798f.mo5767H(this, this.f7090x, motionEvent);
        }
        motionEventObtain = null;
        if (this.f7090x != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked != 1) {
            m5743U(false);
        }
        return zMo5767H;
    }

    /* renamed from: p */
    public void m5749p(View view) {
        List listM39640g = this.f7081b.m39640g(view);
        if (listM39640g == null || listM39640g.isEmpty()) {
            return;
        }
        for (int i = 0; i < listM39640g.size(); i++) {
            View view2 = (View) listM39640g.get(i);
            Behavior behaviorM5798f = ((C2012e) view2.getLayoutParams()).m5798f();
            if (behaviorM5798f != null) {
                behaviorM5798f.mo5775l(this, view2, view);
            }
        }
    }

    /* renamed from: q */
    public void m5750q() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (m5729E(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.f7077L) {
            if (z) {
                m5746f();
            } else {
                m5742T();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2012e generateDefaultLayoutParams() {
        return new C2012e(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behaviorM5798f = ((C2012e) view.getLayoutParams()).m5798f();
        if (behaviorM5798f == null || !behaviorM5798f.mo5760A(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f7087h) {
            return;
        }
        m5743U(false);
        this.f7087h = true;
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C2012e generateLayoutParams(AttributeSet attributeSet) {
        return new C2012e(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        b0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.i0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.h0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.h0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.h0.setState(getDrawableState());
                }
                fy5.m27739m(this.h0, wvi.m55139z(this));
                this.h0.setVisible(getVisibility() == 0, false);
                this.h0.setCallback(this);
            }
            wvi.d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? c64.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.h0;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.h0.setVisible(z, false);
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C2012e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2012e ? new C2012e((C2012e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2012e((ViewGroup.MarginLayoutParams) layoutParams) : new C2012e(layoutParams);
    }

    /* renamed from: u */
    public void m5754u(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m5757x(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: v */
    public List m5755v(View view) {
        List listM39641h = this.f7081b.m39641h(view);
        this.f7083d.clear();
        if (listM39641h != null) {
            this.f7083d.addAll(listM39641h);
        }
        return this.f7083d;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h0;
    }

    /* renamed from: w */
    public List m5756w(View view) {
        List listM39640g = this.f7081b.m39640g(view);
        this.f7083d.clear();
        if (listM39640g != null) {
            this.f7083d.addAll(listM39640g);
        }
        return this.f7083d;
    }

    /* renamed from: x */
    public void m5757x(View view, Rect rect) {
        nwi.m41199a(this, view, rect);
    }

    /* renamed from: y */
    public void m5758y(View view, int i, Rect rect, Rect rect2) {
        C2012e c2012e = (C2012e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m5759z(view, i, rect, rect2, c2012e, measuredWidth, measuredHeight);
        m5747n(c2012e, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: z */
    public final void m5759z(View view, int i, Rect rect, Rect rect2, C2012e c2012e, int i2, int i3) {
        int iM23889b = dv7.m23889b(m5720V(c2012e.f7097c), i);
        int iM23889b2 = dv7.m23889b(m5721W(c2012e.f7098d), i);
        int i4 = iM23889b & 7;
        int i5 = iM23889b & 112;
        int i6 = iM23889b2 & 7;
        int i7 = iM23889b2 & 112;
        int iWidth = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b6e.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.f7080a = new ArrayList();
        this.f7081b = new mt5();
        this.f7082c = new ArrayList();
        this.f7083d = new ArrayList();
        this.f7085f = new int[2];
        this.f7086g = new int[2];
        this.k0 = new htb(this);
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nbe.CoordinatorLayout, 0, kae.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nbe.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, nbe.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, kae.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, nbe.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(nbe.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f7089s = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f7089s.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f7089s[i2] = (int) (r12[i2] * f);
            }
        }
        this.h0 = typedArrayObtainStyledAttributes.getDrawable(nbe.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        b0();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2011d());
        if (wvi.m55137x(this) == 0) {
            wvi.t0(this, 1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2007a();

        /* renamed from: c */
        public SparseArray f7092c;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        public static class C2007a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f7092c = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f7092c.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f7092c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f7092c.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f7092c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public static class C2012e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public Behavior f7095a;

        /* renamed from: b */
        public boolean f7096b;

        /* renamed from: c */
        public int f7097c;

        /* renamed from: d */
        public int f7098d;

        /* renamed from: e */
        public int f7099e;

        /* renamed from: f */
        public int f7100f;

        /* renamed from: g */
        public int f7101g;

        /* renamed from: h */
        public int f7102h;

        /* renamed from: i */
        public int f7103i;

        /* renamed from: j */
        public int f7104j;

        /* renamed from: k */
        public View f7105k;

        /* renamed from: l */
        public View f7106l;

        /* renamed from: m */
        public boolean f7107m;

        /* renamed from: n */
        public boolean f7108n;

        /* renamed from: o */
        public boolean f7109o;

        /* renamed from: p */
        public boolean f7110p;

        /* renamed from: q */
        public final Rect f7111q;

        /* renamed from: r */
        public Object f7112r;

        public C2012e(int i, int i2) {
            super(i, i2);
            this.f7096b = false;
            this.f7097c = 0;
            this.f7098d = 0;
            this.f7099e = -1;
            this.f7100f = -1;
            this.f7101g = 0;
            this.f7102h = 0;
            this.f7111q = new Rect();
        }

        /* renamed from: a */
        public boolean m5793a() {
            return this.f7105k == null && this.f7100f != -1;
        }

        /* renamed from: b */
        public boolean m5794b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            return view2 == this.f7106l || m5811s(view2, wvi.m55139z(coordinatorLayout)) || ((behavior = this.f7095a) != null && behavior.mo5772i(coordinatorLayout, view, view2));
        }

        /* renamed from: c */
        public boolean m5795c() {
            if (this.f7095a == null) {
                this.f7107m = false;
            }
            return this.f7107m;
        }

        /* renamed from: d */
        public View m5796d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f7100f == -1) {
                this.f7106l = null;
                this.f7105k = null;
                return null;
            }
            if (this.f7105k == null || !m5812t(view, coordinatorLayout)) {
                m5806n(view, coordinatorLayout);
            }
            return this.f7105k;
        }

        /* renamed from: e */
        public int m5797e() {
            return this.f7100f;
        }

        /* renamed from: f */
        public Behavior m5798f() {
            return this.f7095a;
        }

        /* renamed from: g */
        public boolean m5799g() {
            return this.f7110p;
        }

        /* renamed from: h */
        public Rect m5800h() {
            return this.f7111q;
        }

        /* renamed from: i */
        public boolean m5801i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f7107m;
            if (z) {
                return true;
            }
            Behavior behavior = this.f7095a;
            boolean zM5768e = (behavior != null ? behavior.m5768e(coordinatorLayout, view) : false) | z;
            this.f7107m = zM5768e;
            return zM5768e;
        }

        /* renamed from: j */
        public boolean m5802j(int i) {
            if (i == 0) {
                return this.f7108n;
            }
            if (i != 1) {
                return false;
            }
            return this.f7109o;
        }

        /* renamed from: k */
        public void m5803k() {
            this.f7110p = false;
        }

        /* renamed from: l */
        public void m5804l(int i) {
            m5810r(i, false);
        }

        /* renamed from: m */
        public void m5805m() {
            this.f7107m = false;
        }

        /* renamed from: n */
        public final void m5806n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f7100f);
            this.f7105k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f7106l = null;
                    this.f7105k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f7100f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f7106l = null;
                this.f7105k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f7106l = null;
                    this.f7105k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f7106l = viewFindViewById;
        }

        /* renamed from: o */
        public void m5807o(Behavior behavior) {
            Behavior behavior2 = this.f7095a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.mo5777n();
                }
                this.f7095a = behavior;
                this.f7112r = null;
                this.f7096b = true;
                if (behavior != null) {
                    behavior.mo5774k(this);
                }
            }
        }

        /* renamed from: p */
        public void m5808p(boolean z) {
            this.f7110p = z;
        }

        /* renamed from: q */
        public void m5809q(Rect rect) {
            this.f7111q.set(rect);
        }

        /* renamed from: r */
        public void m5810r(int i, boolean z) {
            if (i == 0) {
                this.f7108n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f7109o = z;
            }
        }

        /* renamed from: s */
        public final boolean m5811s(View view, int i) {
            int iM23889b = dv7.m23889b(((C2012e) view.getLayoutParams()).f7101g, i);
            return iM23889b != 0 && (dv7.m23889b(this.f7102h, i) & iM23889b) == iM23889b;
        }

        /* renamed from: t */
        public final boolean m5812t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f7105k.getId() != this.f7100f) {
                return false;
            }
            View view2 = this.f7105k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f7106l = null;
                    this.f7105k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f7106l = view2;
            return true;
        }

        public C2012e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7096b = false;
            this.f7097c = 0;
            this.f7098d = 0;
            this.f7099e = -1;
            this.f7100f = -1;
            this.f7101g = 0;
            this.f7102h = 0;
            this.f7111q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nbe.CoordinatorLayout_Layout);
            this.f7097c = typedArrayObtainStyledAttributes.getInteger(nbe.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f7100f = typedArrayObtainStyledAttributes.getResourceId(nbe.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f7098d = typedArrayObtainStyledAttributes.getInteger(nbe.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f7099e = typedArrayObtainStyledAttributes.getInteger(nbe.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f7101g = typedArrayObtainStyledAttributes.getInt(nbe.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f7102h = typedArrayObtainStyledAttributes.getInt(nbe.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(nbe.CoordinatorLayout_Layout_layout_behavior);
            this.f7096b = zHasValue;
            if (zHasValue) {
                this.f7095a = CoordinatorLayout.m5718O(context, attributeSet, typedArrayObtainStyledAttributes.getString(nbe.CoordinatorLayout_Layout_layout_behavior));
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.f7095a;
            if (behavior != null) {
                behavior.mo5774k(this);
            }
        }

        public C2012e(C2012e c2012e) {
            super((ViewGroup.MarginLayoutParams) c2012e);
            this.f7096b = false;
            this.f7097c = 0;
            this.f7098d = 0;
            this.f7099e = -1;
            this.f7100f = -1;
            this.f7101g = 0;
            this.f7102h = 0;
            this.f7111q = new Rect();
        }

        public C2012e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7096b = false;
            this.f7097c = 0;
            this.f7098d = 0;
            this.f7099e = -1;
            this.f7100f = -1;
            this.f7101g = 0;
            this.f7102h = 0;
            this.f7111q = new Rect();
        }

        public C2012e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7096b = false;
            this.f7097c = 0;
            this.f7098d = 0;
            this.f7099e = -1;
            this.f7100f = -1;
            this.f7101g = 0;
            this.f7102h = 0;
            this.f7111q = new Rect();
        }
    }
}
