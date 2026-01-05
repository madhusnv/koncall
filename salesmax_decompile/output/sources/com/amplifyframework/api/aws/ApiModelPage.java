package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPage;
import java.util.List;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ApiModelPage<M extends Model> implements ModelPage<M> {
    private final List<M> items;
    private final ApiPaginationToken nextToken;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiModelPage(List<? extends M> list, ApiPaginationToken apiPaginationToken) {
        sq8.m48649h(list, "items");
        this.items = list;
        this.nextToken = apiPaginationToken;
    }

    @Override // com.amplifyframework.core.model.ModelPage
    public boolean getHasNextPage() {
        return ModelPage.DefaultImpls.getHasNextPage(this);
    }

    @Override // com.amplifyframework.core.model.ModelPage
    public List<M> getItems() {
        return this.items;
    }

    @Override // com.amplifyframework.core.model.ModelPage
    public ApiPaginationToken getNextToken() {
        return this.nextToken;
    }
}
