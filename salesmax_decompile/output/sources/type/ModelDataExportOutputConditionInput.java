package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDataExportOutputConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDataExportOutputConditionInput>> and;
    private final Input<ModelStringInput> batchRunId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> entityActionDefinitionReference;
    private final Input<ModelStringInput> exportMessage;
    private final Input<ModelDataExportOutputConditionInput> not;
    private final Input<List<ModelDataExportOutputConditionInput>> or;
    private final Input<ModelStringInput> status;
    private final Input<ModelIDInput> teamId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> uploadedFileReference;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelIDInput> teamId = Input.absent();
        private Input<ModelIDInput> entityActionDefinitionReference = Input.absent();
        private Input<ModelIDInput> uploadedFileReference = Input.absent();
        private Input<ModelStringInput> exportMessage = Input.absent();
        private Input<ModelStringInput> batchRunId = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelDataExportOutputConditionInput>> and = Input.absent();
        private Input<List<ModelDataExportOutputConditionInput>> or = Input.absent();
        private Input<ModelDataExportOutputConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDataExportOutputConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder batchRunId(ModelStringInput modelStringInput) {
            this.batchRunId = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelDataExportOutputConditionInput build() {
            return new ModelDataExportOutputConditionInput(this.accountId, this.userId, this.teamId, this.entityActionDefinitionReference, this.uploadedFileReference, this.exportMessage, this.batchRunId, this.status, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder entityActionDefinitionReference(ModelIDInput modelIDInput) {
            this.entityActionDefinitionReference = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder exportMessage(ModelStringInput modelStringInput) {
            this.exportMessage = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelDataExportOutputConditionInput modelDataExportOutputConditionInput) {
            this.not = Input.fromNullable(modelDataExportOutputConditionInput);
            return this;
        }

        public Builder or(List<ModelDataExportOutputConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder teamId(ModelIDInput modelIDInput) {
            this.teamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder uploadedFileReference(ModelIDInput modelIDInput) {
            this.uploadedFileReference = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelDataExportOutputConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<List<ModelDataExportOutputConditionInput>> input11, Input<List<ModelDataExportOutputConditionInput>> input12, Input<ModelDataExportOutputConditionInput> input13) {
        this.accountId = input;
        this.userId = input2;
        this.teamId = input3;
        this.entityActionDefinitionReference = input4;
        this.uploadedFileReference = input5;
        this.exportMessage = input6;
        this.batchRunId = input7;
        this.status = input8;
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

    public List<ModelDataExportOutputConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput batchRunId() {
        return this.batchRunId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput entityActionDefinitionReference() {
        return this.entityActionDefinitionReference.value;
    }

    public ModelStringInput exportMessage() {
        return this.exportMessage.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDataExportOutputConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDataExportOutputConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDataExportOutputConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDataExportOutputConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelDataExportOutputConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelDataExportOutputConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.teamId.defined) {
                    inputFieldWriter.writeObject("teamId", ModelDataExportOutputConditionInput.this.teamId.value != 0 ? ((ModelIDInput) ModelDataExportOutputConditionInput.this.teamId.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.entityActionDefinitionReference.defined) {
                    inputFieldWriter.writeObject("entityActionDefinitionReference", ModelDataExportOutputConditionInput.this.entityActionDefinitionReference.value != 0 ? ((ModelIDInput) ModelDataExportOutputConditionInput.this.entityActionDefinitionReference.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.uploadedFileReference.defined) {
                    inputFieldWriter.writeObject("uploadedFileReference", ModelDataExportOutputConditionInput.this.uploadedFileReference.value != 0 ? ((ModelIDInput) ModelDataExportOutputConditionInput.this.uploadedFileReference.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.exportMessage.defined) {
                    inputFieldWriter.writeObject("exportMessage", ModelDataExportOutputConditionInput.this.exportMessage.value != 0 ? ((ModelStringInput) ModelDataExportOutputConditionInput.this.exportMessage.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.batchRunId.defined) {
                    inputFieldWriter.writeObject("batchRunId", ModelDataExportOutputConditionInput.this.batchRunId.value != 0 ? ((ModelStringInput) ModelDataExportOutputConditionInput.this.batchRunId.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelDataExportOutputConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelDataExportOutputConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDataExportOutputConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDataExportOutputConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDataExportOutputConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDataExportOutputConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDataExportOutputConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDataExportOutputConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDataExportOutputConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDataExportOutputConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDataExportOutputConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDataExportOutputConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDataExportOutputConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDataExportOutputConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDataExportOutputConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDataExportOutputConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDataExportOutputConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDataExportOutputConditionInput.this.not.value != 0 ? ((ModelDataExportOutputConditionInput) ModelDataExportOutputConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelDataExportOutputConditionInput not() {
        return this.not.value;
    }

    public List<ModelDataExportOutputConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelIDInput teamId() {
        return this.teamId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput uploadedFileReference() {
        return this.uploadedFileReference.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
