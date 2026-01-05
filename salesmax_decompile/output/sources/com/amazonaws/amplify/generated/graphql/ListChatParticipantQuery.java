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
import type.ModelChatParticipantFilterInput;

/* loaded from: classes8.dex */
public final class ListChatParticipantQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListChatParticipant($filter: ModelChatParticipantFilterInput, $limit: Int, $nextToken: String) {\n  listChatParticipant(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      channelId\n      phoneNumberIdExternal\n      participantId\n      participationStatus\n      unreadMessageCount\n      lastViewed\n      isStarred\n      joinedAt\n      leftAt\n      channelName\n      channelType\n      channelSubType\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      isNewMessageUpdate\n      tags\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListChatParticipant";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListChatParticipant($filter: ModelChatParticipantFilterInput, $limit: Int, $nextToken: String) {\n  listChatParticipant(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      channelId\n      phoneNumberIdExternal\n      participantId\n      participationStatus\n      unreadMessageCount\n      lastViewed\n      isStarred\n      joinedAt\n      leftAt\n      channelName\n      channelType\n      channelSubType\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      isNewMessageUpdate\n      tags\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelChatParticipantFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListChatParticipantQuery build() {
            return new ListChatParticipantQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelChatParticipantFilterInput modelChatParticipantFilterInput) {
            this.filter = modelChatParticipantFilterInput;
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
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listChatParticipant", "listChatParticipant", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListChatParticipant listChatParticipant;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListChatParticipant.Mapper listChatParticipantFieldMapper = new ListChatParticipant.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListChatParticipant) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListChatParticipant>() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListChatParticipant read(ResponseReader responseReader2) {
                        return Mapper.this.listChatParticipantFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListChatParticipant listChatParticipant) {
            this.listChatParticipant = listChatParticipant;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListChatParticipant listChatParticipant = this.listChatParticipant;
            ListChatParticipant listChatParticipant2 = ((Data) obj).listChatParticipant;
            return listChatParticipant == null ? listChatParticipant2 == null : listChatParticipant.equals(listChatParticipant2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListChatParticipant listChatParticipant = this.listChatParticipant;
                this.$hashCode = (listChatParticipant == null ? 0 : listChatParticipant.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListChatParticipant listChatParticipant() {
            return this.listChatParticipant;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListChatParticipant listChatParticipant = Data.this.listChatParticipant;
                    responseWriter.writeObject(responseField, listChatParticipant != null ? listChatParticipant.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listChatParticipant=" + this.listChatParticipant + "}";
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
        final String channelName;
        final String channelOpenUntil;
        final String channelStatus;
        final String channelSubType;
        final String channelType;
        final String channelWillBeChargedNext;
        final String createdAt;
        final String id;
        final Boolean isLastMessageByLead;
        final Boolean isNewMessageUpdate;
        final Boolean isStarred;
        final String joinedAt;
        final String lastMessageByLeadTime;
        final String lastMessageByUserTime;
        final String lastOutboundMessageId;
        final String lastOutboundMessageStatus;
        final String lastViewed;
        final String leftAt;
        final String participantId;
        final String participantScopeIfInternal;
        final String participationStatus;
        final String phoneNumberIdExternal;
        final List<String> tags;
        final Integer unreadMessageCount;
        final String updatedAt;
        final String userIdsForDirectChannel;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readBoolean(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readBoolean(responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), responseReader.readBoolean(responseFieldArr[23]), responseReader.readList(responseFieldArr[24], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[25]), responseReader.readString(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[28]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("participantId", "participantId", null, false, customType, Collections.emptyList()), ResponseField.forString("participationStatus", "participationStatus", null, false, Collections.emptyList()), ResponseField.forInt("unreadMessageCount", "unreadMessageCount", null, true, Collections.emptyList()), ResponseField.forCustomType("lastViewed", "lastViewed", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isStarred", "isStarred", null, true, Collections.emptyList()), ResponseField.forCustomType("joinedAt", "joinedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("leftAt", "leftAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("channelName", "channelName", null, true, Collections.emptyList()), ResponseField.forString("channelType", "channelType", null, true, Collections.emptyList()), ResponseField.forString("channelSubType", "channelSubType", null, true, Collections.emptyList()), ResponseField.forString("channelStatus", "channelStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("channelWillBeChargedNext", "channelWillBeChargedNext", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("channelOpenUntil", "channelOpenUntil", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByLeadTime", "lastMessageByLeadTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByUserTime", "lastMessageByUserTime", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isLastMessageByLead", "isLastMessageByLead", null, true, Collections.emptyList()), ResponseField.forCustomType("lastOutboundMessageId", "lastOutboundMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastOutboundMessageStatus", "lastOutboundMessageStatus", null, true, Collections.emptyList()), ResponseField.forBoolean("isNewMessageUpdate", "isNewMessageUpdate", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("participantScopeIfInternal", "participantScopeIfInternal", null, true, Collections.emptyList()), ResponseField.forString("userIdsForDirectChannel", "userIdsForDirectChannel", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool2, String str19, String str20, Boolean bool3, List<String> list, String str21, String str22, String str23, String str24) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.channelId = (String) Utils.checkNotNull(str4, "channelId == null");
            this.phoneNumberIdExternal = str5;
            this.participantId = (String) Utils.checkNotNull(str6, "participantId == null");
            this.participationStatus = (String) Utils.checkNotNull(str7, "participationStatus == null");
            this.unreadMessageCount = num;
            this.lastViewed = str8;
            this.isStarred = bool;
            this.joinedAt = str9;
            this.leftAt = str10;
            this.channelName = str11;
            this.channelType = str12;
            this.channelSubType = str13;
            this.channelStatus = str14;
            this.channelWillBeChargedNext = str15;
            this.channelOpenUntil = str16;
            this.lastMessageByLeadTime = str17;
            this.lastMessageByUserTime = str18;
            this.isLastMessageByLead = bool2;
            this.lastOutboundMessageId = str19;
            this.lastOutboundMessageStatus = str20;
            this.isNewMessageUpdate = bool3;
            this.tags = list;
            this.participantScopeIfInternal = str21;
            this.userIdsForDirectChannel = str22;
            this.createdAt = str23;
            this.updatedAt = str24;
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

        public String channelName() {
            return this.channelName;
        }

        public String channelOpenUntil() {
            return this.channelOpenUntil;
        }

        public String channelStatus() {
            return this.channelStatus;
        }

        public String channelSubType() {
            return this.channelSubType;
        }

        public String channelType() {
            return this.channelType;
        }

        public String channelWillBeChargedNext() {
            return this.channelWillBeChargedNext;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            Integer num;
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
            String str11;
            String str12;
            Boolean bool2;
            String str13;
            String str14;
            Boolean bool3;
            List<String> list;
            String str15;
            String str16;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.channelId.equals(item.channelId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(item.phoneNumberIdExternal) : item.phoneNumberIdExternal == null) && this.participantId.equals(item.participantId) && this.participationStatus.equals(item.participationStatus) && ((num = this.unreadMessageCount) != null ? num.equals(item.unreadMessageCount) : item.unreadMessageCount == null) && ((str2 = this.lastViewed) != null ? str2.equals(item.lastViewed) : item.lastViewed == null) && ((bool = this.isStarred) != null ? bool.equals(item.isStarred) : item.isStarred == null) && ((str3 = this.joinedAt) != null ? str3.equals(item.joinedAt) : item.joinedAt == null) && ((str4 = this.leftAt) != null ? str4.equals(item.leftAt) : item.leftAt == null) && ((str5 = this.channelName) != null ? str5.equals(item.channelName) : item.channelName == null) && ((str6 = this.channelType) != null ? str6.equals(item.channelType) : item.channelType == null) && ((str7 = this.channelSubType) != null ? str7.equals(item.channelSubType) : item.channelSubType == null) && ((str8 = this.channelStatus) != null ? str8.equals(item.channelStatus) : item.channelStatus == null) && ((str9 = this.channelWillBeChargedNext) != null ? str9.equals(item.channelWillBeChargedNext) : item.channelWillBeChargedNext == null) && ((str10 = this.channelOpenUntil) != null ? str10.equals(item.channelOpenUntil) : item.channelOpenUntil == null) && ((str11 = this.lastMessageByLeadTime) != null ? str11.equals(item.lastMessageByLeadTime) : item.lastMessageByLeadTime == null) && ((str12 = this.lastMessageByUserTime) != null ? str12.equals(item.lastMessageByUserTime) : item.lastMessageByUserTime == null) && ((bool2 = this.isLastMessageByLead) != null ? bool2.equals(item.isLastMessageByLead) : item.isLastMessageByLead == null) && ((str13 = this.lastOutboundMessageId) != null ? str13.equals(item.lastOutboundMessageId) : item.lastOutboundMessageId == null) && ((str14 = this.lastOutboundMessageStatus) != null ? str14.equals(item.lastOutboundMessageStatus) : item.lastOutboundMessageStatus == null) && ((bool3 = this.isNewMessageUpdate) != null ? bool3.equals(item.isNewMessageUpdate) : item.isNewMessageUpdate == null) && ((list = this.tags) != null ? list.equals(item.tags) : item.tags == null) && ((str15 = this.participantScopeIfInternal) != null ? str15.equals(item.participantScopeIfInternal) : item.participantScopeIfInternal == null) && ((str16 = this.userIdsForDirectChannel) != null ? str16.equals(item.userIdsForDirectChannel) : item.userIdsForDirectChannel == null) && ((str17 = this.createdAt) != null ? str17.equals(item.createdAt) : item.createdAt == null)) {
                String str18 = this.updatedAt;
                String str19 = item.updatedAt;
                if (str18 == null) {
                    if (str19 == null) {
                        return true;
                    }
                } else if (str18.equals(str19)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.channelId.hashCode()) * 1000003;
                String str = this.phoneNumberIdExternal;
                int iHashCode2 = (((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.participantId.hashCode()) * 1000003) ^ this.participationStatus.hashCode()) * 1000003;
                Integer num = this.unreadMessageCount;
                int iHashCode3 = (iHashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str2 = this.lastViewed;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.isStarred;
                int iHashCode5 = (iHashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str3 = this.joinedAt;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.leftAt;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.channelName;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.channelType;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.channelSubType;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.channelStatus;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.channelWillBeChargedNext;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.channelOpenUntil;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.lastMessageByLeadTime;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.lastMessageByUserTime;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                Boolean bool2 = this.isLastMessageByLead;
                int iHashCode16 = (iHashCode15 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str13 = this.lastOutboundMessageId;
                int iHashCode17 = (iHashCode16 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.lastOutboundMessageStatus;
                int iHashCode18 = (iHashCode17 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                Boolean bool3 = this.isNewMessageUpdate;
                int iHashCode19 = (iHashCode18 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode20 = (iHashCode19 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str15 = this.participantScopeIfInternal;
                int iHashCode21 = (iHashCode20 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.userIdsForDirectChannel;
                int iHashCode22 = (iHashCode21 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdAt;
                int iHashCode23 = (iHashCode22 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedAt;
                this.$hashCode = iHashCode23 ^ (str18 != null ? str18.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isLastMessageByLead() {
            return this.isLastMessageByLead;
        }

        public Boolean isNewMessageUpdate() {
            return this.isNewMessageUpdate;
        }

        public Boolean isStarred() {
            return this.isStarred;
        }

        public String joinedAt() {
            return this.joinedAt;
        }

        public String lastMessageByLeadTime() {
            return this.lastMessageByLeadTime;
        }

        public String lastMessageByUserTime() {
            return this.lastMessageByUserTime;
        }

        public String lastOutboundMessageId() {
            return this.lastOutboundMessageId;
        }

        public String lastOutboundMessageStatus() {
            return this.lastOutboundMessageStatus;
        }

        public String lastViewed() {
            return this.lastViewed;
        }

        public String leftAt() {
            return this.leftAt;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.channelId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.phoneNumberIdExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.participantId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.participationStatus);
                    responseWriter.writeInt(responseFieldArr[7], Item.this.unreadMessageCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.lastViewed);
                    responseWriter.writeBoolean(responseFieldArr[9], Item.this.isStarred);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.joinedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.leftAt);
                    responseWriter.writeString(responseFieldArr[12], Item.this.channelName);
                    responseWriter.writeString(responseFieldArr[13], Item.this.channelType);
                    responseWriter.writeString(responseFieldArr[14], Item.this.channelSubType);
                    responseWriter.writeString(responseFieldArr[15], Item.this.channelStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.channelWillBeChargedNext);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.channelOpenUntil);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.lastMessageByLeadTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.lastMessageByUserTime);
                    responseWriter.writeBoolean(responseFieldArr[20], Item.this.isLastMessageByLead);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.lastOutboundMessageId);
                    responseWriter.writeString(responseFieldArr[22], Item.this.lastOutboundMessageStatus);
                    responseWriter.writeBoolean(responseFieldArr[23], Item.this.isNewMessageUpdate);
                    responseWriter.writeList(responseFieldArr[24], Item.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[25], Item.this.participantScopeIfInternal);
                    responseWriter.writeString(responseFieldArr[26], Item.this.userIdsForDirectChannel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[28], Item.this.updatedAt);
                }
            };
        }

        public String participantId() {
            return this.participantId;
        }

        public String participantScopeIfInternal() {
            return this.participantScopeIfInternal;
        }

        public String participationStatus() {
            return this.participationStatus;
        }

        public String phoneNumberIdExternal() {
            return this.phoneNumberIdExternal;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", channelId=" + this.channelId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", participantId=" + this.participantId + ", participationStatus=" + this.participationStatus + ", unreadMessageCount=" + this.unreadMessageCount + ", lastViewed=" + this.lastViewed + ", isStarred=" + this.isStarred + ", joinedAt=" + this.joinedAt + ", leftAt=" + this.leftAt + ", channelName=" + this.channelName + ", channelType=" + this.channelType + ", channelSubType=" + this.channelSubType + ", channelStatus=" + this.channelStatus + ", channelWillBeChargedNext=" + this.channelWillBeChargedNext + ", channelOpenUntil=" + this.channelOpenUntil + ", lastMessageByLeadTime=" + this.lastMessageByLeadTime + ", lastMessageByUserTime=" + this.lastMessageByUserTime + ", isLastMessageByLead=" + this.isLastMessageByLead + ", lastOutboundMessageId=" + this.lastOutboundMessageId + ", lastOutboundMessageStatus=" + this.lastOutboundMessageStatus + ", isNewMessageUpdate=" + this.isNewMessageUpdate + ", tags=" + this.tags + ", participantScopeIfInternal=" + this.participantScopeIfInternal + ", userIdsForDirectChannel=" + this.userIdsForDirectChannel + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public Integer unreadMessageCount() {
            return this.unreadMessageCount;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userIdsForDirectChannel() {
            return this.userIdsForDirectChannel;
        }
    }

    public static class ListChatParticipant {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListChatParticipant> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListChatParticipant map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListChatParticipant.$responseFields;
                return new ListChatParticipant(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.ListChatParticipant.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.ListChatParticipant.Mapper.1.1
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

        public ListChatParticipant(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListChatParticipant)) {
                return false;
            }
            ListChatParticipant listChatParticipant = (ListChatParticipant) obj;
            if (this.__typename.equals(listChatParticipant.__typename) && this.items.equals(listChatParticipant.items)) {
                String str = this.nextToken;
                String str2 = listChatParticipant.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.ListChatParticipant.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListChatParticipant.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListChatParticipant.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListChatParticipant.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.ListChatParticipant.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListChatParticipant.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListChatParticipant{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelChatParticipantFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelChatParticipantFilterInput modelChatParticipantFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelChatParticipantFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelChatParticipantFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelChatParticipantFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListChatParticipantQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ListChatParticipantQuery(ModelChatParticipantFilterInput modelChatParticipantFilterInput, Integer num, String str) {
        this.variables = new Variables(modelChatParticipantFilterInput, num, str);
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
        return "dfada97201eccb33997a77535f2548c3c5e4ae2cee5ef740bbe8865ca699c6e9";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListChatParticipant($filter: ModelChatParticipantFilterInput, $limit: Int, $nextToken: String) {\n  listChatParticipant(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      channelId\n      phoneNumberIdExternal\n      participantId\n      participationStatus\n      unreadMessageCount\n      lastViewed\n      isStarred\n      joinedAt\n      leftAt\n      channelName\n      channelType\n      channelSubType\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      isNewMessageUpdate\n      tags\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
