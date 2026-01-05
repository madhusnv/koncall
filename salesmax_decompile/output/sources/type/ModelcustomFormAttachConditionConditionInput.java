package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelcustomFormAttachConditionConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelcustomFormAttachConditionConditionInput>> and;
    private final Input<ModelStringInput> callOutcome;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> dealStage;
    private final Input<ModelStringInput> documentCategory;
    private final Input<ModelStringInput> documentSubCategory;
    private final Input<ModelIDInput> formId;
    private final Input<ModelStringInput> formType;
    private final Input<ModelBooleanInput> hideDefaultNote;
    private final Input<ModelStringInput> isDefaultFormForType;
    private final Input<ModelcustomFormAttachConditionConditionInput> not;
    private final Input<List<ModelcustomFormAttachConditionConditionInput>> or;
    private final Input<ModelStringInput> paymentStatus;
    private final Input<ModelStringInput> taskInputType;
    private final Input<ModelStringInput> taskOutcomeType;
    private final Input<ModelStringInput> taskType;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> visitOutcome;

    public static final class Builder {
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
        private Input<List<ModelcustomFormAttachConditionConditionInput>> and = Input.absent();
        private Input<List<ModelcustomFormAttachConditionConditionInput>> or = Input.absent();
        private Input<ModelcustomFormAttachConditionConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelcustomFormAttachConditionConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelcustomFormAttachConditionConditionInput build() {
            return new ModelcustomFormAttachConditionConditionInput(this.accountId, this.formId, this.formType, this.callOutcome, this.visitOutcome, this.taskInputType, this.taskType, this.taskOutcomeType, this.dealStage, this.paymentStatus, this.documentCategory, this.documentSubCategory, this.isDefaultFormForType, this.hideDefaultNote, this.createdById, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder isDefaultFormForType(ModelStringInput modelStringInput) {
            this.isDefaultFormForType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelcustomFormAttachConditionConditionInput modelcustomFormAttachConditionConditionInput) {
            this.not = Input.fromNullable(modelcustomFormAttachConditionConditionInput);
            return this;
        }

        public Builder or(List<ModelcustomFormAttachConditionConditionInput> list) {
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

    public ModelcustomFormAttachConditionConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelBooleanInput> input14, Input<ModelIDInput> input15, Input<ModelIDInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<List<ModelcustomFormAttachConditionConditionInput>> input19, Input<List<ModelcustomFormAttachConditionConditionInput>> input20, Input<ModelcustomFormAttachConditionConditionInput> input21) {
        this.accountId = input;
        this.formId = input2;
        this.formType = input3;
        this.callOutcome = input4;
        this.visitOutcome = input5;
        this.taskInputType = input6;
        this.taskType = input7;
        this.taskOutcomeType = input8;
        this.dealStage = input9;
        this.paymentStatus = input10;
        this.documentCategory = input11;
        this.documentSubCategory = input12;
        this.isDefaultFormForType = input13;
        this.hideDefaultNote = input14;
        this.createdById = input15;
        this.updatedById = input16;
        this.createdAt = input17;
        this.updatedAt = input18;
        this.and = input19;
        this.or = input20;
        this.not = input21;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelcustomFormAttachConditionConditionInput> and() {
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

    public ModelStringInput isDefaultFormForType() {
        return this.isDefaultFormForType.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelcustomFormAttachConditionConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelcustomFormAttachConditionConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelcustomFormAttachConditionConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelcustomFormAttachConditionConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.formId.defined) {
                    inputFieldWriter.writeObject("formId", ModelcustomFormAttachConditionConditionInput.this.formId.value != 0 ? ((ModelIDInput) ModelcustomFormAttachConditionConditionInput.this.formId.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.formType.defined) {
                    inputFieldWriter.writeObject("formType", ModelcustomFormAttachConditionConditionInput.this.formType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.formType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.callOutcome.defined) {
                    inputFieldWriter.writeObject("callOutcome", ModelcustomFormAttachConditionConditionInput.this.callOutcome.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.callOutcome.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeObject("visitOutcome", ModelcustomFormAttachConditionConditionInput.this.visitOutcome.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.visitOutcome.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.taskInputType.defined) {
                    inputFieldWriter.writeObject("taskInputType", ModelcustomFormAttachConditionConditionInput.this.taskInputType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.taskInputType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.taskType.defined) {
                    inputFieldWriter.writeObject("taskType", ModelcustomFormAttachConditionConditionInput.this.taskType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.taskType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.taskOutcomeType.defined) {
                    inputFieldWriter.writeObject("taskOutcomeType", ModelcustomFormAttachConditionConditionInput.this.taskOutcomeType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.taskOutcomeType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.dealStage.defined) {
                    inputFieldWriter.writeObject("dealStage", ModelcustomFormAttachConditionConditionInput.this.dealStage.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.dealStage.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.paymentStatus.defined) {
                    inputFieldWriter.writeObject("paymentStatus", ModelcustomFormAttachConditionConditionInput.this.paymentStatus.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.paymentStatus.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.documentCategory.defined) {
                    inputFieldWriter.writeObject("documentCategory", ModelcustomFormAttachConditionConditionInput.this.documentCategory.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.documentCategory.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeObject("documentSubCategory", ModelcustomFormAttachConditionConditionInput.this.documentSubCategory.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.documentSubCategory.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.isDefaultFormForType.defined) {
                    inputFieldWriter.writeObject("isDefaultFormForType", ModelcustomFormAttachConditionConditionInput.this.isDefaultFormForType.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.isDefaultFormForType.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.hideDefaultNote.defined) {
                    inputFieldWriter.writeObject("hideDefaultNote", ModelcustomFormAttachConditionConditionInput.this.hideDefaultNote.value != 0 ? ((ModelBooleanInput) ModelcustomFormAttachConditionConditionInput.this.hideDefaultNote.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelcustomFormAttachConditionConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelcustomFormAttachConditionConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelcustomFormAttachConditionConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelcustomFormAttachConditionConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelcustomFormAttachConditionConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelcustomFormAttachConditionConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelcustomFormAttachConditionConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelcustomFormAttachConditionConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelcustomFormAttachConditionConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelcustomFormAttachConditionConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelcustomFormAttachConditionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelcustomFormAttachConditionConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelcustomFormAttachConditionConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelcustomFormAttachConditionConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelcustomFormAttachConditionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelcustomFormAttachConditionConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelcustomFormAttachConditionConditionInput.this.not.value != 0 ? ((ModelcustomFormAttachConditionConditionInput) ModelcustomFormAttachConditionConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelcustomFormAttachConditionConditionInput not() {
        return this.not.value;
    }

    public List<ModelcustomFormAttachConditionConditionInput> or() {
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
