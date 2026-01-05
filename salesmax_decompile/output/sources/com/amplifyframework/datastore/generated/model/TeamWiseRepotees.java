package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class TeamWiseRepotees {
    private final String teamId;
    private final List<String> users;

    public interface BuildStep {
        TeamWiseRepotees build();

        BuildStep teamId(String str);

        BuildStep users(List<String> list);
    }

    public static class Builder implements BuildStep {
        private String teamId;
        private List<String> users;

        @Override // com.amplifyframework.datastore.generated.model.TeamWiseRepotees.BuildStep
        public TeamWiseRepotees build() {
            return new TeamWiseRepotees(this.teamId, this.users);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamWiseRepotees.BuildStep
        public BuildStep teamId(String str) {
            this.teamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamWiseRepotees.BuildStep
        public BuildStep users(List<String> list) {
            this.users = list;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, List<String> list) {
            this.teamId = str;
            this.users = list;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.TeamWiseRepotees.Builder, com.amplifyframework.datastore.generated.model.TeamWiseRepotees.BuildStep
        public /* bridge */ /* synthetic */ BuildStep users(List list) {
            return users((List<String>) list);
        }

        private CopyOfBuilder(String str, List<String> list) {
            super(str, list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamWiseRepotees.Builder, com.amplifyframework.datastore.generated.model.TeamWiseRepotees.BuildStep
        public CopyOfBuilder teamId(String str) {
            return (CopyOfBuilder) super.teamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamWiseRepotees.Builder, com.amplifyframework.datastore.generated.model.TeamWiseRepotees.BuildStep
        public CopyOfBuilder users(List<String> list) {
            return (CopyOfBuilder) super.users(list);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.teamId, this.users);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TeamWiseRepotees.class != obj.getClass()) {
            return false;
        }
        TeamWiseRepotees teamWiseRepotees = (TeamWiseRepotees) obj;
        return s6c.m47909a(getTeamId(), teamWiseRepotees.getTeamId()) && s6c.m47909a(getUsers(), teamWiseRepotees.getUsers());
    }

    public String getTeamId() {
        return this.teamId;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (getTeamId() + getUsers()).hashCode();
    }

    private TeamWiseRepotees(String str, List<String> list) {
        this.teamId = str;
        this.users = list;
    }
}
