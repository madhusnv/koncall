package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelTeamConnection {
    private final List<Team> items;
    private final String nextToken;

    public interface BuildStep {
        ModelTeamConnection build();

        BuildStep items(List<Team> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<Team> items;
        private String nextToken;

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamConnection.BuildStep
        public ModelTeamConnection build() {
            return new ModelTeamConnection(this.items, this.nextToken);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamConnection.BuildStep
        public BuildStep items(List<Team> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ModelTeamConnection.Builder, com.amplifyframework.datastore.generated.model.ModelTeamConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<Team>) list);
        }

        private CopyOfBuilder(List<Team> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamConnection.Builder, com.amplifyframework.datastore.generated.model.ModelTeamConnection.BuildStep
        public CopyOfBuilder items(List<Team> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamConnection.Builder, com.amplifyframework.datastore.generated.model.ModelTeamConnection.BuildStep
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
        if (obj == null || ModelTeamConnection.class != obj.getClass()) {
            return false;
        }
        ModelTeamConnection modelTeamConnection = (ModelTeamConnection) obj;
        return s6c.m47909a(getItems(), modelTeamConnection.getItems()) && s6c.m47909a(getNextToken(), modelTeamConnection.getNextToken());
    }

    public List<Team> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelTeamConnection(List<Team> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
