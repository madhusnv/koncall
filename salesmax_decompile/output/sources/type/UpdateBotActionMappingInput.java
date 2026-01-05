package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateBotActionMappingInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> actionId;
    private final Input<String> botId;
    private final Input<String> context;
    private final Input<String> createdAt;
    private final String id;
    private final Input<Boolean> isPaused;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> botId = Input.absent();
        private Input<String> actionId = Input.absent();
        private Input<String> context = Input.absent();
        private Input<Boolean> isPaused = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder actionId(String str) {
            this.actionId = Input.fromNullable(str);
            return this;
        }

        public Builder botId(String str) {
            this.botId = Input.fromNullable(str);
            return this;
        }

        public UpdateBotActionMappingInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateBotActionMappingInput(this.id, this.accountId, this.botId, this.actionId, this.context, this.isPaused, this.createdAt, this.updatedAt);
        }

        public Builder context(String str) {
            this.context = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder isPaused(Boolean bool) {
            this.isPaused = Input.fromNullable(bool);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateBotActionMappingInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<Boolean> input5, Input<String> input6, Input<String> input7) {
        this.id = str;
        this.accountId = input;
        this.botId = input2;
        this.actionId = input3;
        this.context = input4;
        this.isPaused = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
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

    public String botId() {
        return this.botId.value;
    }

    public String context() {
        return this.context.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id;
    }

    public Boolean isPaused() {
        return this.isPaused.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateBotActionMappingInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateBotActionMappingInput.this.id);
                if (UpdateBotActionMappingInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateBotActionMappingInput.this.accountId.value);
                }
                if (UpdateBotActionMappingInput.this.botId.defined) {
                    inputFieldWriter.writeString("botId", (String) UpdateBotActionMappingInput.this.botId.value);
                }
                if (UpdateBotActionMappingInput.this.actionId.defined) {
                    inputFieldWriter.writeString(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, (String) UpdateBotActionMappingInput.this.actionId.value);
                }
                if (UpdateBotActionMappingInput.this.context.defined) {
                    inputFieldWriter.writeString("context", (String) UpdateBotActionMappingInput.this.context.value);
                }
                if (UpdateBotActionMappingInput.this.isPaused.defined) {
                    inputFieldWriter.writeBoolean("isPaused", (Boolean) UpdateBotActionMappingInput.this.isPaused.value);
                }
                if (UpdateBotActionMappingInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateBotActionMappingInput.this.createdAt.value);
                }
                if (UpdateBotActionMappingInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateBotActionMappingInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
