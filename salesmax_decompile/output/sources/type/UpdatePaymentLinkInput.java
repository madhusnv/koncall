package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdatePaymentLinkInput implements InputType {
    private final Input<Boolean> acceptPartial;
    private final Input<String> accountId;
    private final Input<Integer> amount;
    private final Input<Integer> amountPaid;
    private final Input<String> cancelledAt;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> currency;
    private final Input<String> description;
    private final Input<String> expireBy;
    private final Input<String> expiredAt;
    private final Input<String> externalUserReference;
    private final Input<Integer> firstMinPartialAmount;
    private final String id;
    private final Input<String> idInPaymentProvider;
    private final Input<String> note;
    private final Input<String> orderId;
    private final Input<String> paymentProvider;
    private final Input<String> shortUrl;
    private final Input<String> status;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> upiLink;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> paymentProvider = Input.absent();
        private Input<String> idInPaymentProvider = Input.absent();
        private Input<String> orderId = Input.absent();
        private Input<Boolean> acceptPartial = Input.absent();
        private Input<Integer> firstMinPartialAmount = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<Integer> amount = Input.absent();
        private Input<Integer> amountPaid = Input.absent();
        private Input<String> description = Input.absent();
        private Input<String> note = Input.absent();
        private Input<String> shortUrl = Input.absent();
        private Input<String> upiLink = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> expireBy = Input.absent();
        private Input<String> expiredAt = Input.absent();
        private Input<String> cancelledAt = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> externalUserReference = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();

        public Builder acceptPartial(Boolean bool) {
            this.acceptPartial = Input.fromNullable(bool);
            return this;
        }

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

        public UpdatePaymentLinkInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdatePaymentLinkInput(this.id, this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.orderId, this.acceptPartial, this.firstMinPartialAmount, this.currency, this.amount, this.amountPaid, this.description, this.note, this.shortUrl, this.upiLink, this.status, this.expireBy, this.expiredAt, this.cancelledAt, this.createdAt, this.updatedAt, this.externalUserReference, this.createdById, this.updatedById);
        }

        public Builder cancelledAt(String str) {
            this.cancelledAt = Input.fromNullable(str);
            return this;
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

        public Builder expireBy(String str) {
            this.expireBy = Input.fromNullable(str);
            return this;
        }

        public Builder expiredAt(String str) {
            this.expiredAt = Input.fromNullable(str);
            return this;
        }

        public Builder externalUserReference(String str) {
            this.externalUserReference = Input.fromNullable(str);
            return this;
        }

        public Builder firstMinPartialAmount(Integer num) {
            this.firstMinPartialAmount = Input.fromNullable(num);
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

        public Builder orderId(String str) {
            this.orderId = Input.fromNullable(str);
            return this;
        }

        public Builder paymentProvider(String str) {
            this.paymentProvider = Input.fromNullable(str);
            return this;
        }

        public Builder shortUrl(String str) {
            this.shortUrl = Input.fromNullable(str);
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

        public Builder upiLink(String str) {
            this.upiLink = Input.fromNullable(str);
            return this;
        }
    }

    public UpdatePaymentLinkInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Boolean> input6, Input<Integer> input7, Input<String> input8, Input<Integer> input9, Input<Integer> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23) {
        this.id = str;
        this.accountId = input;
        this.contactId = input2;
        this.paymentProvider = input3;
        this.idInPaymentProvider = input4;
        this.orderId = input5;
        this.acceptPartial = input6;
        this.firstMinPartialAmount = input7;
        this.currency = input8;
        this.amount = input9;
        this.amountPaid = input10;
        this.description = input11;
        this.note = input12;
        this.shortUrl = input13;
        this.upiLink = input14;
        this.status = input15;
        this.expireBy = input16;
        this.expiredAt = input17;
        this.cancelledAt = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
        this.externalUserReference = input21;
        this.createdById = input22;
        this.updatedById = input23;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean acceptPartial() {
        return this.acceptPartial.value;
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

    public String cancelledAt() {
        return this.cancelledAt.value;
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

    public String expireBy() {
        return this.expireBy.value;
    }

    public String expiredAt() {
        return this.expiredAt.value;
    }

    public String externalUserReference() {
        return this.externalUserReference.value;
    }

    public Integer firstMinPartialAmount() {
        return this.firstMinPartialAmount.value;
    }

    public String id() {
        return this.id;
    }

    public String idInPaymentProvider() {
        return this.idInPaymentProvider.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdatePaymentLinkInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdatePaymentLinkInput.this.id);
                if (UpdatePaymentLinkInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdatePaymentLinkInput.this.accountId.value);
                }
                if (UpdatePaymentLinkInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdatePaymentLinkInput.this.contactId.value);
                }
                if (UpdatePaymentLinkInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeString("paymentProvider", (String) UpdatePaymentLinkInput.this.paymentProvider.value);
                }
                if (UpdatePaymentLinkInput.this.idInPaymentProvider.defined) {
                    inputFieldWriter.writeString("idInPaymentProvider", (String) UpdatePaymentLinkInput.this.idInPaymentProvider.value);
                }
                if (UpdatePaymentLinkInput.this.orderId.defined) {
                    inputFieldWriter.writeString("orderId", (String) UpdatePaymentLinkInput.this.orderId.value);
                }
                if (UpdatePaymentLinkInput.this.acceptPartial.defined) {
                    inputFieldWriter.writeBoolean("acceptPartial", (Boolean) UpdatePaymentLinkInput.this.acceptPartial.value);
                }
                if (UpdatePaymentLinkInput.this.firstMinPartialAmount.defined) {
                    inputFieldWriter.writeInt("firstMinPartialAmount", (Integer) UpdatePaymentLinkInput.this.firstMinPartialAmount.value);
                }
                if (UpdatePaymentLinkInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) UpdatePaymentLinkInput.this.currency.value);
                }
                if (UpdatePaymentLinkInput.this.amount.defined) {
                    inputFieldWriter.writeInt("amount", (Integer) UpdatePaymentLinkInput.this.amount.value);
                }
                if (UpdatePaymentLinkInput.this.amountPaid.defined) {
                    inputFieldWriter.writeInt("amountPaid", (Integer) UpdatePaymentLinkInput.this.amountPaid.value);
                }
                if (UpdatePaymentLinkInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdatePaymentLinkInput.this.description.value);
                }
                if (UpdatePaymentLinkInput.this.note.defined) {
                    inputFieldWriter.writeString("note", (String) UpdatePaymentLinkInput.this.note.value);
                }
                if (UpdatePaymentLinkInput.this.shortUrl.defined) {
                    inputFieldWriter.writeString("shortUrl", (String) UpdatePaymentLinkInput.this.shortUrl.value);
                }
                if (UpdatePaymentLinkInput.this.upiLink.defined) {
                    inputFieldWriter.writeString("upiLink", (String) UpdatePaymentLinkInput.this.upiLink.value);
                }
                if (UpdatePaymentLinkInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdatePaymentLinkInput.this.status.value);
                }
                if (UpdatePaymentLinkInput.this.expireBy.defined) {
                    inputFieldWriter.writeString("expireBy", (String) UpdatePaymentLinkInput.this.expireBy.value);
                }
                if (UpdatePaymentLinkInput.this.expiredAt.defined) {
                    inputFieldWriter.writeString("expiredAt", (String) UpdatePaymentLinkInput.this.expiredAt.value);
                }
                if (UpdatePaymentLinkInput.this.cancelledAt.defined) {
                    inputFieldWriter.writeString("cancelledAt", (String) UpdatePaymentLinkInput.this.cancelledAt.value);
                }
                if (UpdatePaymentLinkInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdatePaymentLinkInput.this.createdAt.value);
                }
                if (UpdatePaymentLinkInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdatePaymentLinkInput.this.updatedAt.value);
                }
                if (UpdatePaymentLinkInput.this.externalUserReference.defined) {
                    inputFieldWriter.writeString("externalUserReference", (String) UpdatePaymentLinkInput.this.externalUserReference.value);
                }
                if (UpdatePaymentLinkInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdatePaymentLinkInput.this.createdById.value);
                }
                if (UpdatePaymentLinkInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdatePaymentLinkInput.this.updatedById.value);
                }
            }
        };
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

    public String shortUrl() {
        return this.shortUrl.value;
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

    public String upiLink() {
        return this.upiLink.value;
    }
}
