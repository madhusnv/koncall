package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.AccountStatus;
import type.AccountType;
import type.AddedSourceType;
import type.CustomType;
import type.ModelTeamMemberConditionInput;
import type.TeamMemberType;
import type.TeamRole;
import type.UpdateTeamMemberInput;
import type.UserRegistrationStatus;

/* loaded from: classes4.dex */
public final class UpdateTeamMemberMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateTeamMember($input: UpdateTeamMemberInput!, $condition: ModelTeamMemberConditionInput) {\n  updateTeamMember(input: $input, condition: $condition) {\n    __typename\n    id\n    teamId\n    team {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    accountId\n    teamRole\n    updatedById\n    createdById\n    userId\n    memberTeamId\n    memberTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    memberType\n    isDefaultTeam\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    createdBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    user {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateTeamMember";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateTeamMember($input: UpdateTeamMemberInput!, $condition: ModelTeamMemberConditionInput) {\n  updateTeamMember(input: $input, condition: $condition) {\n    __typename\n    id\n    teamId\n    team {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    accountId\n    teamRole\n    updatedById\n    createdById\n    userId\n    memberTeamId\n    memberTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    memberType\n    isDefaultTeam\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    createdBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    user {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static class Account {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountName;
        final AccountStatus accountStatus;
        final AccountType accountType;
        final Boolean allowAddingSeat;
        final String allowAddingSeatTill;
        final String billingCurrency;
        final String billingEmail;
        final String businessLogoUrl;
        final String chatWidgetConfig;
        final String createdAt;
        final String createdById;
        final Integer currentActiveUsers;
        final Integer currentTotalUsers;
        final String dateFormat;
        final String dateTimeViewStyle;
        final String dealMode;
        final String defaultCurrency;
        final String denomination;
        final String deviceKey;
        final String deviceKeyLastUpdated;
        final Boolean eligibleForExtension;
        final Boolean enableCustomCharts;
        final Integer extraActiveUsers;
        final Integer freeSeats;
        final String id;
        final String industry;
        final String integrationNeeded;
        final String lastChurnDate;
        final String lastChurnReason;
        final String lastPaymentDataCreatedAt;
        final String lastPaymentDataId;
        final String lastPaymentStatus;
        final Double locationPeriodicFrequency;
        final String matchingDealId;
        final String nameOfBusiness;
        final String nextRenewalDateIfPaid;
        final String onboardingStatus;
        final String openAiApiKey;
        final String paidForTillDate;
        final String paidUpTo;
        final Integer partPaymentAmountIfAny;
        final List<String> permissions;
        final String plan;
        final String possibleReactivationDate;
        final Integer pricePerSeat;
        final List<String> productOrService;
        final List<String> relatedAccountIds;
        final List<String> salesmaxSalesContacts;
        final List<String> salesmaxSupportContacts;
        final Integer seatReductionMarkedForNextCycle;
        final Integer seats;
        final String taxId;
        final String taxIdType;
        final String timeFormat;
        final String timeZone;
        final String trialAccountEndDate;
        final Integer trialExtensionTimes;
        final String updatedAt;
        final String updatedById;
        final String website;

