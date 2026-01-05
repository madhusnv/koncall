package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
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
import type.HasParent;
import type.ScopeLevel;
import type.UserRegistrationStatus;

/* loaded from: classes7.dex */
public final class GetUploadedFileQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetUploadedFile($id: ID!) {\n  getUploadedFile(id: $id) {\n    __typename\n    id\n    accountId\n    fileUrl\n    fileStorageDestination\n    fileName\n    description\n    documentCategory\n    documentSubCategory\n    tags\n    templateType\n    templateTitle\n    templateBody\n    templateLastUsed\n    templateExternalLink\n    uploadSource\n    fileMetaData\n    fileMimeType\n    fileThumbnailUrl\n    hasParent\n    parentFileId\n    scopeLevel\n    scopeId\n    uploadedById\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    parentFile {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    childFiles {\n      __typename\n      nextToken\n    }\n    associations {\n      __typename\n      nextToken\n    }\n    uploadedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetUploadedFile";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetUploadedFile($id: ID!) {\n  getUploadedFile(id: $id) {\n    __typename\n    id\n    accountId\n    fileUrl\n    fileStorageDestination\n    fileName\n    description\n    documentCategory\n    documentSubCategory\n    tags\n    templateType\n    templateTitle\n    templateBody\n    templateLastUsed\n    templateExternalLink\n    uploadSource\n    fileMetaData\n    fileMimeType\n    fileThumbnailUrl\n    hasParent\n    parentFileId\n    scopeLevel\n    scopeId\n    uploadedById\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    parentFile {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    childFiles {\n      __typename\n      nextToken\n    }\n    associations {\n      __typename\n      nextToken\n    }\n    uploadedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
                return new Account(string, str, string2, accountTypeValueOf, string4, str2, string5 != null ? AccountStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readString(responseFieldArr[31]), responseReader.readString(responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readInt(responseFieldArr[34]), responseReader.readBoolean(responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readList(responseFieldArr[39], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readBoolean(responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readList(responseFieldArr[45], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[46], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readList(responseFieldArr[51], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.Mapper.5
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.1
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
                    responseWriter.writeList(responseFieldArr[15], Account.this.productOrService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.1.1
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
                    responseWriter.writeList(responseFieldArr[39], Account.this.permissions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.1.2
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
                    responseWriter.writeList(responseFieldArr[45], Account.this.salesmaxSalesContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[46], Account.this.salesmaxSupportContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], Account.this.chatWidgetConfig);
                    responseWriter.writeString(responseFieldArr[48], Account.this.onboardingStatus);
                    responseWriter.writeString(responseFieldArr[49], Account.this.integrationNeeded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], Account.this.matchingDealId);
                    responseWriter.writeList(responseFieldArr[51], Account.this.relatedAccountIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Account.1.5
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

    public static class Associations {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Associations> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Associations map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Associations.$responseFields;
                return new Associations(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Associations(String str, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Associations)) {
                return false;
            }
            Associations associations = (Associations) obj;
            if (this.__typename.equals(associations.__typename)) {
                String str = this.nextToken;
                String str2 = associations.nextToken;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Associations.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Associations.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Associations.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Associations.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Associations{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Builder {
        private String id;

        public GetUploadedFileQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetUploadedFileQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class ChildFiles {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ChildFiles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ChildFiles map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ChildFiles.$responseFields;
                return new ChildFiles(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public ChildFiles(String str, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChildFiles)) {
                return false;
            }
            ChildFiles childFiles = (ChildFiles) obj;
            if (this.__typename.equals(childFiles.__typename)) {
                String str = this.nextToken;
                String str2 = childFiles.nextToken;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.ChildFiles.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ChildFiles.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ChildFiles.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ChildFiles.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ChildFiles{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getUploadedFile", "getUploadedFile", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetUploadedFile getUploadedFile;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetUploadedFile.Mapper getUploadedFileFieldMapper = new GetUploadedFile.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetUploadedFile) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetUploadedFile>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetUploadedFile read(ResponseReader responseReader2) {
                        return Mapper.this.getUploadedFileFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetUploadedFile getUploadedFile) {
            this.getUploadedFile = getUploadedFile;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetUploadedFile getUploadedFile = this.getUploadedFile;
            GetUploadedFile getUploadedFile2 = ((Data) obj).getUploadedFile;
            return getUploadedFile == null ? getUploadedFile2 == null : getUploadedFile.equals(getUploadedFile2);
        }

        public GetUploadedFile getUploadedFile() {
            return this.getUploadedFile;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetUploadedFile getUploadedFile = this.getUploadedFile;
                this.$hashCode = (getUploadedFile == null ? 0 : getUploadedFile.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetUploadedFile getUploadedFile = Data.this.getUploadedFile;
                    responseWriter.writeObject(responseField, getUploadedFile != null ? getUploadedFile.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getUploadedFile=" + this.getUploadedFile + "}";
            }
            return this.$toString;
        }
    }

    public static class GetUploadedFile {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Account account;
        final String accountId;
        final Associations associations;
        final ChildFiles childFiles;
        final String createdAt;
        final String description;
        final String documentCategory;
        final String documentSubCategory;
        final String fileMetaData;
        final String fileMimeType;
        final String fileName;
        final String fileStorageDestination;
        final String fileThumbnailUrl;
        final String fileUrl;
        final HasParent hasParent;
        final String id;
        final ParentFile parentFile;
        final String parentFileId;
        final String scopeId;
        final ScopeLevel scopeLevel;
        final List<String> tags;
        final String templateBody;
        final String templateExternalLink;
        final String templateLastUsed;
        final String templateTitle;
        final String templateType;
        final String updatedAt;
        final String uploadSource;
        final UploadedBy uploadedBy;
        final String uploadedById;

        public static final class Mapper implements ResponseFieldMapper<GetUploadedFile> {
            final Account.Mapper accountFieldMapper = new Account.Mapper();
            final ParentFile.Mapper parentFileFieldMapper = new ParentFile.Mapper();
            final ChildFiles.Mapper childFilesFieldMapper = new ChildFiles.Mapper();
            final Associations.Mapper associationsFieldMapper = new Associations.Mapper();
            final UploadedBy.Mapper uploadedByFieldMapper = new UploadedBy.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetUploadedFile map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetUploadedFile.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                List list = responseReader.readList(responseFieldArr[9], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.GetUploadedFile.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string8 = responseReader.readString(responseFieldArr[10]);
                String string9 = responseReader.readString(responseFieldArr[11]);
                String string10 = responseReader.readString(responseFieldArr[12]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                String string11 = responseReader.readString(responseFieldArr[14]);
                String string12 = responseReader.readString(responseFieldArr[15]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String string13 = responseReader.readString(responseFieldArr[17]);
                String string14 = responseReader.readString(responseFieldArr[18]);
                String string15 = responseReader.readString(responseFieldArr[19]);
                HasParent hasParentValueOf = string15 != null ? HasParent.valueOf(string15) : null;
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]);
                String string16 = responseReader.readString(responseFieldArr[21]);
                return new GetUploadedFile(string, str, str2, string2, string3, string4, string5, string6, string7, list, string8, string9, string10, str3, string11, string12, str4, string13, string14, hasParentValueOf, str5, string16 != null ? ScopeLevel.valueOf(string16) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (Account) responseReader.readObject(responseFieldArr[26], new ResponseReader.ObjectReader<Account>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.GetUploadedFile.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Account read(ResponseReader responseReader2) {
                        return Mapper.this.accountFieldMapper.map(responseReader2);
                    }
                }), (ParentFile) responseReader.readObject(responseFieldArr[27], new ResponseReader.ObjectReader<ParentFile>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.GetUploadedFile.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ParentFile read(ResponseReader responseReader2) {
                        return Mapper.this.parentFileFieldMapper.map(responseReader2);
                    }
                }), (ChildFiles) responseReader.readObject(responseFieldArr[28], new ResponseReader.ObjectReader<ChildFiles>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.GetUploadedFile.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ChildFiles read(ResponseReader responseReader2) {
                        return Mapper.this.childFilesFieldMapper.map(responseReader2);
                    }
                }), (Associations) responseReader.readObject(responseFieldArr[29], new ResponseReader.ObjectReader<Associations>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.GetUploadedFile.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Associations read(ResponseReader responseReader2) {
                        return Mapper.this.associationsFieldMapper.map(responseReader2);
                    }
                }), (UploadedBy) responseReader.readObject(responseFieldArr[30], new ResponseReader.ObjectReader<UploadedBy>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.GetUploadedFile.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UploadedBy read(ResponseReader responseReader2) {
                        return Mapper.this.uploadedByFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileUrl", "fileUrl", null, true, Collections.emptyList()), ResponseField.forString("fileStorageDestination", "fileStorageDestination", null, true, Collections.emptyList()), ResponseField.forString("fileName", "fileName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("documentCategory", "documentCategory", null, true, Collections.emptyList()), ResponseField.forString("documentSubCategory", "documentSubCategory", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("templateType", "templateType", null, true, Collections.emptyList()), ResponseField.forString("templateTitle", "templateTitle", null, true, Collections.emptyList()), ResponseField.forString("templateBody", "templateBody", null, true, Collections.emptyList()), ResponseField.forCustomType("templateLastUsed", "templateLastUsed", null, true, customType2, Collections.emptyList()), ResponseField.forString("templateExternalLink", "templateExternalLink", null, true, Collections.emptyList()), ResponseField.forString("uploadSource", "uploadSource", null, true, Collections.emptyList()), ResponseField.forCustomType("fileMetaData", "fileMetaData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("fileMimeType", "fileMimeType", null, true, Collections.emptyList()), ResponseField.forString("fileThumbnailUrl", "fileThumbnailUrl", null, true, Collections.emptyList()), ResponseField.forString("hasParent", "hasParent", null, true, Collections.emptyList()), ResponseField.forCustomType("parentFileId", "parentFileId", null, true, customType, Collections.emptyList()), ResponseField.forString("scopeLevel", "scopeLevel", null, true, Collections.emptyList()), ResponseField.forCustomType("scopeId", "scopeId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("uploadedById", "uploadedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("account", "account", null, true, Collections.emptyList()), ResponseField.forObject("parentFile", "parentFile", null, true, Collections.emptyList()), ResponseField.forObject("childFiles", "childFiles", null, true, Collections.emptyList()), ResponseField.forObject("associations", "associations", null, true, Collections.emptyList()), ResponseField.forObject("uploadedBy", "uploadedBy", null, true, Collections.emptyList())};
        }

        public GetUploadedFile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, HasParent hasParent, String str19, ScopeLevel scopeLevel, String str20, String str21, String str22, String str23, Account account, ParentFile parentFile, ChildFiles childFiles, Associations associations, UploadedBy uploadedBy) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.fileUrl = str4;
            this.fileStorageDestination = str5;
            this.fileName = str6;
            this.description = str7;
            this.documentCategory = str8;
            this.documentSubCategory = str9;
            this.tags = list;
            this.templateType = str10;
            this.templateTitle = str11;
            this.templateBody = str12;
            this.templateLastUsed = str13;
            this.templateExternalLink = str14;
            this.uploadSource = str15;
            this.fileMetaData = str16;
            this.fileMimeType = str17;
            this.fileThumbnailUrl = str18;
            this.hasParent = hasParent;
            this.parentFileId = str19;
            this.scopeLevel = scopeLevel;
            this.scopeId = str20;
            this.uploadedById = str21;
            this.createdAt = str22;
            this.updatedAt = str23;
            this.account = account;
            this.parentFile = parentFile;
            this.childFiles = childFiles;
            this.associations = associations;
            this.uploadedBy = uploadedBy;
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

        public Associations associations() {
            return this.associations;
        }

        public ChildFiles childFiles() {
            return this.childFiles;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String description() {
            return this.description;
        }

        public String documentCategory() {
            return this.documentCategory;
        }

        public String documentSubCategory() {
            return this.documentSubCategory;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            List<String> list;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            HasParent hasParent;
            String str16;
            ScopeLevel scopeLevel;
            String str17;
            String str18;
            String str19;
            String str20;
            Account account;
            ParentFile parentFile;
            ChildFiles childFiles;
            Associations associations;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUploadedFile)) {
                return false;
            }
            GetUploadedFile getUploadedFile = (GetUploadedFile) obj;
            if (this.__typename.equals(getUploadedFile.__typename) && this.id.equals(getUploadedFile.id) && this.accountId.equals(getUploadedFile.accountId) && ((str = this.fileUrl) != null ? str.equals(getUploadedFile.fileUrl) : getUploadedFile.fileUrl == null) && ((str2 = this.fileStorageDestination) != null ? str2.equals(getUploadedFile.fileStorageDestination) : getUploadedFile.fileStorageDestination == null) && ((str3 = this.fileName) != null ? str3.equals(getUploadedFile.fileName) : getUploadedFile.fileName == null) && ((str4 = this.description) != null ? str4.equals(getUploadedFile.description) : getUploadedFile.description == null) && ((str5 = this.documentCategory) != null ? str5.equals(getUploadedFile.documentCategory) : getUploadedFile.documentCategory == null) && ((str6 = this.documentSubCategory) != null ? str6.equals(getUploadedFile.documentSubCategory) : getUploadedFile.documentSubCategory == null) && ((list = this.tags) != null ? list.equals(getUploadedFile.tags) : getUploadedFile.tags == null) && ((str7 = this.templateType) != null ? str7.equals(getUploadedFile.templateType) : getUploadedFile.templateType == null) && ((str8 = this.templateTitle) != null ? str8.equals(getUploadedFile.templateTitle) : getUploadedFile.templateTitle == null) && ((str9 = this.templateBody) != null ? str9.equals(getUploadedFile.templateBody) : getUploadedFile.templateBody == null) && ((str10 = this.templateLastUsed) != null ? str10.equals(getUploadedFile.templateLastUsed) : getUploadedFile.templateLastUsed == null) && ((str11 = this.templateExternalLink) != null ? str11.equals(getUploadedFile.templateExternalLink) : getUploadedFile.templateExternalLink == null) && ((str12 = this.uploadSource) != null ? str12.equals(getUploadedFile.uploadSource) : getUploadedFile.uploadSource == null) && ((str13 = this.fileMetaData) != null ? str13.equals(getUploadedFile.fileMetaData) : getUploadedFile.fileMetaData == null) && ((str14 = this.fileMimeType) != null ? str14.equals(getUploadedFile.fileMimeType) : getUploadedFile.fileMimeType == null) && ((str15 = this.fileThumbnailUrl) != null ? str15.equals(getUploadedFile.fileThumbnailUrl) : getUploadedFile.fileThumbnailUrl == null) && ((hasParent = this.hasParent) != null ? hasParent.equals(getUploadedFile.hasParent) : getUploadedFile.hasParent == null) && ((str16 = this.parentFileId) != null ? str16.equals(getUploadedFile.parentFileId) : getUploadedFile.parentFileId == null) && ((scopeLevel = this.scopeLevel) != null ? scopeLevel.equals(getUploadedFile.scopeLevel) : getUploadedFile.scopeLevel == null) && ((str17 = this.scopeId) != null ? str17.equals(getUploadedFile.scopeId) : getUploadedFile.scopeId == null) && ((str18 = this.uploadedById) != null ? str18.equals(getUploadedFile.uploadedById) : getUploadedFile.uploadedById == null) && ((str19 = this.createdAt) != null ? str19.equals(getUploadedFile.createdAt) : getUploadedFile.createdAt == null) && ((str20 = this.updatedAt) != null ? str20.equals(getUploadedFile.updatedAt) : getUploadedFile.updatedAt == null) && ((account = this.account) != null ? account.equals(getUploadedFile.account) : getUploadedFile.account == null) && ((parentFile = this.parentFile) != null ? parentFile.equals(getUploadedFile.parentFile) : getUploadedFile.parentFile == null) && ((childFiles = this.childFiles) != null ? childFiles.equals(getUploadedFile.childFiles) : getUploadedFile.childFiles == null) && ((associations = this.associations) != null ? associations.equals(getUploadedFile.associations) : getUploadedFile.associations == null)) {
                UploadedBy uploadedBy = this.uploadedBy;
                UploadedBy uploadedBy2 = getUploadedFile.uploadedBy;
                if (uploadedBy == null) {
                    if (uploadedBy2 == null) {
                        return true;
                    }
                } else if (uploadedBy.equals(uploadedBy2)) {
                    return true;
                }
            }
            return false;
        }

        public String fileMetaData() {
            return this.fileMetaData;
        }

        public String fileMimeType() {
            return this.fileMimeType;
        }

        public String fileName() {
            return this.fileName;
        }

        public String fileStorageDestination() {
            return this.fileStorageDestination;
        }

        public String fileThumbnailUrl() {
            return this.fileThumbnailUrl;
        }

        public String fileUrl() {
            return this.fileUrl;
        }

        public HasParent hasParent() {
            return this.hasParent;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.fileUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.fileStorageDestination;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.fileName;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.description;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.documentCategory;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.documentSubCategory;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode8 = (iHashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str7 = this.templateType;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.templateTitle;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.templateBody;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.templateLastUsed;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.templateExternalLink;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.uploadSource;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.fileMetaData;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.fileMimeType;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.fileThumbnailUrl;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                HasParent hasParent = this.hasParent;
                int iHashCode18 = (iHashCode17 ^ (hasParent == null ? 0 : hasParent.hashCode())) * 1000003;
                String str16 = this.parentFileId;
                int iHashCode19 = (iHashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                ScopeLevel scopeLevel = this.scopeLevel;
                int iHashCode20 = (iHashCode19 ^ (scopeLevel == null ? 0 : scopeLevel.hashCode())) * 1000003;
                String str17 = this.scopeId;
                int iHashCode21 = (iHashCode20 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.uploadedById;
                int iHashCode22 = (iHashCode21 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.createdAt;
                int iHashCode23 = (iHashCode22 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.updatedAt;
                int iHashCode24 = (iHashCode23 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                Account account = this.account;
                int iHashCode25 = (iHashCode24 ^ (account == null ? 0 : account.hashCode())) * 1000003;
                ParentFile parentFile = this.parentFile;
                int iHashCode26 = (iHashCode25 ^ (parentFile == null ? 0 : parentFile.hashCode())) * 1000003;
                ChildFiles childFiles = this.childFiles;
                int iHashCode27 = (iHashCode26 ^ (childFiles == null ? 0 : childFiles.hashCode())) * 1000003;
                Associations associations = this.associations;
                int iHashCode28 = (iHashCode27 ^ (associations == null ? 0 : associations.hashCode())) * 1000003;
                UploadedBy uploadedBy = this.uploadedBy;
                this.$hashCode = iHashCode28 ^ (uploadedBy != null ? uploadedBy.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.GetUploadedFile.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetUploadedFile.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetUploadedFile.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetUploadedFile.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetUploadedFile.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], GetUploadedFile.this.fileUrl);
                    responseWriter.writeString(responseFieldArr[4], GetUploadedFile.this.fileStorageDestination);
                    responseWriter.writeString(responseFieldArr[5], GetUploadedFile.this.fileName);
                    responseWriter.writeString(responseFieldArr[6], GetUploadedFile.this.description);
                    responseWriter.writeString(responseFieldArr[7], GetUploadedFile.this.documentCategory);
                    responseWriter.writeString(responseFieldArr[8], GetUploadedFile.this.documentSubCategory);
                    responseWriter.writeList(responseFieldArr[9], GetUploadedFile.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.GetUploadedFile.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[10], GetUploadedFile.this.templateType);
                    responseWriter.writeString(responseFieldArr[11], GetUploadedFile.this.templateTitle);
                    responseWriter.writeString(responseFieldArr[12], GetUploadedFile.this.templateBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], GetUploadedFile.this.templateLastUsed);
                    responseWriter.writeString(responseFieldArr[14], GetUploadedFile.this.templateExternalLink);
                    responseWriter.writeString(responseFieldArr[15], GetUploadedFile.this.uploadSource);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], GetUploadedFile.this.fileMetaData);
                    responseWriter.writeString(responseFieldArr[17], GetUploadedFile.this.fileMimeType);
                    responseWriter.writeString(responseFieldArr[18], GetUploadedFile.this.fileThumbnailUrl);
                    ResponseField responseField = responseFieldArr[19];
                    HasParent hasParent = GetUploadedFile.this.hasParent;
                    responseWriter.writeString(responseField, hasParent != null ? hasParent.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], GetUploadedFile.this.parentFileId);
                    ResponseField responseField2 = responseFieldArr[21];
                    ScopeLevel scopeLevel = GetUploadedFile.this.scopeLevel;
                    responseWriter.writeString(responseField2, scopeLevel != null ? scopeLevel.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], GetUploadedFile.this.scopeId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], GetUploadedFile.this.uploadedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], GetUploadedFile.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], GetUploadedFile.this.updatedAt);
                    ResponseField responseField3 = responseFieldArr[26];
                    Account account = GetUploadedFile.this.account;
                    responseWriter.writeObject(responseField3, account != null ? account.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[27];
                    ParentFile parentFile = GetUploadedFile.this.parentFile;
                    responseWriter.writeObject(responseField4, parentFile != null ? parentFile.marshaller() : null);
                    ResponseField responseField5 = responseFieldArr[28];
                    ChildFiles childFiles = GetUploadedFile.this.childFiles;
                    responseWriter.writeObject(responseField5, childFiles != null ? childFiles.marshaller() : null);
                    ResponseField responseField6 = responseFieldArr[29];
                    Associations associations = GetUploadedFile.this.associations;
                    responseWriter.writeObject(responseField6, associations != null ? associations.marshaller() : null);
                    ResponseField responseField7 = responseFieldArr[30];
                    UploadedBy uploadedBy = GetUploadedFile.this.uploadedBy;
                    responseWriter.writeObject(responseField7, uploadedBy != null ? uploadedBy.marshaller() : null);
                }
            };
        }

        public ParentFile parentFile() {
            return this.parentFile;
        }

        public String parentFileId() {
            return this.parentFileId;
        }

        public String scopeId() {
            return this.scopeId;
        }

        public ScopeLevel scopeLevel() {
            return this.scopeLevel;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String templateBody() {
            return this.templateBody;
        }

        public String templateExternalLink() {
            return this.templateExternalLink;
        }

        public String templateLastUsed() {
            return this.templateLastUsed;
        }

        public String templateTitle() {
            return this.templateTitle;
        }

        public String templateType() {
            return this.templateType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetUploadedFile{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", fileUrl=" + this.fileUrl + ", fileStorageDestination=" + this.fileStorageDestination + ", fileName=" + this.fileName + ", description=" + this.description + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", tags=" + this.tags + ", templateType=" + this.templateType + ", templateTitle=" + this.templateTitle + ", templateBody=" + this.templateBody + ", templateLastUsed=" + this.templateLastUsed + ", templateExternalLink=" + this.templateExternalLink + ", uploadSource=" + this.uploadSource + ", fileMetaData=" + this.fileMetaData + ", fileMimeType=" + this.fileMimeType + ", fileThumbnailUrl=" + this.fileThumbnailUrl + ", hasParent=" + this.hasParent + ", parentFileId=" + this.parentFileId + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", uploadedById=" + this.uploadedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", account=" + this.account + ", parentFile=" + this.parentFile + ", childFiles=" + this.childFiles + ", associations=" + this.associations + ", uploadedBy=" + this.uploadedBy + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String uploadSource() {
            return this.uploadSource;
        }

        public UploadedBy uploadedBy() {
            return this.uploadedBy;
        }

        public String uploadedById() {
            return this.uploadedById;
        }
    }

    public static class ParentFile {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String description;
        final String documentCategory;
        final String documentSubCategory;
        final String fileMetaData;
        final String fileMimeType;
        final String fileName;
        final String fileStorageDestination;
        final String fileThumbnailUrl;
        final String fileUrl;
        final HasParent hasParent;
        final String id;
        final String parentFileId;
        final String scopeId;
        final ScopeLevel scopeLevel;
        final List<String> tags;
        final String templateBody;
        final String templateExternalLink;
        final String templateLastUsed;
        final String templateTitle;
        final String templateType;
        final String updatedAt;
        final String uploadSource;
        final String uploadedById;

        public static final class Mapper implements ResponseFieldMapper<ParentFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ParentFile map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ParentFile.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                List list = responseReader.readList(responseFieldArr[9], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.ParentFile.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string8 = responseReader.readString(responseFieldArr[10]);
                String string9 = responseReader.readString(responseFieldArr[11]);
                String string10 = responseReader.readString(responseFieldArr[12]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                String string11 = responseReader.readString(responseFieldArr[14]);
                String string12 = responseReader.readString(responseFieldArr[15]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String string13 = responseReader.readString(responseFieldArr[17]);
                String string14 = responseReader.readString(responseFieldArr[18]);
                String string15 = responseReader.readString(responseFieldArr[19]);
                HasParent hasParentValueOf = string15 != null ? HasParent.valueOf(string15) : null;
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]);
                String string16 = responseReader.readString(responseFieldArr[21]);
                return new ParentFile(string, str, str2, string2, string3, string4, string5, string6, string7, list, string8, string9, string10, str3, string11, string12, str4, string13, string14, hasParentValueOf, str5, string16 != null ? ScopeLevel.valueOf(string16) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileUrl", "fileUrl", null, true, Collections.emptyList()), ResponseField.forString("fileStorageDestination", "fileStorageDestination", null, true, Collections.emptyList()), ResponseField.forString("fileName", "fileName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("documentCategory", "documentCategory", null, true, Collections.emptyList()), ResponseField.forString("documentSubCategory", "documentSubCategory", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("templateType", "templateType", null, true, Collections.emptyList()), ResponseField.forString("templateTitle", "templateTitle", null, true, Collections.emptyList()), ResponseField.forString("templateBody", "templateBody", null, true, Collections.emptyList()), ResponseField.forCustomType("templateLastUsed", "templateLastUsed", null, true, customType2, Collections.emptyList()), ResponseField.forString("templateExternalLink", "templateExternalLink", null, true, Collections.emptyList()), ResponseField.forString("uploadSource", "uploadSource", null, true, Collections.emptyList()), ResponseField.forCustomType("fileMetaData", "fileMetaData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("fileMimeType", "fileMimeType", null, true, Collections.emptyList()), ResponseField.forString("fileThumbnailUrl", "fileThumbnailUrl", null, true, Collections.emptyList()), ResponseField.forString("hasParent", "hasParent", null, true, Collections.emptyList()), ResponseField.forCustomType("parentFileId", "parentFileId", null, true, customType, Collections.emptyList()), ResponseField.forString("scopeLevel", "scopeLevel", null, true, Collections.emptyList()), ResponseField.forCustomType("scopeId", "scopeId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("uploadedById", "uploadedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public ParentFile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, HasParent hasParent, String str19, ScopeLevel scopeLevel, String str20, String str21, String str22, String str23) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.fileUrl = str4;
            this.fileStorageDestination = str5;
            this.fileName = str6;
            this.description = str7;
            this.documentCategory = str8;
            this.documentSubCategory = str9;
            this.tags = list;
            this.templateType = str10;
            this.templateTitle = str11;
            this.templateBody = str12;
            this.templateLastUsed = str13;
            this.templateExternalLink = str14;
            this.uploadSource = str15;
            this.fileMetaData = str16;
            this.fileMimeType = str17;
            this.fileThumbnailUrl = str18;
            this.hasParent = hasParent;
            this.parentFileId = str19;
            this.scopeLevel = scopeLevel;
            this.scopeId = str20;
            this.uploadedById = str21;
            this.createdAt = str22;
            this.updatedAt = str23;
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

        public String description() {
            return this.description;
        }

        public String documentCategory() {
            return this.documentCategory;
        }

        public String documentSubCategory() {
            return this.documentSubCategory;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            List<String> list;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            HasParent hasParent;
            String str16;
            ScopeLevel scopeLevel;
            String str17;
            String str18;
            String str19;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ParentFile)) {
                return false;
            }
            ParentFile parentFile = (ParentFile) obj;
            if (this.__typename.equals(parentFile.__typename) && this.id.equals(parentFile.id) && this.accountId.equals(parentFile.accountId) && ((str = this.fileUrl) != null ? str.equals(parentFile.fileUrl) : parentFile.fileUrl == null) && ((str2 = this.fileStorageDestination) != null ? str2.equals(parentFile.fileStorageDestination) : parentFile.fileStorageDestination == null) && ((str3 = this.fileName) != null ? str3.equals(parentFile.fileName) : parentFile.fileName == null) && ((str4 = this.description) != null ? str4.equals(parentFile.description) : parentFile.description == null) && ((str5 = this.documentCategory) != null ? str5.equals(parentFile.documentCategory) : parentFile.documentCategory == null) && ((str6 = this.documentSubCategory) != null ? str6.equals(parentFile.documentSubCategory) : parentFile.documentSubCategory == null) && ((list = this.tags) != null ? list.equals(parentFile.tags) : parentFile.tags == null) && ((str7 = this.templateType) != null ? str7.equals(parentFile.templateType) : parentFile.templateType == null) && ((str8 = this.templateTitle) != null ? str8.equals(parentFile.templateTitle) : parentFile.templateTitle == null) && ((str9 = this.templateBody) != null ? str9.equals(parentFile.templateBody) : parentFile.templateBody == null) && ((str10 = this.templateLastUsed) != null ? str10.equals(parentFile.templateLastUsed) : parentFile.templateLastUsed == null) && ((str11 = this.templateExternalLink) != null ? str11.equals(parentFile.templateExternalLink) : parentFile.templateExternalLink == null) && ((str12 = this.uploadSource) != null ? str12.equals(parentFile.uploadSource) : parentFile.uploadSource == null) && ((str13 = this.fileMetaData) != null ? str13.equals(parentFile.fileMetaData) : parentFile.fileMetaData == null) && ((str14 = this.fileMimeType) != null ? str14.equals(parentFile.fileMimeType) : parentFile.fileMimeType == null) && ((str15 = this.fileThumbnailUrl) != null ? str15.equals(parentFile.fileThumbnailUrl) : parentFile.fileThumbnailUrl == null) && ((hasParent = this.hasParent) != null ? hasParent.equals(parentFile.hasParent) : parentFile.hasParent == null) && ((str16 = this.parentFileId) != null ? str16.equals(parentFile.parentFileId) : parentFile.parentFileId == null) && ((scopeLevel = this.scopeLevel) != null ? scopeLevel.equals(parentFile.scopeLevel) : parentFile.scopeLevel == null) && ((str17 = this.scopeId) != null ? str17.equals(parentFile.scopeId) : parentFile.scopeId == null) && ((str18 = this.uploadedById) != null ? str18.equals(parentFile.uploadedById) : parentFile.uploadedById == null) && ((str19 = this.createdAt) != null ? str19.equals(parentFile.createdAt) : parentFile.createdAt == null)) {
                String str20 = this.updatedAt;
                String str21 = parentFile.updatedAt;
                if (str20 == null) {
                    if (str21 == null) {
                        return true;
                    }
                } else if (str20.equals(str21)) {
                    return true;
                }
            }
            return false;
        }

        public String fileMetaData() {
            return this.fileMetaData;
        }

        public String fileMimeType() {
            return this.fileMimeType;
        }

        public String fileName() {
            return this.fileName;
        }

        public String fileStorageDestination() {
            return this.fileStorageDestination;
        }

        public String fileThumbnailUrl() {
            return this.fileThumbnailUrl;
        }

        public String fileUrl() {
            return this.fileUrl;
        }

        public HasParent hasParent() {
            return this.hasParent;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.fileUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.fileStorageDestination;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.fileName;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.description;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.documentCategory;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.documentSubCategory;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode8 = (iHashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str7 = this.templateType;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.templateTitle;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.templateBody;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.templateLastUsed;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.templateExternalLink;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.uploadSource;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.fileMetaData;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.fileMimeType;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.fileThumbnailUrl;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                HasParent hasParent = this.hasParent;
                int iHashCode18 = (iHashCode17 ^ (hasParent == null ? 0 : hasParent.hashCode())) * 1000003;
                String str16 = this.parentFileId;
                int iHashCode19 = (iHashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                ScopeLevel scopeLevel = this.scopeLevel;
                int iHashCode20 = (iHashCode19 ^ (scopeLevel == null ? 0 : scopeLevel.hashCode())) * 1000003;
                String str17 = this.scopeId;
                int iHashCode21 = (iHashCode20 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.uploadedById;
                int iHashCode22 = (iHashCode21 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.createdAt;
                int iHashCode23 = (iHashCode22 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.updatedAt;
                this.$hashCode = iHashCode23 ^ (str20 != null ? str20.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.ParentFile.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ParentFile.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ParentFile.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ParentFile.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ParentFile.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], ParentFile.this.fileUrl);
                    responseWriter.writeString(responseFieldArr[4], ParentFile.this.fileStorageDestination);
                    responseWriter.writeString(responseFieldArr[5], ParentFile.this.fileName);
                    responseWriter.writeString(responseFieldArr[6], ParentFile.this.description);
                    responseWriter.writeString(responseFieldArr[7], ParentFile.this.documentCategory);
                    responseWriter.writeString(responseFieldArr[8], ParentFile.this.documentSubCategory);
                    responseWriter.writeList(responseFieldArr[9], ParentFile.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.ParentFile.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[10], ParentFile.this.templateType);
                    responseWriter.writeString(responseFieldArr[11], ParentFile.this.templateTitle);
                    responseWriter.writeString(responseFieldArr[12], ParentFile.this.templateBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], ParentFile.this.templateLastUsed);
                    responseWriter.writeString(responseFieldArr[14], ParentFile.this.templateExternalLink);
                    responseWriter.writeString(responseFieldArr[15], ParentFile.this.uploadSource);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], ParentFile.this.fileMetaData);
                    responseWriter.writeString(responseFieldArr[17], ParentFile.this.fileMimeType);
                    responseWriter.writeString(responseFieldArr[18], ParentFile.this.fileThumbnailUrl);
                    ResponseField responseField = responseFieldArr[19];
                    HasParent hasParent = ParentFile.this.hasParent;
                    responseWriter.writeString(responseField, hasParent != null ? hasParent.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], ParentFile.this.parentFileId);
                    ResponseField responseField2 = responseFieldArr[21];
                    ScopeLevel scopeLevel = ParentFile.this.scopeLevel;
                    responseWriter.writeString(responseField2, scopeLevel != null ? scopeLevel.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], ParentFile.this.scopeId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], ParentFile.this.uploadedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], ParentFile.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], ParentFile.this.updatedAt);
                }
            };
        }

        public String parentFileId() {
            return this.parentFileId;
        }

        public String scopeId() {
            return this.scopeId;
        }

        public ScopeLevel scopeLevel() {
            return this.scopeLevel;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String templateBody() {
            return this.templateBody;
        }

        public String templateExternalLink() {
            return this.templateExternalLink;
        }

        public String templateLastUsed() {
            return this.templateLastUsed;
        }

        public String templateTitle() {
            return this.templateTitle;
        }

        public String templateType() {
            return this.templateType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ParentFile{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", fileUrl=" + this.fileUrl + ", fileStorageDestination=" + this.fileStorageDestination + ", fileName=" + this.fileName + ", description=" + this.description + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", tags=" + this.tags + ", templateType=" + this.templateType + ", templateTitle=" + this.templateTitle + ", templateBody=" + this.templateBody + ", templateLastUsed=" + this.templateLastUsed + ", templateExternalLink=" + this.templateExternalLink + ", uploadSource=" + this.uploadSource + ", fileMetaData=" + this.fileMetaData + ", fileMimeType=" + this.fileMimeType + ", fileThumbnailUrl=" + this.fileThumbnailUrl + ", hasParent=" + this.hasParent + ", parentFileId=" + this.parentFileId + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", uploadedById=" + this.uploadedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String uploadSource() {
            return this.uploadSource;
        }

        public String uploadedById() {
            return this.uploadedById;
        }
    }

    public static class UploadedBy {
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

        public static final class Mapper implements ResponseFieldMapper<UploadedBy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UploadedBy map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UploadedBy.$responseFields;
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
                return new UploadedBy(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public UploadedBy(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof UploadedBy)) {
                return false;
            }
            UploadedBy uploadedBy = (UploadedBy) obj;
            if (this.__typename.equals(uploadedBy.__typename) && this.id.equals(uploadedBy.id) && this.addedSourceType.equals(uploadedBy.addedSourceType) && this.name.equals(uploadedBy.name) && ((str = this.profilePictureUrl) != null ? str.equals(uploadedBy.profilePictureUrl) : uploadedBy.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(uploadedBy.registeredEmail) : uploadedBy.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(uploadedBy.registeredEmailVerified) : uploadedBy.registeredEmailVerified == null) && this.registeredNumber.equals(uploadedBy.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(uploadedBy.registeredNumberVerified) : uploadedBy.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(uploadedBy.secondaryNumber) : uploadedBy.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(uploadedBy.secondaryNumberVerified) : uploadedBy.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(uploadedBy.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(uploadedBy.lastSelectedAccountWeb) : uploadedBy.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(uploadedBy.lastSelectedAccountApp) : uploadedBy.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(uploadedBy.appVersion) : uploadedBy.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(uploadedBy.deviceModel) : uploadedBy.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(uploadedBy.deviceManufacturer) : uploadedBy.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(uploadedBy.androidVersionRelease) : uploadedBy.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(uploadedBy.createdAt) : uploadedBy.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = uploadedBy.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.UploadedBy.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UploadedBy.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UploadedBy.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UploadedBy.this.id);
                    responseWriter.writeString(responseFieldArr[2], UploadedBy.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], UploadedBy.this.name);
                    responseWriter.writeString(responseFieldArr[4], UploadedBy.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UploadedBy.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], UploadedBy.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UploadedBy.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], UploadedBy.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UploadedBy.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], UploadedBy.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], UploadedBy.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UploadedBy.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UploadedBy.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], UploadedBy.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], UploadedBy.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], UploadedBy.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], UploadedBy.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], UploadedBy.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], UploadedBy.this.updatedAt);
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
                this.$toString = "UploadedBy{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        private final String id;
        private final transient Map<String, Object> valueMap;

        public Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.id = str;
            linkedHashMap.put(OutcomeConstants.OUTCOME_ID, str);
        }

        public String id() {
            return this.id;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUploadedFileQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, Variables.this.id);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetUploadedFileQuery(String str) {
        Utils.checkNotNull(str, "id == null");
        this.variables = new Variables(str);
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
        return "75641541a36e8c742adadba038eaa1fafce4a1f0b03cd2a3c37dab819a74b1b1";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetUploadedFile($id: ID!) {\n  getUploadedFile(id: $id) {\n    __typename\n    id\n    accountId\n    fileUrl\n    fileStorageDestination\n    fileName\n    description\n    documentCategory\n    documentSubCategory\n    tags\n    templateType\n    templateTitle\n    templateBody\n    templateLastUsed\n    templateExternalLink\n    uploadSource\n    fileMetaData\n    fileMimeType\n    fileThumbnailUrl\n    hasParent\n    parentFileId\n    scopeLevel\n    scopeId\n    uploadedById\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    parentFile {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    childFiles {\n      __typename\n      nextToken\n    }\n    associations {\n      __typename\n      nextToken\n    }\n    uploadedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
