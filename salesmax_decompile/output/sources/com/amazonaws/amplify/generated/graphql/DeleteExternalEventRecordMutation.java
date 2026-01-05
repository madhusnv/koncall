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
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.DeleteExternalEventRecordInput;
import type.ModelExternalEventRecordConditionInput;

/* loaded from: classes7.dex */
public final class DeleteExternalEventRecordMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteExternalEventRecord($input: DeleteExternalEventRecordInput!, $condition: ModelExternalEventRecordConditionInput) {\n  deleteExternalEventRecord(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    externalSourceId\n    externalSourceType\n    engagementId\n    userId\n    contactId\n    contactName\n    primaryParticipantEmailId\n    primaryParticipantName\n    recordingUrl\n    transcriptUrl\n    rawEvent\n    message\n    status\n    eventSummary\n    eventDescription\n    eventUrl\n    eventStartTime\n    eventEndTime\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteExternalEventRecordMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteExternalEventRecord";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteExternalEventRecord($input: DeleteExternalEventRecordInput!, $condition: ModelExternalEventRecordConditionInput) {\n  deleteExternalEventRecord(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    externalSourceId\n    externalSourceType\n    engagementId\n    userId\n    contactId\n    contactName\n    primaryParticipantEmailId\n    primaryParticipantName\n    recordingUrl\n    transcriptUrl\n    rawEvent\n    message\n    status\n    eventSummary\n    eventDescription\n    eventUrl\n    eventStartTime\n    eventEndTime\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelExternalEventRecordConditionInput condition;
        private DeleteExternalEventRecordInput input;

        public DeleteExternalEventRecordMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteExternalEventRecordMutation(this.input, this.condition);
        }

        public Builder condition(ModelExternalEventRecordConditionInput modelExternalEventRecordConditionInput) {
            this.condition = modelExternalEventRecordConditionInput;
            return this;
        }

        public Builder input(DeleteExternalEventRecordInput deleteExternalEventRecordInput) {
            this.input = deleteExternalEventRecordInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteExternalEventRecord", "deleteExternalEventRecord", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteExternalEventRecord deleteExternalEventRecord;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteExternalEventRecord.Mapper deleteExternalEventRecordFieldMapper = new DeleteExternalEventRecord.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteExternalEventRecord) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteExternalEventRecord>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteExternalEventRecordMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteExternalEventRecord read(ResponseReader responseReader2) {
                        return Mapper.this.deleteExternalEventRecordFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteExternalEventRecord deleteExternalEventRecord) {
            this.deleteExternalEventRecord = deleteExternalEventRecord;
        }

