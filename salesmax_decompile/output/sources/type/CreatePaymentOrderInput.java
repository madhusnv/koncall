package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreatePaymentOrderInput implements InputType {
    private final String accountId;
    private final Input<Integer> amount;
    private final Input<Integer> amountPaid;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> currency;
    private final Input<String> id;
    private final Input<String> idInPaymentProvider;
    private final Input<String> note;
    private final Input<String> paymentProvider;
    private final Input<String> receipt;
    private final Input<String> status;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
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
            this.accountId = str;
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

        public CreatePaymentOrderInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreatePaymentOrderInput(this.id, this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.amountPaid, this.status, this.note, this.receipt, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
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
            this.id = Input.fromNullable(str);
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

    public CreatePaymentOrderInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Integer> input6, Input<Integer> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14) {
        this.id = input;
        this.accountId = str;
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
        return this.accountId;
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
        return this.id.value;
    }

    public String idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreatePaymentOrderInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreatePaymentOrderInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreatePaymentOrderInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreatePaymentOrderInput.this.accountId);
                if (CreatePaymentOrderInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreatePaymentOrderInput.this.contactId.value);
                }
                if (CreatePaymentOrderInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeString("paymentProvider", (String) CreatePaymentOrderInput.this.paymentProvider.value);
                }
                if (CreatePaymentOrderInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeString("idInPaymentProvider", (String) CreatePaymentOrderInput.this.idInPaymentProvider.value);
                }
                if (CreatePaymentOrderInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) CreatePaymentOrderInput.this.currency.value);
                }
                if (CreatePaymentOrderInput.this.amount.defined) {
                    inputFieldWriter.writeInt("amount", (Integer) CreatePaymentOrderInput.this.amount.value);
                }
                if (CreatePaymentOrderInput.this.amountPaid.defined) {
                    inputFieldWriter.writeInt("amountPaid", (Integer) CreatePaymentOrderInput.this.amountPaid.value);
                }
                if (CreatePaymentOrderInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreatePaymentOrderInput.this.status.value);
                }
                if (CreatePaymentOrderInput.this.note.defined) {
                    inputFieldWriter.writeString("note", (String) CreatePaymentOrderInput.this.note.value);
                }
                if (CreatePaymentOrderInput.this.receipt.defined) {
                    inputFieldWriter.writeString("receipt", (String) CreatePaymentOrderInput.this.receipt.value);
                }
                if (CreatePaymentOrderInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreatePaymentOrderInput.this.createdAt.value);
                }
                if (CreatePaymentOrderInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreatePaymentOrderInput.this.updatedAt.value);
                }
                if (CreatePaymentOrderInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreatePaymentOrderInput.this.createdById.value);
                }
                if (CreatePaymentOrderInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreatePaymentOrderInput.this.updatedById.value);
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
