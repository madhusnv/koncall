package com.amplifyframework.core.model;

import com.amplifyframework.core.model.Model;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface ModelPage<M extends Model> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        @Deprecated
        public static <M extends Model> boolean getHasNextPage(ModelPage<? extends M> modelPage) {
            return ModelPage.super.getHasNextPage();
        }
    }

    default boolean getHasNextPage() {
        return getNextToken() != null;
    }

    List<M> getItems();

    PaginationToken getNextToken();
}
