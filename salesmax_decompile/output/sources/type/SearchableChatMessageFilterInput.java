package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableChatMessageFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableStringFilterInput> adddressMessageParameters;
    private final Input<List<SearchableChatMessageFilterInput>> and;
    private final Input<SearchableIDFilterInput> channelId;
    private final Input<SearchableIDFilterInput> chatBotId;
    private final Input<SearchableIDFilterInput> chatUserAccountIdIfExternal;
    private final Input<SearchableStringFilterInput> chatUserAccountNameIfExternal;
    private final Input<SearchableIDFilterInput> chatUserId;
    private final Input<SearchableStringFilterInput> chatUserName;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> contactObjectToSend;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> deliveredAt;
    private final Input<SearchableIDFilterInput> directChatUserId;
    private final Input<SearchableStringFilterInput> errorMessages;
    private final Input<SearchableStringFilterInput> externalConversationId;
    private final Input<SearchableStringFilterInput> externalMessageReferenceId;
    private final Input<SearchableStringFilterInput> externalTemplateCategory;
    private final Input<SearchableStringFilterInput> externalTemplateId;
    private final Input<SearchableStringFilterInput> followUpType;
    private final Input<SearchableStringFilterInput> footerText;
    private final Input<SearchableBooleanFilterInput> hasImage;
    private final Input<SearchableStringFilterInput> headerText;
    private final Input<SearchableStringFilterInput> headerType;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableIDFilterInput> internalTemplateId;
    private final Input<SearchableBooleanFilterInput> isInbound;
    private final Input<SearchableBooleanFilterInput> isStarred;
    private final Input<SearchableIDFilterInput> linkedEngagementIdIfBroadcast;
    private final Input<SearchableStringFilterInput> locationObjectToSend;
    private final Input<SearchableStringFilterInput> mediaMetadata;
    private final Input<SearchableIDFilterInput> mediaObjectId;
    private final Input<SearchableStringFilterInput> messageCategory;
    private final Input<SearchableStringFilterInput> messagePlatform;
    private final Input<SearchableStringFilterInput> messageSubType;
    private final Input<SearchableStringFilterInput> messageType;
    private final Input<SearchableChatMessageFilterInput> not;
    private final Input<List<SearchableChatMessageFilterInput>> or;
    private final Input<SearchableStringFilterInput> phoneNumberIdExternal;
    private final Input<SearchableIDFilterInput> primaryTeamId;
    private final Input<SearchableStringFilterInput> readAt;
    private final Input<SearchableStringFilterInput> recipientExternalId;
    private final Input<SearchableStringFilterInput> recipientExternalIdType;
    private final Input<SearchableStringFilterInput> referral;
    private final Input<SearchableIDFilterInput> referredContactId;
    private final Input<SearchableStringFilterInput> referredProductCatalogId;
    private final Input<SearchableStringFilterInput> referredProductRetailerId;
    private final Input<SearchableStringFilterInput> replyType;
    private final Input<SearchableStringFilterInput> replyTypeId;
    private final Input<SearchableIDFilterInput> replyingToMessageId;
    private final Input<SearchableStringFilterInput> replyingToMessageIdExternal;
    private final Input<SearchableIDFilterInput> responseMessageId;
    private final Input<SearchableStringFilterInput> sentAt;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> text;
    private final Input<SearchableStringFilterInput> thumbnailUrl;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> visitorId;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> phoneNumberIdExternal = Input.absent();
        private Input<SearchableStringFilterInput> messagePlatform = Input.absent();
        private Input<SearchableStringFilterInput> externalMessageReferenceId = Input.absent();
        private Input<SearchableStringFilterInput> externalConversationId = Input.absent();
        private Input<SearchableStringFilterInput> recipientExternalId = Input.absent();
        private Input<SearchableStringFilterInput> recipientExternalIdType = Input.absent();
        private Input<SearchableIDFilterInput> channelId = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableIDFilterInput> visitorId = Input.absent();
        private Input<SearchableIDFilterInput> referredContactId = Input.absent();
        private Input<SearchableStringFilterInput> messageType = Input.absent();
        private Input<SearchableStringFilterInput> messageSubType = Input.absent();
        private Input<SearchableStringFilterInput> messageCategory = Input.absent();
        private Input<SearchableIDFilterInput> replyingToMessageId = Input.absent();
        private Input<SearchableStringFilterInput> replyingToMessageIdExternal = Input.absent();
        private Input<SearchableIDFilterInput> responseMessageId = Input.absent();
        private Input<SearchableStringFilterInput> followUpType = Input.absent();
        private Input<SearchableStringFilterInput> replyType = Input.absent();
        private Input<SearchableStringFilterInput> replyTypeId = Input.absent();
        private Input<SearchableStringFilterInput> referredProductCatalogId = Input.absent();
        private Input<SearchableStringFilterInput> referredProductRetailerId = Input.absent();
        private Input<SearchableStringFilterInput> referral = Input.absent();
        private Input<SearchableBooleanFilterInput> isStarred = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableStringFilterInput> errorMessages = Input.absent();
        private Input<SearchableStringFilterInput> sentAt = Input.absent();
        private Input<SearchableStringFilterInput> deliveredAt = Input.absent();
        private Input<SearchableStringFilterInput> readAt = Input.absent();
        private Input<SearchableIDFilterInput> internalTemplateId = Input.absent();
        private Input<SearchableStringFilterInput> externalTemplateId = Input.absent();
        private Input<SearchableStringFilterInput> externalTemplateCategory = Input.absent();
        private Input<SearchableStringFilterInput> text = Input.absent();
        private Input<SearchableStringFilterInput> contactObjectToSend = Input.absent();
        private Input<SearchableStringFilterInput> locationObjectToSend = Input.absent();
        private Input<SearchableStringFilterInput> adddressMessageParameters = Input.absent();
        private Input<SearchableStringFilterInput> headerText = Input.absent();
        private Input<SearchableStringFilterInput> footerText = Input.absent();
        private Input<SearchableStringFilterInput> headerType = Input.absent();
        private Input<SearchableIDFilterInput> mediaObjectId = Input.absent();
        private Input<SearchableStringFilterInput> mediaMetadata = Input.absent();
        private Input<SearchableBooleanFilterInput> hasImage = Input.absent();
        private Input<SearchableStringFilterInput> thumbnailUrl = Input.absent();
        private Input<SearchableBooleanFilterInput> isInbound = Input.absent();
        private Input<SearchableIDFilterInput> chatUserId = Input.absent();
        private Input<SearchableStringFilterInput> chatUserName = Input.absent();
        private Input<SearchableIDFilterInput> chatBotId = Input.absent();
        private Input<SearchableIDFilterInput> chatUserAccountIdIfExternal = Input.absent();
        private Input<SearchableStringFilterInput> chatUserAccountNameIfExternal = Input.absent();
        private Input<SearchableIDFilterInput> directChatUserId = Input.absent();
        private Input<SearchableIDFilterInput> primaryTeamId = Input.absent();
        private Input<SearchableIDFilterInput> linkedEngagementIdIfBroadcast = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableChatMessageFilterInput>> and = Input.absent();
        private Input<List<SearchableChatMessageFilterInput>> or = Input.absent();
        private Input<SearchableChatMessageFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder adddressMessageParameters(SearchableStringFilterInput searchableStringFilterInput) {
            this.adddressMessageParameters = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder and(List<SearchableChatMessageFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableChatMessageFilterInput build() {
            return new SearchableChatMessageFilterInput(this.id, this.accountId, this.phoneNumberIdExternal, this.messagePlatform, this.externalMessageReferenceId, this.externalConversationId, this.recipientExternalId, this.recipientExternalIdType, this.channelId, this.contactId, this.visitorId, this.referredContactId, this.messageType, this.messageSubType, this.messageCategory, this.replyingToMessageId, this.replyingToMessageIdExternal, this.responseMessageId, this.followUpType, this.replyType, this.replyTypeId, this.referredProductCatalogId, this.referredProductRetailerId, this.referral, this.isStarred, this.status, this.errorMessages, this.sentAt, this.deliveredAt, this.readAt, this.internalTemplateId, this.externalTemplateId, this.externalTemplateCategory, this.text, this.contactObjectToSend, this.locationObjectToSend, this.adddressMessageParameters, this.headerText, this.footerText, this.headerType, this.mediaObjectId, this.mediaMetadata, this.hasImage, this.thumbnailUrl, this.isInbound, this.chatUserId, this.chatUserName, this.chatBotId, this.chatUserAccountIdIfExternal, this.chatUserAccountNameIfExternal, this.directChatUserId, this.primaryTeamId, this.linkedEngagementIdIfBroadcast, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder channelId(SearchableIDFilterInput searchableIDFilterInput) {
            this.channelId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder chatBotId(SearchableIDFilterInput searchableIDFilterInput) {
            this.chatBotId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder chatUserAccountIdIfExternal(SearchableIDFilterInput searchableIDFilterInput) {
            this.chatUserAccountIdIfExternal = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder chatUserAccountNameIfExternal(SearchableStringFilterInput searchableStringFilterInput) {
            this.chatUserAccountNameIfExternal = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder chatUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.chatUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder chatUserName(SearchableStringFilterInput searchableStringFilterInput) {
            this.chatUserName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactObjectToSend(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactObjectToSend = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder deliveredAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.deliveredAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder directChatUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.directChatUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder errorMessages(SearchableStringFilterInput searchableStringFilterInput) {
            this.errorMessages = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalConversationId(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalConversationId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalMessageReferenceId(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalMessageReferenceId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalTemplateCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalTemplateCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalTemplateId(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalTemplateId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder followUpType(SearchableStringFilterInput searchableStringFilterInput) {
            this.followUpType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder footerText(SearchableStringFilterInput searchableStringFilterInput) {
            this.footerText = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder hasImage(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.hasImage = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder headerText(SearchableStringFilterInput searchableStringFilterInput) {
            this.headerText = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder headerType(SearchableStringFilterInput searchableStringFilterInput) {
            this.headerType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder internalTemplateId(SearchableIDFilterInput searchableIDFilterInput) {
            this.internalTemplateId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder isInbound(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isInbound = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isStarred(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isStarred = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder linkedEngagementIdIfBroadcast(SearchableIDFilterInput searchableIDFilterInput) {
            this.linkedEngagementIdIfBroadcast = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder locationObjectToSend(SearchableStringFilterInput searchableStringFilterInput) {
            this.locationObjectToSend = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder mediaMetadata(SearchableStringFilterInput searchableStringFilterInput) {
            this.mediaMetadata = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder mediaObjectId(SearchableIDFilterInput searchableIDFilterInput) {
            this.mediaObjectId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder messageCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder messagePlatform(SearchableStringFilterInput searchableStringFilterInput) {
            this.messagePlatform = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder messageSubType(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageSubType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder messageType(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableChatMessageFilterInput searchableChatMessageFilterInput) {
            this.not = Input.fromNullable(searchableChatMessageFilterInput);
            return this;
        }

        public Builder or(List<SearchableChatMessageFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder phoneNumberIdExternal(SearchableStringFilterInput searchableStringFilterInput) {
            this.phoneNumberIdExternal = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder primaryTeamId(SearchableIDFilterInput searchableIDFilterInput) {
            this.primaryTeamId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder readAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.readAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder recipientExternalId(SearchableStringFilterInput searchableStringFilterInput) {
            this.recipientExternalId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder recipientExternalIdType(SearchableStringFilterInput searchableStringFilterInput) {
            this.recipientExternalIdType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder referral(SearchableStringFilterInput searchableStringFilterInput) {
            this.referral = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder referredContactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.referredContactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder referredProductCatalogId(SearchableStringFilterInput searchableStringFilterInput) {
            this.referredProductCatalogId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder referredProductRetailerId(SearchableStringFilterInput searchableStringFilterInput) {
            this.referredProductRetailerId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder replyType(SearchableStringFilterInput searchableStringFilterInput) {
            this.replyType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder replyTypeId(SearchableStringFilterInput searchableStringFilterInput) {
            this.replyTypeId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder replyingToMessageId(SearchableIDFilterInput searchableIDFilterInput) {
            this.replyingToMessageId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder replyingToMessageIdExternal(SearchableStringFilterInput searchableStringFilterInput) {
            this.replyingToMessageIdExternal = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder responseMessageId(SearchableIDFilterInput searchableIDFilterInput) {
            this.responseMessageId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder sentAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.sentAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder text(SearchableStringFilterInput searchableStringFilterInput) {
            this.text = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder thumbnailUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.thumbnailUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder visitorId(SearchableIDFilterInput searchableIDFilterInput) {
            this.visitorId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchableChatMessageFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableIDFilterInput> input9, Input<SearchableIDFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableIDFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableIDFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableIDFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableStringFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<SearchableBooleanFilterInput> input25, Input<SearchableStringFilterInput> input26, Input<SearchableStringFilterInput> input27, Input<SearchableStringFilterInput> input28, Input<SearchableStringFilterInput> input29, Input<SearchableStringFilterInput> input30, Input<SearchableIDFilterInput> input31, Input<SearchableStringFilterInput> input32, Input<SearchableStringFilterInput> input33, Input<SearchableStringFilterInput> input34, Input<SearchableStringFilterInput> input35, Input<SearchableStringFilterInput> input36, Input<SearchableStringFilterInput> input37, Input<SearchableStringFilterInput> input38, Input<SearchableStringFilterInput> input39, Input<SearchableStringFilterInput> input40, Input<SearchableIDFilterInput> input41, Input<SearchableStringFilterInput> input42, Input<SearchableBooleanFilterInput> input43, Input<SearchableStringFilterInput> input44, Input<SearchableBooleanFilterInput> input45, Input<SearchableIDFilterInput> input46, Input<SearchableStringFilterInput> input47, Input<SearchableIDFilterInput> input48, Input<SearchableIDFilterInput> input49, Input<SearchableStringFilterInput> input50, Input<SearchableIDFilterInput> input51, Input<SearchableIDFilterInput> input52, Input<SearchableIDFilterInput> input53, Input<SearchableStringFilterInput> input54, Input<SearchableStringFilterInput> input55, Input<List<SearchableChatMessageFilterInput>> input56, Input<List<SearchableChatMessageFilterInput>> input57, Input<SearchableChatMessageFilterInput> input58) {
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

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableStringFilterInput adddressMessageParameters() {
        return this.adddressMessageParameters.value;
    }

    public List<SearchableChatMessageFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput channelId() {
        return this.channelId.value;
    }

    public SearchableIDFilterInput chatBotId() {
        return this.chatBotId.value;
    }

    public SearchableIDFilterInput chatUserAccountIdIfExternal() {
        return this.chatUserAccountIdIfExternal.value;
    }

    public SearchableStringFilterInput chatUserAccountNameIfExternal() {
        return this.chatUserAccountNameIfExternal.value;
    }

    public SearchableIDFilterInput chatUserId() {
        return this.chatUserId.value;
    }

    public SearchableStringFilterInput chatUserName() {
        return this.chatUserName.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput contactObjectToSend() {
        return this.contactObjectToSend.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput deliveredAt() {
        return this.deliveredAt.value;
    }

    public SearchableIDFilterInput directChatUserId() {
        return this.directChatUserId.value;
    }

    public SearchableStringFilterInput errorMessages() {
        return this.errorMessages.value;
    }

    public SearchableStringFilterInput externalConversationId() {
        return this.externalConversationId.value;
    }

    public SearchableStringFilterInput externalMessageReferenceId() {
        return this.externalMessageReferenceId.value;
    }

    public SearchableStringFilterInput externalTemplateCategory() {
        return this.externalTemplateCategory.value;
    }

    public SearchableStringFilterInput externalTemplateId() {
        return this.externalTemplateId.value;
    }

    public SearchableStringFilterInput followUpType() {
        return this.followUpType.value;
    }

    public SearchableStringFilterInput footerText() {
        return this.footerText.value;
    }

    public SearchableBooleanFilterInput hasImage() {
        return this.hasImage.value;
    }

    public SearchableStringFilterInput headerText() {
        return this.headerText.value;
    }

    public SearchableStringFilterInput headerType() {
        return this.headerType.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableIDFilterInput internalTemplateId() {
        return this.internalTemplateId.value;
    }

    public SearchableBooleanFilterInput isInbound() {
        return this.isInbound.value;
    }

    public SearchableBooleanFilterInput isStarred() {
        return this.isStarred.value;
    }

    public SearchableIDFilterInput linkedEngagementIdIfBroadcast() {
        return this.linkedEngagementIdIfBroadcast.value;
    }

    public SearchableStringFilterInput locationObjectToSend() {
        return this.locationObjectToSend.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatMessageFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatMessageFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableChatMessageFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableChatMessageFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", SearchableChatMessageFilterInput.this.phoneNumberIdExternal.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeObject("messagePlatform", SearchableChatMessageFilterInput.this.messagePlatform.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.messagePlatform.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.externalMessageReferenceId.defined) {
                    inputFieldWriter.writeObject("externalMessageReferenceId", SearchableChatMessageFilterInput.this.externalMessageReferenceId.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.externalMessageReferenceId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.externalConversationId.defined) {
                    inputFieldWriter.writeObject("externalConversationId", SearchableChatMessageFilterInput.this.externalConversationId.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.externalConversationId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.recipientExternalId.defined) {
                    inputFieldWriter.writeObject("recipientExternalId", SearchableChatMessageFilterInput.this.recipientExternalId.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.recipientExternalId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.recipientExternalIdType.defined) {
                    inputFieldWriter.writeObject("recipientExternalIdType", SearchableChatMessageFilterInput.this.recipientExternalIdType.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.recipientExternalIdType.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", SearchableChatMessageFilterInput.this.channelId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.channelId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableChatMessageFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.visitorId.defined) {
                    inputFieldWriter.writeObject("visitorId", SearchableChatMessageFilterInput.this.visitorId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.visitorId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.referredContactId.defined) {
                    inputFieldWriter.writeObject("referredContactId", SearchableChatMessageFilterInput.this.referredContactId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.referredContactId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.messageType.defined) {
                    inputFieldWriter.writeObject("messageType", SearchableChatMessageFilterInput.this.messageType.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.messageType.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.messageSubType.defined) {
                    inputFieldWriter.writeObject("messageSubType", SearchableChatMessageFilterInput.this.messageSubType.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.messageSubType.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.messageCategory.defined) {
                    inputFieldWriter.writeObject("messageCategory", SearchableChatMessageFilterInput.this.messageCategory.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.messageCategory.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.replyingToMessageId.defined) {
                    inputFieldWriter.writeObject("replyingToMessageId", SearchableChatMessageFilterInput.this.replyingToMessageId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.replyingToMessageId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.replyingToMessageIdExternal.defined) {
                    inputFieldWriter.writeObject("replyingToMessageIdExternal", SearchableChatMessageFilterInput.this.replyingToMessageIdExternal.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.replyingToMessageIdExternal.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.responseMessageId.defined) {
                    inputFieldWriter.writeObject("responseMessageId", SearchableChatMessageFilterInput.this.responseMessageId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.responseMessageId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.followUpType.defined) {
                    inputFieldWriter.writeObject("followUpType", SearchableChatMessageFilterInput.this.followUpType.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.followUpType.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.replyType.defined) {
                    inputFieldWriter.writeObject("replyType", SearchableChatMessageFilterInput.this.replyType.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.replyType.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.replyTypeId.defined) {
                    inputFieldWriter.writeObject("replyTypeId", SearchableChatMessageFilterInput.this.replyTypeId.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.replyTypeId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.referredProductCatalogId.defined) {
                    inputFieldWriter.writeObject("referredProductCatalogId", SearchableChatMessageFilterInput.this.referredProductCatalogId.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.referredProductCatalogId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.referredProductRetailerId.defined) {
                    inputFieldWriter.writeObject("referredProductRetailerId", SearchableChatMessageFilterInput.this.referredProductRetailerId.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.referredProductRetailerId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.referral.defined) {
                    inputFieldWriter.writeObject("referral", SearchableChatMessageFilterInput.this.referral.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.referral.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.isStarred.defined) {
                    inputFieldWriter.writeObject("isStarred", SearchableChatMessageFilterInput.this.isStarred.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatMessageFilterInput.this.isStarred.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableChatMessageFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.errorMessages.defined) {
                    inputFieldWriter.writeObject("errorMessages", SearchableChatMessageFilterInput.this.errorMessages.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.errorMessages.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.sentAt.defined) {
                    inputFieldWriter.writeObject("sentAt", SearchableChatMessageFilterInput.this.sentAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.sentAt.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.deliveredAt.defined) {
                    inputFieldWriter.writeObject("deliveredAt", SearchableChatMessageFilterInput.this.deliveredAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.deliveredAt.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.readAt.defined) {
                    inputFieldWriter.writeObject("readAt", SearchableChatMessageFilterInput.this.readAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.readAt.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.internalTemplateId.defined) {
                    inputFieldWriter.writeObject("internalTemplateId", SearchableChatMessageFilterInput.this.internalTemplateId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.internalTemplateId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.externalTemplateId.defined) {
                    inputFieldWriter.writeObject("externalTemplateId", SearchableChatMessageFilterInput.this.externalTemplateId.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.externalTemplateId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.externalTemplateCategory.defined) {
                    inputFieldWriter.writeObject("externalTemplateCategory", SearchableChatMessageFilterInput.this.externalTemplateCategory.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.externalTemplateCategory.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.text.defined) {
                    inputFieldWriter.writeObject("text", SearchableChatMessageFilterInput.this.text.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.text.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.contactObjectToSend.defined) {
                    inputFieldWriter.writeObject("contactObjectToSend", SearchableChatMessageFilterInput.this.contactObjectToSend.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.contactObjectToSend.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.locationObjectToSend.defined) {
                    inputFieldWriter.writeObject("locationObjectToSend", SearchableChatMessageFilterInput.this.locationObjectToSend.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.locationObjectToSend.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.adddressMessageParameters.defined) {
                    inputFieldWriter.writeObject("adddressMessageParameters", SearchableChatMessageFilterInput.this.adddressMessageParameters.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.adddressMessageParameters.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.headerText.defined) {
                    inputFieldWriter.writeObject("headerText", SearchableChatMessageFilterInput.this.headerText.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.headerText.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.footerText.defined) {
                    inputFieldWriter.writeObject("footerText", SearchableChatMessageFilterInput.this.footerText.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.footerText.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.headerType.defined) {
                    inputFieldWriter.writeObject("headerType", SearchableChatMessageFilterInput.this.headerType.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.headerType.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.mediaObjectId.defined) {
                    inputFieldWriter.writeObject("mediaObjectId", SearchableChatMessageFilterInput.this.mediaObjectId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.mediaObjectId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.mediaMetadata.defined) {
                    inputFieldWriter.writeObject("mediaMetadata", SearchableChatMessageFilterInput.this.mediaMetadata.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.mediaMetadata.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.hasImage.defined) {
                    inputFieldWriter.writeObject("hasImage", SearchableChatMessageFilterInput.this.hasImage.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatMessageFilterInput.this.hasImage.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.thumbnailUrl.defined) {
                    inputFieldWriter.writeObject("thumbnailUrl", SearchableChatMessageFilterInput.this.thumbnailUrl.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.thumbnailUrl.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.isInbound.defined) {
                    inputFieldWriter.writeObject("isInbound", SearchableChatMessageFilterInput.this.isInbound.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatMessageFilterInput.this.isInbound.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.chatUserId.defined) {
                    inputFieldWriter.writeObject("chatUserId", SearchableChatMessageFilterInput.this.chatUserId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.chatUserId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.chatUserName.defined) {
                    inputFieldWriter.writeObject("chatUserName", SearchableChatMessageFilterInput.this.chatUserName.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.chatUserName.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.chatBotId.defined) {
                    inputFieldWriter.writeObject("chatBotId", SearchableChatMessageFilterInput.this.chatBotId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.chatBotId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.chatUserAccountIdIfExternal.defined) {
                    inputFieldWriter.writeObject("chatUserAccountIdIfExternal", SearchableChatMessageFilterInput.this.chatUserAccountIdIfExternal.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.chatUserAccountIdIfExternal.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.chatUserAccountNameIfExternal.defined) {
                    inputFieldWriter.writeObject("chatUserAccountNameIfExternal", SearchableChatMessageFilterInput.this.chatUserAccountNameIfExternal.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.chatUserAccountNameIfExternal.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.directChatUserId.defined) {
                    inputFieldWriter.writeObject("directChatUserId", SearchableChatMessageFilterInput.this.directChatUserId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.directChatUserId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", SearchableChatMessageFilterInput.this.primaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.linkedEngagementIdIfBroadcast.defined) {
                    inputFieldWriter.writeObject("linkedEngagementIdIfBroadcast", SearchableChatMessageFilterInput.this.linkedEngagementIdIfBroadcast.value != 0 ? ((SearchableIDFilterInput) SearchableChatMessageFilterInput.this.linkedEngagementIdIfBroadcast.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableChatMessageFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableChatMessageFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatMessageFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableChatMessageFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableChatMessageFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatMessageFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatMessageFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatMessageFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatMessageFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableChatMessageFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatMessageFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatMessageFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatMessageFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatMessageFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableChatMessageFilterInput.this.not.value != 0 ? ((SearchableChatMessageFilterInput) SearchableChatMessageFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput mediaMetadata() {
        return this.mediaMetadata.value;
    }

    public SearchableIDFilterInput mediaObjectId() {
        return this.mediaObjectId.value;
    }

    public SearchableStringFilterInput messageCategory() {
        return this.messageCategory.value;
    }

    public SearchableStringFilterInput messagePlatform() {
        return this.messagePlatform.value;
    }

    public SearchableStringFilterInput messageSubType() {
        return this.messageSubType.value;
    }

    public SearchableStringFilterInput messageType() {
        return this.messageType.value;
    }

    public SearchableChatMessageFilterInput not() {
        return this.not.value;
    }

    public List<SearchableChatMessageFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public SearchableIDFilterInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public SearchableStringFilterInput readAt() {
        return this.readAt.value;
    }

    public SearchableStringFilterInput recipientExternalId() {
        return this.recipientExternalId.value;
    }

    public SearchableStringFilterInput recipientExternalIdType() {
        return this.recipientExternalIdType.value;
    }

    public SearchableStringFilterInput referral() {
        return this.referral.value;
    }

    public SearchableIDFilterInput referredContactId() {
        return this.referredContactId.value;
    }

    public SearchableStringFilterInput referredProductCatalogId() {
        return this.referredProductCatalogId.value;
    }

    public SearchableStringFilterInput referredProductRetailerId() {
        return this.referredProductRetailerId.value;
    }

    public SearchableStringFilterInput replyType() {
        return this.replyType.value;
    }

    public SearchableStringFilterInput replyTypeId() {
        return this.replyTypeId.value;
    }

    public SearchableIDFilterInput replyingToMessageId() {
        return this.replyingToMessageId.value;
    }

    public SearchableStringFilterInput replyingToMessageIdExternal() {
        return this.replyingToMessageIdExternal.value;
    }

    public SearchableIDFilterInput responseMessageId() {
        return this.responseMessageId.value;
    }

    public SearchableStringFilterInput sentAt() {
        return this.sentAt.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput text() {
        return this.text.value;
    }

    public SearchableStringFilterInput thumbnailUrl() {
        return this.thumbnailUrl.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput visitorId() {
        return this.visitorId.value;
    }
}
