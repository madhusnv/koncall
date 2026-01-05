package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateBotActionMappingInput implements InputType {
    private final String accountId;
    private final String actionId;
    private final String botId;
    private final Input<String> context;
    private final Input<String> createdAt;
    private final Input<String> id;
    private final Input<Boolean> isPaused;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String actionId;
        private String botId;
        private Input<String> id = Input.absent();
        private Input<String> context = Input.absent();
        private Input<Boolean> isPaused = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder actionId(String str) {
            this.actionId = str;
            return this;
        }

        public Builder botId(String str) {
            this.botId = str;
            return this;
        }

        public CreateBotActionMappingInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.botId, "botId == null");
            Utils.checkNotNull(this.actionId, "actionId == null");
            return new CreateBotActionMappingInput(this.id, this.accountId, this.botId, this.actionId, this.context, this.isPaused, this.createdAt, this.updatedAt);
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
            this.id = Input.fromNullable(str);
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

    public CreateBotActionMappingInput(Input<String> input, String str, String str2, String str3, Input<String> input2, Input<Boolean> input3, Input<String> input4, Input<String> input5) {
        this.id = input;
        this.accountId = str;
        this.botId = str2;
        this.actionId = str3;
        this.context = input2;
        this.isPaused = input3;
        this.createdAt = input4;
        this.updatedAt = input5;
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

    public String botId() {
        return this.botId;
    }

    public String context() {
        return this.context.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id.value;
    }

    public Boolean isPaused() {
        return this.isPaused.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateBotActionMappingInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateBotActionMappingInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateBotActionMappingInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateBotActionMappingInput.this.accountId);
                inputFieldWriter.writeString("botId", CreateBotActionMappingInput.this.botId);
                inputFieldWriter.writeString(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, CreateBotActionMappingInput.this.actionId);
                if (CreateBotActionMappingInput.this.context.defined) {
                    inputFieldWriter.writeString("context", (String) CreateBotActionMappingInput.this.context.value);
                }
                if (CreateBotActionMappingInput.this.isPaused.defined) {
                    inputFieldWriter.writeBoolean("isPaused", (Boolean) CreateBotActionMappingInput.this.isPaused.value);
                }
                if (CreateBotActionMappingInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateBotActionMappingInput.this.createdAt.value);
                }
                if (CreateBotActionMappingInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateBotActionMappingInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
