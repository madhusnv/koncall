package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdatePaymentEventInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> acquirerData;
    private final Input<Integer> amount;
    private final Input<Integer> amountRefunded;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> currency;
    private final Input<String> description;
    private final Input<String> error;
    private final Input<String> externalOrderId;
    private final String id;
    private final Input<String> idInPaymentProvider;
    private final Input<Boolean> international;
    private final Input<String> method;
    private final Input<String> note;
    private final Input<String> orderId;
    private final Input<String> paymentProvider;
    private final Input<String> refundStatus;
    private final Input<String> status;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> orderId = Input.absent();
        private Input<String> externalOrderId = Input.absent();
        private Input<String> paymentProvider = Input.absent();
        private Input<String> idInPaymentProvider = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<Integer> amount = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> note = Input.absent();
        private Input<String> description = Input.absent();
        private Input<String> method = Input.absent();
        private Input<Boolean> international = Input.absent();
        private Input<String> refundStatus = Input.absent();
        private Input<Integer> amountRefunded = Input.absent();
        private Input<String> error = Input.absent();
        private Input<String> acquirerData = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder acquirerData(String str) {
            this.acquirerData = Input.fromNullable(str);
            return this;
        }

        public Builder amount(Integer num) {
            this.amount = Input.fromNullable(num);
            return this;
        }

        public Builder amountRefunded(Integer num) {
            this.amountRefunded = Input.fromNullable(num);
            return this;
        }

        public UpdatePaymentEventInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdatePaymentEventInput(this.id, this.accountId, this.contactId, this.orderId, this.externalOrderId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.status, this.note, this.description, this.method, this.international, this.refundStatus, this.amountRefunded, this.error, this.acquirerData, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
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

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder error(String str) {
            this.error = Input.fromNullable(str);
            return this;
        }

        public Builder externalOrderId(String str) {
            this.externalOrderId = Input.fromNullable(str);
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

        public Builder international(Boolean bool) {
            this.international = Input.fromNullable(bool);
            return this;
        }

        public Builder method(String str) {
            this.method = Input.fromNullable(str);
            return this;
        }

        public Builder note(String str) {
            this.note = Input.fromNullable(str);
            return this;
        }

        public Builder orderId(String str) {
            this.orderId = Input.fromNullable(str);
            return this;
        }

        public Builder paymentProvider(String str) {
            this.paymentProvider = Input.fromNullable(str);
            return this;
        }

        public Builder refundStatus(String str) {
            this.refundStatus = Input.fromNullable(str);
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

    public UpdatePaymentEventInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<Integer> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<Boolean> input13, Input<String> input14, Input<Integer> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21) {
        this.id = str;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String acquirerData() {
        return this.acquirerData.value;
    }

    public Integer amount() {
        return this.amount.value;
    }

    public Integer amountRefunded() {
        return this.amountRefunded.value;
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

    public String description() {
        return this.description.value;
    }

    public String error() {
        return this.error.value;
    }

    public String externalOrderId() {
        return this.externalOrderId.value;
    }

    public String id() {
        return this.id;
    }

    public String idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    public Boolean international() {
        return this.international.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdatePaymentEventInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdatePaymentEventInput.this.id);
                if (UpdatePaymentEventInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdatePaymentEventInput.this.accountId.value);
                }
                if (UpdatePaymentEventInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdatePaymentEventInput.this.contactId.value);
                }
                if (UpdatePaymentEventInput.this.orderId.defined) {
                    inputFieldWriter.writeString("orderId", (String) UpdatePaymentEventInput.this.orderId.value);
                }
                if (UpdatePaymentEventInput.this.externalOrderId.defined) {
                    inputFieldWriter.writeString("externalOrderId", (String) UpdatePaymentEventInput.this.externalOrderId.value);
                }
                if (UpdatePaymentEventInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeString("paymentProvider", (String) UpdatePaymentEventInput.this.paymentProvider.value);
                }
                if (UpdatePaymentEventInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeString("idInPaymentProvider", (String) UpdatePaymentEventInput.this.idInPaymentProvider.value);
                }
                if (UpdatePaymentEventInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) UpdatePaymentEventInput.this.currency.value);
                }
                if (UpdatePaymentEventInput.this.amount.defined) {
                    inputFieldWriter.writeInt("amount", (Integer) UpdatePaymentEventInput.this.amount.value);
                }
                if (UpdatePaymentEventInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdatePaymentEventInput.this.status.value);
                }
                if (UpdatePaymentEventInput.this.note.defined) {
                    inputFieldWriter.writeString("note", (String) UpdatePaymentEventInput.this.note.value);
                }
                if (UpdatePaymentEventInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdatePaymentEventInput.this.description.value);
                }
                if (UpdatePaymentEventInput.this.method.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.METHOD, (String) UpdatePaymentEventInput.this.method.value);
                }
                if (UpdatePaymentEventInput.this.international.defined) {
                    inputFieldWriter.writeBoolean("international", (Boolean) UpdatePaymentEventInput.this.international.value);
                }
                if (UpdatePaymentEventInput.this.refundStatus.defined) {
                    inputFieldWriter.writeString("refundStatus", (String) UpdatePaymentEventInput.this.refundStatus.value);
                }
                if (UpdatePaymentEventInput.this.amountRefunded.defined) {
                    inputFieldWriter.writeInt("amountRefunded", (Integer) UpdatePaymentEventInput.this.amountRefunded.value);
                }
                if (UpdatePaymentEventInput.this.error.defined) {
                    inputFieldWriter.writeString(Constants.IPC_BUNDLE_KEY_SEND_ERROR, (String) UpdatePaymentEventInput.this.error.value);
                }
                if (UpdatePaymentEventInput.this.acquirerData.defined) {
                    inputFieldWriter.writeString("acquirerData", (String) UpdatePaymentEventInput.this.acquirerData.value);
                }
                if (UpdatePaymentEventInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdatePaymentEventInput.this.createdAt.value);
                }
                if (UpdatePaymentEventInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdatePaymentEventInput.this.updatedAt.value);
                }
                if (UpdatePaymentEventInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdatePaymentEventInput.this.createdById.value);
                }
                if (UpdatePaymentEventInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdatePaymentEventInput.this.updatedById.value);
                }
            }
        };
    }

    public String method() {
        return this.method.value;
    }

    public String note() {
        return this.note.value;
    }

    public String orderId() {
        return this.orderId.value;
    }

    public String paymentProvider() {
        return this.paymentProvider.value;
    }

    public String refundStatus() {
        return this.refundStatus.value;
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
