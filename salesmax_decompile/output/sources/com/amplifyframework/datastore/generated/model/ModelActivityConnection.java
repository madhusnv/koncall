package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelActivityConnection {
    private final List<Activity> items;
    private final String nextToken;
    private final Temporal.Timestamp startedAt;

    public interface BuildStep {
        ModelActivityConnection build();

        BuildStep items(List<Activity> list);

        BuildStep nextToken(String str);

        BuildStep startedAt(Temporal.Timestamp timestamp);
    }

    public static class Builder implements BuildStep {
        private List<Activity> items;
        private String nextToken;
        private Temporal.Timestamp startedAt;

        @Override // com.amplifyframework.datastore.generated.model.ModelActivityConnection.BuildStep
        public ModelActivityConnection build() {
            return new ModelActivityConnection(this.items, this.nextToken, this.startedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelActivityConnection.BuildStep
        public BuildStep items(List<Activity> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelActivityConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelActivityConnection.BuildStep
        public BuildStep startedAt(Temporal.Timestamp timestamp) {
            this.startedAt = timestamp;
            return this;
        }

        public Builder() {
        }

        private Builder(List<Activity> list, String str, Temporal.Timestamp timestamp) {
            this.items = list;
            this.nextToken = str;
            this.startedAt = timestamp;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ModelActivityConnection.Builder, com.amplifyframework.datastore.generated.model.ModelActivityConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<Activity>) list);
        }

        private CopyOfBuilder(List<Activity> list, String str, Temporal.Timestamp timestamp) {
            super(list, str, timestamp);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelActivityConnection.Builder, com.amplifyframework.datastore.generated.model.ModelActivityConnection.BuildStep
        public CopyOfBuilder items(List<Activity> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelActivityConnection.Builder, com.amplifyframework.datastore.generated.model.ModelActivityConnection.BuildStep
        public CopyOfBuilder nextToken(String str) {
            return (CopyOfBuilder) super.nextToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelActivityConnection.Builder, com.amplifyframework.datastore.generated.model.ModelActivityConnection.BuildStep
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
        if (obj == null || ModelActivityConnection.class != obj.getClass()) {
            return false;
        }
        ModelActivityConnection modelActivityConnection = (ModelActivityConnection) obj;
        return s6c.m47909a(getItems(), modelActivityConnection.getItems()) && s6c.m47909a(getNextToken(), modelActivityConnection.getNextToken()) && s6c.m47909a(getStartedAt(), modelActivityConnection.getStartedAt());
    }

    public List<Activity> getItems() {
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

    private ModelActivityConnection(List<Activity> list, String str, Temporal.Timestamp timestamp) {
        this.items = list;
        this.nextToken = str;
        this.startedAt = timestamp;
    }
}
