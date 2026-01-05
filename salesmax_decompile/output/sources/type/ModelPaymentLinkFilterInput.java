package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelPaymentLinkFilterInput implements InputType {
    private final Input<ModelBooleanInput> acceptPartial;
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIntInput> amount;
    private final Input<ModelIntInput> amountPaid;
    private final Input<List<ModelPaymentLinkFilterInput>> and;
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
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> idInPaymentProvider;
    private final Input<ModelPaymentLinkFilterInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelPaymentLinkFilterInput>> or;
    private final Input<ModelIDInput> orderId;
    private final Input<ModelStringInput> paymentProvider;
    private final Input<ModelStringInput> shortUrl;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> upiLink;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelPaymentLinkFilterInput>> and = Input.absent();
        private Input<List<ModelPaymentLinkFilterInput>> or = Input.absent();
        private Input<ModelPaymentLinkFilterInput> not = Input.absent();

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

        public Builder and(List<ModelPaymentLinkFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelPaymentLinkFilterInput build() {
            return new ModelPaymentLinkFilterInput(this.id, this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.orderId, this.acceptPartial, this.firstMinPartialAmount, this.currency, this.amount, this.amountPaid, this.description, this.note, this.shortUrl, this.upiLink, this.status, this.expireBy, this.expiredAt, this.cancelledAt, this.createdAt, this.updatedAt, this.externalUserReference, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder idInPaymentProvider(ModelStringInput modelStringInput) {
            this.idInPaymentProvider = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelPaymentLinkFilterInput modelPaymentLinkFilterInput) {
            this.not = Input.fromNullable(modelPaymentLinkFilterInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelPaymentLinkFilterInput> list) {
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

    public ModelPaymentLinkFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelBooleanInput> input7, Input<ModelIntInput> input8, Input<ModelStringInput> input9, Input<ModelIntInput> input10, Input<ModelIntInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelIDInput> input23, Input<ModelIDInput> input24, Input<List<ModelPaymentLinkFilterInput>> input25, Input<List<ModelPaymentLinkFilterInput>> input26, Input<ModelPaymentLinkFilterInput> input27) {
        this.id = input;
        this.accountId = input2;
        this.contactId = input3;
        this.paymentProvider = input4;
        this.idInPaymentProvider = input5;
        this.orderId = input6;
        this.acceptPartial = input7;
        this.firstMinPartialAmount = input8;
        this.currency = input9;
        this.amount = input10;
        this.amountPaid = input11;
        this.description = input12;
        this.note = input13;
        this.shortUrl = input14;
        this.upiLink = input15;
        this.status = input16;
        this.expireBy = input17;
        this.expiredAt = input18;
        this.cancelledAt = input19;
        this.createdAt = input20;
        this.updatedAt = input21;
        this.externalUserReference = input22;
        this.createdById = input23;
        this.updatedById = input24;
        this.and = input25;
        this.or = input26;
        this.not = input27;
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

    public List<ModelPaymentLinkFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentLinkFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelPaymentLinkFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelPaymentLinkFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelPaymentLinkFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelPaymentLinkFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelPaymentLinkFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelPaymentLinkFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelPaymentLinkFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeObject("paymentProvider", ModelPaymentLinkFilterInput.this.paymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.paymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeObject("idInPaymentProvider", ModelPaymentLinkFilterInput.this.idInPaymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.idInPaymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.orderId.defined) {
                    inputFieldWriter.writeObject("orderId", ModelPaymentLinkFilterInput.this.orderId.value != 0 ? ((ModelIDInput) ModelPaymentLinkFilterInput.this.orderId.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.acceptPartial.defined) {
                    inputFieldWriter.writeObject("acceptPartial", ModelPaymentLinkFilterInput.this.acceptPartial.value != 0 ? ((ModelBooleanInput) ModelPaymentLinkFilterInput.this.acceptPartial.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.firstMinPartialAmount.defined) {
                    inputFieldWriter.writeObject("firstMinPartialAmount", ModelPaymentLinkFilterInput.this.firstMinPartialAmount.value != 0 ? ((ModelIntInput) ModelPaymentLinkFilterInput.this.firstMinPartialAmount.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelPaymentLinkFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelPaymentLinkFilterInput.this.amount.value != 0 ? ((ModelIntInput) ModelPaymentLinkFilterInput.this.amount.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.amountPaid.defined) {
                    inputFieldWriter.writeObject("amountPaid", ModelPaymentLinkFilterInput.this.amountPaid.value != 0 ? ((ModelIntInput) ModelPaymentLinkFilterInput.this.amountPaid.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelPaymentLinkFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelPaymentLinkFilterInput.this.note.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.note.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.shortUrl.defined) {
                    inputFieldWriter.writeObject("shortUrl", ModelPaymentLinkFilterInput.this.shortUrl.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.shortUrl.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.upiLink.defined) {
                    inputFieldWriter.writeObject("upiLink", ModelPaymentLinkFilterInput.this.upiLink.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.upiLink.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelPaymentLinkFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.expireBy.defined) {
                    inputFieldWriter.writeObject("expireBy", ModelPaymentLinkFilterInput.this.expireBy.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.expireBy.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.expiredAt.defined) {
                    inputFieldWriter.writeObject("expiredAt", ModelPaymentLinkFilterInput.this.expiredAt.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.expiredAt.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.cancelledAt.defined) {
                    inputFieldWriter.writeObject("cancelledAt", ModelPaymentLinkFilterInput.this.cancelledAt.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.cancelledAt.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelPaymentLinkFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelPaymentLinkFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.externalUserReference.defined) {
                    inputFieldWriter.writeObject("externalUserReference", ModelPaymentLinkFilterInput.this.externalUserReference.value != 0 ? ((ModelStringInput) ModelPaymentLinkFilterInput.this.externalUserReference.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelPaymentLinkFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelPaymentLinkFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelPaymentLinkFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelPaymentLinkFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelPaymentLinkFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelPaymentLinkFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentLinkFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentLinkFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentLinkFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentLinkFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelPaymentLinkFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentLinkFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentLinkFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentLinkFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentLinkFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelPaymentLinkFilterInput.this.not.value != 0 ? ((ModelPaymentLinkFilterInput) ModelPaymentLinkFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelPaymentLinkFilterInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelPaymentLinkFilterInput> or() {
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
