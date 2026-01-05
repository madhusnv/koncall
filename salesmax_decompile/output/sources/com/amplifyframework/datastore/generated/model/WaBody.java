package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class WaBody {
    private final String waExample;
    private final String waText;
    private final String waType;

    public interface BuildStep {
        WaBody build();

        BuildStep waExample(String str);

        BuildStep waText(String str);

        BuildStep waType(String str);
    }

    public static class Builder implements BuildStep {
        private String waExample;
        private String waText;
        private String waType;

        @Override // com.amplifyframework.datastore.generated.model.WaBody.BuildStep
        public WaBody build() {
            return new WaBody(this.waType, this.waText, this.waExample);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaBody.BuildStep
        public BuildStep waExample(String str) {
            this.waExample = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaBody.BuildStep
        public BuildStep waText(String str) {
            this.waText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaBody.BuildStep
        public BuildStep waType(String str) {
            this.waType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3) {
            this.waType = str;
            this.waText = str2;
            this.waExample = str3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3) {
            super(str, str2, str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaBody.Builder, com.amplifyframework.datastore.generated.model.WaBody.BuildStep
        public CopyOfBuilder waExample(String str) {
            return (CopyOfBuilder) super.waExample(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaBody.Builder, com.amplifyframework.datastore.generated.model.WaBody.BuildStep
        public CopyOfBuilder waText(String str) {
            return (CopyOfBuilder) super.waText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaBody.Builder, com.amplifyframework.datastore.generated.model.WaBody.BuildStep
        public CopyOfBuilder waType(String str) {
            return (CopyOfBuilder) super.waType(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.waType, this.waText, this.waExample);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WaBody.class != obj.getClass()) {
            return false;
        }
        WaBody waBody = (WaBody) obj;
        return s6c.m47909a(getWaType(), waBody.getWaType()) && s6c.m47909a(getWaText(), waBody.getWaText()) && s6c.m47909a(getWaExample(), waBody.getWaExample());
    }

    public String getWaExample() {
        return this.waExample;
    }

    public String getWaText() {
        return this.waText;
    }

    public String getWaType() {
        return this.waType;
    }

    public int hashCode() {
        return (getWaType() + getWaText() + getWaExample()).hashCode();
    }

    private WaBody(String str, String str2, String str3) {
        this.waType = str;
        this.waText = str2;
        this.waExample = str3;
    }
}
