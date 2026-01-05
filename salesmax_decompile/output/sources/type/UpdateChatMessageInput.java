package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateChatMessageInput implements InputType {
    private final Input<String> accountId;
    private final Input<ActionInteractiveInput> actionInteractive;
    private final Input<String> adddressMessageParameters;
    private final Input<List<WaButtonInput>> buttons;
    private final Input<String> channelId;
    private final Input<String> chatBotId;
    private final Input<String> chatUserAccountIdIfExternal;
    private final Input<String> chatUserAccountNameIfExternal;
    private final Input<String> chatUserId;
    private final Input<String> chatUserName;
    private final Input<String> contactId;
    private final Input<List<String>> contactObjectToSend;
    private final Input<String> createdAt;
    private final Input<String> deliveredAt;
    private final Input<String> directChatUserId;
    private final Input<String> errorMessages;
    private final Input<String> externalConversationId;
    private final Input<String> externalMessageReferenceId;
    private final Input<String> externalTemplateCategory;
    private final Input<String> externalTemplateId;
    private final Input<String> followUpType;
    private final Input<String> footerText;
    private final Input<Boolean> hasImage;
    private final Input<String> headerText;
    private final Input<String> headerType;
    private final String id;
    private final Input<String> internalTemplateId;
    private final Input<Boolean> isInbound;
    private final Input<Boolean> isStarred;
    private final Input<String> linkedEngagementIdIfBroadcast;
    private final Input<String> locationObjectToSend;
    private final Input<String> mediaMetadata;
    private final Input<String> mediaObjectId;
    private final Input<List<MentionedEntitiesInput>> mentioned;
    private final Input<String> messageCategory;
    private final Input<String> messagePlatform;
    private final Input<MessageSendCategory> messageSendCategory;
    private final Input<String> messageSubType;
    private final Input<String> messageType;
    private final Input<List<TemplateParameterInput>> parameters;
    private final Input<String> phoneNumberIdExternal;
    private final Input<String> primaryTeamId;
    private final Input<List<WaProductItemInput>> productItems;
    private final Input<String> readAt;
    private final Input<String> recipientExternalId;
    private final Input<String> recipientExternalIdType;
    private final Input<String> referral;
    private final Input<String> referredContactId;
    private final Input<String> referredProductCatalogId;
    private final Input<String> referredProductRetailerId;
    private final Input<String> replyType;
    private final Input<String> replyTypeId;
    private final Input<String> replyingToMessageId;
    private final Input<String> replyingToMessageIdExternal;
    private final Input<String> responseMessageId;
    private final Input<String> sentAt;
    private final Input<String> status;
    private final Input<String> text;
    private final Input<String> thumbnailUrl;
    private final Input<String> updatedAt;
    private final Input<String> visitorId;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> phoneNumberIdExternal = Input.absent();
        private Input<String> messagePlatform = Input.absent();
        private Input<String> externalMessageReferenceId = Input.absent();
        private Input<String> externalConversationId = Input.absent();
        private Input<String> recipientExternalId = Input.absent();
        private Input<String> recipientExternalIdType = Input.absent();
        private Input<String> channelId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> visitorId = Input.absent();
        private Input<String> referredContactId = Input.absent();
        private Input<String> messageType = Input.absent();
        private Input<String> messageSubType = Input.absent();
        private Input<String> messageCategory = Input.absent();
        private Input<MessageSendCategory> messageSendCategory = Input.absent();
        private Input<String> replyingToMessageId = Input.absent();
        private Input<String> replyingToMessageIdExternal = Input.absent();
        private Input<String> responseMessageId = Input.absent();
        private Input<String> followUpType = Input.absent();
        private Input<String> replyType = Input.absent();
        private Input<String> replyTypeId = Input.absent();
        private Input<String> referredProductCatalogId = Input.absent();
        private Input<String> referredProductRetailerId = Input.absent();
        private Input<List<WaProductItemInput>> productItems = Input.absent();
        private Input<String> referral = Input.absent();
        private Input<Boolean> isStarred = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> errorMessages = Input.absent();
        private Input<String> sentAt = Input.absent();
        private Input<String> deliveredAt = Input.absent();
        private Input<String> readAt = Input.absent();
        private Input<String> internalTemplateId = Input.absent();
        private Input<String> externalTemplateId = Input.absent();
        private Input<String> externalTemplateCategory = Input.absent();
        private Input<String> text = Input.absent();
        private Input<List<String>> contactObjectToSend = Input.absent();
        private Input<String> locationObjectToSend = Input.absent();
        private Input<String> adddressMessageParameters = Input.absent();
        private Input<String> headerText = Input.absent();
        private Input<String> footerText = Input.absent();
        private Input<String> headerType = Input.absent();
        private Input<ActionInteractiveInput> actionInteractive = Input.absent();
        private Input<List<WaButtonInput>> buttons = Input.absent();
        private Input<List<TemplateParameterInput>> parameters = Input.absent();
        private Input<String> mediaObjectId = Input.absent();
        private Input<String> mediaMetadata = Input.absent();
        private Input<Boolean> hasImage = Input.absent();
        private Input<String> thumbnailUrl = Input.absent();
        private Input<Boolean> isInbound = Input.absent();
        private Input<String> chatUserId = Input.absent();
        private Input<String> chatUserName = Input.absent();
        private Input<String> chatBotId = Input.absent();
        private Input<String> chatUserAccountIdIfExternal = Input.absent();
        private Input<String> chatUserAccountNameIfExternal = Input.absent();
        private Input<String> directChatUserId = Input.absent();
        private Input<List<MentionedEntitiesInput>> mentioned = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> linkedEngagementIdIfBroadcast = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder actionInteractive(ActionInteractiveInput actionInteractiveInput) {
            this.actionInteractive = Input.fromNullable(actionInteractiveInput);
            return this;
        }

        public Builder adddressMessageParameters(String str) {
            this.adddressMessageParameters = Input.fromNullable(str);
            return this;
        }

        public UpdateChatMessageInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateChatMessageInput(this.id, this.accountId, this.phoneNumberIdExternal, this.messagePlatform, this.externalMessageReferenceId, this.externalConversationId, this.recipientExternalId, this.recipientExternalIdType, this.channelId, this.contactId, this.visitorId, this.referredContactId, this.messageType, this.messageSubType, this.messageCategory, this.messageSendCategory, this.replyingToMessageId, this.replyingToMessageIdExternal, this.responseMessageId, this.followUpType, this.replyType, this.replyTypeId, this.referredProductCatalogId, this.referredProductRetailerId, this.productItems, this.referral, this.isStarred, this.status, this.errorMessages, this.sentAt, this.deliveredAt, this.readAt, this.internalTemplateId, this.externalTemplateId, this.externalTemplateCategory, this.text, this.contactObjectToSend, this.locationObjectToSend, this.adddressMessageParameters, this.headerText, this.footerText, this.headerType, this.actionInteractive, this.buttons, this.parameters, this.mediaObjectId, this.mediaMetadata, this.hasImage, this.thumbnailUrl, this.isInbound, this.chatUserId, this.chatUserName, this.chatBotId, this.chatUserAccountIdIfExternal, this.chatUserAccountNameIfExternal, this.directChatUserId, this.mentioned, this.primaryTeamId, this.linkedEngagementIdIfBroadcast, this.createdAt, this.updatedAt);
        }

        public Builder buttons(List<WaButtonInput> list) {
            this.buttons = Input.fromNullable(list);
            return this;
        }

        public Builder channelId(String str) {
            this.channelId = Input.fromNullable(str);
            return this;
        }

        public Builder chatBotId(String str) {
            this.chatBotId = Input.fromNullable(str);
            return this;
        }

        public Builder chatUserAccountIdIfExternal(String str) {
            this.chatUserAccountIdIfExternal = Input.fromNullable(str);
            return this;
        }

        public Builder chatUserAccountNameIfExternal(String str) {
            this.chatUserAccountNameIfExternal = Input.fromNullable(str);
            return this;
        }

        public Builder chatUserId(String str) {
            this.chatUserId = Input.fromNullable(str);
            return this;
        }

        public Builder chatUserName(String str) {
            this.chatUserName = Input.fromNullable(str);
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder contactObjectToSend(List<String> list) {
            this.contactObjectToSend = Input.fromNullable(list);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder deliveredAt(String str) {
            this.deliveredAt = Input.fromNullable(str);
            return this;
        }

        public Builder directChatUserId(String str) {
            this.directChatUserId = Input.fromNullable(str);
            return this;
        }

        public Builder errorMessages(String str) {
            this.errorMessages = Input.fromNullable(str);
            return this;
        }

        public Builder externalConversationId(String str) {
            this.externalConversationId = Input.fromNullable(str);
            return this;
        }

        public Builder externalMessageReferenceId(String str) {
            this.externalMessageReferenceId = Input.fromNullable(str);
            return this;
        }

        public Builder externalTemplateCategory(String str) {
            this.externalTemplateCategory = Input.fromNullable(str);
            return this;
        }

        public Builder externalTemplateId(String str) {
            this.externalTemplateId = Input.fromNullable(str);
            return this;
        }

        public Builder followUpType(String str) {
            this.followUpType = Input.fromNullable(str);
            return this;
        }

        public Builder footerText(String str) {
            this.footerText = Input.fromNullable(str);
            return this;
        }

        public Builder hasImage(Boolean bool) {
            this.hasImage = Input.fromNullable(bool);
            return this;
        }

        public Builder headerText(String str) {
            this.headerText = Input.fromNullable(str);
            return this;
        }

        public Builder headerType(String str) {
            this.headerType = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder internalTemplateId(String str) {
            this.internalTemplateId = Input.fromNullable(str);
            return this;
        }

        public Builder isInbound(Boolean bool) {
            this.isInbound = Input.fromNullable(bool);
            return this;
        }

        public Builder isStarred(Boolean bool) {
            this.isStarred = Input.fromNullable(bool);
            return this;
        }

        public Builder linkedEngagementIdIfBroadcast(String str) {
            this.linkedEngagementIdIfBroadcast = Input.fromNullable(str);
            return this;
        }

        public Builder locationObjectToSend(String str) {
            this.locationObjectToSend = Input.fromNullable(str);
            return this;
        }

        public Builder mediaMetadata(String str) {
            this.mediaMetadata = Input.fromNullable(str);
            return this;
        }

        public Builder mediaObjectId(String str) {
            this.mediaObjectId = Input.fromNullable(str);
            return this;
        }

        public Builder mentioned(List<MentionedEntitiesInput> list) {
            this.mentioned = Input.fromNullable(list);
            return this;
        }

        public Builder messageCategory(String str) {
            this.messageCategory = Input.fromNullable(str);
            return this;
        }

        public Builder messagePlatform(String str) {
            this.messagePlatform = Input.fromNullable(str);
            return this;
        }

        public Builder messageSendCategory(MessageSendCategory messageSendCategory) {
            this.messageSendCategory = Input.fromNullable(messageSendCategory);
            return this;
        }

        public Builder messageSubType(String str) {
            this.messageSubType = Input.fromNullable(str);
            return this;
        }

        public Builder messageType(String str) {
            this.messageType = Input.fromNullable(str);
            return this;
        }

        public Builder parameters(List<TemplateParameterInput> list) {
            this.parameters = Input.fromNullable(list);
            return this;
        }

        public Builder phoneNumberIdExternal(String str) {
            this.phoneNumberIdExternal = Input.fromNullable(str);
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder productItems(List<WaProductItemInput> list) {
            this.productItems = Input.fromNullable(list);
            return this;
        }

        public Builder readAt(String str) {
            this.readAt = Input.fromNullable(str);
            return this;
        }

        public Builder recipientExternalId(String str) {
            this.recipientExternalId = Input.fromNullable(str);
            return this;
        }

        public Builder recipientExternalIdType(String str) {
            this.recipientExternalIdType = Input.fromNullable(str);
            return this;
        }

        public Builder referral(String str) {
            this.referral = Input.fromNullable(str);
            return this;
        }

        public Builder referredContactId(String str) {
            this.referredContactId = Input.fromNullable(str);
            return this;
        }

        public Builder referredProductCatalogId(String str) {
            this.referredProductCatalogId = Input.fromNullable(str);
            return this;
        }

        public Builder referredProductRetailerId(String str) {
            this.referredProductRetailerId = Input.fromNullable(str);
            return this;
        }

        public Builder replyType(String str) {
            this.replyType = Input.fromNullable(str);
            return this;
        }

        public Builder replyTypeId(String str) {
            this.replyTypeId = Input.fromNullable(str);
            return this;
        }

        public Builder replyingToMessageId(String str) {
            this.replyingToMessageId = Input.fromNullable(str);
            return this;
        }

        public Builder replyingToMessageIdExternal(String str) {
            this.replyingToMessageIdExternal = Input.fromNullable(str);
            return this;
        }

        public Builder responseMessageId(String str) {
            this.responseMessageId = Input.fromNullable(str);
            return this;
        }

        public Builder sentAt(String str) {
            this.sentAt = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder text(String str) {
            this.text = Input.fromNullable(str);
            return this;
        }

        public Builder thumbnailUrl(String str) {
            this.thumbnailUrl = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder visitorId(String str) {
            this.visitorId = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateChatMessageInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<MessageSendCategory> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<List<WaProductItemInput>> input24, Input<String> input25, Input<Boolean> input26, Input<String> input27, Input<String> input28, Input<String> input29, Input<String> input30, Input<String> input31, Input<String> input32, Input<String> input33, Input<String> input34, Input<String> input35, Input<List<String>> input36, Input<String> input37, Input<String> input38, Input<String> input39, Input<String> input40, Input<String> input41, Input<ActionInteractiveInput> input42, Input<List<WaButtonInput>> input43, Input<List<TemplateParameterInput>> input44, Input<String> input45, Input<String> input46, Input<Boolean> input47, Input<String> input48, Input<Boolean> input49, Input<String> input50, Input<String> input51, Input<String> input52, Input<String> input53, Input<String> input54, Input<String> input55, Input<List<MentionedEntitiesInput>> input56, Input<String> input57, Input<String> input58, Input<String> input59, Input<String> input60) {
        this.id = str;
        this.accountId = input;
        this.phoneNumberIdExternal = input2;
        this.messagePlatform = input3;
        this.externalMessageReferenceId = input4;
        this.externalConversationId = input5;
        this.recipientExternalId = input6;
        this.recipientExternalIdType = input7;
        this.channelId = input8;
        this.contactId = input9;
        this.visitorId = input10;
        this.referredContactId = input11;
        this.messageType = input12;
        this.messageSubType = input13;
        this.messageCategory = input14;
        this.messageSendCategory = input15;
        this.replyingToMessageId = input16;
        this.replyingToMessageIdExternal = input17;
        this.responseMessageId = input18;
        this.followUpType = input19;
        this.replyType = input20;
        this.replyTypeId = input21;
        this.referredProductCatalogId = input22;
        this.referredProductRetailerId = input23;
        this.productItems = input24;
        this.referral = input25;
        this.isStarred = input26;
        this.status = input27;
        this.errorMessages = input28;
        this.sentAt = input29;
        this.deliveredAt = input30;
        this.readAt = input31;
        this.internalTemplateId = input32;
        this.externalTemplateId = input33;
        this.externalTemplateCategory = input34;
        this.text = input35;
        this.contactObjectToSend = input36;
        this.locationObjectToSend = input37;
        this.adddressMessageParameters = input38;
        this.headerText = input39;
        this.footerText = input40;
        this.headerType = input41;
        this.actionInteractive = input42;
        this.buttons = input43;
        this.parameters = input44;
        this.mediaObjectId = input45;
        this.mediaMetadata = input46;
        this.hasImage = input47;
        this.thumbnailUrl = input48;
        this.isInbound = input49;
        this.chatUserId = input50;
        this.chatUserName = input51;
        this.chatBotId = input52;
        this.chatUserAccountIdIfExternal = input53;
        this.chatUserAccountNameIfExternal = input54;
        this.directChatUserId = input55;
        this.mentioned = input56;
        this.primaryTeamId = input57;
        this.linkedEngagementIdIfBroadcast = input58;
        this.createdAt = input59;
        this.updatedAt = input60;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public ActionInteractiveInput actionInteractive() {
        return this.actionInteractive.value;
    }

    public String adddressMessageParameters() {
        return this.adddressMessageParameters.value;
    }

    public List<WaButtonInput> buttons() {
        return this.buttons.value;
    }

    public String channelId() {
        return this.channelId.value;
    }

    public String chatBotId() {
        return this.chatBotId.value;
    }

    public String chatUserAccountIdIfExternal() {
        return this.chatUserAccountIdIfExternal.value;
    }

    public String chatUserAccountNameIfExternal() {
        return this.chatUserAccountNameIfExternal.value;
    }

    public String chatUserId() {
        return this.chatUserId.value;
    }

    public String chatUserName() {
        return this.chatUserName.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public List<String> contactObjectToSend() {
        return this.contactObjectToSend.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String deliveredAt() {
        return this.deliveredAt.value;
    }

    public String directChatUserId() {
        return this.directChatUserId.value;
    }

    public String errorMessages() {
        return this.errorMessages.value;
    }

    public String externalConversationId() {
        return this.externalConversationId.value;
    }

    public String externalMessageReferenceId() {
        return this.externalMessageReferenceId.value;
    }

    public String externalTemplateCategory() {
        return this.externalTemplateCategory.value;
    }

    public String externalTemplateId() {
        return this.externalTemplateId.value;
    }

    public String followUpType() {
        return this.followUpType.value;
    }

    public String footerText() {
        return this.footerText.value;
    }

    public Boolean hasImage() {
        return this.hasImage.value;
    }

    public String headerText() {
        return this.headerText.value;
    }

    public String headerType() {
        return this.headerType.value;
    }

    public String id() {
        return this.id;
    }

    public String internalTemplateId() {
        return this.internalTemplateId.value;
    }

    public Boolean isInbound() {
        return this.isInbound.value;
    }

    public Boolean isStarred() {
        return this.isStarred.value;
    }

    public String linkedEngagementIdIfBroadcast() {
        return this.linkedEngagementIdIfBroadcast.value;
    }

    public String locationObjectToSend() {
        return this.locationObjectToSend.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateChatMessageInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateChatMessageInput.this.id);
                if (UpdateChatMessageInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateChatMessageInput.this.accountId.value);
                }
                if (UpdateChatMessageInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeString("phoneNumberIdExternal", (String) UpdateChatMessageInput.this.phoneNumberIdExternal.value);
                }
                if (UpdateChatMessageInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeString("messagePlatform", (String) UpdateChatMessageInput.this.messagePlatform.value);
                }
                if (UpdateChatMessageInput.this.externalMessageReferenceId.defined) {
                    inputFieldWriter.writeString("externalMessageReferenceId", (String) UpdateChatMessageInput.this.externalMessageReferenceId.value);
                }
                if (UpdateChatMessageInput.this.externalConversationId.defined) {
                    inputFieldWriter.writeString("externalConversationId", (String) UpdateChatMessageInput.this.externalConversationId.value);
                }
                if (UpdateChatMessageInput.this.recipientExternalId.defined) {
                    inputFieldWriter.writeString("recipientExternalId", (String) UpdateChatMessageInput.this.recipientExternalId.value);
                }
                if (UpdateChatMessageInput.this.recipientExternalIdType.defined) {
                    inputFieldWriter.writeString("recipientExternalIdType", (String) UpdateChatMessageInput.this.recipientExternalIdType.value);
                }
                if (UpdateChatMessageInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) UpdateChatMessageInput.this.channelId.value);
                }
                if (UpdateChatMessageInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateChatMessageInput.this.contactId.value);
                }
                if (UpdateChatMessageInput.this.visitorId.defined) {
                    inputFieldWriter.writeString("visitorId", (String) UpdateChatMessageInput.this.visitorId.value);
                }
                if (UpdateChatMessageInput.this.referredContactId.defined) {
                    inputFieldWriter.writeString("referredContactId", (String) UpdateChatMessageInput.this.referredContactId.value);
                }
                if (UpdateChatMessageInput.this.messageType.defined) {
                    inputFieldWriter.writeString("messageType", (String) UpdateChatMessageInput.this.messageType.value);
                }
                if (UpdateChatMessageInput.this.messageSubType.defined) {
                    inputFieldWriter.writeString("messageSubType", (String) UpdateChatMessageInput.this.messageSubType.value);
                }
                if (UpdateChatMessageInput.this.messageCategory.defined) {
                    inputFieldWriter.writeString("messageCategory", (String) UpdateChatMessageInput.this.messageCategory.value);
                }
                if (UpdateChatMessageInput.this.messageSendCategory.defined) {
                    inputFieldWriter.writeString("messageSendCategory", UpdateChatMessageInput.this.messageSendCategory.value != 0 ? ((MessageSendCategory) UpdateChatMessageInput.this.messageSendCategory.value).name() : null);
                }
                if (UpdateChatMessageInput.this.replyingToMessageId.defined) {
                    inputFieldWriter.writeString("replyingToMessageId", (String) UpdateChatMessageInput.this.replyingToMessageId.value);
                }
                if (UpdateChatMessageInput.this.replyingToMessageIdExternal.defined) {
                    inputFieldWriter.writeString("replyingToMessageIdExternal", (String) UpdateChatMessageInput.this.replyingToMessageIdExternal.value);
                }
                if (UpdateChatMessageInput.this.responseMessageId.defined) {
                    inputFieldWriter.writeString("responseMessageId", (String) UpdateChatMessageInput.this.responseMessageId.value);
                }
                if (UpdateChatMessageInput.this.followUpType.defined) {
                    inputFieldWriter.writeString("followUpType", (String) UpdateChatMessageInput.this.followUpType.value);
                }
                if (UpdateChatMessageInput.this.replyType.defined) {
                    inputFieldWriter.writeString("replyType", (String) UpdateChatMessageInput.this.replyType.value);
                }
                if (UpdateChatMessageInput.this.replyTypeId.defined) {
                    inputFieldWriter.writeString("replyTypeId", (String) UpdateChatMessageInput.this.replyTypeId.value);
                }
                if (UpdateChatMessageInput.this.referredProductCatalogId.defined) {
                    inputFieldWriter.writeString("referredProductCatalogId", (String) UpdateChatMessageInput.this.referredProductCatalogId.value);
                }
                if (UpdateChatMessageInput.this.referredProductRetailerId.defined) {
                    inputFieldWriter.writeString("referredProductRetailerId", (String) UpdateChatMessageInput.this.referredProductRetailerId.value);
                }
                if (UpdateChatMessageInput.this.productItems.defined) {
                    inputFieldWriter.writeList("productItems", UpdateChatMessageInput.this.productItems.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateChatMessageInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateChatMessageInput.this.productItems.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((WaProductItemInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateChatMessageInput.this.referral.defined) {
                    inputFieldWriter.writeString("referral", (String) UpdateChatMessageInput.this.referral.value);
                }
                if (UpdateChatMessageInput.this.isStarred.defined) {
                    inputFieldWriter.writeBoolean("isStarred", (Boolean) UpdateChatMessageInput.this.isStarred.value);
                }
                if (UpdateChatMessageInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateChatMessageInput.this.status.value);
                }
                if (UpdateChatMessageInput.this.errorMessages.defined) {
                    inputFieldWriter.writeString("errorMessages", (String) UpdateChatMessageInput.this.errorMessages.value);
                }
                if (UpdateChatMessageInput.this.sentAt.defined) {
                    inputFieldWriter.writeString("sentAt", (String) UpdateChatMessageInput.this.sentAt.value);
                }
                if (UpdateChatMessageInput.this.deliveredAt.defined) {
                    inputFieldWriter.writeString("deliveredAt", (String) UpdateChatMessageInput.this.deliveredAt.value);
                }
                if (UpdateChatMessageInput.this.readAt.defined) {
                    inputFieldWriter.writeString("readAt", (String) UpdateChatMessageInput.this.readAt.value);
                }
                if (UpdateChatMessageInput.this.internalTemplateId.defined) {
                    inputFieldWriter.writeString("internalTemplateId", (String) UpdateChatMessageInput.this.internalTemplateId.value);
                }
                if (UpdateChatMessageInput.this.externalTemplateId.defined) {
                    inputFieldWriter.writeString("externalTemplateId", (String) UpdateChatMessageInput.this.externalTemplateId.value);
                }
                if (UpdateChatMessageInput.this.externalTemplateCategory.defined) {
                    inputFieldWriter.writeString("externalTemplateCategory", (String) UpdateChatMessageInput.this.externalTemplateCategory.value);
                }
                if (UpdateChatMessageInput.this.text.defined) {
                    inputFieldWriter.writeString("text", (String) UpdateChatMessageInput.this.text.value);
                }
                if (UpdateChatMessageInput.this.contactObjectToSend.defined) {
                    inputFieldWriter.writeList("contactObjectToSend", UpdateChatMessageInput.this.contactObjectToSend.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateChatMessageInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateChatMessageInput.this.contactObjectToSend.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSJSON, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateChatMessageInput.this.locationObjectToSend.defined) {
                    inputFieldWriter.writeString("locationObjectToSend", (String) UpdateChatMessageInput.this.locationObjectToSend.value);
                }
                if (UpdateChatMessageInput.this.adddressMessageParameters.defined) {
                    inputFieldWriter.writeString("adddressMessageParameters", (String) UpdateChatMessageInput.this.adddressMessageParameters.value);
                }
                if (UpdateChatMessageInput.this.headerText.defined) {
                    inputFieldWriter.writeString("headerText", (String) UpdateChatMessageInput.this.headerText.value);
                }
                if (UpdateChatMessageInput.this.footerText.defined) {
                    inputFieldWriter.writeString("footerText", (String) UpdateChatMessageInput.this.footerText.value);
                }
                if (UpdateChatMessageInput.this.headerType.defined) {
                    inputFieldWriter.writeString("headerType", (String) UpdateChatMessageInput.this.headerType.value);
                }
                if (UpdateChatMessageInput.this.actionInteractive.defined) {
                    inputFieldWriter.writeObject("actionInteractive", UpdateChatMessageInput.this.actionInteractive.value != 0 ? ((ActionInteractiveInput) UpdateChatMessageInput.this.actionInteractive.value).marshaller() : null);
                }
                if (UpdateChatMessageInput.this.buttons.defined) {
                    inputFieldWriter.writeList("buttons", UpdateChatMessageInput.this.buttons.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateChatMessageInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateChatMessageInput.this.buttons.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((WaButtonInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateChatMessageInput.this.parameters.defined) {
                    inputFieldWriter.writeList("parameters", UpdateChatMessageInput.this.parameters.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateChatMessageInput.1.4
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateChatMessageInput.this.parameters.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TemplateParameterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateChatMessageInput.this.mediaObjectId.defined) {
                    inputFieldWriter.writeString("mediaObjectId", (String) UpdateChatMessageInput.this.mediaObjectId.value);
                }
                if (UpdateChatMessageInput.this.mediaMetadata.defined) {
                    inputFieldWriter.writeString("mediaMetadata", (String) UpdateChatMessageInput.this.mediaMetadata.value);
                }
                if (UpdateChatMessageInput.this.hasImage.defined) {
                    inputFieldWriter.writeBoolean("hasImage", (Boolean) UpdateChatMessageInput.this.hasImage.value);
                }
                if (UpdateChatMessageInput.this.thumbnailUrl.defined) {
                    inputFieldWriter.writeString("thumbnailUrl", (String) UpdateChatMessageInput.this.thumbnailUrl.value);
                }
                if (UpdateChatMessageInput.this.isInbound.defined) {
                    inputFieldWriter.writeBoolean("isInbound", (Boolean) UpdateChatMessageInput.this.isInbound.value);
                }
                if (UpdateChatMessageInput.this.chatUserId.defined) {
                    inputFieldWriter.writeString("chatUserId", (String) UpdateChatMessageInput.this.chatUserId.value);
                }
                if (UpdateChatMessageInput.this.chatUserName.defined) {
                    inputFieldWriter.writeString("chatUserName", (String) UpdateChatMessageInput.this.chatUserName.value);
                }
                if (UpdateChatMessageInput.this.chatBotId.defined) {
                    inputFieldWriter.writeString("chatBotId", (String) UpdateChatMessageInput.this.chatBotId.value);
                }
                if (UpdateChatMessageInput.this.chatUserAccountIdIfExternal.defined) {
                    inputFieldWriter.writeString("chatUserAccountIdIfExternal", (String) UpdateChatMessageInput.this.chatUserAccountIdIfExternal.value);
                }
                if (UpdateChatMessageInput.this.chatUserAccountNameIfExternal.defined) {
                    inputFieldWriter.writeString("chatUserAccountNameIfExternal", (String) UpdateChatMessageInput.this.chatUserAccountNameIfExternal.value);
                }
                if (UpdateChatMessageInput.this.directChatUserId.defined) {
                    inputFieldWriter.writeString("directChatUserId", (String) UpdateChatMessageInput.this.directChatUserId.value);
                }
                if (UpdateChatMessageInput.this.mentioned.defined) {
                    inputFieldWriter.writeList("mentioned", UpdateChatMessageInput.this.mentioned.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateChatMessageInput.1.5
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateChatMessageInput.this.mentioned.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MentionedEntitiesInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateChatMessageInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) UpdateChatMessageInput.this.primaryTeamId.value);
                }
                if (UpdateChatMessageInput.this.linkedEngagementIdIfBroadcast.defined) {
                    inputFieldWriter.writeString("linkedEngagementIdIfBroadcast", (String) UpdateChatMessageInput.this.linkedEngagementIdIfBroadcast.value);
                }
                if (UpdateChatMessageInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateChatMessageInput.this.createdAt.value);
                }
                if (UpdateChatMessageInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateChatMessageInput.this.updatedAt.value);
                }
            }
        };
    }

    public String mediaMetadata() {
        return this.mediaMetadata.value;
    }

    public String mediaObjectId() {
        return this.mediaObjectId.value;
    }

    public List<MentionedEntitiesInput> mentioned() {
        return this.mentioned.value;
    }

    public String messageCategory() {
        return this.messageCategory.value;
    }

    public String messagePlatform() {
        return this.messagePlatform.value;
    }

    public MessageSendCategory messageSendCategory() {
        return this.messageSendCategory.value;
    }

    public String messageSubType() {
        return this.messageSubType.value;
    }

    public String messageType() {
        return this.messageType.value;
    }

    public List<TemplateParameterInput> parameters() {
        return this.parameters.value;
    }

    public String phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public List<WaProductItemInput> productItems() {
        return this.productItems.value;
    }

    public String readAt() {
        return this.readAt.value;
    }

    public String recipientExternalId() {
        return this.recipientExternalId.value;
    }

    public String recipientExternalIdType() {
        return this.recipientExternalIdType.value;
    }

    public String referral() {
        return this.referral.value;
    }

    public String referredContactId() {
        return this.referredContactId.value;
    }

    public String referredProductCatalogId() {
        return this.referredProductCatalogId.value;
    }

    public String referredProductRetailerId() {
        return this.referredProductRetailerId.value;
    }

    public String replyType() {
        return this.replyType.value;
    }

    public String replyTypeId() {
        return this.replyTypeId.value;
    }

    public String replyingToMessageId() {
        return this.replyingToMessageId.value;
    }

    public String replyingToMessageIdExternal() {
        return this.replyingToMessageIdExternal.value;
    }

    public String responseMessageId() {
        return this.responseMessageId.value;
    }

    public String sentAt() {
        return this.sentAt.value;
    }

    public String status() {
        return this.status.value;
    }

    public String text() {
        return this.text.value;
    }

    public String thumbnailUrl() {
        return this.thumbnailUrl.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String visitorId() {
        return this.visitorId.value;
    }
}
