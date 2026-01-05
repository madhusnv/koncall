package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelPaymentLinkConditionInput implements InputType {
    private final Input<ModelBooleanInput> acceptPartial;
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIntInput> amount;
    private final Input<ModelIntInput> amountPaid;
    private final Input<List<ModelPaymentLinkConditionInput>> and;
    private final Input<ModelStringInput> cancelledAt;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currency;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> expireBy;
    private final Input<ModelStringInput> expiredAt;
    private final Input<ModelStringInput> externalUserReference;
    private final Input<ModelIntInput> firstMinPartialAmount;
    private final Input<ModelStringInput> idInPaymentProvider;
    private final Input<ModelPaymentLinkConditionInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelPaymentLinkConditionInput>> or;
    private final Input<ModelIDInput> orderId;
    private final Input<ModelStringInput> paymentProvider;
    private final Input<ModelStringInput> shortUrl;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> upiLink;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> paymentProvider = Input.absent();
        private Input<ModelStringInput> idInPaymentProvider = Input.absent();
        private Input<ModelIDInput> orderId = Input.absent();
        private Input<ModelBooleanInput> acceptPartial = Input.absent();
        private Input<ModelIntInput> firstMinPartialAmount = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelIntInput> amount = Input.absent();
        private Input<ModelIntInput> amountPaid = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> note = Input.absent();
        private Input<ModelStringInput> shortUrl = Input.absent();
        private Input<ModelStringInput> upiLink = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> expireBy = Input.absent();
        private Input<ModelStringInput> expiredAt = Input.absent();
        private Input<ModelStringInput> cancelledAt = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelStringInput> externalUserReference = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelPaymentLinkConditionInput>> and = Input.absent();
        private Input<List<ModelPaymentLinkConditionInput>> or = Input.absent();
        private Input<ModelPaymentLinkConditionInput> not = Input.absent();

        public Builder acceptPartial(ModelBooleanInput modelBooleanInput) {
            this.acceptPartial = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder amount(ModelIntInput modelIntInput) {
            this.amount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder amountPaid(ModelIntInput modelIntInput) {
            this.amountPaid = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder and(List<ModelPaymentLinkConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelPaymentLinkConditionInput build() {
            return new ModelPaymentLinkConditionInput(this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.orderId, this.acceptPartial, this.firstMinPartialAmount, this.currency, this.amount, this.amountPaid, this.description, this.note, this.shortUrl, this.upiLink, this.status, this.expireBy, this.expiredAt, this.cancelledAt, this.createdAt, this.updatedAt, this.externalUserReference, this.createdById, this.updatedById, this.and, this.or, this.not);
        }

        public Builder cancelledAt(ModelStringInput modelStringInput) {
            this.cancelledAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder currency(ModelStringInput modelStringInput) {
            this.currency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder expireBy(ModelStringInput modelStringInput) {
            this.expireBy = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder expiredAt(ModelStringInput modelStringInput) {
            this.expiredAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder externalUserReference(ModelStringInput modelStringInput) {
            this.externalUserReference = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder firstMinPartialAmount(ModelIntInput modelIntInput) {
            this.firstMinPartialAmount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder idInPaymentProvider(ModelStringInput modelStringInput) {
            this.idInPaymentProvider = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelPaymentLinkConditionInput modelPaymentLinkConditionInput) {
            this.not = Input.fromNullable(modelPaymentLinkConditionInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelPaymentLinkConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder orderId(ModelIDInput modelIDInput) {
            this.orderId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder paymentProvider(ModelStringInput modelStringInput) {
            this.paymentProvider = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder shortUrl(ModelStringInput modelStringInput) {
            this.shortUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder upiLink(ModelStringInput modelStringInput) {
            this.upiLink = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelPaymentLinkConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelBooleanInput> input6, Input<ModelIntInput> input7, Input<ModelStringInput> input8, Input<ModelIntInput> input9, Input<ModelIntInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelIDInput> input22, Input<ModelIDInput> input23, Input<List<ModelPaymentLinkConditionInput>> input24, Input<List<ModelPaymentLinkConditionInput>> input25, Input<ModelPaymentLinkConditionInput> input26) {
        this.accountId = input;
        this.contactId = input2;
        this.paymentProvider = input3;
        this.idInPaymentProvider = input4;
        this.orderId = input5;
        this.acceptPartial = input6;
        this.firstMinPartialAmount = input7;
        this.currency = input8;
        this.amount = input9;
        this.amountPaid = input10;
        this.description = input11;
        this.note = input12;
        this.shortUrl = input13;
        this.upiLink = input14;
        this.status = input15;
        this.expireBy = input16;
        this.expiredAt = input17;
        this.cancelledAt = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
        this.externalUserReference = input21;
        this.createdById = input22;
        this.updatedById = input23;
        this.and = input24;
        this.or = input25;
        this.not = input26;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelBooleanInput acceptPartial() {
        return this.acceptPartial.value;
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelIntInput amount() {
        return this.amount.value;
    }

    public ModelIntInput amountPaid() {
        return this.amountPaid.value;
    }

    public List<ModelPaymentLinkConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput cancelledAt() {
        return this.cancelledAt.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelStringInput currency() {
        return this.currency.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelStringInput expireBy() {
        return this.expireBy.value;
    }

    public ModelStringInput expiredAt() {
        return this.expiredAt.value;
    }

    public ModelStringInput externalUserReference() {
        return this.externalUserReference.value;
    }

    public ModelIntInput firstMinPartialAmount() {
        return this.firstMinPartialAmount.value;
    }

    public ModelStringInput idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentLinkConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelPaymentLinkConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelPaymentLinkConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelPaymentLinkConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelPaymentLinkConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelPaymentLinkConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeObject("paymentProvider", ModelPaymentLinkConditionInput.this.paymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.paymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeObject("idInPaymentProvider", ModelPaymentLinkConditionInput.this.idInPaymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.idInPaymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.orderId.defined) {
                    inputFieldWriter.writeObject("orderId", ModelPaymentLinkConditionInput.this.orderId.value != 0 ? ((ModelIDInput) ModelPaymentLinkConditionInput.this.orderId.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.acceptPartial.defined) {
                    inputFieldWriter.writeObject("acceptPartial", ModelPaymentLinkConditionInput.this.acceptPartial.value != 0 ? ((ModelBooleanInput) ModelPaymentLinkConditionInput.this.acceptPartial.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.firstMinPartialAmount.defined) {
                    inputFieldWriter.writeObject("firstMinPartialAmount", ModelPaymentLinkConditionInput.this.firstMinPartialAmount.value != 0 ? ((ModelIntInput) ModelPaymentLinkConditionInput.this.firstMinPartialAmount.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelPaymentLinkConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelPaymentLinkConditionInput.this.amount.value != 0 ? ((ModelIntInput) ModelPaymentLinkConditionInput.this.amount.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.amountPaid.defined) {
                    inputFieldWriter.writeObject("amountPaid", ModelPaymentLinkConditionInput.this.amountPaid.value != 0 ? ((ModelIntInput) ModelPaymentLinkConditionInput.this.amountPaid.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelPaymentLinkConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelPaymentLinkConditionInput.this.note.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.note.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.shortUrl.defined) {
                    inputFieldWriter.writeObject("shortUrl", ModelPaymentLinkConditionInput.this.shortUrl.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.shortUrl.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.upiLink.defined) {
                    inputFieldWriter.writeObject("upiLink", ModelPaymentLinkConditionInput.this.upiLink.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.upiLink.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelPaymentLinkConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.expireBy.defined) {
                    inputFieldWriter.writeObject("expireBy", ModelPaymentLinkConditionInput.this.expireBy.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.expireBy.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.expiredAt.defined) {
                    inputFieldWriter.writeObject("expiredAt", ModelPaymentLinkConditionInput.this.expiredAt.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.expiredAt.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.cancelledAt.defined) {
                    inputFieldWriter.writeObject("cancelledAt", ModelPaymentLinkConditionInput.this.cancelledAt.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.cancelledAt.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelPaymentLinkConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelPaymentLinkConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.externalUserReference.defined) {
                    inputFieldWriter.writeObject("externalUserReference", ModelPaymentLinkConditionInput.this.externalUserReference.value != 0 ? ((ModelStringInput) ModelPaymentLinkConditionInput.this.externalUserReference.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelPaymentLinkConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelPaymentLinkConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelPaymentLinkConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelPaymentLinkConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelPaymentLinkConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelPaymentLinkConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentLinkConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentLinkConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentLinkConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentLinkConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelPaymentLinkConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentLinkConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentLinkConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentLinkConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentLinkConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelPaymentLinkConditionInput.this.not.value != 0 ? ((ModelPaymentLinkConditionInput) ModelPaymentLinkConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelPaymentLinkConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelPaymentLinkConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput orderId() {
        return this.orderId.value;
    }

    public ModelStringInput paymentProvider() {
        return this.paymentProvider.value;
    }

    public ModelStringInput shortUrl() {
        return this.shortUrl.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelStringInput upiLink() {
        return this.upiLink.value;
    }
}
