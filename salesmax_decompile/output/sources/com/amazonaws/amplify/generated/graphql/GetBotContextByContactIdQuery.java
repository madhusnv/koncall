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
import type.ModelChatBotContextFilterInput;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetBotContextByContactIdQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetBotContextByContactId($accountId: ID, $contactId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatBotContextFilterInput, $limit: Int, $nextToken: String) {\n  getBotContextByContactId(accountId: $accountId, contactId: $contactId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      handlerChatBot\n      masterChatBot\n      accountId\n      contactId\n      userId\n      channelId\n      lastChatMessageId\n      createdAt\n      updatedAt\n      isPaused\n      pausedBy\n      pausedById\n      pausedAt\n      currentIntent\n      intentList\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetBotContextByContactId";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetBotContextByContactId($accountId: ID, $contactId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatBotContextFilterInput, $limit: Int, $nextToken: String) {\n  getBotContextByContactId(accountId: $accountId, contactId: $contactId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      handlerChatBot\n      masterChatBot\n      accountId\n      contactId\n      userId\n      channelId\n      lastChatMessageId\n      createdAt\n      updatedAt\n      isPaused\n      pausedBy\n      pausedById\n      pausedAt\n      currentIntent\n      intentList\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelIDKeyConditionInput contactId;
        private ModelChatBotContextFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetBotContextByContactIdQuery build() {
            return new GetBotContextByContactIdQuery(this.accountId, this.contactId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder contactId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.contactId = modelIDKeyConditionInput;
            return this;
        }

        public Builder filter(ModelChatBotContextFilterInput modelChatBotContextFilterInput) {
            this.filter = modelChatBotContextFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getBotContextByContactId", "getBotContextByContactId", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("contactId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "contactId").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetBotContextByContactId getBotContextByContactId;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetBotContextByContactId.Mapper getBotContextByContactIdFieldMapper = new GetBotContextByContactId.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetBotContextByContactId) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetBotContextByContactId>() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetBotContextByContactId read(ResponseReader responseReader2) {
                        return Mapper.this.getBotContextByContactIdFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetBotContextByContactId getBotContextByContactId) {
            this.getBotContextByContactId = getBotContextByContactId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetBotContextByContactId getBotContextByContactId = this.getBotContextByContactId;
            GetBotContextByContactId getBotContextByContactId2 = ((Data) obj).getBotContextByContactId;
            return getBotContextByContactId == null ? getBotContextByContactId2 == null : getBotContextByContactId.equals(getBotContextByContactId2);
        }

        public GetBotContextByContactId getBotContextByContactId() {
            return this.getBotContextByContactId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetBotContextByContactId getBotContextByContactId = this.getBotContextByContactId;
                this.$hashCode = (getBotContextByContactId == null ? 0 : getBotContextByContactId.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetBotContextByContactId getBotContextByContactId = Data.this.getBotContextByContactId;
                    responseWriter.writeObject(responseField, getBotContextByContactId != null ? getBotContextByContactId.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getBotContextByContactId=" + this.getBotContextByContactId + "}";
            }
            return this.$toString;
        }
    }

    public static class GetBotContextByContactId {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetBotContextByContactId> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetBotContextByContactId map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetBotContextByContactId.$responseFields;
                return new GetBotContextByContactId(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.GetBotContextByContactId.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.GetBotContextByContactId.Mapper.1.1
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

        public GetBotContextByContactId(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetBotContextByContactId)) {
                return false;
            }
            GetBotContextByContactId getBotContextByContactId = (GetBotContextByContactId) obj;
            if (this.__typename.equals(getBotContextByContactId.__typename) && this.items.equals(getBotContextByContactId.items)) {
                String str = this.nextToken;
                String str2 = getBotContextByContactId.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.GetBotContextByContactId.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetBotContextByContactId.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetBotContextByContactId.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetBotContextByContactId.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.GetBotContextByContactId.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetBotContextByContactId.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetBotContextByContactId{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String channelId;
        final String contactId;
        final String createdAt;
        final String currentIntent;
        final String handlerChatBot;
        final String id;
        final List<String> intentList;
        final Boolean isPaused;
        final String lastChatMessageId;
        final String masterChatBot;
        final String pausedAt;
        final String pausedBy;
        final String pausedById;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), responseReader.readBoolean(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readList(responseFieldArr[16], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, true, customType, Collections.emptyList()), ResponseField.forCustomType("handlerChatBot", "handlerChatBot", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("masterChatBot", "masterChatBot", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastChatMessageId", "lastChatMessageId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isPaused", "isPaused", null, true, Collections.emptyList()), ResponseField.forString("pausedBy", "pausedBy", null, true, Collections.emptyList()), ResponseField.forCustomType("pausedById", "pausedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("pausedAt", "pausedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("currentIntent", "currentIntent", null, true, Collections.emptyList()), ResponseField.forList("intentList", "intentList", null, true, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, String str14, String str15, List<String> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = str2;
            this.handlerChatBot = str3;
            this.masterChatBot = str4;
            this.accountId = str5;
            this.contactId = str6;
            this.userId = str7;
            this.channelId = str8;
            this.lastChatMessageId = str9;
            this.createdAt = str10;
            this.updatedAt = str11;
            this.isPaused = bool;
            this.pausedBy = str12;
            this.pausedById = str13;
            this.pausedAt = str14;
            this.currentIntent = str15;
            this.intentList = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String channelId() {
            return this.channelId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String currentIntent() {
            return this.currentIntent;
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
            Boolean bool;
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
            if (this.__typename.equals(item.__typename) && ((str = this.id) != null ? str.equals(item.id) : item.id == null) && ((str2 = this.handlerChatBot) != null ? str2.equals(item.handlerChatBot) : item.handlerChatBot == null) && ((str3 = this.masterChatBot) != null ? str3.equals(item.masterChatBot) : item.masterChatBot == null) && ((str4 = this.accountId) != null ? str4.equals(item.accountId) : item.accountId == null) && ((str5 = this.contactId) != null ? str5.equals(item.contactId) : item.contactId == null) && ((str6 = this.userId) != null ? str6.equals(item.userId) : item.userId == null) && ((str7 = this.channelId) != null ? str7.equals(item.channelId) : item.channelId == null) && ((str8 = this.lastChatMessageId) != null ? str8.equals(item.lastChatMessageId) : item.lastChatMessageId == null) && ((str9 = this.createdAt) != null ? str9.equals(item.createdAt) : item.createdAt == null) && ((str10 = this.updatedAt) != null ? str10.equals(item.updatedAt) : item.updatedAt == null) && ((bool = this.isPaused) != null ? bool.equals(item.isPaused) : item.isPaused == null) && ((str11 = this.pausedBy) != null ? str11.equals(item.pausedBy) : item.pausedBy == null) && ((str12 = this.pausedById) != null ? str12.equals(item.pausedById) : item.pausedById == null) && ((str13 = this.pausedAt) != null ? str13.equals(item.pausedAt) : item.pausedAt == null) && ((str14 = this.currentIntent) != null ? str14.equals(item.currentIntent) : item.currentIntent == null)) {
                List<String> list = this.intentList;
                List<String> list2 = item.intentList;
                if (list == null) {
                    if (list2 == null) {
                        return true;
                    }
                } else if (list.equals(list2)) {
                    return true;
                }
            }
            return false;
        }

        public String handlerChatBot() {
            return this.handlerChatBot;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.id;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.handlerChatBot;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.masterChatBot;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.accountId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.contactId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.userId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.channelId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.lastChatMessageId;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.updatedAt;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                Boolean bool = this.isPaused;
                int iHashCode12 = (iHashCode11 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str11 = this.pausedBy;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.pausedById;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.pausedAt;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.currentIntent;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                List<String> list = this.intentList;
                this.$hashCode = iHashCode16 ^ (list != null ? list.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public List<String> intentList() {
            return this.intentList;
        }

        public Boolean isPaused() {
            return this.isPaused;
        }

        public String lastChatMessageId() {
            return this.lastChatMessageId;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.handlerChatBot);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.masterChatBot);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.lastChatMessageId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.updatedAt);
                    responseWriter.writeBoolean(responseFieldArr[11], Item.this.isPaused);
                    responseWriter.writeString(responseFieldArr[12], Item.this.pausedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.pausedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.pausedAt);
                    responseWriter.writeString(responseFieldArr[15], Item.this.currentIntent);
                    responseWriter.writeList(responseFieldArr[16], Item.this.intentList, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                }
            };
        }

        public String masterChatBot() {
            return this.masterChatBot;
        }

        public String pausedAt() {
            return this.pausedAt;
        }

        public String pausedBy() {
            return this.pausedBy;
        }

        public String pausedById() {
            return this.pausedById;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", handlerChatBot=" + this.handlerChatBot + ", masterChatBot=" + this.masterChatBot + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", userId=" + this.userId + ", channelId=" + this.channelId + ", lastChatMessageId=" + this.lastChatMessageId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", isPaused=" + this.isPaused + ", pausedBy=" + this.pausedBy + ", pausedById=" + this.pausedById + ", pausedAt=" + this.pausedAt + ", currentIntent=" + this.currentIntent + ", intentList=" + this.intentList + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelIDKeyConditionInput contactId;
        private final ModelChatBotContextFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelChatBotContextFilterInput modelChatBotContextFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.contactId = modelIDKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelChatBotContextFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("contactId", modelIDKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelChatBotContextFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelIDKeyConditionInput contactId() {
            return this.contactId;
        }

        public ModelChatBotContextFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBotContextByContactIdQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("contactId", Variables.this.contactId != null ? Variables.this.contactId.marshaller() : null);
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

    public GetBotContextByContactIdQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelChatBotContextFilterInput modelChatBotContextFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelSortDirection, modelChatBotContextFilterInput, num, str2);
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
        return "8721f53d1691fbad8ef5105e497ba01b8f9b01f665fd8fc18132aded3dc38600";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetBotContextByContactId($accountId: ID, $contactId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatBotContextFilterInput, $limit: Int, $nextToken: String) {\n  getBotContextByContactId(accountId: $accountId, contactId: $contactId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      handlerChatBot\n      masterChatBot\n      accountId\n      contactId\n      userId\n      channelId\n      lastChatMessageId\n      createdAt\n      updatedAt\n      isPaused\n      pausedBy\n      pausedById\n      pausedAt\n      currentIntent\n      intentList\n    }\n    nextToken\n  }\n}";
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
