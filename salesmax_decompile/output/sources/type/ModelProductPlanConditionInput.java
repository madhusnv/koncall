package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductPlanConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductPlanConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> currency;
    private final Input<ModelIntInput> fee;
    private final Input<ModelProductPlanConditionInput> not;
    private final Input<List<ModelProductPlanConditionInput>> or;
    private final Input<ModelStringInput> period;
    private final Input<ModelStringInput> planDescription;
    private final Input<ModelStringInput> planStatus;
    private final Input<ModelIntInput> proRataFee;
    private final Input<ModelIDInput> productId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> productId = Input.absent();
        private Input<ModelStringInput> planDescription = Input.absent();
        private Input<ModelStringInput> planStatus = Input.absent();
        private Input<ModelStringInput> period = Input.absent();
        private Input<ModelIntInput> fee = Input.absent();
        private Input<ModelIntInput> proRataFee = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelProductPlanConditionInput>> and = Input.absent();
        private Input<List<ModelProductPlanConditionInput>> or = Input.absent();
        private Input<ModelProductPlanConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductPlanConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductPlanConditionInput build() {
            return new ModelProductPlanConditionInput(this.accountId, this.productId, this.planDescription, this.planStatus, this.period, this.fee, this.proRataFee, this.currency, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder currency(ModelStringInput modelStringInput) {
            this.currency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fee(ModelIntInput modelIntInput) {
            this.fee = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder not(ModelProductPlanConditionInput modelProductPlanConditionInput) {
            this.not = Input.fromNullable(modelProductPlanConditionInput);
            return this;
        }

        public Builder or(List<ModelProductPlanConditionInput> list) {
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

        public Builder planStatus(ModelStringInput modelStringInput) {
            this.planStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder proRataFee(ModelIntInput modelIntInput) {
            this.proRataFee = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder productId(ModelIDInput modelIDInput) {
            this.productId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelProductPlanConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIntInput> input6, Input<ModelIntInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<List<ModelProductPlanConditionInput>> input11, Input<List<ModelProductPlanConditionInput>> input12, Input<ModelProductPlanConditionInput> input13) {
        this.accountId = input;
        this.productId = input2;
        this.planDescription = input3;
        this.planStatus = input4;
        this.period = input5;
        this.fee = input6;
        this.proRataFee = input7;
        this.currency = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
        this.and = input11;
        this.or = input12;
        this.not = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelProductPlanConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput currency() {
        return this.currency.value;
    }

    public ModelIntInput fee() {
        return this.fee.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductPlanConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductPlanConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductPlanConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductPlanConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", ModelProductPlanConditionInput.this.productId.value != 0 ? ((ModelIDInput) ModelProductPlanConditionInput.this.productId.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.planDescription.defined) {
                    inputFieldWriter.writeObject("planDescription", ModelProductPlanConditionInput.this.planDescription.value != 0 ? ((ModelStringInput) ModelProductPlanConditionInput.this.planDescription.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.planStatus.defined) {
                    inputFieldWriter.writeObject("planStatus", ModelProductPlanConditionInput.this.planStatus.value != 0 ? ((ModelStringInput) ModelProductPlanConditionInput.this.planStatus.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.period.defined) {
                    inputFieldWriter.writeObject("period", ModelProductPlanConditionInput.this.period.value != 0 ? ((ModelStringInput) ModelProductPlanConditionInput.this.period.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.fee.defined) {
                    inputFieldWriter.writeObject("fee", ModelProductPlanConditionInput.this.fee.value != 0 ? ((ModelIntInput) ModelProductPlanConditionInput.this.fee.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.proRataFee.defined) {
                    inputFieldWriter.writeObject("proRataFee", ModelProductPlanConditionInput.this.proRataFee.value != 0 ? ((ModelIntInput) ModelProductPlanConditionInput.this.proRataFee.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelProductPlanConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelProductPlanConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductPlanConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductPlanConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductPlanConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductPlanConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductPlanConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductPlanConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductPlanConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductPlanConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductPlanConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductPlanConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductPlanConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductPlanConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductPlanConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductPlanConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductPlanConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductPlanConditionInput.this.not.value != 0 ? ((ModelProductPlanConditionInput) ModelProductPlanConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelProductPlanConditionInput not() {
        return this.not.value;
    }

    public List<ModelProductPlanConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput period() {
        return this.period.value;
    }

    public ModelStringInput planDescription() {
        return this.planDescription.value;
    }

    public ModelStringInput planStatus() {
        return this.planStatus.value;
    }

    public ModelIntInput proRataFee() {
        return this.proRataFee.value;
    }

    public ModelIDInput productId() {
        return this.productId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
