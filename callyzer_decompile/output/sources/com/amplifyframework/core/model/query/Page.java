package com.amplifyframework.core.model.query;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Page {
    public static final int DEFAULT_LIMIT = 100;

    private Page() {
    }

    public static QueryPaginationInput firstPage() {
        return startingAt(0);
    }

    public static QueryPaginationInput firstResult() {
        return startingAt(0).withLimit(1);
    }

    public static QueryPaginationInput startingAt(int i10) {
        return new QueryPaginationInput(i10, 100);
    }
}
