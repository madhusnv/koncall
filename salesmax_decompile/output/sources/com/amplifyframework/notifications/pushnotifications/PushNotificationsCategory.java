package com.amplifyframework.notifications.pushnotifications;

import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryType;
import com.google.android.gms.common.Scopes;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class PushNotificationsCategory extends Category<PushNotificationsPlugin<?>> implements PushNotificationsCategoryBehavior {
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return getSelectedPlugin().getCategoryType();
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void handleNotificationReceived(NotificationPayload notificationPayload, Consumer<PushNotificationResult> consumer, Consumer<PushNotificationsException> consumer2) {
        sq8.m48649h(notificationPayload, "payload");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        getSelectedPlugin().handleNotificationReceived(notificationPayload, consumer, consumer2);
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(String str, Action action, Consumer<PushNotificationsException> consumer) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        getSelectedPlugin().identifyUser(str, action, consumer);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void recordNotificationOpened(NotificationPayload notificationPayload, Action action, Consumer<PushNotificationsException> consumer) {
        sq8.m48649h(notificationPayload, "payload");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        getSelectedPlugin().recordNotificationOpened(notificationPayload, action, consumer);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void recordNotificationReceived(NotificationPayload notificationPayload, Action action, Consumer<PushNotificationsException> consumer) {
        sq8.m48649h(notificationPayload, "payload");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        getSelectedPlugin().recordNotificationReceived(notificationPayload, action, consumer);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void registerDevice(String str, Action action, Consumer<PushNotificationsException> consumer) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        getSelectedPlugin().registerDevice(str, action, consumer);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public boolean shouldHandleNotification(NotificationPayload notificationPayload) {
        sq8.m48649h(notificationPayload, "payload");
        return getSelectedPlugin().shouldHandleNotification(notificationPayload);
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(String str, UserProfile userProfile, Action action, Consumer<PushNotificationsException> consumer) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(userProfile, Scopes.PROFILE);
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        getSelectedPlugin().identifyUser(str, userProfile, action, consumer);
    }
}
