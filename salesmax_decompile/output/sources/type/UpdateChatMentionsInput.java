package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateChatMentionsInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> channelId;
    private final Input<String> createdAt;
    private final Input<Long> expirationUnixTime;
    private final String id;
    private final Input<String> mentionedById;
    private final Input<String> mentionedMessageId;
    private final Input<String> mentionedUserId;
    private final Input<String> status;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> mentionedUserId = Input.absent();
        private Input<String> mentionedMessageId = Input.absent();
        private Input<String> channelId = Input.absent();
        private Input<String> mentionedById = Input.absent();
        private Input<String> status = Input.absent();
        private Input<Long> expirationUnixTime = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateChatMentionsInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateChatMentionsInput(this.id, this.accountId, this.mentionedUserId, this.mentionedMessageId, this.channelId, this.mentionedById, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt);
        }

        public Builder channelId(String str) {
            this.channelId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder expirationUnixTime(Long l) {
            this.expirationUnixTime = Input.fromNullable(l);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder mentionedById(String str) {
            this.mentionedById = Input.fromNullable(str);
            return this;
        }

        public Builder mentionedMessageId(String str) {
            this.mentionedMessageId = Input.fromNullable(str);
            return this;
        }

        public Builder mentionedUserId(String str) {
            this.mentionedUserId = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateChatMentionsInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<Long> input7, Input<String> input8, Input<String> input9) {
        this.id = str;
        this.accountId = input;
        this.mentionedUserId = input2;
        this.mentionedMessageId = input3;
        this.channelId = input4;
        this.mentionedById = input5;
        this.status = input6;
        this.expirationUnixTime = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
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

    public String createdAt() {
        return this.createdAt.value;
    }

    public Long expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateChatMentionsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateChatMentionsInput.this.id);
                if (UpdateChatMentionsInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateChatMentionsInput.this.accountId.value);
                }
                if (UpdateChatMentionsInput.this.mentionedUserId.defined) {
                    inputFieldWriter.writeString("mentionedUserId", (String) UpdateChatMentionsInput.this.mentionedUserId.value);
                }
                if (UpdateChatMentionsInput.this.mentionedMessageId.defined) {
                    inputFieldWriter.writeString("mentionedMessageId", (String) UpdateChatMentionsInput.this.mentionedMessageId.value);
                }
                if (UpdateChatMentionsInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) UpdateChatMentionsInput.this.channelId.value);
                }
                if (UpdateChatMentionsInput.this.mentionedById.defined) {
                    inputFieldWriter.writeString("mentionedById", (String) UpdateChatMentionsInput.this.mentionedById.value);
                }
                if (UpdateChatMentionsInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateChatMentionsInput.this.status.value);
                }
                if (UpdateChatMentionsInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeLong("expirationUnixTime", (Long) UpdateChatMentionsInput.this.expirationUnixTime.value);
                }
                if (UpdateChatMentionsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateChatMentionsInput.this.createdAt.value);
                }
                if (UpdateChatMentionsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateChatMentionsInput.this.updatedAt.value);
                }
            }
        };
    }

    public String mentionedById() {
        return this.mentionedById.value;
    }

    public String mentionedMessageId() {
        return this.mentionedMessageId.value;
    }

    public String mentionedUserId() {
        return this.mentionedUserId.value;
    }

    public String status() {
        return this.status.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
