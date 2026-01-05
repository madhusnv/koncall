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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.AddedSourceType;
import type.CallConnectStatus;
import type.CallDirection;
import type.CampaignRunFrequencyUnit;
import type.CampaignStatus;
import type.CampaignType;
import type.ContactAssignmentStatus;
import type.ContactStatus;
import type.CustomType;
import type.Day;
import type.DistributedEntityType;
import type.DistributionCreationType;
import type.EngagementStatus;
import type.EngagementType;
import type.IfOwnerExists;
import type.LeadLifecycleStage;
import type.LeadLifecycleStageSubCategory;
import type.NoteAdditionMethod;
import type.Seniority;
import type.TaskActivityType;
import type.UserRegistrationStatus;

/* loaded from: classes4.dex */
public final class OnUpdateEngagementUserLevelSubscription implements Subscription<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnUpdateEngagementUserLevel($accountId: ID!, $ownerId: ID!, $engagementSource: ID!) {\n  onUpdateEngagementUserLevel(accountId: $accountId, ownerId: $ownerId, engagementSource: $engagementSource) {\n    __typename\n    id\n    accountId\n    engagementType\n    contactId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    toBeAssigned\n    ownerId\n    contactPrimaryTeamId\n    contactOwnerId\n    addedById\n    updatedById\n    callStatus\n    engagementStatus\n    parentEngagementId\n    nextStepTaskId\n    syncStatus\n    externalNumber\n    userNumber\n    callDirection\n    callConnectStatus\n    callStartTime\n    callEndTime\n    durationInMillis\n    callOutcome\n    callOutcomeNature\n    callRecordingExternalResource\n    noteHeading\n    noteAdditionMethod\n    voiceNoteUrl\n    body\n    isManualTask\n    taskHeading\n    taskType\n    taskActivityType\n    taskInputNote\n    taskPriority\n    taskCompletionNote\n    taskCompletionTime\n    taskCompletionType\n    dueDateTime\n    nextFollowUpOn\n    nextFollowUpSetBy\n    reminderDateTime\n    taskLocation {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    callRecordingUrl\n    callTranscriptUrl\n    callTranscriptSummary\n    uploadedFiledUrl\n    visitLocation {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    visitTime\n    visitNote\n    visitOutcome\n    visitOutcomeNature\n    videoCallPlatform\n    videoCallLink\n    meetingName\n    meetingCode\n    videoCallMetadata\n    videoCallOutcome\n    meetingParticipants {\n      __typename\n      id\n      name\n      startTime\n      endTime\n    }\n    paymentDataId\n    calendarEventId\n    calendarName\n    campaignId\n    campaignRun\n    engagementSourceType\n    engagementSource\n    engagementSourceLevelTwo\n    systemAction\n    taskEngagementActions\n    taskEngagementActionsUpdatedAt\n    firstTaskEngagementActionOn\n    taskEngagementActionCount\n    customCallOutcomeData\n    customVisitOutcomeData\n    customTaskCompletionData\n    customTaskInputData\n    customVideoCallInputData\n    deviceId\n    totalCallDuration\n    cloudProviderNumber\n    hangupReason\n    cloudProvider\n    callType\n    phoneCallLogId\n    externalEventRecordId\n    createdAt\n    updatedAt\n    externalEventRecord {\n      __typename\n      id\n      accountId\n      externalSourceId\n      externalSourceType\n      engagementId\n      userId\n      contactId\n      contactName\n      primaryParticipantEmailId\n      primaryParticipantName\n      recordingUrl\n      transcriptUrl\n      rawEvent\n      message\n      status\n      eventSummary\n      eventDescription\n      eventUrl\n      eventStartTime\n      eventEndTime\n      createdAt\n      updatedAt\n    }\n    parentEngagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    childEngagements {\n      __typename\n      nextToken\n      startedAt\n    }\n    nextStepTask {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    paymentData {\n      __typename\n      id\n      accountId\n      contactId\n      paymentRequestType\n      engagementId\n      paymentProvider\n      orderIdInPaymentProvider\n      orderId\n      paymentLinkId\n      paymentLinkUrl\n      amount\n      amountPaid\n      currency\n      status\n      lastPaymentStatus\n      finalPaymentDate\n      paidByContactIds\n      transactionId\n      note\n      createdAt\n      updatedAt\n      customPaymentData\n      createdById\n      updatedById\n    }\n    engagementUpdate {\n      __typename\n      nextToken\n    }\n    locations {\n      __typename\n      nextToken\n    }\n    linkedFiles {\n      __typename\n      nextToken\n    }\n    comments {\n      __typename\n      nextToken\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    campaign {\n      __typename\n      id\n      accountId\n      name\n      description\n      distributedEntityType\n      ifOwnerExists\n      assignLeadOwnerToTask\n      remeberAssigneeInDistributionScope\n      remeberAssigneeInGlobalScope\n      ownerId\n      distributionCreationType\n      createdAt\n      updatedAt\n    }\n    linkedCampaign {\n      __typename\n      id\n      accountId\n      name\n      description\n      campaignCategory\n      campaignSubCategory\n      campaignType\n      campaignChannelIdentifier\n      campaignData\n      campaignRunFrequencyUnit\n      campaignRunFrequencyValue\n      startDateOfRun\n      endDateOfRun\n      durationOfRunInDays\n      daysToSend\n      ownerId\n      primaryTeamId\n      status\n      systemPauseReason\n      associatedEntityListId\n      includeHistoricalMemberships\n      allowMultiple\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      tags\n      leadLimit\n      createdAt\n      updatedAt\n    }\n    engagementOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnUpdateEngagementUserLevel";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnUpdateEngagementUserLevel($accountId: ID!, $ownerId: ID!, $engagementSource: ID!) {\n  onUpdateEngagementUserLevel(accountId: $accountId, ownerId: $ownerId, engagementSource: $engagementSource) {\n    __typename\n    id\n    accountId\n    engagementType\n    contactId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    toBeAssigned\n    ownerId\n    contactPrimaryTeamId\n    contactOwnerId\n    addedById\n    updatedById\n    callStatus\n    engagementStatus\n    parentEngagementId\n    nextStepTaskId\n    syncStatus\n    externalNumber\n    userNumber\n    callDirection\n    callConnectStatus\n    callStartTime\n    callEndTime\n    durationInMillis\n    callOutcome\n    callOutcomeNature\n    callRecordingExternalResource\n    noteHeading\n    noteAdditionMethod\n    voiceNoteUrl\n    body\n    isManualTask\n    taskHeading\n    taskType\n    taskActivityType\n    taskInputNote\n    taskPriority\n    taskCompletionNote\n    taskCompletionTime\n    taskCompletionType\n    dueDateTime\n    nextFollowUpOn\n    nextFollowUpSetBy\n    reminderDateTime\n    taskLocation {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    callRecordingUrl\n    callTranscriptUrl\n    callTranscriptSummary\n    uploadedFiledUrl\n    visitLocation {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    visitTime\n    visitNote\n    visitOutcome\n    visitOutcomeNature\n    videoCallPlatform\n    videoCallLink\n    meetingName\n    meetingCode\n    videoCallMetadata\n    videoCallOutcome\n    meetingParticipants {\n      __typename\n      id\n      name\n      startTime\n      endTime\n    }\n    paymentDataId\n    calendarEventId\n    calendarName\n    campaignId\n    campaignRun\n    engagementSourceType\n    engagementSource\n    engagementSourceLevelTwo\n    systemAction\n    taskEngagementActions\n    taskEngagementActionsUpdatedAt\n    firstTaskEngagementActionOn\n    taskEngagementActionCount\n    customCallOutcomeData\n    customVisitOutcomeData\n    customTaskCompletionData\n    customTaskInputData\n    customVideoCallInputData\n    deviceId\n    totalCallDuration\n    cloudProviderNumber\n    hangupReason\n    cloudProvider\n    callType\n    phoneCallLogId\n    externalEventRecordId\n    createdAt\n    updatedAt\n    externalEventRecord {\n      __typename\n      id\n      accountId\n      externalSourceId\n      externalSourceType\n      engagementId\n      userId\n      contactId\n      contactName\n      primaryParticipantEmailId\n      primaryParticipantName\n      recordingUrl\n      transcriptUrl\n      rawEvent\n      message\n      status\n      eventSummary\n      eventDescription\n      eventUrl\n      eventStartTime\n      eventEndTime\n      createdAt\n      updatedAt\n    }\n    parentEngagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    childEngagements {\n      __typename\n      nextToken\n      startedAt\n    }\n    nextStepTask {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    paymentData {\n      __typename\n      id\n      accountId\n      contactId\n      paymentRequestType\n      engagementId\n      paymentProvider\n      orderIdInPaymentProvider\n      orderId\n      paymentLinkId\n      paymentLinkUrl\n      amount\n      amountPaid\n      currency\n      status\n      lastPaymentStatus\n      finalPaymentDate\n      paidByContactIds\n      transactionId\n      note\n      createdAt\n      updatedAt\n      customPaymentData\n      createdById\n      updatedById\n    }\n    engagementUpdate {\n      __typename\n      nextToken\n    }\n    locations {\n      __typename\n      nextToken\n    }\n    linkedFiles {\n      __typename\n      nextToken\n    }\n    comments {\n      __typename\n      nextToken\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    campaign {\n      __typename\n      id\n      accountId\n      name\n      description\n      distributedEntityType\n      ifOwnerExists\n      assignLeadOwnerToTask\n      remeberAssigneeInDistributionScope\n      remeberAssigneeInGlobalScope\n      ownerId\n      distributionCreationType\n      createdAt\n      updatedAt\n    }\n    linkedCampaign {\n      __typename\n      id\n      accountId\n      name\n      description\n      campaignCategory\n      campaignSubCategory\n      campaignType\n      campaignChannelIdentifier\n      campaignData\n      campaignRunFrequencyUnit\n      campaignRunFrequencyValue\n      startDateOfRun\n      endDateOfRun\n      durationOfRunInDays\n      daysToSend\n      ownerId\n      primaryTeamId\n      status\n      systemPauseReason\n      associatedEntityListId\n      includeHistoricalMemberships\n      allowMultiple\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      tags\n      leadLimit\n      createdAt\n      updatedAt\n    }\n    engagementOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.AddedBy.1
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

    public static final class Builder {
        private String accountId;
        private String engagementSource;
        private String ownerId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public OnUpdateEngagementUserLevelSubscription build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            Utils.checkNotNull(this.engagementSource, "engagementSource == null");
            return new OnUpdateEngagementUserLevelSubscription(this.accountId, this.ownerId, this.engagementSource);
        }

        public Builder engagementSource(String str) {
            this.engagementSource = str;
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
            return this;
        }
    }

