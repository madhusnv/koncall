package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class FieldGroup {
    private final List<Fields> fields;
    private final String groupTitle;
    private final String hideCondition;
    private final Boolean isRepeatable;
    private final Integer numberOfColumns;
    private final String showCondition;

    public interface BuildStep {
        FieldGroup build();

        BuildStep fields(List<Fields> list);

        BuildStep groupTitle(String str);

        BuildStep hideCondition(String str);

        BuildStep isRepeatable(Boolean bool);

        BuildStep numberOfColumns(Integer num);

        BuildStep showCondition(String str);
    }

    public static class Builder implements BuildStep {
        private List<Fields> fields;
        private String groupTitle;
        private String hideCondition;
        private Boolean isRepeatable;
        private Integer numberOfColumns;
        private String showCondition;

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public FieldGroup build() {
            return new FieldGroup(this.groupTitle, this.fields, this.numberOfColumns, this.isRepeatable, this.showCondition, this.hideCondition);
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public BuildStep fields(List<Fields> list) {
            this.fields = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public BuildStep groupTitle(String str) {
            this.groupTitle = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public BuildStep hideCondition(String str) {
            this.hideCondition = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public BuildStep isRepeatable(Boolean bool) {
            this.isRepeatable = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public BuildStep numberOfColumns(Integer num) {
            this.numberOfColumns = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public BuildStep showCondition(String str) {
            this.showCondition = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, List<Fields> list, Integer num, Boolean bool, String str2, String str3) {
            this.groupTitle = str;
            this.fields = list;
            this.numberOfColumns = num;
            this.isRepeatable = bool;
            this.showCondition = str2;
            this.hideCondition = str3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.Builder, com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public /* bridge */ /* synthetic */ BuildStep fields(List list) {
            return fields((List<Fields>) list);
        }

        private CopyOfBuilder(String str, List<Fields> list, Integer num, Boolean bool, String str2, String str3) {
            super(str, list, num, bool, str2, str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.Builder, com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public CopyOfBuilder fields(List<Fields> list) {
            return (CopyOfBuilder) super.fields(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.Builder, com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public CopyOfBuilder groupTitle(String str) {
            return (CopyOfBuilder) super.groupTitle(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.Builder, com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public CopyOfBuilder hideCondition(String str) {
            return (CopyOfBuilder) super.hideCondition(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.Builder, com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public CopyOfBuilder isRepeatable(Boolean bool) {
            return (CopyOfBuilder) super.isRepeatable(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.Builder, com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public CopyOfBuilder numberOfColumns(Integer num) {
            return (CopyOfBuilder) super.numberOfColumns(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.FieldGroup.Builder, com.amplifyframework.datastore.generated.model.FieldGroup.BuildStep
        public CopyOfBuilder showCondition(String str) {
            return (CopyOfBuilder) super.showCondition(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.groupTitle, this.fields, this.numberOfColumns, this.isRepeatable, this.showCondition, this.hideCondition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldGroup.class != obj.getClass()) {
            return false;
        }
        FieldGroup fieldGroup = (FieldGroup) obj;
        return s6c.m47909a(getGroupTitle(), fieldGroup.getGroupTitle()) && s6c.m47909a(getFields(), fieldGroup.getFields()) && s6c.m47909a(getNumberOfColumns(), fieldGroup.getNumberOfColumns()) && s6c.m47909a(getIsRepeatable(), fieldGroup.getIsRepeatable()) && s6c.m47909a(getShowCondition(), fieldGroup.getShowCondition()) && s6c.m47909a(getHideCondition(), fieldGroup.getHideCondition());
    }

    public List<Fields> getFields() {
        return this.fields;
    }

    public String getGroupTitle() {
        return this.groupTitle;
    }

    public String getHideCondition() {
        return this.hideCondition;
    }

    public Boolean getIsRepeatable() {
        return this.isRepeatable;
    }

    public Integer getNumberOfColumns() {
        return this.numberOfColumns;
    }

    public String getShowCondition() {
        return this.showCondition;
    }

    public int hashCode() {
        return (getGroupTitle() + getFields() + getNumberOfColumns() + getIsRepeatable() + getShowCondition() + getHideCondition()).hashCode();
    }

    private FieldGroup(String str, List<Fields> list, Integer num, Boolean bool, String str2, String str3) {
        this.groupTitle = str;
        this.fields = list;
        this.numberOfColumns = num;
        this.isRepeatable = bool;
        this.showCondition = str2;
        this.hideCondition = str3;
    }
}
