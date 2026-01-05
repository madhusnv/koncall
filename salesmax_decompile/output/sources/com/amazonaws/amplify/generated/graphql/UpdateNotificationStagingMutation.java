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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.ActivityRelatedObjectType;
import type.CustomType;
import type.ModelNotificationStagingConditionInput;
import type.UpdateNotificationStagingInput;

/* loaded from: classes4.dex */
public final class UpdateNotificationStagingMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateNotificationStaging($input: UpdateNotificationStagingInput!, $condition: ModelNotificationStagingConditionInput) {\n  updateNotificationStaging(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    notificationId\n    notificationChannel\n    notificationStatus\n    notificationType\n    notificationRelatedObjectType\n    notificationRelatedObjectId\n    ownerId\n    primaryTeamId\n    contactId\n    activityDoneByUserId\n    content\n    createdAt\n    updatedAt\n    scheduledAt\n    expirationUnixTime\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateNotificationStagingMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateNotificationStaging";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateNotificationStaging($input: UpdateNotificationStagingInput!, $condition: ModelNotificationStagingConditionInput) {\n  updateNotificationStaging(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    notificationId\n    notificationChannel\n    notificationStatus\n    notificationType\n    notificationRelatedObjectType\n    notificationRelatedObjectId\n    ownerId\n    primaryTeamId\n    contactId\n    activityDoneByUserId\n    content\n    createdAt\n    updatedAt\n    scheduledAt\n    expirationUnixTime\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelNotificationStagingConditionInput condition;
        private UpdateNotificationStagingInput input;

        public UpdateNotificationStagingMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateNotificationStagingMutation(this.input, this.condition);
        }

        public Builder condition(ModelNotificationStagingConditionInput modelNotificationStagingConditionInput) {
            this.condition = modelNotificationStagingConditionInput;
            return this;
        }

        public Builder input(UpdateNotificationStagingInput updateNotificationStagingInput) {
            this.input = updateNotificationStagingInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateNotificationStaging", "updateNotificationStaging", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateNotificationStaging updateNotificationStaging;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateNotificationStaging.Mapper updateNotificationStagingFieldMapper = new UpdateNotificationStaging.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateNotificationStaging) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateNotificationStaging>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateNotificationStagingMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateNotificationStaging read(ResponseReader responseReader2) {
                        return Mapper.this.updateNotificationStagingFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateNotificationStaging updateNotificationStaging) {
            this.updateNotificationStaging = updateNotificationStaging;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateNotificationStaging updateNotificationStaging = this.updateNotificationStaging;
            UpdateNotificationStaging updateNotificationStaging2 = ((Data) obj).updateNotificationStaging;
            return updateNotificationStaging == null ? updateNotificationStaging2 == null : updateNotificationStaging.equals(updateNotificationStaging2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateNotificationStaging updateNotificationStaging = this.updateNotificationStaging;
                this.$hashCode = (updateNotificationStaging == null ? 0 : updateNotificationStaging.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateNotificationStagingMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateNotificationStaging updateNotificationStaging = Data.this.updateNotificationStaging;
                    responseWriter.writeObject(responseField, updateNotificationStaging != null ? updateNotificationStaging.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateNotificationStaging=" + this.updateNotificationStaging + "}";
            }
            return this.$toString;
        }

        public UpdateNotificationStaging updateNotificationStaging() {
            return this.updateNotificationStaging;
        }
    }

    public static class UpdateNotificationStaging {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String activityDoneByUserId;
        final String contactId;
        final String content;
        final String createdAt;
        final Long expirationUnixTime;
        final String id;
        final String notificationChannel;
        final String notificationId;
        final String notificationRelatedObjectId;
        final ActivityRelatedObjectType notificationRelatedObjectType;
        final String notificationStatus;
        final String notificationType;
        final String ownerId;
        final String primaryTeamId;
        final String scheduledAt;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateNotificationStaging> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateNotificationStaging map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateNotificationStaging.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                String string3 = responseReader.readString(responseFieldArr[5]);
                String string4 = responseReader.readString(responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                return new UpdateNotificationStaging(string, str, str2, str3, string2, string3, string4, string5 != null ? ActivityRelatedObjectType.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("notificationId", "notificationId", null, true, customType, Collections.emptyList()), ResponseField.forString("notificationChannel", "notificationChannel", null, true, Collections.emptyList()), ResponseField.forString("notificationStatus", "notificationStatus", null, true, Collections.emptyList()), ResponseField.forString("notificationType", "notificationType", null, true, Collections.emptyList()), ResponseField.forString("notificationRelatedObjectType", "notificationRelatedObjectType", null, false, Collections.emptyList()), ResponseField.forCustomType("notificationRelatedObjectId", "notificationRelatedObjectId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("activityDoneByUserId", "activityDoneByUserId", null, true, customType, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CONTENT, FirebaseAnalytics.Param.CONTENT, null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("scheduledAt", "scheduledAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList())};
        }

