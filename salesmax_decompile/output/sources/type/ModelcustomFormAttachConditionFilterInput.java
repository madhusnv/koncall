package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelcustomFormAttachConditionFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelcustomFormAttachConditionFilterInput>> and;
    private final Input<ModelStringInput> callOutcome;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> dealStage;
    private final Input<ModelStringInput> documentCategory;
    private final Input<ModelStringInput> documentSubCategory;
    private final Input<ModelIDInput> formId;
    private final Input<ModelStringInput> formType;
    private final Input<ModelBooleanInput> hideDefaultNote;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> isDefaultFormForType;
    private final Input<ModelcustomFormAttachConditionFilterInput> not;
    private final Input<List<ModelcustomFormAttachConditionFilterInput>> or;
    private final Input<ModelStringInput> paymentStatus;
    private final Input<ModelStringInput> taskInputType;
    private final Input<ModelStringInput> taskOutcomeType;
    private final Input<ModelStringInput> taskType;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> visitOutcome;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> formId = Input.absent();
        private Input<ModelStringInput> formType = Input.absent();
        private Input<ModelStringInput> callOutcome = Input.absent();
        private Input<ModelStringInput> visitOutcome = Input.absent();
        private Input<ModelStringInput> taskInputType = Input.absent();
        private Input<ModelStringInput> taskType = Input.absent();
        private Input<ModelStringInput> taskOutcomeType = Input.absent();
        private Input<ModelStringInput> dealStage = Input.absent();
        private Input<ModelStringInput> paymentStatus = Input.absent();
        private Input<ModelStringInput> documentCategory = Input.absent();
        private Input<ModelStringInput> documentSubCategory = Input.absent();
        private Input<ModelStringInput> isDefaultFormForType = Input.absent();
        private Input<ModelBooleanInput> hideDefaultNote = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelcustomFormAttachConditionFilterInput>> and = Input.absent();
        private Input<List<ModelcustomFormAttachConditionFilterInput>> or = Input.absent();
        private Input<ModelcustomFormAttachConditionFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelcustomFormAttachConditionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelcustomFormAttachConditionFilterInput build() {
            return new ModelcustomFormAttachConditionFilterInput(this.id, this.accountId, this.formId, this.formType, this.callOutcome, this.visitOutcome, this.taskInputType, this.taskType, this.taskOutcomeType, this.dealStage, this.paymentStatus, this.documentCategory, this.documentSubCategory, this.isDefaultFormForType, this.hideDefaultNote, this.createdById, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder callOutcome(ModelStringInput modelStringInput) {
            this.callOutcome = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder dealStage(ModelStringInput modelStringInput) {
            this.dealStage = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder documentCategory(ModelStringInput modelStringInput) {
            this.documentCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder documentSubCategory(ModelStringInput modelStringInput) {
            this.documentSubCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder formId(ModelIDInput modelIDInput) {
            this.formId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder formType(ModelStringInput modelStringInput) {
            this.formType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder hideDefaultNote(ModelBooleanInput modelBooleanInput) {
            this.hideDefaultNote = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isDefaultFormForType(ModelStringInput modelStringInput) {
            this.isDefaultFormForType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelcustomFormAttachConditionFilterInput modelcustomFormAttachConditionFilterInput) {
            this.not = Input.fromNullable(modelcustomFormAttachConditionFilterInput);
            return this;
        }

        public Builder or(List<ModelcustomFormAttachConditionFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder paymentStatus(ModelStringInput modelStringInput) {
            this.paymentStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskInputType(ModelStringInput modelStringInput) {
            this.taskInputType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskOutcomeType(ModelStringInput modelStringInput) {
            this.taskOutcomeType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskType(ModelStringInput modelStringInput) {
            this.taskType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder visitOutcome(ModelStringInput modelStringInput) {
            this.visitOutcome = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelcustomFormAttachConditionFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelBooleanInput> input15, Input<ModelIDInput> input16, Input<ModelIDInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<List<ModelcustomFormAttachConditionFilterInput>> input20, Input<List<ModelcustomFormAttachConditionFilterInput>> input21, Input<ModelcustomFormAttachConditionFilterInput> input22) {
        this.id = input;
        this.accountId = input2;
        this.formId = input3;
        this.formType = input4;
        this.callOutcome = input5;
        this.visitOutcome = input6;
        this.taskInputType = input7;
        this.taskType = input8;
        this.taskOutcomeType = input9;
        this.dealStage = input10;
        this.paymentStatus = input11;
        this.documentCategory = input12;
        this.documentSubCategory = input13;
        this.isDefaultFormForType = input14;
        this.hideDefaultNote = input15;
        this.createdById = input16;
        this.updatedById = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
        this.and = input20;
        this.or = input21;
        this.not = input22;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelcustomFormAttachConditionFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput callOutcome() {
        return this.callOutcome.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelStringInput dealStage() {
        return this.dealStage.value;
    }

    public ModelStringInput documentCategory() {
        return this.documentCategory.value;
    }

    public ModelStringInput documentSubCategory() {
        return this.documentSubCategory.value;
    }

    public ModelIDInput formId() {
        return this.formId.value;
    }

    public ModelStringInput formType() {
        return this.formType.value;
    }

    public ModelBooleanInput hideDefaultNote() {
        return this.hideDefaultNote.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput isDefaultFormForType() {
        return this.isDefaultFormForType.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelcustomFormAttachConditionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelcustomFormAttachConditionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelcustomFormAttachConditionFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelcustomFormAttachConditionFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelcustomFormAttachConditionFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelcustomFormAttachConditionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.formId.defined) {
                    inputFieldWriter.writeObject("formId", ModelcustomFormAttachConditionFilterInput.this.formId.value != 0 ? ((ModelIDInput) ModelcustomFormAttachConditionFilterInput.this.formId.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.formType.defined) {
                    inputFieldWriter.writeObject("formType", ModelcustomFormAttachConditionFilterInput.this.formType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.formType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.callOutcome.defined) {
                    inputFieldWriter.writeObject("callOutcome", ModelcustomFormAttachConditionFilterInput.this.callOutcome.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.callOutcome.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeObject("visitOutcome", ModelcustomFormAttachConditionFilterInput.this.visitOutcome.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.visitOutcome.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.taskInputType.defined) {
                    inputFieldWriter.writeObject("taskInputType", ModelcustomFormAttachConditionFilterInput.this.taskInputType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.taskInputType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.taskType.defined) {
                    inputFieldWriter.writeObject("taskType", ModelcustomFormAttachConditionFilterInput.this.taskType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.taskType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.taskOutcomeType.defined) {
                    inputFieldWriter.writeObject("taskOutcomeType", ModelcustomFormAttachConditionFilterInput.this.taskOutcomeType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.taskOutcomeType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.dealStage.defined) {
                    inputFieldWriter.writeObject("dealStage", ModelcustomFormAttachConditionFilterInput.this.dealStage.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.dealStage.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.paymentStatus.defined) {
                    inputFieldWriter.writeObject("paymentStatus", ModelcustomFormAttachConditionFilterInput.this.paymentStatus.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.paymentStatus.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.documentCategory.defined) {
                    inputFieldWriter.writeObject("documentCategory", ModelcustomFormAttachConditionFilterInput.this.documentCategory.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.documentCategory.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeObject("documentSubCategory", ModelcustomFormAttachConditionFilterInput.this.documentSubCategory.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.documentSubCategory.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.isDefaultFormForType.defined) {
                    inputFieldWriter.writeObject("isDefaultFormForType", ModelcustomFormAttachConditionFilterInput.this.isDefaultFormForType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.isDefaultFormForType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.hideDefaultNote.defined) {
                    inputFieldWriter.writeObject("hideDefaultNote", ModelcustomFormAttachConditionFilterInput.this.hideDefaultNote.value != 0 ? ((ModelBooleanInput) ModelcustomFormAttachConditionFilterInput.this.hideDefaultNote.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelcustomFormAttachConditionFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelcustomFormAttachConditionFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelcustomFormAttachConditionFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelcustomFormAttachConditionFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelcustomFormAttachConditionFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelcustomFormAttachConditionFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelcustomFormAttachConditionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelcustomFormAttachConditionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelcustomFormAttachConditionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelcustomFormAttachConditionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelcustomFormAttachConditionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelcustomFormAttachConditionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelcustomFormAttachConditionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelcustomFormAttachConditionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelcustomFormAttachConditionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelcustomFormAttachConditionFilterInput.this.not.value != 0 ? ((ModelcustomFormAttachConditionFilterInput) ModelcustomFormAttachConditionFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelcustomFormAttachConditionFilterInput not() {
        return this.not.value;
    }

    public List<ModelcustomFormAttachConditionFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput paymentStatus() {
        return this.paymentStatus.value;
    }

    public ModelStringInput taskInputType() {
        return this.taskInputType.value;
    }

    public ModelStringInput taskOutcomeType() {
        return this.taskOutcomeType.value;
    }

    public ModelStringInput taskType() {
        return this.taskType.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelStringInput visitOutcome() {
        return this.visitOutcome.value;
    }
}
