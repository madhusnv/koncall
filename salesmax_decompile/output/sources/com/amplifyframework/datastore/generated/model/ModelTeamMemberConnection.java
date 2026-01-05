package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelTeamMemberConnection {
    private final List<TeamMember> items;
    private final String nextToken;

    public interface BuildStep {
        ModelTeamMemberConnection build();

        BuildStep items(List<TeamMember> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<TeamMember> items;
        private String nextToken;

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamMemberConnection.BuildStep
        public ModelTeamMemberConnection build() {
            return new ModelTeamMemberConnection(this.items, this.nextToken);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamMemberConnection.BuildStep
        public BuildStep items(List<TeamMember> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamMemberConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ModelTeamMemberConnection.Builder, com.amplifyframework.datastore.generated.model.ModelTeamMemberConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<TeamMember>) list);
        }

        private CopyOfBuilder(List<TeamMember> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamMemberConnection.Builder, com.amplifyframework.datastore.generated.model.ModelTeamMemberConnection.BuildStep
        public CopyOfBuilder items(List<TeamMember> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelTeamMemberConnection.Builder, com.amplifyframework.datastore.generated.model.ModelTeamMemberConnection.BuildStep
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
        if (obj == null || ModelTeamMemberConnection.class != obj.getClass()) {
            return false;
        }
        ModelTeamMemberConnection modelTeamMemberConnection = (ModelTeamMemberConnection) obj;
        return s6c.m47909a(getItems(), modelTeamMemberConnection.getItems()) && s6c.m47909a(getNextToken(), modelTeamMemberConnection.getNextToken());
    }

    public List<TeamMember> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelTeamMemberConnection(List<TeamMember> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
