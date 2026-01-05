package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelTeamMemberTypeInput implements InputType {
    private final Input<TeamMemberType> eq;
    private final Input<TeamMemberType> ne;

    public static final class Builder {
        private Input<TeamMemberType> eq = Input.absent();
        private Input<TeamMemberType> ne = Input.absent();

        public ModelTeamMemberTypeInput build() {
            return new ModelTeamMemberTypeInput(this.eq, this.ne);
        }

        public Builder eq(TeamMemberType teamMemberType) {
            this.eq = Input.fromNullable(teamMemberType);
            return this;
        }

        public Builder ne(TeamMemberType teamMemberType) {
            this.ne = Input.fromNullable(teamMemberType);
            return this;
        }
    }

    public ModelTeamMemberTypeInput(Input<TeamMemberType> input, Input<TeamMemberType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public TeamMemberType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelTeamMemberTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelTeamMemberTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelTeamMemberTypeInput.this.eq.value != 0 ? ((TeamMemberType) ModelTeamMemberTypeInput.this.eq.value).name() : null);
                }
                if (ModelTeamMemberTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelTeamMemberTypeInput.this.ne.value != 0 ? ((TeamMemberType) ModelTeamMemberTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public TeamMemberType ne() {
        return this.ne.value;
    }
}
