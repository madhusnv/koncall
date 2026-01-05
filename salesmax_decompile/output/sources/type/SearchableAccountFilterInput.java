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
public final class SearchableAccountFilterInput implements InputType {
    private final Input<SearchableStringFilterInput> accountName;
    private final Input<SearchableIntFilterInput> accountStats__callSevenDays;
    private final Input<SearchableIntFilterInput> accountStats__paymentSevenDays;
    private final Input<SearchableIntFilterInput> accountStats__taskSevenDays;
    private final Input<SearchableIntFilterInput> accountStats__wabaBroadcastSevenDays;
    private final Input<SearchableIntFilterInput> accountStats__wabaConversationSevenDays;
    private final Input<SearchableStringFilterInput> accountStatus;
    private final Input<SearchableStringFilterInput> accountType;
    private final Input<SearchableBooleanFilterInput> allowAddingSeat;
    private final Input<SearchableStringFilterInput> allowAddingSeatTill;
    private final Input<List<SearchableAccountFilterInput>> and;
    private final Input<SearchableStringFilterInput> billingCurrency;
    private final Input<SearchableStringFilterInput> billingEmail;
    private final Input<SearchableStringFilterInput> businessLogoUrl;
    private final Input<SearchableStringFilterInput> chatWidgetConfig;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdById;
    private final Input<SearchableIntFilterInput> currentActiveUsers;
    private final Input<SearchableIntFilterInput> currentTotalUsers;
    private final Input<SearchableStringFilterInput> dateFormat;
    private final Input<SearchableStringFilterInput> dealMode;
    private final Input<SearchableStringFilterInput> defaultCurrency;
    private final Input<SearchableStringFilterInput> denomination;
    private final Input<SearchableBooleanFilterInput> eligibleForExtension;
    private final Input<SearchableBooleanFilterInput> enableCustomCharts;
    private final Input<SearchableIntFilterInput> extraActiveUsers;
    private final Input<SearchableIntFilterInput> freeSeats;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> industry;
    private final Input<SearchableStringFilterInput> integrationNeeded;
    private final Input<SearchableStringFilterInput> nameOfBusiness;
    private final Input<SearchableAccountFilterInput> not;
    private final Input<SearchableStringFilterInput> onboardingStatus;
    private final Input<SearchableStringFilterInput> openAiApiKey;
    private final Input<List<SearchableAccountFilterInput>> or;
    private final Input<SearchableStringFilterInput> paidForTillDate;
    private final Input<SearchableStringFilterInput> paidUpTo;
    private final Input<SearchableStringFilterInput> permissions;
    private final Input<SearchableStringFilterInput> plan;
    private final Input<SearchableIntFilterInput> pricePerSeat;
    private final Input<SearchableStringFilterInput> productOrService;
    private final Input<SearchableStringFilterInput> salesmaxSalesContacts;
    private final Input<SearchableStringFilterInput> salesmaxSupportContacts;
    private final Input<SearchableIntFilterInput> seatReductionMarkedForNextCycle;
    private final Input<SearchableIntFilterInput> seats;
    private final Input<SearchableStringFilterInput> taxId;
    private final Input<SearchableStringFilterInput> taxIdType;
    private final Input<SearchableStringFilterInput> timeFormat;
    private final Input<SearchableStringFilterInput> timeZone;
    private final Input<SearchableStringFilterInput> trialAccountEndDate;
    private final Input<SearchableIntFilterInput> trialExtensionTimes;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedById;
    private final Input<SearchableStringFilterInput> website;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableStringFilterInput> accountName = Input.absent();
        private Input<SearchableStringFilterInput> accountType = Input.absent();
        private Input<SearchableStringFilterInput> accountStatus = Input.absent();
        private Input<SearchableStringFilterInput> businessLogoUrl = Input.absent();
        private Input<SearchableIDFilterInput> createdById = Input.absent();
        private Input<SearchableStringFilterInput> dateFormat = Input.absent();
        private Input<SearchableStringFilterInput> defaultCurrency = Input.absent();
        private Input<SearchableStringFilterInput> denomination = Input.absent();
        private Input<SearchableStringFilterInput> industry = Input.absent();
        private Input<SearchableStringFilterInput> nameOfBusiness = Input.absent();
        private Input<SearchableStringFilterInput> productOrService = Input.absent();
        private Input<SearchableStringFilterInput> timeFormat = Input.absent();
        private Input<SearchableStringFilterInput> timeZone = Input.absent();
        private Input<SearchableStringFilterInput> plan = Input.absent();
        private Input<SearchableStringFilterInput> paidUpTo = Input.absent();
        private Input<SearchableIntFilterInput> seats = Input.absent();
        private Input<SearchableIntFilterInput> freeSeats = Input.absent();
        private Input<SearchableIntFilterInput> currentTotalUsers = Input.absent();
        private Input<SearchableIntFilterInput> currentActiveUsers = Input.absent();
        private Input<SearchableIntFilterInput> extraActiveUsers = Input.absent();
        private Input<SearchableIntFilterInput> pricePerSeat = Input.absent();
        private Input<SearchableBooleanFilterInput> allowAddingSeat = Input.absent();
        private Input<SearchableStringFilterInput> allowAddingSeatTill = Input.absent();
        private Input<SearchableIntFilterInput> seatReductionMarkedForNextCycle = Input.absent();
        private Input<SearchableStringFilterInput> billingCurrency = Input.absent();
        private Input<SearchableStringFilterInput> billingEmail = Input.absent();
        private Input<SearchableStringFilterInput> taxId = Input.absent();
        private Input<SearchableStringFilterInput> taxIdType = Input.absent();
        private Input<SearchableStringFilterInput> trialAccountEndDate = Input.absent();
        private Input<SearchableIntFilterInput> trialExtensionTimes = Input.absent();
        private Input<SearchableBooleanFilterInput> eligibleForExtension = Input.absent();
        private Input<SearchableStringFilterInput> paidForTillDate = Input.absent();
        private Input<SearchableIDFilterInput> updatedById = Input.absent();
        private Input<SearchableStringFilterInput> website = Input.absent();
        private Input<SearchableStringFilterInput> permissions = Input.absent();
        private Input<SearchableBooleanFilterInput> enableCustomCharts = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<SearchableStringFilterInput> dealMode = Input.absent();
        private Input<SearchableStringFilterInput> openAiApiKey = Input.absent();
        private Input<SearchableStringFilterInput> salesmaxSalesContacts = Input.absent();
        private Input<SearchableStringFilterInput> salesmaxSupportContacts = Input.absent();
        private Input<SearchableStringFilterInput> chatWidgetConfig = Input.absent();
        private Input<SearchableStringFilterInput> onboardingStatus = Input.absent();
        private Input<SearchableStringFilterInput> integrationNeeded = Input.absent();
        private Input<SearchableIntFilterInput> accountStats__callSevenDays = Input.absent();
        private Input<SearchableIntFilterInput> accountStats__wabaConversationSevenDays = Input.absent();
        private Input<SearchableIntFilterInput> accountStats__wabaBroadcastSevenDays = Input.absent();
        private Input<SearchableIntFilterInput> accountStats__paymentSevenDays = Input.absent();
        private Input<SearchableIntFilterInput> accountStats__taskSevenDays = Input.absent();
        private Input<List<SearchableAccountFilterInput>> and = Input.absent();
        private Input<List<SearchableAccountFilterInput>> or = Input.absent();
        private Input<SearchableAccountFilterInput> not = Input.absent();

