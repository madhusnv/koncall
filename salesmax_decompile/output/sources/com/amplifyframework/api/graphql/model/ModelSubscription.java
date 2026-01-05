package com.amplifyframework.api.graphql.model;

import com.amplifyframework.api.aws.AppSyncGraphQLRequestFactory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.SubscriptionType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPath;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class ModelSubscription {
    public static final ModelSubscription INSTANCE = new ModelSubscription();

    private ModelSubscription() {
    }

    public static final <M extends Model> GraphQLRequest<M> of(Class<M> cls, SubscriptionType subscriptionType) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(subscriptionType, "type");
        return AppSyncGraphQLRequestFactory.buildSubscription(cls, subscriptionType);
    }

    public static final <M extends Model> GraphQLRequest<M> onCreate(Class<M> cls) {
        sq8.m48649h(cls, "modelType");
        return of(cls, SubscriptionType.ON_CREATE);
    }

    public static final <M extends Model> GraphQLRequest<M> onDelete(Class<M> cls) {
        sq8.m48649h(cls, "modelType");
        return of(cls, SubscriptionType.ON_DELETE);
    }

    public static final <M extends Model> GraphQLRequest<M> onUpdate(Class<M> cls) {
        sq8.m48649h(cls, "modelType");
        return of(cls, SubscriptionType.ON_UPDATE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> of(Class<M> cls, SubscriptionType subscriptionType, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(subscriptionType, "type");
        sq8.m48649h(xk7Var, "includes");
        return AppSyncGraphQLRequestFactory.buildSubscription(cls, subscriptionType, xk7Var);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> onCreate(Class<M> cls, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(xk7Var, "includes");
        return of(cls, SubscriptionType.ON_CREATE, xk7Var);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> onDelete(Class<M> cls, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(xk7Var, "includes");
        return of(cls, SubscriptionType.ON_DELETE, xk7Var);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> onUpdate(Class<M> cls, xk7 xk7Var) {
        sq8.m48649h(cls, "modelType");
        sq8.m48649h(xk7Var, "includes");
        return of(cls, SubscriptionType.ON_UPDATE, xk7Var);
    }
}
