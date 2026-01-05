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
import type.SearchableSubmittedFormValueFilterInput;
import type.SearchableSubmittedFormValueSortInput;

/* loaded from: classes4.dex */
public final class SearchSubmittedFormValuesQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchSubmittedFormValues($filter: SearchableSubmittedFormValueFilterInput, $sort: SearchableSubmittedFormValueSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchSubmittedFormValues(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formId\n      value\n      extensionOfProperty\n      extensionOfObject\n      objectId\n      contactId\n      submittedBy\n      submittedByIdType\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchSubmittedFormValues";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchSubmittedFormValues($filter: SearchableSubmittedFormValueFilterInput, $sort: SearchableSubmittedFormValueSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchSubmittedFormValues(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formId\n      value\n      extensionOfProperty\n      extensionOfObject\n      objectId\n      contactId\n      submittedBy\n      submittedByIdType\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableSubmittedFormValueFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableSubmittedFormValueSortInput sort;

        public SearchSubmittedFormValuesQuery build() {
            return new SearchSubmittedFormValuesQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableSubmittedFormValueFilterInput searchableSubmittedFormValueFilterInput) {
            this.filter = searchableSubmittedFormValueFilterInput;
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

        public Builder sort(SearchableSubmittedFormValueSortInput searchableSubmittedFormValueSortInput) {
            this.sort = searchableSubmittedFormValueSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchSubmittedFormValues", "searchSubmittedFormValues", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchSubmittedFormValues searchSubmittedFormValues;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchSubmittedFormValues.Mapper searchSubmittedFormValuesFieldMapper = new SearchSubmittedFormValues.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchSubmittedFormValues) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchSubmittedFormValues>() { // from class: com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchSubmittedFormValues read(ResponseReader responseReader2) {
                        return Mapper.this.searchSubmittedFormValuesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchSubmittedFormValues searchSubmittedFormValues) {
            this.searchSubmittedFormValues = searchSubmittedFormValues;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchSubmittedFormValues searchSubmittedFormValues = this.searchSubmittedFormValues;
            SearchSubmittedFormValues searchSubmittedFormValues2 = ((Data) obj).searchSubmittedFormValues;
            return searchSubmittedFormValues == null ? searchSubmittedFormValues2 == null : searchSubmittedFormValues.equals(searchSubmittedFormValues2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchSubmittedFormValues searchSubmittedFormValues = this.searchSubmittedFormValues;
                this.$hashCode = (searchSubmittedFormValues == null ? 0 : searchSubmittedFormValues.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchSubmittedFormValues searchSubmittedFormValues = Data.this.searchSubmittedFormValues;
                    responseWriter.writeObject(responseField, searchSubmittedFormValues != null ? searchSubmittedFormValues.marshaller() : null);
                }
            };
        }

        public SearchSubmittedFormValues searchSubmittedFormValues() {
            return this.searchSubmittedFormValues;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchSubmittedFormValues=" + this.searchSubmittedFormValues + "}";
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
        final String extensionOfObject;
        final String extensionOfProperty;
        final String formId;
        final String id;
        final String objectId;
        final String submittedBy;
        final String submittedByIdType;
        final String updatedAt;
        final String value;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("formId", "formId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("value", "value", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("extensionOfProperty", "extensionOfProperty", null, true, Collections.emptyList()), ResponseField.forString("extensionOfObject", "extensionOfObject", null, true, Collections.emptyList()), ResponseField.forCustomType("objectId", "objectId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("submittedBy", "submittedBy", null, true, customType, Collections.emptyList()), ResponseField.forString("submittedByIdType", "submittedByIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.formId = (String) Utils.checkNotNull(str4, "formId == null");
            this.value = str5;
            this.extensionOfProperty = str6;
            this.extensionOfObject = str7;
            this.objectId = str8;
            this.contactId = str9;
            this.submittedBy = str10;
            this.submittedByIdType = str11;
            this.createdAt = str12;
            this.updatedAt = str13;
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

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.formId.equals(item.formId) && ((str = this.value) != null ? str.equals(item.value) : item.value == null) && ((str2 = this.extensionOfProperty) != null ? str2.equals(item.extensionOfProperty) : item.extensionOfProperty == null) && ((str3 = this.extensionOfObject) != null ? str3.equals(item.extensionOfObject) : item.extensionOfObject == null) && ((str4 = this.objectId) != null ? str4.equals(item.objectId) : item.objectId == null) && ((str5 = this.contactId) != null ? str5.equals(item.contactId) : item.contactId == null) && ((str6 = this.submittedBy) != null ? str6.equals(item.submittedBy) : item.submittedBy == null) && ((str7 = this.submittedByIdType) != null ? str7.equals(item.submittedByIdType) : item.submittedByIdType == null) && ((str8 = this.createdAt) != null ? str8.equals(item.createdAt) : item.createdAt == null)) {
                String str9 = this.updatedAt;
                String str10 = item.updatedAt;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
                    return true;
                }
            }
            return false;
        }

        public String extensionOfObject() {
            return this.extensionOfObject;
        }

        public String extensionOfProperty() {
            return this.extensionOfProperty;
        }

        public String formId() {
            return this.formId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.formId.hashCode()) * 1000003;
                String str = this.value;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.extensionOfProperty;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.extensionOfObject;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.objectId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.contactId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.submittedBy;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.submittedByIdType;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                this.$hashCode = iHashCode9 ^ (str9 != null ? str9.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.formId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.value);
                    responseWriter.writeString(responseFieldArr[5], Item.this.extensionOfProperty);
                    responseWriter.writeString(responseFieldArr[6], Item.this.extensionOfObject);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.objectId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.submittedBy);
                    responseWriter.writeString(responseFieldArr[10], Item.this.submittedByIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.updatedAt);
                }
            };
        }

        public String objectId() {
            return this.objectId;
        }

        public String submittedBy() {
            return this.submittedBy;
        }

        public String submittedByIdType() {
            return this.submittedByIdType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", formId=" + this.formId + ", value=" + this.value + ", extensionOfProperty=" + this.extensionOfProperty + ", extensionOfObject=" + this.extensionOfObject + ", objectId=" + this.objectId + ", contactId=" + this.contactId + ", submittedBy=" + this.submittedBy + ", submittedByIdType=" + this.submittedByIdType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class SearchSubmittedFormValues {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchSubmittedFormValues> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchSubmittedFormValues map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchSubmittedFormValues.$responseFields;
                return new SearchSubmittedFormValues(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery.SearchSubmittedFormValues.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery.SearchSubmittedFormValues.Mapper.1.1
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

        public SearchSubmittedFormValues(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchSubmittedFormValues)) {
                return false;
            }
            SearchSubmittedFormValues searchSubmittedFormValues = (SearchSubmittedFormValues) obj;
            if (this.__typename.equals(searchSubmittedFormValues.__typename) && this.items.equals(searchSubmittedFormValues.items) && ((str = this.nextToken) != null ? str.equals(searchSubmittedFormValues.nextToken) : searchSubmittedFormValues.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchSubmittedFormValues.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery.SearchSubmittedFormValues.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchSubmittedFormValues.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchSubmittedFormValues.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchSubmittedFormValues.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery.SearchSubmittedFormValues.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchSubmittedFormValues.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchSubmittedFormValues.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchSubmittedFormValues{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableSubmittedFormValueFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableSubmittedFormValueSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableSubmittedFormValueFilterInput searchableSubmittedFormValueFilterInput, SearchableSubmittedFormValueSortInput searchableSubmittedFormValueSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableSubmittedFormValueFilterInput;
            this.sort = searchableSubmittedFormValueSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableSubmittedFormValueFilterInput);
            linkedHashMap.put("sort", searchableSubmittedFormValueSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableSubmittedFormValueFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery.Variables.1
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

        public SearchableSubmittedFormValueSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchSubmittedFormValuesQuery(SearchableSubmittedFormValueFilterInput searchableSubmittedFormValueFilterInput, SearchableSubmittedFormValueSortInput searchableSubmittedFormValueSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableSubmittedFormValueFilterInput, searchableSubmittedFormValueSortInput, num, str, num2);
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
        return "b74785dfcc05ba4021cb09a139f302fc1d983366586803daf424f79c08ce0837";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchSubmittedFormValues($filter: SearchableSubmittedFormValueFilterInput, $sort: SearchableSubmittedFormValueSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchSubmittedFormValues(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formId\n      value\n      extensionOfProperty\n      extensionOfObject\n      objectId\n      contactId\n      submittedBy\n      submittedByIdType\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
