package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLOperation;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public abstract class AWSGraphQLOperation<R> extends GraphQLOperation<R> {
    private final String apiName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSGraphQLOperation(GraphQLRequest<R> graphQLRequest, GraphQLResponse.Factory factory, String str) {
        super(graphQLRequest, factory);
        sq8.m48649h(graphQLRequest, "graphQLRequest");
        sq8.m48649h(factory, "responseFactory");
        this.apiName = str;
    }

    private final GraphQLResponse<R> buildResponse(String str) throws ApiException {
        try {
            GraphQLResponse.Factory responseFactory = getResponseFactory();
            GsonGraphQLResponseFactory gsonGraphQLResponseFactory = responseFactory instanceof GsonGraphQLResponseFactory ? (GsonGraphQLResponseFactory) responseFactory : null;
            GraphQLResponse<R> graphQLResponseBuildResponse = gsonGraphQLResponseFactory != null ? gsonGraphQLResponseFactory.buildResponse((GraphQLRequest) getRequest(), str, this.apiName) : null;
            if (graphQLResponseBuildResponse != null) {
                return graphQLResponseBuildResponse;
            }
            throw new ApiException("Amplify encountered an error while deserializing an object. GraphQLResponse.Factory was not of type GsonGraphQLResponseFactory", AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
        } catch (ClassCastException unused) {
            throw new ApiException("Amplify encountered an error while deserializing an object", "Sorry, we don’t have a recovery suggestion for this error.");
        }
    }

    @Override // com.amplifyframework.api.graphql.GraphQLOperation
    public GraphQLResponse<R> wrapResponse(String str) {
        sq8.m48649h(str, "jsonResponse");
        return buildResponse(str);
    }
}
