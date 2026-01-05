package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdatePaymentOrderInput implements InputType {
    private final Input<String> accountId;
    private final Input<Integer> amount;
    private final Input<Integer> amountPaid;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> currency;
    private final String id;
    private final Input<String> idInPaymentProvider;
    private final Input<String> note;
    private final Input<String> paymentProvider;
    private final Input<String> receipt;
    private final Input<String> status;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> paymentProvider = Input.absent();
        private Input<String> idInPaymentProvider = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<Integer> amount = Input.absent();
        private Input<Integer> amountPaid = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> note = Input.absent();
        private Input<String> receipt = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder amount(Integer num) {
            this.amount = Input.fromNullable(num);
            return this;
        }

        public Builder amountPaid(Integer num) {
            this.amountPaid = Input.fromNullable(num);
            return this;
        }

        public UpdatePaymentOrderInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdatePaymentOrderInput(this.id, this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.amountPaid, this.status, this.note, this.receipt, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder idInPaymentProvider(String str) {
            this.idInPaymentProvider = Input.fromNullable(str);
            return this;
        }

        public Builder note(String str) {
            this.note = Input.fromNullable(str);
            return this;
        }

        public Builder paymentProvider(String str) {
            this.paymentProvider = Input.fromNullable(str);
            return this;
        }

        public Builder receipt(String str) {
            this.receipt = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }
    }

    public UpdatePaymentOrderInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Integer> input6, Input<Integer> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14) {
        this.id = str;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public Integer amount() {
        return this.amount.value;
    }

    public Integer amountPaid() {
        return this.amountPaid.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String currency() {
        return this.currency.value;
    }

    public String id() {
        return this.id;
    }

    public String idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdatePaymentOrderInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdatePaymentOrderInput.this.id);
                if (UpdatePaymentOrderInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdatePaymentOrderInput.this.accountId.value);
                }
                if (UpdatePaymentOrderInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdatePaymentOrderInput.this.contactId.value);
                }
                if (UpdatePaymentOrderInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeString("paymentProvider", (String) UpdatePaymentOrderInput.this.paymentProvider.value);
                }
                if (UpdatePaymentOrderInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeString("idInPaymentProvider", (String) UpdatePaymentOrderInput.this.idInPaymentProvider.value);
                }
                if (UpdatePaymentOrderInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) UpdatePaymentOrderInput.this.currency.value);
                }
                if (UpdatePaymentOrderInput.this.amount.defined) {
                    inputFieldWriter.writeInt("amount", (Integer) UpdatePaymentOrderInput.this.amount.value);
                }
                if (UpdatePaymentOrderInput.this.amountPaid.defined) {
                    inputFieldWriter.writeInt("amountPaid", (Integer) UpdatePaymentOrderInput.this.amountPaid.value);
                }
                if (UpdatePaymentOrderInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdatePaymentOrderInput.this.status.value);
                }
                if (UpdatePaymentOrderInput.this.note.defined) {
                    inputFieldWriter.writeString("note", (String) UpdatePaymentOrderInput.this.note.value);
                }
                if (UpdatePaymentOrderInput.this.receipt.defined) {
                    inputFieldWriter.writeString("receipt", (String) UpdatePaymentOrderInput.this.receipt.value);
                }
                if (UpdatePaymentOrderInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdatePaymentOrderInput.this.createdAt.value);
                }
                if (UpdatePaymentOrderInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdatePaymentOrderInput.this.updatedAt.value);
                }
                if (UpdatePaymentOrderInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdatePaymentOrderInput.this.createdById.value);
                }
                if (UpdatePaymentOrderInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdatePaymentOrderInput.this.updatedById.value);
                }
            }
        };
    }

    public String note() {
        return this.note.value;
    }

    public String paymentProvider() {
        return this.paymentProvider.value;
    }

    public String receipt() {
        return this.receipt.value;
    }

    public String status() {
        return this.status.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }
}
