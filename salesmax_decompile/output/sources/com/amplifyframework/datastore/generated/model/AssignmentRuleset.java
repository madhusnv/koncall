package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AssignmentRuleset {
    private final List<Assignee> assigneeSet;
    private final String assigneeSetCondition;
    private final DistributionType distributionType;
    private final String incomingCondition;

    public interface BuildStep {
        BuildStep assigneeSet(List<Assignee> list);

        BuildStep assigneeSetCondition(String str);

        AssignmentRuleset build();

        BuildStep distributionType(DistributionType distributionType);

        BuildStep incomingCondition(String str);
    }

    public static class Builder implements BuildStep {
        private List<Assignee> assigneeSet;
        private String assigneeSetCondition;
        private DistributionType distributionType;
        private String incomingCondition;

        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public BuildStep assigneeSet(List<Assignee> list) {
            this.assigneeSet = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public BuildStep assigneeSetCondition(String str) {
            this.assigneeSetCondition = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public AssignmentRuleset build() {
            return new AssignmentRuleset(this.incomingCondition, this.assigneeSet, this.assigneeSetCondition, this.distributionType);
        }

        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public BuildStep distributionType(DistributionType distributionType) {
            this.distributionType = distributionType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public BuildStep incomingCondition(String str) {
            this.incomingCondition = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, List<Assignee> list, String str2, DistributionType distributionType) {
            this.incomingCondition = str;
            this.assigneeSet = list;
            this.assigneeSetCondition = str2;
            this.distributionType = distributionType;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.Builder, com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public /* bridge */ /* synthetic */ BuildStep assigneeSet(List list) {
            return assigneeSet((List<Assignee>) list);
        }

        private CopyOfBuilder(String str, List<Assignee> list, String str2, DistributionType distributionType) {
            super(str, list, str2, distributionType);
        }

        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.Builder, com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public CopyOfBuilder assigneeSet(List<Assignee> list) {
            return (CopyOfBuilder) super.assigneeSet(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.Builder, com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public CopyOfBuilder assigneeSetCondition(String str) {
            return (CopyOfBuilder) super.assigneeSetCondition(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.Builder, com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public CopyOfBuilder distributionType(DistributionType distributionType) {
            return (CopyOfBuilder) super.distributionType(distributionType);
        }

        @Override // com.amplifyframework.datastore.generated.model.AssignmentRuleset.Builder, com.amplifyframework.datastore.generated.model.AssignmentRuleset.BuildStep
        public CopyOfBuilder incomingCondition(String str) {
            return (CopyOfBuilder) super.incomingCondition(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.incomingCondition, this.assigneeSet, this.assigneeSetCondition, this.distributionType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AssignmentRuleset.class != obj.getClass()) {
            return false;
        }
        AssignmentRuleset assignmentRuleset = (AssignmentRuleset) obj;
        return s6c.m47909a(getIncomingCondition(), assignmentRuleset.getIncomingCondition()) && s6c.m47909a(getAssigneeSet(), assignmentRuleset.getAssigneeSet()) && s6c.m47909a(getAssigneeSetCondition(), assignmentRuleset.getAssigneeSetCondition()) && s6c.m47909a(getDistributionType(), assignmentRuleset.getDistributionType());
    }

    public List<Assignee> getAssigneeSet() {
        return this.assigneeSet;
    }

    public String getAssigneeSetCondition() {
        return this.assigneeSetCondition;
    }

    public DistributionType getDistributionType() {
        return this.distributionType;
    }

    public String getIncomingCondition() {
        return this.incomingCondition;
    }

    public int hashCode() {
        return (getIncomingCondition() + getAssigneeSet() + getAssigneeSetCondition() + getDistributionType()).hashCode();
    }

    private AssignmentRuleset(String str, List<Assignee> list, String str2, DistributionType distributionType) {
        this.incomingCondition = str;
        this.assigneeSet = list;
        this.assigneeSetCondition = str2;
        this.distributionType = distributionType;
    }
}
