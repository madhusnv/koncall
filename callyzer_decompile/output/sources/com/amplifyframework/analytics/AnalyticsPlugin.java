package com.amplifyframework.analytics;

import android.content.Context;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.plugin.Plugin;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AnalyticsPlugin<E> implements AnalyticsCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public final CategoryType getCategoryType() {
        return CategoryType.ANALYTICS;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(Context context) {
    }
}
