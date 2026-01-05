package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateChatBotContextInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> channelId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> currentIntent;
    private final Input<String> handlerChatBot;
    private final String id;
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
        private String id;
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

        public UpdateChatBotContextInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateChatBotContextInput(this.id, this.handlerChatBot, this.masterChatBot, this.accountId, this.contactId, this.userId, this.channelId, this.lastChatMessageId, this.createdAt, this.updatedAt, this.isPaused, this.pausedBy, this.pausedById, this.pausedAt, this.currentIntent, this.intentList);
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
            this.id = str;
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

    public UpdateChatBotContextInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<Boolean> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<List<String>> input15) {
        this.id = str;
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
        return this.id;
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
        return new InputFieldMarshaller() { // from class: type.UpdateChatBotContextInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateChatBotContextInput.this.id);
                if (UpdateChatBotContextInput.this.handlerChatBot.defined) {
                    inputFieldWriter.writeString("handlerChatBot", (String) UpdateChatBotContextInput.this.handlerChatBot.value);
                }
                if (UpdateChatBotContextInput.this.masterChatBot.defined) {
                    inputFieldWriter.writeString("masterChatBot", (String) UpdateChatBotContextInput.this.masterChatBot.value);
                }
                if (UpdateChatBotContextInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateChatBotContextInput.this.accountId.value);
                }
                if (UpdateChatBotContextInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateChatBotContextInput.this.contactId.value);
                }
                if (UpdateChatBotContextInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) UpdateChatBotContextInput.this.userId.value);
                }
                if (UpdateChatBotContextInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) UpdateChatBotContextInput.this.channelId.value);
                }
                if (UpdateChatBotContextInput.this.lastChatMessageId.defined) {
                    inputFieldWriter.writeString("lastChatMessageId", (String) UpdateChatBotContextInput.this.lastChatMessageId.value);
                }
                if (UpdateChatBotContextInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateChatBotContextInput.this.createdAt.value);
                }
                if (UpdateChatBotContextInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateChatBotContextInput.this.updatedAt.value);
                }
                if (UpdateChatBotContextInput.this.isPaused.defined) {
                    inputFieldWriter.writeBoolean("isPaused", (Boolean) UpdateChatBotContextInput.this.isPaused.value);
                }
                if (UpdateChatBotContextInput.this.pausedBy.defined) {
                    inputFieldWriter.writeString("pausedBy", (String) UpdateChatBotContextInput.this.pausedBy.value);
                }
                if (UpdateChatBotContextInput.this.pausedById.defined) {
                    inputFieldWriter.writeString("pausedById", (String) UpdateChatBotContextInput.this.pausedById.value);
                }
                if (UpdateChatBotContextInput.this.pausedAt.defined) {
                    inputFieldWriter.writeString("pausedAt", (String) UpdateChatBotContextInput.this.pausedAt.value);
                }
                if (UpdateChatBotContextInput.this.currentIntent.defined) {
                    inputFieldWriter.writeString("currentIntent", (String) UpdateChatBotContextInput.this.currentIntent.value);
                }
                if (UpdateChatBotContextInput.this.intentList.defined) {
                    inputFieldWriter.writeList("intentList", UpdateChatBotContextInput.this.intentList.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateChatBotContextInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateChatBotContextInput.this.intentList.value).iterator();
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
