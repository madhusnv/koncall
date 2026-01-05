package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMasterBotSpecializedBotFilterInput implements InputType {
    private final Input<List<ModelMasterBotSpecializedBotFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> id;
    private final Input<ModelIDInput> masterBotId;
    private final Input<ModelMasterBotSpecializedBotFilterInput> not;
    private final Input<List<ModelMasterBotSpecializedBotFilterInput>> or;
    private final Input<ModelIDInput> specializedBotId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> masterBotId = Input.absent();
        private Input<ModelIDInput> specializedBotId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelMasterBotSpecializedBotFilterInput>> and = Input.absent();
        private Input<List<ModelMasterBotSpecializedBotFilterInput>> or = Input.absent();
        private Input<ModelMasterBotSpecializedBotFilterInput> not = Input.absent();

        public Builder and(List<ModelMasterBotSpecializedBotFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelMasterBotSpecializedBotFilterInput build() {
            return new ModelMasterBotSpecializedBotFilterInput(this.id, this.masterBotId, this.specializedBotId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder masterBotId(ModelIDInput modelIDInput) {
            this.masterBotId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelMasterBotSpecializedBotFilterInput modelMasterBotSpecializedBotFilterInput) {
            this.not = Input.fromNullable(modelMasterBotSpecializedBotFilterInput);
            return this;
        }

        public Builder or(List<ModelMasterBotSpecializedBotFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder specializedBotId(ModelIDInput modelIDInput) {
            this.specializedBotId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelMasterBotSpecializedBotFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<List<ModelMasterBotSpecializedBotFilterInput>> input6, Input<List<ModelMasterBotSpecializedBotFilterInput>> input7, Input<ModelMasterBotSpecializedBotFilterInput> input8) {
        this.id = input;
        this.masterBotId = input2;
        this.specializedBotId = input3;
        this.createdAt = input4;
        this.updatedAt = input5;
        this.and = input6;
        this.or = input7;
        this.not = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelMasterBotSpecializedBotFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMasterBotSpecializedBotFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMasterBotSpecializedBotFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelMasterBotSpecializedBotFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelMasterBotSpecializedBotFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelMasterBotSpecializedBotFilterInput.this.masterBotId.defined) {
                    inputFieldWriter.writeObject("masterBotId", ModelMasterBotSpecializedBotFilterInput.this.masterBotId.value != 0 ? ((ModelIDInput) ModelMasterBotSpecializedBotFilterInput.this.masterBotId.value).marshaller() : null);
                }
                if (ModelMasterBotSpecializedBotFilterInput.this.specializedBotId.defined) {
                    inputFieldWriter.writeObject("specializedBotId", ModelMasterBotSpecializedBotFilterInput.this.specializedBotId.value != 0 ? ((ModelIDInput) ModelMasterBotSpecializedBotFilterInput.this.specializedBotId.value).marshaller() : null);
                }
                if (ModelMasterBotSpecializedBotFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelMasterBotSpecializedBotFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelMasterBotSpecializedBotFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelMasterBotSpecializedBotFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelMasterBotSpecializedBotFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelMasterBotSpecializedBotFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelMasterBotSpecializedBotFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelMasterBotSpecializedBotFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMasterBotSpecializedBotFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMasterBotSpecializedBotFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMasterBotSpecializedBotFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMasterBotSpecializedBotFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelMasterBotSpecializedBotFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMasterBotSpecializedBotFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMasterBotSpecializedBotFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMasterBotSpecializedBotFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMasterBotSpecializedBotFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelMasterBotSpecializedBotFilterInput.this.not.value != 0 ? ((ModelMasterBotSpecializedBotFilterInput) ModelMasterBotSpecializedBotFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput masterBotId() {
        return this.masterBotId.value;
    }

    public ModelMasterBotSpecializedBotFilterInput not() {
        return this.not.value;
    }

    public List<ModelMasterBotSpecializedBotFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput specializedBotId() {
        return this.specializedBotId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
