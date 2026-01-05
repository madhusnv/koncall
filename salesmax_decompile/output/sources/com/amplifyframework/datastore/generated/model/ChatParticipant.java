package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
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

@Indexes({@Index(fields = {"accountId", "participantId", "updatedAt"}, name = "channelByParticipant"), @Index(fields = {"channelId", "updatedAt"}, name = "participantsByChannel"), @Index(fields = {"channelId", "participantId"}, name = "participantInAChannel")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "ChatParticipants")
/* loaded from: classes5.dex */
public final class ChatParticipant implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @BelongsTo(targetName = "channelId", type = ChatChannel.class)
    @ModelField(targetType = "ChatChannel")
    private final ChatChannel channel;

    @ModelField(targetType = "String")
    private final String channelName;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime channelOpenUntil;

    @ModelField(targetType = "String")
    private final String channelStatus;

    @ModelField(targetType = "String")
    private final String channelSubType;

    @ModelField(targetType = "String")
    private final String channelType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime channelWillBeChargedNext;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isLastMessageByLead;

    @ModelField(targetType = "Boolean")
    private final Boolean isNewMessageUpdate;

    @ModelField(targetType = "Boolean")
    private final Boolean isStarred;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime joinedAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastMessageByLeadTime;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastMessageByUserTime;

    @ModelField(targetType = "ID")
    private final String lastOutboundMessageId;

    @ModelField(targetType = "String")
    private final String lastOutboundMessageStatus;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastViewed;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime leftAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User participant;

    @ModelField(isRequired = true, targetType = "ID")
    private final String participantId;

    @ModelField(targetType = "String")
    private final String participantScopeIfInternal;

    @ModelField(isRequired = true, targetType = "String")
    private final String participationStatus;

    @ModelField(targetType = "String")
    private final String phoneNumberIdExternal;

    @ModelField(targetType = "String")
    private final List<String> tags;

    @ModelField(targetType = "Int")
    private final Integer unreadMessageCount;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "String")
    private final String userIdsForDirectChannel;
    public static final QueryField ID = QueryField.field("ChatParticipant", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ChatParticipant", "accountId");
    public static final QueryField PHONE_NUMBER_ID_EXTERNAL = QueryField.field("ChatParticipant", "phoneNumberIdExternal");
    public static final QueryField CHANNEL = QueryField.field("ChatParticipant", "channelId");
    public static final QueryField PARTICIPANT_ID = QueryField.field("ChatParticipant", "participantId");
    public static final QueryField PARTICIPATION_STATUS = QueryField.field("ChatParticipant", "participationStatus");
    public static final QueryField UNREAD_MESSAGE_COUNT = QueryField.field("ChatParticipant", "unreadMessageCount");
    public static final QueryField LAST_VIEWED = QueryField.field("ChatParticipant", "lastViewed");
    public static final QueryField IS_STARRED = QueryField.field("ChatParticipant", "isStarred");
    public static final QueryField JOINED_AT = QueryField.field("ChatParticipant", "joinedAt");
    public static final QueryField LEFT_AT = QueryField.field("ChatParticipant", "leftAt");
    public static final QueryField CHANNEL_NAME = QueryField.field("ChatParticipant", "channelName");
    public static final QueryField CHANNEL_TYPE = QueryField.field("ChatParticipant", "channelType");
    public static final QueryField CHANNEL_SUB_TYPE = QueryField.field("ChatParticipant", "channelSubType");
    public static final QueryField CHANNEL_STATUS = QueryField.field("ChatParticipant", "channelStatus");
    public static final QueryField CHANNEL_WILL_BE_CHARGED_NEXT = QueryField.field("ChatParticipant", "channelWillBeChargedNext");
    public static final QueryField CHANNEL_OPEN_UNTIL = QueryField.field("ChatParticipant", "channelOpenUntil");
    public static final QueryField LAST_MESSAGE_BY_LEAD_TIME = QueryField.field("ChatParticipant", "lastMessageByLeadTime");
    public static final QueryField LAST_MESSAGE_BY_USER_TIME = QueryField.field("ChatParticipant", "lastMessageByUserTime");
    public static final QueryField IS_LAST_MESSAGE_BY_LEAD = QueryField.field("ChatParticipant", "isLastMessageByLead");
    public static final QueryField LAST_OUTBOUND_MESSAGE_ID = QueryField.field("ChatParticipant", "lastOutboundMessageId");
    public static final QueryField LAST_OUTBOUND_MESSAGE_STATUS = QueryField.field("ChatParticipant", "lastOutboundMessageStatus");
    public static final QueryField IS_NEW_MESSAGE_UPDATE = QueryField.field("ChatParticipant", "isNewMessageUpdate");
    public static final QueryField TAGS = QueryField.field("ChatParticipant", "tags");
    public static final QueryField PARTICIPANT_SCOPE_IF_INTERNAL = QueryField.field("ChatParticipant", "participantScopeIfInternal");
    public static final QueryField USER_IDS_FOR_DIRECT_CHANNEL = QueryField.field("ChatParticipant", "userIdsForDirectChannel");
    public static final QueryField CREATED_AT = QueryField.field("ChatParticipant", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ChatParticipant", "updatedAt");

    public interface AccountIdStep {
        ParticipantIdStep accountId(String str);
    }

    public interface BuildStep {
        ChatParticipant build();

        BuildStep channel(ChatChannel chatChannel);

        BuildStep channelName(String str);

        BuildStep channelOpenUntil(Temporal.DateTime dateTime);

        BuildStep channelStatus(String str);

        BuildStep channelSubType(String str);

        BuildStep channelType(String str);

        BuildStep channelWillBeChargedNext(Temporal.DateTime dateTime);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep isLastMessageByLead(Boolean bool);

        BuildStep isNewMessageUpdate(Boolean bool);

        BuildStep isStarred(Boolean bool);

        BuildStep joinedAt(Temporal.DateTime dateTime);

        BuildStep lastMessageByLeadTime(Temporal.DateTime dateTime);

        BuildStep lastMessageByUserTime(Temporal.DateTime dateTime);

        BuildStep lastOutboundMessageId(String str);

        BuildStep lastOutboundMessageStatus(String str);

        BuildStep lastViewed(Temporal.DateTime dateTime);

        BuildStep leftAt(Temporal.DateTime dateTime);

        BuildStep participantScopeIfInternal(String str);

        BuildStep phoneNumberIdExternal(String str);

        BuildStep tags(List<String> list);

        BuildStep unreadMessageCount(Integer num);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep userIdsForDirectChannel(String str);
    }

    public static class Builder implements AccountIdStep, ParticipantIdStep, ParticipationStatusStep, BuildStep {
        private String accountId;
        private ChatChannel channel;
        private String channelName;
        private Temporal.DateTime channelOpenUntil;
        private String channelStatus;
        private String channelSubType;
        private String channelType;
        private Temporal.DateTime channelWillBeChargedNext;
        private Temporal.DateTime createdAt;
        private String id;
        private Boolean isLastMessageByLead;
        private Boolean isNewMessageUpdate;
        private Boolean isStarred;
        private Temporal.DateTime joinedAt;
        private Temporal.DateTime lastMessageByLeadTime;
        private Temporal.DateTime lastMessageByUserTime;
        private String lastOutboundMessageId;
        private String lastOutboundMessageStatus;
        private Temporal.DateTime lastViewed;
        private Temporal.DateTime leftAt;
        private String participantId;
        private String participantScopeIfInternal;
        private String participationStatus;
        private String phoneNumberIdExternal;
        private List<String> tags;
        private Integer unreadMessageCount;
        private Temporal.DateTime updatedAt;
        private String userIdsForDirectChannel;

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.AccountIdStep
        public ParticipantIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public ChatParticipant build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ChatParticipant(string, this.accountId, this.phoneNumberIdExternal, this.channel, this.participantId, this.participationStatus, this.unreadMessageCount, this.lastViewed, this.isStarred, this.joinedAt, this.leftAt, this.channelName, this.channelType, this.channelSubType, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.isNewMessageUpdate, this.tags, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep channel(ChatChannel chatChannel) {
            this.channel = chatChannel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep channelName(String str) {
            this.channelName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep channelOpenUntil(Temporal.DateTime dateTime) {
            this.channelOpenUntil = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep channelStatus(String str) {
            this.channelStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep channelSubType(String str) {
            this.channelSubType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep channelType(String str) {
            this.channelType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep channelWillBeChargedNext(Temporal.DateTime dateTime) {
            this.channelWillBeChargedNext = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep isLastMessageByLead(Boolean bool) {
            this.isLastMessageByLead = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep isNewMessageUpdate(Boolean bool) {
            this.isNewMessageUpdate = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep isStarred(Boolean bool) {
            this.isStarred = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep joinedAt(Temporal.DateTime dateTime) {
            this.joinedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep lastMessageByLeadTime(Temporal.DateTime dateTime) {
            this.lastMessageByLeadTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep lastMessageByUserTime(Temporal.DateTime dateTime) {
            this.lastMessageByUserTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep lastOutboundMessageId(String str) {
            this.lastOutboundMessageId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep lastOutboundMessageStatus(String str) {
            this.lastOutboundMessageStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep lastViewed(Temporal.DateTime dateTime) {
            this.lastViewed = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep leftAt(Temporal.DateTime dateTime) {
            this.leftAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.ParticipantIdStep
        public ParticipationStatusStep participantId(String str) {
            Objects.requireNonNull(str);
            this.participantId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep participantScopeIfInternal(String str) {
            this.participantScopeIfInternal = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.ParticipationStatusStep
        public BuildStep participationStatus(String str) {
            Objects.requireNonNull(str);
            this.participationStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep phoneNumberIdExternal(String str) {
            this.phoneNumberIdExternal = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep unreadMessageCount(Integer num) {
            this.unreadMessageCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public BuildStep userIdsForDirectChannel(String str) {
            this.userIdsForDirectChannel = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, ChatChannel chatChannel, String str4, String str5, Integer num, Temporal.DateTime dateTime, Boolean bool, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7, Boolean bool2, String str10, String str11, Boolean bool3, List<String> list, String str12, String str13, Temporal.DateTime dateTime8, Temporal.DateTime dateTime9) {
            this.id = str;
            this.accountId = str2;
            this.phoneNumberIdExternal = str3;
            this.channel = chatChannel;
            this.participantId = str4;
            this.participationStatus = str5;
            this.unreadMessageCount = num;
            this.lastViewed = dateTime;
            this.isStarred = bool;
            this.joinedAt = dateTime2;
            this.leftAt = dateTime3;
            this.channelName = str6;
            this.channelType = str7;
            this.channelSubType = str8;
            this.channelStatus = str9;
            this.channelWillBeChargedNext = dateTime4;
            this.channelOpenUntil = dateTime5;
            this.lastMessageByLeadTime = dateTime6;
            this.lastMessageByUserTime = dateTime7;
            this.isLastMessageByLead = bool2;
            this.lastOutboundMessageId = str10;
            this.lastOutboundMessageStatus = str11;
            this.isNewMessageUpdate = bool3;
            this.tags = list;
            this.participantScopeIfInternal = str12;
            this.userIdsForDirectChannel = str13;
            this.createdAt = dateTime8;
            this.updatedAt = dateTime9;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public /* bridge */ /* synthetic */ BuildStep tags(List list) {
            return tags((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, ChatChannel chatChannel, String str4, String str5, Integer num, Temporal.DateTime dateTime, Boolean bool, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7, Boolean bool2, String str10, String str11, Boolean bool3, List<String> list, String str12, String str13, Temporal.DateTime dateTime8, Temporal.DateTime dateTime9) {
            super(str, str2, str3, chatChannel, str4, str5, num, dateTime, bool, dateTime2, dateTime3, str6, str7, str8, str9, dateTime4, dateTime5, dateTime6, dateTime7, bool2, str10, str11, bool3, list, str12, str13, dateTime8, dateTime9);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(str5);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder channel(ChatChannel chatChannel) {
            return (CopyOfBuilder) super.channel(chatChannel);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder channelName(String str) {
            return (CopyOfBuilder) super.channelName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder channelOpenUntil(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.channelOpenUntil(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder channelStatus(String str) {
            return (CopyOfBuilder) super.channelStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder channelSubType(String str) {
            return (CopyOfBuilder) super.channelSubType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder channelType(String str) {
            return (CopyOfBuilder) super.channelType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder channelWillBeChargedNext(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.channelWillBeChargedNext(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder isLastMessageByLead(Boolean bool) {
            return (CopyOfBuilder) super.isLastMessageByLead(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder isNewMessageUpdate(Boolean bool) {
            return (CopyOfBuilder) super.isNewMessageUpdate(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder isStarred(Boolean bool) {
            return (CopyOfBuilder) super.isStarred(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder joinedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.joinedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder lastMessageByLeadTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastMessageByLeadTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder lastMessageByUserTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastMessageByUserTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder lastOutboundMessageId(String str) {
            return (CopyOfBuilder) super.lastOutboundMessageId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder lastOutboundMessageStatus(String str) {
            return (CopyOfBuilder) super.lastOutboundMessageStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder lastViewed(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastViewed(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder leftAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.leftAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.ParticipantIdStep
        public CopyOfBuilder participantId(String str) {
            return (CopyOfBuilder) super.participantId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder participantScopeIfInternal(String str) {
            return (CopyOfBuilder) super.participantScopeIfInternal(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.ParticipationStatusStep
        public CopyOfBuilder participationStatus(String str) {
            return (CopyOfBuilder) super.participationStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder phoneNumberIdExternal(String str) {
            return (CopyOfBuilder) super.phoneNumberIdExternal(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder tags(List<String> list) {
            return (CopyOfBuilder) super.tags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder unreadMessageCount(Integer num) {
            return (CopyOfBuilder) super.unreadMessageCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatParticipant.Builder, com.amplifyframework.datastore.generated.model.ChatParticipant.BuildStep
        public CopyOfBuilder userIdsForDirectChannel(String str) {
            return (CopyOfBuilder) super.userIdsForDirectChannel(str);
        }
    }

    public interface ParticipantIdStep {
        ParticipationStatusStep participantId(String str);
    }

    public interface ParticipationStatusStep {
        BuildStep participationStatus(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ChatParticipant justId(String str) {
        return new ChatParticipant(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.phoneNumberIdExternal, this.channel, this.participantId, this.participationStatus, this.unreadMessageCount, this.lastViewed, this.isStarred, this.joinedAt, this.leftAt, this.channelName, this.channelType, this.channelSubType, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.isNewMessageUpdate, this.tags, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChatParticipant.class != obj.getClass()) {
            return false;
        }
        ChatParticipant chatParticipant = (ChatParticipant) obj;
        return s6c.m47909a(getId(), chatParticipant.getId()) && s6c.m47909a(getAccountId(), chatParticipant.getAccountId()) && s6c.m47909a(getPhoneNumberIdExternal(), chatParticipant.getPhoneNumberIdExternal()) && s6c.m47909a(getChannel(), chatParticipant.getChannel()) && s6c.m47909a(getParticipantId(), chatParticipant.getParticipantId()) && s6c.m47909a(getParticipationStatus(), chatParticipant.getParticipationStatus()) && s6c.m47909a(getUnreadMessageCount(), chatParticipant.getUnreadMessageCount()) && s6c.m47909a(getLastViewed(), chatParticipant.getLastViewed()) && s6c.m47909a(getIsStarred(), chatParticipant.getIsStarred()) && s6c.m47909a(getJoinedAt(), chatParticipant.getJoinedAt()) && s6c.m47909a(getLeftAt(), chatParticipant.getLeftAt()) && s6c.m47909a(getChannelName(), chatParticipant.getChannelName()) && s6c.m47909a(getChannelType(), chatParticipant.getChannelType()) && s6c.m47909a(getChannelSubType(), chatParticipant.getChannelSubType()) && s6c.m47909a(getChannelStatus(), chatParticipant.getChannelStatus()) && s6c.m47909a(getChannelWillBeChargedNext(), chatParticipant.getChannelWillBeChargedNext()) && s6c.m47909a(getChannelOpenUntil(), chatParticipant.getChannelOpenUntil()) && s6c.m47909a(getLastMessageByLeadTime(), chatParticipant.getLastMessageByLeadTime()) && s6c.m47909a(getLastMessageByUserTime(), chatParticipant.getLastMessageByUserTime()) && s6c.m47909a(getIsLastMessageByLead(), chatParticipant.getIsLastMessageByLead()) && s6c.m47909a(getLastOutboundMessageId(), chatParticipant.getLastOutboundMessageId()) && s6c.m47909a(getLastOutboundMessageStatus(), chatParticipant.getLastOutboundMessageStatus()) && s6c.m47909a(getIsNewMessageUpdate(), chatParticipant.getIsNewMessageUpdate()) && s6c.m47909a(getTags(), chatParticipant.getTags()) && s6c.m47909a(getParticipantScopeIfInternal(), chatParticipant.getParticipantScopeIfInternal()) && s6c.m47909a(getUserIdsForDirectChannel(), chatParticipant.getUserIdsForDirectChannel()) && s6c.m47909a(getCreatedAt(), chatParticipant.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), chatParticipant.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ChatChannel getChannel() {
        return this.channel;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public Temporal.DateTime getChannelOpenUntil() {
        return this.channelOpenUntil;
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

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsLastMessageByLead() {
        return this.isLastMessageByLead;
    }

    public Boolean getIsNewMessageUpdate() {
        return this.isNewMessageUpdate;
    }

    public Boolean getIsStarred() {
        return this.isStarred;
    }

    public Temporal.DateTime getJoinedAt() {
        return this.joinedAt;
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

    public Temporal.DateTime getLastViewed() {
        return this.lastViewed;
    }

    public Temporal.DateTime getLeftAt() {
        return this.leftAt;
    }

    public User getParticipant() {
        return this.participant;
    }

    public String getParticipantId() {
        return this.participantId;
    }

    public String getParticipantScopeIfInternal() {
        return this.participantScopeIfInternal;
    }

    public String getParticipationStatus() {
        return this.participationStatus;
    }

    public String getPhoneNumberIdExternal() {
        return this.phoneNumberIdExternal;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public Integer getUnreadMessageCount() {
        return this.unreadMessageCount;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUserIdsForDirectChannel() {
        return this.userIdsForDirectChannel;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getPhoneNumberIdExternal() + getChannel() + getParticipantId() + getParticipationStatus() + getUnreadMessageCount() + getLastViewed() + getIsStarred() + getJoinedAt() + getLeftAt() + getChannelName() + getChannelType() + getChannelSubType() + getChannelStatus() + getChannelWillBeChargedNext() + getChannelOpenUntil() + getLastMessageByLeadTime() + getLastMessageByUserTime() + getIsLastMessageByLead() + getLastOutboundMessageId() + getLastOutboundMessageStatus() + getIsNewMessageUpdate() + getTags() + getParticipantScopeIfInternal() + getUserIdsForDirectChannel() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatParticipant {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("phoneNumberIdExternal=" + String.valueOf(getPhoneNumberIdExternal()) + ", ");
        sb.append("channel=" + String.valueOf(getChannel()) + ", ");
        sb.append("participantId=" + String.valueOf(getParticipantId()) + ", ");
        sb.append("participationStatus=" + String.valueOf(getParticipationStatus()) + ", ");
        sb.append("unreadMessageCount=" + String.valueOf(getUnreadMessageCount()) + ", ");
        sb.append("lastViewed=" + String.valueOf(getLastViewed()) + ", ");
        sb.append("isStarred=" + String.valueOf(getIsStarred()) + ", ");
        sb.append("joinedAt=" + String.valueOf(getJoinedAt()) + ", ");
        sb.append("leftAt=" + String.valueOf(getLeftAt()) + ", ");
        sb.append("channelName=" + String.valueOf(getChannelName()) + ", ");
        sb.append("channelType=" + String.valueOf(getChannelType()) + ", ");
        sb.append("channelSubType=" + String.valueOf(getChannelSubType()) + ", ");
        sb.append("channelStatus=" + String.valueOf(getChannelStatus()) + ", ");
        sb.append("channelWillBeChargedNext=" + String.valueOf(getChannelWillBeChargedNext()) + ", ");
        sb.append("channelOpenUntil=" + String.valueOf(getChannelOpenUntil()) + ", ");
        sb.append("lastMessageByLeadTime=" + String.valueOf(getLastMessageByLeadTime()) + ", ");
        sb.append("lastMessageByUserTime=" + String.valueOf(getLastMessageByUserTime()) + ", ");
        sb.append("isLastMessageByLead=" + String.valueOf(getIsLastMessageByLead()) + ", ");
        sb.append("lastOutboundMessageId=" + String.valueOf(getLastOutboundMessageId()) + ", ");
        sb.append("lastOutboundMessageStatus=" + String.valueOf(getLastOutboundMessageStatus()) + ", ");
        sb.append("isNewMessageUpdate=" + String.valueOf(getIsNewMessageUpdate()) + ", ");
        sb.append("tags=" + String.valueOf(getTags()) + ", ");
        sb.append("participantScopeIfInternal=" + String.valueOf(getParticipantScopeIfInternal()) + ", ");
        sb.append("userIdsForDirectChannel=" + String.valueOf(getUserIdsForDirectChannel()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ChatParticipant(String str, String str2, String str3, ChatChannel chatChannel, String str4, String str5, Integer num, Temporal.DateTime dateTime, Boolean bool, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7, Boolean bool2, String str10, String str11, Boolean bool3, List<String> list, String str12, String str13, Temporal.DateTime dateTime8, Temporal.DateTime dateTime9) {
        this.participant = null;
        this.id = str;
        this.accountId = str2;
        this.phoneNumberIdExternal = str3;
        this.channel = chatChannel;
        this.participantId = str4;
        this.participationStatus = str5;
        this.unreadMessageCount = num;
        this.lastViewed = dateTime;
        this.isStarred = bool;
        this.joinedAt = dateTime2;
        this.leftAt = dateTime3;
        this.channelName = str6;
        this.channelType = str7;
        this.channelSubType = str8;
        this.channelStatus = str9;
        this.channelWillBeChargedNext = dateTime4;
        this.channelOpenUntil = dateTime5;
        this.lastMessageByLeadTime = dateTime6;
        this.lastMessageByUserTime = dateTime7;
        this.isLastMessageByLead = bool2;
        this.lastOutboundMessageId = str10;
        this.lastOutboundMessageStatus = str11;
        this.isNewMessageUpdate = bool3;
        this.tags = list;
        this.participantScopeIfInternal = str12;
        this.userIdsForDirectChannel = str13;
        this.createdAt = dateTime8;
        this.updatedAt = dateTime9;
    }
}
