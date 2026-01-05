package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMessageChatBotRoutingFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelMessageChatBotRoutingFilterInput>> and;
    private final Input<ModelIDInput> botId;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> messagePlatform;
    private final Input<ModelMessageChatBotRoutingFilterInput> not;
    private final Input<List<ModelMessageChatBotRoutingFilterInput>> or;
    private final Input<ModelStringInput> phoneNumberIdExternal;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> messagePlatform = Input.absent();
        private Input<ModelStringInput> phoneNumberIdExternal = Input.absent();
        private Input<ModelIDInput> channelId = Input.absent();
        private Input<ModelIDInput> botId = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelMessageChatBotRoutingFilterInput>> and = Input.absent();
        private Input<List<ModelMessageChatBotRoutingFilterInput>> or = Input.absent();
        private Input<ModelMessageChatBotRoutingFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelMessageChatBotRoutingFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder botId(ModelIDInput modelIDInput) {
            this.botId = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelMessageChatBotRoutingFilterInput build() {
            return new ModelMessageChatBotRoutingFilterInput(this.id, this.accountId, this.messagePlatform, this.phoneNumberIdExternal, this.channelId, this.botId, this.createdById, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder messagePlatform(ModelStringInput modelStringInput) {
            this.messagePlatform = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelMessageChatBotRoutingFilterInput modelMessageChatBotRoutingFilterInput) {
            this.not = Input.fromNullable(modelMessageChatBotRoutingFilterInput);
            return this;
        }

        public Builder or(List<ModelMessageChatBotRoutingFilterInput> list) {
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

    public ModelMessageChatBotRoutingFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<List<ModelMessageChatBotRoutingFilterInput>> input11, Input<List<ModelMessageChatBotRoutingFilterInput>> input12, Input<ModelMessageChatBotRoutingFilterInput> input13) {
        this.id = input;
        this.accountId = input2;
        this.messagePlatform = input3;
        this.phoneNumberIdExternal = input4;
        this.channelId = input5;
        this.botId = input6;
        this.createdById = input7;
        this.updatedById = input8;
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

    public List<ModelMessageChatBotRoutingFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMessageChatBotRoutingFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMessageChatBotRoutingFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelMessageChatBotRoutingFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelMessageChatBotRoutingFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeObject("messagePlatform", ModelMessageChatBotRoutingFilterInput.this.messagePlatform.value != 0 ? ((ModelStringInput) ModelMessageChatBotRoutingFilterInput.this.messagePlatform.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", ModelMessageChatBotRoutingFilterInput.this.phoneNumberIdExternal.value != 0 ? ((ModelStringInput) ModelMessageChatBotRoutingFilterInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelMessageChatBotRoutingFilterInput.this.channelId.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingFilterInput.this.channelId.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.botId.defined) {
                    inputFieldWriter.writeObject("botId", ModelMessageChatBotRoutingFilterInput.this.botId.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingFilterInput.this.botId.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelMessageChatBotRoutingFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelMessageChatBotRoutingFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelMessageChatBotRoutingFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelMessageChatBotRoutingFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelMessageChatBotRoutingFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelMessageChatBotRoutingFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelMessageChatBotRoutingFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelMessageChatBotRoutingFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMessageChatBotRoutingFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMessageChatBotRoutingFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMessageChatBotRoutingFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelMessageChatBotRoutingFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMessageChatBotRoutingFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMessageChatBotRoutingFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMessageChatBotRoutingFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMessageChatBotRoutingFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelMessageChatBotRoutingFilterInput.this.not.value != 0 ? ((ModelMessageChatBotRoutingFilterInput) ModelMessageChatBotRoutingFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput messagePlatform() {
        return this.messagePlatform.value;
    }

    public ModelMessageChatBotRoutingFilterInput not() {
        return this.not.value;
    }

    public List<ModelMessageChatBotRoutingFilterInput> or() {
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
