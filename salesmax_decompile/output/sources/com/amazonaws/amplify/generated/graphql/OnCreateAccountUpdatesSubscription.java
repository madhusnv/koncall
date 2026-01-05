package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.ActionType;
import type.CustomType;
import type.EntityType;

/* loaded from: classes4.dex */
public final class OnCreateAccountUpdatesSubscription implements Subscription<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnCreateAccountUpdates($accountId: ID!) {\n  onCreateAccountUpdates(accountId: $accountId) {\n    __typename\n    id\n    accountId\n    userId\n    entityType\n    entityId\n    actionType\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateAccountUpdatesSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnCreateAccountUpdates";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnCreateAccountUpdates($accountId: ID!) {\n  onCreateAccountUpdates(accountId: $accountId) {\n    __typename\n    id\n    accountId\n    userId\n    entityType\n    entityId\n    actionType\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public OnCreateAccountUpdatesSubscription build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new OnCreateAccountUpdatesSubscription(this.accountId);
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onCreateAccountUpdates", "onCreateAccountUpdates", new UnmodifiableMapBuilder(1).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnCreateAccountUpdates onCreateAccountUpdates;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnCreateAccountUpdates.Mapper onCreateAccountUpdatesFieldMapper = new OnCreateAccountUpdates.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnCreateAccountUpdates) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnCreateAccountUpdates>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateAccountUpdatesSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnCreateAccountUpdates read(ResponseReader responseReader2) {
                        return Mapper.this.onCreateAccountUpdatesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnCreateAccountUpdates onCreateAccountUpdates) {
            this.onCreateAccountUpdates = onCreateAccountUpdates;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnCreateAccountUpdates onCreateAccountUpdates = this.onCreateAccountUpdates;
            OnCreateAccountUpdates onCreateAccountUpdates2 = ((Data) obj).onCreateAccountUpdates;
            return onCreateAccountUpdates == null ? onCreateAccountUpdates2 == null : onCreateAccountUpdates.equals(onCreateAccountUpdates2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnCreateAccountUpdates onCreateAccountUpdates = this.onCreateAccountUpdates;
                this.$hashCode = (onCreateAccountUpdates == null ? 0 : onCreateAccountUpdates.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateAccountUpdatesSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnCreateAccountUpdates onCreateAccountUpdates = Data.this.onCreateAccountUpdates;
                    responseWriter.writeObject(responseField, onCreateAccountUpdates != null ? onCreateAccountUpdates.marshaller() : null);
                }
            };
        }

        public OnCreateAccountUpdates onCreateAccountUpdates() {
            return this.onCreateAccountUpdates;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onCreateAccountUpdates=" + this.onCreateAccountUpdates + "}";
            }
            return this.$toString;
        }
    }

    public static class OnCreateAccountUpdates {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final ActionType actionType;
        final String createdAt;
        final String entityId;
        final EntityType entityType;
        final String id;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<OnCreateAccountUpdates> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnCreateAccountUpdates map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnCreateAccountUpdates.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                EntityType entityTypeValueOf = string2 != null ? EntityType.valueOf(string2) : null;
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                return new OnCreateAccountUpdates(string, str, str2, str3, entityTypeValueOf, str4, string3 != null ? ActionType.valueOf(string3) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forString("entityType", "entityType", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, false, customType, Collections.emptyList()), ResponseField.forString("actionType", "actionType", null, false, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public OnCreateAccountUpdates(String str, String str2, String str3, String str4, EntityType entityType, String str5, ActionType actionType, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str4, "userId == null");
            this.entityType = (EntityType) Utils.checkNotNull(entityType, "entityType == null");
            this.entityId = (String) Utils.checkNotNull(str5, "entityId == null");
            this.actionType = (ActionType) Utils.checkNotNull(actionType, "actionType == null");
            this.createdAt = (String) Utils.checkNotNull(str6, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str7, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public ActionType actionType() {
            return this.actionType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String entityId() {
            return this.entityId;
        }

        public EntityType entityType() {
            return this.entityType;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnCreateAccountUpdates)) {
                return false;
            }
            OnCreateAccountUpdates onCreateAccountUpdates = (OnCreateAccountUpdates) obj;
            return this.__typename.equals(onCreateAccountUpdates.__typename) && this.id.equals(onCreateAccountUpdates.id) && this.accountId.equals(onCreateAccountUpdates.accountId) && this.userId.equals(onCreateAccountUpdates.userId) && this.entityType.equals(onCreateAccountUpdates.entityType) && this.entityId.equals(onCreateAccountUpdates.entityId) && this.actionType.equals(onCreateAccountUpdates.actionType) && this.createdAt.equals(onCreateAccountUpdates.createdAt) && this.updatedAt.equals(onCreateAccountUpdates.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                this.$hashCode = ((((((((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003) ^ this.entityType.hashCode()) * 1000003) ^ this.entityId.hashCode()) * 1000003) ^ this.actionType.hashCode()) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateAccountUpdatesSubscription.OnCreateAccountUpdates.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnCreateAccountUpdates.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnCreateAccountUpdates.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnCreateAccountUpdates.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnCreateAccountUpdates.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnCreateAccountUpdates.this.userId);
                    responseWriter.writeString(responseFieldArr[4], OnCreateAccountUpdates.this.entityType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], OnCreateAccountUpdates.this.entityId);
                    responseWriter.writeString(responseFieldArr[6], OnCreateAccountUpdates.this.actionType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], OnCreateAccountUpdates.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnCreateAccountUpdates.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OnCreateAccountUpdates{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", entityType=" + this.entityType + ", entityId=" + this.entityId + ", actionType=" + this.actionType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            linkedHashMap.put("accountId", str);
        }

        public String accountId() {
            return this.accountId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateAccountUpdatesSubscription.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public OnCreateAccountUpdatesSubscription(String str) {
        Utils.checkNotNull(str, "accountId == null");
        this.variables = new Variables(str);
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
        return "b1ba49f12c51785eb27c32b4c9a3b4bcba83ddf0930e4cb1745e396bfd14be41";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnCreateAccountUpdates($accountId: ID!) {\n  onCreateAccountUpdates(accountId: $accountId) {\n    __typename\n    id\n    accountId\n    userId\n    entityType\n    entityId\n    actionType\n    createdAt\n    updatedAt\n  }\n}";
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
