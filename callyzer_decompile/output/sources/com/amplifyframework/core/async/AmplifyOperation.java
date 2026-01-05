package com.amplifyframework.core.async;

import com.amplifyframework.core.category.CategoryType;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AmplifyOperation<R> {
    private final CategoryType categoryType;
    private final R request;

    public AmplifyOperation(CategoryType categoryType, R r9) {
        this.categoryType = categoryType;
        this.request = r9;
    }

    public final CategoryType getCategoryType() {
        return this.categoryType;
    }

    public R getRequest() {
        return this.request;
    }

    public abstract void start();
}
