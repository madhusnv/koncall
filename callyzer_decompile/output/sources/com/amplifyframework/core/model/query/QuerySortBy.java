package com.amplifyframework.core.model.query;

import com.amplifyframework.util.Wrap;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class QuerySortBy {
    private final String field;
    private final String modelName;
    private final QuerySortOrder sortOrder;

    public QuerySortBy(String str, QuerySortOrder querySortOrder) {
        this(null, str, querySortOrder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && QuerySortBy.class == obj.getClass()) {
            QuerySortBy querySortBy = (QuerySortBy) obj;
            if (Objects.equals(this.modelName, querySortBy.modelName) && Objects.equals(this.field, querySortBy.field) && Objects.equals(this.sortOrder, querySortBy.sortOrder)) {
                return true;
            }
        }
        return false;
    }

    public String getField() {
        return this.field;
    }

    public String getModelName() {
        return this.modelName;
    }

    public QuerySortOrder getSortOrder() {
        return this.sortOrder;
    }

    public int hashCode() {
        return Objects.hash(this.modelName, this.field, this.sortOrder);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuerySortBy{model=");
        String str = this.modelName;
        sb2.append(str == null ? null : Wrap.inSingleQuotes(str));
        sb2.append(", field=");
        sb2.append(Wrap.inSingleQuotes(this.field));
        sb2.append(", sortOrder=");
        sb2.append(this.sortOrder);
        sb2.append('}');
        return sb2.toString();
    }

    public QuerySortBy(String str, String str2, QuerySortOrder querySortOrder) {
        this.modelName = str;
        Objects.requireNonNull(str2);
        this.field = str2;
        Objects.requireNonNull(querySortOrder);
        this.sortOrder = querySortOrder;
    }
}
