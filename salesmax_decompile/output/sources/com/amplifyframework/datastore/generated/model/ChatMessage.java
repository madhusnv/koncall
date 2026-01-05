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

@Indexes({@Index(fields = {"channelId", "createdAt"}, name = "messagesByChannel"), @Index(fields = {"externalMessageReferenceId"}, name = "messagesByExternalId")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "ChatMessages")
/* loaded from: classes5.dex */
public final class ChatMessage implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ActionInteractive")
    private final ActionInteractive actionInteractive;

    @ModelField(targetType = "AWSJSON")
    private final String adddressMessageParameters;

    @ModelField(targetType = "WaButton")
    private final List<WaButton> buttons;

    @BelongsTo(targetName = "channelId", type = ChatChannel.class)
    @ModelField(targetType = "ChatChannel")
    private final ChatChannel channel;

    @ModelField(targetType = "ID")
    private final String chatBotId;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User chatUser;

    @ModelField(targetType = "ID")
    private final String chatUserAccountIdIfExternal;

    @ModelField(targetType = "String")
    private final String chatUserAccountNameIfExternal;

    @ModelField(targetType = "ID")
    private final String chatUserId;

    @ModelField(targetType = "String")
    private final String chatUserName;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSJSON")
    private final List<String> contactObjectToSend;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime deliveredAt;

    @ModelField(targetType = "ID")
    private final String directChatUserId;

    @ModelField(targetType = "AWSJSON")
    private final String errorMessages;

    @ModelField(targetType = "String")
    private final String externalConversationId;

    @ModelField(targetType = "String")
    private final String externalMessageReferenceId;

    @ModelField(targetType = "String")
    private final String externalTemplateCategory;

    @ModelField(targetType = "String")
    private final String externalTemplateId;

    @ModelField(targetType = "String")
    private final String followUpType;

    @ModelField(targetType = "String")
    private final String footerText;

    @ModelField(targetType = "Boolean")
    private final Boolean hasImage;

    @ModelField(targetType = "String")
    private final String headerText;

    @ModelField(targetType = "String")
    private final String headerType;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "ID")
    private final String internalTemplateId;

    @ModelField(targetType = "Boolean")
    private final Boolean isInbound;

    @ModelField(targetType = "Boolean")
    private final Boolean isStarred;

    @ModelField(targetType = "ID")
    private final String linkedEngagementIdIfBroadcast;

    @ModelField(targetType = "AWSJSON")
    private final String locationObjectToSend;

    @BelongsTo(targetName = "mediaObjectId", type = UploadedFile.class)
    @ModelField(targetType = "UploadedFile")
    private final UploadedFile media;

    @ModelField(targetType = "String")
    private final String mediaMetadata;

    @ModelField(targetType = "MentionedEntities")
    private final List<MentionedEntities> mentioned;

    @ModelField(targetType = "String")
    private final String messageCategory;

    @ModelField(targetType = "String")
    private final String messagePlatform;

    @ModelField(targetType = "MessageSendCategory")
    private final MessageSendCategory messageSendCategory;

    @ModelField(targetType = "String")
    private final String messageSubType;

    @ModelField(targetType = "String")
    private final String messageType;

    @ModelField(targetType = "TemplateParameter")
    private final List<TemplateParameter> parameters;

    @ModelField(targetType = "String")
    private final String phoneNumberIdExternal;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @ModelField(targetType = "WaProductItem")
    private final List<WaProductItem> productItems;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime readAt;

    @ModelField(targetType = "String")
    private final String recipientExternalId;

    @ModelField(targetType = "String")
    private final String recipientExternalIdType;

    @ModelField(targetType = "AWSJSON")
    private final String referral;

    @BelongsTo(targetName = "referredContactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact referredContact;

    @ModelField(targetType = "String")
    private final String referredProductCatalogId;

    @ModelField(targetType = "String")
    private final String referredProductRetailerId;

    @ModelField(targetType = "String")
    private final String replyType;

    @ModelField(targetType = "String")
    private final String replyTypeId;

    @ModelField(targetType = "ChatMessage")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = ChatMessage.class)
    private final ChatMessage replyingToMessage;

    @ModelField(targetType = "ID")
    private final String replyingToMessageId;

    @ModelField(targetType = "String")
    private final String replyingToMessageIdExternal;

    @ModelField(targetType = "ChatMessage")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = ChatMessage.class)
    private final ChatMessage responseMessage;

    @ModelField(targetType = "ID")
    private final String responseMessageId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime sentAt;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "String")
    private final String text;

    @ModelField(targetType = "String")
    private final String thumbnailUrl;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String visitorId;
    public static final QueryField ID = QueryField.field("ChatMessage", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ChatMessage", "accountId");
    public static final QueryField PHONE_NUMBER_ID_EXTERNAL = QueryField.field("ChatMessage", "phoneNumberIdExternal");
    public static final QueryField MESSAGE_PLATFORM = QueryField.field("ChatMessage", "messagePlatform");
    public static final QueryField EXTERNAL_MESSAGE_REFERENCE_ID = QueryField.field("ChatMessage", "externalMessageReferenceId");
    public static final QueryField EXTERNAL_CONVERSATION_ID = QueryField.field("ChatMessage", "externalConversationId");
    public static final QueryField RECIPIENT_EXTERNAL_ID = QueryField.field("ChatMessage", "recipientExternalId");
    public static final QueryField RECIPIENT_EXTERNAL_ID_TYPE = QueryField.field("ChatMessage", "recipientExternalIdType");
    public static final QueryField CHANNEL = QueryField.field("ChatMessage", "channelId");
    public static final QueryField VISITOR_ID = QueryField.field("ChatMessage", "visitorId");
    public static final QueryField CONTACT = QueryField.field("ChatMessage", "contactId");
    public static final QueryField REFERRED_CONTACT = QueryField.field("ChatMessage", "referredContactId");
    public static final QueryField MESSAGE_TYPE = QueryField.field("ChatMessage", "messageType");
    public static final QueryField MESSAGE_SUB_TYPE = QueryField.field("ChatMessage", "messageSubType");
    public static final QueryField MESSAGE_CATEGORY = QueryField.field("ChatMessage", "messageCategory");
    public static final QueryField MESSAGE_SEND_CATEGORY = QueryField.field("ChatMessage", "messageSendCategory");
    public static final QueryField REPLYING_TO_MESSAGE_ID = QueryField.field("ChatMessage", "replyingToMessageId");
    public static final QueryField REPLYING_TO_MESSAGE_ID_EXTERNAL = QueryField.field("ChatMessage", "replyingToMessageIdExternal");
    public static final QueryField RESPONSE_MESSAGE_ID = QueryField.field("ChatMessage", "responseMessageId");
    public static final QueryField FOLLOW_UP_TYPE = QueryField.field("ChatMessage", "followUpType");
    public static final QueryField REPLY_TYPE = QueryField.field("ChatMessage", "replyType");
    public static final QueryField REPLY_TYPE_ID = QueryField.field("ChatMessage", "replyTypeId");
    public static final QueryField REFERRED_PRODUCT_CATALOG_ID = QueryField.field("ChatMessage", "referredProductCatalogId");
    public static final QueryField REFERRED_PRODUCT_RETAILER_ID = QueryField.field("ChatMessage", "referredProductRetailerId");
    public static final QueryField PRODUCT_ITEMS = QueryField.field("ChatMessage", "productItems");
    public static final QueryField REFERRAL = QueryField.field("ChatMessage", "referral");
    public static final QueryField IS_STARRED = QueryField.field("ChatMessage", "isStarred");
    public static final QueryField STATUS = QueryField.field("ChatMessage", "status");
    public static final QueryField ERROR_MESSAGES = QueryField.field("ChatMessage", "errorMessages");
    public static final QueryField SENT_AT = QueryField.field("ChatMessage", "sentAt");
    public static final QueryField DELIVERED_AT = QueryField.field("ChatMessage", "deliveredAt");
    public static final QueryField READ_AT = QueryField.field("ChatMessage", "readAt");
    public static final QueryField INTERNAL_TEMPLATE_ID = QueryField.field("ChatMessage", "internalTemplateId");
    public static final QueryField EXTERNAL_TEMPLATE_ID = QueryField.field("ChatMessage", "externalTemplateId");
    public static final QueryField EXTERNAL_TEMPLATE_CATEGORY = QueryField.field("ChatMessage", "externalTemplateCategory");
    public static final QueryField TEXT = QueryField.field("ChatMessage", "text");
    public static final QueryField CONTACT_OBJECT_TO_SEND = QueryField.field("ChatMessage", "contactObjectToSend");
    public static final QueryField LOCATION_OBJECT_TO_SEND = QueryField.field("ChatMessage", "locationObjectToSend");
    public static final QueryField ADDDRESS_MESSAGE_PARAMETERS = QueryField.field("ChatMessage", "adddressMessageParameters");
    public static final QueryField HEADER_TEXT = QueryField.field("ChatMessage", "headerText");
    public static final QueryField FOOTER_TEXT = QueryField.field("ChatMessage", "footerText");
    public static final QueryField HEADER_TYPE = QueryField.field("ChatMessage", "headerType");
    public static final QueryField ACTION_INTERACTIVE = QueryField.field("ChatMessage", "actionInteractive");
    public static final QueryField BUTTONS = QueryField.field("ChatMessage", "buttons");
    public static final QueryField PARAMETERS = QueryField.field("ChatMessage", "parameters");
    public static final QueryField MEDIA = QueryField.field("ChatMessage", "mediaObjectId");
    public static final QueryField MEDIA_METADATA = QueryField.field("ChatMessage", "mediaMetadata");
    public static final QueryField HAS_IMAGE = QueryField.field("ChatMessage", "hasImage");
    public static final QueryField THUMBNAIL_URL = QueryField.field("ChatMessage", "thumbnailUrl");
    public static final QueryField IS_INBOUND = QueryField.field("ChatMessage", "isInbound");
    public static final QueryField CHAT_USER_ID = QueryField.field("ChatMessage", "chatUserId");
    public static final QueryField CHAT_USER_NAME = QueryField.field("ChatMessage", "chatUserName");
    public static final QueryField CHAT_BOT_ID = QueryField.field("ChatMessage", "chatBotId");
    public static final QueryField CHAT_USER_ACCOUNT_ID_IF_EXTERNAL = QueryField.field("ChatMessage", "chatUserAccountIdIfExternal");
    public static final QueryField CHAT_USER_ACCOUNT_NAME_IF_EXTERNAL = QueryField.field("ChatMessage", "chatUserAccountNameIfExternal");
    public static final QueryField DIRECT_CHAT_USER_ID = QueryField.field("ChatMessage", "directChatUserId");
    public static final QueryField MENTIONED = QueryField.field("ChatMessage", "mentioned");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("ChatMessage", "primaryTeamId");
    public static final QueryField LINKED_ENGAGEMENT_ID_IF_BROADCAST = QueryField.field("ChatMessage", "linkedEngagementIdIfBroadcast");
    public static final QueryField CREATED_AT = QueryField.field("ChatMessage", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ChatMessage", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep actionInteractive(ActionInteractive actionInteractive);

        BuildStep adddressMessageParameters(String str);

        ChatMessage build();

        BuildStep buttons(List<WaButton> list);

        BuildStep channel(ChatChannel chatChannel);

        BuildStep chatBotId(String str);

        BuildStep chatUserAccountIdIfExternal(String str);

        BuildStep chatUserAccountNameIfExternal(String str);

        BuildStep chatUserId(String str);

        BuildStep chatUserName(String str);

        BuildStep contact(Contact contact);

        BuildStep contactObjectToSend(List<String> list);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep deliveredAt(Temporal.DateTime dateTime);

        BuildStep directChatUserId(String str);

        BuildStep errorMessages(String str);

        BuildStep externalConversationId(String str);

        BuildStep externalMessageReferenceId(String str);

        BuildStep externalTemplateCategory(String str);

        BuildStep externalTemplateId(String str);

        BuildStep followUpType(String str);

        BuildStep footerText(String str);

        BuildStep hasImage(Boolean bool);

        BuildStep headerText(String str);

        BuildStep headerType(String str);

        BuildStep id(String str);

        BuildStep internalTemplateId(String str);

        BuildStep isInbound(Boolean bool);

        BuildStep isStarred(Boolean bool);

        BuildStep linkedEngagementIdIfBroadcast(String str);

        BuildStep locationObjectToSend(String str);

        BuildStep media(UploadedFile uploadedFile);

        BuildStep mediaMetadata(String str);

        BuildStep mentioned(List<MentionedEntities> list);

        BuildStep messageCategory(String str);

        BuildStep messagePlatform(String str);

        BuildStep messageSendCategory(MessageSendCategory messageSendCategory);

        BuildStep messageSubType(String str);

        BuildStep messageType(String str);

        BuildStep parameters(List<TemplateParameter> list);

        BuildStep phoneNumberIdExternal(String str);

        BuildStep primaryTeamId(String str);

        BuildStep productItems(List<WaProductItem> list);

        BuildStep readAt(Temporal.DateTime dateTime);

        BuildStep recipientExternalId(String str);

        BuildStep recipientExternalIdType(String str);

        BuildStep referral(String str);

        BuildStep referredContact(Contact contact);

        BuildStep referredProductCatalogId(String str);

        BuildStep referredProductRetailerId(String str);

        BuildStep replyType(String str);

        BuildStep replyTypeId(String str);

        BuildStep replyingToMessageId(String str);

        BuildStep replyingToMessageIdExternal(String str);

        BuildStep responseMessageId(String str);

        BuildStep sentAt(Temporal.DateTime dateTime);

        BuildStep status(String str);

        BuildStep text(String str);

        BuildStep thumbnailUrl(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep visitorId(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private ActionInteractive actionInteractive;
        private String adddressMessageParameters;
        private List<WaButton> buttons;
        private ChatChannel channel;
        private String chatBotId;
        private String chatUserAccountIdIfExternal;
        private String chatUserAccountNameIfExternal;
        private String chatUserId;
        private String chatUserName;
        private Contact contact;
        private List<String> contactObjectToSend;
        private Temporal.DateTime createdAt;
        private Temporal.DateTime deliveredAt;
        private String directChatUserId;
        private String errorMessages;
        private String externalConversationId;
        private String externalMessageReferenceId;
        private String externalTemplateCategory;
        private String externalTemplateId;
        private String followUpType;
        private String footerText;
        private Boolean hasImage;
        private String headerText;
        private String headerType;
        private String id;
        private String internalTemplateId;
        private Boolean isInbound;
        private Boolean isStarred;
        private String linkedEngagementIdIfBroadcast;
        private String locationObjectToSend;
        private UploadedFile media;
        private String mediaMetadata;
        private List<MentionedEntities> mentioned;
        private String messageCategory;
        private String messagePlatform;
        private MessageSendCategory messageSendCategory;
        private String messageSubType;
        private String messageType;
        private List<TemplateParameter> parameters;
        private String phoneNumberIdExternal;
        private String primaryTeamId;
        private List<WaProductItem> productItems;
        private Temporal.DateTime readAt;
        private String recipientExternalId;
        private String recipientExternalIdType;
        private String referral;
        private Contact referredContact;
        private String referredProductCatalogId;
        private String referredProductRetailerId;
        private String replyType;
        private String replyTypeId;
        private String replyingToMessageId;
        private String replyingToMessageIdExternal;
        private String responseMessageId;
        private Temporal.DateTime sentAt;
        private String status;
        private String text;
        private String thumbnailUrl;
        private Temporal.DateTime updatedAt;
        private String visitorId;

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep actionInteractive(ActionInteractive actionInteractive) {
            this.actionInteractive = actionInteractive;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep adddressMessageParameters(String str) {
            this.adddressMessageParameters = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public ChatMessage build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ChatMessage(string, this.accountId, this.phoneNumberIdExternal, this.messagePlatform, this.externalMessageReferenceId, this.externalConversationId, this.recipientExternalId, this.recipientExternalIdType, this.channel, this.visitorId, this.contact, this.referredContact, this.messageType, this.messageSubType, this.messageCategory, this.messageSendCategory, this.replyingToMessageId, this.replyingToMessageIdExternal, this.responseMessageId, this.followUpType, this.replyType, this.replyTypeId, this.referredProductCatalogId, this.referredProductRetailerId, this.productItems, this.referral, this.isStarred, this.status, this.errorMessages, this.sentAt, this.deliveredAt, this.readAt, this.internalTemplateId, this.externalTemplateId, this.externalTemplateCategory, this.text, this.contactObjectToSend, this.locationObjectToSend, this.adddressMessageParameters, this.headerText, this.footerText, this.headerType, this.actionInteractive, this.buttons, this.parameters, this.media, this.mediaMetadata, this.hasImage, this.thumbnailUrl, this.isInbound, this.chatUserId, this.chatUserName, this.chatBotId, this.chatUserAccountIdIfExternal, this.chatUserAccountNameIfExternal, this.directChatUserId, this.mentioned, this.primaryTeamId, this.linkedEngagementIdIfBroadcast, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep buttons(List<WaButton> list) {
            this.buttons = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep channel(ChatChannel chatChannel) {
            this.channel = chatChannel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep chatBotId(String str) {
            this.chatBotId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep chatUserAccountIdIfExternal(String str) {
            this.chatUserAccountIdIfExternal = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep chatUserAccountNameIfExternal(String str) {
            this.chatUserAccountNameIfExternal = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep chatUserId(String str) {
            this.chatUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep chatUserName(String str) {
            this.chatUserName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep contactObjectToSend(List<String> list) {
            this.contactObjectToSend = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep deliveredAt(Temporal.DateTime dateTime) {
            this.deliveredAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep directChatUserId(String str) {
            this.directChatUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep errorMessages(String str) {
            this.errorMessages = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep externalConversationId(String str) {
            this.externalConversationId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep externalMessageReferenceId(String str) {
            this.externalMessageReferenceId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep externalTemplateCategory(String str) {
            this.externalTemplateCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep externalTemplateId(String str) {
            this.externalTemplateId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep followUpType(String str) {
            this.followUpType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep footerText(String str) {
            this.footerText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep hasImage(Boolean bool) {
            this.hasImage = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep headerText(String str) {
            this.headerText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep headerType(String str) {
            this.headerType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep internalTemplateId(String str) {
            this.internalTemplateId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep isInbound(Boolean bool) {
            this.isInbound = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep isStarred(Boolean bool) {
            this.isStarred = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep linkedEngagementIdIfBroadcast(String str) {
            this.linkedEngagementIdIfBroadcast = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep locationObjectToSend(String str) {
            this.locationObjectToSend = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep media(UploadedFile uploadedFile) {
            this.media = uploadedFile;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep mediaMetadata(String str) {
            this.mediaMetadata = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep mentioned(List<MentionedEntities> list) {
            this.mentioned = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep messageCategory(String str) {
            this.messageCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep messagePlatform(String str) {
            this.messagePlatform = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep messageSendCategory(MessageSendCategory messageSendCategory) {
            this.messageSendCategory = messageSendCategory;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep messageSubType(String str) {
            this.messageSubType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep messageType(String str) {
            this.messageType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep parameters(List<TemplateParameter> list) {
            this.parameters = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep phoneNumberIdExternal(String str) {
            this.phoneNumberIdExternal = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep productItems(List<WaProductItem> list) {
            this.productItems = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep readAt(Temporal.DateTime dateTime) {
            this.readAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep recipientExternalId(String str) {
            this.recipientExternalId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep recipientExternalIdType(String str) {
            this.recipientExternalIdType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep referral(String str) {
            this.referral = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep referredContact(Contact contact) {
            this.referredContact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep referredProductCatalogId(String str) {
            this.referredProductCatalogId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep referredProductRetailerId(String str) {
            this.referredProductRetailerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep replyType(String str) {
            this.replyType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep replyTypeId(String str) {
            this.replyTypeId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep replyingToMessageId(String str) {
            this.replyingToMessageId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep replyingToMessageIdExternal(String str) {
            this.replyingToMessageIdExternal = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep responseMessageId(String str) {
            this.responseMessageId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep sentAt(Temporal.DateTime dateTime) {
            this.sentAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep text(String str) {
            this.text = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep thumbnailUrl(String str) {
            this.thumbnailUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public BuildStep visitorId(String str) {
            this.visitorId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ChatChannel chatChannel, String str9, Contact contact, Contact contact2, String str10, String str11, String str12, MessageSendCategory messageSendCategory, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List<WaProductItem> list, String str21, Boolean bool, String str22, String str23, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str24, String str25, String str26, String str27, List<String> list2, String str28, String str29, String str30, String str31, String str32, ActionInteractive actionInteractive, List<WaButton> list3, List<TemplateParameter> list4, UploadedFile uploadedFile, String str33, Boolean bool2, String str34, Boolean bool3, String str35, String str36, String str37, String str38, String str39, String str40, List<MentionedEntities> list5, String str41, String str42, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5) {
            this.id = str;
            this.accountId = str2;
            this.phoneNumberIdExternal = str3;
            this.messagePlatform = str4;
            this.externalMessageReferenceId = str5;
            this.externalConversationId = str6;
            this.recipientExternalId = str7;
            this.recipientExternalIdType = str8;
            this.channel = chatChannel;
            this.visitorId = str9;
            this.contact = contact;
            this.referredContact = contact2;
            this.messageType = str10;
            this.messageSubType = str11;
            this.messageCategory = str12;
            this.messageSendCategory = messageSendCategory;
            this.replyingToMessageId = str13;
            this.replyingToMessageIdExternal = str14;
            this.responseMessageId = str15;
            this.followUpType = str16;
            this.replyType = str17;
            this.replyTypeId = str18;
            this.referredProductCatalogId = str19;
            this.referredProductRetailerId = str20;
            this.productItems = list;
            this.referral = str21;
            this.isStarred = bool;
            this.status = str22;
            this.errorMessages = str23;
            this.sentAt = dateTime;
            this.deliveredAt = dateTime2;
            this.readAt = dateTime3;
            this.internalTemplateId = str24;
            this.externalTemplateId = str25;
            this.externalTemplateCategory = str26;
            this.text = str27;
            this.contactObjectToSend = list2;
            this.locationObjectToSend = str28;
            this.adddressMessageParameters = str29;
            this.headerText = str30;
            this.footerText = str31;
            this.headerType = str32;
            this.actionInteractive = actionInteractive;
            this.buttons = list3;
            this.parameters = list4;
            this.media = uploadedFile;
            this.mediaMetadata = str33;
            this.hasImage = bool2;
            this.thumbnailUrl = str34;
            this.isInbound = bool3;
            this.chatUserId = str35;
            this.chatUserName = str36;
            this.chatBotId = str37;
            this.chatUserAccountIdIfExternal = str38;
            this.chatUserAccountNameIfExternal = str39;
            this.directChatUserId = str40;
            this.mentioned = list5;
            this.primaryTeamId = str41;
            this.linkedEngagementIdIfBroadcast = str42;
            this.createdAt = dateTime4;
            this.updatedAt = dateTime5;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public /* bridge */ /* synthetic */ BuildStep buttons(List list) {
            return buttons((List<WaButton>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public /* bridge */ /* synthetic */ BuildStep contactObjectToSend(List list) {
            return contactObjectToSend((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public /* bridge */ /* synthetic */ BuildStep mentioned(List list) {
            return mentioned((List<MentionedEntities>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public /* bridge */ /* synthetic */ BuildStep parameters(List list) {
            return parameters((List<TemplateParameter>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public /* bridge */ /* synthetic */ BuildStep productItems(List list) {
            return productItems((List<WaProductItem>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ChatChannel chatChannel, String str9, Contact contact, Contact contact2, String str10, String str11, String str12, MessageSendCategory messageSendCategory, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List<WaProductItem> list, String str21, Boolean bool, String str22, String str23, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str24, String str25, String str26, String str27, List<String> list2, String str28, String str29, String str30, String str31, String str32, ActionInteractive actionInteractive, List<WaButton> list3, List<TemplateParameter> list4, UploadedFile uploadedFile, String str33, Boolean bool2, String str34, Boolean bool3, String str35, String str36, String str37, String str38, String str39, String str40, List<MentionedEntities> list5, String str41, String str42, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5) {
            super(str, str2, str3, str4, str5, str6, str7, str8, chatChannel, str9, contact, contact2, str10, str11, str12, messageSendCategory, str13, str14, str15, str16, str17, str18, str19, str20, list, str21, bool, str22, str23, dateTime, dateTime2, dateTime3, str24, str25, str26, str27, list2, str28, str29, str30, str31, str32, actionInteractive, list3, list4, uploadedFile, str33, bool2, str34, bool3, str35, str36, str37, str38, str39, str40, list5, str41, str42, dateTime4, dateTime5);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder actionInteractive(ActionInteractive actionInteractive) {
            return (CopyOfBuilder) super.actionInteractive(actionInteractive);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder adddressMessageParameters(String str) {
            return (CopyOfBuilder) super.adddressMessageParameters(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder buttons(List<WaButton> list) {
            return (CopyOfBuilder) super.buttons(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder channel(ChatChannel chatChannel) {
            return (CopyOfBuilder) super.channel(chatChannel);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder chatBotId(String str) {
            return (CopyOfBuilder) super.chatBotId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder chatUserAccountIdIfExternal(String str) {
            return (CopyOfBuilder) super.chatUserAccountIdIfExternal(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder chatUserAccountNameIfExternal(String str) {
            return (CopyOfBuilder) super.chatUserAccountNameIfExternal(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder chatUserId(String str) {
            return (CopyOfBuilder) super.chatUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder chatUserName(String str) {
            return (CopyOfBuilder) super.chatUserName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder contactObjectToSend(List<String> list) {
            return (CopyOfBuilder) super.contactObjectToSend(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder deliveredAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.deliveredAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder directChatUserId(String str) {
            return (CopyOfBuilder) super.directChatUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder errorMessages(String str) {
            return (CopyOfBuilder) super.errorMessages(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder externalConversationId(String str) {
            return (CopyOfBuilder) super.externalConversationId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder externalMessageReferenceId(String str) {
            return (CopyOfBuilder) super.externalMessageReferenceId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder externalTemplateCategory(String str) {
            return (CopyOfBuilder) super.externalTemplateCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder externalTemplateId(String str) {
            return (CopyOfBuilder) super.externalTemplateId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder followUpType(String str) {
            return (CopyOfBuilder) super.followUpType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder footerText(String str) {
            return (CopyOfBuilder) super.footerText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder hasImage(Boolean bool) {
            return (CopyOfBuilder) super.hasImage(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder headerText(String str) {
            return (CopyOfBuilder) super.headerText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder headerType(String str) {
            return (CopyOfBuilder) super.headerType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder internalTemplateId(String str) {
            return (CopyOfBuilder) super.internalTemplateId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder isInbound(Boolean bool) {
            return (CopyOfBuilder) super.isInbound(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder isStarred(Boolean bool) {
            return (CopyOfBuilder) super.isStarred(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder linkedEngagementIdIfBroadcast(String str) {
            return (CopyOfBuilder) super.linkedEngagementIdIfBroadcast(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder locationObjectToSend(String str) {
            return (CopyOfBuilder) super.locationObjectToSend(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder media(UploadedFile uploadedFile) {
            return (CopyOfBuilder) super.media(uploadedFile);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder mediaMetadata(String str) {
            return (CopyOfBuilder) super.mediaMetadata(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder mentioned(List<MentionedEntities> list) {
            return (CopyOfBuilder) super.mentioned(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder messageCategory(String str) {
            return (CopyOfBuilder) super.messageCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder messagePlatform(String str) {
            return (CopyOfBuilder) super.messagePlatform(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder messageSendCategory(MessageSendCategory messageSendCategory) {
            return (CopyOfBuilder) super.messageSendCategory(messageSendCategory);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder messageSubType(String str) {
            return (CopyOfBuilder) super.messageSubType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder messageType(String str) {
            return (CopyOfBuilder) super.messageType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder parameters(List<TemplateParameter> list) {
            return (CopyOfBuilder) super.parameters(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder phoneNumberIdExternal(String str) {
            return (CopyOfBuilder) super.phoneNumberIdExternal(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder productItems(List<WaProductItem> list) {
            return (CopyOfBuilder) super.productItems(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder readAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.readAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder recipientExternalId(String str) {
            return (CopyOfBuilder) super.recipientExternalId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder recipientExternalIdType(String str) {
            return (CopyOfBuilder) super.recipientExternalIdType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder referral(String str) {
            return (CopyOfBuilder) super.referral(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder referredContact(Contact contact) {
            return (CopyOfBuilder) super.referredContact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder referredProductCatalogId(String str) {
            return (CopyOfBuilder) super.referredProductCatalogId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder referredProductRetailerId(String str) {
            return (CopyOfBuilder) super.referredProductRetailerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder replyType(String str) {
            return (CopyOfBuilder) super.replyType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder replyTypeId(String str) {
            return (CopyOfBuilder) super.replyTypeId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder replyingToMessageId(String str) {
            return (CopyOfBuilder) super.replyingToMessageId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder replyingToMessageIdExternal(String str) {
            return (CopyOfBuilder) super.replyingToMessageIdExternal(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder responseMessageId(String str) {
            return (CopyOfBuilder) super.responseMessageId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder sentAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.sentAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder text(String str) {
            return (CopyOfBuilder) super.text(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder thumbnailUrl(String str) {
            return (CopyOfBuilder) super.thumbnailUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatMessage.Builder, com.amplifyframework.datastore.generated.model.ChatMessage.BuildStep
        public CopyOfBuilder visitorId(String str) {
            return (CopyOfBuilder) super.visitorId(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ChatMessage justId(String str) {
        return new ChatMessage(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.phoneNumberIdExternal, this.messagePlatform, this.externalMessageReferenceId, this.externalConversationId, this.recipientExternalId, this.recipientExternalIdType, this.channel, this.visitorId, this.contact, this.referredContact, this.messageType, this.messageSubType, this.messageCategory, this.messageSendCategory, this.replyingToMessageId, this.replyingToMessageIdExternal, this.responseMessageId, this.followUpType, this.replyType, this.replyTypeId, this.referredProductCatalogId, this.referredProductRetailerId, this.productItems, this.referral, this.isStarred, this.status, this.errorMessages, this.sentAt, this.deliveredAt, this.readAt, this.internalTemplateId, this.externalTemplateId, this.externalTemplateCategory, this.text, this.contactObjectToSend, this.locationObjectToSend, this.adddressMessageParameters, this.headerText, this.footerText, this.headerType, this.actionInteractive, this.buttons, this.parameters, this.media, this.mediaMetadata, this.hasImage, this.thumbnailUrl, this.isInbound, this.chatUserId, this.chatUserName, this.chatBotId, this.chatUserAccountIdIfExternal, this.chatUserAccountNameIfExternal, this.directChatUserId, this.mentioned, this.primaryTeamId, this.linkedEngagementIdIfBroadcast, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChatMessage.class != obj.getClass()) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) obj;
        return s6c.m47909a(getId(), chatMessage.getId()) && s6c.m47909a(getAccountId(), chatMessage.getAccountId()) && s6c.m47909a(getPhoneNumberIdExternal(), chatMessage.getPhoneNumberIdExternal()) && s6c.m47909a(getMessagePlatform(), chatMessage.getMessagePlatform()) && s6c.m47909a(getExternalMessageReferenceId(), chatMessage.getExternalMessageReferenceId()) && s6c.m47909a(getExternalConversationId(), chatMessage.getExternalConversationId()) && s6c.m47909a(getRecipientExternalId(), chatMessage.getRecipientExternalId()) && s6c.m47909a(getRecipientExternalIdType(), chatMessage.getRecipientExternalIdType()) && s6c.m47909a(getChannel(), chatMessage.getChannel()) && s6c.m47909a(getVisitorId(), chatMessage.getVisitorId()) && s6c.m47909a(getContact(), chatMessage.getContact()) && s6c.m47909a(getReferredContact(), chatMessage.getReferredContact()) && s6c.m47909a(getMessageType(), chatMessage.getMessageType()) && s6c.m47909a(getMessageSubType(), chatMessage.getMessageSubType()) && s6c.m47909a(getMessageCategory(), chatMessage.getMessageCategory()) && s6c.m47909a(getMessageSendCategory(), chatMessage.getMessageSendCategory()) && s6c.m47909a(getReplyingToMessageId(), chatMessage.getReplyingToMessageId()) && s6c.m47909a(getReplyingToMessageIdExternal(), chatMessage.getReplyingToMessageIdExternal()) && s6c.m47909a(getResponseMessageId(), chatMessage.getResponseMessageId()) && s6c.m47909a(getFollowUpType(), chatMessage.getFollowUpType()) && s6c.m47909a(getReplyType(), chatMessage.getReplyType()) && s6c.m47909a(getReplyTypeId(), chatMessage.getReplyTypeId()) && s6c.m47909a(getReferredProductCatalogId(), chatMessage.getReferredProductCatalogId()) && s6c.m47909a(getReferredProductRetailerId(), chatMessage.getReferredProductRetailerId()) && s6c.m47909a(getProductItems(), chatMessage.getProductItems()) && s6c.m47909a(getReferral(), chatMessage.getReferral()) && s6c.m47909a(getIsStarred(), chatMessage.getIsStarred()) && s6c.m47909a(getStatus(), chatMessage.getStatus()) && s6c.m47909a(getErrorMessages(), chatMessage.getErrorMessages()) && s6c.m47909a(getSentAt(), chatMessage.getSentAt()) && s6c.m47909a(getDeliveredAt(), chatMessage.getDeliveredAt()) && s6c.m47909a(getReadAt(), chatMessage.getReadAt()) && s6c.m47909a(getInternalTemplateId(), chatMessage.getInternalTemplateId()) && s6c.m47909a(getExternalTemplateId(), chatMessage.getExternalTemplateId()) && s6c.m47909a(getExternalTemplateCategory(), chatMessage.getExternalTemplateCategory()) && s6c.m47909a(getText(), chatMessage.getText()) && s6c.m47909a(getContactObjectToSend(), chatMessage.getContactObjectToSend()) && s6c.m47909a(getLocationObjectToSend(), chatMessage.getLocationObjectToSend()) && s6c.m47909a(getAdddressMessageParameters(), chatMessage.getAdddressMessageParameters()) && s6c.m47909a(getHeaderText(), chatMessage.getHeaderText()) && s6c.m47909a(getFooterText(), chatMessage.getFooterText()) && s6c.m47909a(getHeaderType(), chatMessage.getHeaderType()) && s6c.m47909a(getActionInteractive(), chatMessage.getActionInteractive()) && s6c.m47909a(getButtons(), chatMessage.getButtons()) && s6c.m47909a(getParameters(), chatMessage.getParameters()) && s6c.m47909a(getMedia(), chatMessage.getMedia()) && s6c.m47909a(getMediaMetadata(), chatMessage.getMediaMetadata()) && s6c.m47909a(getHasImage(), chatMessage.getHasImage()) && s6c.m47909a(getThumbnailUrl(), chatMessage.getThumbnailUrl()) && s6c.m47909a(getIsInbound(), chatMessage.getIsInbound()) && s6c.m47909a(getChatUserId(), chatMessage.getChatUserId()) && s6c.m47909a(getChatUserName(), chatMessage.getChatUserName()) && s6c.m47909a(getChatBotId(), chatMessage.getChatBotId()) && s6c.m47909a(getChatUserAccountIdIfExternal(), chatMessage.getChatUserAccountIdIfExternal()) && s6c.m47909a(getChatUserAccountNameIfExternal(), chatMessage.getChatUserAccountNameIfExternal()) && s6c.m47909a(getDirectChatUserId(), chatMessage.getDirectChatUserId()) && s6c.m47909a(getMentioned(), chatMessage.getMentioned()) && s6c.m47909a(getPrimaryTeamId(), chatMessage.getPrimaryTeamId()) && s6c.m47909a(getLinkedEngagementIdIfBroadcast(), chatMessage.getLinkedEngagementIdIfBroadcast()) && s6c.m47909a(getCreatedAt(), chatMessage.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), chatMessage.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ActionInteractive getActionInteractive() {
        return this.actionInteractive;
    }

    public String getAdddressMessageParameters() {
        return this.adddressMessageParameters;
    }

    public List<WaButton> getButtons() {
        return this.buttons;
    }

    public ChatChannel getChannel() {
        return this.channel;
    }

    public String getChatBotId() {
        return this.chatBotId;
    }

    public User getChatUser() {
        return this.chatUser;
    }

    public String getChatUserAccountIdIfExternal() {
        return this.chatUserAccountIdIfExternal;
    }

    public String getChatUserAccountNameIfExternal() {
        return this.chatUserAccountNameIfExternal;
    }

    public String getChatUserId() {
        return this.chatUserId;
    }

    public String getChatUserName() {
        return this.chatUserName;
    }

    public Contact getContact() {
        return this.contact;
    }

    public List<String> getContactObjectToSend() {
        return this.contactObjectToSend;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Temporal.DateTime getDeliveredAt() {
        return this.deliveredAt;
    }

    public String getDirectChatUserId() {
        return this.directChatUserId;
    }

    public String getErrorMessages() {
        return this.errorMessages;
    }

    public String getExternalConversationId() {
        return this.externalConversationId;
    }

    public String getExternalMessageReferenceId() {
        return this.externalMessageReferenceId;
    }

    public String getExternalTemplateCategory() {
        return this.externalTemplateCategory;
    }

    public String getExternalTemplateId() {
        return this.externalTemplateId;
    }

    public String getFollowUpType() {
        return this.followUpType;
    }

    public String getFooterText() {
        return this.footerText;
    }

    public Boolean getHasImage() {
        return this.hasImage;
    }

    public String getHeaderText() {
        return this.headerText;
    }

    public String getHeaderType() {
        return this.headerType;
    }

    public String getId() {
        return this.id;
    }

    public String getInternalTemplateId() {
        return this.internalTemplateId;
    }

    public Boolean getIsInbound() {
        return this.isInbound;
    }

    public Boolean getIsStarred() {
        return this.isStarred;
    }

    public String getLinkedEngagementIdIfBroadcast() {
        return this.linkedEngagementIdIfBroadcast;
    }

    public String getLocationObjectToSend() {
        return this.locationObjectToSend;
    }

    public UploadedFile getMedia() {
        return this.media;
    }

    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    public List<MentionedEntities> getMentioned() {
        return this.mentioned;
    }

    public String getMessageCategory() {
        return this.messageCategory;
    }

    public String getMessagePlatform() {
        return this.messagePlatform;
    }

    public MessageSendCategory getMessageSendCategory() {
        return this.messageSendCategory;
    }

    public String getMessageSubType() {
        return this.messageSubType;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public List<TemplateParameter> getParameters() {
        return this.parameters;
    }

    public String getPhoneNumberIdExternal() {
        return this.phoneNumberIdExternal;
    }

    public String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public List<WaProductItem> getProductItems() {
        return this.productItems;
    }

    public Temporal.DateTime getReadAt() {
        return this.readAt;
    }

    public String getRecipientExternalId() {
        return this.recipientExternalId;
    }

    public String getRecipientExternalIdType() {
        return this.recipientExternalIdType;
    }

    public String getReferral() {
        return this.referral;
    }

    public Contact getReferredContact() {
        return this.referredContact;
    }

    public String getReferredProductCatalogId() {
        return this.referredProductCatalogId;
    }

    public String getReferredProductRetailerId() {
        return this.referredProductRetailerId;
    }

    public String getReplyType() {
        return this.replyType;
    }

    public String getReplyTypeId() {
        return this.replyTypeId;
    }

    public ChatMessage getReplyingToMessage() {
        return this.replyingToMessage;
    }

    public String getReplyingToMessageId() {
        return this.replyingToMessageId;
    }

    public String getReplyingToMessageIdExternal() {
        return this.replyingToMessageIdExternal;
    }

    public ChatMessage getResponseMessage() {
        return this.responseMessage;
    }

    public String getResponseMessageId() {
        return this.responseMessageId;
    }

    public Temporal.DateTime getSentAt() {
        return this.sentAt;
    }

    public String getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getPhoneNumberIdExternal() + getMessagePlatform() + getExternalMessageReferenceId() + getExternalConversationId() + getRecipientExternalId() + getRecipientExternalIdType() + getChannel() + getVisitorId() + getContact() + getReferredContact() + getMessageType() + getMessageSubType() + getMessageCategory() + getMessageSendCategory() + getReplyingToMessageId() + getReplyingToMessageIdExternal() + getResponseMessageId() + getFollowUpType() + getReplyType() + getReplyTypeId() + getReferredProductCatalogId() + getReferredProductRetailerId() + getProductItems() + getReferral() + getIsStarred() + getStatus() + getErrorMessages() + getSentAt() + getDeliveredAt() + getReadAt() + getInternalTemplateId() + getExternalTemplateId() + getExternalTemplateCategory() + getText() + getContactObjectToSend() + getLocationObjectToSend() + getAdddressMessageParameters() + getHeaderText() + getFooterText() + getHeaderType() + getActionInteractive() + getButtons() + getParameters() + getMedia() + getMediaMetadata() + getHasImage() + getThumbnailUrl() + getIsInbound() + getChatUserId() + getChatUserName() + getChatBotId() + getChatUserAccountIdIfExternal() + getChatUserAccountNameIfExternal() + getDirectChatUserId() + getMentioned() + getPrimaryTeamId() + getLinkedEngagementIdIfBroadcast() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatMessage {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("phoneNumberIdExternal=" + String.valueOf(getPhoneNumberIdExternal()) + ", ");
        sb.append("messagePlatform=" + String.valueOf(getMessagePlatform()) + ", ");
        sb.append("externalMessageReferenceId=" + String.valueOf(getExternalMessageReferenceId()) + ", ");
        sb.append("externalConversationId=" + String.valueOf(getExternalConversationId()) + ", ");
        sb.append("recipientExternalId=" + String.valueOf(getRecipientExternalId()) + ", ");
        sb.append("recipientExternalIdType=" + String.valueOf(getRecipientExternalIdType()) + ", ");
        sb.append("channel=" + String.valueOf(getChannel()) + ", ");
        sb.append("visitorId=" + String.valueOf(getVisitorId()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("referredContact=" + String.valueOf(getReferredContact()) + ", ");
        sb.append("messageType=" + String.valueOf(getMessageType()) + ", ");
        sb.append("messageSubType=" + String.valueOf(getMessageSubType()) + ", ");
        sb.append("messageCategory=" + String.valueOf(getMessageCategory()) + ", ");
        sb.append("messageSendCategory=" + String.valueOf(getMessageSendCategory()) + ", ");
        sb.append("replyingToMessageId=" + String.valueOf(getReplyingToMessageId()) + ", ");
        sb.append("replyingToMessageIdExternal=" + String.valueOf(getReplyingToMessageIdExternal()) + ", ");
        sb.append("responseMessageId=" + String.valueOf(getResponseMessageId()) + ", ");
        sb.append("followUpType=" + String.valueOf(getFollowUpType()) + ", ");
        sb.append("replyType=" + String.valueOf(getReplyType()) + ", ");
        sb.append("replyTypeId=" + String.valueOf(getReplyTypeId()) + ", ");
        sb.append("referredProductCatalogId=" + String.valueOf(getReferredProductCatalogId()) + ", ");
        sb.append("referredProductRetailerId=" + String.valueOf(getReferredProductRetailerId()) + ", ");
        sb.append("productItems=" + String.valueOf(getProductItems()) + ", ");
        sb.append("referral=" + String.valueOf(getReferral()) + ", ");
        sb.append("isStarred=" + String.valueOf(getIsStarred()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("errorMessages=" + String.valueOf(getErrorMessages()) + ", ");
        sb.append("sentAt=" + String.valueOf(getSentAt()) + ", ");
        sb.append("deliveredAt=" + String.valueOf(getDeliveredAt()) + ", ");
        sb.append("readAt=" + String.valueOf(getReadAt()) + ", ");
        sb.append("internalTemplateId=" + String.valueOf(getInternalTemplateId()) + ", ");
        sb.append("externalTemplateId=" + String.valueOf(getExternalTemplateId()) + ", ");
        sb.append("externalTemplateCategory=" + String.valueOf(getExternalTemplateCategory()) + ", ");
        sb.append("text=" + String.valueOf(getText()) + ", ");
        sb.append("contactObjectToSend=" + String.valueOf(getContactObjectToSend()) + ", ");
        sb.append("locationObjectToSend=" + String.valueOf(getLocationObjectToSend()) + ", ");
        sb.append("adddressMessageParameters=" + String.valueOf(getAdddressMessageParameters()) + ", ");
        sb.append("headerText=" + String.valueOf(getHeaderText()) + ", ");
        sb.append("footerText=" + String.valueOf(getFooterText()) + ", ");
        sb.append("headerType=" + String.valueOf(getHeaderType()) + ", ");
        sb.append("actionInteractive=" + String.valueOf(getActionInteractive()) + ", ");
        sb.append("buttons=" + String.valueOf(getButtons()) + ", ");
        sb.append("parameters=" + String.valueOf(getParameters()) + ", ");
        sb.append("media=" + String.valueOf(getMedia()) + ", ");
        sb.append("mediaMetadata=" + String.valueOf(getMediaMetadata()) + ", ");
        sb.append("hasImage=" + String.valueOf(getHasImage()) + ", ");
        sb.append("thumbnailUrl=" + String.valueOf(getThumbnailUrl()) + ", ");
        sb.append("isInbound=" + String.valueOf(getIsInbound()) + ", ");
        sb.append("chatUserId=" + String.valueOf(getChatUserId()) + ", ");
        sb.append("chatUserName=" + String.valueOf(getChatUserName()) + ", ");
        sb.append("chatBotId=" + String.valueOf(getChatBotId()) + ", ");
        sb.append("chatUserAccountIdIfExternal=" + String.valueOf(getChatUserAccountIdIfExternal()) + ", ");
        sb.append("chatUserAccountNameIfExternal=" + String.valueOf(getChatUserAccountNameIfExternal()) + ", ");
        sb.append("directChatUserId=" + String.valueOf(getDirectChatUserId()) + ", ");
        sb.append("mentioned=" + String.valueOf(getMentioned()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("linkedEngagementIdIfBroadcast=" + String.valueOf(getLinkedEngagementIdIfBroadcast()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ChatMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ChatChannel chatChannel, String str9, Contact contact, Contact contact2, String str10, String str11, String str12, MessageSendCategory messageSendCategory, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List<WaProductItem> list, String str21, Boolean bool, String str22, String str23, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str24, String str25, String str26, String str27, List<String> list2, String str28, String str29, String str30, String str31, String str32, ActionInteractive actionInteractive, List<WaButton> list3, List<TemplateParameter> list4, UploadedFile uploadedFile, String str33, Boolean bool2, String str34, Boolean bool3, String str35, String str36, String str37, String str38, String str39, String str40, List<MentionedEntities> list5, String str41, String str42, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5) {
        this.replyingToMessage = null;
        this.responseMessage = null;
        this.chatUser = null;
        this.id = str;
        this.accountId = str2;
        this.phoneNumberIdExternal = str3;
        this.messagePlatform = str4;
        this.externalMessageReferenceId = str5;
        this.externalConversationId = str6;
        this.recipientExternalId = str7;
        this.recipientExternalIdType = str8;
        this.channel = chatChannel;
        this.visitorId = str9;
        this.contact = contact;
        this.referredContact = contact2;
        this.messageType = str10;
        this.messageSubType = str11;
        this.messageCategory = str12;
        this.messageSendCategory = messageSendCategory;
        this.replyingToMessageId = str13;
        this.replyingToMessageIdExternal = str14;
        this.responseMessageId = str15;
        this.followUpType = str16;
        this.replyType = str17;
        this.replyTypeId = str18;
        this.referredProductCatalogId = str19;
        this.referredProductRetailerId = str20;
        this.productItems = list;
        this.referral = str21;
        this.isStarred = bool;
        this.status = str22;
        this.errorMessages = str23;
        this.sentAt = dateTime;
        this.deliveredAt = dateTime2;
        this.readAt = dateTime3;
        this.internalTemplateId = str24;
        this.externalTemplateId = str25;
        this.externalTemplateCategory = str26;
        this.text = str27;
        this.contactObjectToSend = list2;
        this.locationObjectToSend = str28;
        this.adddressMessageParameters = str29;
        this.headerText = str30;
        this.footerText = str31;
        this.headerType = str32;
        this.actionInteractive = actionInteractive;
        this.buttons = list3;
        this.parameters = list4;
        this.media = uploadedFile;
        this.mediaMetadata = str33;
        this.hasImage = bool2;
        this.thumbnailUrl = str34;
        this.isInbound = bool3;
        this.chatUserId = str35;
        this.chatUserName = str36;
        this.chatBotId = str37;
        this.chatUserAccountIdIfExternal = str38;
        this.chatUserAccountNameIfExternal = str39;
        this.directChatUserId = str40;
        this.mentioned = list5;
        this.primaryTeamId = str41;
        this.linkedEngagementIdIfBroadcast = str42;
        this.createdAt = dateTime4;
        this.updatedAt = dateTime5;
    }
}
