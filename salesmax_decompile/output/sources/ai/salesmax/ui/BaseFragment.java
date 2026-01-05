package ai.salesmax.ui;

import ai.salesmax.MainActivity;
import ai.salesmax.dialog.PermissionFragment;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.ui.BaseFragment;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.AbstractC2124j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2341h;
import com.onesignal.location.internal.common.LocationConstants;
import java.util.Arrays;
import java.util.Map;
import p001o.c64;
import p001o.gp0;
import p001o.hae;
import p001o.j0f;
import p001o.j4d;
import p001o.jm7;
import p001o.ns;
import p001o.nta;
import p001o.qae;
import p001o.sq8;
import p001o.ss;
import p001o.us;
import p001o.vre;
import p001o.w7e;
import p001o.wre;
import p001o.ws;

/* loaded from: classes.dex */
public abstract class BaseFragment extends Fragment {

    /* renamed from: a */
    public InterfaceC0276a f345a;

    /* renamed from: b */
    public String[] f346b;

    /* renamed from: c */
    public ws f347c;

    /* renamed from: d */
    public boolean f348d;

    /* renamed from: e */
    public final String[] f349e = {"android.permission.READ_CONTACTS"};

    /* renamed from: f */
    public final String[] f350f = {"android.permission.CALL_PHONE"};

    /* renamed from: g */
    public final ws f351g;

    /* renamed from: ai.salesmax.ui.BaseFragment$a */
    public interface InterfaceC0276a {

        /* renamed from: ai.salesmax.ui.BaseFragment$a$a */
        public static final class a {
            /* renamed from: a */
            public static void m694a(InterfaceC0276a interfaceC0276a) {
            }
        }

        /* renamed from: c */
        void mo692c();

        /* renamed from: d */
        void mo693d();
    }

    /* renamed from: ai.salesmax.ui.BaseFragment$b */
    public static final class C0277b implements PermissionFragment.InterfaceC0080c {
        public C0277b() {
        }

        @Override // ai.salesmax.dialog.PermissionFragment.InterfaceC0080c
        /* renamed from: a */
        public void mo240a() {
        }

        @Override // ai.salesmax.dialog.PermissionFragment.InterfaceC0080c
        /* renamed from: b */
        public void mo241b() {
            BaseFragment.this.N0();
        }
    }

    /* renamed from: ai.salesmax.ui.BaseFragment$c */
    public static final class C0278c implements InterfaceC0276a {

        /* renamed from: a */
        public final /* synthetic */ String f353a;

        /* renamed from: b */
        public final /* synthetic */ BaseFragment f354b;

        /* renamed from: c */
        public final /* synthetic */ Leads f355c;

        public C0278c(String str, BaseFragment baseFragment, Leads leads) {
            this.f353a = str;
            this.f354b = baseFragment;
            this.f355c = leads;
        }

        @Override // ai.salesmax.ui.BaseFragment.InterfaceC0276a
        /* renamed from: c */
        public void mo692c() {
            InterfaceC0276a.a.m694a(this);
        }

        @Override // ai.salesmax.ui.BaseFragment.InterfaceC0276a
        /* renamed from: d */
        public void mo693d() {
            String str = this.f353a;
            FragmentActivity fragmentActivityRequireActivity = this.f354b.requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            jm7.m34050j(str, fragmentActivityRequireActivity, this.f355c);
        }
    }

    /* renamed from: ai.salesmax.ui.BaseFragment$d */
    public static final class C0279d implements PermissionFragment.InterfaceC0080c {

        /* renamed from: b */
        public final /* synthetic */ String f357b;

        /* renamed from: c */
        public final /* synthetic */ Leads f358c;

        /* renamed from: d */
        public final /* synthetic */ FragmentActivity f359d;

        public C0279d(String str, Leads leads, FragmentActivity fragmentActivity) {
            this.f357b = str;
            this.f358c = leads;
            this.f359d = fragmentActivity;
        }

        @Override // ai.salesmax.dialog.PermissionFragment.InterfaceC0080c
        /* renamed from: a */
        public void mo240a() {
            jm7.m34064x(this.f357b, this.f359d);
        }

