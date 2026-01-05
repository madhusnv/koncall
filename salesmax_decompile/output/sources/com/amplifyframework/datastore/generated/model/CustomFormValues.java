package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "CustomFormValues")
/* loaded from: classes5.dex */
public final class CustomFormValues implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "AWSJSON")
    private final String parentObject;

    @ModelField(isRequired = true, targetType = "ID")
    private final String parentObjectId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String propertyDefinitionId;

    @ModelField(targetType = "AWSJSON")
    private final String value;
    public static final QueryField ID = QueryField.field("CustomFormValues", OutcomeConstants.OUTCOME_ID);
    public static final QueryField PROPERTY_DEFINITION_ID = QueryField.field("CustomFormValues", "propertyDefinitionId");
    public static final QueryField ACCOUNT_ID = QueryField.field("CustomFormValues", "accountId");
    public static final QueryField PARENT_OBJECT_ID = QueryField.field("CustomFormValues", "parentObjectId");
    public static final QueryField PARENT_OBJECT = QueryField.field("CustomFormValues", "parentObject");
    public static final QueryField VALUE = QueryField.field("CustomFormValues", "value");

    public interface AccountIdStep {
        ParentObjectIdStep accountId(String str);
    }

    public interface BuildStep {
        CustomFormValues build();

        BuildStep id(String str);

        BuildStep parentObject(String str);

        BuildStep value(String str);
    }

    public static class Builder implements PropertyDefinitionIdStep, AccountIdStep, ParentObjectIdStep, BuildStep {
        private String accountId;
        private String id;
        private String parentObject;
        private String parentObjectId;
        private String propertyDefinitionId;
        private String value;

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.AccountIdStep
        public ParentObjectIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.BuildStep
        public CustomFormValues build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CustomFormValues(string, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.BuildStep
        public BuildStep parentObject(String str) {
            this.parentObject = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.ParentObjectIdStep
        public BuildStep parentObjectId(String str) {
            Objects.requireNonNull(str);
            this.parentObjectId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.PropertyDefinitionIdStep
        public AccountIdStep propertyDefinitionId(String str) {
            Objects.requireNonNull(str);
            this.propertyDefinitionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.BuildStep
        public BuildStep value(String str) {
            this.value = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6) {
            this.id = str;
            this.propertyDefinitionId = str2;
            this.accountId = str3;
            this.parentObjectId = str4;
            this.parentObject = str5;
            this.value = str6;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6) {
            super(str, str2, str3, str4, str5, str6);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.Builder, com.amplifyframework.datastore.generated.model.CustomFormValues.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.Builder, com.amplifyframework.datastore.generated.model.CustomFormValues.BuildStep
        public CopyOfBuilder parentObject(String str) {
            return (CopyOfBuilder) super.parentObject(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.Builder, com.amplifyframework.datastore.generated.model.CustomFormValues.ParentObjectIdStep
        public CopyOfBuilder parentObjectId(String str) {
            return (CopyOfBuilder) super.parentObjectId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.Builder, com.amplifyframework.datastore.generated.model.CustomFormValues.PropertyDefinitionIdStep
        public CopyOfBuilder propertyDefinitionId(String str) {
            return (CopyOfBuilder) super.propertyDefinitionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormValues.Builder, com.amplifyframework.datastore.generated.model.CustomFormValues.BuildStep
        public CopyOfBuilder value(String str) {
            return (CopyOfBuilder) super.value(str);
        }
    }

    public interface ParentObjectIdStep {
        BuildStep parentObjectId(String str);
    }

    public interface PropertyDefinitionIdStep {
        AccountIdStep propertyDefinitionId(String str);
    }

    public static PropertyDefinitionIdStep builder() {
        return new Builder();
    }

    public static CustomFormValues justId(String str) {
        return new CustomFormValues(str, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomFormValues.class != obj.getClass()) {
            return false;
        }
        CustomFormValues customFormValues = (CustomFormValues) obj;
        return s6c.m47909a(getId(), customFormValues.getId()) && s6c.m47909a(getPropertyDefinitionId(), customFormValues.getPropertyDefinitionId()) && s6c.m47909a(getAccountId(), customFormValues.getAccountId()) && s6c.m47909a(getParentObjectId(), customFormValues.getParentObjectId()) && s6c.m47909a(getParentObject(), customFormValues.getParentObject()) && s6c.m47909a(getValue(), customFormValues.getValue());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getId() {
        return this.id;
    }

    public String getParentObject() {
        return this.parentObject;
    }

    public String getParentObjectId() {
        return this.parentObjectId;
    }

    public String getPropertyDefinitionId() {
        return this.propertyDefinitionId;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (getId() + getPropertyDefinitionId() + getAccountId() + getParentObjectId() + getParentObject() + getValue()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomFormValues {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("propertyDefinitionId=" + String.valueOf(getPropertyDefinitionId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("parentObjectId=" + String.valueOf(getParentObjectId()) + ", ");
        sb.append("parentObject=" + String.valueOf(getParentObject()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(String.valueOf(getValue()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CustomFormValues(String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = str;
        this.propertyDefinitionId = str2;
        this.accountId = str3;
        this.parentObjectId = str4;
        this.parentObject = str5;
        this.value = str6;
    }
}
