package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class WaHeader {
    private final String waExample;
    private final String waFormat;
    private final String waText;
    private final String waType;

    public interface BuildStep {
        WaHeader build();

        BuildStep waExample(String str);

        BuildStep waFormat(String str);

        BuildStep waText(String str);

        BuildStep waType(String str);
    }

    public static class Builder implements BuildStep {
        private String waExample;
        private String waFormat;
        private String waText;
        private String waType;

        @Override // com.amplifyframework.datastore.generated.model.WaHeader.BuildStep
        public WaHeader build() {
            return new WaHeader(this.waType, this.waFormat, this.waText, this.waExample);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaHeader.BuildStep
        public BuildStep waExample(String str) {
            this.waExample = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaHeader.BuildStep
        public BuildStep waFormat(String str) {
            this.waFormat = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaHeader.BuildStep
        public BuildStep waText(String str) {
            this.waText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaHeader.BuildStep
        public BuildStep waType(String str) {
            this.waType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4) {
            this.waType = str;
            this.waFormat = str2;
            this.waText = str3;
            this.waExample = str4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaHeader.Builder, com.amplifyframework.datastore.generated.model.WaHeader.BuildStep
        public CopyOfBuilder waExample(String str) {
            return (CopyOfBuilder) super.waExample(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaHeader.Builder, com.amplifyframework.datastore.generated.model.WaHeader.BuildStep
        public CopyOfBuilder waFormat(String str) {
            return (CopyOfBuilder) super.waFormat(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaHeader.Builder, com.amplifyframework.datastore.generated.model.WaHeader.BuildStep
        public CopyOfBuilder waText(String str) {
            return (CopyOfBuilder) super.waText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaHeader.Builder, com.amplifyframework.datastore.generated.model.WaHeader.BuildStep
        public CopyOfBuilder waType(String str) {
            return (CopyOfBuilder) super.waType(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.waType, this.waFormat, this.waText, this.waExample);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WaHeader.class != obj.getClass()) {
            return false;
        }
        WaHeader waHeader = (WaHeader) obj;
        return s6c.m47909a(getWaType(), waHeader.getWaType()) && s6c.m47909a(getWaFormat(), waHeader.getWaFormat()) && s6c.m47909a(getWaText(), waHeader.getWaText()) && s6c.m47909a(getWaExample(), waHeader.getWaExample());
    }

    public String getWaExample() {
        return this.waExample;
    }

    public String getWaFormat() {
        return this.waFormat;
    }

    public String getWaText() {
        return this.waText;
    }

    public String getWaType() {
        return this.waType;
    }

    public int hashCode() {
        return (getWaType() + getWaFormat() + getWaText() + getWaExample()).hashCode();
    }

    private WaHeader(String str, String str2, String str3, String str4) {
        this.waType = str;
        this.waFormat = str2;
        this.waText = str3;
        this.waExample = str4;
    }
}
