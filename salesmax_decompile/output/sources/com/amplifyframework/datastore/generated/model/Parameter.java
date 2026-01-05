package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class Parameter {
    private final String parameter_name;

    /* renamed from: type, reason: collision with root package name */
    private final String f58103type;
    private final String value;

    public interface BuildStep {
        Parameter build();

        BuildStep parameterName(String str);

        BuildStep type(String str);

        BuildStep value(String str);
    }

    public static class Builder implements BuildStep {
        private String parameter_name;

        /* renamed from: type, reason: collision with root package name */
        private String f58104type;
        private String value;

        @Override // com.amplifyframework.datastore.generated.model.Parameter.BuildStep
        public Parameter build() {
            return new Parameter(this.f58104type, this.value, this.parameter_name);
        }

        @Override // com.amplifyframework.datastore.generated.model.Parameter.BuildStep
        public BuildStep parameterName(String str) {
            this.parameter_name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Parameter.BuildStep
        public BuildStep type(String str) {
            this.f58104type = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Parameter.BuildStep
        public BuildStep value(String str) {
            this.value = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3) {
            this.f58104type = str;
            this.value = str2;
            this.parameter_name = str3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3) {
            super(str, str2, Parameter.this.parameter_name);
        }

        @Override // com.amplifyframework.datastore.generated.model.Parameter.Builder, com.amplifyframework.datastore.generated.model.Parameter.BuildStep
        public CopyOfBuilder parameterName(String str) {
            return (CopyOfBuilder) super.parameterName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Parameter.Builder, com.amplifyframework.datastore.generated.model.Parameter.BuildStep
        public CopyOfBuilder type(String str) {
            return (CopyOfBuilder) super.type(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Parameter.Builder, com.amplifyframework.datastore.generated.model.Parameter.BuildStep
        public CopyOfBuilder value(String str) {
            return (CopyOfBuilder) super.value(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.f58103type, this.value, this.parameter_name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Parameter.class != obj.getClass()) {
            return false;
        }
        Parameter parameter = (Parameter) obj;
        return s6c.m47909a(getType(), parameter.getType()) && s6c.m47909a(getValue(), parameter.getValue()) && s6c.m47909a(getParameterName(), parameter.getParameterName());
    }

    public String getParameterName() {
        return this.parameter_name;
    }

    public String getType() {
        return this.f58103type;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (getType() + getValue() + getParameterName()).hashCode();
    }

    private Parameter(String str, String str2, String str3) {
        this.f58103type = str;
        this.value = str2;
        this.parameter_name = str3;
    }
}
