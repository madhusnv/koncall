package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountUpdatesConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelActionTypeInput> actionType;
    private final Input<List<ModelAccountUpdatesConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> entityId;
    private final Input<ModelEntityTypeInput> entityType;
    private final Input<ModelAccountUpdatesConditionInput> not;
    private final Input<List<ModelAccountUpdatesConditionInput>> or;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelEntityTypeInput> entityType = Input.absent();
        private Input<ModelIDInput> entityId = Input.absent();
        private Input<ModelActionTypeInput> actionType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelAccountUpdatesConditionInput>> and = Input.absent();
        private Input<List<ModelAccountUpdatesConditionInput>> or = Input.absent();
        private Input<ModelAccountUpdatesConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder actionType(ModelActionTypeInput modelActionTypeInput) {
            this.actionType = Input.fromNullable(modelActionTypeInput);
            return this;
        }

        public Builder and(List<ModelAccountUpdatesConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelAccountUpdatesConditionInput build() {
            return new ModelAccountUpdatesConditionInput(this.accountId, this.userId, this.entityType, this.entityId, this.actionType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder entityId(ModelIDInput modelIDInput) {
            this.entityId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder entityType(ModelEntityTypeInput modelEntityTypeInput) {
            this.entityType = Input.fromNullable(modelEntityTypeInput);
            return this;
        }

        public Builder not(ModelAccountUpdatesConditionInput modelAccountUpdatesConditionInput) {
            this.not = Input.fromNullable(modelAccountUpdatesConditionInput);
            return this;
        }

        public Builder or(List<ModelAccountUpdatesConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelAccountUpdatesConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelEntityTypeInput> input3, Input<ModelIDInput> input4, Input<ModelActionTypeInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<List<ModelAccountUpdatesConditionInput>> input8, Input<List<ModelAccountUpdatesConditionInput>> input9, Input<ModelAccountUpdatesConditionInput> input10) {
        this.accountId = input;
        this.userId = input2;
        this.entityType = input3;
        this.entityId = input4;
        this.actionType = input5;
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

    public ModelActionTypeInput actionType() {
        return this.actionType.value;
    }

    public List<ModelAccountUpdatesConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput entityId() {
        return this.entityId.value;
    }

    public ModelEntityTypeInput entityType() {
        return this.entityType.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountUpdatesConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountUpdatesConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelAccountUpdatesConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelAccountUpdatesConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelAccountUpdatesConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelAccountUpdatesConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelAccountUpdatesConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelAccountUpdatesConditionInput.this.entityType.defined) {
                    inputFieldWriter.writeObject("entityType", ModelAccountUpdatesConditionInput.this.entityType.value != 0 ? ((ModelEntityTypeInput) ModelAccountUpdatesConditionInput.this.entityType.value).marshaller() : null);
                }
                if (ModelAccountUpdatesConditionInput.this.entityId.defined) {
                    inputFieldWriter.writeObject("entityId", ModelAccountUpdatesConditionInput.this.entityId.value != 0 ? ((ModelIDInput) ModelAccountUpdatesConditionInput.this.entityId.value).marshaller() : null);
                }
                if (ModelAccountUpdatesConditionInput.this.actionType.defined) {
                    inputFieldWriter.writeObject("actionType", ModelAccountUpdatesConditionInput.this.actionType.value != 0 ? ((ModelActionTypeInput) ModelAccountUpdatesConditionInput.this.actionType.value).marshaller() : null);
                }
                if (ModelAccountUpdatesConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountUpdatesConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountUpdatesConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountUpdatesConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountUpdatesConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountUpdatesConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountUpdatesConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountUpdatesConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountUpdatesConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountUpdatesConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountUpdatesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountUpdatesConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountUpdatesConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountUpdatesConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountUpdatesConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountUpdatesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountUpdatesConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountUpdatesConditionInput.this.not.value != 0 ? ((ModelAccountUpdatesConditionInput) ModelAccountUpdatesConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelAccountUpdatesConditionInput not() {
        return this.not.value;
    }

    public List<ModelAccountUpdatesConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
