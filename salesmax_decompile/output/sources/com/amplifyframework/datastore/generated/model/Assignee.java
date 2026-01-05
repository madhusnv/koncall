package com.amplifyframework.datastore.generated.model;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class Assignee {
    private final Boolean assignToAllIfTeam;
    private final Boolean assignToReporteesIfTeam;
    private final String assigneeId;
    private final AssigneeType assigneeType;
    private final Integer maxLoading;
    private final String primaryTeamIdIfUser;
    private final Priority priority;
    private final Boolean skipDistribution;

    public interface AssigneeIdStep {
        AssigneeTypeStep assigneeId(String str);
    }

    public interface AssigneeTypeStep {
        BuildStep assigneeType(AssigneeType assigneeType);
    }

    public interface BuildStep {
        BuildStep assignToAllIfTeam(Boolean bool);

        BuildStep assignToReporteesIfTeam(Boolean bool);

        Assignee build();

        BuildStep maxLoading(Integer num);

        BuildStep primaryTeamIdIfUser(String str);

        BuildStep priority(Priority priority);

        BuildStep skipDistribution(Boolean bool);
    }

    public static class Builder implements AssigneeIdStep, AssigneeTypeStep, BuildStep {
        private Boolean assignToAllIfTeam;
        private Boolean assignToReporteesIfTeam;
        private String assigneeId;
        private AssigneeType assigneeType;
        private Integer maxLoading;
        private String primaryTeamIdIfUser;
        private Priority priority;
        private Boolean skipDistribution;

        @Override // com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public BuildStep assignToAllIfTeam(Boolean bool) {
            this.assignToAllIfTeam = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public BuildStep assignToReporteesIfTeam(Boolean bool) {
            this.assignToReporteesIfTeam = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.AssigneeIdStep
        public AssigneeTypeStep assigneeId(String str) {
            Objects.requireNonNull(str);
            this.assigneeId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.AssigneeTypeStep
        public BuildStep assigneeType(AssigneeType assigneeType) {
            Objects.requireNonNull(assigneeType);
            this.assigneeType = assigneeType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public Assignee build() {
            return new Assignee(this.assigneeId, this.assigneeType, this.primaryTeamIdIfUser, this.priority, this.maxLoading, this.assignToReporteesIfTeam, this.assignToAllIfTeam, this.skipDistribution);
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public BuildStep maxLoading(Integer num) {
            this.maxLoading = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public BuildStep primaryTeamIdIfUser(String str) {
            this.primaryTeamIdIfUser = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public BuildStep priority(Priority priority) {
            this.priority = priority;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public BuildStep skipDistribution(Boolean bool) {
            this.skipDistribution = bool;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, AssigneeType assigneeType, String str2, Priority priority, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
            this.assigneeId = str;
            this.assigneeType = assigneeType;
            this.primaryTeamIdIfUser = str2;
            this.priority = priority;
            this.maxLoading = num;
            this.assignToReporteesIfTeam = bool;
            this.assignToAllIfTeam = bool2;
            this.skipDistribution = bool3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, AssigneeType assigneeType, String str2, Priority priority, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
            super(str, assigneeType, str2, priority, num, bool, bool2, bool3);
            Objects.requireNonNull(str);
            Objects.requireNonNull(assigneeType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.Builder, com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public CopyOfBuilder assignToAllIfTeam(Boolean bool) {
            return (CopyOfBuilder) super.assignToAllIfTeam(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.Builder, com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public CopyOfBuilder assignToReporteesIfTeam(Boolean bool) {
            return (CopyOfBuilder) super.assignToReporteesIfTeam(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.Builder, com.amplifyframework.datastore.generated.model.Assignee.AssigneeIdStep
        public CopyOfBuilder assigneeId(String str) {
            return (CopyOfBuilder) super.assigneeId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.Builder, com.amplifyframework.datastore.generated.model.Assignee.AssigneeTypeStep
        public CopyOfBuilder assigneeType(AssigneeType assigneeType) {
            return (CopyOfBuilder) super.assigneeType(assigneeType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.Builder, com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public CopyOfBuilder maxLoading(Integer num) {
            return (CopyOfBuilder) super.maxLoading(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.Builder, com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public CopyOfBuilder primaryTeamIdIfUser(String str) {
            return (CopyOfBuilder) super.primaryTeamIdIfUser(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.Builder, com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public CopyOfBuilder priority(Priority priority) {
            return (CopyOfBuilder) super.priority(priority);
        }

        @Override // com.amplifyframework.datastore.generated.model.Assignee.Builder, com.amplifyframework.datastore.generated.model.Assignee.BuildStep
        public CopyOfBuilder skipDistribution(Boolean bool) {
            return (CopyOfBuilder) super.skipDistribution(bool);
        }
    }

    public static AssigneeIdStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.assigneeId, this.assigneeType, this.primaryTeamIdIfUser, this.priority, this.maxLoading, this.assignToReporteesIfTeam, this.assignToAllIfTeam, this.skipDistribution);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Assignee.class != obj.getClass()) {
            return false;
        }
        Assignee assignee = (Assignee) obj;
        return s6c.m47909a(getAssigneeId(), assignee.getAssigneeId()) && s6c.m47909a(getAssigneeType(), assignee.getAssigneeType()) && s6c.m47909a(getPrimaryTeamIdIfUser(), assignee.getPrimaryTeamIdIfUser()) && s6c.m47909a(getPriority(), assignee.getPriority()) && s6c.m47909a(getMaxLoading(), assignee.getMaxLoading()) && s6c.m47909a(getAssignToReporteesIfTeam(), assignee.getAssignToReporteesIfTeam()) && s6c.m47909a(getAssignToAllIfTeam(), assignee.getAssignToAllIfTeam()) && s6c.m47909a(getSkipDistribution(), assignee.getSkipDistribution());
    }

    public Boolean getAssignToAllIfTeam() {
        return this.assignToAllIfTeam;
    }

    public Boolean getAssignToReporteesIfTeam() {
        return this.assignToReporteesIfTeam;
    }

    public String getAssigneeId() {
        return this.assigneeId;
    }

    public AssigneeType getAssigneeType() {
        return this.assigneeType;
    }

    public Integer getMaxLoading() {
        return this.maxLoading;
    }

    public String getPrimaryTeamIdIfUser() {
        return this.primaryTeamIdIfUser;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public Boolean getSkipDistribution() {
        return this.skipDistribution;
    }

    public int hashCode() {
        return (getAssigneeId() + getAssigneeType() + getPrimaryTeamIdIfUser() + getPriority() + getMaxLoading() + getAssignToReporteesIfTeam() + getAssignToAllIfTeam() + getSkipDistribution()).hashCode();
    }

    private Assignee(String str, AssigneeType assigneeType, String str2, Priority priority, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        this.assigneeId = str;
        this.assigneeType = assigneeType;
        this.primaryTeamIdIfUser = str2;
        this.priority = priority;
        this.maxLoading = num;
        this.assignToReporteesIfTeam = bool;
        this.assignToAllIfTeam = bool2;
        this.skipDistribution = bool3;
    }
}
