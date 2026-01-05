package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomFormDefinitionsConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomFormDefinitionsConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> displayName;
    private final Input<ModelStringInput> formName;
    private final Input<ModelStringInput> formTitle;
    private final Input<ModelCustomFormDefinitionsConditionInput> not;
    private final Input<List<ModelCustomFormDefinitionsConditionInput>> or;
    private final Input<ModelIDInput> updaedById;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> formName = Input.absent();
        private Input<ModelStringInput> displayName = Input.absent();
        private Input<ModelStringInput> formTitle = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updaedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomFormDefinitionsConditionInput>> and = Input.absent();
        private Input<List<ModelCustomFormDefinitionsConditionInput>> or = Input.absent();
        private Input<ModelCustomFormDefinitionsConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomFormDefinitionsConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomFormDefinitionsConditionInput build() {
            return new ModelCustomFormDefinitionsConditionInput(this.accountId, this.formName, this.displayName, this.formTitle, this.createdById, this.updaedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder displayName(ModelStringInput modelStringInput) {
            this.displayName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder formName(ModelStringInput modelStringInput) {
            this.formName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder formTitle(ModelStringInput modelStringInput) {
            this.formTitle = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelCustomFormDefinitionsConditionInput modelCustomFormDefinitionsConditionInput) {
            this.not = Input.fromNullable(modelCustomFormDefinitionsConditionInput);
            return this;
        }

        public Builder or(List<ModelCustomFormDefinitionsConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updaedById(ModelIDInput modelIDInput) {
            this.updaedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCustomFormDefinitionsConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelCustomFormDefinitionsConditionInput>> input9, Input<List<ModelCustomFormDefinitionsConditionInput>> input10, Input<ModelCustomFormDefinitionsConditionInput> input11) {
        this.accountId = input;
        this.formName = input2;
        this.displayName = input3;
        this.formTitle = input4;
        this.createdById = input5;
        this.updaedById = input6;
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

    public List<ModelCustomFormDefinitionsConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelStringInput displayName() {
        return this.displayName.value;
    }

    public ModelStringInput formName() {
        return this.formName.value;
    }

    public ModelStringInput formTitle() {
        return this.formTitle.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomFormDefinitionsConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomFormDefinitionsConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomFormDefinitionsConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomFormDefinitionsConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.formName.defined) {
                    inputFieldWriter.writeObject("formName", ModelCustomFormDefinitionsConditionInput.this.formName.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsConditionInput.this.formName.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.displayName.defined) {
                    inputFieldWriter.writeObject("displayName", ModelCustomFormDefinitionsConditionInput.this.displayName.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsConditionInput.this.displayName.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.formTitle.defined) {
                    inputFieldWriter.writeObject("formTitle", ModelCustomFormDefinitionsConditionInput.this.formTitle.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsConditionInput.this.formTitle.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelCustomFormDefinitionsConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelCustomFormDefinitionsConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.updaedById.defined) {
                    inputFieldWriter.writeObject("updaedById", ModelCustomFormDefinitionsConditionInput.this.updaedById.value != 0 ? ((ModelIDInput) ModelCustomFormDefinitionsConditionInput.this.updaedById.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomFormDefinitionsConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomFormDefinitionsConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomFormDefinitionsConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomFormDefinitionsConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomFormDefinitionsConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomFormDefinitionsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomFormDefinitionsConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomFormDefinitionsConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomFormDefinitionsConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomFormDefinitionsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomFormDefinitionsConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomFormDefinitionsConditionInput.this.not.value != 0 ? ((ModelCustomFormDefinitionsConditionInput) ModelCustomFormDefinitionsConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomFormDefinitionsConditionInput not() {
        return this.not.value;
    }

    public List<ModelCustomFormDefinitionsConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput updaedById() {
        return this.updaedById.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
