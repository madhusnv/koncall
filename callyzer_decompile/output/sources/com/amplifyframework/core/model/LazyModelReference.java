package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.NullableConsumer;
import com.amplifyframework.core.model.Model;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface LazyModelReference<M extends Model> extends ModelReference<M> {
    /* synthetic */ Object fetchModel(InterfaceC7559c interfaceC7559c);

    void fetchModel(NullableConsumer<M> nullableConsumer, Consumer<AmplifyException> consumer);
}
