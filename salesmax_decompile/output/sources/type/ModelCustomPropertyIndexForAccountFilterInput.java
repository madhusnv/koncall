package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomPropertyIndexForAccountFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomPropertyIndexForAccountFilterInput>> and;
    private final Input<ModelIntInput> boolIndex;
    private final Input<ModelIntInput> boolIndexUser;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelCustomPropertyIndexForAccountFilterInput> not;
    private final Input<ModelIntInput> numIndex;
    private final Input<ModelIntInput> numIndexUser;
    private final Input<List<ModelCustomPropertyIndexForAccountFilterInput>> or;
    private final Input<ModelIntInput> textIndex;
    private final Input<ModelIntInput> textIndexUser;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIntInput> textIndex = Input.absent();
        private Input<ModelIntInput> numIndex = Input.absent();
        private Input<ModelIntInput> boolIndex = Input.absent();
        private Input<ModelIntInput> textIndexUser = Input.absent();
        private Input<ModelIntInput> numIndexUser = Input.absent();
        private Input<ModelIntInput> boolIndexUser = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomPropertyIndexForAccountFilterInput>> and = Input.absent();
        private Input<List<ModelCustomPropertyIndexForAccountFilterInput>> or = Input.absent();
        private Input<ModelCustomPropertyIndexForAccountFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomPropertyIndexForAccountFilterInput> list) {
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

        public ModelCustomPropertyIndexForAccountFilterInput build() {
            return new ModelCustomPropertyIndexForAccountFilterInput(this.accountId, this.textIndex, this.numIndex, this.boolIndex, this.textIndexUser, this.numIndexUser, this.boolIndexUser, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelCustomPropertyIndexForAccountFilterInput modelCustomPropertyIndexForAccountFilterInput) {
            this.not = Input.fromNullable(modelCustomPropertyIndexForAccountFilterInput);
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

        public Builder or(List<ModelCustomPropertyIndexForAccountFilterInput> list) {
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

    public ModelCustomPropertyIndexForAccountFilterInput(Input<ModelIDInput> input, Input<ModelIntInput> input2, Input<ModelIntInput> input3, Input<ModelIntInput> input4, Input<ModelIntInput> input5, Input<ModelIntInput> input6, Input<ModelIntInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelCustomPropertyIndexForAccountFilterInput>> input10, Input<List<ModelCustomPropertyIndexForAccountFilterInput>> input11, Input<ModelCustomPropertyIndexForAccountFilterInput> input12) {
        this.accountId = input;
        this.textIndex = input2;
        this.numIndex = input3;
        this.boolIndex = input4;
        this.textIndexUser = input5;
        this.numIndexUser = input6;
        this.boolIndexUser = input7;
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

    public List<ModelCustomPropertyIndexForAccountFilterInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelCustomPropertyIndexForAccountFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomPropertyIndexForAccountFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomPropertyIndexForAccountFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomPropertyIndexForAccountFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.textIndex.defined) {
                    inputFieldWriter.writeObject("textIndex", ModelCustomPropertyIndexForAccountFilterInput.this.textIndex.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountFilterInput.this.textIndex.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.numIndex.defined) {
                    inputFieldWriter.writeObject("numIndex", ModelCustomPropertyIndexForAccountFilterInput.this.numIndex.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountFilterInput.this.numIndex.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.boolIndex.defined) {
                    inputFieldWriter.writeObject("boolIndex", ModelCustomPropertyIndexForAccountFilterInput.this.boolIndex.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountFilterInput.this.boolIndex.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.textIndexUser.defined) {
                    inputFieldWriter.writeObject("textIndexUser", ModelCustomPropertyIndexForAccountFilterInput.this.textIndexUser.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountFilterInput.this.textIndexUser.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.numIndexUser.defined) {
                    inputFieldWriter.writeObject("numIndexUser", ModelCustomPropertyIndexForAccountFilterInput.this.numIndexUser.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountFilterInput.this.numIndexUser.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.boolIndexUser.defined) {
                    inputFieldWriter.writeObject("boolIndexUser", ModelCustomPropertyIndexForAccountFilterInput.this.boolIndexUser.value != 0 ? ((ModelIntInput) ModelCustomPropertyIndexForAccountFilterInput.this.boolIndexUser.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomPropertyIndexForAccountFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyIndexForAccountFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomPropertyIndexForAccountFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyIndexForAccountFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomPropertyIndexForAccountFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyIndexForAccountFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyIndexForAccountFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyIndexForAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomPropertyIndexForAccountFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyIndexForAccountFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyIndexForAccountFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyIndexForAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyIndexForAccountFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomPropertyIndexForAccountFilterInput.this.not.value != 0 ? ((ModelCustomPropertyIndexForAccountFilterInput) ModelCustomPropertyIndexForAccountFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomPropertyIndexForAccountFilterInput not() {
        return this.not.value;
    }

    public ModelIntInput numIndex() {
        return this.numIndex.value;
    }

    public ModelIntInput numIndexUser() {
        return this.numIndexUser.value;
    }

    public List<ModelCustomPropertyIndexForAccountFilterInput> or() {
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
