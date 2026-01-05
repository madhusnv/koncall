package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDealAssociationFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDealAssociationFilterInput>> and;
    private final Input<ModelIDInput> businessId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> dealId;
    private final Input<ModelIDInput> id;
    private final Input<ModelDealAssociationFilterInput> not;
    private final Input<List<ModelDealAssociationFilterInput>> or;
    private final Input<ModelIDInput> productId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> dealId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> businessId = Input.absent();
        private Input<ModelIDInput> productId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelDealAssociationFilterInput>> and = Input.absent();
        private Input<List<ModelDealAssociationFilterInput>> or = Input.absent();
        private Input<ModelDealAssociationFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDealAssociationFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelDealAssociationFilterInput build() {
            return new ModelDealAssociationFilterInput(this.id, this.accountId, this.dealId, this.contactId, this.businessId, this.productId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelDealAssociationFilterInput modelDealAssociationFilterInput) {
            this.not = Input.fromNullable(modelDealAssociationFilterInput);
            return this;
        }

        public Builder or(List<ModelDealAssociationFilterInput> list) {
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

    public ModelDealAssociationFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelDealAssociationFilterInput>> input9, Input<List<ModelDealAssociationFilterInput>> input10, Input<ModelDealAssociationFilterInput> input11) {
        this.id = input;
        this.accountId = input2;
        this.dealId = input3;
        this.contactId = input4;
        this.businessId = input5;
        this.productId = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
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

    public List<ModelDealAssociationFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDealAssociationFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDealAssociationFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelDealAssociationFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelDealAssociationFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelDealAssociationFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDealAssociationFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDealAssociationFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDealAssociationFilterInput.this.dealId.defined) {
                    inputFieldWriter.writeObject("dealId", ModelDealAssociationFilterInput.this.dealId.value != 0 ? ((ModelIDInput) ModelDealAssociationFilterInput.this.dealId.value).marshaller() : null);
                }
                if (ModelDealAssociationFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelDealAssociationFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelDealAssociationFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelDealAssociationFilterInput.this.businessId.defined) {
                    inputFieldWriter.writeObject("businessId", ModelDealAssociationFilterInput.this.businessId.value != 0 ? ((ModelIDInput) ModelDealAssociationFilterInput.this.businessId.value).marshaller() : null);
                }
                if (ModelDealAssociationFilterInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", ModelDealAssociationFilterInput.this.productId.value != 0 ? ((ModelIDInput) ModelDealAssociationFilterInput.this.productId.value).marshaller() : null);
                }
                if (ModelDealAssociationFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDealAssociationFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDealAssociationFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDealAssociationFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDealAssociationFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDealAssociationFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDealAssociationFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDealAssociationFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealAssociationFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealAssociationFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealAssociationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealAssociationFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDealAssociationFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealAssociationFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealAssociationFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealAssociationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealAssociationFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDealAssociationFilterInput.this.not.value != 0 ? ((ModelDealAssociationFilterInput) ModelDealAssociationFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelDealAssociationFilterInput not() {
        return this.not.value;
    }

    public List<ModelDealAssociationFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput productId() {
        return this.productId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
