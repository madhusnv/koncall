package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelCommentConnection {
    private final List<Comment> items;
    private final String nextToken;

    public interface BuildStep {
        ModelCommentConnection build();

        BuildStep items(List<Comment> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<Comment> items;
        private String nextToken;

        @Override // com.amplifyframework.datastore.generated.model.ModelCommentConnection.BuildStep
        public ModelCommentConnection build() {
            return new ModelCommentConnection(this.items, this.nextToken);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelCommentConnection.BuildStep
        public BuildStep items(List<Comment> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelCommentConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ModelCommentConnection.Builder, com.amplifyframework.datastore.generated.model.ModelCommentConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<Comment>) list);
        }

        private CopyOfBuilder(List<Comment> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelCommentConnection.Builder, com.amplifyframework.datastore.generated.model.ModelCommentConnection.BuildStep
        public CopyOfBuilder items(List<Comment> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelCommentConnection.Builder, com.amplifyframework.datastore.generated.model.ModelCommentConnection.BuildStep
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
        if (obj == null || ModelCommentConnection.class != obj.getClass()) {
            return false;
        }
        ModelCommentConnection modelCommentConnection = (ModelCommentConnection) obj;
        return s6c.m47909a(getItems(), modelCommentConnection.getItems()) && s6c.m47909a(getNextToken(), modelCommentConnection.getNextToken());
    }

    public List<Comment> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelCommentConnection(List<Comment> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
