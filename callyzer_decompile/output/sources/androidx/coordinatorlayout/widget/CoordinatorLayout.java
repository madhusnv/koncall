package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ap.C0390c;
import b6.C0603d;
import c6.C0892v;
import c6.InterfaceC0890t;
import c6.InterfaceC0891u;
import c6.l0;
import c6.n0;
import c6.v0;
import c6.y1;
import c9.C0919n;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import e1.u0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.C4001v;
import n5.AbstractC4955a;
import o5.AbstractC5292a;
import o5.AbstractC5298g;
import o5.C5295d;
import o5.C5297f;
import o5.InterfaceC5293b;
import o5.ViewGroupOnHierarchyChangeListenerC5294c;
import o5.ViewTreeObserverOnPreDrawListenerC5296e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0890t, InterfaceC0891u {

    /* renamed from: B */
    public static final C0603d f2165B;

    /* renamed from: w */
    public static final String f2166w;

    /* renamed from: x */
    public static final Class[] f2167x;

    /* renamed from: y */
    public static final ThreadLocal f2168y;

    /* renamed from: z */
    public static final C0390c f2169z;

    /* renamed from: a */
    public final ArrayList f2170a;

    /* renamed from: b */
    public final C0919n f2171b;

    /* renamed from: c */
    public final ArrayList f2172c;

    /* renamed from: d */
    public final ArrayList f2173d;

    /* renamed from: e */
    public final int[] f2174e;

    /* renamed from: f */
    public final int[] f2175f;

    /* renamed from: g */
    public boolean f2176g;

    /* renamed from: h */
    public boolean f2177h;

    /* renamed from: j */
    public final int[] f2178j;

    /* renamed from: k */
    public View f2179k;

    /* renamed from: l */
    public View f2180l;

    /* renamed from: m */
    public ViewTreeObserverOnPreDrawListenerC5296e f2181m;

    /* renamed from: n */
    public boolean f2182n;

    /* renamed from: p */
    public y1 f2183p;

    /* renamed from: q */
    public boolean f2184q;

    /* renamed from: r */
    public Drawable f2185r;

    /* renamed from: s */
    public ViewGroup.OnHierarchyChangeListener f2186s;

    /* renamed from: t */
    public C4001v f2187t;

    /* renamed from: v */
    public final C0892v f2188v;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2166w = r02 != null ? r02.getName() : null;
        f2169z = new C0390c(23);
        f2167x = new Class[]{Context.class, AttributeSet.class};
        f2168y = new ThreadLocal();
        f2165B = new C0603d();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f2170a = new ArrayList();
        this.f2171b = new C0919n(7);
        this.f2172c = new ArrayList();
        this.f2173d = new ArrayList();
        this.f2174e = new int[2];
        this.f2175f = new int[2];
        this.f2188v = new C0892v();
        int[] iArr = AbstractC4955a.f24642a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        } else {
            coordinatorLayout = this;
            context2 = context;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f2178j = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                coordinatorLayout.f2178j[i10] = (int) (r1[i10] * f6);
            }
        }
        coordinatorLayout.f2185r = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m751v();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC5294c(this));
        Field field = v0.f5527a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    public static Rect m736a() {
        Rect rect = (Rect) f2165B.mo1762a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: l */
    public static void m737l(int i10, Rect rect, Rect rect2, C5295d c5295d, int i11, int i12) {
        int i13 = c5295d.f25983c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = c5295d.f25984d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        int iWidth = i17 != 1 ? i17 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i18 != 16 ? i18 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* renamed from: m */
    public static C5295d m738m(View view) {
        C5295d c5295d = (C5295d) view.getLayoutParams();
        if (!c5295d.f25982b) {
            InterfaceC5293b interfaceC5293b = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC5293b = (InterfaceC5293b) superclass.getAnnotation(InterfaceC5293b.class);
                if (interfaceC5293b != null) {
                    break;
                }
            }
            if (interfaceC5293b != null) {
                try {
                    AbstractC5292a abstractC5292a = (AbstractC5292a) interfaceC5293b.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC5292a abstractC5292a2 = c5295d.f25981a;
                    if (abstractC5292a2 != abstractC5292a) {
                        if (abstractC5292a2 != null) {
                            abstractC5292a2.mo4058e();
                        }
                        c5295d.f25981a = abstractC5292a;
                        c5295d.f25982b = true;
                        if (abstractC5292a != null) {
                            abstractC5292a.mo4057c(c5295d);
                        }
                    }
                } catch (Exception unused) {
                    interfaceC5293b.value().getClass();
                }
            }
            c5295d.f25982b = true;
        }
        return c5295d;
    }

    /* renamed from: t */
    public static void m739t(int i10, View view) {
        C5295d c5295d = (C5295d) view.getLayoutParams();
        int i11 = c5295d.f25989i;
        if (i11 != i10) {
            Field field = v0.f5527a;
            view.offsetLeftAndRight(i10 - i11);
            c5295d.f25989i = i10;
        }
    }

    /* renamed from: u */
    public static void m740u(int i10, View view) {
        C5295d c5295d = (C5295d) view.getLayoutParams();
        int i11 = c5295d.f25990j;
        if (i11 != i10) {
            Field field = v0.f5527a;
            view.offsetTopAndBottom(i10 - i11);
            c5295d.f25990j = i10;
        }
    }

    /* renamed from: b */
    public final void m741b(C5295d c5295d, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c5295d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) c5295d).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c5295d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) c5295d).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: c */
    public final void mo561c(int i10, View view) {
        C0892v c0892v = this.f2188v;
        if (i10 == 1) {
            c0892v.f5526b = 0;
        } else {
            c0892v.f5525a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C5295d c5295d = (C5295d) childAt.getLayoutParams();
            if (c5295d.m10438a(i10)) {
                AbstractC5292a abstractC5292a = c5295d.f25981a;
                if (abstractC5292a != null) {
                    abstractC5292a.mo4042p(childAt, view, i10);
                }
                if (i10 == 0) {
                    c5295d.f25993m = false;
                } else if (i10 == 1) {
                    c5295d.f25994n = false;
                }
            }
        }
        this.f2180l = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C5295d) && super.checkLayoutParams(layoutParams);
    }

    @Override // c6.InterfaceC0891u
    /* renamed from: d */
    public final void mo562d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        AbstractC5292a abstractC5292a;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z6 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C5295d c5295d = (C5295d) childAt.getLayoutParams();
                if (c5295d.m10438a(i14) && (abstractC5292a = c5295d.f25981a) != null) {
                    int[] iArr2 = this.f2174e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC5292a.mo4038k(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z6) {
            m746o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        AbstractC5292a abstractC5292a = ((C5295d) view.getLayoutParams()).f25981a;
        if (abstractC5292a != null) {
            abstractC5292a.getClass();
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2185r;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m742e(View view, Rect rect, boolean z6) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            m744k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: f */
    public final void mo564f(View view, int i10, int i11, int i12, int i13, int i14) {
        mo562d(view, i10, i11, i12, i13, 0, this.f2175f);
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: g */
    public final boolean mo565g(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C5295d c5295d = (C5295d) childAt.getLayoutParams();
                AbstractC5292a abstractC5292a = c5295d.f25981a;
                if (abstractC5292a != null) {
                    boolean zMo4041o = abstractC5292a.mo4041o(childAt, i10, i11);
                    z6 |= zMo4041o;
                    if (i11 == 0) {
                        c5295d.f25993m = zMo4041o;
                    } else if (i11 == 1) {
                        c5295d.f25994n = zMo4041o;
                    }
                } else if (i11 == 0) {
                    c5295d.f25993m = false;
                } else if (i11 == 1) {
                    c5295d.f25994n = false;
                }
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5295d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5295d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m749r();
        return Collections.unmodifiableList(this.f2170a);
    }

    public final y1 getLastWindowInsets() {
        return this.f2183p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0892v c0892v = this.f2188v;
        return c0892v.f5526b | c0892v.f5525a;
    }

    public Drawable getStatusBarBackground() {
        return this.f2185r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: h */
    public final void mo566h(View view, View view2, int i10, int i11) {
        C0892v c0892v = this.f2188v;
        if (i11 == 1) {
            c0892v.f5526b = i10;
        } else {
            c0892v.f5525a = i10;
        }
        this.f2180l = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((C5295d) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: i */
    public final void mo567i(View view, int i10, int i11, int[] iArr, int i12) {
        AbstractC5292a abstractC5292a;
        int childCount = getChildCount();
        boolean z6 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C5295d c5295d = (C5295d) childAt.getLayoutParams();
                if (c5295d.m10438a(i12) && (abstractC5292a = c5295d.f25981a) != null) {
                    int[] iArr2 = this.f2174e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC5292a.mo4037j(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z6) {
            m746o(1);
        }
    }

    /* renamed from: j */
    public final ArrayList m743j(View view) {
        u0 u0Var = (u0) this.f2171b.f5599b;
        int i10 = u0Var.f9065c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) u0Var.m5637o(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(u0Var.m5634j(i11));
            }
        }
        ArrayList arrayList3 = this.f2173d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* renamed from: k */
    public final void m744k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC5298g.f25998a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC5298g.f25998a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC5298g.m10439a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC5298g.f25999b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: n */
    public final boolean m745n(View view, int i10, int i11) {
        C0603d c0603d = f2165B;
        Rect rectM736a = m736a();
        m744k(view, rectM736a);
        try {
            return rectM736a.contains(i10, i11);
        } finally {
            rectM736a.setEmpty();
            c0603d.mo1765d(rectM736a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m746o(int r23) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m746o(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m750s(false);
        if (this.f2182n) {
            if (this.f2181m == null) {
                this.f2181m = new ViewTreeObserverOnPreDrawListenerC5296e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2181m);
        }
        if (this.f2183p == null) {
            Field field = v0.f5527a;
            if (getFitsSystemWindows()) {
                l0.m2444c(this);
            }
        }
        this.f2177h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m750s(false);
        if (this.f2182n && this.f2181m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2181m);
        }
        View view = this.f2180l;
        if (view != null) {
            mo561c(0, view);
        }
        this.f2177h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2184q || this.f2185r == null) {
            return;
        }
        y1 y1Var = this.f2183p;
        int iM2538a = y1Var != null ? y1Var.m2538a() : 0;
        if (iM2538a > 0) {
            this.f2185r.setBounds(0, 0, getWidth(), iM2538a);
            this.f2185r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m750s(true);
        }
        boolean zM748q = m748q(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM748q;
        }
        m750s(true);
        return zM748q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        AbstractC5292a abstractC5292a;
        Field field = v0.f5527a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f2170a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((abstractC5292a = ((C5295d) view.getLayoutParams()).f25981a) == null || !abstractC5292a.mo2728g(this, view, layoutDirection))) {
                m747p(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0193  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z6) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C5295d c5295d = (C5295d) childAt.getLayoutParams();
                if (c5295d.m10438a(0)) {
                    AbstractC5292a abstractC5292a = c5295d.f25981a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        AbstractC5292a abstractC5292a;
        int childCount = getChildCount();
        boolean zMo4059i = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C5295d c5295d = (C5295d) childAt.getLayoutParams();
                if (c5295d.m10438a(0) && (abstractC5292a = c5295d.f25981a) != null) {
                    zMo4059i |= abstractC5292a.mo4059i(view);
                }
            }
        }
        return zMo4059i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo567i(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        mo564f(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        mo566h(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C5297f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5297f c5297f = (C5297f) parcelable;
        super.onRestoreInstanceState(c5297f.f21992a);
        SparseArray sparseArray = c5297f.f25997c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC5292a abstractC5292a = m738m(childAt).f25981a;
            if (id2 != -1 && abstractC5292a != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                abstractC5292a.mo4039m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo4040n;
        C5297f c5297f = new C5297f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC5292a abstractC5292a = ((C5295d) childAt.getLayoutParams()).f25981a;
            if (id2 != -1 && abstractC5292a != null && (parcelableMo4040n = abstractC5292a.mo4040n(childAt)) != null) {
                sparseArray.append(id2, parcelableMo4040n);
            }
        }
        c5297f.f25997c = sparseArray;
        return c5297f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo565g(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo561c(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f2179k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m748q(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f2179k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            o5.d r6 = (o5.C5295d) r6
            o5.a r6 = r6.f25981a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f2179k
            boolean r6 = r6.mo4043q(r7, r1)
        L2a:
            android.view.View r7 = r0.f2179k
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.m750s(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m747p(int r13, android.view.View r14) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m747p(int, android.view.View):void");
    }

    /* renamed from: q */
    public final boolean m748q(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f2172c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        C0390c c0390c = f2169z;
        if (c0390c != null) {
            Collections.sort(arrayList, c0390c);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo4035f = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            AbstractC5292a abstractC5292a = ((C5295d) view.getLayoutParams()).f25981a;
            if (zMo4035f && actionMasked != 0) {
                if (abstractC5292a != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 0);
                    }
                    if (i10 == 0) {
                        abstractC5292a.mo4035f(this, view, motionEventObtain);
                    } else if (i10 == 1) {
                        abstractC5292a.mo4043q(view, motionEventObtain);
                    }
                }
            } else if (!zMo4035f && abstractC5292a != null) {
                if (i10 == 0) {
                    zMo4035f = abstractC5292a.mo4035f(this, view, motionEvent);
                } else if (i10 == 1) {
                    zMo4035f = abstractC5292a.mo4043q(view, motionEvent);
                }
                if (zMo4035f) {
                    this.f2179k = view;
                }
            }
        }
        arrayList.clear();
        return zMo4035f;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m749r() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m749r():void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        AbstractC5292a abstractC5292a = ((C5295d) view.getLayoutParams()).f25981a;
        if (abstractC5292a != null) {
            abstractC5292a.mo4046l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.f2176g) {
            return;
        }
        m750s(false);
        this.f2176g = true;
    }

    /* renamed from: s */
    public final void m750s(boolean z6) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC5292a abstractC5292a = ((C5295d) childAt.getLayoutParams()).f25981a;
            if (abstractC5292a != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 0);
                if (z6) {
                    abstractC5292a.mo4035f(this, childAt, motionEventObtain);
                } else {
                    abstractC5292a.mo4043q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((C5295d) getChildAt(i11).getLayoutParams()).getClass();
        }
        this.f2179k = null;
        this.f2176g = false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        m751v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2186s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2185r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f2185r = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f2185r.setState(getDrawableState());
                }
                Drawable drawable3 = this.f2185r;
                Field field = v0.f5527a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f2185r.setVisible(getVisibility() == 0, false);
                this.f2185r.setCallback(this);
            }
            Field field2 = v0.f5527a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? getContext().getDrawable(i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z6 = i10 == 0;
        Drawable drawable = this.f2185r;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.f2185r.setVisible(z6, false);
    }

    /* renamed from: v */
    public final void m751v() {
        Field field = v0.f5527a;
        if (!getFitsSystemWindows()) {
            n0.m2460l(this, null);
            return;
        }
        if (this.f2187t == null) {
            this.f2187t = new C4001v(15, this);
        }
        n0.m2460l(this, this.f2187t);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2185r;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5295d ? new C5295d((C5295d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C5295d((ViewGroup.MarginLayoutParams) layoutParams) : new C5295d(layoutParams);
    }
}
