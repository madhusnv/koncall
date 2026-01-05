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
public final class OnUpdateBotActionMappingSubscription implements Subscription<Data, Data, Operation.Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnUpdateBotActionMapping {\n  onUpdateBotActionMapping {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    context\n    isPaused\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateBotActionMappingSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnUpdateBotActionMapping";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnUpdateBotActionMapping {\n  onUpdateBotActionMapping {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    context\n    isPaused\n    createdAt\n    updatedAt\n  }\n}";
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    public static final class Builder {
        public OnUpdateBotActionMappingSubscription build() {
            return new OnUpdateBotActionMappingSubscription();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onUpdateBotActionMapping", "onUpdateBotActionMapping", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnUpdateBotActionMapping onUpdateBotActionMapping;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnUpdateBotActionMapping.Mapper onUpdateBotActionMappingFieldMapper = new OnUpdateBotActionMapping.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnUpdateBotActionMapping) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnUpdateBotActionMapping>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateBotActionMappingSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnUpdateBotActionMapping read(ResponseReader responseReader2) {
                        return Mapper.this.onUpdateBotActionMappingFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnUpdateBotActionMapping onUpdateBotActionMapping) {
            this.onUpdateBotActionMapping = onUpdateBotActionMapping;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnUpdateBotActionMapping onUpdateBotActionMapping = this.onUpdateBotActionMapping;
            OnUpdateBotActionMapping onUpdateBotActionMapping2 = ((Data) obj).onUpdateBotActionMapping;
            return onUpdateBotActionMapping == null ? onUpdateBotActionMapping2 == null : onUpdateBotActionMapping.equals(onUpdateBotActionMapping2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnUpdateBotActionMapping onUpdateBotActionMapping = this.onUpdateBotActionMapping;
                this.$hashCode = (onUpdateBotActionMapping == null ? 0 : onUpdateBotActionMapping.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateBotActionMappingSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnUpdateBotActionMapping onUpdateBotActionMapping = Data.this.onUpdateBotActionMapping;
                    responseWriter.writeObject(responseField, onUpdateBotActionMapping != null ? onUpdateBotActionMapping.marshaller() : null);
                }
            };
        }

        public OnUpdateBotActionMapping onUpdateBotActionMapping() {
            return this.onUpdateBotActionMapping;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onUpdateBotActionMapping=" + this.onUpdateBotActionMapping + "}";
            }
            return this.$toString;
        }
    }

    public static class OnUpdateBotActionMapping {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String actionId;
        final String botId;
        final String context;
        final String createdAt;
        final String id;
        final Boolean isPaused;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<OnUpdateBotActionMapping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnUpdateBotActionMapping map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnUpdateBotActionMapping.$responseFields;
                return new OnUpdateBotActionMapping(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readBoolean(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("botId", "botId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("context", "context", null, true, Collections.emptyList()), ResponseField.forBoolean("isPaused", "isPaused", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public OnUpdateBotActionMapping(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.botId = (String) Utils.checkNotNull(str4, "botId == null");
            this.actionId = (String) Utils.checkNotNull(str5, "actionId == null");
            this.context = str6;
            this.isPaused = bool;
            this.createdAt = str7;
            this.updatedAt = str8;
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
            Boolean bool;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnUpdateBotActionMapping)) {
                return false;
            }
            OnUpdateBotActionMapping onUpdateBotActionMapping = (OnUpdateBotActionMapping) obj;
            if (this.__typename.equals(onUpdateBotActionMapping.__typename) && this.id.equals(onUpdateBotActionMapping.id) && this.accountId.equals(onUpdateBotActionMapping.accountId) && this.botId.equals(onUpdateBotActionMapping.botId) && this.actionId.equals(onUpdateBotActionMapping.actionId) && ((str = this.context) != null ? str.equals(onUpdateBotActionMapping.context) : onUpdateBotActionMapping.context == null) && ((bool = this.isPaused) != null ? bool.equals(onUpdateBotActionMapping.isPaused) : onUpdateBotActionMapping.isPaused == null) && ((str2 = this.createdAt) != null ? str2.equals(onUpdateBotActionMapping.createdAt) : onUpdateBotActionMapping.createdAt == null)) {
                String str3 = this.updatedAt;
                String str4 = onUpdateBotActionMapping.updatedAt;
                if (str3 == null) {
                    if (str4 == null) {
                        return true;
                    }
                } else if (str3.equals(str4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.botId.hashCode()) * 1000003) ^ this.actionId.hashCode()) * 1000003;
                String str = this.context;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Boolean bool = this.isPaused;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str2 = this.createdAt;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updatedAt;
                this.$hashCode = iHashCode4 ^ (str3 != null ? str3.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isPaused() {
            return this.isPaused;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateBotActionMappingSubscription.OnUpdateBotActionMapping.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnUpdateBotActionMapping.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnUpdateBotActionMapping.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnUpdateBotActionMapping.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnUpdateBotActionMapping.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnUpdateBotActionMapping.this.botId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], OnUpdateBotActionMapping.this.actionId);
                    responseWriter.writeString(responseFieldArr[5], OnUpdateBotActionMapping.this.context);
                    responseWriter.writeBoolean(responseFieldArr[6], OnUpdateBotActionMapping.this.isPaused);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], OnUpdateBotActionMapping.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnUpdateBotActionMapping.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OnUpdateBotActionMapping{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", botId=" + this.botId + ", actionId=" + this.actionId + ", context=" + this.context + ", isPaused=" + this.isPaused + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
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
        return "5e34ca57e5dc7141577f3deece2100b22defcc970c0c9f61c383bfb210c65f8b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnUpdateBotActionMapping {\n  onUpdateBotActionMapping {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    context\n    isPaused\n    createdAt\n    updatedAt\n  }\n}";
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
