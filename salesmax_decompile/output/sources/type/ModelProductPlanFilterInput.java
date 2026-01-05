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
public final class ModelProductPlanFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductPlanFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> currency;
    private final Input<ModelIntInput> fee;
    private final Input<ModelIDInput> id;
    private final Input<ModelProductPlanFilterInput> not;
    private final Input<List<ModelProductPlanFilterInput>> or;
    private final Input<ModelStringInput> period;
    private final Input<ModelStringInput> planDescription;
    private final Input<ModelStringInput> planStatus;
    private final Input<ModelIntInput> proRataFee;
    private final Input<ModelIDInput> productId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelProductPlanFilterInput>> and = Input.absent();
        private Input<List<ModelProductPlanFilterInput>> or = Input.absent();
        private Input<ModelProductPlanFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductPlanFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductPlanFilterInput build() {
            return new ModelProductPlanFilterInput(this.id, this.accountId, this.productId, this.planDescription, this.planStatus, this.period, this.fee, this.proRataFee, this.currency, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelProductPlanFilterInput modelProductPlanFilterInput) {
            this.not = Input.fromNullable(modelProductPlanFilterInput);
            return this;
        }

        public Builder or(List<ModelProductPlanFilterInput> list) {
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

    public ModelProductPlanFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIntInput> input7, Input<ModelIntInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<List<ModelProductPlanFilterInput>> input12, Input<List<ModelProductPlanFilterInput>> input13, Input<ModelProductPlanFilterInput> input14) {
        this.id = input;
        this.accountId = input2;
        this.productId = input3;
        this.planDescription = input4;
        this.planStatus = input5;
        this.period = input6;
        this.fee = input7;
        this.proRataFee = input8;
        this.currency = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
        this.and = input12;
        this.or = input13;
        this.not = input14;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelProductPlanFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductPlanFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductPlanFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelProductPlanFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelProductPlanFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductPlanFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductPlanFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", ModelProductPlanFilterInput.this.productId.value != 0 ? ((ModelIDInput) ModelProductPlanFilterInput.this.productId.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.planDescription.defined) {
                    inputFieldWriter.writeObject("planDescription", ModelProductPlanFilterInput.this.planDescription.value != 0 ? ((ModelStringInput) ModelProductPlanFilterInput.this.planDescription.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.planStatus.defined) {
                    inputFieldWriter.writeObject("planStatus", ModelProductPlanFilterInput.this.planStatus.value != 0 ? ((ModelStringInput) ModelProductPlanFilterInput.this.planStatus.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.period.defined) {
                    inputFieldWriter.writeObject("period", ModelProductPlanFilterInput.this.period.value != 0 ? ((ModelStringInput) ModelProductPlanFilterInput.this.period.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.fee.defined) {
                    inputFieldWriter.writeObject("fee", ModelProductPlanFilterInput.this.fee.value != 0 ? ((ModelIntInput) ModelProductPlanFilterInput.this.fee.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.proRataFee.defined) {
                    inputFieldWriter.writeObject("proRataFee", ModelProductPlanFilterInput.this.proRataFee.value != 0 ? ((ModelIntInput) ModelProductPlanFilterInput.this.proRataFee.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelProductPlanFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelProductPlanFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductPlanFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductPlanFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductPlanFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductPlanFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductPlanFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductPlanFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductPlanFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductPlanFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductPlanFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductPlanFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductPlanFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductPlanFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductPlanFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductPlanFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductPlanFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductPlanFilterInput.this.not.value != 0 ? ((ModelProductPlanFilterInput) ModelProductPlanFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelProductPlanFilterInput not() {
        return this.not.value;
    }

    public List<ModelProductPlanFilterInput> or() {
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
