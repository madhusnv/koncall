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
import type.MissedOpportunityType;
import type.SearchableMissedOpportunitiesFilterInput;
import type.SearchableMissedOpportunitiesSortInput;

/* loaded from: classes4.dex */
public final class SearchMissedOpportunitiessQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchMissedOpportunitiess($filter: SearchableMissedOpportunitiesFilterInput, $sort: SearchableMissedOpportunitiesSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchMissedOpportunitiess(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      primaryTeamId\n      contactId\n      messageBody\n      missedOpportunityType\n      callLaterDateTime\n      relatedEngagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchMissedOpportunitiess";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchMissedOpportunitiess($filter: SearchableMissedOpportunitiesFilterInput, $sort: SearchableMissedOpportunitiesSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchMissedOpportunitiess(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      primaryTeamId\n      contactId\n      messageBody\n      missedOpportunityType\n      callLaterDateTime\n      relatedEngagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableMissedOpportunitiesFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableMissedOpportunitiesSortInput sort;

        public SearchMissedOpportunitiessQuery build() {
            return new SearchMissedOpportunitiessQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableMissedOpportunitiesFilterInput searchableMissedOpportunitiesFilterInput) {
            this.filter = searchableMissedOpportunitiesFilterInput;
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

        public Builder sort(SearchableMissedOpportunitiesSortInput searchableMissedOpportunitiesSortInput) {
            this.sort = searchableMissedOpportunitiesSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchMissedOpportunitiess", "searchMissedOpportunitiess", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchMissedOpportunitiess searchMissedOpportunitiess;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchMissedOpportunitiess.Mapper searchMissedOpportunitiessFieldMapper = new SearchMissedOpportunitiess.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchMissedOpportunitiess) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchMissedOpportunitiess>() { // from class: com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchMissedOpportunitiess read(ResponseReader responseReader2) {
                        return Mapper.this.searchMissedOpportunitiessFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchMissedOpportunitiess searchMissedOpportunitiess) {
            this.searchMissedOpportunitiess = searchMissedOpportunitiess;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchMissedOpportunitiess searchMissedOpportunitiess = this.searchMissedOpportunitiess;
            SearchMissedOpportunitiess searchMissedOpportunitiess2 = ((Data) obj).searchMissedOpportunitiess;
            return searchMissedOpportunitiess == null ? searchMissedOpportunitiess2 == null : searchMissedOpportunitiess.equals(searchMissedOpportunitiess2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchMissedOpportunitiess searchMissedOpportunitiess = this.searchMissedOpportunitiess;
                this.$hashCode = (searchMissedOpportunitiess == null ? 0 : searchMissedOpportunitiess.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchMissedOpportunitiess searchMissedOpportunitiess = Data.this.searchMissedOpportunitiess;
                    responseWriter.writeObject(responseField, searchMissedOpportunitiess != null ? searchMissedOpportunitiess.marshaller() : null);
                }
            };
        }

        public SearchMissedOpportunitiess searchMissedOpportunitiess() {
            return this.searchMissedOpportunitiess;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchMissedOpportunitiess=" + this.searchMissedOpportunitiess + "}";
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
        final String callLaterDateTime;
        final String contactId;
        final String createdAt;
        final String messageBody;
        final MissedOpportunityType missedOpportunityType;
        final String ownerId;
        final String primaryTeamId;
        final String relatedEngagementId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]);
                String string2 = responseReader.readString(responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                return new Item(string, str, str2, str3, str4, string2, string3 != null ? MissedOpportunityType.valueOf(string3) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, false, customType, Collections.emptyList()), ResponseField.forString("messageBody", "messageBody", null, true, Collections.emptyList()), ResponseField.forString("missedOpportunityType", "missedOpportunityType", null, false, Collections.emptyList()), ResponseField.forCustomType("callLaterDateTime", "callLaterDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("relatedEngagementId", "relatedEngagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, MissedOpportunityType missedOpportunityType, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.ownerId = (String) Utils.checkNotNull(str3, "ownerId == null");
            this.primaryTeamId = str4;
            this.contactId = (String) Utils.checkNotNull(str5, "contactId == null");
            this.messageBody = str6;
            this.missedOpportunityType = (MissedOpportunityType) Utils.checkNotNull(missedOpportunityType, "missedOpportunityType == null");
            this.callLaterDateTime = str7;
            this.relatedEngagementId = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String callLaterDateTime() {
            return this.callLaterDateTime;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.accountId.equals(item.accountId) && this.ownerId.equals(item.ownerId) && ((str = this.primaryTeamId) != null ? str.equals(item.primaryTeamId) : item.primaryTeamId == null) && this.contactId.equals(item.contactId) && ((str2 = this.messageBody) != null ? str2.equals(item.messageBody) : item.messageBody == null) && this.missedOpportunityType.equals(item.missedOpportunityType) && ((str3 = this.callLaterDateTime) != null ? str3.equals(item.callLaterDateTime) : item.callLaterDateTime == null) && ((str4 = this.relatedEngagementId) != null ? str4.equals(item.relatedEngagementId) : item.relatedEngagementId == null) && ((str5 = this.createdAt) != null ? str5.equals(item.createdAt) : item.createdAt == null)) {
                String str6 = this.updatedAt;
                String str7 = item.updatedAt;
                if (str6 == null) {
                    if (str7 == null) {
                        return true;
                    }
                } else if (str6.equals(str7)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str = this.primaryTeamId;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.contactId.hashCode()) * 1000003;
                String str2 = this.messageBody;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.missedOpportunityType.hashCode()) * 1000003;
                String str3 = this.callLaterDateTime;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.relatedEngagementId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.updatedAt;
                this.$hashCode = iHashCode6 ^ (str6 != null ? str6.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.contactId);
                    responseWriter.writeString(responseFieldArr[5], Item.this.messageBody);
                    responseWriter.writeString(responseFieldArr[6], Item.this.missedOpportunityType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.callLaterDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.relatedEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.updatedAt);
                }
            };
        }

        public String messageBody() {
            return this.messageBody;
        }

        public MissedOpportunityType missedOpportunityType() {
            return this.missedOpportunityType;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String relatedEngagementId() {
            return this.relatedEngagementId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", contactId=" + this.contactId + ", messageBody=" + this.messageBody + ", missedOpportunityType=" + this.missedOpportunityType + ", callLaterDateTime=" + this.callLaterDateTime + ", relatedEngagementId=" + this.relatedEngagementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class SearchMissedOpportunitiess {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchMissedOpportunitiess> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchMissedOpportunitiess map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchMissedOpportunitiess.$responseFields;
                return new SearchMissedOpportunitiess(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery.SearchMissedOpportunitiess.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery.SearchMissedOpportunitiess.Mapper.1.1
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

        public SearchMissedOpportunitiess(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchMissedOpportunitiess)) {
                return false;
            }
            SearchMissedOpportunitiess searchMissedOpportunitiess = (SearchMissedOpportunitiess) obj;
            if (this.__typename.equals(searchMissedOpportunitiess.__typename) && this.items.equals(searchMissedOpportunitiess.items) && ((str = this.nextToken) != null ? str.equals(searchMissedOpportunitiess.nextToken) : searchMissedOpportunitiess.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchMissedOpportunitiess.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery.SearchMissedOpportunitiess.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchMissedOpportunitiess.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchMissedOpportunitiess.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchMissedOpportunitiess.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery.SearchMissedOpportunitiess.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchMissedOpportunitiess.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchMissedOpportunitiess.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchMissedOpportunitiess{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableMissedOpportunitiesFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableMissedOpportunitiesSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableMissedOpportunitiesFilterInput searchableMissedOpportunitiesFilterInput, SearchableMissedOpportunitiesSortInput searchableMissedOpportunitiesSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableMissedOpportunitiesFilterInput;
            this.sort = searchableMissedOpportunitiesSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableMissedOpportunitiesFilterInput);
            linkedHashMap.put("sort", searchableMissedOpportunitiesSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableMissedOpportunitiesFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery.Variables.1
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

        public SearchableMissedOpportunitiesSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchMissedOpportunitiessQuery(SearchableMissedOpportunitiesFilterInput searchableMissedOpportunitiesFilterInput, SearchableMissedOpportunitiesSortInput searchableMissedOpportunitiesSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableMissedOpportunitiesFilterInput, searchableMissedOpportunitiesSortInput, num, str, num2);
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
        return "e3a384019fcd1f62e3eb54d9c688c1f53fd79c4a59873cdcfd9bb4ea8170c68a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchMissedOpportunitiess($filter: SearchableMissedOpportunitiesFilterInput, $sort: SearchableMissedOpportunitiesSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchMissedOpportunitiess(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      primaryTeamId\n      contactId\n      messageBody\n      missedOpportunityType\n      callLaterDateTime\n      relatedEngagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
