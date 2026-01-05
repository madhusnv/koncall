package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p001o.bbe;
import p001o.brf;
import p001o.oed;
import p001o.rz5;
import p001o.z5e;

/* loaded from: classes2.dex */
public class ListPopupWindow implements brf {
    public static Method u0;
    public static Method v0;

    /* renamed from: H */
    public boolean f5891H;

    /* renamed from: L */
    public boolean f5892L;

    /* renamed from: M */
    public int f5893M;

    /* renamed from: Q */
    public View f5894Q;

    /* renamed from: X */
    public int f5895X;

    /* renamed from: Y */
    public DataSetObserver f5896Y;

    /* renamed from: Z */
    public View f5897Z;

    /* renamed from: a */
    public Context f5898a;

    /* renamed from: b */
    public ListAdapter f5899b;

    /* renamed from: c */
    public rz5 f5900c;

    /* renamed from: d */
    public int f5901d;

    /* renamed from: e */
    public int f5902e;

    /* renamed from: f */
    public int f5903f;

    /* renamed from: g */
    public int f5904g;

    /* renamed from: h */
    public int f5905h;
    public Drawable h0;
    public AdapterView.OnItemClickListener i0;
    public AdapterView.OnItemSelectedListener j0;
    public final RunnableC1847i k0;
    public final ViewOnTouchListenerC1846h l0;
    public final C1845g m0;
    public final RunnableC1843e n0;
    public Runnable o0;
    public final Handler p0;

    /* renamed from: q */
    public boolean f5906q;
    public final Rect q0;
    public Rect r0;

    /* renamed from: s */
    public boolean f5907s;
    public boolean s0;
    public PopupWindow t0;

    /* renamed from: x */
    public boolean f5908x;

