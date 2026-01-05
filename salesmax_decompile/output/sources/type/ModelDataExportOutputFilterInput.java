package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDataExportOutputFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDataExportOutputFilterInput>> and;
    private final Input<ModelStringInput> batchRunId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> entityActionDefinitionReference;
    private final Input<ModelStringInput> exportMessage;
    private final Input<ModelIDInput> id;
    private final Input<ModelDataExportOutputFilterInput> not;
    private final Input<List<ModelDataExportOutputFilterInput>> or;
    private final Input<ModelStringInput> status;
    private final Input<ModelIDInput> teamId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> uploadedFileReference;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelDataExportOutputFilterInput>> and = Input.absent();
        private Input<List<ModelDataExportOutputFilterInput>> or = Input.absent();
        private Input<ModelDataExportOutputFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDataExportOutputFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder batchRunId(ModelStringInput modelStringInput) {
            this.batchRunId = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelDataExportOutputFilterInput build() {
            return new ModelDataExportOutputFilterInput(this.id, this.accountId, this.userId, this.teamId, this.entityActionDefinitionReference, this.uploadedFileReference, this.exportMessage, this.batchRunId, this.status, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelDataExportOutputFilterInput modelDataExportOutputFilterInput) {
            this.not = Input.fromNullable(modelDataExportOutputFilterInput);
            return this;
        }

        public Builder or(List<ModelDataExportOutputFilterInput> list) {
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

    public ModelDataExportOutputFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<List<ModelDataExportOutputFilterInput>> input12, Input<List<ModelDataExportOutputFilterInput>> input13, Input<ModelDataExportOutputFilterInput> input14) {
        this.id = input;
        this.accountId = input2;
        this.userId = input3;
        this.teamId = input4;
        this.entityActionDefinitionReference = input5;
        this.uploadedFileReference = input6;
        this.exportMessage = input7;
        this.batchRunId = input8;
        this.status = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
        this.and = input12;
        this.or = input13;
        this.not = input14;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelDataExportOutputFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDataExportOutputFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDataExportOutputFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelDataExportOutputFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelDataExportOutputFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDataExportOutputFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDataExportOutputFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelDataExportOutputFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelDataExportOutputFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.teamId.defined) {
                    inputFieldWriter.writeObject("teamId", ModelDataExportOutputFilterInput.this.teamId.value != 0 ? ((ModelIDInput) ModelDataExportOutputFilterInput.this.teamId.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.entityActionDefinitionReference.defined) {
                    inputFieldWriter.writeObject("entityActionDefinitionReference", ModelDataExportOutputFilterInput.this.entityActionDefinitionReference.value != 0 ? ((ModelIDInput) ModelDataExportOutputFilterInput.this.entityActionDefinitionReference.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.uploadedFileReference.defined) {
                    inputFieldWriter.writeObject("uploadedFileReference", ModelDataExportOutputFilterInput.this.uploadedFileReference.value != 0 ? ((ModelIDInput) ModelDataExportOutputFilterInput.this.uploadedFileReference.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.exportMessage.defined) {
                    inputFieldWriter.writeObject("exportMessage", ModelDataExportOutputFilterInput.this.exportMessage.value != 0 ? ((ModelStringInput) ModelDataExportOutputFilterInput.this.exportMessage.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.batchRunId.defined) {
                    inputFieldWriter.writeObject("batchRunId", ModelDataExportOutputFilterInput.this.batchRunId.value != 0 ? ((ModelStringInput) ModelDataExportOutputFilterInput.this.batchRunId.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelDataExportOutputFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelDataExportOutputFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDataExportOutputFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDataExportOutputFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDataExportOutputFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDataExportOutputFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDataExportOutputFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDataExportOutputFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDataExportOutputFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDataExportOutputFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDataExportOutputFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDataExportOutputFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDataExportOutputFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDataExportOutputFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDataExportOutputFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDataExportOutputFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDataExportOutputFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDataExportOutputFilterInput.this.not.value != 0 ? ((ModelDataExportOutputFilterInput) ModelDataExportOutputFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelDataExportOutputFilterInput not() {
        return this.not.value;
    }

    public List<ModelDataExportOutputFilterInput> or() {
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
