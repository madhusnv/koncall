package com.amplifyframework.api.aws;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class ApiGraphQLRequestOptions implements GraphQLRequestOptions {
    private static final int DEFAULT_MAX_DEPTH = 2;
    private static final String ITEMS_KEY = "items";
    private static final String NEXT_TOKEN_KEY = "nextToken";
    private int maxDepth;

    public ApiGraphQLRequestOptions() {
        this.maxDepth = 2;
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public LeafSerializationBehavior leafSerializationBehavior() {
        return LeafSerializationBehavior.ALL_FIELDS;
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public String listField() {
        return "items";
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public int maxDepth() {
        return this.maxDepth;
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public List<String> modelMetaFields() {
        return Collections.emptyList();
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public List<String> paginationFields() {
        return Collections.singletonList("nextToken");
    }

    public ApiGraphQLRequestOptions(int i) {
        this.maxDepth = i;
    }
}