    /* renamed from: y */
    public int f5909y;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    public class RunnableC1839a implements Runnable {
        public RunnableC1839a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            View viewM4308s = ListPopupWindow.this.m4308s();
            if (viewM4308s == null || viewM4308s.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.show();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    public class C1840b implements AdapterView.OnItemSelectedListener {
        public C1840b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            rz5 rz5Var;
            if (i == -1 || (rz5Var = ListPopupWindow.this.f5900c) == null) {
                return;
            }
            rz5Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    public static class C1841c {
        /* renamed from: a */
        public static int m4316a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    public static class C1842d {
        /* renamed from: a */
        public static void m4317a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        public static void m4318b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    public class RunnableC1843e implements Runnable {
        public RunnableC1843e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.m4306q();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    public class C1844f extends DataSetObserver {
        public C1844f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (ListPopupWindow.this.mo3986a()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    public class C1845g implements AbsListView.OnScrollListener {
        public C1845g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (i != 1 || ListPopupWindow.this.m4315z() || ListPopupWindow.this.t0.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.p0.removeCallbacks(listPopupWindow.k0);
            ListPopupWindow.this.k0.run();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$h */
    public class ViewOnTouchListenerC1846h implements View.OnTouchListener {
        public ViewOnTouchListenerC1846h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.t0) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.t0.getWidth() && y >= 0 && y < ListPopupWindow.this.t0.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.p0.postDelayed(listPopupWindow.k0, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.p0.removeCallbacks(listPopupWindow2.k0);
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$i */
    public class RunnableC1847i implements Runnable {
        public RunnableC1847i() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            rz5 rz5Var = ListPopupWindow.this.f5900c;
            if (rz5Var == null || !rz5Var.isAttachedToWindow() || ListPopupWindow.this.f5900c.getCount() <= ListPopupWindow.this.f5900c.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f5900c.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.f5893M) {
                listPopupWindow.t0.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                u0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                v0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, z5e.listPopupWindowStyle);
    }

    /* renamed from: A */
    public boolean m4282A() {
        return this.s0;
    }

    /* renamed from: B */
    public final void m4283B() {
        View view = this.f5894Q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f5894Q);
            }
        }
    }

    /* renamed from: C */
    public void m4284C(View view) {
        this.f5897Z = view;
    }

    /* renamed from: D */
    public void m4285D(int i) {
        this.t0.setAnimationStyle(i);
    }

    /* renamed from: E */
    public void m4286E(int i) {
        Drawable background = this.t0.getBackground();
        if (background == null) {
            m4298Q(i);
            return;
        }
        background.getPadding(this.q0);
        Rect rect = this.q0;
        this.f5902e = rect.left + rect.right + i;
    }

    /* renamed from: F */
    public void m4287F(int i) {
        this.f5909y = i;
    }

    /* renamed from: G */
    public void m4288G(Rect rect) {
        this.r0 = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: H */
    public void m4289H(int i) {
        this.t0.setInputMethodMode(i);
    }

    /* renamed from: I */
    public void m4290I(boolean z) {
        this.s0 = z;
        this.t0.setFocusable(z);
    }

    /* renamed from: J */
    public void m4291J(PopupWindow.OnDismissListener onDismissListener) {
        this.t0.setOnDismissListener(onDismissListener);
    }

    /* renamed from: K */
    public void m4292K(AdapterView.OnItemClickListener onItemClickListener) {
        this.i0 = onItemClickListener;
    }

    /* renamed from: L */
    public void m4293L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.j0 = onItemSelectedListener;
    }

    /* renamed from: M */
    public void m4294M(boolean z) {
        this.f5908x = true;
        this.f5907s = z;
    }

    /* renamed from: N */
    public final void m4295N(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            C1842d.m4318b(this.t0, z);
            return;
        }
        Method method = u0;
        if (method != null) {
            try {
                method.invoke(this.t0, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: O */
    public void m4296O(int i) {
        this.f5895X = i;
    }

    /* renamed from: P */
    public void m4297P(int i) {
        rz5 rz5Var = this.f5900c;
        if (!mo3986a() || rz5Var == null) {
            return;
        }
        rz5Var.setListSelectionHidden(false);
        rz5Var.setSelection(i);
        if (rz5Var.getChoiceMode() != 0) {
            rz5Var.setItemChecked(i, true);
        }
    }

    /* renamed from: Q */
    public void m4298Q(int i) {
        this.f5902e = i;
    }

    @Override // p001o.brf
    /* renamed from: a */
    public boolean mo3986a() {
        return this.t0.isShowing();
    }

    /* renamed from: b */
    public void m4299b(Drawable drawable) {
        this.t0.setBackgroundDrawable(drawable);
    }

    /* renamed from: c */
    public int m4300c() {
        return this.f5903f;
    }

    @Override // p001o.brf
    public void dismiss() {
        this.t0.dismiss();
        m4283B();
        this.t0.setContentView(null);
        this.f5900c = null;
        this.p0.removeCallbacks(this.k0);
    }

    /* renamed from: e */
    public void m4301e(int i) {
        this.f5903f = i;
    }

    /* renamed from: g */
    public Drawable m4302g() {
        return this.t0.getBackground();
    }

    /* renamed from: i */
    public void m4303i(int i) {
        this.f5904g = i;
        this.f5906q = true;
    }

    /* renamed from: l */
    public int m4304l() {
        if (this.f5906q) {
            return this.f5904g;
        }
        return 0;
    }

    /* renamed from: m */
    public void mo4230m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f5896Y;
        if (dataSetObserver == null) {
            this.f5896Y = new C1844f();
        } else {
            ListAdapter listAdapter2 = this.f5899b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f5899b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f5896Y);
        }
        rz5 rz5Var = this.f5900c;
        if (rz5Var != null) {
            rz5Var.setAdapter(this.f5899b);
        }
    }

    @Override // p001o.brf
    /* renamed from: o */
    public ListView mo3992o() {
        return this.f5900c;
    }

    /* renamed from: p */
    public final int m4305p() {
        int measuredHeight;
        int i;
        int iMakeMeasureSpec;
        int i2;
        if (this.f5900c == null) {
            Context context = this.f5898a;
            this.o0 = new RunnableC1839a();
            rz5 rz5VarMo4307r = mo4307r(context, !this.s0);
            this.f5900c = rz5VarMo4307r;
            Drawable drawable = this.h0;
            if (drawable != null) {
                rz5VarMo4307r.setSelector(drawable);
            }
            this.f5900c.setAdapter(this.f5899b);
            this.f5900c.setOnItemClickListener(this.i0);
            this.f5900c.setFocusable(true);
            this.f5900c.setFocusableInTouchMode(true);
            this.f5900c.setOnItemSelectedListener(new C1840b());
            this.f5900c.setOnScrollListener(this.m0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.j0;
            if (onItemSelectedListener != null) {
                this.f5900c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f5900c;
            View view2 = this.f5894Q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i3 = this.f5895X;
                if (i3 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i3 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.f5895X);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i4 = this.f5902e;
                if (i4 >= 0) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i2 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i4, i2), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.t0.setContentView(view);
        } else {
            View view3 = this.f5894Q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.t0.getBackground();
        if (background != null) {
            background.getPadding(this.q0);
            Rect rect = this.q0;
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f5906q) {
                this.f5904g = -i5;
            }
        } else {
            this.q0.setEmpty();
            i = 0;
        }
        int iM4309t = m4309t(m4308s(), this.f5904g, this.t0.getInputMethodMode() == 2);
        if (this.f5891H || this.f5901d == -1) {
            return iM4309t + i;
        }
        int i6 = this.f5902e;
        if (i6 == -2) {
            int i7 = this.f5898a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.q0;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i6 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            int i8 = this.f5898a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.q0;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect3.left + rect3.right), 1073741824);
        }
        int iMo4323d = this.f5900c.mo4323d(iMakeMeasureSpec, 0, -1, iM4309t - measuredHeight, -1);
        if (iMo4323d > 0) {
            measuredHeight += i + this.f5900c.getPaddingTop() + this.f5900c.getPaddingBottom();
        }
        return iMo4323d + measuredHeight;
    }

    /* renamed from: q */
    public void m4306q() {
        rz5 rz5Var = this.f5900c;
        if (rz5Var != null) {
            rz5Var.setListSelectionHidden(true);
            rz5Var.requestLayout();
        }
    }

    /* renamed from: r */
    public rz5 mo4307r(Context context, boolean z) {
        return new rz5(context, z);
    }

    /* renamed from: s */
    public View m4308s() {
        return this.f5897Z;
    }

    @Override // p001o.brf
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iM4305p = m4305p();
        boolean zM4315z = m4315z();
        oed.m42134b(this.t0, this.f5905h);
        if (this.t0.isShowing()) {
            if (m4308s().isAttachedToWindow()) {
                int width = this.f5902e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = m4308s().getWidth();
                }
                int i = this.f5901d;
                if (i == -1) {
                    if (!zM4315z) {
                        iM4305p = -1;
                    }
                    if (zM4315z) {
                        this.t0.setWidth(this.f5902e == -1 ? -1 : 0);
                        this.t0.setHeight(0);
                    } else {
                        this.t0.setWidth(this.f5902e == -1 ? -1 : 0);
                        this.t0.setHeight(-1);
                    }
                } else if (i != -2) {
                    iM4305p = i;
                }
                this.t0.setOutsideTouchable((this.f5892L || this.f5891H) ? false : true);
                this.t0.update(m4308s(), this.f5903f, this.f5904g, width < 0 ? -1 : width, iM4305p < 0 ? -1 : iM4305p);
                return;
            }
            return;
        }
        int width2 = this.f5902e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = m4308s().getWidth();
        }
        int i2 = this.f5901d;
        if (i2 == -1) {
            iM4305p = -1;
        } else if (i2 != -2) {
            iM4305p = i2;
        }
        this.t0.setWidth(width2);
        this.t0.setHeight(iM4305p);
        m4295N(true);
        this.t0.setOutsideTouchable((this.f5892L || this.f5891H) ? false : true);
        this.t0.setTouchInterceptor(this.l0);
        if (this.f5908x) {
            oed.m42133a(this.t0, this.f5907s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = v0;
            if (method != null) {
                try {
                    method.invoke(this.t0, this.r0);
                } catch (Exception unused) {
                }
            }
        } else {
            C1842d.m4317a(this.t0, this.r0);
        }
        oed.m42135c(this.t0, m4308s(), this.f5903f, this.f5904g, this.f5909y);
        this.f5900c.setSelection(-1);
        if (!this.s0 || this.f5900c.isInTouchMode()) {
            m4306q();
        }
        if (this.s0) {
            return;
        }
        this.p0.post(this.n0);
    }

    /* renamed from: t */
    public final int m4309t(View view, int i, boolean z) {
        return C1841c.m4316a(this.t0, view, i, z);
    }

    /* renamed from: u */
    public Object m4310u() {
        if (mo3986a()) {
            return this.f5900c.getSelectedItem();
        }
        return null;
    }

    /* renamed from: v */
    public long m4311v() {
        if (mo3986a()) {
            return this.f5900c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: w */
    public int m4312w() {
        if (mo3986a()) {
            return this.f5900c.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: x */
    public View m4313x() {
        if (mo3986a()) {
            return this.f5900c.getSelectedView();
        }
        return null;
    }

    /* renamed from: y */
    public int m4314y() {
        return this.f5902e;
    }

    /* renamed from: z */
    public boolean m4315z() {
        return this.t0.getInputMethodMode() == 2;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f5901d = -2;
        this.f5902e = -2;
        this.f5905h = 1002;
        this.f5909y = 0;
        this.f5891H = false;
        this.f5892L = false;
        this.f5893M = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f5895X = 0;
        this.k0 = new RunnableC1847i();
        this.l0 = new ViewOnTouchListenerC1846h();
        this.m0 = new C1845g();
        this.n0 = new RunnableC1843e();
        this.q0 = new Rect();
        this.f5898a = context;
        this.p0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbe.ListPopupWindow, i, i2);
        this.f5903f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(bbe.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(bbe.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f5904g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f5906q = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.t0 = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
