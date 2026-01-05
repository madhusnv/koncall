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
import java.util.List;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "contactId"}, name = "botContextByContactId"), @Index(fields = {"accountId", "userId"}, name = "botContextByUserId"), @Index(fields = {"accountId", "channelId"}, name = "botContextByChannelId")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "ChatBotContexts")
/* loaded from: classes5.dex */
public final class ChatBotContext implements Model {

    @ModelField(targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ID")
    private final String channelId;

    @ModelField(targetType = "ID")
    private final String contactId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String currentIntent;

    @ModelField(targetType = "ID")
    private final String handlerChatBot;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final List<String> intentList;

    @ModelField(targetType = "Boolean")
    private final Boolean isPaused;

    @ModelField(targetType = "ID")
    private final String lastChatMessageId;

    @ModelField(targetType = "ID")
    private final String masterChatBot;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime pausedAt;

    @ModelField(targetType = "String")
    private final String pausedBy;

    @ModelField(targetType = "ID")
    private final String pausedById;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("ChatBotContext", OutcomeConstants.OUTCOME_ID);
    public static final QueryField HANDLER_CHAT_BOT = QueryField.field("ChatBotContext", "handlerChatBot");
    public static final QueryField MASTER_CHAT_BOT = QueryField.field("ChatBotContext", "masterChatBot");
    public static final QueryField ACCOUNT_ID = QueryField.field("ChatBotContext", "accountId");
    public static final QueryField CONTACT_ID = QueryField.field("ChatBotContext", "contactId");
    public static final QueryField USER_ID = QueryField.field("ChatBotContext", "userId");
    public static final QueryField CHANNEL_ID = QueryField.field("ChatBotContext", "channelId");
    public static final QueryField LAST_CHAT_MESSAGE_ID = QueryField.field("ChatBotContext", "lastChatMessageId");
    public static final QueryField CREATED_AT = QueryField.field("ChatBotContext", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ChatBotContext", "updatedAt");
    public static final QueryField IS_PAUSED = QueryField.field("ChatBotContext", "isPaused");
    public static final QueryField PAUSED_BY = QueryField.field("ChatBotContext", "pausedBy");
    public static final QueryField PAUSED_BY_ID = QueryField.field("ChatBotContext", "pausedById");
    public static final QueryField PAUSED_AT = QueryField.field("ChatBotContext", "pausedAt");
    public static final QueryField CURRENT_INTENT = QueryField.field("ChatBotContext", "currentIntent");
    public static final QueryField INTENT_LIST = QueryField.field("ChatBotContext", "intentList");

    public interface BuildStep {
        BuildStep accountId(String str);

        ChatBotContext build();

        BuildStep channelId(String str);

        BuildStep contactId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep currentIntent(String str);

        BuildStep handlerChatBot(String str);

        BuildStep id(String str);

        BuildStep intentList(List<String> list);

        BuildStep isPaused(Boolean bool);

        BuildStep lastChatMessageId(String str);

        BuildStep masterChatBot(String str);

        BuildStep pausedAt(Temporal.DateTime dateTime);

        BuildStep pausedBy(String str);

        BuildStep pausedById(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep userId(String str);
    }

    public static class Builder implements BuildStep {
        private String accountId;
        private String channelId;
        private String contactId;
        private Temporal.DateTime createdAt;
        private String currentIntent;
        private String handlerChatBot;
        private String id;
        private List<String> intentList;
        private Boolean isPaused;
        private String lastChatMessageId;
        private String masterChatBot;
        private Temporal.DateTime pausedAt;
        private String pausedBy;
        private String pausedById;
        private Temporal.DateTime updatedAt;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep accountId(String str) {
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public ChatBotContext build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ChatBotContext(string, this.handlerChatBot, this.masterChatBot, this.accountId, this.contactId, this.userId, this.channelId, this.lastChatMessageId, this.createdAt, this.updatedAt, this.isPaused, this.pausedBy, this.pausedById, this.pausedAt, this.currentIntent, this.intentList);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep channelId(String str) {
            this.channelId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep contactId(String str) {
            this.contactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep currentIntent(String str) {
            this.currentIntent = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep handlerChatBot(String str) {
            this.handlerChatBot = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep intentList(List<String> list) {
            this.intentList = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep isPaused(Boolean bool) {
            this.isPaused = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep lastChatMessageId(String str) {
            this.lastChatMessageId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep masterChatBot(String str) {
            this.masterChatBot = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep pausedAt(Temporal.DateTime dateTime) {
            this.pausedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep pausedBy(String str) {
            this.pausedBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep pausedById(String str) {
            this.pausedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public BuildStep userId(String str) {
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Boolean bool, String str9, String str10, Temporal.DateTime dateTime3, String str11, List<String> list) {
            this.id = str;
            this.handlerChatBot = str2;
            this.masterChatBot = str3;
            this.accountId = str4;
            this.contactId = str5;
            this.userId = str6;
            this.channelId = str7;
            this.lastChatMessageId = str8;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.isPaused = bool;
            this.pausedBy = str9;
            this.pausedById = str10;
            this.pausedAt = dateTime3;
            this.currentIntent = str11;
            this.intentList = list;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public /* bridge */ /* synthetic */ BuildStep intentList(List list) {
            return intentList((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Boolean bool, String str9, String str10, Temporal.DateTime dateTime3, String str11, List<String> list) {
            super(str, str2, str3, str4, str5, str6, str7, str8, dateTime, dateTime2, bool, str9, str10, dateTime3, str11, list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder channelId(String str) {
            return (CopyOfBuilder) super.channelId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder contactId(String str) {
            return (CopyOfBuilder) super.contactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder currentIntent(String str) {
            return (CopyOfBuilder) super.currentIntent(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder handlerChatBot(String str) {
            return (CopyOfBuilder) super.handlerChatBot(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder intentList(List<String> list) {
            return (CopyOfBuilder) super.intentList(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder isPaused(Boolean bool) {
            return (CopyOfBuilder) super.isPaused(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder lastChatMessageId(String str) {
            return (CopyOfBuilder) super.lastChatMessageId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder masterChatBot(String str) {
            return (CopyOfBuilder) super.masterChatBot(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder pausedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.pausedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder pausedBy(String str) {
            return (CopyOfBuilder) super.pausedBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder pausedById(String str) {
            return (CopyOfBuilder) super.pausedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBotContext.Builder, com.amplifyframework.datastore.generated.model.ChatBotContext.BuildStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static ChatBotContext justId(String str) {
        return new ChatBotContext(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.handlerChatBot, this.masterChatBot, this.accountId, this.contactId, this.userId, this.channelId, this.lastChatMessageId, this.createdAt, this.updatedAt, this.isPaused, this.pausedBy, this.pausedById, this.pausedAt, this.currentIntent, this.intentList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChatBotContext.class != obj.getClass()) {
            return false;
        }
        ChatBotContext chatBotContext = (ChatBotContext) obj;
        return s6c.m47909a(getId(), chatBotContext.getId()) && s6c.m47909a(getHandlerChatBot(), chatBotContext.getHandlerChatBot()) && s6c.m47909a(getMasterChatBot(), chatBotContext.getMasterChatBot()) && s6c.m47909a(getAccountId(), chatBotContext.getAccountId()) && s6c.m47909a(getContactId(), chatBotContext.getContactId()) && s6c.m47909a(getUserId(), chatBotContext.getUserId()) && s6c.m47909a(getChannelId(), chatBotContext.getChannelId()) && s6c.m47909a(getLastChatMessageId(), chatBotContext.getLastChatMessageId()) && s6c.m47909a(getCreatedAt(), chatBotContext.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), chatBotContext.getUpdatedAt()) && s6c.m47909a(getIsPaused(), chatBotContext.getIsPaused()) && s6c.m47909a(getPausedBy(), chatBotContext.getPausedBy()) && s6c.m47909a(getPausedById(), chatBotContext.getPausedById()) && s6c.m47909a(getPausedAt(), chatBotContext.getPausedAt()) && s6c.m47909a(getCurrentIntent(), chatBotContext.getCurrentIntent()) && s6c.m47909a(getIntentList(), chatBotContext.getIntentList());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getContactId() {
        return this.contactId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCurrentIntent() {
        return this.currentIntent;
    }

    public String getHandlerChatBot() {
        return this.handlerChatBot;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getIntentList() {
        return this.intentList;
    }

    public Boolean getIsPaused() {
        return this.isPaused;
    }

    public String getLastChatMessageId() {
        return this.lastChatMessageId;
    }

    public String getMasterChatBot() {
        return this.masterChatBot;
    }

    public Temporal.DateTime getPausedAt() {
        return this.pausedAt;
    }

    public String getPausedBy() {
        return this.pausedBy;
    }

    public String getPausedById() {
        return this.pausedById;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getHandlerChatBot() + getMasterChatBot() + getAccountId() + getContactId() + getUserId() + getChannelId() + getLastChatMessageId() + getCreatedAt() + getUpdatedAt() + getIsPaused() + getPausedBy() + getPausedById() + getPausedAt() + getCurrentIntent() + getIntentList()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatBotContext {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("handlerChatBot=" + String.valueOf(getHandlerChatBot()) + ", ");
        sb.append("masterChatBot=" + String.valueOf(getMasterChatBot()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contactId=" + String.valueOf(getContactId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("channelId=" + String.valueOf(getChannelId()) + ", ");
        sb.append("lastChatMessageId=" + String.valueOf(getLastChatMessageId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("isPaused=" + String.valueOf(getIsPaused()) + ", ");
        sb.append("pausedBy=" + String.valueOf(getPausedBy()) + ", ");
        sb.append("pausedById=" + String.valueOf(getPausedById()) + ", ");
        sb.append("pausedAt=" + String.valueOf(getPausedAt()) + ", ");
        sb.append("currentIntent=" + String.valueOf(getCurrentIntent()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("intentList=");
        sb2.append(String.valueOf(getIntentList()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ChatBotContext(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Boolean bool, String str9, String str10, Temporal.DateTime dateTime3, String str11, List<String> list) {
        this.id = str;
        this.handlerChatBot = str2;
        this.masterChatBot = str3;
        this.accountId = str4;
        this.contactId = str5;
        this.userId = str6;
        this.channelId = str7;
        this.lastChatMessageId = str8;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.isPaused = bool;
        this.pausedBy = str9;
        this.pausedById = str10;
        this.pausedAt = dateTime3;
        this.currentIntent = str11;
        this.intentList = list;
    }
}
