package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelContactBusinessMembershipConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelContactBusinessMembershipConditionInput>> and;
    private final Input<ModelAssociatedCreationTypeInput> associatedCreationType;
    private final Input<ModelIDInput> businessId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> contactRelationship;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> department;
    private final Input<ModelStringInput> designation;
    private final Input<ModelContactBusinessMembershipConditionInput> not;
    private final Input<List<ModelContactBusinessMembershipConditionInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> businessId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> contactRelationship = Input.absent();
        private Input<ModelStringInput> department = Input.absent();
        private Input<ModelStringInput> designation = Input.absent();
        private Input<ModelAssociatedCreationTypeInput> associatedCreationType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelContactBusinessMembershipConditionInput>> and = Input.absent();
        private Input<List<ModelContactBusinessMembershipConditionInput>> or = Input.absent();
        private Input<ModelContactBusinessMembershipConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelContactBusinessMembershipConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder associatedCreationType(ModelAssociatedCreationTypeInput modelAssociatedCreationTypeInput) {
            this.associatedCreationType = Input.fromNullable(modelAssociatedCreationTypeInput);
            return this;
        }

        public ModelContactBusinessMembershipConditionInput build() {
            return new ModelContactBusinessMembershipConditionInput(this.accountId, this.businessId, this.contactId, this.contactRelationship, this.department, this.designation, this.associatedCreationType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder businessId(ModelIDInput modelIDInput) {
            this.businessId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactRelationship(ModelStringInput modelStringInput) {
            this.contactRelationship = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder department(ModelStringInput modelStringInput) {
            this.department = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder designation(ModelStringInput modelStringInput) {
            this.designation = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelContactBusinessMembershipConditionInput modelContactBusinessMembershipConditionInput) {
            this.not = Input.fromNullable(modelContactBusinessMembershipConditionInput);
            return this;
        }

        public Builder or(List<ModelContactBusinessMembershipConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelContactBusinessMembershipConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelAssociatedCreationTypeInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelContactBusinessMembershipConditionInput>> input10, Input<List<ModelContactBusinessMembershipConditionInput>> input11, Input<ModelContactBusinessMembershipConditionInput> input12) {
        this.accountId = input;
        this.businessId = input2;
        this.contactId = input3;
        this.contactRelationship = input4;
        this.department = input5;
        this.designation = input6;
        this.associatedCreationType = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
        this.and = input10;
        this.or = input11;
        this.not = input12;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelContactBusinessMembershipConditionInput> and() {
        return this.and.value;
    }

    public ModelAssociatedCreationTypeInput associatedCreationType() {
        return this.associatedCreationType.value;
    }

    public ModelIDInput businessId() {
        return this.businessId.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput contactRelationship() {
        return this.contactRelationship.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput department() {
        return this.department.value;
    }

    public ModelStringInput designation() {
        return this.designation.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelContactBusinessMembershipConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactBusinessMembershipConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelContactBusinessMembershipConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelContactBusinessMembershipConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.businessId.defined) {
                    inputFieldWriter.writeObject("businessId", ModelContactBusinessMembershipConditionInput.this.businessId.value != 0 ? ((ModelIDInput) ModelContactBusinessMembershipConditionInput.this.businessId.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelContactBusinessMembershipConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelContactBusinessMembershipConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.contactRelationship.defined) {
                    inputFieldWriter.writeObject("contactRelationship", ModelContactBusinessMembershipConditionInput.this.contactRelationship.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipConditionInput.this.contactRelationship.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.department.defined) {
                    inputFieldWriter.writeObject("department", ModelContactBusinessMembershipConditionInput.this.department.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipConditionInput.this.department.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.designation.defined) {
                    inputFieldWriter.writeObject("designation", ModelContactBusinessMembershipConditionInput.this.designation.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipConditionInput.this.designation.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.associatedCreationType.defined) {
                    inputFieldWriter.writeObject("associatedCreationType", ModelContactBusinessMembershipConditionInput.this.associatedCreationType.value != 0 ? ((ModelAssociatedCreationTypeInput) ModelContactBusinessMembershipConditionInput.this.associatedCreationType.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelContactBusinessMembershipConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelContactBusinessMembershipConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelContactBusinessMembershipConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactBusinessMembershipConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactBusinessMembershipConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactBusinessMembershipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelContactBusinessMembershipConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactBusinessMembershipConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactBusinessMembershipConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactBusinessMembershipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactBusinessMembershipConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelContactBusinessMembershipConditionInput.this.not.value != 0 ? ((ModelContactBusinessMembershipConditionInput) ModelContactBusinessMembershipConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelContactBusinessMembershipConditionInput not() {
        return this.not.value;
    }

    public List<ModelContactBusinessMembershipConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
