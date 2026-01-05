package com.amplifyframework.api;

import android.content.Context;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.plugin.Plugin;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ApiPlugin<E> implements ApiCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public final CategoryType getCategoryType() {
        return CategoryType.API;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(Context context) {
    }
}
