package com.amplifyframework.notifications;

import android.content.Context;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryConfiguration;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.category.EmptyCategoryConfiguration;
import com.amplifyframework.core.category.SubCategoryType;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsCategory;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsException;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsPlugin;
import com.google.android.gms.common.Scopes;
import java.util.Iterator;
import java.util.Set;
import p001o.sq8;

/* loaded from: classes5.dex */
public class NotificationsCategory extends Category<NotificationsPlugin<?>> implements NotificationsCategoryBehavior {
    public PushNotificationsCategory Push = new PushNotificationsCategory();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubCategoryType.values().length];
            try {
                iArr[SubCategoryType.PUSH_NOTIFICATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getPush$annotations() {
    }

    @Override // com.amplifyframework.core.category.Category
    public void configure(CategoryConfiguration categoryConfiguration, Context context) throws AmplifyException {
        sq8.m48649h(categoryConfiguration, "configuration");
        sq8.m48649h(context, "context");
        Set<NotificationsPlugin<?>> plugins = getPlugins();
        sq8.m48648g(plugins, "getPlugins(...)");
        Iterator<T> it = plugins.iterator();
        while (it.hasNext()) {
            NotificationsPlugin notificationsPlugin = (NotificationsPlugin) it.next();
            if (WhenMappings.$EnumSwitchMapping$0[notificationsPlugin.getSubCategoryType().ordinal()] == 1) {
                PushNotificationsCategory pushNotificationsCategory = this.Push;
                sq8.m48647f(notificationsPlugin, "null cannot be cast to non-null type com.amplifyframework.notifications.pushnotifications.PushNotificationsPlugin<*>");
                pushNotificationsCategory.addPlugin((PushNotificationsPlugin) notificationsPlugin);
                CategoryConfiguration categoryConfigurationForCategoryType = categoryConfiguration instanceof NotificationsCategoryConfiguration ? (NotificationsCategoryConfiguration) categoryConfiguration : null;
                PushNotificationsCategory pushNotificationsCategory2 = this.Push;
                if (categoryConfigurationForCategoryType == null) {
                    categoryConfigurationForCategoryType = EmptyCategoryConfiguration.forCategoryType(getCategoryType());
                }
                pushNotificationsCategory2.configure(categoryConfigurationForCategoryType, context);
            }
        }
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.NOTIFICATIONS;
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(String str, Action action, Consumer<PushNotificationsException> consumer) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        this.Push.identifyUser(str, action, consumer);
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(String str, UserProfile userProfile, Action action, Consumer<PushNotificationsException> consumer) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(userProfile, Scopes.PROFILE);
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        this.Push.identifyUser(str, userProfile, action, consumer);
    }
}
