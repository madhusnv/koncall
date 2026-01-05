package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CreateTeamAccountFromPersonalInput implements InputType {
    private final CreateTeamAccountInput createTeamAccountInput;
    private final InviteUserInput invitedUser;

    public static final class Builder {
        private CreateTeamAccountInput createTeamAccountInput;
        private InviteUserInput invitedUser;

        public CreateTeamAccountFromPersonalInput build() {
            Utils.checkNotNull(this.invitedUser, "invitedUser == null");
            Utils.checkNotNull(this.createTeamAccountInput, "createTeamAccountInput == null");
            return new CreateTeamAccountFromPersonalInput(this.invitedUser, this.createTeamAccountInput);
        }

        public Builder createTeamAccountInput(CreateTeamAccountInput createTeamAccountInput) {
            this.createTeamAccountInput = createTeamAccountInput;
            return this;
        }

        public Builder invitedUser(InviteUserInput inviteUserInput) {
            this.invitedUser = inviteUserInput;
            return this;
        }
    }

    public CreateTeamAccountFromPersonalInput(InviteUserInput inviteUserInput, CreateTeamAccountInput createTeamAccountInput) {
        this.invitedUser = inviteUserInput;
        this.createTeamAccountInput = createTeamAccountInput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CreateTeamAccountInput createTeamAccountInput() {
        return this.createTeamAccountInput;
    }

    public InviteUserInput invitedUser() {
        return this.invitedUser;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateTeamAccountFromPersonalInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeObject("invitedUser", CreateTeamAccountFromPersonalInput.this.invitedUser.marshaller());
                inputFieldWriter.writeObject("createTeamAccountInput", CreateTeamAccountFromPersonalInput.this.createTeamAccountInput.marshaller());
            }
        };
    }
}
