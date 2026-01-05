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
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.DeleteCloudTelephonyUserInput;
import type.ModelCloudTelephonyUserConditionInput;

/* loaded from: classes6.dex */
public final class DeleteCloudTelephonyUserMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteCloudTelephonyUser($input: DeleteCloudTelephonyUserInput!, $condition: ModelCloudTelephonyUserConditionInput) {\n  deleteCloudTelephonyUser(input: $input, condition: $condition) {\n    __typename\n    id\n    userId\n    remoteUserId\n    accountId\n    cloudTelephonyAccount\n    agentNumber\n    agentId\n    providerName\n    agentStatus\n    ouboundEnabled\n    allowedOutboundNumbers\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCloudTelephonyUserMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteCloudTelephonyUser";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteCloudTelephonyUser($input: DeleteCloudTelephonyUserInput!, $condition: ModelCloudTelephonyUserConditionInput) {\n  deleteCloudTelephonyUser(input: $input, condition: $condition) {\n    __typename\n    id\n    userId\n    remoteUserId\n    accountId\n    cloudTelephonyAccount\n    agentNumber\n    agentId\n    providerName\n    agentStatus\n    ouboundEnabled\n    allowedOutboundNumbers\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelCloudTelephonyUserConditionInput condition;
        private DeleteCloudTelephonyUserInput input;

        public DeleteCloudTelephonyUserMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteCloudTelephonyUserMutation(this.input, this.condition);
        }

        public Builder condition(ModelCloudTelephonyUserConditionInput modelCloudTelephonyUserConditionInput) {
            this.condition = modelCloudTelephonyUserConditionInput;
            return this;
        }

        public Builder input(DeleteCloudTelephonyUserInput deleteCloudTelephonyUserInput) {
            this.input = deleteCloudTelephonyUserInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteCloudTelephonyUser", "deleteCloudTelephonyUser", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteCloudTelephonyUser deleteCloudTelephonyUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteCloudTelephonyUser.Mapper deleteCloudTelephonyUserFieldMapper = new DeleteCloudTelephonyUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteCloudTelephonyUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteCloudTelephonyUser>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCloudTelephonyUserMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteCloudTelephonyUser read(ResponseReader responseReader2) {
                        return Mapper.this.deleteCloudTelephonyUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteCloudTelephonyUser deleteCloudTelephonyUser) {
            this.deleteCloudTelephonyUser = deleteCloudTelephonyUser;
        }

