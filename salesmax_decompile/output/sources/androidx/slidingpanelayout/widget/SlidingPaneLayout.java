package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import androidx.slidingpanelayout.widget.C2464a;
import androidx.transition.AbstractC2524c;
import androidx.transition.ChangeBounds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.a0d;
import p001o.a9j;
import p001o.c64;
import p001o.cc;
import p001o.db;
import p001o.fwi;
import p001o.l77;
import p001o.ndc;
import p001o.r9j;
import p001o.sj8;
import p001o.tq;
import p001o.wvi;

/* loaded from: classes2.dex */
public class SlidingPaneLayout extends ViewGroup implements ndc {
    public static boolean o0;

    /* renamed from: H */
    public float f10209H;

    /* renamed from: L */
    public final List f10210L;

    /* renamed from: M */
    public final fwi f10211M;

    /* renamed from: Q */
    public boolean f10212Q;

    /* renamed from: a */
    public int f10213a;

    /* renamed from: b */
    public int f10214b;

    /* renamed from: c */
    public Drawable f10215c;

    /* renamed from: d */
    public Drawable f10216d;

    /* renamed from: e */
    public boolean f10217e;

    /* renamed from: f */
    public View f10218f;

    /* renamed from: g */
    public float f10219g;

    /* renamed from: h */
    public float f10220h;
    public boolean h0;
    public final Rect i0;
    public final ArrayList j0;
    public int k0;
    public l77 l0;
    public C2464a.a m0;
    public C2464a n0;

    /* renamed from: q */
    public int f10221q;

    /* renamed from: s */
    public boolean f10222s;

    /* renamed from: x */
    public int f10223x;

    /* renamed from: y */
    public float f10224y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2458a();

        /* renamed from: c */
        public boolean f10229c;

