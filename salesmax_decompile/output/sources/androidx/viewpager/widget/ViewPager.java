package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.cast.MediaError;
import com.google.firebase.perf.util.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p001o.c64;
import p001o.cbc;
import p001o.cc;
import p001o.db;
import p001o.pic;
import p001o.r9j;
import p001o.wvi;

/* loaded from: classes2.dex */
public class ViewPager extends ViewGroup {
    public static final int[] U0 = {R.attr.layout_gravity};
    public static final Comparator V0 = new C2533a();
    public static final Interpolator W0 = new InterpolatorC2534b();
    public static final C2544l X0 = new C2544l();
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public EdgeEffect F0;
    public EdgeEffect G0;

    /* renamed from: H */
    public int f10466H;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public int K0;

    /* renamed from: L */
    public Drawable f10467L;
    public List L0;

    /* renamed from: M */
    public int f10468M;
    public InterfaceC2541i M0;
    public InterfaceC2541i N0;
    public List O0;
    public int P0;

    /* renamed from: Q */
    public int f10469Q;
    public int Q0;
    public ArrayList R0;
    public final Runnable S0;
    public int T0;

    /* renamed from: a */
    public int f10470a;

    /* renamed from: b */
    public final ArrayList f10471b;

    /* renamed from: c */
    public final C2538f f10472c;

    /* renamed from: d */
    public final Rect f10473d;

    /* renamed from: e */
    public pic f10474e;

    /* renamed from: f */
    public int f10475f;

    /* renamed from: g */
    public int f10476g;

    /* renamed from: h */
    public Parcelable f10477h;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public boolean p0;

    /* renamed from: q */
    public ClassLoader f10478q;
    public boolean q0;
    public int r0;

    /* renamed from: s */
    public Scroller f10479s;
    public int s0;
    public int t0;
    public float u0;
    public float v0;
    public float w0;

    /* renamed from: x */
    public boolean f10480x;
    public float x0;

    /* renamed from: y */
    public C2543k f10481y;
    public int y0;
    public VelocityTracker z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2532a();

        /* renamed from: c */
        public int f10488c;

        /* renamed from: d */
        public Parcelable f10489d;