        @Override // ai.salesmax.dialog.PermissionFragment.InterfaceC0080c
        /* renamed from: b */
        public void mo241b() {
            if (j4d.q0(BaseFragment.this.getContext())) {
                BaseFragment.this.i1("CALL");
            } else {
                BaseFragment.this.O0(this.f357b, this.f358c);
            }
        }
    }

    public BaseFragment() {
        ws wsVarRegisterForActivityResult = registerForActivityResult(new us(), new ns() { // from class: o.dc1
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                BaseFragment.V0(this.f19547a, (ActivityResult) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f351g = wsVarRegisterForActivityResult;
    }

    public static /* synthetic */ void T0(BaseFragment baseFragment, Leads leads, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: askCallPermissionRational");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        baseFragment.P0(leads, i);
    }

    public static /* synthetic */ void U0(BaseFragment baseFragment, String str, Leads leads, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: askCallPermissionRational");
        }
        if ((i & 2) != 0) {
            leads = null;
        }
        baseFragment.S0(str, leads);
    }

    public static final void V0(BaseFragment baseFragment, ActivityResult activityResult) {
        sq8.m48649h(baseFragment, "this$0");
        if (activityResult.m3726b() != -1 || baseFragment.getActivity() == null || Settings.canDrawOverlays(baseFragment.requireActivity())) {
            return;
        }
        baseFragment.M0();
    }

    public static final void c1(BaseFragment baseFragment, Map map) {
        sq8.m48649h(baseFragment, "this$0");
        if (baseFragment.getContext() != null && baseFragment.f346b != null) {
            Context contextRequireContext = baseFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            String[] strArr = baseFragment.f346b;
            sq8.m48646e(strArr);
            if (baseFragment.b1(contextRequireContext, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                String[] strArr2 = baseFragment.f346b;
                sq8.m48646e(strArr2);
                baseFragment.o1(strArr2, baseFragment.f345a);
                return;
            }
        }
        j1(baseFragment, null, 1, null);
    }

    public static /* synthetic */ void e1(BaseFragment baseFragment, AbstractC2333d abstractC2333d, int i, int i2, Bundle bundle, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: safeNavigate");
        }
        if ((i3 & 4) != 0) {
            bundle = null;
        }
        baseFragment.d1(abstractC2333d, i, i2, bundle);
    }

    public static final void f1(AbstractC2333d abstractC2333d, int i, Bundle bundle) {
        sq8.m48649h(abstractC2333d, "$this_safeNavigate");
        abstractC2333d.m8604U(i, bundle);
    }

    public static /* synthetic */ void j1(BaseFragment baseFragment, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPermissionDialog");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        baseFragment.i1(str);
    }

    public static final void k1(BaseFragment baseFragment, DialogInterface dialogInterface, int i) {
        sq8.m48649h(baseFragment, "this$0");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        FragmentActivity activity = baseFragment.getActivity();
        intent.setData(Uri.fromParts("package", activity != null ? activity.getPackageName() : null, null));
        FragmentActivity activity2 = baseFragment.getActivity();
        if (activity2 != null) {
            activity2.startActivity(intent);
        }
        InterfaceC0276a interfaceC0276a = baseFragment.f345a;
        if (interfaceC0276a != null) {
            interfaceC0276a.mo693d();
        }
    }

    public static final void l1(BaseFragment baseFragment, DialogInterface dialogInterface, int i) {
        sq8.m48649h(baseFragment, "this$0");
        InterfaceC0276a interfaceC0276a = baseFragment.f345a;
        if (interfaceC0276a != null) {
            interfaceC0276a.mo692c();
        }
    }

    public static final void m1(DialogInterface dialogInterface) {
    }

    public final void M0() {
        if (!j4d.m33221i() || getActivity() == null || getContext() == null || Settings.canDrawOverlays(requireActivity())) {
            return;
        }
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        sq8.m48648g(supportFragmentManager, "getSupportFragmentManager(...)");
        PermissionFragment.C0078a c0078a = PermissionFragment.f318f;
        int i = w7e.ic_draw_over;
        String string = getString(hae.open_draw_over_other_apps_setting);
        sq8.m48648g(string, "getString(...)");
        String string2 = getString(hae.allow_to_draw_over_app);
        sq8.m48648g(string2, "getString(...)");
        PermissionFragment permissionFragmentM239a = c0078a.m239a(i, string, string2, new C0277b());
        AbstractC2124j abstractC2124jM6205q = supportFragmentManager.m6205q();
        sq8.m48648g(abstractC2124jM6205q, "beginTransaction(...)");
        abstractC2124jM6205q.m6430w(4097);
        abstractC2124jM6205q.m6418b(R.id.content, permissionFragmentM239a).m6423g(null).mo6260h();
    }

    public final void N0() {
        this.f351g.m54945b(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:ai.salesmax")));
    }

    public final void O0(String str, Leads leads) {
        sq8.m48649h(str, "phoneNumber");
        n1(this.f350f, new C0278c(str, this, leads));
    }

    public final void P0(Leads leads, int i) {
        sq8.m48649h(leads, "lead");
        if (!(!leads.getPhoneNumbers().isEmpty()) || leads.getPhoneNumbers().size() <= i) {
            return;
        }
        String str = leads.getPhoneNumbers().get(i);
        sq8.m48648g(str, "get(...)");
        S0(str, leads);
    }

    public final void Q0(LeadsSummary leadsSummary) {
        sq8.m48649h(leadsSummary, "lead");
        if (!leadsSummary.getContactNumbers().isEmpty()) {
            S0(leadsSummary.getContactNumbers().get(0), leadsSummary.toLeads());
        }
    }

    public final void R0(LeadsUser leadsUser) {
        sq8.m48649h(leadsUser, "leadUser");
        if (leadsUser.getRegisteredNumber().length() > 0) {
            U0(this, leadsUser.getRegisteredNumber(), null, 2, null);
        }
    }

    public final void S0(String str, Leads leads) {
        sq8.m48649h(str, "phoneNumber");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        sq8.m48648g(supportFragmentManager, "getSupportFragmentManager(...)");
        PermissionFragment.C0078a c0078a = PermissionFragment.f318f;
        int i = w7e.ic_call_history;
        String string = getString(hae.phone_call);
        sq8.m48648g(string, "getString(...)");
        String string2 = getString(hae.allow_call);
        sq8.m48648g(string2, "getString(...)");
        PermissionFragment permissionFragmentM239a = c0078a.m239a(i, string, string2, new C0279d(str, leads, activity));
        AbstractC2124j abstractC2124jM6205q = supportFragmentManager.m6205q();
        sq8.m48648g(abstractC2124jM6205q, "beginTransaction(...)");
        abstractC2124jM6205q.m6430w(4097);
        abstractC2124jM6205q.m6418b(R.id.content, permissionFragmentM239a).m6423g(null).mo6260h();
    }

    public final void W0(boolean z) {
        this.f348d = z;
    }

    public final String[] X0() {
        String[] strArrM33228p = j4d.m33228p();
        sq8.m48648g(strArrM33228p, "getBasePermissionsWhichC…tedIfNotDeniedInPref(...)");
        return strArrM33228p;
    }

    public final String[] Y0() {
        return this.f350f;
    }

    public final String[] Z0() {
        return this.f349e;
    }

    public final boolean a1(String[] strArr) {
        sq8.m48649h(strArr, "neededPermission");
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        return b1(contextRequireContext, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final boolean b1(Context context, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            String str = strArr[i];
            if (!str.equals(LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING) && !str.equals(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING) && c64.checkSelfPermission(context, str) != 0) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    public final void d1(final AbstractC2333d abstractC2333d, int i, final int i2, final Bundle bundle) {
        sq8.m48649h(abstractC2333d, "<this>");
        AbstractC2341h abstractC2341hM8591G = abstractC2333d.m8591G();
        boolean z = false;
        if (abstractC2341hM8591G != null && i == abstractC2341hM8591G.m8753A()) {
            z = true;
        }
        if (z) {
            try {
                j0f.m33008i(new Runnable() { // from class: o.ec1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseFragment.f1(abstractC2333d, i2, bundle);
                    }
                });
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Navigation failed: ");
                sb.append(message);
            }
        }
    }

    public final boolean g1(AbstractC2333d abstractC2333d, int i, boolean z) {
        Object objM53351b;
        sq8.m48649h(abstractC2333d, "<this>");
        try {
            vre.C17665a c17665a = vre.f50797b;
            objM53351b = vre.m53351b(Boolean.valueOf(abstractC2333d.g0(i, z)));
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        if (vre.m53354e(objM53351b) != null) {
            objM53351b = Boolean.FALSE;
        }
        return ((Boolean) objM53351b).booleanValue();
    }

    public final boolean h1() {
        return this.f348d;
    }

    public final void i1(String str) {
        String str2 = getString(hae.allow_contact_access) + "\n\n" + getString(hae.gotoSettings);
        if (str == null) {
            String[] strArr = this.f346b;
            boolean z = false;
            if (strArr != null && gp0.m29251R(strArr, "android.permission.READ_CONTACTS")) {
                str2 = getString(hae.allow_contact_access) + "\n\n" + getString(hae.gotoSettings);
            } else {
                String[] strArr2 = this.f346b;
                if (strArr2 != null && gp0.m29251R(strArr2, "android.permission.CALL_PHONE")) {
                    str2 = getString(hae.allow_call) + "\n\n" + getString(hae.gotoSettings);
                } else {
                    String[] strArr3 = this.f346b;
                    if (strArr3 != null && gp0.m29251R(strArr3, "android.permission.READ_CALL_LOG")) {
                        z = true;
                    }
                    if (z) {
                        str2 = getString(hae.allow_call_log_access_no_notification) + "\n\n" + getString(hae.gotoSettings);
                    } else {
                        str2 = getString(hae.default_permission_dialog) + "\n\n" + getString(hae.gotoSettings);
                    }
                }
            }
        } else if (sq8.m48644c(str, "CALL")) {
            str2 = getString(hae.allow_call) + "\n\n" + getString(hae.gotoSettings);
        }
        if (getContext() != null) {
            new nta(requireContext(), qae.CustomAlertDialogTheme).mo3873f(str2).mo3878k("Settings", new DialogInterface.OnClickListener() { // from class: o.zb1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BaseFragment.k1(this.f56890a, dialogInterface, i);
                }
            }).mo3874g("Cancel", new DialogInterface.OnClickListener() { // from class: o.ac1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BaseFragment.l1(this.f14465a, dialogInterface, i);
                }
            }).mo3869b(true).mo3876i(new DialogInterface.OnCancelListener() { // from class: o.bc1
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    BaseFragment.m1(dialogInterface);
                }
            }).m3880m();
        }
    }

    public final void n1(String[] strArr, InterfaceC0276a interfaceC0276a) {
        sq8.m48649h(strArr, "neededPermission");
        this.f345a = interfaceC0276a;
        this.f346b = strArr;
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (b1(contextRequireContext, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                if (interfaceC0276a != null) {
                    interfaceC0276a.mo693d();
                    return;
                }
                return;
            }
        }
        ws wsVar = this.f347c;
        if (wsVar == null) {
            sq8.m48667z("permReqLauncher");
            wsVar = null;
        }
        wsVar.m54945b(strArr);
    }

    public final void o1(String[] strArr, InterfaceC0276a interfaceC0276a) {
        sq8.m48649h(strArr, "neededPermission");
        this.f345a = interfaceC0276a;
        this.f346b = strArr;
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (b1(contextRequireContext, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                if (interfaceC0276a != null) {
                    interfaceC0276a.mo693d();
                    return;
                }
                return;
            }
        }
        ws wsVar = this.f347c;
        if (wsVar == null) {
            sq8.m48667z("permReqLauncher");
            wsVar = null;
        }
        wsVar.m54945b(strArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ws wsVarRegisterForActivityResult = registerForActivityResult(new ss(), new ns() { // from class: o.cc1
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                BaseFragment.c1(this.f17823a, (Map) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f347c = wsVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f345a = null;
        this.f346b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48647f(fragmentActivityRequireActivity, "null cannot be cast to non-null type ai.salesmax.MainActivity");
            ((MainActivity) fragmentActivityRequireActivity).z2();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48647f(fragmentActivityRequireActivity, "null cannot be cast to non-null type ai.salesmax.MainActivity");
            ((MainActivity) fragmentActivityRequireActivity).z2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48647f(fragmentActivityRequireActivity, "null cannot be cast to non-null type ai.salesmax.MainActivity");
            ((MainActivity) fragmentActivityRequireActivity).z2();
        }
    }
}
