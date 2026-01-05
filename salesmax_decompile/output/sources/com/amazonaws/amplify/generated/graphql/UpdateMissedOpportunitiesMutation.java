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
import type.AddedSourceType;
import type.CallConnectStatus;
import type.CallDirection;
import type.ContactAssignmentStatus;
import type.ContactStatus;
import type.CustomType;
import type.Day;
import type.EngagementStatus;
import type.EngagementType;
import type.LeadLifecycleStage;
import type.LeadLifecycleStageSubCategory;
import type.MissedOpportunityType;
import type.ModelMissedOpportunitiesConditionInput;
import type.NoteAdditionMethod;
import type.Seniority;
import type.TaskActivityType;
import type.UpdateMissedOpportunitiesInput;
import type.UserRegistrationStatus;

/* loaded from: classes4.dex */
public final class UpdateMissedOpportunitiesMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateMissedOpportunities($input: UpdateMissedOpportunitiesInput!, $condition: ModelMissedOpportunitiesConditionInput) {\n  updateMissedOpportunities(input: $input, condition: $condition) {\n    __typename\n    accountId\n    ownerId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    contactId\n    messageBody\n    missedOpportunityType\n    callLaterDateTime\n    relatedEngagementId\n    createdAt\n    updatedAt\n    relatedEngagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateMissedOpportunities";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateMissedOpportunities($input: UpdateMissedOpportunitiesInput!, $condition: ModelMissedOpportunitiesConditionInput) {\n  updateMissedOpportunities(input: $input, condition: $condition) {\n    __typename\n    accountId\n    ownerId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    contactId\n    messageBody\n    missedOpportunityType\n    callLaterDateTime\n    relatedEngagementId\n    createdAt\n    updatedAt\n    relatedEngagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelMissedOpportunitiesConditionInput condition;
        private UpdateMissedOpportunitiesInput input;

        public UpdateMissedOpportunitiesMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateMissedOpportunitiesMutation(this.input, this.condition);
        }

        public Builder condition(ModelMissedOpportunitiesConditionInput modelMissedOpportunitiesConditionInput) {
            this.condition = modelMissedOpportunitiesConditionInput;
            return this;
        }

