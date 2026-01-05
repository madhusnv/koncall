package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C2409o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.objectweb.asm.Opcodes;
import p001o.cc;
import p001o.i5g;
import p001o.jc;
import p001o.ws6;
import p001o.wvi;
import p001o.xae;

/* loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {
    public static boolean l0 = true;

    /* renamed from: H */
    public C2560a f10501H;

    /* renamed from: L */
    public ws6 f10502L;

    /* renamed from: M */
    public C2561b f10503M;

    /* renamed from: Q */
    public RecyclerView.AbstractC2376m f10504Q;

    /* renamed from: a */
    public final Rect f10505a;

    /* renamed from: b */
    public final Rect f10506b;

    /* renamed from: c */
    public C2560a f10507c;

    /* renamed from: d */
    public int f10508d;

    /* renamed from: e */
    public boolean f10509e;

    /* renamed from: f */
    public RecyclerView.AbstractC2373j f10510f;

    /* renamed from: g */
    public LinearLayoutManager f10511g;

    /* renamed from: h */
    public int f10512h;
    public boolean h0;
    public boolean i0;
    public int j0;
    public AbstractC2550e k0;

    /* renamed from: q */
    public Parcelable f10513q;

    /* renamed from: s */
    public RecyclerView f10514s;

    /* renamed from: x */
    public C2409o f10515x;

    /* renamed from: y */
    public C2562c f10516y;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C2546a extends AbstractC2552g {
        public C2546a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2552g, androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: a */
        public void mo9191a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f10509e = true;
            viewPager2.f10516y.m10077l();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C2547b extends AbstractC2554i {
        public C2547b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
        /* renamed from: a */
        public void mo696a(int i) {
            if (i == 0) {
                ViewPager2.this.m10033n();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
        /* renamed from: c */
        public void mo697c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f10508d != i) {
                viewPager2.f10508d = i;
                viewPager2.k0.mo10054q();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C2548c extends AbstractC2554i {
        public C2548c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
        /* renamed from: c */
        public void mo697c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f10514s.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C2549d implements RecyclerView.InterfaceC2380q {
        public C2549d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2380q
        /* renamed from: b */
        public void mo9257b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2380q
        /* renamed from: d */
        public void mo9258d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public abstract class AbstractC2550e {
        public AbstractC2550e() {
        }

        /* renamed from: a */
        public boolean mo10038a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo10039b(int i) {
            return false;
        }

        /* renamed from: c */
        public boolean mo10040c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        public boolean mo10041d() {
            return false;
        }

        /* renamed from: e */
        public void mo10042e(RecyclerView.AbstractC2371h abstractC2371h) {
        }

        /* renamed from: f */
        public void mo10043f(RecyclerView.AbstractC2371h abstractC2371h) {
        }

        /* renamed from: g */
        public String mo10044g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        public void mo10045h(C2560a c2560a, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo10046i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        public void mo10047j(cc ccVar) {
        }

        /* renamed from: k */
        public boolean mo10048k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        public boolean mo10049l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        public void mo10050m() {
        }

        /* renamed from: n */
        public CharSequence mo10051n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        public void mo10052o(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        public void mo10053p() {
        }

        /* renamed from: q */
        public void mo10054q() {
        }

        /* renamed from: r */
        public void mo10055r() {
        }

        /* renamed from: s */
        public void mo10056s() {
        }

        public /* synthetic */ AbstractC2550e(ViewPager2 viewPager2, C2546a c2546a) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C2551f extends AbstractC2550e {
        public C2551f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: b */
        public boolean mo10039b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.m10024e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: d */
        public boolean mo10041d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: j */
        public void mo10047j(cc ccVar) {
            if (ViewPager2.this.m10024e()) {
                return;
            }
            ccVar.f0(cc.C12624a.f17806r);
            ccVar.f0(cc.C12624a.f17805q);
            ccVar.P0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: k */
        public boolean mo10048k(int i) {
            if (mo10039b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: n */
        public CharSequence mo10051n() {
            if (mo10041d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class AbstractC2552g extends RecyclerView.AbstractC2373j {
        public AbstractC2552g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: a */
        public abstract void mo9191a();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: b */
        public final void mo9192b(int i, int i2, Object obj) {
            mo9191a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: c */
        public final void mo9193c(int i, int i2) {
            mo9191a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: d */
        public final void mo9194d(int i, int i2, int i3) {
            mo9191a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: e */
        public final void mo9195e(int i, int i2) {
            mo9191a();
        }

        public /* synthetic */ AbstractC2552g(C2546a c2546a) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C2553h extends LinearLayoutManager {
        public C2553h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
        public boolean F1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
        public void Y0(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, cc ccVar) {
            super.Y0(c2385v, c2389z, ccVar);
            ViewPager2.this.k0.mo10047j(ccVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void Z1(RecyclerView.C2389z c2389z, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.Z1(c2389z, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
        public boolean t1(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, int i, Bundle bundle) {
            return ViewPager2.this.k0.mo10039b(i) ? ViewPager2.this.k0.mo10048k(i) : super.t1(c2385v, c2389z, i, bundle);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class AbstractC2554i {
        /* renamed from: a */
        public void mo696a(int i) {
        }

        /* renamed from: b */
        public void mo10057b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo697c(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public class C2555j extends AbstractC2550e {

        /* renamed from: b */
        public final jc f10526b;

        /* renamed from: c */
        public final jc f10527c;

        /* renamed from: d */
        public RecyclerView.AbstractC2373j f10528d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        public class a implements jc {
            public a() {
            }

            @Override // p001o.jc
            /* renamed from: a */
            public boolean mo6030a(View view, jc.AbstractC14493a abstractC14493a) {
                C2555j.this.m10060v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        public class b implements jc {
            public b() {
            }

            @Override // p001o.jc
            /* renamed from: a */
            public boolean mo6030a(View view, jc.AbstractC14493a abstractC14493a) {
                C2555j.this.m10060v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        public class c extends AbstractC2552g {
            public c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2552g, androidx.recyclerview.widget.RecyclerView.AbstractC2373j
            /* renamed from: a */
            public void mo9191a() {
                C2555j.this.m10061w();
            }
        }

        public C2555j() {
            super(ViewPager2.this, null);
            this.f10526b = new a();
            this.f10527c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: a */
        public boolean mo10038a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: c */
        public boolean mo10040c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: e */
        public void mo10042e(RecyclerView.AbstractC2371h abstractC2371h) {
            m10061w();
            if (abstractC2371h != null) {
                abstractC2371h.registerAdapterDataObserver(this.f10528d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: f */
        public void mo10043f(RecyclerView.AbstractC2371h abstractC2371h) {
            if (abstractC2371h != null) {
                abstractC2371h.unregisterAdapterDataObserver(this.f10528d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: g */
        public String mo10044g() {
            if (mo10038a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: h */
        public void mo10045h(C2560a c2560a, RecyclerView recyclerView) {
            wvi.t0(recyclerView, 2);
            this.f10528d = new c();
            if (wvi.m55137x(ViewPager2.this) == 0) {
                wvi.t0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: i */
        public void mo10046i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m10058t(accessibilityNodeInfo);
            m10059u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: l */
        public boolean mo10049l(int i, Bundle bundle) {
            if (!mo10040c(i, bundle)) {
                throw new IllegalStateException();
            }
            m10060v(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: m */
        public void mo10050m() {
            m10061w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: o */
        public void mo10052o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo10044g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: p */
        public void mo10053p() {
            m10061w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: q */
        public void mo10054q() {
            m10061w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: r */
        public void mo10055r() {
            m10061w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2550e
        /* renamed from: s */
        public void mo10056s() {
            m10061w();
        }

        /* renamed from: t */
        public final void m10058t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() == null) {
                itemCount = 0;
                itemCount2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                itemCount = ViewPager2.this.getAdapter().getItemCount();
                itemCount2 = 0;
            } else {
                itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                itemCount = 0;
            }
            cc.d1(accessibilityNodeInfo).q0(cc.C12628e.m20831b(itemCount, itemCount2, false, 0));
        }

        /* renamed from: u */
        public final void m10059u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.AbstractC2371h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.m10024e()) {
                return;
            }
            if (ViewPager2.this.f10508d > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (ViewPager2.this.f10508d < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        /* renamed from: v */
        public void m10060v(int i) {
            if (ViewPager2.this.m10024e()) {
                ViewPager2.this.m10029j(i, true);
            }
        }

        /* renamed from: w */
        public void m10061w() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            wvi.g0(viewPager2, R.id.accessibilityActionPageLeft);
            wvi.g0(viewPager2, R.id.accessibilityActionPageRight);
            wvi.g0(viewPager2, R.id.accessibilityActionPageUp);
            wvi.g0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.m10024e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f10508d < itemCount - 1) {
                    wvi.i0(viewPager2, new cc.C12624a(R.id.accessibilityActionPageDown, null), null, this.f10526b);
                }
                if (ViewPager2.this.f10508d > 0) {
                    wvi.i0(viewPager2, new cc.C12624a(R.id.accessibilityActionPageUp, null), null, this.f10527c);
                    return;
                }
                return;
            }
            boolean zM10023d = ViewPager2.this.m10023d();
            int i2 = zM10023d ? 16908360 : 16908361;
            if (zM10023d) {
                i = 16908361;
            }
            if (ViewPager2.this.f10508d < itemCount - 1) {
                wvi.i0(viewPager2, new cc.C12624a(i2, null), null, this.f10526b);
            }
            if (ViewPager2.this.f10508d > 0) {
                wvi.i0(viewPager2, new cc.C12624a(i, null), null, this.f10527c);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface InterfaceC2556k {
        /* renamed from: a */
        void mo10062a(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public class C2557l extends C2409o {
        public C2557l() {
        }

        @Override // androidx.recyclerview.widget.C2409o, androidx.recyclerview.widget.AbstractC2413s
        /* renamed from: f */
        public View mo9646f(RecyclerView.AbstractC2379p abstractC2379p) {
            if (ViewPager2.this.m10022c()) {
                return null;
            }
            return super.mo9646f(abstractC2379p);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public class C2558m extends RecyclerView {
        public C2558m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.k0.mo10041d() ? ViewPager2.this.k0.mo10051n() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f10508d);
            accessibilityEvent.setToIndex(ViewPager2.this.f10508d);
            ViewPager2.this.k0.mo10052o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m10024e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m10024e() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    public static class RunnableC2559n implements Runnable {

        /* renamed from: a */
        public final int f10534a;

        /* renamed from: b */
        public final RecyclerView f10535b;

        public RunnableC2559n(int i, RecyclerView recyclerView) {
            this.f10534a = i;
            this.f10535b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10535b.B1(this.f10534a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f10505a = new Rect();
        this.f10506b = new Rect();
        this.f10507c = new C2560a(3);
        this.f10509e = false;
        this.f10510f = new C2546a();
        this.f10512h = -1;
        this.f10504Q = null;
        this.h0 = false;
        this.i0 = true;
        this.j0 = -1;
        m10021b(context, null);
    }

    /* renamed from: a */
    public final RecyclerView.InterfaceC2380q m10020a() {
        return new C2549d();
    }

    /* renamed from: b */
    public final void m10021b(Context context, AttributeSet attributeSet) {
        this.k0 = l0 ? new C2555j() : new C2551f();
        C2558m c2558m = new C2558m(context);
        this.f10514s = c2558m;
        c2558m.setId(wvi.m55124k());
        this.f10514s.setDescendantFocusability(Opcodes.ACC_DEPRECATED);
        C2553h c2553h = new C2553h(context);
        this.f10511g = c2553h;
        this.f10514s.setLayoutManager(c2553h);
        this.f10514s.setScrollingTouchSlop(1);
        m10030k(context, attributeSet);
        this.f10514s.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f10514s.m9088j(m10020a());
        C2562c c2562c = new C2562c(this);
        this.f10516y = c2562c;
        this.f10502L = new ws6(this, c2562c, this.f10514s);
        C2557l c2557l = new C2557l();
        this.f10515x = c2557l;
        c2557l.mo9681b(this.f10514s);
        this.f10514s.m9090l(this.f10516y);
        C2560a c2560a = new C2560a(3);
        this.f10501H = c2560a;
        this.f10516y.m10080o(c2560a);
        C2547b c2547b = new C2547b();
        C2548c c2548c = new C2548c();
        this.f10501H.m10063d(c2547b);
        this.f10501H.m10063d(c2548c);
        this.k0.mo10045h(this.f10501H, this.f10514s);
        this.f10501H.m10063d(this.f10507c);
        C2561b c2561b = new C2561b(this.f10511g);
        this.f10503M = c2561b;
        this.f10501H.m10063d(c2561b);
        RecyclerView recyclerView = this.f10514s;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: c */
    public boolean m10022c() {
        return this.f10502L.m54948a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f10514s.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f10514s.canScrollVertically(i);
    }

    /* renamed from: d */
    public boolean m10023d() {
        return this.f10511g.o0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f10517a;
            sparseArray.put(this.f10514s.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m10028i();
    }

    /* renamed from: e */
    public boolean m10024e() {
        return this.i0;
    }

    /* renamed from: f */
    public final void m10025f(RecyclerView.AbstractC2371h abstractC2371h) {
        if (abstractC2371h != null) {
            abstractC2371h.registerAdapterDataObserver(this.f10510f);
        }
    }

    /* renamed from: g */
    public void m10026g(AbstractC2554i abstractC2554i) {
        this.f10507c.m10063d(abstractC2554i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.k0.mo10038a() ? this.k0.mo10044g() : super.getAccessibilityClassName();
    }

    public RecyclerView.AbstractC2371h getAdapter() {
        return this.f10514s.getAdapter();
    }

    public int getCurrentItem() {
        return this.f10508d;
    }

    public int getItemDecorationCount() {
        return this.f10514s.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.j0;
    }

    public int getOrientation() {
        return this.f10511g.y2();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f10514s;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f10516y.m10073h();
    }

    /* renamed from: h */
    public void m10027h() {
        if (this.f10503M.m10066d() == null) {
            return;
        }
        double dM10072g = this.f10516y.m10072g();
        int i = (int) dM10072g;
        float f = (float) (dM10072g - i);
        this.f10503M.mo10057b(i, f, Math.round(getPageSize() * f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final void m10028i() {
        RecyclerView.AbstractC2371h adapter;
        if (this.f10512h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f10513q;
        if (parcelable != null) {
            if (adapter instanceof i5g) {
                ((i5g) adapter).mo23204c(parcelable);
            }
            this.f10513q = null;
        }
        int iMax = Math.max(0, Math.min(this.f10512h, adapter.getItemCount() - 1));
        this.f10508d = iMax;
        this.f10512h = -1;
        this.f10514s.s1(iMax);
        this.k0.mo10050m();
    }

    /* renamed from: j */
    public void m10029j(int i, boolean z) {
        RecyclerView.AbstractC2371h adapter = getAdapter();
        if (adapter == null) {
            if (this.f10512h != -1) {
                this.f10512h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        if (iMin == this.f10508d && this.f10516y.m10075j()) {
            return;
        }
        int i2 = this.f10508d;
        if (iMin == i2 && z) {
            return;
        }
        double dM10072g = i2;
        this.f10508d = iMin;
        this.k0.mo10054q();
        if (!this.f10516y.m10075j()) {
            dM10072g = this.f10516y.m10072g();
        }
        this.f10516y.m10078m(iMin, z);
        if (!z) {
            this.f10514s.s1(iMin);
            return;
        }
        double d = iMin;
        if (Math.abs(d - dM10072g) <= 3.0d) {
            this.f10514s.B1(iMin);
            return;
        }
        this.f10514s.s1(d > dM10072g ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f10514s;
        recyclerView.post(new RunnableC2559n(iMin, recyclerView));
    }

    /* renamed from: k */
    public final void m10030k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xae.ViewPager2);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, xae.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(xae.ViewPager2_android_orientation, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: l */
    public final void m10031l(RecyclerView.AbstractC2371h abstractC2371h) {
        if (abstractC2371h != null) {
            abstractC2371h.unregisterAdapterDataObserver(this.f10510f);
        }
    }

    /* renamed from: m */
    public void m10032m(AbstractC2554i abstractC2554i) {
        this.f10507c.m10064e(abstractC2554i);
    }

    /* renamed from: n */
    public void m10033n() {
        C2409o c2409o = this.f10515x;
        if (c2409o == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo9646f = c2409o.mo9646f(this.f10511g);
        if (viewMo9646f == null) {
            return;
        }
        int iS0 = this.f10511g.s0(viewMo9646f);
        if (iS0 != this.f10508d && getScrollState() == 0) {
            this.f10501H.mo697c(iS0);
        }
        this.f10509e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.k0.mo10046i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f10514s.getMeasuredWidth();
        int measuredHeight = this.f10514s.getMeasuredHeight();
        this.f10505a.left = getPaddingLeft();
        this.f10505a.right = (i3 - i) - getPaddingRight();
        this.f10505a.top = getPaddingTop();
        this.f10505a.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f10505a, this.f10506b);
        RecyclerView recyclerView = this.f10514s;
        Rect rect = this.f10506b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f10509e) {
            m10033n();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.f10514s, i, i2);
        int measuredWidth = this.f10514s.getMeasuredWidth();
        int measuredHeight = this.f10514s.getMeasuredHeight();
        int measuredState = this.f10514s.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f10512h = savedState.f10518b;
        this.f10513q = savedState.f10519c;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10517a = this.f10514s.getId();
        int i = this.f10512h;
        if (i == -1) {
            i = this.f10508d;
        }
        savedState.f10518b = i;
        Parcelable parcelable = this.f10513q;
        if (parcelable != null) {
            savedState.f10519c = parcelable;
        } else {
            Object adapter = this.f10514s.getAdapter();
            if (adapter instanceof i5g) {
                savedState.f10519c = ((i5g) adapter).mo23203a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.k0.mo10040c(i, bundle) ? this.k0.mo10049l(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(RecyclerView.AbstractC2371h abstractC2371h) {
        RecyclerView.AbstractC2371h adapter = this.f10514s.getAdapter();
        this.k0.mo10043f(adapter);
        m10031l(adapter);
        this.f10514s.setAdapter(abstractC2371h);
        this.f10508d = 0;
        m10028i();
        this.k0.mo10042e(abstractC2371h);
        m10025f(abstractC2371h);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.k0.mo10053p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.j0 = i;
        this.f10514s.requestLayout();
    }

    public void setOrientation(int i) {
        this.f10511g.N2(i);
        this.k0.mo10055r();
    }

    public void setPageTransformer(InterfaceC2556k interfaceC2556k) {
        if (interfaceC2556k != null) {
            if (!this.h0) {
                this.f10504Q = this.f10514s.getItemAnimator();
                this.h0 = true;
            }
            this.f10514s.setItemAnimator(null);
        } else if (this.h0) {
            this.f10514s.setItemAnimator(this.f10504Q);
            this.f10504Q = null;
            this.h0 = false;
        }
        if (interfaceC2556k == this.f10503M.m10066d()) {
            return;
        }
        this.f10503M.m10067e(interfaceC2556k);
        m10027h();
    }

    public void setUserInputEnabled(boolean z) {
        this.i0 = z;
        this.k0.mo10056s();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2545a();

        /* renamed from: a */
        public int f10517a;

        /* renamed from: b */
        public int f10518b;

        /* renamed from: c */
        public Parcelable f10519c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        public static class C2545a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
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
            m10034a(parcel, classLoader);
        }

        /* renamed from: a */
        public final void m10034a(Parcel parcel, ClassLoader classLoader) {
            this.f10517a = parcel.readInt();
            this.f10518b = parcel.readInt();
            this.f10519c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10517a);
            parcel.writeInt(this.f10518b);
            parcel.writeParcelable(this.f10519c, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCurrentItem(int i, boolean z) {
        if (m10022c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m10029j(i, z);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10505a = new Rect();
        this.f10506b = new Rect();
        this.f10507c = new C2560a(3);
        this.f10509e = false;
        this.f10510f = new C2546a();
        this.f10512h = -1;
        this.f10504Q = null;
        this.h0 = false;
        this.i0 = true;
        this.j0 = -1;
        m10021b(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10505a = new Rect();
        this.f10506b = new Rect();
        this.f10507c = new C2560a(3);
        this.f10509e = false;
        this.f10510f = new C2546a();
        this.f10512h = -1;
        this.f10504Q = null;
        this.h0 = false;
        this.i0 = true;
        this.j0 = -1;
        m10021b(context, attributeSet);
    }
}
