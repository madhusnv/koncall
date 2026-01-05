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
import type.ModelDealTransitionFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes7.dex */
public final class GetTransitionsByLinkedDealQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetTransitionsByLinkedDeal($dealId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDealTransitionFilterInput, $limit: Int, $nextToken: String) {\n  getTransitionsByLinkedDeal(dealId: $dealId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      dealId\n      dealStage\n      previousDealStage\n      numberOfDaysToMakeTransition\n      engagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetTransitionsByLinkedDealQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetTransitionsByLinkedDeal";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetTransitionsByLinkedDeal($dealId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDealTransitionFilterInput, $limit: Int, $nextToken: String) {\n  getTransitionsByLinkedDeal(dealId: $dealId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      dealId\n      dealStage\n      previousDealStage\n      numberOfDaysToMakeTransition\n      engagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String dealId;
        private ModelDealTransitionFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private ModelStringKeyConditionInput updatedAt;

        public GetTransitionsByLinkedDealQuery build() {
            return new GetTransitionsByLinkedDealQuery(this.dealId, this.updatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder dealId(String str) {
            this.dealId = str;
            return this;
        }

        public Builder filter(ModelDealTransitionFilterInput modelDealTransitionFilterInput) {
            this.filter = modelDealTransitionFilterInput;
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

        public Builder updatedAt(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.updatedAt = modelStringKeyConditionInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getTransitionsByLinkedDeal", "getTransitionsByLinkedDeal", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("dealId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "dealId").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("updatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "updatedAt").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetTransitionsByLinkedDeal getTransitionsByLinkedDeal;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetTransitionsByLinkedDeal.Mapper getTransitionsByLinkedDealFieldMapper = new GetTransitionsByLinkedDeal.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetTransitionsByLinkedDeal) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetTransitionsByLinkedDeal>() { // from class: com.amazonaws.amplify.generated.graphql.GetTransitionsByLinkedDealQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetTransitionsByLinkedDeal read(ResponseReader responseReader2) {
                        return Mapper.this.getTransitionsByLinkedDealFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetTransitionsByLinkedDeal getTransitionsByLinkedDeal) {
            this.getTransitionsByLinkedDeal = getTransitionsByLinkedDeal;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetTransitionsByLinkedDeal getTransitionsByLinkedDeal = this.getTransitionsByLinkedDeal;
            GetTransitionsByLinkedDeal getTransitionsByLinkedDeal2 = ((Data) obj).getTransitionsByLinkedDeal;
            return getTransitionsByLinkedDeal == null ? getTransitionsByLinkedDeal2 == null : getTransitionsByLinkedDeal.equals(getTransitionsByLinkedDeal2);
        }

        public GetTransitionsByLinkedDeal getTransitionsByLinkedDeal() {
            return this.getTransitionsByLinkedDeal;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetTransitionsByLinkedDeal getTransitionsByLinkedDeal = this.getTransitionsByLinkedDeal;
                this.$hashCode = (getTransitionsByLinkedDeal == null ? 0 : getTransitionsByLinkedDeal.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetTransitionsByLinkedDealQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetTransitionsByLinkedDeal getTransitionsByLinkedDeal = Data.this.getTransitionsByLinkedDeal;
                    responseWriter.writeObject(responseField, getTransitionsByLinkedDeal != null ? getTransitionsByLinkedDeal.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getTransitionsByLinkedDeal=" + this.getTransitionsByLinkedDeal + "}";
            }
            return this.$toString;
        }
    }

    public static class GetTransitionsByLinkedDeal {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetTransitionsByLinkedDeal> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetTransitionsByLinkedDeal map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetTransitionsByLinkedDeal.$responseFields;
                return new GetTransitionsByLinkedDeal(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetTransitionsByLinkedDealQuery.GetTransitionsByLinkedDeal.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetTransitionsByLinkedDealQuery.GetTransitionsByLinkedDeal.Mapper.1.1
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

        public GetTransitionsByLinkedDeal(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetTransitionsByLinkedDeal)) {
                return false;
            }
            GetTransitionsByLinkedDeal getTransitionsByLinkedDeal = (GetTransitionsByLinkedDeal) obj;
            if (this.__typename.equals(getTransitionsByLinkedDeal.__typename) && this.items.equals(getTransitionsByLinkedDeal.items)) {
                String str = this.nextToken;
                String str2 = getTransitionsByLinkedDeal.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetTransitionsByLinkedDealQuery.GetTransitionsByLinkedDeal.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetTransitionsByLinkedDeal.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetTransitionsByLinkedDeal.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetTransitionsByLinkedDeal.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetTransitionsByLinkedDealQuery.GetTransitionsByLinkedDeal.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetTransitionsByLinkedDeal.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetTransitionsByLinkedDeal{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String createdAt;
        final String dealId;
        final String dealStage;
        final String engagementId;
        final String id;
        final Integer numberOfDaysToMakeTransition;
        final String previousDealStage;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("dealId", "dealId", null, false, customType, Collections.emptyList()), ResponseField.forString("dealStage", "dealStage", null, true, Collections.emptyList()), ResponseField.forString("previousDealStage", "previousDealStage", null, true, Collections.emptyList()), ResponseField.forInt("numberOfDaysToMakeTransition", "numberOfDaysToMakeTransition", null, true, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.dealId = (String) Utils.checkNotNull(str4, "dealId == null");
            this.dealStage = str5;
            this.previousDealStage = str6;
            this.numberOfDaysToMakeTransition = num;
            this.engagementId = str7;
            this.createdAt = str8;
            this.updatedAt = str9;
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

        public String dealId() {
            return this.dealId;
        }

        public String dealStage() {
            return this.dealStage;
        }

        public String engagementId() {
            return this.engagementId;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Integer num;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.dealId.equals(item.dealId) && ((str = this.dealStage) != null ? str.equals(item.dealStage) : item.dealStage == null) && ((str2 = this.previousDealStage) != null ? str2.equals(item.previousDealStage) : item.previousDealStage == null) && ((num = this.numberOfDaysToMakeTransition) != null ? num.equals(item.numberOfDaysToMakeTransition) : item.numberOfDaysToMakeTransition == null) && ((str3 = this.engagementId) != null ? str3.equals(item.engagementId) : item.engagementId == null) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null)) {
                String str5 = this.updatedAt;
                String str6 = item.updatedAt;
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
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.dealId.hashCode()) * 1000003;
                String str = this.dealStage;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.previousDealStage;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Integer num = this.numberOfDaysToMakeTransition;
                int iHashCode4 = (iHashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str3 = this.engagementId;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode6 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetTransitionsByLinkedDealQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.dealId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.dealStage);
                    responseWriter.writeString(responseFieldArr[5], Item.this.previousDealStage);
                    responseWriter.writeInt(responseFieldArr[6], Item.this.numberOfDaysToMakeTransition);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.engagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.updatedAt);
                }
            };
        }

        public Integer numberOfDaysToMakeTransition() {
            return this.numberOfDaysToMakeTransition;
        }

        public String previousDealStage() {
            return this.previousDealStage;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", dealId=" + this.dealId + ", dealStage=" + this.dealStage + ", previousDealStage=" + this.previousDealStage + ", numberOfDaysToMakeTransition=" + this.numberOfDaysToMakeTransition + ", engagementId=" + this.engagementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String dealId;
        private final ModelDealTransitionFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final ModelStringKeyConditionInput updatedAt;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelDealTransitionFilterInput modelDealTransitionFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.dealId = str;
            this.updatedAt = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelDealTransitionFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("dealId", str);
            linkedHashMap.put("updatedAt", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelDealTransitionFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String dealId() {
            return this.dealId;
        }

        public ModelDealTransitionFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetTransitionsByLinkedDealQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("dealId", Variables.this.dealId);
                    inputFieldWriter.writeObject("updatedAt", Variables.this.updatedAt != null ? Variables.this.updatedAt.marshaller() : null);
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

        public ModelStringKeyConditionInput updatedAt() {
            return this.updatedAt;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetTransitionsByLinkedDealQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelDealTransitionFilterInput modelDealTransitionFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelDealTransitionFilterInput, num, str2);
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
        return "d89218f79f91ddff8937d3061c2f515e8adff9cbd011f52488ad3b07234f28e0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetTransitionsByLinkedDeal($dealId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDealTransitionFilterInput, $limit: Int, $nextToken: String) {\n  getTransitionsByLinkedDeal(dealId: $dealId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      dealId\n      dealStage\n      previousDealStage\n      numberOfDaysToMakeTransition\n      engagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
