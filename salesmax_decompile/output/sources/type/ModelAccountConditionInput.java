package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountConditionInput implements InputType {
    private final Input<ModelStringInput> accountName;
    private final Input<ModelAccountStatusInput> accountStatus;
    private final Input<ModelAccountTypeInput> accountType;
    private final Input<ModelBooleanInput> allowAddingSeat;
    private final Input<ModelStringInput> allowAddingSeatTill;
    private final Input<List<ModelAccountConditionInput>> and;
    private final Input<ModelStringInput> billingCurrency;
    private final Input<ModelStringInput> billingEmail;
    private final Input<ModelStringInput> businessLogoUrl;
    private final Input<ModelStringInput> chatWidgetConfig;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIntInput> currentActiveUsers;
    private final Input<ModelIntInput> currentTotalUsers;
    private final Input<ModelStringInput> dateFormat;
    private final Input<ModelStringInput> dateTimeViewStyle;
    private final Input<ModelStringInput> dealMode;
    private final Input<ModelStringInput> defaultCurrency;
    private final Input<ModelStringInput> denomination;
    private final Input<ModelStringInput> deviceKey;
    private final Input<ModelStringInput> deviceKeyLastUpdated;
    private final Input<ModelBooleanInput> eligibleForExtension;
    private final Input<ModelBooleanInput> enableCustomCharts;
    private final Input<ModelIntInput> extraActiveUsers;
    private final Input<ModelIntInput> freeSeats;
    private final Input<ModelStringInput> industry;
    private final Input<ModelStringInput> integrationNeeded;
    private final Input<ModelStringInput> lastChurnDate;
    private final Input<ModelStringInput> lastChurnReason;
    private final Input<ModelStringInput> lastPaymentDataCreatedAt;
    private final Input<ModelIDInput> lastPaymentDataId;
    private final Input<ModelStringInput> lastPaymentStatus;
    private final Input<ModelFloatInput> locationPeriodicFrequency;
    private final Input<ModelIDInput> matchingDealId;
    private final Input<ModelStringInput> nameOfBusiness;
    private final Input<ModelStringInput> nextRenewalDateIfPaid;
    private final Input<ModelAccountConditionInput> not;
    private final Input<ModelStringInput> onboardingStatus;
    private final Input<ModelStringInput> openAiApiKey;
    private final Input<List<ModelAccountConditionInput>> or;
    private final Input<ModelStringInput> paidForTillDate;
    private final Input<ModelStringInput> paidUpTo;
    private final Input<ModelIntInput> partPaymentAmountIfAny;
    private final Input<ModelStringInput> permissions;
    private final Input<ModelStringInput> plan;
    private final Input<ModelStringInput> possibleReactivationDate;
    private final Input<ModelIntInput> pricePerSeat;
    private final Input<ModelStringInput> productOrService;
    private final Input<ModelIDInput> relatedAccountIds;
    private final Input<ModelStringInput> salesmaxSalesContacts;
    private final Input<ModelStringInput> salesmaxSupportContacts;
    private final Input<ModelIntInput> seatReductionMarkedForNextCycle;
    private final Input<ModelIntInput> seats;
    private final Input<ModelStringInput> taxId;
    private final Input<ModelStringInput> taxIdType;
    private final Input<ModelStringInput> timeFormat;
    private final Input<ModelStringInput> timeZone;
    private final Input<ModelStringInput> trialAccountEndDate;
    private final Input<ModelIntInput> trialExtensionTimes;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> website;

    public static final class Builder {
        private Input<ModelStringInput> accountName = Input.absent();
        private Input<ModelAccountTypeInput> accountType = Input.absent();
        private Input<ModelStringInput> deviceKey = Input.absent();
        private Input<ModelStringInput> deviceKeyLastUpdated = Input.absent();
        private Input<ModelAccountStatusInput> accountStatus = Input.absent();
        private Input<ModelStringInput> businessLogoUrl = Input.absent();
        private Input<ModelStringInput> dateFormat = Input.absent();
        private Input<ModelStringInput> dateTimeViewStyle = Input.absent();
        private Input<ModelStringInput> defaultCurrency = Input.absent();
        private Input<ModelStringInput> denomination = Input.absent();
        private Input<ModelStringInput> industry = Input.absent();
        private Input<ModelStringInput> nameOfBusiness = Input.absent();
        private Input<ModelStringInput> productOrService = Input.absent();
        private Input<ModelStringInput> timeFormat = Input.absent();
        private Input<ModelStringInput> timeZone = Input.absent();
        private Input<ModelStringInput> plan = Input.absent();
        private Input<ModelStringInput> paidUpTo = Input.absent();
        private Input<ModelIntInput> seats = Input.absent();
        private Input<ModelIntInput> freeSeats = Input.absent();
        private Input<ModelIntInput> currentTotalUsers = Input.absent();
        private Input<ModelIntInput> currentActiveUsers = Input.absent();
        private Input<ModelIntInput> extraActiveUsers = Input.absent();
        private Input<ModelIntInput> pricePerSeat = Input.absent();
        private Input<ModelBooleanInput> allowAddingSeat = Input.absent();
        private Input<ModelStringInput> allowAddingSeatTill = Input.absent();
        private Input<ModelIntInput> seatReductionMarkedForNextCycle = Input.absent();
        private Input<ModelStringInput> billingCurrency = Input.absent();
        private Input<ModelStringInput> billingEmail = Input.absent();
        private Input<ModelStringInput> taxId = Input.absent();
        private Input<ModelStringInput> taxIdType = Input.absent();
        private Input<ModelStringInput> trialAccountEndDate = Input.absent();
        private Input<ModelIntInput> trialExtensionTimes = Input.absent();
        private Input<ModelBooleanInput> eligibleForExtension = Input.absent();
        private Input<ModelStringInput> paidForTillDate = Input.absent();
        private Input<ModelStringInput> website = Input.absent();
        private Input<ModelStringInput> permissions = Input.absent();
        private Input<ModelBooleanInput> enableCustomCharts = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelStringInput> dealMode = Input.absent();
        private Input<ModelStringInput> openAiApiKey = Input.absent();
        private Input<ModelStringInput> salesmaxSalesContacts = Input.absent();
        private Input<ModelStringInput> salesmaxSupportContacts = Input.absent();
        private Input<ModelStringInput> chatWidgetConfig = Input.absent();
        private Input<ModelStringInput> onboardingStatus = Input.absent();
        private Input<ModelStringInput> integrationNeeded = Input.absent();
        private Input<ModelIDInput> matchingDealId = Input.absent();
        private Input<ModelIDInput> relatedAccountIds = Input.absent();
        private Input<ModelStringInput> lastChurnDate = Input.absent();
        private Input<ModelStringInput> lastChurnReason = Input.absent();
        private Input<ModelStringInput> possibleReactivationDate = Input.absent();
        private Input<ModelFloatInput> locationPeriodicFrequency = Input.absent();
        private Input<ModelIDInput> lastPaymentDataId = Input.absent();
        private Input<ModelStringInput> lastPaymentDataCreatedAt = Input.absent();
        private Input<ModelStringInput> nextRenewalDateIfPaid = Input.absent();
        private Input<ModelStringInput> lastPaymentStatus = Input.absent();
        private Input<ModelIntInput> partPaymentAmountIfAny = Input.absent();
        private Input<List<ModelAccountConditionInput>> and = Input.absent();
        private Input<List<ModelAccountConditionInput>> or = Input.absent();
        private Input<ModelAccountConditionInput> not = Input.absent();

        public Builder accountName(ModelStringInput modelStringInput) {
            this.accountName = Input.fromNullable(modelStringInput);
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

        public Builder allowAddingSeat(ModelBooleanInput modelBooleanInput) {
            this.allowAddingSeat = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder allowAddingSeatTill(ModelStringInput modelStringInput) {
            this.allowAddingSeatTill = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelAccountConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder billingCurrency(ModelStringInput modelStringInput) {
            this.billingCurrency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder billingEmail(ModelStringInput modelStringInput) {
            this.billingEmail = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelAccountConditionInput build() {
            return new ModelAccountConditionInput(this.accountName, this.accountType, this.deviceKey, this.deviceKeyLastUpdated, this.accountStatus, this.businessLogoUrl, this.dateFormat, this.dateTimeViewStyle, this.defaultCurrency, this.denomination, this.industry, this.nameOfBusiness, this.productOrService, this.timeFormat, this.timeZone, this.plan, this.paidUpTo, this.seats, this.freeSeats, this.currentTotalUsers, this.currentActiveUsers, this.extraActiveUsers, this.pricePerSeat, this.allowAddingSeat, this.allowAddingSeatTill, this.seatReductionMarkedForNextCycle, this.billingCurrency, this.billingEmail, this.taxId, this.taxIdType, this.trialAccountEndDate, this.trialExtensionTimes, this.eligibleForExtension, this.paidForTillDate, this.website, this.permissions, this.enableCustomCharts, this.createdAt, this.updatedAt, this.dealMode, this.openAiApiKey, this.salesmaxSalesContacts, this.salesmaxSupportContacts, this.chatWidgetConfig, this.onboardingStatus, this.integrationNeeded, this.matchingDealId, this.relatedAccountIds, this.lastChurnDate, this.lastChurnReason, this.possibleReactivationDate, this.locationPeriodicFrequency, this.lastPaymentDataId, this.lastPaymentDataCreatedAt, this.nextRenewalDateIfPaid, this.lastPaymentStatus, this.partPaymentAmountIfAny, this.and, this.or, this.not);
        }

        public Builder businessLogoUrl(ModelStringInput modelStringInput) {
            this.businessLogoUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder chatWidgetConfig(ModelStringInput modelStringInput) {
            this.chatWidgetConfig = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder currentActiveUsers(ModelIntInput modelIntInput) {
            this.currentActiveUsers = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder currentTotalUsers(ModelIntInput modelIntInput) {
            this.currentTotalUsers = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder dateFormat(ModelStringInput modelStringInput) {
            this.dateFormat = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dateTimeViewStyle(ModelStringInput modelStringInput) {
            this.dateTimeViewStyle = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dealMode(ModelStringInput modelStringInput) {
            this.dealMode = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder defaultCurrency(ModelStringInput modelStringInput) {
            this.defaultCurrency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder denomination(ModelStringInput modelStringInput) {
            this.denomination = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder deviceKey(ModelStringInput modelStringInput) {
            this.deviceKey = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder deviceKeyLastUpdated(ModelStringInput modelStringInput) {
            this.deviceKeyLastUpdated = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder eligibleForExtension(ModelBooleanInput modelBooleanInput) {
            this.eligibleForExtension = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder enableCustomCharts(ModelBooleanInput modelBooleanInput) {
            this.enableCustomCharts = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder extraActiveUsers(ModelIntInput modelIntInput) {
            this.extraActiveUsers = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder freeSeats(ModelIntInput modelIntInput) {
            this.freeSeats = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder industry(ModelStringInput modelStringInput) {
            this.industry = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder integrationNeeded(ModelStringInput modelStringInput) {
            this.integrationNeeded = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastChurnDate(ModelStringInput modelStringInput) {
            this.lastChurnDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastChurnReason(ModelStringInput modelStringInput) {
            this.lastChurnReason = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastPaymentDataCreatedAt(ModelStringInput modelStringInput) {
            this.lastPaymentDataCreatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastPaymentDataId(ModelIDInput modelIDInput) {
            this.lastPaymentDataId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastPaymentStatus(ModelStringInput modelStringInput) {
            this.lastPaymentStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder locationPeriodicFrequency(ModelFloatInput modelFloatInput) {
            this.locationPeriodicFrequency = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder matchingDealId(ModelIDInput modelIDInput) {
            this.matchingDealId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder nameOfBusiness(ModelStringInput modelStringInput) {
            this.nameOfBusiness = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder nextRenewalDateIfPaid(ModelStringInput modelStringInput) {
            this.nextRenewalDateIfPaid = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelAccountConditionInput modelAccountConditionInput) {
            this.not = Input.fromNullable(modelAccountConditionInput);
            return this;
        }

        public Builder onboardingStatus(ModelStringInput modelStringInput) {
            this.onboardingStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder openAiApiKey(ModelStringInput modelStringInput) {
            this.openAiApiKey = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelAccountConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder paidForTillDate(ModelStringInput modelStringInput) {
            this.paidForTillDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder paidUpTo(ModelStringInput modelStringInput) {
            this.paidUpTo = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder partPaymentAmountIfAny(ModelIntInput modelIntInput) {
            this.partPaymentAmountIfAny = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder permissions(ModelStringInput modelStringInput) {
            this.permissions = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder plan(ModelStringInput modelStringInput) {
            this.plan = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder possibleReactivationDate(ModelStringInput modelStringInput) {
            this.possibleReactivationDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder pricePerSeat(ModelIntInput modelIntInput) {
            this.pricePerSeat = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder productOrService(ModelStringInput modelStringInput) {
            this.productOrService = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder relatedAccountIds(ModelIDInput modelIDInput) {
            this.relatedAccountIds = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder salesmaxSalesContacts(ModelStringInput modelStringInput) {
            this.salesmaxSalesContacts = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder salesmaxSupportContacts(ModelStringInput modelStringInput) {
            this.salesmaxSupportContacts = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder seatReductionMarkedForNextCycle(ModelIntInput modelIntInput) {
            this.seatReductionMarkedForNextCycle = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder seats(ModelIntInput modelIntInput) {
            this.seats = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder taxId(ModelStringInput modelStringInput) {
            this.taxId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taxIdType(ModelStringInput modelStringInput) {
            this.taxIdType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder timeFormat(ModelStringInput modelStringInput) {
            this.timeFormat = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder timeZone(ModelStringInput modelStringInput) {
            this.timeZone = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder trialAccountEndDate(ModelStringInput modelStringInput) {
            this.trialAccountEndDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder trialExtensionTimes(ModelIntInput modelIntInput) {
            this.trialExtensionTimes = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder website(ModelStringInput modelStringInput) {
            this.website = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelAccountConditionInput(Input<ModelStringInput> input, Input<ModelAccountTypeInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelAccountStatusInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelIntInput> input18, Input<ModelIntInput> input19, Input<ModelIntInput> input20, Input<ModelIntInput> input21, Input<ModelIntInput> input22, Input<ModelIntInput> input23, Input<ModelBooleanInput> input24, Input<ModelStringInput> input25, Input<ModelIntInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<ModelIntInput> input32, Input<ModelBooleanInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelBooleanInput> input37, Input<ModelStringInput> input38, Input<ModelStringInput> input39, Input<ModelStringInput> input40, Input<ModelStringInput> input41, Input<ModelStringInput> input42, Input<ModelStringInput> input43, Input<ModelStringInput> input44, Input<ModelStringInput> input45, Input<ModelStringInput> input46, Input<ModelIDInput> input47, Input<ModelIDInput> input48, Input<ModelStringInput> input49, Input<ModelStringInput> input50, Input<ModelStringInput> input51, Input<ModelFloatInput> input52, Input<ModelIDInput> input53, Input<ModelStringInput> input54, Input<ModelStringInput> input55, Input<ModelStringInput> input56, Input<ModelIntInput> input57, Input<List<ModelAccountConditionInput>> input58, Input<List<ModelAccountConditionInput>> input59, Input<ModelAccountConditionInput> input60) {
        this.accountName = input;
        this.accountType = input2;
        this.deviceKey = input3;
        this.deviceKeyLastUpdated = input4;
        this.accountStatus = input5;
        this.businessLogoUrl = input6;
        this.dateFormat = input7;
        this.dateTimeViewStyle = input8;
        this.defaultCurrency = input9;
        this.denomination = input10;
        this.industry = input11;
        this.nameOfBusiness = input12;
        this.productOrService = input13;
        this.timeFormat = input14;
        this.timeZone = input15;
        this.plan = input16;
        this.paidUpTo = input17;
        this.seats = input18;
        this.freeSeats = input19;
        this.currentTotalUsers = input20;
        this.currentActiveUsers = input21;
        this.extraActiveUsers = input22;
        this.pricePerSeat = input23;
        this.allowAddingSeat = input24;
        this.allowAddingSeatTill = input25;
        this.seatReductionMarkedForNextCycle = input26;
        this.billingCurrency = input27;
        this.billingEmail = input28;
        this.taxId = input29;
        this.taxIdType = input30;
        this.trialAccountEndDate = input31;
        this.trialExtensionTimes = input32;
        this.eligibleForExtension = input33;
        this.paidForTillDate = input34;
        this.website = input35;
        this.permissions = input36;
        this.enableCustomCharts = input37;
        this.createdAt = input38;
        this.updatedAt = input39;
        this.dealMode = input40;
        this.openAiApiKey = input41;
        this.salesmaxSalesContacts = input42;
        this.salesmaxSupportContacts = input43;
        this.chatWidgetConfig = input44;
        this.onboardingStatus = input45;
        this.integrationNeeded = input46;
        this.matchingDealId = input47;
        this.relatedAccountIds = input48;
        this.lastChurnDate = input49;
        this.lastChurnReason = input50;
        this.possibleReactivationDate = input51;
        this.locationPeriodicFrequency = input52;
        this.lastPaymentDataId = input53;
        this.lastPaymentDataCreatedAt = input54;
        this.nextRenewalDateIfPaid = input55;
        this.lastPaymentStatus = input56;
        this.partPaymentAmountIfAny = input57;
        this.and = input58;
        this.or = input59;
        this.not = input60;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelStringInput accountName() {
        return this.accountName.value;
    }

    public ModelAccountStatusInput accountStatus() {
        return this.accountStatus.value;
    }

    public ModelAccountTypeInput accountType() {
        return this.accountType.value;
    }

    public ModelBooleanInput allowAddingSeat() {
        return this.allowAddingSeat.value;
    }

    public ModelStringInput allowAddingSeatTill() {
        return this.allowAddingSeatTill.value;
    }

    public List<ModelAccountConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput billingCurrency() {
        return this.billingCurrency.value;
    }

    public ModelStringInput billingEmail() {
        return this.billingEmail.value;
    }

    public ModelStringInput businessLogoUrl() {
        return this.businessLogoUrl.value;
    }

    public ModelStringInput chatWidgetConfig() {
        return this.chatWidgetConfig.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIntInput currentActiveUsers() {
        return this.currentActiveUsers.value;
    }

    public ModelIntInput currentTotalUsers() {
        return this.currentTotalUsers.value;
    }

    public ModelStringInput dateFormat() {
        return this.dateFormat.value;
    }

    public ModelStringInput dateTimeViewStyle() {
        return this.dateTimeViewStyle.value;
    }

    public ModelStringInput dealMode() {
        return this.dealMode.value;
    }

    public ModelStringInput defaultCurrency() {
        return this.defaultCurrency.value;
    }

    public ModelStringInput denomination() {
        return this.denomination.value;
    }

    public ModelStringInput deviceKey() {
        return this.deviceKey.value;
    }

    public ModelStringInput deviceKeyLastUpdated() {
        return this.deviceKeyLastUpdated.value;
    }

    public ModelBooleanInput eligibleForExtension() {
        return this.eligibleForExtension.value;
    }

    public ModelBooleanInput enableCustomCharts() {
        return this.enableCustomCharts.value;
    }

    public ModelIntInput extraActiveUsers() {
        return this.extraActiveUsers.value;
    }

    public ModelIntInput freeSeats() {
        return this.freeSeats.value;
    }

    public ModelStringInput industry() {
        return this.industry.value;
    }

    public ModelStringInput integrationNeeded() {
        return this.integrationNeeded.value;
    }

    public ModelStringInput lastChurnDate() {
        return this.lastChurnDate.value;
    }

    public ModelStringInput lastChurnReason() {
        return this.lastChurnReason.value;
    }

    public ModelStringInput lastPaymentDataCreatedAt() {
        return this.lastPaymentDataCreatedAt.value;
    }

    public ModelIDInput lastPaymentDataId() {
        return this.lastPaymentDataId.value;
    }

    public ModelStringInput lastPaymentStatus() {
        return this.lastPaymentStatus.value;
    }

    public ModelFloatInput locationPeriodicFrequency() {
        return this.locationPeriodicFrequency.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountConditionInput.this.accountName.defined) {
                    inputFieldWriter.writeObject("accountName", ModelAccountConditionInput.this.accountName.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.accountName.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.accountType.defined) {
                    inputFieldWriter.writeObject("accountType", ModelAccountConditionInput.this.accountType.value != 0 ? ((ModelAccountTypeInput) ModelAccountConditionInput.this.accountType.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.deviceKey.defined) {
                    inputFieldWriter.writeObject("deviceKey", ModelAccountConditionInput.this.deviceKey.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.deviceKey.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.deviceKeyLastUpdated.defined) {
                    inputFieldWriter.writeObject("deviceKeyLastUpdated", ModelAccountConditionInput.this.deviceKeyLastUpdated.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.deviceKeyLastUpdated.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.accountStatus.defined) {
                    inputFieldWriter.writeObject("accountStatus", ModelAccountConditionInput.this.accountStatus.value != 0 ? ((ModelAccountStatusInput) ModelAccountConditionInput.this.accountStatus.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.businessLogoUrl.defined) {
                    inputFieldWriter.writeObject("businessLogoUrl", ModelAccountConditionInput.this.businessLogoUrl.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.businessLogoUrl.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.dateFormat.defined) {
                    inputFieldWriter.writeObject("dateFormat", ModelAccountConditionInput.this.dateFormat.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.dateFormat.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.dateTimeViewStyle.defined) {
                    inputFieldWriter.writeObject("dateTimeViewStyle", ModelAccountConditionInput.this.dateTimeViewStyle.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.dateTimeViewStyle.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.defaultCurrency.defined) {
                    inputFieldWriter.writeObject("defaultCurrency", ModelAccountConditionInput.this.defaultCurrency.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.defaultCurrency.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.denomination.defined) {
                    inputFieldWriter.writeObject("denomination", ModelAccountConditionInput.this.denomination.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.denomination.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.industry.defined) {
                    inputFieldWriter.writeObject("industry", ModelAccountConditionInput.this.industry.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.industry.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.nameOfBusiness.defined) {
                    inputFieldWriter.writeObject("nameOfBusiness", ModelAccountConditionInput.this.nameOfBusiness.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.nameOfBusiness.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.productOrService.defined) {
                    inputFieldWriter.writeObject("productOrService", ModelAccountConditionInput.this.productOrService.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.productOrService.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.timeFormat.defined) {
                    inputFieldWriter.writeObject("timeFormat", ModelAccountConditionInput.this.timeFormat.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.timeFormat.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.timeZone.defined) {
                    inputFieldWriter.writeObject(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, ModelAccountConditionInput.this.timeZone.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.timeZone.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.plan.defined) {
                    inputFieldWriter.writeObject("plan", ModelAccountConditionInput.this.plan.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.plan.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.paidUpTo.defined) {
                    inputFieldWriter.writeObject("paidUpTo", ModelAccountConditionInput.this.paidUpTo.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.paidUpTo.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.seats.defined) {
                    inputFieldWriter.writeObject("seats", ModelAccountConditionInput.this.seats.value != 0 ? ((ModelIntInput) ModelAccountConditionInput.this.seats.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.freeSeats.defined) {
                    inputFieldWriter.writeObject("freeSeats", ModelAccountConditionInput.this.freeSeats.value != 0 ? ((ModelIntInput) ModelAccountConditionInput.this.freeSeats.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.currentTotalUsers.defined) {
                    inputFieldWriter.writeObject("currentTotalUsers", ModelAccountConditionInput.this.currentTotalUsers.value != 0 ? ((ModelIntInput) ModelAccountConditionInput.this.currentTotalUsers.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.currentActiveUsers.defined) {
                    inputFieldWriter.writeObject("currentActiveUsers", ModelAccountConditionInput.this.currentActiveUsers.value != 0 ? ((ModelIntInput) ModelAccountConditionInput.this.currentActiveUsers.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.extraActiveUsers.defined) {
                    inputFieldWriter.writeObject("extraActiveUsers", ModelAccountConditionInput.this.extraActiveUsers.value != 0 ? ((ModelIntInput) ModelAccountConditionInput.this.extraActiveUsers.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.pricePerSeat.defined) {
                    inputFieldWriter.writeObject("pricePerSeat", ModelAccountConditionInput.this.pricePerSeat.value != 0 ? ((ModelIntInput) ModelAccountConditionInput.this.pricePerSeat.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.allowAddingSeat.defined) {
                    inputFieldWriter.writeObject("allowAddingSeat", ModelAccountConditionInput.this.allowAddingSeat.value != 0 ? ((ModelBooleanInput) ModelAccountConditionInput.this.allowAddingSeat.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.allowAddingSeatTill.defined) {
                    inputFieldWriter.writeObject("allowAddingSeatTill", ModelAccountConditionInput.this.allowAddingSeatTill.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.allowAddingSeatTill.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.seatReductionMarkedForNextCycle.defined) {
                    inputFieldWriter.writeObject("seatReductionMarkedForNextCycle", ModelAccountConditionInput.this.seatReductionMarkedForNextCycle.value != 0 ? ((ModelIntInput) ModelAccountConditionInput.this.seatReductionMarkedForNextCycle.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.billingCurrency.defined) {
                    inputFieldWriter.writeObject("billingCurrency", ModelAccountConditionInput.this.billingCurrency.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.billingCurrency.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.billingEmail.defined) {
                    inputFieldWriter.writeObject("billingEmail", ModelAccountConditionInput.this.billingEmail.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.billingEmail.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.taxId.defined) {
                    inputFieldWriter.writeObject("taxId", ModelAccountConditionInput.this.taxId.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.taxId.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.taxIdType.defined) {
                    inputFieldWriter.writeObject("taxIdType", ModelAccountConditionInput.this.taxIdType.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.taxIdType.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.trialAccountEndDate.defined) {
                    inputFieldWriter.writeObject("trialAccountEndDate", ModelAccountConditionInput.this.trialAccountEndDate.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.trialAccountEndDate.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.trialExtensionTimes.defined) {
                    inputFieldWriter.writeObject("trialExtensionTimes", ModelAccountConditionInput.this.trialExtensionTimes.value != 0 ? ((ModelIntInput) ModelAccountConditionInput.this.trialExtensionTimes.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.eligibleForExtension.defined) {
                    inputFieldWriter.writeObject("eligibleForExtension", ModelAccountConditionInput.this.eligibleForExtension.value != 0 ? ((ModelBooleanInput) ModelAccountConditionInput.this.eligibleForExtension.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.paidForTillDate.defined) {
                    inputFieldWriter.writeObject("paidForTillDate", ModelAccountConditionInput.this.paidForTillDate.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.paidForTillDate.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.website.defined) {
                    inputFieldWriter.writeObject("website", ModelAccountConditionInput.this.website.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.website.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.permissions.defined) {
                    inputFieldWriter.writeObject("permissions", ModelAccountConditionInput.this.permissions.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.permissions.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.enableCustomCharts.defined) {
                    inputFieldWriter.writeObject("enableCustomCharts", ModelAccountConditionInput.this.enableCustomCharts.value != 0 ? ((ModelBooleanInput) ModelAccountConditionInput.this.enableCustomCharts.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.dealMode.defined) {
                    inputFieldWriter.writeObject("dealMode", ModelAccountConditionInput.this.dealMode.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.dealMode.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.openAiApiKey.defined) {
                    inputFieldWriter.writeObject("openAiApiKey", ModelAccountConditionInput.this.openAiApiKey.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.openAiApiKey.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.salesmaxSalesContacts.defined) {
                    inputFieldWriter.writeObject("salesmaxSalesContacts", ModelAccountConditionInput.this.salesmaxSalesContacts.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.salesmaxSalesContacts.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.salesmaxSupportContacts.defined) {
                    inputFieldWriter.writeObject("salesmaxSupportContacts", ModelAccountConditionInput.this.salesmaxSupportContacts.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.salesmaxSupportContacts.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.chatWidgetConfig.defined) {
                    inputFieldWriter.writeObject("chatWidgetConfig", ModelAccountConditionInput.this.chatWidgetConfig.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.chatWidgetConfig.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.onboardingStatus.defined) {
                    inputFieldWriter.writeObject("onboardingStatus", ModelAccountConditionInput.this.onboardingStatus.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.onboardingStatus.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.integrationNeeded.defined) {
                    inputFieldWriter.writeObject("integrationNeeded", ModelAccountConditionInput.this.integrationNeeded.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.integrationNeeded.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.matchingDealId.defined) {
                    inputFieldWriter.writeObject("matchingDealId", ModelAccountConditionInput.this.matchingDealId.value != 0 ? ((ModelIDInput) ModelAccountConditionInput.this.matchingDealId.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.relatedAccountIds.defined) {
                    inputFieldWriter.writeObject("relatedAccountIds", ModelAccountConditionInput.this.relatedAccountIds.value != 0 ? ((ModelIDInput) ModelAccountConditionInput.this.relatedAccountIds.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.lastChurnDate.defined) {
                    inputFieldWriter.writeObject("lastChurnDate", ModelAccountConditionInput.this.lastChurnDate.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.lastChurnDate.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.lastChurnReason.defined) {
                    inputFieldWriter.writeObject("lastChurnReason", ModelAccountConditionInput.this.lastChurnReason.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.lastChurnReason.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.possibleReactivationDate.defined) {
                    inputFieldWriter.writeObject("possibleReactivationDate", ModelAccountConditionInput.this.possibleReactivationDate.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.possibleReactivationDate.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.locationPeriodicFrequency.defined) {
                    inputFieldWriter.writeObject("locationPeriodicFrequency", ModelAccountConditionInput.this.locationPeriodicFrequency.value != 0 ? ((ModelFloatInput) ModelAccountConditionInput.this.locationPeriodicFrequency.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.lastPaymentDataId.defined) {
                    inputFieldWriter.writeObject("lastPaymentDataId", ModelAccountConditionInput.this.lastPaymentDataId.value != 0 ? ((ModelIDInput) ModelAccountConditionInput.this.lastPaymentDataId.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.lastPaymentDataCreatedAt.defined) {
                    inputFieldWriter.writeObject("lastPaymentDataCreatedAt", ModelAccountConditionInput.this.lastPaymentDataCreatedAt.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.lastPaymentDataCreatedAt.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.nextRenewalDateIfPaid.defined) {
                    inputFieldWriter.writeObject("nextRenewalDateIfPaid", ModelAccountConditionInput.this.nextRenewalDateIfPaid.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.nextRenewalDateIfPaid.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeObject("lastPaymentStatus", ModelAccountConditionInput.this.lastPaymentStatus.value != 0 ? ((ModelStringInput) ModelAccountConditionInput.this.lastPaymentStatus.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.partPaymentAmountIfAny.defined) {
                    inputFieldWriter.writeObject("partPaymentAmountIfAny", ModelAccountConditionInput.this.partPaymentAmountIfAny.value != 0 ? ((ModelIntInput) ModelAccountConditionInput.this.partPaymentAmountIfAny.value).marshaller() : null);
                }
                if (ModelAccountConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountConditionInput.this.not.value != 0 ? ((ModelAccountConditionInput) ModelAccountConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput matchingDealId() {
        return this.matchingDealId.value;
    }

    public ModelStringInput nameOfBusiness() {
        return this.nameOfBusiness.value;
    }

    public ModelStringInput nextRenewalDateIfPaid() {
        return this.nextRenewalDateIfPaid.value;
    }

    public ModelAccountConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput onboardingStatus() {
        return this.onboardingStatus.value;
    }

    public ModelStringInput openAiApiKey() {
        return this.openAiApiKey.value;
    }

    public List<ModelAccountConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput paidForTillDate() {
        return this.paidForTillDate.value;
    }

    public ModelStringInput paidUpTo() {
        return this.paidUpTo.value;
    }

    public ModelIntInput partPaymentAmountIfAny() {
        return this.partPaymentAmountIfAny.value;
    }

    public ModelStringInput permissions() {
        return this.permissions.value;
    }

    public ModelStringInput plan() {
        return this.plan.value;
    }

    public ModelStringInput possibleReactivationDate() {
        return this.possibleReactivationDate.value;
    }

    public ModelIntInput pricePerSeat() {
        return this.pricePerSeat.value;
    }

    public ModelStringInput productOrService() {
        return this.productOrService.value;
    }

    public ModelIDInput relatedAccountIds() {
        return this.relatedAccountIds.value;
    }

    public ModelStringInput salesmaxSalesContacts() {
        return this.salesmaxSalesContacts.value;
    }

    public ModelStringInput salesmaxSupportContacts() {
        return this.salesmaxSupportContacts.value;
    }

    public ModelIntInput seatReductionMarkedForNextCycle() {
        return this.seatReductionMarkedForNextCycle.value;
    }

    public ModelIntInput seats() {
        return this.seats.value;
    }

    public ModelStringInput taxId() {
        return this.taxId.value;
    }

    public ModelStringInput taxIdType() {
        return this.taxIdType.value;
    }

    public ModelStringInput timeFormat() {
        return this.timeFormat.value;
    }

    public ModelStringInput timeZone() {
        return this.timeZone.value;
    }

    public ModelStringInput trialAccountEndDate() {
        return this.trialAccountEndDate.value;
    }

    public ModelIntInput trialExtensionTimes() {
        return this.trialExtensionTimes.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelStringInput website() {
        return this.website.value;
    }
}
