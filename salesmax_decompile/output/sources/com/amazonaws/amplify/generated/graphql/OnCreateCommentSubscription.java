package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.Subscription;
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
import type.ActivityCategory;
import type.ActivityRelatedObjectType;
import type.ActivityType;
import type.AddedSourceType;
import type.CallConnectStatus;
import type.CallDirection;
import type.ContactAssignmentStatus;
import type.CustomType;
import type.EngagementStatus;
import type.EngagementType;
import type.MentionedEntityType;
import type.NoteAdditionMethod;
import type.TaskActivityType;
import type.UserRegistrationStatus;

/* loaded from: classes4.dex */
public final class OnCreateCommentSubscription implements Subscription<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnCreateComment($accountId: ID!) {\n  onCreateComment(accountId: $accountId) {\n    __typename\n    id\n    accountId\n    ownerId\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    body\n    engagementId\n    activityId\n    parentEngagementId\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    engagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    activity {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n    childEngagements {\n      __typename\n      nextToken\n    }\n    userCommenting {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnCreateComment";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnCreateComment($accountId: ID!) {\n  onCreateComment(accountId: $accountId) {\n    __typename\n    id\n    accountId\n    ownerId\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    body\n    engagementId\n    activityId\n    parentEngagementId\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    engagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    activity {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n    childEngagements {\n      __typename\n      nextToken\n    }\n    userCommenting {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
                return new Account(string, str, string2, accountTypeValueOf, string4, str2, string5 != null ? AccountStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readString(responseFieldArr[31]), responseReader.readString(responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readInt(responseFieldArr[34]), responseReader.readBoolean(responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readList(responseFieldArr[39], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readBoolean(responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readList(responseFieldArr[45], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[46], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readList(responseFieldArr[51], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.Mapper.5
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.1
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
                    responseWriter.writeList(responseFieldArr[15], Account.this.productOrService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.1.1
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
                    responseWriter.writeList(responseFieldArr[39], Account.this.permissions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.1.2
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
                    responseWriter.writeList(responseFieldArr[45], Account.this.salesmaxSalesContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[46], Account.this.salesmaxSupportContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], Account.this.chatWidgetConfig);
                    responseWriter.writeString(responseFieldArr[48], Account.this.onboardingStatus);
                    responseWriter.writeString(responseFieldArr[49], Account.this.integrationNeeded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], Account.this.matchingDealId);
                    responseWriter.writeList(responseFieldArr[51], Account.this.relatedAccountIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Account.1.5
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

    public static class Activity {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final ActivityCategory activityCategory;
        final String activityDoneByUserId;
        final String activityRelatedObjectId;
        final ActivityRelatedObjectType activityRelatedObjectType;
        final ActivityType activityType;
        final String body;
        final String contactId;
        final String createdAt;
        final String id;
        final String note;
        final String ownerId;
        final String primaryTeamId;
        final String threadId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Activity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Activity map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Activity.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                ActivityRelatedObjectType activityRelatedObjectTypeValueOf = string2 != null ? ActivityRelatedObjectType.valueOf(string2) : null;
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                ActivityCategory activityCategoryValueOf = string3 != null ? ActivityCategory.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[7]);
                return new Activity(string, str, str2, str3, activityRelatedObjectTypeValueOf, str4, activityCategoryValueOf, string4 != null ? ActivityType.valueOf(string4) : null, responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("threadId", "threadId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("activityRelatedObjectType", "activityRelatedObjectType", null, false, Collections.emptyList()), ResponseField.forCustomType("activityRelatedObjectId", "activityRelatedObjectId", null, false, customType, Collections.emptyList()), ResponseField.forString("activityCategory", "activityCategory", null, false, Collections.emptyList()), ResponseField.forString("activityType", "activityType", null, false, Collections.emptyList()), ResponseField.forString("body", "body", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("activityDoneByUserId", "activityDoneByUserId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Activity(String str, String str2, String str3, String str4, ActivityRelatedObjectType activityRelatedObjectType, String str5, ActivityCategory activityCategory, ActivityType activityType, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.threadId = str3;
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.activityRelatedObjectType = (ActivityRelatedObjectType) Utils.checkNotNull(activityRelatedObjectType, "activityRelatedObjectType == null");
            this.activityRelatedObjectId = (String) Utils.checkNotNull(str5, "activityRelatedObjectId == null");
            this.activityCategory = (ActivityCategory) Utils.checkNotNull(activityCategory, "activityCategory == null");
            this.activityType = (ActivityType) Utils.checkNotNull(activityType, "activityType == null");
            this.body = str6;
            this.note = str7;
            this.ownerId = (String) Utils.checkNotNull(str8, "ownerId == null");
            this.primaryTeamId = str9;
            this.contactId = str10;
            this.activityDoneByUserId = str11;
            this.createdAt = str12;
            this.updatedAt = str13;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public ActivityCategory activityCategory() {
            return this.activityCategory;
        }

        public String activityDoneByUserId() {
            return this.activityDoneByUserId;
        }

        public String activityRelatedObjectId() {
            return this.activityRelatedObjectId;
        }

        public ActivityRelatedObjectType activityRelatedObjectType() {
            return this.activityRelatedObjectType;
        }

        public ActivityType activityType() {
            return this.activityType;
        }

        public String body() {
            return this.body;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            if (this.__typename.equals(activity.__typename) && this.id.equals(activity.id) && ((str = this.threadId) != null ? str.equals(activity.threadId) : activity.threadId == null) && this.accountId.equals(activity.accountId) && this.activityRelatedObjectType.equals(activity.activityRelatedObjectType) && this.activityRelatedObjectId.equals(activity.activityRelatedObjectId) && this.activityCategory.equals(activity.activityCategory) && this.activityType.equals(activity.activityType) && ((str2 = this.body) != null ? str2.equals(activity.body) : activity.body == null) && ((str3 = this.note) != null ? str3.equals(activity.note) : activity.note == null) && this.ownerId.equals(activity.ownerId) && ((str4 = this.primaryTeamId) != null ? str4.equals(activity.primaryTeamId) : activity.primaryTeamId == null) && ((str5 = this.contactId) != null ? str5.equals(activity.contactId) : activity.contactId == null) && ((str6 = this.activityDoneByUserId) != null ? str6.equals(activity.activityDoneByUserId) : activity.activityDoneByUserId == null) && ((str7 = this.createdAt) != null ? str7.equals(activity.createdAt) : activity.createdAt == null)) {
                String str8 = this.updatedAt;
                String str9 = activity.updatedAt;
                if (str8 == null) {
                    if (str9 == null) {
                        return true;
                    }
                } else if (str8.equals(str9)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.threadId;
                int iHashCode2 = (((((((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.activityRelatedObjectType.hashCode()) * 1000003) ^ this.activityRelatedObjectId.hashCode()) * 1000003) ^ this.activityCategory.hashCode()) * 1000003) ^ this.activityType.hashCode()) * 1000003;
                String str2 = this.body;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.note;
                int iHashCode4 = (((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str4 = this.primaryTeamId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.contactId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.activityDoneByUserId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                this.$hashCode = iHashCode8 ^ (str8 != null ? str8.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Activity.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Activity.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Activity.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Activity.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Activity.this.threadId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Activity.this.accountId);
                    responseWriter.writeString(responseFieldArr[4], Activity.this.activityRelatedObjectType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Activity.this.activityRelatedObjectId);
                    responseWriter.writeString(responseFieldArr[6], Activity.this.activityCategory.name());
                    responseWriter.writeString(responseFieldArr[7], Activity.this.activityType.name());
                    responseWriter.writeString(responseFieldArr[8], Activity.this.body);
                    responseWriter.writeString(responseFieldArr[9], Activity.this.note);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Activity.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Activity.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Activity.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Activity.this.activityDoneByUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Activity.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Activity.this.updatedAt);
                }
            };
        }

        public String note() {
            return this.note;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String threadId() {
            return this.threadId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Activity{__typename=" + this.__typename + ", id=" + this.id + ", threadId=" + this.threadId + ", accountId=" + this.accountId + ", activityRelatedObjectType=" + this.activityRelatedObjectType + ", activityRelatedObjectId=" + this.activityRelatedObjectId + ", activityCategory=" + this.activityCategory + ", activityType=" + this.activityType + ", body=" + this.body + ", note=" + this.note + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", contactId=" + this.contactId + ", activityDoneByUserId=" + this.activityDoneByUserId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Builder {
        private String accountId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public OnCreateCommentSubscription build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new OnCreateCommentSubscription(this.accountId);
        }
    }

    public static class ChildEngagements {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ChildEngagements> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ChildEngagements map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ChildEngagements.$responseFields;
                return new ChildEngagements(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public ChildEngagements(String str, String str2) {
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
            if (!(obj instanceof ChildEngagements)) {
                return false;
            }
            ChildEngagements childEngagements = (ChildEngagements) obj;
            if (this.__typename.equals(childEngagements.__typename)) {
                String str = this.nextToken;
                String str2 = childEngagements.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.ChildEngagements.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ChildEngagements.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ChildEngagements.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ChildEngagements.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ChildEngagements{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onCreateComment", "onCreateComment", new UnmodifiableMapBuilder(1).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnCreateComment onCreateComment;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnCreateComment.Mapper onCreateCommentFieldMapper = new OnCreateComment.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnCreateComment) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnCreateComment>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnCreateComment read(ResponseReader responseReader2) {
                        return Mapper.this.onCreateCommentFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnCreateComment onCreateComment) {
            this.onCreateComment = onCreateComment;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnCreateComment onCreateComment = this.onCreateComment;
            OnCreateComment onCreateComment2 = ((Data) obj).onCreateComment;
            return onCreateComment == null ? onCreateComment2 == null : onCreateComment.equals(onCreateComment2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnCreateComment onCreateComment = this.onCreateComment;
                this.$hashCode = (onCreateComment == null ? 0 : onCreateComment.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnCreateComment onCreateComment = Data.this.onCreateComment;
                    responseWriter.writeObject(responseField, onCreateComment != null ? onCreateComment.marshaller() : null);
                }
            };
        }

        public OnCreateComment onCreateComment() {
            return this.onCreateComment;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onCreateComment=" + this.onCreateComment + "}";
            }
            return this.$toString;
        }
    }

    public static class Engagement {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String addedById;
        final String body;
        final String calendarEventId;
        final String calendarName;
        final CallConnectStatus callConnectStatus;
        final CallDirection callDirection;
        final String callEndTime;
        final String callOutcome;
        final String callOutcomeNature;
        final String callRecordingExternalResource;
        final String callRecordingUrl;
        final String callStartTime;
        final String callStatus;
        final String callTranscriptSummary;
        final String callTranscriptUrl;
        final String callType;
        final String campaignId;
        final String campaignRun;
        final String cloudProvider;
        final String cloudProviderNumber;
        final String contactId;
        final String contactOwnerId;
        final String contactPrimaryTeamId;
        final String createdAt;
        final String customCallOutcomeData;
        final String customTaskCompletionData;
        final String customTaskInputData;
        final String customVideoCallInputData;
        final String customVisitOutcomeData;
        final String deviceId;
        final String dueDateTime;
        final Integer durationInMillis;
        final String engagementSource;
        final String engagementSourceLevelTwo;
        final String engagementSourceType;
        final EngagementStatus engagementStatus;
        final EngagementType engagementType;
        final String externalEventRecordId;
        final String externalNumber;
        final String firstTaskEngagementActionOn;
        final String hangupReason;
        final String id;
        final Boolean isManualTask;
        final String meetingCode;
        final String meetingName;
        final String nextFollowUpOn;
        final String nextFollowUpSetBy;
        final String nextStepTaskId;
        final NoteAdditionMethod noteAdditionMethod;
        final String noteHeading;
        final String ownerId;
        final String parentEngagementId;
        final String paymentDataId;
        final String phoneCallLogId;
        final String primaryTeamId;
        final String reminderDateTime;
        final Boolean syncStatus;
        final String systemAction;
        final TaskActivityType taskActivityType;
        final String taskCompletionNote;
        final String taskCompletionTime;
        final String taskCompletionType;
        final Integer taskEngagementActionCount;
        final List<String> taskEngagementActions;
        final String taskEngagementActionsUpdatedAt;
        final String taskHeading;
        final String taskInputNote;
        final String taskPriority;
        final String taskType;
        final ContactAssignmentStatus toBeAssigned;
        final Integer totalCallDuration;
        final String updatedAt;
        final String updatedById;
        final String uploadedFiledUrl;
        final String userNumber;
        final String videoCallLink;
        final String videoCallMetadata;
        final String videoCallOutcome;
        final String videoCallPlatform;
        final String visitNote;
        final String visitOutcome;
        final String visitOutcomeNature;
        final String visitTime;
        final String voiceNoteUrl;

        public static final class Mapper implements ResponseFieldMapper<Engagement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Engagement map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Engagement.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                EngagementType engagementTypeValueOf = string2 != null ? EngagementType.valueOf(string2) : null;
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                ContactAssignmentStatus contactAssignmentStatusValueOf = string3 != null ? ContactAssignmentStatus.valueOf(string3) : null;
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str9 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String string4 = responseReader.readString(responseFieldArr[12]);
                String string5 = responseReader.readString(responseFieldArr[13]);
                EngagementStatus engagementStatusValueOf = string5 != null ? EngagementStatus.valueOf(string5) : null;
                String str10 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]);
                String str11 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[16]);
                String string6 = responseReader.readString(responseFieldArr[17]);
                String string7 = responseReader.readString(responseFieldArr[18]);
                String string8 = responseReader.readString(responseFieldArr[19]);
                CallDirection callDirectionValueOf = string8 != null ? CallDirection.valueOf(string8) : null;
                String string9 = responseReader.readString(responseFieldArr[20]);
                CallConnectStatus callConnectStatusValueOf = string9 != null ? CallConnectStatus.valueOf(string9) : null;
                String str12 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]);
                String str13 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]);
                Integer num = responseReader.readInt(responseFieldArr[23]);
                String string10 = responseReader.readString(responseFieldArr[24]);
                String string11 = responseReader.readString(responseFieldArr[25]);
                String string12 = responseReader.readString(responseFieldArr[26]);
                String string13 = responseReader.readString(responseFieldArr[27]);
                String string14 = responseReader.readString(responseFieldArr[28]);
                NoteAdditionMethod noteAdditionMethodValueOf = string14 != null ? NoteAdditionMethod.valueOf(string14) : null;
                String string15 = responseReader.readString(responseFieldArr[29]);
                String string16 = responseReader.readString(responseFieldArr[30]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[31]);
                String string17 = responseReader.readString(responseFieldArr[32]);
                String string18 = responseReader.readString(responseFieldArr[33]);
                String string19 = responseReader.readString(responseFieldArr[34]);
                return new Engagement(string, str, str2, engagementTypeValueOf, str3, str4, contactAssignmentStatusValueOf, str5, str6, str7, str8, str9, string4, engagementStatusValueOf, str10, str11, bool, string6, string7, callDirectionValueOf, callConnectStatusValueOf, str12, str13, num, string10, string11, string12, string13, noteAdditionMethodValueOf, string15, string16, bool2, string17, string18, string19 != null ? TaskActivityType.valueOf(string19) : null, responseReader.readString(responseFieldArr[35]), responseReader.readString(responseFieldArr[36]), responseReader.readString(responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readString(responseFieldArr[39]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), responseReader.readString(responseFieldArr[42]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readString(responseFieldArr[45]), responseReader.readString(responseFieldArr[46]), responseReader.readString(responseFieldArr[47]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), responseReader.readString(responseFieldArr[50]), responseReader.readString(responseFieldArr[51]), responseReader.readString(responseFieldArr[52]), responseReader.readString(responseFieldArr[53]), responseReader.readString(responseFieldArr[54]), responseReader.readString(responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]), responseReader.readString(responseFieldArr[57]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[58]), responseReader.readString(responseFieldArr[59]), responseReader.readString(responseFieldArr[60]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[61]), responseReader.readString(responseFieldArr[62]), responseReader.readString(responseFieldArr[63]), responseReader.readString(responseFieldArr[64]), responseReader.readString(responseFieldArr[65]), responseReader.readString(responseFieldArr[66]), responseReader.readList(responseFieldArr[67], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Engagement.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[68]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[69]), responseReader.readInt(responseFieldArr[70]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[71]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[72]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[73]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[74]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[75]), responseReader.readString(responseFieldArr[76]), responseReader.readInt(responseFieldArr[77]), responseReader.readString(responseFieldArr[78]), responseReader.readString(responseFieldArr[79]), responseReader.readString(responseFieldArr[80]), responseReader.readString(responseFieldArr[81]), responseReader.readString(responseFieldArr[82]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[83]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[84]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[85]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("engagementType", "engagementType", null, false, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactPrimaryTeamId", "contactPrimaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactOwnerId", "contactOwnerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forString("callStatus", "callStatus", null, true, Collections.emptyList()), ResponseField.forString("engagementStatus", "engagementStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("parentEngagementId", "parentEngagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("nextStepTaskId", "nextStepTaskId", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("syncStatus", "syncStatus", null, true, Collections.emptyList()), ResponseField.forString("externalNumber", "externalNumber", null, true, Collections.emptyList()), ResponseField.forString("userNumber", "userNumber", null, true, Collections.emptyList()), ResponseField.forString("callDirection", "callDirection", null, true, Collections.emptyList()), ResponseField.forString("callConnectStatus", "callConnectStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("callStartTime", "callStartTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("callEndTime", "callEndTime", null, true, customType2, Collections.emptyList()), ResponseField.forInt("durationInMillis", "durationInMillis", null, true, Collections.emptyList()), ResponseField.forString("callOutcome", "callOutcome", null, true, Collections.emptyList()), ResponseField.forString("callOutcomeNature", "callOutcomeNature", null, true, Collections.emptyList()), ResponseField.forString("callRecordingExternalResource", "callRecordingExternalResource", null, true, Collections.emptyList()), ResponseField.forString("noteHeading", "noteHeading", null, true, Collections.emptyList()), ResponseField.forString("noteAdditionMethod", "noteAdditionMethod", null, true, Collections.emptyList()), ResponseField.forString("voiceNoteUrl", "voiceNoteUrl", null, true, Collections.emptyList()), ResponseField.forString("body", "body", null, true, Collections.emptyList()), ResponseField.forBoolean("isManualTask", "isManualTask", null, true, Collections.emptyList()), ResponseField.forString("taskHeading", "taskHeading", null, true, Collections.emptyList()), ResponseField.forString("taskType", "taskType", null, true, Collections.emptyList()), ResponseField.forString("taskActivityType", "taskActivityType", null, true, Collections.emptyList()), ResponseField.forString("taskInputNote", "taskInputNote", null, true, Collections.emptyList()), ResponseField.forString("taskPriority", "taskPriority", null, true, Collections.emptyList()), ResponseField.forString("taskCompletionNote", "taskCompletionNote", null, true, Collections.emptyList()), ResponseField.forCustomType("taskCompletionTime", "taskCompletionTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("taskCompletionType", "taskCompletionType", null, true, Collections.emptyList()), ResponseField.forCustomType("dueDateTime", "dueDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextFollowUpOn", "nextFollowUpOn", null, true, customType2, Collections.emptyList()), ResponseField.forString("nextFollowUpSetBy", "nextFollowUpSetBy", null, true, Collections.emptyList()), ResponseField.forCustomType("reminderDateTime", "reminderDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("callRecordingUrl", "callRecordingUrl", null, true, Collections.emptyList()), ResponseField.forString("callTranscriptUrl", "callTranscriptUrl", null, true, Collections.emptyList()), ResponseField.forString("callTranscriptSummary", "callTranscriptSummary", null, true, Collections.emptyList()), ResponseField.forString("uploadedFiledUrl", "uploadedFiledUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("visitTime", "visitTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("visitNote", "visitNote", null, true, Collections.emptyList()), ResponseField.forString("visitOutcome", "visitOutcome", null, true, Collections.emptyList()), ResponseField.forString("visitOutcomeNature", "visitOutcomeNature", null, true, Collections.emptyList()), ResponseField.forString("videoCallPlatform", "videoCallPlatform", null, true, Collections.emptyList()), ResponseField.forString("videoCallLink", "videoCallLink", null, true, Collections.emptyList()), ResponseField.forString("meetingName", "meetingName", null, true, Collections.emptyList()), ResponseField.forString("meetingCode", "meetingCode", null, true, Collections.emptyList()), ResponseField.forCustomType("videoCallMetadata", "videoCallMetadata", null, true, customType3, Collections.emptyList()), ResponseField.forString("videoCallOutcome", "videoCallOutcome", null, true, Collections.emptyList()), ResponseField.forCustomType("paymentDataId", "paymentDataId", null, true, customType, Collections.emptyList()), ResponseField.forString("calendarEventId", "calendarEventId", null, true, Collections.emptyList()), ResponseField.forString("calendarName", "calendarName", null, true, Collections.emptyList()), ResponseField.forCustomType("campaignId", "campaignId", null, true, customType, Collections.emptyList()), ResponseField.forString("campaignRun", "campaignRun", null, true, Collections.emptyList()), ResponseField.forString("engagementSourceType", "engagementSourceType", null, true, Collections.emptyList()), ResponseField.forString("engagementSource", "engagementSource", null, true, Collections.emptyList()), ResponseField.forString("engagementSourceLevelTwo", "engagementSourceLevelTwo", null, true, Collections.emptyList()), ResponseField.forString("systemAction", "systemAction", null, true, Collections.emptyList()), ResponseField.forList("taskEngagementActions", "taskEngagementActions", null, true, Collections.emptyList()), ResponseField.forCustomType("taskEngagementActionsUpdatedAt", "taskEngagementActionsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("firstTaskEngagementActionOn", "firstTaskEngagementActionOn", null, true, customType2, Collections.emptyList()), ResponseField.forInt("taskEngagementActionCount", "taskEngagementActionCount", null, true, Collections.emptyList()), ResponseField.forCustomType("customCallOutcomeData", "customCallOutcomeData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customVisitOutcomeData", "customVisitOutcomeData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customTaskCompletionData", "customTaskCompletionData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customTaskInputData", "customTaskInputData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customVideoCallInputData", "customVideoCallInputData", null, true, customType3, Collections.emptyList()), ResponseField.forString("deviceId", "deviceId", null, true, Collections.emptyList()), ResponseField.forInt("totalCallDuration", "totalCallDuration", null, true, Collections.emptyList()), ResponseField.forString("cloudProviderNumber", "cloudProviderNumber", null, true, Collections.emptyList()), ResponseField.forString("hangupReason", "hangupReason", null, true, Collections.emptyList()), ResponseField.forString("cloudProvider", "cloudProvider", null, true, Collections.emptyList()), ResponseField.forString("callType", "callType", null, true, Collections.emptyList()), ResponseField.forString("phoneCallLogId", "phoneCallLogId", null, true, Collections.emptyList()), ResponseField.forCustomType("externalEventRecordId", "externalEventRecordId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Engagement(String str, String str2, String str3, EngagementType engagementType, String str4, String str5, ContactAssignmentStatus contactAssignmentStatus, String str6, String str7, String str8, String str9, String str10, String str11, EngagementStatus engagementStatus, String str12, String str13, Boolean bool, String str14, String str15, CallDirection callDirection, CallConnectStatus callConnectStatus, String str16, String str17, Integer num, String str18, String str19, String str20, String str21, NoteAdditionMethod noteAdditionMethod, String str22, String str23, Boolean bool2, String str24, String str25, TaskActivityType taskActivityType, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, List<String> list, String str58, String str59, Integer num2, String str60, String str61, String str62, String str63, String str64, String str65, Integer num3, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.engagementType = (EngagementType) Utils.checkNotNull(engagementType, "engagementType == null");
            this.contactId = str4;
            this.primaryTeamId = str5;
            this.toBeAssigned = contactAssignmentStatus;
            this.ownerId = str6;
            this.contactPrimaryTeamId = str7;
            this.contactOwnerId = str8;
            this.addedById = str9;
            this.updatedById = str10;
            this.callStatus = str11;
            this.engagementStatus = (EngagementStatus) Utils.checkNotNull(engagementStatus, "engagementStatus == null");
            this.parentEngagementId = str12;
            this.nextStepTaskId = str13;
            this.syncStatus = bool;
            this.externalNumber = str14;
            this.userNumber = str15;
            this.callDirection = callDirection;
            this.callConnectStatus = callConnectStatus;
            this.callStartTime = str16;
            this.callEndTime = str17;
            this.durationInMillis = num;
            this.callOutcome = str18;
            this.callOutcomeNature = str19;
            this.callRecordingExternalResource = str20;
            this.noteHeading = str21;
            this.noteAdditionMethod = noteAdditionMethod;
            this.voiceNoteUrl = str22;
            this.body = str23;
            this.isManualTask = bool2;
            this.taskHeading = str24;
            this.taskType = str25;
            this.taskActivityType = taskActivityType;
            this.taskInputNote = str26;
            this.taskPriority = str27;
            this.taskCompletionNote = str28;
            this.taskCompletionTime = str29;
            this.taskCompletionType = str30;
            this.dueDateTime = str31;
            this.nextFollowUpOn = str32;
            this.nextFollowUpSetBy = str33;
            this.reminderDateTime = str34;
            this.callRecordingUrl = str35;
            this.callTranscriptUrl = str36;
            this.callTranscriptSummary = str37;
            this.uploadedFiledUrl = str38;
            this.visitTime = str39;
            this.visitNote = str40;
            this.visitOutcome = str41;
            this.visitOutcomeNature = str42;
            this.videoCallPlatform = str43;
            this.videoCallLink = str44;
            this.meetingName = str45;
            this.meetingCode = str46;
            this.videoCallMetadata = str47;
            this.videoCallOutcome = str48;
            this.paymentDataId = str49;
            this.calendarEventId = str50;
            this.calendarName = str51;
            this.campaignId = str52;
            this.campaignRun = str53;
            this.engagementSourceType = str54;
            this.engagementSource = str55;
            this.engagementSourceLevelTwo = str56;
            this.systemAction = str57;
            this.taskEngagementActions = list;
            this.taskEngagementActionsUpdatedAt = str58;
            this.firstTaskEngagementActionOn = str59;
            this.taskEngagementActionCount = num2;
            this.customCallOutcomeData = str60;
            this.customVisitOutcomeData = str61;
            this.customTaskCompletionData = str62;
            this.customTaskInputData = str63;
            this.customVideoCallInputData = str64;
            this.deviceId = str65;
            this.totalCallDuration = num3;
            this.cloudProviderNumber = str66;
            this.hangupReason = str67;
            this.cloudProvider = str68;
            this.callType = str69;
            this.phoneCallLogId = str70;
            this.externalEventRecordId = str71;
            this.createdAt = str72;
            this.updatedAt = str73;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String addedById() {
            return this.addedById;
        }

        public String body() {
            return this.body;
        }

        public String calendarEventId() {
            return this.calendarEventId;
        }

        public String calendarName() {
            return this.calendarName;
        }

        public CallConnectStatus callConnectStatus() {
            return this.callConnectStatus;
        }

        public CallDirection callDirection() {
            return this.callDirection;
        }

        public String callEndTime() {
            return this.callEndTime;
        }

        public String callOutcome() {
            return this.callOutcome;
        }

        public String callOutcomeNature() {
            return this.callOutcomeNature;
        }

        public String callRecordingExternalResource() {
            return this.callRecordingExternalResource;
        }

        public String callRecordingUrl() {
            return this.callRecordingUrl;
        }

        public String callStartTime() {
            return this.callStartTime;
        }

        public String callStatus() {
            return this.callStatus;
        }

        public String callTranscriptSummary() {
            return this.callTranscriptSummary;
        }

        public String callTranscriptUrl() {
            return this.callTranscriptUrl;
        }

        public String callType() {
            return this.callType;
        }

        public String campaignId() {
            return this.campaignId;
        }

        public String campaignRun() {
            return this.campaignRun;
        }

        public String cloudProvider() {
            return this.cloudProvider;
        }

        public String cloudProviderNumber() {
            return this.cloudProviderNumber;
        }

        public String contactId() {
            return this.contactId;
        }

        public String contactOwnerId() {
            return this.contactOwnerId;
        }

        public String contactPrimaryTeamId() {
            return this.contactPrimaryTeamId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String customCallOutcomeData() {
            return this.customCallOutcomeData;
        }

        public String customTaskCompletionData() {
            return this.customTaskCompletionData;
        }

        public String customTaskInputData() {
            return this.customTaskInputData;
        }

        public String customVideoCallInputData() {
            return this.customVideoCallInputData;
        }

        public String customVisitOutcomeData() {
            return this.customVisitOutcomeData;
        }

        public String deviceId() {
            return this.deviceId;
        }

        public String dueDateTime() {
            return this.dueDateTime;
        }

        public Integer durationInMillis() {
            return this.durationInMillis;
        }

        public String engagementSource() {
            return this.engagementSource;
        }

        public String engagementSourceLevelTwo() {
            return this.engagementSourceLevelTwo;
        }

        public String engagementSourceType() {
            return this.engagementSourceType;
        }

        public EngagementStatus engagementStatus() {
            return this.engagementStatus;
        }

        public EngagementType engagementType() {
            return this.engagementType;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            ContactAssignmentStatus contactAssignmentStatus;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            Boolean bool;
            String str11;
            String str12;
            CallDirection callDirection;
            CallConnectStatus callConnectStatus;
            String str13;
            String str14;
            Integer num;
            String str15;
            String str16;
            String str17;
            String str18;
            NoteAdditionMethod noteAdditionMethod;
            String str19;
            String str20;
            Boolean bool2;
            String str21;
            String str22;
            TaskActivityType taskActivityType;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            String str31;
            String str32;
            String str33;
            String str34;
            String str35;
            String str36;
            String str37;
            String str38;
            String str39;
            String str40;
            String str41;
            String str42;
            String str43;
            String str44;
            String str45;
            String str46;
            String str47;
            String str48;
            String str49;
            String str50;
            String str51;
            String str52;
            String str53;
            String str54;
            List<String> list;
            String str55;
            String str56;
            Integer num2;
            String str57;
            String str58;
            String str59;
            String str60;
            String str61;
            String str62;
            Integer num3;
            String str63;
            String str64;
            String str65;
            String str66;
            String str67;
            String str68;
            String str69;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Engagement)) {
                return false;
            }
            Engagement engagement = (Engagement) obj;
            if (this.__typename.equals(engagement.__typename) && this.id.equals(engagement.id) && this.accountId.equals(engagement.accountId) && this.engagementType.equals(engagement.engagementType) && ((str = this.contactId) != null ? str.equals(engagement.contactId) : engagement.contactId == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(engagement.primaryTeamId) : engagement.primaryTeamId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(engagement.toBeAssigned) : engagement.toBeAssigned == null) && ((str3 = this.ownerId) != null ? str3.equals(engagement.ownerId) : engagement.ownerId == null) && ((str4 = this.contactPrimaryTeamId) != null ? str4.equals(engagement.contactPrimaryTeamId) : engagement.contactPrimaryTeamId == null) && ((str5 = this.contactOwnerId) != null ? str5.equals(engagement.contactOwnerId) : engagement.contactOwnerId == null) && ((str6 = this.addedById) != null ? str6.equals(engagement.addedById) : engagement.addedById == null) && ((str7 = this.updatedById) != null ? str7.equals(engagement.updatedById) : engagement.updatedById == null) && ((str8 = this.callStatus) != null ? str8.equals(engagement.callStatus) : engagement.callStatus == null) && this.engagementStatus.equals(engagement.engagementStatus) && ((str9 = this.parentEngagementId) != null ? str9.equals(engagement.parentEngagementId) : engagement.parentEngagementId == null) && ((str10 = this.nextStepTaskId) != null ? str10.equals(engagement.nextStepTaskId) : engagement.nextStepTaskId == null) && ((bool = this.syncStatus) != null ? bool.equals(engagement.syncStatus) : engagement.syncStatus == null) && ((str11 = this.externalNumber) != null ? str11.equals(engagement.externalNumber) : engagement.externalNumber == null) && ((str12 = this.userNumber) != null ? str12.equals(engagement.userNumber) : engagement.userNumber == null) && ((callDirection = this.callDirection) != null ? callDirection.equals(engagement.callDirection) : engagement.callDirection == null) && ((callConnectStatus = this.callConnectStatus) != null ? callConnectStatus.equals(engagement.callConnectStatus) : engagement.callConnectStatus == null) && ((str13 = this.callStartTime) != null ? str13.equals(engagement.callStartTime) : engagement.callStartTime == null) && ((str14 = this.callEndTime) != null ? str14.equals(engagement.callEndTime) : engagement.callEndTime == null) && ((num = this.durationInMillis) != null ? num.equals(engagement.durationInMillis) : engagement.durationInMillis == null) && ((str15 = this.callOutcome) != null ? str15.equals(engagement.callOutcome) : engagement.callOutcome == null) && ((str16 = this.callOutcomeNature) != null ? str16.equals(engagement.callOutcomeNature) : engagement.callOutcomeNature == null) && ((str17 = this.callRecordingExternalResource) != null ? str17.equals(engagement.callRecordingExternalResource) : engagement.callRecordingExternalResource == null) && ((str18 = this.noteHeading) != null ? str18.equals(engagement.noteHeading) : engagement.noteHeading == null) && ((noteAdditionMethod = this.noteAdditionMethod) != null ? noteAdditionMethod.equals(engagement.noteAdditionMethod) : engagement.noteAdditionMethod == null) && ((str19 = this.voiceNoteUrl) != null ? str19.equals(engagement.voiceNoteUrl) : engagement.voiceNoteUrl == null) && ((str20 = this.body) != null ? str20.equals(engagement.body) : engagement.body == null) && ((bool2 = this.isManualTask) != null ? bool2.equals(engagement.isManualTask) : engagement.isManualTask == null) && ((str21 = this.taskHeading) != null ? str21.equals(engagement.taskHeading) : engagement.taskHeading == null) && ((str22 = this.taskType) != null ? str22.equals(engagement.taskType) : engagement.taskType == null) && ((taskActivityType = this.taskActivityType) != null ? taskActivityType.equals(engagement.taskActivityType) : engagement.taskActivityType == null) && ((str23 = this.taskInputNote) != null ? str23.equals(engagement.taskInputNote) : engagement.taskInputNote == null) && ((str24 = this.taskPriority) != null ? str24.equals(engagement.taskPriority) : engagement.taskPriority == null) && ((str25 = this.taskCompletionNote) != null ? str25.equals(engagement.taskCompletionNote) : engagement.taskCompletionNote == null) && ((str26 = this.taskCompletionTime) != null ? str26.equals(engagement.taskCompletionTime) : engagement.taskCompletionTime == null) && ((str27 = this.taskCompletionType) != null ? str27.equals(engagement.taskCompletionType) : engagement.taskCompletionType == null) && ((str28 = this.dueDateTime) != null ? str28.equals(engagement.dueDateTime) : engagement.dueDateTime == null) && ((str29 = this.nextFollowUpOn) != null ? str29.equals(engagement.nextFollowUpOn) : engagement.nextFollowUpOn == null) && ((str30 = this.nextFollowUpSetBy) != null ? str30.equals(engagement.nextFollowUpSetBy) : engagement.nextFollowUpSetBy == null) && ((str31 = this.reminderDateTime) != null ? str31.equals(engagement.reminderDateTime) : engagement.reminderDateTime == null) && ((str32 = this.callRecordingUrl) != null ? str32.equals(engagement.callRecordingUrl) : engagement.callRecordingUrl == null) && ((str33 = this.callTranscriptUrl) != null ? str33.equals(engagement.callTranscriptUrl) : engagement.callTranscriptUrl == null) && ((str34 = this.callTranscriptSummary) != null ? str34.equals(engagement.callTranscriptSummary) : engagement.callTranscriptSummary == null) && ((str35 = this.uploadedFiledUrl) != null ? str35.equals(engagement.uploadedFiledUrl) : engagement.uploadedFiledUrl == null) && ((str36 = this.visitTime) != null ? str36.equals(engagement.visitTime) : engagement.visitTime == null) && ((str37 = this.visitNote) != null ? str37.equals(engagement.visitNote) : engagement.visitNote == null) && ((str38 = this.visitOutcome) != null ? str38.equals(engagement.visitOutcome) : engagement.visitOutcome == null) && ((str39 = this.visitOutcomeNature) != null ? str39.equals(engagement.visitOutcomeNature) : engagement.visitOutcomeNature == null) && ((str40 = this.videoCallPlatform) != null ? str40.equals(engagement.videoCallPlatform) : engagement.videoCallPlatform == null) && ((str41 = this.videoCallLink) != null ? str41.equals(engagement.videoCallLink) : engagement.videoCallLink == null) && ((str42 = this.meetingName) != null ? str42.equals(engagement.meetingName) : engagement.meetingName == null) && ((str43 = this.meetingCode) != null ? str43.equals(engagement.meetingCode) : engagement.meetingCode == null) && ((str44 = this.videoCallMetadata) != null ? str44.equals(engagement.videoCallMetadata) : engagement.videoCallMetadata == null) && ((str45 = this.videoCallOutcome) != null ? str45.equals(engagement.videoCallOutcome) : engagement.videoCallOutcome == null) && ((str46 = this.paymentDataId) != null ? str46.equals(engagement.paymentDataId) : engagement.paymentDataId == null) && ((str47 = this.calendarEventId) != null ? str47.equals(engagement.calendarEventId) : engagement.calendarEventId == null) && ((str48 = this.calendarName) != null ? str48.equals(engagement.calendarName) : engagement.calendarName == null) && ((str49 = this.campaignId) != null ? str49.equals(engagement.campaignId) : engagement.campaignId == null) && ((str50 = this.campaignRun) != null ? str50.equals(engagement.campaignRun) : engagement.campaignRun == null) && ((str51 = this.engagementSourceType) != null ? str51.equals(engagement.engagementSourceType) : engagement.engagementSourceType == null) && ((str52 = this.engagementSource) != null ? str52.equals(engagement.engagementSource) : engagement.engagementSource == null) && ((str53 = this.engagementSourceLevelTwo) != null ? str53.equals(engagement.engagementSourceLevelTwo) : engagement.engagementSourceLevelTwo == null) && ((str54 = this.systemAction) != null ? str54.equals(engagement.systemAction) : engagement.systemAction == null) && ((list = this.taskEngagementActions) != null ? list.equals(engagement.taskEngagementActions) : engagement.taskEngagementActions == null) && ((str55 = this.taskEngagementActionsUpdatedAt) != null ? str55.equals(engagement.taskEngagementActionsUpdatedAt) : engagement.taskEngagementActionsUpdatedAt == null) && ((str56 = this.firstTaskEngagementActionOn) != null ? str56.equals(engagement.firstTaskEngagementActionOn) : engagement.firstTaskEngagementActionOn == null) && ((num2 = this.taskEngagementActionCount) != null ? num2.equals(engagement.taskEngagementActionCount) : engagement.taskEngagementActionCount == null) && ((str57 = this.customCallOutcomeData) != null ? str57.equals(engagement.customCallOutcomeData) : engagement.customCallOutcomeData == null) && ((str58 = this.customVisitOutcomeData) != null ? str58.equals(engagement.customVisitOutcomeData) : engagement.customVisitOutcomeData == null) && ((str59 = this.customTaskCompletionData) != null ? str59.equals(engagement.customTaskCompletionData) : engagement.customTaskCompletionData == null) && ((str60 = this.customTaskInputData) != null ? str60.equals(engagement.customTaskInputData) : engagement.customTaskInputData == null) && ((str61 = this.customVideoCallInputData) != null ? str61.equals(engagement.customVideoCallInputData) : engagement.customVideoCallInputData == null) && ((str62 = this.deviceId) != null ? str62.equals(engagement.deviceId) : engagement.deviceId == null) && ((num3 = this.totalCallDuration) != null ? num3.equals(engagement.totalCallDuration) : engagement.totalCallDuration == null) && ((str63 = this.cloudProviderNumber) != null ? str63.equals(engagement.cloudProviderNumber) : engagement.cloudProviderNumber == null) && ((str64 = this.hangupReason) != null ? str64.equals(engagement.hangupReason) : engagement.hangupReason == null) && ((str65 = this.cloudProvider) != null ? str65.equals(engagement.cloudProvider) : engagement.cloudProvider == null) && ((str66 = this.callType) != null ? str66.equals(engagement.callType) : engagement.callType == null) && ((str67 = this.phoneCallLogId) != null ? str67.equals(engagement.phoneCallLogId) : engagement.phoneCallLogId == null) && ((str68 = this.externalEventRecordId) != null ? str68.equals(engagement.externalEventRecordId) : engagement.externalEventRecordId == null) && ((str69 = this.createdAt) != null ? str69.equals(engagement.createdAt) : engagement.createdAt == null)) {
                String str70 = this.updatedAt;
                String str71 = engagement.updatedAt;
                if (str70 == null) {
                    if (str71 == null) {
                        return true;
                    }
                } else if (str70.equals(str71)) {
                    return true;
                }
            }
            return false;
        }

        public String externalEventRecordId() {
            return this.externalEventRecordId;
        }

        public String externalNumber() {
            return this.externalNumber;
        }

        public String firstTaskEngagementActionOn() {
            return this.firstTaskEngagementActionOn;
        }

        public String hangupReason() {
            return this.hangupReason;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.engagementType.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.primaryTeamId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                ContactAssignmentStatus contactAssignmentStatus = this.toBeAssigned;
                int iHashCode4 = (iHashCode3 ^ (contactAssignmentStatus == null ? 0 : contactAssignmentStatus.hashCode())) * 1000003;
                String str3 = this.ownerId;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.contactPrimaryTeamId;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.contactOwnerId;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.addedById;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedById;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.callStatus;
                int iHashCode10 = (((iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.engagementStatus.hashCode()) * 1000003;
                String str9 = this.parentEngagementId;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.nextStepTaskId;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                Boolean bool = this.syncStatus;
                int iHashCode13 = (iHashCode12 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str11 = this.externalNumber;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.userNumber;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                CallDirection callDirection = this.callDirection;
                int iHashCode16 = (iHashCode15 ^ (callDirection == null ? 0 : callDirection.hashCode())) * 1000003;
                CallConnectStatus callConnectStatus = this.callConnectStatus;
                int iHashCode17 = (iHashCode16 ^ (callConnectStatus == null ? 0 : callConnectStatus.hashCode())) * 1000003;
                String str13 = this.callStartTime;
                int iHashCode18 = (iHashCode17 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.callEndTime;
                int iHashCode19 = (iHashCode18 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                Integer num = this.durationInMillis;
                int iHashCode20 = (iHashCode19 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str15 = this.callOutcome;
                int iHashCode21 = (iHashCode20 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.callOutcomeNature;
                int iHashCode22 = (iHashCode21 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.callRecordingExternalResource;
                int iHashCode23 = (iHashCode22 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.noteHeading;
                int iHashCode24 = (iHashCode23 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                NoteAdditionMethod noteAdditionMethod = this.noteAdditionMethod;
                int iHashCode25 = (iHashCode24 ^ (noteAdditionMethod == null ? 0 : noteAdditionMethod.hashCode())) * 1000003;
                String str19 = this.voiceNoteUrl;
                int iHashCode26 = (iHashCode25 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.body;
                int iHashCode27 = (iHashCode26 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                Boolean bool2 = this.isManualTask;
                int iHashCode28 = (iHashCode27 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str21 = this.taskHeading;
                int iHashCode29 = (iHashCode28 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.taskType;
                int iHashCode30 = (iHashCode29 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                TaskActivityType taskActivityType = this.taskActivityType;
                int iHashCode31 = (iHashCode30 ^ (taskActivityType == null ? 0 : taskActivityType.hashCode())) * 1000003;
                String str23 = this.taskInputNote;
                int iHashCode32 = (iHashCode31 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.taskPriority;
                int iHashCode33 = (iHashCode32 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.taskCompletionNote;
                int iHashCode34 = (iHashCode33 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.taskCompletionTime;
                int iHashCode35 = (iHashCode34 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.taskCompletionType;
                int iHashCode36 = (iHashCode35 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.dueDateTime;
                int iHashCode37 = (iHashCode36 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.nextFollowUpOn;
                int iHashCode38 = (iHashCode37 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.nextFollowUpSetBy;
                int iHashCode39 = (iHashCode38 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                String str31 = this.reminderDateTime;
                int iHashCode40 = (iHashCode39 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.callRecordingUrl;
                int iHashCode41 = (iHashCode40 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.callTranscriptUrl;
                int iHashCode42 = (iHashCode41 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                String str34 = this.callTranscriptSummary;
                int iHashCode43 = (iHashCode42 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.uploadedFiledUrl;
                int iHashCode44 = (iHashCode43 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.visitTime;
                int iHashCode45 = (iHashCode44 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.visitNote;
                int iHashCode46 = (iHashCode45 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                String str38 = this.visitOutcome;
                int iHashCode47 = (iHashCode46 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                String str39 = this.visitOutcomeNature;
                int iHashCode48 = (iHashCode47 ^ (str39 == null ? 0 : str39.hashCode())) * 1000003;
                String str40 = this.videoCallPlatform;
                int iHashCode49 = (iHashCode48 ^ (str40 == null ? 0 : str40.hashCode())) * 1000003;
                String str41 = this.videoCallLink;
                int iHashCode50 = (iHashCode49 ^ (str41 == null ? 0 : str41.hashCode())) * 1000003;
                String str42 = this.meetingName;
                int iHashCode51 = (iHashCode50 ^ (str42 == null ? 0 : str42.hashCode())) * 1000003;
                String str43 = this.meetingCode;
                int iHashCode52 = (iHashCode51 ^ (str43 == null ? 0 : str43.hashCode())) * 1000003;
                String str44 = this.videoCallMetadata;
                int iHashCode53 = (iHashCode52 ^ (str44 == null ? 0 : str44.hashCode())) * 1000003;
                String str45 = this.videoCallOutcome;
                int iHashCode54 = (iHashCode53 ^ (str45 == null ? 0 : str45.hashCode())) * 1000003;
                String str46 = this.paymentDataId;
                int iHashCode55 = (iHashCode54 ^ (str46 == null ? 0 : str46.hashCode())) * 1000003;
                String str47 = this.calendarEventId;
                int iHashCode56 = (iHashCode55 ^ (str47 == null ? 0 : str47.hashCode())) * 1000003;
                String str48 = this.calendarName;
                int iHashCode57 = (iHashCode56 ^ (str48 == null ? 0 : str48.hashCode())) * 1000003;
                String str49 = this.campaignId;
                int iHashCode58 = (iHashCode57 ^ (str49 == null ? 0 : str49.hashCode())) * 1000003;
                String str50 = this.campaignRun;
                int iHashCode59 = (iHashCode58 ^ (str50 == null ? 0 : str50.hashCode())) * 1000003;
                String str51 = this.engagementSourceType;
                int iHashCode60 = (iHashCode59 ^ (str51 == null ? 0 : str51.hashCode())) * 1000003;
                String str52 = this.engagementSource;
                int iHashCode61 = (iHashCode60 ^ (str52 == null ? 0 : str52.hashCode())) * 1000003;
                String str53 = this.engagementSourceLevelTwo;
                int iHashCode62 = (iHashCode61 ^ (str53 == null ? 0 : str53.hashCode())) * 1000003;
                String str54 = this.systemAction;
                int iHashCode63 = (iHashCode62 ^ (str54 == null ? 0 : str54.hashCode())) * 1000003;
                List<String> list = this.taskEngagementActions;
                int iHashCode64 = (iHashCode63 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str55 = this.taskEngagementActionsUpdatedAt;
                int iHashCode65 = (iHashCode64 ^ (str55 == null ? 0 : str55.hashCode())) * 1000003;
                String str56 = this.firstTaskEngagementActionOn;
                int iHashCode66 = (iHashCode65 ^ (str56 == null ? 0 : str56.hashCode())) * 1000003;
                Integer num2 = this.taskEngagementActionCount;
                int iHashCode67 = (iHashCode66 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str57 = this.customCallOutcomeData;
                int iHashCode68 = (iHashCode67 ^ (str57 == null ? 0 : str57.hashCode())) * 1000003;
                String str58 = this.customVisitOutcomeData;
                int iHashCode69 = (iHashCode68 ^ (str58 == null ? 0 : str58.hashCode())) * 1000003;
                String str59 = this.customTaskCompletionData;
                int iHashCode70 = (iHashCode69 ^ (str59 == null ? 0 : str59.hashCode())) * 1000003;
                String str60 = this.customTaskInputData;
                int iHashCode71 = (iHashCode70 ^ (str60 == null ? 0 : str60.hashCode())) * 1000003;
                String str61 = this.customVideoCallInputData;
                int iHashCode72 = (iHashCode71 ^ (str61 == null ? 0 : str61.hashCode())) * 1000003;
                String str62 = this.deviceId;
                int iHashCode73 = (iHashCode72 ^ (str62 == null ? 0 : str62.hashCode())) * 1000003;
                Integer num3 = this.totalCallDuration;
                int iHashCode74 = (iHashCode73 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str63 = this.cloudProviderNumber;
                int iHashCode75 = (iHashCode74 ^ (str63 == null ? 0 : str63.hashCode())) * 1000003;
                String str64 = this.hangupReason;
                int iHashCode76 = (iHashCode75 ^ (str64 == null ? 0 : str64.hashCode())) * 1000003;
                String str65 = this.cloudProvider;
                int iHashCode77 = (iHashCode76 ^ (str65 == null ? 0 : str65.hashCode())) * 1000003;
                String str66 = this.callType;
                int iHashCode78 = (iHashCode77 ^ (str66 == null ? 0 : str66.hashCode())) * 1000003;
                String str67 = this.phoneCallLogId;
                int iHashCode79 = (iHashCode78 ^ (str67 == null ? 0 : str67.hashCode())) * 1000003;
                String str68 = this.externalEventRecordId;
                int iHashCode80 = (iHashCode79 ^ (str68 == null ? 0 : str68.hashCode())) * 1000003;
                String str69 = this.createdAt;
                int iHashCode81 = (iHashCode80 ^ (str69 == null ? 0 : str69.hashCode())) * 1000003;
                String str70 = this.updatedAt;
                this.$hashCode = iHashCode81 ^ (str70 != null ? str70.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isManualTask() {
            return this.isManualTask;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Engagement.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Engagement.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Engagement.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Engagement.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Engagement.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Engagement.this.engagementType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Engagement.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Engagement.this.primaryTeamId);
                    ResponseField responseField = responseFieldArr[6];
                    ContactAssignmentStatus contactAssignmentStatus = Engagement.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Engagement.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Engagement.this.contactPrimaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Engagement.this.contactOwnerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Engagement.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Engagement.this.updatedById);
                    responseWriter.writeString(responseFieldArr[12], Engagement.this.callStatus);
                    responseWriter.writeString(responseFieldArr[13], Engagement.this.engagementStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Engagement.this.parentEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Engagement.this.nextStepTaskId);
                    responseWriter.writeBoolean(responseFieldArr[16], Engagement.this.syncStatus);
                    responseWriter.writeString(responseFieldArr[17], Engagement.this.externalNumber);
                    responseWriter.writeString(responseFieldArr[18], Engagement.this.userNumber);
                    ResponseField responseField2 = responseFieldArr[19];
                    CallDirection callDirection = Engagement.this.callDirection;
                    responseWriter.writeString(responseField2, callDirection != null ? callDirection.name() : null);
                    ResponseField responseField3 = responseFieldArr[20];
                    CallConnectStatus callConnectStatus = Engagement.this.callConnectStatus;
                    responseWriter.writeString(responseField3, callConnectStatus != null ? callConnectStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Engagement.this.callStartTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Engagement.this.callEndTime);
                    responseWriter.writeInt(responseFieldArr[23], Engagement.this.durationInMillis);
                    responseWriter.writeString(responseFieldArr[24], Engagement.this.callOutcome);
                    responseWriter.writeString(responseFieldArr[25], Engagement.this.callOutcomeNature);
                    responseWriter.writeString(responseFieldArr[26], Engagement.this.callRecordingExternalResource);
                    responseWriter.writeString(responseFieldArr[27], Engagement.this.noteHeading);
                    ResponseField responseField4 = responseFieldArr[28];
                    NoteAdditionMethod noteAdditionMethod = Engagement.this.noteAdditionMethod;
                    responseWriter.writeString(responseField4, noteAdditionMethod != null ? noteAdditionMethod.name() : null);
                    responseWriter.writeString(responseFieldArr[29], Engagement.this.voiceNoteUrl);
                    responseWriter.writeString(responseFieldArr[30], Engagement.this.body);
                    responseWriter.writeBoolean(responseFieldArr[31], Engagement.this.isManualTask);
                    responseWriter.writeString(responseFieldArr[32], Engagement.this.taskHeading);
                    responseWriter.writeString(responseFieldArr[33], Engagement.this.taskType);
                    ResponseField responseField5 = responseFieldArr[34];
                    TaskActivityType taskActivityType = Engagement.this.taskActivityType;
                    responseWriter.writeString(responseField5, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeString(responseFieldArr[35], Engagement.this.taskInputNote);
                    responseWriter.writeString(responseFieldArr[36], Engagement.this.taskPriority);
                    responseWriter.writeString(responseFieldArr[37], Engagement.this.taskCompletionNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], Engagement.this.taskCompletionTime);
                    responseWriter.writeString(responseFieldArr[39], Engagement.this.taskCompletionType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[40], Engagement.this.dueDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[41], Engagement.this.nextFollowUpOn);
                    responseWriter.writeString(responseFieldArr[42], Engagement.this.nextFollowUpSetBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[43], Engagement.this.reminderDateTime);
                    responseWriter.writeString(responseFieldArr[44], Engagement.this.callRecordingUrl);
                    responseWriter.writeString(responseFieldArr[45], Engagement.this.callTranscriptUrl);
                    responseWriter.writeString(responseFieldArr[46], Engagement.this.callTranscriptSummary);
                    responseWriter.writeString(responseFieldArr[47], Engagement.this.uploadedFiledUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[48], Engagement.this.visitTime);
                    responseWriter.writeString(responseFieldArr[49], Engagement.this.visitNote);
                    responseWriter.writeString(responseFieldArr[50], Engagement.this.visitOutcome);
                    responseWriter.writeString(responseFieldArr[51], Engagement.this.visitOutcomeNature);
                    responseWriter.writeString(responseFieldArr[52], Engagement.this.videoCallPlatform);
                    responseWriter.writeString(responseFieldArr[53], Engagement.this.videoCallLink);
                    responseWriter.writeString(responseFieldArr[54], Engagement.this.meetingName);
                    responseWriter.writeString(responseFieldArr[55], Engagement.this.meetingCode);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], Engagement.this.videoCallMetadata);
                    responseWriter.writeString(responseFieldArr[57], Engagement.this.videoCallOutcome);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], Engagement.this.paymentDataId);
                    responseWriter.writeString(responseFieldArr[59], Engagement.this.calendarEventId);
                    responseWriter.writeString(responseFieldArr[60], Engagement.this.calendarName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[61], Engagement.this.campaignId);
                    responseWriter.writeString(responseFieldArr[62], Engagement.this.campaignRun);
                    responseWriter.writeString(responseFieldArr[63], Engagement.this.engagementSourceType);
                    responseWriter.writeString(responseFieldArr[64], Engagement.this.engagementSource);
                    responseWriter.writeString(responseFieldArr[65], Engagement.this.engagementSourceLevelTwo);
                    responseWriter.writeString(responseFieldArr[66], Engagement.this.systemAction);
                    responseWriter.writeList(responseFieldArr[67], Engagement.this.taskEngagementActions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Engagement.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[68], Engagement.this.taskEngagementActionsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[69], Engagement.this.firstTaskEngagementActionOn);
                    responseWriter.writeInt(responseFieldArr[70], Engagement.this.taskEngagementActionCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[71], Engagement.this.customCallOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], Engagement.this.customVisitOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], Engagement.this.customTaskCompletionData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[74], Engagement.this.customTaskInputData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[75], Engagement.this.customVideoCallInputData);
                    responseWriter.writeString(responseFieldArr[76], Engagement.this.deviceId);
                    responseWriter.writeInt(responseFieldArr[77], Engagement.this.totalCallDuration);
                    responseWriter.writeString(responseFieldArr[78], Engagement.this.cloudProviderNumber);
                    responseWriter.writeString(responseFieldArr[79], Engagement.this.hangupReason);
                    responseWriter.writeString(responseFieldArr[80], Engagement.this.cloudProvider);
                    responseWriter.writeString(responseFieldArr[81], Engagement.this.callType);
                    responseWriter.writeString(responseFieldArr[82], Engagement.this.phoneCallLogId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[83], Engagement.this.externalEventRecordId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[84], Engagement.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[85], Engagement.this.updatedAt);
                }
            };
        }

        public String meetingCode() {
            return this.meetingCode;
        }

        public String meetingName() {
            return this.meetingName;
        }

        public String nextFollowUpOn() {
            return this.nextFollowUpOn;
        }

        public String nextFollowUpSetBy() {
            return this.nextFollowUpSetBy;
        }

        public String nextStepTaskId() {
            return this.nextStepTaskId;
        }

        public NoteAdditionMethod noteAdditionMethod() {
            return this.noteAdditionMethod;
        }

        public String noteHeading() {
            return this.noteHeading;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String parentEngagementId() {
            return this.parentEngagementId;
        }

        public String paymentDataId() {
            return this.paymentDataId;
        }

        public String phoneCallLogId() {
            return this.phoneCallLogId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String reminderDateTime() {
            return this.reminderDateTime;
        }

        public Boolean syncStatus() {
            return this.syncStatus;
        }

        public String systemAction() {
            return this.systemAction;
        }

        public TaskActivityType taskActivityType() {
            return this.taskActivityType;
        }

        public String taskCompletionNote() {
            return this.taskCompletionNote;
        }

        public String taskCompletionTime() {
            return this.taskCompletionTime;
        }

        public String taskCompletionType() {
            return this.taskCompletionType;
        }

        public Integer taskEngagementActionCount() {
            return this.taskEngagementActionCount;
        }

        public List<String> taskEngagementActions() {
            return this.taskEngagementActions;
        }

        public String taskEngagementActionsUpdatedAt() {
            return this.taskEngagementActionsUpdatedAt;
        }

        public String taskHeading() {
            return this.taskHeading;
        }

        public String taskInputNote() {
            return this.taskInputNote;
        }

        public String taskPriority() {
            return this.taskPriority;
        }

        public String taskType() {
            return this.taskType;
        }

        public ContactAssignmentStatus toBeAssigned() {
            return this.toBeAssigned;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Engagement{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", engagementType=" + this.engagementType + ", contactId=" + this.contactId + ", primaryTeamId=" + this.primaryTeamId + ", toBeAssigned=" + this.toBeAssigned + ", ownerId=" + this.ownerId + ", contactPrimaryTeamId=" + this.contactPrimaryTeamId + ", contactOwnerId=" + this.contactOwnerId + ", addedById=" + this.addedById + ", updatedById=" + this.updatedById + ", callStatus=" + this.callStatus + ", engagementStatus=" + this.engagementStatus + ", parentEngagementId=" + this.parentEngagementId + ", nextStepTaskId=" + this.nextStepTaskId + ", syncStatus=" + this.syncStatus + ", externalNumber=" + this.externalNumber + ", userNumber=" + this.userNumber + ", callDirection=" + this.callDirection + ", callConnectStatus=" + this.callConnectStatus + ", callStartTime=" + this.callStartTime + ", callEndTime=" + this.callEndTime + ", durationInMillis=" + this.durationInMillis + ", callOutcome=" + this.callOutcome + ", callOutcomeNature=" + this.callOutcomeNature + ", callRecordingExternalResource=" + this.callRecordingExternalResource + ", noteHeading=" + this.noteHeading + ", noteAdditionMethod=" + this.noteAdditionMethod + ", voiceNoteUrl=" + this.voiceNoteUrl + ", body=" + this.body + ", isManualTask=" + this.isManualTask + ", taskHeading=" + this.taskHeading + ", taskType=" + this.taskType + ", taskActivityType=" + this.taskActivityType + ", taskInputNote=" + this.taskInputNote + ", taskPriority=" + this.taskPriority + ", taskCompletionNote=" + this.taskCompletionNote + ", taskCompletionTime=" + this.taskCompletionTime + ", taskCompletionType=" + this.taskCompletionType + ", dueDateTime=" + this.dueDateTime + ", nextFollowUpOn=" + this.nextFollowUpOn + ", nextFollowUpSetBy=" + this.nextFollowUpSetBy + ", reminderDateTime=" + this.reminderDateTime + ", callRecordingUrl=" + this.callRecordingUrl + ", callTranscriptUrl=" + this.callTranscriptUrl + ", callTranscriptSummary=" + this.callTranscriptSummary + ", uploadedFiledUrl=" + this.uploadedFiledUrl + ", visitTime=" + this.visitTime + ", visitNote=" + this.visitNote + ", visitOutcome=" + this.visitOutcome + ", visitOutcomeNature=" + this.visitOutcomeNature + ", videoCallPlatform=" + this.videoCallPlatform + ", videoCallLink=" + this.videoCallLink + ", meetingName=" + this.meetingName + ", meetingCode=" + this.meetingCode + ", videoCallMetadata=" + this.videoCallMetadata + ", videoCallOutcome=" + this.videoCallOutcome + ", paymentDataId=" + this.paymentDataId + ", calendarEventId=" + this.calendarEventId + ", calendarName=" + this.calendarName + ", campaignId=" + this.campaignId + ", campaignRun=" + this.campaignRun + ", engagementSourceType=" + this.engagementSourceType + ", engagementSource=" + this.engagementSource + ", engagementSourceLevelTwo=" + this.engagementSourceLevelTwo + ", systemAction=" + this.systemAction + ", taskEngagementActions=" + this.taskEngagementActions + ", taskEngagementActionsUpdatedAt=" + this.taskEngagementActionsUpdatedAt + ", firstTaskEngagementActionOn=" + this.firstTaskEngagementActionOn + ", taskEngagementActionCount=" + this.taskEngagementActionCount + ", customCallOutcomeData=" + this.customCallOutcomeData + ", customVisitOutcomeData=" + this.customVisitOutcomeData + ", customTaskCompletionData=" + this.customTaskCompletionData + ", customTaskInputData=" + this.customTaskInputData + ", customVideoCallInputData=" + this.customVideoCallInputData + ", deviceId=" + this.deviceId + ", totalCallDuration=" + this.totalCallDuration + ", cloudProviderNumber=" + this.cloudProviderNumber + ", hangupReason=" + this.hangupReason + ", cloudProvider=" + this.cloudProvider + ", callType=" + this.callType + ", phoneCallLogId=" + this.phoneCallLogId + ", externalEventRecordId=" + this.externalEventRecordId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public Integer totalCallDuration() {
            return this.totalCallDuration;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String uploadedFiledUrl() {
            return this.uploadedFiledUrl;
        }

        public String userNumber() {
            return this.userNumber;
        }

        public String videoCallLink() {
            return this.videoCallLink;
        }

        public String videoCallMetadata() {
            return this.videoCallMetadata;
        }

        public String videoCallOutcome() {
            return this.videoCallOutcome;
        }

        public String videoCallPlatform() {
            return this.videoCallPlatform;
        }

        public String visitNote() {
            return this.visitNote;
        }

        public String visitOutcome() {
            return this.visitOutcome;
        }

        public String visitOutcomeNature() {
            return this.visitOutcomeNature;
        }

        public String visitTime() {
            return this.visitTime;
        }

        public String voiceNoteUrl() {
            return this.voiceNoteUrl;
        }
    }

    public static class Mentioned {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("entityType", "entityType", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, false, CustomType.ID, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String entityId;
        final MentionedEntityType entityType;

        public static final class Mapper implements ResponseFieldMapper<Mentioned> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Mentioned map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Mentioned.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String string2 = responseReader.readString(responseFieldArr[1]);
                return new Mentioned(string, string2 != null ? MentionedEntityType.valueOf(string2) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]));
            }
        }

        public Mentioned(String str, MentionedEntityType mentionedEntityType, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.entityType = (MentionedEntityType) Utils.checkNotNull(mentionedEntityType, "entityType == null");
            this.entityId = (String) Utils.checkNotNull(str2, "entityId == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String entityId() {
            return this.entityId;
        }

        public MentionedEntityType entityType() {
            return this.entityType;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Mentioned)) {
                return false;
            }
            Mentioned mentioned = (Mentioned) obj;
            return this.__typename.equals(mentioned.__typename) && this.entityType.equals(mentioned.entityType) && this.entityId.equals(mentioned.entityId);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                this.$hashCode = ((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.entityType.hashCode()) * 1000003) ^ this.entityId.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Mentioned.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Mentioned.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Mentioned.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Mentioned.this.entityType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Mentioned.this.entityId);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Mentioned{__typename=" + this.__typename + ", entityType=" + this.entityType + ", entityId=" + this.entityId + "}";
            }
            return this.$toString;
        }
    }

    public static class OnCreateComment {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Account account;
        final String accountId;
        final Activity activity;
        final String activityId;
        final String body;
        final ChildEngagements childEngagements;
        final String createdAt;
        final Engagement engagement;
        final String engagementId;
        final String id;
        final List<Mentioned> mentioned;
        final String ownerId;
        final String parentEngagementId;
        final String updatedAt;
        final UserCommenting userCommenting;

        public static final class Mapper implements ResponseFieldMapper<OnCreateComment> {
            final Mentioned.Mapper mentionedFieldMapper = new Mentioned.Mapper();
            final Account.Mapper accountFieldMapper = new Account.Mapper();
            final Engagement.Mapper engagementFieldMapper = new Engagement.Mapper();
            final Activity.Mapper activityFieldMapper = new Activity.Mapper();
            final ChildEngagements.Mapper childEngagementsFieldMapper = new ChildEngagements.Mapper();
            final UserCommenting.Mapper userCommentingFieldMapper = new UserCommenting.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnCreateComment map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnCreateComment.$responseFields;
                return new OnCreateComment(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readList(responseFieldArr[4], new ResponseReader.ListReader<Mentioned>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.OnCreateComment.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Mentioned read(ResponseReader.ListItemReader listItemReader) {
                        return (Mentioned) listItemReader.readObject(new ResponseReader.ObjectReader<Mentioned>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.OnCreateComment.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Mentioned read(ResponseReader responseReader2) {
                                return Mapper.this.mentionedFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (Account) responseReader.readObject(responseFieldArr[11], new ResponseReader.ObjectReader<Account>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.OnCreateComment.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Account read(ResponseReader responseReader2) {
                        return Mapper.this.accountFieldMapper.map(responseReader2);
                    }
                }), (Engagement) responseReader.readObject(responseFieldArr[12], new ResponseReader.ObjectReader<Engagement>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.OnCreateComment.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Engagement read(ResponseReader responseReader2) {
                        return Mapper.this.engagementFieldMapper.map(responseReader2);
                    }
                }), (Activity) responseReader.readObject(responseFieldArr[13], new ResponseReader.ObjectReader<Activity>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.OnCreateComment.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Activity read(ResponseReader responseReader2) {
                        return Mapper.this.activityFieldMapper.map(responseReader2);
                    }
                }), (ChildEngagements) responseReader.readObject(responseFieldArr[14], new ResponseReader.ObjectReader<ChildEngagements>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.OnCreateComment.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ChildEngagements read(ResponseReader responseReader2) {
                        return Mapper.this.childEngagementsFieldMapper.map(responseReader2);
                    }
                }), (UserCommenting) responseReader.readObject(responseFieldArr[15], new ResponseReader.ObjectReader<UserCommenting>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.OnCreateComment.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UserCommenting read(ResponseReader responseReader2) {
                        return Mapper.this.userCommentingFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forList("mentioned", "mentioned", null, true, Collections.emptyList()), ResponseField.forString("body", "body", null, false, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("activityId", "activityId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("parentEngagementId", "parentEngagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("account", "account", null, true, Collections.emptyList()), ResponseField.forObject("engagement", "engagement", null, true, Collections.emptyList()), ResponseField.forObject("activity", "activity", null, true, Collections.emptyList()), ResponseField.forObject("childEngagements", "childEngagements", null, true, Collections.emptyList()), ResponseField.forObject("userCommenting", "userCommenting", null, true, Collections.emptyList())};
        }

        public OnCreateComment(String str, String str2, String str3, String str4, List<Mentioned> list, String str5, String str6, String str7, String str8, String str9, String str10, Account account, Engagement engagement, Activity activity, ChildEngagements childEngagements, UserCommenting userCommenting) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.ownerId = (String) Utils.checkNotNull(str4, "ownerId == null");
            this.mentioned = list;
            this.body = (String) Utils.checkNotNull(str5, "body == null");
            this.engagementId = str6;
            this.activityId = str7;
            this.parentEngagementId = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
            this.account = account;
            this.engagement = engagement;
            this.activity = activity;
            this.childEngagements = childEngagements;
            this.userCommenting = userCommenting;
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

        public Activity activity() {
            return this.activity;
        }

        public String activityId() {
            return this.activityId;
        }

        public String body() {
            return this.body;
        }

        public ChildEngagements childEngagements() {
            return this.childEngagements;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public Engagement engagement() {
            return this.engagement;
        }

        public String engagementId() {
            return this.engagementId;
        }

        public boolean equals(Object obj) {
            List<Mentioned> list;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Account account;
            Engagement engagement;
            Activity activity;
            ChildEngagements childEngagements;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnCreateComment)) {
                return false;
            }
            OnCreateComment onCreateComment = (OnCreateComment) obj;
            if (this.__typename.equals(onCreateComment.__typename) && this.id.equals(onCreateComment.id) && this.accountId.equals(onCreateComment.accountId) && this.ownerId.equals(onCreateComment.ownerId) && ((list = this.mentioned) != null ? list.equals(onCreateComment.mentioned) : onCreateComment.mentioned == null) && this.body.equals(onCreateComment.body) && ((str = this.engagementId) != null ? str.equals(onCreateComment.engagementId) : onCreateComment.engagementId == null) && ((str2 = this.activityId) != null ? str2.equals(onCreateComment.activityId) : onCreateComment.activityId == null) && ((str3 = this.parentEngagementId) != null ? str3.equals(onCreateComment.parentEngagementId) : onCreateComment.parentEngagementId == null) && ((str4 = this.createdAt) != null ? str4.equals(onCreateComment.createdAt) : onCreateComment.createdAt == null) && ((str5 = this.updatedAt) != null ? str5.equals(onCreateComment.updatedAt) : onCreateComment.updatedAt == null) && ((account = this.account) != null ? account.equals(onCreateComment.account) : onCreateComment.account == null) && ((engagement = this.engagement) != null ? engagement.equals(onCreateComment.engagement) : onCreateComment.engagement == null) && ((activity = this.activity) != null ? activity.equals(onCreateComment.activity) : onCreateComment.activity == null) && ((childEngagements = this.childEngagements) != null ? childEngagements.equals(onCreateComment.childEngagements) : onCreateComment.childEngagements == null)) {
                UserCommenting userCommenting = this.userCommenting;
                UserCommenting userCommenting2 = onCreateComment.userCommenting;
                if (userCommenting == null) {
                    if (userCommenting2 == null) {
                        return true;
                    }
                } else if (userCommenting.equals(userCommenting2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                List<Mentioned> list = this.mentioned;
                int iHashCode2 = (((iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003) ^ this.body.hashCode()) * 1000003;
                String str = this.engagementId;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.activityId;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.parentEngagementId;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Account account = this.account;
                int iHashCode8 = (iHashCode7 ^ (account == null ? 0 : account.hashCode())) * 1000003;
                Engagement engagement = this.engagement;
                int iHashCode9 = (iHashCode8 ^ (engagement == null ? 0 : engagement.hashCode())) * 1000003;
                Activity activity = this.activity;
                int iHashCode10 = (iHashCode9 ^ (activity == null ? 0 : activity.hashCode())) * 1000003;
                ChildEngagements childEngagements = this.childEngagements;
                int iHashCode11 = (iHashCode10 ^ (childEngagements == null ? 0 : childEngagements.hashCode())) * 1000003;
                UserCommenting userCommenting = this.userCommenting;
                this.$hashCode = iHashCode11 ^ (userCommenting != null ? userCommenting.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.OnCreateComment.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnCreateComment.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnCreateComment.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnCreateComment.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnCreateComment.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnCreateComment.this.ownerId);
                    responseWriter.writeList(responseFieldArr[4], OnCreateComment.this.mentioned, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.OnCreateComment.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Mentioned) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[5], OnCreateComment.this.body);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], OnCreateComment.this.engagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], OnCreateComment.this.activityId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnCreateComment.this.parentEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], OnCreateComment.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], OnCreateComment.this.updatedAt);
                    ResponseField responseField = responseFieldArr[11];
                    Account account = OnCreateComment.this.account;
                    responseWriter.writeObject(responseField, account != null ? account.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[12];
                    Engagement engagement = OnCreateComment.this.engagement;
                    responseWriter.writeObject(responseField2, engagement != null ? engagement.marshaller() : null);
                    ResponseField responseField3 = responseFieldArr[13];
                    Activity activity = OnCreateComment.this.activity;
                    responseWriter.writeObject(responseField3, activity != null ? activity.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[14];
                    ChildEngagements childEngagements = OnCreateComment.this.childEngagements;
                    responseWriter.writeObject(responseField4, childEngagements != null ? childEngagements.marshaller() : null);
                    ResponseField responseField5 = responseFieldArr[15];
                    UserCommenting userCommenting = OnCreateComment.this.userCommenting;
                    responseWriter.writeObject(responseField5, userCommenting != null ? userCommenting.marshaller() : null);
                }
            };
        }

        public List<Mentioned> mentioned() {
            return this.mentioned;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String parentEngagementId() {
            return this.parentEngagementId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OnCreateComment{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", mentioned=" + this.mentioned + ", body=" + this.body + ", engagementId=" + this.engagementId + ", activityId=" + this.activityId + ", parentEngagementId=" + this.parentEngagementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", account=" + this.account + ", engagement=" + this.engagement + ", activity=" + this.activity + ", childEngagements=" + this.childEngagements + ", userCommenting=" + this.userCommenting + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserCommenting userCommenting() {
            return this.userCommenting;
        }
    }

    public static class UserCommenting {
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

        public static final class Mapper implements ResponseFieldMapper<UserCommenting> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UserCommenting map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UserCommenting.$responseFields;
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
                return new UserCommenting(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public UserCommenting(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof UserCommenting)) {
                return false;
            }
            UserCommenting userCommenting = (UserCommenting) obj;
            if (this.__typename.equals(userCommenting.__typename) && this.id.equals(userCommenting.id) && this.addedSourceType.equals(userCommenting.addedSourceType) && this.name.equals(userCommenting.name) && ((str = this.profilePictureUrl) != null ? str.equals(userCommenting.profilePictureUrl) : userCommenting.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(userCommenting.registeredEmail) : userCommenting.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(userCommenting.registeredEmailVerified) : userCommenting.registeredEmailVerified == null) && this.registeredNumber.equals(userCommenting.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(userCommenting.registeredNumberVerified) : userCommenting.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(userCommenting.secondaryNumber) : userCommenting.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(userCommenting.secondaryNumberVerified) : userCommenting.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(userCommenting.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(userCommenting.lastSelectedAccountWeb) : userCommenting.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(userCommenting.lastSelectedAccountApp) : userCommenting.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(userCommenting.appVersion) : userCommenting.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(userCommenting.deviceModel) : userCommenting.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(userCommenting.deviceManufacturer) : userCommenting.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(userCommenting.androidVersionRelease) : userCommenting.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(userCommenting.createdAt) : userCommenting.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = userCommenting.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.UserCommenting.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UserCommenting.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UserCommenting.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UserCommenting.this.id);
                    responseWriter.writeString(responseFieldArr[2], UserCommenting.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], UserCommenting.this.name);
                    responseWriter.writeString(responseFieldArr[4], UserCommenting.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UserCommenting.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], UserCommenting.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UserCommenting.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], UserCommenting.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UserCommenting.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], UserCommenting.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], UserCommenting.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UserCommenting.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UserCommenting.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], UserCommenting.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], UserCommenting.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], UserCommenting.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], UserCommenting.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], UserCommenting.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], UserCommenting.this.updatedAt);
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
                this.$toString = "UserCommenting{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        private final String accountId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            linkedHashMap.put("accountId", str);
        }

        public String accountId() {
            return this.accountId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateCommentSubscription.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public OnCreateCommentSubscription(String str) {
        Utils.checkNotNull(str, "accountId == null");
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
        return "d66a9131e906abe5108bfb0cbebdf13fe95697cd11912f5340567c0a2bd2fe1a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnCreateComment($accountId: ID!) {\n  onCreateComment(accountId: $accountId) {\n    __typename\n    id\n    accountId\n    ownerId\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    body\n    engagementId\n    activityId\n    parentEngagementId\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    engagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    activity {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n    childEngagements {\n      __typename\n      nextToken\n    }\n    userCommenting {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
