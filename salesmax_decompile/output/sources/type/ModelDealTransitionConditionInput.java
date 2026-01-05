package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDealTransitionConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDealTransitionConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> dealId;
    private final Input<ModelStringInput> dealStage;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelDealTransitionConditionInput> not;
    private final Input<ModelIntInput> numberOfDaysToMakeTransition;
    private final Input<List<ModelDealTransitionConditionInput>> or;
    private final Input<ModelStringInput> previousDealStage;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> dealId = Input.absent();
        private Input<ModelStringInput> dealStage = Input.absent();
        private Input<ModelStringInput> previousDealStage = Input.absent();
        private Input<ModelIntInput> numberOfDaysToMakeTransition = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelDealTransitionConditionInput>> and = Input.absent();
        private Input<List<ModelDealTransitionConditionInput>> or = Input.absent();
        private Input<ModelDealTransitionConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDealTransitionConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelDealTransitionConditionInput build() {
            return new ModelDealTransitionConditionInput(this.accountId, this.dealId, this.dealStage, this.previousDealStage, this.numberOfDaysToMakeTransition, this.engagementId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dealId(ModelIDInput modelIDInput) {
            this.dealId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder dealStage(ModelStringInput modelStringInput) {
            this.dealStage = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelDealTransitionConditionInput modelDealTransitionConditionInput) {
            this.not = Input.fromNullable(modelDealTransitionConditionInput);
            return this;
        }

        public Builder numberOfDaysToMakeTransition(ModelIntInput modelIntInput) {
            this.numberOfDaysToMakeTransition = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder or(List<ModelDealTransitionConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder previousDealStage(ModelStringInput modelStringInput) {
            this.previousDealStage = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelDealTransitionConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelIntInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelDealTransitionConditionInput>> input9, Input<List<ModelDealTransitionConditionInput>> input10, Input<ModelDealTransitionConditionInput> input11) {
        this.accountId = input;
        this.dealId = input2;
        this.dealStage = input3;
        this.previousDealStage = input4;
        this.numberOfDaysToMakeTransition = input5;
        this.engagementId = input6;
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

    public List<ModelDealTransitionConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput dealId() {
        return this.dealId.value;
    }

    public ModelStringInput dealStage() {
        return this.dealStage.value;
    }

    public ModelIDInput engagementId() {
        return this.engagementId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDealTransitionConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDealTransitionConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDealTransitionConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDealTransitionConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDealTransitionConditionInput.this.dealId.defined) {
                    inputFieldWriter.writeObject("dealId", ModelDealTransitionConditionInput.this.dealId.value != 0 ? ((ModelIDInput) ModelDealTransitionConditionInput.this.dealId.value).marshaller() : null);
                }
                if (ModelDealTransitionConditionInput.this.dealStage.defined) {
                    inputFieldWriter.writeObject("dealStage", ModelDealTransitionConditionInput.this.dealStage.value != 0 ? ((ModelStringInput) ModelDealTransitionConditionInput.this.dealStage.value).marshaller() : null);
                }
                if (ModelDealTransitionConditionInput.this.previousDealStage.defined) {
                    inputFieldWriter.writeObject("previousDealStage", ModelDealTransitionConditionInput.this.previousDealStage.value != 0 ? ((ModelStringInput) ModelDealTransitionConditionInput.this.previousDealStage.value).marshaller() : null);
                }
                if (ModelDealTransitionConditionInput.this.numberOfDaysToMakeTransition.defined) {
                    inputFieldWriter.writeObject("numberOfDaysToMakeTransition", ModelDealTransitionConditionInput.this.numberOfDaysToMakeTransition.value != 0 ? ((ModelIntInput) ModelDealTransitionConditionInput.this.numberOfDaysToMakeTransition.value).marshaller() : null);
                }
                if (ModelDealTransitionConditionInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelDealTransitionConditionInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelDealTransitionConditionInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelDealTransitionConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDealTransitionConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDealTransitionConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDealTransitionConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDealTransitionConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDealTransitionConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDealTransitionConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDealTransitionConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealTransitionConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealTransitionConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealTransitionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealTransitionConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDealTransitionConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealTransitionConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealTransitionConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealTransitionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealTransitionConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDealTransitionConditionInput.this.not.value != 0 ? ((ModelDealTransitionConditionInput) ModelDealTransitionConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelDealTransitionConditionInput not() {
        return this.not.value;
    }

    public ModelIntInput numberOfDaysToMakeTransition() {
        return this.numberOfDaysToMakeTransition.value;
    }

    public List<ModelDealTransitionConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput previousDealStage() {
        return this.previousDealStage.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
