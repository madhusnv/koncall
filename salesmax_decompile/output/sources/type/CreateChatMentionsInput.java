package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateChatMentionsInput implements InputType {
    private final String accountId;
    private final String channelId;
    private final Input<String> createdAt;
    private final Input<Long> expirationUnixTime;
    private final Input<String> id;
    private final Input<String> mentionedById;
    private final String mentionedMessageId;
    private final String mentionedUserId;
    private final Input<String> status;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String channelId;
        private String mentionedMessageId;
        private String mentionedUserId;
        private Input<String> id = Input.absent();
        private Input<String> mentionedById = Input.absent();
        private Input<String> status = Input.absent();
        private Input<Long> expirationUnixTime = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateChatMentionsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.mentionedUserId, "mentionedUserId == null");
            Utils.checkNotNull(this.mentionedMessageId, "mentionedMessageId == null");
            Utils.checkNotNull(this.channelId, "channelId == null");
            return new CreateChatMentionsInput(this.id, this.accountId, this.mentionedUserId, this.mentionedMessageId, this.channelId, this.mentionedById, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt);
        }

        public Builder channelId(String str) {
            this.channelId = str;
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
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder mentionedById(String str) {
            this.mentionedById = Input.fromNullable(str);
            return this;
        }

        public Builder mentionedMessageId(String str) {
            this.mentionedMessageId = str;
            return this;
        }

        public Builder mentionedUserId(String str) {
            this.mentionedUserId = str;
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

    public CreateChatMentionsInput(Input<String> input, String str, String str2, String str3, String str4, Input<String> input2, Input<String> input3, Input<Long> input4, Input<String> input5, Input<String> input6) {
        this.id = input;
        this.accountId = str;
        this.mentionedUserId = str2;
        this.mentionedMessageId = str3;
        this.channelId = str4;
        this.mentionedById = input2;
        this.status = input3;
        this.expirationUnixTime = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String channelId() {
        return this.channelId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public Long expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateChatMentionsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateChatMentionsInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateChatMentionsInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateChatMentionsInput.this.accountId);
                inputFieldWriter.writeString("mentionedUserId", CreateChatMentionsInput.this.mentionedUserId);
                inputFieldWriter.writeString("mentionedMessageId", CreateChatMentionsInput.this.mentionedMessageId);
                inputFieldWriter.writeString("channelId", CreateChatMentionsInput.this.channelId);
                if (CreateChatMentionsInput.this.mentionedById.defined) {
                    inputFieldWriter.writeString("mentionedById", (String) CreateChatMentionsInput.this.mentionedById.value);
                }
                if (CreateChatMentionsInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateChatMentionsInput.this.status.value);
                }
                if (CreateChatMentionsInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeLong("expirationUnixTime", (Long) CreateChatMentionsInput.this.expirationUnixTime.value);
                }
                if (CreateChatMentionsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateChatMentionsInput.this.createdAt.value);
                }
                if (CreateChatMentionsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateChatMentionsInput.this.updatedAt.value);
                }
            }
        };
    }

    public String mentionedById() {
        return this.mentionedById.value;
    }

    public String mentionedMessageId() {
        return this.mentionedMessageId;
    }

    public String mentionedUserId() {
        return this.mentionedUserId;
    }

    public String status() {
        return this.status.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
