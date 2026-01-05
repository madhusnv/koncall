package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.amplifyframework.storage.s3.transfer.TransferTable;
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
import type.CallDirection;
import type.ContactAssignmentStatus;
import type.ContactNumberType;
import type.ContactStatus;
import type.CustomType;
import type.Day;
import type.LeadLifecycleStage;
import type.LeadLifecycleStageSubCategory;
import type.Seniority;
import type.TaskActivityType;
import type.UserRegistrationStatus;

/* loaded from: classes4.dex */
public final class OnCreateContactWithNumberUserLevelSubscription implements Subscription<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnCreateContactWithNumberUserLevel($accountId: ID!, $ownerId: ID!) {\n  onCreateContactWithNumberUserLevel(accountId: $accountId, ownerId: $ownerId) {\n    __typename\n    id\n    accountId\n    ownerId\n    toBeAssigned\n    sharedOwners\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    sharedTeams\n    accountPriority\n    addedById\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    assignedToId\n    blockedForCallById\n    blockedForCallReason\n    blockedForCallUntil\n    callPriority\n    waChatChannelId\n    contactNumberDetail {\n      __typename\n      contactNumberType\n      isPrimary\n      isValid\n      isWhatsappNumber\n      isVerified\n      isWrongNumber\n      phoneNumber\n    }\n    businessDetail {\n      __typename\n      id\n      name\n      website\n      industry\n    }\n    contactSource\n    contactSourceDrillDownOne\n    contactSourceDrillDownTwo\n    contactSourceDrillDownThree\n    contactSourceDrillDownOneId\n    contactSourceDrillDownTwoId\n    contactSourceDrillDownThreeId\n    contactStatus\n    contactType\n    department\n    designation\n    emails {\n      __typename\n      email\n      fullName\n      isDisposableEmail\n      isPrimary\n      isPublicEmail\n      isValid\n      isVerified\n      isGenericEmail\n    }\n    lastRepeatEnquiryDate\n    lastRepeatEnquirySource\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n      externalReferenceSourceDate\n    }\n    gender\n    isDecisionMaker\n    isPrivate\n    lockPeriod\n    name\n    preferredContactDays\n    profilePhotoUrl\n    referredBy\n    salutation\n    seniority\n    updatedById\n    hasTask\n    openTaskActivityType\n    lastCalledTime\n    lastCallDirection\n    lastCallOutcome\n    lastCallOutcomeNature\n    lastCallUserId\n    lastCallDuration\n    lastCallEngagementId\n    lastVisitTime\n    lastVisitOutcome\n    lastVisitOutcomeNature\n    lastVisitUserId\n    lastVisitEngagementId\n    lastEmailTime\n    lastEmailUserId\n    lastEmailEngagementId\n    lastWhatsappTime\n    lastWhatsappUserId\n    lastWhatsappEngagementId\n    lastWabaBroadcastTime\n    lastWabaBroadcastStatus\n    lastWabaBroadcastTemplate\n    lastWabaBroadcastReplyBody\n    lastWabaBroadcastReplyTime\n    lastWabaBroadcastReplyType\n    lastSmsTime\n    lastSmsUserId\n    lastSmsEngagementId\n    lastNoteAddedTime\n    lastNoteUserId\n    lastNoteEngagementId\n    lastTaskDoneTime\n    lastTaskDoneUserId\n    lastTaskDoneEngagementId\n    openTaskCount\n    lastKnownDisposition\n    lastKnownDispositionTime\n    lastLeadAssignmentDateTime\n    lastEngagementFromAccount\n    lastEngagementFromContact\n    freshLeadTag\n    noWorkAfterAssignment\n    needFollowUpTag\n    needFollowUpTagUpdatedAt\n    activeDealStage\n    activeDealStageUpdatedAt\n    dealDescription\n    isCustomer\n    becameCustomerOn\n    unsuccessfulCallAttempts\n    leadCallsNotAnswered\n    userDefinedTags\n    productService\n    bulkUploadReference\n    assignmentMethod\n    whatsappOptInStatus\n    recentEngagements\n    recentEngagementsUpdatedAt\n    openTaskDetail\n    openVideoCallDetail\n    lastClosedTaskDetail\n    lastClosedTaskDetailUpdatedAt\n    latestRemark\n    customAttributes\n    paymentRequestDetail\n    lastPaymentStatus\n    customDataAddedFromAddContactForm\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    manualClosedReason\n    lastDealStageType\n    prospectingAttempts\n    totalProspectingAttemptsAcrossRechurn\n    numberOfTimesRechurned\n    lastProspectingDoneOn\n    firstProspectingDoneOn\n    nextProspectingDueOn\n    nextProspectingSetBy\n    nextProspectingNote\n    movedToOpportunityOn\n    movedToClosedOn\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    chatChannels {\n      __typename\n      nextToken\n    }\n    deals {\n      __typename\n      nextToken\n    }\n    linkedFiles {\n      __typename\n      nextToken\n    }\n    businesses {\n      __typename\n      nextToken\n    }\n    contactNumbers {\n      __typename\n      nextToken\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    assignedTo {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    blockedForCallBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastCallUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastVisitUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastEmailUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastWhatsappUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastSmsUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastNoteUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastTaskDoneUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnCreateContactWithNumberUserLevel";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnCreateContactWithNumberUserLevel($accountId: ID!, $ownerId: ID!) {\n  onCreateContactWithNumberUserLevel(accountId: $accountId, ownerId: $ownerId) {\n    __typename\n    id\n    accountId\n    ownerId\n    toBeAssigned\n    sharedOwners\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    sharedTeams\n    accountPriority\n    addedById\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    assignedToId\n    blockedForCallById\n    blockedForCallReason\n    blockedForCallUntil\n    callPriority\n    waChatChannelId\n    contactNumberDetail {\n      __typename\n      contactNumberType\n      isPrimary\n      isValid\n      isWhatsappNumber\n      isVerified\n      isWrongNumber\n      phoneNumber\n    }\n    businessDetail {\n      __typename\n      id\n      name\n      website\n      industry\n    }\n    contactSource\n    contactSourceDrillDownOne\n    contactSourceDrillDownTwo\n    contactSourceDrillDownThree\n    contactSourceDrillDownOneId\n    contactSourceDrillDownTwoId\n    contactSourceDrillDownThreeId\n    contactStatus\n    contactType\n    department\n    designation\n    emails {\n      __typename\n      email\n      fullName\n      isDisposableEmail\n      isPrimary\n      isPublicEmail\n      isValid\n      isVerified\n      isGenericEmail\n    }\n    lastRepeatEnquiryDate\n    lastRepeatEnquirySource\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n      externalReferenceSourceDate\n    }\n    gender\n    isDecisionMaker\n    isPrivate\n    lockPeriod\n    name\n    preferredContactDays\n    profilePhotoUrl\n    referredBy\n    salutation\n    seniority\n    updatedById\n    hasTask\n    openTaskActivityType\n    lastCalledTime\n    lastCallDirection\n    lastCallOutcome\n    lastCallOutcomeNature\n    lastCallUserId\n    lastCallDuration\n    lastCallEngagementId\n    lastVisitTime\n    lastVisitOutcome\n    lastVisitOutcomeNature\n    lastVisitUserId\n    lastVisitEngagementId\n    lastEmailTime\n    lastEmailUserId\n    lastEmailEngagementId\n    lastWhatsappTime\n    lastWhatsappUserId\n    lastWhatsappEngagementId\n    lastWabaBroadcastTime\n    lastWabaBroadcastStatus\n    lastWabaBroadcastTemplate\n    lastWabaBroadcastReplyBody\n    lastWabaBroadcastReplyTime\n    lastWabaBroadcastReplyType\n    lastSmsTime\n    lastSmsUserId\n    lastSmsEngagementId\n    lastNoteAddedTime\n    lastNoteUserId\n    lastNoteEngagementId\n    lastTaskDoneTime\n    lastTaskDoneUserId\n    lastTaskDoneEngagementId\n    openTaskCount\n    lastKnownDisposition\n    lastKnownDispositionTime\n    lastLeadAssignmentDateTime\n    lastEngagementFromAccount\n    lastEngagementFromContact\n    freshLeadTag\n    noWorkAfterAssignment\n    needFollowUpTag\n    needFollowUpTagUpdatedAt\n    activeDealStage\n    activeDealStageUpdatedAt\n    dealDescription\n    isCustomer\n    becameCustomerOn\n    unsuccessfulCallAttempts\n    leadCallsNotAnswered\n    userDefinedTags\n    productService\n    bulkUploadReference\n    assignmentMethod\n    whatsappOptInStatus\n    recentEngagements\n    recentEngagementsUpdatedAt\n    openTaskDetail\n    openVideoCallDetail\n    lastClosedTaskDetail\n    lastClosedTaskDetailUpdatedAt\n    latestRemark\n    customAttributes\n    paymentRequestDetail\n    lastPaymentStatus\n    customDataAddedFromAddContactForm\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    manualClosedReason\n    lastDealStageType\n    prospectingAttempts\n    totalProspectingAttemptsAcrossRechurn\n    numberOfTimesRechurned\n    lastProspectingDoneOn\n    firstProspectingDoneOn\n    nextProspectingDueOn\n    nextProspectingSetBy\n    nextProspectingNote\n    movedToOpportunityOn\n    movedToClosedOn\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    chatChannels {\n      __typename\n      nextToken\n    }\n    deals {\n      __typename\n      nextToken\n    }\n    linkedFiles {\n      __typename\n      nextToken\n    }\n    businesses {\n      __typename\n      nextToken\n    }\n    contactNumbers {\n      __typename\n      nextToken\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    assignedTo {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    blockedForCallBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastCallUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastVisitUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastEmailUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastWhatsappUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastSmsUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastNoteUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastTaskDoneUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
                return new Account(string, str, string2, accountTypeValueOf, string4, str2, string5 != null ? AccountStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readString(responseFieldArr[31]), responseReader.readString(responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readInt(responseFieldArr[34]), responseReader.readBoolean(responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readList(responseFieldArr[39], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readBoolean(responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readList(responseFieldArr[45], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[46], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readList(responseFieldArr[51], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.Mapper.5
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.1
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
                    responseWriter.writeList(responseFieldArr[15], Account.this.productOrService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.1.1
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
                    responseWriter.writeList(responseFieldArr[39], Account.this.permissions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.1.2
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
                    responseWriter.writeList(responseFieldArr[45], Account.this.salesmaxSalesContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[46], Account.this.salesmaxSupportContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], Account.this.chatWidgetConfig);
                    responseWriter.writeString(responseFieldArr[48], Account.this.onboardingStatus);
                    responseWriter.writeString(responseFieldArr[49], Account.this.integrationNeeded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], Account.this.matchingDealId);
                    responseWriter.writeList(responseFieldArr[51], Account.this.relatedAccountIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Account.1.5
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.AddedBy.1
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

    public static class Address {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("addressType", "addressType", null, true, Collections.emptyList()), ResponseField.forString("establishmentName", "establishmentName", null, true, Collections.emptyList()), ResponseField.forString("area", "area", null, true, Collections.emptyList()), ResponseField.forString("city", "city", null, true, Collections.emptyList()), ResponseField.forString("country", "country", null, true, Collections.emptyList()), ResponseField.forString("googlePlaceId", "googlePlaceId", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrimaryAddress", "isPrimaryAddress", null, true, Collections.emptyList()), ResponseField.forString("landmark", "landmark", null, true, Collections.emptyList()), ResponseField.forString("lat", "lat", null, true, Collections.emptyList()), ResponseField.forString("lng", "lng", null, true, Collections.emptyList()), ResponseField.forString("rawAddressText", "rawAddressText", null, true, Collections.emptyList()), ResponseField.forString(TransferTable.COLUMN_REGION, TransferTable.COLUMN_REGION, null, true, Collections.emptyList()), ResponseField.forString("state", "state", null, true, Collections.emptyList()), ResponseField.forString("streetAddress", "streetAddress", null, true, Collections.emptyList()), ResponseField.forString("zipcode", "zipcode", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String addressType;
        final String area;
        final String city;
        final String country;
        final String establishmentName;
        final String googlePlaceId;
        final Boolean isPrimaryAddress;
        final String landmark;
        final String lat;
        final String lng;
        final String rawAddressText;
        final String region;
        final String state;
        final String streetAddress;
        final String zipcode;

        public static final class Mapper implements ResponseFieldMapper<Address> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Address map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Address.$responseFields;
                return new Address(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]));
            }
        }

        public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.addressType = str2;
            this.establishmentName = str3;
            this.area = str4;
            this.city = str5;
            this.country = str6;
            this.googlePlaceId = str7;
            this.isPrimaryAddress = bool;
            this.landmark = str8;
            this.lat = str9;
            this.lng = str10;
            this.rawAddressText = str11;
            this.region = str12;
            this.state = str13;
            this.streetAddress = str14;
            this.zipcode = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public String addressType() {
            return this.addressType;
        }

        public String area() {
            return this.area;
        }

        public String city() {
            return this.city;
        }

        public String country() {
            return this.country;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Boolean bool;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            if (this.__typename.equals(address.__typename) && ((str = this.addressType) != null ? str.equals(address.addressType) : address.addressType == null) && ((str2 = this.establishmentName) != null ? str2.equals(address.establishmentName) : address.establishmentName == null) && ((str3 = this.area) != null ? str3.equals(address.area) : address.area == null) && ((str4 = this.city) != null ? str4.equals(address.city) : address.city == null) && ((str5 = this.country) != null ? str5.equals(address.country) : address.country == null) && ((str6 = this.googlePlaceId) != null ? str6.equals(address.googlePlaceId) : address.googlePlaceId == null) && ((bool = this.isPrimaryAddress) != null ? bool.equals(address.isPrimaryAddress) : address.isPrimaryAddress == null) && ((str7 = this.landmark) != null ? str7.equals(address.landmark) : address.landmark == null) && ((str8 = this.lat) != null ? str8.equals(address.lat) : address.lat == null) && ((str9 = this.lng) != null ? str9.equals(address.lng) : address.lng == null) && ((str10 = this.rawAddressText) != null ? str10.equals(address.rawAddressText) : address.rawAddressText == null) && ((str11 = this.region) != null ? str11.equals(address.region) : address.region == null) && ((str12 = this.state) != null ? str12.equals(address.state) : address.state == null) && ((str13 = this.streetAddress) != null ? str13.equals(address.streetAddress) : address.streetAddress == null)) {
                String str14 = this.zipcode;
                String str15 = address.zipcode;
                if (str14 == null) {
                    if (str15 == null) {
                        return true;
                    }
                } else if (str14.equals(str15)) {
                    return true;
                }
            }
            return false;
        }

        public String establishmentName() {
            return this.establishmentName;
        }

        public String googlePlaceId() {
            return this.googlePlaceId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.addressType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.establishmentName;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.area;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.city;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.country;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.googlePlaceId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Boolean bool = this.isPrimaryAddress;
                int iHashCode8 = (iHashCode7 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str7 = this.landmark;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.lat;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.lng;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.rawAddressText;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.region;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.state;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.streetAddress;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.zipcode;
                this.$hashCode = iHashCode15 ^ (str14 != null ? str14.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Boolean isPrimaryAddress() {
            return this.isPrimaryAddress;
        }

        public String landmark() {
            return this.landmark;
        }

        public String lat() {
            return this.lat;
        }

        public String lng() {
            return this.lng;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Address.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Address.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Address.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Address.this.addressType);
                    responseWriter.writeString(responseFieldArr[2], Address.this.establishmentName);
                    responseWriter.writeString(responseFieldArr[3], Address.this.area);
                    responseWriter.writeString(responseFieldArr[4], Address.this.city);
                    responseWriter.writeString(responseFieldArr[5], Address.this.country);
                    responseWriter.writeString(responseFieldArr[6], Address.this.googlePlaceId);
                    responseWriter.writeBoolean(responseFieldArr[7], Address.this.isPrimaryAddress);
                    responseWriter.writeString(responseFieldArr[8], Address.this.landmark);
                    responseWriter.writeString(responseFieldArr[9], Address.this.lat);
                    responseWriter.writeString(responseFieldArr[10], Address.this.lng);
                    responseWriter.writeString(responseFieldArr[11], Address.this.rawAddressText);
                    responseWriter.writeString(responseFieldArr[12], Address.this.region);
                    responseWriter.writeString(responseFieldArr[13], Address.this.state);
                    responseWriter.writeString(responseFieldArr[14], Address.this.streetAddress);
                    responseWriter.writeString(responseFieldArr[15], Address.this.zipcode);
                }
            };
        }

        public String rawAddressText() {
            return this.rawAddressText;
        }

        public String region() {
            return this.region;
        }

        public String state() {
            return this.state;
        }

        public String streetAddress() {
            return this.streetAddress;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Address{__typename=" + this.__typename + ", addressType=" + this.addressType + ", establishmentName=" + this.establishmentName + ", area=" + this.area + ", city=" + this.city + ", country=" + this.country + ", googlePlaceId=" + this.googlePlaceId + ", isPrimaryAddress=" + this.isPrimaryAddress + ", landmark=" + this.landmark + ", lat=" + this.lat + ", lng=" + this.lng + ", rawAddressText=" + this.rawAddressText + ", region=" + this.region + ", state=" + this.state + ", streetAddress=" + this.streetAddress + ", zipcode=" + this.zipcode + "}";
            }
            return this.$toString;
        }

        public String zipcode() {
            return this.zipcode;
        }
    }

    public static class AssignedTo {
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

        public static final class Mapper implements ResponseFieldMapper<AssignedTo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AssignedTo map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AssignedTo.$responseFields;
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
                return new AssignedTo(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public AssignedTo(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof AssignedTo)) {
                return false;
            }
            AssignedTo assignedTo = (AssignedTo) obj;
            if (this.__typename.equals(assignedTo.__typename) && this.id.equals(assignedTo.id) && this.addedSourceType.equals(assignedTo.addedSourceType) && this.name.equals(assignedTo.name) && ((str = this.profilePictureUrl) != null ? str.equals(assignedTo.profilePictureUrl) : assignedTo.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(assignedTo.registeredEmail) : assignedTo.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(assignedTo.registeredEmailVerified) : assignedTo.registeredEmailVerified == null) && this.registeredNumber.equals(assignedTo.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(assignedTo.registeredNumberVerified) : assignedTo.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(assignedTo.secondaryNumber) : assignedTo.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(assignedTo.secondaryNumberVerified) : assignedTo.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(assignedTo.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(assignedTo.lastSelectedAccountWeb) : assignedTo.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(assignedTo.lastSelectedAccountApp) : assignedTo.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(assignedTo.appVersion) : assignedTo.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(assignedTo.deviceModel) : assignedTo.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(assignedTo.deviceManufacturer) : assignedTo.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(assignedTo.androidVersionRelease) : assignedTo.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(assignedTo.createdAt) : assignedTo.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = assignedTo.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.AssignedTo.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AssignedTo.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AssignedTo.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], AssignedTo.this.id);
                    responseWriter.writeString(responseFieldArr[2], AssignedTo.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], AssignedTo.this.name);
                    responseWriter.writeString(responseFieldArr[4], AssignedTo.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], AssignedTo.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], AssignedTo.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], AssignedTo.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], AssignedTo.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], AssignedTo.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], AssignedTo.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], AssignedTo.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], AssignedTo.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], AssignedTo.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], AssignedTo.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], AssignedTo.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], AssignedTo.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], AssignedTo.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], AssignedTo.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], AssignedTo.this.updatedAt);
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
                this.$toString = "AssignedTo{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class BlockedForCallBy {
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

        public static final class Mapper implements ResponseFieldMapper<BlockedForCallBy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public BlockedForCallBy map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = BlockedForCallBy.$responseFields;
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
                return new BlockedForCallBy(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public BlockedForCallBy(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof BlockedForCallBy)) {
                return false;
            }
            BlockedForCallBy blockedForCallBy = (BlockedForCallBy) obj;
            if (this.__typename.equals(blockedForCallBy.__typename) && this.id.equals(blockedForCallBy.id) && this.addedSourceType.equals(blockedForCallBy.addedSourceType) && this.name.equals(blockedForCallBy.name) && ((str = this.profilePictureUrl) != null ? str.equals(blockedForCallBy.profilePictureUrl) : blockedForCallBy.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(blockedForCallBy.registeredEmail) : blockedForCallBy.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(blockedForCallBy.registeredEmailVerified) : blockedForCallBy.registeredEmailVerified == null) && this.registeredNumber.equals(blockedForCallBy.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(blockedForCallBy.registeredNumberVerified) : blockedForCallBy.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(blockedForCallBy.secondaryNumber) : blockedForCallBy.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(blockedForCallBy.secondaryNumberVerified) : blockedForCallBy.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(blockedForCallBy.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(blockedForCallBy.lastSelectedAccountWeb) : blockedForCallBy.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(blockedForCallBy.lastSelectedAccountApp) : blockedForCallBy.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(blockedForCallBy.appVersion) : blockedForCallBy.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(blockedForCallBy.deviceModel) : blockedForCallBy.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(blockedForCallBy.deviceManufacturer) : blockedForCallBy.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(blockedForCallBy.androidVersionRelease) : blockedForCallBy.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(blockedForCallBy.createdAt) : blockedForCallBy.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = blockedForCallBy.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.BlockedForCallBy.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = BlockedForCallBy.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], BlockedForCallBy.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], BlockedForCallBy.this.id);
                    responseWriter.writeString(responseFieldArr[2], BlockedForCallBy.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], BlockedForCallBy.this.name);
                    responseWriter.writeString(responseFieldArr[4], BlockedForCallBy.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], BlockedForCallBy.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], BlockedForCallBy.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], BlockedForCallBy.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], BlockedForCallBy.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], BlockedForCallBy.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], BlockedForCallBy.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], BlockedForCallBy.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], BlockedForCallBy.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], BlockedForCallBy.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], BlockedForCallBy.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], BlockedForCallBy.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], BlockedForCallBy.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], BlockedForCallBy.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], BlockedForCallBy.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], BlockedForCallBy.this.updatedAt);
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
                this.$toString = "BlockedForCallBy{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        private String accountId;
        private String ownerId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public OnCreateContactWithNumberUserLevelSubscription build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            return new OnCreateContactWithNumberUserLevelSubscription(this.accountId, this.ownerId);
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
            return this;
        }
    }

    public static class BusinessDetail {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, CustomType.ID, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forCustomType("website", "website", null, true, CustomType.AWSURL, Collections.emptyList()), ResponseField.forString("industry", "industry", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String id;
        final String industry;
        final String name;
        final String website;

        public static final class Mapper implements ResponseFieldMapper<BusinessDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public BusinessDetail map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = BusinessDetail.$responseFields;
                return new BusinessDetail(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]));
            }
        }

        public BusinessDetail(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.name = (String) Utils.checkNotNull(str3, "name == null");
            this.website = str4;
            this.industry = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BusinessDetail)) {
                return false;
            }
            BusinessDetail businessDetail = (BusinessDetail) obj;
            if (this.__typename.equals(businessDetail.__typename) && this.id.equals(businessDetail.id) && this.name.equals(businessDetail.name) && ((str = this.website) != null ? str.equals(businessDetail.website) : businessDetail.website == null)) {
                String str2 = this.industry;
                String str3 = businessDetail.industry;
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
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.website;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.industry;
                this.$hashCode = iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
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

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.BusinessDetail.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = BusinessDetail.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], BusinessDetail.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], BusinessDetail.this.id);
                    responseWriter.writeString(responseFieldArr[2], BusinessDetail.this.name);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], BusinessDetail.this.website);
                    responseWriter.writeString(responseFieldArr[4], BusinessDetail.this.industry);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BusinessDetail{__typename=" + this.__typename + ", id=" + this.id + ", name=" + this.name + ", website=" + this.website + ", industry=" + this.industry + "}";
            }
            return this.$toString;
        }

        public String website() {
            return this.website;
        }
    }

    public static class Businesses {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Businesses> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Businesses map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Businesses.$responseFields;
                return new Businesses(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Businesses(String str, String str2) {
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
            if (!(obj instanceof Businesses)) {
                return false;
            }
            Businesses businesses = (Businesses) obj;
            if (this.__typename.equals(businesses.__typename)) {
                String str = this.nextToken;
                String str2 = businesses.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Businesses.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Businesses.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Businesses.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Businesses.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Businesses{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class ChatChannels {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ChatChannels> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ChatChannels map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ChatChannels.$responseFields;
                return new ChatChannels(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public ChatChannels(String str, String str2) {
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
            if (!(obj instanceof ChatChannels)) {
                return false;
            }
            ChatChannels chatChannels = (ChatChannels) obj;
            if (this.__typename.equals(chatChannels.__typename)) {
                String str = this.nextToken;
                String str2 = chatChannels.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.ChatChannels.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ChatChannels.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ChatChannels.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ChatChannels.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ChatChannels{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class ContactNumberDetail {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("contactNumberType", "contactNumberType", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrimary", "isPrimary", null, true, Collections.emptyList()), ResponseField.forBoolean("isValid", "isValid", null, true, Collections.emptyList()), ResponseField.forBoolean("isWhatsappNumber", "isWhatsappNumber", null, true, Collections.emptyList()), ResponseField.forBoolean("isVerified", "isVerified", null, true, Collections.emptyList()), ResponseField.forBoolean("isWrongNumber", "isWrongNumber", null, true, Collections.emptyList()), ResponseField.forCustomType("phoneNumber", "phoneNumber", null, true, CustomType.AWSPHONE, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final ContactNumberType contactNumberType;
        final Boolean isPrimary;
        final Boolean isValid;
        final Boolean isVerified;
        final Boolean isWhatsappNumber;
        final Boolean isWrongNumber;
        final String phoneNumber;

        public static final class Mapper implements ResponseFieldMapper<ContactNumberDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ContactNumberDetail map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ContactNumberDetail.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String string2 = responseReader.readString(responseFieldArr[1]);
                return new ContactNumberDetail(string, string2 != null ? ContactNumberType.valueOf(string2) : null, responseReader.readBoolean(responseFieldArr[2]), responseReader.readBoolean(responseFieldArr[3]), responseReader.readBoolean(responseFieldArr[4]), responseReader.readBoolean(responseFieldArr[5]), responseReader.readBoolean(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]));
            }
        }

        public ContactNumberDetail(String str, ContactNumberType contactNumberType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.contactNumberType = contactNumberType;
            this.isPrimary = bool;
            this.isValid = bool2;
            this.isWhatsappNumber = bool3;
            this.isVerified = bool4;
            this.isWrongNumber = bool5;
            this.phoneNumber = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public ContactNumberType contactNumberType() {
            return this.contactNumberType;
        }

        public boolean equals(Object obj) {
            ContactNumberType contactNumberType;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ContactNumberDetail)) {
                return false;
            }
            ContactNumberDetail contactNumberDetail = (ContactNumberDetail) obj;
            if (this.__typename.equals(contactNumberDetail.__typename) && ((contactNumberType = this.contactNumberType) != null ? contactNumberType.equals(contactNumberDetail.contactNumberType) : contactNumberDetail.contactNumberType == null) && ((bool = this.isPrimary) != null ? bool.equals(contactNumberDetail.isPrimary) : contactNumberDetail.isPrimary == null) && ((bool2 = this.isValid) != null ? bool2.equals(contactNumberDetail.isValid) : contactNumberDetail.isValid == null) && ((bool3 = this.isWhatsappNumber) != null ? bool3.equals(contactNumberDetail.isWhatsappNumber) : contactNumberDetail.isWhatsappNumber == null) && ((bool4 = this.isVerified) != null ? bool4.equals(contactNumberDetail.isVerified) : contactNumberDetail.isVerified == null) && ((bool5 = this.isWrongNumber) != null ? bool5.equals(contactNumberDetail.isWrongNumber) : contactNumberDetail.isWrongNumber == null)) {
                String str = this.phoneNumber;
                String str2 = contactNumberDetail.phoneNumber;
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
                ContactNumberType contactNumberType = this.contactNumberType;
                int iHashCode2 = (iHashCode ^ (contactNumberType == null ? 0 : contactNumberType.hashCode())) * 1000003;
                Boolean bool = this.isPrimary;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.isValid;
                int iHashCode4 = (iHashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.isWhatsappNumber;
                int iHashCode5 = (iHashCode4 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.isVerified;
                int iHashCode6 = (iHashCode5 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                Boolean bool5 = this.isWrongNumber;
                int iHashCode7 = (iHashCode6 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                String str = this.phoneNumber;
                this.$hashCode = iHashCode7 ^ (str != null ? str.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Boolean isPrimary() {
            return this.isPrimary;
        }

        public Boolean isValid() {
            return this.isValid;
        }

        public Boolean isVerified() {
            return this.isVerified;
        }

        public Boolean isWhatsappNumber() {
            return this.isWhatsappNumber;
        }

        public Boolean isWrongNumber() {
            return this.isWrongNumber;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.ContactNumberDetail.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ContactNumberDetail.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ContactNumberDetail.this.__typename);
                    ResponseField responseField = responseFieldArr[1];
                    ContactNumberType contactNumberType = ContactNumberDetail.this.contactNumberType;
                    responseWriter.writeString(responseField, contactNumberType != null ? contactNumberType.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[2], ContactNumberDetail.this.isPrimary);
                    responseWriter.writeBoolean(responseFieldArr[3], ContactNumberDetail.this.isValid);
                    responseWriter.writeBoolean(responseFieldArr[4], ContactNumberDetail.this.isWhatsappNumber);
                    responseWriter.writeBoolean(responseFieldArr[5], ContactNumberDetail.this.isVerified);
                    responseWriter.writeBoolean(responseFieldArr[6], ContactNumberDetail.this.isWrongNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], ContactNumberDetail.this.phoneNumber);
                }
            };
        }

        public String phoneNumber() {
            return this.phoneNumber;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ContactNumberDetail{__typename=" + this.__typename + ", contactNumberType=" + this.contactNumberType + ", isPrimary=" + this.isPrimary + ", isValid=" + this.isValid + ", isWhatsappNumber=" + this.isWhatsappNumber + ", isVerified=" + this.isVerified + ", isWrongNumber=" + this.isWrongNumber + ", phoneNumber=" + this.phoneNumber + "}";
            }
            return this.$toString;
        }
    }

    public static class ContactNumbers {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ContactNumbers> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ContactNumbers map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ContactNumbers.$responseFields;
                return new ContactNumbers(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public ContactNumbers(String str, String str2) {
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
            if (!(obj instanceof ContactNumbers)) {
                return false;
            }
            ContactNumbers contactNumbers = (ContactNumbers) obj;
            if (this.__typename.equals(contactNumbers.__typename)) {
                String str = this.nextToken;
                String str2 = contactNumbers.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.ContactNumbers.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ContactNumbers.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ContactNumbers.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ContactNumbers.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ContactNumbers{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onCreateContactWithNumberUserLevel", "onCreateContactWithNumberUserLevel", new UnmodifiableMapBuilder(2).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("ownerId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "ownerId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnCreateContactWithNumberUserLevel onCreateContactWithNumberUserLevel;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnCreateContactWithNumberUserLevel.Mapper onCreateContactWithNumberUserLevelFieldMapper = new OnCreateContactWithNumberUserLevel.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnCreateContactWithNumberUserLevel) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnCreateContactWithNumberUserLevel>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnCreateContactWithNumberUserLevel read(ResponseReader responseReader2) {
                        return Mapper.this.onCreateContactWithNumberUserLevelFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnCreateContactWithNumberUserLevel onCreateContactWithNumberUserLevel) {
            this.onCreateContactWithNumberUserLevel = onCreateContactWithNumberUserLevel;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnCreateContactWithNumberUserLevel onCreateContactWithNumberUserLevel = this.onCreateContactWithNumberUserLevel;
            OnCreateContactWithNumberUserLevel onCreateContactWithNumberUserLevel2 = ((Data) obj).onCreateContactWithNumberUserLevel;
            return onCreateContactWithNumberUserLevel == null ? onCreateContactWithNumberUserLevel2 == null : onCreateContactWithNumberUserLevel.equals(onCreateContactWithNumberUserLevel2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnCreateContactWithNumberUserLevel onCreateContactWithNumberUserLevel = this.onCreateContactWithNumberUserLevel;
                this.$hashCode = (onCreateContactWithNumberUserLevel == null ? 0 : onCreateContactWithNumberUserLevel.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnCreateContactWithNumberUserLevel onCreateContactWithNumberUserLevel = Data.this.onCreateContactWithNumberUserLevel;
                    responseWriter.writeObject(responseField, onCreateContactWithNumberUserLevel != null ? onCreateContactWithNumberUserLevel.marshaller() : null);
                }
            };
        }

        public OnCreateContactWithNumberUserLevel onCreateContactWithNumberUserLevel() {
            return this.onCreateContactWithNumberUserLevel;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onCreateContactWithNumberUserLevel=" + this.onCreateContactWithNumberUserLevel + "}";
            }
            return this.$toString;
        }
    }

    public static class Deals {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Deals> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Deals map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Deals.$responseFields;
                return new Deals(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Deals(String str, String str2) {
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
            if (!(obj instanceof Deals)) {
                return false;
            }
            Deals deals = (Deals) obj;
            if (this.__typename.equals(deals.__typename)) {
                String str = this.nextToken;
                String str2 = deals.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Deals.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Deals.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Deals.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Deals.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Deals{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Email {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("email", "email", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forString("fullName", "fullName", null, true, Collections.emptyList()), ResponseField.forBoolean("isDisposableEmail", "isDisposableEmail", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrimary", "isPrimary", null, true, Collections.emptyList()), ResponseField.forBoolean("isPublicEmail", "isPublicEmail", null, true, Collections.emptyList()), ResponseField.forBoolean("isValid", "isValid", null, true, Collections.emptyList()), ResponseField.forBoolean("isVerified", "isVerified", null, true, Collections.emptyList()), ResponseField.forBoolean("isGenericEmail", "isGenericEmail", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String email;
        final String fullName;
        final Boolean isDisposableEmail;
        final Boolean isGenericEmail;
        final Boolean isPrimary;
        final Boolean isPublicEmail;
        final Boolean isValid;
        final Boolean isVerified;

        public static final class Mapper implements ResponseFieldMapper<Email> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Email map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Email.$responseFields;
                return new Email(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readBoolean(responseFieldArr[3]), responseReader.readBoolean(responseFieldArr[4]), responseReader.readBoolean(responseFieldArr[5]), responseReader.readBoolean(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readBoolean(responseFieldArr[8]));
            }
        }

        public Email(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.email = str2;
            this.fullName = str3;
            this.isDisposableEmail = bool;
            this.isPrimary = bool2;
            this.isPublicEmail = bool3;
            this.isValid = bool4;
            this.isVerified = bool5;
            this.isGenericEmail = bool6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String email() {
            return this.email;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Email)) {
                return false;
            }
            Email email = (Email) obj;
            if (this.__typename.equals(email.__typename) && ((str = this.email) != null ? str.equals(email.email) : email.email == null) && ((str2 = this.fullName) != null ? str2.equals(email.fullName) : email.fullName == null) && ((bool = this.isDisposableEmail) != null ? bool.equals(email.isDisposableEmail) : email.isDisposableEmail == null) && ((bool2 = this.isPrimary) != null ? bool2.equals(email.isPrimary) : email.isPrimary == null) && ((bool3 = this.isPublicEmail) != null ? bool3.equals(email.isPublicEmail) : email.isPublicEmail == null) && ((bool4 = this.isValid) != null ? bool4.equals(email.isValid) : email.isValid == null) && ((bool5 = this.isVerified) != null ? bool5.equals(email.isVerified) : email.isVerified == null)) {
                Boolean bool6 = this.isGenericEmail;
                Boolean bool7 = email.isGenericEmail;
                if (bool6 == null) {
                    if (bool7 == null) {
                        return true;
                    }
                } else if (bool6.equals(bool7)) {
                    return true;
                }
            }
            return false;
        }

        public String fullName() {
            return this.fullName;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.email;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.fullName;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.isDisposableEmail;
                int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.isPrimary;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.isPublicEmail;
                int iHashCode6 = (iHashCode5 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.isValid;
                int iHashCode7 = (iHashCode6 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                Boolean bool5 = this.isVerified;
                int iHashCode8 = (iHashCode7 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Boolean bool6 = this.isGenericEmail;
                this.$hashCode = iHashCode8 ^ (bool6 != null ? bool6.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Boolean isDisposableEmail() {
            return this.isDisposableEmail;
        }

        public Boolean isGenericEmail() {
            return this.isGenericEmail;
        }

        public Boolean isPrimary() {
            return this.isPrimary;
        }

        public Boolean isPublicEmail() {
            return this.isPublicEmail;
        }

        public Boolean isValid() {
            return this.isValid;
        }

        public Boolean isVerified() {
            return this.isVerified;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Email.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Email.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Email.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Email.this.email);
                    responseWriter.writeString(responseFieldArr[2], Email.this.fullName);
                    responseWriter.writeBoolean(responseFieldArr[3], Email.this.isDisposableEmail);
                    responseWriter.writeBoolean(responseFieldArr[4], Email.this.isPrimary);
                    responseWriter.writeBoolean(responseFieldArr[5], Email.this.isPublicEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], Email.this.isValid);
                    responseWriter.writeBoolean(responseFieldArr[7], Email.this.isVerified);
                    responseWriter.writeBoolean(responseFieldArr[8], Email.this.isGenericEmail);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Email{__typename=" + this.__typename + ", email=" + this.email + ", fullName=" + this.fullName + ", isDisposableEmail=" + this.isDisposableEmail + ", isPrimary=" + this.isPrimary + ", isPublicEmail=" + this.isPublicEmail + ", isValid=" + this.isValid + ", isVerified=" + this.isVerified + ", isGenericEmail=" + this.isGenericEmail + "}";
            }
            return this.$toString;
        }
    }

    public static class ExternalReference {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("externalReferenceId", "externalReferenceId", null, false, Collections.emptyList()), ResponseField.forString("externalReferenceIdSource", "externalReferenceIdSource", null, false, Collections.emptyList()), ResponseField.forCustomType("externalReferenceSourceDate", "externalReferenceSourceDate", null, true, CustomType.AWSDATETIME, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String externalReferenceId;
        final String externalReferenceIdSource;
        final String externalReferenceSourceDate;

        public static final class Mapper implements ResponseFieldMapper<ExternalReference> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ExternalReference map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ExternalReference.$responseFields;
                return new ExternalReference(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]));
            }
        }

        public ExternalReference(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.externalReferenceId = (String) Utils.checkNotNull(str2, "externalReferenceId == null");
            this.externalReferenceIdSource = (String) Utils.checkNotNull(str3, "externalReferenceIdSource == null");
            this.externalReferenceSourceDate = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExternalReference)) {
                return false;
            }
            ExternalReference externalReference = (ExternalReference) obj;
            if (this.__typename.equals(externalReference.__typename) && this.externalReferenceId.equals(externalReference.externalReferenceId) && this.externalReferenceIdSource.equals(externalReference.externalReferenceIdSource)) {
                String str = this.externalReferenceSourceDate;
                String str2 = externalReference.externalReferenceSourceDate;
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

        public String externalReferenceId() {
            return this.externalReferenceId;
        }

        public String externalReferenceIdSource() {
            return this.externalReferenceIdSource;
        }

        public String externalReferenceSourceDate() {
            return this.externalReferenceSourceDate;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.externalReferenceId.hashCode()) * 1000003) ^ this.externalReferenceIdSource.hashCode()) * 1000003;
                String str = this.externalReferenceSourceDate;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.ExternalReference.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ExternalReference.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ExternalReference.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ExternalReference.this.externalReferenceId);
                    responseWriter.writeString(responseFieldArr[2], ExternalReference.this.externalReferenceIdSource);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], ExternalReference.this.externalReferenceSourceDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ExternalReference{__typename=" + this.__typename + ", externalReferenceId=" + this.externalReferenceId + ", externalReferenceIdSource=" + this.externalReferenceIdSource + ", externalReferenceSourceDate=" + this.externalReferenceSourceDate + "}";
            }
            return this.$toString;
        }
    }

    public static class LastCallUser {
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

        public static final class Mapper implements ResponseFieldMapper<LastCallUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastCallUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastCallUser.$responseFields;
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
                return new LastCallUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public LastCallUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof LastCallUser)) {
                return false;
            }
            LastCallUser lastCallUser = (LastCallUser) obj;
            if (this.__typename.equals(lastCallUser.__typename) && this.id.equals(lastCallUser.id) && this.addedSourceType.equals(lastCallUser.addedSourceType) && this.name.equals(lastCallUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(lastCallUser.profilePictureUrl) : lastCallUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(lastCallUser.registeredEmail) : lastCallUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(lastCallUser.registeredEmailVerified) : lastCallUser.registeredEmailVerified == null) && this.registeredNumber.equals(lastCallUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(lastCallUser.registeredNumberVerified) : lastCallUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(lastCallUser.secondaryNumber) : lastCallUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(lastCallUser.secondaryNumberVerified) : lastCallUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(lastCallUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(lastCallUser.lastSelectedAccountWeb) : lastCallUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(lastCallUser.lastSelectedAccountApp) : lastCallUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(lastCallUser.appVersion) : lastCallUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(lastCallUser.deviceModel) : lastCallUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(lastCallUser.deviceManufacturer) : lastCallUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(lastCallUser.androidVersionRelease) : lastCallUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(lastCallUser.createdAt) : lastCallUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = lastCallUser.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.LastCallUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastCallUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastCallUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastCallUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], LastCallUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], LastCallUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], LastCallUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], LastCallUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], LastCallUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], LastCallUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], LastCallUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastCallUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], LastCallUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], LastCallUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], LastCallUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], LastCallUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], LastCallUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], LastCallUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], LastCallUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], LastCallUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], LastCallUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], LastCallUser.this.updatedAt);
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
                this.$toString = "LastCallUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class LastEmailUser {
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

        public static final class Mapper implements ResponseFieldMapper<LastEmailUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastEmailUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastEmailUser.$responseFields;
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
                return new LastEmailUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public LastEmailUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof LastEmailUser)) {
                return false;
            }
            LastEmailUser lastEmailUser = (LastEmailUser) obj;
            if (this.__typename.equals(lastEmailUser.__typename) && this.id.equals(lastEmailUser.id) && this.addedSourceType.equals(lastEmailUser.addedSourceType) && this.name.equals(lastEmailUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(lastEmailUser.profilePictureUrl) : lastEmailUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(lastEmailUser.registeredEmail) : lastEmailUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(lastEmailUser.registeredEmailVerified) : lastEmailUser.registeredEmailVerified == null) && this.registeredNumber.equals(lastEmailUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(lastEmailUser.registeredNumberVerified) : lastEmailUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(lastEmailUser.secondaryNumber) : lastEmailUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(lastEmailUser.secondaryNumberVerified) : lastEmailUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(lastEmailUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(lastEmailUser.lastSelectedAccountWeb) : lastEmailUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(lastEmailUser.lastSelectedAccountApp) : lastEmailUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(lastEmailUser.appVersion) : lastEmailUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(lastEmailUser.deviceModel) : lastEmailUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(lastEmailUser.deviceManufacturer) : lastEmailUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(lastEmailUser.androidVersionRelease) : lastEmailUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(lastEmailUser.createdAt) : lastEmailUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = lastEmailUser.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.LastEmailUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastEmailUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastEmailUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastEmailUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], LastEmailUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], LastEmailUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], LastEmailUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], LastEmailUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], LastEmailUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], LastEmailUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], LastEmailUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastEmailUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], LastEmailUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], LastEmailUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], LastEmailUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], LastEmailUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], LastEmailUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], LastEmailUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], LastEmailUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], LastEmailUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], LastEmailUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], LastEmailUser.this.updatedAt);
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
                this.$toString = "LastEmailUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class LastNoteUser {
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

        public static final class Mapper implements ResponseFieldMapper<LastNoteUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastNoteUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastNoteUser.$responseFields;
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
                return new LastNoteUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public LastNoteUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof LastNoteUser)) {
                return false;
            }
            LastNoteUser lastNoteUser = (LastNoteUser) obj;
            if (this.__typename.equals(lastNoteUser.__typename) && this.id.equals(lastNoteUser.id) && this.addedSourceType.equals(lastNoteUser.addedSourceType) && this.name.equals(lastNoteUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(lastNoteUser.profilePictureUrl) : lastNoteUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(lastNoteUser.registeredEmail) : lastNoteUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(lastNoteUser.registeredEmailVerified) : lastNoteUser.registeredEmailVerified == null) && this.registeredNumber.equals(lastNoteUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(lastNoteUser.registeredNumberVerified) : lastNoteUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(lastNoteUser.secondaryNumber) : lastNoteUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(lastNoteUser.secondaryNumberVerified) : lastNoteUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(lastNoteUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(lastNoteUser.lastSelectedAccountWeb) : lastNoteUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(lastNoteUser.lastSelectedAccountApp) : lastNoteUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(lastNoteUser.appVersion) : lastNoteUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(lastNoteUser.deviceModel) : lastNoteUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(lastNoteUser.deviceManufacturer) : lastNoteUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(lastNoteUser.androidVersionRelease) : lastNoteUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(lastNoteUser.createdAt) : lastNoteUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = lastNoteUser.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.LastNoteUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastNoteUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastNoteUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastNoteUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], LastNoteUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], LastNoteUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], LastNoteUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], LastNoteUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], LastNoteUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], LastNoteUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], LastNoteUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastNoteUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], LastNoteUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], LastNoteUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], LastNoteUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], LastNoteUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], LastNoteUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], LastNoteUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], LastNoteUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], LastNoteUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], LastNoteUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], LastNoteUser.this.updatedAt);
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
                this.$toString = "LastNoteUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class LastSmsUser {
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

        public static final class Mapper implements ResponseFieldMapper<LastSmsUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastSmsUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastSmsUser.$responseFields;
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
                return new LastSmsUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public LastSmsUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof LastSmsUser)) {
                return false;
            }
            LastSmsUser lastSmsUser = (LastSmsUser) obj;
            if (this.__typename.equals(lastSmsUser.__typename) && this.id.equals(lastSmsUser.id) && this.addedSourceType.equals(lastSmsUser.addedSourceType) && this.name.equals(lastSmsUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(lastSmsUser.profilePictureUrl) : lastSmsUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(lastSmsUser.registeredEmail) : lastSmsUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(lastSmsUser.registeredEmailVerified) : lastSmsUser.registeredEmailVerified == null) && this.registeredNumber.equals(lastSmsUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(lastSmsUser.registeredNumberVerified) : lastSmsUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(lastSmsUser.secondaryNumber) : lastSmsUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(lastSmsUser.secondaryNumberVerified) : lastSmsUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(lastSmsUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(lastSmsUser.lastSelectedAccountWeb) : lastSmsUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(lastSmsUser.lastSelectedAccountApp) : lastSmsUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(lastSmsUser.appVersion) : lastSmsUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(lastSmsUser.deviceModel) : lastSmsUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(lastSmsUser.deviceManufacturer) : lastSmsUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(lastSmsUser.androidVersionRelease) : lastSmsUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(lastSmsUser.createdAt) : lastSmsUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = lastSmsUser.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.LastSmsUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastSmsUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastSmsUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastSmsUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], LastSmsUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], LastSmsUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], LastSmsUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], LastSmsUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], LastSmsUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], LastSmsUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], LastSmsUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastSmsUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], LastSmsUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], LastSmsUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], LastSmsUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], LastSmsUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], LastSmsUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], LastSmsUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], LastSmsUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], LastSmsUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], LastSmsUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], LastSmsUser.this.updatedAt);
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
                this.$toString = "LastSmsUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class LastTaskDoneUser {
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

        public static final class Mapper implements ResponseFieldMapper<LastTaskDoneUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastTaskDoneUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastTaskDoneUser.$responseFields;
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
                return new LastTaskDoneUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public LastTaskDoneUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof LastTaskDoneUser)) {
                return false;
            }
            LastTaskDoneUser lastTaskDoneUser = (LastTaskDoneUser) obj;
            if (this.__typename.equals(lastTaskDoneUser.__typename) && this.id.equals(lastTaskDoneUser.id) && this.addedSourceType.equals(lastTaskDoneUser.addedSourceType) && this.name.equals(lastTaskDoneUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(lastTaskDoneUser.profilePictureUrl) : lastTaskDoneUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(lastTaskDoneUser.registeredEmail) : lastTaskDoneUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(lastTaskDoneUser.registeredEmailVerified) : lastTaskDoneUser.registeredEmailVerified == null) && this.registeredNumber.equals(lastTaskDoneUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(lastTaskDoneUser.registeredNumberVerified) : lastTaskDoneUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(lastTaskDoneUser.secondaryNumber) : lastTaskDoneUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(lastTaskDoneUser.secondaryNumberVerified) : lastTaskDoneUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(lastTaskDoneUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(lastTaskDoneUser.lastSelectedAccountWeb) : lastTaskDoneUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(lastTaskDoneUser.lastSelectedAccountApp) : lastTaskDoneUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(lastTaskDoneUser.appVersion) : lastTaskDoneUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(lastTaskDoneUser.deviceModel) : lastTaskDoneUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(lastTaskDoneUser.deviceManufacturer) : lastTaskDoneUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(lastTaskDoneUser.androidVersionRelease) : lastTaskDoneUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(lastTaskDoneUser.createdAt) : lastTaskDoneUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = lastTaskDoneUser.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.LastTaskDoneUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastTaskDoneUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastTaskDoneUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastTaskDoneUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], LastTaskDoneUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], LastTaskDoneUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], LastTaskDoneUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], LastTaskDoneUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], LastTaskDoneUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], LastTaskDoneUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], LastTaskDoneUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastTaskDoneUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], LastTaskDoneUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], LastTaskDoneUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], LastTaskDoneUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], LastTaskDoneUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], LastTaskDoneUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], LastTaskDoneUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], LastTaskDoneUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], LastTaskDoneUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], LastTaskDoneUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], LastTaskDoneUser.this.updatedAt);
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
                this.$toString = "LastTaskDoneUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class LastVisitUser {
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

        public static final class Mapper implements ResponseFieldMapper<LastVisitUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastVisitUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastVisitUser.$responseFields;
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
                return new LastVisitUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public LastVisitUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof LastVisitUser)) {
                return false;
            }
            LastVisitUser lastVisitUser = (LastVisitUser) obj;
            if (this.__typename.equals(lastVisitUser.__typename) && this.id.equals(lastVisitUser.id) && this.addedSourceType.equals(lastVisitUser.addedSourceType) && this.name.equals(lastVisitUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(lastVisitUser.profilePictureUrl) : lastVisitUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(lastVisitUser.registeredEmail) : lastVisitUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(lastVisitUser.registeredEmailVerified) : lastVisitUser.registeredEmailVerified == null) && this.registeredNumber.equals(lastVisitUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(lastVisitUser.registeredNumberVerified) : lastVisitUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(lastVisitUser.secondaryNumber) : lastVisitUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(lastVisitUser.secondaryNumberVerified) : lastVisitUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(lastVisitUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(lastVisitUser.lastSelectedAccountWeb) : lastVisitUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(lastVisitUser.lastSelectedAccountApp) : lastVisitUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(lastVisitUser.appVersion) : lastVisitUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(lastVisitUser.deviceModel) : lastVisitUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(lastVisitUser.deviceManufacturer) : lastVisitUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(lastVisitUser.androidVersionRelease) : lastVisitUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(lastVisitUser.createdAt) : lastVisitUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = lastVisitUser.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.LastVisitUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastVisitUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastVisitUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastVisitUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], LastVisitUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], LastVisitUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], LastVisitUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], LastVisitUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], LastVisitUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], LastVisitUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], LastVisitUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastVisitUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], LastVisitUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], LastVisitUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], LastVisitUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], LastVisitUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], LastVisitUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], LastVisitUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], LastVisitUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], LastVisitUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], LastVisitUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], LastVisitUser.this.updatedAt);
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
                this.$toString = "LastVisitUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class LastWhatsappUser {
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

        public static final class Mapper implements ResponseFieldMapper<LastWhatsappUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastWhatsappUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastWhatsappUser.$responseFields;
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
                return new LastWhatsappUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public LastWhatsappUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof LastWhatsappUser)) {
                return false;
            }
            LastWhatsappUser lastWhatsappUser = (LastWhatsappUser) obj;
            if (this.__typename.equals(lastWhatsappUser.__typename) && this.id.equals(lastWhatsappUser.id) && this.addedSourceType.equals(lastWhatsappUser.addedSourceType) && this.name.equals(lastWhatsappUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(lastWhatsappUser.profilePictureUrl) : lastWhatsappUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(lastWhatsappUser.registeredEmail) : lastWhatsappUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(lastWhatsappUser.registeredEmailVerified) : lastWhatsappUser.registeredEmailVerified == null) && this.registeredNumber.equals(lastWhatsappUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(lastWhatsappUser.registeredNumberVerified) : lastWhatsappUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(lastWhatsappUser.secondaryNumber) : lastWhatsappUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(lastWhatsappUser.secondaryNumberVerified) : lastWhatsappUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(lastWhatsappUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(lastWhatsappUser.lastSelectedAccountWeb) : lastWhatsappUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(lastWhatsappUser.lastSelectedAccountApp) : lastWhatsappUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(lastWhatsappUser.appVersion) : lastWhatsappUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(lastWhatsappUser.deviceModel) : lastWhatsappUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(lastWhatsappUser.deviceManufacturer) : lastWhatsappUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(lastWhatsappUser.androidVersionRelease) : lastWhatsappUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(lastWhatsappUser.createdAt) : lastWhatsappUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = lastWhatsappUser.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.LastWhatsappUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastWhatsappUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastWhatsappUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastWhatsappUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], LastWhatsappUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], LastWhatsappUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], LastWhatsappUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], LastWhatsappUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], LastWhatsappUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], LastWhatsappUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], LastWhatsappUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastWhatsappUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], LastWhatsappUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], LastWhatsappUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], LastWhatsappUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], LastWhatsappUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], LastWhatsappUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], LastWhatsappUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], LastWhatsappUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], LastWhatsappUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], LastWhatsappUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], LastWhatsappUser.this.updatedAt);
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
                this.$toString = "LastWhatsappUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class LinkedFiles {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<LinkedFiles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LinkedFiles map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LinkedFiles.$responseFields;
                return new LinkedFiles(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public LinkedFiles(String str, String str2) {
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
            if (!(obj instanceof LinkedFiles)) {
                return false;
            }
            LinkedFiles linkedFiles = (LinkedFiles) obj;
            if (this.__typename.equals(linkedFiles.__typename)) {
                String str = this.nextToken;
                String str2 = linkedFiles.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.LinkedFiles.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LinkedFiles.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LinkedFiles.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], LinkedFiles.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LinkedFiles{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class OnCreateContactWithNumberUserLevel {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Account account;
        final String accountId;
        final String accountPriority;
        final String activeDealStage;
        final String activeDealStageUpdatedAt;
        final AddedBy addedBy;
        final String addedById;
        final List<Address> addresses;
        final AssignedTo assignedTo;
        final String assignedToId;
        final String assignmentMethod;
        final String becameCustomerOn;
        final BlockedForCallBy blockedForCallBy;
        final String blockedForCallById;
        final String blockedForCallReason;
        final String blockedForCallUntil;
        final String bulkUploadReference;
        final List<BusinessDetail> businessDetail;
        final Businesses businesses;
        final String callPriority;
        final ChatChannels chatChannels;
        final List<ContactNumberDetail> contactNumberDetail;
        final ContactNumbers contactNumbers;
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
        final Deals deals;
        final String department;
        final String designation;
        final List<Email> emails;
        final List<ExternalReference> externalReference;
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
        final LastCallUser lastCallUser;
        final String lastCallUserId;
        final String lastCalledTime;
        final String lastClosedTaskDetail;
        final String lastClosedTaskDetailUpdatedAt;
        final String lastDealStageType;
        final String lastEmailEngagementId;
        final String lastEmailTime;
        final LastEmailUser lastEmailUser;
        final String lastEmailUserId;
        final String lastEngagementFromAccount;
        final String lastEngagementFromContact;
        final String lastKnownDisposition;
        final String lastKnownDispositionTime;
        final String lastLeadAssignmentDateTime;
        final String lastNoteAddedTime;
        final String lastNoteEngagementId;
        final LastNoteUser lastNoteUser;
        final String lastNoteUserId;
        final String lastPaymentStatus;
        final String lastProspectingDoneOn;
        final String lastRepeatEnquiryDate;
        final String lastRepeatEnquirySource;
        final String lastSmsEngagementId;
        final String lastSmsTime;
        final LastSmsUser lastSmsUser;
        final String lastSmsUserId;
        final String lastTaskDoneEngagementId;
        final String lastTaskDoneTime;
        final LastTaskDoneUser lastTaskDoneUser;
        final String lastTaskDoneUserId;
        final String lastVisitEngagementId;
        final String lastVisitOutcome;
        final String lastVisitOutcomeNature;
        final String lastVisitTime;
        final LastVisitUser lastVisitUser;
        final String lastVisitUserId;
        final String lastWabaBroadcastReplyBody;
        final String lastWabaBroadcastReplyTime;
        final String lastWabaBroadcastReplyType;
        final String lastWabaBroadcastStatus;
        final String lastWabaBroadcastTemplate;
        final String lastWabaBroadcastTime;
        final String lastWhatsappEngagementId;
        final String lastWhatsappTime;
        final LastWhatsappUser lastWhatsappUser;
        final String lastWhatsappUserId;
        final String latestRemark;
        final Integer leadCallsNotAnswered;
        final LeadLifecycleStage leadLifecycleStage;
        final LeadLifecycleStageSubCategory leadLifecycleStageSubCategory;
        final LinkedFiles linkedFiles;
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
        final Owner owner;
        final String ownerId;
        final String paymentRequestDetail;
        final List<Day> preferredContactDays;
        final PrimaryTeam primaryTeam;
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
        final UpdatedBy updatedBy;
        final String updatedById;
        final List<String> userDefinedTags;
        final String waChatChannelId;
        final String whatsappOptInStatus;

        public static final class Mapper implements ResponseFieldMapper<OnCreateContactWithNumberUserLevel> {
            final PrimaryTeam.Mapper primaryTeamFieldMapper = new PrimaryTeam.Mapper();
            final Address.Mapper addressFieldMapper = new Address.Mapper();
            final ContactNumberDetail.Mapper contactNumberDetailFieldMapper = new ContactNumberDetail.Mapper();
            final BusinessDetail.Mapper businessDetailFieldMapper = new BusinessDetail.Mapper();
            final Email.Mapper emailFieldMapper = new Email.Mapper();
            final ExternalReference.Mapper externalReferenceFieldMapper = new ExternalReference.Mapper();
            final Account.Mapper accountFieldMapper = new Account.Mapper();
            final ChatChannels.Mapper chatChannelsFieldMapper = new ChatChannels.Mapper();
            final Deals.Mapper dealsFieldMapper = new Deals.Mapper();
            final LinkedFiles.Mapper linkedFilesFieldMapper = new LinkedFiles.Mapper();
            final Businesses.Mapper businessesFieldMapper = new Businesses.Mapper();
            final ContactNumbers.Mapper contactNumbersFieldMapper = new ContactNumbers.Mapper();
            final Owner.Mapper ownerFieldMapper = new Owner.Mapper();
            final AddedBy.Mapper addedByFieldMapper = new AddedBy.Mapper();
            final AssignedTo.Mapper assignedToFieldMapper = new AssignedTo.Mapper();
            final BlockedForCallBy.Mapper blockedForCallByFieldMapper = new BlockedForCallBy.Mapper();
            final UpdatedBy.Mapper updatedByFieldMapper = new UpdatedBy.Mapper();
            final LastCallUser.Mapper lastCallUserFieldMapper = new LastCallUser.Mapper();
            final LastVisitUser.Mapper lastVisitUserFieldMapper = new LastVisitUser.Mapper();
            final LastEmailUser.Mapper lastEmailUserFieldMapper = new LastEmailUser.Mapper();
            final LastWhatsappUser.Mapper lastWhatsappUserFieldMapper = new LastWhatsappUser.Mapper();
            final LastSmsUser.Mapper lastSmsUserFieldMapper = new LastSmsUser.Mapper();
            final LastNoteUser.Mapper lastNoteUserFieldMapper = new LastNoteUser.Mapper();
            final LastTaskDoneUser.Mapper lastTaskDoneUserFieldMapper = new LastTaskDoneUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnCreateContactWithNumberUserLevel map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnCreateContactWithNumberUserLevel.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                ContactAssignmentStatus contactAssignmentStatusValueOf = string2 != null ? ContactAssignmentStatus.valueOf(string2) : null;
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                PrimaryTeam primaryTeam = (PrimaryTeam) responseReader.readObject(responseFieldArr[7], new ResponseReader.ObjectReader<PrimaryTeam>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public PrimaryTeam read(ResponseReader responseReader2) {
                        return Mapper.this.primaryTeamFieldMapper.map(responseReader2);
                    }
                });
                List list2 = responseReader.readList(responseFieldArr[8], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String string3 = responseReader.readString(responseFieldArr[9]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                List list3 = responseReader.readList(responseFieldArr[11], new ResponseReader.ListReader<Address>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Address read(ResponseReader.ListItemReader listItemReader) {
                        return (Address) listItemReader.readObject(new ResponseReader.ObjectReader<Address>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.4.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Address read(ResponseReader responseReader2) {
                                return Mapper.this.addressFieldMapper.map(responseReader2);
                            }
                        });
                    }
                });
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                String string4 = responseReader.readString(responseFieldArr[14]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]);
                String string5 = responseReader.readString(responseFieldArr[16]);
                String str9 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]);
                List list4 = responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<ContactNumberDetail>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public ContactNumberDetail read(ResponseReader.ListItemReader listItemReader) {
                        return (ContactNumberDetail) listItemReader.readObject(new ResponseReader.ObjectReader<ContactNumberDetail>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.5.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public ContactNumberDetail read(ResponseReader responseReader2) {
                                return Mapper.this.contactNumberDetailFieldMapper.map(responseReader2);
                            }
                        });
                    }
                });
                List list5 = responseReader.readList(responseFieldArr[19], new ResponseReader.ListReader<BusinessDetail>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public BusinessDetail read(ResponseReader.ListItemReader listItemReader) {
                        return (BusinessDetail) listItemReader.readObject(new ResponseReader.ObjectReader<BusinessDetail>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.6.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public BusinessDetail read(ResponseReader responseReader2) {
                                return Mapper.this.businessDetailFieldMapper.map(responseReader2);
                            }
                        });
                    }
                });
                String string6 = responseReader.readString(responseFieldArr[20]);
                String string7 = responseReader.readString(responseFieldArr[21]);
                String string8 = responseReader.readString(responseFieldArr[22]);
                String string9 = responseReader.readString(responseFieldArr[23]);
                String str10 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]);
                String str11 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]);
                String str12 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]);
                String string10 = responseReader.readString(responseFieldArr[27]);
                ContactStatus contactStatusValueOf = string10 != null ? ContactStatus.valueOf(string10) : null;
                String string11 = responseReader.readString(responseFieldArr[28]);
                String string12 = responseReader.readString(responseFieldArr[29]);
                String string13 = responseReader.readString(responseFieldArr[30]);
                List list6 = responseReader.readList(responseFieldArr[31], new ResponseReader.ListReader<Email>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Email read(ResponseReader.ListItemReader listItemReader) {
                        return (Email) listItemReader.readObject(new ResponseReader.ObjectReader<Email>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.7.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Email read(ResponseReader responseReader2) {
                                return Mapper.this.emailFieldMapper.map(responseReader2);
                            }
                        });
                    }
                });
                String str13 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]);
                String string14 = responseReader.readString(responseFieldArr[33]);
                List list7 = responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<ExternalReference>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public ExternalReference read(ResponseReader.ListItemReader listItemReader) {
                        return (ExternalReference) listItemReader.readObject(new ResponseReader.ObjectReader<ExternalReference>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.8.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public ExternalReference read(ResponseReader responseReader2) {
                                return Mapper.this.externalReferenceFieldMapper.map(responseReader2);
                            }
                        });
                    }
                });
                String string15 = responseReader.readString(responseFieldArr[35]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[36]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[37]);
                String str14 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]);
                String string16 = responseReader.readString(responseFieldArr[39]);
                List list8 = responseReader.readList(responseFieldArr[40], new ResponseReader.ListReader<Day>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.9
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Day read(ResponseReader.ListItemReader listItemReader) {
                        return Day.valueOf(listItemReader.readString());
                    }
                });
                String string17 = responseReader.readString(responseFieldArr[41]);
                String string18 = responseReader.readString(responseFieldArr[42]);
                String string19 = responseReader.readString(responseFieldArr[43]);
                String string20 = responseReader.readString(responseFieldArr[44]);
                Seniority seniorityValueOf = string20 != null ? Seniority.valueOf(string20) : null;
                String str15 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[45]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[46]);
                String string21 = responseReader.readString(responseFieldArr[47]);
                TaskActivityType taskActivityTypeValueOf = string21 != null ? TaskActivityType.valueOf(string21) : null;
                String str16 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[48]);
                String string22 = responseReader.readString(responseFieldArr[49]);
                CallDirection callDirectionValueOf = string22 != null ? CallDirection.valueOf(string22) : null;
                String string23 = responseReader.readString(responseFieldArr[50]);
                String string24 = responseReader.readString(responseFieldArr[51]);
                String str17 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[52]);
                Integer num = responseReader.readInt(responseFieldArr[53]);
                String string25 = responseReader.readString(responseFieldArr[54]);
                String str18 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[55]);
                String string26 = responseReader.readString(responseFieldArr[56]);
                String string27 = responseReader.readString(responseFieldArr[57]);
                String str19 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[58]);
                String string28 = responseReader.readString(responseFieldArr[59]);
                String str20 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[60]);
                String str21 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[61]);
                String string29 = responseReader.readString(responseFieldArr[62]);
                String str22 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[63]);
                String str23 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[64]);
                String string30 = responseReader.readString(responseFieldArr[65]);
                String str24 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[66]);
                String string31 = responseReader.readString(responseFieldArr[67]);
                String string32 = responseReader.readString(responseFieldArr[68]);
                String string33 = responseReader.readString(responseFieldArr[69]);
                String str25 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[70]);
                String string34 = responseReader.readString(responseFieldArr[71]);
                String str26 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[72]);
                String str27 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[73]);
                String string35 = responseReader.readString(responseFieldArr[74]);
                String str28 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[75]);
                String str29 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[76]);
                String string36 = responseReader.readString(responseFieldArr[77]);
                String str30 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[78]);
                String str31 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[79]);
                String string37 = responseReader.readString(responseFieldArr[80]);
                Integer num2 = responseReader.readInt(responseFieldArr[81]);
                String string38 = responseReader.readString(responseFieldArr[82]);
                String str32 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[83]);
                String str33 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[84]);
                String str34 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[85]);
                String str35 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[86]);
                String string39 = responseReader.readString(responseFieldArr[87]);
                String string40 = responseReader.readString(responseFieldArr[88]);
                String string41 = responseReader.readString(responseFieldArr[89]);
                String str36 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[90]);
                String string42 = responseReader.readString(responseFieldArr[91]);
                String str37 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[92]);
                String string43 = responseReader.readString(responseFieldArr[93]);
                String string44 = responseReader.readString(responseFieldArr[94]);
                String str38 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[95]);
                Integer num3 = responseReader.readInt(responseFieldArr[96]);
                Integer num4 = responseReader.readInt(responseFieldArr[97]);
                List list9 = responseReader.readList(responseFieldArr[98], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.10
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                List list10 = responseReader.readList(responseFieldArr[99], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.11
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string45 = responseReader.readString(responseFieldArr[100]);
                String string46 = responseReader.readString(responseFieldArr[101]);
                String string47 = responseReader.readString(responseFieldArr[102]);
                List list11 = responseReader.readList(responseFieldArr[103], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.12
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                });
                String str39 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[104]);
                String str40 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[105]);
                String str41 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[106]);
                String str42 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[107]);
                String str43 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[108]);
                String str44 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[109]);
                String str45 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[110]);
                String str46 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[111]);
                String string48 = responseReader.readString(responseFieldArr[112]);
                String str47 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[113]);
                String string49 = responseReader.readString(responseFieldArr[114]);
                LeadLifecycleStage leadLifecycleStageValueOf = string49 != null ? LeadLifecycleStage.valueOf(string49) : null;
                String string50 = responseReader.readString(responseFieldArr[115]);
                return new OnCreateContactWithNumberUserLevel(string, str, str2, str3, contactAssignmentStatusValueOf, list, str4, primaryTeam, list2, string3, str5, list3, str6, str7, string4, str8, string5, str9, list4, list5, string6, string7, string8, string9, str10, str11, str12, contactStatusValueOf, string11, string12, string13, list6, str13, string14, list7, string15, bool, bool2, str14, string16, list8, string17, string18, string19, seniorityValueOf, str15, bool3, taskActivityTypeValueOf, str16, callDirectionValueOf, string23, string24, str17, num, string25, str18, string26, string27, str19, string28, str20, str21, string29, str22, str23, string30, str24, string31, string32, string33, str25, string34, str26, str27, string35, str28, str29, string36, str30, str31, string37, num2, string38, str32, str33, str34, str35, string39, string40, string41, str36, string42, str37, string43, string44, str38, num3, num4, list9, list10, string45, string46, string47, list11, str39, str40, str41, str42, str43, str44, str45, str46, string48, str47, leadLifecycleStageValueOf, string50 != null ? LeadLifecycleStageSubCategory.valueOf(string50) : null, responseReader.readString(responseFieldArr[116]), responseReader.readString(responseFieldArr[117]), responseReader.readInt(responseFieldArr[118]), responseReader.readInt(responseFieldArr[119]), responseReader.readInt(responseFieldArr[120]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[121]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[122]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[123]), responseReader.readString(responseFieldArr[124]), responseReader.readString(responseFieldArr[125]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[126]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[127]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[128]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[129]), (Account) responseReader.readObject(responseFieldArr[130], new ResponseReader.ObjectReader<Account>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.13
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Account read(ResponseReader responseReader2) {
                        return Mapper.this.accountFieldMapper.map(responseReader2);
                    }
                }), (ChatChannels) responseReader.readObject(responseFieldArr[131], new ResponseReader.ObjectReader<ChatChannels>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.14
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ChatChannels read(ResponseReader responseReader2) {
                        return Mapper.this.chatChannelsFieldMapper.map(responseReader2);
                    }
                }), (Deals) responseReader.readObject(responseFieldArr[132], new ResponseReader.ObjectReader<Deals>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.15
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Deals read(ResponseReader responseReader2) {
                        return Mapper.this.dealsFieldMapper.map(responseReader2);
                    }
                }), (LinkedFiles) responseReader.readObject(responseFieldArr[133], new ResponseReader.ObjectReader<LinkedFiles>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.16
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LinkedFiles read(ResponseReader responseReader2) {
                        return Mapper.this.linkedFilesFieldMapper.map(responseReader2);
                    }
                }), (Businesses) responseReader.readObject(responseFieldArr[134], new ResponseReader.ObjectReader<Businesses>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.17
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Businesses read(ResponseReader responseReader2) {
                        return Mapper.this.businessesFieldMapper.map(responseReader2);
                    }
                }), (ContactNumbers) responseReader.readObject(responseFieldArr[135], new ResponseReader.ObjectReader<ContactNumbers>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.18
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ContactNumbers read(ResponseReader responseReader2) {
                        return Mapper.this.contactNumbersFieldMapper.map(responseReader2);
                    }
                }), (Owner) responseReader.readObject(responseFieldArr[136], new ResponseReader.ObjectReader<Owner>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.19
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Owner read(ResponseReader responseReader2) {
                        return Mapper.this.ownerFieldMapper.map(responseReader2);
                    }
                }), (AddedBy) responseReader.readObject(responseFieldArr[137], new ResponseReader.ObjectReader<AddedBy>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.20
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AddedBy read(ResponseReader responseReader2) {
                        return Mapper.this.addedByFieldMapper.map(responseReader2);
                    }
                }), (AssignedTo) responseReader.readObject(responseFieldArr[138], new ResponseReader.ObjectReader<AssignedTo>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.21
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AssignedTo read(ResponseReader responseReader2) {
                        return Mapper.this.assignedToFieldMapper.map(responseReader2);
                    }
                }), (BlockedForCallBy) responseReader.readObject(responseFieldArr[139], new ResponseReader.ObjectReader<BlockedForCallBy>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.22
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public BlockedForCallBy read(ResponseReader responseReader2) {
                        return Mapper.this.blockedForCallByFieldMapper.map(responseReader2);
                    }
                }), (UpdatedBy) responseReader.readObject(responseFieldArr[140], new ResponseReader.ObjectReader<UpdatedBy>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.23
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdatedBy read(ResponseReader responseReader2) {
                        return Mapper.this.updatedByFieldMapper.map(responseReader2);
                    }
                }), (LastCallUser) responseReader.readObject(responseFieldArr[141], new ResponseReader.ObjectReader<LastCallUser>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.24
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastCallUser read(ResponseReader responseReader2) {
                        return Mapper.this.lastCallUserFieldMapper.map(responseReader2);
                    }
                }), (LastVisitUser) responseReader.readObject(responseFieldArr[142], new ResponseReader.ObjectReader<LastVisitUser>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.25
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastVisitUser read(ResponseReader responseReader2) {
                        return Mapper.this.lastVisitUserFieldMapper.map(responseReader2);
                    }
                }), (LastEmailUser) responseReader.readObject(responseFieldArr[143], new ResponseReader.ObjectReader<LastEmailUser>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.26
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastEmailUser read(ResponseReader responseReader2) {
                        return Mapper.this.lastEmailUserFieldMapper.map(responseReader2);
                    }
                }), (LastWhatsappUser) responseReader.readObject(responseFieldArr[144], new ResponseReader.ObjectReader<LastWhatsappUser>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.27
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastWhatsappUser read(ResponseReader responseReader2) {
                        return Mapper.this.lastWhatsappUserFieldMapper.map(responseReader2);
                    }
                }), (LastSmsUser) responseReader.readObject(responseFieldArr[145], new ResponseReader.ObjectReader<LastSmsUser>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.28
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastSmsUser read(ResponseReader responseReader2) {
                        return Mapper.this.lastSmsUserFieldMapper.map(responseReader2);
                    }
                }), (LastNoteUser) responseReader.readObject(responseFieldArr[146], new ResponseReader.ObjectReader<LastNoteUser>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.29
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastNoteUser read(ResponseReader responseReader2) {
                        return Mapper.this.lastNoteUserFieldMapper.map(responseReader2);
                    }
                }), (LastTaskDoneUser) responseReader.readObject(responseFieldArr[147], new ResponseReader.ObjectReader<LastTaskDoneUser>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.Mapper.30
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastTaskDoneUser read(ResponseReader responseReader2) {
                        return Mapper.this.lastTaskDoneUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forList("sharedOwners", "sharedOwners", null, true, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forObject("primaryTeam", "primaryTeam", null, true, Collections.emptyList()), ResponseField.forList("sharedTeams", "sharedTeams", null, true, Collections.emptyList()), ResponseField.forString("accountPriority", "accountPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forList("addresses", "addresses", null, true, Collections.emptyList()), ResponseField.forCustomType("assignedToId", "assignedToId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("blockedForCallById", "blockedForCallById", null, true, customType, Collections.emptyList()), ResponseField.forString("blockedForCallReason", "blockedForCallReason", null, true, Collections.emptyList()), ResponseField.forCustomType("blockedForCallUntil", "blockedForCallUntil", null, true, customType2, Collections.emptyList()), ResponseField.forString("callPriority", "callPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("waChatChannelId", "waChatChannelId", null, true, customType, Collections.emptyList()), ResponseField.forList("contactNumberDetail", "contactNumberDetail", null, true, Collections.emptyList()), ResponseField.forList("businessDetail", "businessDetail", null, true, Collections.emptyList()), ResponseField.forString("contactSource", "contactSource", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownOne", "contactSourceDrillDownOne", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownTwo", "contactSourceDrillDownTwo", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownThree", "contactSourceDrillDownThree", null, true, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownOneId", "contactSourceDrillDownOneId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownTwoId", "contactSourceDrillDownTwoId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownThreeId", "contactSourceDrillDownThreeId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactStatus", "contactStatus", null, true, Collections.emptyList()), ResponseField.forString("contactType", "contactType", null, true, Collections.emptyList()), ResponseField.forString("department", "department", null, true, Collections.emptyList()), ResponseField.forString("designation", "designation", null, true, Collections.emptyList()), ResponseField.forList("emails", "emails", null, true, Collections.emptyList()), ResponseField.forCustomType("lastRepeatEnquiryDate", "lastRepeatEnquiryDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastRepeatEnquirySource", "lastRepeatEnquirySource", null, true, Collections.emptyList()), ResponseField.forList("externalReference", "externalReference", null, true, Collections.emptyList()), ResponseField.forString("gender", "gender", null, true, Collections.emptyList()), ResponseField.forBoolean("isDecisionMaker", "isDecisionMaker", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrivate", "isPrivate", null, true, Collections.emptyList()), ResponseField.forCustomType("lockPeriod", "lockPeriod", null, true, customType2, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forList("preferredContactDays", "preferredContactDays", null, true, Collections.emptyList()), ResponseField.forString("profilePhotoUrl", "profilePhotoUrl", null, true, Collections.emptyList()), ResponseField.forString("referredBy", "referredBy", null, true, Collections.emptyList()), ResponseField.forString("salutation", "salutation", null, true, Collections.emptyList()), ResponseField.forString("seniority", "seniority", null, true, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("hasTask", "hasTask", null, true, Collections.emptyList()), ResponseField.forString("openTaskActivityType", "openTaskActivityType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCalledTime", "lastCalledTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastCallDirection", "lastCallDirection", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcome", "lastCallOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcomeNature", "lastCallOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCallUserId", "lastCallUserId", null, true, customType, Collections.emptyList()), ResponseField.forInt("lastCallDuration", "lastCallDuration", null, true, Collections.emptyList()), ResponseField.forString("lastCallEngagementId", "lastCallEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitTime", "lastVisitTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastVisitOutcome", "lastVisitOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastVisitOutcomeNature", "lastVisitOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitUserId", "lastVisitUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastVisitEngagementId", "lastVisitEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastEmailTime", "lastEmailTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEmailUserId", "lastEmailUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastEmailEngagementId", "lastEmailEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappTime", "lastWhatsappTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappUserId", "lastWhatsappUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastWhatsappEngagementId", "lastWhatsappEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastTime", "lastWabaBroadcastTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastStatus", "lastWabaBroadcastStatus", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastTemplate", "lastWabaBroadcastTemplate", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyBody", "lastWabaBroadcastReplyBody", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastReplyTime", "lastWabaBroadcastReplyTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyType", "lastWabaBroadcastReplyType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastSmsTime", "lastSmsTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastSmsUserId", "lastSmsUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastSmsEngagementId", "lastSmsEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastNoteAddedTime", "lastNoteAddedTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastNoteUserId", "lastNoteUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastNoteEngagementId", "lastNoteEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneTime", "lastTaskDoneTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneUserId", "lastTaskDoneUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastTaskDoneEngagementId", "lastTaskDoneEngagementId", null, true, Collections.emptyList()), ResponseField.forInt("openTaskCount", "openTaskCount", null, true, Collections.emptyList()), ResponseField.forString("lastKnownDisposition", "lastKnownDisposition", null, true, Collections.emptyList()), ResponseField.forCustomType("lastKnownDispositionTime", "lastKnownDispositionTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastLeadAssignmentDateTime", "lastLeadAssignmentDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromAccount", "lastEngagementFromAccount", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromContact", "lastEngagementFromContact", null, true, customType2, Collections.emptyList()), ResponseField.forString("freshLeadTag", "freshLeadTag", null, true, Collections.emptyList()), ResponseField.forString("noWorkAfterAssignment", "noWorkAfterAssignment", null, true, Collections.emptyList()), ResponseField.forString("needFollowUpTag", "needFollowUpTag", null, true, Collections.emptyList()), ResponseField.forCustomType("needFollowUpTagUpdatedAt", "needFollowUpTagUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("activeDealStage", "activeDealStage", null, true, Collections.emptyList()), ResponseField.forCustomType("activeDealStageUpdatedAt", "activeDealStageUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealDescription", "dealDescription", null, true, Collections.emptyList()), ResponseField.forString("isCustomer", "isCustomer", null, true, Collections.emptyList()), ResponseField.forCustomType("becameCustomerOn", "becameCustomerOn", null, true, customType2, Collections.emptyList()), ResponseField.forInt("unsuccessfulCallAttempts", "unsuccessfulCallAttempts", null, true, Collections.emptyList()), ResponseField.forInt("leadCallsNotAnswered", "leadCallsNotAnswered", null, true, Collections.emptyList()), ResponseField.forList("userDefinedTags", "userDefinedTags", null, true, Collections.emptyList()), ResponseField.forList("productService", "productService", null, true, Collections.emptyList()), ResponseField.forString("bulkUploadReference", "bulkUploadReference", null, true, Collections.emptyList()), ResponseField.forString("assignmentMethod", "assignmentMethod", null, true, Collections.emptyList()), ResponseField.forString("whatsappOptInStatus", "whatsappOptInStatus", null, true, Collections.emptyList()), ResponseField.forList("recentEngagements", "recentEngagements", null, true, Collections.emptyList()), ResponseField.forCustomType("recentEngagementsUpdatedAt", "recentEngagementsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("openTaskDetail", "openTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("openVideoCallDetail", "openVideoCallDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetail", "lastClosedTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetailUpdatedAt", "lastClosedTaskDetailUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("latestRemark", "latestRemark", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customAttributes", "customAttributes", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("paymentRequestDetail", "paymentRequestDetail", null, true, customType3, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("customDataAddedFromAddContactForm", "customDataAddedFromAddContactForm", null, true, customType3, Collections.emptyList()), ResponseField.forString("leadLifecycleStage", "leadLifecycleStage", null, true, Collections.emptyList()), ResponseField.forString("leadLifecycleStageSubCategory", "leadLifecycleStageSubCategory", null, true, Collections.emptyList()), ResponseField.forString("manualClosedReason", "manualClosedReason", null, true, Collections.emptyList()), ResponseField.forString("lastDealStageType", "lastDealStageType", null, true, Collections.emptyList()), ResponseField.forInt("prospectingAttempts", "prospectingAttempts", null, true, Collections.emptyList()), ResponseField.forInt("totalProspectingAttemptsAcrossRechurn", "totalProspectingAttemptsAcrossRechurn", null, true, Collections.emptyList()), ResponseField.forInt("numberOfTimesRechurned", "numberOfTimesRechurned", null, true, Collections.emptyList()), ResponseField.forCustomType("lastProspectingDoneOn", "lastProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("firstProspectingDoneOn", "firstProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextProspectingDueOn", "nextProspectingDueOn", null, true, customType2, Collections.emptyList()), ResponseField.forString("nextProspectingSetBy", "nextProspectingSetBy", null, true, Collections.emptyList()), ResponseField.forString("nextProspectingNote", "nextProspectingNote", null, true, Collections.emptyList()), ResponseField.forCustomType("movedToOpportunityOn", "movedToOpportunityOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("movedToClosedOn", "movedToClosedOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("account", "account", null, true, Collections.emptyList()), ResponseField.forObject("chatChannels", "chatChannels", null, true, Collections.emptyList()), ResponseField.forObject("deals", "deals", null, true, Collections.emptyList()), ResponseField.forObject("linkedFiles", "linkedFiles", null, true, Collections.emptyList()), ResponseField.forObject("businesses", "businesses", null, true, Collections.emptyList()), ResponseField.forObject("contactNumbers", "contactNumbers", null, true, Collections.emptyList()), ResponseField.forObject("owner", "owner", null, true, Collections.emptyList()), ResponseField.forObject("addedBy", "addedBy", null, true, Collections.emptyList()), ResponseField.forObject("assignedTo", "assignedTo", null, true, Collections.emptyList()), ResponseField.forObject("blockedForCallBy", "blockedForCallBy", null, true, Collections.emptyList()), ResponseField.forObject("updatedBy", "updatedBy", null, true, Collections.emptyList()), ResponseField.forObject("lastCallUser", "lastCallUser", null, true, Collections.emptyList()), ResponseField.forObject("lastVisitUser", "lastVisitUser", null, true, Collections.emptyList()), ResponseField.forObject("lastEmailUser", "lastEmailUser", null, true, Collections.emptyList()), ResponseField.forObject("lastWhatsappUser", "lastWhatsappUser", null, true, Collections.emptyList()), ResponseField.forObject("lastSmsUser", "lastSmsUser", null, true, Collections.emptyList()), ResponseField.forObject("lastNoteUser", "lastNoteUser", null, true, Collections.emptyList()), ResponseField.forObject("lastTaskDoneUser", "lastTaskDoneUser", null, true, Collections.emptyList())};
        }

        public OnCreateContactWithNumberUserLevel(String str, String str2, String str3, String str4, ContactAssignmentStatus contactAssignmentStatus, List<String> list, String str5, PrimaryTeam primaryTeam, List<String> list2, String str6, String str7, List<Address> list3, String str8, String str9, String str10, String str11, String str12, String str13, List<ContactNumberDetail> list4, List<BusinessDetail> list5, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ContactStatus contactStatus, String str21, String str22, String str23, List<Email> list6, String str24, String str25, List<ExternalReference> list7, String str26, Boolean bool, Boolean bool2, String str27, String str28, List<Day> list8, String str29, String str30, String str31, Seniority seniority, String str32, Boolean bool3, TaskActivityType taskActivityType, String str33, CallDirection callDirection, String str34, String str35, String str36, Integer num, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, Integer num2, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, Integer num3, Integer num4, List<String> list9, List<String> list10, String str78, String str79, String str80, List<String> list11, String str81, String str82, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, LeadLifecycleStage leadLifecycleStage, LeadLifecycleStageSubCategory leadLifecycleStageSubCategory, String str91, String str92, Integer num5, Integer num6, Integer num7, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101, Account account, ChatChannels chatChannels, Deals deals, LinkedFiles linkedFiles, Businesses businesses, ContactNumbers contactNumbers, Owner owner, AddedBy addedBy, AssignedTo assignedTo, BlockedForCallBy blockedForCallBy, UpdatedBy updatedBy, LastCallUser lastCallUser, LastVisitUser lastVisitUser, LastEmailUser lastEmailUser, LastWhatsappUser lastWhatsappUser, LastSmsUser lastSmsUser, LastNoteUser lastNoteUser, LastTaskDoneUser lastTaskDoneUser) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.ownerId = str4;
            this.toBeAssigned = contactAssignmentStatus;
            this.sharedOwners = list;
            this.primaryTeamId = str5;
            this.primaryTeam = primaryTeam;
            this.sharedTeams = list2;
            this.accountPriority = str6;
            this.addedById = str7;
            this.addresses = list3;
            this.assignedToId = str8;
            this.blockedForCallById = str9;
            this.blockedForCallReason = str10;
            this.blockedForCallUntil = str11;
            this.callPriority = str12;
            this.waChatChannelId = str13;
            this.contactNumberDetail = list4;
            this.businessDetail = list5;
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
            this.emails = list6;
            this.lastRepeatEnquiryDate = str24;
            this.lastRepeatEnquirySource = str25;
            this.externalReference = list7;
            this.gender = str26;
            this.isDecisionMaker = bool;
            this.isPrivate = bool2;
            this.lockPeriod = str27;
            this.name = str28;
            this.preferredContactDays = list8;
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
            this.userDefinedTags = list9;
            this.productService = list10;
            this.bulkUploadReference = str78;
            this.assignmentMethod = str79;
            this.whatsappOptInStatus = str80;
            this.recentEngagements = list11;
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
            this.account = account;
            this.chatChannels = chatChannels;
            this.deals = deals;
            this.linkedFiles = linkedFiles;
            this.businesses = businesses;
            this.contactNumbers = contactNumbers;
            this.owner = owner;
            this.addedBy = addedBy;
            this.assignedTo = assignedTo;
            this.blockedForCallBy = blockedForCallBy;
            this.updatedBy = updatedBy;
            this.lastCallUser = lastCallUser;
            this.lastVisitUser = lastVisitUser;
            this.lastEmailUser = lastEmailUser;
            this.lastWhatsappUser = lastWhatsappUser;
            this.lastSmsUser = lastSmsUser;
            this.lastNoteUser = lastNoteUser;
            this.lastTaskDoneUser = lastTaskDoneUser;
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

        public String accountPriority() {
            return this.accountPriority;
        }

        public String activeDealStage() {
            return this.activeDealStage;
        }

        public String activeDealStageUpdatedAt() {
            return this.activeDealStageUpdatedAt;
        }

        public AddedBy addedBy() {
            return this.addedBy;
        }

        public String addedById() {
            return this.addedById;
        }

        public List<Address> addresses() {
            return this.addresses;
        }

        public AssignedTo assignedTo() {
            return this.assignedTo;
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

        public BlockedForCallBy blockedForCallBy() {
            return this.blockedForCallBy;
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

        public List<BusinessDetail> businessDetail() {
            return this.businessDetail;
        }

        public Businesses businesses() {
            return this.businesses;
        }

        public String callPriority() {
            return this.callPriority;
        }

        public ChatChannels chatChannels() {
            return this.chatChannels;
        }

        public List<ContactNumberDetail> contactNumberDetail() {
            return this.contactNumberDetail;
        }

        public ContactNumbers contactNumbers() {
            return this.contactNumbers;
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

        public Deals deals() {
            return this.deals;
        }

        public String department() {
            return this.department;
        }

        public String designation() {
            return this.designation;
        }

        public List<Email> emails() {
            return this.emails;
        }

        public boolean equals(Object obj) {
            String str;
            ContactAssignmentStatus contactAssignmentStatus;
            List<String> list;
            String str2;
            PrimaryTeam primaryTeam;
            List<String> list2;
            String str3;
            String str4;
            List<Address> list3;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            List<ContactNumberDetail> list4;
            List<BusinessDetail> list5;
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
            List<Email> list6;
            String str21;
            String str22;
            List<ExternalReference> list7;
            String str23;
            Boolean bool;
            Boolean bool2;
            String str24;
            String str25;
            List<Day> list8;
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
            List<String> list9;
            List<String> list10;
            String str75;
            String str76;
            String str77;
            List<String> list11;
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
            String str98;
            Account account;
            ChatChannels chatChannels;
            Deals deals;
            LinkedFiles linkedFiles;
            Businesses businesses;
            ContactNumbers contactNumbers;
            Owner owner;
            AddedBy addedBy;
            AssignedTo assignedTo;
            BlockedForCallBy blockedForCallBy;
            UpdatedBy updatedBy;
            LastCallUser lastCallUser;
            LastVisitUser lastVisitUser;
            LastEmailUser lastEmailUser;
            LastWhatsappUser lastWhatsappUser;
            LastSmsUser lastSmsUser;
            LastNoteUser lastNoteUser;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnCreateContactWithNumberUserLevel)) {
                return false;
            }
            OnCreateContactWithNumberUserLevel onCreateContactWithNumberUserLevel = (OnCreateContactWithNumberUserLevel) obj;
            if (this.__typename.equals(onCreateContactWithNumberUserLevel.__typename) && this.id.equals(onCreateContactWithNumberUserLevel.id) && this.accountId.equals(onCreateContactWithNumberUserLevel.accountId) && ((str = this.ownerId) != null ? str.equals(onCreateContactWithNumberUserLevel.ownerId) : onCreateContactWithNumberUserLevel.ownerId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(onCreateContactWithNumberUserLevel.toBeAssigned) : onCreateContactWithNumberUserLevel.toBeAssigned == null) && ((list = this.sharedOwners) != null ? list.equals(onCreateContactWithNumberUserLevel.sharedOwners) : onCreateContactWithNumberUserLevel.sharedOwners == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(onCreateContactWithNumberUserLevel.primaryTeamId) : onCreateContactWithNumberUserLevel.primaryTeamId == null) && ((primaryTeam = this.primaryTeam) != null ? primaryTeam.equals(onCreateContactWithNumberUserLevel.primaryTeam) : onCreateContactWithNumberUserLevel.primaryTeam == null) && ((list2 = this.sharedTeams) != null ? list2.equals(onCreateContactWithNumberUserLevel.sharedTeams) : onCreateContactWithNumberUserLevel.sharedTeams == null) && ((str3 = this.accountPriority) != null ? str3.equals(onCreateContactWithNumberUserLevel.accountPriority) : onCreateContactWithNumberUserLevel.accountPriority == null) && ((str4 = this.addedById) != null ? str4.equals(onCreateContactWithNumberUserLevel.addedById) : onCreateContactWithNumberUserLevel.addedById == null) && ((list3 = this.addresses) != null ? list3.equals(onCreateContactWithNumberUserLevel.addresses) : onCreateContactWithNumberUserLevel.addresses == null) && ((str5 = this.assignedToId) != null ? str5.equals(onCreateContactWithNumberUserLevel.assignedToId) : onCreateContactWithNumberUserLevel.assignedToId == null) && ((str6 = this.blockedForCallById) != null ? str6.equals(onCreateContactWithNumberUserLevel.blockedForCallById) : onCreateContactWithNumberUserLevel.blockedForCallById == null) && ((str7 = this.blockedForCallReason) != null ? str7.equals(onCreateContactWithNumberUserLevel.blockedForCallReason) : onCreateContactWithNumberUserLevel.blockedForCallReason == null) && ((str8 = this.blockedForCallUntil) != null ? str8.equals(onCreateContactWithNumberUserLevel.blockedForCallUntil) : onCreateContactWithNumberUserLevel.blockedForCallUntil == null) && ((str9 = this.callPriority) != null ? str9.equals(onCreateContactWithNumberUserLevel.callPriority) : onCreateContactWithNumberUserLevel.callPriority == null) && ((str10 = this.waChatChannelId) != null ? str10.equals(onCreateContactWithNumberUserLevel.waChatChannelId) : onCreateContactWithNumberUserLevel.waChatChannelId == null) && ((list4 = this.contactNumberDetail) != null ? list4.equals(onCreateContactWithNumberUserLevel.contactNumberDetail) : onCreateContactWithNumberUserLevel.contactNumberDetail == null) && ((list5 = this.businessDetail) != null ? list5.equals(onCreateContactWithNumberUserLevel.businessDetail) : onCreateContactWithNumberUserLevel.businessDetail == null) && ((str11 = this.contactSource) != null ? str11.equals(onCreateContactWithNumberUserLevel.contactSource) : onCreateContactWithNumberUserLevel.contactSource == null) && ((str12 = this.contactSourceDrillDownOne) != null ? str12.equals(onCreateContactWithNumberUserLevel.contactSourceDrillDownOne) : onCreateContactWithNumberUserLevel.contactSourceDrillDownOne == null) && ((str13 = this.contactSourceDrillDownTwo) != null ? str13.equals(onCreateContactWithNumberUserLevel.contactSourceDrillDownTwo) : onCreateContactWithNumberUserLevel.contactSourceDrillDownTwo == null) && ((str14 = this.contactSourceDrillDownThree) != null ? str14.equals(onCreateContactWithNumberUserLevel.contactSourceDrillDownThree) : onCreateContactWithNumberUserLevel.contactSourceDrillDownThree == null) && ((str15 = this.contactSourceDrillDownOneId) != null ? str15.equals(onCreateContactWithNumberUserLevel.contactSourceDrillDownOneId) : onCreateContactWithNumberUserLevel.contactSourceDrillDownOneId == null) && ((str16 = this.contactSourceDrillDownTwoId) != null ? str16.equals(onCreateContactWithNumberUserLevel.contactSourceDrillDownTwoId) : onCreateContactWithNumberUserLevel.contactSourceDrillDownTwoId == null) && ((str17 = this.contactSourceDrillDownThreeId) != null ? str17.equals(onCreateContactWithNumberUserLevel.contactSourceDrillDownThreeId) : onCreateContactWithNumberUserLevel.contactSourceDrillDownThreeId == null) && ((contactStatus = this.contactStatus) != null ? contactStatus.equals(onCreateContactWithNumberUserLevel.contactStatus) : onCreateContactWithNumberUserLevel.contactStatus == null) && ((str18 = this.contactType) != null ? str18.equals(onCreateContactWithNumberUserLevel.contactType) : onCreateContactWithNumberUserLevel.contactType == null) && ((str19 = this.department) != null ? str19.equals(onCreateContactWithNumberUserLevel.department) : onCreateContactWithNumberUserLevel.department == null) && ((str20 = this.designation) != null ? str20.equals(onCreateContactWithNumberUserLevel.designation) : onCreateContactWithNumberUserLevel.designation == null) && ((list6 = this.emails) != null ? list6.equals(onCreateContactWithNumberUserLevel.emails) : onCreateContactWithNumberUserLevel.emails == null) && ((str21 = this.lastRepeatEnquiryDate) != null ? str21.equals(onCreateContactWithNumberUserLevel.lastRepeatEnquiryDate) : onCreateContactWithNumberUserLevel.lastRepeatEnquiryDate == null) && ((str22 = this.lastRepeatEnquirySource) != null ? str22.equals(onCreateContactWithNumberUserLevel.lastRepeatEnquirySource) : onCreateContactWithNumberUserLevel.lastRepeatEnquirySource == null) && ((list7 = this.externalReference) != null ? list7.equals(onCreateContactWithNumberUserLevel.externalReference) : onCreateContactWithNumberUserLevel.externalReference == null) && ((str23 = this.gender) != null ? str23.equals(onCreateContactWithNumberUserLevel.gender) : onCreateContactWithNumberUserLevel.gender == null) && ((bool = this.isDecisionMaker) != null ? bool.equals(onCreateContactWithNumberUserLevel.isDecisionMaker) : onCreateContactWithNumberUserLevel.isDecisionMaker == null) && ((bool2 = this.isPrivate) != null ? bool2.equals(onCreateContactWithNumberUserLevel.isPrivate) : onCreateContactWithNumberUserLevel.isPrivate == null) && ((str24 = this.lockPeriod) != null ? str24.equals(onCreateContactWithNumberUserLevel.lockPeriod) : onCreateContactWithNumberUserLevel.lockPeriod == null) && ((str25 = this.name) != null ? str25.equals(onCreateContactWithNumberUserLevel.name) : onCreateContactWithNumberUserLevel.name == null) && ((list8 = this.preferredContactDays) != null ? list8.equals(onCreateContactWithNumberUserLevel.preferredContactDays) : onCreateContactWithNumberUserLevel.preferredContactDays == null) && ((str26 = this.profilePhotoUrl) != null ? str26.equals(onCreateContactWithNumberUserLevel.profilePhotoUrl) : onCreateContactWithNumberUserLevel.profilePhotoUrl == null) && ((str27 = this.referredBy) != null ? str27.equals(onCreateContactWithNumberUserLevel.referredBy) : onCreateContactWithNumberUserLevel.referredBy == null) && ((str28 = this.salutation) != null ? str28.equals(onCreateContactWithNumberUserLevel.salutation) : onCreateContactWithNumberUserLevel.salutation == null) && ((seniority = this.seniority) != null ? seniority.equals(onCreateContactWithNumberUserLevel.seniority) : onCreateContactWithNumberUserLevel.seniority == null) && ((str29 = this.updatedById) != null ? str29.equals(onCreateContactWithNumberUserLevel.updatedById) : onCreateContactWithNumberUserLevel.updatedById == null) && ((bool3 = this.hasTask) != null ? bool3.equals(onCreateContactWithNumberUserLevel.hasTask) : onCreateContactWithNumberUserLevel.hasTask == null) && ((taskActivityType = this.openTaskActivityType) != null ? taskActivityType.equals(onCreateContactWithNumberUserLevel.openTaskActivityType) : onCreateContactWithNumberUserLevel.openTaskActivityType == null) && ((str30 = this.lastCalledTime) != null ? str30.equals(onCreateContactWithNumberUserLevel.lastCalledTime) : onCreateContactWithNumberUserLevel.lastCalledTime == null) && ((callDirection = this.lastCallDirection) != null ? callDirection.equals(onCreateContactWithNumberUserLevel.lastCallDirection) : onCreateContactWithNumberUserLevel.lastCallDirection == null) && ((str31 = this.lastCallOutcome) != null ? str31.equals(onCreateContactWithNumberUserLevel.lastCallOutcome) : onCreateContactWithNumberUserLevel.lastCallOutcome == null) && ((str32 = this.lastCallOutcomeNature) != null ? str32.equals(onCreateContactWithNumberUserLevel.lastCallOutcomeNature) : onCreateContactWithNumberUserLevel.lastCallOutcomeNature == null) && ((str33 = this.lastCallUserId) != null ? str33.equals(onCreateContactWithNumberUserLevel.lastCallUserId) : onCreateContactWithNumberUserLevel.lastCallUserId == null) && ((num = this.lastCallDuration) != null ? num.equals(onCreateContactWithNumberUserLevel.lastCallDuration) : onCreateContactWithNumberUserLevel.lastCallDuration == null) && ((str34 = this.lastCallEngagementId) != null ? str34.equals(onCreateContactWithNumberUserLevel.lastCallEngagementId) : onCreateContactWithNumberUserLevel.lastCallEngagementId == null) && ((str35 = this.lastVisitTime) != null ? str35.equals(onCreateContactWithNumberUserLevel.lastVisitTime) : onCreateContactWithNumberUserLevel.lastVisitTime == null) && ((str36 = this.lastVisitOutcome) != null ? str36.equals(onCreateContactWithNumberUserLevel.lastVisitOutcome) : onCreateContactWithNumberUserLevel.lastVisitOutcome == null) && ((str37 = this.lastVisitOutcomeNature) != null ? str37.equals(onCreateContactWithNumberUserLevel.lastVisitOutcomeNature) : onCreateContactWithNumberUserLevel.lastVisitOutcomeNature == null) && ((str38 = this.lastVisitUserId) != null ? str38.equals(onCreateContactWithNumberUserLevel.lastVisitUserId) : onCreateContactWithNumberUserLevel.lastVisitUserId == null) && ((str39 = this.lastVisitEngagementId) != null ? str39.equals(onCreateContactWithNumberUserLevel.lastVisitEngagementId) : onCreateContactWithNumberUserLevel.lastVisitEngagementId == null) && ((str40 = this.lastEmailTime) != null ? str40.equals(onCreateContactWithNumberUserLevel.lastEmailTime) : onCreateContactWithNumberUserLevel.lastEmailTime == null) && ((str41 = this.lastEmailUserId) != null ? str41.equals(onCreateContactWithNumberUserLevel.lastEmailUserId) : onCreateContactWithNumberUserLevel.lastEmailUserId == null) && ((str42 = this.lastEmailEngagementId) != null ? str42.equals(onCreateContactWithNumberUserLevel.lastEmailEngagementId) : onCreateContactWithNumberUserLevel.lastEmailEngagementId == null) && ((str43 = this.lastWhatsappTime) != null ? str43.equals(onCreateContactWithNumberUserLevel.lastWhatsappTime) : onCreateContactWithNumberUserLevel.lastWhatsappTime == null) && ((str44 = this.lastWhatsappUserId) != null ? str44.equals(onCreateContactWithNumberUserLevel.lastWhatsappUserId) : onCreateContactWithNumberUserLevel.lastWhatsappUserId == null) && ((str45 = this.lastWhatsappEngagementId) != null ? str45.equals(onCreateContactWithNumberUserLevel.lastWhatsappEngagementId) : onCreateContactWithNumberUserLevel.lastWhatsappEngagementId == null) && ((str46 = this.lastWabaBroadcastTime) != null ? str46.equals(onCreateContactWithNumberUserLevel.lastWabaBroadcastTime) : onCreateContactWithNumberUserLevel.lastWabaBroadcastTime == null) && ((str47 = this.lastWabaBroadcastStatus) != null ? str47.equals(onCreateContactWithNumberUserLevel.lastWabaBroadcastStatus) : onCreateContactWithNumberUserLevel.lastWabaBroadcastStatus == null) && ((str48 = this.lastWabaBroadcastTemplate) != null ? str48.equals(onCreateContactWithNumberUserLevel.lastWabaBroadcastTemplate) : onCreateContactWithNumberUserLevel.lastWabaBroadcastTemplate == null) && ((str49 = this.lastWabaBroadcastReplyBody) != null ? str49.equals(onCreateContactWithNumberUserLevel.lastWabaBroadcastReplyBody) : onCreateContactWithNumberUserLevel.lastWabaBroadcastReplyBody == null) && ((str50 = this.lastWabaBroadcastReplyTime) != null ? str50.equals(onCreateContactWithNumberUserLevel.lastWabaBroadcastReplyTime) : onCreateContactWithNumberUserLevel.lastWabaBroadcastReplyTime == null) && ((str51 = this.lastWabaBroadcastReplyType) != null ? str51.equals(onCreateContactWithNumberUserLevel.lastWabaBroadcastReplyType) : onCreateContactWithNumberUserLevel.lastWabaBroadcastReplyType == null) && ((str52 = this.lastSmsTime) != null ? str52.equals(onCreateContactWithNumberUserLevel.lastSmsTime) : onCreateContactWithNumberUserLevel.lastSmsTime == null) && ((str53 = this.lastSmsUserId) != null ? str53.equals(onCreateContactWithNumberUserLevel.lastSmsUserId) : onCreateContactWithNumberUserLevel.lastSmsUserId == null) && ((str54 = this.lastSmsEngagementId) != null ? str54.equals(onCreateContactWithNumberUserLevel.lastSmsEngagementId) : onCreateContactWithNumberUserLevel.lastSmsEngagementId == null) && ((str55 = this.lastNoteAddedTime) != null ? str55.equals(onCreateContactWithNumberUserLevel.lastNoteAddedTime) : onCreateContactWithNumberUserLevel.lastNoteAddedTime == null) && ((str56 = this.lastNoteUserId) != null ? str56.equals(onCreateContactWithNumberUserLevel.lastNoteUserId) : onCreateContactWithNumberUserLevel.lastNoteUserId == null) && ((str57 = this.lastNoteEngagementId) != null ? str57.equals(onCreateContactWithNumberUserLevel.lastNoteEngagementId) : onCreateContactWithNumberUserLevel.lastNoteEngagementId == null) && ((str58 = this.lastTaskDoneTime) != null ? str58.equals(onCreateContactWithNumberUserLevel.lastTaskDoneTime) : onCreateContactWithNumberUserLevel.lastTaskDoneTime == null) && ((str59 = this.lastTaskDoneUserId) != null ? str59.equals(onCreateContactWithNumberUserLevel.lastTaskDoneUserId) : onCreateContactWithNumberUserLevel.lastTaskDoneUserId == null) && ((str60 = this.lastTaskDoneEngagementId) != null ? str60.equals(onCreateContactWithNumberUserLevel.lastTaskDoneEngagementId) : onCreateContactWithNumberUserLevel.lastTaskDoneEngagementId == null) && ((num2 = this.openTaskCount) != null ? num2.equals(onCreateContactWithNumberUserLevel.openTaskCount) : onCreateContactWithNumberUserLevel.openTaskCount == null) && ((str61 = this.lastKnownDisposition) != null ? str61.equals(onCreateContactWithNumberUserLevel.lastKnownDisposition) : onCreateContactWithNumberUserLevel.lastKnownDisposition == null) && ((str62 = this.lastKnownDispositionTime) != null ? str62.equals(onCreateContactWithNumberUserLevel.lastKnownDispositionTime) : onCreateContactWithNumberUserLevel.lastKnownDispositionTime == null) && ((str63 = this.lastLeadAssignmentDateTime) != null ? str63.equals(onCreateContactWithNumberUserLevel.lastLeadAssignmentDateTime) : onCreateContactWithNumberUserLevel.lastLeadAssignmentDateTime == null) && ((str64 = this.lastEngagementFromAccount) != null ? str64.equals(onCreateContactWithNumberUserLevel.lastEngagementFromAccount) : onCreateContactWithNumberUserLevel.lastEngagementFromAccount == null) && ((str65 = this.lastEngagementFromContact) != null ? str65.equals(onCreateContactWithNumberUserLevel.lastEngagementFromContact) : onCreateContactWithNumberUserLevel.lastEngagementFromContact == null) && ((str66 = this.freshLeadTag) != null ? str66.equals(onCreateContactWithNumberUserLevel.freshLeadTag) : onCreateContactWithNumberUserLevel.freshLeadTag == null) && ((str67 = this.noWorkAfterAssignment) != null ? str67.equals(onCreateContactWithNumberUserLevel.noWorkAfterAssignment) : onCreateContactWithNumberUserLevel.noWorkAfterAssignment == null) && ((str68 = this.needFollowUpTag) != null ? str68.equals(onCreateContactWithNumberUserLevel.needFollowUpTag) : onCreateContactWithNumberUserLevel.needFollowUpTag == null) && ((str69 = this.needFollowUpTagUpdatedAt) != null ? str69.equals(onCreateContactWithNumberUserLevel.needFollowUpTagUpdatedAt) : onCreateContactWithNumberUserLevel.needFollowUpTagUpdatedAt == null) && ((str70 = this.activeDealStage) != null ? str70.equals(onCreateContactWithNumberUserLevel.activeDealStage) : onCreateContactWithNumberUserLevel.activeDealStage == null) && ((str71 = this.activeDealStageUpdatedAt) != null ? str71.equals(onCreateContactWithNumberUserLevel.activeDealStageUpdatedAt) : onCreateContactWithNumberUserLevel.activeDealStageUpdatedAt == null) && ((str72 = this.dealDescription) != null ? str72.equals(onCreateContactWithNumberUserLevel.dealDescription) : onCreateContactWithNumberUserLevel.dealDescription == null) && ((str73 = this.isCustomer) != null ? str73.equals(onCreateContactWithNumberUserLevel.isCustomer) : onCreateContactWithNumberUserLevel.isCustomer == null) && ((str74 = this.becameCustomerOn) != null ? str74.equals(onCreateContactWithNumberUserLevel.becameCustomerOn) : onCreateContactWithNumberUserLevel.becameCustomerOn == null) && ((num3 = this.unsuccessfulCallAttempts) != null ? num3.equals(onCreateContactWithNumberUserLevel.unsuccessfulCallAttempts) : onCreateContactWithNumberUserLevel.unsuccessfulCallAttempts == null) && ((num4 = this.leadCallsNotAnswered) != null ? num4.equals(onCreateContactWithNumberUserLevel.leadCallsNotAnswered) : onCreateContactWithNumberUserLevel.leadCallsNotAnswered == null) && ((list9 = this.userDefinedTags) != null ? list9.equals(onCreateContactWithNumberUserLevel.userDefinedTags) : onCreateContactWithNumberUserLevel.userDefinedTags == null) && ((list10 = this.productService) != null ? list10.equals(onCreateContactWithNumberUserLevel.productService) : onCreateContactWithNumberUserLevel.productService == null) && ((str75 = this.bulkUploadReference) != null ? str75.equals(onCreateContactWithNumberUserLevel.bulkUploadReference) : onCreateContactWithNumberUserLevel.bulkUploadReference == null) && ((str76 = this.assignmentMethod) != null ? str76.equals(onCreateContactWithNumberUserLevel.assignmentMethod) : onCreateContactWithNumberUserLevel.assignmentMethod == null) && ((str77 = this.whatsappOptInStatus) != null ? str77.equals(onCreateContactWithNumberUserLevel.whatsappOptInStatus) : onCreateContactWithNumberUserLevel.whatsappOptInStatus == null) && ((list11 = this.recentEngagements) != null ? list11.equals(onCreateContactWithNumberUserLevel.recentEngagements) : onCreateContactWithNumberUserLevel.recentEngagements == null) && ((str78 = this.recentEngagementsUpdatedAt) != null ? str78.equals(onCreateContactWithNumberUserLevel.recentEngagementsUpdatedAt) : onCreateContactWithNumberUserLevel.recentEngagementsUpdatedAt == null) && ((str79 = this.openTaskDetail) != null ? str79.equals(onCreateContactWithNumberUserLevel.openTaskDetail) : onCreateContactWithNumberUserLevel.openTaskDetail == null) && ((str80 = this.openVideoCallDetail) != null ? str80.equals(onCreateContactWithNumberUserLevel.openVideoCallDetail) : onCreateContactWithNumberUserLevel.openVideoCallDetail == null) && ((str81 = this.lastClosedTaskDetail) != null ? str81.equals(onCreateContactWithNumberUserLevel.lastClosedTaskDetail) : onCreateContactWithNumberUserLevel.lastClosedTaskDetail == null) && ((str82 = this.lastClosedTaskDetailUpdatedAt) != null ? str82.equals(onCreateContactWithNumberUserLevel.lastClosedTaskDetailUpdatedAt) : onCreateContactWithNumberUserLevel.lastClosedTaskDetailUpdatedAt == null) && ((str83 = this.latestRemark) != null ? str83.equals(onCreateContactWithNumberUserLevel.latestRemark) : onCreateContactWithNumberUserLevel.latestRemark == null) && ((str84 = this.customAttributes) != null ? str84.equals(onCreateContactWithNumberUserLevel.customAttributes) : onCreateContactWithNumberUserLevel.customAttributes == null) && ((str85 = this.paymentRequestDetail) != null ? str85.equals(onCreateContactWithNumberUserLevel.paymentRequestDetail) : onCreateContactWithNumberUserLevel.paymentRequestDetail == null) && ((str86 = this.lastPaymentStatus) != null ? str86.equals(onCreateContactWithNumberUserLevel.lastPaymentStatus) : onCreateContactWithNumberUserLevel.lastPaymentStatus == null) && ((str87 = this.customDataAddedFromAddContactForm) != null ? str87.equals(onCreateContactWithNumberUserLevel.customDataAddedFromAddContactForm) : onCreateContactWithNumberUserLevel.customDataAddedFromAddContactForm == null) && ((leadLifecycleStage = this.leadLifecycleStage) != null ? leadLifecycleStage.equals(onCreateContactWithNumberUserLevel.leadLifecycleStage) : onCreateContactWithNumberUserLevel.leadLifecycleStage == null) && ((leadLifecycleStageSubCategory = this.leadLifecycleStageSubCategory) != null ? leadLifecycleStageSubCategory.equals(onCreateContactWithNumberUserLevel.leadLifecycleStageSubCategory) : onCreateContactWithNumberUserLevel.leadLifecycleStageSubCategory == null) && ((str88 = this.manualClosedReason) != null ? str88.equals(onCreateContactWithNumberUserLevel.manualClosedReason) : onCreateContactWithNumberUserLevel.manualClosedReason == null) && ((str89 = this.lastDealStageType) != null ? str89.equals(onCreateContactWithNumberUserLevel.lastDealStageType) : onCreateContactWithNumberUserLevel.lastDealStageType == null) && ((num5 = this.prospectingAttempts) != null ? num5.equals(onCreateContactWithNumberUserLevel.prospectingAttempts) : onCreateContactWithNumberUserLevel.prospectingAttempts == null) && ((num6 = this.totalProspectingAttemptsAcrossRechurn) != null ? num6.equals(onCreateContactWithNumberUserLevel.totalProspectingAttemptsAcrossRechurn) : onCreateContactWithNumberUserLevel.totalProspectingAttemptsAcrossRechurn == null) && ((num7 = this.numberOfTimesRechurned) != null ? num7.equals(onCreateContactWithNumberUserLevel.numberOfTimesRechurned) : onCreateContactWithNumberUserLevel.numberOfTimesRechurned == null) && ((str90 = this.lastProspectingDoneOn) != null ? str90.equals(onCreateContactWithNumberUserLevel.lastProspectingDoneOn) : onCreateContactWithNumberUserLevel.lastProspectingDoneOn == null) && ((str91 = this.firstProspectingDoneOn) != null ? str91.equals(onCreateContactWithNumberUserLevel.firstProspectingDoneOn) : onCreateContactWithNumberUserLevel.firstProspectingDoneOn == null) && ((str92 = this.nextProspectingDueOn) != null ? str92.equals(onCreateContactWithNumberUserLevel.nextProspectingDueOn) : onCreateContactWithNumberUserLevel.nextProspectingDueOn == null) && ((str93 = this.nextProspectingSetBy) != null ? str93.equals(onCreateContactWithNumberUserLevel.nextProspectingSetBy) : onCreateContactWithNumberUserLevel.nextProspectingSetBy == null) && ((str94 = this.nextProspectingNote) != null ? str94.equals(onCreateContactWithNumberUserLevel.nextProspectingNote) : onCreateContactWithNumberUserLevel.nextProspectingNote == null) && ((str95 = this.movedToOpportunityOn) != null ? str95.equals(onCreateContactWithNumberUserLevel.movedToOpportunityOn) : onCreateContactWithNumberUserLevel.movedToOpportunityOn == null) && ((str96 = this.movedToClosedOn) != null ? str96.equals(onCreateContactWithNumberUserLevel.movedToClosedOn) : onCreateContactWithNumberUserLevel.movedToClosedOn == null) && ((str97 = this.createdAt) != null ? str97.equals(onCreateContactWithNumberUserLevel.createdAt) : onCreateContactWithNumberUserLevel.createdAt == null) && ((str98 = this.updatedAt) != null ? str98.equals(onCreateContactWithNumberUserLevel.updatedAt) : onCreateContactWithNumberUserLevel.updatedAt == null) && ((account = this.account) != null ? account.equals(onCreateContactWithNumberUserLevel.account) : onCreateContactWithNumberUserLevel.account == null) && ((chatChannels = this.chatChannels) != null ? chatChannels.equals(onCreateContactWithNumberUserLevel.chatChannels) : onCreateContactWithNumberUserLevel.chatChannels == null) && ((deals = this.deals) != null ? deals.equals(onCreateContactWithNumberUserLevel.deals) : onCreateContactWithNumberUserLevel.deals == null) && ((linkedFiles = this.linkedFiles) != null ? linkedFiles.equals(onCreateContactWithNumberUserLevel.linkedFiles) : onCreateContactWithNumberUserLevel.linkedFiles == null) && ((businesses = this.businesses) != null ? businesses.equals(onCreateContactWithNumberUserLevel.businesses) : onCreateContactWithNumberUserLevel.businesses == null) && ((contactNumbers = this.contactNumbers) != null ? contactNumbers.equals(onCreateContactWithNumberUserLevel.contactNumbers) : onCreateContactWithNumberUserLevel.contactNumbers == null) && ((owner = this.owner) != null ? owner.equals(onCreateContactWithNumberUserLevel.owner) : onCreateContactWithNumberUserLevel.owner == null) && ((addedBy = this.addedBy) != null ? addedBy.equals(onCreateContactWithNumberUserLevel.addedBy) : onCreateContactWithNumberUserLevel.addedBy == null) && ((assignedTo = this.assignedTo) != null ? assignedTo.equals(onCreateContactWithNumberUserLevel.assignedTo) : onCreateContactWithNumberUserLevel.assignedTo == null) && ((blockedForCallBy = this.blockedForCallBy) != null ? blockedForCallBy.equals(onCreateContactWithNumberUserLevel.blockedForCallBy) : onCreateContactWithNumberUserLevel.blockedForCallBy == null) && ((updatedBy = this.updatedBy) != null ? updatedBy.equals(onCreateContactWithNumberUserLevel.updatedBy) : onCreateContactWithNumberUserLevel.updatedBy == null) && ((lastCallUser = this.lastCallUser) != null ? lastCallUser.equals(onCreateContactWithNumberUserLevel.lastCallUser) : onCreateContactWithNumberUserLevel.lastCallUser == null) && ((lastVisitUser = this.lastVisitUser) != null ? lastVisitUser.equals(onCreateContactWithNumberUserLevel.lastVisitUser) : onCreateContactWithNumberUserLevel.lastVisitUser == null) && ((lastEmailUser = this.lastEmailUser) != null ? lastEmailUser.equals(onCreateContactWithNumberUserLevel.lastEmailUser) : onCreateContactWithNumberUserLevel.lastEmailUser == null) && ((lastWhatsappUser = this.lastWhatsappUser) != null ? lastWhatsappUser.equals(onCreateContactWithNumberUserLevel.lastWhatsappUser) : onCreateContactWithNumberUserLevel.lastWhatsappUser == null) && ((lastSmsUser = this.lastSmsUser) != null ? lastSmsUser.equals(onCreateContactWithNumberUserLevel.lastSmsUser) : onCreateContactWithNumberUserLevel.lastSmsUser == null) && ((lastNoteUser = this.lastNoteUser) != null ? lastNoteUser.equals(onCreateContactWithNumberUserLevel.lastNoteUser) : onCreateContactWithNumberUserLevel.lastNoteUser == null)) {
                LastTaskDoneUser lastTaskDoneUser = this.lastTaskDoneUser;
                LastTaskDoneUser lastTaskDoneUser2 = onCreateContactWithNumberUserLevel.lastTaskDoneUser;
                if (lastTaskDoneUser == null) {
                    if (lastTaskDoneUser2 == null) {
                        return true;
                    }
                } else if (lastTaskDoneUser.equals(lastTaskDoneUser2)) {
                    return true;
                }
            }
            return false;
        }

        public List<ExternalReference> externalReference() {
            return this.externalReference;
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
                PrimaryTeam primaryTeam = this.primaryTeam;
                int iHashCode6 = (iHashCode5 ^ (primaryTeam == null ? 0 : primaryTeam.hashCode())) * 1000003;
                List<String> list2 = this.sharedTeams;
                int iHashCode7 = (iHashCode6 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str3 = this.accountPriority;
                int iHashCode8 = (iHashCode7 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.addedById;
                int iHashCode9 = (iHashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                List<Address> list3 = this.addresses;
                int iHashCode10 = (iHashCode9 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str5 = this.assignedToId;
                int iHashCode11 = (iHashCode10 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.blockedForCallById;
                int iHashCode12 = (iHashCode11 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.blockedForCallReason;
                int iHashCode13 = (iHashCode12 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.blockedForCallUntil;
                int iHashCode14 = (iHashCode13 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.callPriority;
                int iHashCode15 = (iHashCode14 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.waChatChannelId;
                int iHashCode16 = (iHashCode15 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                List<ContactNumberDetail> list4 = this.contactNumberDetail;
                int iHashCode17 = (iHashCode16 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                List<BusinessDetail> list5 = this.businessDetail;
                int iHashCode18 = (iHashCode17 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
                String str11 = this.contactSource;
                int iHashCode19 = (iHashCode18 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.contactSourceDrillDownOne;
                int iHashCode20 = (iHashCode19 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.contactSourceDrillDownTwo;
                int iHashCode21 = (iHashCode20 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.contactSourceDrillDownThree;
                int iHashCode22 = (iHashCode21 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.contactSourceDrillDownOneId;
                int iHashCode23 = (iHashCode22 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.contactSourceDrillDownTwoId;
                int iHashCode24 = (iHashCode23 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.contactSourceDrillDownThreeId;
                int iHashCode25 = (iHashCode24 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                ContactStatus contactStatus = this.contactStatus;
                int iHashCode26 = (iHashCode25 ^ (contactStatus == null ? 0 : contactStatus.hashCode())) * 1000003;
                String str18 = this.contactType;
                int iHashCode27 = (iHashCode26 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.department;
                int iHashCode28 = (iHashCode27 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.designation;
                int iHashCode29 = (iHashCode28 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                List<Email> list6 = this.emails;
                int iHashCode30 = (iHashCode29 ^ (list6 == null ? 0 : list6.hashCode())) * 1000003;
                String str21 = this.lastRepeatEnquiryDate;
                int iHashCode31 = (iHashCode30 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.lastRepeatEnquirySource;
                int iHashCode32 = (iHashCode31 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                List<ExternalReference> list7 = this.externalReference;
                int iHashCode33 = (iHashCode32 ^ (list7 == null ? 0 : list7.hashCode())) * 1000003;
                String str23 = this.gender;
                int iHashCode34 = (iHashCode33 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                Boolean bool = this.isDecisionMaker;
                int iHashCode35 = (iHashCode34 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.isPrivate;
                int iHashCode36 = (iHashCode35 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str24 = this.lockPeriod;
                int iHashCode37 = (iHashCode36 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.name;
                int iHashCode38 = (iHashCode37 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                List<Day> list8 = this.preferredContactDays;
                int iHashCode39 = (iHashCode38 ^ (list8 == null ? 0 : list8.hashCode())) * 1000003;
                String str26 = this.profilePhotoUrl;
                int iHashCode40 = (iHashCode39 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.referredBy;
                int iHashCode41 = (iHashCode40 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.salutation;
                int iHashCode42 = (iHashCode41 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                Seniority seniority = this.seniority;
                int iHashCode43 = (iHashCode42 ^ (seniority == null ? 0 : seniority.hashCode())) * 1000003;
                String str29 = this.updatedById;
                int iHashCode44 = (iHashCode43 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                Boolean bool3 = this.hasTask;
                int iHashCode45 = (iHashCode44 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                TaskActivityType taskActivityType = this.openTaskActivityType;
                int iHashCode46 = (iHashCode45 ^ (taskActivityType == null ? 0 : taskActivityType.hashCode())) * 1000003;
                String str30 = this.lastCalledTime;
                int iHashCode47 = (iHashCode46 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                CallDirection callDirection = this.lastCallDirection;
                int iHashCode48 = (iHashCode47 ^ (callDirection == null ? 0 : callDirection.hashCode())) * 1000003;
                String str31 = this.lastCallOutcome;
                int iHashCode49 = (iHashCode48 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.lastCallOutcomeNature;
                int iHashCode50 = (iHashCode49 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.lastCallUserId;
                int iHashCode51 = (iHashCode50 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                Integer num = this.lastCallDuration;
                int iHashCode52 = (iHashCode51 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str34 = this.lastCallEngagementId;
                int iHashCode53 = (iHashCode52 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.lastVisitTime;
                int iHashCode54 = (iHashCode53 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.lastVisitOutcome;
                int iHashCode55 = (iHashCode54 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.lastVisitOutcomeNature;
                int iHashCode56 = (iHashCode55 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                String str38 = this.lastVisitUserId;
                int iHashCode57 = (iHashCode56 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                String str39 = this.lastVisitEngagementId;
                int iHashCode58 = (iHashCode57 ^ (str39 == null ? 0 : str39.hashCode())) * 1000003;
                String str40 = this.lastEmailTime;
                int iHashCode59 = (iHashCode58 ^ (str40 == null ? 0 : str40.hashCode())) * 1000003;
                String str41 = this.lastEmailUserId;
                int iHashCode60 = (iHashCode59 ^ (str41 == null ? 0 : str41.hashCode())) * 1000003;
                String str42 = this.lastEmailEngagementId;
                int iHashCode61 = (iHashCode60 ^ (str42 == null ? 0 : str42.hashCode())) * 1000003;
                String str43 = this.lastWhatsappTime;
                int iHashCode62 = (iHashCode61 ^ (str43 == null ? 0 : str43.hashCode())) * 1000003;
                String str44 = this.lastWhatsappUserId;
                int iHashCode63 = (iHashCode62 ^ (str44 == null ? 0 : str44.hashCode())) * 1000003;
                String str45 = this.lastWhatsappEngagementId;
                int iHashCode64 = (iHashCode63 ^ (str45 == null ? 0 : str45.hashCode())) * 1000003;
                String str46 = this.lastWabaBroadcastTime;
                int iHashCode65 = (iHashCode64 ^ (str46 == null ? 0 : str46.hashCode())) * 1000003;
                String str47 = this.lastWabaBroadcastStatus;
                int iHashCode66 = (iHashCode65 ^ (str47 == null ? 0 : str47.hashCode())) * 1000003;
                String str48 = this.lastWabaBroadcastTemplate;
                int iHashCode67 = (iHashCode66 ^ (str48 == null ? 0 : str48.hashCode())) * 1000003;
                String str49 = this.lastWabaBroadcastReplyBody;
                int iHashCode68 = (iHashCode67 ^ (str49 == null ? 0 : str49.hashCode())) * 1000003;
                String str50 = this.lastWabaBroadcastReplyTime;
                int iHashCode69 = (iHashCode68 ^ (str50 == null ? 0 : str50.hashCode())) * 1000003;
                String str51 = this.lastWabaBroadcastReplyType;
                int iHashCode70 = (iHashCode69 ^ (str51 == null ? 0 : str51.hashCode())) * 1000003;
                String str52 = this.lastSmsTime;
                int iHashCode71 = (iHashCode70 ^ (str52 == null ? 0 : str52.hashCode())) * 1000003;
                String str53 = this.lastSmsUserId;
                int iHashCode72 = (iHashCode71 ^ (str53 == null ? 0 : str53.hashCode())) * 1000003;
                String str54 = this.lastSmsEngagementId;
                int iHashCode73 = (iHashCode72 ^ (str54 == null ? 0 : str54.hashCode())) * 1000003;
                String str55 = this.lastNoteAddedTime;
                int iHashCode74 = (iHashCode73 ^ (str55 == null ? 0 : str55.hashCode())) * 1000003;
                String str56 = this.lastNoteUserId;
                int iHashCode75 = (iHashCode74 ^ (str56 == null ? 0 : str56.hashCode())) * 1000003;
                String str57 = this.lastNoteEngagementId;
                int iHashCode76 = (iHashCode75 ^ (str57 == null ? 0 : str57.hashCode())) * 1000003;
                String str58 = this.lastTaskDoneTime;
                int iHashCode77 = (iHashCode76 ^ (str58 == null ? 0 : str58.hashCode())) * 1000003;
                String str59 = this.lastTaskDoneUserId;
                int iHashCode78 = (iHashCode77 ^ (str59 == null ? 0 : str59.hashCode())) * 1000003;
                String str60 = this.lastTaskDoneEngagementId;
                int iHashCode79 = (iHashCode78 ^ (str60 == null ? 0 : str60.hashCode())) * 1000003;
                Integer num2 = this.openTaskCount;
                int iHashCode80 = (iHashCode79 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str61 = this.lastKnownDisposition;
                int iHashCode81 = (iHashCode80 ^ (str61 == null ? 0 : str61.hashCode())) * 1000003;
                String str62 = this.lastKnownDispositionTime;
                int iHashCode82 = (iHashCode81 ^ (str62 == null ? 0 : str62.hashCode())) * 1000003;
                String str63 = this.lastLeadAssignmentDateTime;
                int iHashCode83 = (iHashCode82 ^ (str63 == null ? 0 : str63.hashCode())) * 1000003;
                String str64 = this.lastEngagementFromAccount;
                int iHashCode84 = (iHashCode83 ^ (str64 == null ? 0 : str64.hashCode())) * 1000003;
                String str65 = this.lastEngagementFromContact;
                int iHashCode85 = (iHashCode84 ^ (str65 == null ? 0 : str65.hashCode())) * 1000003;
                String str66 = this.freshLeadTag;
                int iHashCode86 = (iHashCode85 ^ (str66 == null ? 0 : str66.hashCode())) * 1000003;
                String str67 = this.noWorkAfterAssignment;
                int iHashCode87 = (iHashCode86 ^ (str67 == null ? 0 : str67.hashCode())) * 1000003;
                String str68 = this.needFollowUpTag;
                int iHashCode88 = (iHashCode87 ^ (str68 == null ? 0 : str68.hashCode())) * 1000003;
                String str69 = this.needFollowUpTagUpdatedAt;
                int iHashCode89 = (iHashCode88 ^ (str69 == null ? 0 : str69.hashCode())) * 1000003;
                String str70 = this.activeDealStage;
                int iHashCode90 = (iHashCode89 ^ (str70 == null ? 0 : str70.hashCode())) * 1000003;
                String str71 = this.activeDealStageUpdatedAt;
                int iHashCode91 = (iHashCode90 ^ (str71 == null ? 0 : str71.hashCode())) * 1000003;
                String str72 = this.dealDescription;
                int iHashCode92 = (iHashCode91 ^ (str72 == null ? 0 : str72.hashCode())) * 1000003;
                String str73 = this.isCustomer;
                int iHashCode93 = (iHashCode92 ^ (str73 == null ? 0 : str73.hashCode())) * 1000003;
                String str74 = this.becameCustomerOn;
                int iHashCode94 = (iHashCode93 ^ (str74 == null ? 0 : str74.hashCode())) * 1000003;
                Integer num3 = this.unsuccessfulCallAttempts;
                int iHashCode95 = (iHashCode94 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.leadCallsNotAnswered;
                int iHashCode96 = (iHashCode95 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                List<String> list9 = this.userDefinedTags;
                int iHashCode97 = (iHashCode96 ^ (list9 == null ? 0 : list9.hashCode())) * 1000003;
                List<String> list10 = this.productService;
                int iHashCode98 = (iHashCode97 ^ (list10 == null ? 0 : list10.hashCode())) * 1000003;
                String str75 = this.bulkUploadReference;
                int iHashCode99 = (iHashCode98 ^ (str75 == null ? 0 : str75.hashCode())) * 1000003;
                String str76 = this.assignmentMethod;
                int iHashCode100 = (iHashCode99 ^ (str76 == null ? 0 : str76.hashCode())) * 1000003;
                String str77 = this.whatsappOptInStatus;
                int iHashCode101 = (iHashCode100 ^ (str77 == null ? 0 : str77.hashCode())) * 1000003;
                List<String> list11 = this.recentEngagements;
                int iHashCode102 = (iHashCode101 ^ (list11 == null ? 0 : list11.hashCode())) * 1000003;
                String str78 = this.recentEngagementsUpdatedAt;
                int iHashCode103 = (iHashCode102 ^ (str78 == null ? 0 : str78.hashCode())) * 1000003;
                String str79 = this.openTaskDetail;
                int iHashCode104 = (iHashCode103 ^ (str79 == null ? 0 : str79.hashCode())) * 1000003;
                String str80 = this.openVideoCallDetail;
                int iHashCode105 = (iHashCode104 ^ (str80 == null ? 0 : str80.hashCode())) * 1000003;
                String str81 = this.lastClosedTaskDetail;
                int iHashCode106 = (iHashCode105 ^ (str81 == null ? 0 : str81.hashCode())) * 1000003;
                String str82 = this.lastClosedTaskDetailUpdatedAt;
                int iHashCode107 = (iHashCode106 ^ (str82 == null ? 0 : str82.hashCode())) * 1000003;
                String str83 = this.latestRemark;
                int iHashCode108 = (iHashCode107 ^ (str83 == null ? 0 : str83.hashCode())) * 1000003;
                String str84 = this.customAttributes;
                int iHashCode109 = (iHashCode108 ^ (str84 == null ? 0 : str84.hashCode())) * 1000003;
                String str85 = this.paymentRequestDetail;
                int iHashCode110 = (iHashCode109 ^ (str85 == null ? 0 : str85.hashCode())) * 1000003;
                String str86 = this.lastPaymentStatus;
                int iHashCode111 = (iHashCode110 ^ (str86 == null ? 0 : str86.hashCode())) * 1000003;
                String str87 = this.customDataAddedFromAddContactForm;
                int iHashCode112 = (iHashCode111 ^ (str87 == null ? 0 : str87.hashCode())) * 1000003;
                LeadLifecycleStage leadLifecycleStage = this.leadLifecycleStage;
                int iHashCode113 = (iHashCode112 ^ (leadLifecycleStage == null ? 0 : leadLifecycleStage.hashCode())) * 1000003;
                LeadLifecycleStageSubCategory leadLifecycleStageSubCategory = this.leadLifecycleStageSubCategory;
                int iHashCode114 = (iHashCode113 ^ (leadLifecycleStageSubCategory == null ? 0 : leadLifecycleStageSubCategory.hashCode())) * 1000003;
                String str88 = this.manualClosedReason;
                int iHashCode115 = (iHashCode114 ^ (str88 == null ? 0 : str88.hashCode())) * 1000003;
                String str89 = this.lastDealStageType;
                int iHashCode116 = (iHashCode115 ^ (str89 == null ? 0 : str89.hashCode())) * 1000003;
                Integer num5 = this.prospectingAttempts;
                int iHashCode117 = (iHashCode116 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.totalProspectingAttemptsAcrossRechurn;
                int iHashCode118 = (iHashCode117 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.numberOfTimesRechurned;
                int iHashCode119 = (iHashCode118 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                String str90 = this.lastProspectingDoneOn;
                int iHashCode120 = (iHashCode119 ^ (str90 == null ? 0 : str90.hashCode())) * 1000003;
                String str91 = this.firstProspectingDoneOn;
                int iHashCode121 = (iHashCode120 ^ (str91 == null ? 0 : str91.hashCode())) * 1000003;
                String str92 = this.nextProspectingDueOn;
                int iHashCode122 = (iHashCode121 ^ (str92 == null ? 0 : str92.hashCode())) * 1000003;
                String str93 = this.nextProspectingSetBy;
                int iHashCode123 = (iHashCode122 ^ (str93 == null ? 0 : str93.hashCode())) * 1000003;
                String str94 = this.nextProspectingNote;
                int iHashCode124 = (iHashCode123 ^ (str94 == null ? 0 : str94.hashCode())) * 1000003;
                String str95 = this.movedToOpportunityOn;
                int iHashCode125 = (iHashCode124 ^ (str95 == null ? 0 : str95.hashCode())) * 1000003;
                String str96 = this.movedToClosedOn;
                int iHashCode126 = (iHashCode125 ^ (str96 == null ? 0 : str96.hashCode())) * 1000003;
                String str97 = this.createdAt;
                int iHashCode127 = (iHashCode126 ^ (str97 == null ? 0 : str97.hashCode())) * 1000003;
                String str98 = this.updatedAt;
                int iHashCode128 = (iHashCode127 ^ (str98 == null ? 0 : str98.hashCode())) * 1000003;
                Account account = this.account;
                int iHashCode129 = (iHashCode128 ^ (account == null ? 0 : account.hashCode())) * 1000003;
                ChatChannels chatChannels = this.chatChannels;
                int iHashCode130 = (iHashCode129 ^ (chatChannels == null ? 0 : chatChannels.hashCode())) * 1000003;
                Deals deals = this.deals;
                int iHashCode131 = (iHashCode130 ^ (deals == null ? 0 : deals.hashCode())) * 1000003;
                LinkedFiles linkedFiles = this.linkedFiles;
                int iHashCode132 = (iHashCode131 ^ (linkedFiles == null ? 0 : linkedFiles.hashCode())) * 1000003;
                Businesses businesses = this.businesses;
                int iHashCode133 = (iHashCode132 ^ (businesses == null ? 0 : businesses.hashCode())) * 1000003;
                ContactNumbers contactNumbers = this.contactNumbers;
                int iHashCode134 = (iHashCode133 ^ (contactNumbers == null ? 0 : contactNumbers.hashCode())) * 1000003;
                Owner owner = this.owner;
                int iHashCode135 = (iHashCode134 ^ (owner == null ? 0 : owner.hashCode())) * 1000003;
                AddedBy addedBy = this.addedBy;
                int iHashCode136 = (iHashCode135 ^ (addedBy == null ? 0 : addedBy.hashCode())) * 1000003;
                AssignedTo assignedTo = this.assignedTo;
                int iHashCode137 = (iHashCode136 ^ (assignedTo == null ? 0 : assignedTo.hashCode())) * 1000003;
                BlockedForCallBy blockedForCallBy = this.blockedForCallBy;
                int iHashCode138 = (iHashCode137 ^ (blockedForCallBy == null ? 0 : blockedForCallBy.hashCode())) * 1000003;
                UpdatedBy updatedBy = this.updatedBy;
                int iHashCode139 = (iHashCode138 ^ (updatedBy == null ? 0 : updatedBy.hashCode())) * 1000003;
                LastCallUser lastCallUser = this.lastCallUser;
                int iHashCode140 = (iHashCode139 ^ (lastCallUser == null ? 0 : lastCallUser.hashCode())) * 1000003;
                LastVisitUser lastVisitUser = this.lastVisitUser;
                int iHashCode141 = (iHashCode140 ^ (lastVisitUser == null ? 0 : lastVisitUser.hashCode())) * 1000003;
                LastEmailUser lastEmailUser = this.lastEmailUser;
                int iHashCode142 = (iHashCode141 ^ (lastEmailUser == null ? 0 : lastEmailUser.hashCode())) * 1000003;
                LastWhatsappUser lastWhatsappUser = this.lastWhatsappUser;
                int iHashCode143 = (iHashCode142 ^ (lastWhatsappUser == null ? 0 : lastWhatsappUser.hashCode())) * 1000003;
                LastSmsUser lastSmsUser = this.lastSmsUser;
                int iHashCode144 = (iHashCode143 ^ (lastSmsUser == null ? 0 : lastSmsUser.hashCode())) * 1000003;
                LastNoteUser lastNoteUser = this.lastNoteUser;
                int iHashCode145 = (iHashCode144 ^ (lastNoteUser == null ? 0 : lastNoteUser.hashCode())) * 1000003;
                LastTaskDoneUser lastTaskDoneUser = this.lastTaskDoneUser;
                this.$hashCode = iHashCode145 ^ (lastTaskDoneUser != null ? lastTaskDoneUser.hashCode() : 0);
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

        public LastCallUser lastCallUser() {
            return this.lastCallUser;
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

        public LastEmailUser lastEmailUser() {
            return this.lastEmailUser;
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

        public LastNoteUser lastNoteUser() {
            return this.lastNoteUser;
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

        public LastSmsUser lastSmsUser() {
            return this.lastSmsUser;
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

        public LastTaskDoneUser lastTaskDoneUser() {
            return this.lastTaskDoneUser;
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

        public LastVisitUser lastVisitUser() {
            return this.lastVisitUser;
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

        public LastWhatsappUser lastWhatsappUser() {
            return this.lastWhatsappUser;
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

        public LinkedFiles linkedFiles() {
            return this.linkedFiles;
        }

        public String lockPeriod() {
            return this.lockPeriod;
        }

        public String manualClosedReason() {
            return this.manualClosedReason;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnCreateContactWithNumberUserLevel.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnCreateContactWithNumberUserLevel.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnCreateContactWithNumberUserLevel.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnCreateContactWithNumberUserLevel.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnCreateContactWithNumberUserLevel.this.ownerId);
                    ResponseField responseField = responseFieldArr[4];
                    ContactAssignmentStatus contactAssignmentStatus = OnCreateContactWithNumberUserLevel.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeList(responseFieldArr[5], OnCreateContactWithNumberUserLevel.this.sharedOwners, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], OnCreateContactWithNumberUserLevel.this.primaryTeamId);
                    ResponseField responseField2 = responseFieldArr[7];
                    PrimaryTeam primaryTeam = OnCreateContactWithNumberUserLevel.this.primaryTeam;
                    responseWriter.writeObject(responseField2, primaryTeam != null ? primaryTeam.marshaller() : null);
                    responseWriter.writeList(responseFieldArr[8], OnCreateContactWithNumberUserLevel.this.sharedTeams, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[9], OnCreateContactWithNumberUserLevel.this.accountPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], OnCreateContactWithNumberUserLevel.this.addedById);
                    responseWriter.writeList(responseFieldArr[11], OnCreateContactWithNumberUserLevel.this.addresses, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Address) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], OnCreateContactWithNumberUserLevel.this.assignedToId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], OnCreateContactWithNumberUserLevel.this.blockedForCallById);
                    responseWriter.writeString(responseFieldArr[14], OnCreateContactWithNumberUserLevel.this.blockedForCallReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], OnCreateContactWithNumberUserLevel.this.blockedForCallUntil);
                    responseWriter.writeString(responseFieldArr[16], OnCreateContactWithNumberUserLevel.this.callPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], OnCreateContactWithNumberUserLevel.this.waChatChannelId);
                    responseWriter.writeList(responseFieldArr[18], OnCreateContactWithNumberUserLevel.this.contactNumberDetail, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((ContactNumberDetail) obj).marshaller());
                        }
                    });
                    responseWriter.writeList(responseFieldArr[19], OnCreateContactWithNumberUserLevel.this.businessDetail, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((BusinessDetail) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[20], OnCreateContactWithNumberUserLevel.this.contactSource);
                    responseWriter.writeString(responseFieldArr[21], OnCreateContactWithNumberUserLevel.this.contactSourceDrillDownOne);
                    responseWriter.writeString(responseFieldArr[22], OnCreateContactWithNumberUserLevel.this.contactSourceDrillDownTwo);
                    responseWriter.writeString(responseFieldArr[23], OnCreateContactWithNumberUserLevel.this.contactSourceDrillDownThree);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], OnCreateContactWithNumberUserLevel.this.contactSourceDrillDownOneId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], OnCreateContactWithNumberUserLevel.this.contactSourceDrillDownTwoId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], OnCreateContactWithNumberUserLevel.this.contactSourceDrillDownThreeId);
                    ResponseField responseField3 = responseFieldArr[27];
                    ContactStatus contactStatus = OnCreateContactWithNumberUserLevel.this.contactStatus;
                    responseWriter.writeString(responseField3, contactStatus != null ? contactStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[28], OnCreateContactWithNumberUserLevel.this.contactType);
                    responseWriter.writeString(responseFieldArr[29], OnCreateContactWithNumberUserLevel.this.department);
                    responseWriter.writeString(responseFieldArr[30], OnCreateContactWithNumberUserLevel.this.designation);
                    responseWriter.writeList(responseFieldArr[31], OnCreateContactWithNumberUserLevel.this.emails, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.6
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Email) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], OnCreateContactWithNumberUserLevel.this.lastRepeatEnquiryDate);
                    responseWriter.writeString(responseFieldArr[33], OnCreateContactWithNumberUserLevel.this.lastRepeatEnquirySource);
                    responseWriter.writeList(responseFieldArr[34], OnCreateContactWithNumberUserLevel.this.externalReference, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.7
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((ExternalReference) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[35], OnCreateContactWithNumberUserLevel.this.gender);
                    responseWriter.writeBoolean(responseFieldArr[36], OnCreateContactWithNumberUserLevel.this.isDecisionMaker);
                    responseWriter.writeBoolean(responseFieldArr[37], OnCreateContactWithNumberUserLevel.this.isPrivate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], OnCreateContactWithNumberUserLevel.this.lockPeriod);
                    responseWriter.writeString(responseFieldArr[39], OnCreateContactWithNumberUserLevel.this.name);
                    responseWriter.writeList(responseFieldArr[40], OnCreateContactWithNumberUserLevel.this.preferredContactDays, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.8
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((Day) obj).name());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[41], OnCreateContactWithNumberUserLevel.this.profilePhotoUrl);
                    responseWriter.writeString(responseFieldArr[42], OnCreateContactWithNumberUserLevel.this.referredBy);
                    responseWriter.writeString(responseFieldArr[43], OnCreateContactWithNumberUserLevel.this.salutation);
                    ResponseField responseField4 = responseFieldArr[44];
                    Seniority seniority = OnCreateContactWithNumberUserLevel.this.seniority;
                    responseWriter.writeString(responseField4, seniority != null ? seniority.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[45], OnCreateContactWithNumberUserLevel.this.updatedById);
                    responseWriter.writeBoolean(responseFieldArr[46], OnCreateContactWithNumberUserLevel.this.hasTask);
                    ResponseField responseField5 = responseFieldArr[47];
                    TaskActivityType taskActivityType = OnCreateContactWithNumberUserLevel.this.openTaskActivityType;
                    responseWriter.writeString(responseField5, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[48], OnCreateContactWithNumberUserLevel.this.lastCalledTime);
                    ResponseField responseField6 = responseFieldArr[49];
                    CallDirection callDirection = OnCreateContactWithNumberUserLevel.this.lastCallDirection;
                    responseWriter.writeString(responseField6, callDirection != null ? callDirection.name() : null);
                    responseWriter.writeString(responseFieldArr[50], OnCreateContactWithNumberUserLevel.this.lastCallOutcome);
                    responseWriter.writeString(responseFieldArr[51], OnCreateContactWithNumberUserLevel.this.lastCallOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], OnCreateContactWithNumberUserLevel.this.lastCallUserId);
                    responseWriter.writeInt(responseFieldArr[53], OnCreateContactWithNumberUserLevel.this.lastCallDuration);
                    responseWriter.writeString(responseFieldArr[54], OnCreateContactWithNumberUserLevel.this.lastCallEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], OnCreateContactWithNumberUserLevel.this.lastVisitTime);
                    responseWriter.writeString(responseFieldArr[56], OnCreateContactWithNumberUserLevel.this.lastVisitOutcome);
                    responseWriter.writeString(responseFieldArr[57], OnCreateContactWithNumberUserLevel.this.lastVisitOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], OnCreateContactWithNumberUserLevel.this.lastVisitUserId);
                    responseWriter.writeString(responseFieldArr[59], OnCreateContactWithNumberUserLevel.this.lastVisitEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[60], OnCreateContactWithNumberUserLevel.this.lastEmailTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[61], OnCreateContactWithNumberUserLevel.this.lastEmailUserId);
                    responseWriter.writeString(responseFieldArr[62], OnCreateContactWithNumberUserLevel.this.lastEmailEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[63], OnCreateContactWithNumberUserLevel.this.lastWhatsappTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[64], OnCreateContactWithNumberUserLevel.this.lastWhatsappUserId);
                    responseWriter.writeString(responseFieldArr[65], OnCreateContactWithNumberUserLevel.this.lastWhatsappEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[66], OnCreateContactWithNumberUserLevel.this.lastWabaBroadcastTime);
                    responseWriter.writeString(responseFieldArr[67], OnCreateContactWithNumberUserLevel.this.lastWabaBroadcastStatus);
                    responseWriter.writeString(responseFieldArr[68], OnCreateContactWithNumberUserLevel.this.lastWabaBroadcastTemplate);
                    responseWriter.writeString(responseFieldArr[69], OnCreateContactWithNumberUserLevel.this.lastWabaBroadcastReplyBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[70], OnCreateContactWithNumberUserLevel.this.lastWabaBroadcastReplyTime);
                    responseWriter.writeString(responseFieldArr[71], OnCreateContactWithNumberUserLevel.this.lastWabaBroadcastReplyType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], OnCreateContactWithNumberUserLevel.this.lastSmsTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], OnCreateContactWithNumberUserLevel.this.lastSmsUserId);
                    responseWriter.writeString(responseFieldArr[74], OnCreateContactWithNumberUserLevel.this.lastSmsEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[75], OnCreateContactWithNumberUserLevel.this.lastNoteAddedTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[76], OnCreateContactWithNumberUserLevel.this.lastNoteUserId);
                    responseWriter.writeString(responseFieldArr[77], OnCreateContactWithNumberUserLevel.this.lastNoteEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[78], OnCreateContactWithNumberUserLevel.this.lastTaskDoneTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[79], OnCreateContactWithNumberUserLevel.this.lastTaskDoneUserId);
                    responseWriter.writeString(responseFieldArr[80], OnCreateContactWithNumberUserLevel.this.lastTaskDoneEngagementId);
                    responseWriter.writeInt(responseFieldArr[81], OnCreateContactWithNumberUserLevel.this.openTaskCount);
                    responseWriter.writeString(responseFieldArr[82], OnCreateContactWithNumberUserLevel.this.lastKnownDisposition);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[83], OnCreateContactWithNumberUserLevel.this.lastKnownDispositionTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[84], OnCreateContactWithNumberUserLevel.this.lastLeadAssignmentDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[85], OnCreateContactWithNumberUserLevel.this.lastEngagementFromAccount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[86], OnCreateContactWithNumberUserLevel.this.lastEngagementFromContact);
                    responseWriter.writeString(responseFieldArr[87], OnCreateContactWithNumberUserLevel.this.freshLeadTag);
                    responseWriter.writeString(responseFieldArr[88], OnCreateContactWithNumberUserLevel.this.noWorkAfterAssignment);
                    responseWriter.writeString(responseFieldArr[89], OnCreateContactWithNumberUserLevel.this.needFollowUpTag);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[90], OnCreateContactWithNumberUserLevel.this.needFollowUpTagUpdatedAt);
                    responseWriter.writeString(responseFieldArr[91], OnCreateContactWithNumberUserLevel.this.activeDealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[92], OnCreateContactWithNumberUserLevel.this.activeDealStageUpdatedAt);
                    responseWriter.writeString(responseFieldArr[93], OnCreateContactWithNumberUserLevel.this.dealDescription);
                    responseWriter.writeString(responseFieldArr[94], OnCreateContactWithNumberUserLevel.this.isCustomer);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[95], OnCreateContactWithNumberUserLevel.this.becameCustomerOn);
                    responseWriter.writeInt(responseFieldArr[96], OnCreateContactWithNumberUserLevel.this.unsuccessfulCallAttempts);
                    responseWriter.writeInt(responseFieldArr[97], OnCreateContactWithNumberUserLevel.this.leadCallsNotAnswered);
                    responseWriter.writeList(responseFieldArr[98], OnCreateContactWithNumberUserLevel.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.9
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[99], OnCreateContactWithNumberUserLevel.this.productService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.10
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[100], OnCreateContactWithNumberUserLevel.this.bulkUploadReference);
                    responseWriter.writeString(responseFieldArr[101], OnCreateContactWithNumberUserLevel.this.assignmentMethod);
                    responseWriter.writeString(responseFieldArr[102], OnCreateContactWithNumberUserLevel.this.whatsappOptInStatus);
                    responseWriter.writeList(responseFieldArr[103], OnCreateContactWithNumberUserLevel.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.OnCreateContactWithNumberUserLevel.1.11
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[104], OnCreateContactWithNumberUserLevel.this.recentEngagementsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[105], OnCreateContactWithNumberUserLevel.this.openTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[106], OnCreateContactWithNumberUserLevel.this.openVideoCallDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[107], OnCreateContactWithNumberUserLevel.this.lastClosedTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[108], OnCreateContactWithNumberUserLevel.this.lastClosedTaskDetailUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[109], OnCreateContactWithNumberUserLevel.this.latestRemark);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[110], OnCreateContactWithNumberUserLevel.this.customAttributes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[111], OnCreateContactWithNumberUserLevel.this.paymentRequestDetail);
                    responseWriter.writeString(responseFieldArr[112], OnCreateContactWithNumberUserLevel.this.lastPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[113], OnCreateContactWithNumberUserLevel.this.customDataAddedFromAddContactForm);
                    ResponseField responseField7 = responseFieldArr[114];
                    LeadLifecycleStage leadLifecycleStage = OnCreateContactWithNumberUserLevel.this.leadLifecycleStage;
                    responseWriter.writeString(responseField7, leadLifecycleStage != null ? leadLifecycleStage.name() : null);
                    ResponseField responseField8 = responseFieldArr[115];
                    LeadLifecycleStageSubCategory leadLifecycleStageSubCategory = OnCreateContactWithNumberUserLevel.this.leadLifecycleStageSubCategory;
                    responseWriter.writeString(responseField8, leadLifecycleStageSubCategory != null ? leadLifecycleStageSubCategory.name() : null);
                    responseWriter.writeString(responseFieldArr[116], OnCreateContactWithNumberUserLevel.this.manualClosedReason);
                    responseWriter.writeString(responseFieldArr[117], OnCreateContactWithNumberUserLevel.this.lastDealStageType);
                    responseWriter.writeInt(responseFieldArr[118], OnCreateContactWithNumberUserLevel.this.prospectingAttempts);
                    responseWriter.writeInt(responseFieldArr[119], OnCreateContactWithNumberUserLevel.this.totalProspectingAttemptsAcrossRechurn);
                    responseWriter.writeInt(responseFieldArr[120], OnCreateContactWithNumberUserLevel.this.numberOfTimesRechurned);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[121], OnCreateContactWithNumberUserLevel.this.lastProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[122], OnCreateContactWithNumberUserLevel.this.firstProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[123], OnCreateContactWithNumberUserLevel.this.nextProspectingDueOn);
                    responseWriter.writeString(responseFieldArr[124], OnCreateContactWithNumberUserLevel.this.nextProspectingSetBy);
                    responseWriter.writeString(responseFieldArr[125], OnCreateContactWithNumberUserLevel.this.nextProspectingNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[126], OnCreateContactWithNumberUserLevel.this.movedToOpportunityOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[127], OnCreateContactWithNumberUserLevel.this.movedToClosedOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[128], OnCreateContactWithNumberUserLevel.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[129], OnCreateContactWithNumberUserLevel.this.updatedAt);
                    ResponseField responseField9 = responseFieldArr[130];
                    Account account = OnCreateContactWithNumberUserLevel.this.account;
                    responseWriter.writeObject(responseField9, account != null ? account.marshaller() : null);
                    ResponseField responseField10 = responseFieldArr[131];
                    ChatChannels chatChannels = OnCreateContactWithNumberUserLevel.this.chatChannels;
                    responseWriter.writeObject(responseField10, chatChannels != null ? chatChannels.marshaller() : null);
                    ResponseField responseField11 = responseFieldArr[132];
                    Deals deals = OnCreateContactWithNumberUserLevel.this.deals;
                    responseWriter.writeObject(responseField11, deals != null ? deals.marshaller() : null);
                    ResponseField responseField12 = responseFieldArr[133];
                    LinkedFiles linkedFiles = OnCreateContactWithNumberUserLevel.this.linkedFiles;
                    responseWriter.writeObject(responseField12, linkedFiles != null ? linkedFiles.marshaller() : null);
                    ResponseField responseField13 = responseFieldArr[134];
                    Businesses businesses = OnCreateContactWithNumberUserLevel.this.businesses;
                    responseWriter.writeObject(responseField13, businesses != null ? businesses.marshaller() : null);
                    ResponseField responseField14 = responseFieldArr[135];
                    ContactNumbers contactNumbers = OnCreateContactWithNumberUserLevel.this.contactNumbers;
                    responseWriter.writeObject(responseField14, contactNumbers != null ? contactNumbers.marshaller() : null);
                    ResponseField responseField15 = responseFieldArr[136];
                    Owner owner = OnCreateContactWithNumberUserLevel.this.owner;
                    responseWriter.writeObject(responseField15, owner != null ? owner.marshaller() : null);
                    ResponseField responseField16 = responseFieldArr[137];
                    AddedBy addedBy = OnCreateContactWithNumberUserLevel.this.addedBy;
                    responseWriter.writeObject(responseField16, addedBy != null ? addedBy.marshaller() : null);
                    ResponseField responseField17 = responseFieldArr[138];
                    AssignedTo assignedTo = OnCreateContactWithNumberUserLevel.this.assignedTo;
                    responseWriter.writeObject(responseField17, assignedTo != null ? assignedTo.marshaller() : null);
                    ResponseField responseField18 = responseFieldArr[139];
                    BlockedForCallBy blockedForCallBy = OnCreateContactWithNumberUserLevel.this.blockedForCallBy;
                    responseWriter.writeObject(responseField18, blockedForCallBy != null ? blockedForCallBy.marshaller() : null);
                    ResponseField responseField19 = responseFieldArr[140];
                    UpdatedBy updatedBy = OnCreateContactWithNumberUserLevel.this.updatedBy;
                    responseWriter.writeObject(responseField19, updatedBy != null ? updatedBy.marshaller() : null);
                    ResponseField responseField20 = responseFieldArr[141];
                    LastCallUser lastCallUser = OnCreateContactWithNumberUserLevel.this.lastCallUser;
                    responseWriter.writeObject(responseField20, lastCallUser != null ? lastCallUser.marshaller() : null);
                    ResponseField responseField21 = responseFieldArr[142];
                    LastVisitUser lastVisitUser = OnCreateContactWithNumberUserLevel.this.lastVisitUser;
                    responseWriter.writeObject(responseField21, lastVisitUser != null ? lastVisitUser.marshaller() : null);
                    ResponseField responseField22 = responseFieldArr[143];
                    LastEmailUser lastEmailUser = OnCreateContactWithNumberUserLevel.this.lastEmailUser;
                    responseWriter.writeObject(responseField22, lastEmailUser != null ? lastEmailUser.marshaller() : null);
                    ResponseField responseField23 = responseFieldArr[144];
                    LastWhatsappUser lastWhatsappUser = OnCreateContactWithNumberUserLevel.this.lastWhatsappUser;
                    responseWriter.writeObject(responseField23, lastWhatsappUser != null ? lastWhatsappUser.marshaller() : null);
                    ResponseField responseField24 = responseFieldArr[145];
                    LastSmsUser lastSmsUser = OnCreateContactWithNumberUserLevel.this.lastSmsUser;
                    responseWriter.writeObject(responseField24, lastSmsUser != null ? lastSmsUser.marshaller() : null);
                    ResponseField responseField25 = responseFieldArr[146];
                    LastNoteUser lastNoteUser = OnCreateContactWithNumberUserLevel.this.lastNoteUser;
                    responseWriter.writeObject(responseField25, lastNoteUser != null ? lastNoteUser.marshaller() : null);
                    ResponseField responseField26 = responseFieldArr[147];
                    LastTaskDoneUser lastTaskDoneUser = OnCreateContactWithNumberUserLevel.this.lastTaskDoneUser;
                    responseWriter.writeObject(responseField26, lastTaskDoneUser != null ? lastTaskDoneUser.marshaller() : null);
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

        public Owner owner() {
            return this.owner;
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

        public PrimaryTeam primaryTeam() {
            return this.primaryTeam;
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
                this.$toString = "OnCreateContactWithNumberUserLevel{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", toBeAssigned=" + this.toBeAssigned + ", sharedOwners=" + this.sharedOwners + ", primaryTeamId=" + this.primaryTeamId + ", primaryTeam=" + this.primaryTeam + ", sharedTeams=" + this.sharedTeams + ", accountPriority=" + this.accountPriority + ", addedById=" + this.addedById + ", addresses=" + this.addresses + ", assignedToId=" + this.assignedToId + ", blockedForCallById=" + this.blockedForCallById + ", blockedForCallReason=" + this.blockedForCallReason + ", blockedForCallUntil=" + this.blockedForCallUntil + ", callPriority=" + this.callPriority + ", waChatChannelId=" + this.waChatChannelId + ", contactNumberDetail=" + this.contactNumberDetail + ", businessDetail=" + this.businessDetail + ", contactSource=" + this.contactSource + ", contactSourceDrillDownOne=" + this.contactSourceDrillDownOne + ", contactSourceDrillDownTwo=" + this.contactSourceDrillDownTwo + ", contactSourceDrillDownThree=" + this.contactSourceDrillDownThree + ", contactSourceDrillDownOneId=" + this.contactSourceDrillDownOneId + ", contactSourceDrillDownTwoId=" + this.contactSourceDrillDownTwoId + ", contactSourceDrillDownThreeId=" + this.contactSourceDrillDownThreeId + ", contactStatus=" + this.contactStatus + ", contactType=" + this.contactType + ", department=" + this.department + ", designation=" + this.designation + ", emails=" + this.emails + ", lastRepeatEnquiryDate=" + this.lastRepeatEnquiryDate + ", lastRepeatEnquirySource=" + this.lastRepeatEnquirySource + ", externalReference=" + this.externalReference + ", gender=" + this.gender + ", isDecisionMaker=" + this.isDecisionMaker + ", isPrivate=" + this.isPrivate + ", lockPeriod=" + this.lockPeriod + ", name=" + this.name + ", preferredContactDays=" + this.preferredContactDays + ", profilePhotoUrl=" + this.profilePhotoUrl + ", referredBy=" + this.referredBy + ", salutation=" + this.salutation + ", seniority=" + this.seniority + ", updatedById=" + this.updatedById + ", hasTask=" + this.hasTask + ", openTaskActivityType=" + this.openTaskActivityType + ", lastCalledTime=" + this.lastCalledTime + ", lastCallDirection=" + this.lastCallDirection + ", lastCallOutcome=" + this.lastCallOutcome + ", lastCallOutcomeNature=" + this.lastCallOutcomeNature + ", lastCallUserId=" + this.lastCallUserId + ", lastCallDuration=" + this.lastCallDuration + ", lastCallEngagementId=" + this.lastCallEngagementId + ", lastVisitTime=" + this.lastVisitTime + ", lastVisitOutcome=" + this.lastVisitOutcome + ", lastVisitOutcomeNature=" + this.lastVisitOutcomeNature + ", lastVisitUserId=" + this.lastVisitUserId + ", lastVisitEngagementId=" + this.lastVisitEngagementId + ", lastEmailTime=" + this.lastEmailTime + ", lastEmailUserId=" + this.lastEmailUserId + ", lastEmailEngagementId=" + this.lastEmailEngagementId + ", lastWhatsappTime=" + this.lastWhatsappTime + ", lastWhatsappUserId=" + this.lastWhatsappUserId + ", lastWhatsappEngagementId=" + this.lastWhatsappEngagementId + ", lastWabaBroadcastTime=" + this.lastWabaBroadcastTime + ", lastWabaBroadcastStatus=" + this.lastWabaBroadcastStatus + ", lastWabaBroadcastTemplate=" + this.lastWabaBroadcastTemplate + ", lastWabaBroadcastReplyBody=" + this.lastWabaBroadcastReplyBody + ", lastWabaBroadcastReplyTime=" + this.lastWabaBroadcastReplyTime + ", lastWabaBroadcastReplyType=" + this.lastWabaBroadcastReplyType + ", lastSmsTime=" + this.lastSmsTime + ", lastSmsUserId=" + this.lastSmsUserId + ", lastSmsEngagementId=" + this.lastSmsEngagementId + ", lastNoteAddedTime=" + this.lastNoteAddedTime + ", lastNoteUserId=" + this.lastNoteUserId + ", lastNoteEngagementId=" + this.lastNoteEngagementId + ", lastTaskDoneTime=" + this.lastTaskDoneTime + ", lastTaskDoneUserId=" + this.lastTaskDoneUserId + ", lastTaskDoneEngagementId=" + this.lastTaskDoneEngagementId + ", openTaskCount=" + this.openTaskCount + ", lastKnownDisposition=" + this.lastKnownDisposition + ", lastKnownDispositionTime=" + this.lastKnownDispositionTime + ", lastLeadAssignmentDateTime=" + this.lastLeadAssignmentDateTime + ", lastEngagementFromAccount=" + this.lastEngagementFromAccount + ", lastEngagementFromContact=" + this.lastEngagementFromContact + ", freshLeadTag=" + this.freshLeadTag + ", noWorkAfterAssignment=" + this.noWorkAfterAssignment + ", needFollowUpTag=" + this.needFollowUpTag + ", needFollowUpTagUpdatedAt=" + this.needFollowUpTagUpdatedAt + ", activeDealStage=" + this.activeDealStage + ", activeDealStageUpdatedAt=" + this.activeDealStageUpdatedAt + ", dealDescription=" + this.dealDescription + ", isCustomer=" + this.isCustomer + ", becameCustomerOn=" + this.becameCustomerOn + ", unsuccessfulCallAttempts=" + this.unsuccessfulCallAttempts + ", leadCallsNotAnswered=" + this.leadCallsNotAnswered + ", userDefinedTags=" + this.userDefinedTags + ", productService=" + this.productService + ", bulkUploadReference=" + this.bulkUploadReference + ", assignmentMethod=" + this.assignmentMethod + ", whatsappOptInStatus=" + this.whatsappOptInStatus + ", recentEngagements=" + this.recentEngagements + ", recentEngagementsUpdatedAt=" + this.recentEngagementsUpdatedAt + ", openTaskDetail=" + this.openTaskDetail + ", openVideoCallDetail=" + this.openVideoCallDetail + ", lastClosedTaskDetail=" + this.lastClosedTaskDetail + ", lastClosedTaskDetailUpdatedAt=" + this.lastClosedTaskDetailUpdatedAt + ", latestRemark=" + this.latestRemark + ", customAttributes=" + this.customAttributes + ", paymentRequestDetail=" + this.paymentRequestDetail + ", lastPaymentStatus=" + this.lastPaymentStatus + ", customDataAddedFromAddContactForm=" + this.customDataAddedFromAddContactForm + ", leadLifecycleStage=" + this.leadLifecycleStage + ", leadLifecycleStageSubCategory=" + this.leadLifecycleStageSubCategory + ", manualClosedReason=" + this.manualClosedReason + ", lastDealStageType=" + this.lastDealStageType + ", prospectingAttempts=" + this.prospectingAttempts + ", totalProspectingAttemptsAcrossRechurn=" + this.totalProspectingAttemptsAcrossRechurn + ", numberOfTimesRechurned=" + this.numberOfTimesRechurned + ", lastProspectingDoneOn=" + this.lastProspectingDoneOn + ", firstProspectingDoneOn=" + this.firstProspectingDoneOn + ", nextProspectingDueOn=" + this.nextProspectingDueOn + ", nextProspectingSetBy=" + this.nextProspectingSetBy + ", nextProspectingNote=" + this.nextProspectingNote + ", movedToOpportunityOn=" + this.movedToOpportunityOn + ", movedToClosedOn=" + this.movedToClosedOn + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", account=" + this.account + ", chatChannels=" + this.chatChannels + ", deals=" + this.deals + ", linkedFiles=" + this.linkedFiles + ", businesses=" + this.businesses + ", contactNumbers=" + this.contactNumbers + ", owner=" + this.owner + ", addedBy=" + this.addedBy + ", assignedTo=" + this.assignedTo + ", blockedForCallBy=" + this.blockedForCallBy + ", updatedBy=" + this.updatedBy + ", lastCallUser=" + this.lastCallUser + ", lastVisitUser=" + this.lastVisitUser + ", lastEmailUser=" + this.lastEmailUser + ", lastWhatsappUser=" + this.lastWhatsappUser + ", lastSmsUser=" + this.lastSmsUser + ", lastNoteUser=" + this.lastNoteUser + ", lastTaskDoneUser=" + this.lastTaskDoneUser + "}";
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

        public UpdatedBy updatedBy() {
            return this.updatedBy;
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

    public static class Owner {
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

        public static final class Mapper implements ResponseFieldMapper<Owner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Owner map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Owner.$responseFields;
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
                return new Owner(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public Owner(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) obj;
            if (this.__typename.equals(owner.__typename) && this.id.equals(owner.id) && this.addedSourceType.equals(owner.addedSourceType) && this.name.equals(owner.name) && ((str = this.profilePictureUrl) != null ? str.equals(owner.profilePictureUrl) : owner.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(owner.registeredEmail) : owner.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(owner.registeredEmailVerified) : owner.registeredEmailVerified == null) && this.registeredNumber.equals(owner.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(owner.registeredNumberVerified) : owner.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(owner.secondaryNumber) : owner.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(owner.secondaryNumberVerified) : owner.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(owner.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(owner.lastSelectedAccountWeb) : owner.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(owner.lastSelectedAccountApp) : owner.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(owner.appVersion) : owner.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(owner.deviceModel) : owner.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(owner.deviceManufacturer) : owner.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(owner.androidVersionRelease) : owner.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(owner.createdAt) : owner.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = owner.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Owner.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Owner.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Owner.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Owner.this.id);
                    responseWriter.writeString(responseFieldArr[2], Owner.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], Owner.this.name);
                    responseWriter.writeString(responseFieldArr[4], Owner.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Owner.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], Owner.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Owner.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], Owner.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Owner.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], Owner.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], Owner.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Owner.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Owner.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], Owner.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], Owner.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], Owner.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], Owner.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Owner.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Owner.this.updatedAt);
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
                this.$toString = "Owner{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class PrimaryTeam {
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

        public static final class Mapper implements ResponseFieldMapper<PrimaryTeam> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public PrimaryTeam map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = PrimaryTeam.$responseFields;
                return new PrimaryTeam(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, false, customType, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, false, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public PrimaryTeam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
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
            if (!(obj instanceof PrimaryTeam)) {
                return false;
            }
            PrimaryTeam primaryTeam = (PrimaryTeam) obj;
            if (this.__typename.equals(primaryTeam.__typename) && this.id.equals(primaryTeam.id) && this.accountId.equals(primaryTeam.accountId) && this.createdById.equals(primaryTeam.createdById) && this.description.equals(primaryTeam.description) && this.teamName.equals(primaryTeam.teamName) && this.updatedById.equals(primaryTeam.updatedById) && ((str = this.createdAt) != null ? str.equals(primaryTeam.createdAt) : primaryTeam.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = primaryTeam.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.PrimaryTeam.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = PrimaryTeam.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], PrimaryTeam.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], PrimaryTeam.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], PrimaryTeam.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], PrimaryTeam.this.createdById);
                    responseWriter.writeString(responseFieldArr[4], PrimaryTeam.this.description);
                    responseWriter.writeString(responseFieldArr[5], PrimaryTeam.this.teamName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], PrimaryTeam.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], PrimaryTeam.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], PrimaryTeam.this.updatedAt);
                }
            };
        }

        public String teamName() {
            return this.teamName;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PrimaryTeam{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", createdById=" + this.createdById + ", description=" + this.description + ", teamName=" + this.teamName + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.UpdatedBy.1
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

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final String ownerId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.ownerId = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("ownerId", str2);
        }

        public String accountId() {
            return this.accountId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateContactWithNumberUserLevelSubscription.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("ownerId", Variables.this.ownerId);
                }
            };
        }

        public String ownerId() {
            return this.ownerId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public OnCreateContactWithNumberUserLevelSubscription(String str, String str2) {
        Utils.checkNotNull(str, "accountId == null");
        Utils.checkNotNull(str2, "ownerId == null");
        this.variables = new Variables(str, str2);
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
        return "5ea88916383e417486f0fa3cf56bbabb33e874addef380492bdd954d93929b81";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnCreateContactWithNumberUserLevel($accountId: ID!, $ownerId: ID!) {\n  onCreateContactWithNumberUserLevel(accountId: $accountId, ownerId: $ownerId) {\n    __typename\n    id\n    accountId\n    ownerId\n    toBeAssigned\n    sharedOwners\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    sharedTeams\n    accountPriority\n    addedById\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    assignedToId\n    blockedForCallById\n    blockedForCallReason\n    blockedForCallUntil\n    callPriority\n    waChatChannelId\n    contactNumberDetail {\n      __typename\n      contactNumberType\n      isPrimary\n      isValid\n      isWhatsappNumber\n      isVerified\n      isWrongNumber\n      phoneNumber\n    }\n    businessDetail {\n      __typename\n      id\n      name\n      website\n      industry\n    }\n    contactSource\n    contactSourceDrillDownOne\n    contactSourceDrillDownTwo\n    contactSourceDrillDownThree\n    contactSourceDrillDownOneId\n    contactSourceDrillDownTwoId\n    contactSourceDrillDownThreeId\n    contactStatus\n    contactType\n    department\n    designation\n    emails {\n      __typename\n      email\n      fullName\n      isDisposableEmail\n      isPrimary\n      isPublicEmail\n      isValid\n      isVerified\n      isGenericEmail\n    }\n    lastRepeatEnquiryDate\n    lastRepeatEnquirySource\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n      externalReferenceSourceDate\n    }\n    gender\n    isDecisionMaker\n    isPrivate\n    lockPeriod\n    name\n    preferredContactDays\n    profilePhotoUrl\n    referredBy\n    salutation\n    seniority\n    updatedById\n    hasTask\n    openTaskActivityType\n    lastCalledTime\n    lastCallDirection\n    lastCallOutcome\n    lastCallOutcomeNature\n    lastCallUserId\n    lastCallDuration\n    lastCallEngagementId\n    lastVisitTime\n    lastVisitOutcome\n    lastVisitOutcomeNature\n    lastVisitUserId\n    lastVisitEngagementId\n    lastEmailTime\n    lastEmailUserId\n    lastEmailEngagementId\n    lastWhatsappTime\n    lastWhatsappUserId\n    lastWhatsappEngagementId\n    lastWabaBroadcastTime\n    lastWabaBroadcastStatus\n    lastWabaBroadcastTemplate\n    lastWabaBroadcastReplyBody\n    lastWabaBroadcastReplyTime\n    lastWabaBroadcastReplyType\n    lastSmsTime\n    lastSmsUserId\n    lastSmsEngagementId\n    lastNoteAddedTime\n    lastNoteUserId\n    lastNoteEngagementId\n    lastTaskDoneTime\n    lastTaskDoneUserId\n    lastTaskDoneEngagementId\n    openTaskCount\n    lastKnownDisposition\n    lastKnownDispositionTime\n    lastLeadAssignmentDateTime\n    lastEngagementFromAccount\n    lastEngagementFromContact\n    freshLeadTag\n    noWorkAfterAssignment\n    needFollowUpTag\n    needFollowUpTagUpdatedAt\n    activeDealStage\n    activeDealStageUpdatedAt\n    dealDescription\n    isCustomer\n    becameCustomerOn\n    unsuccessfulCallAttempts\n    leadCallsNotAnswered\n    userDefinedTags\n    productService\n    bulkUploadReference\n    assignmentMethod\n    whatsappOptInStatus\n    recentEngagements\n    recentEngagementsUpdatedAt\n    openTaskDetail\n    openVideoCallDetail\n    lastClosedTaskDetail\n    lastClosedTaskDetailUpdatedAt\n    latestRemark\n    customAttributes\n    paymentRequestDetail\n    lastPaymentStatus\n    customDataAddedFromAddContactForm\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    manualClosedReason\n    lastDealStageType\n    prospectingAttempts\n    totalProspectingAttemptsAcrossRechurn\n    numberOfTimesRechurned\n    lastProspectingDoneOn\n    firstProspectingDoneOn\n    nextProspectingDueOn\n    nextProspectingSetBy\n    nextProspectingNote\n    movedToOpportunityOn\n    movedToClosedOn\n    createdAt\n    updatedAt\n    account {\n      __typename\n      id\n      accountName\n      accountType\n      deviceKey\n      deviceKeyLastUpdated\n      accountStatus\n      businessLogoUrl\n      createdById\n      dateFormat\n      dateTimeViewStyle\n      defaultCurrency\n      denomination\n      industry\n      nameOfBusiness\n      productOrService\n      timeFormat\n      timeZone\n      plan\n      paidUpTo\n      seats\n      freeSeats\n      currentTotalUsers\n      currentActiveUsers\n      extraActiveUsers\n      pricePerSeat\n      allowAddingSeat\n      allowAddingSeatTill\n      seatReductionMarkedForNextCycle\n      billingCurrency\n      billingEmail\n      taxId\n      taxIdType\n      trialAccountEndDate\n      trialExtensionTimes\n      eligibleForExtension\n      paidForTillDate\n      updatedById\n      website\n      permissions\n      enableCustomCharts\n      createdAt\n      updatedAt\n      dealMode\n      openAiApiKey\n      salesmaxSalesContacts\n      salesmaxSupportContacts\n      chatWidgetConfig\n      onboardingStatus\n      integrationNeeded\n      matchingDealId\n      relatedAccountIds\n      lastChurnDate\n      lastChurnReason\n      possibleReactivationDate\n      locationPeriodicFrequency\n      lastPaymentDataId\n      lastPaymentDataCreatedAt\n      nextRenewalDateIfPaid\n      lastPaymentStatus\n      partPaymentAmountIfAny\n    }\n    chatChannels {\n      __typename\n      nextToken\n    }\n    deals {\n      __typename\n      nextToken\n    }\n    linkedFiles {\n      __typename\n      nextToken\n    }\n    businesses {\n      __typename\n      nextToken\n    }\n    contactNumbers {\n      __typename\n      nextToken\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    assignedTo {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    blockedForCallBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastCallUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastVisitUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastEmailUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastWhatsappUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastSmsUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastNoteUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    lastTaskDoneUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
