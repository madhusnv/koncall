package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDealAssociationConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDealAssociationConditionInput>> and;
    private final Input<ModelIDInput> businessId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> dealId;
    private final Input<ModelDealAssociationConditionInput> not;
    private final Input<List<ModelDealAssociationConditionInput>> or;
    private final Input<ModelIDInput> productId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> dealId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> businessId = Input.absent();
        private Input<ModelIDInput> productId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelDealAssociationConditionInput>> and = Input.absent();
        private Input<List<ModelDealAssociationConditionInput>> or = Input.absent();
        private Input<ModelDealAssociationConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDealAssociationConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelDealAssociationConditionInput build() {
            return new ModelDealAssociationConditionInput(this.accountId, this.dealId, this.contactId, this.businessId, this.productId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder businessId(ModelIDInput modelIDInput) {
            this.businessId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dealId(ModelIDInput modelIDInput) {
            this.dealId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelDealAssociationConditionInput modelDealAssociationConditionInput) {
            this.not = Input.fromNullable(modelDealAssociationConditionInput);
            return this;
        }

        public Builder or(List<ModelDealAssociationConditionInput> list) {
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
    }

    public ModelDealAssociationConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<List<ModelDealAssociationConditionInput>> input8, Input<List<ModelDealAssociationConditionInput>> input9, Input<ModelDealAssociationConditionInput> input10) {
        this.accountId = input;
        this.dealId = input2;
        this.contactId = input3;
        this.businessId = input4;
        this.productId = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
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

    public List<ModelDealAssociationConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput businessId() {
        return this.businessId.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput dealId() {
        return this.dealId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDealAssociationConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDealAssociationConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDealAssociationConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDealAssociationConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDealAssociationConditionInput.this.dealId.defined) {
                    inputFieldWriter.writeObject("dealId", ModelDealAssociationConditionInput.this.dealId.value != 0 ? ((ModelIDInput) ModelDealAssociationConditionInput.this.dealId.value).marshaller() : null);
                }
                if (ModelDealAssociationConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelDealAssociationConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelDealAssociationConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelDealAssociationConditionInput.this.businessId.defined) {
                    inputFieldWriter.writeObject("businessId", ModelDealAssociationConditionInput.this.businessId.value != 0 ? ((ModelIDInput) ModelDealAssociationConditionInput.this.businessId.value).marshaller() : null);
                }
                if (ModelDealAssociationConditionInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", ModelDealAssociationConditionInput.this.productId.value != 0 ? ((ModelIDInput) ModelDealAssociationConditionInput.this.productId.value).marshaller() : null);
                }
                if (ModelDealAssociationConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDealAssociationConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDealAssociationConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDealAssociationConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDealAssociationConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDealAssociationConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDealAssociationConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDealAssociationConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealAssociationConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealAssociationConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealAssociationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealAssociationConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDealAssociationConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealAssociationConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealAssociationConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealAssociationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealAssociationConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDealAssociationConditionInput.this.not.value != 0 ? ((ModelDealAssociationConditionInput) ModelDealAssociationConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelDealAssociationConditionInput not() {
        return this.not.value;
    }

    public List<ModelDealAssociationConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput productId() {
        return this.productId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
