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
import type.ActivityCategory;
import type.ActivityRelatedObjectType;
import type.ActivityType;
import type.CustomType;
import type.ModelActivityFilterInput;
import type.ModelSortDirection;
import type.QueryActivityListInput;

/* loaded from: classes4.dex */
public final class QueryActivityListQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query QueryActivityList($input: QueryActivityListInput!, $sortDirection: ModelSortDirection, $filter: ModelActivityFilterInput, $limit: Int, $nextToken: String) {\n  queryActivityList(input: $input, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    startedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.QueryActivityListQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "QueryActivityList";
        }
    };
    public static final String QUERY_DOCUMENT = "query QueryActivityList($input: QueryActivityListInput!, $sortDirection: ModelSortDirection, $filter: ModelActivityFilterInput, $limit: Int, $nextToken: String) {\n  queryActivityList(input: $input, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    startedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelActivityFilterInput filter;
        private QueryActivityListInput input;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public QueryActivityListQuery build() {
            Utils.checkNotNull(this.input, "input == null");
            return new QueryActivityListQuery(this.input, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelActivityFilterInput modelActivityFilterInput) {
            this.filter = modelActivityFilterInput;
            return this;
        }

        public Builder input(QueryActivityListInput queryActivityListInput) {
            this.input = queryActivityListInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("queryActivityList", "queryActivityList", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final QueryActivityList queryActivityList;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final QueryActivityList.Mapper queryActivityListFieldMapper = new QueryActivityList.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((QueryActivityList) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<QueryActivityList>() { // from class: com.amazonaws.amplify.generated.graphql.QueryActivityListQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public QueryActivityList read(ResponseReader responseReader2) {
                        return Mapper.this.queryActivityListFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(QueryActivityList queryActivityList) {
            this.queryActivityList = queryActivityList;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            QueryActivityList queryActivityList = this.queryActivityList;
            QueryActivityList queryActivityList2 = ((Data) obj).queryActivityList;
            return queryActivityList == null ? queryActivityList2 == null : queryActivityList.equals(queryActivityList2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                QueryActivityList queryActivityList = this.queryActivityList;
                this.$hashCode = (queryActivityList == null ? 0 : queryActivityList.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.QueryActivityListQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    QueryActivityList queryActivityList = Data.this.queryActivityList;
                    responseWriter.writeObject(responseField, queryActivityList != null ? queryActivityList.marshaller() : null);
                }
            };
        }

        public QueryActivityList queryActivityList() {
            return this.queryActivityList;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{queryActivityList=" + this.queryActivityList + "}";
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
        final ActivityCategory activityCategory;
        final String activityDoneByUserId;
        final String activityRelatedObjectId;
        final ActivityRelatedObjectType activityRelatedObjectType;
        final ActivityType activityType;
        final String body;
        final String contactId;
        final String createdAt;
        final String id;
        final String note;
        final String ownerId;
        final String primaryTeamId;
        final String threadId;
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
                String string2 = responseReader.readString(responseFieldArr[4]);
                ActivityRelatedObjectType activityRelatedObjectTypeValueOf = string2 != null ? ActivityRelatedObjectType.valueOf(string2) : null;
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                ActivityCategory activityCategoryValueOf = string3 != null ? ActivityCategory.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[7]);
                return new Item(string, str, str2, str3, activityRelatedObjectTypeValueOf, str4, activityCategoryValueOf, string4 != null ? ActivityType.valueOf(string4) : null, responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("threadId", "threadId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("activityRelatedObjectType", "activityRelatedObjectType", null, false, Collections.emptyList()), ResponseField.forCustomType("activityRelatedObjectId", "activityRelatedObjectId", null, false, customType, Collections.emptyList()), ResponseField.forString("activityCategory", "activityCategory", null, false, Collections.emptyList()), ResponseField.forString("activityType", "activityType", null, false, Collections.emptyList()), ResponseField.forString("body", "body", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("activityDoneByUserId", "activityDoneByUserId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, ActivityRelatedObjectType activityRelatedObjectType, String str5, ActivityCategory activityCategory, ActivityType activityType, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.threadId = str3;
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.activityRelatedObjectType = (ActivityRelatedObjectType) Utils.checkNotNull(activityRelatedObjectType, "activityRelatedObjectType == null");
            this.activityRelatedObjectId = (String) Utils.checkNotNull(str5, "activityRelatedObjectId == null");
            this.activityCategory = (ActivityCategory) Utils.checkNotNull(activityCategory, "activityCategory == null");
            this.activityType = (ActivityType) Utils.checkNotNull(activityType, "activityType == null");
            this.body = str6;
            this.note = str7;
            this.ownerId = (String) Utils.checkNotNull(str8, "ownerId == null");
            this.primaryTeamId = str9;
            this.contactId = str10;
            this.activityDoneByUserId = str11;
            this.createdAt = str12;
            this.updatedAt = str13;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public ActivityCategory activityCategory() {
            return this.activityCategory;
        }

        public String activityDoneByUserId() {
            return this.activityDoneByUserId;
        }

        public String activityRelatedObjectId() {
            return this.activityRelatedObjectId;
        }

        public ActivityRelatedObjectType activityRelatedObjectType() {
            return this.activityRelatedObjectType;
        }

        public ActivityType activityType() {
            return this.activityType;
        }

        public String body() {
            return this.body;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && ((str = this.threadId) != null ? str.equals(item.threadId) : item.threadId == null) && this.accountId.equals(item.accountId) && this.activityRelatedObjectType.equals(item.activityRelatedObjectType) && this.activityRelatedObjectId.equals(item.activityRelatedObjectId) && this.activityCategory.equals(item.activityCategory) && this.activityType.equals(item.activityType) && ((str2 = this.body) != null ? str2.equals(item.body) : item.body == null) && ((str3 = this.note) != null ? str3.equals(item.note) : item.note == null) && this.ownerId.equals(item.ownerId) && ((str4 = this.primaryTeamId) != null ? str4.equals(item.primaryTeamId) : item.primaryTeamId == null) && ((str5 = this.contactId) != null ? str5.equals(item.contactId) : item.contactId == null) && ((str6 = this.activityDoneByUserId) != null ? str6.equals(item.activityDoneByUserId) : item.activityDoneByUserId == null) && ((str7 = this.createdAt) != null ? str7.equals(item.createdAt) : item.createdAt == null)) {
                String str8 = this.updatedAt;
                String str9 = item.updatedAt;
                if (str8 == null) {
                    if (str9 == null) {
                        return true;
                    }
                } else if (str8.equals(str9)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.threadId;
                int iHashCode2 = (((((((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.activityRelatedObjectType.hashCode()) * 1000003) ^ this.activityRelatedObjectId.hashCode()) * 1000003) ^ this.activityCategory.hashCode()) * 1000003) ^ this.activityType.hashCode()) * 1000003;
                String str2 = this.body;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.note;
                int iHashCode4 = (((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str4 = this.primaryTeamId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.contactId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.activityDoneByUserId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                this.$hashCode = iHashCode8 ^ (str8 != null ? str8.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.QueryActivityListQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.threadId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.activityRelatedObjectType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.activityRelatedObjectId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.activityCategory.name());
                    responseWriter.writeString(responseFieldArr[7], Item.this.activityType.name());
                    responseWriter.writeString(responseFieldArr[8], Item.this.body);
                    responseWriter.writeString(responseFieldArr[9], Item.this.note);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.activityDoneByUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.updatedAt);
                }
            };
        }

        public String note() {
            return this.note;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String threadId() {
            return this.threadId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", threadId=" + this.threadId + ", accountId=" + this.accountId + ", activityRelatedObjectType=" + this.activityRelatedObjectType + ", activityRelatedObjectId=" + this.activityRelatedObjectId + ", activityCategory=" + this.activityCategory + ", activityType=" + this.activityType + ", body=" + this.body + ", note=" + this.note + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", contactId=" + this.contactId + ", activityDoneByUserId=" + this.activityDoneByUserId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class QueryActivityList {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, true, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forCustomType("startedAt", "startedAt", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Long startedAt;

        public static final class Mapper implements ResponseFieldMapper<QueryActivityList> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public QueryActivityList map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = QueryActivityList.$responseFields;
                return new QueryActivityList(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.QueryActivityListQuery.QueryActivityList.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.QueryActivityListQuery.QueryActivityList.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]));
            }
        }

        public QueryActivityList(String str, List<Item> list, String str2, Long l) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = list;
            this.nextToken = str2;
            this.startedAt = l;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            List<Item> list;
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QueryActivityList)) {
                return false;
            }
            QueryActivityList queryActivityList = (QueryActivityList) obj;
            if (this.__typename.equals(queryActivityList.__typename) && ((list = this.items) != null ? list.equals(queryActivityList.items) : queryActivityList.items == null) && ((str = this.nextToken) != null ? str.equals(queryActivityList.nextToken) : queryActivityList.nextToken == null)) {
                Long l = this.startedAt;
                Long l2 = queryActivityList.startedAt;
                if (l == null) {
                    if (l2 == null) {
                        return true;
                    }
                } else if (l.equals(l2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Item> list = this.items;
                int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str = this.nextToken;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Long l = this.startedAt;
                this.$hashCode = iHashCode3 ^ (l != null ? l.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.QueryActivityListQuery.QueryActivityList.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = QueryActivityList.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], QueryActivityList.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], QueryActivityList.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.QueryActivityListQuery.QueryActivityList.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], QueryActivityList.this.nextToken);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], QueryActivityList.this.startedAt);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public Long startedAt() {
            return this.startedAt;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "QueryActivityList{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", startedAt=" + this.startedAt + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelActivityFilterInput filter;
        private final QueryActivityListInput input;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(QueryActivityListInput queryActivityListInput, ModelSortDirection modelSortDirection, ModelActivityFilterInput modelActivityFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = queryActivityListInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelActivityFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("input", queryActivityListInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelActivityFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelActivityFilterInput filter() {
            return this.filter;
        }

        public QueryActivityListInput input() {
            return this.input;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.QueryActivityListQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
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

    public QueryActivityListQuery(QueryActivityListInput queryActivityListInput, ModelSortDirection modelSortDirection, ModelActivityFilterInput modelActivityFilterInput, Integer num, String str) {
        Utils.checkNotNull(queryActivityListInput, "input == null");
        this.variables = new Variables(queryActivityListInput, modelSortDirection, modelActivityFilterInput, num, str);
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
        return "d7d317a36ce1852e06f3fd24dd9f7937b300a824bd3894ff011cdc04d3d9c7f1";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query QueryActivityList($input: QueryActivityListInput!, $sortDirection: ModelSortDirection, $filter: ModelActivityFilterInput, $limit: Int, $nextToken: String) {\n  queryActivityList(input: $input, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    startedAt\n  }\n}";
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
