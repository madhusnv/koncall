package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatAssociationConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatAssociationConditionInput>> and;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelChatAssociationConditionInput> not;
    private final Input<List<ModelChatAssociationConditionInput>> or;
    private final Input<ModelIDInput> relatedObjectId;
    private final Input<ModelStringInput> relatedObjectType;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> channelId = Input.absent();
        private Input<ModelIDInput> relatedObjectId = Input.absent();
        private Input<ModelStringInput> relatedObjectType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelChatAssociationConditionInput>> and = Input.absent();
        private Input<List<ModelChatAssociationConditionInput>> or = Input.absent();
        private Input<ModelChatAssociationConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatAssociationConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatAssociationConditionInput build() {
            return new ModelChatAssociationConditionInput(this.accountId, this.channelId, this.relatedObjectId, this.relatedObjectType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder channelId(ModelIDInput modelIDInput) {
            this.channelId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelChatAssociationConditionInput modelChatAssociationConditionInput) {
            this.not = Input.fromNullable(modelChatAssociationConditionInput);
            return this;
        }

        public Builder or(List<ModelChatAssociationConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder relatedObjectId(ModelIDInput modelIDInput) {
            this.relatedObjectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder relatedObjectType(ModelStringInput modelStringInput) {
            this.relatedObjectType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelChatAssociationConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<List<ModelChatAssociationConditionInput>> input7, Input<List<ModelChatAssociationConditionInput>> input8, Input<ModelChatAssociationConditionInput> input9) {
        this.accountId = input;
        this.channelId = input2;
        this.relatedObjectId = input3;
        this.relatedObjectType = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
        this.and = input7;
        this.or = input8;
        this.not = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelChatAssociationConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput channelId() {
        return this.channelId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatAssociationConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatAssociationConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatAssociationConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatAssociationConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatAssociationConditionInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelChatAssociationConditionInput.this.channelId.value != 0 ? ((ModelIDInput) ModelChatAssociationConditionInput.this.channelId.value).marshaller() : null);
                }
                if (ModelChatAssociationConditionInput.this.relatedObjectId.defined) {
                    inputFieldWriter.writeObject("relatedObjectId", ModelChatAssociationConditionInput.this.relatedObjectId.value != 0 ? ((ModelIDInput) ModelChatAssociationConditionInput.this.relatedObjectId.value).marshaller() : null);
                }
                if (ModelChatAssociationConditionInput.this.relatedObjectType.defined) {
                    inputFieldWriter.writeObject("relatedObjectType", ModelChatAssociationConditionInput.this.relatedObjectType.value != 0 ? ((ModelStringInput) ModelChatAssociationConditionInput.this.relatedObjectType.value).marshaller() : null);
                }
                if (ModelChatAssociationConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatAssociationConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatAssociationConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatAssociationConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatAssociationConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatAssociationConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatAssociationConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatAssociationConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatAssociationConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatAssociationConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatAssociationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatAssociationConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatAssociationConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatAssociationConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatAssociationConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatAssociationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatAssociationConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatAssociationConditionInput.this.not.value != 0 ? ((ModelChatAssociationConditionInput) ModelChatAssociationConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelChatAssociationConditionInput not() {
        return this.not.value;
    }

    public List<ModelChatAssociationConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput relatedObjectId() {
        return this.relatedObjectId.value;
    }

    public ModelStringInput relatedObjectType() {
        return this.relatedObjectType.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
