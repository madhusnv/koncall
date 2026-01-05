package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0222a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0336a;
import androidx.fragment.app.j0;
import androidx.fragment.app.j1;
import androidx.fragment.app.s0;
import aw.C0465e;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import l7.a0;
import l7.q0;
import og.nd;
import p7.AbstractC5839j;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class NavHostFragment extends j0 {

    /* renamed from: a */
    public final C6366p f2771a = nd.m10782c(new C0465e(28, this));

    /* renamed from: b */
    public View f2772b;

    /* renamed from: c */
    public int f2773c;

    /* renamed from: d */
    public boolean f2774d;

    @Override // androidx.fragment.app.j0
    public final void onAttach(Context context) {
        AbstractC4154l.m8923f(context, "context");
        super.onAttach(context);
        if (this.f2774d) {
            j1 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C0336a c0336a = new C0336a(parentFragmentManager);
            c0336a.m1094i(this);
            c0336a.m1090e();
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onCreate(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f2774d = true;
            j1 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C0336a c0336a = new C0336a(parentFragmentManager);
            c0336a.m1094i(this);
            c0336a.m1090e();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.j0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC4154l.m8923f(inflater, "inflater");
        Context context = inflater.getContext();
        AbstractC4154l.m8922e(context, "getContext(...)");
        s0 s0Var = new s0(context);
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            id2 = R.id.nav_host_fragment_container;
        }
        s0Var.setId(id2);
        return s0Var;
    }

    @Override // androidx.fragment.app.j0
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f2772b;
        if (view != null && AbstractC0222a.m549b(view) == ((a0) this.f2771a.getValue())) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f2772b = null;
    }

    @Override // androidx.fragment.app.j0
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, q0.f22099b);
        AbstractC4154l.m8922e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f2773c = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, AbstractC5839j.f28543c);
        AbstractC4154l.m8922e(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f2774d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.j0
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC4154l.m8923f(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f2774d) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC4154l.m8923f(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        C6366p c6366p = this.f2771a;
        view.setTag(R.id.nav_controller_view_tag, (a0) c6366p.getValue());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            AbstractC4154l.m8921d(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f2772b = view2;
            if (view2.getId() == getId()) {
                View view3 = this.f2772b;
                AbstractC4154l.m8920c(view3);
                view3.setTag(R.id.nav_controller_view_tag, (a0) c6366p.getValue());
            }
        }
    }
}
