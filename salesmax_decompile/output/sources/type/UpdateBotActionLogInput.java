package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateBotActionLogInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> actionId;
    private final Input<String> actionName;
    private final Input<String> botId;
    private final Input<String> context;
    private final Input<String> errorMessage;
    private final String id;
    private final Input<String> status;
    private final Input<String> timestamp;
    private final Input<String> triggerMessageId;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> botId = Input.absent();
        private Input<String> actionId = Input.absent();
        private Input<String> actionName = Input.absent();
        private Input<String> triggerMessageId = Input.absent();
        private Input<String> context = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> errorMessage = Input.absent();
        private Input<String> timestamp = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder actionId(String str) {
            this.actionId = Input.fromNullable(str);
            return this;
        }

        public Builder actionName(String str) {
            this.actionName = Input.fromNullable(str);
            return this;
        }

        public Builder botId(String str) {
            this.botId = Input.fromNullable(str);
            return this;
        }

        public UpdateBotActionLogInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateBotActionLogInput(this.id, this.accountId, this.botId, this.actionId, this.actionName, this.triggerMessageId, this.context, this.status, this.errorMessage, this.timestamp);
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
            this.id = str;
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder timestamp(String str) {
            this.timestamp = Input.fromNullable(str);
            return this;
        }

        public Builder triggerMessageId(String str) {
            this.triggerMessageId = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateBotActionLogInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9) {
        this.id = str;
        this.accountId = input;
        this.botId = input2;
        this.actionId = input3;
        this.actionName = input4;
        this.triggerMessageId = input5;
        this.context = input6;
        this.status = input7;
        this.errorMessage = input8;
        this.timestamp = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String actionId() {
        return this.actionId.value;
    }

    public String actionName() {
        return this.actionName.value;
    }

    public String botId() {
        return this.botId.value;
    }

    public String context() {
        return this.context.value;
    }

    public String errorMessage() {
        return this.errorMessage.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateBotActionLogInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateBotActionLogInput.this.id);
                if (UpdateBotActionLogInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateBotActionLogInput.this.accountId.value);
                }
                if (UpdateBotActionLogInput.this.botId.defined) {
                    inputFieldWriter.writeString("botId", (String) UpdateBotActionLogInput.this.botId.value);
                }
                if (UpdateBotActionLogInput.this.actionId.defined) {
                    inputFieldWriter.writeString(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, (String) UpdateBotActionLogInput.this.actionId.value);
                }
                if (UpdateBotActionLogInput.this.actionName.defined) {
                    inputFieldWriter.writeString("actionName", (String) UpdateBotActionLogInput.this.actionName.value);
                }
                if (UpdateBotActionLogInput.this.triggerMessageId.defined) {
                    inputFieldWriter.writeString("triggerMessageId", (String) UpdateBotActionLogInput.this.triggerMessageId.value);
                }
                if (UpdateBotActionLogInput.this.context.defined) {
                    inputFieldWriter.writeString("context", (String) UpdateBotActionLogInput.this.context.value);
                }
                if (UpdateBotActionLogInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateBotActionLogInput.this.status.value);
                }
                if (UpdateBotActionLogInput.this.errorMessage.defined) {
                    inputFieldWriter.writeString("errorMessage", (String) UpdateBotActionLogInput.this.errorMessage.value);
                }
                if (UpdateBotActionLogInput.this.timestamp.defined) {
                    inputFieldWriter.writeString("timestamp", (String) UpdateBotActionLogInput.this.timestamp.value);
                }
            }
        };
    }

    public String status() {
        return this.status.value;
    }

    public String timestamp() {
        return this.timestamp.value;
    }

    public String triggerMessageId() {
        return this.triggerMessageId.value;
    }
}
