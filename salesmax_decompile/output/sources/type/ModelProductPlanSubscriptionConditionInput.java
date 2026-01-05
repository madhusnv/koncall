package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductPlanSubscriptionConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> addedById;
    private final Input<ModelIntInput> amount;
    private final Input<List<ModelProductPlanSubscriptionConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> currency;
    private final Input<ModelProductPlanSubscriptionConditionInput> not;
    private final Input<ModelIntInput> numberOfFreeUnits;
    private final Input<ModelIntInput> numberOfUnits;
    private final Input<List<ModelProductPlanSubscriptionConditionInput>> or;
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
        private Input<List<ModelProductPlanSubscriptionConditionInput>> and = Input.absent();
        private Input<List<ModelProductPlanSubscriptionConditionInput>> or = Input.absent();
        private Input<ModelProductPlanSubscriptionConditionInput> not = Input.absent();

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

        public Builder and(List<ModelProductPlanSubscriptionConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductPlanSubscriptionConditionInput build() {
            return new ModelProductPlanSubscriptionConditionInput(this.accountId, this.addedById, this.productAccountId, this.productPlanId, this.planDescription, this.planStatus, this.planFeePerUnit, this.planFeeProRataPerUnit, this.period, this.amount, this.currency, this.status, this.numberOfUnits, this.numberOfFreeUnits, this.unitType, this.subscriptionPaymentStatus, this.subscriptionStartDate, this.subscriptionEndDate, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder currency(ModelStringInput modelStringInput) {
            this.currency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelProductPlanSubscriptionConditionInput modelProductPlanSubscriptionConditionInput) {
            this.not = Input.fromNullable(modelProductPlanSubscriptionConditionInput);
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

        public Builder or(List<ModelProductPlanSubscriptionConditionInput> list) {
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

    public ModelProductPlanSubscriptionConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIntInput> input7, Input<ModelIntInput> input8, Input<ModelStringInput> input9, Input<ModelIntInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIntInput> input13, Input<ModelIntInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<List<ModelProductPlanSubscriptionConditionInput>> input21, Input<List<ModelProductPlanSubscriptionConditionInput>> input22, Input<ModelProductPlanSubscriptionConditionInput> input23) {
        this.accountId = input;
        this.addedById = input2;
        this.productAccountId = input3;
        this.productPlanId = input4;
        this.planDescription = input5;
        this.planStatus = input6;
        this.planFeePerUnit = input7;
        this.planFeeProRataPerUnit = input8;
        this.period = input9;
        this.amount = input10;
        this.currency = input11;
        this.status = input12;
        this.numberOfUnits = input13;
        this.numberOfFreeUnits = input14;
        this.unitType = input15;
        this.subscriptionPaymentStatus = input16;
        this.subscriptionStartDate = input17;
        this.subscriptionEndDate = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
        this.and = input21;
        this.or = input22;
        this.not = input23;
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

    public List<ModelProductPlanSubscriptionConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput currency() {
        return this.currency.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductPlanSubscriptionConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductPlanSubscriptionConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductPlanSubscriptionConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductPlanSubscriptionConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelProductPlanSubscriptionConditionInput.this.addedById.value != 0 ? ((ModelIDInput) ModelProductPlanSubscriptionConditionInput.this.addedById.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.productAccountId.defined) {
                    inputFieldWriter.writeObject("productAccountId", ModelProductPlanSubscriptionConditionInput.this.productAccountId.value != 0 ? ((ModelIDInput) ModelProductPlanSubscriptionConditionInput.this.productAccountId.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.productPlanId.defined) {
                    inputFieldWriter.writeObject("productPlanId", ModelProductPlanSubscriptionConditionInput.this.productPlanId.value != 0 ? ((ModelIDInput) ModelProductPlanSubscriptionConditionInput.this.productPlanId.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.planDescription.defined) {
                    inputFieldWriter.writeObject("planDescription", ModelProductPlanSubscriptionConditionInput.this.planDescription.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.planDescription.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.planStatus.defined) {
                    inputFieldWriter.writeObject("planStatus", ModelProductPlanSubscriptionConditionInput.this.planStatus.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.planStatus.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.planFeePerUnit.defined) {
                    inputFieldWriter.writeObject("planFeePerUnit", ModelProductPlanSubscriptionConditionInput.this.planFeePerUnit.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionConditionInput.this.planFeePerUnit.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.planFeeProRataPerUnit.defined) {
                    inputFieldWriter.writeObject("planFeeProRataPerUnit", ModelProductPlanSubscriptionConditionInput.this.planFeeProRataPerUnit.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionConditionInput.this.planFeeProRataPerUnit.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.period.defined) {
                    inputFieldWriter.writeObject("period", ModelProductPlanSubscriptionConditionInput.this.period.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.period.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelProductPlanSubscriptionConditionInput.this.amount.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionConditionInput.this.amount.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelProductPlanSubscriptionConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelProductPlanSubscriptionConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.numberOfUnits.defined) {
                    inputFieldWriter.writeObject("numberOfUnits", ModelProductPlanSubscriptionConditionInput.this.numberOfUnits.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionConditionInput.this.numberOfUnits.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.numberOfFreeUnits.defined) {
                    inputFieldWriter.writeObject("numberOfFreeUnits", ModelProductPlanSubscriptionConditionInput.this.numberOfFreeUnits.value != 0 ? ((ModelIntInput) ModelProductPlanSubscriptionConditionInput.this.numberOfFreeUnits.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.unitType.defined) {
                    inputFieldWriter.writeObject("unitType", ModelProductPlanSubscriptionConditionInput.this.unitType.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.unitType.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.subscriptionPaymentStatus.defined) {
                    inputFieldWriter.writeObject("subscriptionPaymentStatus", ModelProductPlanSubscriptionConditionInput.this.subscriptionPaymentStatus.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.subscriptionPaymentStatus.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.subscriptionStartDate.defined) {
                    inputFieldWriter.writeObject("subscriptionStartDate", ModelProductPlanSubscriptionConditionInput.this.subscriptionStartDate.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.subscriptionStartDate.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.subscriptionEndDate.defined) {
                    inputFieldWriter.writeObject("subscriptionEndDate", ModelProductPlanSubscriptionConditionInput.this.subscriptionEndDate.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.subscriptionEndDate.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductPlanSubscriptionConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductPlanSubscriptionConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductPlanSubscriptionConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductPlanSubscriptionConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductPlanSubscriptionConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductPlanSubscriptionConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductPlanSubscriptionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductPlanSubscriptionConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductPlanSubscriptionConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductPlanSubscriptionConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductPlanSubscriptionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductPlanSubscriptionConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductPlanSubscriptionConditionInput.this.not.value != 0 ? ((ModelProductPlanSubscriptionConditionInput) ModelProductPlanSubscriptionConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelProductPlanSubscriptionConditionInput not() {
        return this.not.value;
    }

    public ModelIntInput numberOfFreeUnits() {
        return this.numberOfFreeUnits.value;
    }

    public ModelIntInput numberOfUnits() {
        return this.numberOfUnits.value;
    }

    public List<ModelProductPlanSubscriptionConditionInput> or() {
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
