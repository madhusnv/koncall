package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomFormValuesFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomFormValuesFilterInput>> and;
    private final Input<ModelIDInput> id;
    private final Input<ModelCustomFormValuesFilterInput> not;
    private final Input<List<ModelCustomFormValuesFilterInput>> or;
    private final Input<ModelStringInput> parentObject;
    private final Input<ModelIDInput> parentObjectId;
    private final Input<ModelIDInput> propertyDefinitionId;
    private final Input<ModelStringInput> value;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> propertyDefinitionId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> parentObjectId = Input.absent();
        private Input<ModelStringInput> parentObject = Input.absent();
        private Input<ModelStringInput> value = Input.absent();
        private Input<List<ModelCustomFormValuesFilterInput>> and = Input.absent();
        private Input<List<ModelCustomFormValuesFilterInput>> or = Input.absent();
        private Input<ModelCustomFormValuesFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomFormValuesFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomFormValuesFilterInput build() {
            return new ModelCustomFormValuesFilterInput(this.id, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value, this.and, this.or, this.not);
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelCustomFormValuesFilterInput modelCustomFormValuesFilterInput) {
            this.not = Input.fromNullable(modelCustomFormValuesFilterInput);
            return this;
        }

        public Builder or(List<ModelCustomFormValuesFilterInput> list) {
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

    public ModelCustomFormValuesFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<List<ModelCustomFormValuesFilterInput>> input7, Input<List<ModelCustomFormValuesFilterInput>> input8, Input<ModelCustomFormValuesFilterInput> input9) {
        this.id = input;
        this.propertyDefinitionId = input2;
        this.accountId = input3;
        this.parentObjectId = input4;
        this.parentObject = input5;
        this.value = input6;
        this.and = input7;
        this.or = input8;
        this.not = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCustomFormValuesFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomFormValuesFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomFormValuesFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCustomFormValuesFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCustomFormValuesFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCustomFormValuesFilterInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeObject("propertyDefinitionId", ModelCustomFormValuesFilterInput.this.propertyDefinitionId.value != 0 ? ((ModelIDInput) ModelCustomFormValuesFilterInput.this.propertyDefinitionId.value).marshaller() : null);
                }
                if (ModelCustomFormValuesFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomFormValuesFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomFormValuesFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomFormValuesFilterInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", ModelCustomFormValuesFilterInput.this.parentObjectId.value != 0 ? ((ModelIDInput) ModelCustomFormValuesFilterInput.this.parentObjectId.value).marshaller() : null);
                }
                if (ModelCustomFormValuesFilterInput.this.parentObject.defined) {
                    inputFieldWriter.writeObject("parentObject", ModelCustomFormValuesFilterInput.this.parentObject.value != 0 ? ((ModelStringInput) ModelCustomFormValuesFilterInput.this.parentObject.value).marshaller() : null);
                }
                if (ModelCustomFormValuesFilterInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", ModelCustomFormValuesFilterInput.this.value.value != 0 ? ((ModelStringInput) ModelCustomFormValuesFilterInput.this.value.value).marshaller() : null);
                }
                if (ModelCustomFormValuesFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomFormValuesFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomFormValuesFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomFormValuesFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomFormValuesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomFormValuesFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomFormValuesFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomFormValuesFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomFormValuesFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomFormValuesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomFormValuesFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomFormValuesFilterInput.this.not.value != 0 ? ((ModelCustomFormValuesFilterInput) ModelCustomFormValuesFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomFormValuesFilterInput not() {
        return this.not.value;
    }

    public List<ModelCustomFormValuesFilterInput> or() {
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
