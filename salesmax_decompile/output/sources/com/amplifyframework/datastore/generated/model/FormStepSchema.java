package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class FormStepSchema {
    private final List<FieldGroup> fieldGroups;
    private final List<Fields> fields;
    private final LayoutType layoutType;
    private final Integer numberOfColumns;
    private final String stepTitle;

    public interface BuildStep {
        FormStepSchema build();

        BuildStep fieldGroups(List<FieldGroup> list);

        BuildStep fields(List<Fields> list);

        BuildStep layoutType(LayoutType layoutType);

        BuildStep numberOfColumns(Integer num);

        BuildStep stepTitle(String str);
    }

    public static class Builder implements BuildStep {
        private List<FieldGroup> fieldGroups;
        private List<Fields> fields;
        private LayoutType layoutType;
        private Integer numberOfColumns;
        private String stepTitle;

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public FormStepSchema build() {
            return new FormStepSchema(this.stepTitle, this.fields, this.fieldGroups, this.layoutType, this.numberOfColumns);
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public BuildStep fieldGroups(List<FieldGroup> list) {
            this.fieldGroups = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public BuildStep fields(List<Fields> list) {
            this.fields = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public BuildStep layoutType(LayoutType layoutType) {
            this.layoutType = layoutType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public BuildStep numberOfColumns(Integer num) {
            this.numberOfColumns = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public BuildStep stepTitle(String str) {
            this.stepTitle = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, List<Fields> list, List<FieldGroup> list2, LayoutType layoutType, Integer num) {
            this.stepTitle = str;
            this.fields = list;
            this.fieldGroups = list2;
            this.layoutType = layoutType;
            this.numberOfColumns = num;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.Builder, com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public /* bridge */ /* synthetic */ BuildStep fieldGroups(List list) {
            return fieldGroups((List<FieldGroup>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.Builder, com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public /* bridge */ /* synthetic */ BuildStep fields(List list) {
            return fields((List<Fields>) list);
        }

        private CopyOfBuilder(String str, List<Fields> list, List<FieldGroup> list2, LayoutType layoutType, Integer num) {
            super(str, list, list2, layoutType, num);
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.Builder, com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public CopyOfBuilder fieldGroups(List<FieldGroup> list) {
            return (CopyOfBuilder) super.fieldGroups(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.Builder, com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public CopyOfBuilder fields(List<Fields> list) {
            return (CopyOfBuilder) super.fields(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.Builder, com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public CopyOfBuilder layoutType(LayoutType layoutType) {
            return (CopyOfBuilder) super.layoutType(layoutType);
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.Builder, com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public CopyOfBuilder numberOfColumns(Integer num) {
            return (CopyOfBuilder) super.numberOfColumns(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.FormStepSchema.Builder, com.amplifyframework.datastore.generated.model.FormStepSchema.BuildStep
        public CopyOfBuilder stepTitle(String str) {
            return (CopyOfBuilder) super.stepTitle(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.stepTitle, this.fields, this.fieldGroups, this.layoutType, this.numberOfColumns);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FormStepSchema.class != obj.getClass()) {
            return false;
        }
        FormStepSchema formStepSchema = (FormStepSchema) obj;
        return s6c.m47909a(getStepTitle(), formStepSchema.getStepTitle()) && s6c.m47909a(getFields(), formStepSchema.getFields()) && s6c.m47909a(getFieldGroups(), formStepSchema.getFieldGroups()) && s6c.m47909a(getLayoutType(), formStepSchema.getLayoutType()) && s6c.m47909a(getNumberOfColumns(), formStepSchema.getNumberOfColumns());
    }

    public List<FieldGroup> getFieldGroups() {
        return this.fieldGroups;
    }

    public List<Fields> getFields() {
        return this.fields;
    }

    public LayoutType getLayoutType() {
        return this.layoutType;
    }

    public Integer getNumberOfColumns() {
        return this.numberOfColumns;
    }

    public String getStepTitle() {
        return this.stepTitle;
    }

    public int hashCode() {
        return (getStepTitle() + getFields() + getFieldGroups() + getLayoutType() + getNumberOfColumns()).hashCode();
    }

    private FormStepSchema(String str, List<Fields> list, List<FieldGroup> list2, LayoutType layoutType, Integer num) {
        this.stepTitle = str;
        this.fields = list;
        this.fieldGroups = list2;
        this.layoutType = layoutType;
        this.numberOfColumns = num;
    }
}
