package ai.salesmax.dialog;

import ai.salesmax.dialog.PermissionFragment;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.dbc;
import p001o.ebc;
import p001o.gbc;
import p001o.i3d;
import p001o.id5;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class PermissionFragment extends DialogFragment {

    /* renamed from: f */
    public static final C0078a f318f = new C0078a(null);

    /* renamed from: g */
    public static final int f319g = 8;

    /* renamed from: a */
    public final int f320a;

    /* renamed from: b */
    public final String f321b;

    /* renamed from: c */
    public final String f322c;

    /* renamed from: d */
    public final InterfaceC0080c f323d;

    /* renamed from: e */
    public i3d f324e;

    /* renamed from: ai.salesmax.dialog.PermissionFragment$a */
    public static final class C0078a {
        public C0078a() {
        }

        public /* synthetic */ C0078a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final PermissionFragment m239a(int i, String str, String str2, InterfaceC0080c interfaceC0080c) {
            sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
            sq8.m48649h(str2, FirebaseAnalytics.Param.CONTENT);
            sq8.m48649h(interfaceC0080c, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            return new PermissionFragment(i, str, str2, interfaceC0080c);
        }
    }

    /* renamed from: ai.salesmax.dialog.PermissionFragment$b */
    public static final class C0079b implements InterfaceC0080c {
        @Override // ai.salesmax.dialog.PermissionFragment.InterfaceC0080c
        /* renamed from: a */
        public void mo240a() {
        }

        @Override // ai.salesmax.dialog.PermissionFragment.InterfaceC0080c
        /* renamed from: b */
        public void mo241b() {
        }
    }

    /* renamed from: ai.salesmax.dialog.PermissionFragment$c */
    public interface InterfaceC0080c {
        /* renamed from: a */
        void mo240a();

        /* renamed from: b */
        void mo241b();
    }

    /* renamed from: ai.salesmax.dialog.PermissionFragment$d */
    public static final class C0081d extends kf9 implements xk7 {
        public C0081d() {
            super(1);
        }

        /* renamed from: a */
        public final void m242a(dbc dbcVar) {
            sq8.m48649h(dbcVar, "$this$addCallback");
            PermissionFragment.this.f323d.mo240a();
            PermissionFragment.this.dismiss();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m242a((dbc) obj);
            return y3i.f54824a;
        }
    }

    public PermissionFragment(int i, String str, String str2, InterfaceC0080c interfaceC0080c) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str2, FirebaseAnalytics.Param.CONTENT);
        sq8.m48649h(interfaceC0080c, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f320a = i;
        this.f321b = str;
        this.f322c = str2;
        this.f323d = interfaceC0080c;
    }

    public static final void L0(PermissionFragment permissionFragment, View view) {
        sq8.m48649h(permissionFragment, "this$0");
        permissionFragment.f323d.mo241b();
        permissionFragment.dismiss();
    }

    public static final void M0(PermissionFragment permissionFragment, View view) {
        sq8.m48649h(permissionFragment, "this$0");
        permissionFragment.f323d.mo240a();
        permissionFragment.dismiss();
    }

    public final i3d K0() {
        i3d i3dVar = this.f324e;
        sq8.m48646e(i3dVar);
        return i3dVar;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        sq8.m48648g(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setCancelable(true);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f324e == null) {
            i3d i3dVarH0 = i3d.h0(layoutInflater, viewGroup, false);
            i3dVarH0.o0.setImageResource(this.f320a);
            i3dVarH0.t0.setText(this.f321b);
            i3dVarH0.r0.setText(this.f322c);
            ebc onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
            sq8.m48648g(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
            gbc.m28313b(onBackPressedDispatcher, getViewLifecycleOwner(), false, new C0081d(), 2, null);
            this.f324e = i3dVarH0;
        }
        View viewM25689B = K0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f324e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        K0().q0.setOnClickListener(new View.OnClickListener() { // from class: o.k3d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PermissionFragment.L0(this.f31421a, view2);
            }
        });
        K0().p0.setOnClickListener(new View.OnClickListener() { // from class: o.l3d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PermissionFragment.M0(this.f33231a, view2);
            }
        });
    }

    public PermissionFragment() {
        this(0, "", "", new C0079b());
    }
}
