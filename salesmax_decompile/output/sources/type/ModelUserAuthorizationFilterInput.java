package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelUserAuthorizationFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelAccountStatusInput> accountStatus;
    private final Input<ModelAccountTypeInput> accountType;
    private final Input<ModelIDInput> allAllowedTeams;
    private final Input<ModelIDInput> allDirectReportees;
    private final Input<ModelIDInput> allIndirectReportees;
    private final Input<List<ModelUserAuthorizationFilterInput>> and;
    private final Input<ModelAuthorizationLevelInput> authorizationLevel;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> defaultTeamId;
    private final Input<ModelIDInput> id;
    private final Input<ModelUserAuthorizationFilterInput> not;
    private final Input<List<ModelUserAuthorizationFilterInput>> or;
    private final Input<ModelIDInput> teamsAsLead;
    private final Input<ModelIDInput> teamsAsReportees;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelBooleanInput> userAccountEmailVerification;
    private final Input<ModelStringInput> userAccountPrimaryNumber;
    private final Input<ModelStringInput> userAccountSecondaryNumber;
    private final Input<ModelUserStatusInput> userAccountStatus;
    private final Input<ModelIDInput> userId;
    private final Input<ModelUserRegistrationStatusInput> userRegistrationStatus;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelUserRegistrationStatusInput> userRegistrationStatus = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelAccountTypeInput> accountType = Input.absent();
        private Input<ModelAccountStatusInput> accountStatus = Input.absent();
        private Input<ModelUserStatusInput> userAccountStatus = Input.absent();
        private Input<ModelAuthorizationLevelInput> authorizationLevel = Input.absent();
        private Input<ModelStringInput> userAccountPrimaryNumber = Input.absent();
        private Input<ModelStringInput> userAccountSecondaryNumber = Input.absent();
        private Input<ModelBooleanInput> userAccountEmailVerification = Input.absent();
        private Input<ModelIDInput> defaultTeamId = Input.absent();
        private Input<ModelIDInput> allAllowedTeams = Input.absent();
        private Input<ModelIDInput> teamsAsLead = Input.absent();
        private Input<ModelIDInput> teamsAsReportees = Input.absent();
        private Input<ModelIDInput> allDirectReportees = Input.absent();
        private Input<ModelIDInput> allIndirectReportees = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelUserAuthorizationFilterInput>> and = Input.absent();
        private Input<List<ModelUserAuthorizationFilterInput>> or = Input.absent();
        private Input<ModelUserAuthorizationFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder accountStatus(ModelAccountStatusInput modelAccountStatusInput) {
            this.accountStatus = Input.fromNullable(modelAccountStatusInput);
            return this;
        }

        public Builder accountType(ModelAccountTypeInput modelAccountTypeInput) {
            this.accountType = Input.fromNullable(modelAccountTypeInput);
            return this;
        }

        public Builder allAllowedTeams(ModelIDInput modelIDInput) {
            this.allAllowedTeams = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder allDirectReportees(ModelIDInput modelIDInput) {
            this.allDirectReportees = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder allIndirectReportees(ModelIDInput modelIDInput) {
            this.allIndirectReportees = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelUserAuthorizationFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder authorizationLevel(ModelAuthorizationLevelInput modelAuthorizationLevelInput) {
            this.authorizationLevel = Input.fromNullable(modelAuthorizationLevelInput);
            return this;
        }

        public ModelUserAuthorizationFilterInput build() {
            return new ModelUserAuthorizationFilterInput(this.id, this.userId, this.userRegistrationStatus, this.accountId, this.accountType, this.accountStatus, this.userAccountStatus, this.authorizationLevel, this.userAccountPrimaryNumber, this.userAccountSecondaryNumber, this.userAccountEmailVerification, this.defaultTeamId, this.allAllowedTeams, this.teamsAsLead, this.teamsAsReportees, this.allDirectReportees, this.allIndirectReportees, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder defaultTeamId(ModelIDInput modelIDInput) {
            this.defaultTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelUserAuthorizationFilterInput modelUserAuthorizationFilterInput) {
            this.not = Input.fromNullable(modelUserAuthorizationFilterInput);
            return this;
        }

        public Builder or(List<ModelUserAuthorizationFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder teamsAsLead(ModelIDInput modelIDInput) {
            this.teamsAsLead = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder teamsAsReportees(ModelIDInput modelIDInput) {
            this.teamsAsReportees = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userAccountEmailVerification(ModelBooleanInput modelBooleanInput) {
            this.userAccountEmailVerification = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder userAccountPrimaryNumber(ModelStringInput modelStringInput) {
            this.userAccountPrimaryNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userAccountSecondaryNumber(ModelStringInput modelStringInput) {
            this.userAccountSecondaryNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userAccountStatus(ModelUserStatusInput modelUserStatusInput) {
            this.userAccountStatus = Input.fromNullable(modelUserStatusInput);
            return this;
        }

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder userRegistrationStatus(ModelUserRegistrationStatusInput modelUserRegistrationStatusInput) {
            this.userRegistrationStatus = Input.fromNullable(modelUserRegistrationStatusInput);
            return this;
        }
    }

    public ModelUserAuthorizationFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelUserRegistrationStatusInput> input3, Input<ModelIDInput> input4, Input<ModelAccountTypeInput> input5, Input<ModelAccountStatusInput> input6, Input<ModelUserStatusInput> input7, Input<ModelAuthorizationLevelInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelBooleanInput> input11, Input<ModelIDInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelIDInput> input16, Input<ModelIDInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<List<ModelUserAuthorizationFilterInput>> input20, Input<List<ModelUserAuthorizationFilterInput>> input21, Input<ModelUserAuthorizationFilterInput> input22) {
        this.id = input;
        this.userId = input2;
        this.userRegistrationStatus = input3;
        this.accountId = input4;
        this.accountType = input5;
        this.accountStatus = input6;
        this.userAccountStatus = input7;
        this.authorizationLevel = input8;
        this.userAccountPrimaryNumber = input9;
        this.userAccountSecondaryNumber = input10;
        this.userAccountEmailVerification = input11;
        this.defaultTeamId = input12;
        this.allAllowedTeams = input13;
        this.teamsAsLead = input14;
        this.teamsAsReportees = input15;
        this.allDirectReportees = input16;
        this.allIndirectReportees = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
        this.and = input20;
        this.or = input21;
        this.not = input22;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelAccountStatusInput accountStatus() {
        return this.accountStatus.value;
    }

    public ModelAccountTypeInput accountType() {
        return this.accountType.value;
    }

    public ModelIDInput allAllowedTeams() {
        return this.allAllowedTeams.value;
    }

    public ModelIDInput allDirectReportees() {
        return this.allDirectReportees.value;
    }

    public ModelIDInput allIndirectReportees() {
        return this.allIndirectReportees.value;
    }

    public List<ModelUserAuthorizationFilterInput> and() {
        return this.and.value;
    }

    public ModelAuthorizationLevelInput authorizationLevel() {
        return this.authorizationLevel.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput defaultTeamId() {
        return this.defaultTeamId.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelUserAuthorizationFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelUserAuthorizationFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelUserAuthorizationFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelUserAuthorizationFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelUserAuthorizationFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelUserAuthorizationFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.userRegistrationStatus.defined) {
                    inputFieldWriter.writeObject("userRegistrationStatus", ModelUserAuthorizationFilterInput.this.userRegistrationStatus.value != 0 ? ((ModelUserRegistrationStatusInput) ModelUserAuthorizationFilterInput.this.userRegistrationStatus.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelUserAuthorizationFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelUserAuthorizationFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.accountType.defined) {
                    inputFieldWriter.writeObject("accountType", ModelUserAuthorizationFilterInput.this.accountType.value != 0 ? ((ModelAccountTypeInput) ModelUserAuthorizationFilterInput.this.accountType.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.accountStatus.defined) {
                    inputFieldWriter.writeObject("accountStatus", ModelUserAuthorizationFilterInput.this.accountStatus.value != 0 ? ((ModelAccountStatusInput) ModelUserAuthorizationFilterInput.this.accountStatus.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.userAccountStatus.defined) {
                    inputFieldWriter.writeObject("userAccountStatus", ModelUserAuthorizationFilterInput.this.userAccountStatus.value != 0 ? ((ModelUserStatusInput) ModelUserAuthorizationFilterInput.this.userAccountStatus.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.authorizationLevel.defined) {
                    inputFieldWriter.writeObject("authorizationLevel", ModelUserAuthorizationFilterInput.this.authorizationLevel.value != 0 ? ((ModelAuthorizationLevelInput) ModelUserAuthorizationFilterInput.this.authorizationLevel.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.userAccountPrimaryNumber.defined) {
                    inputFieldWriter.writeObject("userAccountPrimaryNumber", ModelUserAuthorizationFilterInput.this.userAccountPrimaryNumber.value != 0 ? ((ModelStringInput) ModelUserAuthorizationFilterInput.this.userAccountPrimaryNumber.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.userAccountSecondaryNumber.defined) {
                    inputFieldWriter.writeObject("userAccountSecondaryNumber", ModelUserAuthorizationFilterInput.this.userAccountSecondaryNumber.value != 0 ? ((ModelStringInput) ModelUserAuthorizationFilterInput.this.userAccountSecondaryNumber.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.userAccountEmailVerification.defined) {
                    inputFieldWriter.writeObject("userAccountEmailVerification", ModelUserAuthorizationFilterInput.this.userAccountEmailVerification.value != 0 ? ((ModelBooleanInput) ModelUserAuthorizationFilterInput.this.userAccountEmailVerification.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.defaultTeamId.defined) {
                    inputFieldWriter.writeObject("defaultTeamId", ModelUserAuthorizationFilterInput.this.defaultTeamId.value != 0 ? ((ModelIDInput) ModelUserAuthorizationFilterInput.this.defaultTeamId.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.allAllowedTeams.defined) {
                    inputFieldWriter.writeObject("allAllowedTeams", ModelUserAuthorizationFilterInput.this.allAllowedTeams.value != 0 ? ((ModelIDInput) ModelUserAuthorizationFilterInput.this.allAllowedTeams.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.teamsAsLead.defined) {
                    inputFieldWriter.writeObject("teamsAsLead", ModelUserAuthorizationFilterInput.this.teamsAsLead.value != 0 ? ((ModelIDInput) ModelUserAuthorizationFilterInput.this.teamsAsLead.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.teamsAsReportees.defined) {
                    inputFieldWriter.writeObject("teamsAsReportees", ModelUserAuthorizationFilterInput.this.teamsAsReportees.value != 0 ? ((ModelIDInput) ModelUserAuthorizationFilterInput.this.teamsAsReportees.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.allDirectReportees.defined) {
                    inputFieldWriter.writeObject("allDirectReportees", ModelUserAuthorizationFilterInput.this.allDirectReportees.value != 0 ? ((ModelIDInput) ModelUserAuthorizationFilterInput.this.allDirectReportees.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.allIndirectReportees.defined) {
                    inputFieldWriter.writeObject("allIndirectReportees", ModelUserAuthorizationFilterInput.this.allIndirectReportees.value != 0 ? ((ModelIDInput) ModelUserAuthorizationFilterInput.this.allIndirectReportees.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelUserAuthorizationFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelUserAuthorizationFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelUserAuthorizationFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelUserAuthorizationFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelUserAuthorizationFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelUserAuthorizationFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUserAuthorizationFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUserAuthorizationFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUserAuthorizationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUserAuthorizationFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelUserAuthorizationFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUserAuthorizationFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUserAuthorizationFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUserAuthorizationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUserAuthorizationFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelUserAuthorizationFilterInput.this.not.value != 0 ? ((ModelUserAuthorizationFilterInput) ModelUserAuthorizationFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelUserAuthorizationFilterInput not() {
        return this.not.value;
    }

    public List<ModelUserAuthorizationFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput teamsAsLead() {
        return this.teamsAsLead.value;
    }

    public ModelIDInput teamsAsReportees() {
        return this.teamsAsReportees.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelBooleanInput userAccountEmailVerification() {
        return this.userAccountEmailVerification.value;
    }

    public ModelStringInput userAccountPrimaryNumber() {
        return this.userAccountPrimaryNumber.value;
    }

    public ModelStringInput userAccountSecondaryNumber() {
        return this.userAccountSecondaryNumber.value;
    }

    public ModelUserStatusInput userAccountStatus() {
        return this.userAccountStatus.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }

    public ModelUserRegistrationStatusInput userRegistrationStatus() {
        return this.userRegistrationStatus.value;
    }
}
