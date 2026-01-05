package com.amplifyframework.notifications;

import android.content.Context;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.category.SubCategoryType;
import com.amplifyframework.core.plugin.Plugin;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class NotificationsPlugin<E> implements NotificationsCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.NOTIFICATIONS;
    }

    public abstract SubCategoryType getSubCategoryType();

    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(Context context) {
        sq8.m48649h(context, "context");
    }
}