        /* renamed from: e */
        public ClassLoader f10490e;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        public static class C2532a implements Parcelable.ClassLoaderCreator {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f10488c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10488c);
            parcel.writeParcelable(this.f10489d, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f10488c = parcel.readInt();
            this.f10489d = parcel.readParcelable(classLoader);
            this.f10490e = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C2533a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2538f c2538f, C2538f c2538f2) {
            return c2538f.f10495b - c2538f2.f10495b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class InterpolatorC2534b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    public class RunnableC2535c implements Runnable {
        public RunnableC2535c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewPager.this.setScrollState(0);
            ViewPager.this.m9975D();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    public class C2536d implements cbc {

        /* renamed from: a */
        public final Rect f10492a = new Rect();

        public C2536d() {
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            r9j r9jVarM55112Y = wvi.m55112Y(view, r9jVar);
            if (r9jVarM55112Y.m46400p()) {
                return r9jVarM55112Y;
            }
            Rect rect = this.f10492a;
            rect.left = r9jVarM55112Y.m46395j();
            rect.top = r9jVarM55112Y.m46397l();
            rect.right = r9jVarM55112Y.m46396k();
            rect.bottom = r9jVarM55112Y.m46394i();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                r9j r9jVarM55120g = wvi.m55120g(ViewPager.this.getChildAt(i), r9jVarM55112Y);
                rect.left = Math.min(r9jVarM55120g.m46395j(), rect.left);
                rect.top = Math.min(r9jVarM55120g.m46397l(), rect.top);
                rect.right = Math.min(r9jVarM55120g.m46396k(), rect.right);
                rect.bottom = Math.min(r9jVarM55120g.m46394i(), rect.bottom);
            }
            return r9jVarM55112Y.m46401q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface InterfaceC2537e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C2538f {

        /* renamed from: a */
        public Object f10494a;

        /* renamed from: b */
        public int f10495b;

        /* renamed from: c */
        public boolean f10496c;

        /* renamed from: d */
        public float f10497d;

        /* renamed from: e */
        public float f10498e;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public class C2539g extends db {
        public C2539g() {
        }

        @Override // p001o.db
        /* renamed from: f */
        public void mo5937f(View view, AccessibilityEvent accessibilityEvent) {
            pic picVar;
            super.mo5937f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m10018n());
            if (accessibilityEvent.getEventType() != 4096 || (picVar = ViewPager.this.f10474e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(picVar.mo27814d());
            accessibilityEvent.setFromIndex(ViewPager.this.f10475f);
            accessibilityEvent.setToIndex(ViewPager.this.f10475f);
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.o0(ViewPager.class.getName());
            ccVar.P0(m10018n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                ccVar.m20777a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                ccVar.m20777a(8192);
            }
        }

        @Override // p001o.db
        /* renamed from: j */
        public boolean mo5939j(View view, int i, Bundle bundle) throws Resources.NotFoundException {
            if (super.mo5939j(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f10475f + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f10475f - 1);
            return true;
        }

        /* renamed from: n */
        public final boolean m10018n() {
            pic picVar = ViewPager.this.f10474e;
            return picVar != null && picVar.mo27814d() > 1;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    public interface InterfaceC2540h {
        /* renamed from: d */
        void mo9970d(ViewPager viewPager, pic picVar, pic picVar2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface InterfaceC2541i {
        /* renamed from: a */
        void mo9967a(int i, float f, int i2);

        /* renamed from: b */
        void mo9968b(int i);

        /* renamed from: c */
        void mo9969c(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface InterfaceC2542j {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public class C2543k extends DataSetObserver {
        public C2543k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.m9996h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.m9996h();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    public static class C2544l implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f10482a;
            return z != layoutParams2.f10482a ? z ? 1 : -1 : layoutParams.f10486e - layoutParams2.f10486e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f10471b = new ArrayList();
        this.f10472c = new C2538f();
        this.f10473d = new Rect();
        this.f10476g = -1;
        this.f10477h = null;
        this.f10478q = null;
        this.h0 = -3.4028235E38f;
        this.i0 = Float.MAX_VALUE;
        this.o0 = 1;
        this.y0 = -1;
        this.H0 = true;
        this.I0 = false;
        this.S0 = new RunnableC2535c();
        this.T0 = 0;
        m10009u();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.m0 != z) {
            this.m0 = z;
        }
    }

    /* renamed from: v */
    public static boolean m9971v(View view) {
        return view.getClass().getAnnotation(InterfaceC2537e.class) != null;
    }

    /* renamed from: A */
    public boolean m9972A() throws Resources.NotFoundException {
        pic picVar = this.f10474e;
        if (picVar == null || this.f10475f >= picVar.mo27814d() - 1) {
            return false;
        }
        setCurrentItem(this.f10475f + 1, true);
        return true;
    }

    /* renamed from: B */
    public final boolean m9973B(int i) {
        if (this.f10471b.size() == 0) {
            if (this.H0) {
                return false;
            }
            this.J0 = false;
            m10011x(0, 0.0f, 0);
            if (this.J0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C2538f c2538fM10007s = m10007s();
        int clientWidth = getClientWidth();
        int i2 = this.f10466H;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = c2538fM10007s.f10495b;
        float f2 = ((i / f) - c2538fM10007s.f10498e) / (c2538fM10007s.f10497d + (i2 / f));
        this.J0 = false;
        m10011x(i4, f2, (int) (i3 * f2));
        if (this.J0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: C */
    public final boolean m9974C(float f) {
        boolean z;
        boolean z2;
        float f2 = this.u0 - f;
        this.u0 = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.h0 * clientWidth;
        float f4 = this.i0 * clientWidth;
        boolean z3 = false;
        C2538f c2538f = (C2538f) this.f10471b.get(0);
        ArrayList arrayList = this.f10471b;
        C2538f c2538f2 = (C2538f) arrayList.get(arrayList.size() - 1);
        if (c2538f.f10495b != 0) {
            f3 = c2538f.f10498e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c2538f2.f10495b != this.f10474e.mo27814d() - 1) {
            f4 = c2538f2.f10498e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.F0.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.G0.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.u0 += scrollX - i;
        scrollTo(i, getScrollY());
        m9973B(i);
        return z3;
    }

    /* renamed from: D */
    public void m9975D() throws Resources.NotFoundException {
        m9976E(this.f10475f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[PHI: r7 r10 r15
      0x00f7: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m9976E(int i) throws Resources.NotFoundException {
        C2538f c2538fM10008t;
        String hexString;
        C2538f c2538fM9989a;
        C2538f c2538fM10006r;
        C2538f c2538f;
        int i2 = this.f10475f;
        if (i2 != i) {
            c2538fM10008t = m10008t(i2);
            this.f10475f = i;
        } else {
            c2538fM10008t = null;
        }
        if (this.f10474e == null) {
            m9988Q();
            return;
        }
        if (this.n0) {
            m9988Q();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f10474e.m43745q(this);
        int i3 = this.o0;
        int iMax = Math.max(0, this.f10475f - i3);
        int iMo27814d = this.f10474e.mo27814d();
        int iMin = Math.min(iMo27814d - 1, this.f10475f + i3);
        if (iMo27814d != this.f10470a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f10470a + ", found: " + iMo27814d + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f10474e.getClass());
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f10471b.size()) {
                break;
            }
            c2538fM9989a = (C2538f) this.f10471b.get(i4);
            int i5 = c2538fM9989a.f10495b;
            int i6 = this.f10475f;
            if (i5 >= i6) {
                if (i5 != i6) {
                    break;
                }
            } else {
                i4++;
            }
        }
        if (c2538fM9989a == null && iMo27814d > 0) {
            c2538fM9989a = m9989a(this.f10475f, i4);
        }
        if (c2538fM9989a != null) {
            int i7 = i4 - 1;
            C2538f c2538f2 = i7 >= 0 ? (C2538f) this.f10471b.get(i7) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c2538fM9989a.f10497d) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i8 = this.f10475f - 1; i8 >= 0; i8--) {
                if (f >= paddingLeft && i8 < iMax) {
                    if (c2538f2 == null) {
                        break;
                    }
                    if (i8 == c2538f2.f10495b && !c2538f2.f10496c) {
                        this.f10471b.remove(i7);
                        this.f10474e.mo27813a(this, i8, c2538f2.f10494a);
                        i7--;
                        i4--;
                        if (i7 >= 0) {
                            c2538f = (C2538f) this.f10471b.get(i7);
                        }
                        c2538f2 = c2538f;
                    }
                } else if (c2538f2 == null || i8 != c2538f2.f10495b) {
                    f += m9989a(i8, i7 + 1).f10497d;
                    i4++;
                    c2538f = i7 >= 0 ? (C2538f) this.f10471b.get(i7) : null;
                    c2538f2 = c2538f;
                } else {
                    f += c2538f2.f10497d;
                    i7--;
                    if (i7 >= 0) {
                        c2538f = (C2538f) this.f10471b.get(i7);
                    }
                    c2538f2 = c2538f;
                }
            }
            float f2 = c2538fM9989a.f10497d;
            int i9 = i4 + 1;
            if (f2 < 2.0f) {
                C2538f c2538f3 = i9 < this.f10471b.size() ? (C2538f) this.f10471b.get(i9) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i10 = this.f10475f;
                while (true) {
                    i10++;
                    if (i10 >= iMo27814d) {
                        break;
                    }
                    if (f2 >= paddingRight && i10 > iMin) {
                        if (c2538f3 == null) {
                            break;
                        }
                        if (i10 == c2538f3.f10495b && !c2538f3.f10496c) {
                            this.f10471b.remove(i9);
                            this.f10474e.mo27813a(this, i10, c2538f3.f10494a);
                            if (i9 < this.f10471b.size()) {
                                c2538f3 = (C2538f) this.f10471b.get(i9);
                            }
                        }
                    } else if (c2538f3 == null || i10 != c2538f3.f10495b) {
                        C2538f c2538fM9989a2 = m9989a(i10, i9);
                        i9++;
                        f2 += c2538fM9989a2.f10497d;
                        c2538f3 = i9 < this.f10471b.size() ? (C2538f) this.f10471b.get(i9) : null;
                    } else {
                        f2 += c2538f3.f10497d;
                        i9++;
                        if (i9 < this.f10471b.size()) {
                            c2538f3 = (C2538f) this.f10471b.get(i9);
                        }
                    }
                }
            }
            m9993e(c2538fM9989a, i4, c2538fM10008t);
            this.f10474e.m43742n(this, this.f10475f, c2538fM9989a.f10494a);
        }
        this.f10474e.m43735c(this);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.f10487f = i11;
            if (!layoutParams.f10482a && layoutParams.f10484c == 0.0f && (c2538fM10006r = m10006r(childAt)) != null) {
                layoutParams.f10484c = c2538fM10006r.f10497d;
                layoutParams.f10486e = c2538fM10006r.f10495b;
            }
        }
        m9988Q();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            C2538f c2538fM10005q = viewFindFocus != null ? m10005q(viewFindFocus) : null;
            if (c2538fM10005q == null || c2538fM10005q.f10495b != this.f10475f) {
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    C2538f c2538fM10006r2 = m10006r(childAt2);
                    if (c2538fM10006r2 != null && c2538fM10006r2.f10495b == this.f10475f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public final void m9977F(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f10471b.isEmpty()) {
            if (!this.f10479s.isFinished()) {
                this.f10479s.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C2538f c2538fM10008t = m10008t(this.f10475f);
        int iMin = (int) ((c2538fM10008t != null ? Math.min(c2538fM10008t.f10498e, this.i0) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m9995g(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* renamed from: G */
    public final void m9978G() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f10482a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: H */
    public void m9979H(InterfaceC2540h interfaceC2540h) {
        List list = this.O0;
        if (list != null) {
            list.remove(interfaceC2540h);
        }
    }

    /* renamed from: I */
    public void m9980I(InterfaceC2541i interfaceC2541i) {
        List list = this.L0;
        if (list != null) {
            list.remove(interfaceC2541i);
        }
    }

    /* renamed from: J */
    public final void m9981J(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: K */
    public final boolean m9982K() {
        this.y0 = -1;
        m10002n();
        this.F0.onRelease();
        this.G0.onRelease();
        return this.F0.isFinished() || this.G0.isFinished();
    }

    /* renamed from: L */
    public final void m9983L(int i, boolean z, int i2, boolean z2) throws Resources.NotFoundException {
        C2538f c2538fM10008t = m10008t(i);
        int clientWidth = c2538fM10008t != null ? (int) (getClientWidth() * Math.max(this.h0, Math.min(c2538fM10008t.f10498e, this.i0))) : 0;
        if (z) {
            m9987P(clientWidth, 0, i2);
            if (z2) {
                m9999k(i);
                return;
            }
            return;
        }
        if (z2) {
            m9999k(i);
        }
        m9995g(false);
        scrollTo(clientWidth, 0);
        m9973B(clientWidth);
    }

    /* renamed from: M */
    public void m9984M(int i, boolean z, boolean z2) throws Resources.NotFoundException {
        m9985N(i, z, z2, 0);
    }

    /* renamed from: N */
    public void m9985N(int i, boolean z, boolean z2, int i2) throws Resources.NotFoundException {
        pic picVar = this.f10474e;
        if (picVar == null || picVar.mo27814d() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f10475f == i && this.f10471b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f10474e.mo27814d()) {
            i = this.f10474e.mo27814d() - 1;
        }
        int i3 = this.o0;
        int i4 = this.f10475f;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.f10471b.size(); i5++) {
                ((C2538f) this.f10471b.get(i5)).f10496c = true;
            }
        }
        boolean z3 = this.f10475f != i;
        if (!this.H0) {
            m9976E(i);
            m9983L(i, z, i2, z3);
        } else {
            this.f10475f = i;
            if (z3) {
                m9999k(i);
            }
            requestLayout();
        }
    }

    /* renamed from: O */
    public InterfaceC2541i m9986O(InterfaceC2541i interfaceC2541i) {
        InterfaceC2541i interfaceC2541i2 = this.N0;
        this.N0 = interfaceC2541i;
        return interfaceC2541i2;
    }

    /* renamed from: P */
    public void m9987P(int i, int i2, int i3) throws Resources.NotFoundException {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f10479s;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f10480x ? this.f10479s.getCurrX() : this.f10479s.getStartX();
            this.f10479s.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m9995g(false);
            m9975D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fM10001m = f2 + (m10001m(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int iAbs = Math.abs(i3);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fM10001m / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / ((f * this.f10474e.m43737g(this.f10475f)) + this.f10466H)) + 1.0f) * 100.0f), MediaError.DetailedErrorCode.TEXT_UNKNOWN);
        this.f10480x = false;
        this.f10479s.startScroll(i4, scrollY, i5, i6, iMin);
        wvi.d0(this);
    }

    /* renamed from: Q */
    public final void m9988Q() {
        if (this.Q0 != 0) {
            ArrayList arrayList = this.R0;
            if (arrayList == null) {
                this.R0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.R0.add(getChildAt(i));
            }
            Collections.sort(this.R0, X0);
        }
    }

    /* renamed from: a */
    public C2538f m9989a(int i, int i2) {
        C2538f c2538f = new C2538f();
        c2538f.f10495b = i;
        c2538f.f10494a = this.f10474e.mo27816h(this, i);
        c2538f.f10497d = this.f10474e.m43737g(i);
        if (i2 < 0 || i2 >= this.f10471b.size()) {
            this.f10471b.add(c2538f);
        } else {
            this.f10471b.add(i2, c2538f);
        }
        return c2538f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        C2538f c2538fM10006r;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c2538fM10006r = m10006r(childAt)) != null && c2538fM10006r.f10495b == this.f10475f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        C2538f c2538fM10006r;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c2538fM10006r = m10006r(childAt)) != null && c2538fM10006r.f10495b == this.f10475f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zM9971v = layoutParams2.f10482a | m9971v(view);
        layoutParams2.f10482a = zM9971v;
        if (!this.l0) {
            super.addView(view, i, layoutParams);
        } else {
            if (zM9971v) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f10485d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* renamed from: b */
    public void m9990b(InterfaceC2540h interfaceC2540h) {
        if (this.O0 == null) {
            this.O0 = new ArrayList();
        }
        this.O0.add(interfaceC2540h);
    }

    /* renamed from: c */
    public void m9991c(InterfaceC2541i interfaceC2541i) {
        if (this.L0 == null) {
            this.L0 = new ArrayList();
        }
        this.L0.add(interfaceC2541i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f10474e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.h0)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.i0));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f10480x = true;
        if (this.f10479s.isFinished() || !this.f10479s.computeScrollOffset()) {
            m9995g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f10479s.getCurrX();
        int currY = this.f10479s.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m9973B(currX)) {
                this.f10479s.abortAnimation();
                scrollTo(0, currY);
            }
        }
        wvi.d0(this);
    }

    /* renamed from: d */
    public boolean m9992d(int i) throws Resources.NotFoundException {
        boolean z;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zM10013z = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                sb2.append(sb.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i == 17) {
                zRequestFocus = (viewFindFocus == null || m10004p(this.f10473d, viewFindNextFocus).left < m10004p(this.f10473d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m10013z();
            } else if (i == 66) {
                zRequestFocus = (viewFindFocus == null || m10004p(this.f10473d, viewFindNextFocus).left > m10004p(this.f10473d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m9972A();
            }
            zM10013z = zRequestFocus;
        } else if (i == 17 || i == 1) {
            zM10013z = m10013z();
        } else if (i == 66 || i == 2) {
            zM10013z = m9972A();
        }
        if (zM10013z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM10013z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m10003o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C2538f c2538fM10006r;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c2538fM10006r = m10006r(childAt)) != null && c2538fM10006r.f10495b == this.f10475f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        pic picVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (picVar = this.f10474e) != null && picVar.mo27814d() > 1)) {
            if (!this.F0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.h0 * width);
                this.F0.setSize(height, width);
                zDraw = false | this.F0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.G0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.i0 + 1.0f)) * width2);
                this.G0.setSize(height2, width2);
                zDraw |= this.G0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.F0.finish();
            this.G0.finish();
        }
        if (zDraw) {
            wvi.d0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10467L;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: e */
    public final void m9993e(C2538f c2538f, int i, C2538f c2538f2) {
        int i2;
        int i3;
        C2538f c2538f3;
        C2538f c2538f4;
        int iMo27814d = this.f10474e.mo27814d();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f10466H / clientWidth : 0.0f;
        if (c2538f2 != null) {
            int i4 = c2538f2.f10495b;
            int i5 = c2538f.f10495b;
            if (i4 < i5) {
                float fM43737g = c2538f2.f10498e + c2538f2.f10497d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c2538f.f10495b && i7 < this.f10471b.size()) {
                    Object obj = this.f10471b.get(i7);
                    while (true) {
                        c2538f4 = (C2538f) obj;
                        if (i6 <= c2538f4.f10495b || i7 >= this.f10471b.size() - 1) {
                            break;
                        }
                        i7++;
                        obj = this.f10471b.get(i7);
                    }
                    while (i6 < c2538f4.f10495b) {
                        fM43737g += this.f10474e.m43737g(i6) + f;
                        i6++;
                    }
                    c2538f4.f10498e = fM43737g;
                    fM43737g += c2538f4.f10497d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f10471b.size() - 1;
                float fM43737g2 = c2538f2.f10498e;
                while (true) {
                    i4--;
                    if (i4 < c2538f.f10495b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f10471b.get(size);
                    while (true) {
                        c2538f3 = (C2538f) obj2;
                        if (i4 >= c2538f3.f10495b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f10471b.get(size);
                    }
                    while (i4 > c2538f3.f10495b) {
                        fM43737g2 -= this.f10474e.m43737g(i4) + f;
                        i4--;
                    }
                    fM43737g2 -= c2538f3.f10497d + f;
                    c2538f3.f10498e = fM43737g2;
                }
            }
        }
        int size2 = this.f10471b.size();
        float fM43737g3 = c2538f.f10498e;
        int i8 = c2538f.f10495b;
        int i9 = i8 - 1;
        this.h0 = i8 == 0 ? fM43737g3 : -3.4028235E38f;
        int i10 = iMo27814d - 1;
        this.i0 = i8 == i10 ? (c2538f.f10497d + fM43737g3) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C2538f c2538f5 = (C2538f) this.f10471b.get(i11);
            while (true) {
                i3 = c2538f5.f10495b;
                if (i9 <= i3) {
                    break;
                }
                fM43737g3 -= this.f10474e.m43737g(i9) + f;
                i9--;
            }
            fM43737g3 -= c2538f5.f10497d + f;
            c2538f5.f10498e = fM43737g3;
            if (i3 == 0) {
                this.h0 = fM43737g3;
            }
            i11--;
            i9--;
        }
        float fM43737g4 = c2538f.f10498e + c2538f.f10497d + f;
        int i12 = c2538f.f10495b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C2538f c2538f6 = (C2538f) this.f10471b.get(i13);
            while (true) {
                i2 = c2538f6.f10495b;
                if (i12 >= i2) {
                    break;
                }
                fM43737g4 += this.f10474e.m43737g(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.i0 = (c2538f6.f10497d + fM43737g4) - 1.0f;
            }
            c2538f6.f10498e = fM43737g4;
            fM43737g4 += c2538f6.f10497d + f;
            i13++;
            i12++;
        }
        this.I0 = false;
    }

    /* renamed from: f */
    public boolean m9994f(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m9994f(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* renamed from: g */
    public final void m9995g(boolean z) {
        boolean z2 = this.T0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f10479s.isFinished()) {
                this.f10479s.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f10479s.getCurrX();
                int currY = this.f10479s.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m9973B(currX);
                    }
                }
            }
        }
        this.n0 = false;
        for (int i = 0; i < this.f10471b.size(); i++) {
            C2538f c2538f = (C2538f) this.f10471b.get(i);
            if (c2538f.f10496c) {
                c2538f.f10496c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                wvi.e0(this, this.S0);
            } else {
                this.S0.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public pic getAdapter() {
        return this.f10474e;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.Q0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.R0.get(i2)).getLayoutParams()).f10487f;
    }

    public int getCurrentItem() {
        return this.f10475f;
    }

    public int getOffscreenPageLimit() {
        return this.o0;
    }

    public int getPageMargin() {
        return this.f10466H;
    }

    /* renamed from: h */
    public void m9996h() throws Resources.NotFoundException {
        int iMo27814d = this.f10474e.mo27814d();
        this.f10470a = iMo27814d;
        boolean z = this.f10471b.size() < (this.o0 * 2) + 1 && this.f10471b.size() < iMo27814d;
        int iMax = this.f10475f;
        int i = 0;
        boolean z2 = false;
        while (i < this.f10471b.size()) {
            C2538f c2538f = (C2538f) this.f10471b.get(i);
            int iM43736e = this.f10474e.m43736e(c2538f.f10494a);
            if (iM43736e != -1) {
                if (iM43736e == -2) {
                    this.f10471b.remove(i);
                    i--;
                    if (!z2) {
                        this.f10474e.m43745q(this);
                        z2 = true;
                    }
                    this.f10474e.mo27813a(this, c2538f.f10495b, c2538f.f10494a);
                    int i2 = this.f10475f;
                    if (i2 == c2538f.f10495b) {
                        iMax = Math.max(0, Math.min(i2, iMo27814d - 1));
                    }
                } else {
                    int i3 = c2538f.f10495b;
                    if (i3 != iM43736e) {
                        if (i3 == this.f10475f) {
                            iMax = iM43736e;
                        }
                        c2538f.f10495b = iM43736e;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.f10474e.m43735c(this);
        }
        Collections.sort(this.f10471b, V0);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                if (!layoutParams.f10482a) {
                    layoutParams.f10484c = 0.0f;
                }
            }
            m9984M(iMax, false, true);
            requestLayout();
        }
    }

    /* renamed from: i */
    public final int m9997i(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.C0 || Math.abs(i2) <= this.A0) {
            i += (int) (f + (i >= this.f10475f ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f10471b.size() <= 0) {
            return i;
        }
        return Math.max(((C2538f) this.f10471b.get(0)).f10495b, Math.min(i, ((C2538f) this.f10471b.get(r4.size() - 1)).f10495b));
    }

    /* renamed from: j */
    public final void m9998j(int i, float f, int i2) {
        InterfaceC2541i interfaceC2541i = this.M0;
        if (interfaceC2541i != null) {
            interfaceC2541i.mo9967a(i, f, i2);
        }
        List list = this.L0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC2541i interfaceC2541i2 = (InterfaceC2541i) this.L0.get(i3);
                if (interfaceC2541i2 != null) {
                    interfaceC2541i2.mo9967a(i, f, i2);
                }
            }
        }
        InterfaceC2541i interfaceC2541i3 = this.N0;
        if (interfaceC2541i3 != null) {
            interfaceC2541i3.mo9967a(i, f, i2);
        }
    }

    /* renamed from: k */
    public final void m9999k(int i) {
        InterfaceC2541i interfaceC2541i = this.M0;
        if (interfaceC2541i != null) {
            interfaceC2541i.mo9969c(i);
        }
        List list = this.L0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2541i interfaceC2541i2 = (InterfaceC2541i) this.L0.get(i2);
                if (interfaceC2541i2 != null) {
                    interfaceC2541i2.mo9969c(i);
                }
            }
        }
        InterfaceC2541i interfaceC2541i3 = this.N0;
        if (interfaceC2541i3 != null) {
            interfaceC2541i3.mo9969c(i);
        }
    }

    /* renamed from: l */
    public final void m10000l(int i) {
        InterfaceC2541i interfaceC2541i = this.M0;
        if (interfaceC2541i != null) {
            interfaceC2541i.mo9968b(i);
        }
        List list = this.L0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2541i interfaceC2541i2 = (InterfaceC2541i) this.L0.get(i2);
                if (interfaceC2541i2 != null) {
                    interfaceC2541i2.mo9968b(i);
                }
            }
        }
        InterfaceC2541i interfaceC2541i3 = this.N0;
        if (interfaceC2541i3 != null) {
            interfaceC2541i3.mo9968b(i);
        }
    }

    /* renamed from: m */
    public float m10001m(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: n */
    public final void m10002n() {
        this.p0 = false;
        this.q0 = false;
        VelocityTracker velocityTracker = this.z0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.z0 = null;
        }
    }

    /* renamed from: o */
    public boolean m10003o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? m10013z() : m9992d(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? m9972A() : m9992d(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m9992d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m9992d(1);
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.S0);
        Scroller scroller = this.f10479s;
        if (scroller != null && !scroller.isFinished()) {
            this.f10479s.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f10466H <= 0 || this.f10467L == null || this.f10471b.size() <= 0 || this.f10474e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f3 = this.f10466H / width;
        int i2 = 0;
        C2538f c2538f = (C2538f) this.f10471b.get(0);
        float f4 = c2538f.f10498e;
        int size = this.f10471b.size();
        int i3 = c2538f.f10495b;
        int i4 = ((C2538f) this.f10471b.get(size - 1)).f10495b;
        while (i3 < i4) {
            while (true) {
                i = c2538f.f10495b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c2538f = (C2538f) this.f10471b.get(i2);
            }
            if (i3 == i) {
                float f5 = c2538f.f10498e;
                float f6 = c2538f.f10497d;
                f = (f5 + f6) * width;
                f4 = f5 + f6 + f3;
            } else {
                float fM43737g = this.f10474e.m43737g(i3);
                f = (f4 + fM43737g) * width;
                f4 += fM43737g + f3;
            }
            if (this.f10466H + f > scrollX) {
                f2 = f3;
                this.f10467L.setBounds(Math.round(f), this.f10468M, Math.round(this.f10466H + f), this.f10469Q);
                this.f10467L.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + r2) {
                return;
            }
            i3++;
            f3 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & Constants.MAX_HOST_LENGTH;
        if (action == 3 || action == 1) {
            m9982K();
            return false;
        }
        if (action != 0) {
            if (this.p0) {
                return true;
            }
            if (this.q0) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.w0 = x;
            this.u0 = x;
            float y = motionEvent.getY();
            this.x0 = y;
            this.v0 = y;
            this.y0 = motionEvent.getPointerId(0);
            this.q0 = false;
            this.f10480x = true;
            this.f10479s.computeScrollOffset();
            if (this.T0 != 2 || Math.abs(this.f10479s.getFinalX() - this.f10479s.getCurrX()) <= this.D0) {
                m9995g(false);
                this.p0 = false;
            } else {
                this.f10479s.abortAnimation();
                this.n0 = false;
                m9975D();
                this.p0 = true;
                m9981J(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.y0;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.u0;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.x0);
                if (f != 0.0f && !m10010w(this.u0, f) && m9994f(this, false, (int) f, (int) x2, (int) y2)) {
                    this.u0 = x2;
                    this.v0 = y2;
                    this.q0 = true;
                    return false;
                }
                int i2 = this.t0;
                if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                    this.p0 = true;
                    m9981J(true);
                    setScrollState(1);
                    float f2 = this.w0;
                    float f3 = this.t0;
                    this.u0 = f > 0.0f ? f2 + f3 : f2 - f3;
                    this.v0 = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i2) {
                    this.q0 = true;
                }
                if (this.p0 && m9974C(x2)) {
                    wvi.d0(this);
                }
            }
        } else if (action == 6) {
            m10012y(motionEvent);
        }
        if (this.z0 == null) {
            this.z0 = VelocityTracker.obtain();
        }
        this.z0.addMovement(motionEvent);
        return this.p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        boolean z2;
        C2538f c2538fM10006r;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f10482a) {
                    int i9 = layoutParams.f10483b;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 == 16) {
                            if (i11 == 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, paddingTop + childAt.getMeasuredHeight());
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i122 = paddingLeft + scrollX;
                        childAt.layout(i122, paddingTop, childAt.getMeasuredWidth() + i122, paddingTop + childAt.getMeasuredHeight());
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i14;
                    if (i11 == 16) {
                    }
                    int i132 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i132;
                    int i1222 = paddingLeft + scrollX;
                    childAt.layout(i1222, paddingTop, childAt.getMeasuredWidth() + i1222, paddingTop + childAt.getMeasuredHeight());
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i15 = (i5 - paddingLeft) - paddingRight;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f10482a && (c2538fM10006r = m10006r(childAt2)) != null) {
                    float f = i15;
                    int i17 = ((int) (c2538fM10006r.f10498e * f)) + paddingLeft;
                    if (layoutParams2.f10485d) {
                        layoutParams2.f10485d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f10484c), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i17, paddingTop, childAt2.getMeasuredWidth() + i17, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f10468M = paddingTop;
        this.f10469Q = i6 - paddingBottom;
        this.K0 = i7;
        if (this.H0) {
            z2 = false;
            m9983L(this.f10475f, false, 0, false);
        } else {
            z2 = false;
        }
        this.H0 = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) throws Resources.NotFoundException {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.s0 = Math.min(measuredWidth / 10, this.r0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f10482a) {
                int i6 = layoutParams2.f10483b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.j0 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.k0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.l0 = true;
        m9975D();
        this.l0 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f10482a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f10484c), 1073741824), this.k0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C2538f c2538fM10006r;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c2538fM10006r = m10006r(childAt)) != null && c2538fM10006r.f10495b == this.f10475f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        pic picVar = this.f10474e;
        if (picVar != null) {
            picVar.m43739k(savedState.f10489d, savedState.f10490e);
            m9984M(savedState.f10488c, false, true);
        } else {
            this.f10476g = savedState.f10488c;
            this.f10477h = savedState.f10489d;
            this.f10478q = savedState.f10490e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10488c = this.f10475f;
        pic picVar = this.f10474e;
        if (picVar != null) {
            savedState.f10489d = picVar.m43740l();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f10466H;
            m9977F(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        pic picVar;
        if (this.E0) {
            return true;
        }
        boolean zM9982K = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (picVar = this.f10474e) == null || picVar.mo27814d() == 0) {
            return false;
        }
        if (this.z0 == null) {
            this.z0 = VelocityTracker.obtain();
        }
        this.z0.addMovement(motionEvent);
        int action = motionEvent.getAction() & Constants.MAX_HOST_LENGTH;
        if (action == 0) {
            this.f10479s.abortAnimation();
            this.n0 = false;
            m9975D();
            float x = motionEvent.getX();
            this.w0 = x;
            this.u0 = x;
            float y = motionEvent.getY();
            this.x0 = y;
            this.v0 = y;
            this.y0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.u0 = motionEvent.getX(actionIndex);
                        this.y0 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m10012y(motionEvent);
                        this.u0 = motionEvent.getX(motionEvent.findPointerIndex(this.y0));
                    }
                } else if (this.p0) {
                    m9983L(this.f10475f, true, 0, false);
                    zM9982K = m9982K();
                }
            } else if (!this.p0) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.y0);
                if (iFindPointerIndex == -1) {
                    zM9982K = m9982K();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.u0);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.v0);
                    if (fAbs > this.t0 && fAbs > fAbs2) {
                        this.p0 = true;
                        m9981J(true);
                        float f = this.w0;
                        this.u0 = x2 - f > 0.0f ? f + this.t0 : f - this.t0;
                        this.v0 = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.p0) {
                    }
                }
            } else if (this.p0) {
                zM9982K = false | m9974C(motionEvent.getX(motionEvent.findPointerIndex(this.y0)));
            }
        } else if (this.p0) {
            VelocityTracker velocityTracker = this.z0;
            velocityTracker.computeCurrentVelocity(1000, this.B0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.y0);
            this.n0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C2538f c2538fM10007s = m10007s();
            float f2 = clientWidth;
            m9985N(m9997i(c2538fM10007s.f10495b, ((scrollX / f2) - c2538fM10007s.f10498e) / (c2538fM10007s.f10497d + (this.f10466H / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.y0)) - this.w0)), true, true, xVelocity);
            zM9982K = m9982K();
        }
        if (zM9982K) {
            wvi.d0(this);
        }
        return true;
    }

    /* renamed from: p */
    public final Rect m10004p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: q */
    public C2538f m10005q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m10006r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: r */
    public C2538f m10006r(View view) {
        for (int i = 0; i < this.f10471b.size(); i++) {
            C2538f c2538f = (C2538f) this.f10471b.get(i);
            if (this.f10474e.mo27817i(view, c2538f.f10494a)) {
                return c2538f;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.l0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public final C2538f m10007s() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f10466H / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        C2538f c2538f = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.f10471b.size()) {
            C2538f c2538f2 = (C2538f) this.f10471b.get(i2);
            if (!z && c2538f2.f10495b != (i = i3 + 1)) {
                c2538f2 = this.f10472c;
                c2538f2.f10498e = f + f3 + f2;
                c2538f2.f10495b = i;
                c2538f2.f10497d = this.f10474e.m43737g(i);
                i2--;
            }
            C2538f c2538f3 = c2538f2;
            f = c2538f3.f10498e;
            float f4 = c2538f3.f10497d + f + f2;
            if (!z && scrollX < f) {
                return c2538f;
            }
            if (scrollX < f4 || i2 == this.f10471b.size() - 1) {
                return c2538f3;
            }
            int i4 = c2538f3.f10495b;
            float f5 = c2538f3.f10497d;
            i2++;
            z = false;
            i3 = i4;
            f3 = f5;
            c2538f = c2538f3;
        }
        return c2538f;
    }

    public void setAdapter(pic picVar) throws Resources.NotFoundException {
        pic picVar2 = this.f10474e;
        if (picVar2 != null) {
            picVar2.m43743o(null);
            this.f10474e.m43745q(this);
            for (int i = 0; i < this.f10471b.size(); i++) {
                C2538f c2538f = (C2538f) this.f10471b.get(i);
                this.f10474e.mo27813a(this, c2538f.f10495b, c2538f.f10494a);
            }
            this.f10474e.m43735c(this);
            this.f10471b.clear();
            m9978G();
            this.f10475f = 0;
            scrollTo(0, 0);
        }
        pic picVar3 = this.f10474e;
        this.f10474e = picVar;
        this.f10470a = 0;
        if (picVar != null) {
            if (this.f10481y == null) {
                this.f10481y = new C2543k();
            }
            this.f10474e.m43743o(this.f10481y);
            this.n0 = false;
            boolean z = this.H0;
            this.H0 = true;
            this.f10470a = this.f10474e.mo27814d();
            if (this.f10476g >= 0) {
                this.f10474e.m43739k(this.f10477h, this.f10478q);
                m9984M(this.f10476g, false, true);
                this.f10476g = -1;
                this.f10477h = null;
                this.f10478q = null;
            } else if (z) {
                requestLayout();
            } else {
                m9975D();
            }
        }
        List list = this.O0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.O0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC2540h) this.O0.get(i2)).mo9970d(this, picVar3, picVar);
        }
    }

    public void setCurrentItem(int i) throws Resources.NotFoundException {
        this.n0 = false;
        m9984M(i, !this.H0, false);
    }

    public void setOffscreenPageLimit(int i) throws Resources.NotFoundException {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            i = 1;
        }
        if (i != this.o0) {
            this.o0 = i;
            m9975D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC2541i interfaceC2541i) {
        this.M0 = interfaceC2541i;
    }

    public void setPageMargin(int i) {
        int i2 = this.f10466H;
        this.f10466H = i;
        int width = getWidth();
        m9977F(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f10467L = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, InterfaceC2542j interfaceC2542j) throws Resources.NotFoundException {
        setPageTransformer(z, interfaceC2542j, 2);
    }

    public void setScrollState(int i) {
        if (this.T0 == i) {
            return;
        }
        this.T0 = i;
        m10000l(i);
    }

    /* renamed from: t */
    public C2538f m10008t(int i) {
        for (int i2 = 0; i2 < this.f10471b.size(); i2++) {
            C2538f c2538f = (C2538f) this.f10471b.get(i2);
            if (c2538f.f10495b == i) {
                return c2538f;
            }
        }
        return null;
    }

    /* renamed from: u */
    public void m10009u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f10479s = new Scroller(context, W0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.t0 = viewConfiguration.getScaledPagingTouchSlop();
        this.A0 = (int) (400.0f * f);
        this.B0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.F0 = new EdgeEffect(context);
        this.G0 = new EdgeEffect(context);
        this.C0 = (int) (25.0f * f);
        this.D0 = (int) (2.0f * f);
        this.r0 = (int) (f * 16.0f);
        wvi.m0(this, new C2539g());
        if (wvi.m55137x(this) == 0) {
            wvi.t0(this, 1);
        }
        wvi.x0(this, new C2536d());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10467L;
    }

    /* renamed from: w */
    public final boolean m10010w(float f, float f2) {
        return (f < ((float) this.s0) && f2 > 0.0f) || (f > ((float) (getWidth() - this.s0)) && f2 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m10011x(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.K0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f10482a) {
                    int i4 = layoutParams.f10483b & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = width;
                }
            }
        }
        m9998j(i, f, i2);
        this.J0 = true;
    }

    /* renamed from: y */
    public final void m10012y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.y0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.u0 = motionEvent.getX(i);
            this.y0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.z0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: z */
    public boolean m10013z() throws Resources.NotFoundException {
        int i = this.f10475f;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f10482a;

        /* renamed from: b */
        public int f10483b;

        /* renamed from: c */
        public float f10484c;

        /* renamed from: d */
        public boolean f10485d;

        /* renamed from: e */
        public int f10486e;

        /* renamed from: f */
        public int f10487f;

        public LayoutParams() {
            super(-1, -1);
            this.f10484c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10484c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.U0);
            this.f10483b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z, InterfaceC2542j interfaceC2542j, int i) throws Resources.NotFoundException {
        boolean z2 = interfaceC2542j != null;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.Q0 = z ? 2 : 1;
            this.P0 = i;
        } else {
            this.Q0 = 0;
        }
        if (z2) {
            m9975D();
        }
    }

    public void setCurrentItem(int i, boolean z) throws Resources.NotFoundException {
        this.n0 = false;
        m9984M(i, z, false);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(c64.getDrawable(getContext(), i));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10471b = new ArrayList();
        this.f10472c = new C2538f();
        this.f10473d = new Rect();
        this.f10476g = -1;
        this.f10477h = null;
        this.f10478q = null;
        this.h0 = -3.4028235E38f;
        this.i0 = Float.MAX_VALUE;
        this.o0 = 1;
        this.y0 = -1;
        this.H0 = true;
        this.I0 = false;
        this.S0 = new RunnableC2535c();
        this.T0 = 0;
        m10009u();
    }
}
