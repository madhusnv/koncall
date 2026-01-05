package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEntityListMembershipFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelEntityListMembershipFilterInput>> and;
    private final Input<ModelIDInput> associatedObjectId;
    private final Input<ModelStringInput> associatedObjectType;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> entityListId;
    private final Input<ModelIDInput> id;
    private final Input<ModelEntityListMembershipFilterInput> not;
    private final Input<List<ModelEntityListMembershipFilterInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> associatedObjectId = Input.absent();
        private Input<ModelStringInput> associatedObjectType = Input.absent();
        private Input<ModelIDInput> entityListId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelEntityListMembershipFilterInput>> and = Input.absent();
        private Input<List<ModelEntityListMembershipFilterInput>> or = Input.absent();
        private Input<ModelEntityListMembershipFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelEntityListMembershipFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder associatedObjectId(ModelIDInput modelIDInput) {
            this.associatedObjectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder associatedObjectType(ModelStringInput modelStringInput) {
            this.associatedObjectType = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelEntityListMembershipFilterInput build() {
            return new ModelEntityListMembershipFilterInput(this.id, this.accountId, this.contactId, this.associatedObjectId, this.associatedObjectType, this.entityListId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder entityListId(ModelIDInput modelIDInput) {
            this.entityListId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelEntityListMembershipFilterInput modelEntityListMembershipFilterInput) {
            this.not = Input.fromNullable(modelEntityListMembershipFilterInput);
            return this;
        }

        public Builder or(List<ModelEntityListMembershipFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelEntityListMembershipFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelEntityListMembershipFilterInput>> input9, Input<List<ModelEntityListMembershipFilterInput>> input10, Input<ModelEntityListMembershipFilterInput> input11) {
        this.id = input;
        this.accountId = input2;
        this.contactId = input3;
        this.associatedObjectId = input4;
        this.associatedObjectType = input5;
        this.entityListId = input6;
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

    public List<ModelEntityListMembershipFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput associatedObjectId() {
        return this.associatedObjectId.value;
    }

    public ModelStringInput associatedObjectType() {
        return this.associatedObjectType.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput entityListId() {
        return this.entityListId.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListMembershipFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListMembershipFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelEntityListMembershipFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelEntityListMembershipFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelEntityListMembershipFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEntityListMembershipFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEntityListMembershipFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEntityListMembershipFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelEntityListMembershipFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelEntityListMembershipFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelEntityListMembershipFilterInput.this.associatedObjectId.defined) {
                    inputFieldWriter.writeObject("associatedObjectId", ModelEntityListMembershipFilterInput.this.associatedObjectId.value != 0 ? ((ModelIDInput) ModelEntityListMembershipFilterInput.this.associatedObjectId.value).marshaller() : null);
                }
                if (ModelEntityListMembershipFilterInput.this.associatedObjectType.defined) {
                    inputFieldWriter.writeObject("associatedObjectType", ModelEntityListMembershipFilterInput.this.associatedObjectType.value != 0 ? ((ModelStringInput) ModelEntityListMembershipFilterInput.this.associatedObjectType.value).marshaller() : null);
                }
                if (ModelEntityListMembershipFilterInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", ModelEntityListMembershipFilterInput.this.entityListId.value != 0 ? ((ModelIDInput) ModelEntityListMembershipFilterInput.this.entityListId.value).marshaller() : null);
                }
                if (ModelEntityListMembershipFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEntityListMembershipFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEntityListMembershipFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEntityListMembershipFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEntityListMembershipFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEntityListMembershipFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEntityListMembershipFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEntityListMembershipFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListMembershipFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListMembershipFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListMembershipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListMembershipFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEntityListMembershipFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListMembershipFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListMembershipFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListMembershipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListMembershipFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEntityListMembershipFilterInput.this.not.value != 0 ? ((ModelEntityListMembershipFilterInput) ModelEntityListMembershipFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelEntityListMembershipFilterInput not() {
        return this.not.value;
    }

    public List<ModelEntityListMembershipFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
