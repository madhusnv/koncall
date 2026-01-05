package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateWabaPhoneNumberUserInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> id;
    private final Input<Boolean> isDefault;
    private final Input<String> teamId;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> userId;
    private final Input<String> wabaPhoneNumberId;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
        private Input<String> wabaPhoneNumberId = Input.absent();
        private Input<Boolean> isDefault = Input.absent();
        private Input<String> userId = Input.absent();
        private Input<String> teamId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateWabaPhoneNumberUserInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateWabaPhoneNumberUserInput(this.id, this.accountId, this.wabaPhoneNumberId, this.isDefault, this.userId, this.teamId, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
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
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder isDefault(Boolean bool) {
            this.isDefault = Input.fromNullable(bool);
            return this;
        }

        public Builder teamId(String str) {
            this.teamId = Input.fromNullable(str);
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

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }

        public Builder wabaPhoneNumberId(String str) {
            this.wabaPhoneNumberId = Input.fromNullable(str);
            return this;
        }
    }

    public CreateWabaPhoneNumberUserInput(Input<String> input, String str, Input<String> input2, Input<Boolean> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9) {
        this.id = input;
        this.accountId = str;
        this.wabaPhoneNumberId = input2;
        this.isDefault = input3;
        this.userId = input4;
        this.teamId = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
        this.createdById = input8;
        this.updatedById = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String id() {
        return this.id.value;
    }

    public Boolean isDefault() {
        return this.isDefault.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateWabaPhoneNumberUserInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateWabaPhoneNumberUserInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateWabaPhoneNumberUserInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateWabaPhoneNumberUserInput.this.accountId);
                if (CreateWabaPhoneNumberUserInput.this.wabaPhoneNumberId.defined) {
                    inputFieldWriter.writeString("wabaPhoneNumberId", (String) CreateWabaPhoneNumberUserInput.this.wabaPhoneNumberId.value);
                }
                if (CreateWabaPhoneNumberUserInput.this.isDefault.defined) {
                    inputFieldWriter.writeBoolean("isDefault", (Boolean) CreateWabaPhoneNumberUserInput.this.isDefault.value);
                }
                if (CreateWabaPhoneNumberUserInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) CreateWabaPhoneNumberUserInput.this.userId.value);
                }
                if (CreateWabaPhoneNumberUserInput.this.teamId.defined) {
                    inputFieldWriter.writeString("teamId", (String) CreateWabaPhoneNumberUserInput.this.teamId.value);
                }
                if (CreateWabaPhoneNumberUserInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateWabaPhoneNumberUserInput.this.createdAt.value);
                }
                if (CreateWabaPhoneNumberUserInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateWabaPhoneNumberUserInput.this.updatedAt.value);
                }
                if (CreateWabaPhoneNumberUserInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateWabaPhoneNumberUserInput.this.createdById.value);
                }
                if (CreateWabaPhoneNumberUserInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateWabaPhoneNumberUserInput.this.updatedById.value);
                }
            }
        };
    }

    public String teamId() {
        return this.teamId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public String userId() {
        return this.userId.value;
    }

    public String wabaPhoneNumberId() {
        return this.wabaPhoneNumberId.value;
    }
}
