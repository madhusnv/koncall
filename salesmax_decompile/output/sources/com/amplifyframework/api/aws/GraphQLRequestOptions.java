package com.amplifyframework.api.aws;

import java.util.List;

/* loaded from: classes5.dex */
public interface GraphQLRequestOptions {
    LeafSerializationBehavior leafSerializationBehavior();

    String listField();

    int maxDepth();

    List<String> modelMetaFields();

    List<String> paginationFields();
}
