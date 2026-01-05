package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductAccountBillsConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductAccountBillsConditionInput>> and;
    private final Input<ModelStringInput> billGeneratedFrom;
    private final Input<ModelStringInput> billGeneratedTo;
    private final Input<ModelStringInput> billStatus;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> currency;
    private final Input<ModelProductAccountBillsConditionInput> not;
    private final Input<List<ModelProductAccountBillsConditionInput>> or;
    private final Input<ModelIDInput> productAccountId;
    private final Input<ModelIDInput> productPlanId;
    private final Input<ModelIntInput> totalFees;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
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
        private Input<List<ModelProductAccountBillsConditionInput>> and = Input.absent();
        private Input<List<ModelProductAccountBillsConditionInput>> or = Input.absent();
        private Input<ModelProductAccountBillsConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductAccountBillsConditionInput> list) {
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

        public ModelProductAccountBillsConditionInput build() {
            return new ModelProductAccountBillsConditionInput(this.accountId, this.productAccountId, this.productPlanId, this.totalFees, this.currency, this.billStatus, this.billGeneratedFrom, this.billGeneratedTo, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder currency(ModelStringInput modelStringInput) {
            this.currency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelProductAccountBillsConditionInput modelProductAccountBillsConditionInput) {
            this.not = Input.fromNullable(modelProductAccountBillsConditionInput);
            return this;
        }

        public Builder or(List<ModelProductAccountBillsConditionInput> list) {
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

    public ModelProductAccountBillsConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIntInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<List<ModelProductAccountBillsConditionInput>> input11, Input<List<ModelProductAccountBillsConditionInput>> input12, Input<ModelProductAccountBillsConditionInput> input13) {
        this.accountId = input;
        this.productAccountId = input2;
        this.productPlanId = input3;
        this.totalFees = input4;
        this.currency = input5;
        this.billStatus = input6;
        this.billGeneratedFrom = input7;
        this.billGeneratedTo = input8;
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

    public List<ModelProductAccountBillsConditionInput> and() {
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductAccountBillsConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductAccountBillsConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductAccountBillsConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductAccountBillsConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.productAccountId.defined) {
                    inputFieldWriter.writeObject("productAccountId", ModelProductAccountBillsConditionInput.this.productAccountId.value != 0 ? ((ModelIDInput) ModelProductAccountBillsConditionInput.this.productAccountId.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.productPlanId.defined) {
                    inputFieldWriter.writeObject("productPlanId", ModelProductAccountBillsConditionInput.this.productPlanId.value != 0 ? ((ModelIDInput) ModelProductAccountBillsConditionInput.this.productPlanId.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.totalFees.defined) {
                    inputFieldWriter.writeObject("totalFees", ModelProductAccountBillsConditionInput.this.totalFees.value != 0 ? ((ModelIntInput) ModelProductAccountBillsConditionInput.this.totalFees.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelProductAccountBillsConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelProductAccountBillsConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.billStatus.defined) {
                    inputFieldWriter.writeObject("billStatus", ModelProductAccountBillsConditionInput.this.billStatus.value != 0 ? ((ModelStringInput) ModelProductAccountBillsConditionInput.this.billStatus.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.billGeneratedFrom.defined) {
                    inputFieldWriter.writeObject("billGeneratedFrom", ModelProductAccountBillsConditionInput.this.billGeneratedFrom.value != 0 ? ((ModelStringInput) ModelProductAccountBillsConditionInput.this.billGeneratedFrom.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.billGeneratedTo.defined) {
                    inputFieldWriter.writeObject("billGeneratedTo", ModelProductAccountBillsConditionInput.this.billGeneratedTo.value != 0 ? ((ModelStringInput) ModelProductAccountBillsConditionInput.this.billGeneratedTo.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductAccountBillsConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductAccountBillsConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductAccountBillsConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductAccountBillsConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductAccountBillsConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductAccountBillsConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductAccountBillsConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductAccountBillsConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductAccountBillsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductAccountBillsConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductAccountBillsConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductAccountBillsConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductAccountBillsConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductAccountBillsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductAccountBillsConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductAccountBillsConditionInput.this.not.value != 0 ? ((ModelProductAccountBillsConditionInput) ModelProductAccountBillsConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelProductAccountBillsConditionInput not() {
        return this.not.value;
    }

    public List<ModelProductAccountBillsConditionInput> or() {
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
