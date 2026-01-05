package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatMessageFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> adddressMessageParameters;
    private final Input<List<ModelChatMessageFilterInput>> and;
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
    private final Input<ModelIDInput> id;
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
    private final Input<ModelChatMessageFilterInput> not;
    private final Input<List<ModelChatMessageFilterInput>> or;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelChatMessageFilterInput>> and = Input.absent();
        private Input<List<ModelChatMessageFilterInput>> or = Input.absent();
        private Input<ModelChatMessageFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder adddressMessageParameters(ModelStringInput modelStringInput) {
            this.adddressMessageParameters = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelChatMessageFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatMessageFilterInput build() {
            return new ModelChatMessageFilterInput(this.id, this.accountId, this.phoneNumberIdExternal, this.messagePlatform, this.externalMessageReferenceId, this.externalConversationId, this.recipientExternalId, this.recipientExternalIdType, this.channelId, this.contactId, this.visitorId, this.referredContactId, this.messageType, this.messageSubType, this.messageCategory, this.messageSendCategory, this.replyingToMessageId, this.replyingToMessageIdExternal, this.responseMessageId, this.followUpType, this.replyType, this.replyTypeId, this.referredProductCatalogId, this.referredProductRetailerId, this.referral, this.isStarred, this.status, this.errorMessages, this.sentAt, this.deliveredAt, this.readAt, this.internalTemplateId, this.externalTemplateId, this.externalTemplateCategory, this.text, this.contactObjectToSend, this.locationObjectToSend, this.adddressMessageParameters, this.headerText, this.footerText, this.headerType, this.mediaObjectId, this.mediaMetadata, this.hasImage, this.thumbnailUrl, this.isInbound, this.chatUserId, this.chatUserName, this.chatBotId, this.chatUserAccountIdIfExternal, this.chatUserAccountNameIfExternal, this.directChatUserId, this.primaryTeamId, this.linkedEngagementIdIfBroadcast, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelChatMessageFilterInput modelChatMessageFilterInput) {
            this.not = Input.fromNullable(modelChatMessageFilterInput);
            return this;
        }

        public Builder or(List<ModelChatMessageFilterInput> list) {
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

    public ModelChatMessageFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelMessageSendCategoryInput> input16, Input<ModelIDInput> input17, Input<ModelStringInput> input18, Input<ModelIDInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelBooleanInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<ModelIDInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelStringInput> input37, Input<ModelStringInput> input38, Input<ModelStringInput> input39, Input<ModelStringInput> input40, Input<ModelStringInput> input41, Input<ModelIDInput> input42, Input<ModelStringInput> input43, Input<ModelBooleanInput> input44, Input<ModelStringInput> input45, Input<ModelBooleanInput> input46, Input<ModelIDInput> input47, Input<ModelStringInput> input48, Input<ModelIDInput> input49, Input<ModelIDInput> input50, Input<ModelStringInput> input51, Input<ModelIDInput> input52, Input<ModelIDInput> input53, Input<ModelIDInput> input54, Input<ModelStringInput> input55, Input<ModelStringInput> input56, Input<List<ModelChatMessageFilterInput>> input57, Input<List<ModelChatMessageFilterInput>> input58, Input<ModelChatMessageFilterInput> input59) {
        this.id = input;
        this.accountId = input2;
        this.phoneNumberIdExternal = input3;
        this.messagePlatform = input4;
        this.externalMessageReferenceId = input5;
        this.externalConversationId = input6;
        this.recipientExternalId = input7;
        this.recipientExternalIdType = input8;
        this.channelId = input9;
        this.contactId = input10;
        this.visitorId = input11;
        this.referredContactId = input12;
        this.messageType = input13;
        this.messageSubType = input14;
        this.messageCategory = input15;
        this.messageSendCategory = input16;
        this.replyingToMessageId = input17;
        this.replyingToMessageIdExternal = input18;
        this.responseMessageId = input19;
        this.followUpType = input20;
        this.replyType = input21;
        this.replyTypeId = input22;
        this.referredProductCatalogId = input23;
        this.referredProductRetailerId = input24;
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
        this.mediaObjectId = input42;
        this.mediaMetadata = input43;
        this.hasImage = input44;
        this.thumbnailUrl = input45;
        this.isInbound = input46;
        this.chatUserId = input47;
        this.chatUserName = input48;
        this.chatBotId = input49;
        this.chatUserAccountIdIfExternal = input50;
        this.chatUserAccountNameIfExternal = input51;
        this.directChatUserId = input52;
        this.primaryTeamId = input53;
        this.linkedEngagementIdIfBroadcast = input54;
        this.createdAt = input55;
        this.updatedAt = input56;
        this.and = input57;
        this.or = input58;
        this.not = input59;
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

    public List<ModelChatMessageFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
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
        return new InputFieldMarshaller() { // from class: type.ModelChatMessageFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatMessageFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelChatMessageFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatMessageFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", ModelChatMessageFilterInput.this.phoneNumberIdExternal.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeObject("messagePlatform", ModelChatMessageFilterInput.this.messagePlatform.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.messagePlatform.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.externalMessageReferenceId.defined) {
                    inputFieldWriter.writeObject("externalMessageReferenceId", ModelChatMessageFilterInput.this.externalMessageReferenceId.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.externalMessageReferenceId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.externalConversationId.defined) {
                    inputFieldWriter.writeObject("externalConversationId", ModelChatMessageFilterInput.this.externalConversationId.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.externalConversationId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.recipientExternalId.defined) {
                    inputFieldWriter.writeObject("recipientExternalId", ModelChatMessageFilterInput.this.recipientExternalId.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.recipientExternalId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.recipientExternalIdType.defined) {
                    inputFieldWriter.writeObject("recipientExternalIdType", ModelChatMessageFilterInput.this.recipientExternalIdType.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.recipientExternalIdType.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelChatMessageFilterInput.this.channelId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.channelId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelChatMessageFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.visitorId.defined) {
                    inputFieldWriter.writeObject("visitorId", ModelChatMessageFilterInput.this.visitorId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.visitorId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.referredContactId.defined) {
                    inputFieldWriter.writeObject("referredContactId", ModelChatMessageFilterInput.this.referredContactId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.referredContactId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.messageType.defined) {
                    inputFieldWriter.writeObject("messageType", ModelChatMessageFilterInput.this.messageType.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.messageType.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.messageSubType.defined) {
                    inputFieldWriter.writeObject("messageSubType", ModelChatMessageFilterInput.this.messageSubType.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.messageSubType.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.messageCategory.defined) {
                    inputFieldWriter.writeObject("messageCategory", ModelChatMessageFilterInput.this.messageCategory.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.messageCategory.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.messageSendCategory.defined) {
                    inputFieldWriter.writeObject("messageSendCategory", ModelChatMessageFilterInput.this.messageSendCategory.value != 0 ? ((ModelMessageSendCategoryInput) ModelChatMessageFilterInput.this.messageSendCategory.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.replyingToMessageId.defined) {
                    inputFieldWriter.writeObject("replyingToMessageId", ModelChatMessageFilterInput.this.replyingToMessageId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.replyingToMessageId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.replyingToMessageIdExternal.defined) {
                    inputFieldWriter.writeObject("replyingToMessageIdExternal", ModelChatMessageFilterInput.this.replyingToMessageIdExternal.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.replyingToMessageIdExternal.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.responseMessageId.defined) {
                    inputFieldWriter.writeObject("responseMessageId", ModelChatMessageFilterInput.this.responseMessageId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.responseMessageId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.followUpType.defined) {
                    inputFieldWriter.writeObject("followUpType", ModelChatMessageFilterInput.this.followUpType.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.followUpType.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.replyType.defined) {
                    inputFieldWriter.writeObject("replyType", ModelChatMessageFilterInput.this.replyType.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.replyType.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.replyTypeId.defined) {
                    inputFieldWriter.writeObject("replyTypeId", ModelChatMessageFilterInput.this.replyTypeId.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.replyTypeId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.referredProductCatalogId.defined) {
                    inputFieldWriter.writeObject("referredProductCatalogId", ModelChatMessageFilterInput.this.referredProductCatalogId.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.referredProductCatalogId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.referredProductRetailerId.defined) {
                    inputFieldWriter.writeObject("referredProductRetailerId", ModelChatMessageFilterInput.this.referredProductRetailerId.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.referredProductRetailerId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.referral.defined) {
                    inputFieldWriter.writeObject("referral", ModelChatMessageFilterInput.this.referral.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.referral.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.isStarred.defined) {
                    inputFieldWriter.writeObject("isStarred", ModelChatMessageFilterInput.this.isStarred.value != 0 ? ((ModelBooleanInput) ModelChatMessageFilterInput.this.isStarred.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelChatMessageFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.errorMessages.defined) {
                    inputFieldWriter.writeObject("errorMessages", ModelChatMessageFilterInput.this.errorMessages.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.errorMessages.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.sentAt.defined) {
                    inputFieldWriter.writeObject("sentAt", ModelChatMessageFilterInput.this.sentAt.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.sentAt.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.deliveredAt.defined) {
                    inputFieldWriter.writeObject("deliveredAt", ModelChatMessageFilterInput.this.deliveredAt.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.deliveredAt.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.readAt.defined) {
                    inputFieldWriter.writeObject("readAt", ModelChatMessageFilterInput.this.readAt.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.readAt.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.internalTemplateId.defined) {
                    inputFieldWriter.writeObject("internalTemplateId", ModelChatMessageFilterInput.this.internalTemplateId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.internalTemplateId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.externalTemplateId.defined) {
                    inputFieldWriter.writeObject("externalTemplateId", ModelChatMessageFilterInput.this.externalTemplateId.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.externalTemplateId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.externalTemplateCategory.defined) {
                    inputFieldWriter.writeObject("externalTemplateCategory", ModelChatMessageFilterInput.this.externalTemplateCategory.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.externalTemplateCategory.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.text.defined) {
                    inputFieldWriter.writeObject("text", ModelChatMessageFilterInput.this.text.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.text.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.contactObjectToSend.defined) {
                    inputFieldWriter.writeObject("contactObjectToSend", ModelChatMessageFilterInput.this.contactObjectToSend.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.contactObjectToSend.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.locationObjectToSend.defined) {
                    inputFieldWriter.writeObject("locationObjectToSend", ModelChatMessageFilterInput.this.locationObjectToSend.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.locationObjectToSend.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.adddressMessageParameters.defined) {
                    inputFieldWriter.writeObject("adddressMessageParameters", ModelChatMessageFilterInput.this.adddressMessageParameters.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.adddressMessageParameters.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.headerText.defined) {
                    inputFieldWriter.writeObject("headerText", ModelChatMessageFilterInput.this.headerText.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.headerText.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.footerText.defined) {
                    inputFieldWriter.writeObject("footerText", ModelChatMessageFilterInput.this.footerText.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.footerText.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.headerType.defined) {
                    inputFieldWriter.writeObject("headerType", ModelChatMessageFilterInput.this.headerType.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.headerType.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.mediaObjectId.defined) {
                    inputFieldWriter.writeObject("mediaObjectId", ModelChatMessageFilterInput.this.mediaObjectId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.mediaObjectId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.mediaMetadata.defined) {
                    inputFieldWriter.writeObject("mediaMetadata", ModelChatMessageFilterInput.this.mediaMetadata.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.mediaMetadata.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.hasImage.defined) {
                    inputFieldWriter.writeObject("hasImage", ModelChatMessageFilterInput.this.hasImage.value != 0 ? ((ModelBooleanInput) ModelChatMessageFilterInput.this.hasImage.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.thumbnailUrl.defined) {
                    inputFieldWriter.writeObject("thumbnailUrl", ModelChatMessageFilterInput.this.thumbnailUrl.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.thumbnailUrl.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.isInbound.defined) {
                    inputFieldWriter.writeObject("isInbound", ModelChatMessageFilterInput.this.isInbound.value != 0 ? ((ModelBooleanInput) ModelChatMessageFilterInput.this.isInbound.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.chatUserId.defined) {
                    inputFieldWriter.writeObject("chatUserId", ModelChatMessageFilterInput.this.chatUserId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.chatUserId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.chatUserName.defined) {
                    inputFieldWriter.writeObject("chatUserName", ModelChatMessageFilterInput.this.chatUserName.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.chatUserName.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.chatBotId.defined) {
                    inputFieldWriter.writeObject("chatBotId", ModelChatMessageFilterInput.this.chatBotId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.chatBotId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.chatUserAccountIdIfExternal.defined) {
                    inputFieldWriter.writeObject("chatUserAccountIdIfExternal", ModelChatMessageFilterInput.this.chatUserAccountIdIfExternal.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.chatUserAccountIdIfExternal.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.chatUserAccountNameIfExternal.defined) {
                    inputFieldWriter.writeObject("chatUserAccountNameIfExternal", ModelChatMessageFilterInput.this.chatUserAccountNameIfExternal.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.chatUserAccountNameIfExternal.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.directChatUserId.defined) {
                    inputFieldWriter.writeObject("directChatUserId", ModelChatMessageFilterInput.this.directChatUserId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.directChatUserId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelChatMessageFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.linkedEngagementIdIfBroadcast.defined) {
                    inputFieldWriter.writeObject("linkedEngagementIdIfBroadcast", ModelChatMessageFilterInput.this.linkedEngagementIdIfBroadcast.value != 0 ? ((ModelIDInput) ModelChatMessageFilterInput.this.linkedEngagementIdIfBroadcast.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatMessageFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatMessageFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatMessageFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatMessageFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatMessageFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatMessageFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatMessageFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatMessageFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatMessageFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatMessageFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatMessageFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatMessageFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatMessageFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatMessageFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatMessageFilterInput.this.not.value != 0 ? ((ModelChatMessageFilterInput) ModelChatMessageFilterInput.this.not.value).marshaller() : null);
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

    public ModelChatMessageFilterInput not() {
        return this.not.value;
    }

    public List<ModelChatMessageFilterInput> or() {
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
