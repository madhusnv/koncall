package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"formId"}, name = "byFormId")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "customFormAttachConditions")
/* loaded from: classes5.dex */
public final class customFormAttachCondition implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String callOutcome;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "String")
    private final String dealStage;

    @ModelField(targetType = "String")
    private final String documentCategory;

    @ModelField(targetType = "String")
    private final String documentSubCategory;

    @BelongsTo(targetName = "formId", type = CustomFormDefinitions.class)
    @ModelField(targetType = "CustomFormDefinitions")
    private final CustomFormDefinitions formDefinition;

    @ModelField(targetType = "String")
    private final String formType;

    @ModelField(targetType = "Boolean")
    private final Boolean hideDefaultNote;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String isDefaultFormForType;

    @ModelField(targetType = "String")
    private final String paymentStatus;

    @ModelField(targetType = "String")
    private final String taskInputType;

    @ModelField(targetType = "String")
    private final String taskOutcomeType;

    @ModelField(targetType = "String")
    private final String taskType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "String")
    private final String visitOutcome;
    public static final QueryField ID = QueryField.field("customFormAttachCondition", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("customFormAttachCondition", "accountId");
    public static final QueryField FORM_DEFINITION = QueryField.field("customFormAttachCondition", "formId");
    public static final QueryField FORM_TYPE = QueryField.field("customFormAttachCondition", "formType");
    public static final QueryField CALL_OUTCOME = QueryField.field("customFormAttachCondition", "callOutcome");
    public static final QueryField VISIT_OUTCOME = QueryField.field("customFormAttachCondition", "visitOutcome");
    public static final QueryField TASK_INPUT_TYPE = QueryField.field("customFormAttachCondition", "taskInputType");
    public static final QueryField TASK_TYPE = QueryField.field("customFormAttachCondition", "taskType");
    public static final QueryField TASK_OUTCOME_TYPE = QueryField.field("customFormAttachCondition", "taskOutcomeType");
    public static final QueryField DEAL_STAGE = QueryField.field("customFormAttachCondition", "dealStage");
    public static final QueryField PAYMENT_STATUS = QueryField.field("customFormAttachCondition", "paymentStatus");
    public static final QueryField DOCUMENT_CATEGORY = QueryField.field("customFormAttachCondition", "documentCategory");
    public static final QueryField DOCUMENT_SUB_CATEGORY = QueryField.field("customFormAttachCondition", "documentSubCategory");
    public static final QueryField IS_DEFAULT_FORM_FOR_TYPE = QueryField.field("customFormAttachCondition", "isDefaultFormForType");
    public static final QueryField HIDE_DEFAULT_NOTE = QueryField.field("customFormAttachCondition", "hideDefaultNote");
    public static final QueryField CREATED_BY_ID = QueryField.field("customFormAttachCondition", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("customFormAttachCondition", "updatedById");
    public static final QueryField CREATED_AT = QueryField.field("customFormAttachCondition", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("customFormAttachCondition", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        customFormAttachCondition build();

        BuildStep callOutcome(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep dealStage(String str);

        BuildStep documentCategory(String str);

        BuildStep documentSubCategory(String str);

        BuildStep formDefinition(CustomFormDefinitions customFormDefinitions);

        BuildStep formType(String str);

        BuildStep hideDefaultNote(Boolean bool);

        BuildStep id(String str);

        BuildStep isDefaultFormForType(String str);

        BuildStep paymentStatus(String str);

        BuildStep taskInputType(String str);

        BuildStep taskOutcomeType(String str);

        BuildStep taskType(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep visitOutcome(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private String callOutcome;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String dealStage;
        private String documentCategory;
        private String documentSubCategory;
        private CustomFormDefinitions formDefinition;
        private String formType;
        private Boolean hideDefaultNote;
        private String id;
        private String isDefaultFormForType;
        private String paymentStatus;
        private String taskInputType;
        private String taskOutcomeType;
        private String taskType;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String visitOutcome;

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public customFormAttachCondition build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new customFormAttachCondition(string, this.accountId, this.formDefinition, this.formType, this.callOutcome, this.visitOutcome, this.taskInputType, this.taskType, this.taskOutcomeType, this.dealStage, this.paymentStatus, this.documentCategory, this.documentSubCategory, this.isDefaultFormForType, this.hideDefaultNote, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep callOutcome(String str) {
            this.callOutcome = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep dealStage(String str) {
            this.dealStage = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep documentCategory(String str) {
            this.documentCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep documentSubCategory(String str) {
            this.documentSubCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep formDefinition(CustomFormDefinitions customFormDefinitions) {
            this.formDefinition = customFormDefinitions;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep formType(String str) {
            this.formType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep hideDefaultNote(Boolean bool) {
            this.hideDefaultNote = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep isDefaultFormForType(String str) {
            this.isDefaultFormForType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep paymentStatus(String str) {
            this.paymentStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep taskInputType(String str) {
            this.taskInputType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep taskOutcomeType(String str) {
            this.taskOutcomeType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep taskType(String str) {
            this.taskType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public BuildStep visitOutcome(String str) {
            this.visitOutcome = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, CustomFormDefinitions customFormDefinitions, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, String str15, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.formDefinition = customFormDefinitions;
            this.formType = str3;
            this.callOutcome = str4;
            this.visitOutcome = str5;
            this.taskInputType = str6;
            this.taskType = str7;
            this.taskOutcomeType = str8;
            this.dealStage = str9;
            this.paymentStatus = str10;
            this.documentCategory = str11;
            this.documentSubCategory = str12;
            this.isDefaultFormForType = str13;
            this.hideDefaultNote = bool;
            this.createdById = str14;
            this.updatedById = str15;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, CustomFormDefinitions customFormDefinitions, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, String str15, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, customFormDefinitions, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, bool, str14, str15, dateTime, dateTime2);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder callOutcome(String str) {
            return (CopyOfBuilder) super.callOutcome(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder dealStage(String str) {
            return (CopyOfBuilder) super.dealStage(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder documentCategory(String str) {
            return (CopyOfBuilder) super.documentCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder documentSubCategory(String str) {
            return (CopyOfBuilder) super.documentSubCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder formDefinition(CustomFormDefinitions customFormDefinitions) {
            return (CopyOfBuilder) super.formDefinition(customFormDefinitions);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder formType(String str) {
            return (CopyOfBuilder) super.formType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder hideDefaultNote(Boolean bool) {
            return (CopyOfBuilder) super.hideDefaultNote(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder isDefaultFormForType(String str) {
            return (CopyOfBuilder) super.isDefaultFormForType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder paymentStatus(String str) {
            return (CopyOfBuilder) super.paymentStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder taskInputType(String str) {
            return (CopyOfBuilder) super.taskInputType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder taskOutcomeType(String str) {
            return (CopyOfBuilder) super.taskOutcomeType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder taskType(String str) {
            return (CopyOfBuilder) super.taskType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.customFormAttachCondition.Builder, com.amplifyframework.datastore.generated.model.customFormAttachCondition.BuildStep
        public CopyOfBuilder visitOutcome(String str) {
            return (CopyOfBuilder) super.visitOutcome(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static customFormAttachCondition justId(String str) {
        return new customFormAttachCondition(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.formDefinition, this.formType, this.callOutcome, this.visitOutcome, this.taskInputType, this.taskType, this.taskOutcomeType, this.dealStage, this.paymentStatus, this.documentCategory, this.documentSubCategory, this.isDefaultFormForType, this.hideDefaultNote, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || customFormAttachCondition.class != obj.getClass()) {
            return false;
        }
        customFormAttachCondition customformattachcondition = (customFormAttachCondition) obj;
        return s6c.m47909a(getId(), customformattachcondition.getId()) && s6c.m47909a(getAccountId(), customformattachcondition.getAccountId()) && s6c.m47909a(getFormDefinition(), customformattachcondition.getFormDefinition()) && s6c.m47909a(getFormType(), customformattachcondition.getFormType()) && s6c.m47909a(getCallOutcome(), customformattachcondition.getCallOutcome()) && s6c.m47909a(getVisitOutcome(), customformattachcondition.getVisitOutcome()) && s6c.m47909a(getTaskInputType(), customformattachcondition.getTaskInputType()) && s6c.m47909a(getTaskType(), customformattachcondition.getTaskType()) && s6c.m47909a(getTaskOutcomeType(), customformattachcondition.getTaskOutcomeType()) && s6c.m47909a(getDealStage(), customformattachcondition.getDealStage()) && s6c.m47909a(getPaymentStatus(), customformattachcondition.getPaymentStatus()) && s6c.m47909a(getDocumentCategory(), customformattachcondition.getDocumentCategory()) && s6c.m47909a(getDocumentSubCategory(), customformattachcondition.getDocumentSubCategory()) && s6c.m47909a(getIsDefaultFormForType(), customformattachcondition.getIsDefaultFormForType()) && s6c.m47909a(getHideDefaultNote(), customformattachcondition.getHideDefaultNote()) && s6c.m47909a(getCreatedById(), customformattachcondition.getCreatedById()) && s6c.m47909a(getUpdatedById(), customformattachcondition.getUpdatedById()) && s6c.m47909a(getCreatedAt(), customformattachcondition.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), customformattachcondition.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getCallOutcome() {
        return this.callOutcome;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getDealStage() {
        return this.dealStage;
    }

    public String getDocumentCategory() {
        return this.documentCategory;
    }

    public String getDocumentSubCategory() {
        return this.documentSubCategory;
    }

    public CustomFormDefinitions getFormDefinition() {
        return this.formDefinition;
    }

    public String getFormType() {
        return this.formType;
    }

    public Boolean getHideDefaultNote() {
        return this.hideDefaultNote;
    }

    public String getId() {
        return this.id;
    }

    public String getIsDefaultFormForType() {
        return this.isDefaultFormForType;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public String getTaskInputType() {
        return this.taskInputType;
    }

    public String getTaskOutcomeType() {
        return this.taskOutcomeType;
    }

    public String getTaskType() {
        return this.taskType;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public String getVisitOutcome() {
        return this.visitOutcome;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getFormDefinition() + getFormType() + getCallOutcome() + getVisitOutcome() + getTaskInputType() + getTaskType() + getTaskOutcomeType() + getDealStage() + getPaymentStatus() + getDocumentCategory() + getDocumentSubCategory() + getIsDefaultFormForType() + getHideDefaultNote() + getCreatedById() + getUpdatedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("customFormAttachCondition {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("formDefinition=" + String.valueOf(getFormDefinition()) + ", ");
        sb.append("formType=" + String.valueOf(getFormType()) + ", ");
        sb.append("callOutcome=" + String.valueOf(getCallOutcome()) + ", ");
        sb.append("visitOutcome=" + String.valueOf(getVisitOutcome()) + ", ");
        sb.append("taskInputType=" + String.valueOf(getTaskInputType()) + ", ");
        sb.append("taskType=" + String.valueOf(getTaskType()) + ", ");
        sb.append("taskOutcomeType=" + String.valueOf(getTaskOutcomeType()) + ", ");
        sb.append("dealStage=" + String.valueOf(getDealStage()) + ", ");
        sb.append("paymentStatus=" + String.valueOf(getPaymentStatus()) + ", ");
        sb.append("documentCategory=" + String.valueOf(getDocumentCategory()) + ", ");
        sb.append("documentSubCategory=" + String.valueOf(getDocumentSubCategory()) + ", ");
        sb.append("isDefaultFormForType=" + String.valueOf(getIsDefaultFormForType()) + ", ");
        sb.append("hideDefaultNote=" + String.valueOf(getHideDefaultNote()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private customFormAttachCondition(String str, String str2, CustomFormDefinitions customFormDefinitions, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, String str15, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.formDefinition = customFormDefinitions;
        this.formType = str3;
        this.callOutcome = str4;
        this.visitOutcome = str5;
        this.taskInputType = str6;
        this.taskType = str7;
        this.taskOutcomeType = str8;
        this.dealStage = str9;
        this.paymentStatus = str10;
        this.documentCategory = str11;
        this.documentSubCategory = str12;
        this.isDefaultFormForType = str13;
        this.hideDefaultNote = bool;
        this.createdById = str14;
        this.updatedById = str15;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
