package com.amplifyframework.api.graphql.model;

/* loaded from: classes5.dex */
public final class ModelPagination {
    private static final int DEFAULT_LIMIT = 1000;
    private int limit;

    private ModelPagination(int i) {
        this.limit = i;
    }

    public static ModelPagination firstPage() {
        return limit(1000);
    }

    public static ModelPagination limit(int i) {
        return new ModelPagination(i);
    }

    public int getLimit() {
        return this.limit;
    }

    public ModelPagination withLimit(int i) {
        this.limit = i;
        return this;
    }
}
