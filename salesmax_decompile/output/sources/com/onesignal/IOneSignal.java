package com.onesignal;

import android.content.Context;
import com.onesignal.debug.IDebugManager;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.session.ISessionManager;
import com.onesignal.user.IUserManager;
import p001o.sq8;

/* loaded from: classes6.dex */
public interface IOneSignal {

    public static final class DefaultImpls {
        public static void login(IOneSignal iOneSignal, String str) {
            sq8.m48649h(str, "externalId");
            iOneSignal.login(str, null);
        }

        public static /* synthetic */ void login$default(IOneSignal iOneSignal, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            iOneSignal.login(str, str2);
        }
    }

    boolean getConsentGiven();

    boolean getConsentRequired();

    IDebugManager getDebug();

    boolean getDisableGMSMissingPrompt();

    IInAppMessagesManager getInAppMessages();

    ILocationManager getLocation();

    INotificationsManager getNotifications();

    String getSdkVersion();

    ISessionManager getSession();

    IUserManager getUser();

    boolean initWithContext(Context context, String str);

    boolean isInitialized();

    void login(String str);

    void login(String str, String str2);

    void logout();

    void setConsentGiven(boolean z);

    void setConsentRequired(boolean z);

    void setDisableGMSMissingPrompt(boolean z);
}
