package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC2379p implements RecyclerView.AbstractC2388y.b {
    public int[] C0;
    public C2394c[] h0;
    public AbstractC2408n i0;
    public AbstractC2408n j0;
    public int k0;
    public int l0;
    public final C2405k m0;
    public BitSet p0;
    public boolean u0;
    public boolean v0;
    public SavedState w0;
    public int x0;

    /* renamed from: Z */
    public int f9899Z = -1;
    public boolean n0 = false;
    public boolean o0 = false;
    public int q0 = -1;
    public int r0 = Integer.MIN_VALUE;
    public LazySpanLookup s0 = new LazySpanLookup();
    public int t0 = 2;
    public final Rect y0 = new Rect();
    public final C2393b z0 = new C2393b();
    public boolean A0 = false;
    public boolean B0 = true;
    public final Runnable D0 = new RunnableC2392a();

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        public C2394c f9900e;

        /* renamed from: f */
        public boolean f9901f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public boolean m9350e() {
            return this.f9901f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2391a();

        /* renamed from: a */
        public int f9908a;

        /* renamed from: b */
        public int f9909b;

        /* renamed from: c */
        public int f9910c;

        /* renamed from: d */
        public int[] f9911d;

        /* renamed from: e */
        public int f9912e;

        /* renamed from: f */
        public int[] f9913f;

        /* renamed from: g */
        public List f9914g;

        /* renamed from: h */
        public boolean f9915h;

        /* renamed from: q */
        public boolean f9916q;

        /* renamed from: s */
        public boolean f9917s;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        public class C2391a implements Parcelable.Creator {
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

        public SavedState() {
        }

        /* renamed from: a */
        public void m9369a() {
            this.f9911d = null;
            this.f9910c = 0;
            this.f9908a = -1;
            this.f9909b = -1;
        }

        /* renamed from: b */
        public void m9370b() {
            this.f9911d = null;
            this.f9910c = 0;
            this.f9912e = 0;
            this.f9913f = null;
            this.f9914g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9908a);
            parcel.writeInt(this.f9909b);
            parcel.writeInt(this.f9910c);
            if (this.f9910c > 0) {
                parcel.writeIntArray(this.f9911d);
            }
            parcel.writeInt(this.f9912e);
            if (this.f9912e > 0) {
                parcel.writeIntArray(this.f9913f);
            }
            parcel.writeInt(this.f9915h ? 1 : 0);
            parcel.writeInt(this.f9916q ? 1 : 0);
            parcel.writeInt(this.f9917s ? 1 : 0);
            parcel.writeList(this.f9914g);
        }

        public SavedState(Parcel parcel) {
            this.f9908a = parcel.readInt();
            this.f9909b = parcel.readInt();
            int i = parcel.readInt();
            this.f9910c = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.f9911d = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.f9912e = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f9913f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f9915h = parcel.readInt() == 1;
            this.f9916q = parcel.readInt() == 1;
            this.f9917s = parcel.readInt() == 1;
            this.f9914g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f9910c = savedState.f9910c;
            this.f9908a = savedState.f9908a;
            this.f9909b = savedState.f9909b;
            this.f9911d = savedState.f9911d;
            this.f9912e = savedState.f9912e;
            this.f9913f = savedState.f9913f;
            this.f9915h = savedState.f9915h;
            this.f9916q = savedState.f9916q;
            this.f9917s = savedState.f9917s;
            this.f9914g = savedState.f9914g;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC2392a implements Runnable {
        public RunnableC2392a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.f2();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C2393b {

        /* renamed from: a */
        public int f9919a;

        /* renamed from: b */
        public int f9920b;

        /* renamed from: c */
        public boolean f9921c;

        /* renamed from: d */
        public boolean f9922d;

        /* renamed from: e */
        public boolean f9923e;

        /* renamed from: f */
        public int[] f9924f;

        public C2393b() {
            m9375c();
        }

        /* renamed from: a */
        public void m9373a() {
            this.f9920b = this.f9921c ? StaggeredGridLayoutManager.this.i0.mo9632i() : StaggeredGridLayoutManager.this.i0.mo9637n();
        }

        /* renamed from: b */
        public void m9374b(int i) {
            if (this.f9921c) {
                this.f9920b = StaggeredGridLayoutManager.this.i0.mo9632i() - i;
            } else {
                this.f9920b = StaggeredGridLayoutManager.this.i0.mo9637n() + i;
            }
        }

        /* renamed from: c */
        public void m9375c() {
            this.f9919a = -1;
            this.f9920b = Integer.MIN_VALUE;
            this.f9921c = false;
            this.f9922d = false;
            this.f9923e = false;
            int[] iArr = this.f9924f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void m9376d(C2394c[] c2394cArr) {
            int length = c2394cArr.length;
            int[] iArr = this.f9924f;
            if (iArr == null || iArr.length < length) {
                this.f9924f = new int[StaggeredGridLayoutManager.this.h0.length];
            }
            for (int i = 0; i < length; i++) {
                this.f9924f[i] = c2394cArr[i].m9392p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public class C2394c {

        /* renamed from: a */
        public ArrayList f9926a = new ArrayList();

        /* renamed from: b */
        public int f9927b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f9928c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f9929d = 0;

        /* renamed from: e */
        public final int f9930e;

        public C2394c(int i) {
            this.f9930e = i;
        }

        /* renamed from: a */
        public void m9377a(View view) {
            LayoutParams layoutParamsM9390n = m9390n(view);
            layoutParamsM9390n.f9900e = this;
            this.f9926a.add(view);
            this.f9928c = Integer.MIN_VALUE;
            if (this.f9926a.size() == 1) {
                this.f9927b = Integer.MIN_VALUE;
            }
            if (layoutParamsM9390n.m9106c() || layoutParamsM9390n.m9105b()) {
                this.f9929d += StaggeredGridLayoutManager.this.i0.mo9628e(view);
            }
        }

        /* renamed from: b */
        public void m9378b(boolean z, int i) {
            int iM9388l = z ? m9388l(Integer.MIN_VALUE) : m9392p(Integer.MIN_VALUE);
            m9381e();
            if (iM9388l == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iM9388l >= StaggeredGridLayoutManager.this.i0.mo9632i()) {
                if (z || iM9388l <= StaggeredGridLayoutManager.this.i0.mo9637n()) {
                    if (i != Integer.MIN_VALUE) {
                        iM9388l += i;
                    }
                    this.f9928c = iM9388l;
                    this.f9927b = iM9388l;
                }
            }
        }

        /* renamed from: c */
        public void m9379c() {
            LazySpanLookup.FullSpanItem fullSpanItemM9356f;
            ArrayList arrayList = this.f9926a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParamsM9390n = m9390n(view);
            this.f9928c = StaggeredGridLayoutManager.this.i0.mo9627d(view);
            if (layoutParamsM9390n.f9901f && (fullSpanItemM9356f = StaggeredGridLayoutManager.this.s0.m9356f(layoutParamsM9390n.m9104a())) != null && fullSpanItemM9356f.f9905b == 1) {
                this.f9928c += fullSpanItemM9356f.m9366a(this.f9930e);
            }
        }

        /* renamed from: d */
        public void m9380d() {
            LazySpanLookup.FullSpanItem fullSpanItemM9356f;
            View view = (View) this.f9926a.get(0);
            LayoutParams layoutParamsM9390n = m9390n(view);
            this.f9927b = StaggeredGridLayoutManager.this.i0.mo9630g(view);
            if (layoutParamsM9390n.f9901f && (fullSpanItemM9356f = StaggeredGridLayoutManager.this.s0.m9356f(layoutParamsM9390n.m9104a())) != null && fullSpanItemM9356f.f9905b == -1) {
                this.f9927b -= fullSpanItemM9356f.m9366a(this.f9930e);
            }
        }

        /* renamed from: e */
        public void m9381e() {
            this.f9926a.clear();
            m9393q();
            this.f9929d = 0;
        }

        /* renamed from: f */
        public int m9382f() {
            return StaggeredGridLayoutManager.this.n0 ? m9385i(this.f9926a.size() - 1, -1, true) : m9385i(0, this.f9926a.size(), true);
        }

        /* renamed from: g */
        public int m9383g() {
            return StaggeredGridLayoutManager.this.n0 ? m9385i(0, this.f9926a.size(), true) : m9385i(this.f9926a.size() - 1, -1, true);
        }

        /* renamed from: h */
        public int m9384h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iMo9637n = StaggeredGridLayoutManager.this.i0.mo9637n();
            int iMo9632i = StaggeredGridLayoutManager.this.i0.mo9632i();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f9926a.get(i);
                int iMo9630g = StaggeredGridLayoutManager.this.i0.mo9630g(view);
                int iMo9627d = StaggeredGridLayoutManager.this.i0.mo9627d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iMo9630g >= iMo9632i : iMo9630g > iMo9632i;
                if (!z3 ? iMo9627d > iMo9637n : iMo9627d >= iMo9637n) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iMo9630g >= iMo9637n && iMo9627d <= iMo9632i) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                        if (iMo9630g < iMo9637n || iMo9627d > iMo9632i) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: i */
        public int m9385i(int i, int i2, boolean z) {
            return m9384h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int m9386j() {
            return this.f9929d;
        }

        /* renamed from: k */
        public int m9387k() {
            int i = this.f9928c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m9379c();
            return this.f9928c;
        }

        /* renamed from: l */
        public int m9388l(int i) {
            int i2 = this.f9928c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f9926a.size() == 0) {
                return i;
            }
            m9379c();
            return this.f9928c;
        }

        /* renamed from: m */
        public View m9389m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f9926a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f9926a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.n0 && staggeredGridLayoutManager.s0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.n0 && staggeredGridLayoutManager2.s0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f9926a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f9926a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.n0 && staggeredGridLayoutManager3.s0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.n0 && staggeredGridLayoutManager4.s0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        public LayoutParams m9390n(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: o */
        public int m9391o() {
            int i = this.f9927b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m9380d();
            return this.f9927b;
        }

        /* renamed from: p */
        public int m9392p(int i) {
            int i2 = this.f9927b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f9926a.size() == 0) {
                return i;
            }
            m9380d();
            return this.f9927b;
        }

        /* renamed from: q */
        public void m9393q() {
            this.f9927b = Integer.MIN_VALUE;
            this.f9928c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        public void m9394r(int i) {
            int i2 = this.f9927b;
            if (i2 != Integer.MIN_VALUE) {
                this.f9927b = i2 + i;
            }
            int i3 = this.f9928c;
            if (i3 != Integer.MIN_VALUE) {
                this.f9928c = i3 + i;
            }
        }

        /* renamed from: s */
        public void m9395s() {
            int size = this.f9926a.size();
            View view = (View) this.f9926a.remove(size - 1);
            LayoutParams layoutParamsM9390n = m9390n(view);
            layoutParamsM9390n.f9900e = null;
            if (layoutParamsM9390n.m9106c() || layoutParamsM9390n.m9105b()) {
                this.f9929d -= StaggeredGridLayoutManager.this.i0.mo9628e(view);
            }
            if (size == 1) {
                this.f9927b = Integer.MIN_VALUE;
            }
            this.f9928c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        public void m9396t() {
            View view = (View) this.f9926a.remove(0);
            LayoutParams layoutParamsM9390n = m9390n(view);
            layoutParamsM9390n.f9900e = null;
            if (this.f9926a.size() == 0) {
                this.f9928c = Integer.MIN_VALUE;
            }
            if (layoutParamsM9390n.m9106c() || layoutParamsM9390n.m9105b()) {
                this.f9929d -= StaggeredGridLayoutManager.this.i0.mo9628e(view);
            }
            this.f9927b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        public void m9397u(View view) {
            LayoutParams layoutParamsM9390n = m9390n(view);
            layoutParamsM9390n.f9900e = this;
            this.f9926a.add(0, view);
            this.f9927b = Integer.MIN_VALUE;
            if (this.f9926a.size() == 1) {
                this.f9928c = Integer.MIN_VALUE;
            }
            if (layoutParamsM9390n.m9106c() || layoutParamsM9390n.m9105b()) {
                this.f9929d += StaggeredGridLayoutManager.this.i0.mo9628e(view);
            }
        }

        /* renamed from: v */
        public void m9398v(int i) {
            this.f9927b = i;
            this.f9928c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC2379p.d dVarT0 = RecyclerView.AbstractC2379p.t0(context, attributeSet, i, i2);
        U2(dVarT0.f9847a);
        W2(dVarT0.f9848b);
        V2(dVarT0.f9849c);
        this.m0 = new C2405k();
        n2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: A */
    public boolean mo9027A() {
        return this.k0 == 0;
    }

    public final int A2(int i) {
        int iM9388l = this.h0[0].m9388l(i);
        for (int i2 = 1; i2 < this.f9899Z; i2++) {
            int iM9388l2 = this.h0[i2].m9388l(i);
            if (iM9388l2 < iM9388l) {
                iM9388l = iM9388l2;
            }
        }
        return iM9388l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: B */
    public boolean mo9028B() {
        return this.k0 == 1;
    }

    public final int B2(int i) {
        int iM9392p = this.h0[0].m9392p(i);
        for (int i2 = 1; i2 < this.f9899Z; i2++) {
            int iM9392p2 = this.h0[i2].m9392p(i);
            if (iM9392p2 < iM9392p) {
                iM9392p = iM9392p2;
            }
        }
        return iM9392p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: C */
    public boolean mo9009C(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final C2394c C2(C2405k c2405k) {
        int i;
        int i2;
        int i3;
        if (K2(c2405k.f10166e)) {
            i2 = this.f9899Z - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.f9899Z;
            i2 = 0;
            i3 = 1;
        }
        C2394c c2394c = null;
        if (c2405k.f10166e == 1) {
            int iMo9637n = this.i0.mo9637n();
            int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            while (i2 != i) {
                C2394c c2394c2 = this.h0[i2];
                int iM9388l = c2394c2.m9388l(iMo9637n);
                if (iM9388l < i4) {
                    c2394c = c2394c2;
                    i4 = iM9388l;
                }
                i2 += i3;
            }
            return c2394c;
        }
        int iMo9632i = this.i0.mo9632i();
        int i5 = Integer.MIN_VALUE;
        while (i2 != i) {
            C2394c c2394c3 = this.h0[i2];
            int iM9392p = c2394c3.m9392p(iMo9632i);
            if (iM9392p > i5) {
                c2394c = c2394c3;
                i5 = iM9392p;
            }
            i2 += i3;
        }
        return c2394c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public boolean D0() {
        return this.t0 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D2(int i, int i2, int i3) {
        int i4;
        int i5;
        int iX2 = this.o0 ? x2() : w2();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                this.s0.m9358h(i5);
                if (i3 != 1) {
                    this.s0.m9360j(i, i2);
                } else if (i3 == 2) {
                    this.s0.m9361k(i, i2);
                } else if (i3 == 8) {
                    this.s0.m9361k(i, 1);
                    this.s0.m9360j(i2, 1);
                }
                if (i4 > iX2) {
                    return;
                }
                if (i5 <= (this.o0 ? w2() : x2())) {
                    G1();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        this.s0.m9358h(i5);
        if (i3 != 1) {
        }
        if (i4 > iX2) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: E */
    public void mo9029E(int i, int i2, RecyclerView.C2389z c2389z, RecyclerView.AbstractC2379p.c cVar) {
        int iM9388l;
        int iM9392p;
        if (this.k0 != 0) {
            i = i2;
        }
        if (m9241Z() == 0 || i == 0) {
            return;
        }
        L2(i, c2389z);
        int[] iArr = this.C0;
        if (iArr == null || iArr.length < this.f9899Z) {
            this.C0 = new int[this.f9899Z];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9899Z; i4++) {
            C2405k c2405k = this.m0;
            if (c2405k.f10165d == -1) {
                iM9388l = c2405k.f10167f;
                iM9392p = this.h0[i4].m9392p(iM9388l);
            } else {
                iM9388l = this.h0[i4].m9388l(c2405k.f10168g);
                iM9392p = this.m0.f10168g;
            }
            int i5 = iM9388l - iM9392p;
            if (i5 >= 0) {
                this.C0[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.C0, 0, i3);
        for (int i6 = 0; i6 < i3 && this.m0.m9605a(c2389z); i6++) {
            cVar.mo9256a(this.m0.f10164c, this.C0[i6]);
            C2405k c2405k2 = this.m0;
            c2405k2.f10164c += c2405k2.f10165d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View E2() {
        int i;
        int i2;
        boolean z;
        int iM9241Z = m9241Z() - 1;
        BitSet bitSet = new BitSet(this.f9899Z);
        bitSet.set(0, this.f9899Z, true);
        char c = (this.k0 == 1 && G2()) ? (char) 1 : (char) 65535;
        if (this.o0) {
            i = -1;
        } else {
            i = iM9241Z + 1;
            iM9241Z = 0;
        }
        int i3 = iM9241Z < i ? 1 : -1;
        while (iM9241Z != i) {
            View viewM9240Y = m9240Y(iM9241Z);
            LayoutParams layoutParams = (LayoutParams) viewM9240Y.getLayoutParams();
            if (bitSet.get(layoutParams.f9900e.f9930e)) {
                if (g2(layoutParams.f9900e)) {
                    return viewM9240Y;
                }
                bitSet.clear(layoutParams.f9900e.f9930e);
            }
            if (!layoutParams.f9901f && (i2 = iM9241Z + i3) != i) {
                View viewM9240Y2 = m9240Y(i2);
                if (this.o0) {
                    int iMo9627d = this.i0.mo9627d(viewM9240Y);
                    int iMo9627d2 = this.i0.mo9627d(viewM9240Y2);
                    if (iMo9627d < iMo9627d2) {
                        return viewM9240Y;
                    }
                    z = iMo9627d == iMo9627d2;
                } else {
                    int iMo9630g = this.i0.mo9630g(viewM9240Y);
                    int iMo9630g2 = this.i0.mo9630g(viewM9240Y2);
                    if (iMo9630g > iMo9630g2) {
                        return viewM9240Y;
                    }
                    if (iMo9630g == iMo9630g2) {
                    }
                }
                if (z) {
                    if ((layoutParams.f9900e.f9930e - ((LayoutParams) viewM9240Y2.getLayoutParams()).f9900e.f9930e < 0) != (c < 0)) {
                        return viewM9240Y;
                    }
                } else {
                    continue;
                }
            }
            iM9241Z += i3;
        }
        return null;
    }

    public void F2() {
        this.s0.m9352b();
        G1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: G */
    public int mo9031G(RecyclerView.C2389z c2389z) {
        return h2(c2389z);
    }

    public boolean G2() {
        return o0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: H */
    public int mo9010H(RecyclerView.C2389z c2389z) {
        return i2(c2389z);
    }

    public final void H2(View view, int i, int i2, boolean z) {
        m9250z(view, this.y0);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.y0;
        int iE3 = e3(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.y0;
        int iE32 = e3(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z ? U1(view, iE3, iE32, layoutParams) : S1(view, iE3, iE32, layoutParams)) {
            view.measure(iE3, iE32);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: I */
    public int mo9011I(RecyclerView.C2389z c2389z) {
        return j2(c2389z);
    }

    public final void I2(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f9901f) {
            if (this.k0 == 1) {
                H2(view, this.x0, RecyclerView.AbstractC2379p.a0(m0(), n0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
                return;
            } else {
                H2(view, RecyclerView.AbstractC2379p.a0(z0(), A0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.x0, z);
                return;
            }
        }
        if (this.k0 == 1) {
            H2(view, RecyclerView.AbstractC2379p.a0(this.l0, A0(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.AbstractC2379p.a0(m0(), n0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
        } else {
            H2(view, RecyclerView.AbstractC2379p.a0(z0(), A0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.AbstractC2379p.a0(this.l0, n0(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: J */
    public int mo9032J(RecyclerView.C2389z c2389z) {
        return h2(c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int J1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        return S2(i, c2385v, c2389z);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, boolean z) {
        SavedState savedState;
        C2393b c2393b = this.z0;
        if (!(this.w0 == null && this.q0 == -1) && c2389z.m9344b() == 0) {
            x1(c2385v);
            c2393b.m9375c();
            return;
        }
        boolean z2 = true;
        boolean z3 = (c2393b.f9923e && this.q0 == -1 && this.w0 == null) ? false : true;
        if (z3) {
            c2393b.m9375c();
            if (this.w0 != null) {
                a2(c2393b);
            } else {
                R2();
                c2393b.f9921c = this.o0;
            }
            a3(c2389z, c2393b);
            c2393b.f9923e = true;
        }
        if (this.w0 == null && this.q0 == -1 && (c2393b.f9921c != this.u0 || G2() != this.v0)) {
            this.s0.m9352b();
            c2393b.f9922d = true;
        }
        if (m9241Z() > 0 && ((savedState = this.w0) == null || savedState.f9910c < 1)) {
            if (c2393b.f9922d) {
                for (int i = 0; i < this.f9899Z; i++) {
                    this.h0[i].m9381e();
                    int i2 = c2393b.f9920b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.h0[i].m9398v(i2);
                    }
                }
            } else if (z3 || this.z0.f9924f == null) {
                for (int i3 = 0; i3 < this.f9899Z; i3++) {
                    this.h0[i3].m9378b(this.o0, c2393b.f9920b);
                }
                this.z0.m9376d(this.h0);
            } else {
                for (int i4 = 0; i4 < this.f9899Z; i4++) {
                    C2394c c2394c = this.h0[i4];
                    c2394c.m9381e();
                    c2394c.m9398v(this.z0.f9924f[i4]);
                }
            }
        }
        m9232M(c2385v);
        this.m0.f10162a = false;
        this.A0 = false;
        c3(this.j0.mo9638o());
        b3(c2393b.f9919a, c2389z);
        if (c2393b.f9921c) {
            T2(-1);
            o2(c2385v, this.m0, c2389z);
            T2(1);
            C2405k c2405k = this.m0;
            c2405k.f10164c = c2393b.f9919a + c2405k.f10165d;
            o2(c2385v, c2405k, c2389z);
        } else {
            T2(1);
            o2(c2385v, this.m0, c2389z);
            T2(-1);
            C2405k c2405k2 = this.m0;
            c2405k2.f10164c = c2393b.f9919a + c2405k2.f10165d;
            o2(c2385v, c2405k2, c2389z);
        }
        Q2();
        if (m9241Z() > 0) {
            if (this.o0) {
                u2(c2385v, c2389z, true);
                v2(c2385v, c2389z, false);
            } else {
                v2(c2385v, c2389z, true);
                u2(c2385v, c2389z, false);
            }
        }
        if (!z || c2389z.m9347e()) {
            z2 = false;
        } else if (this.t0 != 0 && m9241Z() > 0 && (this.A0 || E2() != null)) {
            B1(this.D0);
            if (!f2()) {
            }
        }
        if (c2389z.m9347e()) {
            this.z0.m9375c();
        }
        this.u0 = c2393b.f9921c;
        this.v0 = G2();
        if (z2) {
            this.z0.m9375c();
            J2(c2385v, c2389z, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: K */
    public int mo9012K(RecyclerView.C2389z c2389z) {
        return i2(c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void K1(int i) {
        SavedState savedState = this.w0;
        if (savedState != null && savedState.f9908a != i) {
            savedState.m9369a();
        }
        this.q0 = i;
        this.r0 = Integer.MIN_VALUE;
        G1();
    }

    public final boolean K2(int i) {
        if (this.k0 == 0) {
            return (i == -1) != this.o0;
        }
        return ((i == -1) == this.o0) == G2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: L */
    public int mo9013L(RecyclerView.C2389z c2389z) {
        return j2(c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int L1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        return S2(i, c2385v, c2389z);
    }

    public void L2(int i, RecyclerView.C2389z c2389z) {
        int iW2;
        int i2;
        if (i > 0) {
            iW2 = x2();
            i2 = 1;
        } else {
            iW2 = w2();
            i2 = -1;
        }
        this.m0.f10162a = true;
        b3(iW2, c2389z);
        T2(i2);
        C2405k c2405k = this.m0;
        c2405k.f10164c = iW2 + c2405k.f10165d;
        c2405k.f10163b = Math.abs(i);
    }

    public final void M2(View view) {
        for (int i = this.f9899Z - 1; i >= 0; i--) {
            this.h0[i].m9397u(view);
        }
    }

    public final void N2(RecyclerView.C2385v c2385v, C2405k c2405k) {
        if (!c2405k.f10162a || c2405k.f10170i) {
            return;
        }
        if (c2405k.f10163b == 0) {
            if (c2405k.f10166e == -1) {
                O2(c2385v, c2405k.f10168g);
                return;
            } else {
                P2(c2385v, c2405k.f10167f);
                return;
            }
        }
        if (c2405k.f10166e != -1) {
            int iA2 = A2(c2405k.f10168g) - c2405k.f10168g;
            P2(c2385v, iA2 < 0 ? c2405k.f10167f : Math.min(iA2, c2405k.f10163b) + c2405k.f10167f);
        } else {
            int i = c2405k.f10167f;
            int iZ2 = i - z2(i);
            O2(c2385v, iZ2 < 0 ? c2405k.f10168g : c2405k.f10168g - Math.min(iZ2, c2405k.f10163b));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void O0(int i) {
        super.O0(i);
        for (int i2 = 0; i2 < this.f9899Z; i2++) {
            this.h0[i2].m9394r(i);
        }
    }

    public final void O2(RecyclerView.C2385v c2385v, int i) {
        for (int iM9241Z = m9241Z() - 1; iM9241Z >= 0; iM9241Z--) {
            View viewM9240Y = m9240Y(iM9241Z);
            if (this.i0.mo9630g(viewM9240Y) < i || this.i0.mo9641r(viewM9240Y) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewM9240Y.getLayoutParams();
            if (layoutParams.f9901f) {
                for (int i2 = 0; i2 < this.f9899Z; i2++) {
                    if (this.h0[i2].f9926a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f9899Z; i3++) {
                    this.h0[i3].m9395s();
                }
            } else if (layoutParams.f9900e.f9926a.size() == 1) {
                return;
            } else {
                layoutParams.f9900e.m9395s();
            }
            z1(viewM9240Y, c2385v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void P0(int i) {
        super.P0(i);
        for (int i2 = 0; i2 < this.f9899Z; i2++) {
            this.h0[i2].m9394r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void P1(Rect rect, int i, int i2) {
        int iM9231D;
        int iM9231D2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.k0 == 1) {
            iM9231D2 = RecyclerView.AbstractC2379p.m9231D(i2, rect.height() + paddingTop, q0());
            iM9231D = RecyclerView.AbstractC2379p.m9231D(i, (this.l0 * this.f9899Z) + paddingLeft, r0());
        } else {
            iM9231D = RecyclerView.AbstractC2379p.m9231D(i, rect.width() + paddingLeft, r0());
            iM9231D2 = RecyclerView.AbstractC2379p.m9231D(i2, (this.l0 * this.f9899Z) + paddingTop, q0());
        }
        O1(iM9231D, iM9231D2);
    }

    public final void P2(RecyclerView.C2385v c2385v, int i) {
        while (m9241Z() > 0) {
            View viewM9240Y = m9240Y(0);
            if (this.i0.mo9627d(viewM9240Y) > i || this.i0.mo9640q(viewM9240Y) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewM9240Y.getLayoutParams();
            if (layoutParams.f9901f) {
                for (int i2 = 0; i2 < this.f9899Z; i2++) {
                    if (this.h0[i2].f9926a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f9899Z; i3++) {
                    this.h0[i3].m9396t();
                }
            } else if (layoutParams.f9900e.f9926a.size() == 1) {
                return;
            } else {
                layoutParams.f9900e.m9396t();
            }
            z1(viewM9240Y, c2385v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void Q0(RecyclerView.AbstractC2371h abstractC2371h, RecyclerView.AbstractC2371h abstractC2371h2) {
        this.s0.m9352b();
        for (int i = 0; i < this.f9899Z; i++) {
            this.h0[i].m9381e();
        }
    }

    public final void Q2() {
        if (this.j0.mo9635l() == 1073741824) {
            return;
        }
        int iM9241Z = m9241Z();
        float fMax = 0.0f;
        for (int i = 0; i < iM9241Z; i++) {
            View viewM9240Y = m9240Y(i);
            float fMo9628e = this.j0.mo9628e(viewM9240Y);
            if (fMo9628e >= fMax) {
                if (((LayoutParams) viewM9240Y.getLayoutParams()).m9350e()) {
                    fMo9628e = (fMo9628e * 1.0f) / this.f9899Z;
                }
                fMax = Math.max(fMax, fMo9628e);
            }
        }
        int i2 = this.l0;
        int iRound = Math.round(fMax * this.f9899Z);
        if (this.j0.mo9635l() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.j0.mo9638o());
        }
        c3(iRound);
        if (this.l0 == i2) {
            return;
        }
        for (int i3 = 0; i3 < iM9241Z; i3++) {
            View viewM9240Y2 = m9240Y(i3);
            LayoutParams layoutParams = (LayoutParams) viewM9240Y2.getLayoutParams();
            if (!layoutParams.f9901f) {
                if (G2() && this.k0 == 1) {
                    int i4 = this.f9899Z;
                    int i5 = layoutParams.f9900e.f9930e;
                    viewM9240Y2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.l0) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = layoutParams.f9900e.f9930e;
                    int i7 = this.l0 * i6;
                    int i8 = i6 * i2;
                    if (this.k0 == 1) {
                        viewM9240Y2.offsetLeftAndRight(i7 - i8);
                    } else {
                        viewM9240Y2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    public final void R2() {
        if (this.k0 == 1 || !G2()) {
            this.o0 = this.n0;
        } else {
            this.o0 = !this.n0;
        }
    }

    public int S2(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0 || i == 0) {
            return 0;
        }
        L2(i, c2389z);
        int iO2 = o2(c2385v, this.m0, c2389z);
        if (this.m0.f10163b >= iO2) {
            i = i < 0 ? -iO2 : iO2;
        }
        this.i0.mo9642s(-i);
        this.u0 = this.o0;
        C2405k c2405k = this.m0;
        c2405k.f10163b = 0;
        N2(c2385v, c2405k);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: T */
    public RecyclerView.LayoutParams mo9014T() {
        return this.k0 == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public final void T2(int i) {
        C2405k c2405k = this.m0;
        c2405k.f10166e = i;
        c2405k.f10165d = this.o0 != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: U */
    public RecyclerView.LayoutParams mo9015U(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void U0(RecyclerView recyclerView, RecyclerView.C2385v c2385v) {
        super.U0(recyclerView, c2385v);
        B1(this.D0);
        for (int i = 0; i < this.f9899Z; i++) {
            this.h0[i].m9381e();
        }
        recyclerView.requestLayout();
    }

    public void U2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo9036w(null);
        if (i == this.k0) {
            return;
        }
        this.k0 = i;
        AbstractC2408n abstractC2408n = this.i0;
        this.i0 = this.j0;
        this.j0 = abstractC2408n;
        G1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: V */
    public RecyclerView.LayoutParams mo9016V(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public View V0(View view, int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        View viewM9237R;
        View viewM9389m;
        if (m9241Z() == 0 || (viewM9237R = m9237R(view)) == null) {
            return null;
        }
        R2();
        int iK2 = k2(i);
        if (iK2 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewM9237R.getLayoutParams();
        boolean z = layoutParams.f9901f;
        C2394c c2394c = layoutParams.f9900e;
        int iX2 = iK2 == 1 ? x2() : w2();
        b3(iX2, c2389z);
        T2(iK2);
        C2405k c2405k = this.m0;
        c2405k.f10164c = c2405k.f10165d + iX2;
        c2405k.f10163b = (int) (this.i0.mo9638o() * 0.33333334f);
        C2405k c2405k2 = this.m0;
        c2405k2.f10169h = true;
        c2405k2.f10162a = false;
        o2(c2385v, c2405k2, c2389z);
        this.u0 = this.o0;
        if (!z && (viewM9389m = c2394c.m9389m(iX2, iK2)) != null && viewM9389m != viewM9237R) {
            return viewM9389m;
        }
        if (K2(iK2)) {
            for (int i2 = this.f9899Z - 1; i2 >= 0; i2--) {
                View viewM9389m2 = this.h0[i2].m9389m(iX2, iK2);
                if (viewM9389m2 != null && viewM9389m2 != viewM9237R) {
                    return viewM9389m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f9899Z; i3++) {
                View viewM9389m3 = this.h0[i3].m9389m(iX2, iK2);
                if (viewM9389m3 != null && viewM9389m3 != viewM9237R) {
                    return viewM9389m3;
                }
            }
        }
        boolean z2 = (this.n0 ^ true) == (iK2 == -1);
        if (!z) {
            View viewMo9033S = mo9033S(z2 ? c2394c.m9382f() : c2394c.m9383g());
            if (viewMo9033S != null && viewMo9033S != viewM9237R) {
                return viewMo9033S;
            }
        }
        if (K2(iK2)) {
            for (int i4 = this.f9899Z - 1; i4 >= 0; i4--) {
                if (i4 != c2394c.f9930e) {
                    View viewMo9033S2 = mo9033S(z2 ? this.h0[i4].m9382f() : this.h0[i4].m9383g());
                    if (viewMo9033S2 != null && viewMo9033S2 != viewM9237R) {
                        return viewMo9033S2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f9899Z; i5++) {
                View viewMo9033S3 = mo9033S(z2 ? this.h0[i5].m9382f() : this.h0[i5].m9383g());
                if (viewMo9033S3 != null && viewMo9033S3 != viewM9237R) {
                    return viewMo9033S3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void V1(RecyclerView recyclerView, RecyclerView.C2389z c2389z, int i) {
        C2406l c2406l = new C2406l(recyclerView.getContext());
        c2406l.m9335p(i);
        W1(c2406l);
    }

    public void V2(boolean z) {
        mo9036w(null);
        SavedState savedState = this.w0;
        if (savedState != null && savedState.f9915h != z) {
            savedState.f9915h = z;
        }
        this.n0 = z;
        G1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void W0(AccessibilityEvent accessibilityEvent) {
        super.W0(accessibilityEvent);
        if (m9241Z() > 0) {
            View viewR2 = r2(false);
            View viewQ2 = q2(false);
            if (viewR2 == null || viewQ2 == null) {
                return;
            }
            int iS0 = s0(viewR2);
            int iS02 = s0(viewQ2);
            if (iS0 < iS02) {
                accessibilityEvent.setFromIndex(iS0);
                accessibilityEvent.setToIndex(iS02);
            } else {
                accessibilityEvent.setFromIndex(iS02);
                accessibilityEvent.setToIndex(iS0);
            }
        }
    }

    public void W2(int i) {
        mo9036w(null);
        if (i != this.f9899Z) {
            F2();
            this.f9899Z = i;
            this.p0 = new BitSet(this.f9899Z);
            this.h0 = new C2394c[this.f9899Z];
            for (int i2 = 0; i2 < this.f9899Z; i2++) {
                this.h0[i2] = new C2394c(i2);
            }
            G1();
        }
    }

    public final void X2(int i, int i2) {
        for (int i3 = 0; i3 < this.f9899Z; i3++) {
            if (!this.h0[i3].f9926a.isEmpty()) {
                d3(this.h0[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public boolean Y1() {
        return this.w0 == null;
    }

    public final boolean Y2(RecyclerView.C2389z c2389z, C2393b c2393b) {
        c2393b.f9919a = this.u0 ? t2(c2389z.m9344b()) : p2(c2389z.m9344b());
        c2393b.f9920b = Integer.MIN_VALUE;
        return true;
    }

    public final void Z1(View view) {
        for (int i = this.f9899Z - 1; i >= 0; i--) {
            this.h0[i].m9377a(view);
        }
    }

    public boolean Z2(RecyclerView.C2389z c2389z, C2393b c2393b) {
        int i;
        if (!c2389z.m9347e() && (i = this.q0) != -1) {
            if (i >= 0 && i < c2389z.m9344b()) {
                SavedState savedState = this.w0;
                if (savedState == null || savedState.f9908a == -1 || savedState.f9910c < 1) {
                    View viewMo9033S = mo9033S(this.q0);
                    if (viewMo9033S != null) {
                        c2393b.f9919a = this.o0 ? x2() : w2();
                        if (this.r0 != Integer.MIN_VALUE) {
                            if (c2393b.f9921c) {
                                c2393b.f9920b = (this.i0.mo9632i() - this.r0) - this.i0.mo9627d(viewMo9033S);
                            } else {
                                c2393b.f9920b = (this.i0.mo9637n() + this.r0) - this.i0.mo9630g(viewMo9033S);
                            }
                            return true;
                        }
                        if (this.i0.mo9628e(viewMo9033S) > this.i0.mo9638o()) {
                            c2393b.f9920b = c2393b.f9921c ? this.i0.mo9632i() : this.i0.mo9637n();
                            return true;
                        }
                        int iMo9630g = this.i0.mo9630g(viewMo9033S) - this.i0.mo9637n();
                        if (iMo9630g < 0) {
                            c2393b.f9920b = -iMo9630g;
                            return true;
                        }
                        int iMo9632i = this.i0.mo9632i() - this.i0.mo9627d(viewMo9033S);
                        if (iMo9632i < 0) {
                            c2393b.f9920b = iMo9632i;
                            return true;
                        }
                        c2393b.f9920b = Integer.MIN_VALUE;
                    } else {
                        int i2 = this.q0;
                        c2393b.f9919a = i2;
                        int i3 = this.r0;
                        if (i3 == Integer.MIN_VALUE) {
                            c2393b.f9921c = e2(i2) == 1;
                            c2393b.m9373a();
                        } else {
                            c2393b.m9374b(i3);
                        }
                        c2393b.f9922d = true;
                    }
                } else {
                    c2393b.f9920b = Integer.MIN_VALUE;
                    c2393b.f9919a = this.q0;
                }
                return true;
            }
            this.q0 = -1;
            this.r0 = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void a2(C2393b c2393b) {
        SavedState savedState = this.w0;
        int i = savedState.f9910c;
        if (i > 0) {
            if (i == this.f9899Z) {
                for (int i2 = 0; i2 < this.f9899Z; i2++) {
                    this.h0[i2].m9381e();
                    SavedState savedState2 = this.w0;
                    int iMo9632i = savedState2.f9911d[i2];
                    if (iMo9632i != Integer.MIN_VALUE) {
                        iMo9632i += savedState2.f9916q ? this.i0.mo9632i() : this.i0.mo9637n();
                    }
                    this.h0[i2].m9398v(iMo9632i);
                }
            } else {
                savedState.m9370b();
                SavedState savedState3 = this.w0;
                savedState3.f9908a = savedState3.f9909b;
            }
        }
        SavedState savedState4 = this.w0;
        this.v0 = savedState4.f9917s;
        V2(savedState4.f9915h);
        R2();
        SavedState savedState5 = this.w0;
        int i3 = savedState5.f9908a;
        if (i3 != -1) {
            this.q0 = i3;
            c2393b.f9921c = savedState5.f9916q;
        } else {
            c2393b.f9921c = this.o0;
        }
        if (savedState5.f9912e > 1) {
            LazySpanLookup lazySpanLookup = this.s0;
            lazySpanLookup.f9902a = savedState5.f9913f;
            lazySpanLookup.f9903b = savedState5.f9914g;
        }
    }

    public void a3(RecyclerView.C2389z c2389z, C2393b c2393b) {
        if (Z2(c2389z, c2393b) || Y2(c2389z, c2393b)) {
            return;
        }
        c2393b.m9373a();
        c2393b.f9919a = 0;
    }

    public boolean b2() {
        int iM9388l = this.h0[0].m9388l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f9899Z; i++) {
            if (this.h0[i].m9388l(Integer.MIN_VALUE) != iM9388l) {
                return false;
            }
        }
        return true;
    }

    public final void b3(int i, RecyclerView.C2389z c2389z) {
        int iMo9638o;
        int iMo9638o2;
        int iM9345c;
        C2405k c2405k = this.m0;
        boolean z = false;
        c2405k.f10163b = 0;
        c2405k.f10164c = i;
        if (!J0() || (iM9345c = c2389z.m9345c()) == -1) {
            iMo9638o = 0;
            iMo9638o2 = 0;
        } else {
            if (this.o0 == (iM9345c < i)) {
                iMo9638o = this.i0.mo9638o();
                iMo9638o2 = 0;
            } else {
                iMo9638o2 = this.i0.mo9638o();
                iMo9638o = 0;
            }
        }
        if (c0()) {
            this.m0.f10167f = this.i0.mo9637n() - iMo9638o2;
            this.m0.f10168g = this.i0.mo9632i() + iMo9638o;
        } else {
            this.m0.f10168g = this.i0.mo9631h() + iMo9638o;
            this.m0.f10167f = -iMo9638o2;
        }
        C2405k c2405k2 = this.m0;
        c2405k2.f10169h = false;
        c2405k2.f10162a = true;
        if (this.i0.mo9635l() == 0 && this.i0.mo9631h() == 0) {
            z = true;
        }
        c2405k2.f10170i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2388y.b
    /* renamed from: c */
    public PointF mo9034c(int i) {
        int iE2 = e2(i);
        PointF pointF = new PointF();
        if (iE2 == 0) {
            return null;
        }
        if (this.k0 == 0) {
            pointF.x = iE2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iE2;
        }
        return pointF;
    }

    public boolean c2() {
        int iM9392p = this.h0[0].m9392p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f9899Z; i++) {
            if (this.h0[i].m9392p(Integer.MIN_VALUE) != iM9392p) {
                return false;
            }
        }
        return true;
    }

    public void c3(int i) {
        this.l0 = i / this.f9899Z;
        this.x0 = View.MeasureSpec.makeMeasureSpec(i, this.j0.mo9635l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void d1(RecyclerView recyclerView, int i, int i2) {
        D2(i, i2, 1);
    }

    public final void d2(View view, LayoutParams layoutParams, C2405k c2405k) {
        if (c2405k.f10166e == 1) {
            if (layoutParams.f9901f) {
                Z1(view);
                return;
            } else {
                layoutParams.f9900e.m9377a(view);
                return;
            }
        }
        if (layoutParams.f9901f) {
            M2(view);
        } else {
            layoutParams.f9900e.m9397u(view);
        }
    }

    public final void d3(C2394c c2394c, int i, int i2) {
        int iM9386j = c2394c.m9386j();
        if (i == -1) {
            if (c2394c.m9391o() + iM9386j <= i2) {
                this.p0.set(c2394c.f9930e, false);
            }
        } else if (c2394c.m9387k() - iM9386j >= i2) {
            this.p0.set(c2394c.f9930e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void e1(RecyclerView recyclerView) {
        this.s0.m9352b();
        G1();
    }

    public final int e2(int i) {
        if (m9241Z() == 0) {
            return this.o0 ? 1 : -1;
        }
        return (i < w2()) != this.o0 ? -1 : 1;
    }

    public final int e3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void f1(RecyclerView recyclerView, int i, int i2, int i3) {
        D2(i, i2, 8);
    }

    public boolean f2() {
        int iW2;
        int iX2;
        if (m9241Z() == 0 || this.t0 == 0 || !C0()) {
            return false;
        }
        if (this.o0) {
            iW2 = x2();
            iX2 = w2();
        } else {
            iW2 = w2();
            iX2 = x2();
        }
        if (iW2 == 0 && E2() != null) {
            this.s0.m9352b();
            H1();
            G1();
            return true;
        }
        if (!this.A0) {
            return false;
        }
        int i = this.o0 ? -1 : 1;
        int i2 = iX2 + 1;
        LazySpanLookup.FullSpanItem fullSpanItemM9355e = this.s0.m9355e(iW2, i2, i, true);
        if (fullSpanItemM9355e == null) {
            this.A0 = false;
            this.s0.m9354d(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemM9355e2 = this.s0.m9355e(iW2, fullSpanItemM9355e.f9904a, i * (-1), true);
        if (fullSpanItemM9355e2 == null) {
            this.s0.m9354d(fullSpanItemM9355e.f9904a);
        } else {
            this.s0.m9354d(fullSpanItemM9355e2.f9904a + 1);
        }
        H1();
        G1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void g1(RecyclerView recyclerView, int i, int i2) {
        D2(i, i2, 2);
    }

    public final boolean g2(C2394c c2394c) {
        if (this.o0) {
            if (c2394c.m9387k() < this.i0.mo9632i()) {
                ArrayList arrayList = c2394c.f9926a;
                return !c2394c.m9390n((View) arrayList.get(arrayList.size() - 1)).f9901f;
            }
        } else if (c2394c.m9391o() > this.i0.mo9637n()) {
            return !c2394c.m9390n((View) c2394c.f9926a.get(0)).f9901f;
        }
        return false;
    }

    public final int h2(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0) {
            return 0;
        }
        return AbstractC2411q.m9662a(c2389z, this.i0, r2(!this.B0), q2(!this.B0), this, this.B0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void i1(RecyclerView recyclerView, int i, int i2, Object obj) {
        D2(i, i2, 4);
    }

    public final int i2(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0) {
            return 0;
        }
        return AbstractC2411q.m9663b(c2389z, this.i0, r2(!this.B0), q2(!this.B0), this, this.B0, this.o0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void j1(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        J2(c2385v, c2389z, true);
    }

    public final int j2(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0) {
            return 0;
        }
        return AbstractC2411q.m9664c(c2389z, this.i0, r2(!this.B0), q2(!this.B0), this, this.B0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void k1(RecyclerView.C2389z c2389z) {
        super.k1(c2389z);
        this.q0 = -1;
        this.r0 = Integer.MIN_VALUE;
        this.w0 = null;
        this.z0.m9375c();
    }

    public final int k2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.k0 == 1) ? 1 : Integer.MIN_VALUE : this.k0 == 0 ? 1 : Integer.MIN_VALUE : this.k0 == 1 ? -1 : Integer.MIN_VALUE : this.k0 == 0 ? -1 : Integer.MIN_VALUE : (this.k0 != 1 && G2()) ? -1 : 1 : (this.k0 != 1 && G2()) ? 1 : -1;
    }

    public final LazySpanLookup.FullSpanItem l2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f9906c = new int[this.f9899Z];
        for (int i2 = 0; i2 < this.f9899Z; i2++) {
            fullSpanItem.f9906c[i2] = i - this.h0[i2].m9388l(i);
        }
        return fullSpanItem;
    }

    public final LazySpanLookup.FullSpanItem m2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f9906c = new int[this.f9899Z];
        for (int i2 = 0; i2 < this.f9899Z; i2++) {
            fullSpanItem.f9906c[i2] = this.h0[i2].m9392p(i) - i;
        }
        return fullSpanItem;
    }

    public final void n2() {
        this.i0 = AbstractC2408n.m9625b(this, this.k0);
        this.j0 = AbstractC2408n.m9625b(this, 1 - this.k0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void o1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.w0 = savedState;
            if (this.q0 != -1) {
                savedState.m9369a();
                this.w0.m9370b();
            }
            G1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int o2(RecyclerView.C2385v c2385v, C2405k c2405k, RecyclerView.C2389z c2389z) {
        C2394c c2394cC2;
        int iMo9628e;
        int i;
        int iMo9628e2;
        int iMo9628e3;
        boolean z;
        ?? r9 = 0;
        this.p0.set(0, this.f9899Z, true);
        int i2 = this.m0.f10170i ? c2405k.f10166e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE : c2405k.f10166e == 1 ? c2405k.f10168g + c2405k.f10163b : c2405k.f10167f - c2405k.f10163b;
        X2(c2405k.f10166e, i2);
        int iMo9632i = this.o0 ? this.i0.mo9632i() : this.i0.mo9637n();
        boolean z2 = false;
        while (c2405k.m9605a(c2389z) && (this.m0.f10170i || !this.p0.isEmpty())) {
            View viewM9606b = c2405k.m9606b(c2385v);
            LayoutParams layoutParams = (LayoutParams) viewM9606b.getLayoutParams();
            int iM9104a = layoutParams.m9104a();
            int iM9357g = this.s0.m9357g(iM9104a);
            boolean z3 = iM9357g == -1 ? true : r9;
            if (z3) {
                c2394cC2 = layoutParams.f9901f ? this.h0[r9] : C2(c2405k);
                this.s0.m9364n(iM9104a, c2394cC2);
            } else {
                c2394cC2 = this.h0[iM9357g];
            }
            C2394c c2394c = c2394cC2;
            layoutParams.f9900e = c2394c;
            if (c2405k.f10166e == 1) {
                m9245t(viewM9606b);
            } else {
                m9246u(viewM9606b, r9);
            }
            I2(viewM9606b, layoutParams, r9);
            if (c2405k.f10166e == 1) {
                int iY2 = layoutParams.f9901f ? y2(iMo9632i) : c2394c.m9388l(iMo9632i);
                int iMo9628e4 = this.i0.mo9628e(viewM9606b) + iY2;
                if (z3 && layoutParams.f9901f) {
                    LazySpanLookup.FullSpanItem fullSpanItemL2 = l2(iY2);
                    fullSpanItemL2.f9905b = -1;
                    fullSpanItemL2.f9904a = iM9104a;
                    this.s0.m9351a(fullSpanItemL2);
                }
                i = iMo9628e4;
                iMo9628e = iY2;
            } else {
                int iB2 = layoutParams.f9901f ? B2(iMo9632i) : c2394c.m9392p(iMo9632i);
                iMo9628e = iB2 - this.i0.mo9628e(viewM9606b);
                if (z3 && layoutParams.f9901f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM2 = m2(iB2);
                    fullSpanItemM2.f9905b = 1;
                    fullSpanItemM2.f9904a = iM9104a;
                    this.s0.m9351a(fullSpanItemM2);
                }
                i = iB2;
            }
            if (layoutParams.f9901f && c2405k.f10165d == -1) {
                if (z3) {
                    this.A0 = true;
                } else {
                    if (!(c2405k.f10166e == 1 ? b2() : c2())) {
                        LazySpanLookup.FullSpanItem fullSpanItemM9356f = this.s0.m9356f(iM9104a);
                        if (fullSpanItemM9356f != null) {
                            fullSpanItemM9356f.f9907d = true;
                        }
                        this.A0 = true;
                    }
                }
            }
            d2(viewM9606b, layoutParams, c2405k);
            if (G2() && this.k0 == 1) {
                int iMo9632i2 = layoutParams.f9901f ? this.j0.mo9632i() : this.j0.mo9632i() - (((this.f9899Z - 1) - c2394c.f9930e) * this.l0);
                iMo9628e3 = iMo9632i2;
                iMo9628e2 = iMo9632i2 - this.j0.mo9628e(viewM9606b);
            } else {
                int iMo9637n = layoutParams.f9901f ? this.j0.mo9637n() : (c2394c.f9930e * this.l0) + this.j0.mo9637n();
                iMo9628e2 = iMo9637n;
                iMo9628e3 = this.j0.mo9628e(viewM9606b) + iMo9637n;
            }
            if (this.k0 == 1) {
                L0(viewM9606b, iMo9628e2, iMo9628e, iMo9628e3, i);
            } else {
                L0(viewM9606b, iMo9628e, iMo9628e2, i, iMo9628e3);
            }
            if (layoutParams.f9901f) {
                X2(this.m0.f10166e, i2);
            } else {
                d3(c2394c, this.m0.f10166e, i2);
            }
            N2(c2385v, this.m0);
            if (!this.m0.f10169h || !viewM9606b.hasFocusable()) {
                z = false;
            } else if (layoutParams.f9901f) {
                this.p0.clear();
                z = false;
            } else {
                z = false;
                this.p0.set(c2394c.f9930e, false);
            }
            r9 = z;
            z2 = true;
        }
        int i3 = r9;
        if (!z2) {
            N2(c2385v, this.m0);
        }
        int iMo9637n2 = this.m0.f10166e == -1 ? this.i0.mo9637n() - B2(this.i0.mo9637n()) : y2(this.i0.mo9632i()) - this.i0.mo9632i();
        return iMo9637n2 > 0 ? Math.min(c2405k.f10163b, iMo9637n2) : i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public Parcelable p1() {
        int iM9392p;
        int iMo9637n;
        int[] iArr;
        if (this.w0 != null) {
            return new SavedState(this.w0);
        }
        SavedState savedState = new SavedState();
        savedState.f9915h = this.n0;
        savedState.f9916q = this.u0;
        savedState.f9917s = this.v0;
        LazySpanLookup lazySpanLookup = this.s0;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f9902a) == null) {
            savedState.f9912e = 0;
        } else {
            savedState.f9913f = iArr;
            savedState.f9912e = iArr.length;
            savedState.f9914g = lazySpanLookup.f9903b;
        }
        if (m9241Z() > 0) {
            savedState.f9908a = this.u0 ? x2() : w2();
            savedState.f9909b = s2();
            int i = this.f9899Z;
            savedState.f9910c = i;
            savedState.f9911d = new int[i];
            for (int i2 = 0; i2 < this.f9899Z; i2++) {
                if (this.u0) {
                    iM9392p = this.h0[i2].m9388l(Integer.MIN_VALUE);
                    if (iM9392p != Integer.MIN_VALUE) {
                        iMo9637n = this.i0.mo9632i();
                        iM9392p -= iMo9637n;
                    }
                } else {
                    iM9392p = this.h0[i2].m9392p(Integer.MIN_VALUE);
                    if (iM9392p != Integer.MIN_VALUE) {
                        iMo9637n = this.i0.mo9637n();
                        iM9392p -= iMo9637n;
                    }
                }
                savedState.f9911d[i2] = iM9392p;
            }
        } else {
            savedState.f9908a = -1;
            savedState.f9909b = -1;
            savedState.f9910c = 0;
        }
        return savedState;
    }

    public final int p2(int i) {
        int iM9241Z = m9241Z();
        for (int i2 = 0; i2 < iM9241Z; i2++) {
            int iS0 = s0(m9240Y(i2));
            if (iS0 >= 0 && iS0 < i) {
                return iS0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void q1(int i) {
        if (i == 0) {
            f2();
        }
    }

    public View q2(boolean z) {
        int iMo9637n = this.i0.mo9637n();
        int iMo9632i = this.i0.mo9632i();
        View view = null;
        for (int iM9241Z = m9241Z() - 1; iM9241Z >= 0; iM9241Z--) {
            View viewM9240Y = m9240Y(iM9241Z);
            int iMo9630g = this.i0.mo9630g(viewM9240Y);
            int iMo9627d = this.i0.mo9627d(viewM9240Y);
            if (iMo9627d > iMo9637n && iMo9630g < iMo9632i) {
                if (iMo9627d <= iMo9632i || !z) {
                    return viewM9240Y;
                }
                if (view == null) {
                    view = viewM9240Y;
                }
            }
        }
        return view;
    }

    public View r2(boolean z) {
        int iMo9637n = this.i0.mo9637n();
        int iMo9632i = this.i0.mo9632i();
        int iM9241Z = m9241Z();
        View view = null;
        for (int i = 0; i < iM9241Z; i++) {
            View viewM9240Y = m9240Y(i);
            int iMo9630g = this.i0.mo9630g(viewM9240Y);
            if (this.i0.mo9627d(viewM9240Y) > iMo9637n && iMo9630g < iMo9632i) {
                if (iMo9630g >= iMo9637n || !z) {
                    return viewM9240Y;
                }
                if (view == null) {
                    view = viewM9240Y;
                }
            }
        }
        return view;
    }

    public int s2() {
        View viewQ2 = this.o0 ? q2(true) : r2(true);
        if (viewQ2 == null) {
            return -1;
        }
        return s0(viewQ2);
    }

    public final int t2(int i) {
        for (int iM9241Z = m9241Z() - 1; iM9241Z >= 0; iM9241Z--) {
            int iS0 = s0(m9240Y(iM9241Z));
            if (iS0 >= 0 && iS0 < i) {
                return iS0;
            }
        }
        return 0;
    }

    public final void u2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, boolean z) {
        int iMo9632i;
        int iY2 = y2(Integer.MIN_VALUE);
        if (iY2 != Integer.MIN_VALUE && (iMo9632i = this.i0.mo9632i() - iY2) > 0) {
            int i = iMo9632i - (-S2(-iMo9632i, c2385v, c2389z));
            if (!z || i <= 0) {
                return;
            }
            this.i0.mo9642s(i);
        }
    }

    public final void v2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, boolean z) {
        int iMo9637n;
        int iB2 = B2(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iB2 != Integer.MAX_VALUE && (iMo9637n = iB2 - this.i0.mo9637n()) > 0) {
            int iS2 = iMo9637n - S2(iMo9637n, c2385v, c2389z);
            if (!z || iS2 <= 0) {
                return;
            }
            this.i0.mo9642s(-iS2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: w */
    public void mo9036w(String str) {
        if (this.w0 == null) {
            super.mo9036w(str);
        }
    }

    public int w2() {
        if (m9241Z() == 0) {
            return 0;
        }
        return s0(m9240Y(0));
    }

    public int x2() {
        int iM9241Z = m9241Z();
        if (iM9241Z == 0) {
            return 0;
        }
        return s0(m9240Y(iM9241Z - 1));
    }

    public final int y2(int i) {
        int iM9388l = this.h0[0].m9388l(i);
        for (int i2 = 1; i2 < this.f9899Z; i2++) {
            int iM9388l2 = this.h0[i2].m9388l(i);
            if (iM9388l2 > iM9388l) {
                iM9388l = iM9388l2;
            }
        }
        return iM9388l;
    }

    public final int z2(int i) {
        int iM9392p = this.h0[0].m9392p(i);
        for (int i2 = 1; i2 < this.f9899Z; i2++) {
            int iM9392p2 = this.h0[i2].m9392p(i);
            if (iM9392p2 > iM9392p) {
                iM9392p = iM9392p2;
            }
        }
        return iM9392p;
    }

    public static class LazySpanLookup {

        /* renamed from: a */
        public int[] f9902a;

        /* renamed from: b */
        public List f9903b;

        /* renamed from: a */
        public void m9351a(FullSpanItem fullSpanItem) {
            if (this.f9903b == null) {
                this.f9903b = new ArrayList();
            }
            int size = this.f9903b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f9903b.get(i);
                if (fullSpanItem2.f9904a == fullSpanItem.f9904a) {
                    this.f9903b.remove(i);
                }
                if (fullSpanItem2.f9904a >= fullSpanItem.f9904a) {
                    this.f9903b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f9903b.add(fullSpanItem);
        }

        /* renamed from: b */
        public void m9352b() {
            int[] iArr = this.f9902a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f9903b = null;
        }

        /* renamed from: c */
        public void m9353c(int i) {
            int[] iArr = this.f9902a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f9902a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m9365o(i)];
                this.f9902a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f9902a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public int m9354d(int i) {
            List list = this.f9903b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f9903b.get(size)).f9904a >= i) {
                        this.f9903b.remove(size);
                    }
                }
            }
            return m9358h(i);
        }

        /* renamed from: e */
        public FullSpanItem m9355e(int i, int i2, int i3, boolean z) {
            List list = this.f9903b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f9903b.get(i4);
                int i5 = fullSpanItem.f9904a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f9905b == i3 || (z && fullSpanItem.f9907d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem m9356f(int i) {
            List list = this.f9903b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f9903b.get(size);
                if (fullSpanItem.f9904a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int m9357g(int i) {
            int[] iArr = this.f9902a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: h */
        public int m9358h(int i) {
            int[] iArr = this.f9902a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int iM9359i = m9359i(i);
            if (iM9359i == -1) {
                int[] iArr2 = this.f9902a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f9902a.length;
            }
            int iMin = Math.min(iM9359i + 1, this.f9902a.length);
            Arrays.fill(this.f9902a, i, iMin, -1);
            return iMin;
        }

        /* renamed from: i */
        public final int m9359i(int i) {
            if (this.f9903b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemM9356f = m9356f(i);
            if (fullSpanItemM9356f != null) {
                this.f9903b.remove(fullSpanItemM9356f);
            }
            int size = this.f9903b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (((FullSpanItem) this.f9903b.get(i2)).f9904a >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f9903b.get(i2);
            this.f9903b.remove(i2);
            return fullSpanItem.f9904a;
        }

        /* renamed from: j */
        public void m9360j(int i, int i2) {
            int[] iArr = this.f9902a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m9353c(i3);
            int[] iArr2 = this.f9902a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f9902a, i, i3, -1);
            m9362l(i, i2);
        }

        /* renamed from: k */
        public void m9361k(int i, int i2) {
            int[] iArr = this.f9902a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m9353c(i3);
            int[] iArr2 = this.f9902a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f9902a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m9363m(i, i2);
        }

        /* renamed from: l */
        public final void m9362l(int i, int i2) {
            List list = this.f9903b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f9903b.get(size);
                int i3 = fullSpanItem.f9904a;
                if (i3 >= i) {
                    fullSpanItem.f9904a = i3 + i2;
                }
            }
        }

        /* renamed from: m */
        public final void m9363m(int i, int i2) {
            List list = this.f9903b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f9903b.get(size);
                int i4 = fullSpanItem.f9904a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f9903b.remove(size);
                    } else {
                        fullSpanItem.f9904a = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: n */
        public void m9364n(int i, C2394c c2394c) {
            m9353c(i);
            this.f9902a[i] = c2394c.f9930e;
        }

        /* renamed from: o */
        public int m9365o(int i) {
            int length = this.f9902a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C2390a();

            /* renamed from: a */
            public int f9904a;

            /* renamed from: b */
            public int f9905b;

            /* renamed from: c */
            public int[] f9906c;

            /* renamed from: d */
            public boolean f9907d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public class C2390a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f9904a = parcel.readInt();
                this.f9905b = parcel.readInt();
                this.f9907d = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.f9906c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            public int m9366a(int i) {
                int[] iArr = this.f9906c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f9904a + ", mGapDir=" + this.f9905b + ", mHasUnwantedGapAfter=" + this.f9907d + ", mGapPerSpan=" + Arrays.toString(this.f9906c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f9904a);
                parcel.writeInt(this.f9905b);
                parcel.writeInt(this.f9907d ? 1 : 0);
                int[] iArr = this.f9906c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f9906c);
                }
            }

            public FullSpanItem() {
            }
        }
    }
}
