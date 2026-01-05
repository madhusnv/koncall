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
import type.ModelWabaPhoneNumberUserConditionInput;
import type.UpdateWabaPhoneNumberUserInput;

/* loaded from: classes4.dex */
public final class UpdateWabaPhoneNumberUserMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateWabaPhoneNumberUser($input: UpdateWabaPhoneNumberUserInput!, $condition: ModelWabaPhoneNumberUserConditionInput) {\n  updateWabaPhoneNumberUser(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    wabaPhoneNumberId\n    isDefault\n    userId\n    teamId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateWabaPhoneNumberUserMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateWabaPhoneNumberUser";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateWabaPhoneNumberUser($input: UpdateWabaPhoneNumberUserInput!, $condition: ModelWabaPhoneNumberUserConditionInput) {\n  updateWabaPhoneNumberUser(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    wabaPhoneNumberId\n    isDefault\n    userId\n    teamId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWabaPhoneNumberUserConditionInput condition;
        private UpdateWabaPhoneNumberUserInput input;

        public UpdateWabaPhoneNumberUserMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateWabaPhoneNumberUserMutation(this.input, this.condition);
        }

        public Builder condition(ModelWabaPhoneNumberUserConditionInput modelWabaPhoneNumberUserConditionInput) {
            this.condition = modelWabaPhoneNumberUserConditionInput;
            return this;
        }

        public Builder input(UpdateWabaPhoneNumberUserInput updateWabaPhoneNumberUserInput) {
            this.input = updateWabaPhoneNumberUserInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateWabaPhoneNumberUser", "updateWabaPhoneNumberUser", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateWabaPhoneNumberUser updateWabaPhoneNumberUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateWabaPhoneNumberUser.Mapper updateWabaPhoneNumberUserFieldMapper = new UpdateWabaPhoneNumberUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateWabaPhoneNumberUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateWabaPhoneNumberUser>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateWabaPhoneNumberUserMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateWabaPhoneNumberUser read(ResponseReader responseReader2) {
                        return Mapper.this.updateWabaPhoneNumberUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateWabaPhoneNumberUser updateWabaPhoneNumberUser) {
            this.updateWabaPhoneNumberUser = updateWabaPhoneNumberUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateWabaPhoneNumberUser updateWabaPhoneNumberUser = this.updateWabaPhoneNumberUser;
            UpdateWabaPhoneNumberUser updateWabaPhoneNumberUser2 = ((Data) obj).updateWabaPhoneNumberUser;
            return updateWabaPhoneNumberUser == null ? updateWabaPhoneNumberUser2 == null : updateWabaPhoneNumberUser.equals(updateWabaPhoneNumberUser2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateWabaPhoneNumberUser updateWabaPhoneNumberUser = this.updateWabaPhoneNumberUser;
                this.$hashCode = (updateWabaPhoneNumberUser == null ? 0 : updateWabaPhoneNumberUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateWabaPhoneNumberUserMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateWabaPhoneNumberUser updateWabaPhoneNumberUser = Data.this.updateWabaPhoneNumberUser;
                    responseWriter.writeObject(responseField, updateWabaPhoneNumberUser != null ? updateWabaPhoneNumberUser.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateWabaPhoneNumberUser=" + this.updateWabaPhoneNumberUser + "}";
            }
            return this.$toString;
        }

        public UpdateWabaPhoneNumberUser updateWabaPhoneNumberUser() {
            return this.updateWabaPhoneNumberUser;
        }
    }

    public static class UpdateWabaPhoneNumberUser {
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

