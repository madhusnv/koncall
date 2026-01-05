package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelSubmittedFormValueConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelSubmittedFormValueConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> extensionOfObject;
    private final Input<ModelStringInput> extensionOfProperty;
    private final Input<ModelIDInput> formId;
    private final Input<ModelSubmittedFormValueConditionInput> not;
    private final Input<ModelIDInput> objectId;
    private final Input<List<ModelSubmittedFormValueConditionInput>> or;
    private final Input<ModelIDInput> submittedBy;
    private final Input<ModelStringInput> submittedByIdType;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> value;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> formId = Input.absent();
        private Input<ModelStringInput> value = Input.absent();
        private Input<ModelStringInput> extensionOfProperty = Input.absent();
        private Input<ModelStringInput> extensionOfObject = Input.absent();
        private Input<ModelIDInput> objectId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> submittedBy = Input.absent();
        private Input<ModelStringInput> submittedByIdType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelSubmittedFormValueConditionInput>> and = Input.absent();
        private Input<List<ModelSubmittedFormValueConditionInput>> or = Input.absent();
        private Input<ModelSubmittedFormValueConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelSubmittedFormValueConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelSubmittedFormValueConditionInput build() {
            return new ModelSubmittedFormValueConditionInput(this.accountId, this.formId, this.value, this.extensionOfProperty, this.extensionOfObject, this.objectId, this.contactId, this.submittedBy, this.submittedByIdType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder extensionOfObject(ModelStringInput modelStringInput) {
            this.extensionOfObject = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder extensionOfProperty(ModelStringInput modelStringInput) {
            this.extensionOfProperty = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder formId(ModelIDInput modelIDInput) {
            this.formId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelSubmittedFormValueConditionInput modelSubmittedFormValueConditionInput) {
            this.not = Input.fromNullable(modelSubmittedFormValueConditionInput);
            return this;
        }

        public Builder objectId(ModelIDInput modelIDInput) {
            this.objectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder or(List<ModelSubmittedFormValueConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder submittedBy(ModelIDInput modelIDInput) {
            this.submittedBy = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder submittedByIdType(ModelStringInput modelStringInput) {
            this.submittedByIdType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder value(ModelStringInput modelStringInput) {
            this.value = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelSubmittedFormValueConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<List<ModelSubmittedFormValueConditionInput>> input12, Input<List<ModelSubmittedFormValueConditionInput>> input13, Input<ModelSubmittedFormValueConditionInput> input14) {
        this.accountId = input;
        this.formId = input2;
        this.value = input3;
        this.extensionOfProperty = input4;
        this.extensionOfObject = input5;
        this.objectId = input6;
        this.contactId = input7;
        this.submittedBy = input8;
        this.submittedByIdType = input9;
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

    public List<ModelSubmittedFormValueConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput extensionOfObject() {
        return this.extensionOfObject.value;
    }

    public ModelStringInput extensionOfProperty() {
        return this.extensionOfProperty.value;
    }

    public ModelIDInput formId() {
        return this.formId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSubmittedFormValueConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSubmittedFormValueConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelSubmittedFormValueConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.formId.defined) {
                    inputFieldWriter.writeObject("formId", ModelSubmittedFormValueConditionInput.this.formId.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueConditionInput.this.formId.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", ModelSubmittedFormValueConditionInput.this.value.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueConditionInput.this.value.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.extensionOfProperty.defined) {
                    inputFieldWriter.writeObject("extensionOfProperty", ModelSubmittedFormValueConditionInput.this.extensionOfProperty.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueConditionInput.this.extensionOfProperty.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.extensionOfObject.defined) {
                    inputFieldWriter.writeObject("extensionOfObject", ModelSubmittedFormValueConditionInput.this.extensionOfObject.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueConditionInput.this.extensionOfObject.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.objectId.defined) {
                    inputFieldWriter.writeObject("objectId", ModelSubmittedFormValueConditionInput.this.objectId.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueConditionInput.this.objectId.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelSubmittedFormValueConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.submittedBy.defined) {
                    inputFieldWriter.writeObject("submittedBy", ModelSubmittedFormValueConditionInput.this.submittedBy.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueConditionInput.this.submittedBy.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.submittedByIdType.defined) {
                    inputFieldWriter.writeObject("submittedByIdType", ModelSubmittedFormValueConditionInput.this.submittedByIdType.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueConditionInput.this.submittedByIdType.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelSubmittedFormValueConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelSubmittedFormValueConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelSubmittedFormValueConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSubmittedFormValueConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSubmittedFormValueConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSubmittedFormValueConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelSubmittedFormValueConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSubmittedFormValueConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSubmittedFormValueConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSubmittedFormValueConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSubmittedFormValueConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelSubmittedFormValueConditionInput.this.not.value != 0 ? ((ModelSubmittedFormValueConditionInput) ModelSubmittedFormValueConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelSubmittedFormValueConditionInput not() {
        return this.not.value;
    }

    public ModelIDInput objectId() {
        return this.objectId.value;
    }

    public List<ModelSubmittedFormValueConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput submittedBy() {
        return this.submittedBy.value;
    }

    public ModelStringInput submittedByIdType() {
        return this.submittedByIdType.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelStringInput value() {
        return this.value.value;
    }
}
