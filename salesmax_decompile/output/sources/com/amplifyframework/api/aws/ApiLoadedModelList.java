package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.LoadedModelList;
import com.amplifyframework.core.model.Model;
import java.util.List;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ApiLoadedModelList<M extends Model> implements LoadedModelList<M> {
    private final List<M> items;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiLoadedModelList(List<? extends M> list) {
        sq8.m48649h(list, "items");
        this.items = list;
    }

    @Override // com.amplifyframework.core.model.LoadedModelList
    public List<M> getItems() {
        return this.items;
    }
}
