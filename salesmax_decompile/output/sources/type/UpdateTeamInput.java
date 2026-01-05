package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateTeamInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> description;
    private final String id;
    private final Input<String> teamName;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> description = Input.absent();
        private Input<String> teamName = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateTeamInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateTeamInput(this.id, this.accountId, this.createdById, this.description, this.teamName, this.updatedById, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder teamName(String str) {
            this.teamName = Input.fromNullable(str);
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
    }

    public UpdateTeamInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = str;
        this.accountId = input;
        this.createdById = input2;
        this.description = input3;
        this.teamName = input4;
        this.updatedById = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
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

    public String createdById() {
        return this.createdById.value;
    }

    public String description() {
        return this.description.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateTeamInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateTeamInput.this.id);
                if (UpdateTeamInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateTeamInput.this.accountId.value);
                }
                if (UpdateTeamInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateTeamInput.this.createdById.value);
                }
                if (UpdateTeamInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateTeamInput.this.description.value);
                }
                if (UpdateTeamInput.this.teamName.defined) {
                    inputFieldWriter.writeString("teamName", (String) UpdateTeamInput.this.teamName.value);
                }
                if (UpdateTeamInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateTeamInput.this.updatedById.value);
                }
                if (UpdateTeamInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateTeamInput.this.createdAt.value);
                }
                if (UpdateTeamInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateTeamInput.this.updatedAt.value);
                }
            }
        };
    }

    public String teamName() {
        return this.teamName.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }
}
