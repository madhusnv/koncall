package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
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
import type.MessageSendCategory;
import type.ModelChatMentionsConditionInput;
import type.UpdateChatMentionsInput;

/* loaded from: classes4.dex */
public final class UpdateChatMentionsMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateChatMentions($input: UpdateChatMentionsInput!, $condition: ModelChatMentionsConditionInput) {\n  updateChatMentions(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    mentionedUserId\n    mentionedMessageId\n    channelId\n    mentionedById\n    status\n    expirationUnixTime\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    mentionedMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateChatMentions";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateChatMentions($input: UpdateChatMentionsInput!, $condition: ModelChatMentionsConditionInput) {\n  updateChatMentions(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    mentionedUserId\n    mentionedMessageId\n    channelId\n    mentionedById\n    status\n    expirationUnixTime\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    mentionedMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelChatMentionsConditionInput condition;
        private UpdateChatMentionsInput input;

        public UpdateChatMentionsMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateChatMentionsMutation(this.input, this.condition);
        }

        public Builder condition(ModelChatMentionsConditionInput modelChatMentionsConditionInput) {
            this.condition = modelChatMentionsConditionInput;
            return this;
        }

        public Builder input(UpdateChatMentionsInput updateChatMentionsInput) {
            this.input = updateChatMentionsInput;
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
                List list = responseReader.readList(responseFieldArr[6], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.Channel.Mapper.1
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.Channel.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Channel.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Channel.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Channel.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Channel.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Channel.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], Channel.this.channelName);
                    responseWriter.writeString(responseFieldArr[5], Channel.this.messagePlatform);
                    responseWriter.writeList(responseFieldArr[6], Channel.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.Channel.1.1
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateChatMentions", "updateChatMentions", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateChatMentions updateChatMentions;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateChatMentions.Mapper updateChatMentionsFieldMapper = new UpdateChatMentions.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateChatMentions) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateChatMentions>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateChatMentions read(ResponseReader responseReader2) {
                        return Mapper.this.updateChatMentionsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateChatMentions updateChatMentions) {
            this.updateChatMentions = updateChatMentions;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateChatMentions updateChatMentions = this.updateChatMentions;
            UpdateChatMentions updateChatMentions2 = ((Data) obj).updateChatMentions;
            return updateChatMentions == null ? updateChatMentions2 == null : updateChatMentions.equals(updateChatMentions2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateChatMentions updateChatMentions = this.updateChatMentions;
                this.$hashCode = (updateChatMentions == null ? 0 : updateChatMentions.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateChatMentions updateChatMentions = Data.this.updateChatMentions;
                    responseWriter.writeObject(responseField, updateChatMentions != null ? updateChatMentions.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateChatMentions=" + this.updateChatMentions + "}";
            }
            return this.$toString;
        }

        public UpdateChatMentions updateChatMentions() {
            return this.updateChatMentions;
        }
    }

    public static class MentionedMessage {
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

