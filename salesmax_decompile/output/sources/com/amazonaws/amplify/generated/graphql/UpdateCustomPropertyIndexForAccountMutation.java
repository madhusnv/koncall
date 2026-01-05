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
import type.ModelCustomPropertyIndexForAccountConditionInput;
import type.UpdateCustomPropertyIndexForAccountInput;

/* loaded from: classes4.dex */
public final class UpdateCustomPropertyIndexForAccountMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateCustomPropertyIndexForAccount($input: UpdateCustomPropertyIndexForAccountInput!, $condition: ModelCustomPropertyIndexForAccountConditionInput) {\n  updateCustomPropertyIndexForAccount(input: $input, condition: $condition) {\n    __typename\n    accountId\n    textIndex\n    numIndex\n    boolIndex\n    textIndexUser\n    numIndexUser\n    boolIndexUser\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyIndexForAccountMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateCustomPropertyIndexForAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateCustomPropertyIndexForAccount($input: UpdateCustomPropertyIndexForAccountInput!, $condition: ModelCustomPropertyIndexForAccountConditionInput) {\n  updateCustomPropertyIndexForAccount(input: $input, condition: $condition) {\n    __typename\n    accountId\n    textIndex\n    numIndex\n    boolIndex\n    textIndexUser\n    numIndexUser\n    boolIndexUser\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelCustomPropertyIndexForAccountConditionInput condition;
        private UpdateCustomPropertyIndexForAccountInput input;

        public UpdateCustomPropertyIndexForAccountMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateCustomPropertyIndexForAccountMutation(this.input, this.condition);
        }

        public Builder condition(ModelCustomPropertyIndexForAccountConditionInput modelCustomPropertyIndexForAccountConditionInput) {
            this.condition = modelCustomPropertyIndexForAccountConditionInput;
            return this;
        }

        public Builder input(UpdateCustomPropertyIndexForAccountInput updateCustomPropertyIndexForAccountInput) {
            this.input = updateCustomPropertyIndexForAccountInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateCustomPropertyIndexForAccount", "updateCustomPropertyIndexForAccount", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateCustomPropertyIndexForAccount updateCustomPropertyIndexForAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateCustomPropertyIndexForAccount.Mapper updateCustomPropertyIndexForAccountFieldMapper = new UpdateCustomPropertyIndexForAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateCustomPropertyIndexForAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateCustomPropertyIndexForAccount>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyIndexForAccountMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateCustomPropertyIndexForAccount read(ResponseReader responseReader2) {
                        return Mapper.this.updateCustomPropertyIndexForAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateCustomPropertyIndexForAccount updateCustomPropertyIndexForAccount) {
            this.updateCustomPropertyIndexForAccount = updateCustomPropertyIndexForAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateCustomPropertyIndexForAccount updateCustomPropertyIndexForAccount = this.updateCustomPropertyIndexForAccount;
            UpdateCustomPropertyIndexForAccount updateCustomPropertyIndexForAccount2 = ((Data) obj).updateCustomPropertyIndexForAccount;
            return updateCustomPropertyIndexForAccount == null ? updateCustomPropertyIndexForAccount2 == null : updateCustomPropertyIndexForAccount.equals(updateCustomPropertyIndexForAccount2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateCustomPropertyIndexForAccount updateCustomPropertyIndexForAccount = this.updateCustomPropertyIndexForAccount;
                this.$hashCode = (updateCustomPropertyIndexForAccount == null ? 0 : updateCustomPropertyIndexForAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyIndexForAccountMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateCustomPropertyIndexForAccount updateCustomPropertyIndexForAccount = Data.this.updateCustomPropertyIndexForAccount;
                    responseWriter.writeObject(responseField, updateCustomPropertyIndexForAccount != null ? updateCustomPropertyIndexForAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateCustomPropertyIndexForAccount=" + this.updateCustomPropertyIndexForAccount + "}";
            }
            return this.$toString;
        }

        public UpdateCustomPropertyIndexForAccount updateCustomPropertyIndexForAccount() {
            return this.updateCustomPropertyIndexForAccount;
        }
    }

    public static class UpdateCustomPropertyIndexForAccount {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Integer boolIndex;
        final Integer boolIndexUser;
        final String createdAt;
        final Integer numIndex;
        final Integer numIndexUser;
        final Integer textIndex;
        final Integer textIndexUser;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateCustomPropertyIndexForAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateCustomPropertyIndexForAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateCustomPropertyIndexForAccount.$responseFields;
                return new UpdateCustomPropertyIndexForAccount(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readInt(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]), responseReader.readInt(responseFieldArr[4]), responseReader.readInt(responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, CustomType.ID, Collections.emptyList()), ResponseField.forInt("textIndex", "textIndex", null, true, Collections.emptyList()), ResponseField.forInt("numIndex", "numIndex", null, true, Collections.emptyList()), ResponseField.forInt("boolIndex", "boolIndex", null, true, Collections.emptyList()), ResponseField.forInt("textIndexUser", "textIndexUser", null, true, Collections.emptyList()), ResponseField.forInt("numIndexUser", "numIndexUser", null, true, Collections.emptyList()), ResponseField.forInt("boolIndexUser", "boolIndexUser", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType, Collections.emptyList())};
        }

