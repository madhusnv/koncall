package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelClientAccountConditionInput implements InputType {
    private final Input<ModelStringInput> accountCreationDate;
    private final Input<ModelIDInput> accountSalesOwnerId;
    private final Input<ModelIDInput> accountSupportOwnerId;
    private final Input<ModelIDInput> alternateBillingContactId;
    private final Input<List<ModelClientAccountConditionInput>> and;
    private final Input<ModelStringInput> billCycleEndDate;
    private final Input<ModelStringInput> billCycleStartDate;
    private final Input<ModelIDInput> billingContactId;
    private final Input<ModelStringInput> billingDate;
    private final Input<ModelStringInput> billingPeriod;
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
    private final Input<ModelClientAccountConditionInput> not;
    private final Input<List<ModelClientAccountConditionInput>> or;
    private final Input<ModelStringInput> paymentDueDate;
    private final Input<ModelStringInput> subscriptionCreationDate;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
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
        private Input<List<ModelClientAccountConditionInput>> and = Input.absent();
        private Input<List<ModelClientAccountConditionInput>> or = Input.absent();
        private Input<ModelClientAccountConditionInput> not = Input.absent();

        public Builder accountCreationDate(ModelStringInput modelStringInput) {
            this.accountCreationDate = Input.fromNullable(modelStringInput);
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

        public Builder and(List<ModelClientAccountConditionInput> list) {
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

        public ModelClientAccountConditionInput build() {
            return new ModelClientAccountConditionInput(this.clientAccountType, this.clientAccountStatus, this.clientAccountTrialEndDate, this.clientAccountTrialExtensionTimes, this.billingContactId, this.alternateBillingContactId, this.lastPendingProductAccountBillId, this.lastPaidProductAccountBillId, this.accountSalesOwnerId, this.accountSupportOwnerId, this.currentUserCount, this.freeUserCount, this.currency, this.subscriptionCreationDate, this.accountCreationDate, this.lastBilledCycleStartDate, this.lastBilledCycleEndDate, this.lastBilledDate, this.lastBilledAmmount, this.lastPaidAmount, this.lastPaymentDate, this.lastBillStatus, this.lastPaymentFollowupNote, this.lastPaymentFollowupDoneOn, this.lastPaidUserCount, this.lastBilledUserCount, this.billingPeriod, this.billCycleStartDate, this.billCycleEndDate, this.billingDate, this.paymentDueDate, this.nextBillingCycleStartDate, this.nextBillingCycleEndDate, this.nextBillingDate, this.nextPaymentDueDate, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelClientAccountConditionInput modelClientAccountConditionInput) {
            this.not = Input.fromNullable(modelClientAccountConditionInput);
            return this;
        }

        public Builder or(List<ModelClientAccountConditionInput> list) {
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

    public ModelClientAccountConditionInput(Input<ModelStringInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelIntInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIntInput> input11, Input<ModelIntInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelIntInput> input19, Input<ModelIntInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelIntInput> input25, Input<ModelIntInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelStringInput> input37, Input<List<ModelClientAccountConditionInput>> input38, Input<List<ModelClientAccountConditionInput>> input39, Input<ModelClientAccountConditionInput> input40) {
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
        this.and = input38;
        this.or = input39;
        this.not = input40;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelStringInput accountCreationDate() {
        return this.accountCreationDate.value;
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

    public List<ModelClientAccountConditionInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelClientAccountConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelClientAccountConditionInput.this.clientAccountType.defined) {
                    inputFieldWriter.writeObject("clientAccountType", ModelClientAccountConditionInput.this.clientAccountType.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.clientAccountType.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.clientAccountStatus.defined) {
                    inputFieldWriter.writeObject("clientAccountStatus", ModelClientAccountConditionInput.this.clientAccountStatus.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.clientAccountStatus.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.clientAccountTrialEndDate.defined) {
                    inputFieldWriter.writeObject("clientAccountTrialEndDate", ModelClientAccountConditionInput.this.clientAccountTrialEndDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.clientAccountTrialEndDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.clientAccountTrialExtensionTimes.defined) {
                    inputFieldWriter.writeObject("clientAccountTrialExtensionTimes", ModelClientAccountConditionInput.this.clientAccountTrialExtensionTimes.value != 0 ? ((ModelIntInput) ModelClientAccountConditionInput.this.clientAccountTrialExtensionTimes.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.billingContactId.defined) {
                    inputFieldWriter.writeObject("billingContactId", ModelClientAccountConditionInput.this.billingContactId.value != 0 ? ((ModelIDInput) ModelClientAccountConditionInput.this.billingContactId.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.alternateBillingContactId.defined) {
                    inputFieldWriter.writeObject("alternateBillingContactId", ModelClientAccountConditionInput.this.alternateBillingContactId.value != 0 ? ((ModelIDInput) ModelClientAccountConditionInput.this.alternateBillingContactId.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastPendingProductAccountBillId.defined) {
                    inputFieldWriter.writeObject("lastPendingProductAccountBillId", ModelClientAccountConditionInput.this.lastPendingProductAccountBillId.value != 0 ? ((ModelIDInput) ModelClientAccountConditionInput.this.lastPendingProductAccountBillId.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastPaidProductAccountBillId.defined) {
                    inputFieldWriter.writeObject("lastPaidProductAccountBillId", ModelClientAccountConditionInput.this.lastPaidProductAccountBillId.value != 0 ? ((ModelIDInput) ModelClientAccountConditionInput.this.lastPaidProductAccountBillId.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.accountSalesOwnerId.defined) {
                    inputFieldWriter.writeObject("accountSalesOwnerId", ModelClientAccountConditionInput.this.accountSalesOwnerId.value != 0 ? ((ModelIDInput) ModelClientAccountConditionInput.this.accountSalesOwnerId.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.accountSupportOwnerId.defined) {
                    inputFieldWriter.writeObject("accountSupportOwnerId", ModelClientAccountConditionInput.this.accountSupportOwnerId.value != 0 ? ((ModelIDInput) ModelClientAccountConditionInput.this.accountSupportOwnerId.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.currentUserCount.defined) {
                    inputFieldWriter.writeObject("currentUserCount", ModelClientAccountConditionInput.this.currentUserCount.value != 0 ? ((ModelIntInput) ModelClientAccountConditionInput.this.currentUserCount.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.freeUserCount.defined) {
                    inputFieldWriter.writeObject("freeUserCount", ModelClientAccountConditionInput.this.freeUserCount.value != 0 ? ((ModelIntInput) ModelClientAccountConditionInput.this.freeUserCount.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelClientAccountConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.subscriptionCreationDate.defined) {
                    inputFieldWriter.writeObject("subscriptionCreationDate", ModelClientAccountConditionInput.this.subscriptionCreationDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.subscriptionCreationDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.accountCreationDate.defined) {
                    inputFieldWriter.writeObject("accountCreationDate", ModelClientAccountConditionInput.this.accountCreationDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.accountCreationDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastBilledCycleStartDate.defined) {
                    inputFieldWriter.writeObject("lastBilledCycleStartDate", ModelClientAccountConditionInput.this.lastBilledCycleStartDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.lastBilledCycleStartDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastBilledCycleEndDate.defined) {
                    inputFieldWriter.writeObject("lastBilledCycleEndDate", ModelClientAccountConditionInput.this.lastBilledCycleEndDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.lastBilledCycleEndDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastBilledDate.defined) {
                    inputFieldWriter.writeObject("lastBilledDate", ModelClientAccountConditionInput.this.lastBilledDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.lastBilledDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastBilledAmmount.defined) {
                    inputFieldWriter.writeObject("lastBilledAmmount", ModelClientAccountConditionInput.this.lastBilledAmmount.value != 0 ? ((ModelIntInput) ModelClientAccountConditionInput.this.lastBilledAmmount.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastPaidAmount.defined) {
                    inputFieldWriter.writeObject("lastPaidAmount", ModelClientAccountConditionInput.this.lastPaidAmount.value != 0 ? ((ModelIntInput) ModelClientAccountConditionInput.this.lastPaidAmount.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastPaymentDate.defined) {
                    inputFieldWriter.writeObject("lastPaymentDate", ModelClientAccountConditionInput.this.lastPaymentDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.lastPaymentDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastBillStatus.defined) {
                    inputFieldWriter.writeObject("lastBillStatus", ModelClientAccountConditionInput.this.lastBillStatus.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.lastBillStatus.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastPaymentFollowupNote.defined) {
                    inputFieldWriter.writeObject("lastPaymentFollowupNote", ModelClientAccountConditionInput.this.lastPaymentFollowupNote.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.lastPaymentFollowupNote.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastPaymentFollowupDoneOn.defined) {
                    inputFieldWriter.writeObject("lastPaymentFollowupDoneOn", ModelClientAccountConditionInput.this.lastPaymentFollowupDoneOn.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.lastPaymentFollowupDoneOn.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastPaidUserCount.defined) {
                    inputFieldWriter.writeObject("lastPaidUserCount", ModelClientAccountConditionInput.this.lastPaidUserCount.value != 0 ? ((ModelIntInput) ModelClientAccountConditionInput.this.lastPaidUserCount.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.lastBilledUserCount.defined) {
                    inputFieldWriter.writeObject("lastBilledUserCount", ModelClientAccountConditionInput.this.lastBilledUserCount.value != 0 ? ((ModelIntInput) ModelClientAccountConditionInput.this.lastBilledUserCount.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.billingPeriod.defined) {
                    inputFieldWriter.writeObject("billingPeriod", ModelClientAccountConditionInput.this.billingPeriod.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.billingPeriod.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.billCycleStartDate.defined) {
                    inputFieldWriter.writeObject("billCycleStartDate", ModelClientAccountConditionInput.this.billCycleStartDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.billCycleStartDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.billCycleEndDate.defined) {
                    inputFieldWriter.writeObject("billCycleEndDate", ModelClientAccountConditionInput.this.billCycleEndDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.billCycleEndDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.billingDate.defined) {
                    inputFieldWriter.writeObject("billingDate", ModelClientAccountConditionInput.this.billingDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.billingDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.paymentDueDate.defined) {
                    inputFieldWriter.writeObject("paymentDueDate", ModelClientAccountConditionInput.this.paymentDueDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.paymentDueDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.nextBillingCycleStartDate.defined) {
                    inputFieldWriter.writeObject("nextBillingCycleStartDate", ModelClientAccountConditionInput.this.nextBillingCycleStartDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.nextBillingCycleStartDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.nextBillingCycleEndDate.defined) {
                    inputFieldWriter.writeObject("nextBillingCycleEndDate", ModelClientAccountConditionInput.this.nextBillingCycleEndDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.nextBillingCycleEndDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.nextBillingDate.defined) {
                    inputFieldWriter.writeObject("nextBillingDate", ModelClientAccountConditionInput.this.nextBillingDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.nextBillingDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.nextPaymentDueDate.defined) {
                    inputFieldWriter.writeObject("nextPaymentDueDate", ModelClientAccountConditionInput.this.nextPaymentDueDate.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.nextPaymentDueDate.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelClientAccountConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelClientAccountConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelClientAccountConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelClientAccountConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelClientAccountConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelClientAccountConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelClientAccountConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelClientAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelClientAccountConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelClientAccountConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelClientAccountConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelClientAccountConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelClientAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelClientAccountConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelClientAccountConditionInput.this.not.value != 0 ? ((ModelClientAccountConditionInput) ModelClientAccountConditionInput.this.not.value).marshaller() : null);
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

    public ModelClientAccountConditionInput not() {
        return this.not.value;
    }

    public List<ModelClientAccountConditionInput> or() {
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
