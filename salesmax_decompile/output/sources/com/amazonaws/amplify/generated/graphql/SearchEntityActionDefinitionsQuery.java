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
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.SearchableEntityActionDefinitionFilterInput;
import type.SearchableEntityActionDefinitionSortInput;

/* loaded from: classes4.dex */
public final class SearchEntityActionDefinitionsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchEntityActionDefinitions($filter: SearchableEntityActionDefinitionFilterInput, $sort: SearchableEntityActionDefinitionSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEntityActionDefinitions(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      action\n      target\n      subscriptionType\n      periodicFrequency\n      periodicFrequencyUnit\n      startDateTime\n      endDateTime\n      status\n      ownerId\n      createdAt\n      updatedAt\n      createdBy\n      updatedBy\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityActionDefinitionsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchEntityActionDefinitions";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchEntityActionDefinitions($filter: SearchableEntityActionDefinitionFilterInput, $sort: SearchableEntityActionDefinitionSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEntityActionDefinitions(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      action\n      target\n      subscriptionType\n      periodicFrequency\n      periodicFrequencyUnit\n      startDateTime\n      endDateTime\n      status\n      ownerId\n      createdAt\n      updatedAt\n      createdBy\n      updatedBy\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableEntityActionDefinitionFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableEntityActionDefinitionSortInput sort;

        public SearchEntityActionDefinitionsQuery build() {
            return new SearchEntityActionDefinitionsQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableEntityActionDefinitionFilterInput searchableEntityActionDefinitionFilterInput) {
            this.filter = searchableEntityActionDefinitionFilterInput;
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

        public Builder sort(SearchableEntityActionDefinitionSortInput searchableEntityActionDefinitionSortInput) {
            this.sort = searchableEntityActionDefinitionSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchEntityActionDefinitions", "searchEntityActionDefinitions", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchEntityActionDefinitions searchEntityActionDefinitions;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchEntityActionDefinitions.Mapper searchEntityActionDefinitionsFieldMapper = new SearchEntityActionDefinitions.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchEntityActionDefinitions) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchEntityActionDefinitions>() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityActionDefinitionsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchEntityActionDefinitions read(ResponseReader responseReader2) {
                        return Mapper.this.searchEntityActionDefinitionsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchEntityActionDefinitions searchEntityActionDefinitions) {
            this.searchEntityActionDefinitions = searchEntityActionDefinitions;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchEntityActionDefinitions searchEntityActionDefinitions = this.searchEntityActionDefinitions;
            SearchEntityActionDefinitions searchEntityActionDefinitions2 = ((Data) obj).searchEntityActionDefinitions;
            return searchEntityActionDefinitions == null ? searchEntityActionDefinitions2 == null : searchEntityActionDefinitions.equals(searchEntityActionDefinitions2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchEntityActionDefinitions searchEntityActionDefinitions = this.searchEntityActionDefinitions;
                this.$hashCode = (searchEntityActionDefinitions == null ? 0 : searchEntityActionDefinitions.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityActionDefinitionsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchEntityActionDefinitions searchEntityActionDefinitions = Data.this.searchEntityActionDefinitions;
                    responseWriter.writeObject(responseField, searchEntityActionDefinitions != null ? searchEntityActionDefinitions.marshaller() : null);
                }
            };
        }

        public SearchEntityActionDefinitions searchEntityActionDefinitions() {
            return this.searchEntityActionDefinitions;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchEntityActionDefinitions=" + this.searchEntityActionDefinitions + "}";
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
        final String action;
        final String createdAt;
        final String createdBy;
        final String description;
        final String endDateTime;
        final String id;
        final String name;
        final String ownerId;
        final Integer periodicFrequency;
        final String periodicFrequencyUnit;
        final String startDateTime;
        final String status;
        final String subscriptionType;
        final String target;
        final String updatedAt;
        final String updatedBy;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("action", "action", null, true, Collections.emptyList()), ResponseField.forString("target", "target", null, true, Collections.emptyList()), ResponseField.forString("subscriptionType", "subscriptionType", null, true, Collections.emptyList()), ResponseField.forInt("periodicFrequency", "periodicFrequency", null, true, Collections.emptyList()), ResponseField.forString("periodicFrequencyUnit", "periodicFrequencyUnit", null, true, Collections.emptyList()), ResponseField.forCustomType("startDateTime", "startDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDateTime", "endDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.action = str6;
            this.target = str7;
            this.subscriptionType = str8;
            this.periodicFrequency = num;
            this.periodicFrequencyUnit = str9;
            this.startDateTime = str10;
            this.endDateTime = str11;
            this.status = str12;
            this.ownerId = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
            this.createdBy = str16;
            this.updatedBy = str17;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String action() {
            return this.action;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdBy() {
            return this.createdBy;
        }

        public String description() {
            return this.description;
        }

        public String endDateTime() {
            return this.endDateTime;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.name) != null ? str.equals(item.name) : item.name == null) && ((str2 = this.description) != null ? str2.equals(item.description) : item.description == null) && ((str3 = this.action) != null ? str3.equals(item.action) : item.action == null) && ((str4 = this.target) != null ? str4.equals(item.target) : item.target == null) && ((str5 = this.subscriptionType) != null ? str5.equals(item.subscriptionType) : item.subscriptionType == null) && ((num = this.periodicFrequency) != null ? num.equals(item.periodicFrequency) : item.periodicFrequency == null) && ((str6 = this.periodicFrequencyUnit) != null ? str6.equals(item.periodicFrequencyUnit) : item.periodicFrequencyUnit == null) && ((str7 = this.startDateTime) != null ? str7.equals(item.startDateTime) : item.startDateTime == null) && ((str8 = this.endDateTime) != null ? str8.equals(item.endDateTime) : item.endDateTime == null) && ((str9 = this.status) != null ? str9.equals(item.status) : item.status == null) && ((str10 = this.ownerId) != null ? str10.equals(item.ownerId) : item.ownerId == null) && ((str11 = this.createdAt) != null ? str11.equals(item.createdAt) : item.createdAt == null) && ((str12 = this.updatedAt) != null ? str12.equals(item.updatedAt) : item.updatedAt == null) && ((str13 = this.createdBy) != null ? str13.equals(item.createdBy) : item.createdBy == null)) {
                String str14 = this.updatedBy;
                String str15 = item.updatedBy;
                if (str14 == null) {
                    if (str15 == null) {
                        return true;
                    }
                } else if (str14.equals(str15)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.action;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.target;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.subscriptionType;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.periodicFrequency;
                int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str6 = this.periodicFrequencyUnit;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.startDateTime;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.endDateTime;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.status;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.ownerId;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.createdAt;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.updatedAt;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.createdBy;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.updatedBy;
                this.$hashCode = iHashCode15 ^ (str14 != null ? str14.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityActionDefinitionsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.name);
                    responseWriter.writeString(responseFieldArr[4], Item.this.description);
                    responseWriter.writeString(responseFieldArr[5], Item.this.action);
                    responseWriter.writeString(responseFieldArr[6], Item.this.target);
                    responseWriter.writeString(responseFieldArr[7], Item.this.subscriptionType);
                    responseWriter.writeInt(responseFieldArr[8], Item.this.periodicFrequency);
                    responseWriter.writeString(responseFieldArr[9], Item.this.periodicFrequencyUnit);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.startDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.endDateTime);
                    responseWriter.writeString(responseFieldArr[12], Item.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.updatedBy);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public Integer periodicFrequency() {
            return this.periodicFrequency;
        }

        public String periodicFrequencyUnit() {
            return this.periodicFrequencyUnit;
        }

        public String startDateTime() {
            return this.startDateTime;
        }

        public String status() {
            return this.status;
        }

        public String subscriptionType() {
            return this.subscriptionType;
        }

        public String target() {
            return this.target;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", action=" + this.action + ", target=" + this.target + ", subscriptionType=" + this.subscriptionType + ", periodicFrequency=" + this.periodicFrequency + ", periodicFrequencyUnit=" + this.periodicFrequencyUnit + ", startDateTime=" + this.startDateTime + ", endDateTime=" + this.endDateTime + ", status=" + this.status + ", ownerId=" + this.ownerId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
        }
    }

    public static class SearchEntityActionDefinitions {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchEntityActionDefinitions> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchEntityActionDefinitions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchEntityActionDefinitions.$responseFields;
                return new SearchEntityActionDefinitions(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityActionDefinitionsQuery.SearchEntityActionDefinitions.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityActionDefinitionsQuery.SearchEntityActionDefinitions.Mapper.1.1
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

        public SearchEntityActionDefinitions(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchEntityActionDefinitions)) {
                return false;
            }
            SearchEntityActionDefinitions searchEntityActionDefinitions = (SearchEntityActionDefinitions) obj;
            if (this.__typename.equals(searchEntityActionDefinitions.__typename) && this.items.equals(searchEntityActionDefinitions.items) && ((str = this.nextToken) != null ? str.equals(searchEntityActionDefinitions.nextToken) : searchEntityActionDefinitions.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchEntityActionDefinitions.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityActionDefinitionsQuery.SearchEntityActionDefinitions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchEntityActionDefinitions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchEntityActionDefinitions.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchEntityActionDefinitions.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityActionDefinitionsQuery.SearchEntityActionDefinitions.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchEntityActionDefinitions.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchEntityActionDefinitions.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchEntityActionDefinitions{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableEntityActionDefinitionFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableEntityActionDefinitionSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableEntityActionDefinitionFilterInput searchableEntityActionDefinitionFilterInput, SearchableEntityActionDefinitionSortInput searchableEntityActionDefinitionSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableEntityActionDefinitionFilterInput;
            this.sort = searchableEntityActionDefinitionSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableEntityActionDefinitionFilterInput);
            linkedHashMap.put("sort", searchableEntityActionDefinitionSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableEntityActionDefinitionFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityActionDefinitionsQuery.Variables.1
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

        public SearchableEntityActionDefinitionSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchEntityActionDefinitionsQuery(SearchableEntityActionDefinitionFilterInput searchableEntityActionDefinitionFilterInput, SearchableEntityActionDefinitionSortInput searchableEntityActionDefinitionSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableEntityActionDefinitionFilterInput, searchableEntityActionDefinitionSortInput, num, str, num2);
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
        return "393e4ba3395b30e82c9e8f0478791bb46c4774dd8532b5c6d0758ea4abded928";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchEntityActionDefinitions($filter: SearchableEntityActionDefinitionFilterInput, $sort: SearchableEntityActionDefinitionSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEntityActionDefinitions(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      action\n      target\n      subscriptionType\n      periodicFrequency\n      periodicFrequencyUnit\n      startDateTime\n      endDateTime\n      status\n      ownerId\n      createdAt\n      updatedAt\n      createdBy\n      updatedBy\n    }\n    nextToken\n    total\n  }\n}";
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
