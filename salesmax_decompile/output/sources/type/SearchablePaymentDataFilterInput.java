package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchablePaymentDataFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableIntFilterInput> amount;
    private final Input<SearchableIntFilterInput> amountPaid;
    private final Input<List<SearchablePaymentDataFilterInput>> and;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdById;
    private final Input<SearchableStringFilterInput> currency;
    private final Input<SearchableStringFilterInput> customPaymentData;
    private final Input<SearchableIDFilterInput> engagementId;
    private final Input<SearchableStringFilterInput> finalPaymentDate;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> lastPaymentStatus;
    private final Input<SearchablePaymentDataFilterInput> not;
    private final Input<SearchableStringFilterInput> note;
    private final Input<List<SearchablePaymentDataFilterInput>> or;
    private final Input<SearchableIDFilterInput> orderId;
    private final Input<SearchableStringFilterInput> orderIdInPaymentProvider;
    private final Input<SearchableIDFilterInput> paidByContactIds;
    private final Input<SearchableIDFilterInput> paymentLinkId;
    private final Input<SearchableStringFilterInput> paymentLinkUrl;
    private final Input<SearchableStringFilterInput> paymentProvider;
    private final Input<SearchableStringFilterInput> paymentRequestType;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> transactionId;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedById;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableStringFilterInput> paymentRequestType = Input.absent();
        private Input<SearchableIDFilterInput> engagementId = Input.absent();
        private Input<SearchableStringFilterInput> paymentProvider = Input.absent();
        private Input<SearchableStringFilterInput> orderIdInPaymentProvider = Input.absent();
        private Input<SearchableIDFilterInput> orderId = Input.absent();
        private Input<SearchableIDFilterInput> paymentLinkId = Input.absent();
        private Input<SearchableStringFilterInput> paymentLinkUrl = Input.absent();
        private Input<SearchableIntFilterInput> amount = Input.absent();
        private Input<SearchableIntFilterInput> amountPaid = Input.absent();
        private Input<SearchableStringFilterInput> currency = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableStringFilterInput> lastPaymentStatus = Input.absent();
        private Input<SearchableStringFilterInput> finalPaymentDate = Input.absent();
        private Input<SearchableIDFilterInput> paidByContactIds = Input.absent();
        private Input<SearchableStringFilterInput> transactionId = Input.absent();
        private Input<SearchableStringFilterInput> note = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<SearchableStringFilterInput> customPaymentData = Input.absent();
        private Input<SearchableIDFilterInput> createdById = Input.absent();
        private Input<SearchableIDFilterInput> updatedById = Input.absent();
        private Input<List<SearchablePaymentDataFilterInput>> and = Input.absent();
        private Input<List<SearchablePaymentDataFilterInput>> or = Input.absent();
        private Input<SearchablePaymentDataFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder amount(SearchableIntFilterInput searchableIntFilterInput) {
            this.amount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder amountPaid(SearchableIntFilterInput searchableIntFilterInput) {
            this.amountPaid = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder and(List<SearchablePaymentDataFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchablePaymentDataFilterInput build() {
            return new SearchablePaymentDataFilterInput(this.id, this.accountId, this.contactId, this.paymentRequestType, this.engagementId, this.paymentProvider, this.orderIdInPaymentProvider, this.orderId, this.paymentLinkId, this.paymentLinkUrl, this.amount, this.amountPaid, this.currency, this.status, this.lastPaymentStatus, this.finalPaymentDate, this.paidByContactIds, this.transactionId, this.note, this.createdAt, this.updatedAt, this.customPaymentData, this.createdById, this.updatedById, this.and, this.or, this.not);
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdById(SearchableIDFilterInput searchableIDFilterInput) {
            this.createdById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder currency(SearchableStringFilterInput searchableStringFilterInput) {
            this.currency = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder customPaymentData(SearchableStringFilterInput searchableStringFilterInput) {
            this.customPaymentData = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder engagementId(SearchableIDFilterInput searchableIDFilterInput) {
            this.engagementId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder finalPaymentDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.finalPaymentDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastPaymentStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastPaymentStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchablePaymentDataFilterInput searchablePaymentDataFilterInput) {
            this.not = Input.fromNullable(searchablePaymentDataFilterInput);
            return this;
        }

        public Builder note(SearchableStringFilterInput searchableStringFilterInput) {
            this.note = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder or(List<SearchablePaymentDataFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder orderId(SearchableIDFilterInput searchableIDFilterInput) {
            this.orderId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder orderIdInPaymentProvider(SearchableStringFilterInput searchableStringFilterInput) {
            this.orderIdInPaymentProvider = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder paidByContactIds(SearchableIDFilterInput searchableIDFilterInput) {
            this.paidByContactIds = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder paymentLinkId(SearchableIDFilterInput searchableIDFilterInput) {
            this.paymentLinkId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder paymentLinkUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.paymentLinkUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder paymentProvider(SearchableStringFilterInput searchableStringFilterInput) {
            this.paymentProvider = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder paymentRequestType(SearchableStringFilterInput searchableStringFilterInput) {
            this.paymentRequestType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder transactionId(SearchableStringFilterInput searchableStringFilterInput) {
            this.transactionId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.updatedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchablePaymentDataFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableIDFilterInput> input8, Input<SearchableIDFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableIntFilterInput> input11, Input<SearchableIntFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableIDFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableIDFilterInput> input23, Input<SearchableIDFilterInput> input24, Input<List<SearchablePaymentDataFilterInput>> input25, Input<List<SearchablePaymentDataFilterInput>> input26, Input<SearchablePaymentDataFilterInput> input27) {
        this.id = input;
        this.accountId = input2;
        this.contactId = input3;
        this.paymentRequestType = input4;
        this.engagementId = input5;
        this.paymentProvider = input6;
        this.orderIdInPaymentProvider = input7;
        this.orderId = input8;
        this.paymentLinkId = input9;
        this.paymentLinkUrl = input10;
        this.amount = input11;
        this.amountPaid = input12;
        this.currency = input13;
        this.status = input14;
        this.lastPaymentStatus = input15;
        this.finalPaymentDate = input16;
        this.paidByContactIds = input17;
        this.transactionId = input18;
        this.note = input19;
        this.createdAt = input20;
        this.updatedAt = input21;
        this.customPaymentData = input22;
        this.createdById = input23;
        this.updatedById = input24;
        this.and = input25;
        this.or = input26;
        this.not = input27;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableIntFilterInput amount() {
        return this.amount.value;
    }

    public SearchableIntFilterInput amountPaid() {
        return this.amountPaid.value;
    }

    public List<SearchablePaymentDataFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdById() {
        return this.createdById.value;
    }

    public SearchableStringFilterInput currency() {
        return this.currency.value;
    }

    public SearchableStringFilterInput customPaymentData() {
        return this.customPaymentData.value;
    }

    public SearchableIDFilterInput engagementId() {
        return this.engagementId.value;
    }

    public SearchableStringFilterInput finalPaymentDate() {
        return this.finalPaymentDate.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput lastPaymentStatus() {
        return this.lastPaymentStatus.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchablePaymentDataFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchablePaymentDataFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchablePaymentDataFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchablePaymentDataFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchablePaymentDataFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchablePaymentDataFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchablePaymentDataFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchablePaymentDataFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.paymentRequestType.defined) {
                    inputFieldWriter.writeObject("paymentRequestType", SearchablePaymentDataFilterInput.this.paymentRequestType.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.paymentRequestType.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", SearchablePaymentDataFilterInput.this.engagementId.value != 0 ? ((SearchableIDFilterInput) SearchablePaymentDataFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.paymentProvider.defined) {
                    inputFieldWriter.writeObject("paymentProvider", SearchablePaymentDataFilterInput.this.paymentProvider.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.paymentProvider.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.orderIdInPaymentProvider.defined) {
                    inputFieldWriter.writeObject("orderIdInPaymentProvider", SearchablePaymentDataFilterInput.this.orderIdInPaymentProvider.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.orderIdInPaymentProvider.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.orderId.defined) {
                    inputFieldWriter.writeObject("orderId", SearchablePaymentDataFilterInput.this.orderId.value != 0 ? ((SearchableIDFilterInput) SearchablePaymentDataFilterInput.this.orderId.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.paymentLinkId.defined) {
                    inputFieldWriter.writeObject("paymentLinkId", SearchablePaymentDataFilterInput.this.paymentLinkId.value != 0 ? ((SearchableIDFilterInput) SearchablePaymentDataFilterInput.this.paymentLinkId.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.paymentLinkUrl.defined) {
                    inputFieldWriter.writeObject("paymentLinkUrl", SearchablePaymentDataFilterInput.this.paymentLinkUrl.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.paymentLinkUrl.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", SearchablePaymentDataFilterInput.this.amount.value != 0 ? ((SearchableIntFilterInput) SearchablePaymentDataFilterInput.this.amount.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.amountPaid.defined) {
                    inputFieldWriter.writeObject("amountPaid", SearchablePaymentDataFilterInput.this.amountPaid.value != 0 ? ((SearchableIntFilterInput) SearchablePaymentDataFilterInput.this.amountPaid.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, SearchablePaymentDataFilterInput.this.currency.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.currency.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchablePaymentDataFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeObject("lastPaymentStatus", SearchablePaymentDataFilterInput.this.lastPaymentStatus.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.lastPaymentStatus.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.finalPaymentDate.defined) {
                    inputFieldWriter.writeObject("finalPaymentDate", SearchablePaymentDataFilterInput.this.finalPaymentDate.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.finalPaymentDate.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.paidByContactIds.defined) {
                    inputFieldWriter.writeObject("paidByContactIds", SearchablePaymentDataFilterInput.this.paidByContactIds.value != 0 ? ((SearchableIDFilterInput) SearchablePaymentDataFilterInput.this.paidByContactIds.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.transactionId.defined) {
                    inputFieldWriter.writeObject("transactionId", SearchablePaymentDataFilterInput.this.transactionId.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.transactionId.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", SearchablePaymentDataFilterInput.this.note.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.note.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchablePaymentDataFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchablePaymentDataFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.customPaymentData.defined) {
                    inputFieldWriter.writeObject("customPaymentData", SearchablePaymentDataFilterInput.this.customPaymentData.value != 0 ? ((SearchableStringFilterInput) SearchablePaymentDataFilterInput.this.customPaymentData.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", SearchablePaymentDataFilterInput.this.createdById.value != 0 ? ((SearchableIDFilterInput) SearchablePaymentDataFilterInput.this.createdById.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", SearchablePaymentDataFilterInput.this.updatedById.value != 0 ? ((SearchableIDFilterInput) SearchablePaymentDataFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (SearchablePaymentDataFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchablePaymentDataFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchablePaymentDataFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchablePaymentDataFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchablePaymentDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchablePaymentDataFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchablePaymentDataFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchablePaymentDataFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchablePaymentDataFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchablePaymentDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchablePaymentDataFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchablePaymentDataFilterInput.this.not.value != 0 ? ((SearchablePaymentDataFilterInput) SearchablePaymentDataFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchablePaymentDataFilterInput not() {
        return this.not.value;
    }

    public SearchableStringFilterInput note() {
        return this.note.value;
    }

    public List<SearchablePaymentDataFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput orderId() {
        return this.orderId.value;
    }

    public SearchableStringFilterInput orderIdInPaymentProvider() {
        return this.orderIdInPaymentProvider.value;
    }

    public SearchableIDFilterInput paidByContactIds() {
        return this.paidByContactIds.value;
    }

    public SearchableIDFilterInput paymentLinkId() {
        return this.paymentLinkId.value;
    }

    public SearchableStringFilterInput paymentLinkUrl() {
        return this.paymentLinkUrl.value;
    }

    public SearchableStringFilterInput paymentProvider() {
        return this.paymentProvider.value;
    }

    public SearchableStringFilterInput paymentRequestType() {
        return this.paymentRequestType.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput transactionId() {
        return this.transactionId.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedById() {
        return this.updatedById.value;
    }
}
