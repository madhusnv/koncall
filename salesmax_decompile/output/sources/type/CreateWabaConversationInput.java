package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CreateWabaConversationInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> category;
    private final Input<String> channelId;
    private final String conversationId;
    private final Input<String> conversationInitiatedByUserId;
    private final Input<String> createdAt;
    private final Input<String> displayPhoneNumber;
    private final Input<String> expirationTimestamp;
    private final Input<String> initiatingMessageExternalId;
    private final Input<String> initiatingMessageId;
    private final Input<Boolean> isBillable;
    private final Input<MessageSendCategory> messageSendCategory;
    private final Input<String> originType;
    private final Input<String> phoneNumberId;
    private final Input<String> pricingModel;
    private final Input<String> recipientId;
    private final Input<String> updatedAt;
    private final Input<String> wabaAccountId;

    public static final class Builder {
        private String conversationId;
        private Input<String> originType = Input.absent();
        private Input<String> category = Input.absent();
        private Input<Boolean> isBillable = Input.absent();
        private Input<String> pricingModel = Input.absent();
        private Input<String> expirationTimestamp = Input.absent();
        private Input<String> recipientId = Input.absent();
        private Input<String> channelId = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> wabaAccountId = Input.absent();
        private Input<String> displayPhoneNumber = Input.absent();
        private Input<String> phoneNumberId = Input.absent();
        private Input<MessageSendCategory> messageSendCategory = Input.absent();
        private Input<String> initiatingMessageExternalId = Input.absent();
        private Input<String> initiatingMessageId = Input.absent();
        private Input<String> conversationInitiatedByUserId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public CreateWabaConversationInput build() {
            Utils.checkNotNull(this.conversationId, "conversationId == null");
            return new CreateWabaConversationInput(this.conversationId, this.originType, this.category, this.isBillable, this.pricingModel, this.expirationTimestamp, this.recipientId, this.channelId, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.messageSendCategory, this.initiatingMessageExternalId, this.initiatingMessageId, this.conversationInitiatedByUserId, this.createdAt, this.updatedAt);
        }

        public Builder category(String str) {
            this.category = Input.fromNullable(str);
            return this;
        }

        public Builder channelId(String str) {
            this.channelId = Input.fromNullable(str);
            return this;
        }

        public Builder conversationId(String str) {
            this.conversationId = str;
            return this;
        }

        public Builder conversationInitiatedByUserId(String str) {
            this.conversationInitiatedByUserId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder displayPhoneNumber(String str) {
            this.displayPhoneNumber = Input.fromNullable(str);
            return this;
        }

        public Builder expirationTimestamp(String str) {
            this.expirationTimestamp = Input.fromNullable(str);
            return this;
        }

        public Builder initiatingMessageExternalId(String str) {
            this.initiatingMessageExternalId = Input.fromNullable(str);
            return this;
        }

        public Builder initiatingMessageId(String str) {
            this.initiatingMessageId = Input.fromNullable(str);
            return this;
        }

        public Builder isBillable(Boolean bool) {
            this.isBillable = Input.fromNullable(bool);
            return this;
        }

        public Builder messageSendCategory(MessageSendCategory messageSendCategory) {
            this.messageSendCategory = Input.fromNullable(messageSendCategory);
            return this;
        }

        public Builder originType(String str) {
            this.originType = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumberId(String str) {
            this.phoneNumberId = Input.fromNullable(str);
            return this;
        }

        public Builder pricingModel(String str) {
            this.pricingModel = Input.fromNullable(str);
            return this;
        }

        public Builder recipientId(String str) {
            this.recipientId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder wabaAccountId(String str) {
            this.wabaAccountId = Input.fromNullable(str);
            return this;
        }
    }

    public CreateWabaConversationInput(String str, Input<String> input, Input<String> input2, Input<Boolean> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<MessageSendCategory> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17) {
        this.conversationId = str;
        this.originType = input;
        this.category = input2;
        this.isBillable = input3;
        this.pricingModel = input4;
        this.expirationTimestamp = input5;
        this.recipientId = input6;
        this.channelId = input7;
        this.accountId = input8;
        this.wabaAccountId = input9;
        this.displayPhoneNumber = input10;
        this.phoneNumberId = input11;
        this.messageSendCategory = input12;
        this.initiatingMessageExternalId = input13;
        this.initiatingMessageId = input14;
        this.conversationInitiatedByUserId = input15;
        this.createdAt = input16;
        this.updatedAt = input17;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String category() {
        return this.category.value;
    }

    public String channelId() {
        return this.channelId.value;
    }

    public String conversationId() {
        return this.conversationId;
    }

    public String conversationInitiatedByUserId() {
        return this.conversationInitiatedByUserId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String displayPhoneNumber() {
        return this.displayPhoneNumber.value;
    }

    public String expirationTimestamp() {
        return this.expirationTimestamp.value;
    }

    public String initiatingMessageExternalId() {
        return this.initiatingMessageExternalId.value;
    }

    public String initiatingMessageId() {
        return this.initiatingMessageId.value;
    }

    public Boolean isBillable() {
        return this.isBillable.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateWabaConversationInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("conversationId", CreateWabaConversationInput.this.conversationId);
                if (CreateWabaConversationInput.this.originType.defined) {
                    inputFieldWriter.writeString("originType", (String) CreateWabaConversationInput.this.originType.value);
                }
                if (CreateWabaConversationInput.this.category.defined) {
                    inputFieldWriter.writeString("category", (String) CreateWabaConversationInput.this.category.value);
                }
                if (CreateWabaConversationInput.this.isBillable.defined) {
                    inputFieldWriter.writeBoolean("isBillable", (Boolean) CreateWabaConversationInput.this.isBillable.value);
                }
                if (CreateWabaConversationInput.this.pricingModel.defined) {
                    inputFieldWriter.writeString("pricingModel", (String) CreateWabaConversationInput.this.pricingModel.value);
                }
                if (CreateWabaConversationInput.this.expirationTimestamp.defined) {
                    inputFieldWriter.writeString("expirationTimestamp", (String) CreateWabaConversationInput.this.expirationTimestamp.value);
                }
                if (CreateWabaConversationInput.this.recipientId.defined) {
                    inputFieldWriter.writeString("recipientId", (String) CreateWabaConversationInput.this.recipientId.value);
                }
                if (CreateWabaConversationInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) CreateWabaConversationInput.this.channelId.value);
                }
                if (CreateWabaConversationInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) CreateWabaConversationInput.this.accountId.value);
                }
                if (CreateWabaConversationInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeString("wabaAccountId", (String) CreateWabaConversationInput.this.wabaAccountId.value);
                }
                if (CreateWabaConversationInput.this.displayPhoneNumber.defined) {
                    inputFieldWriter.writeString("displayPhoneNumber", (String) CreateWabaConversationInput.this.displayPhoneNumber.value);
                }
                if (CreateWabaConversationInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeString("phoneNumberId", (String) CreateWabaConversationInput.this.phoneNumberId.value);
                }
                if (CreateWabaConversationInput.this.messageSendCategory.defined) {
                    inputFieldWriter.writeString("messageSendCategory", CreateWabaConversationInput.this.messageSendCategory.value != 0 ? ((MessageSendCategory) CreateWabaConversationInput.this.messageSendCategory.value).name() : null);
                }
                if (CreateWabaConversationInput.this.initiatingMessageExternalId.defined) {
                    inputFieldWriter.writeString("initiatingMessageExternalId", (String) CreateWabaConversationInput.this.initiatingMessageExternalId.value);
                }
                if (CreateWabaConversationInput.this.initiatingMessageId.defined) {
                    inputFieldWriter.writeString("initiatingMessageId", (String) CreateWabaConversationInput.this.initiatingMessageId.value);
                }
                if (CreateWabaConversationInput.this.conversationInitiatedByUserId.defined) {
                    inputFieldWriter.writeString("conversationInitiatedByUserId", (String) CreateWabaConversationInput.this.conversationInitiatedByUserId.value);
                }
                if (CreateWabaConversationInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateWabaConversationInput.this.createdAt.value);
                }
                if (CreateWabaConversationInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateWabaConversationInput.this.updatedAt.value);
                }
            }
        };
    }

    public MessageSendCategory messageSendCategory() {
        return this.messageSendCategory.value;
    }

    public String originType() {
        return this.originType.value;
    }

    public String phoneNumberId() {
        return this.phoneNumberId.value;
    }

    public String pricingModel() {
        return this.pricingModel.value;
    }

    public String recipientId() {
        return this.recipientId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String wabaAccountId() {
        return this.wabaAccountId.value;
    }
}
