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
import type.MessageSendCategory;
import type.SearchableChatMessageFilterInput;
import type.SearchableChatMessageSortInput;

/* loaded from: classes4.dex */
public final class SearchChatMessagesQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchChatMessages($filter: SearchableChatMessageFilterInput, $sort: SearchableChatMessageSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchChatMessages(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchChatMessages";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchChatMessages($filter: SearchableChatMessageFilterInput, $sort: SearchableChatMessageSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchChatMessages(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableChatMessageFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableChatMessageSortInput sort;

        public SearchChatMessagesQuery build() {
            return new SearchChatMessagesQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableChatMessageFilterInput searchableChatMessageFilterInput) {
            this.filter = searchableChatMessageFilterInput;
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

        public Builder sort(SearchableChatMessageSortInput searchableChatMessageSortInput) {
            this.sort = searchableChatMessageSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchChatMessages", "searchChatMessages", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchChatMessages searchChatMessages;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchChatMessages.Mapper searchChatMessagesFieldMapper = new SearchChatMessages.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchChatMessages) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchChatMessages>() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchChatMessages read(ResponseReader responseReader2) {
                        return Mapper.this.searchChatMessagesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchChatMessages searchChatMessages) {
            this.searchChatMessages = searchChatMessages;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchChatMessages searchChatMessages = this.searchChatMessages;
            SearchChatMessages searchChatMessages2 = ((Data) obj).searchChatMessages;
            return searchChatMessages == null ? searchChatMessages2 == null : searchChatMessages.equals(searchChatMessages2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchChatMessages searchChatMessages = this.searchChatMessages;
                this.$hashCode = (searchChatMessages == null ? 0 : searchChatMessages.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchChatMessages searchChatMessages = Data.this.searchChatMessages;
                    responseWriter.writeObject(responseField, searchChatMessages != null ? searchChatMessages.marshaller() : null);
                }
            };
        }

        public SearchChatMessages searchChatMessages() {
            return this.searchChatMessages;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchChatMessages=" + this.searchChatMessages + "}";
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
        final String adddressMessageParameters;
        final String channelId;
        final String chatBotId;
        final String chatUserAccountIdIfExternal;
        final String chatUserAccountNameIfExternal;
        final String chatUserId;
        final String chatUserName;
        final String contactId;
        final List<String> contactObjectToSend;
        final String createdAt;
        final String deliveredAt;
        final String directChatUserId;
        final String errorMessages;
        final String externalConversationId;
        final String externalMessageReferenceId;
        final String externalTemplateCategory;
        final String externalTemplateId;
        final String followUpType;
        final String footerText;
        final Boolean hasImage;
        final String headerText;
        final String headerType;
        final String id;
        final String internalTemplateId;
        final Boolean isInbound;
        final Boolean isStarred;
        final String linkedEngagementIdIfBroadcast;
        final String locationObjectToSend;
        final String mediaMetadata;
        final String mediaObjectId;
        final String messageCategory;
        final String messagePlatform;
        final MessageSendCategory messageSendCategory;
        final String messageSubType;
        final String messageType;
        final String phoneNumberIdExternal;
        final String primaryTeamId;
        final String readAt;
        final String recipientExternalId;
        final String recipientExternalIdType;
        final String referral;
        final String referredContactId;
        final String referredProductCatalogId;
        final String referredProductRetailerId;
        final String replyType;
        final String replyTypeId;
        final String replyingToMessageId;
        final String replyingToMessageIdExternal;
        final String responseMessageId;
        final String sentAt;
        final String status;
        final String text;
        final String thumbnailUrl;
        final String updatedAt;
        final String visitorId;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String string8 = responseReader.readString(responseFieldArr[13]);
                String string9 = responseReader.readString(responseFieldArr[14]);
                String string10 = responseReader.readString(responseFieldArr[15]);
                String string11 = responseReader.readString(responseFieldArr[16]);
                return new Item(string, str, str2, string2, string3, string4, string5, string6, string7, str3, str4, str5, str6, string8, string9, string10, string11 != null ? MessageSendCategory.valueOf(string11) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readString(responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), responseReader.readString(responseFieldArr[27]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[28]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), responseReader.readString(responseFieldArr[33]), responseReader.readString(responseFieldArr[34]), responseReader.readString(responseFieldArr[35]), responseReader.readList(responseFieldArr[36], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readString(responseFieldArr[39]), responseReader.readString(responseFieldArr[40]), responseReader.readString(responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readBoolean(responseFieldArr[44]), responseReader.readString(responseFieldArr[45]), responseReader.readBoolean(responseFieldArr[46]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readString(responseFieldArr[51]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[52]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[53]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[54]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forString("messagePlatform", "messagePlatform", null, true, Collections.emptyList()), ResponseField.forString("externalMessageReferenceId", "externalMessageReferenceId", null, true, Collections.emptyList()), ResponseField.forString("externalConversationId", "externalConversationId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalId", "recipientExternalId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalIdType", "recipientExternalIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("visitorId", "visitorId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("referredContactId", "referredContactId", null, true, customType, Collections.emptyList()), ResponseField.forString("messageType", "messageType", null, true, Collections.emptyList()), ResponseField.forString("messageSubType", "messageSubType", null, true, Collections.emptyList()), ResponseField.forString("messageCategory", "messageCategory", null, true, Collections.emptyList()), ResponseField.forString("messageSendCategory", "messageSendCategory", null, true, Collections.emptyList()), ResponseField.forCustomType("replyingToMessageId", "replyingToMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("replyingToMessageIdExternal", "replyingToMessageIdExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("responseMessageId", "responseMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("followUpType", "followUpType", null, true, Collections.emptyList()), ResponseField.forString("replyType", "replyType", null, true, Collections.emptyList()), ResponseField.forString("replyTypeId", "replyTypeId", null, true, Collections.emptyList()), ResponseField.forString("referredProductCatalogId", "referredProductCatalogId", null, true, Collections.emptyList()), ResponseField.forString("referredProductRetailerId", "referredProductRetailerId", null, true, Collections.emptyList()), ResponseField.forCustomType("referral", "referral", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isStarred", "isStarred", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("errorMessages", "errorMessages", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("sentAt", "sentAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("deliveredAt", "deliveredAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("readAt", "readAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("internalTemplateId", "internalTemplateId", null, true, customType, Collections.emptyList()), ResponseField.forString("externalTemplateId", "externalTemplateId", null, true, Collections.emptyList()), ResponseField.forString("externalTemplateCategory", "externalTemplateCategory", null, true, Collections.emptyList()), ResponseField.forString("text", "text", null, true, Collections.emptyList()), ResponseField.forList("contactObjectToSend", "contactObjectToSend", null, true, Collections.emptyList()), ResponseField.forCustomType("locationObjectToSend", "locationObjectToSend", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("adddressMessageParameters", "adddressMessageParameters", null, true, customType2, Collections.emptyList()), ResponseField.forString("headerText", "headerText", null, true, Collections.emptyList()), ResponseField.forString("footerText", "footerText", null, true, Collections.emptyList()), ResponseField.forString("headerType", "headerType", null, true, Collections.emptyList()), ResponseField.forCustomType("mediaObjectId", "mediaObjectId", null, true, customType, Collections.emptyList()), ResponseField.forString("mediaMetadata", "mediaMetadata", null, true, Collections.emptyList()), ResponseField.forBoolean("hasImage", "hasImage", null, true, Collections.emptyList()), ResponseField.forString("thumbnailUrl", "thumbnailUrl", null, true, Collections.emptyList()), ResponseField.forBoolean("isInbound", "isInbound", null, true, Collections.emptyList()), ResponseField.forCustomType("chatUserId", "chatUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("chatUserName", "chatUserName", null, true, Collections.emptyList()), ResponseField.forCustomType("chatBotId", "chatBotId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("chatUserAccountIdIfExternal", "chatUserAccountIdIfExternal", null, true, customType, Collections.emptyList()), ResponseField.forString("chatUserAccountNameIfExternal", "chatUserAccountNameIfExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("directChatUserId", "directChatUserId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("linkedEngagementIdIfBroadcast", "linkedEngagementIdIfBroadcast", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, MessageSendCategory messageSendCategory, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<String> list, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool2, String str42, Boolean bool3, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.phoneNumberIdExternal = str4;
            this.messagePlatform = str5;
            this.externalMessageReferenceId = str6;
            this.externalConversationId = str7;
            this.recipientExternalId = str8;
            this.recipientExternalIdType = str9;
            this.channelId = (String) Utils.checkNotNull(str10, "channelId == null");
            this.contactId = str11;
            this.visitorId = str12;
            this.referredContactId = str13;
            this.messageType = str14;
            this.messageSubType = str15;
            this.messageCategory = str16;
            this.messageSendCategory = messageSendCategory;
            this.replyingToMessageId = str17;
            this.replyingToMessageIdExternal = str18;
            this.responseMessageId = str19;
            this.followUpType = str20;
            this.replyType = str21;
            this.replyTypeId = str22;
            this.referredProductCatalogId = str23;
            this.referredProductRetailerId = str24;
            this.referral = str25;
            this.isStarred = bool;
            this.status = str26;
            this.errorMessages = str27;
            this.sentAt = str28;
            this.deliveredAt = str29;
            this.readAt = str30;
            this.internalTemplateId = str31;
            this.externalTemplateId = str32;
            this.externalTemplateCategory = str33;
            this.text = str34;
            this.contactObjectToSend = list;
            this.locationObjectToSend = str35;
            this.adddressMessageParameters = str36;
            this.headerText = str37;
            this.footerText = str38;
            this.headerType = str39;
            this.mediaObjectId = str40;
            this.mediaMetadata = str41;
            this.hasImage = bool2;
            this.thumbnailUrl = str42;
            this.isInbound = bool3;
            this.chatUserId = str43;
            this.chatUserName = str44;
            this.chatBotId = str45;
            this.chatUserAccountIdIfExternal = str46;
            this.chatUserAccountNameIfExternal = str47;
            this.directChatUserId = str48;
            this.primaryTeamId = str49;
            this.linkedEngagementIdIfBroadcast = str50;
            this.createdAt = str51;
            this.updatedAt = str52;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String adddressMessageParameters() {
            return this.adddressMessageParameters;
        }

        public String channelId() {
            return this.channelId;
        }

        public String chatBotId() {
            return this.chatBotId;
        }

        public String chatUserAccountIdIfExternal() {
            return this.chatUserAccountIdIfExternal;
        }

        public String chatUserAccountNameIfExternal() {
            return this.chatUserAccountNameIfExternal;
        }

        public String chatUserId() {
            return this.chatUserId;
        }

        public String chatUserName() {
            return this.chatUserName;
        }

        public String contactId() {
            return this.contactId;
        }

        public List<String> contactObjectToSend() {
            return this.contactObjectToSend;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deliveredAt() {
            return this.deliveredAt;
        }

        public String directChatUserId() {
            return this.directChatUserId;
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
            MessageSendCategory messageSendCategory;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            Boolean bool;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            List<String> list;
            String str31;
            String str32;
            String str33;
            String str34;
            String str35;
            String str36;
            String str37;
            Boolean bool2;
            String str38;
            Boolean bool3;
            String str39;
            String str40;
            String str41;
            String str42;
            String str43;
            String str44;
            String str45;
            String str46;
            String str47;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(item.phoneNumberIdExternal) : item.phoneNumberIdExternal == null) && ((str2 = this.messagePlatform) != null ? str2.equals(item.messagePlatform) : item.messagePlatform == null) && ((str3 = this.externalMessageReferenceId) != null ? str3.equals(item.externalMessageReferenceId) : item.externalMessageReferenceId == null) && ((str4 = this.externalConversationId) != null ? str4.equals(item.externalConversationId) : item.externalConversationId == null) && ((str5 = this.recipientExternalId) != null ? str5.equals(item.recipientExternalId) : item.recipientExternalId == null) && ((str6 = this.recipientExternalIdType) != null ? str6.equals(item.recipientExternalIdType) : item.recipientExternalIdType == null) && this.channelId.equals(item.channelId) && ((str7 = this.contactId) != null ? str7.equals(item.contactId) : item.contactId == null) && ((str8 = this.visitorId) != null ? str8.equals(item.visitorId) : item.visitorId == null) && ((str9 = this.referredContactId) != null ? str9.equals(item.referredContactId) : item.referredContactId == null) && ((str10 = this.messageType) != null ? str10.equals(item.messageType) : item.messageType == null) && ((str11 = this.messageSubType) != null ? str11.equals(item.messageSubType) : item.messageSubType == null) && ((str12 = this.messageCategory) != null ? str12.equals(item.messageCategory) : item.messageCategory == null) && ((messageSendCategory = this.messageSendCategory) != null ? messageSendCategory.equals(item.messageSendCategory) : item.messageSendCategory == null) && ((str13 = this.replyingToMessageId) != null ? str13.equals(item.replyingToMessageId) : item.replyingToMessageId == null) && ((str14 = this.replyingToMessageIdExternal) != null ? str14.equals(item.replyingToMessageIdExternal) : item.replyingToMessageIdExternal == null) && ((str15 = this.responseMessageId) != null ? str15.equals(item.responseMessageId) : item.responseMessageId == null) && ((str16 = this.followUpType) != null ? str16.equals(item.followUpType) : item.followUpType == null) && ((str17 = this.replyType) != null ? str17.equals(item.replyType) : item.replyType == null) && ((str18 = this.replyTypeId) != null ? str18.equals(item.replyTypeId) : item.replyTypeId == null) && ((str19 = this.referredProductCatalogId) != null ? str19.equals(item.referredProductCatalogId) : item.referredProductCatalogId == null) && ((str20 = this.referredProductRetailerId) != null ? str20.equals(item.referredProductRetailerId) : item.referredProductRetailerId == null) && ((str21 = this.referral) != null ? str21.equals(item.referral) : item.referral == null) && ((bool = this.isStarred) != null ? bool.equals(item.isStarred) : item.isStarred == null) && ((str22 = this.status) != null ? str22.equals(item.status) : item.status == null) && ((str23 = this.errorMessages) != null ? str23.equals(item.errorMessages) : item.errorMessages == null) && ((str24 = this.sentAt) != null ? str24.equals(item.sentAt) : item.sentAt == null) && ((str25 = this.deliveredAt) != null ? str25.equals(item.deliveredAt) : item.deliveredAt == null) && ((str26 = this.readAt) != null ? str26.equals(item.readAt) : item.readAt == null) && ((str27 = this.internalTemplateId) != null ? str27.equals(item.internalTemplateId) : item.internalTemplateId == null) && ((str28 = this.externalTemplateId) != null ? str28.equals(item.externalTemplateId) : item.externalTemplateId == null) && ((str29 = this.externalTemplateCategory) != null ? str29.equals(item.externalTemplateCategory) : item.externalTemplateCategory == null) && ((str30 = this.text) != null ? str30.equals(item.text) : item.text == null) && ((list = this.contactObjectToSend) != null ? list.equals(item.contactObjectToSend) : item.contactObjectToSend == null) && ((str31 = this.locationObjectToSend) != null ? str31.equals(item.locationObjectToSend) : item.locationObjectToSend == null) && ((str32 = this.adddressMessageParameters) != null ? str32.equals(item.adddressMessageParameters) : item.adddressMessageParameters == null) && ((str33 = this.headerText) != null ? str33.equals(item.headerText) : item.headerText == null) && ((str34 = this.footerText) != null ? str34.equals(item.footerText) : item.footerText == null) && ((str35 = this.headerType) != null ? str35.equals(item.headerType) : item.headerType == null) && ((str36 = this.mediaObjectId) != null ? str36.equals(item.mediaObjectId) : item.mediaObjectId == null) && ((str37 = this.mediaMetadata) != null ? str37.equals(item.mediaMetadata) : item.mediaMetadata == null) && ((bool2 = this.hasImage) != null ? bool2.equals(item.hasImage) : item.hasImage == null) && ((str38 = this.thumbnailUrl) != null ? str38.equals(item.thumbnailUrl) : item.thumbnailUrl == null) && ((bool3 = this.isInbound) != null ? bool3.equals(item.isInbound) : item.isInbound == null) && ((str39 = this.chatUserId) != null ? str39.equals(item.chatUserId) : item.chatUserId == null) && ((str40 = this.chatUserName) != null ? str40.equals(item.chatUserName) : item.chatUserName == null) && ((str41 = this.chatBotId) != null ? str41.equals(item.chatBotId) : item.chatBotId == null) && ((str42 = this.chatUserAccountIdIfExternal) != null ? str42.equals(item.chatUserAccountIdIfExternal) : item.chatUserAccountIdIfExternal == null) && ((str43 = this.chatUserAccountNameIfExternal) != null ? str43.equals(item.chatUserAccountNameIfExternal) : item.chatUserAccountNameIfExternal == null) && ((str44 = this.directChatUserId) != null ? str44.equals(item.directChatUserId) : item.directChatUserId == null) && ((str45 = this.primaryTeamId) != null ? str45.equals(item.primaryTeamId) : item.primaryTeamId == null) && ((str46 = this.linkedEngagementIdIfBroadcast) != null ? str46.equals(item.linkedEngagementIdIfBroadcast) : item.linkedEngagementIdIfBroadcast == null) && ((str47 = this.createdAt) != null ? str47.equals(item.createdAt) : item.createdAt == null)) {
                String str48 = this.updatedAt;
                String str49 = item.updatedAt;
                if (str48 == null) {
                    if (str49 == null) {
                        return true;
                    }
                } else if (str48.equals(str49)) {
                    return true;
                }
            }
            return false;
        }

        public String errorMessages() {
            return this.errorMessages;
        }

        public String externalConversationId() {
            return this.externalConversationId;
        }

        public String externalMessageReferenceId() {
            return this.externalMessageReferenceId;
        }

        public String externalTemplateCategory() {
            return this.externalTemplateCategory;
        }

        public String externalTemplateId() {
            return this.externalTemplateId;
        }

        public String followUpType() {
            return this.followUpType;
        }

        public String footerText() {
            return this.footerText;
        }

        public Boolean hasImage() {
            return this.hasImage;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.phoneNumberIdExternal;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.messagePlatform;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.externalMessageReferenceId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.externalConversationId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.recipientExternalId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.recipientExternalIdType;
                int iHashCode7 = (((iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003) ^ this.channelId.hashCode()) * 1000003;
                String str7 = this.contactId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.visitorId;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.referredContactId;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.messageType;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.messageSubType;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.messageCategory;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                MessageSendCategory messageSendCategory = this.messageSendCategory;
                int iHashCode14 = (iHashCode13 ^ (messageSendCategory == null ? 0 : messageSendCategory.hashCode())) * 1000003;
                String str13 = this.replyingToMessageId;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.replyingToMessageIdExternal;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.responseMessageId;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.followUpType;
                int iHashCode18 = (iHashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.replyType;
                int iHashCode19 = (iHashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.replyTypeId;
                int iHashCode20 = (iHashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.referredProductCatalogId;
                int iHashCode21 = (iHashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.referredProductRetailerId;
                int iHashCode22 = (iHashCode21 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.referral;
                int iHashCode23 = (iHashCode22 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                Boolean bool = this.isStarred;
                int iHashCode24 = (iHashCode23 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str22 = this.status;
                int iHashCode25 = (iHashCode24 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.errorMessages;
                int iHashCode26 = (iHashCode25 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.sentAt;
                int iHashCode27 = (iHashCode26 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.deliveredAt;
                int iHashCode28 = (iHashCode27 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.readAt;
                int iHashCode29 = (iHashCode28 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.internalTemplateId;
                int iHashCode30 = (iHashCode29 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.externalTemplateId;
                int iHashCode31 = (iHashCode30 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.externalTemplateCategory;
                int iHashCode32 = (iHashCode31 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.text;
                int iHashCode33 = (iHashCode32 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                List<String> list = this.contactObjectToSend;
                int iHashCode34 = (iHashCode33 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str31 = this.locationObjectToSend;
                int iHashCode35 = (iHashCode34 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.adddressMessageParameters;
                int iHashCode36 = (iHashCode35 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.headerText;
                int iHashCode37 = (iHashCode36 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                String str34 = this.footerText;
                int iHashCode38 = (iHashCode37 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.headerType;
                int iHashCode39 = (iHashCode38 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.mediaObjectId;
                int iHashCode40 = (iHashCode39 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.mediaMetadata;
                int iHashCode41 = (iHashCode40 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                Boolean bool2 = this.hasImage;
                int iHashCode42 = (iHashCode41 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str38 = this.thumbnailUrl;
                int iHashCode43 = (iHashCode42 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                Boolean bool3 = this.isInbound;
                int iHashCode44 = (iHashCode43 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                String str39 = this.chatUserId;
                int iHashCode45 = (iHashCode44 ^ (str39 == null ? 0 : str39.hashCode())) * 1000003;
                String str40 = this.chatUserName;
                int iHashCode46 = (iHashCode45 ^ (str40 == null ? 0 : str40.hashCode())) * 1000003;
                String str41 = this.chatBotId;
                int iHashCode47 = (iHashCode46 ^ (str41 == null ? 0 : str41.hashCode())) * 1000003;
                String str42 = this.chatUserAccountIdIfExternal;
                int iHashCode48 = (iHashCode47 ^ (str42 == null ? 0 : str42.hashCode())) * 1000003;
                String str43 = this.chatUserAccountNameIfExternal;
                int iHashCode49 = (iHashCode48 ^ (str43 == null ? 0 : str43.hashCode())) * 1000003;
                String str44 = this.directChatUserId;
                int iHashCode50 = (iHashCode49 ^ (str44 == null ? 0 : str44.hashCode())) * 1000003;
                String str45 = this.primaryTeamId;
                int iHashCode51 = (iHashCode50 ^ (str45 == null ? 0 : str45.hashCode())) * 1000003;
                String str46 = this.linkedEngagementIdIfBroadcast;
                int iHashCode52 = (iHashCode51 ^ (str46 == null ? 0 : str46.hashCode())) * 1000003;
                String str47 = this.createdAt;
                int iHashCode53 = (iHashCode52 ^ (str47 == null ? 0 : str47.hashCode())) * 1000003;
                String str48 = this.updatedAt;
                this.$hashCode = iHashCode53 ^ (str48 != null ? str48.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String headerText() {
            return this.headerText;
        }

        public String headerType() {
            return this.headerType;
        }

        public String id() {
            return this.id;
        }

        public String internalTemplateId() {
            return this.internalTemplateId;
        }

        public Boolean isInbound() {
            return this.isInbound;
        }

        public Boolean isStarred() {
            return this.isStarred;
        }

        public String linkedEngagementIdIfBroadcast() {
            return this.linkedEngagementIdIfBroadcast;
        }

        public String locationObjectToSend() {
            return this.locationObjectToSend;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], Item.this.messagePlatform);
                    responseWriter.writeString(responseFieldArr[5], Item.this.externalMessageReferenceId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.externalConversationId);
                    responseWriter.writeString(responseFieldArr[7], Item.this.recipientExternalId);
                    responseWriter.writeString(responseFieldArr[8], Item.this.recipientExternalIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.visitorId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.referredContactId);
                    responseWriter.writeString(responseFieldArr[13], Item.this.messageType);
                    responseWriter.writeString(responseFieldArr[14], Item.this.messageSubType);
                    responseWriter.writeString(responseFieldArr[15], Item.this.messageCategory);
                    ResponseField responseField = responseFieldArr[16];
                    MessageSendCategory messageSendCategory = Item.this.messageSendCategory;
                    responseWriter.writeString(responseField, messageSendCategory != null ? messageSendCategory.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.replyingToMessageId);
                    responseWriter.writeString(responseFieldArr[18], Item.this.replyingToMessageIdExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.responseMessageId);
                    responseWriter.writeString(responseFieldArr[20], Item.this.followUpType);
                    responseWriter.writeString(responseFieldArr[21], Item.this.replyType);
                    responseWriter.writeString(responseFieldArr[22], Item.this.replyTypeId);
                    responseWriter.writeString(responseFieldArr[23], Item.this.referredProductCatalogId);
                    responseWriter.writeString(responseFieldArr[24], Item.this.referredProductRetailerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Item.this.referral);
                    responseWriter.writeBoolean(responseFieldArr[26], Item.this.isStarred);
                    responseWriter.writeString(responseFieldArr[27], Item.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[28], Item.this.errorMessages);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[29], Item.this.sentAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], Item.this.deliveredAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], Item.this.readAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Item.this.internalTemplateId);
                    responseWriter.writeString(responseFieldArr[33], Item.this.externalTemplateId);
                    responseWriter.writeString(responseFieldArr[34], Item.this.externalTemplateCategory);
                    responseWriter.writeString(responseFieldArr[35], Item.this.text);
                    responseWriter.writeList(responseFieldArr[36], Item.this.contactObjectToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], Item.this.locationObjectToSend);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], Item.this.adddressMessageParameters);
                    responseWriter.writeString(responseFieldArr[39], Item.this.headerText);
                    responseWriter.writeString(responseFieldArr[40], Item.this.footerText);
                    responseWriter.writeString(responseFieldArr[41], Item.this.headerType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], Item.this.mediaObjectId);
                    responseWriter.writeString(responseFieldArr[43], Item.this.mediaMetadata);
                    responseWriter.writeBoolean(responseFieldArr[44], Item.this.hasImage);
                    responseWriter.writeString(responseFieldArr[45], Item.this.thumbnailUrl);
                    responseWriter.writeBoolean(responseFieldArr[46], Item.this.isInbound);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], Item.this.chatUserId);
                    responseWriter.writeString(responseFieldArr[48], Item.this.chatUserName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[49], Item.this.chatBotId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], Item.this.chatUserAccountIdIfExternal);
                    responseWriter.writeString(responseFieldArr[51], Item.this.chatUserAccountNameIfExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], Item.this.directChatUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[53], Item.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], Item.this.linkedEngagementIdIfBroadcast);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], Item.this.updatedAt);
                }
            };
        }

        public String mediaMetadata() {
            return this.mediaMetadata;
        }

        public String mediaObjectId() {
            return this.mediaObjectId;
        }

        public String messageCategory() {
            return this.messageCategory;
        }

        public String messagePlatform() {
            return this.messagePlatform;
        }

        public MessageSendCategory messageSendCategory() {
            return this.messageSendCategory;
        }

        public String messageSubType() {
            return this.messageSubType;
        }

        public String messageType() {
            return this.messageType;
        }

        public String phoneNumberIdExternal() {
            return this.phoneNumberIdExternal;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String readAt() {
            return this.readAt;
        }

        public String recipientExternalId() {
            return this.recipientExternalId;
        }

        public String recipientExternalIdType() {
            return this.recipientExternalIdType;
        }

        public String referral() {
            return this.referral;
        }

        public String referredContactId() {
            return this.referredContactId;
        }

        public String referredProductCatalogId() {
            return this.referredProductCatalogId;
        }

        public String referredProductRetailerId() {
            return this.referredProductRetailerId;
        }

        public String replyType() {
            return this.replyType;
        }

        public String replyTypeId() {
            return this.replyTypeId;
        }

        public String replyingToMessageId() {
            return this.replyingToMessageId;
        }

        public String replyingToMessageIdExternal() {
            return this.replyingToMessageIdExternal;
        }

        public String responseMessageId() {
            return this.responseMessageId;
        }

        public String sentAt() {
            return this.sentAt;
        }

        public String status() {
            return this.status;
        }

        public String text() {
            return this.text;
        }

        public String thumbnailUrl() {
            return this.thumbnailUrl;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", messagePlatform=" + this.messagePlatform + ", externalMessageReferenceId=" + this.externalMessageReferenceId + ", externalConversationId=" + this.externalConversationId + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", channelId=" + this.channelId + ", contactId=" + this.contactId + ", visitorId=" + this.visitorId + ", referredContactId=" + this.referredContactId + ", messageType=" + this.messageType + ", messageSubType=" + this.messageSubType + ", messageCategory=" + this.messageCategory + ", messageSendCategory=" + this.messageSendCategory + ", replyingToMessageId=" + this.replyingToMessageId + ", replyingToMessageIdExternal=" + this.replyingToMessageIdExternal + ", responseMessageId=" + this.responseMessageId + ", followUpType=" + this.followUpType + ", replyType=" + this.replyType + ", replyTypeId=" + this.replyTypeId + ", referredProductCatalogId=" + this.referredProductCatalogId + ", referredProductRetailerId=" + this.referredProductRetailerId + ", referral=" + this.referral + ", isStarred=" + this.isStarred + ", status=" + this.status + ", errorMessages=" + this.errorMessages + ", sentAt=" + this.sentAt + ", deliveredAt=" + this.deliveredAt + ", readAt=" + this.readAt + ", internalTemplateId=" + this.internalTemplateId + ", externalTemplateId=" + this.externalTemplateId + ", externalTemplateCategory=" + this.externalTemplateCategory + ", text=" + this.text + ", contactObjectToSend=" + this.contactObjectToSend + ", locationObjectToSend=" + this.locationObjectToSend + ", adddressMessageParameters=" + this.adddressMessageParameters + ", headerText=" + this.headerText + ", footerText=" + this.footerText + ", headerType=" + this.headerType + ", mediaObjectId=" + this.mediaObjectId + ", mediaMetadata=" + this.mediaMetadata + ", hasImage=" + this.hasImage + ", thumbnailUrl=" + this.thumbnailUrl + ", isInbound=" + this.isInbound + ", chatUserId=" + this.chatUserId + ", chatUserName=" + this.chatUserName + ", chatBotId=" + this.chatBotId + ", chatUserAccountIdIfExternal=" + this.chatUserAccountIdIfExternal + ", chatUserAccountNameIfExternal=" + this.chatUserAccountNameIfExternal + ", directChatUserId=" + this.directChatUserId + ", primaryTeamId=" + this.primaryTeamId + ", linkedEngagementIdIfBroadcast=" + this.linkedEngagementIdIfBroadcast + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String visitorId() {
            return this.visitorId;
        }
    }

    public static class SearchChatMessages {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchChatMessages> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchChatMessages map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchChatMessages.$responseFields;
                return new SearchChatMessages(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.SearchChatMessages.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.SearchChatMessages.Mapper.1.1
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

        public SearchChatMessages(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchChatMessages)) {
                return false;
            }
            SearchChatMessages searchChatMessages = (SearchChatMessages) obj;
            if (this.__typename.equals(searchChatMessages.__typename) && this.items.equals(searchChatMessages.items) && ((str = this.nextToken) != null ? str.equals(searchChatMessages.nextToken) : searchChatMessages.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchChatMessages.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.SearchChatMessages.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchChatMessages.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchChatMessages.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchChatMessages.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.SearchChatMessages.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchChatMessages.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchChatMessages.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchChatMessages{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableChatMessageFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableChatMessageSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableChatMessageFilterInput searchableChatMessageFilterInput, SearchableChatMessageSortInput searchableChatMessageSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableChatMessageFilterInput;
            this.sort = searchableChatMessageSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableChatMessageFilterInput);
            linkedHashMap.put("sort", searchableChatMessageSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableChatMessageFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery.Variables.1
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

        public SearchableChatMessageSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchChatMessagesQuery(SearchableChatMessageFilterInput searchableChatMessageFilterInput, SearchableChatMessageSortInput searchableChatMessageSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableChatMessageFilterInput, searchableChatMessageSortInput, num, str, num2);
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
        return "94deaec5c3f4fc146422a17a6e4abc7a6b509e3e39088c5edef2d6eb96fac065";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchChatMessages($filter: SearchableChatMessageFilterInput, $sort: SearchableChatMessageSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchChatMessages(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
