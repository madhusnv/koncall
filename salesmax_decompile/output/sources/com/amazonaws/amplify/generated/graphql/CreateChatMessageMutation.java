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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.AddedSourceType;
import type.CallDirection;
import type.ContactAssignmentStatus;
import type.ContactStatus;
import type.CreateChatMessageInput;
import type.CustomType;
import type.Day;
import type.HasParent;
import type.LeadLifecycleStage;
import type.LeadLifecycleStageSubCategory;
import type.MentionedEntityType;
import type.MessageSendCategory;
import type.ModelChatMessageConditionInput;
import type.ScopeLevel;
import type.Seniority;
import type.TaskActivityType;
import type.UserRegistrationStatus;

/* loaded from: classes6.dex */
public final class CreateChatMessageMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateChatMessage($input: CreateChatMessageInput!, $condition: ModelChatMessageConditionInput) {\n  createChatMessage(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    messagePlatform\n    externalMessageReferenceId\n    externalConversationId\n    recipientExternalId\n    recipientExternalIdType\n    channelId\n    contactId\n    visitorId\n    referredContactId\n    messageType\n    messageSubType\n    messageCategory\n    messageSendCategory\n    replyingToMessageId\n    replyingToMessageIdExternal\n    responseMessageId\n    followUpType\n    replyType\n    replyTypeId\n    referredProductCatalogId\n    referredProductRetailerId\n    productItems {\n      __typename\n      product_retailer_id\n      quantity\n      item_price\n      currency\n    }\n    referral\n    isStarred\n    status\n    errorMessages\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    externalTemplateCategory\n    text\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    headerText\n    footerText\n    headerType\n    actionInteractive {\n      __typename\n      actionName\n      display_text\n      ctaUrl\n      addressCountry\n      savedAddresses\n      button\n      catalog_id\n      product_retailer_id\n      flow_mode\n      flow_message_version\n      flow_token\n      flow_id\n      flow_cta\n      flow_action\n    }\n    buttons {\n      __typename\n      waType\n      waText\n      waUrl\n      waNumber\n      flow_id\n      flow_json\n      flow_action\n      navigate_screen\n    }\n    parameters {\n      __typename\n      taType\n      sub_type\n      index\n    }\n    mediaObjectId\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatBotId\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    directChatUserId\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    linkedEngagementIdIfBroadcast\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n    responseMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n    media {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    referredContact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    chatUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateChatMessage";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateChatMessage($input: CreateChatMessageInput!, $condition: ModelChatMessageConditionInput) {\n  createChatMessage(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    messagePlatform\n    externalMessageReferenceId\n    externalConversationId\n    recipientExternalId\n    recipientExternalIdType\n    channelId\n    contactId\n    visitorId\n    referredContactId\n    messageType\n    messageSubType\n    messageCategory\n    messageSendCategory\n    replyingToMessageId\n    replyingToMessageIdExternal\n    responseMessageId\n    followUpType\n    replyType\n    replyTypeId\n    referredProductCatalogId\n    referredProductRetailerId\n    productItems {\n      __typename\n      product_retailer_id\n      quantity\n      item_price\n      currency\n    }\n    referral\n    isStarred\n    status\n    errorMessages\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    externalTemplateCategory\n    text\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    headerText\n    footerText\n    headerType\n    actionInteractive {\n      __typename\n      actionName\n      display_text\n      ctaUrl\n      addressCountry\n      savedAddresses\n      button\n      catalog_id\n      product_retailer_id\n      flow_mode\n      flow_message_version\n      flow_token\n      flow_id\n      flow_cta\n      flow_action\n    }\n    buttons {\n      __typename\n      waType\n      waText\n      waUrl\n      waNumber\n      flow_id\n      flow_json\n      flow_action\n      navigate_screen\n    }\n    parameters {\n      __typename\n      taType\n      sub_type\n      index\n    }\n    mediaObjectId\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatBotId\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    directChatUserId\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    linkedEngagementIdIfBroadcast\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n    responseMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n    media {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    referredContact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    chatUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static class ActionInteractive {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("actionName", "actionName", null, true, Collections.emptyList()), ResponseField.forString("display_text", "display_text", null, true, Collections.emptyList()), ResponseField.forCustomType("ctaUrl", "ctaUrl", null, true, CustomType.AWSURL, Collections.emptyList()), ResponseField.forString("addressCountry", "addressCountry", null, true, Collections.emptyList()), ResponseField.forList("savedAddresses", "savedAddresses", null, true, Collections.emptyList()), ResponseField.forString("button", "button", null, true, Collections.emptyList()), ResponseField.forString("catalog_id", "catalog_id", null, true, Collections.emptyList()), ResponseField.forString("product_retailer_id", "product_retailer_id", null, true, Collections.emptyList()), ResponseField.forString("flow_mode", "flow_mode", null, true, Collections.emptyList()), ResponseField.forString("flow_message_version", "flow_message_version", null, true, Collections.emptyList()), ResponseField.forString("flow_token", "flow_token", null, true, Collections.emptyList()), ResponseField.forString("flow_id", "flow_id", null, true, Collections.emptyList()), ResponseField.forString("flow_cta", "flow_cta", null, true, Collections.emptyList()), ResponseField.forString("flow_action", "flow_action", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String actionName;
        final String addressCountry;
        final String button;
        final String catalog_id;
        final String ctaUrl;
        final String display_text;
        final String flow_action;
        final String flow_cta;
        final String flow_id;
        final String flow_message_version;
        final String flow_mode;
        final String flow_token;
        final String product_retailer_id;
        final List<String> savedAddresses;

        public static final class Mapper implements ResponseFieldMapper<ActionInteractive> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ActionInteractive map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ActionInteractive.$responseFields;
                return new ActionInteractive(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ActionInteractive.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]));
            }
        }

        public ActionInteractive(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.actionName = str2;
            this.display_text = str3;
            this.ctaUrl = str4;
            this.addressCountry = str5;
            this.savedAddresses = list;
            this.button = str6;
            this.catalog_id = str7;
            this.product_retailer_id = str8;
            this.flow_mode = str9;
            this.flow_message_version = str10;
            this.flow_token = str11;
            this.flow_id = str12;
            this.flow_cta = str13;
            this.flow_action = str14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String actionName() {
            return this.actionName;
        }

        public String addressCountry() {
            return this.addressCountry;
        }

        public String button() {
            return this.button;
        }

        public String catalog_id() {
            return this.catalog_id;
        }

        public String ctaUrl() {
            return this.ctaUrl;
        }

        public String display_text() {
            return this.display_text;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            List<String> list;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionInteractive)) {
                return false;
            }
            ActionInteractive actionInteractive = (ActionInteractive) obj;
            if (this.__typename.equals(actionInteractive.__typename) && ((str = this.actionName) != null ? str.equals(actionInteractive.actionName) : actionInteractive.actionName == null) && ((str2 = this.display_text) != null ? str2.equals(actionInteractive.display_text) : actionInteractive.display_text == null) && ((str3 = this.ctaUrl) != null ? str3.equals(actionInteractive.ctaUrl) : actionInteractive.ctaUrl == null) && ((str4 = this.addressCountry) != null ? str4.equals(actionInteractive.addressCountry) : actionInteractive.addressCountry == null) && ((list = this.savedAddresses) != null ? list.equals(actionInteractive.savedAddresses) : actionInteractive.savedAddresses == null) && ((str5 = this.button) != null ? str5.equals(actionInteractive.button) : actionInteractive.button == null) && ((str6 = this.catalog_id) != null ? str6.equals(actionInteractive.catalog_id) : actionInteractive.catalog_id == null) && ((str7 = this.product_retailer_id) != null ? str7.equals(actionInteractive.product_retailer_id) : actionInteractive.product_retailer_id == null) && ((str8 = this.flow_mode) != null ? str8.equals(actionInteractive.flow_mode) : actionInteractive.flow_mode == null) && ((str9 = this.flow_message_version) != null ? str9.equals(actionInteractive.flow_message_version) : actionInteractive.flow_message_version == null) && ((str10 = this.flow_token) != null ? str10.equals(actionInteractive.flow_token) : actionInteractive.flow_token == null) && ((str11 = this.flow_id) != null ? str11.equals(actionInteractive.flow_id) : actionInteractive.flow_id == null) && ((str12 = this.flow_cta) != null ? str12.equals(actionInteractive.flow_cta) : actionInteractive.flow_cta == null)) {
                String str13 = this.flow_action;
                String str14 = actionInteractive.flow_action;
                if (str13 == null) {
                    if (str14 == null) {
                        return true;
                    }
                } else if (str13.equals(str14)) {
                    return true;
                }
            }
            return false;
        }

        public String flow_action() {
            return this.flow_action;
        }

        public String flow_cta() {
            return this.flow_cta;
        }

        public String flow_id() {
            return this.flow_id;
        }

        public String flow_message_version() {
            return this.flow_message_version;
        }

        public String flow_mode() {
            return this.flow_mode;
        }

        public String flow_token() {
            return this.flow_token;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.actionName;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.display_text;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ctaUrl;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.addressCountry;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                List<String> list = this.savedAddresses;
                int iHashCode6 = (iHashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str5 = this.button;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.catalog_id;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.product_retailer_id;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.flow_mode;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.flow_message_version;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.flow_token;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.flow_id;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.flow_cta;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.flow_action;
                this.$hashCode = iHashCode14 ^ (str13 != null ? str13.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ActionInteractive.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ActionInteractive.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ActionInteractive.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ActionInteractive.this.actionName);
                    responseWriter.writeString(responseFieldArr[2], ActionInteractive.this.display_text);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], ActionInteractive.this.ctaUrl);
                    responseWriter.writeString(responseFieldArr[4], ActionInteractive.this.addressCountry);
                    responseWriter.writeList(responseFieldArr[5], ActionInteractive.this.savedAddresses, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ActionInteractive.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[6], ActionInteractive.this.button);
                    responseWriter.writeString(responseFieldArr[7], ActionInteractive.this.catalog_id);
                    responseWriter.writeString(responseFieldArr[8], ActionInteractive.this.product_retailer_id);
                    responseWriter.writeString(responseFieldArr[9], ActionInteractive.this.flow_mode);
                    responseWriter.writeString(responseFieldArr[10], ActionInteractive.this.flow_message_version);
                    responseWriter.writeString(responseFieldArr[11], ActionInteractive.this.flow_token);
                    responseWriter.writeString(responseFieldArr[12], ActionInteractive.this.flow_id);
                    responseWriter.writeString(responseFieldArr[13], ActionInteractive.this.flow_cta);
                    responseWriter.writeString(responseFieldArr[14], ActionInteractive.this.flow_action);
                }
            };
        }

        public String product_retailer_id() {
            return this.product_retailer_id;
        }

        public List<String> savedAddresses() {
            return this.savedAddresses;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ActionInteractive{__typename=" + this.__typename + ", actionName=" + this.actionName + ", display_text=" + this.display_text + ", ctaUrl=" + this.ctaUrl + ", addressCountry=" + this.addressCountry + ", savedAddresses=" + this.savedAddresses + ", button=" + this.button + ", catalog_id=" + this.catalog_id + ", product_retailer_id=" + this.product_retailer_id + ", flow_mode=" + this.flow_mode + ", flow_message_version=" + this.flow_message_version + ", flow_token=" + this.flow_token + ", flow_id=" + this.flow_id + ", flow_cta=" + this.flow_cta + ", flow_action=" + this.flow_action + "}";
            }
            return this.$toString;
        }
    }

    public static final class Builder {
        private ModelChatMessageConditionInput condition;
        private CreateChatMessageInput input;

        public CreateChatMessageMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateChatMessageMutation(this.input, this.condition);
        }

        public Builder condition(ModelChatMessageConditionInput modelChatMessageConditionInput) {
            this.condition = modelChatMessageConditionInput;
            return this;
        }

        public Builder input(CreateChatMessageInput createChatMessageInput) {
            this.input = createChatMessageInput;
            return this;
        }
    }

    public static class Button {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("waType", "waType", null, true, Collections.emptyList()), ResponseField.forString("waText", "waText", null, true, Collections.emptyList()), ResponseField.forString("waUrl", "waUrl", null, true, Collections.emptyList()), ResponseField.forString("waNumber", "waNumber", null, true, Collections.emptyList()), ResponseField.forString("flow_id", "flow_id", null, true, Collections.emptyList()), ResponseField.forString("flow_json", "flow_json", null, true, Collections.emptyList()), ResponseField.forString("flow_action", "flow_action", null, true, Collections.emptyList()), ResponseField.forString("navigate_screen", "navigate_screen", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String flow_action;
        final String flow_id;
        final String flow_json;
        final String navigate_screen;
        final String waNumber;
        final String waText;
        final String waType;
        final String waUrl;

        public static final class Mapper implements ResponseFieldMapper<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Button map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Button.$responseFields;
                return new Button(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]));
            }
        }

        public Button(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.waType = str2;
            this.waText = str3;
            this.waUrl = str4;
            this.waNumber = str5;
            this.flow_id = str6;
            this.flow_json = str7;
            this.flow_action = str8;
            this.navigate_screen = str9;
        }

        public String __typename() {
            return this.__typename;
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
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            if (this.__typename.equals(button.__typename) && ((str = this.waType) != null ? str.equals(button.waType) : button.waType == null) && ((str2 = this.waText) != null ? str2.equals(button.waText) : button.waText == null) && ((str3 = this.waUrl) != null ? str3.equals(button.waUrl) : button.waUrl == null) && ((str4 = this.waNumber) != null ? str4.equals(button.waNumber) : button.waNumber == null) && ((str5 = this.flow_id) != null ? str5.equals(button.flow_id) : button.flow_id == null) && ((str6 = this.flow_json) != null ? str6.equals(button.flow_json) : button.flow_json == null) && ((str7 = this.flow_action) != null ? str7.equals(button.flow_action) : button.flow_action == null)) {
                String str8 = this.navigate_screen;
                String str9 = button.navigate_screen;
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

        public String flow_action() {
            return this.flow_action;
        }

        public String flow_id() {
            return this.flow_id;
        }

        public String flow_json() {
            return this.flow_json;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.waType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.waText;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.waUrl;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.waNumber;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.flow_id;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.flow_json;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.flow_action;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.navigate_screen;
                this.$hashCode = iHashCode8 ^ (str8 != null ? str8.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Button.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Button.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Button.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Button.this.waType);
                    responseWriter.writeString(responseFieldArr[2], Button.this.waText);
                    responseWriter.writeString(responseFieldArr[3], Button.this.waUrl);
                    responseWriter.writeString(responseFieldArr[4], Button.this.waNumber);
                    responseWriter.writeString(responseFieldArr[5], Button.this.flow_id);
                    responseWriter.writeString(responseFieldArr[6], Button.this.flow_json);
                    responseWriter.writeString(responseFieldArr[7], Button.this.flow_action);
                    responseWriter.writeString(responseFieldArr[8], Button.this.navigate_screen);
                }
            };
        }

        public String navigate_screen() {
            return this.navigate_screen;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Button{__typename=" + this.__typename + ", waType=" + this.waType + ", waText=" + this.waText + ", waUrl=" + this.waUrl + ", waNumber=" + this.waNumber + ", flow_id=" + this.flow_id + ", flow_json=" + this.flow_json + ", flow_action=" + this.flow_action + ", navigate_screen=" + this.navigate_screen + "}";
            }
            return this.$toString;
        }

        public String waNumber() {
            return this.waNumber;
        }

        public String waText() {
            return this.waText;
        }

        public String waType() {
            return this.waType;
        }

        public String waUrl() {
            return this.waUrl;
        }
    }

    public static class Channel {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Boolean chanelHasOnlyBroadcast;
        final String channelName;
        final String channelOpenUntil;
        final String channelProfilePic;
        final String channelStatus;
        final String channelSubType;
        final String channelType;
        final String channelWillBeChargedNext;
        final String contactId;
        final String createdAt;
        final String createdById;
        final Boolean externalParticipantsAllowed;
        final String id;
        final Boolean isLastMessageByLead;
        final String lastMessageByLeadTime;
        final String lastMessageByUserTime;
        final String lastOutboundMessageId;
        final String lastOutboundMessageStatus;
        final Boolean lastOutboundMessageWasBroadcast;
        final String messagePlatform;
        final String ownerId;
        final String participantScopeIfInternal;
        final String phoneNumberIdExternal;
        final String primaryTeamId;
        final String readNotifiedAt;
        final String recipientExternalId;
        final String recipientExternalIdType;
        final String recipientType;
        final String salesmaxAccountId;
        final List<String> tags;
        final ContactAssignmentStatus toBeAssigned;
        final String updatedAt;
        final String userIdsForDirectChannel;
        final String visitorId;

        public static final class Mapper implements ResponseFieldMapper<Channel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Channel map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Channel.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                List list = responseReader.readList(responseFieldArr[6], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Channel.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string5 = responseReader.readString(responseFieldArr[7]);
                String string6 = responseReader.readString(responseFieldArr[8]);
                String string7 = responseReader.readString(responseFieldArr[9]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[10]);
                String string8 = responseReader.readString(responseFieldArr[11]);
                String string9 = responseReader.readString(responseFieldArr[12]);
                String string10 = responseReader.readString(responseFieldArr[13]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]);
                String string11 = responseReader.readString(responseFieldArr[18]);
                String string12 = responseReader.readString(responseFieldArr[19]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]);
                String string13 = responseReader.readString(responseFieldArr[22]);
                return new Channel(string, str, str2, string2, string3, string4, list, string5, string6, string7, bool, string8, string9, string10, str3, str4, str5, str6, string11, string12, str7, str8, string13 != null ? ContactAssignmentStatus.valueOf(string13) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]), responseReader.readBoolean(responseFieldArr[27]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), responseReader.readBoolean(responseFieldArr[30]), responseReader.readBoolean(responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), responseReader.readString(responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[35]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forString("channelName", "channelName", null, true, Collections.emptyList()), ResponseField.forString("messagePlatform", "messagePlatform", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("recipientType", "recipientType", null, true, Collections.emptyList()), ResponseField.forString("channelType", "channelType", null, true, Collections.emptyList()), ResponseField.forString("channelSubType", "channelSubType", null, true, Collections.emptyList()), ResponseField.forBoolean("externalParticipantsAllowed", "externalParticipantsAllowed", null, true, Collections.emptyList()), ResponseField.forString("participantScopeIfInternal", "participantScopeIfInternal", null, true, Collections.emptyList()), ResponseField.forString("userIdsForDirectChannel", "userIdsForDirectChannel", null, true, Collections.emptyList()), ResponseField.forString("channelStatus", "channelStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("channelWillBeChargedNext", "channelWillBeChargedNext", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("channelOpenUntil", "channelOpenUntil", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("visitorId", "visitorId", null, true, customType, Collections.emptyList()), ResponseField.forString("recipientExternalId", "recipientExternalId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalIdType", "recipientExternalIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("readNotifiedAt", "readNotifiedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByLeadTime", "lastMessageByLeadTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastMessageByUserTime", "lastMessageByUserTime", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isLastMessageByLead", "isLastMessageByLead", null, true, Collections.emptyList()), ResponseField.forCustomType("lastOutboundMessageId", "lastOutboundMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastOutboundMessageStatus", "lastOutboundMessageStatus", null, true, Collections.emptyList()), ResponseField.forBoolean("lastOutboundMessageWasBroadcast", "lastOutboundMessageWasBroadcast", null, true, Collections.emptyList()), ResponseField.forBoolean("chanelHasOnlyBroadcast", "chanelHasOnlyBroadcast", null, true, Collections.emptyList()), ResponseField.forCustomType("salesmaxAccountId", "salesmaxAccountId", null, true, customType, Collections.emptyList()), ResponseField.forString("channelProfilePic", "channelProfilePic", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Channel(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ContactAssignmentStatus contactAssignmentStatus, String str21, String str22, String str23, String str24, Boolean bool2, String str25, String str26, Boolean bool3, Boolean bool4, String str27, String str28, String str29, String str30) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.phoneNumberIdExternal = str4;
            this.channelName = str5;
            this.messagePlatform = str6;
            this.tags = list;
            this.recipientType = str7;
            this.channelType = str8;
            this.channelSubType = str9;
            this.externalParticipantsAllowed = bool;
            this.participantScopeIfInternal = str10;
            this.userIdsForDirectChannel = str11;
            this.channelStatus = str12;
            this.channelWillBeChargedNext = str13;
            this.channelOpenUntil = str14;
            this.contactId = str15;
            this.visitorId = str16;
            this.recipientExternalId = str17;
            this.recipientExternalIdType = str18;
            this.ownerId = str19;
            this.primaryTeamId = str20;
            this.toBeAssigned = contactAssignmentStatus;
            this.createdById = str21;
            this.readNotifiedAt = str22;
            this.lastMessageByLeadTime = str23;
            this.lastMessageByUserTime = str24;
            this.isLastMessageByLead = bool2;
            this.lastOutboundMessageId = str25;
            this.lastOutboundMessageStatus = str26;
            this.lastOutboundMessageWasBroadcast = bool3;
            this.chanelHasOnlyBroadcast = bool4;
            this.salesmaxAccountId = str27;
            this.channelProfilePic = str28;
            this.createdAt = str29;
            this.updatedAt = str30;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Boolean chanelHasOnlyBroadcast() {
            return this.chanelHasOnlyBroadcast;
        }

        public String channelName() {
            return this.channelName;
        }

        public String channelOpenUntil() {
            return this.channelOpenUntil;
        }

        public String channelProfilePic() {
            return this.channelProfilePic;
        }

        public String channelStatus() {
            return this.channelStatus;
        }

        public String channelSubType() {
            return this.channelSubType;
        }

        public String channelType() {
            return this.channelType;
        }

        public String channelWillBeChargedNext() {
            return this.channelWillBeChargedNext;
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

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            List<String> list;
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
            String str14;
            String str15;
            String str16;
            String str17;
            ContactAssignmentStatus contactAssignmentStatus;
            String str18;
            String str19;
            String str20;
            String str21;
            Boolean bool2;
            String str22;
            String str23;
            Boolean bool3;
            Boolean bool4;
            String str24;
            String str25;
            String str26;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Channel)) {
                return false;
            }
            Channel channel = (Channel) obj;
            if (this.__typename.equals(channel.__typename) && this.id.equals(channel.id) && this.accountId.equals(channel.accountId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(channel.phoneNumberIdExternal) : channel.phoneNumberIdExternal == null) && ((str2 = this.channelName) != null ? str2.equals(channel.channelName) : channel.channelName == null) && ((str3 = this.messagePlatform) != null ? str3.equals(channel.messagePlatform) : channel.messagePlatform == null) && ((list = this.tags) != null ? list.equals(channel.tags) : channel.tags == null) && ((str4 = this.recipientType) != null ? str4.equals(channel.recipientType) : channel.recipientType == null) && ((str5 = this.channelType) != null ? str5.equals(channel.channelType) : channel.channelType == null) && ((str6 = this.channelSubType) != null ? str6.equals(channel.channelSubType) : channel.channelSubType == null) && ((bool = this.externalParticipantsAllowed) != null ? bool.equals(channel.externalParticipantsAllowed) : channel.externalParticipantsAllowed == null) && ((str7 = this.participantScopeIfInternal) != null ? str7.equals(channel.participantScopeIfInternal) : channel.participantScopeIfInternal == null) && ((str8 = this.userIdsForDirectChannel) != null ? str8.equals(channel.userIdsForDirectChannel) : channel.userIdsForDirectChannel == null) && ((str9 = this.channelStatus) != null ? str9.equals(channel.channelStatus) : channel.channelStatus == null) && ((str10 = this.channelWillBeChargedNext) != null ? str10.equals(channel.channelWillBeChargedNext) : channel.channelWillBeChargedNext == null) && ((str11 = this.channelOpenUntil) != null ? str11.equals(channel.channelOpenUntil) : channel.channelOpenUntil == null) && ((str12 = this.contactId) != null ? str12.equals(channel.contactId) : channel.contactId == null) && ((str13 = this.visitorId) != null ? str13.equals(channel.visitorId) : channel.visitorId == null) && ((str14 = this.recipientExternalId) != null ? str14.equals(channel.recipientExternalId) : channel.recipientExternalId == null) && ((str15 = this.recipientExternalIdType) != null ? str15.equals(channel.recipientExternalIdType) : channel.recipientExternalIdType == null) && ((str16 = this.ownerId) != null ? str16.equals(channel.ownerId) : channel.ownerId == null) && ((str17 = this.primaryTeamId) != null ? str17.equals(channel.primaryTeamId) : channel.primaryTeamId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(channel.toBeAssigned) : channel.toBeAssigned == null) && ((str18 = this.createdById) != null ? str18.equals(channel.createdById) : channel.createdById == null) && ((str19 = this.readNotifiedAt) != null ? str19.equals(channel.readNotifiedAt) : channel.readNotifiedAt == null) && ((str20 = this.lastMessageByLeadTime) != null ? str20.equals(channel.lastMessageByLeadTime) : channel.lastMessageByLeadTime == null) && ((str21 = this.lastMessageByUserTime) != null ? str21.equals(channel.lastMessageByUserTime) : channel.lastMessageByUserTime == null) && ((bool2 = this.isLastMessageByLead) != null ? bool2.equals(channel.isLastMessageByLead) : channel.isLastMessageByLead == null) && ((str22 = this.lastOutboundMessageId) != null ? str22.equals(channel.lastOutboundMessageId) : channel.lastOutboundMessageId == null) && ((str23 = this.lastOutboundMessageStatus) != null ? str23.equals(channel.lastOutboundMessageStatus) : channel.lastOutboundMessageStatus == null) && ((bool3 = this.lastOutboundMessageWasBroadcast) != null ? bool3.equals(channel.lastOutboundMessageWasBroadcast) : channel.lastOutboundMessageWasBroadcast == null) && ((bool4 = this.chanelHasOnlyBroadcast) != null ? bool4.equals(channel.chanelHasOnlyBroadcast) : channel.chanelHasOnlyBroadcast == null) && ((str24 = this.salesmaxAccountId) != null ? str24.equals(channel.salesmaxAccountId) : channel.salesmaxAccountId == null) && ((str25 = this.channelProfilePic) != null ? str25.equals(channel.channelProfilePic) : channel.channelProfilePic == null) && ((str26 = this.createdAt) != null ? str26.equals(channel.createdAt) : channel.createdAt == null)) {
                String str27 = this.updatedAt;
                String str28 = channel.updatedAt;
                if (str27 == null) {
                    if (str28 == null) {
                        return true;
                    }
                } else if (str27.equals(str28)) {
                    return true;
                }
            }
            return false;
        }

        public Boolean externalParticipantsAllowed() {
            return this.externalParticipantsAllowed;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.phoneNumberIdExternal;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.channelName;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.messagePlatform;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode5 = (iHashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str4 = this.recipientType;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.channelType;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.channelSubType;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Boolean bool = this.externalParticipantsAllowed;
                int iHashCode9 = (iHashCode8 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str7 = this.participantScopeIfInternal;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.userIdsForDirectChannel;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.channelStatus;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.channelWillBeChargedNext;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.channelOpenUntil;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.contactId;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.visitorId;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.recipientExternalId;
                int iHashCode17 = (iHashCode16 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.recipientExternalIdType;
                int iHashCode18 = (iHashCode17 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.ownerId;
                int iHashCode19 = (iHashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.primaryTeamId;
                int iHashCode20 = (iHashCode19 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                ContactAssignmentStatus contactAssignmentStatus = this.toBeAssigned;
                int iHashCode21 = (iHashCode20 ^ (contactAssignmentStatus == null ? 0 : contactAssignmentStatus.hashCode())) * 1000003;
                String str18 = this.createdById;
                int iHashCode22 = (iHashCode21 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.readNotifiedAt;
                int iHashCode23 = (iHashCode22 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.lastMessageByLeadTime;
                int iHashCode24 = (iHashCode23 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.lastMessageByUserTime;
                int iHashCode25 = (iHashCode24 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                Boolean bool2 = this.isLastMessageByLead;
                int iHashCode26 = (iHashCode25 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str22 = this.lastOutboundMessageId;
                int iHashCode27 = (iHashCode26 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.lastOutboundMessageStatus;
                int iHashCode28 = (iHashCode27 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                Boolean bool3 = this.lastOutboundMessageWasBroadcast;
                int iHashCode29 = (iHashCode28 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.chanelHasOnlyBroadcast;
                int iHashCode30 = (iHashCode29 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                String str24 = this.salesmaxAccountId;
                int iHashCode31 = (iHashCode30 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.channelProfilePic;
                int iHashCode32 = (iHashCode31 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.createdAt;
                int iHashCode33 = (iHashCode32 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.updatedAt;
                this.$hashCode = iHashCode33 ^ (str27 != null ? str27.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isLastMessageByLead() {
            return this.isLastMessageByLead;
        }

        public String lastMessageByLeadTime() {
            return this.lastMessageByLeadTime;
        }

        public String lastMessageByUserTime() {
            return this.lastMessageByUserTime;
        }

        public String lastOutboundMessageId() {
            return this.lastOutboundMessageId;
        }

        public String lastOutboundMessageStatus() {
            return this.lastOutboundMessageStatus;
        }

        public Boolean lastOutboundMessageWasBroadcast() {
            return this.lastOutboundMessageWasBroadcast;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Channel.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Channel.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Channel.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Channel.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Channel.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Channel.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], Channel.this.channelName);
                    responseWriter.writeString(responseFieldArr[5], Channel.this.messagePlatform);
                    responseWriter.writeList(responseFieldArr[6], Channel.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Channel.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[7], Channel.this.recipientType);
                    responseWriter.writeString(responseFieldArr[8], Channel.this.channelType);
                    responseWriter.writeString(responseFieldArr[9], Channel.this.channelSubType);
                    responseWriter.writeBoolean(responseFieldArr[10], Channel.this.externalParticipantsAllowed);
                    responseWriter.writeString(responseFieldArr[11], Channel.this.participantScopeIfInternal);
                    responseWriter.writeString(responseFieldArr[12], Channel.this.userIdsForDirectChannel);
                    responseWriter.writeString(responseFieldArr[13], Channel.this.channelStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Channel.this.channelWillBeChargedNext);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Channel.this.channelOpenUntil);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Channel.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Channel.this.visitorId);
                    responseWriter.writeString(responseFieldArr[18], Channel.this.recipientExternalId);
                    responseWriter.writeString(responseFieldArr[19], Channel.this.recipientExternalIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Channel.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Channel.this.primaryTeamId);
                    ResponseField responseField = responseFieldArr[22];
                    ContactAssignmentStatus contactAssignmentStatus = Channel.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Channel.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Channel.this.readNotifiedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Channel.this.lastMessageByLeadTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], Channel.this.lastMessageByUserTime);
                    responseWriter.writeBoolean(responseFieldArr[27], Channel.this.isLastMessageByLead);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[28], Channel.this.lastOutboundMessageId);
                    responseWriter.writeString(responseFieldArr[29], Channel.this.lastOutboundMessageStatus);
                    responseWriter.writeBoolean(responseFieldArr[30], Channel.this.lastOutboundMessageWasBroadcast);
                    responseWriter.writeBoolean(responseFieldArr[31], Channel.this.chanelHasOnlyBroadcast);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Channel.this.salesmaxAccountId);
                    responseWriter.writeString(responseFieldArr[33], Channel.this.channelProfilePic);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], Channel.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[35], Channel.this.updatedAt);
                }
            };
        }

        public String messagePlatform() {
            return this.messagePlatform;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String participantScopeIfInternal() {
            return this.participantScopeIfInternal;
        }

        public String phoneNumberIdExternal() {
            return this.phoneNumberIdExternal;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String readNotifiedAt() {
            return this.readNotifiedAt;
        }

        public String recipientExternalId() {
            return this.recipientExternalId;
        }

        public String recipientExternalIdType() {
            return this.recipientExternalIdType;
        }

        public String recipientType() {
            return this.recipientType;
        }

        public String salesmaxAccountId() {
            return this.salesmaxAccountId;
        }

        public List<String> tags() {
            return this.tags;
        }

        public ContactAssignmentStatus toBeAssigned() {
            return this.toBeAssigned;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Channel{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", channelName=" + this.channelName + ", messagePlatform=" + this.messagePlatform + ", tags=" + this.tags + ", recipientType=" + this.recipientType + ", channelType=" + this.channelType + ", channelSubType=" + this.channelSubType + ", externalParticipantsAllowed=" + this.externalParticipantsAllowed + ", participantScopeIfInternal=" + this.participantScopeIfInternal + ", userIdsForDirectChannel=" + this.userIdsForDirectChannel + ", channelStatus=" + this.channelStatus + ", channelWillBeChargedNext=" + this.channelWillBeChargedNext + ", channelOpenUntil=" + this.channelOpenUntil + ", contactId=" + this.contactId + ", visitorId=" + this.visitorId + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", toBeAssigned=" + this.toBeAssigned + ", createdById=" + this.createdById + ", readNotifiedAt=" + this.readNotifiedAt + ", lastMessageByLeadTime=" + this.lastMessageByLeadTime + ", lastMessageByUserTime=" + this.lastMessageByUserTime + ", isLastMessageByLead=" + this.isLastMessageByLead + ", lastOutboundMessageId=" + this.lastOutboundMessageId + ", lastOutboundMessageStatus=" + this.lastOutboundMessageStatus + ", lastOutboundMessageWasBroadcast=" + this.lastOutboundMessageWasBroadcast + ", chanelHasOnlyBroadcast=" + this.chanelHasOnlyBroadcast + ", salesmaxAccountId=" + this.salesmaxAccountId + ", channelProfilePic=" + this.channelProfilePic + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userIdsForDirectChannel() {
            return this.userIdsForDirectChannel;
        }

        public String visitorId() {
            return this.visitorId;
        }
    }

    public static class ChatUser {
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

        public static final class Mapper implements ResponseFieldMapper<ChatUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ChatUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ChatUser.$responseFields;
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
                return new ChatUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public ChatUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof ChatUser)) {
                return false;
            }
            ChatUser chatUser = (ChatUser) obj;
            if (this.__typename.equals(chatUser.__typename) && this.id.equals(chatUser.id) && this.addedSourceType.equals(chatUser.addedSourceType) && this.name.equals(chatUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(chatUser.profilePictureUrl) : chatUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(chatUser.registeredEmail) : chatUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(chatUser.registeredEmailVerified) : chatUser.registeredEmailVerified == null) && this.registeredNumber.equals(chatUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(chatUser.registeredNumberVerified) : chatUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(chatUser.secondaryNumber) : chatUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(chatUser.secondaryNumberVerified) : chatUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(chatUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(chatUser.lastSelectedAccountWeb) : chatUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(chatUser.lastSelectedAccountApp) : chatUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(chatUser.appVersion) : chatUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(chatUser.deviceModel) : chatUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(chatUser.deviceManufacturer) : chatUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(chatUser.androidVersionRelease) : chatUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(chatUser.createdAt) : chatUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = chatUser.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ChatUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ChatUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ChatUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ChatUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], ChatUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], ChatUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], ChatUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], ChatUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], ChatUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], ChatUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], ChatUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], ChatUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], ChatUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], ChatUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], ChatUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], ChatUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], ChatUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], ChatUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], ChatUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], ChatUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], ChatUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], ChatUser.this.updatedAt);
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
                this.$toString = "ChatUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                List list2 = responseReader.readList(responseFieldArr[7], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.Mapper.2
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
                List list3 = responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<Day>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.Mapper.3
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
                List list4 = responseReader.readList(responseFieldArr[92], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                List list5 = responseReader.readList(responseFieldArr[93], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string45 = responseReader.readString(responseFieldArr[94]);
                String string46 = responseReader.readString(responseFieldArr[95]);
                String string47 = responseReader.readString(responseFieldArr[96]);
                List list6 = responseReader.readList(responseFieldArr[97], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.Mapper.6
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.1
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
                    responseWriter.writeList(responseFieldArr[5], Contact.this.sharedOwners, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Contact.this.primaryTeamId);
                    responseWriter.writeList(responseFieldArr[7], Contact.this.sharedTeams, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.1.2
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
                    responseWriter.writeList(responseFieldArr[34], Contact.this.preferredContactDays, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.1.3
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
                    responseWriter.writeList(responseFieldArr[92], Contact.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[93], Contact.this.productService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[94], Contact.this.bulkUploadReference);
                    responseWriter.writeString(responseFieldArr[95], Contact.this.assignmentMethod);
                    responseWriter.writeString(responseFieldArr[96], Contact.this.whatsappOptInStatus);
                    responseWriter.writeList(responseFieldArr[97], Contact.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Contact.1.6
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

    public static class CreateChatMessage {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final ActionInteractive actionInteractive;
        final String adddressMessageParameters;
        final List<Button> buttons;
        final Channel channel;
        final String channelId;
        final String chatBotId;
        final ChatUser chatUser;
        final String chatUserAccountIdIfExternal;
        final String chatUserAccountNameIfExternal;
        final String chatUserId;
        final String chatUserName;
        final Contact contact;
        final String contactId;
        final List<String> contactObjectToSend;
        final String createdAt;
        final String deliveredAt;
        final String directChatUserId;
        final String errorMessages;
        final String externalConversationId;
        final String externalMessageReferenceId;
        final String externalTemplateCategory;
        final String externalTemplateId;
        final String followUpType;
        final String footerText;
        final Boolean hasImage;
        final String headerText;
        final String headerType;
        final String id;
        final String internalTemplateId;
        final Boolean isInbound;
        final Boolean isStarred;
        final String linkedEngagementIdIfBroadcast;
        final String locationObjectToSend;
        final Media media;
        final String mediaMetadata;
        final String mediaObjectId;
        final List<Mentioned> mentioned;
        final String messageCategory;
        final String messagePlatform;
        final MessageSendCategory messageSendCategory;
        final String messageSubType;
        final String messageType;
        final List<Parameter> parameters;
        final String phoneNumberIdExternal;
        final String primaryTeamId;
        final List<ProductItem> productItems;
        final String readAt;
        final String recipientExternalId;
        final String recipientExternalIdType;
        final String referral;
        final ReferredContact referredContact;
        final String referredContactId;
        final String referredProductCatalogId;
        final String referredProductRetailerId;
        final String replyType;
        final String replyTypeId;
        final ReplyingToMessage replyingToMessage;
        final String replyingToMessageId;
        final String replyingToMessageIdExternal;
        final ResponseMessage responseMessage;
        final String responseMessageId;
        final String sentAt;
        final String status;
        final String text;
        final String thumbnailUrl;
        final String updatedAt;
        final String visitorId;

        public static final class Mapper implements ResponseFieldMapper<CreateChatMessage> {
            final ProductItem.Mapper productItemFieldMapper = new ProductItem.Mapper();
            final ActionInteractive.Mapper actionInteractiveFieldMapper = new ActionInteractive.Mapper();
            final Button.Mapper buttonFieldMapper = new Button.Mapper();
            final Parameter.Mapper parameterFieldMapper = new Parameter.Mapper();
            final Mentioned.Mapper mentionedFieldMapper = new Mentioned.Mapper();
            final Channel.Mapper channelFieldMapper = new Channel.Mapper();
            final ReplyingToMessage.Mapper replyingToMessageFieldMapper = new ReplyingToMessage.Mapper();
            final ResponseMessage.Mapper responseMessageFieldMapper = new ResponseMessage.Mapper();
            final Media.Mapper mediaFieldMapper = new Media.Mapper();
            final Contact.Mapper contactFieldMapper = new Contact.Mapper();
            final ReferredContact.Mapper referredContactFieldMapper = new ReferredContact.Mapper();
            final ChatUser.Mapper chatUserFieldMapper = new ChatUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateChatMessage map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateChatMessage.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String string8 = responseReader.readString(responseFieldArr[13]);
                String string9 = responseReader.readString(responseFieldArr[14]);
                String string10 = responseReader.readString(responseFieldArr[15]);
                String string11 = responseReader.readString(responseFieldArr[16]);
                return new CreateChatMessage(string, str, str2, string2, string3, string4, string5, string6, string7, str3, str4, str5, str6, string8, string9, string10, string11 != null ? MessageSendCategory.valueOf(string11) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readString(responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), responseReader.readList(responseFieldArr[25], new ResponseReader.ListReader<ProductItem>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public ProductItem read(ResponseReader.ListItemReader listItemReader) {
                        return (ProductItem) listItemReader.readObject(new ResponseReader.ObjectReader<ProductItem>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public ProductItem read(ResponseReader responseReader2) {
                                return Mapper.this.productItemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]), responseReader.readBoolean(responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readString(responseFieldArr[34]), responseReader.readString(responseFieldArr[35]), responseReader.readString(responseFieldArr[36]), responseReader.readList(responseFieldArr[37], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[39]), responseReader.readString(responseFieldArr[40]), responseReader.readString(responseFieldArr[41]), responseReader.readString(responseFieldArr[42]), (ActionInteractive) responseReader.readObject(responseFieldArr[43], new ResponseReader.ObjectReader<ActionInteractive>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ActionInteractive read(ResponseReader responseReader2) {
                        return Mapper.this.actionInteractiveFieldMapper.map(responseReader2);
                    }
                }), responseReader.readList(responseFieldArr[44], new ResponseReader.ListReader<Button>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Button read(ResponseReader.ListItemReader listItemReader) {
                        return (Button) listItemReader.readObject(new ResponseReader.ObjectReader<Button>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.4.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Button read(ResponseReader responseReader2) {
                                return Mapper.this.buttonFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readList(responseFieldArr[45], new ResponseReader.ListReader<Parameter>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Parameter read(ResponseReader.ListItemReader listItemReader) {
                        return (Parameter) listItemReader.readObject(new ResponseReader.ObjectReader<Parameter>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.5.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Parameter read(ResponseReader responseReader2) {
                                return Mapper.this.parameterFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[46]), responseReader.readString(responseFieldArr[47]), responseReader.readBoolean(responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), responseReader.readBoolean(responseFieldArr[50]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[51]), responseReader.readString(responseFieldArr[52]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[53]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[54]), responseReader.readString(responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]), responseReader.readList(responseFieldArr[57], new ResponseReader.ListReader<Mentioned>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Mentioned read(ResponseReader.ListItemReader listItemReader) {
                        return (Mentioned) listItemReader.readObject(new ResponseReader.ObjectReader<Mentioned>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.6.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Mentioned read(ResponseReader responseReader2) {
                                return Mapper.this.mentionedFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[58]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[59]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[60]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[61]), (Channel) responseReader.readObject(responseFieldArr[62], new ResponseReader.ObjectReader<Channel>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Channel read(ResponseReader responseReader2) {
                        return Mapper.this.channelFieldMapper.map(responseReader2);
                    }
                }), (ReplyingToMessage) responseReader.readObject(responseFieldArr[63], new ResponseReader.ObjectReader<ReplyingToMessage>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ReplyingToMessage read(ResponseReader responseReader2) {
                        return Mapper.this.replyingToMessageFieldMapper.map(responseReader2);
                    }
                }), (ResponseMessage) responseReader.readObject(responseFieldArr[64], new ResponseReader.ObjectReader<ResponseMessage>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.9
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ResponseMessage read(ResponseReader responseReader2) {
                        return Mapper.this.responseMessageFieldMapper.map(responseReader2);
                    }
                }), (Media) responseReader.readObject(responseFieldArr[65], new ResponseReader.ObjectReader<Media>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.10
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Media read(ResponseReader responseReader2) {
                        return Mapper.this.mediaFieldMapper.map(responseReader2);
                    }
                }), (Contact) responseReader.readObject(responseFieldArr[66], new ResponseReader.ObjectReader<Contact>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.11
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Contact read(ResponseReader responseReader2) {
                        return Mapper.this.contactFieldMapper.map(responseReader2);
                    }
                }), (ReferredContact) responseReader.readObject(responseFieldArr[67], new ResponseReader.ObjectReader<ReferredContact>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.12
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ReferredContact read(ResponseReader responseReader2) {
                        return Mapper.this.referredContactFieldMapper.map(responseReader2);
                    }
                }), (ChatUser) responseReader.readObject(responseFieldArr[68], new ResponseReader.ObjectReader<ChatUser>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.Mapper.13
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ChatUser read(ResponseReader responseReader2) {
                        return Mapper.this.chatUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forString("messagePlatform", "messagePlatform", null, true, Collections.emptyList()), ResponseField.forString("externalMessageReferenceId", "externalMessageReferenceId", null, true, Collections.emptyList()), ResponseField.forString("externalConversationId", "externalConversationId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalId", "recipientExternalId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalIdType", "recipientExternalIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("visitorId", "visitorId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("referredContactId", "referredContactId", null, true, customType, Collections.emptyList()), ResponseField.forString("messageType", "messageType", null, true, Collections.emptyList()), ResponseField.forString("messageSubType", "messageSubType", null, true, Collections.emptyList()), ResponseField.forString("messageCategory", "messageCategory", null, true, Collections.emptyList()), ResponseField.forString("messageSendCategory", "messageSendCategory", null, true, Collections.emptyList()), ResponseField.forCustomType("replyingToMessageId", "replyingToMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("replyingToMessageIdExternal", "replyingToMessageIdExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("responseMessageId", "responseMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("followUpType", "followUpType", null, true, Collections.emptyList()), ResponseField.forString("replyType", "replyType", null, true, Collections.emptyList()), ResponseField.forString("replyTypeId", "replyTypeId", null, true, Collections.emptyList()), ResponseField.forString("referredProductCatalogId", "referredProductCatalogId", null, true, Collections.emptyList()), ResponseField.forString("referredProductRetailerId", "referredProductRetailerId", null, true, Collections.emptyList()), ResponseField.forList("productItems", "productItems", null, true, Collections.emptyList()), ResponseField.forCustomType("referral", "referral", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isStarred", "isStarred", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("errorMessages", "errorMessages", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("sentAt", "sentAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("deliveredAt", "deliveredAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("readAt", "readAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("internalTemplateId", "internalTemplateId", null, true, customType, Collections.emptyList()), ResponseField.forString("externalTemplateId", "externalTemplateId", null, true, Collections.emptyList()), ResponseField.forString("externalTemplateCategory", "externalTemplateCategory", null, true, Collections.emptyList()), ResponseField.forString("text", "text", null, true, Collections.emptyList()), ResponseField.forList("contactObjectToSend", "contactObjectToSend", null, true, Collections.emptyList()), ResponseField.forCustomType("locationObjectToSend", "locationObjectToSend", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("adddressMessageParameters", "adddressMessageParameters", null, true, customType2, Collections.emptyList()), ResponseField.forString("headerText", "headerText", null, true, Collections.emptyList()), ResponseField.forString("footerText", "footerText", null, true, Collections.emptyList()), ResponseField.forString("headerType", "headerType", null, true, Collections.emptyList()), ResponseField.forObject("actionInteractive", "actionInteractive", null, true, Collections.emptyList()), ResponseField.forList("buttons", "buttons", null, true, Collections.emptyList()), ResponseField.forList("parameters", "parameters", null, true, Collections.emptyList()), ResponseField.forCustomType("mediaObjectId", "mediaObjectId", null, true, customType, Collections.emptyList()), ResponseField.forString("mediaMetadata", "mediaMetadata", null, true, Collections.emptyList()), ResponseField.forBoolean("hasImage", "hasImage", null, true, Collections.emptyList()), ResponseField.forString("thumbnailUrl", "thumbnailUrl", null, true, Collections.emptyList()), ResponseField.forBoolean("isInbound", "isInbound", null, true, Collections.emptyList()), ResponseField.forCustomType("chatUserId", "chatUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("chatUserName", "chatUserName", null, true, Collections.emptyList()), ResponseField.forCustomType("chatBotId", "chatBotId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("chatUserAccountIdIfExternal", "chatUserAccountIdIfExternal", null, true, customType, Collections.emptyList()), ResponseField.forString("chatUserAccountNameIfExternal", "chatUserAccountNameIfExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("directChatUserId", "directChatUserId", null, true, customType, Collections.emptyList()), ResponseField.forList("mentioned", "mentioned", null, true, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("linkedEngagementIdIfBroadcast", "linkedEngagementIdIfBroadcast", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList()), ResponseField.forObject("channel", "channel", null, true, Collections.emptyList()), ResponseField.forObject("replyingToMessage", "replyingToMessage", null, true, Collections.emptyList()), ResponseField.forObject("responseMessage", "responseMessage", null, true, Collections.emptyList()), ResponseField.forObject("media", "media", null, true, Collections.emptyList()), ResponseField.forObject("contact", "contact", null, true, Collections.emptyList()), ResponseField.forObject("referredContact", "referredContact", null, true, Collections.emptyList()), ResponseField.forObject("chatUser", "chatUser", null, true, Collections.emptyList())};
        }

        public CreateChatMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, MessageSendCategory messageSendCategory, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, List<ProductItem> list, String str25, Boolean bool, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<String> list2, String str35, String str36, String str37, String str38, String str39, ActionInteractive actionInteractive, List<Button> list3, List<Parameter> list4, String str40, String str41, Boolean bool2, String str42, Boolean bool3, String str43, String str44, String str45, String str46, String str47, String str48, List<Mentioned> list5, String str49, String str50, String str51, String str52, Channel channel, ReplyingToMessage replyingToMessage, ResponseMessage responseMessage, Media media, Contact contact, ReferredContact referredContact, ChatUser chatUser) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.phoneNumberIdExternal = str4;
            this.messagePlatform = str5;
            this.externalMessageReferenceId = str6;
            this.externalConversationId = str7;
            this.recipientExternalId = str8;
            this.recipientExternalIdType = str9;
            this.channelId = (String) Utils.checkNotNull(str10, "channelId == null");
            this.contactId = str11;
            this.visitorId = str12;
            this.referredContactId = str13;
            this.messageType = str14;
            this.messageSubType = str15;
            this.messageCategory = str16;
            this.messageSendCategory = messageSendCategory;
            this.replyingToMessageId = str17;
            this.replyingToMessageIdExternal = str18;
            this.responseMessageId = str19;
            this.followUpType = str20;
            this.replyType = str21;
            this.replyTypeId = str22;
            this.referredProductCatalogId = str23;
            this.referredProductRetailerId = str24;
            this.productItems = list;
            this.referral = str25;
            this.isStarred = bool;
            this.status = str26;
            this.errorMessages = str27;
            this.sentAt = str28;
            this.deliveredAt = str29;
            this.readAt = str30;
            this.internalTemplateId = str31;
            this.externalTemplateId = str32;
            this.externalTemplateCategory = str33;
            this.text = str34;
            this.contactObjectToSend = list2;
            this.locationObjectToSend = str35;
            this.adddressMessageParameters = str36;
            this.headerText = str37;
            this.footerText = str38;
            this.headerType = str39;
            this.actionInteractive = actionInteractive;
            this.buttons = list3;
            this.parameters = list4;
            this.mediaObjectId = str40;
            this.mediaMetadata = str41;
            this.hasImage = bool2;
            this.thumbnailUrl = str42;
            this.isInbound = bool3;
            this.chatUserId = str43;
            this.chatUserName = str44;
            this.chatBotId = str45;
            this.chatUserAccountIdIfExternal = str46;
            this.chatUserAccountNameIfExternal = str47;
            this.directChatUserId = str48;
            this.mentioned = list5;
            this.primaryTeamId = str49;
            this.linkedEngagementIdIfBroadcast = str50;
            this.createdAt = str51;
            this.updatedAt = str52;
            this.channel = channel;
            this.replyingToMessage = replyingToMessage;
            this.responseMessage = responseMessage;
            this.media = media;
            this.contact = contact;
            this.referredContact = referredContact;
            this.chatUser = chatUser;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public ActionInteractive actionInteractive() {
            return this.actionInteractive;
        }

        public String adddressMessageParameters() {
            return this.adddressMessageParameters;
        }

        public List<Button> buttons() {
            return this.buttons;
        }

        public Channel channel() {
            return this.channel;
        }

        public String channelId() {
            return this.channelId;
        }

        public String chatBotId() {
            return this.chatBotId;
        }

        public ChatUser chatUser() {
            return this.chatUser;
        }

        public String chatUserAccountIdIfExternal() {
            return this.chatUserAccountIdIfExternal;
        }

        public String chatUserAccountNameIfExternal() {
            return this.chatUserAccountNameIfExternal;
        }

        public String chatUserId() {
            return this.chatUserId;
        }

        public String chatUserName() {
            return this.chatUserName;
        }

        public Contact contact() {
            return this.contact;
        }

        public String contactId() {
            return this.contactId;
        }

        public List<String> contactObjectToSend() {
            return this.contactObjectToSend;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deliveredAt() {
            return this.deliveredAt;
        }

        public String directChatUserId() {
            return this.directChatUserId;
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
            MessageSendCategory messageSendCategory;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            List<ProductItem> list;
            String str21;
            Boolean bool;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            List<String> list2;
            String str31;
            String str32;
            String str33;
            String str34;
            String str35;
            ActionInteractive actionInteractive;
            List<Button> list3;
            List<Parameter> list4;
            String str36;
            String str37;
            Boolean bool2;
            String str38;
            Boolean bool3;
            String str39;
            String str40;
            String str41;
            String str42;
            String str43;
            String str44;
            List<Mentioned> list5;
            String str45;
            String str46;
            String str47;
            String str48;
            Channel channel;
            ReplyingToMessage replyingToMessage;
            ResponseMessage responseMessage;
            Media media;
            Contact contact;
            ReferredContact referredContact;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateChatMessage)) {
                return false;
            }
            CreateChatMessage createChatMessage = (CreateChatMessage) obj;
            if (this.__typename.equals(createChatMessage.__typename) && this.id.equals(createChatMessage.id) && this.accountId.equals(createChatMessage.accountId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(createChatMessage.phoneNumberIdExternal) : createChatMessage.phoneNumberIdExternal == null) && ((str2 = this.messagePlatform) != null ? str2.equals(createChatMessage.messagePlatform) : createChatMessage.messagePlatform == null) && ((str3 = this.externalMessageReferenceId) != null ? str3.equals(createChatMessage.externalMessageReferenceId) : createChatMessage.externalMessageReferenceId == null) && ((str4 = this.externalConversationId) != null ? str4.equals(createChatMessage.externalConversationId) : createChatMessage.externalConversationId == null) && ((str5 = this.recipientExternalId) != null ? str5.equals(createChatMessage.recipientExternalId) : createChatMessage.recipientExternalId == null) && ((str6 = this.recipientExternalIdType) != null ? str6.equals(createChatMessage.recipientExternalIdType) : createChatMessage.recipientExternalIdType == null) && this.channelId.equals(createChatMessage.channelId) && ((str7 = this.contactId) != null ? str7.equals(createChatMessage.contactId) : createChatMessage.contactId == null) && ((str8 = this.visitorId) != null ? str8.equals(createChatMessage.visitorId) : createChatMessage.visitorId == null) && ((str9 = this.referredContactId) != null ? str9.equals(createChatMessage.referredContactId) : createChatMessage.referredContactId == null) && ((str10 = this.messageType) != null ? str10.equals(createChatMessage.messageType) : createChatMessage.messageType == null) && ((str11 = this.messageSubType) != null ? str11.equals(createChatMessage.messageSubType) : createChatMessage.messageSubType == null) && ((str12 = this.messageCategory) != null ? str12.equals(createChatMessage.messageCategory) : createChatMessage.messageCategory == null) && ((messageSendCategory = this.messageSendCategory) != null ? messageSendCategory.equals(createChatMessage.messageSendCategory) : createChatMessage.messageSendCategory == null) && ((str13 = this.replyingToMessageId) != null ? str13.equals(createChatMessage.replyingToMessageId) : createChatMessage.replyingToMessageId == null) && ((str14 = this.replyingToMessageIdExternal) != null ? str14.equals(createChatMessage.replyingToMessageIdExternal) : createChatMessage.replyingToMessageIdExternal == null) && ((str15 = this.responseMessageId) != null ? str15.equals(createChatMessage.responseMessageId) : createChatMessage.responseMessageId == null) && ((str16 = this.followUpType) != null ? str16.equals(createChatMessage.followUpType) : createChatMessage.followUpType == null) && ((str17 = this.replyType) != null ? str17.equals(createChatMessage.replyType) : createChatMessage.replyType == null) && ((str18 = this.replyTypeId) != null ? str18.equals(createChatMessage.replyTypeId) : createChatMessage.replyTypeId == null) && ((str19 = this.referredProductCatalogId) != null ? str19.equals(createChatMessage.referredProductCatalogId) : createChatMessage.referredProductCatalogId == null) && ((str20 = this.referredProductRetailerId) != null ? str20.equals(createChatMessage.referredProductRetailerId) : createChatMessage.referredProductRetailerId == null) && ((list = this.productItems) != null ? list.equals(createChatMessage.productItems) : createChatMessage.productItems == null) && ((str21 = this.referral) != null ? str21.equals(createChatMessage.referral) : createChatMessage.referral == null) && ((bool = this.isStarred) != null ? bool.equals(createChatMessage.isStarred) : createChatMessage.isStarred == null) && ((str22 = this.status) != null ? str22.equals(createChatMessage.status) : createChatMessage.status == null) && ((str23 = this.errorMessages) != null ? str23.equals(createChatMessage.errorMessages) : createChatMessage.errorMessages == null) && ((str24 = this.sentAt) != null ? str24.equals(createChatMessage.sentAt) : createChatMessage.sentAt == null) && ((str25 = this.deliveredAt) != null ? str25.equals(createChatMessage.deliveredAt) : createChatMessage.deliveredAt == null) && ((str26 = this.readAt) != null ? str26.equals(createChatMessage.readAt) : createChatMessage.readAt == null) && ((str27 = this.internalTemplateId) != null ? str27.equals(createChatMessage.internalTemplateId) : createChatMessage.internalTemplateId == null) && ((str28 = this.externalTemplateId) != null ? str28.equals(createChatMessage.externalTemplateId) : createChatMessage.externalTemplateId == null) && ((str29 = this.externalTemplateCategory) != null ? str29.equals(createChatMessage.externalTemplateCategory) : createChatMessage.externalTemplateCategory == null) && ((str30 = this.text) != null ? str30.equals(createChatMessage.text) : createChatMessage.text == null) && ((list2 = this.contactObjectToSend) != null ? list2.equals(createChatMessage.contactObjectToSend) : createChatMessage.contactObjectToSend == null) && ((str31 = this.locationObjectToSend) != null ? str31.equals(createChatMessage.locationObjectToSend) : createChatMessage.locationObjectToSend == null) && ((str32 = this.adddressMessageParameters) != null ? str32.equals(createChatMessage.adddressMessageParameters) : createChatMessage.adddressMessageParameters == null) && ((str33 = this.headerText) != null ? str33.equals(createChatMessage.headerText) : createChatMessage.headerText == null) && ((str34 = this.footerText) != null ? str34.equals(createChatMessage.footerText) : createChatMessage.footerText == null) && ((str35 = this.headerType) != null ? str35.equals(createChatMessage.headerType) : createChatMessage.headerType == null) && ((actionInteractive = this.actionInteractive) != null ? actionInteractive.equals(createChatMessage.actionInteractive) : createChatMessage.actionInteractive == null) && ((list3 = this.buttons) != null ? list3.equals(createChatMessage.buttons) : createChatMessage.buttons == null) && ((list4 = this.parameters) != null ? list4.equals(createChatMessage.parameters) : createChatMessage.parameters == null) && ((str36 = this.mediaObjectId) != null ? str36.equals(createChatMessage.mediaObjectId) : createChatMessage.mediaObjectId == null) && ((str37 = this.mediaMetadata) != null ? str37.equals(createChatMessage.mediaMetadata) : createChatMessage.mediaMetadata == null) && ((bool2 = this.hasImage) != null ? bool2.equals(createChatMessage.hasImage) : createChatMessage.hasImage == null) && ((str38 = this.thumbnailUrl) != null ? str38.equals(createChatMessage.thumbnailUrl) : createChatMessage.thumbnailUrl == null) && ((bool3 = this.isInbound) != null ? bool3.equals(createChatMessage.isInbound) : createChatMessage.isInbound == null) && ((str39 = this.chatUserId) != null ? str39.equals(createChatMessage.chatUserId) : createChatMessage.chatUserId == null) && ((str40 = this.chatUserName) != null ? str40.equals(createChatMessage.chatUserName) : createChatMessage.chatUserName == null) && ((str41 = this.chatBotId) != null ? str41.equals(createChatMessage.chatBotId) : createChatMessage.chatBotId == null) && ((str42 = this.chatUserAccountIdIfExternal) != null ? str42.equals(createChatMessage.chatUserAccountIdIfExternal) : createChatMessage.chatUserAccountIdIfExternal == null) && ((str43 = this.chatUserAccountNameIfExternal) != null ? str43.equals(createChatMessage.chatUserAccountNameIfExternal) : createChatMessage.chatUserAccountNameIfExternal == null) && ((str44 = this.directChatUserId) != null ? str44.equals(createChatMessage.directChatUserId) : createChatMessage.directChatUserId == null) && ((list5 = this.mentioned) != null ? list5.equals(createChatMessage.mentioned) : createChatMessage.mentioned == null) && ((str45 = this.primaryTeamId) != null ? str45.equals(createChatMessage.primaryTeamId) : createChatMessage.primaryTeamId == null) && ((str46 = this.linkedEngagementIdIfBroadcast) != null ? str46.equals(createChatMessage.linkedEngagementIdIfBroadcast) : createChatMessage.linkedEngagementIdIfBroadcast == null) && ((str47 = this.createdAt) != null ? str47.equals(createChatMessage.createdAt) : createChatMessage.createdAt == null) && ((str48 = this.updatedAt) != null ? str48.equals(createChatMessage.updatedAt) : createChatMessage.updatedAt == null) && ((channel = this.channel) != null ? channel.equals(createChatMessage.channel) : createChatMessage.channel == null) && ((replyingToMessage = this.replyingToMessage) != null ? replyingToMessage.equals(createChatMessage.replyingToMessage) : createChatMessage.replyingToMessage == null) && ((responseMessage = this.responseMessage) != null ? responseMessage.equals(createChatMessage.responseMessage) : createChatMessage.responseMessage == null) && ((media = this.media) != null ? media.equals(createChatMessage.media) : createChatMessage.media == null) && ((contact = this.contact) != null ? contact.equals(createChatMessage.contact) : createChatMessage.contact == null) && ((referredContact = this.referredContact) != null ? referredContact.equals(createChatMessage.referredContact) : createChatMessage.referredContact == null)) {
                ChatUser chatUser = this.chatUser;
                ChatUser chatUser2 = createChatMessage.chatUser;
                if (chatUser == null) {
                    if (chatUser2 == null) {
                        return true;
                    }
                } else if (chatUser.equals(chatUser2)) {
                    return true;
                }
            }
            return false;
        }

        public String errorMessages() {
            return this.errorMessages;
        }

        public String externalConversationId() {
            return this.externalConversationId;
        }

        public String externalMessageReferenceId() {
            return this.externalMessageReferenceId;
        }

        public String externalTemplateCategory() {
            return this.externalTemplateCategory;
        }

        public String externalTemplateId() {
            return this.externalTemplateId;
        }

        public String followUpType() {
            return this.followUpType;
        }

        public String footerText() {
            return this.footerText;
        }

        public Boolean hasImage() {
            return this.hasImage;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.phoneNumberIdExternal;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.messagePlatform;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.externalMessageReferenceId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.externalConversationId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.recipientExternalId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.recipientExternalIdType;
                int iHashCode7 = (((iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003) ^ this.channelId.hashCode()) * 1000003;
                String str7 = this.contactId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.visitorId;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.referredContactId;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.messageType;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.messageSubType;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.messageCategory;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                MessageSendCategory messageSendCategory = this.messageSendCategory;
                int iHashCode14 = (iHashCode13 ^ (messageSendCategory == null ? 0 : messageSendCategory.hashCode())) * 1000003;
                String str13 = this.replyingToMessageId;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.replyingToMessageIdExternal;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.responseMessageId;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.followUpType;
                int iHashCode18 = (iHashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.replyType;
                int iHashCode19 = (iHashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.replyTypeId;
                int iHashCode20 = (iHashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.referredProductCatalogId;
                int iHashCode21 = (iHashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.referredProductRetailerId;
                int iHashCode22 = (iHashCode21 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                List<ProductItem> list = this.productItems;
                int iHashCode23 = (iHashCode22 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str21 = this.referral;
                int iHashCode24 = (iHashCode23 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                Boolean bool = this.isStarred;
                int iHashCode25 = (iHashCode24 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str22 = this.status;
                int iHashCode26 = (iHashCode25 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.errorMessages;
                int iHashCode27 = (iHashCode26 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.sentAt;
                int iHashCode28 = (iHashCode27 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.deliveredAt;
                int iHashCode29 = (iHashCode28 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.readAt;
                int iHashCode30 = (iHashCode29 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.internalTemplateId;
                int iHashCode31 = (iHashCode30 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.externalTemplateId;
                int iHashCode32 = (iHashCode31 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.externalTemplateCategory;
                int iHashCode33 = (iHashCode32 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.text;
                int iHashCode34 = (iHashCode33 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                List<String> list2 = this.contactObjectToSend;
                int iHashCode35 = (iHashCode34 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str31 = this.locationObjectToSend;
                int iHashCode36 = (iHashCode35 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.adddressMessageParameters;
                int iHashCode37 = (iHashCode36 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.headerText;
                int iHashCode38 = (iHashCode37 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                String str34 = this.footerText;
                int iHashCode39 = (iHashCode38 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.headerType;
                int iHashCode40 = (iHashCode39 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                ActionInteractive actionInteractive = this.actionInteractive;
                int iHashCode41 = (iHashCode40 ^ (actionInteractive == null ? 0 : actionInteractive.hashCode())) * 1000003;
                List<Button> list3 = this.buttons;
                int iHashCode42 = (iHashCode41 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                List<Parameter> list4 = this.parameters;
                int iHashCode43 = (iHashCode42 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                String str36 = this.mediaObjectId;
                int iHashCode44 = (iHashCode43 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.mediaMetadata;
                int iHashCode45 = (iHashCode44 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                Boolean bool2 = this.hasImage;
                int iHashCode46 = (iHashCode45 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str38 = this.thumbnailUrl;
                int iHashCode47 = (iHashCode46 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                Boolean bool3 = this.isInbound;
                int iHashCode48 = (iHashCode47 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                String str39 = this.chatUserId;
                int iHashCode49 = (iHashCode48 ^ (str39 == null ? 0 : str39.hashCode())) * 1000003;
                String str40 = this.chatUserName;
                int iHashCode50 = (iHashCode49 ^ (str40 == null ? 0 : str40.hashCode())) * 1000003;
                String str41 = this.chatBotId;
                int iHashCode51 = (iHashCode50 ^ (str41 == null ? 0 : str41.hashCode())) * 1000003;
                String str42 = this.chatUserAccountIdIfExternal;
                int iHashCode52 = (iHashCode51 ^ (str42 == null ? 0 : str42.hashCode())) * 1000003;
                String str43 = this.chatUserAccountNameIfExternal;
                int iHashCode53 = (iHashCode52 ^ (str43 == null ? 0 : str43.hashCode())) * 1000003;
                String str44 = this.directChatUserId;
                int iHashCode54 = (iHashCode53 ^ (str44 == null ? 0 : str44.hashCode())) * 1000003;
                List<Mentioned> list5 = this.mentioned;
                int iHashCode55 = (iHashCode54 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
                String str45 = this.primaryTeamId;
                int iHashCode56 = (iHashCode55 ^ (str45 == null ? 0 : str45.hashCode())) * 1000003;
                String str46 = this.linkedEngagementIdIfBroadcast;
                int iHashCode57 = (iHashCode56 ^ (str46 == null ? 0 : str46.hashCode())) * 1000003;
                String str47 = this.createdAt;
                int iHashCode58 = (iHashCode57 ^ (str47 == null ? 0 : str47.hashCode())) * 1000003;
                String str48 = this.updatedAt;
                int iHashCode59 = (iHashCode58 ^ (str48 == null ? 0 : str48.hashCode())) * 1000003;
                Channel channel = this.channel;
                int iHashCode60 = (iHashCode59 ^ (channel == null ? 0 : channel.hashCode())) * 1000003;
                ReplyingToMessage replyingToMessage = this.replyingToMessage;
                int iHashCode61 = (iHashCode60 ^ (replyingToMessage == null ? 0 : replyingToMessage.hashCode())) * 1000003;
                ResponseMessage responseMessage = this.responseMessage;
                int iHashCode62 = (iHashCode61 ^ (responseMessage == null ? 0 : responseMessage.hashCode())) * 1000003;
                Media media = this.media;
                int iHashCode63 = (iHashCode62 ^ (media == null ? 0 : media.hashCode())) * 1000003;
                Contact contact = this.contact;
                int iHashCode64 = (iHashCode63 ^ (contact == null ? 0 : contact.hashCode())) * 1000003;
                ReferredContact referredContact = this.referredContact;
                int iHashCode65 = (iHashCode64 ^ (referredContact == null ? 0 : referredContact.hashCode())) * 1000003;
                ChatUser chatUser = this.chatUser;
                this.$hashCode = iHashCode65 ^ (chatUser != null ? chatUser.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String headerText() {
            return this.headerText;
        }

        public String headerType() {
            return this.headerType;
        }

        public String id() {
            return this.id;
        }

        public String internalTemplateId() {
            return this.internalTemplateId;
        }

        public Boolean isInbound() {
            return this.isInbound;
        }

        public Boolean isStarred() {
            return this.isStarred;
        }

        public String linkedEngagementIdIfBroadcast() {
            return this.linkedEngagementIdIfBroadcast;
        }

        public String locationObjectToSend() {
            return this.locationObjectToSend;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateChatMessage.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateChatMessage.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateChatMessage.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateChatMessage.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], CreateChatMessage.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], CreateChatMessage.this.messagePlatform);
                    responseWriter.writeString(responseFieldArr[5], CreateChatMessage.this.externalMessageReferenceId);
                    responseWriter.writeString(responseFieldArr[6], CreateChatMessage.this.externalConversationId);
                    responseWriter.writeString(responseFieldArr[7], CreateChatMessage.this.recipientExternalId);
                    responseWriter.writeString(responseFieldArr[8], CreateChatMessage.this.recipientExternalIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CreateChatMessage.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], CreateChatMessage.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], CreateChatMessage.this.visitorId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CreateChatMessage.this.referredContactId);
                    responseWriter.writeString(responseFieldArr[13], CreateChatMessage.this.messageType);
                    responseWriter.writeString(responseFieldArr[14], CreateChatMessage.this.messageSubType);
                    responseWriter.writeString(responseFieldArr[15], CreateChatMessage.this.messageCategory);
                    ResponseField responseField = responseFieldArr[16];
                    MessageSendCategory messageSendCategory = CreateChatMessage.this.messageSendCategory;
                    responseWriter.writeString(responseField, messageSendCategory != null ? messageSendCategory.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], CreateChatMessage.this.replyingToMessageId);
                    responseWriter.writeString(responseFieldArr[18], CreateChatMessage.this.replyingToMessageIdExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], CreateChatMessage.this.responseMessageId);
                    responseWriter.writeString(responseFieldArr[20], CreateChatMessage.this.followUpType);
                    responseWriter.writeString(responseFieldArr[21], CreateChatMessage.this.replyType);
                    responseWriter.writeString(responseFieldArr[22], CreateChatMessage.this.replyTypeId);
                    responseWriter.writeString(responseFieldArr[23], CreateChatMessage.this.referredProductCatalogId);
                    responseWriter.writeString(responseFieldArr[24], CreateChatMessage.this.referredProductRetailerId);
                    responseWriter.writeList(responseFieldArr[25], CreateChatMessage.this.productItems, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((ProductItem) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], CreateChatMessage.this.referral);
                    responseWriter.writeBoolean(responseFieldArr[27], CreateChatMessage.this.isStarred);
                    responseWriter.writeString(responseFieldArr[28], CreateChatMessage.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[29], CreateChatMessage.this.errorMessages);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], CreateChatMessage.this.sentAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], CreateChatMessage.this.deliveredAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], CreateChatMessage.this.readAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], CreateChatMessage.this.internalTemplateId);
                    responseWriter.writeString(responseFieldArr[34], CreateChatMessage.this.externalTemplateId);
                    responseWriter.writeString(responseFieldArr[35], CreateChatMessage.this.externalTemplateCategory);
                    responseWriter.writeString(responseFieldArr[36], CreateChatMessage.this.text);
                    responseWriter.writeList(responseFieldArr[37], CreateChatMessage.this.contactObjectToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], CreateChatMessage.this.locationObjectToSend);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], CreateChatMessage.this.adddressMessageParameters);
                    responseWriter.writeString(responseFieldArr[40], CreateChatMessage.this.headerText);
                    responseWriter.writeString(responseFieldArr[41], CreateChatMessage.this.footerText);
                    responseWriter.writeString(responseFieldArr[42], CreateChatMessage.this.headerType);
                    ResponseField responseField2 = responseFieldArr[43];
                    ActionInteractive actionInteractive = CreateChatMessage.this.actionInteractive;
                    responseWriter.writeObject(responseField2, actionInteractive != null ? actionInteractive.marshaller() : null);
                    responseWriter.writeList(responseFieldArr[44], CreateChatMessage.this.buttons, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Button) obj).marshaller());
                        }
                    });
                    responseWriter.writeList(responseFieldArr[45], CreateChatMessage.this.parameters, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Parameter) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[46], CreateChatMessage.this.mediaObjectId);
                    responseWriter.writeString(responseFieldArr[47], CreateChatMessage.this.mediaMetadata);
                    responseWriter.writeBoolean(responseFieldArr[48], CreateChatMessage.this.hasImage);
                    responseWriter.writeString(responseFieldArr[49], CreateChatMessage.this.thumbnailUrl);
                    responseWriter.writeBoolean(responseFieldArr[50], CreateChatMessage.this.isInbound);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[51], CreateChatMessage.this.chatUserId);
                    responseWriter.writeString(responseFieldArr[52], CreateChatMessage.this.chatUserName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[53], CreateChatMessage.this.chatBotId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], CreateChatMessage.this.chatUserAccountIdIfExternal);
                    responseWriter.writeString(responseFieldArr[55], CreateChatMessage.this.chatUserAccountNameIfExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], CreateChatMessage.this.directChatUserId);
                    responseWriter.writeList(responseFieldArr[57], CreateChatMessage.this.mentioned, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.CreateChatMessage.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Mentioned) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], CreateChatMessage.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[59], CreateChatMessage.this.linkedEngagementIdIfBroadcast);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[60], CreateChatMessage.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[61], CreateChatMessage.this.updatedAt);
                    ResponseField responseField3 = responseFieldArr[62];
                    Channel channel = CreateChatMessage.this.channel;
                    responseWriter.writeObject(responseField3, channel != null ? channel.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[63];
                    ReplyingToMessage replyingToMessage = CreateChatMessage.this.replyingToMessage;
                    responseWriter.writeObject(responseField4, replyingToMessage != null ? replyingToMessage.marshaller() : null);
                    ResponseField responseField5 = responseFieldArr[64];
                    ResponseMessage responseMessage = CreateChatMessage.this.responseMessage;
                    responseWriter.writeObject(responseField5, responseMessage != null ? responseMessage.marshaller() : null);
                    ResponseField responseField6 = responseFieldArr[65];
                    Media media = CreateChatMessage.this.media;
                    responseWriter.writeObject(responseField6, media != null ? media.marshaller() : null);
                    ResponseField responseField7 = responseFieldArr[66];
                    Contact contact = CreateChatMessage.this.contact;
                    responseWriter.writeObject(responseField7, contact != null ? contact.marshaller() : null);
                    ResponseField responseField8 = responseFieldArr[67];
                    ReferredContact referredContact = CreateChatMessage.this.referredContact;
                    responseWriter.writeObject(responseField8, referredContact != null ? referredContact.marshaller() : null);
                    ResponseField responseField9 = responseFieldArr[68];
                    ChatUser chatUser = CreateChatMessage.this.chatUser;
                    responseWriter.writeObject(responseField9, chatUser != null ? chatUser.marshaller() : null);
                }
            };
        }

        public Media media() {
            return this.media;
        }

        public String mediaMetadata() {
            return this.mediaMetadata;
        }

        public String mediaObjectId() {
            return this.mediaObjectId;
        }

        public List<Mentioned> mentioned() {
            return this.mentioned;
        }

        public String messageCategory() {
            return this.messageCategory;
        }

        public String messagePlatform() {
            return this.messagePlatform;
        }

        public MessageSendCategory messageSendCategory() {
            return this.messageSendCategory;
        }

        public String messageSubType() {
            return this.messageSubType;
        }

        public String messageType() {
            return this.messageType;
        }

        public List<Parameter> parameters() {
            return this.parameters;
        }

        public String phoneNumberIdExternal() {
            return this.phoneNumberIdExternal;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public List<ProductItem> productItems() {
            return this.productItems;
        }

        public String readAt() {
            return this.readAt;
        }

        public String recipientExternalId() {
            return this.recipientExternalId;
        }

        public String recipientExternalIdType() {
            return this.recipientExternalIdType;
        }

        public String referral() {
            return this.referral;
        }

        public ReferredContact referredContact() {
            return this.referredContact;
        }

        public String referredContactId() {
            return this.referredContactId;
        }

        public String referredProductCatalogId() {
            return this.referredProductCatalogId;
        }

        public String referredProductRetailerId() {
            return this.referredProductRetailerId;
        }

        public String replyType() {
            return this.replyType;
        }

        public String replyTypeId() {
            return this.replyTypeId;
        }

        public ReplyingToMessage replyingToMessage() {
            return this.replyingToMessage;
        }

        public String replyingToMessageId() {
            return this.replyingToMessageId;
        }

        public String replyingToMessageIdExternal() {
            return this.replyingToMessageIdExternal;
        }

        public ResponseMessage responseMessage() {
            return this.responseMessage;
        }

        public String responseMessageId() {
            return this.responseMessageId;
        }

        public String sentAt() {
            return this.sentAt;
        }

        public String status() {
            return this.status;
        }

        public String text() {
            return this.text;
        }

        public String thumbnailUrl() {
            return this.thumbnailUrl;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateChatMessage{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", messagePlatform=" + this.messagePlatform + ", externalMessageReferenceId=" + this.externalMessageReferenceId + ", externalConversationId=" + this.externalConversationId + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", channelId=" + this.channelId + ", contactId=" + this.contactId + ", visitorId=" + this.visitorId + ", referredContactId=" + this.referredContactId + ", messageType=" + this.messageType + ", messageSubType=" + this.messageSubType + ", messageCategory=" + this.messageCategory + ", messageSendCategory=" + this.messageSendCategory + ", replyingToMessageId=" + this.replyingToMessageId + ", replyingToMessageIdExternal=" + this.replyingToMessageIdExternal + ", responseMessageId=" + this.responseMessageId + ", followUpType=" + this.followUpType + ", replyType=" + this.replyType + ", replyTypeId=" + this.replyTypeId + ", referredProductCatalogId=" + this.referredProductCatalogId + ", referredProductRetailerId=" + this.referredProductRetailerId + ", productItems=" + this.productItems + ", referral=" + this.referral + ", isStarred=" + this.isStarred + ", status=" + this.status + ", errorMessages=" + this.errorMessages + ", sentAt=" + this.sentAt + ", deliveredAt=" + this.deliveredAt + ", readAt=" + this.readAt + ", internalTemplateId=" + this.internalTemplateId + ", externalTemplateId=" + this.externalTemplateId + ", externalTemplateCategory=" + this.externalTemplateCategory + ", text=" + this.text + ", contactObjectToSend=" + this.contactObjectToSend + ", locationObjectToSend=" + this.locationObjectToSend + ", adddressMessageParameters=" + this.adddressMessageParameters + ", headerText=" + this.headerText + ", footerText=" + this.footerText + ", headerType=" + this.headerType + ", actionInteractive=" + this.actionInteractive + ", buttons=" + this.buttons + ", parameters=" + this.parameters + ", mediaObjectId=" + this.mediaObjectId + ", mediaMetadata=" + this.mediaMetadata + ", hasImage=" + this.hasImage + ", thumbnailUrl=" + this.thumbnailUrl + ", isInbound=" + this.isInbound + ", chatUserId=" + this.chatUserId + ", chatUserName=" + this.chatUserName + ", chatBotId=" + this.chatBotId + ", chatUserAccountIdIfExternal=" + this.chatUserAccountIdIfExternal + ", chatUserAccountNameIfExternal=" + this.chatUserAccountNameIfExternal + ", directChatUserId=" + this.directChatUserId + ", mentioned=" + this.mentioned + ", primaryTeamId=" + this.primaryTeamId + ", linkedEngagementIdIfBroadcast=" + this.linkedEngagementIdIfBroadcast + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", channel=" + this.channel + ", replyingToMessage=" + this.replyingToMessage + ", responseMessage=" + this.responseMessage + ", media=" + this.media + ", contact=" + this.contact + ", referredContact=" + this.referredContact + ", chatUser=" + this.chatUser + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String visitorId() {
            return this.visitorId;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createChatMessage", "createChatMessage", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateChatMessage createChatMessage;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateChatMessage.Mapper createChatMessageFieldMapper = new CreateChatMessage.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateChatMessage) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateChatMessage>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateChatMessage read(ResponseReader responseReader2) {
                        return Mapper.this.createChatMessageFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateChatMessage createChatMessage) {
            this.createChatMessage = createChatMessage;
        }

        public CreateChatMessage createChatMessage() {
            return this.createChatMessage;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateChatMessage createChatMessage = this.createChatMessage;
            CreateChatMessage createChatMessage2 = ((Data) obj).createChatMessage;
            return createChatMessage == null ? createChatMessage2 == null : createChatMessage.equals(createChatMessage2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateChatMessage createChatMessage = this.createChatMessage;
                this.$hashCode = (createChatMessage == null ? 0 : createChatMessage.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateChatMessage createChatMessage = Data.this.createChatMessage;
                    responseWriter.writeObject(responseField, createChatMessage != null ? createChatMessage.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createChatMessage=" + this.createChatMessage + "}";
            }
            return this.$toString;
        }
    }

    public static class Media {
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

        public static final class Mapper implements ResponseFieldMapper<Media> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Media map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Media.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                List list = responseReader.readList(responseFieldArr[9], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Media.Mapper.1
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
                return new Media(string, str, str2, string2, string3, string4, string5, string6, string7, list, string8, string9, string10, str3, string11, string12, str4, string13, string14, hasParentValueOf, str5, string16 != null ? ScopeLevel.valueOf(string16) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileUrl", "fileUrl", null, true, Collections.emptyList()), ResponseField.forString("fileStorageDestination", "fileStorageDestination", null, true, Collections.emptyList()), ResponseField.forString("fileName", "fileName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("documentCategory", "documentCategory", null, true, Collections.emptyList()), ResponseField.forString("documentSubCategory", "documentSubCategory", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("templateType", "templateType", null, true, Collections.emptyList()), ResponseField.forString("templateTitle", "templateTitle", null, true, Collections.emptyList()), ResponseField.forString("templateBody", "templateBody", null, true, Collections.emptyList()), ResponseField.forCustomType("templateLastUsed", "templateLastUsed", null, true, customType2, Collections.emptyList()), ResponseField.forString("templateExternalLink", "templateExternalLink", null, true, Collections.emptyList()), ResponseField.forString("uploadSource", "uploadSource", null, true, Collections.emptyList()), ResponseField.forCustomType("fileMetaData", "fileMetaData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("fileMimeType", "fileMimeType", null, true, Collections.emptyList()), ResponseField.forString("fileThumbnailUrl", "fileThumbnailUrl", null, true, Collections.emptyList()), ResponseField.forString("hasParent", "hasParent", null, true, Collections.emptyList()), ResponseField.forCustomType("parentFileId", "parentFileId", null, true, customType, Collections.emptyList()), ResponseField.forString("scopeLevel", "scopeLevel", null, true, Collections.emptyList()), ResponseField.forCustomType("scopeId", "scopeId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("uploadedById", "uploadedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Media(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, HasParent hasParent, String str19, ScopeLevel scopeLevel, String str20, String str21, String str22, String str23) {
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
            if (!(obj instanceof Media)) {
                return false;
            }
            Media media = (Media) obj;
            if (this.__typename.equals(media.__typename) && this.id.equals(media.id) && this.accountId.equals(media.accountId) && ((str = this.fileUrl) != null ? str.equals(media.fileUrl) : media.fileUrl == null) && ((str2 = this.fileStorageDestination) != null ? str2.equals(media.fileStorageDestination) : media.fileStorageDestination == null) && ((str3 = this.fileName) != null ? str3.equals(media.fileName) : media.fileName == null) && ((str4 = this.description) != null ? str4.equals(media.description) : media.description == null) && ((str5 = this.documentCategory) != null ? str5.equals(media.documentCategory) : media.documentCategory == null) && ((str6 = this.documentSubCategory) != null ? str6.equals(media.documentSubCategory) : media.documentSubCategory == null) && ((list = this.tags) != null ? list.equals(media.tags) : media.tags == null) && ((str7 = this.templateType) != null ? str7.equals(media.templateType) : media.templateType == null) && ((str8 = this.templateTitle) != null ? str8.equals(media.templateTitle) : media.templateTitle == null) && ((str9 = this.templateBody) != null ? str9.equals(media.templateBody) : media.templateBody == null) && ((str10 = this.templateLastUsed) != null ? str10.equals(media.templateLastUsed) : media.templateLastUsed == null) && ((str11 = this.templateExternalLink) != null ? str11.equals(media.templateExternalLink) : media.templateExternalLink == null) && ((str12 = this.uploadSource) != null ? str12.equals(media.uploadSource) : media.uploadSource == null) && ((str13 = this.fileMetaData) != null ? str13.equals(media.fileMetaData) : media.fileMetaData == null) && ((str14 = this.fileMimeType) != null ? str14.equals(media.fileMimeType) : media.fileMimeType == null) && ((str15 = this.fileThumbnailUrl) != null ? str15.equals(media.fileThumbnailUrl) : media.fileThumbnailUrl == null) && ((hasParent = this.hasParent) != null ? hasParent.equals(media.hasParent) : media.hasParent == null) && ((str16 = this.parentFileId) != null ? str16.equals(media.parentFileId) : media.parentFileId == null) && ((scopeLevel = this.scopeLevel) != null ? scopeLevel.equals(media.scopeLevel) : media.scopeLevel == null) && ((str17 = this.scopeId) != null ? str17.equals(media.scopeId) : media.scopeId == null) && ((str18 = this.uploadedById) != null ? str18.equals(media.uploadedById) : media.uploadedById == null) && ((str19 = this.createdAt) != null ? str19.equals(media.createdAt) : media.createdAt == null)) {
                String str20 = this.updatedAt;
                String str21 = media.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Media.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Media.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Media.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Media.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Media.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Media.this.fileUrl);
                    responseWriter.writeString(responseFieldArr[4], Media.this.fileStorageDestination);
                    responseWriter.writeString(responseFieldArr[5], Media.this.fileName);
                    responseWriter.writeString(responseFieldArr[6], Media.this.description);
                    responseWriter.writeString(responseFieldArr[7], Media.this.documentCategory);
                    responseWriter.writeString(responseFieldArr[8], Media.this.documentSubCategory);
                    responseWriter.writeList(responseFieldArr[9], Media.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Media.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[10], Media.this.templateType);
                    responseWriter.writeString(responseFieldArr[11], Media.this.templateTitle);
                    responseWriter.writeString(responseFieldArr[12], Media.this.templateBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Media.this.templateLastUsed);
                    responseWriter.writeString(responseFieldArr[14], Media.this.templateExternalLink);
                    responseWriter.writeString(responseFieldArr[15], Media.this.uploadSource);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Media.this.fileMetaData);
                    responseWriter.writeString(responseFieldArr[17], Media.this.fileMimeType);
                    responseWriter.writeString(responseFieldArr[18], Media.this.fileThumbnailUrl);
                    ResponseField responseField = responseFieldArr[19];
                    HasParent hasParent = Media.this.hasParent;
                    responseWriter.writeString(responseField, hasParent != null ? hasParent.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Media.this.parentFileId);
                    ResponseField responseField2 = responseFieldArr[21];
                    ScopeLevel scopeLevel = Media.this.scopeLevel;
                    responseWriter.writeString(responseField2, scopeLevel != null ? scopeLevel.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Media.this.scopeId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Media.this.uploadedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Media.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Media.this.updatedAt);
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
                this.$toString = "Media{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", fileUrl=" + this.fileUrl + ", fileStorageDestination=" + this.fileStorageDestination + ", fileName=" + this.fileName + ", description=" + this.description + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", tags=" + this.tags + ", templateType=" + this.templateType + ", templateTitle=" + this.templateTitle + ", templateBody=" + this.templateBody + ", templateLastUsed=" + this.templateLastUsed + ", templateExternalLink=" + this.templateExternalLink + ", uploadSource=" + this.uploadSource + ", fileMetaData=" + this.fileMetaData + ", fileMimeType=" + this.fileMimeType + ", fileThumbnailUrl=" + this.fileThumbnailUrl + ", hasParent=" + this.hasParent + ", parentFileId=" + this.parentFileId + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", uploadedById=" + this.uploadedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Mentioned.1
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

    public static class Parameter {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("taType", "taType", null, true, Collections.emptyList()), ResponseField.forString("sub_type", "sub_type", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.INDEX, FirebaseAnalytics.Param.INDEX, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String index;
        final String sub_type;
        final String taType;

        public static final class Mapper implements ResponseFieldMapper<Parameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Parameter map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Parameter.$responseFields;
                return new Parameter(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]));
            }
        }

        public Parameter(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.taType = str2;
            this.sub_type = str3;
            this.index = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) obj;
            if (this.__typename.equals(parameter.__typename) && ((str = this.taType) != null ? str.equals(parameter.taType) : parameter.taType == null) && ((str2 = this.sub_type) != null ? str2.equals(parameter.sub_type) : parameter.sub_type == null)) {
                String str3 = this.index;
                String str4 = parameter.index;
                if (str3 == null) {
                    if (str4 == null) {
                        return true;
                    }
                } else if (str3.equals(str4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.taType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.sub_type;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.index;
                this.$hashCode = iHashCode3 ^ (str3 != null ? str3.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String index() {
            return this.index;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Parameter.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Parameter.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Parameter.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Parameter.this.taType);
                    responseWriter.writeString(responseFieldArr[2], Parameter.this.sub_type);
                    responseWriter.writeString(responseFieldArr[3], Parameter.this.index);
                }
            };
        }

        public String sub_type() {
            return this.sub_type;
        }

        public String taType() {
            return this.taType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Parameter{__typename=" + this.__typename + ", taType=" + this.taType + ", sub_type=" + this.sub_type + ", index=" + this.index + "}";
            }
            return this.$toString;
        }
    }

    public static class ProductItem {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("product_retailer_id", "product_retailer_id", null, true, Collections.emptyList()), ResponseField.forInt(FirebaseAnalytics.Param.QUANTITY, FirebaseAnalytics.Param.QUANTITY, null, true, Collections.emptyList()), ResponseField.forInt("item_price", "item_price", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String currency;
        final Integer item_price;
        final String product_retailer_id;
        final Integer quantity;

        public static final class Mapper implements ResponseFieldMapper<ProductItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ProductItem map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ProductItem.$responseFields;
                return new ProductItem(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readInt(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]));
            }
        }

        public ProductItem(String str, String str2, Integer num, Integer num2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.product_retailer_id = str2;
            this.quantity = num;
            this.item_price = num2;
            this.currency = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String currency() {
            return this.currency;
        }

        public boolean equals(Object obj) {
            String str;
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProductItem)) {
                return false;
            }
            ProductItem productItem = (ProductItem) obj;
            if (this.__typename.equals(productItem.__typename) && ((str = this.product_retailer_id) != null ? str.equals(productItem.product_retailer_id) : productItem.product_retailer_id == null) && ((num = this.quantity) != null ? num.equals(productItem.quantity) : productItem.quantity == null) && ((num2 = this.item_price) != null ? num2.equals(productItem.item_price) : productItem.item_price == null)) {
                String str2 = this.currency;
                String str3 = productItem.currency;
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
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.product_retailer_id;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Integer num = this.quantity;
                int iHashCode3 = (iHashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.item_price;
                int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str2 = this.currency;
                this.$hashCode = iHashCode4 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Integer item_price() {
            return this.item_price;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ProductItem.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ProductItem.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ProductItem.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ProductItem.this.product_retailer_id);
                    responseWriter.writeInt(responseFieldArr[2], ProductItem.this.quantity);
                    responseWriter.writeInt(responseFieldArr[3], ProductItem.this.item_price);
                    responseWriter.writeString(responseFieldArr[4], ProductItem.this.currency);
                }
            };
        }

        public String product_retailer_id() {
            return this.product_retailer_id;
        }

        public Integer quantity() {
            return this.quantity;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ProductItem{__typename=" + this.__typename + ", product_retailer_id=" + this.product_retailer_id + ", quantity=" + this.quantity + ", item_price=" + this.item_price + ", currency=" + this.currency + "}";
            }
            return this.$toString;
        }
    }

    public static class ReferredContact {
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

        public static final class Mapper implements ResponseFieldMapper<ReferredContact> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ReferredContact map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ReferredContact.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                ContactAssignmentStatus contactAssignmentStatusValueOf = string2 != null ? ContactAssignmentStatus.valueOf(string2) : null;
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                List list2 = responseReader.readList(responseFieldArr[7], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.Mapper.2
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
                List list3 = responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<Day>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.Mapper.3
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
                List list4 = responseReader.readList(responseFieldArr[92], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                List list5 = responseReader.readList(responseFieldArr[93], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string45 = responseReader.readString(responseFieldArr[94]);
                String string46 = responseReader.readString(responseFieldArr[95]);
                String string47 = responseReader.readString(responseFieldArr[96]);
                List list6 = responseReader.readList(responseFieldArr[97], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.Mapper.6
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
                return new ReferredContact(string, str, str2, str3, contactAssignmentStatusValueOf, list, str4, list2, string3, str5, str6, str7, string4, str8, string5, str9, string6, string7, string8, string9, str10, str11, str12, contactStatusValueOf, string11, string12, string13, str13, string14, string15, bool, bool2, str14, string16, list3, string17, string18, string19, seniorityValueOf, str15, bool3, taskActivityTypeValueOf, str16, callDirectionValueOf, string23, string24, str17, num, string25, str18, string26, string27, str19, string28, str20, str21, string29, str22, str23, string30, str24, string31, string32, string33, str25, string34, str26, str27, string35, str28, str29, string36, str30, str31, string37, num2, string38, str32, str33, str34, str35, string39, string40, string41, str36, string42, str37, string43, string44, str38, num3, num4, list4, list5, string45, string46, string47, list6, str39, str40, str41, str42, str43, str44, str45, str46, string48, str47, leadLifecycleStageValueOf, string50 != null ? LeadLifecycleStageSubCategory.valueOf(string50) : null, responseReader.readString(responseFieldArr[110]), responseReader.readString(responseFieldArr[111]), responseReader.readInt(responseFieldArr[112]), responseReader.readInt(responseFieldArr[113]), responseReader.readInt(responseFieldArr[114]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[115]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[116]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[117]), responseReader.readString(responseFieldArr[118]), responseReader.readString(responseFieldArr[119]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[120]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[121]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[122]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[123]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forList("sharedOwners", "sharedOwners", null, true, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forList("sharedTeams", "sharedTeams", null, true, Collections.emptyList()), ResponseField.forString("accountPriority", "accountPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("assignedToId", "assignedToId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("blockedForCallById", "blockedForCallById", null, true, customType, Collections.emptyList()), ResponseField.forString("blockedForCallReason", "blockedForCallReason", null, true, Collections.emptyList()), ResponseField.forCustomType("blockedForCallUntil", "blockedForCallUntil", null, true, customType2, Collections.emptyList()), ResponseField.forString("callPriority", "callPriority", null, true, Collections.emptyList()), ResponseField.forCustomType("waChatChannelId", "waChatChannelId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactSource", "contactSource", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownOne", "contactSourceDrillDownOne", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownTwo", "contactSourceDrillDownTwo", null, true, Collections.emptyList()), ResponseField.forString("contactSourceDrillDownThree", "contactSourceDrillDownThree", null, true, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownOneId", "contactSourceDrillDownOneId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownTwoId", "contactSourceDrillDownTwoId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactSourceDrillDownThreeId", "contactSourceDrillDownThreeId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactStatus", "contactStatus", null, true, Collections.emptyList()), ResponseField.forString("contactType", "contactType", null, true, Collections.emptyList()), ResponseField.forString("department", "department", null, true, Collections.emptyList()), ResponseField.forString("designation", "designation", null, true, Collections.emptyList()), ResponseField.forCustomType("lastRepeatEnquiryDate", "lastRepeatEnquiryDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastRepeatEnquirySource", "lastRepeatEnquirySource", null, true, Collections.emptyList()), ResponseField.forString("gender", "gender", null, true, Collections.emptyList()), ResponseField.forBoolean("isDecisionMaker", "isDecisionMaker", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrivate", "isPrivate", null, true, Collections.emptyList()), ResponseField.forCustomType("lockPeriod", "lockPeriod", null, true, customType2, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forList("preferredContactDays", "preferredContactDays", null, true, Collections.emptyList()), ResponseField.forString("profilePhotoUrl", "profilePhotoUrl", null, true, Collections.emptyList()), ResponseField.forString("referredBy", "referredBy", null, true, Collections.emptyList()), ResponseField.forString("salutation", "salutation", null, true, Collections.emptyList()), ResponseField.forString("seniority", "seniority", null, true, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("hasTask", "hasTask", null, true, Collections.emptyList()), ResponseField.forString("openTaskActivityType", "openTaskActivityType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCalledTime", "lastCalledTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastCallDirection", "lastCallDirection", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcome", "lastCallOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastCallOutcomeNature", "lastCallOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCallUserId", "lastCallUserId", null, true, customType, Collections.emptyList()), ResponseField.forInt("lastCallDuration", "lastCallDuration", null, true, Collections.emptyList()), ResponseField.forString("lastCallEngagementId", "lastCallEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitTime", "lastVisitTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastVisitOutcome", "lastVisitOutcome", null, true, Collections.emptyList()), ResponseField.forString("lastVisitOutcomeNature", "lastVisitOutcomeNature", null, true, Collections.emptyList()), ResponseField.forCustomType("lastVisitUserId", "lastVisitUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastVisitEngagementId", "lastVisitEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastEmailTime", "lastEmailTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEmailUserId", "lastEmailUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastEmailEngagementId", "lastEmailEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappTime", "lastWhatsappTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappUserId", "lastWhatsappUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastWhatsappEngagementId", "lastWhatsappEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastTime", "lastWabaBroadcastTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastStatus", "lastWabaBroadcastStatus", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastTemplate", "lastWabaBroadcastTemplate", null, true, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyBody", "lastWabaBroadcastReplyBody", null, true, Collections.emptyList()), ResponseField.forCustomType("lastWabaBroadcastReplyTime", "lastWabaBroadcastReplyTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastWabaBroadcastReplyType", "lastWabaBroadcastReplyType", null, true, Collections.emptyList()), ResponseField.forCustomType("lastSmsTime", "lastSmsTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastSmsUserId", "lastSmsUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastSmsEngagementId", "lastSmsEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastNoteAddedTime", "lastNoteAddedTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastNoteUserId", "lastNoteUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastNoteEngagementId", "lastNoteEngagementId", null, true, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneTime", "lastTaskDoneTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastTaskDoneUserId", "lastTaskDoneUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("lastTaskDoneEngagementId", "lastTaskDoneEngagementId", null, true, Collections.emptyList()), ResponseField.forInt("openTaskCount", "openTaskCount", null, true, Collections.emptyList()), ResponseField.forString("lastKnownDisposition", "lastKnownDisposition", null, true, Collections.emptyList()), ResponseField.forCustomType("lastKnownDispositionTime", "lastKnownDispositionTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastLeadAssignmentDateTime", "lastLeadAssignmentDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromAccount", "lastEngagementFromAccount", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEngagementFromContact", "lastEngagementFromContact", null, true, customType2, Collections.emptyList()), ResponseField.forString("freshLeadTag", "freshLeadTag", null, true, Collections.emptyList()), ResponseField.forString("noWorkAfterAssignment", "noWorkAfterAssignment", null, true, Collections.emptyList()), ResponseField.forString("needFollowUpTag", "needFollowUpTag", null, true, Collections.emptyList()), ResponseField.forCustomType("needFollowUpTagUpdatedAt", "needFollowUpTagUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("activeDealStage", "activeDealStage", null, true, Collections.emptyList()), ResponseField.forCustomType("activeDealStageUpdatedAt", "activeDealStageUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealDescription", "dealDescription", null, true, Collections.emptyList()), ResponseField.forString("isCustomer", "isCustomer", null, true, Collections.emptyList()), ResponseField.forCustomType("becameCustomerOn", "becameCustomerOn", null, true, customType2, Collections.emptyList()), ResponseField.forInt("unsuccessfulCallAttempts", "unsuccessfulCallAttempts", null, true, Collections.emptyList()), ResponseField.forInt("leadCallsNotAnswered", "leadCallsNotAnswered", null, true, Collections.emptyList()), ResponseField.forList("userDefinedTags", "userDefinedTags", null, true, Collections.emptyList()), ResponseField.forList("productService", "productService", null, true, Collections.emptyList()), ResponseField.forString("bulkUploadReference", "bulkUploadReference", null, true, Collections.emptyList()), ResponseField.forString("assignmentMethod", "assignmentMethod", null, true, Collections.emptyList()), ResponseField.forString("whatsappOptInStatus", "whatsappOptInStatus", null, true, Collections.emptyList()), ResponseField.forList("recentEngagements", "recentEngagements", null, true, Collections.emptyList()), ResponseField.forCustomType("recentEngagementsUpdatedAt", "recentEngagementsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("openTaskDetail", "openTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("openVideoCallDetail", "openVideoCallDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetail", "lastClosedTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("lastClosedTaskDetailUpdatedAt", "lastClosedTaskDetailUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("latestRemark", "latestRemark", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customAttributes", "customAttributes", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("paymentRequestDetail", "paymentRequestDetail", null, true, customType3, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("customDataAddedFromAddContactForm", "customDataAddedFromAddContactForm", null, true, customType3, Collections.emptyList()), ResponseField.forString("leadLifecycleStage", "leadLifecycleStage", null, true, Collections.emptyList()), ResponseField.forString("leadLifecycleStageSubCategory", "leadLifecycleStageSubCategory", null, true, Collections.emptyList()), ResponseField.forString("manualClosedReason", "manualClosedReason", null, true, Collections.emptyList()), ResponseField.forString("lastDealStageType", "lastDealStageType", null, true, Collections.emptyList()), ResponseField.forInt("prospectingAttempts", "prospectingAttempts", null, true, Collections.emptyList()), ResponseField.forInt("totalProspectingAttemptsAcrossRechurn", "totalProspectingAttemptsAcrossRechurn", null, true, Collections.emptyList()), ResponseField.forInt("numberOfTimesRechurned", "numberOfTimesRechurned", null, true, Collections.emptyList()), ResponseField.forCustomType("lastProspectingDoneOn", "lastProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("firstProspectingDoneOn", "firstProspectingDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextProspectingDueOn", "nextProspectingDueOn", null, true, customType2, Collections.emptyList()), ResponseField.forString("nextProspectingSetBy", "nextProspectingSetBy", null, true, Collections.emptyList()), ResponseField.forString("nextProspectingNote", "nextProspectingNote", null, true, Collections.emptyList()), ResponseField.forCustomType("movedToOpportunityOn", "movedToOpportunityOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("movedToClosedOn", "movedToClosedOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public ReferredContact(String str, String str2, String str3, String str4, ContactAssignmentStatus contactAssignmentStatus, List<String> list, String str5, List<String> list2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, ContactStatus contactStatus, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, Boolean bool2, String str27, String str28, List<Day> list3, String str29, String str30, String str31, Seniority seniority, String str32, Boolean bool3, TaskActivityType taskActivityType, String str33, CallDirection callDirection, String str34, String str35, String str36, Integer num, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, Integer num2, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, Integer num3, Integer num4, List<String> list4, List<String> list5, String str78, String str79, String str80, List<String> list6, String str81, String str82, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, LeadLifecycleStage leadLifecycleStage, LeadLifecycleStageSubCategory leadLifecycleStageSubCategory, String str91, String str92, Integer num5, Integer num6, Integer num7, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101) {
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
            if (!(obj instanceof ReferredContact)) {
                return false;
            }
            ReferredContact referredContact = (ReferredContact) obj;
            if (this.__typename.equals(referredContact.__typename) && this.id.equals(referredContact.id) && this.accountId.equals(referredContact.accountId) && ((str = this.ownerId) != null ? str.equals(referredContact.ownerId) : referredContact.ownerId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(referredContact.toBeAssigned) : referredContact.toBeAssigned == null) && ((list = this.sharedOwners) != null ? list.equals(referredContact.sharedOwners) : referredContact.sharedOwners == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(referredContact.primaryTeamId) : referredContact.primaryTeamId == null) && ((list2 = this.sharedTeams) != null ? list2.equals(referredContact.sharedTeams) : referredContact.sharedTeams == null) && ((str3 = this.accountPriority) != null ? str3.equals(referredContact.accountPriority) : referredContact.accountPriority == null) && ((str4 = this.addedById) != null ? str4.equals(referredContact.addedById) : referredContact.addedById == null) && ((str5 = this.assignedToId) != null ? str5.equals(referredContact.assignedToId) : referredContact.assignedToId == null) && ((str6 = this.blockedForCallById) != null ? str6.equals(referredContact.blockedForCallById) : referredContact.blockedForCallById == null) && ((str7 = this.blockedForCallReason) != null ? str7.equals(referredContact.blockedForCallReason) : referredContact.blockedForCallReason == null) && ((str8 = this.blockedForCallUntil) != null ? str8.equals(referredContact.blockedForCallUntil) : referredContact.blockedForCallUntil == null) && ((str9 = this.callPriority) != null ? str9.equals(referredContact.callPriority) : referredContact.callPriority == null) && ((str10 = this.waChatChannelId) != null ? str10.equals(referredContact.waChatChannelId) : referredContact.waChatChannelId == null) && ((str11 = this.contactSource) != null ? str11.equals(referredContact.contactSource) : referredContact.contactSource == null) && ((str12 = this.contactSourceDrillDownOne) != null ? str12.equals(referredContact.contactSourceDrillDownOne) : referredContact.contactSourceDrillDownOne == null) && ((str13 = this.contactSourceDrillDownTwo) != null ? str13.equals(referredContact.contactSourceDrillDownTwo) : referredContact.contactSourceDrillDownTwo == null) && ((str14 = this.contactSourceDrillDownThree) != null ? str14.equals(referredContact.contactSourceDrillDownThree) : referredContact.contactSourceDrillDownThree == null) && ((str15 = this.contactSourceDrillDownOneId) != null ? str15.equals(referredContact.contactSourceDrillDownOneId) : referredContact.contactSourceDrillDownOneId == null) && ((str16 = this.contactSourceDrillDownTwoId) != null ? str16.equals(referredContact.contactSourceDrillDownTwoId) : referredContact.contactSourceDrillDownTwoId == null) && ((str17 = this.contactSourceDrillDownThreeId) != null ? str17.equals(referredContact.contactSourceDrillDownThreeId) : referredContact.contactSourceDrillDownThreeId == null) && ((contactStatus = this.contactStatus) != null ? contactStatus.equals(referredContact.contactStatus) : referredContact.contactStatus == null) && ((str18 = this.contactType) != null ? str18.equals(referredContact.contactType) : referredContact.contactType == null) && ((str19 = this.department) != null ? str19.equals(referredContact.department) : referredContact.department == null) && ((str20 = this.designation) != null ? str20.equals(referredContact.designation) : referredContact.designation == null) && ((str21 = this.lastRepeatEnquiryDate) != null ? str21.equals(referredContact.lastRepeatEnquiryDate) : referredContact.lastRepeatEnquiryDate == null) && ((str22 = this.lastRepeatEnquirySource) != null ? str22.equals(referredContact.lastRepeatEnquirySource) : referredContact.lastRepeatEnquirySource == null) && ((str23 = this.gender) != null ? str23.equals(referredContact.gender) : referredContact.gender == null) && ((bool = this.isDecisionMaker) != null ? bool.equals(referredContact.isDecisionMaker) : referredContact.isDecisionMaker == null) && ((bool2 = this.isPrivate) != null ? bool2.equals(referredContact.isPrivate) : referredContact.isPrivate == null) && ((str24 = this.lockPeriod) != null ? str24.equals(referredContact.lockPeriod) : referredContact.lockPeriod == null) && ((str25 = this.name) != null ? str25.equals(referredContact.name) : referredContact.name == null) && ((list3 = this.preferredContactDays) != null ? list3.equals(referredContact.preferredContactDays) : referredContact.preferredContactDays == null) && ((str26 = this.profilePhotoUrl) != null ? str26.equals(referredContact.profilePhotoUrl) : referredContact.profilePhotoUrl == null) && ((str27 = this.referredBy) != null ? str27.equals(referredContact.referredBy) : referredContact.referredBy == null) && ((str28 = this.salutation) != null ? str28.equals(referredContact.salutation) : referredContact.salutation == null) && ((seniority = this.seniority) != null ? seniority.equals(referredContact.seniority) : referredContact.seniority == null) && ((str29 = this.updatedById) != null ? str29.equals(referredContact.updatedById) : referredContact.updatedById == null) && ((bool3 = this.hasTask) != null ? bool3.equals(referredContact.hasTask) : referredContact.hasTask == null) && ((taskActivityType = this.openTaskActivityType) != null ? taskActivityType.equals(referredContact.openTaskActivityType) : referredContact.openTaskActivityType == null) && ((str30 = this.lastCalledTime) != null ? str30.equals(referredContact.lastCalledTime) : referredContact.lastCalledTime == null) && ((callDirection = this.lastCallDirection) != null ? callDirection.equals(referredContact.lastCallDirection) : referredContact.lastCallDirection == null) && ((str31 = this.lastCallOutcome) != null ? str31.equals(referredContact.lastCallOutcome) : referredContact.lastCallOutcome == null) && ((str32 = this.lastCallOutcomeNature) != null ? str32.equals(referredContact.lastCallOutcomeNature) : referredContact.lastCallOutcomeNature == null) && ((str33 = this.lastCallUserId) != null ? str33.equals(referredContact.lastCallUserId) : referredContact.lastCallUserId == null) && ((num = this.lastCallDuration) != null ? num.equals(referredContact.lastCallDuration) : referredContact.lastCallDuration == null) && ((str34 = this.lastCallEngagementId) != null ? str34.equals(referredContact.lastCallEngagementId) : referredContact.lastCallEngagementId == null) && ((str35 = this.lastVisitTime) != null ? str35.equals(referredContact.lastVisitTime) : referredContact.lastVisitTime == null) && ((str36 = this.lastVisitOutcome) != null ? str36.equals(referredContact.lastVisitOutcome) : referredContact.lastVisitOutcome == null) && ((str37 = this.lastVisitOutcomeNature) != null ? str37.equals(referredContact.lastVisitOutcomeNature) : referredContact.lastVisitOutcomeNature == null) && ((str38 = this.lastVisitUserId) != null ? str38.equals(referredContact.lastVisitUserId) : referredContact.lastVisitUserId == null) && ((str39 = this.lastVisitEngagementId) != null ? str39.equals(referredContact.lastVisitEngagementId) : referredContact.lastVisitEngagementId == null) && ((str40 = this.lastEmailTime) != null ? str40.equals(referredContact.lastEmailTime) : referredContact.lastEmailTime == null) && ((str41 = this.lastEmailUserId) != null ? str41.equals(referredContact.lastEmailUserId) : referredContact.lastEmailUserId == null) && ((str42 = this.lastEmailEngagementId) != null ? str42.equals(referredContact.lastEmailEngagementId) : referredContact.lastEmailEngagementId == null) && ((str43 = this.lastWhatsappTime) != null ? str43.equals(referredContact.lastWhatsappTime) : referredContact.lastWhatsappTime == null) && ((str44 = this.lastWhatsappUserId) != null ? str44.equals(referredContact.lastWhatsappUserId) : referredContact.lastWhatsappUserId == null) && ((str45 = this.lastWhatsappEngagementId) != null ? str45.equals(referredContact.lastWhatsappEngagementId) : referredContact.lastWhatsappEngagementId == null) && ((str46 = this.lastWabaBroadcastTime) != null ? str46.equals(referredContact.lastWabaBroadcastTime) : referredContact.lastWabaBroadcastTime == null) && ((str47 = this.lastWabaBroadcastStatus) != null ? str47.equals(referredContact.lastWabaBroadcastStatus) : referredContact.lastWabaBroadcastStatus == null) && ((str48 = this.lastWabaBroadcastTemplate) != null ? str48.equals(referredContact.lastWabaBroadcastTemplate) : referredContact.lastWabaBroadcastTemplate == null) && ((str49 = this.lastWabaBroadcastReplyBody) != null ? str49.equals(referredContact.lastWabaBroadcastReplyBody) : referredContact.lastWabaBroadcastReplyBody == null) && ((str50 = this.lastWabaBroadcastReplyTime) != null ? str50.equals(referredContact.lastWabaBroadcastReplyTime) : referredContact.lastWabaBroadcastReplyTime == null) && ((str51 = this.lastWabaBroadcastReplyType) != null ? str51.equals(referredContact.lastWabaBroadcastReplyType) : referredContact.lastWabaBroadcastReplyType == null) && ((str52 = this.lastSmsTime) != null ? str52.equals(referredContact.lastSmsTime) : referredContact.lastSmsTime == null) && ((str53 = this.lastSmsUserId) != null ? str53.equals(referredContact.lastSmsUserId) : referredContact.lastSmsUserId == null) && ((str54 = this.lastSmsEngagementId) != null ? str54.equals(referredContact.lastSmsEngagementId) : referredContact.lastSmsEngagementId == null) && ((str55 = this.lastNoteAddedTime) != null ? str55.equals(referredContact.lastNoteAddedTime) : referredContact.lastNoteAddedTime == null) && ((str56 = this.lastNoteUserId) != null ? str56.equals(referredContact.lastNoteUserId) : referredContact.lastNoteUserId == null) && ((str57 = this.lastNoteEngagementId) != null ? str57.equals(referredContact.lastNoteEngagementId) : referredContact.lastNoteEngagementId == null) && ((str58 = this.lastTaskDoneTime) != null ? str58.equals(referredContact.lastTaskDoneTime) : referredContact.lastTaskDoneTime == null) && ((str59 = this.lastTaskDoneUserId) != null ? str59.equals(referredContact.lastTaskDoneUserId) : referredContact.lastTaskDoneUserId == null) && ((str60 = this.lastTaskDoneEngagementId) != null ? str60.equals(referredContact.lastTaskDoneEngagementId) : referredContact.lastTaskDoneEngagementId == null) && ((num2 = this.openTaskCount) != null ? num2.equals(referredContact.openTaskCount) : referredContact.openTaskCount == null) && ((str61 = this.lastKnownDisposition) != null ? str61.equals(referredContact.lastKnownDisposition) : referredContact.lastKnownDisposition == null) && ((str62 = this.lastKnownDispositionTime) != null ? str62.equals(referredContact.lastKnownDispositionTime) : referredContact.lastKnownDispositionTime == null) && ((str63 = this.lastLeadAssignmentDateTime) != null ? str63.equals(referredContact.lastLeadAssignmentDateTime) : referredContact.lastLeadAssignmentDateTime == null) && ((str64 = this.lastEngagementFromAccount) != null ? str64.equals(referredContact.lastEngagementFromAccount) : referredContact.lastEngagementFromAccount == null) && ((str65 = this.lastEngagementFromContact) != null ? str65.equals(referredContact.lastEngagementFromContact) : referredContact.lastEngagementFromContact == null) && ((str66 = this.freshLeadTag) != null ? str66.equals(referredContact.freshLeadTag) : referredContact.freshLeadTag == null) && ((str67 = this.noWorkAfterAssignment) != null ? str67.equals(referredContact.noWorkAfterAssignment) : referredContact.noWorkAfterAssignment == null) && ((str68 = this.needFollowUpTag) != null ? str68.equals(referredContact.needFollowUpTag) : referredContact.needFollowUpTag == null) && ((str69 = this.needFollowUpTagUpdatedAt) != null ? str69.equals(referredContact.needFollowUpTagUpdatedAt) : referredContact.needFollowUpTagUpdatedAt == null) && ((str70 = this.activeDealStage) != null ? str70.equals(referredContact.activeDealStage) : referredContact.activeDealStage == null) && ((str71 = this.activeDealStageUpdatedAt) != null ? str71.equals(referredContact.activeDealStageUpdatedAt) : referredContact.activeDealStageUpdatedAt == null) && ((str72 = this.dealDescription) != null ? str72.equals(referredContact.dealDescription) : referredContact.dealDescription == null) && ((str73 = this.isCustomer) != null ? str73.equals(referredContact.isCustomer) : referredContact.isCustomer == null) && ((str74 = this.becameCustomerOn) != null ? str74.equals(referredContact.becameCustomerOn) : referredContact.becameCustomerOn == null) && ((num3 = this.unsuccessfulCallAttempts) != null ? num3.equals(referredContact.unsuccessfulCallAttempts) : referredContact.unsuccessfulCallAttempts == null) && ((num4 = this.leadCallsNotAnswered) != null ? num4.equals(referredContact.leadCallsNotAnswered) : referredContact.leadCallsNotAnswered == null) && ((list4 = this.userDefinedTags) != null ? list4.equals(referredContact.userDefinedTags) : referredContact.userDefinedTags == null) && ((list5 = this.productService) != null ? list5.equals(referredContact.productService) : referredContact.productService == null) && ((str75 = this.bulkUploadReference) != null ? str75.equals(referredContact.bulkUploadReference) : referredContact.bulkUploadReference == null) && ((str76 = this.assignmentMethod) != null ? str76.equals(referredContact.assignmentMethod) : referredContact.assignmentMethod == null) && ((str77 = this.whatsappOptInStatus) != null ? str77.equals(referredContact.whatsappOptInStatus) : referredContact.whatsappOptInStatus == null) && ((list6 = this.recentEngagements) != null ? list6.equals(referredContact.recentEngagements) : referredContact.recentEngagements == null) && ((str78 = this.recentEngagementsUpdatedAt) != null ? str78.equals(referredContact.recentEngagementsUpdatedAt) : referredContact.recentEngagementsUpdatedAt == null) && ((str79 = this.openTaskDetail) != null ? str79.equals(referredContact.openTaskDetail) : referredContact.openTaskDetail == null) && ((str80 = this.openVideoCallDetail) != null ? str80.equals(referredContact.openVideoCallDetail) : referredContact.openVideoCallDetail == null) && ((str81 = this.lastClosedTaskDetail) != null ? str81.equals(referredContact.lastClosedTaskDetail) : referredContact.lastClosedTaskDetail == null) && ((str82 = this.lastClosedTaskDetailUpdatedAt) != null ? str82.equals(referredContact.lastClosedTaskDetailUpdatedAt) : referredContact.lastClosedTaskDetailUpdatedAt == null) && ((str83 = this.latestRemark) != null ? str83.equals(referredContact.latestRemark) : referredContact.latestRemark == null) && ((str84 = this.customAttributes) != null ? str84.equals(referredContact.customAttributes) : referredContact.customAttributes == null) && ((str85 = this.paymentRequestDetail) != null ? str85.equals(referredContact.paymentRequestDetail) : referredContact.paymentRequestDetail == null) && ((str86 = this.lastPaymentStatus) != null ? str86.equals(referredContact.lastPaymentStatus) : referredContact.lastPaymentStatus == null) && ((str87 = this.customDataAddedFromAddContactForm) != null ? str87.equals(referredContact.customDataAddedFromAddContactForm) : referredContact.customDataAddedFromAddContactForm == null) && ((leadLifecycleStage = this.leadLifecycleStage) != null ? leadLifecycleStage.equals(referredContact.leadLifecycleStage) : referredContact.leadLifecycleStage == null) && ((leadLifecycleStageSubCategory = this.leadLifecycleStageSubCategory) != null ? leadLifecycleStageSubCategory.equals(referredContact.leadLifecycleStageSubCategory) : referredContact.leadLifecycleStageSubCategory == null) && ((str88 = this.manualClosedReason) != null ? str88.equals(referredContact.manualClosedReason) : referredContact.manualClosedReason == null) && ((str89 = this.lastDealStageType) != null ? str89.equals(referredContact.lastDealStageType) : referredContact.lastDealStageType == null) && ((num5 = this.prospectingAttempts) != null ? num5.equals(referredContact.prospectingAttempts) : referredContact.prospectingAttempts == null) && ((num6 = this.totalProspectingAttemptsAcrossRechurn) != null ? num6.equals(referredContact.totalProspectingAttemptsAcrossRechurn) : referredContact.totalProspectingAttemptsAcrossRechurn == null) && ((num7 = this.numberOfTimesRechurned) != null ? num7.equals(referredContact.numberOfTimesRechurned) : referredContact.numberOfTimesRechurned == null) && ((str90 = this.lastProspectingDoneOn) != null ? str90.equals(referredContact.lastProspectingDoneOn) : referredContact.lastProspectingDoneOn == null) && ((str91 = this.firstProspectingDoneOn) != null ? str91.equals(referredContact.firstProspectingDoneOn) : referredContact.firstProspectingDoneOn == null) && ((str92 = this.nextProspectingDueOn) != null ? str92.equals(referredContact.nextProspectingDueOn) : referredContact.nextProspectingDueOn == null) && ((str93 = this.nextProspectingSetBy) != null ? str93.equals(referredContact.nextProspectingSetBy) : referredContact.nextProspectingSetBy == null) && ((str94 = this.nextProspectingNote) != null ? str94.equals(referredContact.nextProspectingNote) : referredContact.nextProspectingNote == null) && ((str95 = this.movedToOpportunityOn) != null ? str95.equals(referredContact.movedToOpportunityOn) : referredContact.movedToOpportunityOn == null) && ((str96 = this.movedToClosedOn) != null ? str96.equals(referredContact.movedToClosedOn) : referredContact.movedToClosedOn == null) && ((str97 = this.createdAt) != null ? str97.equals(referredContact.createdAt) : referredContact.createdAt == null)) {
                String str98 = this.updatedAt;
                String str99 = referredContact.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ReferredContact.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ReferredContact.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ReferredContact.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ReferredContact.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], ReferredContact.this.ownerId);
                    ResponseField responseField = responseFieldArr[4];
                    ContactAssignmentStatus contactAssignmentStatus = ReferredContact.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeList(responseFieldArr[5], ReferredContact.this.sharedOwners, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], ReferredContact.this.primaryTeamId);
                    responseWriter.writeList(responseFieldArr[7], ReferredContact.this.sharedTeams, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[8], ReferredContact.this.accountPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], ReferredContact.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], ReferredContact.this.assignedToId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], ReferredContact.this.blockedForCallById);
                    responseWriter.writeString(responseFieldArr[12], ReferredContact.this.blockedForCallReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], ReferredContact.this.blockedForCallUntil);
                    responseWriter.writeString(responseFieldArr[14], ReferredContact.this.callPriority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], ReferredContact.this.waChatChannelId);
                    responseWriter.writeString(responseFieldArr[16], ReferredContact.this.contactSource);
                    responseWriter.writeString(responseFieldArr[17], ReferredContact.this.contactSourceDrillDownOne);
                    responseWriter.writeString(responseFieldArr[18], ReferredContact.this.contactSourceDrillDownTwo);
                    responseWriter.writeString(responseFieldArr[19], ReferredContact.this.contactSourceDrillDownThree);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], ReferredContact.this.contactSourceDrillDownOneId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], ReferredContact.this.contactSourceDrillDownTwoId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], ReferredContact.this.contactSourceDrillDownThreeId);
                    ResponseField responseField2 = responseFieldArr[23];
                    ContactStatus contactStatus = ReferredContact.this.contactStatus;
                    responseWriter.writeString(responseField2, contactStatus != null ? contactStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[24], ReferredContact.this.contactType);
                    responseWriter.writeString(responseFieldArr[25], ReferredContact.this.department);
                    responseWriter.writeString(responseFieldArr[26], ReferredContact.this.designation);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], ReferredContact.this.lastRepeatEnquiryDate);
                    responseWriter.writeString(responseFieldArr[28], ReferredContact.this.lastRepeatEnquirySource);
                    responseWriter.writeString(responseFieldArr[29], ReferredContact.this.gender);
                    responseWriter.writeBoolean(responseFieldArr[30], ReferredContact.this.isDecisionMaker);
                    responseWriter.writeBoolean(responseFieldArr[31], ReferredContact.this.isPrivate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], ReferredContact.this.lockPeriod);
                    responseWriter.writeString(responseFieldArr[33], ReferredContact.this.name);
                    responseWriter.writeList(responseFieldArr[34], ReferredContact.this.preferredContactDays, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((Day) obj).name());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[35], ReferredContact.this.profilePhotoUrl);
                    responseWriter.writeString(responseFieldArr[36], ReferredContact.this.referredBy);
                    responseWriter.writeString(responseFieldArr[37], ReferredContact.this.salutation);
                    ResponseField responseField3 = responseFieldArr[38];
                    Seniority seniority = ReferredContact.this.seniority;
                    responseWriter.writeString(responseField3, seniority != null ? seniority.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], ReferredContact.this.updatedById);
                    responseWriter.writeBoolean(responseFieldArr[40], ReferredContact.this.hasTask);
                    ResponseField responseField4 = responseFieldArr[41];
                    TaskActivityType taskActivityType = ReferredContact.this.openTaskActivityType;
                    responseWriter.writeString(responseField4, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], ReferredContact.this.lastCalledTime);
                    ResponseField responseField5 = responseFieldArr[43];
                    CallDirection callDirection = ReferredContact.this.lastCallDirection;
                    responseWriter.writeString(responseField5, callDirection != null ? callDirection.name() : null);
                    responseWriter.writeString(responseFieldArr[44], ReferredContact.this.lastCallOutcome);
                    responseWriter.writeString(responseFieldArr[45], ReferredContact.this.lastCallOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[46], ReferredContact.this.lastCallUserId);
                    responseWriter.writeInt(responseFieldArr[47], ReferredContact.this.lastCallDuration);
                    responseWriter.writeString(responseFieldArr[48], ReferredContact.this.lastCallEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[49], ReferredContact.this.lastVisitTime);
                    responseWriter.writeString(responseFieldArr[50], ReferredContact.this.lastVisitOutcome);
                    responseWriter.writeString(responseFieldArr[51], ReferredContact.this.lastVisitOutcomeNature);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], ReferredContact.this.lastVisitUserId);
                    responseWriter.writeString(responseFieldArr[53], ReferredContact.this.lastVisitEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], ReferredContact.this.lastEmailTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], ReferredContact.this.lastEmailUserId);
                    responseWriter.writeString(responseFieldArr[56], ReferredContact.this.lastEmailEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[57], ReferredContact.this.lastWhatsappTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], ReferredContact.this.lastWhatsappUserId);
                    responseWriter.writeString(responseFieldArr[59], ReferredContact.this.lastWhatsappEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[60], ReferredContact.this.lastWabaBroadcastTime);
                    responseWriter.writeString(responseFieldArr[61], ReferredContact.this.lastWabaBroadcastStatus);
                    responseWriter.writeString(responseFieldArr[62], ReferredContact.this.lastWabaBroadcastTemplate);
                    responseWriter.writeString(responseFieldArr[63], ReferredContact.this.lastWabaBroadcastReplyBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[64], ReferredContact.this.lastWabaBroadcastReplyTime);
                    responseWriter.writeString(responseFieldArr[65], ReferredContact.this.lastWabaBroadcastReplyType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[66], ReferredContact.this.lastSmsTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[67], ReferredContact.this.lastSmsUserId);
                    responseWriter.writeString(responseFieldArr[68], ReferredContact.this.lastSmsEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[69], ReferredContact.this.lastNoteAddedTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[70], ReferredContact.this.lastNoteUserId);
                    responseWriter.writeString(responseFieldArr[71], ReferredContact.this.lastNoteEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], ReferredContact.this.lastTaskDoneTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], ReferredContact.this.lastTaskDoneUserId);
                    responseWriter.writeString(responseFieldArr[74], ReferredContact.this.lastTaskDoneEngagementId);
                    responseWriter.writeInt(responseFieldArr[75], ReferredContact.this.openTaskCount);
                    responseWriter.writeString(responseFieldArr[76], ReferredContact.this.lastKnownDisposition);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[77], ReferredContact.this.lastKnownDispositionTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[78], ReferredContact.this.lastLeadAssignmentDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[79], ReferredContact.this.lastEngagementFromAccount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[80], ReferredContact.this.lastEngagementFromContact);
                    responseWriter.writeString(responseFieldArr[81], ReferredContact.this.freshLeadTag);
                    responseWriter.writeString(responseFieldArr[82], ReferredContact.this.noWorkAfterAssignment);
                    responseWriter.writeString(responseFieldArr[83], ReferredContact.this.needFollowUpTag);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[84], ReferredContact.this.needFollowUpTagUpdatedAt);
                    responseWriter.writeString(responseFieldArr[85], ReferredContact.this.activeDealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[86], ReferredContact.this.activeDealStageUpdatedAt);
                    responseWriter.writeString(responseFieldArr[87], ReferredContact.this.dealDescription);
                    responseWriter.writeString(responseFieldArr[88], ReferredContact.this.isCustomer);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[89], ReferredContact.this.becameCustomerOn);
                    responseWriter.writeInt(responseFieldArr[90], ReferredContact.this.unsuccessfulCallAttempts);
                    responseWriter.writeInt(responseFieldArr[91], ReferredContact.this.leadCallsNotAnswered);
                    responseWriter.writeList(responseFieldArr[92], ReferredContact.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[93], ReferredContact.this.productService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[94], ReferredContact.this.bulkUploadReference);
                    responseWriter.writeString(responseFieldArr[95], ReferredContact.this.assignmentMethod);
                    responseWriter.writeString(responseFieldArr[96], ReferredContact.this.whatsappOptInStatus);
                    responseWriter.writeList(responseFieldArr[97], ReferredContact.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReferredContact.1.6
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[98], ReferredContact.this.recentEngagementsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[99], ReferredContact.this.openTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[100], ReferredContact.this.openVideoCallDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[101], ReferredContact.this.lastClosedTaskDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[102], ReferredContact.this.lastClosedTaskDetailUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[103], ReferredContact.this.latestRemark);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[104], ReferredContact.this.customAttributes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[105], ReferredContact.this.paymentRequestDetail);
                    responseWriter.writeString(responseFieldArr[106], ReferredContact.this.lastPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[107], ReferredContact.this.customDataAddedFromAddContactForm);
                    ResponseField responseField6 = responseFieldArr[108];
                    LeadLifecycleStage leadLifecycleStage = ReferredContact.this.leadLifecycleStage;
                    responseWriter.writeString(responseField6, leadLifecycleStage != null ? leadLifecycleStage.name() : null);
                    ResponseField responseField7 = responseFieldArr[109];
                    LeadLifecycleStageSubCategory leadLifecycleStageSubCategory = ReferredContact.this.leadLifecycleStageSubCategory;
                    responseWriter.writeString(responseField7, leadLifecycleStageSubCategory != null ? leadLifecycleStageSubCategory.name() : null);
                    responseWriter.writeString(responseFieldArr[110], ReferredContact.this.manualClosedReason);
                    responseWriter.writeString(responseFieldArr[111], ReferredContact.this.lastDealStageType);
                    responseWriter.writeInt(responseFieldArr[112], ReferredContact.this.prospectingAttempts);
                    responseWriter.writeInt(responseFieldArr[113], ReferredContact.this.totalProspectingAttemptsAcrossRechurn);
                    responseWriter.writeInt(responseFieldArr[114], ReferredContact.this.numberOfTimesRechurned);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[115], ReferredContact.this.lastProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[116], ReferredContact.this.firstProspectingDoneOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[117], ReferredContact.this.nextProspectingDueOn);
                    responseWriter.writeString(responseFieldArr[118], ReferredContact.this.nextProspectingSetBy);
                    responseWriter.writeString(responseFieldArr[119], ReferredContact.this.nextProspectingNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[120], ReferredContact.this.movedToOpportunityOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[121], ReferredContact.this.movedToClosedOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[122], ReferredContact.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[123], ReferredContact.this.updatedAt);
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
                this.$toString = "ReferredContact{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", toBeAssigned=" + this.toBeAssigned + ", sharedOwners=" + this.sharedOwners + ", primaryTeamId=" + this.primaryTeamId + ", sharedTeams=" + this.sharedTeams + ", accountPriority=" + this.accountPriority + ", addedById=" + this.addedById + ", assignedToId=" + this.assignedToId + ", blockedForCallById=" + this.blockedForCallById + ", blockedForCallReason=" + this.blockedForCallReason + ", blockedForCallUntil=" + this.blockedForCallUntil + ", callPriority=" + this.callPriority + ", waChatChannelId=" + this.waChatChannelId + ", contactSource=" + this.contactSource + ", contactSourceDrillDownOne=" + this.contactSourceDrillDownOne + ", contactSourceDrillDownTwo=" + this.contactSourceDrillDownTwo + ", contactSourceDrillDownThree=" + this.contactSourceDrillDownThree + ", contactSourceDrillDownOneId=" + this.contactSourceDrillDownOneId + ", contactSourceDrillDownTwoId=" + this.contactSourceDrillDownTwoId + ", contactSourceDrillDownThreeId=" + this.contactSourceDrillDownThreeId + ", contactStatus=" + this.contactStatus + ", contactType=" + this.contactType + ", department=" + this.department + ", designation=" + this.designation + ", lastRepeatEnquiryDate=" + this.lastRepeatEnquiryDate + ", lastRepeatEnquirySource=" + this.lastRepeatEnquirySource + ", gender=" + this.gender + ", isDecisionMaker=" + this.isDecisionMaker + ", isPrivate=" + this.isPrivate + ", lockPeriod=" + this.lockPeriod + ", name=" + this.name + ", preferredContactDays=" + this.preferredContactDays + ", profilePhotoUrl=" + this.profilePhotoUrl + ", referredBy=" + this.referredBy + ", salutation=" + this.salutation + ", seniority=" + this.seniority + ", updatedById=" + this.updatedById + ", hasTask=" + this.hasTask + ", openTaskActivityType=" + this.openTaskActivityType + ", lastCalledTime=" + this.lastCalledTime + ", lastCallDirection=" + this.lastCallDirection + ", lastCallOutcome=" + this.lastCallOutcome + ", lastCallOutcomeNature=" + this.lastCallOutcomeNature + ", lastCallUserId=" + this.lastCallUserId + ", lastCallDuration=" + this.lastCallDuration + ", lastCallEngagementId=" + this.lastCallEngagementId + ", lastVisitTime=" + this.lastVisitTime + ", lastVisitOutcome=" + this.lastVisitOutcome + ", lastVisitOutcomeNature=" + this.lastVisitOutcomeNature + ", lastVisitUserId=" + this.lastVisitUserId + ", lastVisitEngagementId=" + this.lastVisitEngagementId + ", lastEmailTime=" + this.lastEmailTime + ", lastEmailUserId=" + this.lastEmailUserId + ", lastEmailEngagementId=" + this.lastEmailEngagementId + ", lastWhatsappTime=" + this.lastWhatsappTime + ", lastWhatsappUserId=" + this.lastWhatsappUserId + ", lastWhatsappEngagementId=" + this.lastWhatsappEngagementId + ", lastWabaBroadcastTime=" + this.lastWabaBroadcastTime + ", lastWabaBroadcastStatus=" + this.lastWabaBroadcastStatus + ", lastWabaBroadcastTemplate=" + this.lastWabaBroadcastTemplate + ", lastWabaBroadcastReplyBody=" + this.lastWabaBroadcastReplyBody + ", lastWabaBroadcastReplyTime=" + this.lastWabaBroadcastReplyTime + ", lastWabaBroadcastReplyType=" + this.lastWabaBroadcastReplyType + ", lastSmsTime=" + this.lastSmsTime + ", lastSmsUserId=" + this.lastSmsUserId + ", lastSmsEngagementId=" + this.lastSmsEngagementId + ", lastNoteAddedTime=" + this.lastNoteAddedTime + ", lastNoteUserId=" + this.lastNoteUserId + ", lastNoteEngagementId=" + this.lastNoteEngagementId + ", lastTaskDoneTime=" + this.lastTaskDoneTime + ", lastTaskDoneUserId=" + this.lastTaskDoneUserId + ", lastTaskDoneEngagementId=" + this.lastTaskDoneEngagementId + ", openTaskCount=" + this.openTaskCount + ", lastKnownDisposition=" + this.lastKnownDisposition + ", lastKnownDispositionTime=" + this.lastKnownDispositionTime + ", lastLeadAssignmentDateTime=" + this.lastLeadAssignmentDateTime + ", lastEngagementFromAccount=" + this.lastEngagementFromAccount + ", lastEngagementFromContact=" + this.lastEngagementFromContact + ", freshLeadTag=" + this.freshLeadTag + ", noWorkAfterAssignment=" + this.noWorkAfterAssignment + ", needFollowUpTag=" + this.needFollowUpTag + ", needFollowUpTagUpdatedAt=" + this.needFollowUpTagUpdatedAt + ", activeDealStage=" + this.activeDealStage + ", activeDealStageUpdatedAt=" + this.activeDealStageUpdatedAt + ", dealDescription=" + this.dealDescription + ", isCustomer=" + this.isCustomer + ", becameCustomerOn=" + this.becameCustomerOn + ", unsuccessfulCallAttempts=" + this.unsuccessfulCallAttempts + ", leadCallsNotAnswered=" + this.leadCallsNotAnswered + ", userDefinedTags=" + this.userDefinedTags + ", productService=" + this.productService + ", bulkUploadReference=" + this.bulkUploadReference + ", assignmentMethod=" + this.assignmentMethod + ", whatsappOptInStatus=" + this.whatsappOptInStatus + ", recentEngagements=" + this.recentEngagements + ", recentEngagementsUpdatedAt=" + this.recentEngagementsUpdatedAt + ", openTaskDetail=" + this.openTaskDetail + ", openVideoCallDetail=" + this.openVideoCallDetail + ", lastClosedTaskDetail=" + this.lastClosedTaskDetail + ", lastClosedTaskDetailUpdatedAt=" + this.lastClosedTaskDetailUpdatedAt + ", latestRemark=" + this.latestRemark + ", customAttributes=" + this.customAttributes + ", paymentRequestDetail=" + this.paymentRequestDetail + ", lastPaymentStatus=" + this.lastPaymentStatus + ", customDataAddedFromAddContactForm=" + this.customDataAddedFromAddContactForm + ", leadLifecycleStage=" + this.leadLifecycleStage + ", leadLifecycleStageSubCategory=" + this.leadLifecycleStageSubCategory + ", manualClosedReason=" + this.manualClosedReason + ", lastDealStageType=" + this.lastDealStageType + ", prospectingAttempts=" + this.prospectingAttempts + ", totalProspectingAttemptsAcrossRechurn=" + this.totalProspectingAttemptsAcrossRechurn + ", numberOfTimesRechurned=" + this.numberOfTimesRechurned + ", lastProspectingDoneOn=" + this.lastProspectingDoneOn + ", firstProspectingDoneOn=" + this.firstProspectingDoneOn + ", nextProspectingDueOn=" + this.nextProspectingDueOn + ", nextProspectingSetBy=" + this.nextProspectingSetBy + ", nextProspectingNote=" + this.nextProspectingNote + ", movedToOpportunityOn=" + this.movedToOpportunityOn + ", movedToClosedOn=" + this.movedToClosedOn + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class ReplyingToMessage {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String adddressMessageParameters;
        final String channelId;
        final String chatBotId;
        final String chatUserAccountIdIfExternal;
        final String chatUserAccountNameIfExternal;
        final String chatUserId;
        final String chatUserName;
        final String contactId;
        final List<String> contactObjectToSend;
        final String createdAt;
        final String deliveredAt;
        final String directChatUserId;
        final String errorMessages;
        final String externalConversationId;
        final String externalMessageReferenceId;
        final String externalTemplateCategory;
        final String externalTemplateId;
        final String followUpType;
        final String footerText;
        final Boolean hasImage;
        final String headerText;
        final String headerType;
        final String id;
        final String internalTemplateId;
        final Boolean isInbound;
        final Boolean isStarred;
        final String linkedEngagementIdIfBroadcast;
        final String locationObjectToSend;
        final String mediaMetadata;
        final String mediaObjectId;
        final String messageCategory;
        final String messagePlatform;
        final MessageSendCategory messageSendCategory;
        final String messageSubType;
        final String messageType;
        final String phoneNumberIdExternal;
        final String primaryTeamId;
        final String readAt;
        final String recipientExternalId;
        final String recipientExternalIdType;
        final String referral;
        final String referredContactId;
        final String referredProductCatalogId;
        final String referredProductRetailerId;
        final String replyType;
        final String replyTypeId;
        final String replyingToMessageId;
        final String replyingToMessageIdExternal;
        final String responseMessageId;
        final String sentAt;
        final String status;
        final String text;
        final String thumbnailUrl;
        final String updatedAt;
        final String visitorId;

        public static final class Mapper implements ResponseFieldMapper<ReplyingToMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ReplyingToMessage map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ReplyingToMessage.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String string8 = responseReader.readString(responseFieldArr[13]);
                String string9 = responseReader.readString(responseFieldArr[14]);
                String string10 = responseReader.readString(responseFieldArr[15]);
                String string11 = responseReader.readString(responseFieldArr[16]);
                return new ReplyingToMessage(string, str, str2, string2, string3, string4, string5, string6, string7, str3, str4, str5, str6, string8, string9, string10, string11 != null ? MessageSendCategory.valueOf(string11) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readString(responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), responseReader.readString(responseFieldArr[27]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[28]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), responseReader.readString(responseFieldArr[33]), responseReader.readString(responseFieldArr[34]), responseReader.readString(responseFieldArr[35]), responseReader.readList(responseFieldArr[36], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReplyingToMessage.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readString(responseFieldArr[39]), responseReader.readString(responseFieldArr[40]), responseReader.readString(responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readBoolean(responseFieldArr[44]), responseReader.readString(responseFieldArr[45]), responseReader.readBoolean(responseFieldArr[46]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readString(responseFieldArr[51]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[52]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[53]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[54]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forString("messagePlatform", "messagePlatform", null, true, Collections.emptyList()), ResponseField.forString("externalMessageReferenceId", "externalMessageReferenceId", null, true, Collections.emptyList()), ResponseField.forString("externalConversationId", "externalConversationId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalId", "recipientExternalId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalIdType", "recipientExternalIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("visitorId", "visitorId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("referredContactId", "referredContactId", null, true, customType, Collections.emptyList()), ResponseField.forString("messageType", "messageType", null, true, Collections.emptyList()), ResponseField.forString("messageSubType", "messageSubType", null, true, Collections.emptyList()), ResponseField.forString("messageCategory", "messageCategory", null, true, Collections.emptyList()), ResponseField.forString("messageSendCategory", "messageSendCategory", null, true, Collections.emptyList()), ResponseField.forCustomType("replyingToMessageId", "replyingToMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("replyingToMessageIdExternal", "replyingToMessageIdExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("responseMessageId", "responseMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("followUpType", "followUpType", null, true, Collections.emptyList()), ResponseField.forString("replyType", "replyType", null, true, Collections.emptyList()), ResponseField.forString("replyTypeId", "replyTypeId", null, true, Collections.emptyList()), ResponseField.forString("referredProductCatalogId", "referredProductCatalogId", null, true, Collections.emptyList()), ResponseField.forString("referredProductRetailerId", "referredProductRetailerId", null, true, Collections.emptyList()), ResponseField.forCustomType("referral", "referral", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isStarred", "isStarred", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("errorMessages", "errorMessages", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("sentAt", "sentAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("deliveredAt", "deliveredAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("readAt", "readAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("internalTemplateId", "internalTemplateId", null, true, customType, Collections.emptyList()), ResponseField.forString("externalTemplateId", "externalTemplateId", null, true, Collections.emptyList()), ResponseField.forString("externalTemplateCategory", "externalTemplateCategory", null, true, Collections.emptyList()), ResponseField.forString("text", "text", null, true, Collections.emptyList()), ResponseField.forList("contactObjectToSend", "contactObjectToSend", null, true, Collections.emptyList()), ResponseField.forCustomType("locationObjectToSend", "locationObjectToSend", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("adddressMessageParameters", "adddressMessageParameters", null, true, customType2, Collections.emptyList()), ResponseField.forString("headerText", "headerText", null, true, Collections.emptyList()), ResponseField.forString("footerText", "footerText", null, true, Collections.emptyList()), ResponseField.forString("headerType", "headerType", null, true, Collections.emptyList()), ResponseField.forCustomType("mediaObjectId", "mediaObjectId", null, true, customType, Collections.emptyList()), ResponseField.forString("mediaMetadata", "mediaMetadata", null, true, Collections.emptyList()), ResponseField.forBoolean("hasImage", "hasImage", null, true, Collections.emptyList()), ResponseField.forString("thumbnailUrl", "thumbnailUrl", null, true, Collections.emptyList()), ResponseField.forBoolean("isInbound", "isInbound", null, true, Collections.emptyList()), ResponseField.forCustomType("chatUserId", "chatUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("chatUserName", "chatUserName", null, true, Collections.emptyList()), ResponseField.forCustomType("chatBotId", "chatBotId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("chatUserAccountIdIfExternal", "chatUserAccountIdIfExternal", null, true, customType, Collections.emptyList()), ResponseField.forString("chatUserAccountNameIfExternal", "chatUserAccountNameIfExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("directChatUserId", "directChatUserId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("linkedEngagementIdIfBroadcast", "linkedEngagementIdIfBroadcast", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public ReplyingToMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, MessageSendCategory messageSendCategory, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<String> list, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool2, String str42, Boolean bool3, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.phoneNumberIdExternal = str4;
            this.messagePlatform = str5;
            this.externalMessageReferenceId = str6;
            this.externalConversationId = str7;
            this.recipientExternalId = str8;
            this.recipientExternalIdType = str9;
            this.channelId = (String) Utils.checkNotNull(str10, "channelId == null");
            this.contactId = str11;
            this.visitorId = str12;
            this.referredContactId = str13;
            this.messageType = str14;
            this.messageSubType = str15;
            this.messageCategory = str16;
            this.messageSendCategory = messageSendCategory;
            this.replyingToMessageId = str17;
            this.replyingToMessageIdExternal = str18;
            this.responseMessageId = str19;
            this.followUpType = str20;
            this.replyType = str21;
            this.replyTypeId = str22;
            this.referredProductCatalogId = str23;
            this.referredProductRetailerId = str24;
            this.referral = str25;
            this.isStarred = bool;
            this.status = str26;
            this.errorMessages = str27;
            this.sentAt = str28;
            this.deliveredAt = str29;
            this.readAt = str30;
            this.internalTemplateId = str31;
            this.externalTemplateId = str32;
            this.externalTemplateCategory = str33;
            this.text = str34;
            this.contactObjectToSend = list;
            this.locationObjectToSend = str35;
            this.adddressMessageParameters = str36;
            this.headerText = str37;
            this.footerText = str38;
            this.headerType = str39;
            this.mediaObjectId = str40;
            this.mediaMetadata = str41;
            this.hasImage = bool2;
            this.thumbnailUrl = str42;
            this.isInbound = bool3;
            this.chatUserId = str43;
            this.chatUserName = str44;
            this.chatBotId = str45;
            this.chatUserAccountIdIfExternal = str46;
            this.chatUserAccountNameIfExternal = str47;
            this.directChatUserId = str48;
            this.primaryTeamId = str49;
            this.linkedEngagementIdIfBroadcast = str50;
            this.createdAt = str51;
            this.updatedAt = str52;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String adddressMessageParameters() {
            return this.adddressMessageParameters;
        }

        public String channelId() {
            return this.channelId;
        }

        public String chatBotId() {
            return this.chatBotId;
        }

        public String chatUserAccountIdIfExternal() {
            return this.chatUserAccountIdIfExternal;
        }

        public String chatUserAccountNameIfExternal() {
            return this.chatUserAccountNameIfExternal;
        }

        public String chatUserId() {
            return this.chatUserId;
        }

        public String chatUserName() {
            return this.chatUserName;
        }

        public String contactId() {
            return this.contactId;
        }

        public List<String> contactObjectToSend() {
            return this.contactObjectToSend;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deliveredAt() {
            return this.deliveredAt;
        }

        public String directChatUserId() {
            return this.directChatUserId;
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
            MessageSendCategory messageSendCategory;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            Boolean bool;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            List<String> list;
            String str31;
            String str32;
            String str33;
            String str34;
            String str35;
            String str36;
            String str37;
            Boolean bool2;
            String str38;
            Boolean bool3;
            String str39;
            String str40;
            String str41;
            String str42;
            String str43;
            String str44;
            String str45;
            String str46;
            String str47;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReplyingToMessage)) {
                return false;
            }
            ReplyingToMessage replyingToMessage = (ReplyingToMessage) obj;
            if (this.__typename.equals(replyingToMessage.__typename) && this.id.equals(replyingToMessage.id) && this.accountId.equals(replyingToMessage.accountId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(replyingToMessage.phoneNumberIdExternal) : replyingToMessage.phoneNumberIdExternal == null) && ((str2 = this.messagePlatform) != null ? str2.equals(replyingToMessage.messagePlatform) : replyingToMessage.messagePlatform == null) && ((str3 = this.externalMessageReferenceId) != null ? str3.equals(replyingToMessage.externalMessageReferenceId) : replyingToMessage.externalMessageReferenceId == null) && ((str4 = this.externalConversationId) != null ? str4.equals(replyingToMessage.externalConversationId) : replyingToMessage.externalConversationId == null) && ((str5 = this.recipientExternalId) != null ? str5.equals(replyingToMessage.recipientExternalId) : replyingToMessage.recipientExternalId == null) && ((str6 = this.recipientExternalIdType) != null ? str6.equals(replyingToMessage.recipientExternalIdType) : replyingToMessage.recipientExternalIdType == null) && this.channelId.equals(replyingToMessage.channelId) && ((str7 = this.contactId) != null ? str7.equals(replyingToMessage.contactId) : replyingToMessage.contactId == null) && ((str8 = this.visitorId) != null ? str8.equals(replyingToMessage.visitorId) : replyingToMessage.visitorId == null) && ((str9 = this.referredContactId) != null ? str9.equals(replyingToMessage.referredContactId) : replyingToMessage.referredContactId == null) && ((str10 = this.messageType) != null ? str10.equals(replyingToMessage.messageType) : replyingToMessage.messageType == null) && ((str11 = this.messageSubType) != null ? str11.equals(replyingToMessage.messageSubType) : replyingToMessage.messageSubType == null) && ((str12 = this.messageCategory) != null ? str12.equals(replyingToMessage.messageCategory) : replyingToMessage.messageCategory == null) && ((messageSendCategory = this.messageSendCategory) != null ? messageSendCategory.equals(replyingToMessage.messageSendCategory) : replyingToMessage.messageSendCategory == null) && ((str13 = this.replyingToMessageId) != null ? str13.equals(replyingToMessage.replyingToMessageId) : replyingToMessage.replyingToMessageId == null) && ((str14 = this.replyingToMessageIdExternal) != null ? str14.equals(replyingToMessage.replyingToMessageIdExternal) : replyingToMessage.replyingToMessageIdExternal == null) && ((str15 = this.responseMessageId) != null ? str15.equals(replyingToMessage.responseMessageId) : replyingToMessage.responseMessageId == null) && ((str16 = this.followUpType) != null ? str16.equals(replyingToMessage.followUpType) : replyingToMessage.followUpType == null) && ((str17 = this.replyType) != null ? str17.equals(replyingToMessage.replyType) : replyingToMessage.replyType == null) && ((str18 = this.replyTypeId) != null ? str18.equals(replyingToMessage.replyTypeId) : replyingToMessage.replyTypeId == null) && ((str19 = this.referredProductCatalogId) != null ? str19.equals(replyingToMessage.referredProductCatalogId) : replyingToMessage.referredProductCatalogId == null) && ((str20 = this.referredProductRetailerId) != null ? str20.equals(replyingToMessage.referredProductRetailerId) : replyingToMessage.referredProductRetailerId == null) && ((str21 = this.referral) != null ? str21.equals(replyingToMessage.referral) : replyingToMessage.referral == null) && ((bool = this.isStarred) != null ? bool.equals(replyingToMessage.isStarred) : replyingToMessage.isStarred == null) && ((str22 = this.status) != null ? str22.equals(replyingToMessage.status) : replyingToMessage.status == null) && ((str23 = this.errorMessages) != null ? str23.equals(replyingToMessage.errorMessages) : replyingToMessage.errorMessages == null) && ((str24 = this.sentAt) != null ? str24.equals(replyingToMessage.sentAt) : replyingToMessage.sentAt == null) && ((str25 = this.deliveredAt) != null ? str25.equals(replyingToMessage.deliveredAt) : replyingToMessage.deliveredAt == null) && ((str26 = this.readAt) != null ? str26.equals(replyingToMessage.readAt) : replyingToMessage.readAt == null) && ((str27 = this.internalTemplateId) != null ? str27.equals(replyingToMessage.internalTemplateId) : replyingToMessage.internalTemplateId == null) && ((str28 = this.externalTemplateId) != null ? str28.equals(replyingToMessage.externalTemplateId) : replyingToMessage.externalTemplateId == null) && ((str29 = this.externalTemplateCategory) != null ? str29.equals(replyingToMessage.externalTemplateCategory) : replyingToMessage.externalTemplateCategory == null) && ((str30 = this.text) != null ? str30.equals(replyingToMessage.text) : replyingToMessage.text == null) && ((list = this.contactObjectToSend) != null ? list.equals(replyingToMessage.contactObjectToSend) : replyingToMessage.contactObjectToSend == null) && ((str31 = this.locationObjectToSend) != null ? str31.equals(replyingToMessage.locationObjectToSend) : replyingToMessage.locationObjectToSend == null) && ((str32 = this.adddressMessageParameters) != null ? str32.equals(replyingToMessage.adddressMessageParameters) : replyingToMessage.adddressMessageParameters == null) && ((str33 = this.headerText) != null ? str33.equals(replyingToMessage.headerText) : replyingToMessage.headerText == null) && ((str34 = this.footerText) != null ? str34.equals(replyingToMessage.footerText) : replyingToMessage.footerText == null) && ((str35 = this.headerType) != null ? str35.equals(replyingToMessage.headerType) : replyingToMessage.headerType == null) && ((str36 = this.mediaObjectId) != null ? str36.equals(replyingToMessage.mediaObjectId) : replyingToMessage.mediaObjectId == null) && ((str37 = this.mediaMetadata) != null ? str37.equals(replyingToMessage.mediaMetadata) : replyingToMessage.mediaMetadata == null) && ((bool2 = this.hasImage) != null ? bool2.equals(replyingToMessage.hasImage) : replyingToMessage.hasImage == null) && ((str38 = this.thumbnailUrl) != null ? str38.equals(replyingToMessage.thumbnailUrl) : replyingToMessage.thumbnailUrl == null) && ((bool3 = this.isInbound) != null ? bool3.equals(replyingToMessage.isInbound) : replyingToMessage.isInbound == null) && ((str39 = this.chatUserId) != null ? str39.equals(replyingToMessage.chatUserId) : replyingToMessage.chatUserId == null) && ((str40 = this.chatUserName) != null ? str40.equals(replyingToMessage.chatUserName) : replyingToMessage.chatUserName == null) && ((str41 = this.chatBotId) != null ? str41.equals(replyingToMessage.chatBotId) : replyingToMessage.chatBotId == null) && ((str42 = this.chatUserAccountIdIfExternal) != null ? str42.equals(replyingToMessage.chatUserAccountIdIfExternal) : replyingToMessage.chatUserAccountIdIfExternal == null) && ((str43 = this.chatUserAccountNameIfExternal) != null ? str43.equals(replyingToMessage.chatUserAccountNameIfExternal) : replyingToMessage.chatUserAccountNameIfExternal == null) && ((str44 = this.directChatUserId) != null ? str44.equals(replyingToMessage.directChatUserId) : replyingToMessage.directChatUserId == null) && ((str45 = this.primaryTeamId) != null ? str45.equals(replyingToMessage.primaryTeamId) : replyingToMessage.primaryTeamId == null) && ((str46 = this.linkedEngagementIdIfBroadcast) != null ? str46.equals(replyingToMessage.linkedEngagementIdIfBroadcast) : replyingToMessage.linkedEngagementIdIfBroadcast == null) && ((str47 = this.createdAt) != null ? str47.equals(replyingToMessage.createdAt) : replyingToMessage.createdAt == null)) {
                String str48 = this.updatedAt;
                String str49 = replyingToMessage.updatedAt;
                if (str48 == null) {
                    if (str49 == null) {
                        return true;
                    }
                } else if (str48.equals(str49)) {
                    return true;
                }
            }
            return false;
        }

        public String errorMessages() {
            return this.errorMessages;
        }

        public String externalConversationId() {
            return this.externalConversationId;
        }

        public String externalMessageReferenceId() {
            return this.externalMessageReferenceId;
        }

        public String externalTemplateCategory() {
            return this.externalTemplateCategory;
        }

        public String externalTemplateId() {
            return this.externalTemplateId;
        }

        public String followUpType() {
            return this.followUpType;
        }

        public String footerText() {
            return this.footerText;
        }

        public Boolean hasImage() {
            return this.hasImage;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.phoneNumberIdExternal;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.messagePlatform;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.externalMessageReferenceId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.externalConversationId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.recipientExternalId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.recipientExternalIdType;
                int iHashCode7 = (((iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003) ^ this.channelId.hashCode()) * 1000003;
                String str7 = this.contactId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.visitorId;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.referredContactId;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.messageType;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.messageSubType;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.messageCategory;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                MessageSendCategory messageSendCategory = this.messageSendCategory;
                int iHashCode14 = (iHashCode13 ^ (messageSendCategory == null ? 0 : messageSendCategory.hashCode())) * 1000003;
                String str13 = this.replyingToMessageId;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.replyingToMessageIdExternal;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.responseMessageId;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.followUpType;
                int iHashCode18 = (iHashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.replyType;
                int iHashCode19 = (iHashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.replyTypeId;
                int iHashCode20 = (iHashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.referredProductCatalogId;
                int iHashCode21 = (iHashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.referredProductRetailerId;
                int iHashCode22 = (iHashCode21 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.referral;
                int iHashCode23 = (iHashCode22 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                Boolean bool = this.isStarred;
                int iHashCode24 = (iHashCode23 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str22 = this.status;
                int iHashCode25 = (iHashCode24 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.errorMessages;
                int iHashCode26 = (iHashCode25 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.sentAt;
                int iHashCode27 = (iHashCode26 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.deliveredAt;
                int iHashCode28 = (iHashCode27 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.readAt;
                int iHashCode29 = (iHashCode28 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.internalTemplateId;
                int iHashCode30 = (iHashCode29 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.externalTemplateId;
                int iHashCode31 = (iHashCode30 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.externalTemplateCategory;
                int iHashCode32 = (iHashCode31 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.text;
                int iHashCode33 = (iHashCode32 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                List<String> list = this.contactObjectToSend;
                int iHashCode34 = (iHashCode33 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str31 = this.locationObjectToSend;
                int iHashCode35 = (iHashCode34 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.adddressMessageParameters;
                int iHashCode36 = (iHashCode35 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.headerText;
                int iHashCode37 = (iHashCode36 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                String str34 = this.footerText;
                int iHashCode38 = (iHashCode37 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.headerType;
                int iHashCode39 = (iHashCode38 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.mediaObjectId;
                int iHashCode40 = (iHashCode39 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.mediaMetadata;
                int iHashCode41 = (iHashCode40 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                Boolean bool2 = this.hasImage;
                int iHashCode42 = (iHashCode41 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str38 = this.thumbnailUrl;
                int iHashCode43 = (iHashCode42 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                Boolean bool3 = this.isInbound;
                int iHashCode44 = (iHashCode43 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                String str39 = this.chatUserId;
                int iHashCode45 = (iHashCode44 ^ (str39 == null ? 0 : str39.hashCode())) * 1000003;
                String str40 = this.chatUserName;
                int iHashCode46 = (iHashCode45 ^ (str40 == null ? 0 : str40.hashCode())) * 1000003;
                String str41 = this.chatBotId;
                int iHashCode47 = (iHashCode46 ^ (str41 == null ? 0 : str41.hashCode())) * 1000003;
                String str42 = this.chatUserAccountIdIfExternal;
                int iHashCode48 = (iHashCode47 ^ (str42 == null ? 0 : str42.hashCode())) * 1000003;
                String str43 = this.chatUserAccountNameIfExternal;
                int iHashCode49 = (iHashCode48 ^ (str43 == null ? 0 : str43.hashCode())) * 1000003;
                String str44 = this.directChatUserId;
                int iHashCode50 = (iHashCode49 ^ (str44 == null ? 0 : str44.hashCode())) * 1000003;
                String str45 = this.primaryTeamId;
                int iHashCode51 = (iHashCode50 ^ (str45 == null ? 0 : str45.hashCode())) * 1000003;
                String str46 = this.linkedEngagementIdIfBroadcast;
                int iHashCode52 = (iHashCode51 ^ (str46 == null ? 0 : str46.hashCode())) * 1000003;
                String str47 = this.createdAt;
                int iHashCode53 = (iHashCode52 ^ (str47 == null ? 0 : str47.hashCode())) * 1000003;
                String str48 = this.updatedAt;
                this.$hashCode = iHashCode53 ^ (str48 != null ? str48.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String headerText() {
            return this.headerText;
        }

        public String headerType() {
            return this.headerType;
        }

        public String id() {
            return this.id;
        }

        public String internalTemplateId() {
            return this.internalTemplateId;
        }

        public Boolean isInbound() {
            return this.isInbound;
        }

        public Boolean isStarred() {
            return this.isStarred;
        }

        public String linkedEngagementIdIfBroadcast() {
            return this.linkedEngagementIdIfBroadcast;
        }

        public String locationObjectToSend() {
            return this.locationObjectToSend;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReplyingToMessage.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ReplyingToMessage.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ReplyingToMessage.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ReplyingToMessage.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ReplyingToMessage.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], ReplyingToMessage.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], ReplyingToMessage.this.messagePlatform);
                    responseWriter.writeString(responseFieldArr[5], ReplyingToMessage.this.externalMessageReferenceId);
                    responseWriter.writeString(responseFieldArr[6], ReplyingToMessage.this.externalConversationId);
                    responseWriter.writeString(responseFieldArr[7], ReplyingToMessage.this.recipientExternalId);
                    responseWriter.writeString(responseFieldArr[8], ReplyingToMessage.this.recipientExternalIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], ReplyingToMessage.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], ReplyingToMessage.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], ReplyingToMessage.this.visitorId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], ReplyingToMessage.this.referredContactId);
                    responseWriter.writeString(responseFieldArr[13], ReplyingToMessage.this.messageType);
                    responseWriter.writeString(responseFieldArr[14], ReplyingToMessage.this.messageSubType);
                    responseWriter.writeString(responseFieldArr[15], ReplyingToMessage.this.messageCategory);
                    ResponseField responseField = responseFieldArr[16];
                    MessageSendCategory messageSendCategory = ReplyingToMessage.this.messageSendCategory;
                    responseWriter.writeString(responseField, messageSendCategory != null ? messageSendCategory.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], ReplyingToMessage.this.replyingToMessageId);
                    responseWriter.writeString(responseFieldArr[18], ReplyingToMessage.this.replyingToMessageIdExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], ReplyingToMessage.this.responseMessageId);
                    responseWriter.writeString(responseFieldArr[20], ReplyingToMessage.this.followUpType);
                    responseWriter.writeString(responseFieldArr[21], ReplyingToMessage.this.replyType);
                    responseWriter.writeString(responseFieldArr[22], ReplyingToMessage.this.replyTypeId);
                    responseWriter.writeString(responseFieldArr[23], ReplyingToMessage.this.referredProductCatalogId);
                    responseWriter.writeString(responseFieldArr[24], ReplyingToMessage.this.referredProductRetailerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], ReplyingToMessage.this.referral);
                    responseWriter.writeBoolean(responseFieldArr[26], ReplyingToMessage.this.isStarred);
                    responseWriter.writeString(responseFieldArr[27], ReplyingToMessage.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[28], ReplyingToMessage.this.errorMessages);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[29], ReplyingToMessage.this.sentAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], ReplyingToMessage.this.deliveredAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], ReplyingToMessage.this.readAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], ReplyingToMessage.this.internalTemplateId);
                    responseWriter.writeString(responseFieldArr[33], ReplyingToMessage.this.externalTemplateId);
                    responseWriter.writeString(responseFieldArr[34], ReplyingToMessage.this.externalTemplateCategory);
                    responseWriter.writeString(responseFieldArr[35], ReplyingToMessage.this.text);
                    responseWriter.writeList(responseFieldArr[36], ReplyingToMessage.this.contactObjectToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ReplyingToMessage.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], ReplyingToMessage.this.locationObjectToSend);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], ReplyingToMessage.this.adddressMessageParameters);
                    responseWriter.writeString(responseFieldArr[39], ReplyingToMessage.this.headerText);
                    responseWriter.writeString(responseFieldArr[40], ReplyingToMessage.this.footerText);
                    responseWriter.writeString(responseFieldArr[41], ReplyingToMessage.this.headerType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], ReplyingToMessage.this.mediaObjectId);
                    responseWriter.writeString(responseFieldArr[43], ReplyingToMessage.this.mediaMetadata);
                    responseWriter.writeBoolean(responseFieldArr[44], ReplyingToMessage.this.hasImage);
                    responseWriter.writeString(responseFieldArr[45], ReplyingToMessage.this.thumbnailUrl);
                    responseWriter.writeBoolean(responseFieldArr[46], ReplyingToMessage.this.isInbound);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], ReplyingToMessage.this.chatUserId);
                    responseWriter.writeString(responseFieldArr[48], ReplyingToMessage.this.chatUserName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[49], ReplyingToMessage.this.chatBotId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], ReplyingToMessage.this.chatUserAccountIdIfExternal);
                    responseWriter.writeString(responseFieldArr[51], ReplyingToMessage.this.chatUserAccountNameIfExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], ReplyingToMessage.this.directChatUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[53], ReplyingToMessage.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], ReplyingToMessage.this.linkedEngagementIdIfBroadcast);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], ReplyingToMessage.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], ReplyingToMessage.this.updatedAt);
                }
            };
        }

        public String mediaMetadata() {
            return this.mediaMetadata;
        }

        public String mediaObjectId() {
            return this.mediaObjectId;
        }

        public String messageCategory() {
            return this.messageCategory;
        }

        public String messagePlatform() {
            return this.messagePlatform;
        }

        public MessageSendCategory messageSendCategory() {
            return this.messageSendCategory;
        }

        public String messageSubType() {
            return this.messageSubType;
        }

        public String messageType() {
            return this.messageType;
        }

        public String phoneNumberIdExternal() {
            return this.phoneNumberIdExternal;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String readAt() {
            return this.readAt;
        }

        public String recipientExternalId() {
            return this.recipientExternalId;
        }

        public String recipientExternalIdType() {
            return this.recipientExternalIdType;
        }

        public String referral() {
            return this.referral;
        }

        public String referredContactId() {
            return this.referredContactId;
        }

        public String referredProductCatalogId() {
            return this.referredProductCatalogId;
        }

        public String referredProductRetailerId() {
            return this.referredProductRetailerId;
        }

        public String replyType() {
            return this.replyType;
        }

        public String replyTypeId() {
            return this.replyTypeId;
        }

        public String replyingToMessageId() {
            return this.replyingToMessageId;
        }

        public String replyingToMessageIdExternal() {
            return this.replyingToMessageIdExternal;
        }

        public String responseMessageId() {
            return this.responseMessageId;
        }

        public String sentAt() {
            return this.sentAt;
        }

        public String status() {
            return this.status;
        }

        public String text() {
            return this.text;
        }

        public String thumbnailUrl() {
            return this.thumbnailUrl;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ReplyingToMessage{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", messagePlatform=" + this.messagePlatform + ", externalMessageReferenceId=" + this.externalMessageReferenceId + ", externalConversationId=" + this.externalConversationId + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", channelId=" + this.channelId + ", contactId=" + this.contactId + ", visitorId=" + this.visitorId + ", referredContactId=" + this.referredContactId + ", messageType=" + this.messageType + ", messageSubType=" + this.messageSubType + ", messageCategory=" + this.messageCategory + ", messageSendCategory=" + this.messageSendCategory + ", replyingToMessageId=" + this.replyingToMessageId + ", replyingToMessageIdExternal=" + this.replyingToMessageIdExternal + ", responseMessageId=" + this.responseMessageId + ", followUpType=" + this.followUpType + ", replyType=" + this.replyType + ", replyTypeId=" + this.replyTypeId + ", referredProductCatalogId=" + this.referredProductCatalogId + ", referredProductRetailerId=" + this.referredProductRetailerId + ", referral=" + this.referral + ", isStarred=" + this.isStarred + ", status=" + this.status + ", errorMessages=" + this.errorMessages + ", sentAt=" + this.sentAt + ", deliveredAt=" + this.deliveredAt + ", readAt=" + this.readAt + ", internalTemplateId=" + this.internalTemplateId + ", externalTemplateId=" + this.externalTemplateId + ", externalTemplateCategory=" + this.externalTemplateCategory + ", text=" + this.text + ", contactObjectToSend=" + this.contactObjectToSend + ", locationObjectToSend=" + this.locationObjectToSend + ", adddressMessageParameters=" + this.adddressMessageParameters + ", headerText=" + this.headerText + ", footerText=" + this.footerText + ", headerType=" + this.headerType + ", mediaObjectId=" + this.mediaObjectId + ", mediaMetadata=" + this.mediaMetadata + ", hasImage=" + this.hasImage + ", thumbnailUrl=" + this.thumbnailUrl + ", isInbound=" + this.isInbound + ", chatUserId=" + this.chatUserId + ", chatUserName=" + this.chatUserName + ", chatBotId=" + this.chatBotId + ", chatUserAccountIdIfExternal=" + this.chatUserAccountIdIfExternal + ", chatUserAccountNameIfExternal=" + this.chatUserAccountNameIfExternal + ", directChatUserId=" + this.directChatUserId + ", primaryTeamId=" + this.primaryTeamId + ", linkedEngagementIdIfBroadcast=" + this.linkedEngagementIdIfBroadcast + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String visitorId() {
            return this.visitorId;
        }
    }

    public static class ResponseMessage {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String adddressMessageParameters;
        final String channelId;
        final String chatBotId;
        final String chatUserAccountIdIfExternal;
        final String chatUserAccountNameIfExternal;
        final String chatUserId;
        final String chatUserName;
        final String contactId;
        final List<String> contactObjectToSend;
        final String createdAt;
        final String deliveredAt;
        final String directChatUserId;
        final String errorMessages;
        final String externalConversationId;
        final String externalMessageReferenceId;
        final String externalTemplateCategory;
        final String externalTemplateId;
        final String followUpType;
        final String footerText;
        final Boolean hasImage;
        final String headerText;
        final String headerType;
        final String id;
        final String internalTemplateId;
        final Boolean isInbound;
        final Boolean isStarred;
        final String linkedEngagementIdIfBroadcast;
        final String locationObjectToSend;
        final String mediaMetadata;
        final String mediaObjectId;
        final String messageCategory;
        final String messagePlatform;
        final MessageSendCategory messageSendCategory;
        final String messageSubType;
        final String messageType;
        final String phoneNumberIdExternal;
        final String primaryTeamId;
        final String readAt;
        final String recipientExternalId;
        final String recipientExternalIdType;
        final String referral;
        final String referredContactId;
        final String referredProductCatalogId;
        final String referredProductRetailerId;
        final String replyType;
        final String replyTypeId;
        final String replyingToMessageId;
        final String replyingToMessageIdExternal;
        final String responseMessageId;
        final String sentAt;
        final String status;
        final String text;
        final String thumbnailUrl;
        final String updatedAt;
        final String visitorId;

        public static final class Mapper implements ResponseFieldMapper<ResponseMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ResponseMessage map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ResponseMessage.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String string8 = responseReader.readString(responseFieldArr[13]);
                String string9 = responseReader.readString(responseFieldArr[14]);
                String string10 = responseReader.readString(responseFieldArr[15]);
                String string11 = responseReader.readString(responseFieldArr[16]);
                return new ResponseMessage(string, str, str2, string2, string3, string4, string5, string6, string7, str3, str4, str5, str6, string8, string9, string10, string11 != null ? MessageSendCategory.valueOf(string11) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readString(responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), responseReader.readString(responseFieldArr[27]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[28]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), responseReader.readString(responseFieldArr[33]), responseReader.readString(responseFieldArr[34]), responseReader.readString(responseFieldArr[35]), responseReader.readList(responseFieldArr[36], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ResponseMessage.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readString(responseFieldArr[39]), responseReader.readString(responseFieldArr[40]), responseReader.readString(responseFieldArr[41]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[42]), responseReader.readString(responseFieldArr[43]), responseReader.readBoolean(responseFieldArr[44]), responseReader.readString(responseFieldArr[45]), responseReader.readBoolean(responseFieldArr[46]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[47]), responseReader.readString(responseFieldArr[48]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[49]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[50]), responseReader.readString(responseFieldArr[51]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[52]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[53]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[54]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forString("messagePlatform", "messagePlatform", null, true, Collections.emptyList()), ResponseField.forString("externalMessageReferenceId", "externalMessageReferenceId", null, true, Collections.emptyList()), ResponseField.forString("externalConversationId", "externalConversationId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalId", "recipientExternalId", null, true, Collections.emptyList()), ResponseField.forString("recipientExternalIdType", "recipientExternalIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("visitorId", "visitorId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("referredContactId", "referredContactId", null, true, customType, Collections.emptyList()), ResponseField.forString("messageType", "messageType", null, true, Collections.emptyList()), ResponseField.forString("messageSubType", "messageSubType", null, true, Collections.emptyList()), ResponseField.forString("messageCategory", "messageCategory", null, true, Collections.emptyList()), ResponseField.forString("messageSendCategory", "messageSendCategory", null, true, Collections.emptyList()), ResponseField.forCustomType("replyingToMessageId", "replyingToMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("replyingToMessageIdExternal", "replyingToMessageIdExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("responseMessageId", "responseMessageId", null, true, customType, Collections.emptyList()), ResponseField.forString("followUpType", "followUpType", null, true, Collections.emptyList()), ResponseField.forString("replyType", "replyType", null, true, Collections.emptyList()), ResponseField.forString("replyTypeId", "replyTypeId", null, true, Collections.emptyList()), ResponseField.forString("referredProductCatalogId", "referredProductCatalogId", null, true, Collections.emptyList()), ResponseField.forString("referredProductRetailerId", "referredProductRetailerId", null, true, Collections.emptyList()), ResponseField.forCustomType("referral", "referral", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isStarred", "isStarred", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("errorMessages", "errorMessages", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("sentAt", "sentAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("deliveredAt", "deliveredAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("readAt", "readAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("internalTemplateId", "internalTemplateId", null, true, customType, Collections.emptyList()), ResponseField.forString("externalTemplateId", "externalTemplateId", null, true, Collections.emptyList()), ResponseField.forString("externalTemplateCategory", "externalTemplateCategory", null, true, Collections.emptyList()), ResponseField.forString("text", "text", null, true, Collections.emptyList()), ResponseField.forList("contactObjectToSend", "contactObjectToSend", null, true, Collections.emptyList()), ResponseField.forCustomType("locationObjectToSend", "locationObjectToSend", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("adddressMessageParameters", "adddressMessageParameters", null, true, customType2, Collections.emptyList()), ResponseField.forString("headerText", "headerText", null, true, Collections.emptyList()), ResponseField.forString("footerText", "footerText", null, true, Collections.emptyList()), ResponseField.forString("headerType", "headerType", null, true, Collections.emptyList()), ResponseField.forCustomType("mediaObjectId", "mediaObjectId", null, true, customType, Collections.emptyList()), ResponseField.forString("mediaMetadata", "mediaMetadata", null, true, Collections.emptyList()), ResponseField.forBoolean("hasImage", "hasImage", null, true, Collections.emptyList()), ResponseField.forString("thumbnailUrl", "thumbnailUrl", null, true, Collections.emptyList()), ResponseField.forBoolean("isInbound", "isInbound", null, true, Collections.emptyList()), ResponseField.forCustomType("chatUserId", "chatUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("chatUserName", "chatUserName", null, true, Collections.emptyList()), ResponseField.forCustomType("chatBotId", "chatBotId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("chatUserAccountIdIfExternal", "chatUserAccountIdIfExternal", null, true, customType, Collections.emptyList()), ResponseField.forString("chatUserAccountNameIfExternal", "chatUserAccountNameIfExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("directChatUserId", "directChatUserId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("linkedEngagementIdIfBroadcast", "linkedEngagementIdIfBroadcast", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public ResponseMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, MessageSendCategory messageSendCategory, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<String> list, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool2, String str42, Boolean bool3, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.phoneNumberIdExternal = str4;
            this.messagePlatform = str5;
            this.externalMessageReferenceId = str6;
            this.externalConversationId = str7;
            this.recipientExternalId = str8;
            this.recipientExternalIdType = str9;
            this.channelId = (String) Utils.checkNotNull(str10, "channelId == null");
            this.contactId = str11;
            this.visitorId = str12;
            this.referredContactId = str13;
            this.messageType = str14;
            this.messageSubType = str15;
            this.messageCategory = str16;
            this.messageSendCategory = messageSendCategory;
            this.replyingToMessageId = str17;
            this.replyingToMessageIdExternal = str18;
            this.responseMessageId = str19;
            this.followUpType = str20;
            this.replyType = str21;
            this.replyTypeId = str22;
            this.referredProductCatalogId = str23;
            this.referredProductRetailerId = str24;
            this.referral = str25;
            this.isStarred = bool;
            this.status = str26;
            this.errorMessages = str27;
            this.sentAt = str28;
            this.deliveredAt = str29;
            this.readAt = str30;
            this.internalTemplateId = str31;
            this.externalTemplateId = str32;
            this.externalTemplateCategory = str33;
            this.text = str34;
            this.contactObjectToSend = list;
            this.locationObjectToSend = str35;
            this.adddressMessageParameters = str36;
            this.headerText = str37;
            this.footerText = str38;
            this.headerType = str39;
            this.mediaObjectId = str40;
            this.mediaMetadata = str41;
            this.hasImage = bool2;
            this.thumbnailUrl = str42;
            this.isInbound = bool3;
            this.chatUserId = str43;
            this.chatUserName = str44;
            this.chatBotId = str45;
            this.chatUserAccountIdIfExternal = str46;
            this.chatUserAccountNameIfExternal = str47;
            this.directChatUserId = str48;
            this.primaryTeamId = str49;
            this.linkedEngagementIdIfBroadcast = str50;
            this.createdAt = str51;
            this.updatedAt = str52;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String adddressMessageParameters() {
            return this.adddressMessageParameters;
        }

        public String channelId() {
            return this.channelId;
        }

        public String chatBotId() {
            return this.chatBotId;
        }

        public String chatUserAccountIdIfExternal() {
            return this.chatUserAccountIdIfExternal;
        }

        public String chatUserAccountNameIfExternal() {
            return this.chatUserAccountNameIfExternal;
        }

        public String chatUserId() {
            return this.chatUserId;
        }

        public String chatUserName() {
            return this.chatUserName;
        }

        public String contactId() {
            return this.contactId;
        }

        public List<String> contactObjectToSend() {
            return this.contactObjectToSend;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deliveredAt() {
            return this.deliveredAt;
        }

        public String directChatUserId() {
            return this.directChatUserId;
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
            MessageSendCategory messageSendCategory;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            Boolean bool;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            List<String> list;
            String str31;
            String str32;
            String str33;
            String str34;
            String str35;
            String str36;
            String str37;
            Boolean bool2;
            String str38;
            Boolean bool3;
            String str39;
            String str40;
            String str41;
            String str42;
            String str43;
            String str44;
            String str45;
            String str46;
            String str47;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResponseMessage)) {
                return false;
            }
            ResponseMessage responseMessage = (ResponseMessage) obj;
            if (this.__typename.equals(responseMessage.__typename) && this.id.equals(responseMessage.id) && this.accountId.equals(responseMessage.accountId) && ((str = this.phoneNumberIdExternal) != null ? str.equals(responseMessage.phoneNumberIdExternal) : responseMessage.phoneNumberIdExternal == null) && ((str2 = this.messagePlatform) != null ? str2.equals(responseMessage.messagePlatform) : responseMessage.messagePlatform == null) && ((str3 = this.externalMessageReferenceId) != null ? str3.equals(responseMessage.externalMessageReferenceId) : responseMessage.externalMessageReferenceId == null) && ((str4 = this.externalConversationId) != null ? str4.equals(responseMessage.externalConversationId) : responseMessage.externalConversationId == null) && ((str5 = this.recipientExternalId) != null ? str5.equals(responseMessage.recipientExternalId) : responseMessage.recipientExternalId == null) && ((str6 = this.recipientExternalIdType) != null ? str6.equals(responseMessage.recipientExternalIdType) : responseMessage.recipientExternalIdType == null) && this.channelId.equals(responseMessage.channelId) && ((str7 = this.contactId) != null ? str7.equals(responseMessage.contactId) : responseMessage.contactId == null) && ((str8 = this.visitorId) != null ? str8.equals(responseMessage.visitorId) : responseMessage.visitorId == null) && ((str9 = this.referredContactId) != null ? str9.equals(responseMessage.referredContactId) : responseMessage.referredContactId == null) && ((str10 = this.messageType) != null ? str10.equals(responseMessage.messageType) : responseMessage.messageType == null) && ((str11 = this.messageSubType) != null ? str11.equals(responseMessage.messageSubType) : responseMessage.messageSubType == null) && ((str12 = this.messageCategory) != null ? str12.equals(responseMessage.messageCategory) : responseMessage.messageCategory == null) && ((messageSendCategory = this.messageSendCategory) != null ? messageSendCategory.equals(responseMessage.messageSendCategory) : responseMessage.messageSendCategory == null) && ((str13 = this.replyingToMessageId) != null ? str13.equals(responseMessage.replyingToMessageId) : responseMessage.replyingToMessageId == null) && ((str14 = this.replyingToMessageIdExternal) != null ? str14.equals(responseMessage.replyingToMessageIdExternal) : responseMessage.replyingToMessageIdExternal == null) && ((str15 = this.responseMessageId) != null ? str15.equals(responseMessage.responseMessageId) : responseMessage.responseMessageId == null) && ((str16 = this.followUpType) != null ? str16.equals(responseMessage.followUpType) : responseMessage.followUpType == null) && ((str17 = this.replyType) != null ? str17.equals(responseMessage.replyType) : responseMessage.replyType == null) && ((str18 = this.replyTypeId) != null ? str18.equals(responseMessage.replyTypeId) : responseMessage.replyTypeId == null) && ((str19 = this.referredProductCatalogId) != null ? str19.equals(responseMessage.referredProductCatalogId) : responseMessage.referredProductCatalogId == null) && ((str20 = this.referredProductRetailerId) != null ? str20.equals(responseMessage.referredProductRetailerId) : responseMessage.referredProductRetailerId == null) && ((str21 = this.referral) != null ? str21.equals(responseMessage.referral) : responseMessage.referral == null) && ((bool = this.isStarred) != null ? bool.equals(responseMessage.isStarred) : responseMessage.isStarred == null) && ((str22 = this.status) != null ? str22.equals(responseMessage.status) : responseMessage.status == null) && ((str23 = this.errorMessages) != null ? str23.equals(responseMessage.errorMessages) : responseMessage.errorMessages == null) && ((str24 = this.sentAt) != null ? str24.equals(responseMessage.sentAt) : responseMessage.sentAt == null) && ((str25 = this.deliveredAt) != null ? str25.equals(responseMessage.deliveredAt) : responseMessage.deliveredAt == null) && ((str26 = this.readAt) != null ? str26.equals(responseMessage.readAt) : responseMessage.readAt == null) && ((str27 = this.internalTemplateId) != null ? str27.equals(responseMessage.internalTemplateId) : responseMessage.internalTemplateId == null) && ((str28 = this.externalTemplateId) != null ? str28.equals(responseMessage.externalTemplateId) : responseMessage.externalTemplateId == null) && ((str29 = this.externalTemplateCategory) != null ? str29.equals(responseMessage.externalTemplateCategory) : responseMessage.externalTemplateCategory == null) && ((str30 = this.text) != null ? str30.equals(responseMessage.text) : responseMessage.text == null) && ((list = this.contactObjectToSend) != null ? list.equals(responseMessage.contactObjectToSend) : responseMessage.contactObjectToSend == null) && ((str31 = this.locationObjectToSend) != null ? str31.equals(responseMessage.locationObjectToSend) : responseMessage.locationObjectToSend == null) && ((str32 = this.adddressMessageParameters) != null ? str32.equals(responseMessage.adddressMessageParameters) : responseMessage.adddressMessageParameters == null) && ((str33 = this.headerText) != null ? str33.equals(responseMessage.headerText) : responseMessage.headerText == null) && ((str34 = this.footerText) != null ? str34.equals(responseMessage.footerText) : responseMessage.footerText == null) && ((str35 = this.headerType) != null ? str35.equals(responseMessage.headerType) : responseMessage.headerType == null) && ((str36 = this.mediaObjectId) != null ? str36.equals(responseMessage.mediaObjectId) : responseMessage.mediaObjectId == null) && ((str37 = this.mediaMetadata) != null ? str37.equals(responseMessage.mediaMetadata) : responseMessage.mediaMetadata == null) && ((bool2 = this.hasImage) != null ? bool2.equals(responseMessage.hasImage) : responseMessage.hasImage == null) && ((str38 = this.thumbnailUrl) != null ? str38.equals(responseMessage.thumbnailUrl) : responseMessage.thumbnailUrl == null) && ((bool3 = this.isInbound) != null ? bool3.equals(responseMessage.isInbound) : responseMessage.isInbound == null) && ((str39 = this.chatUserId) != null ? str39.equals(responseMessage.chatUserId) : responseMessage.chatUserId == null) && ((str40 = this.chatUserName) != null ? str40.equals(responseMessage.chatUserName) : responseMessage.chatUserName == null) && ((str41 = this.chatBotId) != null ? str41.equals(responseMessage.chatBotId) : responseMessage.chatBotId == null) && ((str42 = this.chatUserAccountIdIfExternal) != null ? str42.equals(responseMessage.chatUserAccountIdIfExternal) : responseMessage.chatUserAccountIdIfExternal == null) && ((str43 = this.chatUserAccountNameIfExternal) != null ? str43.equals(responseMessage.chatUserAccountNameIfExternal) : responseMessage.chatUserAccountNameIfExternal == null) && ((str44 = this.directChatUserId) != null ? str44.equals(responseMessage.directChatUserId) : responseMessage.directChatUserId == null) && ((str45 = this.primaryTeamId) != null ? str45.equals(responseMessage.primaryTeamId) : responseMessage.primaryTeamId == null) && ((str46 = this.linkedEngagementIdIfBroadcast) != null ? str46.equals(responseMessage.linkedEngagementIdIfBroadcast) : responseMessage.linkedEngagementIdIfBroadcast == null) && ((str47 = this.createdAt) != null ? str47.equals(responseMessage.createdAt) : responseMessage.createdAt == null)) {
                String str48 = this.updatedAt;
                String str49 = responseMessage.updatedAt;
                if (str48 == null) {
                    if (str49 == null) {
                        return true;
                    }
                } else if (str48.equals(str49)) {
                    return true;
                }
            }
            return false;
        }

        public String errorMessages() {
            return this.errorMessages;
        }

        public String externalConversationId() {
            return this.externalConversationId;
        }

        public String externalMessageReferenceId() {
            return this.externalMessageReferenceId;
        }

        public String externalTemplateCategory() {
            return this.externalTemplateCategory;
        }

        public String externalTemplateId() {
            return this.externalTemplateId;
        }

        public String followUpType() {
            return this.followUpType;
        }

        public String footerText() {
            return this.footerText;
        }

        public Boolean hasImage() {
            return this.hasImage;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.phoneNumberIdExternal;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.messagePlatform;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.externalMessageReferenceId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.externalConversationId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.recipientExternalId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.recipientExternalIdType;
                int iHashCode7 = (((iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003) ^ this.channelId.hashCode()) * 1000003;
                String str7 = this.contactId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.visitorId;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.referredContactId;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.messageType;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.messageSubType;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.messageCategory;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                MessageSendCategory messageSendCategory = this.messageSendCategory;
                int iHashCode14 = (iHashCode13 ^ (messageSendCategory == null ? 0 : messageSendCategory.hashCode())) * 1000003;
                String str13 = this.replyingToMessageId;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.replyingToMessageIdExternal;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.responseMessageId;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.followUpType;
                int iHashCode18 = (iHashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.replyType;
                int iHashCode19 = (iHashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.replyTypeId;
                int iHashCode20 = (iHashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.referredProductCatalogId;
                int iHashCode21 = (iHashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.referredProductRetailerId;
                int iHashCode22 = (iHashCode21 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.referral;
                int iHashCode23 = (iHashCode22 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                Boolean bool = this.isStarred;
                int iHashCode24 = (iHashCode23 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str22 = this.status;
                int iHashCode25 = (iHashCode24 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.errorMessages;
                int iHashCode26 = (iHashCode25 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.sentAt;
                int iHashCode27 = (iHashCode26 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.deliveredAt;
                int iHashCode28 = (iHashCode27 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.readAt;
                int iHashCode29 = (iHashCode28 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.internalTemplateId;
                int iHashCode30 = (iHashCode29 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.externalTemplateId;
                int iHashCode31 = (iHashCode30 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.externalTemplateCategory;
                int iHashCode32 = (iHashCode31 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.text;
                int iHashCode33 = (iHashCode32 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                List<String> list = this.contactObjectToSend;
                int iHashCode34 = (iHashCode33 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str31 = this.locationObjectToSend;
                int iHashCode35 = (iHashCode34 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.adddressMessageParameters;
                int iHashCode36 = (iHashCode35 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.headerText;
                int iHashCode37 = (iHashCode36 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                String str34 = this.footerText;
                int iHashCode38 = (iHashCode37 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.headerType;
                int iHashCode39 = (iHashCode38 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.mediaObjectId;
                int iHashCode40 = (iHashCode39 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.mediaMetadata;
                int iHashCode41 = (iHashCode40 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                Boolean bool2 = this.hasImage;
                int iHashCode42 = (iHashCode41 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str38 = this.thumbnailUrl;
                int iHashCode43 = (iHashCode42 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                Boolean bool3 = this.isInbound;
                int iHashCode44 = (iHashCode43 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                String str39 = this.chatUserId;
                int iHashCode45 = (iHashCode44 ^ (str39 == null ? 0 : str39.hashCode())) * 1000003;
                String str40 = this.chatUserName;
                int iHashCode46 = (iHashCode45 ^ (str40 == null ? 0 : str40.hashCode())) * 1000003;
                String str41 = this.chatBotId;
                int iHashCode47 = (iHashCode46 ^ (str41 == null ? 0 : str41.hashCode())) * 1000003;
                String str42 = this.chatUserAccountIdIfExternal;
                int iHashCode48 = (iHashCode47 ^ (str42 == null ? 0 : str42.hashCode())) * 1000003;
                String str43 = this.chatUserAccountNameIfExternal;
                int iHashCode49 = (iHashCode48 ^ (str43 == null ? 0 : str43.hashCode())) * 1000003;
                String str44 = this.directChatUserId;
                int iHashCode50 = (iHashCode49 ^ (str44 == null ? 0 : str44.hashCode())) * 1000003;
                String str45 = this.primaryTeamId;
                int iHashCode51 = (iHashCode50 ^ (str45 == null ? 0 : str45.hashCode())) * 1000003;
                String str46 = this.linkedEngagementIdIfBroadcast;
                int iHashCode52 = (iHashCode51 ^ (str46 == null ? 0 : str46.hashCode())) * 1000003;
                String str47 = this.createdAt;
                int iHashCode53 = (iHashCode52 ^ (str47 == null ? 0 : str47.hashCode())) * 1000003;
                String str48 = this.updatedAt;
                this.$hashCode = iHashCode53 ^ (str48 != null ? str48.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String headerText() {
            return this.headerText;
        }

        public String headerType() {
            return this.headerType;
        }

        public String id() {
            return this.id;
        }

        public String internalTemplateId() {
            return this.internalTemplateId;
        }

        public Boolean isInbound() {
            return this.isInbound;
        }

        public Boolean isStarred() {
            return this.isStarred;
        }

        public String linkedEngagementIdIfBroadcast() {
            return this.linkedEngagementIdIfBroadcast;
        }

        public String locationObjectToSend() {
            return this.locationObjectToSend;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ResponseMessage.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ResponseMessage.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ResponseMessage.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ResponseMessage.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ResponseMessage.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], ResponseMessage.this.phoneNumberIdExternal);
                    responseWriter.writeString(responseFieldArr[4], ResponseMessage.this.messagePlatform);
                    responseWriter.writeString(responseFieldArr[5], ResponseMessage.this.externalMessageReferenceId);
                    responseWriter.writeString(responseFieldArr[6], ResponseMessage.this.externalConversationId);
                    responseWriter.writeString(responseFieldArr[7], ResponseMessage.this.recipientExternalId);
                    responseWriter.writeString(responseFieldArr[8], ResponseMessage.this.recipientExternalIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], ResponseMessage.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], ResponseMessage.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], ResponseMessage.this.visitorId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], ResponseMessage.this.referredContactId);
                    responseWriter.writeString(responseFieldArr[13], ResponseMessage.this.messageType);
                    responseWriter.writeString(responseFieldArr[14], ResponseMessage.this.messageSubType);
                    responseWriter.writeString(responseFieldArr[15], ResponseMessage.this.messageCategory);
                    ResponseField responseField = responseFieldArr[16];
                    MessageSendCategory messageSendCategory = ResponseMessage.this.messageSendCategory;
                    responseWriter.writeString(responseField, messageSendCategory != null ? messageSendCategory.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], ResponseMessage.this.replyingToMessageId);
                    responseWriter.writeString(responseFieldArr[18], ResponseMessage.this.replyingToMessageIdExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], ResponseMessage.this.responseMessageId);
                    responseWriter.writeString(responseFieldArr[20], ResponseMessage.this.followUpType);
                    responseWriter.writeString(responseFieldArr[21], ResponseMessage.this.replyType);
                    responseWriter.writeString(responseFieldArr[22], ResponseMessage.this.replyTypeId);
                    responseWriter.writeString(responseFieldArr[23], ResponseMessage.this.referredProductCatalogId);
                    responseWriter.writeString(responseFieldArr[24], ResponseMessage.this.referredProductRetailerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], ResponseMessage.this.referral);
                    responseWriter.writeBoolean(responseFieldArr[26], ResponseMessage.this.isStarred);
                    responseWriter.writeString(responseFieldArr[27], ResponseMessage.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[28], ResponseMessage.this.errorMessages);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[29], ResponseMessage.this.sentAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], ResponseMessage.this.deliveredAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], ResponseMessage.this.readAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], ResponseMessage.this.internalTemplateId);
                    responseWriter.writeString(responseFieldArr[33], ResponseMessage.this.externalTemplateId);
                    responseWriter.writeString(responseFieldArr[34], ResponseMessage.this.externalTemplateCategory);
                    responseWriter.writeString(responseFieldArr[35], ResponseMessage.this.text);
                    responseWriter.writeList(responseFieldArr[36], ResponseMessage.this.contactObjectToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.ResponseMessage.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], ResponseMessage.this.locationObjectToSend);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], ResponseMessage.this.adddressMessageParameters);
                    responseWriter.writeString(responseFieldArr[39], ResponseMessage.this.headerText);
                    responseWriter.writeString(responseFieldArr[40], ResponseMessage.this.footerText);
                    responseWriter.writeString(responseFieldArr[41], ResponseMessage.this.headerType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[42], ResponseMessage.this.mediaObjectId);
                    responseWriter.writeString(responseFieldArr[43], ResponseMessage.this.mediaMetadata);
                    responseWriter.writeBoolean(responseFieldArr[44], ResponseMessage.this.hasImage);
                    responseWriter.writeString(responseFieldArr[45], ResponseMessage.this.thumbnailUrl);
                    responseWriter.writeBoolean(responseFieldArr[46], ResponseMessage.this.isInbound);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[47], ResponseMessage.this.chatUserId);
                    responseWriter.writeString(responseFieldArr[48], ResponseMessage.this.chatUserName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[49], ResponseMessage.this.chatBotId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[50], ResponseMessage.this.chatUserAccountIdIfExternal);
                    responseWriter.writeString(responseFieldArr[51], ResponseMessage.this.chatUserAccountNameIfExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], ResponseMessage.this.directChatUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[53], ResponseMessage.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[54], ResponseMessage.this.linkedEngagementIdIfBroadcast);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], ResponseMessage.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], ResponseMessage.this.updatedAt);
                }
            };
        }

        public String mediaMetadata() {
            return this.mediaMetadata;
        }

        public String mediaObjectId() {
            return this.mediaObjectId;
        }

        public String messageCategory() {
            return this.messageCategory;
        }

        public String messagePlatform() {
            return this.messagePlatform;
        }

        public MessageSendCategory messageSendCategory() {
            return this.messageSendCategory;
        }

        public String messageSubType() {
            return this.messageSubType;
        }

        public String messageType() {
            return this.messageType;
        }

        public String phoneNumberIdExternal() {
            return this.phoneNumberIdExternal;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String readAt() {
            return this.readAt;
        }

        public String recipientExternalId() {
            return this.recipientExternalId;
        }

        public String recipientExternalIdType() {
            return this.recipientExternalIdType;
        }

        public String referral() {
            return this.referral;
        }

        public String referredContactId() {
            return this.referredContactId;
        }

        public String referredProductCatalogId() {
            return this.referredProductCatalogId;
        }

        public String referredProductRetailerId() {
            return this.referredProductRetailerId;
        }

        public String replyType() {
            return this.replyType;
        }

        public String replyTypeId() {
            return this.replyTypeId;
        }

        public String replyingToMessageId() {
            return this.replyingToMessageId;
        }

        public String replyingToMessageIdExternal() {
            return this.replyingToMessageIdExternal;
        }

        public String responseMessageId() {
            return this.responseMessageId;
        }

        public String sentAt() {
            return this.sentAt;
        }

        public String status() {
            return this.status;
        }

        public String text() {
            return this.text;
        }

        public String thumbnailUrl() {
            return this.thumbnailUrl;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ResponseMessage{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", messagePlatform=" + this.messagePlatform + ", externalMessageReferenceId=" + this.externalMessageReferenceId + ", externalConversationId=" + this.externalConversationId + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", channelId=" + this.channelId + ", contactId=" + this.contactId + ", visitorId=" + this.visitorId + ", referredContactId=" + this.referredContactId + ", messageType=" + this.messageType + ", messageSubType=" + this.messageSubType + ", messageCategory=" + this.messageCategory + ", messageSendCategory=" + this.messageSendCategory + ", replyingToMessageId=" + this.replyingToMessageId + ", replyingToMessageIdExternal=" + this.replyingToMessageIdExternal + ", responseMessageId=" + this.responseMessageId + ", followUpType=" + this.followUpType + ", replyType=" + this.replyType + ", replyTypeId=" + this.replyTypeId + ", referredProductCatalogId=" + this.referredProductCatalogId + ", referredProductRetailerId=" + this.referredProductRetailerId + ", referral=" + this.referral + ", isStarred=" + this.isStarred + ", status=" + this.status + ", errorMessages=" + this.errorMessages + ", sentAt=" + this.sentAt + ", deliveredAt=" + this.deliveredAt + ", readAt=" + this.readAt + ", internalTemplateId=" + this.internalTemplateId + ", externalTemplateId=" + this.externalTemplateId + ", externalTemplateCategory=" + this.externalTemplateCategory + ", text=" + this.text + ", contactObjectToSend=" + this.contactObjectToSend + ", locationObjectToSend=" + this.locationObjectToSend + ", adddressMessageParameters=" + this.adddressMessageParameters + ", headerText=" + this.headerText + ", footerText=" + this.footerText + ", headerType=" + this.headerType + ", mediaObjectId=" + this.mediaObjectId + ", mediaMetadata=" + this.mediaMetadata + ", hasImage=" + this.hasImage + ", thumbnailUrl=" + this.thumbnailUrl + ", isInbound=" + this.isInbound + ", chatUserId=" + this.chatUserId + ", chatUserName=" + this.chatUserName + ", chatBotId=" + this.chatBotId + ", chatUserAccountIdIfExternal=" + this.chatUserAccountIdIfExternal + ", chatUserAccountNameIfExternal=" + this.chatUserAccountNameIfExternal + ", directChatUserId=" + this.directChatUserId + ", primaryTeamId=" + this.primaryTeamId + ", linkedEngagementIdIfBroadcast=" + this.linkedEngagementIdIfBroadcast + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String visitorId() {
            return this.visitorId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelChatMessageConditionInput condition;
        private final CreateChatMessageInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateChatMessageInput createChatMessageInput, ModelChatMessageConditionInput modelChatMessageConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createChatMessageInput;
            this.condition = modelChatMessageConditionInput;
            linkedHashMap.put("input", createChatMessageInput);
            linkedHashMap.put("condition", modelChatMessageConditionInput);
        }

        public ModelChatMessageConditionInput condition() {
            return this.condition;
        }

        public CreateChatMessageInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateChatMessageMutation.Variables.1
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

    public CreateChatMessageMutation(CreateChatMessageInput createChatMessageInput, ModelChatMessageConditionInput modelChatMessageConditionInput) {
        Utils.checkNotNull(createChatMessageInput, "input == null");
        this.variables = new Variables(createChatMessageInput, modelChatMessageConditionInput);
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
        return "843979363ac495f79e4e0add8b3464861d2d252214bd02dcd8228037166208d3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateChatMessage($input: CreateChatMessageInput!, $condition: ModelChatMessageConditionInput) {\n  createChatMessage(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    messagePlatform\n    externalMessageReferenceId\n    externalConversationId\n    recipientExternalId\n    recipientExternalIdType\n    channelId\n    contactId\n    visitorId\n    referredContactId\n    messageType\n    messageSubType\n    messageCategory\n    messageSendCategory\n    replyingToMessageId\n    replyingToMessageIdExternal\n    responseMessageId\n    followUpType\n    replyType\n    replyTypeId\n    referredProductCatalogId\n    referredProductRetailerId\n    productItems {\n      __typename\n      product_retailer_id\n      quantity\n      item_price\n      currency\n    }\n    referral\n    isStarred\n    status\n    errorMessages\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    externalTemplateCategory\n    text\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    headerText\n    footerText\n    headerType\n    actionInteractive {\n      __typename\n      actionName\n      display_text\n      ctaUrl\n      addressCountry\n      savedAddresses\n      button\n      catalog_id\n      product_retailer_id\n      flow_mode\n      flow_message_version\n      flow_token\n      flow_id\n      flow_cta\n      flow_action\n    }\n    buttons {\n      __typename\n      waType\n      waText\n      waUrl\n      waNumber\n      flow_id\n      flow_json\n      flow_action\n      navigate_screen\n    }\n    parameters {\n      __typename\n      taType\n      sub_type\n      index\n    }\n    mediaObjectId\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatBotId\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    directChatUserId\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    linkedEngagementIdIfBroadcast\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n    responseMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      messagePlatform\n      externalMessageReferenceId\n      externalConversationId\n      recipientExternalId\n      recipientExternalIdType\n      channelId\n      contactId\n      visitorId\n      referredContactId\n      messageType\n      messageSubType\n      messageCategory\n      messageSendCategory\n      replyingToMessageId\n      replyingToMessageIdExternal\n      responseMessageId\n      followUpType\n      replyType\n      replyTypeId\n      referredProductCatalogId\n      referredProductRetailerId\n      referral\n      isStarred\n      status\n      errorMessages\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      externalTemplateCategory\n      text\n      contactObjectToSend\n      locationObjectToSend\n      adddressMessageParameters\n      headerText\n      footerText\n      headerType\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      chatUserName\n      chatBotId\n      chatUserAccountIdIfExternal\n      chatUserAccountNameIfExternal\n      directChatUserId\n      primaryTeamId\n      linkedEngagementIdIfBroadcast\n      createdAt\n      updatedAt\n    }\n    media {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    referredContact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    chatUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
