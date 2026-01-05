package com.amplifyframework.datastore.appsync;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.AppSyncGraphQLRequest;
import com.amplifyframework.api.aws.AuthModeStrategyType;
import com.amplifyframework.api.aws.GraphQLRequestHelper;
import com.amplifyframework.api.graphql.MutationType;
import com.amplifyframework.api.graphql.PaginatedResult;
import com.amplifyframework.api.graphql.QueryType;
import com.amplifyframework.api.graphql.SubscriptionType;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Casing;
import com.amplifyframework.util.TypeMaker;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
final class AppSyncRequestFactory {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");

    private AppSyncRequestFactory() {
    }

    public static <M extends Model> AppSyncGraphQLRequest<ModelWithMetadata<M>> buildCreationRequest(ModelSchema modelSchema, M m, AuthModeStrategyType authModeStrategyType) throws DataStoreException {
        try {
            MutationType mutationType = MutationType.CREATE;
            return buildMutation(modelSchema, GraphQLRequestHelper.getMapOfFieldNameAndValues(modelSchema, m, mutationType), QueryPredicates.all(), mutationType, authModeStrategyType);
        } catch (AmplifyException e) {
            throw new DataStoreException("Failed to get fields for model.", e, "Validate your model file.");
        }
    }

    public static <M extends Model> AppSyncGraphQLRequest<ModelWithMetadata<M>> buildDeletionRequest(ModelSchema modelSchema, M m, Integer num, QueryPredicate queryPredicate, AuthModeStrategyType authModeStrategyType) throws DataStoreException {
        try {
            HashMap map = new HashMap();
            if (num != null) {
                map.put(ModelWithMetadataAdapter.VERSION_KEY, num);
            }
            map.putAll(GraphQLRequestHelper.getDeleteMutationInputMap(modelSchema, m));
            return buildMutation(modelSchema, map, queryPredicate, MutationType.DELETE, authModeStrategyType);
        } catch (AmplifyException e) {
            throw new DataStoreException("Failed to get fields for model.", e, "Validate your model file.");
        }
    }

    private static <M extends Model> AppSyncGraphQLRequest<ModelWithMetadata<M>> buildMutation(ModelSchema modelSchema, Map<String, Object> map, QueryPredicate queryPredicate, MutationType mutationType, AuthModeStrategyType authModeStrategyType) throws DataStoreException {
        try {
            String name = modelSchema.getName();
            AppSyncGraphQLRequest.Builder builderResponseType = AppSyncGraphQLRequest.builder().modelClass(modelSchema.getModelClass()).modelSchema(modelSchema).operation(mutationType).requestAuthorizationStrategyType(authModeStrategyType).requestOptions(new DataStoreGraphQLRequestOptions()).responseType(TypeMaker.getParameterizedType(ModelWithMetadata.class, modelSchema.getModelClass()));
            builderResponseType.variable("input", Casing.capitalize(mutationType.toString()) + Casing.capitalizeFirst(name) + "Input!", map);
            if (!QueryPredicates.all().equals(queryPredicate)) {
                builderResponseType.variable("condition", "Model" + Casing.capitalizeFirst(name) + "ConditionInput", GraphQLRequestHelper.parsePredicate(queryPredicate));
            }
            return builderResponseType.build();
        } catch (AmplifyException e) {
            throw new DataStoreException("Failed to get fields for model.", e, "Validate your model file.");
        }
    }

    public static <T> AppSyncGraphQLRequest<T> buildSubscriptionRequest(ModelSchema modelSchema, SubscriptionType subscriptionType, AuthModeStrategyType authModeStrategyType) throws DataStoreException {
        try {
            return AppSyncGraphQLRequest.builder().modelClass(modelSchema.getModelClass()).modelSchema(modelSchema).operation(subscriptionType).requestOptions(new DataStoreGraphQLRequestOptions()).requestAuthorizationStrategyType(authModeStrategyType).responseType(TypeMaker.getParameterizedType(ModelWithMetadata.class, modelSchema.getModelClass())).build();
        } catch (AmplifyException e) {
            throw new DataStoreException("Failed to get fields for model.", e, "Validate your model file.");
        }
    }

    public static <T> AppSyncGraphQLRequest<T> buildSyncRequest(ModelSchema modelSchema, Long l, Integer num, QueryPredicate queryPredicate) {
        return buildSyncRequest(modelSchema, l, num, queryPredicate, AuthModeStrategyType.DEFAULT);
    }

    public static <M extends Model> AppSyncGraphQLRequest<ModelWithMetadata<M>> buildUpdateRequest(ModelSchema modelSchema, M m, Integer num, QueryPredicate queryPredicate, AuthModeStrategyType authModeStrategyType) throws DataStoreException {
        try {
            HashMap map = new HashMap();
            if (num != null) {
                map.put(ModelWithMetadataAdapter.VERSION_KEY, num);
            }
            MutationType mutationType = MutationType.UPDATE;
            map.putAll(GraphQLRequestHelper.getMapOfFieldNameAndValues(modelSchema, m, mutationType));
            return buildMutation(modelSchema, map, queryPredicate, mutationType, authModeStrategyType);
        } catch (AmplifyException e) {
            throw new DataStoreException("Failed to get fields for model.", e, "Validate your model file.");
        }
    }

    public static <T> AppSyncGraphQLRequest<T> buildSyncRequest(ModelSchema modelSchema, Long l, Integer num, QueryPredicate queryPredicate, AuthModeStrategyType authModeStrategyType) throws DataStoreException {
        try {
            AppSyncGraphQLRequest.Builder builderResponseType = AppSyncGraphQLRequest.builder().modelClass(modelSchema.getModelClass()).modelSchema(modelSchema).operation(QueryType.SYNC).requestAuthorizationStrategyType(authModeStrategyType).requestOptions(new DataStoreGraphQLRequestOptions()).responseType(TypeMaker.getParameterizedType(PaginatedResult.class, ModelWithMetadata.class, modelSchema.getModelClass()));
            if (l != null) {
                builderResponseType.variable("lastSync", "AWSTimestamp", l);
            }
            if (num != null) {
                builderResponseType.variable("limit", "Int", num);
            }
            if (!QueryPredicates.all().equals(queryPredicate)) {
                String str = "Model" + Casing.capitalizeFirst(modelSchema.getName()) + "FilterInput";
                if (!(queryPredicate instanceof QueryPredicateGroup)) {
                    queryPredicate = QueryPredicateGroup.andOf(queryPredicate);
                }
                builderResponseType.variable("filter", str, GraphQLRequestHelper.parsePredicate(queryPredicate));
            }
            return builderResponseType.build();
        } catch (AmplifyException e) {
            throw new DataStoreException("Failed to get fields for model.", e, "Validate your model file.");
        }
    }
}
