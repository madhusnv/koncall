package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class FlowActionPayload {
    private final String flowData;
    private final String screen;

    public interface BuildStep {
        FlowActionPayload build();

        BuildStep flowData(String str);

        BuildStep screen(String str);
    }

    public static class Builder implements BuildStep {
        private String flowData;
        private String screen;

        @Override // com.amplifyframework.datastore.generated.model.FlowActionPayload.BuildStep
        public FlowActionPayload build() {
            return new FlowActionPayload(this.screen, this.flowData);
        }

        @Override // com.amplifyframework.datastore.generated.model.FlowActionPayload.BuildStep
        public BuildStep flowData(String str) {
            this.flowData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FlowActionPayload.BuildStep
        public BuildStep screen(String str) {
            this.screen = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2) {
            this.screen = str;
            this.flowData = str2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2) {
            super(str, str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.FlowActionPayload.Builder, com.amplifyframework.datastore.generated.model.FlowActionPayload.BuildStep
        public CopyOfBuilder flowData(String str) {
            return (CopyOfBuilder) super.flowData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.FlowActionPayload.Builder, com.amplifyframework.datastore.generated.model.FlowActionPayload.BuildStep
        public CopyOfBuilder screen(String str) {
            return (CopyOfBuilder) super.screen(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.screen, this.flowData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FlowActionPayload.class != obj.getClass()) {
            return false;
        }
        FlowActionPayload flowActionPayload = (FlowActionPayload) obj;
        return s6c.m47909a(getScreen(), flowActionPayload.getScreen()) && s6c.m47909a(getFlowData(), flowActionPayload.getFlowData());
    }

    public String getFlowData() {
        return this.flowData;
    }

    public String getScreen() {
        return this.screen;
    }

    public int hashCode() {
        return (getScreen() + getFlowData()).hashCode();
    }

    private FlowActionPayload(String str, String str2) {
        this.screen = str;
        this.flowData = str2;
    }
}
