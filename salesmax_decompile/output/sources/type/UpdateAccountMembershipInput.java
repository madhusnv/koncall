package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateAccountMembershipInput implements InputType {
    private final Input<String> accountEmail;
    private final Input<AuthorizationLevel> authorizationLevel;
    private final Input<String> canCreateWaCampaigns;
    private final Input<String> canInitiateNewConversation;
    private final Input<String> customMemberAttributes;
    private final Input<String> designation;
    private final String id;
    private final Input<Boolean> isBillingMember;
    private final Input<String> lastViewedChatNotification;
    private final Input<Boolean> mapRegisteredMobileNumberToAccount;
    private final Input<Boolean> mapSecondaryMobileNumberToAccount;
    private final Input<String> migrateToUserIdOnRemoval;
    private final Input<List<NotificationPreferencesInput>> notificationPreferences;
    private final Input<Integer> prefDefaultSimToCall;
    private final Input<Boolean> prefPostCallDisposition;
    private final Input<String> prefReadOnlyInfo;
    private final Input<Boolean> prefSaveBusinessCall;
    private final Input<Boolean> prefScreenPop;
    private final Input<Boolean> prefTrackAllCalls;
    private final Input<Integer> prefTrackAllCallsSpecificSim;
    private final Input<Boolean> prefTrackLocationOnActivity;
    private final Input<Boolean> prefUseBusinessWhatsapp;
    private final Input<String> sharedInboxPermission;
    private final Input<String> signature;
    private final Input<UpdateAccountMembershipAction> updateAction;
    private final Input<UserStatus> userAccountStatus;
    private final Input<String> whatsappApiAccess;

    public static final class Builder {
        private String id;
        private Input<UpdateAccountMembershipAction> updateAction = Input.absent();
        private Input<String> designation = Input.absent();
        private Input<AuthorizationLevel> authorizationLevel = Input.absent();
        private Input<String> signature = Input.absent();
        private Input<UserStatus> userAccountStatus = Input.absent();
        private Input<Boolean> mapRegisteredMobileNumberToAccount = Input.absent();
        private Input<Boolean> mapSecondaryMobileNumberToAccount = Input.absent();
        private Input<String> accountEmail = Input.absent();
        private Input<Boolean> isBillingMember = Input.absent();
        private Input<String> migrateToUserIdOnRemoval = Input.absent();
        private Input<Boolean> prefScreenPop = Input.absent();
        private Input<Boolean> prefSaveBusinessCall = Input.absent();
        private Input<Boolean> prefPostCallDisposition = Input.absent();
        private Input<Integer> prefDefaultSimToCall = Input.absent();
        private Input<Boolean> prefTrackLocationOnActivity = Input.absent();
        private Input<Boolean> prefUseBusinessWhatsapp = Input.absent();
        private Input<Boolean> prefTrackAllCalls = Input.absent();
        private Input<Integer> prefTrackAllCallsSpecificSim = Input.absent();
        private Input<String> lastViewedChatNotification = Input.absent();
        private Input<String> whatsappApiAccess = Input.absent();
        private Input<String> sharedInboxPermission = Input.absent();
        private Input<String> canInitiateNewConversation = Input.absent();
        private Input<String> canCreateWaCampaigns = Input.absent();
        private Input<List<NotificationPreferencesInput>> notificationPreferences = Input.absent();
        private Input<String> prefReadOnlyInfo = Input.absent();
        private Input<String> customMemberAttributes = Input.absent();

        public Builder accountEmail(String str) {
            this.accountEmail = Input.fromNullable(str);
            return this;
        }

        public Builder authorizationLevel(AuthorizationLevel authorizationLevel) {
            this.authorizationLevel = Input.fromNullable(authorizationLevel);
            return this;
        }

        public UpdateAccountMembershipInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateAccountMembershipInput(this.id, this.updateAction, this.designation, this.authorizationLevel, this.signature, this.userAccountStatus, this.mapRegisteredMobileNumberToAccount, this.mapSecondaryMobileNumberToAccount, this.accountEmail, this.isBillingMember, this.migrateToUserIdOnRemoval, this.prefScreenPop, this.prefSaveBusinessCall, this.prefPostCallDisposition, this.prefDefaultSimToCall, this.prefTrackLocationOnActivity, this.prefUseBusinessWhatsapp, this.prefTrackAllCalls, this.prefTrackAllCallsSpecificSim, this.lastViewedChatNotification, this.whatsappApiAccess, this.sharedInboxPermission, this.canInitiateNewConversation, this.canCreateWaCampaigns, this.notificationPreferences, this.prefReadOnlyInfo, this.customMemberAttributes);
        }

        public Builder canCreateWaCampaigns(String str) {
            this.canCreateWaCampaigns = Input.fromNullable(str);
            return this;
        }

        public Builder canInitiateNewConversation(String str) {
            this.canInitiateNewConversation = Input.fromNullable(str);
            return this;
        }

        public Builder customMemberAttributes(String str) {
            this.customMemberAttributes = Input.fromNullable(str);
            return this;
        }

        public Builder designation(String str) {
            this.designation = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder isBillingMember(Boolean bool) {
            this.isBillingMember = Input.fromNullable(bool);
            return this;
        }

        public Builder lastViewedChatNotification(String str) {
            this.lastViewedChatNotification = Input.fromNullable(str);
            return this;
        }

        public Builder mapRegisteredMobileNumberToAccount(Boolean bool) {
            this.mapRegisteredMobileNumberToAccount = Input.fromNullable(bool);
            return this;
        }

        public Builder mapSecondaryMobileNumberToAccount(Boolean bool) {
            this.mapSecondaryMobileNumberToAccount = Input.fromNullable(bool);
            return this;
        }

        public Builder migrateToUserIdOnRemoval(String str) {
            this.migrateToUserIdOnRemoval = Input.fromNullable(str);
            return this;
        }

        public Builder notificationPreferences(List<NotificationPreferencesInput> list) {
            this.notificationPreferences = Input.fromNullable(list);
            return this;
        }

        public Builder prefDefaultSimToCall(Integer num) {
            this.prefDefaultSimToCall = Input.fromNullable(num);
            return this;
        }

        public Builder prefPostCallDisposition(Boolean bool) {
            this.prefPostCallDisposition = Input.fromNullable(bool);
            return this;
        }

        public Builder prefReadOnlyInfo(String str) {
            this.prefReadOnlyInfo = Input.fromNullable(str);
            return this;
        }

        public Builder prefSaveBusinessCall(Boolean bool) {
            this.prefSaveBusinessCall = Input.fromNullable(bool);
            return this;
        }

        public Builder prefScreenPop(Boolean bool) {
            this.prefScreenPop = Input.fromNullable(bool);
            return this;
        }

        public Builder prefTrackAllCalls(Boolean bool) {
            this.prefTrackAllCalls = Input.fromNullable(bool);
            return this;
        }

        public Builder prefTrackAllCallsSpecificSim(Integer num) {
            this.prefTrackAllCallsSpecificSim = Input.fromNullable(num);
            return this;
        }

        public Builder prefTrackLocationOnActivity(Boolean bool) {
            this.prefTrackLocationOnActivity = Input.fromNullable(bool);
            return this;
        }

        public Builder prefUseBusinessWhatsapp(Boolean bool) {
            this.prefUseBusinessWhatsapp = Input.fromNullable(bool);
            return this;
        }

        public Builder sharedInboxPermission(String str) {
            this.sharedInboxPermission = Input.fromNullable(str);
            return this;
        }

        public Builder signature(String str) {
            this.signature = Input.fromNullable(str);
            return this;
        }

        public Builder updateAction(UpdateAccountMembershipAction updateAccountMembershipAction) {
            this.updateAction = Input.fromNullable(updateAccountMembershipAction);
            return this;
        }

        public Builder userAccountStatus(UserStatus userStatus) {
            this.userAccountStatus = Input.fromNullable(userStatus);
            return this;
        }

        public Builder whatsappApiAccess(String str) {
            this.whatsappApiAccess = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateAccountMembershipInput(String str, Input<UpdateAccountMembershipAction> input, Input<String> input2, Input<AuthorizationLevel> input3, Input<String> input4, Input<UserStatus> input5, Input<Boolean> input6, Input<Boolean> input7, Input<String> input8, Input<Boolean> input9, Input<String> input10, Input<Boolean> input11, Input<Boolean> input12, Input<Boolean> input13, Input<Integer> input14, Input<Boolean> input15, Input<Boolean> input16, Input<Boolean> input17, Input<Integer> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<List<NotificationPreferencesInput>> input24, Input<String> input25, Input<String> input26) {
        this.id = str;
        this.updateAction = input;
        this.designation = input2;
        this.authorizationLevel = input3;
        this.signature = input4;
        this.userAccountStatus = input5;
        this.mapRegisteredMobileNumberToAccount = input6;
        this.mapSecondaryMobileNumberToAccount = input7;
        this.accountEmail = input8;
        this.isBillingMember = input9;
        this.migrateToUserIdOnRemoval = input10;
        this.prefScreenPop = input11;
        this.prefSaveBusinessCall = input12;
        this.prefPostCallDisposition = input13;
        this.prefDefaultSimToCall = input14;
        this.prefTrackLocationOnActivity = input15;
        this.prefUseBusinessWhatsapp = input16;
        this.prefTrackAllCalls = input17;
        this.prefTrackAllCallsSpecificSim = input18;
        this.lastViewedChatNotification = input19;
        this.whatsappApiAccess = input20;
        this.sharedInboxPermission = input21;
        this.canInitiateNewConversation = input22;
        this.canCreateWaCampaigns = input23;
        this.notificationPreferences = input24;
        this.prefReadOnlyInfo = input25;
        this.customMemberAttributes = input26;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountEmail() {
        return this.accountEmail.value;
    }

    public AuthorizationLevel authorizationLevel() {
        return this.authorizationLevel.value;
    }

    public String canCreateWaCampaigns() {
        return this.canCreateWaCampaigns.value;
    }

    public String canInitiateNewConversation() {
        return this.canInitiateNewConversation.value;
    }

    public String customMemberAttributes() {
        return this.customMemberAttributes.value;
    }

    public String designation() {
        return this.designation.value;
    }

    public String id() {
        return this.id;
    }

    public Boolean isBillingMember() {
        return this.isBillingMember.value;
    }

    public String lastViewedChatNotification() {
        return this.lastViewedChatNotification.value;
    }

    public Boolean mapRegisteredMobileNumberToAccount() {
        return this.mapRegisteredMobileNumberToAccount.value;
    }

    public Boolean mapSecondaryMobileNumberToAccount() {
        return this.mapSecondaryMobileNumberToAccount.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateAccountMembershipInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateAccountMembershipInput.this.id);
                if (UpdateAccountMembershipInput.this.updateAction.defined) {
                    inputFieldWriter.writeString("updateAction", UpdateAccountMembershipInput.this.updateAction.value != 0 ? ((UpdateAccountMembershipAction) UpdateAccountMembershipInput.this.updateAction.value).name() : null);
                }
                if (UpdateAccountMembershipInput.this.designation.defined) {
                    inputFieldWriter.writeString("designation", (String) UpdateAccountMembershipInput.this.designation.value);
                }
                if (UpdateAccountMembershipInput.this.authorizationLevel.defined) {
                    inputFieldWriter.writeString("authorizationLevel", UpdateAccountMembershipInput.this.authorizationLevel.value != 0 ? ((AuthorizationLevel) UpdateAccountMembershipInput.this.authorizationLevel.value).name() : null);
                }
                if (UpdateAccountMembershipInput.this.signature.defined) {
                    inputFieldWriter.writeString("signature", (String) UpdateAccountMembershipInput.this.signature.value);
                }
                if (UpdateAccountMembershipInput.this.userAccountStatus.defined) {
                    inputFieldWriter.writeString("userAccountStatus", UpdateAccountMembershipInput.this.userAccountStatus.value != 0 ? ((UserStatus) UpdateAccountMembershipInput.this.userAccountStatus.value).name() : null);
                }
                if (UpdateAccountMembershipInput.this.mapRegisteredMobileNumberToAccount.defined) {
                    inputFieldWriter.writeBoolean("mapRegisteredMobileNumberToAccount", (Boolean) UpdateAccountMembershipInput.this.mapRegisteredMobileNumberToAccount.value);
                }
                if (UpdateAccountMembershipInput.this.mapSecondaryMobileNumberToAccount.defined) {
                    inputFieldWriter.writeBoolean("mapSecondaryMobileNumberToAccount", (Boolean) UpdateAccountMembershipInput.this.mapSecondaryMobileNumberToAccount.value);
                }
                if (UpdateAccountMembershipInput.this.accountEmail.defined) {
                    inputFieldWriter.writeString("accountEmail", (String) UpdateAccountMembershipInput.this.accountEmail.value);
                }
                if (UpdateAccountMembershipInput.this.isBillingMember.defined) {
                    inputFieldWriter.writeBoolean("isBillingMember", (Boolean) UpdateAccountMembershipInput.this.isBillingMember.value);
                }
                if (UpdateAccountMembershipInput.this.migrateToUserIdOnRemoval.defined) {
                    inputFieldWriter.writeString("migrateToUserIdOnRemoval", (String) UpdateAccountMembershipInput.this.migrateToUserIdOnRemoval.value);
                }
                if (UpdateAccountMembershipInput.this.prefScreenPop.defined) {
                    inputFieldWriter.writeBoolean("prefScreenPop", (Boolean) UpdateAccountMembershipInput.this.prefScreenPop.value);
                }
                if (UpdateAccountMembershipInput.this.prefSaveBusinessCall.defined) {
                    inputFieldWriter.writeBoolean("prefSaveBusinessCall", (Boolean) UpdateAccountMembershipInput.this.prefSaveBusinessCall.value);
                }
                if (UpdateAccountMembershipInput.this.prefPostCallDisposition.defined) {
                    inputFieldWriter.writeBoolean("prefPostCallDisposition", (Boolean) UpdateAccountMembershipInput.this.prefPostCallDisposition.value);
                }
                if (UpdateAccountMembershipInput.this.prefDefaultSimToCall.defined) {
                    inputFieldWriter.writeInt("prefDefaultSimToCall", (Integer) UpdateAccountMembershipInput.this.prefDefaultSimToCall.value);
                }
                if (UpdateAccountMembershipInput.this.prefTrackLocationOnActivity.defined) {
                    inputFieldWriter.writeBoolean("prefTrackLocationOnActivity", (Boolean) UpdateAccountMembershipInput.this.prefTrackLocationOnActivity.value);
                }
                if (UpdateAccountMembershipInput.this.prefUseBusinessWhatsapp.defined) {
                    inputFieldWriter.writeBoolean("prefUseBusinessWhatsapp", (Boolean) UpdateAccountMembershipInput.this.prefUseBusinessWhatsapp.value);
                }
                if (UpdateAccountMembershipInput.this.prefTrackAllCalls.defined) {
                    inputFieldWriter.writeBoolean("prefTrackAllCalls", (Boolean) UpdateAccountMembershipInput.this.prefTrackAllCalls.value);
                }
                if (UpdateAccountMembershipInput.this.prefTrackAllCallsSpecificSim.defined) {
                    inputFieldWriter.writeInt("prefTrackAllCallsSpecificSim", (Integer) UpdateAccountMembershipInput.this.prefTrackAllCallsSpecificSim.value);
                }
                if (UpdateAccountMembershipInput.this.lastViewedChatNotification.defined) {
                    inputFieldWriter.writeString("lastViewedChatNotification", (String) UpdateAccountMembershipInput.this.lastViewedChatNotification.value);
                }
                if (UpdateAccountMembershipInput.this.whatsappApiAccess.defined) {
                    inputFieldWriter.writeString("whatsappApiAccess", (String) UpdateAccountMembershipInput.this.whatsappApiAccess.value);
                }
                if (UpdateAccountMembershipInput.this.sharedInboxPermission.defined) {
                    inputFieldWriter.writeString("sharedInboxPermission", (String) UpdateAccountMembershipInput.this.sharedInboxPermission.value);
                }
                if (UpdateAccountMembershipInput.this.canInitiateNewConversation.defined) {
                    inputFieldWriter.writeString("canInitiateNewConversation", (String) UpdateAccountMembershipInput.this.canInitiateNewConversation.value);
                }
                if (UpdateAccountMembershipInput.this.canCreateWaCampaigns.defined) {
                    inputFieldWriter.writeString("canCreateWaCampaigns", (String) UpdateAccountMembershipInput.this.canCreateWaCampaigns.value);
                }
                if (UpdateAccountMembershipInput.this.notificationPreferences.defined) {
                    inputFieldWriter.writeList("notificationPreferences", UpdateAccountMembershipInput.this.notificationPreferences.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateAccountMembershipInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateAccountMembershipInput.this.notificationPreferences.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((NotificationPreferencesInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateAccountMembershipInput.this.prefReadOnlyInfo.defined) {
                    inputFieldWriter.writeString("prefReadOnlyInfo", (String) UpdateAccountMembershipInput.this.prefReadOnlyInfo.value);
                }
                if (UpdateAccountMembershipInput.this.customMemberAttributes.defined) {
                    inputFieldWriter.writeString("customMemberAttributes", (String) UpdateAccountMembershipInput.this.customMemberAttributes.value);
                }
            }
        };
    }

    public String migrateToUserIdOnRemoval() {
        return this.migrateToUserIdOnRemoval.value;
    }

    public List<NotificationPreferencesInput> notificationPreferences() {
        return this.notificationPreferences.value;
    }

    public Integer prefDefaultSimToCall() {
        return this.prefDefaultSimToCall.value;
    }

    public Boolean prefPostCallDisposition() {
        return this.prefPostCallDisposition.value;
    }

    public String prefReadOnlyInfo() {
        return this.prefReadOnlyInfo.value;
    }

    public Boolean prefSaveBusinessCall() {
        return this.prefSaveBusinessCall.value;
    }

    public Boolean prefScreenPop() {
        return this.prefScreenPop.value;
    }

    public Boolean prefTrackAllCalls() {
        return this.prefTrackAllCalls.value;
    }

    public Integer prefTrackAllCallsSpecificSim() {
        return this.prefTrackAllCallsSpecificSim.value;
    }

    public Boolean prefTrackLocationOnActivity() {
        return this.prefTrackLocationOnActivity.value;
    }

    public Boolean prefUseBusinessWhatsapp() {
        return this.prefUseBusinessWhatsapp.value;
    }

    public String sharedInboxPermission() {
        return this.sharedInboxPermission.value;
    }

    public String signature() {
        return this.signature.value;
    }

    public UpdateAccountMembershipAction updateAction() {
        return this.updateAction.value;
    }

    public UserStatus userAccountStatus() {
        return this.userAccountStatus.value;
    }

    public String whatsappApiAccess() {
        return this.whatsappApiAccess.value;
    }
}
