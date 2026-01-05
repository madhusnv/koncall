package p001o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC2124j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class di7 extends RecyclerView.AbstractC2371h implements i5g {

    /* renamed from: a */
    public final AbstractC2139h f19933a;

    /* renamed from: b */
    public final FragmentManager f19934b;

    /* renamed from: f */
    public C12941g f19938f;

    /* renamed from: c */
    public final rla f19935c = new rla();

    /* renamed from: d */
    public final rla f19936d = new rla();

    /* renamed from: e */
    public final rla f19937e = new rla();

    /* renamed from: g */
    public boolean f19939g = false;

    /* renamed from: h */
    public boolean f19940h = false;

    /* renamed from: o.di7$a */
    public class ViewOnLayoutChangeListenerC12935a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ FrameLayout f19941a;

        /* renamed from: b */
        public final /* synthetic */ gj7 f19942b;

        public ViewOnLayoutChangeListenerC12935a(FrameLayout frameLayout, gj7 gj7Var) {
            this.f19941a = frameLayout;
            this.f19942b = gj7Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f19941a.getParent() != null) {
                this.f19941a.removeOnLayoutChangeListener(this);
                di7.this.m23216s(this.f19942b);
            }
        }
    }

    /* renamed from: o.di7$b */
    public class C12936b implements InterfaceC2142k {

        /* renamed from: a */
        public final /* synthetic */ gj7 f19944a;

        public C12936b(gj7 gj7Var) {
            this.f19944a = gj7Var;
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            if (di7.this.m23220w()) {
                return;
            }
            xcaVar.getLifecycle().mo6524d(this);
            if (wvi.m55104Q(this.f19944a.m28853P())) {
                di7.this.m23216s(this.f19944a);
            }
        }
    }

    /* renamed from: o.di7$c */
    public class C12937c extends FragmentManager.AbstractC2104k {

        /* renamed from: a */
        public final /* synthetic */ Fragment f19946a;

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f19947b;

        public C12937c(Fragment fragment, FrameLayout frameLayout) {
            this.f19946a = fragment;
            this.f19947b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC2104k
        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f19946a) {
                fragmentManager.P1(this);
                di7.this.m23205d(view, this.f19947b);
            }
        }
    }

    /* renamed from: o.di7$d */
    public class RunnableC12938d implements Runnable {
        public RunnableC12938d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            di7 di7Var = di7.this;
            di7Var.f19939g = false;
            di7Var.m23208i();
        }
    }

    /* renamed from: o.di7$e */
    public class C12939e implements InterfaceC2142k {

        /* renamed from: a */
        public final /* synthetic */ Handler f19950a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f19951b;

        public C12939e(Handler handler, Runnable runnable) {
            this.f19950a = handler;
            this.f19951b = runnable;
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            if (aVar == AbstractC2139h.a.ON_DESTROY) {
                this.f19950a.removeCallbacks(this.f19951b);
                xcaVar.getLifecycle().mo6524d(this);
            }
        }
    }

    /* renamed from: o.di7$f */
    public static abstract class AbstractC12940f extends RecyclerView.AbstractC2373j {
        public AbstractC12940f() {
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

        public /* synthetic */ AbstractC12940f(ViewOnLayoutChangeListenerC12935a viewOnLayoutChangeListenerC12935a) {
            this();
        }
    }

    /* renamed from: o.di7$g */
    public class C12941g {

        /* renamed from: a */
        public ViewPager2.AbstractC2554i f19953a;

        /* renamed from: b */
        public RecyclerView.AbstractC2373j f19954b;

        /* renamed from: c */
        public InterfaceC2142k f19955c;

        /* renamed from: d */
        public ViewPager2 f19956d;

        /* renamed from: e */
        public long f19957e = -1;

        /* renamed from: o.di7$g$a */
        public class a extends ViewPager2.AbstractC2554i {
            public a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
            /* renamed from: a */
            public void mo696a(int i) {
                C12941g.this.m23224d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
            /* renamed from: c */
            public void mo697c(int i) {
                C12941g.this.m23224d(false);
            }
        }

        /* renamed from: o.di7$g$b */
        public class b extends AbstractC12940f {
            public b() {
                super(null);
            }

            @Override // p001o.di7.AbstractC12940f, androidx.recyclerview.widget.RecyclerView.AbstractC2373j
            /* renamed from: a */
            public void mo9191a() {
                C12941g.this.m23224d(true);
            }
        }

        /* renamed from: o.di7$g$c */
        public class c implements InterfaceC2142k {
            public c() {
            }

            @Override // androidx.lifecycle.InterfaceC2142k
            /* renamed from: o */
            public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
                C12941g.this.m23224d(false);
            }
        }

        public C12941g() {
        }

        /* renamed from: a */
        public final ViewPager2 m23221a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        public void m23222b(RecyclerView recyclerView) {
            this.f19956d = m23221a(recyclerView);
            a aVar = new a();
            this.f19953a = aVar;
            this.f19956d.m10026g(aVar);
            b bVar = new b();
            this.f19954b = bVar;
            di7.this.registerAdapterDataObserver(bVar);
            c cVar = new c();
            this.f19955c = cVar;
            di7.this.f19933a.mo6521a(cVar);
        }

        /* renamed from: c */
        public void m23223c(RecyclerView recyclerView) {
            m23221a(recyclerView).m10032m(this.f19953a);
            di7.this.unregisterAdapterDataObserver(this.f19954b);
            di7.this.f19933a.mo6524d(this.f19955c);
            this.f19956d = null;
        }

        /* renamed from: d */
        public void m23224d(boolean z) {
            int currentItem;
            Fragment fragment;
            if (di7.this.m23220w() || this.f19956d.getScrollState() != 0 || di7.this.f19935c.m46934g() || di7.this.getItemCount() == 0 || (currentItem = this.f19956d.getCurrentItem()) >= di7.this.getItemCount()) {
                return;
            }
            long itemId = di7.this.getItemId(currentItem);
            if ((itemId != this.f19957e || z) && (fragment = (Fragment) di7.this.f19935c.m46932c(itemId)) != null && fragment.isAdded()) {
                this.f19957e = itemId;
                AbstractC2124j abstractC2124jM6205q = di7.this.f19934b.m6205q();
                Fragment fragment2 = null;
                for (int i = 0; i < di7.this.f19935c.m46940m(); i++) {
                    long jM46935h = di7.this.f19935c.m46935h(i);
                    Fragment fragment3 = (Fragment) di7.this.f19935c.m46941n(i);
                    if (fragment3.isAdded()) {
                        if (jM46935h != this.f19957e) {
                            abstractC2124jM6205q.mo6267t(fragment3, AbstractC2139h.b.STARTED);
                        } else {
                            fragment2 = fragment3;
                        }
                        fragment3.setMenuVisibility(jM46935h == this.f19957e);
                    }
                }
                if (fragment2 != null) {
                    abstractC2124jM6205q.mo6267t(fragment2, AbstractC2139h.b.RESUMED);
                }
                if (abstractC2124jM6205q.mo6265n()) {
                    return;
                }
                abstractC2124jM6205q.mo6262j();
            }
        }
    }

    public di7(FragmentManager fragmentManager, AbstractC2139h abstractC2139h) {
        this.f19934b = fragmentManager;
        this.f19933a = abstractC2139h;
        super.setHasStableIds(true);
    }

    /* renamed from: g */
    public static String m23200g(String str, long j) {
        return str + j;
    }

    /* renamed from: k */
    public static boolean m23201k(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* renamed from: r */
    public static long m23202r(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    @Override // p001o.i5g
    /* renamed from: a */
    public final Parcelable mo23203a() {
        Bundle bundle = new Bundle(this.f19935c.m46940m() + this.f19936d.m46940m());
        for (int i = 0; i < this.f19935c.m46940m(); i++) {
            long jM46935h = this.f19935c.m46935h(i);
            Fragment fragment = (Fragment) this.f19935c.m46932c(jM46935h);
            if (fragment != null && fragment.isAdded()) {
                this.f19934b.t1(bundle, m23200g("f#", jM46935h), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f19936d.m46940m(); i2++) {
            long jM46935h2 = this.f19936d.m46935h(i2);
            if (m23206e(jM46935h2)) {
                bundle.putParcelable(m23200g("s#", jM46935h2), (Parcelable) this.f19936d.m46932c(jM46935h2));
            }
        }
        return bundle;
    }

    @Override // p001o.i5g
    /* renamed from: c */
    public final void mo23204c(Parcelable parcelable) {
        if (!this.f19936d.m46934g() || !this.f19935c.m46934g()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m23201k(str, "f#")) {
                this.f19935c.m46936i(m23202r(str, "f#"), this.f19934b.x0(bundle, str));
            } else {
                if (!m23201k(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jM23202r = m23202r(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (m23206e(jM23202r)) {
                    this.f19936d.m46936i(jM23202r, savedState);
                }
            }
        }
        if (this.f19935c.m46934g()) {
            return;
        }
        this.f19940h = true;
        this.f19939g = true;
        m23208i();
        m23218u();
    }

    /* renamed from: d */
    public void m23205d(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* renamed from: e */
    public boolean m23206e(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    /* renamed from: f */
    public abstract Fragment mo695f(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public long getItemId(int i) {
        return i;
    }

    /* renamed from: h */
    public final void m23207h(int i) {
        long itemId = getItemId(i);
        if (this.f19935c.m46931b(itemId)) {
            return;
        }
        Fragment fragmentMo695f = mo695f(i);
        fragmentMo695f.setInitialSavedState((Fragment.SavedState) this.f19936d.m46932c(itemId));
        this.f19935c.m46936i(itemId, fragmentMo695f);
    }

    /* renamed from: i */
    public void m23208i() {
        if (!this.f19940h || m23220w()) {
            return;
        }
        ap0 ap0Var = new ap0();
        for (int i = 0; i < this.f19935c.m46940m(); i++) {
            long jM46935h = this.f19935c.m46935h(i);
            if (!m23206e(jM46935h)) {
                ap0Var.add(Long.valueOf(jM46935h));
                this.f19937e.m46938k(jM46935h);
            }
        }
        if (!this.f19939g) {
            this.f19940h = false;
            for (int i2 = 0; i2 < this.f19935c.m46940m(); i2++) {
                long jM46935h2 = this.f19935c.m46935h(i2);
                if (!m23209j(jM46935h2)) {
                    ap0Var.add(Long.valueOf(jM46935h2));
                }
            }
        }
        Iterator it = ap0Var.iterator();
        while (it.hasNext()) {
            m23217t(((Long) it.next()).longValue());
        }
    }

    /* renamed from: j */
    public final boolean m23209j(long j) {
        View view;
        if (this.f19937e.m46931b(j)) {
            return true;
        }
        Fragment fragment = (Fragment) this.f19935c.m46932c(j);
        return (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) ? false : true;
    }

    /* renamed from: l */
    public final Long m23210l(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.f19937e.m46940m(); i2++) {
            if (((Integer) this.f19937e.m46941n(i2)).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f19937e.m46935h(i2));
            }
        }
        return lValueOf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(gj7 gj7Var, int i) {
        long jM9149m = gj7Var.m9149m();
        int id = gj7Var.m28853P().getId();
        Long lM23210l = m23210l(id);
        if (lM23210l != null && lM23210l.longValue() != jM9149m) {
            m23217t(lM23210l.longValue());
            this.f19937e.m46938k(lM23210l.longValue());
        }
        this.f19937e.m46936i(jM9149m, Integer.valueOf(id));
        m23207h(i);
        FrameLayout frameLayoutM28853P = gj7Var.m28853P();
        if (wvi.m55104Q(frameLayoutM28853P)) {
            if (frameLayoutM28853P.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutM28853P.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC12935a(frameLayoutM28853P, gj7Var));
        }
        m23208i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final gj7 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return gj7.m28852O(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(gj7 gj7Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        fgd.m26657a(this.f19938f == null);
        C12941g c12941g = new C12941g();
        this.f19938f = c12941g;
        c12941g.m23222b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f19938f.m23223c(recyclerView);
        this.f19938f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(gj7 gj7Var) {
        m23216s(gj7Var);
        m23208i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(gj7 gj7Var) {
        Long lM23210l = m23210l(gj7Var.m28853P().getId());
        if (lM23210l != null) {
            m23217t(lM23210l.longValue());
            this.f19937e.m46938k(lM23210l.longValue());
        }
    }

    /* renamed from: s */
    public void m23216s(gj7 gj7Var) {
        Fragment fragment = (Fragment) this.f19935c.m46932c(gj7Var.m9149m());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutM28853P = gj7Var.m28853P();
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            m23219v(fragment, frameLayoutM28853P);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutM28853P) {
                m23205d(view, frameLayoutM28853P);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            m23205d(view, frameLayoutM28853P);
            return;
        }
        if (m23220w()) {
            if (this.f19934b.O0()) {
                return;
            }
            this.f19933a.mo6521a(new C12936b(gj7Var));
            return;
        }
        m23219v(fragment, frameLayoutM28853P);
        this.f19934b.m6205q().m6421e(fragment, "f" + gj7Var.m9149m()).mo6267t(fragment, AbstractC2139h.b.STARTED).mo6262j();
        this.f19938f.m23224d(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* renamed from: t */
    public final void m23217t(long j) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.f19935c.m46932c(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!m23206e(j)) {
            this.f19936d.m46938k(j);
        }
        if (!fragment.isAdded()) {
            this.f19935c.m46938k(j);
            return;
        }
        if (m23220w()) {
            this.f19940h = true;
            return;
        }
        if (fragment.isAdded() && m23206e(j)) {
            this.f19936d.m46936i(j, this.f19934b.G1(fragment));
        }
        this.f19934b.m6205q().mo6266o(fragment).mo6262j();
        this.f19935c.m46938k(j);
    }

    /* renamed from: u */
    public final void m23218u() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC12938d runnableC12938d = new RunnableC12938d();
        this.f19933a.mo6521a(new C12939e(handler, runnableC12938d));
        handler.postDelayed(runnableC12938d, 10000L);
    }

    /* renamed from: v */
    public final void m23219v(Fragment fragment, FrameLayout frameLayout) {
        this.f19934b.u1(new C12937c(fragment, frameLayout), false);
    }

    /* renamed from: w */
    public boolean m23220w() {
        return this.f19934b.W0();
    }
}
