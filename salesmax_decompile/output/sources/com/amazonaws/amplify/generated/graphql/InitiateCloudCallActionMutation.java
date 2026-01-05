package com.amazonaws.amplify.generated.graphql;

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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;

/* loaded from: classes8.dex */
public final class InitiateCloudCallActionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation InitiateCloudCallAction($accountId: ID!, $providerName: String, $action: String, $payload: AWSJSON) {\n  initiateCloudCallAction(accountId: $accountId, providerName: $providerName, action: $action, payload: $payload)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.InitiateCloudCallActionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "InitiateCloudCallAction";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation InitiateCloudCallAction($accountId: ID!, $providerName: String, $action: String, $payload: AWSJSON) {\n  initiateCloudCallAction(accountId: $accountId, providerName: $providerName, action: $action, payload: $payload)\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private String action;
        private String payload;
        private String providerName;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder action(String str) {
            this.action = str;
            return this;
        }

        public InitiateCloudCallActionMutation build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new InitiateCloudCallActionMutation(this.accountId, this.providerName, this.action, this.payload);
        }

        public Builder payload(String str) {
            this.payload = str;
            return this;
        }

        public Builder providerName(String str) {
            this.providerName = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("initiateCloudCallAction", "initiateCloudCallAction", new UnmodifiableMapBuilder(4).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("payload", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "payload").build()).put("action", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "action").build()).put("providerName", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "providerName").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String initiateCloudCallAction;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.initiateCloudCallAction = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.initiateCloudCallAction;
            String str2 = ((Data) obj).initiateCloudCallAction;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.initiateCloudCallAction;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String initiateCloudCallAction() {
            return this.initiateCloudCallAction;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.InitiateCloudCallActionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.initiateCloudCallAction);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{initiateCloudCallAction=" + this.initiateCloudCallAction + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final String action;
        private final String payload;
        private final String providerName;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2, String str3, String str4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.providerName = str2;
            this.action = str3;
            this.payload = str4;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("providerName", str2);
            linkedHashMap.put("action", str3);
            linkedHashMap.put("payload", str4);
        }

        public String accountId() {
            return this.accountId;
        }

        public String action() {
            return this.action;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.InitiateCloudCallActionMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("providerName", Variables.this.providerName);
                    inputFieldWriter.writeString("action", Variables.this.action);
                    inputFieldWriter.writeString("payload", Variables.this.payload);
                }
            };
        }

        public String payload() {
            return this.payload;
        }

        public String providerName() {
            return this.providerName;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public InitiateCloudCallActionMutation(String str, String str2, String str3, String str4) {
        Utils.checkNotNull(str, "accountId == null");
        this.variables = new Variables(str, str2, str3, str4);
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
        return "24b32f65860800e840c736f3ba7d8b9a83bf04f4aeb83e08a8c95a8f4101d169";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation InitiateCloudCallAction($accountId: ID!, $providerName: String, $action: String, $payload: AWSJSON) {\n  initiateCloudCallAction(accountId: $accountId, providerName: $providerName, action: $action, payload: $payload)\n}";
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
