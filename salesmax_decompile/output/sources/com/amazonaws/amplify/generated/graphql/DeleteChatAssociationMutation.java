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
import type.DeleteChatAssociationInput;
import type.ModelChatAssociationConditionInput;

/* loaded from: classes6.dex */
public final class DeleteChatAssociationMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteChatAssociation($input: DeleteChatAssociationInput!, $condition: ModelChatAssociationConditionInput) {\n  deleteChatAssociation(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    channelId\n    relatedObjectId\n    relatedObjectType\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatAssociationMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteChatAssociation";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteChatAssociation($input: DeleteChatAssociationInput!, $condition: ModelChatAssociationConditionInput) {\n  deleteChatAssociation(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    channelId\n    relatedObjectId\n    relatedObjectType\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelChatAssociationConditionInput condition;
        private DeleteChatAssociationInput input;

        public DeleteChatAssociationMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteChatAssociationMutation(this.input, this.condition);
        }

        public Builder condition(ModelChatAssociationConditionInput modelChatAssociationConditionInput) {
            this.condition = modelChatAssociationConditionInput;
            return this;
        }

        public Builder input(DeleteChatAssociationInput deleteChatAssociationInput) {
            this.input = deleteChatAssociationInput;
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
                List list = responseReader.readList(responseFieldArr[6], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatAssociationMutation.Channel.Mapper.1
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatAssociationMutation.Channel.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Channel.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Channel.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Channel.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Channel.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Channel.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], Channel.this.channelName);
                    responseWriter.writeString(responseFieldArr[5], Channel.this.messagePlatform);
                    responseWriter.writeList(responseFieldArr[6], Channel.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatAssociationMutation.Channel.1.1
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteChatAssociation", "deleteChatAssociation", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteChatAssociation deleteChatAssociation;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteChatAssociation.Mapper deleteChatAssociationFieldMapper = new DeleteChatAssociation.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteChatAssociation) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteChatAssociation>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatAssociationMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteChatAssociation read(ResponseReader responseReader2) {
                        return Mapper.this.deleteChatAssociationFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteChatAssociation deleteChatAssociation) {
            this.deleteChatAssociation = deleteChatAssociation;
        }

