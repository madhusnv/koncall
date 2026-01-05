package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableClientAccountFilterInput implements InputType {
    private final Input<SearchableStringFilterInput> accountCreationDate;
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableIDFilterInput> accountSalesOwnerId;
    private final Input<SearchableIDFilterInput> accountSupportOwnerId;
    private final Input<SearchableIDFilterInput> alternateBillingContactId;
    private final Input<List<SearchableClientAccountFilterInput>> and;
    private final Input<SearchableStringFilterInput> billCycleEndDate;
    private final Input<SearchableStringFilterInput> billCycleStartDate;
    private final Input<SearchableIDFilterInput> billingContactId;
    private final Input<SearchableStringFilterInput> billingDate;
    private final Input<SearchableStringFilterInput> billingPeriod;
    private final Input<SearchableIDFilterInput> clientAccountId;
    private final Input<SearchableStringFilterInput> clientAccountStatus;
    private final Input<SearchableStringFilterInput> clientAccountTrialEndDate;
    private final Input<SearchableIntFilterInput> clientAccountTrialExtensionTimes;
    private final Input<SearchableStringFilterInput> clientAccountType;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> currency;
    private final Input<SearchableIntFilterInput> currentUserCount;
    private final Input<SearchableIntFilterInput> freeUserCount;
    private final Input<SearchableStringFilterInput> lastBillStatus;
    private final Input<SearchableIntFilterInput> lastBilledAmmount;
    private final Input<SearchableStringFilterInput> lastBilledCycleEndDate;
    private final Input<SearchableStringFilterInput> lastBilledCycleStartDate;
    private final Input<SearchableStringFilterInput> lastBilledDate;
    private final Input<SearchableIntFilterInput> lastBilledUserCount;
    private final Input<SearchableIntFilterInput> lastPaidAmount;
    private final Input<SearchableIDFilterInput> lastPaidProductAccountBillId;
    private final Input<SearchableIntFilterInput> lastPaidUserCount;
    private final Input<SearchableStringFilterInput> lastPaymentDate;
    private final Input<SearchableStringFilterInput> lastPaymentFollowupDoneOn;
    private final Input<SearchableStringFilterInput> lastPaymentFollowupNote;
    private final Input<SearchableIDFilterInput> lastPendingProductAccountBillId;
    private final Input<SearchableStringFilterInput> nextBillingCycleEndDate;
    private final Input<SearchableStringFilterInput> nextBillingCycleStartDate;
    private final Input<SearchableStringFilterInput> nextBillingDate;
    private final Input<SearchableStringFilterInput> nextPaymentDueDate;
    private final Input<SearchableClientAccountFilterInput> not;
    private final Input<List<SearchableClientAccountFilterInput>> or;
    private final Input<SearchableStringFilterInput> paymentDueDate;
    private final Input<SearchableStringFilterInput> subscriptionCreationDate;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> clientAccountId = Input.absent();
        private Input<SearchableStringFilterInput> clientAccountType = Input.absent();
        private Input<SearchableStringFilterInput> clientAccountStatus = Input.absent();
        private Input<SearchableStringFilterInput> clientAccountTrialEndDate = Input.absent();
        private Input<SearchableIntFilterInput> clientAccountTrialExtensionTimes = Input.absent();
        private Input<SearchableIDFilterInput> billingContactId = Input.absent();
        private Input<SearchableIDFilterInput> alternateBillingContactId = Input.absent();
        private Input<SearchableIDFilterInput> lastPendingProductAccountBillId = Input.absent();
        private Input<SearchableIDFilterInput> lastPaidProductAccountBillId = Input.absent();
        private Input<SearchableIDFilterInput> accountSalesOwnerId = Input.absent();
        private Input<SearchableIDFilterInput> accountSupportOwnerId = Input.absent();
        private Input<SearchableIntFilterInput> currentUserCount = Input.absent();
        private Input<SearchableIntFilterInput> freeUserCount = Input.absent();
        private Input<SearchableStringFilterInput> currency = Input.absent();
        private Input<SearchableStringFilterInput> subscriptionCreationDate = Input.absent();
        private Input<SearchableStringFilterInput> accountCreationDate = Input.absent();
        private Input<SearchableStringFilterInput> lastBilledCycleStartDate = Input.absent();
        private Input<SearchableStringFilterInput> lastBilledCycleEndDate = Input.absent();
        private Input<SearchableStringFilterInput> lastBilledDate = Input.absent();
        private Input<SearchableIntFilterInput> lastBilledAmmount = Input.absent();
        private Input<SearchableIntFilterInput> lastPaidAmount = Input.absent();
        private Input<SearchableStringFilterInput> lastPaymentDate = Input.absent();
        private Input<SearchableStringFilterInput> lastBillStatus = Input.absent();
        private Input<SearchableStringFilterInput> lastPaymentFollowupNote = Input.absent();
        private Input<SearchableStringFilterInput> lastPaymentFollowupDoneOn = Input.absent();
        private Input<SearchableIntFilterInput> lastPaidUserCount = Input.absent();
        private Input<SearchableIntFilterInput> lastBilledUserCount = Input.absent();
        private Input<SearchableStringFilterInput> billingPeriod = Input.absent();
        private Input<SearchableStringFilterInput> billCycleStartDate = Input.absent();
        private Input<SearchableStringFilterInput> billCycleEndDate = Input.absent();
        private Input<SearchableStringFilterInput> billingDate = Input.absent();
        private Input<SearchableStringFilterInput> paymentDueDate = Input.absent();
        private Input<SearchableStringFilterInput> nextBillingCycleStartDate = Input.absent();
        private Input<SearchableStringFilterInput> nextBillingCycleEndDate = Input.absent();
        private Input<SearchableStringFilterInput> nextBillingDate = Input.absent();
        private Input<SearchableStringFilterInput> nextPaymentDueDate = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableClientAccountFilterInput>> and = Input.absent();
        private Input<List<SearchableClientAccountFilterInput>> or = Input.absent();
        private Input<SearchableClientAccountFilterInput> not = Input.absent();

        public Builder accountCreationDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.accountCreationDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder accountSalesOwnerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountSalesOwnerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder accountSupportOwnerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountSupportOwnerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder alternateBillingContactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.alternateBillingContactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableClientAccountFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder billCycleEndDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.billCycleEndDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder billCycleStartDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.billCycleStartDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder billingContactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.billingContactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder billingDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.billingDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder billingPeriod(SearchableStringFilterInput searchableStringFilterInput) {
            this.billingPeriod = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public SearchableClientAccountFilterInput build() {
            return new SearchableClientAccountFilterInput(this.accountId, this.clientAccountId, this.clientAccountType, this.clientAccountStatus, this.clientAccountTrialEndDate, this.clientAccountTrialExtensionTimes, this.billingContactId, this.alternateBillingContactId, this.lastPendingProductAccountBillId, this.lastPaidProductAccountBillId, this.accountSalesOwnerId, this.accountSupportOwnerId, this.currentUserCount, this.freeUserCount, this.currency, this.subscriptionCreationDate, this.accountCreationDate, this.lastBilledCycleStartDate, this.lastBilledCycleEndDate, this.lastBilledDate, this.lastBilledAmmount, this.lastPaidAmount, this.lastPaymentDate, this.lastBillStatus, this.lastPaymentFollowupNote, this.lastPaymentFollowupDoneOn, this.lastPaidUserCount, this.lastBilledUserCount, this.billingPeriod, this.billCycleStartDate, this.billCycleEndDate, this.billingDate, this.paymentDueDate, this.nextBillingCycleStartDate, this.nextBillingCycleEndDate, this.nextBillingDate, this.nextPaymentDueDate, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder clientAccountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.clientAccountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder clientAccountStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.clientAccountStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder clientAccountTrialEndDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.clientAccountTrialEndDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder clientAccountTrialExtensionTimes(SearchableIntFilterInput searchableIntFilterInput) {
            this.clientAccountTrialExtensionTimes = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder clientAccountType(SearchableStringFilterInput searchableStringFilterInput) {
            this.clientAccountType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder currency(SearchableStringFilterInput searchableStringFilterInput) {
            this.currency = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder currentUserCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.currentUserCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder freeUserCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.freeUserCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder lastBillStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastBillStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastBilledAmmount(SearchableIntFilterInput searchableIntFilterInput) {
            this.lastBilledAmmount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder lastBilledCycleEndDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastBilledCycleEndDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastBilledCycleStartDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastBilledCycleStartDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastBilledDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastBilledDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastBilledUserCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.lastBilledUserCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder lastPaidAmount(SearchableIntFilterInput searchableIntFilterInput) {
            this.lastPaidAmount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder lastPaidProductAccountBillId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastPaidProductAccountBillId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastPaidUserCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.lastPaidUserCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder lastPaymentDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastPaymentDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastPaymentFollowupDoneOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastPaymentFollowupDoneOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastPaymentFollowupNote(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastPaymentFollowupNote = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastPendingProductAccountBillId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastPendingProductAccountBillId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder nextBillingCycleEndDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.nextBillingCycleEndDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nextBillingCycleStartDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.nextBillingCycleStartDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nextBillingDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.nextBillingDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nextPaymentDueDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.nextPaymentDueDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableClientAccountFilterInput searchableClientAccountFilterInput) {
            this.not = Input.fromNullable(searchableClientAccountFilterInput);
            return this;
        }

        public Builder or(List<SearchableClientAccountFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder paymentDueDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.paymentDueDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder subscriptionCreationDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.subscriptionCreationDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableClientAccountFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableIntFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableIDFilterInput> input8, Input<SearchableIDFilterInput> input9, Input<SearchableIDFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableIDFilterInput> input12, Input<SearchableIntFilterInput> input13, Input<SearchableIntFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableIntFilterInput> input21, Input<SearchableIntFilterInput> input22, Input<SearchableStringFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<SearchableStringFilterInput> input25, Input<SearchableStringFilterInput> input26, Input<SearchableIntFilterInput> input27, Input<SearchableIntFilterInput> input28, Input<SearchableStringFilterInput> input29, Input<SearchableStringFilterInput> input30, Input<SearchableStringFilterInput> input31, Input<SearchableStringFilterInput> input32, Input<SearchableStringFilterInput> input33, Input<SearchableStringFilterInput> input34, Input<SearchableStringFilterInput> input35, Input<SearchableStringFilterInput> input36, Input<SearchableStringFilterInput> input37, Input<SearchableStringFilterInput> input38, Input<SearchableStringFilterInput> input39, Input<List<SearchableClientAccountFilterInput>> input40, Input<List<SearchableClientAccountFilterInput>> input41, Input<SearchableClientAccountFilterInput> input42) {
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

    public SearchableStringFilterInput accountCreationDate() {
        return this.accountCreationDate.value;
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableIDFilterInput accountSalesOwnerId() {
        return this.accountSalesOwnerId.value;
    }

    public SearchableIDFilterInput accountSupportOwnerId() {
        return this.accountSupportOwnerId.value;
    }

    public SearchableIDFilterInput alternateBillingContactId() {
        return this.alternateBillingContactId.value;
    }

    public List<SearchableClientAccountFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput billCycleEndDate() {
        return this.billCycleEndDate.value;
    }

    public SearchableStringFilterInput billCycleStartDate() {
        return this.billCycleStartDate.value;
    }

    public SearchableIDFilterInput billingContactId() {
        return this.billingContactId.value;
    }

    public SearchableStringFilterInput billingDate() {
        return this.billingDate.value;
    }

    public SearchableStringFilterInput billingPeriod() {
        return this.billingPeriod.value;
    }

    public SearchableIDFilterInput clientAccountId() {
        return this.clientAccountId.value;
    }

    public SearchableStringFilterInput clientAccountStatus() {
        return this.clientAccountStatus.value;
    }

    public SearchableStringFilterInput clientAccountTrialEndDate() {
        return this.clientAccountTrialEndDate.value;
    }

    public SearchableIntFilterInput clientAccountTrialExtensionTimes() {
        return this.clientAccountTrialExtensionTimes.value;
    }

    public SearchableStringFilterInput clientAccountType() {
        return this.clientAccountType.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput currency() {
        return this.currency.value;
    }

    public SearchableIntFilterInput currentUserCount() {
        return this.currentUserCount.value;
    }

    public SearchableIntFilterInput freeUserCount() {
        return this.freeUserCount.value;
    }

    public SearchableStringFilterInput lastBillStatus() {
        return this.lastBillStatus.value;
    }

    public SearchableIntFilterInput lastBilledAmmount() {
        return this.lastBilledAmmount.value;
    }

    public SearchableStringFilterInput lastBilledCycleEndDate() {
        return this.lastBilledCycleEndDate.value;
    }

    public SearchableStringFilterInput lastBilledCycleStartDate() {
        return this.lastBilledCycleStartDate.value;
    }

    public SearchableStringFilterInput lastBilledDate() {
        return this.lastBilledDate.value;
    }

    public SearchableIntFilterInput lastBilledUserCount() {
        return this.lastBilledUserCount.value;
    }

    public SearchableIntFilterInput lastPaidAmount() {
        return this.lastPaidAmount.value;
    }

    public SearchableIDFilterInput lastPaidProductAccountBillId() {
        return this.lastPaidProductAccountBillId.value;
    }

    public SearchableIntFilterInput lastPaidUserCount() {
        return this.lastPaidUserCount.value;
    }

    public SearchableStringFilterInput lastPaymentDate() {
        return this.lastPaymentDate.value;
    }

    public SearchableStringFilterInput lastPaymentFollowupDoneOn() {
        return this.lastPaymentFollowupDoneOn.value;
    }

    public SearchableStringFilterInput lastPaymentFollowupNote() {
        return this.lastPaymentFollowupNote.value;
    }

    public SearchableIDFilterInput lastPendingProductAccountBillId() {
        return this.lastPendingProductAccountBillId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableClientAccountFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableClientAccountFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableClientAccountFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableClientAccountFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.clientAccountId.defined) {
                    inputFieldWriter.writeObject("clientAccountId", SearchableClientAccountFilterInput.this.clientAccountId.value != 0 ? ((SearchableIDFilterInput) SearchableClientAccountFilterInput.this.clientAccountId.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.clientAccountType.defined) {
                    inputFieldWriter.writeObject("clientAccountType", SearchableClientAccountFilterInput.this.clientAccountType.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.clientAccountType.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.clientAccountStatus.defined) {
                    inputFieldWriter.writeObject("clientAccountStatus", SearchableClientAccountFilterInput.this.clientAccountStatus.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.clientAccountStatus.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.clientAccountTrialEndDate.defined) {
                    inputFieldWriter.writeObject("clientAccountTrialEndDate", SearchableClientAccountFilterInput.this.clientAccountTrialEndDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.clientAccountTrialEndDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.clientAccountTrialExtensionTimes.defined) {
                    inputFieldWriter.writeObject("clientAccountTrialExtensionTimes", SearchableClientAccountFilterInput.this.clientAccountTrialExtensionTimes.value != 0 ? ((SearchableIntFilterInput) SearchableClientAccountFilterInput.this.clientAccountTrialExtensionTimes.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.billingContactId.defined) {
                    inputFieldWriter.writeObject("billingContactId", SearchableClientAccountFilterInput.this.billingContactId.value != 0 ? ((SearchableIDFilterInput) SearchableClientAccountFilterInput.this.billingContactId.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.alternateBillingContactId.defined) {
                    inputFieldWriter.writeObject("alternateBillingContactId", SearchableClientAccountFilterInput.this.alternateBillingContactId.value != 0 ? ((SearchableIDFilterInput) SearchableClientAccountFilterInput.this.alternateBillingContactId.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastPendingProductAccountBillId.defined) {
                    inputFieldWriter.writeObject("lastPendingProductAccountBillId", SearchableClientAccountFilterInput.this.lastPendingProductAccountBillId.value != 0 ? ((SearchableIDFilterInput) SearchableClientAccountFilterInput.this.lastPendingProductAccountBillId.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastPaidProductAccountBillId.defined) {
                    inputFieldWriter.writeObject("lastPaidProductAccountBillId", SearchableClientAccountFilterInput.this.lastPaidProductAccountBillId.value != 0 ? ((SearchableIDFilterInput) SearchableClientAccountFilterInput.this.lastPaidProductAccountBillId.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.accountSalesOwnerId.defined) {
                    inputFieldWriter.writeObject("accountSalesOwnerId", SearchableClientAccountFilterInput.this.accountSalesOwnerId.value != 0 ? ((SearchableIDFilterInput) SearchableClientAccountFilterInput.this.accountSalesOwnerId.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.accountSupportOwnerId.defined) {
                    inputFieldWriter.writeObject("accountSupportOwnerId", SearchableClientAccountFilterInput.this.accountSupportOwnerId.value != 0 ? ((SearchableIDFilterInput) SearchableClientAccountFilterInput.this.accountSupportOwnerId.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.currentUserCount.defined) {
                    inputFieldWriter.writeObject("currentUserCount", SearchableClientAccountFilterInput.this.currentUserCount.value != 0 ? ((SearchableIntFilterInput) SearchableClientAccountFilterInput.this.currentUserCount.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.freeUserCount.defined) {
                    inputFieldWriter.writeObject("freeUserCount", SearchableClientAccountFilterInput.this.freeUserCount.value != 0 ? ((SearchableIntFilterInput) SearchableClientAccountFilterInput.this.freeUserCount.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, SearchableClientAccountFilterInput.this.currency.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.currency.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.subscriptionCreationDate.defined) {
                    inputFieldWriter.writeObject("subscriptionCreationDate", SearchableClientAccountFilterInput.this.subscriptionCreationDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.subscriptionCreationDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.accountCreationDate.defined) {
                    inputFieldWriter.writeObject("accountCreationDate", SearchableClientAccountFilterInput.this.accountCreationDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.accountCreationDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastBilledCycleStartDate.defined) {
                    inputFieldWriter.writeObject("lastBilledCycleStartDate", SearchableClientAccountFilterInput.this.lastBilledCycleStartDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.lastBilledCycleStartDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastBilledCycleEndDate.defined) {
                    inputFieldWriter.writeObject("lastBilledCycleEndDate", SearchableClientAccountFilterInput.this.lastBilledCycleEndDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.lastBilledCycleEndDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastBilledDate.defined) {
                    inputFieldWriter.writeObject("lastBilledDate", SearchableClientAccountFilterInput.this.lastBilledDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.lastBilledDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastBilledAmmount.defined) {
                    inputFieldWriter.writeObject("lastBilledAmmount", SearchableClientAccountFilterInput.this.lastBilledAmmount.value != 0 ? ((SearchableIntFilterInput) SearchableClientAccountFilterInput.this.lastBilledAmmount.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastPaidAmount.defined) {
                    inputFieldWriter.writeObject("lastPaidAmount", SearchableClientAccountFilterInput.this.lastPaidAmount.value != 0 ? ((SearchableIntFilterInput) SearchableClientAccountFilterInput.this.lastPaidAmount.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastPaymentDate.defined) {
                    inputFieldWriter.writeObject("lastPaymentDate", SearchableClientAccountFilterInput.this.lastPaymentDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.lastPaymentDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastBillStatus.defined) {
                    inputFieldWriter.writeObject("lastBillStatus", SearchableClientAccountFilterInput.this.lastBillStatus.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.lastBillStatus.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastPaymentFollowupNote.defined) {
                    inputFieldWriter.writeObject("lastPaymentFollowupNote", SearchableClientAccountFilterInput.this.lastPaymentFollowupNote.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.lastPaymentFollowupNote.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastPaymentFollowupDoneOn.defined) {
                    inputFieldWriter.writeObject("lastPaymentFollowupDoneOn", SearchableClientAccountFilterInput.this.lastPaymentFollowupDoneOn.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.lastPaymentFollowupDoneOn.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastPaidUserCount.defined) {
                    inputFieldWriter.writeObject("lastPaidUserCount", SearchableClientAccountFilterInput.this.lastPaidUserCount.value != 0 ? ((SearchableIntFilterInput) SearchableClientAccountFilterInput.this.lastPaidUserCount.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.lastBilledUserCount.defined) {
                    inputFieldWriter.writeObject("lastBilledUserCount", SearchableClientAccountFilterInput.this.lastBilledUserCount.value != 0 ? ((SearchableIntFilterInput) SearchableClientAccountFilterInput.this.lastBilledUserCount.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.billingPeriod.defined) {
                    inputFieldWriter.writeObject("billingPeriod", SearchableClientAccountFilterInput.this.billingPeriod.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.billingPeriod.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.billCycleStartDate.defined) {
                    inputFieldWriter.writeObject("billCycleStartDate", SearchableClientAccountFilterInput.this.billCycleStartDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.billCycleStartDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.billCycleEndDate.defined) {
                    inputFieldWriter.writeObject("billCycleEndDate", SearchableClientAccountFilterInput.this.billCycleEndDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.billCycleEndDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.billingDate.defined) {
                    inputFieldWriter.writeObject("billingDate", SearchableClientAccountFilterInput.this.billingDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.billingDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.paymentDueDate.defined) {
                    inputFieldWriter.writeObject("paymentDueDate", SearchableClientAccountFilterInput.this.paymentDueDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.paymentDueDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.nextBillingCycleStartDate.defined) {
                    inputFieldWriter.writeObject("nextBillingCycleStartDate", SearchableClientAccountFilterInput.this.nextBillingCycleStartDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.nextBillingCycleStartDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.nextBillingCycleEndDate.defined) {
                    inputFieldWriter.writeObject("nextBillingCycleEndDate", SearchableClientAccountFilterInput.this.nextBillingCycleEndDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.nextBillingCycleEndDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.nextBillingDate.defined) {
                    inputFieldWriter.writeObject("nextBillingDate", SearchableClientAccountFilterInput.this.nextBillingDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.nextBillingDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.nextPaymentDueDate.defined) {
                    inputFieldWriter.writeObject("nextPaymentDueDate", SearchableClientAccountFilterInput.this.nextPaymentDueDate.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.nextPaymentDueDate.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableClientAccountFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableClientAccountFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableClientAccountFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableClientAccountFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableClientAccountFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableClientAccountFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableClientAccountFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableClientAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableClientAccountFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableClientAccountFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableClientAccountFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableClientAccountFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableClientAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableClientAccountFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableClientAccountFilterInput.this.not.value != 0 ? ((SearchableClientAccountFilterInput) SearchableClientAccountFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput nextBillingCycleEndDate() {
        return this.nextBillingCycleEndDate.value;
    }

    public SearchableStringFilterInput nextBillingCycleStartDate() {
        return this.nextBillingCycleStartDate.value;
    }

    public SearchableStringFilterInput nextBillingDate() {
        return this.nextBillingDate.value;
    }

    public SearchableStringFilterInput nextPaymentDueDate() {
        return this.nextPaymentDueDate.value;
    }

    public SearchableClientAccountFilterInput not() {
        return this.not.value;
    }

    public List<SearchableClientAccountFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput paymentDueDate() {
        return this.paymentDueDate.value;
    }

    public SearchableStringFilterInput subscriptionCreationDate() {
        return this.subscriptionCreationDate.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
