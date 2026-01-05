package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountUpdatesFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelActionTypeInput> actionType;
    private final Input<List<ModelAccountUpdatesFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> entityId;
    private final Input<ModelEntityTypeInput> entityType;
    private final Input<ModelIDInput> id;
    private final Input<ModelAccountUpdatesFilterInput> not;
    private final Input<List<ModelAccountUpdatesFilterInput>> or;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelEntityTypeInput> entityType = Input.absent();
        private Input<ModelIDInput> entityId = Input.absent();
        private Input<ModelActionTypeInput> actionType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelAccountUpdatesFilterInput>> and = Input.absent();
        private Input<List<ModelAccountUpdatesFilterInput>> or = Input.absent();
        private Input<ModelAccountUpdatesFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder actionType(ModelActionTypeInput modelActionTypeInput) {
            this.actionType = Input.fromNullable(modelActionTypeInput);
            return this;
        }

        public Builder and(List<ModelAccountUpdatesFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelAccountUpdatesFilterInput build() {
            return new ModelAccountUpdatesFilterInput(this.id, this.accountId, this.userId, this.entityType, this.entityId, this.actionType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelAccountUpdatesFilterInput modelAccountUpdatesFilterInput) {
            this.not = Input.fromNullable(modelAccountUpdatesFilterInput);
            return this;
        }

        public Builder or(List<ModelAccountUpdatesFilterInput> list) {
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

    public ModelAccountUpdatesFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelEntityTypeInput> input4, Input<ModelIDInput> input5, Input<ModelActionTypeInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelAccountUpdatesFilterInput>> input9, Input<List<ModelAccountUpdatesFilterInput>> input10, Input<ModelAccountUpdatesFilterInput> input11) {
        this.id = input;
        this.accountId = input2;
        this.userId = input3;
        this.entityType = input4;
        this.entityId = input5;
        this.actionType = input6;
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

    public ModelActionTypeInput actionType() {
        return this.actionType.value;
    }

    public List<ModelAccountUpdatesFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountUpdatesFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountUpdatesFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelAccountUpdatesFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelAccountUpdatesFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelAccountUpdatesFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelAccountUpdatesFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelAccountUpdatesFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelAccountUpdatesFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelAccountUpdatesFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelAccountUpdatesFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelAccountUpdatesFilterInput.this.entityType.defined) {
                    inputFieldWriter.writeObject("entityType", ModelAccountUpdatesFilterInput.this.entityType.value != 0 ? ((ModelEntityTypeInput) ModelAccountUpdatesFilterInput.this.entityType.value).marshaller() : null);
                }
                if (ModelAccountUpdatesFilterInput.this.entityId.defined) {
                    inputFieldWriter.writeObject("entityId", ModelAccountUpdatesFilterInput.this.entityId.value != 0 ? ((ModelIDInput) ModelAccountUpdatesFilterInput.this.entityId.value).marshaller() : null);
                }
                if (ModelAccountUpdatesFilterInput.this.actionType.defined) {
                    inputFieldWriter.writeObject("actionType", ModelAccountUpdatesFilterInput.this.actionType.value != 0 ? ((ModelActionTypeInput) ModelAccountUpdatesFilterInput.this.actionType.value).marshaller() : null);
                }
                if (ModelAccountUpdatesFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountUpdatesFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountUpdatesFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountUpdatesFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountUpdatesFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountUpdatesFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountUpdatesFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountUpdatesFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountUpdatesFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountUpdatesFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountUpdatesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountUpdatesFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountUpdatesFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountUpdatesFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountUpdatesFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountUpdatesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountUpdatesFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountUpdatesFilterInput.this.not.value != 0 ? ((ModelAccountUpdatesFilterInput) ModelAccountUpdatesFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelAccountUpdatesFilterInput not() {
        return this.not.value;
    }

    public List<ModelAccountUpdatesFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
