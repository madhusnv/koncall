package com.onesignal.notifications.internal.registration.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.notifications.internal.registration.impl.GooglePlayServicesUpgradePrompt;
import org.apache.http.protocol.HTTP;
import p001o.eu5;
import p001o.h84;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.pm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class GooglePlayServicesUpgradePrompt {
    public static final Companion Companion = new Companion(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.registration.impl.GooglePlayServicesUpgradePrompt$showUpdateGPSDialog$2", m36648f = "GooglePlayServicesUpgradePrompt.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.registration.impl.GooglePlayServicesUpgradePrompt$showUpdateGPSDialog$2 */
    public static final class C118042 extends jgg implements nl7 {
        int label;

        public C118042(n64 n64Var) {
            super(2, n64Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-1, reason: not valid java name */
        public static final void m68780invokeSuspend$lambda1(GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt, DialogInterface dialogInterface, int i) {
            googlePlayServicesUpgradePrompt._configModelStore.getModel().setUserRejectedGMSUpdate(true);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return GooglePlayServicesUpgradePrompt.this.new C118042(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            final Activity current = GooglePlayServicesUpgradePrompt.this._applicationService.getCurrent();
            if (current == null) {
                return y3i.f54824a;
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            String resourceString = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String resourceString2 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_update", "Update");
            String resourceString3 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_skip", "Skip");
            String resourceString4 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_close", HTTP.CONN_CLOSE);
            AlertDialog.Builder message = new AlertDialog.Builder(current).setMessage(resourceString);
            final GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt = GooglePlayServicesUpgradePrompt.this;
            AlertDialog.Builder positiveButton = message.setPositiveButton(resourceString2, new DialogInterface.OnClickListener() { // from class: com.onesignal.notifications.internal.registration.impl.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) throws PendingIntent.CanceledException {
                    GooglePlayServicesUpgradePrompt.access$openPlayStoreToApp(googlePlayServicesUpgradePrompt, current);
                }
            });
            final GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt2 = GooglePlayServicesUpgradePrompt.this;
            positiveButton.setNegativeButton(resourceString3, new DialogInterface.OnClickListener() { // from class: com.onesignal.notifications.internal.registration.impl.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    GooglePlayServicesUpgradePrompt.C118042.m68780invokeSuspend$lambda1(googlePlayServicesUpgradePrompt2, dialogInterface, i);
                }
            }).setNeutralButton(resourceString4, (DialogInterface.OnClickListener) null).create().show();
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118042) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public GooglePlayServicesUpgradePrompt(IApplicationService iApplicationService, IDeviceService iDeviceService, ConfigModelStore configModelStore) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iDeviceService, "_deviceService");
        sq8.m48649h(configModelStore, "_configModelStore");
        this._applicationService = iApplicationService;
        this._deviceService = iDeviceService;
        this._configModelStore = configModelStore;
    }

    public static final /* synthetic */ void access$openPlayStoreToApp(GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt, Activity activity) throws PendingIntent.CanceledException {
        googlePlayServicesUpgradePrompt.openPlayStoreToApp(activity);
    }

    private final boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager packageManager = this._applicationService.getAppContext().getPackageManager();
            sq8.m48647f(packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager), "null cannot be cast to non-null type kotlin.String");
            return !sq8.m48644c((String) r0, "Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) throws PendingIntent.CanceledException {
        try {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            sq8.m48648g(googleApiAvailability, "getInstance()");
            PendingIntent errorResolutionPendingIntent = googleApiAvailability.getErrorResolutionPendingIntent(activity, googleApiAvailability.isGooglePlayServicesAvailable(this._applicationService.getAppContext()), PLAY_SERVICES_RESOLUTION_REQUEST);
            if (errorResolutionPendingIntent != null) {
                errorResolutionPendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e) {
            e.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(n64 n64Var) {
        if (!this._deviceService.isAndroidDeviceType()) {
            return y3i.f54824a;
        }
        if (!isGooglePlayStoreInstalled() || this._configModelStore.getModel().getDisableGMSMissingPrompt() || this._configModelStore.getModel().getUserRejectedGMSUpdate()) {
            return y3i.f54824a;
        }
        Object objM43867g = pm1.m43867g(eu5.m25612c(), new C118042(null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }
}
