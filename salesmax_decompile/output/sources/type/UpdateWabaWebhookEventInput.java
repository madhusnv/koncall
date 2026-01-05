package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateWabaWebhookEventInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> displayPhoneNumber;
    private final Input<String> field;
    private final String id;
    private final Input<String> payload;
    private final Input<String> phoneNumberId;
    private final Input<String> wabaAccountId;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> wabaAccountId = Input.absent();
        private Input<String> displayPhoneNumber = Input.absent();
        private Input<String> phoneNumberId = Input.absent();
        private Input<String> field = Input.absent();
        private Input<String> payload = Input.absent();
        private Input<String> createdAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateWabaWebhookEventInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateWabaWebhookEventInput(this.id, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.field, this.payload, this.createdAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder displayPhoneNumber(String str) {
            this.displayPhoneNumber = Input.fromNullable(str);
            return this;
        }

        public Builder field(String str) {
            this.field = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder payload(String str) {
            this.payload = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumberId(String str) {
            this.phoneNumberId = Input.fromNullable(str);
            return this;
        }

        public Builder wabaAccountId(String str) {
            this.wabaAccountId = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateWabaWebhookEventInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = str;
        this.accountId = input;
        this.wabaAccountId = input2;
        this.displayPhoneNumber = input3;
        this.phoneNumberId = input4;
        this.field = input5;
        this.payload = input6;
        this.createdAt = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String displayPhoneNumber() {
        return this.displayPhoneNumber.value;
    }

    public String field() {
        return this.field.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateWabaWebhookEventInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateWabaWebhookEventInput.this.id);
                if (UpdateWabaWebhookEventInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateWabaWebhookEventInput.this.accountId.value);
                }
                if (UpdateWabaWebhookEventInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeString("wabaAccountId", (String) UpdateWabaWebhookEventInput.this.wabaAccountId.value);
                }
                if (UpdateWabaWebhookEventInput.this.displayPhoneNumber.defined) {
                    inputFieldWriter.writeString("displayPhoneNumber", (String) UpdateWabaWebhookEventInput.this.displayPhoneNumber.value);
                }
                if (UpdateWabaWebhookEventInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeString("phoneNumberId", (String) UpdateWabaWebhookEventInput.this.phoneNumberId.value);
                }
                if (UpdateWabaWebhookEventInput.this.field.defined) {
                    inputFieldWriter.writeString("field", (String) UpdateWabaWebhookEventInput.this.field.value);
                }
                if (UpdateWabaWebhookEventInput.this.payload.defined) {
                    inputFieldWriter.writeString("payload", (String) UpdateWabaWebhookEventInput.this.payload.value);
                }
                if (UpdateWabaWebhookEventInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateWabaWebhookEventInput.this.createdAt.value);
                }
            }
        };
    }

    public String payload() {
        return this.payload.value;
    }

    public String phoneNumberId() {
        return this.phoneNumberId.value;
    }

    public String wabaAccountId() {
        return this.wabaAccountId.value;
    }
}
