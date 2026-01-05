package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEntityListMembershipConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelEntityListMembershipConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> entityListId;
    private final Input<ModelEntityListMembershipConditionInput> not;
    private final Input<List<ModelEntityListMembershipConditionInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> entityListId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelEntityListMembershipConditionInput>> and = Input.absent();
        private Input<List<ModelEntityListMembershipConditionInput>> or = Input.absent();
        private Input<ModelEntityListMembershipConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelEntityListMembershipConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelEntityListMembershipConditionInput build() {
            return new ModelEntityListMembershipConditionInput(this.accountId, this.contactId, this.entityListId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelEntityListMembershipConditionInput modelEntityListMembershipConditionInput) {
            this.not = Input.fromNullable(modelEntityListMembershipConditionInput);
            return this;
        }

        public Builder or(List<ModelEntityListMembershipConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelEntityListMembershipConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<List<ModelEntityListMembershipConditionInput>> input6, Input<List<ModelEntityListMembershipConditionInput>> input7, Input<ModelEntityListMembershipConditionInput> input8) {
        this.accountId = input;
        this.contactId = input2;
        this.entityListId = input3;
        this.createdAt = input4;
        this.updatedAt = input5;
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

    public List<ModelEntityListMembershipConditionInput> and() {
        return this.and.value;
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListMembershipConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListMembershipConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEntityListMembershipConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEntityListMembershipConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEntityListMembershipConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelEntityListMembershipConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelEntityListMembershipConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelEntityListMembershipConditionInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", ModelEntityListMembershipConditionInput.this.entityListId.value != 0 ? ((ModelIDInput) ModelEntityListMembershipConditionInput.this.entityListId.value).marshaller() : null);
                }
                if (ModelEntityListMembershipConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEntityListMembershipConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEntityListMembershipConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEntityListMembershipConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEntityListMembershipConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEntityListMembershipConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEntityListMembershipConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEntityListMembershipConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListMembershipConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListMembershipConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListMembershipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListMembershipConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEntityListMembershipConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListMembershipConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListMembershipConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListMembershipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListMembershipConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEntityListMembershipConditionInput.this.not.value != 0 ? ((ModelEntityListMembershipConditionInput) ModelEntityListMembershipConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelEntityListMembershipConditionInput not() {
        return this.not.value;
    }

    public List<ModelEntityListMembershipConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
