package com.amplifyframework.notifications;

import android.content.Context;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.category.SubCategoryType;
import com.amplifyframework.core.plugin.Plugin;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class NotificationsPlugin<E> implements NotificationsCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.NOTIFICATIONS;
    }

    public abstract SubCategoryType getSubCategoryType();

    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(Context context) {
        AbstractC4154l.m8923f(context, "context");
    }
}
