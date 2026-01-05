package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomPropertyIndexForAccountConditionInput implements InputType {
    private final Input<List<ModelCustomPropertyIndexForAccountConditionInput>> and;
    private final Input<ModelIntInput> boolIndex;
    private final Input<ModelIntInput> boolIndexUser;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelCustomPropertyIndexForAccountConditionInput> not;
    private final Input<ModelIntInput> numIndex;
    private final Input<ModelIntInput> numIndexUser;
    private final Input<List<ModelCustomPropertyIndexForAccountConditionInput>> or;
    private final Input<ModelIntInput> textIndex;
    private final Input<ModelIntInput> textIndexUser;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIntInput> textIndex = Input.absent();
        private Input<ModelIntInput> numIndex = Input.absent();
        private Input<ModelIntInput> boolIndex = Input.absent();
        private Input<ModelIntInput> textIndexUser = Input.absent();
        private Input<ModelIntInput> numIndexUser = Input.absent();
        private Input<ModelIntInput> boolIndexUser = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomPropertyIndexForAccountConditionInput>> and = Input.absent();
        private Input<List<ModelCustomPropertyIndexForAccountConditionInput>> or = Input.absent();
        private Input<ModelCustomPropertyIndexForAccountConditionInput> not = Input.absent();

        public Builder and(List<ModelCustomPropertyIndexForAccountConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder boolIndex(ModelIntInput modelIntInput) {
            this.boolIndex = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder boolIndexUser(ModelIntInput modelIntInput) {
            this.boolIndexUser = Input.fromNullable(modelIntInput);
            return this;
        }

        public ModelCustomPropertyIndexForAccountConditionInput build() {
            return new ModelCustomPropertyIndexForAccountConditionInput(this.textIndex, this.numIndex, this.boolIndex, this.textIndexUser, this.numIndexUser, this.boolIndexUser, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelCustomPropertyIndexForAccountConditionInput modelCustomPropertyIndexForAccountConditionInput) {
            this.not = Input.fromNullable(modelCustomPropertyIndexForAccountConditionInput);
            return this;
        }

        public Builder numIndex(ModelIntInput modelIntInput) {
            this.numIndex = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder numIndexUser(ModelIntInput modelIntInput) {
            this.numIndexUser = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder or(List<ModelCustomPropertyIndexForAccountConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder textIndex(ModelIntInput modelIntInput) {
            this.textIndex = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder textIndexUser(ModelIntInput modelIntInput) {
            this.textIndexUser = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCustomPropertyIndexForAccountConditionInput(Input<ModelIntInput> input, Input<ModelIntInput> input2, Input<ModelIntInput> input3, Input<ModelIntInput> input4, Input<ModelIntInput> input5, Input<ModelIntInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelCustomPropertyIndexForAccountConditionInput>> input9, Input<List<ModelCustomPropertyIndexForAccountConditionInput>> input10, Input<ModelCustomPropertyIndexForAccountConditionInput> input11) {
        this.textIndex = input;
        this.numIndex = input2;
        this.boolIndex = input3;
        this.textIndexUser = input4;
        this.numIndexUser = input5;
        this.boolIndexUser = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelCustomPropertyIndexForAccountConditionInput> and() {
        return this.and.value;
    }

    public ModelIntInput boolIndex() {
        return this.boolIndex.value;
    }

    public ModelIntInput boolIndexUser() {
        return this.boolIndexUser.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomPropertyIndexForAccountConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomPropertyIndexForAccountConditionInput.this.textIndex.defined) {
                    inputFieldWriter.writeObject("textIndex", ModelCustomPropertyIndexForAccountConditionInput.this.textIndex.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountConditionInput.this.textIndex.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.numIndex.defined) {
                    inputFieldWriter.writeObject("numIndex", ModelCustomPropertyIndexForAccountConditionInput.this.numIndex.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountConditionInput.this.numIndex.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.boolIndex.defined) {
                    inputFieldWriter.writeObject("boolIndex", ModelCustomPropertyIndexForAccountConditionInput.this.boolIndex.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountConditionInput.this.boolIndex.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.textIndexUser.defined) {
                    inputFieldWriter.writeObject("textIndexUser", ModelCustomPropertyIndexForAccountConditionInput.this.textIndexUser.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountConditionInput.this.textIndexUser.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.numIndexUser.defined) {
                    inputFieldWriter.writeObject("numIndexUser", ModelCustomPropertyIndexForAccountConditionInput.this.numIndexUser.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountConditionInput.this.numIndexUser.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.boolIndexUser.defined) {
                    inputFieldWriter.writeObject("boolIndexUser", ModelCustomPropertyIndexForAccountConditionInput.this.boolIndexUser.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountConditionInput.this.boolIndexUser.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomPropertyIndexForAccountConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyIndexForAccountConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomPropertyIndexForAccountConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyIndexForAccountConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomPropertyIndexForAccountConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyIndexForAccountConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyIndexForAccountConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyIndexForAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomPropertyIndexForAccountConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyIndexForAccountConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyIndexForAccountConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyIndexForAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyIndexForAccountConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomPropertyIndexForAccountConditionInput.this.not.value != 0 ? ((ModelCustomPropertyIndexForAccountConditionInput) ModelCustomPropertyIndexForAccountConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomPropertyIndexForAccountConditionInput not() {
        return this.not.value;
    }

    public ModelIntInput numIndex() {
        return this.numIndex.value;
    }

    public ModelIntInput numIndexUser() {
        return this.numIndexUser.value;
    }

    public List<ModelCustomPropertyIndexForAccountConditionInput> or() {
        return this.or.value;
    }

    public ModelIntInput textIndex() {
        return this.textIndex.value;
    }

    public ModelIntInput textIndexUser() {
        return this.textIndexUser.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
