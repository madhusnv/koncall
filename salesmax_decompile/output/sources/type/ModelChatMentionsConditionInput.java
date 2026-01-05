package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatMentionsConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatMentionsConditionInput>> and;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIntInput> expirationUnixTime;
    private final Input<ModelIDInput> mentionedById;
    private final Input<ModelIDInput> mentionedMessageId;
    private final Input<ModelIDInput> mentionedUserId;
    private final Input<ModelChatMentionsConditionInput> not;
    private final Input<List<ModelChatMentionsConditionInput>> or;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> mentionedUserId = Input.absent();
        private Input<ModelIDInput> mentionedMessageId = Input.absent();
        private Input<ModelIDInput> channelId = Input.absent();
        private Input<ModelIDInput> mentionedById = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelIntInput> expirationUnixTime = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelChatMentionsConditionInput>> and = Input.absent();
        private Input<List<ModelChatMentionsConditionInput>> or = Input.absent();
        private Input<ModelChatMentionsConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatMentionsConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatMentionsConditionInput build() {
            return new ModelChatMentionsConditionInput(this.accountId, this.mentionedUserId, this.mentionedMessageId, this.channelId, this.mentionedById, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder channelId(ModelIDInput modelIDInput) {
            this.channelId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder expirationUnixTime(ModelIntInput modelIntInput) {
            this.expirationUnixTime = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder mentionedById(ModelIDInput modelIDInput) {
            this.mentionedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder mentionedMessageId(ModelIDInput modelIDInput) {
            this.mentionedMessageId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder mentionedUserId(ModelIDInput modelIDInput) {
            this.mentionedUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelChatMentionsConditionInput modelChatMentionsConditionInput) {
            this.not = Input.fromNullable(modelChatMentionsConditionInput);
            return this;
        }

        public Builder or(List<ModelChatMentionsConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelChatMentionsConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelIntInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelChatMentionsConditionInput>> input10, Input<List<ModelChatMentionsConditionInput>> input11, Input<ModelChatMentionsConditionInput> input12) {
        this.accountId = input;
        this.mentionedUserId = input2;
        this.mentionedMessageId = input3;
        this.channelId = input4;
        this.mentionedById = input5;
        this.status = input6;
        this.expirationUnixTime = input7;
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

    public List<ModelChatMentionsConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput channelId() {
        return this.channelId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIntInput expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatMentionsConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatMentionsConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatMentionsConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatMentionsConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatMentionsConditionInput.this.mentionedUserId.defined) {
                    inputFieldWriter.writeObject("mentionedUserId", ModelChatMentionsConditionInput.this.mentionedUserId.value != 0 ? ((ModelIDInput) ModelChatMentionsConditionInput.this.mentionedUserId.value).marshaller() : null);
                }
                if (ModelChatMentionsConditionInput.this.mentionedMessageId.defined) {
                    inputFieldWriter.writeObject("mentionedMessageId", ModelChatMentionsConditionInput.this.mentionedMessageId.value != 0 ? ((ModelIDInput) ModelChatMentionsConditionInput.this.mentionedMessageId.value).marshaller() : null);
                }
                if (ModelChatMentionsConditionInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelChatMentionsConditionInput.this.channelId.value != 0 ? ((ModelIDInput) ModelChatMentionsConditionInput.this.channelId.value).marshaller() : null);
                }
                if (ModelChatMentionsConditionInput.this.mentionedById.defined) {
                    inputFieldWriter.writeObject("mentionedById", ModelChatMentionsConditionInput.this.mentionedById.value != 0 ? ((ModelIDInput) ModelChatMentionsConditionInput.this.mentionedById.value).marshaller() : null);
                }
                if (ModelChatMentionsConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelChatMentionsConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelChatMentionsConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelChatMentionsConditionInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeObject("expirationUnixTime", ModelChatMentionsConditionInput.this.expirationUnixTime.value != 0 ? ((ModelIntInput) ModelChatMentionsConditionInput.this.expirationUnixTime.value).marshaller() : null);
                }
                if (ModelChatMentionsConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatMentionsConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatMentionsConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatMentionsConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatMentionsConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatMentionsConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatMentionsConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatMentionsConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatMentionsConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatMentionsConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatMentionsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatMentionsConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatMentionsConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatMentionsConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatMentionsConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatMentionsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatMentionsConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatMentionsConditionInput.this.not.value != 0 ? ((ModelChatMentionsConditionInput) ModelChatMentionsConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput mentionedById() {
        return this.mentionedById.value;
    }

    public ModelIDInput mentionedMessageId() {
        return this.mentionedMessageId.value;
    }

    public ModelIDInput mentionedUserId() {
        return this.mentionedUserId.value;
    }

    public ModelChatMentionsConditionInput not() {
        return this.not.value;
    }

    public List<ModelChatMentionsConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