        public DeleteExternalEventRecord deleteExternalEventRecord() {
            return this.deleteExternalEventRecord;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteExternalEventRecord deleteExternalEventRecord = this.deleteExternalEventRecord;
            DeleteExternalEventRecord deleteExternalEventRecord2 = ((Data) obj).deleteExternalEventRecord;
            return deleteExternalEventRecord == null ? deleteExternalEventRecord2 == null : deleteExternalEventRecord.equals(deleteExternalEventRecord2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteExternalEventRecord deleteExternalEventRecord = this.deleteExternalEventRecord;
                this.$hashCode = (deleteExternalEventRecord == null ? 0 : deleteExternalEventRecord.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteExternalEventRecordMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteExternalEventRecord deleteExternalEventRecord = Data.this.deleteExternalEventRecord;
                    responseWriter.writeObject(responseField, deleteExternalEventRecord != null ? deleteExternalEventRecord.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteExternalEventRecord=" + this.deleteExternalEventRecord + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteExternalEventRecord {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String contactId;
        final String contactName;
        final String createdAt;
        final String engagementId;
        final String eventDescription;
        final String eventEndTime;
        final String eventStartTime;
        final String eventSummary;
        final String eventUrl;
        final String externalSourceId;
        final String externalSourceType;
        final String id;
        final String message;
        final String primaryParticipantEmailId;
        final String primaryParticipantName;
        final String rawEvent;
        final String recordingUrl;
        final String status;
        final String transcriptUrl;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<DeleteExternalEventRecord> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteExternalEventRecord map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteExternalEventRecord.$responseFields;
                return new DeleteExternalEventRecord(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("externalSourceId", "externalSourceId", null, false, customType, Collections.emptyList()), ResponseField.forString("externalSourceType", "externalSourceType", null, false, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactName", "contactName", null, true, Collections.emptyList()), ResponseField.forCustomType("primaryParticipantEmailId", "primaryParticipantEmailId", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forString("primaryParticipantName", "primaryParticipantName", null, true, Collections.emptyList()), ResponseField.forString("recordingUrl", "recordingUrl", null, true, Collections.emptyList()), ResponseField.forString("transcriptUrl", "transcriptUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("rawEvent", "rawEvent", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, null, true, customType2, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("eventSummary", "eventSummary", null, true, Collections.emptyList()), ResponseField.forString("eventDescription", "eventDescription", null, true, Collections.emptyList()), ResponseField.forString("eventUrl", "eventUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("eventStartTime", "eventStartTime", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("eventEndTime", "eventEndTime", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public DeleteExternalEventRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.externalSourceId = (String) Utils.checkNotNull(str4, "externalSourceId == null");
            this.externalSourceType = (String) Utils.checkNotNull(str5, "externalSourceType == null");
            this.engagementId = str6;
            this.userId = str7;
            this.contactId = str8;
            this.contactName = str9;
            this.primaryParticipantEmailId = str10;
            this.primaryParticipantName = str11;
            this.recordingUrl = str12;
            this.transcriptUrl = str13;
            this.rawEvent = str14;
            this.message = str15;
            this.status = str16;
            this.eventSummary = str17;
            this.eventDescription = str18;
            this.eventUrl = str19;
            this.eventStartTime = str20;
            this.eventEndTime = str21;
            this.createdAt = str22;
            this.updatedAt = str23;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String contactName() {
            return this.contactName;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String engagementId() {
            return this.engagementId;
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
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteExternalEventRecord)) {
                return false;
            }
            DeleteExternalEventRecord deleteExternalEventRecord = (DeleteExternalEventRecord) obj;
            if (this.__typename.equals(deleteExternalEventRecord.__typename) && this.id.equals(deleteExternalEventRecord.id) && this.accountId.equals(deleteExternalEventRecord.accountId) && this.externalSourceId.equals(deleteExternalEventRecord.externalSourceId) && this.externalSourceType.equals(deleteExternalEventRecord.externalSourceType) && ((str = this.engagementId) != null ? str.equals(deleteExternalEventRecord.engagementId) : deleteExternalEventRecord.engagementId == null) && ((str2 = this.userId) != null ? str2.equals(deleteExternalEventRecord.userId) : deleteExternalEventRecord.userId == null) && ((str3 = this.contactId) != null ? str3.equals(deleteExternalEventRecord.contactId) : deleteExternalEventRecord.contactId == null) && ((str4 = this.contactName) != null ? str4.equals(deleteExternalEventRecord.contactName) : deleteExternalEventRecord.contactName == null) && ((str5 = this.primaryParticipantEmailId) != null ? str5.equals(deleteExternalEventRecord.primaryParticipantEmailId) : deleteExternalEventRecord.primaryParticipantEmailId == null) && ((str6 = this.primaryParticipantName) != null ? str6.equals(deleteExternalEventRecord.primaryParticipantName) : deleteExternalEventRecord.primaryParticipantName == null) && ((str7 = this.recordingUrl) != null ? str7.equals(deleteExternalEventRecord.recordingUrl) : deleteExternalEventRecord.recordingUrl == null) && ((str8 = this.transcriptUrl) != null ? str8.equals(deleteExternalEventRecord.transcriptUrl) : deleteExternalEventRecord.transcriptUrl == null) && ((str9 = this.rawEvent) != null ? str9.equals(deleteExternalEventRecord.rawEvent) : deleteExternalEventRecord.rawEvent == null) && ((str10 = this.message) != null ? str10.equals(deleteExternalEventRecord.message) : deleteExternalEventRecord.message == null) && ((str11 = this.status) != null ? str11.equals(deleteExternalEventRecord.status) : deleteExternalEventRecord.status == null) && ((str12 = this.eventSummary) != null ? str12.equals(deleteExternalEventRecord.eventSummary) : deleteExternalEventRecord.eventSummary == null) && ((str13 = this.eventDescription) != null ? str13.equals(deleteExternalEventRecord.eventDescription) : deleteExternalEventRecord.eventDescription == null) && ((str14 = this.eventUrl) != null ? str14.equals(deleteExternalEventRecord.eventUrl) : deleteExternalEventRecord.eventUrl == null) && ((str15 = this.eventStartTime) != null ? str15.equals(deleteExternalEventRecord.eventStartTime) : deleteExternalEventRecord.eventStartTime == null) && ((str16 = this.eventEndTime) != null ? str16.equals(deleteExternalEventRecord.eventEndTime) : deleteExternalEventRecord.eventEndTime == null) && ((str17 = this.createdAt) != null ? str17.equals(deleteExternalEventRecord.createdAt) : deleteExternalEventRecord.createdAt == null)) {
                String str18 = this.updatedAt;
                String str19 = deleteExternalEventRecord.updatedAt;
                if (str18 == null) {
                    if (str19 == null) {
                        return true;
                    }
                } else if (str18.equals(str19)) {
                    return true;
                }
            }
            return false;
        }

        public String eventDescription() {
            return this.eventDescription;
        }

        public String eventEndTime() {
            return this.eventEndTime;
        }

        public String eventStartTime() {
            return this.eventStartTime;
        }

        public String eventSummary() {
            return this.eventSummary;
        }

        public String eventUrl() {
            return this.eventUrl;
        }

        public String externalSourceId() {
            return this.externalSourceId;
        }

        public String externalSourceType() {
            return this.externalSourceType;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.externalSourceId.hashCode()) * 1000003) ^ this.externalSourceType.hashCode()) * 1000003;
                String str = this.engagementId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.userId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.contactId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.contactName;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.primaryParticipantEmailId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.primaryParticipantName;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.recordingUrl;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.transcriptUrl;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.rawEvent;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.message;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.status;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.eventSummary;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.eventDescription;
                int iHashCode14 = (iHashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.eventUrl;
                int iHashCode15 = (iHashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.eventStartTime;
                int iHashCode16 = (iHashCode15 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.eventEndTime;
                int iHashCode17 = (iHashCode16 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdAt;
                int iHashCode18 = (iHashCode17 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedAt;
                this.$hashCode = iHashCode18 ^ (str18 != null ? str18.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteExternalEventRecordMutation.DeleteExternalEventRecord.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteExternalEventRecord.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteExternalEventRecord.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteExternalEventRecord.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteExternalEventRecord.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteExternalEventRecord.this.externalSourceId);
                    responseWriter.writeString(responseFieldArr[4], DeleteExternalEventRecord.this.externalSourceType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteExternalEventRecord.this.engagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], DeleteExternalEventRecord.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], DeleteExternalEventRecord.this.contactId);
                    responseWriter.writeString(responseFieldArr[8], DeleteExternalEventRecord.this.contactName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], DeleteExternalEventRecord.this.primaryParticipantEmailId);
                    responseWriter.writeString(responseFieldArr[10], DeleteExternalEventRecord.this.primaryParticipantName);
                    responseWriter.writeString(responseFieldArr[11], DeleteExternalEventRecord.this.recordingUrl);
                    responseWriter.writeString(responseFieldArr[12], DeleteExternalEventRecord.this.transcriptUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], DeleteExternalEventRecord.this.rawEvent);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], DeleteExternalEventRecord.this.message);
                    responseWriter.writeString(responseFieldArr[15], DeleteExternalEventRecord.this.status);
                    responseWriter.writeString(responseFieldArr[16], DeleteExternalEventRecord.this.eventSummary);
                    responseWriter.writeString(responseFieldArr[17], DeleteExternalEventRecord.this.eventDescription);
                    responseWriter.writeString(responseFieldArr[18], DeleteExternalEventRecord.this.eventUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], DeleteExternalEventRecord.this.eventStartTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], DeleteExternalEventRecord.this.eventEndTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], DeleteExternalEventRecord.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], DeleteExternalEventRecord.this.updatedAt);
                }
            };
        }

        public String message() {
            return this.message;
        }

        public String primaryParticipantEmailId() {
            return this.primaryParticipantEmailId;
        }

        public String primaryParticipantName() {
            return this.primaryParticipantName;
        }

        public String rawEvent() {
            return this.rawEvent;
        }

        public String recordingUrl() {
            return this.recordingUrl;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteExternalEventRecord{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", externalSourceId=" + this.externalSourceId + ", externalSourceType=" + this.externalSourceType + ", engagementId=" + this.engagementId + ", userId=" + this.userId + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", primaryParticipantEmailId=" + this.primaryParticipantEmailId + ", primaryParticipantName=" + this.primaryParticipantName + ", recordingUrl=" + this.recordingUrl + ", transcriptUrl=" + this.transcriptUrl + ", rawEvent=" + this.rawEvent + ", message=" + this.message + ", status=" + this.status + ", eventSummary=" + this.eventSummary + ", eventDescription=" + this.eventDescription + ", eventUrl=" + this.eventUrl + ", eventStartTime=" + this.eventStartTime + ", eventEndTime=" + this.eventEndTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String transcriptUrl() {
            return this.transcriptUrl;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelExternalEventRecordConditionInput condition;
        private final DeleteExternalEventRecordInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteExternalEventRecordInput deleteExternalEventRecordInput, ModelExternalEventRecordConditionInput modelExternalEventRecordConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteExternalEventRecordInput;
            this.condition = modelExternalEventRecordConditionInput;
            linkedHashMap.put("input", deleteExternalEventRecordInput);
            linkedHashMap.put("condition", modelExternalEventRecordConditionInput);
        }

        public ModelExternalEventRecordConditionInput condition() {
            return this.condition;
        }

        public DeleteExternalEventRecordInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteExternalEventRecordMutation.Variables.1
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

    public DeleteExternalEventRecordMutation(DeleteExternalEventRecordInput deleteExternalEventRecordInput, ModelExternalEventRecordConditionInput modelExternalEventRecordConditionInput) {
        Utils.checkNotNull(deleteExternalEventRecordInput, "input == null");
        this.variables = new Variables(deleteExternalEventRecordInput, modelExternalEventRecordConditionInput);
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
        return "822b23d0c67f71c749bc74ddf7906d00ee6a51228a6e3d5a3bea4fc753caf2d5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteExternalEventRecord($input: DeleteExternalEventRecordInput!, $condition: ModelExternalEventRecordConditionInput) {\n  deleteExternalEventRecord(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    externalSourceId\n    externalSourceType\n    engagementId\n    userId\n    contactId\n    contactName\n    primaryParticipantEmailId\n    primaryParticipantName\n    recordingUrl\n    transcriptUrl\n    rawEvent\n    message\n    status\n    eventSummary\n    eventDescription\n    eventUrl\n    eventStartTime\n    eventEndTime\n    createdAt\n    updatedAt\n  }\n}";
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
