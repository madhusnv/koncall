package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableWabaConversationFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableWabaConversationFilterInput>> and;
    private final Input<SearchableStringFilterInput> category;
    private final Input<SearchableIDFilterInput> channelId;
    private final Input<SearchableIDFilterInput> conversationId;
    private final Input<SearchableIDFilterInput> conversationInitiatedByUserId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> displayPhoneNumber;
    private final Input<SearchableStringFilterInput> expirationTimestamp;
    private final Input<SearchableIDFilterInput> initiatingMessageExternalId;
    private final Input<SearchableIDFilterInput> initiatingMessageId;
    private final Input<SearchableBooleanFilterInput> isBillable;
    private final Input<SearchableStringFilterInput> messageSendCategory;
    private final Input<SearchableWabaConversationFilterInput> not;
    private final Input<List<SearchableWabaConversationFilterInput>> or;
    private final Input<SearchableStringFilterInput> originType;
    private final Input<SearchableIDFilterInput> phoneNumberId;
    private final Input<SearchableStringFilterInput> pricingModel;
    private final Input<SearchableIDFilterInput> recipientId;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> wabaAccountId;

    public static final class Builder {
        private Input<SearchableIDFilterInput> conversationId = Input.absent();
        private Input<SearchableStringFilterInput> originType = Input.absent();
        private Input<SearchableStringFilterInput> category = Input.absent();
        private Input<SearchableBooleanFilterInput> isBillable = Input.absent();
        private Input<SearchableStringFilterInput> pricingModel = Input.absent();
        private Input<SearchableStringFilterInput> expirationTimestamp = Input.absent();
        private Input<SearchableIDFilterInput> recipientId = Input.absent();
        private Input<SearchableIDFilterInput> channelId = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> wabaAccountId = Input.absent();
        private Input<SearchableIDFilterInput> displayPhoneNumber = Input.absent();
        private Input<SearchableIDFilterInput> phoneNumberId = Input.absent();
        private Input<SearchableIDFilterInput> initiatingMessageExternalId = Input.absent();
        private Input<SearchableIDFilterInput> initiatingMessageId = Input.absent();
        private Input<SearchableIDFilterInput> conversationInitiatedByUserId = Input.absent();
        private Input<SearchableStringFilterInput> messageSendCategory = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableWabaConversationFilterInput>> and = Input.absent();
        private Input<List<SearchableWabaConversationFilterInput>> or = Input.absent();
        private Input<SearchableWabaConversationFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableWabaConversationFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableWabaConversationFilterInput build() {
            return new SearchableWabaConversationFilterInput(this.conversationId, this.originType, this.category, this.isBillable, this.pricingModel, this.expirationTimestamp, this.recipientId, this.channelId, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.initiatingMessageExternalId, this.initiatingMessageId, this.conversationInitiatedByUserId, this.messageSendCategory, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder category(SearchableStringFilterInput searchableStringFilterInput) {
            this.category = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder channelId(SearchableIDFilterInput searchableIDFilterInput) {
            this.channelId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder conversationId(SearchableIDFilterInput searchableIDFilterInput) {
            this.conversationId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder conversationInitiatedByUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.conversationInitiatedByUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder displayPhoneNumber(SearchableIDFilterInput searchableIDFilterInput) {
            this.displayPhoneNumber = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder expirationTimestamp(SearchableStringFilterInput searchableStringFilterInput) {
            this.expirationTimestamp = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder initiatingMessageExternalId(SearchableIDFilterInput searchableIDFilterInput) {
            this.initiatingMessageExternalId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder initiatingMessageId(SearchableIDFilterInput searchableIDFilterInput) {
            this.initiatingMessageId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder isBillable(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isBillable = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder messageSendCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageSendCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableWabaConversationFilterInput searchableWabaConversationFilterInput) {
            this.not = Input.fromNullable(searchableWabaConversationFilterInput);
            return this;
        }

        public Builder or(List<SearchableWabaConversationFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder originType(SearchableStringFilterInput searchableStringFilterInput) {
            this.originType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder phoneNumberId(SearchableIDFilterInput searchableIDFilterInput) {
            this.phoneNumberId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder pricingModel(SearchableStringFilterInput searchableStringFilterInput) {
            this.pricingModel = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder recipientId(SearchableIDFilterInput searchableIDFilterInput) {
            this.recipientId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder wabaAccountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.wabaAccountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchableWabaConversationFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableStringFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableBooleanFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableIDFilterInput> input8, Input<SearchableIDFilterInput> input9, Input<SearchableIDFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableIDFilterInput> input12, Input<SearchableIDFilterInput> input13, Input<SearchableIDFilterInput> input14, Input<SearchableIDFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<List<SearchableWabaConversationFilterInput>> input19, Input<List<SearchableWabaConversationFilterInput>> input20, Input<SearchableWabaConversationFilterInput> input21) {
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
        this.initiatingMessageExternalId = input13;
        this.initiatingMessageId = input14;
        this.conversationInitiatedByUserId = input15;
        this.messageSendCategory = input16;
        this.createdAt = input17;
        this.updatedAt = input18;
        this.and = input19;
        this.or = input20;
        this.not = input21;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableWabaConversationFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput category() {
        return this.category.value;
    }

    public SearchableIDFilterInput channelId() {
        return this.channelId.value;
    }

    public SearchableIDFilterInput conversationId() {
        return this.conversationId.value;
    }

    public SearchableIDFilterInput conversationInitiatedByUserId() {
        return this.conversationInitiatedByUserId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput displayPhoneNumber() {
        return this.displayPhoneNumber.value;
    }

    public SearchableStringFilterInput expirationTimestamp() {
        return this.expirationTimestamp.value;
    }

    public SearchableIDFilterInput initiatingMessageExternalId() {
        return this.initiatingMessageExternalId.value;
    }

    public SearchableIDFilterInput initiatingMessageId() {
        return this.initiatingMessageId.value;
    }

    public SearchableBooleanFilterInput isBillable() {
        return this.isBillable.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableWabaConversationFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableWabaConversationFilterInput.this.conversationId.defined) {
                    inputFieldWriter.writeObject("conversationId", SearchableWabaConversationFilterInput.this.conversationId.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.conversationId.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.originType.defined) {
                    inputFieldWriter.writeObject("originType", SearchableWabaConversationFilterInput.this.originType.value != 0 ? ((SearchableStringFilterInput) SearchableWabaConversationFilterInput.this.originType.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", SearchableWabaConversationFilterInput.this.category.value != 0 ? ((SearchableStringFilterInput) SearchableWabaConversationFilterInput.this.category.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.isBillable.defined) {
                    inputFieldWriter.writeObject("isBillable", SearchableWabaConversationFilterInput.this.isBillable.value != 0 ? ((SearchableBooleanFilterInput) SearchableWabaConversationFilterInput.this.isBillable.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.pricingModel.defined) {
                    inputFieldWriter.writeObject("pricingModel", SearchableWabaConversationFilterInput.this.pricingModel.value != 0 ? ((SearchableStringFilterInput) SearchableWabaConversationFilterInput.this.pricingModel.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.expirationTimestamp.defined) {
                    inputFieldWriter.writeObject("expirationTimestamp", SearchableWabaConversationFilterInput.this.expirationTimestamp.value != 0 ? ((SearchableStringFilterInput) SearchableWabaConversationFilterInput.this.expirationTimestamp.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.recipientId.defined) {
                    inputFieldWriter.writeObject("recipientId", SearchableWabaConversationFilterInput.this.recipientId.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.recipientId.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", SearchableWabaConversationFilterInput.this.channelId.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.channelId.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableWabaConversationFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", SearchableWabaConversationFilterInput.this.wabaAccountId.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.displayPhoneNumber.defined) {
                    inputFieldWriter.writeObject("displayPhoneNumber", SearchableWabaConversationFilterInput.this.displayPhoneNumber.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.displayPhoneNumber.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeObject("phoneNumberId", SearchableWabaConversationFilterInput.this.phoneNumberId.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.phoneNumberId.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.initiatingMessageExternalId.defined) {
                    inputFieldWriter.writeObject("initiatingMessageExternalId", SearchableWabaConversationFilterInput.this.initiatingMessageExternalId.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.initiatingMessageExternalId.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.initiatingMessageId.defined) {
                    inputFieldWriter.writeObject("initiatingMessageId", SearchableWabaConversationFilterInput.this.initiatingMessageId.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.initiatingMessageId.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.conversationInitiatedByUserId.defined) {
                    inputFieldWriter.writeObject("conversationInitiatedByUserId", SearchableWabaConversationFilterInput.this.conversationInitiatedByUserId.value != 0 ? ((SearchableIDFilterInput) SearchableWabaConversationFilterInput.this.conversationInitiatedByUserId.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.messageSendCategory.defined) {
                    inputFieldWriter.writeObject("messageSendCategory", SearchableWabaConversationFilterInput.this.messageSendCategory.value != 0 ? ((SearchableStringFilterInput) SearchableWabaConversationFilterInput.this.messageSendCategory.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableWabaConversationFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableWabaConversationFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableWabaConversationFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableWabaConversationFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableWabaConversationFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableWabaConversationFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableWabaConversationFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableWabaConversationFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableWabaConversationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableWabaConversationFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableWabaConversationFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableWabaConversationFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableWabaConversationFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableWabaConversationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableWabaConversationFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableWabaConversationFilterInput.this.not.value != 0 ? ((SearchableWabaConversationFilterInput) SearchableWabaConversationFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput messageSendCategory() {
        return this.messageSendCategory.value;
    }

    public SearchableWabaConversationFilterInput not() {
        return this.not.value;
    }

    public List<SearchableWabaConversationFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput originType() {
        return this.originType.value;
    }

    public SearchableIDFilterInput phoneNumberId() {
        return this.phoneNumberId.value;
    }

    public SearchableStringFilterInput pricingModel() {
        return this.pricingModel.value;
    }

    public SearchableIDFilterInput recipientId() {
        return this.recipientId.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput wabaAccountId() {
        return this.wabaAccountId.value;
    }
}
