package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.amplifyframework.storage.s3.transfer.TransferTable;
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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import type.AccountStatus;
import type.AccountType;
import type.CallConnectStatus;
import type.CallDirection;
import type.ContactAssignmentStatus;
import type.ContactStatus;
import type.CustomType;
import type.Day;
import type.DealOutcome;
import type.DealState;
import type.EngagementStatus;
import type.EngagementType;
import type.HasParent;
import type.LeadLifecycleStage;
import type.LeadLifecycleStageSubCategory;
import type.ModelfileObjectRelationshipConditionInput;
import type.NoteAdditionMethod;
import type.ProductServiceType;
import type.ScopeLevel;
import type.Seniority;
import type.TaskActivityType;
import type.UpdateFileObjectRelationshipInput;

/* loaded from: classes4.dex */
public final class UpdateFileObjectRelationshipMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateFileObjectRelationship($input: UpdateFileObjectRelationshipInput!, $condition: ModelfileObjectRelationshipConditionInput) {\n  updateFileObjectRelationship(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    fileId\n    fileUrl\n    contactId\n    engagementId\n    businessId\n    dealId\n    productId\n    createdAt\n    updatedAt\n    parentObjectId\n    parentObjectType\n    fieldName\n    inputContext\n    transcription\n    translatedTranscription\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    productService {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    engagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    deal {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    file {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    business {\n      __typename\n      id\n      accountId\n      name\n      industry\n      priority\n      website\n      domain\n      logo\n      userDefinedTags\n      addedById\n      updatedById\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateFileObjectRelationship";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateFileObjectRelationship($input: UpdateFileObjectRelationshipInput!, $condition: ModelfileObjectRelationshipConditionInput) {\n  updateFileObjectRelationship(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    fileId\n    fileUrl\n    contactId\n    engagementId\n    businessId\n    dealId\n    productId\n    createdAt\n    updatedAt\n    parentObjectId\n    parentObjectType\n    fieldName\n    inputContext\n    transcription\n    translatedTranscription\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    productService {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    engagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    deal {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    file {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    business {\n      __typename\n      id\n      accountId\n      name\n      industry\n      priority\n      website\n      domain\n      logo\n      userDefinedTags\n      addedById\n      updatedById\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
                return new Account(string, str, string2, accountTypeValueOf, string4, str2, string5 != null ? AccountStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readString(responseFieldArr[31]), responseReader.readString(responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readInt(responseFieldArr[34]), responseReader.readBoolean(responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readList(responseFieldArr[39], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readBoolean(responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readList(responseFieldArr[45], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[46], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readList(responseFieldArr[51], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.Mapper.5
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.1
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
                    responseWriter.writeList(responseFieldArr[15], Account.this.productOrService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.1.1
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
                    responseWriter.writeList(responseFieldArr[39], Account.this.permissions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.1.2
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
                    responseWriter.writeList(responseFieldArr[45], Account.this.salesmaxSalesContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[46], Account.this.salesmaxSupportContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], Account.this.chatWidgetConfig);
                    responseWriter.writeString(responseFieldArr[48], Account.this.onboardingStatus);
                    responseWriter.writeString(responseFieldArr[49], Account.this.integrationNeeded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], Account.this.matchingDealId);
                    responseWriter.writeList(responseFieldArr[51], Account.this.relatedAccountIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Account.1.5
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
        private ModelfileObjectRelationshipConditionInput condition;
        private UpdateFileObjectRelationshipInput input;

        public UpdateFileObjectRelationshipMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateFileObjectRelationshipMutation(this.input, this.condition);
        }

        public Builder condition(ModelfileObjectRelationshipConditionInput modelfileObjectRelationshipConditionInput) {
            this.condition = modelfileObjectRelationshipConditionInput;
            return this;
        }

        public Builder input(UpdateFileObjectRelationshipInput updateFileObjectRelationshipInput) {
            this.input = updateFileObjectRelationshipInput;
            return this;
        }
    }

    public static class Business {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String addedById;
        final String createdAt;
        final String domain;
        final String id;
        final String industry;
        final String logo;
        final String name;
        final String priority;
        final String updatedAt;
        final String updatedById;
        final List<String> userDefinedTags;
        final String website;

        public static final class Mapper implements ResponseFieldMapper<Business> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Business map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Business.$responseFields;
                return new Business(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readList(responseFieldArr[9], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Business.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("industry", "industry", null, true, Collections.emptyList()), ResponseField.forString("priority", "priority", null, true, Collections.emptyList()), ResponseField.forCustomType("website", "website", null, true, CustomType.AWSURL, Collections.emptyList()), ResponseField.forString(ClientCookie.DOMAIN_ATTR, ClientCookie.DOMAIN_ATTR, null, true, Collections.emptyList()), ResponseField.forString("logo", "logo", null, true, Collections.emptyList()), ResponseField.forList("userDefinedTags", "userDefinedTags", null, true, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Business(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = (String) Utils.checkNotNull(str4, "name == null");
            this.industry = str5;
            this.priority = str6;
            this.website = str7;
            this.domain = str8;
            this.logo = str9;
            this.userDefinedTags = list;
            this.addedById = str10;
            this.updatedById = str11;
            this.createdAt = str12;
            this.updatedAt = str13;
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

        public String createdAt() {
            return this.createdAt;
        }

        public String domain() {
            return this.domain;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list;
            String str6;
            String str7;
            String str8;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Business)) {
                return false;
            }
            Business business = (Business) obj;
            if (this.__typename.equals(business.__typename) && this.id.equals(business.id) && this.accountId.equals(business.accountId) && this.name.equals(business.name) && ((str = this.industry) != null ? str.equals(business.industry) : business.industry == null) && ((str2 = this.priority) != null ? str2.equals(business.priority) : business.priority == null) && ((str3 = this.website) != null ? str3.equals(business.website) : business.website == null) && ((str4 = this.domain) != null ? str4.equals(business.domain) : business.domain == null) && ((str5 = this.logo) != null ? str5.equals(business.logo) : business.logo == null) && ((list = this.userDefinedTags) != null ? list.equals(business.userDefinedTags) : business.userDefinedTags == null) && ((str6 = this.addedById) != null ? str6.equals(business.addedById) : business.addedById == null) && ((str7 = this.updatedById) != null ? str7.equals(business.updatedById) : business.updatedById == null) && ((str8 = this.createdAt) != null ? str8.equals(business.createdAt) : business.createdAt == null)) {
                String str9 = this.updatedAt;
                String str10 = business.updatedAt;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.industry;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.priority;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.website;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.domain;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.logo;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list = this.userDefinedTags;
                int iHashCode7 = (iHashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.addedById;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedById;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                this.$hashCode = iHashCode10 ^ (str9 != null ? str9.hashCode() : 0);
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

        public String logo() {
            return this.logo;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Business.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Business.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Business.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Business.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Business.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Business.this.name);
                    responseWriter.writeString(responseFieldArr[4], Business.this.industry);
                    responseWriter.writeString(responseFieldArr[5], Business.this.priority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Business.this.website);
                    responseWriter.writeString(responseFieldArr[7], Business.this.domain);
                    responseWriter.writeString(responseFieldArr[8], Business.this.logo);
                    responseWriter.writeList(responseFieldArr[9], Business.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Business.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Business.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Business.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Business.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Business.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String priority() {
            return this.priority;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Business{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", industry=" + this.industry + ", priority=" + this.priority + ", website=" + this.website + ", domain=" + this.domain + ", logo=" + this.logo + ", userDefinedTags=" + this.userDefinedTags + ", addedById=" + this.addedById + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public List<String> userDefinedTags() {
            return this.userDefinedTags;
        }

        public String website() {
            return this.website;
        }
    }

    public static class Contact {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String accountPriority;
        final String activeDealStage;
        final String activeDealStageUpdatedAt;
        final String addedById;
        final String assignedToId;
        final String assignmentMethod;
        final String becameCustomerOn;
        final String blockedForCallById;
        final String blockedForCallReason;
        final String blockedForCallUntil;
        final String bulkUploadReference;
        final String callPriority;
        final String contactSource;
        final String contactSourceDrillDownOne;
        final String contactSourceDrillDownOneId;
        final String contactSourceDrillDownThree;
        final String contactSourceDrillDownThreeId;
        final String contactSourceDrillDownTwo;
        final String contactSourceDrillDownTwoId;
        final ContactStatus contactStatus;
        final String contactType;
        final String createdAt;
        final String customAttributes;
        final String customDataAddedFromAddContactForm;
        final String dealDescription;
        final String department;
        final String designation;
        final String firstProspectingDoneOn;
        final String freshLeadTag;
        final String gender;
        final Boolean hasTask;
        final String id;
        final String isCustomer;
        final Boolean isDecisionMaker;
        final Boolean isPrivate;
        final CallDirection lastCallDirection;
        final Integer lastCallDuration;
        final String lastCallEngagementId;
        final String lastCallOutcome;
        final String lastCallOutcomeNature;
        final String lastCallUserId;
        final String lastCalledTime;
        final String lastClosedTaskDetail;
        final String lastClosedTaskDetailUpdatedAt;
        final String lastDealStageType;
        final String lastEmailEngagementId;
        final String lastEmailTime;
        final String lastEmailUserId;
        final String lastEngagementFromAccount;
        final String lastEngagementFromContact;
        final String lastKnownDisposition;
        final String lastKnownDispositionTime;
        final String lastLeadAssignmentDateTime;
        final String lastNoteAddedTime;
        final String lastNoteEngagementId;
        final String lastNoteUserId;
        final String lastPaymentStatus;
        final String lastProspectingDoneOn;
        final String lastRepeatEnquiryDate;
        final String lastRepeatEnquirySource;
        final String lastSmsEngagementId;
        final String lastSmsTime;
        final String lastSmsUserId;
        final String lastTaskDoneEngagementId;
        final String lastTaskDoneTime;
        final String lastTaskDoneUserId;
        final String lastVisitEngagementId;
        final String lastVisitOutcome;
        final String lastVisitOutcomeNature;
        final String lastVisitTime;
        final String lastVisitUserId;
        final String lastWabaBroadcastReplyBody;
        final String lastWabaBroadcastReplyTime;
        final String lastWabaBroadcastReplyType;
        final String lastWabaBroadcastStatus;
        final String lastWabaBroadcastTemplate;
        final String lastWabaBroadcastTime;
        final String lastWhatsappEngagementId;
        final String lastWhatsappTime;
        final String lastWhatsappUserId;
        final String latestRemark;
        final Integer leadCallsNotAnswered;
        final LeadLifecycleStage leadLifecycleStage;
        final LeadLifecycleStageSubCategory leadLifecycleStageSubCategory;
        final String lockPeriod;
        final String manualClosedReason;
        final String movedToClosedOn;
        final String movedToOpportunityOn;
        final String name;
        final String needFollowUpTag;
        final String needFollowUpTagUpdatedAt;
        final String nextProspectingDueOn;
        final String nextProspectingNote;
        final String nextProspectingSetBy;
        final String noWorkAfterAssignment;
        final Integer numberOfTimesRechurned;
        final TaskActivityType openTaskActivityType;
        final Integer openTaskCount;
        final String openTaskDetail;
        final String openVideoCallDetail;
        final String ownerId;
        final String paymentRequestDetail;
        final List<Day> preferredContactDays;
        final String primaryTeamId;
        final List<String> productService;
        final String profilePhotoUrl;
        final Integer prospectingAttempts;
        final List<String> recentEngagements;
        final String recentEngagementsUpdatedAt;
        final String referredBy;
        final String salutation;
        final Seniority seniority;
        final List<String> sharedOwners;
        final List<String> sharedTeams;
        final ContactAssignmentStatus toBeAssigned;
        final Integer totalProspectingAttemptsAcrossRechurn;
        final Integer unsuccessfulCallAttempts;
        final String updatedAt;
        final String updatedById;
        final List<String> userDefinedTags;
        final String waChatChannelId;
        final String whatsappOptInStatus;

        public static final class Mapper implements ResponseFieldMapper<Contact> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Contact map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Contact.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                ContactAssignmentStatus contactAssignmentStatusValueOf = string2 != null ? ContactAssignmentStatus.valueOf(string2) : null;
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                List list2 = responseReader.readList(responseFieldArr[7], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String string3 = responseReader.readString(responseFieldArr[8]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String string4 = responseReader.readString(responseFieldArr[12]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                String string5 = responseReader.readString(responseFieldArr[14]);
                String str9 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]);
                String string6 = responseReader.readString(responseFieldArr[16]);
                String string7 = responseReader.readString(responseFieldArr[17]);
                String string8 = responseReader.readString(responseFieldArr[18]);
                String string9 = responseReader.readString(responseFieldArr[19]);
                String str10 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]);
                String str11 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]);
                String str12 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]);
                String string10 = responseReader.readString(responseFieldArr[23]);
                ContactStatus contactStatusValueOf = string10 != null ? ContactStatus.valueOf(string10) : null;
                String string11 = responseReader.readString(responseFieldArr[24]);
                String string12 = responseReader.readString(responseFieldArr[25]);
                String string13 = responseReader.readString(responseFieldArr[26]);
                String str13 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]);
                String string14 = responseReader.readString(responseFieldArr[28]);
                String string15 = responseReader.readString(responseFieldArr[29]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[30]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[31]);
                String str14 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]);
                String string16 = responseReader.readString(responseFieldArr[33]);
                List list3 = responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<Day>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Day read(ResponseReader.ListItemReader listItemReader) {
                        return Day.valueOf(listItemReader.readString());
                    }
                });
                String string17 = responseReader.readString(responseFieldArr[35]);
                String string18 = responseReader.readString(responseFieldArr[36]);
                String string19 = responseReader.readString(responseFieldArr[37]);
                String string20 = responseReader.readString(responseFieldArr[38]);
                Seniority seniorityValueOf = string20 != null ? Seniority.valueOf(string20) : null;
                String str15 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[39]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[40]);
                String string21 = responseReader.readString(responseFieldArr[41]);
                TaskActivityType taskActivityTypeValueOf = string21 != null ? TaskActivityType.valueOf(string21) : null;
                String str16 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]);
                String string22 = responseReader.readString(responseFieldArr[43]);
                CallDirection callDirectionValueOf = string22 != null ? CallDirection.valueOf(string22) : null;
                String string23 = responseReader.readString(responseFieldArr[44]);
                String string24 = responseReader.readString(responseFieldArr[45]);
                String str17 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[46]);
                Integer num = responseReader.readInt(responseFieldArr[47]);
                String string25 = responseReader.readString(responseFieldArr[48]);
                String str18 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[49]);
                String string26 = responseReader.readString(responseFieldArr[50]);
                String string27 = responseReader.readString(responseFieldArr[51]);
                String str19 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[52]);
                String string28 = responseReader.readString(responseFieldArr[53]);
                String str20 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[54]);
                String str21 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[55]);
                String string29 = responseReader.readString(responseFieldArr[56]);
                String str22 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[57]);
                String str23 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[58]);
                String string30 = responseReader.readString(responseFieldArr[59]);
                String str24 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[60]);
                String string31 = responseReader.readString(responseFieldArr[61]);
                String string32 = responseReader.readString(responseFieldArr[62]);
                String string33 = responseReader.readString(responseFieldArr[63]);
                String str25 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[64]);
                String string34 = responseReader.readString(responseFieldArr[65]);
                String str26 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[66]);
                String str27 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[67]);
                String string35 = responseReader.readString(responseFieldArr[68]);
                String str28 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[69]);
                String str29 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[70]);
                String string36 = responseReader.readString(responseFieldArr[71]);
                String str30 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[72]);
                String str31 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[73]);
                String string37 = responseReader.readString(responseFieldArr[74]);
                Integer num2 = responseReader.readInt(responseFieldArr[75]);
                String string38 = responseReader.readString(responseFieldArr[76]);
                String str32 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[77]);
                String str33 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[78]);
                String str34 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[79]);
                String str35 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[80]);
                String string39 = responseReader.readString(responseFieldArr[81]);
                String string40 = responseReader.readString(responseFieldArr[82]);
                String string41 = responseReader.readString(responseFieldArr[83]);
                String str36 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[84]);
                String string42 = responseReader.readString(responseFieldArr[85]);
                String str37 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[86]);
                String string43 = responseReader.readString(responseFieldArr[87]);
                String string44 = responseReader.readString(responseFieldArr[88]);
                String str38 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[89]);
                Integer num3 = responseReader.readInt(responseFieldArr[90]);
                Integer num4 = responseReader.readInt(responseFieldArr[91]);
                List list4 = responseReader.readList(responseFieldArr[92], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                List list5 = responseReader.readList(responseFieldArr[93], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string45 = responseReader.readString(responseFieldArr[94]);
                String string46 = responseReader.readString(responseFieldArr[95]);
                String string47 = responseReader.readString(responseFieldArr[96]);
                List list6 = responseReader.readList(responseFieldArr[97], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.Mapper.6
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                });
                String str39 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[98]);
                String str40 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[99]);
                String str41 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[100]);
                String str42 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[101]);
                String str43 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[102]);
                String str44 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[103]);
                String str45 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[104]);
                String str46 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[105]);
                String string48 = responseReader.readString(responseFieldArr[106]);
                String str47 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[107]);
                String string49 = responseReader.readString(responseFieldArr[108]);
                LeadLifecycleStage leadLifecycleStageValueOf = string49 != null ? LeadLifecycleStage.valueOf(string49) : null;
                String string50 = responseReader.readString(responseFieldArr[109]);
                return new Contact(string, str, str2, str3, contactAssignmentStatusValueOf, list, str4, list2, string3, str5, str6, str7, string4, str8, string5, str9, string6, string7, string8, string9, str10, str11, str12, contactStatusValueOf, string11, string12, string13, str13, string14, string15, bool, bool2, str14, string16, list3, string17, string18, string19, seniorityValueOf, str15, bool3, taskActivityTypeValueOf, str16, callDirectionValueOf, string23, string24, str17, num, string25, str18, string26, string27, str19, string28, str20, str21, string29, str22, str23, string30, str24, string31, string32, string33, str25, string34, str26, str27, string35, str28, str29, string36, str30, str31, string37, num2, string38, str32, str33, str34, str35, string39, string40, string41, str36, string42, str37, string43, string44, str38, num3, num4, list4, list5, string45, string46, string47, list6, str39, str40, str41, str42, str43, str44, str45, str46, string48, str47, leadLifecycleStageValueOf, string50 != null ? LeadLifecycleStageSubCategory.valueOf(string50) : null, responseReader.readString(responseFieldArr[110]), responseReader.readString(responseFieldArr[111]), responseReader.readInt(responseFieldArr[112]), responseReader.readInt(responseFieldArr[113]), responseReader.readInt(responseFieldArr[114]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[115]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[116]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[117]), responseReader.readString(responseFieldArr[118]), responseReader.readString(responseFieldArr[119]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[120]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[121]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[122]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[123]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forList("sharedOwners", "sharedOwners", null, true, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forList("sharedTeams", "sharedTeams", null, true, Collections.emptyList()), ResponseField.forString("accountPriority", "accountPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("assignedToId", "assignedToId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("blockedForCallById", "blockedForCallById", null, true, customType, Collections.emptyList()), ResponseField.forString("blockedForCallReason", "blockedForCallReason", null, true, Collections.emptyList()), ResponseField.forCustomType("blockedForCallUntil", "blockedForCallUntil", null, true, customType2, Collections.emptyList()), ResponseField.forString("callPriority", "callPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("waChatChannelId", "waChatChannelId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactSource", "contactSource", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownOne", "contactSourceDrillDownOne", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownTwo", "contactSourceDrillDownTwo", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownThree", "contactSourceDrillDownThree", null, true, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownOneId", "contactSourceDrillDownOneId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownTwoId", "contactSourceDrillDownTwoId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownThreeId", "contactSourceDrillDownThreeId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactStatus", "contactStatus", null, true, Collections.emptyList()), ResponseField.forString("contactType", "contactType", null, true, Collections.emptyList()), ResponseField.forString("department", "department", null, true, Collections.emptyList()), ResponseField.forString("designation", "designation", null, true, Collections.emptyList()), ResponseField.forCustomType("lastRepeatEnquiryDate", "lastRepeatEnquiryDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastRepeatEnquirySource", "lastRepeatEnquirySource", null, true, Collections.emptyList()), ResponseField.forString("gender", "gender", null, true, Collections.emptyList()), ResponseField.forBoolean("isDecisionMaker", "isDecisionMaker", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrivate", "isPrivate", null, true, Collections.emptyList()), ResponseField.forCustomType("lockPeriod", "lockPeriod", null, true, customType2, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forList("preferredContactDays", "preferredContactDays", null, true, Collections.emptyList()), ResponseField.forString("profilePhotoUrl", "profilePhotoUrl", null, true, Collections.emptyList()), ResponseField.forString("referredBy", "referredBy", null, true, Collections.emptyList()), ResponseField.forString("salutation", "salutation", null, true, Collections.emptyList()), ResponseField.forString("seniority", "seniority", null, true, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("hasTask", "hasTask", null, true, Collections.emptyList()), ResponseField.forString("openTaskActivityType", "openTaskActivityType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCalledTime", "lastCalledTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastCallDirection", "lastCallDirection", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcome", "lastCallOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcomeNature", "lastCallOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCallUserId", "lastCallUserId", null, true, customType, Collections.emptyList()), ResponseField.forInt("lastCallDuration", "lastCallDuration", null, true, Collections.emptyList()), ResponseField.forString("lastCallEngagementId", "lastCallEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitTime", "lastVisitTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastVisitOutcome", "lastVisitOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastVisitOutcomeNature", "lastVisitOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitUserId", "lastVisitUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastVisitEngagementId", "lastVisitEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastEmailTime", "lastEmailTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEmailUserId", "lastEmailUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastEmailEngagementId", "lastEmailEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappTime", "lastWhatsappTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappUserId", "lastWhatsappUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastWhatsappEngagementId", "lastWhatsappEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastTime", "lastWabaBroadcastTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastStatus", "lastWabaBroadcastStatus", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastTemplate", "lastWabaBroadcastTemplate", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyBody", "lastWabaBroadcastReplyBody", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastReplyTime", "lastWabaBroadcastReplyTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyType", "lastWabaBroadcastReplyType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastSmsTime", "lastSmsTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastSmsUserId", "lastSmsUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastSmsEngagementId", "lastSmsEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastNoteAddedTime", "lastNoteAddedTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastNoteUserId", "lastNoteUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastNoteEngagementId", "lastNoteEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneTime", "lastTaskDoneTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneUserId", "lastTaskDoneUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastTaskDoneEngagementId", "lastTaskDoneEngagementId", null, true, Collections.emptyList()), ResponseField.forInt("openTaskCount", "openTaskCount", null, true, Collections.emptyList()), ResponseField.forString("lastKnownDisposition", "lastKnownDisposition", null, true, Collections.emptyList()), ResponseField.forCustomType("lastKnownDispositionTime", "lastKnownDispositionTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastLeadAssignmentDateTime", "lastLeadAssignmentDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromAccount", "lastEngagementFromAccount", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromContact", "lastEngagementFromContact", null, true, customType2, Collections.emptyList()), ResponseField.forString("freshLeadTag", "freshLeadTag", null, true, Collections.emptyList()), ResponseField.forString("noWorkAfterAssignment", "noWorkAfterAssignment", null, true, Collections.emptyList()), ResponseField.forString("needFollowUpTag", "needFollowUpTag", null, true, Collections.emptyList()), ResponseField.forCustomType("needFollowUpTagUpdatedAt", "needFollowUpTagUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("activeDealStage", "activeDealStage", null, true, Collections.emptyList()), ResponseField.forCustomType("activeDealStageUpdatedAt", "activeDealStageUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealDescription", "dealDescription", null, true, Collections.emptyList()), ResponseField.forString("isCustomer", "isCustomer", null, true, Collections.emptyList()), ResponseField.forCustomType("becameCustomerOn", "becameCustomerOn", null, true, customType2, Collections.emptyList()), ResponseField.forInt("unsuccessfulCallAttempts", "unsuccessfulCallAttempts", null, true, Collections.emptyList()), ResponseField.forInt("leadCallsNotAnswered", "leadCallsNotAnswered", null, true, Collections.emptyList()), ResponseField.forList("userDefinedTags", "userDefinedTags", null, true, Collections.emptyList()), ResponseField.forList("productService", "productService", null, true, Collections.emptyList()), ResponseField.forString("bulkUploadReference", "bulkUploadReference", null, true, Collections.emptyList()), ResponseField.forString("assignmentMethod", "assignmentMethod", null, true, Collections.emptyList()), ResponseField.forString("whatsappOptInStatus", "whatsappOptInStatus", null, true, Collections.emptyList()), ResponseField.forList("recentEngagements", "recentEngagements", null, true, Collections.emptyList()), ResponseField.forCustomType("recentEngagementsUpdatedAt", "recentEngagementsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("openTaskDetail", "openTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("openVideoCallDetail", "openVideoCallDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetail", "lastClosedTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetailUpdatedAt", "lastClosedTaskDetailUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("latestRemark", "latestRemark", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customAttributes", "customAttributes", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("paymentRequestDetail", "paymentRequestDetail", null, true, customType3, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("customDataAddedFromAddContactForm", "customDataAddedFromAddContactForm", null, true, customType3, Collections.emptyList()), ResponseField.forString("leadLifecycleStage", "leadLifecycleStage", null, true, Collections.emptyList()), ResponseField.forString("leadLifecycleStageSubCategory", "leadLifecycleStageSubCategory", null, true, Collections.emptyList()), ResponseField.forString("manualClosedReason", "manualClosedReason", null, true, Collections.emptyList()), ResponseField.forString("lastDealStageType", "lastDealStageType", null, true, Collections.emptyList()), ResponseField.forInt("prospectingAttempts", "prospectingAttempts", null, true, Collections.emptyList()), ResponseField.forInt("totalProspectingAttemptsAcrossRechurn", "totalProspectingAttemptsAcrossRechurn", null, true, Collections.emptyList()), ResponseField.forInt("numberOfTimesRechurned", "numberOfTimesRechurned", null, true, Collections.emptyList()), ResponseField.forCustomType("lastProspectingDoneOn", "lastProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("firstProspectingDoneOn", "firstProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextProspectingDueOn", "nextProspectingDueOn", null, true, customType2, Collections.emptyList()), ResponseField.forString("nextProspectingSetBy", "nextProspectingSetBy", null, true, Collections.emptyList()), ResponseField.forString("nextProspectingNote", "nextProspectingNote", null, true, Collections.emptyList()), ResponseField.forCustomType("movedToOpportunityOn", "movedToOpportunityOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("movedToClosedOn", "movedToClosedOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Contact(String str, String str2, String str3, String str4, ContactAssignmentStatus contactAssignmentStatus, List<String> list, String str5, List<String> list2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ContactStatus contactStatus, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, Boolean bool2, String str27, String str28, List<Day> list3, String str29, String str30, String str31, Seniority seniority, String str32, Boolean bool3, TaskActivityType taskActivityType, String str33, CallDirection callDirection, String str34, String str35, String str36, Integer num, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, Integer num2, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, Integer num3, Integer num4, List<String> list4, List<String> list5, String str78, String str79, String str80, List<String> list6, String str81, String str82, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, LeadLifecycleStage leadLifecycleStage, LeadLifecycleStageSubCategory leadLifecycleStageSubCategory, String str91, String str92, Integer num5, Integer num6, Integer num7, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.ownerId = str4;
            this.toBeAssigned = contactAssignmentStatus;
            this.sharedOwners = list;
            this.primaryTeamId = str5;
            this.sharedTeams = list2;
            this.accountPriority = str6;
            this.addedById = str7;
            this.assignedToId = str8;
            this.blockedForCallById = str9;
            this.blockedForCallReason = str10;
            this.blockedForCallUntil = str11;
            this.callPriority = str12;
            this.waChatChannelId = str13;
            this.contactSource = str14;
            this.contactSourceDrillDownOne = str15;
            this.contactSourceDrillDownTwo = str16;
            this.contactSourceDrillDownThree = str17;
            this.contactSourceDrillDownOneId = str18;
            this.contactSourceDrillDownTwoId = str19;
            this.contactSourceDrillDownThreeId = str20;
            this.contactStatus = contactStatus;
            this.contactType = str21;
            this.department = str22;
            this.designation = str23;
            this.lastRepeatEnquiryDate = str24;
            this.lastRepeatEnquirySource = str25;
            this.gender = str26;
            this.isDecisionMaker = bool;
            this.isPrivate = bool2;
            this.lockPeriod = str27;
            this.name = str28;
            this.preferredContactDays = list3;
            this.profilePhotoUrl = str29;
            this.referredBy = str30;
            this.salutation = str31;
            this.seniority = seniority;
            this.updatedById = str32;
            this.hasTask = bool3;
            this.openTaskActivityType = taskActivityType;
            this.lastCalledTime = str33;
            this.lastCallDirection = callDirection;
            this.lastCallOutcome = str34;
            this.lastCallOutcomeNature = str35;
            this.lastCallUserId = str36;
            this.lastCallDuration = num;
            this.lastCallEngagementId = str37;
            this.lastVisitTime = str38;
            this.lastVisitOutcome = str39;
            this.lastVisitOutcomeNature = str40;
            this.lastVisitUserId = str41;
            this.lastVisitEngagementId = str42;
            this.lastEmailTime = str43;
            this.lastEmailUserId = str44;
            this.lastEmailEngagementId = str45;
            this.lastWhatsappTime = str46;
            this.lastWhatsappUserId = str47;
            this.lastWhatsappEngagementId = str48;
            this.lastWabaBroadcastTime = str49;
            this.lastWabaBroadcastStatus = str50;
            this.lastWabaBroadcastTemplate = str51;
            this.lastWabaBroadcastReplyBody = str52;
            this.lastWabaBroadcastReplyTime = str53;
            this.lastWabaBroadcastReplyType = str54;
            this.lastSmsTime = str55;
            this.lastSmsUserId = str56;
            this.lastSmsEngagementId = str57;
            this.lastNoteAddedTime = str58;
            this.lastNoteUserId = str59;
            this.lastNoteEngagementId = str60;
            this.lastTaskDoneTime = str61;
            this.lastTaskDoneUserId = str62;
            this.lastTaskDoneEngagementId = str63;
            this.openTaskCount = num2;
            this.lastKnownDisposition = str64;
            this.lastKnownDispositionTime = str65;
            this.lastLeadAssignmentDateTime = str66;
            this.lastEngagementFromAccount = str67;
            this.lastEngagementFromContact = str68;
            this.freshLeadTag = str69;
            this.noWorkAfterAssignment = str70;
            this.needFollowUpTag = str71;
            this.needFollowUpTagUpdatedAt = str72;
            this.activeDealStage = str73;
            this.activeDealStageUpdatedAt = str74;
            this.dealDescription = str75;
            this.isCustomer = str76;
            this.becameCustomerOn = str77;
            this.unsuccessfulCallAttempts = num3;
            this.leadCallsNotAnswered = num4;
            this.userDefinedTags = list4;
            this.productService = list5;
            this.bulkUploadReference = str78;
            this.assignmentMethod = str79;
            this.whatsappOptInStatus = str80;
            this.recentEngagements = list6;
            this.recentEngagementsUpdatedAt = str81;
            this.openTaskDetail = str82;
            this.openVideoCallDetail = str83;
            this.lastClosedTaskDetail = str84;
            this.lastClosedTaskDetailUpdatedAt = str85;
            this.latestRemark = str86;
            this.customAttributes = str87;
            this.paymentRequestDetail = str88;
            this.lastPaymentStatus = str89;
            this.customDataAddedFromAddContactForm = str90;
            this.leadLifecycleStage = leadLifecycleStage;
            this.leadLifecycleStageSubCategory = leadLifecycleStageSubCategory;
            this.manualClosedReason = str91;
            this.lastDealStageType = str92;
            this.prospectingAttempts = num5;
            this.totalProspectingAttemptsAcrossRechurn = num6;
            this.numberOfTimesRechurned = num7;
            this.lastProspectingDoneOn = str93;
            this.firstProspectingDoneOn = str94;
            this.nextProspectingDueOn = str95;
            this.nextProspectingSetBy = str96;
            this.nextProspectingNote = str97;
            this.movedToOpportunityOn = str98;
            this.movedToClosedOn = str99;
            this.createdAt = str100;
            this.updatedAt = str101;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String accountPriority() {
            return this.accountPriority;
        }

        public String activeDealStage() {
            return this.activeDealStage;
        }

        public String activeDealStageUpdatedAt() {
            return this.activeDealStageUpdatedAt;
        }

        public String addedById() {
            return this.addedById;
        }

        public String assignedToId() {
            return this.assignedToId;
        }

        public String assignmentMethod() {
            return this.assignmentMethod;
        }

        public String becameCustomerOn() {
            return this.becameCustomerOn;
        }

        public String blockedForCallById() {
            return this.blockedForCallById;
        }

        public String blockedForCallReason() {
            return this.blockedForCallReason;
        }

        public String blockedForCallUntil() {
            return this.blockedForCallUntil;
        }

        public String bulkUploadReference() {
            return this.bulkUploadReference;
        }

        public String callPriority() {
            return this.callPriority;
        }

        public String contactSource() {
            return this.contactSource;
        }

        public String contactSourceDrillDownOne() {
            return this.contactSourceDrillDownOne;
        }

        public String contactSourceDrillDownOneId() {
            return this.contactSourceDrillDownOneId;
        }

        public String contactSourceDrillDownThree() {
            return this.contactSourceDrillDownThree;
        }

        public String contactSourceDrillDownThreeId() {
            return this.contactSourceDrillDownThreeId;
        }

        public String contactSourceDrillDownTwo() {
            return this.contactSourceDrillDownTwo;
        }

        public String contactSourceDrillDownTwoId() {
            return this.contactSourceDrillDownTwoId;
        }

        public ContactStatus contactStatus() {
            return this.contactStatus;
        }

        public String contactType() {
            return this.contactType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String customAttributes() {
            return this.customAttributes;
        }

        public String customDataAddedFromAddContactForm() {
            return this.customDataAddedFromAddContactForm;
        }

        public String dealDescription() {
            return this.dealDescription;
        }

        public String department() {
            return this.department;
        }

        public String designation() {
            return this.designation;
        }

        public boolean equals(Object obj) {
            String str;
            ContactAssignmentStatus contactAssignmentStatus;
            List<String> list;
            String str2;
            List<String> list2;
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
            String str14;
            String str15;
            String str16;
            String str17;
            ContactStatus contactStatus;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            Boolean bool;
            Boolean bool2;
            String str24;
            String str25;
            List<Day> list3;
            String str26;
            String str27;
            String str28;
            Seniority seniority;
            String str29;
            Boolean bool3;
            TaskActivityType taskActivityType;
            String str30;
            CallDirection callDirection;
            String str31;
            String str32;
            String str33;
            Integer num;
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
            String str55;
            String str56;
            String str57;
            String str58;
            String str59;
            String str60;
            Integer num2;
            String str61;
            String str62;
            String str63;
            String str64;
            String str65;
            String str66;
            String str67;
            String str68;
            String str69;
            String str70;
            String str71;
            String str72;
            String str73;
            String str74;
            Integer num3;
            Integer num4;
            List<String> list4;
            List<String> list5;
            String str75;
            String str76;
            String str77;
            List<String> list6;
            String str78;
            String str79;
            String str80;
            String str81;
            String str82;
            String str83;
            String str84;
            String str85;
            String str86;
            String str87;
            LeadLifecycleStage leadLifecycleStage;
            LeadLifecycleStageSubCategory leadLifecycleStageSubCategory;
            String str88;
            String str89;
            Integer num5;
            Integer num6;
            Integer num7;
            String str90;
            String str91;
            String str92;
            String str93;
            String str94;
            String str95;
            String str96;
            String str97;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Contact)) {
                return false;
            }
            Contact contact = (Contact) obj;
            if (this.__typename.equals(contact.__typename) && this.id.equals(contact.id) && this.accountId.equals(contact.accountId) && ((str = this.ownerId) != null ? str.equals(contact.ownerId) : contact.ownerId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(contact.toBeAssigned) : contact.toBeAssigned == null) && ((list = this.sharedOwners) != null ? list.equals(contact.sharedOwners) : contact.sharedOwners == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(contact.primaryTeamId) : contact.primaryTeamId == null) && ((list2 = this.sharedTeams) != null ? list2.equals(contact.sharedTeams) : contact.sharedTeams == null) && ((str3 = this.accountPriority) != null ? str3.equals(contact.accountPriority) : contact.accountPriority == null) && ((str4 = this.addedById) != null ? str4.equals(contact.addedById) : contact.addedById == null) && ((str5 = this.assignedToId) != null ? str5.equals(contact.assignedToId) : contact.assignedToId == null) && ((str6 = this.blockedForCallById) != null ? str6.equals(contact.blockedForCallById) : contact.blockedForCallById == null) && ((str7 = this.blockedForCallReason) != null ? str7.equals(contact.blockedForCallReason) : contact.blockedForCallReason == null) && ((str8 = this.blockedForCallUntil) != null ? str8.equals(contact.blockedForCallUntil) : contact.blockedForCallUntil == null) && ((str9 = this.callPriority) != null ? str9.equals(contact.callPriority) : contact.callPriority == null) && ((str10 = this.waChatChannelId) != null ? str10.equals(contact.waChatChannelId) : contact.waChatChannelId == null) && ((str11 = this.contactSource) != null ? str11.equals(contact.contactSource) : contact.contactSource == null) && ((str12 = this.contactSourceDrillDownOne) != null ? str12.equals(contact.contactSourceDrillDownOne) : contact.contactSourceDrillDownOne == null) && ((str13 = this.contactSourceDrillDownTwo) != null ? str13.equals(contact.contactSourceDrillDownTwo) : contact.contactSourceDrillDownTwo == null) && ((str14 = this.contactSourceDrillDownThree) != null ? str14.equals(contact.contactSourceDrillDownThree) : contact.contactSourceDrillDownThree == null) && ((str15 = this.contactSourceDrillDownOneId) != null ? str15.equals(contact.contactSourceDrillDownOneId) : contact.contactSourceDrillDownOneId == null) && ((str16 = this.contactSourceDrillDownTwoId) != null ? str16.equals(contact.contactSourceDrillDownTwoId) : contact.contactSourceDrillDownTwoId == null) && ((str17 = this.contactSourceDrillDownThreeId) != null ? str17.equals(contact.contactSourceDrillDownThreeId) : contact.contactSourceDrillDownThreeId == null) && ((contactStatus = this.contactStatus) != null ? contactStatus.equals(contact.contactStatus) : contact.contactStatus == null) && ((str18 = this.contactType) != null ? str18.equals(contact.contactType) : contact.contactType == null) && ((str19 = this.department) != null ? str19.equals(contact.department) : contact.department == null) && ((str20 = this.designation) != null ? str20.equals(contact.designation) : contact.designation == null) && ((str21 = this.lastRepeatEnquiryDate) != null ? str21.equals(contact.lastRepeatEnquiryDate) : contact.lastRepeatEnquiryDate == null) && ((str22 = this.lastRepeatEnquirySource) != null ? str22.equals(contact.lastRepeatEnquirySource) : contact.lastRepeatEnquirySource == null) && ((str23 = this.gender) != null ? str23.equals(contact.gender) : contact.gender == null) && ((bool = this.isDecisionMaker) != null ? bool.equals(contact.isDecisionMaker) : contact.isDecisionMaker == null) && ((bool2 = this.isPrivate) != null ? bool2.equals(contact.isPrivate) : contact.isPrivate == null) && ((str24 = this.lockPeriod) != null ? str24.equals(contact.lockPeriod) : contact.lockPeriod == null) && ((str25 = this.name) != null ? str25.equals(contact.name) : contact.name == null) && ((list3 = this.preferredContactDays) != null ? list3.equals(contact.preferredContactDays) : contact.preferredContactDays == null) && ((str26 = this.profilePhotoUrl) != null ? str26.equals(contact.profilePhotoUrl) : contact.profilePhotoUrl == null) && ((str27 = this.referredBy) != null ? str27.equals(contact.referredBy) : contact.referredBy == null) && ((str28 = this.salutation) != null ? str28.equals(contact.salutation) : contact.salutation == null) && ((seniority = this.seniority) != null ? seniority.equals(contact.seniority) : contact.seniority == null) && ((str29 = this.updatedById) != null ? str29.equals(contact.updatedById) : contact.updatedById == null) && ((bool3 = this.hasTask) != null ? bool3.equals(contact.hasTask) : contact.hasTask == null) && ((taskActivityType = this.openTaskActivityType) != null ? taskActivityType.equals(contact.openTaskActivityType) : contact.openTaskActivityType == null) && ((str30 = this.lastCalledTime) != null ? str30.equals(contact.lastCalledTime) : contact.lastCalledTime == null) && ((callDirection = this.lastCallDirection) != null ? callDirection.equals(contact.lastCallDirection) : contact.lastCallDirection == null) && ((str31 = this.lastCallOutcome) != null ? str31.equals(contact.lastCallOutcome) : contact.lastCallOutcome == null) && ((str32 = this.lastCallOutcomeNature) != null ? str32.equals(contact.lastCallOutcomeNature) : contact.lastCallOutcomeNature == null) && ((str33 = this.lastCallUserId) != null ? str33.equals(contact.lastCallUserId) : contact.lastCallUserId == null) && ((num = this.lastCallDuration) != null ? num.equals(contact.lastCallDuration) : contact.lastCallDuration == null) && ((str34 = this.lastCallEngagementId) != null ? str34.equals(contact.lastCallEngagementId) : contact.lastCallEngagementId == null) && ((str35 = this.lastVisitTime) != null ? str35.equals(contact.lastVisitTime) : contact.lastVisitTime == null) && ((str36 = this.lastVisitOutcome) != null ? str36.equals(contact.lastVisitOutcome) : contact.lastVisitOutcome == null) && ((str37 = this.lastVisitOutcomeNature) != null ? str37.equals(contact.lastVisitOutcomeNature) : contact.lastVisitOutcomeNature == null) && ((str38 = this.lastVisitUserId) != null ? str38.equals(contact.lastVisitUserId) : contact.lastVisitUserId == null) && ((str39 = this.lastVisitEngagementId) != null ? str39.equals(contact.lastVisitEngagementId) : contact.lastVisitEngagementId == null) && ((str40 = this.lastEmailTime) != null ? str40.equals(contact.lastEmailTime) : contact.lastEmailTime == null) && ((str41 = this.lastEmailUserId) != null ? str41.equals(contact.lastEmailUserId) : contact.lastEmailUserId == null) && ((str42 = this.lastEmailEngagementId) != null ? str42.equals(contact.lastEmailEngagementId) : contact.lastEmailEngagementId == null) && ((str43 = this.lastWhatsappTime) != null ? str43.equals(contact.lastWhatsappTime) : contact.lastWhatsappTime == null) && ((str44 = this.lastWhatsappUserId) != null ? str44.equals(contact.lastWhatsappUserId) : contact.lastWhatsappUserId == null) && ((str45 = this.lastWhatsappEngagementId) != null ? str45.equals(contact.lastWhatsappEngagementId) : contact.lastWhatsappEngagementId == null) && ((str46 = this.lastWabaBroadcastTime) != null ? str46.equals(contact.lastWabaBroadcastTime) : contact.lastWabaBroadcastTime == null) && ((str47 = this.lastWabaBroadcastStatus) != null ? str47.equals(contact.lastWabaBroadcastStatus) : contact.lastWabaBroadcastStatus == null) && ((str48 = this.lastWabaBroadcastTemplate) != null ? str48.equals(contact.lastWabaBroadcastTemplate) : contact.lastWabaBroadcastTemplate == null) && ((str49 = this.lastWabaBroadcastReplyBody) != null ? str49.equals(contact.lastWabaBroadcastReplyBody) : contact.lastWabaBroadcastReplyBody == null) && ((str50 = this.lastWabaBroadcastReplyTime) != null ? str50.equals(contact.lastWabaBroadcastReplyTime) : contact.lastWabaBroadcastReplyTime == null) && ((str51 = this.lastWabaBroadcastReplyType) != null ? str51.equals(contact.lastWabaBroadcastReplyType) : contact.lastWabaBroadcastReplyType == null) && ((str52 = this.lastSmsTime) != null ? str52.equals(contact.lastSmsTime) : contact.lastSmsTime == null) && ((str53 = this.lastSmsUserId) != null ? str53.equals(contact.lastSmsUserId) : contact.lastSmsUserId == null) && ((str54 = this.lastSmsEngagementId) != null ? str54.equals(contact.lastSmsEngagementId) : contact.lastSmsEngagementId == null) && ((str55 = this.lastNoteAddedTime) != null ? str55.equals(contact.lastNoteAddedTime) : contact.lastNoteAddedTime == null) && ((str56 = this.lastNoteUserId) != null ? str56.equals(contact.lastNoteUserId) : contact.lastNoteUserId == null) && ((str57 = this.lastNoteEngagementId) != null ? str57.equals(contact.lastNoteEngagementId) : contact.lastNoteEngagementId == null) && ((str58 = this.lastTaskDoneTime) != null ? str58.equals(contact.lastTaskDoneTime) : contact.lastTaskDoneTime == null) && ((str59 = this.lastTaskDoneUserId) != null ? str59.equals(contact.lastTaskDoneUserId) : contact.lastTaskDoneUserId == null) && ((str60 = this.lastTaskDoneEngagementId) != null ? str60.equals(contact.lastTaskDoneEngagementId) : contact.lastTaskDoneEngagementId == null) && ((num2 = this.openTaskCount) != null ? num2.equals(contact.openTaskCount) : contact.openTaskCount == null) && ((str61 = this.lastKnownDisposition) != null ? str61.equals(contact.lastKnownDisposition) : contact.lastKnownDisposition == null) && ((str62 = this.lastKnownDispositionTime) != null ? str62.equals(contact.lastKnownDispositionTime) : contact.lastKnownDispositionTime == null) && ((str63 = this.lastLeadAssignmentDateTime) != null ? str63.equals(contact.lastLeadAssignmentDateTime) : contact.lastLeadAssignmentDateTime == null) && ((str64 = this.lastEngagementFromAccount) != null ? str64.equals(contact.lastEngagementFromAccount) : contact.lastEngagementFromAccount == null) && ((str65 = this.lastEngagementFromContact) != null ? str65.equals(contact.lastEngagementFromContact) : contact.lastEngagementFromContact == null) && ((str66 = this.freshLeadTag) != null ? str66.equals(contact.freshLeadTag) : contact.freshLeadTag == null) && ((str67 = this.noWorkAfterAssignment) != null ? str67.equals(contact.noWorkAfterAssignment) : contact.noWorkAfterAssignment == null) && ((str68 = this.needFollowUpTag) != null ? str68.equals(contact.needFollowUpTag) : contact.needFollowUpTag == null) && ((str69 = this.needFollowUpTagUpdatedAt) != null ? str69.equals(contact.needFollowUpTagUpdatedAt) : contact.needFollowUpTagUpdatedAt == null) && ((str70 = this.activeDealStage) != null ? str70.equals(contact.activeDealStage) : contact.activeDealStage == null) && ((str71 = this.activeDealStageUpdatedAt) != null ? str71.equals(contact.activeDealStageUpdatedAt) : contact.activeDealStageUpdatedAt == null) && ((str72 = this.dealDescription) != null ? str72.equals(contact.dealDescription) : contact.dealDescription == null) && ((str73 = this.isCustomer) != null ? str73.equals(contact.isCustomer) : contact.isCustomer == null) && ((str74 = this.becameCustomerOn) != null ? str74.equals(contact.becameCustomerOn) : contact.becameCustomerOn == null) && ((num3 = this.unsuccessfulCallAttempts) != null ? num3.equals(contact.unsuccessfulCallAttempts) : contact.unsuccessfulCallAttempts == null) && ((num4 = this.leadCallsNotAnswered) != null ? num4.equals(contact.leadCallsNotAnswered) : contact.leadCallsNotAnswered == null) && ((list4 = this.userDefinedTags) != null ? list4.equals(contact.userDefinedTags) : contact.userDefinedTags == null) && ((list5 = this.productService) != null ? list5.equals(contact.productService) : contact.productService == null) && ((str75 = this.bulkUploadReference) != null ? str75.equals(contact.bulkUploadReference) : contact.bulkUploadReference == null) && ((str76 = this.assignmentMethod) != null ? str76.equals(contact.assignmentMethod) : contact.assignmentMethod == null) && ((str77 = this.whatsappOptInStatus) != null ? str77.equals(contact.whatsappOptInStatus) : contact.whatsappOptInStatus == null) && ((list6 = this.recentEngagements) != null ? list6.equals(contact.recentEngagements) : contact.recentEngagements == null) && ((str78 = this.recentEngagementsUpdatedAt) != null ? str78.equals(contact.recentEngagementsUpdatedAt) : contact.recentEngagementsUpdatedAt == null) && ((str79 = this.openTaskDetail) != null ? str79.equals(contact.openTaskDetail) : contact.openTaskDetail == null) && ((str80 = this.openVideoCallDetail) != null ? str80.equals(contact.openVideoCallDetail) : contact.openVideoCallDetail == null) && ((str81 = this.lastClosedTaskDetail) != null ? str81.equals(contact.lastClosedTaskDetail) : contact.lastClosedTaskDetail == null) && ((str82 = this.lastClosedTaskDetailUpdatedAt) != null ? str82.equals(contact.lastClosedTaskDetailUpdatedAt) : contact.lastClosedTaskDetailUpdatedAt == null) && ((str83 = this.latestRemark) != null ? str83.equals(contact.latestRemark) : contact.latestRemark == null) && ((str84 = this.customAttributes) != null ? str84.equals(contact.customAttributes) : contact.customAttributes == null) && ((str85 = this.paymentRequestDetail) != null ? str85.equals(contact.paymentRequestDetail) : contact.paymentRequestDetail == null) && ((str86 = this.lastPaymentStatus) != null ? str86.equals(contact.lastPaymentStatus) : contact.lastPaymentStatus == null) && ((str87 = this.customDataAddedFromAddContactForm) != null ? str87.equals(contact.customDataAddedFromAddContactForm) : contact.customDataAddedFromAddContactForm == null) && ((leadLifecycleStage = this.leadLifecycleStage) != null ? leadLifecycleStage.equals(contact.leadLifecycleStage) : contact.leadLifecycleStage == null) && ((leadLifecycleStageSubCategory = this.leadLifecycleStageSubCategory) != null ? leadLifecycleStageSubCategory.equals(contact.leadLifecycleStageSubCategory) : contact.leadLifecycleStageSubCategory == null) && ((str88 = this.manualClosedReason) != null ? str88.equals(contact.manualClosedReason) : contact.manualClosedReason == null) && ((str89 = this.lastDealStageType) != null ? str89.equals(contact.lastDealStageType) : contact.lastDealStageType == null) && ((num5 = this.prospectingAttempts) != null ? num5.equals(contact.prospectingAttempts) : contact.prospectingAttempts == null) && ((num6 = this.totalProspectingAttemptsAcrossRechurn) != null ? num6.equals(contact.totalProspectingAttemptsAcrossRechurn) : contact.totalProspectingAttemptsAcrossRechurn == null) && ((num7 = this.numberOfTimesRechurned) != null ? num7.equals(contact.numberOfTimesRechurned) : contact.numberOfTimesRechurned == null) && ((str90 = this.lastProspectingDoneOn) != null ? str90.equals(contact.lastProspectingDoneOn) : contact.lastProspectingDoneOn == null) && ((str91 = this.firstProspectingDoneOn) != null ? str91.equals(contact.firstProspectingDoneOn) : contact.firstProspectingDoneOn == null) && ((str92 = this.nextProspectingDueOn) != null ? str92.equals(contact.nextProspectingDueOn) : contact.nextProspectingDueOn == null) && ((str93 = this.nextProspectingSetBy) != null ? str93.equals(contact.nextProspectingSetBy) : contact.nextProspectingSetBy == null) && ((str94 = this.nextProspectingNote) != null ? str94.equals(contact.nextProspectingNote) : contact.nextProspectingNote == null) && ((str95 = this.movedToOpportunityOn) != null ? str95.equals(contact.movedToOpportunityOn) : contact.movedToOpportunityOn == null) && ((str96 = this.movedToClosedOn) != null ? str96.equals(contact.movedToClosedOn) : contact.movedToClosedOn == null) && ((str97 = this.createdAt) != null ? str97.equals(contact.createdAt) : contact.createdAt == null)) {
                String str98 = this.updatedAt;
                String str99 = contact.updatedAt;
                if (str98 == null) {
                    if (str99 == null) {
                        return true;
                    }
                } else if (str98.equals(str99)) {
                    return true;
                }
            }
            return false;
        }

        public String firstProspectingDoneOn() {
            return this.firstProspectingDoneOn;
        }

        public String freshLeadTag() {
            return this.freshLeadTag;
        }

        public String gender() {
            return this.gender;
        }

        public Boolean hasTask() {
            return this.hasTask;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.ownerId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                ContactAssignmentStatus contactAssignmentStatus = this.toBeAssigned;
                int iHashCode3 = (iHashCode2 ^ (contactAssignmentStatus == null ? 0 : contactAssignmentStatus.hashCode())) * 1000003;
                List<String> list = this.sharedOwners;
                int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str2 = this.primaryTeamId;
                int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                List<String> list2 = this.sharedTeams;
                int iHashCode6 = (iHashCode5 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str3 = this.accountPriority;
                int iHashCode7 = (iHashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.addedById;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.assignedToId;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.blockedForCallById;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.blockedForCallReason;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.blockedForCallUntil;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.callPriority;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.waChatChannelId;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.contactSource;
                int iHashCode15 = (iHashCode14 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.contactSourceDrillDownOne;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.contactSourceDrillDownTwo;
                int iHashCode17 = (iHashCode16 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.contactSourceDrillDownThree;
                int iHashCode18 = (iHashCode17 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.contactSourceDrillDownOneId;
                int iHashCode19 = (iHashCode18 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.contactSourceDrillDownTwoId;
                int iHashCode20 = (iHashCode19 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.contactSourceDrillDownThreeId;
                int iHashCode21 = (iHashCode20 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                ContactStatus contactStatus = this.contactStatus;
                int iHashCode22 = (iHashCode21 ^ (contactStatus == null ? 0 : contactStatus.hashCode())) * 1000003;
                String str18 = this.contactType;
                int iHashCode23 = (iHashCode22 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.department;
                int iHashCode24 = (iHashCode23 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.designation;
                int iHashCode25 = (iHashCode24 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.lastRepeatEnquiryDate;
                int iHashCode26 = (iHashCode25 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.lastRepeatEnquirySource;
                int iHashCode27 = (iHashCode26 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.gender;
                int iHashCode28 = (iHashCode27 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                Boolean bool = this.isDecisionMaker;
                int iHashCode29 = (iHashCode28 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.isPrivate;
                int iHashCode30 = (iHashCode29 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str24 = this.lockPeriod;
                int iHashCode31 = (iHashCode30 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.name;
                int iHashCode32 = (iHashCode31 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                List<Day> list3 = this.preferredContactDays;
                int iHashCode33 = (iHashCode32 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str26 = this.profilePhotoUrl;
                int iHashCode34 = (iHashCode33 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.referredBy;
                int iHashCode35 = (iHashCode34 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.salutation;
                int iHashCode36 = (iHashCode35 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                Seniority seniority = this.seniority;
                int iHashCode37 = (iHashCode36 ^ (seniority == null ? 0 : seniority.hashCode())) * 1000003;
                String str29 = this.updatedById;
                int iHashCode38 = (iHashCode37 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                Boolean bool3 = this.hasTask;
                int iHashCode39 = (iHashCode38 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                TaskActivityType taskActivityType = this.openTaskActivityType;
                int iHashCode40 = (iHashCode39 ^ (taskActivityType == null ? 0 : taskActivityType.hashCode())) * 1000003;
                String str30 = this.lastCalledTime;
                int iHashCode41 = (iHashCode40 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                CallDirection callDirection = this.lastCallDirection;
                int iHashCode42 = (iHashCode41 ^ (callDirection == null ? 0 : callDirection.hashCode())) * 1000003;
                String str31 = this.lastCallOutcome;
                int iHashCode43 = (iHashCode42 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.lastCallOutcomeNature;
                int iHashCode44 = (iHashCode43 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.lastCallUserId;
                int iHashCode45 = (iHashCode44 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                Integer num = this.lastCallDuration;
                int iHashCode46 = (iHashCode45 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str34 = this.lastCallEngagementId;
                int iHashCode47 = (iHashCode46 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.lastVisitTime;
                int iHashCode48 = (iHashCode47 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.lastVisitOutcome;
                int iHashCode49 = (iHashCode48 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.lastVisitOutcomeNature;
                int iHashCode50 = (iHashCode49 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                String str38 = this.lastVisitUserId;
                int iHashCode51 = (iHashCode50 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                String str39 = this.lastVisitEngagementId;
                int iHashCode52 = (iHashCode51 ^ (str39 == null ? 0 : str39.hashCode())) * 1000003;
                String str40 = this.lastEmailTime;
                int iHashCode53 = (iHashCode52 ^ (str40 == null ? 0 : str40.hashCode())) * 1000003;
                String str41 = this.lastEmailUserId;
                int iHashCode54 = (iHashCode53 ^ (str41 == null ? 0 : str41.hashCode())) * 1000003;
                String str42 = this.lastEmailEngagementId;
                int iHashCode55 = (iHashCode54 ^ (str42 == null ? 0 : str42.hashCode())) * 1000003;
                String str43 = this.lastWhatsappTime;
                int iHashCode56 = (iHashCode55 ^ (str43 == null ? 0 : str43.hashCode())) * 1000003;
                String str44 = this.lastWhatsappUserId;
                int iHashCode57 = (iHashCode56 ^ (str44 == null ? 0 : str44.hashCode())) * 1000003;
                String str45 = this.lastWhatsappEngagementId;
                int iHashCode58 = (iHashCode57 ^ (str45 == null ? 0 : str45.hashCode())) * 1000003;
                String str46 = this.lastWabaBroadcastTime;
                int iHashCode59 = (iHashCode58 ^ (str46 == null ? 0 : str46.hashCode())) * 1000003;
                String str47 = this.lastWabaBroadcastStatus;
                int iHashCode60 = (iHashCode59 ^ (str47 == null ? 0 : str47.hashCode())) * 1000003;
                String str48 = this.lastWabaBroadcastTemplate;
                int iHashCode61 = (iHashCode60 ^ (str48 == null ? 0 : str48.hashCode())) * 1000003;
                String str49 = this.lastWabaBroadcastReplyBody;
                int iHashCode62 = (iHashCode61 ^ (str49 == null ? 0 : str49.hashCode())) * 1000003;
                String str50 = this.lastWabaBroadcastReplyTime;
                int iHashCode63 = (iHashCode62 ^ (str50 == null ? 0 : str50.hashCode())) * 1000003;
                String str51 = this.lastWabaBroadcastReplyType;
                int iHashCode64 = (iHashCode63 ^ (str51 == null ? 0 : str51.hashCode())) * 1000003;
                String str52 = this.lastSmsTime;
                int iHashCode65 = (iHashCode64 ^ (str52 == null ? 0 : str52.hashCode())) * 1000003;
                String str53 = this.lastSmsUserId;
                int iHashCode66 = (iHashCode65 ^ (str53 == null ? 0 : str53.hashCode())) * 1000003;
                String str54 = this.lastSmsEngagementId;
                int iHashCode67 = (iHashCode66 ^ (str54 == null ? 0 : str54.hashCode())) * 1000003;
                String str55 = this.lastNoteAddedTime;
                int iHashCode68 = (iHashCode67 ^ (str55 == null ? 0 : str55.hashCode())) * 1000003;
                String str56 = this.lastNoteUserId;
                int iHashCode69 = (iHashCode68 ^ (str56 == null ? 0 : str56.hashCode())) * 1000003;
                String str57 = this.lastNoteEngagementId;
                int iHashCode70 = (iHashCode69 ^ (str57 == null ? 0 : str57.hashCode())) * 1000003;
                String str58 = this.lastTaskDoneTime;
                int iHashCode71 = (iHashCode70 ^ (str58 == null ? 0 : str58.hashCode())) * 1000003;
                String str59 = this.lastTaskDoneUserId;
                int iHashCode72 = (iHashCode71 ^ (str59 == null ? 0 : str59.hashCode())) * 1000003;
                String str60 = this.lastTaskDoneEngagementId;
                int iHashCode73 = (iHashCode72 ^ (str60 == null ? 0 : str60.hashCode())) * 1000003;
                Integer num2 = this.openTaskCount;
                int iHashCode74 = (iHashCode73 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str61 = this.lastKnownDisposition;
                int iHashCode75 = (iHashCode74 ^ (str61 == null ? 0 : str61.hashCode())) * 1000003;
                String str62 = this.lastKnownDispositionTime;
                int iHashCode76 = (iHashCode75 ^ (str62 == null ? 0 : str62.hashCode())) * 1000003;
                String str63 = this.lastLeadAssignmentDateTime;
                int iHashCode77 = (iHashCode76 ^ (str63 == null ? 0 : str63.hashCode())) * 1000003;
                String str64 = this.lastEngagementFromAccount;
                int iHashCode78 = (iHashCode77 ^ (str64 == null ? 0 : str64.hashCode())) * 1000003;
                String str65 = this.lastEngagementFromContact;
                int iHashCode79 = (iHashCode78 ^ (str65 == null ? 0 : str65.hashCode())) * 1000003;
                String str66 = this.freshLeadTag;
                int iHashCode80 = (iHashCode79 ^ (str66 == null ? 0 : str66.hashCode())) * 1000003;
                String str67 = this.noWorkAfterAssignment;
                int iHashCode81 = (iHashCode80 ^ (str67 == null ? 0 : str67.hashCode())) * 1000003;
                String str68 = this.needFollowUpTag;
                int iHashCode82 = (iHashCode81 ^ (str68 == null ? 0 : str68.hashCode())) * 1000003;
                String str69 = this.needFollowUpTagUpdatedAt;
                int iHashCode83 = (iHashCode82 ^ (str69 == null ? 0 : str69.hashCode())) * 1000003;
                String str70 = this.activeDealStage;
                int iHashCode84 = (iHashCode83 ^ (str70 == null ? 0 : str70.hashCode())) * 1000003;
                String str71 = this.activeDealStageUpdatedAt;
                int iHashCode85 = (iHashCode84 ^ (str71 == null ? 0 : str71.hashCode())) * 1000003;
                String str72 = this.dealDescription;
                int iHashCode86 = (iHashCode85 ^ (str72 == null ? 0 : str72.hashCode())) * 1000003;
                String str73 = this.isCustomer;
                int iHashCode87 = (iHashCode86 ^ (str73 == null ? 0 : str73.hashCode())) * 1000003;
                String str74 = this.becameCustomerOn;
                int iHashCode88 = (iHashCode87 ^ (str74 == null ? 0 : str74.hashCode())) * 1000003;
                Integer num3 = this.unsuccessfulCallAttempts;
                int iHashCode89 = (iHashCode88 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.leadCallsNotAnswered;
                int iHashCode90 = (iHashCode89 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                List<String> list4 = this.userDefinedTags;
                int iHashCode91 = (iHashCode90 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                List<String> list5 = this.productService;
                int iHashCode92 = (iHashCode91 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
                String str75 = this.bulkUploadReference;
                int iHashCode93 = (iHashCode92 ^ (str75 == null ? 0 : str75.hashCode())) * 1000003;
                String str76 = this.assignmentMethod;
                int iHashCode94 = (iHashCode93 ^ (str76 == null ? 0 : str76.hashCode())) * 1000003;
                String str77 = this.whatsappOptInStatus;
                int iHashCode95 = (iHashCode94 ^ (str77 == null ? 0 : str77.hashCode())) * 1000003;
                List<String> list6 = this.recentEngagements;
                int iHashCode96 = (iHashCode95 ^ (list6 == null ? 0 : list6.hashCode())) * 1000003;
                String str78 = this.recentEngagementsUpdatedAt;
                int iHashCode97 = (iHashCode96 ^ (str78 == null ? 0 : str78.hashCode())) * 1000003;
                String str79 = this.openTaskDetail;
                int iHashCode98 = (iHashCode97 ^ (str79 == null ? 0 : str79.hashCode())) * 1000003;
                String str80 = this.openVideoCallDetail;
                int iHashCode99 = (iHashCode98 ^ (str80 == null ? 0 : str80.hashCode())) * 1000003;
                String str81 = this.lastClosedTaskDetail;
                int iHashCode100 = (iHashCode99 ^ (str81 == null ? 0 : str81.hashCode())) * 1000003;
                String str82 = this.lastClosedTaskDetailUpdatedAt;
                int iHashCode101 = (iHashCode100 ^ (str82 == null ? 0 : str82.hashCode())) * 1000003;
                String str83 = this.latestRemark;
                int iHashCode102 = (iHashCode101 ^ (str83 == null ? 0 : str83.hashCode())) * 1000003;
                String str84 = this.customAttributes;
                int iHashCode103 = (iHashCode102 ^ (str84 == null ? 0 : str84.hashCode())) * 1000003;
                String str85 = this.paymentRequestDetail;
                int iHashCode104 = (iHashCode103 ^ (str85 == null ? 0 : str85.hashCode())) * 1000003;
                String str86 = this.lastPaymentStatus;
                int iHashCode105 = (iHashCode104 ^ (str86 == null ? 0 : str86.hashCode())) * 1000003;
                String str87 = this.customDataAddedFromAddContactForm;
                int iHashCode106 = (iHashCode105 ^ (str87 == null ? 0 : str87.hashCode())) * 1000003;
                LeadLifecycleStage leadLifecycleStage = this.leadLifecycleStage;
                int iHashCode107 = (iHashCode106 ^ (leadLifecycleStage == null ? 0 : leadLifecycleStage.hashCode())) * 1000003;
                LeadLifecycleStageSubCategory leadLifecycleStageSubCategory = this.leadLifecycleStageSubCategory;
                int iHashCode108 = (iHashCode107 ^ (leadLifecycleStageSubCategory == null ? 0 : leadLifecycleStageSubCategory.hashCode())) * 1000003;
                String str88 = this.manualClosedReason;
                int iHashCode109 = (iHashCode108 ^ (str88 == null ? 0 : str88.hashCode())) * 1000003;
                String str89 = this.lastDealStageType;
                int iHashCode110 = (iHashCode109 ^ (str89 == null ? 0 : str89.hashCode())) * 1000003;
                Integer num5 = this.prospectingAttempts;
                int iHashCode111 = (iHashCode110 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.totalProspectingAttemptsAcrossRechurn;
                int iHashCode112 = (iHashCode111 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.numberOfTimesRechurned;
                int iHashCode113 = (iHashCode112 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                String str90 = this.lastProspectingDoneOn;
                int iHashCode114 = (iHashCode113 ^ (str90 == null ? 0 : str90.hashCode())) * 1000003;
                String str91 = this.firstProspectingDoneOn;
                int iHashCode115 = (iHashCode114 ^ (str91 == null ? 0 : str91.hashCode())) * 1000003;
                String str92 = this.nextProspectingDueOn;
                int iHashCode116 = (iHashCode115 ^ (str92 == null ? 0 : str92.hashCode())) * 1000003;
                String str93 = this.nextProspectingSetBy;
                int iHashCode117 = (iHashCode116 ^ (str93 == null ? 0 : str93.hashCode())) * 1000003;
                String str94 = this.nextProspectingNote;
                int iHashCode118 = (iHashCode117 ^ (str94 == null ? 0 : str94.hashCode())) * 1000003;
                String str95 = this.movedToOpportunityOn;
                int iHashCode119 = (iHashCode118 ^ (str95 == null ? 0 : str95.hashCode())) * 1000003;
                String str96 = this.movedToClosedOn;
                int iHashCode120 = (iHashCode119 ^ (str96 == null ? 0 : str96.hashCode())) * 1000003;
                String str97 = this.createdAt;
                int iHashCode121 = (iHashCode120 ^ (str97 == null ? 0 : str97.hashCode())) * 1000003;
                String str98 = this.updatedAt;
                this.$hashCode = iHashCode121 ^ (str98 != null ? str98.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String isCustomer() {
            return this.isCustomer;
        }

        public Boolean isDecisionMaker() {
            return this.isDecisionMaker;
        }

        public Boolean isPrivate() {
            return this.isPrivate;
        }

        public CallDirection lastCallDirection() {
            return this.lastCallDirection;
        }

        public Integer lastCallDuration() {
            return this.lastCallDuration;
        }

        public String lastCallEngagementId() {
            return this.lastCallEngagementId;
        }

        public String lastCallOutcome() {
            return this.lastCallOutcome;
        }

        public String lastCallOutcomeNature() {
            return this.lastCallOutcomeNature;
        }

        public String lastCallUserId() {
            return this.lastCallUserId;
        }

        public String lastCalledTime() {
            return this.lastCalledTime;
        }

        public String lastClosedTaskDetail() {
            return this.lastClosedTaskDetail;
        }

        public String lastClosedTaskDetailUpdatedAt() {
            return this.lastClosedTaskDetailUpdatedAt;
        }

        public String lastDealStageType() {
            return this.lastDealStageType;
        }

        public String lastEmailEngagementId() {
            return this.lastEmailEngagementId;
        }

        public String lastEmailTime() {
            return this.lastEmailTime;
        }

        public String lastEmailUserId() {
            return this.lastEmailUserId;
        }

        public String lastEngagementFromAccount() {
            return this.lastEngagementFromAccount;
        }

        public String lastEngagementFromContact() {
            return this.lastEngagementFromContact;
        }

        public String lastKnownDisposition() {
            return this.lastKnownDisposition;
        }

        public String lastKnownDispositionTime() {
            return this.lastKnownDispositionTime;
        }

        public String lastLeadAssignmentDateTime() {
            return this.lastLeadAssignmentDateTime;
        }

        public String lastNoteAddedTime() {
            return this.lastNoteAddedTime;
        }

        public String lastNoteEngagementId() {
            return this.lastNoteEngagementId;
        }

        public String lastNoteUserId() {
            return this.lastNoteUserId;
        }

        public String lastPaymentStatus() {
            return this.lastPaymentStatus;
        }

        public String lastProspectingDoneOn() {
            return this.lastProspectingDoneOn;
        }

        public String lastRepeatEnquiryDate() {
            return this.lastRepeatEnquiryDate;
        }

        public String lastRepeatEnquirySource() {
            return this.lastRepeatEnquirySource;
        }

        public String lastSmsEngagementId() {
            return this.lastSmsEngagementId;
        }

        public String lastSmsTime() {
            return this.lastSmsTime;
        }

        public String lastSmsUserId() {
            return this.lastSmsUserId;
        }

        public String lastTaskDoneEngagementId() {
            return this.lastTaskDoneEngagementId;
        }

        public String lastTaskDoneTime() {
            return this.lastTaskDoneTime;
        }

        public String lastTaskDoneUserId() {
            return this.lastTaskDoneUserId;
        }

        public String lastVisitEngagementId() {
            return this.lastVisitEngagementId;
        }

        public String lastVisitOutcome() {
            return this.lastVisitOutcome;
        }

        public String lastVisitOutcomeNature() {
            return this.lastVisitOutcomeNature;
        }

        public String lastVisitTime() {
            return this.lastVisitTime;
        }

        public String lastVisitUserId() {
            return this.lastVisitUserId;
        }

        public String lastWabaBroadcastReplyBody() {
            return this.lastWabaBroadcastReplyBody;
        }

        public String lastWabaBroadcastReplyTime() {
            return this.lastWabaBroadcastReplyTime;
        }

        public String lastWabaBroadcastReplyType() {
            return this.lastWabaBroadcastReplyType;
        }

        public String lastWabaBroadcastStatus() {
            return this.lastWabaBroadcastStatus;
        }

        public String lastWabaBroadcastTemplate() {
            return this.lastWabaBroadcastTemplate;
        }

        public String lastWabaBroadcastTime() {
            return this.lastWabaBroadcastTime;
        }

        public String lastWhatsappEngagementId() {
            return this.lastWhatsappEngagementId;
        }

        public String lastWhatsappTime() {
            return this.lastWhatsappTime;
        }

        public String lastWhatsappUserId() {
            return this.lastWhatsappUserId;
        }

        public String latestRemark() {
            return this.latestRemark;
        }

        public Integer leadCallsNotAnswered() {
            return this.leadCallsNotAnswered;
        }

        public LeadLifecycleStage leadLifecycleStage() {
            return this.leadLifecycleStage;
        }

        public LeadLifecycleStageSubCategory leadLifecycleStageSubCategory() {
            return this.leadLifecycleStageSubCategory;
        }

        public String lockPeriod() {
            return this.lockPeriod;
        }

        public String manualClosedReason() {
            return this.manualClosedReason;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Contact.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Contact.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Contact.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Contact.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Contact.this.ownerId);
                    ResponseField responseField = responseFieldArr[4];
                    ContactAssignmentStatus contactAssignmentStatus = Contact.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeList(responseFieldArr[5], Contact.this.sharedOwners, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Contact.this.primaryTeamId);
                    responseWriter.writeList(responseFieldArr[7], Contact.this.sharedTeams, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[8], Contact.this.accountPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Contact.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Contact.this.assignedToId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Contact.this.blockedForCallById);
                    responseWriter.writeString(responseFieldArr[12], Contact.this.blockedForCallReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Contact.this.blockedForCallUntil);
                    responseWriter.writeString(responseFieldArr[14], Contact.this.callPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Contact.this.waChatChannelId);
                    responseWriter.writeString(responseFieldArr[16], Contact.this.contactSource);
                    responseWriter.writeString(responseFieldArr[17], Contact.this.contactSourceDrillDownOne);
                    responseWriter.writeString(responseFieldArr[18], Contact.this.contactSourceDrillDownTwo);
                    responseWriter.writeString(responseFieldArr[19], Contact.this.contactSourceDrillDownThree);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Contact.this.contactSourceDrillDownOneId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Contact.this.contactSourceDrillDownTwoId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Contact.this.contactSourceDrillDownThreeId);
                    ResponseField responseField2 = responseFieldArr[23];
                    ContactStatus contactStatus = Contact.this.contactStatus;
                    responseWriter.writeString(responseField2, contactStatus != null ? contactStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[24], Contact.this.contactType);
                    responseWriter.writeString(responseFieldArr[25], Contact.this.department);
                    responseWriter.writeString(responseFieldArr[26], Contact.this.designation);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], Contact.this.lastRepeatEnquiryDate);
                    responseWriter.writeString(responseFieldArr[28], Contact.this.lastRepeatEnquirySource);
                    responseWriter.writeString(responseFieldArr[29], Contact.this.gender);
                    responseWriter.writeBoolean(responseFieldArr[30], Contact.this.isDecisionMaker);
                    responseWriter.writeBoolean(responseFieldArr[31], Contact.this.isPrivate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Contact.this.lockPeriod);
                    responseWriter.writeString(responseFieldArr[33], Contact.this.name);
                    responseWriter.writeList(responseFieldArr[34], Contact.this.preferredContactDays, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((Day) obj).name());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[35], Contact.this.profilePhotoUrl);
                    responseWriter.writeString(responseFieldArr[36], Contact.this.referredBy);
                    responseWriter.writeString(responseFieldArr[37], Contact.this.salutation);
                    ResponseField responseField3 = responseFieldArr[38];
                    Seniority seniority = Contact.this.seniority;
                    responseWriter.writeString(responseField3, seniority != null ? seniority.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], Contact.this.updatedById);
                    responseWriter.writeBoolean(responseFieldArr[40], Contact.this.hasTask);
                    ResponseField responseField4 = responseFieldArr[41];
                    TaskActivityType taskActivityType = Contact.this.openTaskActivityType;
                    responseWriter.writeString(responseField4, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], Contact.this.lastCalledTime);
                    ResponseField responseField5 = responseFieldArr[43];
                    CallDirection callDirection = Contact.this.lastCallDirection;
                    responseWriter.writeString(responseField5, callDirection != null ? callDirection.name() : null);
                    responseWriter.writeString(responseFieldArr[44], Contact.this.lastCallOutcome);
                    responseWriter.writeString(responseFieldArr[45], Contact.this.lastCallOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[46], Contact.this.lastCallUserId);
                    responseWriter.writeInt(responseFieldArr[47], Contact.this.lastCallDuration);
                    responseWriter.writeString(responseFieldArr[48], Contact.this.lastCallEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[49], Contact.this.lastVisitTime);
                    responseWriter.writeString(responseFieldArr[50], Contact.this.lastVisitOutcome);
                    responseWriter.writeString(responseFieldArr[51], Contact.this.lastVisitOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], Contact.this.lastVisitUserId);
                    responseWriter.writeString(responseFieldArr[53], Contact.this.lastVisitEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], Contact.this.lastEmailTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], Contact.this.lastEmailUserId);
                    responseWriter.writeString(responseFieldArr[56], Contact.this.lastEmailEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[57], Contact.this.lastWhatsappTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], Contact.this.lastWhatsappUserId);
                    responseWriter.writeString(responseFieldArr[59], Contact.this.lastWhatsappEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[60], Contact.this.lastWabaBroadcastTime);
                    responseWriter.writeString(responseFieldArr[61], Contact.this.lastWabaBroadcastStatus);
                    responseWriter.writeString(responseFieldArr[62], Contact.this.lastWabaBroadcastTemplate);
                    responseWriter.writeString(responseFieldArr[63], Contact.this.lastWabaBroadcastReplyBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[64], Contact.this.lastWabaBroadcastReplyTime);
                    responseWriter.writeString(responseFieldArr[65], Contact.this.lastWabaBroadcastReplyType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[66], Contact.this.lastSmsTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[67], Contact.this.lastSmsUserId);
                    responseWriter.writeString(responseFieldArr[68], Contact.this.lastSmsEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[69], Contact.this.lastNoteAddedTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[70], Contact.this.lastNoteUserId);
                    responseWriter.writeString(responseFieldArr[71], Contact.this.lastNoteEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], Contact.this.lastTaskDoneTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], Contact.this.lastTaskDoneUserId);
                    responseWriter.writeString(responseFieldArr[74], Contact.this.lastTaskDoneEngagementId);
                    responseWriter.writeInt(responseFieldArr[75], Contact.this.openTaskCount);
                    responseWriter.writeString(responseFieldArr[76], Contact.this.lastKnownDisposition);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[77], Contact.this.lastKnownDispositionTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[78], Contact.this.lastLeadAssignmentDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[79], Contact.this.lastEngagementFromAccount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[80], Contact.this.lastEngagementFromContact);
                    responseWriter.writeString(responseFieldArr[81], Contact.this.freshLeadTag);
                    responseWriter.writeString(responseFieldArr[82], Contact.this.noWorkAfterAssignment);
                    responseWriter.writeString(responseFieldArr[83], Contact.this.needFollowUpTag);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[84], Contact.this.needFollowUpTagUpdatedAt);
                    responseWriter.writeString(responseFieldArr[85], Contact.this.activeDealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[86], Contact.this.activeDealStageUpdatedAt);
                    responseWriter.writeString(responseFieldArr[87], Contact.this.dealDescription);
                    responseWriter.writeString(responseFieldArr[88], Contact.this.isCustomer);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[89], Contact.this.becameCustomerOn);
                    responseWriter.writeInt(responseFieldArr[90], Contact.this.unsuccessfulCallAttempts);
                    responseWriter.writeInt(responseFieldArr[91], Contact.this.leadCallsNotAnswered);
                    responseWriter.writeList(responseFieldArr[92], Contact.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[93], Contact.this.productService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[94], Contact.this.bulkUploadReference);
                    responseWriter.writeString(responseFieldArr[95], Contact.this.assignmentMethod);
                    responseWriter.writeString(responseFieldArr[96], Contact.this.whatsappOptInStatus);
                    responseWriter.writeList(responseFieldArr[97], Contact.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Contact.1.6
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[98], Contact.this.recentEngagementsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[99], Contact.this.openTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[100], Contact.this.openVideoCallDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[101], Contact.this.lastClosedTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[102], Contact.this.lastClosedTaskDetailUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[103], Contact.this.latestRemark);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[104], Contact.this.customAttributes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[105], Contact.this.paymentRequestDetail);
                    responseWriter.writeString(responseFieldArr[106], Contact.this.lastPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[107], Contact.this.customDataAddedFromAddContactForm);
                    ResponseField responseField6 = responseFieldArr[108];
                    LeadLifecycleStage leadLifecycleStage = Contact.this.leadLifecycleStage;
                    responseWriter.writeString(responseField6, leadLifecycleStage != null ? leadLifecycleStage.name() : null);
                    ResponseField responseField7 = responseFieldArr[109];
                    LeadLifecycleStageSubCategory leadLifecycleStageSubCategory = Contact.this.leadLifecycleStageSubCategory;
                    responseWriter.writeString(responseField7, leadLifecycleStageSubCategory != null ? leadLifecycleStageSubCategory.name() : null);
                    responseWriter.writeString(responseFieldArr[110], Contact.this.manualClosedReason);
                    responseWriter.writeString(responseFieldArr[111], Contact.this.lastDealStageType);
                    responseWriter.writeInt(responseFieldArr[112], Contact.this.prospectingAttempts);
                    responseWriter.writeInt(responseFieldArr[113], Contact.this.totalProspectingAttemptsAcrossRechurn);
                    responseWriter.writeInt(responseFieldArr[114], Contact.this.numberOfTimesRechurned);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[115], Contact.this.lastProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[116], Contact.this.firstProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[117], Contact.this.nextProspectingDueOn);
                    responseWriter.writeString(responseFieldArr[118], Contact.this.nextProspectingSetBy);
                    responseWriter.writeString(responseFieldArr[119], Contact.this.nextProspectingNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[120], Contact.this.movedToOpportunityOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[121], Contact.this.movedToClosedOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[122], Contact.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[123], Contact.this.updatedAt);
                }
            };
        }

        public String movedToClosedOn() {
            return this.movedToClosedOn;
        }

        public String movedToOpportunityOn() {
            return this.movedToOpportunityOn;
        }

        public String name() {
            return this.name;
        }

        public String needFollowUpTag() {
            return this.needFollowUpTag;
        }

        public String needFollowUpTagUpdatedAt() {
            return this.needFollowUpTagUpdatedAt;
        }

        public String nextProspectingDueOn() {
            return this.nextProspectingDueOn;
        }

        public String nextProspectingNote() {
            return this.nextProspectingNote;
        }

        public String nextProspectingSetBy() {
            return this.nextProspectingSetBy;
        }

        public String noWorkAfterAssignment() {
            return this.noWorkAfterAssignment;
        }

        public Integer numberOfTimesRechurned() {
            return this.numberOfTimesRechurned;
        }

        public TaskActivityType openTaskActivityType() {
            return this.openTaskActivityType;
        }

        public Integer openTaskCount() {
            return this.openTaskCount;
        }

        public String openTaskDetail() {
            return this.openTaskDetail;
        }

        public String openVideoCallDetail() {
            return this.openVideoCallDetail;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String paymentRequestDetail() {
            return this.paymentRequestDetail;
        }

        public List<Day> preferredContactDays() {
            return this.preferredContactDays;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public List<String> productService() {
            return this.productService;
        }

        public String profilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public Integer prospectingAttempts() {
            return this.prospectingAttempts;
        }

        public List<String> recentEngagements() {
            return this.recentEngagements;
        }

        public String recentEngagementsUpdatedAt() {
            return this.recentEngagementsUpdatedAt;
        }

        public String referredBy() {
            return this.referredBy;
        }

        public String salutation() {
            return this.salutation;
        }

        public Seniority seniority() {
            return this.seniority;
        }

        public List<String> sharedOwners() {
            return this.sharedOwners;
        }

        public List<String> sharedTeams() {
            return this.sharedTeams;
        }

        public ContactAssignmentStatus toBeAssigned() {
            return this.toBeAssigned;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Contact{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", toBeAssigned=" + this.toBeAssigned + ", sharedOwners=" + this.sharedOwners + ", primaryTeamId=" + this.primaryTeamId + ", sharedTeams=" + this.sharedTeams + ", accountPriority=" + this.accountPriority + ", addedById=" + this.addedById + ", assignedToId=" + this.assignedToId + ", blockedForCallById=" + this.blockedForCallById + ", blockedForCallReason=" + this.blockedForCallReason + ", blockedForCallUntil=" + this.blockedForCallUntil + ", callPriority=" + this.callPriority + ", waChatChannelId=" + this.waChatChannelId + ", contactSource=" + this.contactSource + ", contactSourceDrillDownOne=" + this.contactSourceDrillDownOne + ", contactSourceDrillDownTwo=" + this.contactSourceDrillDownTwo + ", contactSourceDrillDownThree=" + this.contactSourceDrillDownThree + ", contactSourceDrillDownOneId=" + this.contactSourceDrillDownOneId + ", contactSourceDrillDownTwoId=" + this.contactSourceDrillDownTwoId + ", contactSourceDrillDownThreeId=" + this.contactSourceDrillDownThreeId + ", contactStatus=" + this.contactStatus + ", contactType=" + this.contactType + ", department=" + this.department + ", designation=" + this.designation + ", lastRepeatEnquiryDate=" + this.lastRepeatEnquiryDate + ", lastRepeatEnquirySource=" + this.lastRepeatEnquirySource + ", gender=" + this.gender + ", isDecisionMaker=" + this.isDecisionMaker + ", isPrivate=" + this.isPrivate + ", lockPeriod=" + this.lockPeriod + ", name=" + this.name + ", preferredContactDays=" + this.preferredContactDays + ", profilePhotoUrl=" + this.profilePhotoUrl + ", referredBy=" + this.referredBy + ", salutation=" + this.salutation + ", seniority=" + this.seniority + ", updatedById=" + this.updatedById + ", hasTask=" + this.hasTask + ", openTaskActivityType=" + this.openTaskActivityType + ", lastCalledTime=" + this.lastCalledTime + ", lastCallDirection=" + this.lastCallDirection + ", lastCallOutcome=" + this.lastCallOutcome + ", lastCallOutcomeNature=" + this.lastCallOutcomeNature + ", lastCallUserId=" + this.lastCallUserId + ", lastCallDuration=" + this.lastCallDuration + ", lastCallEngagementId=" + this.lastCallEngagementId + ", lastVisitTime=" + this.lastVisitTime + ", lastVisitOutcome=" + this.lastVisitOutcome + ", lastVisitOutcomeNature=" + this.lastVisitOutcomeNature + ", lastVisitUserId=" + this.lastVisitUserId + ", lastVisitEngagementId=" + this.lastVisitEngagementId + ", lastEmailTime=" + this.lastEmailTime + ", lastEmailUserId=" + this.lastEmailUserId + ", lastEmailEngagementId=" + this.lastEmailEngagementId + ", lastWhatsappTime=" + this.lastWhatsappTime + ", lastWhatsappUserId=" + this.lastWhatsappUserId + ", lastWhatsappEngagementId=" + this.lastWhatsappEngagementId + ", lastWabaBroadcastTime=" + this.lastWabaBroadcastTime + ", lastWabaBroadcastStatus=" + this.lastWabaBroadcastStatus + ", lastWabaBroadcastTemplate=" + this.lastWabaBroadcastTemplate + ", lastWabaBroadcastReplyBody=" + this.lastWabaBroadcastReplyBody + ", lastWabaBroadcastReplyTime=" + this.lastWabaBroadcastReplyTime + ", lastWabaBroadcastReplyType=" + this.lastWabaBroadcastReplyType + ", lastSmsTime=" + this.lastSmsTime + ", lastSmsUserId=" + this.lastSmsUserId + ", lastSmsEngagementId=" + this.lastSmsEngagementId + ", lastNoteAddedTime=" + this.lastNoteAddedTime + ", lastNoteUserId=" + this.lastNoteUserId + ", lastNoteEngagementId=" + this.lastNoteEngagementId + ", lastTaskDoneTime=" + this.lastTaskDoneTime + ", lastTaskDoneUserId=" + this.lastTaskDoneUserId + ", lastTaskDoneEngagementId=" + this.lastTaskDoneEngagementId + ", openTaskCount=" + this.openTaskCount + ", lastKnownDisposition=" + this.lastKnownDisposition + ", lastKnownDispositionTime=" + this.lastKnownDispositionTime + ", lastLeadAssignmentDateTime=" + this.lastLeadAssignmentDateTime + ", lastEngagementFromAccount=" + this.lastEngagementFromAccount + ", lastEngagementFromContact=" + this.lastEngagementFromContact + ", freshLeadTag=" + this.freshLeadTag + ", noWorkAfterAssignment=" + this.noWorkAfterAssignment + ", needFollowUpTag=" + this.needFollowUpTag + ", needFollowUpTagUpdatedAt=" + this.needFollowUpTagUpdatedAt + ", activeDealStage=" + this.activeDealStage + ", activeDealStageUpdatedAt=" + this.activeDealStageUpdatedAt + ", dealDescription=" + this.dealDescription + ", isCustomer=" + this.isCustomer + ", becameCustomerOn=" + this.becameCustomerOn + ", unsuccessfulCallAttempts=" + this.unsuccessfulCallAttempts + ", leadCallsNotAnswered=" + this.leadCallsNotAnswered + ", userDefinedTags=" + this.userDefinedTags + ", productService=" + this.productService + ", bulkUploadReference=" + this.bulkUploadReference + ", assignmentMethod=" + this.assignmentMethod + ", whatsappOptInStatus=" + this.whatsappOptInStatus + ", recentEngagements=" + this.recentEngagements + ", recentEngagementsUpdatedAt=" + this.recentEngagementsUpdatedAt + ", openTaskDetail=" + this.openTaskDetail + ", openVideoCallDetail=" + this.openVideoCallDetail + ", lastClosedTaskDetail=" + this.lastClosedTaskDetail + ", lastClosedTaskDetailUpdatedAt=" + this.lastClosedTaskDetailUpdatedAt + ", latestRemark=" + this.latestRemark + ", customAttributes=" + this.customAttributes + ", paymentRequestDetail=" + this.paymentRequestDetail + ", lastPaymentStatus=" + this.lastPaymentStatus + ", customDataAddedFromAddContactForm=" + this.customDataAddedFromAddContactForm + ", leadLifecycleStage=" + this.leadLifecycleStage + ", leadLifecycleStageSubCategory=" + this.leadLifecycleStageSubCategory + ", manualClosedReason=" + this.manualClosedReason + ", lastDealStageType=" + this.lastDealStageType + ", prospectingAttempts=" + this.prospectingAttempts + ", totalProspectingAttemptsAcrossRechurn=" + this.totalProspectingAttemptsAcrossRechurn + ", numberOfTimesRechurned=" + this.numberOfTimesRechurned + ", lastProspectingDoneOn=" + this.lastProspectingDoneOn + ", firstProspectingDoneOn=" + this.firstProspectingDoneOn + ", nextProspectingDueOn=" + this.nextProspectingDueOn + ", nextProspectingSetBy=" + this.nextProspectingSetBy + ", nextProspectingNote=" + this.nextProspectingNote + ", movedToOpportunityOn=" + this.movedToOpportunityOn + ", movedToClosedOn=" + this.movedToClosedOn + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public Integer totalProspectingAttemptsAcrossRechurn() {
            return this.totalProspectingAttemptsAcrossRechurn;
        }

        public Integer unsuccessfulCallAttempts() {
            return this.unsuccessfulCallAttempts;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public List<String> userDefinedTags() {
            return this.userDefinedTags;
        }

        public String waChatChannelId() {
            return this.waChatChannelId;
        }

        public String whatsappOptInStatus() {
            return this.whatsappOptInStatus;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateFileObjectRelationship", "updateFileObjectRelationship", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateFileObjectRelationship updateFileObjectRelationship;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateFileObjectRelationship.Mapper updateFileObjectRelationshipFieldMapper = new UpdateFileObjectRelationship.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateFileObjectRelationship) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateFileObjectRelationship>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateFileObjectRelationship read(ResponseReader responseReader2) {
                        return Mapper.this.updateFileObjectRelationshipFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateFileObjectRelationship updateFileObjectRelationship) {
            this.updateFileObjectRelationship = updateFileObjectRelationship;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateFileObjectRelationship updateFileObjectRelationship = this.updateFileObjectRelationship;
            UpdateFileObjectRelationship updateFileObjectRelationship2 = ((Data) obj).updateFileObjectRelationship;
            return updateFileObjectRelationship == null ? updateFileObjectRelationship2 == null : updateFileObjectRelationship.equals(updateFileObjectRelationship2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateFileObjectRelationship updateFileObjectRelationship = this.updateFileObjectRelationship;
                this.$hashCode = (updateFileObjectRelationship == null ? 0 : updateFileObjectRelationship.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateFileObjectRelationship updateFileObjectRelationship = Data.this.updateFileObjectRelationship;
                    responseWriter.writeObject(responseField, updateFileObjectRelationship != null ? updateFileObjectRelationship.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateFileObjectRelationship=" + this.updateFileObjectRelationship + "}";
            }
            return this.$toString;
        }

        public UpdateFileObjectRelationship updateFileObjectRelationship() {
            return this.updateFileObjectRelationship;
        }
    }

    public static class Deal {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Double amount;
        final String createdAt;
        final String createdByUser;
        final String currency;
        final String customDealData;
        final String dealLostReason;
        final DealOutcome dealOutcome;
        final String dealStage;
        final String dealStageUpdatedAt;
        final DealState dealState;
        final String description;
        final String id;
        final String lastActivity;
        final String lastUpdatedByUser;
        final String name;
        final String openTaskDetail;
        final String ownerId;
        final String primaryTeamId;
        final List<String> recentEngagements;
        final String recentEngagementsUpdatedAt;
        final List<String> tags;
        final List<String> transitionSummary;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Deal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Deal map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Deal.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                DealState dealStateValueOf = string5 != null ? DealState.valueOf(string5) : null;
                String string6 = responseReader.readString(responseFieldArr[8]);
                return new Deal(string, str, str2, string2, string3, string4, str3, dealStateValueOf, string6 != null ? DealOutcome.valueOf(string6) : null, responseReader.readString(responseFieldArr[9]), responseReader.readDouble(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readList(responseFieldArr[17], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Deal.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Deal.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readString(responseFieldArr[20]), responseReader.readList(responseFieldArr[21], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Deal.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("dealStage", "dealStage", null, true, Collections.emptyList()), ResponseField.forCustomType("dealStageUpdatedAt", "dealStageUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealState", "dealState", null, true, Collections.emptyList()), ResponseField.forString("dealOutcome", "dealOutcome", null, true, Collections.emptyList()), ResponseField.forString("dealLostReason", "dealLostReason", null, true, Collections.emptyList()), ResponseField.forDouble("amount", "amount", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forCustomType("createdByUser", "createdByUser", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastUpdatedByUser", "lastUpdatedByUser", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("openTaskDetail", "openTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forList("transitionSummary", "transitionSummary", null, true, Collections.emptyList()), ResponseField.forList("recentEngagements", "recentEngagements", null, true, Collections.emptyList()), ResponseField.forCustomType("recentEngagementsUpdatedAt", "recentEngagementsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastActivity", "lastActivity", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forCustomType("customDealData", "customDealData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Deal(String str, String str2, String str3, String str4, String str5, String str6, String str7, DealState dealState, DealOutcome dealOutcome, String str8, Double d, String str9, String str10, String str11, String str12, String str13, String str14, List<String> list, List<String> list2, String str15, String str16, List<String> list3, String str17, String str18, String str19) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.dealStage = str6;
            this.dealStageUpdatedAt = str7;
            this.dealState = dealState;
            this.dealOutcome = dealOutcome;
            this.dealLostReason = str8;
            this.amount = d;
            this.currency = str9;
            this.createdByUser = str10;
            this.lastUpdatedByUser = str11;
            this.ownerId = str12;
            this.primaryTeamId = str13;
            this.openTaskDetail = str14;
            this.transitionSummary = list;
            this.recentEngagements = list2;
            this.recentEngagementsUpdatedAt = str15;
            this.lastActivity = str16;
            this.tags = list3;
            this.customDealData = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Double amount() {
            return this.amount;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdByUser() {
            return this.createdByUser;
        }

        public String currency() {
            return this.currency;
        }

        public String customDealData() {
            return this.customDealData;
        }

        public String dealLostReason() {
            return this.dealLostReason;
        }

        public DealOutcome dealOutcome() {
            return this.dealOutcome;
        }

        public String dealStage() {
            return this.dealStage;
        }

        public String dealStageUpdatedAt() {
            return this.dealStageUpdatedAt;
        }

        public DealState dealState() {
            return this.dealState;
        }

        public String description() {
            return this.description;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            DealState dealState;
            DealOutcome dealOutcome;
            String str5;
            Double d;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            List<String> list;
            List<String> list2;
            String str12;
            String str13;
            List<String> list3;
            String str14;
            String str15;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Deal)) {
                return false;
            }
            Deal deal = (Deal) obj;
            if (this.__typename.equals(deal.__typename) && this.id.equals(deal.id) && this.accountId.equals(deal.accountId) && ((str = this.name) != null ? str.equals(deal.name) : deal.name == null) && ((str2 = this.description) != null ? str2.equals(deal.description) : deal.description == null) && ((str3 = this.dealStage) != null ? str3.equals(deal.dealStage) : deal.dealStage == null) && ((str4 = this.dealStageUpdatedAt) != null ? str4.equals(deal.dealStageUpdatedAt) : deal.dealStageUpdatedAt == null) && ((dealState = this.dealState) != null ? dealState.equals(deal.dealState) : deal.dealState == null) && ((dealOutcome = this.dealOutcome) != null ? dealOutcome.equals(deal.dealOutcome) : deal.dealOutcome == null) && ((str5 = this.dealLostReason) != null ? str5.equals(deal.dealLostReason) : deal.dealLostReason == null) && ((d = this.amount) != null ? d.equals(deal.amount) : deal.amount == null) && ((str6 = this.currency) != null ? str6.equals(deal.currency) : deal.currency == null) && ((str7 = this.createdByUser) != null ? str7.equals(deal.createdByUser) : deal.createdByUser == null) && ((str8 = this.lastUpdatedByUser) != null ? str8.equals(deal.lastUpdatedByUser) : deal.lastUpdatedByUser == null) && ((str9 = this.ownerId) != null ? str9.equals(deal.ownerId) : deal.ownerId == null) && ((str10 = this.primaryTeamId) != null ? str10.equals(deal.primaryTeamId) : deal.primaryTeamId == null) && ((str11 = this.openTaskDetail) != null ? str11.equals(deal.openTaskDetail) : deal.openTaskDetail == null) && ((list = this.transitionSummary) != null ? list.equals(deal.transitionSummary) : deal.transitionSummary == null) && ((list2 = this.recentEngagements) != null ? list2.equals(deal.recentEngagements) : deal.recentEngagements == null) && ((str12 = this.recentEngagementsUpdatedAt) != null ? str12.equals(deal.recentEngagementsUpdatedAt) : deal.recentEngagementsUpdatedAt == null) && ((str13 = this.lastActivity) != null ? str13.equals(deal.lastActivity) : deal.lastActivity == null) && ((list3 = this.tags) != null ? list3.equals(deal.tags) : deal.tags == null) && ((str14 = this.customDealData) != null ? str14.equals(deal.customDealData) : deal.customDealData == null) && ((str15 = this.createdAt) != null ? str15.equals(deal.createdAt) : deal.createdAt == null)) {
                String str16 = this.updatedAt;
                String str17 = deal.updatedAt;
                if (str16 == null) {
                    if (str17 == null) {
                        return true;
                    }
                } else if (str16.equals(str17)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.dealStage;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.dealStageUpdatedAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                DealState dealState = this.dealState;
                int iHashCode6 = (iHashCode5 ^ (dealState == null ? 0 : dealState.hashCode())) * 1000003;
                DealOutcome dealOutcome = this.dealOutcome;
                int iHashCode7 = (iHashCode6 ^ (dealOutcome == null ? 0 : dealOutcome.hashCode())) * 1000003;
                String str5 = this.dealLostReason;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.amount;
                int iHashCode9 = (iHashCode8 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                String str6 = this.currency;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdByUser;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.lastUpdatedByUser;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.ownerId;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.primaryTeamId;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.openTaskDetail;
                int iHashCode15 = (iHashCode14 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                List<String> list = this.transitionSummary;
                int iHashCode16 = (iHashCode15 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.recentEngagements;
                int iHashCode17 = (iHashCode16 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str12 = this.recentEngagementsUpdatedAt;
                int iHashCode18 = (iHashCode17 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.lastActivity;
                int iHashCode19 = (iHashCode18 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                List<String> list3 = this.tags;
                int iHashCode20 = (iHashCode19 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str14 = this.customDealData;
                int iHashCode21 = (iHashCode20 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.createdAt;
                int iHashCode22 = (iHashCode21 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.updatedAt;
                this.$hashCode = iHashCode22 ^ (str16 != null ? str16.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastActivity() {
            return this.lastActivity;
        }

        public String lastUpdatedByUser() {
            return this.lastUpdatedByUser;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Deal.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Deal.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Deal.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Deal.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Deal.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Deal.this.name);
                    responseWriter.writeString(responseFieldArr[4], Deal.this.description);
                    responseWriter.writeString(responseFieldArr[5], Deal.this.dealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Deal.this.dealStageUpdatedAt);
                    ResponseField responseField = responseFieldArr[7];
                    DealState dealState = Deal.this.dealState;
                    responseWriter.writeString(responseField, dealState != null ? dealState.name() : null);
                    ResponseField responseField2 = responseFieldArr[8];
                    DealOutcome dealOutcome = Deal.this.dealOutcome;
                    responseWriter.writeString(responseField2, dealOutcome != null ? dealOutcome.name() : null);
                    responseWriter.writeString(responseFieldArr[9], Deal.this.dealLostReason);
                    responseWriter.writeDouble(responseFieldArr[10], Deal.this.amount);
                    responseWriter.writeString(responseFieldArr[11], Deal.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Deal.this.createdByUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Deal.this.lastUpdatedByUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Deal.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Deal.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Deal.this.openTaskDetail);
                    responseWriter.writeList(responseFieldArr[17], Deal.this.transitionSummary, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Deal.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[18], Deal.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Deal.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Deal.this.recentEngagementsUpdatedAt);
                    responseWriter.writeString(responseFieldArr[20], Deal.this.lastActivity);
                    responseWriter.writeList(responseFieldArr[21], Deal.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Deal.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Deal.this.customDealData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Deal.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Deal.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String openTaskDetail() {
            return this.openTaskDetail;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public List<String> recentEngagements() {
            return this.recentEngagements;
        }

        public String recentEngagementsUpdatedAt() {
            return this.recentEngagementsUpdatedAt;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Deal{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", dealStage=" + this.dealStage + ", dealStageUpdatedAt=" + this.dealStageUpdatedAt + ", dealState=" + this.dealState + ", dealOutcome=" + this.dealOutcome + ", dealLostReason=" + this.dealLostReason + ", amount=" + this.amount + ", currency=" + this.currency + ", createdByUser=" + this.createdByUser + ", lastUpdatedByUser=" + this.lastUpdatedByUser + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", openTaskDetail=" + this.openTaskDetail + ", transitionSummary=" + this.transitionSummary + ", recentEngagements=" + this.recentEngagements + ", recentEngagementsUpdatedAt=" + this.recentEngagementsUpdatedAt + ", lastActivity=" + this.lastActivity + ", tags=" + this.tags + ", customDealData=" + this.customDealData + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public List<String> transitionSummary() {
            return this.transitionSummary;
        }

        public String updatedAt() {
            return this.updatedAt;
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
                return new Engagement(string, str, str2, engagementTypeValueOf, str3, str4, contactAssignmentStatusValueOf, str5, str6, str7, str8, str9, string4, engagementStatusValueOf, str10, str11, bool, string6, string7, callDirectionValueOf, callConnectStatusValueOf, str12, str13, num, string10, string11, string12, string13, noteAdditionMethodValueOf, string15, string16, bool2, string17, string18, string19 != null ? TaskActivityType.valueOf(string19) : null, responseReader.readString(responseFieldArr[35]), responseReader.readString(responseFieldArr[36]), responseReader.readString(responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readString(responseFieldArr[39]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), responseReader.readString(responseFieldArr[42]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readString(responseFieldArr[45]), responseReader.readString(responseFieldArr[46]), responseReader.readString(responseFieldArr[47]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), responseReader.readString(responseFieldArr[50]), responseReader.readString(responseFieldArr[51]), responseReader.readString(responseFieldArr[52]), responseReader.readString(responseFieldArr[53]), responseReader.readString(responseFieldArr[54]), responseReader.readString(responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]), responseReader.readString(responseFieldArr[57]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[58]), responseReader.readString(responseFieldArr[59]), responseReader.readString(responseFieldArr[60]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[61]), responseReader.readString(responseFieldArr[62]), responseReader.readString(responseFieldArr[63]), responseReader.readString(responseFieldArr[64]), responseReader.readString(responseFieldArr[65]), responseReader.readString(responseFieldArr[66]), responseReader.readList(responseFieldArr[67], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Engagement.Mapper.1
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Engagement.1
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
                    responseWriter.writeList(responseFieldArr[67], Engagement.this.taskEngagementActions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Engagement.1.1
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

    public static class File {
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

        public static final class Mapper implements ResponseFieldMapper<File> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public File map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = File.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                List list = responseReader.readList(responseFieldArr[9], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.File.Mapper.1
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
                return new File(string, str, str2, string2, string3, string4, string5, string6, string7, list, string8, string9, string10, str3, string11, string12, str4, string13, string14, hasParentValueOf, str5, string16 != null ? ScopeLevel.valueOf(string16) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileUrl", "fileUrl", null, true, Collections.emptyList()), ResponseField.forString("fileStorageDestination", "fileStorageDestination", null, true, Collections.emptyList()), ResponseField.forString("fileName", "fileName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("documentCategory", "documentCategory", null, true, Collections.emptyList()), ResponseField.forString("documentSubCategory", "documentSubCategory", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("templateType", "templateType", null, true, Collections.emptyList()), ResponseField.forString("templateTitle", "templateTitle", null, true, Collections.emptyList()), ResponseField.forString("templateBody", "templateBody", null, true, Collections.emptyList()), ResponseField.forCustomType("templateLastUsed", "templateLastUsed", null, true, customType2, Collections.emptyList()), ResponseField.forString("templateExternalLink", "templateExternalLink", null, true, Collections.emptyList()), ResponseField.forString("uploadSource", "uploadSource", null, true, Collections.emptyList()), ResponseField.forCustomType("fileMetaData", "fileMetaData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("fileMimeType", "fileMimeType", null, true, Collections.emptyList()), ResponseField.forString("fileThumbnailUrl", "fileThumbnailUrl", null, true, Collections.emptyList()), ResponseField.forString("hasParent", "hasParent", null, true, Collections.emptyList()), ResponseField.forCustomType("parentFileId", "parentFileId", null, true, customType, Collections.emptyList()), ResponseField.forString("scopeLevel", "scopeLevel", null, true, Collections.emptyList()), ResponseField.forCustomType("scopeId", "scopeId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("uploadedById", "uploadedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public File(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, HasParent hasParent, String str19, ScopeLevel scopeLevel, String str20, String str21, String str22, String str23) {
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
            if (!(obj instanceof File)) {
                return false;
            }
            File file = (File) obj;
            if (this.__typename.equals(file.__typename) && this.id.equals(file.id) && this.accountId.equals(file.accountId) && ((str = this.fileUrl) != null ? str.equals(file.fileUrl) : file.fileUrl == null) && ((str2 = this.fileStorageDestination) != null ? str2.equals(file.fileStorageDestination) : file.fileStorageDestination == null) && ((str3 = this.fileName) != null ? str3.equals(file.fileName) : file.fileName == null) && ((str4 = this.description) != null ? str4.equals(file.description) : file.description == null) && ((str5 = this.documentCategory) != null ? str5.equals(file.documentCategory) : file.documentCategory == null) && ((str6 = this.documentSubCategory) != null ? str6.equals(file.documentSubCategory) : file.documentSubCategory == null) && ((list = this.tags) != null ? list.equals(file.tags) : file.tags == null) && ((str7 = this.templateType) != null ? str7.equals(file.templateType) : file.templateType == null) && ((str8 = this.templateTitle) != null ? str8.equals(file.templateTitle) : file.templateTitle == null) && ((str9 = this.templateBody) != null ? str9.equals(file.templateBody) : file.templateBody == null) && ((str10 = this.templateLastUsed) != null ? str10.equals(file.templateLastUsed) : file.templateLastUsed == null) && ((str11 = this.templateExternalLink) != null ? str11.equals(file.templateExternalLink) : file.templateExternalLink == null) && ((str12 = this.uploadSource) != null ? str12.equals(file.uploadSource) : file.uploadSource == null) && ((str13 = this.fileMetaData) != null ? str13.equals(file.fileMetaData) : file.fileMetaData == null) && ((str14 = this.fileMimeType) != null ? str14.equals(file.fileMimeType) : file.fileMimeType == null) && ((str15 = this.fileThumbnailUrl) != null ? str15.equals(file.fileThumbnailUrl) : file.fileThumbnailUrl == null) && ((hasParent = this.hasParent) != null ? hasParent.equals(file.hasParent) : file.hasParent == null) && ((str16 = this.parentFileId) != null ? str16.equals(file.parentFileId) : file.parentFileId == null) && ((scopeLevel = this.scopeLevel) != null ? scopeLevel.equals(file.scopeLevel) : file.scopeLevel == null) && ((str17 = this.scopeId) != null ? str17.equals(file.scopeId) : file.scopeId == null) && ((str18 = this.uploadedById) != null ? str18.equals(file.uploadedById) : file.uploadedById == null) && ((str19 = this.createdAt) != null ? str19.equals(file.createdAt) : file.createdAt == null)) {
                String str20 = this.updatedAt;
                String str21 = file.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.File.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = File.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], File.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], File.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], File.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], File.this.fileUrl);
                    responseWriter.writeString(responseFieldArr[4], File.this.fileStorageDestination);
                    responseWriter.writeString(responseFieldArr[5], File.this.fileName);
                    responseWriter.writeString(responseFieldArr[6], File.this.description);
                    responseWriter.writeString(responseFieldArr[7], File.this.documentCategory);
                    responseWriter.writeString(responseFieldArr[8], File.this.documentSubCategory);
                    responseWriter.writeList(responseFieldArr[9], File.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.File.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[10], File.this.templateType);
                    responseWriter.writeString(responseFieldArr[11], File.this.templateTitle);
                    responseWriter.writeString(responseFieldArr[12], File.this.templateBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], File.this.templateLastUsed);
                    responseWriter.writeString(responseFieldArr[14], File.this.templateExternalLink);
                    responseWriter.writeString(responseFieldArr[15], File.this.uploadSource);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], File.this.fileMetaData);
                    responseWriter.writeString(responseFieldArr[17], File.this.fileMimeType);
                    responseWriter.writeString(responseFieldArr[18], File.this.fileThumbnailUrl);
                    ResponseField responseField = responseFieldArr[19];
                    HasParent hasParent = File.this.hasParent;
                    responseWriter.writeString(responseField, hasParent != null ? hasParent.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], File.this.parentFileId);
                    ResponseField responseField2 = responseFieldArr[21];
                    ScopeLevel scopeLevel = File.this.scopeLevel;
                    responseWriter.writeString(responseField2, scopeLevel != null ? scopeLevel.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], File.this.scopeId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], File.this.uploadedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], File.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], File.this.updatedAt);
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
                this.$toString = "File{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", fileUrl=" + this.fileUrl + ", fileStorageDestination=" + this.fileStorageDestination + ", fileName=" + this.fileName + ", description=" + this.description + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", tags=" + this.tags + ", templateType=" + this.templateType + ", templateTitle=" + this.templateTitle + ", templateBody=" + this.templateBody + ", templateLastUsed=" + this.templateLastUsed + ", templateExternalLink=" + this.templateExternalLink + ", uploadSource=" + this.uploadSource + ", fileMetaData=" + this.fileMetaData + ", fileMimeType=" + this.fileMimeType + ", fileThumbnailUrl=" + this.fileThumbnailUrl + ", hasParent=" + this.hasParent + ", parentFileId=" + this.parentFileId + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", uploadedById=" + this.uploadedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class ProductService {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdBy;
        final String currency;
        final String description;
        final String endDate;
        final String hsCode;
        final String id;
        final Integer incrementBy;
        final Boolean isArchived;
        final String measurementUnit;
        final String name;
        final String parentProductId;
        final String productPicture;
        final String skuCode;
        final String standardPricePerUnit;
        final String startDate;

        /* renamed from: type, reason: collision with root package name */
        final ProductServiceType f58081type;
        final String updatedAt;
        final String updatedBy;

        public static final class Mapper implements ResponseFieldMapper<ProductService> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ProductService map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ProductService.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                return new ProductService(string, str, str2, string2, string3, string4 != null ? ProductServiceType.valueOf(string4) : null, responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), responseReader.readBoolean(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString("measurementUnit", "measurementUnit", null, true, Collections.emptyList()), ResponseField.forInt("incrementBy", "incrementBy", null, true, Collections.emptyList()), ResponseField.forString("hsCode", "hsCode", null, true, Collections.emptyList()), ResponseField.forString("skuCode", "skuCode", null, true, Collections.emptyList()), ResponseField.forString("standardPricePerUnit", "standardPricePerUnit", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forCustomType("parentProductId", "parentProductId", null, true, customType, Collections.emptyList()), ResponseField.forString("productPicture", "productPicture", null, true, Collections.emptyList()), ResponseField.forCustomType("startDate", "startDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDate", "endDate", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isArchived", "isArchived", null, true, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public ProductService(String str, String str2, String str3, String str4, String str5, ProductServiceType productServiceType, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, String str16, String str17, String str18) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.f58081type = productServiceType;
            this.measurementUnit = str6;
            this.incrementBy = num;
            this.hsCode = str7;
            this.skuCode = str8;
            this.standardPricePerUnit = str9;
            this.currency = str10;
            this.parentProductId = str11;
            this.productPicture = str12;
            this.startDate = str13;
            this.endDate = str14;
            this.isArchived = bool;
            this.createdBy = str15;
            this.updatedBy = str16;
            this.createdAt = str17;
            this.updatedAt = str18;
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

        public String createdBy() {
            return this.createdBy;
        }

        public String currency() {
            return this.currency;
        }

        public String description() {
            return this.description;
        }

        public String endDate() {
            return this.endDate;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            ProductServiceType productServiceType;
            String str3;
            Integer num;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            Boolean bool;
            String str12;
            String str13;
            String str14;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProductService)) {
                return false;
            }
            ProductService productService = (ProductService) obj;
            if (this.__typename.equals(productService.__typename) && this.id.equals(productService.id) && this.accountId.equals(productService.accountId) && ((str = this.name) != null ? str.equals(productService.name) : productService.name == null) && ((str2 = this.description) != null ? str2.equals(productService.description) : productService.description == null) && ((productServiceType = this.f58081type) != null ? productServiceType.equals(productService.f58081type) : productService.f58081type == null) && ((str3 = this.measurementUnit) != null ? str3.equals(productService.measurementUnit) : productService.measurementUnit == null) && ((num = this.incrementBy) != null ? num.equals(productService.incrementBy) : productService.incrementBy == null) && ((str4 = this.hsCode) != null ? str4.equals(productService.hsCode) : productService.hsCode == null) && ((str5 = this.skuCode) != null ? str5.equals(productService.skuCode) : productService.skuCode == null) && ((str6 = this.standardPricePerUnit) != null ? str6.equals(productService.standardPricePerUnit) : productService.standardPricePerUnit == null) && ((str7 = this.currency) != null ? str7.equals(productService.currency) : productService.currency == null) && ((str8 = this.parentProductId) != null ? str8.equals(productService.parentProductId) : productService.parentProductId == null) && ((str9 = this.productPicture) != null ? str9.equals(productService.productPicture) : productService.productPicture == null) && ((str10 = this.startDate) != null ? str10.equals(productService.startDate) : productService.startDate == null) && ((str11 = this.endDate) != null ? str11.equals(productService.endDate) : productService.endDate == null) && ((bool = this.isArchived) != null ? bool.equals(productService.isArchived) : productService.isArchived == null) && ((str12 = this.createdBy) != null ? str12.equals(productService.createdBy) : productService.createdBy == null) && ((str13 = this.updatedBy) != null ? str13.equals(productService.updatedBy) : productService.updatedBy == null) && ((str14 = this.createdAt) != null ? str14.equals(productService.createdAt) : productService.createdAt == null)) {
                String str15 = this.updatedAt;
                String str16 = productService.updatedAt;
                if (str15 == null) {
                    if (str16 == null) {
                        return true;
                    }
                } else if (str15.equals(str16)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                ProductServiceType productServiceType = this.f58081type;
                int iHashCode4 = (iHashCode3 ^ (productServiceType == null ? 0 : productServiceType.hashCode())) * 1000003;
                String str3 = this.measurementUnit;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.incrementBy;
                int iHashCode6 = (iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str4 = this.hsCode;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.skuCode;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.standardPricePerUnit;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.currency;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.parentProductId;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.productPicture;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.startDate;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.endDate;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Boolean bool = this.isArchived;
                int iHashCode15 = (iHashCode14 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str12 = this.createdBy;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.updatedBy;
                int iHashCode17 = (iHashCode16 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode18 = (iHashCode17 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                this.$hashCode = iHashCode18 ^ (str15 != null ? str15.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String hsCode() {
            return this.hsCode;
        }

        public String id() {
            return this.id;
        }

        public Integer incrementBy() {
            return this.incrementBy;
        }

        public Boolean isArchived() {
            return this.isArchived;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.ProductService.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ProductService.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ProductService.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ProductService.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ProductService.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], ProductService.this.name);
                    responseWriter.writeString(responseFieldArr[4], ProductService.this.description);
                    ResponseField responseField = responseFieldArr[5];
                    ProductServiceType productServiceType = ProductService.this.f58081type;
                    responseWriter.writeString(responseField, productServiceType != null ? productServiceType.name() : null);
                    responseWriter.writeString(responseFieldArr[6], ProductService.this.measurementUnit);
                    responseWriter.writeInt(responseFieldArr[7], ProductService.this.incrementBy);
                    responseWriter.writeString(responseFieldArr[8], ProductService.this.hsCode);
                    responseWriter.writeString(responseFieldArr[9], ProductService.this.skuCode);
                    responseWriter.writeString(responseFieldArr[10], ProductService.this.standardPricePerUnit);
                    responseWriter.writeString(responseFieldArr[11], ProductService.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], ProductService.this.parentProductId);
                    responseWriter.writeString(responseFieldArr[13], ProductService.this.productPicture);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], ProductService.this.startDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], ProductService.this.endDate);
                    responseWriter.writeBoolean(responseFieldArr[16], ProductService.this.isArchived);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], ProductService.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], ProductService.this.updatedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], ProductService.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], ProductService.this.updatedAt);
                }
            };
        }

        public String measurementUnit() {
            return this.measurementUnit;
        }

        public String name() {
            return this.name;
        }

        public String parentProductId() {
            return this.parentProductId;
        }

        public String productPicture() {
            return this.productPicture;
        }

        public String skuCode() {
            return this.skuCode;
        }

        public String standardPricePerUnit() {
            return this.standardPricePerUnit;
        }

        public String startDate() {
            return this.startDate;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ProductService{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", type=" + this.f58081type + ", measurementUnit=" + this.measurementUnit + ", incrementBy=" + this.incrementBy + ", hsCode=" + this.hsCode + ", skuCode=" + this.skuCode + ", standardPricePerUnit=" + this.standardPricePerUnit + ", currency=" + this.currency + ", parentProductId=" + this.parentProductId + ", productPicture=" + this.productPicture + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", isArchived=" + this.isArchived + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public ProductServiceType type() {
            return this.f58081type;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
        }
    }

    public static class UpdateFileObjectRelationship {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Account account;
        final String accountId;
        final Business business;
        final String businessId;
        final Contact contact;
        final String contactId;
        final String createdAt;
        final Deal deal;
        final String dealId;
        final Engagement engagement;
        final String engagementId;
        final String fieldName;
        final File file;
        final String fileId;
        final String fileUrl;
        final String id;
        final String inputContext;
        final String parentObjectId;
        final String parentObjectType;
        final String productId;
        final ProductService productService;
        final String transcription;
        final String translatedTranscription;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateFileObjectRelationship> {
            final Account.Mapper accountFieldMapper = new Account.Mapper();
            final ProductService.Mapper productServiceFieldMapper = new ProductService.Mapper();
            final Engagement.Mapper engagementFieldMapper = new Engagement.Mapper();
            final Deal.Mapper dealFieldMapper = new Deal.Mapper();
            final File.Mapper fileFieldMapper = new File.Mapper();
            final Business.Mapper businessFieldMapper = new Business.Mapper();
            final Contact.Mapper contactFieldMapper = new Contact.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateFileObjectRelationship map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateFileObjectRelationship.$responseFields;
                return new UpdateFileObjectRelationship(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (Account) responseReader.readObject(responseFieldArr[18], new ResponseReader.ObjectReader<Account>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.UpdateFileObjectRelationship.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Account read(ResponseReader responseReader2) {
                        return Mapper.this.accountFieldMapper.map(responseReader2);
                    }
                }), (ProductService) responseReader.readObject(responseFieldArr[19], new ResponseReader.ObjectReader<ProductService>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.UpdateFileObjectRelationship.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ProductService read(ResponseReader responseReader2) {
                        return Mapper.this.productServiceFieldMapper.map(responseReader2);
                    }
                }), (Engagement) responseReader.readObject(responseFieldArr[20], new ResponseReader.ObjectReader<Engagement>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.UpdateFileObjectRelationship.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Engagement read(ResponseReader responseReader2) {
                        return Mapper.this.engagementFieldMapper.map(responseReader2);
                    }
                }), (Deal) responseReader.readObject(responseFieldArr[21], new ResponseReader.ObjectReader<Deal>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.UpdateFileObjectRelationship.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Deal read(ResponseReader responseReader2) {
                        return Mapper.this.dealFieldMapper.map(responseReader2);
                    }
                }), (File) responseReader.readObject(responseFieldArr[22], new ResponseReader.ObjectReader<File>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.UpdateFileObjectRelationship.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public File read(ResponseReader responseReader2) {
                        return Mapper.this.fileFieldMapper.map(responseReader2);
                    }
                }), (Business) responseReader.readObject(responseFieldArr[23], new ResponseReader.ObjectReader<Business>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.UpdateFileObjectRelationship.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Business read(ResponseReader responseReader2) {
                        return Mapper.this.businessFieldMapper.map(responseReader2);
                    }
                }), (Contact) responseReader.readObject(responseFieldArr[24], new ResponseReader.ObjectReader<Contact>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.UpdateFileObjectRelationship.Mapper.7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Contact read(ResponseReader responseReader2) {
                        return Mapper.this.contactFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("fileId", "fileId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileUrl", "fileUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("businessId", "businessId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("dealId", "dealId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("parentObjectId", "parentObjectId", null, true, customType, Collections.emptyList()), ResponseField.forString("parentObjectType", "parentObjectType", null, true, Collections.emptyList()), ResponseField.forString("fieldName", "fieldName", null, true, Collections.emptyList()), ResponseField.forCustomType("inputContext", "inputContext", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("transcription", "transcription", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("translatedTranscription", "translatedTranscription", null, true, customType3, Collections.emptyList()), ResponseField.forObject("account", "account", null, true, Collections.emptyList()), ResponseField.forObject("productService", "productService", null, true, Collections.emptyList()), ResponseField.forObject("engagement", "engagement", null, true, Collections.emptyList()), ResponseField.forObject("deal", "deal", null, true, Collections.emptyList()), ResponseField.forObject(TransferTable.COLUMN_FILE, TransferTable.COLUMN_FILE, null, true, Collections.emptyList()), ResponseField.forObject("business", "business", null, true, Collections.emptyList()), ResponseField.forObject("contact", "contact", null, true, Collections.emptyList())};
        }

        public UpdateFileObjectRelationship(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Account account, ProductService productService, Engagement engagement, Deal deal, File file, Business business, Contact contact) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.fileId = (String) Utils.checkNotNull(str4, "fileId == null");
            this.fileUrl = str5;
            this.contactId = str6;
            this.engagementId = str7;
            this.businessId = str8;
            this.dealId = str9;
            this.productId = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.parentObjectId = str13;
            this.parentObjectType = str14;
            this.fieldName = str15;
            this.inputContext = str16;
            this.transcription = str17;
            this.translatedTranscription = str18;
            this.account = account;
            this.productService = productService;
            this.engagement = engagement;
            this.deal = deal;
            this.file = file;
            this.business = business;
            this.contact = contact;
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

        public Business business() {
            return this.business;
        }

        public String businessId() {
            return this.businessId;
        }

        public Contact contact() {
            return this.contact;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public Deal deal() {
            return this.deal;
        }

        public String dealId() {
            return this.dealId;
        }

        public Engagement engagement() {
            return this.engagement;
        }

        public String engagementId() {
            return this.engagementId;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
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
            String str14;
            Account account;
            ProductService productService;
            Engagement engagement;
            Deal deal;
            File file;
            Business business;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateFileObjectRelationship)) {
                return false;
            }
            UpdateFileObjectRelationship updateFileObjectRelationship = (UpdateFileObjectRelationship) obj;
            if (this.__typename.equals(updateFileObjectRelationship.__typename) && this.id.equals(updateFileObjectRelationship.id) && this.accountId.equals(updateFileObjectRelationship.accountId) && this.fileId.equals(updateFileObjectRelationship.fileId) && ((str = this.fileUrl) != null ? str.equals(updateFileObjectRelationship.fileUrl) : updateFileObjectRelationship.fileUrl == null) && ((str2 = this.contactId) != null ? str2.equals(updateFileObjectRelationship.contactId) : updateFileObjectRelationship.contactId == null) && ((str3 = this.engagementId) != null ? str3.equals(updateFileObjectRelationship.engagementId) : updateFileObjectRelationship.engagementId == null) && ((str4 = this.businessId) != null ? str4.equals(updateFileObjectRelationship.businessId) : updateFileObjectRelationship.businessId == null) && ((str5 = this.dealId) != null ? str5.equals(updateFileObjectRelationship.dealId) : updateFileObjectRelationship.dealId == null) && ((str6 = this.productId) != null ? str6.equals(updateFileObjectRelationship.productId) : updateFileObjectRelationship.productId == null) && ((str7 = this.createdAt) != null ? str7.equals(updateFileObjectRelationship.createdAt) : updateFileObjectRelationship.createdAt == null) && ((str8 = this.updatedAt) != null ? str8.equals(updateFileObjectRelationship.updatedAt) : updateFileObjectRelationship.updatedAt == null) && ((str9 = this.parentObjectId) != null ? str9.equals(updateFileObjectRelationship.parentObjectId) : updateFileObjectRelationship.parentObjectId == null) && ((str10 = this.parentObjectType) != null ? str10.equals(updateFileObjectRelationship.parentObjectType) : updateFileObjectRelationship.parentObjectType == null) && ((str11 = this.fieldName) != null ? str11.equals(updateFileObjectRelationship.fieldName) : updateFileObjectRelationship.fieldName == null) && ((str12 = this.inputContext) != null ? str12.equals(updateFileObjectRelationship.inputContext) : updateFileObjectRelationship.inputContext == null) && ((str13 = this.transcription) != null ? str13.equals(updateFileObjectRelationship.transcription) : updateFileObjectRelationship.transcription == null) && ((str14 = this.translatedTranscription) != null ? str14.equals(updateFileObjectRelationship.translatedTranscription) : updateFileObjectRelationship.translatedTranscription == null) && ((account = this.account) != null ? account.equals(updateFileObjectRelationship.account) : updateFileObjectRelationship.account == null) && ((productService = this.productService) != null ? productService.equals(updateFileObjectRelationship.productService) : updateFileObjectRelationship.productService == null) && ((engagement = this.engagement) != null ? engagement.equals(updateFileObjectRelationship.engagement) : updateFileObjectRelationship.engagement == null) && ((deal = this.deal) != null ? deal.equals(updateFileObjectRelationship.deal) : updateFileObjectRelationship.deal == null) && ((file = this.file) != null ? file.equals(updateFileObjectRelationship.file) : updateFileObjectRelationship.file == null) && ((business = this.business) != null ? business.equals(updateFileObjectRelationship.business) : updateFileObjectRelationship.business == null)) {
                Contact contact = this.contact;
                Contact contact2 = updateFileObjectRelationship.contact;
                if (contact == null) {
                    if (contact2 == null) {
                        return true;
                    }
                } else if (contact.equals(contact2)) {
                    return true;
                }
            }
            return false;
        }

        public String fieldName() {
            return this.fieldName;
        }

        public File file() {
            return this.file;
        }

        public String fileId() {
            return this.fileId;
        }

        public String fileUrl() {
            return this.fileUrl;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.fileId.hashCode()) * 1000003;
                String str = this.fileUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.contactId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.engagementId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.businessId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.dealId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.productId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.parentObjectId;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.parentObjectType;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.fieldName;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.inputContext;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.transcription;
                int iHashCode14 = (iHashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.translatedTranscription;
                int iHashCode15 = (iHashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                Account account = this.account;
                int iHashCode16 = (iHashCode15 ^ (account == null ? 0 : account.hashCode())) * 1000003;
                ProductService productService = this.productService;
                int iHashCode17 = (iHashCode16 ^ (productService == null ? 0 : productService.hashCode())) * 1000003;
                Engagement engagement = this.engagement;
                int iHashCode18 = (iHashCode17 ^ (engagement == null ? 0 : engagement.hashCode())) * 1000003;
                Deal deal = this.deal;
                int iHashCode19 = (iHashCode18 ^ (deal == null ? 0 : deal.hashCode())) * 1000003;
                File file = this.file;
                int iHashCode20 = (iHashCode19 ^ (file == null ? 0 : file.hashCode())) * 1000003;
                Business business = this.business;
                int iHashCode21 = (iHashCode20 ^ (business == null ? 0 : business.hashCode())) * 1000003;
                Contact contact = this.contact;
                this.$hashCode = iHashCode21 ^ (contact != null ? contact.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String inputContext() {
            return this.inputContext;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.UpdateFileObjectRelationship.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateFileObjectRelationship.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateFileObjectRelationship.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateFileObjectRelationship.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateFileObjectRelationship.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateFileObjectRelationship.this.fileId);
                    responseWriter.writeString(responseFieldArr[4], UpdateFileObjectRelationship.this.fileUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateFileObjectRelationship.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateFileObjectRelationship.this.engagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateFileObjectRelationship.this.businessId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateFileObjectRelationship.this.dealId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateFileObjectRelationship.this.productId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateFileObjectRelationship.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], UpdateFileObjectRelationship.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdateFileObjectRelationship.this.parentObjectId);
                    responseWriter.writeString(responseFieldArr[13], UpdateFileObjectRelationship.this.parentObjectType);
                    responseWriter.writeString(responseFieldArr[14], UpdateFileObjectRelationship.this.fieldName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], UpdateFileObjectRelationship.this.inputContext);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], UpdateFileObjectRelationship.this.transcription);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], UpdateFileObjectRelationship.this.translatedTranscription);
                    ResponseField responseField = responseFieldArr[18];
                    Account account = UpdateFileObjectRelationship.this.account;
                    responseWriter.writeObject(responseField, account != null ? account.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[19];
                    ProductService productService = UpdateFileObjectRelationship.this.productService;
                    responseWriter.writeObject(responseField2, productService != null ? productService.marshaller() : null);
                    ResponseField responseField3 = responseFieldArr[20];
                    Engagement engagement = UpdateFileObjectRelationship.this.engagement;
                    responseWriter.writeObject(responseField3, engagement != null ? engagement.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[21];
                    Deal deal = UpdateFileObjectRelationship.this.deal;
                    responseWriter.writeObject(responseField4, deal != null ? deal.marshaller() : null);
                    ResponseField responseField5 = responseFieldArr[22];
                    File file = UpdateFileObjectRelationship.this.file;
                    responseWriter.writeObject(responseField5, file != null ? file.marshaller() : null);
                    ResponseField responseField6 = responseFieldArr[23];
                    Business business = UpdateFileObjectRelationship.this.business;
                    responseWriter.writeObject(responseField6, business != null ? business.marshaller() : null);
                    ResponseField responseField7 = responseFieldArr[24];
                    Contact contact = UpdateFileObjectRelationship.this.contact;
                    responseWriter.writeObject(responseField7, contact != null ? contact.marshaller() : null);
                }
            };
        }

        public String parentObjectId() {
            return this.parentObjectId;
        }

        public String parentObjectType() {
            return this.parentObjectType;
        }

        public String productId() {
            return this.productId;
        }

        public ProductService productService() {
            return this.productService;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateFileObjectRelationship{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", fileId=" + this.fileId + ", fileUrl=" + this.fileUrl + ", contactId=" + this.contactId + ", engagementId=" + this.engagementId + ", businessId=" + this.businessId + ", dealId=" + this.dealId + ", productId=" + this.productId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", parentObjectId=" + this.parentObjectId + ", parentObjectType=" + this.parentObjectType + ", fieldName=" + this.fieldName + ", inputContext=" + this.inputContext + ", transcription=" + this.transcription + ", translatedTranscription=" + this.translatedTranscription + ", account=" + this.account + ", productService=" + this.productService + ", engagement=" + this.engagement + ", deal=" + this.deal + ", file=" + this.file + ", business=" + this.business + ", contact=" + this.contact + "}";
            }
            return this.$toString;
        }

        public String transcription() {
            return this.transcription;
        }

        public String translatedTranscription() {
            return this.translatedTranscription;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelfileObjectRelationshipConditionInput condition;
        private final UpdateFileObjectRelationshipInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateFileObjectRelationshipInput updateFileObjectRelationshipInput, ModelfileObjectRelationshipConditionInput modelfileObjectRelationshipConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateFileObjectRelationshipInput;
            this.condition = modelfileObjectRelationshipConditionInput;
            linkedHashMap.put("input", updateFileObjectRelationshipInput);
            linkedHashMap.put("condition", modelfileObjectRelationshipConditionInput);
        }

        public ModelfileObjectRelationshipConditionInput condition() {
            return this.condition;
        }

        public UpdateFileObjectRelationshipInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateFileObjectRelationshipMutation.Variables.1
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

    public UpdateFileObjectRelationshipMutation(UpdateFileObjectRelationshipInput updateFileObjectRelationshipInput, ModelfileObjectRelationshipConditionInput modelfileObjectRelationshipConditionInput) {
        Utils.checkNotNull(updateFileObjectRelationshipInput, "input == null");
        this.variables = new Variables(updateFileObjectRelationshipInput, modelfileObjectRelationshipConditionInput);
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
        return "9a04ea27916922754115cd210d0eb766ad4784c4cf193a381606ecdf2ec3ac73";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateFileObjectRelationship($input: UpdateFileObjectRelationshipInput!, $condition: ModelfileObjectRelationshipConditionInput) {\n  updateFileObjectRelationship(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    fileId\n    fileUrl\n    contactId\n    engagementId\n    businessId\n    dealId\n    productId\n    createdAt\n    updatedAt\n    parentObjectId\n    parentObjectType\n    fieldName\n    inputContext\n    transcription\n    translatedTranscription\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    productService {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    engagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    deal {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    file {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    business {\n      __typename\n      id\n      accountId\n      name\n      industry\n      priority\n      website\n      domain\n      logo\n      userDefinedTags\n      addedById\n      updatedById\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
