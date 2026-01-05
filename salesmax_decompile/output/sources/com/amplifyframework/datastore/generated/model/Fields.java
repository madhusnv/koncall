package com.amplifyframework.datastore.generated.model;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class Fields {
    private final String fieldName;
    private final String fieldParentObjectType;
    private final String hideCondition;
    private final String hintText;
    private final Boolean isHidden;
    private final Boolean isMandatory;
    private final Boolean isViewOnly;
    private final String preSetValue;
    private final String propertyDefinitionId;
    private final String showCondition;
    private final String viewType;

    public interface BuildStep {
        Fields build();

        BuildStep fieldName(String str);

        BuildStep fieldParentObjectType(String str);

        BuildStep hideCondition(String str);

        BuildStep hintText(String str);

        BuildStep isHidden(Boolean bool);

        BuildStep isMandatory(Boolean bool);

        BuildStep isViewOnly(Boolean bool);

        BuildStep preSetValue(String str);

        BuildStep propertyDefinitionId(String str);

        BuildStep showCondition(String str);
    }

    public static class Builder implements ViewTypeStep, BuildStep {
        private String fieldName;
        private String fieldParentObjectType;
        private String hideCondition;
        private String hintText;
        private Boolean isHidden;
        private Boolean isMandatory;
        private Boolean isViewOnly;
        private String preSetValue;
        private String propertyDefinitionId;
        private String showCondition;
        private String viewType;

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public Fields build() {
            return new Fields(this.fieldName, this.fieldParentObjectType, this.propertyDefinitionId, this.viewType, this.isMandatory, this.isViewOnly, this.isHidden, this.hintText, this.preSetValue, this.showCondition, this.hideCondition);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep fieldName(String str) {
            this.fieldName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep fieldParentObjectType(String str) {
            this.fieldParentObjectType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep hideCondition(String str) {
            this.hideCondition = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep hintText(String str) {
            this.hintText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep isHidden(Boolean bool) {
            this.isHidden = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep isMandatory(Boolean bool) {
            this.isMandatory = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep isViewOnly(Boolean bool) {
            this.isViewOnly = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep preSetValue(String str) {
            this.preSetValue = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep propertyDefinitionId(String str) {
            this.propertyDefinitionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public BuildStep showCondition(String str) {
            this.showCondition = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.ViewTypeStep
        public BuildStep viewType(String str) {
            Objects.requireNonNull(str);
            this.viewType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, String str7, String str8) {
            this.fieldName = str;
            this.fieldParentObjectType = str2;
            this.propertyDefinitionId = str3;
            this.viewType = str4;
            this.isMandatory = bool;
            this.isViewOnly = bool2;
            this.isHidden = bool3;
            this.hintText = str5;
            this.preSetValue = str6;
            this.showCondition = str7;
            this.hideCondition = str8;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, String str7, String str8) {
            super(str, str2, str3, str4, bool, bool2, bool3, str5, str6, str7, str8);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder fieldName(String str) {
            return (CopyOfBuilder) super.fieldName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder fieldParentObjectType(String str) {
            return (CopyOfBuilder) super.fieldParentObjectType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder hideCondition(String str) {
            return (CopyOfBuilder) super.hideCondition(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder hintText(String str) {
            return (CopyOfBuilder) super.hintText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder isHidden(Boolean bool) {
            return (CopyOfBuilder) super.isHidden(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder isMandatory(Boolean bool) {
            return (CopyOfBuilder) super.isMandatory(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder isViewOnly(Boolean bool) {
            return (CopyOfBuilder) super.isViewOnly(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder preSetValue(String str) {
            return (CopyOfBuilder) super.preSetValue(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder propertyDefinitionId(String str) {
            return (CopyOfBuilder) super.propertyDefinitionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.BuildStep
        public CopyOfBuilder showCondition(String str) {
            return (CopyOfBuilder) super.showCondition(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fields.Builder, com.amplifyframework.datastore.generated.model.Fields.ViewTypeStep
        public CopyOfBuilder viewType(String str) {
            return (CopyOfBuilder) super.viewType(str);
        }
    }

    public interface ViewTypeStep {
        BuildStep viewType(String str);
    }

    public static ViewTypeStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.fieldName, this.fieldParentObjectType, this.propertyDefinitionId, this.viewType, this.isMandatory, this.isViewOnly, this.isHidden, this.hintText, this.preSetValue, this.showCondition, this.hideCondition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Fields.class != obj.getClass()) {
            return false;
        }
        Fields fields = (Fields) obj;
        return s6c.m47909a(getFieldName(), fields.getFieldName()) && s6c.m47909a(getFieldParentObjectType(), fields.getFieldParentObjectType()) && s6c.m47909a(getPropertyDefinitionId(), fields.getPropertyDefinitionId()) && s6c.m47909a(getViewType(), fields.getViewType()) && s6c.m47909a(getIsMandatory(), fields.getIsMandatory()) && s6c.m47909a(getIsViewOnly(), fields.getIsViewOnly()) && s6c.m47909a(getIsHidden(), fields.getIsHidden()) && s6c.m47909a(getHintText(), fields.getHintText()) && s6c.m47909a(getPreSetValue(), fields.getPreSetValue()) && s6c.m47909a(getShowCondition(), fields.getShowCondition()) && s6c.m47909a(getHideCondition(), fields.getHideCondition());
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getFieldParentObjectType() {
        return this.fieldParentObjectType;
    }

    public String getHideCondition() {
        return this.hideCondition;
    }

    public String getHintText() {
        return this.hintText;
    }

    public Boolean getIsHidden() {
        return this.isHidden;
    }

    public Boolean getIsMandatory() {
        return this.isMandatory;
    }

    public Boolean getIsViewOnly() {
        return this.isViewOnly;
    }

    public String getPreSetValue() {
        return this.preSetValue;
    }

    public String getPropertyDefinitionId() {
        return this.propertyDefinitionId;
    }

    public String getShowCondition() {
        return this.showCondition;
    }

    public String getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return (getFieldName() + getFieldParentObjectType() + getPropertyDefinitionId() + getViewType() + getIsMandatory() + getIsViewOnly() + getIsHidden() + getHintText() + getPreSetValue() + getShowCondition() + getHideCondition()).hashCode();
    }

    private Fields(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, String str7, String str8) {
        this.fieldName = str;
        this.fieldParentObjectType = str2;
        this.propertyDefinitionId = str3;
        this.viewType = str4;
        this.isMandatory = bool;
        this.isViewOnly = bool2;
        this.isHidden = bool3;
        this.hintText = str5;
        this.preSetValue = str6;
        this.showCondition = str7;
        this.hideCondition = str8;
    }
}
