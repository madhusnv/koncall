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
import type.CreateNotificationStagingInput;
import type.CustomType;
import type.ModelNotificationStagingConditionInput;

/* loaded from: classes6.dex */
public final class CreateNotificationStagingMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateNotificationStaging($input: CreateNotificationStagingInput!, $condition: ModelNotificationStagingConditionInput) {\n  createNotificationStaging(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    notificationId\n    notificationChannel\n    notificationStatus\n    notificationType\n    notificationRelatedObjectType\n    notificationRelatedObjectId\n    ownerId\n    primaryTeamId\n    contactId\n    activityDoneByUserId\n    content\n    createdAt\n    updatedAt\n    scheduledAt\n    expirationUnixTime\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateNotificationStagingMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateNotificationStaging";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateNotificationStaging($input: CreateNotificationStagingInput!, $condition: ModelNotificationStagingConditionInput) {\n  createNotificationStaging(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    notificationId\n    notificationChannel\n    notificationStatus\n    notificationType\n    notificationRelatedObjectType\n    notificationRelatedObjectId\n    ownerId\n    primaryTeamId\n    contactId\n    activityDoneByUserId\n    content\n    createdAt\n    updatedAt\n    scheduledAt\n    expirationUnixTime\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelNotificationStagingConditionInput condition;
        private CreateNotificationStagingInput input;

        public CreateNotificationStagingMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateNotificationStagingMutation(this.input, this.condition);
        }

        public Builder condition(ModelNotificationStagingConditionInput modelNotificationStagingConditionInput) {
            this.condition = modelNotificationStagingConditionInput;
            return this;
        }

