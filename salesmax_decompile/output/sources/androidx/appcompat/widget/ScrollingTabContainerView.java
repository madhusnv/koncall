package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import p001o.anh;
import p001o.nm;
import p001o.tq;
import p001o.z5e;

/* loaded from: classes2.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: y */
    public static final Interpolator f5920y = new DecelerateInterpolator();

    /* renamed from: a */
    public Runnable f5921a;

    /* renamed from: b */
    public ViewOnClickListenerC1852c f5922b;

    /* renamed from: c */
    public LinearLayoutCompat f5923c;

    /* renamed from: d */
    public Spinner f5924d;

    /* renamed from: e */
    public boolean f5925e;

    /* renamed from: f */
    public int f5926f;

    /* renamed from: g */
    public int f5927g;

    /* renamed from: h */
    public int f5928h;

    /* renamed from: q */
    public int f5929q;

    /* renamed from: s */
    public ViewPropertyAnimator f5930s;

    /* renamed from: x */
    public final C1854e f5931x;

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    public class RunnableC1850a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f5932a;

        public RunnableC1850a(View view) {
            this.f5932a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f5932a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f5932a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f5921a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    public class C1851b extends BaseAdapter {
        public C1851b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f5923c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            ((C1853d) ScrollingTabContainerView.this.f5923c.getChildAt(i)).m4336b();
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                tq.m50332a(getItem(i));
                return scrollingTabContainerView.m4331d(null, true);
            }
            tq.m50332a(getItem(i));
            ((C1853d) view).m4335a(null);
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    public class ViewOnClickListenerC1852c implements View.OnClickListener {
        public ViewOnClickListenerC1852c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C1853d) view).m4336b();
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    public class C1853d extends LinearLayout {

        /* renamed from: a */
        public final int[] f5936a;

        public C1853d(Context context, ActionBar.AbstractC1754a abstractC1754a, boolean z) {
            super(context, null, z5e.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.f5936a = iArr;
            anh anhVarM17525v = anh.m17525v(context, null, iArr, z5e.actionBarTabStyle, 0);
            if (anhVarM17525v.m17544s(0)) {
                setBackgroundDrawable(anhVarM17525v.m17532g(0));
            }
            anhVarM17525v.m17546x();
            if (z) {
                setGravity(8388627);
            }
            m4337c();
        }

        /* renamed from: a */
        public void m4335a(ActionBar.AbstractC1754a abstractC1754a) {
            m4337c();
        }

        /* renamed from: b */
        public ActionBar.AbstractC1754a m4336b() {
            return null;
        }

        /* renamed from: c */
        public void m4337c() {
            throw null;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f5926f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView.this.f5926f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$e */
    public class C1854e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f5938a = false;

        /* renamed from: b */
        public int f5939b;

        public C1854e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5938a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5938a) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.f5930s = null;
            scrollingTabContainerView.setVisibility(this.f5939b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f5938a = false;
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.f5931x = new C1854e();
        setHorizontalScrollBarEnabled(false);
        nm nmVarM40771b = nm.m40771b(context);
        setContentHeight(nmVarM40771b.m40776f());
        this.f5927g = nmVarM40771b.m40775e();
        LinearLayoutCompat linearLayoutCompatM4330c = m4330c();
        this.f5923c = linearLayoutCompatM4330c;
        addView(linearLayoutCompatM4330c, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public void m4328a(int i) {
        View childAt = this.f5923c.getChildAt(i);
        Runnable runnable = this.f5921a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC1850a runnableC1850a = new RunnableC1850a(childAt);
        this.f5921a = runnableC1850a;
        post(runnableC1850a);
    }

    /* renamed from: b */
    public final Spinner m4329b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, z5e.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: c */
    public final LinearLayoutCompat m4330c() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, z5e.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: d */
    public C1853d m4331d(ActionBar.AbstractC1754a abstractC1754a, boolean z) {
        C1853d c1853d = new C1853d(getContext(), abstractC1754a, z);
        if (z) {
            c1853d.setBackgroundDrawable(null);
            c1853d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f5928h));
        } else {
            c1853d.setFocusable(true);
            if (this.f5922b == null) {
                this.f5922b = new ViewOnClickListenerC1852c();
            }
            c1853d.setOnClickListener(this.f5922b);
        }
        return c1853d;
    }

    /* renamed from: e */
    public final boolean m4332e() {
        Spinner spinner = this.f5924d;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: f */
    public final void m4333f() {
        if (m4332e()) {
            return;
        }
        if (this.f5924d == null) {
            this.f5924d = m4329b();
        }
        removeView(this.f5923c);
        addView(this.f5924d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f5924d.getAdapter() == null) {
            this.f5924d.setAdapter((SpinnerAdapter) new C1851b());
        }
        Runnable runnable = this.f5921a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f5921a = null;
        }
        this.f5924d.setSelection(this.f5929q);
    }

    /* renamed from: g */
    public final boolean m4334g() {
        if (!m4332e()) {
            return false;
        }
        removeView(this.f5924d);
        addView(this.f5923c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f5924d.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f5921a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nm nmVarM40771b = nm.m40771b(getContext());
        setContentHeight(nmVarM40771b.m40776f());
        this.f5927g = nmVarM40771b.m40775e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f5921a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((C1853d) view).m4336b();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f5923c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f5926f = -1;
        } else {
            if (childCount > 2) {
                this.f5926f = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f5926f = View.MeasureSpec.getSize(i) / 2;
            }
            this.f5926f = Math.min(this.f5926f, this.f5927g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5928h, 1073741824);
        if (!z && this.f5925e) {
            this.f5923c.measure(0, iMakeMeasureSpec);
            if (this.f5923c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m4333f();
            } else {
                m4334g();
            }
        } else {
            m4334g();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f5929q);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f5925e = z;
    }

    public void setContentHeight(int i) {
        this.f5928h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f5929q = i;
        int childCount = this.f5923c.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f5923c.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m4328a(i);
            }
            i2++;
        }
        Spinner spinner = this.f5924d;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
