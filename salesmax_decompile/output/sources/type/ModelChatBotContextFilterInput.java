package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatBotContextFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatBotContextFilterInput>> and;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> currentIntent;
    private final Input<ModelIDInput> handlerChatBot;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> intentList;
    private final Input<ModelBooleanInput> isPaused;
    private final Input<ModelIDInput> lastChatMessageId;
    private final Input<ModelIDInput> masterChatBot;
    private final Input<ModelChatBotContextFilterInput> not;
    private final Input<List<ModelChatBotContextFilterInput>> or;
    private final Input<ModelStringInput> pausedAt;
    private final Input<ModelStringInput> pausedBy;
    private final Input<ModelIDInput> pausedById;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelChatBotContextFilterInput>> and = Input.absent();
        private Input<List<ModelChatBotContextFilterInput>> or = Input.absent();
        private Input<ModelChatBotContextFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatBotContextFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatBotContextFilterInput build() {
            return new ModelChatBotContextFilterInput(this.id, this.handlerChatBot, this.masterChatBot, this.accountId, this.contactId, this.userId, this.channelId, this.lastChatMessageId, this.createdAt, this.updatedAt, this.isPaused, this.pausedBy, this.pausedById, this.pausedAt, this.currentIntent, this.intentList, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelChatBotContextFilterInput modelChatBotContextFilterInput) {
            this.not = Input.fromNullable(modelChatBotContextFilterInput);
            return this;
        }

        public Builder or(List<ModelChatBotContextFilterInput> list) {
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

    public ModelChatBotContextFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelBooleanInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<List<ModelChatBotContextFilterInput>> input17, Input<List<ModelChatBotContextFilterInput>> input18, Input<ModelChatBotContextFilterInput> input19) {
        this.id = input;
        this.handlerChatBot = input2;
        this.masterChatBot = input3;
        this.accountId = input4;
        this.contactId = input5;
        this.userId = input6;
        this.channelId = input7;
        this.lastChatMessageId = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
        this.isPaused = input11;
        this.pausedBy = input12;
        this.pausedById = input13;
        this.pausedAt = input14;
        this.currentIntent = input15;
        this.intentList = input16;
        this.and = input17;
        this.or = input18;
        this.not = input19;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelChatBotContextFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
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
        return new InputFieldMarshaller() { // from class: type.ModelChatBotContextFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatBotContextFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelChatBotContextFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelChatBotContextFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.handlerChatBot.defined) {
                    inputFieldWriter.writeObject("handlerChatBot", ModelChatBotContextFilterInput.this.handlerChatBot.value != 0 ? ((ModelIDInput) ModelChatBotContextFilterInput.this.handlerChatBot.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.masterChatBot.defined) {
                    inputFieldWriter.writeObject("masterChatBot", ModelChatBotContextFilterInput.this.masterChatBot.value != 0 ? ((ModelIDInput) ModelChatBotContextFilterInput.this.masterChatBot.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatBotContextFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatBotContextFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelChatBotContextFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelChatBotContextFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelChatBotContextFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelChatBotContextFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelChatBotContextFilterInput.this.channelId.value != 0 ? ((ModelIDInput) ModelChatBotContextFilterInput.this.channelId.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.lastChatMessageId.defined) {
                    inputFieldWriter.writeObject("lastChatMessageId", ModelChatBotContextFilterInput.this.lastChatMessageId.value != 0 ? ((ModelIDInput) ModelChatBotContextFilterInput.this.lastChatMessageId.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatBotContextFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatBotContextFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatBotContextFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatBotContextFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.isPaused.defined) {
                    inputFieldWriter.writeObject("isPaused", ModelChatBotContextFilterInput.this.isPaused.value != 0 ? ((ModelBooleanInput) ModelChatBotContextFilterInput.this.isPaused.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.pausedBy.defined) {
                    inputFieldWriter.writeObject("pausedBy", ModelChatBotContextFilterInput.this.pausedBy.value != 0 ? ((ModelStringInput) ModelChatBotContextFilterInput.this.pausedBy.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.pausedById.defined) {
                    inputFieldWriter.writeObject("pausedById", ModelChatBotContextFilterInput.this.pausedById.value != 0 ? ((ModelIDInput) ModelChatBotContextFilterInput.this.pausedById.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.pausedAt.defined) {
                    inputFieldWriter.writeObject("pausedAt", ModelChatBotContextFilterInput.this.pausedAt.value != 0 ? ((ModelStringInput) ModelChatBotContextFilterInput.this.pausedAt.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.currentIntent.defined) {
                    inputFieldWriter.writeObject("currentIntent", ModelChatBotContextFilterInput.this.currentIntent.value != 0 ? ((ModelStringInput) ModelChatBotContextFilterInput.this.currentIntent.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.intentList.defined) {
                    inputFieldWriter.writeObject("intentList", ModelChatBotContextFilterInput.this.intentList.value != 0 ? ((ModelStringInput) ModelChatBotContextFilterInput.this.intentList.value).marshaller() : null);
                }
                if (ModelChatBotContextFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatBotContextFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatBotContextFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatBotContextFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatBotContextFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatBotContextFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatBotContextFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatBotContextFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatBotContextFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatBotContextFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatBotContextFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatBotContextFilterInput.this.not.value != 0 ? ((ModelChatBotContextFilterInput) ModelChatBotContextFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput masterChatBot() {
        return this.masterChatBot.value;
    }

    public ModelChatBotContextFilterInput not() {
        return this.not.value;
    }

    public List<ModelChatBotContextFilterInput> or() {
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
