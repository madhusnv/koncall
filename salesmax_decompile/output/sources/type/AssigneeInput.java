package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class AssigneeInput implements InputType {
    private final Input<Boolean> assignToAllIfTeam;
    private final Input<Boolean> assignToReporteesIfTeam;
    private final String assigneeId;
    private final AssigneeType assigneeType;
    private final Input<Integer> maxLoading;
    private final Input<String> primaryTeamIdIfUser;
    private final Input<Priority> priority;
    private final Input<Boolean> skipDistribution;

    public static final class Builder {
        private String assigneeId;
        private AssigneeType assigneeType;
        private Input<String> primaryTeamIdIfUser = Input.absent();
        private Input<Priority> priority = Input.absent();
        private Input<Integer> maxLoading = Input.absent();
        private Input<Boolean> assignToReporteesIfTeam = Input.absent();
        private Input<Boolean> assignToAllIfTeam = Input.absent();
        private Input<Boolean> skipDistribution = Input.absent();

        public Builder assignToAllIfTeam(Boolean bool) {
            this.assignToAllIfTeam = Input.fromNullable(bool);
            return this;
        }

        public Builder assignToReporteesIfTeam(Boolean bool) {
            this.assignToReporteesIfTeam = Input.fromNullable(bool);
            return this;
        }

        public Builder assigneeId(String str) {
            this.assigneeId = str;
            return this;
        }

        public Builder assigneeType(AssigneeType assigneeType) {
            this.assigneeType = assigneeType;
            return this;
        }

        public AssigneeInput build() {
            Utils.checkNotNull(this.assigneeId, "assigneeId == null");
            Utils.checkNotNull(this.assigneeType, "assigneeType == null");
            return new AssigneeInput(this.assigneeId, this.assigneeType, this.primaryTeamIdIfUser, this.priority, this.maxLoading, this.assignToReporteesIfTeam, this.assignToAllIfTeam, this.skipDistribution);
        }

        public Builder maxLoading(Integer num) {
            this.maxLoading = Input.fromNullable(num);
            return this;
        }

        public Builder primaryTeamIdIfUser(String str) {
            this.primaryTeamIdIfUser = Input.fromNullable(str);
            return this;
        }

        public Builder priority(Priority priority) {
            this.priority = Input.fromNullable(priority);
            return this;
        }

        public Builder skipDistribution(Boolean bool) {
            this.skipDistribution = Input.fromNullable(bool);
            return this;
        }
    }

    public AssigneeInput(String str, AssigneeType assigneeType, Input<String> input, Input<Priority> input2, Input<Integer> input3, Input<Boolean> input4, Input<Boolean> input5, Input<Boolean> input6) {
        this.assigneeId = str;
        this.assigneeType = assigneeType;
        this.primaryTeamIdIfUser = input;
        this.priority = input2;
        this.maxLoading = input3;
        this.assignToReporteesIfTeam = input4;
        this.assignToAllIfTeam = input5;
        this.skipDistribution = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean assignToAllIfTeam() {
        return this.assignToAllIfTeam.value;
    }

    public Boolean assignToReporteesIfTeam() {
        return this.assignToReporteesIfTeam.value;
    }

    public String assigneeId() {
        return this.assigneeId;
    }

    public AssigneeType assigneeType() {
        return this.assigneeType;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.AssigneeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("assigneeId", AssigneeInput.this.assigneeId);
                inputFieldWriter.writeString("assigneeType", AssigneeInput.this.assigneeType.name());
                if (AssigneeInput.this.primaryTeamIdIfUser.defined) {
                    inputFieldWriter.writeString("primaryTeamIdIfUser", (String) AssigneeInput.this.primaryTeamIdIfUser.value);
                }
                if (AssigneeInput.this.priority.defined) {
                    inputFieldWriter.writeString("priority", AssigneeInput.this.priority.value != 0 ? ((Priority) AssigneeInput.this.priority.value).name() : null);
                }
                if (AssigneeInput.this.maxLoading.defined) {
                    inputFieldWriter.writeInt("maxLoading", (Integer) AssigneeInput.this.maxLoading.value);
                }
                if (AssigneeInput.this.assignToReporteesIfTeam.defined) {
                    inputFieldWriter.writeBoolean("assignToReporteesIfTeam", (Boolean) AssigneeInput.this.assignToReporteesIfTeam.value);
                }
                if (AssigneeInput.this.assignToAllIfTeam.defined) {
                    inputFieldWriter.writeBoolean("assignToAllIfTeam", (Boolean) AssigneeInput.this.assignToAllIfTeam.value);
                }
                if (AssigneeInput.this.skipDistribution.defined) {
                    inputFieldWriter.writeBoolean("skipDistribution", (Boolean) AssigneeInput.this.skipDistribution.value);
                }
            }
        };
    }

    public Integer maxLoading() {
        return this.maxLoading.value;
    }

    public String primaryTeamIdIfUser() {
        return this.primaryTeamIdIfUser.value;
    }

    public Priority priority() {
        return this.priority.value;
    }

    public Boolean skipDistribution() {
        return this.skipDistribution.value;
    }
}
