package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomFormValuesConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomFormValuesConditionInput>> and;
    private final Input<ModelCustomFormValuesConditionInput> not;
    private final Input<List<ModelCustomFormValuesConditionInput>> or;
    private final Input<ModelStringInput> parentObject;
    private final Input<ModelIDInput> parentObjectId;
    private final Input<ModelIDInput> propertyDefinitionId;
    private final Input<ModelStringInput> value;

    public static final class Builder {
        private Input<ModelIDInput> propertyDefinitionId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> parentObjectId = Input.absent();
        private Input<ModelStringInput> parentObject = Input.absent();
        private Input<ModelStringInput> value = Input.absent();
        private Input<List<ModelCustomFormValuesConditionInput>> and = Input.absent();
        private Input<List<ModelCustomFormValuesConditionInput>> or = Input.absent();
        private Input<ModelCustomFormValuesConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomFormValuesConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomFormValuesConditionInput build() {
            return new ModelCustomFormValuesConditionInput(this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value, this.and, this.or, this.not);
        }

        public Builder not(ModelCustomFormValuesConditionInput modelCustomFormValuesConditionInput) {
            this.not = Input.fromNullable(modelCustomFormValuesConditionInput);
            return this;
        }

        public Builder or(List<ModelCustomFormValuesConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObject(ModelStringInput modelStringInput) {
            this.parentObject = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder parentObjectId(ModelIDInput modelIDInput) {
            this.parentObjectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder propertyDefinitionId(ModelIDInput modelIDInput) {
            this.propertyDefinitionId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder value(ModelStringInput modelStringInput) {
            this.value = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCustomFormValuesConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<List<ModelCustomFormValuesConditionInput>> input6, Input<List<ModelCustomFormValuesConditionInput>> input7, Input<ModelCustomFormValuesConditionInput> input8) {
        this.propertyDefinitionId = input;
        this.accountId = input2;
        this.parentObjectId = input3;
        this.parentObject = input4;
        this.value = input5;
        this.and = input6;
        this.or = input7;
        this.not = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCustomFormValuesConditionInput> and() {
        return this.and.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomFormValuesConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomFormValuesConditionInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeObject("propertyDefinitionId", ModelCustomFormValuesConditionInput.this.propertyDefinitionId.value != 0 ? ((ModelIDInput) ModelCustomFormValuesConditionInput.this.propertyDefinitionId.value).marshaller() : null);
                }
                if (ModelCustomFormValuesConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomFormValuesConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomFormValuesConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomFormValuesConditionInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", ModelCustomFormValuesConditionInput.this.parentObjectId.value != 0 ? ((ModelIDInput) ModelCustomFormValuesConditionInput.this.parentObjectId.value).marshaller() : null);
                }
                if (ModelCustomFormValuesConditionInput.this.parentObject.defined) {
                    inputFieldWriter.writeObject("parentObject", ModelCustomFormValuesConditionInput.this.parentObject.value != 0 ? ((ModelStringInput) ModelCustomFormValuesConditionInput.this.parentObject.value).marshaller() : null);
                }
                if (ModelCustomFormValuesConditionInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", ModelCustomFormValuesConditionInput.this.value.value != 0 ? ((ModelStringInput) ModelCustomFormValuesConditionInput.this.value.value).marshaller() : null);
                }
                if (ModelCustomFormValuesConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomFormValuesConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomFormValuesConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomFormValuesConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomFormValuesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomFormValuesConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomFormValuesConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomFormValuesConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomFormValuesConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomFormValuesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomFormValuesConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomFormValuesConditionInput.this.not.value != 0 ? ((ModelCustomFormValuesConditionInput) ModelCustomFormValuesConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomFormValuesConditionInput not() {
        return this.not.value;
    }

    public List<ModelCustomFormValuesConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput parentObject() {
        return this.parentObject.value;
    }

    public ModelIDInput parentObjectId() {
        return this.parentObjectId.value;
    }

    public ModelIDInput propertyDefinitionId() {
        return this.propertyDefinitionId.value;
    }

    public ModelStringInput value() {
        return this.value.value;
    }
}
