package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "ChatMentions")
/* loaded from: classes5.dex */
public final class ChatMentions implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @BelongsTo(targetName = "channelId", type = ChatChannel.class)
    @ModelField(targetType = "ChatChannel")
    private final ChatChannel channel;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSTimestamp")
    private final Temporal.Timestamp expirationUnixTime;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "ID")
    private final String mentionedById;

    @ModelField(targetType = "ChatMessage")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = ChatMessage.class)
    private final ChatMessage mentionedMessage;

    @ModelField(isRequired = true, targetType = "ID")
    private final String mentionedMessageId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String mentionedUserId;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("ChatMentions", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ChatMentions", "accountId");
    public static final QueryField MENTIONED_USER_ID = QueryField.field("ChatMentions", "mentionedUserId");
    public static final QueryField MENTIONED_MESSAGE_ID = QueryField.field("ChatMentions", "mentionedMessageId");
    public static final QueryField CHANNEL = QueryField.field("ChatMentions", "channelId");
    public static final QueryField MENTIONED_BY_ID = QueryField.field("ChatMentions", "mentionedById");
    public static final QueryField STATUS = QueryField.field("ChatMentions", "status");
    public static final QueryField EXPIRATION_UNIX_TIME = QueryField.field("ChatMentions", "expirationUnixTime");
    public static final QueryField CREATED_AT = QueryField.field("ChatMentions", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ChatMentions", "updatedAt");

    public interface AccountIdStep {
        MentionedUserIdStep accountId(String str);
    }

    public interface BuildStep {
        ChatMentions build();

        BuildStep channel(ChatChannel chatChannel);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep expirationUnixTime(Temporal.Timestamp timestamp);

        BuildStep id(String str);

        BuildStep mentionedById(String str);

        BuildStep status(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, MentionedUserIdStep, MentionedMessageIdStep, BuildStep {
        private String accountId;
        private ChatChannel channel;
        private Temporal.DateTime createdAt;
        private Temporal.Timestamp expirationUnixTime;
        private String id;
        private String mentionedById;
        private String mentionedMessageId;
        private String mentionedUserId;
        private String status;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.AccountIdStep
        public MentionedUserIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public ChatMentions build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ChatMentions(string, this.accountId, this.mentionedUserId, this.mentionedMessageId, this.channel, this.mentionedById, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public BuildStep channel(ChatChannel chatChannel) {
            this.channel = chatChannel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public BuildStep expirationUnixTime(Temporal.Timestamp timestamp) {
            this.expirationUnixTime = timestamp;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public BuildStep mentionedById(String str) {
            this.mentionedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.MentionedMessageIdStep
        public BuildStep mentionedMessageId(String str) {
            Objects.requireNonNull(str);
            this.mentionedMessageId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.MentionedUserIdStep
        public MentionedMessageIdStep mentionedUserId(String str) {
            Objects.requireNonNull(str);
            this.mentionedUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, ChatChannel chatChannel, String str5, String str6, Temporal.Timestamp timestamp, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.mentionedUserId = str3;
            this.mentionedMessageId = str4;
            this.channel = chatChannel;
            this.mentionedById = str5;
            this.status = str6;
            this.expirationUnixTime = timestamp;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, ChatChannel chatChannel, String str5, String str6, Temporal.Timestamp timestamp, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, chatChannel, str5, str6, timestamp, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.Builder, com.amplifyframework.datastore.generated.model.ChatMentions.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.Builder, com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public CopyOfBuilder channel(ChatChannel chatChannel) {
            return (CopyOfBuilder) super.channel(chatChannel);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.Builder, com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.Builder, com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public CopyOfBuilder expirationUnixTime(Temporal.Timestamp timestamp) {
            return (CopyOfBuilder) super.expirationUnixTime(timestamp);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.Builder, com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public CopyOfBuilder mentionedById(String str) {
            return (CopyOfBuilder) super.mentionedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.Builder, com.amplifyframework.datastore.generated.model.ChatMentions.MentionedMessageIdStep
        public CopyOfBuilder mentionedMessageId(String str) {
            return (CopyOfBuilder) super.mentionedMessageId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.Builder, com.amplifyframework.datastore.generated.model.ChatMentions.MentionedUserIdStep
        public CopyOfBuilder mentionedUserId(String str) {
            return (CopyOfBuilder) super.mentionedUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.Builder, com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMentions.Builder, com.amplifyframework.datastore.generated.model.ChatMentions.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface MentionedMessageIdStep {
        BuildStep mentionedMessageId(String str);
    }

    public interface MentionedUserIdStep {
        MentionedMessageIdStep mentionedUserId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ChatMentions justId(String str) {
        return new ChatMentions(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.mentionedUserId, this.mentionedMessageId, this.channel, this.mentionedById, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChatMentions.class != obj.getClass()) {
            return false;
        }
        ChatMentions chatMentions = (ChatMentions) obj;
        return s6c.m47909a(getId(), chatMentions.getId()) && s6c.m47909a(getAccountId(), chatMentions.getAccountId()) && s6c.m47909a(getMentionedUserId(), chatMentions.getMentionedUserId()) && s6c.m47909a(getMentionedMessageId(), chatMentions.getMentionedMessageId()) && s6c.m47909a(getChannel(), chatMentions.getChannel()) && s6c.m47909a(getMentionedById(), chatMentions.getMentionedById()) && s6c.m47909a(getStatus(), chatMentions.getStatus()) && s6c.m47909a(getExpirationUnixTime(), chatMentions.getExpirationUnixTime()) && s6c.m47909a(getCreatedAt(), chatMentions.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), chatMentions.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ChatChannel getChannel() {
        return this.channel;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Temporal.Timestamp getExpirationUnixTime() {
        return this.expirationUnixTime;
    }

    public String getId() {
        return this.id;
    }

    public String getMentionedById() {
        return this.mentionedById;
    }

    public ChatMessage getMentionedMessage() {
        return this.mentionedMessage;
    }

    public String getMentionedMessageId() {
        return this.mentionedMessageId;
    }

    public String getMentionedUserId() {
        return this.mentionedUserId;
    }

    public String getStatus() {
        return this.status;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getMentionedUserId() + getMentionedMessageId() + getChannel() + getMentionedById() + getStatus() + getExpirationUnixTime() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatMentions {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("mentionedUserId=" + String.valueOf(getMentionedUserId()) + ", ");
        sb.append("mentionedMessageId=" + String.valueOf(getMentionedMessageId()) + ", ");
        sb.append("channel=" + String.valueOf(getChannel()) + ", ");
        sb.append("mentionedById=" + String.valueOf(getMentionedById()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("expirationUnixTime=" + String.valueOf(getExpirationUnixTime()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ChatMentions(String str, String str2, String str3, String str4, ChatChannel chatChannel, String str5, String str6, Temporal.Timestamp timestamp, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.mentionedMessage = null;
        this.id = str;
        this.accountId = str2;
        this.mentionedUserId = str3;
        this.mentionedMessageId = str4;
        this.channel = chatChannel;
        this.mentionedById = str5;
        this.status = str6;
        this.expirationUnixTime = timestamp;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
