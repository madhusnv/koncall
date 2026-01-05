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
public final class SearchableProductPlanSubscriptionFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableIDFilterInput> addedById;
    private final Input<SearchableIntFilterInput> amount;
    private final Input<List<SearchableProductPlanSubscriptionFilterInput>> and;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> currency;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableProductPlanSubscriptionFilterInput> not;
    private final Input<SearchableIntFilterInput> numberOfFreeUnits;
    private final Input<SearchableIntFilterInput> numberOfUnits;
    private final Input<List<SearchableProductPlanSubscriptionFilterInput>> or;
    private final Input<SearchableStringFilterInput> period;
    private final Input<SearchableStringFilterInput> planDescription;
    private final Input<SearchableIntFilterInput> planFeePerUnit;
    private final Input<SearchableIntFilterInput> planFeeProRataPerUnit;
    private final Input<SearchableStringFilterInput> planStatus;
    private final Input<SearchableIDFilterInput> productAccountId;
    private final Input<SearchableIDFilterInput> productPlanId;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> subscriptionEndDate;
    private final Input<SearchableStringFilterInput> subscriptionPaymentStatus;
    private final Input<SearchableStringFilterInput> subscriptionStartDate;
    private final Input<SearchableStringFilterInput> unitType;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> addedById = Input.absent();
        private Input<SearchableIDFilterInput> productAccountId = Input.absent();
        private Input<SearchableIDFilterInput> productPlanId = Input.absent();
        private Input<SearchableStringFilterInput> planDescription = Input.absent();
        private Input<SearchableStringFilterInput> planStatus = Input.absent();
        private Input<SearchableIntFilterInput> planFeePerUnit = Input.absent();
        private Input<SearchableIntFilterInput> planFeeProRataPerUnit = Input.absent();
        private Input<SearchableStringFilterInput> period = Input.absent();
        private Input<SearchableIntFilterInput> amount = Input.absent();
        private Input<SearchableStringFilterInput> currency = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableIntFilterInput> numberOfUnits = Input.absent();
        private Input<SearchableIntFilterInput> numberOfFreeUnits = Input.absent();
        private Input<SearchableStringFilterInput> unitType = Input.absent();
        private Input<SearchableStringFilterInput> subscriptionPaymentStatus = Input.absent();
        private Input<SearchableStringFilterInput> subscriptionStartDate = Input.absent();
        private Input<SearchableStringFilterInput> subscriptionEndDate = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableProductPlanSubscriptionFilterInput>> and = Input.absent();
        private Input<List<SearchableProductPlanSubscriptionFilterInput>> or = Input.absent();
        private Input<SearchableProductPlanSubscriptionFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder addedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.addedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder amount(SearchableIntFilterInput searchableIntFilterInput) {
            this.amount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder and(List<SearchableProductPlanSubscriptionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableProductPlanSubscriptionFilterInput build() {
            return new SearchableProductPlanSubscriptionFilterInput(this.id, this.accountId, this.addedById, this.productAccountId, this.productPlanId, this.planDescription, this.planStatus, this.planFeePerUnit, this.planFeeProRataPerUnit, this.period, this.amount, this.currency, this.status, this.numberOfUnits, this.numberOfFreeUnits, this.unitType, this.subscriptionPaymentStatus, this.subscriptionStartDate, this.subscriptionEndDate, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(SearchableProductPlanSubscriptionFilterInput searchableProductPlanSubscriptionFilterInput) {
            this.not = Input.fromNullable(searchableProductPlanSubscriptionFilterInput);
            return this;
        }

        public Builder numberOfFreeUnits(SearchableIntFilterInput searchableIntFilterInput) {
            this.numberOfFreeUnits = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder numberOfUnits(SearchableIntFilterInput searchableIntFilterInput) {
            this.numberOfUnits = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder or(List<SearchableProductPlanSubscriptionFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder period(SearchableStringFilterInput searchableStringFilterInput) {
            this.period = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder planDescription(SearchableStringFilterInput searchableStringFilterInput) {
            this.planDescription = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder planFeePerUnit(SearchableIntFilterInput searchableIntFilterInput) {
            this.planFeePerUnit = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder planFeeProRataPerUnit(SearchableIntFilterInput searchableIntFilterInput) {
            this.planFeeProRataPerUnit = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder planStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.planStatus = Input.fromNullable(searchableStringFilterInput);
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

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder subscriptionEndDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.subscriptionEndDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder subscriptionPaymentStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.subscriptionPaymentStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder subscriptionStartDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.subscriptionStartDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder unitType(SearchableStringFilterInput searchableStringFilterInput) {
            this.unitType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableProductPlanSubscriptionFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableIDFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableIntFilterInput> input8, Input<SearchableIntFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableIntFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableIntFilterInput> input14, Input<SearchableIntFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<List<SearchableProductPlanSubscriptionFilterInput>> input22, Input<List<SearchableProductPlanSubscriptionFilterInput>> input23, Input<SearchableProductPlanSubscriptionFilterInput> input24) {
        this.id = input;
        this.accountId = input2;
        this.addedById = input3;
        this.productAccountId = input4;
        this.productPlanId = input5;
        this.planDescription = input6;
        this.planStatus = input7;
        this.planFeePerUnit = input8;
        this.planFeeProRataPerUnit = input9;
        this.period = input10;
        this.amount = input11;
        this.currency = input12;
        this.status = input13;
        this.numberOfUnits = input14;
        this.numberOfFreeUnits = input15;
        this.unitType = input16;
        this.subscriptionPaymentStatus = input17;
        this.subscriptionStartDate = input18;
        this.subscriptionEndDate = input19;
        this.createdAt = input20;
        this.updatedAt = input21;
        this.and = input22;
        this.or = input23;
        this.not = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableIDFilterInput addedById() {
        return this.addedById.value;
    }

    public SearchableIntFilterInput amount() {
        return this.amount.value;
    }

    public List<SearchableProductPlanSubscriptionFilterInput> and() {
        return this.and.value;
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
        return new InputFieldMarshaller() { // from class: type.SearchableProductPlanSubscriptionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableProductPlanSubscriptionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableProductPlanSubscriptionFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableProductPlanSubscriptionFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableProductPlanSubscriptionFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableProductPlanSubscriptionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", SearchableProductPlanSubscriptionFilterInput.this.addedById.value != 0 ? ((SearchableIDFilterInput) SearchableProductPlanSubscriptionFilterInput.this.addedById.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.productAccountId.defined) {
                    inputFieldWriter.writeObject("productAccountId", SearchableProductPlanSubscriptionFilterInput.this.productAccountId.value != 0 ? ((SearchableIDFilterInput) SearchableProductPlanSubscriptionFilterInput.this.productAccountId.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.productPlanId.defined) {
                    inputFieldWriter.writeObject("productPlanId", SearchableProductPlanSubscriptionFilterInput.this.productPlanId.value != 0 ? ((SearchableIDFilterInput) SearchableProductPlanSubscriptionFilterInput.this.productPlanId.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.planDescription.defined) {
                    inputFieldWriter.writeObject("planDescription", SearchableProductPlanSubscriptionFilterInput.this.planDescription.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.planDescription.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.planStatus.defined) {
                    inputFieldWriter.writeObject("planStatus", SearchableProductPlanSubscriptionFilterInput.this.planStatus.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.planStatus.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.planFeePerUnit.defined) {
                    inputFieldWriter.writeObject("planFeePerUnit", SearchableProductPlanSubscriptionFilterInput.this.planFeePerUnit.value != 0 ? ((SearchableIntFilterInput) SearchableProductPlanSubscriptionFilterInput.this.planFeePerUnit.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.planFeeProRataPerUnit.defined) {
                    inputFieldWriter.writeObject("planFeeProRataPerUnit", SearchableProductPlanSubscriptionFilterInput.this.planFeeProRataPerUnit.value != 0 ? ((SearchableIntFilterInput) SearchableProductPlanSubscriptionFilterInput.this.planFeeProRataPerUnit.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.period.defined) {
                    inputFieldWriter.writeObject("period", SearchableProductPlanSubscriptionFilterInput.this.period.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.period.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", SearchableProductPlanSubscriptionFilterInput.this.amount.value != 0 ? ((SearchableIntFilterInput) SearchableProductPlanSubscriptionFilterInput.this.amount.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, SearchableProductPlanSubscriptionFilterInput.this.currency.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.currency.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableProductPlanSubscriptionFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.numberOfUnits.defined) {
                    inputFieldWriter.writeObject("numberOfUnits", SearchableProductPlanSubscriptionFilterInput.this.numberOfUnits.value != 0 ? ((SearchableIntFilterInput) SearchableProductPlanSubscriptionFilterInput.this.numberOfUnits.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.numberOfFreeUnits.defined) {
                    inputFieldWriter.writeObject("numberOfFreeUnits", SearchableProductPlanSubscriptionFilterInput.this.numberOfFreeUnits.value != 0 ? ((SearchableIntFilterInput) SearchableProductPlanSubscriptionFilterInput.this.numberOfFreeUnits.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.unitType.defined) {
                    inputFieldWriter.writeObject("unitType", SearchableProductPlanSubscriptionFilterInput.this.unitType.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.unitType.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.subscriptionPaymentStatus.defined) {
                    inputFieldWriter.writeObject("subscriptionPaymentStatus", SearchableProductPlanSubscriptionFilterInput.this.subscriptionPaymentStatus.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.subscriptionPaymentStatus.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.subscriptionStartDate.defined) {
                    inputFieldWriter.writeObject("subscriptionStartDate", SearchableProductPlanSubscriptionFilterInput.this.subscriptionStartDate.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.subscriptionStartDate.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.subscriptionEndDate.defined) {
                    inputFieldWriter.writeObject("subscriptionEndDate", SearchableProductPlanSubscriptionFilterInput.this.subscriptionEndDate.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.subscriptionEndDate.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableProductPlanSubscriptionFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableProductPlanSubscriptionFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableProductPlanSubscriptionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableProductPlanSubscriptionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableProductPlanSubscriptionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableProductPlanSubscriptionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableProductPlanSubscriptionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableProductPlanSubscriptionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableProductPlanSubscriptionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableProductPlanSubscriptionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableProductPlanSubscriptionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableProductPlanSubscriptionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableProductPlanSubscriptionFilterInput.this.not.value != 0 ? ((SearchableProductPlanSubscriptionFilterInput) SearchableProductPlanSubscriptionFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableProductPlanSubscriptionFilterInput not() {
        return this.not.value;
    }

    public SearchableIntFilterInput numberOfFreeUnits() {
        return this.numberOfFreeUnits.value;
    }

    public SearchableIntFilterInput numberOfUnits() {
        return this.numberOfUnits.value;
    }

    public List<SearchableProductPlanSubscriptionFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput period() {
        return this.period.value;
    }

    public SearchableStringFilterInput planDescription() {
        return this.planDescription.value;
    }

    public SearchableIntFilterInput planFeePerUnit() {
        return this.planFeePerUnit.value;
    }

    public SearchableIntFilterInput planFeeProRataPerUnit() {
        return this.planFeeProRataPerUnit.value;
    }

    public SearchableStringFilterInput planStatus() {
        return this.planStatus.value;
    }

    public SearchableIDFilterInput productAccountId() {
        return this.productAccountId.value;
    }

    public SearchableIDFilterInput productPlanId() {
        return this.productPlanId.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput subscriptionEndDate() {
        return this.subscriptionEndDate.value;
    }

    public SearchableStringFilterInput subscriptionPaymentStatus() {
        return this.subscriptionPaymentStatus.value;
    }

    public SearchableStringFilterInput subscriptionStartDate() {
        return this.subscriptionStartDate.value;
    }

    public SearchableStringFilterInput unitType() {
        return this.unitType.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
