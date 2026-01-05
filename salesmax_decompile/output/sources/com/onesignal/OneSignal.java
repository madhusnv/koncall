package com.onesignal;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.common.services.IServiceProvider;
import com.onesignal.debug.IDebugManager;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.session.ISessionManager;
import com.onesignal.user.IUserManager;
import p001o.gi9;
import p001o.si9;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OneSignal {
    public static final OneSignal INSTANCE = new OneSignal();
    private static final gi9 oneSignal$delegate = si9.m48360a(OneSignal$oneSignal$2.INSTANCE);

    private OneSignal() {
    }

    public static final boolean getConsentGiven() {
        return INSTANCE.getOneSignal().getConsentGiven();
    }

    public static /* synthetic */ void getConsentGiven$annotations() {
    }

    public static final boolean getConsentRequired() {
        return INSTANCE.getOneSignal().getConsentRequired();
    }

    public static /* synthetic */ void getConsentRequired$annotations() {
    }

    public static final IDebugManager getDebug() {
        return INSTANCE.getOneSignal().getDebug();
    }

    public static /* synthetic */ void getDebug$annotations() {
    }

    public static final boolean getDisableGMSMissingPrompt() {
        return INSTANCE.getOneSignal().getDisableGMSMissingPrompt();
    }

    public static /* synthetic */ void getDisableGMSMissingPrompt$annotations() {
    }

    public static final IInAppMessagesManager getInAppMessages() {
        return INSTANCE.getOneSignal().getInAppMessages();
    }

    public static /* synthetic */ void getInAppMessages$annotations() {
    }

    public static final ILocationManager getLocation() {
        return INSTANCE.getOneSignal().getLocation();
    }

    public static /* synthetic */ void getLocation$annotations() {
    }

    public static final INotificationsManager getNotifications() {
        return INSTANCE.getOneSignal().getNotifications();
    }

    public static /* synthetic */ void getNotifications$annotations() {
    }

    private final IOneSignal getOneSignal() {
        return (IOneSignal) oneSignal$delegate.getValue();
    }

    public static final String getSdkVersion() {
        return INSTANCE.getOneSignal().getSdkVersion();
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static final ISessionManager getSession() {
        return INSTANCE.getOneSignal().getSession();
    }

    public static /* synthetic */ void getSession$annotations() {
    }

    public static final IUserManager getUser() {
        return INSTANCE.getOneSignal().getUser();
    }

    public static /* synthetic */ void getUser$annotations() {
    }

    public static final void initWithContext(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        INSTANCE.getOneSignal().initWithContext(context, str);
    }

    public static final boolean isInitialized() {
        return INSTANCE.getOneSignal().isInitialized();
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final void login(String str) {
        sq8.m48649h(str, "externalId");
        INSTANCE.getOneSignal().login(str);
    }

    public static /* synthetic */ void login$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        login(str, str2);
    }

    public static final void logout() {
        INSTANCE.getOneSignal().logout();
    }

    public static final void setConsentGiven(boolean z) {
        INSTANCE.getOneSignal().setConsentGiven(z);
    }

    public static final void setConsentRequired(boolean z) {
        INSTANCE.getOneSignal().setConsentRequired(z);
    }

    public static final void setDisableGMSMissingPrompt(boolean z) {
        INSTANCE.getOneSignal().setDisableGMSMissingPrompt(z);
    }

    public final /* synthetic */ <T> T getService() {
        IServiceProvider services = getServices();
        sq8.m48655n(4, "T");
        return (T) services.getService(Object.class);
    }

    public final /* synthetic */ <T> T getServiceOrNull() {
        IServiceProvider services = getServices();
        sq8.m48655n(4, "T");
        return (T) services.getServiceOrNull(Object.class);
    }

    public final IServiceProvider getServices() {
        IOneSignal oneSignal = getOneSignal();
        sq8.m48647f(oneSignal, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (IServiceProvider) oneSignal;
    }

    public static final boolean initWithContext(Context context) {
        sq8.m48649h(context, "context");
        return INSTANCE.getOneSignal().initWithContext(context, null);
    }

    public static final void login(String str, String str2) {
        sq8.m48649h(str, "externalId");
        INSTANCE.getOneSignal().login(str, str2);
    }
}