        public DeleteChatAssociation deleteChatAssociation() {
            return this.deleteChatAssociation;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteChatAssociation deleteChatAssociation = this.deleteChatAssociation;
            DeleteChatAssociation deleteChatAssociation2 = ((Data) obj).deleteChatAssociation;
            return deleteChatAssociation == null ? deleteChatAssociation2 == null : deleteChatAssociation.equals(deleteChatAssociation2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteChatAssociation deleteChatAssociation = this.deleteChatAssociation;
                this.$hashCode = (deleteChatAssociation == null ? 0 : deleteChatAssociation.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatAssociationMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteChatAssociation deleteChatAssociation = Data.this.deleteChatAssociation;
                    responseWriter.writeObject(responseField, deleteChatAssociation != null ? deleteChatAssociation.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteChatAssociation=" + this.deleteChatAssociation + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteChatAssociation {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Channel channel;
        final String channelId;
        final String createdAt;
        final String id;
        final String relatedObjectId;
        final String relatedObjectType;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<DeleteChatAssociation> {
            final Channel.Mapper channelFieldMapper = new Channel.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteChatAssociation map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteChatAssociation.$responseFields;
                return new DeleteChatAssociation(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (Channel) responseReader.readObject(responseFieldArr[8], new ResponseReader.ObjectReader<Channel>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatAssociationMutation.DeleteChatAssociation.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Channel read(ResponseReader responseReader2) {
                        return Mapper.this.channelFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("relatedObjectId", "relatedObjectId", null, false, customType, Collections.emptyList()), ResponseField.forString("relatedObjectType", "relatedObjectType", null, false, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("channel", "channel", null, true, Collections.emptyList())};
        }

        public DeleteChatAssociation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Channel channel) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.channelId = (String) Utils.checkNotNull(str4, "channelId == null");
            this.relatedObjectId = (String) Utils.checkNotNull(str5, "relatedObjectId == null");
            this.relatedObjectType = (String) Utils.checkNotNull(str6, "relatedObjectType == null");
            this.createdAt = str7;
            this.updatedAt = str8;
            this.channel = channel;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteChatAssociation)) {
                return false;
            }
            DeleteChatAssociation deleteChatAssociation = (DeleteChatAssociation) obj;
            if (this.__typename.equals(deleteChatAssociation.__typename) && this.id.equals(deleteChatAssociation.id) && this.accountId.equals(deleteChatAssociation.accountId) && this.channelId.equals(deleteChatAssociation.channelId) && this.relatedObjectId.equals(deleteChatAssociation.relatedObjectId) && this.relatedObjectType.equals(deleteChatAssociation.relatedObjectType) && ((str = this.createdAt) != null ? str.equals(deleteChatAssociation.createdAt) : deleteChatAssociation.createdAt == null) && ((str2 = this.updatedAt) != null ? str2.equals(deleteChatAssociation.updatedAt) : deleteChatAssociation.updatedAt == null)) {
                Channel channel = this.channel;
                Channel channel2 = deleteChatAssociation.channel;
                if (channel == null) {
                    if (channel2 == null) {
                        return true;
                    }
                } else if (channel.equals(channel2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.channelId.hashCode()) * 1000003) ^ this.relatedObjectId.hashCode()) * 1000003) ^ this.relatedObjectType.hashCode()) * 1000003;
                String str = this.createdAt;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Channel channel = this.channel;
                this.$hashCode = iHashCode3 ^ (channel != null ? channel.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatAssociationMutation.DeleteChatAssociation.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteChatAssociation.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteChatAssociation.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteChatAssociation.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteChatAssociation.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteChatAssociation.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], DeleteChatAssociation.this.relatedObjectId);
                    responseWriter.writeString(responseFieldArr[5], DeleteChatAssociation.this.relatedObjectType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], DeleteChatAssociation.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], DeleteChatAssociation.this.updatedAt);
                    ResponseField responseField = responseFieldArr[8];
                    Channel channel = DeleteChatAssociation.this.channel;
                    responseWriter.writeObject(responseField, channel != null ? channel.marshaller() : null);
                }
            };
        }

        public String relatedObjectId() {
            return this.relatedObjectId;
        }

        public String relatedObjectType() {
            return this.relatedObjectType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteChatAssociation{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", channelId=" + this.channelId + ", relatedObjectId=" + this.relatedObjectId + ", relatedObjectType=" + this.relatedObjectType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", channel=" + this.channel + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelChatAssociationConditionInput condition;
        private final DeleteChatAssociationInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteChatAssociationInput deleteChatAssociationInput, ModelChatAssociationConditionInput modelChatAssociationConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteChatAssociationInput;
            this.condition = modelChatAssociationConditionInput;
            linkedHashMap.put("input", deleteChatAssociationInput);
            linkedHashMap.put("condition", modelChatAssociationConditionInput);
        }

        public ModelChatAssociationConditionInput condition() {
            return this.condition;
        }

        public DeleteChatAssociationInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatAssociationMutation.Variables.1
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

    public DeleteChatAssociationMutation(DeleteChatAssociationInput deleteChatAssociationInput, ModelChatAssociationConditionInput modelChatAssociationConditionInput) {
        Utils.checkNotNull(deleteChatAssociationInput, "input == null");
        this.variables = new Variables(deleteChatAssociationInput, modelChatAssociationConditionInput);
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
        return "8fb1baef8c5f28a645194f990b84ed34d78b4cce16e50f3189f0b9801b43eac4";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteChatAssociation($input: DeleteChatAssociationInput!, $condition: ModelChatAssociationConditionInput) {\n  deleteChatAssociation(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    channelId\n    relatedObjectId\n    relatedObjectType\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
