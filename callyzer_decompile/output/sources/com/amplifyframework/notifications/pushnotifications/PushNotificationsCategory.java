package com.amplifyframework.notifications.pushnotifications;

import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryType;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PushNotificationsCategory extends Category<PushNotificationsPlugin<?>> implements PushNotificationsCategoryBehavior {
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return getSelectedPlugin().getCategoryType();
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void handleNotificationReceived(NotificationPayload payload, Consumer<PushNotificationResult> onSuccess, Consumer<PushNotificationsException> onError) {
        AbstractC4154l.m8923f(payload, "payload");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        getSelectedPlugin().handleNotificationReceived(payload, onSuccess, onError);
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(String userId, Action onSuccess, Consumer<PushNotificationsException> onError) {
        AbstractC4154l.m8923f(userId, "userId");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        getSelectedPlugin().identifyUser(userId, onSuccess, onError);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void recordNotificationOpened(NotificationPayload payload, Action onSuccess, Consumer<PushNotificationsException> onError) {
        AbstractC4154l.m8923f(payload, "payload");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        getSelectedPlugin().recordNotificationOpened(payload, onSuccess, onError);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void recordNotificationReceived(NotificationPayload payload, Action onSuccess, Consumer<PushNotificationsException> onError) {
        AbstractC4154l.m8923f(payload, "payload");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        getSelectedPlugin().recordNotificationReceived(payload, onSuccess, onError);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void registerDevice(String token, Action onSuccess, Consumer<PushNotificationsException> onError) {
        AbstractC4154l.m8923f(token, "token");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        getSelectedPlugin().registerDevice(token, onSuccess, onError);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public boolean shouldHandleNotification(NotificationPayload payload) {
        AbstractC4154l.m8923f(payload, "payload");
        return getSelectedPlugin().shouldHandleNotification(payload);
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(String userId, UserProfile profile, Action onSuccess, Consumer<PushNotificationsException> onError) {
        AbstractC4154l.m8923f(userId, "userId");
        AbstractC4154l.m8923f(profile, "profile");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        getSelectedPlugin().identifyUser(userId, profile, onSuccess, onError);
    }
}
