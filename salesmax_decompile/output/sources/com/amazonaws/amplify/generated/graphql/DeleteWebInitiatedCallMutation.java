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
import type.CustomType;
import type.DeleteWebInitiatedCallInput;
import type.ModelWebInitiatedCallConditionInput;

/* loaded from: classes7.dex */
public final class DeleteWebInitiatedCallMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteWebInitiatedCall($input: DeleteWebInitiatedCallInput!, $condition: ModelWebInitiatedCallConditionInput) {\n  deleteWebInitiatedCall(input: $input, condition: $condition) {\n    __typename\n    accountId\n    userId\n    callId\n    status\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWebInitiatedCallMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteWebInitiatedCall";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteWebInitiatedCall($input: DeleteWebInitiatedCallInput!, $condition: ModelWebInitiatedCallConditionInput) {\n  deleteWebInitiatedCall(input: $input, condition: $condition) {\n    __typename\n    accountId\n    userId\n    callId\n    status\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWebInitiatedCallConditionInput condition;
        private DeleteWebInitiatedCallInput input;

        public DeleteWebInitiatedCallMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteWebInitiatedCallMutation(this.input, this.condition);
        }

        public Builder condition(ModelWebInitiatedCallConditionInput modelWebInitiatedCallConditionInput) {
            this.condition = modelWebInitiatedCallConditionInput;
            return this;
        }

        public Builder input(DeleteWebInitiatedCallInput deleteWebInitiatedCallInput) {
            this.input = deleteWebInitiatedCallInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteWebInitiatedCall", "deleteWebInitiatedCall", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteWebInitiatedCall deleteWebInitiatedCall;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteWebInitiatedCall.Mapper deleteWebInitiatedCallFieldMapper = new DeleteWebInitiatedCall.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteWebInitiatedCall) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteWebInitiatedCall>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWebInitiatedCallMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteWebInitiatedCall read(ResponseReader responseReader2) {
                        return Mapper.this.deleteWebInitiatedCallFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteWebInitiatedCall deleteWebInitiatedCall) {
            this.deleteWebInitiatedCall = deleteWebInitiatedCall;
        }

        public DeleteWebInitiatedCall deleteWebInitiatedCall() {
            return this.deleteWebInitiatedCall;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteWebInitiatedCall deleteWebInitiatedCall = this.deleteWebInitiatedCall;
            DeleteWebInitiatedCall deleteWebInitiatedCall2 = ((Data) obj).deleteWebInitiatedCall;
            return deleteWebInitiatedCall == null ? deleteWebInitiatedCall2 == null : deleteWebInitiatedCall.equals(deleteWebInitiatedCall2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteWebInitiatedCall deleteWebInitiatedCall = this.deleteWebInitiatedCall;
                this.$hashCode = (deleteWebInitiatedCall == null ? 0 : deleteWebInitiatedCall.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWebInitiatedCallMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteWebInitiatedCall deleteWebInitiatedCall = Data.this.deleteWebInitiatedCall;
                    responseWriter.writeObject(responseField, deleteWebInitiatedCall != null ? deleteWebInitiatedCall.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteWebInitiatedCall=" + this.deleteWebInitiatedCall + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteWebInitiatedCall {
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

        public static final class Mapper implements ResponseFieldMapper<DeleteWebInitiatedCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteWebInitiatedCall map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteWebInitiatedCall.$responseFields;
                return new DeleteWebInitiatedCall(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("callId", "callId", null, false, customType, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public DeleteWebInitiatedCall(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
            if (!(obj instanceof DeleteWebInitiatedCall)) {
                return false;
            }
            DeleteWebInitiatedCall deleteWebInitiatedCall = (DeleteWebInitiatedCall) obj;
            return this.__typename.equals(deleteWebInitiatedCall.__typename) && this.accountId.equals(deleteWebInitiatedCall.accountId) && this.userId.equals(deleteWebInitiatedCall.userId) && this.callId.equals(deleteWebInitiatedCall.callId) && ((str = this.status) != null ? str.equals(deleteWebInitiatedCall.status) : deleteWebInitiatedCall.status == null) && this.createdAt.equals(deleteWebInitiatedCall.createdAt) && this.updatedAt.equals(deleteWebInitiatedCall.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWebInitiatedCallMutation.DeleteWebInitiatedCall.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteWebInitiatedCall.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteWebInitiatedCall.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteWebInitiatedCall.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteWebInitiatedCall.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteWebInitiatedCall.this.callId);
                    responseWriter.writeString(responseFieldArr[4], DeleteWebInitiatedCall.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteWebInitiatedCall.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], DeleteWebInitiatedCall.this.updatedAt);
                }
            };
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteWebInitiatedCall{__typename=" + this.__typename + ", accountId=" + this.accountId + ", userId=" + this.userId + ", callId=" + this.callId + ", status=" + this.status + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        private final ModelWebInitiatedCallConditionInput condition;
        private final DeleteWebInitiatedCallInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteWebInitiatedCallInput deleteWebInitiatedCallInput, ModelWebInitiatedCallConditionInput modelWebInitiatedCallConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteWebInitiatedCallInput;
            this.condition = modelWebInitiatedCallConditionInput;
            linkedHashMap.put("input", deleteWebInitiatedCallInput);
            linkedHashMap.put("condition", modelWebInitiatedCallConditionInput);
        }

        public ModelWebInitiatedCallConditionInput condition() {
            return this.condition;
        }

        public DeleteWebInitiatedCallInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWebInitiatedCallMutation.Variables.1
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

    public DeleteWebInitiatedCallMutation(DeleteWebInitiatedCallInput deleteWebInitiatedCallInput, ModelWebInitiatedCallConditionInput modelWebInitiatedCallConditionInput) {
        Utils.checkNotNull(deleteWebInitiatedCallInput, "input == null");
        this.variables = new Variables(deleteWebInitiatedCallInput, modelWebInitiatedCallConditionInput);
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
        return "abaa04e1706d44ec88153a5a81dbb2afc1d85b8d2ec2cfb3fa38f1c3c2071801";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteWebInitiatedCall($input: DeleteWebInitiatedCallInput!, $condition: ModelWebInitiatedCallConditionInput) {\n  deleteWebInitiatedCall(input: $input, condition: $condition) {\n    __typename\n    accountId\n    userId\n    callId\n    status\n    createdAt\n    updatedAt\n  }\n}";
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
