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
public final class ModelPaymentDataFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIntInput> amount;
    private final Input<ModelIntInput> amountPaid;
    private final Input<List<ModelPaymentDataFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currency;
    private final Input<ModelStringInput> customPaymentData;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> finalPaymentDate;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> lastPaymentStatus;
    private final Input<ModelPaymentDataFilterInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelPaymentDataFilterInput>> or;
    private final Input<ModelIDInput> orderId;
    private final Input<ModelStringInput> orderIdInPaymentProvider;
    private final Input<ModelIDInput> paidByContactIds;
    private final Input<ModelIDInput> paymentLinkId;
    private final Input<ModelStringInput> paymentLinkUrl;
    private final Input<ModelStringInput> paymentProvider;
    private final Input<ModelStringInput> paymentRequestType;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> transactionId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> paymentRequestType = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelStringInput> paymentProvider = Input.absent();
        private Input<ModelStringInput> orderIdInPaymentProvider = Input.absent();
        private Input<ModelIDInput> orderId = Input.absent();
        private Input<ModelIDInput> paymentLinkId = Input.absent();
        private Input<ModelStringInput> paymentLinkUrl = Input.absent();
        private Input<ModelIntInput> amount = Input.absent();
        private Input<ModelIntInput> amountPaid = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> lastPaymentStatus = Input.absent();
        private Input<ModelStringInput> finalPaymentDate = Input.absent();
        private Input<ModelIDInput> paidByContactIds = Input.absent();
        private Input<ModelStringInput> transactionId = Input.absent();
        private Input<ModelStringInput> note = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelStringInput> customPaymentData = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelPaymentDataFilterInput>> and = Input.absent();
        private Input<List<ModelPaymentDataFilterInput>> or = Input.absent();
        private Input<ModelPaymentDataFilterInput> not = Input.absent();

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

        public Builder and(List<ModelPaymentDataFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelPaymentDataFilterInput build() {
            return new ModelPaymentDataFilterInput(this.id, this.accountId, this.contactId, this.paymentRequestType, this.engagementId, this.paymentProvider, this.orderIdInPaymentProvider, this.orderId, this.paymentLinkId, this.paymentLinkUrl, this.amount, this.amountPaid, this.currency, this.status, this.lastPaymentStatus, this.finalPaymentDate, this.paidByContactIds, this.transactionId, this.note, this.createdAt, this.updatedAt, this.customPaymentData, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder customPaymentData(ModelStringInput modelStringInput) {
            this.customPaymentData = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder finalPaymentDate(ModelStringInput modelStringInput) {
            this.finalPaymentDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastPaymentStatus(ModelStringInput modelStringInput) {
            this.lastPaymentStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelPaymentDataFilterInput modelPaymentDataFilterInput) {
            this.not = Input.fromNullable(modelPaymentDataFilterInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelPaymentDataFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder orderId(ModelIDInput modelIDInput) {
            this.orderId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder orderIdInPaymentProvider(ModelStringInput modelStringInput) {
            this.orderIdInPaymentProvider = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder paidByContactIds(ModelIDInput modelIDInput) {
            this.paidByContactIds = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder paymentLinkId(ModelIDInput modelIDInput) {
            this.paymentLinkId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder paymentLinkUrl(ModelStringInput modelStringInput) {
            this.paymentLinkUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder paymentProvider(ModelStringInput modelStringInput) {
            this.paymentProvider = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder paymentRequestType(ModelStringInput modelStringInput) {
            this.paymentRequestType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder transactionId(ModelStringInput modelStringInput) {
            this.transactionId = Input.fromNullable(modelStringInput);
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

    public ModelPaymentDataFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelStringInput> input10, Input<ModelIntInput> input11, Input<ModelIntInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelIDInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelIDInput> input23, Input<ModelIDInput> input24, Input<List<ModelPaymentDataFilterInput>> input25, Input<List<ModelPaymentDataFilterInput>> input26, Input<ModelPaymentDataFilterInput> input27) {
        this.id = input;
        this.accountId = input2;
        this.contactId = input3;
        this.paymentRequestType = input4;
        this.engagementId = input5;
        this.paymentProvider = input6;
        this.orderIdInPaymentProvider = input7;
        this.orderId = input8;
        this.paymentLinkId = input9;
        this.paymentLinkUrl = input10;
        this.amount = input11;
        this.amountPaid = input12;
        this.currency = input13;
        this.status = input14;
        this.lastPaymentStatus = input15;
        this.finalPaymentDate = input16;
        this.paidByContactIds = input17;
        this.transactionId = input18;
        this.note = input19;
        this.createdAt = input20;
        this.updatedAt = input21;
        this.customPaymentData = input22;
        this.createdById = input23;
        this.updatedById = input24;
        this.and = input25;
        this.or = input26;
        this.not = input27;
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

    public List<ModelPaymentDataFilterInput> and() {
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

    public ModelStringInput customPaymentData() {
        return this.customPaymentData.value;
    }

    public ModelIDInput engagementId() {
        return this.engagementId.value;
    }

    public ModelStringInput finalPaymentDate() {
        return this.finalPaymentDate.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput lastPaymentStatus() {
        return this.lastPaymentStatus.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentDataFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelPaymentDataFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelPaymentDataFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelPaymentDataFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelPaymentDataFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelPaymentDataFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelPaymentDataFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelPaymentDataFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.paymentRequestType.defined) {
                    inputFieldWriter.writeObject("paymentRequestType", ModelPaymentDataFilterInput.this.paymentRequestType.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.paymentRequestType.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelPaymentDataFilterInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelPaymentDataFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeObject("paymentProvider", ModelPaymentDataFilterInput.this.paymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.paymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.orderIdInPaymentProvider.defined) {
                    inputFieldWriter.writeObject("orderIdInPaymentProvider", ModelPaymentDataFilterInput.this.orderIdInPaymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.orderIdInPaymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.orderId.defined) {
                    inputFieldWriter.writeObject("orderId", ModelPaymentDataFilterInput.this.orderId.value != 0 ? ((ModelIDInput) ModelPaymentDataFilterInput.this.orderId.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.paymentLinkId.defined) {
                    inputFieldWriter.writeObject("paymentLinkId", ModelPaymentDataFilterInput.this.paymentLinkId.value != 0 ? ((ModelIDInput) ModelPaymentDataFilterInput.this.paymentLinkId.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.paymentLinkUrl.defined) {
                    inputFieldWriter.writeObject("paymentLinkUrl", ModelPaymentDataFilterInput.this.paymentLinkUrl.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.paymentLinkUrl.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelPaymentDataFilterInput.this.amount.value != 0 ? ((ModelIntInput) ModelPaymentDataFilterInput.this.amount.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.amountPaid.defined) {
                    inputFieldWriter.writeObject("amountPaid", ModelPaymentDataFilterInput.this.amountPaid.value != 0 ? ((ModelIntInput) ModelPaymentDataFilterInput.this.amountPaid.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelPaymentDataFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelPaymentDataFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeObject("lastPaymentStatus", ModelPaymentDataFilterInput.this.lastPaymentStatus.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.lastPaymentStatus.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.finalPaymentDate.defined) {
                    inputFieldWriter.writeObject("finalPaymentDate", ModelPaymentDataFilterInput.this.finalPaymentDate.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.finalPaymentDate.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.paidByContactIds.defined) {
                    inputFieldWriter.writeObject("paidByContactIds", ModelPaymentDataFilterInput.this.paidByContactIds.value != 0 ? ((ModelIDInput) ModelPaymentDataFilterInput.this.paidByContactIds.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.transactionId.defined) {
                    inputFieldWriter.writeObject("transactionId", ModelPaymentDataFilterInput.this.transactionId.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.transactionId.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelPaymentDataFilterInput.this.note.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.note.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelPaymentDataFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelPaymentDataFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.customPaymentData.defined) {
                    inputFieldWriter.writeObject("customPaymentData", ModelPaymentDataFilterInput.this.customPaymentData.value != 0 ? ((ModelStringInput) ModelPaymentDataFilterInput.this.customPaymentData.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelPaymentDataFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelPaymentDataFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelPaymentDataFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelPaymentDataFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelPaymentDataFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelPaymentDataFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentDataFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentDataFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentDataFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelPaymentDataFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentDataFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentDataFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentDataFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelPaymentDataFilterInput.this.not.value != 0 ? ((ModelPaymentDataFilterInput) ModelPaymentDataFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelPaymentDataFilterInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelPaymentDataFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput orderId() {
        return this.orderId.value;
    }

    public ModelStringInput orderIdInPaymentProvider() {
        return this.orderIdInPaymentProvider.value;
    }

    public ModelIDInput paidByContactIds() {
        return this.paidByContactIds.value;
    }

    public ModelIDInput paymentLinkId() {
        return this.paymentLinkId.value;
    }

    public ModelStringInput paymentLinkUrl() {
        return this.paymentLinkUrl.value;
    }

    public ModelStringInput paymentProvider() {
        return this.paymentProvider.value;
    }

    public ModelStringInput paymentRequestType() {
        return this.paymentRequestType.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput transactionId() {
        return this.transactionId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }
}
