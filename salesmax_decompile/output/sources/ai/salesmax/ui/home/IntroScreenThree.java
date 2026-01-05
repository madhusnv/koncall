package ai.salesmax.ui.home;

import ai.salesmax.MainActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.core.model.ModelIdentifier;
import p001o.c64;
import p001o.eh7;
import p001o.id5;
import p001o.sq8;
import p001o.u6e;

/* loaded from: classes.dex */
public final class IntroScreenThree extends Fragment {

    /* renamed from: b */
    public static final C0621a f1563b = new C0621a(null);

    /* renamed from: c */
    public static final int f1564c = 8;

    /* renamed from: a */
    public eh7 f1565a;

    /* renamed from: ai.salesmax.ui.home.IntroScreenThree$a */
    public static final class C0621a {
        public C0621a() {
        }

        public /* synthetic */ C0621a(id5 id5Var) {
            this();
        }
    }

    public final eh7 F0() {
        eh7 eh7Var = this.f1565a;
        sq8.m48646e(eh7Var);
        return eh7Var;
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
        if (this.f1565a == null) {
            this.f1565a = eh7.h0(layoutInflater, viewGroup, false);
        }
        View viewM25689B = F0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f1565a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
    }
}
