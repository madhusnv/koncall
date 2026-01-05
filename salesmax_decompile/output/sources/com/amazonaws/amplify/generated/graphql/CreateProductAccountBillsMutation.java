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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CreateProductAccountBillsInput;
import type.CustomType;
import type.ModelProductAccountBillsConditionInput;

/* loaded from: classes6.dex */
public final class CreateProductAccountBillsMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateProductAccountBills($input: CreateProductAccountBillsInput!, $condition: ModelProductAccountBillsConditionInput) {\n  createProductAccountBills(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    productAccountId\n    productPlanId\n    productAccountBills {\n      __typename\n      accountId\n      productId\n      totalFees\n      currency\n    }\n    totalFees\n    currency\n    billStatus\n    billGeneratedFrom\n    billGeneratedTo\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductAccountBillsMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateProductAccountBills";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateProductAccountBills($input: CreateProductAccountBillsInput!, $condition: ModelProductAccountBillsConditionInput) {\n  createProductAccountBills(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    productAccountId\n    productPlanId\n    productAccountBills {\n      __typename\n      accountId\n      productId\n      totalFees\n      currency\n    }\n    totalFees\n    currency\n    billStatus\n    billGeneratedFrom\n    billGeneratedTo\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelProductAccountBillsConditionInput condition;
        private CreateProductAccountBillsInput input;

        public CreateProductAccountBillsMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateProductAccountBillsMutation(this.input, this.condition);
        }

        public Builder condition(ModelProductAccountBillsConditionInput modelProductAccountBillsConditionInput) {
            this.condition = modelProductAccountBillsConditionInput;
            return this;
        }

