package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.DeleteDataExportOutputInput;
import type.HasParent;
import type.ModelDataExportOutputConditionInput;
import type.ScopeLevel;

/* loaded from: classes6.dex */
public final class DeleteDataExportOutputMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteDataExportOutput($input: DeleteDataExportOutputInput!, $condition: ModelDataExportOutputConditionInput) {\n  deleteDataExportOutput(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    teamId\n    entityActionDefinitionReference\n    uploadedFileReference\n    exportMessage\n    batchRunId\n    status\n    createdAt\n    updatedAt\n    uploadedFile {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    entityActionDefinition {\n      __typename\n      id\n      accountId\n      name\n      description\n      action\n      target\n      subscriptionType\n      periodicFrequency\n      periodicFrequencyUnit\n      startDateTime\n      endDateTime\n      status\n      ownerId\n      createdAt\n      updatedAt\n      createdBy\n      updatedBy\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteDataExportOutput";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteDataExportOutput($input: DeleteDataExportOutputInput!, $condition: ModelDataExportOutputConditionInput) {\n  deleteDataExportOutput(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    teamId\n    entityActionDefinitionReference\n    uploadedFileReference\n    exportMessage\n    batchRunId\n    status\n    createdAt\n    updatedAt\n    uploadedFile {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    entityActionDefinition {\n      __typename\n      id\n      accountId\n      name\n      description\n      action\n      target\n      subscriptionType\n      periodicFrequency\n      periodicFrequencyUnit\n      startDateTime\n      endDateTime\n      status\n      ownerId\n      createdAt\n      updatedAt\n      createdBy\n      updatedBy\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelDataExportOutputConditionInput condition;
        private DeleteDataExportOutputInput input;

        public DeleteDataExportOutputMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteDataExportOutputMutation(this.input, this.condition);
        }

        public Builder condition(ModelDataExportOutputConditionInput modelDataExportOutputConditionInput) {
            this.condition = modelDataExportOutputConditionInput;
            return this;
        }

        public Builder input(DeleteDataExportOutputInput deleteDataExportOutputInput) {
            this.input = deleteDataExportOutputInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteDataExportOutput", "deleteDataExportOutput", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteDataExportOutput deleteDataExportOutput;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteDataExportOutput.Mapper deleteDataExportOutputFieldMapper = new DeleteDataExportOutput.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteDataExportOutput) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteDataExportOutput>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteDataExportOutput read(ResponseReader responseReader2) {
                        return Mapper.this.deleteDataExportOutputFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteDataExportOutput deleteDataExportOutput) {
            this.deleteDataExportOutput = deleteDataExportOutput;
        }

        public DeleteDataExportOutput deleteDataExportOutput() {
            return this.deleteDataExportOutput;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteDataExportOutput deleteDataExportOutput = this.deleteDataExportOutput;
            DeleteDataExportOutput deleteDataExportOutput2 = ((Data) obj).deleteDataExportOutput;
            return deleteDataExportOutput == null ? deleteDataExportOutput2 == null : deleteDataExportOutput.equals(deleteDataExportOutput2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteDataExportOutput deleteDataExportOutput = this.deleteDataExportOutput;
                this.$hashCode = (deleteDataExportOutput == null ? 0 : deleteDataExportOutput.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteDataExportOutput deleteDataExportOutput = Data.this.deleteDataExportOutput;
                    responseWriter.writeObject(responseField, deleteDataExportOutput != null ? deleteDataExportOutput.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteDataExportOutput=" + this.deleteDataExportOutput + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteDataExportOutput {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String batchRunId;
        final String createdAt;
        final EntityActionDefinition entityActionDefinition;
        final String entityActionDefinitionReference;
        final String exportMessage;
        final String id;
        final String status;
        final String teamId;
        final String updatedAt;
        final UploadedFile uploadedFile;
        final String uploadedFileReference;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<DeleteDataExportOutput> {
            final UploadedFile.Mapper uploadedFileFieldMapper = new UploadedFile.Mapper();
            final EntityActionDefinition.Mapper entityActionDefinitionFieldMapper = new EntityActionDefinition.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteDataExportOutput map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteDataExportOutput.$responseFields;
                return new DeleteDataExportOutput(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (UploadedFile) responseReader.readObject(responseFieldArr[12], new ResponseReader.ObjectReader<UploadedFile>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.DeleteDataExportOutput.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UploadedFile read(ResponseReader responseReader2) {
                        return Mapper.this.uploadedFileFieldMapper.map(responseReader2);
                    }
                }), (EntityActionDefinition) responseReader.readObject(responseFieldArr[13], new ResponseReader.ObjectReader<EntityActionDefinition>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.DeleteDataExportOutput.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public EntityActionDefinition read(ResponseReader responseReader2) {
                        return Mapper.this.entityActionDefinitionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("teamId", "teamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("entityActionDefinitionReference", "entityActionDefinitionReference", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("uploadedFileReference", "uploadedFileReference", null, true, customType, Collections.emptyList()), ResponseField.forString("exportMessage", "exportMessage", null, true, Collections.emptyList()), ResponseField.forString("batchRunId", "batchRunId", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("uploadedFile", "uploadedFile", null, true, Collections.emptyList()), ResponseField.forObject("entityActionDefinition", "entityActionDefinition", null, true, Collections.emptyList())};
        }

        public DeleteDataExportOutput(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, UploadedFile uploadedFile, EntityActionDefinition entityActionDefinition) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = str4;
            this.teamId = str5;
            this.entityActionDefinitionReference = str6;
            this.uploadedFileReference = str7;
            this.exportMessage = str8;
            this.batchRunId = str9;
            this.status = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.uploadedFile = uploadedFile;
            this.entityActionDefinition = entityActionDefinition;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String batchRunId() {
            return this.batchRunId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public EntityActionDefinition entityActionDefinition() {
            return this.entityActionDefinition;
        }

        public String entityActionDefinitionReference() {
            return this.entityActionDefinitionReference;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            UploadedFile uploadedFile;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteDataExportOutput)) {
                return false;
            }
            DeleteDataExportOutput deleteDataExportOutput = (DeleteDataExportOutput) obj;
            if (this.__typename.equals(deleteDataExportOutput.__typename) && this.id.equals(deleteDataExportOutput.id) && this.accountId.equals(deleteDataExportOutput.accountId) && ((str = this.userId) != null ? str.equals(deleteDataExportOutput.userId) : deleteDataExportOutput.userId == null) && ((str2 = this.teamId) != null ? str2.equals(deleteDataExportOutput.teamId) : deleteDataExportOutput.teamId == null) && ((str3 = this.entityActionDefinitionReference) != null ? str3.equals(deleteDataExportOutput.entityActionDefinitionReference) : deleteDataExportOutput.entityActionDefinitionReference == null) && ((str4 = this.uploadedFileReference) != null ? str4.equals(deleteDataExportOutput.uploadedFileReference) : deleteDataExportOutput.uploadedFileReference == null) && ((str5 = this.exportMessage) != null ? str5.equals(deleteDataExportOutput.exportMessage) : deleteDataExportOutput.exportMessage == null) && ((str6 = this.batchRunId) != null ? str6.equals(deleteDataExportOutput.batchRunId) : deleteDataExportOutput.batchRunId == null) && ((str7 = this.status) != null ? str7.equals(deleteDataExportOutput.status) : deleteDataExportOutput.status == null) && ((str8 = this.createdAt) != null ? str8.equals(deleteDataExportOutput.createdAt) : deleteDataExportOutput.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(deleteDataExportOutput.updatedAt) : deleteDataExportOutput.updatedAt == null) && ((uploadedFile = this.uploadedFile) != null ? uploadedFile.equals(deleteDataExportOutput.uploadedFile) : deleteDataExportOutput.uploadedFile == null)) {
                EntityActionDefinition entityActionDefinition = this.entityActionDefinition;
                EntityActionDefinition entityActionDefinition2 = deleteDataExportOutput.entityActionDefinition;
                if (entityActionDefinition == null) {
                    if (entityActionDefinition2 == null) {
                        return true;
                    }
                } else if (entityActionDefinition.equals(entityActionDefinition2)) {
                    return true;
                }
            }
            return false;
        }

        public String exportMessage() {
            return this.exportMessage;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.userId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.entityActionDefinitionReference;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.uploadedFileReference;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.exportMessage;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.batchRunId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.status;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                UploadedFile uploadedFile = this.uploadedFile;
                int iHashCode11 = (iHashCode10 ^ (uploadedFile == null ? 0 : uploadedFile.hashCode())) * 1000003;
                EntityActionDefinition entityActionDefinition = this.entityActionDefinition;
                this.$hashCode = iHashCode11 ^ (entityActionDefinition != null ? entityActionDefinition.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.DeleteDataExportOutput.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteDataExportOutput.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteDataExportOutput.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteDataExportOutput.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteDataExportOutput.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteDataExportOutput.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], DeleteDataExportOutput.this.teamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteDataExportOutput.this.entityActionDefinitionReference);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], DeleteDataExportOutput.this.uploadedFileReference);
                    responseWriter.writeString(responseFieldArr[7], DeleteDataExportOutput.this.exportMessage);
                    responseWriter.writeString(responseFieldArr[8], DeleteDataExportOutput.this.batchRunId);
                    responseWriter.writeString(responseFieldArr[9], DeleteDataExportOutput.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], DeleteDataExportOutput.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], DeleteDataExportOutput.this.updatedAt);
                    ResponseField responseField = responseFieldArr[12];
                    UploadedFile uploadedFile = DeleteDataExportOutput.this.uploadedFile;
                    responseWriter.writeObject(responseField, uploadedFile != null ? uploadedFile.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[13];
                    EntityActionDefinition entityActionDefinition = DeleteDataExportOutput.this.entityActionDefinition;
                    responseWriter.writeObject(responseField2, entityActionDefinition != null ? entityActionDefinition.marshaller() : null);
                }
            };
        }

        public String status() {
            return this.status;
        }

        public String teamId() {
            return this.teamId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteDataExportOutput{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", teamId=" + this.teamId + ", entityActionDefinitionReference=" + this.entityActionDefinitionReference + ", uploadedFileReference=" + this.uploadedFileReference + ", exportMessage=" + this.exportMessage + ", batchRunId=" + this.batchRunId + ", status=" + this.status + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", uploadedFile=" + this.uploadedFile + ", entityActionDefinition=" + this.entityActionDefinition + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UploadedFile uploadedFile() {
            return this.uploadedFile;
        }

        public String uploadedFileReference() {
            return this.uploadedFileReference;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static class EntityActionDefinition {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String action;
        final String createdAt;
        final String createdBy;
        final String description;
        final String endDateTime;
        final String id;
        final String name;
        final String ownerId;
        final Integer periodicFrequency;
        final String periodicFrequencyUnit;
        final String startDateTime;
        final String status;
        final String subscriptionType;
        final String target;
        final String updatedAt;
        final String updatedBy;

        public static final class Mapper implements ResponseFieldMapper<EntityActionDefinition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public EntityActionDefinition map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = EntityActionDefinition.$responseFields;
                return new EntityActionDefinition(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("action", "action", null, true, Collections.emptyList()), ResponseField.forString("target", "target", null, true, Collections.emptyList()), ResponseField.forString("subscriptionType", "subscriptionType", null, true, Collections.emptyList()), ResponseField.forInt("periodicFrequency", "periodicFrequency", null, true, Collections.emptyList()), ResponseField.forString("periodicFrequencyUnit", "periodicFrequencyUnit", null, true, Collections.emptyList()), ResponseField.forCustomType("startDateTime", "startDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDateTime", "endDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList())};
        }

        public EntityActionDefinition(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.action = str6;
            this.target = str7;
            this.subscriptionType = str8;
            this.periodicFrequency = num;
            this.periodicFrequencyUnit = str9;
            this.startDateTime = str10;
            this.endDateTime = str11;
            this.status = str12;
            this.ownerId = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
            this.createdBy = str16;
            this.updatedBy = str17;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String action() {
            return this.action;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdBy() {
            return this.createdBy;
        }

        public String description() {
            return this.description;
        }

        public String endDateTime() {
            return this.endDateTime;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityActionDefinition)) {
                return false;
            }
            EntityActionDefinition entityActionDefinition = (EntityActionDefinition) obj;
            if (this.__typename.equals(entityActionDefinition.__typename) && this.id.equals(entityActionDefinition.id) && this.accountId.equals(entityActionDefinition.accountId) && ((str = this.name) != null ? str.equals(entityActionDefinition.name) : entityActionDefinition.name == null) && ((str2 = this.description) != null ? str2.equals(entityActionDefinition.description) : entityActionDefinition.description == null) && ((str3 = this.action) != null ? str3.equals(entityActionDefinition.action) : entityActionDefinition.action == null) && ((str4 = this.target) != null ? str4.equals(entityActionDefinition.target) : entityActionDefinition.target == null) && ((str5 = this.subscriptionType) != null ? str5.equals(entityActionDefinition.subscriptionType) : entityActionDefinition.subscriptionType == null) && ((num = this.periodicFrequency) != null ? num.equals(entityActionDefinition.periodicFrequency) : entityActionDefinition.periodicFrequency == null) && ((str6 = this.periodicFrequencyUnit) != null ? str6.equals(entityActionDefinition.periodicFrequencyUnit) : entityActionDefinition.periodicFrequencyUnit == null) && ((str7 = this.startDateTime) != null ? str7.equals(entityActionDefinition.startDateTime) : entityActionDefinition.startDateTime == null) && ((str8 = this.endDateTime) != null ? str8.equals(entityActionDefinition.endDateTime) : entityActionDefinition.endDateTime == null) && ((str9 = this.status) != null ? str9.equals(entityActionDefinition.status) : entityActionDefinition.status == null) && ((str10 = this.ownerId) != null ? str10.equals(entityActionDefinition.ownerId) : entityActionDefinition.ownerId == null) && ((str11 = this.createdAt) != null ? str11.equals(entityActionDefinition.createdAt) : entityActionDefinition.createdAt == null) && ((str12 = this.updatedAt) != null ? str12.equals(entityActionDefinition.updatedAt) : entityActionDefinition.updatedAt == null) && ((str13 = this.createdBy) != null ? str13.equals(entityActionDefinition.createdBy) : entityActionDefinition.createdBy == null)) {
                String str14 = this.updatedBy;
                String str15 = entityActionDefinition.updatedBy;
                if (str14 == null) {
                    if (str15 == null) {
                        return true;
                    }
                } else if (str14.equals(str15)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.action;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.target;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.subscriptionType;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.periodicFrequency;
                int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str6 = this.periodicFrequencyUnit;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.startDateTime;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.endDateTime;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.status;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.ownerId;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.createdAt;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.updatedAt;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.createdBy;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.updatedBy;
                this.$hashCode = iHashCode15 ^ (str14 != null ? str14.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.EntityActionDefinition.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = EntityActionDefinition.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], EntityActionDefinition.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], EntityActionDefinition.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], EntityActionDefinition.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], EntityActionDefinition.this.name);
                    responseWriter.writeString(responseFieldArr[4], EntityActionDefinition.this.description);
                    responseWriter.writeString(responseFieldArr[5], EntityActionDefinition.this.action);
                    responseWriter.writeString(responseFieldArr[6], EntityActionDefinition.this.target);
                    responseWriter.writeString(responseFieldArr[7], EntityActionDefinition.this.subscriptionType);
                    responseWriter.writeInt(responseFieldArr[8], EntityActionDefinition.this.periodicFrequency);
                    responseWriter.writeString(responseFieldArr[9], EntityActionDefinition.this.periodicFrequencyUnit);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], EntityActionDefinition.this.startDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], EntityActionDefinition.this.endDateTime);
                    responseWriter.writeString(responseFieldArr[12], EntityActionDefinition.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], EntityActionDefinition.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], EntityActionDefinition.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], EntityActionDefinition.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], EntityActionDefinition.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], EntityActionDefinition.this.updatedBy);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public Integer periodicFrequency() {
            return this.periodicFrequency;
        }

        public String periodicFrequencyUnit() {
            return this.periodicFrequencyUnit;
        }

        public String startDateTime() {
            return this.startDateTime;
        }

        public String status() {
            return this.status;
        }

        public String subscriptionType() {
            return this.subscriptionType;
        }

        public String target() {
            return this.target;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "EntityActionDefinition{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", action=" + this.action + ", target=" + this.target + ", subscriptionType=" + this.subscriptionType + ", periodicFrequency=" + this.periodicFrequency + ", periodicFrequencyUnit=" + this.periodicFrequencyUnit + ", startDateTime=" + this.startDateTime + ", endDateTime=" + this.endDateTime + ", status=" + this.status + ", ownerId=" + this.ownerId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
        }
    }

    public static class UploadedFile {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String description;
        final String documentCategory;
        final String documentSubCategory;
        final String fileMetaData;
        final String fileMimeType;
        final String fileName;
        final String fileStorageDestination;
        final String fileThumbnailUrl;
        final String fileUrl;
        final HasParent hasParent;
        final String id;
        final String parentFileId;
        final String scopeId;
        final ScopeLevel scopeLevel;
        final List<String> tags;
        final String templateBody;
        final String templateExternalLink;
        final String templateLastUsed;
        final String templateTitle;
        final String templateType;
        final String updatedAt;
        final String uploadSource;
        final String uploadedById;

        public static final class Mapper implements ResponseFieldMapper<UploadedFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UploadedFile map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UploadedFile.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                List list = responseReader.readList(responseFieldArr[9], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.UploadedFile.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string8 = responseReader.readString(responseFieldArr[10]);
                String string9 = responseReader.readString(responseFieldArr[11]);
                String string10 = responseReader.readString(responseFieldArr[12]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                String string11 = responseReader.readString(responseFieldArr[14]);
                String string12 = responseReader.readString(responseFieldArr[15]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String string13 = responseReader.readString(responseFieldArr[17]);
                String string14 = responseReader.readString(responseFieldArr[18]);
                String string15 = responseReader.readString(responseFieldArr[19]);
                HasParent hasParentValueOf = string15 != null ? HasParent.valueOf(string15) : null;
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]);
                String string16 = responseReader.readString(responseFieldArr[21]);
                return new UploadedFile(string, str, str2, string2, string3, string4, string5, string6, string7, list, string8, string9, string10, str3, string11, string12, str4, string13, string14, hasParentValueOf, str5, string16 != null ? ScopeLevel.valueOf(string16) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileUrl", "fileUrl", null, true, Collections.emptyList()), ResponseField.forString("fileStorageDestination", "fileStorageDestination", null, true, Collections.emptyList()), ResponseField.forString("fileName", "fileName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("documentCategory", "documentCategory", null, true, Collections.emptyList()), ResponseField.forString("documentSubCategory", "documentSubCategory", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("templateType", "templateType", null, true, Collections.emptyList()), ResponseField.forString("templateTitle", "templateTitle", null, true, Collections.emptyList()), ResponseField.forString("templateBody", "templateBody", null, true, Collections.emptyList()), ResponseField.forCustomType("templateLastUsed", "templateLastUsed", null, true, customType2, Collections.emptyList()), ResponseField.forString("templateExternalLink", "templateExternalLink", null, true, Collections.emptyList()), ResponseField.forString("uploadSource", "uploadSource", null, true, Collections.emptyList()), ResponseField.forCustomType("fileMetaData", "fileMetaData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("fileMimeType", "fileMimeType", null, true, Collections.emptyList()), ResponseField.forString("fileThumbnailUrl", "fileThumbnailUrl", null, true, Collections.emptyList()), ResponseField.forString("hasParent", "hasParent", null, true, Collections.emptyList()), ResponseField.forCustomType("parentFileId", "parentFileId", null, true, customType, Collections.emptyList()), ResponseField.forString("scopeLevel", "scopeLevel", null, true, Collections.emptyList()), ResponseField.forCustomType("scopeId", "scopeId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("uploadedById", "uploadedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public UploadedFile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, HasParent hasParent, String str19, ScopeLevel scopeLevel, String str20, String str21, String str22, String str23) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.fileUrl = str4;
            this.fileStorageDestination = str5;
            this.fileName = str6;
            this.description = str7;
            this.documentCategory = str8;
            this.documentSubCategory = str9;
            this.tags = list;
            this.templateType = str10;
            this.templateTitle = str11;
            this.templateBody = str12;
            this.templateLastUsed = str13;
            this.templateExternalLink = str14;
            this.uploadSource = str15;
            this.fileMetaData = str16;
            this.fileMimeType = str17;
            this.fileThumbnailUrl = str18;
            this.hasParent = hasParent;
            this.parentFileId = str19;
            this.scopeLevel = scopeLevel;
            this.scopeId = str20;
            this.uploadedById = str21;
            this.createdAt = str22;
            this.updatedAt = str23;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String description() {
            return this.description;
        }

        public String documentCategory() {
            return this.documentCategory;
        }

        public String documentSubCategory() {
            return this.documentSubCategory;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            List<String> list;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            HasParent hasParent;
            String str16;
            ScopeLevel scopeLevel;
            String str17;
            String str18;
            String str19;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UploadedFile)) {
                return false;
            }
            UploadedFile uploadedFile = (UploadedFile) obj;
            if (this.__typename.equals(uploadedFile.__typename) && this.id.equals(uploadedFile.id) && this.accountId.equals(uploadedFile.accountId) && ((str = this.fileUrl) != null ? str.equals(uploadedFile.fileUrl) : uploadedFile.fileUrl == null) && ((str2 = this.fileStorageDestination) != null ? str2.equals(uploadedFile.fileStorageDestination) : uploadedFile.fileStorageDestination == null) && ((str3 = this.fileName) != null ? str3.equals(uploadedFile.fileName) : uploadedFile.fileName == null) && ((str4 = this.description) != null ? str4.equals(uploadedFile.description) : uploadedFile.description == null) && ((str5 = this.documentCategory) != null ? str5.equals(uploadedFile.documentCategory) : uploadedFile.documentCategory == null) && ((str6 = this.documentSubCategory) != null ? str6.equals(uploadedFile.documentSubCategory) : uploadedFile.documentSubCategory == null) && ((list = this.tags) != null ? list.equals(uploadedFile.tags) : uploadedFile.tags == null) && ((str7 = this.templateType) != null ? str7.equals(uploadedFile.templateType) : uploadedFile.templateType == null) && ((str8 = this.templateTitle) != null ? str8.equals(uploadedFile.templateTitle) : uploadedFile.templateTitle == null) && ((str9 = this.templateBody) != null ? str9.equals(uploadedFile.templateBody) : uploadedFile.templateBody == null) && ((str10 = this.templateLastUsed) != null ? str10.equals(uploadedFile.templateLastUsed) : uploadedFile.templateLastUsed == null) && ((str11 = this.templateExternalLink) != null ? str11.equals(uploadedFile.templateExternalLink) : uploadedFile.templateExternalLink == null) && ((str12 = this.uploadSource) != null ? str12.equals(uploadedFile.uploadSource) : uploadedFile.uploadSource == null) && ((str13 = this.fileMetaData) != null ? str13.equals(uploadedFile.fileMetaData) : uploadedFile.fileMetaData == null) && ((str14 = this.fileMimeType) != null ? str14.equals(uploadedFile.fileMimeType) : uploadedFile.fileMimeType == null) && ((str15 = this.fileThumbnailUrl) != null ? str15.equals(uploadedFile.fileThumbnailUrl) : uploadedFile.fileThumbnailUrl == null) && ((hasParent = this.hasParent) != null ? hasParent.equals(uploadedFile.hasParent) : uploadedFile.hasParent == null) && ((str16 = this.parentFileId) != null ? str16.equals(uploadedFile.parentFileId) : uploadedFile.parentFileId == null) && ((scopeLevel = this.scopeLevel) != null ? scopeLevel.equals(uploadedFile.scopeLevel) : uploadedFile.scopeLevel == null) && ((str17 = this.scopeId) != null ? str17.equals(uploadedFile.scopeId) : uploadedFile.scopeId == null) && ((str18 = this.uploadedById) != null ? str18.equals(uploadedFile.uploadedById) : uploadedFile.uploadedById == null) && ((str19 = this.createdAt) != null ? str19.equals(uploadedFile.createdAt) : uploadedFile.createdAt == null)) {
                String str20 = this.updatedAt;
                String str21 = uploadedFile.updatedAt;
                if (str20 == null) {
                    if (str21 == null) {
                        return true;
                    }
                } else if (str20.equals(str21)) {
                    return true;
                }
            }
            return false;
        }

        public String fileMetaData() {
            return this.fileMetaData;
        }

        public String fileMimeType() {
            return this.fileMimeType;
        }

        public String fileName() {
            return this.fileName;
        }

        public String fileStorageDestination() {
            return this.fileStorageDestination;
        }

        public String fileThumbnailUrl() {
            return this.fileThumbnailUrl;
        }

        public String fileUrl() {
            return this.fileUrl;
        }

        public HasParent hasParent() {
            return this.hasParent;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.fileUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.fileStorageDestination;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.fileName;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.description;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.documentCategory;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.documentSubCategory;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode8 = (iHashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str7 = this.templateType;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.templateTitle;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.templateBody;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.templateLastUsed;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.templateExternalLink;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.uploadSource;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.fileMetaData;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.fileMimeType;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.fileThumbnailUrl;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                HasParent hasParent = this.hasParent;
                int iHashCode18 = (iHashCode17 ^ (hasParent == null ? 0 : hasParent.hashCode())) * 1000003;
                String str16 = this.parentFileId;
                int iHashCode19 = (iHashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                ScopeLevel scopeLevel = this.scopeLevel;
                int iHashCode20 = (iHashCode19 ^ (scopeLevel == null ? 0 : scopeLevel.hashCode())) * 1000003;
                String str17 = this.scopeId;
                int iHashCode21 = (iHashCode20 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.uploadedById;
                int iHashCode22 = (iHashCode21 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.createdAt;
                int iHashCode23 = (iHashCode22 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.updatedAt;
                this.$hashCode = iHashCode23 ^ (str20 != null ? str20.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.UploadedFile.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UploadedFile.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UploadedFile.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UploadedFile.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UploadedFile.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], UploadedFile.this.fileUrl);
                    responseWriter.writeString(responseFieldArr[4], UploadedFile.this.fileStorageDestination);
                    responseWriter.writeString(responseFieldArr[5], UploadedFile.this.fileName);
                    responseWriter.writeString(responseFieldArr[6], UploadedFile.this.description);
                    responseWriter.writeString(responseFieldArr[7], UploadedFile.this.documentCategory);
                    responseWriter.writeString(responseFieldArr[8], UploadedFile.this.documentSubCategory);
                    responseWriter.writeList(responseFieldArr[9], UploadedFile.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.UploadedFile.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[10], UploadedFile.this.templateType);
                    responseWriter.writeString(responseFieldArr[11], UploadedFile.this.templateTitle);
                    responseWriter.writeString(responseFieldArr[12], UploadedFile.this.templateBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UploadedFile.this.templateLastUsed);
                    responseWriter.writeString(responseFieldArr[14], UploadedFile.this.templateExternalLink);
                    responseWriter.writeString(responseFieldArr[15], UploadedFile.this.uploadSource);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], UploadedFile.this.fileMetaData);
                    responseWriter.writeString(responseFieldArr[17], UploadedFile.this.fileMimeType);
                    responseWriter.writeString(responseFieldArr[18], UploadedFile.this.fileThumbnailUrl);
                    ResponseField responseField = responseFieldArr[19];
                    HasParent hasParent = UploadedFile.this.hasParent;
                    responseWriter.writeString(responseField, hasParent != null ? hasParent.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], UploadedFile.this.parentFileId);
                    ResponseField responseField2 = responseFieldArr[21];
                    ScopeLevel scopeLevel = UploadedFile.this.scopeLevel;
                    responseWriter.writeString(responseField2, scopeLevel != null ? scopeLevel.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], UploadedFile.this.scopeId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], UploadedFile.this.uploadedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], UploadedFile.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], UploadedFile.this.updatedAt);
                }
            };
        }

        public String parentFileId() {
            return this.parentFileId;
        }

        public String scopeId() {
            return this.scopeId;
        }

        public ScopeLevel scopeLevel() {
            return this.scopeLevel;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String templateBody() {
            return this.templateBody;
        }

        public String templateExternalLink() {
            return this.templateExternalLink;
        }

        public String templateLastUsed() {
            return this.templateLastUsed;
        }

        public String templateTitle() {
            return this.templateTitle;
        }

        public String templateType() {
            return this.templateType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UploadedFile{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", fileUrl=" + this.fileUrl + ", fileStorageDestination=" + this.fileStorageDestination + ", fileName=" + this.fileName + ", description=" + this.description + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", tags=" + this.tags + ", templateType=" + this.templateType + ", templateTitle=" + this.templateTitle + ", templateBody=" + this.templateBody + ", templateLastUsed=" + this.templateLastUsed + ", templateExternalLink=" + this.templateExternalLink + ", uploadSource=" + this.uploadSource + ", fileMetaData=" + this.fileMetaData + ", fileMimeType=" + this.fileMimeType + ", fileThumbnailUrl=" + this.fileThumbnailUrl + ", hasParent=" + this.hasParent + ", parentFileId=" + this.parentFileId + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", uploadedById=" + this.uploadedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String uploadSource() {
            return this.uploadSource;
        }

        public String uploadedById() {
            return this.uploadedById;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelDataExportOutputConditionInput condition;
        private final DeleteDataExportOutputInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteDataExportOutputInput deleteDataExportOutputInput, ModelDataExportOutputConditionInput modelDataExportOutputConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteDataExportOutputInput;
            this.condition = modelDataExportOutputConditionInput;
            linkedHashMap.put("input", deleteDataExportOutputInput);
            linkedHashMap.put("condition", modelDataExportOutputConditionInput);
        }

        public ModelDataExportOutputConditionInput condition() {
            return this.condition;
        }

        public DeleteDataExportOutputInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDataExportOutputMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                    inputFieldWriter.writeObject("condition", Variables.this.condition != null ? Variables.this.condition.marshaller() : null);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public DeleteDataExportOutputMutation(DeleteDataExportOutputInput deleteDataExportOutputInput, ModelDataExportOutputConditionInput modelDataExportOutputConditionInput) {
        Utils.checkNotNull(deleteDataExportOutputInput, "input == null");
        this.variables = new Variables(deleteDataExportOutputInput, modelDataExportOutputConditionInput);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.Operation
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String operationId() {
        return "59f3d6999449ae0d80f567ee85e65805a1bd8b06a1018633f885f7986a67a983";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteDataExportOutput($input: DeleteDataExportOutputInput!, $condition: ModelDataExportOutputConditionInput) {\n  deleteDataExportOutput(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    teamId\n    entityActionDefinitionReference\n    uploadedFileReference\n    exportMessage\n    batchRunId\n    status\n    createdAt\n    updatedAt\n    uploadedFile {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    entityActionDefinition {\n      __typename\n      id\n      accountId\n      name\n      description\n      action\n      target\n      subscriptionType\n      periodicFrequency\n      periodicFrequencyUnit\n      startDateTime\n      endDateTime\n      status\n      ownerId\n      createdAt\n      updatedAt\n      createdBy\n      updatedBy\n    }\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Variables variables() {
        return this.variables;
    }
}
