package com.amplifyframework.rx;

import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.rx.RxOperations;
import p001o.wtf;

/* loaded from: classes5.dex */
public interface RxGraphQlBehavior {
    <T> wtf mutate(GraphQLRequest<T> graphQLRequest);

    <T> wtf mutate(String str, GraphQLRequest<T> graphQLRequest);

    <R> wtf query(GraphQLRequest<R> graphQLRequest);

    <T> wtf query(String str, GraphQLRequest<T> graphQLRequest);

    <T> RxOperations.RxSubscriptionOperation<GraphQLResponse<T>> subscribe(GraphQLRequest<T> graphQLRequest);

    <R> RxOperations.RxSubscriptionOperation<GraphQLResponse<R>> subscribe(String str, GraphQLRequest<R> graphQLRequest);
}
