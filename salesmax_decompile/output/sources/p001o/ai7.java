package p001o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ai7 extends FragmentManager.AbstractC2104k {

    /* renamed from: a */
    public final HashMap f14795a;

    /* renamed from: b */
    public boolean f14796b;

    /* renamed from: c */
    public final jf7 f14797c;

    /* renamed from: d */
    public final tja f14798d;

    public ai7(jf7 jf7Var, tja tjaVar) {
        sq8.m48649h(jf7Var, "formatter");
        sq8.m48649h(tjaVar, "logger");
        this.f14797c = jf7Var;
        this.f14798d = tjaVar;
        this.f14795a = new HashMap();
        this.f14796b = true;
    }

    /* renamed from: a */
    public final void m17144a(Fragment fragment, FragmentManager fragmentManager) {
        Bundle bundle = (Bundle) this.f14795a.remove(fragment);
        if (bundle != null) {
            try {
                this.f14798d.mo40676b(this.f14797c.mo21057a(fragmentManager, fragment, bundle));
            } catch (RuntimeException e) {
                this.f14798d.mo40675a(e);
            }
        }
    }

    /* renamed from: b */
    public final void m17145b() {
        this.f14796b = true;
    }

    /* renamed from: c */
    public final void m17146c() {
        this.f14796b = false;
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC2104k
    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        sq8.m48649h(fragmentManager, "fm");
        sq8.m48649h(fragment, "f");
        m17144a(fragment, fragmentManager);
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC2104k
    public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        sq8.m48649h(fragmentManager, "fm");
        sq8.m48649h(fragment, "f");
        sq8.m48649h(bundle, "outState");
        if (this.f14796b) {
            this.f14795a.put(fragment, bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC2104k
    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        sq8.m48649h(fragmentManager, "fm");
        sq8.m48649h(fragment, "f");
        m17144a(fragment, fragmentManager);
    }
}
