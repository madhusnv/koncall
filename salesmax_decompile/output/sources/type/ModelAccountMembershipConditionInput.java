package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountMembershipConditionInput implements InputType {
    private final Input<ModelStringInput> acceptedOn;
    private final Input<ModelStringInput> accountEmail;
    private final Input<ModelBooleanInput> accountEmailVerified;
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> addedOn;
    private final Input<List<ModelAccountMembershipConditionInput>> and;
    private final Input<ModelIDInput> approvedById;
    private final Input<ModelStringInput> approvedOn;
    private final Input<ModelAuthorizationLevelInput> authorizationLevel;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> designation;
    private final Input<ModelBooleanInput> mapRegisteredMobileNumberToAccount;
    private final Input<ModelBooleanInput> mapSecondaryMobileNumberToAccount;
    private final Input<ModelAccountMembershipConditionInput> not;
    private final Input<List<ModelAccountMembershipConditionInput>> or;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelUserStatusInput> userAccountStatus;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelStringInput> designation = Input.absent();
        private Input<ModelAuthorizationLevelInput> authorizationLevel = Input.absent();
        private Input<ModelStringInput> addedOn = Input.absent();
        private Input<ModelIDInput> approvedById = Input.absent();
        private Input<ModelStringInput> approvedOn = Input.absent();
        private Input<ModelStringInput> acceptedOn = Input.absent();
        private Input<ModelUserStatusInput> userAccountStatus = Input.absent();
        private Input<ModelBooleanInput> mapRegisteredMobileNumberToAccount = Input.absent();
        private Input<ModelBooleanInput> mapSecondaryMobileNumberToAccount = Input.absent();
        private Input<ModelStringInput> accountEmail = Input.absent();
        private Input<ModelBooleanInput> accountEmailVerified = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelAccountMembershipConditionInput>> and = Input.absent();
        private Input<List<ModelAccountMembershipConditionInput>> or = Input.absent();
        private Input<ModelAccountMembershipConditionInput> not = Input.absent();

        public Builder acceptedOn(ModelStringInput modelStringInput) {
            this.acceptedOn = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountEmail(ModelStringInput modelStringInput) {
            this.accountEmail = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountEmailVerified(ModelBooleanInput modelBooleanInput) {
            this.accountEmailVerified = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder addedOn(ModelStringInput modelStringInput) {
            this.addedOn = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelAccountMembershipConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder approvedById(ModelIDInput modelIDInput) {
            this.approvedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder approvedOn(ModelStringInput modelStringInput) {
            this.approvedOn = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder authorizationLevel(ModelAuthorizationLevelInput modelAuthorizationLevelInput) {
            this.authorizationLevel = Input.fromNullable(modelAuthorizationLevelInput);
            return this;
        }

        public ModelAccountMembershipConditionInput build() {
            return new ModelAccountMembershipConditionInput(this.accountId, this.userId, this.designation, this.authorizationLevel, this.addedOn, this.approvedById, this.approvedOn, this.acceptedOn, this.userAccountStatus, this.mapRegisteredMobileNumberToAccount, this.mapSecondaryMobileNumberToAccount, this.accountEmail, this.accountEmailVerified, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder designation(ModelStringInput modelStringInput) {
            this.designation = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder mapRegisteredMobileNumberToAccount(ModelBooleanInput modelBooleanInput) {
            this.mapRegisteredMobileNumberToAccount = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder mapSecondaryMobileNumberToAccount(ModelBooleanInput modelBooleanInput) {
            this.mapSecondaryMobileNumberToAccount = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelAccountMembershipConditionInput modelAccountMembershipConditionInput) {
            this.not = Input.fromNullable(modelAccountMembershipConditionInput);
            return this;
        }

        public Builder or(List<ModelAccountMembershipConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
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
    }

    public ModelAccountMembershipConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelAuthorizationLevelInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelUserStatusInput> input9, Input<ModelBooleanInput> input10, Input<ModelBooleanInput> input11, Input<ModelStringInput> input12, Input<ModelBooleanInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<List<ModelAccountMembershipConditionInput>> input16, Input<List<ModelAccountMembershipConditionInput>> input17, Input<ModelAccountMembershipConditionInput> input18) {
        this.accountId = input;
        this.userId = input2;
        this.designation = input3;
        this.authorizationLevel = input4;
        this.addedOn = input5;
        this.approvedById = input6;
        this.approvedOn = input7;
        this.acceptedOn = input8;
        this.userAccountStatus = input9;
        this.mapRegisteredMobileNumberToAccount = input10;
        this.mapSecondaryMobileNumberToAccount = input11;
        this.accountEmail = input12;
        this.accountEmailVerified = input13;
        this.createdAt = input14;
        this.updatedAt = input15;
        this.and = input16;
        this.or = input17;
        this.not = input18;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelStringInput acceptedOn() {
        return this.acceptedOn.value;
    }

    public ModelStringInput accountEmail() {
        return this.accountEmail.value;
    }

    public ModelBooleanInput accountEmailVerified() {
        return this.accountEmailVerified.value;
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput addedOn() {
        return this.addedOn.value;
    }

    public List<ModelAccountMembershipConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput approvedById() {
        return this.approvedById.value;
    }

    public ModelStringInput approvedOn() {
        return this.approvedOn.value;
    }

    public ModelAuthorizationLevelInput authorizationLevel() {
        return this.authorizationLevel.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput designation() {
        return this.designation.value;
    }

    public ModelBooleanInput mapRegisteredMobileNumberToAccount() {
        return this.mapRegisteredMobileNumberToAccount.value;
    }

    public ModelBooleanInput mapSecondaryMobileNumberToAccount() {
        return this.mapSecondaryMobileNumberToAccount.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountMembershipConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountMembershipConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelAccountMembershipConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelAccountMembershipConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelAccountMembershipConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelAccountMembershipConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.designation.defined) {
                    inputFieldWriter.writeObject("designation", ModelAccountMembershipConditionInput.this.designation.value != 0 ? ((ModelStringInput) ModelAccountMembershipConditionInput.this.designation.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.authorizationLevel.defined) {
                    inputFieldWriter.writeObject("authorizationLevel", ModelAccountMembershipConditionInput.this.authorizationLevel.value != 0 ? ((ModelAuthorizationLevelInput) ModelAccountMembershipConditionInput.this.authorizationLevel.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.addedOn.defined) {
                    inputFieldWriter.writeObject("addedOn", ModelAccountMembershipConditionInput.this.addedOn.value != 0 ? ((ModelStringInput) ModelAccountMembershipConditionInput.this.addedOn.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.approvedById.defined) {
                    inputFieldWriter.writeObject("approvedById", ModelAccountMembershipConditionInput.this.approvedById.value != 0 ? ((ModelIDInput) ModelAccountMembershipConditionInput.this.approvedById.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.approvedOn.defined) {
                    inputFieldWriter.writeObject("approvedOn", ModelAccountMembershipConditionInput.this.approvedOn.value != 0 ? ((ModelStringInput) ModelAccountMembershipConditionInput.this.approvedOn.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.acceptedOn.defined) {
                    inputFieldWriter.writeObject("acceptedOn", ModelAccountMembershipConditionInput.this.acceptedOn.value != 0 ? ((ModelStringInput) ModelAccountMembershipConditionInput.this.acceptedOn.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.userAccountStatus.defined) {
                    inputFieldWriter.writeObject("userAccountStatus", ModelAccountMembershipConditionInput.this.userAccountStatus.value != 0 ? ((ModelUserStatusInput) ModelAccountMembershipConditionInput.this.userAccountStatus.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.mapRegisteredMobileNumberToAccount.defined) {
                    inputFieldWriter.writeObject("mapRegisteredMobileNumberToAccount", ModelAccountMembershipConditionInput.this.mapRegisteredMobileNumberToAccount.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipConditionInput.this.mapRegisteredMobileNumberToAccount.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.mapSecondaryMobileNumberToAccount.defined) {
                    inputFieldWriter.writeObject("mapSecondaryMobileNumberToAccount", ModelAccountMembershipConditionInput.this.mapSecondaryMobileNumberToAccount.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipConditionInput.this.mapSecondaryMobileNumberToAccount.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.accountEmail.defined) {
                    inputFieldWriter.writeObject("accountEmail", ModelAccountMembershipConditionInput.this.accountEmail.value != 0 ? ((ModelStringInput) ModelAccountMembershipConditionInput.this.accountEmail.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.accountEmailVerified.defined) {
                    inputFieldWriter.writeObject("accountEmailVerified", ModelAccountMembershipConditionInput.this.accountEmailVerified.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipConditionInput.this.accountEmailVerified.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountMembershipConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountMembershipConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountMembershipConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountMembershipConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountMembershipConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountMembershipConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountMembershipConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountMembershipConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountMembershipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountMembershipConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountMembershipConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountMembershipConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountMembershipConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountMembershipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountMembershipConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountMembershipConditionInput.this.not.value != 0 ? ((ModelAccountMembershipConditionInput) ModelAccountMembershipConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelAccountMembershipConditionInput not() {
        return this.not.value;
    }

    public List<ModelAccountMembershipConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelUserStatusInput userAccountStatus() {
        return this.userAccountStatus.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
