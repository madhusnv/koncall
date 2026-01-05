package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class TemplateParameter {
    private final String index;
    private final List<Parameter> parameters;
    private final String sub_type;
    private final String taType;

    public interface BuildStep {
        TemplateParameter build();

        BuildStep index(String str);

        BuildStep parameters(List<Parameter> list);

        BuildStep subType(String str);

        BuildStep taType(String str);
    }

    public static class Builder implements BuildStep {
        private String index;
        private List<Parameter> parameters;
        private String sub_type;
        private String taType;

        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public TemplateParameter build() {
            return new TemplateParameter(this.taType, this.sub_type, this.index, this.parameters);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public BuildStep index(String str) {
            this.index = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public BuildStep parameters(List<Parameter> list) {
            this.parameters = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public BuildStep subType(String str) {
            this.sub_type = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public BuildStep taType(String str) {
            this.taType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, List<Parameter> list) {
            this.taType = str;
            this.sub_type = str2;
            this.index = str3;
            this.parameters = list;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.Builder, com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public /* bridge */ /* synthetic */ BuildStep parameters(List list) {
            return parameters((List<Parameter>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, List<Parameter> list) {
            super(str, TemplateParameter.this.sub_type, str3, list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.Builder, com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public CopyOfBuilder index(String str) {
            return (CopyOfBuilder) super.index(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.Builder, com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public CopyOfBuilder parameters(List<Parameter> list) {
            return (CopyOfBuilder) super.parameters(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.Builder, com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public CopyOfBuilder subType(String str) {
            return (CopyOfBuilder) super.subType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateParameter.Builder, com.amplifyframework.datastore.generated.model.TemplateParameter.BuildStep
        public CopyOfBuilder taType(String str) {
            return (CopyOfBuilder) super.taType(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.taType, this.sub_type, this.index, this.parameters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TemplateParameter.class != obj.getClass()) {
            return false;
        }
        TemplateParameter templateParameter = (TemplateParameter) obj;
        return s6c.m47909a(getTaType(), templateParameter.getTaType()) && s6c.m47909a(getSubType(), templateParameter.getSubType()) && s6c.m47909a(getIndex(), templateParameter.getIndex()) && s6c.m47909a(getParameters(), templateParameter.getParameters());
    }

    public String getIndex() {
        return this.index;
    }

    public List<Parameter> getParameters() {
        return this.parameters;
    }

    public String getSubType() {
        return this.sub_type;
    }

    public String getTaType() {
        return this.taType;
    }

    public int hashCode() {
        return (getTaType() + getSubType() + getIndex() + getParameters()).hashCode();
    }

    private TemplateParameter(String str, String str2, String str3, List<Parameter> list) {
        this.taType = str;
        this.sub_type = str2;
        this.index = str3;
        this.parameters = list;
    }
}
