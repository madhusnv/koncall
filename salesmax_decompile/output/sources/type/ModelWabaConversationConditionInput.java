package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaConversationConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaConversationConditionInput>> and;
    private final Input<ModelStringInput> category;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelIDInput> conversationInitiatedByUserId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> displayPhoneNumber;
    private final Input<ModelStringInput> expirationTimestamp;
    private final Input<ModelIDInput> initiatingMessageExternalId;
    private final Input<ModelIDInput> initiatingMessageId;
    private final Input<ModelBooleanInput> isBillable;
    private final Input<ModelMessageSendCategoryInput> messageSendCategory;
    private final Input<ModelWabaConversationConditionInput> not;
    private final Input<List<ModelWabaConversationConditionInput>> or;
    private final Input<ModelStringInput> originType;
    private final Input<ModelIDInput> phoneNumberId;
    private final Input<ModelStringInput> pricingModel;
    private final Input<ModelIDInput> recipientId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> wabaAccountId;

    public static final class Builder {
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
        private Input<List<ModelWabaConversationConditionInput>> and = Input.absent();
        private Input<List<ModelWabaConversationConditionInput>> or = Input.absent();
        private Input<ModelWabaConversationConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaConversationConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaConversationConditionInput build() {
            return new ModelWabaConversationConditionInput(this.originType, this.category, this.isBillable, this.pricingModel, this.expirationTimestamp, this.recipientId, this.channelId, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.messageSendCategory, this.initiatingMessageExternalId, this.initiatingMessageId, this.conversationInitiatedByUserId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder category(ModelStringInput modelStringInput) {
            this.category = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder channelId(ModelIDInput modelIDInput) {
            this.channelId = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelWabaConversationConditionInput modelWabaConversationConditionInput) {
            this.not = Input.fromNullable(modelWabaConversationConditionInput);
            return this;
        }

        public Builder or(List<ModelWabaConversationConditionInput> list) {
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

    public ModelWabaConversationConditionInput(Input<ModelStringInput> input, Input<ModelStringInput> input2, Input<ModelBooleanInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelMessageSendCategoryInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<List<ModelWabaConversationConditionInput>> input18, Input<List<ModelWabaConversationConditionInput>> input19, Input<ModelWabaConversationConditionInput> input20) {
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
        this.and = input18;
        this.or = input19;
        this.not = input20;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelWabaConversationConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput category() {
        return this.category.value;
    }

    public ModelIDInput channelId() {
        return this.channelId.value;
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
        return new InputFieldMarshaller() { // from class: type.ModelWabaConversationConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaConversationConditionInput.this.originType.defined) {
                    inputFieldWriter.writeObject("originType", ModelWabaConversationConditionInput.this.originType.value != 0 ? ((ModelStringInput) ModelWabaConversationConditionInput.this.originType.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", ModelWabaConversationConditionInput.this.category.value != 0 ? ((ModelStringInput) ModelWabaConversationConditionInput.this.category.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.isBillable.defined) {
                    inputFieldWriter.writeObject("isBillable", ModelWabaConversationConditionInput.this.isBillable.value != 0 ? ((ModelBooleanInput) ModelWabaConversationConditionInput.this.isBillable.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.pricingModel.defined) {
                    inputFieldWriter.writeObject("pricingModel", ModelWabaConversationConditionInput.this.pricingModel.value != 0 ? ((ModelStringInput) ModelWabaConversationConditionInput.this.pricingModel.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.expirationTimestamp.defined) {
                    inputFieldWriter.writeObject("expirationTimestamp", ModelWabaConversationConditionInput.this.expirationTimestamp.value != 0 ? ((ModelStringInput) ModelWabaConversationConditionInput.this.expirationTimestamp.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.recipientId.defined) {
                    inputFieldWriter.writeObject("recipientId", ModelWabaConversationConditionInput.this.recipientId.value != 0 ? ((ModelIDInput) ModelWabaConversationConditionInput.this.recipientId.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelWabaConversationConditionInput.this.channelId.value != 0 ? ((ModelIDInput) ModelWabaConversationConditionInput.this.channelId.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaConversationConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaConversationConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaConversationConditionInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaConversationConditionInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.displayPhoneNumber.defined) {
                    inputFieldWriter.writeObject("displayPhoneNumber", ModelWabaConversationConditionInput.this.displayPhoneNumber.value != 0 ? ((ModelIDInput) ModelWabaConversationConditionInput.this.displayPhoneNumber.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeObject("phoneNumberId", ModelWabaConversationConditionInput.this.phoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaConversationConditionInput.this.phoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.messageSendCategory.defined) {
                    inputFieldWriter.writeObject("messageSendCategory", ModelWabaConversationConditionInput.this.messageSendCategory.value != 0 ? ((ModelMessageSendCategoryInput) ModelWabaConversationConditionInput.this.messageSendCategory.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.initiatingMessageExternalId.defined) {
                    inputFieldWriter.writeObject("initiatingMessageExternalId", ModelWabaConversationConditionInput.this.initiatingMessageExternalId.value != 0 ? ((ModelIDInput) ModelWabaConversationConditionInput.this.initiatingMessageExternalId.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.initiatingMessageId.defined) {
                    inputFieldWriter.writeObject("initiatingMessageId", ModelWabaConversationConditionInput.this.initiatingMessageId.value != 0 ? ((ModelIDInput) ModelWabaConversationConditionInput.this.initiatingMessageId.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.conversationInitiatedByUserId.defined) {
                    inputFieldWriter.writeObject("conversationInitiatedByUserId", ModelWabaConversationConditionInput.this.conversationInitiatedByUserId.value != 0 ? ((ModelIDInput) ModelWabaConversationConditionInput.this.conversationInitiatedByUserId.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaConversationConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaConversationConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaConversationConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaConversationConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaConversationConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaConversationConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaConversationConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaConversationConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaConversationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaConversationConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaConversationConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaConversationConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaConversationConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaConversationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaConversationConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaConversationConditionInput.this.not.value != 0 ? ((ModelWabaConversationConditionInput) ModelWabaConversationConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelMessageSendCategoryInput messageSendCategory() {
        return this.messageSendCategory.value;
    }

    public ModelWabaConversationConditionInput not() {
        return this.not.value;
    }

    public List<ModelWabaConversationConditionInput> or() {
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
