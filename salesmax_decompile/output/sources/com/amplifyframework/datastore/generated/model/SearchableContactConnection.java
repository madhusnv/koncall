package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class SearchableContactConnection {
    private final List<Contact> items;
    private final String nextToken;
    private final Integer total;

    public interface BuildStep {
        SearchableContactConnection build();

        BuildStep items(List<Contact> list);

        BuildStep nextToken(String str);

        BuildStep total(Integer num);
    }

    public static class Builder implements BuildStep {
        private List<Contact> items;
        private String nextToken;
        private Integer total;

        @Override // com.amplifyframework.datastore.generated.model.SearchableContactConnection.BuildStep
        public SearchableContactConnection build() {
            return new SearchableContactConnection(this.items, this.nextToken, this.total);
        }

        @Override // com.amplifyframework.datastore.generated.model.SearchableContactConnection.BuildStep
        public BuildStep items(List<Contact> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SearchableContactConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SearchableContactConnection.BuildStep
        public BuildStep total(Integer num) {
            this.total = num;
            return this;
        }

        public Builder() {
        }

        private Builder(List<Contact> list, String str, Integer num) {
            this.items = list;
            this.nextToken = str;
            this.total = num;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.SearchableContactConnection.Builder, com.amplifyframework.datastore.generated.model.SearchableContactConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<Contact>) list);
        }

        private CopyOfBuilder(List<Contact> list, String str, Integer num) {
            super(list, str, num);
        }

        @Override // com.amplifyframework.datastore.generated.model.SearchableContactConnection.Builder, com.amplifyframework.datastore.generated.model.SearchableContactConnection.BuildStep
        public CopyOfBuilder items(List<Contact> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SearchableContactConnection.Builder, com.amplifyframework.datastore.generated.model.SearchableContactConnection.BuildStep
        public CopyOfBuilder nextToken(String str) {
            return (CopyOfBuilder) super.nextToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SearchableContactConnection.Builder, com.amplifyframework.datastore.generated.model.SearchableContactConnection.BuildStep
        public CopyOfBuilder total(Integer num) {
            return (CopyOfBuilder) super.total(num);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.items, this.nextToken, this.total);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SearchableContactConnection.class != obj.getClass()) {
            return false;
        }
        SearchableContactConnection searchableContactConnection = (SearchableContactConnection) obj;
        return s6c.m47909a(getItems(), searchableContactConnection.getItems()) && s6c.m47909a(getNextToken(), searchableContactConnection.getNextToken()) && s6c.m47909a(getTotal(), searchableContactConnection.getTotal());
    }

    public List<Contact> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (getItems() + getNextToken() + getTotal()).hashCode();
    }

    private SearchableContactConnection(List<Contact> list, String str, Integer num) {
        this.items = list;
        this.nextToken = str;
        this.total = num;
    }
}
