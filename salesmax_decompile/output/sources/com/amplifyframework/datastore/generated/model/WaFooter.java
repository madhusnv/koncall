package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class WaFooter {
    private final String waText;
    private final String waType;

    public interface BuildStep {
        WaFooter build();

        BuildStep waText(String str);

        BuildStep waType(String str);
    }

    public static class Builder implements BuildStep {
        private String waText;
        private String waType;

        @Override // com.amplifyframework.datastore.generated.model.WaFooter.BuildStep
        public WaFooter build() {
            return new WaFooter(this.waType, this.waText);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaFooter.BuildStep
        public BuildStep waText(String str) {
            this.waText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaFooter.BuildStep
        public BuildStep waType(String str) {
            this.waType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2) {
            this.waType = str;
            this.waText = str2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2) {
            super(str, str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaFooter.Builder, com.amplifyframework.datastore.generated.model.WaFooter.BuildStep
        public CopyOfBuilder waText(String str) {
            return (CopyOfBuilder) super.waText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaFooter.Builder, com.amplifyframework.datastore.generated.model.WaFooter.BuildStep
        public CopyOfBuilder waType(String str) {
            return (CopyOfBuilder) super.waType(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.waType, this.waText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WaFooter.class != obj.getClass()) {
            return false;
        }
        WaFooter waFooter = (WaFooter) obj;
        return s6c.m47909a(getWaType(), waFooter.getWaType()) && s6c.m47909a(getWaText(), waFooter.getWaText());
    }

    public String getWaText() {
        return this.waText;
    }

    public String getWaType() {
        return this.waType;
    }

    public int hashCode() {
        return (getWaType() + getWaText()).hashCode();
    }

    private WaFooter(String str, String str2) {
        this.waType = str;
        this.waText = str2;
    }
}
