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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;

/* loaded from: classes7.dex */
public final class GetProductAccountBillsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetProductAccountBills($id: ID!) {\n  getProductAccountBills(id: $id) {\n    __typename\n    id\n    accountId\n    productAccountId\n    productPlanId\n    productAccountBills {\n      __typename\n      accountId\n      productId\n      totalFees\n      currency\n    }\n    totalFees\n    currency\n    billStatus\n    billGeneratedFrom\n    billGeneratedTo\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetProductAccountBills";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetProductAccountBills($id: ID!) {\n  getProductAccountBills(id: $id) {\n    __typename\n    id\n    accountId\n    productAccountId\n    productPlanId\n    productAccountBills {\n      __typename\n      accountId\n      productId\n      totalFees\n      currency\n    }\n    totalFees\n    currency\n    billStatus\n    billGeneratedFrom\n    billGeneratedTo\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetProductAccountBillsQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetProductAccountBillsQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getProductAccountBills", "getProductAccountBills", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetProductAccountBills getProductAccountBills;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetProductAccountBills.Mapper getProductAccountBillsFieldMapper = new GetProductAccountBills.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetProductAccountBills) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetProductAccountBills>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetProductAccountBills read(ResponseReader responseReader2) {
                        return Mapper.this.getProductAccountBillsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetProductAccountBills getProductAccountBills) {
            this.getProductAccountBills = getProductAccountBills;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetProductAccountBills getProductAccountBills = this.getProductAccountBills;
            GetProductAccountBills getProductAccountBills2 = ((Data) obj).getProductAccountBills;
            return getProductAccountBills == null ? getProductAccountBills2 == null : getProductAccountBills.equals(getProductAccountBills2);
        }

