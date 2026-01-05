package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdatePaymentDataInput implements InputType {
    private final Input<String> accountId;
    private final Input<Integer> amount;
    private final Input<Integer> amountPaid;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> currency;
    private final Input<String> customPaymentData;
    private final Input<String> engagementId;
    private final Input<String> finalPaymentDate;
    private final String id;
    private final Input<String> lastPaymentStatus;
    private final Input<String> note;
    private final Input<String> orderId;
    private final Input<String> orderIdInPaymentProvider;
    private final Input<List<String>> paidByContactIds;
    private final Input<String> paymentLinkId;
    private final Input<String> paymentLinkUrl;
    private final Input<String> paymentProvider;
    private final Input<String> paymentRequestType;
    private final Input<String> status;
    private final Input<List<String>> transactionId;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> paymentRequestType = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> paymentProvider = Input.absent();
        private Input<String> orderIdInPaymentProvider = Input.absent();
        private Input<String> orderId = Input.absent();
        private Input<String> paymentLinkId = Input.absent();
        private Input<String> paymentLinkUrl = Input.absent();
        private Input<Integer> amount = Input.absent();
        private Input<Integer> amountPaid = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> lastPaymentStatus = Input.absent();
        private Input<String> finalPaymentDate = Input.absent();
        private Input<List<String>> paidByContactIds = Input.absent();
        private Input<List<String>> transactionId = Input.absent();
        private Input<String> note = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> customPaymentData = Input.absent();
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

        public UpdatePaymentDataInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdatePaymentDataInput(this.id, this.accountId, this.contactId, this.paymentRequestType, this.engagementId, this.paymentProvider, this.orderIdInPaymentProvider, this.orderId, this.paymentLinkId, this.paymentLinkUrl, this.amount, this.amountPaid, this.currency, this.status, this.lastPaymentStatus, this.finalPaymentDate, this.paidByContactIds, this.transactionId, this.note, this.createdAt, this.updatedAt, this.customPaymentData, this.createdById, this.updatedById);
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

        public Builder customPaymentData(String str) {
            this.customPaymentData = Input.fromNullable(str);
            return this;
        }

        public Builder engagementId(String str) {
            this.engagementId = Input.fromNullable(str);
            return this;
        }

        public Builder finalPaymentDate(String str) {
            this.finalPaymentDate = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder lastPaymentStatus(String str) {
            this.lastPaymentStatus = Input.fromNullable(str);
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

        public Builder orderIdInPaymentProvider(String str) {
            this.orderIdInPaymentProvider = Input.fromNullable(str);
            return this;
        }

        public Builder paidByContactIds(List<String> list) {
            this.paidByContactIds = Input.fromNullable(list);
            return this;
        }

        public Builder paymentLinkId(String str) {
            this.paymentLinkId = Input.fromNullable(str);
            return this;
        }

        public Builder paymentLinkUrl(String str) {
            this.paymentLinkUrl = Input.fromNullable(str);
            return this;
        }

        public Builder paymentProvider(String str) {
            this.paymentProvider = Input.fromNullable(str);
            return this;
        }

        public Builder paymentRequestType(String str) {
            this.paymentRequestType = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder transactionId(List<String> list) {
            this.transactionId = Input.fromNullable(list);
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

    public UpdatePaymentDataInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<Integer> input10, Input<Integer> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<List<String>> input16, Input<List<String>> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23) {
        this.id = str;
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

    public String customPaymentData() {
        return this.customPaymentData.value;
    }

    public String engagementId() {
        return this.engagementId.value;
    }

    public String finalPaymentDate() {
        return this.finalPaymentDate.value;
    }

    public String id() {
        return this.id;
    }

    public String lastPaymentStatus() {
        return this.lastPaymentStatus.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdatePaymentDataInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdatePaymentDataInput.this.id);
                if (UpdatePaymentDataInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdatePaymentDataInput.this.accountId.value);
                }
                if (UpdatePaymentDataInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdatePaymentDataInput.this.contactId.value);
                }
                if (UpdatePaymentDataInput.this.paymentRequestType.defined) {
                    inputFieldWriter.writeString("paymentRequestType", (String) UpdatePaymentDataInput.this.paymentRequestType.value);
                }
                if (UpdatePaymentDataInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) UpdatePaymentDataInput.this.engagementId.value);
                }
                if (UpdatePaymentDataInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeString("paymentProvider", (String) UpdatePaymentDataInput.this.paymentProvider.value);
                }
                if (UpdatePaymentDataInput.this.orderIdInPaymentProvider.defined) {
                    inputFieldWriter.writeString("orderIdInPaymentProvider", (String) UpdatePaymentDataInput.this.orderIdInPaymentProvider.value);
                }
                if (UpdatePaymentDataInput.this.orderId.defined) {
                    inputFieldWriter.writeString("orderId", (String) UpdatePaymentDataInput.this.orderId.value);
                }
                if (UpdatePaymentDataInput.this.paymentLinkId.defined) {
                    inputFieldWriter.writeString("paymentLinkId", (String) UpdatePaymentDataInput.this.paymentLinkId.value);
                }
                if (UpdatePaymentDataInput.this.paymentLinkUrl.defined) {
                    inputFieldWriter.writeString("paymentLinkUrl", (String) UpdatePaymentDataInput.this.paymentLinkUrl.value);
                }
                if (UpdatePaymentDataInput.this.amount.defined) {
                    inputFieldWriter.writeInt("amount", (Integer) UpdatePaymentDataInput.this.amount.value);
                }
                if (UpdatePaymentDataInput.this.amountPaid.defined) {
                    inputFieldWriter.writeInt("amountPaid", (Integer) UpdatePaymentDataInput.this.amountPaid.value);
                }
                if (UpdatePaymentDataInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) UpdatePaymentDataInput.this.currency.value);
                }
                if (UpdatePaymentDataInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdatePaymentDataInput.this.status.value);
                }
                if (UpdatePaymentDataInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeString("lastPaymentStatus", (String) UpdatePaymentDataInput.this.lastPaymentStatus.value);
                }
                if (UpdatePaymentDataInput.this.finalPaymentDate.defined) {
                    inputFieldWriter.writeString("finalPaymentDate", (String) UpdatePaymentDataInput.this.finalPaymentDate.value);
                }
                if (UpdatePaymentDataInput.this.paidByContactIds.defined) {
                    inputFieldWriter.writeList("paidByContactIds", UpdatePaymentDataInput.this.paidByContactIds.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdatePaymentDataInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdatePaymentDataInput.this.paidByContactIds.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdatePaymentDataInput.this.transactionId.defined) {
                    inputFieldWriter.writeList("transactionId", UpdatePaymentDataInput.this.transactionId.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdatePaymentDataInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdatePaymentDataInput.this.transactionId.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdatePaymentDataInput.this.note.defined) {
                    inputFieldWriter.writeString("note", (String) UpdatePaymentDataInput.this.note.value);
                }
                if (UpdatePaymentDataInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdatePaymentDataInput.this.createdAt.value);
                }
                if (UpdatePaymentDataInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdatePaymentDataInput.this.updatedAt.value);
                }
                if (UpdatePaymentDataInput.this.customPaymentData.defined) {
                    inputFieldWriter.writeString("customPaymentData", (String) UpdatePaymentDataInput.this.customPaymentData.value);
                }
                if (UpdatePaymentDataInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdatePaymentDataInput.this.createdById.value);
                }
                if (UpdatePaymentDataInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdatePaymentDataInput.this.updatedById.value);
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

    public String orderIdInPaymentProvider() {
        return this.orderIdInPaymentProvider.value;
    }

    public List<String> paidByContactIds() {
        return this.paidByContactIds.value;
    }

    public String paymentLinkId() {
        return this.paymentLinkId.value;
    }

    public String paymentLinkUrl() {
        return this.paymentLinkUrl.value;
    }

    public String paymentProvider() {
        return this.paymentProvider.value;
    }

    public String paymentRequestType() {
        return this.paymentRequestType.value;
    }

    public String status() {
        return this.status.value;
    }

    public List<String> transactionId() {
        return this.transactionId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }
}
