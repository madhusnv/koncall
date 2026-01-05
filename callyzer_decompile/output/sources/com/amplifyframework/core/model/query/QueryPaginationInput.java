package com.amplifyframework.core.model.query;

import com.sun.mail.util.AbstractC1452a;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class QueryPaginationInput {
    public static final int DEFAULT_LIMIT = 100;
    private final int limit;
    private final int page;

    public QueryPaginationInput(int i10, int i11) {
        this.page = i10;
        this.limit = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPaginationInput)) {
            return false;
        }
        QueryPaginationInput queryPaginationInput = (QueryPaginationInput) obj;
        return this.page == queryPaginationInput.page && this.limit == queryPaginationInput.limit;
    }

    public int getLimit() {
        return this.limit;
    }

    public int getPage() {
        return this.page;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.page), Integer.valueOf(this.limit));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QueryPaginationInput{page=");
        sb2.append(this.page);
        sb2.append(", limit=");
        return AbstractC1452a.m4563j(sb2, this.limit, '}');
    }

    public QueryPaginationInput withLimit(Integer num) {
        return new QueryPaginationInput(this.page, num.intValue());
    }
}
