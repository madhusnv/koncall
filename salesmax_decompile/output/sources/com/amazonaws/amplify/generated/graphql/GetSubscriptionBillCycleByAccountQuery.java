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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelAccountSubscriptionBillCycleFilterInput;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetSubscriptionBillCycleByAccountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetSubscriptionBillCycleByAccount($accountId: ID, $productAccountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelAccountSubscriptionBillCycleFilterInput, $limit: Int, $nextToken: String) {\n  getSubscriptionBillCycleByAccount(accountId: $accountId, productAccountId: $productAccountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      productAccountId\n      accountId\n      addedById\n      period\n      lastBillDate\n      nextBillDate\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetSubscriptionBillCycleByAccountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetSubscriptionBillCycleByAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetSubscriptionBillCycleByAccount($accountId: ID, $productAccountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelAccountSubscriptionBillCycleFilterInput, $limit: Int, $nextToken: String) {\n  getSubscriptionBillCycleByAccount(accountId: $accountId, productAccountId: $productAccountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      productAccountId\n      accountId\n      addedById\n      period\n      lastBillDate\n      nextBillDate\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelAccountSubscriptionBillCycleFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelIDKeyConditionInput productAccountId;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetSubscriptionBillCycleByAccountQuery build() {
            return new GetSubscriptionBillCycleByAccountQuery(this.accountId, this.productAccountId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelAccountSubscriptionBillCycleFilterInput modelAccountSubscriptionBillCycleFilterInput) {
            this.filter = modelAccountSubscriptionBillCycleFilterInput;
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

        public Builder productAccountId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.productAccountId = modelIDKeyConditionInput;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getSubscriptionBillCycleByAccount", "getSubscriptionBillCycleByAccount", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("productAccountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "productAccountId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetSubscriptionBillCycleByAccount getSubscriptionBillCycleByAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetSubscriptionBillCycleByAccount.Mapper getSubscriptionBillCycleByAccountFieldMapper = new GetSubscriptionBillCycleByAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetSubscriptionBillCycleByAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetSubscriptionBillCycleByAccount>() { // from class: com.amazonaws.amplify.generated.graphql.GetSubscriptionBillCycleByAccountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetSubscriptionBillCycleByAccount read(ResponseReader responseReader2) {
                        return Mapper.this.getSubscriptionBillCycleByAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetSubscriptionBillCycleByAccount getSubscriptionBillCycleByAccount) {
            this.getSubscriptionBillCycleByAccount = getSubscriptionBillCycleByAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetSubscriptionBillCycleByAccount getSubscriptionBillCycleByAccount = this.getSubscriptionBillCycleByAccount;
            GetSubscriptionBillCycleByAccount getSubscriptionBillCycleByAccount2 = ((Data) obj).getSubscriptionBillCycleByAccount;
            return getSubscriptionBillCycleByAccount == null ? getSubscriptionBillCycleByAccount2 == null : getSubscriptionBillCycleByAccount.equals(getSubscriptionBillCycleByAccount2);
        }

        public GetSubscriptionBillCycleByAccount getSubscriptionBillCycleByAccount() {
            return this.getSubscriptionBillCycleByAccount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetSubscriptionBillCycleByAccount getSubscriptionBillCycleByAccount = this.getSubscriptionBillCycleByAccount;
                this.$hashCode = (getSubscriptionBillCycleByAccount == null ? 0 : getSubscriptionBillCycleByAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSubscriptionBillCycleByAccountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetSubscriptionBillCycleByAccount getSubscriptionBillCycleByAccount = Data.this.getSubscriptionBillCycleByAccount;
                    responseWriter.writeObject(responseField, getSubscriptionBillCycleByAccount != null ? getSubscriptionBillCycleByAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getSubscriptionBillCycleByAccount=" + this.getSubscriptionBillCycleByAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class GetSubscriptionBillCycleByAccount {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetSubscriptionBillCycleByAccount> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetSubscriptionBillCycleByAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetSubscriptionBillCycleByAccount.$responseFields;
                return new GetSubscriptionBillCycleByAccount(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetSubscriptionBillCycleByAccountQuery.GetSubscriptionBillCycleByAccount.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetSubscriptionBillCycleByAccountQuery.GetSubscriptionBillCycleByAccount.Mapper.1.1
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

        public GetSubscriptionBillCycleByAccount(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetSubscriptionBillCycleByAccount)) {
                return false;
            }
            GetSubscriptionBillCycleByAccount getSubscriptionBillCycleByAccount = (GetSubscriptionBillCycleByAccount) obj;
            if (this.__typename.equals(getSubscriptionBillCycleByAccount.__typename) && this.items.equals(getSubscriptionBillCycleByAccount.items)) {
                String str = this.nextToken;
                String str2 = getSubscriptionBillCycleByAccount.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSubscriptionBillCycleByAccountQuery.GetSubscriptionBillCycleByAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetSubscriptionBillCycleByAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetSubscriptionBillCycleByAccount.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetSubscriptionBillCycleByAccount.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetSubscriptionBillCycleByAccountQuery.GetSubscriptionBillCycleByAccount.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetSubscriptionBillCycleByAccount.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetSubscriptionBillCycleByAccount{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String addedById;
        final String createdAt;
        final String id;
        final String lastBillDate;
        final String nextBillDate;
        final String period;
        final String productAccountId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productAccountId", "productAccountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, false, customType, Collections.emptyList()), ResponseField.forString("period", "period", null, true, Collections.emptyList()), ResponseField.forCustomType("lastBillDate", "lastBillDate", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("nextBillDate", "nextBillDate", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.productAccountId = (String) Utils.checkNotNull(str3, "productAccountId == null");
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.addedById = (String) Utils.checkNotNull(str5, "addedById == null");
            this.period = str6;
            this.lastBillDate = (String) Utils.checkNotNull(str7, "lastBillDate == null");
            this.nextBillDate = (String) Utils.checkNotNull(str8, "nextBillDate == null");
            this.createdAt = (String) Utils.checkNotNull(str9, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str10, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String addedById() {
            return this.addedById;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.productAccountId.equals(item.productAccountId) && this.accountId.equals(item.accountId) && this.addedById.equals(item.addedById) && ((str = this.period) != null ? str.equals(item.period) : item.period == null) && this.lastBillDate.equals(item.lastBillDate) && this.nextBillDate.equals(item.nextBillDate) && this.createdAt.equals(item.createdAt) && this.updatedAt.equals(item.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.productAccountId.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.addedById.hashCode()) * 1000003;
                String str = this.period;
                this.$hashCode = ((((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.lastBillDate.hashCode()) * 1000003) ^ this.nextBillDate.hashCode()) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastBillDate() {
            return this.lastBillDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSubscriptionBillCycleByAccountQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.productAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.addedById);
                    responseWriter.writeString(responseFieldArr[5], Item.this.period);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.lastBillDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.nextBillDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.updatedAt);
                }
            };
        }

        public String nextBillDate() {
            return this.nextBillDate;
        }

        public String period() {
            return this.period;
        }

        public String productAccountId() {
            return this.productAccountId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", productAccountId=" + this.productAccountId + ", accountId=" + this.accountId + ", addedById=" + this.addedById + ", period=" + this.period + ", lastBillDate=" + this.lastBillDate + ", nextBillDate=" + this.nextBillDate + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelAccountSubscriptionBillCycleFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelIDKeyConditionInput productAccountId;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelAccountSubscriptionBillCycleFilterInput modelAccountSubscriptionBillCycleFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.productAccountId = modelIDKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelAccountSubscriptionBillCycleFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("productAccountId", modelIDKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelAccountSubscriptionBillCycleFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelAccountSubscriptionBillCycleFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSubscriptionBillCycleByAccountQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("productAccountId", Variables.this.productAccountId != null ? Variables.this.productAccountId.marshaller() : null);
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

        public ModelIDKeyConditionInput productAccountId() {
            return this.productAccountId;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetSubscriptionBillCycleByAccountQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelAccountSubscriptionBillCycleFilterInput modelAccountSubscriptionBillCycleFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelSortDirection, modelAccountSubscriptionBillCycleFilterInput, num, str2);
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
        return "96d37a58727deac001b5a2fafddfd3a0c17eba03492da43eb5cb9790fe5efed6";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetSubscriptionBillCycleByAccount($accountId: ID, $productAccountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelAccountSubscriptionBillCycleFilterInput, $limit: Int, $nextToken: String) {\n  getSubscriptionBillCycleByAccount(accountId: $accountId, productAccountId: $productAccountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      productAccountId\n      accountId\n      addedById\n      period\n      lastBillDate\n      nextBillDate\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
