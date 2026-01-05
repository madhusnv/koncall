package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
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

/* loaded from: classes7.dex */
public final class GetProductQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetProduct($id: ID!) {\n  getProduct(id: $id) {\n    __typename\n    id\n    accountId\n    name\n    productDescription\n    productType\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetProductQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetProduct";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetProduct($id: ID!) {\n  getProduct(id: $id) {\n    __typename\n    id\n    accountId\n    name\n    productDescription\n    productType\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetProductQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetProductQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getProduct", "getProduct", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetProduct getProduct;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetProduct.Mapper getProductFieldMapper = new GetProduct.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetProduct) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetProduct>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetProduct read(ResponseReader responseReader2) {
                        return Mapper.this.getProductFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetProduct getProduct) {
            this.getProduct = getProduct;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetProduct getProduct = this.getProduct;
            GetProduct getProduct2 = ((Data) obj).getProduct;
            return getProduct == null ? getProduct2 == null : getProduct.equals(getProduct2);
        }

        public GetProduct getProduct() {
            return this.getProduct;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetProduct getProduct = this.getProduct;
                this.$hashCode = (getProduct == null ? 0 : getProduct.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetProduct getProduct = Data.this.getProduct;
                    responseWriter.writeObject(responseField, getProduct != null ? getProduct.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getProduct=" + this.getProduct + "}";
            }
            return this.$toString;
        }
    }

    public static class GetProduct {
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

        public static final class Mapper implements ResponseFieldMapper<GetProduct> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetProduct map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetProduct.$responseFields;
                return new GetProduct(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("productDescription", "productDescription", null, true, Collections.emptyList()), ResponseField.forString("productType", "productType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public GetProduct(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
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
            if (!(obj instanceof GetProduct)) {
                return false;
            }
            GetProduct getProduct = (GetProduct) obj;
            return this.__typename.equals(getProduct.__typename) && this.id.equals(getProduct.id) && this.accountId.equals(getProduct.accountId) && ((str = this.name) != null ? str.equals(getProduct.name) : getProduct.name == null) && ((str2 = this.productDescription) != null ? str2.equals(getProduct.productDescription) : getProduct.productDescription == null) && ((str3 = this.productType) != null ? str3.equals(getProduct.productType) : getProduct.productType == null) && this.createdAt.equals(getProduct.createdAt) && this.updatedAt.equals(getProduct.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductQuery.GetProduct.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetProduct.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetProduct.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetProduct.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetProduct.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], GetProduct.this.name);
                    responseWriter.writeString(responseFieldArr[4], GetProduct.this.productDescription);
                    responseWriter.writeString(responseFieldArr[5], GetProduct.this.productType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], GetProduct.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], GetProduct.this.updatedAt);
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
                this.$toString = "GetProduct{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", productDescription=" + this.productDescription + ", productType=" + this.productType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String id;
        private final transient Map<String, Object> valueMap;

        public Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.id = str;
            linkedHashMap.put(OutcomeConstants.OUTCOME_ID, str);
        }

        public String id() {
            return this.id;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, Variables.this.id);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetProductQuery(String str) {
        Utils.checkNotNull(str, "id == null");
        this.variables = new Variables(str);
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
        return "343c96a7971f9acb3d94669809465a495b18101e0d6209237ec5e49acf7b593b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetProduct($id: ID!) {\n  getProduct(id: $id) {\n    __typename\n    id\n    accountId\n    name\n    productDescription\n    productType\n    createdAt\n    updatedAt\n  }\n}";
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
