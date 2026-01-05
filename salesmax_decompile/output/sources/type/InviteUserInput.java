package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class InviteUserInput implements InputType {
    private final CreateUserInput invitedUser;
    private final AuthorizationLevel invitedUserAuthorizationLevel;
    private final String inviteeAccountId;
    private final Input<String> inviteeUserIdIfTrial;

    public static final class Builder {
        private CreateUserInput invitedUser;
        private AuthorizationLevel invitedUserAuthorizationLevel;
        private String inviteeAccountId;
        private Input<String> inviteeUserIdIfTrial = Input.absent();

        public InviteUserInput build() {
            Utils.checkNotNull(this.invitedUser, "invitedUser == null");
            Utils.checkNotNull(this.invitedUserAuthorizationLevel, "invitedUserAuthorizationLevel == null");
            Utils.checkNotNull(this.inviteeAccountId, "inviteeAccountId == null");
            return new InviteUserInput(this.invitedUser, this.invitedUserAuthorizationLevel, this.inviteeAccountId, this.inviteeUserIdIfTrial);
        }

        public Builder invitedUser(CreateUserInput createUserInput) {
            this.invitedUser = createUserInput;
            return this;
        }

        public Builder invitedUserAuthorizationLevel(AuthorizationLevel authorizationLevel) {
            this.invitedUserAuthorizationLevel = authorizationLevel;
            return this;
        }

        public Builder inviteeAccountId(String str) {
            this.inviteeAccountId = str;
            return this;
        }

        public Builder inviteeUserIdIfTrial(String str) {
            this.inviteeUserIdIfTrial = Input.fromNullable(str);
            return this;
        }
    }

    public InviteUserInput(CreateUserInput createUserInput, AuthorizationLevel authorizationLevel, String str, Input<String> input) {
        this.invitedUser = createUserInput;
        this.invitedUserAuthorizationLevel = authorizationLevel;
        this.inviteeAccountId = str;
        this.inviteeUserIdIfTrial = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CreateUserInput invitedUser() {
        return this.invitedUser;
    }

    public AuthorizationLevel invitedUserAuthorizationLevel() {
        return this.invitedUserAuthorizationLevel;
    }

    public String inviteeAccountId() {
        return this.inviteeAccountId;
    }

    public String inviteeUserIdIfTrial() {
        return this.inviteeUserIdIfTrial.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.InviteUserInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeObject("invitedUser", InviteUserInput.this.invitedUser.marshaller());
                inputFieldWriter.writeString("invitedUserAuthorizationLevel", InviteUserInput.this.invitedUserAuthorizationLevel.name());
                inputFieldWriter.writeString("inviteeAccountId", InviteUserInput.this.inviteeAccountId);
                if (InviteUserInput.this.inviteeUserIdIfTrial.defined) {
                    inputFieldWriter.writeString("inviteeUserIdIfTrial", (String) InviteUserInput.this.inviteeUserIdIfTrial.value);
                }
            }
        };
    }
}