        public Builder input(UpdateMissedOpportunitiesInput updateMissedOpportunitiesInput) {
            this.input = updateMissedOpportunitiesInput;
            return this;
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
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                });
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                List list2 = responseReader.readList(responseFieldArr[7], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.Mapper.2
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
                List list3 = responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<Day>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.Mapper.3
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
                List list4 = responseReader.readList(responseFieldArr[92], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                List list5 = responseReader.readList(responseFieldArr[93], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string45 = responseReader.readString(responseFieldArr[94]);
                String string46 = responseReader.readString(responseFieldArr[95]);
                String string47 = responseReader.readString(responseFieldArr[96]);
                List list6 = responseReader.readList(responseFieldArr[97], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.Mapper.6
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.1
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
                    responseWriter.writeList(responseFieldArr[5], Contact.this.sharedOwners, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Contact.this.primaryTeamId);
                    responseWriter.writeList(responseFieldArr[7], Contact.this.sharedTeams, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.1.2
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
                    responseWriter.writeList(responseFieldArr[34], Contact.this.preferredContactDays, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.1.3
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
                    responseWriter.writeList(responseFieldArr[92], Contact.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[93], Contact.this.productService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[94], Contact.this.bulkUploadReference);
                    responseWriter.writeString(responseFieldArr[95], Contact.this.assignmentMethod);
                    responseWriter.writeString(responseFieldArr[96], Contact.this.whatsappOptInStatus);
                    responseWriter.writeList(responseFieldArr[97], Contact.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Contact.1.6
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateMissedOpportunities", "updateMissedOpportunities", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateMissedOpportunities updateMissedOpportunities;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateMissedOpportunities.Mapper updateMissedOpportunitiesFieldMapper = new UpdateMissedOpportunities.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateMissedOpportunities) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateMissedOpportunities>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateMissedOpportunities read(ResponseReader responseReader2) {
                        return Mapper.this.updateMissedOpportunitiesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateMissedOpportunities updateMissedOpportunities) {
            this.updateMissedOpportunities = updateMissedOpportunities;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateMissedOpportunities updateMissedOpportunities = this.updateMissedOpportunities;
            UpdateMissedOpportunities updateMissedOpportunities2 = ((Data) obj).updateMissedOpportunities;
            return updateMissedOpportunities == null ? updateMissedOpportunities2 == null : updateMissedOpportunities.equals(updateMissedOpportunities2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateMissedOpportunities updateMissedOpportunities = this.updateMissedOpportunities;
                this.$hashCode = (updateMissedOpportunities == null ? 0 : updateMissedOpportunities.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateMissedOpportunities updateMissedOpportunities = Data.this.updateMissedOpportunities;
                    responseWriter.writeObject(responseField, updateMissedOpportunities != null ? updateMissedOpportunities.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateMissedOpportunities=" + this.updateMissedOpportunities + "}";
            }
            return this.$toString;
        }

        public UpdateMissedOpportunities updateMissedOpportunities() {
            return this.updateMissedOpportunities;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Owner.1
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.PrimaryTeam.1
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

    public static class RelatedEngagement {
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

        public static final class Mapper implements ResponseFieldMapper<RelatedEngagement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public RelatedEngagement map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = RelatedEngagement.$responseFields;
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
                return new RelatedEngagement(string, str, str2, engagementTypeValueOf, str3, str4, contactAssignmentStatusValueOf, str5, str6, str7, str8, str9, string4, engagementStatusValueOf, str10, str11, bool, string6, string7, callDirectionValueOf, callConnectStatusValueOf, str12, str13, num, string10, string11, string12, string13, noteAdditionMethodValueOf, string15, string16, bool2, string17, string18, string19 != null ? TaskActivityType.valueOf(string19) : null, responseReader.readString(responseFieldArr[35]), responseReader.readString(responseFieldArr[36]), responseReader.readString(responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readString(responseFieldArr[39]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[40]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[41]), responseReader.readString(responseFieldArr[42]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[43]), responseReader.readString(responseFieldArr[44]), responseReader.readString(responseFieldArr[45]), responseReader.readString(responseFieldArr[46]), responseReader.readString(responseFieldArr[47]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[48]), responseReader.readString(responseFieldArr[49]), responseReader.readString(responseFieldArr[50]), responseReader.readString(responseFieldArr[51]), responseReader.readString(responseFieldArr[52]), responseReader.readString(responseFieldArr[53]), responseReader.readString(responseFieldArr[54]), responseReader.readString(responseFieldArr[55]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[56]), responseReader.readString(responseFieldArr[57]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[58]), responseReader.readString(responseFieldArr[59]), responseReader.readString(responseFieldArr[60]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[61]), responseReader.readString(responseFieldArr[62]), responseReader.readString(responseFieldArr[63]), responseReader.readString(responseFieldArr[64]), responseReader.readString(responseFieldArr[65]), responseReader.readString(responseFieldArr[66]), responseReader.readList(responseFieldArr[67], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.RelatedEngagement.Mapper.1
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

        public RelatedEngagement(String str, String str2, String str3, EngagementType engagementType, String str4, String str5, ContactAssignmentStatus contactAssignmentStatus, String str6, String str7, String str8, String str9, String str10, String str11, EngagementStatus engagementStatus, String str12, String str13, Boolean bool, String str14, String str15, CallDirection callDirection, CallConnectStatus callConnectStatus, String str16, String str17, Integer num, String str18, String str19, String str20, String str21, NoteAdditionMethod noteAdditionMethod, String str22, String str23, Boolean bool2, String str24, String str25, TaskActivityType taskActivityType, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, List<String> list, String str58, String str59, Integer num2, String str60, String str61, String str62, String str63, String str64, String str65, Integer num3, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73) {
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
            if (!(obj instanceof RelatedEngagement)) {
                return false;
            }
            RelatedEngagement relatedEngagement = (RelatedEngagement) obj;
            if (this.__typename.equals(relatedEngagement.__typename) && this.id.equals(relatedEngagement.id) && this.accountId.equals(relatedEngagement.accountId) && this.engagementType.equals(relatedEngagement.engagementType) && ((str = this.contactId) != null ? str.equals(relatedEngagement.contactId) : relatedEngagement.contactId == null) && ((str2 = this.primaryTeamId) != null ? str2.equals(relatedEngagement.primaryTeamId) : relatedEngagement.primaryTeamId == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(relatedEngagement.toBeAssigned) : relatedEngagement.toBeAssigned == null) && ((str3 = this.ownerId) != null ? str3.equals(relatedEngagement.ownerId) : relatedEngagement.ownerId == null) && ((str4 = this.contactPrimaryTeamId) != null ? str4.equals(relatedEngagement.contactPrimaryTeamId) : relatedEngagement.contactPrimaryTeamId == null) && ((str5 = this.contactOwnerId) != null ? str5.equals(relatedEngagement.contactOwnerId) : relatedEngagement.contactOwnerId == null) && ((str6 = this.addedById) != null ? str6.equals(relatedEngagement.addedById) : relatedEngagement.addedById == null) && ((str7 = this.updatedById) != null ? str7.equals(relatedEngagement.updatedById) : relatedEngagement.updatedById == null) && ((str8 = this.callStatus) != null ? str8.equals(relatedEngagement.callStatus) : relatedEngagement.callStatus == null) && this.engagementStatus.equals(relatedEngagement.engagementStatus) && ((str9 = this.parentEngagementId) != null ? str9.equals(relatedEngagement.parentEngagementId) : relatedEngagement.parentEngagementId == null) && ((str10 = this.nextStepTaskId) != null ? str10.equals(relatedEngagement.nextStepTaskId) : relatedEngagement.nextStepTaskId == null) && ((bool = this.syncStatus) != null ? bool.equals(relatedEngagement.syncStatus) : relatedEngagement.syncStatus == null) && ((str11 = this.externalNumber) != null ? str11.equals(relatedEngagement.externalNumber) : relatedEngagement.externalNumber == null) && ((str12 = this.userNumber) != null ? str12.equals(relatedEngagement.userNumber) : relatedEngagement.userNumber == null) && ((callDirection = this.callDirection) != null ? callDirection.equals(relatedEngagement.callDirection) : relatedEngagement.callDirection == null) && ((callConnectStatus = this.callConnectStatus) != null ? callConnectStatus.equals(relatedEngagement.callConnectStatus) : relatedEngagement.callConnectStatus == null) && ((str13 = this.callStartTime) != null ? str13.equals(relatedEngagement.callStartTime) : relatedEngagement.callStartTime == null) && ((str14 = this.callEndTime) != null ? str14.equals(relatedEngagement.callEndTime) : relatedEngagement.callEndTime == null) && ((num = this.durationInMillis) != null ? num.equals(relatedEngagement.durationInMillis) : relatedEngagement.durationInMillis == null) && ((str15 = this.callOutcome) != null ? str15.equals(relatedEngagement.callOutcome) : relatedEngagement.callOutcome == null) && ((str16 = this.callOutcomeNature) != null ? str16.equals(relatedEngagement.callOutcomeNature) : relatedEngagement.callOutcomeNature == null) && ((str17 = this.callRecordingExternalResource) != null ? str17.equals(relatedEngagement.callRecordingExternalResource) : relatedEngagement.callRecordingExternalResource == null) && ((str18 = this.noteHeading) != null ? str18.equals(relatedEngagement.noteHeading) : relatedEngagement.noteHeading == null) && ((noteAdditionMethod = this.noteAdditionMethod) != null ? noteAdditionMethod.equals(relatedEngagement.noteAdditionMethod) : relatedEngagement.noteAdditionMethod == null) && ((str19 = this.voiceNoteUrl) != null ? str19.equals(relatedEngagement.voiceNoteUrl) : relatedEngagement.voiceNoteUrl == null) && ((str20 = this.body) != null ? str20.equals(relatedEngagement.body) : relatedEngagement.body == null) && ((bool2 = this.isManualTask) != null ? bool2.equals(relatedEngagement.isManualTask) : relatedEngagement.isManualTask == null) && ((str21 = this.taskHeading) != null ? str21.equals(relatedEngagement.taskHeading) : relatedEngagement.taskHeading == null) && ((str22 = this.taskType) != null ? str22.equals(relatedEngagement.taskType) : relatedEngagement.taskType == null) && ((taskActivityType = this.taskActivityType) != null ? taskActivityType.equals(relatedEngagement.taskActivityType) : relatedEngagement.taskActivityType == null) && ((str23 = this.taskInputNote) != null ? str23.equals(relatedEngagement.taskInputNote) : relatedEngagement.taskInputNote == null) && ((str24 = this.taskPriority) != null ? str24.equals(relatedEngagement.taskPriority) : relatedEngagement.taskPriority == null) && ((str25 = this.taskCompletionNote) != null ? str25.equals(relatedEngagement.taskCompletionNote) : relatedEngagement.taskCompletionNote == null) && ((str26 = this.taskCompletionTime) != null ? str26.equals(relatedEngagement.taskCompletionTime) : relatedEngagement.taskCompletionTime == null) && ((str27 = this.taskCompletionType) != null ? str27.equals(relatedEngagement.taskCompletionType) : relatedEngagement.taskCompletionType == null) && ((str28 = this.dueDateTime) != null ? str28.equals(relatedEngagement.dueDateTime) : relatedEngagement.dueDateTime == null) && ((str29 = this.nextFollowUpOn) != null ? str29.equals(relatedEngagement.nextFollowUpOn) : relatedEngagement.nextFollowUpOn == null) && ((str30 = this.nextFollowUpSetBy) != null ? str30.equals(relatedEngagement.nextFollowUpSetBy) : relatedEngagement.nextFollowUpSetBy == null) && ((str31 = this.reminderDateTime) != null ? str31.equals(relatedEngagement.reminderDateTime) : relatedEngagement.reminderDateTime == null) && ((str32 = this.callRecordingUrl) != null ? str32.equals(relatedEngagement.callRecordingUrl) : relatedEngagement.callRecordingUrl == null) && ((str33 = this.callTranscriptUrl) != null ? str33.equals(relatedEngagement.callTranscriptUrl) : relatedEngagement.callTranscriptUrl == null) && ((str34 = this.callTranscriptSummary) != null ? str34.equals(relatedEngagement.callTranscriptSummary) : relatedEngagement.callTranscriptSummary == null) && ((str35 = this.uploadedFiledUrl) != null ? str35.equals(relatedEngagement.uploadedFiledUrl) : relatedEngagement.uploadedFiledUrl == null) && ((str36 = this.visitTime) != null ? str36.equals(relatedEngagement.visitTime) : relatedEngagement.visitTime == null) && ((str37 = this.visitNote) != null ? str37.equals(relatedEngagement.visitNote) : relatedEngagement.visitNote == null) && ((str38 = this.visitOutcome) != null ? str38.equals(relatedEngagement.visitOutcome) : relatedEngagement.visitOutcome == null) && ((str39 = this.visitOutcomeNature) != null ? str39.equals(relatedEngagement.visitOutcomeNature) : relatedEngagement.visitOutcomeNature == null) && ((str40 = this.videoCallPlatform) != null ? str40.equals(relatedEngagement.videoCallPlatform) : relatedEngagement.videoCallPlatform == null) && ((str41 = this.videoCallLink) != null ? str41.equals(relatedEngagement.videoCallLink) : relatedEngagement.videoCallLink == null) && ((str42 = this.meetingName) != null ? str42.equals(relatedEngagement.meetingName) : relatedEngagement.meetingName == null) && ((str43 = this.meetingCode) != null ? str43.equals(relatedEngagement.meetingCode) : relatedEngagement.meetingCode == null) && ((str44 = this.videoCallMetadata) != null ? str44.equals(relatedEngagement.videoCallMetadata) : relatedEngagement.videoCallMetadata == null) && ((str45 = this.videoCallOutcome) != null ? str45.equals(relatedEngagement.videoCallOutcome) : relatedEngagement.videoCallOutcome == null) && ((str46 = this.paymentDataId) != null ? str46.equals(relatedEngagement.paymentDataId) : relatedEngagement.paymentDataId == null) && ((str47 = this.calendarEventId) != null ? str47.equals(relatedEngagement.calendarEventId) : relatedEngagement.calendarEventId == null) && ((str48 = this.calendarName) != null ? str48.equals(relatedEngagement.calendarName) : relatedEngagement.calendarName == null) && ((str49 = this.campaignId) != null ? str49.equals(relatedEngagement.campaignId) : relatedEngagement.campaignId == null) && ((str50 = this.campaignRun) != null ? str50.equals(relatedEngagement.campaignRun) : relatedEngagement.campaignRun == null) && ((str51 = this.engagementSourceType) != null ? str51.equals(relatedEngagement.engagementSourceType) : relatedEngagement.engagementSourceType == null) && ((str52 = this.engagementSource) != null ? str52.equals(relatedEngagement.engagementSource) : relatedEngagement.engagementSource == null) && ((str53 = this.engagementSourceLevelTwo) != null ? str53.equals(relatedEngagement.engagementSourceLevelTwo) : relatedEngagement.engagementSourceLevelTwo == null) && ((str54 = this.systemAction) != null ? str54.equals(relatedEngagement.systemAction) : relatedEngagement.systemAction == null) && ((list = this.taskEngagementActions) != null ? list.equals(relatedEngagement.taskEngagementActions) : relatedEngagement.taskEngagementActions == null) && ((str55 = this.taskEngagementActionsUpdatedAt) != null ? str55.equals(relatedEngagement.taskEngagementActionsUpdatedAt) : relatedEngagement.taskEngagementActionsUpdatedAt == null) && ((str56 = this.firstTaskEngagementActionOn) != null ? str56.equals(relatedEngagement.firstTaskEngagementActionOn) : relatedEngagement.firstTaskEngagementActionOn == null) && ((num2 = this.taskEngagementActionCount) != null ? num2.equals(relatedEngagement.taskEngagementActionCount) : relatedEngagement.taskEngagementActionCount == null) && ((str57 = this.customCallOutcomeData) != null ? str57.equals(relatedEngagement.customCallOutcomeData) : relatedEngagement.customCallOutcomeData == null) && ((str58 = this.customVisitOutcomeData) != null ? str58.equals(relatedEngagement.customVisitOutcomeData) : relatedEngagement.customVisitOutcomeData == null) && ((str59 = this.customTaskCompletionData) != null ? str59.equals(relatedEngagement.customTaskCompletionData) : relatedEngagement.customTaskCompletionData == null) && ((str60 = this.customTaskInputData) != null ? str60.equals(relatedEngagement.customTaskInputData) : relatedEngagement.customTaskInputData == null) && ((str61 = this.customVideoCallInputData) != null ? str61.equals(relatedEngagement.customVideoCallInputData) : relatedEngagement.customVideoCallInputData == null) && ((str62 = this.deviceId) != null ? str62.equals(relatedEngagement.deviceId) : relatedEngagement.deviceId == null) && ((num3 = this.totalCallDuration) != null ? num3.equals(relatedEngagement.totalCallDuration) : relatedEngagement.totalCallDuration == null) && ((str63 = this.cloudProviderNumber) != null ? str63.equals(relatedEngagement.cloudProviderNumber) : relatedEngagement.cloudProviderNumber == null) && ((str64 = this.hangupReason) != null ? str64.equals(relatedEngagement.hangupReason) : relatedEngagement.hangupReason == null) && ((str65 = this.cloudProvider) != null ? str65.equals(relatedEngagement.cloudProvider) : relatedEngagement.cloudProvider == null) && ((str66 = this.callType) != null ? str66.equals(relatedEngagement.callType) : relatedEngagement.callType == null) && ((str67 = this.phoneCallLogId) != null ? str67.equals(relatedEngagement.phoneCallLogId) : relatedEngagement.phoneCallLogId == null) && ((str68 = this.externalEventRecordId) != null ? str68.equals(relatedEngagement.externalEventRecordId) : relatedEngagement.externalEventRecordId == null) && ((str69 = this.createdAt) != null ? str69.equals(relatedEngagement.createdAt) : relatedEngagement.createdAt == null)) {
                String str70 = this.updatedAt;
                String str71 = relatedEngagement.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.RelatedEngagement.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = RelatedEngagement.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], RelatedEngagement.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], RelatedEngagement.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], RelatedEngagement.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], RelatedEngagement.this.engagementType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], RelatedEngagement.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], RelatedEngagement.this.primaryTeamId);
                    ResponseField responseField = responseFieldArr[6];
                    ContactAssignmentStatus contactAssignmentStatus = RelatedEngagement.this.toBeAssigned;
                    responseWriter.writeString(responseField, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], RelatedEngagement.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], RelatedEngagement.this.contactPrimaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], RelatedEngagement.this.contactOwnerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], RelatedEngagement.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], RelatedEngagement.this.updatedById);
                    responseWriter.writeString(responseFieldArr[12], RelatedEngagement.this.callStatus);
                    responseWriter.writeString(responseFieldArr[13], RelatedEngagement.this.engagementStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], RelatedEngagement.this.parentEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], RelatedEngagement.this.nextStepTaskId);
                    responseWriter.writeBoolean(responseFieldArr[16], RelatedEngagement.this.syncStatus);
                    responseWriter.writeString(responseFieldArr[17], RelatedEngagement.this.externalNumber);
                    responseWriter.writeString(responseFieldArr[18], RelatedEngagement.this.userNumber);
                    ResponseField responseField2 = responseFieldArr[19];
                    CallDirection callDirection = RelatedEngagement.this.callDirection;
                    responseWriter.writeString(responseField2, callDirection != null ? callDirection.name() : null);
                    ResponseField responseField3 = responseFieldArr[20];
                    CallConnectStatus callConnectStatus = RelatedEngagement.this.callConnectStatus;
                    responseWriter.writeString(responseField3, callConnectStatus != null ? callConnectStatus.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], RelatedEngagement.this.callStartTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], RelatedEngagement.this.callEndTime);
                    responseWriter.writeInt(responseFieldArr[23], RelatedEngagement.this.durationInMillis);
                    responseWriter.writeString(responseFieldArr[24], RelatedEngagement.this.callOutcome);
                    responseWriter.writeString(responseFieldArr[25], RelatedEngagement.this.callOutcomeNature);
                    responseWriter.writeString(responseFieldArr[26], RelatedEngagement.this.callRecordingExternalResource);
                    responseWriter.writeString(responseFieldArr[27], RelatedEngagement.this.noteHeading);
                    ResponseField responseField4 = responseFieldArr[28];
                    NoteAdditionMethod noteAdditionMethod = RelatedEngagement.this.noteAdditionMethod;
                    responseWriter.writeString(responseField4, noteAdditionMethod != null ? noteAdditionMethod.name() : null);
                    responseWriter.writeString(responseFieldArr[29], RelatedEngagement.this.voiceNoteUrl);
                    responseWriter.writeString(responseFieldArr[30], RelatedEngagement.this.body);
                    responseWriter.writeBoolean(responseFieldArr[31], RelatedEngagement.this.isManualTask);
                    responseWriter.writeString(responseFieldArr[32], RelatedEngagement.this.taskHeading);
                    responseWriter.writeString(responseFieldArr[33], RelatedEngagement.this.taskType);
                    ResponseField responseField5 = responseFieldArr[34];
                    TaskActivityType taskActivityType = RelatedEngagement.this.taskActivityType;
                    responseWriter.writeString(responseField5, taskActivityType != null ? taskActivityType.name() : null);
                    responseWriter.writeString(responseFieldArr[35], RelatedEngagement.this.taskInputNote);
                    responseWriter.writeString(responseFieldArr[36], RelatedEngagement.this.taskPriority);
                    responseWriter.writeString(responseFieldArr[37], RelatedEngagement.this.taskCompletionNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], RelatedEngagement.this.taskCompletionTime);
                    responseWriter.writeString(responseFieldArr[39], RelatedEngagement.this.taskCompletionType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[40], RelatedEngagement.this.dueDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[41], RelatedEngagement.this.nextFollowUpOn);
                    responseWriter.writeString(responseFieldArr[42], RelatedEngagement.this.nextFollowUpSetBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[43], RelatedEngagement.this.reminderDateTime);
                    responseWriter.writeString(responseFieldArr[44], RelatedEngagement.this.callRecordingUrl);
                    responseWriter.writeString(responseFieldArr[45], RelatedEngagement.this.callTranscriptUrl);
                    responseWriter.writeString(responseFieldArr[46], RelatedEngagement.this.callTranscriptSummary);
                    responseWriter.writeString(responseFieldArr[47], RelatedEngagement.this.uploadedFiledUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[48], RelatedEngagement.this.visitTime);
                    responseWriter.writeString(responseFieldArr[49], RelatedEngagement.this.visitNote);
                    responseWriter.writeString(responseFieldArr[50], RelatedEngagement.this.visitOutcome);
                    responseWriter.writeString(responseFieldArr[51], RelatedEngagement.this.visitOutcomeNature);
                    responseWriter.writeString(responseFieldArr[52], RelatedEngagement.this.videoCallPlatform);
                    responseWriter.writeString(responseFieldArr[53], RelatedEngagement.this.videoCallLink);
                    responseWriter.writeString(responseFieldArr[54], RelatedEngagement.this.meetingName);
                    responseWriter.writeString(responseFieldArr[55], RelatedEngagement.this.meetingCode);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[56], RelatedEngagement.this.videoCallMetadata);
                    responseWriter.writeString(responseFieldArr[57], RelatedEngagement.this.videoCallOutcome);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[58], RelatedEngagement.this.paymentDataId);
                    responseWriter.writeString(responseFieldArr[59], RelatedEngagement.this.calendarEventId);
                    responseWriter.writeString(responseFieldArr[60], RelatedEngagement.this.calendarName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[61], RelatedEngagement.this.campaignId);
                    responseWriter.writeString(responseFieldArr[62], RelatedEngagement.this.campaignRun);
                    responseWriter.writeString(responseFieldArr[63], RelatedEngagement.this.engagementSourceType);
                    responseWriter.writeString(responseFieldArr[64], RelatedEngagement.this.engagementSource);
                    responseWriter.writeString(responseFieldArr[65], RelatedEngagement.this.engagementSourceLevelTwo);
                    responseWriter.writeString(responseFieldArr[66], RelatedEngagement.this.systemAction);
                    responseWriter.writeList(responseFieldArr[67], RelatedEngagement.this.taskEngagementActions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.RelatedEngagement.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[68], RelatedEngagement.this.taskEngagementActionsUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[69], RelatedEngagement.this.firstTaskEngagementActionOn);
                    responseWriter.writeInt(responseFieldArr[70], RelatedEngagement.this.taskEngagementActionCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[71], RelatedEngagement.this.customCallOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[72], RelatedEngagement.this.customVisitOutcomeData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[73], RelatedEngagement.this.customTaskCompletionData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[74], RelatedEngagement.this.customTaskInputData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[75], RelatedEngagement.this.customVideoCallInputData);
                    responseWriter.writeString(responseFieldArr[76], RelatedEngagement.this.deviceId);
                    responseWriter.writeInt(responseFieldArr[77], RelatedEngagement.this.totalCallDuration);
                    responseWriter.writeString(responseFieldArr[78], RelatedEngagement.this.cloudProviderNumber);
                    responseWriter.writeString(responseFieldArr[79], RelatedEngagement.this.hangupReason);
                    responseWriter.writeString(responseFieldArr[80], RelatedEngagement.this.cloudProvider);
                    responseWriter.writeString(responseFieldArr[81], RelatedEngagement.this.callType);
                    responseWriter.writeString(responseFieldArr[82], RelatedEngagement.this.phoneCallLogId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[83], RelatedEngagement.this.externalEventRecordId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[84], RelatedEngagement.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[85], RelatedEngagement.this.updatedAt);
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
                this.$toString = "RelatedEngagement{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", engagementType=" + this.engagementType + ", contactId=" + this.contactId + ", primaryTeamId=" + this.primaryTeamId + ", toBeAssigned=" + this.toBeAssigned + ", ownerId=" + this.ownerId + ", contactPrimaryTeamId=" + this.contactPrimaryTeamId + ", contactOwnerId=" + this.contactOwnerId + ", addedById=" + this.addedById + ", updatedById=" + this.updatedById + ", callStatus=" + this.callStatus + ", engagementStatus=" + this.engagementStatus + ", parentEngagementId=" + this.parentEngagementId + ", nextStepTaskId=" + this.nextStepTaskId + ", syncStatus=" + this.syncStatus + ", externalNumber=" + this.externalNumber + ", userNumber=" + this.userNumber + ", callDirection=" + this.callDirection + ", callConnectStatus=" + this.callConnectStatus + ", callStartTime=" + this.callStartTime + ", callEndTime=" + this.callEndTime + ", durationInMillis=" + this.durationInMillis + ", callOutcome=" + this.callOutcome + ", callOutcomeNature=" + this.callOutcomeNature + ", callRecordingExternalResource=" + this.callRecordingExternalResource + ", noteHeading=" + this.noteHeading + ", noteAdditionMethod=" + this.noteAdditionMethod + ", voiceNoteUrl=" + this.voiceNoteUrl + ", body=" + this.body + ", isManualTask=" + this.isManualTask + ", taskHeading=" + this.taskHeading + ", taskType=" + this.taskType + ", taskActivityType=" + this.taskActivityType + ", taskInputNote=" + this.taskInputNote + ", taskPriority=" + this.taskPriority + ", taskCompletionNote=" + this.taskCompletionNote + ", taskCompletionTime=" + this.taskCompletionTime + ", taskCompletionType=" + this.taskCompletionType + ", dueDateTime=" + this.dueDateTime + ", nextFollowUpOn=" + this.nextFollowUpOn + ", nextFollowUpSetBy=" + this.nextFollowUpSetBy + ", reminderDateTime=" + this.reminderDateTime + ", callRecordingUrl=" + this.callRecordingUrl + ", callTranscriptUrl=" + this.callTranscriptUrl + ", callTranscriptSummary=" + this.callTranscriptSummary + ", uploadedFiledUrl=" + this.uploadedFiledUrl + ", visitTime=" + this.visitTime + ", visitNote=" + this.visitNote + ", visitOutcome=" + this.visitOutcome + ", visitOutcomeNature=" + this.visitOutcomeNature + ", videoCallPlatform=" + this.videoCallPlatform + ", videoCallLink=" + this.videoCallLink + ", meetingName=" + this.meetingName + ", meetingCode=" + this.meetingCode + ", videoCallMetadata=" + this.videoCallMetadata + ", videoCallOutcome=" + this.videoCallOutcome + ", paymentDataId=" + this.paymentDataId + ", calendarEventId=" + this.calendarEventId + ", calendarName=" + this.calendarName + ", campaignId=" + this.campaignId + ", campaignRun=" + this.campaignRun + ", engagementSourceType=" + this.engagementSourceType + ", engagementSource=" + this.engagementSource + ", engagementSourceLevelTwo=" + this.engagementSourceLevelTwo + ", systemAction=" + this.systemAction + ", taskEngagementActions=" + this.taskEngagementActions + ", taskEngagementActionsUpdatedAt=" + this.taskEngagementActionsUpdatedAt + ", firstTaskEngagementActionOn=" + this.firstTaskEngagementActionOn + ", taskEngagementActionCount=" + this.taskEngagementActionCount + ", customCallOutcomeData=" + this.customCallOutcomeData + ", customVisitOutcomeData=" + this.customVisitOutcomeData + ", customTaskCompletionData=" + this.customTaskCompletionData + ", customTaskInputData=" + this.customTaskInputData + ", customVideoCallInputData=" + this.customVideoCallInputData + ", deviceId=" + this.deviceId + ", totalCallDuration=" + this.totalCallDuration + ", cloudProviderNumber=" + this.cloudProviderNumber + ", hangupReason=" + this.hangupReason + ", cloudProvider=" + this.cloudProvider + ", callType=" + this.callType + ", phoneCallLogId=" + this.phoneCallLogId + ", externalEventRecordId=" + this.externalEventRecordId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class UpdateMissedOpportunities {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String callLaterDateTime;
        final Contact contact;
        final String contactId;
        final String createdAt;
        final String messageBody;
        final MissedOpportunityType missedOpportunityType;
        final Owner owner;
        final String ownerId;
        final PrimaryTeam primaryTeam;
        final String primaryTeamId;
        final RelatedEngagement relatedEngagement;
        final String relatedEngagementId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateMissedOpportunities> {
            final PrimaryTeam.Mapper primaryTeamFieldMapper = new PrimaryTeam.Mapper();
            final RelatedEngagement.Mapper relatedEngagementFieldMapper = new RelatedEngagement.Mapper();
            final Contact.Mapper contactFieldMapper = new Contact.Mapper();
            final Owner.Mapper ownerFieldMapper = new Owner.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateMissedOpportunities map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateMissedOpportunities.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                PrimaryTeam primaryTeam = (PrimaryTeam) responseReader.readObject(responseFieldArr[4], new ResponseReader.ObjectReader<PrimaryTeam>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.UpdateMissedOpportunities.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public PrimaryTeam read(ResponseReader responseReader2) {
                        return Mapper.this.primaryTeamFieldMapper.map(responseReader2);
                    }
                });
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string2 = responseReader.readString(responseFieldArr[6]);
                String string3 = responseReader.readString(responseFieldArr[7]);
                return new UpdateMissedOpportunities(string, str, str2, str3, primaryTeam, str4, string2, string3 != null ? MissedOpportunityType.valueOf(string3) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (RelatedEngagement) responseReader.readObject(responseFieldArr[12], new ResponseReader.ObjectReader<RelatedEngagement>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.UpdateMissedOpportunities.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public RelatedEngagement read(ResponseReader responseReader2) {
                        return Mapper.this.relatedEngagementFieldMapper.map(responseReader2);
                    }
                }), (Contact) responseReader.readObject(responseFieldArr[13], new ResponseReader.ObjectReader<Contact>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.UpdateMissedOpportunities.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Contact read(ResponseReader responseReader2) {
                        return Mapper.this.contactFieldMapper.map(responseReader2);
                    }
                }), (Owner) responseReader.readObject(responseFieldArr[14], new ResponseReader.ObjectReader<Owner>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.UpdateMissedOpportunities.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Owner read(ResponseReader responseReader2) {
                        return Mapper.this.ownerFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forObject("primaryTeam", "primaryTeam", null, true, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, false, customType, Collections.emptyList()), ResponseField.forString("messageBody", "messageBody", null, true, Collections.emptyList()), ResponseField.forString("missedOpportunityType", "missedOpportunityType", null, false, Collections.emptyList()), ResponseField.forCustomType("callLaterDateTime", "callLaterDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("relatedEngagementId", "relatedEngagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("relatedEngagement", "relatedEngagement", null, true, Collections.emptyList()), ResponseField.forObject("contact", "contact", null, true, Collections.emptyList()), ResponseField.forObject("owner", "owner", null, true, Collections.emptyList())};
        }

        public UpdateMissedOpportunities(String str, String str2, String str3, String str4, PrimaryTeam primaryTeam, String str5, String str6, MissedOpportunityType missedOpportunityType, String str7, String str8, String str9, String str10, RelatedEngagement relatedEngagement, Contact contact, Owner owner) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.ownerId = (String) Utils.checkNotNull(str3, "ownerId == null");
            this.primaryTeamId = str4;
            this.primaryTeam = primaryTeam;
            this.contactId = (String) Utils.checkNotNull(str5, "contactId == null");
            this.messageBody = str6;
            this.missedOpportunityType = (MissedOpportunityType) Utils.checkNotNull(missedOpportunityType, "missedOpportunityType == null");
            this.callLaterDateTime = str7;
            this.relatedEngagementId = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
            this.relatedEngagement = relatedEngagement;
            this.contact = contact;
            this.owner = owner;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String callLaterDateTime() {
            return this.callLaterDateTime;
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

        public boolean equals(Object obj) {
            String str;
            PrimaryTeam primaryTeam;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            RelatedEngagement relatedEngagement;
            Contact contact;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateMissedOpportunities)) {
                return false;
            }
            UpdateMissedOpportunities updateMissedOpportunities = (UpdateMissedOpportunities) obj;
            if (this.__typename.equals(updateMissedOpportunities.__typename) && this.accountId.equals(updateMissedOpportunities.accountId) && this.ownerId.equals(updateMissedOpportunities.ownerId) && ((str = this.primaryTeamId) != null ? str.equals(updateMissedOpportunities.primaryTeamId) : updateMissedOpportunities.primaryTeamId == null) && ((primaryTeam = this.primaryTeam) != null ? primaryTeam.equals(updateMissedOpportunities.primaryTeam) : updateMissedOpportunities.primaryTeam == null) && this.contactId.equals(updateMissedOpportunities.contactId) && ((str2 = this.messageBody) != null ? str2.equals(updateMissedOpportunities.messageBody) : updateMissedOpportunities.messageBody == null) && this.missedOpportunityType.equals(updateMissedOpportunities.missedOpportunityType) && ((str3 = this.callLaterDateTime) != null ? str3.equals(updateMissedOpportunities.callLaterDateTime) : updateMissedOpportunities.callLaterDateTime == null) && ((str4 = this.relatedEngagementId) != null ? str4.equals(updateMissedOpportunities.relatedEngagementId) : updateMissedOpportunities.relatedEngagementId == null) && ((str5 = this.createdAt) != null ? str5.equals(updateMissedOpportunities.createdAt) : updateMissedOpportunities.createdAt == null) && ((str6 = this.updatedAt) != null ? str6.equals(updateMissedOpportunities.updatedAt) : updateMissedOpportunities.updatedAt == null) && ((relatedEngagement = this.relatedEngagement) != null ? relatedEngagement.equals(updateMissedOpportunities.relatedEngagement) : updateMissedOpportunities.relatedEngagement == null) && ((contact = this.contact) != null ? contact.equals(updateMissedOpportunities.contact) : updateMissedOpportunities.contact == null)) {
                Owner owner = this.owner;
                Owner owner2 = updateMissedOpportunities.owner;
                if (owner == null) {
                    if (owner2 == null) {
                        return true;
                    }
                } else if (owner.equals(owner2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str = this.primaryTeamId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                PrimaryTeam primaryTeam = this.primaryTeam;
                int iHashCode3 = (((iHashCode2 ^ (primaryTeam == null ? 0 : primaryTeam.hashCode())) * 1000003) ^ this.contactId.hashCode()) * 1000003;
                String str2 = this.messageBody;
                int iHashCode4 = (((iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.missedOpportunityType.hashCode()) * 1000003;
                String str3 = this.callLaterDateTime;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.relatedEngagementId;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.createdAt;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.updatedAt;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                RelatedEngagement relatedEngagement = this.relatedEngagement;
                int iHashCode9 = (iHashCode8 ^ (relatedEngagement == null ? 0 : relatedEngagement.hashCode())) * 1000003;
                Contact contact = this.contact;
                int iHashCode10 = (iHashCode9 ^ (contact == null ? 0 : contact.hashCode())) * 1000003;
                Owner owner = this.owner;
                this.$hashCode = iHashCode10 ^ (owner != null ? owner.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.UpdateMissedOpportunities.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateMissedOpportunities.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateMissedOpportunities.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateMissedOpportunities.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateMissedOpportunities.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateMissedOpportunities.this.primaryTeamId);
                    ResponseField responseField = responseFieldArr[4];
                    PrimaryTeam primaryTeam = UpdateMissedOpportunities.this.primaryTeam;
                    responseWriter.writeObject(responseField, primaryTeam != null ? primaryTeam.marshaller() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateMissedOpportunities.this.contactId);
                    responseWriter.writeString(responseFieldArr[6], UpdateMissedOpportunities.this.messageBody);
                    responseWriter.writeString(responseFieldArr[7], UpdateMissedOpportunities.this.missedOpportunityType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateMissedOpportunities.this.callLaterDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateMissedOpportunities.this.relatedEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateMissedOpportunities.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], UpdateMissedOpportunities.this.updatedAt);
                    ResponseField responseField2 = responseFieldArr[12];
                    RelatedEngagement relatedEngagement = UpdateMissedOpportunities.this.relatedEngagement;
                    responseWriter.writeObject(responseField2, relatedEngagement != null ? relatedEngagement.marshaller() : null);
                    ResponseField responseField3 = responseFieldArr[13];
                    Contact contact = UpdateMissedOpportunities.this.contact;
                    responseWriter.writeObject(responseField3, contact != null ? contact.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[14];
                    Owner owner = UpdateMissedOpportunities.this.owner;
                    responseWriter.writeObject(responseField4, owner != null ? owner.marshaller() : null);
                }
            };
        }

        public String messageBody() {
            return this.messageBody;
        }

        public MissedOpportunityType missedOpportunityType() {
            return this.missedOpportunityType;
        }

        public Owner owner() {
            return this.owner;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public PrimaryTeam primaryTeam() {
            return this.primaryTeam;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public RelatedEngagement relatedEngagement() {
            return this.relatedEngagement;
        }

        public String relatedEngagementId() {
            return this.relatedEngagementId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateMissedOpportunities{__typename=" + this.__typename + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", primaryTeam=" + this.primaryTeam + ", contactId=" + this.contactId + ", messageBody=" + this.messageBody + ", missedOpportunityType=" + this.missedOpportunityType + ", callLaterDateTime=" + this.callLaterDateTime + ", relatedEngagementId=" + this.relatedEngagementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", relatedEngagement=" + this.relatedEngagement + ", contact=" + this.contact + ", owner=" + this.owner + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelMissedOpportunitiesConditionInput condition;
        private final UpdateMissedOpportunitiesInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateMissedOpportunitiesInput updateMissedOpportunitiesInput, ModelMissedOpportunitiesConditionInput modelMissedOpportunitiesConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateMissedOpportunitiesInput;
            this.condition = modelMissedOpportunitiesConditionInput;
            linkedHashMap.put("input", updateMissedOpportunitiesInput);
            linkedHashMap.put("condition", modelMissedOpportunitiesConditionInput);
        }

        public ModelMissedOpportunitiesConditionInput condition() {
            return this.condition;
        }

        public UpdateMissedOpportunitiesInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMissedOpportunitiesMutation.Variables.1
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

    public UpdateMissedOpportunitiesMutation(UpdateMissedOpportunitiesInput updateMissedOpportunitiesInput, ModelMissedOpportunitiesConditionInput modelMissedOpportunitiesConditionInput) {
        Utils.checkNotNull(updateMissedOpportunitiesInput, "input == null");
        this.variables = new Variables(updateMissedOpportunitiesInput, modelMissedOpportunitiesConditionInput);
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
        return "b5eb7dd82e493d45381b541a430d85548afdc9383765a0077a64f2427d79f35f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateMissedOpportunities($input: UpdateMissedOpportunitiesInput!, $condition: ModelMissedOpportunitiesConditionInput) {\n  updateMissedOpportunities(input: $input, condition: $condition) {\n    __typename\n    accountId\n    ownerId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    contactId\n    messageBody\n    missedOpportunityType\n    callLaterDateTime\n    relatedEngagementId\n    createdAt\n    updatedAt\n    relatedEngagement {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      waChatChannelId\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      contactSourceDrillDownThree\n      contactSourceDrillDownOneId\n      contactSourceDrillDownTwoId\n      contactSourceDrillDownThreeId\n      contactStatus\n      contactType\n      department\n      designation\n      lastRepeatEnquiryDate\n      lastRepeatEnquirySource\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastWabaBroadcastTime\n      lastWabaBroadcastStatus\n      lastWabaBroadcastTemplate\n      lastWabaBroadcastReplyBody\n      lastWabaBroadcastReplyTime\n      lastWabaBroadcastReplyType\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      noWorkAfterAssignment\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      leadCallsNotAnswered\n      userDefinedTags\n      productService\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      recentEngagementsUpdatedAt\n      openTaskDetail\n      openVideoCallDetail\n      lastClosedTaskDetail\n      lastClosedTaskDetailUpdatedAt\n      latestRemark\n      customAttributes\n      paymentRequestDetail\n      lastPaymentStatus\n      customDataAddedFromAddContactForm\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      totalProspectingAttemptsAcrossRechurn\n      numberOfTimesRechurned\n      lastProspectingDoneOn\n      firstProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingSetBy\n      nextProspectingNote\n      movedToOpportunityOn\n      movedToClosedOn\n      createdAt\n      updatedAt\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
