package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountSubscriptionBillCycleFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> addedById;
    private final Input<List<ModelAccountSubscriptionBillCycleFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> lastBillDate;
    private final Input<ModelStringInput> nextBillDate;
    private final Input<ModelAccountSubscriptionBillCycleFilterInput> not;
    private final Input<List<ModelAccountSubscriptionBillCycleFilterInput>> or;
    private final Input<ModelStringInput> period;
    private final Input<ModelIDInput> productAccountId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> productAccountId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> addedById = Input.absent();
        private Input<ModelStringInput> period = Input.absent();
        private Input<ModelStringInput> lastBillDate = Input.absent();
        private Input<ModelStringInput> nextBillDate = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelAccountSubscriptionBillCycleFilterInput>> and = Input.absent();
        private Input<List<ModelAccountSubscriptionBillCycleFilterInput>> or = Input.absent();
        private Input<ModelAccountSubscriptionBillCycleFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder addedById(ModelIDInput modelIDInput) {
            this.addedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelAccountSubscriptionBillCycleFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelAccountSubscriptionBillCycleFilterInput build() {
            return new ModelAccountSubscriptionBillCycleFilterInput(this.id, this.productAccountId, this.accountId, this.addedById, this.period, this.lastBillDate, this.nextBillDate, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelAccountSubscriptionBillCycleFilterInput modelAccountSubscriptionBillCycleFilterInput) {
            this.not = Input.fromNullable(modelAccountSubscriptionBillCycleFilterInput);
            return this;
        }

        public Builder or(List<ModelAccountSubscriptionBillCycleFilterInput> list) {
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

    public ModelAccountSubscriptionBillCycleFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelAccountSubscriptionBillCycleFilterInput>> input10, Input<List<ModelAccountSubscriptionBillCycleFilterInput>> input11, Input<ModelAccountSubscriptionBillCycleFilterInput> input12) {
        this.id = input;
        this.productAccountId = input2;
        this.accountId = input3;
        this.addedById = input4;
        this.period = input5;
        this.lastBillDate = input6;
        this.nextBillDate = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
        this.and = input10;
        this.or = input11;
        this.not = input12;
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

    public List<ModelAccountSubscriptionBillCycleFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput lastBillDate() {
        return this.lastBillDate.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountSubscriptionBillCycleFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountSubscriptionBillCycleFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelAccountSubscriptionBillCycleFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelAccountSubscriptionBillCycleFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.productAccountId.defined) {
                    inputFieldWriter.writeObject("productAccountId", ModelAccountSubscriptionBillCycleFilterInput.this.productAccountId.value != 0 ? ((ModelIDInput) ModelAccountSubscriptionBillCycleFilterInput.this.productAccountId.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelAccountSubscriptionBillCycleFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelAccountSubscriptionBillCycleFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelAccountSubscriptionBillCycleFilterInput.this.addedById.value != 0 ? ((ModelIDInput) ModelAccountSubscriptionBillCycleFilterInput.this.addedById.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.period.defined) {
                    inputFieldWriter.writeObject("period", ModelAccountSubscriptionBillCycleFilterInput.this.period.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleFilterInput.this.period.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.lastBillDate.defined) {
                    inputFieldWriter.writeObject("lastBillDate", ModelAccountSubscriptionBillCycleFilterInput.this.lastBillDate.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleFilterInput.this.lastBillDate.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.nextBillDate.defined) {
                    inputFieldWriter.writeObject("nextBillDate", ModelAccountSubscriptionBillCycleFilterInput.this.nextBillDate.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleFilterInput.this.nextBillDate.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountSubscriptionBillCycleFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountSubscriptionBillCycleFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountSubscriptionBillCycleFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountSubscriptionBillCycleFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountSubscriptionBillCycleFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountSubscriptionBillCycleFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountSubscriptionBillCycleFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountSubscriptionBillCycleFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountSubscriptionBillCycleFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountSubscriptionBillCycleFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountSubscriptionBillCycleFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountSubscriptionBillCycleFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountSubscriptionBillCycleFilterInput.this.not.value != 0 ? ((ModelAccountSubscriptionBillCycleFilterInput) ModelAccountSubscriptionBillCycleFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput nextBillDate() {
        return this.nextBillDate.value;
    }

    public ModelAccountSubscriptionBillCycleFilterInput not() {
        return this.not.value;
    }

    public List<ModelAccountSubscriptionBillCycleFilterInput> or() {
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
