package p001o;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2341h;
import androidx.navigation.C2330a;
import androidx.navigation.C2342i;
import androidx.navigation.C2345l;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ssb {

    /* renamed from: a */
    public static final ssb f45872a = new ssb();

    /* renamed from: o.ssb$a */
    public static final class C16909a implements AbstractC2333d.c {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f45873a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC2333d f45874b;

        public C16909a(WeakReference weakReference, AbstractC2333d abstractC2333d) {
            this.f45873a = weakReference;
            this.f45874b = abstractC2333d;
        }

        @Override // androidx.navigation.AbstractC2333d.c
        /* renamed from: a */
        public void mo74a(AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, Bundle bundle) {
            sq8.m48649h(abstractC2333d, "controller");
            sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
            NavigationBarView navigationBarView = (NavigationBarView) this.f45873a.get();
            if (navigationBarView == null) {
                this.f45874b.t0(this);
                return;
            }
            if (abstractC2341h instanceof r37) {
                return;
            }
            Menu menu = navigationBarView.getMenu();
            sq8.m48648g(menu, "view.menu");
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                sq8.m48645d(item, "getItem(index)");
                if (ssb.m48873c(abstractC2341h, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    /* renamed from: c */
    public static final boolean m48873c(AbstractC2341h abstractC2341h, int i) {
        boolean z;
        sq8.m48649h(abstractC2341h, "<this>");
        Iterator it = AbstractC2341h.f9602x.m8776c(abstractC2341h).iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            if (((AbstractC2341h) it.next()).m8753A() == i) {
                z = true;
            }
        } while (!z);
        return true;
    }

    /* renamed from: d */
    public static final boolean m48874d(AbstractC2333d abstractC2333d, jj0 jj0Var) {
        sq8.m48649h(abstractC2333d, "navController");
        sq8.m48649h(jj0Var, "configuration");
        ndc ndcVarM33872b = jj0Var.m33872b();
        AbstractC2341h abstractC2341hM8591G = abstractC2333d.m8591G();
        if (ndcVarM33872b != null && abstractC2341hM8591G != null && jj0Var.m33873c(abstractC2341hM8591G)) {
            ndcVarM33872b.mo6003a();
            return true;
        }
        if (abstractC2333d.d0()) {
            return true;
        }
        jj0Var.m33871a();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m48875e(MenuItem menuItem, AbstractC2333d abstractC2333d) {
        boolean z;
        sq8.m48649h(menuItem, "item");
        sq8.m48649h(abstractC2333d, "navController");
        C2345l.a aVarM8824l = new C2345l.a().m8817d(true).m8824l(true);
        AbstractC2341h abstractC2341hM8591G = abstractC2333d.m8591G();
        sq8.m48646e(abstractC2341hM8591G);
        C2342i c2342iM8756G = abstractC2341hM8591G.m8756G();
        sq8.m48646e(c2342iM8756G);
        if (c2342iM8756G.m8784W(menuItem.getItemId()) instanceof C2330a.b) {
            aVarM8824l.m8815b(o5e.nav_default_enter_anim).m8816c(o5e.nav_default_exit_anim).m8818e(o5e.nav_default_pop_enter_anim).m8819f(o5e.nav_default_pop_exit_anim);
        } else {
            aVarM8824l.m8815b(r5e.nav_default_enter_anim).m8816c(r5e.nav_default_exit_anim).m8818e(r5e.nav_default_pop_enter_anim).m8819f(r5e.nav_default_pop_exit_anim);
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            aVarM8824l.m8820g(C2342i.f9625X.m8788b(abstractC2333d.m8593I()).m8753A(), false, true);
        }
        try {
            abstractC2333d.m8605V(menuItem.getItemId(), null, aVarM8824l.m8814a());
            AbstractC2341h abstractC2341hM8591G2 = abstractC2333d.m8591G();
            if (abstractC2341hM8591G2 != null) {
                z = m48873c(abstractC2341hM8591G2, menuItem.getItemId());
            }
            return z;
        } catch (IllegalArgumentException unused) {
            String strM8775b = AbstractC2341h.f9602x.m8775b(abstractC2333d.m8589E(), menuItem.getItemId());
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring onNavDestinationSelected for MenuItem ");
            sb.append(strM8775b);
            sb.append(" as it cannot be found from the current destination ");
            sb.append(abstractC2333d.m8591G());
            return false;
        }
    }

    /* renamed from: f */
    public static final void m48876f(Toolbar toolbar, final AbstractC2333d abstractC2333d, final jj0 jj0Var) {
        sq8.m48649h(toolbar, "toolbar");
        sq8.m48649h(abstractC2333d, "navController");
        sq8.m48649h(jj0Var, "configuration");
        abstractC2333d.m8611r(new hsh(toolbar, jj0Var));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.rsb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ssb.m48878h(abstractC2333d, jj0Var, view);
            }
        });
    }

    /* renamed from: g */
    public static final void m48877g(NavigationBarView navigationBarView, final AbstractC2333d abstractC2333d) {
        sq8.m48649h(navigationBarView, "navigationBarView");
        sq8.m48649h(abstractC2333d, "navController");
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.InterfaceC11080c() { // from class: o.qsb
            @Override // com.google.android.material.navigation.NavigationBarView.InterfaceC11080c
            /* renamed from: a */
            public final boolean mo14848a(MenuItem menuItem) {
                return ssb.m48879i(abstractC2333d, menuItem);
            }
        });
        abstractC2333d.m8611r(new C16909a(new WeakReference(navigationBarView), abstractC2333d));
    }

    /* renamed from: h */
    public static final void m48878h(AbstractC2333d abstractC2333d, jj0 jj0Var, View view) {
        sq8.m48649h(abstractC2333d, "$navController");
        sq8.m48649h(jj0Var, "$configuration");
        m48874d(abstractC2333d, jj0Var);
    }

    /* renamed from: i */
    public static final boolean m48879i(AbstractC2333d abstractC2333d, MenuItem menuItem) {
        sq8.m48649h(abstractC2333d, "$navController");
        sq8.m48649h(menuItem, "item");
        return m48875e(menuItem, abstractC2333d);
    }
}
