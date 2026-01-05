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
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.AccountStatus;
import type.AccountType;
import type.ActivityType;
import type.AddedSourceType;
import type.AuthorizationLevel;
import type.Channels;
import type.CustomType;
import type.ModelAccountMembershipConditionInput;
import type.UpdateAccountMembershipInput;
import type.UserRegistrationStatus;
import type.UserStatus;

/* loaded from: classes4.dex */
public final class UpdateAccountMembershipMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateAccountMembership($input: UpdateAccountMembershipInput!, $condition: ModelAccountMembershipConditionInput) {\n  updateAccountMembership(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    allowedDeviceId\n    designation\n    authorizationLevel\n    signature\n    isBillingMember\n    addedById\n    updatedById\n    addedOn\n    approvedById\n    approvedOn\n    acceptedOn\n    userAccountStatus\n    whatsappApiAccess\n    sharedInboxPermission\n    canInitiateNewConversation\n    canCreateWaCampaigns\n    mapRegisteredMobileNumberToAccount\n    mapSecondaryMobileNumberToAccount\n    accountEmail\n    accountEmailVerified\n    notificationPreferences {\n      __typename\n      notificationType\n      channels\n    }\n    migrateToUserIdOnRemoval\n    prefScreenPop\n    prefSaveBusinessCall\n    prefPostCallDisposition\n    prefDefaultSimToCall\n    prefTrackLocationOnActivity\n    prefUseBusinessWhatsapp\n    prefTrackAllCalls\n    prefTrackAllCallsSpecificSim\n    onLeave\n    onLeaveTill\n    lastViewedChatNotification\n    prefReadOnlyInfo\n    customMemberAttributes\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    user {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    approvedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateAccountMembership";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateAccountMembership($input: UpdateAccountMembershipInput!, $condition: ModelAccountMembershipConditionInput) {\n  updateAccountMembership(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    allowedDeviceId\n    designation\n    authorizationLevel\n    signature\n    isBillingMember\n    addedById\n    updatedById\n    addedOn\n    approvedById\n    approvedOn\n    acceptedOn\n    userAccountStatus\n    whatsappApiAccess\n    sharedInboxPermission\n    canInitiateNewConversation\n    canCreateWaCampaigns\n    mapRegisteredMobileNumberToAccount\n    mapSecondaryMobileNumberToAccount\n    accountEmail\n    accountEmailVerified\n    notificationPreferences {\n      __typename\n      notificationType\n      channels\n    }\n    migrateToUserIdOnRemoval\n    prefScreenPop\n    prefSaveBusinessCall\n    prefPostCallDisposition\n    prefDefaultSimToCall\n    prefTrackLocationOnActivity\n    prefUseBusinessWhatsapp\n    prefTrackAllCalls\n    prefTrackAllCallsSpecificSim\n    onLeave\n    onLeaveTill\n    lastViewedChatNotification\n    prefReadOnlyInfo\n    customMemberAttributes\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    user {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    approvedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
                return new Account(string, str, string2, accountTypeValueOf, string4, str2, string5 != null ? AccountStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readString(responseFieldArr[31]), responseReader.readString(responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readInt(responseFieldArr[34]), responseReader.readBoolean(responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readList(responseFieldArr[39], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readBoolean(responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readList(responseFieldArr[45], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[46], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readList(responseFieldArr[51], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.Mapper.5
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.1
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
                    responseWriter.writeList(responseFieldArr[15], Account.this.productOrService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.1.1
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
                    responseWriter.writeList(responseFieldArr[39], Account.this.permissions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.1.2
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
                    responseWriter.writeList(responseFieldArr[45], Account.this.salesmaxSalesContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[46], Account.this.salesmaxSupportContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], Account.this.chatWidgetConfig);
                    responseWriter.writeString(responseFieldArr[48], Account.this.onboardingStatus);
                    responseWriter.writeString(responseFieldArr[49], Account.this.integrationNeeded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], Account.this.matchingDealId);
                    responseWriter.writeList(responseFieldArr[51], Account.this.relatedAccountIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Account.1.5
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

    public static class AddedBy {
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

        public static final class Mapper implements ResponseFieldMapper<AddedBy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AddedBy map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AddedBy.$responseFields;
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
                return new AddedBy(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public AddedBy(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof AddedBy)) {
                return false;
            }
            AddedBy addedBy = (AddedBy) obj;
            if (this.__typename.equals(addedBy.__typename) && this.id.equals(addedBy.id) && this.addedSourceType.equals(addedBy.addedSourceType) && this.name.equals(addedBy.name) && ((str = this.profilePictureUrl) != null ? str.equals(addedBy.profilePictureUrl) : addedBy.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(addedBy.registeredEmail) : addedBy.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(addedBy.registeredEmailVerified) : addedBy.registeredEmailVerified == null) && this.registeredNumber.equals(addedBy.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(addedBy.registeredNumberVerified) : addedBy.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(addedBy.secondaryNumber) : addedBy.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(addedBy.secondaryNumberVerified) : addedBy.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(addedBy.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(addedBy.lastSelectedAccountWeb) : addedBy.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(addedBy.lastSelectedAccountApp) : addedBy.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(addedBy.appVersion) : addedBy.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(addedBy.deviceModel) : addedBy.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(addedBy.deviceManufacturer) : addedBy.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(addedBy.androidVersionRelease) : addedBy.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(addedBy.createdAt) : addedBy.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = addedBy.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.AddedBy.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AddedBy.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AddedBy.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], AddedBy.this.id);
                    responseWriter.writeString(responseFieldArr[2], AddedBy.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], AddedBy.this.name);
                    responseWriter.writeString(responseFieldArr[4], AddedBy.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], AddedBy.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], AddedBy.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], AddedBy.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], AddedBy.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], AddedBy.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], AddedBy.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], AddedBy.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], AddedBy.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], AddedBy.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], AddedBy.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], AddedBy.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], AddedBy.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], AddedBy.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], AddedBy.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], AddedBy.this.updatedAt);
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
                this.$toString = "AddedBy{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class ApprovedBy {
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

        public static final class Mapper implements ResponseFieldMapper<ApprovedBy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ApprovedBy map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ApprovedBy.$responseFields;
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
                return new ApprovedBy(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public ApprovedBy(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof ApprovedBy)) {
                return false;
            }
            ApprovedBy approvedBy = (ApprovedBy) obj;
            if (this.__typename.equals(approvedBy.__typename) && this.id.equals(approvedBy.id) && this.addedSourceType.equals(approvedBy.addedSourceType) && this.name.equals(approvedBy.name) && ((str = this.profilePictureUrl) != null ? str.equals(approvedBy.profilePictureUrl) : approvedBy.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(approvedBy.registeredEmail) : approvedBy.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(approvedBy.registeredEmailVerified) : approvedBy.registeredEmailVerified == null) && this.registeredNumber.equals(approvedBy.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(approvedBy.registeredNumberVerified) : approvedBy.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(approvedBy.secondaryNumber) : approvedBy.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(approvedBy.secondaryNumberVerified) : approvedBy.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(approvedBy.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(approvedBy.lastSelectedAccountWeb) : approvedBy.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(approvedBy.lastSelectedAccountApp) : approvedBy.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(approvedBy.appVersion) : approvedBy.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(approvedBy.deviceModel) : approvedBy.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(approvedBy.deviceManufacturer) : approvedBy.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(approvedBy.androidVersionRelease) : approvedBy.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(approvedBy.createdAt) : approvedBy.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = approvedBy.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.ApprovedBy.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ApprovedBy.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ApprovedBy.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ApprovedBy.this.id);
                    responseWriter.writeString(responseFieldArr[2], ApprovedBy.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], ApprovedBy.this.name);
                    responseWriter.writeString(responseFieldArr[4], ApprovedBy.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], ApprovedBy.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], ApprovedBy.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], ApprovedBy.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], ApprovedBy.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], ApprovedBy.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], ApprovedBy.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], ApprovedBy.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], ApprovedBy.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], ApprovedBy.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], ApprovedBy.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], ApprovedBy.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], ApprovedBy.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], ApprovedBy.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], ApprovedBy.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], ApprovedBy.this.updatedAt);
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
                this.$toString = "ApprovedBy{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static final class Builder {
        private ModelAccountMembershipConditionInput condition;
        private UpdateAccountMembershipInput input;

        public UpdateAccountMembershipMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateAccountMembershipMutation(this.input, this.condition);
        }

        public Builder condition(ModelAccountMembershipConditionInput modelAccountMembershipConditionInput) {
            this.condition = modelAccountMembershipConditionInput;
            return this;
        }

        public Builder input(UpdateAccountMembershipInput updateAccountMembershipInput) {
            this.input = updateAccountMembershipInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateAccountMembership", "updateAccountMembership", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateAccountMembership updateAccountMembership;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateAccountMembership.Mapper updateAccountMembershipFieldMapper = new UpdateAccountMembership.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateAccountMembership) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateAccountMembership>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateAccountMembership read(ResponseReader responseReader2) {
                        return Mapper.this.updateAccountMembershipFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateAccountMembership updateAccountMembership) {
            this.updateAccountMembership = updateAccountMembership;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateAccountMembership updateAccountMembership = this.updateAccountMembership;
            UpdateAccountMembership updateAccountMembership2 = ((Data) obj).updateAccountMembership;
            return updateAccountMembership == null ? updateAccountMembership2 == null : updateAccountMembership.equals(updateAccountMembership2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateAccountMembership updateAccountMembership = this.updateAccountMembership;
                this.$hashCode = (updateAccountMembership == null ? 0 : updateAccountMembership.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateAccountMembership updateAccountMembership = Data.this.updateAccountMembership;
                    responseWriter.writeObject(responseField, updateAccountMembership != null ? updateAccountMembership.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateAccountMembership=" + this.updateAccountMembership + "}";
            }
            return this.$toString;
        }

        public UpdateAccountMembership updateAccountMembership() {
            return this.updateAccountMembership;
        }
    }

    public static class NotificationPreference {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("notificationType", "notificationType", null, false, Collections.emptyList()), ResponseField.forList("channels", "channels", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Channels> channels;
        final ActivityType notificationType;

        public static final class Mapper implements ResponseFieldMapper<NotificationPreference> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public NotificationPreference map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = NotificationPreference.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String string2 = responseReader.readString(responseFieldArr[1]);
                return new NotificationPreference(string, string2 != null ? ActivityType.valueOf(string2) : null, responseReader.readList(responseFieldArr[2], new ResponseReader.ListReader<Channels>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.NotificationPreference.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Channels read(ResponseReader.ListItemReader listItemReader) {
                        return Channels.valueOf(listItemReader.readString());
                    }
                }));
            }
        }

        public NotificationPreference(String str, ActivityType activityType, List<Channels> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.notificationType = (ActivityType) Utils.checkNotNull(activityType, "notificationType == null");
            this.channels = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Channels> channels() {
            return this.channels;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NotificationPreference)) {
                return false;
            }
            NotificationPreference notificationPreference = (NotificationPreference) obj;
            if (this.__typename.equals(notificationPreference.__typename) && this.notificationType.equals(notificationPreference.notificationType)) {
                List<Channels> list = this.channels;
                List<Channels> list2 = notificationPreference.channels;
                if (list == null) {
                    if (list2 == null) {
                        return true;
                    }
                } else if (list.equals(list2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.notificationType.hashCode()) * 1000003;
                List<Channels> list = this.channels;
                this.$hashCode = iHashCode ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.NotificationPreference.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = NotificationPreference.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], NotificationPreference.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], NotificationPreference.this.notificationType.name());
                    responseWriter.writeList(responseFieldArr[2], NotificationPreference.this.channels, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.NotificationPreference.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((Channels) obj).name());
                        }
                    });
                }
            };
        }

        public ActivityType notificationType() {
            return this.notificationType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "NotificationPreference{__typename=" + this.__typename + ", notificationType=" + this.notificationType + ", channels=" + this.channels + "}";
            }
            return this.$toString;
        }
    }

    public static class UpdateAccountMembership {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String acceptedOn;
        final Account account;
        final String accountEmail;
        final Boolean accountEmailVerified;
        final String accountId;
        final AddedBy addedBy;
        final String addedById;
        final String addedOn;
        final List<String> allowedDeviceId;
        final ApprovedBy approvedBy;
        final String approvedById;
        final String approvedOn;
        final AuthorizationLevel authorizationLevel;
        final String canCreateWaCampaigns;
        final String canInitiateNewConversation;
        final String createdAt;
        final String customMemberAttributes;
        final String designation;
        final String id;
        final Boolean isBillingMember;
        final String lastViewedChatNotification;
        final boolean mapRegisteredMobileNumberToAccount;
        final boolean mapSecondaryMobileNumberToAccount;
        final String migrateToUserIdOnRemoval;
        final List<NotificationPreference> notificationPreferences;
        final Boolean onLeave;
        final String onLeaveTill;
        final Integer prefDefaultSimToCall;
        final Boolean prefPostCallDisposition;
        final String prefReadOnlyInfo;
        final Boolean prefSaveBusinessCall;
        final Boolean prefScreenPop;
        final Boolean prefTrackAllCalls;
        final Integer prefTrackAllCallsSpecificSim;
        final Boolean prefTrackLocationOnActivity;
        final Boolean prefUseBusinessWhatsapp;
        final String sharedInboxPermission;
        final String signature;
        final String updatedAt;
        final UpdatedBy updatedBy;
        final String updatedById;
        final User user;
        final UserStatus userAccountStatus;
        final String userId;
        final String whatsappApiAccess;

        public static final class Mapper implements ResponseFieldMapper<UpdateAccountMembership> {
            final NotificationPreference.Mapper notificationPreferenceFieldMapper = new NotificationPreference.Mapper();
            final Account.Mapper accountFieldMapper = new Account.Mapper();
            final User.Mapper userFieldMapper = new User.Mapper();
            final AddedBy.Mapper addedByFieldMapper = new AddedBy.Mapper();
            final UpdatedBy.Mapper updatedByFieldMapper = new UpdatedBy.Mapper();
            final ApprovedBy.Mapper approvedByFieldMapper = new ApprovedBy.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateAccountMembership map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateAccountMembership.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                List list = responseReader.readList(responseFieldArr[4], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string2 = responseReader.readString(responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                AuthorizationLevel authorizationLevelValueOf = string3 != null ? AuthorizationLevel.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[7]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                String str9 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]);
                String string5 = responseReader.readString(responseFieldArr[15]);
                return new UpdateAccountMembership(string, str, str2, str3, list, string2, authorizationLevelValueOf, string4, bool, str4, str5, str6, str7, str8, str9, string5 != null ? UserStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), responseReader.readString(responseFieldArr[19]), responseReader.readBoolean(responseFieldArr[20]).booleanValue(), responseReader.readBoolean(responseFieldArr[21]).booleanValue(), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), responseReader.readBoolean(responseFieldArr[23]), responseReader.readList(responseFieldArr[24], new ResponseReader.ListReader<NotificationPreference>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public NotificationPreference read(ResponseReader.ListItemReader listItemReader) {
                        return (NotificationPreference) listItemReader.readObject(new ResponseReader.ObjectReader<NotificationPreference>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.Mapper.2.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public NotificationPreference read(ResponseReader responseReader2) {
                                return Mapper.this.notificationPreferenceFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), responseReader.readBoolean(responseFieldArr[27]), responseReader.readBoolean(responseFieldArr[28]), responseReader.readInt(responseFieldArr[29]), responseReader.readBoolean(responseFieldArr[30]), responseReader.readBoolean(responseFieldArr[31]), responseReader.readBoolean(responseFieldArr[32]), responseReader.readInt(responseFieldArr[33]), responseReader.readBoolean(responseFieldArr[34]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[39]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[40]), (Account) responseReader.readObject(responseFieldArr[41], new ResponseReader.ObjectReader<Account>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Account read(ResponseReader responseReader2) {
                        return Mapper.this.accountFieldMapper.map(responseReader2);
                    }
                }), (User) responseReader.readObject(responseFieldArr[42], new ResponseReader.ObjectReader<User>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public User read(ResponseReader responseReader2) {
                        return Mapper.this.userFieldMapper.map(responseReader2);
                    }
                }), (AddedBy) responseReader.readObject(responseFieldArr[43], new ResponseReader.ObjectReader<AddedBy>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AddedBy read(ResponseReader responseReader2) {
                        return Mapper.this.addedByFieldMapper.map(responseReader2);
                    }
                }), (UpdatedBy) responseReader.readObject(responseFieldArr[44], new ResponseReader.ObjectReader<UpdatedBy>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdatedBy read(ResponseReader responseReader2) {
                        return Mapper.this.updatedByFieldMapper.map(responseReader2);
                    }
                }), (ApprovedBy) responseReader.readObject(responseFieldArr[45], new ResponseReader.ObjectReader<ApprovedBy>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.Mapper.7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ApprovedBy read(ResponseReader responseReader2) {
                        return Mapper.this.approvedByFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forList("allowedDeviceId", "allowedDeviceId", null, true, Collections.emptyList()), ResponseField.forString("designation", "designation", null, true, Collections.emptyList()), ResponseField.forString("authorizationLevel", "authorizationLevel", null, false, Collections.emptyList()), ResponseField.forString("signature", "signature", null, true, Collections.emptyList()), ResponseField.forBoolean("isBillingMember", "isBillingMember", null, true, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("addedOn", "addedOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("approvedById", "approvedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("approvedOn", "approvedOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("acceptedOn", "acceptedOn", null, true, customType2, Collections.emptyList()), ResponseField.forString("userAccountStatus", "userAccountStatus", null, false, Collections.emptyList()), ResponseField.forString("whatsappApiAccess", "whatsappApiAccess", null, true, Collections.emptyList()), ResponseField.forString("sharedInboxPermission", "sharedInboxPermission", null, true, Collections.emptyList()), ResponseField.forString("canInitiateNewConversation", "canInitiateNewConversation", null, true, Collections.emptyList()), ResponseField.forString("canCreateWaCampaigns", "canCreateWaCampaigns", null, true, Collections.emptyList()), ResponseField.forBoolean("mapRegisteredMobileNumberToAccount", "mapRegisteredMobileNumberToAccount", null, false, Collections.emptyList()), ResponseField.forBoolean("mapSecondaryMobileNumberToAccount", "mapSecondaryMobileNumberToAccount", null, false, Collections.emptyList()), ResponseField.forCustomType("accountEmail", "accountEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("accountEmailVerified", "accountEmailVerified", null, true, Collections.emptyList()), ResponseField.forList("notificationPreferences", "notificationPreferences", null, true, Collections.emptyList()), ResponseField.forCustomType("migrateToUserIdOnRemoval", "migrateToUserIdOnRemoval", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("prefScreenPop", "prefScreenPop", null, true, Collections.emptyList()), ResponseField.forBoolean("prefSaveBusinessCall", "prefSaveBusinessCall", null, true, Collections.emptyList()), ResponseField.forBoolean("prefPostCallDisposition", "prefPostCallDisposition", null, true, Collections.emptyList()), ResponseField.forInt("prefDefaultSimToCall", "prefDefaultSimToCall", null, true, Collections.emptyList()), ResponseField.forBoolean("prefTrackLocationOnActivity", "prefTrackLocationOnActivity", null, true, Collections.emptyList()), ResponseField.forBoolean("prefUseBusinessWhatsapp", "prefUseBusinessWhatsapp", null, true, Collections.emptyList()), ResponseField.forBoolean("prefTrackAllCalls", "prefTrackAllCalls", null, true, Collections.emptyList()), ResponseField.forInt("prefTrackAllCallsSpecificSim", "prefTrackAllCallsSpecificSim", null, true, Collections.emptyList()), ResponseField.forBoolean("onLeave", "onLeave", null, true, Collections.emptyList()), ResponseField.forCustomType("onLeaveTill", "onLeaveTill", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedChatNotification", "lastViewedChatNotification", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("prefReadOnlyInfo", "prefReadOnlyInfo", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customMemberAttributes", "customMemberAttributes", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("account", "account", null, true, Collections.emptyList()), ResponseField.forObject("user", "user", null, true, Collections.emptyList()), ResponseField.forObject("addedBy", "addedBy", null, true, Collections.emptyList()), ResponseField.forObject("updatedBy", "updatedBy", null, true, Collections.emptyList()), ResponseField.forObject("approvedBy", "approvedBy", null, true, Collections.emptyList())};
        }

        public UpdateAccountMembership(String str, String str2, String str3, String str4, List<String> list, String str5, AuthorizationLevel authorizationLevel, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, UserStatus userStatus, String str13, String str14, String str15, String str16, boolean z, boolean z2, String str17, Boolean bool2, List<NotificationPreference> list2, String str18, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Boolean bool6, Boolean bool7, Boolean bool8, Integer num2, Boolean bool9, String str19, String str20, String str21, String str22, String str23, String str24, Account account, User user, AddedBy addedBy, UpdatedBy updatedBy, ApprovedBy approvedBy) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str4, "userId == null");
            this.allowedDeviceId = list;
            this.designation = str5;
            this.authorizationLevel = (AuthorizationLevel) Utils.checkNotNull(authorizationLevel, "authorizationLevel == null");
            this.signature = str6;
            this.isBillingMember = bool;
            this.addedById = str7;
            this.updatedById = str8;
            this.addedOn = str9;
            this.approvedById = str10;
            this.approvedOn = str11;
            this.acceptedOn = str12;
            this.userAccountStatus = (UserStatus) Utils.checkNotNull(userStatus, "userAccountStatus == null");
            this.whatsappApiAccess = str13;
            this.sharedInboxPermission = str14;
            this.canInitiateNewConversation = str15;
            this.canCreateWaCampaigns = str16;
            this.mapRegisteredMobileNumberToAccount = z;
            this.mapSecondaryMobileNumberToAccount = z2;
            this.accountEmail = str17;
            this.accountEmailVerified = bool2;
            this.notificationPreferences = list2;
            this.migrateToUserIdOnRemoval = str18;
            this.prefScreenPop = bool3;
            this.prefSaveBusinessCall = bool4;
            this.prefPostCallDisposition = bool5;
            this.prefDefaultSimToCall = num;
            this.prefTrackLocationOnActivity = bool6;
            this.prefUseBusinessWhatsapp = bool7;
            this.prefTrackAllCalls = bool8;
            this.prefTrackAllCallsSpecificSim = num2;
            this.onLeave = bool9;
            this.onLeaveTill = str19;
            this.lastViewedChatNotification = str20;
            this.prefReadOnlyInfo = str21;
            this.customMemberAttributes = str22;
            this.createdAt = str23;
            this.updatedAt = str24;
            this.account = account;
            this.user = user;
            this.addedBy = addedBy;
            this.updatedBy = updatedBy;
            this.approvedBy = approvedBy;
        }

        public String __typename() {
            return this.__typename;
        }

        public String acceptedOn() {
            return this.acceptedOn;
        }

        public Account account() {
            return this.account;
        }

        public String accountEmail() {
            return this.accountEmail;
        }

        public Boolean accountEmailVerified() {
            return this.accountEmailVerified;
        }

        public String accountId() {
            return this.accountId;
        }

        public AddedBy addedBy() {
            return this.addedBy;
        }

        public String addedById() {
            return this.addedById;
        }

        public String addedOn() {
            return this.addedOn;
        }

        public List<String> allowedDeviceId() {
            return this.allowedDeviceId;
        }

        public ApprovedBy approvedBy() {
            return this.approvedBy;
        }

        public String approvedById() {
            return this.approvedById;
        }

        public String approvedOn() {
            return this.approvedOn;
        }

        public AuthorizationLevel authorizationLevel() {
            return this.authorizationLevel;
        }

        public String canCreateWaCampaigns() {
            return this.canCreateWaCampaigns;
        }

        public String canInitiateNewConversation() {
            return this.canInitiateNewConversation;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String customMemberAttributes() {
            return this.customMemberAttributes;
        }

        public String designation() {
            return this.designation;
        }

        public boolean equals(Object obj) {
            List<String> list;
            String str;
            String str2;
            Boolean bool;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            Boolean bool2;
            List<NotificationPreference> list2;
            String str14;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Integer num;
            Boolean bool6;
            Boolean bool7;
            Boolean bool8;
            Integer num2;
            Boolean bool9;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            Account account;
            User user;
            AddedBy addedBy;
            UpdatedBy updatedBy;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateAccountMembership)) {
                return false;
            }
            UpdateAccountMembership updateAccountMembership = (UpdateAccountMembership) obj;
            if (this.__typename.equals(updateAccountMembership.__typename) && this.id.equals(updateAccountMembership.id) && this.accountId.equals(updateAccountMembership.accountId) && this.userId.equals(updateAccountMembership.userId) && ((list = this.allowedDeviceId) != null ? list.equals(updateAccountMembership.allowedDeviceId) : updateAccountMembership.allowedDeviceId == null) && ((str = this.designation) != null ? str.equals(updateAccountMembership.designation) : updateAccountMembership.designation == null) && this.authorizationLevel.equals(updateAccountMembership.authorizationLevel) && ((str2 = this.signature) != null ? str2.equals(updateAccountMembership.signature) : updateAccountMembership.signature == null) && ((bool = this.isBillingMember) != null ? bool.equals(updateAccountMembership.isBillingMember) : updateAccountMembership.isBillingMember == null) && ((str3 = this.addedById) != null ? str3.equals(updateAccountMembership.addedById) : updateAccountMembership.addedById == null) && ((str4 = this.updatedById) != null ? str4.equals(updateAccountMembership.updatedById) : updateAccountMembership.updatedById == null) && ((str5 = this.addedOn) != null ? str5.equals(updateAccountMembership.addedOn) : updateAccountMembership.addedOn == null) && ((str6 = this.approvedById) != null ? str6.equals(updateAccountMembership.approvedById) : updateAccountMembership.approvedById == null) && ((str7 = this.approvedOn) != null ? str7.equals(updateAccountMembership.approvedOn) : updateAccountMembership.approvedOn == null) && ((str8 = this.acceptedOn) != null ? str8.equals(updateAccountMembership.acceptedOn) : updateAccountMembership.acceptedOn == null) && this.userAccountStatus.equals(updateAccountMembership.userAccountStatus) && ((str9 = this.whatsappApiAccess) != null ? str9.equals(updateAccountMembership.whatsappApiAccess) : updateAccountMembership.whatsappApiAccess == null) && ((str10 = this.sharedInboxPermission) != null ? str10.equals(updateAccountMembership.sharedInboxPermission) : updateAccountMembership.sharedInboxPermission == null) && ((str11 = this.canInitiateNewConversation) != null ? str11.equals(updateAccountMembership.canInitiateNewConversation) : updateAccountMembership.canInitiateNewConversation == null) && ((str12 = this.canCreateWaCampaigns) != null ? str12.equals(updateAccountMembership.canCreateWaCampaigns) : updateAccountMembership.canCreateWaCampaigns == null) && this.mapRegisteredMobileNumberToAccount == updateAccountMembership.mapRegisteredMobileNumberToAccount && this.mapSecondaryMobileNumberToAccount == updateAccountMembership.mapSecondaryMobileNumberToAccount && ((str13 = this.accountEmail) != null ? str13.equals(updateAccountMembership.accountEmail) : updateAccountMembership.accountEmail == null) && ((bool2 = this.accountEmailVerified) != null ? bool2.equals(updateAccountMembership.accountEmailVerified) : updateAccountMembership.accountEmailVerified == null) && ((list2 = this.notificationPreferences) != null ? list2.equals(updateAccountMembership.notificationPreferences) : updateAccountMembership.notificationPreferences == null) && ((str14 = this.migrateToUserIdOnRemoval) != null ? str14.equals(updateAccountMembership.migrateToUserIdOnRemoval) : updateAccountMembership.migrateToUserIdOnRemoval == null) && ((bool3 = this.prefScreenPop) != null ? bool3.equals(updateAccountMembership.prefScreenPop) : updateAccountMembership.prefScreenPop == null) && ((bool4 = this.prefSaveBusinessCall) != null ? bool4.equals(updateAccountMembership.prefSaveBusinessCall) : updateAccountMembership.prefSaveBusinessCall == null) && ((bool5 = this.prefPostCallDisposition) != null ? bool5.equals(updateAccountMembership.prefPostCallDisposition) : updateAccountMembership.prefPostCallDisposition == null) && ((num = this.prefDefaultSimToCall) != null ? num.equals(updateAccountMembership.prefDefaultSimToCall) : updateAccountMembership.prefDefaultSimToCall == null) && ((bool6 = this.prefTrackLocationOnActivity) != null ? bool6.equals(updateAccountMembership.prefTrackLocationOnActivity) : updateAccountMembership.prefTrackLocationOnActivity == null) && ((bool7 = this.prefUseBusinessWhatsapp) != null ? bool7.equals(updateAccountMembership.prefUseBusinessWhatsapp) : updateAccountMembership.prefUseBusinessWhatsapp == null) && ((bool8 = this.prefTrackAllCalls) != null ? bool8.equals(updateAccountMembership.prefTrackAllCalls) : updateAccountMembership.prefTrackAllCalls == null) && ((num2 = this.prefTrackAllCallsSpecificSim) != null ? num2.equals(updateAccountMembership.prefTrackAllCallsSpecificSim) : updateAccountMembership.prefTrackAllCallsSpecificSim == null) && ((bool9 = this.onLeave) != null ? bool9.equals(updateAccountMembership.onLeave) : updateAccountMembership.onLeave == null) && ((str15 = this.onLeaveTill) != null ? str15.equals(updateAccountMembership.onLeaveTill) : updateAccountMembership.onLeaveTill == null) && ((str16 = this.lastViewedChatNotification) != null ? str16.equals(updateAccountMembership.lastViewedChatNotification) : updateAccountMembership.lastViewedChatNotification == null) && ((str17 = this.prefReadOnlyInfo) != null ? str17.equals(updateAccountMembership.prefReadOnlyInfo) : updateAccountMembership.prefReadOnlyInfo == null) && ((str18 = this.customMemberAttributes) != null ? str18.equals(updateAccountMembership.customMemberAttributes) : updateAccountMembership.customMemberAttributes == null) && ((str19 = this.createdAt) != null ? str19.equals(updateAccountMembership.createdAt) : updateAccountMembership.createdAt == null) && ((str20 = this.updatedAt) != null ? str20.equals(updateAccountMembership.updatedAt) : updateAccountMembership.updatedAt == null) && ((account = this.account) != null ? account.equals(updateAccountMembership.account) : updateAccountMembership.account == null) && ((user = this.user) != null ? user.equals(updateAccountMembership.user) : updateAccountMembership.user == null) && ((addedBy = this.addedBy) != null ? addedBy.equals(updateAccountMembership.addedBy) : updateAccountMembership.addedBy == null) && ((updatedBy = this.updatedBy) != null ? updatedBy.equals(updateAccountMembership.updatedBy) : updateAccountMembership.updatedBy == null)) {
                ApprovedBy approvedBy = this.approvedBy;
                ApprovedBy approvedBy2 = updateAccountMembership.approvedBy;
                if (approvedBy == null) {
                    if (approvedBy2 == null) {
                        return true;
                    }
                } else if (approvedBy.equals(approvedBy2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003;
                List<String> list = this.allowedDeviceId;
                int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str = this.designation;
                int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.authorizationLevel.hashCode()) * 1000003;
                String str2 = this.signature;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.isBillingMember;
                int iHashCode5 = (iHashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str3 = this.addedById;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.updatedById;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.addedOn;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.approvedById;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.approvedOn;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.acceptedOn;
                int iHashCode11 = (((iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.userAccountStatus.hashCode()) * 1000003;
                String str9 = this.whatsappApiAccess;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.sharedInboxPermission;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.canInitiateNewConversation;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.canCreateWaCampaigns;
                int iHashCode15 = (((((iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003) ^ Boolean.valueOf(this.mapRegisteredMobileNumberToAccount).hashCode()) * 1000003) ^ Boolean.valueOf(this.mapSecondaryMobileNumberToAccount).hashCode()) * 1000003;
                String str13 = this.accountEmail;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                Boolean bool2 = this.accountEmailVerified;
                int iHashCode17 = (iHashCode16 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                List<NotificationPreference> list2 = this.notificationPreferences;
                int iHashCode18 = (iHashCode17 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str14 = this.migrateToUserIdOnRemoval;
                int iHashCode19 = (iHashCode18 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                Boolean bool3 = this.prefScreenPop;
                int iHashCode20 = (iHashCode19 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.prefSaveBusinessCall;
                int iHashCode21 = (iHashCode20 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                Boolean bool5 = this.prefPostCallDisposition;
                int iHashCode22 = (iHashCode21 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Integer num = this.prefDefaultSimToCall;
                int iHashCode23 = (iHashCode22 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Boolean bool6 = this.prefTrackLocationOnActivity;
                int iHashCode24 = (iHashCode23 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
                Boolean bool7 = this.prefUseBusinessWhatsapp;
                int iHashCode25 = (iHashCode24 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
                Boolean bool8 = this.prefTrackAllCalls;
                int iHashCode26 = (iHashCode25 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
                Integer num2 = this.prefTrackAllCallsSpecificSim;
                int iHashCode27 = (iHashCode26 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Boolean bool9 = this.onLeave;
                int iHashCode28 = (iHashCode27 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
                String str15 = this.onLeaveTill;
                int iHashCode29 = (iHashCode28 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.lastViewedChatNotification;
                int iHashCode30 = (iHashCode29 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.prefReadOnlyInfo;
                int iHashCode31 = (iHashCode30 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.customMemberAttributes;
                int iHashCode32 = (iHashCode31 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.createdAt;
                int iHashCode33 = (iHashCode32 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.updatedAt;
                int iHashCode34 = (iHashCode33 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                Account account = this.account;
                int iHashCode35 = (iHashCode34 ^ (account == null ? 0 : account.hashCode())) * 1000003;
                User user = this.user;
                int iHashCode36 = (iHashCode35 ^ (user == null ? 0 : user.hashCode())) * 1000003;
                AddedBy addedBy = this.addedBy;
                int iHashCode37 = (iHashCode36 ^ (addedBy == null ? 0 : addedBy.hashCode())) * 1000003;
                UpdatedBy updatedBy = this.updatedBy;
                int iHashCode38 = (iHashCode37 ^ (updatedBy == null ? 0 : updatedBy.hashCode())) * 1000003;
                ApprovedBy approvedBy = this.approvedBy;
                this.$hashCode = iHashCode38 ^ (approvedBy != null ? approvedBy.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isBillingMember() {
            return this.isBillingMember;
        }

        public String lastViewedChatNotification() {
            return this.lastViewedChatNotification;
        }

        public boolean mapRegisteredMobileNumberToAccount() {
            return this.mapRegisteredMobileNumberToAccount;
        }

        public boolean mapSecondaryMobileNumberToAccount() {
            return this.mapSecondaryMobileNumberToAccount;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateAccountMembership.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateAccountMembership.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateAccountMembership.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateAccountMembership.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateAccountMembership.this.userId);
                    responseWriter.writeList(responseFieldArr[4], UpdateAccountMembership.this.allowedDeviceId, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[5], UpdateAccountMembership.this.designation);
                    responseWriter.writeString(responseFieldArr[6], UpdateAccountMembership.this.authorizationLevel.name());
                    responseWriter.writeString(responseFieldArr[7], UpdateAccountMembership.this.signature);
                    responseWriter.writeBoolean(responseFieldArr[8], UpdateAccountMembership.this.isBillingMember);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateAccountMembership.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateAccountMembership.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], UpdateAccountMembership.this.addedOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdateAccountMembership.this.approvedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdateAccountMembership.this.approvedOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], UpdateAccountMembership.this.acceptedOn);
                    responseWriter.writeString(responseFieldArr[15], UpdateAccountMembership.this.userAccountStatus.name());
                    responseWriter.writeString(responseFieldArr[16], UpdateAccountMembership.this.whatsappApiAccess);
                    responseWriter.writeString(responseFieldArr[17], UpdateAccountMembership.this.sharedInboxPermission);
                    responseWriter.writeString(responseFieldArr[18], UpdateAccountMembership.this.canInitiateNewConversation);
                    responseWriter.writeString(responseFieldArr[19], UpdateAccountMembership.this.canCreateWaCampaigns);
                    responseWriter.writeBoolean(responseFieldArr[20], Boolean.valueOf(UpdateAccountMembership.this.mapRegisteredMobileNumberToAccount));
                    responseWriter.writeBoolean(responseFieldArr[21], Boolean.valueOf(UpdateAccountMembership.this.mapSecondaryMobileNumberToAccount));
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], UpdateAccountMembership.this.accountEmail);
                    responseWriter.writeBoolean(responseFieldArr[23], UpdateAccountMembership.this.accountEmailVerified);
                    responseWriter.writeList(responseFieldArr[24], UpdateAccountMembership.this.notificationPreferences, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdateAccountMembership.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((NotificationPreference) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], UpdateAccountMembership.this.migrateToUserIdOnRemoval);
                    responseWriter.writeBoolean(responseFieldArr[26], UpdateAccountMembership.this.prefScreenPop);
                    responseWriter.writeBoolean(responseFieldArr[27], UpdateAccountMembership.this.prefSaveBusinessCall);
                    responseWriter.writeBoolean(responseFieldArr[28], UpdateAccountMembership.this.prefPostCallDisposition);
                    responseWriter.writeInt(responseFieldArr[29], UpdateAccountMembership.this.prefDefaultSimToCall);
                    responseWriter.writeBoolean(responseFieldArr[30], UpdateAccountMembership.this.prefTrackLocationOnActivity);
                    responseWriter.writeBoolean(responseFieldArr[31], UpdateAccountMembership.this.prefUseBusinessWhatsapp);
                    responseWriter.writeBoolean(responseFieldArr[32], UpdateAccountMembership.this.prefTrackAllCalls);
                    responseWriter.writeInt(responseFieldArr[33], UpdateAccountMembership.this.prefTrackAllCallsSpecificSim);
                    responseWriter.writeBoolean(responseFieldArr[34], UpdateAccountMembership.this.onLeave);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[35], UpdateAccountMembership.this.onLeaveTill);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[36], UpdateAccountMembership.this.lastViewedChatNotification);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], UpdateAccountMembership.this.prefReadOnlyInfo);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], UpdateAccountMembership.this.customMemberAttributes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], UpdateAccountMembership.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[40], UpdateAccountMembership.this.updatedAt);
                    ResponseField responseField = responseFieldArr[41];
                    Account account = UpdateAccountMembership.this.account;
                    responseWriter.writeObject(responseField, account != null ? account.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[42];
                    User user = UpdateAccountMembership.this.user;
                    responseWriter.writeObject(responseField2, user != null ? user.marshaller() : null);
                    ResponseField responseField3 = responseFieldArr[43];
                    AddedBy addedBy = UpdateAccountMembership.this.addedBy;
                    responseWriter.writeObject(responseField3, addedBy != null ? addedBy.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[44];
                    UpdatedBy updatedBy = UpdateAccountMembership.this.updatedBy;
                    responseWriter.writeObject(responseField4, updatedBy != null ? updatedBy.marshaller() : null);
                    ResponseField responseField5 = responseFieldArr[45];
                    ApprovedBy approvedBy = UpdateAccountMembership.this.approvedBy;
                    responseWriter.writeObject(responseField5, approvedBy != null ? approvedBy.marshaller() : null);
                }
            };
        }

        public String migrateToUserIdOnRemoval() {
            return this.migrateToUserIdOnRemoval;
        }

        public List<NotificationPreference> notificationPreferences() {
            return this.notificationPreferences;
        }

        public Boolean onLeave() {
            return this.onLeave;
        }

        public String onLeaveTill() {
            return this.onLeaveTill;
        }

        public Integer prefDefaultSimToCall() {
            return this.prefDefaultSimToCall;
        }

        public Boolean prefPostCallDisposition() {
            return this.prefPostCallDisposition;
        }

        public String prefReadOnlyInfo() {
            return this.prefReadOnlyInfo;
        }

        public Boolean prefSaveBusinessCall() {
            return this.prefSaveBusinessCall;
        }

        public Boolean prefScreenPop() {
            return this.prefScreenPop;
        }

        public Boolean prefTrackAllCalls() {
            return this.prefTrackAllCalls;
        }

        public Integer prefTrackAllCallsSpecificSim() {
            return this.prefTrackAllCallsSpecificSim;
        }

        public Boolean prefTrackLocationOnActivity() {
            return this.prefTrackLocationOnActivity;
        }

        public Boolean prefUseBusinessWhatsapp() {
            return this.prefUseBusinessWhatsapp;
        }

        public String sharedInboxPermission() {
            return this.sharedInboxPermission;
        }

        public String signature() {
            return this.signature;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateAccountMembership{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", allowedDeviceId=" + this.allowedDeviceId + ", designation=" + this.designation + ", authorizationLevel=" + this.authorizationLevel + ", signature=" + this.signature + ", isBillingMember=" + this.isBillingMember + ", addedById=" + this.addedById + ", updatedById=" + this.updatedById + ", addedOn=" + this.addedOn + ", approvedById=" + this.approvedById + ", approvedOn=" + this.approvedOn + ", acceptedOn=" + this.acceptedOn + ", userAccountStatus=" + this.userAccountStatus + ", whatsappApiAccess=" + this.whatsappApiAccess + ", sharedInboxPermission=" + this.sharedInboxPermission + ", canInitiateNewConversation=" + this.canInitiateNewConversation + ", canCreateWaCampaigns=" + this.canCreateWaCampaigns + ", mapRegisteredMobileNumberToAccount=" + this.mapRegisteredMobileNumberToAccount + ", mapSecondaryMobileNumberToAccount=" + this.mapSecondaryMobileNumberToAccount + ", accountEmail=" + this.accountEmail + ", accountEmailVerified=" + this.accountEmailVerified + ", notificationPreferences=" + this.notificationPreferences + ", migrateToUserIdOnRemoval=" + this.migrateToUserIdOnRemoval + ", prefScreenPop=" + this.prefScreenPop + ", prefSaveBusinessCall=" + this.prefSaveBusinessCall + ", prefPostCallDisposition=" + this.prefPostCallDisposition + ", prefDefaultSimToCall=" + this.prefDefaultSimToCall + ", prefTrackLocationOnActivity=" + this.prefTrackLocationOnActivity + ", prefUseBusinessWhatsapp=" + this.prefUseBusinessWhatsapp + ", prefTrackAllCalls=" + this.prefTrackAllCalls + ", prefTrackAllCallsSpecificSim=" + this.prefTrackAllCallsSpecificSim + ", onLeave=" + this.onLeave + ", onLeaveTill=" + this.onLeaveTill + ", lastViewedChatNotification=" + this.lastViewedChatNotification + ", prefReadOnlyInfo=" + this.prefReadOnlyInfo + ", customMemberAttributes=" + this.customMemberAttributes + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", account=" + this.account + ", user=" + this.user + ", addedBy=" + this.addedBy + ", updatedBy=" + this.updatedBy + ", approvedBy=" + this.approvedBy + "}";
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

        public UserStatus userAccountStatus() {
            return this.userAccountStatus;
        }

        public String userId() {
            return this.userId;
        }

        public String whatsappApiAccess() {
            return this.whatsappApiAccess;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.UpdatedBy.1
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.User.1
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
        private final ModelAccountMembershipConditionInput condition;
        private final UpdateAccountMembershipInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateAccountMembershipInput updateAccountMembershipInput, ModelAccountMembershipConditionInput modelAccountMembershipConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateAccountMembershipInput;
            this.condition = modelAccountMembershipConditionInput;
            linkedHashMap.put("input", updateAccountMembershipInput);
            linkedHashMap.put("condition", modelAccountMembershipConditionInput);
        }

        public ModelAccountMembershipConditionInput condition() {
            return this.condition;
        }

        public UpdateAccountMembershipInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateAccountMembershipMutation.Variables.1
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

    public UpdateAccountMembershipMutation(UpdateAccountMembershipInput updateAccountMembershipInput, ModelAccountMembershipConditionInput modelAccountMembershipConditionInput) {
        Utils.checkNotNull(updateAccountMembershipInput, "input == null");
        this.variables = new Variables(updateAccountMembershipInput, modelAccountMembershipConditionInput);
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
        return "06ae1f2ee7357ae036a3d35c597a1125e916e9124e44c91f06f39f14045b219b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateAccountMembership($input: UpdateAccountMembershipInput!, $condition: ModelAccountMembershipConditionInput) {\n  updateAccountMembership(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    allowedDeviceId\n    designation\n    authorizationLevel\n    signature\n    isBillingMember\n    addedById\n    updatedById\n    addedOn\n    approvedById\n    approvedOn\n    acceptedOn\n    userAccountStatus\n    whatsappApiAccess\n    sharedInboxPermission\n    canInitiateNewConversation\n    canCreateWaCampaigns\n    mapRegisteredMobileNumberToAccount\n    mapSecondaryMobileNumberToAccount\n    accountEmail\n    accountEmailVerified\n    notificationPreferences {\n      __typename\n      notificationType\n      channels\n    }\n    migrateToUserIdOnRemoval\n    prefScreenPop\n    prefSaveBusinessCall\n    prefPostCallDisposition\n    prefDefaultSimToCall\n    prefTrackLocationOnActivity\n    prefUseBusinessWhatsapp\n    prefTrackAllCalls\n    prefTrackAllCallsSpecificSim\n    onLeave\n    onLeaveTill\n    lastViewedChatNotification\n    prefReadOnlyInfo\n    customMemberAttributes\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    user {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    approvedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
