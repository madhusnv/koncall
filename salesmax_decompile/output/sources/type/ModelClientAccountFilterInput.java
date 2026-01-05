package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelClientAccountFilterInput implements InputType {
    private final Input<ModelStringInput> accountCreationDate;
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> accountSalesOwnerId;
    private final Input<ModelIDInput> accountSupportOwnerId;
    private final Input<ModelIDInput> alternateBillingContactId;
    private final Input<List<ModelClientAccountFilterInput>> and;
    private final Input<ModelStringInput> billCycleEndDate;
    private final Input<ModelStringInput> billCycleStartDate;
    private final Input<ModelIDInput> billingContactId;
    private final Input<ModelStringInput> billingDate;
    private final Input<ModelStringInput> billingPeriod;
    private final Input<ModelIDInput> clientAccountId;
    private final Input<ModelStringInput> clientAccountStatus;
    private final Input<ModelStringInput> clientAccountTrialEndDate;
    private final Input<ModelIntInput> clientAccountTrialExtensionTimes;
    private final Input<ModelStringInput> clientAccountType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> currency;
    private final Input<ModelIntInput> currentUserCount;
    private final Input<ModelIntInput> freeUserCount;
    private final Input<ModelStringInput> lastBillStatus;
    private final Input<ModelIntInput> lastBilledAmmount;
    private final Input<ModelStringInput> lastBilledCycleEndDate;
    private final Input<ModelStringInput> lastBilledCycleStartDate;
    private final Input<ModelStringInput> lastBilledDate;
    private final Input<ModelIntInput> lastBilledUserCount;
    private final Input<ModelIntInput> lastPaidAmount;
    private final Input<ModelIDInput> lastPaidProductAccountBillId;
    private final Input<ModelIntInput> lastPaidUserCount;
    private final Input<ModelStringInput> lastPaymentDate;
    private final Input<ModelStringInput> lastPaymentFollowupDoneOn;
    private final Input<ModelStringInput> lastPaymentFollowupNote;
    private final Input<ModelIDInput> lastPendingProductAccountBillId;
    private final Input<ModelStringInput> nextBillingCycleEndDate;
    private final Input<ModelStringInput> nextBillingCycleStartDate;
    private final Input<ModelStringInput> nextBillingDate;
    private final Input<ModelStringInput> nextPaymentDueDate;
    private final Input<ModelClientAccountFilterInput> not;
    private final Input<List<ModelClientAccountFilterInput>> or;
    private final Input<ModelStringInput> paymentDueDate;
    private final Input<ModelStringInput> subscriptionCreationDate;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> clientAccountId = Input.absent();
        private Input<ModelStringInput> clientAccountType = Input.absent();
        private Input<ModelStringInput> clientAccountStatus = Input.absent();
        private Input<ModelStringInput> clientAccountTrialEndDate = Input.absent();
        private Input<ModelIntInput> clientAccountTrialExtensionTimes = Input.absent();
        private Input<ModelIDInput> billingContactId = Input.absent();
        private Input<ModelIDInput> alternateBillingContactId = Input.absent();
        private Input<ModelIDInput> lastPendingProductAccountBillId = Input.absent();
        private Input<ModelIDInput> lastPaidProductAccountBillId = Input.absent();
        private Input<ModelIDInput> accountSalesOwnerId = Input.absent();
        private Input<ModelIDInput> accountSupportOwnerId = Input.absent();
        private Input<ModelIntInput> currentUserCount = Input.absent();
        private Input<ModelIntInput> freeUserCount = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelStringInput> subscriptionCreationDate = Input.absent();
        private Input<ModelStringInput> accountCreationDate = Input.absent();
        private Input<ModelStringInput> lastBilledCycleStartDate = Input.absent();
        private Input<ModelStringInput> lastBilledCycleEndDate = Input.absent();
        private Input<ModelStringInput> lastBilledDate = Input.absent();
        private Input<ModelIntInput> lastBilledAmmount = Input.absent();
        private Input<ModelIntInput> lastPaidAmount = Input.absent();
        private Input<ModelStringInput> lastPaymentDate = Input.absent();
        private Input<ModelStringInput> lastBillStatus = Input.absent();
        private Input<ModelStringInput> lastPaymentFollowupNote = Input.absent();
        private Input<ModelStringInput> lastPaymentFollowupDoneOn = Input.absent();
        private Input<ModelIntInput> lastPaidUserCount = Input.absent();
        private Input<ModelIntInput> lastBilledUserCount = Input.absent();
        private Input<ModelStringInput> billingPeriod = Input.absent();
        private Input<ModelStringInput> billCycleStartDate = Input.absent();
        private Input<ModelStringInput> billCycleEndDate = Input.absent();
        private Input<ModelStringInput> billingDate = Input.absent();
        private Input<ModelStringInput> paymentDueDate = Input.absent();
        private Input<ModelStringInput> nextBillingCycleStartDate = Input.absent();
        private Input<ModelStringInput> nextBillingCycleEndDate = Input.absent();
        private Input<ModelStringInput> nextBillingDate = Input.absent();
        private Input<ModelStringInput> nextPaymentDueDate = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelClientAccountFilterInput>> and = Input.absent();
        private Input<List<ModelClientAccountFilterInput>> or = Input.absent();
        private Input<ModelClientAccountFilterInput> not = Input.absent();

        public Builder accountCreationDate(ModelStringInput modelStringInput) {
            this.accountCreationDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder accountSalesOwnerId(ModelIDInput modelIDInput) {
            this.accountSalesOwnerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder accountSupportOwnerId(ModelIDInput modelIDInput) {
            this.accountSupportOwnerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder alternateBillingContactId(ModelIDInput modelIDInput) {
            this.alternateBillingContactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelClientAccountFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder billCycleEndDate(ModelStringInput modelStringInput) {
            this.billCycleEndDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder billCycleStartDate(ModelStringInput modelStringInput) {
            this.billCycleStartDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder billingContactId(ModelIDInput modelIDInput) {
            this.billingContactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder billingDate(ModelStringInput modelStringInput) {
            this.billingDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder billingPeriod(ModelStringInput modelStringInput) {
            this.billingPeriod = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelClientAccountFilterInput build() {
            return new ModelClientAccountFilterInput(this.accountId, this.clientAccountId, this.clientAccountType, this.clientAccountStatus, this.clientAccountTrialEndDate, this.clientAccountTrialExtensionTimes, this.billingContactId, this.alternateBillingContactId, this.lastPendingProductAccountBillId, this.lastPaidProductAccountBillId, this.accountSalesOwnerId, this.accountSupportOwnerId, this.currentUserCount, this.freeUserCount, this.currency, this.subscriptionCreationDate, this.accountCreationDate, this.lastBilledCycleStartDate, this.lastBilledCycleEndDate, this.lastBilledDate, this.lastBilledAmmount, this.lastPaidAmount, this.lastPaymentDate, this.lastBillStatus, this.lastPaymentFollowupNote, this.lastPaymentFollowupDoneOn, this.lastPaidUserCount, this.lastBilledUserCount, this.billingPeriod, this.billCycleStartDate, this.billCycleEndDate, this.billingDate, this.paymentDueDate, this.nextBillingCycleStartDate, this.nextBillingCycleEndDate, this.nextBillingDate, this.nextPaymentDueDate, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder clientAccountId(ModelIDInput modelIDInput) {
            this.clientAccountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder clientAccountStatus(ModelStringInput modelStringInput) {
            this.clientAccountStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder clientAccountTrialEndDate(ModelStringInput modelStringInput) {
            this.clientAccountTrialEndDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder clientAccountTrialExtensionTimes(ModelIntInput modelIntInput) {
            this.clientAccountTrialExtensionTimes = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder clientAccountType(ModelStringInput modelStringInput) {
            this.clientAccountType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder currency(ModelStringInput modelStringInput) {
            this.currency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder currentUserCount(ModelIntInput modelIntInput) {
            this.currentUserCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder freeUserCount(ModelIntInput modelIntInput) {
            this.freeUserCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder lastBillStatus(ModelStringInput modelStringInput) {
            this.lastBillStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastBilledAmmount(ModelIntInput modelIntInput) {
            this.lastBilledAmmount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder lastBilledCycleEndDate(ModelStringInput modelStringInput) {
            this.lastBilledCycleEndDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastBilledCycleStartDate(ModelStringInput modelStringInput) {
            this.lastBilledCycleStartDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastBilledDate(ModelStringInput modelStringInput) {
            this.lastBilledDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastBilledUserCount(ModelIntInput modelIntInput) {
            this.lastBilledUserCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder lastPaidAmount(ModelIntInput modelIntInput) {
            this.lastPaidAmount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder lastPaidProductAccountBillId(ModelIDInput modelIDInput) {
            this.lastPaidProductAccountBillId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastPaidUserCount(ModelIntInput modelIntInput) {
            this.lastPaidUserCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder lastPaymentDate(ModelStringInput modelStringInput) {
            this.lastPaymentDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastPaymentFollowupDoneOn(ModelStringInput modelStringInput) {
            this.lastPaymentFollowupDoneOn = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastPaymentFollowupNote(ModelStringInput modelStringInput) {
            this.lastPaymentFollowupNote = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastPendingProductAccountBillId(ModelIDInput modelIDInput) {
            this.lastPendingProductAccountBillId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder nextBillingCycleEndDate(ModelStringInput modelStringInput) {
            this.nextBillingCycleEndDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder nextBillingCycleStartDate(ModelStringInput modelStringInput) {
            this.nextBillingCycleStartDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder nextBillingDate(ModelStringInput modelStringInput) {
            this.nextBillingDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder nextPaymentDueDate(ModelStringInput modelStringInput) {
            this.nextPaymentDueDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelClientAccountFilterInput modelClientAccountFilterInput) {
            this.not = Input.fromNullable(modelClientAccountFilterInput);
            return this;
        }

        public Builder or(List<ModelClientAccountFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder paymentDueDate(ModelStringInput modelStringInput) {
            this.paymentDueDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder subscriptionCreationDate(ModelStringInput modelStringInput) {
            this.subscriptionCreationDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelClientAccountFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIntInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelIDInput> input12, Input<ModelIntInput> input13, Input<ModelIntInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelIntInput> input21, Input<ModelIntInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelIntInput> input27, Input<ModelIntInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelStringInput> input37, Input<ModelStringInput> input38, Input<ModelStringInput> input39, Input<List<ModelClientAccountFilterInput>> input40, Input<List<ModelClientAccountFilterInput>> input41, Input<ModelClientAccountFilterInput> input42) {
        this.accountId = input;
        this.clientAccountId = input2;
        this.clientAccountType = input3;
        this.clientAccountStatus = input4;
        this.clientAccountTrialEndDate = input5;
        this.clientAccountTrialExtensionTimes = input6;
        this.billingContactId = input7;
        this.alternateBillingContactId = input8;
        this.lastPendingProductAccountBillId = input9;
        this.lastPaidProductAccountBillId = input10;
        this.accountSalesOwnerId = input11;
        this.accountSupportOwnerId = input12;
        this.currentUserCount = input13;
        this.freeUserCount = input14;
        this.currency = input15;
        this.subscriptionCreationDate = input16;
        this.accountCreationDate = input17;
        this.lastBilledCycleStartDate = input18;
        this.lastBilledCycleEndDate = input19;
        this.lastBilledDate = input20;
        this.lastBilledAmmount = input21;
        this.lastPaidAmount = input22;
        this.lastPaymentDate = input23;
        this.lastBillStatus = input24;
        this.lastPaymentFollowupNote = input25;
        this.lastPaymentFollowupDoneOn = input26;
        this.lastPaidUserCount = input27;
        this.lastBilledUserCount = input28;
        this.billingPeriod = input29;
        this.billCycleStartDate = input30;
        this.billCycleEndDate = input31;
        this.billingDate = input32;
        this.paymentDueDate = input33;
        this.nextBillingCycleStartDate = input34;
        this.nextBillingCycleEndDate = input35;
        this.nextBillingDate = input36;
        this.nextPaymentDueDate = input37;
        this.createdAt = input38;
        this.updatedAt = input39;
        this.and = input40;
        this.or = input41;
        this.not = input42;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelStringInput accountCreationDate() {
        return this.accountCreationDate.value;
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelIDInput accountSalesOwnerId() {
        return this.accountSalesOwnerId.value;
    }

    public ModelIDInput accountSupportOwnerId() {
        return this.accountSupportOwnerId.value;
    }

    public ModelIDInput alternateBillingContactId() {
        return this.alternateBillingContactId.value;
    }

    public List<ModelClientAccountFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput billCycleEndDate() {
        return this.billCycleEndDate.value;
    }

    public ModelStringInput billCycleStartDate() {
        return this.billCycleStartDate.value;
    }

    public ModelIDInput billingContactId() {
        return this.billingContactId.value;
    }

    public ModelStringInput billingDate() {
        return this.billingDate.value;
    }

    public ModelStringInput billingPeriod() {
        return this.billingPeriod.value;
    }

    public ModelIDInput clientAccountId() {
        return this.clientAccountId.value;
    }

    public ModelStringInput clientAccountStatus() {
        return this.clientAccountStatus.value;
    }

    public ModelStringInput clientAccountTrialEndDate() {
        return this.clientAccountTrialEndDate.value;
    }

    public ModelIntInput clientAccountTrialExtensionTimes() {
        return this.clientAccountTrialExtensionTimes.value;
    }

    public ModelStringInput clientAccountType() {
        return this.clientAccountType.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput currency() {
        return this.currency.value;
    }

    public ModelIntInput currentUserCount() {
        return this.currentUserCount.value;
    }

    public ModelIntInput freeUserCount() {
        return this.freeUserCount.value;
    }

    public ModelStringInput lastBillStatus() {
        return this.lastBillStatus.value;
    }

    public ModelIntInput lastBilledAmmount() {
        return this.lastBilledAmmount.value;
    }

    public ModelStringInput lastBilledCycleEndDate() {
        return this.lastBilledCycleEndDate.value;
    }

    public ModelStringInput lastBilledCycleStartDate() {
        return this.lastBilledCycleStartDate.value;
    }

    public ModelStringInput lastBilledDate() {
        return this.lastBilledDate.value;
    }

    public ModelIntInput lastBilledUserCount() {
        return this.lastBilledUserCount.value;
    }

    public ModelIntInput lastPaidAmount() {
        return this.lastPaidAmount.value;
    }

    public ModelIDInput lastPaidProductAccountBillId() {
        return this.lastPaidProductAccountBillId.value;
    }

    public ModelIntInput lastPaidUserCount() {
        return this.lastPaidUserCount.value;
    }

    public ModelStringInput lastPaymentDate() {
        return this.lastPaymentDate.value;
    }

    public ModelStringInput lastPaymentFollowupDoneOn() {
        return this.lastPaymentFollowupDoneOn.value;
    }

    public ModelStringInput lastPaymentFollowupNote() {
        return this.lastPaymentFollowupNote.value;
    }

    public ModelIDInput lastPendingProductAccountBillId() {
        return this.lastPendingProductAccountBillId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelClientAccountFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelClientAccountFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelClientAccountFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelClientAccountFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.clientAccountId.defined) {
                    inputFieldWriter.writeObject("clientAccountId", ModelClientAccountFilterInput.this.clientAccountId.value != 0 ? ((ModelIDInput) ModelClientAccountFilterInput.this.clientAccountId.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.clientAccountType.defined) {
                    inputFieldWriter.writeObject("clientAccountType", ModelClientAccountFilterInput.this.clientAccountType.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.clientAccountType.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.clientAccountStatus.defined) {
                    inputFieldWriter.writeObject("clientAccountStatus", ModelClientAccountFilterInput.this.clientAccountStatus.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.clientAccountStatus.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.clientAccountTrialEndDate.defined) {
                    inputFieldWriter.writeObject("clientAccountTrialEndDate", ModelClientAccountFilterInput.this.clientAccountTrialEndDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.clientAccountTrialEndDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.clientAccountTrialExtensionTimes.defined) {
                    inputFieldWriter.writeObject("clientAccountTrialExtensionTimes", ModelClientAccountFilterInput.this.clientAccountTrialExtensionTimes.value != 0 ? ((ModelIntInput) ModelClientAccountFilterInput.this.clientAccountTrialExtensionTimes.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.billingContactId.defined) {
                    inputFieldWriter.writeObject("billingContactId", ModelClientAccountFilterInput.this.billingContactId.value != 0 ? ((ModelIDInput) ModelClientAccountFilterInput.this.billingContactId.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.alternateBillingContactId.defined) {
                    inputFieldWriter.writeObject("alternateBillingContactId", ModelClientAccountFilterInput.this.alternateBillingContactId.value != 0 ? ((ModelIDInput) ModelClientAccountFilterInput.this.alternateBillingContactId.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastPendingProductAccountBillId.defined) {
                    inputFieldWriter.writeObject("lastPendingProductAccountBillId", ModelClientAccountFilterInput.this.lastPendingProductAccountBillId.value != 0 ? ((ModelIDInput) ModelClientAccountFilterInput.this.lastPendingProductAccountBillId.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastPaidProductAccountBillId.defined) {
                    inputFieldWriter.writeObject("lastPaidProductAccountBillId", ModelClientAccountFilterInput.this.lastPaidProductAccountBillId.value != 0 ? ((ModelIDInput) ModelClientAccountFilterInput.this.lastPaidProductAccountBillId.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.accountSalesOwnerId.defined) {
                    inputFieldWriter.writeObject("accountSalesOwnerId", ModelClientAccountFilterInput.this.accountSalesOwnerId.value != 0 ? ((ModelIDInput) ModelClientAccountFilterInput.this.accountSalesOwnerId.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.accountSupportOwnerId.defined) {
                    inputFieldWriter.writeObject("accountSupportOwnerId", ModelClientAccountFilterInput.this.accountSupportOwnerId.value != 0 ? ((ModelIDInput) ModelClientAccountFilterInput.this.accountSupportOwnerId.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.currentUserCount.defined) {
                    inputFieldWriter.writeObject("currentUserCount", ModelClientAccountFilterInput.this.currentUserCount.value != 0 ? ((ModelIntInput) ModelClientAccountFilterInput.this.currentUserCount.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.freeUserCount.defined) {
                    inputFieldWriter.writeObject("freeUserCount", ModelClientAccountFilterInput.this.freeUserCount.value != 0 ? ((ModelIntInput) ModelClientAccountFilterInput.this.freeUserCount.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelClientAccountFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.subscriptionCreationDate.defined) {
                    inputFieldWriter.writeObject("subscriptionCreationDate", ModelClientAccountFilterInput.this.subscriptionCreationDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.subscriptionCreationDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.accountCreationDate.defined) {
                    inputFieldWriter.writeObject("accountCreationDate", ModelClientAccountFilterInput.this.accountCreationDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.accountCreationDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastBilledCycleStartDate.defined) {
                    inputFieldWriter.writeObject("lastBilledCycleStartDate", ModelClientAccountFilterInput.this.lastBilledCycleStartDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.lastBilledCycleStartDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastBilledCycleEndDate.defined) {
                    inputFieldWriter.writeObject("lastBilledCycleEndDate", ModelClientAccountFilterInput.this.lastBilledCycleEndDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.lastBilledCycleEndDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastBilledDate.defined) {
                    inputFieldWriter.writeObject("lastBilledDate", ModelClientAccountFilterInput.this.lastBilledDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.lastBilledDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastBilledAmmount.defined) {
                    inputFieldWriter.writeObject("lastBilledAmmount", ModelClientAccountFilterInput.this.lastBilledAmmount.value != 0 ? ((ModelIntInput) ModelClientAccountFilterInput.this.lastBilledAmmount.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastPaidAmount.defined) {
                    inputFieldWriter.writeObject("lastPaidAmount", ModelClientAccountFilterInput.this.lastPaidAmount.value != 0 ? ((ModelIntInput) ModelClientAccountFilterInput.this.lastPaidAmount.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastPaymentDate.defined) {
                    inputFieldWriter.writeObject("lastPaymentDate", ModelClientAccountFilterInput.this.lastPaymentDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.lastPaymentDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastBillStatus.defined) {
                    inputFieldWriter.writeObject("lastBillStatus", ModelClientAccountFilterInput.this.lastBillStatus.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.lastBillStatus.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastPaymentFollowupNote.defined) {
                    inputFieldWriter.writeObject("lastPaymentFollowupNote", ModelClientAccountFilterInput.this.lastPaymentFollowupNote.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.lastPaymentFollowupNote.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastPaymentFollowupDoneOn.defined) {
                    inputFieldWriter.writeObject("lastPaymentFollowupDoneOn", ModelClientAccountFilterInput.this.lastPaymentFollowupDoneOn.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.lastPaymentFollowupDoneOn.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastPaidUserCount.defined) {
                    inputFieldWriter.writeObject("lastPaidUserCount", ModelClientAccountFilterInput.this.lastPaidUserCount.value != 0 ? ((ModelIntInput) ModelClientAccountFilterInput.this.lastPaidUserCount.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.lastBilledUserCount.defined) {
                    inputFieldWriter.writeObject("lastBilledUserCount", ModelClientAccountFilterInput.this.lastBilledUserCount.value != 0 ? ((ModelIntInput) ModelClientAccountFilterInput.this.lastBilledUserCount.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.billingPeriod.defined) {
                    inputFieldWriter.writeObject("billingPeriod", ModelClientAccountFilterInput.this.billingPeriod.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.billingPeriod.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.billCycleStartDate.defined) {
                    inputFieldWriter.writeObject("billCycleStartDate", ModelClientAccountFilterInput.this.billCycleStartDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.billCycleStartDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.billCycleEndDate.defined) {
                    inputFieldWriter.writeObject("billCycleEndDate", ModelClientAccountFilterInput.this.billCycleEndDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.billCycleEndDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.billingDate.defined) {
                    inputFieldWriter.writeObject("billingDate", ModelClientAccountFilterInput.this.billingDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.billingDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.paymentDueDate.defined) {
                    inputFieldWriter.writeObject("paymentDueDate", ModelClientAccountFilterInput.this.paymentDueDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.paymentDueDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.nextBillingCycleStartDate.defined) {
                    inputFieldWriter.writeObject("nextBillingCycleStartDate", ModelClientAccountFilterInput.this.nextBillingCycleStartDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.nextBillingCycleStartDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.nextBillingCycleEndDate.defined) {
                    inputFieldWriter.writeObject("nextBillingCycleEndDate", ModelClientAccountFilterInput.this.nextBillingCycleEndDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.nextBillingCycleEndDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.nextBillingDate.defined) {
                    inputFieldWriter.writeObject("nextBillingDate", ModelClientAccountFilterInput.this.nextBillingDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.nextBillingDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.nextPaymentDueDate.defined) {
                    inputFieldWriter.writeObject("nextPaymentDueDate", ModelClientAccountFilterInput.this.nextPaymentDueDate.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.nextPaymentDueDate.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelClientAccountFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelClientAccountFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelClientAccountFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelClientAccountFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelClientAccountFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelClientAccountFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelClientAccountFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelClientAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelClientAccountFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelClientAccountFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelClientAccountFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelClientAccountFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelClientAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelClientAccountFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelClientAccountFilterInput.this.not.value != 0 ? ((ModelClientAccountFilterInput) ModelClientAccountFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput nextBillingCycleEndDate() {
        return this.nextBillingCycleEndDate.value;
    }

    public ModelStringInput nextBillingCycleStartDate() {
        return this.nextBillingCycleStartDate.value;
    }

    public ModelStringInput nextBillingDate() {
        return this.nextBillingDate.value;
    }

    public ModelStringInput nextPaymentDueDate() {
        return this.nextPaymentDueDate.value;
    }

    public ModelClientAccountFilterInput not() {
        return this.not.value;
    }

    public List<ModelClientAccountFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput paymentDueDate() {
        return this.paymentDueDate.value;
    }

    public ModelStringInput subscriptionCreationDate() {
        return this.subscriptionCreationDate.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
