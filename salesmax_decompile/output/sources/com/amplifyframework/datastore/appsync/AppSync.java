package com.amplifyframework.datastore.appsync;

import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.PaginatedResult;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.datastore.DataStoreException;

/* loaded from: classes5.dex */
public interface AppSync {
    <T extends Model> GraphQLRequest<PaginatedResult<ModelWithMetadata<T>>> buildSyncRequest(ModelSchema modelSchema, Long l, Integer num, QueryPredicate queryPredicate);

    <T extends Model> Cancelable create(T t, ModelSchema modelSchema, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2);

    <T extends Model> Cancelable delete(T t, ModelSchema modelSchema, Integer num, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2);

    <T extends Model> Cancelable delete(T t, ModelSchema modelSchema, Integer num, QueryPredicate queryPredicate, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2);

    <T extends Model> Cancelable onCreate(ModelSchema modelSchema, Consumer<String> consumer, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer2, Consumer<DataStoreException> consumer3, Action action);

    <T extends Model> Cancelable onDelete(ModelSchema modelSchema, Consumer<String> consumer, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer2, Consumer<DataStoreException> consumer3, Action action);

    <T extends Model> Cancelable onUpdate(ModelSchema modelSchema, Consumer<String> consumer, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer2, Consumer<DataStoreException> consumer3, Action action);

    <T extends Model> Cancelable sync(GraphQLRequest<PaginatedResult<ModelWithMetadata<T>>> graphQLRequest, Consumer<GraphQLResponse<PaginatedResult<ModelWithMetadata<T>>>> consumer, Consumer<DataStoreException> consumer2);

    <T extends Model> Cancelable update(T t, ModelSchema modelSchema, Integer num, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2);

    <T extends Model> Cancelable update(T t, ModelSchema modelSchema, Integer num, QueryPredicate queryPredicate, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2);
}