        /* renamed from: d */
        public int f10230d;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        public class C2458a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10229c ? 1 : 0);
            parcel.writeInt(this.f10230d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10229c = parcel.readInt() != 0;
            this.f10230d = parcel.readInt();
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    public class C2459a implements C2464a.a {
        public C2459a() {
        }

        @Override // androidx.slidingpanelayout.widget.C2464a.a
        /* renamed from: a */
        public void mo9764a(l77 l77Var) {
            SlidingPaneLayout.this.l0 = l77Var;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.w0(300L);
            changeBounds.z0(a0d.m16309a(0.2f, 0.0f, 0.0f, 1.0f));
            AbstractC2524c.m9945b(SlidingPaneLayout.this, changeBounds);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class C2460b extends db {

        /* renamed from: d */
        public final Rect f10232d = new Rect();

        public C2460b() {
        }

        @Override // p001o.db
        /* renamed from: f */
        public void mo5937f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5937f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            cc ccVarC0 = cc.c0(ccVar);
            super.mo5938g(view, ccVarC0);
            m9765n(ccVar, ccVarC0);
            ccVarC0.e0();
            ccVar.o0("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            ccVar.S0(view);
            Object objM55093F = wvi.m55093F(view);
            if (objM55093F instanceof View) {
                ccVar.J0((View) objM55093F);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!m9766o(childAt) && childAt.getVisibility() == 0) {
                    wvi.t0(childAt, 1);
                    ccVar.m20779c(childAt);
                }
            }
        }

        @Override // p001o.db
        /* renamed from: i */
        public boolean mo6032i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (m9766o(view)) {
                return false;
            }
            return super.mo6032i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: n */
        public final void m9765n(cc ccVar, cc ccVar2) {
            Rect rect = this.f10232d;
            ccVar2.m20789n(rect);
            ccVar.k0(rect);
            ccVar.b1(ccVar2.m20776Z());
            ccVar.H0(ccVar2.m20800z());
            ccVar.o0(ccVar2.m20792q());
            ccVar.s0(ccVar2.m20794t());
            ccVar.w0(ccVar2.m20765O());
            ccVar.p0(ccVar2.m20763M());
            ccVar.y0(ccVar2.m20766P());
            ccVar.z0(ccVar2.m20767Q());
            ccVar.h0(ccVar2.m20760J());
            ccVar.Q0(ccVar2.m20773W());
            ccVar.E0(ccVar2.m20770T());
            ccVar.m20777a(ccVar2.m20786k());
            ccVar.G0(ccVar2.m20798x());
        }

        /* renamed from: o */
        public boolean m9766o(View view) {
            return SlidingPaneLayout.this.m9749k(view);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    public class C2461c extends fwi.AbstractC13588c {
        public C2461c() {
        }

        /* renamed from: a */
        public final boolean m9767a() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f10222s || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.m9751m() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.m9751m() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f10218f.getLayoutParams();
            if (SlidingPaneLayout.this.m9750l()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.f10218f.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f10221q);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f10221q + paddingLeft);
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p001o.fwi.AbstractC13588c
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.f10221q;
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onEdgeDragStarted(int i, int i2) {
            if (m9767a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f10211M.m27687c(slidingPaneLayout.f10218f, i2);
            }
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onEdgeTouched(int i, int i2) {
            if (m9767a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f10211M.m27687c(slidingPaneLayout.f10218f, i2);
            }
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewCaptured(View view, int i) {
            SlidingPaneLayout.this.m9757t();
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewDragStateChanged(int i) {
            if (SlidingPaneLayout.this.f10211M.m27667B() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f10219g != 1.0f) {
                    slidingPaneLayout.m9747f(slidingPaneLayout.f10218f);
                    SlidingPaneLayout.this.f10212Q = true;
                } else {
                    slidingPaneLayout.m9760w(slidingPaneLayout.f10218f);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.m9746e(slidingPaneLayout2.f10218f);
                    SlidingPaneLayout.this.f10212Q = false;
                }
            }
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.m9753p(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.m9750l()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f10219g > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f10221q;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f10218f.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.f10219g > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f10221q;
                }
            }
            SlidingPaneLayout.this.f10211M.m27681P(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p001o.fwi.AbstractC13588c
        public boolean tryCaptureView(View view, int i) {
            if (m9767a()) {
                return ((LayoutParams) view.getLayoutParams()).f10227b;
            }
            return false;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface InterfaceC2462d {
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$e */
    public static class C2463e extends FrameLayout {
        public C2463e(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        o0 = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    private sj8 getSystemGestureInsets() {
        r9j r9jVarM55094G;
        if (!o0 || (r9jVarM55094G = wvi.m55094G(this)) == null) {
            return null;
        }
        return r9jVarM55094G.m46393h();
    }

    /* renamed from: h */
    public static Activity m9738h(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: i */
    public static Rect m9739i(l77 l77Var, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(l77Var.mo42700a());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    /* renamed from: j */
    public static int m9740j(View view) {
        return view instanceof C2463e ? wvi.m55089B(((C2463e) view).getChildAt(0)) : wvi.m55089B(view);
    }

    /* renamed from: o */
    public static int m9741o(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return ((ViewGroup.MarginLayoutParams) layoutParams).width == 0 && (layoutParams.f10226a > 0.0f ? 1 : (layoutParams.f10226a == 0.0f ? 0 : -1)) > 0 ? ViewGroup.getChildMeasureSpec(i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    private void setFoldingFeatureObserver(C2464a c2464a) {
        this.n0 = c2464a;
        c2464a.m9773f(this.m0);
    }

    /* renamed from: x */
    public static boolean m9742x(View view) {
        return view.isOpaque();
    }

    @Override // p001o.ndc
    /* renamed from: a */
    public void mo6003a() {
        m9754q();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new C2463e(view), i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    /* renamed from: b */
    public void m9743b(InterfaceC2462d interfaceC2462d) {
        this.f10210L.add(interfaceC2462d);
    }

    /* renamed from: c */
    public boolean m9744c() {
        return m9745d(0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f10211M.m27698n(true)) {
            if (this.f10217e) {
                wvi.d0(this);
            } else {
                this.f10211M.m27685a();
            }
        }
    }

    /* renamed from: d */
    public final boolean m9745d(int i) {
        if (!this.f10217e) {
            this.f10212Q = false;
        }
        if (!this.h0 && !m9758u(1.0f, i)) {
            return false;
        }
        this.f10212Q = false;
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = m9750l() ? this.f10216d : this.f10215c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (m9750l()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (m9750l() ^ m9751m()) {
            this.f10211M.m27679N(1);
            sj8 systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                fwi fwiVar = this.f10211M;
                fwiVar.m27678M(Math.max(fwiVar.m27706x(), systemGestureInsets.f45477a));
            }
        } else {
            this.f10211M.m27679N(2);
            sj8 systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                fwi fwiVar2 = this.f10211M;
                fwiVar2.m27678M(Math.max(fwiVar2.m27706x(), systemGestureInsets2.f45479c));
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f10217e && !layoutParams.f10227b && this.f10218f != null) {
            canvas.getClipBounds(this.i0);
            if (m9750l()) {
                Rect rect = this.i0;
                rect.left = Math.max(rect.left, this.f10218f.getRight());
            } else {
                Rect rect2 = this.i0;
                rect2.right = Math.min(rect2.right, this.f10218f.getLeft());
            }
            canvas.clipRect(this.i0);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* renamed from: e */
    public void m9746e(View view) {
        Iterator it = this.f10210L.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: f */
    public void m9747f(View view) {
        Iterator it = this.f10210L.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: g */
    public void m9748g(View view) {
        Iterator it = this.f10210L.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f10214b;
    }

    public final int getLockMode() {
        return this.k0;
    }

    public int getParallaxDistance() {
        return this.f10223x;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f10213a;
    }

    /* renamed from: k */
    public boolean m9749k(View view) {
        if (view == null) {
            return false;
        }
        return this.f10217e && ((LayoutParams) view.getLayoutParams()).f10228c && this.f10219g > 0.0f;
    }

    /* renamed from: l */
    public boolean m9750l() {
        return wvi.m55139z(this) == 1;
    }

    /* renamed from: m */
    public boolean m9751m() {
        return !this.f10217e || this.f10219g == 0.0f;
    }

    /* renamed from: n */
    public boolean m9752n() {
        return this.f10217e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Activity activityM9738h;
        super.onAttachedToWindow();
        this.h0 = true;
        if (this.n0 == null || (activityM9738h = m9738h(getContext())) == null) {
            return;
        }
        this.n0.m9772e(activityM9738h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0 = true;
        C2464a c2464a = this.n0;
        if (c2464a != null) {
            c2464a.m9774g();
        }
        if (this.j0.size() <= 0) {
            this.j0.clear();
        } else {
            tq.m50332a(this.j0.get(0));
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f10217e && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f10212Q = this.f10211M.m27671F(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f10217e || (this.f10222s && actionMasked != 0)) {
            this.f10211M.m27686b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f10211M.m27686b();
            return false;
        }
        if (actionMasked == 0) {
            this.f10222s = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f10224y = x;
            this.f10209H = y;
            if (this.f10211M.m27671F(this.f10218f, (int) x, (int) y) && m9749k(this.f10218f)) {
                z = true;
            }
            return this.f10211M.m27682Q(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float fAbs = Math.abs(x2 - this.f10224y);
            float fAbs2 = Math.abs(y2 - this.f10209H);
            if (fAbs > this.f10211M.m27666A() && fAbs2 > fAbs) {
                this.f10211M.m27686b();
                this.f10222s = true;
                return false;
            }
        }
        z = false;
        if (this.f10211M.m27682Q(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean zM9750l = m9750l();
        int i10 = i3 - i;
        int paddingRight = zM9750l ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM9750l ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.h0) {
            this.f10219g = (this.f10217e && this.f10212Q) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                i5 = i11;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f10227b) {
                    int i13 = i10 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i13) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f10221q = iMin;
                    int i14 = zM9750l ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f10228c = ((i11 + i14) + iMin) + (measuredWidth / 2) > i13;
                    int i15 = (int) (iMin * this.f10219g);
                    this.f10219g = i15 / iMin;
                    i5 = i11 + i14 + i15;
                    i6 = 0;
                } else if (!this.f10217e || (i7 = this.f10223x) == 0) {
                    i5 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.f10219g) * i7);
                    i5 = paddingRight;
                }
                if (zM9750l) {
                    i9 = (i10 - i5) + i6;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i5 - i6;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                l77 l77Var = this.l0;
                paddingRight += childAt.getWidth() + Math.abs((l77Var != null && l77Var.mo36656c() == l77.C15010a.f33344c && this.l0.mo36655b()) ? this.l0.mo42700a().width() : 0);
            }
            i12++;
            i11 = i5;
        }
        if (this.h0) {
            if (this.f10217e && this.f10223x != 0) {
                m9756s(this.f10219g);
            }
            m9760w(this.f10218f);
        }
        this.h0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[PHI: r15
      0x007c: PHI (r15v5 float) = (r15v1 float), (r15v6 float) binds: [B:16:0x0073, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int iMax;
        int iMakeMeasureSpec;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ?? r8 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax2 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f10218f = null;
        int i4 = 0;
        boolean z = false;
        int i5 = iMax2;
        float f = 0.0f;
        while (true) {
            i3 = 8;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i6 = size;
            if (childAt.getVisibility() == 8) {
                layoutParams.f10228c = r8;
            } else {
                float f2 = layoutParams.f10226a;
                if (f2 > 0.0f) {
                    f += f2;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
                        int iMax3 = Math.max(iMax2 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r8);
                        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        childAt.measure(i7 == -2 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode == 0 ? mode : Integer.MIN_VALUE) : i7 == -1 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode) : View.MeasureSpec.makeMeasureSpec(i7, 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i5 -= measuredWidth;
                        if (i4 != 0) {
                            boolean z2 = i5 < 0;
                            layoutParams.f10227b = z2;
                            z |= z2;
                            if (z2) {
                                this.f10218f = childAt;
                            }
                        }
                    }
                }
            }
            i4++;
            size = i6;
            r8 = 0;
        }
        int i8 = size;
        int i9 = i5;
        if (z || f > 0.0f) {
            int i10 = 0;
            while (i10 < childCount) {
                View childAt2 = getChildAt(i10);
                if (childAt2.getVisibility() != i3) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth2 = ((ViewGroup.MarginLayoutParams) layoutParams2).width == 0 && (layoutParams2.f10226a > 0.0f ? 1 : (layoutParams2.f10226a == 0.0f ? 0 : -1)) > 0 ? 0 : childAt2.getMeasuredWidth();
                    if (z) {
                        iMax = iMax2 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (layoutParams2.f10226a > 0.0f) {
                        iMax = measuredWidth2 + ((int) ((layoutParams2.f10226a * Math.max(0, i9)) / f));
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth2;
                        iMakeMeasureSpec = 0;
                    }
                    int iM9741o = m9741o(childAt2, i2, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth2 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iM9741o);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i10++;
                i3 = 8;
            }
        }
        ArrayList arrayListM9759v = m9759v();
        if (arrayListM9759v != null && !z) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt3 = getChildAt(i11);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = (Rect) arrayListM9759v.get(i11);
                    LayoutParams layoutParams3 = (LayoutParams) childAt3.getLayoutParams();
                    int i12 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec2);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (m9740j(childAt3) != 0 && rect.width() < m9740j(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax2 - i12, 1073741824), iMakeMeasureSpec2);
                        if (i11 != 0) {
                            layoutParams3.f10227b = true;
                            this.f10218f = childAt3;
                            z = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), iMakeMeasureSpec2);
                    }
                }
            }
        }
        setMeasuredDimension(i8, iMin + getPaddingTop() + getPaddingBottom());
        this.f10217e = z;
        if (this.f10211M.m27667B() == 0 || z) {
            return;
        }
        this.f10211M.m27685a();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        if (savedState.f10229c) {
            m9754q();
        } else {
            m9744c();
        }
        this.f10212Q = savedState.f10229c;
        setLockMode(savedState.f10230d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10229c = m9752n() ? m9751m() : this.f10212Q;
        savedState.f10230d = this.k0;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.h0 = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10217e) {
            return super.onTouchEvent(motionEvent);
        }
        this.f10211M.m27672G(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f10224y = x;
            this.f10209H = y;
        } else if (actionMasked == 1 && m9749k(this.f10218f)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f10224y;
            float f2 = y2 - this.f10209H;
            int iM27666A = this.f10211M.m27666A();
            if ((f * f) + (f2 * f2) < iM27666A * iM27666A && this.f10211M.m27671F(this.f10218f, (int) x2, (int) y2)) {
                m9745d(0);
            }
        }
        return true;
    }

    /* renamed from: p */
    public void m9753p(int i) {
        if (this.f10218f == null) {
            this.f10219g = 0.0f;
            return;
        }
        boolean zM9750l = m9750l();
        LayoutParams layoutParams = (LayoutParams) this.f10218f.getLayoutParams();
        int width = this.f10218f.getWidth();
        if (zM9750l) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((zM9750l ? getPaddingRight() : getPaddingLeft()) + (zM9750l ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.f10221q;
        this.f10219g = paddingRight;
        if (this.f10223x != 0) {
            m9756s(paddingRight);
        }
        m9748g(this.f10218f);
    }

    /* renamed from: q */
    public boolean m9754q() {
        return m9755r(0);
    }

    /* renamed from: r */
    public final boolean m9755r(int i) {
        if (!this.f10217e) {
            this.f10212Q = true;
        }
        if (!this.h0 && !m9758u(0.0f, i)) {
            return false;
        }
        this.f10212Q = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view.getParent() instanceof C2463e) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f10217e) {
            return;
        }
        this.f10212Q = view == this.f10218f;
    }

    /* renamed from: s */
    public final void m9756s(float f) {
        boolean zM9750l = m9750l();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f10218f) {
                float f2 = 1.0f - this.f10220h;
                int i2 = this.f10223x;
                this.f10220h = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (zM9750l) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.f10214b = i;
    }

    public final void setLockMode(int i) {
        this.k0 = i;
    }

    @Deprecated
    public void setPanelSlideListener(InterfaceC2462d interfaceC2462d) {
        if (interfaceC2462d != null) {
            m9743b(interfaceC2462d);
        }
    }

    public void setParallaxDistance(int i) {
        this.f10223x = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f10215c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f10216d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(c64.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(c64.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.f10213a = i;
    }

    /* renamed from: t */
    public void m9757t() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: u */
    public boolean m9758u(float f, int i) {
        int paddingLeft;
        if (!this.f10217e) {
            return false;
        }
        boolean zM9750l = m9750l();
        LayoutParams layoutParams = (LayoutParams) this.f10218f.getLayoutParams();
        if (zM9750l) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f * this.f10221q)) + this.f10218f.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f * this.f10221q));
        }
        fwi fwiVar = this.f10211M;
        View view = this.f10218f;
        if (!fwiVar.m27683R(view, paddingLeft, view.getTop())) {
            return false;
        }
        m9757t();
        wvi.d0(this);
        return true;
    }

    /* renamed from: v */
    public final ArrayList m9759v() {
        Rect rectM9739i;
        l77 l77Var = this.l0;
        if (l77Var == null || !l77Var.mo36655b() || this.l0.mo42700a().left == 0 || this.l0.mo42700a().top != 0 || (rectM9739i = m9739i(this.l0, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rectM9739i.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList(Arrays.asList(rect, new Rect(Math.min(width, rectM9739i.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    /* renamed from: w */
    public void m9760w(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z;
        View view2 = view;
        boolean zM9750l = m9750l();
        int width = zM9750l ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM9750l ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m9742x(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = zM9750l;
            } else {
                z = zM9750l;
                childAt.setVisibility((Math.max(zM9750l ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zM9750l ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zM9750l = z;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: d */
        public static final int[] f10225d = {R.attr.layout_weight};

        /* renamed from: a */
        public float f10226a;

        /* renamed from: b */
        public boolean f10227b;

        /* renamed from: c */
        public boolean f10228c;

        public LayoutParams() {
            super(-1, -1);
            this.f10226a = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10226a = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10226a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10226a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10225d);
            this.f10226a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10213a = 0;
        this.f10219g = 1.0f;
        this.f10210L = new CopyOnWriteArrayList();
        this.h0 = true;
        this.i0 = new Rect();
        this.j0 = new ArrayList();
        this.m0 = new C2459a();
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        wvi.m0(this, new C2460b());
        wvi.t0(this, 1);
        fwi fwiVarM27664o = fwi.m27664o(this, 0.5f, new C2461c());
        this.f10211M = fwiVarM27664o;
        fwiVarM27664o.m27680O(f * 400.0f);
        setFoldingFeatureObserver(new C2464a(a9j.m16703a(context), c64.getMainExecutor(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
