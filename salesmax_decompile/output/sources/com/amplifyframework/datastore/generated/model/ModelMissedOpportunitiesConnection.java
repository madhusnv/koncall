package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelMissedOpportunitiesConnection {
    private final List<MissedOpportunities> items;
    private final String nextToken;

    public interface BuildStep {
        ModelMissedOpportunitiesConnection build();

        BuildStep items(List<MissedOpportunities> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<MissedOpportunities> items;
        private String nextToken;

        @Override // com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection.BuildStep
        public ModelMissedOpportunitiesConnection build() {
            return new ModelMissedOpportunitiesConnection(this.items, this.nextToken);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection.BuildStep
        public BuildStep items(List<MissedOpportunities> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public Builder() {
        }

        private Builder(List<MissedOpportunities> list, String str) {
            this.items = list;
            this.nextToken = str;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection.Builder, com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<MissedOpportunities>) list);
        }

        private CopyOfBuilder(List<MissedOpportunities> list, String str) {
            super(list, str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection.Builder, com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection.BuildStep
        public CopyOfBuilder items(List<MissedOpportunities> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection.Builder, com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection.BuildStep
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
        if (obj == null || ModelMissedOpportunitiesConnection.class != obj.getClass()) {
            return false;
        }
        ModelMissedOpportunitiesConnection modelMissedOpportunitiesConnection = (ModelMissedOpportunitiesConnection) obj;
        return s6c.m47909a(getItems(), modelMissedOpportunitiesConnection.getItems()) && s6c.m47909a(getNextToken(), modelMissedOpportunitiesConnection.getNextToken());
    }

    public List<MissedOpportunities> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelMissedOpportunitiesConnection(List<MissedOpportunities> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