        public static final class Mapper implements ResponseFieldMapper<UpdateWabaPhoneNumberUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateWabaPhoneNumberUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateWabaPhoneNumberUser.$responseFields;
                return new UpdateWabaPhoneNumberUser(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readBoolean(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("wabaPhoneNumberId", "wabaPhoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("isDefault", "isDefault", null, true, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("teamId", "teamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public UpdateWabaPhoneNumberUser(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10) {
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
            if (!(obj instanceof UpdateWabaPhoneNumberUser)) {
                return false;
            }
            UpdateWabaPhoneNumberUser updateWabaPhoneNumberUser = (UpdateWabaPhoneNumberUser) obj;
            if (this.__typename.equals(updateWabaPhoneNumberUser.__typename) && this.id.equals(updateWabaPhoneNumberUser.id) && this.accountId.equals(updateWabaPhoneNumberUser.accountId) && ((str = this.wabaPhoneNumberId) != null ? str.equals(updateWabaPhoneNumberUser.wabaPhoneNumberId) : updateWabaPhoneNumberUser.wabaPhoneNumberId == null) && ((bool = this.isDefault) != null ? bool.equals(updateWabaPhoneNumberUser.isDefault) : updateWabaPhoneNumberUser.isDefault == null) && ((str2 = this.userId) != null ? str2.equals(updateWabaPhoneNumberUser.userId) : updateWabaPhoneNumberUser.userId == null) && ((str3 = this.teamId) != null ? str3.equals(updateWabaPhoneNumberUser.teamId) : updateWabaPhoneNumberUser.teamId == null) && ((str4 = this.createdAt) != null ? str4.equals(updateWabaPhoneNumberUser.createdAt) : updateWabaPhoneNumberUser.createdAt == null) && ((str5 = this.updatedAt) != null ? str5.equals(updateWabaPhoneNumberUser.updatedAt) : updateWabaPhoneNumberUser.updatedAt == null) && ((str6 = this.createdById) != null ? str6.equals(updateWabaPhoneNumberUser.createdById) : updateWabaPhoneNumberUser.createdById == null)) {
                String str7 = this.updatedById;
                String str8 = updateWabaPhoneNumberUser.updatedById;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateWabaPhoneNumberUserMutation.UpdateWabaPhoneNumberUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateWabaPhoneNumberUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateWabaPhoneNumberUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateWabaPhoneNumberUser.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateWabaPhoneNumberUser.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateWabaPhoneNumberUser.this.wabaPhoneNumberId);
                    responseWriter.writeBoolean(responseFieldArr[4], UpdateWabaPhoneNumberUser.this.isDefault);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateWabaPhoneNumberUser.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateWabaPhoneNumberUser.this.teamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateWabaPhoneNumberUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateWabaPhoneNumberUser.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateWabaPhoneNumberUser.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateWabaPhoneNumberUser.this.updatedById);
                }
            };
        }

        public String teamId() {
            return this.teamId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateWabaPhoneNumberUser{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", wabaPhoneNumberId=" + this.wabaPhoneNumberId + ", isDefault=" + this.isDefault + ", userId=" + this.userId + ", teamId=" + this.teamId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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
        private final UpdateWabaPhoneNumberUserInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateWabaPhoneNumberUserInput updateWabaPhoneNumberUserInput, ModelWabaPhoneNumberUserConditionInput modelWabaPhoneNumberUserConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateWabaPhoneNumberUserInput;
            this.condition = modelWabaPhoneNumberUserConditionInput;
            linkedHashMap.put("input", updateWabaPhoneNumberUserInput);
            linkedHashMap.put("condition", modelWabaPhoneNumberUserConditionInput);
        }

        public ModelWabaPhoneNumberUserConditionInput condition() {
            return this.condition;
        }

        public UpdateWabaPhoneNumberUserInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateWabaPhoneNumberUserMutation.Variables.1
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

    public UpdateWabaPhoneNumberUserMutation(UpdateWabaPhoneNumberUserInput updateWabaPhoneNumberUserInput, ModelWabaPhoneNumberUserConditionInput modelWabaPhoneNumberUserConditionInput) {
        Utils.checkNotNull(updateWabaPhoneNumberUserInput, "input == null");
        this.variables = new Variables(updateWabaPhoneNumberUserInput, modelWabaPhoneNumberUserConditionInput);
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
        return "0a9f12b8ade87004e909ce9f66405c6b8c6579db13241a54fdb46550f49f7bdb";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateWabaPhoneNumberUser($input: UpdateWabaPhoneNumberUserInput!, $condition: ModelWabaPhoneNumberUserConditionInput) {\n  updateWabaPhoneNumberUser(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    wabaPhoneNumberId\n    isDefault\n    userId\n    teamId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
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
