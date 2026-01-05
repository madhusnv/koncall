package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class MappedVariable {
    private final String fallBackValue;
    private final Integer index;
    private final String mappedObject;
    private final String mappedProperty;
    private final String sampleValue;
    private final String sub_type;
    private final String taType;
    private final String variableId;

    public interface BuildStep {
        MappedVariable build();

        BuildStep fallBackValue(String str);

        BuildStep index(Integer num);

        BuildStep mappedObject(String str);

        BuildStep mappedProperty(String str);

        BuildStep sampleValue(String str);

        BuildStep subType(String str);

        BuildStep taType(String str);

        BuildStep variableId(String str);
    }

    public static class Builder implements BuildStep {
        private String fallBackValue;
        private Integer index;
        private String mappedObject;
        private String mappedProperty;
        private String sampleValue;
        private String sub_type;
        private String taType;
        private String variableId;

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public MappedVariable build() {
            return new MappedVariable(this.taType, this.variableId, this.mappedObject, this.mappedProperty, this.fallBackValue, this.sampleValue, this.index, this.sub_type);
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public BuildStep fallBackValue(String str) {
            this.fallBackValue = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public BuildStep index(Integer num) {
            this.index = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public BuildStep mappedObject(String str) {
            this.mappedObject = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public BuildStep mappedProperty(String str) {
            this.mappedProperty = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public BuildStep sampleValue(String str) {
            this.sampleValue = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public BuildStep subType(String str) {
            this.sub_type = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public BuildStep taType(String str) {
            this.taType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public BuildStep variableId(String str) {
            this.variableId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7) {
            this.taType = str;
            this.variableId = str2;
            this.mappedObject = str3;
            this.mappedProperty = str4;
            this.fallBackValue = str5;
            this.sampleValue = str6;
            this.index = num;
            this.sub_type = str7;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7) {
            super(str, str2, str3, str4, str5, str6, num, MappedVariable.this.sub_type);
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.Builder, com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public CopyOfBuilder fallBackValue(String str) {
            return (CopyOfBuilder) super.fallBackValue(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.Builder, com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public CopyOfBuilder index(Integer num) {
            return (CopyOfBuilder) super.index(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.Builder, com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public CopyOfBuilder mappedObject(String str) {
            return (CopyOfBuilder) super.mappedObject(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.Builder, com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public CopyOfBuilder mappedProperty(String str) {
            return (CopyOfBuilder) super.mappedProperty(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.Builder, com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public CopyOfBuilder sampleValue(String str) {
            return (CopyOfBuilder) super.sampleValue(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.Builder, com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public CopyOfBuilder subType(String str) {
            return (CopyOfBuilder) super.subType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.Builder, com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public CopyOfBuilder taType(String str) {
            return (CopyOfBuilder) super.taType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MappedVariable.Builder, com.amplifyframework.datastore.generated.model.MappedVariable.BuildStep
        public CopyOfBuilder variableId(String str) {
            return (CopyOfBuilder) super.variableId(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.taType, this.variableId, this.mappedObject, this.mappedProperty, this.fallBackValue, this.sampleValue, this.index, this.sub_type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MappedVariable.class != obj.getClass()) {
            return false;
        }
        MappedVariable mappedVariable = (MappedVariable) obj;
        return s6c.m47909a(getTaType(), mappedVariable.getTaType()) && s6c.m47909a(getVariableId(), mappedVariable.getVariableId()) && s6c.m47909a(getMappedObject(), mappedVariable.getMappedObject()) && s6c.m47909a(getMappedProperty(), mappedVariable.getMappedProperty()) && s6c.m47909a(getFallBackValue(), mappedVariable.getFallBackValue()) && s6c.m47909a(getSampleValue(), mappedVariable.getSampleValue()) && s6c.m47909a(getIndex(), mappedVariable.getIndex()) && s6c.m47909a(getSubType(), mappedVariable.getSubType());
    }

    public String getFallBackValue() {
        return this.fallBackValue;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getMappedObject() {
        return this.mappedObject;
    }

    public String getMappedProperty() {
        return this.mappedProperty;
    }

    public String getSampleValue() {
        return this.sampleValue;
    }

    public String getSubType() {
        return this.sub_type;
    }

    public String getTaType() {
        return this.taType;
    }

    public String getVariableId() {
        return this.variableId;
    }

    public int hashCode() {
        return (getTaType() + getVariableId() + getMappedObject() + getMappedProperty() + getFallBackValue() + getSampleValue() + getIndex() + getSubType()).hashCode();
    }

    private MappedVariable(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7) {
        this.taType = str;
        this.variableId = str2;
        this.mappedObject = str3;
        this.mappedProperty = str4;
        this.fallBackValue = str5;
        this.sampleValue = str6;
        this.index = num;
        this.sub_type = str7;
    }
}
