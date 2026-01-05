package com.amplifyframework.datastore.generated.model;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class CustomPropertyOptions {
    private final Boolean isArchived;
    private final String otherAttributes;
    private final Integer tagColor;
    private final String value;
    private final String viewValue;

    public interface BuildStep {
        CustomPropertyOptions build();

        BuildStep isArchived(Boolean bool);

        BuildStep otherAttributes(String str);

        BuildStep tagColor(Integer num);
    }

    public static class Builder implements ValueStep, ViewValueStep, BuildStep {
        private Boolean isArchived;
        private String otherAttributes;
        private Integer tagColor;
        private String value;
        private String viewValue;

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.BuildStep
        public CustomPropertyOptions build() {
            return new CustomPropertyOptions(this.value, this.viewValue, this.isArchived, this.tagColor, this.otherAttributes);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.BuildStep
        public BuildStep isArchived(Boolean bool) {
            this.isArchived = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.BuildStep
        public BuildStep otherAttributes(String str) {
            this.otherAttributes = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.BuildStep
        public BuildStep tagColor(Integer num) {
            this.tagColor = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.ValueStep
        public ViewValueStep value(String str) {
            Objects.requireNonNull(str);
            this.value = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.ViewValueStep
        public BuildStep viewValue(String str) {
            Objects.requireNonNull(str);
            this.viewValue = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Boolean bool, Integer num, String str3) {
            this.value = str;
            this.viewValue = str2;
            this.isArchived = bool;
            this.tagColor = num;
            this.otherAttributes = str3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Boolean bool, Integer num, String str3) {
            super(str, str2, bool, num, str3);
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyOptions.BuildStep
        public CopyOfBuilder isArchived(Boolean bool) {
            return (CopyOfBuilder) super.isArchived(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyOptions.BuildStep
        public CopyOfBuilder otherAttributes(String str) {
            return (CopyOfBuilder) super.otherAttributes(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyOptions.BuildStep
        public CopyOfBuilder tagColor(Integer num) {
            return (CopyOfBuilder) super.tagColor(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyOptions.ValueStep
        public CopyOfBuilder value(String str) {
            return (CopyOfBuilder) super.value(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyOptions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyOptions.ViewValueStep
        public CopyOfBuilder viewValue(String str) {
            return (CopyOfBuilder) super.viewValue(str);
        }
    }

    public interface ValueStep {
        ViewValueStep value(String str);
    }

    public interface ViewValueStep {
        BuildStep viewValue(String str);
    }

    public static ValueStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.value, this.viewValue, this.isArchived, this.tagColor, this.otherAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomPropertyOptions.class != obj.getClass()) {
            return false;
        }
        CustomPropertyOptions customPropertyOptions = (CustomPropertyOptions) obj;
        return s6c.m47909a(getValue(), customPropertyOptions.getValue()) && s6c.m47909a(getViewValue(), customPropertyOptions.getViewValue()) && s6c.m47909a(getIsArchived(), customPropertyOptions.getIsArchived()) && s6c.m47909a(getTagColor(), customPropertyOptions.getTagColor()) && s6c.m47909a(getOtherAttributes(), customPropertyOptions.getOtherAttributes());
    }

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    public String getOtherAttributes() {
        return this.otherAttributes;
    }

    public Integer getTagColor() {
        return this.tagColor;
    }

    public String getValue() {
        return this.value;
    }

    public String getViewValue() {
        return this.viewValue;
    }

    public int hashCode() {
        return (getValue() + getViewValue() + getIsArchived() + getTagColor() + getOtherAttributes()).hashCode();
    }

    private CustomPropertyOptions(String str, String str2, Boolean bool, Integer num, String str3) {
        this.value = str;
        this.viewValue = str2;
        this.isArchived = bool;
        this.tagColor = num;
        this.otherAttributes = str3;
    }
}
