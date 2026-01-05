package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductServiceAssociationConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductServiceAssociationConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelProductServiceAssociationConditionInput> not;
    private final Input<List<ModelProductServiceAssociationConditionInput>> or;
    private final Input<ModelIDInput> productId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> productId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelProductServiceAssociationConditionInput>> and = Input.absent();
        private Input<List<ModelProductServiceAssociationConditionInput>> or = Input.absent();
        private Input<ModelProductServiceAssociationConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductServiceAssociationConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductServiceAssociationConditionInput build() {
            return new ModelProductServiceAssociationConditionInput(this.productId, this.accountId, this.contactId, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelProductServiceAssociationConditionInput modelProductServiceAssociationConditionInput) {
            this.not = Input.fromNullable(modelProductServiceAssociationConditionInput);
            return this;
        }

        public Builder or(List<ModelProductServiceAssociationConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder productId(ModelIDInput modelIDInput) {
            this.productId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelProductServiceAssociationConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<List<ModelProductServiceAssociationConditionInput>> input8, Input<List<ModelProductServiceAssociationConditionInput>> input9, Input<ModelProductServiceAssociationConditionInput> input10) {
        this.productId = input;
        this.accountId = input2;
        this.contactId = input3;
        this.createdAt = input4;
        this.updatedAt = input5;
        this.createdById = input6;
        this.updatedById = input7;
        this.and = input8;
        this.or = input9;
        this.not = input10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelProductServiceAssociationConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductServiceAssociationConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductServiceAssociationConditionInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", ModelProductServiceAssociationConditionInput.this.productId.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationConditionInput.this.productId.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductServiceAssociationConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelProductServiceAssociationConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductServiceAssociationConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductServiceAssociationConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductServiceAssociationConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductServiceAssociationConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelProductServiceAssociationConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelProductServiceAssociationConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductServiceAssociationConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductServiceAssociationConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductServiceAssociationConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductServiceAssociationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductServiceAssociationConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductServiceAssociationConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductServiceAssociationConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductServiceAssociationConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductServiceAssociationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductServiceAssociationConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductServiceAssociationConditionInput.this.not.value != 0 ? ((ModelProductServiceAssociationConditionInput) ModelProductServiceAssociationConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelProductServiceAssociationConditionInput not() {
        return this.not.value;
    }

    public List<ModelProductServiceAssociationConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput productId() {
        return this.productId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }
}