        public UpdateNotificationStaging(String str, String str2, String str3, String str4, String str5, String str6, String str7, ActivityRelatedObjectType activityRelatedObjectType, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.notificationId = str4;
            this.notificationChannel = str5;
            this.notificationStatus = str6;
            this.notificationType = str7;
            this.notificationRelatedObjectType = (ActivityRelatedObjectType) Utils.checkNotNull(activityRelatedObjectType, "notificationRelatedObjectType == null");
            this.notificationRelatedObjectId = (String) Utils.checkNotNull(str8, "notificationRelatedObjectId == null");
            this.ownerId = (String) Utils.checkNotNull(str9, "ownerId == null");
            this.primaryTeamId = str10;
            this.contactId = str11;
            this.activityDoneByUserId = str12;
            this.content = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
            this.scheduledAt = str16;
            this.expirationUnixTime = l;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String activityDoneByUserId() {
            return this.activityDoneByUserId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String content() {
            return this.content;
        }

        public String createdAt() {
            return this.createdAt;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateNotificationStaging)) {
                return false;
            }
            UpdateNotificationStaging updateNotificationStaging = (UpdateNotificationStaging) obj;
            if (this.__typename.equals(updateNotificationStaging.__typename) && this.id.equals(updateNotificationStaging.id) && this.accountId.equals(updateNotificationStaging.accountId) && ((str = this.notificationId) != null ? str.equals(updateNotificationStaging.notificationId) : updateNotificationStaging.notificationId == null) && ((str2 = this.notificationChannel) != null ? str2.equals(updateNotificationStaging.notificationChannel) : updateNotificationStaging.notificationChannel == null) && ((str3 = this.notificationStatus) != null ? str3.equals(updateNotificationStaging.notificationStatus) : updateNotificationStaging.notificationStatus == null) && ((str4 = this.notificationType) != null ? str4.equals(updateNotificationStaging.notificationType) : updateNotificationStaging.notificationType == null) && this.notificationRelatedObjectType.equals(updateNotificationStaging.notificationRelatedObjectType) && this.notificationRelatedObjectId.equals(updateNotificationStaging.notificationRelatedObjectId) && this.ownerId.equals(updateNotificationStaging.ownerId) && ((str5 = this.primaryTeamId) != null ? str5.equals(updateNotificationStaging.primaryTeamId) : updateNotificationStaging.primaryTeamId == null) && ((str6 = this.contactId) != null ? str6.equals(updateNotificationStaging.contactId) : updateNotificationStaging.contactId == null) && ((str7 = this.activityDoneByUserId) != null ? str7.equals(updateNotificationStaging.activityDoneByUserId) : updateNotificationStaging.activityDoneByUserId == null) && ((str8 = this.content) != null ? str8.equals(updateNotificationStaging.content) : updateNotificationStaging.content == null) && ((str9 = this.createdAt) != null ? str9.equals(updateNotificationStaging.createdAt) : updateNotificationStaging.createdAt == null) && ((str10 = this.updatedAt) != null ? str10.equals(updateNotificationStaging.updatedAt) : updateNotificationStaging.updatedAt == null) && ((str11 = this.scheduledAt) != null ? str11.equals(updateNotificationStaging.scheduledAt) : updateNotificationStaging.scheduledAt == null)) {
                Long l = this.expirationUnixTime;
                Long l2 = updateNotificationStaging.expirationUnixTime;
                if (l == null) {
                    if (l2 == null) {
                        return true;
                    }
                } else if (l.equals(l2)) {
                    return true;
                }
            }
            return false;
        }

