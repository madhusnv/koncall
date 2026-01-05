package com.amplifyframework.datastore.storage;

import android.content.Context;
import com.amplifyframework.annotations.InternalApiWarning;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.query.ObserveQueryOptions;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.datastore.DataStoreConfiguration;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreQuerySnapshot;
import com.amplifyframework.datastore.storage.StorageItemChange;
import java.util.Iterator;
import java.util.List;

@InternalApiWarning
/* loaded from: classes5.dex */
public interface LocalStorageAdapter {
    <T extends Model> void batchSyncOperations(List<StorageOperation<T>> list, Action action, Consumer<DataStoreException> consumer);

    void clear(Action action, Consumer<DataStoreException> consumer);

    <T extends Model> void delete(T t, StorageItemChange.Initiator initiator, QueryPredicate queryPredicate, Consumer<StorageItemChange<T>> consumer, Consumer<DataStoreException> consumer2);

    <T extends Model> void delete(Class<T> cls, StorageItemChange.Initiator initiator, QueryPredicate queryPredicate, Action action, Consumer<DataStoreException> consumer);

    void initialize(Context context, Consumer<List<ModelSchema>> consumer, Consumer<DataStoreException> consumer2, DataStoreConfiguration dataStoreConfiguration);

    Cancelable observe(Consumer<StorageItemChange<? extends Model>> consumer, Consumer<DataStoreException> consumer2, Action action);

    <T extends Model> void observeQuery(Class<T> cls, ObserveQueryOptions observeQueryOptions, Consumer<Cancelable> consumer, Consumer<DataStoreQuerySnapshot<T>> consumer2, Consumer<DataStoreException> consumer3, Action action);

    <T extends Model> void query(Class<T> cls, QueryOptions queryOptions, Consumer<Iterator<T>> consumer, Consumer<DataStoreException> consumer2);

    void query(String str, QueryOptions queryOptions, Consumer<Iterator<? extends Model>> consumer, Consumer<DataStoreException> consumer2);

    <T extends Model> void save(T t, StorageItemChange.Initiator initiator, QueryPredicate queryPredicate, Consumer<StorageItemChange<T>> consumer, Consumer<DataStoreException> consumer2);

    void terminate();
}
