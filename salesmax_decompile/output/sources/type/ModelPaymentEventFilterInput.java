package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelPaymentEventFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> acquirerData;
    private final Input<ModelIntInput> amount;
    private final Input<ModelIntInput> amountRefunded;
    private final Input<List<ModelPaymentEventFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currency;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> error;
    private final Input<ModelStringInput> externalOrderId;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> idInPaymentProvider;
    private final Input<ModelBooleanInput> international;
    private final Input<ModelStringInput> method;
    private final Input<ModelPaymentEventFilterInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelPaymentEventFilterInput>> or;
    private final Input<ModelIDInput> orderId;
    private final Input<ModelStringInput> paymentProvider;
    private final Input<ModelStringInput> refundStatus;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelPaymentEventFilterInput>> and = Input.absent();
        private Input<List<ModelPaymentEventFilterInput>> or = Input.absent();
        private Input<ModelPaymentEventFilterInput> not = Input.absent();

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

        public Builder and(List<ModelPaymentEventFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelPaymentEventFilterInput build() {
            return new ModelPaymentEventFilterInput(this.id, this.accountId, this.contactId, this.orderId, this.externalOrderId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.status, this.note, this.description, this.method, this.international, this.refundStatus, this.amountRefunded, this.error, this.acquirerData, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelPaymentEventFilterInput modelPaymentEventFilterInput) {
            this.not = Input.fromNullable(modelPaymentEventFilterInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelPaymentEventFilterInput> list) {
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

    public ModelPaymentEventFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelIntInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelBooleanInput> input14, Input<ModelStringInput> input15, Input<ModelIntInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelIDInput> input21, Input<ModelIDInput> input22, Input<List<ModelPaymentEventFilterInput>> input23, Input<List<ModelPaymentEventFilterInput>> input24, Input<ModelPaymentEventFilterInput> input25) {
        this.id = input;
        this.accountId = input2;
        this.contactId = input3;
        this.orderId = input4;
        this.externalOrderId = input5;
        this.paymentProvider = input6;
        this.idInPaymentProvider = input7;
        this.currency = input8;
        this.amount = input9;
        this.status = input10;
        this.note = input11;
        this.description = input12;
        this.method = input13;
        this.international = input14;
        this.refundStatus = input15;
        this.amountRefunded = input16;
        this.error = input17;
        this.acquirerData = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
        this.createdById = input21;
        this.updatedById = input22;
        this.and = input23;
        this.or = input24;
        this.not = input25;
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

    public List<ModelPaymentEventFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    public ModelBooleanInput international() {
        return this.international.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentEventFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelPaymentEventFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelPaymentEventFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelPaymentEventFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelPaymentEventFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelPaymentEventFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelPaymentEventFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelPaymentEventFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.orderId.defined) {
                    inputFieldWriter.writeObject("orderId", ModelPaymentEventFilterInput.this.orderId.value != 0 ? ((ModelIDInput) ModelPaymentEventFilterInput.this.orderId.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.externalOrderId.defined) {
                    inputFieldWriter.writeObject("externalOrderId", ModelPaymentEventFilterInput.this.externalOrderId.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.externalOrderId.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeObject("paymentProvider", ModelPaymentEventFilterInput.this.paymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.paymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeObject("idInPaymentProvider", ModelPaymentEventFilterInput.this.idInPaymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.idInPaymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelPaymentEventFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelPaymentEventFilterInput.this.amount.value != 0 ? ((ModelIntInput) ModelPaymentEventFilterInput.this.amount.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelPaymentEventFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelPaymentEventFilterInput.this.note.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.note.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelPaymentEventFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.method.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.METHOD, ModelPaymentEventFilterInput.this.method.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.method.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.international.defined) {
                    inputFieldWriter.writeObject("international", ModelPaymentEventFilterInput.this.international.value != 0 ? ((ModelBooleanInput) ModelPaymentEventFilterInput.this.international.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.refundStatus.defined) {
                    inputFieldWriter.writeObject("refundStatus", ModelPaymentEventFilterInput.this.refundStatus.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.refundStatus.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.amountRefunded.defined) {
                    inputFieldWriter.writeObject("amountRefunded", ModelPaymentEventFilterInput.this.amountRefunded.value != 0 ? ((ModelIntInput) ModelPaymentEventFilterInput.this.amountRefunded.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.error.defined) {
                    inputFieldWriter.writeObject(Constants.IPC_BUNDLE_KEY_SEND_ERROR, ModelPaymentEventFilterInput.this.error.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.error.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.acquirerData.defined) {
                    inputFieldWriter.writeObject("acquirerData", ModelPaymentEventFilterInput.this.acquirerData.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.acquirerData.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelPaymentEventFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelPaymentEventFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelPaymentEventFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelPaymentEventFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelPaymentEventFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelPaymentEventFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelPaymentEventFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelPaymentEventFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelPaymentEventFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentEventFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentEventFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentEventFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentEventFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelPaymentEventFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentEventFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentEventFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentEventFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentEventFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelPaymentEventFilterInput.this.not.value != 0 ? ((ModelPaymentEventFilterInput) ModelPaymentEventFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput method() {
        return this.method.value;
    }

    public ModelPaymentEventFilterInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelPaymentEventFilterInput> or() {
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
