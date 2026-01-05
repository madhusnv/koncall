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
import type.ModelProductConditionInput;
import type.UpdateProductInput;

/* loaded from: classes4.dex */
public final class UpdateProductMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateProduct($input: UpdateProductInput!, $condition: ModelProductConditionInput) {\n  updateProduct(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    productDescription\n    productType\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateProductMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateProduct";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateProduct($input: UpdateProductInput!, $condition: ModelProductConditionInput) {\n  updateProduct(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    productDescription\n    productType\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelProductConditionInput condition;
        private UpdateProductInput input;

        public UpdateProductMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateProductMutation(this.input, this.condition);
        }

        public Builder condition(ModelProductConditionInput modelProductConditionInput) {
            this.condition = modelProductConditionInput;
            return this;
        }

        public Builder input(UpdateProductInput updateProductInput) {
            this.input = updateProductInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateProduct", "updateProduct", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateProduct updateProduct;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateProduct.Mapper updateProductFieldMapper = new UpdateProduct.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateProduct) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateProduct>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateProductMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateProduct read(ResponseReader responseReader2) {
                        return Mapper.this.updateProductFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateProduct updateProduct) {
            this.updateProduct = updateProduct;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateProduct updateProduct = this.updateProduct;
            UpdateProduct updateProduct2 = ((Data) obj).updateProduct;
            return updateProduct == null ? updateProduct2 == null : updateProduct.equals(updateProduct2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateProduct updateProduct = this.updateProduct;
                this.$hashCode = (updateProduct == null ? 0 : updateProduct.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateProductMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateProduct updateProduct = Data.this.updateProduct;
                    responseWriter.writeObject(responseField, updateProduct != null ? updateProduct.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateProduct=" + this.updateProduct + "}";
            }
            return this.$toString;
        }

        public UpdateProduct updateProduct() {
            return this.updateProduct;
        }
    }

    public static class UpdateProduct {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String id;
        final String name;
        final String productDescription;
        final String productType;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateProduct> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateProduct map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateProduct.$responseFields;
                return new UpdateProduct(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("productDescription", "productDescription", null, true, Collections.emptyList()), ResponseField.forString("productType", "productType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public UpdateProduct(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.productDescription = str5;
            this.productType = str6;
            this.createdAt = (String) Utils.checkNotNull(str7, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str8, "updatedAt == null");
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

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateProduct)) {
                return false;
            }
            UpdateProduct updateProduct = (UpdateProduct) obj;
            return this.__typename.equals(updateProduct.__typename) && this.id.equals(updateProduct.id) && this.accountId.equals(updateProduct.accountId) && ((str = this.name) != null ? str.equals(updateProduct.name) : updateProduct.name == null) && ((str2 = this.productDescription) != null ? str2.equals(updateProduct.productDescription) : updateProduct.productDescription == null) && ((str3 = this.productType) != null ? str3.equals(updateProduct.productType) : updateProduct.productType == null) && this.createdAt.equals(updateProduct.createdAt) && this.updatedAt.equals(updateProduct.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.productDescription;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.productType;
                this.$hashCode = ((((iHashCode3 ^ (str3 != null ? str3.hashCode() : 0)) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateProductMutation.UpdateProduct.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateProduct.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateProduct.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateProduct.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateProduct.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], UpdateProduct.this.name);
                    responseWriter.writeString(responseFieldArr[4], UpdateProduct.this.productDescription);
                    responseWriter.writeString(responseFieldArr[5], UpdateProduct.this.productType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateProduct.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateProduct.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String productDescription() {
            return this.productDescription;
        }

        public String productType() {
            return this.productType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateProduct{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", productDescription=" + this.productDescription + ", productType=" + this.productType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelProductConditionInput condition;
        private final UpdateProductInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateProductInput updateProductInput, ModelProductConditionInput modelProductConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateProductInput;
            this.condition = modelProductConditionInput;
            linkedHashMap.put("input", updateProductInput);
            linkedHashMap.put("condition", modelProductConditionInput);
        }

        public ModelProductConditionInput condition() {
            return this.condition;
        }

        public UpdateProductInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateProductMutation.Variables.1
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

    public UpdateProductMutation(UpdateProductInput updateProductInput, ModelProductConditionInput modelProductConditionInput) {
        Utils.checkNotNull(updateProductInput, "input == null");
        this.variables = new Variables(updateProductInput, modelProductConditionInput);
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
        return "72fbc716d869afcefa2754bbd3cb40e9abdf15efb871bee3cb60f1b48f83ab1c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateProduct($input: UpdateProductInput!, $condition: ModelProductConditionInput) {\n  updateProduct(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    productDescription\n    productType\n    createdAt\n    updatedAt\n  }\n}";
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
