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
import type.ContactAssignmentStatus;
import type.CustomType;
import type.ModelChatChannelFilterInput;

/* loaded from: classes8.dex */
public final class ListChatChannelsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListChatChannels($filter: ModelChatChannelFilterInput, $limit: Int, $nextToken: String) {\n  listChatChannels(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListChatChannels";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListChatChannels($filter: ModelChatChannelFilterInput, $limit: Int, $nextToken: String) {\n  listChatChannels(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelChatChannelFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListChatChannelsQuery build() {
            return new ListChatChannelsQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelChatChannelFilterInput modelChatChannelFilterInput) {
            this.filter = modelChatChannelFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("listChatChannels", "listChatChannels", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListChatChannels listChatChannels;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListChatChannels.Mapper listChatChannelsFieldMapper = new ListChatChannels.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListChatChannels) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListChatChannels>() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListChatChannels read(ResponseReader responseReader2) {
                        return Mapper.this.listChatChannelsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListChatChannels listChatChannels) {
            this.listChatChannels = listChatChannels;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListChatChannels listChatChannels = this.listChatChannels;
            ListChatChannels listChatChannels2 = ((Data) obj).listChatChannels;
            return listChatChannels == null ? listChatChannels2 == null : listChatChannels.equals(listChatChannels2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListChatChannels listChatChannels = this.listChatChannels;
                this.$hashCode = (listChatChannels == null ? 0 : listChatChannels.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListChatChannels listChatChannels() {
            return this.listChatChannels;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListChatChannels listChatChannels = Data.this.listChatChannels;
                    responseWriter.writeObject(responseField, listChatChannels != null ? listChatChannels.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listChatChannels=" + this.listChatChannels + "}";
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
        final Boolean chanelHasOnlyBroadcast;
        final String channelName;
        final String channelOpenUntil;
        final String channelProfilePic;
        final String channelStatus;
        final String channelSubType;
        final String channelType;
        final String channelWillBeChargedNext;
        final String contactId;
        final String createdAt;
        final String createdById;
        final Boolean externalParticipantsAllowed;
        final String id;
        final Boolean isLastMessageByLead;
        final String lastMessageByLeadTime;
        final String lastMessageByUserTime;
        final String lastOutboundMessageId;
        final String lastOutboundMessageStatus;
        final Boolean lastOutboundMessageWasBroadcast;
        final String messagePlatform;
        final String ownerId;
        final String participantScopeIfInternal;
        final String phoneNumberIdExternal;
        final String primaryTeamId;
        final String readNotifiedAt;
        final String recipientExternalId;
        final String recipientExternalIdType;
        final String recipientType;
        final String salesmaxAccountId;
        final List<String> tags;
        final ContactAssignmentStatus toBeAssigned;
        final String updatedAt;
        final String userIdsForDirectChannel;
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
                List list = responseReader.readList(responseFieldArr[6], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string5 = responseReader.readString(responseFieldArr[7]);
                String string6 = responseReader.readString(responseFieldArr[8]);
                String string7 = responseReader.readString(responseFieldArr[9]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[10]);
                String string8 = responseReader.readString(responseFieldArr[11]);
                String string9 = responseReader.readString(responseFieldArr[12]);
                String string10 = responseReader.readString(responseFieldArr[13]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]);
                String string11 = responseReader.readString(responseFieldArr[18]);
                String string12 = responseReader.readString(responseFieldArr[19]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]);
                String string13 = responseReader.readString(responseFieldArr[22]);
                return new Item(string, str, str2, string2, string3, string4, list, string5, string6, string7, bool, string8, string9, string10, str3, str4, str5, str6, string11, string12, str7, str8, string13 != null ? ContactAssignmentStatus.valueOf(string13) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]), responseReader.readBoolean(responseFieldArr[27]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), responseReader.readBoolean(responseFieldArr[30]), responseReader.readBoolean(responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), responseReader.readString(responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[35]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forString("channelName", "channelName", null, true, Collections.emptyList()), ResponseField.forString("messagePlatform", "messagePlatform", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("recipientType", "recipientType", null, true, Collections.emptyList()), ResponseField.forString("channelType", "channelType", null, true, Collections.emptyList()), ResponseField.forString("channelSubType", "channelSubType", null, true, Collections.emptyList()), ResponseField.forBoolean("externalParticipantsAllowed", "externalParticipantsAllowed", null, true, Collections.emptyList()), ResponseField.forString("participantScopeIfInternal", "participantScopeIfInternal", null, true, Collections.emptyList()), ResponseField.forString("userIdsForDirectChannel", "userIdsForDirectChannel", null, true, Collections.emptyList()), ResponseField.forString("channelStatus", "channelStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("channelWillBeChargedNext", "channelWillBeChargedNext", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("channelOpenUntil", "channelOpenUntil", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("visitorId", "visitorId", null, true, customType, Collections.emptyList()), ResponseField.forString("recipientExternalId", "recipientExternalId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalIdType", "recipientExternalIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("readNotifiedAt", "readNotifiedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByLeadTime", "lastMessageByLeadTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByUserTime", "lastMessageByUserTime", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isLastMessageByLead", "isLastMessageByLead", null, true, Collections.emptyList()), ResponseField.forCustomType("lastOutboundMessageId", "lastOutboundMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastOutboundMessageStatus", "lastOutboundMessageStatus", null, true, Collections.emptyList()), ResponseField.forBoolean("lastOutboundMessageWasBroadcast", "lastOutboundMessageWasBroadcast", null, true, Collections.emptyList()), ResponseField.forBoolean("chanelHasOnlyBroadcast", "chanelHasOnlyBroadcast", null, true, Collections.emptyList()), ResponseField.forCustomType("salesmaxAccountId", "salesmaxAccountId", null, true, customType, Collections.emptyList()), ResponseField.forString("channelProfilePic", "channelProfilePic", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ContactAssignmentStatus contactAssignmentStatus, String str21, String str22, String str23, String str24, Boolean bool2, String str25, String str26, Boolean bool3, Boolean bool4, String str27, String str28, String str29, String str30) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.phoneNumberIdExternal = str4;
            this.channelName = str5;
            this.messagePlatform = str6;
            this.tags = list;
            this.recipientType = str7;
            this.channelType = str8;
            this.channelSubType = str9;
            this.externalParticipantsAllowed = bool;
            this.participantScopeIfInternal = str10;
            this.userIdsForDirectChannel = str11;
            this.channelStatus = str12;
            this.channelWillBeChargedNext = str13;
            this.channelOpenUntil = str14;
            this.contactId = str15;
            this.visitorId = str16;
            this.recipientExternalId = str17;
            this.recipientExternalIdType = str18;
            this.ownerId = str19;
            this.primaryTeamId = str20;
            this.toBeAssigned = contactAssignmentStatus;
            this.createdById = str21;
            this.readNotifiedAt = str22;
            this.lastMessageByLeadTime = str23;
            this.lastMessageByUserTime = str24;
            this.isLastMessageByLead = bool2;
            this.lastOutboundMessageId = str25;
            this.lastOutboundMessageStatus = str26;
            this.lastOutboundMessageWasBroadcast = bool3;
            this.chanelHasOnlyBroadcast = bool4;
            this.salesmaxAccountId = str27;
            this.channelProfilePic = str28;
            this.createdAt = str29;
            this.updatedAt = str30;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Boolean chanelHasOnlyBroadcast() {
            return this.chanelHasOnlyBroadcast;
        }

        public String channelName() {
            return this.channelName;
        }

        public String channelOpenUntil() {
            return this.channelOpenUntil;
        }

        public String channelProfilePic() {
            return this.channelProfilePic;
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

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            List<String> list;
            String str4;
            String str5;
            String str6;
            Boolean bool;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            ContactAssignmentStatus contactAssignmentStatus;
            String str18;
            String str19;
            String str20;
            String str21;
            Boolean bool2;
            String str22;
            String str23;
            Boolean bool3;
            Boolean bool4;
            String str24;
            String str25;
            String str26;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(item.phoneNumberIdExternal) : item.phoneNumberIdExternal == null) && ((str2 = this.channelName) != null ? str2.equals(item.channelName) : item.channelName == null) && ((str3 = this.messagePlatform) != null ? str3.equals(item.messagePlatform) : item.messagePlatform == null) && ((list = this.tags) != null ? list.equals(item.tags) : item.tags == null) && ((str4 = this.recipientType) != null ? str4.equals(item.recipientType) : item.recipientType == null) && ((str5 = this.channelType) != null ? str5.equals(item.channelType) : item.channelType == null) && ((str6 = this.channelSubType) != null ? str6.equals(item.channelSubType) : item.channelSubType == null) && ((bool = this.externalParticipantsAllowed) != null ? bool.equals(item.externalParticipantsAllowed) : item.externalParticipantsAllowed == null) && ((str7 = this.participantScopeIfInternal) != null ? str7.equals(item.participantScopeIfInternal) : item.participantScopeIfInternal == null) && ((str8 = this.userIdsForDirectChannel) != null ? str8.equals(item.userIdsForDirectChannel) : item.userIdsForDirectChannel == null) && ((str9 = this.channelStatus) != null ? str9.equals(item.channelStatus) : item.channelStatus == null) && ((str10 = this.channelWillBeChargedNext) != null ? str10.equals(item.channelWillBeChargedNext) : item.channelWillBeChargedNext == null) && ((str11 = this.channelOpenUntil) != null ? str11.equals(item.channelOpenUntil) : item.channelOpenUntil == null) && ((str12 = this.contactId) != null ? str12.equals(item.contactId) : item.contactId == null) && ((str13 = this.visitorId) != null ? str13.equals(item.visitorId) : item.visitorId == null) && ((str14 = this.recipientExternalId) != null ? str14.equals(item.recipientExternalId) : item.recipientExternalId == null) && ((str15 = this.recipientExternalIdType) != null ? str15.equals(item.recipientExternalIdType) : item.recipientExternalIdType == null) && ((str16 = this.ownerId) != null ? str16.equals(item.ownerId) : item.ownerId == null) && ((str17 = this.primaryTeamId) != null ? str17.equals(item.primaryTeamId) : item.primaryTeamId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(item.toBeAssigned) : item.toBeAssigned == null) && ((str18 = this.createdById) != null ? str18.equals(item.createdById) : item.createdById == null) && ((str19 = this.readNotifiedAt) != null ? str19.equals(item.readNotifiedAt) : item.readNotifiedAt == null) && ((str20 = this.lastMessageByLeadTime) != null ? str20.equals(item.lastMessageByLeadTime) : item.lastMessageByLeadTime == null) && ((str21 = this.lastMessageByUserTime) != null ? str21.equals(item.lastMessageByUserTime) : item.lastMessageByUserTime == null) && ((bool2 = this.isLastMessageByLead) != null ? bool2.equals(item.isLastMessageByLead) : item.isLastMessageByLead == null) && ((str22 = this.lastOutboundMessageId) != null ? str22.equals(item.lastOutboundMessageId) : item.lastOutboundMessageId == null) && ((str23 = this.lastOutboundMessageStatus) != null ? str23.equals(item.lastOutboundMessageStatus) : item.lastOutboundMessageStatus == null) && ((bool3 = this.lastOutboundMessageWasBroadcast) != null ? bool3.equals(item.lastOutboundMessageWasBroadcast) : item.lastOutboundMessageWasBroadcast == null) && ((bool4 = this.chanelHasOnlyBroadcast) != null ? bool4.equals(item.chanelHasOnlyBroadcast) : item.chanelHasOnlyBroadcast == null) && ((str24 = this.salesmaxAccountId) != null ? str24.equals(item.salesmaxAccountId) : item.salesmaxAccountId == null) && ((str25 = this.channelProfilePic) != null ? str25.equals(item.channelProfilePic) : item.channelProfilePic == null) && ((str26 = this.createdAt) != null ? str26.equals(item.createdAt) : item.createdAt == null)) {
                String str27 = this.updatedAt;
                String str28 = item.updatedAt;
                if (str27 == null) {
                    if (str28 == null) {
                        return true;
                    }
                } else if (str27.equals(str28)) {
                    return true;
                }
            }
            return false;
        }

        public Boolean externalParticipantsAllowed() {
            return this.externalParticipantsAllowed;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.phoneNumberIdExternal;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.channelName;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.messagePlatform;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode5 = (iHashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str4 = this.recipientType;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.channelType;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.channelSubType;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Boolean bool = this.externalParticipantsAllowed;
                int iHashCode9 = (iHashCode8 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str7 = this.participantScopeIfInternal;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.userIdsForDirectChannel;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.channelStatus;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.channelWillBeChargedNext;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.channelOpenUntil;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.contactId;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.visitorId;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.recipientExternalId;
                int iHashCode17 = (iHashCode16 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.recipientExternalIdType;
                int iHashCode18 = (iHashCode17 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.ownerId;
                int iHashCode19 = (iHashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.primaryTeamId;
                int iHashCode20 = (iHashCode19 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                ContactAssignmentStatus contactAssignmentStatus = this.toBeAssigned;
                int iHashCode21 = (iHashCode20 ^ (contactAssignmentStatus == null ? 0 : contactAssignmentStatus.hashCode())) * 1000003;
                String str18 = this.createdById;
                int iHashCode22 = (iHashCode21 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.readNotifiedAt;
                int iHashCode23 = (iHashCode22 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.lastMessageByLeadTime;
                int iHashCode24 = (iHashCode23 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.lastMessageByUserTime;
                int iHashCode25 = (iHashCode24 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                Boolean bool2 = this.isLastMessageByLead;
                int iHashCode26 = (iHashCode25 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str22 = this.lastOutboundMessageId;
                int iHashCode27 = (iHashCode26 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.lastOutboundMessageStatus;
                int iHashCode28 = (iHashCode27 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                Boolean bool3 = this.lastOutboundMessageWasBroadcast;
                int iHashCode29 = (iHashCode28 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.chanelHasOnlyBroadcast;
                int iHashCode30 = (iHashCode29 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                String str24 = this.salesmaxAccountId;
                int iHashCode31 = (iHashCode30 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.channelProfilePic;
                int iHashCode32 = (iHashCode31 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.createdAt;
                int iHashCode33 = (iHashCode32 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.updatedAt;
                this.$hashCode = iHashCode33 ^ (str27 != null ? str27.hashCode() : 0);
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

        public Boolean lastOutboundMessageWasBroadcast() {
            return this.lastOutboundMessageWasBroadcast;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], Item.this.channelName);
                    responseWriter.writeString(responseFieldArr[5], Item.this.messagePlatform);
                    responseWriter.writeList(responseFieldArr[6], Item.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[7], Item.this.recipientType);
                    responseWriter.writeString(responseFieldArr[8], Item.this.channelType);
                    responseWriter.writeString(responseFieldArr[9], Item.this.channelSubType);
                    responseWriter.writeBoolean(responseFieldArr[10], Item.this.externalParticipantsAllowed);
                    responseWriter.writeString(responseFieldArr[11], Item.this.participantScopeIfInternal);
                    responseWriter.writeString(responseFieldArr[12], Item.this.userIdsForDirectChannel);
                    responseWriter.writeString(responseFieldArr[13], Item.this.channelStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.channelWillBeChargedNext);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.channelOpenUntil);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.visitorId);
                    responseWriter.writeString(responseFieldArr[18], Item.this.recipientExternalId);
                    responseWriter.writeString(responseFieldArr[19], Item.this.recipientExternalIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.primaryTeamId);
                    ResponseField responseField = responseFieldArr[22];
                    ContactAssignmentStatus contactAssignmentStatus = Item.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Item.this.readNotifiedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Item.this.lastMessageByLeadTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], Item.this.lastMessageByUserTime);
                    responseWriter.writeBoolean(responseFieldArr[27], Item.this.isLastMessageByLead);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[28], Item.this.lastOutboundMessageId);
                    responseWriter.writeString(responseFieldArr[29], Item.this.lastOutboundMessageStatus);
                    responseWriter.writeBoolean(responseFieldArr[30], Item.this.lastOutboundMessageWasBroadcast);
                    responseWriter.writeBoolean(responseFieldArr[31], Item.this.chanelHasOnlyBroadcast);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Item.this.salesmaxAccountId);
                    responseWriter.writeString(responseFieldArr[33], Item.this.channelProfilePic);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[35], Item.this.updatedAt);
                }
            };
        }

        public String messagePlatform() {
            return this.messagePlatform;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String participantScopeIfInternal() {
            return this.participantScopeIfInternal;
        }

        public String phoneNumberIdExternal() {
            return this.phoneNumberIdExternal;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String readNotifiedAt() {
            return this.readNotifiedAt;
        }

        public String recipientExternalId() {
            return this.recipientExternalId;
        }

        public String recipientExternalIdType() {
            return this.recipientExternalIdType;
        }

        public String recipientType() {
            return this.recipientType;
        }

        public String salesmaxAccountId() {
            return this.salesmaxAccountId;
        }

        public List<String> tags() {
            return this.tags;
        }

        public ContactAssignmentStatus toBeAssigned() {
            return this.toBeAssigned;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", channelName=" + this.channelName + ", messagePlatform=" + this.messagePlatform + ", tags=" + this.tags + ", recipientType=" + this.recipientType + ", channelType=" + this.channelType + ", channelSubType=" + this.channelSubType + ", externalParticipantsAllowed=" + this.externalParticipantsAllowed + ", participantScopeIfInternal=" + this.participantScopeIfInternal + ", userIdsForDirectChannel=" + this.userIdsForDirectChannel + ", channelStatus=" + this.channelStatus + ", channelWillBeChargedNext=" + this.channelWillBeChargedNext + ", channelOpenUntil=" + this.channelOpenUntil + ", contactId=" + this.contactId + ", visitorId=" + this.visitorId + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", toBeAssigned=" + this.toBeAssigned + ", createdById=" + this.createdById + ", readNotifiedAt=" + this.readNotifiedAt + ", lastMessageByLeadTime=" + this.lastMessageByLeadTime + ", lastMessageByUserTime=" + this.lastMessageByUserTime + ", isLastMessageByLead=" + this.isLastMessageByLead + ", lastOutboundMessageId=" + this.lastOutboundMessageId + ", lastOutboundMessageStatus=" + this.lastOutboundMessageStatus + ", lastOutboundMessageWasBroadcast=" + this.lastOutboundMessageWasBroadcast + ", chanelHasOnlyBroadcast=" + this.chanelHasOnlyBroadcast + ", salesmaxAccountId=" + this.salesmaxAccountId + ", channelProfilePic=" + this.channelProfilePic + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userIdsForDirectChannel() {
            return this.userIdsForDirectChannel;
        }

        public String visitorId() {
            return this.visitorId;
        }
    }

    public static class ListChatChannels {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListChatChannels> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListChatChannels map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListChatChannels.$responseFields;
                return new ListChatChannels(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.ListChatChannels.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.ListChatChannels.Mapper.1.1
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

        public ListChatChannels(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListChatChannels)) {
                return false;
            }
            ListChatChannels listChatChannels = (ListChatChannels) obj;
            if (this.__typename.equals(listChatChannels.__typename) && this.items.equals(listChatChannels.items)) {
                String str = this.nextToken;
                String str2 = listChatChannels.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.ListChatChannels.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListChatChannels.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListChatChannels.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListChatChannels.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.ListChatChannels.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListChatChannels.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListChatChannels{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelChatChannelFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelChatChannelFilterInput modelChatChannelFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelChatChannelFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelChatChannelFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelChatChannelFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListChatChannelsQuery.Variables.1
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

    public ListChatChannelsQuery(ModelChatChannelFilterInput modelChatChannelFilterInput, Integer num, String str) {
        this.variables = new Variables(modelChatChannelFilterInput, num, str);
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
        return "4156ed8dd23d4efb2c4ac7cb11d9984a4467697f206c53f757e6b919e08a6955";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListChatChannels($filter: ModelChatChannelFilterInput, $limit: Int, $nextToken: String) {\n  listChatChannels(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
