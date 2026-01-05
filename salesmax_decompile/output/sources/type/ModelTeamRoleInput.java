package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelTeamRoleInput implements InputType {
    private final Input<TeamRole> eq;
    private final Input<TeamRole> ne;

    public static final class Builder {
        private Input<TeamRole> eq = Input.absent();
        private Input<TeamRole> ne = Input.absent();

        public ModelTeamRoleInput build() {
            return new ModelTeamRoleInput(this.eq, this.ne);
        }

        public Builder eq(TeamRole teamRole) {
            this.eq = Input.fromNullable(teamRole);
            return this;
        }

        public Builder ne(TeamRole teamRole) {
            this.ne = Input.fromNullable(teamRole);
            return this;
        }
    }

    public ModelTeamRoleInput(Input<TeamRole> input, Input<TeamRole> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public TeamRole eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelTeamRoleInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelTeamRoleInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelTeamRoleInput.this.eq.value != 0 ? ((TeamRole) ModelTeamRoleInput.this.eq.value).name() : null);
                }
                if (ModelTeamRoleInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelTeamRoleInput.this.ne.value != 0 ? ((TeamRole) ModelTeamRoleInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public TeamRole ne() {
        return this.ne.value;
    }
}
