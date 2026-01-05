package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateUserInput implements InputType {
    private final Input<AddedSourceType> addedSourceType;
    private final Input<String> id;
    private final String name;
    private final Input<String> profilePictureUrl;
    private final Input<String> registeredEmail;
    private final Input<Boolean> registeredEmailVerified;
    private final String registeredNumber;
    private final Input<Boolean> registeredNumberVerified;
    private final Input<String> secondaryNumber;
    private final Input<Boolean> secondaryNumberVerified;
    private final Input<UserRegistrationStatus> userRegistrationStatus;

    public static final class Builder {
        private String name;
        private String registeredNumber;
        private Input<String> id = Input.absent();
        private Input<AddedSourceType> addedSourceType = Input.absent();
        private Input<String> profilePictureUrl = Input.absent();
        private Input<String> registeredEmail = Input.absent();
        private Input<Boolean> registeredEmailVerified = Input.absent();
        private Input<Boolean> registeredNumberVerified = Input.absent();
        private Input<String> secondaryNumber = Input.absent();
        private Input<Boolean> secondaryNumberVerified = Input.absent();
        private Input<UserRegistrationStatus> userRegistrationStatus = Input.absent();

        public Builder addedSourceType(AddedSourceType addedSourceType) {
            this.addedSourceType = Input.fromNullable(addedSourceType);
            return this;
        }

        public CreateUserInput build() {
            Utils.checkNotNull(this.name, "name == null");
            Utils.checkNotNull(this.registeredNumber, "registeredNumber == null");
            return new CreateUserInput(this.id, this.addedSourceType, this.name, this.profilePictureUrl, this.registeredEmail, this.registeredEmailVerified, this.registeredNumber, this.registeredNumberVerified, this.secondaryNumber, this.secondaryNumberVerified, this.userRegistrationStatus);
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder profilePictureUrl(String str) {
            this.profilePictureUrl = Input.fromNullable(str);
            return this;
        }

        public Builder registeredEmail(String str) {
            this.registeredEmail = Input.fromNullable(str);
            return this;
        }

        public Builder registeredEmailVerified(Boolean bool) {
            this.registeredEmailVerified = Input.fromNullable(bool);
            return this;
        }

        public Builder registeredNumber(String str) {
            this.registeredNumber = str;
            return this;
        }

        public Builder registeredNumberVerified(Boolean bool) {
            this.registeredNumberVerified = Input.fromNullable(bool);
            return this;
        }

        public Builder secondaryNumber(String str) {
            this.secondaryNumber = Input.fromNullable(str);
            return this;
        }

        public Builder secondaryNumberVerified(Boolean bool) {
            this.secondaryNumberVerified = Input.fromNullable(bool);
            return this;
        }

        public Builder userRegistrationStatus(UserRegistrationStatus userRegistrationStatus) {
            this.userRegistrationStatus = Input.fromNullable(userRegistrationStatus);
            return this;
        }
    }

    public CreateUserInput(Input<String> input, Input<AddedSourceType> input2, String str, Input<String> input3, Input<String> input4, Input<Boolean> input5, String str2, Input<Boolean> input6, Input<String> input7, Input<Boolean> input8, Input<UserRegistrationStatus> input9) {
        this.id = input;
        this.addedSourceType = input2;
        this.name = str;
        this.profilePictureUrl = input3;
        this.registeredEmail = input4;
        this.registeredEmailVerified = input5;
        this.registeredNumber = str2;
        this.registeredNumberVerified = input6;
        this.secondaryNumber = input7;
        this.secondaryNumberVerified = input8;
        this.userRegistrationStatus = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public AddedSourceType addedSourceType() {
        return this.addedSourceType.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateUserInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateUserInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateUserInput.this.id.value);
                }
                if (CreateUserInput.this.addedSourceType.defined) {
                    inputFieldWriter.writeString("addedSourceType", CreateUserInput.this.addedSourceType.value != 0 ? ((AddedSourceType) CreateUserInput.this.addedSourceType.value).name() : null);
                }
                inputFieldWriter.writeString("name", CreateUserInput.this.name);
                if (CreateUserInput.this.profilePictureUrl.defined) {
                    inputFieldWriter.writeString("profilePictureUrl", (String) CreateUserInput.this.profilePictureUrl.value);
                }
                if (CreateUserInput.this.registeredEmail.defined) {
                    inputFieldWriter.writeString("registeredEmail", (String) CreateUserInput.this.registeredEmail.value);
                }
                if (CreateUserInput.this.registeredEmailVerified.defined) {
                    inputFieldWriter.writeBoolean("registeredEmailVerified", (Boolean) CreateUserInput.this.registeredEmailVerified.value);
                }
                inputFieldWriter.writeString("registeredNumber", CreateUserInput.this.registeredNumber);
                if (CreateUserInput.this.registeredNumberVerified.defined) {
                    inputFieldWriter.writeBoolean("registeredNumberVerified", (Boolean) CreateUserInput.this.registeredNumberVerified.value);
                }
                if (CreateUserInput.this.secondaryNumber.defined) {
                    inputFieldWriter.writeString("secondaryNumber", (String) CreateUserInput.this.secondaryNumber.value);
                }
                if (CreateUserInput.this.secondaryNumberVerified.defined) {
                    inputFieldWriter.writeBoolean("secondaryNumberVerified", (Boolean) CreateUserInput.this.secondaryNumberVerified.value);
                }
                if (CreateUserInput.this.userRegistrationStatus.defined) {
                    inputFieldWriter.writeString("userRegistrationStatus", CreateUserInput.this.userRegistrationStatus.value != 0 ? ((UserRegistrationStatus) CreateUserInput.this.userRegistrationStatus.value).name() : null);
                }
            }
        };
    }

    public String name() {
        return this.name;
    }

    public String profilePictureUrl() {
        return this.profilePictureUrl.value;
    }

    public String registeredEmail() {
        return this.registeredEmail.value;
    }

    public Boolean registeredEmailVerified() {
        return this.registeredEmailVerified.value;
    }

    public String registeredNumber() {
        return this.registeredNumber;
    }

    public Boolean registeredNumberVerified() {
        return this.registeredNumberVerified.value;
    }

    public String secondaryNumber() {
        return this.secondaryNumber.value;
    }

    public Boolean secondaryNumberVerified() {
        return this.secondaryNumberVerified.value;
    }

    public UserRegistrationStatus userRegistrationStatus() {
        return this.userRegistrationStatus.value;
    }
}
