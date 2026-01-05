package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"conversationId"}, name = SQLiteCommandFactory.UNDEFINED)
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "WabaConversations")
/* loaded from: classes5.dex */
public final class WabaConversation implements Model {

    @ModelField(targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String category;

    @BelongsTo(targetName = "channelId", type = ChatChannel.class)
    @ModelField(targetType = "ChatChannel")
    private final ChatChannel channel;

    @BelongsTo(targetName = "recipientId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(isRequired = true, targetType = "ID")
    private final String conversationId;

    @ModelField(targetType = "ID")
    private final String conversationInitiatedByUserId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String displayPhoneNumber;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime expirationTimestamp;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "ID")
    private final String initiatingMessageExternalId;

    @ModelField(targetType = "ID")
    private final String initiatingMessageId;

    @ModelField(targetType = "Boolean")
    private final Boolean isBillable;

    @ModelField(targetType = "MessageSendCategory")
    private final MessageSendCategory messageSendCategory;

    @ModelField(targetType = "String")
    private final String originType;

    @ModelField(targetType = "ID")
    private final String phoneNumberId;

    @ModelField(targetType = "String")
    private final String pricingModel;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String wabaAccountId;
    public static final QueryField ID = QueryField.field("WabaConversation", OutcomeConstants.OUTCOME_ID);
    public static final QueryField CONVERSATION_ID = QueryField.field("WabaConversation", "conversationId");
    public static final QueryField ORIGIN_TYPE = QueryField.field("WabaConversation", "originType");
    public static final QueryField CATEGORY = QueryField.field("WabaConversation", "category");
    public static final QueryField IS_BILLABLE = QueryField.field("WabaConversation", "isBillable");
    public static final QueryField PRICING_MODEL = QueryField.field("WabaConversation", "pricingModel");
    public static final QueryField EXPIRATION_TIMESTAMP = QueryField.field("WabaConversation", "expirationTimestamp");
    public static final QueryField CONTACT = QueryField.field("WabaConversation", "recipientId");
    public static final QueryField CHANNEL = QueryField.field("WabaConversation", "channelId");
    public static final QueryField ACCOUNT_ID = QueryField.field("WabaConversation", "accountId");
    public static final QueryField WABA_ACCOUNT_ID = QueryField.field("WabaConversation", "wabaAccountId");
    public static final QueryField DISPLAY_PHONE_NUMBER = QueryField.field("WabaConversation", "displayPhoneNumber");
    public static final QueryField PHONE_NUMBER_ID = QueryField.field("WabaConversation", "phoneNumberId");
    public static final QueryField MESSAGE_SEND_CATEGORY = QueryField.field("WabaConversation", "messageSendCategory");
    public static final QueryField INITIATING_MESSAGE_EXTERNAL_ID = QueryField.field("WabaConversation", "initiatingMessageExternalId");
    public static final QueryField INITIATING_MESSAGE_ID = QueryField.field("WabaConversation", "initiatingMessageId");
    public static final QueryField CONVERSATION_INITIATED_BY_USER_ID = QueryField.field("WabaConversation", "conversationInitiatedByUserId");
    public static final QueryField CREATED_AT = QueryField.field("WabaConversation", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("WabaConversation", "updatedAt");

    public interface BuildStep {
        BuildStep accountId(String str);

        WabaConversation build();

        BuildStep category(String str);

        BuildStep channel(ChatChannel chatChannel);

        BuildStep contact(Contact contact);

        BuildStep conversationInitiatedByUserId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep displayPhoneNumber(String str);

        BuildStep expirationTimestamp(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep initiatingMessageExternalId(String str);

        BuildStep initiatingMessageId(String str);

        BuildStep isBillable(Boolean bool);

        BuildStep messageSendCategory(MessageSendCategory messageSendCategory);

        BuildStep originType(String str);

        BuildStep phoneNumberId(String str);

        BuildStep pricingModel(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep wabaAccountId(String str);
    }

    public static class Builder implements ConversationIdStep, BuildStep {
        private String accountId;
        private String category;
        private ChatChannel channel;
        private Contact contact;
        private String conversationId;
        private String conversationInitiatedByUserId;
        private Temporal.DateTime createdAt;
        private String displayPhoneNumber;
        private Temporal.DateTime expirationTimestamp;
        private String id;
        private String initiatingMessageExternalId;
        private String initiatingMessageId;
        private Boolean isBillable;
        private MessageSendCategory messageSendCategory;
        private String originType;
        private String phoneNumberId;
        private String pricingModel;
        private Temporal.DateTime updatedAt;
        private String wabaAccountId;

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep accountId(String str) {
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public WabaConversation build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new WabaConversation(string, this.conversationId, this.originType, this.category, this.isBillable, this.pricingModel, this.expirationTimestamp, this.contact, this.channel, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.messageSendCategory, this.initiatingMessageExternalId, this.initiatingMessageId, this.conversationInitiatedByUserId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep category(String str) {
            this.category = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep channel(ChatChannel chatChannel) {
            this.channel = chatChannel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.ConversationIdStep
        public BuildStep conversationId(String str) {
            Objects.requireNonNull(str);
            this.conversationId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep conversationInitiatedByUserId(String str) {
            this.conversationInitiatedByUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep displayPhoneNumber(String str) {
            this.displayPhoneNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep expirationTimestamp(Temporal.DateTime dateTime) {
            this.expirationTimestamp = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep initiatingMessageExternalId(String str) {
            this.initiatingMessageExternalId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep initiatingMessageId(String str) {
            this.initiatingMessageId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep isBillable(Boolean bool) {
            this.isBillable = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep messageSendCategory(MessageSendCategory messageSendCategory) {
            this.messageSendCategory = messageSendCategory;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep originType(String str) {
            this.originType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep phoneNumberId(String str) {
            this.phoneNumberId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep pricingModel(String str) {
            this.pricingModel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public BuildStep wabaAccountId(String str) {
            this.wabaAccountId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, Boolean bool, String str5, Temporal.DateTime dateTime, Contact contact, ChatChannel chatChannel, String str6, String str7, String str8, String str9, MessageSendCategory messageSendCategory, String str10, String str11, String str12, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            this.id = str;
            this.conversationId = str2;
            this.originType = str3;
            this.category = str4;
            this.isBillable = bool;
            this.pricingModel = str5;
            this.expirationTimestamp = dateTime;
            this.contact = contact;
            this.channel = chatChannel;
            this.accountId = str6;
            this.wabaAccountId = str7;
            this.displayPhoneNumber = str8;
            this.phoneNumberId = str9;
            this.messageSendCategory = messageSendCategory;
            this.initiatingMessageExternalId = str10;
            this.initiatingMessageId = str11;
            this.conversationInitiatedByUserId = str12;
            this.createdAt = dateTime2;
            this.updatedAt = dateTime3;
        }
    }

    public interface ConversationIdStep {
        BuildStep conversationId(String str);
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, Boolean bool, String str5, Temporal.DateTime dateTime, Contact contact, ChatChannel chatChannel, String str6, String str7, String str8, String str9, MessageSendCategory messageSendCategory, String str10, String str11, String str12, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            super(str, str2, str3, str4, bool, str5, dateTime, contact, chatChannel, str6, str7, str8, str9, messageSendCategory, str10, str11, str12, dateTime2, dateTime3);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder category(String str) {
            return (CopyOfBuilder) super.category(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder channel(ChatChannel chatChannel) {
            return (CopyOfBuilder) super.channel(chatChannel);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.ConversationIdStep
        public CopyOfBuilder conversationId(String str) {
            return (CopyOfBuilder) super.conversationId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder conversationInitiatedByUserId(String str) {
            return (CopyOfBuilder) super.conversationInitiatedByUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder displayPhoneNumber(String str) {
            return (CopyOfBuilder) super.displayPhoneNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder expirationTimestamp(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.expirationTimestamp(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder initiatingMessageExternalId(String str) {
            return (CopyOfBuilder) super.initiatingMessageExternalId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder initiatingMessageId(String str) {
            return (CopyOfBuilder) super.initiatingMessageId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder isBillable(Boolean bool) {
            return (CopyOfBuilder) super.isBillable(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder messageSendCategory(MessageSendCategory messageSendCategory) {
            return (CopyOfBuilder) super.messageSendCategory(messageSendCategory);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder originType(String str) {
            return (CopyOfBuilder) super.originType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder phoneNumberId(String str) {
            return (CopyOfBuilder) super.phoneNumberId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder pricingModel(String str) {
            return (CopyOfBuilder) super.pricingModel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaConversation.Builder, com.amplifyframework.datastore.generated.model.WabaConversation.BuildStep
        public CopyOfBuilder wabaAccountId(String str) {
            return (CopyOfBuilder) super.wabaAccountId(str);
        }
    }

    public static ConversationIdStep builder() {
        return new Builder();
    }

    public static WabaConversation justId(String str) {
        return new WabaConversation(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.conversationId, this.originType, this.category, this.isBillable, this.pricingModel, this.expirationTimestamp, this.contact, this.channel, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.messageSendCategory, this.initiatingMessageExternalId, this.initiatingMessageId, this.conversationInitiatedByUserId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WabaConversation.class != obj.getClass()) {
            return false;
        }
        WabaConversation wabaConversation = (WabaConversation) obj;
        return s6c.m47909a(getId(), wabaConversation.getId()) && s6c.m47909a(getConversationId(), wabaConversation.getConversationId()) && s6c.m47909a(getOriginType(), wabaConversation.getOriginType()) && s6c.m47909a(getCategory(), wabaConversation.getCategory()) && s6c.m47909a(getIsBillable(), wabaConversation.getIsBillable()) && s6c.m47909a(getPricingModel(), wabaConversation.getPricingModel()) && s6c.m47909a(getExpirationTimestamp(), wabaConversation.getExpirationTimestamp()) && s6c.m47909a(getContact(), wabaConversation.getContact()) && s6c.m47909a(getChannel(), wabaConversation.getChannel()) && s6c.m47909a(getAccountId(), wabaConversation.getAccountId()) && s6c.m47909a(getWabaAccountId(), wabaConversation.getWabaAccountId()) && s6c.m47909a(getDisplayPhoneNumber(), wabaConversation.getDisplayPhoneNumber()) && s6c.m47909a(getPhoneNumberId(), wabaConversation.getPhoneNumberId()) && s6c.m47909a(getMessageSendCategory(), wabaConversation.getMessageSendCategory()) && s6c.m47909a(getInitiatingMessageExternalId(), wabaConversation.getInitiatingMessageExternalId()) && s6c.m47909a(getInitiatingMessageId(), wabaConversation.getInitiatingMessageId()) && s6c.m47909a(getConversationInitiatedByUserId(), wabaConversation.getConversationInitiatedByUserId()) && s6c.m47909a(getCreatedAt(), wabaConversation.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), wabaConversation.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getCategory() {
        return this.category;
    }

    public ChatChannel getChannel() {
        return this.channel;
    }

    public Contact getContact() {
        return this.contact;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getConversationInitiatedByUserId() {
        return this.conversationInitiatedByUserId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDisplayPhoneNumber() {
        return this.displayPhoneNumber;
    }

    public Temporal.DateTime getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    public String getId() {
        return this.id;
    }

    public String getInitiatingMessageExternalId() {
        return this.initiatingMessageExternalId;
    }

    public String getInitiatingMessageId() {
        return this.initiatingMessageId;
    }

    public Boolean getIsBillable() {
        return this.isBillable;
    }

    public MessageSendCategory getMessageSendCategory() {
        return this.messageSendCategory;
    }

    public String getOriginType() {
        return this.originType;
    }

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    public String getPricingModel() {
        return this.pricingModel;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getWabaAccountId() {
        return this.wabaAccountId;
    }

    public int hashCode() {
        return (getId() + getConversationId() + getOriginType() + getCategory() + getIsBillable() + getPricingModel() + getExpirationTimestamp() + getContact() + getChannel() + getAccountId() + getWabaAccountId() + getDisplayPhoneNumber() + getPhoneNumberId() + getMessageSendCategory() + getInitiatingMessageExternalId() + getInitiatingMessageId() + getConversationInitiatedByUserId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WabaConversation {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("conversationId=" + String.valueOf(getConversationId()) + ", ");
        sb.append("originType=" + String.valueOf(getOriginType()) + ", ");
        sb.append("category=" + String.valueOf(getCategory()) + ", ");
        sb.append("isBillable=" + String.valueOf(getIsBillable()) + ", ");
        sb.append("pricingModel=" + String.valueOf(getPricingModel()) + ", ");
        sb.append("expirationTimestamp=" + String.valueOf(getExpirationTimestamp()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("channel=" + String.valueOf(getChannel()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("wabaAccountId=" + String.valueOf(getWabaAccountId()) + ", ");
        sb.append("displayPhoneNumber=" + String.valueOf(getDisplayPhoneNumber()) + ", ");
        sb.append("phoneNumberId=" + String.valueOf(getPhoneNumberId()) + ", ");
        sb.append("messageSendCategory=" + String.valueOf(getMessageSendCategory()) + ", ");
        sb.append("initiatingMessageExternalId=" + String.valueOf(getInitiatingMessageExternalId()) + ", ");
        sb.append("initiatingMessageId=" + String.valueOf(getInitiatingMessageId()) + ", ");
        sb.append("conversationInitiatedByUserId=" + String.valueOf(getConversationInitiatedByUserId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private WabaConversation(String str, String str2, String str3, String str4, Boolean bool, String str5, Temporal.DateTime dateTime, Contact contact, ChatChannel chatChannel, String str6, String str7, String str8, String str9, MessageSendCategory messageSendCategory, String str10, String str11, String str12, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
        this.id = str;
        this.conversationId = str2;
        this.originType = str3;
        this.category = str4;
        this.isBillable = bool;
        this.pricingModel = str5;
        this.expirationTimestamp = dateTime;
        this.contact = contact;
        this.channel = chatChannel;
        this.accountId = str6;
        this.wabaAccountId = str7;
        this.displayPhoneNumber = str8;
        this.phoneNumberId = str9;
        this.messageSendCategory = messageSendCategory;
        this.initiatingMessageExternalId = str10;
        this.initiatingMessageId = str11;
        this.conversationInitiatedByUserId = str12;
        this.createdAt = dateTime2;
        this.updatedAt = dateTime3;
    }
}
