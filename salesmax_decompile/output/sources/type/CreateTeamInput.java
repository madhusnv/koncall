package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateTeamInput implements InputType {
    private final String accountId;
    private final String description;
    private final Input<String> id;
    private final Input<Boolean> includeAsTL;
    private final Input<String> teamLeadUserId;
    private final String teamName;

    public static final class Builder {
        private String accountId;
        private String description;
        private Input<String> id = Input.absent();
        private Input<Boolean> includeAsTL = Input.absent();
        private Input<String> teamLeadUserId = Input.absent();
        private String teamName;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateTeamInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.description, "description == null");
            Utils.checkNotNull(this.teamName, "teamName == null");
            return new CreateTeamInput(this.id, this.accountId, this.description, this.teamName, this.includeAsTL, this.teamLeadUserId);
        }

        public Builder description(String str) {
            this.description = str;
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder includeAsTL(Boolean bool) {
            this.includeAsTL = Input.fromNullable(bool);
            return this;
        }

        public Builder teamLeadUserId(String str) {
            this.teamLeadUserId = Input.fromNullable(str);
            return this;
        }

        public Builder teamName(String str) {
            this.teamName = str;
            return this;
        }
    }

    public CreateTeamInput(Input<String> input, String str, String str2, String str3, Input<Boolean> input2, Input<String> input3) {
        this.id = input;
        this.accountId = str;
        this.description = str2;
        this.teamName = str3;
        this.includeAsTL = input2;
        this.teamLeadUserId = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String description() {
        return this.description;
    }

    public String id() {
        return this.id.value;
    }

    public Boolean includeAsTL() {
        return this.includeAsTL.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateTeamInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateTeamInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateTeamInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateTeamInput.this.accountId);
                inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, CreateTeamInput.this.description);
                inputFieldWriter.writeString("teamName", CreateTeamInput.this.teamName);
                if (CreateTeamInput.this.includeAsTL.defined) {
                    inputFieldWriter.writeBoolean("includeAsTL", (Boolean) CreateTeamInput.this.includeAsTL.value);
                }
                if (CreateTeamInput.this.teamLeadUserId.defined) {
                    inputFieldWriter.writeString("teamLeadUserId", (String) CreateTeamInput.this.teamLeadUserId.value);
                }
            }
        };
    }

    public String teamLeadUserId() {
        return this.teamLeadUserId.value;
    }

    public String teamName() {
        return this.teamName;
    }
}