        public Builder accountName(SearchableStringFilterInput searchableStringFilterInput) {
            this.accountName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder accountStats__callSevenDays(SearchableIntFilterInput searchableIntFilterInput) {
            this.accountStats__callSevenDays = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder accountStats__paymentSevenDays(SearchableIntFilterInput searchableIntFilterInput) {
            this.accountStats__paymentSevenDays = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder accountStats__taskSevenDays(SearchableIntFilterInput searchableIntFilterInput) {
            this.accountStats__taskSevenDays = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder accountStats__wabaBroadcastSevenDays(SearchableIntFilterInput searchableIntFilterInput) {
            this.accountStats__wabaBroadcastSevenDays = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder accountStats__wabaConversationSevenDays(SearchableIntFilterInput searchableIntFilterInput) {
            this.accountStats__wabaConversationSevenDays = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder accountStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.accountStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder accountType(SearchableStringFilterInput searchableStringFilterInput) {
            this.accountType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder allowAddingSeat(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.allowAddingSeat = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder allowAddingSeatTill(SearchableStringFilterInput searchableStringFilterInput) {
            this.allowAddingSeatTill = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder and(List<SearchableAccountFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder billingCurrency(SearchableStringFilterInput searchableStringFilterInput) {
            this.billingCurrency = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder billingEmail(SearchableStringFilterInput searchableStringFilterInput) {
            this.billingEmail = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public SearchableAccountFilterInput build() {
            return new SearchableAccountFilterInput(this.id, this.accountName, this.accountType, this.accountStatus, this.businessLogoUrl, this.createdById, this.dateFormat, this.defaultCurrency, this.denomination, this.industry, this.nameOfBusiness, this.productOrService, this.timeFormat, this.timeZone, this.plan, this.paidUpTo, this.seats, this.freeSeats, this.currentTotalUsers, this.currentActiveUsers, this.extraActiveUsers, this.pricePerSeat, this.allowAddingSeat, this.allowAddingSeatTill, this.seatReductionMarkedForNextCycle, this.billingCurrency, this.billingEmail, this.taxId, this.taxIdType, this.trialAccountEndDate, this.trialExtensionTimes, this.eligibleForExtension, this.paidForTillDate, this.updatedById, this.website, this.permissions, this.enableCustomCharts, this.createdAt, this.updatedAt, this.dealMode, this.openAiApiKey, this.salesmaxSalesContacts, this.salesmaxSupportContacts, this.chatWidgetConfig, this.onboardingStatus, this.integrationNeeded, this.accountStats__callSevenDays, this.accountStats__wabaConversationSevenDays, this.accountStats__wabaBroadcastSevenDays, this.accountStats__paymentSevenDays, this.accountStats__taskSevenDays, this.and, this.or, this.not);
        }

        public Builder businessLogoUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.businessLogoUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder chatWidgetConfig(SearchableStringFilterInput searchableStringFilterInput) {
            this.chatWidgetConfig = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdById(SearchableIDFilterInput searchableIDFilterInput) {
            this.createdById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder currentActiveUsers(SearchableIntFilterInput searchableIntFilterInput) {
            this.currentActiveUsers = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder currentTotalUsers(SearchableIntFilterInput searchableIntFilterInput) {
            this.currentTotalUsers = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder dateFormat(SearchableStringFilterInput searchableStringFilterInput) {
            this.dateFormat = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dealMode(SearchableStringFilterInput searchableStringFilterInput) {
            this.dealMode = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder defaultCurrency(SearchableStringFilterInput searchableStringFilterInput) {
            this.defaultCurrency = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder denomination(SearchableStringFilterInput searchableStringFilterInput) {
            this.denomination = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder eligibleForExtension(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.eligibleForExtension = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder enableCustomCharts(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.enableCustomCharts = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder extraActiveUsers(SearchableIntFilterInput searchableIntFilterInput) {
            this.extraActiveUsers = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder freeSeats(SearchableIntFilterInput searchableIntFilterInput) {
            this.freeSeats = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder industry(SearchableStringFilterInput searchableStringFilterInput) {
            this.industry = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder integrationNeeded(SearchableStringFilterInput searchableStringFilterInput) {
            this.integrationNeeded = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nameOfBusiness(SearchableStringFilterInput searchableStringFilterInput) {
            this.nameOfBusiness = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableAccountFilterInput searchableAccountFilterInput) {
            this.not = Input.fromNullable(searchableAccountFilterInput);
            return this;
        }

        public Builder onboardingStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.onboardingStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder openAiApiKey(SearchableStringFilterInput searchableStringFilterInput) {
            this.openAiApiKey = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder or(List<SearchableAccountFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder paidForTillDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.paidForTillDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder paidUpTo(SearchableStringFilterInput searchableStringFilterInput) {
            this.paidUpTo = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder permissions(SearchableStringFilterInput searchableStringFilterInput) {
            this.permissions = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder plan(SearchableStringFilterInput searchableStringFilterInput) {
            this.plan = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder pricePerSeat(SearchableIntFilterInput searchableIntFilterInput) {
            this.pricePerSeat = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder productOrService(SearchableStringFilterInput searchableStringFilterInput) {
            this.productOrService = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder salesmaxSalesContacts(SearchableStringFilterInput searchableStringFilterInput) {
            this.salesmaxSalesContacts = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder salesmaxSupportContacts(SearchableStringFilterInput searchableStringFilterInput) {
            this.salesmaxSupportContacts = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder seatReductionMarkedForNextCycle(SearchableIntFilterInput searchableIntFilterInput) {
            this.seatReductionMarkedForNextCycle = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder seats(SearchableIntFilterInput searchableIntFilterInput) {
            this.seats = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder taxId(SearchableStringFilterInput searchableStringFilterInput) {
            this.taxId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taxIdType(SearchableStringFilterInput searchableStringFilterInput) {
            this.taxIdType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder timeFormat(SearchableStringFilterInput searchableStringFilterInput) {
            this.timeFormat = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder timeZone(SearchableStringFilterInput searchableStringFilterInput) {
            this.timeZone = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder trialAccountEndDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.trialAccountEndDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder trialExtensionTimes(SearchableIntFilterInput searchableIntFilterInput) {
            this.trialExtensionTimes = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.updatedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder website(SearchableStringFilterInput searchableStringFilterInput) {
            this.website = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableAccountFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableStringFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableIDFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableIntFilterInput> input17, Input<SearchableIntFilterInput> input18, Input<SearchableIntFilterInput> input19, Input<SearchableIntFilterInput> input20, Input<SearchableIntFilterInput> input21, Input<SearchableIntFilterInput> input22, Input<SearchableBooleanFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<SearchableIntFilterInput> input25, Input<SearchableStringFilterInput> input26, Input<SearchableStringFilterInput> input27, Input<SearchableStringFilterInput> input28, Input<SearchableStringFilterInput> input29, Input<SearchableStringFilterInput> input30, Input<SearchableIntFilterInput> input31, Input<SearchableBooleanFilterInput> input32, Input<SearchableStringFilterInput> input33, Input<SearchableIDFilterInput> input34, Input<SearchableStringFilterInput> input35, Input<SearchableStringFilterInput> input36, Input<SearchableBooleanFilterInput> input37, Input<SearchableStringFilterInput> input38, Input<SearchableStringFilterInput> input39, Input<SearchableStringFilterInput> input40, Input<SearchableStringFilterInput> input41, Input<SearchableStringFilterInput> input42, Input<SearchableStringFilterInput> input43, Input<SearchableStringFilterInput> input44, Input<SearchableStringFilterInput> input45, Input<SearchableStringFilterInput> input46, Input<SearchableIntFilterInput> input47, Input<SearchableIntFilterInput> input48, Input<SearchableIntFilterInput> input49, Input<SearchableIntFilterInput> input50, Input<SearchableIntFilterInput> input51, Input<List<SearchableAccountFilterInput>> input52, Input<List<SearchableAccountFilterInput>> input53, Input<SearchableAccountFilterInput> input54) {
        this.id = input;
        this.accountName = input2;
        this.accountType = input3;
        this.accountStatus = input4;
        this.businessLogoUrl = input5;
        this.createdById = input6;
        this.dateFormat = input7;
        this.defaultCurrency = input8;
        this.denomination = input9;
        this.industry = input10;
        this.nameOfBusiness = input11;
        this.productOrService = input12;
        this.timeFormat = input13;
        this.timeZone = input14;
        this.plan = input15;
        this.paidUpTo = input16;
        this.seats = input17;
        this.freeSeats = input18;
        this.currentTotalUsers = input19;
        this.currentActiveUsers = input20;
        this.extraActiveUsers = input21;
        this.pricePerSeat = input22;
        this.allowAddingSeat = input23;
        this.allowAddingSeatTill = input24;
        this.seatReductionMarkedForNextCycle = input25;
        this.billingCurrency = input26;
        this.billingEmail = input27;
        this.taxId = input28;
        this.taxIdType = input29;
        this.trialAccountEndDate = input30;
        this.trialExtensionTimes = input31;
        this.eligibleForExtension = input32;
        this.paidForTillDate = input33;
        this.updatedById = input34;
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
        this.accountStats__callSevenDays = input47;
        this.accountStats__wabaConversationSevenDays = input48;
        this.accountStats__wabaBroadcastSevenDays = input49;
        this.accountStats__paymentSevenDays = input50;
        this.accountStats__taskSevenDays = input51;
        this.and = input52;
        this.or = input53;
        this.not = input54;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableStringFilterInput accountName() {
        return this.accountName.value;
    }

    public SearchableIntFilterInput accountStats__callSevenDays() {
        return this.accountStats__callSevenDays.value;
    }

    public SearchableIntFilterInput accountStats__paymentSevenDays() {
        return this.accountStats__paymentSevenDays.value;
    }

    public SearchableIntFilterInput accountStats__taskSevenDays() {
        return this.accountStats__taskSevenDays.value;
    }

    public SearchableIntFilterInput accountStats__wabaBroadcastSevenDays() {
        return this.accountStats__wabaBroadcastSevenDays.value;
    }

    public SearchableIntFilterInput accountStats__wabaConversationSevenDays() {
        return this.accountStats__wabaConversationSevenDays.value;
    }

    public SearchableStringFilterInput accountStatus() {
        return this.accountStatus.value;
    }

    public SearchableStringFilterInput accountType() {
        return this.accountType.value;
    }

    public SearchableBooleanFilterInput allowAddingSeat() {
        return this.allowAddingSeat.value;
    }

    public SearchableStringFilterInput allowAddingSeatTill() {
        return this.allowAddingSeatTill.value;
    }

    public List<SearchableAccountFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput billingCurrency() {
        return this.billingCurrency.value;
    }

    public SearchableStringFilterInput billingEmail() {
        return this.billingEmail.value;
    }

    public SearchableStringFilterInput businessLogoUrl() {
        return this.businessLogoUrl.value;
    }

    public SearchableStringFilterInput chatWidgetConfig() {
        return this.chatWidgetConfig.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdById() {
        return this.createdById.value;
    }

    public SearchableIntFilterInput currentActiveUsers() {
        return this.currentActiveUsers.value;
    }

    public SearchableIntFilterInput currentTotalUsers() {
        return this.currentTotalUsers.value;
    }

    public SearchableStringFilterInput dateFormat() {
        return this.dateFormat.value;
    }

    public SearchableStringFilterInput dealMode() {
        return this.dealMode.value;
    }

    public SearchableStringFilterInput defaultCurrency() {
        return this.defaultCurrency.value;
    }

    public SearchableStringFilterInput denomination() {
        return this.denomination.value;
    }

    public SearchableBooleanFilterInput eligibleForExtension() {
        return this.eligibleForExtension.value;
    }

    public SearchableBooleanFilterInput enableCustomCharts() {
        return this.enableCustomCharts.value;
    }

    public SearchableIntFilterInput extraActiveUsers() {
        return this.extraActiveUsers.value;
    }

    public SearchableIntFilterInput freeSeats() {
        return this.freeSeats.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput industry() {
        return this.industry.value;
    }

    public SearchableStringFilterInput integrationNeeded() {
        return this.integrationNeeded.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableAccountFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableAccountFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableAccountFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableAccountFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.accountName.defined) {
                    inputFieldWriter.writeObject("accountName", SearchableAccountFilterInput.this.accountName.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.accountName.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.accountType.defined) {
                    inputFieldWriter.writeObject("accountType", SearchableAccountFilterInput.this.accountType.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.accountType.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.accountStatus.defined) {
                    inputFieldWriter.writeObject("accountStatus", SearchableAccountFilterInput.this.accountStatus.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.accountStatus.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.businessLogoUrl.defined) {
                    inputFieldWriter.writeObject("businessLogoUrl", SearchableAccountFilterInput.this.businessLogoUrl.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.businessLogoUrl.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", SearchableAccountFilterInput.this.createdById.value != 0 ? ((SearchableIDFilterInput) SearchableAccountFilterInput.this.createdById.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.dateFormat.defined) {
                    inputFieldWriter.writeObject("dateFormat", SearchableAccountFilterInput.this.dateFormat.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.dateFormat.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.defaultCurrency.defined) {
                    inputFieldWriter.writeObject("defaultCurrency", SearchableAccountFilterInput.this.defaultCurrency.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.defaultCurrency.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.denomination.defined) {
                    inputFieldWriter.writeObject("denomination", SearchableAccountFilterInput.this.denomination.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.denomination.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.industry.defined) {
                    inputFieldWriter.writeObject("industry", SearchableAccountFilterInput.this.industry.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.industry.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.nameOfBusiness.defined) {
                    inputFieldWriter.writeObject("nameOfBusiness", SearchableAccountFilterInput.this.nameOfBusiness.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.nameOfBusiness.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.productOrService.defined) {
                    inputFieldWriter.writeObject("productOrService", SearchableAccountFilterInput.this.productOrService.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.productOrService.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.timeFormat.defined) {
                    inputFieldWriter.writeObject("timeFormat", SearchableAccountFilterInput.this.timeFormat.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.timeFormat.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.timeZone.defined) {
                    inputFieldWriter.writeObject(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, SearchableAccountFilterInput.this.timeZone.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.timeZone.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.plan.defined) {
                    inputFieldWriter.writeObject("plan", SearchableAccountFilterInput.this.plan.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.plan.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.paidUpTo.defined) {
                    inputFieldWriter.writeObject("paidUpTo", SearchableAccountFilterInput.this.paidUpTo.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.paidUpTo.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.seats.defined) {
                    inputFieldWriter.writeObject("seats", SearchableAccountFilterInput.this.seats.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.seats.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.freeSeats.defined) {
                    inputFieldWriter.writeObject("freeSeats", SearchableAccountFilterInput.this.freeSeats.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.freeSeats.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.currentTotalUsers.defined) {
                    inputFieldWriter.writeObject("currentTotalUsers", SearchableAccountFilterInput.this.currentTotalUsers.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.currentTotalUsers.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.currentActiveUsers.defined) {
                    inputFieldWriter.writeObject("currentActiveUsers", SearchableAccountFilterInput.this.currentActiveUsers.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.currentActiveUsers.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.extraActiveUsers.defined) {
                    inputFieldWriter.writeObject("extraActiveUsers", SearchableAccountFilterInput.this.extraActiveUsers.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.extraActiveUsers.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.pricePerSeat.defined) {
                    inputFieldWriter.writeObject("pricePerSeat", SearchableAccountFilterInput.this.pricePerSeat.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.pricePerSeat.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.allowAddingSeat.defined) {
                    inputFieldWriter.writeObject("allowAddingSeat", SearchableAccountFilterInput.this.allowAddingSeat.value != 0 ? ((SearchableBooleanFilterInput) SearchableAccountFilterInput.this.allowAddingSeat.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.allowAddingSeatTill.defined) {
                    inputFieldWriter.writeObject("allowAddingSeatTill", SearchableAccountFilterInput.this.allowAddingSeatTill.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.allowAddingSeatTill.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.seatReductionMarkedForNextCycle.defined) {
                    inputFieldWriter.writeObject("seatReductionMarkedForNextCycle", SearchableAccountFilterInput.this.seatReductionMarkedForNextCycle.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.seatReductionMarkedForNextCycle.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.billingCurrency.defined) {
                    inputFieldWriter.writeObject("billingCurrency", SearchableAccountFilterInput.this.billingCurrency.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.billingCurrency.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.billingEmail.defined) {
                    inputFieldWriter.writeObject("billingEmail", SearchableAccountFilterInput.this.billingEmail.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.billingEmail.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.taxId.defined) {
                    inputFieldWriter.writeObject("taxId", SearchableAccountFilterInput.this.taxId.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.taxId.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.taxIdType.defined) {
                    inputFieldWriter.writeObject("taxIdType", SearchableAccountFilterInput.this.taxIdType.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.taxIdType.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.trialAccountEndDate.defined) {
                    inputFieldWriter.writeObject("trialAccountEndDate", SearchableAccountFilterInput.this.trialAccountEndDate.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.trialAccountEndDate.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.trialExtensionTimes.defined) {
                    inputFieldWriter.writeObject("trialExtensionTimes", SearchableAccountFilterInput.this.trialExtensionTimes.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.trialExtensionTimes.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.eligibleForExtension.defined) {
                    inputFieldWriter.writeObject("eligibleForExtension", SearchableAccountFilterInput.this.eligibleForExtension.value != 0 ? ((SearchableBooleanFilterInput) SearchableAccountFilterInput.this.eligibleForExtension.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.paidForTillDate.defined) {
                    inputFieldWriter.writeObject("paidForTillDate", SearchableAccountFilterInput.this.paidForTillDate.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.paidForTillDate.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", SearchableAccountFilterInput.this.updatedById.value != 0 ? ((SearchableIDFilterInput) SearchableAccountFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.website.defined) {
                    inputFieldWriter.writeObject("website", SearchableAccountFilterInput.this.website.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.website.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.permissions.defined) {
                    inputFieldWriter.writeObject("permissions", SearchableAccountFilterInput.this.permissions.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.permissions.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.enableCustomCharts.defined) {
                    inputFieldWriter.writeObject("enableCustomCharts", SearchableAccountFilterInput.this.enableCustomCharts.value != 0 ? ((SearchableBooleanFilterInput) SearchableAccountFilterInput.this.enableCustomCharts.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableAccountFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableAccountFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.dealMode.defined) {
                    inputFieldWriter.writeObject("dealMode", SearchableAccountFilterInput.this.dealMode.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.dealMode.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.openAiApiKey.defined) {
                    inputFieldWriter.writeObject("openAiApiKey", SearchableAccountFilterInput.this.openAiApiKey.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.openAiApiKey.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.salesmaxSalesContacts.defined) {
                    inputFieldWriter.writeObject("salesmaxSalesContacts", SearchableAccountFilterInput.this.salesmaxSalesContacts.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.salesmaxSalesContacts.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.salesmaxSupportContacts.defined) {
                    inputFieldWriter.writeObject("salesmaxSupportContacts", SearchableAccountFilterInput.this.salesmaxSupportContacts.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.salesmaxSupportContacts.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.chatWidgetConfig.defined) {
                    inputFieldWriter.writeObject("chatWidgetConfig", SearchableAccountFilterInput.this.chatWidgetConfig.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.chatWidgetConfig.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.onboardingStatus.defined) {
                    inputFieldWriter.writeObject("onboardingStatus", SearchableAccountFilterInput.this.onboardingStatus.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.onboardingStatus.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.integrationNeeded.defined) {
                    inputFieldWriter.writeObject("integrationNeeded", SearchableAccountFilterInput.this.integrationNeeded.value != 0 ? ((SearchableStringFilterInput) SearchableAccountFilterInput.this.integrationNeeded.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.accountStats__callSevenDays.defined) {
                    inputFieldWriter.writeObject("accountStats__callSevenDays", SearchableAccountFilterInput.this.accountStats__callSevenDays.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.accountStats__callSevenDays.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.accountStats__wabaConversationSevenDays.defined) {
                    inputFieldWriter.writeObject("accountStats__wabaConversationSevenDays", SearchableAccountFilterInput.this.accountStats__wabaConversationSevenDays.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.accountStats__wabaConversationSevenDays.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.accountStats__wabaBroadcastSevenDays.defined) {
                    inputFieldWriter.writeObject("accountStats__wabaBroadcastSevenDays", SearchableAccountFilterInput.this.accountStats__wabaBroadcastSevenDays.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.accountStats__wabaBroadcastSevenDays.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.accountStats__paymentSevenDays.defined) {
                    inputFieldWriter.writeObject("accountStats__paymentSevenDays", SearchableAccountFilterInput.this.accountStats__paymentSevenDays.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.accountStats__paymentSevenDays.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.accountStats__taskSevenDays.defined) {
                    inputFieldWriter.writeObject("accountStats__taskSevenDays", SearchableAccountFilterInput.this.accountStats__taskSevenDays.value != 0 ? ((SearchableIntFilterInput) SearchableAccountFilterInput.this.accountStats__taskSevenDays.value).marshaller() : null);
                }
                if (SearchableAccountFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableAccountFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableAccountFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableAccountFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableAccountFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableAccountFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableAccountFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableAccountFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableAccountFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableAccountFilterInput.this.not.value != 0 ? ((SearchableAccountFilterInput) SearchableAccountFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput nameOfBusiness() {
        return this.nameOfBusiness.value;
    }

    public SearchableAccountFilterInput not() {
        return this.not.value;
    }

    public SearchableStringFilterInput onboardingStatus() {
        return this.onboardingStatus.value;
    }

    public SearchableStringFilterInput openAiApiKey() {
        return this.openAiApiKey.value;
    }

    public List<SearchableAccountFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput paidForTillDate() {
        return this.paidForTillDate.value;
    }

    public SearchableStringFilterInput paidUpTo() {
        return this.paidUpTo.value;
    }

    public SearchableStringFilterInput permissions() {
        return this.permissions.value;
    }

    public SearchableStringFilterInput plan() {
        return this.plan.value;
    }

    public SearchableIntFilterInput pricePerSeat() {
        return this.pricePerSeat.value;
    }

    public SearchableStringFilterInput productOrService() {
        return this.productOrService.value;
    }

    public SearchableStringFilterInput salesmaxSalesContacts() {
        return this.salesmaxSalesContacts.value;
    }

    public SearchableStringFilterInput salesmaxSupportContacts() {
        return this.salesmaxSupportContacts.value;
    }

    public SearchableIntFilterInput seatReductionMarkedForNextCycle() {
        return this.seatReductionMarkedForNextCycle.value;
    }

    public SearchableIntFilterInput seats() {
        return this.seats.value;
    }

    public SearchableStringFilterInput taxId() {
        return this.taxId.value;
    }

    public SearchableStringFilterInput taxIdType() {
        return this.taxIdType.value;
    }

    public SearchableStringFilterInput timeFormat() {
        return this.timeFormat.value;
    }

    public SearchableStringFilterInput timeZone() {
        return this.timeZone.value;
    }

    public SearchableStringFilterInput trialAccountEndDate() {
        return this.trialAccountEndDate.value;
    }

    public SearchableIntFilterInput trialExtensionTimes() {
        return this.trialExtensionTimes.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedById() {
        return this.updatedById.value;
    }

    public SearchableStringFilterInput website() {
        return this.website.value;
    }
}
