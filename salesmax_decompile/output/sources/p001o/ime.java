package p001o;

import android.app.Activity;
import android.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class ime extends Fragment {

    /* renamed from: a */
    public final pp f28916a;

    /* renamed from: b */
    public final kme f28917b;

    /* renamed from: c */
    public final Set f28918c;

    /* renamed from: d */
    public hme f28919d;

    /* renamed from: e */
    public ime f28920e;

    /* renamed from: f */
    public Fragment f28921f;

    /* renamed from: o.ime$a */
    public class C14326a implements kme {
        public C14326a() {
        }

        @Override // p001o.kme
        /* renamed from: a */
        public Set mo12711a() {
            Set<ime> setM32402b = ime.this.m32402b();
            HashSet hashSet = new HashSet(setM32402b.size());
            for (ime imeVar : setM32402b) {
                if (imeVar.m32405e() != null) {
                    hashSet.add(imeVar.m32405e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + ime.this + "}";
        }
    }

    public ime() {
        this(new pp());
    }

    /* renamed from: a */
    public final void m32401a(ime imeVar) {
        this.f28918c.add(imeVar);
    }

    /* renamed from: b */
    public Set m32402b() {
        if (equals(this.f28920e)) {
            return Collections.unmodifiableSet(this.f28918c);
        }
        if (this.f28920e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (ime imeVar : this.f28920e.m32402b()) {
            if (m32407g(imeVar.getParentFragment())) {
                hashSet.add(imeVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: c */
    public pp m32403c() {
        return this.f28916a;
    }

    /* renamed from: d */
    public final Fragment m32404d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f28921f;
    }

    /* renamed from: e */
    public hme m32405e() {
        return this.f28919d;
    }

    /* renamed from: f */
    public kme m32406f() {
        return this.f28917b;
    }

    /* renamed from: g */
    public final boolean m32407g(Fragment fragment) {
        getParentFragment();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.resolveTypeBinding() != null) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    public final void m32408h(Activity activity) {
        m32412l();
        ime imeVarM34098i = ComponentCallbacks2C10724a.m12647c(activity).m12661k().m34098i(activity);
        this.f28920e = imeVarM34098i;
        if (equals(imeVarM34098i)) {
            return;
        }
        this.f28920e.m32401a(this);
    }

    /* renamed from: i */
    public final void m32409i(ime imeVar) {
        this.f28918c.remove(imeVar);
    }

    /* renamed from: j */
    public void m32410j(Fragment fragment) {
        this.f28921f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m32408h(fragment.getActivity());
    }

    /* renamed from: k */
    public void m32411k(hme hmeVar) {
        this.f28919d = hmeVar;
    }

    /* renamed from: l */
    public final void m32412l() {
        ime imeVar = this.f28920e;
        if (imeVar != null) {
            imeVar.m32409i(this);
            this.f28920e = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m32408h(activity);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f28916a.m43996c();
        m32412l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m32412l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f28916a.m43997d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f28916a.m43998e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return ((String) super/*org.eclipse.jdt.core.dom.MethodDeclaration*/.getReturnType2()) + "{parent=" + m32404d() + "}";
    }

    public ime(pp ppVar) {
        this.f28917b = new C14326a();
        this.f28918c = new HashSet();
        this.f28916a = ppVar;
    }
}
