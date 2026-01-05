package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelPaymentOrderConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIntInput> amount;
    private final Input<ModelIntInput> amountPaid;
    private final Input<List<ModelPaymentOrderConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currency;
    private final Input<ModelStringInput> idInPaymentProvider;
    private final Input<ModelPaymentOrderConditionInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelPaymentOrderConditionInput>> or;
    private final Input<ModelStringInput> paymentProvider;
    private final Input<ModelStringInput> receipt;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
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
        private Input<List<ModelPaymentOrderConditionInput>> and = Input.absent();
        private Input<List<ModelPaymentOrderConditionInput>> or = Input.absent();
        private Input<ModelPaymentOrderConditionInput> not = Input.absent();

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

        public Builder and(List<ModelPaymentOrderConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelPaymentOrderConditionInput build() {
            return new ModelPaymentOrderConditionInput(this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.amountPaid, this.status, this.note, this.receipt, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder idInPaymentProvider(ModelStringInput modelStringInput) {
            this.idInPaymentProvider = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelPaymentOrderConditionInput modelPaymentOrderConditionInput) {
            this.not = Input.fromNullable(modelPaymentOrderConditionInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelPaymentOrderConditionInput> list) {
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

    public ModelPaymentOrderConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIntInput> input6, Input<ModelIntInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<List<ModelPaymentOrderConditionInput>> input15, Input<List<ModelPaymentOrderConditionInput>> input16, Input<ModelPaymentOrderConditionInput> input17) {
        this.accountId = input;
        this.contactId = input2;
        this.paymentProvider = input3;
        this.idInPaymentProvider = input4;
        this.currency = input5;
        this.amount = input6;
        this.amountPaid = input7;
        this.status = input8;
        this.note = input9;
        this.receipt = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.createdById = input13;
        this.updatedById = input14;
        this.and = input15;
        this.or = input16;
        this.not = input17;
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

    public List<ModelPaymentOrderConditionInput> and() {
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

    public ModelStringInput idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentOrderConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelPaymentOrderConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelPaymentOrderConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelPaymentOrderConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelPaymentOrderConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelPaymentOrderConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeObject("paymentProvider", ModelPaymentOrderConditionInput.this.paymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentOrderConditionInput.this.paymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeObject("idInPaymentProvider", ModelPaymentOrderConditionInput.this.idInPaymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentOrderConditionInput.this.idInPaymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelPaymentOrderConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelPaymentOrderConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelPaymentOrderConditionInput.this.amount.value != 0 ? ((ModelIntInput) ModelPaymentOrderConditionInput.this.amount.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.amountPaid.defined) {
                    inputFieldWriter.writeObject("amountPaid", ModelPaymentOrderConditionInput.this.amountPaid.value != 0 ? ((ModelIntInput) ModelPaymentOrderConditionInput.this.amountPaid.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelPaymentOrderConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelPaymentOrderConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelPaymentOrderConditionInput.this.note.value != 0 ? ((ModelStringInput) ModelPaymentOrderConditionInput.this.note.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.receipt.defined) {
                    inputFieldWriter.writeObject("receipt", ModelPaymentOrderConditionInput.this.receipt.value != 0 ? ((ModelStringInput) ModelPaymentOrderConditionInput.this.receipt.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelPaymentOrderConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelPaymentOrderConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelPaymentOrderConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelPaymentOrderConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelPaymentOrderConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelPaymentOrderConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelPaymentOrderConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelPaymentOrderConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelPaymentOrderConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelPaymentOrderConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentOrderConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentOrderConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentOrderConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentOrderConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelPaymentOrderConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentOrderConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentOrderConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentOrderConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentOrderConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelPaymentOrderConditionInput.this.not.value != 0 ? ((ModelPaymentOrderConditionInput) ModelPaymentOrderConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelPaymentOrderConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelPaymentOrderConditionInput> or() {
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
