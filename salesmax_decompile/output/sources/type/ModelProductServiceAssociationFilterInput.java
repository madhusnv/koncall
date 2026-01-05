package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductServiceAssociationFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductServiceAssociationFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelIDInput> id;
    private final Input<ModelProductServiceAssociationFilterInput> not;
    private final Input<List<ModelProductServiceAssociationFilterInput>> or;
    private final Input<ModelIDInput> productId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> productId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelProductServiceAssociationFilterInput>> and = Input.absent();
        private Input<List<ModelProductServiceAssociationFilterInput>> or = Input.absent();
        private Input<ModelProductServiceAssociationFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductServiceAssociationFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductServiceAssociationFilterInput build() {
            return new ModelProductServiceAssociationFilterInput(this.id, this.productId, this.accountId, this.contactId, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelProductServiceAssociationFilterInput modelProductServiceAssociationFilterInput) {
            this.not = Input.fromNullable(modelProductServiceAssociationFilterInput);
            return this;
        }

        public Builder or(List<ModelProductServiceAssociationFilterInput> list) {
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

    public ModelProductServiceAssociationFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<List<ModelProductServiceAssociationFilterInput>> input9, Input<List<ModelProductServiceAssociationFilterInput>> input10, Input<ModelProductServiceAssociationFilterInput> input11) {
        this.id = input;
        this.productId = input2;
        this.accountId = input3;
        this.contactId = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
        this.createdById = input7;
        this.updatedById = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelProductServiceAssociationFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductServiceAssociationFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductServiceAssociationFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelProductServiceAssociationFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", ModelProductServiceAssociationFilterInput.this.productId.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationFilterInput.this.productId.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductServiceAssociationFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelProductServiceAssociationFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductServiceAssociationFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductServiceAssociationFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductServiceAssociationFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductServiceAssociationFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelProductServiceAssociationFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelProductServiceAssociationFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelProductServiceAssociationFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductServiceAssociationFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductServiceAssociationFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductServiceAssociationFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductServiceAssociationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductServiceAssociationFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductServiceAssociationFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductServiceAssociationFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductServiceAssociationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductServiceAssociationFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductServiceAssociationFilterInput.this.not.value != 0 ? ((ModelProductServiceAssociationFilterInput) ModelProductServiceAssociationFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelProductServiceAssociationFilterInput not() {
        return this.not.value;
    }

    public List<ModelProductServiceAssociationFilterInput> or() {
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
