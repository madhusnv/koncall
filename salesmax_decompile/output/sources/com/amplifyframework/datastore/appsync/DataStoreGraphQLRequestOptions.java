package com.amplifyframework.datastore.appsync;

import com.amplifyframework.api.aws.GraphQLRequestOptions;
import com.amplifyframework.api.aws.LeafSerializationBehavior;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class DataStoreGraphQLRequestOptions implements GraphQLRequestOptions {
    private static final String ITEMS_KEY = "items";
    private static final String NEXT_TOKEN_KEY = "nextToken";
    private static final String STARTED_AT_KEY = "startedAt";

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public LeafSerializationBehavior leafSerializationBehavior() {
        return LeafSerializationBehavior.JUST_ID;
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public String listField() {
        return "items";
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public int maxDepth() {
        return 1;
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public List<String> modelMetaFields() {
        return Arrays.asList(ModelWithMetadataAdapter.VERSION_KEY, ModelWithMetadataAdapter.DELETED_KEY, ModelWithMetadataAdapter.LAST_CHANGED_AT_KEY, ModelWithMetadataAdapter.TYPE_NAME);
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public List<String> paginationFields() {
        return Arrays.asList("nextToken", STARTED_AT_KEY);
    }
}