        public UpdateCustomPropertyIndexForAccount(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.textIndex = num;
            this.numIndex = num2;
            this.boolIndex = num3;
            this.textIndexUser = num4;
            this.numIndexUser = num5;
            this.boolIndexUser = num6;
            this.createdAt = str3;
            this.updatedAt = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Integer boolIndex() {
            return this.boolIndex;
        }

        public Integer boolIndexUser() {
            return this.boolIndexUser;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateCustomPropertyIndexForAccount)) {
                return false;
            }
            UpdateCustomPropertyIndexForAccount updateCustomPropertyIndexForAccount = (UpdateCustomPropertyIndexForAccount) obj;
            if (this.__typename.equals(updateCustomPropertyIndexForAccount.__typename) && this.accountId.equals(updateCustomPropertyIndexForAccount.accountId) && ((num = this.textIndex) != null ? num.equals(updateCustomPropertyIndexForAccount.textIndex) : updateCustomPropertyIndexForAccount.textIndex == null) && ((num2 = this.numIndex) != null ? num2.equals(updateCustomPropertyIndexForAccount.numIndex) : updateCustomPropertyIndexForAccount.numIndex == null) && ((num3 = this.boolIndex) != null ? num3.equals(updateCustomPropertyIndexForAccount.boolIndex) : updateCustomPropertyIndexForAccount.boolIndex == null) && ((num4 = this.textIndexUser) != null ? num4.equals(updateCustomPropertyIndexForAccount.textIndexUser) : updateCustomPropertyIndexForAccount.textIndexUser == null) && ((num5 = this.numIndexUser) != null ? num5.equals(updateCustomPropertyIndexForAccount.numIndexUser) : updateCustomPropertyIndexForAccount.numIndexUser == null) && ((num6 = this.boolIndexUser) != null ? num6.equals(updateCustomPropertyIndexForAccount.boolIndexUser) : updateCustomPropertyIndexForAccount.boolIndexUser == null) && ((str = this.createdAt) != null ? str.equals(updateCustomPropertyIndexForAccount.createdAt) : updateCustomPropertyIndexForAccount.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = updateCustomPropertyIndexForAccount.updatedAt;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                Integer num = this.textIndex;
                int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.numIndex;
                int iHashCode3 = (iHashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.boolIndex;
                int iHashCode4 = (iHashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.textIndexUser;
                int iHashCode5 = (iHashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.numIndexUser;
                int iHashCode6 = (iHashCode5 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.boolIndexUser;
                int iHashCode7 = (iHashCode6 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                String str = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode8 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyIndexForAccountMutation.UpdateCustomPropertyIndexForAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateCustomPropertyIndexForAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateCustomPropertyIndexForAccount.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateCustomPropertyIndexForAccount.this.accountId);
                    responseWriter.writeInt(responseFieldArr[2], UpdateCustomPropertyIndexForAccount.this.textIndex);
                    responseWriter.writeInt(responseFieldArr[3], UpdateCustomPropertyIndexForAccount.this.numIndex);
                    responseWriter.writeInt(responseFieldArr[4], UpdateCustomPropertyIndexForAccount.this.boolIndex);
                    responseWriter.writeInt(responseFieldArr[5], UpdateCustomPropertyIndexForAccount.this.textIndexUser);
                    responseWriter.writeInt(responseFieldArr[6], UpdateCustomPropertyIndexForAccount.this.numIndexUser);
                    responseWriter.writeInt(responseFieldArr[7], UpdateCustomPropertyIndexForAccount.this.boolIndexUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateCustomPropertyIndexForAccount.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateCustomPropertyIndexForAccount.this.updatedAt);
                }
            };
        }

        public Integer numIndex() {
            return this.numIndex;
        }

        public Integer numIndexUser() {
            return this.numIndexUser;
        }

        public Integer textIndex() {
            return this.textIndex;
        }

        public Integer textIndexUser() {
            return this.textIndexUser;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateCustomPropertyIndexForAccount{__typename=" + this.__typename + ", accountId=" + this.accountId + ", textIndex=" + this.textIndex + ", numIndex=" + this.numIndex + ", boolIndex=" + this.boolIndex + ", textIndexUser=" + this.textIndexUser + ", numIndexUser=" + this.numIndexUser + ", boolIndexUser=" + this.boolIndexUser + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelCustomPropertyIndexForAccountConditionInput condition;
        private final UpdateCustomPropertyIndexForAccountInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateCustomPropertyIndexForAccountInput updateCustomPropertyIndexForAccountInput, ModelCustomPropertyIndexForAccountConditionInput modelCustomPropertyIndexForAccountConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateCustomPropertyIndexForAccountInput;
            this.condition = modelCustomPropertyIndexForAccountConditionInput;
            linkedHashMap.put("input", updateCustomPropertyIndexForAccountInput);
            linkedHashMap.put("condition", modelCustomPropertyIndexForAccountConditionInput);
        }

        public ModelCustomPropertyIndexForAccountConditionInput condition() {
            return this.condition;
        }

        public UpdateCustomPropertyIndexForAccountInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyIndexForAccountMutation.Variables.1
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

    public UpdateCustomPropertyIndexForAccountMutation(UpdateCustomPropertyIndexForAccountInput updateCustomPropertyIndexForAccountInput, ModelCustomPropertyIndexForAccountConditionInput modelCustomPropertyIndexForAccountConditionInput) {
        Utils.checkNotNull(updateCustomPropertyIndexForAccountInput, "input == null");
        this.variables = new Variables(updateCustomPropertyIndexForAccountInput, modelCustomPropertyIndexForAccountConditionInput);
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
        return "ffa45232b33ad7560b0a49a81866a4ff7a700af54f800b1b52871f5260ae796e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateCustomPropertyIndexForAccount($input: UpdateCustomPropertyIndexForAccountInput!, $condition: ModelCustomPropertyIndexForAccountConditionInput) {\n  updateCustomPropertyIndexForAccount(input: $input, condition: $condition) {\n    __typename\n    accountId\n    textIndex\n    numIndex\n    boolIndex\n    textIndexUser\n    numIndexUser\n    boolIndexUser\n    createdAt\n    updatedAt\n  }\n}";
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
