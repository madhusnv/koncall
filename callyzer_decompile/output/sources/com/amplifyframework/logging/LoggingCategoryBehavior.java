package com.amplifyframework.logging;

import com.amplifyframework.core.category.CategoryType;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface LoggingCategoryBehavior {
    void disable();

    void enable();

    @Deprecated
    Logger forNamespace(String str);

    Logger logger(CategoryType categoryType, String str);

    Logger logger(String str);
}
