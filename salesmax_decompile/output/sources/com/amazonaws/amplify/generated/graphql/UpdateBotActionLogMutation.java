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
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.ModelBotActionLogConditionInput;
import type.UpdateBotActionLogInput;

/* loaded from: classes4.dex */
public final class UpdateBotActionLogMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateBotActionLog($input: UpdateBotActionLogInput!, $condition: ModelBotActionLogConditionInput) {\n  updateBotActionLog(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    actionName\n    triggerMessageId\n    context\n    status\n    errorMessage\n    timestamp\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionLogMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateBotActionLog";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateBotActionLog($input: UpdateBotActionLogInput!, $condition: ModelBotActionLogConditionInput) {\n  updateBotActionLog(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    actionName\n    triggerMessageId\n    context\n    status\n    errorMessage\n    timestamp\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelBotActionLogConditionInput condition;
        private UpdateBotActionLogInput input;

        public UpdateBotActionLogMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateBotActionLogMutation(this.input, this.condition);
        }

        public Builder condition(ModelBotActionLogConditionInput modelBotActionLogConditionInput) {
            this.condition = modelBotActionLogConditionInput;
            return this;
        }

        public Builder input(UpdateBotActionLogInput updateBotActionLogInput) {
            this.input = updateBotActionLogInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateBotActionLog", "updateBotActionLog", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateBotActionLog updateBotActionLog;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateBotActionLog.Mapper updateBotActionLogFieldMapper = new UpdateBotActionLog.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateBotActionLog) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateBotActionLog>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionLogMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateBotActionLog read(ResponseReader responseReader2) {
                        return Mapper.this.updateBotActionLogFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateBotActionLog updateBotActionLog) {
            this.updateBotActionLog = updateBotActionLog;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateBotActionLog updateBotActionLog = this.updateBotActionLog;
            UpdateBotActionLog updateBotActionLog2 = ((Data) obj).updateBotActionLog;
            return updateBotActionLog == null ? updateBotActionLog2 == null : updateBotActionLog.equals(updateBotActionLog2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateBotActionLog updateBotActionLog = this.updateBotActionLog;
                this.$hashCode = (updateBotActionLog == null ? 0 : updateBotActionLog.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionLogMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateBotActionLog updateBotActionLog = Data.this.updateBotActionLog;
                    responseWriter.writeObject(responseField, updateBotActionLog != null ? updateBotActionLog.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateBotActionLog=" + this.updateBotActionLog + "}";
            }
            return this.$toString;
        }

        public UpdateBotActionLog updateBotActionLog() {
            return this.updateBotActionLog;
        }
    }

