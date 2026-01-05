package com.amplifyframework.core.model;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ModelIndex {
    private final List<String> indexFieldNames;
    private final String indexName;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private List<String> indexFieldNames;
        private String indexName;

        public ModelIndex build() {
            return new ModelIndex(0, this.indexName, this.indexFieldNames);
        }

        public Builder indexFieldNames(List<String> list) {
            this.indexFieldNames = list;
            return this;
        }

        public Builder indexName(String str) {
            this.indexName = str;
            return this;
        }
    }

    public /* synthetic */ ModelIndex(int i10, String str, List list) {
        this(str, list);
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelIndex.class != obj.getClass()) {
            return false;
        }
        ModelIndex modelIndex = (ModelIndex) obj;
        if (Objects.equals(this.indexName, modelIndex.indexName)) {
            return Objects.equals(this.indexFieldNames, modelIndex.indexFieldNames);
        }
        return false;
    }

    public List<String> getIndexFieldNames() {
        return this.indexFieldNames;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public int hashCode() {
        String str = this.indexName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.indexFieldNames;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ModelIndex{indexName='" + this.indexName + "', indexFieldNames=" + this.indexFieldNames + '}';
    }

    private ModelIndex(String str, List<String> list) {
        this.indexName = str;
        this.indexFieldNames = list;
    }
}
