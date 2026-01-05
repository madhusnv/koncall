package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p001o.hme;
import p001o.kme;
import p001o.pp;

/* loaded from: classes5.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: a */
    public final pp f11217a;

    /* renamed from: b */
    public final kme f11218b;

    /* renamed from: c */
    public final Set f11219c;

    /* renamed from: d */
    public SupportRequestManagerFragment f11220d;

    /* renamed from: e */
    public hme f11221e;

    /* renamed from: f */
    public Fragment f11222f;

    /* renamed from: com.bumptech.glide.manager.SupportRequestManagerFragment$a */
    public class C10735a implements kme {
        public C10735a() {
        }

        @Override // p001o.kme
        /* renamed from: a */
        public Set mo12711a() {
            Set<SupportRequestManagerFragment> setG0 = SupportRequestManagerFragment.this.G0();
            HashSet hashSet = new HashSet(setG0.size());
            for (SupportRequestManagerFragment supportRequestManagerFragment : setG0) {
                if (supportRequestManagerFragment.J0() != null) {
                    hashSet.add(supportRequestManagerFragment.J0());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        this(new pp());
    }

    public static FragmentManager L0(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    public final void F0(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f11219c.add(supportRequestManagerFragment);
    }

    public Set G0() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f11220d;
        if (supportRequestManagerFragment == null) {
            return Collections.emptySet();
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.f11219c);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment supportRequestManagerFragment2 : this.f11220d.G0()) {
            if (M0(supportRequestManagerFragment2.I0())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public pp H0() {
        return this.f11217a;
    }

    public final Fragment I0() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f11222f;
    }

    public hme J0() {
        return this.f11221e;
    }

    public kme K0() {
        return this.f11218b;
    }

    public final boolean M0(Fragment fragment) {
        Fragment fragmentI0 = I0();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentI0)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    public final void N0(Context context, FragmentManager fragmentManager) {
        R0();
        SupportRequestManagerFragment supportRequestManagerFragmentM34100k = ComponentCallbacks2C10724a.m12647c(context).m12661k().m34100k(fragmentManager);
        this.f11220d = supportRequestManagerFragmentM34100k;
        if (equals(supportRequestManagerFragmentM34100k)) {
            return;
        }
        this.f11220d.F0(this);
    }

    public final void O0(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f11219c.remove(supportRequestManagerFragment);
    }

    public void P0(Fragment fragment) {
        FragmentManager fragmentManagerL0;
        this.f11222f = fragment;
        if (fragment == null || fragment.getContext() == null || (fragmentManagerL0 = L0(fragment)) == null) {
            return;
        }
        N0(fragment.getContext(), fragmentManagerL0);
    }

    public void Q0(hme hmeVar) {
        this.f11221e = hmeVar;
    }

    public final void R0() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f11220d;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.O0(this);
            this.f11220d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager fragmentManagerL0 = L0(this);
        if (fragmentManagerL0 == null) {
            return;
        }
        try {
            N0(getContext(), fragmentManagerL0);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f11217a.m43996c();
        R0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f11222f = null;
        R0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f11217a.m43997d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f11217a.m43998e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + I0() + "}";
    }

    public SupportRequestManagerFragment(pp ppVar) {
        this.f11218b = new C10735a();
        this.f11219c = new HashSet();
        this.f11217a = ppVar;
    }
}
