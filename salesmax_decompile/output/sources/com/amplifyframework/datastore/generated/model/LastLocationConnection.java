package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class LastLocationConnection {
    private final List<ActivityLocation> items;
    private final String nextToken;

    public interface BuildStep {
        LastLocationConnection build();

        BuildStep items(List<ActivityLocation> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<ActivityLocation> items;
        private String nextToken;

        @Override // com.amplifyframework.datastore.generated.model.LastLocationConnection.BuildStep
        public LastLocationConnection build() {
            return new LastLocationConnection(this.items, this.nextToken);
        }

        @Override // com.amplifyframework.datastore.generated.model.LastLocationConnection.BuildStep
        public BuildStep items(List<ActivityLocation> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LastLocationConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public Builder() {
        }

        private Builder(List<ActivityLocation> list, String str) {
            this.items = list;
            this.nextToken = str;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.LastLocationConnection.Builder, com.amplifyframework.datastore.generated.model.LastLocationConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<ActivityLocation>) list);
        }

        private CopyOfBuilder(List<ActivityLocation> list, String str) {
            super(list, str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LastLocationConnection.Builder, com.amplifyframework.datastore.generated.model.LastLocationConnection.BuildStep
        public CopyOfBuilder items(List<ActivityLocation> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.LastLocationConnection.Builder, com.amplifyframework.datastore.generated.model.LastLocationConnection.BuildStep
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
        if (obj == null || LastLocationConnection.class != obj.getClass()) {
            return false;
        }
        LastLocationConnection lastLocationConnection = (LastLocationConnection) obj;
        return s6c.m47909a(getItems(), lastLocationConnection.getItems()) && s6c.m47909a(getNextToken(), lastLocationConnection.getNextToken());
    }

    public List<ActivityLocation> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private LastLocationConnection(List<ActivityLocation> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
