package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMasterBotSpecializedBotConditionInput implements InputType {
    private final Input<List<ModelMasterBotSpecializedBotConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> masterBotId;
    private final Input<ModelMasterBotSpecializedBotConditionInput> not;
    private final Input<List<ModelMasterBotSpecializedBotConditionInput>> or;
    private final Input<ModelIDInput> specializedBotId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> masterBotId = Input.absent();
        private Input<ModelIDInput> specializedBotId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelMasterBotSpecializedBotConditionInput>> and = Input.absent();
        private Input<List<ModelMasterBotSpecializedBotConditionInput>> or = Input.absent();
        private Input<ModelMasterBotSpecializedBotConditionInput> not = Input.absent();

        public Builder and(List<ModelMasterBotSpecializedBotConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelMasterBotSpecializedBotConditionInput build() {
            return new ModelMasterBotSpecializedBotConditionInput(this.masterBotId, this.specializedBotId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder masterBotId(ModelIDInput modelIDInput) {
            this.masterBotId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelMasterBotSpecializedBotConditionInput modelMasterBotSpecializedBotConditionInput) {
            this.not = Input.fromNullable(modelMasterBotSpecializedBotConditionInput);
            return this;
        }

        public Builder or(List<ModelMasterBotSpecializedBotConditionInput> list) {
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

    public ModelMasterBotSpecializedBotConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<List<ModelMasterBotSpecializedBotConditionInput>> input5, Input<List<ModelMasterBotSpecializedBotConditionInput>> input6, Input<ModelMasterBotSpecializedBotConditionInput> input7) {
        this.masterBotId = input;
        this.specializedBotId = input2;
        this.createdAt = input3;
        this.updatedAt = input4;
        this.and = input5;
        this.or = input6;
        this.not = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelMasterBotSpecializedBotConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMasterBotSpecializedBotConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMasterBotSpecializedBotConditionInput.this.masterBotId.defined) {
                    inputFieldWriter.writeObject("masterBotId", ModelMasterBotSpecializedBotConditionInput.this.masterBotId.value != 0 ? ((ModelIDInput) ModelMasterBotSpecializedBotConditionInput.this.masterBotId.value).marshaller() : null);
                }
                if (ModelMasterBotSpecializedBotConditionInput.this.specializedBotId.defined) {
                    inputFieldWriter.writeObject("specializedBotId", ModelMasterBotSpecializedBotConditionInput.this.specializedBotId.value != 0 ? ((ModelIDInput) ModelMasterBotSpecializedBotConditionInput.this.specializedBotId.value).marshaller() : null);
                }
                if (ModelMasterBotSpecializedBotConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelMasterBotSpecializedBotConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelMasterBotSpecializedBotConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelMasterBotSpecializedBotConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelMasterBotSpecializedBotConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelMasterBotSpecializedBotConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelMasterBotSpecializedBotConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelMasterBotSpecializedBotConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMasterBotSpecializedBotConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMasterBotSpecializedBotConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMasterBotSpecializedBotConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMasterBotSpecializedBotConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelMasterBotSpecializedBotConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMasterBotSpecializedBotConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMasterBotSpecializedBotConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMasterBotSpecializedBotConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMasterBotSpecializedBotConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelMasterBotSpecializedBotConditionInput.this.not.value != 0 ? ((ModelMasterBotSpecializedBotConditionInput) ModelMasterBotSpecializedBotConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput masterBotId() {
        return this.masterBotId.value;
    }

    public ModelMasterBotSpecializedBotConditionInput not() {
        return this.not.value;
    }

    public List<ModelMasterBotSpecializedBotConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput specializedBotId() {
        return this.specializedBotId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
