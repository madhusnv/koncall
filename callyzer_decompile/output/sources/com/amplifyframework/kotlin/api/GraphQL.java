package com.amplifyframework.kotlin.api;

import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import uw.InterfaceC7559c;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface GraphQL {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object mutate$default(GraphQL graphQL, GraphQLRequest graphQLRequest, String str, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mutate");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return graphQL.mutate(graphQLRequest, str, interfaceC7559c);
    }

    static /* synthetic */ Object query$default(GraphQL graphQL, GraphQLRequest graphQLRequest, String str, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return graphQL.query(graphQLRequest, str, interfaceC7559c);
    }

    static /* synthetic */ Object subscribe$default(GraphQL graphQL, GraphQLRequest graphQLRequest, String str, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return graphQL.subscribe(graphQLRequest, str, interfaceC7559c);
    }

    <T> Object mutate(GraphQLRequest<T> graphQLRequest, String str, InterfaceC7559c<? super GraphQLResponse<T>> interfaceC7559c);

    <T> Object query(GraphQLRequest<T> graphQLRequest, String str, InterfaceC7559c<? super GraphQLResponse<T>> interfaceC7559c);

    <T> Object subscribe(GraphQLRequest<T> graphQLRequest, String str, InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c);
}
