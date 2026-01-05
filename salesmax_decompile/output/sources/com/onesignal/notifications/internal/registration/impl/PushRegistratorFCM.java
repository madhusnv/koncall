package com.onesignal.notifications.internal.registration.impl;

import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.FCMConfigModel;
import com.onesignal.core.internal.device.IDeviceService;
import java.util.concurrent.ExecutionException;
import p001o.id5;
import p001o.n64;
import p001o.sh2;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PushRegistratorFCM extends PushRegistratorAbstractGoogle {
    public static final Companion Companion = new Companion(null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final IApplicationService _applicationService;
    private ConfigModelStore _configModelStore;
    private final String apiKey;
    private final String appId;
    private FirebaseApp firebaseApp;
    private final String projectId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRegistratorFCM(ConfigModelStore configModelStore, IApplicationService iApplicationService, GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt, IDeviceService iDeviceService) {
        super(iDeviceService, configModelStore, googlePlayServicesUpgradePrompt);
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(googlePlayServicesUpgradePrompt, "upgradePrompt");
        sq8.m48649h(iDeviceService, "deviceService");
        this._configModelStore = configModelStore;
        this._applicationService = iApplicationService;
        FCMConfigModel fcmParams = configModelStore.getModel().getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] bArrDecode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        sq8.m48648g(bArrDecode, "decode(FCM_DEFAULT_API_KEY_BASE64, Base64.DEFAULT)");
        String str = new String(bArrDecode, sh2.f45422b);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() throws Exception {
        FirebaseApp firebaseApp = this.firebaseApp;
        sq8.m48646e(firebaseApp);
        Task<String> token = ((FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class)).getToken();
        sq8.m48648g(token, "fcmInstance.token");
        try {
            Object objAwait = Tasks.await(token);
            sq8.m48648g(objAwait, "await(tokenTask)");
            return (String) objAwait;
        } catch (ExecutionException e) {
            Exception exception = token.getException();
            if (exception == null) {
                throw e;
            }
            throw exception;
        }
    }

    private final void initFirebaseApp(String str) {
        if (this.firebaseApp != null) {
            return;
        }
        FirebaseOptions firebaseOptionsBuild = new FirebaseOptions.Builder().setGcmSenderId(str).setApplicationId(this.appId).setApiKey(this.apiKey).setProjectId(this.projectId).build();
        sq8.m48648g(firebaseOptionsBuild, "Builder()\n              …\n                .build()");
        this.firebaseApp = FirebaseApp.initializeApp(this._applicationService.getAppContext(), firebaseOptionsBuild, FCM_APP_NAME);
    }

    @Override // com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle
    public String getProviderName() {
        return "FCM";
    }

    @Override // com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle
    public Object getToken(String str, n64 n64Var) {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    public final IApplicationService get_applicationService() {
        return this._applicationService;
    }

    public final ConfigModelStore get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(ConfigModelStore configModelStore) {
        sq8.m48649h(configModelStore, "<set-?>");
        this._configModelStore = configModelStore;
    }
}
