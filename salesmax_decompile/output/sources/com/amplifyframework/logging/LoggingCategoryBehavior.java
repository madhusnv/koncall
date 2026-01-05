package com.amplifyframework.logging;

import com.amplifyframework.core.category.CategoryType;

/* loaded from: classes5.dex */
public interface LoggingCategoryBehavior {
    void disable();

    void enable();

    @Deprecated
    Logger forNamespace(String str);

    Logger logger(CategoryType categoryType, String str);

    Logger logger(String str);
}
