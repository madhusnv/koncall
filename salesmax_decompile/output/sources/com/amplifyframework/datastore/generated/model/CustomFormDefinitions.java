package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "CustomFormDefinitions")
/* loaded from: classes5.dex */
public final class CustomFormDefinitions implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(isRequired = true, targetType = "String")
    private final String displayName;

    @ModelField(targetType = "customFormAttachCondition")
    @HasMany(associatedWith = "formDefinition", type = customFormAttachCondition.class)
    private final List<customFormAttachCondition> formAttachments;

    @ModelField(isRequired = true, targetType = "String")
    private final String formName;

    @ModelField(targetType = "FormStepSchema")
    private final List<FormStepSchema> formSchema;

    @ModelField(targetType = "String")
    private final String formTitle;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "ID")
    private final String updaedById;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("CustomFormDefinitions", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("CustomFormDefinitions", "accountId");
    public static final QueryField FORM_NAME = QueryField.field("CustomFormDefinitions", "formName");
    public static final QueryField DISPLAY_NAME = QueryField.field("CustomFormDefinitions", "displayName");
    public static final QueryField FORM_TITLE = QueryField.field("CustomFormDefinitions", "formTitle");
    public static final QueryField FORM_SCHEMA = QueryField.field("CustomFormDefinitions", "formSchema");
    public static final QueryField CREATED_BY_ID = QueryField.field("CustomFormDefinitions", "createdById");
    public static final QueryField UPDAED_BY_ID = QueryField.field("CustomFormDefinitions", "updaedById");
    public static final QueryField CREATED_AT = QueryField.field("CustomFormDefinitions", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CustomFormDefinitions", "updatedAt");

    public interface AccountIdStep {
        FormNameStep accountId(String str);
    }

    public interface BuildStep {
        CustomFormDefinitions build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep formSchema(List<FormStepSchema> list);

        BuildStep formTitle(String str);

        BuildStep id(String str);

        BuildStep updaedById(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, FormNameStep, DisplayNameStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String displayName;
        private String formName;
        private List<FormStepSchema> formSchema;
        private String formTitle;
        private String id;
        private String updaedById;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.AccountIdStep
        public FormNameStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public CustomFormDefinitions build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CustomFormDefinitions(string, this.accountId, this.formName, this.displayName, this.formTitle, this.formSchema, this.createdById, this.updaedById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.DisplayNameStep
        public BuildStep displayName(String str) {
            Objects.requireNonNull(str);
            this.displayName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.FormNameStep
        public DisplayNameStep formName(String str) {
            Objects.requireNonNull(str);
            this.formName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public BuildStep formSchema(List<FormStepSchema> list) {
            this.formSchema = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public BuildStep formTitle(String str) {
            this.formTitle = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public BuildStep updaedById(String str) {
            this.updaedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, List<FormStepSchema> list, String str6, String str7, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.formName = str3;
            this.displayName = str4;
            this.formTitle = str5;
            this.formSchema = list;
            this.createdById = str6;
            this.updaedById = str7;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public /* bridge */ /* synthetic */ BuildStep formSchema(List list) {
            return formSchema((List<FormStepSchema>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, List<FormStepSchema> list, String str6, String str7, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, list, str6, str7, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.DisplayNameStep
        public CopyOfBuilder displayName(String str) {
            return (CopyOfBuilder) super.displayName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.FormNameStep
        public CopyOfBuilder formName(String str) {
            return (CopyOfBuilder) super.formName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public CopyOfBuilder formSchema(List<FormStepSchema> list) {
            return (CopyOfBuilder) super.formSchema(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public CopyOfBuilder formTitle(String str) {
            return (CopyOfBuilder) super.formTitle(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public CopyOfBuilder updaedById(String str) {
            return (CopyOfBuilder) super.updaedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomFormDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomFormDefinitions.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface DisplayNameStep {
        BuildStep displayName(String str);
    }

    public interface FormNameStep {
        DisplayNameStep formName(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static CustomFormDefinitions justId(String str) {
        return new CustomFormDefinitions(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.formName, this.displayName, this.formTitle, this.formSchema, this.createdById, this.updaedById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomFormDefinitions.class != obj.getClass()) {
            return false;
        }
        CustomFormDefinitions customFormDefinitions = (CustomFormDefinitions) obj;
        return s6c.m47909a(getId(), customFormDefinitions.getId()) && s6c.m47909a(getAccountId(), customFormDefinitions.getAccountId()) && s6c.m47909a(getFormName(), customFormDefinitions.getFormName()) && s6c.m47909a(getDisplayName(), customFormDefinitions.getDisplayName()) && s6c.m47909a(getFormTitle(), customFormDefinitions.getFormTitle()) && s6c.m47909a(getFormSchema(), customFormDefinitions.getFormSchema()) && s6c.m47909a(getCreatedById(), customFormDefinitions.getCreatedById()) && s6c.m47909a(getUpdaedById(), customFormDefinitions.getUpdaedById()) && s6c.m47909a(getCreatedAt(), customFormDefinitions.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), customFormDefinitions.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public List<customFormAttachCondition> getFormAttachments() {
        return this.formAttachments;
    }

    public String getFormName() {
        return this.formName;
    }

    public List<FormStepSchema> getFormSchema() {
        return this.formSchema;
    }

    public String getFormTitle() {
        return this.formTitle;
    }

    public String getId() {
        return this.id;
    }

    public String getUpdaedById() {
        return this.updaedById;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getFormName() + getDisplayName() + getFormTitle() + getFormSchema() + getCreatedById() + getUpdaedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomFormDefinitions {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("formName=" + String.valueOf(getFormName()) + ", ");
        sb.append("displayName=" + String.valueOf(getDisplayName()) + ", ");
        sb.append("formTitle=" + String.valueOf(getFormTitle()) + ", ");
        sb.append("formSchema=" + String.valueOf(getFormSchema()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("updaedById=" + String.valueOf(getUpdaedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CustomFormDefinitions(String str, String str2, String str3, String str4, String str5, List<FormStepSchema> list, String str6, String str7, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.formAttachments = null;
        this.id = str;
        this.accountId = str2;
        this.formName = str3;
        this.displayName = str4;
        this.formTitle = str5;
        this.formSchema = list;
        this.createdById = str6;
        this.updaedById = str7;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
