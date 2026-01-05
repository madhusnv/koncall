package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.NullableConsumer;
import com.amplifyframework.core.model.Model;
import p001o.n64;

/* loaded from: classes5.dex */
public interface LazyModelReference<M extends Model> extends ModelReference<M> {
    /* synthetic */ Object fetchModel(n64 n64Var);

    void fetchModel(NullableConsumer<M> nullableConsumer, Consumer<AmplifyException> consumer);
}
