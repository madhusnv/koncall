package com.amplifyframework.api.graphql.model;

import com.amplifyframework.api.aws.AppSyncGraphQLRequestFactory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.PaginatedResult;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.core.model.ModelPath;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class ModelQuery {
    public static final ModelQuery INSTANCE = new ModelQuery();

    private ModelQuery() {
    }

    public static final <M extends Model> GraphQLRequest<M> get(Class<M> cls, String str) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(str, "modelId");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, str);
    }

    public static final <M extends Model> GraphQLRequest<PaginatedResult<M>> list(Class<M> cls, QueryPredicate queryPredicate) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(queryPredicate, "predicate");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, queryPredicate);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> get(Class<M> cls, String str, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(str, "modelId");
        sq8.m48649h(xk7Var, "includes");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, str, xk7Var);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<PaginatedResult<M>> list(Class<M> cls, QueryPredicate queryPredicate, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(queryPredicate, "predicate");
        sq8.m48649h(xk7Var, "includes");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, queryPredicate, xk7Var);
    }

    public static final <M extends Model> GraphQLRequest<M> get(Class<M> cls, ModelIdentifier<M> modelIdentifier) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(modelIdentifier, "modelIdentifier");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, modelIdentifier);
    }

    public static final <M extends Model> GraphQLRequest<PaginatedResult<M>> list(Class<M> cls) {
        sq8.m48649h(cls, "modelType");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return list(cls, queryPredicateAll);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> get(Class<M> cls, ModelIdentifier<M> modelIdentifier, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(modelIdentifier, "modelIdentifier");
        sq8.m48649h(xk7Var, "includes");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, modelIdentifier, xk7Var);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<PaginatedResult<M>> list(Class<M> cls, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(xk7Var, "includes");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return list(cls, queryPredicateAll, xk7Var);
    }

    public static final <M extends Model> GraphQLRequest<PaginatedResult<M>> list(Class<M> cls, QueryPredicate queryPredicate, ModelPagination modelPagination) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(queryPredicate, "predicate");
        sq8.m48649h(modelPagination, "pagination");
        return AppSyncGraphQLRequestFactory.buildPaginatedResultQuery(cls, queryPredicate, modelPagination.getLimit());
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<PaginatedResult<M>> list(Class<M> cls, QueryPredicate queryPredicate, ModelPagination modelPagination, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(queryPredicate, "predicate");
        sq8.m48649h(modelPagination, "pagination");
        sq8.m48649h(xk7Var, "includes");
        return AppSyncGraphQLRequestFactory.buildPaginatedResultQuery(cls, queryPredicate, modelPagination.getLimit(), xk7Var);
    }

    public static final <M extends Model> GraphQLRequest<PaginatedResult<M>> list(Class<M> cls, ModelPagination modelPagination) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(modelPagination, "pagination");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return AppSyncGraphQLRequestFactory.buildPaginatedResultQuery(cls, queryPredicateAll, modelPagination.getLimit());
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<PaginatedResult<M>> list(Class<M> cls, ModelPagination modelPagination, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(modelPagination, "pagination");
        sq8.m48649h(xk7Var, "includes");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return AppSyncGraphQLRequestFactory.buildPaginatedResultQuery(cls, queryPredicateAll, modelPagination.getLimit(), xk7Var);
    }
}
