package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "messagePlatform"}, name = "messageRoutingByAccountId"), @Index(fields = {"channelId"}, name = "messageRoutingByChannelId")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "MessageChatBotRoutings")
/* loaded from: classes5.dex */
public final class MessageChatBotRouting implements Model {

    @ModelField(targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ID")
    private final String botId;

    @ModelField(targetType = "ID")
    private final String channelId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String messagePlatform;

    @ModelField(targetType = "String")
    private final String phoneNumberIdExternal;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;
    public static final QueryField ID = QueryField.field("MessageChatBotRouting", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("MessageChatBotRouting", "accountId");
    public static final QueryField MESSAGE_PLATFORM = QueryField.field("MessageChatBotRouting", "messagePlatform");
    public static final QueryField PHONE_NUMBER_ID_EXTERNAL = QueryField.field("MessageChatBotRouting", "phoneNumberIdExternal");
    public static final QueryField CHANNEL_ID = QueryField.field("MessageChatBotRouting", "channelId");
    public static final QueryField BOT_ID = QueryField.field("MessageChatBotRouting", "botId");
    public static final QueryField CREATED_BY_ID = QueryField.field("MessageChatBotRouting", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("MessageChatBotRouting", "updatedById");
    public static final QueryField CREATED_AT = QueryField.field("MessageChatBotRouting", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("MessageChatBotRouting", "updatedAt");

    public interface BuildStep {
        BuildStep accountId(String str);

        BuildStep botId(String str);

        MessageChatBotRouting build();

        BuildStep channelId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep id(String str);

        BuildStep messagePlatform(String str);

        BuildStep phoneNumberIdExternal(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);
    }

    public static class Builder implements BuildStep {
        private String accountId;
        private String botId;
        private String channelId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String id;
        private String messagePlatform;
        private String phoneNumberIdExternal;
        private Temporal.DateTime updatedAt;
        private String updatedById;

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep accountId(String str) {
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep botId(String str) {
            this.botId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public MessageChatBotRouting build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new MessageChatBotRouting(string, this.accountId, this.messagePlatform, this.phoneNumberIdExternal, this.channelId, this.botId, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep channelId(String str) {
            this.channelId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep messagePlatform(String str) {
            this.messagePlatform = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep phoneNumberIdExternal(String str) {
            this.phoneNumberIdExternal = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.messagePlatform = str3;
            this.phoneNumberIdExternal = str4;
            this.channelId = str5;
            this.botId = str6;
            this.createdById = str7;
            this.updatedById = str8;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, str6, str7, str8, dateTime, dateTime2);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.Builder, com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.Builder, com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public CopyOfBuilder botId(String str) {
            return (CopyOfBuilder) super.botId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.Builder, com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public CopyOfBuilder channelId(String str) {
            return (CopyOfBuilder) super.channelId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.Builder, com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.Builder, com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.Builder, com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public CopyOfBuilder messagePlatform(String str) {
            return (CopyOfBuilder) super.messagePlatform(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.Builder, com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public CopyOfBuilder phoneNumberIdExternal(String str) {
            return (CopyOfBuilder) super.phoneNumberIdExternal(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.Builder, com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.MessageChatBotRouting.Builder, com.amplifyframework.datastore.generated.model.MessageChatBotRouting.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static MessageChatBotRouting justId(String str) {
        return new MessageChatBotRouting(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.messagePlatform, this.phoneNumberIdExternal, this.channelId, this.botId, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MessageChatBotRouting.class != obj.getClass()) {
            return false;
        }
        MessageChatBotRouting messageChatBotRouting = (MessageChatBotRouting) obj;
        return s6c.m47909a(getId(), messageChatBotRouting.getId()) && s6c.m47909a(getAccountId(), messageChatBotRouting.getAccountId()) && s6c.m47909a(getMessagePlatform(), messageChatBotRouting.getMessagePlatform()) && s6c.m47909a(getPhoneNumberIdExternal(), messageChatBotRouting.getPhoneNumberIdExternal()) && s6c.m47909a(getChannelId(), messageChatBotRouting.getChannelId()) && s6c.m47909a(getBotId(), messageChatBotRouting.getBotId()) && s6c.m47909a(getCreatedById(), messageChatBotRouting.getCreatedById()) && s6c.m47909a(getUpdatedById(), messageChatBotRouting.getUpdatedById()) && s6c.m47909a(getCreatedAt(), messageChatBotRouting.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), messageChatBotRouting.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getId() {
        return this.id;
    }

    public String getMessagePlatform() {
        return this.messagePlatform;
    }

    public String getPhoneNumberIdExternal() {
        return this.phoneNumberIdExternal;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getMessagePlatform() + getPhoneNumberIdExternal() + getChannelId() + getBotId() + getCreatedById() + getUpdatedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessageChatBotRouting {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("messagePlatform=" + String.valueOf(getMessagePlatform()) + ", ");
        sb.append("phoneNumberIdExternal=" + String.valueOf(getPhoneNumberIdExternal()) + ", ");
        sb.append("channelId=" + String.valueOf(getChannelId()) + ", ");
        sb.append("botId=" + String.valueOf(getBotId()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private MessageChatBotRouting(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.messagePlatform = str3;
        this.phoneNumberIdExternal = str4;
        this.channelId = str5;
        this.botId = str6;
        this.createdById = str7;
        this.updatedById = str8;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
