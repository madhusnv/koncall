package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import type.CustomType;

/* loaded from: classes4.dex */
public final class OnDeleteBotActionLogSubscription implements Subscription<Data, Data, Operation.Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnDeleteBotActionLog {\n  onDeleteBotActionLog {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    actionName\n    triggerMessageId\n    context\n    status\n    errorMessage\n    timestamp\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnDeleteBotActionLogSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnDeleteBotActionLog";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnDeleteBotActionLog {\n  onDeleteBotActionLog {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    actionName\n    triggerMessageId\n    context\n    status\n    errorMessage\n    timestamp\n    createdAt\n    updatedAt\n  }\n}";
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    public static final class Builder {
        public OnDeleteBotActionLogSubscription build() {
            return new OnDeleteBotActionLogSubscription();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onDeleteBotActionLog", "onDeleteBotActionLog", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnDeleteBotActionLog onDeleteBotActionLog;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnDeleteBotActionLog.Mapper onDeleteBotActionLogFieldMapper = new OnDeleteBotActionLog.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnDeleteBotActionLog) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnDeleteBotActionLog>() { // from class: com.amazonaws.amplify.generated.graphql.OnDeleteBotActionLogSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnDeleteBotActionLog read(ResponseReader responseReader2) {
                        return Mapper.this.onDeleteBotActionLogFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnDeleteBotActionLog onDeleteBotActionLog) {
            this.onDeleteBotActionLog = onDeleteBotActionLog;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnDeleteBotActionLog onDeleteBotActionLog = this.onDeleteBotActionLog;
            OnDeleteBotActionLog onDeleteBotActionLog2 = ((Data) obj).onDeleteBotActionLog;
            return onDeleteBotActionLog == null ? onDeleteBotActionLog2 == null : onDeleteBotActionLog.equals(onDeleteBotActionLog2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnDeleteBotActionLog onDeleteBotActionLog = this.onDeleteBotActionLog;
                this.$hashCode = (onDeleteBotActionLog == null ? 0 : onDeleteBotActionLog.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnDeleteBotActionLogSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnDeleteBotActionLog onDeleteBotActionLog = Data.this.onDeleteBotActionLog;
                    responseWriter.writeObject(responseField, onDeleteBotActionLog != null ? onDeleteBotActionLog.marshaller() : null);
                }
            };
        }

        public OnDeleteBotActionLog onDeleteBotActionLog() {
            return this.onDeleteBotActionLog;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onDeleteBotActionLog=" + this.onDeleteBotActionLog + "}";
            }
            return this.$toString;
        }
    }

    public static class OnDeleteBotActionLog {
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

        public static final class Mapper implements ResponseFieldMapper<OnDeleteBotActionLog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnDeleteBotActionLog map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnDeleteBotActionLog.$responseFields;
                return new OnDeleteBotActionLog(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("botId", "botId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("actionName", "actionName", null, true, Collections.emptyList()), ResponseField.forCustomType("triggerMessageId", "triggerMessageId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("context", "context", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("errorMessage", "errorMessage", null, true, Collections.emptyList()), ResponseField.forCustomType("timestamp", "timestamp", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public OnDeleteBotActionLog(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
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
            if (!(obj instanceof OnDeleteBotActionLog)) {
                return false;
            }
            OnDeleteBotActionLog onDeleteBotActionLog = (OnDeleteBotActionLog) obj;
            return this.__typename.equals(onDeleteBotActionLog.__typename) && this.id.equals(onDeleteBotActionLog.id) && this.accountId.equals(onDeleteBotActionLog.accountId) && this.botId.equals(onDeleteBotActionLog.botId) && this.actionId.equals(onDeleteBotActionLog.actionId) && ((str = this.actionName) != null ? str.equals(onDeleteBotActionLog.actionName) : onDeleteBotActionLog.actionName == null) && ((str2 = this.triggerMessageId) != null ? str2.equals(onDeleteBotActionLog.triggerMessageId) : onDeleteBotActionLog.triggerMessageId == null) && ((str3 = this.context) != null ? str3.equals(onDeleteBotActionLog.context) : onDeleteBotActionLog.context == null) && ((str4 = this.status) != null ? str4.equals(onDeleteBotActionLog.status) : onDeleteBotActionLog.status == null) && ((str5 = this.errorMessage) != null ? str5.equals(onDeleteBotActionLog.errorMessage) : onDeleteBotActionLog.errorMessage == null) && this.timestamp.equals(onDeleteBotActionLog.timestamp) && this.createdAt.equals(onDeleteBotActionLog.createdAt) && this.updatedAt.equals(onDeleteBotActionLog.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnDeleteBotActionLogSubscription.OnDeleteBotActionLog.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnDeleteBotActionLog.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnDeleteBotActionLog.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnDeleteBotActionLog.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnDeleteBotActionLog.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnDeleteBotActionLog.this.botId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], OnDeleteBotActionLog.this.actionId);
                    responseWriter.writeString(responseFieldArr[5], OnDeleteBotActionLog.this.actionName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], OnDeleteBotActionLog.this.triggerMessageId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], OnDeleteBotActionLog.this.context);
                    responseWriter.writeString(responseFieldArr[8], OnDeleteBotActionLog.this.status);
                    responseWriter.writeString(responseFieldArr[9], OnDeleteBotActionLog.this.errorMessage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], OnDeleteBotActionLog.this.timestamp);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], OnDeleteBotActionLog.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], OnDeleteBotActionLog.this.updatedAt);
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
                this.$toString = "OnDeleteBotActionLog{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", botId=" + this.botId + ", actionId=" + this.actionId + ", actionName=" + this.actionName + ", triggerMessageId=" + this.triggerMessageId + ", context=" + this.context + ", status=" + this.status + ", errorMessage=" + this.errorMessage + ", timestamp=" + this.timestamp + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.Operation
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String operationId() {
        return "177d6775acc6daed1dc30cc9112cff7cee52dae179935ef110192f07fa74b664";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnDeleteBotActionLog {\n  onDeleteBotActionLog {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    actionName\n    triggerMessageId\n    context\n    status\n    errorMessage\n    timestamp\n    createdAt\n    updatedAt\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Operation.Variables variables() {
        return this.variables;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }
}
