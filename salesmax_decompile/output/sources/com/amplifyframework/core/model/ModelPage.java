package com.amplifyframework.core.model;

import com.amplifyframework.core.model.Model;
import java.util.List;

/* loaded from: classes5.dex */
public interface ModelPage<M extends Model> {

    public static final class DefaultImpls {
        public static <M extends Model> boolean getHasNextPage(ModelPage<? extends M> modelPage) {
            return modelPage.getNextToken() != null;
        }
    }

    boolean getHasNextPage();

    List<M> getItems();

    PaginationToken getNextToken();
}
