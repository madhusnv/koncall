package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateBotActionLogInput implements InputType {
    private final String accountId;
    private final String actionId;
    private final Input<String> actionName;
    private final String botId;
    private final Input<String> context;
    private final Input<String> errorMessage;
    private final Input<String> id;
    private final Input<String> status;
    private final String timestamp;
    private final Input<String> triggerMessageId;

    public static final class Builder {
        private String accountId;
        private String actionId;
        private String botId;
        private String timestamp;
        private Input<String> id = Input.absent();
        private Input<String> actionName = Input.absent();
        private Input<String> triggerMessageId = Input.absent();
        private Input<String> context = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> errorMessage = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder actionId(String str) {
            this.actionId = str;
            return this;
        }

        public Builder actionName(String str) {
            this.actionName = Input.fromNullable(str);
            return this;
        }

        public Builder botId(String str) {
            this.botId = str;
            return this;
        }

        public CreateBotActionLogInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.botId, "botId == null");
            Utils.checkNotNull(this.actionId, "actionId == null");
            Utils.checkNotNull(this.timestamp, "timestamp == null");
            return new CreateBotActionLogInput(this.id, this.accountId, this.botId, this.actionId, this.actionName, this.triggerMessageId, this.context, this.status, this.errorMessage, this.timestamp);
        }

        public Builder context(String str) {
            this.context = Input.fromNullable(str);
            return this;
        }

        public Builder errorMessage(String str) {
            this.errorMessage = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder timestamp(String str) {
            this.timestamp = str;
            return this;
        }

        public Builder triggerMessageId(String str) {
            this.triggerMessageId = Input.fromNullable(str);
            return this;
        }
    }

    public CreateBotActionLogInput(Input<String> input, String str, String str2, String str3, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, String str4) {
        this.id = input;
        this.accountId = str;
        this.botId = str2;
        this.actionId = str3;
        this.actionName = input2;
        this.triggerMessageId = input3;
        this.context = input4;
        this.status = input5;
        this.errorMessage = input6;
        this.timestamp = str4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String actionId() {
        return this.actionId;
    }

    public String actionName() {
        return this.actionName.value;
    }

    public String botId() {
        return this.botId;
    }

    public String context() {
        return this.context.value;
    }

    public String errorMessage() {
        return this.errorMessage.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateBotActionLogInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateBotActionLogInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateBotActionLogInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateBotActionLogInput.this.accountId);
                inputFieldWriter.writeString("botId", CreateBotActionLogInput.this.botId);
                inputFieldWriter.writeString(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, CreateBotActionLogInput.this.actionId);
                if (CreateBotActionLogInput.this.actionName.defined) {
                    inputFieldWriter.writeString("actionName", (String) CreateBotActionLogInput.this.actionName.value);
                }
                if (CreateBotActionLogInput.this.triggerMessageId.defined) {
                    inputFieldWriter.writeString("triggerMessageId", (String) CreateBotActionLogInput.this.triggerMessageId.value);
                }
                if (CreateBotActionLogInput.this.context.defined) {
                    inputFieldWriter.writeString("context", (String) CreateBotActionLogInput.this.context.value);
                }
                if (CreateBotActionLogInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateBotActionLogInput.this.status.value);
                }
                if (CreateBotActionLogInput.this.errorMessage.defined) {
                    inputFieldWriter.writeString("errorMessage", (String) CreateBotActionLogInput.this.errorMessage.value);
                }
                inputFieldWriter.writeString("timestamp", CreateBotActionLogInput.this.timestamp);
            }
        };
    }

    public String status() {
        return this.status.value;
    }

    public String timestamp() {
        return this.timestamp;
    }

    public String triggerMessageId() {
        return this.triggerMessageId.value;
    }
}
