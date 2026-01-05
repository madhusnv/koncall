package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CreateTeamAccountInput implements InputType {
    private final Input<String> accountEmail;
    private final CreateAccountInput accountInput;
    private final Input<String> businessLogoUrl;
    private final Input<String> dealMode;
    private final boolean isTrialAccount;
    private final boolean mapRegisteredMobileNumberToAccount;
    private final boolean mapSecondaryMobileNumberToAccount;

    public static final class Builder {
        private CreateAccountInput accountInput;
        private boolean isTrialAccount;
        private boolean mapRegisteredMobileNumberToAccount;
        private boolean mapSecondaryMobileNumberToAccount;
        private Input<String> accountEmail = Input.absent();
        private Input<String> businessLogoUrl = Input.absent();
        private Input<String> dealMode = Input.absent();

        public Builder accountEmail(String str) {
            this.accountEmail = Input.fromNullable(str);
            return this;
        }

        public Builder accountInput(CreateAccountInput createAccountInput) {
            this.accountInput = createAccountInput;
            return this;
        }

        public CreateTeamAccountInput build() {
            Utils.checkNotNull(this.accountInput, "accountInput == null");
            return new CreateTeamAccountInput(this.accountInput, this.isTrialAccount, this.mapRegisteredMobileNumberToAccount, this.mapSecondaryMobileNumberToAccount, this.accountEmail, this.businessLogoUrl, this.dealMode);
        }

        public Builder businessLogoUrl(String str) {
            this.businessLogoUrl = Input.fromNullable(str);
            return this;
        }

        public Builder dealMode(String str) {
            this.dealMode = Input.fromNullable(str);
            return this;
        }

        public Builder isTrialAccount(boolean z) {
            this.isTrialAccount = z;
            return this;
        }

        public Builder mapRegisteredMobileNumberToAccount(boolean z) {
            this.mapRegisteredMobileNumberToAccount = z;
            return this;
        }

        public Builder mapSecondaryMobileNumberToAccount(boolean z) {
            this.mapSecondaryMobileNumberToAccount = z;
            return this;
        }
    }

    public CreateTeamAccountInput(CreateAccountInput createAccountInput, boolean z, boolean z2, boolean z3, Input<String> input, Input<String> input2, Input<String> input3) {
        this.accountInput = createAccountInput;
        this.isTrialAccount = z;
        this.mapRegisteredMobileNumberToAccount = z2;
        this.mapSecondaryMobileNumberToAccount = z3;
        this.accountEmail = input;
        this.businessLogoUrl = input2;
        this.dealMode = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountEmail() {
        return this.accountEmail.value;
    }

    public CreateAccountInput accountInput() {
        return this.accountInput;
    }

    public String businessLogoUrl() {
        return this.businessLogoUrl.value;
    }

    public String dealMode() {
        return this.dealMode.value;
    }

    public boolean isTrialAccount() {
        return this.isTrialAccount;
    }

    public boolean mapRegisteredMobileNumberToAccount() {
        return this.mapRegisteredMobileNumberToAccount;
    }

    public boolean mapSecondaryMobileNumberToAccount() {
        return this.mapSecondaryMobileNumberToAccount;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateTeamAccountInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeObject("accountInput", CreateTeamAccountInput.this.accountInput.marshaller());
                inputFieldWriter.writeBoolean("isTrialAccount", Boolean.valueOf(CreateTeamAccountInput.this.isTrialAccount));
                inputFieldWriter.writeBoolean("mapRegisteredMobileNumberToAccount", Boolean.valueOf(CreateTeamAccountInput.this.mapRegisteredMobileNumberToAccount));
                inputFieldWriter.writeBoolean("mapSecondaryMobileNumberToAccount", Boolean.valueOf(CreateTeamAccountInput.this.mapSecondaryMobileNumberToAccount));
                if (CreateTeamAccountInput.this.accountEmail.defined) {
                    inputFieldWriter.writeString("accountEmail", (String) CreateTeamAccountInput.this.accountEmail.value);
                }
                if (CreateTeamAccountInput.this.businessLogoUrl.defined) {
                    inputFieldWriter.writeString("businessLogoUrl", (String) CreateTeamAccountInput.this.businessLogoUrl.value);
                }
                if (CreateTeamAccountInput.this.dealMode.defined) {
                    inputFieldWriter.writeString("dealMode", (String) CreateTeamAccountInput.this.dealMode.value);
                }
            }
        };
    }
}
