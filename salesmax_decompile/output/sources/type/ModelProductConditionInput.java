package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductConditionInput>> and;
    private final Input<ModelStringInput> name;
    private final Input<ModelProductConditionInput> not;
    private final Input<List<ModelProductConditionInput>> or;
    private final Input<ModelStringInput> productDescription;
    private final Input<ModelStringInput> productType;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> productDescription = Input.absent();
        private Input<ModelStringInput> productType = Input.absent();
        private Input<List<ModelProductConditionInput>> and = Input.absent();
        private Input<List<ModelProductConditionInput>> or = Input.absent();
        private Input<ModelProductConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductConditionInput build() {
            return new ModelProductConditionInput(this.accountId, this.name, this.productDescription, this.productType, this.and, this.or, this.not);
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelProductConditionInput modelProductConditionInput) {
            this.not = Input.fromNullable(modelProductConditionInput);
            return this;
        }

        public Builder or(List<ModelProductConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder productDescription(ModelStringInput modelStringInput) {
            this.productDescription = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder productType(ModelStringInput modelStringInput) {
            this.productType = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelProductConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<List<ModelProductConditionInput>> input5, Input<List<ModelProductConditionInput>> input6, Input<ModelProductConditionInput> input7) {
        this.accountId = input;
        this.name = input2;
        this.productDescription = input3;
        this.productType = input4;
        this.and = input5;
        this.or = input6;
        this.not = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelProductConditionInput> and() {
        return this.and.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelProductConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelProductConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelProductConditionInput.this.productDescription.defined) {
                    inputFieldWriter.writeObject("productDescription", ModelProductConditionInput.this.productDescription.value != 0 ? ((ModelStringInput) ModelProductConditionInput.this.productDescription.value).marshaller() : null);
                }
                if (ModelProductConditionInput.this.productType.defined) {
                    inputFieldWriter.writeObject("productType", ModelProductConditionInput.this.productType.value != 0 ? ((ModelStringInput) ModelProductConditionInput.this.productType.value).marshaller() : null);
                }
                if (ModelProductConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductConditionInput.this.not.value != 0 ? ((ModelProductConditionInput) ModelProductConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelProductConditionInput not() {
        return this.not.value;
    }

    public List<ModelProductConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput productDescription() {
        return this.productDescription.value;
    }

    public ModelStringInput productType() {
        return this.productType.value;
    }
}
