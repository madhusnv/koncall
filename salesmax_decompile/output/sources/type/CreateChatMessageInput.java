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
public final class CreateChatMessageInput implements InputType {
    private final String accountId;
    private final Input<ActionInteractiveInput> actionInteractive;
    private final Input<String> adddressMessageParameters;
    private final Input<List<WaButtonInput>> buttons;
    private final Input<String> channelId;
    private final Input<String> chatUserAccountIdIfExternal;
    private final Input<String> chatUserAccountNameIfExternal;
    private final Input<String> chatUserId;
    private final Input<String> chatUserName;
    private final Input<String> contactId;
    private final Input<List<String>> contactObjectToSend;
    private final Input<String> createdAt;
    private final Input<String> directChatUserId;
    private final Input<String> errorMessages;
    private final Input<String> externalMessageReferenceId;
    private final Input<String> externalTemplateId;
    private final Input<String> followUpType;
    private final Input<String> footerText;
    private final Input<Boolean> hasImage;
    private final Input<String> headerText;
    private final Input<String> headerType;
    private final Input<String> id;
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
    private final Input<String> messageSubType;
    private final Input<String> messageType;
    private final Input<List<TemplateParameterInput>> parameters;
    private final Input<String> phoneNumberIdExternal;
    private final Input<String> primaryTeamId;
    private final Input<List<WaProductItemInput>> productItems;
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
    private final Input<String> status;
    private final Input<String> text;
    private final Input<String> thumbnailUrl;
    private final Input<String> updatedAt;
    private final Input<String> visitorId;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
        private Input<String> phoneNumberIdExternal = Input.absent();
        private Input<String> messagePlatform = Input.absent();
        private Input<String> externalMessageReferenceId = Input.absent();
        private Input<String> recipientExternalId = Input.absent();
        private Input<String> recipientExternalIdType = Input.absent();
        private Input<String> channelId = Input.absent();
        private Input<String> visitorId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> referredContactId = Input.absent();
        private Input<String> messageType = Input.absent();
        private Input<String> messageSubType = Input.absent();
        private Input<String> messageCategory = Input.absent();
        private Input<String> replyingToMessageId = Input.absent();
        private Input<String> replyingToMessageIdExternal = Input.absent();
        private Input<String> replyType = Input.absent();
        private Input<String> replyTypeId = Input.absent();
        private Input<String> referredProductCatalogId = Input.absent();
        private Input<String> referredProductRetailerId = Input.absent();
        private Input<List<WaProductItemInput>> productItems = Input.absent();
        private Input<String> referral = Input.absent();
        private Input<String> linkedEngagementIdIfBroadcast = Input.absent();
        private Input<Boolean> isStarred = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> errorMessages = Input.absent();
        private Input<String> internalTemplateId = Input.absent();
        private Input<String> externalTemplateId = Input.absent();
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
        private Input<String> directChatUserId = Input.absent();
        private Input<List<MentionedEntitiesInput>> mentioned = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> responseMessageId = Input.absent();
        private Input<String> followUpType = Input.absent();
        private Input<String> chatUserName = Input.absent();
        private Input<String> chatUserAccountIdIfExternal = Input.absent();
        private Input<String> chatUserAccountNameIfExternal = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
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

