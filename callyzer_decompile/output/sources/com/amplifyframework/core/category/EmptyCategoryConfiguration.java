package com.amplifyframework.core.category;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class EmptyCategoryConfiguration extends CategoryConfiguration {
    private final CategoryType categoryType;

    private EmptyCategoryConfiguration(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public static EmptyCategoryConfiguration forCategoryType(CategoryType categoryType) {
        return new EmptyCategoryConfiguration(categoryType);
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return this.categoryType;
    }
}
