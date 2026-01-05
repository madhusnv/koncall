package ai.salesmax.ui.home;

import ai.salesmax.MainActivity;
import ai.salesmax.ui.home.IntroScreens;
import ai.salesmax.ui.landing.LoginOrSignupFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.core.model.ModelIdentifier;
import com.androidpoet.materialintro.MaterialIntroFragment;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.c64;
import p001o.id5;
import p001o.kf9;
import p001o.sq8;
import p001o.u6e;
import p001o.wq8;
import p001o.xk7;
import p001o.xq8;
import p001o.y3i;

/* loaded from: classes.dex */
public final class IntroScreens extends Fragment {

    /* renamed from: c */
    public static final C0622a f1566c = new C0622a(null);

    /* renamed from: d */
    public static final int f1567d = 8;

    /* renamed from: a */
    public xq8 f1568a;

    /* renamed from: b */
    public List f1569b = new ArrayList();

    /* renamed from: ai.salesmax.ui.home.IntroScreens$a */
    public static final class C0622a {
        public C0622a() {
        }

        public /* synthetic */ C0622a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: ai.salesmax.ui.home.IntroScreens$b */
    public static final class C0623b extends kf9 implements xk7 {
        public C0623b() {
            super(1);
        }

        /* renamed from: a */
        public final void m1409a(int i) {
            IntroScreens.this.J0().p0.setEnabled(i < IntroScreens.this.f1569b.size() - 1);
            IntroScreens.this.J0().n0.setEnabled(i > 0);
            TabLayout tabLayout = IntroScreens.this.J0().q0;
            tabLayout.m15227L(tabLayout.m15217B(i));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1409a(((Number) obj).intValue());
            return y3i.f54824a;
        }
    }

    public static final void K0(IntroScreens introScreens, View view) {
        sq8.m48649h(introScreens, "this$0");
        introScreens.J0().o0.m12634e();
    }

    public static final void L0(IntroScreens introScreens, View view) {
        sq8.m48649h(introScreens, "this$0");
        introScreens.J0().o0.m12635f();
    }

    public final xq8 J0() {
        xq8 xq8Var = this.f1568a;
        sq8.m48646e(xq8Var);
        return xq8Var;
    }

    public final void M0() {
        for (Fragment fragment : this.f1569b) {
            J0().q0.m15238i(J0().q0.m15220E());
        }
        ArrayList<View> touchables = J0().q0.getTouchables();
        sq8.m48648g(touchables, "getTouchables(...)");
        Iterator<T> it = touchables.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        String hexString = Integer.toHexString(c64.getColor(requireContext(), u6e.superfone_white));
        sq8.m48648g(hexString, "toHexString(...)");
        String strSubstring = hexString.substring(2);
        sq8.m48648g(strSubstring, "substring(...)");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        sq8.m48647f(fragmentActivityRequireActivity, "null cannot be cast to non-null type ai.salesmax.MainActivity");
        ((MainActivity) fragmentActivityRequireActivity).s3(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strSubstring);
        if (this.f1568a == null) {
            this.f1568a = xq8.h0(layoutInflater, viewGroup, false);
        }
        View viewM25689B = J0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f1568a != null) {
            J0().o0.removeAllViews();
        }
        this.f1568a = null;
        this.f1569b = new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        this.f1569b.add(new IntroScreenOne());
        this.f1569b.add(new IntroScreenThree());
        this.f1569b.add(new LoginOrSignupFragment());
        MaterialIntroFragment materialIntroFragment = J0().o0;
        materialIntroFragment.setFragmentsList(this.f1569b);
        materialIntroFragment.setEnterAnimation(wq8.SharedAxisXForward);
        materialIntroFragment.setEnterDuration(500L);
        materialIntroFragment.setExitDuration(500L);
        M0();
        J0().o0.setOnIndexChangeListener(new C0623b());
        J0().p0.setOnClickListener(new View.OnClickListener() { // from class: o.zq8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IntroScreens.K0(this.f57513a, view2);
            }
        });
        J0().n0.setOnClickListener(new View.OnClickListener() { // from class: o.ar8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IntroScreens.L0(this.f15157a, view2);
            }
        });
    }
}
