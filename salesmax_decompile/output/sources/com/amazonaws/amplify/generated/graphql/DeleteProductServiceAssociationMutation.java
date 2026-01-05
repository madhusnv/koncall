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
import type.DeleteProductServiceAssociationInput;
import type.ModelProductServiceAssociationConditionInput;

/* loaded from: classes7.dex */
public final class DeleteProductServiceAssociationMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteProductServiceAssociation($input: DeleteProductServiceAssociationInput!, $condition: ModelProductServiceAssociationConditionInput) {\n  deleteProductServiceAssociation(input: $input, condition: $condition) {\n    __typename\n    id\n    productId\n    accountId\n    contactId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceAssociationMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteProductServiceAssociation";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteProductServiceAssociation($input: DeleteProductServiceAssociationInput!, $condition: ModelProductServiceAssociationConditionInput) {\n  deleteProductServiceAssociation(input: $input, condition: $condition) {\n    __typename\n    id\n    productId\n    accountId\n    contactId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelProductServiceAssociationConditionInput condition;
        private DeleteProductServiceAssociationInput input;

        public DeleteProductServiceAssociationMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteProductServiceAssociationMutation(this.input, this.condition);
        }

        public Builder condition(ModelProductServiceAssociationConditionInput modelProductServiceAssociationConditionInput) {
            this.condition = modelProductServiceAssociationConditionInput;
            return this;
        }

        public Builder input(DeleteProductServiceAssociationInput deleteProductServiceAssociationInput) {
            this.input = deleteProductServiceAssociationInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteProductServiceAssociation", "deleteProductServiceAssociation", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteProductServiceAssociation deleteProductServiceAssociation;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteProductServiceAssociation.Mapper deleteProductServiceAssociationFieldMapper = new DeleteProductServiceAssociation.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteProductServiceAssociation) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteProductServiceAssociation>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceAssociationMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteProductServiceAssociation read(ResponseReader responseReader2) {
                        return Mapper.this.deleteProductServiceAssociationFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteProductServiceAssociation deleteProductServiceAssociation) {
            this.deleteProductServiceAssociation = deleteProductServiceAssociation;
        }

        public DeleteProductServiceAssociation deleteProductServiceAssociation() {
            return this.deleteProductServiceAssociation;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteProductServiceAssociation deleteProductServiceAssociation = this.deleteProductServiceAssociation;
            DeleteProductServiceAssociation deleteProductServiceAssociation2 = ((Data) obj).deleteProductServiceAssociation;
            return deleteProductServiceAssociation == null ? deleteProductServiceAssociation2 == null : deleteProductServiceAssociation.equals(deleteProductServiceAssociation2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteProductServiceAssociation deleteProductServiceAssociation = this.deleteProductServiceAssociation;
                this.$hashCode = (deleteProductServiceAssociation == null ? 0 : deleteProductServiceAssociation.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceAssociationMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteProductServiceAssociation deleteProductServiceAssociation = Data.this.deleteProductServiceAssociation;
                    responseWriter.writeObject(responseField, deleteProductServiceAssociation != null ? deleteProductServiceAssociation.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteProductServiceAssociation=" + this.deleteProductServiceAssociation + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteProductServiceAssociation {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String contactId;
        final String createdAt;
        final String createdById;
        final String id;
        final String productId;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<DeleteProductServiceAssociation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteProductServiceAssociation map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteProductServiceAssociation.$responseFields;
                return new DeleteProductServiceAssociation(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public DeleteProductServiceAssociation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.productId = (String) Utils.checkNotNull(str3, "productId == null");
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.contactId = str5;
            this.createdAt = str6;
            this.updatedAt = str7;
            this.createdById = str8;
            this.updatedById = str9;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String contactId() {
            return this.contactId;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteProductServiceAssociation)) {
                return false;
            }
            DeleteProductServiceAssociation deleteProductServiceAssociation = (DeleteProductServiceAssociation) obj;
            if (this.__typename.equals(deleteProductServiceAssociation.__typename) && this.id.equals(deleteProductServiceAssociation.id) && this.productId.equals(deleteProductServiceAssociation.productId) && this.accountId.equals(deleteProductServiceAssociation.accountId) && ((str = this.contactId) != null ? str.equals(deleteProductServiceAssociation.contactId) : deleteProductServiceAssociation.contactId == null) && ((str2 = this.createdAt) != null ? str2.equals(deleteProductServiceAssociation.createdAt) : deleteProductServiceAssociation.createdAt == null) && ((str3 = this.updatedAt) != null ? str3.equals(deleteProductServiceAssociation.updatedAt) : deleteProductServiceAssociation.updatedAt == null) && ((str4 = this.createdById) != null ? str4.equals(deleteProductServiceAssociation.createdById) : deleteProductServiceAssociation.createdById == null)) {
                String str5 = this.updatedById;
                String str6 = deleteProductServiceAssociation.updatedById;
                if (str5 == null) {
                    if (str6 == null) {
                        return true;
                    }
                } else if (str5.equals(str6)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.productId.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.createdAt;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updatedAt;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdById;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedById;
                this.$hashCode = iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceAssociationMutation.DeleteProductServiceAssociation.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteProductServiceAssociation.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteProductServiceAssociation.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteProductServiceAssociation.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteProductServiceAssociation.this.productId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteProductServiceAssociation.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], DeleteProductServiceAssociation.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteProductServiceAssociation.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], DeleteProductServiceAssociation.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], DeleteProductServiceAssociation.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], DeleteProductServiceAssociation.this.updatedById);
                }
            };
        }

        public String productId() {
            return this.productId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteProductServiceAssociation{__typename=" + this.__typename + ", id=" + this.id + ", productId=" + this.productId + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelProductServiceAssociationConditionInput condition;
        private final DeleteProductServiceAssociationInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteProductServiceAssociationInput deleteProductServiceAssociationInput, ModelProductServiceAssociationConditionInput modelProductServiceAssociationConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteProductServiceAssociationInput;
            this.condition = modelProductServiceAssociationConditionInput;
            linkedHashMap.put("input", deleteProductServiceAssociationInput);
            linkedHashMap.put("condition", modelProductServiceAssociationConditionInput);
        }

        public ModelProductServiceAssociationConditionInput condition() {
            return this.condition;
        }

        public DeleteProductServiceAssociationInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceAssociationMutation.Variables.1
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

    public DeleteProductServiceAssociationMutation(DeleteProductServiceAssociationInput deleteProductServiceAssociationInput, ModelProductServiceAssociationConditionInput modelProductServiceAssociationConditionInput) {
        Utils.checkNotNull(deleteProductServiceAssociationInput, "input == null");
        this.variables = new Variables(deleteProductServiceAssociationInput, modelProductServiceAssociationConditionInput);
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
        return "14e5323ed163e52237c38fb4bcb5cab8db4e1b94a9d189de635bb8db43427a96";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteProductServiceAssociation($input: DeleteProductServiceAssociationInput!, $condition: ModelProductServiceAssociationConditionInput) {\n  deleteProductServiceAssociation(input: $input, condition: $condition) {\n    __typename\n    id\n    productId\n    accountId\n    contactId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
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
