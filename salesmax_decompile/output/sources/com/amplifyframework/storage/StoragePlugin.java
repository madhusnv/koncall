package com.amplifyframework.storage;

import android.content.Context;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.plugin.Plugin;

/* loaded from: classes5.dex */
public abstract class StoragePlugin<E> implements StorageCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public final CategoryType getCategoryType() {
        return CategoryType.STORAGE;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(Context context) {
    }
}
