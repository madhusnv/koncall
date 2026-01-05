package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelEngagementConnection {
    private final List<Engagement> items;
    private final String nextToken;
    private final Temporal.Timestamp startedAt;

    public interface BuildStep {
        ModelEngagementConnection build();

        BuildStep items(List<Engagement> list);

        BuildStep nextToken(String str);

        BuildStep startedAt(Temporal.Timestamp timestamp);
    }

    public static class Builder implements BuildStep {
        private List<Engagement> items;
        private String nextToken;
        private Temporal.Timestamp startedAt;

        @Override // com.amplifyframework.datastore.generated.model.ModelEngagementConnection.BuildStep
        public ModelEngagementConnection build() {
            return new ModelEngagementConnection(this.items, this.nextToken, this.startedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelEngagementConnection.BuildStep
        public BuildStep items(List<Engagement> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelEngagementConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelEngagementConnection.BuildStep
        public BuildStep startedAt(Temporal.Timestamp timestamp) {
            this.startedAt = timestamp;
            return this;
        }

        public Builder() {
        }

        private Builder(List<Engagement> list, String str, Temporal.Timestamp timestamp) {
            this.items = list;
            this.nextToken = str;
            this.startedAt = timestamp;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ModelEngagementConnection.Builder, com.amplifyframework.datastore.generated.model.ModelEngagementConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<Engagement>) list);
        }

        private CopyOfBuilder(List<Engagement> list, String str, Temporal.Timestamp timestamp) {
            super(list, str, timestamp);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelEngagementConnection.Builder, com.amplifyframework.datastore.generated.model.ModelEngagementConnection.BuildStep
        public CopyOfBuilder items(List<Engagement> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelEngagementConnection.Builder, com.amplifyframework.datastore.generated.model.ModelEngagementConnection.BuildStep
        public CopyOfBuilder nextToken(String str) {
            return (CopyOfBuilder) super.nextToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelEngagementConnection.Builder, com.amplifyframework.datastore.generated.model.ModelEngagementConnection.BuildStep
        public CopyOfBuilder startedAt(Temporal.Timestamp timestamp) {
            return (CopyOfBuilder) super.startedAt(timestamp);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.items, this.nextToken, this.startedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelEngagementConnection.class != obj.getClass()) {
            return false;
        }
        ModelEngagementConnection modelEngagementConnection = (ModelEngagementConnection) obj;
        return s6c.m47909a(getItems(), modelEngagementConnection.getItems()) && s6c.m47909a(getNextToken(), modelEngagementConnection.getNextToken()) && s6c.m47909a(getStartedAt(), modelEngagementConnection.getStartedAt());
    }

    public List<Engagement> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public Temporal.Timestamp getStartedAt() {
        return this.startedAt;
    }

    public int hashCode() {
        return (getItems() + getNextToken() + getStartedAt()).hashCode();
    }

    private ModelEngagementConnection(List<Engagement> list, String str, Temporal.Timestamp timestamp) {
        this.items = list;
        this.nextToken = str;
        this.startedAt = timestamp;
    }
}
