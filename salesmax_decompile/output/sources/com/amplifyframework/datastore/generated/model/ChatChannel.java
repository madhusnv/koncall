package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"contactId"}, name = "channelByContact"), @Index(fields = {"visitorId"}, name = "channelByVisitor"), @Index(fields = {"accountId", "userIdsForDirectChannel"}, name = "directChannelByUserIds")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "ChatChannels")
/* loaded from: classes5.dex */
public final class ChatChannel implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Boolean")
    private final Boolean chanelHasOnlyBroadcast;

    @ModelField(targetType = "String")
    private final String channelName;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime channelOpenUntil;

    @ModelField(targetType = "String")
    private final String channelProfilePic;

    @ModelField(targetType = "String")
    private final String channelStatus;

    @ModelField(targetType = "String")
    private final String channelSubType;

    @ModelField(targetType = "String")
    private final String channelType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime channelWillBeChargedNext;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "Boolean")
    private final Boolean externalParticipantsAllowed;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isLastMessageByLead;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastMessageByLeadTime;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastMessageByUserTime;

    @ModelField(targetType = "ID")
    private final String lastOutboundMessageId;

    @ModelField(targetType = "String")
    private final String lastOutboundMessageStatus;

    @ModelField(targetType = "Boolean")
    private final Boolean lastOutboundMessageWasBroadcast;

    @ModelField(targetType = "String")
    private final String messagePlatform;

    @ModelField(targetType = "ChatMessage")
    @HasMany(associatedWith = "channel", type = ChatMessage.class)
    private final List<ChatMessage> messages;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User owner;

    @ModelField(targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "String")
    private final String participantScopeIfInternal;

    @ModelField(targetType = "ChatParticipant")
    @HasMany(associatedWith = "channel", type = ChatParticipant.class)
    private final List<ChatParticipant> participants;

    @ModelField(targetType = "String")
    private final String phoneNumberIdExternal;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime readNotifiedAt;

    @ModelField(targetType = "String")
    private final String recipientExternalId;

    @ModelField(targetType = "String")
    private final String recipientExternalIdType;

    @ModelField(targetType = "String")
    private final String recipientType;

    @ModelField(targetType = "ID")
    private final String salesmaxAccountId;

    @ModelField(targetType = "String")
    private final List<String> tags;

    @ModelField(targetType = "ContactAssignmentStatus")
    private final ContactAssignmentStatus toBeAssigned;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "String")
    private final String userIdsForDirectChannel;

    @ModelField(targetType = "ID")
    private final String visitorId;
    public static final QueryField ID = QueryField.field("ChatChannel", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ChatChannel", "accountId");
    public static final QueryField PHONE_NUMBER_ID_EXTERNAL = QueryField.field("ChatChannel", "phoneNumberIdExternal");
    public static final QueryField CHANNEL_NAME = QueryField.field("ChatChannel", "channelName");
    public static final QueryField MESSAGE_PLATFORM = QueryField.field("ChatChannel", "messagePlatform");
    public static final QueryField TAGS = QueryField.field("ChatChannel", "tags");
    public static final QueryField RECIPIENT_TYPE = QueryField.field("ChatChannel", "recipientType");
    public static final QueryField CHANNEL_TYPE = QueryField.field("ChatChannel", "channelType");
    public static final QueryField CHANNEL_SUB_TYPE = QueryField.field("ChatChannel", "channelSubType");
    public static final QueryField EXTERNAL_PARTICIPANTS_ALLOWED = QueryField.field("ChatChannel", "externalParticipantsAllowed");
    public static final QueryField PARTICIPANT_SCOPE_IF_INTERNAL = QueryField.field("ChatChannel", "participantScopeIfInternal");
    public static final QueryField USER_IDS_FOR_DIRECT_CHANNEL = QueryField.field("ChatChannel", "userIdsForDirectChannel");
    public static final QueryField CHANNEL_STATUS = QueryField.field("ChatChannel", "channelStatus");
    public static final QueryField CHANNEL_WILL_BE_CHARGED_NEXT = QueryField.field("ChatChannel", "channelWillBeChargedNext");
    public static final QueryField CHANNEL_OPEN_UNTIL = QueryField.field("ChatChannel", "channelOpenUntil");
    public static final QueryField VISITOR_ID = QueryField.field("ChatChannel", "visitorId");
    public static final QueryField CONTACT = QueryField.field("ChatChannel", "contactId");
    public static final QueryField RECIPIENT_EXTERNAL_ID = QueryField.field("ChatChannel", "recipientExternalId");
    public static final QueryField RECIPIENT_EXTERNAL_ID_TYPE = QueryField.field("ChatChannel", "recipientExternalIdType");
    public static final QueryField OWNER_ID = QueryField.field("ChatChannel", "ownerId");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("ChatChannel", "primaryTeamId");
    public static final QueryField TO_BE_ASSIGNED = QueryField.field("ChatChannel", "toBeAssigned");
    public static final QueryField CREATED_BY_ID = QueryField.field("ChatChannel", "createdById");
    public static final QueryField READ_NOTIFIED_AT = QueryField.field("ChatChannel", "readNotifiedAt");
    public static final QueryField LAST_MESSAGE_BY_LEAD_TIME = QueryField.field("ChatChannel", "lastMessageByLeadTime");
    public static final QueryField LAST_MESSAGE_BY_USER_TIME = QueryField.field("ChatChannel", "lastMessageByUserTime");
    public static final QueryField IS_LAST_MESSAGE_BY_LEAD = QueryField.field("ChatChannel", "isLastMessageByLead");
    public static final QueryField LAST_OUTBOUND_MESSAGE_ID = QueryField.field("ChatChannel", "lastOutboundMessageId");
    public static final QueryField LAST_OUTBOUND_MESSAGE_STATUS = QueryField.field("ChatChannel", "lastOutboundMessageStatus");
    public static final QueryField LAST_OUTBOUND_MESSAGE_WAS_BROADCAST = QueryField.field("ChatChannel", "lastOutboundMessageWasBroadcast");
    public static final QueryField CHANEL_HAS_ONLY_BROADCAST = QueryField.field("ChatChannel", "chanelHasOnlyBroadcast");
    public static final QueryField SALESMAX_ACCOUNT_ID = QueryField.field("ChatChannel", "salesmaxAccountId");
    public static final QueryField CHANNEL_PROFILE_PIC = QueryField.field("ChatChannel", "channelProfilePic");
    public static final QueryField CREATED_AT = QueryField.field("ChatChannel", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ChatChannel", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        ChatChannel build();

        BuildStep chanelHasOnlyBroadcast(Boolean bool);

        BuildStep channelName(String str);

        BuildStep channelOpenUntil(Temporal.DateTime dateTime);

        BuildStep channelProfilePic(String str);

        BuildStep channelStatus(String str);

        BuildStep channelSubType(String str);

        BuildStep channelType(String str);

        BuildStep channelWillBeChargedNext(Temporal.DateTime dateTime);

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep externalParticipantsAllowed(Boolean bool);

        BuildStep id(String str);

        BuildStep isLastMessageByLead(Boolean bool);

        BuildStep lastMessageByLeadTime(Temporal.DateTime dateTime);

        BuildStep lastMessageByUserTime(Temporal.DateTime dateTime);

        BuildStep lastOutboundMessageId(String str);

        BuildStep lastOutboundMessageStatus(String str);

        BuildStep lastOutboundMessageWasBroadcast(Boolean bool);

        BuildStep messagePlatform(String str);

        BuildStep ownerId(String str);

        BuildStep participantScopeIfInternal(String str);

        BuildStep phoneNumberIdExternal(String str);

        BuildStep primaryTeamId(String str);

        BuildStep readNotifiedAt(Temporal.DateTime dateTime);

        BuildStep recipientExternalId(String str);

        BuildStep recipientExternalIdType(String str);

        BuildStep recipientType(String str);

        BuildStep salesmaxAccountId(String str);

        BuildStep tags(List<String> list);

        BuildStep toBeAssigned(ContactAssignmentStatus contactAssignmentStatus);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep userIdsForDirectChannel(String str);

        BuildStep visitorId(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Boolean chanelHasOnlyBroadcast;
        private String channelName;
        private Temporal.DateTime channelOpenUntil;
        private String channelProfilePic;
        private String channelStatus;
        private String channelSubType;
        private String channelType;
        private Temporal.DateTime channelWillBeChargedNext;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private String createdById;
        private Boolean externalParticipantsAllowed;
        private String id;
        private Boolean isLastMessageByLead;
        private Temporal.DateTime lastMessageByLeadTime;
        private Temporal.DateTime lastMessageByUserTime;
        private String lastOutboundMessageId;
        private String lastOutboundMessageStatus;
        private Boolean lastOutboundMessageWasBroadcast;
        private String messagePlatform;
        private String ownerId;
        private String participantScopeIfInternal;
        private String phoneNumberIdExternal;
        private String primaryTeamId;
        private Temporal.DateTime readNotifiedAt;
        private String recipientExternalId;
        private String recipientExternalIdType;
        private String recipientType;
        private String salesmaxAccountId;
        private List<String> tags;
        private ContactAssignmentStatus toBeAssigned;
        private Temporal.DateTime updatedAt;
        private String userIdsForDirectChannel;
        private String visitorId;

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public ChatChannel build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ChatChannel(string, this.accountId, this.phoneNumberIdExternal, this.channelName, this.messagePlatform, this.tags, this.recipientType, this.channelType, this.channelSubType, this.externalParticipantsAllowed, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.visitorId, this.contact, this.recipientExternalId, this.recipientExternalIdType, this.ownerId, this.primaryTeamId, this.toBeAssigned, this.createdById, this.readNotifiedAt, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.lastOutboundMessageWasBroadcast, this.chanelHasOnlyBroadcast, this.salesmaxAccountId, this.channelProfilePic, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep chanelHasOnlyBroadcast(Boolean bool) {
            this.chanelHasOnlyBroadcast = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep channelName(String str) {
            this.channelName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep channelOpenUntil(Temporal.DateTime dateTime) {
            this.channelOpenUntil = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep channelProfilePic(String str) {
            this.channelProfilePic = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep channelStatus(String str) {
            this.channelStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep channelSubType(String str) {
            this.channelSubType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep channelType(String str) {
            this.channelType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep channelWillBeChargedNext(Temporal.DateTime dateTime) {
            this.channelWillBeChargedNext = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep externalParticipantsAllowed(Boolean bool) {
            this.externalParticipantsAllowed = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep isLastMessageByLead(Boolean bool) {
            this.isLastMessageByLead = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep lastMessageByLeadTime(Temporal.DateTime dateTime) {
            this.lastMessageByLeadTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep lastMessageByUserTime(Temporal.DateTime dateTime) {
            this.lastMessageByUserTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep lastOutboundMessageId(String str) {
            this.lastOutboundMessageId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep lastOutboundMessageStatus(String str) {
            this.lastOutboundMessageStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep lastOutboundMessageWasBroadcast(Boolean bool) {
            this.lastOutboundMessageWasBroadcast = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep messagePlatform(String str) {
            this.messagePlatform = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep participantScopeIfInternal(String str) {
            this.participantScopeIfInternal = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep phoneNumberIdExternal(String str) {
            this.phoneNumberIdExternal = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep readNotifiedAt(Temporal.DateTime dateTime) {
            this.readNotifiedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep recipientExternalId(String str) {
            this.recipientExternalId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep recipientExternalIdType(String str) {
            this.recipientExternalIdType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep recipientType(String str) {
            this.recipientType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep salesmaxAccountId(String str) {
            this.salesmaxAccountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            this.toBeAssigned = contactAssignmentStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep userIdsForDirectChannel(String str) {
            this.userIdsForDirectChannel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public BuildStep visitorId(String str) {
            this.visitorId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str12, Contact contact, String str13, String str14, String str15, String str16, ContactAssignmentStatus contactAssignmentStatus, String str17, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Boolean bool2, String str18, String str19, Boolean bool3, Boolean bool4, String str20, String str21, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7) {
            this.id = str;
            this.accountId = str2;
            this.phoneNumberIdExternal = str3;
            this.channelName = str4;
            this.messagePlatform = str5;
            this.tags = list;
            this.recipientType = str6;
            this.channelType = str7;
            this.channelSubType = str8;
            this.externalParticipantsAllowed = bool;
            this.participantScopeIfInternal = str9;
            this.userIdsForDirectChannel = str10;
            this.channelStatus = str11;
            this.channelWillBeChargedNext = dateTime;
            this.channelOpenUntil = dateTime2;
            this.visitorId = str12;
            this.contact = contact;
            this.recipientExternalId = str13;
            this.recipientExternalIdType = str14;
            this.ownerId = str15;
            this.primaryTeamId = str16;
            this.toBeAssigned = contactAssignmentStatus;
            this.createdById = str17;
            this.readNotifiedAt = dateTime3;
            this.lastMessageByLeadTime = dateTime4;
            this.lastMessageByUserTime = dateTime5;
            this.isLastMessageByLead = bool2;
            this.lastOutboundMessageId = str18;
            this.lastOutboundMessageStatus = str19;
            this.lastOutboundMessageWasBroadcast = bool3;
            this.chanelHasOnlyBroadcast = bool4;
            this.salesmaxAccountId = str20;
            this.channelProfilePic = str21;
            this.createdAt = dateTime6;
            this.updatedAt = dateTime7;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public /* bridge */ /* synthetic */ BuildStep tags(List list) {
            return tags((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str12, Contact contact, String str13, String str14, String str15, String str16, ContactAssignmentStatus contactAssignmentStatus, String str17, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Boolean bool2, String str18, String str19, Boolean bool3, Boolean bool4, String str20, String str21, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7) {
            super(str, str2, str3, str4, str5, list, str6, str7, str8, bool, str9, str10, str11, dateTime, dateTime2, str12, contact, str13, str14, str15, str16, contactAssignmentStatus, str17, dateTime3, dateTime4, dateTime5, bool2, str18, str19, bool3, bool4, str20, str21, dateTime6, dateTime7);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder chanelHasOnlyBroadcast(Boolean bool) {
            return (CopyOfBuilder) super.chanelHasOnlyBroadcast(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder channelName(String str) {
            return (CopyOfBuilder) super.channelName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder channelOpenUntil(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.channelOpenUntil(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder channelProfilePic(String str) {
            return (CopyOfBuilder) super.channelProfilePic(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder channelStatus(String str) {
            return (CopyOfBuilder) super.channelStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder channelSubType(String str) {
            return (CopyOfBuilder) super.channelSubType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder channelType(String str) {
            return (CopyOfBuilder) super.channelType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder channelWillBeChargedNext(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.channelWillBeChargedNext(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder externalParticipantsAllowed(Boolean bool) {
            return (CopyOfBuilder) super.externalParticipantsAllowed(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder isLastMessageByLead(Boolean bool) {
            return (CopyOfBuilder) super.isLastMessageByLead(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder lastMessageByLeadTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastMessageByLeadTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder lastMessageByUserTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastMessageByUserTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder lastOutboundMessageId(String str) {
            return (CopyOfBuilder) super.lastOutboundMessageId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder lastOutboundMessageStatus(String str) {
            return (CopyOfBuilder) super.lastOutboundMessageStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder lastOutboundMessageWasBroadcast(Boolean bool) {
            return (CopyOfBuilder) super.lastOutboundMessageWasBroadcast(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder messagePlatform(String str) {
            return (CopyOfBuilder) super.messagePlatform(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder participantScopeIfInternal(String str) {
            return (CopyOfBuilder) super.participantScopeIfInternal(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder phoneNumberIdExternal(String str) {
            return (CopyOfBuilder) super.phoneNumberIdExternal(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder readNotifiedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.readNotifiedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder recipientExternalId(String str) {
            return (CopyOfBuilder) super.recipientExternalId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder recipientExternalIdType(String str) {
            return (CopyOfBuilder) super.recipientExternalIdType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder recipientType(String str) {
            return (CopyOfBuilder) super.recipientType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder salesmaxAccountId(String str) {
            return (CopyOfBuilder) super.salesmaxAccountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder tags(List<String> list) {
            return (CopyOfBuilder) super.tags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            return (CopyOfBuilder) super.toBeAssigned(contactAssignmentStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder userIdsForDirectChannel(String str) {
            return (CopyOfBuilder) super.userIdsForDirectChannel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatChannel.Builder, com.amplifyframework.datastore.generated.model.ChatChannel.BuildStep
        public CopyOfBuilder visitorId(String str) {
            return (CopyOfBuilder) super.visitorId(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ChatChannel justId(String str) {
        return new ChatChannel(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.phoneNumberIdExternal, this.channelName, this.messagePlatform, this.tags, this.recipientType, this.channelType, this.channelSubType, this.externalParticipantsAllowed, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.visitorId, this.contact, this.recipientExternalId, this.recipientExternalIdType, this.ownerId, this.primaryTeamId, this.toBeAssigned, this.createdById, this.readNotifiedAt, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.lastOutboundMessageWasBroadcast, this.chanelHasOnlyBroadcast, this.salesmaxAccountId, this.channelProfilePic, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChatChannel.class != obj.getClass()) {
            return false;
        }
        ChatChannel chatChannel = (ChatChannel) obj;
        return s6c.m47909a(getId(), chatChannel.getId()) && s6c.m47909a(getAccountId(), chatChannel.getAccountId()) && s6c.m47909a(getPhoneNumberIdExternal(), chatChannel.getPhoneNumberIdExternal()) && s6c.m47909a(getChannelName(), chatChannel.getChannelName()) && s6c.m47909a(getMessagePlatform(), chatChannel.getMessagePlatform()) && s6c.m47909a(getTags(), chatChannel.getTags()) && s6c.m47909a(getRecipientType(), chatChannel.getRecipientType()) && s6c.m47909a(getChannelType(), chatChannel.getChannelType()) && s6c.m47909a(getChannelSubType(), chatChannel.getChannelSubType()) && s6c.m47909a(getExternalParticipantsAllowed(), chatChannel.getExternalParticipantsAllowed()) && s6c.m47909a(getParticipantScopeIfInternal(), chatChannel.getParticipantScopeIfInternal()) && s6c.m47909a(getUserIdsForDirectChannel(), chatChannel.getUserIdsForDirectChannel()) && s6c.m47909a(getChannelStatus(), chatChannel.getChannelStatus()) && s6c.m47909a(getChannelWillBeChargedNext(), chatChannel.getChannelWillBeChargedNext()) && s6c.m47909a(getChannelOpenUntil(), chatChannel.getChannelOpenUntil()) && s6c.m47909a(getVisitorId(), chatChannel.getVisitorId()) && s6c.m47909a(getContact(), chatChannel.getContact()) && s6c.m47909a(getRecipientExternalId(), chatChannel.getRecipientExternalId()) && s6c.m47909a(getRecipientExternalIdType(), chatChannel.getRecipientExternalIdType()) && s6c.m47909a(getOwnerId(), chatChannel.getOwnerId()) && s6c.m47909a(getPrimaryTeamId(), chatChannel.getPrimaryTeamId()) && s6c.m47909a(getToBeAssigned(), chatChannel.getToBeAssigned()) && s6c.m47909a(getCreatedById(), chatChannel.getCreatedById()) && s6c.m47909a(getReadNotifiedAt(), chatChannel.getReadNotifiedAt()) && s6c.m47909a(getLastMessageByLeadTime(), chatChannel.getLastMessageByLeadTime()) && s6c.m47909a(getLastMessageByUserTime(), chatChannel.getLastMessageByUserTime()) && s6c.m47909a(getIsLastMessageByLead(), chatChannel.getIsLastMessageByLead()) && s6c.m47909a(getLastOutboundMessageId(), chatChannel.getLastOutboundMessageId()) && s6c.m47909a(getLastOutboundMessageStatus(), chatChannel.getLastOutboundMessageStatus()) && s6c.m47909a(getLastOutboundMessageWasBroadcast(), chatChannel.getLastOutboundMessageWasBroadcast()) && s6c.m47909a(getChanelHasOnlyBroadcast(), chatChannel.getChanelHasOnlyBroadcast()) && s6c.m47909a(getSalesmaxAccountId(), chatChannel.getSalesmaxAccountId()) && s6c.m47909a(getChannelProfilePic(), chatChannel.getChannelProfilePic()) && s6c.m47909a(getCreatedAt(), chatChannel.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), chatChannel.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Boolean getChanelHasOnlyBroadcast() {
        return this.chanelHasOnlyBroadcast;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public Temporal.DateTime getChannelOpenUntil() {
        return this.channelOpenUntil;
    }

    public String getChannelProfilePic() {
        return this.channelProfilePic;
    }

    public String getChannelStatus() {
        return this.channelStatus;
    }

    public String getChannelSubType() {
        return this.channelSubType;
    }

    public String getChannelType() {
        return this.channelType;
    }

    public Temporal.DateTime getChannelWillBeChargedNext() {
        return this.channelWillBeChargedNext;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public Boolean getExternalParticipantsAllowed() {
        return this.externalParticipantsAllowed;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsLastMessageByLead() {
        return this.isLastMessageByLead;
    }

    public Temporal.DateTime getLastMessageByLeadTime() {
        return this.lastMessageByLeadTime;
    }

    public Temporal.DateTime getLastMessageByUserTime() {
        return this.lastMessageByUserTime;
    }

    public String getLastOutboundMessageId() {
        return this.lastOutboundMessageId;
    }

    public String getLastOutboundMessageStatus() {
        return this.lastOutboundMessageStatus;
    }

    public Boolean getLastOutboundMessageWasBroadcast() {
        return this.lastOutboundMessageWasBroadcast;
    }

    public String getMessagePlatform() {
        return this.messagePlatform;
    }

    public List<ChatMessage> getMessages() {
        return this.messages;
    }

    public User getOwner() {
        return this.owner;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getParticipantScopeIfInternal() {
        return this.participantScopeIfInternal;
    }

    public List<ChatParticipant> getParticipants() {
        return this.participants;
    }

    public String getPhoneNumberIdExternal() {
        return this.phoneNumberIdExternal;
    }

    public String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public Temporal.DateTime getReadNotifiedAt() {
        return this.readNotifiedAt;
    }

    public String getRecipientExternalId() {
        return this.recipientExternalId;
    }

    public String getRecipientExternalIdType() {
        return this.recipientExternalIdType;
    }

    public String getRecipientType() {
        return this.recipientType;
    }

    public String getSalesmaxAccountId() {
        return this.salesmaxAccountId;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public ContactAssignmentStatus getToBeAssigned() {
        return this.toBeAssigned;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUserIdsForDirectChannel() {
        return this.userIdsForDirectChannel;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getPhoneNumberIdExternal() + getChannelName() + getMessagePlatform() + getTags() + getRecipientType() + getChannelType() + getChannelSubType() + getExternalParticipantsAllowed() + getParticipantScopeIfInternal() + getUserIdsForDirectChannel() + getChannelStatus() + getChannelWillBeChargedNext() + getChannelOpenUntil() + getVisitorId() + getContact() + getRecipientExternalId() + getRecipientExternalIdType() + getOwnerId() + getPrimaryTeamId() + getToBeAssigned() + getCreatedById() + getReadNotifiedAt() + getLastMessageByLeadTime() + getLastMessageByUserTime() + getIsLastMessageByLead() + getLastOutboundMessageId() + getLastOutboundMessageStatus() + getLastOutboundMessageWasBroadcast() + getChanelHasOnlyBroadcast() + getSalesmaxAccountId() + getChannelProfilePic() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatChannel {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("phoneNumberIdExternal=" + String.valueOf(getPhoneNumberIdExternal()) + ", ");
        sb.append("channelName=" + String.valueOf(getChannelName()) + ", ");
        sb.append("messagePlatform=" + String.valueOf(getMessagePlatform()) + ", ");
        sb.append("tags=" + String.valueOf(getTags()) + ", ");
        sb.append("recipientType=" + String.valueOf(getRecipientType()) + ", ");
        sb.append("channelType=" + String.valueOf(getChannelType()) + ", ");
        sb.append("channelSubType=" + String.valueOf(getChannelSubType()) + ", ");
        sb.append("externalParticipantsAllowed=" + String.valueOf(getExternalParticipantsAllowed()) + ", ");
        sb.append("participantScopeIfInternal=" + String.valueOf(getParticipantScopeIfInternal()) + ", ");
        sb.append("userIdsForDirectChannel=" + String.valueOf(getUserIdsForDirectChannel()) + ", ");
        sb.append("channelStatus=" + String.valueOf(getChannelStatus()) + ", ");
        sb.append("channelWillBeChargedNext=" + String.valueOf(getChannelWillBeChargedNext()) + ", ");
        sb.append("channelOpenUntil=" + String.valueOf(getChannelOpenUntil()) + ", ");
        sb.append("visitorId=" + String.valueOf(getVisitorId()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("recipientExternalId=" + String.valueOf(getRecipientExternalId()) + ", ");
        sb.append("recipientExternalIdType=" + String.valueOf(getRecipientExternalIdType()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("toBeAssigned=" + String.valueOf(getToBeAssigned()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("readNotifiedAt=" + String.valueOf(getReadNotifiedAt()) + ", ");
        sb.append("lastMessageByLeadTime=" + String.valueOf(getLastMessageByLeadTime()) + ", ");
        sb.append("lastMessageByUserTime=" + String.valueOf(getLastMessageByUserTime()) + ", ");
        sb.append("isLastMessageByLead=" + String.valueOf(getIsLastMessageByLead()) + ", ");
        sb.append("lastOutboundMessageId=" + String.valueOf(getLastOutboundMessageId()) + ", ");
        sb.append("lastOutboundMessageStatus=" + String.valueOf(getLastOutboundMessageStatus()) + ", ");
        sb.append("lastOutboundMessageWasBroadcast=" + String.valueOf(getLastOutboundMessageWasBroadcast()) + ", ");
        sb.append("chanelHasOnlyBroadcast=" + String.valueOf(getChanelHasOnlyBroadcast()) + ", ");
        sb.append("salesmaxAccountId=" + String.valueOf(getSalesmaxAccountId()) + ", ");
        sb.append("channelProfilePic=" + String.valueOf(getChannelProfilePic()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ChatChannel(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str12, Contact contact, String str13, String str14, String str15, String str16, ContactAssignmentStatus contactAssignmentStatus, String str17, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Boolean bool2, String str18, String str19, Boolean bool3, Boolean bool4, String str20, String str21, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7) {
        this.messages = null;
        this.owner = null;
        this.participants = null;
        this.id = str;
        this.accountId = str2;
        this.phoneNumberIdExternal = str3;
        this.channelName = str4;
        this.messagePlatform = str5;
        this.tags = list;
        this.recipientType = str6;
        this.channelType = str7;
        this.channelSubType = str8;
        this.externalParticipantsAllowed = bool;
        this.participantScopeIfInternal = str9;
        this.userIdsForDirectChannel = str10;
        this.channelStatus = str11;
        this.channelWillBeChargedNext = dateTime;
        this.channelOpenUntil = dateTime2;
        this.visitorId = str12;
        this.contact = contact;
        this.recipientExternalId = str13;
        this.recipientExternalIdType = str14;
        this.ownerId = str15;
        this.primaryTeamId = str16;
        this.toBeAssigned = contactAssignmentStatus;
        this.createdById = str17;
        this.readNotifiedAt = dateTime3;
        this.lastMessageByLeadTime = dateTime4;
        this.lastMessageByUserTime = dateTime5;
        this.isLastMessageByLead = bool2;
        this.lastOutboundMessageId = str18;
        this.lastOutboundMessageStatus = str19;
        this.lastOutboundMessageWasBroadcast = bool3;
        this.chanelHasOnlyBroadcast = bool4;
        this.salesmaxAccountId = str20;
        this.channelProfilePic = str21;
        this.createdAt = dateTime6;
        this.updatedAt = dateTime7;
    }
}
