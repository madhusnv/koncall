package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
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
import type.ModelProductAccountBillsByAccountCompositeKeyConditionInput;
import type.ModelProductAccountBillsFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetProductAccountBillsByAccountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetProductAccountBillsByAccount($accountId: ID, $billStatusUpdatedAt: ModelProductAccountBillsByAccountCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelProductAccountBillsFilterInput, $limit: Int, $nextToken: String) {\n  getProductAccountBillsByAccount(accountId: $accountId, billStatusUpdatedAt: $billStatusUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      productAccountId\n      productPlanId\n      totalFees\n      currency\n      billStatus\n      billGeneratedFrom\n      billGeneratedTo\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsByAccountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetProductAccountBillsByAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetProductAccountBillsByAccount($accountId: ID, $billStatusUpdatedAt: ModelProductAccountBillsByAccountCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelProductAccountBillsFilterInput, $limit: Int, $nextToken: String) {\n  getProductAccountBillsByAccount(accountId: $accountId, billStatusUpdatedAt: $billStatusUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      productAccountId\n      productPlanId\n      totalFees\n      currency\n      billStatus\n      billGeneratedFrom\n      billGeneratedTo\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelProductAccountBillsByAccountCompositeKeyConditionInput billStatusUpdatedAt;
        private ModelProductAccountBillsFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder billStatusUpdatedAt(ModelProductAccountBillsByAccountCompositeKeyConditionInput modelProductAccountBillsByAccountCompositeKeyConditionInput) {
            this.billStatusUpdatedAt = modelProductAccountBillsByAccountCompositeKeyConditionInput;
            return this;
        }

        public GetProductAccountBillsByAccountQuery build() {
            return new GetProductAccountBillsByAccountQuery(this.accountId, this.billStatusUpdatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelProductAccountBillsFilterInput modelProductAccountBillsFilterInput) {
            this.filter = modelProductAccountBillsFilterInput;
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getProductAccountBillsByAccount", "getProductAccountBillsByAccount", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("billStatusUpdatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "billStatusUpdatedAt").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetProductAccountBillsByAccount getProductAccountBillsByAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetProductAccountBillsByAccount.Mapper getProductAccountBillsByAccountFieldMapper = new GetProductAccountBillsByAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetProductAccountBillsByAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetProductAccountBillsByAccount>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsByAccountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetProductAccountBillsByAccount read(ResponseReader responseReader2) {
                        return Mapper.this.getProductAccountBillsByAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetProductAccountBillsByAccount getProductAccountBillsByAccount) {
            this.getProductAccountBillsByAccount = getProductAccountBillsByAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetProductAccountBillsByAccount getProductAccountBillsByAccount = this.getProductAccountBillsByAccount;
            GetProductAccountBillsByAccount getProductAccountBillsByAccount2 = ((Data) obj).getProductAccountBillsByAccount;
            return getProductAccountBillsByAccount == null ? getProductAccountBillsByAccount2 == null : getProductAccountBillsByAccount.equals(getProductAccountBillsByAccount2);
        }

        public GetProductAccountBillsByAccount getProductAccountBillsByAccount() {
            return this.getProductAccountBillsByAccount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetProductAccountBillsByAccount getProductAccountBillsByAccount = this.getProductAccountBillsByAccount;
                this.$hashCode = (getProductAccountBillsByAccount == null ? 0 : getProductAccountBillsByAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsByAccountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetProductAccountBillsByAccount getProductAccountBillsByAccount = Data.this.getProductAccountBillsByAccount;
                    responseWriter.writeObject(responseField, getProductAccountBillsByAccount != null ? getProductAccountBillsByAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getProductAccountBillsByAccount=" + this.getProductAccountBillsByAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class GetProductAccountBillsByAccount {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetProductAccountBillsByAccount> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetProductAccountBillsByAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetProductAccountBillsByAccount.$responseFields;
                return new GetProductAccountBillsByAccount(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsByAccountQuery.GetProductAccountBillsByAccount.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsByAccountQuery.GetProductAccountBillsByAccount.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]));
            }
        }

        public GetProductAccountBillsByAccount(String str, List<Item> list, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = (List) Utils.checkNotNull(list, "items == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetProductAccountBillsByAccount)) {
                return false;
            }
            GetProductAccountBillsByAccount getProductAccountBillsByAccount = (GetProductAccountBillsByAccount) obj;
            if (this.__typename.equals(getProductAccountBillsByAccount.__typename) && this.items.equals(getProductAccountBillsByAccount.items)) {
                String str = this.nextToken;
                String str2 = getProductAccountBillsByAccount.nextToken;
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
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.items.hashCode()) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsByAccountQuery.GetProductAccountBillsByAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetProductAccountBillsByAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetProductAccountBillsByAccount.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetProductAccountBillsByAccount.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsByAccountQuery.GetProductAccountBillsByAccount.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetProductAccountBillsByAccount.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetProductAccountBillsByAccount{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Item {
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
        final String productAccountId;
        final String productPlanId;
        final Integer totalFees;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readInt(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productAccountId", "productAccountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productPlanId", "productPlanId", null, false, customType, Collections.emptyList()), ResponseField.forInt("totalFees", "totalFees", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forString("billStatus", "billStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("billGeneratedFrom", "billGeneratedFrom", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("billGeneratedTo", "billGeneratedTo", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.productAccountId = (String) Utils.checkNotNull(str4, "productAccountId == null");
            this.productPlanId = (String) Utils.checkNotNull(str5, "productPlanId == null");
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
            Integer num;
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.productAccountId.equals(item.productAccountId) && this.productPlanId.equals(item.productPlanId) && ((num = this.totalFees) != null ? num.equals(item.totalFees) : item.totalFees == null) && ((str = this.currency) != null ? str.equals(item.currency) : item.currency == null) && ((str2 = this.billStatus) != null ? str2.equals(item.billStatus) : item.billStatus == null) && ((str3 = this.billGeneratedFrom) != null ? str3.equals(item.billGeneratedFrom) : item.billGeneratedFrom == null) && ((str4 = this.billGeneratedTo) != null ? str4.equals(item.billGeneratedTo) : item.billGeneratedTo == null) && this.createdAt.equals(item.createdAt) && this.updatedAt.equals(item.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.productAccountId.hashCode()) * 1000003) ^ this.productPlanId.hashCode()) * 1000003;
                Integer num = this.totalFees;
                int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.currency;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.billStatus;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.billGeneratedFrom;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.billGeneratedTo;
                this.$hashCode = ((((iHashCode5 ^ (str4 != null ? str4.hashCode() : 0)) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsByAccountQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.productAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.productPlanId);
                    responseWriter.writeInt(responseFieldArr[5], Item.this.totalFees);
                    responseWriter.writeString(responseFieldArr[6], Item.this.currency);
                    responseWriter.writeString(responseFieldArr[7], Item.this.billStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.billGeneratedFrom);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.billGeneratedTo);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.updatedAt);
                }
            };
        }

        public String productAccountId() {
            return this.productAccountId;
        }

        public String productPlanId() {
            return this.productPlanId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", productAccountId=" + this.productAccountId + ", productPlanId=" + this.productPlanId + ", totalFees=" + this.totalFees + ", currency=" + this.currency + ", billStatus=" + this.billStatus + ", billGeneratedFrom=" + this.billGeneratedFrom + ", billGeneratedTo=" + this.billGeneratedTo + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelProductAccountBillsByAccountCompositeKeyConditionInput billStatusUpdatedAt;
        private final ModelProductAccountBillsFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelProductAccountBillsByAccountCompositeKeyConditionInput modelProductAccountBillsByAccountCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelProductAccountBillsFilterInput modelProductAccountBillsFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.billStatusUpdatedAt = modelProductAccountBillsByAccountCompositeKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelProductAccountBillsFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("billStatusUpdatedAt", modelProductAccountBillsByAccountCompositeKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelProductAccountBillsFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelProductAccountBillsByAccountCompositeKeyConditionInput billStatusUpdatedAt() {
            return this.billStatusUpdatedAt;
        }

        public ModelProductAccountBillsFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductAccountBillsByAccountQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("billStatusUpdatedAt", Variables.this.billStatusUpdatedAt != null ? Variables.this.billStatusUpdatedAt.marshaller() : null);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetProductAccountBillsByAccountQuery(String str, ModelProductAccountBillsByAccountCompositeKeyConditionInput modelProductAccountBillsByAccountCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelProductAccountBillsFilterInput modelProductAccountBillsFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelProductAccountBillsByAccountCompositeKeyConditionInput, modelSortDirection, modelProductAccountBillsFilterInput, num, str2);
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
        return "3bc2d4917725a5b09a8175caf0eb4b2478384fba417f3426a0e631f49ff88438";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetProductAccountBillsByAccount($accountId: ID, $billStatusUpdatedAt: ModelProductAccountBillsByAccountCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelProductAccountBillsFilterInput, $limit: Int, $nextToken: String) {\n  getProductAccountBillsByAccount(accountId: $accountId, billStatusUpdatedAt: $billStatusUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      productAccountId\n      productPlanId\n      totalFees\n      currency\n      billStatus\n      billGeneratedFrom\n      billGeneratedTo\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
