package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C2406l;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.material.carousel.AbstractC10987a;
import com.google.android.material.carousel.C10989c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p001o.ebe;
import p001o.fgd;
import p001o.gh0;
import p001o.ke2;
import p001o.ne2;
import p001o.ni3;
import p001o.pza;
import p001o.rnb;
import p001o.vae;
import p001o.x6e;
import p001o.ysa;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.AbstractC2379p implements ke2, RecyclerView.AbstractC2388y.b {

    /* renamed from: Z */
    public int f12266Z;
    public int h0;
    public int i0;
    public boolean j0;
    public final C10985c k0;
    public AbstractC10987a l0;
    public C10990d m0;
    public C10989c n0;
    public int o0;
    public Map p0;
    public ne2 q0;
    public final View.OnLayoutChangeListener r0;
    public int s0;
    public int t0;
    public int u0;

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    public class C10983a extends C2406l {
        public C10983a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2388y
        /* renamed from: a */
        public PointF mo9320a(int i) {
            return CarouselLayoutManager.this.mo9034c(i);
        }

        @Override // androidx.recyclerview.widget.C2406l
        /* renamed from: t */
        public int mo9611t(View view, int i) {
            if (CarouselLayoutManager.this.m0 == null || !CarouselLayoutManager.this.mo14277k()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.p2(carouselLayoutManager.s0(view));
        }

        @Override // androidx.recyclerview.widget.C2406l
        /* renamed from: u */
        public int mo9612u(View view, int i) {
            if (CarouselLayoutManager.this.m0 == null || CarouselLayoutManager.this.mo14277k()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.p2(carouselLayoutManager.s0(view));
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    public static final class C10984b {

        /* renamed from: a */
        public final View f12268a;

        /* renamed from: b */
        public final float f12269b;

        /* renamed from: c */
        public final float f12270c;

        /* renamed from: d */
        public final C10986d f12271d;

        public C10984b(View view, float f, float f2, C10986d c10986d) {
            this.f12268a = view;
            this.f12269b = f;
            this.f12270c = f2;
            this.f12271d = c10986d;
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    public static class C10985c extends RecyclerView.AbstractC2378o {

        /* renamed from: a */
        public final Paint f12272a;

        /* renamed from: b */
        public List f12273b;

        public C10985c() {
            Paint paint = new Paint();
            this.f12272a = paint;
            this.f12273b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2378o
        /* renamed from: k */
        public void mo9230k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2389z c2389z) {
            super.mo9230k(canvas, recyclerView, c2389z);
            this.f12272a.setStrokeWidth(recyclerView.getResources().getDimension(x6e.m3_carousel_debug_keyline_width));
            for (C10989c.c cVar : this.f12273b) {
                this.f12272a.setColor(ni3.m40612d(-65281, -16776961, cVar.f12303c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).mo14277k()) {
                    canvas.drawLine(cVar.f12302b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).J2(), cVar.f12302b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).F2(), this.f12272a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).G2(), cVar.f12302b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).H2(), cVar.f12302b, this.f12272a);
                }
            }
        }

        /* renamed from: l */
        public void m14278l(List list) {
            this.f12273b = Collections.unmodifiableList(list);
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$d */
    public static class C10986d {

        /* renamed from: a */
        public final C10989c.c f12274a;

        /* renamed from: b */
        public final C10989c.c f12275b;

        public C10986d(C10989c.c cVar, C10989c.c cVar2) {
            fgd.m26657a(cVar.f12301a <= cVar2.f12301a);
            this.f12274a = cVar;
            this.f12275b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new rnb());
    }

    public static C10986d N2(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            C10989c.c cVar = (C10989c.c) list.get(i5);
            float f6 = z ? cVar.f12302b : cVar.f12301a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new C10986d((C10989c.c) list.get(i), (C10989c.c) list.get(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R2(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        view.post(new Runnable() { // from class: o.me2
            @Override // java.lang.Runnable
            public final void run() {
                this.f35258a.W2();
            }
        });
    }

    public static int q2(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: A */
    public boolean mo9027A() {
        return mo14277k();
    }

    public final C10989c A2(int i) {
        C10989c c10989c;
        Map map = this.p0;
        return (map == null || (c10989c = (C10989c) map.get(Integer.valueOf(pza.m44556b(i, 0, Math.max(0, m9242j() + (-1)))))) == null) ? this.m0.m14348g() : c10989c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: B */
    public boolean mo9028B() {
        return !mo14277k();
    }

    public final int B2() {
        if (c0()) {
            return 0;
        }
        return E2() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    public final float C2(float f, C10986d c10986d) {
        C10989c.c cVar = c10986d.f12274a;
        float f2 = cVar.f12304d;
        C10989c.c cVar2 = c10986d.f12275b;
        return gh0.m28648b(f2, cVar2.f12304d, cVar.f12302b, cVar2.f12302b, f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public boolean D0() {
        return true;
    }

    public int D2(int i, C10989c c10989c) {
        return L2(i, c10989c) - this.f12266Z;
    }

    public int E2() {
        return this.q0.f36739a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public boolean F1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iM2;
        if (this.m0 == null || (iM2 = M2(s0(view), A2(s0(view)))) == 0) {
            return false;
        }
        Z2(recyclerView, M2(s0(view), this.m0.m14351j(this.f12266Z + q2(iM2, this.f12266Z, this.h0, this.i0), this.h0, this.i0)));
        return true;
    }

    public final int F2() {
        return this.q0.mo40402f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: G */
    public int mo9031G(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0 || this.m0 == null || m9242j() <= 1) {
            return 0;
        }
        return (int) (z0() * (this.m0.m14348g().m14311g() / mo9011I(c2389z)));
    }

    public final int G2() {
        return this.q0.mo40403g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: H */
    public int mo9010H(RecyclerView.C2389z c2389z) {
        return this.f12266Z;
    }

    public final int H2() {
        return this.q0.mo40404h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: I */
    public int mo9011I(RecyclerView.C2389z c2389z) {
        return this.i0 - this.h0;
    }

    public final int I2() {
        return this.q0.mo40405i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: J */
    public int mo9032J(RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0 || this.m0 == null || m9242j() <= 1) {
            return 0;
        }
        return (int) (m0() * (this.m0.m14348g().m14311g() / mo9013L(c2389z)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int J1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (mo9027A()) {
            return Y2(i, c2385v, c2389z);
        }
        return 0;
    }

    public final int J2() {
        return this.q0.mo40406j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: K */
    public int mo9012K(RecyclerView.C2389z c2389z) {
        return this.f12266Z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void K1(int i) {
        this.t0 = i;
        if (this.m0 == null) {
            return;
        }
        this.f12266Z = L2(i, A2(i));
        this.o0 = pza.m44556b(i, 0, Math.max(0, m9242j() - 1));
        f3(this.m0);
        G1();
    }

    public final int K2() {
        if (c0()) {
            return 0;
        }
        return E2() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: L */
    public int mo9013L(RecyclerView.C2389z c2389z) {
        return this.i0 - this.h0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int L1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (mo9028B()) {
            return Y2(i, c2385v, c2389z);
        }
        return 0;
    }

    public final int L2(int i, C10989c c10989c) {
        return O2() ? (int) (((w2() - c10989c.m14313i().f12301a) - (i * c10989c.m14311g())) - (c10989c.m14311g() / 2.0f)) : (int) (((i * c10989c.m14311g()) - c10989c.m14306b().f12301a) + (c10989c.m14311g() / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void M0(View view, int i, int i2) {
        if (!(view instanceof ysa)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        m9250z(view, rect);
        int i3 = i + rect.left + rect.right;
        int i4 = i2 + rect.top + rect.bottom;
        C10990d c10990d = this.m0;
        float fM14311g = (c10990d == null || this.q0.f36739a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : c10990d.m14348g().m14311g();
        C10990d c10990d2 = this.m0;
        view.measure(RecyclerView.AbstractC2379p.a0(z0(), A0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, (int) fM14311g, mo9027A()), RecyclerView.AbstractC2379p.a0(m0(), n0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, (int) ((c10990d2 == null || this.q0.f36739a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : c10990d2.m14348g().m14311g()), mo9028B()));
    }

    public final int M2(int i, C10989c c10989c) {
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (C10989c.c cVar : c10989c.m14310f()) {
            float fM14311g = (i * c10989c.m14311g()) + (c10989c.m14311g() / 2.0f);
            int iW2 = (O2() ? (int) ((w2() - cVar.f12301a) - fM14311g) : (int) (fM14311g - cVar.f12301a)) - this.f12266Z;
            if (Math.abs(i2) > Math.abs(iW2)) {
                i2 = iW2;
            }
        }
        return i2;
    }

    public boolean O2() {
        return mo14277k() && o0() == 1;
    }

    public final boolean P2(float f, C10986d c10986d) {
        float fI2 = i2(f, C2(f, c10986d) / 2.0f);
        if (O2()) {
            if (fI2 < 0.0f) {
                return true;
            }
        } else if (fI2 > w2()) {
            return true;
        }
        return false;
    }

    public final boolean Q2(float f, C10986d c10986d) {
        float fH2 = h2(f, C2(f, c10986d) / 2.0f);
        if (O2()) {
            if (fH2 > w2()) {
                return true;
            }
        } else if (fH2 < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void S0(RecyclerView recyclerView) {
        super.S0(recyclerView);
        this.l0.m14290f(recyclerView.getContext());
        W2();
        recyclerView.addOnLayoutChangeListener(this.r0);
    }

    public final void S2() {
        if (this.j0 && Log.isLoggable("CarouselLayoutManager", 3)) {
            for (int i = 0; i < m9241Z(); i++) {
                View viewM9240Y = m9240Y(i);
                float fX2 = x2(viewM9240Y);
                StringBuilder sb = new StringBuilder();
                sb.append("item position ");
                sb.append(s0(viewM9240Y));
                sb.append(", center:");
                sb.append(fX2);
                sb.append(", child index:");
                sb.append(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: T */
    public RecyclerView.LayoutParams mo9014T() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final C10984b T2(RecyclerView.C2385v c2385v, float f, int i) {
        View viewM9307o = c2385v.m9307o(i);
        M0(viewM9307o, 0, 0);
        float fH2 = h2(f, this.n0.m14311g() / 2.0f);
        C10986d c10986dN2 = N2(this.n0.m14312h(), fH2, false);
        return new C10984b(viewM9307o, fH2, m2(fH2, c10986dN2), c10986dN2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void U0(RecyclerView recyclerView, RecyclerView.C2385v c2385v) {
        super.U0(recyclerView, c2385v);
        recyclerView.removeOnLayoutChangeListener(this.r0);
    }

    public final float U2(View view, float f, float f2, Rect rect) {
        float fH2 = h2(f, f2);
        C10986d c10986dN2 = N2(this.n0.m14312h(), fH2, false);
        float fM2 = m2(fH2, c10986dN2);
        super.f0(view, rect);
        e3(view, fH2, c10986dN2);
        this.q0.mo40409m(view, rect, f2, fM2);
        return fM2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public View V0(View view, int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        int iS2;
        if (m9241Z() == 0 || (iS2 = s2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iS2 == -1) {
            if (s0(view) == 0) {
                return null;
            }
            j2(c2385v, s0(m9240Y(0)) - 1, 0);
            return v2();
        }
        if (s0(view) == m9242j() - 1) {
            return null;
        }
        j2(c2385v, s0(m9240Y(m9241Z() - 1)) + 1, -1);
        return u2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void V1(RecyclerView recyclerView, RecyclerView.C2389z c2389z, int i) {
        C10983a c10983a = new C10983a(recyclerView.getContext());
        c10983a.m9335p(i);
        W1(c10983a);
    }

    public final void V2(RecyclerView.C2385v c2385v) {
        View viewM9307o = c2385v.m9307o(0);
        M0(viewM9307o, 0, 0);
        C10989c c10989cMo14291g = this.l0.mo14291g(this, viewM9307o);
        if (O2()) {
            c10989cMo14291g = C10989c.m14304p(c10989cMo14291g, w2());
        }
        this.m0 = C10990d.m14334f(this, c10989cMo14291g, y2(), B2(), K2(), this.l0.m14289e());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void W0(AccessibilityEvent accessibilityEvent) {
        super.W0(accessibilityEvent);
        if (m9241Z() > 0) {
            accessibilityEvent.setFromIndex(s0(m9240Y(0)));
            accessibilityEvent.setToIndex(s0(m9240Y(m9241Z() - 1)));
        }
    }

    public final void W2() {
        this.m0 = null;
        G1();
    }

    public final void X2(RecyclerView.C2385v c2385v) {
        while (m9241Z() > 0) {
            View viewM9240Y = m9240Y(0);
            float fX2 = x2(viewM9240Y);
            if (!Q2(fX2, N2(this.n0.m14312h(), fX2, true))) {
                break;
            } else {
                z1(viewM9240Y, c2385v);
            }
        }
        while (m9241Z() - 1 >= 0) {
            View viewM9240Y2 = m9240Y(m9241Z() - 1);
            float fX22 = x2(viewM9240Y2);
            if (!P2(fX22, N2(this.n0.m14312h(), fX22, true))) {
                return;
            } else {
                z1(viewM9240Y2, c2385v);
            }
        }
    }

    public final int Y2(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (m9241Z() == 0 || i == 0) {
            return 0;
        }
        if (this.m0 == null) {
            V2(c2385v);
        }
        if (m9242j() <= z2(this.m0).m14318n()) {
            return 0;
        }
        int iQ2 = q2(i, this.f12266Z, this.h0, this.i0);
        this.f12266Z += iQ2;
        f3(this.m0);
        float fM14311g = this.n0.m14311g() / 2.0f;
        float fN2 = n2(s0(m9240Y(0)));
        Rect rect = new Rect();
        float f = O2() ? this.n0.m14313i().f12302b : this.n0.m14306b().f12302b;
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < m9241Z(); i2++) {
            View viewM9240Y = m9240Y(i2);
            float fAbs = Math.abs(f - U2(viewM9240Y, fN2, fM14311g, rect));
            if (viewM9240Y != null && fAbs < f2) {
                this.t0 = s0(viewM9240Y);
                f2 = fAbs;
            }
            fN2 = h2(fN2, this.n0.m14311g());
        }
        t2(c2385v, c2389z);
        return iQ2;
    }

    public final void Z2(RecyclerView recyclerView, int i) {
        if (mo14277k()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    @Override // p001o.ke2
    /* renamed from: a */
    public int mo14274a() {
        return z0();
    }

    public void a3(int i) {
        this.u0 = i;
        W2();
    }

    @Override // p001o.ke2
    /* renamed from: b */
    public int mo14275b() {
        return m0();
    }

    public final void b3(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.Carousel);
            a3(typedArrayObtainStyledAttributes.getInt(ebe.Carousel_carousel_alignment, 0));
            d3(typedArrayObtainStyledAttributes.getInt(vae.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2388y.b
    /* renamed from: c */
    public PointF mo9034c(int i) {
        if (this.m0 == null) {
            return null;
        }
        int iD2 = D2(i, A2(i));
        return mo14277k() ? new PointF(iD2, 0.0f) : new PointF(0.0f, iD2);
    }

    public void c3(AbstractC10987a abstractC10987a) {
        this.l0 = abstractC10987a;
        W2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void d1(RecyclerView recyclerView, int i, int i2) {
        super.d1(recyclerView, i, i2);
        g3();
    }

    public void d3(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo9036w(null);
        ne2 ne2Var = this.q0;
        if (ne2Var == null || i != ne2Var.f36739a) {
            this.q0 = ne2.m40398c(this, i);
            W2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void e1(RecyclerView recyclerView) {
        super.e1(recyclerView);
        g3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e3(View view, float f, C10986d c10986d) {
        if (view instanceof ysa) {
            C10989c.c cVar = c10986d.f12274a;
            float f2 = cVar.f12303c;
            C10989c.c cVar2 = c10986d.f12275b;
            float fM28648b = gh0.m28648b(f2, cVar2.f12303c, cVar.f12301a, cVar2.f12301a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFMo40401e = this.q0.mo40401e(height, width, gh0.m28648b(0.0f, height / 2.0f, 0.0f, 1.0f, fM28648b), gh0.m28648b(0.0f, width / 2.0f, 0.0f, 1.0f, fM28648b));
            float fM2 = m2(f, c10986d);
            RectF rectF = new RectF(fM2 - (rectFMo40401e.width() / 2.0f), fM2 - (rectFMo40401e.height() / 2.0f), fM2 + (rectFMo40401e.width() / 2.0f), (rectFMo40401e.height() / 2.0f) + fM2);
            RectF rectF2 = new RectF(G2(), J2(), H2(), F2());
            if (this.l0.m14289e() == AbstractC10987a.a.CONTAINED) {
                this.q0.mo40400a(rectFMo40401e, rectF, rectF2);
            }
            this.q0.mo40408l(rectFMo40401e, rectF, rectF2);
            ((ysa) view).setMaskRectF(rectFMo40401e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void f0(View view, Rect rect) {
        super.f0(view, rect);
        float fCenterY = rect.centerY();
        if (mo14277k()) {
            fCenterY = rect.centerX();
        }
        float fC2 = C2(fCenterY, N2(this.n0.m14312h(), fCenterY, true));
        float fWidth = mo14277k() ? (rect.width() - fC2) / 2.0f : 0.0f;
        float fHeight = mo14277k() ? 0.0f : (rect.height() - fC2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public final void f3(C10990d c10990d) {
        int i = this.i0;
        int i2 = this.h0;
        if (i <= i2) {
            this.n0 = z2(c10990d);
        } else {
            this.n0 = c10990d.m14351j(this.f12266Z, i2, i);
        }
        this.k0.m14278l(this.n0.m14312h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void g1(RecyclerView recyclerView, int i, int i2) {
        super.g1(recyclerView, i, i2);
        g3();
    }

    public final void g2(View view, int i, C10984b c10984b) {
        float fM14311g = this.n0.m14311g() / 2.0f;
        m9246u(view, i);
        M0(view, 0, 0);
        float f = c10984b.f12270c;
        this.q0.mo40407k(view, (int) (f - fM14311g), (int) (f + fM14311g));
        e3(view, c10984b.f12269b, c10984b.f12271d);
    }

    public final void g3() {
        int iM9242j = m9242j();
        int i = this.s0;
        if (iM9242j == i || this.m0 == null) {
            return;
        }
        if (this.l0.mo14292h(this, i)) {
            W2();
        }
        this.s0 = iM9242j;
    }

    @Override // p001o.ke2
    /* renamed from: h */
    public int mo14276h() {
        return this.u0;
    }

    public final float h2(float f, float f2) {
        return O2() ? f - f2 : f + f2;
    }

    public final void h3() {
        if (!this.j0 || m9241Z() < 1) {
            return;
        }
        int i = 0;
        while (i < m9241Z() - 1) {
            int iS0 = s0(m9240Y(i));
            int i2 = i + 1;
            int iS02 = s0(m9240Y(i2));
            if (iS0 > iS02) {
                S2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + iS0 + "] and child at index [" + i2 + "] had adapter position [" + iS02 + "].");
            }
            i = i2;
        }
    }

    public final float i2(float f, float f2) {
        return O2() ? f + f2 : f - f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void j1(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (c2389z.m9344b() <= 0 || w2() <= 0.0f) {
            x1(c2385v);
            this.o0 = 0;
            return;
        }
        boolean zO2 = O2();
        C10990d c10990d = this.m0;
        boolean z = c10990d == null;
        if (z || c10990d.m14348g().m14305a() != w2()) {
            V2(c2385v);
        }
        int iR2 = r2(this.m0);
        int iO2 = o2(c2389z, this.m0);
        this.h0 = zO2 ? iO2 : iR2;
        if (zO2) {
            iO2 = iR2;
        }
        this.i0 = iO2;
        if (z) {
            this.f12266Z = iR2;
            this.p0 = this.m0.m14350i(m9242j(), this.h0, this.i0, O2());
            int i = this.t0;
            if (i != -1) {
                this.f12266Z = L2(i, A2(i));
            }
        }
        int i2 = this.f12266Z;
        this.f12266Z = i2 + q2(0, i2, this.h0, this.i0);
        this.o0 = pza.m44556b(this.o0, 0, c2389z.m9344b());
        f3(this.m0);
        m9232M(c2385v);
        t2(c2385v, c2389z);
        this.s0 = m9242j();
    }

    public final void j2(RecyclerView.C2385v c2385v, int i, int i2) {
        if (i < 0 || i >= m9242j()) {
            return;
        }
        C10984b c10984bT2 = T2(c2385v, n2(i), i);
        g2(c10984bT2.f12268a, i2, c10984bT2);
    }

    @Override // p001o.ke2
    /* renamed from: k */
    public boolean mo14277k() {
        return this.q0.f36739a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void k1(RecyclerView.C2389z c2389z) {
        super.k1(c2389z);
        if (m9241Z() == 0) {
            this.o0 = 0;
        } else {
            this.o0 = s0(m9240Y(0));
        }
        h3();
    }

    public final void k2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, int i) {
        float fN2 = n2(i);
        while (i < c2389z.m9344b()) {
            float fH2 = h2(fN2, this.n0.m14311g() / 2.0f);
            C10986d c10986dN2 = N2(this.n0.m14312h(), fH2, false);
            float fM2 = m2(fH2, c10986dN2);
            if (P2(fM2, c10986dN2)) {
                return;
            }
            fN2 = h2(fN2, this.n0.m14311g());
            if (!Q2(fM2, c10986dN2)) {
                View viewM9307o = c2385v.m9307o(i);
                g2(viewM9307o, -1, new C10984b(viewM9307o, fH2, fM2, c10986dN2));
            }
            i++;
        }
    }

    public final void l2(RecyclerView.C2385v c2385v, int i) {
        float fN2 = n2(i);
        while (i >= 0) {
            float fH2 = h2(fN2, this.n0.m14311g() / 2.0f);
            C10986d c10986dN2 = N2(this.n0.m14312h(), fH2, false);
            float fM2 = m2(fH2, c10986dN2);
            if (Q2(fM2, c10986dN2)) {
                return;
            }
            fN2 = i2(fN2, this.n0.m14311g());
            if (!P2(fM2, c10986dN2)) {
                View viewM9307o = c2385v.m9307o(i);
                g2(viewM9307o, 0, new C10984b(viewM9307o, fH2, fM2, c10986dN2));
            }
            i--;
        }
    }

    public final float m2(float f, C10986d c10986d) {
        C10989c.c cVar = c10986d.f12274a;
        float f2 = cVar.f12302b;
        C10989c.c cVar2 = c10986d.f12275b;
        float fM28648b = gh0.m28648b(f2, cVar2.f12302b, cVar.f12301a, cVar2.f12301a, f);
        if (c10986d.f12275b != this.n0.m14308d() && c10986d.f12274a != this.n0.m14315k()) {
            return fM28648b;
        }
        C10989c.c cVar3 = c10986d.f12275b;
        return fM28648b + ((f - cVar3.f12301a) * (1.0f - cVar3.f12303c));
    }

    public final float n2(int i) {
        return h2(I2() - this.f12266Z, this.n0.m14311g() * i);
    }

    public final int o2(RecyclerView.C2389z c2389z, C10990d c10990d) {
        boolean zO2 = O2();
        C10989c c10989cM14353l = zO2 ? c10990d.m14353l() : c10990d.m14349h();
        C10989c.c cVarM14306b = zO2 ? c10989cM14353l.m14306b() : c10989cM14353l.m14313i();
        int iM9344b = (int) (((((c2389z.m9344b() - 1) * c10989cM14353l.m14311g()) * (zO2 ? -1.0f : 1.0f)) - (cVarM14306b.f12301a - I2())) + (((zO2 ? -1 : 1) * cVarM14306b.f12304d) / 2.0f));
        return zO2 ? Math.min(0, iM9344b) : Math.max(0, iM9344b);
    }

    public int p2(int i) {
        return (int) (this.f12266Z - L2(i, A2(i)));
    }

    public final int r2(C10990d c10990d) {
        boolean zO2 = O2();
        C10989c c10989cM14349h = zO2 ? c10990d.m14349h() : c10990d.m14353l();
        return (int) (I2() - i2((zO2 ? c10989cM14349h.m14313i() : c10989cM14349h.m14306b()).f12301a, c10989cM14349h.m14311g() / 2.0f));
    }

    public final int s2(int i) {
        int iE2 = E2();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            if (iE2 == 0) {
                return O2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 33) {
            return iE2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            if (iE2 == 0) {
                return O2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 130) {
            return iE2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown focus request:");
        sb.append(i);
        return Integer.MIN_VALUE;
    }

    public final void t2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        X2(c2385v);
        if (m9241Z() == 0) {
            l2(c2385v, this.o0 - 1);
            k2(c2385v, c2389z, this.o0);
        } else {
            int iS0 = s0(m9240Y(0));
            int iS02 = s0(m9240Y(m9241Z() - 1));
            l2(c2385v, iS0 - 1);
            k2(c2385v, c2389z, iS02 + 1);
        }
        h3();
    }

    public final View u2() {
        return m9240Y(O2() ? 0 : m9241Z() - 1);
    }

    public final View v2() {
        return m9240Y(O2() ? m9241Z() - 1 : 0);
    }

    public final int w2() {
        return mo14277k() ? mo14274a() : mo14275b();
    }

    public final float x2(View view) {
        super.f0(view, new Rect());
        return mo14277k() ? r0.centerX() : r0.centerY();
    }

    public final int y2() {
        int i;
        int i2;
        if (m9241Z() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) m9240Y(0).getLayoutParams();
        if (this.q0.f36739a == 0) {
            i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i + i2;
    }

    public final C10989c z2(C10990d c10990d) {
        return O2() ? c10990d.m14349h() : c10990d.m14353l();
    }

    public CarouselLayoutManager(AbstractC10987a abstractC10987a) {
        this(abstractC10987a, 0);
    }

    public CarouselLayoutManager(AbstractC10987a abstractC10987a, int i) {
        this.j0 = false;
        this.k0 = new C10985c();
        this.o0 = 0;
        this.r0 = new View.OnLayoutChangeListener() { // from class: o.le2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f33688a.R2(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.t0 = -1;
        this.u0 = 0;
        c3(abstractC10987a);
        d3(i);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.j0 = false;
        this.k0 = new C10985c();
        this.o0 = 0;
        this.r0 = new View.OnLayoutChangeListener() { // from class: o.le2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f33688a.R2(view, i22, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.t0 = -1;
        this.u0 = 0;
        c3(new rnb());
        b3(context, attributeSet);
    }
}
