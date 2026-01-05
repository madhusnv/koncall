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
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.SearchableProductServiceAssociationFilterInput;
import type.SearchableProductServiceAssociationSortInput;

/* loaded from: classes4.dex */
public final class SearchProductServiceAssociationsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchProductServiceAssociations($filter: SearchableProductServiceAssociationFilterInput, $sort: SearchableProductServiceAssociationSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchProductServiceAssociations(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      productId\n      accountId\n      contactId\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServiceAssociationsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchProductServiceAssociations";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchProductServiceAssociations($filter: SearchableProductServiceAssociationFilterInput, $sort: SearchableProductServiceAssociationSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchProductServiceAssociations(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      productId\n      accountId\n      contactId\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableProductServiceAssociationFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableProductServiceAssociationSortInput sort;

        public SearchProductServiceAssociationsQuery build() {
            return new SearchProductServiceAssociationsQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableProductServiceAssociationFilterInput searchableProductServiceAssociationFilterInput) {
            this.filter = searchableProductServiceAssociationFilterInput;
            return this;
        }

        public Builder from(Integer num) {
            this.from = num;
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

        public Builder sort(SearchableProductServiceAssociationSortInput searchableProductServiceAssociationSortInput) {
            this.sort = searchableProductServiceAssociationSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchProductServiceAssociations", "searchProductServiceAssociations", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchProductServiceAssociations searchProductServiceAssociations;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchProductServiceAssociations.Mapper searchProductServiceAssociationsFieldMapper = new SearchProductServiceAssociations.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchProductServiceAssociations) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchProductServiceAssociations>() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServiceAssociationsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchProductServiceAssociations read(ResponseReader responseReader2) {
                        return Mapper.this.searchProductServiceAssociationsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchProductServiceAssociations searchProductServiceAssociations) {
            this.searchProductServiceAssociations = searchProductServiceAssociations;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchProductServiceAssociations searchProductServiceAssociations = this.searchProductServiceAssociations;
            SearchProductServiceAssociations searchProductServiceAssociations2 = ((Data) obj).searchProductServiceAssociations;
            return searchProductServiceAssociations == null ? searchProductServiceAssociations2 == null : searchProductServiceAssociations.equals(searchProductServiceAssociations2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchProductServiceAssociations searchProductServiceAssociations = this.searchProductServiceAssociations;
                this.$hashCode = (searchProductServiceAssociations == null ? 0 : searchProductServiceAssociations.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServiceAssociationsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchProductServiceAssociations searchProductServiceAssociations = Data.this.searchProductServiceAssociations;
                    responseWriter.writeObject(responseField, searchProductServiceAssociations != null ? searchProductServiceAssociations.marshaller() : null);
                }
            };
        }

        public SearchProductServiceAssociations searchProductServiceAssociations() {
            return this.searchProductServiceAssociations;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchProductServiceAssociations=" + this.searchProductServiceAssociations + "}";
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
        final String contactId;
        final String createdAt;
        final String createdById;
        final String id;
        final String productId;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
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
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.productId.equals(item.productId) && this.accountId.equals(item.accountId) && ((str = this.contactId) != null ? str.equals(item.contactId) : item.contactId == null) && ((str2 = this.createdAt) != null ? str2.equals(item.createdAt) : item.createdAt == null) && ((str3 = this.updatedAt) != null ? str3.equals(item.updatedAt) : item.updatedAt == null) && ((str4 = this.createdById) != null ? str4.equals(item.createdById) : item.createdById == null)) {
                String str5 = this.updatedById;
                String str6 = item.updatedById;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServiceAssociationsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.productId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.updatedById);
                }
            };
        }

        public String productId() {
            return this.productId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", productId=" + this.productId + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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

    public static class SearchProductServiceAssociations {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchProductServiceAssociations> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchProductServiceAssociations map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchProductServiceAssociations.$responseFields;
                return new SearchProductServiceAssociations(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServiceAssociationsQuery.SearchProductServiceAssociations.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServiceAssociationsQuery.SearchProductServiceAssociations.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]));
            }
        }

        public SearchProductServiceAssociations(String str, List<Item> list, String str2, Integer num) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = (List) Utils.checkNotNull(list, "items == null");
            this.nextToken = str2;
            this.total = num;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SearchProductServiceAssociations)) {
                return false;
            }
            SearchProductServiceAssociations searchProductServiceAssociations = (SearchProductServiceAssociations) obj;
            if (this.__typename.equals(searchProductServiceAssociations.__typename) && this.items.equals(searchProductServiceAssociations.items) && ((str = this.nextToken) != null ? str.equals(searchProductServiceAssociations.nextToken) : searchProductServiceAssociations.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchProductServiceAssociations.total;
                if (num == null) {
                    if (num2 == null) {
                        return true;
                    }
                } else if (num.equals(num2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.items.hashCode()) * 1000003;
                String str = this.nextToken;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Integer num = this.total;
                this.$hashCode = iHashCode2 ^ (num != null ? num.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServiceAssociationsQuery.SearchProductServiceAssociations.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchProductServiceAssociations.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchProductServiceAssociations.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchProductServiceAssociations.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServiceAssociationsQuery.SearchProductServiceAssociations.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchProductServiceAssociations.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchProductServiceAssociations.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchProductServiceAssociations{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableProductServiceAssociationFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableProductServiceAssociationSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableProductServiceAssociationFilterInput searchableProductServiceAssociationFilterInput, SearchableProductServiceAssociationSortInput searchableProductServiceAssociationSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableProductServiceAssociationFilterInput;
            this.sort = searchableProductServiceAssociationSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableProductServiceAssociationFilterInput);
            linkedHashMap.put("sort", searchableProductServiceAssociationSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableProductServiceAssociationFilterInput filter() {
            return this.filter;
        }

        public Integer from() {
            return this.from;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServiceAssociationsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeObject("sort", Variables.this.sort != null ? Variables.this.sort.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                    inputFieldWriter.writeInt(Constants.MessagePayloadKeys.FROM, Variables.this.from);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public SearchableProductServiceAssociationSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchProductServiceAssociationsQuery(SearchableProductServiceAssociationFilterInput searchableProductServiceAssociationFilterInput, SearchableProductServiceAssociationSortInput searchableProductServiceAssociationSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableProductServiceAssociationFilterInput, searchableProductServiceAssociationSortInput, num, str, num2);
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
        return "091a893ceb15a4d97ef49ee38855c6e28330b95f9cbe61f62bb527e3de145011";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchProductServiceAssociations($filter: SearchableProductServiceAssociationFilterInput, $sort: SearchableProductServiceAssociationSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchProductServiceAssociations(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      productId\n      accountId\n      contactId\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n    total\n  }\n}";
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
