package com.amplifyframework.datastore.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.Model;
import p001o.id5;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public abstract class StorageOperation<M extends Model> {
    private final M model;
    private final Consumer<StorageItemChange<M>> onItemChange;

    public static final class Create<M extends Model> extends StorageOperation<M> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Create(M m, Consumer<StorageItemChange<M>> consumer) {
            super(m, consumer, null);
            sq8.m48649h(m, "model");
            sq8.m48649h(consumer, "onItemChange");
        }
    }

    public static final class Delete<M extends Model> extends StorageOperation<M> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Delete(M m, Consumer<StorageItemChange<M>> consumer) {
            super(m, consumer, null);
            sq8.m48649h(m, "model");
            sq8.m48649h(consumer, "onItemChange");
        }
    }

    public /* synthetic */ StorageOperation(Model model, Consumer consumer, id5 id5Var) {
        this(model, consumer);
    }

    public final M getModel() {
        return this.model;
    }

    public final Consumer<StorageItemChange<M>> getOnItemChange() {
        return this.onItemChange;
    }

    private StorageOperation(M m, Consumer<StorageItemChange<M>> consumer) {
        this.model = m;
        this.onItemChange = consumer;
    }
}
