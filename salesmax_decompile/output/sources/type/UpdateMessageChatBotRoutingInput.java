package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateMessageChatBotRoutingInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> botId;
    private final Input<String> channelId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final String id;
    private final Input<String> messagePlatform;
    private final Input<String> phoneNumberIdExternal;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String id;
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

        public UpdateMessageChatBotRoutingInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateMessageChatBotRoutingInput(this.id, this.accountId, this.messagePlatform, this.phoneNumberIdExternal, this.channelId, this.botId, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
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
            this.id = str;
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

    public UpdateMessageChatBotRoutingInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9) {
        this.id = str;
        this.accountId = input;
        this.messagePlatform = input2;
        this.phoneNumberIdExternal = input3;
        this.channelId = input4;
        this.botId = input5;
        this.createdById = input6;
        this.updatedById = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
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
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateMessageChatBotRoutingInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateMessageChatBotRoutingInput.this.id);
                if (UpdateMessageChatBotRoutingInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateMessageChatBotRoutingInput.this.accountId.value);
                }
                if (UpdateMessageChatBotRoutingInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeString("messagePlatform", (String) UpdateMessageChatBotRoutingInput.this.messagePlatform.value);
                }
                if (UpdateMessageChatBotRoutingInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeString("phoneNumberIdExternal", (String) UpdateMessageChatBotRoutingInput.this.phoneNumberIdExternal.value);
                }
                if (UpdateMessageChatBotRoutingInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) UpdateMessageChatBotRoutingInput.this.channelId.value);
                }
                if (UpdateMessageChatBotRoutingInput.this.botId.defined) {
                    inputFieldWriter.writeString("botId", (String) UpdateMessageChatBotRoutingInput.this.botId.value);
                }
                if (UpdateMessageChatBotRoutingInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateMessageChatBotRoutingInput.this.createdById.value);
                }
                if (UpdateMessageChatBotRoutingInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateMessageChatBotRoutingInput.this.updatedById.value);
                }
                if (UpdateMessageChatBotRoutingInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateMessageChatBotRoutingInput.this.createdAt.value);
                }
                if (UpdateMessageChatBotRoutingInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateMessageChatBotRoutingInput.this.updatedAt.value);
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
