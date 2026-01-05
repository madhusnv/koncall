package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C2404j;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* loaded from: classes2.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC2379p implements C2404j.i, RecyclerView.AbstractC2388y.b {

    /* renamed from: Z */
    public int f9736Z;
    public C2362c h0;
    public AbstractC2408n i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public int p0;
    public boolean q0;
    public SavedState r0;
    public final C2360a s0;
    public final C2361b t0;
    public int u0;
    public int[] v0;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2359a();

        /* renamed from: a */
        public int f9737a;

        /* renamed from: b */
        public int f9738b;

        /* renamed from: c */
        public boolean f9739c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public class C2359a implements Parcelable.Creator {
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
        public boolean m9037a() {
            return this.f9737a >= 0;
        }

        /* renamed from: b */
        public void m9038b() {
            this.f9737a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9737a);
            parcel.writeInt(this.f9738b);
            parcel.writeInt(this.f9739c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f9737a = parcel.readInt();
            this.f9738b = parcel.readInt();
            this.f9739c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f9737a = savedState.f9737a;
            this.f9738b = savedState.f9738b;
            this.f9739c = savedState.f9739c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C2360a {

        /* renamed from: a */
        public AbstractC2408n f9740a;

        /* renamed from: b */
        public int f9741b;

        /* renamed from: c */
        public int f9742c;

        /* renamed from: d */
        public boolean f9743d;

        /* renamed from: e */
        public boolean f9744e;

        public C2360a() {
            m9045e();
        }

        /* renamed from: a */
        public void m9041a() {
            this.f9742c = this.f9743d ? this.f9740a.mo9632i() : this.f9740a.mo9637n();
        }

        /* renamed from: b */
        public void m9042b(View view, int i) {
            if (this.f9743d) {
                this.f9742c = this.f9740a.mo9627d(view) + this.f9740a.m9639p();
            } else {
                this.f9742c = this.f9740a.mo9630g(view);
            }
            this.f9741b = i;
        }

        /* renamed from: c */
        public void m9043c(View view, int i) {
            int iM9639p = this.f9740a.m9639p();
            if (iM9639p >= 0) {
                m9042b(view, i);
                return;
            }
            this.f9741b = i;
            if (this.f9743d) {
                int iMo9632i = (this.f9740a.mo9632i() - iM9639p) - this.f9740a.mo9627d(view);
                this.f9742c = this.f9740a.mo9632i() - iMo9632i;
                if (iMo9632i > 0) {
                    int iMo9628e = this.f9742c - this.f9740a.mo9628e(view);
                    int iMo9637n = this.f9740a.mo9637n();
                    int iMin = iMo9628e - (iMo9637n + Math.min(this.f9740a.mo9630g(view) - iMo9637n, 0));
                    if (iMin < 0) {
                        this.f9742c += Math.min(iMo9632i, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo9630g = this.f9740a.mo9630g(view);
            int iMo9637n2 = iMo9630g - this.f9740a.mo9637n();
            this.f9742c = iMo9630g;
            if (iMo9637n2 > 0) {
                int iMo9632i2 = (this.f9740a.mo9632i() - Math.min(0, (this.f9740a.mo9632i() - iM9639p) - this.f9740a.mo9627d(view))) - (iMo9630g + this.f9740a.mo9628e(view));
                if (iMo9632i2 < 0) {
                    this.f9742c -= Math.min(iMo9637n2, -iMo9632i2);
                }
            }
        }

        /* renamed from: d */
        public boolean m9044d(View view, RecyclerView.C2389z c2389z) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.m9106c() && layoutParams.m9104a() >= 0 && layoutParams.m9104a() < c2389z.m9344b();
        }

        /* renamed from: e */
        public void m9045e() {
            this.f9741b = -1;
            this.f9742c = Integer.MIN_VALUE;
            this.f9743d = false;
            this.f9744e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f9741b + ", mCoordinate=" + this.f9742c + ", mLayoutFromEnd=" + this.f9743d + ", mValid=" + this.f9744e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C2361b {

        /* renamed from: a */
        public int f9745a;

        /* renamed from: b */
        public boolean f9746b;

        /* renamed from: c */
        public boolean f9747c;

        /* renamed from: d */
        public boolean f9748d;

        /* renamed from: a */
        public void m9046a() {
            this.f9745a = 0;
            this.f9746b = false;
            this.f9747c = false;
            this.f9748d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C2362c {

        /* renamed from: b */
        public int f9750b;

        /* renamed from: c */
        public int f9751c;

        /* renamed from: d */
        public int f9752d;

        /* renamed from: e */
        public int f9753e;

        /* renamed from: f */
        public int f9754f;

        /* renamed from: g */
        public int f9755g;

        /* renamed from: k */
        public int f9759k;

        /* renamed from: m */
        public boolean f9761m;

        /* renamed from: a */
        public boolean f9749a = true;

        /* renamed from: h */
        public int f9756h = 0;

        /* renamed from: i */
        public int f9757i = 0;

        /* renamed from: j */
        public boolean f9758j = false;

        /* renamed from: l */
        public List f9760l = null;

        /* renamed from: a */
        public void m9047a() {
            m9048b(null);
        }

        /* renamed from: b */
        public void m9048b(View view) {
            View viewM9052f = m9052f(view);
            if (viewM9052f == null) {
                this.f9752d = -1;
            } else {
                this.f9752d = ((RecyclerView.LayoutParams) viewM9052f.getLayoutParams()).m9104a();
            }
        }

        /* renamed from: c */
        public boolean m9049c(RecyclerView.C2389z c2389z) {
            int i = this.f9752d;
            return i >= 0 && i < c2389z.m9344b();
        }

        /* renamed from: d */
        public View m9050d(RecyclerView.C2385v c2385v) {
            if (this.f9760l != null) {
                return m9051e();
            }
            View viewM9307o = c2385v.m9307o(this.f9752d);
            this.f9752d += this.f9753e;
            return viewM9307o;
        }

        /* renamed from: e */
        public final View m9051e() {
            int size = this.f9760l.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.d0) this.f9760l.get(i)).f9794a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.m9106c() && this.f9752d == layoutParams.m9104a()) {
                    m9048b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: f */
        public View m9052f(View view) {
            int iM9104a;
            int size = this.f9760l.size();
            View view2 = null;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.d0) this.f9760l.get(i2)).f9794a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.m9106c() && (iM9104a = (layoutParams.m9104a() - this.f9752d) * this.f9753e) >= 0 && iM9104a < i) {
                    view2 = view3;
                    if (iM9104a == 0) {
                        break;
                    }
                    i = iM9104a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: A */
    public boolean mo9027A() {
        return this.f9736Z == 0;
    }

    public boolean A2() {
        return o0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: B */
    public boolean mo9028B() {
        return this.f9736Z == 1;
    }

    public boolean B2() {
        return this.n0;
    }

    public void C2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, C2362c c2362c, C2361b c2361b) {
        int i;
        int i2;
        int i3;
        int paddingLeft;
        int iMo9629f;
        View viewM9050d = c2362c.m9050d(c2385v);
        if (viewM9050d == null) {
            c2361b.f9746b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewM9050d.getLayoutParams();
        if (c2362c.f9760l == null) {
            if (this.l0 == (c2362c.f9754f == -1)) {
                m9245t(viewM9050d);
            } else {
                m9246u(viewM9050d, 0);
            }
        } else {
            if (this.l0 == (c2362c.f9754f == -1)) {
                m9243r(viewM9050d);
            } else {
                m9244s(viewM9050d, 0);
            }
        }
        M0(viewM9050d, 0, 0);
        c2361b.f9745a = this.i0.mo9628e(viewM9050d);
        if (this.f9736Z == 1) {
            if (A2()) {
                iMo9629f = z0() - getPaddingRight();
                paddingLeft = iMo9629f - this.i0.mo9629f(viewM9050d);
            } else {
                paddingLeft = getPaddingLeft();
                iMo9629f = this.i0.mo9629f(viewM9050d) + paddingLeft;
            }
            if (c2362c.f9754f == -1) {
                int i4 = c2362c.f9750b;
                i3 = i4;
                i2 = iMo9629f;
                i = i4 - c2361b.f9745a;
            } else {
                int i5 = c2362c.f9750b;
                i = i5;
                i2 = iMo9629f;
                i3 = c2361b.f9745a + i5;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iMo9629f2 = this.i0.mo9629f(viewM9050d) + paddingTop;
            if (c2362c.f9754f == -1) {
                int i6 = c2362c.f9750b;
                i2 = i6;
                i = paddingTop;
                i3 = iMo9629f2;
                paddingLeft = i6 - c2361b.f9745a;
            } else {
                int i7 = c2362c.f9750b;
                i = paddingTop;
                i2 = c2361b.f9745a + i7;
                i3 = iMo9629f2;
                paddingLeft = i7;
            }
        }
        L0(viewM9050d, paddingLeft, i, i2, i3);
        if (layoutParams.m9106c() || layoutParams.m9105b()) {
            c2361b.f9747c = true;
        }
        c2361b.f9748d = viewM9050d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public boolean D0() {
        return true;
    }

    public final void D2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, int i, int i2) {
        if (!c2389z.m9349g() || m9241Z() == 0 || c2389z.m9347e() || !Y1()) {
            return;
        }
        List listM9303k = c2385v.m9303k();
        int size = listM9303k.size();
        int iS0 = s0(m9240Y(0));
        int iMo9628e = 0;
        int iMo9628e2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) listM9303k.get(i3);
            if (!d0Var.m9160x()) {
                if (((d0Var.m9151o() < iS0) != this.l0 ? (char) 65535 : (char) 1) == 65535) {
                    iMo9628e += this.i0.mo9628e(d0Var.f9794a);
                } else {
                    iMo9628e2 += this.i0.mo9628e(d0Var.f9794a);
                }
            }
        }
        this.h0.f9760l = listM9303k;
        if (iMo9628e > 0) {
            W2(s0(w2()), i);
            C2362c c2362c = this.h0;
            c2362c.f9756h = iMo9628e;
            c2362c.f9751c = 0;
            c2362c.m9047a();
            h2(c2385v, this.h0, c2389z, false);
        }
        if (iMo9628e2 > 0) {
            U2(s0(v2()), i2);
            C2362c c2362c2 = this.h0;
            c2362c2.f9756h = iMo9628e2;
            c2362c2.f9751c = 0;
            c2362c2.m9047a();
            h2(c2385v, this.h0, c2389z, false);
        }
        this.h0.f9760l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: E */
    public void mo9029E(int i, int i2, RecyclerView.C2389z c2389z, RecyclerView.AbstractC2379p.c cVar) {
        if (this.f9736Z != 0) {
            i = i2;
        }
        if (m9241Z() == 0 || i == 0) {
            return;
        }
        g2();
        T2(i > 0 ? 1 : -1, Math.abs(i), true, c2389z);
        a2(c2389z, this.h0, cVar);
    }

    public void E2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, C2360a c2360a, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: F */
    public void mo9030F(int i, RecyclerView.AbstractC2379p.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.r0;
        if (savedState == null || !savedState.m9037a()) {
            K2();
            z = this.l0;
            i2 = this.o0;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.r0;
            z = savedState2.f9739c;
            i2 = savedState2.f9737a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.u0 && i2 >= 0 && i2 < i; i4++) {
            cVar.mo9256a(i2, 0);
            i2 += i3;
        }
    }

    public final void F2(RecyclerView.C2385v c2385v, C2362c c2362c) {
        if (!c2362c.f9749a || c2362c.f9761m) {
            return;
        }
        int i = c2362c.f9755g;
        int i2 = c2362c.f9757i;
        if (c2362c.f9754f == -1) {
            H2(c2385v, i, i2);
        } else {
            I2(c2385v, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: G */
    public int mo9031G(RecyclerView.C2389z c2389z) {
        return b2(c2389z);
    }

    public final void G2(RecyclerView.C2385v c2385v, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                A1(i, c2385v);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                A1(i3, c2385v);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: H */
    public int mo9010H(RecyclerView.C2389z c2389z) {
        return c2(c2389z);
    }

    public final void H2(RecyclerView.C2385v c2385v, int i, int i2) {
        int iM9241Z = m9241Z();
        if (i < 0) {
            return;
        }
        int iMo9631h = (this.i0.mo9631h() - i) + i2;
        if (this.l0) {
            for (int i3 = 0; i3 < iM9241Z; i3++) {
                View viewM9240Y = m9240Y(i3);
                if (this.i0.mo9630g(viewM9240Y) < iMo9631h || this.i0.mo9641r(viewM9240Y) < iMo9631h) {
                    G2(c2385v, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = iM9241Z - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View viewM9240Y2 = m9240Y(i5);
            if (this.i0.mo9630g(viewM9240Y2) < iMo9631h || this.i0.mo9641r(viewM9240Y2) < iMo9631h) {
                G2(c2385v, i4, i5);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: I */
    public int mo9011I(RecyclerView.C2389z c2389z) {
        return d2(c2389z);
    }

    public final void I2(RecyclerView.C2385v c2385v, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int iM9241Z = m9241Z();
        if (!this.l0) {
            for (int i4 = 0; i4 < iM9241Z; i4++) {
                View viewM9240Y = m9240Y(i4);
                if (this.i0.mo9627d(viewM9240Y) > i3 || this.i0.mo9640q(viewM9240Y) > i3) {
                    G2(c2385v, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = iM9241Z - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View viewM9240Y2 = m9240Y(i6);
            if (this.i0.mo9627d(viewM9240Y2) > i3 || this.i0.mo9640q(viewM9240Y2) > i3) {
                G2(c2385v, i5, i6);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: J */
    public int mo9032J(RecyclerView.C2389z c2389z) {
        return b2(c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int J1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (this.f9736Z == 1) {
            return 0;
        }
        return L2(i, c2385v, c2389z);
    }

    public boolean J2() {
        return this.i0.mo9635l() == 0 && this.i0.mo9631h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: K */
    public int mo9012K(RecyclerView.C2389z c2389z) {
        return c2(c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void K1(int i) {
        this.o0 = i;
        this.p0 = Integer.MIN_VALUE;
        SavedState savedState = this.r0;
        if (savedState != null) {
            savedState.m9038b();
        }
        G1();
    }

    public final void K2() {
        if (this.f9736Z == 1 || !A2()) {
            this.l0 = this.k0;
        } else {
            this.l0 = !this.k0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: L */
    public int mo9013L(RecyclerView.C2389z c2389z) {
        return d2(c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int L1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (this.f9736Z == 0) {
            return 0;
        }
        return L2(i, c2385v, c2389z);
    }

    public int L2(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0 || i == 0) {
            return 0;
        }
        g2();
        this.h0.f9749a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        T2(i2, iAbs, true, c2389z);
        C2362c c2362c = this.h0;
        int iH2 = c2362c.f9755g + h2(c2385v, c2362c, c2389z, false);
        if (iH2 < 0) {
            return 0;
        }
        if (iAbs > iH2) {
            i = i2 * iH2;
        }
        this.i0.mo9642s(-i);
        this.h0.f9759k = i;
        return i;
    }

    public void M2(int i, int i2) {
        this.o0 = i;
        this.p0 = i2;
        SavedState savedState = this.r0;
        if (savedState != null) {
            savedState.m9038b();
        }
        G1();
    }

    public void N2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo9036w(null);
        if (i != this.f9736Z || this.i0 == null) {
            AbstractC2408n abstractC2408nM9625b = AbstractC2408n.m9625b(this, i);
            this.i0 = abstractC2408nM9625b;
            this.s0.f9740a = abstractC2408nM9625b;
            this.f9736Z = i;
            G1();
        }
    }

    public void O2(boolean z) {
        mo9036w(null);
        if (z == this.k0) {
            return;
        }
        this.k0 = z;
        G1();
    }

    public void P2(boolean z) {
        mo9036w(null);
        if (this.m0 == z) {
            return;
        }
        this.m0 = z;
        G1();
    }

    public final boolean Q2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, C2360a c2360a) {
        View viewS2;
        boolean z = false;
        if (m9241Z() == 0) {
            return false;
        }
        View viewL0 = l0();
        if (viewL0 != null && c2360a.m9044d(viewL0, c2389z)) {
            c2360a.m9043c(viewL0, s0(viewL0));
            return true;
        }
        boolean z2 = this.j0;
        boolean z3 = this.m0;
        if (z2 != z3 || (viewS2 = s2(c2385v, c2389z, c2360a.f9743d, z3)) == null) {
            return false;
        }
        c2360a.m9042b(viewS2, s0(viewS2));
        if (!c2389z.m9347e() && Y1()) {
            int iMo9630g = this.i0.mo9630g(viewS2);
            int iMo9627d = this.i0.mo9627d(viewS2);
            int iMo9637n = this.i0.mo9637n();
            int iMo9632i = this.i0.mo9632i();
            boolean z4 = iMo9627d <= iMo9637n && iMo9630g < iMo9637n;
            if (iMo9630g >= iMo9632i && iMo9627d > iMo9632i) {
                z = true;
            }
            if (z4 || z) {
                if (c2360a.f9743d) {
                    iMo9637n = iMo9632i;
                }
                c2360a.f9742c = iMo9637n;
            }
        }
        return true;
    }

    public final boolean R2(RecyclerView.C2389z c2389z, C2360a c2360a) {
        int i;
        if (!c2389z.m9347e() && (i = this.o0) != -1) {
            if (i >= 0 && i < c2389z.m9344b()) {
                c2360a.f9741b = this.o0;
                SavedState savedState = this.r0;
                if (savedState != null && savedState.m9037a()) {
                    boolean z = this.r0.f9739c;
                    c2360a.f9743d = z;
                    if (z) {
                        c2360a.f9742c = this.i0.mo9632i() - this.r0.f9738b;
                    } else {
                        c2360a.f9742c = this.i0.mo9637n() + this.r0.f9738b;
                    }
                    return true;
                }
                if (this.p0 != Integer.MIN_VALUE) {
                    boolean z2 = this.l0;
                    c2360a.f9743d = z2;
                    if (z2) {
                        c2360a.f9742c = this.i0.mo9632i() - this.p0;
                    } else {
                        c2360a.f9742c = this.i0.mo9637n() + this.p0;
                    }
                    return true;
                }
                View viewMo9033S = mo9033S(this.o0);
                if (viewMo9033S == null) {
                    if (m9241Z() > 0) {
                        c2360a.f9743d = (this.o0 < s0(m9240Y(0))) == this.l0;
                    }
                    c2360a.m9041a();
                } else {
                    if (this.i0.mo9628e(viewMo9033S) > this.i0.mo9638o()) {
                        c2360a.m9041a();
                        return true;
                    }
                    if (this.i0.mo9630g(viewMo9033S) - this.i0.mo9637n() < 0) {
                        c2360a.f9742c = this.i0.mo9637n();
                        c2360a.f9743d = false;
                        return true;
                    }
                    if (this.i0.mo9632i() - this.i0.mo9627d(viewMo9033S) < 0) {
                        c2360a.f9742c = this.i0.mo9632i();
                        c2360a.f9743d = true;
                        return true;
                    }
                    c2360a.f9742c = c2360a.f9743d ? this.i0.mo9627d(viewMo9033S) + this.i0.m9639p() : this.i0.mo9630g(viewMo9033S);
                }
                return true;
            }
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: S */
    public View mo9033S(int i) {
        int iM9241Z = m9241Z();
        if (iM9241Z == 0) {
            return null;
        }
        int iS0 = i - s0(m9240Y(0));
        if (iS0 >= 0 && iS0 < iM9241Z) {
            View viewM9240Y = m9240Y(iS0);
            if (s0(viewM9240Y) == i) {
                return viewM9240Y;
            }
        }
        return super.mo9033S(i);
    }

    public final void S2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, C2360a c2360a) {
        if (R2(c2389z, c2360a) || Q2(c2385v, c2389z, c2360a)) {
            return;
        }
        c2360a.m9041a();
        c2360a.f9741b = this.m0 ? c2389z.m9344b() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: T */
    public RecyclerView.LayoutParams mo9014T() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public boolean T1() {
        return (n0() == 1073741824 || A0() == 1073741824 || !B0()) ? false : true;
    }

    public final void T2(int i, int i2, boolean z, RecyclerView.C2389z c2389z) {
        int iMo9637n;
        this.h0.f9761m = J2();
        this.h0.f9754f = i;
        int[] iArr = this.v0;
        iArr[0] = 0;
        iArr[1] = 0;
        Z1(c2389z, iArr);
        int iMax = Math.max(0, this.v0[0]);
        int iMax2 = Math.max(0, this.v0[1]);
        boolean z2 = i == 1;
        C2362c c2362c = this.h0;
        int i3 = z2 ? iMax2 : iMax;
        c2362c.f9756h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c2362c.f9757i = iMax;
        if (z2) {
            c2362c.f9756h = i3 + this.i0.mo9633j();
            View viewV2 = v2();
            C2362c c2362c2 = this.h0;
            c2362c2.f9753e = this.l0 ? -1 : 1;
            int iS0 = s0(viewV2);
            C2362c c2362c3 = this.h0;
            c2362c2.f9752d = iS0 + c2362c3.f9753e;
            c2362c3.f9750b = this.i0.mo9627d(viewV2);
            iMo9637n = this.i0.mo9627d(viewV2) - this.i0.mo9632i();
        } else {
            View viewW2 = w2();
            this.h0.f9756h += this.i0.mo9637n();
            C2362c c2362c4 = this.h0;
            c2362c4.f9753e = this.l0 ? 1 : -1;
            int iS02 = s0(viewW2);
            C2362c c2362c5 = this.h0;
            c2362c4.f9752d = iS02 + c2362c5.f9753e;
            c2362c5.f9750b = this.i0.mo9630g(viewW2);
            iMo9637n = (-this.i0.mo9630g(viewW2)) + this.i0.mo9637n();
        }
        C2362c c2362c6 = this.h0;
        c2362c6.f9751c = i2;
        if (z) {
            c2362c6.f9751c = i2 - iMo9637n;
        }
        c2362c6.f9755g = iMo9637n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void U0(RecyclerView recyclerView, RecyclerView.C2385v c2385v) {
        super.U0(recyclerView, c2385v);
        if (this.q0) {
            x1(c2385v);
            c2385v.m9295c();
        }
    }

    public final void U2(int i, int i2) {
        this.h0.f9751c = this.i0.mo9632i() - i2;
        C2362c c2362c = this.h0;
        c2362c.f9753e = this.l0 ? -1 : 1;
        c2362c.f9752d = i;
        c2362c.f9754f = 1;
        c2362c.f9750b = i2;
        c2362c.f9755g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public View V0(View view, int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        int iE2;
        K2();
        if (m9241Z() == 0 || (iE2 = e2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        g2();
        T2(iE2, (int) (this.i0.mo9638o() * 0.33333334f), false, c2389z);
        C2362c c2362c = this.h0;
        c2362c.f9755g = Integer.MIN_VALUE;
        c2362c.f9749a = false;
        h2(c2385v, c2362c, c2389z, true);
        View viewR2 = iE2 == -1 ? r2() : q2();
        View viewW2 = iE2 == -1 ? w2() : v2();
        if (!viewW2.hasFocusable()) {
            return viewR2;
        }
        if (viewR2 == null) {
            return null;
        }
        return viewW2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void V1(RecyclerView recyclerView, RecyclerView.C2389z c2389z, int i) {
        C2406l c2406l = new C2406l(recyclerView.getContext());
        c2406l.m9335p(i);
        W1(c2406l);
    }

    public final void V2(C2360a c2360a) {
        U2(c2360a.f9741b, c2360a.f9742c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void W0(AccessibilityEvent accessibilityEvent) {
        super.W0(accessibilityEvent);
        if (m9241Z() > 0) {
            accessibilityEvent.setFromIndex(l2());
            accessibilityEvent.setToIndex(n2());
        }
    }

    public final void W2(int i, int i2) {
        this.h0.f9751c = i2 - this.i0.mo9637n();
        C2362c c2362c = this.h0;
        c2362c.f9752d = i;
        c2362c.f9753e = this.l0 ? 1 : -1;
        c2362c.f9754f = -1;
        c2362c.f9750b = i2;
        c2362c.f9755g = Integer.MIN_VALUE;
    }

    public final void X2(C2360a c2360a) {
        W2(c2360a.f9741b, c2360a.f9742c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public boolean Y1() {
        return this.r0 == null && this.j0 == this.m0;
    }

    public void Z1(RecyclerView.C2389z c2389z, int[] iArr) {
        int i;
        int iX2 = x2(c2389z);
        if (this.h0.f9754f == -1) {
            i = 0;
        } else {
            i = iX2;
            iX2 = 0;
        }
        iArr[0] = iX2;
        iArr[1] = i;
    }

    public void a2(RecyclerView.C2389z c2389z, C2362c c2362c, RecyclerView.AbstractC2379p.c cVar) {
        int i = c2362c.f9752d;
        if (i < 0 || i >= c2389z.m9344b()) {
            return;
        }
        cVar.mo9256a(i, Math.max(0, c2362c.f9755g));
    }

    public final int b2(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0) {
            return 0;
        }
        g2();
        return AbstractC2411q.m9662a(c2389z, this.i0, k2(!this.n0, true), j2(!this.n0, true), this, this.n0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2388y.b
    /* renamed from: c */
    public PointF mo9034c(int i) {
        if (m9241Z() == 0) {
            return null;
        }
        int i2 = (i < s0(m9240Y(0))) != this.l0 ? -1 : 1;
        return this.f9736Z == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final int c2(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0) {
            return 0;
        }
        g2();
        return AbstractC2411q.m9663b(c2389z, this.i0, k2(!this.n0, true), j2(!this.n0, true), this, this.n0, this.l0);
    }

    public final int d2(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0) {
            return 0;
        }
        g2();
        return AbstractC2411q.m9664c(c2389z, this.i0, k2(!this.n0, true), j2(!this.n0, true), this, this.n0);
    }

    public int e2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f9736Z == 1) ? 1 : Integer.MIN_VALUE : this.f9736Z == 0 ? 1 : Integer.MIN_VALUE : this.f9736Z == 1 ? -1 : Integer.MIN_VALUE : this.f9736Z == 0 ? -1 : Integer.MIN_VALUE : (this.f9736Z != 1 && A2()) ? -1 : 1 : (this.f9736Z != 1 && A2()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.C2404j.i
    /* renamed from: f */
    public void mo9035f(View view, View view2, int i, int i2) {
        mo9036w("Cannot drop a view during a scroll or layout calculation");
        g2();
        K2();
        int iS0 = s0(view);
        int iS02 = s0(view2);
        char c = iS0 < iS02 ? (char) 1 : (char) 65535;
        if (this.l0) {
            if (c == 1) {
                M2(iS02, this.i0.mo9632i() - (this.i0.mo9630g(view2) + this.i0.mo9628e(view)));
                return;
            } else {
                M2(iS02, this.i0.mo9632i() - this.i0.mo9627d(view2));
                return;
            }
        }
        if (c == 65535) {
            M2(iS02, this.i0.mo9630g(view2));
        } else {
            M2(iS02, this.i0.mo9627d(view2) - this.i0.mo9628e(view));
        }
    }

    public C2362c f2() {
        return new C2362c();
    }

    public void g2() {
        if (this.h0 == null) {
            this.h0 = f2();
        }
    }

    public int h2(RecyclerView.C2385v c2385v, C2362c c2362c, RecyclerView.C2389z c2389z, boolean z) {
        int i = c2362c.f9751c;
        int i2 = c2362c.f9755g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c2362c.f9755g = i2 + i;
            }
            F2(c2385v, c2362c);
        }
        int i3 = c2362c.f9751c + c2362c.f9756h;
        C2361b c2361b = this.t0;
        while (true) {
            if ((!c2362c.f9761m && i3 <= 0) || !c2362c.m9049c(c2389z)) {
                break;
            }
            c2361b.m9046a();
            C2(c2385v, c2389z, c2362c, c2361b);
            if (!c2361b.f9746b) {
                c2362c.f9750b += c2361b.f9745a * c2362c.f9754f;
                if (!c2361b.f9747c || c2362c.f9760l != null || !c2389z.m9347e()) {
                    int i4 = c2362c.f9751c;
                    int i5 = c2361b.f9745a;
                    c2362c.f9751c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c2362c.f9755g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c2361b.f9745a;
                    c2362c.f9755g = i7;
                    int i8 = c2362c.f9751c;
                    if (i8 < 0) {
                        c2362c.f9755g = i7 + i8;
                    }
                    F2(c2385v, c2362c);
                }
                if (z && c2361b.f9748d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c2362c.f9751c;
    }

    public final View i2() {
        return o2(0, m9241Z());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void j1(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        int i;
        int i2;
        int i3;
        int i4;
        int iT2;
        int i5;
        View viewMo9033S;
        int iMo9630g;
        int iMo9632i;
        int i6 = -1;
        if (!(this.r0 == null && this.o0 == -1) && c2389z.m9344b() == 0) {
            x1(c2385v);
            return;
        }
        SavedState savedState = this.r0;
        if (savedState != null && savedState.m9037a()) {
            this.o0 = this.r0.f9737a;
        }
        g2();
        this.h0.f9749a = false;
        K2();
        View viewL0 = l0();
        C2360a c2360a = this.s0;
        if (!c2360a.f9744e || this.o0 != -1 || this.r0 != null) {
            c2360a.m9045e();
            C2360a c2360a2 = this.s0;
            c2360a2.f9743d = this.l0 ^ this.m0;
            S2(c2385v, c2389z, c2360a2);
            this.s0.f9744e = true;
        } else if (viewL0 != null && (this.i0.mo9630g(viewL0) >= this.i0.mo9632i() || this.i0.mo9627d(viewL0) <= this.i0.mo9637n())) {
            this.s0.m9043c(viewL0, s0(viewL0));
        }
        C2362c c2362c = this.h0;
        c2362c.f9754f = c2362c.f9759k >= 0 ? 1 : -1;
        int[] iArr = this.v0;
        iArr[0] = 0;
        iArr[1] = 0;
        Z1(c2389z, iArr);
        int iMax = Math.max(0, this.v0[0]) + this.i0.mo9637n();
        int iMax2 = Math.max(0, this.v0[1]) + this.i0.mo9633j();
        if (c2389z.m9347e() && (i5 = this.o0) != -1 && this.p0 != Integer.MIN_VALUE && (viewMo9033S = mo9033S(i5)) != null) {
            if (this.l0) {
                iMo9632i = this.i0.mo9632i() - this.i0.mo9627d(viewMo9033S);
                iMo9630g = this.p0;
            } else {
                iMo9630g = this.i0.mo9630g(viewMo9033S) - this.i0.mo9637n();
                iMo9632i = this.p0;
            }
            int i7 = iMo9632i - iMo9630g;
            if (i7 > 0) {
                iMax += i7;
            } else {
                iMax2 -= i7;
            }
        }
        C2360a c2360a3 = this.s0;
        if (!c2360a3.f9743d ? !this.l0 : this.l0) {
            i6 = 1;
        }
        E2(c2385v, c2389z, c2360a3, i6);
        m9232M(c2385v);
        this.h0.f9761m = J2();
        this.h0.f9758j = c2389z.m9347e();
        this.h0.f9757i = 0;
        C2360a c2360a4 = this.s0;
        if (c2360a4.f9743d) {
            X2(c2360a4);
            C2362c c2362c2 = this.h0;
            c2362c2.f9756h = iMax;
            h2(c2385v, c2362c2, c2389z, false);
            C2362c c2362c3 = this.h0;
            i2 = c2362c3.f9750b;
            int i8 = c2362c3.f9752d;
            int i9 = c2362c3.f9751c;
            if (i9 > 0) {
                iMax2 += i9;
            }
            V2(this.s0);
            C2362c c2362c4 = this.h0;
            c2362c4.f9756h = iMax2;
            c2362c4.f9752d += c2362c4.f9753e;
            h2(c2385v, c2362c4, c2389z, false);
            C2362c c2362c5 = this.h0;
            i = c2362c5.f9750b;
            int i10 = c2362c5.f9751c;
            if (i10 > 0) {
                W2(i8, i2);
                C2362c c2362c6 = this.h0;
                c2362c6.f9756h = i10;
                h2(c2385v, c2362c6, c2389z, false);
                i2 = this.h0.f9750b;
            }
        } else {
            V2(c2360a4);
            C2362c c2362c7 = this.h0;
            c2362c7.f9756h = iMax2;
            h2(c2385v, c2362c7, c2389z, false);
            C2362c c2362c8 = this.h0;
            i = c2362c8.f9750b;
            int i11 = c2362c8.f9752d;
            int i12 = c2362c8.f9751c;
            if (i12 > 0) {
                iMax += i12;
            }
            X2(this.s0);
            C2362c c2362c9 = this.h0;
            c2362c9.f9756h = iMax;
            c2362c9.f9752d += c2362c9.f9753e;
            h2(c2385v, c2362c9, c2389z, false);
            C2362c c2362c10 = this.h0;
            i2 = c2362c10.f9750b;
            int i13 = c2362c10.f9751c;
            if (i13 > 0) {
                U2(i11, i);
                C2362c c2362c11 = this.h0;
                c2362c11.f9756h = i13;
                h2(c2385v, c2362c11, c2389z, false);
                i = this.h0.f9750b;
            }
        }
        if (m9241Z() > 0) {
            if (this.l0 ^ this.m0) {
                int iT22 = t2(i, c2385v, c2389z, true);
                i3 = i2 + iT22;
                i4 = i + iT22;
                iT2 = u2(i3, c2385v, c2389z, false);
            } else {
                int iU2 = u2(i2, c2385v, c2389z, true);
                i3 = i2 + iU2;
                i4 = i + iU2;
                iT2 = t2(i4, c2385v, c2389z, false);
            }
            i2 = i3 + iT2;
            i = i4 + iT2;
        }
        D2(c2385v, c2389z, i2, i);
        if (c2389z.m9347e()) {
            this.s0.m9045e();
        } else {
            this.i0.m9643t();
        }
        this.j0 = this.m0;
    }

    public View j2(boolean z, boolean z2) {
        return this.l0 ? p2(0, m9241Z(), z, z2) : p2(m9241Z() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void k1(RecyclerView.C2389z c2389z) {
        super.k1(c2389z);
        this.r0 = null;
        this.o0 = -1;
        this.p0 = Integer.MIN_VALUE;
        this.s0.m9045e();
    }

    public View k2(boolean z, boolean z2) {
        return this.l0 ? p2(m9241Z() - 1, -1, z, z2) : p2(0, m9241Z(), z, z2);
    }

    public int l2() {
        View viewP2 = p2(0, m9241Z(), false, true);
        if (viewP2 == null) {
            return -1;
        }
        return s0(viewP2);
    }

    public final View m2() {
        return o2(m9241Z() - 1, -1);
    }

    public int n2() {
        View viewP2 = p2(m9241Z() - 1, -1, false, true);
        if (viewP2 == null) {
            return -1;
        }
        return s0(viewP2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void o1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.r0 = savedState;
            if (this.o0 != -1) {
                savedState.m9038b();
            }
            G1();
        }
    }

    public View o2(int i, int i2) {
        int i3;
        int i4;
        g2();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m9240Y(i);
        }
        if (this.i0.mo9630g(m9240Y(i)) < this.i0.mo9637n()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f9736Z == 0 ? this.f9837e.m9686a(i, i2, i3, i4) : this.f9838f.m9686a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public Parcelable p1() {
        if (this.r0 != null) {
            return new SavedState(this.r0);
        }
        SavedState savedState = new SavedState();
        if (m9241Z() > 0) {
            g2();
            boolean z = this.j0 ^ this.l0;
            savedState.f9739c = z;
            if (z) {
                View viewV2 = v2();
                savedState.f9738b = this.i0.mo9632i() - this.i0.mo9627d(viewV2);
                savedState.f9737a = s0(viewV2);
            } else {
                View viewW2 = w2();
                savedState.f9737a = s0(viewW2);
                savedState.f9738b = this.i0.mo9630g(viewW2) - this.i0.mo9637n();
            }
        } else {
            savedState.m9038b();
        }
        return savedState;
    }

    public View p2(int i, int i2, boolean z, boolean z2) {
        g2();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.f9736Z == 0 ? this.f9837e.m9686a(i, i2, i3, i4) : this.f9838f.m9686a(i, i2, i3, i4);
    }

    public final View q2() {
        return this.l0 ? i2() : m2();
    }

    public final View r2() {
        return this.l0 ? m2() : i2();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View s2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, boolean z, boolean z2) {
        int i;
        int iM9241Z;
        int i2;
        g2();
        int iM9241Z2 = m9241Z();
        if (z2) {
            iM9241Z = m9241Z() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM9241Z2;
            iM9241Z = 0;
            i2 = 1;
        }
        int iM9344b = c2389z.m9344b();
        int iMo9637n = this.i0.mo9637n();
        int iMo9632i = this.i0.mo9632i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM9241Z != i) {
            View viewM9240Y = m9240Y(iM9241Z);
            int iS0 = s0(viewM9240Y);
            int iMo9630g = this.i0.mo9630g(viewM9240Y);
            int iMo9627d = this.i0.mo9627d(viewM9240Y);
            if (iS0 >= 0 && iS0 < iM9344b) {
                if (!((RecyclerView.LayoutParams) viewM9240Y.getLayoutParams()).m9106c()) {
                    boolean z3 = iMo9627d <= iMo9637n && iMo9630g < iMo9637n;
                    boolean z4 = iMo9630g >= iMo9632i && iMo9627d > iMo9632i;
                    if (!z3 && !z4) {
                        return viewM9240Y;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM9240Y;
                        } else if (view == null) {
                            view = viewM9240Y;
                        }
                    } else if (!z3) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewM9240Y;
                }
            }
            iM9241Z += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int t2(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, boolean z) {
        int iMo9632i;
        int iMo9632i2 = this.i0.mo9632i() - i;
        if (iMo9632i2 <= 0) {
            return 0;
        }
        int i2 = -L2(-iMo9632i2, c2385v, c2389z);
        int i3 = i + i2;
        if (!z || (iMo9632i = this.i0.mo9632i() - i3) <= 0) {
            return i2;
        }
        this.i0.mo9642s(iMo9632i);
        return iMo9632i + i2;
    }

    public final int u2(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, boolean z) {
        int iMo9637n;
        int iMo9637n2 = i - this.i0.mo9637n();
        if (iMo9637n2 <= 0) {
            return 0;
        }
        int i2 = -L2(iMo9637n2, c2385v, c2389z);
        int i3 = i + i2;
        if (!z || (iMo9637n = i3 - this.i0.mo9637n()) <= 0) {
            return i2;
        }
        this.i0.mo9642s(-iMo9637n);
        return i2 - iMo9637n;
    }

    public final View v2() {
        return m9240Y(this.l0 ? 0 : m9241Z() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: w */
    public void mo9036w(String str) {
        if (this.r0 == null) {
            super.mo9036w(str);
        }
    }

    public final View w2() {
        return m9240Y(this.l0 ? m9241Z() - 1 : 0);
    }

    public int x2(RecyclerView.C2389z c2389z) {
        if (c2389z.m9346d()) {
            return this.i0.mo9638o();
        }
        return 0;
    }

    public int y2() {
        return this.f9736Z;
    }

    public boolean z2() {
        return this.k0;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f9736Z = 1;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = true;
        this.o0 = -1;
        this.p0 = Integer.MIN_VALUE;
        this.r0 = null;
        this.s0 = new C2360a();
        this.t0 = new C2361b();
        this.u0 = 2;
        this.v0 = new int[2];
        N2(i);
        O2(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f9736Z = 1;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = true;
        this.o0 = -1;
        this.p0 = Integer.MIN_VALUE;
        this.r0 = null;
        this.s0 = new C2360a();
        this.t0 = new C2361b();
        this.u0 = 2;
        this.v0 = new int[2];
        RecyclerView.AbstractC2379p.d dVarT0 = RecyclerView.AbstractC2379p.t0(context, attributeSet, i, i2);
        N2(dVarT0.f9847a);
        O2(dVarT0.f9849c);
        P2(dVarT0.f9850d);
    }
}
