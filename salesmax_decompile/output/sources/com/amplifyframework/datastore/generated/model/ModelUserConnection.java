package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelUserConnection {
    private final List<User> items;
    private final String nextToken;

    public interface BuildStep {
        ModelUserConnection build();

        BuildStep items(List<User> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<User> items;
        private String nextToken;

        @Override // com.amplifyframework.datastore.generated.model.ModelUserConnection.BuildStep
        public ModelUserConnection build() {
            return new ModelUserConnection(this.items, this.nextToken);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelUserConnection.BuildStep
        public BuildStep items(List<User> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelUserConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ModelUserConnection.Builder, com.amplifyframework.datastore.generated.model.ModelUserConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<User>) list);
        }

        private CopyOfBuilder(List<User> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelUserConnection.Builder, com.amplifyframework.datastore.generated.model.ModelUserConnection.BuildStep
        public CopyOfBuilder items(List<User> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelUserConnection.Builder, com.amplifyframework.datastore.generated.model.ModelUserConnection.BuildStep
        public CopyOfBuilder nextToken(String str) {
            return (CopyOfBuilder) super.nextToken(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.items, this.nextToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelUserConnection.class != obj.getClass()) {
            return false;
        }
        ModelUserConnection modelUserConnection = (ModelUserConnection) obj;
        return s6c.m47909a(getItems(), modelUserConnection.getItems()) && s6c.m47909a(getNextToken(), modelUserConnection.getNextToken());
    }

    public List<User> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelUserConnection(List<User> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
