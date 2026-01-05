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
public final class SearchableProductAccountBillsFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableProductAccountBillsFilterInput>> and;
    private final Input<SearchableStringFilterInput> billGeneratedFrom;
    private final Input<SearchableStringFilterInput> billGeneratedTo;
    private final Input<SearchableStringFilterInput> billStatus;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> currency;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableProductAccountBillsFilterInput> not;
    private final Input<List<SearchableProductAccountBillsFilterInput>> or;
    private final Input<SearchableIDFilterInput> productAccountId;
    private final Input<SearchableIDFilterInput> productPlanId;
    private final Input<SearchableIntFilterInput> totalFees;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> productAccountId = Input.absent();
        private Input<SearchableIDFilterInput> productPlanId = Input.absent();
        private Input<SearchableIntFilterInput> totalFees = Input.absent();
        private Input<SearchableStringFilterInput> currency = Input.absent();
        private Input<SearchableStringFilterInput> billStatus = Input.absent();
        private Input<SearchableStringFilterInput> billGeneratedFrom = Input.absent();
        private Input<SearchableStringFilterInput> billGeneratedTo = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableProductAccountBillsFilterInput>> and = Input.absent();
        private Input<List<SearchableProductAccountBillsFilterInput>> or = Input.absent();
        private Input<SearchableProductAccountBillsFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableProductAccountBillsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder billGeneratedFrom(SearchableStringFilterInput searchableStringFilterInput) {
            this.billGeneratedFrom = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder billGeneratedTo(SearchableStringFilterInput searchableStringFilterInput) {
            this.billGeneratedTo = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder billStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.billStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public SearchableProductAccountBillsFilterInput build() {
            return new SearchableProductAccountBillsFilterInput(this.id, this.accountId, this.productAccountId, this.productPlanId, this.totalFees, this.currency, this.billStatus, this.billGeneratedFrom, this.billGeneratedTo, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder currency(SearchableStringFilterInput searchableStringFilterInput) {
            this.currency = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder not(SearchableProductAccountBillsFilterInput searchableProductAccountBillsFilterInput) {
            this.not = Input.fromNullable(searchableProductAccountBillsFilterInput);
            return this;
        }

        public Builder or(List<SearchableProductAccountBillsFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder productAccountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.productAccountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder productPlanId(SearchableIDFilterInput searchableIDFilterInput) {
            this.productPlanId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder totalFees(SearchableIntFilterInput searchableIntFilterInput) {
            this.totalFees = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableProductAccountBillsFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableIDFilterInput> input4, Input<SearchableIntFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<List<SearchableProductAccountBillsFilterInput>> input12, Input<List<SearchableProductAccountBillsFilterInput>> input13, Input<SearchableProductAccountBillsFilterInput> input14) {
        this.id = input;
        this.accountId = input2;
        this.productAccountId = input3;
        this.productPlanId = input4;
        this.totalFees = input5;
        this.currency = input6;
        this.billStatus = input7;
        this.billGeneratedFrom = input8;
        this.billGeneratedTo = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
        this.and = input12;
        this.or = input13;
        this.not = input14;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableProductAccountBillsFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput billGeneratedFrom() {
        return this.billGeneratedFrom.value;
    }

    public SearchableStringFilterInput billGeneratedTo() {
        return this.billGeneratedTo.value;
    }

    public SearchableStringFilterInput billStatus() {
        return this.billStatus.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput currency() {
        return this.currency.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableProductAccountBillsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableProductAccountBillsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableProductAccountBillsFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableProductAccountBillsFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableProductAccountBillsFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableProductAccountBillsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.productAccountId.defined) {
                    inputFieldWriter.writeObject("productAccountId", SearchableProductAccountBillsFilterInput.this.productAccountId.value != 0 ? ((SearchableIDFilterInput) SearchableProductAccountBillsFilterInput.this.productAccountId.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.productPlanId.defined) {
                    inputFieldWriter.writeObject("productPlanId", SearchableProductAccountBillsFilterInput.this.productPlanId.value != 0 ? ((SearchableIDFilterInput) SearchableProductAccountBillsFilterInput.this.productPlanId.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.totalFees.defined) {
                    inputFieldWriter.writeObject("totalFees", SearchableProductAccountBillsFilterInput.this.totalFees.value != 0 ? ((SearchableIntFilterInput) SearchableProductAccountBillsFilterInput.this.totalFees.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, SearchableProductAccountBillsFilterInput.this.currency.value != 0 ? ((SearchableStringFilterInput) SearchableProductAccountBillsFilterInput.this.currency.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.billStatus.defined) {
                    inputFieldWriter.writeObject("billStatus", SearchableProductAccountBillsFilterInput.this.billStatus.value != 0 ? ((SearchableStringFilterInput) SearchableProductAccountBillsFilterInput.this.billStatus.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.billGeneratedFrom.defined) {
                    inputFieldWriter.writeObject("billGeneratedFrom", SearchableProductAccountBillsFilterInput.this.billGeneratedFrom.value != 0 ? ((SearchableStringFilterInput) SearchableProductAccountBillsFilterInput.this.billGeneratedFrom.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.billGeneratedTo.defined) {
                    inputFieldWriter.writeObject("billGeneratedTo", SearchableProductAccountBillsFilterInput.this.billGeneratedTo.value != 0 ? ((SearchableStringFilterInput) SearchableProductAccountBillsFilterInput.this.billGeneratedTo.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableProductAccountBillsFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableProductAccountBillsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableProductAccountBillsFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableProductAccountBillsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableProductAccountBillsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableProductAccountBillsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableProductAccountBillsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableProductAccountBillsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableProductAccountBillsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableProductAccountBillsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableProductAccountBillsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableProductAccountBillsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableProductAccountBillsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableProductAccountBillsFilterInput.this.not.value != 0 ? ((SearchableProductAccountBillsFilterInput) SearchableProductAccountBillsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableProductAccountBillsFilterInput not() {
        return this.not.value;
    }

    public List<SearchableProductAccountBillsFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput productAccountId() {
        return this.productAccountId.value;
    }

    public SearchableIDFilterInput productPlanId() {
        return this.productPlanId.value;
    }

    public SearchableIntFilterInput totalFees() {
        return this.totalFees.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
