package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelUserAuthorizationConnection {
    private final List<UserAuthorization> items;
    private final String nextToken;

    public interface BuildStep {
        ModelUserAuthorizationConnection build();

        BuildStep items(List<UserAuthorization> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<UserAuthorization> items;
        private String nextToken;

        @Override // com.amplifyframework.datastore.generated.model.ModelUserAuthorizationConnection.BuildStep
        public ModelUserAuthorizationConnection build() {
            return new ModelUserAuthorizationConnection(this.items, this.nextToken);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelUserAuthorizationConnection.BuildStep
        public BuildStep items(List<UserAuthorization> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelUserAuthorizationConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ModelUserAuthorizationConnection.Builder, com.amplifyframework.datastore.generated.model.ModelUserAuthorizationConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<UserAuthorization>) list);
        }

        private CopyOfBuilder(List<UserAuthorization> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelUserAuthorizationConnection.Builder, com.amplifyframework.datastore.generated.model.ModelUserAuthorizationConnection.BuildStep
        public CopyOfBuilder items(List<UserAuthorization> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelUserAuthorizationConnection.Builder, com.amplifyframework.datastore.generated.model.ModelUserAuthorizationConnection.BuildStep
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
        if (obj == null || ModelUserAuthorizationConnection.class != obj.getClass()) {
            return false;
        }
        ModelUserAuthorizationConnection modelUserAuthorizationConnection = (ModelUserAuthorizationConnection) obj;
        return s6c.m47909a(getItems(), modelUserAuthorizationConnection.getItems()) && s6c.m47909a(getNextToken(), modelUserAuthorizationConnection.getNextToken());
    }

    public List<UserAuthorization> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelUserAuthorizationConnection(List<UserAuthorization> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
