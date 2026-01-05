package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDealTransitionFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDealTransitionFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> dealId;
    private final Input<ModelStringInput> dealStage;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelIDInput> id;
    private final Input<ModelDealTransitionFilterInput> not;
    private final Input<ModelIntInput> numberOfDaysToMakeTransition;
    private final Input<List<ModelDealTransitionFilterInput>> or;
    private final Input<ModelStringInput> previousDealStage;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> dealId = Input.absent();
        private Input<ModelStringInput> dealStage = Input.absent();
        private Input<ModelStringInput> previousDealStage = Input.absent();
        private Input<ModelIntInput> numberOfDaysToMakeTransition = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelDealTransitionFilterInput>> and = Input.absent();
        private Input<List<ModelDealTransitionFilterInput>> or = Input.absent();
        private Input<ModelDealTransitionFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDealTransitionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelDealTransitionFilterInput build() {
            return new ModelDealTransitionFilterInput(this.id, this.accountId, this.dealId, this.dealStage, this.previousDealStage, this.numberOfDaysToMakeTransition, this.engagementId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelDealTransitionFilterInput modelDealTransitionFilterInput) {
            this.not = Input.fromNullable(modelDealTransitionFilterInput);
            return this;
        }

        public Builder numberOfDaysToMakeTransition(ModelIntInput modelIntInput) {
            this.numberOfDaysToMakeTransition = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder or(List<ModelDealTransitionFilterInput> list) {
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

    public ModelDealTransitionFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIntInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelDealTransitionFilterInput>> input10, Input<List<ModelDealTransitionFilterInput>> input11, Input<ModelDealTransitionFilterInput> input12) {
        this.id = input;
        this.accountId = input2;
        this.dealId = input3;
        this.dealStage = input4;
        this.previousDealStage = input5;
        this.numberOfDaysToMakeTransition = input6;
        this.engagementId = input7;
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

    public List<ModelDealTransitionFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDealTransitionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDealTransitionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelDealTransitionFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelDealTransitionFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelDealTransitionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDealTransitionFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDealTransitionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDealTransitionFilterInput.this.dealId.defined) {
                    inputFieldWriter.writeObject("dealId", ModelDealTransitionFilterInput.this.dealId.value != 0 ? ((ModelIDInput) ModelDealTransitionFilterInput.this.dealId.value).marshaller() : null);
                }
                if (ModelDealTransitionFilterInput.this.dealStage.defined) {
                    inputFieldWriter.writeObject("dealStage", ModelDealTransitionFilterInput.this.dealStage.value != 0 ? ((ModelStringInput) ModelDealTransitionFilterInput.this.dealStage.value).marshaller() : null);
                }
                if (ModelDealTransitionFilterInput.this.previousDealStage.defined) {
                    inputFieldWriter.writeObject("previousDealStage", ModelDealTransitionFilterInput.this.previousDealStage.value != 0 ? ((ModelStringInput) ModelDealTransitionFilterInput.this.previousDealStage.value).marshaller() : null);
                }
                if (ModelDealTransitionFilterInput.this.numberOfDaysToMakeTransition.defined) {
                    inputFieldWriter.writeObject("numberOfDaysToMakeTransition", ModelDealTransitionFilterInput.this.numberOfDaysToMakeTransition.value != 0 ? ((ModelIntInput) ModelDealTransitionFilterInput.this.numberOfDaysToMakeTransition.value).marshaller() : null);
                }
                if (ModelDealTransitionFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelDealTransitionFilterInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelDealTransitionFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelDealTransitionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDealTransitionFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDealTransitionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDealTransitionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDealTransitionFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDealTransitionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDealTransitionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDealTransitionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealTransitionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealTransitionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealTransitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealTransitionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDealTransitionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealTransitionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealTransitionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealTransitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealTransitionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDealTransitionFilterInput.this.not.value != 0 ? ((ModelDealTransitionFilterInput) ModelDealTransitionFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelDealTransitionFilterInput not() {
        return this.not.value;
    }

    public ModelIntInput numberOfDaysToMakeTransition() {
        return this.numberOfDaysToMakeTransition.value;
    }

    public List<ModelDealTransitionFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput previousDealStage() {
        return this.previousDealStage.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
