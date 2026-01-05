package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountMembershipFilterInput implements InputType {
    private final Input<ModelStringInput> acceptedOn;
    private final Input<ModelStringInput> accountEmail;
    private final Input<ModelBooleanInput> accountEmailVerified;
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> addedById;
    private final Input<ModelStringInput> addedOn;
    private final Input<ModelStringInput> allowedDeviceId;
    private final Input<List<ModelAccountMembershipFilterInput>> and;
    private final Input<ModelIDInput> approvedById;
    private final Input<ModelStringInput> approvedOn;
    private final Input<ModelAuthorizationLevelInput> authorizationLevel;
    private final Input<ModelStringInput> canCreateWaCampaigns;
    private final Input<ModelStringInput> canInitiateNewConversation;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> customMemberAttributes;
    private final Input<ModelStringInput> designation;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> isBillingMember;
    private final Input<ModelStringInput> lastViewedChatNotification;
    private final Input<ModelBooleanInput> mapRegisteredMobileNumberToAccount;
    private final Input<ModelBooleanInput> mapSecondaryMobileNumberToAccount;
    private final Input<ModelIDInput> migrateToUserIdOnRemoval;
    private final Input<ModelAccountMembershipFilterInput> not;
    private final Input<ModelBooleanInput> onLeave;
    private final Input<ModelStringInput> onLeaveTill;
    private final Input<List<ModelAccountMembershipFilterInput>> or;
    private final Input<ModelIntInput> prefDefaultSimToCall;
    private final Input<ModelBooleanInput> prefPostCallDisposition;
    private final Input<ModelStringInput> prefReadOnlyInfo;
    private final Input<ModelBooleanInput> prefSaveBusinessCall;
    private final Input<ModelBooleanInput> prefScreenPop;
    private final Input<ModelBooleanInput> prefTrackAllCalls;
    private final Input<ModelIntInput> prefTrackAllCallsSpecificSim;
    private final Input<ModelBooleanInput> prefTrackLocationOnActivity;
    private final Input<ModelBooleanInput> prefUseBusinessWhatsapp;
    private final Input<ModelStringInput> sharedInboxPermission;
    private final Input<ModelStringInput> signature;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelUserStatusInput> userAccountStatus;
    private final Input<ModelIDInput> userId;
    private final Input<ModelStringInput> whatsappApiAccess;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelStringInput> allowedDeviceId = Input.absent();
        private Input<ModelStringInput> designation = Input.absent();
        private Input<ModelAuthorizationLevelInput> authorizationLevel = Input.absent();
        private Input<ModelStringInput> signature = Input.absent();
        private Input<ModelBooleanInput> isBillingMember = Input.absent();
        private Input<ModelIDInput> addedById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelStringInput> addedOn = Input.absent();
        private Input<ModelIDInput> approvedById = Input.absent();
        private Input<ModelStringInput> approvedOn = Input.absent();
        private Input<ModelStringInput> acceptedOn = Input.absent();
        private Input<ModelUserStatusInput> userAccountStatus = Input.absent();
        private Input<ModelStringInput> whatsappApiAccess = Input.absent();
        private Input<ModelStringInput> sharedInboxPermission = Input.absent();
        private Input<ModelStringInput> canInitiateNewConversation = Input.absent();
        private Input<ModelStringInput> canCreateWaCampaigns = Input.absent();
        private Input<ModelBooleanInput> mapRegisteredMobileNumberToAccount = Input.absent();
        private Input<ModelBooleanInput> mapSecondaryMobileNumberToAccount = Input.absent();
        private Input<ModelStringInput> accountEmail = Input.absent();
        private Input<ModelBooleanInput> accountEmailVerified = Input.absent();
        private Input<ModelIDInput> migrateToUserIdOnRemoval = Input.absent();
        private Input<ModelBooleanInput> prefScreenPop = Input.absent();
        private Input<ModelBooleanInput> prefSaveBusinessCall = Input.absent();
        private Input<ModelBooleanInput> prefPostCallDisposition = Input.absent();
        private Input<ModelIntInput> prefDefaultSimToCall = Input.absent();
        private Input<ModelBooleanInput> prefTrackLocationOnActivity = Input.absent();
        private Input<ModelBooleanInput> prefUseBusinessWhatsapp = Input.absent();
        private Input<ModelBooleanInput> prefTrackAllCalls = Input.absent();
        private Input<ModelIntInput> prefTrackAllCallsSpecificSim = Input.absent();
        private Input<ModelBooleanInput> onLeave = Input.absent();
        private Input<ModelStringInput> onLeaveTill = Input.absent();
        private Input<ModelStringInput> lastViewedChatNotification = Input.absent();
        private Input<ModelStringInput> prefReadOnlyInfo = Input.absent();
        private Input<ModelStringInput> customMemberAttributes = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelAccountMembershipFilterInput>> and = Input.absent();
        private Input<List<ModelAccountMembershipFilterInput>> or = Input.absent();
        private Input<ModelAccountMembershipFilterInput> not = Input.absent();

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

        public Builder addedById(ModelIDInput modelIDInput) {
            this.addedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder addedOn(ModelStringInput modelStringInput) {
            this.addedOn = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder allowedDeviceId(ModelStringInput modelStringInput) {
            this.allowedDeviceId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelAccountMembershipFilterInput> list) {
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

        public ModelAccountMembershipFilterInput build() {
            return new ModelAccountMembershipFilterInput(this.id, this.accountId, this.userId, this.allowedDeviceId, this.designation, this.authorizationLevel, this.signature, this.isBillingMember, this.addedById, this.updatedById, this.addedOn, this.approvedById, this.approvedOn, this.acceptedOn, this.userAccountStatus, this.whatsappApiAccess, this.sharedInboxPermission, this.canInitiateNewConversation, this.canCreateWaCampaigns, this.mapRegisteredMobileNumberToAccount, this.mapSecondaryMobileNumberToAccount, this.accountEmail, this.accountEmailVerified, this.migrateToUserIdOnRemoval, this.prefScreenPop, this.prefSaveBusinessCall, this.prefPostCallDisposition, this.prefDefaultSimToCall, this.prefTrackLocationOnActivity, this.prefUseBusinessWhatsapp, this.prefTrackAllCalls, this.prefTrackAllCallsSpecificSim, this.onLeave, this.onLeaveTill, this.lastViewedChatNotification, this.prefReadOnlyInfo, this.customMemberAttributes, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder canCreateWaCampaigns(ModelStringInput modelStringInput) {
            this.canCreateWaCampaigns = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder canInitiateNewConversation(ModelStringInput modelStringInput) {
            this.canInitiateNewConversation = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder customMemberAttributes(ModelStringInput modelStringInput) {
            this.customMemberAttributes = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder designation(ModelStringInput modelStringInput) {
            this.designation = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isBillingMember(ModelBooleanInput modelBooleanInput) {
            this.isBillingMember = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder lastViewedChatNotification(ModelStringInput modelStringInput) {
            this.lastViewedChatNotification = Input.fromNullable(modelStringInput);
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

        public Builder migrateToUserIdOnRemoval(ModelIDInput modelIDInput) {
            this.migrateToUserIdOnRemoval = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelAccountMembershipFilterInput modelAccountMembershipFilterInput) {
            this.not = Input.fromNullable(modelAccountMembershipFilterInput);
            return this;
        }

        public Builder onLeave(ModelBooleanInput modelBooleanInput) {
            this.onLeave = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder onLeaveTill(ModelStringInput modelStringInput) {
            this.onLeaveTill = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelAccountMembershipFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder prefDefaultSimToCall(ModelIntInput modelIntInput) {
            this.prefDefaultSimToCall = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder prefPostCallDisposition(ModelBooleanInput modelBooleanInput) {
            this.prefPostCallDisposition = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder prefReadOnlyInfo(ModelStringInput modelStringInput) {
            this.prefReadOnlyInfo = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder prefSaveBusinessCall(ModelBooleanInput modelBooleanInput) {
            this.prefSaveBusinessCall = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder prefScreenPop(ModelBooleanInput modelBooleanInput) {
            this.prefScreenPop = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder prefTrackAllCalls(ModelBooleanInput modelBooleanInput) {
            this.prefTrackAllCalls = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder prefTrackAllCallsSpecificSim(ModelIntInput modelIntInput) {
            this.prefTrackAllCallsSpecificSim = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder prefTrackLocationOnActivity(ModelBooleanInput modelBooleanInput) {
            this.prefTrackLocationOnActivity = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder prefUseBusinessWhatsapp(ModelBooleanInput modelBooleanInput) {
            this.prefUseBusinessWhatsapp = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder sharedInboxPermission(ModelStringInput modelStringInput) {
            this.sharedInboxPermission = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder signature(ModelStringInput modelStringInput) {
            this.signature = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
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

        public Builder whatsappApiAccess(ModelStringInput modelStringInput) {
            this.whatsappApiAccess = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelAccountMembershipFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelAuthorizationLevelInput> input6, Input<ModelStringInput> input7, Input<ModelBooleanInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelStringInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelUserStatusInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelBooleanInput> input20, Input<ModelBooleanInput> input21, Input<ModelStringInput> input22, Input<ModelBooleanInput> input23, Input<ModelIDInput> input24, Input<ModelBooleanInput> input25, Input<ModelBooleanInput> input26, Input<ModelBooleanInput> input27, Input<ModelIntInput> input28, Input<ModelBooleanInput> input29, Input<ModelBooleanInput> input30, Input<ModelBooleanInput> input31, Input<ModelIntInput> input32, Input<ModelBooleanInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelStringInput> input37, Input<ModelStringInput> input38, Input<ModelStringInput> input39, Input<List<ModelAccountMembershipFilterInput>> input40, Input<List<ModelAccountMembershipFilterInput>> input41, Input<ModelAccountMembershipFilterInput> input42) {
        this.id = input;
        this.accountId = input2;
        this.userId = input3;
        this.allowedDeviceId = input4;
        this.designation = input5;
        this.authorizationLevel = input6;
        this.signature = input7;
        this.isBillingMember = input8;
        this.addedById = input9;
        this.updatedById = input10;
        this.addedOn = input11;
        this.approvedById = input12;
        this.approvedOn = input13;
        this.acceptedOn = input14;
        this.userAccountStatus = input15;
        this.whatsappApiAccess = input16;
        this.sharedInboxPermission = input17;
        this.canInitiateNewConversation = input18;
        this.canCreateWaCampaigns = input19;
        this.mapRegisteredMobileNumberToAccount = input20;
        this.mapSecondaryMobileNumberToAccount = input21;
        this.accountEmail = input22;
        this.accountEmailVerified = input23;
        this.migrateToUserIdOnRemoval = input24;
        this.prefScreenPop = input25;
        this.prefSaveBusinessCall = input26;
        this.prefPostCallDisposition = input27;
        this.prefDefaultSimToCall = input28;
        this.prefTrackLocationOnActivity = input29;
        this.prefUseBusinessWhatsapp = input30;
        this.prefTrackAllCalls = input31;
        this.prefTrackAllCallsSpecificSim = input32;
        this.onLeave = input33;
        this.onLeaveTill = input34;
        this.lastViewedChatNotification = input35;
        this.prefReadOnlyInfo = input36;
        this.customMemberAttributes = input37;
        this.createdAt = input38;
        this.updatedAt = input39;
        this.and = input40;
        this.or = input41;
        this.not = input42;
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

    public ModelIDInput addedById() {
        return this.addedById.value;
    }

    public ModelStringInput addedOn() {
        return this.addedOn.value;
    }

    public ModelStringInput allowedDeviceId() {
        return this.allowedDeviceId.value;
    }

    public List<ModelAccountMembershipFilterInput> and() {
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

    public ModelStringInput canCreateWaCampaigns() {
        return this.canCreateWaCampaigns.value;
    }

    public ModelStringInput canInitiateNewConversation() {
        return this.canInitiateNewConversation.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput customMemberAttributes() {
        return this.customMemberAttributes.value;
    }

    public ModelStringInput designation() {
        return this.designation.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput isBillingMember() {
        return this.isBillingMember.value;
    }

    public ModelStringInput lastViewedChatNotification() {
        return this.lastViewedChatNotification.value;
    }

    public ModelBooleanInput mapRegisteredMobileNumberToAccount() {
        return this.mapRegisteredMobileNumberToAccount.value;
    }

    public ModelBooleanInput mapSecondaryMobileNumberToAccount() {
        return this.mapSecondaryMobileNumberToAccount.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountMembershipFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountMembershipFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelAccountMembershipFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelAccountMembershipFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelAccountMembershipFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelAccountMembershipFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelAccountMembershipFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelAccountMembershipFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.allowedDeviceId.defined) {
                    inputFieldWriter.writeObject("allowedDeviceId", ModelAccountMembershipFilterInput.this.allowedDeviceId.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.allowedDeviceId.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.designation.defined) {
                    inputFieldWriter.writeObject("designation", ModelAccountMembershipFilterInput.this.designation.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.designation.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.authorizationLevel.defined) {
                    inputFieldWriter.writeObject("authorizationLevel", ModelAccountMembershipFilterInput.this.authorizationLevel.value != 0 ? ((ModelAuthorizationLevelInput) ModelAccountMembershipFilterInput.this.authorizationLevel.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.signature.defined) {
                    inputFieldWriter.writeObject("signature", ModelAccountMembershipFilterInput.this.signature.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.signature.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.isBillingMember.defined) {
                    inputFieldWriter.writeObject("isBillingMember", ModelAccountMembershipFilterInput.this.isBillingMember.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.isBillingMember.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelAccountMembershipFilterInput.this.addedById.value != 0 ? ((ModelIDInput) ModelAccountMembershipFilterInput.this.addedById.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelAccountMembershipFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelAccountMembershipFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.addedOn.defined) {
                    inputFieldWriter.writeObject("addedOn", ModelAccountMembershipFilterInput.this.addedOn.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.addedOn.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.approvedById.defined) {
                    inputFieldWriter.writeObject("approvedById", ModelAccountMembershipFilterInput.this.approvedById.value != 0 ? ((ModelIDInput) ModelAccountMembershipFilterInput.this.approvedById.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.approvedOn.defined) {
                    inputFieldWriter.writeObject("approvedOn", ModelAccountMembershipFilterInput.this.approvedOn.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.approvedOn.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.acceptedOn.defined) {
                    inputFieldWriter.writeObject("acceptedOn", ModelAccountMembershipFilterInput.this.acceptedOn.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.acceptedOn.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.userAccountStatus.defined) {
                    inputFieldWriter.writeObject("userAccountStatus", ModelAccountMembershipFilterInput.this.userAccountStatus.value != 0 ? ((ModelUserStatusInput) ModelAccountMembershipFilterInput.this.userAccountStatus.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.whatsappApiAccess.defined) {
                    inputFieldWriter.writeObject("whatsappApiAccess", ModelAccountMembershipFilterInput.this.whatsappApiAccess.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.whatsappApiAccess.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.sharedInboxPermission.defined) {
                    inputFieldWriter.writeObject("sharedInboxPermission", ModelAccountMembershipFilterInput.this.sharedInboxPermission.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.sharedInboxPermission.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.canInitiateNewConversation.defined) {
                    inputFieldWriter.writeObject("canInitiateNewConversation", ModelAccountMembershipFilterInput.this.canInitiateNewConversation.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.canInitiateNewConversation.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.canCreateWaCampaigns.defined) {
                    inputFieldWriter.writeObject("canCreateWaCampaigns", ModelAccountMembershipFilterInput.this.canCreateWaCampaigns.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.canCreateWaCampaigns.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.mapRegisteredMobileNumberToAccount.defined) {
                    inputFieldWriter.writeObject("mapRegisteredMobileNumberToAccount", ModelAccountMembershipFilterInput.this.mapRegisteredMobileNumberToAccount.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.mapRegisteredMobileNumberToAccount.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.mapSecondaryMobileNumberToAccount.defined) {
                    inputFieldWriter.writeObject("mapSecondaryMobileNumberToAccount", ModelAccountMembershipFilterInput.this.mapSecondaryMobileNumberToAccount.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.mapSecondaryMobileNumberToAccount.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.accountEmail.defined) {
                    inputFieldWriter.writeObject("accountEmail", ModelAccountMembershipFilterInput.this.accountEmail.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.accountEmail.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.accountEmailVerified.defined) {
                    inputFieldWriter.writeObject("accountEmailVerified", ModelAccountMembershipFilterInput.this.accountEmailVerified.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.accountEmailVerified.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.migrateToUserIdOnRemoval.defined) {
                    inputFieldWriter.writeObject("migrateToUserIdOnRemoval", ModelAccountMembershipFilterInput.this.migrateToUserIdOnRemoval.value != 0 ? ((ModelIDInput) ModelAccountMembershipFilterInput.this.migrateToUserIdOnRemoval.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.prefScreenPop.defined) {
                    inputFieldWriter.writeObject("prefScreenPop", ModelAccountMembershipFilterInput.this.prefScreenPop.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.prefScreenPop.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.prefSaveBusinessCall.defined) {
                    inputFieldWriter.writeObject("prefSaveBusinessCall", ModelAccountMembershipFilterInput.this.prefSaveBusinessCall.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.prefSaveBusinessCall.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.prefPostCallDisposition.defined) {
                    inputFieldWriter.writeObject("prefPostCallDisposition", ModelAccountMembershipFilterInput.this.prefPostCallDisposition.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.prefPostCallDisposition.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.prefDefaultSimToCall.defined) {
                    inputFieldWriter.writeObject("prefDefaultSimToCall", ModelAccountMembershipFilterInput.this.prefDefaultSimToCall.value != 0 ? ((ModelIntInput) ModelAccountMembershipFilterInput.this.prefDefaultSimToCall.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.prefTrackLocationOnActivity.defined) {
                    inputFieldWriter.writeObject("prefTrackLocationOnActivity", ModelAccountMembershipFilterInput.this.prefTrackLocationOnActivity.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.prefTrackLocationOnActivity.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.prefUseBusinessWhatsapp.defined) {
                    inputFieldWriter.writeObject("prefUseBusinessWhatsapp", ModelAccountMembershipFilterInput.this.prefUseBusinessWhatsapp.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.prefUseBusinessWhatsapp.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.prefTrackAllCalls.defined) {
                    inputFieldWriter.writeObject("prefTrackAllCalls", ModelAccountMembershipFilterInput.this.prefTrackAllCalls.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.prefTrackAllCalls.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.prefTrackAllCallsSpecificSim.defined) {
                    inputFieldWriter.writeObject("prefTrackAllCallsSpecificSim", ModelAccountMembershipFilterInput.this.prefTrackAllCallsSpecificSim.value != 0 ? ((ModelIntInput) ModelAccountMembershipFilterInput.this.prefTrackAllCallsSpecificSim.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.onLeave.defined) {
                    inputFieldWriter.writeObject("onLeave", ModelAccountMembershipFilterInput.this.onLeave.value != 0 ? ((ModelBooleanInput) ModelAccountMembershipFilterInput.this.onLeave.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.onLeaveTill.defined) {
                    inputFieldWriter.writeObject("onLeaveTill", ModelAccountMembershipFilterInput.this.onLeaveTill.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.onLeaveTill.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.lastViewedChatNotification.defined) {
                    inputFieldWriter.writeObject("lastViewedChatNotification", ModelAccountMembershipFilterInput.this.lastViewedChatNotification.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.lastViewedChatNotification.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.prefReadOnlyInfo.defined) {
                    inputFieldWriter.writeObject("prefReadOnlyInfo", ModelAccountMembershipFilterInput.this.prefReadOnlyInfo.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.prefReadOnlyInfo.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.customMemberAttributes.defined) {
                    inputFieldWriter.writeObject("customMemberAttributes", ModelAccountMembershipFilterInput.this.customMemberAttributes.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.customMemberAttributes.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountMembershipFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountMembershipFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountMembershipFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountMembershipFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountMembershipFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountMembershipFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountMembershipFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountMembershipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountMembershipFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountMembershipFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountMembershipFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountMembershipFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountMembershipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountMembershipFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountMembershipFilterInput.this.not.value != 0 ? ((ModelAccountMembershipFilterInput) ModelAccountMembershipFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput migrateToUserIdOnRemoval() {
        return this.migrateToUserIdOnRemoval.value;
    }

    public ModelAccountMembershipFilterInput not() {
        return this.not.value;
    }

    public ModelBooleanInput onLeave() {
        return this.onLeave.value;
    }

    public ModelStringInput onLeaveTill() {
        return this.onLeaveTill.value;
    }

    public List<ModelAccountMembershipFilterInput> or() {
        return this.or.value;
    }

    public ModelIntInput prefDefaultSimToCall() {
        return this.prefDefaultSimToCall.value;
    }

    public ModelBooleanInput prefPostCallDisposition() {
        return this.prefPostCallDisposition.value;
    }

    public ModelStringInput prefReadOnlyInfo() {
        return this.prefReadOnlyInfo.value;
    }

    public ModelBooleanInput prefSaveBusinessCall() {
        return this.prefSaveBusinessCall.value;
    }

    public ModelBooleanInput prefScreenPop() {
        return this.prefScreenPop.value;
    }

    public ModelBooleanInput prefTrackAllCalls() {
        return this.prefTrackAllCalls.value;
    }

    public ModelIntInput prefTrackAllCallsSpecificSim() {
        return this.prefTrackAllCallsSpecificSim.value;
    }

    public ModelBooleanInput prefTrackLocationOnActivity() {
        return this.prefTrackLocationOnActivity.value;
    }

    public ModelBooleanInput prefUseBusinessWhatsapp() {
        return this.prefUseBusinessWhatsapp.value;
    }

    public ModelStringInput sharedInboxPermission() {
        return this.sharedInboxPermission.value;
    }

    public ModelStringInput signature() {
        return this.signature.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelUserStatusInput userAccountStatus() {
        return this.userAccountStatus.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }

    public ModelStringInput whatsappApiAccess() {
        return this.whatsappApiAccess.value;
    }
}
