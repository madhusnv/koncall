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
import type.SearchableStagedLeadDataFilterInput;
import type.SearchableStagedLeadDataSortInput;

/* loaded from: classes4.dex */
public final class SearchStagedLeadDatasQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchStagedLeadDatas($filter: SearchableStagedLeadDataFilterInput, $sort: SearchableStagedLeadDataSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchStagedLeadDatas(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      network\n      messageType\n      logId\n      messageId\n      mailFrom\n      mailTo\n      mailSubject\n      snippet\n      messageDate\n      viewedAt\n      leadCreatedAt\n      contactId\n      tags\n      entityListId\n      createdById\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchStagedLeadDatas";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchStagedLeadDatas($filter: SearchableStagedLeadDataFilterInput, $sort: SearchableStagedLeadDataSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchStagedLeadDatas(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      network\n      messageType\n      logId\n      messageId\n      mailFrom\n      mailTo\n      mailSubject\n      snippet\n      messageDate\n      viewedAt\n      leadCreatedAt\n      contactId\n      tags\n      entityListId\n      createdById\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableStagedLeadDataFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableStagedLeadDataSortInput sort;

        public SearchStagedLeadDatasQuery build() {
            return new SearchStagedLeadDatasQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableStagedLeadDataFilterInput searchableStagedLeadDataFilterInput) {
            this.filter = searchableStagedLeadDataFilterInput;
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

        public Builder sort(SearchableStagedLeadDataSortInput searchableStagedLeadDataSortInput) {
            this.sort = searchableStagedLeadDataSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchStagedLeadDatas", "searchStagedLeadDatas", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchStagedLeadDatas searchStagedLeadDatas;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchStagedLeadDatas.Mapper searchStagedLeadDatasFieldMapper = new SearchStagedLeadDatas.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchStagedLeadDatas) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchStagedLeadDatas>() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchStagedLeadDatas read(ResponseReader responseReader2) {
                        return Mapper.this.searchStagedLeadDatasFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchStagedLeadDatas searchStagedLeadDatas) {
            this.searchStagedLeadDatas = searchStagedLeadDatas;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchStagedLeadDatas searchStagedLeadDatas = this.searchStagedLeadDatas;
            SearchStagedLeadDatas searchStagedLeadDatas2 = ((Data) obj).searchStagedLeadDatas;
            return searchStagedLeadDatas == null ? searchStagedLeadDatas2 == null : searchStagedLeadDatas.equals(searchStagedLeadDatas2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchStagedLeadDatas searchStagedLeadDatas = this.searchStagedLeadDatas;
                this.$hashCode = (searchStagedLeadDatas == null ? 0 : searchStagedLeadDatas.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchStagedLeadDatas searchStagedLeadDatas = Data.this.searchStagedLeadDatas;
                    responseWriter.writeObject(responseField, searchStagedLeadDatas != null ? searchStagedLeadDatas.marshaller() : null);
                }
            };
        }

        public SearchStagedLeadDatas searchStagedLeadDatas() {
            return this.searchStagedLeadDatas;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchStagedLeadDatas=" + this.searchStagedLeadDatas + "}";
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
        final String entityListId;
        final String id;
        final String leadCreatedAt;
        final String logId;
        final String mailFrom;
        final String mailSubject;
        final String mailTo;
        final String messageDate;
        final String messageId;
        final String messageType;
        final String network;
        final String snippet;
        final List<String> tags;
        final String updatedAt;
        final String viewedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("network", "network", null, true, Collections.emptyList()), ResponseField.forString("messageType", "messageType", null, true, Collections.emptyList()), ResponseField.forString("logId", "logId", null, true, Collections.emptyList()), ResponseField.forString("messageId", "messageId", null, true, Collections.emptyList()), ResponseField.forString("mailFrom", "mailFrom", null, true, Collections.emptyList()), ResponseField.forString("mailTo", "mailTo", null, true, Collections.emptyList()), ResponseField.forString("mailSubject", "mailSubject", null, true, Collections.emptyList()), ResponseField.forString("snippet", "snippet", null, true, Collections.emptyList()), ResponseField.forCustomType("messageDate", "messageDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("viewedAt", "viewedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("leadCreatedAt", "leadCreatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forCustomType("entityListId", "entityListId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List<String> list, String str16, String str17, String str18, String str19) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.network = str4;
            this.messageType = str5;
            this.logId = str6;
            this.messageId = str7;
            this.mailFrom = str8;
            this.mailTo = str9;
            this.mailSubject = str10;
            this.snippet = str11;
            this.messageDate = str12;
            this.viewedAt = str13;
            this.leadCreatedAt = str14;
            this.contactId = str15;
            this.tags = list;
            this.entityListId = str16;
            this.createdById = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
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

        public String entityListId() {
            return this.entityListId;
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
            String str9;
            String str10;
            String str11;
            String str12;
            List<String> list;
            String str13;
            String str14;
            String str15;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.network) != null ? str.equals(item.network) : item.network == null) && ((str2 = this.messageType) != null ? str2.equals(item.messageType) : item.messageType == null) && ((str3 = this.logId) != null ? str3.equals(item.logId) : item.logId == null) && ((str4 = this.messageId) != null ? str4.equals(item.messageId) : item.messageId == null) && ((str5 = this.mailFrom) != null ? str5.equals(item.mailFrom) : item.mailFrom == null) && ((str6 = this.mailTo) != null ? str6.equals(item.mailTo) : item.mailTo == null) && ((str7 = this.mailSubject) != null ? str7.equals(item.mailSubject) : item.mailSubject == null) && ((str8 = this.snippet) != null ? str8.equals(item.snippet) : item.snippet == null) && ((str9 = this.messageDate) != null ? str9.equals(item.messageDate) : item.messageDate == null) && ((str10 = this.viewedAt) != null ? str10.equals(item.viewedAt) : item.viewedAt == null) && ((str11 = this.leadCreatedAt) != null ? str11.equals(item.leadCreatedAt) : item.leadCreatedAt == null) && ((str12 = this.contactId) != null ? str12.equals(item.contactId) : item.contactId == null) && ((list = this.tags) != null ? list.equals(item.tags) : item.tags == null) && ((str13 = this.entityListId) != null ? str13.equals(item.entityListId) : item.entityListId == null) && ((str14 = this.createdById) != null ? str14.equals(item.createdById) : item.createdById == null) && ((str15 = this.createdAt) != null ? str15.equals(item.createdAt) : item.createdAt == null)) {
                String str16 = this.updatedAt;
                String str17 = item.updatedAt;
                if (str16 == null) {
                    if (str17 == null) {
                        return true;
                    }
                } else if (str16.equals(str17)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.network;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.messageType;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.logId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.messageId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.mailFrom;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.mailTo;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.mailSubject;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.snippet;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.messageDate;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.viewedAt;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.leadCreatedAt;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.contactId;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode14 = (iHashCode13 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str13 = this.entityListId;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdById;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.createdAt;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.updatedAt;
                this.$hashCode = iHashCode17 ^ (str16 != null ? str16.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String leadCreatedAt() {
            return this.leadCreatedAt;
        }

        public String logId() {
            return this.logId;
        }

        public String mailFrom() {
            return this.mailFrom;
        }

        public String mailSubject() {
            return this.mailSubject;
        }

        public String mailTo() {
            return this.mailTo;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.network);
                    responseWriter.writeString(responseFieldArr[4], Item.this.messageType);
                    responseWriter.writeString(responseFieldArr[5], Item.this.logId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.messageId);
                    responseWriter.writeString(responseFieldArr[7], Item.this.mailFrom);
                    responseWriter.writeString(responseFieldArr[8], Item.this.mailTo);
                    responseWriter.writeString(responseFieldArr[9], Item.this.mailSubject);
                    responseWriter.writeString(responseFieldArr[10], Item.this.snippet);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.messageDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.viewedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.leadCreatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.contactId);
                    responseWriter.writeList(responseFieldArr[15], Item.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.entityListId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.updatedAt);
                }
            };
        }

        public String messageDate() {
            return this.messageDate;
        }

        public String messageId() {
            return this.messageId;
        }

        public String messageType() {
            return this.messageType;
        }

        public String network() {
            return this.network;
        }

        public String snippet() {
            return this.snippet;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", network=" + this.network + ", messageType=" + this.messageType + ", logId=" + this.logId + ", messageId=" + this.messageId + ", mailFrom=" + this.mailFrom + ", mailTo=" + this.mailTo + ", mailSubject=" + this.mailSubject + ", snippet=" + this.snippet + ", messageDate=" + this.messageDate + ", viewedAt=" + this.viewedAt + ", leadCreatedAt=" + this.leadCreatedAt + ", contactId=" + this.contactId + ", tags=" + this.tags + ", entityListId=" + this.entityListId + ", createdById=" + this.createdById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String viewedAt() {
            return this.viewedAt;
        }
    }

    public static class SearchStagedLeadDatas {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchStagedLeadDatas> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchStagedLeadDatas map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchStagedLeadDatas.$responseFields;
                return new SearchStagedLeadDatas(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.SearchStagedLeadDatas.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.SearchStagedLeadDatas.Mapper.1.1
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

        public SearchStagedLeadDatas(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchStagedLeadDatas)) {
                return false;
            }
            SearchStagedLeadDatas searchStagedLeadDatas = (SearchStagedLeadDatas) obj;
            if (this.__typename.equals(searchStagedLeadDatas.__typename) && this.items.equals(searchStagedLeadDatas.items) && ((str = this.nextToken) != null ? str.equals(searchStagedLeadDatas.nextToken) : searchStagedLeadDatas.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchStagedLeadDatas.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.SearchStagedLeadDatas.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchStagedLeadDatas.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchStagedLeadDatas.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchStagedLeadDatas.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.SearchStagedLeadDatas.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchStagedLeadDatas.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchStagedLeadDatas.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchStagedLeadDatas{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableStagedLeadDataFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableStagedLeadDataSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableStagedLeadDataFilterInput searchableStagedLeadDataFilterInput, SearchableStagedLeadDataSortInput searchableStagedLeadDataSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableStagedLeadDataFilterInput;
            this.sort = searchableStagedLeadDataSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableStagedLeadDataFilterInput);
            linkedHashMap.put("sort", searchableStagedLeadDataSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableStagedLeadDataFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchStagedLeadDatasQuery.Variables.1
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

        public SearchableStagedLeadDataSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchStagedLeadDatasQuery(SearchableStagedLeadDataFilterInput searchableStagedLeadDataFilterInput, SearchableStagedLeadDataSortInput searchableStagedLeadDataSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableStagedLeadDataFilterInput, searchableStagedLeadDataSortInput, num, str, num2);
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
        return "d4e3d1fb2283777883c4b1d4d01ffad0528c24f1ca7359ef7362c19cfcd46824";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchStagedLeadDatas($filter: SearchableStagedLeadDataFilterInput, $sort: SearchableStagedLeadDataSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchStagedLeadDatas(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      network\n      messageType\n      logId\n      messageId\n      mailFrom\n      mailTo\n      mailSubject\n      snippet\n      messageDate\n      viewedAt\n      leadCreatedAt\n      contactId\n      tags\n      entityListId\n      createdById\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