    public static class Campaign {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Boolean assignLeadOwnerToTask;
        final String createdAt;
        final String description;
        final List<DistributedEntityType> distributedEntityType;
        final DistributionCreationType distributionCreationType;
        final String id;
        final IfOwnerExists ifOwnerExists;
        final String name;
        final String ownerId;
        final Boolean remeberAssigneeInDistributionScope;
        final Boolean remeberAssigneeInGlobalScope;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Campaign> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Campaign map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Campaign.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<DistributedEntityType>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Campaign.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public DistributedEntityType read(ResponseReader.ListItemReader listItemReader) {
                        return DistributedEntityType.valueOf(listItemReader.readString());
                    }
                });
                String string4 = responseReader.readString(responseFieldArr[6]);
                IfOwnerExists ifOwnerExistsValueOf = string4 != null ? IfOwnerExists.valueOf(string4) : null;
                Boolean bool = responseReader.readBoolean(responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[9]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new Campaign(string, str, str2, string2, string3, list, ifOwnerExistsValueOf, bool, bool2, bool3, str3, string5 != null ? DistributionCreationType.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forList("distributedEntityType", "distributedEntityType", null, false, Collections.emptyList()), ResponseField.forString("ifOwnerExists", "ifOwnerExists", null, true, Collections.emptyList()), ResponseField.forBoolean("assignLeadOwnerToTask", "assignLeadOwnerToTask", null, true, Collections.emptyList()), ResponseField.forBoolean("remeberAssigneeInDistributionScope", "remeberAssigneeInDistributionScope", null, true, Collections.emptyList()), ResponseField.forBoolean("remeberAssigneeInGlobalScope", "remeberAssigneeInGlobalScope", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("distributionCreationType", "distributionCreationType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Campaign(String str, String str2, String str3, String str4, String str5, List<DistributedEntityType> list, IfOwnerExists ifOwnerExists, Boolean bool, Boolean bool2, Boolean bool3, String str6, DistributionCreationType distributionCreationType, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = (String) Utils.checkNotNull(str4, "name == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.distributedEntityType = (List) Utils.checkNotNull(list, "distributedEntityType == null");
            this.ifOwnerExists = ifOwnerExists;
            this.assignLeadOwnerToTask = bool;
            this.remeberAssigneeInDistributionScope = bool2;
            this.remeberAssigneeInGlobalScope = bool3;
            this.ownerId = (String) Utils.checkNotNull(str6, "ownerId == null");
            this.distributionCreationType = distributionCreationType;
            this.createdAt = str7;
            this.updatedAt = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Boolean assignLeadOwnerToTask() {
            return this.assignLeadOwnerToTask;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String description() {
            return this.description;
        }

        public List<DistributedEntityType> distributedEntityType() {
            return this.distributedEntityType;
        }

        public DistributionCreationType distributionCreationType() {
            return this.distributionCreationType;
        }

        public boolean equals(Object obj) {
            IfOwnerExists ifOwnerExists;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            DistributionCreationType distributionCreationType;
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Campaign)) {
                return false;
            }
            Campaign campaign = (Campaign) obj;
            if (this.__typename.equals(campaign.__typename) && this.id.equals(campaign.id) && this.accountId.equals(campaign.accountId) && this.name.equals(campaign.name) && this.description.equals(campaign.description) && this.distributedEntityType.equals(campaign.distributedEntityType) && ((ifOwnerExists = this.ifOwnerExists) != null ? ifOwnerExists.equals(campaign.ifOwnerExists) : campaign.ifOwnerExists == null) && ((bool = this.assignLeadOwnerToTask) != null ? bool.equals(campaign.assignLeadOwnerToTask) : campaign.assignLeadOwnerToTask == null) && ((bool2 = this.remeberAssigneeInDistributionScope) != null ? bool2.equals(campaign.remeberAssigneeInDistributionScope) : campaign.remeberAssigneeInDistributionScope == null) && ((bool3 = this.remeberAssigneeInGlobalScope) != null ? bool3.equals(campaign.remeberAssigneeInGlobalScope) : campaign.remeberAssigneeInGlobalScope == null) && this.ownerId.equals(campaign.ownerId) && ((distributionCreationType = this.distributionCreationType) != null ? distributionCreationType.equals(campaign.distributionCreationType) : campaign.distributionCreationType == null) && ((str = this.createdAt) != null ? str.equals(campaign.createdAt) : campaign.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = campaign.updatedAt;
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
                int iHashCode = (((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.distributedEntityType.hashCode()) * 1000003;
                IfOwnerExists ifOwnerExists = this.ifOwnerExists;
                int iHashCode2 = (iHashCode ^ (ifOwnerExists == null ? 0 : ifOwnerExists.hashCode())) * 1000003;
                Boolean bool = this.assignLeadOwnerToTask;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.remeberAssigneeInDistributionScope;
                int iHashCode4 = (iHashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.remeberAssigneeInGlobalScope;
                int iHashCode5 = (((iHashCode4 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                DistributionCreationType distributionCreationType = this.distributionCreationType;
                int iHashCode6 = (iHashCode5 ^ (distributionCreationType == null ? 0 : distributionCreationType.hashCode())) * 1000003;
                String str = this.createdAt;
                int iHashCode7 = (iHashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode7 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public IfOwnerExists ifOwnerExists() {
            return this.ifOwnerExists;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Campaign.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Campaign.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Campaign.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Campaign.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Campaign.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Campaign.this.name);
                    responseWriter.writeString(responseFieldArr[4], Campaign.this.description);
                    responseWriter.writeList(responseFieldArr[5], Campaign.this.distributedEntityType, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Campaign.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((DistributedEntityType) obj).name());
                        }
                    });
                    ResponseField responseField = responseFieldArr[6];
                    IfOwnerExists ifOwnerExists = Campaign.this.ifOwnerExists;
                    responseWriter.writeString(responseField, ifOwnerExists != null ? ifOwnerExists.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[7], Campaign.this.assignLeadOwnerToTask);
                    responseWriter.writeBoolean(responseFieldArr[8], Campaign.this.remeberAssigneeInDistributionScope);
                    responseWriter.writeBoolean(responseFieldArr[9], Campaign.this.remeberAssigneeInGlobalScope);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Campaign.this.ownerId);
                    ResponseField responseField2 = responseFieldArr[11];
                    DistributionCreationType distributionCreationType = Campaign.this.distributionCreationType;
                    responseWriter.writeString(responseField2, distributionCreationType != null ? distributionCreationType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Campaign.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Campaign.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public Boolean remeberAssigneeInDistributionScope() {
            return this.remeberAssigneeInDistributionScope;
        }

        public Boolean remeberAssigneeInGlobalScope() {
            return this.remeberAssigneeInGlobalScope;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Campaign{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", distributedEntityType=" + this.distributedEntityType + ", ifOwnerExists=" + this.ifOwnerExists + ", assignLeadOwnerToTask=" + this.assignLeadOwnerToTask + ", remeberAssigneeInDistributionScope=" + this.remeberAssigneeInDistributionScope + ", remeberAssigneeInGlobalScope=" + this.remeberAssigneeInGlobalScope + ", ownerId=" + this.ownerId + ", distributionCreationType=" + this.distributionCreationType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ChildEngagements {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forCustomType("startedAt", "startedAt", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;
        final Long startedAt;

        public static final class Mapper implements ResponseFieldMapper<ChildEngagements> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ChildEngagements map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ChildEngagements.$responseFields;
                return new ChildEngagements(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]));
            }
        }

        public ChildEngagements(String str, String str2, Long l) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.nextToken = str2;
            this.startedAt = l;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChildEngagements)) {
                return false;
            }
            ChildEngagements childEngagements = (ChildEngagements) obj;
            if (this.__typename.equals(childEngagements.__typename) && ((str = this.nextToken) != null ? str.equals(childEngagements.nextToken) : childEngagements.nextToken == null)) {
                Long l = this.startedAt;
                Long l2 = childEngagements.startedAt;
                if (l == null) {
                    if (l2 == null) {
                        return true;
                    }
                } else if (l.equals(l2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.nextToken;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Long l = this.startedAt;
                this.$hashCode = iHashCode2 ^ (l != null ? l.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.ChildEngagements.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ChildEngagements.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ChildEngagements.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ChildEngagements.this.nextToken);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ChildEngagements.this.startedAt);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public Long startedAt() {
            return this.startedAt;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ChildEngagements{__typename=" + this.__typename + ", nextToken=" + this.nextToken + ", startedAt=" + this.startedAt + "}";
            }
            return this.$toString;
        }
    }

    public static class Comments {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Comments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Comments map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Comments.$responseFields;
                return new Comments(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Comments(String str, String str2) {
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
            if (!(obj instanceof Comments)) {
                return false;
            }
            Comments comments = (Comments) obj;
            if (this.__typename.equals(comments.__typename)) {
                String str = this.nextToken;
                String str2 = comments.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Comments.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Comments.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Comments.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Comments.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Comments{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
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
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                List list2 = responseReader.readList(responseFieldArr[7], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.Mapper.2
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
                List list3 = responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<Day>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.Mapper.3
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
                List list4 = responseReader.readList(responseFieldArr[92], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                List list5 = responseReader.readList(responseFieldArr[93], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string45 = responseReader.readString(responseFieldArr[94]);
                String string46 = responseReader.readString(responseFieldArr[95]);
                String string47 = responseReader.readString(responseFieldArr[96]);
                List list6 = responseReader.readList(responseFieldArr[97], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.Mapper.6
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.1
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
                    responseWriter.writeList(responseFieldArr[5], Contact.this.sharedOwners, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Contact.this.primaryTeamId);
                    responseWriter.writeList(responseFieldArr[7], Contact.this.sharedTeams, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.1.2
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
                    responseWriter.writeList(responseFieldArr[34], Contact.this.preferredContactDays, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.1.3
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
                    responseWriter.writeList(responseFieldArr[92], Contact.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[93], Contact.this.productService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[94], Contact.this.bulkUploadReference);
                    responseWriter.writeString(responseFieldArr[95], Contact.this.assignmentMethod);
                    responseWriter.writeString(responseFieldArr[96], Contact.this.whatsappOptInStatus);
                    responseWriter.writeList(responseFieldArr[97], Contact.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Contact.1.6
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("onUpdateEngagementUserLevel", "onUpdateEngagementUserLevel", new UnmodifiableMapBuilder(3).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("engagementSource", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "engagementSource").build()).put("ownerId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "ownerId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnUpdateEngagementUserLevel onUpdateEngagementUserLevel;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnUpdateEngagementUserLevel.Mapper onUpdateEngagementUserLevelFieldMapper = new OnUpdateEngagementUserLevel.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnUpdateEngagementUserLevel) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnUpdateEngagementUserLevel>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnUpdateEngagementUserLevel read(ResponseReader responseReader2) {
                        return Mapper.this.onUpdateEngagementUserLevelFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnUpdateEngagementUserLevel onUpdateEngagementUserLevel) {
            this.onUpdateEngagementUserLevel = onUpdateEngagementUserLevel;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnUpdateEngagementUserLevel onUpdateEngagementUserLevel = this.onUpdateEngagementUserLevel;
            OnUpdateEngagementUserLevel onUpdateEngagementUserLevel2 = ((Data) obj).onUpdateEngagementUserLevel;
            return onUpdateEngagementUserLevel == null ? onUpdateEngagementUserLevel2 == null : onUpdateEngagementUserLevel.equals(onUpdateEngagementUserLevel2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnUpdateEngagementUserLevel onUpdateEngagementUserLevel = this.onUpdateEngagementUserLevel;
                this.$hashCode = (onUpdateEngagementUserLevel == null ? 0 : onUpdateEngagementUserLevel.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnUpdateEngagementUserLevel onUpdateEngagementUserLevel = Data.this.onUpdateEngagementUserLevel;
                    responseWriter.writeObject(responseField, onUpdateEngagementUserLevel != null ? onUpdateEngagementUserLevel.marshaller() : null);
                }
            };
        }

        public OnUpdateEngagementUserLevel onUpdateEngagementUserLevel() {
            return this.onUpdateEngagementUserLevel;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onUpdateEngagementUserLevel=" + this.onUpdateEngagementUserLevel + "}";
            }
            return this.$toString;
        }
    }

    public static class EngagementOwner {
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

        public static final class Mapper implements ResponseFieldMapper<EngagementOwner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public EngagementOwner map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = EngagementOwner.$responseFields;
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
                return new EngagementOwner(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public EngagementOwner(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof EngagementOwner)) {
                return false;
            }
            EngagementOwner engagementOwner = (EngagementOwner) obj;
            if (this.__typename.equals(engagementOwner.__typename) && this.id.equals(engagementOwner.id) && this.addedSourceType.equals(engagementOwner.addedSourceType) && this.name.equals(engagementOwner.name) && ((str = this.profilePictureUrl) != null ? str.equals(engagementOwner.profilePictureUrl) : engagementOwner.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(engagementOwner.registeredEmail) : engagementOwner.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(engagementOwner.registeredEmailVerified) : engagementOwner.registeredEmailVerified == null) && this.registeredNumber.equals(engagementOwner.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(engagementOwner.registeredNumberVerified) : engagementOwner.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(engagementOwner.secondaryNumber) : engagementOwner.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(engagementOwner.secondaryNumberVerified) : engagementOwner.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(engagementOwner.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(engagementOwner.lastSelectedAccountWeb) : engagementOwner.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(engagementOwner.lastSelectedAccountApp) : engagementOwner.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(engagementOwner.appVersion) : engagementOwner.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(engagementOwner.deviceModel) : engagementOwner.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(engagementOwner.deviceManufacturer) : engagementOwner.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(engagementOwner.androidVersionRelease) : engagementOwner.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(engagementOwner.createdAt) : engagementOwner.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = engagementOwner.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.EngagementOwner.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = EngagementOwner.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], EngagementOwner.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], EngagementOwner.this.id);
                    responseWriter.writeString(responseFieldArr[2], EngagementOwner.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], EngagementOwner.this.name);
                    responseWriter.writeString(responseFieldArr[4], EngagementOwner.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], EngagementOwner.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], EngagementOwner.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], EngagementOwner.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], EngagementOwner.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], EngagementOwner.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], EngagementOwner.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], EngagementOwner.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], EngagementOwner.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], EngagementOwner.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], EngagementOwner.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], EngagementOwner.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], EngagementOwner.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], EngagementOwner.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], EngagementOwner.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], EngagementOwner.this.updatedAt);
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
                this.$toString = "EngagementOwner{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class EngagementUpdate {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<EngagementUpdate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public EngagementUpdate map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = EngagementUpdate.$responseFields;
                return new EngagementUpdate(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public EngagementUpdate(String str, String str2) {
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
            if (!(obj instanceof EngagementUpdate)) {
                return false;
            }
            EngagementUpdate engagementUpdate = (EngagementUpdate) obj;
            if (this.__typename.equals(engagementUpdate.__typename)) {
                String str = this.nextToken;
                String str2 = engagementUpdate.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.EngagementUpdate.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = EngagementUpdate.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], EngagementUpdate.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], EngagementUpdate.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "EngagementUpdate{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class ExternalEventRecord {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String contactId;
        final String contactName;
        final String createdAt;
        final String engagementId;
        final String eventDescription;
        final String eventEndTime;
        final String eventStartTime;
        final String eventSummary;
        final String eventUrl;
        final String externalSourceId;
        final String externalSourceType;
        final String id;
        final String message;
        final String primaryParticipantEmailId;
        final String primaryParticipantName;
        final String rawEvent;
        final String recordingUrl;
        final String status;
        final String transcriptUrl;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<ExternalEventRecord> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ExternalEventRecord map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ExternalEventRecord.$responseFields;
                return new ExternalEventRecord(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("externalSourceId", "externalSourceId", null, false, customType, Collections.emptyList()), ResponseField.forString("externalSourceType", "externalSourceType", null, false, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactName", "contactName", null, true, Collections.emptyList()), ResponseField.forCustomType("primaryParticipantEmailId", "primaryParticipantEmailId", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forString("primaryParticipantName", "primaryParticipantName", null, true, Collections.emptyList()), ResponseField.forString("recordingUrl", "recordingUrl", null, true, Collections.emptyList()), ResponseField.forString("transcriptUrl", "transcriptUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("rawEvent", "rawEvent", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, null, true, customType2, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("eventSummary", "eventSummary", null, true, Collections.emptyList()), ResponseField.forString("eventDescription", "eventDescription", null, true, Collections.emptyList()), ResponseField.forString("eventUrl", "eventUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("eventStartTime", "eventStartTime", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("eventEndTime", "eventEndTime", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public ExternalEventRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.externalSourceId = (String) Utils.checkNotNull(str4, "externalSourceId == null");
            this.externalSourceType = (String) Utils.checkNotNull(str5, "externalSourceType == null");
            this.engagementId = str6;
            this.userId = str7;
            this.contactId = str8;
            this.contactName = str9;
            this.primaryParticipantEmailId = str10;
            this.primaryParticipantName = str11;
            this.recordingUrl = str12;
            this.transcriptUrl = str13;
            this.rawEvent = str14;
            this.message = str15;
            this.status = str16;
            this.eventSummary = str17;
            this.eventDescription = str18;
            this.eventUrl = str19;
            this.eventStartTime = str20;
            this.eventEndTime = str21;
            this.createdAt = str22;
            this.updatedAt = str23;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String contactName() {
            return this.contactName;
        }

        public String createdAt() {
            return this.createdAt;
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
            String str15;
            String str16;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExternalEventRecord)) {
                return false;
            }
            ExternalEventRecord externalEventRecord = (ExternalEventRecord) obj;
            if (this.__typename.equals(externalEventRecord.__typename) && this.id.equals(externalEventRecord.id) && this.accountId.equals(externalEventRecord.accountId) && this.externalSourceId.equals(externalEventRecord.externalSourceId) && this.externalSourceType.equals(externalEventRecord.externalSourceType) && ((str = this.engagementId) != null ? str.equals(externalEventRecord.engagementId) : externalEventRecord.engagementId == null) && ((str2 = this.userId) != null ? str2.equals(externalEventRecord.userId) : externalEventRecord.userId == null) && ((str3 = this.contactId) != null ? str3.equals(externalEventRecord.contactId) : externalEventRecord.contactId == null) && ((str4 = this.contactName) != null ? str4.equals(externalEventRecord.contactName) : externalEventRecord.contactName == null) && ((str5 = this.primaryParticipantEmailId) != null ? str5.equals(externalEventRecord.primaryParticipantEmailId) : externalEventRecord.primaryParticipantEmailId == null) && ((str6 = this.primaryParticipantName) != null ? str6.equals(externalEventRecord.primaryParticipantName) : externalEventRecord.primaryParticipantName == null) && ((str7 = this.recordingUrl) != null ? str7.equals(externalEventRecord.recordingUrl) : externalEventRecord.recordingUrl == null) && ((str8 = this.transcriptUrl) != null ? str8.equals(externalEventRecord.transcriptUrl) : externalEventRecord.transcriptUrl == null) && ((str9 = this.rawEvent) != null ? str9.equals(externalEventRecord.rawEvent) : externalEventRecord.rawEvent == null) && ((str10 = this.message) != null ? str10.equals(externalEventRecord.message) : externalEventRecord.message == null) && ((str11 = this.status) != null ? str11.equals(externalEventRecord.status) : externalEventRecord.status == null) && ((str12 = this.eventSummary) != null ? str12.equals(externalEventRecord.eventSummary) : externalEventRecord.eventSummary == null) && ((str13 = this.eventDescription) != null ? str13.equals(externalEventRecord.eventDescription) : externalEventRecord.eventDescription == null) && ((str14 = this.eventUrl) != null ? str14.equals(externalEventRecord.eventUrl) : externalEventRecord.eventUrl == null) && ((str15 = this.eventStartTime) != null ? str15.equals(externalEventRecord.eventStartTime) : externalEventRecord.eventStartTime == null) && ((str16 = this.eventEndTime) != null ? str16.equals(externalEventRecord.eventEndTime) : externalEventRecord.eventEndTime == null) && ((str17 = this.createdAt) != null ? str17.equals(externalEventRecord.createdAt) : externalEventRecord.createdAt == null)) {
                String str18 = this.updatedAt;
                String str19 = externalEventRecord.updatedAt;
                if (str18 == null) {
                    if (str19 == null) {
                        return true;
                    }
                } else if (str18.equals(str19)) {
                    return true;
                }
            }
            return false;
        }

        public String eventDescription() {
            return this.eventDescription;
        }

        public String eventEndTime() {
            return this.eventEndTime;
        }

        public String eventStartTime() {
            return this.eventStartTime;
        }

        public String eventSummary() {
            return this.eventSummary;
        }

        public String eventUrl() {
            return this.eventUrl;
        }

        public String externalSourceId() {
            return this.externalSourceId;
        }

        public String externalSourceType() {
            return this.externalSourceType;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.externalSourceId.hashCode()) * 1000003) ^ this.externalSourceType.hashCode()) * 1000003;
                String str = this.engagementId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.userId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.contactId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.contactName;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.primaryParticipantEmailId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.primaryParticipantName;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.recordingUrl;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.transcriptUrl;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.rawEvent;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.message;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.status;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.eventSummary;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.eventDescription;
                int iHashCode14 = (iHashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.eventUrl;
                int iHashCode15 = (iHashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.eventStartTime;
                int iHashCode16 = (iHashCode15 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.eventEndTime;
                int iHashCode17 = (iHashCode16 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdAt;
                int iHashCode18 = (iHashCode17 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedAt;
                this.$hashCode = iHashCode18 ^ (str18 != null ? str18.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.ExternalEventRecord.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ExternalEventRecord.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ExternalEventRecord.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ExternalEventRecord.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ExternalEventRecord.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], ExternalEventRecord.this.externalSourceId);
                    responseWriter.writeString(responseFieldArr[4], ExternalEventRecord.this.externalSourceType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], ExternalEventRecord.this.engagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], ExternalEventRecord.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], ExternalEventRecord.this.contactId);
                    responseWriter.writeString(responseFieldArr[8], ExternalEventRecord.this.contactName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], ExternalEventRecord.this.primaryParticipantEmailId);
                    responseWriter.writeString(responseFieldArr[10], ExternalEventRecord.this.primaryParticipantName);
                    responseWriter.writeString(responseFieldArr[11], ExternalEventRecord.this.recordingUrl);
                    responseWriter.writeString(responseFieldArr[12], ExternalEventRecord.this.transcriptUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], ExternalEventRecord.this.rawEvent);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], ExternalEventRecord.this.message);
                    responseWriter.writeString(responseFieldArr[15], ExternalEventRecord.this.status);
                    responseWriter.writeString(responseFieldArr[16], ExternalEventRecord.this.eventSummary);
                    responseWriter.writeString(responseFieldArr[17], ExternalEventRecord.this.eventDescription);
                    responseWriter.writeString(responseFieldArr[18], ExternalEventRecord.this.eventUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], ExternalEventRecord.this.eventStartTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], ExternalEventRecord.this.eventEndTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], ExternalEventRecord.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], ExternalEventRecord.this.updatedAt);
                }
            };
        }

        public String message() {
            return this.message;
        }

        public String primaryParticipantEmailId() {
            return this.primaryParticipantEmailId;
        }

        public String primaryParticipantName() {
            return this.primaryParticipantName;
        }

        public String rawEvent() {
            return this.rawEvent;
        }

        public String recordingUrl() {
            return this.recordingUrl;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ExternalEventRecord{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", externalSourceId=" + this.externalSourceId + ", externalSourceType=" + this.externalSourceType + ", engagementId=" + this.engagementId + ", userId=" + this.userId + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", primaryParticipantEmailId=" + this.primaryParticipantEmailId + ", primaryParticipantName=" + this.primaryParticipantName + ", recordingUrl=" + this.recordingUrl + ", transcriptUrl=" + this.transcriptUrl + ", rawEvent=" + this.rawEvent + ", message=" + this.message + ", status=" + this.status + ", eventSummary=" + this.eventSummary + ", eventDescription=" + this.eventDescription + ", eventUrl=" + this.eventUrl + ", eventStartTime=" + this.eventStartTime + ", eventEndTime=" + this.eventEndTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String transcriptUrl() {
            return this.transcriptUrl;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static class LinkedCampaign {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Boolean allowMultiple;
        final String associatedEntityListId;
        final String campaignCategory;
        final String campaignChannelIdentifier;
        final String campaignData;
        final CampaignRunFrequencyUnit campaignRunFrequencyUnit;
        final Integer campaignRunFrequencyValue;
        final String campaignSubCategory;
        final CampaignType campaignType;
        final String createdAt;
        final List<String> daysToSend;
        final Integer deliveredCount;
        final String description;
        final Integer durationOfRunInDays;
        final String endDateOfRun;
        final Integer failedCount;
        final String id;
        final Boolean includeHistoricalMemberships;
        final Integer leadLimit;
        final Integer messageCreated;
        final String name;
        final String ownerId;
        final String primaryTeamId;
        final Integer readCount;
        final Integer repliedCount;
        final Integer sentCount;
        final String startDateOfRun;
        final CampaignStatus status;
        final String systemPauseReason;
        final List<String> tags;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<LinkedCampaign> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LinkedCampaign map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LinkedCampaign.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                CampaignType campaignTypeValueOf = string6 != null ? CampaignType.valueOf(string6) : null;
                String string7 = responseReader.readString(responseFieldArr[8]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String string8 = responseReader.readString(responseFieldArr[10]);
                CampaignRunFrequencyUnit campaignRunFrequencyUnitValueOf = string8 != null ? CampaignRunFrequencyUnit.valueOf(string8) : null;
                Integer num = responseReader.readInt(responseFieldArr[11]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                Integer num2 = responseReader.readInt(responseFieldArr[14]);
                List list = responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.LinkedCampaign.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]);
                String string9 = responseReader.readString(responseFieldArr[18]);
                return new LinkedCampaign(string, str, str2, string2, string3, string4, string5, campaignTypeValueOf, string7, str3, campaignRunFrequencyUnitValueOf, num, str4, str5, num2, list, str6, str7, string9 != null ? CampaignStatus.valueOf(string9) : null, responseReader.readString(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readBoolean(responseFieldArr[21]), responseReader.readBoolean(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readInt(responseFieldArr[26]), responseReader.readInt(responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readList(responseFieldArr[29], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.LinkedCampaign.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readInt(responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forString("campaignCategory", "campaignCategory", null, true, Collections.emptyList()), ResponseField.forString("campaignSubCategory", "campaignSubCategory", null, true, Collections.emptyList()), ResponseField.forString("campaignType", "campaignType", null, false, Collections.emptyList()), ResponseField.forString("campaignChannelIdentifier", "campaignChannelIdentifier", null, true, Collections.emptyList()), ResponseField.forCustomType("campaignData", "campaignData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("campaignRunFrequencyUnit", "campaignRunFrequencyUnit", null, true, Collections.emptyList()), ResponseField.forInt("campaignRunFrequencyValue", "campaignRunFrequencyValue", null, true, Collections.emptyList()), ResponseField.forCustomType("startDateOfRun", "startDateOfRun", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDateOfRun", "endDateOfRun", null, true, customType2, Collections.emptyList()), ResponseField.forInt("durationOfRunInDays", "durationOfRunInDays", null, true, Collections.emptyList()), ResponseField.forList("daysToSend", "daysToSend", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forString("systemPauseReason", "systemPauseReason", null, true, Collections.emptyList()), ResponseField.forCustomType("associatedEntityListId", "associatedEntityListId", null, false, customType, Collections.emptyList()), ResponseField.forBoolean("includeHistoricalMemberships", "includeHistoricalMemberships", null, true, Collections.emptyList()), ResponseField.forBoolean("allowMultiple", "allowMultiple", null, true, Collections.emptyList()), ResponseField.forInt("messageCreated", "messageCreated", null, true, Collections.emptyList()), ResponseField.forInt("sentCount", "sentCount", null, true, Collections.emptyList()), ResponseField.forInt("deliveredCount", "deliveredCount", null, true, Collections.emptyList()), ResponseField.forInt("readCount", "readCount", null, true, Collections.emptyList()), ResponseField.forInt("repliedCount", "repliedCount", null, true, Collections.emptyList()), ResponseField.forInt("failedCount", "failedCount", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forInt("leadLimit", "leadLimit", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public LinkedCampaign(String str, String str2, String str3, String str4, String str5, String str6, String str7, CampaignType campaignType, String str8, String str9, CampaignRunFrequencyUnit campaignRunFrequencyUnit, Integer num, String str10, String str11, Integer num2, List<String> list, String str12, String str13, CampaignStatus campaignStatus, String str14, String str15, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, List<String> list2, Integer num9, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = (String) Utils.checkNotNull(str4, "name == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.campaignCategory = str6;
            this.campaignSubCategory = str7;
            this.campaignType = (CampaignType) Utils.checkNotNull(campaignType, "campaignType == null");
            this.campaignChannelIdentifier = str8;
            this.campaignData = str9;
            this.campaignRunFrequencyUnit = campaignRunFrequencyUnit;
            this.campaignRunFrequencyValue = num;
            this.startDateOfRun = str10;
            this.endDateOfRun = str11;
            this.durationOfRunInDays = num2;
            this.daysToSend = list;
            this.ownerId = (String) Utils.checkNotNull(str12, "ownerId == null");
            this.primaryTeamId = str13;
            this.status = (CampaignStatus) Utils.checkNotNull(campaignStatus, "status == null");
            this.systemPauseReason = str14;
            this.associatedEntityListId = (String) Utils.checkNotNull(str15, "associatedEntityListId == null");
            this.includeHistoricalMemberships = bool;
            this.allowMultiple = bool2;
            this.messageCreated = num3;
            this.sentCount = num4;
            this.deliveredCount = num5;
            this.readCount = num6;
            this.repliedCount = num7;
            this.failedCount = num8;
            this.tags = list2;
            this.leadLimit = num9;
            this.createdAt = str16;
            this.updatedAt = str17;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Boolean allowMultiple() {
            return this.allowMultiple;
        }

        public String associatedEntityListId() {
            return this.associatedEntityListId;
        }

        public String campaignCategory() {
            return this.campaignCategory;
        }

        public String campaignChannelIdentifier() {
            return this.campaignChannelIdentifier;
        }

        public String campaignData() {
            return this.campaignData;
        }

        public CampaignRunFrequencyUnit campaignRunFrequencyUnit() {
            return this.campaignRunFrequencyUnit;
        }

        public Integer campaignRunFrequencyValue() {
            return this.campaignRunFrequencyValue;
        }

        public String campaignSubCategory() {
            return this.campaignSubCategory;
        }

        public CampaignType campaignType() {
            return this.campaignType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public List<String> daysToSend() {
            return this.daysToSend;
        }

        public Integer deliveredCount() {
            return this.deliveredCount;
        }

        public String description() {
            return this.description;
        }

        public Integer durationOfRunInDays() {
            return this.durationOfRunInDays;
        }

        public String endDateOfRun() {
            return this.endDateOfRun;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            CampaignRunFrequencyUnit campaignRunFrequencyUnit;
            Integer num;
            String str5;
            String str6;
            Integer num2;
            List<String> list;
            String str7;
            String str8;
            Boolean bool;
            Boolean bool2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Integer num7;
            Integer num8;
            List<String> list2;
            Integer num9;
            String str9;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LinkedCampaign)) {
                return false;
            }
            LinkedCampaign linkedCampaign = (LinkedCampaign) obj;
            if (this.__typename.equals(linkedCampaign.__typename) && this.id.equals(linkedCampaign.id) && this.accountId.equals(linkedCampaign.accountId) && this.name.equals(linkedCampaign.name) && this.description.equals(linkedCampaign.description) && ((str = this.campaignCategory) != null ? str.equals(linkedCampaign.campaignCategory) : linkedCampaign.campaignCategory == null) && ((str2 = this.campaignSubCategory) != null ? str2.equals(linkedCampaign.campaignSubCategory) : linkedCampaign.campaignSubCategory == null) && this.campaignType.equals(linkedCampaign.campaignType) && ((str3 = this.campaignChannelIdentifier) != null ? str3.equals(linkedCampaign.campaignChannelIdentifier) : linkedCampaign.campaignChannelIdentifier == null) && ((str4 = this.campaignData) != null ? str4.equals(linkedCampaign.campaignData) : linkedCampaign.campaignData == null) && ((campaignRunFrequencyUnit = this.campaignRunFrequencyUnit) != null ? campaignRunFrequencyUnit.equals(linkedCampaign.campaignRunFrequencyUnit) : linkedCampaign.campaignRunFrequencyUnit == null) && ((num = this.campaignRunFrequencyValue) != null ? num.equals(linkedCampaign.campaignRunFrequencyValue) : linkedCampaign.campaignRunFrequencyValue == null) && ((str5 = this.startDateOfRun) != null ? str5.equals(linkedCampaign.startDateOfRun) : linkedCampaign.startDateOfRun == null) && ((str6 = this.endDateOfRun) != null ? str6.equals(linkedCampaign.endDateOfRun) : linkedCampaign.endDateOfRun == null) && ((num2 = this.durationOfRunInDays) != null ? num2.equals(linkedCampaign.durationOfRunInDays) : linkedCampaign.durationOfRunInDays == null) && ((list = this.daysToSend) != null ? list.equals(linkedCampaign.daysToSend) : linkedCampaign.daysToSend == null) && this.ownerId.equals(linkedCampaign.ownerId) && ((str7 = this.primaryTeamId) != null ? str7.equals(linkedCampaign.primaryTeamId) : linkedCampaign.primaryTeamId == null) && this.status.equals(linkedCampaign.status) && ((str8 = this.systemPauseReason) != null ? str8.equals(linkedCampaign.systemPauseReason) : linkedCampaign.systemPauseReason == null) && this.associatedEntityListId.equals(linkedCampaign.associatedEntityListId) && ((bool = this.includeHistoricalMemberships) != null ? bool.equals(linkedCampaign.includeHistoricalMemberships) : linkedCampaign.includeHistoricalMemberships == null) && ((bool2 = this.allowMultiple) != null ? bool2.equals(linkedCampaign.allowMultiple) : linkedCampaign.allowMultiple == null) && ((num3 = this.messageCreated) != null ? num3.equals(linkedCampaign.messageCreated) : linkedCampaign.messageCreated == null) && ((num4 = this.sentCount) != null ? num4.equals(linkedCampaign.sentCount) : linkedCampaign.sentCount == null) && ((num5 = this.deliveredCount) != null ? num5.equals(linkedCampaign.deliveredCount) : linkedCampaign.deliveredCount == null) && ((num6 = this.readCount) != null ? num6.equals(linkedCampaign.readCount) : linkedCampaign.readCount == null) && ((num7 = this.repliedCount) != null ? num7.equals(linkedCampaign.repliedCount) : linkedCampaign.repliedCount == null) && ((num8 = this.failedCount) != null ? num8.equals(linkedCampaign.failedCount) : linkedCampaign.failedCount == null) && ((list2 = this.tags) != null ? list2.equals(linkedCampaign.tags) : linkedCampaign.tags == null) && ((num9 = this.leadLimit) != null ? num9.equals(linkedCampaign.leadLimit) : linkedCampaign.leadLimit == null) && ((str9 = this.createdAt) != null ? str9.equals(linkedCampaign.createdAt) : linkedCampaign.createdAt == null)) {
                String str10 = this.updatedAt;
                String str11 = linkedCampaign.updatedAt;
                if (str10 == null) {
                    if (str11 == null) {
                        return true;
                    }
                } else if (str10.equals(str11)) {
                    return true;
                }
            }
            return false;
        }

        public Integer failedCount() {
            return this.failedCount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003;
                String str = this.campaignCategory;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.campaignSubCategory;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.campaignType.hashCode()) * 1000003;
                String str3 = this.campaignChannelIdentifier;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.campaignData;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                CampaignRunFrequencyUnit campaignRunFrequencyUnit = this.campaignRunFrequencyUnit;
                int iHashCode6 = (iHashCode5 ^ (campaignRunFrequencyUnit == null ? 0 : campaignRunFrequencyUnit.hashCode())) * 1000003;
                Integer num = this.campaignRunFrequencyValue;
                int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str5 = this.startDateOfRun;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.endDateOfRun;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num2 = this.durationOfRunInDays;
                int iHashCode10 = (iHashCode9 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                List<String> list = this.daysToSend;
                int iHashCode11 = (((iHashCode10 ^ (list == null ? 0 : list.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str7 = this.primaryTeamId;
                int iHashCode12 = (((iHashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003) ^ this.status.hashCode()) * 1000003;
                String str8 = this.systemPauseReason;
                int iHashCode13 = (((iHashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.associatedEntityListId.hashCode()) * 1000003;
                Boolean bool = this.includeHistoricalMemberships;
                int iHashCode14 = (iHashCode13 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.allowMultiple;
                int iHashCode15 = (iHashCode14 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Integer num3 = this.messageCreated;
                int iHashCode16 = (iHashCode15 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.sentCount;
                int iHashCode17 = (iHashCode16 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.deliveredCount;
                int iHashCode18 = (iHashCode17 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.readCount;
                int iHashCode19 = (iHashCode18 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.repliedCount;
                int iHashCode20 = (iHashCode19 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                Integer num8 = this.failedCount;
                int iHashCode21 = (iHashCode20 ^ (num8 == null ? 0 : num8.hashCode())) * 1000003;
                List<String> list2 = this.tags;
                int iHashCode22 = (iHashCode21 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                Integer num9 = this.leadLimit;
                int iHashCode23 = (iHashCode22 ^ (num9 == null ? 0 : num9.hashCode())) * 1000003;
                String str9 = this.createdAt;
                int iHashCode24 = (iHashCode23 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.updatedAt;
                this.$hashCode = iHashCode24 ^ (str10 != null ? str10.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean includeHistoricalMemberships() {
            return this.includeHistoricalMemberships;
        }

        public Integer leadLimit() {
            return this.leadLimit;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.LinkedCampaign.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LinkedCampaign.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LinkedCampaign.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LinkedCampaign.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], LinkedCampaign.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], LinkedCampaign.this.name);
                    responseWriter.writeString(responseFieldArr[4], LinkedCampaign.this.description);
                    responseWriter.writeString(responseFieldArr[5], LinkedCampaign.this.campaignCategory);
                    responseWriter.writeString(responseFieldArr[6], LinkedCampaign.this.campaignSubCategory);
                    responseWriter.writeString(responseFieldArr[7], LinkedCampaign.this.campaignType.name());
                    responseWriter.writeString(responseFieldArr[8], LinkedCampaign.this.campaignChannelIdentifier);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LinkedCampaign.this.campaignData);
                    ResponseField responseField = responseFieldArr[10];
                    CampaignRunFrequencyUnit campaignRunFrequencyUnit = LinkedCampaign.this.campaignRunFrequencyUnit;
                    responseWriter.writeString(responseField, campaignRunFrequencyUnit != null ? campaignRunFrequencyUnit.name() : null);
                    responseWriter.writeInt(responseFieldArr[11], LinkedCampaign.this.campaignRunFrequencyValue);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], LinkedCampaign.this.startDateOfRun);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], LinkedCampaign.this.endDateOfRun);
                    responseWriter.writeInt(responseFieldArr[14], LinkedCampaign.this.durationOfRunInDays);
                    responseWriter.writeList(responseFieldArr[15], LinkedCampaign.this.daysToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.LinkedCampaign.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], LinkedCampaign.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], LinkedCampaign.this.primaryTeamId);
                    responseWriter.writeString(responseFieldArr[18], LinkedCampaign.this.status.name());
                    responseWriter.writeString(responseFieldArr[19], LinkedCampaign.this.systemPauseReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], LinkedCampaign.this.associatedEntityListId);
                    responseWriter.writeBoolean(responseFieldArr[21], LinkedCampaign.this.includeHistoricalMemberships);
                    responseWriter.writeBoolean(responseFieldArr[22], LinkedCampaign.this.allowMultiple);
                    responseWriter.writeInt(responseFieldArr[23], LinkedCampaign.this.messageCreated);
                    responseWriter.writeInt(responseFieldArr[24], LinkedCampaign.this.sentCount);
                    responseWriter.writeInt(responseFieldArr[25], LinkedCampaign.this.deliveredCount);
                    responseWriter.writeInt(responseFieldArr[26], LinkedCampaign.this.readCount);
                    responseWriter.writeInt(responseFieldArr[27], LinkedCampaign.this.repliedCount);
                    responseWriter.writeInt(responseFieldArr[28], LinkedCampaign.this.failedCount);
                    responseWriter.writeList(responseFieldArr[29], LinkedCampaign.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.LinkedCampaign.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeInt(responseFieldArr[30], LinkedCampaign.this.leadLimit);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], LinkedCampaign.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], LinkedCampaign.this.updatedAt);
                }
            };
        }

        public Integer messageCreated() {
            return this.messageCreated;
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public Integer readCount() {
            return this.readCount;
        }

        public Integer repliedCount() {
            return this.repliedCount;
        }

        public Integer sentCount() {
            return this.sentCount;
        }

        public String startDateOfRun() {
            return this.startDateOfRun;
        }

        public CampaignStatus status() {
            return this.status;
        }

        public String systemPauseReason() {
            return this.systemPauseReason;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LinkedCampaign{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", campaignCategory=" + this.campaignCategory + ", campaignSubCategory=" + this.campaignSubCategory + ", campaignType=" + this.campaignType + ", campaignChannelIdentifier=" + this.campaignChannelIdentifier + ", campaignData=" + this.campaignData + ", campaignRunFrequencyUnit=" + this.campaignRunFrequencyUnit + ", campaignRunFrequencyValue=" + this.campaignRunFrequencyValue + ", startDateOfRun=" + this.startDateOfRun + ", endDateOfRun=" + this.endDateOfRun + ", durationOfRunInDays=" + this.durationOfRunInDays + ", daysToSend=" + this.daysToSend + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", status=" + this.status + ", systemPauseReason=" + this.systemPauseReason + ", associatedEntityListId=" + this.associatedEntityListId + ", includeHistoricalMemberships=" + this.includeHistoricalMemberships + ", allowMultiple=" + this.allowMultiple + ", messageCreated=" + this.messageCreated + ", sentCount=" + this.sentCount + ", deliveredCount=" + this.deliveredCount + ", readCount=" + this.readCount + ", repliedCount=" + this.repliedCount + ", failedCount=" + this.failedCount + ", tags=" + this.tags + ", leadLimit=" + this.leadLimit + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.LinkedFiles.1
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

    public static class Locations {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Locations> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Locations map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Locations.$responseFields;
                return new Locations(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Locations(String str, String str2) {
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
            if (!(obj instanceof Locations)) {
                return false;
            }
            Locations locations = (Locations) obj;
            if (this.__typename.equals(locations.__typename)) {
                String str = this.nextToken;
                String str2 = locations.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Locations.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Locations.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Locations.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Locations.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Locations{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class MeetingParticipant {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String endTime;
        final String id;
        final String name;
        final String startTime;

        public static final class Mapper implements ResponseFieldMapper<MeetingParticipant> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public MeetingParticipant map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = MeetingParticipant.$responseFields;
                return new MeetingParticipant(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]));
            }
        }

        static {
            CustomType customType = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forCustomType("startTime", "startTime", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("endTime", "endTime", null, true, customType, Collections.emptyList())};
        }

        public MeetingParticipant(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = str2;
            this.name = str3;
            this.startTime = str4;
            this.endTime = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String endTime() {
            return this.endTime;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MeetingParticipant)) {
                return false;
            }
            MeetingParticipant meetingParticipant = (MeetingParticipant) obj;
            if (this.__typename.equals(meetingParticipant.__typename) && ((str = this.id) != null ? str.equals(meetingParticipant.id) : meetingParticipant.id == null) && ((str2 = this.name) != null ? str2.equals(meetingParticipant.name) : meetingParticipant.name == null) && ((str3 = this.startTime) != null ? str3.equals(meetingParticipant.startTime) : meetingParticipant.startTime == null)) {
                String str4 = this.endTime;
                String str5 = meetingParticipant.endTime;
                if (str4 == null) {
                    if (str5 == null) {
                        return true;
                    }
                } else if (str4.equals(str5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.id;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.name;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.startTime;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.endTime;
                this.$hashCode = iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.MeetingParticipant.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = MeetingParticipant.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], MeetingParticipant.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], MeetingParticipant.this.id);
                    responseWriter.writeString(responseFieldArr[2], MeetingParticipant.this.name);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], MeetingParticipant.this.startTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], MeetingParticipant.this.endTime);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String startTime() {
            return this.startTime;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MeetingParticipant{__typename=" + this.__typename + ", id=" + this.id + ", name=" + this.name + ", startTime=" + this.startTime + ", endTime=" + this.endTime + "}";
            }
            return this.$toString;
        }
    }

    public static class NextStepTask {
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

        public static final class Mapper implements ResponseFieldMapper<NextStepTask> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public NextStepTask map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = NextStepTask.$responseFields;
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
                return new NextStepTask(string, str, str2, engagementTypeValueOf, str3, str4, contactAssignmentStatusValueOf, str5, str6, str7, str8, str9, string4, engagementStatusValueOf, str10, str11, bool, string6, string7, callDirectionValueOf, callConnectStatusValueOf, str12, str13, num, string10, string11, string12, string13, noteAdditionMethodValueOf, string15, string16, bool2, string17, string18, string19 != null ? TaskActivityType.valueOf(string19) : null, responseReader.readString(responseFieldArr[35]), responseReader.readString(responseFieldArr[36]), responseReader.readString(responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readString(responseFieldArr[39]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), responseReader.readString(responseFieldArr[42]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readString(responseFieldArr[45]), responseReader.readString(responseFieldArr[46]), responseReader.readString(responseFieldArr[47]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), responseReader.readString(responseFieldArr[50]), responseReader.readString(responseFieldArr[51]), responseReader.readString(responseFieldArr[52]), responseReader.readString(responseFieldArr[53]), responseReader.readString(responseFieldArr[54]), responseReader.readString(responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]), responseReader.readString(responseFieldArr[57]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[58]), responseReader.readString(responseFieldArr[59]), responseReader.readString(responseFieldArr[60]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[61]), responseReader.readString(responseFieldArr[62]), responseReader.readString(responseFieldArr[63]), responseReader.readString(responseFieldArr[64]), responseReader.readString(responseFieldArr[65]), responseReader.readString(responseFieldArr[66]), responseReader.readList(responseFieldArr[67], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.NextStepTask.Mapper.1
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

        public NextStepTask(String str, String str2, String str3, EngagementType engagementType, String str4, String str5, ContactAssignmentStatus contactAssignmentStatus, String str6, String str7, String str8, String str9, String str10, String str11, EngagementStatus engagementStatus, String str12, String str13, Boolean bool, String str14, String str15, CallDirection callDirection, CallConnectStatus callConnectStatus, String str16, String str17, Integer num, String str18, String str19, String str20, String str21, NoteAdditionMethod noteAdditionMethod, String str22, String str23, Boolean bool2, String str24, String str25, TaskActivityType taskActivityType, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, List<String> list, String str58, String str59, Integer num2, String str60, String str61, String str62, String str63, String str64, String str65, Integer num3, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73) {
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
            if (!(obj instanceof NextStepTask)) {
                return false;
            }
            NextStepTask nextStepTask = (NextStepTask) obj;
            if (this.__typename.equals(nextStepTask.__typename) && this.id.equals(nextStepTask.id) && this.accountId.equals(nextStepTask.accountId) && this.engagementType.equals(nextStepTask.engagementType) && ((str = this.contactId) != null ? str.equals(nextStepTask.contactId) : nextStepTask.contactId == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(nextStepTask.primaryTeamId) : nextStepTask.primaryTeamId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(nextStepTask.toBeAssigned) : nextStepTask.toBeAssigned == null) && ((str3 = this.ownerId) != null ? str3.equals(nextStepTask.ownerId) : nextStepTask.ownerId == null) && ((str4 = this.contactPrimaryTeamId) != null ? str4.equals(nextStepTask.contactPrimaryTeamId) : nextStepTask.contactPrimaryTeamId == null) && ((str5 = this.contactOwnerId) != null ? str5.equals(nextStepTask.contactOwnerId) : nextStepTask.contactOwnerId == null) && ((str6 = this.addedById) != null ? str6.equals(nextStepTask.addedById) : nextStepTask.addedById == null) && ((str7 = this.updatedById) != null ? str7.equals(nextStepTask.updatedById) : nextStepTask.updatedById == null) && ((str8 = this.callStatus) != null ? str8.equals(nextStepTask.callStatus) : nextStepTask.callStatus == null) && this.engagementStatus.equals(nextStepTask.engagementStatus) && ((str9 = this.parentEngagementId) != null ? str9.equals(nextStepTask.parentEngagementId) : nextStepTask.parentEngagementId == null) && ((str10 = this.nextStepTaskId) != null ? str10.equals(nextStepTask.nextStepTaskId) : nextStepTask.nextStepTaskId == null) && ((bool = this.syncStatus) != null ? bool.equals(nextStepTask.syncStatus) : nextStepTask.syncStatus == null) && ((str11 = this.externalNumber) != null ? str11.equals(nextStepTask.externalNumber) : nextStepTask.externalNumber == null) && ((str12 = this.userNumber) != null ? str12.equals(nextStepTask.userNumber) : nextStepTask.userNumber == null) && ((callDirection = this.callDirection) != null ? callDirection.equals(nextStepTask.callDirection) : nextStepTask.callDirection == null) && ((callConnectStatus = this.callConnectStatus) != null ? callConnectStatus.equals(nextStepTask.callConnectStatus) : nextStepTask.callConnectStatus == null) && ((str13 = this.callStartTime) != null ? str13.equals(nextStepTask.callStartTime) : nextStepTask.callStartTime == null) && ((str14 = this.callEndTime) != null ? str14.equals(nextStepTask.callEndTime) : nextStepTask.callEndTime == null) && ((num = this.durationInMillis) != null ? num.equals(nextStepTask.durationInMillis) : nextStepTask.durationInMillis == null) && ((str15 = this.callOutcome) != null ? str15.equals(nextStepTask.callOutcome) : nextStepTask.callOutcome == null) && ((str16 = this.callOutcomeNature) != null ? str16.equals(nextStepTask.callOutcomeNature) : nextStepTask.callOutcomeNature == null) && ((str17 = this.callRecordingExternalResource) != null ? str17.equals(nextStepTask.callRecordingExternalResource) : nextStepTask.callRecordingExternalResource == null) && ((str18 = this.noteHeading) != null ? str18.equals(nextStepTask.noteHeading) : nextStepTask.noteHeading == null) && ((noteAdditionMethod = this.noteAdditionMethod) != null ? noteAdditionMethod.equals(nextStepTask.noteAdditionMethod) : nextStepTask.noteAdditionMethod == null) && ((str19 = this.voiceNoteUrl) != null ? str19.equals(nextStepTask.voiceNoteUrl) : nextStepTask.voiceNoteUrl == null) && ((str20 = this.body) != null ? str20.equals(nextStepTask.body) : nextStepTask.body == null) && ((bool2 = this.isManualTask) != null ? bool2.equals(nextStepTask.isManualTask) : nextStepTask.isManualTask == null) && ((str21 = this.taskHeading) != null ? str21.equals(nextStepTask.taskHeading) : nextStepTask.taskHeading == null) && ((str22 = this.taskType) != null ? str22.equals(nextStepTask.taskType) : nextStepTask.taskType == null) && ((taskActivityType = this.taskActivityType) != null ? taskActivityType.equals(nextStepTask.taskActivityType) : nextStepTask.taskActivityType == null) && ((str23 = this.taskInputNote) != null ? str23.equals(nextStepTask.taskInputNote) : nextStepTask.taskInputNote == null) && ((str24 = this.taskPriority) != null ? str24.equals(nextStepTask.taskPriority) : nextStepTask.taskPriority == null) && ((str25 = this.taskCompletionNote) != null ? str25.equals(nextStepTask.taskCompletionNote) : nextStepTask.taskCompletionNote == null) && ((str26 = this.taskCompletionTime) != null ? str26.equals(nextStepTask.taskCompletionTime) : nextStepTask.taskCompletionTime == null) && ((str27 = this.taskCompletionType) != null ? str27.equals(nextStepTask.taskCompletionType) : nextStepTask.taskCompletionType == null) && ((str28 = this.dueDateTime) != null ? str28.equals(nextStepTask.dueDateTime) : nextStepTask.dueDateTime == null) && ((str29 = this.nextFollowUpOn) != null ? str29.equals(nextStepTask.nextFollowUpOn) : nextStepTask.nextFollowUpOn == null) && ((str30 = this.nextFollowUpSetBy) != null ? str30.equals(nextStepTask.nextFollowUpSetBy) : nextStepTask.nextFollowUpSetBy == null) && ((str31 = this.reminderDateTime) != null ? str31.equals(nextStepTask.reminderDateTime) : nextStepTask.reminderDateTime == null) && ((str32 = this.callRecordingUrl) != null ? str32.equals(nextStepTask.callRecordingUrl) : nextStepTask.callRecordingUrl == null) && ((str33 = this.callTranscriptUrl) != null ? str33.equals(nextStepTask.callTranscriptUrl) : nextStepTask.callTranscriptUrl == null) && ((str34 = this.callTranscriptSummary) != null ? str34.equals(nextStepTask.callTranscriptSummary) : nextStepTask.callTranscriptSummary == null) && ((str35 = this.uploadedFiledUrl) != null ? str35.equals(nextStepTask.uploadedFiledUrl) : nextStepTask.uploadedFiledUrl == null) && ((str36 = this.visitTime) != null ? str36.equals(nextStepTask.visitTime) : nextStepTask.visitTime == null) && ((str37 = this.visitNote) != null ? str37.equals(nextStepTask.visitNote) : nextStepTask.visitNote == null) && ((str38 = this.visitOutcome) != null ? str38.equals(nextStepTask.visitOutcome) : nextStepTask.visitOutcome == null) && ((str39 = this.visitOutcomeNature) != null ? str39.equals(nextStepTask.visitOutcomeNature) : nextStepTask.visitOutcomeNature == null) && ((str40 = this.videoCallPlatform) != null ? str40.equals(nextStepTask.videoCallPlatform) : nextStepTask.videoCallPlatform == null) && ((str41 = this.videoCallLink) != null ? str41.equals(nextStepTask.videoCallLink) : nextStepTask.videoCallLink == null) && ((str42 = this.meetingName) != null ? str42.equals(nextStepTask.meetingName) : nextStepTask.meetingName == null) && ((str43 = this.meetingCode) != null ? str43.equals(nextStepTask.meetingCode) : nextStepTask.meetingCode == null) && ((str44 = this.videoCallMetadata) != null ? str44.equals(nextStepTask.videoCallMetadata) : nextStepTask.videoCallMetadata == null) && ((str45 = this.videoCallOutcome) != null ? str45.equals(nextStepTask.videoCallOutcome) : nextStepTask.videoCallOutcome == null) && ((str46 = this.paymentDataId) != null ? str46.equals(nextStepTask.paymentDataId) : nextStepTask.paymentDataId == null) && ((str47 = this.calendarEventId) != null ? str47.equals(nextStepTask.calendarEventId) : nextStepTask.calendarEventId == null) && ((str48 = this.calendarName) != null ? str48.equals(nextStepTask.calendarName) : nextStepTask.calendarName == null) && ((str49 = this.campaignId) != null ? str49.equals(nextStepTask.campaignId) : nextStepTask.campaignId == null) && ((str50 = this.campaignRun) != null ? str50.equals(nextStepTask.campaignRun) : nextStepTask.campaignRun == null) && ((str51 = this.engagementSourceType) != null ? str51.equals(nextStepTask.engagementSourceType) : nextStepTask.engagementSourceType == null) && ((str52 = this.engagementSource) != null ? str52.equals(nextStepTask.engagementSource) : nextStepTask.engagementSource == null) && ((str53 = this.engagementSourceLevelTwo) != null ? str53.equals(nextStepTask.engagementSourceLevelTwo) : nextStepTask.engagementSourceLevelTwo == null) && ((str54 = this.systemAction) != null ? str54.equals(nextStepTask.systemAction) : nextStepTask.systemAction == null) && ((list = this.taskEngagementActions) != null ? list.equals(nextStepTask.taskEngagementActions) : nextStepTask.taskEngagementActions == null) && ((str55 = this.taskEngagementActionsUpdatedAt) != null ? str55.equals(nextStepTask.taskEngagementActionsUpdatedAt) : nextStepTask.taskEngagementActionsUpdatedAt == null) && ((str56 = this.firstTaskEngagementActionOn) != null ? str56.equals(nextStepTask.firstTaskEngagementActionOn) : nextStepTask.firstTaskEngagementActionOn == null) && ((num2 = this.taskEngagementActionCount) != null ? num2.equals(nextStepTask.taskEngagementActionCount) : nextStepTask.taskEngagementActionCount == null) && ((str57 = this.customCallOutcomeData) != null ? str57.equals(nextStepTask.customCallOutcomeData) : nextStepTask.customCallOutcomeData == null) && ((str58 = this.customVisitOutcomeData) != null ? str58.equals(nextStepTask.customVisitOutcomeData) : nextStepTask.customVisitOutcomeData == null) && ((str59 = this.customTaskCompletionData) != null ? str59.equals(nextStepTask.customTaskCompletionData) : nextStepTask.customTaskCompletionData == null) && ((str60 = this.customTaskInputData) != null ? str60.equals(nextStepTask.customTaskInputData) : nextStepTask.customTaskInputData == null) && ((str61 = this.customVideoCallInputData) != null ? str61.equals(nextStepTask.customVideoCallInputData) : nextStepTask.customVideoCallInputData == null) && ((str62 = this.deviceId) != null ? str62.equals(nextStepTask.deviceId) : nextStepTask.deviceId == null) && ((num3 = this.totalCallDuration) != null ? num3.equals(nextStepTask.totalCallDuration) : nextStepTask.totalCallDuration == null) && ((str63 = this.cloudProviderNumber) != null ? str63.equals(nextStepTask.cloudProviderNumber) : nextStepTask.cloudProviderNumber == null) && ((str64 = this.hangupReason) != null ? str64.equals(nextStepTask.hangupReason) : nextStepTask.hangupReason == null) && ((str65 = this.cloudProvider) != null ? str65.equals(nextStepTask.cloudProvider) : nextStepTask.cloudProvider == null) && ((str66 = this.callType) != null ? str66.equals(nextStepTask.callType) : nextStepTask.callType == null) && ((str67 = this.phoneCallLogId) != null ? str67.equals(nextStepTask.phoneCallLogId) : nextStepTask.phoneCallLogId == null) && ((str68 = this.externalEventRecordId) != null ? str68.equals(nextStepTask.externalEventRecordId) : nextStepTask.externalEventRecordId == null) && ((str69 = this.createdAt) != null ? str69.equals(nextStepTask.createdAt) : nextStepTask.createdAt == null)) {
                String str70 = this.updatedAt;
                String str71 = nextStepTask.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.NextStepTask.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = NextStepTask.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], NextStepTask.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], NextStepTask.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], NextStepTask.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], NextStepTask.this.engagementType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], NextStepTask.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], NextStepTask.this.primaryTeamId);
                    ResponseField responseField = responseFieldArr[6];
                    ContactAssignmentStatus contactAssignmentStatus = NextStepTask.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], NextStepTask.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], NextStepTask.this.contactPrimaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], NextStepTask.this.contactOwnerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], NextStepTask.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], NextStepTask.this.updatedById);
                    responseWriter.writeString(responseFieldArr[12], NextStepTask.this.callStatus);
                    responseWriter.writeString(responseFieldArr[13], NextStepTask.this.engagementStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], NextStepTask.this.parentEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], NextStepTask.this.nextStepTaskId);
                    responseWriter.writeBoolean(responseFieldArr[16], NextStepTask.this.syncStatus);
                    responseWriter.writeString(responseFieldArr[17], NextStepTask.this.externalNumber);
                    responseWriter.writeString(responseFieldArr[18], NextStepTask.this.userNumber);
                    ResponseField responseField2 = responseFieldArr[19];
                    CallDirection callDirection = NextStepTask.this.callDirection;
                    responseWriter.writeString(responseField2, callDirection != null ? callDirection.name() : null);
                    ResponseField responseField3 = responseFieldArr[20];
                    CallConnectStatus callConnectStatus = NextStepTask.this.callConnectStatus;
                    responseWriter.writeString(responseField3, callConnectStatus != null ? callConnectStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], NextStepTask.this.callStartTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], NextStepTask.this.callEndTime);
                    responseWriter.writeInt(responseFieldArr[23], NextStepTask.this.durationInMillis);
                    responseWriter.writeString(responseFieldArr[24], NextStepTask.this.callOutcome);
                    responseWriter.writeString(responseFieldArr[25], NextStepTask.this.callOutcomeNature);
                    responseWriter.writeString(responseFieldArr[26], NextStepTask.this.callRecordingExternalResource);
                    responseWriter.writeString(responseFieldArr[27], NextStepTask.this.noteHeading);
                    ResponseField responseField4 = responseFieldArr[28];
                    NoteAdditionMethod noteAdditionMethod = NextStepTask.this.noteAdditionMethod;
                    responseWriter.writeString(responseField4, noteAdditionMethod != null ? noteAdditionMethod.name() : null);
                    responseWriter.writeString(responseFieldArr[29], NextStepTask.this.voiceNoteUrl);
                    responseWriter.writeString(responseFieldArr[30], NextStepTask.this.body);
                    responseWriter.writeBoolean(responseFieldArr[31], NextStepTask.this.isManualTask);
                    responseWriter.writeString(responseFieldArr[32], NextStepTask.this.taskHeading);
                    responseWriter.writeString(responseFieldArr[33], NextStepTask.this.taskType);
                    ResponseField responseField5 = responseFieldArr[34];
                    TaskActivityType taskActivityType = NextStepTask.this.taskActivityType;
                    responseWriter.writeString(responseField5, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeString(responseFieldArr[35], NextStepTask.this.taskInputNote);
                    responseWriter.writeString(responseFieldArr[36], NextStepTask.this.taskPriority);
                    responseWriter.writeString(responseFieldArr[37], NextStepTask.this.taskCompletionNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], NextStepTask.this.taskCompletionTime);
                    responseWriter.writeString(responseFieldArr[39], NextStepTask.this.taskCompletionType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[40], NextStepTask.this.dueDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[41], NextStepTask.this.nextFollowUpOn);
                    responseWriter.writeString(responseFieldArr[42], NextStepTask.this.nextFollowUpSetBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[43], NextStepTask.this.reminderDateTime);
                    responseWriter.writeString(responseFieldArr[44], NextStepTask.this.callRecordingUrl);
                    responseWriter.writeString(responseFieldArr[45], NextStepTask.this.callTranscriptUrl);
                    responseWriter.writeString(responseFieldArr[46], NextStepTask.this.callTranscriptSummary);
                    responseWriter.writeString(responseFieldArr[47], NextStepTask.this.uploadedFiledUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[48], NextStepTask.this.visitTime);
                    responseWriter.writeString(responseFieldArr[49], NextStepTask.this.visitNote);
                    responseWriter.writeString(responseFieldArr[50], NextStepTask.this.visitOutcome);
                    responseWriter.writeString(responseFieldArr[51], NextStepTask.this.visitOutcomeNature);
                    responseWriter.writeString(responseFieldArr[52], NextStepTask.this.videoCallPlatform);
                    responseWriter.writeString(responseFieldArr[53], NextStepTask.this.videoCallLink);
                    responseWriter.writeString(responseFieldArr[54], NextStepTask.this.meetingName);
                    responseWriter.writeString(responseFieldArr[55], NextStepTask.this.meetingCode);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], NextStepTask.this.videoCallMetadata);
                    responseWriter.writeString(responseFieldArr[57], NextStepTask.this.videoCallOutcome);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], NextStepTask.this.paymentDataId);
                    responseWriter.writeString(responseFieldArr[59], NextStepTask.this.calendarEventId);
                    responseWriter.writeString(responseFieldArr[60], NextStepTask.this.calendarName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[61], NextStepTask.this.campaignId);
                    responseWriter.writeString(responseFieldArr[62], NextStepTask.this.campaignRun);
                    responseWriter.writeString(responseFieldArr[63], NextStepTask.this.engagementSourceType);
                    responseWriter.writeString(responseFieldArr[64], NextStepTask.this.engagementSource);
                    responseWriter.writeString(responseFieldArr[65], NextStepTask.this.engagementSourceLevelTwo);
                    responseWriter.writeString(responseFieldArr[66], NextStepTask.this.systemAction);
                    responseWriter.writeList(responseFieldArr[67], NextStepTask.this.taskEngagementActions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.NextStepTask.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[68], NextStepTask.this.taskEngagementActionsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[69], NextStepTask.this.firstTaskEngagementActionOn);
                    responseWriter.writeInt(responseFieldArr[70], NextStepTask.this.taskEngagementActionCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[71], NextStepTask.this.customCallOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], NextStepTask.this.customVisitOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], NextStepTask.this.customTaskCompletionData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[74], NextStepTask.this.customTaskInputData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[75], NextStepTask.this.customVideoCallInputData);
                    responseWriter.writeString(responseFieldArr[76], NextStepTask.this.deviceId);
                    responseWriter.writeInt(responseFieldArr[77], NextStepTask.this.totalCallDuration);
                    responseWriter.writeString(responseFieldArr[78], NextStepTask.this.cloudProviderNumber);
                    responseWriter.writeString(responseFieldArr[79], NextStepTask.this.hangupReason);
                    responseWriter.writeString(responseFieldArr[80], NextStepTask.this.cloudProvider);
                    responseWriter.writeString(responseFieldArr[81], NextStepTask.this.callType);
                    responseWriter.writeString(responseFieldArr[82], NextStepTask.this.phoneCallLogId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[83], NextStepTask.this.externalEventRecordId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[84], NextStepTask.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[85], NextStepTask.this.updatedAt);
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
                this.$toString = "NextStepTask{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", engagementType=" + this.engagementType + ", contactId=" + this.contactId + ", primaryTeamId=" + this.primaryTeamId + ", toBeAssigned=" + this.toBeAssigned + ", ownerId=" + this.ownerId + ", contactPrimaryTeamId=" + this.contactPrimaryTeamId + ", contactOwnerId=" + this.contactOwnerId + ", addedById=" + this.addedById + ", updatedById=" + this.updatedById + ", callStatus=" + this.callStatus + ", engagementStatus=" + this.engagementStatus + ", parentEngagementId=" + this.parentEngagementId + ", nextStepTaskId=" + this.nextStepTaskId + ", syncStatus=" + this.syncStatus + ", externalNumber=" + this.externalNumber + ", userNumber=" + this.userNumber + ", callDirection=" + this.callDirection + ", callConnectStatus=" + this.callConnectStatus + ", callStartTime=" + this.callStartTime + ", callEndTime=" + this.callEndTime + ", durationInMillis=" + this.durationInMillis + ", callOutcome=" + this.callOutcome + ", callOutcomeNature=" + this.callOutcomeNature + ", callRecordingExternalResource=" + this.callRecordingExternalResource + ", noteHeading=" + this.noteHeading + ", noteAdditionMethod=" + this.noteAdditionMethod + ", voiceNoteUrl=" + this.voiceNoteUrl + ", body=" + this.body + ", isManualTask=" + this.isManualTask + ", taskHeading=" + this.taskHeading + ", taskType=" + this.taskType + ", taskActivityType=" + this.taskActivityType + ", taskInputNote=" + this.taskInputNote + ", taskPriority=" + this.taskPriority + ", taskCompletionNote=" + this.taskCompletionNote + ", taskCompletionTime=" + this.taskCompletionTime + ", taskCompletionType=" + this.taskCompletionType + ", dueDateTime=" + this.dueDateTime + ", nextFollowUpOn=" + this.nextFollowUpOn + ", nextFollowUpSetBy=" + this.nextFollowUpSetBy + ", reminderDateTime=" + this.reminderDateTime + ", callRecordingUrl=" + this.callRecordingUrl + ", callTranscriptUrl=" + this.callTranscriptUrl + ", callTranscriptSummary=" + this.callTranscriptSummary + ", uploadedFiledUrl=" + this.uploadedFiledUrl + ", visitTime=" + this.visitTime + ", visitNote=" + this.visitNote + ", visitOutcome=" + this.visitOutcome + ", visitOutcomeNature=" + this.visitOutcomeNature + ", videoCallPlatform=" + this.videoCallPlatform + ", videoCallLink=" + this.videoCallLink + ", meetingName=" + this.meetingName + ", meetingCode=" + this.meetingCode + ", videoCallMetadata=" + this.videoCallMetadata + ", videoCallOutcome=" + this.videoCallOutcome + ", paymentDataId=" + this.paymentDataId + ", calendarEventId=" + this.calendarEventId + ", calendarName=" + this.calendarName + ", campaignId=" + this.campaignId + ", campaignRun=" + this.campaignRun + ", engagementSourceType=" + this.engagementSourceType + ", engagementSource=" + this.engagementSource + ", engagementSourceLevelTwo=" + this.engagementSourceLevelTwo + ", systemAction=" + this.systemAction + ", taskEngagementActions=" + this.taskEngagementActions + ", taskEngagementActionsUpdatedAt=" + this.taskEngagementActionsUpdatedAt + ", firstTaskEngagementActionOn=" + this.firstTaskEngagementActionOn + ", taskEngagementActionCount=" + this.taskEngagementActionCount + ", customCallOutcomeData=" + this.customCallOutcomeData + ", customVisitOutcomeData=" + this.customVisitOutcomeData + ", customTaskCompletionData=" + this.customTaskCompletionData + ", customTaskInputData=" + this.customTaskInputData + ", customVideoCallInputData=" + this.customVideoCallInputData + ", deviceId=" + this.deviceId + ", totalCallDuration=" + this.totalCallDuration + ", cloudProviderNumber=" + this.cloudProviderNumber + ", hangupReason=" + this.hangupReason + ", cloudProvider=" + this.cloudProvider + ", callType=" + this.callType + ", phoneCallLogId=" + this.phoneCallLogId + ", externalEventRecordId=" + this.externalEventRecordId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class OnUpdateEngagementUserLevel {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final AddedBy addedBy;
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
        final Campaign campaign;
        final String campaignId;
        final String campaignRun;
        final ChildEngagements childEngagements;
        final String cloudProvider;
        final String cloudProviderNumber;
        final Comments comments;
        final Contact contact;
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
        final EngagementOwner engagementOwner;
        final String engagementSource;
        final String engagementSourceLevelTwo;
        final String engagementSourceType;
        final EngagementStatus engagementStatus;
        final EngagementType engagementType;
        final EngagementUpdate engagementUpdate;
        final ExternalEventRecord externalEventRecord;
        final String externalEventRecordId;
        final String externalNumber;
        final String firstTaskEngagementActionOn;
        final String hangupReason;
        final String id;
        final Boolean isManualTask;
        final LinkedCampaign linkedCampaign;
        final LinkedFiles linkedFiles;
        final Locations locations;
        final String meetingCode;
        final String meetingName;
        final List<MeetingParticipant> meetingParticipants;
        final String nextFollowUpOn;
        final String nextFollowUpSetBy;
        final NextStepTask nextStepTask;
        final String nextStepTaskId;
        final NoteAdditionMethod noteAdditionMethod;
        final String noteHeading;
        final String ownerId;
        final ParentEngagement parentEngagement;
        final String parentEngagementId;
        final PaymentData paymentData;
        final String paymentDataId;
        final String phoneCallLogId;
        final PrimaryTeam primaryTeam;
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
        final TaskLocation taskLocation;
        final String taskPriority;
        final String taskType;
        final ContactAssignmentStatus toBeAssigned;
        final Integer totalCallDuration;
        final String updatedAt;
        final UpdatedBy updatedBy;
        final String updatedById;
        final String uploadedFiledUrl;
        final String userNumber;
        final String videoCallLink;
        final String videoCallMetadata;
        final String videoCallOutcome;
        final String videoCallPlatform;
        final VisitLocation visitLocation;
        final String visitNote;
        final String visitOutcome;
        final String visitOutcomeNature;
        final String visitTime;
        final String voiceNoteUrl;

        public static final class Mapper implements ResponseFieldMapper<OnUpdateEngagementUserLevel> {
            final PrimaryTeam.Mapper primaryTeamFieldMapper = new PrimaryTeam.Mapper();
            final TaskLocation.Mapper taskLocationFieldMapper = new TaskLocation.Mapper();
            final VisitLocation.Mapper visitLocationFieldMapper = new VisitLocation.Mapper();
            final MeetingParticipant.Mapper meetingParticipantFieldMapper = new MeetingParticipant.Mapper();
            final ExternalEventRecord.Mapper externalEventRecordFieldMapper = new ExternalEventRecord.Mapper();
            final ParentEngagement.Mapper parentEngagementFieldMapper = new ParentEngagement.Mapper();
            final ChildEngagements.Mapper childEngagementsFieldMapper = new ChildEngagements.Mapper();
            final NextStepTask.Mapper nextStepTaskFieldMapper = new NextStepTask.Mapper();
            final PaymentData.Mapper paymentDataFieldMapper = new PaymentData.Mapper();
            final EngagementUpdate.Mapper engagementUpdateFieldMapper = new EngagementUpdate.Mapper();
            final Locations.Mapper locationsFieldMapper = new Locations.Mapper();
            final LinkedFiles.Mapper linkedFilesFieldMapper = new LinkedFiles.Mapper();
            final Comments.Mapper commentsFieldMapper = new Comments.Mapper();
            final Contact.Mapper contactFieldMapper = new Contact.Mapper();
            final Campaign.Mapper campaignFieldMapper = new Campaign.Mapper();
            final LinkedCampaign.Mapper linkedCampaignFieldMapper = new LinkedCampaign.Mapper();
            final EngagementOwner.Mapper engagementOwnerFieldMapper = new EngagementOwner.Mapper();
            final AddedBy.Mapper addedByFieldMapper = new AddedBy.Mapper();
            final UpdatedBy.Mapper updatedByFieldMapper = new UpdatedBy.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnUpdateEngagementUserLevel map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnUpdateEngagementUserLevel.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                EngagementType engagementTypeValueOf = string2 != null ? EngagementType.valueOf(string2) : null;
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                PrimaryTeam primaryTeam = (PrimaryTeam) responseReader.readObject(responseFieldArr[6], new ResponseReader.ObjectReader<PrimaryTeam>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public PrimaryTeam read(ResponseReader responseReader2) {
                        return Mapper.this.primaryTeamFieldMapper.map(responseReader2);
                    }
                });
                String string3 = responseReader.readString(responseFieldArr[7]);
                ContactAssignmentStatus contactAssignmentStatusValueOf = string3 != null ? ContactAssignmentStatus.valueOf(string3) : null;
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String str9 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String string4 = responseReader.readString(responseFieldArr[13]);
                String string5 = responseReader.readString(responseFieldArr[14]);
                EngagementStatus engagementStatusValueOf = string5 != null ? EngagementStatus.valueOf(string5) : null;
                String str10 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]);
                String str11 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[17]);
                String string6 = responseReader.readString(responseFieldArr[18]);
                String string7 = responseReader.readString(responseFieldArr[19]);
                String string8 = responseReader.readString(responseFieldArr[20]);
                CallDirection callDirectionValueOf = string8 != null ? CallDirection.valueOf(string8) : null;
                String string9 = responseReader.readString(responseFieldArr[21]);
                CallConnectStatus callConnectStatusValueOf = string9 != null ? CallConnectStatus.valueOf(string9) : null;
                String str12 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]);
                String str13 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]);
                Integer num = responseReader.readInt(responseFieldArr[24]);
                String string10 = responseReader.readString(responseFieldArr[25]);
                String string11 = responseReader.readString(responseFieldArr[26]);
                String string12 = responseReader.readString(responseFieldArr[27]);
                String string13 = responseReader.readString(responseFieldArr[28]);
                String string14 = responseReader.readString(responseFieldArr[29]);
                NoteAdditionMethod noteAdditionMethodValueOf = string14 != null ? NoteAdditionMethod.valueOf(string14) : null;
                String string15 = responseReader.readString(responseFieldArr[30]);
                String string16 = responseReader.readString(responseFieldArr[31]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[32]);
                String string17 = responseReader.readString(responseFieldArr[33]);
                String string18 = responseReader.readString(responseFieldArr[34]);
                String string19 = responseReader.readString(responseFieldArr[35]);
                return new OnUpdateEngagementUserLevel(string, str, str2, engagementTypeValueOf, str3, str4, primaryTeam, contactAssignmentStatusValueOf, str5, str6, str7, str8, str9, string4, engagementStatusValueOf, str10, str11, bool, string6, string7, callDirectionValueOf, callConnectStatusValueOf, str12, str13, num, string10, string11, string12, string13, noteAdditionMethodValueOf, string15, string16, bool2, string17, string18, string19 != null ? TaskActivityType.valueOf(string19) : null, responseReader.readString(responseFieldArr[36]), responseReader.readString(responseFieldArr[37]), responseReader.readString(responseFieldArr[38]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[39]), responseReader.readString(responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[44]), (TaskLocation) responseReader.readObject(responseFieldArr[45], new ResponseReader.ObjectReader<TaskLocation>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public TaskLocation read(ResponseReader responseReader2) {
                        return Mapper.this.taskLocationFieldMapper.map(responseReader2);
                    }
                }), responseReader.readString(responseFieldArr[46]), responseReader.readString(responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), (VisitLocation) responseReader.readObject(responseFieldArr[50], new ResponseReader.ObjectReader<VisitLocation>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public VisitLocation read(ResponseReader responseReader2) {
                        return Mapper.this.visitLocationFieldMapper.map(responseReader2);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[51]), responseReader.readString(responseFieldArr[52]), responseReader.readString(responseFieldArr[53]), responseReader.readString(responseFieldArr[54]), responseReader.readString(responseFieldArr[55]), responseReader.readString(responseFieldArr[56]), responseReader.readString(responseFieldArr[57]), responseReader.readString(responseFieldArr[58]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[59]), responseReader.readString(responseFieldArr[60]), responseReader.readList(responseFieldArr[61], new ResponseReader.ListReader<MeetingParticipant>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public MeetingParticipant read(ResponseReader.ListItemReader listItemReader) {
                        return (MeetingParticipant) listItemReader.readObject(new ResponseReader.ObjectReader<MeetingParticipant>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.4.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public MeetingParticipant read(ResponseReader responseReader2) {
                                return Mapper.this.meetingParticipantFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[62]), responseReader.readString(responseFieldArr[63]), responseReader.readString(responseFieldArr[64]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[65]), responseReader.readString(responseFieldArr[66]), responseReader.readString(responseFieldArr[67]), responseReader.readString(responseFieldArr[68]), responseReader.readString(responseFieldArr[69]), responseReader.readString(responseFieldArr[70]), responseReader.readList(responseFieldArr[71], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[72]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[73]), responseReader.readInt(responseFieldArr[74]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[75]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[76]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[77]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[78]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[79]), responseReader.readString(responseFieldArr[80]), responseReader.readInt(responseFieldArr[81]), responseReader.readString(responseFieldArr[82]), responseReader.readString(responseFieldArr[83]), responseReader.readString(responseFieldArr[84]), responseReader.readString(responseFieldArr[85]), responseReader.readString(responseFieldArr[86]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[87]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[88]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[89]), (ExternalEventRecord) responseReader.readObject(responseFieldArr[90], new ResponseReader.ObjectReader<ExternalEventRecord>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ExternalEventRecord read(ResponseReader responseReader2) {
                        return Mapper.this.externalEventRecordFieldMapper.map(responseReader2);
                    }
                }), (ParentEngagement) responseReader.readObject(responseFieldArr[91], new ResponseReader.ObjectReader<ParentEngagement>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ParentEngagement read(ResponseReader responseReader2) {
                        return Mapper.this.parentEngagementFieldMapper.map(responseReader2);
                    }
                }), (ChildEngagements) responseReader.readObject(responseFieldArr[92], new ResponseReader.ObjectReader<ChildEngagements>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ChildEngagements read(ResponseReader responseReader2) {
                        return Mapper.this.childEngagementsFieldMapper.map(responseReader2);
                    }
                }), (NextStepTask) responseReader.readObject(responseFieldArr[93], new ResponseReader.ObjectReader<NextStepTask>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.9
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public NextStepTask read(ResponseReader responseReader2) {
                        return Mapper.this.nextStepTaskFieldMapper.map(responseReader2);
                    }
                }), (PaymentData) responseReader.readObject(responseFieldArr[94], new ResponseReader.ObjectReader<PaymentData>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.10
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public PaymentData read(ResponseReader responseReader2) {
                        return Mapper.this.paymentDataFieldMapper.map(responseReader2);
                    }
                }), (EngagementUpdate) responseReader.readObject(responseFieldArr[95], new ResponseReader.ObjectReader<EngagementUpdate>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.11
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public EngagementUpdate read(ResponseReader responseReader2) {
                        return Mapper.this.engagementUpdateFieldMapper.map(responseReader2);
                    }
                }), (Locations) responseReader.readObject(responseFieldArr[96], new ResponseReader.ObjectReader<Locations>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.12
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Locations read(ResponseReader responseReader2) {
                        return Mapper.this.locationsFieldMapper.map(responseReader2);
                    }
                }), (LinkedFiles) responseReader.readObject(responseFieldArr[97], new ResponseReader.ObjectReader<LinkedFiles>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.13
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LinkedFiles read(ResponseReader responseReader2) {
                        return Mapper.this.linkedFilesFieldMapper.map(responseReader2);
                    }
                }), (Comments) responseReader.readObject(responseFieldArr[98], new ResponseReader.ObjectReader<Comments>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.14
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Comments read(ResponseReader responseReader2) {
                        return Mapper.this.commentsFieldMapper.map(responseReader2);
                    }
                }), (Contact) responseReader.readObject(responseFieldArr[99], new ResponseReader.ObjectReader<Contact>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.15
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Contact read(ResponseReader responseReader2) {
                        return Mapper.this.contactFieldMapper.map(responseReader2);
                    }
                }), (Campaign) responseReader.readObject(responseFieldArr[100], new ResponseReader.ObjectReader<Campaign>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.16
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Campaign read(ResponseReader responseReader2) {
                        return Mapper.this.campaignFieldMapper.map(responseReader2);
                    }
                }), (LinkedCampaign) responseReader.readObject(responseFieldArr[101], new ResponseReader.ObjectReader<LinkedCampaign>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.17
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LinkedCampaign read(ResponseReader responseReader2) {
                        return Mapper.this.linkedCampaignFieldMapper.map(responseReader2);
                    }
                }), (EngagementOwner) responseReader.readObject(responseFieldArr[102], new ResponseReader.ObjectReader<EngagementOwner>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.18
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public EngagementOwner read(ResponseReader responseReader2) {
                        return Mapper.this.engagementOwnerFieldMapper.map(responseReader2);
                    }
                }), (AddedBy) responseReader.readObject(responseFieldArr[103], new ResponseReader.ObjectReader<AddedBy>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.19
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AddedBy read(ResponseReader responseReader2) {
                        return Mapper.this.addedByFieldMapper.map(responseReader2);
                    }
                }), (UpdatedBy) responseReader.readObject(responseFieldArr[104], new ResponseReader.ObjectReader<UpdatedBy>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.Mapper.20
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdatedBy read(ResponseReader responseReader2) {
                        return Mapper.this.updatedByFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("engagementType", "engagementType", null, false, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forObject("primaryTeam", "primaryTeam", null, true, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactPrimaryTeamId", "contactPrimaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactOwnerId", "contactOwnerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forString("callStatus", "callStatus", null, true, Collections.emptyList()), ResponseField.forString("engagementStatus", "engagementStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("parentEngagementId", "parentEngagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("nextStepTaskId", "nextStepTaskId", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("syncStatus", "syncStatus", null, true, Collections.emptyList()), ResponseField.forString("externalNumber", "externalNumber", null, true, Collections.emptyList()), ResponseField.forString("userNumber", "userNumber", null, true, Collections.emptyList()), ResponseField.forString("callDirection", "callDirection", null, true, Collections.emptyList()), ResponseField.forString("callConnectStatus", "callConnectStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("callStartTime", "callStartTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("callEndTime", "callEndTime", null, true, customType2, Collections.emptyList()), ResponseField.forInt("durationInMillis", "durationInMillis", null, true, Collections.emptyList()), ResponseField.forString("callOutcome", "callOutcome", null, true, Collections.emptyList()), ResponseField.forString("callOutcomeNature", "callOutcomeNature", null, true, Collections.emptyList()), ResponseField.forString("callRecordingExternalResource", "callRecordingExternalResource", null, true, Collections.emptyList()), ResponseField.forString("noteHeading", "noteHeading", null, true, Collections.emptyList()), ResponseField.forString("noteAdditionMethod", "noteAdditionMethod", null, true, Collections.emptyList()), ResponseField.forString("voiceNoteUrl", "voiceNoteUrl", null, true, Collections.emptyList()), ResponseField.forString("body", "body", null, true, Collections.emptyList()), ResponseField.forBoolean("isManualTask", "isManualTask", null, true, Collections.emptyList()), ResponseField.forString("taskHeading", "taskHeading", null, true, Collections.emptyList()), ResponseField.forString("taskType", "taskType", null, true, Collections.emptyList()), ResponseField.forString("taskActivityType", "taskActivityType", null, true, Collections.emptyList()), ResponseField.forString("taskInputNote", "taskInputNote", null, true, Collections.emptyList()), ResponseField.forString("taskPriority", "taskPriority", null, true, Collections.emptyList()), ResponseField.forString("taskCompletionNote", "taskCompletionNote", null, true, Collections.emptyList()), ResponseField.forCustomType("taskCompletionTime", "taskCompletionTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("taskCompletionType", "taskCompletionType", null, true, Collections.emptyList()), ResponseField.forCustomType("dueDateTime", "dueDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextFollowUpOn", "nextFollowUpOn", null, true, customType2, Collections.emptyList()), ResponseField.forString("nextFollowUpSetBy", "nextFollowUpSetBy", null, true, Collections.emptyList()), ResponseField.forCustomType("reminderDateTime", "reminderDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forObject("taskLocation", "taskLocation", null, true, Collections.emptyList()), ResponseField.forString("callRecordingUrl", "callRecordingUrl", null, true, Collections.emptyList()), ResponseField.forString("callTranscriptUrl", "callTranscriptUrl", null, true, Collections.emptyList()), ResponseField.forString("callTranscriptSummary", "callTranscriptSummary", null, true, Collections.emptyList()), ResponseField.forString("uploadedFiledUrl", "uploadedFiledUrl", null, true, Collections.emptyList()), ResponseField.forObject("visitLocation", "visitLocation", null, true, Collections.emptyList()), ResponseField.forCustomType("visitTime", "visitTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("visitNote", "visitNote", null, true, Collections.emptyList()), ResponseField.forString("visitOutcome", "visitOutcome", null, true, Collections.emptyList()), ResponseField.forString("visitOutcomeNature", "visitOutcomeNature", null, true, Collections.emptyList()), ResponseField.forString("videoCallPlatform", "videoCallPlatform", null, true, Collections.emptyList()), ResponseField.forString("videoCallLink", "videoCallLink", null, true, Collections.emptyList()), ResponseField.forString("meetingName", "meetingName", null, true, Collections.emptyList()), ResponseField.forString("meetingCode", "meetingCode", null, true, Collections.emptyList()), ResponseField.forCustomType("videoCallMetadata", "videoCallMetadata", null, true, customType3, Collections.emptyList()), ResponseField.forString("videoCallOutcome", "videoCallOutcome", null, true, Collections.emptyList()), ResponseField.forList("meetingParticipants", "meetingParticipants", null, true, Collections.emptyList()), ResponseField.forCustomType("paymentDataId", "paymentDataId", null, true, customType, Collections.emptyList()), ResponseField.forString("calendarEventId", "calendarEventId", null, true, Collections.emptyList()), ResponseField.forString("calendarName", "calendarName", null, true, Collections.emptyList()), ResponseField.forCustomType("campaignId", "campaignId", null, true, customType, Collections.emptyList()), ResponseField.forString("campaignRun", "campaignRun", null, true, Collections.emptyList()), ResponseField.forString("engagementSourceType", "engagementSourceType", null, true, Collections.emptyList()), ResponseField.forString("engagementSource", "engagementSource", null, true, Collections.emptyList()), ResponseField.forString("engagementSourceLevelTwo", "engagementSourceLevelTwo", null, true, Collections.emptyList()), ResponseField.forString("systemAction", "systemAction", null, true, Collections.emptyList()), ResponseField.forList("taskEngagementActions", "taskEngagementActions", null, true, Collections.emptyList()), ResponseField.forCustomType("taskEngagementActionsUpdatedAt", "taskEngagementActionsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("firstTaskEngagementActionOn", "firstTaskEngagementActionOn", null, true, customType2, Collections.emptyList()), ResponseField.forInt("taskEngagementActionCount", "taskEngagementActionCount", null, true, Collections.emptyList()), ResponseField.forCustomType("customCallOutcomeData", "customCallOutcomeData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customVisitOutcomeData", "customVisitOutcomeData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customTaskCompletionData", "customTaskCompletionData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customTaskInputData", "customTaskInputData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customVideoCallInputData", "customVideoCallInputData", null, true, customType3, Collections.emptyList()), ResponseField.forString("deviceId", "deviceId", null, true, Collections.emptyList()), ResponseField.forInt("totalCallDuration", "totalCallDuration", null, true, Collections.emptyList()), ResponseField.forString("cloudProviderNumber", "cloudProviderNumber", null, true, Collections.emptyList()), ResponseField.forString("hangupReason", "hangupReason", null, true, Collections.emptyList()), ResponseField.forString("cloudProvider", "cloudProvider", null, true, Collections.emptyList()), ResponseField.forString("callType", "callType", null, true, Collections.emptyList()), ResponseField.forString("phoneCallLogId", "phoneCallLogId", null, true, Collections.emptyList()), ResponseField.forCustomType("externalEventRecordId", "externalEventRecordId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("externalEventRecord", "externalEventRecord", null, true, Collections.emptyList()), ResponseField.forObject("parentEngagement", "parentEngagement", null, true, Collections.emptyList()), ResponseField.forObject("childEngagements", "childEngagements", null, true, Collections.emptyList()), ResponseField.forObject("nextStepTask", "nextStepTask", null, true, Collections.emptyList()), ResponseField.forObject("paymentData", "paymentData", null, true, Collections.emptyList()), ResponseField.forObject("engagementUpdate", "engagementUpdate", null, true, Collections.emptyList()), ResponseField.forObject("locations", "locations", null, true, Collections.emptyList()), ResponseField.forObject("linkedFiles", "linkedFiles", null, true, Collections.emptyList()), ResponseField.forObject("comments", "comments", null, true, Collections.emptyList()), ResponseField.forObject("contact", "contact", null, true, Collections.emptyList()), ResponseField.forObject("campaign", "campaign", null, true, Collections.emptyList()), ResponseField.forObject("linkedCampaign", "linkedCampaign", null, true, Collections.emptyList()), ResponseField.forObject("engagementOwner", "engagementOwner", null, true, Collections.emptyList()), ResponseField.forObject("addedBy", "addedBy", null, true, Collections.emptyList()), ResponseField.forObject("updatedBy", "updatedBy", null, true, Collections.emptyList())};
        }

        public OnUpdateEngagementUserLevel(String str, String str2, String str3, EngagementType engagementType, String str4, String str5, PrimaryTeam primaryTeam, ContactAssignmentStatus contactAssignmentStatus, String str6, String str7, String str8, String str9, String str10, String str11, EngagementStatus engagementStatus, String str12, String str13, Boolean bool, String str14, String str15, CallDirection callDirection, CallConnectStatus callConnectStatus, String str16, String str17, Integer num, String str18, String str19, String str20, String str21, NoteAdditionMethod noteAdditionMethod, String str22, String str23, Boolean bool2, String str24, String str25, TaskActivityType taskActivityType, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, TaskLocation taskLocation, String str35, String str36, String str37, String str38, VisitLocation visitLocation, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, List<MeetingParticipant> list, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, List<String> list2, String str58, String str59, Integer num2, String str60, String str61, String str62, String str63, String str64, String str65, Integer num3, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, ExternalEventRecord externalEventRecord, ParentEngagement parentEngagement, ChildEngagements childEngagements, NextStepTask nextStepTask, PaymentData paymentData, EngagementUpdate engagementUpdate, Locations locations, LinkedFiles linkedFiles, Comments comments, Contact contact, Campaign campaign, LinkedCampaign linkedCampaign, EngagementOwner engagementOwner, AddedBy addedBy, UpdatedBy updatedBy) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.engagementType = (EngagementType) Utils.checkNotNull(engagementType, "engagementType == null");
            this.contactId = str4;
            this.primaryTeamId = str5;
            this.primaryTeam = primaryTeam;
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
            this.taskLocation = taskLocation;
            this.callRecordingUrl = str35;
            this.callTranscriptUrl = str36;
            this.callTranscriptSummary = str37;
            this.uploadedFiledUrl = str38;
            this.visitLocation = visitLocation;
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
            this.meetingParticipants = list;
            this.paymentDataId = str49;
            this.calendarEventId = str50;
            this.calendarName = str51;
            this.campaignId = str52;
            this.campaignRun = str53;
            this.engagementSourceType = str54;
            this.engagementSource = str55;
            this.engagementSourceLevelTwo = str56;
            this.systemAction = str57;
            this.taskEngagementActions = list2;
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
            this.externalEventRecord = externalEventRecord;
            this.parentEngagement = parentEngagement;
            this.childEngagements = childEngagements;
            this.nextStepTask = nextStepTask;
            this.paymentData = paymentData;
            this.engagementUpdate = engagementUpdate;
            this.locations = locations;
            this.linkedFiles = linkedFiles;
            this.comments = comments;
            this.contact = contact;
            this.campaign = campaign;
            this.linkedCampaign = linkedCampaign;
            this.engagementOwner = engagementOwner;
            this.addedBy = addedBy;
            this.updatedBy = updatedBy;
        }

        public String __typename() {
            return this.__typename;
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

        public Campaign campaign() {
            return this.campaign;
        }

        public String campaignId() {
            return this.campaignId;
        }

        public String campaignRun() {
            return this.campaignRun;
        }

        public ChildEngagements childEngagements() {
            return this.childEngagements;
        }

        public String cloudProvider() {
            return this.cloudProvider;
        }

        public String cloudProviderNumber() {
            return this.cloudProviderNumber;
        }

        public Comments comments() {
            return this.comments;
        }

        public Contact contact() {
            return this.contact;
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

        public EngagementOwner engagementOwner() {
            return this.engagementOwner;
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

        public EngagementUpdate engagementUpdate() {
            return this.engagementUpdate;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            PrimaryTeam primaryTeam;
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
            TaskLocation taskLocation;
            String str32;
            String str33;
            String str34;
            String str35;
            VisitLocation visitLocation;
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
            List<MeetingParticipant> list;
            String str46;
            String str47;
            String str48;
            String str49;
            String str50;
            String str51;
            String str52;
            String str53;
            String str54;
            List<String> list2;
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
            String str70;
            ExternalEventRecord externalEventRecord;
            ParentEngagement parentEngagement;
            ChildEngagements childEngagements;
            NextStepTask nextStepTask;
            PaymentData paymentData;
            EngagementUpdate engagementUpdate;
            Locations locations;
            LinkedFiles linkedFiles;
            Comments comments;
            Contact contact;
            Campaign campaign;
            LinkedCampaign linkedCampaign;
            EngagementOwner engagementOwner;
            AddedBy addedBy;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnUpdateEngagementUserLevel)) {
                return false;
            }
            OnUpdateEngagementUserLevel onUpdateEngagementUserLevel = (OnUpdateEngagementUserLevel) obj;
            if (this.__typename.equals(onUpdateEngagementUserLevel.__typename) && this.id.equals(onUpdateEngagementUserLevel.id) && this.accountId.equals(onUpdateEngagementUserLevel.accountId) && this.engagementType.equals(onUpdateEngagementUserLevel.engagementType) && ((str = this.contactId) != null ? str.equals(onUpdateEngagementUserLevel.contactId) : onUpdateEngagementUserLevel.contactId == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(onUpdateEngagementUserLevel.primaryTeamId) : onUpdateEngagementUserLevel.primaryTeamId == null) && ((primaryTeam = this.primaryTeam) != null ? primaryTeam.equals(onUpdateEngagementUserLevel.primaryTeam) : onUpdateEngagementUserLevel.primaryTeam == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(onUpdateEngagementUserLevel.toBeAssigned) : onUpdateEngagementUserLevel.toBeAssigned == null) && ((str3 = this.ownerId) != null ? str3.equals(onUpdateEngagementUserLevel.ownerId) : onUpdateEngagementUserLevel.ownerId == null) && ((str4 = this.contactPrimaryTeamId) != null ? str4.equals(onUpdateEngagementUserLevel.contactPrimaryTeamId) : onUpdateEngagementUserLevel.contactPrimaryTeamId == null) && ((str5 = this.contactOwnerId) != null ? str5.equals(onUpdateEngagementUserLevel.contactOwnerId) : onUpdateEngagementUserLevel.contactOwnerId == null) && ((str6 = this.addedById) != null ? str6.equals(onUpdateEngagementUserLevel.addedById) : onUpdateEngagementUserLevel.addedById == null) && ((str7 = this.updatedById) != null ? str7.equals(onUpdateEngagementUserLevel.updatedById) : onUpdateEngagementUserLevel.updatedById == null) && ((str8 = this.callStatus) != null ? str8.equals(onUpdateEngagementUserLevel.callStatus) : onUpdateEngagementUserLevel.callStatus == null) && this.engagementStatus.equals(onUpdateEngagementUserLevel.engagementStatus) && ((str9 = this.parentEngagementId) != null ? str9.equals(onUpdateEngagementUserLevel.parentEngagementId) : onUpdateEngagementUserLevel.parentEngagementId == null) && ((str10 = this.nextStepTaskId) != null ? str10.equals(onUpdateEngagementUserLevel.nextStepTaskId) : onUpdateEngagementUserLevel.nextStepTaskId == null) && ((bool = this.syncStatus) != null ? bool.equals(onUpdateEngagementUserLevel.syncStatus) : onUpdateEngagementUserLevel.syncStatus == null) && ((str11 = this.externalNumber) != null ? str11.equals(onUpdateEngagementUserLevel.externalNumber) : onUpdateEngagementUserLevel.externalNumber == null) && ((str12 = this.userNumber) != null ? str12.equals(onUpdateEngagementUserLevel.userNumber) : onUpdateEngagementUserLevel.userNumber == null) && ((callDirection = this.callDirection) != null ? callDirection.equals(onUpdateEngagementUserLevel.callDirection) : onUpdateEngagementUserLevel.callDirection == null) && ((callConnectStatus = this.callConnectStatus) != null ? callConnectStatus.equals(onUpdateEngagementUserLevel.callConnectStatus) : onUpdateEngagementUserLevel.callConnectStatus == null) && ((str13 = this.callStartTime) != null ? str13.equals(onUpdateEngagementUserLevel.callStartTime) : onUpdateEngagementUserLevel.callStartTime == null) && ((str14 = this.callEndTime) != null ? str14.equals(onUpdateEngagementUserLevel.callEndTime) : onUpdateEngagementUserLevel.callEndTime == null) && ((num = this.durationInMillis) != null ? num.equals(onUpdateEngagementUserLevel.durationInMillis) : onUpdateEngagementUserLevel.durationInMillis == null) && ((str15 = this.callOutcome) != null ? str15.equals(onUpdateEngagementUserLevel.callOutcome) : onUpdateEngagementUserLevel.callOutcome == null) && ((str16 = this.callOutcomeNature) != null ? str16.equals(onUpdateEngagementUserLevel.callOutcomeNature) : onUpdateEngagementUserLevel.callOutcomeNature == null) && ((str17 = this.callRecordingExternalResource) != null ? str17.equals(onUpdateEngagementUserLevel.callRecordingExternalResource) : onUpdateEngagementUserLevel.callRecordingExternalResource == null) && ((str18 = this.noteHeading) != null ? str18.equals(onUpdateEngagementUserLevel.noteHeading) : onUpdateEngagementUserLevel.noteHeading == null) && ((noteAdditionMethod = this.noteAdditionMethod) != null ? noteAdditionMethod.equals(onUpdateEngagementUserLevel.noteAdditionMethod) : onUpdateEngagementUserLevel.noteAdditionMethod == null) && ((str19 = this.voiceNoteUrl) != null ? str19.equals(onUpdateEngagementUserLevel.voiceNoteUrl) : onUpdateEngagementUserLevel.voiceNoteUrl == null) && ((str20 = this.body) != null ? str20.equals(onUpdateEngagementUserLevel.body) : onUpdateEngagementUserLevel.body == null) && ((bool2 = this.isManualTask) != null ? bool2.equals(onUpdateEngagementUserLevel.isManualTask) : onUpdateEngagementUserLevel.isManualTask == null) && ((str21 = this.taskHeading) != null ? str21.equals(onUpdateEngagementUserLevel.taskHeading) : onUpdateEngagementUserLevel.taskHeading == null) && ((str22 = this.taskType) != null ? str22.equals(onUpdateEngagementUserLevel.taskType) : onUpdateEngagementUserLevel.taskType == null) && ((taskActivityType = this.taskActivityType) != null ? taskActivityType.equals(onUpdateEngagementUserLevel.taskActivityType) : onUpdateEngagementUserLevel.taskActivityType == null) && ((str23 = this.taskInputNote) != null ? str23.equals(onUpdateEngagementUserLevel.taskInputNote) : onUpdateEngagementUserLevel.taskInputNote == null) && ((str24 = this.taskPriority) != null ? str24.equals(onUpdateEngagementUserLevel.taskPriority) : onUpdateEngagementUserLevel.taskPriority == null) && ((str25 = this.taskCompletionNote) != null ? str25.equals(onUpdateEngagementUserLevel.taskCompletionNote) : onUpdateEngagementUserLevel.taskCompletionNote == null) && ((str26 = this.taskCompletionTime) != null ? str26.equals(onUpdateEngagementUserLevel.taskCompletionTime) : onUpdateEngagementUserLevel.taskCompletionTime == null) && ((str27 = this.taskCompletionType) != null ? str27.equals(onUpdateEngagementUserLevel.taskCompletionType) : onUpdateEngagementUserLevel.taskCompletionType == null) && ((str28 = this.dueDateTime) != null ? str28.equals(onUpdateEngagementUserLevel.dueDateTime) : onUpdateEngagementUserLevel.dueDateTime == null) && ((str29 = this.nextFollowUpOn) != null ? str29.equals(onUpdateEngagementUserLevel.nextFollowUpOn) : onUpdateEngagementUserLevel.nextFollowUpOn == null) && ((str30 = this.nextFollowUpSetBy) != null ? str30.equals(onUpdateEngagementUserLevel.nextFollowUpSetBy) : onUpdateEngagementUserLevel.nextFollowUpSetBy == null) && ((str31 = this.reminderDateTime) != null ? str31.equals(onUpdateEngagementUserLevel.reminderDateTime) : onUpdateEngagementUserLevel.reminderDateTime == null) && ((taskLocation = this.taskLocation) != null ? taskLocation.equals(onUpdateEngagementUserLevel.taskLocation) : onUpdateEngagementUserLevel.taskLocation == null) && ((str32 = this.callRecordingUrl) != null ? str32.equals(onUpdateEngagementUserLevel.callRecordingUrl) : onUpdateEngagementUserLevel.callRecordingUrl == null) && ((str33 = this.callTranscriptUrl) != null ? str33.equals(onUpdateEngagementUserLevel.callTranscriptUrl) : onUpdateEngagementUserLevel.callTranscriptUrl == null) && ((str34 = this.callTranscriptSummary) != null ? str34.equals(onUpdateEngagementUserLevel.callTranscriptSummary) : onUpdateEngagementUserLevel.callTranscriptSummary == null) && ((str35 = this.uploadedFiledUrl) != null ? str35.equals(onUpdateEngagementUserLevel.uploadedFiledUrl) : onUpdateEngagementUserLevel.uploadedFiledUrl == null) && ((visitLocation = this.visitLocation) != null ? visitLocation.equals(onUpdateEngagementUserLevel.visitLocation) : onUpdateEngagementUserLevel.visitLocation == null) && ((str36 = this.visitTime) != null ? str36.equals(onUpdateEngagementUserLevel.visitTime) : onUpdateEngagementUserLevel.visitTime == null) && ((str37 = this.visitNote) != null ? str37.equals(onUpdateEngagementUserLevel.visitNote) : onUpdateEngagementUserLevel.visitNote == null) && ((str38 = this.visitOutcome) != null ? str38.equals(onUpdateEngagementUserLevel.visitOutcome) : onUpdateEngagementUserLevel.visitOutcome == null) && ((str39 = this.visitOutcomeNature) != null ? str39.equals(onUpdateEngagementUserLevel.visitOutcomeNature) : onUpdateEngagementUserLevel.visitOutcomeNature == null) && ((str40 = this.videoCallPlatform) != null ? str40.equals(onUpdateEngagementUserLevel.videoCallPlatform) : onUpdateEngagementUserLevel.videoCallPlatform == null) && ((str41 = this.videoCallLink) != null ? str41.equals(onUpdateEngagementUserLevel.videoCallLink) : onUpdateEngagementUserLevel.videoCallLink == null) && ((str42 = this.meetingName) != null ? str42.equals(onUpdateEngagementUserLevel.meetingName) : onUpdateEngagementUserLevel.meetingName == null) && ((str43 = this.meetingCode) != null ? str43.equals(onUpdateEngagementUserLevel.meetingCode) : onUpdateEngagementUserLevel.meetingCode == null) && ((str44 = this.videoCallMetadata) != null ? str44.equals(onUpdateEngagementUserLevel.videoCallMetadata) : onUpdateEngagementUserLevel.videoCallMetadata == null) && ((str45 = this.videoCallOutcome) != null ? str45.equals(onUpdateEngagementUserLevel.videoCallOutcome) : onUpdateEngagementUserLevel.videoCallOutcome == null) && ((list = this.meetingParticipants) != null ? list.equals(onUpdateEngagementUserLevel.meetingParticipants) : onUpdateEngagementUserLevel.meetingParticipants == null) && ((str46 = this.paymentDataId) != null ? str46.equals(onUpdateEngagementUserLevel.paymentDataId) : onUpdateEngagementUserLevel.paymentDataId == null) && ((str47 = this.calendarEventId) != null ? str47.equals(onUpdateEngagementUserLevel.calendarEventId) : onUpdateEngagementUserLevel.calendarEventId == null) && ((str48 = this.calendarName) != null ? str48.equals(onUpdateEngagementUserLevel.calendarName) : onUpdateEngagementUserLevel.calendarName == null) && ((str49 = this.campaignId) != null ? str49.equals(onUpdateEngagementUserLevel.campaignId) : onUpdateEngagementUserLevel.campaignId == null) && ((str50 = this.campaignRun) != null ? str50.equals(onUpdateEngagementUserLevel.campaignRun) : onUpdateEngagementUserLevel.campaignRun == null) && ((str51 = this.engagementSourceType) != null ? str51.equals(onUpdateEngagementUserLevel.engagementSourceType) : onUpdateEngagementUserLevel.engagementSourceType == null) && ((str52 = this.engagementSource) != null ? str52.equals(onUpdateEngagementUserLevel.engagementSource) : onUpdateEngagementUserLevel.engagementSource == null) && ((str53 = this.engagementSourceLevelTwo) != null ? str53.equals(onUpdateEngagementUserLevel.engagementSourceLevelTwo) : onUpdateEngagementUserLevel.engagementSourceLevelTwo == null) && ((str54 = this.systemAction) != null ? str54.equals(onUpdateEngagementUserLevel.systemAction) : onUpdateEngagementUserLevel.systemAction == null) && ((list2 = this.taskEngagementActions) != null ? list2.equals(onUpdateEngagementUserLevel.taskEngagementActions) : onUpdateEngagementUserLevel.taskEngagementActions == null) && ((str55 = this.taskEngagementActionsUpdatedAt) != null ? str55.equals(onUpdateEngagementUserLevel.taskEngagementActionsUpdatedAt) : onUpdateEngagementUserLevel.taskEngagementActionsUpdatedAt == null) && ((str56 = this.firstTaskEngagementActionOn) != null ? str56.equals(onUpdateEngagementUserLevel.firstTaskEngagementActionOn) : onUpdateEngagementUserLevel.firstTaskEngagementActionOn == null) && ((num2 = this.taskEngagementActionCount) != null ? num2.equals(onUpdateEngagementUserLevel.taskEngagementActionCount) : onUpdateEngagementUserLevel.taskEngagementActionCount == null) && ((str57 = this.customCallOutcomeData) != null ? str57.equals(onUpdateEngagementUserLevel.customCallOutcomeData) : onUpdateEngagementUserLevel.customCallOutcomeData == null) && ((str58 = this.customVisitOutcomeData) != null ? str58.equals(onUpdateEngagementUserLevel.customVisitOutcomeData) : onUpdateEngagementUserLevel.customVisitOutcomeData == null) && ((str59 = this.customTaskCompletionData) != null ? str59.equals(onUpdateEngagementUserLevel.customTaskCompletionData) : onUpdateEngagementUserLevel.customTaskCompletionData == null) && ((str60 = this.customTaskInputData) != null ? str60.equals(onUpdateEngagementUserLevel.customTaskInputData) : onUpdateEngagementUserLevel.customTaskInputData == null) && ((str61 = this.customVideoCallInputData) != null ? str61.equals(onUpdateEngagementUserLevel.customVideoCallInputData) : onUpdateEngagementUserLevel.customVideoCallInputData == null) && ((str62 = this.deviceId) != null ? str62.equals(onUpdateEngagementUserLevel.deviceId) : onUpdateEngagementUserLevel.deviceId == null) && ((num3 = this.totalCallDuration) != null ? num3.equals(onUpdateEngagementUserLevel.totalCallDuration) : onUpdateEngagementUserLevel.totalCallDuration == null) && ((str63 = this.cloudProviderNumber) != null ? str63.equals(onUpdateEngagementUserLevel.cloudProviderNumber) : onUpdateEngagementUserLevel.cloudProviderNumber == null) && ((str64 = this.hangupReason) != null ? str64.equals(onUpdateEngagementUserLevel.hangupReason) : onUpdateEngagementUserLevel.hangupReason == null) && ((str65 = this.cloudProvider) != null ? str65.equals(onUpdateEngagementUserLevel.cloudProvider) : onUpdateEngagementUserLevel.cloudProvider == null) && ((str66 = this.callType) != null ? str66.equals(onUpdateEngagementUserLevel.callType) : onUpdateEngagementUserLevel.callType == null) && ((str67 = this.phoneCallLogId) != null ? str67.equals(onUpdateEngagementUserLevel.phoneCallLogId) : onUpdateEngagementUserLevel.phoneCallLogId == null) && ((str68 = this.externalEventRecordId) != null ? str68.equals(onUpdateEngagementUserLevel.externalEventRecordId) : onUpdateEngagementUserLevel.externalEventRecordId == null) && ((str69 = this.createdAt) != null ? str69.equals(onUpdateEngagementUserLevel.createdAt) : onUpdateEngagementUserLevel.createdAt == null) && ((str70 = this.updatedAt) != null ? str70.equals(onUpdateEngagementUserLevel.updatedAt) : onUpdateEngagementUserLevel.updatedAt == null) && ((externalEventRecord = this.externalEventRecord) != null ? externalEventRecord.equals(onUpdateEngagementUserLevel.externalEventRecord) : onUpdateEngagementUserLevel.externalEventRecord == null) && ((parentEngagement = this.parentEngagement) != null ? parentEngagement.equals(onUpdateEngagementUserLevel.parentEngagement) : onUpdateEngagementUserLevel.parentEngagement == null) && ((childEngagements = this.childEngagements) != null ? childEngagements.equals(onUpdateEngagementUserLevel.childEngagements) : onUpdateEngagementUserLevel.childEngagements == null) && ((nextStepTask = this.nextStepTask) != null ? nextStepTask.equals(onUpdateEngagementUserLevel.nextStepTask) : onUpdateEngagementUserLevel.nextStepTask == null) && ((paymentData = this.paymentData) != null ? paymentData.equals(onUpdateEngagementUserLevel.paymentData) : onUpdateEngagementUserLevel.paymentData == null) && ((engagementUpdate = this.engagementUpdate) != null ? engagementUpdate.equals(onUpdateEngagementUserLevel.engagementUpdate) : onUpdateEngagementUserLevel.engagementUpdate == null) && ((locations = this.locations) != null ? locations.equals(onUpdateEngagementUserLevel.locations) : onUpdateEngagementUserLevel.locations == null) && ((linkedFiles = this.linkedFiles) != null ? linkedFiles.equals(onUpdateEngagementUserLevel.linkedFiles) : onUpdateEngagementUserLevel.linkedFiles == null) && ((comments = this.comments) != null ? comments.equals(onUpdateEngagementUserLevel.comments) : onUpdateEngagementUserLevel.comments == null) && ((contact = this.contact) != null ? contact.equals(onUpdateEngagementUserLevel.contact) : onUpdateEngagementUserLevel.contact == null) && ((campaign = this.campaign) != null ? campaign.equals(onUpdateEngagementUserLevel.campaign) : onUpdateEngagementUserLevel.campaign == null) && ((linkedCampaign = this.linkedCampaign) != null ? linkedCampaign.equals(onUpdateEngagementUserLevel.linkedCampaign) : onUpdateEngagementUserLevel.linkedCampaign == null) && ((engagementOwner = this.engagementOwner) != null ? engagementOwner.equals(onUpdateEngagementUserLevel.engagementOwner) : onUpdateEngagementUserLevel.engagementOwner == null) && ((addedBy = this.addedBy) != null ? addedBy.equals(onUpdateEngagementUserLevel.addedBy) : onUpdateEngagementUserLevel.addedBy == null)) {
                UpdatedBy updatedBy = this.updatedBy;
                UpdatedBy updatedBy2 = onUpdateEngagementUserLevel.updatedBy;
                if (updatedBy == null) {
                    if (updatedBy2 == null) {
                        return true;
                    }
                } else if (updatedBy.equals(updatedBy2)) {
                    return true;
                }
            }
            return false;
        }

        public ExternalEventRecord externalEventRecord() {
            return this.externalEventRecord;
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
                PrimaryTeam primaryTeam = this.primaryTeam;
                int iHashCode4 = (iHashCode3 ^ (primaryTeam == null ? 0 : primaryTeam.hashCode())) * 1000003;
                ContactAssignmentStatus contactAssignmentStatus = this.toBeAssigned;
                int iHashCode5 = (iHashCode4 ^ (contactAssignmentStatus == null ? 0 : contactAssignmentStatus.hashCode())) * 1000003;
                String str3 = this.ownerId;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.contactPrimaryTeamId;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.contactOwnerId;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.addedById;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedById;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.callStatus;
                int iHashCode11 = (((iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.engagementStatus.hashCode()) * 1000003;
                String str9 = this.parentEngagementId;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.nextStepTaskId;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                Boolean bool = this.syncStatus;
                int iHashCode14 = (iHashCode13 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str11 = this.externalNumber;
                int iHashCode15 = (iHashCode14 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.userNumber;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                CallDirection callDirection = this.callDirection;
                int iHashCode17 = (iHashCode16 ^ (callDirection == null ? 0 : callDirection.hashCode())) * 1000003;
                CallConnectStatus callConnectStatus = this.callConnectStatus;
                int iHashCode18 = (iHashCode17 ^ (callConnectStatus == null ? 0 : callConnectStatus.hashCode())) * 1000003;
                String str13 = this.callStartTime;
                int iHashCode19 = (iHashCode18 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.callEndTime;
                int iHashCode20 = (iHashCode19 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                Integer num = this.durationInMillis;
                int iHashCode21 = (iHashCode20 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str15 = this.callOutcome;
                int iHashCode22 = (iHashCode21 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.callOutcomeNature;
                int iHashCode23 = (iHashCode22 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.callRecordingExternalResource;
                int iHashCode24 = (iHashCode23 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.noteHeading;
                int iHashCode25 = (iHashCode24 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                NoteAdditionMethod noteAdditionMethod = this.noteAdditionMethod;
                int iHashCode26 = (iHashCode25 ^ (noteAdditionMethod == null ? 0 : noteAdditionMethod.hashCode())) * 1000003;
                String str19 = this.voiceNoteUrl;
                int iHashCode27 = (iHashCode26 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.body;
                int iHashCode28 = (iHashCode27 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                Boolean bool2 = this.isManualTask;
                int iHashCode29 = (iHashCode28 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str21 = this.taskHeading;
                int iHashCode30 = (iHashCode29 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.taskType;
                int iHashCode31 = (iHashCode30 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                TaskActivityType taskActivityType = this.taskActivityType;
                int iHashCode32 = (iHashCode31 ^ (taskActivityType == null ? 0 : taskActivityType.hashCode())) * 1000003;
                String str23 = this.taskInputNote;
                int iHashCode33 = (iHashCode32 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.taskPriority;
                int iHashCode34 = (iHashCode33 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.taskCompletionNote;
                int iHashCode35 = (iHashCode34 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.taskCompletionTime;
                int iHashCode36 = (iHashCode35 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.taskCompletionType;
                int iHashCode37 = (iHashCode36 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.dueDateTime;
                int iHashCode38 = (iHashCode37 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.nextFollowUpOn;
                int iHashCode39 = (iHashCode38 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.nextFollowUpSetBy;
                int iHashCode40 = (iHashCode39 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                String str31 = this.reminderDateTime;
                int iHashCode41 = (iHashCode40 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                TaskLocation taskLocation = this.taskLocation;
                int iHashCode42 = (iHashCode41 ^ (taskLocation == null ? 0 : taskLocation.hashCode())) * 1000003;
                String str32 = this.callRecordingUrl;
                int iHashCode43 = (iHashCode42 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.callTranscriptUrl;
                int iHashCode44 = (iHashCode43 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                String str34 = this.callTranscriptSummary;
                int iHashCode45 = (iHashCode44 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.uploadedFiledUrl;
                int iHashCode46 = (iHashCode45 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                VisitLocation visitLocation = this.visitLocation;
                int iHashCode47 = (iHashCode46 ^ (visitLocation == null ? 0 : visitLocation.hashCode())) * 1000003;
                String str36 = this.visitTime;
                int iHashCode48 = (iHashCode47 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.visitNote;
                int iHashCode49 = (iHashCode48 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                String str38 = this.visitOutcome;
                int iHashCode50 = (iHashCode49 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                String str39 = this.visitOutcomeNature;
                int iHashCode51 = (iHashCode50 ^ (str39 == null ? 0 : str39.hashCode())) * 1000003;
                String str40 = this.videoCallPlatform;
                int iHashCode52 = (iHashCode51 ^ (str40 == null ? 0 : str40.hashCode())) * 1000003;
                String str41 = this.videoCallLink;
                int iHashCode53 = (iHashCode52 ^ (str41 == null ? 0 : str41.hashCode())) * 1000003;
                String str42 = this.meetingName;
                int iHashCode54 = (iHashCode53 ^ (str42 == null ? 0 : str42.hashCode())) * 1000003;
                String str43 = this.meetingCode;
                int iHashCode55 = (iHashCode54 ^ (str43 == null ? 0 : str43.hashCode())) * 1000003;
                String str44 = this.videoCallMetadata;
                int iHashCode56 = (iHashCode55 ^ (str44 == null ? 0 : str44.hashCode())) * 1000003;
                String str45 = this.videoCallOutcome;
                int iHashCode57 = (iHashCode56 ^ (str45 == null ? 0 : str45.hashCode())) * 1000003;
                List<MeetingParticipant> list = this.meetingParticipants;
                int iHashCode58 = (iHashCode57 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str46 = this.paymentDataId;
                int iHashCode59 = (iHashCode58 ^ (str46 == null ? 0 : str46.hashCode())) * 1000003;
                String str47 = this.calendarEventId;
                int iHashCode60 = (iHashCode59 ^ (str47 == null ? 0 : str47.hashCode())) * 1000003;
                String str48 = this.calendarName;
                int iHashCode61 = (iHashCode60 ^ (str48 == null ? 0 : str48.hashCode())) * 1000003;
                String str49 = this.campaignId;
                int iHashCode62 = (iHashCode61 ^ (str49 == null ? 0 : str49.hashCode())) * 1000003;
                String str50 = this.campaignRun;
                int iHashCode63 = (iHashCode62 ^ (str50 == null ? 0 : str50.hashCode())) * 1000003;
                String str51 = this.engagementSourceType;
                int iHashCode64 = (iHashCode63 ^ (str51 == null ? 0 : str51.hashCode())) * 1000003;
                String str52 = this.engagementSource;
                int iHashCode65 = (iHashCode64 ^ (str52 == null ? 0 : str52.hashCode())) * 1000003;
                String str53 = this.engagementSourceLevelTwo;
                int iHashCode66 = (iHashCode65 ^ (str53 == null ? 0 : str53.hashCode())) * 1000003;
                String str54 = this.systemAction;
                int iHashCode67 = (iHashCode66 ^ (str54 == null ? 0 : str54.hashCode())) * 1000003;
                List<String> list2 = this.taskEngagementActions;
                int iHashCode68 = (iHashCode67 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str55 = this.taskEngagementActionsUpdatedAt;
                int iHashCode69 = (iHashCode68 ^ (str55 == null ? 0 : str55.hashCode())) * 1000003;
                String str56 = this.firstTaskEngagementActionOn;
                int iHashCode70 = (iHashCode69 ^ (str56 == null ? 0 : str56.hashCode())) * 1000003;
                Integer num2 = this.taskEngagementActionCount;
                int iHashCode71 = (iHashCode70 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str57 = this.customCallOutcomeData;
                int iHashCode72 = (iHashCode71 ^ (str57 == null ? 0 : str57.hashCode())) * 1000003;
                String str58 = this.customVisitOutcomeData;
                int iHashCode73 = (iHashCode72 ^ (str58 == null ? 0 : str58.hashCode())) * 1000003;
                String str59 = this.customTaskCompletionData;
                int iHashCode74 = (iHashCode73 ^ (str59 == null ? 0 : str59.hashCode())) * 1000003;
                String str60 = this.customTaskInputData;
                int iHashCode75 = (iHashCode74 ^ (str60 == null ? 0 : str60.hashCode())) * 1000003;
                String str61 = this.customVideoCallInputData;
                int iHashCode76 = (iHashCode75 ^ (str61 == null ? 0 : str61.hashCode())) * 1000003;
                String str62 = this.deviceId;
                int iHashCode77 = (iHashCode76 ^ (str62 == null ? 0 : str62.hashCode())) * 1000003;
                Integer num3 = this.totalCallDuration;
                int iHashCode78 = (iHashCode77 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str63 = this.cloudProviderNumber;
                int iHashCode79 = (iHashCode78 ^ (str63 == null ? 0 : str63.hashCode())) * 1000003;
                String str64 = this.hangupReason;
                int iHashCode80 = (iHashCode79 ^ (str64 == null ? 0 : str64.hashCode())) * 1000003;
                String str65 = this.cloudProvider;
                int iHashCode81 = (iHashCode80 ^ (str65 == null ? 0 : str65.hashCode())) * 1000003;
                String str66 = this.callType;
                int iHashCode82 = (iHashCode81 ^ (str66 == null ? 0 : str66.hashCode())) * 1000003;
                String str67 = this.phoneCallLogId;
                int iHashCode83 = (iHashCode82 ^ (str67 == null ? 0 : str67.hashCode())) * 1000003;
                String str68 = this.externalEventRecordId;
                int iHashCode84 = (iHashCode83 ^ (str68 == null ? 0 : str68.hashCode())) * 1000003;
                String str69 = this.createdAt;
                int iHashCode85 = (iHashCode84 ^ (str69 == null ? 0 : str69.hashCode())) * 1000003;
                String str70 = this.updatedAt;
                int iHashCode86 = (iHashCode85 ^ (str70 == null ? 0 : str70.hashCode())) * 1000003;
                ExternalEventRecord externalEventRecord = this.externalEventRecord;
                int iHashCode87 = (iHashCode86 ^ (externalEventRecord == null ? 0 : externalEventRecord.hashCode())) * 1000003;
                ParentEngagement parentEngagement = this.parentEngagement;
                int iHashCode88 = (iHashCode87 ^ (parentEngagement == null ? 0 : parentEngagement.hashCode())) * 1000003;
                ChildEngagements childEngagements = this.childEngagements;
                int iHashCode89 = (iHashCode88 ^ (childEngagements == null ? 0 : childEngagements.hashCode())) * 1000003;
                NextStepTask nextStepTask = this.nextStepTask;
                int iHashCode90 = (iHashCode89 ^ (nextStepTask == null ? 0 : nextStepTask.hashCode())) * 1000003;
                PaymentData paymentData = this.paymentData;
                int iHashCode91 = (iHashCode90 ^ (paymentData == null ? 0 : paymentData.hashCode())) * 1000003;
                EngagementUpdate engagementUpdate = this.engagementUpdate;
                int iHashCode92 = (iHashCode91 ^ (engagementUpdate == null ? 0 : engagementUpdate.hashCode())) * 1000003;
                Locations locations = this.locations;
                int iHashCode93 = (iHashCode92 ^ (locations == null ? 0 : locations.hashCode())) * 1000003;
                LinkedFiles linkedFiles = this.linkedFiles;
                int iHashCode94 = (iHashCode93 ^ (linkedFiles == null ? 0 : linkedFiles.hashCode())) * 1000003;
                Comments comments = this.comments;
                int iHashCode95 = (iHashCode94 ^ (comments == null ? 0 : comments.hashCode())) * 1000003;
                Contact contact = this.contact;
                int iHashCode96 = (iHashCode95 ^ (contact == null ? 0 : contact.hashCode())) * 1000003;
                Campaign campaign = this.campaign;
                int iHashCode97 = (iHashCode96 ^ (campaign == null ? 0 : campaign.hashCode())) * 1000003;
                LinkedCampaign linkedCampaign = this.linkedCampaign;
                int iHashCode98 = (iHashCode97 ^ (linkedCampaign == null ? 0 : linkedCampaign.hashCode())) * 1000003;
                EngagementOwner engagementOwner = this.engagementOwner;
                int iHashCode99 = (iHashCode98 ^ (engagementOwner == null ? 0 : engagementOwner.hashCode())) * 1000003;
                AddedBy addedBy = this.addedBy;
                int iHashCode100 = (iHashCode99 ^ (addedBy == null ? 0 : addedBy.hashCode())) * 1000003;
                UpdatedBy updatedBy = this.updatedBy;
                this.$hashCode = iHashCode100 ^ (updatedBy != null ? updatedBy.hashCode() : 0);
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

        public LinkedCampaign linkedCampaign() {
            return this.linkedCampaign;
        }

        public LinkedFiles linkedFiles() {
            return this.linkedFiles;
        }

        public Locations locations() {
            return this.locations;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnUpdateEngagementUserLevel.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnUpdateEngagementUserLevel.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnUpdateEngagementUserLevel.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnUpdateEngagementUserLevel.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], OnUpdateEngagementUserLevel.this.engagementType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], OnUpdateEngagementUserLevel.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], OnUpdateEngagementUserLevel.this.primaryTeamId);
                    ResponseField responseField = responseFieldArr[6];
                    PrimaryTeam primaryTeam = OnUpdateEngagementUserLevel.this.primaryTeam;
                    responseWriter.writeObject(responseField, primaryTeam != null ? primaryTeam.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[7];
                    ContactAssignmentStatus contactAssignmentStatus = OnUpdateEngagementUserLevel.this.toBeAssigned;
                    responseWriter.writeString(responseField2, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnUpdateEngagementUserLevel.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], OnUpdateEngagementUserLevel.this.contactPrimaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], OnUpdateEngagementUserLevel.this.contactOwnerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], OnUpdateEngagementUserLevel.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], OnUpdateEngagementUserLevel.this.updatedById);
                    responseWriter.writeString(responseFieldArr[13], OnUpdateEngagementUserLevel.this.callStatus);
                    responseWriter.writeString(responseFieldArr[14], OnUpdateEngagementUserLevel.this.engagementStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], OnUpdateEngagementUserLevel.this.parentEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], OnUpdateEngagementUserLevel.this.nextStepTaskId);
                    responseWriter.writeBoolean(responseFieldArr[17], OnUpdateEngagementUserLevel.this.syncStatus);
                    responseWriter.writeString(responseFieldArr[18], OnUpdateEngagementUserLevel.this.externalNumber);
                    responseWriter.writeString(responseFieldArr[19], OnUpdateEngagementUserLevel.this.userNumber);
                    ResponseField responseField3 = responseFieldArr[20];
                    CallDirection callDirection = OnUpdateEngagementUserLevel.this.callDirection;
                    responseWriter.writeString(responseField3, callDirection != null ? callDirection.name() : null);
                    ResponseField responseField4 = responseFieldArr[21];
                    CallConnectStatus callConnectStatus = OnUpdateEngagementUserLevel.this.callConnectStatus;
                    responseWriter.writeString(responseField4, callConnectStatus != null ? callConnectStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], OnUpdateEngagementUserLevel.this.callStartTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], OnUpdateEngagementUserLevel.this.callEndTime);
                    responseWriter.writeInt(responseFieldArr[24], OnUpdateEngagementUserLevel.this.durationInMillis);
                    responseWriter.writeString(responseFieldArr[25], OnUpdateEngagementUserLevel.this.callOutcome);
                    responseWriter.writeString(responseFieldArr[26], OnUpdateEngagementUserLevel.this.callOutcomeNature);
                    responseWriter.writeString(responseFieldArr[27], OnUpdateEngagementUserLevel.this.callRecordingExternalResource);
                    responseWriter.writeString(responseFieldArr[28], OnUpdateEngagementUserLevel.this.noteHeading);
                    ResponseField responseField5 = responseFieldArr[29];
                    NoteAdditionMethod noteAdditionMethod = OnUpdateEngagementUserLevel.this.noteAdditionMethod;
                    responseWriter.writeString(responseField5, noteAdditionMethod != null ? noteAdditionMethod.name() : null);
                    responseWriter.writeString(responseFieldArr[30], OnUpdateEngagementUserLevel.this.voiceNoteUrl);
                    responseWriter.writeString(responseFieldArr[31], OnUpdateEngagementUserLevel.this.body);
                    responseWriter.writeBoolean(responseFieldArr[32], OnUpdateEngagementUserLevel.this.isManualTask);
                    responseWriter.writeString(responseFieldArr[33], OnUpdateEngagementUserLevel.this.taskHeading);
                    responseWriter.writeString(responseFieldArr[34], OnUpdateEngagementUserLevel.this.taskType);
                    ResponseField responseField6 = responseFieldArr[35];
                    TaskActivityType taskActivityType = OnUpdateEngagementUserLevel.this.taskActivityType;
                    responseWriter.writeString(responseField6, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeString(responseFieldArr[36], OnUpdateEngagementUserLevel.this.taskInputNote);
                    responseWriter.writeString(responseFieldArr[37], OnUpdateEngagementUserLevel.this.taskPriority);
                    responseWriter.writeString(responseFieldArr[38], OnUpdateEngagementUserLevel.this.taskCompletionNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], OnUpdateEngagementUserLevel.this.taskCompletionTime);
                    responseWriter.writeString(responseFieldArr[40], OnUpdateEngagementUserLevel.this.taskCompletionType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[41], OnUpdateEngagementUserLevel.this.dueDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], OnUpdateEngagementUserLevel.this.nextFollowUpOn);
                    responseWriter.writeString(responseFieldArr[43], OnUpdateEngagementUserLevel.this.nextFollowUpSetBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[44], OnUpdateEngagementUserLevel.this.reminderDateTime);
                    ResponseField responseField7 = responseFieldArr[45];
                    TaskLocation taskLocation = OnUpdateEngagementUserLevel.this.taskLocation;
                    responseWriter.writeObject(responseField7, taskLocation != null ? taskLocation.marshaller() : null);
                    responseWriter.writeString(responseFieldArr[46], OnUpdateEngagementUserLevel.this.callRecordingUrl);
                    responseWriter.writeString(responseFieldArr[47], OnUpdateEngagementUserLevel.this.callTranscriptUrl);
                    responseWriter.writeString(responseFieldArr[48], OnUpdateEngagementUserLevel.this.callTranscriptSummary);
                    responseWriter.writeString(responseFieldArr[49], OnUpdateEngagementUserLevel.this.uploadedFiledUrl);
                    ResponseField responseField8 = responseFieldArr[50];
                    VisitLocation visitLocation = OnUpdateEngagementUserLevel.this.visitLocation;
                    responseWriter.writeObject(responseField8, visitLocation != null ? visitLocation.marshaller() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[51], OnUpdateEngagementUserLevel.this.visitTime);
                    responseWriter.writeString(responseFieldArr[52], OnUpdateEngagementUserLevel.this.visitNote);
                    responseWriter.writeString(responseFieldArr[53], OnUpdateEngagementUserLevel.this.visitOutcome);
                    responseWriter.writeString(responseFieldArr[54], OnUpdateEngagementUserLevel.this.visitOutcomeNature);
                    responseWriter.writeString(responseFieldArr[55], OnUpdateEngagementUserLevel.this.videoCallPlatform);
                    responseWriter.writeString(responseFieldArr[56], OnUpdateEngagementUserLevel.this.videoCallLink);
                    responseWriter.writeString(responseFieldArr[57], OnUpdateEngagementUserLevel.this.meetingName);
                    responseWriter.writeString(responseFieldArr[58], OnUpdateEngagementUserLevel.this.meetingCode);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[59], OnUpdateEngagementUserLevel.this.videoCallMetadata);
                    responseWriter.writeString(responseFieldArr[60], OnUpdateEngagementUserLevel.this.videoCallOutcome);
                    responseWriter.writeList(responseFieldArr[61], OnUpdateEngagementUserLevel.this.meetingParticipants, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((MeetingParticipant) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[62], OnUpdateEngagementUserLevel.this.paymentDataId);
                    responseWriter.writeString(responseFieldArr[63], OnUpdateEngagementUserLevel.this.calendarEventId);
                    responseWriter.writeString(responseFieldArr[64], OnUpdateEngagementUserLevel.this.calendarName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[65], OnUpdateEngagementUserLevel.this.campaignId);
                    responseWriter.writeString(responseFieldArr[66], OnUpdateEngagementUserLevel.this.campaignRun);
                    responseWriter.writeString(responseFieldArr[67], OnUpdateEngagementUserLevel.this.engagementSourceType);
                    responseWriter.writeString(responseFieldArr[68], OnUpdateEngagementUserLevel.this.engagementSource);
                    responseWriter.writeString(responseFieldArr[69], OnUpdateEngagementUserLevel.this.engagementSourceLevelTwo);
                    responseWriter.writeString(responseFieldArr[70], OnUpdateEngagementUserLevel.this.systemAction);
                    responseWriter.writeList(responseFieldArr[71], OnUpdateEngagementUserLevel.this.taskEngagementActions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.OnUpdateEngagementUserLevel.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], OnUpdateEngagementUserLevel.this.taskEngagementActionsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], OnUpdateEngagementUserLevel.this.firstTaskEngagementActionOn);
                    responseWriter.writeInt(responseFieldArr[74], OnUpdateEngagementUserLevel.this.taskEngagementActionCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[75], OnUpdateEngagementUserLevel.this.customCallOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[76], OnUpdateEngagementUserLevel.this.customVisitOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[77], OnUpdateEngagementUserLevel.this.customTaskCompletionData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[78], OnUpdateEngagementUserLevel.this.customTaskInputData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[79], OnUpdateEngagementUserLevel.this.customVideoCallInputData);
                    responseWriter.writeString(responseFieldArr[80], OnUpdateEngagementUserLevel.this.deviceId);
                    responseWriter.writeInt(responseFieldArr[81], OnUpdateEngagementUserLevel.this.totalCallDuration);
                    responseWriter.writeString(responseFieldArr[82], OnUpdateEngagementUserLevel.this.cloudProviderNumber);
                    responseWriter.writeString(responseFieldArr[83], OnUpdateEngagementUserLevel.this.hangupReason);
                    responseWriter.writeString(responseFieldArr[84], OnUpdateEngagementUserLevel.this.cloudProvider);
                    responseWriter.writeString(responseFieldArr[85], OnUpdateEngagementUserLevel.this.callType);
                    responseWriter.writeString(responseFieldArr[86], OnUpdateEngagementUserLevel.this.phoneCallLogId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[87], OnUpdateEngagementUserLevel.this.externalEventRecordId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[88], OnUpdateEngagementUserLevel.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[89], OnUpdateEngagementUserLevel.this.updatedAt);
                    ResponseField responseField9 = responseFieldArr[90];
                    ExternalEventRecord externalEventRecord = OnUpdateEngagementUserLevel.this.externalEventRecord;
                    responseWriter.writeObject(responseField9, externalEventRecord != null ? externalEventRecord.marshaller() : null);
                    ResponseField responseField10 = responseFieldArr[91];
                    ParentEngagement parentEngagement = OnUpdateEngagementUserLevel.this.parentEngagement;
                    responseWriter.writeObject(responseField10, parentEngagement != null ? parentEngagement.marshaller() : null);
                    ResponseField responseField11 = responseFieldArr[92];
                    ChildEngagements childEngagements = OnUpdateEngagementUserLevel.this.childEngagements;
                    responseWriter.writeObject(responseField11, childEngagements != null ? childEngagements.marshaller() : null);
                    ResponseField responseField12 = responseFieldArr[93];
                    NextStepTask nextStepTask = OnUpdateEngagementUserLevel.this.nextStepTask;
                    responseWriter.writeObject(responseField12, nextStepTask != null ? nextStepTask.marshaller() : null);
                    ResponseField responseField13 = responseFieldArr[94];
                    PaymentData paymentData = OnUpdateEngagementUserLevel.this.paymentData;
                    responseWriter.writeObject(responseField13, paymentData != null ? paymentData.marshaller() : null);
                    ResponseField responseField14 = responseFieldArr[95];
                    EngagementUpdate engagementUpdate = OnUpdateEngagementUserLevel.this.engagementUpdate;
                    responseWriter.writeObject(responseField14, engagementUpdate != null ? engagementUpdate.marshaller() : null);
                    ResponseField responseField15 = responseFieldArr[96];
                    Locations locations = OnUpdateEngagementUserLevel.this.locations;
                    responseWriter.writeObject(responseField15, locations != null ? locations.marshaller() : null);
                    ResponseField responseField16 = responseFieldArr[97];
                    LinkedFiles linkedFiles = OnUpdateEngagementUserLevel.this.linkedFiles;
                    responseWriter.writeObject(responseField16, linkedFiles != null ? linkedFiles.marshaller() : null);
                    ResponseField responseField17 = responseFieldArr[98];
                    Comments comments = OnUpdateEngagementUserLevel.this.comments;
                    responseWriter.writeObject(responseField17, comments != null ? comments.marshaller() : null);
                    ResponseField responseField18 = responseFieldArr[99];
                    Contact contact = OnUpdateEngagementUserLevel.this.contact;
                    responseWriter.writeObject(responseField18, contact != null ? contact.marshaller() : null);
                    ResponseField responseField19 = responseFieldArr[100];
                    Campaign campaign = OnUpdateEngagementUserLevel.this.campaign;
                    responseWriter.writeObject(responseField19, campaign != null ? campaign.marshaller() : null);
                    ResponseField responseField20 = responseFieldArr[101];
                    LinkedCampaign linkedCampaign = OnUpdateEngagementUserLevel.this.linkedCampaign;
                    responseWriter.writeObject(responseField20, linkedCampaign != null ? linkedCampaign.marshaller() : null);
                    ResponseField responseField21 = responseFieldArr[102];
                    EngagementOwner engagementOwner = OnUpdateEngagementUserLevel.this.engagementOwner;
                    responseWriter.writeObject(responseField21, engagementOwner != null ? engagementOwner.marshaller() : null);
                    ResponseField responseField22 = responseFieldArr[103];
                    AddedBy addedBy = OnUpdateEngagementUserLevel.this.addedBy;
                    responseWriter.writeObject(responseField22, addedBy != null ? addedBy.marshaller() : null);
                    ResponseField responseField23 = responseFieldArr[104];
                    UpdatedBy updatedBy = OnUpdateEngagementUserLevel.this.updatedBy;
                    responseWriter.writeObject(responseField23, updatedBy != null ? updatedBy.marshaller() : null);
                }
            };
        }

        public String meetingCode() {
            return this.meetingCode;
        }

        public String meetingName() {
            return this.meetingName;
        }

        public List<MeetingParticipant> meetingParticipants() {
            return this.meetingParticipants;
        }

        public String nextFollowUpOn() {
            return this.nextFollowUpOn;
        }

        public String nextFollowUpSetBy() {
            return this.nextFollowUpSetBy;
        }

        public NextStepTask nextStepTask() {
            return this.nextStepTask;
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

        public ParentEngagement parentEngagement() {
            return this.parentEngagement;
        }

        public String parentEngagementId() {
            return this.parentEngagementId;
        }

        public PaymentData paymentData() {
            return this.paymentData;
        }

        public String paymentDataId() {
            return this.paymentDataId;
        }

        public String phoneCallLogId() {
            return this.phoneCallLogId;
        }

        public PrimaryTeam primaryTeam() {
            return this.primaryTeam;
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

        public TaskLocation taskLocation() {
            return this.taskLocation;
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
                this.$toString = "OnUpdateEngagementUserLevel{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", engagementType=" + this.engagementType + ", contactId=" + this.contactId + ", primaryTeamId=" + this.primaryTeamId + ", primaryTeam=" + this.primaryTeam + ", toBeAssigned=" + this.toBeAssigned + ", ownerId=" + this.ownerId + ", contactPrimaryTeamId=" + this.contactPrimaryTeamId + ", contactOwnerId=" + this.contactOwnerId + ", addedById=" + this.addedById + ", updatedById=" + this.updatedById + ", callStatus=" + this.callStatus + ", engagementStatus=" + this.engagementStatus + ", parentEngagementId=" + this.parentEngagementId + ", nextStepTaskId=" + this.nextStepTaskId + ", syncStatus=" + this.syncStatus + ", externalNumber=" + this.externalNumber + ", userNumber=" + this.userNumber + ", callDirection=" + this.callDirection + ", callConnectStatus=" + this.callConnectStatus + ", callStartTime=" + this.callStartTime + ", callEndTime=" + this.callEndTime + ", durationInMillis=" + this.durationInMillis + ", callOutcome=" + this.callOutcome + ", callOutcomeNature=" + this.callOutcomeNature + ", callRecordingExternalResource=" + this.callRecordingExternalResource + ", noteHeading=" + this.noteHeading + ", noteAdditionMethod=" + this.noteAdditionMethod + ", voiceNoteUrl=" + this.voiceNoteUrl + ", body=" + this.body + ", isManualTask=" + this.isManualTask + ", taskHeading=" + this.taskHeading + ", taskType=" + this.taskType + ", taskActivityType=" + this.taskActivityType + ", taskInputNote=" + this.taskInputNote + ", taskPriority=" + this.taskPriority + ", taskCompletionNote=" + this.taskCompletionNote + ", taskCompletionTime=" + this.taskCompletionTime + ", taskCompletionType=" + this.taskCompletionType + ", dueDateTime=" + this.dueDateTime + ", nextFollowUpOn=" + this.nextFollowUpOn + ", nextFollowUpSetBy=" + this.nextFollowUpSetBy + ", reminderDateTime=" + this.reminderDateTime + ", taskLocation=" + this.taskLocation + ", callRecordingUrl=" + this.callRecordingUrl + ", callTranscriptUrl=" + this.callTranscriptUrl + ", callTranscriptSummary=" + this.callTranscriptSummary + ", uploadedFiledUrl=" + this.uploadedFiledUrl + ", visitLocation=" + this.visitLocation + ", visitTime=" + this.visitTime + ", visitNote=" + this.visitNote + ", visitOutcome=" + this.visitOutcome + ", visitOutcomeNature=" + this.visitOutcomeNature + ", videoCallPlatform=" + this.videoCallPlatform + ", videoCallLink=" + this.videoCallLink + ", meetingName=" + this.meetingName + ", meetingCode=" + this.meetingCode + ", videoCallMetadata=" + this.videoCallMetadata + ", videoCallOutcome=" + this.videoCallOutcome + ", meetingParticipants=" + this.meetingParticipants + ", paymentDataId=" + this.paymentDataId + ", calendarEventId=" + this.calendarEventId + ", calendarName=" + this.calendarName + ", campaignId=" + this.campaignId + ", campaignRun=" + this.campaignRun + ", engagementSourceType=" + this.engagementSourceType + ", engagementSource=" + this.engagementSource + ", engagementSourceLevelTwo=" + this.engagementSourceLevelTwo + ", systemAction=" + this.systemAction + ", taskEngagementActions=" + this.taskEngagementActions + ", taskEngagementActionsUpdatedAt=" + this.taskEngagementActionsUpdatedAt + ", firstTaskEngagementActionOn=" + this.firstTaskEngagementActionOn + ", taskEngagementActionCount=" + this.taskEngagementActionCount + ", customCallOutcomeData=" + this.customCallOutcomeData + ", customVisitOutcomeData=" + this.customVisitOutcomeData + ", customTaskCompletionData=" + this.customTaskCompletionData + ", customTaskInputData=" + this.customTaskInputData + ", customVideoCallInputData=" + this.customVideoCallInputData + ", deviceId=" + this.deviceId + ", totalCallDuration=" + this.totalCallDuration + ", cloudProviderNumber=" + this.cloudProviderNumber + ", hangupReason=" + this.hangupReason + ", cloudProvider=" + this.cloudProvider + ", callType=" + this.callType + ", phoneCallLogId=" + this.phoneCallLogId + ", externalEventRecordId=" + this.externalEventRecordId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", externalEventRecord=" + this.externalEventRecord + ", parentEngagement=" + this.parentEngagement + ", childEngagements=" + this.childEngagements + ", nextStepTask=" + this.nextStepTask + ", paymentData=" + this.paymentData + ", engagementUpdate=" + this.engagementUpdate + ", locations=" + this.locations + ", linkedFiles=" + this.linkedFiles + ", comments=" + this.comments + ", contact=" + this.contact + ", campaign=" + this.campaign + ", linkedCampaign=" + this.linkedCampaign + ", engagementOwner=" + this.engagementOwner + ", addedBy=" + this.addedBy + ", updatedBy=" + this.updatedBy + "}";
            }
            return this.$toString;
        }

        public Integer totalCallDuration() {
            return this.totalCallDuration;
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

        public VisitLocation visitLocation() {
            return this.visitLocation;
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

    public static class ParentEngagement {
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

        public static final class Mapper implements ResponseFieldMapper<ParentEngagement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ParentEngagement map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ParentEngagement.$responseFields;
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
                return new ParentEngagement(string, str, str2, engagementTypeValueOf, str3, str4, contactAssignmentStatusValueOf, str5, str6, str7, str8, str9, string4, engagementStatusValueOf, str10, str11, bool, string6, string7, callDirectionValueOf, callConnectStatusValueOf, str12, str13, num, string10, string11, string12, string13, noteAdditionMethodValueOf, string15, string16, bool2, string17, string18, string19 != null ? TaskActivityType.valueOf(string19) : null, responseReader.readString(responseFieldArr[35]), responseReader.readString(responseFieldArr[36]), responseReader.readString(responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readString(responseFieldArr[39]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), responseReader.readString(responseFieldArr[42]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readString(responseFieldArr[45]), responseReader.readString(responseFieldArr[46]), responseReader.readString(responseFieldArr[47]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), responseReader.readString(responseFieldArr[50]), responseReader.readString(responseFieldArr[51]), responseReader.readString(responseFieldArr[52]), responseReader.readString(responseFieldArr[53]), responseReader.readString(responseFieldArr[54]), responseReader.readString(responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]), responseReader.readString(responseFieldArr[57]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[58]), responseReader.readString(responseFieldArr[59]), responseReader.readString(responseFieldArr[60]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[61]), responseReader.readString(responseFieldArr[62]), responseReader.readString(responseFieldArr[63]), responseReader.readString(responseFieldArr[64]), responseReader.readString(responseFieldArr[65]), responseReader.readString(responseFieldArr[66]), responseReader.readList(responseFieldArr[67], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.ParentEngagement.Mapper.1
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

        public ParentEngagement(String str, String str2, String str3, EngagementType engagementType, String str4, String str5, ContactAssignmentStatus contactAssignmentStatus, String str6, String str7, String str8, String str9, String str10, String str11, EngagementStatus engagementStatus, String str12, String str13, Boolean bool, String str14, String str15, CallDirection callDirection, CallConnectStatus callConnectStatus, String str16, String str17, Integer num, String str18, String str19, String str20, String str21, NoteAdditionMethod noteAdditionMethod, String str22, String str23, Boolean bool2, String str24, String str25, TaskActivityType taskActivityType, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, List<String> list, String str58, String str59, Integer num2, String str60, String str61, String str62, String str63, String str64, String str65, Integer num3, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73) {
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
            if (!(obj instanceof ParentEngagement)) {
                return false;
            }
            ParentEngagement parentEngagement = (ParentEngagement) obj;
            if (this.__typename.equals(parentEngagement.__typename) && this.id.equals(parentEngagement.id) && this.accountId.equals(parentEngagement.accountId) && this.engagementType.equals(parentEngagement.engagementType) && ((str = this.contactId) != null ? str.equals(parentEngagement.contactId) : parentEngagement.contactId == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(parentEngagement.primaryTeamId) : parentEngagement.primaryTeamId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(parentEngagement.toBeAssigned) : parentEngagement.toBeAssigned == null) && ((str3 = this.ownerId) != null ? str3.equals(parentEngagement.ownerId) : parentEngagement.ownerId == null) && ((str4 = this.contactPrimaryTeamId) != null ? str4.equals(parentEngagement.contactPrimaryTeamId) : parentEngagement.contactPrimaryTeamId == null) && ((str5 = this.contactOwnerId) != null ? str5.equals(parentEngagement.contactOwnerId) : parentEngagement.contactOwnerId == null) && ((str6 = this.addedById) != null ? str6.equals(parentEngagement.addedById) : parentEngagement.addedById == null) && ((str7 = this.updatedById) != null ? str7.equals(parentEngagement.updatedById) : parentEngagement.updatedById == null) && ((str8 = this.callStatus) != null ? str8.equals(parentEngagement.callStatus) : parentEngagement.callStatus == null) && this.engagementStatus.equals(parentEngagement.engagementStatus) && ((str9 = this.parentEngagementId) != null ? str9.equals(parentEngagement.parentEngagementId) : parentEngagement.parentEngagementId == null) && ((str10 = this.nextStepTaskId) != null ? str10.equals(parentEngagement.nextStepTaskId) : parentEngagement.nextStepTaskId == null) && ((bool = this.syncStatus) != null ? bool.equals(parentEngagement.syncStatus) : parentEngagement.syncStatus == null) && ((str11 = this.externalNumber) != null ? str11.equals(parentEngagement.externalNumber) : parentEngagement.externalNumber == null) && ((str12 = this.userNumber) != null ? str12.equals(parentEngagement.userNumber) : parentEngagement.userNumber == null) && ((callDirection = this.callDirection) != null ? callDirection.equals(parentEngagement.callDirection) : parentEngagement.callDirection == null) && ((callConnectStatus = this.callConnectStatus) != null ? callConnectStatus.equals(parentEngagement.callConnectStatus) : parentEngagement.callConnectStatus == null) && ((str13 = this.callStartTime) != null ? str13.equals(parentEngagement.callStartTime) : parentEngagement.callStartTime == null) && ((str14 = this.callEndTime) != null ? str14.equals(parentEngagement.callEndTime) : parentEngagement.callEndTime == null) && ((num = this.durationInMillis) != null ? num.equals(parentEngagement.durationInMillis) : parentEngagement.durationInMillis == null) && ((str15 = this.callOutcome) != null ? str15.equals(parentEngagement.callOutcome) : parentEngagement.callOutcome == null) && ((str16 = this.callOutcomeNature) != null ? str16.equals(parentEngagement.callOutcomeNature) : parentEngagement.callOutcomeNature == null) && ((str17 = this.callRecordingExternalResource) != null ? str17.equals(parentEngagement.callRecordingExternalResource) : parentEngagement.callRecordingExternalResource == null) && ((str18 = this.noteHeading) != null ? str18.equals(parentEngagement.noteHeading) : parentEngagement.noteHeading == null) && ((noteAdditionMethod = this.noteAdditionMethod) != null ? noteAdditionMethod.equals(parentEngagement.noteAdditionMethod) : parentEngagement.noteAdditionMethod == null) && ((str19 = this.voiceNoteUrl) != null ? str19.equals(parentEngagement.voiceNoteUrl) : parentEngagement.voiceNoteUrl == null) && ((str20 = this.body) != null ? str20.equals(parentEngagement.body) : parentEngagement.body == null) && ((bool2 = this.isManualTask) != null ? bool2.equals(parentEngagement.isManualTask) : parentEngagement.isManualTask == null) && ((str21 = this.taskHeading) != null ? str21.equals(parentEngagement.taskHeading) : parentEngagement.taskHeading == null) && ((str22 = this.taskType) != null ? str22.equals(parentEngagement.taskType) : parentEngagement.taskType == null) && ((taskActivityType = this.taskActivityType) != null ? taskActivityType.equals(parentEngagement.taskActivityType) : parentEngagement.taskActivityType == null) && ((str23 = this.taskInputNote) != null ? str23.equals(parentEngagement.taskInputNote) : parentEngagement.taskInputNote == null) && ((str24 = this.taskPriority) != null ? str24.equals(parentEngagement.taskPriority) : parentEngagement.taskPriority == null) && ((str25 = this.taskCompletionNote) != null ? str25.equals(parentEngagement.taskCompletionNote) : parentEngagement.taskCompletionNote == null) && ((str26 = this.taskCompletionTime) != null ? str26.equals(parentEngagement.taskCompletionTime) : parentEngagement.taskCompletionTime == null) && ((str27 = this.taskCompletionType) != null ? str27.equals(parentEngagement.taskCompletionType) : parentEngagement.taskCompletionType == null) && ((str28 = this.dueDateTime) != null ? str28.equals(parentEngagement.dueDateTime) : parentEngagement.dueDateTime == null) && ((str29 = this.nextFollowUpOn) != null ? str29.equals(parentEngagement.nextFollowUpOn) : parentEngagement.nextFollowUpOn == null) && ((str30 = this.nextFollowUpSetBy) != null ? str30.equals(parentEngagement.nextFollowUpSetBy) : parentEngagement.nextFollowUpSetBy == null) && ((str31 = this.reminderDateTime) != null ? str31.equals(parentEngagement.reminderDateTime) : parentEngagement.reminderDateTime == null) && ((str32 = this.callRecordingUrl) != null ? str32.equals(parentEngagement.callRecordingUrl) : parentEngagement.callRecordingUrl == null) && ((str33 = this.callTranscriptUrl) != null ? str33.equals(parentEngagement.callTranscriptUrl) : parentEngagement.callTranscriptUrl == null) && ((str34 = this.callTranscriptSummary) != null ? str34.equals(parentEngagement.callTranscriptSummary) : parentEngagement.callTranscriptSummary == null) && ((str35 = this.uploadedFiledUrl) != null ? str35.equals(parentEngagement.uploadedFiledUrl) : parentEngagement.uploadedFiledUrl == null) && ((str36 = this.visitTime) != null ? str36.equals(parentEngagement.visitTime) : parentEngagement.visitTime == null) && ((str37 = this.visitNote) != null ? str37.equals(parentEngagement.visitNote) : parentEngagement.visitNote == null) && ((str38 = this.visitOutcome) != null ? str38.equals(parentEngagement.visitOutcome) : parentEngagement.visitOutcome == null) && ((str39 = this.visitOutcomeNature) != null ? str39.equals(parentEngagement.visitOutcomeNature) : parentEngagement.visitOutcomeNature == null) && ((str40 = this.videoCallPlatform) != null ? str40.equals(parentEngagement.videoCallPlatform) : parentEngagement.videoCallPlatform == null) && ((str41 = this.videoCallLink) != null ? str41.equals(parentEngagement.videoCallLink) : parentEngagement.videoCallLink == null) && ((str42 = this.meetingName) != null ? str42.equals(parentEngagement.meetingName) : parentEngagement.meetingName == null) && ((str43 = this.meetingCode) != null ? str43.equals(parentEngagement.meetingCode) : parentEngagement.meetingCode == null) && ((str44 = this.videoCallMetadata) != null ? str44.equals(parentEngagement.videoCallMetadata) : parentEngagement.videoCallMetadata == null) && ((str45 = this.videoCallOutcome) != null ? str45.equals(parentEngagement.videoCallOutcome) : parentEngagement.videoCallOutcome == null) && ((str46 = this.paymentDataId) != null ? str46.equals(parentEngagement.paymentDataId) : parentEngagement.paymentDataId == null) && ((str47 = this.calendarEventId) != null ? str47.equals(parentEngagement.calendarEventId) : parentEngagement.calendarEventId == null) && ((str48 = this.calendarName) != null ? str48.equals(parentEngagement.calendarName) : parentEngagement.calendarName == null) && ((str49 = this.campaignId) != null ? str49.equals(parentEngagement.campaignId) : parentEngagement.campaignId == null) && ((str50 = this.campaignRun) != null ? str50.equals(parentEngagement.campaignRun) : parentEngagement.campaignRun == null) && ((str51 = this.engagementSourceType) != null ? str51.equals(parentEngagement.engagementSourceType) : parentEngagement.engagementSourceType == null) && ((str52 = this.engagementSource) != null ? str52.equals(parentEngagement.engagementSource) : parentEngagement.engagementSource == null) && ((str53 = this.engagementSourceLevelTwo) != null ? str53.equals(parentEngagement.engagementSourceLevelTwo) : parentEngagement.engagementSourceLevelTwo == null) && ((str54 = this.systemAction) != null ? str54.equals(parentEngagement.systemAction) : parentEngagement.systemAction == null) && ((list = this.taskEngagementActions) != null ? list.equals(parentEngagement.taskEngagementActions) : parentEngagement.taskEngagementActions == null) && ((str55 = this.taskEngagementActionsUpdatedAt) != null ? str55.equals(parentEngagement.taskEngagementActionsUpdatedAt) : parentEngagement.taskEngagementActionsUpdatedAt == null) && ((str56 = this.firstTaskEngagementActionOn) != null ? str56.equals(parentEngagement.firstTaskEngagementActionOn) : parentEngagement.firstTaskEngagementActionOn == null) && ((num2 = this.taskEngagementActionCount) != null ? num2.equals(parentEngagement.taskEngagementActionCount) : parentEngagement.taskEngagementActionCount == null) && ((str57 = this.customCallOutcomeData) != null ? str57.equals(parentEngagement.customCallOutcomeData) : parentEngagement.customCallOutcomeData == null) && ((str58 = this.customVisitOutcomeData) != null ? str58.equals(parentEngagement.customVisitOutcomeData) : parentEngagement.customVisitOutcomeData == null) && ((str59 = this.customTaskCompletionData) != null ? str59.equals(parentEngagement.customTaskCompletionData) : parentEngagement.customTaskCompletionData == null) && ((str60 = this.customTaskInputData) != null ? str60.equals(parentEngagement.customTaskInputData) : parentEngagement.customTaskInputData == null) && ((str61 = this.customVideoCallInputData) != null ? str61.equals(parentEngagement.customVideoCallInputData) : parentEngagement.customVideoCallInputData == null) && ((str62 = this.deviceId) != null ? str62.equals(parentEngagement.deviceId) : parentEngagement.deviceId == null) && ((num3 = this.totalCallDuration) != null ? num3.equals(parentEngagement.totalCallDuration) : parentEngagement.totalCallDuration == null) && ((str63 = this.cloudProviderNumber) != null ? str63.equals(parentEngagement.cloudProviderNumber) : parentEngagement.cloudProviderNumber == null) && ((str64 = this.hangupReason) != null ? str64.equals(parentEngagement.hangupReason) : parentEngagement.hangupReason == null) && ((str65 = this.cloudProvider) != null ? str65.equals(parentEngagement.cloudProvider) : parentEngagement.cloudProvider == null) && ((str66 = this.callType) != null ? str66.equals(parentEngagement.callType) : parentEngagement.callType == null) && ((str67 = this.phoneCallLogId) != null ? str67.equals(parentEngagement.phoneCallLogId) : parentEngagement.phoneCallLogId == null) && ((str68 = this.externalEventRecordId) != null ? str68.equals(parentEngagement.externalEventRecordId) : parentEngagement.externalEventRecordId == null) && ((str69 = this.createdAt) != null ? str69.equals(parentEngagement.createdAt) : parentEngagement.createdAt == null)) {
                String str70 = this.updatedAt;
                String str71 = parentEngagement.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.ParentEngagement.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ParentEngagement.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ParentEngagement.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ParentEngagement.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ParentEngagement.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], ParentEngagement.this.engagementType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], ParentEngagement.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], ParentEngagement.this.primaryTeamId);
                    ResponseField responseField = responseFieldArr[6];
                    ContactAssignmentStatus contactAssignmentStatus = ParentEngagement.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], ParentEngagement.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], ParentEngagement.this.contactPrimaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], ParentEngagement.this.contactOwnerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], ParentEngagement.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], ParentEngagement.this.updatedById);
                    responseWriter.writeString(responseFieldArr[12], ParentEngagement.this.callStatus);
                    responseWriter.writeString(responseFieldArr[13], ParentEngagement.this.engagementStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], ParentEngagement.this.parentEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], ParentEngagement.this.nextStepTaskId);
                    responseWriter.writeBoolean(responseFieldArr[16], ParentEngagement.this.syncStatus);
                    responseWriter.writeString(responseFieldArr[17], ParentEngagement.this.externalNumber);
                    responseWriter.writeString(responseFieldArr[18], ParentEngagement.this.userNumber);
                    ResponseField responseField2 = responseFieldArr[19];
                    CallDirection callDirection = ParentEngagement.this.callDirection;
                    responseWriter.writeString(responseField2, callDirection != null ? callDirection.name() : null);
                    ResponseField responseField3 = responseFieldArr[20];
                    CallConnectStatus callConnectStatus = ParentEngagement.this.callConnectStatus;
                    responseWriter.writeString(responseField3, callConnectStatus != null ? callConnectStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], ParentEngagement.this.callStartTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], ParentEngagement.this.callEndTime);
                    responseWriter.writeInt(responseFieldArr[23], ParentEngagement.this.durationInMillis);
                    responseWriter.writeString(responseFieldArr[24], ParentEngagement.this.callOutcome);
                    responseWriter.writeString(responseFieldArr[25], ParentEngagement.this.callOutcomeNature);
                    responseWriter.writeString(responseFieldArr[26], ParentEngagement.this.callRecordingExternalResource);
                    responseWriter.writeString(responseFieldArr[27], ParentEngagement.this.noteHeading);
                    ResponseField responseField4 = responseFieldArr[28];
                    NoteAdditionMethod noteAdditionMethod = ParentEngagement.this.noteAdditionMethod;
                    responseWriter.writeString(responseField4, noteAdditionMethod != null ? noteAdditionMethod.name() : null);
                    responseWriter.writeString(responseFieldArr[29], ParentEngagement.this.voiceNoteUrl);
                    responseWriter.writeString(responseFieldArr[30], ParentEngagement.this.body);
                    responseWriter.writeBoolean(responseFieldArr[31], ParentEngagement.this.isManualTask);
                    responseWriter.writeString(responseFieldArr[32], ParentEngagement.this.taskHeading);
                    responseWriter.writeString(responseFieldArr[33], ParentEngagement.this.taskType);
                    ResponseField responseField5 = responseFieldArr[34];
                    TaskActivityType taskActivityType = ParentEngagement.this.taskActivityType;
                    responseWriter.writeString(responseField5, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeString(responseFieldArr[35], ParentEngagement.this.taskInputNote);
                    responseWriter.writeString(responseFieldArr[36], ParentEngagement.this.taskPriority);
                    responseWriter.writeString(responseFieldArr[37], ParentEngagement.this.taskCompletionNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], ParentEngagement.this.taskCompletionTime);
                    responseWriter.writeString(responseFieldArr[39], ParentEngagement.this.taskCompletionType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[40], ParentEngagement.this.dueDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[41], ParentEngagement.this.nextFollowUpOn);
                    responseWriter.writeString(responseFieldArr[42], ParentEngagement.this.nextFollowUpSetBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[43], ParentEngagement.this.reminderDateTime);
                    responseWriter.writeString(responseFieldArr[44], ParentEngagement.this.callRecordingUrl);
                    responseWriter.writeString(responseFieldArr[45], ParentEngagement.this.callTranscriptUrl);
                    responseWriter.writeString(responseFieldArr[46], ParentEngagement.this.callTranscriptSummary);
                    responseWriter.writeString(responseFieldArr[47], ParentEngagement.this.uploadedFiledUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[48], ParentEngagement.this.visitTime);
                    responseWriter.writeString(responseFieldArr[49], ParentEngagement.this.visitNote);
                    responseWriter.writeString(responseFieldArr[50], ParentEngagement.this.visitOutcome);
                    responseWriter.writeString(responseFieldArr[51], ParentEngagement.this.visitOutcomeNature);
                    responseWriter.writeString(responseFieldArr[52], ParentEngagement.this.videoCallPlatform);
                    responseWriter.writeString(responseFieldArr[53], ParentEngagement.this.videoCallLink);
                    responseWriter.writeString(responseFieldArr[54], ParentEngagement.this.meetingName);
                    responseWriter.writeString(responseFieldArr[55], ParentEngagement.this.meetingCode);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], ParentEngagement.this.videoCallMetadata);
                    responseWriter.writeString(responseFieldArr[57], ParentEngagement.this.videoCallOutcome);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], ParentEngagement.this.paymentDataId);
                    responseWriter.writeString(responseFieldArr[59], ParentEngagement.this.calendarEventId);
                    responseWriter.writeString(responseFieldArr[60], ParentEngagement.this.calendarName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[61], ParentEngagement.this.campaignId);
                    responseWriter.writeString(responseFieldArr[62], ParentEngagement.this.campaignRun);
                    responseWriter.writeString(responseFieldArr[63], ParentEngagement.this.engagementSourceType);
                    responseWriter.writeString(responseFieldArr[64], ParentEngagement.this.engagementSource);
                    responseWriter.writeString(responseFieldArr[65], ParentEngagement.this.engagementSourceLevelTwo);
                    responseWriter.writeString(responseFieldArr[66], ParentEngagement.this.systemAction);
                    responseWriter.writeList(responseFieldArr[67], ParentEngagement.this.taskEngagementActions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.ParentEngagement.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[68], ParentEngagement.this.taskEngagementActionsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[69], ParentEngagement.this.firstTaskEngagementActionOn);
                    responseWriter.writeInt(responseFieldArr[70], ParentEngagement.this.taskEngagementActionCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[71], ParentEngagement.this.customCallOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], ParentEngagement.this.customVisitOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], ParentEngagement.this.customTaskCompletionData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[74], ParentEngagement.this.customTaskInputData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[75], ParentEngagement.this.customVideoCallInputData);
                    responseWriter.writeString(responseFieldArr[76], ParentEngagement.this.deviceId);
                    responseWriter.writeInt(responseFieldArr[77], ParentEngagement.this.totalCallDuration);
                    responseWriter.writeString(responseFieldArr[78], ParentEngagement.this.cloudProviderNumber);
                    responseWriter.writeString(responseFieldArr[79], ParentEngagement.this.hangupReason);
                    responseWriter.writeString(responseFieldArr[80], ParentEngagement.this.cloudProvider);
                    responseWriter.writeString(responseFieldArr[81], ParentEngagement.this.callType);
                    responseWriter.writeString(responseFieldArr[82], ParentEngagement.this.phoneCallLogId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[83], ParentEngagement.this.externalEventRecordId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[84], ParentEngagement.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[85], ParentEngagement.this.updatedAt);
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
                this.$toString = "ParentEngagement{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", engagementType=" + this.engagementType + ", contactId=" + this.contactId + ", primaryTeamId=" + this.primaryTeamId + ", toBeAssigned=" + this.toBeAssigned + ", ownerId=" + this.ownerId + ", contactPrimaryTeamId=" + this.contactPrimaryTeamId + ", contactOwnerId=" + this.contactOwnerId + ", addedById=" + this.addedById + ", updatedById=" + this.updatedById + ", callStatus=" + this.callStatus + ", engagementStatus=" + this.engagementStatus + ", parentEngagementId=" + this.parentEngagementId + ", nextStepTaskId=" + this.nextStepTaskId + ", syncStatus=" + this.syncStatus + ", externalNumber=" + this.externalNumber + ", userNumber=" + this.userNumber + ", callDirection=" + this.callDirection + ", callConnectStatus=" + this.callConnectStatus + ", callStartTime=" + this.callStartTime + ", callEndTime=" + this.callEndTime + ", durationInMillis=" + this.durationInMillis + ", callOutcome=" + this.callOutcome + ", callOutcomeNature=" + this.callOutcomeNature + ", callRecordingExternalResource=" + this.callRecordingExternalResource + ", noteHeading=" + this.noteHeading + ", noteAdditionMethod=" + this.noteAdditionMethod + ", voiceNoteUrl=" + this.voiceNoteUrl + ", body=" + this.body + ", isManualTask=" + this.isManualTask + ", taskHeading=" + this.taskHeading + ", taskType=" + this.taskType + ", taskActivityType=" + this.taskActivityType + ", taskInputNote=" + this.taskInputNote + ", taskPriority=" + this.taskPriority + ", taskCompletionNote=" + this.taskCompletionNote + ", taskCompletionTime=" + this.taskCompletionTime + ", taskCompletionType=" + this.taskCompletionType + ", dueDateTime=" + this.dueDateTime + ", nextFollowUpOn=" + this.nextFollowUpOn + ", nextFollowUpSetBy=" + this.nextFollowUpSetBy + ", reminderDateTime=" + this.reminderDateTime + ", callRecordingUrl=" + this.callRecordingUrl + ", callTranscriptUrl=" + this.callTranscriptUrl + ", callTranscriptSummary=" + this.callTranscriptSummary + ", uploadedFiledUrl=" + this.uploadedFiledUrl + ", visitTime=" + this.visitTime + ", visitNote=" + this.visitNote + ", visitOutcome=" + this.visitOutcome + ", visitOutcomeNature=" + this.visitOutcomeNature + ", videoCallPlatform=" + this.videoCallPlatform + ", videoCallLink=" + this.videoCallLink + ", meetingName=" + this.meetingName + ", meetingCode=" + this.meetingCode + ", videoCallMetadata=" + this.videoCallMetadata + ", videoCallOutcome=" + this.videoCallOutcome + ", paymentDataId=" + this.paymentDataId + ", calendarEventId=" + this.calendarEventId + ", calendarName=" + this.calendarName + ", campaignId=" + this.campaignId + ", campaignRun=" + this.campaignRun + ", engagementSourceType=" + this.engagementSourceType + ", engagementSource=" + this.engagementSource + ", engagementSourceLevelTwo=" + this.engagementSourceLevelTwo + ", systemAction=" + this.systemAction + ", taskEngagementActions=" + this.taskEngagementActions + ", taskEngagementActionsUpdatedAt=" + this.taskEngagementActionsUpdatedAt + ", firstTaskEngagementActionOn=" + this.firstTaskEngagementActionOn + ", taskEngagementActionCount=" + this.taskEngagementActionCount + ", customCallOutcomeData=" + this.customCallOutcomeData + ", customVisitOutcomeData=" + this.customVisitOutcomeData + ", customTaskCompletionData=" + this.customTaskCompletionData + ", customTaskInputData=" + this.customTaskInputData + ", customVideoCallInputData=" + this.customVideoCallInputData + ", deviceId=" + this.deviceId + ", totalCallDuration=" + this.totalCallDuration + ", cloudProviderNumber=" + this.cloudProviderNumber + ", hangupReason=" + this.hangupReason + ", cloudProvider=" + this.cloudProvider + ", callType=" + this.callType + ", phoneCallLogId=" + this.phoneCallLogId + ", externalEventRecordId=" + this.externalEventRecordId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class PaymentData {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Integer amount;
        final Integer amountPaid;
        final String contactId;
        final String createdAt;
        final String createdById;
        final String currency;
        final String customPaymentData;
        final String engagementId;
        final String finalPaymentDate;
        final String id;
        final String lastPaymentStatus;
        final String note;
        final String orderId;
        final String orderIdInPaymentProvider;
        final List<String> paidByContactIds;
        final String paymentLinkId;
        final String paymentLinkUrl;
        final String paymentProvider;
        final String paymentRequestType;
        final String status;
        final List<String> transactionId;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<PaymentData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public PaymentData map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = PaymentData.$responseFields;
                return new PaymentData(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readInt(responseFieldArr[11]), responseReader.readInt(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readList(responseFieldArr[17], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.PaymentData.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.PaymentData.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentRequestType", "paymentRequestType", null, true, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentProvider", "paymentProvider", null, true, Collections.emptyList()), ResponseField.forString("orderIdInPaymentProvider", "orderIdInPaymentProvider", null, true, Collections.emptyList()), ResponseField.forCustomType("orderId", "orderId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("paymentLinkId", "paymentLinkId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentLinkUrl", "paymentLinkUrl", null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forInt("amountPaid", "amountPaid", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("finalPaymentDate", "finalPaymentDate", null, true, customType2, Collections.emptyList()), ResponseField.forList("paidByContactIds", "paidByContactIds", null, true, Collections.emptyList()), ResponseField.forList("transactionId", "transactionId", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("customPaymentData", "customPaymentData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public PaymentData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, String str12, String str13, String str14, String str15, List<String> list, List<String> list2, String str16, String str17, String str18, String str19, String str20, String str21) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.contactId = str4;
            this.paymentRequestType = str5;
            this.engagementId = str6;
            this.paymentProvider = str7;
            this.orderIdInPaymentProvider = str8;
            this.orderId = str9;
            this.paymentLinkId = str10;
            this.paymentLinkUrl = str11;
            this.amount = num;
            this.amountPaid = num2;
            this.currency = str12;
            this.status = str13;
            this.lastPaymentStatus = str14;
            this.finalPaymentDate = str15;
            this.paidByContactIds = list;
            this.transactionId = list2;
            this.note = str16;
            this.createdAt = str17;
            this.updatedAt = str18;
            this.customPaymentData = str19;
            this.createdById = str20;
            this.updatedById = str21;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Integer amount() {
            return this.amount;
        }

        public Integer amountPaid() {
            return this.amountPaid;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String currency() {
            return this.currency;
        }

        public String customPaymentData() {
            return this.customPaymentData;
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
            Integer num;
            Integer num2;
            String str9;
            String str10;
            String str11;
            String str12;
            List<String> list;
            List<String> list2;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PaymentData)) {
                return false;
            }
            PaymentData paymentData = (PaymentData) obj;
            if (this.__typename.equals(paymentData.__typename) && this.id.equals(paymentData.id) && this.accountId.equals(paymentData.accountId) && ((str = this.contactId) != null ? str.equals(paymentData.contactId) : paymentData.contactId == null) && ((str2 = this.paymentRequestType) != null ? str2.equals(paymentData.paymentRequestType) : paymentData.paymentRequestType == null) && ((str3 = this.engagementId) != null ? str3.equals(paymentData.engagementId) : paymentData.engagementId == null) && ((str4 = this.paymentProvider) != null ? str4.equals(paymentData.paymentProvider) : paymentData.paymentProvider == null) && ((str5 = this.orderIdInPaymentProvider) != null ? str5.equals(paymentData.orderIdInPaymentProvider) : paymentData.orderIdInPaymentProvider == null) && ((str6 = this.orderId) != null ? str6.equals(paymentData.orderId) : paymentData.orderId == null) && ((str7 = this.paymentLinkId) != null ? str7.equals(paymentData.paymentLinkId) : paymentData.paymentLinkId == null) && ((str8 = this.paymentLinkUrl) != null ? str8.equals(paymentData.paymentLinkUrl) : paymentData.paymentLinkUrl == null) && ((num = this.amount) != null ? num.equals(paymentData.amount) : paymentData.amount == null) && ((num2 = this.amountPaid) != null ? num2.equals(paymentData.amountPaid) : paymentData.amountPaid == null) && ((str9 = this.currency) != null ? str9.equals(paymentData.currency) : paymentData.currency == null) && ((str10 = this.status) != null ? str10.equals(paymentData.status) : paymentData.status == null) && ((str11 = this.lastPaymentStatus) != null ? str11.equals(paymentData.lastPaymentStatus) : paymentData.lastPaymentStatus == null) && ((str12 = this.finalPaymentDate) != null ? str12.equals(paymentData.finalPaymentDate) : paymentData.finalPaymentDate == null) && ((list = this.paidByContactIds) != null ? list.equals(paymentData.paidByContactIds) : paymentData.paidByContactIds == null) && ((list2 = this.transactionId) != null ? list2.equals(paymentData.transactionId) : paymentData.transactionId == null) && ((str13 = this.note) != null ? str13.equals(paymentData.note) : paymentData.note == null) && ((str14 = this.createdAt) != null ? str14.equals(paymentData.createdAt) : paymentData.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(paymentData.updatedAt) : paymentData.updatedAt == null) && ((str16 = this.customPaymentData) != null ? str16.equals(paymentData.customPaymentData) : paymentData.customPaymentData == null) && ((str17 = this.createdById) != null ? str17.equals(paymentData.createdById) : paymentData.createdById == null)) {
                String str18 = this.updatedById;
                String str19 = paymentData.updatedById;
                if (str18 == null) {
                    if (str19 == null) {
                        return true;
                    }
                } else if (str18.equals(str19)) {
                    return true;
                }
            }
            return false;
        }

        public String finalPaymentDate() {
            return this.finalPaymentDate;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.paymentRequestType;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.engagementId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.paymentProvider;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.orderIdInPaymentProvider;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.orderId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.paymentLinkId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.paymentLinkUrl;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                Integer num = this.amount;
                int iHashCode10 = (iHashCode9 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.amountPaid;
                int iHashCode11 = (iHashCode10 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str9 = this.currency;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.status;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.lastPaymentStatus;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.finalPaymentDate;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                List<String> list = this.paidByContactIds;
                int iHashCode16 = (iHashCode15 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.transactionId;
                int iHashCode17 = (iHashCode16 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str13 = this.note;
                int iHashCode18 = (iHashCode17 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode19 = (iHashCode18 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                int iHashCode20 = (iHashCode19 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.customPaymentData;
                int iHashCode21 = (iHashCode20 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdById;
                int iHashCode22 = (iHashCode21 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedById;
                this.$hashCode = iHashCode22 ^ (str18 != null ? str18.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastPaymentStatus() {
            return this.lastPaymentStatus;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.PaymentData.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = PaymentData.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], PaymentData.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], PaymentData.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], PaymentData.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], PaymentData.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], PaymentData.this.paymentRequestType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], PaymentData.this.engagementId);
                    responseWriter.writeString(responseFieldArr[6], PaymentData.this.paymentProvider);
                    responseWriter.writeString(responseFieldArr[7], PaymentData.this.orderIdInPaymentProvider);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], PaymentData.this.orderId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], PaymentData.this.paymentLinkId);
                    responseWriter.writeString(responseFieldArr[10], PaymentData.this.paymentLinkUrl);
                    responseWriter.writeInt(responseFieldArr[11], PaymentData.this.amount);
                    responseWriter.writeInt(responseFieldArr[12], PaymentData.this.amountPaid);
                    responseWriter.writeString(responseFieldArr[13], PaymentData.this.currency);
                    responseWriter.writeString(responseFieldArr[14], PaymentData.this.status);
                    responseWriter.writeString(responseFieldArr[15], PaymentData.this.lastPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], PaymentData.this.finalPaymentDate);
                    responseWriter.writeList(responseFieldArr[17], PaymentData.this.paidByContactIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.PaymentData.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[18], PaymentData.this.transactionId, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.PaymentData.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[19], PaymentData.this.note);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], PaymentData.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], PaymentData.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], PaymentData.this.customPaymentData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], PaymentData.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], PaymentData.this.updatedById);
                }
            };
        }

        public String note() {
            return this.note;
        }

        public String orderId() {
            return this.orderId;
        }

        public String orderIdInPaymentProvider() {
            return this.orderIdInPaymentProvider;
        }

        public List<String> paidByContactIds() {
            return this.paidByContactIds;
        }

        public String paymentLinkId() {
            return this.paymentLinkId;
        }

        public String paymentLinkUrl() {
            return this.paymentLinkUrl;
        }

        public String paymentProvider() {
            return this.paymentProvider;
        }

        public String paymentRequestType() {
            return this.paymentRequestType;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PaymentData{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", paymentRequestType=" + this.paymentRequestType + ", engagementId=" + this.engagementId + ", paymentProvider=" + this.paymentProvider + ", orderIdInPaymentProvider=" + this.orderIdInPaymentProvider + ", orderId=" + this.orderId + ", paymentLinkId=" + this.paymentLinkId + ", paymentLinkUrl=" + this.paymentLinkUrl + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", currency=" + this.currency + ", status=" + this.status + ", lastPaymentStatus=" + this.lastPaymentStatus + ", finalPaymentDate=" + this.finalPaymentDate + ", paidByContactIds=" + this.paidByContactIds + ", transactionId=" + this.transactionId + ", note=" + this.note + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", customPaymentData=" + this.customPaymentData + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public List<String> transactionId() {
            return this.transactionId;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.PrimaryTeam.1
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

    public static class TaskLocation {
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

        public static final class Mapper implements ResponseFieldMapper<TaskLocation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public TaskLocation map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = TaskLocation.$responseFields;
                return new TaskLocation(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]));
            }
        }

        public TaskLocation(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof TaskLocation)) {
                return false;
            }
            TaskLocation taskLocation = (TaskLocation) obj;
            if (this.__typename.equals(taskLocation.__typename) && ((str = this.addressType) != null ? str.equals(taskLocation.addressType) : taskLocation.addressType == null) && ((str2 = this.establishmentName) != null ? str2.equals(taskLocation.establishmentName) : taskLocation.establishmentName == null) && ((str3 = this.area) != null ? str3.equals(taskLocation.area) : taskLocation.area == null) && ((str4 = this.city) != null ? str4.equals(taskLocation.city) : taskLocation.city == null) && ((str5 = this.country) != null ? str5.equals(taskLocation.country) : taskLocation.country == null) && ((str6 = this.googlePlaceId) != null ? str6.equals(taskLocation.googlePlaceId) : taskLocation.googlePlaceId == null) && ((bool = this.isPrimaryAddress) != null ? bool.equals(taskLocation.isPrimaryAddress) : taskLocation.isPrimaryAddress == null) && ((str7 = this.landmark) != null ? str7.equals(taskLocation.landmark) : taskLocation.landmark == null) && ((str8 = this.lat) != null ? str8.equals(taskLocation.lat) : taskLocation.lat == null) && ((str9 = this.lng) != null ? str9.equals(taskLocation.lng) : taskLocation.lng == null) && ((str10 = this.rawAddressText) != null ? str10.equals(taskLocation.rawAddressText) : taskLocation.rawAddressText == null) && ((str11 = this.region) != null ? str11.equals(taskLocation.region) : taskLocation.region == null) && ((str12 = this.state) != null ? str12.equals(taskLocation.state) : taskLocation.state == null) && ((str13 = this.streetAddress) != null ? str13.equals(taskLocation.streetAddress) : taskLocation.streetAddress == null)) {
                String str14 = this.zipcode;
                String str15 = taskLocation.zipcode;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.TaskLocation.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = TaskLocation.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], TaskLocation.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], TaskLocation.this.addressType);
                    responseWriter.writeString(responseFieldArr[2], TaskLocation.this.establishmentName);
                    responseWriter.writeString(responseFieldArr[3], TaskLocation.this.area);
                    responseWriter.writeString(responseFieldArr[4], TaskLocation.this.city);
                    responseWriter.writeString(responseFieldArr[5], TaskLocation.this.country);
                    responseWriter.writeString(responseFieldArr[6], TaskLocation.this.googlePlaceId);
                    responseWriter.writeBoolean(responseFieldArr[7], TaskLocation.this.isPrimaryAddress);
                    responseWriter.writeString(responseFieldArr[8], TaskLocation.this.landmark);
                    responseWriter.writeString(responseFieldArr[9], TaskLocation.this.lat);
                    responseWriter.writeString(responseFieldArr[10], TaskLocation.this.lng);
                    responseWriter.writeString(responseFieldArr[11], TaskLocation.this.rawAddressText);
                    responseWriter.writeString(responseFieldArr[12], TaskLocation.this.region);
                    responseWriter.writeString(responseFieldArr[13], TaskLocation.this.state);
                    responseWriter.writeString(responseFieldArr[14], TaskLocation.this.streetAddress);
                    responseWriter.writeString(responseFieldArr[15], TaskLocation.this.zipcode);
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
                this.$toString = "TaskLocation{__typename=" + this.__typename + ", addressType=" + this.addressType + ", establishmentName=" + this.establishmentName + ", area=" + this.area + ", city=" + this.city + ", country=" + this.country + ", googlePlaceId=" + this.googlePlaceId + ", isPrimaryAddress=" + this.isPrimaryAddress + ", landmark=" + this.landmark + ", lat=" + this.lat + ", lng=" + this.lng + ", rawAddressText=" + this.rawAddressText + ", region=" + this.region + ", state=" + this.state + ", streetAddress=" + this.streetAddress + ", zipcode=" + this.zipcode + "}";
            }
            return this.$toString;
        }

        public String zipcode() {
            return this.zipcode;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.UpdatedBy.1
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
        private final String engagementSource;
        private final String ownerId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2, String str3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.ownerId = str2;
            this.engagementSource = str3;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("ownerId", str2);
            linkedHashMap.put("engagementSource", str3);
        }

        public String accountId() {
            return this.accountId;
        }

        public String engagementSource() {
            return this.engagementSource;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("ownerId", Variables.this.ownerId);
                    inputFieldWriter.writeString("engagementSource", Variables.this.engagementSource);
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

    public static class VisitLocation {
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

        public static final class Mapper implements ResponseFieldMapper<VisitLocation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public VisitLocation map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = VisitLocation.$responseFields;
                return new VisitLocation(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]));
            }
        }

        public VisitLocation(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof VisitLocation)) {
                return false;
            }
            VisitLocation visitLocation = (VisitLocation) obj;
            if (this.__typename.equals(visitLocation.__typename) && ((str = this.addressType) != null ? str.equals(visitLocation.addressType) : visitLocation.addressType == null) && ((str2 = this.establishmentName) != null ? str2.equals(visitLocation.establishmentName) : visitLocation.establishmentName == null) && ((str3 = this.area) != null ? str3.equals(visitLocation.area) : visitLocation.area == null) && ((str4 = this.city) != null ? str4.equals(visitLocation.city) : visitLocation.city == null) && ((str5 = this.country) != null ? str5.equals(visitLocation.country) : visitLocation.country == null) && ((str6 = this.googlePlaceId) != null ? str6.equals(visitLocation.googlePlaceId) : visitLocation.googlePlaceId == null) && ((bool = this.isPrimaryAddress) != null ? bool.equals(visitLocation.isPrimaryAddress) : visitLocation.isPrimaryAddress == null) && ((str7 = this.landmark) != null ? str7.equals(visitLocation.landmark) : visitLocation.landmark == null) && ((str8 = this.lat) != null ? str8.equals(visitLocation.lat) : visitLocation.lat == null) && ((str9 = this.lng) != null ? str9.equals(visitLocation.lng) : visitLocation.lng == null) && ((str10 = this.rawAddressText) != null ? str10.equals(visitLocation.rawAddressText) : visitLocation.rawAddressText == null) && ((str11 = this.region) != null ? str11.equals(visitLocation.region) : visitLocation.region == null) && ((str12 = this.state) != null ? str12.equals(visitLocation.state) : visitLocation.state == null) && ((str13 = this.streetAddress) != null ? str13.equals(visitLocation.streetAddress) : visitLocation.streetAddress == null)) {
                String str14 = this.zipcode;
                String str15 = visitLocation.zipcode;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateEngagementUserLevelSubscription.VisitLocation.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = VisitLocation.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], VisitLocation.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], VisitLocation.this.addressType);
                    responseWriter.writeString(responseFieldArr[2], VisitLocation.this.establishmentName);
                    responseWriter.writeString(responseFieldArr[3], VisitLocation.this.area);
                    responseWriter.writeString(responseFieldArr[4], VisitLocation.this.city);
                    responseWriter.writeString(responseFieldArr[5], VisitLocation.this.country);
                    responseWriter.writeString(responseFieldArr[6], VisitLocation.this.googlePlaceId);
                    responseWriter.writeBoolean(responseFieldArr[7], VisitLocation.this.isPrimaryAddress);
                    responseWriter.writeString(responseFieldArr[8], VisitLocation.this.landmark);
                    responseWriter.writeString(responseFieldArr[9], VisitLocation.this.lat);
                    responseWriter.writeString(responseFieldArr[10], VisitLocation.this.lng);
                    responseWriter.writeString(responseFieldArr[11], VisitLocation.this.rawAddressText);
                    responseWriter.writeString(responseFieldArr[12], VisitLocation.this.region);
                    responseWriter.writeString(responseFieldArr[13], VisitLocation.this.state);
                    responseWriter.writeString(responseFieldArr[14], VisitLocation.this.streetAddress);
                    responseWriter.writeString(responseFieldArr[15], VisitLocation.this.zipcode);
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
                this.$toString = "VisitLocation{__typename=" + this.__typename + ", addressType=" + this.addressType + ", establishmentName=" + this.establishmentName + ", area=" + this.area + ", city=" + this.city + ", country=" + this.country + ", googlePlaceId=" + this.googlePlaceId + ", isPrimaryAddress=" + this.isPrimaryAddress + ", landmark=" + this.landmark + ", lat=" + this.lat + ", lng=" + this.lng + ", rawAddressText=" + this.rawAddressText + ", region=" + this.region + ", state=" + this.state + ", streetAddress=" + this.streetAddress + ", zipcode=" + this.zipcode + "}";
            }
            return this.$toString;
        }

        public String zipcode() {
            return this.zipcode;
        }
    }

    public OnUpdateEngagementUserLevelSubscription(String str, String str2, String str3) {
        Utils.checkNotNull(str, "accountId == null");
        Utils.checkNotNull(str2, "ownerId == null");
        Utils.checkNotNull(str3, "engagementSource == null");
        this.variables = new Variables(str, str2, str3);
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
        return "13744883ae5ed6538406ea371843d098e5abe40ee89d2c9d2da8bcfffc760245";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnUpdateEngagementUserLevel($accountId: ID!, $ownerId: ID!, $engagementSource: ID!) {\n  onUpdateEngagementUserLevel(accountId: $accountId, ownerId: $ownerId, engagementSource: $engagementSource) {\n    __typename\n    id\n    accountId\n    engagementType\n    contactId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    toBeAssigned\n    ownerId\n    contactPrimaryTeamId\n    contactOwnerId\n    addedById\n    updatedById\n    callStatus\n    engagementStatus\n    parentEngagementId\n    nextStepTaskId\n    syncStatus\n    externalNumber\n    userNumber\n    callDirection\n    callConnectStatus\n    callStartTime\n    callEndTime\n    durationInMillis\n    callOutcome\n    callOutcomeNature\n    callRecordingExternalResource\n    noteHeading\n    noteAdditionMethod\n    voiceNoteUrl\n    body\n    isManualTask\n    taskHeading\n    taskType\n    taskActivityType\n    taskInputNote\n    taskPriority\n    taskCompletionNote\n    taskCompletionTime\n    taskCompletionType\n    dueDateTime\n    nextFollowUpOn\n    nextFollowUpSetBy\n    reminderDateTime\n    taskLocation {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    callRecordingUrl\n    callTranscriptUrl\n    callTranscriptSummary\n    uploadedFiledUrl\n    visitLocation {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    visitTime\n    visitNote\n    visitOutcome\n    visitOutcomeNature\n    videoCallPlatform\n    videoCallLink\n    meetingName\n    meetingCode\n    videoCallMetadata\n    videoCallOutcome\n    meetingParticipants {\n      __typename\n      id\n      name\n      startTime\n      endTime\n    }\n    paymentDataId\n    calendarEventId\n    calendarName\n    campaignId\n    campaignRun\n    engagementSourceType\n    engagementSource\n    engagementSourceLevelTwo\n    systemAction\n    taskEngagementActions\n    taskEngagementActionsUpdatedAt\n    firstTaskEngagementActionOn\n    taskEngagementActionCount\n    customCallOutcomeData\n    customVisitOutcomeData\n    customTaskCompletionData\n    customTaskInputData\n    customVideoCallInputData\n    deviceId\n    totalCallDuration\n    cloudProviderNumber\n    hangupReason\n    cloudProvider\n    callType\n    phoneCallLogId\n    externalEventRecordId\n    createdAt\n    updatedAt\n    externalEventRecord {\n      __typename\n      id\n      accountId\n      externalSourceId\n      externalSourceType\n      engagementId\n      userId\n      contactId\n      contactName\n      primaryParticipantEmailId\n      primaryParticipantName\n      recordingUrl\n      transcriptUrl\n      rawEvent\n      message\n      status\n      eventSummary\n      eventDescription\n      eventUrl\n      eventStartTime\n      eventEndTime\n      createdAt\n      updatedAt\n    }\n    parentEngagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    childEngagements {\n      __typename\n      nextToken\n      startedAt\n    }\n    nextStepTask {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    paymentData {\n      __typename\n      id\n      accountId\n      contactId\n      paymentRequestType\n      engagementId\n      paymentProvider\n      orderIdInPaymentProvider\n      orderId\n      paymentLinkId\n      paymentLinkUrl\n      amount\n      amountPaid\n      currency\n      status\n      lastPaymentStatus\n      finalPaymentDate\n      paidByContactIds\n      transactionId\n      note\n      createdAt\n      updatedAt\n      customPaymentData\n      createdById\n      updatedById\n    }\n    engagementUpdate {\n      __typename\n      nextToken\n    }\n    locations {\n      __typename\n      nextToken\n    }\n    linkedFiles {\n      __typename\n      nextToken\n    }\n    comments {\n      __typename\n      nextToken\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    campaign {\n      __typename\n      id\n      accountId\n      name\n      description\n      distributedEntityType\n      ifOwnerExists\n      assignLeadOwnerToTask\n      remeberAssigneeInDistributionScope\n      remeberAssigneeInGlobalScope\n      ownerId\n      distributionCreationType\n      createdAt\n      updatedAt\n    }\n    linkedCampaign {\n      __typename\n      id\n      accountId\n      name\n      description\n      campaignCategory\n      campaignSubCategory\n      campaignType\n      campaignChannelIdentifier\n      campaignData\n      campaignRunFrequencyUnit\n      campaignRunFrequencyValue\n      startDateOfRun\n      endDateOfRun\n      durationOfRunInDays\n      daysToSend\n      ownerId\n      primaryTeamId\n      status\n      systemPauseReason\n      associatedEntityListId\n      includeHistoricalMemberships\n      allowMultiple\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      tags\n      leadLimit\n      createdAt\n      updatedAt\n    }\n    engagementOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