        public Builder input(CreateProductAccountBillsInput createProductAccountBillsInput) {
            this.input = createProductAccountBillsInput;
            return this;
        }
    }

    public static class CreateProductAccountBills {
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

        public static final class Mapper implements ResponseFieldMapper<CreateProductAccountBills> {
            final ProductAccountBill.Mapper productAccountBillFieldMapper = new ProductAccountBill.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateProductAccountBills map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateProductAccountBills.$responseFields;
                return new CreateProductAccountBills(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<ProductAccountBill>() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductAccountBillsMutation.CreateProductAccountBills.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public ProductAccountBill read(ResponseReader.ListItemReader listItemReader) {
                        return (ProductAccountBill) listItemReader.readObject(new ResponseReader.ObjectReader<ProductAccountBill>() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductAccountBillsMutation.CreateProductAccountBills.Mapper.1.1
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

        public CreateProductAccountBills(String str, String str2, String str3, String str4, String str5, List<ProductAccountBill> list, Integer num, String str6, String str7, String str8, String str9, String str10, String str11) {
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
            if (!(obj instanceof CreateProductAccountBills)) {
                return false;
            }
            CreateProductAccountBills createProductAccountBills = (CreateProductAccountBills) obj;
            return this.__typename.equals(createProductAccountBills.__typename) && this.id.equals(createProductAccountBills.id) && this.accountId.equals(createProductAccountBills.accountId) && this.productAccountId.equals(createProductAccountBills.productAccountId) && this.productPlanId.equals(createProductAccountBills.productPlanId) && ((list = this.productAccountBills) != null ? list.equals(createProductAccountBills.productAccountBills) : createProductAccountBills.productAccountBills == null) && ((num = this.totalFees) != null ? num.equals(createProductAccountBills.totalFees) : createProductAccountBills.totalFees == null) && ((str = this.currency) != null ? str.equals(createProductAccountBills.currency) : createProductAccountBills.currency == null) && ((str2 = this.billStatus) != null ? str2.equals(createProductAccountBills.billStatus) : createProductAccountBills.billStatus == null) && ((str3 = this.billGeneratedFrom) != null ? str3.equals(createProductAccountBills.billGeneratedFrom) : createProductAccountBills.billGeneratedFrom == null) && ((str4 = this.billGeneratedTo) != null ? str4.equals(createProductAccountBills.billGeneratedTo) : createProductAccountBills.billGeneratedTo == null) && this.createdAt.equals(createProductAccountBills.createdAt) && this.updatedAt.equals(createProductAccountBills.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductAccountBillsMutation.CreateProductAccountBills.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateProductAccountBills.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateProductAccountBills.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateProductAccountBills.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateProductAccountBills.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateProductAccountBills.this.productAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], CreateProductAccountBills.this.productPlanId);
                    responseWriter.writeList(responseFieldArr[5], CreateProductAccountBills.this.productAccountBills, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductAccountBillsMutation.CreateProductAccountBills.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((ProductAccountBill) obj).marshaller());
                        }
                    });
                    responseWriter.writeInt(responseFieldArr[6], CreateProductAccountBills.this.totalFees);
                    responseWriter.writeString(responseFieldArr[7], CreateProductAccountBills.this.currency);
                    responseWriter.writeString(responseFieldArr[8], CreateProductAccountBills.this.billStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CreateProductAccountBills.this.billGeneratedFrom);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], CreateProductAccountBills.this.billGeneratedTo);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], CreateProductAccountBills.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CreateProductAccountBills.this.updatedAt);
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
                this.$toString = "CreateProductAccountBills{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", productAccountId=" + this.productAccountId + ", productPlanId=" + this.productPlanId + ", productAccountBills=" + this.productAccountBills + ", totalFees=" + this.totalFees + ", currency=" + this.currency + ", billStatus=" + this.billStatus + ", billGeneratedFrom=" + this.billGeneratedFrom + ", billGeneratedTo=" + this.billGeneratedTo + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createProductAccountBills", "createProductAccountBills", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateProductAccountBills createProductAccountBills;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateProductAccountBills.Mapper createProductAccountBillsFieldMapper = new CreateProductAccountBills.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateProductAccountBills) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateProductAccountBills>() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductAccountBillsMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateProductAccountBills read(ResponseReader responseReader2) {
                        return Mapper.this.createProductAccountBillsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateProductAccountBills createProductAccountBills) {
            this.createProductAccountBills = createProductAccountBills;
        }

        public CreateProductAccountBills createProductAccountBills() {
            return this.createProductAccountBills;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateProductAccountBills createProductAccountBills = this.createProductAccountBills;
            CreateProductAccountBills createProductAccountBills2 = ((Data) obj).createProductAccountBills;
            return createProductAccountBills == null ? createProductAccountBills2 == null : createProductAccountBills.equals(createProductAccountBills2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateProductAccountBills createProductAccountBills = this.createProductAccountBills;
                this.$hashCode = (createProductAccountBills == null ? 0 : createProductAccountBills.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductAccountBillsMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateProductAccountBills createProductAccountBills = Data.this.createProductAccountBills;
                    responseWriter.writeObject(responseField, createProductAccountBills != null ? createProductAccountBills.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createProductAccountBills=" + this.createProductAccountBills + "}";
            }
            return this.$toString;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductAccountBillsMutation.ProductAccountBill.1
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
        private final ModelProductAccountBillsConditionInput condition;
        private final CreateProductAccountBillsInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateProductAccountBillsInput createProductAccountBillsInput, ModelProductAccountBillsConditionInput modelProductAccountBillsConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createProductAccountBillsInput;
            this.condition = modelProductAccountBillsConditionInput;
            linkedHashMap.put("input", createProductAccountBillsInput);
            linkedHashMap.put("condition", modelProductAccountBillsConditionInput);
        }

        public ModelProductAccountBillsConditionInput condition() {
            return this.condition;
        }

        public CreateProductAccountBillsInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductAccountBillsMutation.Variables.1
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

    public CreateProductAccountBillsMutation(CreateProductAccountBillsInput createProductAccountBillsInput, ModelProductAccountBillsConditionInput modelProductAccountBillsConditionInput) {
        Utils.checkNotNull(createProductAccountBillsInput, "input == null");
        this.variables = new Variables(createProductAccountBillsInput, modelProductAccountBillsConditionInput);
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
        return "526494cd190b1e040a94899557ce14ede00d923b40a21de8834f52fb9fbe9a03";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateProductAccountBills($input: CreateProductAccountBillsInput!, $condition: ModelProductAccountBillsConditionInput) {\n  createProductAccountBills(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    productAccountId\n    productPlanId\n    productAccountBills {\n      __typename\n      accountId\n      productId\n      totalFees\n      currency\n    }\n    totalFees\n    currency\n    billStatus\n    billGeneratedFrom\n    billGeneratedTo\n    createdAt\n    updatedAt\n  }\n}";
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
