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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;

/* loaded from: classes4.dex */
public final class OnUpdateWebInitiatedCallSubscription implements Subscription<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnUpdateWebInitiatedCall($accountId: ID!, $userId: ID!) {\n  onUpdateWebInitiatedCall(accountId: $accountId, userId: $userId) {\n    __typename\n    accountId\n    userId\n    callId\n    status\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWebInitiatedCallSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnUpdateWebInitiatedCall";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnUpdateWebInitiatedCall($accountId: ID!, $userId: ID!) {\n  onUpdateWebInitiatedCall(accountId: $accountId, userId: $userId) {\n    __typename\n    accountId\n    userId\n    callId\n    status\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private String userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public OnUpdateWebInitiatedCallSubscription build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            return new OnUpdateWebInitiatedCallSubscription(this.accountId, this.userId);
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onUpdateWebInitiatedCall", "onUpdateWebInitiatedCall", new UnmodifiableMapBuilder(2).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnUpdateWebInitiatedCall onUpdateWebInitiatedCall;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnUpdateWebInitiatedCall.Mapper onUpdateWebInitiatedCallFieldMapper = new OnUpdateWebInitiatedCall.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnUpdateWebInitiatedCall) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnUpdateWebInitiatedCall>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWebInitiatedCallSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnUpdateWebInitiatedCall read(ResponseReader responseReader2) {
                        return Mapper.this.onUpdateWebInitiatedCallFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnUpdateWebInitiatedCall onUpdateWebInitiatedCall) {
            this.onUpdateWebInitiatedCall = onUpdateWebInitiatedCall;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnUpdateWebInitiatedCall onUpdateWebInitiatedCall = this.onUpdateWebInitiatedCall;
            OnUpdateWebInitiatedCall onUpdateWebInitiatedCall2 = ((Data) obj).onUpdateWebInitiatedCall;
            return onUpdateWebInitiatedCall == null ? onUpdateWebInitiatedCall2 == null : onUpdateWebInitiatedCall.equals(onUpdateWebInitiatedCall2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnUpdateWebInitiatedCall onUpdateWebInitiatedCall = this.onUpdateWebInitiatedCall;
                this.$hashCode = (onUpdateWebInitiatedCall == null ? 0 : onUpdateWebInitiatedCall.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWebInitiatedCallSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnUpdateWebInitiatedCall onUpdateWebInitiatedCall = Data.this.onUpdateWebInitiatedCall;
                    responseWriter.writeObject(responseField, onUpdateWebInitiatedCall != null ? onUpdateWebInitiatedCall.marshaller() : null);
                }
            };
        }

        public OnUpdateWebInitiatedCall onUpdateWebInitiatedCall() {
            return this.onUpdateWebInitiatedCall;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onUpdateWebInitiatedCall=" + this.onUpdateWebInitiatedCall + "}";
            }
            return this.$toString;
        }
    }

    public static class OnUpdateWebInitiatedCall {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String callId;
        final String createdAt;
        final String status;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<OnUpdateWebInitiatedCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnUpdateWebInitiatedCall map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnUpdateWebInitiatedCall.$responseFields;
                return new OnUpdateWebInitiatedCall(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("callId", "callId", null, false, customType, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public OnUpdateWebInitiatedCall(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str3, "userId == null");
            this.callId = (String) Utils.checkNotNull(str4, "callId == null");
            this.status = str5;
            this.createdAt = (String) Utils.checkNotNull(str6, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str7, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String callId() {
            return this.callId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnUpdateWebInitiatedCall)) {
                return false;
            }
            OnUpdateWebInitiatedCall onUpdateWebInitiatedCall = (OnUpdateWebInitiatedCall) obj;
            return this.__typename.equals(onUpdateWebInitiatedCall.__typename) && this.accountId.equals(onUpdateWebInitiatedCall.accountId) && this.userId.equals(onUpdateWebInitiatedCall.userId) && this.callId.equals(onUpdateWebInitiatedCall.callId) && ((str = this.status) != null ? str.equals(onUpdateWebInitiatedCall.status) : onUpdateWebInitiatedCall.status == null) && this.createdAt.equals(onUpdateWebInitiatedCall.createdAt) && this.updatedAt.equals(onUpdateWebInitiatedCall.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003) ^ this.callId.hashCode()) * 1000003;
                String str = this.status;
                this.$hashCode = ((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWebInitiatedCallSubscription.OnUpdateWebInitiatedCall.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnUpdateWebInitiatedCall.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnUpdateWebInitiatedCall.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnUpdateWebInitiatedCall.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnUpdateWebInitiatedCall.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnUpdateWebInitiatedCall.this.callId);
                    responseWriter.writeString(responseFieldArr[4], OnUpdateWebInitiatedCall.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], OnUpdateWebInitiatedCall.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], OnUpdateWebInitiatedCall.this.updatedAt);
                }
            };
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OnUpdateWebInitiatedCall{__typename=" + this.__typename + ", accountId=" + this.accountId + ", userId=" + this.userId + ", callId=" + this.callId + ", status=" + this.status + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        private final String userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.userId = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("userId", str2);
        }

        public String accountId() {
            return this.accountId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWebInitiatedCallSubscription.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("userId", Variables.this.userId);
                }
            };
        }

        public String userId() {
            return this.userId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public OnUpdateWebInitiatedCallSubscription(String str, String str2) {
        Utils.checkNotNull(str, "accountId == null");
        Utils.checkNotNull(str2, "userId == null");
        this.variables = new Variables(str, str2);
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
        return "f30a8b5a3643945075bdc9df9a8b271de87e0719ffaee84f0bee7e961354e8f2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnUpdateWebInitiatedCall($accountId: ID!, $userId: ID!) {\n  onUpdateWebInitiatedCall(accountId: $accountId, userId: $userId) {\n    __typename\n    accountId\n    userId\n    callId\n    status\n    createdAt\n    updatedAt\n  }\n}";
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
