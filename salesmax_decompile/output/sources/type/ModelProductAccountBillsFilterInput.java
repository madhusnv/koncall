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
public final class ModelProductAccountBillsFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductAccountBillsFilterInput>> and;
    private final Input<ModelStringInput> billGeneratedFrom;
    private final Input<ModelStringInput> billGeneratedTo;
    private final Input<ModelStringInput> billStatus;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> currency;
    private final Input<ModelIDInput> id;
    private final Input<ModelProductAccountBillsFilterInput> not;
    private final Input<List<ModelProductAccountBillsFilterInput>> or;
    private final Input<ModelIDInput> productAccountId;
    private final Input<ModelIDInput> productPlanId;
    private final Input<ModelIntInput> totalFees;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> productAccountId = Input.absent();
        private Input<ModelIDInput> productPlanId = Input.absent();
        private Input<ModelIntInput> totalFees = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelStringInput> billStatus = Input.absent();
        private Input<ModelStringInput> billGeneratedFrom = Input.absent();
        private Input<ModelStringInput> billGeneratedTo = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelProductAccountBillsFilterInput>> and = Input.absent();
        private Input<List<ModelProductAccountBillsFilterInput>> or = Input.absent();
        private Input<ModelProductAccountBillsFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductAccountBillsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder billGeneratedFrom(ModelStringInput modelStringInput) {
            this.billGeneratedFrom = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder billGeneratedTo(ModelStringInput modelStringInput) {
            this.billGeneratedTo = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder billStatus(ModelStringInput modelStringInput) {
            this.billStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelProductAccountBillsFilterInput build() {
            return new ModelProductAccountBillsFilterInput(this.id, this.accountId, this.productAccountId, this.productPlanId, this.totalFees, this.currency, this.billStatus, this.billGeneratedFrom, this.billGeneratedTo, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelProductAccountBillsFilterInput modelProductAccountBillsFilterInput) {
            this.not = Input.fromNullable(modelProductAccountBillsFilterInput);
            return this;
        }

        public Builder or(List<ModelProductAccountBillsFilterInput> list) {
            this.or = Input.fromNullable(list);
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

        public Builder totalFees(ModelIntInput modelIntInput) {
            this.totalFees = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelProductAccountBillsFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIntInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<List<ModelProductAccountBillsFilterInput>> input12, Input<List<ModelProductAccountBillsFilterInput>> input13, Input<ModelProductAccountBillsFilterInput> input14) {
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

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelProductAccountBillsFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput billGeneratedFrom() {
        return this.billGeneratedFrom.value;
    }

    public ModelStringInput billGeneratedTo() {
        return this.billGeneratedTo.value;
    }

    public ModelStringInput billStatus() {
        return this.billStatus.value;
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
        return new InputFieldMarshaller() { // from class: type.ModelProductAccountBillsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductAccountBillsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelProductAccountBillsFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelProductAccountBillsFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductAccountBillsFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductAccountBillsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.productAccountId.defined) {
                    inputFieldWriter.writeObject("productAccountId", ModelProductAccountBillsFilterInput.this.productAccountId.value != 0 ? ((ModelIDInput) ModelProductAccountBillsFilterInput.this.productAccountId.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.productPlanId.defined) {
                    inputFieldWriter.writeObject("productPlanId", ModelProductAccountBillsFilterInput.this.productPlanId.value != 0 ? ((ModelIDInput) ModelProductAccountBillsFilterInput.this.productPlanId.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.totalFees.defined) {
                    inputFieldWriter.writeObject("totalFees", ModelProductAccountBillsFilterInput.this.totalFees.value != 0 ? ((ModelIntInput) ModelProductAccountBillsFilterInput.this.totalFees.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelProductAccountBillsFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelProductAccountBillsFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.billStatus.defined) {
                    inputFieldWriter.writeObject("billStatus", ModelProductAccountBillsFilterInput.this.billStatus.value != 0 ? ((ModelStringInput) ModelProductAccountBillsFilterInput.this.billStatus.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.billGeneratedFrom.defined) {
                    inputFieldWriter.writeObject("billGeneratedFrom", ModelProductAccountBillsFilterInput.this.billGeneratedFrom.value != 0 ? ((ModelStringInput) ModelProductAccountBillsFilterInput.this.billGeneratedFrom.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.billGeneratedTo.defined) {
                    inputFieldWriter.writeObject("billGeneratedTo", ModelProductAccountBillsFilterInput.this.billGeneratedTo.value != 0 ? ((ModelStringInput) ModelProductAccountBillsFilterInput.this.billGeneratedTo.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductAccountBillsFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductAccountBillsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductAccountBillsFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductAccountBillsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductAccountBillsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductAccountBillsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductAccountBillsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductAccountBillsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductAccountBillsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductAccountBillsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductAccountBillsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductAccountBillsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductAccountBillsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductAccountBillsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductAccountBillsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductAccountBillsFilterInput.this.not.value != 0 ? ((ModelProductAccountBillsFilterInput) ModelProductAccountBillsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelProductAccountBillsFilterInput not() {
        return this.not.value;
    }

    public List<ModelProductAccountBillsFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput productAccountId() {
        return this.productAccountId.value;
    }

    public ModelIDInput productPlanId() {
        return this.productPlanId.value;
    }

    public ModelIntInput totalFees() {
        return this.totalFees.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
