package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateAccountInput implements InputType {
    private final Input<String> accountName;
    private final Input<String> accountStatus;
    private final Input<String> accountType;
    private final Input<Boolean> allowAddingSeat;
    private final Input<String> allowAddingSeatTill;
    private final Input<String> billingCurrency;
    private final Input<String> billingEmail;
    private final Input<String> businessLogoUrl;
    private final Input<String> chatWidgetConfig;
    private final Input<String> dateFormat;
    private final Input<String> dateTimeViewStyle;
    private final Input<String> defaultCurrency;
    private final Input<String> denomination;
    private final Input<Integer> freeSeats;
    private final String id;
    private final Input<String> industry;
    private final Input<String> integrationNeeded;
    private final Input<String> lastChurnDate;
    private final Input<String> lastChurnReason;
    private final Input<String> lastPaymentDataCreatedAt;
    private final Input<String> lastPaymentDataId;
    private final Input<String> lastPaymentStatus;
    private final Input<String> matchingDealId;
    private final Input<String> nameOfBusiness;
    private final Input<String> nextRenewalDateIfPaid;
    private final Input<String> onboardingStatus;
    private final Input<String> openAiApiKey;
    private final Input<String> paidForTillDate;
    private final Input<String> paidUpTo;
    private final Input<Integer> partPaymentAmountIfAny;
    private final Input<List<String>> permissions;
    private final Input<String> plan;
    private final Input<String> possibleReactivationDate;
    private final Input<Integer> pricePerSeat;
    private final Input<List<String>> productOrService;
    private final Input<List<String>> relatedAccountIds;
    private final Input<List<String>> salesmaxSalesContacts;
    private final Input<List<String>> salesmaxSupportContacts;
    private final Input<Integer> seats;
    private final Input<String> taxId;
    private final Input<String> taxIdType;
    private final Input<String> timeFormat;
    private final Input<String> timeZone;
    private final Input<String> trialAccountEndDate;
    private final Input<List<WebPreferencesInput>> webPreferences;
    private final Input<String> website;
    private final Input<List<WorkingHourInput>> workingHours;

    public static final class Builder {
        private String id;
        private Input<String> accountName = Input.absent();
        private Input<String> accountType = Input.absent();
        private Input<String> accountStatus = Input.absent();
        private Input<String> businessLogoUrl = Input.absent();
        private Input<String> dateFormat = Input.absent();
        private Input<String> dateTimeViewStyle = Input.absent();
        private Input<String> defaultCurrency = Input.absent();
        private Input<String> denomination = Input.absent();
        private Input<String> industry = Input.absent();
        private Input<String> nameOfBusiness = Input.absent();
        private Input<List<String>> productOrService = Input.absent();
        private Input<String> timeFormat = Input.absent();
        private Input<String> timeZone = Input.absent();
        private Input<String> billingCurrency = Input.absent();
        private Input<String> billingEmail = Input.absent();
        private Input<String> taxId = Input.absent();
        private Input<String> taxIdType = Input.absent();
        private Input<String> website = Input.absent();
        private Input<List<WorkingHourInput>> workingHours = Input.absent();
        private Input<List<WebPreferencesInput>> webPreferences = Input.absent();
        private Input<List<String>> permissions = Input.absent();
        private Input<String> openAiApiKey = Input.absent();
        private Input<String> chatWidgetConfig = Input.absent();
        private Input<String> onboardingStatus = Input.absent();
        private Input<String> integrationNeeded = Input.absent();
        private Input<List<String>> salesmaxSalesContacts = Input.absent();
        private Input<List<String>> salesmaxSupportContacts = Input.absent();
        private Input<String> plan = Input.absent();
        private Input<String> paidUpTo = Input.absent();
        private Input<Integer> seats = Input.absent();
        private Input<Integer> freeSeats = Input.absent();
        private Input<Integer> pricePerSeat = Input.absent();
        private Input<Boolean> allowAddingSeat = Input.absent();
        private Input<String> allowAddingSeatTill = Input.absent();
        private Input<String> paidForTillDate = Input.absent();
        private Input<String> matchingDealId = Input.absent();
        private Input<List<String>> relatedAccountIds = Input.absent();
        private Input<String> lastChurnDate = Input.absent();
        private Input<String> lastChurnReason = Input.absent();
        private Input<String> possibleReactivationDate = Input.absent();
        private Input<String> trialAccountEndDate = Input.absent();
        private Input<String> lastPaymentDataId = Input.absent();
        private Input<String> lastPaymentDataCreatedAt = Input.absent();
        private Input<String> lastPaymentStatus = Input.absent();
        private Input<String> nextRenewalDateIfPaid = Input.absent();
        private Input<Integer> partPaymentAmountIfAny = Input.absent();

        public Builder accountName(String str) {
            this.accountName = Input.fromNullable(str);
            return this;
        }

        public Builder accountStatus(String str) {
            this.accountStatus = Input.fromNullable(str);
            return this;
        }

        public Builder accountType(String str) {
            this.accountType = Input.fromNullable(str);
            return this;
        }

        public Builder allowAddingSeat(Boolean bool) {
            this.allowAddingSeat = Input.fromNullable(bool);
            return this;
        }

        public Builder allowAddingSeatTill(String str) {
            this.allowAddingSeatTill = Input.fromNullable(str);
            return this;
        }

        public Builder billingCurrency(String str) {
            this.billingCurrency = Input.fromNullable(str);
            return this;
        }

        public Builder billingEmail(String str) {
            this.billingEmail = Input.fromNullable(str);
            return this;
        }

        public UpdateAccountInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateAccountInput(this.id, this.accountName, this.accountType, this.accountStatus, this.businessLogoUrl, this.dateFormat, this.dateTimeViewStyle, this.defaultCurrency, this.denomination, this.industry, this.nameOfBusiness, this.productOrService, this.timeFormat, this.timeZone, this.billingCurrency, this.billingEmail, this.taxId, this.taxIdType, this.website, this.workingHours, this.webPreferences, this.permissions, this.openAiApiKey, this.chatWidgetConfig, this.onboardingStatus, this.integrationNeeded, this.salesmaxSalesContacts, this.salesmaxSupportContacts, this.plan, this.paidUpTo, this.seats, this.freeSeats, this.pricePerSeat, this.allowAddingSeat, this.allowAddingSeatTill, this.paidForTillDate, this.matchingDealId, this.relatedAccountIds, this.lastChurnDate, this.lastChurnReason, this.possibleReactivationDate, this.trialAccountEndDate, this.lastPaymentDataId, this.lastPaymentDataCreatedAt, this.lastPaymentStatus, this.nextRenewalDateIfPaid, this.partPaymentAmountIfAny);
        }

        public Builder businessLogoUrl(String str) {
            this.businessLogoUrl = Input.fromNullable(str);
            return this;
        }

        public Builder chatWidgetConfig(String str) {
            this.chatWidgetConfig = Input.fromNullable(str);
            return this;
        }

        public Builder dateFormat(String str) {
            this.dateFormat = Input.fromNullable(str);
            return this;
        }

        public Builder dateTimeViewStyle(String str) {
            this.dateTimeViewStyle = Input.fromNullable(str);
            return this;
        }

        public Builder defaultCurrency(String str) {
            this.defaultCurrency = Input.fromNullable(str);
            return this;
        }

        public Builder denomination(String str) {
            this.denomination = Input.fromNullable(str);
            return this;
        }

        public Builder freeSeats(Integer num) {
            this.freeSeats = Input.fromNullable(num);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder industry(String str) {
            this.industry = Input.fromNullable(str);
            return this;
        }

        public Builder integrationNeeded(String str) {
            this.integrationNeeded = Input.fromNullable(str);
            return this;
        }

        public Builder lastChurnDate(String str) {
            this.lastChurnDate = Input.fromNullable(str);
            return this;
        }

        public Builder lastChurnReason(String str) {
            this.lastChurnReason = Input.fromNullable(str);
            return this;
        }

        public Builder lastPaymentDataCreatedAt(String str) {
            this.lastPaymentDataCreatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder lastPaymentDataId(String str) {
            this.lastPaymentDataId = Input.fromNullable(str);
            return this;
        }

        public Builder lastPaymentStatus(String str) {
            this.lastPaymentStatus = Input.fromNullable(str);
            return this;
        }

        public Builder matchingDealId(String str) {
            this.matchingDealId = Input.fromNullable(str);
            return this;
        }

        public Builder nameOfBusiness(String str) {
            this.nameOfBusiness = Input.fromNullable(str);
            return this;
        }

        public Builder nextRenewalDateIfPaid(String str) {
            this.nextRenewalDateIfPaid = Input.fromNullable(str);
            return this;
        }

        public Builder onboardingStatus(String str) {
            this.onboardingStatus = Input.fromNullable(str);
            return this;
        }

        public Builder openAiApiKey(String str) {
            this.openAiApiKey = Input.fromNullable(str);
            return this;
        }

        public Builder paidForTillDate(String str) {
            this.paidForTillDate = Input.fromNullable(str);
            return this;
        }

        public Builder paidUpTo(String str) {
            this.paidUpTo = Input.fromNullable(str);
            return this;
        }

        public Builder partPaymentAmountIfAny(Integer num) {
            this.partPaymentAmountIfAny = Input.fromNullable(num);
            return this;
        }

        public Builder permissions(List<String> list) {
            this.permissions = Input.fromNullable(list);
            return this;
        }

        public Builder plan(String str) {
            this.plan = Input.fromNullable(str);
            return this;
        }

        public Builder possibleReactivationDate(String str) {
            this.possibleReactivationDate = Input.fromNullable(str);
            return this;
        }

        public Builder pricePerSeat(Integer num) {
            this.pricePerSeat = Input.fromNullable(num);
            return this;
        }

        public Builder productOrService(List<String> list) {
            this.productOrService = Input.fromNullable(list);
            return this;
        }

        public Builder relatedAccountIds(List<String> list) {
            this.relatedAccountIds = Input.fromNullable(list);
            return this;
        }

        public Builder salesmaxSalesContacts(List<String> list) {
            this.salesmaxSalesContacts = Input.fromNullable(list);
            return this;
        }

        public Builder salesmaxSupportContacts(List<String> list) {
            this.salesmaxSupportContacts = Input.fromNullable(list);
            return this;
        }

        public Builder seats(Integer num) {
            this.seats = Input.fromNullable(num);
            return this;
        }

        public Builder taxId(String str) {
            this.taxId = Input.fromNullable(str);
            return this;
        }

        public Builder taxIdType(String str) {
            this.taxIdType = Input.fromNullable(str);
            return this;
        }

        public Builder timeFormat(String str) {
            this.timeFormat = Input.fromNullable(str);
            return this;
        }

        public Builder timeZone(String str) {
            this.timeZone = Input.fromNullable(str);
            return this;
        }

        public Builder trialAccountEndDate(String str) {
            this.trialAccountEndDate = Input.fromNullable(str);
            return this;
        }

        public Builder webPreferences(List<WebPreferencesInput> list) {
            this.webPreferences = Input.fromNullable(list);
            return this;
        }

        public Builder website(String str) {
            this.website = Input.fromNullable(str);
            return this;
        }

        public Builder workingHours(List<WorkingHourInput> list) {
            this.workingHours = Input.fromNullable(list);
            return this;
        }
    }

    public UpdateAccountInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<List<String>> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<List<WorkingHourInput>> input19, Input<List<WebPreferencesInput>> input20, Input<List<String>> input21, Input<String> input22, Input<String> input23, Input<String> input24, Input<String> input25, Input<List<String>> input26, Input<List<String>> input27, Input<String> input28, Input<String> input29, Input<Integer> input30, Input<Integer> input31, Input<Integer> input32, Input<Boolean> input33, Input<String> input34, Input<String> input35, Input<String> input36, Input<List<String>> input37, Input<String> input38, Input<String> input39, Input<String> input40, Input<String> input41, Input<String> input42, Input<String> input43, Input<String> input44, Input<String> input45, Input<Integer> input46) {
        this.id = str;
        this.accountName = input;
        this.accountType = input2;
        this.accountStatus = input3;
        this.businessLogoUrl = input4;
        this.dateFormat = input5;
        this.dateTimeViewStyle = input6;
        this.defaultCurrency = input7;
        this.denomination = input8;
        this.industry = input9;
        this.nameOfBusiness = input10;
        this.productOrService = input11;
        this.timeFormat = input12;
        this.timeZone = input13;
        this.billingCurrency = input14;
        this.billingEmail = input15;
        this.taxId = input16;
        this.taxIdType = input17;
        this.website = input18;
        this.workingHours = input19;
        this.webPreferences = input20;
        this.permissions = input21;
        this.openAiApiKey = input22;
        this.chatWidgetConfig = input23;
        this.onboardingStatus = input24;
        this.integrationNeeded = input25;
        this.salesmaxSalesContacts = input26;
        this.salesmaxSupportContacts = input27;
        this.plan = input28;
        this.paidUpTo = input29;
        this.seats = input30;
        this.freeSeats = input31;
        this.pricePerSeat = input32;
        this.allowAddingSeat = input33;
        this.allowAddingSeatTill = input34;
        this.paidForTillDate = input35;
        this.matchingDealId = input36;
        this.relatedAccountIds = input37;
        this.lastChurnDate = input38;
        this.lastChurnReason = input39;
        this.possibleReactivationDate = input40;
        this.trialAccountEndDate = input41;
        this.lastPaymentDataId = input42;
        this.lastPaymentDataCreatedAt = input43;
        this.lastPaymentStatus = input44;
        this.nextRenewalDateIfPaid = input45;
        this.partPaymentAmountIfAny = input46;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountName() {
        return this.accountName.value;
    }

    public String accountStatus() {
        return this.accountStatus.value;
    }

    public String accountType() {
        return this.accountType.value;
    }

    public Boolean allowAddingSeat() {
        return this.allowAddingSeat.value;
    }

    public String allowAddingSeatTill() {
        return this.allowAddingSeatTill.value;
    }

    public String billingCurrency() {
        return this.billingCurrency.value;
    }

    public String billingEmail() {
        return this.billingEmail.value;
    }

    public String businessLogoUrl() {
        return this.businessLogoUrl.value;
    }

    public String chatWidgetConfig() {
        return this.chatWidgetConfig.value;
    }

    public String dateFormat() {
        return this.dateFormat.value;
    }

    public String dateTimeViewStyle() {
        return this.dateTimeViewStyle.value;
    }

    public String defaultCurrency() {
        return this.defaultCurrency.value;
    }

    public String denomination() {
        return this.denomination.value;
    }

    public Integer freeSeats() {
        return this.freeSeats.value;
    }

    public String id() {
        return this.id;
    }

    public String industry() {
        return this.industry.value;
    }

    public String integrationNeeded() {
        return this.integrationNeeded.value;
    }

    public String lastChurnDate() {
        return this.lastChurnDate.value;
    }

    public String lastChurnReason() {
        return this.lastChurnReason.value;
    }

    public String lastPaymentDataCreatedAt() {
        return this.lastPaymentDataCreatedAt.value;
    }

    public String lastPaymentDataId() {
        return this.lastPaymentDataId.value;
    }

    public String lastPaymentStatus() {
        return this.lastPaymentStatus.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateAccountInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateAccountInput.this.id);
                if (UpdateAccountInput.this.accountName.defined) {
                    inputFieldWriter.writeString("accountName", (String) UpdateAccountInput.this.accountName.value);
                }
                if (UpdateAccountInput.this.accountType.defined) {
                    inputFieldWriter.writeString("accountType", (String) UpdateAccountInput.this.accountType.value);
                }
                if (UpdateAccountInput.this.accountStatus.defined) {
                    inputFieldWriter.writeString("accountStatus", (String) UpdateAccountInput.this.accountStatus.value);
                }
                if (UpdateAccountInput.this.businessLogoUrl.defined) {
                    inputFieldWriter.writeString("businessLogoUrl", (String) UpdateAccountInput.this.businessLogoUrl.value);
                }
                if (UpdateAccountInput.this.dateFormat.defined) {
                    inputFieldWriter.writeString("dateFormat", (String) UpdateAccountInput.this.dateFormat.value);
                }
                if (UpdateAccountInput.this.dateTimeViewStyle.defined) {
                    inputFieldWriter.writeString("dateTimeViewStyle", (String) UpdateAccountInput.this.dateTimeViewStyle.value);
                }
                if (UpdateAccountInput.this.defaultCurrency.defined) {
                    inputFieldWriter.writeString("defaultCurrency", (String) UpdateAccountInput.this.defaultCurrency.value);
                }
                if (UpdateAccountInput.this.denomination.defined) {
                    inputFieldWriter.writeString("denomination", (String) UpdateAccountInput.this.denomination.value);
                }
                if (UpdateAccountInput.this.industry.defined) {
                    inputFieldWriter.writeString("industry", (String) UpdateAccountInput.this.industry.value);
                }
                if (UpdateAccountInput.this.nameOfBusiness.defined) {
                    inputFieldWriter.writeString("nameOfBusiness", (String) UpdateAccountInput.this.nameOfBusiness.value);
                }
                if (UpdateAccountInput.this.productOrService.defined) {
                    inputFieldWriter.writeList("productOrService", UpdateAccountInput.this.productOrService.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateAccountInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateAccountInput.this.productOrService.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateAccountInput.this.timeFormat.defined) {
                    inputFieldWriter.writeString("timeFormat", (String) UpdateAccountInput.this.timeFormat.value);
                }
                if (UpdateAccountInput.this.timeZone.defined) {
                    inputFieldWriter.writeString(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, (String) UpdateAccountInput.this.timeZone.value);
                }
                if (UpdateAccountInput.this.billingCurrency.defined) {
                    inputFieldWriter.writeString("billingCurrency", (String) UpdateAccountInput.this.billingCurrency.value);
                }
                if (UpdateAccountInput.this.billingEmail.defined) {
                    inputFieldWriter.writeString("billingEmail", (String) UpdateAccountInput.this.billingEmail.value);
                }
                if (UpdateAccountInput.this.taxId.defined) {
                    inputFieldWriter.writeString("taxId", (String) UpdateAccountInput.this.taxId.value);
                }
                if (UpdateAccountInput.this.taxIdType.defined) {
                    inputFieldWriter.writeString("taxIdType", (String) UpdateAccountInput.this.taxIdType.value);
                }
                if (UpdateAccountInput.this.website.defined) {
                    inputFieldWriter.writeString("website", (String) UpdateAccountInput.this.website.value);
                }
                if (UpdateAccountInput.this.workingHours.defined) {
                    inputFieldWriter.writeList("workingHours", UpdateAccountInput.this.workingHours.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateAccountInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateAccountInput.this.workingHours.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((WorkingHourInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateAccountInput.this.webPreferences.defined) {
                    inputFieldWriter.writeList("webPreferences", UpdateAccountInput.this.webPreferences.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateAccountInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateAccountInput.this.webPreferences.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((WebPreferencesInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateAccountInput.this.permissions.defined) {
                    inputFieldWriter.writeList("permissions", UpdateAccountInput.this.permissions.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateAccountInput.1.4
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateAccountInput.this.permissions.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSJSON, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateAccountInput.this.openAiApiKey.defined) {
                    inputFieldWriter.writeString("openAiApiKey", (String) UpdateAccountInput.this.openAiApiKey.value);
                }
                if (UpdateAccountInput.this.chatWidgetConfig.defined) {
                    inputFieldWriter.writeString("chatWidgetConfig", (String) UpdateAccountInput.this.chatWidgetConfig.value);
                }
                if (UpdateAccountInput.this.onboardingStatus.defined) {
                    inputFieldWriter.writeString("onboardingStatus", (String) UpdateAccountInput.this.onboardingStatus.value);
                }
                if (UpdateAccountInput.this.integrationNeeded.defined) {
                    inputFieldWriter.writeString("integrationNeeded", (String) UpdateAccountInput.this.integrationNeeded.value);
                }
                if (UpdateAccountInput.this.salesmaxSalesContacts.defined) {
                    inputFieldWriter.writeList("salesmaxSalesContacts", UpdateAccountInput.this.salesmaxSalesContacts.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateAccountInput.1.5
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateAccountInput.this.salesmaxSalesContacts.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateAccountInput.this.salesmaxSupportContacts.defined) {
                    inputFieldWriter.writeList("salesmaxSupportContacts", UpdateAccountInput.this.salesmaxSupportContacts.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateAccountInput.1.6
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateAccountInput.this.salesmaxSupportContacts.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateAccountInput.this.plan.defined) {
                    inputFieldWriter.writeString("plan", (String) UpdateAccountInput.this.plan.value);
                }
                if (UpdateAccountInput.this.paidUpTo.defined) {
                    inputFieldWriter.writeString("paidUpTo", (String) UpdateAccountInput.this.paidUpTo.value);
                }
                if (UpdateAccountInput.this.seats.defined) {
                    inputFieldWriter.writeInt("seats", (Integer) UpdateAccountInput.this.seats.value);
                }
                if (UpdateAccountInput.this.freeSeats.defined) {
                    inputFieldWriter.writeInt("freeSeats", (Integer) UpdateAccountInput.this.freeSeats.value);
                }
                if (UpdateAccountInput.this.pricePerSeat.defined) {
                    inputFieldWriter.writeInt("pricePerSeat", (Integer) UpdateAccountInput.this.pricePerSeat.value);
                }
                if (UpdateAccountInput.this.allowAddingSeat.defined) {
                    inputFieldWriter.writeBoolean("allowAddingSeat", (Boolean) UpdateAccountInput.this.allowAddingSeat.value);
                }
                if (UpdateAccountInput.this.allowAddingSeatTill.defined) {
                    inputFieldWriter.writeString("allowAddingSeatTill", (String) UpdateAccountInput.this.allowAddingSeatTill.value);
                }
                if (UpdateAccountInput.this.paidForTillDate.defined) {
                    inputFieldWriter.writeString("paidForTillDate", (String) UpdateAccountInput.this.paidForTillDate.value);
                }
                if (UpdateAccountInput.this.matchingDealId.defined) {
                    inputFieldWriter.writeString("matchingDealId", (String) UpdateAccountInput.this.matchingDealId.value);
                }
                if (UpdateAccountInput.this.relatedAccountIds.defined) {
                    inputFieldWriter.writeList("relatedAccountIds", UpdateAccountInput.this.relatedAccountIds.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateAccountInput.1.7
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateAccountInput.this.relatedAccountIds.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateAccountInput.this.lastChurnDate.defined) {
                    inputFieldWriter.writeString("lastChurnDate", (String) UpdateAccountInput.this.lastChurnDate.value);
                }
                if (UpdateAccountInput.this.lastChurnReason.defined) {
                    inputFieldWriter.writeString("lastChurnReason", (String) UpdateAccountInput.this.lastChurnReason.value);
                }
                if (UpdateAccountInput.this.possibleReactivationDate.defined) {
                    inputFieldWriter.writeString("possibleReactivationDate", (String) UpdateAccountInput.this.possibleReactivationDate.value);
                }
                if (UpdateAccountInput.this.trialAccountEndDate.defined) {
                    inputFieldWriter.writeString("trialAccountEndDate", (String) UpdateAccountInput.this.trialAccountEndDate.value);
                }
                if (UpdateAccountInput.this.lastPaymentDataId.defined) {
                    inputFieldWriter.writeString("lastPaymentDataId", (String) UpdateAccountInput.this.lastPaymentDataId.value);
                }
                if (UpdateAccountInput.this.lastPaymentDataCreatedAt.defined) {
                    inputFieldWriter.writeString("lastPaymentDataCreatedAt", (String) UpdateAccountInput.this.lastPaymentDataCreatedAt.value);
                }
                if (UpdateAccountInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeString("lastPaymentStatus", (String) UpdateAccountInput.this.lastPaymentStatus.value);
                }
                if (UpdateAccountInput.this.nextRenewalDateIfPaid.defined) {
                    inputFieldWriter.writeString("nextRenewalDateIfPaid", (String) UpdateAccountInput.this.nextRenewalDateIfPaid.value);
                }
                if (UpdateAccountInput.this.partPaymentAmountIfAny.defined) {
                    inputFieldWriter.writeInt("partPaymentAmountIfAny", (Integer) UpdateAccountInput.this.partPaymentAmountIfAny.value);
                }
            }
        };
    }

    public String matchingDealId() {
        return this.matchingDealId.value;
    }

    public String nameOfBusiness() {
        return this.nameOfBusiness.value;
    }

    public String nextRenewalDateIfPaid() {
        return this.nextRenewalDateIfPaid.value;
    }

    public String onboardingStatus() {
        return this.onboardingStatus.value;
    }

    public String openAiApiKey() {
        return this.openAiApiKey.value;
    }

    public String paidForTillDate() {
        return this.paidForTillDate.value;
    }

    public String paidUpTo() {
        return this.paidUpTo.value;
    }

    public Integer partPaymentAmountIfAny() {
        return this.partPaymentAmountIfAny.value;
    }

    public List<String> permissions() {
        return this.permissions.value;
    }

    public String plan() {
        return this.plan.value;
    }

    public String possibleReactivationDate() {
        return this.possibleReactivationDate.value;
    }

    public Integer pricePerSeat() {
        return this.pricePerSeat.value;
    }

    public List<String> productOrService() {
        return this.productOrService.value;
    }

    public List<String> relatedAccountIds() {
        return this.relatedAccountIds.value;
    }

    public List<String> salesmaxSalesContacts() {
        return this.salesmaxSalesContacts.value;
    }

    public List<String> salesmaxSupportContacts() {
        return this.salesmaxSupportContacts.value;
    }

    public Integer seats() {
        return this.seats.value;
    }

    public String taxId() {
        return this.taxId.value;
    }

    public String taxIdType() {
        return this.taxIdType.value;
    }

    public String timeFormat() {
        return this.timeFormat.value;
    }

    public String timeZone() {
        return this.timeZone.value;
    }

    public String trialAccountEndDate() {
        return this.trialAccountEndDate.value;
    }

    public List<WebPreferencesInput> webPreferences() {
        return this.webPreferences.value;
    }

    public String website() {
        return this.website.value;
    }

    public List<WorkingHourInput> workingHours() {
        return this.workingHours.value;
    }
}
