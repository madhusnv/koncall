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
import type.MessageSendCategory;
import type.SearchableWabaConversationFilterInput;
import type.SearchableWabaConversationSortInput;

/* loaded from: classes4.dex */
public final class SearchWabaConversationsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchWabaConversations($filter: SearchableWabaConversationFilterInput, $sort: SearchableWabaConversationSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchWabaConversations(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      conversationId\n      originType\n      category\n      isBillable\n      pricingModel\n      expirationTimestamp\n      recipientId\n      channelId\n      accountId\n      wabaAccountId\n      displayPhoneNumber\n      phoneNumberId\n      messageSendCategory\n      initiatingMessageExternalId\n      initiatingMessageId\n      conversationInitiatedByUserId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchWabaConversationsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchWabaConversations";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchWabaConversations($filter: SearchableWabaConversationFilterInput, $sort: SearchableWabaConversationSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchWabaConversations(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      conversationId\n      originType\n      category\n      isBillable\n      pricingModel\n      expirationTimestamp\n      recipientId\n      channelId\n      accountId\n      wabaAccountId\n      displayPhoneNumber\n      phoneNumberId\n      messageSendCategory\n      initiatingMessageExternalId\n      initiatingMessageId\n      conversationInitiatedByUserId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableWabaConversationFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableWabaConversationSortInput sort;

        public SearchWabaConversationsQuery build() {
            return new SearchWabaConversationsQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableWabaConversationFilterInput searchableWabaConversationFilterInput) {
            this.filter = searchableWabaConversationFilterInput;
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

        public Builder sort(SearchableWabaConversationSortInput searchableWabaConversationSortInput) {
            this.sort = searchableWabaConversationSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchWabaConversations", "searchWabaConversations", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchWabaConversations searchWabaConversations;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchWabaConversations.Mapper searchWabaConversationsFieldMapper = new SearchWabaConversations.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchWabaConversations) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchWabaConversations>() { // from class: com.amazonaws.amplify.generated.graphql.SearchWabaConversationsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchWabaConversations read(ResponseReader responseReader2) {
                        return Mapper.this.searchWabaConversationsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchWabaConversations searchWabaConversations) {
            this.searchWabaConversations = searchWabaConversations;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchWabaConversations searchWabaConversations = this.searchWabaConversations;
            SearchWabaConversations searchWabaConversations2 = ((Data) obj).searchWabaConversations;
            return searchWabaConversations == null ? searchWabaConversations2 == null : searchWabaConversations.equals(searchWabaConversations2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchWabaConversations searchWabaConversations = this.searchWabaConversations;
                this.$hashCode = (searchWabaConversations == null ? 0 : searchWabaConversations.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchWabaConversationsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchWabaConversations searchWabaConversations = Data.this.searchWabaConversations;
                    responseWriter.writeObject(responseField, searchWabaConversations != null ? searchWabaConversations.marshaller() : null);
                }
            };
        }

        public SearchWabaConversations searchWabaConversations() {
            return this.searchWabaConversations;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchWabaConversations=" + this.searchWabaConversations + "}";
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
        final String category;
        final String channelId;
        final String conversationId;
        final String conversationInitiatedByUserId;
        final String createdAt;
        final String displayPhoneNumber;
        final String expirationTimestamp;
        final String initiatingMessageExternalId;
        final String initiatingMessageId;
        final Boolean isBillable;
        final MessageSendCategory messageSendCategory;
        final String originType;
        final String phoneNumberId;
        final String pricingModel;
        final String recipientId;
        final String updatedAt;
        final String wabaAccountId;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                String string3 = responseReader.readString(responseFieldArr[3]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String string5 = responseReader.readString(responseFieldArr[13]);
                return new Item(string, str, string2, string3, bool, string4, str2, str3, str4, str5, str6, str7, str8, string5 != null ? MessageSendCategory.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("conversationId", "conversationId", null, false, customType, Collections.emptyList()), ResponseField.forString("originType", "originType", null, true, Collections.emptyList()), ResponseField.forString("category", "category", null, true, Collections.emptyList()), ResponseField.forBoolean("isBillable", "isBillable", null, true, Collections.emptyList()), ResponseField.forString("pricingModel", "pricingModel", null, true, Collections.emptyList()), ResponseField.forCustomType("expirationTimestamp", "expirationTimestamp", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("recipientId", "recipientId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("displayPhoneNumber", "displayPhoneNumber", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumberId", "phoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forString("messageSendCategory", "messageSendCategory", null, true, Collections.emptyList()), ResponseField.forCustomType("initiatingMessageExternalId", "initiatingMessageExternalId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("initiatingMessageId", "initiatingMessageId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("conversationInitiatedByUserId", "conversationInitiatedByUserId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, MessageSendCategory messageSendCategory, String str13, String str14, String str15, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.conversationId = (String) Utils.checkNotNull(str2, "conversationId == null");
            this.originType = str3;
            this.category = str4;
            this.isBillable = bool;
            this.pricingModel = str5;
            this.expirationTimestamp = str6;
            this.recipientId = str7;
            this.channelId = str8;
            this.accountId = str9;
            this.wabaAccountId = str10;
            this.displayPhoneNumber = str11;
            this.phoneNumberId = str12;
            this.messageSendCategory = messageSendCategory;
            this.initiatingMessageExternalId = str13;
            this.initiatingMessageId = str14;
            this.conversationInitiatedByUserId = str15;
            this.createdAt = str16;
            this.updatedAt = str17;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String category() {
            return this.category;
        }

        public String channelId() {
            return this.channelId;
        }

        public String conversationId() {
            return this.conversationId;
        }

        public String conversationInitiatedByUserId() {
            return this.conversationInitiatedByUserId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String displayPhoneNumber() {
            return this.displayPhoneNumber;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            MessageSendCategory messageSendCategory;
            String str11;
            String str12;
            String str13;
            String str14;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.conversationId.equals(item.conversationId) && ((str = this.originType) != null ? str.equals(item.originType) : item.originType == null) && ((str2 = this.category) != null ? str2.equals(item.category) : item.category == null) && ((bool = this.isBillable) != null ? bool.equals(item.isBillable) : item.isBillable == null) && ((str3 = this.pricingModel) != null ? str3.equals(item.pricingModel) : item.pricingModel == null) && ((str4 = this.expirationTimestamp) != null ? str4.equals(item.expirationTimestamp) : item.expirationTimestamp == null) && ((str5 = this.recipientId) != null ? str5.equals(item.recipientId) : item.recipientId == null) && ((str6 = this.channelId) != null ? str6.equals(item.channelId) : item.channelId == null) && ((str7 = this.accountId) != null ? str7.equals(item.accountId) : item.accountId == null) && ((str8 = this.wabaAccountId) != null ? str8.equals(item.wabaAccountId) : item.wabaAccountId == null) && ((str9 = this.displayPhoneNumber) != null ? str9.equals(item.displayPhoneNumber) : item.displayPhoneNumber == null) && ((str10 = this.phoneNumberId) != null ? str10.equals(item.phoneNumberId) : item.phoneNumberId == null) && ((messageSendCategory = this.messageSendCategory) != null ? messageSendCategory.equals(item.messageSendCategory) : item.messageSendCategory == null) && ((str11 = this.initiatingMessageExternalId) != null ? str11.equals(item.initiatingMessageExternalId) : item.initiatingMessageExternalId == null) && ((str12 = this.initiatingMessageId) != null ? str12.equals(item.initiatingMessageId) : item.initiatingMessageId == null) && ((str13 = this.conversationInitiatedByUserId) != null ? str13.equals(item.conversationInitiatedByUserId) : item.conversationInitiatedByUserId == null) && ((str14 = this.createdAt) != null ? str14.equals(item.createdAt) : item.createdAt == null)) {
                String str15 = this.updatedAt;
                String str16 = item.updatedAt;
                if (str15 == null) {
                    if (str16 == null) {
                        return true;
                    }
                } else if (str15.equals(str16)) {
                    return true;
                }
            }
            return false;
        }

        public String expirationTimestamp() {
            return this.expirationTimestamp;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.conversationId.hashCode()) * 1000003;
                String str = this.originType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.category;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.isBillable;
                int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str3 = this.pricingModel;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.expirationTimestamp;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.recipientId;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.channelId;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.accountId;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.wabaAccountId;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.displayPhoneNumber;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.phoneNumberId;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                MessageSendCategory messageSendCategory = this.messageSendCategory;
                int iHashCode13 = (iHashCode12 ^ (messageSendCategory == null ? 0 : messageSendCategory.hashCode())) * 1000003;
                String str11 = this.initiatingMessageExternalId;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.initiatingMessageId;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.conversationInitiatedByUserId;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode17 = (iHashCode16 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                this.$hashCode = iHashCode17 ^ (str15 != null ? str15.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String initiatingMessageExternalId() {
            return this.initiatingMessageExternalId;
        }

        public String initiatingMessageId() {
            return this.initiatingMessageId;
        }

        public Boolean isBillable() {
            return this.isBillable;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchWabaConversationsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.conversationId);
                    responseWriter.writeString(responseFieldArr[2], Item.this.originType);
                    responseWriter.writeString(responseFieldArr[3], Item.this.category);
                    responseWriter.writeBoolean(responseFieldArr[4], Item.this.isBillable);
                    responseWriter.writeString(responseFieldArr[5], Item.this.pricingModel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.expirationTimestamp);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.recipientId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.wabaAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.displayPhoneNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.phoneNumberId);
                    ResponseField responseField = responseFieldArr[13];
                    MessageSendCategory messageSendCategory = Item.this.messageSendCategory;
                    responseWriter.writeString(responseField, messageSendCategory != null ? messageSendCategory.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.initiatingMessageExternalId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.initiatingMessageId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.conversationInitiatedByUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.updatedAt);
                }
            };
        }

        public MessageSendCategory messageSendCategory() {
            return this.messageSendCategory;
        }

        public String originType() {
            return this.originType;
        }

        public String phoneNumberId() {
            return this.phoneNumberId;
        }

        public String pricingModel() {
            return this.pricingModel;
        }

        public String recipientId() {
            return this.recipientId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", conversationId=" + this.conversationId + ", originType=" + this.originType + ", category=" + this.category + ", isBillable=" + this.isBillable + ", pricingModel=" + this.pricingModel + ", expirationTimestamp=" + this.expirationTimestamp + ", recipientId=" + this.recipientId + ", channelId=" + this.channelId + ", accountId=" + this.accountId + ", wabaAccountId=" + this.wabaAccountId + ", displayPhoneNumber=" + this.displayPhoneNumber + ", phoneNumberId=" + this.phoneNumberId + ", messageSendCategory=" + this.messageSendCategory + ", initiatingMessageExternalId=" + this.initiatingMessageExternalId + ", initiatingMessageId=" + this.initiatingMessageId + ", conversationInitiatedByUserId=" + this.conversationInitiatedByUserId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String wabaAccountId() {
            return this.wabaAccountId;
        }
    }

    public static class SearchWabaConversations {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchWabaConversations> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchWabaConversations map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchWabaConversations.$responseFields;
                return new SearchWabaConversations(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchWabaConversationsQuery.SearchWabaConversations.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchWabaConversationsQuery.SearchWabaConversations.Mapper.1.1
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

        public SearchWabaConversations(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchWabaConversations)) {
                return false;
            }
            SearchWabaConversations searchWabaConversations = (SearchWabaConversations) obj;
            if (this.__typename.equals(searchWabaConversations.__typename) && this.items.equals(searchWabaConversations.items) && ((str = this.nextToken) != null ? str.equals(searchWabaConversations.nextToken) : searchWabaConversations.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchWabaConversations.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchWabaConversationsQuery.SearchWabaConversations.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchWabaConversations.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchWabaConversations.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchWabaConversations.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchWabaConversationsQuery.SearchWabaConversations.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchWabaConversations.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchWabaConversations.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchWabaConversations{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableWabaConversationFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableWabaConversationSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableWabaConversationFilterInput searchableWabaConversationFilterInput, SearchableWabaConversationSortInput searchableWabaConversationSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableWabaConversationFilterInput;
            this.sort = searchableWabaConversationSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableWabaConversationFilterInput);
            linkedHashMap.put("sort", searchableWabaConversationSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableWabaConversationFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchWabaConversationsQuery.Variables.1
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

        public SearchableWabaConversationSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchWabaConversationsQuery(SearchableWabaConversationFilterInput searchableWabaConversationFilterInput, SearchableWabaConversationSortInput searchableWabaConversationSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableWabaConversationFilterInput, searchableWabaConversationSortInput, num, str, num2);
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
        return "dae19038d941c1bc53234ed5c7720b774249e145a07a52d7e2299a7545391338";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchWabaConversations($filter: SearchableWabaConversationFilterInput, $sort: SearchableWabaConversationSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchWabaConversations(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      conversationId\n      originType\n      category\n      isBillable\n      pricingModel\n      expirationTimestamp\n      recipientId\n      channelId\n      accountId\n      wabaAccountId\n      displayPhoneNumber\n      phoneNumberId\n      messageSendCategory\n      initiatingMessageExternalId\n      initiatingMessageId\n      conversationInitiatedByUserId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
