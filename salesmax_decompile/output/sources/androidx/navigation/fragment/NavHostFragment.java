package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2348o;
import androidx.navigation.C2349p;
import androidx.navigation.fragment.NavHostFragment;
import p001o.cs5;
import p001o.d8e;
import p001o.f1f;
import p001o.fsb;
import p001o.gi9;
import p001o.id5;
import p001o.in1;
import p001o.kf9;
import p001o.kxi;
import p001o.sae;
import p001o.si9;
import p001o.sq8;
import p001o.uae;
import p001o.uk7;
import p001o.vyh;
import p001o.y3i;
import p001o.zrb;

/* loaded from: classes2.dex */
public class NavHostFragment extends Fragment {

    /* renamed from: e */
    public static final C2336a f9562e = new C2336a(null);

    /* renamed from: a */
    public final gi9 f9563a = si9.m48360a(new C2337b());

    /* renamed from: b */
    public View f9564b;

    /* renamed from: c */
    public int f9565c;

    /* renamed from: d */
    public boolean f9566d;

    /* renamed from: androidx.navigation.fragment.NavHostFragment$a */
    public static final class C2336a {
        public C2336a() {
        }

        public /* synthetic */ C2336a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final AbstractC2333d m8699a(Fragment fragment) {
            Dialog dialog;
            Window window;
            sq8.m48649h(fragment, "fragment");
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).K0();
                }
                Fragment fragmentG0 = parentFragment.getParentFragmentManager().G0();
                if (fragmentG0 instanceof NavHostFragment) {
                    return ((NavHostFragment) fragmentG0).K0();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return fsb.m27448c(view);
            }
            View decorView = null;
            DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
            if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return fsb.m27448c(decorView);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }
    }

    /* renamed from: androidx.navigation.fragment.NavHostFragment$b */
    public static final class C2337b extends kf9 implements uk7 {
        public C2337b() {
            super(0);
        }

        /* renamed from: d */
        public static final Bundle m8702d(zrb zrbVar) {
            sq8.m48649h(zrbVar, "$this_apply");
            Bundle bundleW0 = zrbVar.w0();
            if (bundleW0 != null) {
                return bundleW0;
            }
            Bundle bundle = Bundle.EMPTY;
            sq8.m48648g(bundle, "EMPTY");
            return bundle;
        }

        /* renamed from: e */
        public static final Bundle m8703e(NavHostFragment navHostFragment) {
            sq8.m48649h(navHostFragment, "this$0");
            if (navHostFragment.f9565c != 0) {
                return in1.m32435b(vyh.m53620a("android-support-nav:fragment:graphId", Integer.valueOf(navHostFragment.f9565c)));
            }
            Bundle bundle = Bundle.EMPTY;
            sq8.m48648g(bundle, "{\n                    Bu…e.EMPTY\n                }");
            return bundle;
        }

        @Override // p001o.uk7
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final zrb invoke() throws Resources.NotFoundException {
            Context context = NavHostFragment.this.getContext();
            if (context == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
            }
            sq8.m48648g(context, "checkNotNull(context) {\n…s attached\"\n            }");
            final zrb zrbVar = new zrb(context);
            final NavHostFragment navHostFragment = NavHostFragment.this;
            zrbVar.A0(navHostFragment);
            kxi viewModelStore = navHostFragment.getViewModelStore();
            sq8.m48648g(viewModelStore, "viewModelStore");
            zrbVar.B0(viewModelStore);
            navHostFragment.M0(zrbVar);
            Bundle bundleM25941b = navHostFragment.getSavedStateRegistry().m25941b("android-support-nav:fragment:navControllerState");
            if (bundleM25941b != null) {
                zrbVar.u0(bundleM25941b);
            }
            navHostFragment.getSavedStateRegistry().m25946h("android-support-nav:fragment:navControllerState", new f1f.InterfaceC13312c() { // from class: o.asb
                @Override // p001o.f1f.InterfaceC13312c
                /* renamed from: a */
                public final Bundle mo3785a() {
                    return NavHostFragment.C2337b.m8702d(zrbVar);
                }
            });
            Bundle bundleM25941b2 = navHostFragment.getSavedStateRegistry().m25941b("android-support-nav:fragment:graphId");
            if (bundleM25941b2 != null) {
                navHostFragment.f9565c = bundleM25941b2.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.getSavedStateRegistry().m25946h("android-support-nav:fragment:graphId", new f1f.InterfaceC13312c() { // from class: o.bsb
                @Override // p001o.f1f.InterfaceC13312c
                /* renamed from: a */
                public final Bundle mo3785a() {
                    return NavHostFragment.C2337b.m8703e(navHostFragment);
                }
            });
            if (navHostFragment.f9565c != 0) {
                zrbVar.x0(navHostFragment.f9565c);
            } else {
                Bundle arguments = navHostFragment.getArguments();
                int i = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                if (i != 0) {
                    zrbVar.y0(i, bundle);
                }
            }
            return zrbVar;
        }
    }

    public AbstractC2348o H0() {
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        sq8.m48648g(childFragmentManager, "childFragmentManager");
        return new C2339b(contextRequireContext, childFragmentManager, I0());
    }

    public final int I0() {
        int id = getId();
        return (id == 0 || id == -1) ? d8e.nav_host_fragment_container : id;
    }

    public final AbstractC2333d J0() {
        return K0();
    }

    public final zrb K0() {
        return (zrb) this.f9563a.getValue();
    }

    public void L0(AbstractC2333d abstractC2333d) {
        sq8.m48649h(abstractC2333d, "navController");
        C2349p c2349pM8596L = abstractC2333d.m8596L();
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        sq8.m48648g(childFragmentManager, "childFragmentManager");
        c2349pM8596L.m8954b(new cs5(contextRequireContext, childFragmentManager));
        abstractC2333d.m8596L().m8954b(H0());
    }

    public void M0(zrb zrbVar) {
        sq8.m48649h(zrbVar, "navHostController");
        L0(zrbVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        sq8.m48649h(context, "context");
        super.onAttach(context);
        if (this.f9566d) {
            getParentFragmentManager().m6205q().mo6268u(this).mo6260h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        K0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f9566d = true;
            getParentFragmentManager().m6205q().mo6268u(this).mo6260h();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        sq8.m48648g(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(I0());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f9564b;
        if (view != null && fsb.m27448c(view) == K0()) {
            fsb.m27449f(view, null);
        }
        this.f9564b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sae.NavHost);
        sq8.m48648g(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(sae.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f9565c = resourceId;
        }
        y3i y3iVar = y3i.f54824a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, uae.NavHostFragment);
        sq8.m48648g(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(uae.NavHostFragment_defaultNavHost, false)) {
            this.f9566d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        sq8.m48649h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.f9566d) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        fsb.m27449f(view, K0());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            sq8.m48647f(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f9564b = view2;
            sq8.m48646e(view2);
            if (view2.getId() == getId()) {
                View view3 = this.f9564b;
                sq8.m48646e(view3);
                fsb.m27449f(view3, K0());
            }
        }
    }
}
