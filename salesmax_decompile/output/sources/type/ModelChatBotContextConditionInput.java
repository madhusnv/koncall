package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatBotContextConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatBotContextConditionInput>> and;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> currentIntent;
    private final Input<ModelIDInput> handlerChatBot;
    private final Input<ModelStringInput> intentList;
    private final Input<ModelBooleanInput> isPaused;
    private final Input<ModelIDInput> lastChatMessageId;
    private final Input<ModelIDInput> masterChatBot;
    private final Input<ModelChatBotContextConditionInput> not;
    private final Input<List<ModelChatBotContextConditionInput>> or;
    private final Input<ModelStringInput> pausedAt;
    private final Input<ModelStringInput> pausedBy;
    private final Input<ModelIDInput> pausedById;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> handlerChatBot = Input.absent();
        private Input<ModelIDInput> masterChatBot = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelIDInput> channelId = Input.absent();
        private Input<ModelIDInput> lastChatMessageId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelBooleanInput> isPaused = Input.absent();
        private Input<ModelStringInput> pausedBy = Input.absent();
        private Input<ModelIDInput> pausedById = Input.absent();
        private Input<ModelStringInput> pausedAt = Input.absent();
        private Input<ModelStringInput> currentIntent = Input.absent();
        private Input<ModelStringInput> intentList = Input.absent();
        private Input<List<ModelChatBotContextConditionInput>> and = Input.absent();
        private Input<List<ModelChatBotContextConditionInput>> or = Input.absent();
        private Input<ModelChatBotContextConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatBotContextConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatBotContextConditionInput build() {
            return new ModelChatBotContextConditionInput(this.handlerChatBot, this.masterChatBot, this.accountId, this.contactId, this.userId, this.channelId, this.lastChatMessageId, this.createdAt, this.updatedAt, this.isPaused, this.pausedBy, this.pausedById, this.pausedAt, this.currentIntent, this.intentList, this.and, this.or, this.not);
        }

        public Builder channelId(ModelIDInput modelIDInput) {
            this.channelId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder currentIntent(ModelStringInput modelStringInput) {
            this.currentIntent = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder handlerChatBot(ModelIDInput modelIDInput) {
            this.handlerChatBot = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder intentList(ModelStringInput modelStringInput) {
            this.intentList = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder isPaused(ModelBooleanInput modelBooleanInput) {
            this.isPaused = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder lastChatMessageId(ModelIDInput modelIDInput) {
            this.lastChatMessageId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder masterChatBot(ModelIDInput modelIDInput) {
            this.masterChatBot = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelChatBotContextConditionInput modelChatBotContextConditionInput) {
            this.not = Input.fromNullable(modelChatBotContextConditionInput);
            return this;
        }

        public Builder or(List<ModelChatBotContextConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder pausedAt(ModelStringInput modelStringInput) {
            this.pausedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder pausedBy(ModelStringInput modelStringInput) {
            this.pausedBy = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder pausedById(ModelIDInput modelIDInput) {
            this.pausedById = Input.fromNullable(modelIDInput);
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

    public ModelChatBotContextConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelBooleanInput> input10, Input<ModelStringInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<List<ModelChatBotContextConditionInput>> input16, Input<List<ModelChatBotContextConditionInput>> input17, Input<ModelChatBotContextConditionInput> input18) {
        this.handlerChatBot = input;
        this.masterChatBot = input2;
        this.accountId = input3;
        this.contactId = input4;
        this.userId = input5;
        this.channelId = input6;
        this.lastChatMessageId = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
        this.isPaused = input10;
        this.pausedBy = input11;
        this.pausedById = input12;
        this.pausedAt = input13;
        this.currentIntent = input14;
        this.intentList = input15;
        this.and = input16;
        this.or = input17;
        this.not = input18;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelChatBotContextConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput channelId() {
        return this.channelId.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput currentIntent() {
        return this.currentIntent.value;
    }

    public ModelIDInput handlerChatBot() {
        return this.handlerChatBot.value;
    }

    public ModelStringInput intentList() {
        return this.intentList.value;
    }

    public ModelBooleanInput isPaused() {
        return this.isPaused.value;
    }

    public ModelIDInput lastChatMessageId() {
        return this.lastChatMessageId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatBotContextConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatBotContextConditionInput.this.handlerChatBot.defined) {
                    inputFieldWriter.writeObject("handlerChatBot", ModelChatBotContextConditionInput.this.handlerChatBot.value != 0 ? ((ModelIDInput) ModelChatBotContextConditionInput.this.handlerChatBot.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.masterChatBot.defined) {
                    inputFieldWriter.writeObject("masterChatBot", ModelChatBotContextConditionInput.this.masterChatBot.value != 0 ? ((ModelIDInput) ModelChatBotContextConditionInput.this.masterChatBot.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatBotContextConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatBotContextConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelChatBotContextConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelChatBotContextConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelChatBotContextConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelChatBotContextConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelChatBotContextConditionInput.this.channelId.value != 0 ? ((ModelIDInput) ModelChatBotContextConditionInput.this.channelId.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.lastChatMessageId.defined) {
                    inputFieldWriter.writeObject("lastChatMessageId", ModelChatBotContextConditionInput.this.lastChatMessageId.value != 0 ? ((ModelIDInput) ModelChatBotContextConditionInput.this.lastChatMessageId.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatBotContextConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatBotContextConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatBotContextConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatBotContextConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.isPaused.defined) {
                    inputFieldWriter.writeObject("isPaused", ModelChatBotContextConditionInput.this.isPaused.value != 0 ? ((ModelBooleanInput) ModelChatBotContextConditionInput.this.isPaused.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.pausedBy.defined) {
                    inputFieldWriter.writeObject("pausedBy", ModelChatBotContextConditionInput.this.pausedBy.value != 0 ? ((ModelStringInput) ModelChatBotContextConditionInput.this.pausedBy.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.pausedById.defined) {
                    inputFieldWriter.writeObject("pausedById", ModelChatBotContextConditionInput.this.pausedById.value != 0 ? ((ModelIDInput) ModelChatBotContextConditionInput.this.pausedById.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.pausedAt.defined) {
                    inputFieldWriter.writeObject("pausedAt", ModelChatBotContextConditionInput.this.pausedAt.value != 0 ? ((ModelStringInput) ModelChatBotContextConditionInput.this.pausedAt.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.currentIntent.defined) {
                    inputFieldWriter.writeObject("currentIntent", ModelChatBotContextConditionInput.this.currentIntent.value != 0 ? ((ModelStringInput) ModelChatBotContextConditionInput.this.currentIntent.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.intentList.defined) {
                    inputFieldWriter.writeObject("intentList", ModelChatBotContextConditionInput.this.intentList.value != 0 ? ((ModelStringInput) ModelChatBotContextConditionInput.this.intentList.value).marshaller() : null);
                }
                if (ModelChatBotContextConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatBotContextConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatBotContextConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatBotContextConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatBotContextConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatBotContextConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatBotContextConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatBotContextConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatBotContextConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatBotContextConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatBotContextConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatBotContextConditionInput.this.not.value != 0 ? ((ModelChatBotContextConditionInput) ModelChatBotContextConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput masterChatBot() {
        return this.masterChatBot.value;
    }

    public ModelChatBotContextConditionInput not() {
        return this.not.value;
    }

    public List<ModelChatBotContextConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput pausedAt() {
        return this.pausedAt.value;
    }

    public ModelStringInput pausedBy() {
        return this.pausedBy.value;
    }

    public ModelIDInput pausedById() {
        return this.pausedById.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
