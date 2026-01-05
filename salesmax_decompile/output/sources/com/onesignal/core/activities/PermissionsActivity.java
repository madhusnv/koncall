package com.onesignal.core.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.onesignal.OneSignal;
import com.onesignal.core.C11591R;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.permissions.impl.RequestPermissionService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.preferences.PreferenceStores;
import p001o.id5;
import p001o.mn;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PermissionsActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private String permissionRequestType;
    private IPreferencesService preferenceService;
    private RequestPermissionService requestPermissionService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    private final void handleBundleParams(Bundle bundle) throws ClassNotFoundException {
        reregisterCallbackHandlers(bundle);
        sq8.m48646e(bundle);
        this.permissionRequestType = bundle.getString(INTENT_EXTRA_PERMISSION_TYPE);
        String string = bundle.getString(INTENT_EXTRA_ANDROID_PERMISSION_STRING);
        sq8.m48646e(string);
        requestPermission(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onRequestPermissionsResult$lambda-0, reason: not valid java name */
    public static final void m68744onRequestPermissionsResult$lambda0(PermissionsActivity permissionsActivity, String[] strArr, int[] iArr) {
        sq8.m48649h(permissionsActivity, "this$0");
        sq8.m48649h(strArr, "$permissions");
        sq8.m48649h(iArr, "$grantResults");
        RequestPermissionService requestPermissionService = permissionsActivity.requestPermissionService;
        sq8.m48646e(requestPermissionService);
        String str = permissionsActivity.permissionRequestType;
        sq8.m48646e(str);
        IRequestPermissionService.PermissionCallback callback = requestPermissionService.getCallback(str);
        if (callback == null) {
            throw new RuntimeException("Missing handler for permissionRequestType: " + permissionsActivity.permissionRequestType);
        }
        if (strArr.length == 0) {
            callback.onReject(false);
            return;
        }
        String str2 = strArr[0];
        if (!(iArr.length > 0 && iArr[0] == 0)) {
            callback.onReject(permissionsActivity.shouldShowSettings(str2));
            return;
        }
        callback.onAccept();
        IPreferencesService iPreferencesService = permissionsActivity.preferenceService;
        sq8.m48646e(iPreferencesService);
        iPreferencesService.saveBool(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_USER_RESOLVED_PERMISSION_PREFIX + str2, Boolean.TRUE);
    }

    private final void requestPermission(String str) {
        RequestPermissionService requestPermissionService = this.requestPermissionService;
        sq8.m48646e(requestPermissionService);
        if (requestPermissionService.getWaiting()) {
            return;
        }
        RequestPermissionService requestPermissionService2 = this.requestPermissionService;
        sq8.m48646e(requestPermissionService2);
        requestPermissionService2.setWaiting(true);
        RequestPermissionService requestPermissionService3 = this.requestPermissionService;
        sq8.m48646e(requestPermissionService3);
        requestPermissionService3.setShouldShowRequestPermissionRationaleBeforeRequest(mn.m39371k(this, str));
        mn.m39367g(this, new String[]{str}, 2);
    }

    private final void reregisterCallbackHandlers(Bundle bundle) throws ClassNotFoundException {
        sq8.m48646e(bundle);
        String string = bundle.getString(INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    private final boolean shouldShowSettings(String str) {
        RequestPermissionService requestPermissionService = this.requestPermissionService;
        sq8.m48646e(requestPermissionService);
        if (!requestPermissionService.getFallbackToSettings()) {
            return false;
        }
        RequestPermissionService requestPermissionService2 = this.requestPermissionService;
        sq8.m48646e(requestPermissionService2);
        if (requestPermissionService2.getShouldShowRequestPermissionRationaleBeforeRequest() && !mn.m39371k(this, str)) {
            IPreferencesService iPreferencesService = this.preferenceService;
            sq8.m48646e(iPreferencesService);
            iPreferencesService.saveBool(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_USER_RESOLVED_PERMISSION_PREFIX + str, Boolean.TRUE);
            return false;
        }
        IPreferencesService iPreferencesService2 = this.preferenceService;
        sq8.m48646e(iPreferencesService2);
        Boolean bool = iPreferencesService2.getBool(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_USER_RESOLVED_PERMISSION_PREFIX + str, Boolean.FALSE);
        sq8.m48646e(bool);
        return bool.booleanValue();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws ClassNotFoundException {
        super.onCreate(bundle);
        if (OneSignal.initWithContext(this)) {
            OneSignal oneSignal = OneSignal.INSTANCE;
            this.requestPermissionService = (RequestPermissionService) oneSignal.getServices().getService(RequestPermissionService.class);
            this.preferenceService = (IPreferencesService) oneSignal.getServices().getService(IPreferencesService.class);
            handleBundleParams(getIntent().getExtras());
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) throws ClassNotFoundException {
        sq8.m48649h(intent, "intent");
        super.onNewIntent(intent);
        handleBundleParams(intent.getExtras());
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, final String[] strArr, final int[] iArr) {
        sq8.m48649h(strArr, "permissions");
        sq8.m48649h(iArr, "grantResults");
        RequestPermissionService requestPermissionService = this.requestPermissionService;
        sq8.m48646e(requestPermissionService);
        requestPermissionService.setWaiting(false);
        if (i == 2) {
            new Handler().postDelayed(new Runnable() { // from class: o.k4d
                @Override // java.lang.Runnable
                public final void run() {
                    PermissionsActivity.m68744onRequestPermissionsResult$lambda0(this.f31456a, strArr, iArr);
                }
            }, 500L);
        }
        finish();
        overridePendingTransition(C11591R.anim.onesignal_fade_in, C11591R.anim.onesignal_fade_out);
    }
}
