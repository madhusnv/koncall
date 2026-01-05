package com.amplifyframework.datastore.appsync;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.AuthModeStrategyType;
import com.amplifyframework.api.graphql.GraphQLBehavior;
import com.amplifyframework.api.graphql.GraphQLOperation;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.PaginatedResult;
import com.amplifyframework.api.graphql.SubscriptionType;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.async.NoOpCancelable;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.appsync.AppSyncClient;
import com.amplifyframework.logging.Logger;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class AppSyncClient implements AppSync {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final GraphQLBehavior api;
    private final AuthModeStrategyType authModeStrategyType;

    private AppSyncClient(GraphQLBehavior graphQLBehavior, AuthModeStrategyType authModeStrategyType) {
        this.api = graphQLBehavior;
        this.authModeStrategyType = authModeStrategyType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$mutation$3(Consumer consumer, GraphQLResponse graphQLResponse) {
        if (graphQLResponse.hasErrors()) {
            consumer.accept(new GraphQLResponse(null, graphQLResponse.getErrors()));
        } else {
            consumer.accept(graphQLResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$mutation$4(Consumer consumer, ApiException apiException) {
        consumer.accept(new DataStoreException("Failure during mutation.", apiException, "Check details."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscription$1(Consumer consumer, ModelSchema modelSchema, Consumer consumer2, GraphQLResponse graphQLResponse) {
        if (!graphQLResponse.hasErrors()) {
            consumer2.accept(graphQLResponse);
            return;
        }
        consumer.accept(new DataStoreException.GraphQLResponseException("Subscription error for " + modelSchema.getName() + ": " + graphQLResponse.getErrors(), graphQLResponse.getErrors()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscription$2(Consumer consumer, ApiException apiException) {
        consumer.accept(new DataStoreException("Error during subscription.", apiException, "Evaluate details."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sync$0(Consumer consumer, ApiException apiException) {
        consumer.accept(new DataStoreException("Failure performing sync query to AppSync.", apiException, "Sorry, we don’t have a recovery suggestion for this error."));
    }

    private <T extends Model> Cancelable mutation(GraphQLRequest<ModelWithMetadata<T>> graphQLRequest, final Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, final Consumer<DataStoreException> consumer2) {
        GraphQLOperation graphQLOperationMutate = this.api.mutate(graphQLRequest, new Consumer() { // from class: o.um0
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                AppSyncClient.lambda$mutation$3(consumer, (GraphQLResponse) obj);
            }
        }, new Consumer() { // from class: o.vm0
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                AppSyncClient.lambda$mutation$4(consumer2, (ApiException) obj);
            }
        });
        return graphQLOperationMutate != null ? graphQLOperationMutate : new NoOpCancelable();
    }

    private <T extends Model> Cancelable subscription(SubscriptionType subscriptionType, final ModelSchema modelSchema, Consumer<String> consumer, final Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer2, final Consumer<DataStoreException> consumer3, Action action) {
        try {
            GraphQLOperation graphQLOperationSubscribe = this.api.subscribe(AppSyncRequestFactory.buildSubscriptionRequest(modelSchema, subscriptionType, this.authModeStrategyType), consumer, new Consumer() { // from class: o.wm0
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    AppSyncClient.lambda$subscription$1(consumer3, modelSchema, consumer2, (GraphQLResponse) obj);
                }
            }, new Consumer() { // from class: o.xm0
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    AppSyncClient.lambda$subscription$2(consumer3, (ApiException) obj);
                }
            }, action);
            return graphQLOperationSubscribe != null ? graphQLOperationSubscribe : new NoOpCancelable();
        } catch (DataStoreException e) {
            consumer3.accept(e);
            return new NoOpCancelable();
        }
    }

    public static AppSyncClient via(GraphQLBehavior graphQLBehavior) {
        return new AppSyncClient(graphQLBehavior, AuthModeStrategyType.DEFAULT);
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> GraphQLRequest<PaginatedResult<ModelWithMetadata<T>>> buildSyncRequest(ModelSchema modelSchema, Long l, Integer num, QueryPredicate queryPredicate) {
        return AppSyncRequestFactory.buildSyncRequest(modelSchema, l, num, queryPredicate, this.authModeStrategyType);
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> Cancelable create(T t, ModelSchema modelSchema, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2) {
        try {
            return mutation(AppSyncRequestFactory.buildCreationRequest(modelSchema, t, this.authModeStrategyType), consumer, consumer2);
        } catch (AmplifyException e) {
            consumer2.accept(new DataStoreException("Error encountered while creating model schema", e, "See attached exception for more details"));
            return new NoOpCancelable();
        }
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> Cancelable delete(T t, ModelSchema modelSchema, Integer num, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2) {
        return delete(t, modelSchema, num, QueryPredicates.all(), consumer, consumer2);
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> Cancelable onCreate(ModelSchema modelSchema, Consumer<String> consumer, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer2, Consumer<DataStoreException> consumer3, Action action) {
        return subscription(SubscriptionType.ON_CREATE, modelSchema, consumer, consumer2, consumer3, action);
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> Cancelable onDelete(ModelSchema modelSchema, Consumer<String> consumer, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer2, Consumer<DataStoreException> consumer3, Action action) {
        return subscription(SubscriptionType.ON_DELETE, modelSchema, consumer, consumer2, consumer3, action);
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> Cancelable onUpdate(ModelSchema modelSchema, Consumer<String> consumer, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer2, Consumer<DataStoreException> consumer3, Action action) {
        return subscription(SubscriptionType.ON_UPDATE, modelSchema, consumer, consumer2, consumer3, action);
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> Cancelable sync(GraphQLRequest<PaginatedResult<ModelWithMetadata<T>>> graphQLRequest, final Consumer<GraphQLResponse<PaginatedResult<ModelWithMetadata<T>>>> consumer, final Consumer<DataStoreException> consumer2) {
        Consumer<ApiException> consumer3 = new Consumer() { // from class: o.sm0
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                AppSyncClient.lambda$sync$0(consumer2, (ApiException) obj);
            }
        };
        GraphQLBehavior graphQLBehavior = this.api;
        Objects.requireNonNull(consumer);
        GraphQLOperation graphQLOperationQuery = graphQLBehavior.query(graphQLRequest, new Consumer() { // from class: o.tm0
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                consumer.accept((GraphQLResponse) obj);
            }
        }, consumer3);
        return graphQLOperationQuery != null ? graphQLOperationQuery : new NoOpCancelable();
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> Cancelable update(T t, ModelSchema modelSchema, Integer num, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2) {
        return update(t, modelSchema, num, QueryPredicates.all(), consumer, consumer2);
    }

    public static AppSyncClient via(GraphQLBehavior graphQLBehavior, AuthModeStrategyType authModeStrategyType) {
        return new AppSyncClient(graphQLBehavior, authModeStrategyType);
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> Cancelable delete(T t, ModelSchema modelSchema, Integer num, QueryPredicate queryPredicate, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2) {
        try {
            return mutation(AppSyncRequestFactory.buildDeletionRequest(modelSchema, t, num, queryPredicate, this.authModeStrategyType), consumer, consumer2);
        } catch (DataStoreException e) {
            consumer2.accept(e);
            return new NoOpCancelable();
        }
    }

    @Override // com.amplifyframework.datastore.appsync.AppSync
    public <T extends Model> Cancelable update(T t, ModelSchema modelSchema, Integer num, QueryPredicate queryPredicate, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2) {
        try {
            return mutation(AppSyncRequestFactory.buildUpdateRequest(modelSchema, t, num, queryPredicate, this.authModeStrategyType), consumer, consumer2);
        } catch (AmplifyException e) {
            consumer2.accept(new DataStoreException("Error encountered while creating model schema", e, "See attached exception for more details"));
            return new NoOpCancelable();
        }
    }
}