        public Long expirationUnixTime() {
            return this.expirationUnixTime;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.notificationId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.notificationChannel;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.notificationStatus;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.notificationType;
                int iHashCode5 = (((((((iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.notificationRelatedObjectType.hashCode()) * 1000003) ^ this.notificationRelatedObjectId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str5 = this.primaryTeamId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.contactId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.activityDoneByUserId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.content;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.updatedAt;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.scheduledAt;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Long l = this.expirationUnixTime;
                this.$hashCode = iHashCode12 ^ (l != null ? l.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateNotificationStagingMutation.UpdateNotificationStaging.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateNotificationStaging.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateNotificationStaging.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateNotificationStaging.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateNotificationStaging.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateNotificationStaging.this.notificationId);
                    responseWriter.writeString(responseFieldArr[4], UpdateNotificationStaging.this.notificationChannel);
                    responseWriter.writeString(responseFieldArr[5], UpdateNotificationStaging.this.notificationStatus);
                    responseWriter.writeString(responseFieldArr[6], UpdateNotificationStaging.this.notificationType);
                    responseWriter.writeString(responseFieldArr[7], UpdateNotificationStaging.this.notificationRelatedObjectType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateNotificationStaging.this.notificationRelatedObjectId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateNotificationStaging.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateNotificationStaging.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], UpdateNotificationStaging.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdateNotificationStaging.this.activityDoneByUserId);
                    responseWriter.writeString(responseFieldArr[13], UpdateNotificationStaging.this.content);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], UpdateNotificationStaging.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], UpdateNotificationStaging.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], UpdateNotificationStaging.this.scheduledAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], UpdateNotificationStaging.this.expirationUnixTime);
                }
            };
        }

        public String notificationChannel() {
            return this.notificationChannel;
        }

        public String notificationId() {
            return this.notificationId;
        }

        public String notificationRelatedObjectId() {
            return this.notificationRelatedObjectId;
        }

        public ActivityRelatedObjectType notificationRelatedObjectType() {
            return this.notificationRelatedObjectType;
        }

        public String notificationStatus() {
            return this.notificationStatus;
        }

        public String notificationType() {
            return this.notificationType;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String scheduledAt() {
            return this.scheduledAt;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateNotificationStaging{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", notificationId=" + this.notificationId + ", notificationChannel=" + this.notificationChannel + ", notificationStatus=" + this.notificationStatus + ", notificationType=" + this.notificationType + ", notificationRelatedObjectType=" + this.notificationRelatedObjectType + ", notificationRelatedObjectId=" + this.notificationRelatedObjectId + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", contactId=" + this.contactId + ", activityDoneByUserId=" + this.activityDoneByUserId + ", content=" + this.content + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", scheduledAt=" + this.scheduledAt + ", expirationUnixTime=" + this.expirationUnixTime + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelNotificationStagingConditionInput condition;
        private final UpdateNotificationStagingInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateNotificationStagingInput updateNotificationStagingInput, ModelNotificationStagingConditionInput modelNotificationStagingConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateNotificationStagingInput;
            this.condition = modelNotificationStagingConditionInput;
            linkedHashMap.put("input", updateNotificationStagingInput);
            linkedHashMap.put("condition", modelNotificationStagingConditionInput);
        }

        public ModelNotificationStagingConditionInput condition() {
            return this.condition;
        }

        public UpdateNotificationStagingInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateNotificationStagingMutation.Variables.1
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

    public UpdateNotificationStagingMutation(UpdateNotificationStagingInput updateNotificationStagingInput, ModelNotificationStagingConditionInput modelNotificationStagingConditionInput) {
        Utils.checkNotNull(updateNotificationStagingInput, "input == null");
        this.variables = new Variables(updateNotificationStagingInput, modelNotificationStagingConditionInput);
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
        return "55f4675b44351c2ca2eb640ad79dc69fdfe451633680fc099e1aa1282f0c47a2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateNotificationStaging($input: UpdateNotificationStagingInput!, $condition: ModelNotificationStagingConditionInput) {\n  updateNotificationStaging(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    notificationId\n    notificationChannel\n    notificationStatus\n    notificationType\n    notificationRelatedObjectType\n    notificationRelatedObjectId\n    ownerId\n    primaryTeamId\n    contactId\n    activityDoneByUserId\n    content\n    createdAt\n    updatedAt\n    scheduledAt\n    expirationUnixTime\n  }\n}";
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
