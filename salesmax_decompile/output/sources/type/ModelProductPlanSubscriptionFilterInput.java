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
public final class ModelProductPlanSubscriptionFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> addedById;
    private final Input<ModelIntInput> amount;
    private final Input<List<ModelProductPlanSubscriptionFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> currency;
    private final Input<ModelIDInput> id;
    private final Input<ModelProductPlanSubscriptionFilterInput> not;
    private final Input<ModelIntInput> numberOfFreeUnits;
    private final Input<ModelIntInput> numberOfUnits;
    private final Input<List<ModelProductPlanSubscriptionFilterInput>> or;
    private final Input<ModelStringInput> period;
    private final Input<ModelStringInput> planDescription;
    private final Input<ModelIntInput> planFeePerUnit;
    private final Input<ModelIntInput> planFeeProRataPerUnit;
    private final Input<ModelStringInput> planStatus;
    private final Input<ModelIDInput> productAccountId;
    private final Input<ModelIDInput> productPlanId;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> subscriptionEndDate;
    private final Input<ModelStringInput> subscriptionPaymentStatus;
    private final Input<ModelStringInput> subscriptionStartDate;
    private final Input<ModelStringInput> unitType;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> addedById = Input.absent();
        private Input<ModelIDInput> productAccountId = Input.absent();
        private Input<ModelIDInput> productPlanId = Input.absent();
        private Input<ModelStringInput> planDescription = Input.absent();
        private Input<ModelStringInput> planStatus = Input.absent();
        private Input<ModelIntInput> planFeePerUnit = Input.absent();
        private Input<ModelIntInput> planFeeProRataPerUnit = Input.absent();
        private Input<ModelStringInput> period = Input.absent();
        private Input<ModelIntInput> amount = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelIntInput> numberOfUnits = Input.absent();
        private Input<ModelIntInput> numberOfFreeUnits = Input.absent();
        private Input<ModelStringInput> unitType = Input.absent();
        private Input<ModelStringInput> subscriptionPaymentStatus = Input.absent();
        private Input<ModelStringInput> subscriptionStartDate = Input.absent();
        private Input<ModelStringInput> subscriptionEndDate = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelProductPlanSubscriptionFilterInput>> and = Input.absent();
        private Input<List<ModelProductPlanSubscriptionFilterInput>> or = Input.absent();
        private Input<ModelProductPlanSubscriptionFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder addedById(ModelIDInput modelIDInput) {
            this.addedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder amount(ModelIntInput modelIntInput) {
            this.amount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder and(List<ModelProductPlanSubscriptionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductPlanSubscriptionFilterInput build() {
            return new ModelProductPlanSubscriptionFilterInput(this.id, this.accountId, this.addedById, this.productAccountId, this.productPlanId, this.planDescription, this.planStatus, this.planFeePerUnit, this.planFeeProRataPerUnit, this.period, this.amount, this.currency, this.status, this.numberOfUnits, this.numberOfFreeUnits, this.unitType, this.subscriptionPaymentStatus, this.subscriptionStartDate, this.subscriptionEndDate, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder currency(ModelStringInput modelStringInput) {
            this.currency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelProductPlanSubscriptionFilterInput modelProductPlanSubscriptionFilterInput) {
            this.not = Input.fromNullable(modelProductPlanSubscriptionFilterInput);
            return this;
        }

        public Builder numberOfFreeUnits(ModelIntInput modelIntInput) {
            this.numberOfFreeUnits = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder numberOfUnits(ModelIntInput modelIntInput) {
            this.numberOfUnits = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder or(List<ModelProductPlanSubscriptionFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder period(ModelStringInput modelStringInput) {
            this.period = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder planDescription(ModelStringInput modelStringInput) {
            this.planDescription = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder planFeePerUnit(ModelIntInput modelIntInput) {
            this.planFeePerUnit = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder planFeeProRataPerUnit(ModelIntInput modelIntInput) {
            this.planFeeProRataPerUnit = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder planStatus(ModelStringInput modelStringInput) {
            this.planStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder productAccountId(ModelIDInput modelIDInput) {
            this.productAccountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder productPlanId(ModelIDInput modelIDInput) {
            this.productPlanId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder subscriptionEndDate(ModelStringInput modelStringInput) {
            this.subscriptionEndDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder subscriptionPaymentStatus(ModelStringInput modelStringInput) {
            this.subscriptionPaymentStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder subscriptionStartDate(ModelStringInput modelStringInput) {
            this.subscriptionStartDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder unitType(ModelStringInput modelStringInput) {
            this.unitType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelProductPlanSubscriptionFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelIntInput> input8, Input<ModelIntInput> input9, Input<ModelStringInput> input10, Input<ModelIntInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIntInput> input14, Input<ModelIntInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<List<ModelProductPlanSubscriptionFilterInput>> input22, Input<List<ModelProductPlanSubscriptionFilterInput>> input23, Input<ModelProductPlanSubscriptionFilterInput> input24) {
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

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelIDInput addedById() {
        return this.addedById.value;
    }

    public ModelIntInput amount() {
        return this.amount.value;
    }

    public List<ModelProductPlanSubscriptionFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput currency() {
        return this.currency.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductPlanSubscriptionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductPlanSubscriptionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelProductPlanSubscriptionFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelProductPlanSubscriptionFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductPlanSubscriptionFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductPlanSubscriptionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelProductPlanSubscriptionFilterInput.this.addedById.value != 0 ? ((ModelIDInput) ModelProductPlanSubscriptionFilterInput.this.addedById.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.productAccountId.defined) {
                    inputFieldWriter.writeObject("productAccountId", ModelProductPlanSubscriptionFilterInput.this.productAccountId.value != 0 ? ((ModelIDInput) ModelProductPlanSubscriptionFilterInput.this.productAccountId.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.productPlanId.defined) {
                    inputFieldWriter.writeObject("productPlanId", ModelProductPlanSubscriptionFilterInput.this.productPlanId.value != 0 ? ((ModelIDInput) ModelProductPlanSubscriptionFilterInput.this.productPlanId.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.planDescription.defined) {
                    inputFieldWriter.writeObject("planDescription", ModelProductPlanSubscriptionFilterInput.this.planDescription.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.planDescription.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.planStatus.defined) {
                    inputFieldWriter.writeObject("planStatus", ModelProductPlanSubscriptionFilterInput.this.planStatus.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.planStatus.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.planFeePerUnit.defined) {
                    inputFieldWriter.writeObject("planFeePerUnit", ModelProductPlanSubscriptionFilterInput.this.planFeePerUnit.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionFilterInput.this.planFeePerUnit.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.planFeeProRataPerUnit.defined) {
                    inputFieldWriter.writeObject("planFeeProRataPerUnit", ModelProductPlanSubscriptionFilterInput.this.planFeeProRataPerUnit.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionFilterInput.this.planFeeProRataPerUnit.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.period.defined) {
                    inputFieldWriter.writeObject("period", ModelProductPlanSubscriptionFilterInput.this.period.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.period.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelProductPlanSubscriptionFilterInput.this.amount.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionFilterInput.this.amount.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelProductPlanSubscriptionFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelProductPlanSubscriptionFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.numberOfUnits.defined) {
                    inputFieldWriter.writeObject("numberOfUnits", ModelProductPlanSubscriptionFilterInput.this.numberOfUnits.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionFilterInput.this.numberOfUnits.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.numberOfFreeUnits.defined) {
                    inputFieldWriter.writeObject("numberOfFreeUnits", ModelProductPlanSubscriptionFilterInput.this.numberOfFreeUnits.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionFilterInput.this.numberOfFreeUnits.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.unitType.defined) {
                    inputFieldWriter.writeObject("unitType", ModelProductPlanSubscriptionFilterInput.this.unitType.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.unitType.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.subscriptionPaymentStatus.defined) {
                    inputFieldWriter.writeObject("subscriptionPaymentStatus", ModelProductPlanSubscriptionFilterInput.this.subscriptionPaymentStatus.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.subscriptionPaymentStatus.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.subscriptionStartDate.defined) {
                    inputFieldWriter.writeObject("subscriptionStartDate", ModelProductPlanSubscriptionFilterInput.this.subscriptionStartDate.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.subscriptionStartDate.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.subscriptionEndDate.defined) {
                    inputFieldWriter.writeObject("subscriptionEndDate", ModelProductPlanSubscriptionFilterInput.this.subscriptionEndDate.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.subscriptionEndDate.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductPlanSubscriptionFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductPlanSubscriptionFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductPlanSubscriptionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductPlanSubscriptionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductPlanSubscriptionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductPlanSubscriptionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductPlanSubscriptionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductPlanSubscriptionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductPlanSubscriptionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductPlanSubscriptionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductPlanSubscriptionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductPlanSubscriptionFilterInput.this.not.value != 0 ? ((ModelProductPlanSubscriptionFilterInput) ModelProductPlanSubscriptionFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelProductPlanSubscriptionFilterInput not() {
        return this.not.value;
    }

    public ModelIntInput numberOfFreeUnits() {
        return this.numberOfFreeUnits.value;
    }

    public ModelIntInput numberOfUnits() {
        return this.numberOfUnits.value;
    }

    public List<ModelProductPlanSubscriptionFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput period() {
        return this.period.value;
    }

    public ModelStringInput planDescription() {
        return this.planDescription.value;
    }

    public ModelIntInput planFeePerUnit() {
        return this.planFeePerUnit.value;
    }

    public ModelIntInput planFeeProRataPerUnit() {
        return this.planFeeProRataPerUnit.value;
    }

    public ModelStringInput planStatus() {
        return this.planStatus.value;
    }

    public ModelIDInput productAccountId() {
        return this.productAccountId.value;
    }

    public ModelIDInput productPlanId() {
        return this.productPlanId.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput subscriptionEndDate() {
        return this.subscriptionEndDate.value;
    }

    public ModelStringInput subscriptionPaymentStatus() {
        return this.subscriptionPaymentStatus.value;
    }

    public ModelStringInput subscriptionStartDate() {
        return this.subscriptionStartDate.value;
    }

    public ModelStringInput unitType() {
        return this.unitType.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