        public GetProductAccountBills getProductAccountBills() {
            return this.getProductAccountBills;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetProductAccountBills getProductAccountBills = this.getProductAccountBills;
                this.$hashCode = (getProductAccountBills == null ? 0 : getProductAccountBills.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetProductAccountBills getProductAccountBills = Data.this.getProductAccountBills;
                    responseWriter.writeObject(responseField, getProductAccountBills != null ? getProductAccountBills.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getProductAccountBills=" + this.getProductAccountBills + "}";
            }
            return this.$toString;
        }
    }

    public static class GetProductAccountBills {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String billGeneratedFrom;
        final String billGeneratedTo;
        final String billStatus;
        final String createdAt;
        final String currency;
        final String id;
        final List<ProductAccountBill> productAccountBills;
        final String productAccountId;
        final String productPlanId;
        final Integer totalFees;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<GetProductAccountBills> {
            final ProductAccountBill.Mapper productAccountBillFieldMapper = new ProductAccountBill.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetProductAccountBills map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetProductAccountBills.$responseFields;
                return new GetProductAccountBills(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<ProductAccountBill>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsQuery.GetProductAccountBills.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public ProductAccountBill read(ResponseReader.ListItemReader listItemReader) {
                        return (ProductAccountBill) listItemReader.readObject(new ResponseReader.ObjectReader<ProductAccountBill>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsQuery.GetProductAccountBills.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public ProductAccountBill read(ResponseReader responseReader2) {
                                return Mapper.this.productAccountBillFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readInt(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productAccountId", "productAccountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productPlanId", "productPlanId", null, false, customType, Collections.emptyList()), ResponseField.forList("productAccountBills", "productAccountBills", null, true, Collections.emptyList()), ResponseField.forInt("totalFees", "totalFees", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forString("billStatus", "billStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("billGeneratedFrom", "billGeneratedFrom", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("billGeneratedTo", "billGeneratedTo", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public GetProductAccountBills(String str, String str2, String str3, String str4, String str5, List<ProductAccountBill> list, Integer num, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.productAccountId = (String) Utils.checkNotNull(str4, "productAccountId == null");
            this.productPlanId = (String) Utils.checkNotNull(str5, "productPlanId == null");
            this.productAccountBills = list;
            this.totalFees = num;
            this.currency = str6;
            this.billStatus = str7;
            this.billGeneratedFrom = str8;
            this.billGeneratedTo = str9;
            this.createdAt = (String) Utils.checkNotNull(str10, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str11, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String billGeneratedFrom() {
            return this.billGeneratedFrom;
        }

        public String billGeneratedTo() {
            return this.billGeneratedTo;
        }

        public String billStatus() {
            return this.billStatus;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String currency() {
            return this.currency;
        }

        public boolean equals(Object obj) {
            List<ProductAccountBill> list;
            Integer num;
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetProductAccountBills)) {
                return false;
            }
            GetProductAccountBills getProductAccountBills = (GetProductAccountBills) obj;
            return this.__typename.equals(getProductAccountBills.__typename) && this.id.equals(getProductAccountBills.id) && this.accountId.equals(getProductAccountBills.accountId) && this.productAccountId.equals(getProductAccountBills.productAccountId) && this.productPlanId.equals(getProductAccountBills.productPlanId) && ((list = this.productAccountBills) != null ? list.equals(getProductAccountBills.productAccountBills) : getProductAccountBills.productAccountBills == null) && ((num = this.totalFees) != null ? num.equals(getProductAccountBills.totalFees) : getProductAccountBills.totalFees == null) && ((str = this.currency) != null ? str.equals(getProductAccountBills.currency) : getProductAccountBills.currency == null) && ((str2 = this.billStatus) != null ? str2.equals(getProductAccountBills.billStatus) : getProductAccountBills.billStatus == null) && ((str3 = this.billGeneratedFrom) != null ? str3.equals(getProductAccountBills.billGeneratedFrom) : getProductAccountBills.billGeneratedFrom == null) && ((str4 = this.billGeneratedTo) != null ? str4.equals(getProductAccountBills.billGeneratedTo) : getProductAccountBills.billGeneratedTo == null) && this.createdAt.equals(getProductAccountBills.createdAt) && this.updatedAt.equals(getProductAccountBills.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.productAccountId.hashCode()) * 1000003) ^ this.productPlanId.hashCode()) * 1000003;
                List<ProductAccountBill> list = this.productAccountBills;
                int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Integer num = this.totalFees;
                int iHashCode3 = (iHashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.currency;
                int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.billStatus;
                int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.billGeneratedFrom;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.billGeneratedTo;
                this.$hashCode = ((((iHashCode6 ^ (str4 != null ? str4.hashCode() : 0)) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsQuery.GetProductAccountBills.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetProductAccountBills.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetProductAccountBills.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetProductAccountBills.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetProductAccountBills.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetProductAccountBills.this.productAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], GetProductAccountBills.this.productPlanId);
                    responseWriter.writeList(responseFieldArr[5], GetProductAccountBills.this.productAccountBills, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsQuery.GetProductAccountBills.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((ProductAccountBill) obj).marshaller());
                        }
                    });
                    responseWriter.writeInt(responseFieldArr[6], GetProductAccountBills.this.totalFees);
                    responseWriter.writeString(responseFieldArr[7], GetProductAccountBills.this.currency);
                    responseWriter.writeString(responseFieldArr[8], GetProductAccountBills.this.billStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], GetProductAccountBills.this.billGeneratedFrom);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], GetProductAccountBills.this.billGeneratedTo);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], GetProductAccountBills.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], GetProductAccountBills.this.updatedAt);
                }
            };
        }

        public List<ProductAccountBill> productAccountBills() {
            return this.productAccountBills;
        }

        public String productAccountId() {
            return this.productAccountId;
        }

        public String productPlanId() {
            return this.productPlanId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetProductAccountBills{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", productAccountId=" + this.productAccountId + ", productPlanId=" + this.productPlanId + ", productAccountBills=" + this.productAccountBills + ", totalFees=" + this.totalFees + ", currency=" + this.currency + ", billStatus=" + this.billStatus + ", billGeneratedFrom=" + this.billGeneratedFrom + ", billGeneratedTo=" + this.billGeneratedTo + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public Integer totalFees() {
            return this.totalFees;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ProductAccountBill {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String currency;
        final String productId;
        final Integer totalFees;

        public static final class Mapper implements ResponseFieldMapper<ProductAccountBill> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ProductAccountBill map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ProductAccountBill.$responseFields;
                return new ProductAccountBill(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, false, customType, Collections.emptyList()), ResponseField.forInt("totalFees", "totalFees", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList())};
        }

        public ProductAccountBill(String str, String str2, String str3, Integer num, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.productId = (String) Utils.checkNotNull(str3, "productId == null");
            this.totalFees = num;
            this.currency = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String currency() {
            return this.currency;
        }

        public boolean equals(Object obj) {
            Integer num;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProductAccountBill)) {
                return false;
            }
            ProductAccountBill productAccountBill = (ProductAccountBill) obj;
            if (this.__typename.equals(productAccountBill.__typename) && this.accountId.equals(productAccountBill.accountId) && this.productId.equals(productAccountBill.productId) && ((num = this.totalFees) != null ? num.equals(productAccountBill.totalFees) : productAccountBill.totalFees == null)) {
                String str = this.currency;
                String str2 = productAccountBill.currency;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.productId.hashCode()) * 1000003;
                Integer num = this.totalFees;
                int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.currency;
                this.$hashCode = iHashCode2 ^ (str != null ? str.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsQuery.ProductAccountBill.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ProductAccountBill.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ProductAccountBill.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ProductAccountBill.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ProductAccountBill.this.productId);
                    responseWriter.writeInt(responseFieldArr[3], ProductAccountBill.this.totalFees);
                    responseWriter.writeString(responseFieldArr[4], ProductAccountBill.this.currency);
                }
            };
        }

        public String productId() {
            return this.productId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ProductAccountBill{__typename=" + this.__typename + ", accountId=" + this.accountId + ", productId=" + this.productId + ", totalFees=" + this.totalFees + ", currency=" + this.currency + "}";
            }
            return this.$toString;
        }

        public Integer totalFees() {
            return this.totalFees;
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsQuery.Variables.1
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

    public GetProductAccountBillsQuery(String str) {
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
        return "bfea952adf9a0611bc6d8bb5bb1f5162fce50cd388263e11cb003470ae48c734";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetProductAccountBills($id: ID!) {\n  getProductAccountBills(id: $id) {\n    __typename\n    id\n    accountId\n    productAccountId\n    productPlanId\n    productAccountBills {\n      __typename\n      accountId\n      productId\n      totalFees\n      currency\n    }\n    totalFees\n    currency\n    billStatus\n    billGeneratedFrom\n    billGeneratedTo\n    createdAt\n    updatedAt\n  }\n}";
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
