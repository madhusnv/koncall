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
import p001o.ch7;
import p001o.id5;
import p001o.sq8;
import p001o.u6e;

/* loaded from: classes.dex */
public final class IntroScreenOne extends Fragment {

    /* renamed from: b */
    public static final C0620a f1560b = new C0620a(null);

    /* renamed from: c */
    public static final int f1561c = 8;

    /* renamed from: a */
    public ch7 f1562a;

    /* renamed from: ai.salesmax.ui.home.IntroScreenOne$a */
    public static final class C0620a {
        public C0620a() {
        }

        public /* synthetic */ C0620a(id5 id5Var) {
            this();
        }
    }

    public final ch7 F0() {
        ch7 ch7Var = this.f1562a;
        sq8.m48646e(ch7Var);
        return ch7Var;
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
        if (this.f1562a == null) {
            this.f1562a = ch7.h0(layoutInflater, viewGroup, false);
        }
        View viewM25689B = F0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f1562a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
    }
}
