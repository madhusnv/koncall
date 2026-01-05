package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes7.dex */
public final class CreateClientAccountInput implements InputType {
    private final Input<String> accountCreationDate;
    private final String accountId;
    private final Input<String> accountSalesOwnerId;
    private final Input<String> accountSupportOwnerId;
    private final Input<String> alternateBillingContactId;
    private final Input<String> billCycleEndDate;
    private final Input<String> billCycleStartDate;
    private final Input<String> billingContactId;
    private final Input<String> billingDate;
    private final Input<String> billingPeriod;
    private final String clientAccountId;
    private final Input<String> clientAccountStatus;
    private final Input<String> clientAccountTrialEndDate;
    private final Input<Integer> clientAccountTrialExtensionTimes;
    private final Input<String> clientAccountType;
    private final Input<String> createdAt;
    private final Input<String> currency;
    private final Input<Integer> currentUserCount;
    private final Input<Integer> freeUserCount;
    private final Input<String> lastBillStatus;
    private final Input<Integer> lastBilledAmmount;
    private final Input<String> lastBilledCycleEndDate;
    private final Input<String> lastBilledCycleStartDate;
    private final Input<String> lastBilledDate;
    private final Input<Integer> lastBilledUserCount;
    private final Input<Integer> lastPaidAmount;
    private final Input<String> lastPaidProductAccountBillId;
    private final Input<Integer> lastPaidUserCount;
    private final Input<String> lastPaymentDate;
    private final Input<String> lastPaymentFollowupDoneOn;
    private final Input<String> lastPaymentFollowupNote;
    private final Input<String> lastPendingProductAccountBillId;
    private final Input<String> nextBillingCycleEndDate;
    private final Input<String> nextBillingCycleStartDate;
    private final Input<String> nextBillingDate;
    private final Input<String> nextPaymentDueDate;
    private final Input<String> paymentDueDate;
    private final Input<String> subscriptionCreationDate;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String clientAccountId;
        private Input<String> clientAccountType = Input.absent();
        private Input<String> clientAccountStatus = Input.absent();
        private Input<String> clientAccountTrialEndDate = Input.absent();
        private Input<Integer> clientAccountTrialExtensionTimes = Input.absent();
        private Input<String> billingContactId = Input.absent();
        private Input<String> alternateBillingContactId = Input.absent();
        private Input<String> lastPendingProductAccountBillId = Input.absent();
        private Input<String> lastPaidProductAccountBillId = Input.absent();
        private Input<String> accountSalesOwnerId = Input.absent();
        private Input<String> accountSupportOwnerId = Input.absent();
        private Input<Integer> currentUserCount = Input.absent();
        private Input<Integer> freeUserCount = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<String> subscriptionCreationDate = Input.absent();
        private Input<String> accountCreationDate = Input.absent();
        private Input<String> lastBilledCycleStartDate = Input.absent();
        private Input<String> lastBilledCycleEndDate = Input.absent();
        private Input<String> lastBilledDate = Input.absent();
        private Input<Integer> lastBilledAmmount = Input.absent();
        private Input<Integer> lastPaidAmount = Input.absent();
        private Input<String> lastPaymentDate = Input.absent();
        private Input<String> lastBillStatus = Input.absent();
        private Input<String> lastPaymentFollowupNote = Input.absent();
        private Input<String> lastPaymentFollowupDoneOn = Input.absent();
        private Input<Integer> lastPaidUserCount = Input.absent();
        private Input<Integer> lastBilledUserCount = Input.absent();
        private Input<String> billingPeriod = Input.absent();
        private Input<String> billCycleStartDate = Input.absent();
        private Input<String> billCycleEndDate = Input.absent();
        private Input<String> billingDate = Input.absent();
        private Input<String> paymentDueDate = Input.absent();
        private Input<String> nextBillingCycleStartDate = Input.absent();
        private Input<String> nextBillingCycleEndDate = Input.absent();
        private Input<String> nextBillingDate = Input.absent();
        private Input<String> nextPaymentDueDate = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountCreationDate(String str) {
            this.accountCreationDate = Input.fromNullable(str);
            return this;
        }

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder accountSalesOwnerId(String str) {
            this.accountSalesOwnerId = Input.fromNullable(str);
            return this;
        }

