package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.Model;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface LazyModelList<M extends Model> extends ModelList<M> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object fetchPage$default(LazyModelList lazyModelList, PaginationToken paginationToken, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchPage");
        }
        if ((i10 & 1) != 0) {
            paginationToken = null;
        }
        return lazyModelList.fetchPage(paginationToken, interfaceC7559c);
    }

    /* synthetic */ Object fetchPage(PaginationToken paginationToken, InterfaceC7559c interfaceC7559c);

    void fetchPage(Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2);

    void fetchPage(PaginationToken paginationToken, Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2);
}
