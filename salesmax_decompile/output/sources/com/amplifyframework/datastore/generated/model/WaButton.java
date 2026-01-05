package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class WaButton {
    private final String flow_action;
    private final String flow_id;
    private final String flow_json;
    private final String navigate_screen;
    private final String waNumber;
    private final String waText;
    private final String waType;
    private final String waUrl;

    public interface BuildStep {
        WaButton build();

        BuildStep flowAction(String str);

        BuildStep flowId(String str);

        BuildStep flowJson(String str);

        BuildStep navigateScreen(String str);

        BuildStep waNumber(String str);

        BuildStep waText(String str);

        BuildStep waType(String str);

        BuildStep waUrl(String str);
    }

    public static class Builder implements BuildStep {
        private String flow_action;
        private String flow_id;
        private String flow_json;
        private String navigate_screen;
        private String waNumber;
        private String waText;
        private String waType;
        private String waUrl;

        @Override // com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public WaButton build() {
            return new WaButton(this.waType, this.waText, this.waUrl, this.waNumber, this.flow_id, this.flow_json, this.flow_action, this.navigate_screen);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public BuildStep flowAction(String str) {
            this.flow_action = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public BuildStep flowId(String str) {
            this.flow_id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public BuildStep flowJson(String str) {
            this.flow_json = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public BuildStep navigateScreen(String str) {
            this.navigate_screen = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public BuildStep waNumber(String str) {
            this.waNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public BuildStep waText(String str) {
            this.waText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public BuildStep waType(String str) {
            this.waType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public BuildStep waUrl(String str) {
            this.waUrl = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.waType = str;
            this.waText = str2;
            this.waUrl = str3;
            this.waNumber = str4;
            this.flow_id = str5;
            this.flow_json = str6;
            this.flow_action = str7;
            this.navigate_screen = str8;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(str, str2, str3, str4, WaButton.this.flow_id, WaButton.this.flow_json, WaButton.this.flow_action, WaButton.this.navigate_screen);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.Builder, com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public CopyOfBuilder flowAction(String str) {
            return (CopyOfBuilder) super.flowAction(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.Builder, com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public CopyOfBuilder flowId(String str) {
            return (CopyOfBuilder) super.flowId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.Builder, com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public CopyOfBuilder flowJson(String str) {
            return (CopyOfBuilder) super.flowJson(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.Builder, com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public CopyOfBuilder navigateScreen(String str) {
            return (CopyOfBuilder) super.navigateScreen(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.Builder, com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public CopyOfBuilder waNumber(String str) {
            return (CopyOfBuilder) super.waNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.Builder, com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public CopyOfBuilder waText(String str) {
            return (CopyOfBuilder) super.waText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.Builder, com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public CopyOfBuilder waType(String str) {
            return (CopyOfBuilder) super.waType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaButton.Builder, com.amplifyframework.datastore.generated.model.WaButton.BuildStep
        public CopyOfBuilder waUrl(String str) {
            return (CopyOfBuilder) super.waUrl(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.waType, this.waText, this.waUrl, this.waNumber, this.flow_id, this.flow_json, this.flow_action, this.navigate_screen);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WaButton.class != obj.getClass()) {
            return false;
        }
        WaButton waButton = (WaButton) obj;
        return s6c.m47909a(getWaType(), waButton.getWaType()) && s6c.m47909a(getWaText(), waButton.getWaText()) && s6c.m47909a(getWaUrl(), waButton.getWaUrl()) && s6c.m47909a(getWaNumber(), waButton.getWaNumber()) && s6c.m47909a(getFlowId(), waButton.getFlowId()) && s6c.m47909a(getFlowJson(), waButton.getFlowJson()) && s6c.m47909a(getFlowAction(), waButton.getFlowAction()) && s6c.m47909a(getNavigateScreen(), waButton.getNavigateScreen());
    }

    public String getFlowAction() {
        return this.flow_action;
    }

    public String getFlowId() {
        return this.flow_id;
    }

    public String getFlowJson() {
        return this.flow_json;
    }

    public String getNavigateScreen() {
        return this.navigate_screen;
    }

    public String getWaNumber() {
        return this.waNumber;
    }

    public String getWaText() {
        return this.waText;
    }

    public String getWaType() {
        return this.waType;
    }

    public String getWaUrl() {
        return this.waUrl;
    }

    public int hashCode() {
        return (getWaType() + getWaText() + getWaUrl() + getWaNumber() + getFlowId() + getFlowJson() + getFlowAction() + getNavigateScreen()).hashCode();
    }

    private WaButton(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.waType = str;
        this.waText = str2;
        this.waUrl = str3;
        this.waNumber = str4;
        this.flow_id = str5;
        this.flow_json = str6;
        this.flow_action = str7;
        this.navigate_screen = str8;
    }
}