        public Builder accountSupportOwnerId(String str) {
            this.accountSupportOwnerId = Input.fromNullable(str);
            return this;
        }

        public Builder alternateBillingContactId(String str) {
            this.alternateBillingContactId = Input.fromNullable(str);
            return this;
        }

        public Builder billCycleEndDate(String str) {
            this.billCycleEndDate = Input.fromNullable(str);
            return this;
        }

        public Builder billCycleStartDate(String str) {
            this.billCycleStartDate = Input.fromNullable(str);
            return this;
        }

        public Builder billingContactId(String str) {
            this.billingContactId = Input.fromNullable(str);
            return this;
        }

        public Builder billingDate(String str) {
            this.billingDate = Input.fromNullable(str);
            return this;
        }

        public Builder billingPeriod(String str) {
            this.billingPeriod = Input.fromNullable(str);
            return this;
        }

        public CreateClientAccountInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.clientAccountId, "clientAccountId == null");
            return new CreateClientAccountInput(this.accountId, this.clientAccountId, this.clientAccountType, this.clientAccountStatus, this.clientAccountTrialEndDate, this.clientAccountTrialExtensionTimes, this.billingContactId, this.alternateBillingContactId, this.lastPendingProductAccountBillId, this.lastPaidProductAccountBillId, this.accountSalesOwnerId, this.accountSupportOwnerId, this.currentUserCount, this.freeUserCount, this.currency, this.subscriptionCreationDate, this.accountCreationDate, this.lastBilledCycleStartDate, this.lastBilledCycleEndDate, this.lastBilledDate, this.lastBilledAmmount, this.lastPaidAmount, this.lastPaymentDate, this.lastBillStatus, this.lastPaymentFollowupNote, this.lastPaymentFollowupDoneOn, this.lastPaidUserCount, this.lastBilledUserCount, this.billingPeriod, this.billCycleStartDate, this.billCycleEndDate, this.billingDate, this.paymentDueDate, this.nextBillingCycleStartDate, this.nextBillingCycleEndDate, this.nextBillingDate, this.nextPaymentDueDate, this.createdAt, this.updatedAt);
        }

        public Builder clientAccountId(String str) {
            this.clientAccountId = str;
            return this;
        }

        public Builder clientAccountStatus(String str) {
            this.clientAccountStatus = Input.fromNullable(str);
            return this;
        }

        public Builder clientAccountTrialEndDate(String str) {
            this.clientAccountTrialEndDate = Input.fromNullable(str);
            return this;
        }

        public Builder clientAccountTrialExtensionTimes(Integer num) {
            this.clientAccountTrialExtensionTimes = Input.fromNullable(num);
            return this;
        }

        public Builder clientAccountType(String str) {
            this.clientAccountType = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder currentUserCount(Integer num) {
            this.currentUserCount = Input.fromNullable(num);
            return this;
        }

        public Builder freeUserCount(Integer num) {
            this.freeUserCount = Input.fromNullable(num);
            return this;
        }

        public Builder lastBillStatus(String str) {
            this.lastBillStatus = Input.fromNullable(str);
            return this;
        }

        public Builder lastBilledAmmount(Integer num) {
            this.lastBilledAmmount = Input.fromNullable(num);
            return this;
        }

        public Builder lastBilledCycleEndDate(String str) {
            this.lastBilledCycleEndDate = Input.fromNullable(str);
            return this;
        }

        public Builder lastBilledCycleStartDate(String str) {
            this.lastBilledCycleStartDate = Input.fromNullable(str);
            return this;
        }

        public Builder lastBilledDate(String str) {
            this.lastBilledDate = Input.fromNullable(str);
            return this;
        }

        public Builder lastBilledUserCount(Integer num) {
            this.lastBilledUserCount = Input.fromNullable(num);
            return this;
        }

        public Builder lastPaidAmount(Integer num) {
            this.lastPaidAmount = Input.fromNullable(num);
            return this;
        }

        public Builder lastPaidProductAccountBillId(String str) {
            this.lastPaidProductAccountBillId = Input.fromNullable(str);
            return this;
        }

        public Builder lastPaidUserCount(Integer num) {
            this.lastPaidUserCount = Input.fromNullable(num);
            return this;
        }

        public Builder lastPaymentDate(String str) {
            this.lastPaymentDate = Input.fromNullable(str);
            return this;
        }

        public Builder lastPaymentFollowupDoneOn(String str) {
            this.lastPaymentFollowupDoneOn = Input.fromNullable(str);
            return this;
        }

        public Builder lastPaymentFollowupNote(String str) {
            this.lastPaymentFollowupNote = Input.fromNullable(str);
            return this;
        }

        public Builder lastPendingProductAccountBillId(String str) {
            this.lastPendingProductAccountBillId = Input.fromNullable(str);
            return this;
        }

        public Builder nextBillingCycleEndDate(String str) {
            this.nextBillingCycleEndDate = Input.fromNullable(str);
            return this;
        }

        public Builder nextBillingCycleStartDate(String str) {
            this.nextBillingCycleStartDate = Input.fromNullable(str);
            return this;
        }

        public Builder nextBillingDate(String str) {
            this.nextBillingDate = Input.fromNullable(str);
            return this;
        }

        public Builder nextPaymentDueDate(String str) {
            this.nextPaymentDueDate = Input.fromNullable(str);
            return this;
        }

        public Builder paymentDueDate(String str) {
            this.paymentDueDate = Input.fromNullable(str);
            return this;
        }

        public Builder subscriptionCreationDate(String str) {
            this.subscriptionCreationDate = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateClientAccountInput(String str, String str2, Input<String> input, Input<String> input2, Input<String> input3, Input<Integer> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<Integer> input11, Input<Integer> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<Integer> input19, Input<Integer> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<String> input24, Input<Integer> input25, Input<Integer> input26, Input<String> input27, Input<String> input28, Input<String> input29, Input<String> input30, Input<String> input31, Input<String> input32, Input<String> input33, Input<String> input34, Input<String> input35, Input<String> input36, Input<String> input37) {
        this.accountId = str;
        this.clientAccountId = str2;
        this.clientAccountType = input;
        this.clientAccountStatus = input2;
        this.clientAccountTrialEndDate = input3;
        this.clientAccountTrialExtensionTimes = input4;
        this.billingContactId = input5;
        this.alternateBillingContactId = input6;
        this.lastPendingProductAccountBillId = input7;
        this.lastPaidProductAccountBillId = input8;
        this.accountSalesOwnerId = input9;
        this.accountSupportOwnerId = input10;
        this.currentUserCount = input11;
        this.freeUserCount = input12;
        this.currency = input13;
        this.subscriptionCreationDate = input14;
        this.accountCreationDate = input15;
        this.lastBilledCycleStartDate = input16;
        this.lastBilledCycleEndDate = input17;
        this.lastBilledDate = input18;
        this.lastBilledAmmount = input19;
        this.lastPaidAmount = input20;
        this.lastPaymentDate = input21;
        this.lastBillStatus = input22;
        this.lastPaymentFollowupNote = input23;
        this.lastPaymentFollowupDoneOn = input24;
        this.lastPaidUserCount = input25;
        this.lastBilledUserCount = input26;
        this.billingPeriod = input27;
        this.billCycleStartDate = input28;
        this.billCycleEndDate = input29;
        this.billingDate = input30;
        this.paymentDueDate = input31;
        this.nextBillingCycleStartDate = input32;
        this.nextBillingCycleEndDate = input33;
        this.nextBillingDate = input34;
        this.nextPaymentDueDate = input35;
        this.createdAt = input36;
        this.updatedAt = input37;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountCreationDate() {
        return this.accountCreationDate.value;
    }

    public String accountId() {
        return this.accountId;
    }

    public String accountSalesOwnerId() {
        return this.accountSalesOwnerId.value;
    }

    public String accountSupportOwnerId() {
        return this.accountSupportOwnerId.value;
    }

    public String alternateBillingContactId() {
        return this.alternateBillingContactId.value;
    }

    public String billCycleEndDate() {
        return this.billCycleEndDate.value;
    }

    public String billCycleStartDate() {
        return this.billCycleStartDate.value;
    }

    public String billingContactId() {
        return this.billingContactId.value;
    }

    public String billingDate() {
        return this.billingDate.value;
    }

    public String billingPeriod() {
        return this.billingPeriod.value;
    }

    public String clientAccountId() {
        return this.clientAccountId;
    }

    public String clientAccountStatus() {
        return this.clientAccountStatus.value;
    }

    public String clientAccountTrialEndDate() {
        return this.clientAccountTrialEndDate.value;
    }

    public Integer clientAccountTrialExtensionTimes() {
        return this.clientAccountTrialExtensionTimes.value;
    }

    public String clientAccountType() {
        return this.clientAccountType.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String currency() {
        return this.currency.value;
    }

    public Integer currentUserCount() {
        return this.currentUserCount.value;
    }

    public Integer freeUserCount() {
        return this.freeUserCount.value;
    }

    public String lastBillStatus() {
        return this.lastBillStatus.value;
    }

    public Integer lastBilledAmmount() {
        return this.lastBilledAmmount.value;
    }

    public String lastBilledCycleEndDate() {
        return this.lastBilledCycleEndDate.value;
    }

    public String lastBilledCycleStartDate() {
        return this.lastBilledCycleStartDate.value;
    }

    public String lastBilledDate() {
        return this.lastBilledDate.value;
    }

    public Integer lastBilledUserCount() {
        return this.lastBilledUserCount.value;
    }

    public Integer lastPaidAmount() {
        return this.lastPaidAmount.value;
    }

    public String lastPaidProductAccountBillId() {
        return this.lastPaidProductAccountBillId.value;
    }

    public Integer lastPaidUserCount() {
        return this.lastPaidUserCount.value;
    }

    public String lastPaymentDate() {
        return this.lastPaymentDate.value;
    }

    public String lastPaymentFollowupDoneOn() {
        return this.lastPaymentFollowupDoneOn.value;
    }

    public String lastPaymentFollowupNote() {
        return this.lastPaymentFollowupNote.value;
    }

    public String lastPendingProductAccountBillId() {
        return this.lastPendingProductAccountBillId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateClientAccountInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", CreateClientAccountInput.this.accountId);
                inputFieldWriter.writeString("clientAccountId", CreateClientAccountInput.this.clientAccountId);
                if (CreateClientAccountInput.this.clientAccountType.defined) {
                    inputFieldWriter.writeString("clientAccountType", (String) CreateClientAccountInput.this.clientAccountType.value);
                }
                if (CreateClientAccountInput.this.clientAccountStatus.defined) {
                    inputFieldWriter.writeString("clientAccountStatus", (String) CreateClientAccountInput.this.clientAccountStatus.value);
                }
                if (CreateClientAccountInput.this.clientAccountTrialEndDate.defined) {
                    inputFieldWriter.writeString("clientAccountTrialEndDate", (String) CreateClientAccountInput.this.clientAccountTrialEndDate.value);
                }
                if (CreateClientAccountInput.this.clientAccountTrialExtensionTimes.defined) {
                    inputFieldWriter.writeInt("clientAccountTrialExtensionTimes", (Integer) CreateClientAccountInput.this.clientAccountTrialExtensionTimes.value);
                }
                if (CreateClientAccountInput.this.billingContactId.defined) {
                    inputFieldWriter.writeString("billingContactId", (String) CreateClientAccountInput.this.billingContactId.value);
                }
                if (CreateClientAccountInput.this.alternateBillingContactId.defined) {
                    inputFieldWriter.writeString("alternateBillingContactId", (String) CreateClientAccountInput.this.alternateBillingContactId.value);
                }
                if (CreateClientAccountInput.this.lastPendingProductAccountBillId.defined) {
                    inputFieldWriter.writeString("lastPendingProductAccountBillId", (String) CreateClientAccountInput.this.lastPendingProductAccountBillId.value);
                }
                if (CreateClientAccountInput.this.lastPaidProductAccountBillId.defined) {
                    inputFieldWriter.writeString("lastPaidProductAccountBillId", (String) CreateClientAccountInput.this.lastPaidProductAccountBillId.value);
                }
                if (CreateClientAccountInput.this.accountSalesOwnerId.defined) {
                    inputFieldWriter.writeString("accountSalesOwnerId", (String) CreateClientAccountInput.this.accountSalesOwnerId.value);
                }
                if (CreateClientAccountInput.this.accountSupportOwnerId.defined) {
                    inputFieldWriter.writeString("accountSupportOwnerId", (String) CreateClientAccountInput.this.accountSupportOwnerId.value);
                }
                if (CreateClientAccountInput.this.currentUserCount.defined) {
                    inputFieldWriter.writeInt("currentUserCount", (Integer) CreateClientAccountInput.this.currentUserCount.value);
                }
                if (CreateClientAccountInput.this.freeUserCount.defined) {
                    inputFieldWriter.writeInt("freeUserCount", (Integer) CreateClientAccountInput.this.freeUserCount.value);
                }
                if (CreateClientAccountInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) CreateClientAccountInput.this.currency.value);
                }
                if (CreateClientAccountInput.this.subscriptionCreationDate.defined) {
                    inputFieldWriter.writeString("subscriptionCreationDate", (String) CreateClientAccountInput.this.subscriptionCreationDate.value);
                }
                if (CreateClientAccountInput.this.accountCreationDate.defined) {
                    inputFieldWriter.writeString("accountCreationDate", (String) CreateClientAccountInput.this.accountCreationDate.value);
                }
                if (CreateClientAccountInput.this.lastBilledCycleStartDate.defined) {
                    inputFieldWriter.writeString("lastBilledCycleStartDate", (String) CreateClientAccountInput.this.lastBilledCycleStartDate.value);
                }
                if (CreateClientAccountInput.this.lastBilledCycleEndDate.defined) {
                    inputFieldWriter.writeString("lastBilledCycleEndDate", (String) CreateClientAccountInput.this.lastBilledCycleEndDate.value);
                }
                if (CreateClientAccountInput.this.lastBilledDate.defined) {
                    inputFieldWriter.writeString("lastBilledDate", (String) CreateClientAccountInput.this.lastBilledDate.value);
                }
                if (CreateClientAccountInput.this.lastBilledAmmount.defined) {
                    inputFieldWriter.writeInt("lastBilledAmmount", (Integer) CreateClientAccountInput.this.lastBilledAmmount.value);
                }
                if (CreateClientAccountInput.this.lastPaidAmount.defined) {
                    inputFieldWriter.writeInt("lastPaidAmount", (Integer) CreateClientAccountInput.this.lastPaidAmount.value);
                }
                if (CreateClientAccountInput.this.lastPaymentDate.defined) {
                    inputFieldWriter.writeString("lastPaymentDate", (String) CreateClientAccountInput.this.lastPaymentDate.value);
                }
                if (CreateClientAccountInput.this.lastBillStatus.defined) {
                    inputFieldWriter.writeString("lastBillStatus", (String) CreateClientAccountInput.this.lastBillStatus.value);
                }
                if (CreateClientAccountInput.this.lastPaymentFollowupNote.defined) {
                    inputFieldWriter.writeString("lastPaymentFollowupNote", (String) CreateClientAccountInput.this.lastPaymentFollowupNote.value);
                }
                if (CreateClientAccountInput.this.lastPaymentFollowupDoneOn.defined) {
                    inputFieldWriter.writeString("lastPaymentFollowupDoneOn", (String) CreateClientAccountInput.this.lastPaymentFollowupDoneOn.value);
                }
                if (CreateClientAccountInput.this.lastPaidUserCount.defined) {
                    inputFieldWriter.writeInt("lastPaidUserCount", (Integer) CreateClientAccountInput.this.lastPaidUserCount.value);
                }
                if (CreateClientAccountInput.this.lastBilledUserCount.defined) {
                    inputFieldWriter.writeInt("lastBilledUserCount", (Integer) CreateClientAccountInput.this.lastBilledUserCount.value);
                }
                if (CreateClientAccountInput.this.billingPeriod.defined) {
                    inputFieldWriter.writeString("billingPeriod", (String) CreateClientAccountInput.this.billingPeriod.value);
                }
                if (CreateClientAccountInput.this.billCycleStartDate.defined) {
                    inputFieldWriter.writeString("billCycleStartDate", (String) CreateClientAccountInput.this.billCycleStartDate.value);
                }
                if (CreateClientAccountInput.this.billCycleEndDate.defined) {
                    inputFieldWriter.writeString("billCycleEndDate", (String) CreateClientAccountInput.this.billCycleEndDate.value);
                }
                if (CreateClientAccountInput.this.billingDate.defined) {
                    inputFieldWriter.writeString("billingDate", (String) CreateClientAccountInput.this.billingDate.value);
                }
                if (CreateClientAccountInput.this.paymentDueDate.defined) {
                    inputFieldWriter.writeString("paymentDueDate", (String) CreateClientAccountInput.this.paymentDueDate.value);
                }
                if (CreateClientAccountInput.this.nextBillingCycleStartDate.defined) {
                    inputFieldWriter.writeString("nextBillingCycleStartDate", (String) CreateClientAccountInput.this.nextBillingCycleStartDate.value);
                }
                if (CreateClientAccountInput.this.nextBillingCycleEndDate.defined) {
                    inputFieldWriter.writeString("nextBillingCycleEndDate", (String) CreateClientAccountInput.this.nextBillingCycleEndDate.value);
                }
                if (CreateClientAccountInput.this.nextBillingDate.defined) {
                    inputFieldWriter.writeString("nextBillingDate", (String) CreateClientAccountInput.this.nextBillingDate.value);
                }
                if (CreateClientAccountInput.this.nextPaymentDueDate.defined) {
                    inputFieldWriter.writeString("nextPaymentDueDate", (String) CreateClientAccountInput.this.nextPaymentDueDate.value);
                }
                if (CreateClientAccountInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateClientAccountInput.this.createdAt.value);
                }
                if (CreateClientAccountInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateClientAccountInput.this.updatedAt.value);
                }
            }
        };
    }

    public String nextBillingCycleEndDate() {
        return this.nextBillingCycleEndDate.value;
    }

    public String nextBillingCycleStartDate() {
        return this.nextBillingCycleStartDate.value;
    }

    public String nextBillingDate() {
        return this.nextBillingDate.value;
    }

    public String nextPaymentDueDate() {
        return this.nextPaymentDueDate.value;
    }

    public String paymentDueDate() {
        return this.paymentDueDate.value;
    }

    public String subscriptionCreationDate() {
        return this.subscriptionCreationDate.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
