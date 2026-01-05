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
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class NotificationsCategory extends Category<NotificationsPlugin<?>> implements NotificationsCategoryBehavior {
    public PushNotificationsCategory Push = new PushNotificationsCategory();

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final /* synthetic */ class WhenMappings {
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

    @Override // com.amplifyframework.core.category.Category
    public void configure(CategoryConfiguration configuration, Context context) throws AmplifyException {
        AbstractC4154l.m8923f(configuration, "configuration");
        AbstractC4154l.m8923f(context, "context");
        Set<NotificationsPlugin<?>> plugins = getPlugins();
        AbstractC4154l.m8922e(plugins, "getPlugins(...)");
        Iterator<T> it = plugins.iterator();
        while (it.hasNext()) {
            NotificationsPlugin notificationsPlugin = (NotificationsPlugin) it.next();
            if (WhenMappings.$EnumSwitchMapping$0[notificationsPlugin.getSubCategoryType().ordinal()] == 1) {
                this.Push.addPlugin((PushNotificationsPlugin) notificationsPlugin);
                CategoryConfiguration categoryConfigurationForCategoryType = configuration instanceof NotificationsCategoryConfiguration ? (NotificationsCategoryConfiguration) configuration : null;
                PushNotificationsCategory pushNotificationsCategory = this.Push;
                if (categoryConfigurationForCategoryType == null) {
                    categoryConfigurationForCategoryType = EmptyCategoryConfiguration.forCategoryType(getCategoryType());
                }
                pushNotificationsCategory.configure(categoryConfigurationForCategoryType, context);
            }
        }
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.NOTIFICATIONS;
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(String userId, Action onSuccess, Consumer<PushNotificationsException> onError) {
        AbstractC4154l.m8923f(userId, "userId");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        this.Push.identifyUser(userId, onSuccess, onError);
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(String userId, UserProfile profile, Action onSuccess, Consumer<PushNotificationsException> onError) {
        AbstractC4154l.m8923f(userId, "userId");
        AbstractC4154l.m8923f(profile, "profile");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        this.Push.identifyUser(userId, profile, onSuccess, onError);
    }

    public static /* synthetic */ void getPush$annotations() {
    }
}
