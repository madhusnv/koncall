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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;

/* loaded from: classes4.dex */
public final class WhatsappTemplateActionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation WhatsappTemplateAction($accountId: ID, $userId: ID, $businessAccountId: String, $actionType: String, $payload: AWSJSON) {\n  whatsappTemplateAction(accountId: $accountId, userId: $userId, businessAccountId: $businessAccountId, actionType: $actionType, payload: $payload)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.WhatsappTemplateActionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "WhatsappTemplateAction";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation WhatsappTemplateAction($accountId: ID, $userId: ID, $businessAccountId: String, $actionType: String, $payload: AWSJSON) {\n  whatsappTemplateAction(accountId: $accountId, userId: $userId, businessAccountId: $businessAccountId, actionType: $actionType, payload: $payload)\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private String actionType;
        private String businessAccountId;
        private String payload;
        private String userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder actionType(String str) {
            this.actionType = str;
            return this;
        }

        public WhatsappTemplateActionMutation build() {
            return new WhatsappTemplateActionMutation(this.accountId, this.userId, this.businessAccountId, this.actionType, this.payload);
        }

        public Builder businessAccountId(String str) {
            this.businessAccountId = str;
            return this;
        }

        public Builder payload(String str) {
            this.payload = str;
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("whatsappTemplateAction", "whatsappTemplateAction", new UnmodifiableMapBuilder(5).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("actionType", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "actionType").build()).put("payload", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "payload").build()).put("businessAccountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "businessAccountId").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String whatsappTemplateAction;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.whatsappTemplateAction = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.whatsappTemplateAction;
            String str2 = ((Data) obj).whatsappTemplateAction;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.whatsappTemplateAction;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.WhatsappTemplateActionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.whatsappTemplateAction);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{whatsappTemplateAction=" + this.whatsappTemplateAction + "}";
            }
            return this.$toString;
        }

        public String whatsappTemplateAction() {
            return this.whatsappTemplateAction;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final String actionType;
        private final String businessAccountId;
        private final String payload;
        private final String userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2, String str3, String str4, String str5) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.userId = str2;
            this.businessAccountId = str3;
            this.actionType = str4;
            this.payload = str5;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("userId", str2);
            linkedHashMap.put("businessAccountId", str3);
            linkedHashMap.put("actionType", str4);
            linkedHashMap.put("payload", str5);
        }

        public String accountId() {
            return this.accountId;
        }

        public String actionType() {
            return this.actionType;
        }

        public String businessAccountId() {
            return this.businessAccountId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.WhatsappTemplateActionMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("userId", Variables.this.userId);
                    inputFieldWriter.writeString("businessAccountId", Variables.this.businessAccountId);
                    inputFieldWriter.writeString("actionType", Variables.this.actionType);
                    inputFieldWriter.writeString("payload", Variables.this.payload);
                }
            };
        }

        public String payload() {
            return this.payload;
        }

        public String userId() {
            return this.userId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public WhatsappTemplateActionMutation(String str, String str2, String str3, String str4, String str5) {
        this.variables = new Variables(str, str2, str3, str4, str5);
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
        return "ad5de95d61cf0de8e5ffc9bf787856a5cece4aae277af773ded6546769d3cf74";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation WhatsappTemplateAction($accountId: ID, $userId: ID, $businessAccountId: String, $actionType: String, $payload: AWSJSON) {\n  whatsappTemplateAction(accountId: $accountId, userId: $userId, businessAccountId: $businessAccountId, actionType: $actionType, payload: $payload)\n}";
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
