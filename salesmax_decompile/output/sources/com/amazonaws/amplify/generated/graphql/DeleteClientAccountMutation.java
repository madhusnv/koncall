package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.AccountStatus;
import type.AccountType;
import type.AddedSourceType;
import type.CallDirection;
import type.ContactAssignmentStatus;
import type.ContactStatus;
import type.CustomType;
import type.Day;
import type.DeleteClientAccountInput;
import type.LeadLifecycleStage;
import type.LeadLifecycleStageSubCategory;
import type.ModelClientAccountConditionInput;
import type.Seniority;
import type.TaskActivityType;
import type.UserRegistrationStatus;

/* loaded from: classes6.dex */
public final class DeleteClientAccountMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteClientAccount($input: DeleteClientAccountInput!, $condition: ModelClientAccountConditionInput) {\n  deleteClientAccount(input: $input, condition: $condition) {\n    __typename\n    accountId\n    clientAccountId\n    clientAccountType\n    clientAccountStatus\n    clientAccountTrialEndDate\n    clientAccountTrialExtensionTimes\n    billingContactId\n    alternateBillingContactId\n    lastPendingProductAccountBillId\n    lastPaidProductAccountBillId\n    accountSalesOwnerId\n    accountSupportOwnerId\n    currentUserCount\n    freeUserCount\n    currency\n    subscriptionCreationDate\n    accountCreationDate\n    lastBilledCycleStartDate\n    lastBilledCycleEndDate\n    lastBilledDate\n    lastBilledAmmount\n    lastPaidAmount\n    lastPaymentDate\n    lastBillStatus\n    lastPaymentFollowupNote\n    lastPaymentFollowupDoneOn\n    lastPaidUserCount\n    lastBilledUserCount\n    billingPeriod\n    billCycleStartDate\n    billCycleEndDate\n    billingDate\n    paymentDueDate\n    nextBillingCycleStartDate\n    nextBillingCycleEndDate\n    nextBillingDate\n    nextPaymentDueDate\n    createdAt\n    updatedAt\n    clientAccount {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    productPlanSubscriptions {\n      __typename\n      nextToken\n    }\n    lastPendingProductAccountBills {\n      __typename\n      id\n      accountId\n      productAccountId\n      productPlanId\n      totalFees\n      currency\n      billStatus\n      billGeneratedFrom\n      billGeneratedTo\n      createdAt\n      updatedAt\n    }\n    lastPaidProductAccountBills {\n      __typename\n      id\n      accountId\n      productAccountId\n      productPlanId\n      totalFees\n      currency\n      billStatus\n      billGeneratedFrom\n      billGeneratedTo\n      createdAt\n      updatedAt\n    }\n    billingContact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    alternateBillingContact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    accountSalesOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    accountSupportOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteClientAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteClientAccount($input: DeleteClientAccountInput!, $condition: ModelClientAccountConditionInput) {\n  deleteClientAccount(input: $input, condition: $condition) {\n    __typename\n    accountId\n    clientAccountId\n    clientAccountType\n    clientAccountStatus\n    clientAccountTrialEndDate\n    clientAccountTrialExtensionTimes\n    billingContactId\n    alternateBillingContactId\n    lastPendingProductAccountBillId\n    lastPaidProductAccountBillId\n    accountSalesOwnerId\n    accountSupportOwnerId\n    currentUserCount\n    freeUserCount\n    currency\n    subscriptionCreationDate\n    accountCreationDate\n    lastBilledCycleStartDate\n    lastBilledCycleEndDate\n    lastBilledDate\n    lastBilledAmmount\n    lastPaidAmount\n    lastPaymentDate\n    lastBillStatus\n    lastPaymentFollowupNote\n    lastPaymentFollowupDoneOn\n    lastPaidUserCount\n    lastBilledUserCount\n    billingPeriod\n    billCycleStartDate\n    billCycleEndDate\n    billingDate\n    paymentDueDate\n    nextBillingCycleStartDate\n    nextBillingCycleEndDate\n    nextBillingDate\n    nextPaymentDueDate\n    createdAt\n    updatedAt\n    clientAccount {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    productPlanSubscriptions {\n      __typename\n      nextToken\n    }\n    lastPendingProductAccountBills {\n      __typename\n      id\n      accountId\n      productAccountId\n      productPlanId\n      totalFees\n      currency\n      billStatus\n      billGeneratedFrom\n      billGeneratedTo\n      createdAt\n      updatedAt\n    }\n    lastPaidProductAccountBills {\n      __typename\n      id\n      accountId\n      productAccountId\n      productPlanId\n      totalFees\n      currency\n      billStatus\n      billGeneratedFrom\n      billGeneratedTo\n      createdAt\n      updatedAt\n    }\n    billingContact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    alternateBillingContact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    accountSalesOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    accountSupportOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static class AccountSalesOwner {
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

