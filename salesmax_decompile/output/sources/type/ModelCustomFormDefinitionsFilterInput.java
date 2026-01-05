package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomFormDefinitionsFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomFormDefinitionsFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> displayName;
    private final Input<ModelStringInput> formName;
    private final Input<ModelStringInput> formTitle;
    private final Input<ModelIDInput> id;
    private final Input<ModelCustomFormDefinitionsFilterInput> not;
    private final Input<List<ModelCustomFormDefinitionsFilterInput>> or;
    private final Input<ModelIDInput> updaedById;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> formName = Input.absent();
        private Input<ModelStringInput> displayName = Input.absent();
        private Input<ModelStringInput> formTitle = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updaedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomFormDefinitionsFilterInput>> and = Input.absent();
        private Input<List<ModelCustomFormDefinitionsFilterInput>> or = Input.absent();
        private Input<ModelCustomFormDefinitionsFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomFormDefinitionsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomFormDefinitionsFilterInput build() {
            return new ModelCustomFormDefinitionsFilterInput(this.id, this.accountId, this.formName, this.displayName, this.formTitle, this.createdById, this.updaedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelCustomFormDefinitionsFilterInput modelCustomFormDefinitionsFilterInput) {
            this.not = Input.fromNullable(modelCustomFormDefinitionsFilterInput);
            return this;
        }

        public Builder or(List<ModelCustomFormDefinitionsFilterInput> list) {
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

    public ModelCustomFormDefinitionsFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelCustomFormDefinitionsFilterInput>> input10, Input<List<ModelCustomFormDefinitionsFilterInput>> input11, Input<ModelCustomFormDefinitionsFilterInput> input12) {
        this.id = input;
        this.accountId = input2;
        this.formName = input3;
        this.displayName = input4;
        this.formTitle = input5;
        this.createdById = input6;
        this.updaedById = input7;
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

    public List<ModelCustomFormDefinitionsFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomFormDefinitionsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomFormDefinitionsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCustomFormDefinitionsFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCustomFormDefinitionsFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomFormDefinitionsFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomFormDefinitionsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.formName.defined) {
                    inputFieldWriter.writeObject("formName", ModelCustomFormDefinitionsFilterInput.this.formName.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsFilterInput.this.formName.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.displayName.defined) {
                    inputFieldWriter.writeObject("displayName", ModelCustomFormDefinitionsFilterInput.this.displayName.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsFilterInput.this.displayName.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.formTitle.defined) {
                    inputFieldWriter.writeObject("formTitle", ModelCustomFormDefinitionsFilterInput.this.formTitle.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsFilterInput.this.formTitle.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelCustomFormDefinitionsFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelCustomFormDefinitionsFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.updaedById.defined) {
                    inputFieldWriter.writeObject("updaedById", ModelCustomFormDefinitionsFilterInput.this.updaedById.value != 0 ? ((ModelIDInput) ModelCustomFormDefinitionsFilterInput.this.updaedById.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomFormDefinitionsFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomFormDefinitionsFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomFormDefinitionsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomFormDefinitionsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomFormDefinitionsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomFormDefinitionsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomFormDefinitionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomFormDefinitionsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomFormDefinitionsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomFormDefinitionsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomFormDefinitionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomFormDefinitionsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomFormDefinitionsFilterInput.this.not.value != 0 ? ((ModelCustomFormDefinitionsFilterInput) ModelCustomFormDefinitionsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomFormDefinitionsFilterInput not() {
        return this.not.value;
    }

    public List<ModelCustomFormDefinitionsFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput updaedById() {
        return this.updaedById.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
