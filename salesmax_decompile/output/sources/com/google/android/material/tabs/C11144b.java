package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.b */
/* loaded from: classes3.dex */
public final class C11144b {

    /* renamed from: a */
    public final TabLayout f13071a;

    /* renamed from: b */
    public final ViewPager2 f13072b;

    /* renamed from: c */
    public final boolean f13073c;

    /* renamed from: d */
    public final boolean f13074d;

    /* renamed from: e */
    public final b f13075e;

    /* renamed from: f */
    public RecyclerView.AbstractC2371h f13076f;

    /* renamed from: g */
    public boolean f13077g;

    /* renamed from: h */
    public c f13078h;

    /* renamed from: i */
    public TabLayout.InterfaceC11137d f13079i;

    /* renamed from: j */
    public RecyclerView.AbstractC2373j f13080j;

    /* renamed from: com.google.android.material.tabs.b$a */
    public class a extends RecyclerView.AbstractC2373j {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: a */
        public void mo9191a() {
            C11144b.this.m15313c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: b */
        public void mo9192b(int i, int i2, Object obj) {
            C11144b.this.m15313c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: c */
        public void mo9193c(int i, int i2) {
            C11144b.this.m15313c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: d */
        public void mo9194d(int i, int i2, int i3) {
            C11144b.this.m15313c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: e */
        public void mo9195e(int i, int i2) {
            C11144b.this.m15313c();
        }
    }

    /* renamed from: com.google.android.material.tabs.b$b */
    public interface b {
        /* renamed from: a */
        void mo15314a(TabLayout.C11140g c11140g, int i);
    }

    /* renamed from: com.google.android.material.tabs.b$c */
    public static class c extends ViewPager2.AbstractC2554i {

        /* renamed from: a */
        public final WeakReference f13082a;

        /* renamed from: b */
        public int f13083b;

        /* renamed from: c */
        public int f13084c;

        public c(TabLayout tabLayout) {
            this.f13082a = new WeakReference(tabLayout);
            m15315d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
        /* renamed from: a */
        public void mo696a(int i) {
            this.f13083b = this.f13084c;
            this.f13084c = i;
            TabLayout tabLayout = (TabLayout) this.f13082a.get();
            if (tabLayout != null) {
                tabLayout.m15235T(this.f13084c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
        /* renamed from: b */
        public void mo10057b(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f13082a.get();
            if (tabLayout != null) {
                int i3 = this.f13084c;
                tabLayout.m15230O(i, f, i3 != 2 || this.f13083b == 1, (i3 == 2 && this.f13083b == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
        /* renamed from: c */
        public void mo697c(int i) {
            TabLayout tabLayout = (TabLayout) this.f13082a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f13084c;
            tabLayout.m15228M(tabLayout.m15217B(i), i2 == 0 || (i2 == 2 && this.f13083b == 0));
        }

        /* renamed from: d */
        public void m15315d() {
            this.f13084c = 0;
            this.f13083b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.b$d */
    public static class d implements TabLayout.InterfaceC11137d {

        /* renamed from: a */
        public final ViewPager2 f13085a;

        /* renamed from: b */
        public final boolean f13086b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.f13085a = viewPager2;
            this.f13086b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC11136c
        /* renamed from: a */
        public void mo943a(TabLayout.C11140g c11140g) {
            this.f13085a.setCurrentItem(c11140g.m15293g(), this.f13086b);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC11136c
        /* renamed from: b */
        public void mo944b(TabLayout.C11140g c11140g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC11136c
        /* renamed from: c */
        public void mo945c(TabLayout.C11140g c11140g) {
        }
    }

    public C11144b(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    /* renamed from: a */
    public void m15311a() {
        if (this.f13077g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.AbstractC2371h adapter = this.f13072b.getAdapter();
        this.f13076f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f13077g = true;
        c cVar = new c(this.f13071a);
        this.f13078h = cVar;
        this.f13072b.m10026g(cVar);
        d dVar = new d(this.f13072b, this.f13074d);
        this.f13079i = dVar;
        this.f13071a.m15237h(dVar);
        if (this.f13073c) {
            a aVar = new a();
            this.f13080j = aVar;
            this.f13076f.registerAdapterDataObserver(aVar);
        }
        m15313c();
        this.f13071a.setScrollPosition(this.f13072b.getCurrentItem(), 0.0f, true);
    }

    /* renamed from: b */
    public void m15312b() {
        RecyclerView.AbstractC2371h abstractC2371h;
        if (this.f13073c && (abstractC2371h = this.f13076f) != null) {
            abstractC2371h.unregisterAdapterDataObserver(this.f13080j);
            this.f13080j = null;
        }
        this.f13071a.m15225J(this.f13079i);
        this.f13072b.m10032m(this.f13078h);
        this.f13079i = null;
        this.f13078h = null;
        this.f13076f = null;
        this.f13077g = false;
    }

    /* renamed from: c */
    public void m15313c() {
        this.f13071a.m15223H();
        RecyclerView.AbstractC2371h abstractC2371h = this.f13076f;
        if (abstractC2371h != null) {
            int itemCount = abstractC2371h.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.C11140g c11140gM15220E = this.f13071a.m15220E();
                this.f13075e.mo15314a(c11140gM15220E, i);
                this.f13071a.m15240k(c11140gM15220E, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f13072b.getCurrentItem(), this.f13071a.getTabCount() - 1);
                if (iMin != this.f13071a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f13071a;
                    tabLayout.m15227L(tabLayout.m15217B(iMin));
                }
            }
        }
    }

    public C11144b(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, b bVar) {
        this(tabLayout, viewPager2, z, true, bVar);
    }

    public C11144b(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, boolean z2, b bVar) {
        this.f13071a = tabLayout;
        this.f13072b = viewPager2;
        this.f13073c = z;
        this.f13074d = z2;
        this.f13075e = bVar;
    }
}