        public static final class Mapper implements ResponseFieldMapper<AccountSalesOwner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AccountSalesOwner map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AccountSalesOwner.$responseFields;
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
                return new AccountSalesOwner(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public AccountSalesOwner(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof AccountSalesOwner)) {
                return false;
            }
            AccountSalesOwner accountSalesOwner = (AccountSalesOwner) obj;
            if (this.__typename.equals(accountSalesOwner.__typename) && this.id.equals(accountSalesOwner.id) && this.addedSourceType.equals(accountSalesOwner.addedSourceType) && this.name.equals(accountSalesOwner.name) && ((str = this.profilePictureUrl) != null ? str.equals(accountSalesOwner.profilePictureUrl) : accountSalesOwner.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(accountSalesOwner.registeredEmail) : accountSalesOwner.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(accountSalesOwner.registeredEmailVerified) : accountSalesOwner.registeredEmailVerified == null) && this.registeredNumber.equals(accountSalesOwner.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(accountSalesOwner.registeredNumberVerified) : accountSalesOwner.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(accountSalesOwner.secondaryNumber) : accountSalesOwner.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(accountSalesOwner.secondaryNumberVerified) : accountSalesOwner.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(accountSalesOwner.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(accountSalesOwner.lastSelectedAccountWeb) : accountSalesOwner.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(accountSalesOwner.lastSelectedAccountApp) : accountSalesOwner.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(accountSalesOwner.appVersion) : accountSalesOwner.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(accountSalesOwner.deviceModel) : accountSalesOwner.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(accountSalesOwner.deviceManufacturer) : accountSalesOwner.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(accountSalesOwner.androidVersionRelease) : accountSalesOwner.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(accountSalesOwner.createdAt) : accountSalesOwner.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = accountSalesOwner.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AccountSalesOwner.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AccountSalesOwner.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AccountSalesOwner.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], AccountSalesOwner.this.id);
                    responseWriter.writeString(responseFieldArr[2], AccountSalesOwner.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], AccountSalesOwner.this.name);
                    responseWriter.writeString(responseFieldArr[4], AccountSalesOwner.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], AccountSalesOwner.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], AccountSalesOwner.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], AccountSalesOwner.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], AccountSalesOwner.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], AccountSalesOwner.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], AccountSalesOwner.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], AccountSalesOwner.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], AccountSalesOwner.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], AccountSalesOwner.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], AccountSalesOwner.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], AccountSalesOwner.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], AccountSalesOwner.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], AccountSalesOwner.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], AccountSalesOwner.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], AccountSalesOwner.this.updatedAt);
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
                this.$toString = "AccountSalesOwner{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class AccountSupportOwner {
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

        public static final class Mapper implements ResponseFieldMapper<AccountSupportOwner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AccountSupportOwner map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AccountSupportOwner.$responseFields;
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
                return new AccountSupportOwner(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public AccountSupportOwner(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof AccountSupportOwner)) {
                return false;
            }
            AccountSupportOwner accountSupportOwner = (AccountSupportOwner) obj;
            if (this.__typename.equals(accountSupportOwner.__typename) && this.id.equals(accountSupportOwner.id) && this.addedSourceType.equals(accountSupportOwner.addedSourceType) && this.name.equals(accountSupportOwner.name) && ((str = this.profilePictureUrl) != null ? str.equals(accountSupportOwner.profilePictureUrl) : accountSupportOwner.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(accountSupportOwner.registeredEmail) : accountSupportOwner.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(accountSupportOwner.registeredEmailVerified) : accountSupportOwner.registeredEmailVerified == null) && this.registeredNumber.equals(accountSupportOwner.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(accountSupportOwner.registeredNumberVerified) : accountSupportOwner.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(accountSupportOwner.secondaryNumber) : accountSupportOwner.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(accountSupportOwner.secondaryNumberVerified) : accountSupportOwner.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(accountSupportOwner.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(accountSupportOwner.lastSelectedAccountWeb) : accountSupportOwner.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(accountSupportOwner.lastSelectedAccountApp) : accountSupportOwner.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(accountSupportOwner.appVersion) : accountSupportOwner.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(accountSupportOwner.deviceModel) : accountSupportOwner.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(accountSupportOwner.deviceManufacturer) : accountSupportOwner.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(accountSupportOwner.androidVersionRelease) : accountSupportOwner.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(accountSupportOwner.createdAt) : accountSupportOwner.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = accountSupportOwner.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AccountSupportOwner.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AccountSupportOwner.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AccountSupportOwner.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], AccountSupportOwner.this.id);
                    responseWriter.writeString(responseFieldArr[2], AccountSupportOwner.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], AccountSupportOwner.this.name);
                    responseWriter.writeString(responseFieldArr[4], AccountSupportOwner.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], AccountSupportOwner.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], AccountSupportOwner.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], AccountSupportOwner.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], AccountSupportOwner.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], AccountSupportOwner.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], AccountSupportOwner.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], AccountSupportOwner.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], AccountSupportOwner.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], AccountSupportOwner.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], AccountSupportOwner.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], AccountSupportOwner.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], AccountSupportOwner.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], AccountSupportOwner.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], AccountSupportOwner.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], AccountSupportOwner.this.updatedAt);
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
                this.$toString = "AccountSupportOwner{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class AlternateBillingContact {
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

        public static final class Mapper implements ResponseFieldMapper<AlternateBillingContact> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AlternateBillingContact map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AlternateBillingContact.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                ContactAssignmentStatus contactAssignmentStatusValueOf = string2 != null ? ContactAssignmentStatus.valueOf(string2) : null;
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                List list2 = responseReader.readList(responseFieldArr[7], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.Mapper.2
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
                List list3 = responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<Day>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.Mapper.3
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
                List list4 = responseReader.readList(responseFieldArr[92], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                List list5 = responseReader.readList(responseFieldArr[93], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string45 = responseReader.readString(responseFieldArr[94]);
                String string46 = responseReader.readString(responseFieldArr[95]);
                String string47 = responseReader.readString(responseFieldArr[96]);
                List list6 = responseReader.readList(responseFieldArr[97], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.Mapper.6
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
                return new AlternateBillingContact(string, str, str2, str3, contactAssignmentStatusValueOf, list, str4, list2, string3, str5, str6, str7, string4, str8, string5, str9, string6, string7, string8, string9, str10, str11, str12, contactStatusValueOf, string11, string12, string13, str13, string14, string15, bool, bool2, str14, string16, list3, string17, string18, string19, seniorityValueOf, str15, bool3, taskActivityTypeValueOf, str16, callDirectionValueOf, string23, string24, str17, num, string25, str18, string26, string27, str19, string28, str20, str21, string29, str22, str23, string30, str24, string31, string32, string33, str25, string34, str26, str27, string35, str28, str29, string36, str30, str31, string37, num2, string38, str32, str33, str34, str35, string39, string40, string41, str36, string42, str37, string43, string44, str38, num3, num4, list4, list5, string45, string46, string47, list6, str39, str40, str41, str42, str43, str44, str45, str46, string48, str47, leadLifecycleStageValueOf, string50 != null ? LeadLifecycleStageSubCategory.valueOf(string50) : null, responseReader.readString(responseFieldArr[110]), responseReader.readString(responseFieldArr[111]), responseReader.readInt(responseFieldArr[112]), responseReader.readInt(responseFieldArr[113]), responseReader.readInt(responseFieldArr[114]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[115]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[116]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[117]), responseReader.readString(responseFieldArr[118]), responseReader.readString(responseFieldArr[119]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[120]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[121]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[122]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[123]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forList("sharedOwners", "sharedOwners", null, true, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forList("sharedTeams", "sharedTeams", null, true, Collections.emptyList()), ResponseField.forString("accountPriority", "accountPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("assignedToId", "assignedToId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("blockedForCallById", "blockedForCallById", null, true, customType, Collections.emptyList()), ResponseField.forString("blockedForCallReason", "blockedForCallReason", null, true, Collections.emptyList()), ResponseField.forCustomType("blockedForCallUntil", "blockedForCallUntil", null, true, customType2, Collections.emptyList()), ResponseField.forString("callPriority", "callPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("waChatChannelId", "waChatChannelId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactSource", "contactSource", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownOne", "contactSourceDrillDownOne", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownTwo", "contactSourceDrillDownTwo", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownThree", "contactSourceDrillDownThree", null, true, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownOneId", "contactSourceDrillDownOneId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownTwoId", "contactSourceDrillDownTwoId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownThreeId", "contactSourceDrillDownThreeId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactStatus", "contactStatus", null, true, Collections.emptyList()), ResponseField.forString("contactType", "contactType", null, true, Collections.emptyList()), ResponseField.forString("department", "department", null, true, Collections.emptyList()), ResponseField.forString("designation", "designation", null, true, Collections.emptyList()), ResponseField.forCustomType("lastRepeatEnquiryDate", "lastRepeatEnquiryDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastRepeatEnquirySource", "lastRepeatEnquirySource", null, true, Collections.emptyList()), ResponseField.forString("gender", "gender", null, true, Collections.emptyList()), ResponseField.forBoolean("isDecisionMaker", "isDecisionMaker", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrivate", "isPrivate", null, true, Collections.emptyList()), ResponseField.forCustomType("lockPeriod", "lockPeriod", null, true, customType2, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forList("preferredContactDays", "preferredContactDays", null, true, Collections.emptyList()), ResponseField.forString("profilePhotoUrl", "profilePhotoUrl", null, true, Collections.emptyList()), ResponseField.forString("referredBy", "referredBy", null, true, Collections.emptyList()), ResponseField.forString("salutation", "salutation", null, true, Collections.emptyList()), ResponseField.forString("seniority", "seniority", null, true, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("hasTask", "hasTask", null, true, Collections.emptyList()), ResponseField.forString("openTaskActivityType", "openTaskActivityType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCalledTime", "lastCalledTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastCallDirection", "lastCallDirection", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcome", "lastCallOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcomeNature", "lastCallOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCallUserId", "lastCallUserId", null, true, customType, Collections.emptyList()), ResponseField.forInt("lastCallDuration", "lastCallDuration", null, true, Collections.emptyList()), ResponseField.forString("lastCallEngagementId", "lastCallEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitTime", "lastVisitTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastVisitOutcome", "lastVisitOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastVisitOutcomeNature", "lastVisitOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitUserId", "lastVisitUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastVisitEngagementId", "lastVisitEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastEmailTime", "lastEmailTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEmailUserId", "lastEmailUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastEmailEngagementId", "lastEmailEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappTime", "lastWhatsappTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappUserId", "lastWhatsappUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastWhatsappEngagementId", "lastWhatsappEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastTime", "lastWabaBroadcastTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastStatus", "lastWabaBroadcastStatus", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastTemplate", "lastWabaBroadcastTemplate", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyBody", "lastWabaBroadcastReplyBody", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastReplyTime", "lastWabaBroadcastReplyTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyType", "lastWabaBroadcastReplyType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastSmsTime", "lastSmsTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastSmsUserId", "lastSmsUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastSmsEngagementId", "lastSmsEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastNoteAddedTime", "lastNoteAddedTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastNoteUserId", "lastNoteUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastNoteEngagementId", "lastNoteEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneTime", "lastTaskDoneTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneUserId", "lastTaskDoneUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastTaskDoneEngagementId", "lastTaskDoneEngagementId", null, true, Collections.emptyList()), ResponseField.forInt("openTaskCount", "openTaskCount", null, true, Collections.emptyList()), ResponseField.forString("lastKnownDisposition", "lastKnownDisposition", null, true, Collections.emptyList()), ResponseField.forCustomType("lastKnownDispositionTime", "lastKnownDispositionTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastLeadAssignmentDateTime", "lastLeadAssignmentDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromAccount", "lastEngagementFromAccount", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromContact", "lastEngagementFromContact", null, true, customType2, Collections.emptyList()), ResponseField.forString("freshLeadTag", "freshLeadTag", null, true, Collections.emptyList()), ResponseField.forString("noWorkAfterAssignment", "noWorkAfterAssignment", null, true, Collections.emptyList()), ResponseField.forString("needFollowUpTag", "needFollowUpTag", null, true, Collections.emptyList()), ResponseField.forCustomType("needFollowUpTagUpdatedAt", "needFollowUpTagUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("activeDealStage", "activeDealStage", null, true, Collections.emptyList()), ResponseField.forCustomType("activeDealStageUpdatedAt", "activeDealStageUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealDescription", "dealDescription", null, true, Collections.emptyList()), ResponseField.forString("isCustomer", "isCustomer", null, true, Collections.emptyList()), ResponseField.forCustomType("becameCustomerOn", "becameCustomerOn", null, true, customType2, Collections.emptyList()), ResponseField.forInt("unsuccessfulCallAttempts", "unsuccessfulCallAttempts", null, true, Collections.emptyList()), ResponseField.forInt("leadCallsNotAnswered", "leadCallsNotAnswered", null, true, Collections.emptyList()), ResponseField.forList("userDefinedTags", "userDefinedTags", null, true, Collections.emptyList()), ResponseField.forList("productService", "productService", null, true, Collections.emptyList()), ResponseField.forString("bulkUploadReference", "bulkUploadReference", null, true, Collections.emptyList()), ResponseField.forString("assignmentMethod", "assignmentMethod", null, true, Collections.emptyList()), ResponseField.forString("whatsappOptInStatus", "whatsappOptInStatus", null, true, Collections.emptyList()), ResponseField.forList("recentEngagements", "recentEngagements", null, true, Collections.emptyList()), ResponseField.forCustomType("recentEngagementsUpdatedAt", "recentEngagementsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("openTaskDetail", "openTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("openVideoCallDetail", "openVideoCallDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetail", "lastClosedTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetailUpdatedAt", "lastClosedTaskDetailUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("latestRemark", "latestRemark", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customAttributes", "customAttributes", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("paymentRequestDetail", "paymentRequestDetail", null, true, customType3, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("customDataAddedFromAddContactForm", "customDataAddedFromAddContactForm", null, true, customType3, Collections.emptyList()), ResponseField.forString("leadLifecycleStage", "leadLifecycleStage", null, true, Collections.emptyList()), ResponseField.forString("leadLifecycleStageSubCategory", "leadLifecycleStageSubCategory", null, true, Collections.emptyList()), ResponseField.forString("manualClosedReason", "manualClosedReason", null, true, Collections.emptyList()), ResponseField.forString("lastDealStageType", "lastDealStageType", null, true, Collections.emptyList()), ResponseField.forInt("prospectingAttempts", "prospectingAttempts", null, true, Collections.emptyList()), ResponseField.forInt("totalProspectingAttemptsAcrossRechurn", "totalProspectingAttemptsAcrossRechurn", null, true, Collections.emptyList()), ResponseField.forInt("numberOfTimesRechurned", "numberOfTimesRechurned", null, true, Collections.emptyList()), ResponseField.forCustomType("lastProspectingDoneOn", "lastProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("firstProspectingDoneOn", "firstProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextProspectingDueOn", "nextProspectingDueOn", null, true, customType2, Collections.emptyList()), ResponseField.forString("nextProspectingSetBy", "nextProspectingSetBy", null, true, Collections.emptyList()), ResponseField.forString("nextProspectingNote", "nextProspectingNote", null, true, Collections.emptyList()), ResponseField.forCustomType("movedToOpportunityOn", "movedToOpportunityOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("movedToClosedOn", "movedToClosedOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public AlternateBillingContact(String str, String str2, String str3, String str4, ContactAssignmentStatus contactAssignmentStatus, List<String> list, String str5, List<String> list2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ContactStatus contactStatus, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, Boolean bool2, String str27, String str28, List<Day> list3, String str29, String str30, String str31, Seniority seniority, String str32, Boolean bool3, TaskActivityType taskActivityType, String str33, CallDirection callDirection, String str34, String str35, String str36, Integer num, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, Integer num2, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, Integer num3, Integer num4, List<String> list4, List<String> list5, String str78, String str79, String str80, List<String> list6, String str81, String str82, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, LeadLifecycleStage leadLifecycleStage, LeadLifecycleStageSubCategory leadLifecycleStageSubCategory, String str91, String str92, Integer num5, Integer num6, Integer num7, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101) {
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
            if (!(obj instanceof AlternateBillingContact)) {
                return false;
            }
            AlternateBillingContact alternateBillingContact = (AlternateBillingContact) obj;
            if (this.__typename.equals(alternateBillingContact.__typename) && this.id.equals(alternateBillingContact.id) && this.accountId.equals(alternateBillingContact.accountId) && ((str = this.ownerId) != null ? str.equals(alternateBillingContact.ownerId) : alternateBillingContact.ownerId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(alternateBillingContact.toBeAssigned) : alternateBillingContact.toBeAssigned == null) && ((list = this.sharedOwners) != null ? list.equals(alternateBillingContact.sharedOwners) : alternateBillingContact.sharedOwners == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(alternateBillingContact.primaryTeamId) : alternateBillingContact.primaryTeamId == null) && ((list2 = this.sharedTeams) != null ? list2.equals(alternateBillingContact.sharedTeams) : alternateBillingContact.sharedTeams == null) && ((str3 = this.accountPriority) != null ? str3.equals(alternateBillingContact.accountPriority) : alternateBillingContact.accountPriority == null) && ((str4 = this.addedById) != null ? str4.equals(alternateBillingContact.addedById) : alternateBillingContact.addedById == null) && ((str5 = this.assignedToId) != null ? str5.equals(alternateBillingContact.assignedToId) : alternateBillingContact.assignedToId == null) && ((str6 = this.blockedForCallById) != null ? str6.equals(alternateBillingContact.blockedForCallById) : alternateBillingContact.blockedForCallById == null) && ((str7 = this.blockedForCallReason) != null ? str7.equals(alternateBillingContact.blockedForCallReason) : alternateBillingContact.blockedForCallReason == null) && ((str8 = this.blockedForCallUntil) != null ? str8.equals(alternateBillingContact.blockedForCallUntil) : alternateBillingContact.blockedForCallUntil == null) && ((str9 = this.callPriority) != null ? str9.equals(alternateBillingContact.callPriority) : alternateBillingContact.callPriority == null) && ((str10 = this.waChatChannelId) != null ? str10.equals(alternateBillingContact.waChatChannelId) : alternateBillingContact.waChatChannelId == null) && ((str11 = this.contactSource) != null ? str11.equals(alternateBillingContact.contactSource) : alternateBillingContact.contactSource == null) && ((str12 = this.contactSourceDrillDownOne) != null ? str12.equals(alternateBillingContact.contactSourceDrillDownOne) : alternateBillingContact.contactSourceDrillDownOne == null) && ((str13 = this.contactSourceDrillDownTwo) != null ? str13.equals(alternateBillingContact.contactSourceDrillDownTwo) : alternateBillingContact.contactSourceDrillDownTwo == null) && ((str14 = this.contactSourceDrillDownThree) != null ? str14.equals(alternateBillingContact.contactSourceDrillDownThree) : alternateBillingContact.contactSourceDrillDownThree == null) && ((str15 = this.contactSourceDrillDownOneId) != null ? str15.equals(alternateBillingContact.contactSourceDrillDownOneId) : alternateBillingContact.contactSourceDrillDownOneId == null) && ((str16 = this.contactSourceDrillDownTwoId) != null ? str16.equals(alternateBillingContact.contactSourceDrillDownTwoId) : alternateBillingContact.contactSourceDrillDownTwoId == null) && ((str17 = this.contactSourceDrillDownThreeId) != null ? str17.equals(alternateBillingContact.contactSourceDrillDownThreeId) : alternateBillingContact.contactSourceDrillDownThreeId == null) && ((contactStatus = this.contactStatus) != null ? contactStatus.equals(alternateBillingContact.contactStatus) : alternateBillingContact.contactStatus == null) && ((str18 = this.contactType) != null ? str18.equals(alternateBillingContact.contactType) : alternateBillingContact.contactType == null) && ((str19 = this.department) != null ? str19.equals(alternateBillingContact.department) : alternateBillingContact.department == null) && ((str20 = this.designation) != null ? str20.equals(alternateBillingContact.designation) : alternateBillingContact.designation == null) && ((str21 = this.lastRepeatEnquiryDate) != null ? str21.equals(alternateBillingContact.lastRepeatEnquiryDate) : alternateBillingContact.lastRepeatEnquiryDate == null) && ((str22 = this.lastRepeatEnquirySource) != null ? str22.equals(alternateBillingContact.lastRepeatEnquirySource) : alternateBillingContact.lastRepeatEnquirySource == null) && ((str23 = this.gender) != null ? str23.equals(alternateBillingContact.gender) : alternateBillingContact.gender == null) && ((bool = this.isDecisionMaker) != null ? bool.equals(alternateBillingContact.isDecisionMaker) : alternateBillingContact.isDecisionMaker == null) && ((bool2 = this.isPrivate) != null ? bool2.equals(alternateBillingContact.isPrivate) : alternateBillingContact.isPrivate == null) && ((str24 = this.lockPeriod) != null ? str24.equals(alternateBillingContact.lockPeriod) : alternateBillingContact.lockPeriod == null) && ((str25 = this.name) != null ? str25.equals(alternateBillingContact.name) : alternateBillingContact.name == null) && ((list3 = this.preferredContactDays) != null ? list3.equals(alternateBillingContact.preferredContactDays) : alternateBillingContact.preferredContactDays == null) && ((str26 = this.profilePhotoUrl) != null ? str26.equals(alternateBillingContact.profilePhotoUrl) : alternateBillingContact.profilePhotoUrl == null) && ((str27 = this.referredBy) != null ? str27.equals(alternateBillingContact.referredBy) : alternateBillingContact.referredBy == null) && ((str28 = this.salutation) != null ? str28.equals(alternateBillingContact.salutation) : alternateBillingContact.salutation == null) && ((seniority = this.seniority) != null ? seniority.equals(alternateBillingContact.seniority) : alternateBillingContact.seniority == null) && ((str29 = this.updatedById) != null ? str29.equals(alternateBillingContact.updatedById) : alternateBillingContact.updatedById == null) && ((bool3 = this.hasTask) != null ? bool3.equals(alternateBillingContact.hasTask) : alternateBillingContact.hasTask == null) && ((taskActivityType = this.openTaskActivityType) != null ? taskActivityType.equals(alternateBillingContact.openTaskActivityType) : alternateBillingContact.openTaskActivityType == null) && ((str30 = this.lastCalledTime) != null ? str30.equals(alternateBillingContact.lastCalledTime) : alternateBillingContact.lastCalledTime == null) && ((callDirection = this.lastCallDirection) != null ? callDirection.equals(alternateBillingContact.lastCallDirection) : alternateBillingContact.lastCallDirection == null) && ((str31 = this.lastCallOutcome) != null ? str31.equals(alternateBillingContact.lastCallOutcome) : alternateBillingContact.lastCallOutcome == null) && ((str32 = this.lastCallOutcomeNature) != null ? str32.equals(alternateBillingContact.lastCallOutcomeNature) : alternateBillingContact.lastCallOutcomeNature == null) && ((str33 = this.lastCallUserId) != null ? str33.equals(alternateBillingContact.lastCallUserId) : alternateBillingContact.lastCallUserId == null) && ((num = this.lastCallDuration) != null ? num.equals(alternateBillingContact.lastCallDuration) : alternateBillingContact.lastCallDuration == null) && ((str34 = this.lastCallEngagementId) != null ? str34.equals(alternateBillingContact.lastCallEngagementId) : alternateBillingContact.lastCallEngagementId == null) && ((str35 = this.lastVisitTime) != null ? str35.equals(alternateBillingContact.lastVisitTime) : alternateBillingContact.lastVisitTime == null) && ((str36 = this.lastVisitOutcome) != null ? str36.equals(alternateBillingContact.lastVisitOutcome) : alternateBillingContact.lastVisitOutcome == null) && ((str37 = this.lastVisitOutcomeNature) != null ? str37.equals(alternateBillingContact.lastVisitOutcomeNature) : alternateBillingContact.lastVisitOutcomeNature == null) && ((str38 = this.lastVisitUserId) != null ? str38.equals(alternateBillingContact.lastVisitUserId) : alternateBillingContact.lastVisitUserId == null) && ((str39 = this.lastVisitEngagementId) != null ? str39.equals(alternateBillingContact.lastVisitEngagementId) : alternateBillingContact.lastVisitEngagementId == null) && ((str40 = this.lastEmailTime) != null ? str40.equals(alternateBillingContact.lastEmailTime) : alternateBillingContact.lastEmailTime == null) && ((str41 = this.lastEmailUserId) != null ? str41.equals(alternateBillingContact.lastEmailUserId) : alternateBillingContact.lastEmailUserId == null) && ((str42 = this.lastEmailEngagementId) != null ? str42.equals(alternateBillingContact.lastEmailEngagementId) : alternateBillingContact.lastEmailEngagementId == null) && ((str43 = this.lastWhatsappTime) != null ? str43.equals(alternateBillingContact.lastWhatsappTime) : alternateBillingContact.lastWhatsappTime == null) && ((str44 = this.lastWhatsappUserId) != null ? str44.equals(alternateBillingContact.lastWhatsappUserId) : alternateBillingContact.lastWhatsappUserId == null) && ((str45 = this.lastWhatsappEngagementId) != null ? str45.equals(alternateBillingContact.lastWhatsappEngagementId) : alternateBillingContact.lastWhatsappEngagementId == null) && ((str46 = this.lastWabaBroadcastTime) != null ? str46.equals(alternateBillingContact.lastWabaBroadcastTime) : alternateBillingContact.lastWabaBroadcastTime == null) && ((str47 = this.lastWabaBroadcastStatus) != null ? str47.equals(alternateBillingContact.lastWabaBroadcastStatus) : alternateBillingContact.lastWabaBroadcastStatus == null) && ((str48 = this.lastWabaBroadcastTemplate) != null ? str48.equals(alternateBillingContact.lastWabaBroadcastTemplate) : alternateBillingContact.lastWabaBroadcastTemplate == null) && ((str49 = this.lastWabaBroadcastReplyBody) != null ? str49.equals(alternateBillingContact.lastWabaBroadcastReplyBody) : alternateBillingContact.lastWabaBroadcastReplyBody == null) && ((str50 = this.lastWabaBroadcastReplyTime) != null ? str50.equals(alternateBillingContact.lastWabaBroadcastReplyTime) : alternateBillingContact.lastWabaBroadcastReplyTime == null) && ((str51 = this.lastWabaBroadcastReplyType) != null ? str51.equals(alternateBillingContact.lastWabaBroadcastReplyType) : alternateBillingContact.lastWabaBroadcastReplyType == null) && ((str52 = this.lastSmsTime) != null ? str52.equals(alternateBillingContact.lastSmsTime) : alternateBillingContact.lastSmsTime == null) && ((str53 = this.lastSmsUserId) != null ? str53.equals(alternateBillingContact.lastSmsUserId) : alternateBillingContact.lastSmsUserId == null) && ((str54 = this.lastSmsEngagementId) != null ? str54.equals(alternateBillingContact.lastSmsEngagementId) : alternateBillingContact.lastSmsEngagementId == null) && ((str55 = this.lastNoteAddedTime) != null ? str55.equals(alternateBillingContact.lastNoteAddedTime) : alternateBillingContact.lastNoteAddedTime == null) && ((str56 = this.lastNoteUserId) != null ? str56.equals(alternateBillingContact.lastNoteUserId) : alternateBillingContact.lastNoteUserId == null) && ((str57 = this.lastNoteEngagementId) != null ? str57.equals(alternateBillingContact.lastNoteEngagementId) : alternateBillingContact.lastNoteEngagementId == null) && ((str58 = this.lastTaskDoneTime) != null ? str58.equals(alternateBillingContact.lastTaskDoneTime) : alternateBillingContact.lastTaskDoneTime == null) && ((str59 = this.lastTaskDoneUserId) != null ? str59.equals(alternateBillingContact.lastTaskDoneUserId) : alternateBillingContact.lastTaskDoneUserId == null) && ((str60 = this.lastTaskDoneEngagementId) != null ? str60.equals(alternateBillingContact.lastTaskDoneEngagementId) : alternateBillingContact.lastTaskDoneEngagementId == null) && ((num2 = this.openTaskCount) != null ? num2.equals(alternateBillingContact.openTaskCount) : alternateBillingContact.openTaskCount == null) && ((str61 = this.lastKnownDisposition) != null ? str61.equals(alternateBillingContact.lastKnownDisposition) : alternateBillingContact.lastKnownDisposition == null) && ((str62 = this.lastKnownDispositionTime) != null ? str62.equals(alternateBillingContact.lastKnownDispositionTime) : alternateBillingContact.lastKnownDispositionTime == null) && ((str63 = this.lastLeadAssignmentDateTime) != null ? str63.equals(alternateBillingContact.lastLeadAssignmentDateTime) : alternateBillingContact.lastLeadAssignmentDateTime == null) && ((str64 = this.lastEngagementFromAccount) != null ? str64.equals(alternateBillingContact.lastEngagementFromAccount) : alternateBillingContact.lastEngagementFromAccount == null) && ((str65 = this.lastEngagementFromContact) != null ? str65.equals(alternateBillingContact.lastEngagementFromContact) : alternateBillingContact.lastEngagementFromContact == null) && ((str66 = this.freshLeadTag) != null ? str66.equals(alternateBillingContact.freshLeadTag) : alternateBillingContact.freshLeadTag == null) && ((str67 = this.noWorkAfterAssignment) != null ? str67.equals(alternateBillingContact.noWorkAfterAssignment) : alternateBillingContact.noWorkAfterAssignment == null) && ((str68 = this.needFollowUpTag) != null ? str68.equals(alternateBillingContact.needFollowUpTag) : alternateBillingContact.needFollowUpTag == null) && ((str69 = this.needFollowUpTagUpdatedAt) != null ? str69.equals(alternateBillingContact.needFollowUpTagUpdatedAt) : alternateBillingContact.needFollowUpTagUpdatedAt == null) && ((str70 = this.activeDealStage) != null ? str70.equals(alternateBillingContact.activeDealStage) : alternateBillingContact.activeDealStage == null) && ((str71 = this.activeDealStageUpdatedAt) != null ? str71.equals(alternateBillingContact.activeDealStageUpdatedAt) : alternateBillingContact.activeDealStageUpdatedAt == null) && ((str72 = this.dealDescription) != null ? str72.equals(alternateBillingContact.dealDescription) : alternateBillingContact.dealDescription == null) && ((str73 = this.isCustomer) != null ? str73.equals(alternateBillingContact.isCustomer) : alternateBillingContact.isCustomer == null) && ((str74 = this.becameCustomerOn) != null ? str74.equals(alternateBillingContact.becameCustomerOn) : alternateBillingContact.becameCustomerOn == null) && ((num3 = this.unsuccessfulCallAttempts) != null ? num3.equals(alternateBillingContact.unsuccessfulCallAttempts) : alternateBillingContact.unsuccessfulCallAttempts == null) && ((num4 = this.leadCallsNotAnswered) != null ? num4.equals(alternateBillingContact.leadCallsNotAnswered) : alternateBillingContact.leadCallsNotAnswered == null) && ((list4 = this.userDefinedTags) != null ? list4.equals(alternateBillingContact.userDefinedTags) : alternateBillingContact.userDefinedTags == null) && ((list5 = this.productService) != null ? list5.equals(alternateBillingContact.productService) : alternateBillingContact.productService == null) && ((str75 = this.bulkUploadReference) != null ? str75.equals(alternateBillingContact.bulkUploadReference) : alternateBillingContact.bulkUploadReference == null) && ((str76 = this.assignmentMethod) != null ? str76.equals(alternateBillingContact.assignmentMethod) : alternateBillingContact.assignmentMethod == null) && ((str77 = this.whatsappOptInStatus) != null ? str77.equals(alternateBillingContact.whatsappOptInStatus) : alternateBillingContact.whatsappOptInStatus == null) && ((list6 = this.recentEngagements) != null ? list6.equals(alternateBillingContact.recentEngagements) : alternateBillingContact.recentEngagements == null) && ((str78 = this.recentEngagementsUpdatedAt) != null ? str78.equals(alternateBillingContact.recentEngagementsUpdatedAt) : alternateBillingContact.recentEngagementsUpdatedAt == null) && ((str79 = this.openTaskDetail) != null ? str79.equals(alternateBillingContact.openTaskDetail) : alternateBillingContact.openTaskDetail == null) && ((str80 = this.openVideoCallDetail) != null ? str80.equals(alternateBillingContact.openVideoCallDetail) : alternateBillingContact.openVideoCallDetail == null) && ((str81 = this.lastClosedTaskDetail) != null ? str81.equals(alternateBillingContact.lastClosedTaskDetail) : alternateBillingContact.lastClosedTaskDetail == null) && ((str82 = this.lastClosedTaskDetailUpdatedAt) != null ? str82.equals(alternateBillingContact.lastClosedTaskDetailUpdatedAt) : alternateBillingContact.lastClosedTaskDetailUpdatedAt == null) && ((str83 = this.latestRemark) != null ? str83.equals(alternateBillingContact.latestRemark) : alternateBillingContact.latestRemark == null) && ((str84 = this.customAttributes) != null ? str84.equals(alternateBillingContact.customAttributes) : alternateBillingContact.customAttributes == null) && ((str85 = this.paymentRequestDetail) != null ? str85.equals(alternateBillingContact.paymentRequestDetail) : alternateBillingContact.paymentRequestDetail == null) && ((str86 = this.lastPaymentStatus) != null ? str86.equals(alternateBillingContact.lastPaymentStatus) : alternateBillingContact.lastPaymentStatus == null) && ((str87 = this.customDataAddedFromAddContactForm) != null ? str87.equals(alternateBillingContact.customDataAddedFromAddContactForm) : alternateBillingContact.customDataAddedFromAddContactForm == null) && ((leadLifecycleStage = this.leadLifecycleStage) != null ? leadLifecycleStage.equals(alternateBillingContact.leadLifecycleStage) : alternateBillingContact.leadLifecycleStage == null) && ((leadLifecycleStageSubCategory = this.leadLifecycleStageSubCategory) != null ? leadLifecycleStageSubCategory.equals(alternateBillingContact.leadLifecycleStageSubCategory) : alternateBillingContact.leadLifecycleStageSubCategory == null) && ((str88 = this.manualClosedReason) != null ? str88.equals(alternateBillingContact.manualClosedReason) : alternateBillingContact.manualClosedReason == null) && ((str89 = this.lastDealStageType) != null ? str89.equals(alternateBillingContact.lastDealStageType) : alternateBillingContact.lastDealStageType == null) && ((num5 = this.prospectingAttempts) != null ? num5.equals(alternateBillingContact.prospectingAttempts) : alternateBillingContact.prospectingAttempts == null) && ((num6 = this.totalProspectingAttemptsAcrossRechurn) != null ? num6.equals(alternateBillingContact.totalProspectingAttemptsAcrossRechurn) : alternateBillingContact.totalProspectingAttemptsAcrossRechurn == null) && ((num7 = this.numberOfTimesRechurned) != null ? num7.equals(alternateBillingContact.numberOfTimesRechurned) : alternateBillingContact.numberOfTimesRechurned == null) && ((str90 = this.lastProspectingDoneOn) != null ? str90.equals(alternateBillingContact.lastProspectingDoneOn) : alternateBillingContact.lastProspectingDoneOn == null) && ((str91 = this.firstProspectingDoneOn) != null ? str91.equals(alternateBillingContact.firstProspectingDoneOn) : alternateBillingContact.firstProspectingDoneOn == null) && ((str92 = this.nextProspectingDueOn) != null ? str92.equals(alternateBillingContact.nextProspectingDueOn) : alternateBillingContact.nextProspectingDueOn == null) && ((str93 = this.nextProspectingSetBy) != null ? str93.equals(alternateBillingContact.nextProspectingSetBy) : alternateBillingContact.nextProspectingSetBy == null) && ((str94 = this.nextProspectingNote) != null ? str94.equals(alternateBillingContact.nextProspectingNote) : alternateBillingContact.nextProspectingNote == null) && ((str95 = this.movedToOpportunityOn) != null ? str95.equals(alternateBillingContact.movedToOpportunityOn) : alternateBillingContact.movedToOpportunityOn == null) && ((str96 = this.movedToClosedOn) != null ? str96.equals(alternateBillingContact.movedToClosedOn) : alternateBillingContact.movedToClosedOn == null) && ((str97 = this.createdAt) != null ? str97.equals(alternateBillingContact.createdAt) : alternateBillingContact.createdAt == null)) {
                String str98 = this.updatedAt;
                String str99 = alternateBillingContact.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AlternateBillingContact.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AlternateBillingContact.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], AlternateBillingContact.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], AlternateBillingContact.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], AlternateBillingContact.this.ownerId);
                    ResponseField responseField = responseFieldArr[4];
                    ContactAssignmentStatus contactAssignmentStatus = AlternateBillingContact.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeList(responseFieldArr[5], AlternateBillingContact.this.sharedOwners, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], AlternateBillingContact.this.primaryTeamId);
                    responseWriter.writeList(responseFieldArr[7], AlternateBillingContact.this.sharedTeams, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[8], AlternateBillingContact.this.accountPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], AlternateBillingContact.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], AlternateBillingContact.this.assignedToId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], AlternateBillingContact.this.blockedForCallById);
                    responseWriter.writeString(responseFieldArr[12], AlternateBillingContact.this.blockedForCallReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], AlternateBillingContact.this.blockedForCallUntil);
                    responseWriter.writeString(responseFieldArr[14], AlternateBillingContact.this.callPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], AlternateBillingContact.this.waChatChannelId);
                    responseWriter.writeString(responseFieldArr[16], AlternateBillingContact.this.contactSource);
                    responseWriter.writeString(responseFieldArr[17], AlternateBillingContact.this.contactSourceDrillDownOne);
                    responseWriter.writeString(responseFieldArr[18], AlternateBillingContact.this.contactSourceDrillDownTwo);
                    responseWriter.writeString(responseFieldArr[19], AlternateBillingContact.this.contactSourceDrillDownThree);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], AlternateBillingContact.this.contactSourceDrillDownOneId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], AlternateBillingContact.this.contactSourceDrillDownTwoId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], AlternateBillingContact.this.contactSourceDrillDownThreeId);
                    ResponseField responseField2 = responseFieldArr[23];
                    ContactStatus contactStatus = AlternateBillingContact.this.contactStatus;
                    responseWriter.writeString(responseField2, contactStatus != null ? contactStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[24], AlternateBillingContact.this.contactType);
                    responseWriter.writeString(responseFieldArr[25], AlternateBillingContact.this.department);
                    responseWriter.writeString(responseFieldArr[26], AlternateBillingContact.this.designation);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], AlternateBillingContact.this.lastRepeatEnquiryDate);
                    responseWriter.writeString(responseFieldArr[28], AlternateBillingContact.this.lastRepeatEnquirySource);
                    responseWriter.writeString(responseFieldArr[29], AlternateBillingContact.this.gender);
                    responseWriter.writeBoolean(responseFieldArr[30], AlternateBillingContact.this.isDecisionMaker);
                    responseWriter.writeBoolean(responseFieldArr[31], AlternateBillingContact.this.isPrivate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], AlternateBillingContact.this.lockPeriod);
                    responseWriter.writeString(responseFieldArr[33], AlternateBillingContact.this.name);
                    responseWriter.writeList(responseFieldArr[34], AlternateBillingContact.this.preferredContactDays, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((Day) obj).name());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[35], AlternateBillingContact.this.profilePhotoUrl);
                    responseWriter.writeString(responseFieldArr[36], AlternateBillingContact.this.referredBy);
                    responseWriter.writeString(responseFieldArr[37], AlternateBillingContact.this.salutation);
                    ResponseField responseField3 = responseFieldArr[38];
                    Seniority seniority = AlternateBillingContact.this.seniority;
                    responseWriter.writeString(responseField3, seniority != null ? seniority.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], AlternateBillingContact.this.updatedById);
                    responseWriter.writeBoolean(responseFieldArr[40], AlternateBillingContact.this.hasTask);
                    ResponseField responseField4 = responseFieldArr[41];
                    TaskActivityType taskActivityType = AlternateBillingContact.this.openTaskActivityType;
                    responseWriter.writeString(responseField4, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], AlternateBillingContact.this.lastCalledTime);
                    ResponseField responseField5 = responseFieldArr[43];
                    CallDirection callDirection = AlternateBillingContact.this.lastCallDirection;
                    responseWriter.writeString(responseField5, callDirection != null ? callDirection.name() : null);
                    responseWriter.writeString(responseFieldArr[44], AlternateBillingContact.this.lastCallOutcome);
                    responseWriter.writeString(responseFieldArr[45], AlternateBillingContact.this.lastCallOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[46], AlternateBillingContact.this.lastCallUserId);
                    responseWriter.writeInt(responseFieldArr[47], AlternateBillingContact.this.lastCallDuration);
                    responseWriter.writeString(responseFieldArr[48], AlternateBillingContact.this.lastCallEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[49], AlternateBillingContact.this.lastVisitTime);
                    responseWriter.writeString(responseFieldArr[50], AlternateBillingContact.this.lastVisitOutcome);
                    responseWriter.writeString(responseFieldArr[51], AlternateBillingContact.this.lastVisitOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], AlternateBillingContact.this.lastVisitUserId);
                    responseWriter.writeString(responseFieldArr[53], AlternateBillingContact.this.lastVisitEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], AlternateBillingContact.this.lastEmailTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], AlternateBillingContact.this.lastEmailUserId);
                    responseWriter.writeString(responseFieldArr[56], AlternateBillingContact.this.lastEmailEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[57], AlternateBillingContact.this.lastWhatsappTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], AlternateBillingContact.this.lastWhatsappUserId);
                    responseWriter.writeString(responseFieldArr[59], AlternateBillingContact.this.lastWhatsappEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[60], AlternateBillingContact.this.lastWabaBroadcastTime);
                    responseWriter.writeString(responseFieldArr[61], AlternateBillingContact.this.lastWabaBroadcastStatus);
                    responseWriter.writeString(responseFieldArr[62], AlternateBillingContact.this.lastWabaBroadcastTemplate);
                    responseWriter.writeString(responseFieldArr[63], AlternateBillingContact.this.lastWabaBroadcastReplyBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[64], AlternateBillingContact.this.lastWabaBroadcastReplyTime);
                    responseWriter.writeString(responseFieldArr[65], AlternateBillingContact.this.lastWabaBroadcastReplyType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[66], AlternateBillingContact.this.lastSmsTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[67], AlternateBillingContact.this.lastSmsUserId);
                    responseWriter.writeString(responseFieldArr[68], AlternateBillingContact.this.lastSmsEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[69], AlternateBillingContact.this.lastNoteAddedTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[70], AlternateBillingContact.this.lastNoteUserId);
                    responseWriter.writeString(responseFieldArr[71], AlternateBillingContact.this.lastNoteEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], AlternateBillingContact.this.lastTaskDoneTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], AlternateBillingContact.this.lastTaskDoneUserId);
                    responseWriter.writeString(responseFieldArr[74], AlternateBillingContact.this.lastTaskDoneEngagementId);
                    responseWriter.writeInt(responseFieldArr[75], AlternateBillingContact.this.openTaskCount);
                    responseWriter.writeString(responseFieldArr[76], AlternateBillingContact.this.lastKnownDisposition);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[77], AlternateBillingContact.this.lastKnownDispositionTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[78], AlternateBillingContact.this.lastLeadAssignmentDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[79], AlternateBillingContact.this.lastEngagementFromAccount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[80], AlternateBillingContact.this.lastEngagementFromContact);
                    responseWriter.writeString(responseFieldArr[81], AlternateBillingContact.this.freshLeadTag);
                    responseWriter.writeString(responseFieldArr[82], AlternateBillingContact.this.noWorkAfterAssignment);
                    responseWriter.writeString(responseFieldArr[83], AlternateBillingContact.this.needFollowUpTag);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[84], AlternateBillingContact.this.needFollowUpTagUpdatedAt);
                    responseWriter.writeString(responseFieldArr[85], AlternateBillingContact.this.activeDealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[86], AlternateBillingContact.this.activeDealStageUpdatedAt);
                    responseWriter.writeString(responseFieldArr[87], AlternateBillingContact.this.dealDescription);
                    responseWriter.writeString(responseFieldArr[88], AlternateBillingContact.this.isCustomer);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[89], AlternateBillingContact.this.becameCustomerOn);
                    responseWriter.writeInt(responseFieldArr[90], AlternateBillingContact.this.unsuccessfulCallAttempts);
                    responseWriter.writeInt(responseFieldArr[91], AlternateBillingContact.this.leadCallsNotAnswered);
                    responseWriter.writeList(responseFieldArr[92], AlternateBillingContact.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[93], AlternateBillingContact.this.productService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[94], AlternateBillingContact.this.bulkUploadReference);
                    responseWriter.writeString(responseFieldArr[95], AlternateBillingContact.this.assignmentMethod);
                    responseWriter.writeString(responseFieldArr[96], AlternateBillingContact.this.whatsappOptInStatus);
                    responseWriter.writeList(responseFieldArr[97], AlternateBillingContact.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.AlternateBillingContact.1.6
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[98], AlternateBillingContact.this.recentEngagementsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[99], AlternateBillingContact.this.openTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[100], AlternateBillingContact.this.openVideoCallDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[101], AlternateBillingContact.this.lastClosedTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[102], AlternateBillingContact.this.lastClosedTaskDetailUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[103], AlternateBillingContact.this.latestRemark);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[104], AlternateBillingContact.this.customAttributes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[105], AlternateBillingContact.this.paymentRequestDetail);
                    responseWriter.writeString(responseFieldArr[106], AlternateBillingContact.this.lastPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[107], AlternateBillingContact.this.customDataAddedFromAddContactForm);
                    ResponseField responseField6 = responseFieldArr[108];
                    LeadLifecycleStage leadLifecycleStage = AlternateBillingContact.this.leadLifecycleStage;
                    responseWriter.writeString(responseField6, leadLifecycleStage != null ? leadLifecycleStage.name() : null);
                    ResponseField responseField7 = responseFieldArr[109];
                    LeadLifecycleStageSubCategory leadLifecycleStageSubCategory = AlternateBillingContact.this.leadLifecycleStageSubCategory;
                    responseWriter.writeString(responseField7, leadLifecycleStageSubCategory != null ? leadLifecycleStageSubCategory.name() : null);
                    responseWriter.writeString(responseFieldArr[110], AlternateBillingContact.this.manualClosedReason);
                    responseWriter.writeString(responseFieldArr[111], AlternateBillingContact.this.lastDealStageType);
                    responseWriter.writeInt(responseFieldArr[112], AlternateBillingContact.this.prospectingAttempts);
                    responseWriter.writeInt(responseFieldArr[113], AlternateBillingContact.this.totalProspectingAttemptsAcrossRechurn);
                    responseWriter.writeInt(responseFieldArr[114], AlternateBillingContact.this.numberOfTimesRechurned);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[115], AlternateBillingContact.this.lastProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[116], AlternateBillingContact.this.firstProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[117], AlternateBillingContact.this.nextProspectingDueOn);
                    responseWriter.writeString(responseFieldArr[118], AlternateBillingContact.this.nextProspectingSetBy);
                    responseWriter.writeString(responseFieldArr[119], AlternateBillingContact.this.nextProspectingNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[120], AlternateBillingContact.this.movedToOpportunityOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[121], AlternateBillingContact.this.movedToClosedOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[122], AlternateBillingContact.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[123], AlternateBillingContact.this.updatedAt);
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
                this.$toString = "AlternateBillingContact{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", toBeAssigned=" + this.toBeAssigned + ", sharedOwners=" + this.sharedOwners + ", primaryTeamId=" + this.primaryTeamId + ", sharedTeams=" + this.sharedTeams + ", accountPriority=" + this.accountPriority + ", addedById=" + this.addedById + ", assignedToId=" + this.assignedToId + ", blockedForCallById=" + this.blockedForCallById + ", blockedForCallReason=" + this.blockedForCallReason + ", blockedForCallUntil=" + this.blockedForCallUntil + ", callPriority=" + this.callPriority + ", waChatChannelId=" + this.waChatChannelId + ", contactSource=" + this.contactSource + ", contactSourceDrillDownOne=" + this.contactSourceDrillDownOne + ", contactSourceDrillDownTwo=" + this.contactSourceDrillDownTwo + ", contactSourceDrillDownThree=" + this.contactSourceDrillDownThree + ", contactSourceDrillDownOneId=" + this.contactSourceDrillDownOneId + ", contactSourceDrillDownTwoId=" + this.contactSourceDrillDownTwoId + ", contactSourceDrillDownThreeId=" + this.contactSourceDrillDownThreeId + ", contactStatus=" + this.contactStatus + ", contactType=" + this.contactType + ", department=" + this.department + ", designation=" + this.designation + ", lastRepeatEnquiryDate=" + this.lastRepeatEnquiryDate + ", lastRepeatEnquirySource=" + this.lastRepeatEnquirySource + ", gender=" + this.gender + ", isDecisionMaker=" + this.isDecisionMaker + ", isPrivate=" + this.isPrivate + ", lockPeriod=" + this.lockPeriod + ", name=" + this.name + ", preferredContactDays=" + this.preferredContactDays + ", profilePhotoUrl=" + this.profilePhotoUrl + ", referredBy=" + this.referredBy + ", salutation=" + this.salutation + ", seniority=" + this.seniority + ", updatedById=" + this.updatedById + ", hasTask=" + this.hasTask + ", openTaskActivityType=" + this.openTaskActivityType + ", lastCalledTime=" + this.lastCalledTime + ", lastCallDirection=" + this.lastCallDirection + ", lastCallOutcome=" + this.lastCallOutcome + ", lastCallOutcomeNature=" + this.lastCallOutcomeNature + ", lastCallUserId=" + this.lastCallUserId + ", lastCallDuration=" + this.lastCallDuration + ", lastCallEngagementId=" + this.lastCallEngagementId + ", lastVisitTime=" + this.lastVisitTime + ", lastVisitOutcome=" + this.lastVisitOutcome + ", lastVisitOutcomeNature=" + this.lastVisitOutcomeNature + ", lastVisitUserId=" + this.lastVisitUserId + ", lastVisitEngagementId=" + this.lastVisitEngagementId + ", lastEmailTime=" + this.lastEmailTime + ", lastEmailUserId=" + this.lastEmailUserId + ", lastEmailEngagementId=" + this.lastEmailEngagementId + ", lastWhatsappTime=" + this.lastWhatsappTime + ", lastWhatsappUserId=" + this.lastWhatsappUserId + ", lastWhatsappEngagementId=" + this.lastWhatsappEngagementId + ", lastWabaBroadcastTime=" + this.lastWabaBroadcastTime + ", lastWabaBroadcastStatus=" + this.lastWabaBroadcastStatus + ", lastWabaBroadcastTemplate=" + this.lastWabaBroadcastTemplate + ", lastWabaBroadcastReplyBody=" + this.lastWabaBroadcastReplyBody + ", lastWabaBroadcastReplyTime=" + this.lastWabaBroadcastReplyTime + ", lastWabaBroadcastReplyType=" + this.lastWabaBroadcastReplyType + ", lastSmsTime=" + this.lastSmsTime + ", lastSmsUserId=" + this.lastSmsUserId + ", lastSmsEngagementId=" + this.lastSmsEngagementId + ", lastNoteAddedTime=" + this.lastNoteAddedTime + ", lastNoteUserId=" + this.lastNoteUserId + ", lastNoteEngagementId=" + this.lastNoteEngagementId + ", lastTaskDoneTime=" + this.lastTaskDoneTime + ", lastTaskDoneUserId=" + this.lastTaskDoneUserId + ", lastTaskDoneEngagementId=" + this.lastTaskDoneEngagementId + ", openTaskCount=" + this.openTaskCount + ", lastKnownDisposition=" + this.lastKnownDisposition + ", lastKnownDispositionTime=" + this.lastKnownDispositionTime + ", lastLeadAssignmentDateTime=" + this.lastLeadAssignmentDateTime + ", lastEngagementFromAccount=" + this.lastEngagementFromAccount + ", lastEngagementFromContact=" + this.lastEngagementFromContact + ", freshLeadTag=" + this.freshLeadTag + ", noWorkAfterAssignment=" + this.noWorkAfterAssignment + ", needFollowUpTag=" + this.needFollowUpTag + ", needFollowUpTagUpdatedAt=" + this.needFollowUpTagUpdatedAt + ", activeDealStage=" + this.activeDealStage + ", activeDealStageUpdatedAt=" + this.activeDealStageUpdatedAt + ", dealDescription=" + this.dealDescription + ", isCustomer=" + this.isCustomer + ", becameCustomerOn=" + this.becameCustomerOn + ", unsuccessfulCallAttempts=" + this.unsuccessfulCallAttempts + ", leadCallsNotAnswered=" + this.leadCallsNotAnswered + ", userDefinedTags=" + this.userDefinedTags + ", productService=" + this.productService + ", bulkUploadReference=" + this.bulkUploadReference + ", assignmentMethod=" + this.assignmentMethod + ", whatsappOptInStatus=" + this.whatsappOptInStatus + ", recentEngagements=" + this.recentEngagements + ", recentEngagementsUpdatedAt=" + this.recentEngagementsUpdatedAt + ", openTaskDetail=" + this.openTaskDetail + ", openVideoCallDetail=" + this.openVideoCallDetail + ", lastClosedTaskDetail=" + this.lastClosedTaskDetail + ", lastClosedTaskDetailUpdatedAt=" + this.lastClosedTaskDetailUpdatedAt + ", latestRemark=" + this.latestRemark + ", customAttributes=" + this.customAttributes + ", paymentRequestDetail=" + this.paymentRequestDetail + ", lastPaymentStatus=" + this.lastPaymentStatus + ", customDataAddedFromAddContactForm=" + this.customDataAddedFromAddContactForm + ", leadLifecycleStage=" + this.leadLifecycleStage + ", leadLifecycleStageSubCategory=" + this.leadLifecycleStageSubCategory + ", manualClosedReason=" + this.manualClosedReason + ", lastDealStageType=" + this.lastDealStageType + ", prospectingAttempts=" + this.prospectingAttempts + ", totalProspectingAttemptsAcrossRechurn=" + this.totalProspectingAttemptsAcrossRechurn + ", numberOfTimesRechurned=" + this.numberOfTimesRechurned + ", lastProspectingDoneOn=" + this.lastProspectingDoneOn + ", firstProspectingDoneOn=" + this.firstProspectingDoneOn + ", nextProspectingDueOn=" + this.nextProspectingDueOn + ", nextProspectingSetBy=" + this.nextProspectingSetBy + ", nextProspectingNote=" + this.nextProspectingNote + ", movedToOpportunityOn=" + this.movedToOpportunityOn + ", movedToClosedOn=" + this.movedToClosedOn + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class BillingContact {
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

        public static final class Mapper implements ResponseFieldMapper<BillingContact> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public BillingContact map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = BillingContact.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                ContactAssignmentStatus contactAssignmentStatusValueOf = string2 != null ? ContactAssignmentStatus.valueOf(string2) : null;
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                List list2 = responseReader.readList(responseFieldArr[7], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.Mapper.2
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
                List list3 = responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<Day>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.Mapper.3
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
                List list4 = responseReader.readList(responseFieldArr[92], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                List list5 = responseReader.readList(responseFieldArr[93], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string45 = responseReader.readString(responseFieldArr[94]);
                String string46 = responseReader.readString(responseFieldArr[95]);
                String string47 = responseReader.readString(responseFieldArr[96]);
                List list6 = responseReader.readList(responseFieldArr[97], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.Mapper.6
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
                return new BillingContact(string, str, str2, str3, contactAssignmentStatusValueOf, list, str4, list2, string3, str5, str6, str7, string4, str8, string5, str9, string6, string7, string8, string9, str10, str11, str12, contactStatusValueOf, string11, string12, string13, str13, string14, string15, bool, bool2, str14, string16, list3, string17, string18, string19, seniorityValueOf, str15, bool3, taskActivityTypeValueOf, str16, callDirectionValueOf, string23, string24, str17, num, string25, str18, string26, string27, str19, string28, str20, str21, string29, str22, str23, string30, str24, string31, string32, string33, str25, string34, str26, str27, string35, str28, str29, string36, str30, str31, string37, num2, string38, str32, str33, str34, str35, string39, string40, string41, str36, string42, str37, string43, string44, str38, num3, num4, list4, list5, string45, string46, string47, list6, str39, str40, str41, str42, str43, str44, str45, str46, string48, str47, leadLifecycleStageValueOf, string50 != null ? LeadLifecycleStageSubCategory.valueOf(string50) : null, responseReader.readString(responseFieldArr[110]), responseReader.readString(responseFieldArr[111]), responseReader.readInt(responseFieldArr[112]), responseReader.readInt(responseFieldArr[113]), responseReader.readInt(responseFieldArr[114]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[115]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[116]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[117]), responseReader.readString(responseFieldArr[118]), responseReader.readString(responseFieldArr[119]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[120]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[121]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[122]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[123]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forList("sharedOwners", "sharedOwners", null, true, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forList("sharedTeams", "sharedTeams", null, true, Collections.emptyList()), ResponseField.forString("accountPriority", "accountPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("assignedToId", "assignedToId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("blockedForCallById", "blockedForCallById", null, true, customType, Collections.emptyList()), ResponseField.forString("blockedForCallReason", "blockedForCallReason", null, true, Collections.emptyList()), ResponseField.forCustomType("blockedForCallUntil", "blockedForCallUntil", null, true, customType2, Collections.emptyList()), ResponseField.forString("callPriority", "callPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("waChatChannelId", "waChatChannelId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactSource", "contactSource", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownOne", "contactSourceDrillDownOne", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownTwo", "contactSourceDrillDownTwo", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownThree", "contactSourceDrillDownThree", null, true, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownOneId", "contactSourceDrillDownOneId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownTwoId", "contactSourceDrillDownTwoId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownThreeId", "contactSourceDrillDownThreeId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactStatus", "contactStatus", null, true, Collections.emptyList()), ResponseField.forString("contactType", "contactType", null, true, Collections.emptyList()), ResponseField.forString("department", "department", null, true, Collections.emptyList()), ResponseField.forString("designation", "designation", null, true, Collections.emptyList()), ResponseField.forCustomType("lastRepeatEnquiryDate", "lastRepeatEnquiryDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastRepeatEnquirySource", "lastRepeatEnquirySource", null, true, Collections.emptyList()), ResponseField.forString("gender", "gender", null, true, Collections.emptyList()), ResponseField.forBoolean("isDecisionMaker", "isDecisionMaker", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrivate", "isPrivate", null, true, Collections.emptyList()), ResponseField.forCustomType("lockPeriod", "lockPeriod", null, true, customType2, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forList("preferredContactDays", "preferredContactDays", null, true, Collections.emptyList()), ResponseField.forString("profilePhotoUrl", "profilePhotoUrl", null, true, Collections.emptyList()), ResponseField.forString("referredBy", "referredBy", null, true, Collections.emptyList()), ResponseField.forString("salutation", "salutation", null, true, Collections.emptyList()), ResponseField.forString("seniority", "seniority", null, true, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("hasTask", "hasTask", null, true, Collections.emptyList()), ResponseField.forString("openTaskActivityType", "openTaskActivityType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCalledTime", "lastCalledTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastCallDirection", "lastCallDirection", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcome", "lastCallOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcomeNature", "lastCallOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCallUserId", "lastCallUserId", null, true, customType, Collections.emptyList()), ResponseField.forInt("lastCallDuration", "lastCallDuration", null, true, Collections.emptyList()), ResponseField.forString("lastCallEngagementId", "lastCallEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitTime", "lastVisitTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastVisitOutcome", "lastVisitOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastVisitOutcomeNature", "lastVisitOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitUserId", "lastVisitUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastVisitEngagementId", "lastVisitEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastEmailTime", "lastEmailTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEmailUserId", "lastEmailUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastEmailEngagementId", "lastEmailEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappTime", "lastWhatsappTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappUserId", "lastWhatsappUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastWhatsappEngagementId", "lastWhatsappEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastTime", "lastWabaBroadcastTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastStatus", "lastWabaBroadcastStatus", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastTemplate", "lastWabaBroadcastTemplate", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyBody", "lastWabaBroadcastReplyBody", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastReplyTime", "lastWabaBroadcastReplyTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyType", "lastWabaBroadcastReplyType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastSmsTime", "lastSmsTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastSmsUserId", "lastSmsUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastSmsEngagementId", "lastSmsEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastNoteAddedTime", "lastNoteAddedTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastNoteUserId", "lastNoteUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastNoteEngagementId", "lastNoteEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneTime", "lastTaskDoneTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneUserId", "lastTaskDoneUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastTaskDoneEngagementId", "lastTaskDoneEngagementId", null, true, Collections.emptyList()), ResponseField.forInt("openTaskCount", "openTaskCount", null, true, Collections.emptyList()), ResponseField.forString("lastKnownDisposition", "lastKnownDisposition", null, true, Collections.emptyList()), ResponseField.forCustomType("lastKnownDispositionTime", "lastKnownDispositionTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastLeadAssignmentDateTime", "lastLeadAssignmentDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromAccount", "lastEngagementFromAccount", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromContact", "lastEngagementFromContact", null, true, customType2, Collections.emptyList()), ResponseField.forString("freshLeadTag", "freshLeadTag", null, true, Collections.emptyList()), ResponseField.forString("noWorkAfterAssignment", "noWorkAfterAssignment", null, true, Collections.emptyList()), ResponseField.forString("needFollowUpTag", "needFollowUpTag", null, true, Collections.emptyList()), ResponseField.forCustomType("needFollowUpTagUpdatedAt", "needFollowUpTagUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("activeDealStage", "activeDealStage", null, true, Collections.emptyList()), ResponseField.forCustomType("activeDealStageUpdatedAt", "activeDealStageUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealDescription", "dealDescription", null, true, Collections.emptyList()), ResponseField.forString("isCustomer", "isCustomer", null, true, Collections.emptyList()), ResponseField.forCustomType("becameCustomerOn", "becameCustomerOn", null, true, customType2, Collections.emptyList()), ResponseField.forInt("unsuccessfulCallAttempts", "unsuccessfulCallAttempts", null, true, Collections.emptyList()), ResponseField.forInt("leadCallsNotAnswered", "leadCallsNotAnswered", null, true, Collections.emptyList()), ResponseField.forList("userDefinedTags", "userDefinedTags", null, true, Collections.emptyList()), ResponseField.forList("productService", "productService", null, true, Collections.emptyList()), ResponseField.forString("bulkUploadReference", "bulkUploadReference", null, true, Collections.emptyList()), ResponseField.forString("assignmentMethod", "assignmentMethod", null, true, Collections.emptyList()), ResponseField.forString("whatsappOptInStatus", "whatsappOptInStatus", null, true, Collections.emptyList()), ResponseField.forList("recentEngagements", "recentEngagements", null, true, Collections.emptyList()), ResponseField.forCustomType("recentEngagementsUpdatedAt", "recentEngagementsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("openTaskDetail", "openTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("openVideoCallDetail", "openVideoCallDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetail", "lastClosedTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetailUpdatedAt", "lastClosedTaskDetailUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("latestRemark", "latestRemark", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customAttributes", "customAttributes", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("paymentRequestDetail", "paymentRequestDetail", null, true, customType3, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("customDataAddedFromAddContactForm", "customDataAddedFromAddContactForm", null, true, customType3, Collections.emptyList()), ResponseField.forString("leadLifecycleStage", "leadLifecycleStage", null, true, Collections.emptyList()), ResponseField.forString("leadLifecycleStageSubCategory", "leadLifecycleStageSubCategory", null, true, Collections.emptyList()), ResponseField.forString("manualClosedReason", "manualClosedReason", null, true, Collections.emptyList()), ResponseField.forString("lastDealStageType", "lastDealStageType", null, true, Collections.emptyList()), ResponseField.forInt("prospectingAttempts", "prospectingAttempts", null, true, Collections.emptyList()), ResponseField.forInt("totalProspectingAttemptsAcrossRechurn", "totalProspectingAttemptsAcrossRechurn", null, true, Collections.emptyList()), ResponseField.forInt("numberOfTimesRechurned", "numberOfTimesRechurned", null, true, Collections.emptyList()), ResponseField.forCustomType("lastProspectingDoneOn", "lastProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("firstProspectingDoneOn", "firstProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextProspectingDueOn", "nextProspectingDueOn", null, true, customType2, Collections.emptyList()), ResponseField.forString("nextProspectingSetBy", "nextProspectingSetBy", null, true, Collections.emptyList()), ResponseField.forString("nextProspectingNote", "nextProspectingNote", null, true, Collections.emptyList()), ResponseField.forCustomType("movedToOpportunityOn", "movedToOpportunityOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("movedToClosedOn", "movedToClosedOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public BillingContact(String str, String str2, String str3, String str4, ContactAssignmentStatus contactAssignmentStatus, List<String> list, String str5, List<String> list2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ContactStatus contactStatus, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, Boolean bool2, String str27, String str28, List<Day> list3, String str29, String str30, String str31, Seniority seniority, String str32, Boolean bool3, TaskActivityType taskActivityType, String str33, CallDirection callDirection, String str34, String str35, String str36, Integer num, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, Integer num2, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, Integer num3, Integer num4, List<String> list4, List<String> list5, String str78, String str79, String str80, List<String> list6, String str81, String str82, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, LeadLifecycleStage leadLifecycleStage, LeadLifecycleStageSubCategory leadLifecycleStageSubCategory, String str91, String str92, Integer num5, Integer num6, Integer num7, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101) {
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
            if (!(obj instanceof BillingContact)) {
                return false;
            }
            BillingContact billingContact = (BillingContact) obj;
            if (this.__typename.equals(billingContact.__typename) && this.id.equals(billingContact.id) && this.accountId.equals(billingContact.accountId) && ((str = this.ownerId) != null ? str.equals(billingContact.ownerId) : billingContact.ownerId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(billingContact.toBeAssigned) : billingContact.toBeAssigned == null) && ((list = this.sharedOwners) != null ? list.equals(billingContact.sharedOwners) : billingContact.sharedOwners == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(billingContact.primaryTeamId) : billingContact.primaryTeamId == null) && ((list2 = this.sharedTeams) != null ? list2.equals(billingContact.sharedTeams) : billingContact.sharedTeams == null) && ((str3 = this.accountPriority) != null ? str3.equals(billingContact.accountPriority) : billingContact.accountPriority == null) && ((str4 = this.addedById) != null ? str4.equals(billingContact.addedById) : billingContact.addedById == null) && ((str5 = this.assignedToId) != null ? str5.equals(billingContact.assignedToId) : billingContact.assignedToId == null) && ((str6 = this.blockedForCallById) != null ? str6.equals(billingContact.blockedForCallById) : billingContact.blockedForCallById == null) && ((str7 = this.blockedForCallReason) != null ? str7.equals(billingContact.blockedForCallReason) : billingContact.blockedForCallReason == null) && ((str8 = this.blockedForCallUntil) != null ? str8.equals(billingContact.blockedForCallUntil) : billingContact.blockedForCallUntil == null) && ((str9 = this.callPriority) != null ? str9.equals(billingContact.callPriority) : billingContact.callPriority == null) && ((str10 = this.waChatChannelId) != null ? str10.equals(billingContact.waChatChannelId) : billingContact.waChatChannelId == null) && ((str11 = this.contactSource) != null ? str11.equals(billingContact.contactSource) : billingContact.contactSource == null) && ((str12 = this.contactSourceDrillDownOne) != null ? str12.equals(billingContact.contactSourceDrillDownOne) : billingContact.contactSourceDrillDownOne == null) && ((str13 = this.contactSourceDrillDownTwo) != null ? str13.equals(billingContact.contactSourceDrillDownTwo) : billingContact.contactSourceDrillDownTwo == null) && ((str14 = this.contactSourceDrillDownThree) != null ? str14.equals(billingContact.contactSourceDrillDownThree) : billingContact.contactSourceDrillDownThree == null) && ((str15 = this.contactSourceDrillDownOneId) != null ? str15.equals(billingContact.contactSourceDrillDownOneId) : billingContact.contactSourceDrillDownOneId == null) && ((str16 = this.contactSourceDrillDownTwoId) != null ? str16.equals(billingContact.contactSourceDrillDownTwoId) : billingContact.contactSourceDrillDownTwoId == null) && ((str17 = this.contactSourceDrillDownThreeId) != null ? str17.equals(billingContact.contactSourceDrillDownThreeId) : billingContact.contactSourceDrillDownThreeId == null) && ((contactStatus = this.contactStatus) != null ? contactStatus.equals(billingContact.contactStatus) : billingContact.contactStatus == null) && ((str18 = this.contactType) != null ? str18.equals(billingContact.contactType) : billingContact.contactType == null) && ((str19 = this.department) != null ? str19.equals(billingContact.department) : billingContact.department == null) && ((str20 = this.designation) != null ? str20.equals(billingContact.designation) : billingContact.designation == null) && ((str21 = this.lastRepeatEnquiryDate) != null ? str21.equals(billingContact.lastRepeatEnquiryDate) : billingContact.lastRepeatEnquiryDate == null) && ((str22 = this.lastRepeatEnquirySource) != null ? str22.equals(billingContact.lastRepeatEnquirySource) : billingContact.lastRepeatEnquirySource == null) && ((str23 = this.gender) != null ? str23.equals(billingContact.gender) : billingContact.gender == null) && ((bool = this.isDecisionMaker) != null ? bool.equals(billingContact.isDecisionMaker) : billingContact.isDecisionMaker == null) && ((bool2 = this.isPrivate) != null ? bool2.equals(billingContact.isPrivate) : billingContact.isPrivate == null) && ((str24 = this.lockPeriod) != null ? str24.equals(billingContact.lockPeriod) : billingContact.lockPeriod == null) && ((str25 = this.name) != null ? str25.equals(billingContact.name) : billingContact.name == null) && ((list3 = this.preferredContactDays) != null ? list3.equals(billingContact.preferredContactDays) : billingContact.preferredContactDays == null) && ((str26 = this.profilePhotoUrl) != null ? str26.equals(billingContact.profilePhotoUrl) : billingContact.profilePhotoUrl == null) && ((str27 = this.referredBy) != null ? str27.equals(billingContact.referredBy) : billingContact.referredBy == null) && ((str28 = this.salutation) != null ? str28.equals(billingContact.salutation) : billingContact.salutation == null) && ((seniority = this.seniority) != null ? seniority.equals(billingContact.seniority) : billingContact.seniority == null) && ((str29 = this.updatedById) != null ? str29.equals(billingContact.updatedById) : billingContact.updatedById == null) && ((bool3 = this.hasTask) != null ? bool3.equals(billingContact.hasTask) : billingContact.hasTask == null) && ((taskActivityType = this.openTaskActivityType) != null ? taskActivityType.equals(billingContact.openTaskActivityType) : billingContact.openTaskActivityType == null) && ((str30 = this.lastCalledTime) != null ? str30.equals(billingContact.lastCalledTime) : billingContact.lastCalledTime == null) && ((callDirection = this.lastCallDirection) != null ? callDirection.equals(billingContact.lastCallDirection) : billingContact.lastCallDirection == null) && ((str31 = this.lastCallOutcome) != null ? str31.equals(billingContact.lastCallOutcome) : billingContact.lastCallOutcome == null) && ((str32 = this.lastCallOutcomeNature) != null ? str32.equals(billingContact.lastCallOutcomeNature) : billingContact.lastCallOutcomeNature == null) && ((str33 = this.lastCallUserId) != null ? str33.equals(billingContact.lastCallUserId) : billingContact.lastCallUserId == null) && ((num = this.lastCallDuration) != null ? num.equals(billingContact.lastCallDuration) : billingContact.lastCallDuration == null) && ((str34 = this.lastCallEngagementId) != null ? str34.equals(billingContact.lastCallEngagementId) : billingContact.lastCallEngagementId == null) && ((str35 = this.lastVisitTime) != null ? str35.equals(billingContact.lastVisitTime) : billingContact.lastVisitTime == null) && ((str36 = this.lastVisitOutcome) != null ? str36.equals(billingContact.lastVisitOutcome) : billingContact.lastVisitOutcome == null) && ((str37 = this.lastVisitOutcomeNature) != null ? str37.equals(billingContact.lastVisitOutcomeNature) : billingContact.lastVisitOutcomeNature == null) && ((str38 = this.lastVisitUserId) != null ? str38.equals(billingContact.lastVisitUserId) : billingContact.lastVisitUserId == null) && ((str39 = this.lastVisitEngagementId) != null ? str39.equals(billingContact.lastVisitEngagementId) : billingContact.lastVisitEngagementId == null) && ((str40 = this.lastEmailTime) != null ? str40.equals(billingContact.lastEmailTime) : billingContact.lastEmailTime == null) && ((str41 = this.lastEmailUserId) != null ? str41.equals(billingContact.lastEmailUserId) : billingContact.lastEmailUserId == null) && ((str42 = this.lastEmailEngagementId) != null ? str42.equals(billingContact.lastEmailEngagementId) : billingContact.lastEmailEngagementId == null) && ((str43 = this.lastWhatsappTime) != null ? str43.equals(billingContact.lastWhatsappTime) : billingContact.lastWhatsappTime == null) && ((str44 = this.lastWhatsappUserId) != null ? str44.equals(billingContact.lastWhatsappUserId) : billingContact.lastWhatsappUserId == null) && ((str45 = this.lastWhatsappEngagementId) != null ? str45.equals(billingContact.lastWhatsappEngagementId) : billingContact.lastWhatsappEngagementId == null) && ((str46 = this.lastWabaBroadcastTime) != null ? str46.equals(billingContact.lastWabaBroadcastTime) : billingContact.lastWabaBroadcastTime == null) && ((str47 = this.lastWabaBroadcastStatus) != null ? str47.equals(billingContact.lastWabaBroadcastStatus) : billingContact.lastWabaBroadcastStatus == null) && ((str48 = this.lastWabaBroadcastTemplate) != null ? str48.equals(billingContact.lastWabaBroadcastTemplate) : billingContact.lastWabaBroadcastTemplate == null) && ((str49 = this.lastWabaBroadcastReplyBody) != null ? str49.equals(billingContact.lastWabaBroadcastReplyBody) : billingContact.lastWabaBroadcastReplyBody == null) && ((str50 = this.lastWabaBroadcastReplyTime) != null ? str50.equals(billingContact.lastWabaBroadcastReplyTime) : billingContact.lastWabaBroadcastReplyTime == null) && ((str51 = this.lastWabaBroadcastReplyType) != null ? str51.equals(billingContact.lastWabaBroadcastReplyType) : billingContact.lastWabaBroadcastReplyType == null) && ((str52 = this.lastSmsTime) != null ? str52.equals(billingContact.lastSmsTime) : billingContact.lastSmsTime == null) && ((str53 = this.lastSmsUserId) != null ? str53.equals(billingContact.lastSmsUserId) : billingContact.lastSmsUserId == null) && ((str54 = this.lastSmsEngagementId) != null ? str54.equals(billingContact.lastSmsEngagementId) : billingContact.lastSmsEngagementId == null) && ((str55 = this.lastNoteAddedTime) != null ? str55.equals(billingContact.lastNoteAddedTime) : billingContact.lastNoteAddedTime == null) && ((str56 = this.lastNoteUserId) != null ? str56.equals(billingContact.lastNoteUserId) : billingContact.lastNoteUserId == null) && ((str57 = this.lastNoteEngagementId) != null ? str57.equals(billingContact.lastNoteEngagementId) : billingContact.lastNoteEngagementId == null) && ((str58 = this.lastTaskDoneTime) != null ? str58.equals(billingContact.lastTaskDoneTime) : billingContact.lastTaskDoneTime == null) && ((str59 = this.lastTaskDoneUserId) != null ? str59.equals(billingContact.lastTaskDoneUserId) : billingContact.lastTaskDoneUserId == null) && ((str60 = this.lastTaskDoneEngagementId) != null ? str60.equals(billingContact.lastTaskDoneEngagementId) : billingContact.lastTaskDoneEngagementId == null) && ((num2 = this.openTaskCount) != null ? num2.equals(billingContact.openTaskCount) : billingContact.openTaskCount == null) && ((str61 = this.lastKnownDisposition) != null ? str61.equals(billingContact.lastKnownDisposition) : billingContact.lastKnownDisposition == null) && ((str62 = this.lastKnownDispositionTime) != null ? str62.equals(billingContact.lastKnownDispositionTime) : billingContact.lastKnownDispositionTime == null) && ((str63 = this.lastLeadAssignmentDateTime) != null ? str63.equals(billingContact.lastLeadAssignmentDateTime) : billingContact.lastLeadAssignmentDateTime == null) && ((str64 = this.lastEngagementFromAccount) != null ? str64.equals(billingContact.lastEngagementFromAccount) : billingContact.lastEngagementFromAccount == null) && ((str65 = this.lastEngagementFromContact) != null ? str65.equals(billingContact.lastEngagementFromContact) : billingContact.lastEngagementFromContact == null) && ((str66 = this.freshLeadTag) != null ? str66.equals(billingContact.freshLeadTag) : billingContact.freshLeadTag == null) && ((str67 = this.noWorkAfterAssignment) != null ? str67.equals(billingContact.noWorkAfterAssignment) : billingContact.noWorkAfterAssignment == null) && ((str68 = this.needFollowUpTag) != null ? str68.equals(billingContact.needFollowUpTag) : billingContact.needFollowUpTag == null) && ((str69 = this.needFollowUpTagUpdatedAt) != null ? str69.equals(billingContact.needFollowUpTagUpdatedAt) : billingContact.needFollowUpTagUpdatedAt == null) && ((str70 = this.activeDealStage) != null ? str70.equals(billingContact.activeDealStage) : billingContact.activeDealStage == null) && ((str71 = this.activeDealStageUpdatedAt) != null ? str71.equals(billingContact.activeDealStageUpdatedAt) : billingContact.activeDealStageUpdatedAt == null) && ((str72 = this.dealDescription) != null ? str72.equals(billingContact.dealDescription) : billingContact.dealDescription == null) && ((str73 = this.isCustomer) != null ? str73.equals(billingContact.isCustomer) : billingContact.isCustomer == null) && ((str74 = this.becameCustomerOn) != null ? str74.equals(billingContact.becameCustomerOn) : billingContact.becameCustomerOn == null) && ((num3 = this.unsuccessfulCallAttempts) != null ? num3.equals(billingContact.unsuccessfulCallAttempts) : billingContact.unsuccessfulCallAttempts == null) && ((num4 = this.leadCallsNotAnswered) != null ? num4.equals(billingContact.leadCallsNotAnswered) : billingContact.leadCallsNotAnswered == null) && ((list4 = this.userDefinedTags) != null ? list4.equals(billingContact.userDefinedTags) : billingContact.userDefinedTags == null) && ((list5 = this.productService) != null ? list5.equals(billingContact.productService) : billingContact.productService == null) && ((str75 = this.bulkUploadReference) != null ? str75.equals(billingContact.bulkUploadReference) : billingContact.bulkUploadReference == null) && ((str76 = this.assignmentMethod) != null ? str76.equals(billingContact.assignmentMethod) : billingContact.assignmentMethod == null) && ((str77 = this.whatsappOptInStatus) != null ? str77.equals(billingContact.whatsappOptInStatus) : billingContact.whatsappOptInStatus == null) && ((list6 = this.recentEngagements) != null ? list6.equals(billingContact.recentEngagements) : billingContact.recentEngagements == null) && ((str78 = this.recentEngagementsUpdatedAt) != null ? str78.equals(billingContact.recentEngagementsUpdatedAt) : billingContact.recentEngagementsUpdatedAt == null) && ((str79 = this.openTaskDetail) != null ? str79.equals(billingContact.openTaskDetail) : billingContact.openTaskDetail == null) && ((str80 = this.openVideoCallDetail) != null ? str80.equals(billingContact.openVideoCallDetail) : billingContact.openVideoCallDetail == null) && ((str81 = this.lastClosedTaskDetail) != null ? str81.equals(billingContact.lastClosedTaskDetail) : billingContact.lastClosedTaskDetail == null) && ((str82 = this.lastClosedTaskDetailUpdatedAt) != null ? str82.equals(billingContact.lastClosedTaskDetailUpdatedAt) : billingContact.lastClosedTaskDetailUpdatedAt == null) && ((str83 = this.latestRemark) != null ? str83.equals(billingContact.latestRemark) : billingContact.latestRemark == null) && ((str84 = this.customAttributes) != null ? str84.equals(billingContact.customAttributes) : billingContact.customAttributes == null) && ((str85 = this.paymentRequestDetail) != null ? str85.equals(billingContact.paymentRequestDetail) : billingContact.paymentRequestDetail == null) && ((str86 = this.lastPaymentStatus) != null ? str86.equals(billingContact.lastPaymentStatus) : billingContact.lastPaymentStatus == null) && ((str87 = this.customDataAddedFromAddContactForm) != null ? str87.equals(billingContact.customDataAddedFromAddContactForm) : billingContact.customDataAddedFromAddContactForm == null) && ((leadLifecycleStage = this.leadLifecycleStage) != null ? leadLifecycleStage.equals(billingContact.leadLifecycleStage) : billingContact.leadLifecycleStage == null) && ((leadLifecycleStageSubCategory = this.leadLifecycleStageSubCategory) != null ? leadLifecycleStageSubCategory.equals(billingContact.leadLifecycleStageSubCategory) : billingContact.leadLifecycleStageSubCategory == null) && ((str88 = this.manualClosedReason) != null ? str88.equals(billingContact.manualClosedReason) : billingContact.manualClosedReason == null) && ((str89 = this.lastDealStageType) != null ? str89.equals(billingContact.lastDealStageType) : billingContact.lastDealStageType == null) && ((num5 = this.prospectingAttempts) != null ? num5.equals(billingContact.prospectingAttempts) : billingContact.prospectingAttempts == null) && ((num6 = this.totalProspectingAttemptsAcrossRechurn) != null ? num6.equals(billingContact.totalProspectingAttemptsAcrossRechurn) : billingContact.totalProspectingAttemptsAcrossRechurn == null) && ((num7 = this.numberOfTimesRechurned) != null ? num7.equals(billingContact.numberOfTimesRechurned) : billingContact.numberOfTimesRechurned == null) && ((str90 = this.lastProspectingDoneOn) != null ? str90.equals(billingContact.lastProspectingDoneOn) : billingContact.lastProspectingDoneOn == null) && ((str91 = this.firstProspectingDoneOn) != null ? str91.equals(billingContact.firstProspectingDoneOn) : billingContact.firstProspectingDoneOn == null) && ((str92 = this.nextProspectingDueOn) != null ? str92.equals(billingContact.nextProspectingDueOn) : billingContact.nextProspectingDueOn == null) && ((str93 = this.nextProspectingSetBy) != null ? str93.equals(billingContact.nextProspectingSetBy) : billingContact.nextProspectingSetBy == null) && ((str94 = this.nextProspectingNote) != null ? str94.equals(billingContact.nextProspectingNote) : billingContact.nextProspectingNote == null) && ((str95 = this.movedToOpportunityOn) != null ? str95.equals(billingContact.movedToOpportunityOn) : billingContact.movedToOpportunityOn == null) && ((str96 = this.movedToClosedOn) != null ? str96.equals(billingContact.movedToClosedOn) : billingContact.movedToClosedOn == null) && ((str97 = this.createdAt) != null ? str97.equals(billingContact.createdAt) : billingContact.createdAt == null)) {
                String str98 = this.updatedAt;
                String str99 = billingContact.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = BillingContact.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], BillingContact.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], BillingContact.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], BillingContact.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], BillingContact.this.ownerId);
                    ResponseField responseField = responseFieldArr[4];
                    ContactAssignmentStatus contactAssignmentStatus = BillingContact.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeList(responseFieldArr[5], BillingContact.this.sharedOwners, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], BillingContact.this.primaryTeamId);
                    responseWriter.writeList(responseFieldArr[7], BillingContact.this.sharedTeams, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[8], BillingContact.this.accountPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], BillingContact.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], BillingContact.this.assignedToId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], BillingContact.this.blockedForCallById);
                    responseWriter.writeString(responseFieldArr[12], BillingContact.this.blockedForCallReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], BillingContact.this.blockedForCallUntil);
                    responseWriter.writeString(responseFieldArr[14], BillingContact.this.callPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], BillingContact.this.waChatChannelId);
                    responseWriter.writeString(responseFieldArr[16], BillingContact.this.contactSource);
                    responseWriter.writeString(responseFieldArr[17], BillingContact.this.contactSourceDrillDownOne);
                    responseWriter.writeString(responseFieldArr[18], BillingContact.this.contactSourceDrillDownTwo);
                    responseWriter.writeString(responseFieldArr[19], BillingContact.this.contactSourceDrillDownThree);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], BillingContact.this.contactSourceDrillDownOneId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], BillingContact.this.contactSourceDrillDownTwoId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], BillingContact.this.contactSourceDrillDownThreeId);
                    ResponseField responseField2 = responseFieldArr[23];
                    ContactStatus contactStatus = BillingContact.this.contactStatus;
                    responseWriter.writeString(responseField2, contactStatus != null ? contactStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[24], BillingContact.this.contactType);
                    responseWriter.writeString(responseFieldArr[25], BillingContact.this.department);
                    responseWriter.writeString(responseFieldArr[26], BillingContact.this.designation);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], BillingContact.this.lastRepeatEnquiryDate);
                    responseWriter.writeString(responseFieldArr[28], BillingContact.this.lastRepeatEnquirySource);
                    responseWriter.writeString(responseFieldArr[29], BillingContact.this.gender);
                    responseWriter.writeBoolean(responseFieldArr[30], BillingContact.this.isDecisionMaker);
                    responseWriter.writeBoolean(responseFieldArr[31], BillingContact.this.isPrivate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], BillingContact.this.lockPeriod);
                    responseWriter.writeString(responseFieldArr[33], BillingContact.this.name);
                    responseWriter.writeList(responseFieldArr[34], BillingContact.this.preferredContactDays, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((Day) obj).name());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[35], BillingContact.this.profilePhotoUrl);
                    responseWriter.writeString(responseFieldArr[36], BillingContact.this.referredBy);
                    responseWriter.writeString(responseFieldArr[37], BillingContact.this.salutation);
                    ResponseField responseField3 = responseFieldArr[38];
                    Seniority seniority = BillingContact.this.seniority;
                    responseWriter.writeString(responseField3, seniority != null ? seniority.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], BillingContact.this.updatedById);
                    responseWriter.writeBoolean(responseFieldArr[40], BillingContact.this.hasTask);
                    ResponseField responseField4 = responseFieldArr[41];
                    TaskActivityType taskActivityType = BillingContact.this.openTaskActivityType;
                    responseWriter.writeString(responseField4, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], BillingContact.this.lastCalledTime);
                    ResponseField responseField5 = responseFieldArr[43];
                    CallDirection callDirection = BillingContact.this.lastCallDirection;
                    responseWriter.writeString(responseField5, callDirection != null ? callDirection.name() : null);
                    responseWriter.writeString(responseFieldArr[44], BillingContact.this.lastCallOutcome);
                    responseWriter.writeString(responseFieldArr[45], BillingContact.this.lastCallOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[46], BillingContact.this.lastCallUserId);
                    responseWriter.writeInt(responseFieldArr[47], BillingContact.this.lastCallDuration);
                    responseWriter.writeString(responseFieldArr[48], BillingContact.this.lastCallEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[49], BillingContact.this.lastVisitTime);
                    responseWriter.writeString(responseFieldArr[50], BillingContact.this.lastVisitOutcome);
                    responseWriter.writeString(responseFieldArr[51], BillingContact.this.lastVisitOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], BillingContact.this.lastVisitUserId);
                    responseWriter.writeString(responseFieldArr[53], BillingContact.this.lastVisitEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], BillingContact.this.lastEmailTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], BillingContact.this.lastEmailUserId);
                    responseWriter.writeString(responseFieldArr[56], BillingContact.this.lastEmailEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[57], BillingContact.this.lastWhatsappTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], BillingContact.this.lastWhatsappUserId);
                    responseWriter.writeString(responseFieldArr[59], BillingContact.this.lastWhatsappEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[60], BillingContact.this.lastWabaBroadcastTime);
                    responseWriter.writeString(responseFieldArr[61], BillingContact.this.lastWabaBroadcastStatus);
                    responseWriter.writeString(responseFieldArr[62], BillingContact.this.lastWabaBroadcastTemplate);
                    responseWriter.writeString(responseFieldArr[63], BillingContact.this.lastWabaBroadcastReplyBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[64], BillingContact.this.lastWabaBroadcastReplyTime);
                    responseWriter.writeString(responseFieldArr[65], BillingContact.this.lastWabaBroadcastReplyType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[66], BillingContact.this.lastSmsTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[67], BillingContact.this.lastSmsUserId);
                    responseWriter.writeString(responseFieldArr[68], BillingContact.this.lastSmsEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[69], BillingContact.this.lastNoteAddedTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[70], BillingContact.this.lastNoteUserId);
                    responseWriter.writeString(responseFieldArr[71], BillingContact.this.lastNoteEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], BillingContact.this.lastTaskDoneTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], BillingContact.this.lastTaskDoneUserId);
                    responseWriter.writeString(responseFieldArr[74], BillingContact.this.lastTaskDoneEngagementId);
                    responseWriter.writeInt(responseFieldArr[75], BillingContact.this.openTaskCount);
                    responseWriter.writeString(responseFieldArr[76], BillingContact.this.lastKnownDisposition);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[77], BillingContact.this.lastKnownDispositionTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[78], BillingContact.this.lastLeadAssignmentDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[79], BillingContact.this.lastEngagementFromAccount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[80], BillingContact.this.lastEngagementFromContact);
                    responseWriter.writeString(responseFieldArr[81], BillingContact.this.freshLeadTag);
                    responseWriter.writeString(responseFieldArr[82], BillingContact.this.noWorkAfterAssignment);
                    responseWriter.writeString(responseFieldArr[83], BillingContact.this.needFollowUpTag);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[84], BillingContact.this.needFollowUpTagUpdatedAt);
                    responseWriter.writeString(responseFieldArr[85], BillingContact.this.activeDealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[86], BillingContact.this.activeDealStageUpdatedAt);
                    responseWriter.writeString(responseFieldArr[87], BillingContact.this.dealDescription);
                    responseWriter.writeString(responseFieldArr[88], BillingContact.this.isCustomer);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[89], BillingContact.this.becameCustomerOn);
                    responseWriter.writeInt(responseFieldArr[90], BillingContact.this.unsuccessfulCallAttempts);
                    responseWriter.writeInt(responseFieldArr[91], BillingContact.this.leadCallsNotAnswered);
                    responseWriter.writeList(responseFieldArr[92], BillingContact.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[93], BillingContact.this.productService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[94], BillingContact.this.bulkUploadReference);
                    responseWriter.writeString(responseFieldArr[95], BillingContact.this.assignmentMethod);
                    responseWriter.writeString(responseFieldArr[96], BillingContact.this.whatsappOptInStatus);
                    responseWriter.writeList(responseFieldArr[97], BillingContact.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.BillingContact.1.6
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[98], BillingContact.this.recentEngagementsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[99], BillingContact.this.openTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[100], BillingContact.this.openVideoCallDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[101], BillingContact.this.lastClosedTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[102], BillingContact.this.lastClosedTaskDetailUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[103], BillingContact.this.latestRemark);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[104], BillingContact.this.customAttributes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[105], BillingContact.this.paymentRequestDetail);
                    responseWriter.writeString(responseFieldArr[106], BillingContact.this.lastPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[107], BillingContact.this.customDataAddedFromAddContactForm);
                    ResponseField responseField6 = responseFieldArr[108];
                    LeadLifecycleStage leadLifecycleStage = BillingContact.this.leadLifecycleStage;
                    responseWriter.writeString(responseField6, leadLifecycleStage != null ? leadLifecycleStage.name() : null);
                    ResponseField responseField7 = responseFieldArr[109];
                    LeadLifecycleStageSubCategory leadLifecycleStageSubCategory = BillingContact.this.leadLifecycleStageSubCategory;
                    responseWriter.writeString(responseField7, leadLifecycleStageSubCategory != null ? leadLifecycleStageSubCategory.name() : null);
                    responseWriter.writeString(responseFieldArr[110], BillingContact.this.manualClosedReason);
                    responseWriter.writeString(responseFieldArr[111], BillingContact.this.lastDealStageType);
                    responseWriter.writeInt(responseFieldArr[112], BillingContact.this.prospectingAttempts);
                    responseWriter.writeInt(responseFieldArr[113], BillingContact.this.totalProspectingAttemptsAcrossRechurn);
                    responseWriter.writeInt(responseFieldArr[114], BillingContact.this.numberOfTimesRechurned);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[115], BillingContact.this.lastProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[116], BillingContact.this.firstProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[117], BillingContact.this.nextProspectingDueOn);
                    responseWriter.writeString(responseFieldArr[118], BillingContact.this.nextProspectingSetBy);
                    responseWriter.writeString(responseFieldArr[119], BillingContact.this.nextProspectingNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[120], BillingContact.this.movedToOpportunityOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[121], BillingContact.this.movedToClosedOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[122], BillingContact.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[123], BillingContact.this.updatedAt);
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
                this.$toString = "BillingContact{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", toBeAssigned=" + this.toBeAssigned + ", sharedOwners=" + this.sharedOwners + ", primaryTeamId=" + this.primaryTeamId + ", sharedTeams=" + this.sharedTeams + ", accountPriority=" + this.accountPriority + ", addedById=" + this.addedById + ", assignedToId=" + this.assignedToId + ", blockedForCallById=" + this.blockedForCallById + ", blockedForCallReason=" + this.blockedForCallReason + ", blockedForCallUntil=" + this.blockedForCallUntil + ", callPriority=" + this.callPriority + ", waChatChannelId=" + this.waChatChannelId + ", contactSource=" + this.contactSource + ", contactSourceDrillDownOne=" + this.contactSourceDrillDownOne + ", contactSourceDrillDownTwo=" + this.contactSourceDrillDownTwo + ", contactSourceDrillDownThree=" + this.contactSourceDrillDownThree + ", contactSourceDrillDownOneId=" + this.contactSourceDrillDownOneId + ", contactSourceDrillDownTwoId=" + this.contactSourceDrillDownTwoId + ", contactSourceDrillDownThreeId=" + this.contactSourceDrillDownThreeId + ", contactStatus=" + this.contactStatus + ", contactType=" + this.contactType + ", department=" + this.department + ", designation=" + this.designation + ", lastRepeatEnquiryDate=" + this.lastRepeatEnquiryDate + ", lastRepeatEnquirySource=" + this.lastRepeatEnquirySource + ", gender=" + this.gender + ", isDecisionMaker=" + this.isDecisionMaker + ", isPrivate=" + this.isPrivate + ", lockPeriod=" + this.lockPeriod + ", name=" + this.name + ", preferredContactDays=" + this.preferredContactDays + ", profilePhotoUrl=" + this.profilePhotoUrl + ", referredBy=" + this.referredBy + ", salutation=" + this.salutation + ", seniority=" + this.seniority + ", updatedById=" + this.updatedById + ", hasTask=" + this.hasTask + ", openTaskActivityType=" + this.openTaskActivityType + ", lastCalledTime=" + this.lastCalledTime + ", lastCallDirection=" + this.lastCallDirection + ", lastCallOutcome=" + this.lastCallOutcome + ", lastCallOutcomeNature=" + this.lastCallOutcomeNature + ", lastCallUserId=" + this.lastCallUserId + ", lastCallDuration=" + this.lastCallDuration + ", lastCallEngagementId=" + this.lastCallEngagementId + ", lastVisitTime=" + this.lastVisitTime + ", lastVisitOutcome=" + this.lastVisitOutcome + ", lastVisitOutcomeNature=" + this.lastVisitOutcomeNature + ", lastVisitUserId=" + this.lastVisitUserId + ", lastVisitEngagementId=" + this.lastVisitEngagementId + ", lastEmailTime=" + this.lastEmailTime + ", lastEmailUserId=" + this.lastEmailUserId + ", lastEmailEngagementId=" + this.lastEmailEngagementId + ", lastWhatsappTime=" + this.lastWhatsappTime + ", lastWhatsappUserId=" + this.lastWhatsappUserId + ", lastWhatsappEngagementId=" + this.lastWhatsappEngagementId + ", lastWabaBroadcastTime=" + this.lastWabaBroadcastTime + ", lastWabaBroadcastStatus=" + this.lastWabaBroadcastStatus + ", lastWabaBroadcastTemplate=" + this.lastWabaBroadcastTemplate + ", lastWabaBroadcastReplyBody=" + this.lastWabaBroadcastReplyBody + ", lastWabaBroadcastReplyTime=" + this.lastWabaBroadcastReplyTime + ", lastWabaBroadcastReplyType=" + this.lastWabaBroadcastReplyType + ", lastSmsTime=" + this.lastSmsTime + ", lastSmsUserId=" + this.lastSmsUserId + ", lastSmsEngagementId=" + this.lastSmsEngagementId + ", lastNoteAddedTime=" + this.lastNoteAddedTime + ", lastNoteUserId=" + this.lastNoteUserId + ", lastNoteEngagementId=" + this.lastNoteEngagementId + ", lastTaskDoneTime=" + this.lastTaskDoneTime + ", lastTaskDoneUserId=" + this.lastTaskDoneUserId + ", lastTaskDoneEngagementId=" + this.lastTaskDoneEngagementId + ", openTaskCount=" + this.openTaskCount + ", lastKnownDisposition=" + this.lastKnownDisposition + ", lastKnownDispositionTime=" + this.lastKnownDispositionTime + ", lastLeadAssignmentDateTime=" + this.lastLeadAssignmentDateTime + ", lastEngagementFromAccount=" + this.lastEngagementFromAccount + ", lastEngagementFromContact=" + this.lastEngagementFromContact + ", freshLeadTag=" + this.freshLeadTag + ", noWorkAfterAssignment=" + this.noWorkAfterAssignment + ", needFollowUpTag=" + this.needFollowUpTag + ", needFollowUpTagUpdatedAt=" + this.needFollowUpTagUpdatedAt + ", activeDealStage=" + this.activeDealStage + ", activeDealStageUpdatedAt=" + this.activeDealStageUpdatedAt + ", dealDescription=" + this.dealDescription + ", isCustomer=" + this.isCustomer + ", becameCustomerOn=" + this.becameCustomerOn + ", unsuccessfulCallAttempts=" + this.unsuccessfulCallAttempts + ", leadCallsNotAnswered=" + this.leadCallsNotAnswered + ", userDefinedTags=" + this.userDefinedTags + ", productService=" + this.productService + ", bulkUploadReference=" + this.bulkUploadReference + ", assignmentMethod=" + this.assignmentMethod + ", whatsappOptInStatus=" + this.whatsappOptInStatus + ", recentEngagements=" + this.recentEngagements + ", recentEngagementsUpdatedAt=" + this.recentEngagementsUpdatedAt + ", openTaskDetail=" + this.openTaskDetail + ", openVideoCallDetail=" + this.openVideoCallDetail + ", lastClosedTaskDetail=" + this.lastClosedTaskDetail + ", lastClosedTaskDetailUpdatedAt=" + this.lastClosedTaskDetailUpdatedAt + ", latestRemark=" + this.latestRemark + ", customAttributes=" + this.customAttributes + ", paymentRequestDetail=" + this.paymentRequestDetail + ", lastPaymentStatus=" + this.lastPaymentStatus + ", customDataAddedFromAddContactForm=" + this.customDataAddedFromAddContactForm + ", leadLifecycleStage=" + this.leadLifecycleStage + ", leadLifecycleStageSubCategory=" + this.leadLifecycleStageSubCategory + ", manualClosedReason=" + this.manualClosedReason + ", lastDealStageType=" + this.lastDealStageType + ", prospectingAttempts=" + this.prospectingAttempts + ", totalProspectingAttemptsAcrossRechurn=" + this.totalProspectingAttemptsAcrossRechurn + ", numberOfTimesRechurned=" + this.numberOfTimesRechurned + ", lastProspectingDoneOn=" + this.lastProspectingDoneOn + ", firstProspectingDoneOn=" + this.firstProspectingDoneOn + ", nextProspectingDueOn=" + this.nextProspectingDueOn + ", nextProspectingSetBy=" + this.nextProspectingSetBy + ", nextProspectingNote=" + this.nextProspectingNote + ", movedToOpportunityOn=" + this.movedToOpportunityOn + ", movedToClosedOn=" + this.movedToClosedOn + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static final class Builder {
        private ModelClientAccountConditionInput condition;
        private DeleteClientAccountInput input;

        public DeleteClientAccountMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteClientAccountMutation(this.input, this.condition);
        }

        public Builder condition(ModelClientAccountConditionInput modelClientAccountConditionInput) {
            this.condition = modelClientAccountConditionInput;
            return this;
        }

        public Builder input(DeleteClientAccountInput deleteClientAccountInput) {
            this.input = deleteClientAccountInput;
            return this;
        }
    }

    public static class ClientAccount {
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

        public static final class Mapper implements ResponseFieldMapper<ClientAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ClientAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ClientAccount.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                String string3 = responseReader.readString(responseFieldArr[3]);
                AccountType accountTypeValueOf = string3 != null ? AccountType.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                return new ClientAccount(string, str, string2, accountTypeValueOf, string4, str2, string5 != null ? AccountStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readString(responseFieldArr[31]), responseReader.readString(responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readInt(responseFieldArr[34]), responseReader.readBoolean(responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readList(responseFieldArr[39], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readBoolean(responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readList(responseFieldArr[45], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[46], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readList(responseFieldArr[51], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.Mapper.5
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

        public ClientAccount(String str, String str2, String str3, AccountType accountType, String str4, String str5, AccountStatus accountStatus, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<String> list, String str14, String str15, String str16, String str17, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, String str18, Integer num7, String str19, String str20, String str21, String str22, String str23, Integer num8, Boolean bool2, String str24, String str25, String str26, List<String> list2, Boolean bool3, String str27, String str28, String str29, String str30, List<String> list3, List<String> list4, String str31, String str32, String str33, String str34, List<String> list5, String str35, String str36, String str37, Double d, String str38, String str39, String str40, String str41, Integer num9) {
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
            if (!(obj instanceof ClientAccount)) {
                return false;
            }
            ClientAccount clientAccount = (ClientAccount) obj;
            if (this.__typename.equals(clientAccount.__typename) && this.id.equals(clientAccount.id) && this.accountName.equals(clientAccount.accountName) && this.accountType.equals(clientAccount.accountType) && ((str = this.deviceKey) != null ? str.equals(clientAccount.deviceKey) : clientAccount.deviceKey == null) && ((str2 = this.deviceKeyLastUpdated) != null ? str2.equals(clientAccount.deviceKeyLastUpdated) : clientAccount.deviceKeyLastUpdated == null) && ((accountStatus = this.accountStatus) != null ? accountStatus.equals(clientAccount.accountStatus) : clientAccount.accountStatus == null) && ((str3 = this.businessLogoUrl) != null ? str3.equals(clientAccount.businessLogoUrl) : clientAccount.businessLogoUrl == null) && ((str4 = this.createdById) != null ? str4.equals(clientAccount.createdById) : clientAccount.createdById == null) && ((str5 = this.dateFormat) != null ? str5.equals(clientAccount.dateFormat) : clientAccount.dateFormat == null) && ((str6 = this.dateTimeViewStyle) != null ? str6.equals(clientAccount.dateTimeViewStyle) : clientAccount.dateTimeViewStyle == null) && ((str7 = this.defaultCurrency) != null ? str7.equals(clientAccount.defaultCurrency) : clientAccount.defaultCurrency == null) && ((str8 = this.denomination) != null ? str8.equals(clientAccount.denomination) : clientAccount.denomination == null) && ((str9 = this.industry) != null ? str9.equals(clientAccount.industry) : clientAccount.industry == null) && ((str10 = this.nameOfBusiness) != null ? str10.equals(clientAccount.nameOfBusiness) : clientAccount.nameOfBusiness == null) && ((list = this.productOrService) != null ? list.equals(clientAccount.productOrService) : clientAccount.productOrService == null) && ((str11 = this.timeFormat) != null ? str11.equals(clientAccount.timeFormat) : clientAccount.timeFormat == null) && ((str12 = this.timeZone) != null ? str12.equals(clientAccount.timeZone) : clientAccount.timeZone == null) && ((str13 = this.plan) != null ? str13.equals(clientAccount.plan) : clientAccount.plan == null) && ((str14 = this.paidUpTo) != null ? str14.equals(clientAccount.paidUpTo) : clientAccount.paidUpTo == null) && ((num = this.seats) != null ? num.equals(clientAccount.seats) : clientAccount.seats == null) && ((num2 = this.freeSeats) != null ? num2.equals(clientAccount.freeSeats) : clientAccount.freeSeats == null) && ((num3 = this.currentTotalUsers) != null ? num3.equals(clientAccount.currentTotalUsers) : clientAccount.currentTotalUsers == null) && ((num4 = this.currentActiveUsers) != null ? num4.equals(clientAccount.currentActiveUsers) : clientAccount.currentActiveUsers == null) && ((num5 = this.extraActiveUsers) != null ? num5.equals(clientAccount.extraActiveUsers) : clientAccount.extraActiveUsers == null) && ((num6 = this.pricePerSeat) != null ? num6.equals(clientAccount.pricePerSeat) : clientAccount.pricePerSeat == null) && ((bool = this.allowAddingSeat) != null ? bool.equals(clientAccount.allowAddingSeat) : clientAccount.allowAddingSeat == null) && ((str15 = this.allowAddingSeatTill) != null ? str15.equals(clientAccount.allowAddingSeatTill) : clientAccount.allowAddingSeatTill == null) && ((num7 = this.seatReductionMarkedForNextCycle) != null ? num7.equals(clientAccount.seatReductionMarkedForNextCycle) : clientAccount.seatReductionMarkedForNextCycle == null) && ((str16 = this.billingCurrency) != null ? str16.equals(clientAccount.billingCurrency) : clientAccount.billingCurrency == null) && ((str17 = this.billingEmail) != null ? str17.equals(clientAccount.billingEmail) : clientAccount.billingEmail == null) && ((str18 = this.taxId) != null ? str18.equals(clientAccount.taxId) : clientAccount.taxId == null) && ((str19 = this.taxIdType) != null ? str19.equals(clientAccount.taxIdType) : clientAccount.taxIdType == null) && ((str20 = this.trialAccountEndDate) != null ? str20.equals(clientAccount.trialAccountEndDate) : clientAccount.trialAccountEndDate == null) && ((num8 = this.trialExtensionTimes) != null ? num8.equals(clientAccount.trialExtensionTimes) : clientAccount.trialExtensionTimes == null) && ((bool2 = this.eligibleForExtension) != null ? bool2.equals(clientAccount.eligibleForExtension) : clientAccount.eligibleForExtension == null) && ((str21 = this.paidForTillDate) != null ? str21.equals(clientAccount.paidForTillDate) : clientAccount.paidForTillDate == null) && ((str22 = this.updatedById) != null ? str22.equals(clientAccount.updatedById) : clientAccount.updatedById == null) && ((str23 = this.website) != null ? str23.equals(clientAccount.website) : clientAccount.website == null) && ((list2 = this.permissions) != null ? list2.equals(clientAccount.permissions) : clientAccount.permissions == null) && ((bool3 = this.enableCustomCharts) != null ? bool3.equals(clientAccount.enableCustomCharts) : clientAccount.enableCustomCharts == null) && ((str24 = this.createdAt) != null ? str24.equals(clientAccount.createdAt) : clientAccount.createdAt == null) && ((str25 = this.updatedAt) != null ? str25.equals(clientAccount.updatedAt) : clientAccount.updatedAt == null) && ((str26 = this.dealMode) != null ? str26.equals(clientAccount.dealMode) : clientAccount.dealMode == null) && ((str27 = this.openAiApiKey) != null ? str27.equals(clientAccount.openAiApiKey) : clientAccount.openAiApiKey == null) && ((list3 = this.salesmaxSalesContacts) != null ? list3.equals(clientAccount.salesmaxSalesContacts) : clientAccount.salesmaxSalesContacts == null) && ((list4 = this.salesmaxSupportContacts) != null ? list4.equals(clientAccount.salesmaxSupportContacts) : clientAccount.salesmaxSupportContacts == null) && ((str28 = this.chatWidgetConfig) != null ? str28.equals(clientAccount.chatWidgetConfig) : clientAccount.chatWidgetConfig == null) && ((str29 = this.onboardingStatus) != null ? str29.equals(clientAccount.onboardingStatus) : clientAccount.onboardingStatus == null) && ((str30 = this.integrationNeeded) != null ? str30.equals(clientAccount.integrationNeeded) : clientAccount.integrationNeeded == null) && ((str31 = this.matchingDealId) != null ? str31.equals(clientAccount.matchingDealId) : clientAccount.matchingDealId == null) && ((list5 = this.relatedAccountIds) != null ? list5.equals(clientAccount.relatedAccountIds) : clientAccount.relatedAccountIds == null) && ((str32 = this.lastChurnDate) != null ? str32.equals(clientAccount.lastChurnDate) : clientAccount.lastChurnDate == null) && ((str33 = this.lastChurnReason) != null ? str33.equals(clientAccount.lastChurnReason) : clientAccount.lastChurnReason == null) && ((str34 = this.possibleReactivationDate) != null ? str34.equals(clientAccount.possibleReactivationDate) : clientAccount.possibleReactivationDate == null) && ((d = this.locationPeriodicFrequency) != null ? d.equals(clientAccount.locationPeriodicFrequency) : clientAccount.locationPeriodicFrequency == null) && ((str35 = this.lastPaymentDataId) != null ? str35.equals(clientAccount.lastPaymentDataId) : clientAccount.lastPaymentDataId == null) && ((str36 = this.lastPaymentDataCreatedAt) != null ? str36.equals(clientAccount.lastPaymentDataCreatedAt) : clientAccount.lastPaymentDataCreatedAt == null) && ((str37 = this.nextRenewalDateIfPaid) != null ? str37.equals(clientAccount.nextRenewalDateIfPaid) : clientAccount.nextRenewalDateIfPaid == null) && ((str38 = this.lastPaymentStatus) != null ? str38.equals(clientAccount.lastPaymentStatus) : clientAccount.lastPaymentStatus == null)) {
                Integer num9 = this.partPaymentAmountIfAny;
                Integer num10 = clientAccount.partPaymentAmountIfAny;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ClientAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ClientAccount.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ClientAccount.this.id);
                    responseWriter.writeString(responseFieldArr[2], ClientAccount.this.accountName);
                    responseWriter.writeString(responseFieldArr[3], ClientAccount.this.accountType.name());
                    responseWriter.writeString(responseFieldArr[4], ClientAccount.this.deviceKey);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], ClientAccount.this.deviceKeyLastUpdated);
                    ResponseField responseField = responseFieldArr[6];
                    AccountStatus accountStatus = ClientAccount.this.accountStatus;
                    responseWriter.writeString(responseField, accountStatus != null ? accountStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[7], ClientAccount.this.businessLogoUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], ClientAccount.this.createdById);
                    responseWriter.writeString(responseFieldArr[9], ClientAccount.this.dateFormat);
                    responseWriter.writeString(responseFieldArr[10], ClientAccount.this.dateTimeViewStyle);
                    responseWriter.writeString(responseFieldArr[11], ClientAccount.this.defaultCurrency);
                    responseWriter.writeString(responseFieldArr[12], ClientAccount.this.denomination);
                    responseWriter.writeString(responseFieldArr[13], ClientAccount.this.industry);
                    responseWriter.writeString(responseFieldArr[14], ClientAccount.this.nameOfBusiness);
                    responseWriter.writeList(responseFieldArr[15], ClientAccount.this.productOrService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[16], ClientAccount.this.timeFormat);
                    responseWriter.writeString(responseFieldArr[17], ClientAccount.this.timeZone);
                    responseWriter.writeString(responseFieldArr[18], ClientAccount.this.plan);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], ClientAccount.this.paidUpTo);
                    responseWriter.writeInt(responseFieldArr[20], ClientAccount.this.seats);
                    responseWriter.writeInt(responseFieldArr[21], ClientAccount.this.freeSeats);
                    responseWriter.writeInt(responseFieldArr[22], ClientAccount.this.currentTotalUsers);
                    responseWriter.writeInt(responseFieldArr[23], ClientAccount.this.currentActiveUsers);
                    responseWriter.writeInt(responseFieldArr[24], ClientAccount.this.extraActiveUsers);
                    responseWriter.writeInt(responseFieldArr[25], ClientAccount.this.pricePerSeat);
                    responseWriter.writeBoolean(responseFieldArr[26], ClientAccount.this.allowAddingSeat);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], ClientAccount.this.allowAddingSeatTill);
                    responseWriter.writeInt(responseFieldArr[28], ClientAccount.this.seatReductionMarkedForNextCycle);
                    responseWriter.writeString(responseFieldArr[29], ClientAccount.this.billingCurrency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], ClientAccount.this.billingEmail);
                    responseWriter.writeString(responseFieldArr[31], ClientAccount.this.taxId);
                    responseWriter.writeString(responseFieldArr[32], ClientAccount.this.taxIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], ClientAccount.this.trialAccountEndDate);
                    responseWriter.writeInt(responseFieldArr[34], ClientAccount.this.trialExtensionTimes);
                    responseWriter.writeBoolean(responseFieldArr[35], ClientAccount.this.eligibleForExtension);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[36], ClientAccount.this.paidForTillDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], ClientAccount.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], ClientAccount.this.website);
                    responseWriter.writeList(responseFieldArr[39], ClientAccount.this.permissions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeBoolean(responseFieldArr[40], ClientAccount.this.enableCustomCharts);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[41], ClientAccount.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], ClientAccount.this.updatedAt);
                    responseWriter.writeString(responseFieldArr[43], ClientAccount.this.dealMode);
                    responseWriter.writeString(responseFieldArr[44], ClientAccount.this.openAiApiKey);
                    responseWriter.writeList(responseFieldArr[45], ClientAccount.this.salesmaxSalesContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[46], ClientAccount.this.salesmaxSupportContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], ClientAccount.this.chatWidgetConfig);
                    responseWriter.writeString(responseFieldArr[48], ClientAccount.this.onboardingStatus);
                    responseWriter.writeString(responseFieldArr[49], ClientAccount.this.integrationNeeded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], ClientAccount.this.matchingDealId);
                    responseWriter.writeList(responseFieldArr[51], ClientAccount.this.relatedAccountIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ClientAccount.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], ClientAccount.this.lastChurnDate);
                    responseWriter.writeString(responseFieldArr[53], ClientAccount.this.lastChurnReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], ClientAccount.this.possibleReactivationDate);
                    responseWriter.writeDouble(responseFieldArr[55], ClientAccount.this.locationPeriodicFrequency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], ClientAccount.this.lastPaymentDataId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[57], ClientAccount.this.lastPaymentDataCreatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], ClientAccount.this.nextRenewalDateIfPaid);
                    responseWriter.writeString(responseFieldArr[59], ClientAccount.this.lastPaymentStatus);
                    responseWriter.writeInt(responseFieldArr[60], ClientAccount.this.partPaymentAmountIfAny);
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
                this.$toString = "ClientAccount{__typename=" + this.__typename + ", id=" + this.id + ", accountName=" + this.accountName + ", accountType=" + this.accountType + ", deviceKey=" + this.deviceKey + ", deviceKeyLastUpdated=" + this.deviceKeyLastUpdated + ", accountStatus=" + this.accountStatus + ", businessLogoUrl=" + this.businessLogoUrl + ", createdById=" + this.createdById + ", dateFormat=" + this.dateFormat + ", dateTimeViewStyle=" + this.dateTimeViewStyle + ", defaultCurrency=" + this.defaultCurrency + ", denomination=" + this.denomination + ", industry=" + this.industry + ", nameOfBusiness=" + this.nameOfBusiness + ", productOrService=" + this.productOrService + ", timeFormat=" + this.timeFormat + ", timeZone=" + this.timeZone + ", plan=" + this.plan + ", paidUpTo=" + this.paidUpTo + ", seats=" + this.seats + ", freeSeats=" + this.freeSeats + ", currentTotalUsers=" + this.currentTotalUsers + ", currentActiveUsers=" + this.currentActiveUsers + ", extraActiveUsers=" + this.extraActiveUsers + ", pricePerSeat=" + this.pricePerSeat + ", allowAddingSeat=" + this.allowAddingSeat + ", allowAddingSeatTill=" + this.allowAddingSeatTill + ", seatReductionMarkedForNextCycle=" + this.seatReductionMarkedForNextCycle + ", billingCurrency=" + this.billingCurrency + ", billingEmail=" + this.billingEmail + ", taxId=" + this.taxId + ", taxIdType=" + this.taxIdType + ", trialAccountEndDate=" + this.trialAccountEndDate + ", trialExtensionTimes=" + this.trialExtensionTimes + ", eligibleForExtension=" + this.eligibleForExtension + ", paidForTillDate=" + this.paidForTillDate + ", updatedById=" + this.updatedById + ", website=" + this.website + ", permissions=" + this.permissions + ", enableCustomCharts=" + this.enableCustomCharts + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", dealMode=" + this.dealMode + ", openAiApiKey=" + this.openAiApiKey + ", salesmaxSalesContacts=" + this.salesmaxSalesContacts + ", salesmaxSupportContacts=" + this.salesmaxSupportContacts + ", chatWidgetConfig=" + this.chatWidgetConfig + ", onboardingStatus=" + this.onboardingStatus + ", integrationNeeded=" + this.integrationNeeded + ", matchingDealId=" + this.matchingDealId + ", relatedAccountIds=" + this.relatedAccountIds + ", lastChurnDate=" + this.lastChurnDate + ", lastChurnReason=" + this.lastChurnReason + ", possibleReactivationDate=" + this.possibleReactivationDate + ", locationPeriodicFrequency=" + this.locationPeriodicFrequency + ", lastPaymentDataId=" + this.lastPaymentDataId + ", lastPaymentDataCreatedAt=" + this.lastPaymentDataCreatedAt + ", nextRenewalDateIfPaid=" + this.nextRenewalDateIfPaid + ", lastPaymentStatus=" + this.lastPaymentStatus + ", partPaymentAmountIfAny=" + this.partPaymentAmountIfAny + "}";
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

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteClientAccount", "deleteClientAccount", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteClientAccount deleteClientAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteClientAccount.Mapper deleteClientAccountFieldMapper = new DeleteClientAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteClientAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteClientAccount>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteClientAccount read(ResponseReader responseReader2) {
                        return Mapper.this.deleteClientAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteClientAccount deleteClientAccount) {
            this.deleteClientAccount = deleteClientAccount;
        }

        public DeleteClientAccount deleteClientAccount() {
            return this.deleteClientAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteClientAccount deleteClientAccount = this.deleteClientAccount;
            DeleteClientAccount deleteClientAccount2 = ((Data) obj).deleteClientAccount;
            return deleteClientAccount == null ? deleteClientAccount2 == null : deleteClientAccount.equals(deleteClientAccount2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteClientAccount deleteClientAccount = this.deleteClientAccount;
                this.$hashCode = (deleteClientAccount == null ? 0 : deleteClientAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteClientAccount deleteClientAccount = Data.this.deleteClientAccount;
                    responseWriter.writeObject(responseField, deleteClientAccount != null ? deleteClientAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteClientAccount=" + this.deleteClientAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteClientAccount {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountCreationDate;
        final String accountId;
        final AccountSalesOwner accountSalesOwner;
        final String accountSalesOwnerId;
        final AccountSupportOwner accountSupportOwner;
        final String accountSupportOwnerId;
        final AlternateBillingContact alternateBillingContact;
        final String alternateBillingContactId;
        final String billCycleEndDate;
        final String billCycleStartDate;
        final BillingContact billingContact;
        final String billingContactId;
        final String billingDate;
        final String billingPeriod;
        final ClientAccount clientAccount;
        final String clientAccountId;
        final String clientAccountStatus;
        final String clientAccountTrialEndDate;
        final Integer clientAccountTrialExtensionTimes;
        final String clientAccountType;
        final String createdAt;
        final String currency;
        final Integer currentUserCount;
        final Integer freeUserCount;
        final String lastBillStatus;
        final Integer lastBilledAmmount;
        final String lastBilledCycleEndDate;
        final String lastBilledCycleStartDate;
        final String lastBilledDate;
        final Integer lastBilledUserCount;
        final Integer lastPaidAmount;
        final String lastPaidProductAccountBillId;
        final LastPaidProductAccountBills lastPaidProductAccountBills;
        final Integer lastPaidUserCount;
        final String lastPaymentDate;
        final String lastPaymentFollowupDoneOn;
        final String lastPaymentFollowupNote;
        final String lastPendingProductAccountBillId;
        final LastPendingProductAccountBills lastPendingProductAccountBills;
        final String nextBillingCycleEndDate;
        final String nextBillingCycleStartDate;
        final String nextBillingDate;
        final String nextPaymentDueDate;
        final String paymentDueDate;
        final ProductPlanSubscriptions productPlanSubscriptions;
        final String subscriptionCreationDate;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<DeleteClientAccount> {
            final ClientAccount.Mapper clientAccountFieldMapper = new ClientAccount.Mapper();
            final ProductPlanSubscriptions.Mapper productPlanSubscriptionsFieldMapper = new ProductPlanSubscriptions.Mapper();
            final LastPendingProductAccountBills.Mapper lastPendingProductAccountBillsFieldMapper = new LastPendingProductAccountBills.Mapper();
            final LastPaidProductAccountBills.Mapper lastPaidProductAccountBillsFieldMapper = new LastPaidProductAccountBills.Mapper();
            final BillingContact.Mapper billingContactFieldMapper = new BillingContact.Mapper();
            final AlternateBillingContact.Mapper alternateBillingContactFieldMapper = new AlternateBillingContact.Mapper();
            final AccountSalesOwner.Mapper accountSalesOwnerFieldMapper = new AccountSalesOwner.Mapper();
            final AccountSupportOwner.Mapper accountSupportOwnerFieldMapper = new AccountSupportOwner.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteClientAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteClientAccount.$responseFields;
                return new DeleteClientAccount(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readInt(responseFieldArr[13]), responseReader.readInt(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), responseReader.readString(responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]), responseReader.readInt(responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[39]), (ClientAccount) responseReader.readObject(responseFieldArr[40], new ResponseReader.ObjectReader<ClientAccount>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.DeleteClientAccount.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ClientAccount read(ResponseReader responseReader2) {
                        return Mapper.this.clientAccountFieldMapper.map(responseReader2);
                    }
                }), (ProductPlanSubscriptions) responseReader.readObject(responseFieldArr[41], new ResponseReader.ObjectReader<ProductPlanSubscriptions>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.DeleteClientAccount.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ProductPlanSubscriptions read(ResponseReader responseReader2) {
                        return Mapper.this.productPlanSubscriptionsFieldMapper.map(responseReader2);
                    }
                }), (LastPendingProductAccountBills) responseReader.readObject(responseFieldArr[42], new ResponseReader.ObjectReader<LastPendingProductAccountBills>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.DeleteClientAccount.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastPendingProductAccountBills read(ResponseReader responseReader2) {
                        return Mapper.this.lastPendingProductAccountBillsFieldMapper.map(responseReader2);
                    }
                }), (LastPaidProductAccountBills) responseReader.readObject(responseFieldArr[43], new ResponseReader.ObjectReader<LastPaidProductAccountBills>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.DeleteClientAccount.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastPaidProductAccountBills read(ResponseReader responseReader2) {
                        return Mapper.this.lastPaidProductAccountBillsFieldMapper.map(responseReader2);
                    }
                }), (BillingContact) responseReader.readObject(responseFieldArr[44], new ResponseReader.ObjectReader<BillingContact>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.DeleteClientAccount.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public BillingContact read(ResponseReader responseReader2) {
                        return Mapper.this.billingContactFieldMapper.map(responseReader2);
                    }
                }), (AlternateBillingContact) responseReader.readObject(responseFieldArr[45], new ResponseReader.ObjectReader<AlternateBillingContact>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.DeleteClientAccount.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AlternateBillingContact read(ResponseReader responseReader2) {
                        return Mapper.this.alternateBillingContactFieldMapper.map(responseReader2);
                    }
                }), (AccountSalesOwner) responseReader.readObject(responseFieldArr[46], new ResponseReader.ObjectReader<AccountSalesOwner>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.DeleteClientAccount.Mapper.7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AccountSalesOwner read(ResponseReader responseReader2) {
                        return Mapper.this.accountSalesOwnerFieldMapper.map(responseReader2);
                    }
                }), (AccountSupportOwner) responseReader.readObject(responseFieldArr[47], new ResponseReader.ObjectReader<AccountSupportOwner>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.DeleteClientAccount.Mapper.8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AccountSupportOwner read(ResponseReader responseReader2) {
                        return Mapper.this.accountSupportOwnerFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("clientAccountId", "clientAccountId", null, false, customType, Collections.emptyList()), ResponseField.forString("clientAccountType", "clientAccountType", null, true, Collections.emptyList()), ResponseField.forString("clientAccountStatus", "clientAccountStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("clientAccountTrialEndDate", "clientAccountTrialEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forInt("clientAccountTrialExtensionTimes", "clientAccountTrialExtensionTimes", null, true, Collections.emptyList()), ResponseField.forCustomType("billingContactId", "billingContactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("alternateBillingContactId", "alternateBillingContactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastPendingProductAccountBillId", "lastPendingProductAccountBillId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastPaidProductAccountBillId", "lastPaidProductAccountBillId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountSalesOwnerId", "accountSalesOwnerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountSupportOwnerId", "accountSupportOwnerId", null, true, customType, Collections.emptyList()), ResponseField.forInt("currentUserCount", "currentUserCount", null, true, Collections.emptyList()), ResponseField.forInt("freeUserCount", "freeUserCount", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forCustomType("subscriptionCreationDate", "subscriptionCreationDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("accountCreationDate", "accountCreationDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastBilledCycleStartDate", "lastBilledCycleStartDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastBilledCycleEndDate", "lastBilledCycleEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastBilledDate", "lastBilledDate", null, true, customType2, Collections.emptyList()), ResponseField.forInt("lastBilledAmmount", "lastBilledAmmount", null, true, Collections.emptyList()), ResponseField.forInt("lastPaidAmount", "lastPaidAmount", null, true, Collections.emptyList()), ResponseField.forCustomType("lastPaymentDate", "lastPaymentDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastBillStatus", "lastBillStatus", null, true, Collections.emptyList()), ResponseField.forString("lastPaymentFollowupNote", "lastPaymentFollowupNote", null, true, Collections.emptyList()), ResponseField.forCustomType("lastPaymentFollowupDoneOn", "lastPaymentFollowupDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forInt("lastPaidUserCount", "lastPaidUserCount", null, true, Collections.emptyList()), ResponseField.forInt("lastBilledUserCount", "lastBilledUserCount", null, true, Collections.emptyList()), ResponseField.forString("billingPeriod", "billingPeriod", null, true, Collections.emptyList()), ResponseField.forCustomType("billCycleStartDate", "billCycleStartDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("billCycleEndDate", "billCycleEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("billingDate", "billingDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("paymentDueDate", "paymentDueDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextBillingCycleStartDate", "nextBillingCycleStartDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextBillingCycleEndDate", "nextBillingCycleEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextBillingDate", "nextBillingDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextPaymentDueDate", "nextPaymentDueDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList()), ResponseField.forObject("clientAccount", "clientAccount", null, true, Collections.emptyList()), ResponseField.forObject("productPlanSubscriptions", "productPlanSubscriptions", null, true, Collections.emptyList()), ResponseField.forObject("lastPendingProductAccountBills", "lastPendingProductAccountBills", null, true, Collections.emptyList()), ResponseField.forObject("lastPaidProductAccountBills", "lastPaidProductAccountBills", null, true, Collections.emptyList()), ResponseField.forObject("billingContact", "billingContact", null, true, Collections.emptyList()), ResponseField.forObject("alternateBillingContact", "alternateBillingContact", null, true, Collections.emptyList()), ResponseField.forObject("accountSalesOwner", "accountSalesOwner", null, true, Collections.emptyList()), ResponseField.forObject("accountSupportOwner", "accountSupportOwner", null, true, Collections.emptyList())};
        }

        public DeleteClientAccount(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, Integer num2, Integer num3, String str13, String str14, String str15, String str16, String str17, String str18, Integer num4, Integer num5, String str19, String str20, String str21, String str22, Integer num6, Integer num7, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, ClientAccount clientAccount, ProductPlanSubscriptions productPlanSubscriptions, LastPendingProductAccountBills lastPendingProductAccountBills, LastPaidProductAccountBills lastPaidProductAccountBills, BillingContact billingContact, AlternateBillingContact alternateBillingContact, AccountSalesOwner accountSalesOwner, AccountSupportOwner accountSupportOwner) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.clientAccountId = (String) Utils.checkNotNull(str3, "clientAccountId == null");
            this.clientAccountType = str4;
            this.clientAccountStatus = str5;
            this.clientAccountTrialEndDate = str6;
            this.clientAccountTrialExtensionTimes = num;
            this.billingContactId = str7;
            this.alternateBillingContactId = str8;
            this.lastPendingProductAccountBillId = str9;
            this.lastPaidProductAccountBillId = str10;
            this.accountSalesOwnerId = str11;
            this.accountSupportOwnerId = str12;
            this.currentUserCount = num2;
            this.freeUserCount = num3;
            this.currency = str13;
            this.subscriptionCreationDate = str14;
            this.accountCreationDate = str15;
            this.lastBilledCycleStartDate = str16;
            this.lastBilledCycleEndDate = str17;
            this.lastBilledDate = str18;
            this.lastBilledAmmount = num4;
            this.lastPaidAmount = num5;
            this.lastPaymentDate = str19;
            this.lastBillStatus = str20;
            this.lastPaymentFollowupNote = str21;
            this.lastPaymentFollowupDoneOn = str22;
            this.lastPaidUserCount = num6;
            this.lastBilledUserCount = num7;
            this.billingPeriod = str23;
            this.billCycleStartDate = str24;
            this.billCycleEndDate = str25;
            this.billingDate = str26;
            this.paymentDueDate = str27;
            this.nextBillingCycleStartDate = str28;
            this.nextBillingCycleEndDate = str29;
            this.nextBillingDate = str30;
            this.nextPaymentDueDate = str31;
            this.createdAt = (String) Utils.checkNotNull(str32, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str33, "updatedAt == null");
            this.clientAccount = clientAccount;
            this.productPlanSubscriptions = productPlanSubscriptions;
            this.lastPendingProductAccountBills = lastPendingProductAccountBills;
            this.lastPaidProductAccountBills = lastPaidProductAccountBills;
            this.billingContact = billingContact;
            this.alternateBillingContact = alternateBillingContact;
            this.accountSalesOwner = accountSalesOwner;
            this.accountSupportOwner = accountSupportOwner;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountCreationDate() {
            return this.accountCreationDate;
        }

        public String accountId() {
            return this.accountId;
        }

        public AccountSalesOwner accountSalesOwner() {
            return this.accountSalesOwner;
        }

        public String accountSalesOwnerId() {
            return this.accountSalesOwnerId;
        }

        public AccountSupportOwner accountSupportOwner() {
            return this.accountSupportOwner;
        }

        public String accountSupportOwnerId() {
            return this.accountSupportOwnerId;
        }

        public AlternateBillingContact alternateBillingContact() {
            return this.alternateBillingContact;
        }

        public String alternateBillingContactId() {
            return this.alternateBillingContactId;
        }

        public String billCycleEndDate() {
            return this.billCycleEndDate;
        }

        public String billCycleStartDate() {
            return this.billCycleStartDate;
        }

        public BillingContact billingContact() {
            return this.billingContact;
        }

        public String billingContactId() {
            return this.billingContactId;
        }

        public String billingDate() {
            return this.billingDate;
        }

        public String billingPeriod() {
            return this.billingPeriod;
        }

        public ClientAccount clientAccount() {
            return this.clientAccount;
        }

        public String clientAccountId() {
            return this.clientAccountId;
        }

        public String clientAccountStatus() {
            return this.clientAccountStatus;
        }

        public String clientAccountTrialEndDate() {
            return this.clientAccountTrialEndDate;
        }

        public Integer clientAccountTrialExtensionTimes() {
            return this.clientAccountTrialExtensionTimes;
        }

        public String clientAccountType() {
            return this.clientAccountType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String currency() {
            return this.currency;
        }

        public Integer currentUserCount() {
            return this.currentUserCount;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Integer num;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            Integer num2;
            Integer num3;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            Integer num4;
            Integer num5;
            String str16;
            String str17;
            String str18;
            String str19;
            Integer num6;
            Integer num7;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            ClientAccount clientAccount;
            ProductPlanSubscriptions productPlanSubscriptions;
            LastPendingProductAccountBills lastPendingProductAccountBills;
            LastPaidProductAccountBills lastPaidProductAccountBills;
            BillingContact billingContact;
            AlternateBillingContact alternateBillingContact;
            AccountSalesOwner accountSalesOwner;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteClientAccount)) {
                return false;
            }
            DeleteClientAccount deleteClientAccount = (DeleteClientAccount) obj;
            if (this.__typename.equals(deleteClientAccount.__typename) && this.accountId.equals(deleteClientAccount.accountId) && this.clientAccountId.equals(deleteClientAccount.clientAccountId) && ((str = this.clientAccountType) != null ? str.equals(deleteClientAccount.clientAccountType) : deleteClientAccount.clientAccountType == null) && ((str2 = this.clientAccountStatus) != null ? str2.equals(deleteClientAccount.clientAccountStatus) : deleteClientAccount.clientAccountStatus == null) && ((str3 = this.clientAccountTrialEndDate) != null ? str3.equals(deleteClientAccount.clientAccountTrialEndDate) : deleteClientAccount.clientAccountTrialEndDate == null) && ((num = this.clientAccountTrialExtensionTimes) != null ? num.equals(deleteClientAccount.clientAccountTrialExtensionTimes) : deleteClientAccount.clientAccountTrialExtensionTimes == null) && ((str4 = this.billingContactId) != null ? str4.equals(deleteClientAccount.billingContactId) : deleteClientAccount.billingContactId == null) && ((str5 = this.alternateBillingContactId) != null ? str5.equals(deleteClientAccount.alternateBillingContactId) : deleteClientAccount.alternateBillingContactId == null) && ((str6 = this.lastPendingProductAccountBillId) != null ? str6.equals(deleteClientAccount.lastPendingProductAccountBillId) : deleteClientAccount.lastPendingProductAccountBillId == null) && ((str7 = this.lastPaidProductAccountBillId) != null ? str7.equals(deleteClientAccount.lastPaidProductAccountBillId) : deleteClientAccount.lastPaidProductAccountBillId == null) && ((str8 = this.accountSalesOwnerId) != null ? str8.equals(deleteClientAccount.accountSalesOwnerId) : deleteClientAccount.accountSalesOwnerId == null) && ((str9 = this.accountSupportOwnerId) != null ? str9.equals(deleteClientAccount.accountSupportOwnerId) : deleteClientAccount.accountSupportOwnerId == null) && ((num2 = this.currentUserCount) != null ? num2.equals(deleteClientAccount.currentUserCount) : deleteClientAccount.currentUserCount == null) && ((num3 = this.freeUserCount) != null ? num3.equals(deleteClientAccount.freeUserCount) : deleteClientAccount.freeUserCount == null) && ((str10 = this.currency) != null ? str10.equals(deleteClientAccount.currency) : deleteClientAccount.currency == null) && ((str11 = this.subscriptionCreationDate) != null ? str11.equals(deleteClientAccount.subscriptionCreationDate) : deleteClientAccount.subscriptionCreationDate == null) && ((str12 = this.accountCreationDate) != null ? str12.equals(deleteClientAccount.accountCreationDate) : deleteClientAccount.accountCreationDate == null) && ((str13 = this.lastBilledCycleStartDate) != null ? str13.equals(deleteClientAccount.lastBilledCycleStartDate) : deleteClientAccount.lastBilledCycleStartDate == null) && ((str14 = this.lastBilledCycleEndDate) != null ? str14.equals(deleteClientAccount.lastBilledCycleEndDate) : deleteClientAccount.lastBilledCycleEndDate == null) && ((str15 = this.lastBilledDate) != null ? str15.equals(deleteClientAccount.lastBilledDate) : deleteClientAccount.lastBilledDate == null) && ((num4 = this.lastBilledAmmount) != null ? num4.equals(deleteClientAccount.lastBilledAmmount) : deleteClientAccount.lastBilledAmmount == null) && ((num5 = this.lastPaidAmount) != null ? num5.equals(deleteClientAccount.lastPaidAmount) : deleteClientAccount.lastPaidAmount == null) && ((str16 = this.lastPaymentDate) != null ? str16.equals(deleteClientAccount.lastPaymentDate) : deleteClientAccount.lastPaymentDate == null) && ((str17 = this.lastBillStatus) != null ? str17.equals(deleteClientAccount.lastBillStatus) : deleteClientAccount.lastBillStatus == null) && ((str18 = this.lastPaymentFollowupNote) != null ? str18.equals(deleteClientAccount.lastPaymentFollowupNote) : deleteClientAccount.lastPaymentFollowupNote == null) && ((str19 = this.lastPaymentFollowupDoneOn) != null ? str19.equals(deleteClientAccount.lastPaymentFollowupDoneOn) : deleteClientAccount.lastPaymentFollowupDoneOn == null) && ((num6 = this.lastPaidUserCount) != null ? num6.equals(deleteClientAccount.lastPaidUserCount) : deleteClientAccount.lastPaidUserCount == null) && ((num7 = this.lastBilledUserCount) != null ? num7.equals(deleteClientAccount.lastBilledUserCount) : deleteClientAccount.lastBilledUserCount == null) && ((str20 = this.billingPeriod) != null ? str20.equals(deleteClientAccount.billingPeriod) : deleteClientAccount.billingPeriod == null) && ((str21 = this.billCycleStartDate) != null ? str21.equals(deleteClientAccount.billCycleStartDate) : deleteClientAccount.billCycleStartDate == null) && ((str22 = this.billCycleEndDate) != null ? str22.equals(deleteClientAccount.billCycleEndDate) : deleteClientAccount.billCycleEndDate == null) && ((str23 = this.billingDate) != null ? str23.equals(deleteClientAccount.billingDate) : deleteClientAccount.billingDate == null) && ((str24 = this.paymentDueDate) != null ? str24.equals(deleteClientAccount.paymentDueDate) : deleteClientAccount.paymentDueDate == null) && ((str25 = this.nextBillingCycleStartDate) != null ? str25.equals(deleteClientAccount.nextBillingCycleStartDate) : deleteClientAccount.nextBillingCycleStartDate == null) && ((str26 = this.nextBillingCycleEndDate) != null ? str26.equals(deleteClientAccount.nextBillingCycleEndDate) : deleteClientAccount.nextBillingCycleEndDate == null) && ((str27 = this.nextBillingDate) != null ? str27.equals(deleteClientAccount.nextBillingDate) : deleteClientAccount.nextBillingDate == null) && ((str28 = this.nextPaymentDueDate) != null ? str28.equals(deleteClientAccount.nextPaymentDueDate) : deleteClientAccount.nextPaymentDueDate == null) && this.createdAt.equals(deleteClientAccount.createdAt) && this.updatedAt.equals(deleteClientAccount.updatedAt) && ((clientAccount = this.clientAccount) != null ? clientAccount.equals(deleteClientAccount.clientAccount) : deleteClientAccount.clientAccount == null) && ((productPlanSubscriptions = this.productPlanSubscriptions) != null ? productPlanSubscriptions.equals(deleteClientAccount.productPlanSubscriptions) : deleteClientAccount.productPlanSubscriptions == null) && ((lastPendingProductAccountBills = this.lastPendingProductAccountBills) != null ? lastPendingProductAccountBills.equals(deleteClientAccount.lastPendingProductAccountBills) : deleteClientAccount.lastPendingProductAccountBills == null) && ((lastPaidProductAccountBills = this.lastPaidProductAccountBills) != null ? lastPaidProductAccountBills.equals(deleteClientAccount.lastPaidProductAccountBills) : deleteClientAccount.lastPaidProductAccountBills == null) && ((billingContact = this.billingContact) != null ? billingContact.equals(deleteClientAccount.billingContact) : deleteClientAccount.billingContact == null) && ((alternateBillingContact = this.alternateBillingContact) != null ? alternateBillingContact.equals(deleteClientAccount.alternateBillingContact) : deleteClientAccount.alternateBillingContact == null) && ((accountSalesOwner = this.accountSalesOwner) != null ? accountSalesOwner.equals(deleteClientAccount.accountSalesOwner) : deleteClientAccount.accountSalesOwner == null)) {
                AccountSupportOwner accountSupportOwner = this.accountSupportOwner;
                AccountSupportOwner accountSupportOwner2 = deleteClientAccount.accountSupportOwner;
                if (accountSupportOwner == null) {
                    if (accountSupportOwner2 == null) {
                        return true;
                    }
                } else if (accountSupportOwner.equals(accountSupportOwner2)) {
                    return true;
                }
            }
            return false;
        }

        public Integer freeUserCount() {
            return this.freeUserCount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.clientAccountId.hashCode()) * 1000003;
                String str = this.clientAccountType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.clientAccountStatus;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.clientAccountTrialEndDate;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.clientAccountTrialExtensionTimes;
                int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str4 = this.billingContactId;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.alternateBillingContactId;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.lastPendingProductAccountBillId;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.lastPaidProductAccountBillId;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.accountSalesOwnerId;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.accountSupportOwnerId;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                Integer num2 = this.currentUserCount;
                int iHashCode12 = (iHashCode11 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.freeUserCount;
                int iHashCode13 = (iHashCode12 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str10 = this.currency;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.subscriptionCreationDate;
                int iHashCode15 = (iHashCode14 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.accountCreationDate;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.lastBilledCycleStartDate;
                int iHashCode17 = (iHashCode16 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.lastBilledCycleEndDate;
                int iHashCode18 = (iHashCode17 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.lastBilledDate;
                int iHashCode19 = (iHashCode18 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                Integer num4 = this.lastBilledAmmount;
                int iHashCode20 = (iHashCode19 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.lastPaidAmount;
                int iHashCode21 = (iHashCode20 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                String str16 = this.lastPaymentDate;
                int iHashCode22 = (iHashCode21 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.lastBillStatus;
                int iHashCode23 = (iHashCode22 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.lastPaymentFollowupNote;
                int iHashCode24 = (iHashCode23 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.lastPaymentFollowupDoneOn;
                int iHashCode25 = (iHashCode24 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                Integer num6 = this.lastPaidUserCount;
                int iHashCode26 = (iHashCode25 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.lastBilledUserCount;
                int iHashCode27 = (iHashCode26 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                String str20 = this.billingPeriod;
                int iHashCode28 = (iHashCode27 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.billCycleStartDate;
                int iHashCode29 = (iHashCode28 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.billCycleEndDate;
                int iHashCode30 = (iHashCode29 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.billingDate;
                int iHashCode31 = (iHashCode30 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.paymentDueDate;
                int iHashCode32 = (iHashCode31 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.nextBillingCycleStartDate;
                int iHashCode33 = (iHashCode32 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.nextBillingCycleEndDate;
                int iHashCode34 = (iHashCode33 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.nextBillingDate;
                int iHashCode35 = (iHashCode34 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.nextPaymentDueDate;
                int iHashCode36 = (((((iHashCode35 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode()) * 1000003;
                ClientAccount clientAccount = this.clientAccount;
                int iHashCode37 = (iHashCode36 ^ (clientAccount == null ? 0 : clientAccount.hashCode())) * 1000003;
                ProductPlanSubscriptions productPlanSubscriptions = this.productPlanSubscriptions;
                int iHashCode38 = (iHashCode37 ^ (productPlanSubscriptions == null ? 0 : productPlanSubscriptions.hashCode())) * 1000003;
                LastPendingProductAccountBills lastPendingProductAccountBills = this.lastPendingProductAccountBills;
                int iHashCode39 = (iHashCode38 ^ (lastPendingProductAccountBills == null ? 0 : lastPendingProductAccountBills.hashCode())) * 1000003;
                LastPaidProductAccountBills lastPaidProductAccountBills = this.lastPaidProductAccountBills;
                int iHashCode40 = (iHashCode39 ^ (lastPaidProductAccountBills == null ? 0 : lastPaidProductAccountBills.hashCode())) * 1000003;
                BillingContact billingContact = this.billingContact;
                int iHashCode41 = (iHashCode40 ^ (billingContact == null ? 0 : billingContact.hashCode())) * 1000003;
                AlternateBillingContact alternateBillingContact = this.alternateBillingContact;
                int iHashCode42 = (iHashCode41 ^ (alternateBillingContact == null ? 0 : alternateBillingContact.hashCode())) * 1000003;
                AccountSalesOwner accountSalesOwner = this.accountSalesOwner;
                int iHashCode43 = (iHashCode42 ^ (accountSalesOwner == null ? 0 : accountSalesOwner.hashCode())) * 1000003;
                AccountSupportOwner accountSupportOwner = this.accountSupportOwner;
                this.$hashCode = iHashCode43 ^ (accountSupportOwner != null ? accountSupportOwner.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String lastBillStatus() {
            return this.lastBillStatus;
        }

        public Integer lastBilledAmmount() {
            return this.lastBilledAmmount;
        }

        public String lastBilledCycleEndDate() {
            return this.lastBilledCycleEndDate;
        }

        public String lastBilledCycleStartDate() {
            return this.lastBilledCycleStartDate;
        }

        public String lastBilledDate() {
            return this.lastBilledDate;
        }

        public Integer lastBilledUserCount() {
            return this.lastBilledUserCount;
        }

        public Integer lastPaidAmount() {
            return this.lastPaidAmount;
        }

        public String lastPaidProductAccountBillId() {
            return this.lastPaidProductAccountBillId;
        }

        public LastPaidProductAccountBills lastPaidProductAccountBills() {
            return this.lastPaidProductAccountBills;
        }

        public Integer lastPaidUserCount() {
            return this.lastPaidUserCount;
        }

        public String lastPaymentDate() {
            return this.lastPaymentDate;
        }

        public String lastPaymentFollowupDoneOn() {
            return this.lastPaymentFollowupDoneOn;
        }

        public String lastPaymentFollowupNote() {
            return this.lastPaymentFollowupNote;
        }

        public String lastPendingProductAccountBillId() {
            return this.lastPendingProductAccountBillId;
        }

        public LastPendingProductAccountBills lastPendingProductAccountBills() {
            return this.lastPendingProductAccountBills;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.DeleteClientAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteClientAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteClientAccount.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteClientAccount.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteClientAccount.this.clientAccountId);
                    responseWriter.writeString(responseFieldArr[3], DeleteClientAccount.this.clientAccountType);
                    responseWriter.writeString(responseFieldArr[4], DeleteClientAccount.this.clientAccountStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteClientAccount.this.clientAccountTrialEndDate);
                    responseWriter.writeInt(responseFieldArr[6], DeleteClientAccount.this.clientAccountTrialExtensionTimes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], DeleteClientAccount.this.billingContactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], DeleteClientAccount.this.alternateBillingContactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], DeleteClientAccount.this.lastPendingProductAccountBillId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], DeleteClientAccount.this.lastPaidProductAccountBillId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], DeleteClientAccount.this.accountSalesOwnerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], DeleteClientAccount.this.accountSupportOwnerId);
                    responseWriter.writeInt(responseFieldArr[13], DeleteClientAccount.this.currentUserCount);
                    responseWriter.writeInt(responseFieldArr[14], DeleteClientAccount.this.freeUserCount);
                    responseWriter.writeString(responseFieldArr[15], DeleteClientAccount.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], DeleteClientAccount.this.subscriptionCreationDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], DeleteClientAccount.this.accountCreationDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], DeleteClientAccount.this.lastBilledCycleStartDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], DeleteClientAccount.this.lastBilledCycleEndDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], DeleteClientAccount.this.lastBilledDate);
                    responseWriter.writeInt(responseFieldArr[21], DeleteClientAccount.this.lastBilledAmmount);
                    responseWriter.writeInt(responseFieldArr[22], DeleteClientAccount.this.lastPaidAmount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], DeleteClientAccount.this.lastPaymentDate);
                    responseWriter.writeString(responseFieldArr[24], DeleteClientAccount.this.lastBillStatus);
                    responseWriter.writeString(responseFieldArr[25], DeleteClientAccount.this.lastPaymentFollowupNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], DeleteClientAccount.this.lastPaymentFollowupDoneOn);
                    responseWriter.writeInt(responseFieldArr[27], DeleteClientAccount.this.lastPaidUserCount);
                    responseWriter.writeInt(responseFieldArr[28], DeleteClientAccount.this.lastBilledUserCount);
                    responseWriter.writeString(responseFieldArr[29], DeleteClientAccount.this.billingPeriod);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], DeleteClientAccount.this.billCycleStartDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], DeleteClientAccount.this.billCycleEndDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], DeleteClientAccount.this.billingDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], DeleteClientAccount.this.paymentDueDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], DeleteClientAccount.this.nextBillingCycleStartDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[35], DeleteClientAccount.this.nextBillingCycleEndDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[36], DeleteClientAccount.this.nextBillingDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], DeleteClientAccount.this.nextPaymentDueDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], DeleteClientAccount.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], DeleteClientAccount.this.updatedAt);
                    ResponseField responseField = responseFieldArr[40];
                    ClientAccount clientAccount = DeleteClientAccount.this.clientAccount;
                    responseWriter.writeObject(responseField, clientAccount != null ? clientAccount.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[41];
                    ProductPlanSubscriptions productPlanSubscriptions = DeleteClientAccount.this.productPlanSubscriptions;
                    responseWriter.writeObject(responseField2, productPlanSubscriptions != null ? productPlanSubscriptions.marshaller() : null);
                    ResponseField responseField3 = responseFieldArr[42];
                    LastPendingProductAccountBills lastPendingProductAccountBills = DeleteClientAccount.this.lastPendingProductAccountBills;
                    responseWriter.writeObject(responseField3, lastPendingProductAccountBills != null ? lastPendingProductAccountBills.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[43];
                    LastPaidProductAccountBills lastPaidProductAccountBills = DeleteClientAccount.this.lastPaidProductAccountBills;
                    responseWriter.writeObject(responseField4, lastPaidProductAccountBills != null ? lastPaidProductAccountBills.marshaller() : null);
                    ResponseField responseField5 = responseFieldArr[44];
                    BillingContact billingContact = DeleteClientAccount.this.billingContact;
                    responseWriter.writeObject(responseField5, billingContact != null ? billingContact.marshaller() : null);
                    ResponseField responseField6 = responseFieldArr[45];
                    AlternateBillingContact alternateBillingContact = DeleteClientAccount.this.alternateBillingContact;
                    responseWriter.writeObject(responseField6, alternateBillingContact != null ? alternateBillingContact.marshaller() : null);
                    ResponseField responseField7 = responseFieldArr[46];
                    AccountSalesOwner accountSalesOwner = DeleteClientAccount.this.accountSalesOwner;
                    responseWriter.writeObject(responseField7, accountSalesOwner != null ? accountSalesOwner.marshaller() : null);
                    ResponseField responseField8 = responseFieldArr[47];
                    AccountSupportOwner accountSupportOwner = DeleteClientAccount.this.accountSupportOwner;
                    responseWriter.writeObject(responseField8, accountSupportOwner != null ? accountSupportOwner.marshaller() : null);
                }
            };
        }

        public String nextBillingCycleEndDate() {
            return this.nextBillingCycleEndDate;
        }

        public String nextBillingCycleStartDate() {
            return this.nextBillingCycleStartDate;
        }

        public String nextBillingDate() {
            return this.nextBillingDate;
        }

        public String nextPaymentDueDate() {
            return this.nextPaymentDueDate;
        }

        public String paymentDueDate() {
            return this.paymentDueDate;
        }

        public ProductPlanSubscriptions productPlanSubscriptions() {
            return this.productPlanSubscriptions;
        }

        public String subscriptionCreationDate() {
            return this.subscriptionCreationDate;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteClientAccount{__typename=" + this.__typename + ", accountId=" + this.accountId + ", clientAccountId=" + this.clientAccountId + ", clientAccountType=" + this.clientAccountType + ", clientAccountStatus=" + this.clientAccountStatus + ", clientAccountTrialEndDate=" + this.clientAccountTrialEndDate + ", clientAccountTrialExtensionTimes=" + this.clientAccountTrialExtensionTimes + ", billingContactId=" + this.billingContactId + ", alternateBillingContactId=" + this.alternateBillingContactId + ", lastPendingProductAccountBillId=" + this.lastPendingProductAccountBillId + ", lastPaidProductAccountBillId=" + this.lastPaidProductAccountBillId + ", accountSalesOwnerId=" + this.accountSalesOwnerId + ", accountSupportOwnerId=" + this.accountSupportOwnerId + ", currentUserCount=" + this.currentUserCount + ", freeUserCount=" + this.freeUserCount + ", currency=" + this.currency + ", subscriptionCreationDate=" + this.subscriptionCreationDate + ", accountCreationDate=" + this.accountCreationDate + ", lastBilledCycleStartDate=" + this.lastBilledCycleStartDate + ", lastBilledCycleEndDate=" + this.lastBilledCycleEndDate + ", lastBilledDate=" + this.lastBilledDate + ", lastBilledAmmount=" + this.lastBilledAmmount + ", lastPaidAmount=" + this.lastPaidAmount + ", lastPaymentDate=" + this.lastPaymentDate + ", lastBillStatus=" + this.lastBillStatus + ", lastPaymentFollowupNote=" + this.lastPaymentFollowupNote + ", lastPaymentFollowupDoneOn=" + this.lastPaymentFollowupDoneOn + ", lastPaidUserCount=" + this.lastPaidUserCount + ", lastBilledUserCount=" + this.lastBilledUserCount + ", billingPeriod=" + this.billingPeriod + ", billCycleStartDate=" + this.billCycleStartDate + ", billCycleEndDate=" + this.billCycleEndDate + ", billingDate=" + this.billingDate + ", paymentDueDate=" + this.paymentDueDate + ", nextBillingCycleStartDate=" + this.nextBillingCycleStartDate + ", nextBillingCycleEndDate=" + this.nextBillingCycleEndDate + ", nextBillingDate=" + this.nextBillingDate + ", nextPaymentDueDate=" + this.nextPaymentDueDate + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", clientAccount=" + this.clientAccount + ", productPlanSubscriptions=" + this.productPlanSubscriptions + ", lastPendingProductAccountBills=" + this.lastPendingProductAccountBills + ", lastPaidProductAccountBills=" + this.lastPaidProductAccountBills + ", billingContact=" + this.billingContact + ", alternateBillingContact=" + this.alternateBillingContact + ", accountSalesOwner=" + this.accountSalesOwner + ", accountSupportOwner=" + this.accountSupportOwner + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class LastPaidProductAccountBills {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String billGeneratedFrom;
        final String billGeneratedTo;
        final String billStatus;
        final String createdAt;
        final String currency;
        final String id;
        final String productAccountId;
        final String productPlanId;
        final Integer totalFees;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<LastPaidProductAccountBills> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastPaidProductAccountBills map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastPaidProductAccountBills.$responseFields;
                return new LastPaidProductAccountBills(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readInt(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productAccountId", "productAccountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productPlanId", "productPlanId", null, false, customType, Collections.emptyList()), ResponseField.forInt("totalFees", "totalFees", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forString("billStatus", "billStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("billGeneratedFrom", "billGeneratedFrom", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("billGeneratedTo", "billGeneratedTo", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public LastPaidProductAccountBills(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.productAccountId = (String) Utils.checkNotNull(str4, "productAccountId == null");
            this.productPlanId = (String) Utils.checkNotNull(str5, "productPlanId == null");
            this.totalFees = num;
            this.currency = str6;
            this.billStatus = str7;
            this.billGeneratedFrom = str8;
            this.billGeneratedTo = str9;
            this.createdAt = (String) Utils.checkNotNull(str10, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str11, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String billGeneratedFrom() {
            return this.billGeneratedFrom;
        }

        public String billGeneratedTo() {
            return this.billGeneratedTo;
        }

        public String billStatus() {
            return this.billStatus;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String currency() {
            return this.currency;
        }

        public boolean equals(Object obj) {
            Integer num;
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LastPaidProductAccountBills)) {
                return false;
            }
            LastPaidProductAccountBills lastPaidProductAccountBills = (LastPaidProductAccountBills) obj;
            return this.__typename.equals(lastPaidProductAccountBills.__typename) && this.id.equals(lastPaidProductAccountBills.id) && this.accountId.equals(lastPaidProductAccountBills.accountId) && this.productAccountId.equals(lastPaidProductAccountBills.productAccountId) && this.productPlanId.equals(lastPaidProductAccountBills.productPlanId) && ((num = this.totalFees) != null ? num.equals(lastPaidProductAccountBills.totalFees) : lastPaidProductAccountBills.totalFees == null) && ((str = this.currency) != null ? str.equals(lastPaidProductAccountBills.currency) : lastPaidProductAccountBills.currency == null) && ((str2 = this.billStatus) != null ? str2.equals(lastPaidProductAccountBills.billStatus) : lastPaidProductAccountBills.billStatus == null) && ((str3 = this.billGeneratedFrom) != null ? str3.equals(lastPaidProductAccountBills.billGeneratedFrom) : lastPaidProductAccountBills.billGeneratedFrom == null) && ((str4 = this.billGeneratedTo) != null ? str4.equals(lastPaidProductAccountBills.billGeneratedTo) : lastPaidProductAccountBills.billGeneratedTo == null) && this.createdAt.equals(lastPaidProductAccountBills.createdAt) && this.updatedAt.equals(lastPaidProductAccountBills.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.productAccountId.hashCode()) * 1000003) ^ this.productPlanId.hashCode()) * 1000003;
                Integer num = this.totalFees;
                int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.currency;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.billStatus;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.billGeneratedFrom;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.billGeneratedTo;
                this.$hashCode = ((((iHashCode5 ^ (str4 != null ? str4.hashCode() : 0)) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.LastPaidProductAccountBills.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastPaidProductAccountBills.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastPaidProductAccountBills.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastPaidProductAccountBills.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], LastPaidProductAccountBills.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], LastPaidProductAccountBills.this.productAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], LastPaidProductAccountBills.this.productPlanId);
                    responseWriter.writeInt(responseFieldArr[5], LastPaidProductAccountBills.this.totalFees);
                    responseWriter.writeString(responseFieldArr[6], LastPaidProductAccountBills.this.currency);
                    responseWriter.writeString(responseFieldArr[7], LastPaidProductAccountBills.this.billStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], LastPaidProductAccountBills.this.billGeneratedFrom);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastPaidProductAccountBills.this.billGeneratedTo);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], LastPaidProductAccountBills.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], LastPaidProductAccountBills.this.updatedAt);
                }
            };
        }

        public String productAccountId() {
            return this.productAccountId;
        }

        public String productPlanId() {
            return this.productPlanId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastPaidProductAccountBills{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", productAccountId=" + this.productAccountId + ", productPlanId=" + this.productPlanId + ", totalFees=" + this.totalFees + ", currency=" + this.currency + ", billStatus=" + this.billStatus + ", billGeneratedFrom=" + this.billGeneratedFrom + ", billGeneratedTo=" + this.billGeneratedTo + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public Integer totalFees() {
            return this.totalFees;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class LastPendingProductAccountBills {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String billGeneratedFrom;
        final String billGeneratedTo;
        final String billStatus;
        final String createdAt;
        final String currency;
        final String id;
        final String productAccountId;
        final String productPlanId;
        final Integer totalFees;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<LastPendingProductAccountBills> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastPendingProductAccountBills map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastPendingProductAccountBills.$responseFields;
                return new LastPendingProductAccountBills(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readInt(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productAccountId", "productAccountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productPlanId", "productPlanId", null, false, customType, Collections.emptyList()), ResponseField.forInt("totalFees", "totalFees", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forString("billStatus", "billStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("billGeneratedFrom", "billGeneratedFrom", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("billGeneratedTo", "billGeneratedTo", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public LastPendingProductAccountBills(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.productAccountId = (String) Utils.checkNotNull(str4, "productAccountId == null");
            this.productPlanId = (String) Utils.checkNotNull(str5, "productPlanId == null");
            this.totalFees = num;
            this.currency = str6;
            this.billStatus = str7;
            this.billGeneratedFrom = str8;
            this.billGeneratedTo = str9;
            this.createdAt = (String) Utils.checkNotNull(str10, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str11, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String billGeneratedFrom() {
            return this.billGeneratedFrom;
        }

        public String billGeneratedTo() {
            return this.billGeneratedTo;
        }

        public String billStatus() {
            return this.billStatus;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String currency() {
            return this.currency;
        }

        public boolean equals(Object obj) {
            Integer num;
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LastPendingProductAccountBills)) {
                return false;
            }
            LastPendingProductAccountBills lastPendingProductAccountBills = (LastPendingProductAccountBills) obj;
            return this.__typename.equals(lastPendingProductAccountBills.__typename) && this.id.equals(lastPendingProductAccountBills.id) && this.accountId.equals(lastPendingProductAccountBills.accountId) && this.productAccountId.equals(lastPendingProductAccountBills.productAccountId) && this.productPlanId.equals(lastPendingProductAccountBills.productPlanId) && ((num = this.totalFees) != null ? num.equals(lastPendingProductAccountBills.totalFees) : lastPendingProductAccountBills.totalFees == null) && ((str = this.currency) != null ? str.equals(lastPendingProductAccountBills.currency) : lastPendingProductAccountBills.currency == null) && ((str2 = this.billStatus) != null ? str2.equals(lastPendingProductAccountBills.billStatus) : lastPendingProductAccountBills.billStatus == null) && ((str3 = this.billGeneratedFrom) != null ? str3.equals(lastPendingProductAccountBills.billGeneratedFrom) : lastPendingProductAccountBills.billGeneratedFrom == null) && ((str4 = this.billGeneratedTo) != null ? str4.equals(lastPendingProductAccountBills.billGeneratedTo) : lastPendingProductAccountBills.billGeneratedTo == null) && this.createdAt.equals(lastPendingProductAccountBills.createdAt) && this.updatedAt.equals(lastPendingProductAccountBills.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.productAccountId.hashCode()) * 1000003) ^ this.productPlanId.hashCode()) * 1000003;
                Integer num = this.totalFees;
                int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.currency;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.billStatus;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.billGeneratedFrom;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.billGeneratedTo;
                this.$hashCode = ((((iHashCode5 ^ (str4 != null ? str4.hashCode() : 0)) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.LastPendingProductAccountBills.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastPendingProductAccountBills.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastPendingProductAccountBills.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastPendingProductAccountBills.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], LastPendingProductAccountBills.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], LastPendingProductAccountBills.this.productAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], LastPendingProductAccountBills.this.productPlanId);
                    responseWriter.writeInt(responseFieldArr[5], LastPendingProductAccountBills.this.totalFees);
                    responseWriter.writeString(responseFieldArr[6], LastPendingProductAccountBills.this.currency);
                    responseWriter.writeString(responseFieldArr[7], LastPendingProductAccountBills.this.billStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], LastPendingProductAccountBills.this.billGeneratedFrom);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastPendingProductAccountBills.this.billGeneratedTo);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], LastPendingProductAccountBills.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], LastPendingProductAccountBills.this.updatedAt);
                }
            };
        }

        public String productAccountId() {
            return this.productAccountId;
        }

        public String productPlanId() {
            return this.productPlanId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastPendingProductAccountBills{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", productAccountId=" + this.productAccountId + ", productPlanId=" + this.productPlanId + ", totalFees=" + this.totalFees + ", currency=" + this.currency + ", billStatus=" + this.billStatus + ", billGeneratedFrom=" + this.billGeneratedFrom + ", billGeneratedTo=" + this.billGeneratedTo + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public Integer totalFees() {
            return this.totalFees;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ProductPlanSubscriptions {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ProductPlanSubscriptions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ProductPlanSubscriptions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ProductPlanSubscriptions.$responseFields;
                return new ProductPlanSubscriptions(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public ProductPlanSubscriptions(String str, String str2) {
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
            if (!(obj instanceof ProductPlanSubscriptions)) {
                return false;
            }
            ProductPlanSubscriptions productPlanSubscriptions = (ProductPlanSubscriptions) obj;
            if (this.__typename.equals(productPlanSubscriptions.__typename)) {
                String str = this.nextToken;
                String str2 = productPlanSubscriptions.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.ProductPlanSubscriptions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ProductPlanSubscriptions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ProductPlanSubscriptions.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ProductPlanSubscriptions.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ProductPlanSubscriptions{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelClientAccountConditionInput condition;
        private final DeleteClientAccountInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteClientAccountInput deleteClientAccountInput, ModelClientAccountConditionInput modelClientAccountConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteClientAccountInput;
            this.condition = modelClientAccountConditionInput;
            linkedHashMap.put("input", deleteClientAccountInput);
            linkedHashMap.put("condition", modelClientAccountConditionInput);
        }

        public ModelClientAccountConditionInput condition() {
            return this.condition;
        }

        public DeleteClientAccountInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteClientAccountMutation.Variables.1
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

    public DeleteClientAccountMutation(DeleteClientAccountInput deleteClientAccountInput, ModelClientAccountConditionInput modelClientAccountConditionInput) {
        Utils.checkNotNull(deleteClientAccountInput, "input == null");
        this.variables = new Variables(deleteClientAccountInput, modelClientAccountConditionInput);
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
        return "1b471890261b4fcb30cd086db609a6cfa686501593e728118f46537da4d11977";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteClientAccount($input: DeleteClientAccountInput!, $condition: ModelClientAccountConditionInput) {\n  deleteClientAccount(input: $input, condition: $condition) {\n    __typename\n    accountId\n    clientAccountId\n    clientAccountType\n    clientAccountStatus\n    clientAccountTrialEndDate\n    clientAccountTrialExtensionTimes\n    billingContactId\n    alternateBillingContactId\n    lastPendingProductAccountBillId\n    lastPaidProductAccountBillId\n    accountSalesOwnerId\n    accountSupportOwnerId\n    currentUserCount\n    freeUserCount\n    currency\n    subscriptionCreationDate\n    accountCreationDate\n    lastBilledCycleStartDate\n    lastBilledCycleEndDate\n    lastBilledDate\n    lastBilledAmmount\n    lastPaidAmount\n    lastPaymentDate\n    lastBillStatus\n    lastPaymentFollowupNote\n    lastPaymentFollowupDoneOn\n    lastPaidUserCount\n    lastBilledUserCount\n    billingPeriod\n    billCycleStartDate\n    billCycleEndDate\n    billingDate\n    paymentDueDate\n    nextBillingCycleStartDate\n    nextBillingCycleEndDate\n    nextBillingDate\n    nextPaymentDueDate\n    createdAt\n    updatedAt\n    clientAccount {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    productPlanSubscriptions {\n      __typename\n      nextToken\n    }\n    lastPendingProductAccountBills {\n      __typename\n      id\n      accountId\n      productAccountId\n      productPlanId\n      totalFees\n      currency\n      billStatus\n      billGeneratedFrom\n      billGeneratedTo\n      createdAt\n      updatedAt\n    }\n    lastPaidProductAccountBills {\n      __typename\n      id\n      accountId\n      productAccountId\n      productPlanId\n      totalFees\n      currency\n      billStatus\n      billGeneratedFrom\n      billGeneratedTo\n      createdAt\n      updatedAt\n    }\n    billingContact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    alternateBillingContact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    accountSalesOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    accountSupportOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
