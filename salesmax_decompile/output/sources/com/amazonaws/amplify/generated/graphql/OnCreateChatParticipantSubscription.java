package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.AddedSourceType;
import type.ContactAssignmentStatus;
import type.CustomType;
import type.UserRegistrationStatus;

/* loaded from: classes4.dex */
public final class OnCreateChatParticipantSubscription implements Subscription<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnCreateChatParticipant($accountId: ID!, $participantId: ID!) {\n  onCreateChatParticipant(accountId: $accountId, participantId: $participantId) {\n    __typename\n    id\n    accountId\n    channelId\n    phoneNumberIdExternal\n    participantId\n    participationStatus\n    unreadMessageCount\n    lastViewed\n    isStarred\n    joinedAt\n    leftAt\n    channelName\n    channelType\n    channelSubType\n    channelStatus\n    channelWillBeChargedNext\n    channelOpenUntil\n    lastMessageByLeadTime\n    lastMessageByUserTime\n    isLastMessageByLead\n    lastOutboundMessageId\n    lastOutboundMessageStatus\n    isNewMessageUpdate\n    tags\n    participantScopeIfInternal\n    userIdsForDirectChannel\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    participant {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnCreateChatParticipant";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnCreateChatParticipant($accountId: ID!, $participantId: ID!) {\n  onCreateChatParticipant(accountId: $accountId, participantId: $participantId) {\n    __typename\n    id\n    accountId\n    channelId\n    phoneNumberIdExternal\n    participantId\n    participationStatus\n    unreadMessageCount\n    lastViewed\n    isStarred\n    joinedAt\n    leftAt\n    channelName\n    channelType\n    channelSubType\n    channelStatus\n    channelWillBeChargedNext\n    channelOpenUntil\n    lastMessageByLeadTime\n    lastMessageByUserTime\n    isLastMessageByLead\n    lastOutboundMessageId\n    lastOutboundMessageStatus\n    isNewMessageUpdate\n    tags\n    participantScopeIfInternal\n    userIdsForDirectChannel\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    participant {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private String participantId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public OnCreateChatParticipantSubscription build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.participantId, "participantId == null");
            return new OnCreateChatParticipantSubscription(this.accountId, this.participantId);
        }

        public Builder participantId(String str) {
            this.participantId = str;
            return this;
        }
    }

    public static class Channel {
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

