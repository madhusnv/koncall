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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.SearchableCustomValueFilterInput;
import type.SearchableCustomValueSortInput;

/* loaded from: classes4.dex */
public final class SearchCustomValuesQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchCustomValues($filter: SearchableCustomValueFilterInput, $sort: SearchableCustomValueSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCustomValues(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      propertyDefinitionId\n      accountId\n      parentObjectId\n      parentObjectType\n      value\n      createSourceId\n      createSourceType\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchCustomValuesQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchCustomValues";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchCustomValues($filter: SearchableCustomValueFilterInput, $sort: SearchableCustomValueSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCustomValues(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      propertyDefinitionId\n      accountId\n      parentObjectId\n      parentObjectType\n      value\n      createSourceId\n      createSourceType\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableCustomValueFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableCustomValueSortInput sort;

        public SearchCustomValuesQuery build() {
            return new SearchCustomValuesQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableCustomValueFilterInput searchableCustomValueFilterInput) {
            this.filter = searchableCustomValueFilterInput;
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

        public Builder sort(SearchableCustomValueSortInput searchableCustomValueSortInput) {
            this.sort = searchableCustomValueSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchCustomValues", "searchCustomValues", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchCustomValues searchCustomValues;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchCustomValues.Mapper searchCustomValuesFieldMapper = new SearchCustomValues.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchCustomValues) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchCustomValues>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCustomValuesQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchCustomValues read(ResponseReader responseReader2) {
                        return Mapper.this.searchCustomValuesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchCustomValues searchCustomValues) {
            this.searchCustomValues = searchCustomValues;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchCustomValues searchCustomValues = this.searchCustomValues;
            SearchCustomValues searchCustomValues2 = ((Data) obj).searchCustomValues;
            return searchCustomValues == null ? searchCustomValues2 == null : searchCustomValues.equals(searchCustomValues2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchCustomValues searchCustomValues = this.searchCustomValues;
                this.$hashCode = (searchCustomValues == null ? 0 : searchCustomValues.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCustomValuesQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchCustomValues searchCustomValues = Data.this.searchCustomValues;
                    responseWriter.writeObject(responseField, searchCustomValues != null ? searchCustomValues.marshaller() : null);
                }
            };
        }

        public SearchCustomValues searchCustomValues() {
            return this.searchCustomValues;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchCustomValues=" + this.searchCustomValues + "}";
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
        final String createSourceId;
        final String createSourceType;
        final String createdAt;
        final String parentObjectId;
        final String parentObjectType;
        final String propertyDefinitionId;
        final String updatedAt;
        final String value;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("propertyDefinitionId", "propertyDefinitionId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("parentObjectId", "parentObjectId", null, false, customType, Collections.emptyList()), ResponseField.forString("parentObjectType", "parentObjectType", null, true, Collections.emptyList()), ResponseField.forString("value", "value", null, false, Collections.emptyList()), ResponseField.forCustomType("createSourceId", "createSourceId", null, true, customType, Collections.emptyList()), ResponseField.forString("createSourceType", "createSourceType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.propertyDefinitionId = (String) Utils.checkNotNull(str2, "propertyDefinitionId == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.parentObjectId = (String) Utils.checkNotNull(str4, "parentObjectId == null");
            this.parentObjectType = str5;
            this.value = (String) Utils.checkNotNull(str6, "value == null");
            this.createSourceId = str7;
            this.createSourceType = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createSourceId() {
            return this.createSourceId;
        }

        public String createSourceType() {
            return this.createSourceType;
        }

        public String createdAt() {
            return this.createdAt;
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
            if (this.__typename.equals(item.__typename) && this.propertyDefinitionId.equals(item.propertyDefinitionId) && this.accountId.equals(item.accountId) && this.parentObjectId.equals(item.parentObjectId) && ((str = this.parentObjectType) != null ? str.equals(item.parentObjectType) : item.parentObjectType == null) && this.value.equals(item.value) && ((str2 = this.createSourceId) != null ? str2.equals(item.createSourceId) : item.createSourceId == null) && ((str3 = this.createSourceType) != null ? str3.equals(item.createSourceType) : item.createSourceType == null) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null)) {
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
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.propertyDefinitionId.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.parentObjectId.hashCode()) * 1000003;
                String str = this.parentObjectType;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.value.hashCode()) * 1000003;
                String str2 = this.createSourceId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.createSourceType;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCustomValuesQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.propertyDefinitionId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.parentObjectId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.parentObjectType);
                    responseWriter.writeString(responseFieldArr[5], Item.this.value);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.createSourceId);
                    responseWriter.writeString(responseFieldArr[7], Item.this.createSourceType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.updatedAt);
                }
            };
        }

        public String parentObjectId() {
            return this.parentObjectId;
        }

        public String parentObjectType() {
            return this.parentObjectType;
        }

        public String propertyDefinitionId() {
            return this.propertyDefinitionId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", propertyDefinitionId=" + this.propertyDefinitionId + ", accountId=" + this.accountId + ", parentObjectId=" + this.parentObjectId + ", parentObjectType=" + this.parentObjectType + ", value=" + this.value + ", createSourceId=" + this.createSourceId + ", createSourceType=" + this.createSourceType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String value() {
            return this.value;
        }
    }

    public static class SearchCustomValues {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchCustomValues> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchCustomValues map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchCustomValues.$responseFields;
                return new SearchCustomValues(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCustomValuesQuery.SearchCustomValues.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCustomValuesQuery.SearchCustomValues.Mapper.1.1
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

        public SearchCustomValues(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchCustomValues)) {
                return false;
            }
            SearchCustomValues searchCustomValues = (SearchCustomValues) obj;
            if (this.__typename.equals(searchCustomValues.__typename) && this.items.equals(searchCustomValues.items) && ((str = this.nextToken) != null ? str.equals(searchCustomValues.nextToken) : searchCustomValues.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchCustomValues.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCustomValuesQuery.SearchCustomValues.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchCustomValues.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchCustomValues.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchCustomValues.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchCustomValuesQuery.SearchCustomValues.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchCustomValues.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchCustomValues.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchCustomValues{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableCustomValueFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableCustomValueSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableCustomValueFilterInput searchableCustomValueFilterInput, SearchableCustomValueSortInput searchableCustomValueSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableCustomValueFilterInput;
            this.sort = searchableCustomValueSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableCustomValueFilterInput);
            linkedHashMap.put("sort", searchableCustomValueSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableCustomValueFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCustomValuesQuery.Variables.1
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

        public SearchableCustomValueSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchCustomValuesQuery(SearchableCustomValueFilterInput searchableCustomValueFilterInput, SearchableCustomValueSortInput searchableCustomValueSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableCustomValueFilterInput, searchableCustomValueSortInput, num, str, num2);
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
        return "26a335217ee51a1acde8c0b333b28f6ebb70808db45a1dc3521fe77b2fcd4c61";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchCustomValues($filter: SearchableCustomValueFilterInput, $sort: SearchableCustomValueSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCustomValues(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      propertyDefinitionId\n      accountId\n      parentObjectId\n      parentObjectType\n      value\n      createSourceId\n      createSourceType\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
