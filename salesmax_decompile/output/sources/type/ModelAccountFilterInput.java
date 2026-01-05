package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountFilterInput implements InputType {
    private final Input<ModelStringInput> accountName;
    private final Input<ModelAccountStatusInput> accountStatus;
    private final Input<ModelAccountTypeInput> accountType;
    private final Input<ModelBooleanInput> allowAddingSeat;
    private final Input<ModelStringInput> allowAddingSeatTill;
    private final Input<List<ModelAccountFilterInput>> and;
    private final Input<ModelStringInput> billingCurrency;
    private final Input<ModelStringInput> billingEmail;
    private final Input<ModelStringInput> businessLogoUrl;
    private final Input<ModelStringInput> chatWidgetConfig;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
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
    private final Input<ModelIDInput> id;
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
    private final Input<ModelAccountFilterInput> not;
    private final Input<ModelStringInput> onboardingStatus;
    private final Input<ModelStringInput> openAiApiKey;
    private final Input<List<ModelAccountFilterInput>> or;
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
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> website;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelStringInput> accountName = Input.absent();
        private Input<ModelAccountTypeInput> accountType = Input.absent();
        private Input<ModelStringInput> deviceKey = Input.absent();
        private Input<ModelStringInput> deviceKeyLastUpdated = Input.absent();
        private Input<ModelAccountStatusInput> accountStatus = Input.absent();
        private Input<ModelStringInput> businessLogoUrl = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
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
        private Input<ModelIDInput> updatedById = Input.absent();
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
        private Input<List<ModelAccountFilterInput>> and = Input.absent();
        private Input<List<ModelAccountFilterInput>> or = Input.absent();
        private Input<ModelAccountFilterInput> not = Input.absent();

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

        public Builder and(List<ModelAccountFilterInput> list) {
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

        public ModelAccountFilterInput build() {
            return new ModelAccountFilterInput(this.id, this.accountName, this.accountType, this.deviceKey, this.deviceKeyLastUpdated, this.accountStatus, this.businessLogoUrl, this.createdById, this.dateFormat, this.dateTimeViewStyle, this.defaultCurrency, this.denomination, this.industry, this.nameOfBusiness, this.productOrService, this.timeFormat, this.timeZone, this.plan, this.paidUpTo, this.seats, this.freeSeats, this.currentTotalUsers, this.currentActiveUsers, this.extraActiveUsers, this.pricePerSeat, this.allowAddingSeat, this.allowAddingSeatTill, this.seatReductionMarkedForNextCycle, this.billingCurrency, this.billingEmail, this.taxId, this.taxIdType, this.trialAccountEndDate, this.trialExtensionTimes, this.eligibleForExtension, this.paidForTillDate, this.updatedById, this.website, this.permissions, this.enableCustomCharts, this.createdAt, this.updatedAt, this.dealMode, this.openAiApiKey, this.salesmaxSalesContacts, this.salesmaxSupportContacts, this.chatWidgetConfig, this.onboardingStatus, this.integrationNeeded, this.matchingDealId, this.relatedAccountIds, this.lastChurnDate, this.lastChurnReason, this.possibleReactivationDate, this.locationPeriodicFrequency, this.lastPaymentDataId, this.lastPaymentDataCreatedAt, this.nextRenewalDateIfPaid, this.lastPaymentStatus, this.partPaymentAmountIfAny, this.and, this.or, this.not);
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

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelAccountFilterInput modelAccountFilterInput) {
            this.not = Input.fromNullable(modelAccountFilterInput);
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

        public Builder or(List<ModelAccountFilterInput> list) {
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

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder website(ModelStringInput modelStringInput) {
            this.website = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelAccountFilterInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelAccountTypeInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelAccountStatusInput> input6, Input<ModelStringInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelIntInput> input20, Input<ModelIntInput> input21, Input<ModelIntInput> input22, Input<ModelIntInput> input23, Input<ModelIntInput> input24, Input<ModelIntInput> input25, Input<ModelBooleanInput> input26, Input<ModelStringInput> input27, Input<ModelIntInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelIntInput> input34, Input<ModelBooleanInput> input35, Input<ModelStringInput> input36, Input<ModelIDInput> input37, Input<ModelStringInput> input38, Input<ModelStringInput> input39, Input<ModelBooleanInput> input40, Input<ModelStringInput> input41, Input<ModelStringInput> input42, Input<ModelStringInput> input43, Input<ModelStringInput> input44, Input<ModelStringInput> input45, Input<ModelStringInput> input46, Input<ModelStringInput> input47, Input<ModelStringInput> input48, Input<ModelStringInput> input49, Input<ModelIDInput> input50, Input<ModelIDInput> input51, Input<ModelStringInput> input52, Input<ModelStringInput> input53, Input<ModelStringInput> input54, Input<ModelFloatInput> input55, Input<ModelIDInput> input56, Input<ModelStringInput> input57, Input<ModelStringInput> input58, Input<ModelStringInput> input59, Input<ModelIntInput> input60, Input<List<ModelAccountFilterInput>> input61, Input<List<ModelAccountFilterInput>> input62, Input<ModelAccountFilterInput> input63) {
        this.id = input;
        this.accountName = input2;
        this.accountType = input3;
        this.deviceKey = input4;
        this.deviceKeyLastUpdated = input5;
        this.accountStatus = input6;
        this.businessLogoUrl = input7;
        this.createdById = input8;
        this.dateFormat = input9;
        this.dateTimeViewStyle = input10;
        this.defaultCurrency = input11;
        this.denomination = input12;
        this.industry = input13;
        this.nameOfBusiness = input14;
        this.productOrService = input15;
        this.timeFormat = input16;
        this.timeZone = input17;
        this.plan = input18;
        this.paidUpTo = input19;
        this.seats = input20;
        this.freeSeats = input21;
        this.currentTotalUsers = input22;
        this.currentActiveUsers = input23;
        this.extraActiveUsers = input24;
        this.pricePerSeat = input25;
        this.allowAddingSeat = input26;
        this.allowAddingSeatTill = input27;
        this.seatReductionMarkedForNextCycle = input28;
        this.billingCurrency = input29;
        this.billingEmail = input30;
        this.taxId = input31;
        this.taxIdType = input32;
        this.trialAccountEndDate = input33;
        this.trialExtensionTimes = input34;
        this.eligibleForExtension = input35;
        this.paidForTillDate = input36;
        this.updatedById = input37;
        this.website = input38;
        this.permissions = input39;
        this.enableCustomCharts = input40;
        this.createdAt = input41;
        this.updatedAt = input42;
        this.dealMode = input43;
        this.openAiApiKey = input44;
        this.salesmaxSalesContacts = input45;
        this.salesmaxSupportContacts = input46;
        this.chatWidgetConfig = input47;
        this.onboardingStatus = input48;
        this.integrationNeeded = input49;
        this.matchingDealId = input50;
        this.relatedAccountIds = input51;
        this.lastChurnDate = input52;
        this.lastChurnReason = input53;
        this.possibleReactivationDate = input54;
        this.locationPeriodicFrequency = input55;
        this.lastPaymentDataId = input56;
        this.lastPaymentDataCreatedAt = input57;
        this.nextRenewalDateIfPaid = input58;
        this.lastPaymentStatus = input59;
        this.partPaymentAmountIfAny = input60;
        this.and = input61;
        this.or = input62;
        this.not = input63;
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

    public List<ModelAccountFilterInput> and() {
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

    public ModelIDInput createdById() {
        return this.createdById.value;
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

    public ModelIDInput id() {
        return this.id.value;
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
        return new InputFieldMarshaller() { // from class: type.ModelAccountFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelAccountFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelAccountFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.accountName.defined) {
                    inputFieldWriter.writeObject("accountName", ModelAccountFilterInput.this.accountName.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.accountName.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.accountType.defined) {
                    inputFieldWriter.writeObject("accountType", ModelAccountFilterInput.this.accountType.value != 0 ? ((ModelAccountTypeInput) ModelAccountFilterInput.this.accountType.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.deviceKey.defined) {
                    inputFieldWriter.writeObject("deviceKey", ModelAccountFilterInput.this.deviceKey.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.deviceKey.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.deviceKeyLastUpdated.defined) {
                    inputFieldWriter.writeObject("deviceKeyLastUpdated", ModelAccountFilterInput.this.deviceKeyLastUpdated.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.deviceKeyLastUpdated.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.accountStatus.defined) {
                    inputFieldWriter.writeObject("accountStatus", ModelAccountFilterInput.this.accountStatus.value != 0 ? ((ModelAccountStatusInput) ModelAccountFilterInput.this.accountStatus.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.businessLogoUrl.defined) {
                    inputFieldWriter.writeObject("businessLogoUrl", ModelAccountFilterInput.this.businessLogoUrl.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.businessLogoUrl.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelAccountFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelAccountFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.dateFormat.defined) {
                    inputFieldWriter.writeObject("dateFormat", ModelAccountFilterInput.this.dateFormat.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.dateFormat.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.dateTimeViewStyle.defined) {
                    inputFieldWriter.writeObject("dateTimeViewStyle", ModelAccountFilterInput.this.dateTimeViewStyle.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.dateTimeViewStyle.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.defaultCurrency.defined) {
                    inputFieldWriter.writeObject("defaultCurrency", ModelAccountFilterInput.this.defaultCurrency.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.defaultCurrency.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.denomination.defined) {
                    inputFieldWriter.writeObject("denomination", ModelAccountFilterInput.this.denomination.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.denomination.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.industry.defined) {
                    inputFieldWriter.writeObject("industry", ModelAccountFilterInput.this.industry.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.industry.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.nameOfBusiness.defined) {
                    inputFieldWriter.writeObject("nameOfBusiness", ModelAccountFilterInput.this.nameOfBusiness.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.nameOfBusiness.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.productOrService.defined) {
                    inputFieldWriter.writeObject("productOrService", ModelAccountFilterInput.this.productOrService.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.productOrService.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.timeFormat.defined) {
                    inputFieldWriter.writeObject("timeFormat", ModelAccountFilterInput.this.timeFormat.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.timeFormat.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.timeZone.defined) {
                    inputFieldWriter.writeObject(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, ModelAccountFilterInput.this.timeZone.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.timeZone.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.plan.defined) {
                    inputFieldWriter.writeObject("plan", ModelAccountFilterInput.this.plan.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.plan.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.paidUpTo.defined) {
                    inputFieldWriter.writeObject("paidUpTo", ModelAccountFilterInput.this.paidUpTo.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.paidUpTo.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.seats.defined) {
                    inputFieldWriter.writeObject("seats", ModelAccountFilterInput.this.seats.value != 0 ? ((ModelIntInput) ModelAccountFilterInput.this.seats.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.freeSeats.defined) {
                    inputFieldWriter.writeObject("freeSeats", ModelAccountFilterInput.this.freeSeats.value != 0 ? ((ModelIntInput) ModelAccountFilterInput.this.freeSeats.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.currentTotalUsers.defined) {
                    inputFieldWriter.writeObject("currentTotalUsers", ModelAccountFilterInput.this.currentTotalUsers.value != 0 ? ((ModelIntInput) ModelAccountFilterInput.this.currentTotalUsers.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.currentActiveUsers.defined) {
                    inputFieldWriter.writeObject("currentActiveUsers", ModelAccountFilterInput.this.currentActiveUsers.value != 0 ? ((ModelIntInput) ModelAccountFilterInput.this.currentActiveUsers.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.extraActiveUsers.defined) {
                    inputFieldWriter.writeObject("extraActiveUsers", ModelAccountFilterInput.this.extraActiveUsers.value != 0 ? ((ModelIntInput) ModelAccountFilterInput.this.extraActiveUsers.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.pricePerSeat.defined) {
                    inputFieldWriter.writeObject("pricePerSeat", ModelAccountFilterInput.this.pricePerSeat.value != 0 ? ((ModelIntInput) ModelAccountFilterInput.this.pricePerSeat.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.allowAddingSeat.defined) {
                    inputFieldWriter.writeObject("allowAddingSeat", ModelAccountFilterInput.this.allowAddingSeat.value != 0 ? ((ModelBooleanInput) ModelAccountFilterInput.this.allowAddingSeat.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.allowAddingSeatTill.defined) {
                    inputFieldWriter.writeObject("allowAddingSeatTill", ModelAccountFilterInput.this.allowAddingSeatTill.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.allowAddingSeatTill.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.seatReductionMarkedForNextCycle.defined) {
                    inputFieldWriter.writeObject("seatReductionMarkedForNextCycle", ModelAccountFilterInput.this.seatReductionMarkedForNextCycle.value != 0 ? ((ModelIntInput) ModelAccountFilterInput.this.seatReductionMarkedForNextCycle.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.billingCurrency.defined) {
                    inputFieldWriter.writeObject("billingCurrency", ModelAccountFilterInput.this.billingCurrency.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.billingCurrency.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.billingEmail.defined) {
                    inputFieldWriter.writeObject("billingEmail", ModelAccountFilterInput.this.billingEmail.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.billingEmail.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.taxId.defined) {
                    inputFieldWriter.writeObject("taxId", ModelAccountFilterInput.this.taxId.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.taxId.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.taxIdType.defined) {
                    inputFieldWriter.writeObject("taxIdType", ModelAccountFilterInput.this.taxIdType.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.taxIdType.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.trialAccountEndDate.defined) {
                    inputFieldWriter.writeObject("trialAccountEndDate", ModelAccountFilterInput.this.trialAccountEndDate.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.trialAccountEndDate.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.trialExtensionTimes.defined) {
                    inputFieldWriter.writeObject("trialExtensionTimes", ModelAccountFilterInput.this.trialExtensionTimes.value != 0 ? ((ModelIntInput) ModelAccountFilterInput.this.trialExtensionTimes.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.eligibleForExtension.defined) {
                    inputFieldWriter.writeObject("eligibleForExtension", ModelAccountFilterInput.this.eligibleForExtension.value != 0 ? ((ModelBooleanInput) ModelAccountFilterInput.this.eligibleForExtension.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.paidForTillDate.defined) {
                    inputFieldWriter.writeObject("paidForTillDate", ModelAccountFilterInput.this.paidForTillDate.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.paidForTillDate.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelAccountFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelAccountFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.website.defined) {
                    inputFieldWriter.writeObject("website", ModelAccountFilterInput.this.website.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.website.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.permissions.defined) {
                    inputFieldWriter.writeObject("permissions", ModelAccountFilterInput.this.permissions.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.permissions.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.enableCustomCharts.defined) {
                    inputFieldWriter.writeObject("enableCustomCharts", ModelAccountFilterInput.this.enableCustomCharts.value != 0 ? ((ModelBooleanInput) ModelAccountFilterInput.this.enableCustomCharts.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.dealMode.defined) {
                    inputFieldWriter.writeObject("dealMode", ModelAccountFilterInput.this.dealMode.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.dealMode.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.openAiApiKey.defined) {
                    inputFieldWriter.writeObject("openAiApiKey", ModelAccountFilterInput.this.openAiApiKey.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.openAiApiKey.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.salesmaxSalesContacts.defined) {
                    inputFieldWriter.writeObject("salesmaxSalesContacts", ModelAccountFilterInput.this.salesmaxSalesContacts.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.salesmaxSalesContacts.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.salesmaxSupportContacts.defined) {
                    inputFieldWriter.writeObject("salesmaxSupportContacts", ModelAccountFilterInput.this.salesmaxSupportContacts.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.salesmaxSupportContacts.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.chatWidgetConfig.defined) {
                    inputFieldWriter.writeObject("chatWidgetConfig", ModelAccountFilterInput.this.chatWidgetConfig.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.chatWidgetConfig.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.onboardingStatus.defined) {
                    inputFieldWriter.writeObject("onboardingStatus", ModelAccountFilterInput.this.onboardingStatus.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.onboardingStatus.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.integrationNeeded.defined) {
                    inputFieldWriter.writeObject("integrationNeeded", ModelAccountFilterInput.this.integrationNeeded.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.integrationNeeded.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.matchingDealId.defined) {
                    inputFieldWriter.writeObject("matchingDealId", ModelAccountFilterInput.this.matchingDealId.value != 0 ? ((ModelIDInput) ModelAccountFilterInput.this.matchingDealId.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.relatedAccountIds.defined) {
                    inputFieldWriter.writeObject("relatedAccountIds", ModelAccountFilterInput.this.relatedAccountIds.value != 0 ? ((ModelIDInput) ModelAccountFilterInput.this.relatedAccountIds.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.lastChurnDate.defined) {
                    inputFieldWriter.writeObject("lastChurnDate", ModelAccountFilterInput.this.lastChurnDate.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.lastChurnDate.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.lastChurnReason.defined) {
                    inputFieldWriter.writeObject("lastChurnReason", ModelAccountFilterInput.this.lastChurnReason.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.lastChurnReason.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.possibleReactivationDate.defined) {
                    inputFieldWriter.writeObject("possibleReactivationDate", ModelAccountFilterInput.this.possibleReactivationDate.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.possibleReactivationDate.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.locationPeriodicFrequency.defined) {
                    inputFieldWriter.writeObject("locationPeriodicFrequency", ModelAccountFilterInput.this.locationPeriodicFrequency.value != 0 ? ((ModelFloatInput) ModelAccountFilterInput.this.locationPeriodicFrequency.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.lastPaymentDataId.defined) {
                    inputFieldWriter.writeObject("lastPaymentDataId", ModelAccountFilterInput.this.lastPaymentDataId.value != 0 ? ((ModelIDInput) ModelAccountFilterInput.this.lastPaymentDataId.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.lastPaymentDataCreatedAt.defined) {
                    inputFieldWriter.writeObject("lastPaymentDataCreatedAt", ModelAccountFilterInput.this.lastPaymentDataCreatedAt.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.lastPaymentDataCreatedAt.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.nextRenewalDateIfPaid.defined) {
                    inputFieldWriter.writeObject("nextRenewalDateIfPaid", ModelAccountFilterInput.this.nextRenewalDateIfPaid.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.nextRenewalDateIfPaid.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeObject("lastPaymentStatus", ModelAccountFilterInput.this.lastPaymentStatus.value != 0 ? ((ModelStringInput) ModelAccountFilterInput.this.lastPaymentStatus.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.partPaymentAmountIfAny.defined) {
                    inputFieldWriter.writeObject("partPaymentAmountIfAny", ModelAccountFilterInput.this.partPaymentAmountIfAny.value != 0 ? ((ModelIntInput) ModelAccountFilterInput.this.partPaymentAmountIfAny.value).marshaller() : null);
                }
                if (ModelAccountFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountFilterInput.this.not.value != 0 ? ((ModelAccountFilterInput) ModelAccountFilterInput.this.not.value).marshaller() : null);
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

    public ModelAccountFilterInput not() {
        return this.not.value;
    }

    public ModelStringInput onboardingStatus() {
        return this.onboardingStatus.value;
    }

    public ModelStringInput openAiApiKey() {
        return this.openAiApiKey.value;
    }

    public List<ModelAccountFilterInput> or() {
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

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelStringInput website() {
        return this.website.value;
    }
}
