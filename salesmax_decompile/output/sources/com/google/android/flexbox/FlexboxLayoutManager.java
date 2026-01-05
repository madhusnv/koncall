package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC2408n;
import androidx.recyclerview.widget.C2406l;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C10898b;
import java.util.ArrayList;
import java.util.List;
import p001o.n27;

/* loaded from: classes5.dex */
public class FlexboxLayoutManager extends RecyclerView.AbstractC2379p implements n27, RecyclerView.AbstractC2388y.b {
    public static final Rect G0 = new Rect();
    public boolean A0;
    public SparseArray B0;
    public final Context C0;
    public View D0;
    public int E0;
    public C10898b.b F0;

    /* renamed from: Z */
    public int f11885Z;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public List n0;
    public final C10898b o0;
    public RecyclerView.C2385v p0;
    public RecyclerView.C2389z q0;
    public C10896c r0;
    public C10895b s0;
    public AbstractC2408n t0;
    public AbstractC2408n u0;
    public SavedState v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    public class C10895b {

        /* renamed from: a */
        public int f11897a;

        /* renamed from: b */
        public int f11898b;

        /* renamed from: c */
        public int f11899c;

        /* renamed from: d */
        public int f11900d;

        /* renamed from: e */
        public boolean f11901e;

        /* renamed from: f */
        public boolean f11902f;

        /* renamed from: g */
        public boolean f11903g;

        public C10895b() {
            this.f11900d = 0;
        }

        /* renamed from: l */
        public static /* synthetic */ int m13698l(C10895b c10895b, int i) {
            int i2 = c10895b.f11900d + i;
            c10895b.f11900d = i2;
            return i2;
        }

        /* renamed from: r */
        public final void m13704r() {
            if (FlexboxLayoutManager.this.mo13663q() || !FlexboxLayoutManager.this.l0) {
                this.f11899c = this.f11901e ? FlexboxLayoutManager.this.t0.mo9632i() : FlexboxLayoutManager.this.t0.mo9637n();
            } else {
                this.f11899c = this.f11901e ? FlexboxLayoutManager.this.t0.mo9632i() : FlexboxLayoutManager.this.z0() - FlexboxLayoutManager.this.t0.mo9637n();
            }
        }

        /* renamed from: s */
        public final void m13705s(View view) {
            AbstractC2408n abstractC2408n = FlexboxLayoutManager.this.h0 == 0 ? FlexboxLayoutManager.this.u0 : FlexboxLayoutManager.this.t0;
            if (FlexboxLayoutManager.this.mo13663q() || !FlexboxLayoutManager.this.l0) {
                if (this.f11901e) {
                    this.f11899c = abstractC2408n.mo9627d(view) + abstractC2408n.m9639p();
                } else {
                    this.f11899c = abstractC2408n.mo9630g(view);
                }
            } else if (this.f11901e) {
                this.f11899c = abstractC2408n.mo9630g(view) + abstractC2408n.m9639p();
            } else {
                this.f11899c = abstractC2408n.mo9627d(view);
            }
            this.f11897a = FlexboxLayoutManager.this.s0(view);
            this.f11903g = false;
            int[] iArr = FlexboxLayoutManager.this.o0.f11935c;
            int i = this.f11897a;
            if (i == -1) {
                i = 0;
            }
            int i2 = iArr[i];
            this.f11898b = i2 != -1 ? i2 : 0;
            if (FlexboxLayoutManager.this.n0.size() > this.f11898b) {
                this.f11897a = ((C10897a) FlexboxLayoutManager.this.n0.get(this.f11898b)).f11929o;
            }
        }

        /* renamed from: t */
        public final void m13706t() {
            this.f11897a = -1;
            this.f11898b = -1;
            this.f11899c = Integer.MIN_VALUE;
            this.f11902f = false;
            this.f11903g = false;
            if (FlexboxLayoutManager.this.mo13663q()) {
                if (FlexboxLayoutManager.this.h0 == 0) {
                    this.f11901e = FlexboxLayoutManager.this.f11885Z == 1;
                    return;
                } else {
                    this.f11901e = FlexboxLayoutManager.this.h0 == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.h0 == 0) {
                this.f11901e = FlexboxLayoutManager.this.f11885Z == 3;
            } else {
                this.f11901e = FlexboxLayoutManager.this.h0 == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f11897a + ", mFlexLinePosition=" + this.f11898b + ", mCoordinate=" + this.f11899c + ", mPerpendicularCoordinate=" + this.f11900d + ", mLayoutFromEnd=" + this.f11901e + ", mValid=" + this.f11902f + ", mAssignedFromSavedState=" + this.f11903g + '}';
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    public static class C10896c {

        /* renamed from: a */
        public int f11905a;

        /* renamed from: b */
        public boolean f11906b;

        /* renamed from: c */
        public int f11907c;

        /* renamed from: d */
        public int f11908d;

        /* renamed from: e */
        public int f11909e;

        /* renamed from: f */
        public int f11910f;

        /* renamed from: g */
        public int f11911g;

        /* renamed from: h */
        public int f11912h;

        /* renamed from: i */
        public int f11913i;

        /* renamed from: j */
        public boolean f11914j;

        public C10896c() {
            this.f11912h = 1;
            this.f11913i = 1;
        }

        /* renamed from: c */
        public static /* synthetic */ int m13712c(C10896c c10896c, int i) {
            int i2 = c10896c.f11909e + i;
            c10896c.f11909e = i2;
            return i2;
        }

        /* renamed from: d */
        public static /* synthetic */ int m13713d(C10896c c10896c, int i) {
            int i2 = c10896c.f11909e - i;
            c10896c.f11909e = i2;
            return i2;
        }

        /* renamed from: i */
        public static /* synthetic */ int m13718i(C10896c c10896c, int i) {
            int i2 = c10896c.f11905a - i;
            c10896c.f11905a = i2;
            return i2;
        }

        /* renamed from: l */
        public static /* synthetic */ int m13721l(C10896c c10896c) {
            int i = c10896c.f11907c;
            c10896c.f11907c = i + 1;
            return i;
        }

        /* renamed from: m */
        public static /* synthetic */ int m13722m(C10896c c10896c) {
            int i = c10896c.f11907c;
            c10896c.f11907c = i - 1;
            return i;
        }

        /* renamed from: n */
        public static /* synthetic */ int m13723n(C10896c c10896c, int i) {
            int i2 = c10896c.f11907c + i;
            c10896c.f11907c = i2;
            return i2;
        }

        /* renamed from: q */
        public static /* synthetic */ int m13726q(C10896c c10896c, int i) {
            int i2 = c10896c.f11910f + i;
            c10896c.f11910f = i2;
            return i2;
        }

        /* renamed from: u */
        public static /* synthetic */ int m13730u(C10896c c10896c, int i) {
            int i2 = c10896c.f11908d + i;
            c10896c.f11908d = i2;
            return i2;
        }

        /* renamed from: v */
        public static /* synthetic */ int m13731v(C10896c c10896c, int i) {
            int i2 = c10896c.f11908d - i;
            c10896c.f11908d = i2;
            return i2;
        }

        /* renamed from: D */
        public final boolean m13736D(RecyclerView.C2389z c2389z, List list) {
            int i;
            int i2 = this.f11908d;
            return i2 >= 0 && i2 < c2389z.m9344b() && (i = this.f11907c) >= 0 && i < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f11905a + ", mFlexLinePosition=" + this.f11907c + ", mPosition=" + this.f11908d + ", mOffset=" + this.f11909e + ", mScrollingOffset=" + this.f11910f + ", mLastScrollDelta=" + this.f11911g + ", mItemDirection=" + this.f11912h + ", mLayoutDirection=" + this.f11913i + '}';
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    public static boolean I0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private boolean S1(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && H0() && I0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && I0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: A */
    public boolean mo9027A() {
        if (this.h0 == 0) {
            return mo13663q();
        }
        if (mo13663q()) {
            int iZ0 = z0();
            View view = this.D0;
            if (iZ0 <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final View A2() {
        return m9240Y(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: B */
    public boolean mo9028B() {
        if (this.h0 == 0) {
            return !mo13663q();
        }
        if (mo13663q()) {
            return true;
        }
        int iM0 = m0();
        View view = this.D0;
        return iM0 > (view != null ? view.getHeight() : 0);
    }

    public final int B2(View view) {
        return g0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: C */
    public boolean mo9009C(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final int C2(View view) {
        return j0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public boolean D0() {
        return true;
    }

    public final int D2(View view) {
        return k0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    public final int E2(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0 || i == 0) {
            return 0;
        }
        n2();
        int i2 = 1;
        this.r0.f11914j = true;
        boolean z = !mo13663q() && this.l0;
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int iAbs = Math.abs(i);
        Y2(i2, iAbs);
        int iO2 = this.r0.f11910f + o2(c2385v, c2389z, this.r0);
        if (iO2 < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iO2) {
                i = (-i2) * iO2;
            }
        } else if (iAbs > iO2) {
            i = i2 * iO2;
        }
        this.t0.mo9642s(-i);
        this.r0.f11911g = i;
        return i;
    }

    public final int F2(int i) {
        int iMin;
        if (m9241Z() == 0 || i == 0) {
            return 0;
        }
        n2();
        boolean zMo13663q = mo13663q();
        View view = this.D0;
        int width = zMo13663q ? view.getWidth() : view.getHeight();
        int iZ0 = zMo13663q ? z0() : m0();
        if (o0() == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                iMin = Math.min((iZ0 + this.s0.f11900d) - width, iAbs);
            } else {
                if (this.s0.f11900d + i <= 0) {
                    return i;
                }
                iMin = this.s0.f11900d;
            }
        } else {
            if (i > 0) {
                return Math.min((iZ0 - this.s0.f11900d) - width, i);
            }
            if (this.s0.f11900d + i >= 0) {
                return i;
            }
            iMin = this.s0.f11900d;
        }
        return -iMin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: G */
    public int mo9031G(RecyclerView.C2389z c2389z) {
        return j2(c2389z);
    }

    public final boolean G2(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iZ0 = z0() - getPaddingRight();
        int iM0 = m0() - getPaddingBottom();
        int iB2 = B2(view);
        int iD2 = D2(view);
        int iC2 = C2(view);
        int iZ2 = z2(view);
        return z ? (paddingLeft <= iB2 && iZ0 >= iC2) && (paddingTop <= iD2 && iM0 >= iZ2) : (iB2 >= iZ0 || iC2 >= paddingLeft) && (iD2 >= iM0 || iZ2 >= paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: H */
    public int mo9010H(RecyclerView.C2389z c2389z) {
        return k2(c2389z);
    }

    public final int H2(C10897a c10897a, C10896c c10896c) {
        return mo13663q() ? I2(c10897a, c10896c) : J2(c10897a, c10896c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: I */
    public int mo9011I(RecyclerView.C2389z c2389z) {
        return l2(c2389z);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int I2(C10897a c10897a, C10896c c10896c) {
        float f;
        float f2;
        float f3;
        int iM13738b;
        int i;
        LayoutParams layoutParams;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int iZ0 = z0();
        int i2 = c10896c.f11909e;
        if (c10896c.f11913i == -1) {
            i2 -= c10897a.f11921g;
        }
        int i3 = i2;
        int i4 = c10896c.f11908d;
        int i5 = this.i0;
        int i6 = 1;
        if (i5 != 0) {
            if (i5 == 1) {
                int i7 = c10897a.f11919e;
                float f4 = (iZ0 - i7) + paddingRight;
                f3 = 0.0f;
                f2 = i7 - paddingLeft;
                f = f4;
            } else if (i5 == 2) {
                int i8 = c10897a.f11919e;
                f = paddingLeft + ((iZ0 - i8) / 2.0f);
                f2 = (iZ0 - paddingRight) - ((iZ0 - i8) / 2.0f);
            } else if (i5 == 3) {
                f = paddingLeft;
                f3 = (iZ0 - c10897a.f11919e) / (c10897a.f11922h != 1 ? r4 - 1 : 1.0f);
                f2 = iZ0 - paddingRight;
            } else if (i5 == 4) {
                int i9 = c10897a.f11922h;
                f3 = i9 != 0 ? (iZ0 - c10897a.f11919e) / i9 : 0.0f;
                float f5 = f3 / 2.0f;
                f = paddingLeft + f5;
                f2 = (iZ0 - paddingRight) - f5;
            } else {
                if (i5 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.i0);
                }
                f3 = c10897a.f11922h != 0 ? (iZ0 - c10897a.f11919e) / (r4 + 1) : 0.0f;
                f = paddingLeft + f3;
                f2 = (iZ0 - paddingRight) - f3;
            }
            float measuredWidth = f - this.s0.f11900d;
            float measuredWidth2 = f2 - this.s0.f11900d;
            float fMax = Math.max(f3, 0.0f);
            iM13738b = c10897a.m13738b();
            int i10 = 0;
            i = i4;
            while (i < i4 + iM13738b) {
                View viewMo13653g = mo13653g(i);
                if (viewMo13653g != null) {
                    if (c10896c.f11913i == i6) {
                        m9250z(viewMo13653g, G0);
                        m9245t(viewMo13653g);
                    } else {
                        m9250z(viewMo13653g, G0);
                        m9246u(viewMo13653g, i10);
                        i10++;
                    }
                    int i11 = i10;
                    C10898b c10898b = this.o0;
                    long j = c10898b.f11936d[i];
                    int iM13791y = c10898b.m13791y(j);
                    int iM13790x = this.o0.m13790x(j);
                    LayoutParams layoutParams2 = (LayoutParams) viewMo13653g.getLayoutParams();
                    if (S1(viewMo13653g, iM13791y, iM13790x, layoutParams2)) {
                        viewMo13653g.measure(iM13791y, iM13790x);
                    }
                    float fP0 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + p0(viewMo13653g);
                    float fU0 = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + u0(viewMo13653g));
                    int iX0 = i3 + x0(viewMo13653g);
                    if (this.l0) {
                        layoutParams = layoutParams2;
                        this.o0.m13757Q(viewMo13653g, c10897a, Math.round(fU0) - viewMo13653g.getMeasuredWidth(), iX0, Math.round(fU0), iX0 + viewMo13653g.getMeasuredHeight());
                    } else {
                        layoutParams = layoutParams2;
                        this.o0.m13757Q(viewMo13653g, c10897a, Math.round(fP0), iX0, Math.round(fP0) + viewMo13653g.getMeasuredWidth(), iX0 + viewMo13653g.getMeasuredHeight());
                    }
                    i10 = i11;
                    measuredWidth = fP0 + viewMo13653g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + u0(viewMo13653g) + fMax;
                    measuredWidth2 = fU0 - (((viewMo13653g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + p0(viewMo13653g)) + fMax);
                }
                i++;
                i6 = 1;
            }
            C10896c.m13723n(c10896c, this.r0.f11913i);
            return c10897a.m13737a();
        }
        f = paddingLeft;
        f2 = iZ0 - paddingRight;
        f3 = 0.0f;
        float measuredWidth3 = f - this.s0.f11900d;
        float measuredWidth22 = f2 - this.s0.f11900d;
        float fMax2 = Math.max(f3, 0.0f);
        iM13738b = c10897a.m13738b();
        int i102 = 0;
        i = i4;
        while (i < i4 + iM13738b) {
        }
        C10896c.m13723n(c10896c, this.r0.f11913i);
        return c10897a.m13737a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: J */
    public int mo9032J(RecyclerView.C2389z c2389z) {
        return j2(c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int J1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (!mo13663q() || this.h0 == 0) {
            int iE2 = E2(i, c2385v, c2389z);
            this.B0.clear();
            return iE2;
        }
        int iF2 = F2(i);
        C10895b.m13698l(this.s0, iF2);
        this.u0.mo9642s(-iF2);
        return iF2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int J2(C10897a c10897a, C10896c c10896c) {
        float f;
        float f2;
        float f3;
        int iM13738b;
        int i;
        float f4;
        boolean z;
        View view;
        int i2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int iM0 = m0();
        int i3 = c10896c.f11909e;
        int i4 = c10896c.f11909e;
        if (c10896c.f11913i == -1) {
            int i5 = c10897a.f11921g;
            i3 -= i5;
            i4 += i5;
        }
        int i6 = i3;
        int i7 = i4;
        int i8 = c10896c.f11908d;
        int i9 = this.i0;
        boolean z2 = true;
        if (i9 != 0) {
            if (i9 == 1) {
                int i10 = c10897a.f11919e;
                float f5 = (iM0 - i10) + paddingBottom;
                f3 = 0.0f;
                f2 = i10 - paddingTop;
                f = f5;
            } else if (i9 == 2) {
                int i11 = c10897a.f11919e;
                f = paddingTop + ((iM0 - i11) / 2.0f);
                f2 = (iM0 - paddingBottom) - ((iM0 - i11) / 2.0f);
            } else if (i9 == 3) {
                f = paddingTop;
                f3 = (iM0 - c10897a.f11919e) / (c10897a.f11922h != 1 ? r4 - 1 : 1.0f);
                f2 = iM0 - paddingBottom;
            } else if (i9 == 4) {
                int i12 = c10897a.f11922h;
                f3 = i12 != 0 ? (iM0 - c10897a.f11919e) / i12 : 0.0f;
                float f6 = f3 / 2.0f;
                f = paddingTop + f6;
                f2 = (iM0 - paddingBottom) - f6;
            } else {
                if (i9 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.i0);
                }
                f3 = c10897a.f11922h != 0 ? (iM0 - c10897a.f11919e) / (r4 + 1) : 0.0f;
                f = paddingTop + f3;
                f2 = (iM0 - paddingBottom) - f3;
            }
            float measuredHeight = f - this.s0.f11900d;
            float measuredHeight2 = f2 - this.s0.f11900d;
            float fMax = Math.max(f3, 0.0f);
            iM13738b = c10897a.m13738b();
            int i13 = 0;
            i = i8;
            while (i < i8 + iM13738b) {
                View viewMo13653g = mo13653g(i);
                if (viewMo13653g == null) {
                    i2 = i;
                    z = z2;
                    f4 = fMax;
                } else {
                    C10898b c10898b = this.o0;
                    f4 = fMax;
                    long j = c10898b.f11936d[i];
                    int iM13791y = c10898b.m13791y(j);
                    int iM13790x = this.o0.m13790x(j);
                    if (S1(viewMo13653g, iM13791y, iM13790x, (LayoutParams) viewMo13653g.getLayoutParams())) {
                        viewMo13653g.measure(iM13791y, iM13790x);
                    }
                    float fX0 = measuredHeight + ((ViewGroup.MarginLayoutParams) r13).topMargin + x0(viewMo13653g);
                    float fM9239X = measuredHeight2 - (((ViewGroup.MarginLayoutParams) r13).rightMargin + m9239X(viewMo13653g));
                    if (c10896c.f11913i == 1) {
                        m9250z(viewMo13653g, G0);
                        m9245t(viewMo13653g);
                    } else {
                        m9250z(viewMo13653g, G0);
                        m9246u(viewMo13653g, i13);
                        i13++;
                    }
                    int i14 = i13;
                    int iP0 = i6 + p0(viewMo13653g);
                    int iU0 = i7 - u0(viewMo13653g);
                    boolean z3 = this.l0;
                    if (!z3) {
                        z = true;
                        view = viewMo13653g;
                        i2 = i;
                        if (this.m0) {
                            this.o0.m13758R(view, c10897a, z3, iP0, Math.round(fM9239X) - view.getMeasuredHeight(), iP0 + view.getMeasuredWidth(), Math.round(fM9239X));
                        } else {
                            this.o0.m13758R(view, c10897a, z3, iP0, Math.round(fX0), iP0 + view.getMeasuredWidth(), Math.round(fX0) + view.getMeasuredHeight());
                        }
                    } else if (this.m0) {
                        z = true;
                        view = viewMo13653g;
                        i2 = i;
                        this.o0.m13758R(viewMo13653g, c10897a, z3, iU0 - viewMo13653g.getMeasuredWidth(), Math.round(fM9239X) - viewMo13653g.getMeasuredHeight(), iU0, Math.round(fM9239X));
                    } else {
                        z = true;
                        view = viewMo13653g;
                        i2 = i;
                        this.o0.m13758R(view, c10897a, z3, iU0 - view.getMeasuredWidth(), Math.round(fX0), iU0, Math.round(fX0) + view.getMeasuredHeight());
                    }
                    View view2 = view;
                    measuredHeight = fX0 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r13).topMargin + m9239X(view2) + f4;
                    i13 = i14;
                    measuredHeight2 = fM9239X - (((view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r13).bottomMargin) + x0(view2)) + f4);
                }
                i = i2 + 1;
                fMax = f4;
                z2 = z;
            }
            C10896c.m13723n(c10896c, this.r0.f11913i);
            return c10897a.m13737a();
        }
        f = paddingTop;
        f2 = iM0 - paddingBottom;
        f3 = 0.0f;
        float measuredHeight3 = f - this.s0.f11900d;
        float measuredHeight22 = f2 - this.s0.f11900d;
        float fMax2 = Math.max(f3, 0.0f);
        iM13738b = c10897a.m13738b();
        int i132 = 0;
        i = i8;
        while (i < i8 + iM13738b) {
        }
        C10896c.m13723n(c10896c, this.r0.f11913i);
        return c10897a.m13737a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: K */
    public int mo9012K(RecyclerView.C2389z c2389z) {
        return k2(c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void K1(int i) {
        this.w0 = i;
        this.x0 = Integer.MIN_VALUE;
        SavedState savedState = this.v0;
        if (savedState != null) {
            savedState.m13684h();
        }
        G1();
    }

    public final void K2(RecyclerView.C2385v c2385v, C10896c c10896c) {
        if (c10896c.f11914j) {
            if (c10896c.f11913i == -1) {
                M2(c2385v, c10896c);
            } else {
                N2(c2385v, c10896c);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: L */
    public int mo9013L(RecyclerView.C2389z c2389z) {
        return l2(c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int L1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (mo13663q() || (this.h0 == 0 && !mo13663q())) {
            int iE2 = E2(i, c2385v, c2389z);
            this.B0.clear();
            return iE2;
        }
        int iF2 = F2(i);
        C10895b.m13698l(this.s0, iF2);
        this.u0.mo9642s(-iF2);
        return iF2;
    }

    public final void L2(RecyclerView.C2385v c2385v, int i, int i2) {
        while (i2 >= i) {
            A1(i2, c2385v);
            i2--;
        }
    }

    public final void M2(RecyclerView.C2385v c2385v, C10896c c10896c) {
        int iM9241Z;
        int i;
        View viewM9240Y;
        int i2;
        if (c10896c.f11910f < 0 || (iM9241Z = m9241Z()) == 0 || (viewM9240Y = m9240Y(iM9241Z - 1)) == null || (i2 = this.o0.f11935c[s0(viewM9240Y)]) == -1) {
            return;
        }
        C10897a c10897a = (C10897a) this.n0.get(i2);
        int i3 = i;
        while (true) {
            if (i3 < 0) {
                break;
            }
            View viewM9240Y2 = m9240Y(i3);
            if (viewM9240Y2 != null) {
                if (!g2(viewM9240Y2, c10896c.f11910f)) {
                    break;
                }
                if (c10897a.f11929o != s0(viewM9240Y2)) {
                    continue;
                } else if (i2 <= 0) {
                    iM9241Z = i3;
                    break;
                } else {
                    i2 += c10896c.f11913i;
                    c10897a = (C10897a) this.n0.get(i2);
                    iM9241Z = i3;
                }
            }
            i3--;
        }
        L2(c2385v, iM9241Z, i);
    }

    public final void N2(RecyclerView.C2385v c2385v, C10896c c10896c) {
        int iM9241Z;
        View viewM9240Y;
        if (c10896c.f11910f < 0 || (iM9241Z = m9241Z()) == 0 || (viewM9240Y = m9240Y(0)) == null) {
            return;
        }
        int i = this.o0.f11935c[s0(viewM9240Y)];
        int i2 = -1;
        if (i == -1) {
            return;
        }
        C10897a c10897a = (C10897a) this.n0.get(i);
        int i3 = 0;
        while (true) {
            if (i3 >= iM9241Z) {
                break;
            }
            View viewM9240Y2 = m9240Y(i3);
            if (viewM9240Y2 != null) {
                if (!h2(viewM9240Y2, c10896c.f11910f)) {
                    break;
                }
                if (c10897a.f11930p != s0(viewM9240Y2)) {
                    continue;
                } else if (i >= this.n0.size() - 1) {
                    i2 = i3;
                    break;
                } else {
                    i += c10896c.f11913i;
                    c10897a = (C10897a) this.n0.get(i);
                    i2 = i3;
                }
            }
            i3++;
        }
        L2(c2385v, 0, i2);
    }

    public final void O2() {
        int iN0 = mo13663q() ? n0() : A0();
        this.r0.f11906b = iN0 == 0 || iN0 == Integer.MIN_VALUE;
    }

    public final void P2() {
        int iO0 = o0();
        int i = this.f11885Z;
        if (i == 0) {
            this.l0 = iO0 == 1;
            this.m0 = this.h0 == 2;
            return;
        }
        if (i == 1) {
            this.l0 = iO0 != 1;
            this.m0 = this.h0 == 2;
            return;
        }
        if (i == 2) {
            boolean z = iO0 == 1;
            this.l0 = z;
            if (this.h0 == 2) {
                this.l0 = !z;
            }
            this.m0 = false;
            return;
        }
        if (i != 3) {
            this.l0 = false;
            this.m0 = false;
            return;
        }
        boolean z2 = iO0 == 1;
        this.l0 = z2;
        if (this.h0 == 2) {
            this.l0 = !z2;
        }
        this.m0 = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void Q0(RecyclerView.AbstractC2371h abstractC2371h, RecyclerView.AbstractC2371h abstractC2371h2) {
        w1();
    }

    public void Q2(int i) {
        int i2 = this.j0;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                w1();
                i2();
            }
            this.j0 = i;
            G1();
        }
    }

    public void R2(int i) {
        if (this.f11885Z != i) {
            w1();
            this.f11885Z = i;
            this.t0 = null;
            this.u0 = null;
            i2();
            G1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void S0(RecyclerView recyclerView) {
        super.S0(recyclerView);
        this.D0 = (View) recyclerView.getParent();
    }

    public void S2(int i) {
        if (i == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i2 = this.h0;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                w1();
                i2();
            }
            this.h0 = i;
            this.t0 = null;
            this.u0 = null;
            G1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: T */
    public RecyclerView.LayoutParams mo9014T() {
        return new LayoutParams(-2, -2);
    }

    public final boolean T2(RecyclerView.C2389z c2389z, C10895b c10895b) {
        if (m9241Z() == 0) {
            return false;
        }
        View viewS2 = c10895b.f11901e ? s2(c2389z.m9344b()) : p2(c2389z.m9344b());
        if (viewS2 == null) {
            return false;
        }
        c10895b.m13705s(viewS2);
        if (!c2389z.m9347e() && Y1()) {
            if (this.t0.mo9630g(viewS2) >= this.t0.mo9632i() || this.t0.mo9627d(viewS2) < this.t0.mo9637n()) {
                c10895b.f11899c = c10895b.f11901e ? this.t0.mo9632i() : this.t0.mo9637n();
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: U */
    public RecyclerView.LayoutParams mo9015U(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void U0(RecyclerView recyclerView, RecyclerView.C2385v c2385v) {
        super.U0(recyclerView, c2385v);
        if (this.A0) {
            x1(c2385v);
            c2385v.m9295c();
        }
    }

    public final boolean U2(RecyclerView.C2389z c2389z, C10895b c10895b, SavedState savedState) {
        int i;
        View viewM9240Y;
        if (!c2389z.m9347e() && (i = this.w0) != -1) {
            if (i >= 0 && i < c2389z.m9344b()) {
                c10895b.f11897a = this.w0;
                c10895b.f11898b = this.o0.f11935c[c10895b.f11897a];
                SavedState savedState2 = this.v0;
                if (savedState2 != null && savedState2.m13683g(c2389z.m9344b())) {
                    c10895b.f11899c = this.t0.mo9637n() + savedState.f11896b;
                    c10895b.f11903g = true;
                    c10895b.f11898b = -1;
                    return true;
                }
                if (this.x0 != Integer.MIN_VALUE) {
                    if (mo13663q() || !this.l0) {
                        c10895b.f11899c = this.t0.mo9637n() + this.x0;
                    } else {
                        c10895b.f11899c = this.x0 - this.t0.mo9633j();
                    }
                    return true;
                }
                View viewMo9033S = mo9033S(this.w0);
                if (viewMo9033S == null) {
                    if (m9241Z() > 0 && (viewM9240Y = m9240Y(0)) != null) {
                        c10895b.f11901e = this.w0 < s0(viewM9240Y);
                    }
                    c10895b.m13704r();
                } else {
                    if (this.t0.mo9628e(viewMo9033S) > this.t0.mo9638o()) {
                        c10895b.m13704r();
                        return true;
                    }
                    if (this.t0.mo9630g(viewMo9033S) - this.t0.mo9637n() < 0) {
                        c10895b.f11899c = this.t0.mo9637n();
                        c10895b.f11901e = false;
                        return true;
                    }
                    if (this.t0.mo9632i() - this.t0.mo9627d(viewMo9033S) < 0) {
                        c10895b.f11899c = this.t0.mo9632i();
                        c10895b.f11901e = true;
                        return true;
                    }
                    c10895b.f11899c = c10895b.f11901e ? this.t0.mo9627d(viewMo9033S) + this.t0.m9639p() : this.t0.mo9630g(viewMo9033S);
                }
                return true;
            }
            this.w0 = -1;
            this.x0 = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void V1(RecyclerView recyclerView, RecyclerView.C2389z c2389z, int i) {
        C2406l c2406l = new C2406l(recyclerView.getContext());
        c2406l.m9335p(i);
        W1(c2406l);
    }

    public final void V2(RecyclerView.C2389z c2389z, C10895b c10895b) {
        if (U2(c2389z, c10895b, this.v0) || T2(c2389z, c10895b)) {
            return;
        }
        c10895b.m13704r();
        c10895b.f11897a = 0;
        c10895b.f11898b = 0;
    }

    public final void W2(int i) {
        if (i >= u2()) {
            return;
        }
        int iM9241Z = m9241Z();
        this.o0.m13786t(iM9241Z);
        this.o0.m13787u(iM9241Z);
        this.o0.m13785s(iM9241Z);
        if (i >= this.o0.f11935c.length) {
            return;
        }
        this.E0 = i;
        View viewA2 = A2();
        if (viewA2 == null) {
            return;
        }
        this.w0 = s0(viewA2);
        if (mo13663q() || !this.l0) {
            this.x0 = this.t0.mo9630g(viewA2) - this.t0.mo9637n();
        } else {
            this.x0 = this.t0.mo9627d(viewA2) + this.t0.mo9633j();
        }
    }

    public final void X2(int i) {
        boolean z;
        int i2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(z0(), A0());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m0(), n0());
        int iZ0 = z0();
        int iM0 = m0();
        if (mo13663q()) {
            int i3 = this.y0;
            z = (i3 == Integer.MIN_VALUE || i3 == iZ0) ? false : true;
            i2 = this.r0.f11906b ? this.C0.getResources().getDisplayMetrics().heightPixels : this.r0.f11905a;
        } else {
            int i4 = this.z0;
            z = (i4 == Integer.MIN_VALUE || i4 == iM0) ? false : true;
            i2 = this.r0.f11906b ? this.C0.getResources().getDisplayMetrics().widthPixels : this.r0.f11905a;
        }
        int i5 = i2;
        this.y0 = iZ0;
        this.z0 = iM0;
        int i6 = this.E0;
        if (i6 == -1 && (this.w0 != -1 || z)) {
            if (this.s0.f11901e) {
                return;
            }
            this.n0.clear();
            this.F0.m13793a();
            if (mo13663q()) {
                this.o0.m13771e(this.F0, iMakeMeasureSpec, iMakeMeasureSpec2, i5, this.s0.f11897a, this.n0);
            } else {
                this.o0.m13774h(this.F0, iMakeMeasureSpec, iMakeMeasureSpec2, i5, this.s0.f11897a, this.n0);
            }
            this.n0 = this.F0.f11938a;
            this.o0.m13782p(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.o0.m13764X();
            C10895b c10895b = this.s0;
            c10895b.f11898b = this.o0.f11935c[c10895b.f11897a];
            this.r0.f11907c = this.s0.f11898b;
            return;
        }
        int iMin = i6 != -1 ? Math.min(i6, this.s0.f11897a) : this.s0.f11897a;
        this.F0.m13793a();
        if (mo13663q()) {
            if (this.n0.size() > 0) {
                this.o0.m13776j(this.n0, iMin);
                this.o0.m13768b(this.F0, iMakeMeasureSpec, iMakeMeasureSpec2, i5, iMin, this.s0.f11897a, this.n0);
            } else {
                this.o0.m13785s(i);
                this.o0.m13770d(this.F0, iMakeMeasureSpec, iMakeMeasureSpec2, i5, 0, this.n0);
            }
        } else if (this.n0.size() > 0) {
            this.o0.m13776j(this.n0, iMin);
            this.o0.m13768b(this.F0, iMakeMeasureSpec2, iMakeMeasureSpec, i5, iMin, this.s0.f11897a, this.n0);
        } else {
            this.o0.m13785s(i);
            this.o0.m13773g(this.F0, iMakeMeasureSpec, iMakeMeasureSpec2, i5, 0, this.n0);
        }
        this.n0 = this.F0.f11938a;
        this.o0.m13783q(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
        this.o0.m13765Y(iMin);
    }

    public final void Y2(int i, int i2) {
        this.r0.f11913i = i;
        boolean zMo13663q = mo13663q();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(z0(), A0());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m0(), n0());
        boolean z = !zMo13663q && this.l0;
        if (i == 1) {
            View viewM9240Y = m9240Y(m9241Z() - 1);
            if (viewM9240Y == null) {
                return;
            }
            this.r0.f11909e = this.t0.mo9627d(viewM9240Y);
            int iS0 = s0(viewM9240Y);
            View viewT2 = t2(viewM9240Y, (C10897a) this.n0.get(this.o0.f11935c[iS0]));
            this.r0.f11912h = 1;
            C10896c c10896c = this.r0;
            c10896c.f11908d = iS0 + c10896c.f11912h;
            if (this.o0.f11935c.length <= this.r0.f11908d) {
                this.r0.f11907c = -1;
            } else {
                C10896c c10896c2 = this.r0;
                c10896c2.f11907c = this.o0.f11935c[c10896c2.f11908d];
            }
            if (z) {
                this.r0.f11909e = this.t0.mo9630g(viewT2);
                this.r0.f11910f = (-this.t0.mo9630g(viewT2)) + this.t0.mo9637n();
                C10896c c10896c3 = this.r0;
                c10896c3.f11910f = Math.max(c10896c3.f11910f, 0);
            } else {
                this.r0.f11909e = this.t0.mo9627d(viewT2);
                this.r0.f11910f = this.t0.mo9627d(viewT2) - this.t0.mo9632i();
            }
            if ((this.r0.f11907c == -1 || this.r0.f11907c > this.n0.size() - 1) && this.r0.f11908d <= getFlexItemCount()) {
                int i3 = i2 - this.r0.f11910f;
                this.F0.m13793a();
                if (i3 > 0) {
                    if (zMo13663q) {
                        this.o0.m13770d(this.F0, iMakeMeasureSpec, iMakeMeasureSpec2, i3, this.r0.f11908d, this.n0);
                    } else {
                        this.o0.m13773g(this.F0, iMakeMeasureSpec, iMakeMeasureSpec2, i3, this.r0.f11908d, this.n0);
                    }
                    this.o0.m13783q(iMakeMeasureSpec, iMakeMeasureSpec2, this.r0.f11908d);
                    this.o0.m13765Y(this.r0.f11908d);
                }
            }
        } else {
            View viewM9240Y2 = m9240Y(0);
            if (viewM9240Y2 == null) {
                return;
            }
            this.r0.f11909e = this.t0.mo9630g(viewM9240Y2);
            int iS02 = s0(viewM9240Y2);
            View viewQ2 = q2(viewM9240Y2, (C10897a) this.n0.get(this.o0.f11935c[iS02]));
            this.r0.f11912h = 1;
            int i4 = this.o0.f11935c[iS02];
            if (i4 == -1) {
                i4 = 0;
            }
            if (i4 > 0) {
                this.r0.f11908d = iS02 - ((C10897a) this.n0.get(i4 - 1)).m13738b();
            } else {
                this.r0.f11908d = -1;
            }
            this.r0.f11907c = i4 > 0 ? i4 - 1 : 0;
            if (z) {
                this.r0.f11909e = this.t0.mo9627d(viewQ2);
                this.r0.f11910f = this.t0.mo9627d(viewQ2) - this.t0.mo9632i();
                C10896c c10896c4 = this.r0;
                c10896c4.f11910f = Math.max(c10896c4.f11910f, 0);
            } else {
                this.r0.f11909e = this.t0.mo9630g(viewQ2);
                this.r0.f11910f = (-this.t0.mo9630g(viewQ2)) + this.t0.mo9637n();
            }
        }
        C10896c c10896c5 = this.r0;
        c10896c5.f11905a = i2 - c10896c5.f11910f;
    }

    public final void Z2(C10895b c10895b, boolean z, boolean z2) {
        if (z2) {
            O2();
        } else {
            this.r0.f11906b = false;
        }
        if (mo13663q() || !this.l0) {
            this.r0.f11905a = this.t0.mo9632i() - c10895b.f11899c;
        } else {
            this.r0.f11905a = c10895b.f11899c - getPaddingRight();
        }
        this.r0.f11908d = c10895b.f11897a;
        this.r0.f11912h = 1;
        this.r0.f11913i = 1;
        this.r0.f11909e = c10895b.f11899c;
        this.r0.f11910f = Integer.MIN_VALUE;
        this.r0.f11907c = c10895b.f11898b;
        if (!z || this.n0.size() <= 1 || c10895b.f11898b < 0 || c10895b.f11898b >= this.n0.size() - 1) {
            return;
        }
        C10897a c10897a = (C10897a) this.n0.get(c10895b.f11898b);
        C10896c.m13721l(this.r0);
        C10896c.m13730u(this.r0, c10897a.m13738b());
    }

    public final void a3(C10895b c10895b, boolean z, boolean z2) {
        if (z2) {
            O2();
        } else {
            this.r0.f11906b = false;
        }
        if (mo13663q() || !this.l0) {
            this.r0.f11905a = c10895b.f11899c - this.t0.mo9637n();
        } else {
            this.r0.f11905a = (this.D0.getWidth() - c10895b.f11899c) - this.t0.mo9637n();
        }
        this.r0.f11908d = c10895b.f11897a;
        this.r0.f11912h = 1;
        this.r0.f11913i = -1;
        this.r0.f11909e = c10895b.f11899c;
        this.r0.f11910f = Integer.MIN_VALUE;
        this.r0.f11907c = c10895b.f11898b;
        if (!z || c10895b.f11898b <= 0 || this.n0.size() <= c10895b.f11898b) {
            return;
        }
        C10897a c10897a = (C10897a) this.n0.get(c10895b.f11898b);
        C10896c.m13722m(this.r0);
        C10896c.m13731v(this.r0, c10897a.m13738b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2388y.b
    /* renamed from: c */
    public PointF mo9034c(int i) {
        View viewM9240Y;
        if (m9241Z() == 0 || (viewM9240Y = m9240Y(0)) == null) {
            return null;
        }
        int i2 = i < s0(viewM9240Y) ? -1 : 1;
        return mo13663q() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // p001o.n27
    /* renamed from: d */
    public void mo13650d(View view, int i, int i2, C10897a c10897a) {
        m9250z(view, G0);
        if (mo13663q()) {
            int iP0 = p0(view) + u0(view);
            c10897a.f11919e += iP0;
            c10897a.f11920f += iP0;
        } else {
            int iX0 = x0(view) + m9239X(view);
            c10897a.f11919e += iX0;
            c10897a.f11920f += iX0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void d1(RecyclerView recyclerView, int i, int i2) {
        super.d1(recyclerView, i, i2);
        W2(i);
    }

    @Override // p001o.n27
    /* renamed from: e */
    public int mo13651e(int i, int i2, int i3) {
        return RecyclerView.AbstractC2379p.a0(z0(), A0(), i2, i3, mo9027A());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void f1(RecyclerView recyclerView, int i, int i2, int i3) {
        super.f1(recyclerView, i, i2, i3);
        W2(Math.min(i, i2));
    }

    @Override // p001o.n27
    /* renamed from: g */
    public View mo13653g(int i) {
        View view = (View) this.B0.get(i);
        return view != null ? view : this.p0.m9307o(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void g1(RecyclerView recyclerView, int i, int i2) {
        super.g1(recyclerView, i, i2);
        W2(i);
    }

    public final boolean g2(View view, int i) {
        return (mo13663q() || !this.l0) ? this.t0.mo9630g(view) >= this.t0.mo9631h() - i : this.t0.mo9627d(view) <= i;
    }

    @Override // p001o.n27
    public int getAlignContent() {
        return 5;
    }

    @Override // p001o.n27
    public int getAlignItems() {
        return this.j0;
    }

    @Override // p001o.n27
    public int getFlexDirection() {
        return this.f11885Z;
    }

    @Override // p001o.n27
    public int getFlexItemCount() {
        return this.q0.m9344b();
    }

    @Override // p001o.n27
    public List getFlexLinesInternal() {
        return this.n0;
    }

    @Override // p001o.n27
    public int getFlexWrap() {
        return this.h0;
    }

    @Override // p001o.n27
    public int getLargestMainSize() {
        if (this.n0.size() == 0) {
            return 0;
        }
        int size = this.n0.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((C10897a) this.n0.get(i)).f11919e);
        }
        return iMax;
    }

    @Override // p001o.n27
    public int getMaxLine() {
        return this.k0;
    }

    @Override // p001o.n27
    public int getSumOfCrossSize() {
        int size = this.n0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C10897a) this.n0.get(i2)).f11921g;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void h1(RecyclerView recyclerView, int i, int i2) {
        super.h1(recyclerView, i, i2);
        W2(i);
    }

    public final boolean h2(View view, int i) {
        return (mo13663q() || !this.l0) ? this.t0.mo9627d(view) <= i : this.t0.mo9631h() - this.t0.mo9630g(view) <= i;
    }

    @Override // p001o.n27
    /* renamed from: i */
    public int mo13655i(int i, int i2, int i3) {
        return RecyclerView.AbstractC2379p.a0(m0(), n0(), i2, i3, mo9028B());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void i1(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.i1(recyclerView, i, i2, obj);
        W2(i);
    }

    public final void i2() {
        this.n0.clear();
        this.s0.m13706t();
        this.s0.f11900d = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void j1(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        int i;
        int i2;
        this.p0 = c2385v;
        this.q0 = c2389z;
        int iM9344b = c2389z.m9344b();
        if (iM9344b == 0 && c2389z.m9347e()) {
            return;
        }
        P2();
        n2();
        m2();
        this.o0.m13786t(iM9344b);
        this.o0.m13787u(iM9344b);
        this.o0.m13785s(iM9344b);
        this.r0.f11914j = false;
        SavedState savedState = this.v0;
        if (savedState != null && savedState.m13683g(iM9344b)) {
            this.w0 = this.v0.f11895a;
        }
        if (!this.s0.f11902f || this.w0 != -1 || this.v0 != null) {
            this.s0.m13706t();
            V2(c2389z, this.s0);
            this.s0.f11902f = true;
        }
        m9232M(c2385v);
        if (this.s0.f11901e) {
            a3(this.s0, false, true);
        } else {
            Z2(this.s0, false, true);
        }
        X2(iM9344b);
        o2(c2385v, c2389z, this.r0);
        if (this.s0.f11901e) {
            i2 = this.r0.f11909e;
            Z2(this.s0, true, false);
            o2(c2385v, c2389z, this.r0);
            i = this.r0.f11909e;
        } else {
            i = this.r0.f11909e;
            a3(this.s0, true, false);
            o2(c2385v, c2389z, this.r0);
            i2 = this.r0.f11909e;
        }
        if (m9241Z() > 0) {
            if (this.s0.f11901e) {
                y2(i2 + x2(i, c2385v, c2389z, true), c2385v, c2389z, false);
            } else {
                x2(i + y2(i2, c2385v, c2389z, true), c2385v, c2389z, false);
            }
        }
    }

    public final int j2(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0) {
            return 0;
        }
        int iM9344b = c2389z.m9344b();
        n2();
        View viewP2 = p2(iM9344b);
        View viewS2 = s2(iM9344b);
        if (c2389z.m9344b() == 0 || viewP2 == null || viewS2 == null) {
            return 0;
        }
        return Math.min(this.t0.mo9638o(), this.t0.mo9627d(viewS2) - this.t0.mo9630g(viewP2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void k1(RecyclerView.C2389z c2389z) {
        super.k1(c2389z);
        this.v0 = null;
        this.w0 = -1;
        this.x0 = Integer.MIN_VALUE;
        this.E0 = -1;
        this.s0.m13706t();
        this.B0.clear();
    }

    public final int k2(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0) {
            return 0;
        }
        int iM9344b = c2389z.m9344b();
        View viewP2 = p2(iM9344b);
        View viewS2 = s2(iM9344b);
        if (c2389z.m9344b() != 0 && viewP2 != null && viewS2 != null) {
            int iS0 = s0(viewP2);
            int iS02 = s0(viewS2);
            int iAbs = Math.abs(this.t0.mo9627d(viewS2) - this.t0.mo9630g(viewP2));
            int i = this.o0.f11935c[iS0];
            if (i != 0 && i != -1) {
                return Math.round((i * (iAbs / ((r4[iS02] - i) + 1))) + (this.t0.mo9637n() - this.t0.mo9630g(viewP2)));
            }
        }
        return 0;
    }

    @Override // p001o.n27
    /* renamed from: l */
    public int mo13658l(View view) {
        int iP0;
        int iU0;
        if (mo13663q()) {
            iP0 = x0(view);
            iU0 = m9239X(view);
        } else {
            iP0 = p0(view);
            iU0 = u0(view);
        }
        return iP0 + iU0;
    }

    public final int l2(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0) {
            return 0;
        }
        int iM9344b = c2389z.m9344b();
        View viewP2 = p2(iM9344b);
        View viewS2 = s2(iM9344b);
        if (c2389z.m9344b() == 0 || viewP2 == null || viewS2 == null) {
            return 0;
        }
        int iR2 = r2();
        return (int) ((Math.abs(this.t0.mo9627d(viewS2) - this.t0.mo9630g(viewP2)) / ((u2() - iR2) + 1)) * c2389z.m9344b());
    }

    @Override // p001o.n27
    /* renamed from: m */
    public void mo13659m(C10897a c10897a) {
    }

    public final void m2() {
        if (this.r0 == null) {
            this.r0 = new C10896c();
        }
    }

    @Override // p001o.n27
    /* renamed from: n */
    public View mo13660n(int i) {
        return mo13653g(i);
    }

    public final void n2() {
        if (this.t0 != null) {
            return;
        }
        if (mo13663q()) {
            if (this.h0 == 0) {
                this.t0 = AbstractC2408n.m9624a(this);
                this.u0 = AbstractC2408n.m9626c(this);
                return;
            } else {
                this.t0 = AbstractC2408n.m9626c(this);
                this.u0 = AbstractC2408n.m9624a(this);
                return;
            }
        }
        if (this.h0 == 0) {
            this.t0 = AbstractC2408n.m9626c(this);
            this.u0 = AbstractC2408n.m9624a(this);
        } else {
            this.t0 = AbstractC2408n.m9624a(this);
            this.u0 = AbstractC2408n.m9626c(this);
        }
    }

    @Override // p001o.n27
    /* renamed from: o */
    public void mo13661o(int i, View view) {
        this.B0.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void o1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.v0 = (SavedState) parcelable;
            G1();
        }
    }

    public final int o2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, C10896c c10896c) {
        if (c10896c.f11910f != Integer.MIN_VALUE) {
            if (c10896c.f11905a < 0) {
                C10896c.m13726q(c10896c, c10896c.f11905a);
            }
            K2(c2385v, c10896c);
        }
        int i = c10896c.f11905a;
        int iM13737a = c10896c.f11905a;
        boolean zMo13663q = mo13663q();
        int iH2 = 0;
        while (true) {
            if ((iM13737a <= 0 && !this.r0.f11906b) || !c10896c.m13736D(c2389z, this.n0)) {
                break;
            }
            C10897a c10897a = (C10897a) this.n0.get(c10896c.f11907c);
            c10896c.f11908d = c10897a.f11929o;
            iH2 += H2(c10897a, c10896c);
            if (zMo13663q || !this.l0) {
                C10896c.m13712c(c10896c, c10897a.m13737a() * c10896c.f11913i);
            } else {
                C10896c.m13713d(c10896c, c10897a.m13737a() * c10896c.f11913i);
            }
            iM13737a -= c10897a.m13737a();
        }
        C10896c.m13718i(c10896c, iH2);
        if (c10896c.f11910f != Integer.MIN_VALUE) {
            C10896c.m13726q(c10896c, iH2);
            if (c10896c.f11905a < 0) {
                C10896c.m13726q(c10896c, c10896c.f11905a);
            }
            K2(c2385v, c10896c);
        }
        return i - c10896c.f11905a;
    }

    @Override // p001o.n27
    /* renamed from: p */
    public int mo13662p(View view, int i, int i2) {
        int iX0;
        int iM9239X;
        if (mo13663q()) {
            iX0 = p0(view);
            iM9239X = u0(view);
        } else {
            iX0 = x0(view);
            iM9239X = m9239X(view);
        }
        return iX0 + iM9239X;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public Parcelable p1() {
        if (this.v0 != null) {
            return new SavedState(this.v0);
        }
        SavedState savedState = new SavedState();
        if (m9241Z() > 0) {
            View viewA2 = A2();
            savedState.f11895a = s0(viewA2);
            savedState.f11896b = this.t0.mo9630g(viewA2) - this.t0.mo9637n();
        } else {
            savedState.m13684h();
        }
        return savedState;
    }

    public final View p2(int i) {
        View viewW2 = w2(0, m9241Z(), i);
        if (viewW2 == null) {
            return null;
        }
        int i2 = this.o0.f11935c[s0(viewW2)];
        if (i2 == -1) {
            return null;
        }
        return q2(viewW2, (C10897a) this.n0.get(i2));
    }

    @Override // p001o.n27
    /* renamed from: q */
    public boolean mo13663q() {
        int i = this.f11885Z;
        return i == 0 || i == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View q2(View view, C10897a c10897a) {
        boolean zMo13663q = mo13663q();
        int i = c10897a.f11922h;
        for (int i2 = 1; i2 < i; i2++) {
            View viewM9240Y = m9240Y(i2);
            if (viewM9240Y != null && viewM9240Y.getVisibility() != 8) {
                if (!this.l0 || zMo13663q) {
                    if (this.t0.mo9630g(view) > this.t0.mo9630g(viewM9240Y)) {
                        view = viewM9240Y;
                    }
                } else if (this.t0.mo9627d(view) < this.t0.mo9627d(viewM9240Y)) {
                }
            }
        }
        return view;
    }

    public int r2() {
        View viewV2 = v2(0, m9241Z(), false);
        if (viewV2 == null) {
            return -1;
        }
        return s0(viewV2);
    }

    public final View s2(int i) {
        View viewW2 = w2(m9241Z() - 1, -1, i);
        if (viewW2 == null) {
            return null;
        }
        return t2(viewW2, (C10897a) this.n0.get(this.o0.f11935c[s0(viewW2)]));
    }

    @Override // p001o.n27
    public void setFlexLines(List list) {
        this.n0 = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View t2(View view, C10897a c10897a) {
        boolean zMo13663q = mo13663q();
        int iM9241Z = (m9241Z() - c10897a.f11922h) - 1;
        for (int iM9241Z2 = m9241Z() - 2; iM9241Z2 > iM9241Z; iM9241Z2--) {
            View viewM9240Y = m9240Y(iM9241Z2);
            if (viewM9240Y != null && viewM9240Y.getVisibility() != 8) {
                if (!this.l0 || zMo13663q) {
                    if (this.t0.mo9627d(view) < this.t0.mo9627d(viewM9240Y)) {
                        view = viewM9240Y;
                    }
                } else if (this.t0.mo9630g(view) > this.t0.mo9630g(viewM9240Y)) {
                }
            }
        }
        return view;
    }

    public int u2() {
        View viewV2 = v2(m9241Z() - 1, -1, false);
        if (viewV2 == null) {
            return -1;
        }
        return s0(viewV2);
    }

    public final View v2(int i, int i2, boolean z) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewM9240Y = m9240Y(i);
            if (G2(viewM9240Y, z)) {
                return viewM9240Y;
            }
            i += i3;
        }
        return null;
    }

    public final View w2(int i, int i2, int i3) {
        int iS0;
        n2();
        m2();
        int iMo9637n = this.t0.mo9637n();
        int iMo9632i = this.t0.mo9632i();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM9240Y = m9240Y(i);
            if (viewM9240Y != null && (iS0 = s0(viewM9240Y)) >= 0 && iS0 < i3) {
                if (((RecyclerView.LayoutParams) viewM9240Y.getLayoutParams()).m9106c()) {
                    if (view2 == null) {
                        view2 = viewM9240Y;
                    }
                } else {
                    if (this.t0.mo9630g(viewM9240Y) >= iMo9637n && this.t0.mo9627d(viewM9240Y) <= iMo9632i) {
                        return viewM9240Y;
                    }
                    if (view == null) {
                        view = viewM9240Y;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final int x2(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, boolean z) {
        int iE2;
        int iMo9632i;
        if (!mo13663q() && this.l0) {
            int iMo9637n = i - this.t0.mo9637n();
            if (iMo9637n <= 0) {
                return 0;
            }
            iE2 = E2(iMo9637n, c2385v, c2389z);
        } else {
            int iMo9632i2 = this.t0.mo9632i() - i;
            if (iMo9632i2 <= 0) {
                return 0;
            }
            iE2 = -E2(-iMo9632i2, c2385v, c2389z);
        }
        int i2 = i + iE2;
        if (!z || (iMo9632i = this.t0.mo9632i() - i2) <= 0) {
            return iE2;
        }
        this.t0.mo9642s(iMo9632i);
        return iMo9632i + iE2;
    }

    public final int y2(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, boolean z) {
        int iE2;
        int iMo9637n;
        if (mo13663q() || !this.l0) {
            int iMo9637n2 = i - this.t0.mo9637n();
            if (iMo9637n2 <= 0) {
                return 0;
            }
            iE2 = -E2(iMo9637n2, c2385v, c2389z);
        } else {
            int iMo9632i = this.t0.mo9632i() - i;
            if (iMo9632i <= 0) {
                return 0;
            }
            iE2 = E2(-iMo9632i, c2385v, c2389z);
        }
        int i2 = i + iE2;
        if (!z || (iMo9637n = i2 - this.t0.mo9637n()) <= 0) {
            return iE2;
        }
        this.t0.mo9642s(-iMo9637n);
        return iE2 - iMo9637n;
    }

    public final int z2(View view) {
        return e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10893a();

        /* renamed from: a */
        public int f11895a;

        /* renamed from: b */
        public int f11896b;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$a */
        public class C10893a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public final boolean m13683g(int i) {
            int i2 = this.f11895a;
            return i2 >= 0 && i2 < i;
        }

        /* renamed from: h */
        public final void m13684h() {
            this.f11895a = -1;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f11895a + ", mAnchorOffset=" + this.f11896b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11895a);
            parcel.writeInt(this.f11896b);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f11895a = parcel.readInt();
            this.f11896b = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f11895a = savedState.f11895a;
            this.f11896b = savedState.f11896b;
        }
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.k0 = -1;
        this.n0 = new ArrayList();
        this.o0 = new C10898b(this);
        this.s0 = new C10895b();
        this.w0 = -1;
        this.x0 = Integer.MIN_VALUE;
        this.y0 = Integer.MIN_VALUE;
        this.z0 = Integer.MIN_VALUE;
        this.B0 = new SparseArray();
        this.E0 = -1;
        this.F0 = new C10898b.b();
        R2(i);
        S2(i2);
        Q2(4);
        this.C0 = context;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C10892a();

        /* renamed from: H */
        public boolean f11886H;

        /* renamed from: e */
        public float f11887e;

        /* renamed from: f */
        public float f11888f;

        /* renamed from: g */
        public int f11889g;

        /* renamed from: h */
        public float f11890h;

        /* renamed from: q */
        public int f11891q;

        /* renamed from: s */
        public int f11892s;

        /* renamed from: x */
        public int f11893x;

        /* renamed from: y */
        public int f11894y;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a */
        public class C10892a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11887e = 0.0f;
            this.f11888f = 1.0f;
            this.f11889g = -1;
            this.f11890h = -1.0f;
            this.f11893x = 16777215;
            this.f11894y = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void A0(int i) {
            this.f11892s = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float F0() {
            return this.f11887e;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: O */
        public int mo13643O() {
            return this.f11889g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float O0() {
            return this.f11890h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int O2() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int R2() {
            return this.f11892s;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: S */
        public float mo13644S() {
            return this.f11888f;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: Y */
        public int mo13645Y() {
            return this.f11891q;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean b1() {
            return this.f11886H;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void b2(int i) {
            this.f11891q = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int c2() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int d3() {
            return this.f11894y;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int e2() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int n1() {
            return this.f11893x;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int r0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f11887e);
            parcel.writeFloat(this.f11888f);
            parcel.writeInt(this.f11889g);
            parcel.writeFloat(this.f11890h);
            parcel.writeInt(this.f11891q);
            parcel.writeInt(this.f11892s);
            parcel.writeInt(this.f11893x);
            parcel.writeInt(this.f11894y);
            parcel.writeByte(this.f11886H ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f11887e = 0.0f;
            this.f11888f = 1.0f;
            this.f11889g = -1;
            this.f11890h = -1.0f;
            this.f11893x = 16777215;
            this.f11894y = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f11887e = 0.0f;
            this.f11888f = 1.0f;
            this.f11889g = -1;
            this.f11890h = -1.0f;
            this.f11893x = 16777215;
            this.f11894y = 16777215;
            this.f11887e = parcel.readFloat();
            this.f11888f = parcel.readFloat();
            this.f11889g = parcel.readInt();
            this.f11890h = parcel.readFloat();
            this.f11891q = parcel.readInt();
            this.f11892s = parcel.readInt();
            this.f11893x = parcel.readInt();
            this.f11894y = parcel.readInt();
            this.f11886H = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k0 = -1;
        this.n0 = new ArrayList();
        this.o0 = new C10898b(this);
        this.s0 = new C10895b();
        this.w0 = -1;
        this.x0 = Integer.MIN_VALUE;
        this.y0 = Integer.MIN_VALUE;
        this.z0 = Integer.MIN_VALUE;
        this.B0 = new SparseArray();
        this.E0 = -1;
        this.F0 = new C10898b.b();
        RecyclerView.AbstractC2379p.d dVarT0 = RecyclerView.AbstractC2379p.t0(context, attributeSet, i, i2);
        int i3 = dVarT0.f9847a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (dVarT0.f9849c) {
                    R2(3);
                } else {
                    R2(2);
                }
            }
        } else if (dVarT0.f9849c) {
            R2(1);
        } else {
            R2(0);
        }
        S2(1);
        Q2(4);
        this.C0 = context;
    }
}
