package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.Model;
import p001o.n64;

/* loaded from: classes5.dex */
public interface LazyModelList<M extends Model> extends ModelList<M> {

    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchPage$default(LazyModelList lazyModelList, PaginationToken paginationToken, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchPage");
            }
            if ((i & 1) != 0) {
                paginationToken = null;
            }
            return lazyModelList.fetchPage(paginationToken, n64Var);
        }
    }

    /* synthetic */ Object fetchPage(PaginationToken paginationToken, n64 n64Var);

    void fetchPage(Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2);

    void fetchPage(PaginationToken paginationToken, Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2);
}
