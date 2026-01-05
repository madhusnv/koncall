package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C10773c;
import com.facebook.internal.DialogC10789a;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.WebDialog;
import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.Arrays;
import p001o.cri;
import p001o.h8g;
import p001o.id5;
import p001o.sq8;
import p001o.srb;
import p001o.ur6;

/* loaded from: classes5.dex */
public final class FacebookDialogFragment extends DialogFragment {

    /* renamed from: b */
    public static final C10781a f11463b = new C10781a(null);

    /* renamed from: a */
    public Dialog f11464a;

    /* renamed from: com.facebook.internal.FacebookDialogFragment$a */
    public static final class C10781a {
        public C10781a() {
        }

        public /* synthetic */ C10781a(id5 id5Var) {
            this();
        }
    }

    public static final void K0(FacebookDialogFragment facebookDialogFragment, Bundle bundle, ur6 ur6Var) {
        sq8.m48649h(facebookDialogFragment, "this$0");
        facebookDialogFragment.M0(bundle, ur6Var);
    }

    public static final void L0(FacebookDialogFragment facebookDialogFragment, Bundle bundle, ur6 ur6Var) {
        sq8.m48649h(facebookDialogFragment, "this$0");
        facebookDialogFragment.N0(bundle);
    }

    public final void J0() throws PackageManager.NameNotFoundException {
        FragmentActivity activity;
        WebDialog webDialogM13150a;
        if (this.f11464a == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            sq8.m48648g(intent, "intent");
            Bundle bundleM48792v = srb.m48792v(intent);
            if (bundleM48792v != null ? bundleM48792v.getBoolean("is_fallback", false) : false) {
                String string = bundleM48792v != null ? bundleM48792v.getString(ImagesContract.URL) : null;
                if (cri.d0(string)) {
                    cri.k0("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                h8g h8gVar = h8g.f26398a;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{C10773c.m13020m()}, 1));
                sq8.m48648g(str, "format(format, *args)");
                DialogC10789a.a aVar = DialogC10789a.f11495X;
                sq8.m48647f(string, "null cannot be cast to non-null type kotlin.String");
                webDialogM13150a = aVar.m13150a(activity, string, str);
                webDialogM13150a.m13119B(new WebDialog.InterfaceC10786d() { // from class: o.sr6
                    @Override // com.facebook.internal.WebDialog.InterfaceC10786d
                    /* renamed from: a */
                    public final void mo13143a(Bundle bundle, ur6 ur6Var) {
                        FacebookDialogFragment.L0(this.f45830a, bundle, ur6Var);
                    }
                });
            } else {
                String string2 = bundleM48792v != null ? bundleM48792v.getString("action") : null;
                Bundle bundle = bundleM48792v != null ? bundleM48792v.getBundle(OutcomeEventsTable.COLUMN_NAME_PARAMS) : null;
                if (cri.d0(string2)) {
                    cri.k0("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    sq8.m48647f(string2, "null cannot be cast to non-null type kotlin.String");
                    webDialogM13150a = new WebDialog.C10783a(activity, string2, bundle).m13137h(new WebDialog.InterfaceC10786d() { // from class: o.rr6
                        @Override // com.facebook.internal.WebDialog.InterfaceC10786d
                        /* renamed from: a */
                        public final void mo13143a(Bundle bundle2, ur6 ur6Var) {
                            FacebookDialogFragment.K0(this.f43985a, bundle2, ur6Var);
                        }
                    }).mo13130a();
                }
            }
            this.f11464a = webDialogM13150a;
        }
    }

    public final void M0(Bundle bundle, ur6 ur6Var) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = activity.getIntent();
        sq8.m48648g(intent, "fragmentActivity.intent");
        activity.setResult(ur6Var == null ? -1 : 0, srb.m48785m(intent, bundle, ur6Var));
        activity.finish();
    }

    public final void N0(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public final void O0(Dialog dialog) {
        this.f11464a = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        sq8.m48649h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.f11464a instanceof WebDialog) && isResumed()) {
            Dialog dialog = this.f11464a;
            sq8.m48647f(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((WebDialog) dialog).m13127x();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        super.onCreate(bundle);
        J0();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f11464a;
        if (dialog != null) {
            sq8.m48647f(dialog, "null cannot be cast to non-null type android.app.Dialog");
            return dialog;
        }
        M0(null, null);
        setShowsDialog(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        sq8.m48648g(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.f11464a;
        if (dialog instanceof WebDialog) {
            sq8.m48647f(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((WebDialog) dialog).m13127x();
        }
    }
}
