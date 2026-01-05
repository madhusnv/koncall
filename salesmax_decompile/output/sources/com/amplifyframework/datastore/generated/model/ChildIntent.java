package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class ChildIntent {
    private final String childBotId;
    private final String intent;

    public interface BuildStep {
        ChildIntent build();

        BuildStep childBotId(String str);

        BuildStep intent(String str);
    }

    public static class Builder implements BuildStep {
        private String childBotId;
        private String intent;

        @Override // com.amplifyframework.datastore.generated.model.ChildIntent.BuildStep
        public ChildIntent build() {
            return new ChildIntent(this.childBotId, this.intent);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChildIntent.BuildStep
        public BuildStep childBotId(String str) {
            this.childBotId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChildIntent.BuildStep
        public BuildStep intent(String str) {
            this.intent = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2) {
            this.childBotId = str;
            this.intent = str2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2) {
            super(str, str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChildIntent.Builder, com.amplifyframework.datastore.generated.model.ChildIntent.BuildStep
        public CopyOfBuilder childBotId(String str) {
            return (CopyOfBuilder) super.childBotId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChildIntent.Builder, com.amplifyframework.datastore.generated.model.ChildIntent.BuildStep
        public CopyOfBuilder intent(String str) {
            return (CopyOfBuilder) super.intent(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.childBotId, this.intent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChildIntent.class != obj.getClass()) {
            return false;
        }
        ChildIntent childIntent = (ChildIntent) obj;
        return s6c.m47909a(getChildBotId(), childIntent.getChildBotId()) && s6c.m47909a(getIntent(), childIntent.getIntent());
    }

    public String getChildBotId() {
        return this.childBotId;
    }

    public String getIntent() {
        return this.intent;
    }

    public int hashCode() {
        return (getChildBotId() + getIntent()).hashCode();
    }

    private ChildIntent(String str, String str2) {
        this.childBotId = str;
        this.intent = str2;
    }
}