        public CreateChatMessageInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateChatMessageInput(this.id, this.accountId, this.phoneNumberIdExternal, this.messagePlatform, this.externalMessageReferenceId, this.recipientExternalId, this.recipientExternalIdType, this.channelId, this.visitorId, this.contactId, this.referredContactId, this.messageType, this.messageSubType, this.messageCategory, this.replyingToMessageId, this.replyingToMessageIdExternal, this.replyType, this.replyTypeId, this.referredProductCatalogId, this.referredProductRetailerId, this.productItems, this.referral, this.linkedEngagementIdIfBroadcast, this.isStarred, this.status, this.errorMessages, this.internalTemplateId, this.externalTemplateId, this.text, this.contactObjectToSend, this.locationObjectToSend, this.adddressMessageParameters, this.headerText, this.footerText, this.headerType, this.actionInteractive, this.buttons, this.parameters, this.mediaObjectId, this.mediaMetadata, this.hasImage, this.thumbnailUrl, this.isInbound, this.chatUserId, this.directChatUserId, this.mentioned, this.primaryTeamId, this.responseMessageId, this.followUpType, this.chatUserName, this.chatUserAccountIdIfExternal, this.chatUserAccountNameIfExternal, this.createdAt, this.updatedAt);
        }

        public Builder buttons(List<WaButtonInput> list) {
            this.buttons = Input.fromNullable(list);
            return this;
        }

        public Builder channelId(String str) {
            this.channelId = Input.fromNullable(str);
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

        public Builder directChatUserId(String str) {
            this.directChatUserId = Input.fromNullable(str);
            return this;
        }

        public Builder errorMessages(String str) {
            this.errorMessages = Input.fromNullable(str);
            return this;
        }

        public Builder externalMessageReferenceId(String str) {
            this.externalMessageReferenceId = Input.fromNullable(str);
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
            this.id = Input.fromNullable(str);
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

    public CreateChatMessageInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<List<WaProductItemInput>> input20, Input<String> input21, Input<String> input22, Input<Boolean> input23, Input<String> input24, Input<String> input25, Input<String> input26, Input<String> input27, Input<String> input28, Input<List<String>> input29, Input<String> input30, Input<String> input31, Input<String> input32, Input<String> input33, Input<String> input34, Input<ActionInteractiveInput> input35, Input<List<WaButtonInput>> input36, Input<List<TemplateParameterInput>> input37, Input<String> input38, Input<String> input39, Input<Boolean> input40, Input<String> input41, Input<Boolean> input42, Input<String> input43, Input<String> input44, Input<List<MentionedEntitiesInput>> input45, Input<String> input46, Input<String> input47, Input<String> input48, Input<String> input49, Input<String> input50, Input<String> input51, Input<String> input52, Input<String> input53) {
        this.id = input;
        this.accountId = str;
        this.phoneNumberIdExternal = input2;
        this.messagePlatform = input3;
        this.externalMessageReferenceId = input4;
        this.recipientExternalId = input5;
        this.recipientExternalIdType = input6;
        this.channelId = input7;
        this.visitorId = input8;
        this.contactId = input9;
        this.referredContactId = input10;
        this.messageType = input11;
        this.messageSubType = input12;
        this.messageCategory = input13;
        this.replyingToMessageId = input14;
        this.replyingToMessageIdExternal = input15;
        this.replyType = input16;
        this.replyTypeId = input17;
        this.referredProductCatalogId = input18;
        this.referredProductRetailerId = input19;
        this.productItems = input20;
        this.referral = input21;
        this.linkedEngagementIdIfBroadcast = input22;
        this.isStarred = input23;
        this.status = input24;
        this.errorMessages = input25;
        this.internalTemplateId = input26;
        this.externalTemplateId = input27;
        this.text = input28;
        this.contactObjectToSend = input29;
        this.locationObjectToSend = input30;
        this.adddressMessageParameters = input31;
        this.headerText = input32;
        this.footerText = input33;
        this.headerType = input34;
        this.actionInteractive = input35;
        this.buttons = input36;
        this.parameters = input37;
        this.mediaObjectId = input38;
        this.mediaMetadata = input39;
        this.hasImage = input40;
        this.thumbnailUrl = input41;
        this.isInbound = input42;
        this.chatUserId = input43;
        this.directChatUserId = input44;
        this.mentioned = input45;
        this.primaryTeamId = input46;
        this.responseMessageId = input47;
        this.followUpType = input48;
        this.chatUserName = input49;
        this.chatUserAccountIdIfExternal = input50;
        this.chatUserAccountNameIfExternal = input51;
        this.createdAt = input52;
        this.updatedAt = input53;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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

    public String directChatUserId() {
        return this.directChatUserId.value;
    }

    public String errorMessages() {
        return this.errorMessages.value;
    }

    public String externalMessageReferenceId() {
        return this.externalMessageReferenceId.value;
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
        return this.id.value;
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
        return new InputFieldMarshaller() { // from class: type.CreateChatMessageInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateChatMessageInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateChatMessageInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateChatMessageInput.this.accountId);
                if (CreateChatMessageInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeString("phoneNumberIdExternal", (String) CreateChatMessageInput.this.phoneNumberIdExternal.value);
                }
                if (CreateChatMessageInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeString("messagePlatform", (String) CreateChatMessageInput.this.messagePlatform.value);
                }
                if (CreateChatMessageInput.this.externalMessageReferenceId.defined) {
                    inputFieldWriter.writeString("externalMessageReferenceId", (String) CreateChatMessageInput.this.externalMessageReferenceId.value);
                }
                if (CreateChatMessageInput.this.recipientExternalId.defined) {
                    inputFieldWriter.writeString("recipientExternalId", (String) CreateChatMessageInput.this.recipientExternalId.value);
                }
                if (CreateChatMessageInput.this.recipientExternalIdType.defined) {
                    inputFieldWriter.writeString("recipientExternalIdType", (String) CreateChatMessageInput.this.recipientExternalIdType.value);
                }
                if (CreateChatMessageInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) CreateChatMessageInput.this.channelId.value);
                }
                if (CreateChatMessageInput.this.visitorId.defined) {
                    inputFieldWriter.writeString("visitorId", (String) CreateChatMessageInput.this.visitorId.value);
                }
                if (CreateChatMessageInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateChatMessageInput.this.contactId.value);
                }
                if (CreateChatMessageInput.this.referredContactId.defined) {
                    inputFieldWriter.writeString("referredContactId", (String) CreateChatMessageInput.this.referredContactId.value);
                }
                if (CreateChatMessageInput.this.messageType.defined) {
                    inputFieldWriter.writeString("messageType", (String) CreateChatMessageInput.this.messageType.value);
                }
                if (CreateChatMessageInput.this.messageSubType.defined) {
                    inputFieldWriter.writeString("messageSubType", (String) CreateChatMessageInput.this.messageSubType.value);
                }
                if (CreateChatMessageInput.this.messageCategory.defined) {
                    inputFieldWriter.writeString("messageCategory", (String) CreateChatMessageInput.this.messageCategory.value);
                }
                if (CreateChatMessageInput.this.replyingToMessageId.defined) {
                    inputFieldWriter.writeString("replyingToMessageId", (String) CreateChatMessageInput.this.replyingToMessageId.value);
                }
                if (CreateChatMessageInput.this.replyingToMessageIdExternal.defined) {
                    inputFieldWriter.writeString("replyingToMessageIdExternal", (String) CreateChatMessageInput.this.replyingToMessageIdExternal.value);
                }
                if (CreateChatMessageInput.this.replyType.defined) {
                    inputFieldWriter.writeString("replyType", (String) CreateChatMessageInput.this.replyType.value);
                }
                if (CreateChatMessageInput.this.replyTypeId.defined) {
                    inputFieldWriter.writeString("replyTypeId", (String) CreateChatMessageInput.this.replyTypeId.value);
                }
                if (CreateChatMessageInput.this.referredProductCatalogId.defined) {
                    inputFieldWriter.writeString("referredProductCatalogId", (String) CreateChatMessageInput.this.referredProductCatalogId.value);
                }
                if (CreateChatMessageInput.this.referredProductRetailerId.defined) {
                    inputFieldWriter.writeString("referredProductRetailerId", (String) CreateChatMessageInput.this.referredProductRetailerId.value);
                }
                if (CreateChatMessageInput.this.productItems.defined) {
                    inputFieldWriter.writeList("productItems", CreateChatMessageInput.this.productItems.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatMessageInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatMessageInput.this.productItems.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((WaProductItemInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateChatMessageInput.this.referral.defined) {
                    inputFieldWriter.writeString("referral", (String) CreateChatMessageInput.this.referral.value);
                }
                if (CreateChatMessageInput.this.linkedEngagementIdIfBroadcast.defined) {
                    inputFieldWriter.writeString("linkedEngagementIdIfBroadcast", (String) CreateChatMessageInput.this.linkedEngagementIdIfBroadcast.value);
                }
                if (CreateChatMessageInput.this.isStarred.defined) {
                    inputFieldWriter.writeBoolean("isStarred", (Boolean) CreateChatMessageInput.this.isStarred.value);
                }
                if (CreateChatMessageInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateChatMessageInput.this.status.value);
                }
                if (CreateChatMessageInput.this.errorMessages.defined) {
                    inputFieldWriter.writeString("errorMessages", (String) CreateChatMessageInput.this.errorMessages.value);
                }
                if (CreateChatMessageInput.this.internalTemplateId.defined) {
                    inputFieldWriter.writeString("internalTemplateId", (String) CreateChatMessageInput.this.internalTemplateId.value);
                }
                if (CreateChatMessageInput.this.externalTemplateId.defined) {
                    inputFieldWriter.writeString("externalTemplateId", (String) CreateChatMessageInput.this.externalTemplateId.value);
                }
                if (CreateChatMessageInput.this.text.defined) {
                    inputFieldWriter.writeString("text", (String) CreateChatMessageInput.this.text.value);
                }
                if (CreateChatMessageInput.this.contactObjectToSend.defined) {
                    inputFieldWriter.writeList("contactObjectToSend", CreateChatMessageInput.this.contactObjectToSend.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatMessageInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatMessageInput.this.contactObjectToSend.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSJSON, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateChatMessageInput.this.locationObjectToSend.defined) {
                    inputFieldWriter.writeString("locationObjectToSend", (String) CreateChatMessageInput.this.locationObjectToSend.value);
                }
                if (CreateChatMessageInput.this.adddressMessageParameters.defined) {
                    inputFieldWriter.writeString("adddressMessageParameters", (String) CreateChatMessageInput.this.adddressMessageParameters.value);
                }
                if (CreateChatMessageInput.this.headerText.defined) {
                    inputFieldWriter.writeString("headerText", (String) CreateChatMessageInput.this.headerText.value);
                }
                if (CreateChatMessageInput.this.footerText.defined) {
                    inputFieldWriter.writeString("footerText", (String) CreateChatMessageInput.this.footerText.value);
                }
                if (CreateChatMessageInput.this.headerType.defined) {
                    inputFieldWriter.writeString("headerType", (String) CreateChatMessageInput.this.headerType.value);
                }
                if (CreateChatMessageInput.this.actionInteractive.defined) {
                    inputFieldWriter.writeObject("actionInteractive", CreateChatMessageInput.this.actionInteractive.value != 0 ? ((ActionInteractiveInput) CreateChatMessageInput.this.actionInteractive.value).marshaller() : null);
                }
                if (CreateChatMessageInput.this.buttons.defined) {
                    inputFieldWriter.writeList("buttons", CreateChatMessageInput.this.buttons.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatMessageInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatMessageInput.this.buttons.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((WaButtonInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateChatMessageInput.this.parameters.defined) {
                    inputFieldWriter.writeList("parameters", CreateChatMessageInput.this.parameters.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatMessageInput.1.4
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatMessageInput.this.parameters.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TemplateParameterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateChatMessageInput.this.mediaObjectId.defined) {
                    inputFieldWriter.writeString("mediaObjectId", (String) CreateChatMessageInput.this.mediaObjectId.value);
                }
                if (CreateChatMessageInput.this.mediaMetadata.defined) {
                    inputFieldWriter.writeString("mediaMetadata", (String) CreateChatMessageInput.this.mediaMetadata.value);
                }
                if (CreateChatMessageInput.this.hasImage.defined) {
                    inputFieldWriter.writeBoolean("hasImage", (Boolean) CreateChatMessageInput.this.hasImage.value);
                }
                if (CreateChatMessageInput.this.thumbnailUrl.defined) {
                    inputFieldWriter.writeString("thumbnailUrl", (String) CreateChatMessageInput.this.thumbnailUrl.value);
                }
                if (CreateChatMessageInput.this.isInbound.defined) {
                    inputFieldWriter.writeBoolean("isInbound", (Boolean) CreateChatMessageInput.this.isInbound.value);
                }
                if (CreateChatMessageInput.this.chatUserId.defined) {
                    inputFieldWriter.writeString("chatUserId", (String) CreateChatMessageInput.this.chatUserId.value);
                }
                if (CreateChatMessageInput.this.directChatUserId.defined) {
                    inputFieldWriter.writeString("directChatUserId", (String) CreateChatMessageInput.this.directChatUserId.value);
                }
                if (CreateChatMessageInput.this.mentioned.defined) {
                    inputFieldWriter.writeList("mentioned", CreateChatMessageInput.this.mentioned.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatMessageInput.1.5
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatMessageInput.this.mentioned.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MentionedEntitiesInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateChatMessageInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) CreateChatMessageInput.this.primaryTeamId.value);
                }
                if (CreateChatMessageInput.this.responseMessageId.defined) {
                    inputFieldWriter.writeString("responseMessageId", (String) CreateChatMessageInput.this.responseMessageId.value);
                }
                if (CreateChatMessageInput.this.followUpType.defined) {
                    inputFieldWriter.writeString("followUpType", (String) CreateChatMessageInput.this.followUpType.value);
                }
                if (CreateChatMessageInput.this.chatUserName.defined) {
                    inputFieldWriter.writeString("chatUserName", (String) CreateChatMessageInput.this.chatUserName.value);
                }
                if (CreateChatMessageInput.this.chatUserAccountIdIfExternal.defined) {
                    inputFieldWriter.writeString("chatUserAccountIdIfExternal", (String) CreateChatMessageInput.this.chatUserAccountIdIfExternal.value);
                }
                if (CreateChatMessageInput.this.chatUserAccountNameIfExternal.defined) {
                    inputFieldWriter.writeString("chatUserAccountNameIfExternal", (String) CreateChatMessageInput.this.chatUserAccountNameIfExternal.value);
                }
                if (CreateChatMessageInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateChatMessageInput.this.createdAt.value);
                }
                if (CreateChatMessageInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateChatMessageInput.this.updatedAt.value);
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
