package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateWabaWebhookEventInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> displayPhoneNumber;
    private final Input<String> field;
    private final Input<String> id;
    private final Input<String> payload;
    private final Input<String> phoneNumberId;
    private final Input<String> wabaAccountId;

    public static final class Builder {
        private Input<String> id = Input.absent();
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

        public CreateWabaWebhookEventInput build() {
            return new CreateWabaWebhookEventInput(this.id, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.field, this.payload, this.createdAt);
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
            this.id = Input.fromNullable(str);
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

    public CreateWabaWebhookEventInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8) {
        this.id = input;
        this.accountId = input2;
        this.wabaAccountId = input3;
        this.displayPhoneNumber = input4;
        this.phoneNumberId = input5;
        this.field = input6;
        this.payload = input7;
        this.createdAt = input8;
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
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateWabaWebhookEventInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateWabaWebhookEventInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateWabaWebhookEventInput.this.id.value);
                }
                if (CreateWabaWebhookEventInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) CreateWabaWebhookEventInput.this.accountId.value);
                }
                if (CreateWabaWebhookEventInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeString("wabaAccountId", (String) CreateWabaWebhookEventInput.this.wabaAccountId.value);
                }
                if (CreateWabaWebhookEventInput.this.displayPhoneNumber.defined) {
                    inputFieldWriter.writeString("displayPhoneNumber", (String) CreateWabaWebhookEventInput.this.displayPhoneNumber.value);
                }
                if (CreateWabaWebhookEventInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeString("phoneNumberId", (String) CreateWabaWebhookEventInput.this.phoneNumberId.value);
                }
                if (CreateWabaWebhookEventInput.this.field.defined) {
                    inputFieldWriter.writeString("field", (String) CreateWabaWebhookEventInput.this.field.value);
                }
                if (CreateWabaWebhookEventInput.this.payload.defined) {
                    inputFieldWriter.writeString("payload", (String) CreateWabaWebhookEventInput.this.payload.value);
                }
                if (CreateWabaWebhookEventInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateWabaWebhookEventInput.this.createdAt.value);
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
