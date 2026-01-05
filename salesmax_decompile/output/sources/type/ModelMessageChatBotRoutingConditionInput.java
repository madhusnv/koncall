package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMessageChatBotRoutingConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelMessageChatBotRoutingConditionInput>> and;
    private final Input<ModelIDInput> botId;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> messagePlatform;
    private final Input<ModelMessageChatBotRoutingConditionInput> not;
    private final Input<List<ModelMessageChatBotRoutingConditionInput>> or;
    private final Input<ModelStringInput> phoneNumberIdExternal;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> messagePlatform = Input.absent();
        private Input<ModelStringInput> phoneNumberIdExternal = Input.absent();
        private Input<ModelIDInput> channelId = Input.absent();
        private Input<ModelIDInput> botId = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelMessageChatBotRoutingConditionInput>> and = Input.absent();
        private Input<List<ModelMessageChatBotRoutingConditionInput>> or = Input.absent();
        private Input<ModelMessageChatBotRoutingConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelMessageChatBotRoutingConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder botId(ModelIDInput modelIDInput) {
            this.botId = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelMessageChatBotRoutingConditionInput build() {
            return new ModelMessageChatBotRoutingConditionInput(this.accountId, this.messagePlatform, this.phoneNumberIdExternal, this.channelId, this.botId, this.createdById, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder channelId(ModelIDInput modelIDInput) {
            this.channelId = Input.fromNullable(modelIDInput);
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

        public Builder messagePlatform(ModelStringInput modelStringInput) {
            this.messagePlatform = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelMessageChatBotRoutingConditionInput modelMessageChatBotRoutingConditionInput) {
            this.not = Input.fromNullable(modelMessageChatBotRoutingConditionInput);
            return this;
        }

        public Builder or(List<ModelMessageChatBotRoutingConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder phoneNumberIdExternal(ModelStringInput modelStringInput) {
            this.phoneNumberIdExternal = Input.fromNullable(modelStringInput);
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

    public ModelMessageChatBotRoutingConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelMessageChatBotRoutingConditionInput>> input10, Input<List<ModelMessageChatBotRoutingConditionInput>> input11, Input<ModelMessageChatBotRoutingConditionInput> input12) {
        this.accountId = input;
        this.messagePlatform = input2;
        this.phoneNumberIdExternal = input3;
        this.channelId = input4;
        this.botId = input5;
        this.createdById = input6;
        this.updatedById = input7;
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

    public List<ModelMessageChatBotRoutingConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput botId() {
        return this.botId.value;
    }

    public ModelIDInput channelId() {
        return this.channelId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMessageChatBotRoutingConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMessageChatBotRoutingConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelMessageChatBotRoutingConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeObject("messagePlatform", ModelMessageChatBotRoutingConditionInput.this.messagePlatform.value != 0 ? ((ModelStringInput) ModelMessageChatBotRoutingConditionInput.this.messagePlatform.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", ModelMessageChatBotRoutingConditionInput.this.phoneNumberIdExternal.value != 0 ? ((ModelStringInput) ModelMessageChatBotRoutingConditionInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelMessageChatBotRoutingConditionInput.this.channelId.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingConditionInput.this.channelId.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.botId.defined) {
                    inputFieldWriter.writeObject("botId", ModelMessageChatBotRoutingConditionInput.this.botId.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingConditionInput.this.botId.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelMessageChatBotRoutingConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelMessageChatBotRoutingConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelMessageChatBotRoutingConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelMessageChatBotRoutingConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelMessageChatBotRoutingConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelMessageChatBotRoutingConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelMessageChatBotRoutingConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMessageChatBotRoutingConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMessageChatBotRoutingConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMessageChatBotRoutingConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelMessageChatBotRoutingConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMessageChatBotRoutingConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMessageChatBotRoutingConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMessageChatBotRoutingConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMessageChatBotRoutingConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelMessageChatBotRoutingConditionInput.this.not.value != 0 ? ((ModelMessageChatBotRoutingConditionInput) ModelMessageChatBotRoutingConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput messagePlatform() {
        return this.messagePlatform.value;
    }

    public ModelMessageChatBotRoutingConditionInput not() {
        return this.not.value;
    }

    public List<ModelMessageChatBotRoutingConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }
}
