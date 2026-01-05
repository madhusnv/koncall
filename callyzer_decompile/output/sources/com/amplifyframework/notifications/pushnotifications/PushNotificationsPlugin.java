package com.amplifyframework.notifications.pushnotifications;

import android.content.Context;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.category.SubCategoryType;
import com.amplifyframework.notifications.NotificationsPlugin;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class PushNotificationsPlugin<E> extends NotificationsPlugin<E> implements PushNotificationsCategoryBehavior {
    @Override // com.amplifyframework.notifications.NotificationsPlugin, com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.NOTIFICATIONS;
    }

    @Override // com.amplifyframework.notifications.NotificationsPlugin
    public SubCategoryType getSubCategoryType() {
        return SubCategoryType.PUSH_NOTIFICATIONS;
    }

    @Override // com.amplifyframework.notifications.NotificationsPlugin, com.amplifyframework.core.plugin.Plugin
    public void initialize(Context context) {
        AbstractC4154l.m8923f(context, "context");
    }
}