        public DeleteCloudTelephonyUser deleteCloudTelephonyUser() {
            return this.deleteCloudTelephonyUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteCloudTelephonyUser deleteCloudTelephonyUser = this.deleteCloudTelephonyUser;
            DeleteCloudTelephonyUser deleteCloudTelephonyUser2 = ((Data) obj).deleteCloudTelephonyUser;
            return deleteCloudTelephonyUser == null ? deleteCloudTelephonyUser2 == null : deleteCloudTelephonyUser.equals(deleteCloudTelephonyUser2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteCloudTelephonyUser deleteCloudTelephonyUser = this.deleteCloudTelephonyUser;
                this.$hashCode = (deleteCloudTelephonyUser == null ? 0 : deleteCloudTelephonyUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCloudTelephonyUserMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteCloudTelephonyUser deleteCloudTelephonyUser = Data.this.deleteCloudTelephonyUser;
                    responseWriter.writeObject(responseField, deleteCloudTelephonyUser != null ? deleteCloudTelephonyUser.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteCloudTelephonyUser=" + this.deleteCloudTelephonyUser + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteCloudTelephonyUser {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String agentId;
        final String agentNumber;
        final String agentStatus;
        final List<String> allowedOutboundNumbers;
        final String cloudTelephonyAccount;
        final String createdAt;
        final String createdById;
        final String id;
        final Boolean ouboundEnabled;
        final String providerName;
        final String remoteUserId;
        final String updatedAt;
        final String updatedById;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<DeleteCloudTelephonyUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteCloudTelephonyUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteCloudTelephonyUser.$responseFields;
                return new DeleteCloudTelephonyUser(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readBoolean(responseFieldArr[10]), responseReader.readList(responseFieldArr[11], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCloudTelephonyUserMutation.DeleteCloudTelephonyUser.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forString("remoteUserId", "remoteUserId", null, true, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("cloudTelephonyAccount", "cloudTelephonyAccount", null, true, customType, Collections.emptyList()), ResponseField.forString("agentNumber", "agentNumber", null, true, Collections.emptyList()), ResponseField.forString("agentId", "agentId", null, true, Collections.emptyList()), ResponseField.forString("providerName", "providerName", null, true, Collections.emptyList()), ResponseField.forString("agentStatus", "agentStatus", null, true, Collections.emptyList()), ResponseField.forBoolean("ouboundEnabled", "ouboundEnabled", null, true, Collections.emptyList()), ResponseField.forList("allowedOutboundNumbers", "allowedOutboundNumbers", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public DeleteCloudTelephonyUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, List<String> list, String str11, String str12, String str13, String str14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.userId = str3;
            this.remoteUserId = str4;
            this.accountId = (String) Utils.checkNotNull(str5, "accountId == null");
            this.cloudTelephonyAccount = str6;
            this.agentNumber = str7;
            this.agentId = str8;
            this.providerName = str9;
            this.agentStatus = str10;
            this.ouboundEnabled = bool;
            this.allowedOutboundNumbers = list;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.createdById = str13;
            this.updatedById = str14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String agentId() {
            return this.agentId;
        }

        public String agentNumber() {
            return this.agentNumber;
        }

        public String agentStatus() {
            return this.agentStatus;
        }

        public List<String> allowedOutboundNumbers() {
            return this.allowedOutboundNumbers;
        }

        public String cloudTelephonyAccount() {
            return this.cloudTelephonyAccount;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Boolean bool;
            List<String> list;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteCloudTelephonyUser)) {
                return false;
            }
            DeleteCloudTelephonyUser deleteCloudTelephonyUser = (DeleteCloudTelephonyUser) obj;
            if (this.__typename.equals(deleteCloudTelephonyUser.__typename) && this.id.equals(deleteCloudTelephonyUser.id) && ((str = this.userId) != null ? str.equals(deleteCloudTelephonyUser.userId) : deleteCloudTelephonyUser.userId == null) && ((str2 = this.remoteUserId) != null ? str2.equals(deleteCloudTelephonyUser.remoteUserId) : deleteCloudTelephonyUser.remoteUserId == null) && this.accountId.equals(deleteCloudTelephonyUser.accountId) && ((str3 = this.cloudTelephonyAccount) != null ? str3.equals(deleteCloudTelephonyUser.cloudTelephonyAccount) : deleteCloudTelephonyUser.cloudTelephonyAccount == null) && ((str4 = this.agentNumber) != null ? str4.equals(deleteCloudTelephonyUser.agentNumber) : deleteCloudTelephonyUser.agentNumber == null) && ((str5 = this.agentId) != null ? str5.equals(deleteCloudTelephonyUser.agentId) : deleteCloudTelephonyUser.agentId == null) && ((str6 = this.providerName) != null ? str6.equals(deleteCloudTelephonyUser.providerName) : deleteCloudTelephonyUser.providerName == null) && ((str7 = this.agentStatus) != null ? str7.equals(deleteCloudTelephonyUser.agentStatus) : deleteCloudTelephonyUser.agentStatus == null) && ((bool = this.ouboundEnabled) != null ? bool.equals(deleteCloudTelephonyUser.ouboundEnabled) : deleteCloudTelephonyUser.ouboundEnabled == null) && ((list = this.allowedOutboundNumbers) != null ? list.equals(deleteCloudTelephonyUser.allowedOutboundNumbers) : deleteCloudTelephonyUser.allowedOutboundNumbers == null) && ((str8 = this.createdAt) != null ? str8.equals(deleteCloudTelephonyUser.createdAt) : deleteCloudTelephonyUser.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(deleteCloudTelephonyUser.updatedAt) : deleteCloudTelephonyUser.updatedAt == null) && ((str10 = this.createdById) != null ? str10.equals(deleteCloudTelephonyUser.createdById) : deleteCloudTelephonyUser.createdById == null)) {
                String str11 = this.updatedById;
                String str12 = deleteCloudTelephonyUser.updatedById;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.userId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.remoteUserId;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str3 = this.cloudTelephonyAccount;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.agentNumber;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.agentId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.providerName;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.agentStatus;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                Boolean bool = this.ouboundEnabled;
                int iHashCode9 = (iHashCode8 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                List<String> list = this.allowedOutboundNumbers;
                int iHashCode10 = (iHashCode9 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdById;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedById;
                this.$hashCode = iHashCode13 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCloudTelephonyUserMutation.DeleteCloudTelephonyUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteCloudTelephonyUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteCloudTelephonyUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteCloudTelephonyUser.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteCloudTelephonyUser.this.userId);
                    responseWriter.writeString(responseFieldArr[3], DeleteCloudTelephonyUser.this.remoteUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], DeleteCloudTelephonyUser.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteCloudTelephonyUser.this.cloudTelephonyAccount);
                    responseWriter.writeString(responseFieldArr[6], DeleteCloudTelephonyUser.this.agentNumber);
                    responseWriter.writeString(responseFieldArr[7], DeleteCloudTelephonyUser.this.agentId);
                    responseWriter.writeString(responseFieldArr[8], DeleteCloudTelephonyUser.this.providerName);
                    responseWriter.writeString(responseFieldArr[9], DeleteCloudTelephonyUser.this.agentStatus);
                    responseWriter.writeBoolean(responseFieldArr[10], DeleteCloudTelephonyUser.this.ouboundEnabled);
                    responseWriter.writeList(responseFieldArr[11], DeleteCloudTelephonyUser.this.allowedOutboundNumbers, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCloudTelephonyUserMutation.DeleteCloudTelephonyUser.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], DeleteCloudTelephonyUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], DeleteCloudTelephonyUser.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], DeleteCloudTelephonyUser.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], DeleteCloudTelephonyUser.this.updatedById);
                }
            };
        }

        public Boolean ouboundEnabled() {
            return this.ouboundEnabled;
        }

        public String providerName() {
            return this.providerName;
        }

        public String remoteUserId() {
            return this.remoteUserId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteCloudTelephonyUser{__typename=" + this.__typename + ", id=" + this.id + ", userId=" + this.userId + ", remoteUserId=" + this.remoteUserId + ", accountId=" + this.accountId + ", cloudTelephonyAccount=" + this.cloudTelephonyAccount + ", agentNumber=" + this.agentNumber + ", agentId=" + this.agentId + ", providerName=" + this.providerName + ", agentStatus=" + this.agentStatus + ", ouboundEnabled=" + this.ouboundEnabled + ", allowedOutboundNumbers=" + this.allowedOutboundNumbers + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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
    }

    public static final class Variables extends Operation.Variables {
        private final ModelCloudTelephonyUserConditionInput condition;
        private final DeleteCloudTelephonyUserInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteCloudTelephonyUserInput deleteCloudTelephonyUserInput, ModelCloudTelephonyUserConditionInput modelCloudTelephonyUserConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteCloudTelephonyUserInput;
            this.condition = modelCloudTelephonyUserConditionInput;
            linkedHashMap.put("input", deleteCloudTelephonyUserInput);
            linkedHashMap.put("condition", modelCloudTelephonyUserConditionInput);
        }

        public ModelCloudTelephonyUserConditionInput condition() {
            return this.condition;
        }

        public DeleteCloudTelephonyUserInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCloudTelephonyUserMutation.Variables.1
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

    public DeleteCloudTelephonyUserMutation(DeleteCloudTelephonyUserInput deleteCloudTelephonyUserInput, ModelCloudTelephonyUserConditionInput modelCloudTelephonyUserConditionInput) {
        Utils.checkNotNull(deleteCloudTelephonyUserInput, "input == null");
        this.variables = new Variables(deleteCloudTelephonyUserInput, modelCloudTelephonyUserConditionInput);
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
        return "9a569bdc0a93be04d5f35ab3b715065e92e2e36e0233cabcd14824594b90edf6";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteCloudTelephonyUser($input: DeleteCloudTelephonyUserInput!, $condition: ModelCloudTelephonyUserConditionInput) {\n  deleteCloudTelephonyUser(input: $input, condition: $condition) {\n    __typename\n    id\n    userId\n    remoteUserId\n    accountId\n    cloudTelephonyAccount\n    agentNumber\n    agentId\n    providerName\n    agentStatus\n    ouboundEnabled\n    allowedOutboundNumbers\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
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
