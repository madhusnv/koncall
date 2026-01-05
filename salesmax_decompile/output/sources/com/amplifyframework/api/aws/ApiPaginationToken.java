package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.PaginationToken;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ApiPaginationToken implements PaginationToken {
    private final String nextToken;

    public ApiPaginationToken(String str) {
        sq8.m48649h(str, LazyTypeDeserializersKt.NEXT_TOKEN_KEY);
        this.nextToken = str;
    }

    public final String getNextToken() {
        return this.nextToken;
    }
}
