package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateBotActionInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> description;
    private final Input<String> endpoint;
    private final String id;
    private final Input<Boolean> isPaused;
    private final Input<String> name;
    private final Input<String> payload;

    /* renamed from: type, reason: collision with root package name */
    private final Input<String> f58202type;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> name = Input.absent();

        /* renamed from: type, reason: collision with root package name */
        private Input<String> f58203type = Input.absent();
        private Input<String> endpoint = Input.absent();
        private Input<String> payload = Input.absent();
        private Input<String> description = Input.absent();
        private Input<Boolean> isPaused = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateBotActionInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateBotActionInput(this.id, this.accountId, this.name, this.f58203type, this.endpoint, this.payload, this.description, this.isPaused, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder endpoint(String str) {
            this.endpoint = Input.fromNullable(str);
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

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder payload(String str) {
            this.payload = Input.fromNullable(str);
            return this;
        }

        public Builder type(String str) {
            this.f58203type = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateBotActionInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<Boolean> input7, Input<String> input8, Input<String> input9) {
        this.id = str;
        this.accountId = input;
        this.name = input2;
        this.f58202type = input3;
        this.endpoint = input4;
        this.payload = input5;
        this.description = input6;
        this.isPaused = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
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

    public String description() {
        return this.description.value;
    }

    public String endpoint() {
        return this.endpoint.value;
    }

    public String id() {
        return this.id;
    }

    public Boolean isPaused() {
        return this.isPaused.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateBotActionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateBotActionInput.this.id);
                if (UpdateBotActionInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateBotActionInput.this.accountId.value);
                }
                if (UpdateBotActionInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateBotActionInput.this.name.value);
                }
                if (UpdateBotActionInput.this.f58202type.defined) {
                    inputFieldWriter.writeString("type", (String) UpdateBotActionInput.this.f58202type.value);
                }
                if (UpdateBotActionInput.this.endpoint.defined) {
                    inputFieldWriter.writeString("endpoint", (String) UpdateBotActionInput.this.endpoint.value);
                }
                if (UpdateBotActionInput.this.payload.defined) {
                    inputFieldWriter.writeString("payload", (String) UpdateBotActionInput.this.payload.value);
                }
                if (UpdateBotActionInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateBotActionInput.this.description.value);
                }
                if (UpdateBotActionInput.this.isPaused.defined) {
                    inputFieldWriter.writeBoolean("isPaused", (Boolean) UpdateBotActionInput.this.isPaused.value);
                }
                if (UpdateBotActionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateBotActionInput.this.createdAt.value);
                }
                if (UpdateBotActionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateBotActionInput.this.updatedAt.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String payload() {
        return this.payload.value;
    }

    public String type() {
        return this.f58202type.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
