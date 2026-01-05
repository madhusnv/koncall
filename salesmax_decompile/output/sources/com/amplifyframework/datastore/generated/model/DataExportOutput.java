package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"userId", "accountId", "updatedAt"}, name = "exportsByUser")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "DataExportOutputs")
/* loaded from: classes5.dex */
public final class DataExportOutput implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String batchRunId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "EntityActionDefinition")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = EntityActionDefinition.class)
    private final EntityActionDefinition entityActionDefinition;

    @ModelField(targetType = "ID")
    private final String entityActionDefinitionReference;

    @ModelField(targetType = "String")
    private final String exportMessage;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "ID")
    private final String teamId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @BelongsTo(targetName = "uploadedFileReference", type = UploadedFile.class)
    @ModelField(targetType = "UploadedFile")
    private final UploadedFile uploadedFile;

    @ModelField(targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("DataExportOutput", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("DataExportOutput", "accountId");
    public static final QueryField USER_ID = QueryField.field("DataExportOutput", "userId");
    public static final QueryField TEAM_ID = QueryField.field("DataExportOutput", "teamId");
    public static final QueryField ENTITY_ACTION_DEFINITION_REFERENCE = QueryField.field("DataExportOutput", "entityActionDefinitionReference");
    public static final QueryField UPLOADED_FILE = QueryField.field("DataExportOutput", "uploadedFileReference");
    public static final QueryField EXPORT_MESSAGE = QueryField.field("DataExportOutput", "exportMessage");
    public static final QueryField BATCH_RUN_ID = QueryField.field("DataExportOutput", "batchRunId");
    public static final QueryField STATUS = QueryField.field("DataExportOutput", "status");
    public static final QueryField CREATED_AT = QueryField.field("DataExportOutput", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("DataExportOutput", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep batchRunId(String str);

        DataExportOutput build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep entityActionDefinitionReference(String str);

        BuildStep exportMessage(String str);

        BuildStep id(String str);

        BuildStep status(String str);

        BuildStep teamId(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep uploadedFile(UploadedFile uploadedFile);

        BuildStep userId(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private String batchRunId;
        private Temporal.DateTime createdAt;
        private String entityActionDefinitionReference;
        private String exportMessage;
        private String id;
        private String status;
        private String teamId;
        private Temporal.DateTime updatedAt;
        private UploadedFile uploadedFile;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep batchRunId(String str) {
            this.batchRunId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public DataExportOutput build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new DataExportOutput(string, this.accountId, this.userId, this.teamId, this.entityActionDefinitionReference, this.uploadedFile, this.exportMessage, this.batchRunId, this.status, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep entityActionDefinitionReference(String str) {
            this.entityActionDefinitionReference = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep exportMessage(String str) {
            this.exportMessage = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep teamId(String str) {
            this.teamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep uploadedFile(UploadedFile uploadedFile) {
            this.uploadedFile = uploadedFile;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public BuildStep userId(String str) {
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, UploadedFile uploadedFile, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.userId = str3;
            this.teamId = str4;
            this.entityActionDefinitionReference = str5;
            this.uploadedFile = uploadedFile;
            this.exportMessage = str6;
            this.batchRunId = str7;
            this.status = str8;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, UploadedFile uploadedFile, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, uploadedFile, str6, str7, str8, dateTime, dateTime2);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public CopyOfBuilder batchRunId(String str) {
            return (CopyOfBuilder) super.batchRunId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public CopyOfBuilder entityActionDefinitionReference(String str) {
            return (CopyOfBuilder) super.entityActionDefinitionReference(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public CopyOfBuilder exportMessage(String str) {
            return (CopyOfBuilder) super.exportMessage(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public CopyOfBuilder teamId(String str) {
            return (CopyOfBuilder) super.teamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public CopyOfBuilder uploadedFile(UploadedFile uploadedFile) {
            return (CopyOfBuilder) super.uploadedFile(uploadedFile);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportOutput.Builder, com.amplifyframework.datastore.generated.model.DataExportOutput.BuildStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static DataExportOutput justId(String str) {
        return new DataExportOutput(str, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.userId, this.teamId, this.entityActionDefinitionReference, this.uploadedFile, this.exportMessage, this.batchRunId, this.status, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DataExportOutput.class != obj.getClass()) {
            return false;
        }
        DataExportOutput dataExportOutput = (DataExportOutput) obj;
        return s6c.m47909a(getId(), dataExportOutput.getId()) && s6c.m47909a(getAccountId(), dataExportOutput.getAccountId()) && s6c.m47909a(getUserId(), dataExportOutput.getUserId()) && s6c.m47909a(getTeamId(), dataExportOutput.getTeamId()) && s6c.m47909a(getEntityActionDefinitionReference(), dataExportOutput.getEntityActionDefinitionReference()) && s6c.m47909a(getUploadedFile(), dataExportOutput.getUploadedFile()) && s6c.m47909a(getExportMessage(), dataExportOutput.getExportMessage()) && s6c.m47909a(getBatchRunId(), dataExportOutput.getBatchRunId()) && s6c.m47909a(getStatus(), dataExportOutput.getStatus()) && s6c.m47909a(getCreatedAt(), dataExportOutput.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), dataExportOutput.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getBatchRunId() {
        return this.batchRunId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public EntityActionDefinition getEntityActionDefinition() {
        return this.entityActionDefinition;
    }

    public String getEntityActionDefinitionReference() {
        return this.entityActionDefinitionReference;
    }

    public String getExportMessage() {
        return this.exportMessage;
    }

    public String getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public UploadedFile getUploadedFile() {
        return this.uploadedFile;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getUserId() + getTeamId() + getEntityActionDefinitionReference() + getUploadedFile() + getExportMessage() + getBatchRunId() + getStatus() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataExportOutput {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("teamId=" + String.valueOf(getTeamId()) + ", ");
        sb.append("entityActionDefinitionReference=" + String.valueOf(getEntityActionDefinitionReference()) + ", ");
        sb.append("uploadedFile=" + String.valueOf(getUploadedFile()) + ", ");
        sb.append("exportMessage=" + String.valueOf(getExportMessage()) + ", ");
        sb.append("batchRunId=" + String.valueOf(getBatchRunId()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private DataExportOutput(String str, String str2, String str3, String str4, String str5, UploadedFile uploadedFile, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.entityActionDefinition = null;
        this.id = str;
        this.accountId = str2;
        this.userId = str3;
        this.teamId = str4;
        this.entityActionDefinitionReference = str5;
        this.uploadedFile = uploadedFile;
        this.exportMessage = str6;
        this.batchRunId = str7;
        this.status = str8;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