        public static final class Mapper implements ResponseFieldMapper<Account> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Account map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Account.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                String string3 = responseReader.readString(responseFieldArr[3]);
                AccountType accountTypeValueOf = string3 != null ? AccountType.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                return new Account(string, str, string2, accountTypeValueOf, string4, str2, string5 != null ? AccountStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readString(responseFieldArr[31]), responseReader.readString(responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readInt(responseFieldArr[34]), responseReader.readBoolean(responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readList(responseFieldArr[39], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readBoolean(responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readList(responseFieldArr[45], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[46], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readList(responseFieldArr[51], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[52]), responseReader.readString(responseFieldArr[53]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[54]), responseReader.readDouble(responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[57]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[58]), responseReader.readString(responseFieldArr[59]), responseReader.readInt(responseFieldArr[60]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("accountName", "accountName", null, false, Collections.emptyList()), ResponseField.forString("accountType", "accountType", null, false, Collections.emptyList()), ResponseField.forString("deviceKey", "deviceKey", null, true, Collections.emptyList()), ResponseField.forCustomType("deviceKeyLastUpdated", "deviceKeyLastUpdated", null, true, customType2, Collections.emptyList()), ResponseField.forString("accountStatus", "accountStatus", null, true, Collections.emptyList()), ResponseField.forString("businessLogoUrl", "businessLogoUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forString("dateFormat", "dateFormat", null, true, Collections.emptyList()), ResponseField.forString("dateTimeViewStyle", "dateTimeViewStyle", null, true, Collections.emptyList()), ResponseField.forString("defaultCurrency", "defaultCurrency", null, true, Collections.emptyList()), ResponseField.forString("denomination", "denomination", null, true, Collections.emptyList()), ResponseField.forString("industry", "industry", null, true, Collections.emptyList()), ResponseField.forString("nameOfBusiness", "nameOfBusiness", null, true, Collections.emptyList()), ResponseField.forList("productOrService", "productOrService", null, true, Collections.emptyList()), ResponseField.forString("timeFormat", "timeFormat", null, true, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, RemoteConfigConstants.RequestFieldKey.TIME_ZONE, null, true, Collections.emptyList()), ResponseField.forString("plan", "plan", null, true, Collections.emptyList()), ResponseField.forCustomType("paidUpTo", "paidUpTo", null, true, customType2, Collections.emptyList()), ResponseField.forInt("seats", "seats", null, true, Collections.emptyList()), ResponseField.forInt("freeSeats", "freeSeats", null, true, Collections.emptyList()), ResponseField.forInt("currentTotalUsers", "currentTotalUsers", null, true, Collections.emptyList()), ResponseField.forInt("currentActiveUsers", "currentActiveUsers", null, true, Collections.emptyList()), ResponseField.forInt("extraActiveUsers", "extraActiveUsers", null, true, Collections.emptyList()), ResponseField.forInt("pricePerSeat", "pricePerSeat", null, true, Collections.emptyList()), ResponseField.forBoolean("allowAddingSeat", "allowAddingSeat", null, true, Collections.emptyList()), ResponseField.forCustomType("allowAddingSeatTill", "allowAddingSeatTill", null, true, customType2, Collections.emptyList()), ResponseField.forInt("seatReductionMarkedForNextCycle", "seatReductionMarkedForNextCycle", null, true, Collections.emptyList()), ResponseField.forString("billingCurrency", "billingCurrency", null, true, Collections.emptyList()), ResponseField.forCustomType("billingEmail", "billingEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forString("taxId", "taxId", null, true, Collections.emptyList()), ResponseField.forString("taxIdType", "taxIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("trialAccountEndDate", "trialAccountEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forInt("trialExtensionTimes", "trialExtensionTimes", null, true, Collections.emptyList()), ResponseField.forBoolean("eligibleForExtension", "eligibleForExtension", null, true, Collections.emptyList()), ResponseField.forCustomType("paidForTillDate", "paidForTillDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("website", "website", null, true, CustomType.AWSURL, Collections.emptyList()), ResponseField.forList("permissions", "permissions", null, true, Collections.emptyList()), ResponseField.forBoolean("enableCustomCharts", "enableCustomCharts", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealMode", "dealMode", null, true, Collections.emptyList()), ResponseField.forString("openAiApiKey", "openAiApiKey", null, true, Collections.emptyList()), ResponseField.forList("salesmaxSalesContacts", "salesmaxSalesContacts", null, true, Collections.emptyList()), ResponseField.forList("salesmaxSupportContacts", "salesmaxSupportContacts", null, true, Collections.emptyList()), ResponseField.forCustomType("chatWidgetConfig", "chatWidgetConfig", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("onboardingStatus", "onboardingStatus", null, true, Collections.emptyList()), ResponseField.forString("integrationNeeded", "integrationNeeded", null, true, Collections.emptyList()), ResponseField.forCustomType("matchingDealId", "matchingDealId", null, true, customType, Collections.emptyList()), ResponseField.forList("relatedAccountIds", "relatedAccountIds", null, true, Collections.emptyList()), ResponseField.forCustomType("lastChurnDate", "lastChurnDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastChurnReason", "lastChurnReason", null, true, Collections.emptyList()), ResponseField.forCustomType("possibleReactivationDate", "possibleReactivationDate", null, true, customType2, Collections.emptyList()), ResponseField.forDouble("locationPeriodicFrequency", "locationPeriodicFrequency", null, true, Collections.emptyList()), ResponseField.forCustomType("lastPaymentDataId", "lastPaymentDataId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastPaymentDataCreatedAt", "lastPaymentDataCreatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextRenewalDateIfPaid", "nextRenewalDateIfPaid", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forInt("partPaymentAmountIfAny", "partPaymentAmountIfAny", null, true, Collections.emptyList())};
        }

        public Account(String str, String str2, String str3, AccountType accountType, String str4, String str5, AccountStatus accountStatus, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<String> list, String str14, String str15, String str16, String str17, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, String str18, Integer num7, String str19, String str20, String str21, String str22, String str23, Integer num8, Boolean bool2, String str24, String str25, String str26, List<String> list2, Boolean bool3, String str27, String str28, String str29, String str30, List<String> list3, List<String> list4, String str31, String str32, String str33, String str34, List<String> list5, String str35, String str36, String str37, Double d, String str38, String str39, String str40, String str41, Integer num9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountName = (String) Utils.checkNotNull(str3, "accountName == null");
            this.accountType = (AccountType) Utils.checkNotNull(accountType, "accountType == null");
            this.deviceKey = str4;
            this.deviceKeyLastUpdated = str5;
            this.accountStatus = accountStatus;
            this.businessLogoUrl = str6;
            this.createdById = str7;
            this.dateFormat = str8;
            this.dateTimeViewStyle = str9;
            this.defaultCurrency = str10;
            this.denomination = str11;
            this.industry = str12;
            this.nameOfBusiness = str13;
            this.productOrService = list;
            this.timeFormat = str14;
            this.timeZone = str15;
            this.plan = str16;
            this.paidUpTo = str17;
            this.seats = num;
            this.freeSeats = num2;
            this.currentTotalUsers = num3;
            this.currentActiveUsers = num4;
            this.extraActiveUsers = num5;
            this.pricePerSeat = num6;
            this.allowAddingSeat = bool;
            this.allowAddingSeatTill = str18;
            this.seatReductionMarkedForNextCycle = num7;
            this.billingCurrency = str19;
            this.billingEmail = str20;
            this.taxId = str21;
            this.taxIdType = str22;
            this.trialAccountEndDate = str23;
            this.trialExtensionTimes = num8;
            this.eligibleForExtension = bool2;
            this.paidForTillDate = str24;
            this.updatedById = str25;
            this.website = str26;
            this.permissions = list2;
            this.enableCustomCharts = bool3;
            this.createdAt = str27;
            this.updatedAt = str28;
            this.dealMode = str29;
            this.openAiApiKey = str30;
            this.salesmaxSalesContacts = list3;
            this.salesmaxSupportContacts = list4;
            this.chatWidgetConfig = str31;
            this.onboardingStatus = str32;
            this.integrationNeeded = str33;
            this.matchingDealId = str34;
            this.relatedAccountIds = list5;
            this.lastChurnDate = str35;
            this.lastChurnReason = str36;
            this.possibleReactivationDate = str37;
            this.locationPeriodicFrequency = d;
            this.lastPaymentDataId = str38;
            this.lastPaymentDataCreatedAt = str39;
            this.nextRenewalDateIfPaid = str40;
            this.lastPaymentStatus = str41;
            this.partPaymentAmountIfAny = num9;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountName() {
            return this.accountName;
        }

        public AccountStatus accountStatus() {
            return this.accountStatus;
        }

        public AccountType accountType() {
            return this.accountType;
        }

        public Boolean allowAddingSeat() {
            return this.allowAddingSeat;
        }

        public String allowAddingSeatTill() {
            return this.allowAddingSeatTill;
        }

        public String billingCurrency() {
            return this.billingCurrency;
        }

        public String billingEmail() {
            return this.billingEmail;
        }

        public String businessLogoUrl() {
            return this.businessLogoUrl;
        }

        public String chatWidgetConfig() {
            return this.chatWidgetConfig;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public Integer currentActiveUsers() {
            return this.currentActiveUsers;
        }

        public Integer currentTotalUsers() {
            return this.currentTotalUsers;
        }

        public String dateFormat() {
            return this.dateFormat;
        }

        public String dateTimeViewStyle() {
            return this.dateTimeViewStyle;
        }

        public String dealMode() {
            return this.dealMode;
        }

        public String defaultCurrency() {
            return this.defaultCurrency;
        }

        public String denomination() {
            return this.denomination;
        }

        public String deviceKey() {
            return this.deviceKey;
        }

        public String deviceKeyLastUpdated() {
            return this.deviceKeyLastUpdated;
        }

        public Boolean eligibleForExtension() {
            return this.eligibleForExtension;
        }

        public Boolean enableCustomCharts() {
            return this.enableCustomCharts;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            AccountStatus accountStatus;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            List<String> list;
            String str11;
            String str12;
            String str13;
            String str14;
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Boolean bool;
            String str15;
            Integer num7;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            Integer num8;
            Boolean bool2;
            String str21;
            String str22;
            String str23;
            List<String> list2;
            Boolean bool3;
            String str24;
            String str25;
            String str26;
            String str27;
            List<String> list3;
            List<String> list4;
            String str28;
            String str29;
            String str30;
            String str31;
            List<String> list5;
            String str32;
            String str33;
            String str34;
            Double d;
            String str35;
            String str36;
            String str37;
            String str38;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Account)) {
                return false;
            }
            Account account = (Account) obj;
            if (this.__typename.equals(account.__typename) && this.id.equals(account.id) && this.accountName.equals(account.accountName) && this.accountType.equals(account.accountType) && ((str = this.deviceKey) != null ? str.equals(account.deviceKey) : account.deviceKey == null) && ((str2 = this.deviceKeyLastUpdated) != null ? str2.equals(account.deviceKeyLastUpdated) : account.deviceKeyLastUpdated == null) && ((accountStatus = this.accountStatus) != null ? accountStatus.equals(account.accountStatus) : account.accountStatus == null) && ((str3 = this.businessLogoUrl) != null ? str3.equals(account.businessLogoUrl) : account.businessLogoUrl == null) && ((str4 = this.createdById) != null ? str4.equals(account.createdById) : account.createdById == null) && ((str5 = this.dateFormat) != null ? str5.equals(account.dateFormat) : account.dateFormat == null) && ((str6 = this.dateTimeViewStyle) != null ? str6.equals(account.dateTimeViewStyle) : account.dateTimeViewStyle == null) && ((str7 = this.defaultCurrency) != null ? str7.equals(account.defaultCurrency) : account.defaultCurrency == null) && ((str8 = this.denomination) != null ? str8.equals(account.denomination) : account.denomination == null) && ((str9 = this.industry) != null ? str9.equals(account.industry) : account.industry == null) && ((str10 = this.nameOfBusiness) != null ? str10.equals(account.nameOfBusiness) : account.nameOfBusiness == null) && ((list = this.productOrService) != null ? list.equals(account.productOrService) : account.productOrService == null) && ((str11 = this.timeFormat) != null ? str11.equals(account.timeFormat) : account.timeFormat == null) && ((str12 = this.timeZone) != null ? str12.equals(account.timeZone) : account.timeZone == null) && ((str13 = this.plan) != null ? str13.equals(account.plan) : account.plan == null) && ((str14 = this.paidUpTo) != null ? str14.equals(account.paidUpTo) : account.paidUpTo == null) && ((num = this.seats) != null ? num.equals(account.seats) : account.seats == null) && ((num2 = this.freeSeats) != null ? num2.equals(account.freeSeats) : account.freeSeats == null) && ((num3 = this.currentTotalUsers) != null ? num3.equals(account.currentTotalUsers) : account.currentTotalUsers == null) && ((num4 = this.currentActiveUsers) != null ? num4.equals(account.currentActiveUsers) : account.currentActiveUsers == null) && ((num5 = this.extraActiveUsers) != null ? num5.equals(account.extraActiveUsers) : account.extraActiveUsers == null) && ((num6 = this.pricePerSeat) != null ? num6.equals(account.pricePerSeat) : account.pricePerSeat == null) && ((bool = this.allowAddingSeat) != null ? bool.equals(account.allowAddingSeat) : account.allowAddingSeat == null) && ((str15 = this.allowAddingSeatTill) != null ? str15.equals(account.allowAddingSeatTill) : account.allowAddingSeatTill == null) && ((num7 = this.seatReductionMarkedForNextCycle) != null ? num7.equals(account.seatReductionMarkedForNextCycle) : account.seatReductionMarkedForNextCycle == null) && ((str16 = this.billingCurrency) != null ? str16.equals(account.billingCurrency) : account.billingCurrency == null) && ((str17 = this.billingEmail) != null ? str17.equals(account.billingEmail) : account.billingEmail == null) && ((str18 = this.taxId) != null ? str18.equals(account.taxId) : account.taxId == null) && ((str19 = this.taxIdType) != null ? str19.equals(account.taxIdType) : account.taxIdType == null) && ((str20 = this.trialAccountEndDate) != null ? str20.equals(account.trialAccountEndDate) : account.trialAccountEndDate == null) && ((num8 = this.trialExtensionTimes) != null ? num8.equals(account.trialExtensionTimes) : account.trialExtensionTimes == null) && ((bool2 = this.eligibleForExtension) != null ? bool2.equals(account.eligibleForExtension) : account.eligibleForExtension == null) && ((str21 = this.paidForTillDate) != null ? str21.equals(account.paidForTillDate) : account.paidForTillDate == null) && ((str22 = this.updatedById) != null ? str22.equals(account.updatedById) : account.updatedById == null) && ((str23 = this.website) != null ? str23.equals(account.website) : account.website == null) && ((list2 = this.permissions) != null ? list2.equals(account.permissions) : account.permissions == null) && ((bool3 = this.enableCustomCharts) != null ? bool3.equals(account.enableCustomCharts) : account.enableCustomCharts == null) && ((str24 = this.createdAt) != null ? str24.equals(account.createdAt) : account.createdAt == null) && ((str25 = this.updatedAt) != null ? str25.equals(account.updatedAt) : account.updatedAt == null) && ((str26 = this.dealMode) != null ? str26.equals(account.dealMode) : account.dealMode == null) && ((str27 = this.openAiApiKey) != null ? str27.equals(account.openAiApiKey) : account.openAiApiKey == null) && ((list3 = this.salesmaxSalesContacts) != null ? list3.equals(account.salesmaxSalesContacts) : account.salesmaxSalesContacts == null) && ((list4 = this.salesmaxSupportContacts) != null ? list4.equals(account.salesmaxSupportContacts) : account.salesmaxSupportContacts == null) && ((str28 = this.chatWidgetConfig) != null ? str28.equals(account.chatWidgetConfig) : account.chatWidgetConfig == null) && ((str29 = this.onboardingStatus) != null ? str29.equals(account.onboardingStatus) : account.onboardingStatus == null) && ((str30 = this.integrationNeeded) != null ? str30.equals(account.integrationNeeded) : account.integrationNeeded == null) && ((str31 = this.matchingDealId) != null ? str31.equals(account.matchingDealId) : account.matchingDealId == null) && ((list5 = this.relatedAccountIds) != null ? list5.equals(account.relatedAccountIds) : account.relatedAccountIds == null) && ((str32 = this.lastChurnDate) != null ? str32.equals(account.lastChurnDate) : account.lastChurnDate == null) && ((str33 = this.lastChurnReason) != null ? str33.equals(account.lastChurnReason) : account.lastChurnReason == null) && ((str34 = this.possibleReactivationDate) != null ? str34.equals(account.possibleReactivationDate) : account.possibleReactivationDate == null) && ((d = this.locationPeriodicFrequency) != null ? d.equals(account.locationPeriodicFrequency) : account.locationPeriodicFrequency == null) && ((str35 = this.lastPaymentDataId) != null ? str35.equals(account.lastPaymentDataId) : account.lastPaymentDataId == null) && ((str36 = this.lastPaymentDataCreatedAt) != null ? str36.equals(account.lastPaymentDataCreatedAt) : account.lastPaymentDataCreatedAt == null) && ((str37 = this.nextRenewalDateIfPaid) != null ? str37.equals(account.nextRenewalDateIfPaid) : account.nextRenewalDateIfPaid == null) && ((str38 = this.lastPaymentStatus) != null ? str38.equals(account.lastPaymentStatus) : account.lastPaymentStatus == null)) {
                Integer num9 = this.partPaymentAmountIfAny;
                Integer num10 = account.partPaymentAmountIfAny;
                if (num9 == null) {
                    if (num10 == null) {
                        return true;
                    }
                } else if (num9.equals(num10)) {
                    return true;
                }
            }
            return false;
        }

        public Integer extraActiveUsers() {
            return this.extraActiveUsers;
        }

        public Integer freeSeats() {
            return this.freeSeats;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountName.hashCode()) * 1000003) ^ this.accountType.hashCode()) * 1000003;
                String str = this.deviceKey;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.deviceKeyLastUpdated;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                AccountStatus accountStatus = this.accountStatus;
                int iHashCode4 = (iHashCode3 ^ (accountStatus == null ? 0 : accountStatus.hashCode())) * 1000003;
                String str3 = this.businessLogoUrl;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdById;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.dateFormat;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.dateTimeViewStyle;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.defaultCurrency;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.denomination;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.industry;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.nameOfBusiness;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                List<String> list = this.productOrService;
                int iHashCode13 = (iHashCode12 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str11 = this.timeFormat;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.timeZone;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.plan;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.paidUpTo;
                int iHashCode17 = (iHashCode16 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                Integer num = this.seats;
                int iHashCode18 = (iHashCode17 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.freeSeats;
                int iHashCode19 = (iHashCode18 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.currentTotalUsers;
                int iHashCode20 = (iHashCode19 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.currentActiveUsers;
                int iHashCode21 = (iHashCode20 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.extraActiveUsers;
                int iHashCode22 = (iHashCode21 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.pricePerSeat;
                int iHashCode23 = (iHashCode22 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Boolean bool = this.allowAddingSeat;
                int iHashCode24 = (iHashCode23 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str15 = this.allowAddingSeatTill;
                int iHashCode25 = (iHashCode24 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                Integer num7 = this.seatReductionMarkedForNextCycle;
                int iHashCode26 = (iHashCode25 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                String str16 = this.billingCurrency;
                int iHashCode27 = (iHashCode26 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.billingEmail;
                int iHashCode28 = (iHashCode27 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.taxId;
                int iHashCode29 = (iHashCode28 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.taxIdType;
                int iHashCode30 = (iHashCode29 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.trialAccountEndDate;
                int iHashCode31 = (iHashCode30 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                Integer num8 = this.trialExtensionTimes;
                int iHashCode32 = (iHashCode31 ^ (num8 == null ? 0 : num8.hashCode())) * 1000003;
                Boolean bool2 = this.eligibleForExtension;
                int iHashCode33 = (iHashCode32 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str21 = this.paidForTillDate;
                int iHashCode34 = (iHashCode33 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.updatedById;
                int iHashCode35 = (iHashCode34 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.website;
                int iHashCode36 = (iHashCode35 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                List<String> list2 = this.permissions;
                int iHashCode37 = (iHashCode36 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                Boolean bool3 = this.enableCustomCharts;
                int iHashCode38 = (iHashCode37 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                String str24 = this.createdAt;
                int iHashCode39 = (iHashCode38 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.updatedAt;
                int iHashCode40 = (iHashCode39 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.dealMode;
                int iHashCode41 = (iHashCode40 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.openAiApiKey;
                int iHashCode42 = (iHashCode41 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                List<String> list3 = this.salesmaxSalesContacts;
                int iHashCode43 = (iHashCode42 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                List<String> list4 = this.salesmaxSupportContacts;
                int iHashCode44 = (iHashCode43 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                String str28 = this.chatWidgetConfig;
                int iHashCode45 = (iHashCode44 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.onboardingStatus;
                int iHashCode46 = (iHashCode45 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.integrationNeeded;
                int iHashCode47 = (iHashCode46 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                String str31 = this.matchingDealId;
                int iHashCode48 = (iHashCode47 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                List<String> list5 = this.relatedAccountIds;
                int iHashCode49 = (iHashCode48 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
                String str32 = this.lastChurnDate;
                int iHashCode50 = (iHashCode49 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.lastChurnReason;
                int iHashCode51 = (iHashCode50 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                String str34 = this.possibleReactivationDate;
                int iHashCode52 = (iHashCode51 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                Double d = this.locationPeriodicFrequency;
                int iHashCode53 = (iHashCode52 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                String str35 = this.lastPaymentDataId;
                int iHashCode54 = (iHashCode53 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.lastPaymentDataCreatedAt;
                int iHashCode55 = (iHashCode54 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.nextRenewalDateIfPaid;
                int iHashCode56 = (iHashCode55 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                String str38 = this.lastPaymentStatus;
                int iHashCode57 = (iHashCode56 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                Integer num9 = this.partPaymentAmountIfAny;
                this.$hashCode = iHashCode57 ^ (num9 != null ? num9.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String industry() {
            return this.industry;
        }

        public String integrationNeeded() {
            return this.integrationNeeded;
        }

        public String lastChurnDate() {
            return this.lastChurnDate;
        }

        public String lastChurnReason() {
            return this.lastChurnReason;
        }

        public String lastPaymentDataCreatedAt() {
            return this.lastPaymentDataCreatedAt;
        }

        public String lastPaymentDataId() {
            return this.lastPaymentDataId;
        }

        public String lastPaymentStatus() {
            return this.lastPaymentStatus;
        }

        public Double locationPeriodicFrequency() {
            return this.locationPeriodicFrequency;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Account.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Account.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Account.this.id);
                    responseWriter.writeString(responseFieldArr[2], Account.this.accountName);
                    responseWriter.writeString(responseFieldArr[3], Account.this.accountType.name());
                    responseWriter.writeString(responseFieldArr[4], Account.this.deviceKey);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Account.this.deviceKeyLastUpdated);
                    ResponseField responseField = responseFieldArr[6];
                    AccountStatus accountStatus = Account.this.accountStatus;
                    responseWriter.writeString(responseField, accountStatus != null ? accountStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[7], Account.this.businessLogoUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Account.this.createdById);
                    responseWriter.writeString(responseFieldArr[9], Account.this.dateFormat);
                    responseWriter.writeString(responseFieldArr[10], Account.this.dateTimeViewStyle);
                    responseWriter.writeString(responseFieldArr[11], Account.this.defaultCurrency);
                    responseWriter.writeString(responseFieldArr[12], Account.this.denomination);
                    responseWriter.writeString(responseFieldArr[13], Account.this.industry);
                    responseWriter.writeString(responseFieldArr[14], Account.this.nameOfBusiness);
                    responseWriter.writeList(responseFieldArr[15], Account.this.productOrService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[16], Account.this.timeFormat);
                    responseWriter.writeString(responseFieldArr[17], Account.this.timeZone);
                    responseWriter.writeString(responseFieldArr[18], Account.this.plan);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Account.this.paidUpTo);
                    responseWriter.writeInt(responseFieldArr[20], Account.this.seats);
                    responseWriter.writeInt(responseFieldArr[21], Account.this.freeSeats);
                    responseWriter.writeInt(responseFieldArr[22], Account.this.currentTotalUsers);
                    responseWriter.writeInt(responseFieldArr[23], Account.this.currentActiveUsers);
                    responseWriter.writeInt(responseFieldArr[24], Account.this.extraActiveUsers);
                    responseWriter.writeInt(responseFieldArr[25], Account.this.pricePerSeat);
                    responseWriter.writeBoolean(responseFieldArr[26], Account.this.allowAddingSeat);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], Account.this.allowAddingSeatTill);
                    responseWriter.writeInt(responseFieldArr[28], Account.this.seatReductionMarkedForNextCycle);
                    responseWriter.writeString(responseFieldArr[29], Account.this.billingCurrency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], Account.this.billingEmail);
                    responseWriter.writeString(responseFieldArr[31], Account.this.taxId);
                    responseWriter.writeString(responseFieldArr[32], Account.this.taxIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], Account.this.trialAccountEndDate);
                    responseWriter.writeInt(responseFieldArr[34], Account.this.trialExtensionTimes);
                    responseWriter.writeBoolean(responseFieldArr[35], Account.this.eligibleForExtension);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[36], Account.this.paidForTillDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], Account.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], Account.this.website);
                    responseWriter.writeList(responseFieldArr[39], Account.this.permissions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeBoolean(responseFieldArr[40], Account.this.enableCustomCharts);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[41], Account.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], Account.this.updatedAt);
                    responseWriter.writeString(responseFieldArr[43], Account.this.dealMode);
                    responseWriter.writeString(responseFieldArr[44], Account.this.openAiApiKey);
                    responseWriter.writeList(responseFieldArr[45], Account.this.salesmaxSalesContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[46], Account.this.salesmaxSupportContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], Account.this.chatWidgetConfig);
                    responseWriter.writeString(responseFieldArr[48], Account.this.onboardingStatus);
                    responseWriter.writeString(responseFieldArr[49], Account.this.integrationNeeded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], Account.this.matchingDealId);
                    responseWriter.writeList(responseFieldArr[51], Account.this.relatedAccountIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Account.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], Account.this.lastChurnDate);
                    responseWriter.writeString(responseFieldArr[53], Account.this.lastChurnReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], Account.this.possibleReactivationDate);
                    responseWriter.writeDouble(responseFieldArr[55], Account.this.locationPeriodicFrequency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], Account.this.lastPaymentDataId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[57], Account.this.lastPaymentDataCreatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], Account.this.nextRenewalDateIfPaid);
                    responseWriter.writeString(responseFieldArr[59], Account.this.lastPaymentStatus);
                    responseWriter.writeInt(responseFieldArr[60], Account.this.partPaymentAmountIfAny);
                }
            };
        }

        public String matchingDealId() {
            return this.matchingDealId;
        }

        public String nameOfBusiness() {
            return this.nameOfBusiness;
        }

        public String nextRenewalDateIfPaid() {
            return this.nextRenewalDateIfPaid;
        }

        public String onboardingStatus() {
            return this.onboardingStatus;
        }

        public String openAiApiKey() {
            return this.openAiApiKey;
        }

        public String paidForTillDate() {
            return this.paidForTillDate;
        }

        public String paidUpTo() {
            return this.paidUpTo;
        }

        public Integer partPaymentAmountIfAny() {
            return this.partPaymentAmountIfAny;
        }

        public List<String> permissions() {
            return this.permissions;
        }

        public String plan() {
            return this.plan;
        }

        public String possibleReactivationDate() {
            return this.possibleReactivationDate;
        }

        public Integer pricePerSeat() {
            return this.pricePerSeat;
        }

        public List<String> productOrService() {
            return this.productOrService;
        }

        public List<String> relatedAccountIds() {
            return this.relatedAccountIds;
        }

        public List<String> salesmaxSalesContacts() {
            return this.salesmaxSalesContacts;
        }

        public List<String> salesmaxSupportContacts() {
            return this.salesmaxSupportContacts;
        }

        public Integer seatReductionMarkedForNextCycle() {
            return this.seatReductionMarkedForNextCycle;
        }

        public Integer seats() {
            return this.seats;
        }

        public String taxId() {
            return this.taxId;
        }

        public String taxIdType() {
            return this.taxIdType;
        }

        public String timeFormat() {
            return this.timeFormat;
        }

        public String timeZone() {
            return this.timeZone;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Account{__typename=" + this.__typename + ", id=" + this.id + ", accountName=" + this.accountName + ", accountType=" + this.accountType + ", deviceKey=" + this.deviceKey + ", deviceKeyLastUpdated=" + this.deviceKeyLastUpdated + ", accountStatus=" + this.accountStatus + ", businessLogoUrl=" + this.businessLogoUrl + ", createdById=" + this.createdById + ", dateFormat=" + this.dateFormat + ", dateTimeViewStyle=" + this.dateTimeViewStyle + ", defaultCurrency=" + this.defaultCurrency + ", denomination=" + this.denomination + ", industry=" + this.industry + ", nameOfBusiness=" + this.nameOfBusiness + ", productOrService=" + this.productOrService + ", timeFormat=" + this.timeFormat + ", timeZone=" + this.timeZone + ", plan=" + this.plan + ", paidUpTo=" + this.paidUpTo + ", seats=" + this.seats + ", freeSeats=" + this.freeSeats + ", currentTotalUsers=" + this.currentTotalUsers + ", currentActiveUsers=" + this.currentActiveUsers + ", extraActiveUsers=" + this.extraActiveUsers + ", pricePerSeat=" + this.pricePerSeat + ", allowAddingSeat=" + this.allowAddingSeat + ", allowAddingSeatTill=" + this.allowAddingSeatTill + ", seatReductionMarkedForNextCycle=" + this.seatReductionMarkedForNextCycle + ", billingCurrency=" + this.billingCurrency + ", billingEmail=" + this.billingEmail + ", taxId=" + this.taxId + ", taxIdType=" + this.taxIdType + ", trialAccountEndDate=" + this.trialAccountEndDate + ", trialExtensionTimes=" + this.trialExtensionTimes + ", eligibleForExtension=" + this.eligibleForExtension + ", paidForTillDate=" + this.paidForTillDate + ", updatedById=" + this.updatedById + ", website=" + this.website + ", permissions=" + this.permissions + ", enableCustomCharts=" + this.enableCustomCharts + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", dealMode=" + this.dealMode + ", openAiApiKey=" + this.openAiApiKey + ", salesmaxSalesContacts=" + this.salesmaxSalesContacts + ", salesmaxSupportContacts=" + this.salesmaxSupportContacts + ", chatWidgetConfig=" + this.chatWidgetConfig + ", onboardingStatus=" + this.onboardingStatus + ", integrationNeeded=" + this.integrationNeeded + ", matchingDealId=" + this.matchingDealId + ", relatedAccountIds=" + this.relatedAccountIds + ", lastChurnDate=" + this.lastChurnDate + ", lastChurnReason=" + this.lastChurnReason + ", possibleReactivationDate=" + this.possibleReactivationDate + ", locationPeriodicFrequency=" + this.locationPeriodicFrequency + ", lastPaymentDataId=" + this.lastPaymentDataId + ", lastPaymentDataCreatedAt=" + this.lastPaymentDataCreatedAt + ", nextRenewalDateIfPaid=" + this.nextRenewalDateIfPaid + ", lastPaymentStatus=" + this.lastPaymentStatus + ", partPaymentAmountIfAny=" + this.partPaymentAmountIfAny + "}";
            }
            return this.$toString;
        }

        public String trialAccountEndDate() {
            return this.trialAccountEndDate;
        }

        public Integer trialExtensionTimes() {
            return this.trialExtensionTimes;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String website() {
            return this.website;
        }
    }

    public static final class Builder {
        private ModelTeamMemberConditionInput condition;
        private UpdateTeamMemberInput input;

        public UpdateTeamMemberMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateTeamMemberMutation(this.input, this.condition);
        }

        public Builder condition(ModelTeamMemberConditionInput modelTeamMemberConditionInput) {
            this.condition = modelTeamMemberConditionInput;
            return this;
        }

        public Builder input(UpdateTeamMemberInput updateTeamMemberInput) {
            this.input = updateTeamMemberInput;
            return this;
        }
    }

    public static class CreatedBy {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final AddedSourceType addedSourceType;
        final String androidVersionRelease;
        final String appVersion;
        final String createdAt;
        final String deviceManufacturer;
        final String deviceModel;
        final String id;
        final String lastSelectedAccountApp;
        final String lastSelectedAccountWeb;
        final String name;
        final String profilePictureUrl;
        final String registeredEmail;
        final Boolean registeredEmailVerified;
        final String registeredNumber;
        final Boolean registeredNumberVerified;
        final String secondaryNumber;
        final Boolean secondaryNumberVerified;
        final String updatedAt;
        final UserRegistrationStatus userRegistrationStatus;

        public static final class Mapper implements ResponseFieldMapper<CreatedBy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreatedBy map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreatedBy.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                AddedSourceType addedSourceTypeValueOf = string2 != null ? AddedSourceType.valueOf(string2) : null;
                String string3 = responseReader.readString(responseFieldArr[3]);
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new CreatedBy(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public CreatedBy(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.addedSourceType = (AddedSourceType) Utils.checkNotNull(addedSourceType, "addedSourceType == null");
            this.name = (String) Utils.checkNotNull(str3, "name == null");
            this.profilePictureUrl = str4;
            this.registeredEmail = str5;
            this.registeredEmailVerified = bool;
            this.registeredNumber = (String) Utils.checkNotNull(str6, "registeredNumber == null");
            this.registeredNumberVerified = bool2;
            this.secondaryNumber = str7;
            this.secondaryNumberVerified = bool3;
            this.userRegistrationStatus = (UserRegistrationStatus) Utils.checkNotNull(userRegistrationStatus, "userRegistrationStatus == null");
            this.lastSelectedAccountWeb = str8;
            this.lastSelectedAccountApp = str9;
            this.appVersion = str10;
            this.deviceModel = str11;
            this.deviceManufacturer = str12;
            this.androidVersionRelease = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public AddedSourceType addedSourceType() {
            return this.addedSourceType;
        }

        public String androidVersionRelease() {
            return this.androidVersionRelease;
        }

        public String appVersion() {
            return this.appVersion;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceManufacturer() {
            return this.deviceManufacturer;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            String str3;
            Boolean bool3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreatedBy)) {
                return false;
            }
            CreatedBy createdBy = (CreatedBy) obj;
            if (this.__typename.equals(createdBy.__typename) && this.id.equals(createdBy.id) && this.addedSourceType.equals(createdBy.addedSourceType) && this.name.equals(createdBy.name) && ((str = this.profilePictureUrl) != null ? str.equals(createdBy.profilePictureUrl) : createdBy.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(createdBy.registeredEmail) : createdBy.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(createdBy.registeredEmailVerified) : createdBy.registeredEmailVerified == null) && this.registeredNumber.equals(createdBy.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(createdBy.registeredNumberVerified) : createdBy.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(createdBy.secondaryNumber) : createdBy.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(createdBy.secondaryNumberVerified) : createdBy.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(createdBy.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(createdBy.lastSelectedAccountWeb) : createdBy.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(createdBy.lastSelectedAccountApp) : createdBy.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(createdBy.appVersion) : createdBy.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(createdBy.deviceModel) : createdBy.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(createdBy.deviceManufacturer) : createdBy.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(createdBy.androidVersionRelease) : createdBy.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(createdBy.createdAt) : createdBy.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = createdBy.updatedAt;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.addedSourceType.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.profilePictureUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.registeredEmail;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.registeredEmailVerified;
                int iHashCode4 = (((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.registeredNumber.hashCode()) * 1000003;
                Boolean bool2 = this.registeredNumberVerified;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str3 = this.secondaryNumber;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool3 = this.secondaryNumberVerified;
                int iHashCode7 = (((iHashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.userRegistrationStatus.hashCode()) * 1000003;
                String str4 = this.lastSelectedAccountWeb;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lastSelectedAccountApp;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.appVersion;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.deviceModel;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.deviceManufacturer;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.androidVersionRelease;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedAt;
                this.$hashCode = iHashCode14 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastSelectedAccountApp() {
            return this.lastSelectedAccountApp;
        }

        public String lastSelectedAccountWeb() {
            return this.lastSelectedAccountWeb;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.CreatedBy.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreatedBy.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreatedBy.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreatedBy.this.id);
                    responseWriter.writeString(responseFieldArr[2], CreatedBy.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], CreatedBy.this.name);
                    responseWriter.writeString(responseFieldArr[4], CreatedBy.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], CreatedBy.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], CreatedBy.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CreatedBy.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], CreatedBy.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CreatedBy.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], CreatedBy.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], CreatedBy.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CreatedBy.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], CreatedBy.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], CreatedBy.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], CreatedBy.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], CreatedBy.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], CreatedBy.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], CreatedBy.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], CreatedBy.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String profilePictureUrl() {
            return this.profilePictureUrl;
        }

        public String registeredEmail() {
            return this.registeredEmail;
        }

        public Boolean registeredEmailVerified() {
            return this.registeredEmailVerified;
        }

        public String registeredNumber() {
            return this.registeredNumber;
        }

        public Boolean registeredNumberVerified() {
            return this.registeredNumberVerified;
        }

        public String secondaryNumber() {
            return this.secondaryNumber;
        }

        public Boolean secondaryNumberVerified() {
            return this.secondaryNumberVerified;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreatedBy{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateTeamMember", "updateTeamMember", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateTeamMember updateTeamMember;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateTeamMember.Mapper updateTeamMemberFieldMapper = new UpdateTeamMember.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateTeamMember) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateTeamMember>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateTeamMember read(ResponseReader responseReader2) {
                        return Mapper.this.updateTeamMemberFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateTeamMember updateTeamMember) {
            this.updateTeamMember = updateTeamMember;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateTeamMember updateTeamMember = this.updateTeamMember;
            UpdateTeamMember updateTeamMember2 = ((Data) obj).updateTeamMember;
            return updateTeamMember == null ? updateTeamMember2 == null : updateTeamMember.equals(updateTeamMember2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateTeamMember updateTeamMember = this.updateTeamMember;
                this.$hashCode = (updateTeamMember == null ? 0 : updateTeamMember.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateTeamMember updateTeamMember = Data.this.updateTeamMember;
                    responseWriter.writeObject(responseField, updateTeamMember != null ? updateTeamMember.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateTeamMember=" + this.updateTeamMember + "}";
            }
            return this.$toString;
        }

        public UpdateTeamMember updateTeamMember() {
            return this.updateTeamMember;
        }
    }

    public static class MemberTeam {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String description;
        final String id;
        final String teamName;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<MemberTeam> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public MemberTeam map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = MemberTeam.$responseFields;
                return new MemberTeam(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, false, customType, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, false, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public MemberTeam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.createdById = (String) Utils.checkNotNull(str4, "createdById == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.teamName = (String) Utils.checkNotNull(str6, "teamName == null");
            this.updatedById = (String) Utils.checkNotNull(str7, "updatedById == null");
            this.createdAt = str8;
            this.updatedAt = str9;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String description() {
            return this.description;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MemberTeam)) {
                return false;
            }
            MemberTeam memberTeam = (MemberTeam) obj;
            if (this.__typename.equals(memberTeam.__typename) && this.id.equals(memberTeam.id) && this.accountId.equals(memberTeam.accountId) && this.createdById.equals(memberTeam.createdById) && this.description.equals(memberTeam.description) && this.teamName.equals(memberTeam.teamName) && this.updatedById.equals(memberTeam.updatedById) && ((str = this.createdAt) != null ? str.equals(memberTeam.createdAt) : memberTeam.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = memberTeam.updatedAt;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.createdById.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.teamName.hashCode()) * 1000003) ^ this.updatedById.hashCode()) * 1000003;
                String str = this.createdAt;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.MemberTeam.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = MemberTeam.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], MemberTeam.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], MemberTeam.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], MemberTeam.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], MemberTeam.this.createdById);
                    responseWriter.writeString(responseFieldArr[4], MemberTeam.this.description);
                    responseWriter.writeString(responseFieldArr[5], MemberTeam.this.teamName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], MemberTeam.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], MemberTeam.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], MemberTeam.this.updatedAt);
                }
            };
        }

        public String teamName() {
            return this.teamName;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MemberTeam{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", createdById=" + this.createdById + ", description=" + this.description + ", teamName=" + this.teamName + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }
    }

    public static class Team {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String description;
        final String id;
        final String teamName;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<Team> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Team map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Team.$responseFields;
                return new Team(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, false, customType, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, false, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Team(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.createdById = (String) Utils.checkNotNull(str4, "createdById == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.teamName = (String) Utils.checkNotNull(str6, "teamName == null");
            this.updatedById = (String) Utils.checkNotNull(str7, "updatedById == null");
            this.createdAt = str8;
            this.updatedAt = str9;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String description() {
            return this.description;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Team)) {
                return false;
            }
            Team team = (Team) obj;
            if (this.__typename.equals(team.__typename) && this.id.equals(team.id) && this.accountId.equals(team.accountId) && this.createdById.equals(team.createdById) && this.description.equals(team.description) && this.teamName.equals(team.teamName) && this.updatedById.equals(team.updatedById) && ((str = this.createdAt) != null ? str.equals(team.createdAt) : team.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = team.updatedAt;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.createdById.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.teamName.hashCode()) * 1000003) ^ this.updatedById.hashCode()) * 1000003;
                String str = this.createdAt;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Team.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Team.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Team.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Team.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Team.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Team.this.createdById);
                    responseWriter.writeString(responseFieldArr[4], Team.this.description);
                    responseWriter.writeString(responseFieldArr[5], Team.this.teamName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Team.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Team.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Team.this.updatedAt);
                }
            };
        }

        public String teamName() {
            return this.teamName;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Team{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", createdById=" + this.createdById + ", description=" + this.description + ", teamName=" + this.teamName + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }
    }

    public static class UpdateTeamMember {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Account account;
        final String accountId;
        final String createdAt;
        final CreatedBy createdBy;
        final String createdById;
        final String id;
        final Boolean isDefaultTeam;
        final MemberTeam memberTeam;
        final String memberTeamId;
        final TeamMemberType memberType;
        final Team team;
        final String teamId;
        final TeamRole teamRole;
        final String updatedAt;
        final UpdatedBy updatedBy;
        final String updatedById;
        final User user;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<UpdateTeamMember> {
            final Team.Mapper teamFieldMapper = new Team.Mapper();
            final MemberTeam.Mapper memberTeamFieldMapper = new MemberTeam.Mapper();
            final Account.Mapper accountFieldMapper = new Account.Mapper();
            final UpdatedBy.Mapper updatedByFieldMapper = new UpdatedBy.Mapper();
            final CreatedBy.Mapper createdByFieldMapper = new CreatedBy.Mapper();
            final User.Mapper userFieldMapper = new User.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateTeamMember map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateTeamMember.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                Team team = (Team) responseReader.readObject(responseFieldArr[3], new ResponseReader.ObjectReader<Team>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.UpdateTeamMember.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Team read(ResponseReader responseReader2) {
                        return Mapper.this.teamFieldMapper.map(responseReader2);
                    }
                });
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]);
                String string2 = responseReader.readString(responseFieldArr[5]);
                TeamRole teamRoleValueOf = string2 != null ? TeamRole.valueOf(string2) : null;
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                MemberTeam memberTeam = (MemberTeam) responseReader.readObject(responseFieldArr[10], new ResponseReader.ObjectReader<MemberTeam>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.UpdateTeamMember.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public MemberTeam read(ResponseReader responseReader2) {
                        return Mapper.this.memberTeamFieldMapper.map(responseReader2);
                    }
                });
                String string3 = responseReader.readString(responseFieldArr[11]);
                return new UpdateTeamMember(string, str, str2, team, str3, teamRoleValueOf, str4, str5, str6, str7, memberTeam, string3 != null ? TeamMemberType.valueOf(string3) : null, responseReader.readBoolean(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (Account) responseReader.readObject(responseFieldArr[15], new ResponseReader.ObjectReader<Account>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.UpdateTeamMember.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Account read(ResponseReader responseReader2) {
                        return Mapper.this.accountFieldMapper.map(responseReader2);
                    }
                }), (UpdatedBy) responseReader.readObject(responseFieldArr[16], new ResponseReader.ObjectReader<UpdatedBy>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.UpdateTeamMember.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdatedBy read(ResponseReader responseReader2) {
                        return Mapper.this.updatedByFieldMapper.map(responseReader2);
                    }
                }), (CreatedBy) responseReader.readObject(responseFieldArr[17], new ResponseReader.ObjectReader<CreatedBy>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.UpdateTeamMember.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreatedBy read(ResponseReader responseReader2) {
                        return Mapper.this.createdByFieldMapper.map(responseReader2);
                    }
                }), (User) responseReader.readObject(responseFieldArr[18], new ResponseReader.ObjectReader<User>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.UpdateTeamMember.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public User read(ResponseReader responseReader2) {
                        return Mapper.this.userFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("teamId", "teamId", null, false, customType, Collections.emptyList()), ResponseField.forObject("team", "team", null, true, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("teamRole", "teamRole", null, false, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("memberTeamId", "memberTeamId", null, true, customType, Collections.emptyList()), ResponseField.forObject("memberTeam", "memberTeam", null, true, Collections.emptyList()), ResponseField.forString("memberType", "memberType", null, false, Collections.emptyList()), ResponseField.forBoolean("isDefaultTeam", "isDefaultTeam", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("account", "account", null, true, Collections.emptyList()), ResponseField.forObject("updatedBy", "updatedBy", null, true, Collections.emptyList()), ResponseField.forObject("createdBy", "createdBy", null, true, Collections.emptyList()), ResponseField.forObject("user", "user", null, true, Collections.emptyList())};
        }

        public UpdateTeamMember(String str, String str2, String str3, Team team, String str4, TeamRole teamRole, String str5, String str6, String str7, String str8, MemberTeam memberTeam, TeamMemberType teamMemberType, Boolean bool, String str9, String str10, Account account, UpdatedBy updatedBy, CreatedBy createdBy, User user) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.teamId = (String) Utils.checkNotNull(str3, "teamId == null");
            this.team = team;
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.teamRole = (TeamRole) Utils.checkNotNull(teamRole, "teamRole == null");
            this.updatedById = (String) Utils.checkNotNull(str5, "updatedById == null");
            this.createdById = (String) Utils.checkNotNull(str6, "createdById == null");
            this.userId = (String) Utils.checkNotNull(str7, "userId == null");
            this.memberTeamId = str8;
            this.memberTeam = memberTeam;
            this.memberType = (TeamMemberType) Utils.checkNotNull(teamMemberType, "memberType == null");
            this.isDefaultTeam = bool;
            this.createdAt = str9;
            this.updatedAt = str10;
            this.account = account;
            this.updatedBy = updatedBy;
            this.createdBy = createdBy;
            this.user = user;
        }

        public String __typename() {
            return this.__typename;
        }

        public Account account() {
            return this.account;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public CreatedBy createdBy() {
            return this.createdBy;
        }

        public String createdById() {
            return this.createdById;
        }

        public boolean equals(Object obj) {
            Team team;
            String str;
            MemberTeam memberTeam;
            Boolean bool;
            String str2;
            String str3;
            Account account;
            UpdatedBy updatedBy;
            CreatedBy createdBy;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateTeamMember)) {
                return false;
            }
            UpdateTeamMember updateTeamMember = (UpdateTeamMember) obj;
            if (this.__typename.equals(updateTeamMember.__typename) && this.id.equals(updateTeamMember.id) && this.teamId.equals(updateTeamMember.teamId) && ((team = this.team) != null ? team.equals(updateTeamMember.team) : updateTeamMember.team == null) && this.accountId.equals(updateTeamMember.accountId) && this.teamRole.equals(updateTeamMember.teamRole) && this.updatedById.equals(updateTeamMember.updatedById) && this.createdById.equals(updateTeamMember.createdById) && this.userId.equals(updateTeamMember.userId) && ((str = this.memberTeamId) != null ? str.equals(updateTeamMember.memberTeamId) : updateTeamMember.memberTeamId == null) && ((memberTeam = this.memberTeam) != null ? memberTeam.equals(updateTeamMember.memberTeam) : updateTeamMember.memberTeam == null) && this.memberType.equals(updateTeamMember.memberType) && ((bool = this.isDefaultTeam) != null ? bool.equals(updateTeamMember.isDefaultTeam) : updateTeamMember.isDefaultTeam == null) && ((str2 = this.createdAt) != null ? str2.equals(updateTeamMember.createdAt) : updateTeamMember.createdAt == null) && ((str3 = this.updatedAt) != null ? str3.equals(updateTeamMember.updatedAt) : updateTeamMember.updatedAt == null) && ((account = this.account) != null ? account.equals(updateTeamMember.account) : updateTeamMember.account == null) && ((updatedBy = this.updatedBy) != null ? updatedBy.equals(updateTeamMember.updatedBy) : updateTeamMember.updatedBy == null) && ((createdBy = this.createdBy) != null ? createdBy.equals(updateTeamMember.createdBy) : updateTeamMember.createdBy == null)) {
                User user = this.user;
                User user2 = updateTeamMember.user;
                if (user == null) {
                    if (user2 == null) {
                        return true;
                    }
                } else if (user.equals(user2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.teamId.hashCode()) * 1000003;
                Team team = this.team;
                int iHashCode2 = (((((((((((iHashCode ^ (team == null ? 0 : team.hashCode())) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.teamRole.hashCode()) * 1000003) ^ this.updatedById.hashCode()) * 1000003) ^ this.createdById.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003;
                String str = this.memberTeamId;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                MemberTeam memberTeam = this.memberTeam;
                int iHashCode4 = (((iHashCode3 ^ (memberTeam == null ? 0 : memberTeam.hashCode())) * 1000003) ^ this.memberType.hashCode()) * 1000003;
                Boolean bool = this.isDefaultTeam;
                int iHashCode5 = (iHashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str2 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updatedAt;
                int iHashCode7 = (iHashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Account account = this.account;
                int iHashCode8 = (iHashCode7 ^ (account == null ? 0 : account.hashCode())) * 1000003;
                UpdatedBy updatedBy = this.updatedBy;
                int iHashCode9 = (iHashCode8 ^ (updatedBy == null ? 0 : updatedBy.hashCode())) * 1000003;
                CreatedBy createdBy = this.createdBy;
                int iHashCode10 = (iHashCode9 ^ (createdBy == null ? 0 : createdBy.hashCode())) * 1000003;
                User user = this.user;
                this.$hashCode = iHashCode10 ^ (user != null ? user.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isDefaultTeam() {
            return this.isDefaultTeam;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.UpdateTeamMember.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateTeamMember.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateTeamMember.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateTeamMember.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateTeamMember.this.teamId);
                    ResponseField responseField = responseFieldArr[3];
                    Team team = UpdateTeamMember.this.team;
                    responseWriter.writeObject(responseField, team != null ? team.marshaller() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], UpdateTeamMember.this.accountId);
                    responseWriter.writeString(responseFieldArr[5], UpdateTeamMember.this.teamRole.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateTeamMember.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateTeamMember.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateTeamMember.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateTeamMember.this.memberTeamId);
                    ResponseField responseField2 = responseFieldArr[10];
                    MemberTeam memberTeam = UpdateTeamMember.this.memberTeam;
                    responseWriter.writeObject(responseField2, memberTeam != null ? memberTeam.marshaller() : null);
                    responseWriter.writeString(responseFieldArr[11], UpdateTeamMember.this.memberType.name());
                    responseWriter.writeBoolean(responseFieldArr[12], UpdateTeamMember.this.isDefaultTeam);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdateTeamMember.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], UpdateTeamMember.this.updatedAt);
                    ResponseField responseField3 = responseFieldArr[15];
                    Account account = UpdateTeamMember.this.account;
                    responseWriter.writeObject(responseField3, account != null ? account.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[16];
                    UpdatedBy updatedBy = UpdateTeamMember.this.updatedBy;
                    responseWriter.writeObject(responseField4, updatedBy != null ? updatedBy.marshaller() : null);
                    ResponseField responseField5 = responseFieldArr[17];
                    CreatedBy createdBy = UpdateTeamMember.this.createdBy;
                    responseWriter.writeObject(responseField5, createdBy != null ? createdBy.marshaller() : null);
                    ResponseField responseField6 = responseFieldArr[18];
                    User user = UpdateTeamMember.this.user;
                    responseWriter.writeObject(responseField6, user != null ? user.marshaller() : null);
                }
            };
        }

        public MemberTeam memberTeam() {
            return this.memberTeam;
        }

        public String memberTeamId() {
            return this.memberTeamId;
        }

        public TeamMemberType memberType() {
            return this.memberType;
        }

        public Team team() {
            return this.team;
        }

        public String teamId() {
            return this.teamId;
        }

        public TeamRole teamRole() {
            return this.teamRole;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateTeamMember{__typename=" + this.__typename + ", id=" + this.id + ", teamId=" + this.teamId + ", team=" + this.team + ", accountId=" + this.accountId + ", teamRole=" + this.teamRole + ", updatedById=" + this.updatedById + ", createdById=" + this.createdById + ", userId=" + this.userId + ", memberTeamId=" + this.memberTeamId + ", memberTeam=" + this.memberTeam + ", memberType=" + this.memberType + ", isDefaultTeam=" + this.isDefaultTeam + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", account=" + this.account + ", updatedBy=" + this.updatedBy + ", createdBy=" + this.createdBy + ", user=" + this.user + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UpdatedBy updatedBy() {
            return this.updatedBy;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public User user() {
            return this.user;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static class UpdatedBy {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final AddedSourceType addedSourceType;
        final String androidVersionRelease;
        final String appVersion;
        final String createdAt;
        final String deviceManufacturer;
        final String deviceModel;
        final String id;
        final String lastSelectedAccountApp;
        final String lastSelectedAccountWeb;
        final String name;
        final String profilePictureUrl;
        final String registeredEmail;
        final Boolean registeredEmailVerified;
        final String registeredNumber;
        final Boolean registeredNumberVerified;
        final String secondaryNumber;
        final Boolean secondaryNumberVerified;
        final String updatedAt;
        final UserRegistrationStatus userRegistrationStatus;

        public static final class Mapper implements ResponseFieldMapper<UpdatedBy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdatedBy map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdatedBy.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                AddedSourceType addedSourceTypeValueOf = string2 != null ? AddedSourceType.valueOf(string2) : null;
                String string3 = responseReader.readString(responseFieldArr[3]);
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new UpdatedBy(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public UpdatedBy(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.addedSourceType = (AddedSourceType) Utils.checkNotNull(addedSourceType, "addedSourceType == null");
            this.name = (String) Utils.checkNotNull(str3, "name == null");
            this.profilePictureUrl = str4;
            this.registeredEmail = str5;
            this.registeredEmailVerified = bool;
            this.registeredNumber = (String) Utils.checkNotNull(str6, "registeredNumber == null");
            this.registeredNumberVerified = bool2;
            this.secondaryNumber = str7;
            this.secondaryNumberVerified = bool3;
            this.userRegistrationStatus = (UserRegistrationStatus) Utils.checkNotNull(userRegistrationStatus, "userRegistrationStatus == null");
            this.lastSelectedAccountWeb = str8;
            this.lastSelectedAccountApp = str9;
            this.appVersion = str10;
            this.deviceModel = str11;
            this.deviceManufacturer = str12;
            this.androidVersionRelease = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public AddedSourceType addedSourceType() {
            return this.addedSourceType;
        }

        public String androidVersionRelease() {
            return this.androidVersionRelease;
        }

        public String appVersion() {
            return this.appVersion;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceManufacturer() {
            return this.deviceManufacturer;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            String str3;
            Boolean bool3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdatedBy)) {
                return false;
            }
            UpdatedBy updatedBy = (UpdatedBy) obj;
            if (this.__typename.equals(updatedBy.__typename) && this.id.equals(updatedBy.id) && this.addedSourceType.equals(updatedBy.addedSourceType) && this.name.equals(updatedBy.name) && ((str = this.profilePictureUrl) != null ? str.equals(updatedBy.profilePictureUrl) : updatedBy.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(updatedBy.registeredEmail) : updatedBy.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(updatedBy.registeredEmailVerified) : updatedBy.registeredEmailVerified == null) && this.registeredNumber.equals(updatedBy.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(updatedBy.registeredNumberVerified) : updatedBy.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(updatedBy.secondaryNumber) : updatedBy.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(updatedBy.secondaryNumberVerified) : updatedBy.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(updatedBy.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(updatedBy.lastSelectedAccountWeb) : updatedBy.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(updatedBy.lastSelectedAccountApp) : updatedBy.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(updatedBy.appVersion) : updatedBy.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(updatedBy.deviceModel) : updatedBy.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(updatedBy.deviceManufacturer) : updatedBy.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(updatedBy.androidVersionRelease) : updatedBy.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(updatedBy.createdAt) : updatedBy.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = updatedBy.updatedAt;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.addedSourceType.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.profilePictureUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.registeredEmail;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.registeredEmailVerified;
                int iHashCode4 = (((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.registeredNumber.hashCode()) * 1000003;
                Boolean bool2 = this.registeredNumberVerified;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str3 = this.secondaryNumber;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool3 = this.secondaryNumberVerified;
                int iHashCode7 = (((iHashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.userRegistrationStatus.hashCode()) * 1000003;
                String str4 = this.lastSelectedAccountWeb;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lastSelectedAccountApp;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.appVersion;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.deviceModel;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.deviceManufacturer;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.androidVersionRelease;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedAt;
                this.$hashCode = iHashCode14 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastSelectedAccountApp() {
            return this.lastSelectedAccountApp;
        }

        public String lastSelectedAccountWeb() {
            return this.lastSelectedAccountWeb;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.UpdatedBy.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdatedBy.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdatedBy.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdatedBy.this.id);
                    responseWriter.writeString(responseFieldArr[2], UpdatedBy.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], UpdatedBy.this.name);
                    responseWriter.writeString(responseFieldArr[4], UpdatedBy.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdatedBy.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], UpdatedBy.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdatedBy.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], UpdatedBy.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdatedBy.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], UpdatedBy.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], UpdatedBy.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdatedBy.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdatedBy.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], UpdatedBy.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], UpdatedBy.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], UpdatedBy.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], UpdatedBy.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], UpdatedBy.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], UpdatedBy.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String profilePictureUrl() {
            return this.profilePictureUrl;
        }

        public String registeredEmail() {
            return this.registeredEmail;
        }

        public Boolean registeredEmailVerified() {
            return this.registeredEmailVerified;
        }

        public String registeredNumber() {
            return this.registeredNumber;
        }

        public Boolean registeredNumberVerified() {
            return this.registeredNumberVerified;
        }

        public String secondaryNumber() {
            return this.secondaryNumber;
        }

        public Boolean secondaryNumberVerified() {
            return this.secondaryNumberVerified;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdatedBy{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
        }
    }

    public static class User {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final AddedSourceType addedSourceType;
        final String androidVersionRelease;
        final String appVersion;
        final String createdAt;
        final String deviceManufacturer;
        final String deviceModel;
        final String id;
        final String lastSelectedAccountApp;
        final String lastSelectedAccountWeb;
        final String name;
        final String profilePictureUrl;
        final String registeredEmail;
        final Boolean registeredEmailVerified;
        final String registeredNumber;
        final Boolean registeredNumberVerified;
        final String secondaryNumber;
        final Boolean secondaryNumberVerified;
        final String updatedAt;
        final UserRegistrationStatus userRegistrationStatus;

        public static final class Mapper implements ResponseFieldMapper<User> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public User map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = User.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                AddedSourceType addedSourceTypeValueOf = string2 != null ? AddedSourceType.valueOf(string2) : null;
                String string3 = responseReader.readString(responseFieldArr[3]);
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new User(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public User(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.addedSourceType = (AddedSourceType) Utils.checkNotNull(addedSourceType, "addedSourceType == null");
            this.name = (String) Utils.checkNotNull(str3, "name == null");
            this.profilePictureUrl = str4;
            this.registeredEmail = str5;
            this.registeredEmailVerified = bool;
            this.registeredNumber = (String) Utils.checkNotNull(str6, "registeredNumber == null");
            this.registeredNumberVerified = bool2;
            this.secondaryNumber = str7;
            this.secondaryNumberVerified = bool3;
            this.userRegistrationStatus = (UserRegistrationStatus) Utils.checkNotNull(userRegistrationStatus, "userRegistrationStatus == null");
            this.lastSelectedAccountWeb = str8;
            this.lastSelectedAccountApp = str9;
            this.appVersion = str10;
            this.deviceModel = str11;
            this.deviceManufacturer = str12;
            this.androidVersionRelease = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public AddedSourceType addedSourceType() {
            return this.addedSourceType;
        }

        public String androidVersionRelease() {
            return this.androidVersionRelease;
        }

        public String appVersion() {
            return this.appVersion;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceManufacturer() {
            return this.deviceManufacturer;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            String str3;
            Boolean bool3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            if (this.__typename.equals(user.__typename) && this.id.equals(user.id) && this.addedSourceType.equals(user.addedSourceType) && this.name.equals(user.name) && ((str = this.profilePictureUrl) != null ? str.equals(user.profilePictureUrl) : user.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(user.registeredEmail) : user.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(user.registeredEmailVerified) : user.registeredEmailVerified == null) && this.registeredNumber.equals(user.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(user.registeredNumberVerified) : user.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(user.secondaryNumber) : user.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(user.secondaryNumberVerified) : user.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(user.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(user.lastSelectedAccountWeb) : user.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(user.lastSelectedAccountApp) : user.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(user.appVersion) : user.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(user.deviceModel) : user.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(user.deviceManufacturer) : user.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(user.androidVersionRelease) : user.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(user.createdAt) : user.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = user.updatedAt;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.addedSourceType.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.profilePictureUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.registeredEmail;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.registeredEmailVerified;
                int iHashCode4 = (((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.registeredNumber.hashCode()) * 1000003;
                Boolean bool2 = this.registeredNumberVerified;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str3 = this.secondaryNumber;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool3 = this.secondaryNumberVerified;
                int iHashCode7 = (((iHashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.userRegistrationStatus.hashCode()) * 1000003;
                String str4 = this.lastSelectedAccountWeb;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lastSelectedAccountApp;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.appVersion;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.deviceModel;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.deviceManufacturer;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.androidVersionRelease;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedAt;
                this.$hashCode = iHashCode14 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastSelectedAccountApp() {
            return this.lastSelectedAccountApp;
        }

        public String lastSelectedAccountWeb() {
            return this.lastSelectedAccountWeb;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.User.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = User.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], User.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], User.this.id);
                    responseWriter.writeString(responseFieldArr[2], User.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], User.this.name);
                    responseWriter.writeString(responseFieldArr[4], User.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], User.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], User.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], User.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], User.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], User.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], User.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], User.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], User.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], User.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], User.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], User.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], User.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], User.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], User.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], User.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String profilePictureUrl() {
            return this.profilePictureUrl;
        }

        public String registeredEmail() {
            return this.registeredEmail;
        }

        public Boolean registeredEmailVerified() {
            return this.registeredEmailVerified;
        }

        public String registeredNumber() {
            return this.registeredNumber;
        }

        public Boolean registeredNumberVerified() {
            return this.registeredNumberVerified;
        }

        public String secondaryNumber() {
            return this.secondaryNumber;
        }

        public Boolean secondaryNumberVerified() {
            return this.secondaryNumberVerified;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "User{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelTeamMemberConditionInput condition;
        private final UpdateTeamMemberInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateTeamMemberInput updateTeamMemberInput, ModelTeamMemberConditionInput modelTeamMemberConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateTeamMemberInput;
            this.condition = modelTeamMemberConditionInput;
            linkedHashMap.put("input", updateTeamMemberInput);
            linkedHashMap.put("condition", modelTeamMemberConditionInput);
        }

        public ModelTeamMemberConditionInput condition() {
            return this.condition;
        }

        public UpdateTeamMemberInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                    inputFieldWriter.writeObject("condition", Variables.this.condition != null ? Variables.this.condition.marshaller() : null);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public UpdateTeamMemberMutation(UpdateTeamMemberInput updateTeamMemberInput, ModelTeamMemberConditionInput modelTeamMemberConditionInput) {
        Utils.checkNotNull(updateTeamMemberInput, "input == null");
        this.variables = new Variables(updateTeamMemberInput, modelTeamMemberConditionInput);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.Operation
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String operationId() {
        return "ce36523ea73248b156bafbcdb907664557617c810377a43799d055987a94051e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateTeamMember($input: UpdateTeamMemberInput!, $condition: ModelTeamMemberConditionInput) {\n  updateTeamMember(input: $input, condition: $condition) {\n    __typename\n    id\n    teamId\n    team {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    accountId\n    teamRole\n    updatedById\n    createdById\n    userId\n    memberTeamId\n    memberTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    memberType\n    isDefaultTeam\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    createdBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    user {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Variables variables() {
        return this.variables;
    }
}
