package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelPaymentOrderFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIntInput> amount;
    private final Input<ModelIntInput> amountPaid;
    private final Input<List<ModelPaymentOrderFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currency;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> idInPaymentProvider;
    private final Input<ModelPaymentOrderFilterInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelPaymentOrderFilterInput>> or;
    private final Input<ModelStringInput> paymentProvider;
    private final Input<ModelStringInput> receipt;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> paymentProvider = Input.absent();
        private Input<ModelStringInput> idInPaymentProvider = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelIntInput> amount = Input.absent();
        private Input<ModelIntInput> amountPaid = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> note = Input.absent();
        private Input<ModelStringInput> receipt = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelPaymentOrderFilterInput>> and = Input.absent();
        private Input<List<ModelPaymentOrderFilterInput>> or = Input.absent();
        private Input<ModelPaymentOrderFilterInput> not = Input.absent();

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

        public Builder and(List<ModelPaymentOrderFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelPaymentOrderFilterInput build() {
            return new ModelPaymentOrderFilterInput(this.id, this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.amountPaid, this.status, this.note, this.receipt, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder idInPaymentProvider(ModelStringInput modelStringInput) {
            this.idInPaymentProvider = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelPaymentOrderFilterInput modelPaymentOrderFilterInput) {
            this.not = Input.fromNullable(modelPaymentOrderFilterInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelPaymentOrderFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder paymentProvider(ModelStringInput modelStringInput) {
            this.paymentProvider = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder receipt(ModelStringInput modelStringInput) {
            this.receipt = Input.fromNullable(modelStringInput);
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
    }

    public ModelPaymentOrderFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIntInput> input7, Input<ModelIntInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<List<ModelPaymentOrderFilterInput>> input16, Input<List<ModelPaymentOrderFilterInput>> input17, Input<ModelPaymentOrderFilterInput> input18) {
        this.id = input;
        this.accountId = input2;
        this.contactId = input3;
        this.paymentProvider = input4;
        this.idInPaymentProvider = input5;
        this.currency = input6;
        this.amount = input7;
        this.amountPaid = input8;
        this.status = input9;
        this.note = input10;
        this.receipt = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
        this.createdById = input14;
        this.updatedById = input15;
        this.and = input16;
        this.or = input17;
        this.not = input18;
    }

    public static Builder builder() {
        return new Builder();
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

    public List<ModelPaymentOrderFilterInput> and() {
        return this.and.value;
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentOrderFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelPaymentOrderFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelPaymentOrderFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelPaymentOrderFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelPaymentOrderFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelPaymentOrderFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelPaymentOrderFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelPaymentOrderFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeObject("paymentProvider", ModelPaymentOrderFilterInput.this.paymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentOrderFilterInput.this.paymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeObject("idInPaymentProvider", ModelPaymentOrderFilterInput.this.idInPaymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentOrderFilterInput.this.idInPaymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelPaymentOrderFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelPaymentOrderFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelPaymentOrderFilterInput.this.amount.value != 0 ? ((ModelIntInput) ModelPaymentOrderFilterInput.this.amount.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.amountPaid.defined) {
                    inputFieldWriter.writeObject("amountPaid", ModelPaymentOrderFilterInput.this.amountPaid.value != 0 ? ((ModelIntInput) ModelPaymentOrderFilterInput.this.amountPaid.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelPaymentOrderFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelPaymentOrderFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelPaymentOrderFilterInput.this.note.value != 0 ? ((ModelStringInput) ModelPaymentOrderFilterInput.this.note.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.receipt.defined) {
                    inputFieldWriter.writeObject("receipt", ModelPaymentOrderFilterInput.this.receipt.value != 0 ? ((ModelStringInput) ModelPaymentOrderFilterInput.this.receipt.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelPaymentOrderFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelPaymentOrderFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelPaymentOrderFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelPaymentOrderFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelPaymentOrderFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelPaymentOrderFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelPaymentOrderFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelPaymentOrderFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelPaymentOrderFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelPaymentOrderFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentOrderFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentOrderFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentOrderFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentOrderFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelPaymentOrderFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentOrderFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentOrderFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentOrderFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentOrderFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelPaymentOrderFilterInput.this.not.value != 0 ? ((ModelPaymentOrderFilterInput) ModelPaymentOrderFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelPaymentOrderFilterInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelPaymentOrderFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput paymentProvider() {
        return this.paymentProvider.value;
    }

    public ModelStringInput receipt() {
        return this.receipt.value;
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
}
