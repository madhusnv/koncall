package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelSubmittedFormValueFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelSubmittedFormValueFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> extensionOfObject;
    private final Input<ModelStringInput> extensionOfProperty;
    private final Input<ModelIDInput> formId;
    private final Input<ModelIDInput> id;
    private final Input<ModelSubmittedFormValueFilterInput> not;
    private final Input<ModelIDInput> objectId;
    private final Input<List<ModelSubmittedFormValueFilterInput>> or;
    private final Input<ModelIDInput> submittedBy;
    private final Input<ModelStringInput> submittedByIdType;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> value;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelSubmittedFormValueFilterInput>> and = Input.absent();
        private Input<List<ModelSubmittedFormValueFilterInput>> or = Input.absent();
        private Input<ModelSubmittedFormValueFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelSubmittedFormValueFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelSubmittedFormValueFilterInput build() {
            return new ModelSubmittedFormValueFilterInput(this.id, this.accountId, this.formId, this.value, this.extensionOfProperty, this.extensionOfObject, this.objectId, this.contactId, this.submittedBy, this.submittedByIdType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelSubmittedFormValueFilterInput modelSubmittedFormValueFilterInput) {
            this.not = Input.fromNullable(modelSubmittedFormValueFilterInput);
            return this;
        }

        public Builder objectId(ModelIDInput modelIDInput) {
            this.objectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder or(List<ModelSubmittedFormValueFilterInput> list) {
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

    public ModelSubmittedFormValueFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<List<ModelSubmittedFormValueFilterInput>> input13, Input<List<ModelSubmittedFormValueFilterInput>> input14, Input<ModelSubmittedFormValueFilterInput> input15) {
        this.id = input;
        this.accountId = input2;
        this.formId = input3;
        this.value = input4;
        this.extensionOfProperty = input5;
        this.extensionOfObject = input6;
        this.objectId = input7;
        this.contactId = input8;
        this.submittedBy = input9;
        this.submittedByIdType = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.and = input13;
        this.or = input14;
        this.not = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelSubmittedFormValueFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSubmittedFormValueFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSubmittedFormValueFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelSubmittedFormValueFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelSubmittedFormValueFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.formId.defined) {
                    inputFieldWriter.writeObject("formId", ModelSubmittedFormValueFilterInput.this.formId.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueFilterInput.this.formId.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", ModelSubmittedFormValueFilterInput.this.value.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueFilterInput.this.value.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.extensionOfProperty.defined) {
                    inputFieldWriter.writeObject("extensionOfProperty", ModelSubmittedFormValueFilterInput.this.extensionOfProperty.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueFilterInput.this.extensionOfProperty.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.extensionOfObject.defined) {
                    inputFieldWriter.writeObject("extensionOfObject", ModelSubmittedFormValueFilterInput.this.extensionOfObject.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueFilterInput.this.extensionOfObject.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.objectId.defined) {
                    inputFieldWriter.writeObject("objectId", ModelSubmittedFormValueFilterInput.this.objectId.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueFilterInput.this.objectId.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelSubmittedFormValueFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.submittedBy.defined) {
                    inputFieldWriter.writeObject("submittedBy", ModelSubmittedFormValueFilterInput.this.submittedBy.value != 0 ? ((ModelIDInput) ModelSubmittedFormValueFilterInput.this.submittedBy.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.submittedByIdType.defined) {
                    inputFieldWriter.writeObject("submittedByIdType", ModelSubmittedFormValueFilterInput.this.submittedByIdType.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueFilterInput.this.submittedByIdType.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelSubmittedFormValueFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelSubmittedFormValueFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelSubmittedFormValueFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelSubmittedFormValueFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSubmittedFormValueFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSubmittedFormValueFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSubmittedFormValueFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelSubmittedFormValueFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSubmittedFormValueFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSubmittedFormValueFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSubmittedFormValueFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSubmittedFormValueFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelSubmittedFormValueFilterInput.this.not.value != 0 ? ((ModelSubmittedFormValueFilterInput) ModelSubmittedFormValueFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelSubmittedFormValueFilterInput not() {
        return this.not.value;
    }

    public ModelIDInput objectId() {
        return this.objectId.value;
    }

    public List<ModelSubmittedFormValueFilterInput> or() {
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
