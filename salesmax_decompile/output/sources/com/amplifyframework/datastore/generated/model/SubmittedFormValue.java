package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "SubmittedFormValues")
/* loaded from: classes5.dex */
public final class SubmittedFormValue implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ID")
    private final String contactId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String extensionOfObject;

    @ModelField(targetType = "String")
    private final String extensionOfProperty;

    @BelongsTo(targetName = "formId", type = CustomFormDefinitions.class)
    @ModelField(targetType = "CustomFormDefinitions")
    private final CustomFormDefinitions formDefinition;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "ID")
    private final String objectId;

    @ModelField(targetType = "ID")
    private final String submittedBy;

    @ModelField(targetType = "String")
    private final String submittedByIdType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "AWSJSON")
    private final String value;
    public static final QueryField ID = QueryField.field("SubmittedFormValue", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("SubmittedFormValue", "accountId");
    public static final QueryField FORM_DEFINITION = QueryField.field("SubmittedFormValue", "formId");
    public static final QueryField VALUE = QueryField.field("SubmittedFormValue", "value");
    public static final QueryField EXTENSION_OF_PROPERTY = QueryField.field("SubmittedFormValue", "extensionOfProperty");
    public static final QueryField EXTENSION_OF_OBJECT = QueryField.field("SubmittedFormValue", "extensionOfObject");
    public static final QueryField OBJECT_ID = QueryField.field("SubmittedFormValue", "objectId");
    public static final QueryField CONTACT_ID = QueryField.field("SubmittedFormValue", "contactId");
    public static final QueryField SUBMITTED_BY = QueryField.field("SubmittedFormValue", "submittedBy");
    public static final QueryField SUBMITTED_BY_ID_TYPE = QueryField.field("SubmittedFormValue", "submittedByIdType");
    public static final QueryField CREATED_AT = QueryField.field("SubmittedFormValue", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("SubmittedFormValue", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        SubmittedFormValue build();

        BuildStep contactId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep extensionOfObject(String str);

        BuildStep extensionOfProperty(String str);

        BuildStep formDefinition(CustomFormDefinitions customFormDefinitions);

        BuildStep id(String str);

        BuildStep objectId(String str);

        BuildStep submittedBy(String str);

        BuildStep submittedByIdType(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep value(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private String contactId;
        private Temporal.DateTime createdAt;
        private String extensionOfObject;
        private String extensionOfProperty;
        private CustomFormDefinitions formDefinition;
        private String id;
        private String objectId;
        private String submittedBy;
        private String submittedByIdType;
        private Temporal.DateTime updatedAt;
        private String value;

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public SubmittedFormValue build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new SubmittedFormValue(string, this.accountId, this.formDefinition, this.value, this.extensionOfProperty, this.extensionOfObject, this.objectId, this.contactId, this.submittedBy, this.submittedByIdType, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep contactId(String str) {
            this.contactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep extensionOfObject(String str) {
            this.extensionOfObject = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep extensionOfProperty(String str) {
            this.extensionOfProperty = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep formDefinition(CustomFormDefinitions customFormDefinitions) {
            this.formDefinition = customFormDefinitions;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep objectId(String str) {
            this.objectId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep submittedBy(String str) {
            this.submittedBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep submittedByIdType(String str) {
            this.submittedByIdType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public BuildStep value(String str) {
            this.value = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, CustomFormDefinitions customFormDefinitions, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.formDefinition = customFormDefinitions;
            this.value = str3;
            this.extensionOfProperty = str4;
            this.extensionOfObject = str5;
            this.objectId = str6;
            this.contactId = str7;
            this.submittedBy = str8;
            this.submittedByIdType = str9;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, CustomFormDefinitions customFormDefinitions, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, customFormDefinitions, str3, str4, str5, str6, str7, str8, str9, dateTime, dateTime2);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder contactId(String str) {
            return (CopyOfBuilder) super.contactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder extensionOfObject(String str) {
            return (CopyOfBuilder) super.extensionOfObject(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder extensionOfProperty(String str) {
            return (CopyOfBuilder) super.extensionOfProperty(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder formDefinition(CustomFormDefinitions customFormDefinitions) {
            return (CopyOfBuilder) super.formDefinition(customFormDefinitions);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder objectId(String str) {
            return (CopyOfBuilder) super.objectId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder submittedBy(String str) {
            return (CopyOfBuilder) super.submittedBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder submittedByIdType(String str) {
            return (CopyOfBuilder) super.submittedByIdType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.SubmittedFormValue.Builder, com.amplifyframework.datastore.generated.model.SubmittedFormValue.BuildStep
        public CopyOfBuilder value(String str) {
            return (CopyOfBuilder) super.value(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static SubmittedFormValue justId(String str) {
        return new SubmittedFormValue(str, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.formDefinition, this.value, this.extensionOfProperty, this.extensionOfObject, this.objectId, this.contactId, this.submittedBy, this.submittedByIdType, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SubmittedFormValue.class != obj.getClass()) {
            return false;
        }
        SubmittedFormValue submittedFormValue = (SubmittedFormValue) obj;
        return s6c.m47909a(getId(), submittedFormValue.getId()) && s6c.m47909a(getAccountId(), submittedFormValue.getAccountId()) && s6c.m47909a(getFormDefinition(), submittedFormValue.getFormDefinition()) && s6c.m47909a(getValue(), submittedFormValue.getValue()) && s6c.m47909a(getExtensionOfProperty(), submittedFormValue.getExtensionOfProperty()) && s6c.m47909a(getExtensionOfObject(), submittedFormValue.getExtensionOfObject()) && s6c.m47909a(getObjectId(), submittedFormValue.getObjectId()) && s6c.m47909a(getContactId(), submittedFormValue.getContactId()) && s6c.m47909a(getSubmittedBy(), submittedFormValue.getSubmittedBy()) && s6c.m47909a(getSubmittedByIdType(), submittedFormValue.getSubmittedByIdType()) && s6c.m47909a(getCreatedAt(), submittedFormValue.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), submittedFormValue.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getContactId() {
        return this.contactId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getExtensionOfObject() {
        return this.extensionOfObject;
    }

    public String getExtensionOfProperty() {
        return this.extensionOfProperty;
    }

    public CustomFormDefinitions getFormDefinition() {
        return this.formDefinition;
    }

    public String getId() {
        return this.id;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getSubmittedBy() {
        return this.submittedBy;
    }

    public String getSubmittedByIdType() {
        return this.submittedByIdType;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getFormDefinition() + getValue() + getExtensionOfProperty() + getExtensionOfObject() + getObjectId() + getContactId() + getSubmittedBy() + getSubmittedByIdType() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubmittedFormValue {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("formDefinition=" + String.valueOf(getFormDefinition()) + ", ");
        sb.append("value=" + String.valueOf(getValue()) + ", ");
        sb.append("extensionOfProperty=" + String.valueOf(getExtensionOfProperty()) + ", ");
        sb.append("extensionOfObject=" + String.valueOf(getExtensionOfObject()) + ", ");
        sb.append("objectId=" + String.valueOf(getObjectId()) + ", ");
        sb.append("contactId=" + String.valueOf(getContactId()) + ", ");
        sb.append("submittedBy=" + String.valueOf(getSubmittedBy()) + ", ");
        sb.append("submittedByIdType=" + String.valueOf(getSubmittedByIdType()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private SubmittedFormValue(String str, String str2, CustomFormDefinitions customFormDefinitions, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.formDefinition = customFormDefinitions;
        this.value = str3;
        this.extensionOfProperty = str4;
        this.extensionOfObject = str5;
        this.objectId = str6;
        this.contactId = str7;
        this.submittedBy = str8;
        this.submittedByIdType = str9;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
