package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatMessageConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> adddressMessageParameters;
    private final Input<List<ModelChatMessageConditionInput>> and;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelIDInput> chatBotId;
    private final Input<ModelIDInput> chatUserAccountIdIfExternal;
    private final Input<ModelStringInput> chatUserAccountNameIfExternal;
    private final Input<ModelIDInput> chatUserId;
    private final Input<ModelStringInput> chatUserName;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> contactObjectToSend;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> deliveredAt;
    private final Input<ModelIDInput> directChatUserId;
    private final Input<ModelStringInput> errorMessages;
    private final Input<ModelStringInput> externalConversationId;
    private final Input<ModelStringInput> externalMessageReferenceId;
    private final Input<ModelStringInput> externalTemplateCategory;
    private final Input<ModelStringInput> externalTemplateId;
    private final Input<ModelStringInput> followUpType;
    private final Input<ModelStringInput> footerText;
    private final Input<ModelBooleanInput> hasImage;
    private final Input<ModelStringInput> headerText;
    private final Input<ModelStringInput> headerType;
    private final Input<ModelIDInput> internalTemplateId;
    private final Input<ModelBooleanInput> isInbound;
    private final Input<ModelBooleanInput> isStarred;
    private final Input<ModelIDInput> linkedEngagementIdIfBroadcast;
    private final Input<ModelStringInput> locationObjectToSend;
    private final Input<ModelStringInput> mediaMetadata;
    private final Input<ModelIDInput> mediaObjectId;
    private final Input<ModelStringInput> messageCategory;
    private final Input<ModelStringInput> messagePlatform;
    private final Input<ModelMessageSendCategoryInput> messageSendCategory;
    private final Input<ModelStringInput> messageSubType;
    private final Input<ModelStringInput> messageType;
    private final Input<ModelChatMessageConditionInput> not;
    private final Input<List<ModelChatMessageConditionInput>> or;
    private final Input<ModelStringInput> phoneNumberIdExternal;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelStringInput> readAt;
    private final Input<ModelStringInput> recipientExternalId;
    private final Input<ModelStringInput> recipientExternalIdType;
    private final Input<ModelStringInput> referral;
    private final Input<ModelIDInput> referredContactId;
    private final Input<ModelStringInput> referredProductCatalogId;
    private final Input<ModelStringInput> referredProductRetailerId;
    private final Input<ModelStringInput> replyType;
    private final Input<ModelStringInput> replyTypeId;
    private final Input<ModelIDInput> replyingToMessageId;
    private final Input<ModelStringInput> replyingToMessageIdExternal;
    private final Input<ModelIDInput> responseMessageId;
    private final Input<ModelStringInput> sentAt;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> text;
    private final Input<ModelStringInput> thumbnailUrl;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> visitorId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> phoneNumberIdExternal = Input.absent();
        private Input<ModelStringInput> messagePlatform = Input.absent();
        private Input<ModelStringInput> externalMessageReferenceId = Input.absent();
        private Input<ModelStringInput> externalConversationId = Input.absent();
        private Input<ModelStringInput> recipientExternalId = Input.absent();
        private Input<ModelStringInput> recipientExternalIdType = Input.absent();
        private Input<ModelIDInput> channelId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> visitorId = Input.absent();
        private Input<ModelIDInput> referredContactId = Input.absent();
        private Input<ModelStringInput> messageType = Input.absent();
        private Input<ModelStringInput> messageSubType = Input.absent();
        private Input<ModelStringInput> messageCategory = Input.absent();
        private Input<ModelMessageSendCategoryInput> messageSendCategory = Input.absent();
        private Input<ModelIDInput> replyingToMessageId = Input.absent();
        private Input<ModelStringInput> replyingToMessageIdExternal = Input.absent();
        private Input<ModelIDInput> responseMessageId = Input.absent();
        private Input<ModelStringInput> followUpType = Input.absent();
        private Input<ModelStringInput> replyType = Input.absent();
        private Input<ModelStringInput> replyTypeId = Input.absent();
        private Input<ModelStringInput> referredProductCatalogId = Input.absent();
        private Input<ModelStringInput> referredProductRetailerId = Input.absent();
        private Input<ModelStringInput> referral = Input.absent();
        private Input<ModelBooleanInput> isStarred = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> errorMessages = Input.absent();
        private Input<ModelStringInput> sentAt = Input.absent();
        private Input<ModelStringInput> deliveredAt = Input.absent();
        private Input<ModelStringInput> readAt = Input.absent();
        private Input<ModelIDInput> internalTemplateId = Input.absent();
        private Input<ModelStringInput> externalTemplateId = Input.absent();
        private Input<ModelStringInput> externalTemplateCategory = Input.absent();
        private Input<ModelStringInput> text = Input.absent();
        private Input<ModelStringInput> contactObjectToSend = Input.absent();
        private Input<ModelStringInput> locationObjectToSend = Input.absent();
        private Input<ModelStringInput> adddressMessageParameters = Input.absent();
        private Input<ModelStringInput> headerText = Input.absent();
        private Input<ModelStringInput> footerText = Input.absent();
        private Input<ModelStringInput> headerType = Input.absent();
        private Input<ModelIDInput> mediaObjectId = Input.absent();
        private Input<ModelStringInput> mediaMetadata = Input.absent();
        private Input<ModelBooleanInput> hasImage = Input.absent();
        private Input<ModelStringInput> thumbnailUrl = Input.absent();
        private Input<ModelBooleanInput> isInbound = Input.absent();
        private Input<ModelIDInput> chatUserId = Input.absent();
        private Input<ModelStringInput> chatUserName = Input.absent();
        private Input<ModelIDInput> chatBotId = Input.absent();
        private Input<ModelIDInput> chatUserAccountIdIfExternal = Input.absent();
        private Input<ModelStringInput> chatUserAccountNameIfExternal = Input.absent();
        private Input<ModelIDInput> directChatUserId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelIDInput> linkedEngagementIdIfBroadcast = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelChatMessageConditionInput>> and = Input.absent();
        private Input<List<ModelChatMessageConditionInput>> or = Input.absent();
        private Input<ModelChatMessageConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder adddressMessageParameters(ModelStringInput modelStringInput) {
            this.adddressMessageParameters = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelChatMessageConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatMessageConditionInput build() {
            return new ModelChatMessageConditionInput(this.accountId, this.phoneNumberIdExternal, this.messagePlatform, this.externalMessageReferenceId, this.externalConversationId, this.recipientExternalId, this.recipientExternalIdType, this.channelId, this.contactId, this.visitorId, this.referredContactId, this.messageType, this.messageSubType, this.messageCategory, this.messageSendCategory, this.replyingToMessageId, this.replyingToMessageIdExternal, this.responseMessageId, this.followUpType, this.replyType, this.replyTypeId, this.referredProductCatalogId, this.referredProductRetailerId, this.referral, this.isStarred, this.status, this.errorMessages, this.sentAt, this.deliveredAt, this.readAt, this.internalTemplateId, this.externalTemplateId, this.externalTemplateCategory, this.text, this.contactObjectToSend, this.locationObjectToSend, this.adddressMessageParameters, this.headerText, this.footerText, this.headerType, this.mediaObjectId, this.mediaMetadata, this.hasImage, this.thumbnailUrl, this.isInbound, this.chatUserId, this.chatUserName, this.chatBotId, this.chatUserAccountIdIfExternal, this.chatUserAccountNameIfExternal, this.directChatUserId, this.primaryTeamId, this.linkedEngagementIdIfBroadcast, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder channelId(ModelIDInput modelIDInput) {
            this.channelId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder chatBotId(ModelIDInput modelIDInput) {
            this.chatBotId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder chatUserAccountIdIfExternal(ModelIDInput modelIDInput) {
            this.chatUserAccountIdIfExternal = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder chatUserAccountNameIfExternal(ModelStringInput modelStringInput) {
            this.chatUserAccountNameIfExternal = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder chatUserId(ModelIDInput modelIDInput) {
            this.chatUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder chatUserName(ModelStringInput modelStringInput) {
            this.chatUserName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactObjectToSend(ModelStringInput modelStringInput) {
            this.contactObjectToSend = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder deliveredAt(ModelStringInput modelStringInput) {
            this.deliveredAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder directChatUserId(ModelIDInput modelIDInput) {
            this.directChatUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder errorMessages(ModelStringInput modelStringInput) {
            this.errorMessages = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder externalConversationId(ModelStringInput modelStringInput) {
            this.externalConversationId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder externalMessageReferenceId(ModelStringInput modelStringInput) {
            this.externalMessageReferenceId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder externalTemplateCategory(ModelStringInput modelStringInput) {
            this.externalTemplateCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder externalTemplateId(ModelStringInput modelStringInput) {
            this.externalTemplateId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder followUpType(ModelStringInput modelStringInput) {
            this.followUpType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder footerText(ModelStringInput modelStringInput) {
            this.footerText = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder hasImage(ModelBooleanInput modelBooleanInput) {
            this.hasImage = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder headerText(ModelStringInput modelStringInput) {
            this.headerText = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder headerType(ModelStringInput modelStringInput) {
            this.headerType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder internalTemplateId(ModelIDInput modelIDInput) {
            this.internalTemplateId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isInbound(ModelBooleanInput modelBooleanInput) {
            this.isInbound = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isStarred(ModelBooleanInput modelBooleanInput) {
            this.isStarred = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder linkedEngagementIdIfBroadcast(ModelIDInput modelIDInput) {
            this.linkedEngagementIdIfBroadcast = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder locationObjectToSend(ModelStringInput modelStringInput) {
            this.locationObjectToSend = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder mediaMetadata(ModelStringInput modelStringInput) {
            this.mediaMetadata = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder mediaObjectId(ModelIDInput modelIDInput) {
            this.mediaObjectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder messageCategory(ModelStringInput modelStringInput) {
            this.messageCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messagePlatform(ModelStringInput modelStringInput) {
            this.messagePlatform = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageSendCategory(ModelMessageSendCategoryInput modelMessageSendCategoryInput) {
            this.messageSendCategory = Input.fromNullable(modelMessageSendCategoryInput);
            return this;
        }

        public Builder messageSubType(ModelStringInput modelStringInput) {
            this.messageSubType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageType(ModelStringInput modelStringInput) {
            this.messageType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelChatMessageConditionInput modelChatMessageConditionInput) {
            this.not = Input.fromNullable(modelChatMessageConditionInput);
            return this;
        }

        public Builder or(List<ModelChatMessageConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder phoneNumberIdExternal(ModelStringInput modelStringInput) {
            this.phoneNumberIdExternal = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder primaryTeamId(ModelIDInput modelIDInput) {
            this.primaryTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder readAt(ModelStringInput modelStringInput) {
            this.readAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder recipientExternalId(ModelStringInput modelStringInput) {
            this.recipientExternalId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder recipientExternalIdType(ModelStringInput modelStringInput) {
            this.recipientExternalIdType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder referral(ModelStringInput modelStringInput) {
            this.referral = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder referredContactId(ModelIDInput modelIDInput) {
            this.referredContactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder referredProductCatalogId(ModelStringInput modelStringInput) {
            this.referredProductCatalogId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder referredProductRetailerId(ModelStringInput modelStringInput) {
            this.referredProductRetailerId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder replyType(ModelStringInput modelStringInput) {
            this.replyType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder replyTypeId(ModelStringInput modelStringInput) {
            this.replyTypeId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder replyingToMessageId(ModelIDInput modelIDInput) {
            this.replyingToMessageId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder replyingToMessageIdExternal(ModelStringInput modelStringInput) {
            this.replyingToMessageIdExternal = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder responseMessageId(ModelIDInput modelIDInput) {
            this.responseMessageId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder sentAt(ModelStringInput modelStringInput) {
            this.sentAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder text(ModelStringInput modelStringInput) {
            this.text = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder thumbnailUrl(ModelStringInput modelStringInput) {
            this.thumbnailUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder visitorId(ModelIDInput modelIDInput) {
            this.visitorId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelChatMessageConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelMessageSendCategoryInput> input15, Input<ModelIDInput> input16, Input<ModelStringInput> input17, Input<ModelIDInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelBooleanInput> input25, Input<ModelStringInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelIDInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelStringInput> input37, Input<ModelStringInput> input38, Input<ModelStringInput> input39, Input<ModelStringInput> input40, Input<ModelIDInput> input41, Input<ModelStringInput> input42, Input<ModelBooleanInput> input43, Input<ModelStringInput> input44, Input<ModelBooleanInput> input45, Input<ModelIDInput> input46, Input<ModelStringInput> input47, Input<ModelIDInput> input48, Input<ModelIDInput> input49, Input<ModelStringInput> input50, Input<ModelIDInput> input51, Input<ModelIDInput> input52, Input<ModelIDInput> input53, Input<ModelStringInput> input54, Input<ModelStringInput> input55, Input<List<ModelChatMessageConditionInput>> input56, Input<List<ModelChatMessageConditionInput>> input57, Input<ModelChatMessageConditionInput> input58) {
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
        this.referral = input24;
        this.isStarred = input25;
        this.status = input26;
        this.errorMessages = input27;
        this.sentAt = input28;
        this.deliveredAt = input29;
        this.readAt = input30;
        this.internalTemplateId = input31;
        this.externalTemplateId = input32;
        this.externalTemplateCategory = input33;
        this.text = input34;
        this.contactObjectToSend = input35;
        this.locationObjectToSend = input36;
        this.adddressMessageParameters = input37;
        this.headerText = input38;
        this.footerText = input39;
        this.headerType = input40;
        this.mediaObjectId = input41;
        this.mediaMetadata = input42;
        this.hasImage = input43;
        this.thumbnailUrl = input44;
        this.isInbound = input45;
        this.chatUserId = input46;
        this.chatUserName = input47;
        this.chatBotId = input48;
        this.chatUserAccountIdIfExternal = input49;
        this.chatUserAccountNameIfExternal = input50;
        this.directChatUserId = input51;
        this.primaryTeamId = input52;
        this.linkedEngagementIdIfBroadcast = input53;
        this.createdAt = input54;
        this.updatedAt = input55;
        this.and = input56;
        this.or = input57;
        this.not = input58;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput adddressMessageParameters() {
        return this.adddressMessageParameters.value;
    }

    public List<ModelChatMessageConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput channelId() {
        return this.channelId.value;
    }

    public ModelIDInput chatBotId() {
        return this.chatBotId.value;
    }

    public ModelIDInput chatUserAccountIdIfExternal() {
        return this.chatUserAccountIdIfExternal.value;
    }

    public ModelStringInput chatUserAccountNameIfExternal() {
        return this.chatUserAccountNameIfExternal.value;
    }

    public ModelIDInput chatUserId() {
        return this.chatUserId.value;
    }

    public ModelStringInput chatUserName() {
        return this.chatUserName.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput contactObjectToSend() {
        return this.contactObjectToSend.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput deliveredAt() {
        return this.deliveredAt.value;
    }

    public ModelIDInput directChatUserId() {
        return this.directChatUserId.value;
    }

    public ModelStringInput errorMessages() {
        return this.errorMessages.value;
    }

    public ModelStringInput externalConversationId() {
        return this.externalConversationId.value;
    }

    public ModelStringInput externalMessageReferenceId() {
        return this.externalMessageReferenceId.value;
    }

    public ModelStringInput externalTemplateCategory() {
        return this.externalTemplateCategory.value;
    }

    public ModelStringInput externalTemplateId() {
        return this.externalTemplateId.value;
    }

    public ModelStringInput followUpType() {
        return this.followUpType.value;
    }

    public ModelStringInput footerText() {
        return this.footerText.value;
    }

    public ModelBooleanInput hasImage() {
        return this.hasImage.value;
    }

    public ModelStringInput headerText() {
        return this.headerText.value;
    }

    public ModelStringInput headerType() {
        return this.headerType.value;
    }

    public ModelIDInput internalTemplateId() {
        return this.internalTemplateId.value;
    }

    public ModelBooleanInput isInbound() {
        return this.isInbound.value;
    }

    public ModelBooleanInput isStarred() {
        return this.isStarred.value;
    }

    public ModelIDInput linkedEngagementIdIfBroadcast() {
        return this.linkedEngagementIdIfBroadcast.value;
    }

    public ModelStringInput locationObjectToSend() {
        return this.locationObjectToSend.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatMessageConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatMessageConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatMessageConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", ModelChatMessageConditionInput.this.phoneNumberIdExternal.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeObject("messagePlatform", ModelChatMessageConditionInput.this.messagePlatform.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.messagePlatform.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.externalMessageReferenceId.defined) {
                    inputFieldWriter.writeObject("externalMessageReferenceId", ModelChatMessageConditionInput.this.externalMessageReferenceId.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.externalMessageReferenceId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.externalConversationId.defined) {
                    inputFieldWriter.writeObject("externalConversationId", ModelChatMessageConditionInput.this.externalConversationId.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.externalConversationId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.recipientExternalId.defined) {
                    inputFieldWriter.writeObject("recipientExternalId", ModelChatMessageConditionInput.this.recipientExternalId.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.recipientExternalId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.recipientExternalIdType.defined) {
                    inputFieldWriter.writeObject("recipientExternalIdType", ModelChatMessageConditionInput.this.recipientExternalIdType.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.recipientExternalIdType.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelChatMessageConditionInput.this.channelId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.channelId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelChatMessageConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.visitorId.defined) {
                    inputFieldWriter.writeObject("visitorId", ModelChatMessageConditionInput.this.visitorId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.visitorId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.referredContactId.defined) {
                    inputFieldWriter.writeObject("referredContactId", ModelChatMessageConditionInput.this.referredContactId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.referredContactId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.messageType.defined) {
                    inputFieldWriter.writeObject("messageType", ModelChatMessageConditionInput.this.messageType.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.messageType.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.messageSubType.defined) {
                    inputFieldWriter.writeObject("messageSubType", ModelChatMessageConditionInput.this.messageSubType.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.messageSubType.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.messageCategory.defined) {
                    inputFieldWriter.writeObject("messageCategory", ModelChatMessageConditionInput.this.messageCategory.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.messageCategory.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.messageSendCategory.defined) {
                    inputFieldWriter.writeObject("messageSendCategory", ModelChatMessageConditionInput.this.messageSendCategory.value != 0 ? ((ModelMessageSendCategoryInput) ModelChatMessageConditionInput.this.messageSendCategory.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.replyingToMessageId.defined) {
                    inputFieldWriter.writeObject("replyingToMessageId", ModelChatMessageConditionInput.this.replyingToMessageId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.replyingToMessageId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.replyingToMessageIdExternal.defined) {
                    inputFieldWriter.writeObject("replyingToMessageIdExternal", ModelChatMessageConditionInput.this.replyingToMessageIdExternal.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.replyingToMessageIdExternal.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.responseMessageId.defined) {
                    inputFieldWriter.writeObject("responseMessageId", ModelChatMessageConditionInput.this.responseMessageId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.responseMessageId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.followUpType.defined) {
                    inputFieldWriter.writeObject("followUpType", ModelChatMessageConditionInput.this.followUpType.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.followUpType.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.replyType.defined) {
                    inputFieldWriter.writeObject("replyType", ModelChatMessageConditionInput.this.replyType.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.replyType.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.replyTypeId.defined) {
                    inputFieldWriter.writeObject("replyTypeId", ModelChatMessageConditionInput.this.replyTypeId.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.replyTypeId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.referredProductCatalogId.defined) {
                    inputFieldWriter.writeObject("referredProductCatalogId", ModelChatMessageConditionInput.this.referredProductCatalogId.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.referredProductCatalogId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.referredProductRetailerId.defined) {
                    inputFieldWriter.writeObject("referredProductRetailerId", ModelChatMessageConditionInput.this.referredProductRetailerId.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.referredProductRetailerId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.referral.defined) {
                    inputFieldWriter.writeObject("referral", ModelChatMessageConditionInput.this.referral.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.referral.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.isStarred.defined) {
                    inputFieldWriter.writeObject("isStarred", ModelChatMessageConditionInput.this.isStarred.value != 0 ? ((ModelBooleanInput) ModelChatMessageConditionInput.this.isStarred.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelChatMessageConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.errorMessages.defined) {
                    inputFieldWriter.writeObject("errorMessages", ModelChatMessageConditionInput.this.errorMessages.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.errorMessages.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.sentAt.defined) {
                    inputFieldWriter.writeObject("sentAt", ModelChatMessageConditionInput.this.sentAt.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.sentAt.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.deliveredAt.defined) {
                    inputFieldWriter.writeObject("deliveredAt", ModelChatMessageConditionInput.this.deliveredAt.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.deliveredAt.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.readAt.defined) {
                    inputFieldWriter.writeObject("readAt", ModelChatMessageConditionInput.this.readAt.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.readAt.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.internalTemplateId.defined) {
                    inputFieldWriter.writeObject("internalTemplateId", ModelChatMessageConditionInput.this.internalTemplateId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.internalTemplateId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.externalTemplateId.defined) {
                    inputFieldWriter.writeObject("externalTemplateId", ModelChatMessageConditionInput.this.externalTemplateId.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.externalTemplateId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.externalTemplateCategory.defined) {
                    inputFieldWriter.writeObject("externalTemplateCategory", ModelChatMessageConditionInput.this.externalTemplateCategory.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.externalTemplateCategory.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.text.defined) {
                    inputFieldWriter.writeObject("text", ModelChatMessageConditionInput.this.text.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.text.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.contactObjectToSend.defined) {
                    inputFieldWriter.writeObject("contactObjectToSend", ModelChatMessageConditionInput.this.contactObjectToSend.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.contactObjectToSend.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.locationObjectToSend.defined) {
                    inputFieldWriter.writeObject("locationObjectToSend", ModelChatMessageConditionInput.this.locationObjectToSend.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.locationObjectToSend.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.adddressMessageParameters.defined) {
                    inputFieldWriter.writeObject("adddressMessageParameters", ModelChatMessageConditionInput.this.adddressMessageParameters.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.adddressMessageParameters.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.headerText.defined) {
                    inputFieldWriter.writeObject("headerText", ModelChatMessageConditionInput.this.headerText.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.headerText.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.footerText.defined) {
                    inputFieldWriter.writeObject("footerText", ModelChatMessageConditionInput.this.footerText.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.footerText.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.headerType.defined) {
                    inputFieldWriter.writeObject("headerType", ModelChatMessageConditionInput.this.headerType.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.headerType.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.mediaObjectId.defined) {
                    inputFieldWriter.writeObject("mediaObjectId", ModelChatMessageConditionInput.this.mediaObjectId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.mediaObjectId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.mediaMetadata.defined) {
                    inputFieldWriter.writeObject("mediaMetadata", ModelChatMessageConditionInput.this.mediaMetadata.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.mediaMetadata.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.hasImage.defined) {
                    inputFieldWriter.writeObject("hasImage", ModelChatMessageConditionInput.this.hasImage.value != 0 ? ((ModelBooleanInput) ModelChatMessageConditionInput.this.hasImage.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.thumbnailUrl.defined) {
                    inputFieldWriter.writeObject("thumbnailUrl", ModelChatMessageConditionInput.this.thumbnailUrl.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.thumbnailUrl.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.isInbound.defined) {
                    inputFieldWriter.writeObject("isInbound", ModelChatMessageConditionInput.this.isInbound.value != 0 ? ((ModelBooleanInput) ModelChatMessageConditionInput.this.isInbound.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.chatUserId.defined) {
                    inputFieldWriter.writeObject("chatUserId", ModelChatMessageConditionInput.this.chatUserId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.chatUserId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.chatUserName.defined) {
                    inputFieldWriter.writeObject("chatUserName", ModelChatMessageConditionInput.this.chatUserName.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.chatUserName.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.chatBotId.defined) {
                    inputFieldWriter.writeObject("chatBotId", ModelChatMessageConditionInput.this.chatBotId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.chatBotId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.chatUserAccountIdIfExternal.defined) {
                    inputFieldWriter.writeObject("chatUserAccountIdIfExternal", ModelChatMessageConditionInput.this.chatUserAccountIdIfExternal.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.chatUserAccountIdIfExternal.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.chatUserAccountNameIfExternal.defined) {
                    inputFieldWriter.writeObject("chatUserAccountNameIfExternal", ModelChatMessageConditionInput.this.chatUserAccountNameIfExternal.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.chatUserAccountNameIfExternal.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.directChatUserId.defined) {
                    inputFieldWriter.writeObject("directChatUserId", ModelChatMessageConditionInput.this.directChatUserId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.directChatUserId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelChatMessageConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.linkedEngagementIdIfBroadcast.defined) {
                    inputFieldWriter.writeObject("linkedEngagementIdIfBroadcast", ModelChatMessageConditionInput.this.linkedEngagementIdIfBroadcast.value != 0 ? ((ModelIDInput) ModelChatMessageConditionInput.this.linkedEngagementIdIfBroadcast.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatMessageConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatMessageConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatMessageConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatMessageConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatMessageConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatMessageConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatMessageConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatMessageConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatMessageConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatMessageConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatMessageConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatMessageConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatMessageConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatMessageConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatMessageConditionInput.this.not.value != 0 ? ((ModelChatMessageConditionInput) ModelChatMessageConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput mediaMetadata() {
        return this.mediaMetadata.value;
    }

    public ModelIDInput mediaObjectId() {
        return this.mediaObjectId.value;
    }

    public ModelStringInput messageCategory() {
        return this.messageCategory.value;
    }

    public ModelStringInput messagePlatform() {
        return this.messagePlatform.value;
    }

    public ModelMessageSendCategoryInput messageSendCategory() {
        return this.messageSendCategory.value;
    }

    public ModelStringInput messageSubType() {
        return this.messageSubType.value;
    }

    public ModelStringInput messageType() {
        return this.messageType.value;
    }

    public ModelChatMessageConditionInput not() {
        return this.not.value;
    }

    public List<ModelChatMessageConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public ModelIDInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public ModelStringInput readAt() {
        return this.readAt.value;
    }

    public ModelStringInput recipientExternalId() {
        return this.recipientExternalId.value;
    }

    public ModelStringInput recipientExternalIdType() {
        return this.recipientExternalIdType.value;
    }

    public ModelStringInput referral() {
        return this.referral.value;
    }

    public ModelIDInput referredContactId() {
        return this.referredContactId.value;
    }

    public ModelStringInput referredProductCatalogId() {
        return this.referredProductCatalogId.value;
    }

    public ModelStringInput referredProductRetailerId() {
        return this.referredProductRetailerId.value;
    }

    public ModelStringInput replyType() {
        return this.replyType.value;
    }

    public ModelStringInput replyTypeId() {
        return this.replyTypeId.value;
    }

    public ModelIDInput replyingToMessageId() {
        return this.replyingToMessageId.value;
    }

    public ModelStringInput replyingToMessageIdExternal() {
        return this.replyingToMessageIdExternal.value;
    }

    public ModelIDInput responseMessageId() {
        return this.responseMessageId.value;
    }

    public ModelStringInput sentAt() {
        return this.sentAt.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput text() {
        return this.text.value;
    }

    public ModelStringInput thumbnailUrl() {
        return this.thumbnailUrl.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput visitorId() {
        return this.visitorId.value;
    }
}