    public static class UpdateBotActionLog {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String actionId;
        final String actionName;
        final String botId;
        final String context;
        final String createdAt;
        final String errorMessage;
        final String id;
        final String status;
        final String timestamp;
        final String triggerMessageId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateBotActionLog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateBotActionLog map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateBotActionLog.$responseFields;
                return new UpdateBotActionLog(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("botId", "botId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("actionName", "actionName", null, true, Collections.emptyList()), ResponseField.forCustomType("triggerMessageId", "triggerMessageId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("context", "context", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("errorMessage", "errorMessage", null, true, Collections.emptyList()), ResponseField.forCustomType("timestamp", "timestamp", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public UpdateBotActionLog(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.botId = (String) Utils.checkNotNull(str4, "botId == null");
            this.actionId = (String) Utils.checkNotNull(str5, "actionId == null");
            this.actionName = str6;
            this.triggerMessageId = str7;
            this.context = str8;
            this.status = str9;
            this.errorMessage = str10;
            this.timestamp = (String) Utils.checkNotNull(str11, "timestamp == null");
            this.createdAt = (String) Utils.checkNotNull(str12, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str13, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String actionId() {
            return this.actionId;
        }

        public String actionName() {
            return this.actionName;
        }

        public String botId() {
            return this.botId;
        }

        public String context() {
            return this.context;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateBotActionLog)) {
                return false;
            }
            UpdateBotActionLog updateBotActionLog = (UpdateBotActionLog) obj;
            return this.__typename.equals(updateBotActionLog.__typename) && this.id.equals(updateBotActionLog.id) && this.accountId.equals(updateBotActionLog.accountId) && this.botId.equals(updateBotActionLog.botId) && this.actionId.equals(updateBotActionLog.actionId) && ((str = this.actionName) != null ? str.equals(updateBotActionLog.actionName) : updateBotActionLog.actionName == null) && ((str2 = this.triggerMessageId) != null ? str2.equals(updateBotActionLog.triggerMessageId) : updateBotActionLog.triggerMessageId == null) && ((str3 = this.context) != null ? str3.equals(updateBotActionLog.context) : updateBotActionLog.context == null) && ((str4 = this.status) != null ? str4.equals(updateBotActionLog.status) : updateBotActionLog.status == null) && ((str5 = this.errorMessage) != null ? str5.equals(updateBotActionLog.errorMessage) : updateBotActionLog.errorMessage == null) && this.timestamp.equals(updateBotActionLog.timestamp) && this.createdAt.equals(updateBotActionLog.createdAt) && this.updatedAt.equals(updateBotActionLog.updatedAt);
        }

        public String errorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.botId.hashCode()) * 1000003) ^ this.actionId.hashCode()) * 1000003;
                String str = this.actionName;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.triggerMessageId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.context;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.status;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.errorMessage;
                this.$hashCode = ((((((iHashCode5 ^ (str5 != null ? str5.hashCode() : 0)) * 1000003) ^ this.timestamp.hashCode()) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionLogMutation.UpdateBotActionLog.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateBotActionLog.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateBotActionLog.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateBotActionLog.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateBotActionLog.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateBotActionLog.this.botId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], UpdateBotActionLog.this.actionId);
                    responseWriter.writeString(responseFieldArr[5], UpdateBotActionLog.this.actionName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateBotActionLog.this.triggerMessageId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateBotActionLog.this.context);
                    responseWriter.writeString(responseFieldArr[8], UpdateBotActionLog.this.status);
                    responseWriter.writeString(responseFieldArr[9], UpdateBotActionLog.this.errorMessage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateBotActionLog.this.timestamp);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], UpdateBotActionLog.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdateBotActionLog.this.updatedAt);
                }
            };
        }

        public String status() {
            return this.status;
        }

        public String timestamp() {
            return this.timestamp;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateBotActionLog{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", botId=" + this.botId + ", actionId=" + this.actionId + ", actionName=" + this.actionName + ", triggerMessageId=" + this.triggerMessageId + ", context=" + this.context + ", status=" + this.status + ", errorMessage=" + this.errorMessage + ", timestamp=" + this.timestamp + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String triggerMessageId() {
            return this.triggerMessageId;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelBotActionLogConditionInput condition;
        private final UpdateBotActionLogInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateBotActionLogInput updateBotActionLogInput, ModelBotActionLogConditionInput modelBotActionLogConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateBotActionLogInput;
            this.condition = modelBotActionLogConditionInput;
            linkedHashMap.put("input", updateBotActionLogInput);
            linkedHashMap.put("condition", modelBotActionLogConditionInput);
        }

        public ModelBotActionLogConditionInput condition() {
            return this.condition;
        }

        public UpdateBotActionLogInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionLogMutation.Variables.1
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

    public UpdateBotActionLogMutation(UpdateBotActionLogInput updateBotActionLogInput, ModelBotActionLogConditionInput modelBotActionLogConditionInput) {
        Utils.checkNotNull(updateBotActionLogInput, "input == null");
        this.variables = new Variables(updateBotActionLogInput, modelBotActionLogConditionInput);
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
        return "b64e1869e1c6662e2ed2cfe3dfdd8078a694c95d0ebb3dc3e92f2366cb3ae5b1";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateBotActionLog($input: UpdateBotActionLogInput!, $condition: ModelBotActionLogConditionInput) {\n  updateBotActionLog(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    actionName\n    triggerMessageId\n    context\n    status\n    errorMessage\n    timestamp\n    createdAt\n    updatedAt\n  }\n}";
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
