package com.amplifyframework.api.graphql;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.ApiOperation;
import com.amplifyframework.api.graphql.GraphQLResponse;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class GraphQLOperation<R> extends ApiOperation<GraphQLRequest<R>> {
    private final GraphQLResponse.Factory responseFactory;

    public GraphQLOperation(GraphQLRequest<R> graphQLRequest, GraphQLResponse.Factory factory) {
        super(graphQLRequest);
        this.responseFactory = factory;
    }

    public final GraphQLResponse.Factory getResponseFactory() {
        return this.responseFactory;
    }

    public GraphQLResponse<R> wrapResponse(String str) throws ApiException {
        try {
            return this.responseFactory.buildResponse((GraphQLRequest) getRequest(), str);
        } catch (ClassCastException unused) {
            throw new ApiException("Amplify encountered an error while deserializing an object", "Sorry, we don’t have a recovery suggestion for this error.");
        }
    }
}