        public static final class Mapper implements ResponseFieldMapper<MentionedMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public MentionedMessage map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = MentionedMessage.$responseFields;
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
                return new MentionedMessage(string, str, str2, string2, string3, string4, string5, string6, string7, str3, str4, str5, str6, string8, string9, string10, string11 != null ? MessageSendCategory.valueOf(string11) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readString(responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), responseReader.readString(responseFieldArr[27]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[28]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), responseReader.readString(responseFieldArr[33]), responseReader.readString(responseFieldArr[34]), responseReader.readString(responseFieldArr[35]), responseReader.readList(responseFieldArr[36], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.MentionedMessage.Mapper.1
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

        public MentionedMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, MessageSendCategory messageSendCategory, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<String> list, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool2, String str42, Boolean bool3, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52) {
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
            if (!(obj instanceof MentionedMessage)) {
                return false;
            }
            MentionedMessage mentionedMessage = (MentionedMessage) obj;
            if (this.__typename.equals(mentionedMessage.__typename) && this.id.equals(mentionedMessage.id) && this.accountId.equals(mentionedMessage.accountId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(mentionedMessage.phoneNumberIdExternal) : mentionedMessage.phoneNumberIdExternal == null) && ((str2 = this.messagePlatform) != null ? str2.equals(mentionedMessage.messagePlatform) : mentionedMessage.messagePlatform == null) && ((str3 = this.externalMessageReferenceId) != null ? str3.equals(mentionedMessage.externalMessageReferenceId) : mentionedMessage.externalMessageReferenceId == null) && ((str4 = this.externalConversationId) != null ? str4.equals(mentionedMessage.externalConversationId) : mentionedMessage.externalConversationId == null) && ((str5 = this.recipientExternalId) != null ? str5.equals(mentionedMessage.recipientExternalId) : mentionedMessage.recipientExternalId == null) && ((str6 = this.recipientExternalIdType) != null ? str6.equals(mentionedMessage.recipientExternalIdType) : mentionedMessage.recipientExternalIdType == null) && this.channelId.equals(mentionedMessage.channelId) && ((str7 = this.contactId) != null ? str7.equals(mentionedMessage.contactId) : mentionedMessage.contactId == null) && ((str8 = this.visitorId) != null ? str8.equals(mentionedMessage.visitorId) : mentionedMessage.visitorId == null) && ((str9 = this.referredContactId) != null ? str9.equals(mentionedMessage.referredContactId) : mentionedMessage.referredContactId == null) && ((str10 = this.messageType) != null ? str10.equals(mentionedMessage.messageType) : mentionedMessage.messageType == null) && ((str11 = this.messageSubType) != null ? str11.equals(mentionedMessage.messageSubType) : mentionedMessage.messageSubType == null) && ((str12 = this.messageCategory) != null ? str12.equals(mentionedMessage.messageCategory) : mentionedMessage.messageCategory == null) && ((messageSendCategory = this.messageSendCategory) != null ? messageSendCategory.equals(mentionedMessage.messageSendCategory) : mentionedMessage.messageSendCategory == null) && ((str13 = this.replyingToMessageId) != null ? str13.equals(mentionedMessage.replyingToMessageId) : mentionedMessage.replyingToMessageId == null) && ((str14 = this.replyingToMessageIdExternal) != null ? str14.equals(mentionedMessage.replyingToMessageIdExternal) : mentionedMessage.replyingToMessageIdExternal == null) && ((str15 = this.responseMessageId) != null ? str15.equals(mentionedMessage.responseMessageId) : mentionedMessage.responseMessageId == null) && ((str16 = this.followUpType) != null ? str16.equals(mentionedMessage.followUpType) : mentionedMessage.followUpType == null) && ((str17 = this.replyType) != null ? str17.equals(mentionedMessage.replyType) : mentionedMessage.replyType == null) && ((str18 = this.replyTypeId) != null ? str18.equals(mentionedMessage.replyTypeId) : mentionedMessage.replyTypeId == null) && ((str19 = this.referredProductCatalogId) != null ? str19.equals(mentionedMessage.referredProductCatalogId) : mentionedMessage.referredProductCatalogId == null) && ((str20 = this.referredProductRetailerId) != null ? str20.equals(mentionedMessage.referredProductRetailerId) : mentionedMessage.referredProductRetailerId == null) && ((str21 = this.referral) != null ? str21.equals(mentionedMessage.referral) : mentionedMessage.referral == null) && ((bool = this.isStarred) != null ? bool.equals(mentionedMessage.isStarred) : mentionedMessage.isStarred == null) && ((str22 = this.status) != null ? str22.equals(mentionedMessage.status) : mentionedMessage.status == null) && ((str23 = this.errorMessages) != null ? str23.equals(mentionedMessage.errorMessages) : mentionedMessage.errorMessages == null) && ((str24 = this.sentAt) != null ? str24.equals(mentionedMessage.sentAt) : mentionedMessage.sentAt == null) && ((str25 = this.deliveredAt) != null ? str25.equals(mentionedMessage.deliveredAt) : mentionedMessage.deliveredAt == null) && ((str26 = this.readAt) != null ? str26.equals(mentionedMessage.readAt) : mentionedMessage.readAt == null) && ((str27 = this.internalTemplateId) != null ? str27.equals(mentionedMessage.internalTemplateId) : mentionedMessage.internalTemplateId == null) && ((str28 = this.externalTemplateId) != null ? str28.equals(mentionedMessage.externalTemplateId) : mentionedMessage.externalTemplateId == null) && ((str29 = this.externalTemplateCategory) != null ? str29.equals(mentionedMessage.externalTemplateCategory) : mentionedMessage.externalTemplateCategory == null) && ((str30 = this.text) != null ? str30.equals(mentionedMessage.text) : mentionedMessage.text == null) && ((list = this.contactObjectToSend) != null ? list.equals(mentionedMessage.contactObjectToSend) : mentionedMessage.contactObjectToSend == null) && ((str31 = this.locationObjectToSend) != null ? str31.equals(mentionedMessage.locationObjectToSend) : mentionedMessage.locationObjectToSend == null) && ((str32 = this.adddressMessageParameters) != null ? str32.equals(mentionedMessage.adddressMessageParameters) : mentionedMessage.adddressMessageParameters == null) && ((str33 = this.headerText) != null ? str33.equals(mentionedMessage.headerText) : mentionedMessage.headerText == null) && ((str34 = this.footerText) != null ? str34.equals(mentionedMessage.footerText) : mentionedMessage.footerText == null) && ((str35 = this.headerType) != null ? str35.equals(mentionedMessage.headerType) : mentionedMessage.headerType == null) && ((str36 = this.mediaObjectId) != null ? str36.equals(mentionedMessage.mediaObjectId) : mentionedMessage.mediaObjectId == null) && ((str37 = this.mediaMetadata) != null ? str37.equals(mentionedMessage.mediaMetadata) : mentionedMessage.mediaMetadata == null) && ((bool2 = this.hasImage) != null ? bool2.equals(mentionedMessage.hasImage) : mentionedMessage.hasImage == null) && ((str38 = this.thumbnailUrl) != null ? str38.equals(mentionedMessage.thumbnailUrl) : mentionedMessage.thumbnailUrl == null) && ((bool3 = this.isInbound) != null ? bool3.equals(mentionedMessage.isInbound) : mentionedMessage.isInbound == null) && ((str39 = this.chatUserId) != null ? str39.equals(mentionedMessage.chatUserId) : mentionedMessage.chatUserId == null) && ((str40 = this.chatUserName) != null ? str40.equals(mentionedMessage.chatUserName) : mentionedMessage.chatUserName == null) && ((str41 = this.chatBotId) != null ? str41.equals(mentionedMessage.chatBotId) : mentionedMessage.chatBotId == null) && ((str42 = this.chatUserAccountIdIfExternal) != null ? str42.equals(mentionedMessage.chatUserAccountIdIfExternal) : mentionedMessage.chatUserAccountIdIfExternal == null) && ((str43 = this.chatUserAccountNameIfExternal) != null ? str43.equals(mentionedMessage.chatUserAccountNameIfExternal) : mentionedMessage.chatUserAccountNameIfExternal == null) && ((str44 = this.directChatUserId) != null ? str44.equals(mentionedMessage.directChatUserId) : mentionedMessage.directChatUserId == null) && ((str45 = this.primaryTeamId) != null ? str45.equals(mentionedMessage.primaryTeamId) : mentionedMessage.primaryTeamId == null) && ((str46 = this.linkedEngagementIdIfBroadcast) != null ? str46.equals(mentionedMessage.linkedEngagementIdIfBroadcast) : mentionedMessage.linkedEngagementIdIfBroadcast == null) && ((str47 = this.createdAt) != null ? str47.equals(mentionedMessage.createdAt) : mentionedMessage.createdAt == null)) {
                String str48 = this.updatedAt;
                String str49 = mentionedMessage.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.MentionedMessage.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = MentionedMessage.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], MentionedMessage.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], MentionedMessage.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], MentionedMessage.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], MentionedMessage.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], MentionedMessage.this.messagePlatform);
                    responseWriter.writeString(responseFieldArr[5], MentionedMessage.this.externalMessageReferenceId);
                    responseWriter.writeString(responseFieldArr[6], MentionedMessage.this.externalConversationId);
                    responseWriter.writeString(responseFieldArr[7], MentionedMessage.this.recipientExternalId);
                    responseWriter.writeString(responseFieldArr[8], MentionedMessage.this.recipientExternalIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], MentionedMessage.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], MentionedMessage.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], MentionedMessage.this.visitorId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], MentionedMessage.this.referredContactId);
                    responseWriter.writeString(responseFieldArr[13], MentionedMessage.this.messageType);
                    responseWriter.writeString(responseFieldArr[14], MentionedMessage.this.messageSubType);
                    responseWriter.writeString(responseFieldArr[15], MentionedMessage.this.messageCategory);
                    ResponseField responseField = responseFieldArr[16];
                    MessageSendCategory messageSendCategory = MentionedMessage.this.messageSendCategory;
                    responseWriter.writeString(responseField, messageSendCategory != null ? messageSendCategory.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], MentionedMessage.this.replyingToMessageId);
                    responseWriter.writeString(responseFieldArr[18], MentionedMessage.this.replyingToMessageIdExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], MentionedMessage.this.responseMessageId);
                    responseWriter.writeString(responseFieldArr[20], MentionedMessage.this.followUpType);
                    responseWriter.writeString(responseFieldArr[21], MentionedMessage.this.replyType);
                    responseWriter.writeString(responseFieldArr[22], MentionedMessage.this.replyTypeId);
                    responseWriter.writeString(responseFieldArr[23], MentionedMessage.this.referredProductCatalogId);
                    responseWriter.writeString(responseFieldArr[24], MentionedMessage.this.referredProductRetailerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], MentionedMessage.this.referral);
                    responseWriter.writeBoolean(responseFieldArr[26], MentionedMessage.this.isStarred);
                    responseWriter.writeString(responseFieldArr[27], MentionedMessage.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[28], MentionedMessage.this.errorMessages);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[29], MentionedMessage.this.sentAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], MentionedMessage.this.deliveredAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], MentionedMessage.this.readAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], MentionedMessage.this.internalTemplateId);
                    responseWriter.writeString(responseFieldArr[33], MentionedMessage.this.externalTemplateId);
                    responseWriter.writeString(responseFieldArr[34], MentionedMessage.this.externalTemplateCategory);
                    responseWriter.writeString(responseFieldArr[35], MentionedMessage.this.text);
                    responseWriter.writeList(responseFieldArr[36], MentionedMessage.this.contactObjectToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.MentionedMessage.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], MentionedMessage.this.locationObjectToSend);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], MentionedMessage.this.adddressMessageParameters);
                    responseWriter.writeString(responseFieldArr[39], MentionedMessage.this.headerText);
                    responseWriter.writeString(responseFieldArr[40], MentionedMessage.this.footerText);
                    responseWriter.writeString(responseFieldArr[41], MentionedMessage.this.headerType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], MentionedMessage.this.mediaObjectId);
                    responseWriter.writeString(responseFieldArr[43], MentionedMessage.this.mediaMetadata);
                    responseWriter.writeBoolean(responseFieldArr[44], MentionedMessage.this.hasImage);
                    responseWriter.writeString(responseFieldArr[45], MentionedMessage.this.thumbnailUrl);
                    responseWriter.writeBoolean(responseFieldArr[46], MentionedMessage.this.isInbound);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], MentionedMessage.this.chatUserId);
                    responseWriter.writeString(responseFieldArr[48], MentionedMessage.this.chatUserName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[49], MentionedMessage.this.chatBotId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], MentionedMessage.this.chatUserAccountIdIfExternal);
                    responseWriter.writeString(responseFieldArr[51], MentionedMessage.this.chatUserAccountNameIfExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], MentionedMessage.this.directChatUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[53], MentionedMessage.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], MentionedMessage.this.linkedEngagementIdIfBroadcast);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], MentionedMessage.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], MentionedMessage.this.updatedAt);
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
                this.$toString = "MentionedMessage{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", messagePlatform=" + this.messagePlatform + ", externalMessageReferenceId=" + this.externalMessageReferenceId + ", externalConversationId=" + this.externalConversationId + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", channelId=" + this.channelId + ", contactId=" + this.contactId + ", visitorId=" + this.visitorId + ", referredContactId=" + this.referredContactId + ", messageType=" + this.messageType + ", messageSubType=" + this.messageSubType + ", messageCategory=" + this.messageCategory + ", messageSendCategory=" + this.messageSendCategory + ", replyingToMessageId=" + this.replyingToMessageId + ", replyingToMessageIdExternal=" + this.replyingToMessageIdExternal + ", responseMessageId=" + this.responseMessageId + ", followUpType=" + this.followUpType + ", replyType=" + this.replyType + ", replyTypeId=" + this.replyTypeId + ", referredProductCatalogId=" + this.referredProductCatalogId + ", referredProductRetailerId=" + this.referredProductRetailerId + ", referral=" + this.referral + ", isStarred=" + this.isStarred + ", status=" + this.status + ", errorMessages=" + this.errorMessages + ", sentAt=" + this.sentAt + ", deliveredAt=" + this.deliveredAt + ", readAt=" + this.readAt + ", internalTemplateId=" + this.internalTemplateId + ", externalTemplateId=" + this.externalTemplateId + ", externalTemplateCategory=" + this.externalTemplateCategory + ", text=" + this.text + ", contactObjectToSend=" + this.contactObjectToSend + ", locationObjectToSend=" + this.locationObjectToSend + ", adddressMessageParameters=" + this.adddressMessageParameters + ", headerText=" + this.headerText + ", footerText=" + this.footerText + ", headerType=" + this.headerType + ", mediaObjectId=" + this.mediaObjectId + ", mediaMetadata=" + this.mediaMetadata + ", hasImage=" + this.hasImage + ", thumbnailUrl=" + this.thumbnailUrl + ", isInbound=" + this.isInbound + ", chatUserId=" + this.chatUserId + ", chatUserName=" + this.chatUserName + ", chatBotId=" + this.chatBotId + ", chatUserAccountIdIfExternal=" + this.chatUserAccountIdIfExternal + ", chatUserAccountNameIfExternal=" + this.chatUserAccountNameIfExternal + ", directChatUserId=" + this.directChatUserId + ", primaryTeamId=" + this.primaryTeamId + ", linkedEngagementIdIfBroadcast=" + this.linkedEngagementIdIfBroadcast + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class UpdateChatMentions {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Channel channel;
        final String channelId;
        final String createdAt;
        final Long expirationUnixTime;
        final String id;
        final String mentionedById;
        final MentionedMessage mentionedMessage;
        final String mentionedMessageId;
        final String mentionedUserId;
        final String status;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateChatMentions> {
            final Channel.Mapper channelFieldMapper = new Channel.Mapper();
            final MentionedMessage.Mapper mentionedMessageFieldMapper = new MentionedMessage.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateChatMentions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateChatMentions.$responseFields;
                return new UpdateChatMentions(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (Channel) responseReader.readObject(responseFieldArr[11], new ResponseReader.ObjectReader<Channel>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.UpdateChatMentions.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Channel read(ResponseReader responseReader2) {
                        return Mapper.this.channelFieldMapper.map(responseReader2);
                    }
                }), (MentionedMessage) responseReader.readObject(responseFieldArr[12], new ResponseReader.ObjectReader<MentionedMessage>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.UpdateChatMentions.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public MentionedMessage read(ResponseReader responseReader2) {
                        return Mapper.this.mentionedMessageFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("mentionedUserId", "mentionedUserId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("mentionedMessageId", "mentionedMessageId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("mentionedById", "mentionedById", null, true, customType, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("channel", "channel", null, true, Collections.emptyList()), ResponseField.forObject("mentionedMessage", "mentionedMessage", null, true, Collections.emptyList())};
        }

        public UpdateChatMentions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, String str9, String str10, Channel channel, MentionedMessage mentionedMessage) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.mentionedUserId = (String) Utils.checkNotNull(str4, "mentionedUserId == null");
            this.mentionedMessageId = (String) Utils.checkNotNull(str5, "mentionedMessageId == null");
            this.channelId = (String) Utils.checkNotNull(str6, "channelId == null");
            this.mentionedById = str7;
            this.status = str8;
            this.expirationUnixTime = l;
            this.createdAt = str9;
            this.updatedAt = str10;
            this.channel = channel;
            this.mentionedMessage = mentionedMessage;
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

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Long l;
            String str3;
            String str4;
            Channel channel;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateChatMentions)) {
                return false;
            }
            UpdateChatMentions updateChatMentions = (UpdateChatMentions) obj;
            if (this.__typename.equals(updateChatMentions.__typename) && this.id.equals(updateChatMentions.id) && this.accountId.equals(updateChatMentions.accountId) && this.mentionedUserId.equals(updateChatMentions.mentionedUserId) && this.mentionedMessageId.equals(updateChatMentions.mentionedMessageId) && this.channelId.equals(updateChatMentions.channelId) && ((str = this.mentionedById) != null ? str.equals(updateChatMentions.mentionedById) : updateChatMentions.mentionedById == null) && ((str2 = this.status) != null ? str2.equals(updateChatMentions.status) : updateChatMentions.status == null) && ((l = this.expirationUnixTime) != null ? l.equals(updateChatMentions.expirationUnixTime) : updateChatMentions.expirationUnixTime == null) && ((str3 = this.createdAt) != null ? str3.equals(updateChatMentions.createdAt) : updateChatMentions.createdAt == null) && ((str4 = this.updatedAt) != null ? str4.equals(updateChatMentions.updatedAt) : updateChatMentions.updatedAt == null) && ((channel = this.channel) != null ? channel.equals(updateChatMentions.channel) : updateChatMentions.channel == null)) {
                MentionedMessage mentionedMessage = this.mentionedMessage;
                MentionedMessage mentionedMessage2 = updateChatMentions.mentionedMessage;
                if (mentionedMessage == null) {
                    if (mentionedMessage2 == null) {
                        return true;
                    }
                } else if (mentionedMessage.equals(mentionedMessage2)) {
                    return true;
                }
            }
            return false;
        }

        public Long expirationUnixTime() {
            return this.expirationUnixTime;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.mentionedUserId.hashCode()) * 1000003) ^ this.mentionedMessageId.hashCode()) * 1000003) ^ this.channelId.hashCode()) * 1000003;
                String str = this.mentionedById;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.status;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Long l = this.expirationUnixTime;
                int iHashCode4 = (iHashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003;
                String str3 = this.createdAt;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.updatedAt;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                Channel channel = this.channel;
                int iHashCode7 = (iHashCode6 ^ (channel == null ? 0 : channel.hashCode())) * 1000003;
                MentionedMessage mentionedMessage = this.mentionedMessage;
                this.$hashCode = iHashCode7 ^ (mentionedMessage != null ? mentionedMessage.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.UpdateChatMentions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateChatMentions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateChatMentions.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateChatMentions.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateChatMentions.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateChatMentions.this.mentionedUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], UpdateChatMentions.this.mentionedMessageId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateChatMentions.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateChatMentions.this.mentionedById);
                    responseWriter.writeString(responseFieldArr[7], UpdateChatMentions.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateChatMentions.this.expirationUnixTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateChatMentions.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateChatMentions.this.updatedAt);
                    ResponseField responseField = responseFieldArr[11];
                    Channel channel = UpdateChatMentions.this.channel;
                    responseWriter.writeObject(responseField, channel != null ? channel.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[12];
                    MentionedMessage mentionedMessage = UpdateChatMentions.this.mentionedMessage;
                    responseWriter.writeObject(responseField2, mentionedMessage != null ? mentionedMessage.marshaller() : null);
                }
            };
        }

        public String mentionedById() {
            return this.mentionedById;
        }

        public MentionedMessage mentionedMessage() {
            return this.mentionedMessage;
        }

        public String mentionedMessageId() {
            return this.mentionedMessageId;
        }

        public String mentionedUserId() {
            return this.mentionedUserId;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateChatMentions{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", mentionedUserId=" + this.mentionedUserId + ", mentionedMessageId=" + this.mentionedMessageId + ", channelId=" + this.channelId + ", mentionedById=" + this.mentionedById + ", status=" + this.status + ", expirationUnixTime=" + this.expirationUnixTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", channel=" + this.channel + ", mentionedMessage=" + this.mentionedMessage + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelChatMentionsConditionInput condition;
        private final UpdateChatMentionsInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateChatMentionsInput updateChatMentionsInput, ModelChatMentionsConditionInput modelChatMentionsConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateChatMentionsInput;
            this.condition = modelChatMentionsConditionInput;
            linkedHashMap.put("input", updateChatMentionsInput);
            linkedHashMap.put("condition", modelChatMentionsConditionInput);
        }

        public ModelChatMentionsConditionInput condition() {
            return this.condition;
        }

        public UpdateChatMentionsInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatMentionsMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                    inputFieldWriter.writeObject("condition", Variables.this.condition != null ? Variables.this.condition.marshaller() : null);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public UpdateChatMentionsMutation(UpdateChatMentionsInput updateChatMentionsInput, ModelChatMentionsConditionInput modelChatMentionsConditionInput) {
        Utils.checkNotNull(updateChatMentionsInput, "input == null");
        this.variables = new Variables(updateChatMentionsInput, modelChatMentionsConditionInput);
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
        return "59f344bfef703e11d1d63179b674d93c290a88bde1a097d66ed8a77da4f83bd9";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateChatMentions($input: UpdateChatMentionsInput!, $condition: ModelChatMentionsConditionInput) {\n  updateChatMentions(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    mentionedUserId\n    mentionedMessageId\n    channelId\n    mentionedById\n    status\n    expirationUnixTime\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    mentionedMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
