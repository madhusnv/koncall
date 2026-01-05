package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelContactBusinessMembershipFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelContactBusinessMembershipFilterInput>> and;
    private final Input<ModelAssociatedCreationTypeInput> associatedCreationType;
    private final Input<ModelIDInput> businessId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> contactRelationship;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> department;
    private final Input<ModelStringInput> designation;
    private final Input<ModelIDInput> id;
    private final Input<ModelContactBusinessMembershipFilterInput> not;
    private final Input<List<ModelContactBusinessMembershipFilterInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> businessId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> contactRelationship = Input.absent();
        private Input<ModelStringInput> department = Input.absent();
        private Input<ModelStringInput> designation = Input.absent();
        private Input<ModelAssociatedCreationTypeInput> associatedCreationType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelContactBusinessMembershipFilterInput>> and = Input.absent();
        private Input<List<ModelContactBusinessMembershipFilterInput>> or = Input.absent();
        private Input<ModelContactBusinessMembershipFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelContactBusinessMembershipFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder associatedCreationType(ModelAssociatedCreationTypeInput modelAssociatedCreationTypeInput) {
            this.associatedCreationType = Input.fromNullable(modelAssociatedCreationTypeInput);
            return this;
        }

        public ModelContactBusinessMembershipFilterInput build() {
            return new ModelContactBusinessMembershipFilterInput(this.id, this.accountId, this.businessId, this.contactId, this.contactRelationship, this.department, this.designation, this.associatedCreationType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelContactBusinessMembershipFilterInput modelContactBusinessMembershipFilterInput) {
            this.not = Input.fromNullable(modelContactBusinessMembershipFilterInput);
            return this;
        }

        public Builder or(List<ModelContactBusinessMembershipFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelContactBusinessMembershipFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelAssociatedCreationTypeInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<List<ModelContactBusinessMembershipFilterInput>> input11, Input<List<ModelContactBusinessMembershipFilterInput>> input12, Input<ModelContactBusinessMembershipFilterInput> input13) {
        this.id = input;
        this.accountId = input2;
        this.businessId = input3;
        this.contactId = input4;
        this.contactRelationship = input5;
        this.department = input6;
        this.designation = input7;
        this.associatedCreationType = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
        this.and = input11;
        this.or = input12;
        this.not = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelContactBusinessMembershipFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelContactBusinessMembershipFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactBusinessMembershipFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelContactBusinessMembershipFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelContactBusinessMembershipFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelContactBusinessMembershipFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelContactBusinessMembershipFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.businessId.defined) {
                    inputFieldWriter.writeObject("businessId", ModelContactBusinessMembershipFilterInput.this.businessId.value != 0 ? ((ModelIDInput) ModelContactBusinessMembershipFilterInput.this.businessId.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelContactBusinessMembershipFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelContactBusinessMembershipFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.contactRelationship.defined) {
                    inputFieldWriter.writeObject("contactRelationship", ModelContactBusinessMembershipFilterInput.this.contactRelationship.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipFilterInput.this.contactRelationship.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.department.defined) {
                    inputFieldWriter.writeObject("department", ModelContactBusinessMembershipFilterInput.this.department.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipFilterInput.this.department.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.designation.defined) {
                    inputFieldWriter.writeObject("designation", ModelContactBusinessMembershipFilterInput.this.designation.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipFilterInput.this.designation.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.associatedCreationType.defined) {
                    inputFieldWriter.writeObject("associatedCreationType", ModelContactBusinessMembershipFilterInput.this.associatedCreationType.value != 0 ? ((ModelAssociatedCreationTypeInput) ModelContactBusinessMembershipFilterInput.this.associatedCreationType.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelContactBusinessMembershipFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelContactBusinessMembershipFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelContactBusinessMembershipFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelContactBusinessMembershipFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactBusinessMembershipFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactBusinessMembershipFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactBusinessMembershipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelContactBusinessMembershipFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactBusinessMembershipFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactBusinessMembershipFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactBusinessMembershipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactBusinessMembershipFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelContactBusinessMembershipFilterInput.this.not.value != 0 ? ((ModelContactBusinessMembershipFilterInput) ModelContactBusinessMembershipFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelContactBusinessMembershipFilterInput not() {
        return this.not.value;
    }

    public List<ModelContactBusinessMembershipFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
