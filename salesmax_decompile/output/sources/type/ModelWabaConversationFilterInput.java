package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaConversationFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaConversationFilterInput>> and;
    private final Input<ModelStringInput> category;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelIDInput> conversationId;
    private final Input<ModelIDInput> conversationInitiatedByUserId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> displayPhoneNumber;
    private final Input<ModelStringInput> expirationTimestamp;
    private final Input<ModelIDInput> initiatingMessageExternalId;
    private final Input<ModelIDInput> initiatingMessageId;
    private final Input<ModelBooleanInput> isBillable;
    private final Input<ModelMessageSendCategoryInput> messageSendCategory;
    private final Input<ModelWabaConversationFilterInput> not;
    private final Input<List<ModelWabaConversationFilterInput>> or;
    private final Input<ModelStringInput> originType;
    private final Input<ModelIDInput> phoneNumberId;
    private final Input<ModelStringInput> pricingModel;
    private final Input<ModelIDInput> recipientId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> wabaAccountId;

    public static final class Builder {
        private Input<ModelIDInput> conversationId = Input.absent();
        private Input<ModelStringInput> originType = Input.absent();
        private Input<ModelStringInput> category = Input.absent();
        private Input<ModelBooleanInput> isBillable = Input.absent();
        private Input<ModelStringInput> pricingModel = Input.absent();
        private Input<ModelStringInput> expirationTimestamp = Input.absent();
        private Input<ModelIDInput> recipientId = Input.absent();
        private Input<ModelIDInput> channelId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> wabaAccountId = Input.absent();
        private Input<ModelIDInput> displayPhoneNumber = Input.absent();
        private Input<ModelIDInput> phoneNumberId = Input.absent();
        private Input<ModelMessageSendCategoryInput> messageSendCategory = Input.absent();
        private Input<ModelIDInput> initiatingMessageExternalId = Input.absent();
        private Input<ModelIDInput> initiatingMessageId = Input.absent();
        private Input<ModelIDInput> conversationInitiatedByUserId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelWabaConversationFilterInput>> and = Input.absent();
        private Input<List<ModelWabaConversationFilterInput>> or = Input.absent();
        private Input<ModelWabaConversationFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaConversationFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaConversationFilterInput build() {
            return new ModelWabaConversationFilterInput(this.conversationId, this.originType, this.category, this.isBillable, this.pricingModel, this.expirationTimestamp, this.recipientId, this.channelId, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.messageSendCategory, this.initiatingMessageExternalId, this.initiatingMessageId, this.conversationInitiatedByUserId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder category(ModelStringInput modelStringInput) {
            this.category = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder channelId(ModelIDInput modelIDInput) {
            this.channelId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder conversationId(ModelIDInput modelIDInput) {
            this.conversationId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder conversationInitiatedByUserId(ModelIDInput modelIDInput) {
            this.conversationInitiatedByUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder displayPhoneNumber(ModelIDInput modelIDInput) {
            this.displayPhoneNumber = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder expirationTimestamp(ModelStringInput modelStringInput) {
            this.expirationTimestamp = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder initiatingMessageExternalId(ModelIDInput modelIDInput) {
            this.initiatingMessageExternalId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder initiatingMessageId(ModelIDInput modelIDInput) {
            this.initiatingMessageId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isBillable(ModelBooleanInput modelBooleanInput) {
            this.isBillable = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder messageSendCategory(ModelMessageSendCategoryInput modelMessageSendCategoryInput) {
            this.messageSendCategory = Input.fromNullable(modelMessageSendCategoryInput);
            return this;
        }

        public Builder not(ModelWabaConversationFilterInput modelWabaConversationFilterInput) {
            this.not = Input.fromNullable(modelWabaConversationFilterInput);
            return this;
        }

        public Builder or(List<ModelWabaConversationFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder originType(ModelStringInput modelStringInput) {
            this.originType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder phoneNumberId(ModelIDInput modelIDInput) {
            this.phoneNumberId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder pricingModel(ModelStringInput modelStringInput) {
            this.pricingModel = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder recipientId(ModelIDInput modelIDInput) {
            this.recipientId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder wabaAccountId(ModelIDInput modelIDInput) {
            this.wabaAccountId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelWabaConversationFilterInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelBooleanInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelIDInput> input12, Input<ModelMessageSendCategoryInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelIDInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<List<ModelWabaConversationFilterInput>> input19, Input<List<ModelWabaConversationFilterInput>> input20, Input<ModelWabaConversationFilterInput> input21) {
        this.conversationId = input;
        this.originType = input2;
        this.category = input3;
        this.isBillable = input4;
        this.pricingModel = input5;
        this.expirationTimestamp = input6;
        this.recipientId = input7;
        this.channelId = input8;
        this.accountId = input9;
        this.wabaAccountId = input10;
        this.displayPhoneNumber = input11;
        this.phoneNumberId = input12;
        this.messageSendCategory = input13;
        this.initiatingMessageExternalId = input14;
        this.initiatingMessageId = input15;
        this.conversationInitiatedByUserId = input16;
        this.createdAt = input17;
        this.updatedAt = input18;
        this.and = input19;
        this.or = input20;
        this.not = input21;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelWabaConversationFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput category() {
        return this.category.value;
    }

    public ModelIDInput channelId() {
        return this.channelId.value;
    }

    public ModelIDInput conversationId() {
        return this.conversationId.value;
    }

    public ModelIDInput conversationInitiatedByUserId() {
        return this.conversationInitiatedByUserId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput displayPhoneNumber() {
        return this.displayPhoneNumber.value;
    }

    public ModelStringInput expirationTimestamp() {
        return this.expirationTimestamp.value;
    }

    public ModelIDInput initiatingMessageExternalId() {
        return this.initiatingMessageExternalId.value;
    }

    public ModelIDInput initiatingMessageId() {
        return this.initiatingMessageId.value;
    }

    public ModelBooleanInput isBillable() {
        return this.isBillable.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWabaConversationFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaConversationFilterInput.this.conversationId.defined) {
                    inputFieldWriter.writeObject("conversationId", ModelWabaConversationFilterInput.this.conversationId.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.conversationId.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.originType.defined) {
                    inputFieldWriter.writeObject("originType", ModelWabaConversationFilterInput.this.originType.value != 0 ? ((ModelStringInput) ModelWabaConversationFilterInput.this.originType.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", ModelWabaConversationFilterInput.this.category.value != 0 ? ((ModelStringInput) ModelWabaConversationFilterInput.this.category.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.isBillable.defined) {
                    inputFieldWriter.writeObject("isBillable", ModelWabaConversationFilterInput.this.isBillable.value != 0 ? ((ModelBooleanInput) ModelWabaConversationFilterInput.this.isBillable.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.pricingModel.defined) {
                    inputFieldWriter.writeObject("pricingModel", ModelWabaConversationFilterInput.this.pricingModel.value != 0 ? ((ModelStringInput) ModelWabaConversationFilterInput.this.pricingModel.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.expirationTimestamp.defined) {
                    inputFieldWriter.writeObject("expirationTimestamp", ModelWabaConversationFilterInput.this.expirationTimestamp.value != 0 ? ((ModelStringInput) ModelWabaConversationFilterInput.this.expirationTimestamp.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.recipientId.defined) {
                    inputFieldWriter.writeObject("recipientId", ModelWabaConversationFilterInput.this.recipientId.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.recipientId.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelWabaConversationFilterInput.this.channelId.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.channelId.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaConversationFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaConversationFilterInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.displayPhoneNumber.defined) {
                    inputFieldWriter.writeObject("displayPhoneNumber", ModelWabaConversationFilterInput.this.displayPhoneNumber.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.displayPhoneNumber.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeObject("phoneNumberId", ModelWabaConversationFilterInput.this.phoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.phoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.messageSendCategory.defined) {
                    inputFieldWriter.writeObject("messageSendCategory", ModelWabaConversationFilterInput.this.messageSendCategory.value != 0 ? ((ModelMessageSendCategoryInput) ModelWabaConversationFilterInput.this.messageSendCategory.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.initiatingMessageExternalId.defined) {
                    inputFieldWriter.writeObject("initiatingMessageExternalId", ModelWabaConversationFilterInput.this.initiatingMessageExternalId.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.initiatingMessageExternalId.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.initiatingMessageId.defined) {
                    inputFieldWriter.writeObject("initiatingMessageId", ModelWabaConversationFilterInput.this.initiatingMessageId.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.initiatingMessageId.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.conversationInitiatedByUserId.defined) {
                    inputFieldWriter.writeObject("conversationInitiatedByUserId", ModelWabaConversationFilterInput.this.conversationInitiatedByUserId.value != 0 ? ((ModelIDInput) ModelWabaConversationFilterInput.this.conversationInitiatedByUserId.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaConversationFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaConversationFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaConversationFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaConversationFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaConversationFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaConversationFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaConversationFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaConversationFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaConversationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaConversationFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaConversationFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaConversationFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaConversationFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaConversationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaConversationFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaConversationFilterInput.this.not.value != 0 ? ((ModelWabaConversationFilterInput) ModelWabaConversationFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelMessageSendCategoryInput messageSendCategory() {
        return this.messageSendCategory.value;
    }

    public ModelWabaConversationFilterInput not() {
        return this.not.value;
    }

    public List<ModelWabaConversationFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput originType() {
        return this.originType.value;
    }

    public ModelIDInput phoneNumberId() {
        return this.phoneNumberId.value;
    }

    public ModelStringInput pricingModel() {
        return this.pricingModel.value;
    }

    public ModelIDInput recipientId() {
        return this.recipientId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput wabaAccountId() {
        return this.wabaAccountId.value;
    }
}
