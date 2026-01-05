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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CreateWebInitiatedCallInput;
import type.CustomType;
import type.ModelWebInitiatedCallConditionInput;

/* loaded from: classes6.dex */
public final class CreateWebInitiatedCallMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateWebInitiatedCall($input: CreateWebInitiatedCallInput!, $condition: ModelWebInitiatedCallConditionInput) {\n  createWebInitiatedCall(input: $input, condition: $condition) {\n    __typename\n    accountId\n    userId\n    callId\n    status\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateWebInitiatedCallMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateWebInitiatedCall";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateWebInitiatedCall($input: CreateWebInitiatedCallInput!, $condition: ModelWebInitiatedCallConditionInput) {\n  createWebInitiatedCall(input: $input, condition: $condition) {\n    __typename\n    accountId\n    userId\n    callId\n    status\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWebInitiatedCallConditionInput condition;
        private CreateWebInitiatedCallInput input;

        public CreateWebInitiatedCallMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateWebInitiatedCallMutation(this.input, this.condition);
        }

        public Builder condition(ModelWebInitiatedCallConditionInput modelWebInitiatedCallConditionInput) {
            this.condition = modelWebInitiatedCallConditionInput;
            return this;
        }

        public Builder input(CreateWebInitiatedCallInput createWebInitiatedCallInput) {
            this.input = createWebInitiatedCallInput;
            return this;
        }
    }

    public static class CreateWebInitiatedCall {
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

        public static final class Mapper implements ResponseFieldMapper<CreateWebInitiatedCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateWebInitiatedCall map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateWebInitiatedCall.$responseFields;
                return new CreateWebInitiatedCall(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("callId", "callId", null, false, customType, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public CreateWebInitiatedCall(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
            if (!(obj instanceof CreateWebInitiatedCall)) {
                return false;
            }
            CreateWebInitiatedCall createWebInitiatedCall = (CreateWebInitiatedCall) obj;
            return this.__typename.equals(createWebInitiatedCall.__typename) && this.accountId.equals(createWebInitiatedCall.accountId) && this.userId.equals(createWebInitiatedCall.userId) && this.callId.equals(createWebInitiatedCall.callId) && ((str = this.status) != null ? str.equals(createWebInitiatedCall.status) : createWebInitiatedCall.status == null) && this.createdAt.equals(createWebInitiatedCall.createdAt) && this.updatedAt.equals(createWebInitiatedCall.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateWebInitiatedCallMutation.CreateWebInitiatedCall.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateWebInitiatedCall.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateWebInitiatedCall.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateWebInitiatedCall.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateWebInitiatedCall.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateWebInitiatedCall.this.callId);
                    responseWriter.writeString(responseFieldArr[4], CreateWebInitiatedCall.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], CreateWebInitiatedCall.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], CreateWebInitiatedCall.this.updatedAt);
                }
            };
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateWebInitiatedCall{__typename=" + this.__typename + ", accountId=" + this.accountId + ", userId=" + this.userId + ", callId=" + this.callId + ", status=" + this.status + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createWebInitiatedCall", "createWebInitiatedCall", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateWebInitiatedCall createWebInitiatedCall;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateWebInitiatedCall.Mapper createWebInitiatedCallFieldMapper = new CreateWebInitiatedCall.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateWebInitiatedCall) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateWebInitiatedCall>() { // from class: com.amazonaws.amplify.generated.graphql.CreateWebInitiatedCallMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateWebInitiatedCall read(ResponseReader responseReader2) {
                        return Mapper.this.createWebInitiatedCallFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateWebInitiatedCall createWebInitiatedCall) {
            this.createWebInitiatedCall = createWebInitiatedCall;
        }

        public CreateWebInitiatedCall createWebInitiatedCall() {
            return this.createWebInitiatedCall;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateWebInitiatedCall createWebInitiatedCall = this.createWebInitiatedCall;
            CreateWebInitiatedCall createWebInitiatedCall2 = ((Data) obj).createWebInitiatedCall;
            return createWebInitiatedCall == null ? createWebInitiatedCall2 == null : createWebInitiatedCall.equals(createWebInitiatedCall2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateWebInitiatedCall createWebInitiatedCall = this.createWebInitiatedCall;
                this.$hashCode = (createWebInitiatedCall == null ? 0 : createWebInitiatedCall.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateWebInitiatedCallMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateWebInitiatedCall createWebInitiatedCall = Data.this.createWebInitiatedCall;
                    responseWriter.writeObject(responseField, createWebInitiatedCall != null ? createWebInitiatedCall.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createWebInitiatedCall=" + this.createWebInitiatedCall + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelWebInitiatedCallConditionInput condition;
        private final CreateWebInitiatedCallInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateWebInitiatedCallInput createWebInitiatedCallInput, ModelWebInitiatedCallConditionInput modelWebInitiatedCallConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createWebInitiatedCallInput;
            this.condition = modelWebInitiatedCallConditionInput;
            linkedHashMap.put("input", createWebInitiatedCallInput);
            linkedHashMap.put("condition", modelWebInitiatedCallConditionInput);
        }

        public ModelWebInitiatedCallConditionInput condition() {
            return this.condition;
        }

        public CreateWebInitiatedCallInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateWebInitiatedCallMutation.Variables.1
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

    public CreateWebInitiatedCallMutation(CreateWebInitiatedCallInput createWebInitiatedCallInput, ModelWebInitiatedCallConditionInput modelWebInitiatedCallConditionInput) {
        Utils.checkNotNull(createWebInitiatedCallInput, "input == null");
        this.variables = new Variables(createWebInitiatedCallInput, modelWebInitiatedCallConditionInput);
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
        return "21c29b0419a3d51e1f40035f606d9a95c49163f74fc480f5aecb000427c4f202";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateWebInitiatedCall($input: CreateWebInitiatedCallInput!, $condition: ModelWebInitiatedCallConditionInput) {\n  createWebInitiatedCall(input: $input, condition: $condition) {\n    __typename\n    accountId\n    userId\n    callId\n    status\n    createdAt\n    updatedAt\n  }\n}";
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