        public static final class Mapper implements ResponseFieldMapper<Channel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Channel map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Channel.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                List list = responseReader.readList(responseFieldArr[6], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.Channel.Mapper.1
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
                return new Channel(string, str, str2, string2, string3, string4, list, string5, string6, string7, bool, string8, string9, string10, str3, str4, str5, str6, string11, string12, str7, str8, string13 != null ? ContactAssignmentStatus.valueOf(string13) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]), responseReader.readBoolean(responseFieldArr[27]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), responseReader.readBoolean(responseFieldArr[30]), responseReader.readBoolean(responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), responseReader.readString(responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[35]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forString("channelName", "channelName", null, true, Collections.emptyList()), ResponseField.forString("messagePlatform", "messagePlatform", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("recipientType", "recipientType", null, true, Collections.emptyList()), ResponseField.forString("channelType", "channelType", null, true, Collections.emptyList()), ResponseField.forString("channelSubType", "channelSubType", null, true, Collections.emptyList()), ResponseField.forBoolean("externalParticipantsAllowed", "externalParticipantsAllowed", null, true, Collections.emptyList()), ResponseField.forString("participantScopeIfInternal", "participantScopeIfInternal", null, true, Collections.emptyList()), ResponseField.forString("userIdsForDirectChannel", "userIdsForDirectChannel", null, true, Collections.emptyList()), ResponseField.forString("channelStatus", "channelStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("channelWillBeChargedNext", "channelWillBeChargedNext", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("channelOpenUntil", "channelOpenUntil", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("visitorId", "visitorId", null, true, customType, Collections.emptyList()), ResponseField.forString("recipientExternalId", "recipientExternalId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalIdType", "recipientExternalIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("readNotifiedAt", "readNotifiedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByLeadTime", "lastMessageByLeadTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByUserTime", "lastMessageByUserTime", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isLastMessageByLead", "isLastMessageByLead", null, true, Collections.emptyList()), ResponseField.forCustomType("lastOutboundMessageId", "lastOutboundMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastOutboundMessageStatus", "lastOutboundMessageStatus", null, true, Collections.emptyList()), ResponseField.forBoolean("lastOutboundMessageWasBroadcast", "lastOutboundMessageWasBroadcast", null, true, Collections.emptyList()), ResponseField.forBoolean("chanelHasOnlyBroadcast", "chanelHasOnlyBroadcast", null, true, Collections.emptyList()), ResponseField.forCustomType("salesmaxAccountId", "salesmaxAccountId", null, true, customType, Collections.emptyList()), ResponseField.forString("channelProfilePic", "channelProfilePic", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Channel(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ContactAssignmentStatus contactAssignmentStatus, String str21, String str22, String str23, String str24, Boolean bool2, String str25, String str26, Boolean bool3, Boolean bool4, String str27, String str28, String str29, String str30) {
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
            if (!(obj instanceof Channel)) {
                return false;
            }
            Channel channel = (Channel) obj;
            if (this.__typename.equals(channel.__typename) && this.id.equals(channel.id) && this.accountId.equals(channel.accountId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(channel.phoneNumberIdExternal) : channel.phoneNumberIdExternal == null) && ((str2 = this.channelName) != null ? str2.equals(channel.channelName) : channel.channelName == null) && ((str3 = this.messagePlatform) != null ? str3.equals(channel.messagePlatform) : channel.messagePlatform == null) && ((list = this.tags) != null ? list.equals(channel.tags) : channel.tags == null) && ((str4 = this.recipientType) != null ? str4.equals(channel.recipientType) : channel.recipientType == null) && ((str5 = this.channelType) != null ? str5.equals(channel.channelType) : channel.channelType == null) && ((str6 = this.channelSubType) != null ? str6.equals(channel.channelSubType) : channel.channelSubType == null) && ((bool = this.externalParticipantsAllowed) != null ? bool.equals(channel.externalParticipantsAllowed) : channel.externalParticipantsAllowed == null) && ((str7 = this.participantScopeIfInternal) != null ? str7.equals(channel.participantScopeIfInternal) : channel.participantScopeIfInternal == null) && ((str8 = this.userIdsForDirectChannel) != null ? str8.equals(channel.userIdsForDirectChannel) : channel.userIdsForDirectChannel == null) && ((str9 = this.channelStatus) != null ? str9.equals(channel.channelStatus) : channel.channelStatus == null) && ((str10 = this.channelWillBeChargedNext) != null ? str10.equals(channel.channelWillBeChargedNext) : channel.channelWillBeChargedNext == null) && ((str11 = this.channelOpenUntil) != null ? str11.equals(channel.channelOpenUntil) : channel.channelOpenUntil == null) && ((str12 = this.contactId) != null ? str12.equals(channel.contactId) : channel.contactId == null) && ((str13 = this.visitorId) != null ? str13.equals(channel.visitorId) : channel.visitorId == null) && ((str14 = this.recipientExternalId) != null ? str14.equals(channel.recipientExternalId) : channel.recipientExternalId == null) && ((str15 = this.recipientExternalIdType) != null ? str15.equals(channel.recipientExternalIdType) : channel.recipientExternalIdType == null) && ((str16 = this.ownerId) != null ? str16.equals(channel.ownerId) : channel.ownerId == null) && ((str17 = this.primaryTeamId) != null ? str17.equals(channel.primaryTeamId) : channel.primaryTeamId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(channel.toBeAssigned) : channel.toBeAssigned == null) && ((str18 = this.createdById) != null ? str18.equals(channel.createdById) : channel.createdById == null) && ((str19 = this.readNotifiedAt) != null ? str19.equals(channel.readNotifiedAt) : channel.readNotifiedAt == null) && ((str20 = this.lastMessageByLeadTime) != null ? str20.equals(channel.lastMessageByLeadTime) : channel.lastMessageByLeadTime == null) && ((str21 = this.lastMessageByUserTime) != null ? str21.equals(channel.lastMessageByUserTime) : channel.lastMessageByUserTime == null) && ((bool2 = this.isLastMessageByLead) != null ? bool2.equals(channel.isLastMessageByLead) : channel.isLastMessageByLead == null) && ((str22 = this.lastOutboundMessageId) != null ? str22.equals(channel.lastOutboundMessageId) : channel.lastOutboundMessageId == null) && ((str23 = this.lastOutboundMessageStatus) != null ? str23.equals(channel.lastOutboundMessageStatus) : channel.lastOutboundMessageStatus == null) && ((bool3 = this.lastOutboundMessageWasBroadcast) != null ? bool3.equals(channel.lastOutboundMessageWasBroadcast) : channel.lastOutboundMessageWasBroadcast == null) && ((bool4 = this.chanelHasOnlyBroadcast) != null ? bool4.equals(channel.chanelHasOnlyBroadcast) : channel.chanelHasOnlyBroadcast == null) && ((str24 = this.salesmaxAccountId) != null ? str24.equals(channel.salesmaxAccountId) : channel.salesmaxAccountId == null) && ((str25 = this.channelProfilePic) != null ? str25.equals(channel.channelProfilePic) : channel.channelProfilePic == null) && ((str26 = this.createdAt) != null ? str26.equals(channel.createdAt) : channel.createdAt == null)) {
                String str27 = this.updatedAt;
                String str28 = channel.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.Channel.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Channel.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Channel.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Channel.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Channel.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Channel.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], Channel.this.channelName);
                    responseWriter.writeString(responseFieldArr[5], Channel.this.messagePlatform);
                    responseWriter.writeList(responseFieldArr[6], Channel.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.Channel.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[7], Channel.this.recipientType);
                    responseWriter.writeString(responseFieldArr[8], Channel.this.channelType);
                    responseWriter.writeString(responseFieldArr[9], Channel.this.channelSubType);
                    responseWriter.writeBoolean(responseFieldArr[10], Channel.this.externalParticipantsAllowed);
                    responseWriter.writeString(responseFieldArr[11], Channel.this.participantScopeIfInternal);
                    responseWriter.writeString(responseFieldArr[12], Channel.this.userIdsForDirectChannel);
                    responseWriter.writeString(responseFieldArr[13], Channel.this.channelStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Channel.this.channelWillBeChargedNext);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Channel.this.channelOpenUntil);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Channel.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Channel.this.visitorId);
                    responseWriter.writeString(responseFieldArr[18], Channel.this.recipientExternalId);
                    responseWriter.writeString(responseFieldArr[19], Channel.this.recipientExternalIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Channel.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Channel.this.primaryTeamId);
                    ResponseField responseField = responseFieldArr[22];
                    ContactAssignmentStatus contactAssignmentStatus = Channel.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Channel.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Channel.this.readNotifiedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Channel.this.lastMessageByLeadTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], Channel.this.lastMessageByUserTime);
                    responseWriter.writeBoolean(responseFieldArr[27], Channel.this.isLastMessageByLead);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[28], Channel.this.lastOutboundMessageId);
                    responseWriter.writeString(responseFieldArr[29], Channel.this.lastOutboundMessageStatus);
                    responseWriter.writeBoolean(responseFieldArr[30], Channel.this.lastOutboundMessageWasBroadcast);
                    responseWriter.writeBoolean(responseFieldArr[31], Channel.this.chanelHasOnlyBroadcast);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Channel.this.salesmaxAccountId);
                    responseWriter.writeString(responseFieldArr[33], Channel.this.channelProfilePic);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], Channel.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[35], Channel.this.updatedAt);
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
                this.$toString = "Channel{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", channelName=" + this.channelName + ", messagePlatform=" + this.messagePlatform + ", tags=" + this.tags + ", recipientType=" + this.recipientType + ", channelType=" + this.channelType + ", channelSubType=" + this.channelSubType + ", externalParticipantsAllowed=" + this.externalParticipantsAllowed + ", participantScopeIfInternal=" + this.participantScopeIfInternal + ", userIdsForDirectChannel=" + this.userIdsForDirectChannel + ", channelStatus=" + this.channelStatus + ", channelWillBeChargedNext=" + this.channelWillBeChargedNext + ", channelOpenUntil=" + this.channelOpenUntil + ", contactId=" + this.contactId + ", visitorId=" + this.visitorId + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", toBeAssigned=" + this.toBeAssigned + ", createdById=" + this.createdById + ", readNotifiedAt=" + this.readNotifiedAt + ", lastMessageByLeadTime=" + this.lastMessageByLeadTime + ", lastMessageByUserTime=" + this.lastMessageByUserTime + ", isLastMessageByLead=" + this.isLastMessageByLead + ", lastOutboundMessageId=" + this.lastOutboundMessageId + ", lastOutboundMessageStatus=" + this.lastOutboundMessageStatus + ", lastOutboundMessageWasBroadcast=" + this.lastOutboundMessageWasBroadcast + ", chanelHasOnlyBroadcast=" + this.chanelHasOnlyBroadcast + ", salesmaxAccountId=" + this.salesmaxAccountId + ", channelProfilePic=" + this.channelProfilePic + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onCreateChatParticipant", "onCreateChatParticipant", new UnmodifiableMapBuilder(2).put("participantId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "participantId").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnCreateChatParticipant onCreateChatParticipant;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnCreateChatParticipant.Mapper onCreateChatParticipantFieldMapper = new OnCreateChatParticipant.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnCreateChatParticipant) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnCreateChatParticipant>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnCreateChatParticipant read(ResponseReader responseReader2) {
                        return Mapper.this.onCreateChatParticipantFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnCreateChatParticipant onCreateChatParticipant) {
            this.onCreateChatParticipant = onCreateChatParticipant;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnCreateChatParticipant onCreateChatParticipant = this.onCreateChatParticipant;
            OnCreateChatParticipant onCreateChatParticipant2 = ((Data) obj).onCreateChatParticipant;
            return onCreateChatParticipant == null ? onCreateChatParticipant2 == null : onCreateChatParticipant.equals(onCreateChatParticipant2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnCreateChatParticipant onCreateChatParticipant = this.onCreateChatParticipant;
                this.$hashCode = (onCreateChatParticipant == null ? 0 : onCreateChatParticipant.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnCreateChatParticipant onCreateChatParticipant = Data.this.onCreateChatParticipant;
                    responseWriter.writeObject(responseField, onCreateChatParticipant != null ? onCreateChatParticipant.marshaller() : null);
                }
            };
        }

        public OnCreateChatParticipant onCreateChatParticipant() {
            return this.onCreateChatParticipant;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onCreateChatParticipant=" + this.onCreateChatParticipant + "}";
            }
            return this.$toString;
        }
    }

    public static class OnCreateChatParticipant {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Channel channel;
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
        final Participant participant;
        final String participantId;
        final String participantScopeIfInternal;
        final String participationStatus;
        final String phoneNumberIdExternal;
        final List<String> tags;
        final Integer unreadMessageCount;
        final String updatedAt;
        final String userIdsForDirectChannel;

        public static final class Mapper implements ResponseFieldMapper<OnCreateChatParticipant> {
            final Channel.Mapper channelFieldMapper = new Channel.Mapper();
            final Participant.Mapper participantFieldMapper = new Participant.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnCreateChatParticipant map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnCreateChatParticipant.$responseFields;
                return new OnCreateChatParticipant(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readBoolean(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readBoolean(responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), responseReader.readBoolean(responseFieldArr[23]), responseReader.readList(responseFieldArr[24], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.OnCreateChatParticipant.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[25]), responseReader.readString(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[28]), (Channel) responseReader.readObject(responseFieldArr[29], new ResponseReader.ObjectReader<Channel>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.OnCreateChatParticipant.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Channel read(ResponseReader responseReader2) {
                        return Mapper.this.channelFieldMapper.map(responseReader2);
                    }
                }), (Participant) responseReader.readObject(responseFieldArr[30], new ResponseReader.ObjectReader<Participant>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.OnCreateChatParticipant.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Participant read(ResponseReader responseReader2) {
                        return Mapper.this.participantFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("participantId", "participantId", null, false, customType, Collections.emptyList()), ResponseField.forString("participationStatus", "participationStatus", null, false, Collections.emptyList()), ResponseField.forInt("unreadMessageCount", "unreadMessageCount", null, true, Collections.emptyList()), ResponseField.forCustomType("lastViewed", "lastViewed", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isStarred", "isStarred", null, true, Collections.emptyList()), ResponseField.forCustomType("joinedAt", "joinedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("leftAt", "leftAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("channelName", "channelName", null, true, Collections.emptyList()), ResponseField.forString("channelType", "channelType", null, true, Collections.emptyList()), ResponseField.forString("channelSubType", "channelSubType", null, true, Collections.emptyList()), ResponseField.forString("channelStatus", "channelStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("channelWillBeChargedNext", "channelWillBeChargedNext", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("channelOpenUntil", "channelOpenUntil", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByLeadTime", "lastMessageByLeadTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByUserTime", "lastMessageByUserTime", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isLastMessageByLead", "isLastMessageByLead", null, true, Collections.emptyList()), ResponseField.forCustomType("lastOutboundMessageId", "lastOutboundMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastOutboundMessageStatus", "lastOutboundMessageStatus", null, true, Collections.emptyList()), ResponseField.forBoolean("isNewMessageUpdate", "isNewMessageUpdate", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("participantScopeIfInternal", "participantScopeIfInternal", null, true, Collections.emptyList()), ResponseField.forString("userIdsForDirectChannel", "userIdsForDirectChannel", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("channel", "channel", null, true, Collections.emptyList()), ResponseField.forObject("participant", "participant", null, true, Collections.emptyList())};
        }

        public OnCreateChatParticipant(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool2, String str19, String str20, Boolean bool3, List<String> list, String str21, String str22, String str23, String str24, Channel channel, Participant participant) {
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
            this.channel = channel;
            this.participant = participant;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Channel channel() {
            return this.channel;
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
            String str18;
            Channel channel;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnCreateChatParticipant)) {
                return false;
            }
            OnCreateChatParticipant onCreateChatParticipant = (OnCreateChatParticipant) obj;
            if (this.__typename.equals(onCreateChatParticipant.__typename) && this.id.equals(onCreateChatParticipant.id) && this.accountId.equals(onCreateChatParticipant.accountId) && this.channelId.equals(onCreateChatParticipant.channelId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(onCreateChatParticipant.phoneNumberIdExternal) : onCreateChatParticipant.phoneNumberIdExternal == null) && this.participantId.equals(onCreateChatParticipant.participantId) && this.participationStatus.equals(onCreateChatParticipant.participationStatus) && ((num = this.unreadMessageCount) != null ? num.equals(onCreateChatParticipant.unreadMessageCount) : onCreateChatParticipant.unreadMessageCount == null) && ((str2 = this.lastViewed) != null ? str2.equals(onCreateChatParticipant.lastViewed) : onCreateChatParticipant.lastViewed == null) && ((bool = this.isStarred) != null ? bool.equals(onCreateChatParticipant.isStarred) : onCreateChatParticipant.isStarred == null) && ((str3 = this.joinedAt) != null ? str3.equals(onCreateChatParticipant.joinedAt) : onCreateChatParticipant.joinedAt == null) && ((str4 = this.leftAt) != null ? str4.equals(onCreateChatParticipant.leftAt) : onCreateChatParticipant.leftAt == null) && ((str5 = this.channelName) != null ? str5.equals(onCreateChatParticipant.channelName) : onCreateChatParticipant.channelName == null) && ((str6 = this.channelType) != null ? str6.equals(onCreateChatParticipant.channelType) : onCreateChatParticipant.channelType == null) && ((str7 = this.channelSubType) != null ? str7.equals(onCreateChatParticipant.channelSubType) : onCreateChatParticipant.channelSubType == null) && ((str8 = this.channelStatus) != null ? str8.equals(onCreateChatParticipant.channelStatus) : onCreateChatParticipant.channelStatus == null) && ((str9 = this.channelWillBeChargedNext) != null ? str9.equals(onCreateChatParticipant.channelWillBeChargedNext) : onCreateChatParticipant.channelWillBeChargedNext == null) && ((str10 = this.channelOpenUntil) != null ? str10.equals(onCreateChatParticipant.channelOpenUntil) : onCreateChatParticipant.channelOpenUntil == null) && ((str11 = this.lastMessageByLeadTime) != null ? str11.equals(onCreateChatParticipant.lastMessageByLeadTime) : onCreateChatParticipant.lastMessageByLeadTime == null) && ((str12 = this.lastMessageByUserTime) != null ? str12.equals(onCreateChatParticipant.lastMessageByUserTime) : onCreateChatParticipant.lastMessageByUserTime == null) && ((bool2 = this.isLastMessageByLead) != null ? bool2.equals(onCreateChatParticipant.isLastMessageByLead) : onCreateChatParticipant.isLastMessageByLead == null) && ((str13 = this.lastOutboundMessageId) != null ? str13.equals(onCreateChatParticipant.lastOutboundMessageId) : onCreateChatParticipant.lastOutboundMessageId == null) && ((str14 = this.lastOutboundMessageStatus) != null ? str14.equals(onCreateChatParticipant.lastOutboundMessageStatus) : onCreateChatParticipant.lastOutboundMessageStatus == null) && ((bool3 = this.isNewMessageUpdate) != null ? bool3.equals(onCreateChatParticipant.isNewMessageUpdate) : onCreateChatParticipant.isNewMessageUpdate == null) && ((list = this.tags) != null ? list.equals(onCreateChatParticipant.tags) : onCreateChatParticipant.tags == null) && ((str15 = this.participantScopeIfInternal) != null ? str15.equals(onCreateChatParticipant.participantScopeIfInternal) : onCreateChatParticipant.participantScopeIfInternal == null) && ((str16 = this.userIdsForDirectChannel) != null ? str16.equals(onCreateChatParticipant.userIdsForDirectChannel) : onCreateChatParticipant.userIdsForDirectChannel == null) && ((str17 = this.createdAt) != null ? str17.equals(onCreateChatParticipant.createdAt) : onCreateChatParticipant.createdAt == null) && ((str18 = this.updatedAt) != null ? str18.equals(onCreateChatParticipant.updatedAt) : onCreateChatParticipant.updatedAt == null) && ((channel = this.channel) != null ? channel.equals(onCreateChatParticipant.channel) : onCreateChatParticipant.channel == null)) {
                Participant participant = this.participant;
                Participant participant2 = onCreateChatParticipant.participant;
                if (participant == null) {
                    if (participant2 == null) {
                        return true;
                    }
                } else if (participant.equals(participant2)) {
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
                int iHashCode24 = (iHashCode23 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                Channel channel = this.channel;
                int iHashCode25 = (iHashCode24 ^ (channel == null ? 0 : channel.hashCode())) * 1000003;
                Participant participant = this.participant;
                this.$hashCode = iHashCode25 ^ (participant != null ? participant.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.OnCreateChatParticipant.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnCreateChatParticipant.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnCreateChatParticipant.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnCreateChatParticipant.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnCreateChatParticipant.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnCreateChatParticipant.this.channelId);
                    responseWriter.writeString(responseFieldArr[4], OnCreateChatParticipant.this.phoneNumberIdExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], OnCreateChatParticipant.this.participantId);
                    responseWriter.writeString(responseFieldArr[6], OnCreateChatParticipant.this.participationStatus);
                    responseWriter.writeInt(responseFieldArr[7], OnCreateChatParticipant.this.unreadMessageCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnCreateChatParticipant.this.lastViewed);
                    responseWriter.writeBoolean(responseFieldArr[9], OnCreateChatParticipant.this.isStarred);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], OnCreateChatParticipant.this.joinedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], OnCreateChatParticipant.this.leftAt);
                    responseWriter.writeString(responseFieldArr[12], OnCreateChatParticipant.this.channelName);
                    responseWriter.writeString(responseFieldArr[13], OnCreateChatParticipant.this.channelType);
                    responseWriter.writeString(responseFieldArr[14], OnCreateChatParticipant.this.channelSubType);
                    responseWriter.writeString(responseFieldArr[15], OnCreateChatParticipant.this.channelStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], OnCreateChatParticipant.this.channelWillBeChargedNext);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], OnCreateChatParticipant.this.channelOpenUntil);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], OnCreateChatParticipant.this.lastMessageByLeadTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], OnCreateChatParticipant.this.lastMessageByUserTime);
                    responseWriter.writeBoolean(responseFieldArr[20], OnCreateChatParticipant.this.isLastMessageByLead);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], OnCreateChatParticipant.this.lastOutboundMessageId);
                    responseWriter.writeString(responseFieldArr[22], OnCreateChatParticipant.this.lastOutboundMessageStatus);
                    responseWriter.writeBoolean(responseFieldArr[23], OnCreateChatParticipant.this.isNewMessageUpdate);
                    responseWriter.writeList(responseFieldArr[24], OnCreateChatParticipant.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.OnCreateChatParticipant.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[25], OnCreateChatParticipant.this.participantScopeIfInternal);
                    responseWriter.writeString(responseFieldArr[26], OnCreateChatParticipant.this.userIdsForDirectChannel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], OnCreateChatParticipant.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[28], OnCreateChatParticipant.this.updatedAt);
                    ResponseField responseField = responseFieldArr[29];
                    Channel channel = OnCreateChatParticipant.this.channel;
                    responseWriter.writeObject(responseField, channel != null ? channel.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[30];
                    Participant participant = OnCreateChatParticipant.this.participant;
                    responseWriter.writeObject(responseField2, participant != null ? participant.marshaller() : null);
                }
            };
        }

        public Participant participant() {
            return this.participant;
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
                this.$toString = "OnCreateChatParticipant{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", channelId=" + this.channelId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", participantId=" + this.participantId + ", participationStatus=" + this.participationStatus + ", unreadMessageCount=" + this.unreadMessageCount + ", lastViewed=" + this.lastViewed + ", isStarred=" + this.isStarred + ", joinedAt=" + this.joinedAt + ", leftAt=" + this.leftAt + ", channelName=" + this.channelName + ", channelType=" + this.channelType + ", channelSubType=" + this.channelSubType + ", channelStatus=" + this.channelStatus + ", channelWillBeChargedNext=" + this.channelWillBeChargedNext + ", channelOpenUntil=" + this.channelOpenUntil + ", lastMessageByLeadTime=" + this.lastMessageByLeadTime + ", lastMessageByUserTime=" + this.lastMessageByUserTime + ", isLastMessageByLead=" + this.isLastMessageByLead + ", lastOutboundMessageId=" + this.lastOutboundMessageId + ", lastOutboundMessageStatus=" + this.lastOutboundMessageStatus + ", isNewMessageUpdate=" + this.isNewMessageUpdate + ", tags=" + this.tags + ", participantScopeIfInternal=" + this.participantScopeIfInternal + ", userIdsForDirectChannel=" + this.userIdsForDirectChannel + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", channel=" + this.channel + ", participant=" + this.participant + "}";
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

    public static class Participant {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final AddedSourceType addedSourceType;
        final String androidVersionRelease;
        final String appVersion;
        final String createdAt;
        final String deviceManufacturer;
        final String deviceModel;
        final String id;
        final String lastSelectedAccountApp;
        final String lastSelectedAccountWeb;
        final String name;
        final String profilePictureUrl;
        final String registeredEmail;
        final Boolean registeredEmailVerified;
        final String registeredNumber;
        final Boolean registeredNumberVerified;
        final String secondaryNumber;
        final Boolean secondaryNumberVerified;
        final String updatedAt;
        final UserRegistrationStatus userRegistrationStatus;

        public static final class Mapper implements ResponseFieldMapper<Participant> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Participant map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Participant.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                AddedSourceType addedSourceTypeValueOf = string2 != null ? AddedSourceType.valueOf(string2) : null;
                String string3 = responseReader.readString(responseFieldArr[3]);
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new Participant(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public Participant(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.addedSourceType = (AddedSourceType) Utils.checkNotNull(addedSourceType, "addedSourceType == null");
            this.name = (String) Utils.checkNotNull(str3, "name == null");
            this.profilePictureUrl = str4;
            this.registeredEmail = str5;
            this.registeredEmailVerified = bool;
            this.registeredNumber = (String) Utils.checkNotNull(str6, "registeredNumber == null");
            this.registeredNumberVerified = bool2;
            this.secondaryNumber = str7;
            this.secondaryNumberVerified = bool3;
            this.userRegistrationStatus = (UserRegistrationStatus) Utils.checkNotNull(userRegistrationStatus, "userRegistrationStatus == null");
            this.lastSelectedAccountWeb = str8;
            this.lastSelectedAccountApp = str9;
            this.appVersion = str10;
            this.deviceModel = str11;
            this.deviceManufacturer = str12;
            this.androidVersionRelease = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public AddedSourceType addedSourceType() {
            return this.addedSourceType;
        }

        public String androidVersionRelease() {
            return this.androidVersionRelease;
        }

        public String appVersion() {
            return this.appVersion;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceManufacturer() {
            return this.deviceManufacturer;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            String str3;
            Boolean bool3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Participant)) {
                return false;
            }
            Participant participant = (Participant) obj;
            if (this.__typename.equals(participant.__typename) && this.id.equals(participant.id) && this.addedSourceType.equals(participant.addedSourceType) && this.name.equals(participant.name) && ((str = this.profilePictureUrl) != null ? str.equals(participant.profilePictureUrl) : participant.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(participant.registeredEmail) : participant.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(participant.registeredEmailVerified) : participant.registeredEmailVerified == null) && this.registeredNumber.equals(participant.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(participant.registeredNumberVerified) : participant.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(participant.secondaryNumber) : participant.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(participant.secondaryNumberVerified) : participant.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(participant.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(participant.lastSelectedAccountWeb) : participant.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(participant.lastSelectedAccountApp) : participant.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(participant.appVersion) : participant.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(participant.deviceModel) : participant.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(participant.deviceManufacturer) : participant.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(participant.androidVersionRelease) : participant.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(participant.createdAt) : participant.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = participant.updatedAt;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.addedSourceType.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.profilePictureUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.registeredEmail;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.registeredEmailVerified;
                int iHashCode4 = (((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.registeredNumber.hashCode()) * 1000003;
                Boolean bool2 = this.registeredNumberVerified;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str3 = this.secondaryNumber;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool3 = this.secondaryNumberVerified;
                int iHashCode7 = (((iHashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.userRegistrationStatus.hashCode()) * 1000003;
                String str4 = this.lastSelectedAccountWeb;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lastSelectedAccountApp;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.appVersion;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.deviceModel;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.deviceManufacturer;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.androidVersionRelease;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedAt;
                this.$hashCode = iHashCode14 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastSelectedAccountApp() {
            return this.lastSelectedAccountApp;
        }

        public String lastSelectedAccountWeb() {
            return this.lastSelectedAccountWeb;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.Participant.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Participant.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Participant.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Participant.this.id);
                    responseWriter.writeString(responseFieldArr[2], Participant.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], Participant.this.name);
                    responseWriter.writeString(responseFieldArr[4], Participant.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Participant.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], Participant.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Participant.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], Participant.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Participant.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], Participant.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], Participant.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Participant.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Participant.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], Participant.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], Participant.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], Participant.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], Participant.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Participant.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Participant.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String profilePictureUrl() {
            return this.profilePictureUrl;
        }

        public String registeredEmail() {
            return this.registeredEmail;
        }

        public Boolean registeredEmailVerified() {
            return this.registeredEmailVerified;
        }

        public String registeredNumber() {
            return this.registeredNumber;
        }

        public Boolean registeredNumberVerified() {
            return this.registeredNumberVerified;
        }

        public String secondaryNumber() {
            return this.secondaryNumber;
        }

        public Boolean secondaryNumberVerified() {
            return this.secondaryNumberVerified;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Participant{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final String participantId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.participantId = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("participantId", str2);
        }

        public String accountId() {
            return this.accountId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateChatParticipantSubscription.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("participantId", Variables.this.participantId);
                }
            };
        }

        public String participantId() {
            return this.participantId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public OnCreateChatParticipantSubscription(String str, String str2) {
        Utils.checkNotNull(str, "accountId == null");
        Utils.checkNotNull(str2, "participantId == null");
        this.variables = new Variables(str, str2);
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
        return "2bc06528425b31dfe23acb807d72af9c54ae329dc551416b4fc8c05e289d1831";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnCreateChatParticipant($accountId: ID!, $participantId: ID!) {\n  onCreateChatParticipant(accountId: $accountId, participantId: $participantId) {\n    __typename\n    id\n    accountId\n    channelId\n    phoneNumberIdExternal\n    participantId\n    participationStatus\n    unreadMessageCount\n    lastViewed\n    isStarred\n    joinedAt\n    leftAt\n    channelName\n    channelType\n    channelSubType\n    channelStatus\n    channelWillBeChargedNext\n    channelOpenUntil\n    lastMessageByLeadTime\n    lastMessageByUserTime\n    isLastMessageByLead\n    lastOutboundMessageId\n    lastOutboundMessageStatus\n    isNewMessageUpdate\n    tags\n    participantScopeIfInternal\n    userIdsForDirectChannel\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    participant {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
