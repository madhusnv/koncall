package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateCustomFormAttachConditionInput implements InputType {
    private final String accountId;
    private final Input<String> callOutcome;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> dealStage;
    private final Input<String> documentCategory;
    private final Input<String> documentSubCategory;
    private final String formId;
    private final Input<String> formType;
    private final Input<Boolean> hideDefaultNote;
    private final Input<String> id;
    private final Input<String> isDefaultFormForType;
    private final Input<String> paymentStatus;
    private final Input<String> taskInputType;
    private final Input<String> taskOutcomeType;
    private final Input<String> taskType;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> visitOutcome;

    public static final class Builder {
        private String accountId;
        private String formId;
        private Input<String> id = Input.absent();
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
            this.accountId = str;
            return this;
        }

        public CreateCustomFormAttachConditionInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.formId, "formId == null");
            return new CreateCustomFormAttachConditionInput(this.id, this.accountId, this.formId, this.formType, this.callOutcome, this.visitOutcome, this.taskInputType, this.taskType, this.taskOutcomeType, this.dealStage, this.paymentStatus, this.documentCategory, this.documentSubCategory, this.isDefaultFormForType, this.hideDefaultNote, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
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
            this.formId = str;
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
            this.id = Input.fromNullable(str);
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

    public CreateCustomFormAttachConditionInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<Boolean> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17) {
        this.id = input;
        this.accountId = str;
        this.formId = str2;
        this.formType = input2;
        this.callOutcome = input3;
        this.visitOutcome = input4;
        this.taskInputType = input5;
        this.taskType = input6;
        this.taskOutcomeType = input7;
        this.dealStage = input8;
        this.paymentStatus = input9;
        this.documentCategory = input10;
        this.documentSubCategory = input11;
        this.isDefaultFormForType = input12;
        this.hideDefaultNote = input13;
        this.createdById = input14;
        this.updatedById = input15;
        this.createdAt = input16;
        this.updatedAt = input17;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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
        return this.formId;
    }

    public String formType() {
        return this.formType.value;
    }

    public Boolean hideDefaultNote() {
        return this.hideDefaultNote.value;
    }

    public String id() {
        return this.id.value;
    }

    public String isDefaultFormForType() {
        return this.isDefaultFormForType.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCustomFormAttachConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCustomFormAttachConditionInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCustomFormAttachConditionInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateCustomFormAttachConditionInput.this.accountId);
                inputFieldWriter.writeString("formId", CreateCustomFormAttachConditionInput.this.formId);
                if (CreateCustomFormAttachConditionInput.this.formType.defined) {
                    inputFieldWriter.writeString("formType", (String) CreateCustomFormAttachConditionInput.this.formType.value);
                }
                if (CreateCustomFormAttachConditionInput.this.callOutcome.defined) {
                    inputFieldWriter.writeString("callOutcome", (String) CreateCustomFormAttachConditionInput.this.callOutcome.value);
                }
                if (CreateCustomFormAttachConditionInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeString("visitOutcome", (String) CreateCustomFormAttachConditionInput.this.visitOutcome.value);
                }
                if (CreateCustomFormAttachConditionInput.this.taskInputType.defined) {
                    inputFieldWriter.writeString("taskInputType", (String) CreateCustomFormAttachConditionInput.this.taskInputType.value);
                }
                if (CreateCustomFormAttachConditionInput.this.taskType.defined) {
                    inputFieldWriter.writeString("taskType", (String) CreateCustomFormAttachConditionInput.this.taskType.value);
                }
                if (CreateCustomFormAttachConditionInput.this.taskOutcomeType.defined) {
                    inputFieldWriter.writeString("taskOutcomeType", (String) CreateCustomFormAttachConditionInput.this.taskOutcomeType.value);
                }
                if (CreateCustomFormAttachConditionInput.this.dealStage.defined) {
                    inputFieldWriter.writeString("dealStage", (String) CreateCustomFormAttachConditionInput.this.dealStage.value);
                }
                if (CreateCustomFormAttachConditionInput.this.paymentStatus.defined) {
                    inputFieldWriter.writeString("paymentStatus", (String) CreateCustomFormAttachConditionInput.this.paymentStatus.value);
                }
                if (CreateCustomFormAttachConditionInput.this.documentCategory.defined) {
                    inputFieldWriter.writeString("documentCategory", (String) CreateCustomFormAttachConditionInput.this.documentCategory.value);
                }
                if (CreateCustomFormAttachConditionInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeString("documentSubCategory", (String) CreateCustomFormAttachConditionInput.this.documentSubCategory.value);
                }
                if (CreateCustomFormAttachConditionInput.this.isDefaultFormForType.defined) {
                    inputFieldWriter.writeString("isDefaultFormForType", (String) CreateCustomFormAttachConditionInput.this.isDefaultFormForType.value);
                }
                if (CreateCustomFormAttachConditionInput.this.hideDefaultNote.defined) {
                    inputFieldWriter.writeBoolean("hideDefaultNote", (Boolean) CreateCustomFormAttachConditionInput.this.hideDefaultNote.value);
                }
                if (CreateCustomFormAttachConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateCustomFormAttachConditionInput.this.createdById.value);
                }
                if (CreateCustomFormAttachConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateCustomFormAttachConditionInput.this.updatedById.value);
                }
                if (CreateCustomFormAttachConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCustomFormAttachConditionInput.this.createdAt.value);
                }
                if (CreateCustomFormAttachConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCustomFormAttachConditionInput.this.updatedAt.value);
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
