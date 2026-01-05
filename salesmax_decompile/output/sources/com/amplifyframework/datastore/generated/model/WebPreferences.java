package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class WebPreferences {
    private final String key;
    private final String value;

    public interface BuildStep {
        WebPreferences build();

        BuildStep key(String str);

        BuildStep value(String str);
    }

    public static class Builder implements BuildStep {
        private String key;
        private String value;

        @Override // com.amplifyframework.datastore.generated.model.WebPreferences.BuildStep
        public WebPreferences build() {
            return new WebPreferences(this.key, this.value);
        }

        @Override // com.amplifyframework.datastore.generated.model.WebPreferences.BuildStep
        public BuildStep key(String str) {
            this.key = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WebPreferences.BuildStep
        public BuildStep value(String str) {
            this.value = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2) {
            super(str, str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.WebPreferences.Builder, com.amplifyframework.datastore.generated.model.WebPreferences.BuildStep
        public CopyOfBuilder key(String str) {
            return (CopyOfBuilder) super.key(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WebPreferences.Builder, com.amplifyframework.datastore.generated.model.WebPreferences.BuildStep
        public CopyOfBuilder value(String str) {
            return (CopyOfBuilder) super.value(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.key, this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WebPreferences.class != obj.getClass()) {
            return false;
        }
        WebPreferences webPreferences = (WebPreferences) obj;
        return s6c.m47909a(getKey(), webPreferences.getKey()) && s6c.m47909a(getValue(), webPreferences.getValue());
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (getKey() + getValue()).hashCode();
    }

    private WebPreferences(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
