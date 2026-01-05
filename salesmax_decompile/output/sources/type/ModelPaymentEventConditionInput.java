package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelPaymentEventConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> acquirerData;
    private final Input<ModelIntInput> amount;
    private final Input<ModelIntInput> amountRefunded;
    private final Input<List<ModelPaymentEventConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currency;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> error;
    private final Input<ModelStringInput> externalOrderId;
    private final Input<ModelStringInput> idInPaymentProvider;
    private final Input<ModelBooleanInput> international;
    private final Input<ModelStringInput> method;
    private final Input<ModelPaymentEventConditionInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelPaymentEventConditionInput>> or;
    private final Input<ModelIDInput> orderId;
    private final Input<ModelStringInput> paymentProvider;
    private final Input<ModelStringInput> refundStatus;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> orderId = Input.absent();
        private Input<ModelStringInput> externalOrderId = Input.absent();
        private Input<ModelStringInput> paymentProvider = Input.absent();
        private Input<ModelStringInput> idInPaymentProvider = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelIntInput> amount = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> note = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> method = Input.absent();
        private Input<ModelBooleanInput> international = Input.absent();
        private Input<ModelStringInput> refundStatus = Input.absent();
        private Input<ModelIntInput> amountRefunded = Input.absent();
        private Input<ModelStringInput> error = Input.absent();
        private Input<ModelStringInput> acquirerData = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelPaymentEventConditionInput>> and = Input.absent();
        private Input<List<ModelPaymentEventConditionInput>> or = Input.absent();
        private Input<ModelPaymentEventConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder acquirerData(ModelStringInput modelStringInput) {
            this.acquirerData = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder amount(ModelIntInput modelIntInput) {
            this.amount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder amountRefunded(ModelIntInput modelIntInput) {
            this.amountRefunded = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder and(List<ModelPaymentEventConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelPaymentEventConditionInput build() {
            return new ModelPaymentEventConditionInput(this.accountId, this.contactId, this.orderId, this.externalOrderId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.status, this.note, this.description, this.method, this.international, this.refundStatus, this.amountRefunded, this.error, this.acquirerData, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder error(ModelStringInput modelStringInput) {
            this.error = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder externalOrderId(ModelStringInput modelStringInput) {
            this.externalOrderId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder idInPaymentProvider(ModelStringInput modelStringInput) {
            this.idInPaymentProvider = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder international(ModelBooleanInput modelBooleanInput) {
            this.international = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder method(ModelStringInput modelStringInput) {
            this.method = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelPaymentEventConditionInput modelPaymentEventConditionInput) {
            this.not = Input.fromNullable(modelPaymentEventConditionInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelPaymentEventConditionInput> list) {
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

        public Builder refundStatus(ModelStringInput modelStringInput) {
            this.refundStatus = Input.fromNullable(modelStringInput);
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

    public ModelPaymentEventConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelIntInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelBooleanInput> input13, Input<ModelStringInput> input14, Input<ModelIntInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelIDInput> input20, Input<ModelIDInput> input21, Input<List<ModelPaymentEventConditionInput>> input22, Input<List<ModelPaymentEventConditionInput>> input23, Input<ModelPaymentEventConditionInput> input24) {
        this.accountId = input;
        this.contactId = input2;
        this.orderId = input3;
        this.externalOrderId = input4;
        this.paymentProvider = input5;
        this.idInPaymentProvider = input6;
        this.currency = input7;
        this.amount = input8;
        this.status = input9;
        this.note = input10;
        this.description = input11;
        this.method = input12;
        this.international = input13;
        this.refundStatus = input14;
        this.amountRefunded = input15;
        this.error = input16;
        this.acquirerData = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
        this.createdById = input20;
        this.updatedById = input21;
        this.and = input22;
        this.or = input23;
        this.not = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput acquirerData() {
        return this.acquirerData.value;
    }

    public ModelIntInput amount() {
        return this.amount.value;
    }

    public ModelIntInput amountRefunded() {
        return this.amountRefunded.value;
    }

    public List<ModelPaymentEventConditionInput> and() {
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

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelStringInput error() {
        return this.error.value;
    }

    public ModelStringInput externalOrderId() {
        return this.externalOrderId.value;
    }

    public ModelStringInput idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    public ModelBooleanInput international() {
        return this.international.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentEventConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelPaymentEventConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelPaymentEventConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelPaymentEventConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelPaymentEventConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelPaymentEventConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.orderId.defined) {
                    inputFieldWriter.writeObject("orderId", ModelPaymentEventConditionInput.this.orderId.value != 0 ? ((ModelIDInput) ModelPaymentEventConditionInput.this.orderId.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.externalOrderId.defined) {
                    inputFieldWriter.writeObject("externalOrderId", ModelPaymentEventConditionInput.this.externalOrderId.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.externalOrderId.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeObject("paymentProvider", ModelPaymentEventConditionInput.this.paymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.paymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeObject("idInPaymentProvider", ModelPaymentEventConditionInput.this.idInPaymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.idInPaymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelPaymentEventConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelPaymentEventConditionInput.this.amount.value != 0 ? ((ModelIntInput) ModelPaymentEventConditionInput.this.amount.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelPaymentEventConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelPaymentEventConditionInput.this.note.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.note.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelPaymentEventConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.method.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.METHOD, ModelPaymentEventConditionInput.this.method.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.method.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.international.defined) {
                    inputFieldWriter.writeObject("international", ModelPaymentEventConditionInput.this.international.value != 0 ? ((ModelBooleanInput) ModelPaymentEventConditionInput.this.international.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.refundStatus.defined) {
                    inputFieldWriter.writeObject("refundStatus", ModelPaymentEventConditionInput.this.refundStatus.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.refundStatus.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.amountRefunded.defined) {
                    inputFieldWriter.writeObject("amountRefunded", ModelPaymentEventConditionInput.this.amountRefunded.value != 0 ? ((ModelIntInput) ModelPaymentEventConditionInput.this.amountRefunded.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.error.defined) {
                    inputFieldWriter.writeObject(Constants.IPC_BUNDLE_KEY_SEND_ERROR, ModelPaymentEventConditionInput.this.error.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.error.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.acquirerData.defined) {
                    inputFieldWriter.writeObject("acquirerData", ModelPaymentEventConditionInput.this.acquirerData.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.acquirerData.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelPaymentEventConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelPaymentEventConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelPaymentEventConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelPaymentEventConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelPaymentEventConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelPaymentEventConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelPaymentEventConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelPaymentEventConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelPaymentEventConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentEventConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentEventConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentEventConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentEventConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelPaymentEventConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentEventConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentEventConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentEventConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentEventConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelPaymentEventConditionInput.this.not.value != 0 ? ((ModelPaymentEventConditionInput) ModelPaymentEventConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput method() {
        return this.method.value;
    }

    public ModelPaymentEventConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelPaymentEventConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput orderId() {
        return this.orderId.value;
    }

    public ModelStringInput paymentProvider() {
        return this.paymentProvider.value;
    }

    public ModelStringInput refundStatus() {
        return this.refundStatus.value;
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
