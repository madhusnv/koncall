package com.onesignal.notifications.services;

import android.content.Context;
import android.os.Bundle;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.bridges.OneSignalHmsEventBridge;
import org.json.JSONException;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class HmsMessageServiceOneSignal extends HmsMessageService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(RemoteMessage remoteMessage) throws JSONException {
        sq8.m48649h(remoteMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        OneSignalHmsEventBridge.INSTANCE.onMessageReceived((Context) this, remoteMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String str, Bundle bundle) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        sq8.m48649h(bundle, "bundle");
        Logging.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:" + str, null, 2, null);
        OneSignalHmsEventBridge.INSTANCE.onNewToken((Context) this, str, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String str) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        Logging.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:" + str, null, 2, null);
        OneSignalHmsEventBridge.INSTANCE.onNewToken((Context) this, str);
    }
}
