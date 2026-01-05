package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateMessageChatBotRoutingInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> botId;
    private final Input<String> channelId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> id;
    private final Input<String> messagePlatform;
    private final Input<String> phoneNumberIdExternal;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private Input<String> id = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> messagePlatform = Input.absent();
        private Input<String> phoneNumberIdExternal = Input.absent();
        private Input<String> channelId = Input.absent();
        private Input<String> botId = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder botId(String str) {
            this.botId = Input.fromNullable(str);
            return this;
        }

        public CreateMessageChatBotRoutingInput build() {
            return new CreateMessageChatBotRoutingInput(this.id, this.accountId, this.messagePlatform, this.phoneNumberIdExternal, this.channelId, this.botId, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
        }

        public Builder channelId(String str) {
            this.channelId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder messagePlatform(String str) {
            this.messagePlatform = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumberIdExternal(String str) {
            this.phoneNumberIdExternal = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }
    }

    public CreateMessageChatBotRoutingInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10) {
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String botId() {
        return this.botId.value;
    }

    public String channelId() {
        return this.channelId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateMessageChatBotRoutingInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateMessageChatBotRoutingInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateMessageChatBotRoutingInput.this.id.value);
                }
                if (CreateMessageChatBotRoutingInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) CreateMessageChatBotRoutingInput.this.accountId.value);
                }
                if (CreateMessageChatBotRoutingInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeString("messagePlatform", (String) CreateMessageChatBotRoutingInput.this.messagePlatform.value);
                }
                if (CreateMessageChatBotRoutingInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeString("phoneNumberIdExternal", (String) CreateMessageChatBotRoutingInput.this.phoneNumberIdExternal.value);
                }
                if (CreateMessageChatBotRoutingInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) CreateMessageChatBotRoutingInput.this.channelId.value);
                }
                if (CreateMessageChatBotRoutingInput.this.botId.defined) {
                    inputFieldWriter.writeString("botId", (String) CreateMessageChatBotRoutingInput.this.botId.value);
                }
                if (CreateMessageChatBotRoutingInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateMessageChatBotRoutingInput.this.createdById.value);
                }
                if (CreateMessageChatBotRoutingInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateMessageChatBotRoutingInput.this.updatedById.value);
                }
                if (CreateMessageChatBotRoutingInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateMessageChatBotRoutingInput.this.createdAt.value);
                }
                if (CreateMessageChatBotRoutingInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateMessageChatBotRoutingInput.this.updatedAt.value);
                }
            }
        };
    }

    public String messagePlatform() {
        return this.messagePlatform.value;
    }

    public String phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }
}
