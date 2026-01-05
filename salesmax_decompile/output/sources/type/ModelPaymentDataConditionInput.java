package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelPaymentDataConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIntInput> amount;
    private final Input<ModelIntInput> amountPaid;
    private final Input<List<ModelPaymentDataConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currency;
    private final Input<ModelStringInput> customPaymentData;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> finalPaymentDate;
    private final Input<ModelStringInput> lastPaymentStatus;
    private final Input<ModelPaymentDataConditionInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelPaymentDataConditionInput>> or;
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
        private Input<List<ModelPaymentDataConditionInput>> and = Input.absent();
        private Input<List<ModelPaymentDataConditionInput>> or = Input.absent();
        private Input<ModelPaymentDataConditionInput> not = Input.absent();

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

        public Builder and(List<ModelPaymentDataConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelPaymentDataConditionInput build() {
            return new ModelPaymentDataConditionInput(this.accountId, this.contactId, this.paymentRequestType, this.engagementId, this.paymentProvider, this.orderIdInPaymentProvider, this.orderId, this.paymentLinkId, this.paymentLinkUrl, this.amount, this.amountPaid, this.currency, this.status, this.lastPaymentStatus, this.finalPaymentDate, this.paidByContactIds, this.transactionId, this.note, this.createdAt, this.updatedAt, this.customPaymentData, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder lastPaymentStatus(ModelStringInput modelStringInput) {
            this.lastPaymentStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelPaymentDataConditionInput modelPaymentDataConditionInput) {
            this.not = Input.fromNullable(modelPaymentDataConditionInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelPaymentDataConditionInput> list) {
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

    public ModelPaymentDataConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelIntInput> input10, Input<ModelIntInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelIDInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelIDInput> input22, Input<ModelIDInput> input23, Input<List<ModelPaymentDataConditionInput>> input24, Input<List<ModelPaymentDataConditionInput>> input25, Input<ModelPaymentDataConditionInput> input26) {
        this.accountId = input;
        this.contactId = input2;
        this.paymentRequestType = input3;
        this.engagementId = input4;
        this.paymentProvider = input5;
        this.orderIdInPaymentProvider = input6;
        this.orderId = input7;
        this.paymentLinkId = input8;
        this.paymentLinkUrl = input9;
        this.amount = input10;
        this.amountPaid = input11;
        this.currency = input12;
        this.status = input13;
        this.lastPaymentStatus = input14;
        this.finalPaymentDate = input15;
        this.paidByContactIds = input16;
        this.transactionId = input17;
        this.note = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
        this.customPaymentData = input21;
        this.createdById = input22;
        this.updatedById = input23;
        this.and = input24;
        this.or = input25;
        this.not = input26;
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

    public List<ModelPaymentDataConditionInput> and() {
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

    public ModelStringInput lastPaymentStatus() {
        return this.lastPaymentStatus.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentDataConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelPaymentDataConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelPaymentDataConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelPaymentDataConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelPaymentDataConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelPaymentDataConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.paymentRequestType.defined) {
                    inputFieldWriter.writeObject("paymentRequestType", ModelPaymentDataConditionInput.this.paymentRequestType.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.paymentRequestType.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelPaymentDataConditionInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelPaymentDataConditionInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeObject("paymentProvider", ModelPaymentDataConditionInput.this.paymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.paymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.orderIdInPaymentProvider.defined) {
                    inputFieldWriter.writeObject("orderIdInPaymentProvider", ModelPaymentDataConditionInput.this.orderIdInPaymentProvider.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.orderIdInPaymentProvider.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.orderId.defined) {
                    inputFieldWriter.writeObject("orderId", ModelPaymentDataConditionInput.this.orderId.value != 0 ? ((ModelIDInput) ModelPaymentDataConditionInput.this.orderId.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.paymentLinkId.defined) {
                    inputFieldWriter.writeObject("paymentLinkId", ModelPaymentDataConditionInput.this.paymentLinkId.value != 0 ? ((ModelIDInput) ModelPaymentDataConditionInput.this.paymentLinkId.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.paymentLinkUrl.defined) {
                    inputFieldWriter.writeObject("paymentLinkUrl", ModelPaymentDataConditionInput.this.paymentLinkUrl.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.paymentLinkUrl.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelPaymentDataConditionInput.this.amount.value != 0 ? ((ModelIntInput) ModelPaymentDataConditionInput.this.amount.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.amountPaid.defined) {
                    inputFieldWriter.writeObject("amountPaid", ModelPaymentDataConditionInput.this.amountPaid.value != 0 ? ((ModelIntInput) ModelPaymentDataConditionInput.this.amountPaid.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelPaymentDataConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelPaymentDataConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeObject("lastPaymentStatus", ModelPaymentDataConditionInput.this.lastPaymentStatus.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.lastPaymentStatus.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.finalPaymentDate.defined) {
                    inputFieldWriter.writeObject("finalPaymentDate", ModelPaymentDataConditionInput.this.finalPaymentDate.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.finalPaymentDate.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.paidByContactIds.defined) {
                    inputFieldWriter.writeObject("paidByContactIds", ModelPaymentDataConditionInput.this.paidByContactIds.value != 0 ? ((ModelIDInput) ModelPaymentDataConditionInput.this.paidByContactIds.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.transactionId.defined) {
                    inputFieldWriter.writeObject("transactionId", ModelPaymentDataConditionInput.this.transactionId.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.transactionId.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelPaymentDataConditionInput.this.note.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.note.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelPaymentDataConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelPaymentDataConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.customPaymentData.defined) {
                    inputFieldWriter.writeObject("customPaymentData", ModelPaymentDataConditionInput.this.customPaymentData.value != 0 ? ((ModelStringInput) ModelPaymentDataConditionInput.this.customPaymentData.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelPaymentDataConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelPaymentDataConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelPaymentDataConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelPaymentDataConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelPaymentDataConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelPaymentDataConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentDataConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentDataConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentDataConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentDataConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelPaymentDataConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentDataConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelPaymentDataConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentDataConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelPaymentDataConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelPaymentDataConditionInput.this.not.value != 0 ? ((ModelPaymentDataConditionInput) ModelPaymentDataConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelPaymentDataConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelPaymentDataConditionInput> or() {
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
