package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateChatBotContextInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> channelId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> currentIntent;
    private final Input<String> handlerChatBot;
    private final Input<String> id;
    private final Input<List<String>> intentList;
    private final Input<Boolean> isPaused;
    private final Input<String> lastChatMessageId;
    private final Input<String> masterChatBot;
    private final Input<String> pausedAt;
    private final Input<String> pausedBy;
    private final Input<String> pausedById;
    private final Input<String> updatedAt;
    private final Input<String> userId;

    public static final class Builder {
        private Input<String> id = Input.absent();
        private Input<String> handlerChatBot = Input.absent();
        private Input<String> masterChatBot = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> userId = Input.absent();
        private Input<String> channelId = Input.absent();
        private Input<String> lastChatMessageId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<Boolean> isPaused = Input.absent();
        private Input<String> pausedBy = Input.absent();
        private Input<String> pausedById = Input.absent();
        private Input<String> pausedAt = Input.absent();
        private Input<String> currentIntent = Input.absent();
        private Input<List<String>> intentList = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public CreateChatBotContextInput build() {
            return new CreateChatBotContextInput(this.id, this.handlerChatBot, this.masterChatBot, this.accountId, this.contactId, this.userId, this.channelId, this.lastChatMessageId, this.createdAt, this.updatedAt, this.isPaused, this.pausedBy, this.pausedById, this.pausedAt, this.currentIntent, this.intentList);
        }

        public Builder channelId(String str) {
            this.channelId = Input.fromNullable(str);
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder currentIntent(String str) {
            this.currentIntent = Input.fromNullable(str);
            return this;
        }

        public Builder handlerChatBot(String str) {
            this.handlerChatBot = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder intentList(List<String> list) {
            this.intentList = Input.fromNullable(list);
            return this;
        }

        public Builder isPaused(Boolean bool) {
            this.isPaused = Input.fromNullable(bool);
            return this;
        }

        public Builder lastChatMessageId(String str) {
            this.lastChatMessageId = Input.fromNullable(str);
            return this;
        }

        public Builder masterChatBot(String str) {
            this.masterChatBot = Input.fromNullable(str);
            return this;
        }

        public Builder pausedAt(String str) {
            this.pausedAt = Input.fromNullable(str);
            return this;
        }

        public Builder pausedBy(String str) {
            this.pausedBy = Input.fromNullable(str);
            return this;
        }

        public Builder pausedById(String str) {
            this.pausedById = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public CreateChatBotContextInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<Boolean> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<List<String>> input16) {
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String channelId() {
        return this.channelId.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String currentIntent() {
        return this.currentIntent.value;
    }

    public String handlerChatBot() {
        return this.handlerChatBot.value;
    }

    public String id() {
        return this.id.value;
    }

    public List<String> intentList() {
        return this.intentList.value;
    }

    public Boolean isPaused() {
        return this.isPaused.value;
    }

    public String lastChatMessageId() {
        return this.lastChatMessageId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateChatBotContextInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateChatBotContextInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateChatBotContextInput.this.id.value);
                }
                if (CreateChatBotContextInput.this.handlerChatBot.defined) {
                    inputFieldWriter.writeString("handlerChatBot", (String) CreateChatBotContextInput.this.handlerChatBot.value);
                }
                if (CreateChatBotContextInput.this.masterChatBot.defined) {
                    inputFieldWriter.writeString("masterChatBot", (String) CreateChatBotContextInput.this.masterChatBot.value);
                }
                if (CreateChatBotContextInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) CreateChatBotContextInput.this.accountId.value);
                }
                if (CreateChatBotContextInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateChatBotContextInput.this.contactId.value);
                }
                if (CreateChatBotContextInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) CreateChatBotContextInput.this.userId.value);
                }
                if (CreateChatBotContextInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) CreateChatBotContextInput.this.channelId.value);
                }
                if (CreateChatBotContextInput.this.lastChatMessageId.defined) {
                    inputFieldWriter.writeString("lastChatMessageId", (String) CreateChatBotContextInput.this.lastChatMessageId.value);
                }
                if (CreateChatBotContextInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateChatBotContextInput.this.createdAt.value);
                }
                if (CreateChatBotContextInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateChatBotContextInput.this.updatedAt.value);
                }
                if (CreateChatBotContextInput.this.isPaused.defined) {
                    inputFieldWriter.writeBoolean("isPaused", (Boolean) CreateChatBotContextInput.this.isPaused.value);
                }
                if (CreateChatBotContextInput.this.pausedBy.defined) {
                    inputFieldWriter.writeString("pausedBy", (String) CreateChatBotContextInput.this.pausedBy.value);
                }
                if (CreateChatBotContextInput.this.pausedById.defined) {
                    inputFieldWriter.writeString("pausedById", (String) CreateChatBotContextInput.this.pausedById.value);
                }
                if (CreateChatBotContextInput.this.pausedAt.defined) {
                    inputFieldWriter.writeString("pausedAt", (String) CreateChatBotContextInput.this.pausedAt.value);
                }
                if (CreateChatBotContextInput.this.currentIntent.defined) {
                    inputFieldWriter.writeString("currentIntent", (String) CreateChatBotContextInput.this.currentIntent.value);
                }
                if (CreateChatBotContextInput.this.intentList.defined) {
                    inputFieldWriter.writeList("intentList", CreateChatBotContextInput.this.intentList.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatBotContextInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatBotContextInput.this.intentList.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public String masterChatBot() {
        return this.masterChatBot.value;
    }

    public String pausedAt() {
        return this.pausedAt.value;
    }

    public String pausedBy() {
        return this.pausedBy.value;
    }

    public String pausedById() {
        return this.pausedById.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
