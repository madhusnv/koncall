package com.amplifyframework.api.graphql.model;

import com.amplifyframework.api.aws.AppSyncGraphQLRequestFactory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.MutationType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPath;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class ModelMutation {
    public static final ModelMutation INSTANCE = new ModelMutation();

    private ModelMutation() {
    }

    public static final <M extends Model> GraphQLRequest<M> create(M m) {
        sq8.m48649h(m, "model");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.CREATE);
    }

    public static final <M extends Model> GraphQLRequest<M> delete(M m, QueryPredicate queryPredicate) {
        sq8.m48649h(m, "model");
        sq8.m48649h(queryPredicate, "predicate");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicate, MutationType.DELETE);
    }

    public static final <M extends Model> GraphQLRequest<M> update(M m, QueryPredicate queryPredicate) {
        sq8.m48649h(m, "model");
        sq8.m48649h(queryPredicate, "predicate");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicate, MutationType.UPDATE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> create(M m, xk7 xk7Var) {
        sq8.m48649h(m, "model");
        sq8.m48649h(xk7Var, "includes");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.CREATE, xk7Var);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> delete(M m, QueryPredicate queryPredicate, xk7 xk7Var) {
        sq8.m48649h(m, "model");
        sq8.m48649h(queryPredicate, "predicate");
        sq8.m48649h(xk7Var, "includes");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicate, MutationType.DELETE, xk7Var);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> update(M m, QueryPredicate queryPredicate, xk7 xk7Var) {
        sq8.m48649h(m, "model");
        sq8.m48649h(queryPredicate, "predicate");
        sq8.m48649h(xk7Var, "includes");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicate, MutationType.UPDATE, xk7Var);
    }

    public static final <M extends Model> GraphQLRequest<M> delete(M m) {
        sq8.m48649h(m, "model");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.DELETE);
    }

    public static final <M extends Model> GraphQLRequest<M> update(M m) {
        sq8.m48649h(m, "model");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.UPDATE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> delete(M m, xk7 xk7Var) {
        sq8.m48649h(m, "model");
        sq8.m48649h(xk7Var, "includes");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.DELETE, xk7Var);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> update(M m, xk7 xk7Var) {
        sq8.m48649h(m, "model");
        sq8.m48649h(xk7Var, "includes");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        sq8.m48648g(queryPredicateAll, "all(...)");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.UPDATE, xk7Var);
    }
}