        public Builder input(CreateNotificationStagingInput createNotificationStagingInput) {
            this.input = createNotificationStagingInput;
            return this;
        }
    }

    public static class CreateNotificationStaging {
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

        public static final class Mapper implements ResponseFieldMapper<CreateNotificationStaging> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateNotificationStaging map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateNotificationStaging.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                String string3 = responseReader.readString(responseFieldArr[5]);
                String string4 = responseReader.readString(responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                return new CreateNotificationStaging(string, str, str2, str3, string2, string3, string4, string5 != null ? ActivityRelatedObjectType.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("notificationId", "notificationId", null, true, customType, Collections.emptyList()), ResponseField.forString("notificationChannel", "notificationChannel", null, true, Collections.emptyList()), ResponseField.forString("notificationStatus", "notificationStatus", null, true, Collections.emptyList()), ResponseField.forString("notificationType", "notificationType", null, true, Collections.emptyList()), ResponseField.forString("notificationRelatedObjectType", "notificationRelatedObjectType", null, false, Collections.emptyList()), ResponseField.forCustomType("notificationRelatedObjectId", "notificationRelatedObjectId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("activityDoneByUserId", "activityDoneByUserId", null, true, customType, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CONTENT, FirebaseAnalytics.Param.CONTENT, null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("scheduledAt", "scheduledAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList())};
        }

        public CreateNotificationStaging(String str, String str2, String str3, String str4, String str5, String str6, String str7, ActivityRelatedObjectType activityRelatedObjectType, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l) {
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
            if (!(obj instanceof CreateNotificationStaging)) {
                return false;
            }
            CreateNotificationStaging createNotificationStaging = (CreateNotificationStaging) obj;
            if (this.__typename.equals(createNotificationStaging.__typename) && this.id.equals(createNotificationStaging.id) && this.accountId.equals(createNotificationStaging.accountId) && ((str = this.notificationId) != null ? str.equals(createNotificationStaging.notificationId) : createNotificationStaging.notificationId == null) && ((str2 = this.notificationChannel) != null ? str2.equals(createNotificationStaging.notificationChannel) : createNotificationStaging.notificationChannel == null) && ((str3 = this.notificationStatus) != null ? str3.equals(createNotificationStaging.notificationStatus) : createNotificationStaging.notificationStatus == null) && ((str4 = this.notificationType) != null ? str4.equals(createNotificationStaging.notificationType) : createNotificationStaging.notificationType == null) && this.notificationRelatedObjectType.equals(createNotificationStaging.notificationRelatedObjectType) && this.notificationRelatedObjectId.equals(createNotificationStaging.notificationRelatedObjectId) && this.ownerId.equals(createNotificationStaging.ownerId) && ((str5 = this.primaryTeamId) != null ? str5.equals(createNotificationStaging.primaryTeamId) : createNotificationStaging.primaryTeamId == null) && ((str6 = this.contactId) != null ? str6.equals(createNotificationStaging.contactId) : createNotificationStaging.contactId == null) && ((str7 = this.activityDoneByUserId) != null ? str7.equals(createNotificationStaging.activityDoneByUserId) : createNotificationStaging.activityDoneByUserId == null) && ((str8 = this.content) != null ? str8.equals(createNotificationStaging.content) : createNotificationStaging.content == null) && ((str9 = this.createdAt) != null ? str9.equals(createNotificationStaging.createdAt) : createNotificationStaging.createdAt == null) && ((str10 = this.updatedAt) != null ? str10.equals(createNotificationStaging.updatedAt) : createNotificationStaging.updatedAt == null) && ((str11 = this.scheduledAt) != null ? str11.equals(createNotificationStaging.scheduledAt) : createNotificationStaging.scheduledAt == null)) {
                Long l = this.expirationUnixTime;
                Long l2 = createNotificationStaging.expirationUnixTime;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateNotificationStagingMutation.CreateNotificationStaging.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateNotificationStaging.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateNotificationStaging.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateNotificationStaging.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateNotificationStaging.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateNotificationStaging.this.notificationId);
                    responseWriter.writeString(responseFieldArr[4], CreateNotificationStaging.this.notificationChannel);
                    responseWriter.writeString(responseFieldArr[5], CreateNotificationStaging.this.notificationStatus);
                    responseWriter.writeString(responseFieldArr[6], CreateNotificationStaging.this.notificationType);
                    responseWriter.writeString(responseFieldArr[7], CreateNotificationStaging.this.notificationRelatedObjectType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], CreateNotificationStaging.this.notificationRelatedObjectId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CreateNotificationStaging.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], CreateNotificationStaging.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], CreateNotificationStaging.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CreateNotificationStaging.this.activityDoneByUserId);
                    responseWriter.writeString(responseFieldArr[13], CreateNotificationStaging.this.content);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], CreateNotificationStaging.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], CreateNotificationStaging.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], CreateNotificationStaging.this.scheduledAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], CreateNotificationStaging.this.expirationUnixTime);
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
                this.$toString = "CreateNotificationStaging{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", notificationId=" + this.notificationId + ", notificationChannel=" + this.notificationChannel + ", notificationStatus=" + this.notificationStatus + ", notificationType=" + this.notificationType + ", notificationRelatedObjectType=" + this.notificationRelatedObjectType + ", notificationRelatedObjectId=" + this.notificationRelatedObjectId + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", contactId=" + this.contactId + ", activityDoneByUserId=" + this.activityDoneByUserId + ", content=" + this.content + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", scheduledAt=" + this.scheduledAt + ", expirationUnixTime=" + this.expirationUnixTime + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createNotificationStaging", "createNotificationStaging", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateNotificationStaging createNotificationStaging;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateNotificationStaging.Mapper createNotificationStagingFieldMapper = new CreateNotificationStaging.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateNotificationStaging) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateNotificationStaging>() { // from class: com.amazonaws.amplify.generated.graphql.CreateNotificationStagingMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateNotificationStaging read(ResponseReader responseReader2) {
                        return Mapper.this.createNotificationStagingFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateNotificationStaging createNotificationStaging) {
            this.createNotificationStaging = createNotificationStaging;
        }

        public CreateNotificationStaging createNotificationStaging() {
            return this.createNotificationStaging;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateNotificationStaging createNotificationStaging = this.createNotificationStaging;
            CreateNotificationStaging createNotificationStaging2 = ((Data) obj).createNotificationStaging;
            return createNotificationStaging == null ? createNotificationStaging2 == null : createNotificationStaging.equals(createNotificationStaging2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateNotificationStaging createNotificationStaging = this.createNotificationStaging;
                this.$hashCode = (createNotificationStaging == null ? 0 : createNotificationStaging.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateNotificationStagingMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateNotificationStaging createNotificationStaging = Data.this.createNotificationStaging;
                    responseWriter.writeObject(responseField, createNotificationStaging != null ? createNotificationStaging.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createNotificationStaging=" + this.createNotificationStaging + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelNotificationStagingConditionInput condition;
        private final CreateNotificationStagingInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateNotificationStagingInput createNotificationStagingInput, ModelNotificationStagingConditionInput modelNotificationStagingConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createNotificationStagingInput;
            this.condition = modelNotificationStagingConditionInput;
            linkedHashMap.put("input", createNotificationStagingInput);
            linkedHashMap.put("condition", modelNotificationStagingConditionInput);
        }

        public ModelNotificationStagingConditionInput condition() {
            return this.condition;
        }

        public CreateNotificationStagingInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateNotificationStagingMutation.Variables.1
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

    public CreateNotificationStagingMutation(CreateNotificationStagingInput createNotificationStagingInput, ModelNotificationStagingConditionInput modelNotificationStagingConditionInput) {
        Utils.checkNotNull(createNotificationStagingInput, "input == null");
        this.variables = new Variables(createNotificationStagingInput, modelNotificationStagingConditionInput);
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
        return "c56dd09b11bb4796a4a9540925cd6267a1b7e017a6ec12983810c5ebbc0af21e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateNotificationStaging($input: CreateNotificationStagingInput!, $condition: ModelNotificationStagingConditionInput) {\n  createNotificationStaging(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    notificationId\n    notificationChannel\n    notificationStatus\n    notificationType\n    notificationRelatedObjectType\n    notificationRelatedObjectId\n    ownerId\n    primaryTeamId\n    contactId\n    activityDoneByUserId\n    content\n    createdAt\n    updatedAt\n    scheduledAt\n    expirationUnixTime\n  }\n}";
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
