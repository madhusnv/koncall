package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateCustomFormAttachConditionInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> callOutcome;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> dealStage;
    private final Input<String> documentCategory;
    private final Input<String> documentSubCategory;
    private final Input<String> formId;
    private final Input<String> formType;
    private final Input<Boolean> hideDefaultNote;
    private final String id;
    private final Input<String> isDefaultFormForType;
    private final Input<String> paymentStatus;
    private final Input<String> taskInputType;
    private final Input<String> taskOutcomeType;
    private final Input<String> taskType;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> visitOutcome;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> formId = Input.absent();
        private Input<String> formType = Input.absent();
        private Input<String> callOutcome = Input.absent();
        private Input<String> visitOutcome = Input.absent();
        private Input<String> taskInputType = Input.absent();
        private Input<String> taskType = Input.absent();
        private Input<String> taskOutcomeType = Input.absent();
        private Input<String> dealStage = Input.absent();
        private Input<String> paymentStatus = Input.absent();
        private Input<String> documentCategory = Input.absent();
        private Input<String> documentSubCategory = Input.absent();
        private Input<String> isDefaultFormForType = Input.absent();
        private Input<Boolean> hideDefaultNote = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateCustomFormAttachConditionInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCustomFormAttachConditionInput(this.id, this.accountId, this.formId, this.formType, this.callOutcome, this.visitOutcome, this.taskInputType, this.taskType, this.taskOutcomeType, this.dealStage, this.paymentStatus, this.documentCategory, this.documentSubCategory, this.isDefaultFormForType, this.hideDefaultNote, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
        }

        public Builder callOutcome(String str) {
            this.callOutcome = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder dealStage(String str) {
            this.dealStage = Input.fromNullable(str);
            return this;
        }

        public Builder documentCategory(String str) {
            this.documentCategory = Input.fromNullable(str);
            return this;
        }

        public Builder documentSubCategory(String str) {
            this.documentSubCategory = Input.fromNullable(str);
            return this;
        }

        public Builder formId(String str) {
            this.formId = Input.fromNullable(str);
            return this;
        }

        public Builder formType(String str) {
            this.formType = Input.fromNullable(str);
            return this;
        }

        public Builder hideDefaultNote(Boolean bool) {
            this.hideDefaultNote = Input.fromNullable(bool);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder isDefaultFormForType(String str) {
            this.isDefaultFormForType = Input.fromNullable(str);
            return this;
        }

        public Builder paymentStatus(String str) {
            this.paymentStatus = Input.fromNullable(str);
            return this;
        }

        public Builder taskInputType(String str) {
            this.taskInputType = Input.fromNullable(str);
            return this;
        }

        public Builder taskOutcomeType(String str) {
            this.taskOutcomeType = Input.fromNullable(str);
            return this;
        }

        public Builder taskType(String str) {
            this.taskType = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }

        public Builder visitOutcome(String str) {
            this.visitOutcome = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateCustomFormAttachConditionInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<Boolean> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18) {
        this.id = str;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String callOutcome() {
        return this.callOutcome.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String dealStage() {
        return this.dealStage.value;
    }

    public String documentCategory() {
        return this.documentCategory.value;
    }

    public String documentSubCategory() {
        return this.documentSubCategory.value;
    }

    public String formId() {
        return this.formId.value;
    }

    public String formType() {
        return this.formType.value;
    }

    public Boolean hideDefaultNote() {
        return this.hideDefaultNote.value;
    }

    public String id() {
        return this.id;
    }

    public String isDefaultFormForType() {
        return this.isDefaultFormForType.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCustomFormAttachConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCustomFormAttachConditionInput.this.id);
                if (UpdateCustomFormAttachConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCustomFormAttachConditionInput.this.accountId.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.formId.defined) {
                    inputFieldWriter.writeString("formId", (String) UpdateCustomFormAttachConditionInput.this.formId.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.formType.defined) {
                    inputFieldWriter.writeString("formType", (String) UpdateCustomFormAttachConditionInput.this.formType.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.callOutcome.defined) {
                    inputFieldWriter.writeString("callOutcome", (String) UpdateCustomFormAttachConditionInput.this.callOutcome.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeString("visitOutcome", (String) UpdateCustomFormAttachConditionInput.this.visitOutcome.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.taskInputType.defined) {
                    inputFieldWriter.writeString("taskInputType", (String) UpdateCustomFormAttachConditionInput.this.taskInputType.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.taskType.defined) {
                    inputFieldWriter.writeString("taskType", (String) UpdateCustomFormAttachConditionInput.this.taskType.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.taskOutcomeType.defined) {
                    inputFieldWriter.writeString("taskOutcomeType", (String) UpdateCustomFormAttachConditionInput.this.taskOutcomeType.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.dealStage.defined) {
                    inputFieldWriter.writeString("dealStage", (String) UpdateCustomFormAttachConditionInput.this.dealStage.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.paymentStatus.defined) {
                    inputFieldWriter.writeString("paymentStatus", (String) UpdateCustomFormAttachConditionInput.this.paymentStatus.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.documentCategory.defined) {
                    inputFieldWriter.writeString("documentCategory", (String) UpdateCustomFormAttachConditionInput.this.documentCategory.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeString("documentSubCategory", (String) UpdateCustomFormAttachConditionInput.this.documentSubCategory.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.isDefaultFormForType.defined) {
                    inputFieldWriter.writeString("isDefaultFormForType", (String) UpdateCustomFormAttachConditionInput.this.isDefaultFormForType.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.hideDefaultNote.defined) {
                    inputFieldWriter.writeBoolean("hideDefaultNote", (Boolean) UpdateCustomFormAttachConditionInput.this.hideDefaultNote.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateCustomFormAttachConditionInput.this.createdById.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateCustomFormAttachConditionInput.this.updatedById.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCustomFormAttachConditionInput.this.createdAt.value);
                }
                if (UpdateCustomFormAttachConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCustomFormAttachConditionInput.this.updatedAt.value);
                }
            }
        };
    }

    public String paymentStatus() {
        return this.paymentStatus.value;
    }

    public String taskInputType() {
        return this.taskInputType.value;
    }

    public String taskOutcomeType() {
        return this.taskOutcomeType.value;
    }

    public String taskType() {
        return this.taskType.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public String visitOutcome() {
        return this.visitOutcome.value;
    }
}
