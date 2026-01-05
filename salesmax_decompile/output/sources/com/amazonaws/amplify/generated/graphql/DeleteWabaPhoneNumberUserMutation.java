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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.DeleteWabaPhoneNumberUserInput;
import type.ModelWabaPhoneNumberUserConditionInput;

/* loaded from: classes7.dex */
public final class DeleteWabaPhoneNumberUserMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteWabaPhoneNumberUser($input: DeleteWabaPhoneNumberUserInput!, $condition: ModelWabaPhoneNumberUserConditionInput) {\n  deleteWabaPhoneNumberUser(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    wabaPhoneNumberId\n    isDefault\n    userId\n    teamId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaPhoneNumberUserMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteWabaPhoneNumberUser";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteWabaPhoneNumberUser($input: DeleteWabaPhoneNumberUserInput!, $condition: ModelWabaPhoneNumberUserConditionInput) {\n  deleteWabaPhoneNumberUser(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    wabaPhoneNumberId\n    isDefault\n    userId\n    teamId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWabaPhoneNumberUserConditionInput condition;
        private DeleteWabaPhoneNumberUserInput input;

        public DeleteWabaPhoneNumberUserMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteWabaPhoneNumberUserMutation(this.input, this.condition);
        }

        public Builder condition(ModelWabaPhoneNumberUserConditionInput modelWabaPhoneNumberUserConditionInput) {
            this.condition = modelWabaPhoneNumberUserConditionInput;
            return this;
        }

        public Builder input(DeleteWabaPhoneNumberUserInput deleteWabaPhoneNumberUserInput) {
            this.input = deleteWabaPhoneNumberUserInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteWabaPhoneNumberUser", "deleteWabaPhoneNumberUser", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteWabaPhoneNumberUser deleteWabaPhoneNumberUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteWabaPhoneNumberUser.Mapper deleteWabaPhoneNumberUserFieldMapper = new DeleteWabaPhoneNumberUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteWabaPhoneNumberUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteWabaPhoneNumberUser>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaPhoneNumberUserMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteWabaPhoneNumberUser read(ResponseReader responseReader2) {
                        return Mapper.this.deleteWabaPhoneNumberUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteWabaPhoneNumberUser deleteWabaPhoneNumberUser) {
            this.deleteWabaPhoneNumberUser = deleteWabaPhoneNumberUser;
        }

