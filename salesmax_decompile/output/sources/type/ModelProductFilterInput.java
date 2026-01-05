package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductFilterInput>> and;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> name;
    private final Input<ModelProductFilterInput> not;
    private final Input<List<ModelProductFilterInput>> or;
    private final Input<ModelStringInput> productDescription;
    private final Input<ModelStringInput> productType;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> productDescription = Input.absent();
        private Input<ModelStringInput> productType = Input.absent();
        private Input<List<ModelProductFilterInput>> and = Input.absent();
        private Input<List<ModelProductFilterInput>> or = Input.absent();
        private Input<ModelProductFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductFilterInput build() {
            return new ModelProductFilterInput(this.id, this.accountId, this.name, this.productDescription, this.productType, this.and, this.or, this.not);
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelProductFilterInput modelProductFilterInput) {
            this.not = Input.fromNullable(modelProductFilterInput);
            return this;
        }

        public Builder or(List<ModelProductFilterInput> list) {
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

    public ModelProductFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<List<ModelProductFilterInput>> input6, Input<List<ModelProductFilterInput>> input7, Input<ModelProductFilterInput> input8) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.productDescription = input4;
        this.productType = input5;
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

    public List<ModelProductFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelProductFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelProductFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelProductFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelProductFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelProductFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelProductFilterInput.this.productDescription.defined) {
                    inputFieldWriter.writeObject("productDescription", ModelProductFilterInput.this.productDescription.value != 0 ? ((ModelStringInput) ModelProductFilterInput.this.productDescription.value).marshaller() : null);
                }
                if (ModelProductFilterInput.this.productType.defined) {
                    inputFieldWriter.writeObject("productType", ModelProductFilterInput.this.productType.value != 0 ? ((ModelStringInput) ModelProductFilterInput.this.productType.value).marshaller() : null);
                }
                if (ModelProductFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductFilterInput.this.not.value != 0 ? ((ModelProductFilterInput) ModelProductFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelProductFilterInput not() {
        return this.not.value;
    }

    public List<ModelProductFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput productDescription() {
        return this.productDescription.value;
    }

    public ModelStringInput productType() {
        return this.productType.value;
    }
}
