package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountSubscriptionBillCycleConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> addedById;
    private final Input<List<ModelAccountSubscriptionBillCycleConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> lastBillDate;
    private final Input<ModelStringInput> nextBillDate;
    private final Input<ModelAccountSubscriptionBillCycleConditionInput> not;
    private final Input<List<ModelAccountSubscriptionBillCycleConditionInput>> or;
    private final Input<ModelStringInput> period;
    private final Input<ModelIDInput> productAccountId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> productAccountId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> addedById = Input.absent();
        private Input<ModelStringInput> period = Input.absent();
        private Input<ModelStringInput> lastBillDate = Input.absent();
        private Input<ModelStringInput> nextBillDate = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelAccountSubscriptionBillCycleConditionInput>> and = Input.absent();
        private Input<List<ModelAccountSubscriptionBillCycleConditionInput>> or = Input.absent();
        private Input<ModelAccountSubscriptionBillCycleConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder addedById(ModelIDInput modelIDInput) {
            this.addedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelAccountSubscriptionBillCycleConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelAccountSubscriptionBillCycleConditionInput build() {
            return new ModelAccountSubscriptionBillCycleConditionInput(this.productAccountId, this.accountId, this.addedById, this.period, this.lastBillDate, this.nextBillDate, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastBillDate(ModelStringInput modelStringInput) {
            this.lastBillDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder nextBillDate(ModelStringInput modelStringInput) {
            this.nextBillDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelAccountSubscriptionBillCycleConditionInput modelAccountSubscriptionBillCycleConditionInput) {
            this.not = Input.fromNullable(modelAccountSubscriptionBillCycleConditionInput);
            return this;
        }

        public Builder or(List<ModelAccountSubscriptionBillCycleConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder period(ModelStringInput modelStringInput) {
            this.period = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder productAccountId(ModelIDInput modelIDInput) {
            this.productAccountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelAccountSubscriptionBillCycleConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelAccountSubscriptionBillCycleConditionInput>> input9, Input<List<ModelAccountSubscriptionBillCycleConditionInput>> input10, Input<ModelAccountSubscriptionBillCycleConditionInput> input11) {
        this.productAccountId = input;
        this.accountId = input2;
        this.addedById = input3;
        this.period = input4;
        this.lastBillDate = input5;
        this.nextBillDate = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
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

    public List<ModelAccountSubscriptionBillCycleConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput lastBillDate() {
        return this.lastBillDate.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountSubscriptionBillCycleConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountSubscriptionBillCycleConditionInput.this.productAccountId.defined) {
                    inputFieldWriter.writeObject("productAccountId", ModelAccountSubscriptionBillCycleConditionInput.this.productAccountId.value != 0 ? ((ModelIDInput) ModelAccountSubscriptionBillCycleConditionInput.this.productAccountId.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelAccountSubscriptionBillCycleConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelAccountSubscriptionBillCycleConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelAccountSubscriptionBillCycleConditionInput.this.addedById.value != 0 ? ((ModelIDInput) ModelAccountSubscriptionBillCycleConditionInput.this.addedById.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.period.defined) {
                    inputFieldWriter.writeObject("period", ModelAccountSubscriptionBillCycleConditionInput.this.period.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleConditionInput.this.period.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.lastBillDate.defined) {
                    inputFieldWriter.writeObject("lastBillDate", ModelAccountSubscriptionBillCycleConditionInput.this.lastBillDate.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleConditionInput.this.lastBillDate.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.nextBillDate.defined) {
                    inputFieldWriter.writeObject("nextBillDate", ModelAccountSubscriptionBillCycleConditionInput.this.nextBillDate.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleConditionInput.this.nextBillDate.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountSubscriptionBillCycleConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountSubscriptionBillCycleConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountSubscriptionBillCycleConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountSubscriptionBillCycleConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountSubscriptionBillCycleConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountSubscriptionBillCycleConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountSubscriptionBillCycleConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountSubscriptionBillCycleConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountSubscriptionBillCycleConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountSubscriptionBillCycleConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountSubscriptionBillCycleConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountSubscriptionBillCycleConditionInput.this.not.value != 0 ? ((ModelAccountSubscriptionBillCycleConditionInput) ModelAccountSubscriptionBillCycleConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput nextBillDate() {
        return this.nextBillDate.value;
    }

    public ModelAccountSubscriptionBillCycleConditionInput not() {
        return this.not.value;
    }

    public List<ModelAccountSubscriptionBillCycleConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput period() {
        return this.period.value;
    }

    public ModelIDInput productAccountId() {
        return this.productAccountId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