        public DeleteWabaPhoneNumberUser deleteWabaPhoneNumberUser() {
            return this.deleteWabaPhoneNumberUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteWabaPhoneNumberUser deleteWabaPhoneNumberUser = this.deleteWabaPhoneNumberUser;
            DeleteWabaPhoneNumberUser deleteWabaPhoneNumberUser2 = ((Data) obj).deleteWabaPhoneNumberUser;
            return deleteWabaPhoneNumberUser == null ? deleteWabaPhoneNumberUser2 == null : deleteWabaPhoneNumberUser.equals(deleteWabaPhoneNumberUser2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteWabaPhoneNumberUser deleteWabaPhoneNumberUser = this.deleteWabaPhoneNumberUser;
                this.$hashCode = (deleteWabaPhoneNumberUser == null ? 0 : deleteWabaPhoneNumberUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaPhoneNumberUserMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteWabaPhoneNumberUser deleteWabaPhoneNumberUser = Data.this.deleteWabaPhoneNumberUser;
                    responseWriter.writeObject(responseField, deleteWabaPhoneNumberUser != null ? deleteWabaPhoneNumberUser.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteWabaPhoneNumberUser=" + this.deleteWabaPhoneNumberUser + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteWabaPhoneNumberUser {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String id;
        final Boolean isDefault;
        final String teamId;
        final String updatedAt;
        final String updatedById;
        final String userId;
        final String wabaPhoneNumberId;

        public static final class Mapper implements ResponseFieldMapper<DeleteWabaPhoneNumberUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteWabaPhoneNumberUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteWabaPhoneNumberUser.$responseFields;
                return new DeleteWabaPhoneNumberUser(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readBoolean(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("wabaPhoneNumberId", "wabaPhoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("isDefault", "isDefault", null, true, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("teamId", "teamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public DeleteWabaPhoneNumberUser(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.wabaPhoneNumberId = str4;
            this.isDefault = bool;
            this.userId = str5;
            this.teamId = str6;
            this.createdAt = str7;
            this.updatedAt = str8;
            this.createdById = str9;
            this.updatedById = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public boolean equals(Object obj) {
            String str;
            Boolean bool;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteWabaPhoneNumberUser)) {
                return false;
            }
            DeleteWabaPhoneNumberUser deleteWabaPhoneNumberUser = (DeleteWabaPhoneNumberUser) obj;
            if (this.__typename.equals(deleteWabaPhoneNumberUser.__typename) && this.id.equals(deleteWabaPhoneNumberUser.id) && this.accountId.equals(deleteWabaPhoneNumberUser.accountId) && ((str = this.wabaPhoneNumberId) != null ? str.equals(deleteWabaPhoneNumberUser.wabaPhoneNumberId) : deleteWabaPhoneNumberUser.wabaPhoneNumberId == null) && ((bool = this.isDefault) != null ? bool.equals(deleteWabaPhoneNumberUser.isDefault) : deleteWabaPhoneNumberUser.isDefault == null) && ((str2 = this.userId) != null ? str2.equals(deleteWabaPhoneNumberUser.userId) : deleteWabaPhoneNumberUser.userId == null) && ((str3 = this.teamId) != null ? str3.equals(deleteWabaPhoneNumberUser.teamId) : deleteWabaPhoneNumberUser.teamId == null) && ((str4 = this.createdAt) != null ? str4.equals(deleteWabaPhoneNumberUser.createdAt) : deleteWabaPhoneNumberUser.createdAt == null) && ((str5 = this.updatedAt) != null ? str5.equals(deleteWabaPhoneNumberUser.updatedAt) : deleteWabaPhoneNumberUser.updatedAt == null) && ((str6 = this.createdById) != null ? str6.equals(deleteWabaPhoneNumberUser.createdById) : deleteWabaPhoneNumberUser.createdById == null)) {
                String str7 = this.updatedById;
                String str8 = deleteWabaPhoneNumberUser.updatedById;
                if (str7 == null) {
                    if (str8 == null) {
                        return true;
                    }
                } else if (str7.equals(str8)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.wabaPhoneNumberId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Boolean bool = this.isDefault;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str2 = this.userId;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamId;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.createdById;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedById;
                this.$hashCode = iHashCode8 ^ (str7 != null ? str7.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isDefault() {
            return this.isDefault;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaPhoneNumberUserMutation.DeleteWabaPhoneNumberUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteWabaPhoneNumberUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteWabaPhoneNumberUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteWabaPhoneNumberUser.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteWabaPhoneNumberUser.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteWabaPhoneNumberUser.this.wabaPhoneNumberId);
                    responseWriter.writeBoolean(responseFieldArr[4], DeleteWabaPhoneNumberUser.this.isDefault);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteWabaPhoneNumberUser.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], DeleteWabaPhoneNumberUser.this.teamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], DeleteWabaPhoneNumberUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], DeleteWabaPhoneNumberUser.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], DeleteWabaPhoneNumberUser.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], DeleteWabaPhoneNumberUser.this.updatedById);
                }
            };
        }

        public String teamId() {
            return this.teamId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteWabaPhoneNumberUser{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", wabaPhoneNumberId=" + this.wabaPhoneNumberId + ", isDefault=" + this.isDefault + ", userId=" + this.userId + ", teamId=" + this.teamId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String userId() {
            return this.userId;
        }

        public String wabaPhoneNumberId() {
            return this.wabaPhoneNumberId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelWabaPhoneNumberUserConditionInput condition;
        private final DeleteWabaPhoneNumberUserInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteWabaPhoneNumberUserInput deleteWabaPhoneNumberUserInput, ModelWabaPhoneNumberUserConditionInput modelWabaPhoneNumberUserConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteWabaPhoneNumberUserInput;
            this.condition = modelWabaPhoneNumberUserConditionInput;
            linkedHashMap.put("input", deleteWabaPhoneNumberUserInput);
            linkedHashMap.put("condition", modelWabaPhoneNumberUserConditionInput);
        }

        public ModelWabaPhoneNumberUserConditionInput condition() {
            return this.condition;
        }

        public DeleteWabaPhoneNumberUserInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaPhoneNumberUserMutation.Variables.1
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

    public DeleteWabaPhoneNumberUserMutation(DeleteWabaPhoneNumberUserInput deleteWabaPhoneNumberUserInput, ModelWabaPhoneNumberUserConditionInput modelWabaPhoneNumberUserConditionInput) {
        Utils.checkNotNull(deleteWabaPhoneNumberUserInput, "input == null");
        this.variables = new Variables(deleteWabaPhoneNumberUserInput, modelWabaPhoneNumberUserConditionInput);
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
        return "fe99460eba2e48fc730fadb15134b261ffd71f69b8a81f9caad25873b39137a9";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteWabaPhoneNumberUser($input: DeleteWabaPhoneNumberUserInput!, $condition: ModelWabaPhoneNumberUserConditionInput) {\n  deleteWabaPhoneNumberUser(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    wabaPhoneNumberId\n    isDefault\n    userId\n    teamId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
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
